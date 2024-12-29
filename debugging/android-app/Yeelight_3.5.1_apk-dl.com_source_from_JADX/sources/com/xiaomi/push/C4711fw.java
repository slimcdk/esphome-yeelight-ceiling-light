package com.xiaomi.push;

import android.os.SystemClock;
import android.util.Pair;
import androidx.core.p007os.EnvironmentCompat;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.service.C4906bg;
import com.xiaomi.push.service.C4916bk;
import com.xiaomi.push.service.XMPushService;
import java.io.Reader;
import java.io.Writer;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.xiaomi.push.fw */
public abstract class C4711fw {

    /* renamed from: a */
    private static final AtomicInteger f8216a = new AtomicInteger(0);

    /* renamed from: a */
    public static boolean f8217a;

    /* renamed from: a */
    protected int f8218a = 0;

    /* renamed from: a */
    protected long f8219a = -1;

    /* renamed from: a */
    protected C4713fx f8220a;

    /* renamed from: a */
    protected C4725gi f8221a = null;

    /* renamed from: a */
    protected XMPushService f8222a;

    /* renamed from: a */
    protected String f8223a = "";

    /* renamed from: a */
    private final Collection<C4715fz> f8224a = new CopyOnWriteArrayList();

    /* renamed from: a */
    private LinkedList<Pair<Integer, Long>> f8225a = new LinkedList<>();

    /* renamed from: a */
    protected final Map<C4718gb, C4712a> f8226a = new ConcurrentHashMap();

    /* renamed from: b */
    protected final int f8227b = f8216a.getAndIncrement();

    /* renamed from: b */
    protected volatile long f8228b = 0;

    /* renamed from: b */
    protected String f8229b = "";

    /* renamed from: b */
    protected final Map<C4718gb, C4712a> f8230b = new ConcurrentHashMap();

    /* renamed from: c */
    private int f8231c = 2;

    /* renamed from: c */
    protected volatile long f8232c = 0;

    /* renamed from: d */
    protected long f8233d = 0;

    /* renamed from: e */
    private long f8234e = 0;

    /* renamed from: com.xiaomi.push.fw$a */
    public static class C4712a {

        /* renamed from: a */
        private C4718gb f8235a;

        /* renamed from: a */
        private C4726gj f8236a;

        public C4712a(C4718gb gbVar, C4726gj gjVar) {
            this.f8235a = gbVar;
            this.f8236a = gjVar;
        }

        /* renamed from: a */
        public void mo29195a(C4695fl flVar) {
            this.f8235a.mo29181a(flVar);
        }

        /* renamed from: a */
        public void mo29196a(C4731gn gnVar) {
            C4726gj gjVar = this.f8236a;
            if (gjVar == null || gjVar.mo29182a(gnVar)) {
                this.f8235a.mo29182a(gnVar);
            }
        }
    }

    static {
        f8217a = false;
        try {
            f8217a = Boolean.getBoolean("smack.debugEnabled");
        } catch (Exception unused) {
        }
        C4719gc.m13990a();
    }

    protected C4711fw(XMPushService xMPushService, C4713fx fxVar) {
        this.f8220a = fxVar;
        this.f8222a = xMPushService;
        mo29188b();
    }

    /* renamed from: a */
    private String m13940a(int i) {
        return i == 1 ? "connected" : i == 0 ? "connecting" : i == 2 ? "disconnected" : EnvironmentCompat.MEDIA_UNKNOWN;
    }

    /* renamed from: a */
    private void m13941a(int i) {
        synchronized (this.f8225a) {
            if (i == 1) {
                this.f8225a.clear();
            } else {
                this.f8225a.add(new Pair(Integer.valueOf(i), Long.valueOf(System.currentTimeMillis())));
                if (this.f8225a.size() > 6) {
                    this.f8225a.remove(0);
                }
            }
        }
    }

    /* renamed from: a */
    public int mo29170a() {
        return this.f8218a;
    }

    /* renamed from: a */
    public long m13943a() {
        return this.f8232c;
    }

    /* renamed from: a */
    public C4713fx m13944a() {
        return this.f8220a;
    }

    /* renamed from: a */
    public String m13945a() {
        return this.f8220a.mo29201c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<C4718gb, C4712a> m13946a() {
        return this.f8226a;
    }

    /* renamed from: a */
    public void mo29183a(int i, int i2, Exception exc) {
        int i3 = this.f8231c;
        if (i != i3) {
            C4408b.m12464a(String.format("update the connection status. %1$s -> %2$s : %3$s ", new Object[]{m13940a(i3), m13940a(i), C4916bk.m15431a(i2)}));
        }
        if (C4551bj.m13000b(this.f8222a)) {
            m13940a(i);
        }
        if (i == 1) {
            this.f8222a.mo29928a(10);
            if (this.f8231c != 0) {
                C4408b.m12464a("try set connected while not connecting.");
            }
            this.f8231c = i;
            for (C4715fz b : this.f8224a) {
                b.mo29138b(this);
            }
        } else if (i == 0) {
            if (this.f8231c != 2) {
                C4408b.m12464a("try set connecting while not disconnected.");
            }
            this.f8231c = i;
            for (C4715fz a : this.f8224a) {
                a.mo29135a(this);
            }
        } else if (i == 2) {
            this.f8222a.mo29928a(10);
            int i4 = this.f8231c;
            if (i4 == 0) {
                for (C4715fz a2 : this.f8224a) {
                    a2.mo29137a(this, exc == null ? new CancellationException("disconnect while connecting") : exc);
                }
            } else if (i4 == 1) {
                for (C4715fz a3 : this.f8224a) {
                    a3.mo29136a(this, i2, exc);
                }
            }
            this.f8231c = i;
        }
    }

    /* renamed from: a */
    public void mo29184a(C4715fz fzVar) {
        if (fzVar != null && !this.f8224a.contains(fzVar)) {
            this.f8224a.add(fzVar);
        }
    }

    /* renamed from: a */
    public void mo29185a(C4718gb gbVar, C4726gj gjVar) {
        Objects.requireNonNull(gbVar, "Packet listener is null.");
        this.f8226a.put(gbVar, new C4712a(gbVar, gjVar));
    }

    /* renamed from: a */
    public abstract void mo29173a(C4731gn gnVar);

    /* renamed from: a */
    public abstract void mo29174a(C4906bg.C4908b bVar);

    /* renamed from: a */
    public synchronized void mo29186a(String str) {
        if (this.f8231c == 0) {
            C4408b.m12464a("setChallenge hash = " + C4560bo.m13038a(str).substring(0, 8));
            this.f8223a = str;
            mo29183a(1, 0, (Exception) null);
        } else {
            C4408b.m12464a("ignore setChallenge because connection was disconnected");
        }
    }

    /* renamed from: a */
    public abstract void mo29175a(String str, String str2);

    /* renamed from: a */
    public abstract void mo29177a(C4695fl[] flVarArr);

    /* renamed from: a */
    public boolean m13955a() {
        return false;
    }

    /* renamed from: a */
    public synchronized boolean mo29187a(long j) {
        return this.f8234e >= j;
    }

    /* renamed from: b */
    public int mo29188b() {
        return this.f8231c;
    }

    /* renamed from: b */
    public String m13958b() {
        return this.f8220a.mo29199b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void m13959b() {
        String str;
        if (this.f8220a.mo29197a() && this.f8221a == null) {
            Class<?> cls = null;
            try {
                str = System.getProperty("smack.debuggerClass");
            } catch (Throwable unused) {
                str = null;
            }
            if (str != null) {
                try {
                    cls = Class.forName(str);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (cls == null) {
                this.f8221a = new C4708fu(this);
                return;
            }
            try {
                this.f8221a = (C4725gi) cls.getConstructor(new Class[]{C4711fw.class, Writer.class, Reader.class}).newInstance(new Object[]{this});
            } catch (Exception e2) {
                throw new IllegalArgumentException("Can't initialize the configured debugger!", e2);
            }
        }
    }

    /* renamed from: b */
    public abstract void mo29189b(int i, Exception exc);

    /* renamed from: b */
    public abstract void mo29178b(C4695fl flVar);

    /* renamed from: b */
    public void mo29190b(C4715fz fzVar) {
        this.f8224a.remove(fzVar);
    }

    /* renamed from: b */
    public void mo29191b(C4718gb gbVar, C4726gj gjVar) {
        Objects.requireNonNull(gbVar, "Packet listener is null.");
        this.f8230b.put(gbVar, new C4712a(gbVar, gjVar));
    }

    /* renamed from: b */
    public abstract void mo29192b(boolean z);

    /* renamed from: b */
    public boolean m13965b() {
        return this.f8231c == 0;
    }

    /* renamed from: c */
    public synchronized void mo29193c() {
        this.f8234e = SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public boolean m13967c() {
        return this.f8231c == 1;
    }

    /* renamed from: d */
    public void mo29194d() {
        synchronized (this.f8225a) {
            this.f8225a.clear();
        }
    }
}

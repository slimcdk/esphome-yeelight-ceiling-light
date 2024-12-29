package com.xiaomi.push;

import android.util.Pair;
import androidx.core.p005os.EnvironmentCompat;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.service.C4860ap;
import com.xiaomi.push.service.C4870at;
import com.xiaomi.push.service.XMPushService;
import java.io.Reader;
import java.io.Writer;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.xiaomi.push.fs */
public abstract class C4680fs {

    /* renamed from: a */
    private static final AtomicInteger f8749a = new AtomicInteger(0);

    /* renamed from: a */
    public static boolean f8750a;

    /* renamed from: a */
    protected int f8751a = 0;

    /* renamed from: a */
    protected long f8752a = -1;

    /* renamed from: a */
    protected C4682ft f8753a;

    /* renamed from: a */
    protected C4695ge f8754a = null;

    /* renamed from: a */
    protected XMPushService f8755a;

    /* renamed from: a */
    protected String f8756a = "";

    /* renamed from: a */
    private final Collection<C4684fv> f8757a = new CopyOnWriteArrayList();

    /* renamed from: a */
    private LinkedList<Pair<Integer, Long>> f8758a = new LinkedList<>();

    /* renamed from: a */
    protected final Map<C4686fx, C4681a> f8759a = new ConcurrentHashMap();

    /* renamed from: b */
    protected final int f8760b = f8749a.getAndIncrement();

    /* renamed from: b */
    protected volatile long f8761b = 0;

    /* renamed from: b */
    protected String f8762b = "";

    /* renamed from: b */
    protected final Map<C4686fx, C4681a> f8763b = new ConcurrentHashMap();

    /* renamed from: c */
    private int f8764c = 2;

    /* renamed from: c */
    protected volatile long f8765c = 0;

    /* renamed from: d */
    protected long f8766d = 0;

    /* renamed from: e */
    private long f8767e = 0;

    /* renamed from: com.xiaomi.push.fs$a */
    public static class C4681a {

        /* renamed from: a */
        private C4686fx f8768a;

        /* renamed from: a */
        private C4696gf f8769a;

        public C4681a(C4686fx fxVar, C4696gf gfVar) {
            this.f8768a = fxVar;
            this.f8769a = gfVar;
        }

        /* renamed from: a */
        public void mo25158a(C4673fl flVar) {
            this.f8768a.mo24777a(flVar);
        }

        /* renamed from: a */
        public void mo25159a(C4701gj gjVar) {
            C4696gf gfVar = this.f8769a;
            if (gfVar == null || gfVar.mo24778a(gjVar)) {
                this.f8768a.mo24778a(gjVar);
            }
        }
    }

    static {
        f8750a = false;
        try {
            f8750a = Boolean.getBoolean("smack.debugEnabled");
        } catch (Exception unused) {
        }
        C4687fy.m14326a();
    }

    protected C4680fs(XMPushService xMPushService, C4682ft ftVar) {
        this.f8753a = ftVar;
        this.f8755a = xMPushService;
        mo25150b();
    }

    /* renamed from: a */
    private String m14276a(int i) {
        return i == 1 ? "connected" : i == 0 ? "connecting" : i == 2 ? "disconnected" : EnvironmentCompat.MEDIA_UNKNOWN;
    }

    /* renamed from: a */
    private void m14277a(int i) {
        synchronized (this.f8758a) {
            if (i == 1) {
                this.f8758a.clear();
            } else {
                this.f8758a.add(new Pair(Integer.valueOf(i), Long.valueOf(System.currentTimeMillis())));
                if (this.f8758a.size() > 6) {
                    this.f8758a.remove(0);
                }
            }
        }
    }

    /* renamed from: a */
    public int mo25134a() {
        return this.f8751a;
    }

    /* renamed from: a */
    public long m14279a() {
        return this.f8765c;
    }

    /* renamed from: a */
    public C4682ft m14280a() {
        return this.f8753a;
    }

    /* renamed from: a */
    public String m14281a() {
        return this.f8753a.mo25164c();
    }

    /* renamed from: a */
    public void mo25145a(int i, int i2, Exception exc) {
        int i3 = this.f8764c;
        if (i != i3) {
            C3989b.m10669a(String.format("update the connection status. %1$s -> %2$s : %3$s ", new Object[]{m14276a(i3), m14276a(i), C4870at.m15633a(i2)}));
        }
        if (C4521az.m13366b(this.f8755a)) {
            m14276a(i);
        }
        if (i == 1) {
            this.f8755a.mo25868a(10);
            if (this.f8764c != 0) {
                C3989b.m10669a("try set connected while not connecting.");
            }
            this.f8764c = i;
            for (C4684fv a : this.f8757a) {
                a.mo24779a(this);
            }
        } else if (i == 0) {
            if (this.f8764c != 2) {
                C3989b.m10669a("try set connecting while not disconnected.");
            }
            this.f8764c = i;
            for (C4684fv b : this.f8757a) {
                b.mo24782b(this);
            }
        } else if (i == 2) {
            this.f8755a.mo25868a(10);
            int i4 = this.f8764c;
            if (i4 == 0) {
                for (C4684fv a2 : this.f8757a) {
                    a2.mo24781a(this, exc == null ? new CancellationException("disconnect while connecting") : exc);
                }
            } else if (i4 == 1) {
                for (C4684fv a3 : this.f8757a) {
                    a3.mo24780a(this, i2, exc);
                }
            }
            this.f8764c = i;
        }
    }

    /* renamed from: a */
    public void mo25146a(C4684fv fvVar) {
        if (fvVar != null && !this.f8757a.contains(fvVar)) {
            this.f8757a.add(fvVar);
        }
    }

    /* renamed from: a */
    public void mo25147a(C4686fx fxVar, C4696gf gfVar) {
        if (fxVar != null) {
            this.f8759a.put(fxVar, new C4681a(fxVar, gfVar));
            return;
        }
        throw new NullPointerException("Packet listener is null.");
    }

    /* renamed from: a */
    public abstract void mo25137a(C4701gj gjVar);

    /* renamed from: a */
    public abstract void mo25138a(C4860ap.C4862b bVar);

    /* renamed from: a */
    public synchronized void mo25148a(String str) {
        if (this.f8764c == 0) {
            C3989b.m10669a("setChallenge hash = " + C4531be.m13428a(str).substring(0, 8));
            this.f8756a = str;
            mo25145a(1, 0, (Exception) null);
        } else {
            C3989b.m10669a("ignore setChallenge because connection was disconnected");
        }
    }

    /* renamed from: a */
    public abstract void mo25139a(String str, String str2);

    /* renamed from: a */
    public abstract void mo25141a(C4673fl[] flVarArr);

    /* renamed from: a */
    public boolean m14290a() {
        return false;
    }

    /* renamed from: a */
    public synchronized boolean mo25149a(long j) {
        return this.f8767e >= j;
    }

    /* renamed from: b */
    public int mo25150b() {
        return this.f8764c;
    }

    /* renamed from: b */
    public String m14293b() {
        return this.f8753a.mo25162b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void m14294b() {
        String str;
        if (this.f8753a.mo25160a() && this.f8754a == null) {
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
                this.f8754a = new C4540bn(this);
                return;
            }
            try {
                this.f8754a = (C4695ge) cls.getConstructor(new Class[]{C4680fs.class, Writer.class, Reader.class}).newInstance(new Object[]{this});
            } catch (Exception e2) {
                throw new IllegalArgumentException("Can't initialize the configured debugger!", e2);
            }
        }
    }

    /* renamed from: b */
    public abstract void mo25151b(int i, Exception exc);

    /* renamed from: b */
    public abstract void mo25142b(C4673fl flVar);

    /* renamed from: b */
    public void mo25152b(C4684fv fvVar) {
        this.f8757a.remove(fvVar);
    }

    /* renamed from: b */
    public void mo25153b(C4686fx fxVar, C4696gf gfVar) {
        if (fxVar != null) {
            this.f8763b.put(fxVar, new C4681a(fxVar, gfVar));
            return;
        }
        throw new NullPointerException("Packet listener is null.");
    }

    /* renamed from: b */
    public abstract void mo25154b(boolean z);

    /* renamed from: b */
    public boolean m14300b() {
        return this.f8764c == 0;
    }

    /* renamed from: c */
    public synchronized void mo25155c() {
        this.f8767e = System.currentTimeMillis();
    }

    /* renamed from: c */
    public boolean m14302c() {
        return this.f8764c == 1;
    }

    /* renamed from: d */
    public void mo25156d() {
        synchronized (this.f8758a) {
            this.f8758a.clear();
        }
    }

    /* renamed from: d */
    public synchronized boolean m14304d() {
        return System.currentTimeMillis() - this.f8767e < ((long) C4687fy.m14326a());
    }

    /* renamed from: e */
    public synchronized boolean mo25157e() {
        boolean z;
        z = true;
        if (System.currentTimeMillis() - this.f8766d >= ((long) (C4687fy.m14326a() << 1))) {
            z = false;
        }
        return z;
    }
}

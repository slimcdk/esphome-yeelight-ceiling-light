package p239z5;

import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.eclipse.jetty.http.C9892f;
import org.eclipse.jetty.http.C9895h;
import org.eclipse.jetty.http.C9916r;
import p152e6.C9001b;
import p152e6.C9003c;
import p157f6.C9042e;
import p157f6.C9043f;
import p225w5.C11940d;
import p225w5.C11946h;
import p225w5.C11952m;
import p229x5.C11985c;
import p229x5.C11986d;

/* renamed from: z5.p */
public class C12183p {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C9003c f22479k = C9001b.m21450a(C12183p.class);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ConcurrentMap<String, C12185b> f22480a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final AtomicInteger f22481b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final AtomicInteger f22482c;

    /* renamed from: d */
    private final C9043f f22483d;

    /* renamed from: e */
    private final C12183p f22484e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C9916r f22485f;

    /* renamed from: g */
    private boolean f22486g;

    /* renamed from: h */
    private int f22487h;

    /* renamed from: i */
    private int f22488i;

    /* renamed from: j */
    private int f22489j;

    /* renamed from: z5.p$a */
    class C12184a implements Comparator<C12185b> {
        C12184a(C12183p pVar) {
        }

        /* renamed from: a */
        public int compare(C12185b bVar, C12185b bVar2) {
            if (bVar.f22496g < bVar2.f22496g) {
                return -1;
            }
            if (bVar.f22496g > bVar2.f22496g) {
                return 1;
            }
            if (bVar.f22491b < bVar2.f22491b) {
                return -1;
            }
            return bVar.f22492c.compareTo(bVar2.f22492c);
        }
    }

    /* renamed from: z5.p$b */
    public class C12185b implements C9892f {

        /* renamed from: a */
        final C9042e f22490a;

        /* renamed from: b */
        final int f22491b;

        /* renamed from: c */
        final String f22492c;

        /* renamed from: d */
        final long f22493d;

        /* renamed from: e */
        final C11940d f22494e;

        /* renamed from: f */
        final C11940d f22495f;

        /* renamed from: g */
        volatile long f22496g;

        /* renamed from: h */
        AtomicReference<C11940d> f22497h = new AtomicReference<>();

        /* renamed from: i */
        AtomicReference<C11940d> f22498i = new AtomicReference<>();

        C12185b(String str, C9042e eVar) {
            this.f22492c = str;
            this.f22490a = eVar;
            this.f22495f = C12183p.this.f22485f.mo39860b(eVar.toString());
            boolean c = eVar.mo36919c();
            long k = c ? eVar.mo36923k() : -1;
            this.f22493d = k;
            this.f22494e = k < 0 ? null : new C11946h(C9895h.m24173n(k));
            int l = c ? (int) eVar.mo36924l() : 0;
            this.f22491b = l;
            C12183p.this.f22481b.addAndGet(l);
            C12183p.this.f22482c.incrementAndGet();
            this.f22496g = System.currentTimeMillis();
        }

        /* renamed from: a */
        public String mo43144a() {
            return this.f22492c;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo43145b() {
            C12183p.this.f22481b.addAndGet(-this.f22491b);
            C12183p.this.f22482c.decrementAndGet();
            this.f22490a.mo36931r();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo43146c() {
            if (this.f22493d == this.f22490a.mo36923k()) {
                this.f22496g = System.currentTimeMillis();
                return true;
            } else if (this != C12183p.this.f22480a.remove(this.f22492c)) {
                return false;
            } else {
                mo43145b();
                return false;
            }
        }

        /* renamed from: d */
        public InputStream mo39760d() {
            C11940d e = mo39761e();
            return (e == null || e.mo42451g0() == null) ? this.f22490a.mo36921f() : new ByteArrayInputStream(e.mo42451g0(), e.mo42409L0(), e.length());
        }

        /* renamed from: e */
        public C11940d mo39761e() {
            C11940d dVar = this.f22497h.get();
            if (dVar == null) {
                C11940d h = C12183p.this.mo43133h(this.f22490a);
                if (h == null) {
                    C9003c e = C12183p.f22479k;
                    e.mo36847b("Could not load " + this, new Object[0]);
                } else {
                    dVar = this.f22497h.compareAndSet((Object) null, h) ? h : this.f22497h.get();
                }
            }
            if (dVar == null) {
                return null;
            }
            return new C11952m(dVar);
        }

        /* renamed from: f */
        public C11940d mo39762f() {
            C11940d dVar = this.f22498i.get();
            if (dVar == null) {
                C11940d g = C12183p.this.mo43132g(this.f22490a);
                if (g == null) {
                    C9003c e = C12183p.f22479k;
                    e.mo36847b("Could not load " + this, new Object[0]);
                } else {
                    dVar = this.f22498i.compareAndSet((Object) null, g) ? g : this.f22498i.get();
                }
            }
            if (dVar == null) {
                return null;
            }
            return new C11952m(dVar);
        }

        /* renamed from: g */
        public C9042e mo39763g() {
            return this.f22490a;
        }

        public C11940d getContentType() {
            return this.f22495f;
        }

        public C11940d getLastModified() {
            return this.f22494e;
        }

        /* renamed from: h */
        public long mo39766h() {
            return (long) this.f22491b;
        }

        public void release() {
        }

        public String toString() {
            C9042e eVar = this.f22490a;
            return String.format("%s %s %d %s %s", new Object[]{eVar, Boolean.valueOf(eVar.mo36919c()), Long.valueOf(this.f22490a.mo36923k()), this.f22495f, this.f22494e});
        }
    }

    public C12183p(C12183p pVar, C9043f fVar, C9916r rVar) {
        this.f22486g = true;
        this.f22487h = 4194304;
        this.f22488i = 2048;
        this.f22489j = 33554432;
        this.f22483d = fVar;
        this.f22480a = new ConcurrentHashMap();
        this.f22481b = new AtomicInteger();
        this.f22482c = new AtomicInteger();
        this.f22485f = rVar;
        this.f22484e = pVar;
    }

    public C12183p(C12183p pVar, C9043f fVar, C9916r rVar, boolean z) {
        this(pVar, fVar, rVar);
        mo43140p(z);
    }

    /* renamed from: k */
    private C9892f m31839k(String str, C9042e eVar) {
        if (eVar == null || !eVar.mo36919c()) {
            return null;
        }
        if (eVar.mo36922j() || !mo43135j(eVar)) {
            return new C9892f.C9893a(eVar, this.f22485f.mo39860b(eVar.toString()), mo43134i());
        }
        C12185b bVar = new C12185b(str, eVar);
        m31840q();
        C12185b putIfAbsent = this.f22480a.putIfAbsent(str, bVar);
        if (putIfAbsent == null) {
            return bVar;
        }
        bVar.mo43145b();
        return putIfAbsent;
    }

    /* renamed from: q */
    private void m31840q() {
        while (this.f22480a.size() > 0) {
            if (this.f22482c.get() > this.f22488i || this.f22481b.get() > this.f22489j) {
                TreeSet<C12185b> treeSet = new TreeSet<>(new C12184a(this));
                for (C12185b add : this.f22480a.values()) {
                    treeSet.add(add);
                }
                for (C12185b bVar : treeSet) {
                    if (this.f22482c.get() <= this.f22488i && this.f22481b.get() <= this.f22489j) {
                        break;
                    } else if (bVar == this.f22480a.remove(bVar.mo43144a())) {
                        bVar.mo43145b();
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public void mo43131f() {
        if (this.f22480a == null) {
            return;
        }
        while (this.f22480a.size() > 0) {
            for (String remove : this.f22480a.keySet()) {
                C12185b bVar = (C12185b) this.f22480a.remove(remove);
                if (bVar != null) {
                    bVar.mo43145b();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C11940d mo43132g(C9042e eVar) {
        try {
            if (this.f22486g && eVar.mo36920e() != null) {
                return new C11985c(eVar.mo36920e());
            }
            int l = (int) eVar.mo36924l();
            if (l < 0) {
                C9003c cVar = f22479k;
                cVar.mo36847b("invalid resource: " + String.valueOf(eVar) + " " + l, new Object[0]);
                return null;
            }
            C11985c cVar2 = new C11985c(l);
            InputStream f = eVar.mo36921f();
            cVar2.mo42444y0(f, l);
            f.close();
            return cVar2;
        } catch (IOException e) {
            f22479k.mo36856j(e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C11940d mo43133h(C9042e eVar) {
        try {
            int l = (int) eVar.mo36924l();
            if (l < 0) {
                C9003c cVar = f22479k;
                cVar.mo36847b("invalid resource: " + String.valueOf(eVar) + " " + l, new Object[0]);
                return null;
            }
            C11986d dVar = new C11986d(l);
            InputStream f = eVar.mo36921f();
            dVar.mo42444y0(f, l);
            f.close();
            return dVar;
        } catch (IOException e) {
            f22479k.mo36856j(e);
            return null;
        }
    }

    /* renamed from: i */
    public int mo43134i() {
        return this.f22487h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public boolean mo43135j(C9042e eVar) {
        long l = eVar.mo36924l();
        return l > 0 && l < ((long) this.f22487h) && l < ((long) this.f22489j);
    }

    /* renamed from: l */
    public C9892f mo43136l(String str) {
        C9892f l;
        C12185b bVar = (C12185b) this.f22480a.get(str);
        if (bVar != null && bVar.mo43146c()) {
            return bVar;
        }
        C9892f k = m31839k(str, this.f22483d.getResource(str));
        if (k != null) {
            return k;
        }
        C12183p pVar = this.f22484e;
        if (pVar == null || (l = pVar.mo43136l(str)) == null) {
            return null;
        }
        return l;
    }

    /* renamed from: m */
    public void mo43137m(int i) {
        this.f22489j = i;
        m31840q();
    }

    /* renamed from: n */
    public void mo43138n(int i) {
        this.f22487h = i;
        m31840q();
    }

    /* renamed from: o */
    public void mo43139o(int i) {
        this.f22488i = i;
        m31840q();
    }

    /* renamed from: p */
    public void mo43140p(boolean z) {
        this.f22486g = z;
    }

    public String toString() {
        return "ResourceCache[" + this.f22484e + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f22483d + "]@" + hashCode();
    }
}

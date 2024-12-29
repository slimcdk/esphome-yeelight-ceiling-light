package org.eclipse.jetty.client;

import androidx.appcompat.widget.ActivityChooserView;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.concurrent.atomic.AtomicInteger;
import org.eclipse.jetty.http.C9895h;
import org.eclipse.jetty.http.C9908k;
import org.eclipse.jetty.http.C9912n;
import org.eclipse.jetty.http.C9914p;
import p152e6.C9001b;
import p152e6.C9003c;
import p172i6.C9128e;
import p225w5.C11940d;
import p225w5.C11946h;
import p225w5.C11949j;
import p225w5.C11950k;

/* renamed from: org.eclipse.jetty.client.j */
public class C9877j {

    /* renamed from: u */
    static final C9003c f17945u = C9001b.m21450a(C9877j.class);

    /* renamed from: a */
    private String f17946a = "GET";

    /* renamed from: b */
    private C11940d f17947b = C9912n.f18122a;

    /* renamed from: c */
    private String f17948c;

    /* renamed from: d */
    private int f17949d = 11;

    /* renamed from: e */
    private C9866b f17950e;

    /* renamed from: f */
    private final C9895h f17951f = new C9895h();

    /* renamed from: g */
    private C11940d f17952g;

    /* renamed from: h */
    private InputStream f17953h;

    /* renamed from: i */
    private AtomicInteger f17954i = new AtomicInteger(0);

    /* renamed from: j */
    private C9875h f17955j = new C9879b(this, (C9878a) null);

    /* renamed from: k */
    private volatile C9861a f17956k;

    /* renamed from: l */
    private long f17957l = -1;

    /* renamed from: m */
    private volatile C9128e.C9129a f17958m;

    /* renamed from: n */
    private long f17959n = System.currentTimeMillis();

    /* renamed from: o */
    private long f17960o = -1;

    /* renamed from: p */
    private int f17961p = -1;

    /* renamed from: q */
    private int f17962q = -1;

    /* renamed from: r */
    boolean f17963r;

    /* renamed from: s */
    boolean f17964s;

    /* renamed from: t */
    boolean f17965t;

    /* renamed from: org.eclipse.jetty.client.j$a */
    class C9878a extends C9128e.C9129a {

        /* renamed from: e */
        final /* synthetic */ HttpDestination f17966e;

        C9878a(HttpDestination httpDestination) {
            this.f17966e = httpDestination;
        }

        /* renamed from: f */
        public void mo37217f() {
            C9877j.this.mo39626i(this.f17966e);
        }
    }

    /* renamed from: org.eclipse.jetty.client.j$b */
    private class C9879b implements C9875h {
        private C9879b() {
        }

        /* synthetic */ C9879b(C9877j jVar, C9878a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo39539a(C11940d dVar, int i, C11940d dVar2) {
            C9877j.this.mo39559G(dVar, i, dVar2);
        }

        /* renamed from: b */
        public void mo39540b(Throwable th) {
            try {
                C9877j.this.mo26743x(th);
            } finally {
                C9877j.this.m23959h();
            }
        }

        /* renamed from: c */
        public void mo39541c() {
            try {
                C9877j.this.mo39517z();
            } finally {
                C9877j.this.m23959h();
            }
        }

        /* renamed from: d */
        public void mo39542d(C11940d dVar, C11940d dVar2) {
            C9877j.this.mo39558E(dVar, dVar2);
        }

        /* renamed from: e */
        public void mo39543e(C11940d dVar) {
            C9877j.this.mo39562D(dVar);
        }

        /* renamed from: f */
        public void mo39544f() {
            C9877j.this.mo39598A();
        }

        /* renamed from: g */
        public void mo39545g() {
            try {
                C9877j.this.mo39516C();
                synchronized (C9877j.this) {
                    C9877j jVar = C9877j.this;
                    jVar.f17964s = true;
                    boolean z = jVar.f17965t | jVar.f17963r;
                    jVar.f17965t = z;
                    if (z) {
                        jVar.mo39625g();
                    }
                    C9877j.this.notifyAll();
                }
            } catch (Throwable th) {
                synchronized (C9877j.this) {
                    C9877j jVar2 = C9877j.this;
                    jVar2.f17964s = true;
                    boolean z2 = jVar2.f17965t | jVar2.f17963r;
                    jVar2.f17965t = z2;
                    if (z2) {
                        jVar2.mo39625g();
                    }
                    C9877j.this.notifyAll();
                    throw th;
                }
            }
        }

        /* renamed from: h */
        public void mo39546h() {
            C9877j.this.mo39613U(true);
            try {
                C9877j.this.mo39563H();
            } catch (IOException e) {
                C9877j.f17945u.mo36848c(e);
            }
        }

        /* renamed from: i */
        public void mo39547i(Throwable th) {
            try {
                C9877j.this.mo26744y(th);
            } finally {
                C9877j.this.m23959h();
            }
        }

        /* renamed from: j */
        public void mo39548j() {
            C9877j.this.mo39600F();
        }

        /* renamed from: k */
        public void mo39549k() {
            try {
                C9877j.this.mo39599B();
                synchronized (C9877j.this) {
                    C9877j jVar = C9877j.this;
                    jVar.f17963r = true;
                    boolean z = jVar.f17965t | jVar.f17964s;
                    jVar.f17965t = z;
                    if (z) {
                        jVar.mo39625g();
                    }
                    C9877j.this.notifyAll();
                }
            } catch (Throwable th) {
                synchronized (C9877j.this) {
                    C9877j jVar2 = C9877j.this;
                    jVar2.f17963r = true;
                    boolean z2 = jVar2.f17965t | jVar2.f17964s;
                    jVar2.f17965t = z2;
                    if (z2) {
                        jVar2.mo39625g();
                    }
                    C9877j.this.notifyAll();
                    throw th;
                }
            }
        }
    }

    /* renamed from: Y */
    private boolean m23955Y(int i, int i2) {
        boolean compareAndSet = this.f17954i.compareAndSet(i2, i);
        if (compareAndSet) {
            mo39628k().mo39541c();
        }
        return compareAndSet;
    }

    /* renamed from: a */
    private void m23956a() {
        C9861a aVar = this.f17956k;
        if (aVar != null) {
            try {
                aVar.mo39521m();
            } catch (IOException e) {
                f17945u.mo36848c(e);
            } catch (Throwable th) {
                mo39625g();
                throw th;
            }
            mo39625g();
        }
    }

    /* renamed from: c0 */
    public static String m23958c0(int i) {
        switch (i) {
            case 0:
                return "START";
            case 1:
                return "CONNECTING";
            case 2:
                return "CONNECTED";
            case 3:
                return "SENDING";
            case 4:
                return "WAITING";
            case 5:
                return "HEADERS";
            case 6:
                return "CONTENT";
            case 7:
                return "COMPLETED";
            case 8:
                return "EXPIRED";
            case 9:
                return "EXCEPTED";
            case 10:
                return "CANCELLING";
            case 11:
                return "CANCELLED";
            default:
                return "UNKNOWN";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m23959h() {
        synchronized (this) {
            mo39625g();
            this.f17965t = true;
            notifyAll();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo39598A() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo39599B() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo39516C() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo39562D(C11940d dVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo39558E(C11940d dVar, C11940d dVar2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo39600F() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo39559G(C11940d dVar, int i, C11940d dVar2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo39563H() {
        InputStream inputStream = this.f17953h;
        if (inputStream == null) {
            return;
        }
        if (inputStream.markSupported()) {
            this.f17952g = null;
            this.f17953h.reset();
            return;
        }
        throw new IOException("Unsupported retry attempt");
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public C11949j mo39601I(C11950k kVar) {
        return null;
    }

    /* renamed from: J */
    public void mo39602J() {
        synchronized (this) {
            this.f17958m = null;
            this.f17963r = false;
            this.f17964s = false;
            this.f17965t = false;
            mo39616X(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo39603K(HttpDestination httpDestination) {
        this.f17958m = new C9878a(httpDestination);
        C9871g h = httpDestination.mo39498h();
        long t = mo39637t();
        if (t > 0) {
            h.mo39585f1(this.f17958m, t);
        } else {
            h.mo39584e1(this.f17958m);
        }
    }

    /* renamed from: L */
    public void mo39604L(C9866b bVar) {
        this.f17950e = bVar;
    }

    /* renamed from: M */
    public void mo39605M(C9875h hVar) {
        this.f17955j = hVar;
    }

    /* renamed from: N */
    public void mo39606N(String str) {
        this.f17946a = str;
    }

    /* renamed from: O */
    public void mo39607O(C11940d dVar) {
        this.f17952g = dVar;
    }

    /* renamed from: P */
    public void mo39608P(InputStream inputStream) {
        this.f17953h = inputStream;
        if (inputStream != null && inputStream.markSupported()) {
            this.f17953h.mark(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        }
    }

    /* renamed from: Q */
    public void mo39609Q(String str) {
        mo39633p().mo39779C(C9908k.f18090j, str);
    }

    /* renamed from: R */
    public void mo39610R(String str, String str2) {
        mo39633p().mo39778B(str, str2);
    }

    /* renamed from: S */
    public void mo39611S(C11940d dVar, C11940d dVar2) {
        mo39633p().mo39780D(dVar, dVar2);
    }

    /* renamed from: T */
    public void mo39612T(String str) {
        this.f17948c = str;
    }

    /* renamed from: U */
    public void mo39613U(boolean z) {
    }

    /* renamed from: V */
    public void mo39614V(String str) {
        C11940d dVar;
        if (str != null) {
            if ("http".equalsIgnoreCase(str)) {
                dVar = C9912n.f18122a;
            } else if ("https".equalsIgnoreCase(str)) {
                dVar = C9912n.f18123b;
            } else {
                mo39615W(new C11946h(str));
                return;
            }
            mo39615W(dVar);
        }
    }

    /* renamed from: W */
    public void mo39615W(C11940d dVar) {
        this.f17947b = dVar;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        r2 = false;
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        r2 = r2.compareAndSet(r1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005b, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0068, code lost:
        r2 = m23955Y(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00d9, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00da, code lost:
        if (r2 != false) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00dc, code lost:
        if (r4 == false) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00fe, code lost:
        throw new java.lang.IllegalStateException(m23958c0(r1) + " => " + m23958c0(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00ff, code lost:
        f17945u.mo36850e("setStatus {} {}", java.lang.Integer.valueOf(r8), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        return r2;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:51:0x009d=Splitter:B:51:0x009d, B:63:0x00bf=Splitter:B:63:0x00bf} */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo39616X(int r8) {
        /*
            r7 = this;
            r0 = 0
            java.util.concurrent.atomic.AtomicInteger r1 = r7.f17954i     // Catch:{ IOException -> 0x012a }
            int r1 = r1.get()     // Catch:{ IOException -> 0x012a }
            r2 = 3
            if (r1 == r8) goto L_0x001d
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x012a }
            long r5 = r7.f17959n     // Catch:{ IOException -> 0x012a }
            long r5 = r3 - r5
            int r6 = (int) r5     // Catch:{ IOException -> 0x012a }
            r7.f17962q = r6     // Catch:{ IOException -> 0x012a }
            r7.f17961p = r1     // Catch:{ IOException -> 0x012a }
            r7.f17959n = r3     // Catch:{ IOException -> 0x012a }
            if (r8 != r2) goto L_0x001d
            r7.f17960o = r3     // Catch:{ IOException -> 0x012a }
        L_0x001d:
            java.lang.String r3 = " => "
            r4 = 4
            r5 = 2
            r6 = 1
            switch(r1) {
                case 0: goto L_0x00cb;
                case 1: goto L_0x00c2;
                case 2: goto L_0x00b9;
                case 3: goto L_0x00a0;
                case 4: goto L_0x0096;
                case 5: goto L_0x007f;
                case 6: goto L_0x0061;
                case 7: goto L_0x0054;
                case 8: goto L_0x003f;
                case 9: goto L_0x003f;
                case 10: goto L_0x0029;
                case 11: goto L_0x003f;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.AssertionError r2 = new java.lang.AssertionError     // Catch:{ IOException -> 0x012a }
            goto L_0x0114
        L_0x0029:
            r2 = 9
            if (r8 == r2) goto L_0x0032
            r2 = 11
            if (r8 == r2) goto L_0x0032
            goto L_0x0044
        L_0x0032:
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f17954i     // Catch:{ IOException -> 0x012a }
            boolean r2 = r2.compareAndSet(r1, r8)     // Catch:{ IOException -> 0x012a }
            if (r2 == 0) goto L_0x00d9
            r7.m23959h()     // Catch:{ IOException -> 0x0111 }
            goto L_0x00d9
        L_0x003f:
            if (r8 == 0) goto L_0x004c
            r2 = 7
            if (r8 == r2) goto L_0x0048
        L_0x0044:
            r2 = 0
            r4 = 1
            goto L_0x00da
        L_0x0048:
            r7.m23959h()     // Catch:{ IOException -> 0x012a }
            goto L_0x0044
        L_0x004c:
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f17954i     // Catch:{ IOException -> 0x012a }
        L_0x004e:
            boolean r2 = r2.compareAndSet(r1, r8)     // Catch:{ IOException -> 0x012a }
            goto L_0x00d9
        L_0x0054:
            if (r8 == 0) goto L_0x005e
            if (r8 == r4) goto L_0x005e
            switch(r8) {
                case 8: goto L_0x0044;
                case 9: goto L_0x005e;
                case 10: goto L_0x0044;
                default: goto L_0x005b;
            }     // Catch:{ IOException -> 0x012a }
        L_0x005b:
            r2 = 0
            goto L_0x00d9
        L_0x005e:
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f17954i     // Catch:{ IOException -> 0x012a }
            goto L_0x004e
        L_0x0061:
            switch(r8) {
                case 7: goto L_0x006e;
                case 8: goto L_0x0068;
                case 9: goto L_0x0065;
                case 10: goto L_0x0065;
                default: goto L_0x0064;
            }     // Catch:{ IOException -> 0x012a }
        L_0x0064:
            goto L_0x005b
        L_0x0065:
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f17954i     // Catch:{ IOException -> 0x012a }
            goto L_0x004e
        L_0x0068:
            boolean r2 = r7.m23955Y(r8, r1)     // Catch:{ IOException -> 0x012a }
            goto L_0x00d9
        L_0x006e:
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f17954i     // Catch:{ IOException -> 0x012a }
            boolean r2 = r2.compareAndSet(r1, r8)     // Catch:{ IOException -> 0x012a }
            if (r2 == 0) goto L_0x00d9
            org.eclipse.jetty.client.h r4 = r7.mo39628k()     // Catch:{ IOException -> 0x0111 }
            r4.mo39545g()     // Catch:{ IOException -> 0x0111 }
            goto L_0x00d9
        L_0x007f:
            switch(r8) {
                case 6: goto L_0x0086;
                case 7: goto L_0x0082;
                case 8: goto L_0x0068;
                case 9: goto L_0x0083;
                case 10: goto L_0x0083;
                default: goto L_0x0082;
            }
        L_0x0082:
            goto L_0x005b
        L_0x0083:
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f17954i     // Catch:{ IOException -> 0x012a }
            goto L_0x004e
        L_0x0086:
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f17954i     // Catch:{ IOException -> 0x012a }
            boolean r2 = r2.compareAndSet(r1, r8)     // Catch:{ IOException -> 0x012a }
            if (r2 == 0) goto L_0x00d9
            org.eclipse.jetty.client.h r4 = r7.mo39628k()     // Catch:{ IOException -> 0x0111 }
            r4.mo39548j()     // Catch:{ IOException -> 0x0111 }
            goto L_0x00d9
        L_0x0096:
            r2 = 5
            if (r8 == r2) goto L_0x009d
            switch(r8) {
                case 8: goto L_0x0068;
                case 9: goto L_0x009d;
                case 10: goto L_0x009d;
                default: goto L_0x009c;
            }
        L_0x009c:
            goto L_0x005b
        L_0x009d:
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f17954i     // Catch:{ IOException -> 0x012a }
            goto L_0x004e
        L_0x00a0:
            if (r8 == r4) goto L_0x00a9
            switch(r8) {
                case 8: goto L_0x0068;
                case 9: goto L_0x00a6;
                case 10: goto L_0x00a6;
                default: goto L_0x00a5;
            }     // Catch:{ IOException -> 0x012a }
        L_0x00a5:
            goto L_0x005b
        L_0x00a6:
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f17954i     // Catch:{ IOException -> 0x012a }
            goto L_0x004e
        L_0x00a9:
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f17954i     // Catch:{ IOException -> 0x012a }
            boolean r2 = r2.compareAndSet(r1, r8)     // Catch:{ IOException -> 0x012a }
            if (r2 == 0) goto L_0x00d9
            org.eclipse.jetty.client.h r4 = r7.mo39628k()     // Catch:{ IOException -> 0x0111 }
            r4.mo39544f()     // Catch:{ IOException -> 0x0111 }
            goto L_0x00d9
        L_0x00b9:
            if (r8 == r2) goto L_0x00bf
            switch(r8) {
                case 8: goto L_0x0068;
                case 9: goto L_0x00bf;
                case 10: goto L_0x00bf;
                default: goto L_0x00be;
            }
        L_0x00be:
            goto L_0x005b
        L_0x00bf:
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f17954i     // Catch:{ IOException -> 0x012a }
            goto L_0x004e
        L_0x00c2:
            if (r8 == r5) goto L_0x00c8
            switch(r8) {
                case 8: goto L_0x0068;
                case 9: goto L_0x00c8;
                case 10: goto L_0x00c8;
                default: goto L_0x00c7;
            }     // Catch:{ IOException -> 0x012a }
        L_0x00c7:
            goto L_0x005b
        L_0x00c8:
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f17954i     // Catch:{ IOException -> 0x012a }
            goto L_0x004e
        L_0x00cb:
            if (r8 == 0) goto L_0x00d5
            if (r8 == r6) goto L_0x00d5
            if (r8 == r5) goto L_0x00d5
            switch(r8) {
                case 8: goto L_0x0068;
                case 9: goto L_0x00d5;
                case 10: goto L_0x00d5;
                default: goto L_0x00d4;
            }     // Catch:{ IOException -> 0x012a }
        L_0x00d4:
            goto L_0x005b
        L_0x00d5:
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f17954i     // Catch:{ IOException -> 0x012a }
            goto L_0x004e
        L_0x00d9:
            r4 = 0
        L_0x00da:
            if (r2 != 0) goto L_0x00ff
            if (r4 == 0) goto L_0x00df
            goto L_0x00ff
        L_0x00df:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0111 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0111 }
            r4.<init>()     // Catch:{ IOException -> 0x0111 }
            java.lang.String r1 = m23958c0(r1)     // Catch:{ IOException -> 0x0111 }
            r4.append(r1)     // Catch:{ IOException -> 0x0111 }
            r4.append(r3)     // Catch:{ IOException -> 0x0111 }
            java.lang.String r8 = m23958c0(r8)     // Catch:{ IOException -> 0x0111 }
            r4.append(r8)     // Catch:{ IOException -> 0x0111 }
            java.lang.String r8 = r4.toString()     // Catch:{ IOException -> 0x0111 }
            r0.<init>(r8)     // Catch:{ IOException -> 0x0111 }
            throw r0     // Catch:{ IOException -> 0x0111 }
        L_0x00ff:
            e6.c r1 = f17945u     // Catch:{ IOException -> 0x0111 }
            java.lang.String r3 = "setStatus {} {}"
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x0111 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x0111 }
            r4[r0] = r8     // Catch:{ IOException -> 0x0111 }
            r4[r6] = r7     // Catch:{ IOException -> 0x0111 }
            r1.mo36850e(r3, r4)     // Catch:{ IOException -> 0x0111 }
            goto L_0x0131
        L_0x0111:
            r8 = move-exception
            r0 = r2
            goto L_0x012b
        L_0x0114:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x012a }
            r4.<init>()     // Catch:{ IOException -> 0x012a }
            r4.append(r1)     // Catch:{ IOException -> 0x012a }
            r4.append(r3)     // Catch:{ IOException -> 0x012a }
            r4.append(r8)     // Catch:{ IOException -> 0x012a }
            java.lang.String r8 = r4.toString()     // Catch:{ IOException -> 0x012a }
            r2.<init>(r8)     // Catch:{ IOException -> 0x012a }
            throw r2     // Catch:{ IOException -> 0x012a }
        L_0x012a:
            r8 = move-exception
        L_0x012b:
            e6.c r1 = f17945u
            r1.mo36856j(r8)
            r2 = r0
        L_0x0131:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.client.C9877j.mo39616X(int):boolean");
    }

    /* renamed from: Z */
    public void mo39617Z(URI uri) {
        if (!uri.isAbsolute()) {
            throw new IllegalArgumentException("!Absolute URI: " + uri);
        } else if (!uri.isOpaque()) {
            C9003c cVar = f17945u;
            if (cVar.mo36846a()) {
                cVar.mo36850e("URI = {}", uri.toASCIIString());
            }
            String scheme = uri.getScheme();
            int port = uri.getPort();
            if (port <= 0) {
                port = "https".equalsIgnoreCase(scheme) ? 443 : 80;
            }
            mo39614V(scheme);
            mo39604L(new C9866b(uri.getHost(), port));
            String d = new C9914p(uri).mo39742d();
            if (d == null) {
                d = MiotCloudImpl.COOKIE_PATH;
            }
            mo39612T(d);
        } else {
            throw new IllegalArgumentException("Opaque URI: " + uri);
        }
    }

    /* renamed from: a0 */
    public void mo39618a0(String str) {
        mo39617Z(URI.create(str));
    }

    /* renamed from: b0 */
    public void mo39619b0(int i) {
        this.f17949d = i;
    }

    /* renamed from: c */
    public void mo39620c(String str, String str2) {
        mo39633p().mo39788d(str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo39621d(C9861a aVar) {
        if (aVar.mo42448g().mo39667q() != null) {
            new C9866b(aVar.mo42448g().mo39667q(), aVar.mo42448g().mo39654e());
        }
        this.f17956k = aVar;
        if (mo39636s() == 10) {
            m23956a();
        }
    }

    /* renamed from: d0 */
    public int mo39622d0() {
        int i;
        synchronized (this) {
            while (!mo39641w()) {
                wait();
            }
            i = this.f17954i.get();
        }
        return i;
    }

    /* renamed from: e */
    public void mo39623e() {
        mo39616X(10);
        m23956a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo39624f(C9871g gVar) {
        C9128e.C9129a aVar = this.f17958m;
        if (aVar != null) {
            gVar.mo39565Q0(aVar);
        }
        this.f17958m = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C9861a mo39625g() {
        C9861a aVar = this.f17956k;
        this.f17956k = null;
        if (mo39636s() == 10) {
            mo39616X(11);
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo39626i(HttpDestination httpDestination) {
        if (mo39636s() < 7) {
            mo39616X(8);
        }
        httpDestination.mo39495e(this);
        C9861a aVar = this.f17956k;
        if (aVar != null) {
            aVar.mo39523o(this);
        }
    }

    /* renamed from: j */
    public C9866b mo39627j() {
        return this.f17950e;
    }

    /* renamed from: k */
    public C9875h mo39628k() {
        return this.f17955j;
    }

    /* renamed from: l */
    public String mo39629l() {
        return this.f17946a;
    }

    /* renamed from: m */
    public C11940d mo39630m() {
        return this.f17952g;
    }

    /* renamed from: n */
    public C11940d mo39631n(C11940d dVar) {
        synchronized (this) {
            if (this.f17953h != null) {
                if (dVar == null) {
                    dVar = new C11946h(8192);
                }
                int read = this.f17953h.read(dVar.mo42451g0(), dVar.mo42416U0(), dVar.mo42410M0());
                if (read >= 0) {
                    dVar.mo42430h0(dVar.mo42416U0() + read);
                    return dVar;
                }
            }
            return null;
        }
    }

    /* renamed from: o */
    public InputStream mo39632o() {
        return this.f17953h;
    }

    /* renamed from: p */
    public C9895h mo39633p() {
        return this.f17951f;
    }

    /* renamed from: q */
    public String mo39634q() {
        return this.f17948c;
    }

    /* renamed from: r */
    public C11940d mo39635r() {
        return this.f17947b;
    }

    /* renamed from: s */
    public int mo39636s() {
        return this.f17954i.get();
    }

    /* renamed from: t */
    public long mo39637t() {
        return this.f17957l;
    }

    public String toString() {
        String str;
        String c0 = m23958c0(mo39636s());
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.f17959n;
        if (this.f17961p >= 0) {
            str = String.format("%s@%x=%s//%s%s#%s(%dms)->%s(%dms)", new Object[]{getClass().getSimpleName(), Integer.valueOf(hashCode()), this.f17946a, this.f17950e, this.f17948c, m23958c0(this.f17961p), Integer.valueOf(this.f17962q), c0, Long.valueOf(j)});
        } else {
            str = String.format("%s@%x=%s//%s%s#%s(%dms)", new Object[]{getClass().getSimpleName(), Integer.valueOf(hashCode()), this.f17946a, this.f17950e, this.f17948c, c0, Long.valueOf(j)});
        }
        if (mo39636s() < 3 || this.f17960o <= 0) {
            return str;
        }
        return str + "sent=" + (currentTimeMillis - this.f17960o) + "ms";
    }

    @Deprecated
    /* renamed from: u */
    public String mo39639u() {
        return mo39634q();
    }

    /* renamed from: v */
    public int mo39640v() {
        return this.f17949d;
    }

    /* renamed from: w */
    public boolean mo39641w() {
        boolean z;
        synchronized (this) {
            z = this.f17965t;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo26743x(Throwable th) {
        C9003c cVar = f17945u;
        cVar.mo36852g("CONNECTION FAILED " + this, th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo26744y(Throwable th) {
        C9003c cVar = f17945u;
        cVar.mo36852g("EXCEPTION " + this, th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo39517z() {
        C9003c cVar = f17945u;
        cVar.mo36847b("EXPIRED " + this, new Object[0]);
    }
}

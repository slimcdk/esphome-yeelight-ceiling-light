package p164h.p211a.p212a.p213a;

import androidx.appcompat.widget.ActivityChooserView;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.concurrent.atomic.AtomicInteger;
import p164h.p211a.p212a.p216c.C10897i;
import p164h.p211a.p212a.p216c.C10910l;
import p164h.p211a.p212a.p216c.C10914o;
import p164h.p211a.p212a.p216c.C10918r;
import p164h.p211a.p212a.p217d.C10929e;
import p164h.p211a.p212a.p217d.C10938k;
import p164h.p211a.p212a.p217d.C10941m;
import p164h.p211a.p212a.p217d.C10942n;
import p164h.p211a.p212a.p228h.p232d0.C11115e;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.a.k */
public class C10871k {

    /* renamed from: u */
    static final C11158c f21014u = C11156b.m29015a(C10871k.class);

    /* renamed from: a */
    private String f21015a = "GET";

    /* renamed from: b */
    private C10929e f21016b = C10914o.f21188a;

    /* renamed from: c */
    private String f21017c;

    /* renamed from: d */
    private int f21018d = 11;

    /* renamed from: e */
    private C10857b f21019e;

    /* renamed from: f */
    private final C10897i f21020f = new C10897i();

    /* renamed from: g */
    private C10929e f21021g;

    /* renamed from: h */
    private InputStream f21022h;

    /* renamed from: i */
    private AtomicInteger f21023i = new AtomicInteger(0);

    /* renamed from: j */
    private C10869i f21024j = new C10873b(this, (C10872a) null);

    /* renamed from: k */
    private volatile C10852a f21025k;

    /* renamed from: l */
    private long f21026l = -1;

    /* renamed from: m */
    private volatile C11115e.C11116a f21027m;

    /* renamed from: n */
    private long f21028n = System.currentTimeMillis();

    /* renamed from: o */
    private long f21029o = -1;

    /* renamed from: p */
    private int f21030p = -1;

    /* renamed from: q */
    private int f21031q = -1;

    /* renamed from: r */
    boolean f21032r;

    /* renamed from: s */
    boolean f21033s;

    /* renamed from: t */
    boolean f21034t;

    /* renamed from: h.a.a.a.k$a */
    class C10872a extends C11115e.C11116a {

        /* renamed from: g */
        final /* synthetic */ C10866h f21035g;

        C10872a(C10866h hVar) {
            this.f21035g = hVar;
        }

        /* renamed from: f */
        public void mo34200f() {
            C10871k.this.mo34325i(this.f21035g);
        }
    }

    /* renamed from: h.a.a.a.k$b */
    private class C10873b implements C10869i {
        private C10873b() {
        }

        /* synthetic */ C10873b(C10871k kVar, C10872a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo34208a(C10929e eVar) {
            C10871k.this.mo34231D(eVar);
        }

        /* renamed from: b */
        public void mo34209b(Throwable th) {
            try {
                C10871k.this.mo34291x(th);
            } finally {
                C10871k.this.m27233h();
            }
        }

        /* renamed from: c */
        public void mo34210c() {
            try {
                C10871k.this.mo34293z();
            } finally {
                C10871k.this.m27233h();
            }
        }

        /* renamed from: d */
        public void mo34211d() {
            C10871k.this.mo34297A();
        }

        /* renamed from: e */
        public void mo34212e() {
            try {
                C10871k.this.mo34290C();
                synchronized (C10871k.this) {
                    C10871k.this.f21033s = true;
                    C10871k.this.f21034t |= C10871k.this.f21032r;
                    if (C10871k.this.f21034t) {
                        C10871k.this.mo34324g();
                    }
                    C10871k.this.notifyAll();
                }
            } catch (Throwable th) {
                synchronized (C10871k.this) {
                    C10871k.this.f21033s = true;
                    C10871k.this.f21034t |= C10871k.this.f21032r;
                    if (C10871k.this.f21034t) {
                        C10871k.this.mo34324g();
                    }
                    C10871k.this.notifyAll();
                    throw th;
                }
            }
        }

        /* renamed from: f */
        public void mo34213f() {
            C10871k.this.mo34312U(true);
            try {
                C10871k.this.mo34232H();
            } catch (IOException e) {
                C10871k.f21014u.mo35487c(e);
            }
        }

        /* renamed from: g */
        public void mo34214g(C10929e eVar, int i, C10929e eVar2) {
            C10871k.this.mo34228G(eVar, i, eVar2);
        }

        /* renamed from: h */
        public void mo34215h(Throwable th) {
            try {
                C10871k.this.mo34292y(th);
            } finally {
                C10871k.this.m27233h();
            }
        }

        /* renamed from: i */
        public void mo34216i() {
            C10871k.this.mo34299F();
        }

        /* renamed from: j */
        public void mo34217j(C10929e eVar, C10929e eVar2) {
            C10871k.this.mo34227E(eVar, eVar2);
        }

        /* renamed from: k */
        public void mo34218k() {
            try {
                C10871k.this.mo34298B();
                synchronized (C10871k.this) {
                    C10871k.this.f21032r = true;
                    C10871k.this.f21034t |= C10871k.this.f21033s;
                    if (C10871k.this.f21034t) {
                        C10871k.this.mo34324g();
                    }
                    C10871k.this.notifyAll();
                }
            } catch (Throwable th) {
                synchronized (C10871k.this) {
                    C10871k.this.f21032r = true;
                    C10871k.this.f21034t |= C10871k.this.f21033s;
                    if (C10871k.this.f21034t) {
                        C10871k.this.mo34324g();
                    }
                    C10871k.this.notifyAll();
                    throw th;
                }
            }
        }
    }

    /* renamed from: Y */
    private boolean m27229Y(int i, int i2) {
        boolean compareAndSet = this.f21023i.compareAndSet(i2, i);
        if (compareAndSet) {
            mo34327k().mo34210c();
        }
        return compareAndSet;
    }

    /* renamed from: a */
    private void m27230a() {
        C10852a aVar = this.f21025k;
        if (aVar != null) {
            try {
                aVar.mo34189m();
            } catch (IOException e) {
                f21014u.mo35487c(e);
            } catch (Throwable th) {
                mo34324g();
                throw th;
            }
            mo34324g();
        }
    }

    /* renamed from: c0 */
    public static String m27232c0(int i) {
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
    public void m27233h() {
        synchronized (this) {
            mo34324g();
            this.f21034t = true;
            notifyAll();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo34297A() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo34298B() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo34290C() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo34231D(C10929e eVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo34227E(C10929e eVar, C10929e eVar2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo34299F() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo34228G(C10929e eVar, int i, C10929e eVar2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo34232H() {
        InputStream inputStream = this.f21022h;
        if (inputStream == null) {
            return;
        }
        if (inputStream.markSupported()) {
            this.f21021g = null;
            this.f21022h.reset();
            return;
        }
        throw new IOException("Unsupported retry attempt");
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public C10941m mo34300I(C10942n nVar) {
        return null;
    }

    /* renamed from: J */
    public void mo34301J() {
        synchronized (this) {
            this.f21027m = null;
            this.f21032r = false;
            this.f21033s = false;
            this.f21034t = false;
            mo34315X(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo34302K(C10866h hVar) {
        this.f21027m = new C10872a(hVar);
        C10862g h = hVar.mo34272h();
        long t = mo34336t();
        if (t > 0) {
            h.mo34252a1(this.f21027m, t);
        } else {
            h.mo34250Z0(this.f21027m);
        }
    }

    /* renamed from: L */
    public void mo34303L(C10857b bVar) {
        this.f21019e = bVar;
    }

    /* renamed from: M */
    public void mo34304M(C10869i iVar) {
        this.f21024j = iVar;
    }

    /* renamed from: N */
    public void mo34305N(String str) {
        this.f21015a = str;
    }

    /* renamed from: O */
    public void mo34306O(C10929e eVar) {
        this.f21021g = eVar;
    }

    /* renamed from: P */
    public void mo34307P(InputStream inputStream) {
        this.f21022h = inputStream;
        if (inputStream != null && inputStream.markSupported()) {
            this.f21022h.mark(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        }
    }

    /* renamed from: Q */
    public void mo34308Q(String str) {
        mo34332p().mo34458A(C10910l.f21157i, str);
    }

    /* renamed from: R */
    public void mo34309R(String str, String str2) {
        mo34332p().mo34484z(str, str2);
    }

    /* renamed from: S */
    public void mo34310S(C10929e eVar, C10929e eVar2) {
        mo34332p().mo34459B(eVar, eVar2);
    }

    /* renamed from: T */
    public void mo34311T(String str) {
        this.f21017c = str;
    }

    /* renamed from: U */
    public void mo34312U(boolean z) {
    }

    /* renamed from: V */
    public void mo34313V(String str) {
        C10929e eVar;
        if (str != null) {
            if ("http".equalsIgnoreCase(str)) {
                eVar = C10914o.f21188a;
            } else if ("https".equalsIgnoreCase(str)) {
                eVar = C10914o.f21189b;
            } else {
                mo34314W(new C10938k(str));
                return;
            }
            mo34314W(eVar);
        }
    }

    /* renamed from: W */
    public void mo34314W(C10929e eVar) {
        this.f21016b = eVar;
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
        r2 = m27229Y(r8, r1);
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
        throw new java.lang.IllegalStateException(m27232c0(r1) + " => " + m27232c0(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00ff, code lost:
        f21014u.mo35489e("setStatus {} {}", java.lang.Integer.valueOf(r8), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        return r2;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:51:0x009d=Splitter:B:51:0x009d, B:63:0x00bf=Splitter:B:63:0x00bf} */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo34315X(int r8) {
        /*
            r7 = this;
            r0 = 0
            java.util.concurrent.atomic.AtomicInteger r1 = r7.f21023i     // Catch:{ IOException -> 0x012a }
            int r1 = r1.get()     // Catch:{ IOException -> 0x012a }
            r2 = 3
            if (r1 == r8) goto L_0x001d
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x012a }
            long r5 = r7.f21028n     // Catch:{ IOException -> 0x012a }
            long r5 = r3 - r5
            int r6 = (int) r5     // Catch:{ IOException -> 0x012a }
            r7.f21031q = r6     // Catch:{ IOException -> 0x012a }
            r7.f21030p = r1     // Catch:{ IOException -> 0x012a }
            r7.f21028n = r3     // Catch:{ IOException -> 0x012a }
            if (r8 != r2) goto L_0x001d
            r7.f21029o = r3     // Catch:{ IOException -> 0x012a }
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
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f21023i     // Catch:{ IOException -> 0x012a }
            boolean r2 = r2.compareAndSet(r1, r8)     // Catch:{ IOException -> 0x012a }
            if (r2 == 0) goto L_0x00d9
            r7.m27233h()     // Catch:{ IOException -> 0x0111 }
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
            r7.m27233h()     // Catch:{ IOException -> 0x012a }
            goto L_0x0044
        L_0x004c:
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f21023i     // Catch:{ IOException -> 0x012a }
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
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f21023i     // Catch:{ IOException -> 0x012a }
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
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f21023i     // Catch:{ IOException -> 0x012a }
            goto L_0x004e
        L_0x0068:
            boolean r2 = r7.m27229Y(r8, r1)     // Catch:{ IOException -> 0x012a }
            goto L_0x00d9
        L_0x006e:
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f21023i     // Catch:{ IOException -> 0x012a }
            boolean r2 = r2.compareAndSet(r1, r8)     // Catch:{ IOException -> 0x012a }
            if (r2 == 0) goto L_0x00d9
            h.a.a.a.i r4 = r7.mo34327k()     // Catch:{ IOException -> 0x0111 }
            r4.mo34212e()     // Catch:{ IOException -> 0x0111 }
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
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f21023i     // Catch:{ IOException -> 0x012a }
            goto L_0x004e
        L_0x0086:
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f21023i     // Catch:{ IOException -> 0x012a }
            boolean r2 = r2.compareAndSet(r1, r8)     // Catch:{ IOException -> 0x012a }
            if (r2 == 0) goto L_0x00d9
            h.a.a.a.i r4 = r7.mo34327k()     // Catch:{ IOException -> 0x0111 }
            r4.mo34216i()     // Catch:{ IOException -> 0x0111 }
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
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f21023i     // Catch:{ IOException -> 0x012a }
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
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f21023i     // Catch:{ IOException -> 0x012a }
            goto L_0x004e
        L_0x00a9:
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f21023i     // Catch:{ IOException -> 0x012a }
            boolean r2 = r2.compareAndSet(r1, r8)     // Catch:{ IOException -> 0x012a }
            if (r2 == 0) goto L_0x00d9
            h.a.a.a.i r4 = r7.mo34327k()     // Catch:{ IOException -> 0x0111 }
            r4.mo34211d()     // Catch:{ IOException -> 0x0111 }
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
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f21023i     // Catch:{ IOException -> 0x012a }
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
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f21023i     // Catch:{ IOException -> 0x012a }
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
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f21023i     // Catch:{ IOException -> 0x012a }
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
            java.lang.String r1 = m27232c0(r1)     // Catch:{ IOException -> 0x0111 }
            r4.append(r1)     // Catch:{ IOException -> 0x0111 }
            r4.append(r3)     // Catch:{ IOException -> 0x0111 }
            java.lang.String r8 = m27232c0(r8)     // Catch:{ IOException -> 0x0111 }
            r4.append(r8)     // Catch:{ IOException -> 0x0111 }
            java.lang.String r8 = r4.toString()     // Catch:{ IOException -> 0x0111 }
            r0.<init>(r8)     // Catch:{ IOException -> 0x0111 }
            throw r0     // Catch:{ IOException -> 0x0111 }
        L_0x00ff:
            h.a.a.h.y.c r1 = f21014u     // Catch:{ IOException -> 0x0111 }
            java.lang.String r3 = "setStatus {} {}"
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x0111 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x0111 }
            r4[r0] = r8     // Catch:{ IOException -> 0x0111 }
            r4[r6] = r7     // Catch:{ IOException -> 0x0111 }
            r1.mo35489e(r3, r4)     // Catch:{ IOException -> 0x0111 }
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
            h.a.a.h.y.c r1 = f21014u
            r1.mo35495k(r8)
            r2 = r0
        L_0x0131:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p213a.C10871k.mo34315X(int):boolean");
    }

    /* renamed from: Z */
    public void mo34316Z(URI uri) {
        if (!uri.isAbsolute()) {
            throw new IllegalArgumentException("!Absolute URI: " + uri);
        } else if (!uri.isOpaque()) {
            if (f21014u.mo35485a()) {
                f21014u.mo35489e("URI = {}", uri.toASCIIString());
            }
            String scheme = uri.getScheme();
            int port = uri.getPort();
            if (port <= 0) {
                port = "https".equalsIgnoreCase(scheme) ? 443 : 80;
            }
            mo34313V(scheme);
            mo34303L(new C10857b(uri.getHost(), port));
            String d = new C10918r(uri).mo34421d();
            if (d == null) {
                d = MiotCloudImpl.COOKIE_PATH;
            }
            mo34311T(d);
        } else {
            throw new IllegalArgumentException("Opaque URI: " + uri);
        }
    }

    /* renamed from: a0 */
    public void mo34317a0(String str) {
        mo34316Z(URI.create(str));
    }

    /* renamed from: b0 */
    public void mo34318b0(int i) {
        this.f21018d = i;
    }

    /* renamed from: c */
    public void mo34319c(String str, String str2) {
        mo34332p().mo34467d(str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo34320d(C10852a aVar) {
        if (aVar.mo34605g().mo34367q() != null) {
            new C10857b(aVar.mo34605g().mo34367q(), aVar.mo34605g().mo34354f());
        }
        this.f21025k = aVar;
        if (mo34335s() == 10) {
            m27230a();
        }
    }

    /* renamed from: d0 */
    public int mo34321d0() {
        int i;
        synchronized (this) {
            while (!mo34340w()) {
                wait();
            }
            i = this.f21023i.get();
        }
        return i;
    }

    /* renamed from: e */
    public void mo34322e() {
        mo34315X(10);
        m27230a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo34323f(C10862g gVar) {
        C11115e.C11116a aVar = this.f21027m;
        if (aVar != null) {
            gVar.mo34234L0(aVar);
        }
        this.f21027m = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C10852a mo34324g() {
        C10852a aVar = this.f21025k;
        this.f21025k = null;
        if (mo34335s() == 10) {
            mo34315X(11);
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo34325i(C10866h hVar) {
        if (mo34335s() < 7) {
            mo34315X(8);
        }
        hVar.mo34269e(this);
        C10852a aVar = this.f21025k;
        if (aVar != null) {
            aVar.mo34191o(this);
        }
    }

    /* renamed from: j */
    public C10857b mo34326j() {
        return this.f21019e;
    }

    /* renamed from: k */
    public C10869i mo34327k() {
        return this.f21024j;
    }

    /* renamed from: l */
    public String mo34328l() {
        return this.f21015a;
    }

    /* renamed from: m */
    public C10929e mo34329m() {
        return this.f21021g;
    }

    /* renamed from: n */
    public C10929e mo34330n(C10929e eVar) {
        synchronized (this) {
            if (this.f21022h != null) {
                if (eVar == null) {
                    eVar = new C10938k(8192);
                }
                int read = this.f21022h.read(eVar.mo34608e0(), eVar.mo34562S0(), eVar.mo34558I0());
                if (read >= 0) {
                    eVar.mo34575f0(eVar.mo34562S0() + read);
                    return eVar;
                }
            }
            return null;
        }
    }

    /* renamed from: o */
    public InputStream mo34331o() {
        return this.f21022h;
    }

    /* renamed from: p */
    public C10897i mo34332p() {
        return this.f21020f;
    }

    /* renamed from: q */
    public String mo34333q() {
        return this.f21017c;
    }

    /* renamed from: r */
    public C10929e mo34334r() {
        return this.f21016b;
    }

    /* renamed from: s */
    public int mo34335s() {
        return this.f21023i.get();
    }

    /* renamed from: t */
    public long mo34336t() {
        return this.f21026l;
    }

    public String toString() {
        String str;
        String c0 = m27232c0(mo34335s());
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.f21028n;
        if (this.f21030p >= 0) {
            str = String.format("%s@%x=%s//%s%s#%s(%dms)->%s(%dms)", new Object[]{getClass().getSimpleName(), Integer.valueOf(hashCode()), this.f21015a, this.f21019e, this.f21017c, m27232c0(this.f21030p), Integer.valueOf(this.f21031q), c0, Long.valueOf(j)});
        } else {
            str = String.format("%s@%x=%s//%s%s#%s(%dms)", new Object[]{getClass().getSimpleName(), Integer.valueOf(hashCode()), this.f21015a, this.f21019e, this.f21017c, c0, Long.valueOf(j)});
        }
        if (mo34335s() < 3 || this.f21029o <= 0) {
            return str;
        }
        return str + "sent=" + (currentTimeMillis - this.f21029o) + "ms";
    }

    @Deprecated
    /* renamed from: u */
    public String mo34338u() {
        return mo34333q();
    }

    /* renamed from: v */
    public int mo34339v() {
        return this.f21018d;
    }

    /* renamed from: w */
    public boolean mo34340w() {
        boolean z;
        synchronized (this) {
            z = this.f21034t;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo34291x(Throwable th) {
        C11158c cVar = f21014u;
        cVar.mo35492h("CONNECTION FAILED " + this, th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo34292y(Throwable th) {
        C11158c cVar = f21014u;
        cVar.mo35492h("EXCEPTION " + this, th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo34293z() {
        C11158c cVar = f21014u;
        cVar.mo35486b("EXPIRED " + this, new Object[0]);
    }
}

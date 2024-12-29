package p164h.p211a.p212a.p216c;

import androidx.appcompat.widget.ActivityChooserView;
import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.io.InterruptedIOException;
import org.apache.commons.p271io.IOUtils;
import p164h.p211a.p212a.p216c.C10897i;
import p164h.p211a.p212a.p216c.C10915p;
import p164h.p211a.p212a.p217d.C10929e;
import p164h.p211a.p212a.p217d.C10931f;
import p164h.p211a.p212a.p217d.C10934h;
import p164h.p211a.p212a.p217d.C10935i;
import p164h.p211a.p212a.p217d.C10938k;
import p164h.p211a.p212a.p217d.C10942n;
import p164h.p211a.p212a.p217d.C10943o;
import p164h.p211a.p212a.p228h.C11137q;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.c.j */
public class C10906j extends C10889a {

    /* renamed from: A */
    private static final byte[] f21132A = {48, ParameterInitDefType.IntVec3Init, 10, ParameterInitDefType.IntVec3Init, 10};

    /* renamed from: B */
    private static final byte[] f21133B = C11137q.m28920c("Content-Length: 0\r\n");

    /* renamed from: C */
    private static final byte[] f21134C = C11137q.m28920c("Connection: keep-alive\r\n");

    /* renamed from: D */
    private static final byte[] f21135D = C11137q.m28920c("Connection: close\r\n");

    /* renamed from: E */
    private static final byte[] f21136E = C11137q.m28920c("Connection: ");

    /* renamed from: F */
    private static final byte[] f21137F = C11137q.m28920c(IOUtils.LINE_SEPARATOR_WINDOWS);

    /* renamed from: G */
    private static final byte[] f21138G = C11137q.m28920c("Transfer-Encoding: chunked\r\n");

    /* renamed from: H */
    private static byte[] f21139H = C11137q.m28920c("Server: Jetty(7.0.x)\r\n");

    /* renamed from: y */
    private static final C11158c f21140y = C11156b.m29015a(C10906j.class);

    /* renamed from: z */
    private static final C10908b[] f21141z = new C10908b[508];

    /* renamed from: u */
    protected boolean f21142u = false;

    /* renamed from: v */
    private boolean f21143v = false;

    /* renamed from: w */
    private boolean f21144w = false;

    /* renamed from: x */
    private boolean f21145x = false;

    /* renamed from: h.a.a.c.j$b */
    private static class C10908b {

        /* renamed from: a */
        C10929e f21146a;

        /* renamed from: b */
        C10929e f21147b;

        /* renamed from: c */
        C10929e f21148c;

        private C10908b() {
        }
    }

    static {
        int length = C10919s.f21259c.length();
        for (int i = 0; i < f21141z.length; i++) {
            C10915p.C10916a a = C10915p.m27534a(i);
            if (a != null) {
                String b = a.mo34532b();
                int i2 = length + 5;
                int length2 = b.length() + i2 + 2;
                byte[] bArr = new byte[length2];
                C10919s.f21259c.mo34610x0(0, bArr, 0, length);
                bArr[length + 0] = 32;
                bArr[length + 1] = (byte) ((i / 100) + 48);
                bArr[length + 2] = (byte) (((i % 100) / 10) + 48);
                bArr[length + 3] = (byte) ((i % 10) + 48);
                bArr[length + 4] = 32;
                for (int i3 = 0; i3 < b.length(); i3++) {
                    bArr[i2 + i3] = (byte) b.charAt(i3);
                }
                bArr[b.length() + i2] = ParameterInitDefType.IntVec3Init;
                bArr[length + 6 + b.length()] = 10;
                f21141z[i] = new C10908b();
                f21141z[i].f21146a = new C10938k(bArr, i2, (length2 - length) - 7, 0);
                f21141z[i].f21147b = new C10938k(bArr, 0, i2, 0);
                f21141z[i].f21148c = new C10938k(bArr, 0, length2, 0);
            }
        }
    }

    public C10906j(C10935i iVar, C10942n nVar) {
        super(iVar, nVar);
    }

    /* renamed from: E */
    private int m27496E() {
        C10929e eVar;
        C10929e eVar2 = this.f21077o;
        int i = 0;
        int i2 = (eVar2 == null || eVar2.length() <= 0) ? 0 : 4;
        C10929e eVar3 = this.f21078p;
        int i3 = i2 | ((eVar3 == null || eVar3.length() <= 0) ? 0 : 2);
        if (this.f21142u && (eVar = this.f21079q) != null && eVar.length() > 0) {
            i = 1;
        }
        return i3 | i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0185  */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m27497H() {
        /*
            r8 = this;
            boolean r0 = r8.f21145x
            r1 = 0
            if (r0 != 0) goto L_0x0198
            boolean r0 = r8.f21142u
            if (r0 != 0) goto L_0x0034
            h.a.a.d.e r0 = r8.f21079q
            if (r0 == 0) goto L_0x0034
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0034
            h.a.a.d.e r0 = r8.f21078p
            if (r0 == 0) goto L_0x0034
            int r0 = r0.mo34558I0()
            if (r0 <= 0) goto L_0x0034
            h.a.a.d.e r0 = r8.f21078p
            h.a.a.d.e r2 = r8.f21079q
            int r0 = r0.mo34567Z(r2)
            h.a.a.d.e r2 = r8.f21079q
            r2.mo34591u0(r0)
            h.a.a.d.e r0 = r8.f21079q
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0034
            r8.f21079q = r1
        L_0x0034:
            long r2 = r8.f21072j
            r4 = -2
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0198
            boolean r0 = r8.f21142u
            java.lang.String r2 = "EOC"
            r3 = 1
            r4 = 0
            r5 = 2
            if (r0 == 0) goto L_0x0091
            h.a.a.d.e r0 = r8.f21078p
            if (r0 == 0) goto L_0x004f
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0091
        L_0x004f:
            h.a.a.d.e r0 = r8.f21079q
            if (r0 == 0) goto L_0x0091
            int r0 = r0.length()
            r8.f21145x = r3
            h.a.a.d.e r6 = r8.f21077o
            if (r6 != 0) goto L_0x0065
            h.a.a.d.i r6 = r8.f21063a
            h.a.a.d.e r6 = r6.mo34626c()
            r8.f21077o = r6
        L_0x0065:
            boolean r6 = r8.f21143v
            if (r6 == 0) goto L_0x0081
            h.a.a.d.e r6 = r8.f21077o
            int r6 = r6.length()
            if (r6 > 0) goto L_0x007b
            h.a.a.d.e r2 = r8.f21077o
            byte[] r6 = p164h.p211a.p212a.p216c.C10917q.f21241a
            r2.mo34586n0(r6)
            r8.f21143v = r4
            goto L_0x0081
        L_0x007b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0081:
            h.a.a.d.e r2 = r8.f21077o
            p164h.p211a.p212a.p217d.C10934h.m27669e(r2, r0)
            h.a.a.d.e r0 = r8.f21077o
            byte[] r2 = p164h.p211a.p212a.p216c.C10917q.f21241a
            r0.mo34586n0(r2)
        L_0x008d:
            r8.f21143v = r3
            goto L_0x0122
        L_0x0091:
            h.a.a.d.e r0 = r8.f21078p
            if (r0 == 0) goto L_0x0122
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0122
            r8.f21145x = r3
            h.a.a.d.e r6 = r8.f21078p
            int r6 = r6.getIndex()
            r7 = 12
            if (r6 != r7) goto L_0x00df
            h.a.a.d.e r2 = r8.f21078p
            int r6 = r2.getIndex()
            int r6 = r6 - r5
            byte[] r7 = p164h.p211a.p212a.p216c.C10917q.f21241a
            r2.mo34580h(r6, r7, r4, r5)
            h.a.a.d.e r2 = r8.f21078p
            int r6 = r2.getIndex()
            int r6 = r6 - r5
            r2.mo34592v0(r6)
            h.a.a.d.e r2 = r8.f21078p
            p164h.p211a.p212a.p217d.C10934h.m27666b(r2, r0)
            boolean r0 = r8.f21143v
            if (r0 == 0) goto L_0x0113
            h.a.a.d.e r0 = r8.f21078p
            int r2 = r0.getIndex()
            int r2 = r2 - r5
            byte[] r6 = p164h.p211a.p212a.p216c.C10917q.f21241a
            r0.mo34580h(r2, r6, r4, r5)
            h.a.a.d.e r0 = r8.f21078p
            int r2 = r0.getIndex()
            int r2 = r2 - r5
            r0.mo34592v0(r2)
            r8.f21143v = r4
            goto L_0x0113
        L_0x00df:
            h.a.a.d.e r6 = r8.f21077o
            if (r6 != 0) goto L_0x00eb
            h.a.a.d.i r6 = r8.f21063a
            h.a.a.d.e r6 = r6.mo34626c()
            r8.f21077o = r6
        L_0x00eb:
            boolean r6 = r8.f21143v
            if (r6 == 0) goto L_0x0107
            h.a.a.d.e r6 = r8.f21077o
            int r6 = r6.length()
            if (r6 > 0) goto L_0x0101
            h.a.a.d.e r2 = r8.f21077o
            byte[] r6 = p164h.p211a.p212a.p216c.C10917q.f21241a
            r2.mo34586n0(r6)
            r8.f21143v = r4
            goto L_0x0107
        L_0x0101:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0107:
            h.a.a.d.e r2 = r8.f21077o
            p164h.p211a.p212a.p217d.C10934h.m27669e(r2, r0)
            h.a.a.d.e r0 = r8.f21077o
            byte[] r2 = p164h.p211a.p212a.p216c.C10917q.f21241a
            r0.mo34586n0(r2)
        L_0x0113:
            h.a.a.d.e r0 = r8.f21078p
            int r0 = r0.mo34558I0()
            if (r0 < r5) goto L_0x008d
            h.a.a.d.e r0 = r8.f21078p
            byte[] r2 = p164h.p211a.p212a.p216c.C10917q.f21241a
            r0.mo34586n0(r2)
        L_0x0122:
            boolean r0 = r8.f21144w
            if (r0 == 0) goto L_0x0198
            h.a.a.d.e r0 = r8.f21079q
            if (r0 == 0) goto L_0x0130
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0198
        L_0x0130:
            boolean r0 = r8.f21143v
            if (r0 == 0) goto L_0x015c
            h.a.a.d.e r0 = r8.f21078p
            if (r0 != 0) goto L_0x014a
            h.a.a.d.e r0 = r8.f21077o
            int r0 = r0.mo34558I0()
            if (r0 < r5) goto L_0x014a
            h.a.a.d.e r0 = r8.f21077o
            byte[] r2 = p164h.p211a.p212a.p216c.C10917q.f21241a
            r0.mo34586n0(r2)
        L_0x0147:
            r8.f21143v = r4
            goto L_0x015c
        L_0x014a:
            h.a.a.d.e r0 = r8.f21078p
            if (r0 == 0) goto L_0x015c
            int r0 = r0.mo34558I0()
            if (r0 < r5) goto L_0x015c
            h.a.a.d.e r0 = r8.f21078p
            byte[] r2 = p164h.p211a.p212a.p216c.C10917q.f21241a
            r0.mo34586n0(r2)
            goto L_0x0147
        L_0x015c:
            boolean r0 = r8.f21143v
            if (r0 != 0) goto L_0x0198
            boolean r0 = r8.f21144w
            if (r0 == 0) goto L_0x0198
            h.a.a.d.e r0 = r8.f21078p
            if (r0 != 0) goto L_0x0181
            h.a.a.d.e r0 = r8.f21077o
            int r0 = r0.mo34558I0()
            byte[] r2 = f21132A
            int r5 = r2.length
            if (r0 < r5) goto L_0x0181
            boolean r0 = r8.f21074l
            if (r0 != 0) goto L_0x017e
            h.a.a.d.e r0 = r8.f21077o
            r0.mo34586n0(r2)
        L_0x017c:
            r8.f21145x = r3
        L_0x017e:
            r8.f21144w = r4
            goto L_0x0198
        L_0x0181:
            h.a.a.d.e r0 = r8.f21078p
            if (r0 == 0) goto L_0x0198
            int r0 = r0.mo34558I0()
            byte[] r2 = f21132A
            int r5 = r2.length
            if (r0 < r5) goto L_0x0198
            boolean r0 = r8.f21074l
            if (r0 != 0) goto L_0x017e
            h.a.a.d.e r0 = r8.f21078p
            r0.mo34586n0(r2)
            goto L_0x017c
        L_0x0198:
            h.a.a.d.e r0 = r8.f21079q
            if (r0 == 0) goto L_0x01a4
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01a4
            r8.f21079q = r1
        L_0x01a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p216c.C10906j.m27497H():void");
    }

    /* renamed from: K */
    public static void m27498K(String str) {
        f21139H = C11137q.m28920c("Server: Jetty(" + str + ")\r\n");
    }

    /* renamed from: C */
    public int mo34390C() {
        if (this.f21075m || this.f21073k || this.f21065c == 4) {
            return -1;
        }
        C10929e eVar = this.f21079q;
        if ((eVar != null && eVar.length() > 0) || this.f21145x) {
            mo34402j();
            if ((eVar != null && eVar.length() > 0) || this.f21145x) {
                throw new IllegalStateException("FULL");
            }
        }
        if (this.f21078p == null) {
            this.f21078p = this.f21063a.mo34624a();
        }
        this.f21071i -= (long) this.f21078p.length();
        if (this.f21074l) {
            return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        return this.f21078p.mo34558I0() - (this.f21072j == -2 ? 12 : 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f21078p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r0 = r1.f21079q;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo34508F() {
        /*
            r1 = this;
            h.a.a.d.e r0 = r1.f21077o
            if (r0 == 0) goto L_0x000a
            int r0 = r0.length()
            if (r0 != 0) goto L_0x001f
        L_0x000a:
            h.a.a.d.e r0 = r1.f21078p
            if (r0 == 0) goto L_0x0014
            int r0 = r0.length()
            if (r0 != 0) goto L_0x001f
        L_0x0014:
            h.a.a.d.e r0 = r1.f21079q
            if (r0 == 0) goto L_0x0021
            int r0 = r0.length()
            if (r0 != 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r0 = 0
            goto L_0x0022
        L_0x0021:
            r0 = 1
        L_0x0022:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p216c.C10906j.mo34508F():boolean");
    }

    /* renamed from: G */
    public boolean mo34509G() {
        return this.f21069g == null;
    }

    /* renamed from: I */
    public void mo34510I(int i) {
        if (this.f21065c == 0) {
            if (i < 100 || i > 199) {
                throw new IllegalArgumentException("!1xx");
            }
            C10908b bVar = f21141z[i];
            if (bVar != null) {
                if (this.f21077o == null) {
                    this.f21077o = this.f21063a.mo34626c();
                }
                this.f21077o.mo34567Z(bVar.f21148c);
                this.f21077o.mo34586n0(C10917q.f21241a);
                while (this.f21077o.length() > 0) {
                    try {
                        int u = this.f21064b.mo34372u(this.f21077o);
                        if (u < 0) {
                            throw new C10943o();
                        } else if (u == 0) {
                            Thread.sleep(100);
                        }
                    } catch (InterruptedException e) {
                        f21140y.mo35487c(e);
                        throw new InterruptedIOException(e.toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException(i + "?");
        }
    }

    /* renamed from: J */
    public void mo34511J(C10929e eVar) {
        C10929e eVar2;
        if (this.f21075m || this.f21065c != 0 || (((eVar2 = this.f21079q) != null && eVar2.length() > 0) || this.f21145x || this.f21074l)) {
            throw new IllegalStateException();
        }
        this.f21073k = true;
        this.f21079q = eVar;
        this.f21142u = true;
        this.f21065c = 3;
        long length = (long) eVar.length();
        this.f21071i = length;
        this.f21072j = length;
    }

    public void complete() {
        if (this.f21065c != 4) {
            super.complete();
            if (this.f21065c < 3) {
                this.f21065c = 3;
                if (this.f21072j == -2) {
                    this.f21144w = true;
                }
            }
            mo34402j();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        r0 = r0.mo34366p(r5, r6, (p164h.p211a.p212a.p217d.C10929e) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005c, code lost:
        r0 = r0.mo34372u(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0101, code lost:
        if (r0 <= 0) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0103, code lost:
        r3 = r3 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0104, code lost:
        r4 = m27496E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0108, code lost:
        if (r0 > 0) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x010a, code lost:
        if (r4 == 0) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x010c, code lost:
        if (r2 == 0) goto L_0x010f;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo34402j() {
        /*
            r10 = this;
            int r0 = r10.f21065c     // Catch:{ IOException -> 0x011a }
            if (r0 == 0) goto L_0x0112
            r10.m27497H()     // Catch:{ IOException -> 0x011a }
            h.a.a.d.n r0 = r10.f21064b     // Catch:{ IOException -> 0x011a }
            r1 = 0
            if (r0 != 0) goto L_0x0033
            boolean r0 = r10.f21143v     // Catch:{ IOException -> 0x011a }
            if (r0 == 0) goto L_0x001b
            h.a.a.d.e r0 = r10.f21078p     // Catch:{ IOException -> 0x011a }
            if (r0 == 0) goto L_0x001b
            h.a.a.d.e r0 = r10.f21078p     // Catch:{ IOException -> 0x011a }
            byte[] r2 = p164h.p211a.p212a.p216c.C10917q.f21241a     // Catch:{ IOException -> 0x011a }
            r0.mo34586n0(r2)     // Catch:{ IOException -> 0x011a }
        L_0x001b:
            boolean r0 = r10.f21144w     // Catch:{ IOException -> 0x011a }
            if (r0 == 0) goto L_0x002e
            h.a.a.d.e r0 = r10.f21078p     // Catch:{ IOException -> 0x011a }
            if (r0 == 0) goto L_0x002e
            boolean r0 = r10.f21074l     // Catch:{ IOException -> 0x011a }
            if (r0 != 0) goto L_0x002e
            h.a.a.d.e r0 = r10.f21078p     // Catch:{ IOException -> 0x011a }
            byte[] r2 = f21132A     // Catch:{ IOException -> 0x011a }
            r0.mo34586n0(r2)     // Catch:{ IOException -> 0x011a }
        L_0x002e:
            r10.f21143v = r1     // Catch:{ IOException -> 0x011a }
            r10.f21144w = r1     // Catch:{ IOException -> 0x011a }
            return r1
        L_0x0033:
            r0 = -1
            int r2 = r10.m27496E()     // Catch:{ IOException -> 0x011a }
            r3 = 0
        L_0x0039:
            r4 = 0
            switch(r2) {
                case 0: goto L_0x0073;
                case 1: goto L_0x006e;
                case 2: goto L_0x0069;
                case 3: goto L_0x0062;
                case 4: goto L_0x0058;
                case 5: goto L_0x0051;
                case 6: goto L_0x0045;
                case 7: goto L_0x003f;
                default: goto L_0x003d;
            }     // Catch:{ IOException -> 0x011a }
        L_0x003d:
            goto L_0x0101
        L_0x003f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x011a }
            r0.<init>()     // Catch:{ IOException -> 0x011a }
            throw r0     // Catch:{ IOException -> 0x011a }
        L_0x0045:
            h.a.a.d.n r0 = r10.f21064b     // Catch:{ IOException -> 0x011a }
            h.a.a.d.e r5 = r10.f21077o     // Catch:{ IOException -> 0x011a }
            h.a.a.d.e r6 = r10.f21078p     // Catch:{ IOException -> 0x011a }
        L_0x004b:
            int r0 = r0.mo34366p(r5, r6, r4)     // Catch:{ IOException -> 0x011a }
            goto L_0x0101
        L_0x0051:
            h.a.a.d.n r0 = r10.f21064b     // Catch:{ IOException -> 0x011a }
            h.a.a.d.e r5 = r10.f21077o     // Catch:{ IOException -> 0x011a }
            h.a.a.d.e r6 = r10.f21079q     // Catch:{ IOException -> 0x011a }
            goto L_0x004b
        L_0x0058:
            h.a.a.d.n r0 = r10.f21064b     // Catch:{ IOException -> 0x011a }
            h.a.a.d.e r4 = r10.f21077o     // Catch:{ IOException -> 0x011a }
        L_0x005c:
            int r0 = r0.mo34372u(r4)     // Catch:{ IOException -> 0x011a }
            goto L_0x0101
        L_0x0062:
            h.a.a.d.n r0 = r10.f21064b     // Catch:{ IOException -> 0x011a }
            h.a.a.d.e r5 = r10.f21078p     // Catch:{ IOException -> 0x011a }
            h.a.a.d.e r6 = r10.f21079q     // Catch:{ IOException -> 0x011a }
            goto L_0x004b
        L_0x0069:
            h.a.a.d.n r0 = r10.f21064b     // Catch:{ IOException -> 0x011a }
            h.a.a.d.e r4 = r10.f21078p     // Catch:{ IOException -> 0x011a }
            goto L_0x005c
        L_0x006e:
            h.a.a.d.n r0 = r10.f21064b     // Catch:{ IOException -> 0x011a }
            h.a.a.d.e r4 = r10.f21079q     // Catch:{ IOException -> 0x011a }
            goto L_0x005c
        L_0x0073:
            h.a.a.d.e r0 = r10.f21077o     // Catch:{ IOException -> 0x011a }
            if (r0 == 0) goto L_0x007c
            h.a.a.d.e r0 = r10.f21077o     // Catch:{ IOException -> 0x011a }
            r0.clear()     // Catch:{ IOException -> 0x011a }
        L_0x007c:
            r10.f21142u = r1     // Catch:{ IOException -> 0x011a }
            r10.f21145x = r1     // Catch:{ IOException -> 0x011a }
            h.a.a.d.e r0 = r10.f21078p     // Catch:{ IOException -> 0x011a }
            r5 = 3
            if (r0 == 0) goto L_0x00c2
            h.a.a.d.e r0 = r10.f21078p     // Catch:{ IOException -> 0x011a }
            r0.clear()     // Catch:{ IOException -> 0x011a }
            long r6 = r10.f21072j     // Catch:{ IOException -> 0x011a }
            r8 = -2
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x00c2
            h.a.a.d.e r0 = r10.f21078p     // Catch:{ IOException -> 0x011a }
            r6 = 12
            r0.mo34575f0(r6)     // Catch:{ IOException -> 0x011a }
            h.a.a.d.e r0 = r10.f21078p     // Catch:{ IOException -> 0x011a }
            r0.mo34592v0(r6)     // Catch:{ IOException -> 0x011a }
            h.a.a.d.e r0 = r10.f21079q     // Catch:{ IOException -> 0x011a }
            if (r0 == 0) goto L_0x00c2
            h.a.a.d.e r0 = r10.f21079q     // Catch:{ IOException -> 0x011a }
            int r0 = r0.length()     // Catch:{ IOException -> 0x011a }
            h.a.a.d.e r6 = r10.f21078p     // Catch:{ IOException -> 0x011a }
            int r6 = r6.mo34558I0()     // Catch:{ IOException -> 0x011a }
            if (r0 >= r6) goto L_0x00c2
            int r0 = r10.f21065c     // Catch:{ IOException -> 0x011a }
            if (r0 == r5) goto L_0x00c2
            h.a.a.d.e r0 = r10.f21078p     // Catch:{ IOException -> 0x011a }
            h.a.a.d.e r6 = r10.f21079q     // Catch:{ IOException -> 0x011a }
            r0.mo34567Z(r6)     // Catch:{ IOException -> 0x011a }
            h.a.a.d.e r0 = r10.f21079q     // Catch:{ IOException -> 0x011a }
            r0.clear()     // Catch:{ IOException -> 0x011a }
            r10.f21079q = r4     // Catch:{ IOException -> 0x011a }
        L_0x00c2:
            boolean r0 = r10.f21143v     // Catch:{ IOException -> 0x011a }
            if (r0 != 0) goto L_0x00fd
            boolean r0 = r10.f21144w     // Catch:{ IOException -> 0x011a }
            if (r0 != 0) goto L_0x00fd
            h.a.a.d.e r0 = r10.f21079q     // Catch:{ IOException -> 0x011a }
            if (r0 == 0) goto L_0x00d6
            h.a.a.d.e r0 = r10.f21079q     // Catch:{ IOException -> 0x011a }
            int r0 = r0.length()     // Catch:{ IOException -> 0x011a }
            if (r0 != 0) goto L_0x00fd
        L_0x00d6:
            int r0 = r10.f21065c     // Catch:{ IOException -> 0x011a }
            r4 = 4
            if (r0 != r5) goto L_0x00dd
            r10.f21065c = r4     // Catch:{ IOException -> 0x011a }
        L_0x00dd:
            int r0 = r10.f21065c     // Catch:{ IOException -> 0x011a }
            if (r0 != r4) goto L_0x0100
            java.lang.Boolean r0 = r10.f21076n     // Catch:{ IOException -> 0x011a }
            if (r0 == 0) goto L_0x0100
            java.lang.Boolean r0 = r10.f21076n     // Catch:{ IOException -> 0x011a }
            boolean r0 = r0.booleanValue()     // Catch:{ IOException -> 0x011a }
            if (r0 != 0) goto L_0x0100
            int r0 = r10.f21066d     // Catch:{ IOException -> 0x011a }
            r4 = 100
            if (r0 == r4) goto L_0x0100
            h.a.a.d.e r0 = r10.f21069g     // Catch:{ IOException -> 0x011a }
            if (r0 != 0) goto L_0x0100
            h.a.a.d.n r0 = r10.f21064b     // Catch:{ IOException -> 0x011a }
            r0.mo34370t()     // Catch:{ IOException -> 0x011a }
            goto L_0x0100
        L_0x00fd:
            r10.m27497H()     // Catch:{ IOException -> 0x011a }
        L_0x0100:
            r0 = 0
        L_0x0101:
            if (r0 <= 0) goto L_0x0104
            int r3 = r3 + r0
        L_0x0104:
            int r4 = r10.m27496E()     // Catch:{ IOException -> 0x011a }
            if (r0 > 0) goto L_0x010f
            if (r4 == 0) goto L_0x010e
            if (r2 == 0) goto L_0x010f
        L_0x010e:
            return r3
        L_0x010f:
            r2 = r4
            goto L_0x0039
        L_0x0112:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x011a }
            java.lang.String r1 = "State==HEADER"
            r0.<init>(r1)     // Catch:{ IOException -> 0x011a }
            throw r0     // Catch:{ IOException -> 0x011a }
        L_0x011a:
            r0 = move-exception
            h.a.a.h.y.c r1 = f21140y
            r1.mo35488d(r0)
            boolean r1 = r0 instanceof p164h.p211a.p212a.p217d.C10943o
            if (r1 == 0) goto L_0x0125
            goto L_0x012b
        L_0x0125:
            h.a.a.d.o r1 = new h.a.a.d.o
            r1.<init>((java.lang.Throwable) r0)
            r0 = r1
        L_0x012b:
            goto L_0x012d
        L_0x012c:
            throw r0
        L_0x012d:
            goto L_0x012c
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p216c.C10906j.mo34402j():int");
    }

    /* renamed from: l */
    public void mo34404l(C10897i iVar, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C10897i.C10905h hVar;
        StringBuilder sb;
        C10897i.C10905h hVar2;
        long j;
        int i;
        int i2;
        C10929e eVar;
        C10897i iVar2 = iVar;
        if (this.f21065c == 0) {
            if (mo34509G() && this.f21066d == 0) {
                throw new C10943o();
            } else if (!this.f21073k || z) {
                this.f21073k |= z;
                if (this.f21077o == null) {
                    this.f21077o = this.f21063a.mo34626c();
                }
                try {
                    int i3 = 48;
                    boolean z6 = false;
                    int i4 = 1;
                    if (mo34418z()) {
                        this.f21076n = Boolean.TRUE;
                        if (this.f21067e == 9) {
                            this.f21072j = 0;
                            this.f21077o.mo34567Z(this.f21069g);
                            this.f21077o.mo34560Q0((byte) 32);
                            this.f21077o.mo34586n0(this.f21070h.getBytes("UTF-8"));
                            this.f21077o.mo34586n0(C10917q.f21241a);
                            this.f21065c = 3;
                            this.f21075m = true;
                            return;
                        }
                        this.f21077o.mo34567Z(this.f21069g);
                        this.f21077o.mo34560Q0((byte) 32);
                        this.f21077o.mo34586n0(this.f21070h.getBytes("UTF-8"));
                        this.f21077o.mo34560Q0((byte) 32);
                        this.f21077o.mo34567Z(this.f21067e == 10 ? C10919s.f21258b : C10919s.f21259c);
                        this.f21077o.mo34586n0(C10917q.f21241a);
                    } else if (this.f21067e == 9) {
                        this.f21076n = Boolean.FALSE;
                        this.f21072j = -1;
                        this.f21065c = 2;
                        return;
                    } else {
                        if (this.f21076n == null) {
                            this.f21076n = Boolean.valueOf(this.f21067e > 10);
                        }
                        C10908b bVar = this.f21066d < f21141z.length ? f21141z[this.f21066d] : null;
                        if (bVar == null) {
                            this.f21077o.mo34567Z(C10919s.f21259c);
                            this.f21077o.mo34560Q0((byte) 32);
                            this.f21077o.mo34560Q0((byte) ((this.f21066d / 100) + 48));
                            this.f21077o.mo34560Q0((byte) (((this.f21066d % 100) / 10) + 48));
                            this.f21077o.mo34560Q0((byte) ((this.f21066d % 10) + 48));
                            this.f21077o.mo34560Q0((byte) 32);
                            if (this.f21068f == null) {
                                this.f21077o.mo34560Q0((byte) ((this.f21066d / 100) + 48));
                                this.f21077o.mo34560Q0((byte) (((this.f21066d % 100) / 10) + 48));
                                this.f21077o.mo34560Q0((byte) ((this.f21066d % 10) + 48));
                            } else {
                                this.f21077o.mo34567Z(this.f21068f);
                            }
                            this.f21077o.mo34586n0(C10917q.f21241a);
                        } else if (this.f21068f == null) {
                            this.f21077o.mo34567Z(bVar.f21148c);
                        } else {
                            this.f21077o.mo34567Z(bVar.f21147b);
                            this.f21077o.mo34567Z(this.f21068f);
                            this.f21077o.mo34586n0(C10917q.f21241a);
                        }
                        if (this.f21066d < 200 && this.f21066d >= 100) {
                            this.f21075m = true;
                            this.f21079q = null;
                            if (this.f21078p != null) {
                                this.f21078p.clear();
                            }
                            if (this.f21066d != 101) {
                                this.f21077o.mo34586n0(C10917q.f21241a);
                                this.f21065c = 2;
                                return;
                            }
                        } else if (this.f21066d == 204 || this.f21066d == 304) {
                            this.f21075m = true;
                            this.f21079q = null;
                            if (this.f21078p != null) {
                                this.f21078p.clear();
                            }
                        }
                    }
                    if (this.f21066d >= 200 && this.f21080r != null) {
                        this.f21077o.mo34567Z(C10910l.f21156h);
                        this.f21077o.mo34560Q0((byte) 58);
                        this.f21077o.mo34560Q0((byte) 32);
                        this.f21077o.mo34567Z(this.f21080r);
                        this.f21077o.mo34586n0(f21137F);
                    }
                    int i5 = 11;
                    if (iVar2 != null) {
                        int I = iVar.mo34466I();
                        sb = null;
                        int i6 = 0;
                        C10897i.C10905h hVar3 = null;
                        z5 = false;
                        C10897i.C10905h hVar4 = null;
                        z4 = false;
                        z3 = false;
                        z2 = false;
                        while (i6 < I) {
                            C10897i.C10905h o = iVar2.mo34474o(i6);
                            if (o != null) {
                                int g = o.mo34502g();
                                if (g != i4) {
                                    if (g == 5) {
                                        i = I;
                                        i2 = i6;
                                        if (this.f21067e == i5) {
                                            hVar4 = o;
                                        }
                                    } else if (g == 12) {
                                        i2 = i6;
                                        long e = o.mo34500e();
                                        this.f21072j = e;
                                        i = I;
                                        if (e >= this.f21071i) {
                                            if (!this.f21073k || e == this.f21071i) {
                                                hVar3 = o;
                                                eVar = this.f21077o;
                                            }
                                        }
                                        hVar3 = null;
                                        eVar = this.f21077o;
                                    } else if (g == 16) {
                                        if (C10934h.m27665a(C10920t.f21263d, o.mo34504i())) {
                                            i2 = i6;
                                            this.f21072j = -4;
                                        } else {
                                            i2 = i6;
                                        }
                                        o.mo34506k(this.f21077o);
                                        i = I;
                                        z5 = true;
                                    } else if (g != i3) {
                                        o.mo34506k(this.f21077o);
                                    } else if (mo34414v()) {
                                        o.mo34506k(this.f21077o);
                                        i = I;
                                        i2 = i6;
                                        z2 = true;
                                    }
                                    i6 = i2 + 1;
                                    I = i;
                                    i4 = 1;
                                    i5 = 11;
                                    i3 = 48;
                                } else {
                                    i = I;
                                    i2 = i6;
                                    if (mo34418z()) {
                                        o.mo34506k(this.f21077o);
                                    }
                                    int j2 = o.mo34505j();
                                    if (j2 != -1) {
                                        if (j2 != i4) {
                                            if (j2 != 5) {
                                                if (j2 != i5) {
                                                    if (sb == null) {
                                                        sb = new StringBuilder();
                                                    } else {
                                                        sb.append(',');
                                                    }
                                                    sb.append(o.mo34503h());
                                                } else if (mo34509G()) {
                                                    eVar = this.f21077o;
                                                }
                                            } else if (this.f21067e == 10) {
                                                if (mo34509G()) {
                                                    this.f21076n = Boolean.TRUE;
                                                }
                                                z4 = true;
                                            }
                                        }
                                        if (mo34509G()) {
                                            this.f21076n = Boolean.FALSE;
                                        }
                                        if (!this.f21076n.booleanValue() && mo34509G() && this.f21072j == -3) {
                                            this.f21072j = -1;
                                        }
                                        z3 = true;
                                    } else {
                                        String[] split = o.mo34503h().split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                        int i7 = 0;
                                        while (split != null && i7 < split.length) {
                                            C10931f.C10932a b = C10909k.f21149d.mo34612b(split[i7].trim());
                                            if (b != null) {
                                                int e2 = b.mo34621e();
                                                if (e2 == i4) {
                                                    if (mo34509G()) {
                                                        this.f21076n = Boolean.FALSE;
                                                    }
                                                    if (!this.f21076n.booleanValue() && mo34509G() && this.f21072j == -3) {
                                                        this.f21072j = -1;
                                                    }
                                                    z4 = false;
                                                    z3 = true;
                                                } else if (e2 != 5) {
                                                    if (sb == null) {
                                                        sb = new StringBuilder();
                                                    } else {
                                                        sb.append(',');
                                                    }
                                                    sb.append(split[i7]);
                                                } else if (this.f21067e == 10) {
                                                    if (mo34509G()) {
                                                        this.f21076n = Boolean.TRUE;
                                                    }
                                                    z4 = true;
                                                }
                                            } else {
                                                if (sb == null) {
                                                    sb = new StringBuilder();
                                                } else {
                                                    sb.append(',');
                                                }
                                                sb.append(split[i7]);
                                            }
                                            i7++;
                                            i4 = 1;
                                        }
                                    }
                                    i6 = i2 + 1;
                                    I = i;
                                    i4 = 1;
                                    i5 = 11;
                                    i3 = 48;
                                }
                                o.mo34506k(eVar);
                                i6 = i2 + 1;
                                I = i;
                                i4 = 1;
                                i5 = 11;
                                i3 = 48;
                            }
                            i = I;
                            i2 = i6;
                            i6 = i2 + 1;
                            I = i;
                            i4 = 1;
                            i5 = 11;
                            i3 = 48;
                        }
                        hVar = hVar3;
                        hVar2 = hVar4;
                    } else {
                        hVar2 = null;
                        sb = null;
                        hVar = null;
                        z5 = false;
                        z4 = false;
                        z3 = false;
                        z2 = false;
                    }
                    int i8 = (int) this.f21072j;
                    if (i8 != -3) {
                        if (i8 == -1) {
                            this.f21076n = Boolean.valueOf(mo34418z());
                        } else if (i8 == 0) {
                            if (hVar == null && mo34509G() && this.f21066d >= 200 && this.f21066d != 204 && this.f21066d != 304) {
                                this.f21077o.mo34586n0(f21133B);
                            }
                        }
                    } else if (this.f21071i == 0 && mo34509G() && (this.f21066d < 200 || this.f21066d == 204 || this.f21066d == 304)) {
                        this.f21072j = 0;
                    } else if (this.f21073k) {
                        this.f21072j = this.f21071i;
                        if (hVar == null && ((mo34509G() || this.f21072j > 0 || z5) && !this.f21075m)) {
                            this.f21077o.mo34567Z(C10910l.f21154f);
                            this.f21077o.mo34560Q0((byte) 58);
                            this.f21077o.mo34560Q0((byte) 32);
                            C10934h.m27668d(this.f21077o, this.f21072j);
                            this.f21077o.mo34586n0(C10917q.f21241a);
                        }
                    } else {
                        if (this.f21076n.booleanValue()) {
                            if (this.f21067e >= 11) {
                                j = -2;
                                this.f21072j = j;
                                if (mo34418z() && this.f21072j == -1) {
                                    this.f21072j = 0;
                                    this.f21075m = true;
                                }
                            }
                        }
                        j = -1;
                        this.f21072j = j;
                        this.f21072j = 0;
                        this.f21075m = true;
                    }
                    if (this.f21072j == -2) {
                        if (hVar2 == null || 2 == hVar2.mo34505j()) {
                            this.f21077o.mo34586n0(f21138G);
                        } else if (hVar2.mo34503h().endsWith("chunked")) {
                            hVar2.mo34506k(this.f21077o);
                        } else {
                            throw new IllegalArgumentException("BAD TE");
                        }
                    }
                    if (this.f21072j == -1) {
                        this.f21076n = Boolean.FALSE;
                    } else {
                        z6 = z4;
                    }
                    if (mo34509G()) {
                        if (!this.f21076n.booleanValue() && (z3 || this.f21067e > 10)) {
                            this.f21077o.mo34586n0(f21135D);
                            if (sb != null) {
                                this.f21077o.mo34575f0(this.f21077o.mo34562S0() - 2);
                                this.f21077o.mo34560Q0((byte) 44);
                                this.f21077o.mo34586n0(sb.toString().getBytes());
                                this.f21077o.mo34586n0(f21137F);
                            }
                        } else if (z6) {
                            this.f21077o.mo34586n0(f21134C);
                            if (sb != null) {
                                this.f21077o.mo34575f0(this.f21077o.mo34562S0() - 2);
                                this.f21077o.mo34560Q0((byte) 44);
                                this.f21077o.mo34586n0(sb.toString().getBytes());
                                this.f21077o.mo34586n0(f21137F);
                            }
                        } else if (sb != null) {
                            this.f21077o.mo34586n0(f21136E);
                            this.f21077o.mo34586n0(sb.toString().getBytes());
                            this.f21077o.mo34586n0(f21137F);
                        }
                    }
                    if (!z2 && this.f21066d > 199 && mo34414v()) {
                        this.f21077o.mo34586n0(f21139H);
                    }
                    this.f21077o.mo34586n0(C10917q.f21241a);
                    this.f21065c = 2;
                } catch (ArrayIndexOutOfBoundsException e3) {
                    throw new RuntimeException("Header>" + this.f21077o.capacity(), e3);
                }
            } else {
                throw new IllegalStateException("last?");
            }
        }
    }

    /* renamed from: o */
    public void mo34432o(C10929e eVar, boolean z) {
        C10929e eVar2;
        C10929e eVar3;
        if (this.f21075m) {
            throw new IllegalStateException("NO CONTENT");
        } else if (this.f21073k || this.f21065c == 4) {
            f21140y.mo35486b("Ignoring extra content {}", eVar);
            eVar.clear();
        } else {
            this.f21073k = z;
            C10929e eVar4 = this.f21079q;
            if ((eVar4 != null && eVar4.length() > 0) || this.f21145x) {
                if (!this.f21064b.mo34368r()) {
                    mo34402j();
                    C10929e eVar5 = this.f21079q;
                    if (eVar5 != null && eVar5.length() > 0) {
                        if (this.f21145x) {
                            eVar3 = this.f21063a.mo34625b(this.f21079q.length() + 12 + eVar.length());
                            eVar3.mo34567Z(this.f21079q);
                            eVar3.mo34586n0(C10917q.f21241a);
                            C10934h.m27669e(eVar3, eVar.length());
                            eVar3.mo34586n0(C10917q.f21241a);
                        } else {
                            eVar3 = this.f21063a.mo34625b(this.f21079q.length() + eVar.length());
                            eVar3.mo34567Z(this.f21079q);
                        }
                        eVar3.mo34567Z(eVar);
                        eVar = eVar3;
                    }
                } else {
                    throw new C10943o();
                }
            }
            this.f21079q = eVar;
            this.f21071i += (long) eVar.length();
            if (this.f21074l) {
                eVar.clear();
            } else if (this.f21064b != null && (((eVar2 = this.f21078p) == null || eVar2.length() == 0) && this.f21079q.length() > 0 && (this.f21073k || (mo34399g() && this.f21079q.length() > 1024)))) {
                this.f21142u = true;
                return;
            } else if (!this.f21145x) {
                if (this.f21078p == null) {
                    this.f21078p = this.f21063a.mo34624a();
                }
                this.f21079q.mo34591u0(this.f21078p.mo34567Z(this.f21079q));
                if (this.f21079q.length() != 0) {
                    return;
                }
            } else {
                return;
            }
            this.f21079q = null;
        }
    }

    public void reset() {
        C10942n nVar;
        Boolean bool = this.f21076n;
        if (bool != null && !bool.booleanValue() && (nVar = this.f21064b) != null && !nVar.mo34368r()) {
            try {
                this.f21064b.mo34370t();
            } catch (IOException e) {
                f21140y.mo35488d(e);
            }
        }
        super.reset();
        C10929e eVar = this.f21078p;
        if (eVar != null) {
            eVar.clear();
        }
        C10929e eVar2 = this.f21077o;
        if (eVar2 != null) {
            eVar2.clear();
        }
        if (this.f21079q != null) {
            this.f21079q = null;
        }
        this.f21142u = false;
        this.f21143v = false;
        this.f21144w = false;
        this.f21145x = false;
        this.f21069g = null;
        this.f21070h = null;
        this.f21075m = false;
    }

    public String toString() {
        Object[] objArr = new Object[5];
        objArr[0] = C10906j.class.getSimpleName();
        objArr[1] = Integer.valueOf(this.f21065c);
        C10929e eVar = this.f21077o;
        int i = -1;
        objArr[2] = Integer.valueOf(eVar == null ? -1 : eVar.length());
        C10929e eVar2 = this.f21078p;
        objArr[3] = Integer.valueOf(eVar2 == null ? -1 : eVar2.length());
        C10929e eVar3 = this.f21079q;
        if (eVar3 != null) {
            i = eVar3.length();
        }
        objArr[4] = Integer.valueOf(i);
        return String.format("%s{s=%d,h=%d,b=%d,c=%d}", objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        r0 = r5.f21078p;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo34416x() {
        /*
            r5 = this;
            boolean r0 = super.mo34416x()
            if (r0 != 0) goto L_0x0025
            boolean r0 = r5.f21145x
            if (r0 != 0) goto L_0x0025
            boolean r0 = r5.f21142u
            if (r0 != 0) goto L_0x0025
            long r0 = r5.f21072j
            r2 = -2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0023
            h.a.a.d.e r0 = r5.f21078p
            if (r0 == 0) goto L_0x0023
            int r0 = r0.mo34558I0()
            r1 = 12
            if (r0 >= r1) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r0 = 0
            goto L_0x0026
        L_0x0025:
            r0 = 1
        L_0x0026:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p216c.C10906j.mo34416x():boolean");
    }

    /* renamed from: z */
    public boolean mo34418z() {
        return this.f21069g != null;
    }
}

package org.eclipse.jetty.http;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.io.InterruptedIOException;
import org.apache.commons.p194io.IOUtils;
import org.eclipse.jetty.http.C9895h;
import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.p195io.Buffers;
import org.eclipse.jetty.p195io.EofException;
import org.eclipse.jetty.util.C9995n;
import p152e6.C9001b;
import p152e6.C9003c;
import p225w5.C11940d;
import p225w5.C11942e;
import p225w5.C11945g;
import p225w5.C11946h;
import p225w5.C11950k;

/* renamed from: org.eclipse.jetty.http.i */
public class C9904i extends C9887a {

    /* renamed from: A */
    private static final byte[] f18063A = {48, ParameterInitDefType.IntVec3Init, 10, ParameterInitDefType.IntVec3Init, 10};

    /* renamed from: B */
    private static final byte[] f18064B = C9995n.m24707c("Content-Length: 0\r\n");

    /* renamed from: C */
    private static final byte[] f18065C = C9995n.m24707c("Connection: keep-alive\r\n");

    /* renamed from: D */
    private static final byte[] f18066D = C9995n.m24707c("Connection: close\r\n");

    /* renamed from: E */
    private static final byte[] f18067E = C9995n.m24707c("Connection: ");

    /* renamed from: F */
    private static final byte[] f18068F = C9995n.m24707c(IOUtils.LINE_SEPARATOR_WINDOWS);

    /* renamed from: G */
    private static final byte[] f18069G = C9995n.m24707c("Transfer-Encoding: chunked\r\n");

    /* renamed from: H */
    private static byte[] f18070H = C9995n.m24707c("Server: Jetty(7.0.x)\r\n");

    /* renamed from: y */
    private static final C9003c f18071y = C9001b.m21450a(C9904i.class);

    /* renamed from: z */
    private static final C9906b[] f18072z = new C9906b[TypedValues.PositionType.TYPE_CURVE_FIT];

    /* renamed from: u */
    protected boolean f18073u = false;

    /* renamed from: v */
    private boolean f18074v = false;

    /* renamed from: w */
    private boolean f18075w = false;

    /* renamed from: x */
    private boolean f18076x = false;

    /* renamed from: org.eclipse.jetty.http.i$b */
    private static class C9906b {

        /* renamed from: a */
        C11940d f18077a;

        /* renamed from: b */
        C11940d f18078b;

        /* renamed from: c */
        C11940d f18079c;

        private C9906b() {
        }
    }

    static {
        int length = C9915q.f18142c.length();
        for (int i = 0; i < f18072z.length; i++) {
            HttpStatus.Code a = HttpStatus.m24063a(i);
            if (a != null) {
                String message = a.getMessage();
                int i2 = length + 5;
                int length2 = message.length() + i2 + 2;
                byte[] bArr = new byte[length2];
                C9915q.f18142c.mo42453x0(0, bArr, 0, length);
                bArr[length + 0] = 32;
                bArr[length + 1] = (byte) ((i / 100) + 48);
                bArr[length + 2] = (byte) (((i % 100) / 10) + 48);
                bArr[length + 3] = (byte) ((i % 10) + 48);
                bArr[length + 4] = 32;
                for (int i3 = 0; i3 < message.length(); i3++) {
                    bArr[i2 + i3] = (byte) message.charAt(i3);
                }
                bArr[message.length() + i2] = ParameterInitDefType.IntVec3Init;
                bArr[length + 6 + message.length()] = 10;
                C9906b[] bVarArr = f18072z;
                bVarArr[i] = new C9906b();
                bVarArr[i].f18077a = new C11946h(bArr, i2, (length2 - length) - 7, 0);
                bVarArr[i].f18078b = new C11946h(bArr, 0, i2, 0);
                bVarArr[i].f18079c = new C11946h(bArr, 0, length2, 0);
            }
        }
    }

    public C9904i(Buffers buffers, C11950k kVar) {
        super(buffers, kVar);
    }

    /* renamed from: G */
    private int m24223G() {
        C11940d dVar;
        C11940d dVar2 = this.f18004o;
        int i = 0;
        int i2 = (dVar2 == null || dVar2.length() <= 0) ? 0 : 4;
        C11940d dVar3 = this.f18005p;
        int i3 = i2 | ((dVar3 == null || dVar3.length() <= 0) ? 0 : 2);
        if (this.f18073u && (dVar = this.f18006q) != null && dVar.length() > 0) {
            i = 1;
        }
        return i3 | i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0183  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m24224J() {
        /*
            r8 = this;
            boolean r0 = r8.f18076x
            r1 = 0
            if (r0 != 0) goto L_0x0196
            boolean r0 = r8.f18073u
            if (r0 != 0) goto L_0x0034
            w5.d r0 = r8.f18006q
            if (r0 == 0) goto L_0x0034
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0034
            w5.d r0 = r8.f18005p
            if (r0 == 0) goto L_0x0034
            int r0 = r0.mo42410M0()
            if (r0 <= 0) goto L_0x0034
            w5.d r0 = r8.f18005p
            w5.d r2 = r8.f18006q
            int r0 = r0.mo42405E0(r2)
            w5.d r2 = r8.f18006q
            r2.mo42441u0(r0)
            w5.d r0 = r8.f18006q
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0034
            r8.f18006q = r1
        L_0x0034:
            long r2 = r8.f17999j
            r4 = -2
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0196
            boolean r0 = r8.f18073u
            java.lang.String r2 = "EOC"
            r3 = 1
            r4 = 0
            r5 = 2
            if (r0 == 0) goto L_0x0091
            w5.d r0 = r8.f18005p
            if (r0 == 0) goto L_0x004f
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0091
        L_0x004f:
            w5.d r0 = r8.f18006q
            if (r0 == 0) goto L_0x0091
            int r0 = r0.length()
            r8.f18076x = r3
            w5.d r6 = r8.f18004o
            if (r6 != 0) goto L_0x0065
            org.eclipse.jetty.io.Buffers r6 = r8.f17990a
            w5.d r6 = r6.mo39864d()
            r8.f18004o = r6
        L_0x0065:
            boolean r6 = r8.f18074v
            if (r6 == 0) goto L_0x0081
            w5.d r6 = r8.f18004o
            int r6 = r6.length()
            if (r6 > 0) goto L_0x007b
            w5.d r2 = r8.f18004o
            byte[] r6 = org.eclipse.jetty.http.C9913o.f18124a
            r2.mo42436o0(r6)
            r8.f18074v = r4
            goto L_0x0081
        L_0x007b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0081:
            w5.d r2 = r8.f18004o
            p225w5.C11945g.m30567e(r2, r0)
            w5.d r0 = r8.f18004o
            byte[] r2 = org.eclipse.jetty.http.C9913o.f18124a
            r0.mo42436o0(r2)
        L_0x008d:
            r8.f18074v = r3
            goto L_0x0120
        L_0x0091:
            w5.d r0 = r8.f18005p
            if (r0 == 0) goto L_0x0120
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0120
            r8.f18076x = r3
            w5.d r6 = r8.f18005p
            int r6 = r6.mo42409L0()
            r7 = 12
            if (r6 != r7) goto L_0x00dd
            w5.d r2 = r8.f18005p
            int r6 = r2.mo42409L0()
            int r6 = r6 - r5
            byte[] r7 = org.eclipse.jetty.http.C9913o.f18124a
            r2.mo42435m(r6, r7, r4, r5)
            w5.d r2 = r8.f18005p
            int r6 = r2.mo42409L0()
            int r6 = r6 - r5
            r2.mo42442v0(r6)
            w5.d r2 = r8.f18005p
            p225w5.C11945g.m30564b(r2, r0)
            boolean r0 = r8.f18074v
            if (r0 == 0) goto L_0x0111
            w5.d r0 = r8.f18005p
            int r2 = r0.mo42409L0()
            int r2 = r2 - r5
            r0.mo42435m(r2, r7, r4, r5)
            w5.d r0 = r8.f18005p
            int r2 = r0.mo42409L0()
            int r2 = r2 - r5
            r0.mo42442v0(r2)
            r8.f18074v = r4
            goto L_0x0111
        L_0x00dd:
            w5.d r6 = r8.f18004o
            if (r6 != 0) goto L_0x00e9
            org.eclipse.jetty.io.Buffers r6 = r8.f17990a
            w5.d r6 = r6.mo39864d()
            r8.f18004o = r6
        L_0x00e9:
            boolean r6 = r8.f18074v
            if (r6 == 0) goto L_0x0105
            w5.d r6 = r8.f18004o
            int r6 = r6.length()
            if (r6 > 0) goto L_0x00ff
            w5.d r2 = r8.f18004o
            byte[] r6 = org.eclipse.jetty.http.C9913o.f18124a
            r2.mo42436o0(r6)
            r8.f18074v = r4
            goto L_0x0105
        L_0x00ff:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0105:
            w5.d r2 = r8.f18004o
            p225w5.C11945g.m30567e(r2, r0)
            w5.d r0 = r8.f18004o
            byte[] r2 = org.eclipse.jetty.http.C9913o.f18124a
            r0.mo42436o0(r2)
        L_0x0111:
            w5.d r0 = r8.f18005p
            int r0 = r0.mo42410M0()
            if (r0 < r5) goto L_0x008d
            w5.d r0 = r8.f18005p
            byte[] r2 = org.eclipse.jetty.http.C9913o.f18124a
            r0.mo42436o0(r2)
        L_0x0120:
            boolean r0 = r8.f18075w
            if (r0 == 0) goto L_0x0196
            w5.d r0 = r8.f18006q
            if (r0 == 0) goto L_0x012e
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0196
        L_0x012e:
            boolean r0 = r8.f18074v
            if (r0 == 0) goto L_0x015a
            w5.d r0 = r8.f18005p
            if (r0 != 0) goto L_0x0148
            w5.d r0 = r8.f18004o
            int r0 = r0.mo42410M0()
            if (r0 < r5) goto L_0x0148
            w5.d r0 = r8.f18004o
            byte[] r2 = org.eclipse.jetty.http.C9913o.f18124a
            r0.mo42436o0(r2)
        L_0x0145:
            r8.f18074v = r4
            goto L_0x015a
        L_0x0148:
            w5.d r0 = r8.f18005p
            if (r0 == 0) goto L_0x015a
            int r0 = r0.mo42410M0()
            if (r0 < r5) goto L_0x015a
            w5.d r0 = r8.f18005p
            byte[] r2 = org.eclipse.jetty.http.C9913o.f18124a
            r0.mo42436o0(r2)
            goto L_0x0145
        L_0x015a:
            boolean r0 = r8.f18074v
            if (r0 != 0) goto L_0x0196
            boolean r0 = r8.f18075w
            if (r0 == 0) goto L_0x0196
            w5.d r0 = r8.f18005p
            if (r0 != 0) goto L_0x017f
            w5.d r0 = r8.f18004o
            int r0 = r0.mo42410M0()
            byte[] r2 = f18063A
            int r5 = r2.length
            if (r0 < r5) goto L_0x017f
            boolean r0 = r8.f18001l
            if (r0 != 0) goto L_0x017c
            w5.d r0 = r8.f18004o
            r0.mo42436o0(r2)
        L_0x017a:
            r8.f18076x = r3
        L_0x017c:
            r8.f18075w = r4
            goto L_0x0196
        L_0x017f:
            w5.d r0 = r8.f18005p
            if (r0 == 0) goto L_0x0196
            int r0 = r0.mo42410M0()
            byte[] r2 = f18063A
            int r5 = r2.length
            if (r0 < r5) goto L_0x0196
            boolean r0 = r8.f18001l
            if (r0 != 0) goto L_0x017c
            w5.d r0 = r8.f18005p
            r0.mo42436o0(r2)
            goto L_0x017a
        L_0x0196:
            w5.d r0 = r8.f18006q
            if (r0 == 0) goto L_0x01a2
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01a2
            r8.f18006q = r1
        L_0x01a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.http.C9904i.m24224J():void");
    }

    /* renamed from: M */
    public static void m24225M(String str) {
        f18070H = C9995n.m24707c("Server: Jetty(" + str + ")\r\n");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        r0 = r5.f18005p;
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo39707A() {
        /*
            r5 = this;
            boolean r0 = super.mo39707A()
            if (r0 != 0) goto L_0x0025
            boolean r0 = r5.f18076x
            if (r0 != 0) goto L_0x0025
            boolean r0 = r5.f18073u
            if (r0 != 0) goto L_0x0025
            long r0 = r5.f17999j
            r2 = -2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0023
            w5.d r0 = r5.f18005p
            if (r0 == 0) goto L_0x0023
            int r0 = r0.mo42410M0()
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
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.http.C9904i.mo39707A():boolean");
    }

    /* renamed from: C */
    public boolean mo39709C() {
        return this.f17996g != null;
    }

    /* renamed from: E */
    public int mo39711E() {
        if (this.f18002m || this.f18000k || this.f17992c == 4) {
            return -1;
        }
        C11940d dVar = this.f18006q;
        if ((dVar != null && dVar.length() > 0) || this.f18076x) {
            mo39724k();
            if ((dVar != null && dVar.length() > 0) || this.f18076x) {
                throw new IllegalStateException("FULL");
            }
        }
        if (this.f18005p == null) {
            this.f18005p = this.f17990a.mo39861a();
        }
        this.f17998i -= (long) this.f18005p.length();
        if (this.f18001l) {
            return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        return this.f18005p.mo42410M0() - (this.f17999j == -2 ? 12 : 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f18005p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r0 = r1.f18006q;
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo39830H() {
        /*
            r1 = this;
            w5.d r0 = r1.f18004o
            if (r0 == 0) goto L_0x000a
            int r0 = r0.length()
            if (r0 != 0) goto L_0x001f
        L_0x000a:
            w5.d r0 = r1.f18005p
            if (r0 == 0) goto L_0x0014
            int r0 = r0.length()
            if (r0 != 0) goto L_0x001f
        L_0x0014:
            w5.d r0 = r1.f18006q
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
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.http.C9904i.mo39830H():boolean");
    }

    /* renamed from: I */
    public boolean mo39831I() {
        return this.f17996g == null;
    }

    /* renamed from: K */
    public void mo39832K(int i) {
        if (this.f17992c == 0) {
            if (i < 100 || i > 199) {
                throw new IllegalArgumentException("!1xx");
            }
            C9906b bVar = f18072z[i];
            if (bVar != null) {
                if (this.f18004o == null) {
                    this.f18004o = this.f17990a.mo39864d();
                }
                this.f18004o.mo42405E0(bVar.f18079c);
                this.f18004o.mo42436o0(C9913o.f18124a);
                while (this.f18004o.length() > 0) {
                    try {
                        int x = this.f17991b.mo39674x(this.f18004o);
                        if (x < 0) {
                            throw new EofException();
                        } else if (x == 0) {
                            Thread.sleep(100);
                        }
                    } catch (InterruptedException e) {
                        f18071y.mo36848c(e);
                        throw new InterruptedIOException(e.toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException(i + "?");
        }
    }

    /* renamed from: L */
    public void mo39833L(C11940d dVar) {
        C11940d dVar2;
        if (this.f18002m || this.f17992c != 0 || (((dVar2 = this.f18006q) != null && dVar2.length() > 0) || this.f18076x || this.f18001l)) {
            throw new IllegalStateException();
        }
        this.f18000k = true;
        this.f18006q = dVar;
        this.f18073u = true;
        this.f17992c = 3;
        long length = (long) dVar.length();
        this.f17998i = length;
        this.f17999j = length;
    }

    public void complete() {
        if (this.f17992c != 4) {
            super.complete();
            if (this.f17992c < 3) {
                this.f17992c = 3;
                if (this.f17999j == -2) {
                    this.f18075w = true;
                }
            }
            mo39724k();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0047, code lost:
        r0 = r0.mo39662k(r5, r6, (p225w5.C11940d) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0058, code lost:
        r0 = r0.mo39674x(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f3, code lost:
        if (r0 <= 0) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00f5, code lost:
        r3 = r3 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00f6, code lost:
        r4 = m24223G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00fa, code lost:
        if (r0 > 0) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00fc, code lost:
        if (r4 == 0) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00fe, code lost:
        if (r2 == 0) goto L_0x0101;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo39724k() {
        /*
            r10 = this;
            int r0 = r10.f17992c     // Catch:{ IOException -> 0x010c }
            if (r0 == 0) goto L_0x0104
            r10.m24224J()     // Catch:{ IOException -> 0x010c }
            w5.k r0 = r10.f17991b     // Catch:{ IOException -> 0x010c }
            r1 = 0
            if (r0 != 0) goto L_0x002f
            boolean r0 = r10.f18074v     // Catch:{ IOException -> 0x010c }
            if (r0 == 0) goto L_0x0019
            w5.d r0 = r10.f18005p     // Catch:{ IOException -> 0x010c }
            if (r0 == 0) goto L_0x0019
            byte[] r2 = org.eclipse.jetty.http.C9913o.f18124a     // Catch:{ IOException -> 0x010c }
            r0.mo42436o0(r2)     // Catch:{ IOException -> 0x010c }
        L_0x0019:
            boolean r0 = r10.f18075w     // Catch:{ IOException -> 0x010c }
            if (r0 == 0) goto L_0x002a
            w5.d r0 = r10.f18005p     // Catch:{ IOException -> 0x010c }
            if (r0 == 0) goto L_0x002a
            boolean r2 = r10.f18001l     // Catch:{ IOException -> 0x010c }
            if (r2 != 0) goto L_0x002a
            byte[] r2 = f18063A     // Catch:{ IOException -> 0x010c }
            r0.mo42436o0(r2)     // Catch:{ IOException -> 0x010c }
        L_0x002a:
            r10.f18074v = r1     // Catch:{ IOException -> 0x010c }
            r10.f18075w = r1     // Catch:{ IOException -> 0x010c }
            return r1
        L_0x002f:
            r0 = -1
            int r2 = r10.m24223G()     // Catch:{ IOException -> 0x010c }
            r3 = 0
        L_0x0035:
            r4 = 0
            switch(r2) {
                case 0: goto L_0x006f;
                case 1: goto L_0x006a;
                case 2: goto L_0x0065;
                case 3: goto L_0x005e;
                case 4: goto L_0x0054;
                case 5: goto L_0x004d;
                case 6: goto L_0x0041;
                case 7: goto L_0x003b;
                default: goto L_0x0039;
            }     // Catch:{ IOException -> 0x010c }
        L_0x0039:
            goto L_0x00f3
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x010c }
            r0.<init>()     // Catch:{ IOException -> 0x010c }
            throw r0     // Catch:{ IOException -> 0x010c }
        L_0x0041:
            w5.k r0 = r10.f17991b     // Catch:{ IOException -> 0x010c }
            w5.d r5 = r10.f18004o     // Catch:{ IOException -> 0x010c }
            w5.d r6 = r10.f18005p     // Catch:{ IOException -> 0x010c }
        L_0x0047:
            int r0 = r0.mo39662k(r5, r6, r4)     // Catch:{ IOException -> 0x010c }
            goto L_0x00f3
        L_0x004d:
            w5.k r0 = r10.f17991b     // Catch:{ IOException -> 0x010c }
            w5.d r5 = r10.f18004o     // Catch:{ IOException -> 0x010c }
            w5.d r6 = r10.f18006q     // Catch:{ IOException -> 0x010c }
            goto L_0x0047
        L_0x0054:
            w5.k r0 = r10.f17991b     // Catch:{ IOException -> 0x010c }
            w5.d r4 = r10.f18004o     // Catch:{ IOException -> 0x010c }
        L_0x0058:
            int r0 = r0.mo39674x(r4)     // Catch:{ IOException -> 0x010c }
            goto L_0x00f3
        L_0x005e:
            w5.k r0 = r10.f17991b     // Catch:{ IOException -> 0x010c }
            w5.d r5 = r10.f18005p     // Catch:{ IOException -> 0x010c }
            w5.d r6 = r10.f18006q     // Catch:{ IOException -> 0x010c }
            goto L_0x0047
        L_0x0065:
            w5.k r0 = r10.f17991b     // Catch:{ IOException -> 0x010c }
            w5.d r4 = r10.f18005p     // Catch:{ IOException -> 0x010c }
            goto L_0x0058
        L_0x006a:
            w5.k r0 = r10.f17991b     // Catch:{ IOException -> 0x010c }
            w5.d r4 = r10.f18006q     // Catch:{ IOException -> 0x010c }
            goto L_0x0058
        L_0x006f:
            w5.d r0 = r10.f18004o     // Catch:{ IOException -> 0x010c }
            if (r0 == 0) goto L_0x0076
            r0.clear()     // Catch:{ IOException -> 0x010c }
        L_0x0076:
            r10.f18073u = r1     // Catch:{ IOException -> 0x010c }
            r10.f18076x = r1     // Catch:{ IOException -> 0x010c }
            w5.d r0 = r10.f18005p     // Catch:{ IOException -> 0x010c }
            r5 = 3
            if (r0 == 0) goto L_0x00b8
            r0.clear()     // Catch:{ IOException -> 0x010c }
            long r6 = r10.f17999j     // Catch:{ IOException -> 0x010c }
            r8 = -2
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x00b8
            w5.d r0 = r10.f18005p     // Catch:{ IOException -> 0x010c }
            r6 = 12
            r0.mo42430h0(r6)     // Catch:{ IOException -> 0x010c }
            w5.d r0 = r10.f18005p     // Catch:{ IOException -> 0x010c }
            r0.mo42442v0(r6)     // Catch:{ IOException -> 0x010c }
            w5.d r0 = r10.f18006q     // Catch:{ IOException -> 0x010c }
            if (r0 == 0) goto L_0x00b8
            int r0 = r0.length()     // Catch:{ IOException -> 0x010c }
            w5.d r6 = r10.f18005p     // Catch:{ IOException -> 0x010c }
            int r6 = r6.mo42410M0()     // Catch:{ IOException -> 0x010c }
            if (r0 >= r6) goto L_0x00b8
            int r0 = r10.f17992c     // Catch:{ IOException -> 0x010c }
            if (r0 == r5) goto L_0x00b8
            w5.d r0 = r10.f18005p     // Catch:{ IOException -> 0x010c }
            w5.d r6 = r10.f18006q     // Catch:{ IOException -> 0x010c }
            r0.mo42405E0(r6)     // Catch:{ IOException -> 0x010c }
            w5.d r0 = r10.f18006q     // Catch:{ IOException -> 0x010c }
            r0.clear()     // Catch:{ IOException -> 0x010c }
            r10.f18006q = r4     // Catch:{ IOException -> 0x010c }
        L_0x00b8:
            boolean r0 = r10.f18074v     // Catch:{ IOException -> 0x010c }
            if (r0 != 0) goto L_0x00ef
            boolean r0 = r10.f18075w     // Catch:{ IOException -> 0x010c }
            if (r0 != 0) goto L_0x00ef
            w5.d r0 = r10.f18006q     // Catch:{ IOException -> 0x010c }
            if (r0 == 0) goto L_0x00ca
            int r0 = r0.length()     // Catch:{ IOException -> 0x010c }
            if (r0 != 0) goto L_0x00ef
        L_0x00ca:
            int r0 = r10.f17992c     // Catch:{ IOException -> 0x010c }
            r4 = 4
            if (r0 != r5) goto L_0x00d1
            r10.f17992c = r4     // Catch:{ IOException -> 0x010c }
        L_0x00d1:
            int r0 = r10.f17992c     // Catch:{ IOException -> 0x010c }
            if (r0 != r4) goto L_0x00f2
            java.lang.Boolean r0 = r10.f18003n     // Catch:{ IOException -> 0x010c }
            if (r0 == 0) goto L_0x00f2
            boolean r0 = r0.booleanValue()     // Catch:{ IOException -> 0x010c }
            if (r0 != 0) goto L_0x00f2
            int r0 = r10.f17993d     // Catch:{ IOException -> 0x010c }
            r4 = 100
            if (r0 == r4) goto L_0x00f2
            w5.d r0 = r10.f17996g     // Catch:{ IOException -> 0x010c }
            if (r0 != 0) goto L_0x00f2
            w5.k r0 = r10.f17991b     // Catch:{ IOException -> 0x010c }
            r0.mo39670t()     // Catch:{ IOException -> 0x010c }
            goto L_0x00f2
        L_0x00ef:
            r10.m24224J()     // Catch:{ IOException -> 0x010c }
        L_0x00f2:
            r0 = 0
        L_0x00f3:
            if (r0 <= 0) goto L_0x00f6
            int r3 = r3 + r0
        L_0x00f6:
            int r4 = r10.m24223G()     // Catch:{ IOException -> 0x010c }
            if (r0 > 0) goto L_0x0101
            if (r4 == 0) goto L_0x0100
            if (r2 == 0) goto L_0x0101
        L_0x0100:
            return r3
        L_0x0101:
            r2 = r4
            goto L_0x0035
        L_0x0104:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x010c }
            java.lang.String r1 = "State==HEADER"
            r0.<init>(r1)     // Catch:{ IOException -> 0x010c }
            throw r0     // Catch:{ IOException -> 0x010c }
        L_0x010c:
            r0 = move-exception
            e6.c r1 = f18071y
            r1.mo36849d(r0)
            boolean r1 = r0 instanceof org.eclipse.jetty.p195io.EofException
            if (r1 == 0) goto L_0x0117
            goto L_0x011d
        L_0x0117:
            org.eclipse.jetty.io.EofException r1 = new org.eclipse.jetty.io.EofException
            r1.<init>((java.lang.Throwable) r0)
            r0 = r1
        L_0x011d:
            goto L_0x011f
        L_0x011e:
            throw r0
        L_0x011f:
            goto L_0x011e
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.http.C9904i.mo39724k():int");
    }

    /* renamed from: l */
    public void mo39753l(C11940d dVar, boolean z) {
        C11940d dVar2;
        C11940d dVar3;
        if (this.f18002m) {
            throw new IllegalStateException("NO CONTENT");
        } else if (this.f18000k || this.f17992c == 4) {
            f18071y.mo36847b("Ignoring extra content {}", dVar);
            dVar.clear();
        } else {
            this.f18000k = z;
            C11940d dVar4 = this.f18006q;
            if ((dVar4 != null && dVar4.length() > 0) || this.f18076x) {
                if (!this.f17991b.mo39668r()) {
                    mo39724k();
                    C11940d dVar5 = this.f18006q;
                    if (dVar5 != null && dVar5.length() > 0) {
                        if (this.f18076x) {
                            dVar3 = this.f17990a.mo39863c(this.f18006q.length() + 12 + dVar.length());
                            dVar3.mo42405E0(this.f18006q);
                            byte[] bArr = C9913o.f18124a;
                            dVar3.mo42436o0(bArr);
                            C11945g.m30567e(dVar3, dVar.length());
                            dVar3.mo42436o0(bArr);
                        } else {
                            dVar3 = this.f17990a.mo39863c(this.f18006q.length() + dVar.length());
                            dVar3.mo42405E0(this.f18006q);
                        }
                        dVar3.mo42405E0(dVar);
                        dVar = dVar3;
                    }
                } else {
                    throw new EofException();
                }
            }
            this.f18006q = dVar;
            this.f17998i += (long) dVar.length();
            if (this.f18001l) {
                dVar.clear();
            } else if (this.f17991b != null && (((dVar2 = this.f18005p) == null || dVar2.length() == 0) && this.f18006q.length() > 0 && (this.f18000k || (mo39720g() && this.f18006q.length() > 1024)))) {
                this.f18073u = true;
                return;
            } else if (!this.f18076x) {
                if (this.f18005p == null) {
                    this.f18005p = this.f17990a.mo39861a();
                }
                this.f18006q.mo42441u0(this.f18005p.mo42405E0(this.f18006q));
                if (this.f18006q.length() != 0) {
                    return;
                }
            } else {
                return;
            }
            this.f18006q = null;
        }
    }

    /* renamed from: n */
    public void mo39726n(C9895h hVar, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C9895h.C9903h hVar2;
        StringBuilder sb;
        C9895h.C9903h hVar3;
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        C11940d dVar;
        C9895h hVar4 = hVar;
        if (this.f17992c == 0) {
            if (!mo39831I() || this.f17993d != 0) {
                boolean z6 = this.f18000k;
                if (!z6 || z) {
                    this.f18000k = z6 | z;
                    if (this.f18004o == null) {
                        this.f18004o = this.f17990a.mo39864d();
                    }
                    try {
                        int i5 = 48;
                        boolean z7 = false;
                        int i6 = 1;
                        if (mo39709C()) {
                            this.f18003n = Boolean.TRUE;
                            if (this.f17994e == 9) {
                                this.f17999j = 0;
                                this.f18004o.mo42405E0(this.f17996g);
                                this.f18004o.mo42414S0((byte) 32);
                                this.f18004o.mo42436o0(this.f17997h.getBytes("UTF-8"));
                                this.f18004o.mo42436o0(C9913o.f18124a);
                                this.f17992c = 3;
                                this.f18002m = true;
                                return;
                            }
                            this.f18004o.mo42405E0(this.f17996g);
                            this.f18004o.mo42414S0((byte) 32);
                            this.f18004o.mo42436o0(this.f17997h.getBytes("UTF-8"));
                            this.f18004o.mo42414S0((byte) 32);
                            this.f18004o.mo42405E0(this.f17994e == 10 ? C9915q.f18141b : C9915q.f18142c);
                            this.f18004o.mo42436o0(C9913o.f18124a);
                        } else {
                            int i7 = this.f17994e;
                            if (i7 == 9) {
                                this.f18003n = Boolean.FALSE;
                                this.f17999j = -1;
                                this.f17992c = 2;
                                return;
                            }
                            if (this.f18003n == null) {
                                this.f18003n = Boolean.valueOf(i7 > 10);
                            }
                            int i8 = this.f17993d;
                            C9906b[] bVarArr = f18072z;
                            C9906b bVar = i8 < bVarArr.length ? bVarArr[i8] : null;
                            if (bVar == null) {
                                this.f18004o.mo42405E0(C9915q.f18142c);
                                this.f18004o.mo42414S0((byte) 32);
                                this.f18004o.mo42414S0((byte) ((this.f17993d / 100) + 48));
                                this.f18004o.mo42414S0((byte) (((this.f17993d % 100) / 10) + 48));
                                this.f18004o.mo42414S0((byte) ((this.f17993d % 10) + 48));
                                this.f18004o.mo42414S0((byte) 32);
                                C11940d dVar2 = this.f17995f;
                                if (dVar2 == null) {
                                    this.f18004o.mo42414S0((byte) ((this.f17993d / 100) + 48));
                                    this.f18004o.mo42414S0((byte) (((this.f17993d % 100) / 10) + 48));
                                    this.f18004o.mo42414S0((byte) ((this.f17993d % 10) + 48));
                                } else {
                                    this.f18004o.mo42405E0(dVar2);
                                }
                                this.f18004o.mo42436o0(C9913o.f18124a);
                            } else if (this.f17995f == null) {
                                this.f18004o.mo42405E0(bVar.f18079c);
                            } else {
                                this.f18004o.mo42405E0(bVar.f18078b);
                                this.f18004o.mo42405E0(this.f17995f);
                                this.f18004o.mo42436o0(C9913o.f18124a);
                            }
                            int i9 = this.f17993d;
                            if (i9 < 200 && i9 >= 100) {
                                this.f18002m = true;
                                this.f18006q = null;
                                C11940d dVar3 = this.f18005p;
                                if (dVar3 != null) {
                                    dVar3.clear();
                                }
                                if (this.f17993d != 101) {
                                    this.f18004o.mo42436o0(C9913o.f18124a);
                                    this.f17992c = 2;
                                    return;
                                }
                            } else if (i9 == 204 || i9 == 304) {
                                this.f18002m = true;
                                this.f18006q = null;
                                C11940d dVar4 = this.f18005p;
                                if (dVar4 != null) {
                                    dVar4.clear();
                                }
                            }
                        }
                        if (this.f17993d >= 200 && this.f18007r != null) {
                            this.f18004o.mo42405E0(C9908k.f18089i);
                            this.f18004o.mo42414S0((byte) 58);
                            this.f18004o.mo42414S0((byte) 32);
                            this.f18004o.mo42405E0(this.f18007r);
                            this.f18004o.mo42436o0(f18068F);
                        }
                        int i10 = 11;
                        if (hVar4 != null) {
                            int K = hVar.mo39787K();
                            sb = null;
                            int i11 = 0;
                            C9895h.C9903h hVar5 = null;
                            z5 = false;
                            C9895h.C9903h hVar6 = null;
                            z4 = false;
                            z3 = false;
                            z2 = false;
                            while (i11 < K) {
                                C9895h.C9903h q = hVar4.mo39797q(i11);
                                if (q != null) {
                                    int g = q.mo39824g();
                                    if (g != i6) {
                                        if (g == 5) {
                                            i3 = K;
                                            i4 = i11;
                                            if (this.f17994e == i10) {
                                                hVar6 = q;
                                            }
                                        } else if (g == 12) {
                                            i4 = i11;
                                            long e = q.mo39822e();
                                            this.f17999j = e;
                                            i3 = K;
                                            long j2 = this.f17998i;
                                            if (e >= j2) {
                                                if (!this.f18000k || e == j2) {
                                                    hVar5 = q;
                                                    dVar = this.f18004o;
                                                }
                                            }
                                            hVar5 = null;
                                            dVar = this.f18004o;
                                        } else if (g == 16) {
                                            if (C11945g.m30563a(C9916r.f18146e, q.mo39826i())) {
                                                i4 = i11;
                                                this.f17999j = -4;
                                            } else {
                                                i4 = i11;
                                            }
                                            q.mo39828k(this.f18004o);
                                            i3 = K;
                                            z5 = true;
                                        } else if (g != i5) {
                                            q.mo39828k(this.f18004o);
                                        } else if (mo39738y()) {
                                            q.mo39828k(this.f18004o);
                                            i3 = K;
                                            i4 = i11;
                                            z2 = true;
                                        }
                                        i11 = i4 + 1;
                                        K = i3;
                                        i6 = 1;
                                        i10 = 11;
                                        i5 = 48;
                                    } else {
                                        i3 = K;
                                        i4 = i11;
                                        if (mo39709C()) {
                                            q.mo39828k(this.f18004o);
                                        }
                                        int j3 = q.mo39827j();
                                        if (j3 != -1) {
                                            if (j3 != i6) {
                                                if (j3 != 5) {
                                                    if (j3 != i10) {
                                                        if (sb == null) {
                                                            sb = new StringBuilder();
                                                        } else {
                                                            sb.append(',');
                                                        }
                                                        sb.append(q.mo39825h());
                                                    } else if (mo39831I()) {
                                                        dVar = this.f18004o;
                                                    }
                                                } else if (this.f17994e == 10) {
                                                    if (mo39831I()) {
                                                        this.f18003n = Boolean.TRUE;
                                                    }
                                                    z4 = true;
                                                }
                                            }
                                            if (mo39831I()) {
                                                this.f18003n = Boolean.FALSE;
                                            }
                                            if (!this.f18003n.booleanValue() && mo39831I() && this.f17999j == -3) {
                                                this.f17999j = -1;
                                            }
                                            z3 = true;
                                        } else {
                                            String[] split = q.mo39825h().split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                            int i12 = 0;
                                            while (split != null && i12 < split.length) {
                                                C11942e.C11943a b = C9907j.f18080d.mo42455b(split[i12].trim());
                                                if (b != null) {
                                                    int e2 = b.mo42464e();
                                                    if (e2 == i6) {
                                                        if (mo39831I()) {
                                                            this.f18003n = Boolean.FALSE;
                                                        }
                                                        if (!this.f18003n.booleanValue() && mo39831I() && this.f17999j == -3) {
                                                            this.f17999j = -1;
                                                        }
                                                        z4 = false;
                                                        z3 = true;
                                                    } else if (e2 != 5) {
                                                        if (sb == null) {
                                                            sb = new StringBuilder();
                                                        } else {
                                                            sb.append(',');
                                                        }
                                                        sb.append(split[i12]);
                                                    } else if (this.f17994e == 10) {
                                                        if (mo39831I()) {
                                                            this.f18003n = Boolean.TRUE;
                                                        }
                                                        z4 = true;
                                                    }
                                                } else {
                                                    if (sb == null) {
                                                        sb = new StringBuilder();
                                                    } else {
                                                        sb.append(',');
                                                    }
                                                    sb.append(split[i12]);
                                                }
                                                i12++;
                                                i6 = 1;
                                            }
                                        }
                                        i11 = i4 + 1;
                                        K = i3;
                                        i6 = 1;
                                        i10 = 11;
                                        i5 = 48;
                                    }
                                    q.mo39828k(dVar);
                                    i11 = i4 + 1;
                                    K = i3;
                                    i6 = 1;
                                    i10 = 11;
                                    i5 = 48;
                                }
                                i3 = K;
                                i4 = i11;
                                i11 = i4 + 1;
                                K = i3;
                                i6 = 1;
                                i10 = 11;
                                i5 = 48;
                            }
                            hVar2 = hVar5;
                            hVar3 = hVar6;
                        } else {
                            hVar3 = null;
                            sb = null;
                            hVar2 = null;
                            z5 = false;
                            z4 = false;
                            z3 = false;
                            z2 = false;
                        }
                        int i13 = (int) this.f17999j;
                        if (i13 != -3) {
                            if (i13 == -1) {
                                this.f18003n = Boolean.valueOf(mo39709C());
                            } else if (i13 == 0) {
                                if (hVar2 == null && mo39831I() && (i2 = this.f17993d) >= 200 && i2 != 204 && i2 != 304) {
                                    this.f18004o.mo42436o0(f18064B);
                                }
                            }
                        } else if (this.f17998i == 0 && mo39831I() && ((i = this.f17993d) < 200 || i == 204 || i == 304)) {
                            this.f17999j = 0;
                        } else if (this.f18000k) {
                            this.f17999j = this.f17998i;
                            if (hVar2 == null && ((mo39831I() || this.f17999j > 0 || z5) && !this.f18002m)) {
                                this.f18004o.mo42405E0(C9908k.f18086f);
                                this.f18004o.mo42414S0((byte) 58);
                                this.f18004o.mo42414S0((byte) 32);
                                C11945g.m30566d(this.f18004o, this.f17999j);
                                this.f18004o.mo42436o0(C9913o.f18124a);
                            }
                        } else {
                            if (this.f18003n.booleanValue()) {
                                if (this.f17994e >= 11) {
                                    j = -2;
                                    this.f17999j = j;
                                    if (mo39709C() && this.f17999j == -1) {
                                        this.f17999j = 0;
                                        this.f18002m = true;
                                    }
                                }
                            }
                            j = -1;
                            this.f17999j = j;
                            this.f17999j = 0;
                            this.f18002m = true;
                        }
                        if (this.f17999j == -2) {
                            if (hVar3 == null || 2 == hVar3.mo39827j()) {
                                this.f18004o.mo42436o0(f18069G);
                            } else if (hVar3.mo39825h().endsWith("chunked")) {
                                hVar3.mo39828k(this.f18004o);
                            } else {
                                throw new IllegalArgumentException("BAD TE");
                            }
                        }
                        if (this.f17999j == -1) {
                            this.f18003n = Boolean.FALSE;
                        } else {
                            z7 = z4;
                        }
                        if (mo39831I()) {
                            if (!this.f18003n.booleanValue() && (z3 || this.f17994e > 10)) {
                                this.f18004o.mo42436o0(f18066D);
                                if (sb != null) {
                                    C11940d dVar5 = this.f18004o;
                                    dVar5.mo42430h0(dVar5.mo42416U0() - 2);
                                    this.f18004o.mo42414S0((byte) 44);
                                    this.f18004o.mo42436o0(sb.toString().getBytes());
                                    this.f18004o.mo42436o0(f18068F);
                                }
                            } else if (z7) {
                                this.f18004o.mo42436o0(f18065C);
                                if (sb != null) {
                                    C11940d dVar6 = this.f18004o;
                                    dVar6.mo42430h0(dVar6.mo42416U0() - 2);
                                    this.f18004o.mo42414S0((byte) 44);
                                    this.f18004o.mo42436o0(sb.toString().getBytes());
                                    this.f18004o.mo42436o0(f18068F);
                                }
                            } else if (sb != null) {
                                this.f18004o.mo42436o0(f18067E);
                                this.f18004o.mo42436o0(sb.toString().getBytes());
                                this.f18004o.mo42436o0(f18068F);
                            }
                        }
                        if (!z2 && this.f17993d > 199 && mo39738y()) {
                            this.f18004o.mo42436o0(f18070H);
                        }
                        this.f18004o.mo42436o0(C9913o.f18124a);
                        this.f17992c = 2;
                    } catch (ArrayIndexOutOfBoundsException e3) {
                        throw new RuntimeException("Header>" + this.f18004o.capacity(), e3);
                    }
                } else {
                    throw new IllegalStateException("last?");
                }
            } else {
                throw new EofException();
            }
        }
    }

    public void reset() {
        C11950k kVar;
        Boolean bool = this.f18003n;
        if (bool != null && !bool.booleanValue() && (kVar = this.f17991b) != null && !kVar.mo39668r()) {
            try {
                this.f17991b.mo39670t();
            } catch (IOException e) {
                f18071y.mo36849d(e);
            }
        }
        super.reset();
        C11940d dVar = this.f18005p;
        if (dVar != null) {
            dVar.clear();
        }
        C11940d dVar2 = this.f18004o;
        if (dVar2 != null) {
            dVar2.clear();
        }
        if (this.f18006q != null) {
            this.f18006q = null;
        }
        this.f18073u = false;
        this.f18074v = false;
        this.f18075w = false;
        this.f18076x = false;
        this.f17996g = null;
        this.f17997h = null;
        this.f18002m = false;
    }

    public String toString() {
        Object[] objArr = new Object[5];
        objArr[0] = C9904i.class.getSimpleName();
        objArr[1] = Integer.valueOf(this.f17992c);
        C11940d dVar = this.f18004o;
        int i = -1;
        objArr[2] = Integer.valueOf(dVar == null ? -1 : dVar.length());
        C11940d dVar2 = this.f18005p;
        objArr[3] = Integer.valueOf(dVar2 == null ? -1 : dVar2.length());
        C11940d dVar3 = this.f18006q;
        if (dVar3 != null) {
            i = dVar3.length();
        }
        objArr[4] = Integer.valueOf(i);
        return String.format("%s{s=%d,h=%d,b=%d,c=%d}", objArr);
    }
}

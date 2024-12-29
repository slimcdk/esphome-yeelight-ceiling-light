package p225w5;

import com.xiaomi.mipush.sdk.Constants;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import org.eclipse.jetty.util.C9996o;
import p152e6.C9001b;
import p152e6.C9003c;
import p225w5.C11940d;
import p225w5.C11946h;

/* renamed from: w5.a */
public abstract class C11937a implements C11940d {

    /* renamed from: k */
    private static final C9003c f21808k = C9001b.m21450a(C11937a.class);

    /* renamed from: a */
    protected int f21809a;

    /* renamed from: b */
    protected boolean f21810b;

    /* renamed from: c */
    protected int f21811c;

    /* renamed from: d */
    protected int f21812d;

    /* renamed from: e */
    protected int f21813e;

    /* renamed from: f */
    protected int f21814f;

    /* renamed from: g */
    protected int f21815g;

    /* renamed from: h */
    protected int f21816h;

    /* renamed from: i */
    protected String f21817i;

    /* renamed from: j */
    protected C11952m f21818j;

    static {
        Class<C11937a> cls = C11937a.class;
        Boolean.getBoolean("org.eclipse.jetty.io.AbstractBuffer.boundsChecking");
    }

    public C11937a(int i, boolean z) {
        if (i != 0 || !z) {
            mo42427g1(-1);
            this.f21809a = i;
            this.f21810b = z;
            return;
        }
        throw new IllegalArgumentException("IMMUTABLE && VOLATILE");
    }

    /* renamed from: D0 */
    public int mo42404D0(byte[] bArr, int i, int i2) {
        int L0 = mo42409L0();
        int length = length();
        if (length == 0) {
            return -1;
        }
        if (i2 > length) {
            i2 = length;
        }
        int x0 = mo42453x0(L0, bArr, i, i2);
        if (x0 > 0) {
            mo42442v0(L0 + x0);
        }
        return x0;
    }

    /* renamed from: E0 */
    public int mo42405E0(C11940d dVar) {
        int U0 = mo42416U0();
        int f0 = mo42426f0(U0, dVar);
        mo42430h0(U0 + f0);
        return f0;
    }

    /* renamed from: F */
    public C11940d mo42406F() {
        return this;
    }

    /* renamed from: H0 */
    public void mo42407H0() {
        if (!mo42415T()) {
            int d0 = mo42424d0() >= 0 ? mo42424d0() : mo42409L0();
            if (d0 > 0) {
                byte[] g0 = mo42451g0();
                int U0 = mo42416U0() - d0;
                if (U0 > 0) {
                    if (g0 != null) {
                        System.arraycopy(mo42451g0(), d0, mo42451g0(), 0, U0);
                    } else {
                        mo42426f0(0, mo42445z(d0, U0));
                    }
                }
                if (mo42424d0() > 0) {
                    mo42427g1(mo42424d0() - d0);
                }
                mo42442v0(mo42409L0() - d0);
                mo42430h0(mo42416U0() - d0);
                return;
            }
            return;
        }
        throw new IllegalStateException("READONLY");
    }

    /* renamed from: J0 */
    public boolean mo42408J0() {
        return this.f21812d > this.f21811c;
    }

    /* renamed from: L0 */
    public final int mo42409L0() {
        return this.f21811c;
    }

    /* renamed from: M0 */
    public int mo42410M0() {
        return capacity() - this.f21812d;
    }

    /* renamed from: N */
    public byte[] mo42411N() {
        int length = length();
        byte[] bArr = new byte[length];
        byte[] g0 = mo42451g0();
        if (g0 != null) {
            System.arraycopy(g0, mo42409L0(), bArr, 0, length);
        } else {
            mo42453x0(mo42409L0(), bArr, 0, length());
        }
        return bArr;
    }

    /* renamed from: N0 */
    public C11940d mo42412N0() {
        return mo42422c((mo42409L0() - mo42424d0()) - 1);
    }

    /* renamed from: P */
    public String mo42413P() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(super.hashCode());
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb.append(mo42406F().hashCode());
        sb.append(",m=");
        sb.append(mo42424d0());
        sb.append(",g=");
        sb.append(mo42409L0());
        sb.append(",p=");
        sb.append(mo42416U0());
        sb.append(",c=");
        sb.append(capacity());
        sb.append("]={");
        if (mo42424d0() >= 0) {
            for (int d0 = mo42424d0(); d0 < mo42409L0(); d0++) {
                C9996o.m24719f(mo42449W(d0), sb);
            }
            sb.append("}{");
        }
        int i = 0;
        int L0 = mo42409L0();
        while (L0 < mo42416U0()) {
            C9996o.m24719f(mo42449W(L0), sb);
            int i2 = i + 1;
            if (i == 50 && mo42416U0() - L0 > 20) {
                sb.append(" ... ");
                L0 = mo42416U0() - 20;
            }
            L0++;
            i = i2;
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: S0 */
    public void mo42414S0(byte b) {
        int U0 = mo42416U0();
        mo42452p0(U0, b);
        mo42430h0(U0 + 1);
    }

    /* renamed from: T */
    public boolean mo42415T() {
        return this.f21809a <= 1;
    }

    /* renamed from: U0 */
    public final int mo42416U0() {
        return this.f21812d;
    }

    /* renamed from: V */
    public String mo42417V(Charset charset) {
        try {
            byte[] g0 = mo42451g0();
            return g0 != null ? new String(g0, mo42409L0(), length(), charset) : new String(mo42411N(), 0, length(), charset);
        } catch (Exception e) {
            f21808k.mo36856j(e);
            return new String(mo42411N(), 0, length());
        }
    }

    /* renamed from: Z0 */
    public boolean mo42418Z0(C11940d dVar) {
        int i;
        if (dVar == this) {
            return true;
        }
        if (dVar.length() != length()) {
            return false;
        }
        int i2 = this.f21813e;
        if (i2 != 0 && (dVar instanceof C11937a) && (i = ((C11937a) dVar).f21813e) != 0 && i2 != i) {
            return false;
        }
        int L0 = mo42409L0();
        int U0 = dVar.mo42416U0();
        byte[] g0 = mo42451g0();
        byte[] g02 = dVar.mo42451g0();
        if (g0 != null && g02 != null) {
            int U02 = mo42416U0();
            while (true) {
                int i3 = U02 - 1;
                if (U02 <= L0) {
                    break;
                }
                byte b = g0[i3];
                U0--;
                byte b2 = g02[U0];
                if (b != b2) {
                    if (97 <= b && b <= 122) {
                        b = (byte) ((b - 97) + 65);
                    }
                    if (97 <= b2 && b2 <= 122) {
                        b2 = (byte) ((b2 - 97) + 65);
                    }
                    if (b != b2) {
                        return false;
                    }
                }
                U02 = i3;
            }
        } else {
            int U03 = mo42416U0();
            while (true) {
                int i4 = U03 - 1;
                if (U03 <= L0) {
                    break;
                }
                byte W = mo42449W(i4);
                U0--;
                byte W2 = dVar.mo42449W(U0);
                if (W != W2) {
                    if (97 <= W && W <= 122) {
                        W = (byte) ((W - 97) + 65);
                    }
                    if (97 <= W2 && W2 <= 122) {
                        W2 = (byte) ((W2 - 97) + 65);
                    }
                    if (W != W2) {
                        return false;
                    }
                }
                U03 = i4;
            }
        }
        return true;
    }

    /* renamed from: a */
    public C11946h mo42419a(int i) {
        return ((this instanceof C11940d.C11941a) || (mo42406F() instanceof C11940d.C11941a)) ? new C11946h.C11947a(mo42411N(), 0, length(), i) : new C11946h(mo42411N(), 0, length(), i);
    }

    /* renamed from: b */
    public int mo42420b(byte[] bArr, int i, int i2) {
        int U0 = mo42416U0();
        int m = mo42435m(U0, bArr, i, i2);
        mo42430h0(U0 + m);
        return m;
    }

    /* renamed from: b1 */
    public C11940d mo42421b1() {
        return mo42438r0() ? this : mo42419a(0);
    }

    /* renamed from: c */
    public C11940d mo42422c(int i) {
        if (mo42424d0() < 0) {
            return null;
        }
        C11940d z = mo42445z(mo42424d0(), i);
        mo42427g1(-1);
        return z;
    }

    public void clear() {
        mo42427g1(-1);
        mo42442v0(0);
        mo42430h0(0);
    }

    /* renamed from: d0 */
    public int mo42424d0() {
        return this.f21816h;
    }

    public boolean equals(Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C11940d)) {
            return false;
        }
        C11940d dVar = (C11940d) obj;
        if ((this instanceof C11940d.C11941a) || (dVar instanceof C11940d.C11941a)) {
            return mo42418Z0(dVar);
        }
        if (dVar.length() != length()) {
            return false;
        }
        int i2 = this.f21813e;
        if (i2 != 0 && (obj instanceof C11937a) && (i = ((C11937a) obj).f21813e) != 0 && i2 != i) {
            return false;
        }
        int L0 = mo42409L0();
        int U0 = dVar.mo42416U0();
        int U02 = mo42416U0();
        while (true) {
            int i3 = U02 - 1;
            if (U02 <= L0) {
                return true;
            }
            U0--;
            if (mo42449W(i3) != dVar.mo42449W(U0)) {
                return false;
            }
            U02 = i3;
        }
    }

    /* renamed from: f0 */
    public int mo42426f0(int i, C11940d dVar) {
        int i2 = 0;
        this.f21813e = 0;
        int length = dVar.length();
        if (i + length > capacity()) {
            length = capacity() - i;
        }
        byte[] g0 = dVar.mo42451g0();
        byte[] g02 = mo42451g0();
        if (g0 != null && g02 != null) {
            System.arraycopy(g0, dVar.mo42409L0(), g02, i, length);
        } else if (g0 != null) {
            int L0 = dVar.mo42409L0();
            while (i2 < length) {
                mo42452p0(i, g0[L0]);
                i2++;
                i++;
                L0++;
            }
        } else {
            int L02 = dVar.mo42409L0();
            if (g02 != null) {
                while (i2 < length) {
                    g02[i] = dVar.mo42449W(L02);
                    i2++;
                    i++;
                    L02++;
                }
            } else {
                while (i2 < length) {
                    mo42452p0(i, dVar.mo42449W(L02));
                    i2++;
                    i++;
                    L02++;
                }
            }
        }
        return length;
    }

    /* renamed from: g1 */
    public void mo42427g1(int i) {
        this.f21816h = i;
    }

    public byte get() {
        int i = this.f21811c;
        this.f21811c = i + 1;
        return mo42449W(i);
    }

    public C11940d get(int i) {
        int L0 = mo42409L0();
        C11940d z = mo42445z(L0, i);
        mo42442v0(L0 + i);
        return z;
    }

    /* renamed from: h0 */
    public void mo42430h0(int i) {
        this.f21812d = i;
        this.f21813e = 0;
    }

    public int hashCode() {
        if (!(this.f21813e != 0 && this.f21814f == this.f21811c && this.f21815g == this.f21812d)) {
            int L0 = mo42409L0();
            byte[] g0 = mo42451g0();
            if (g0 != null) {
                int U0 = mo42416U0();
                while (true) {
                    int i = U0 - 1;
                    if (U0 <= L0) {
                        break;
                    }
                    byte b = g0[i];
                    if (97 <= b && b <= 122) {
                        b = (byte) ((b - 97) + 65);
                    }
                    this.f21813e = (this.f21813e * 31) + b;
                    U0 = i;
                }
            } else {
                int U02 = mo42416U0();
                while (true) {
                    int i2 = U02 - 1;
                    if (U02 <= L0) {
                        break;
                    }
                    byte W = mo42449W(i2);
                    if (97 <= W && W <= 122) {
                        W = (byte) ((W - 97) + 65);
                    }
                    this.f21813e = (this.f21813e * 31) + W;
                    U02 = i2;
                }
            }
            if (this.f21813e == 0) {
                this.f21813e = -1;
            }
            this.f21814f = this.f21811c;
            this.f21815g = this.f21812d;
        }
        return this.f21813e;
    }

    /* renamed from: k0 */
    public boolean mo42432k0() {
        return this.f21810b;
    }

    /* renamed from: l */
    public void mo42433l(OutputStream outputStream) {
        byte[] g0 = mo42451g0();
        if (g0 != null) {
            outputStream.write(g0, mo42409L0(), length());
        } else {
            int length = length();
            int i = 1024;
            if (length <= 1024) {
                i = length;
            }
            byte[] bArr = new byte[i];
            int i2 = this.f21811c;
            while (length > 0) {
                int x0 = mo42453x0(i2, bArr, 0, length > i ? i : length);
                outputStream.write(bArr, 0, x0);
                i2 += x0;
                length -= x0;
            }
        }
        clear();
    }

    public int length() {
        return this.f21812d - this.f21811c;
    }

    /* renamed from: m */
    public int mo42435m(int i, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        this.f21813e = 0;
        if (i + i3 > capacity()) {
            i3 = capacity() - i;
        }
        byte[] g0 = mo42451g0();
        if (g0 != null) {
            System.arraycopy(bArr, i2, g0, i, i3);
        } else {
            while (i4 < i3) {
                mo42452p0(i, bArr[i2]);
                i4++;
                i++;
                i2++;
            }
        }
        return i3;
    }

    /* renamed from: o0 */
    public int mo42436o0(byte[] bArr) {
        int U0 = mo42416U0();
        int m = mo42435m(U0, bArr, 0, bArr.length);
        mo42430h0(U0 + m);
        return m;
    }

    public byte peek() {
        return mo42449W(this.f21811c);
    }

    /* renamed from: r0 */
    public boolean mo42438r0() {
        return this.f21809a <= 0;
    }

    public String toString() {
        if (!mo42438r0()) {
            return new String(mo42411N(), 0, length());
        }
        if (this.f21817i == null) {
            this.f21817i = new String(mo42411N(), 0, length());
        }
        return this.f21817i;
    }

    public String toString(String str) {
        try {
            byte[] g0 = mo42451g0();
            return g0 != null ? new String(g0, mo42409L0(), length(), str) : new String(mo42411N(), 0, length(), str);
        } catch (Exception e) {
            f21808k.mo36856j(e);
            return new String(mo42411N(), 0, length());
        }
    }

    /* renamed from: u0 */
    public int mo42441u0(int i) {
        if (length() < i) {
            i = length();
        }
        mo42442v0(mo42409L0() + i);
        return i;
    }

    /* renamed from: v0 */
    public void mo42442v0(int i) {
        this.f21811c = i;
        this.f21813e = 0;
    }

    /* renamed from: w0 */
    public void mo42443w0() {
        mo42427g1(this.f21811c - 1);
    }

    /* renamed from: y0 */
    public int mo42444y0(InputStream inputStream, int i) {
        byte[] g0 = mo42451g0();
        int M0 = mo42410M0();
        if (M0 <= i) {
            i = M0;
        }
        if (g0 != null) {
            int read = inputStream.read(g0, this.f21812d, i);
            if (read > 0) {
                this.f21812d += read;
            }
            return read;
        }
        int i2 = 1024;
        if (i <= 1024) {
            i2 = i;
        }
        byte[] bArr = new byte[i2];
        while (i > 0) {
            int read2 = inputStream.read(bArr, 0, i2);
            if (read2 < 0) {
                return -1;
            }
            mo42420b(bArr, 0, read2);
            i -= read2;
        }
        return 0;
    }

    /* renamed from: z */
    public C11940d mo42445z(int i, int i2) {
        C11952m mVar = this.f21818j;
        if (mVar == null) {
            this.f21818j = new C11952m(this, -1, i, i + i2, mo42415T() ? 1 : 2);
        } else {
            mVar.mo42496e(mo42406F());
            this.f21818j.mo42427g1(-1);
            this.f21818j.mo42442v0(0);
            this.f21818j.mo42430h0(i2 + i);
            this.f21818j.mo42442v0(i);
        }
        return this.f21818j;
    }
}

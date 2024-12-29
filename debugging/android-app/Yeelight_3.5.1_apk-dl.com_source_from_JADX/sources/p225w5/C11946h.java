package p225w5;

import java.io.InputStream;
import java.io.OutputStream;
import org.eclipse.jetty.util.C9995n;
import p225w5.C11940d;

/* renamed from: w5.h */
public class C11946h extends C11937a {

    /* renamed from: l */
    protected final byte[] f21832l;

    /* renamed from: w5.h$a */
    public static class C11947a extends C11946h implements C11940d.C11941a {
        public C11947a(String str) {
            super(str);
        }

        public C11947a(byte[] bArr, int i, int i2, int i3) {
            super(bArr, i, i2, i3);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C11940d) && mo42418Z0((C11940d) obj);
        }
    }

    public C11946h(int i) {
        this(new byte[i], 0, 0, 2);
        mo42430h0(0);
    }

    protected C11946h(int i, int i2, boolean z) {
        this(new byte[i], 0, 0, i2, z);
    }

    public C11946h(String str) {
        super(2, false);
        byte[] c = C9995n.m24707c(str);
        this.f21832l = c;
        mo42442v0(0);
        mo42430h0(c.length);
        this.f21809a = 0;
        this.f21817i = str;
    }

    public C11946h(String str, String str2) {
        super(2, false);
        byte[] bytes = str.getBytes(str2);
        this.f21832l = bytes;
        mo42442v0(0);
        mo42430h0(bytes.length);
        this.f21809a = 0;
        this.f21817i = str;
    }

    public C11946h(byte[] bArr) {
        this(bArr, 0, bArr.length, 2);
    }

    public C11946h(byte[] bArr, int i, int i2) {
        this(bArr, i, i2, 2);
    }

    public C11946h(byte[] bArr, int i, int i2, int i3) {
        super(2, false);
        this.f21832l = bArr;
        mo42430h0(i2 + i);
        mo42442v0(i);
        this.f21809a = i3;
    }

    public C11946h(byte[] bArr, int i, int i2, int i3, boolean z) {
        super(2, z);
        this.f21832l = bArr;
        mo42430h0(i2 + i);
        mo42442v0(i);
        this.f21809a = i3;
    }

    /* renamed from: H0 */
    public void mo42407H0() {
        if (!mo42415T()) {
            int d0 = mo42424d0() >= 0 ? mo42424d0() : mo42409L0();
            if (d0 > 0) {
                int U0 = mo42416U0() - d0;
                if (U0 > 0) {
                    byte[] bArr = this.f21832l;
                    System.arraycopy(bArr, d0, bArr, 0, U0);
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

    /* renamed from: M0 */
    public int mo42410M0() {
        return this.f21832l.length - this.f21812d;
    }

    /* renamed from: W */
    public byte mo42449W(int i) {
        return this.f21832l[i];
    }

    /* renamed from: Z0 */
    public boolean mo42418Z0(C11940d dVar) {
        int i;
        if (dVar == this) {
            return true;
        }
        if (dVar == null || dVar.length() != length()) {
            return false;
        }
        int i2 = this.f21813e;
        if (i2 != 0 && (dVar instanceof C11937a) && (i = ((C11937a) dVar).f21813e) != 0 && i2 != i) {
            return false;
        }
        int L0 = mo42409L0();
        int U0 = dVar.mo42416U0();
        byte[] g0 = dVar.mo42451g0();
        if (g0 != null) {
            int U02 = mo42416U0();
            while (true) {
                int i3 = U02 - 1;
                if (U02 <= L0) {
                    break;
                }
                byte b = this.f21832l[i3];
                U0--;
                byte b2 = g0[U0];
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
                byte b3 = this.f21832l[i4];
                U0--;
                byte W = dVar.mo42449W(U0);
                if (b3 != W) {
                    if (97 <= b3 && b3 <= 122) {
                        b3 = (byte) ((b3 - 97) + 65);
                    }
                    if (97 <= W && W <= 122) {
                        W = (byte) ((W - 97) + 65);
                    }
                    if (b3 != W) {
                        return false;
                    }
                }
                U03 = i4;
            }
        }
        return true;
    }

    public int capacity() {
        return this.f21832l.length;
    }

    public boolean equals(Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C11940d)) {
            return false;
        }
        if (obj instanceof C11940d.C11941a) {
            return mo42418Z0((C11940d) obj);
        }
        C11940d dVar = (C11940d) obj;
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
            if (this.f21832l[i3] != dVar.mo42449W(U0)) {
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
        if (g0 != null) {
            System.arraycopy(g0, dVar.mo42409L0(), this.f21832l, i, length);
        } else {
            int L0 = dVar.mo42409L0();
            while (i2 < length) {
                this.f21832l[i] = dVar.mo42449W(L0);
                i2++;
                i++;
                L0++;
            }
        }
        return length;
    }

    /* renamed from: g0 */
    public byte[] mo42451g0() {
        return this.f21832l;
    }

    public byte get() {
        byte[] bArr = this.f21832l;
        int i = this.f21811c;
        this.f21811c = i + 1;
        return bArr[i];
    }

    public int hashCode() {
        if (!(this.f21813e != 0 && this.f21814f == this.f21811c && this.f21815g == this.f21812d)) {
            int L0 = mo42409L0();
            int U0 = mo42416U0();
            while (true) {
                int i = U0 - 1;
                if (U0 <= L0) {
                    break;
                }
                byte b = this.f21832l[i];
                if (97 <= b && b <= 122) {
                    b = (byte) ((b - 97) + 65);
                }
                this.f21813e = (this.f21813e * 31) + b;
                U0 = i;
            }
            if (this.f21813e == 0) {
                this.f21813e = -1;
            }
            this.f21814f = this.f21811c;
            this.f21815g = this.f21812d;
        }
        return this.f21813e;
    }

    /* renamed from: l */
    public void mo42433l(OutputStream outputStream) {
        outputStream.write(this.f21832l, mo42409L0(), length());
        if (!mo42438r0()) {
            clear();
        }
    }

    /* renamed from: m */
    public int mo42435m(int i, byte[] bArr, int i2, int i3) {
        this.f21813e = 0;
        if (i + i3 > capacity()) {
            i3 = capacity() - i;
        }
        System.arraycopy(bArr, i2, this.f21832l, i, i3);
        return i3;
    }

    /* renamed from: p0 */
    public void mo42452p0(int i, byte b) {
        this.f21832l[i] = b;
    }

    /* renamed from: x0 */
    public int mo42453x0(int i, byte[] bArr, int i2, int i3) {
        if ((i + i3 > capacity() && (i3 = capacity() - i) == 0) || i3 < 0) {
            return -1;
        }
        System.arraycopy(this.f21832l, i, bArr, i2, i3);
        return i3;
    }

    /* renamed from: y0 */
    public int mo42444y0(InputStream inputStream, int i) {
        if (i < 0 || i > mo42410M0()) {
            i = mo42410M0();
        }
        int U0 = mo42416U0();
        int i2 = 0;
        int i3 = i;
        int i4 = 0;
        while (i2 < i) {
            i4 = inputStream.read(this.f21832l, U0, i3);
            if (i4 < 0) {
                break;
            }
            if (i4 > 0) {
                U0 += i4;
                i2 += i4;
                i3 -= i4;
                mo42430h0(U0);
            }
            if (inputStream.available() <= 0) {
                break;
            }
        }
        if (i4 >= 0 || i2 != 0) {
            return i2;
        }
        return -1;
    }
}

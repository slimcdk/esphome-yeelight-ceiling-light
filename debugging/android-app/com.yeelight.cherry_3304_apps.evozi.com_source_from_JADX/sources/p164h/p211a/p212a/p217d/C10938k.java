package p164h.p211a.p212a.p217d;

import java.io.InputStream;
import java.io.OutputStream;
import p164h.p211a.p212a.p217d.C10929e;
import p164h.p211a.p212a.p228h.C11137q;

/* renamed from: h.a.a.d.k */
public class C10938k extends C10924a {

    /* renamed from: l */
    protected final byte[] f21323l;

    /* renamed from: h.a.a.d.k$a */
    public static class C10939a extends C10938k implements C10929e.C10930a {
        public C10939a(String str) {
            super(str);
        }

        public C10939a(byte[] bArr, int i, int i2, int i3) {
            super(bArr, i, i2, i3);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C10929e) && mo34585m0((C10929e) obj);
        }
    }

    public C10938k(int i) {
        this(new byte[i], 0, 0, 2);
        mo34575f0(0);
    }

    protected C10938k(int i, int i2, boolean z) {
        this(new byte[i], 0, 0, i2, z);
    }

    public C10938k(String str) {
        super(2, false);
        this.f21323l = C11137q.m28920c(str);
        mo34592v0(0);
        mo34575f0(this.f21323l.length);
        this.f21290a = 0;
        this.f21298i = str;
    }

    public C10938k(String str, String str2) {
        super(2, false);
        this.f21323l = str.getBytes(str2);
        mo34592v0(0);
        mo34575f0(this.f21323l.length);
        this.f21290a = 0;
        this.f21298i = str;
    }

    public C10938k(byte[] bArr) {
        this(bArr, 0, bArr.length, 2);
    }

    public C10938k(byte[] bArr, int i, int i2) {
        this(bArr, i, i2, 2);
    }

    public C10938k(byte[] bArr, int i, int i2, int i3) {
        super(2, false);
        this.f21323l = bArr;
        mo34575f0(i2 + i);
        mo34592v0(i);
        this.f21290a = i3;
    }

    public C10938k(byte[] bArr, int i, int i2, int i3, boolean z) {
        super(2, z);
        this.f21323l = bArr;
        mo34575f0(i2 + i);
        mo34592v0(i);
        this.f21290a = i3;
    }

    /* renamed from: D0 */
    public void mo34555D0() {
        if (!mo34564V()) {
            int c0 = mo34571c0() >= 0 ? mo34571c0() : getIndex();
            if (c0 > 0) {
                int S0 = mo34562S0() - c0;
                if (S0 > 0) {
                    byte[] bArr = this.f21323l;
                    System.arraycopy(bArr, c0, bArr, 0, S0);
                }
                if (mo34571c0() > 0) {
                    mo34573e1(mo34571c0() - c0);
                }
                mo34592v0(getIndex() - c0);
                mo34575f0(mo34562S0() - c0);
                return;
            }
            return;
        }
        throw new IllegalStateException("READONLY");
    }

    /* renamed from: I0 */
    public int mo34558I0() {
        return this.f21323l.length - this.f21293d;
    }

    /* renamed from: X */
    public byte mo34606X(int i) {
        return this.f21323l[i];
    }

    public int capacity() {
        return this.f21323l.length;
    }

    /* renamed from: e0 */
    public byte[] mo34608e0() {
        return this.f21323l;
    }

    public boolean equals(Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C10929e)) {
            return false;
        }
        if (obj instanceof C10929e.C10930a) {
            return mo34585m0((C10929e) obj);
        }
        C10929e eVar = (C10929e) obj;
        if (eVar.length() != length()) {
            return false;
        }
        int i2 = this.f21294e;
        if (i2 != 0 && (obj instanceof C10924a) && (i = ((C10924a) obj).f21294e) != 0 && i2 != i) {
            return false;
        }
        int index = getIndex();
        int S0 = eVar.mo34562S0();
        int S02 = mo34562S0();
        while (true) {
            int i3 = S02 - 1;
            if (S02 <= index) {
                return true;
            }
            S0--;
            if (this.f21323l[i3] != eVar.mo34606X(S0)) {
                return false;
            }
            S02 = i3;
        }
    }

    /* renamed from: g */
    public int mo34576g(int i, C10929e eVar) {
        int i2 = 0;
        this.f21294e = 0;
        int length = eVar.length();
        if (i + length > capacity()) {
            length = capacity() - i;
        }
        byte[] e0 = eVar.mo34608e0();
        if (e0 != null) {
            System.arraycopy(e0, eVar.getIndex(), this.f21323l, i, length);
        } else {
            int index = eVar.getIndex();
            while (i2 < length) {
                this.f21323l[i] = eVar.mo34606X(index);
                i2++;
                i++;
                index++;
            }
        }
        return length;
    }

    public byte get() {
        byte[] bArr = this.f21323l;
        int i = this.f21292c;
        this.f21292c = i + 1;
        return bArr[i];
    }

    /* renamed from: h */
    public int mo34580h(int i, byte[] bArr, int i2, int i3) {
        this.f21294e = 0;
        if (i + i3 > capacity()) {
            i3 = capacity() - i;
        }
        System.arraycopy(bArr, i2, this.f21323l, i, i3);
        return i3;
    }

    public int hashCode() {
        if (!(this.f21294e != 0 && this.f21295f == this.f21292c && this.f21296g == this.f21293d)) {
            int index = getIndex();
            int S0 = mo34562S0();
            while (true) {
                int i = S0 - 1;
                if (S0 <= index) {
                    break;
                }
                byte b = this.f21323l[i];
                if (97 <= b && b <= 122) {
                    b = (byte) ((b - 97) + 65);
                }
                this.f21294e = (this.f21294e * 31) + b;
                S0 = i;
            }
            if (this.f21294e == 0) {
                this.f21294e = -1;
            }
            this.f21295f = this.f21292c;
            this.f21296g = this.f21293d;
        }
        return this.f21294e;
    }

    /* renamed from: m0 */
    public boolean mo34585m0(C10929e eVar) {
        int i;
        if (eVar == this) {
            return true;
        }
        if (eVar == null || eVar.length() != length()) {
            return false;
        }
        int i2 = this.f21294e;
        if (i2 != 0 && (eVar instanceof C10924a) && (i = ((C10924a) eVar).f21294e) != 0 && i2 != i) {
            return false;
        }
        int index = getIndex();
        int S0 = eVar.mo34562S0();
        byte[] e0 = eVar.mo34608e0();
        if (e0 != null) {
            int S02 = mo34562S0();
            while (true) {
                int i3 = S02 - 1;
                if (S02 <= index) {
                    break;
                }
                byte b = this.f21323l[i3];
                S0--;
                byte b2 = e0[S0];
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
                S02 = i3;
            }
        } else {
            int S03 = mo34562S0();
            while (true) {
                int i4 = S03 - 1;
                if (S03 <= index) {
                    break;
                }
                byte b3 = this.f21323l[i4];
                S0--;
                byte X = eVar.mo34606X(S0);
                if (b3 != X) {
                    if (97 <= b3 && b3 <= 122) {
                        b3 = (byte) ((b3 - 97) + 65);
                    }
                    if (97 <= X && X <= 122) {
                        X = (byte) ((X - 97) + 65);
                    }
                    if (b3 != X) {
                        return false;
                    }
                }
                S03 = i4;
            }
        }
        return true;
    }

    /* renamed from: o0 */
    public void mo34609o0(int i, byte b) {
        this.f21323l[i] = b;
    }

    public void writeTo(OutputStream outputStream) {
        outputStream.write(this.f21323l, getIndex(), length());
        if (!mo34588r0()) {
            clear();
        }
    }

    /* renamed from: x0 */
    public int mo34610x0(int i, byte[] bArr, int i2, int i3) {
        if ((i + i3 > capacity() && (i3 = capacity() - i) == 0) || i3 < 0) {
            return -1;
        }
        System.arraycopy(this.f21323l, i, bArr, i2, i3);
        return i3;
    }

    /* renamed from: y0 */
    public int mo34595y0(InputStream inputStream, int i) {
        if (i < 0 || i > mo34558I0()) {
            i = mo34558I0();
        }
        int S0 = mo34562S0();
        int i2 = 0;
        int i3 = i;
        int i4 = 0;
        while (i2 < i) {
            i4 = inputStream.read(this.f21323l, S0, i3);
            if (i4 < 0) {
                break;
            }
            if (i4 > 0) {
                S0 += i4;
                i2 += i4;
                i3 -= i4;
                mo34575f0(S0);
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

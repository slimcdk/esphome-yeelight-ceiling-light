package p164h.p211a.p212a.p217d;

import com.xiaomi.mipush.sdk.Constants;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import p164h.p211a.p212a.p217d.C10929e;
import p164h.p211a.p212a.p217d.C10938k;
import p164h.p211a.p212a.p228h.C11138r;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.d.a */
public abstract class C10924a implements C10929e {

    /* renamed from: k */
    private static final C11158c f21289k = C11156b.m29015a(C10924a.class);

    /* renamed from: a */
    protected int f21290a;

    /* renamed from: b */
    protected boolean f21291b;

    /* renamed from: c */
    protected int f21292c;

    /* renamed from: d */
    protected int f21293d;

    /* renamed from: e */
    protected int f21294e;

    /* renamed from: f */
    protected int f21295f;

    /* renamed from: g */
    protected int f21296g;

    /* renamed from: h */
    protected int f21297h;

    /* renamed from: i */
    protected String f21298i;

    /* renamed from: j */
    protected C10950t f21299j;

    static {
        Class<C10924a> cls = C10924a.class;
        Boolean.getBoolean("org.eclipse.jetty.io.AbstractBuffer.boundsChecking");
    }

    public C10924a(int i, boolean z) {
        if (i != 0 || !z) {
            mo34573e1(-1);
            this.f21290a = i;
            this.f21291b = z;
            return;
        }
        throw new IllegalArgumentException("IMMUTABLE && VOLATILE");
    }

    /* renamed from: B0 */
    public int mo34554B0(byte[] bArr, int i, int i2) {
        int index = getIndex();
        int length = length();
        if (length == 0) {
            return -1;
        }
        if (i2 > length) {
            i2 = length;
        }
        int x0 = mo34610x0(index, bArr, i, i2);
        if (x0 > 0) {
            mo34592v0(index + x0);
        }
        return x0;
    }

    /* renamed from: D0 */
    public void mo34555D0() {
        if (!mo34564V()) {
            int c0 = mo34571c0() >= 0 ? mo34571c0() : getIndex();
            if (c0 > 0) {
                byte[] e0 = mo34608e0();
                int S0 = mo34562S0() - c0;
                if (S0 > 0) {
                    if (e0 != null) {
                        System.arraycopy(mo34608e0(), c0, mo34608e0(), 0, S0);
                    } else {
                        mo34576g(0, mo34582i(c0, S0));
                    }
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

    /* renamed from: F0 */
    public boolean mo34556F0() {
        return this.f21293d > this.f21292c;
    }

    /* renamed from: H */
    public C10929e mo34557H() {
        return this;
    }

    /* renamed from: I0 */
    public int mo34558I0() {
        return capacity() - this.f21293d;
    }

    /* renamed from: J0 */
    public C10929e mo34559J0() {
        return mo34570c((getIndex() - mo34571c0()) - 1);
    }

    /* renamed from: Q0 */
    public void mo34560Q0(byte b) {
        int S0 = mo34562S0();
        mo34609o0(S0, b);
        mo34575f0(S0 + 1);
    }

    /* renamed from: R */
    public byte[] mo34561R() {
        int length = length();
        byte[] bArr = new byte[length];
        byte[] e0 = mo34608e0();
        if (e0 != null) {
            System.arraycopy(e0, getIndex(), bArr, 0, length);
        } else {
            mo34610x0(getIndex(), bArr, 0, length());
        }
        return bArr;
    }

    /* renamed from: S0 */
    public final int mo34562S0() {
        return this.f21293d;
    }

    /* renamed from: T */
    public String mo34563T() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(super.hashCode());
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb.append(mo34557H().hashCode());
        sb.append(",m=");
        sb.append(mo34571c0());
        sb.append(",g=");
        sb.append(getIndex());
        sb.append(",p=");
        sb.append(mo34562S0());
        sb.append(",c=");
        sb.append(capacity());
        sb.append("]={");
        if (mo34571c0() >= 0) {
            for (int c0 = mo34571c0(); c0 < getIndex(); c0++) {
                C11138r.m28931e(mo34606X(c0), sb);
            }
            sb.append("}{");
        }
        int i = 0;
        int index = getIndex();
        while (index < mo34562S0()) {
            C11138r.m28931e(mo34606X(index), sb);
            int i2 = i + 1;
            if (i == 50 && mo34562S0() - index > 20) {
                sb.append(" ... ");
                index = mo34562S0() - 20;
            }
            index++;
            i = i2;
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: V */
    public boolean mo34564V() {
        return this.f21290a <= 1;
    }

    /* renamed from: W */
    public String mo34565W(Charset charset) {
        try {
            byte[] e0 = mo34608e0();
            return e0 != null ? new String(e0, getIndex(), length(), charset) : new String(mo34561R(), 0, length(), charset);
        } catch (Exception e) {
            f21289k.mo35495k(e);
            return new String(mo34561R(), 0, length());
        }
    }

    /* renamed from: Y0 */
    public C10929e mo34566Y0() {
        return mo34588r0() ? this : mo34568a(0);
    }

    /* renamed from: Z */
    public int mo34567Z(C10929e eVar) {
        int S0 = mo34562S0();
        int g = mo34576g(S0, eVar);
        mo34575f0(S0 + g);
        return g;
    }

    /* renamed from: a */
    public C10938k mo34568a(int i) {
        return ((this instanceof C10929e.C10930a) || (mo34557H() instanceof C10929e.C10930a)) ? new C10938k.C10939a(mo34561R(), 0, length(), i) : new C10938k(mo34561R(), 0, length(), i);
    }

    /* renamed from: b */
    public int mo34569b(byte[] bArr, int i, int i2) {
        int S0 = mo34562S0();
        int h = mo34580h(S0, bArr, i, i2);
        mo34575f0(S0 + h);
        return h;
    }

    /* renamed from: c */
    public C10929e mo34570c(int i) {
        if (mo34571c0() < 0) {
            return null;
        }
        C10929e i2 = mo34582i(mo34571c0(), i);
        mo34573e1(-1);
        return i2;
    }

    /* renamed from: c0 */
    public int mo34571c0() {
        return this.f21297h;
    }

    public void clear() {
        mo34573e1(-1);
        mo34592v0(0);
        mo34575f0(0);
    }

    /* renamed from: e1 */
    public void mo34573e1(int i) {
        this.f21297h = i;
    }

    public boolean equals(Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C10929e)) {
            return false;
        }
        C10929e eVar = (C10929e) obj;
        if ((this instanceof C10929e.C10930a) || (eVar instanceof C10929e.C10930a)) {
            return mo34585m0(eVar);
        }
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
            if (mo34606X(i3) != eVar.mo34606X(S0)) {
                return false;
            }
            S02 = i3;
        }
    }

    /* renamed from: f0 */
    public void mo34575f0(int i) {
        this.f21293d = i;
        this.f21294e = 0;
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
        byte[] e02 = mo34608e0();
        if (e0 != null && e02 != null) {
            System.arraycopy(e0, eVar.getIndex(), e02, i, length);
        } else if (e0 != null) {
            int index = eVar.getIndex();
            while (i2 < length) {
                mo34609o0(i, e0[index]);
                i2++;
                i++;
                index++;
            }
        } else {
            int index2 = eVar.getIndex();
            if (e02 != null) {
                while (i2 < length) {
                    e02[i] = eVar.mo34606X(index2);
                    i2++;
                    i++;
                    index2++;
                }
            } else {
                while (i2 < length) {
                    mo34609o0(i, eVar.mo34606X(index2));
                    i2++;
                    i++;
                    index2++;
                }
            }
        }
        return length;
    }

    public byte get() {
        int i = this.f21292c;
        this.f21292c = i + 1;
        return mo34606X(i);
    }

    public C10929e get(int i) {
        int index = getIndex();
        C10929e i2 = mo34582i(index, i);
        mo34592v0(index + i);
        return i2;
    }

    public final int getIndex() {
        return this.f21292c;
    }

    /* renamed from: h */
    public int mo34580h(int i, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        this.f21294e = 0;
        if (i + i3 > capacity()) {
            i3 = capacity() - i;
        }
        byte[] e0 = mo34608e0();
        if (e0 != null) {
            System.arraycopy(bArr, i2, e0, i, i3);
        } else {
            while (i4 < i3) {
                mo34609o0(i, bArr[i2]);
                i4++;
                i++;
                i2++;
            }
        }
        return i3;
    }

    public int hashCode() {
        if (!(this.f21294e != 0 && this.f21295f == this.f21292c && this.f21296g == this.f21293d)) {
            int index = getIndex();
            byte[] e0 = mo34608e0();
            if (e0 != null) {
                int S0 = mo34562S0();
                while (true) {
                    int i = S0 - 1;
                    if (S0 <= index) {
                        break;
                    }
                    byte b = e0[i];
                    if (97 <= b && b <= 122) {
                        b = (byte) ((b - 97) + 65);
                    }
                    this.f21294e = (this.f21294e * 31) + b;
                    S0 = i;
                }
            } else {
                int S02 = mo34562S0();
                while (true) {
                    int i2 = S02 - 1;
                    if (S02 <= index) {
                        break;
                    }
                    byte X = mo34606X(i2);
                    if (97 <= X && X <= 122) {
                        X = (byte) ((X - 97) + 65);
                    }
                    this.f21294e = (this.f21294e * 31) + X;
                    S02 = i2;
                }
            }
            if (this.f21294e == 0) {
                this.f21294e = -1;
            }
            this.f21295f = this.f21292c;
            this.f21296g = this.f21293d;
        }
        return this.f21294e;
    }

    /* renamed from: i */
    public C10929e mo34582i(int i, int i2) {
        C10950t tVar = this.f21299j;
        if (tVar == null) {
            this.f21299j = new C10950t(this, -1, i, i + i2, mo34564V() ? 1 : 2);
        } else {
            tVar.mo34661e(mo34557H());
            this.f21299j.mo34573e1(-1);
            this.f21299j.mo34592v0(0);
            this.f21299j.mo34575f0(i2 + i);
            this.f21299j.mo34592v0(i);
        }
        return this.f21299j;
    }

    /* renamed from: j0 */
    public boolean mo34583j0() {
        return this.f21291b;
    }

    public int length() {
        return this.f21293d - this.f21292c;
    }

    /* renamed from: m0 */
    public boolean mo34585m0(C10929e eVar) {
        int i;
        if (eVar == this) {
            return true;
        }
        if (eVar.length() != length()) {
            return false;
        }
        int i2 = this.f21294e;
        if (i2 != 0 && (eVar instanceof C10924a) && (i = ((C10924a) eVar).f21294e) != 0 && i2 != i) {
            return false;
        }
        int index = getIndex();
        int S0 = eVar.mo34562S0();
        byte[] e0 = mo34608e0();
        byte[] e02 = eVar.mo34608e0();
        if (e0 != null && e02 != null) {
            int S02 = mo34562S0();
            while (true) {
                int i3 = S02 - 1;
                if (S02 <= index) {
                    break;
                }
                byte b = e0[i3];
                S0--;
                byte b2 = e02[S0];
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
                byte X = mo34606X(i4);
                S0--;
                byte X2 = eVar.mo34606X(S0);
                if (X != X2) {
                    if (97 <= X && X <= 122) {
                        X = (byte) ((X - 97) + 65);
                    }
                    if (97 <= X2 && X2 <= 122) {
                        X2 = (byte) ((X2 - 97) + 65);
                    }
                    if (X != X2) {
                        return false;
                    }
                }
                S03 = i4;
            }
        }
        return true;
    }

    /* renamed from: n0 */
    public int mo34586n0(byte[] bArr) {
        int S0 = mo34562S0();
        int h = mo34580h(S0, bArr, 0, bArr.length);
        mo34575f0(S0 + h);
        return h;
    }

    public byte peek() {
        return mo34606X(this.f21292c);
    }

    /* renamed from: r0 */
    public boolean mo34588r0() {
        return this.f21290a <= 0;
    }

    public String toString() {
        if (!mo34588r0()) {
            return new String(mo34561R(), 0, length());
        }
        if (this.f21298i == null) {
            this.f21298i = new String(mo34561R(), 0, length());
        }
        return this.f21298i;
    }

    public String toString(String str) {
        try {
            byte[] e0 = mo34608e0();
            return e0 != null ? new String(e0, getIndex(), length(), str) : new String(mo34561R(), 0, length(), str);
        } catch (Exception e) {
            f21289k.mo35495k(e);
            return new String(mo34561R(), 0, length());
        }
    }

    /* renamed from: u0 */
    public int mo34591u0(int i) {
        if (length() < i) {
            i = length();
        }
        mo34592v0(getIndex() + i);
        return i;
    }

    /* renamed from: v0 */
    public void mo34592v0(int i) {
        this.f21292c = i;
        this.f21294e = 0;
    }

    /* renamed from: w0 */
    public void mo34593w0() {
        mo34573e1(this.f21292c - 1);
    }

    public void writeTo(OutputStream outputStream) {
        byte[] e0 = mo34608e0();
        if (e0 != null) {
            outputStream.write(e0, getIndex(), length());
        } else {
            int length = length();
            int i = 1024;
            if (length <= 1024) {
                i = length;
            }
            byte[] bArr = new byte[i];
            int i2 = this.f21292c;
            while (length > 0) {
                int x0 = mo34610x0(i2, bArr, 0, length > i ? i : length);
                outputStream.write(bArr, 0, x0);
                i2 += x0;
                length -= x0;
            }
        }
        clear();
    }

    /* renamed from: y0 */
    public int mo34595y0(InputStream inputStream, int i) {
        byte[] e0 = mo34608e0();
        int I0 = mo34558I0();
        if (I0 <= i) {
            i = I0;
        }
        if (e0 != null) {
            int read = inputStream.read(e0, this.f21293d, i);
            if (read > 0) {
                this.f21293d += read;
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
            mo34569b(bArr, 0, read2);
            i -= read2;
        }
        return 0;
    }
}

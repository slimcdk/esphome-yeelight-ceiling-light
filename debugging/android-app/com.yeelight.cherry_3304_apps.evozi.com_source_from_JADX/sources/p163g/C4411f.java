package p163g;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import com.miot.service.common.crypto.rc4coder.Coder;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.annotation.Nullable;
import org.apache.commons.p271io.IOUtils;

/* renamed from: g.f */
public class C4411f implements Serializable, Comparable<C4411f> {

    /* renamed from: d */
    static final char[] f7952d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: e */
    public static final C4411f f7953e = m12869l(new byte[0]);

    /* renamed from: a */
    final byte[] f7954a;

    /* renamed from: b */
    transient int f7955b;

    /* renamed from: c */
    transient String f7956c;

    C4411f(byte[] bArr) {
        this.f7954a = bArr;
    }

    /* renamed from: b */
    static int m12863b(String str, int i) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 == i) {
                return i2;
            }
            int codePointAt = str.codePointAt(i2);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    @Nullable
    /* renamed from: d */
    public static C4411f m12864d(String str) {
        if (str != null) {
            byte[] a = C10836b.m26974a(str);
            if (a != null) {
                return new C4411f(a);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    /* renamed from: e */
    public static C4411f m12865e(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        } else if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((m12866f(str.charAt(i2)) << 4) + m12866f(str.charAt(i2 + 1)));
            }
            return m12869l(bArr);
        } else {
            throw new IllegalArgumentException("Unexpected hex string: " + str);
        }
    }

    /* renamed from: f */
    private static int m12866f(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                throw new IllegalArgumentException("Unexpected hex digit: " + c);
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: g */
    private C4411f m12867g(String str) {
        try {
            return m12869l(MessageDigest.getInstance(str).digest(this.f7954a));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: h */
    public static C4411f m12868h(String str) {
        if (str != null) {
            C4411f fVar = new C4411f(str.getBytes(C10851v.f20930a));
            fVar.f7956c = str;
            return fVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    /* renamed from: l */
    public static C4411f m12869l(byte... bArr) {
        if (bArr != null) {
            return new C4411f((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    /* renamed from: a */
    public String mo24285a() {
        return C10836b.m26975b(this.f7954a);
    }

    /* renamed from: c */
    public int compareTo(C4411f fVar) {
        int q = mo24297q();
        int q2 = fVar.mo24297q();
        int min = Math.min(q, q2);
        for (int i = 0; i < min; i++) {
            byte i2 = mo24290i(i) & 255;
            byte i3 = fVar.mo24290i(i) & 255;
            if (i2 != i3) {
                return i2 < i3 ? -1 : 1;
            }
        }
        if (q == q2) {
            return 0;
        }
        return q < q2 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4411f) {
            C4411f fVar = (C4411f) obj;
            int q = fVar.mo24297q();
            byte[] bArr = this.f7954a;
            return q == bArr.length && fVar.mo24294n(0, bArr, 0, bArr.length);
        }
    }

    public int hashCode() {
        int i = this.f7955b;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f7954a);
        this.f7955b = hashCode;
        return hashCode;
    }

    /* renamed from: i */
    public byte mo24290i(int i) {
        return this.f7954a[i];
    }

    /* renamed from: j */
    public String mo24291j() {
        byte[] bArr = this.f7954a;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f7952d;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & ParameterInitDefType.CubemapSamplerInit];
        }
        return new String(cArr);
    }

    /* renamed from: k */
    public C4411f mo24292k() {
        return m12867g(Coder.KEY_MD5);
    }

    /* renamed from: m */
    public boolean mo24293m(int i, C4411f fVar, int i2, int i3) {
        return fVar.mo24294n(i2, this.f7954a, i, i3);
    }

    /* renamed from: n */
    public boolean mo24294n(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.f7954a;
            return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C10851v.m27079a(bArr2, i, bArr, i2, i3);
        }
    }

    /* renamed from: o */
    public C4411f mo24295o() {
        return m12867g("SHA-1");
    }

    /* renamed from: p */
    public C4411f mo24296p() {
        return m12867g("SHA-256");
    }

    /* renamed from: q */
    public int mo24297q() {
        return this.f7954a.length;
    }

    /* renamed from: r */
    public final boolean mo24298r(C4411f fVar) {
        return mo24293m(0, fVar, 0, fVar.mo24297q());
    }

    /* renamed from: s */
    public C4411f mo24299s(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.f7954a;
            if (i2 <= bArr.length) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i == 0 && i2 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(this.f7954a, i, bArr2, 0, i3);
                    return new C4411f(bArr2);
                }
            } else {
                throw new IllegalArgumentException("endIndex > length(" + this.f7954a.length + ")");
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    /* renamed from: t */
    public C4411f mo24300t() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f7954a;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b < 65 || b > 90) {
                i++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i2] = (byte) (b2 + 32);
                    }
                }
                return new C4411f(bArr2);
            }
        }
    }

    public String toString() {
        StringBuilder sb;
        StringBuilder sb2;
        if (this.f7954a.length == 0) {
            return "[size=0]";
        }
        String v = mo24303v();
        int b = m12863b(v, 64);
        if (b == -1) {
            if (this.f7954a.length <= 64) {
                sb2 = new StringBuilder();
                sb2.append("[hex=");
                sb2.append(mo24291j());
                sb2.append("]");
            } else {
                sb2 = new StringBuilder();
                sb2.append("[size=");
                sb2.append(this.f7954a.length);
                sb2.append(" hex=");
                sb2.append(mo24299s(0, 64).mo24291j());
                sb2.append("…]");
            }
            return sb2.toString();
        }
        String replace = v.substring(0, b).replace("\\", "\\\\").replace(IOUtils.LINE_SEPARATOR_UNIX, "\\n").replace("\r", "\\r");
        if (b < v.length()) {
            sb = new StringBuilder();
            sb.append("[size=");
            sb.append(this.f7954a.length);
            sb.append(" text=");
            sb.append(replace);
            sb.append("…]");
        } else {
            sb = new StringBuilder();
            sb.append("[text=");
            sb.append(replace);
            sb.append("]");
        }
        return sb.toString();
    }

    /* renamed from: u */
    public byte[] mo24302u() {
        return (byte[]) this.f7954a.clone();
    }

    /* renamed from: v */
    public String mo24303v() {
        String str = this.f7956c;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f7954a, C10851v.f20930a);
        this.f7956c = str2;
        return str2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo24304w(C4406c cVar) {
        byte[] bArr = this.f7954a;
        cVar.mo24246m1(bArr, 0, bArr.length);
    }
}

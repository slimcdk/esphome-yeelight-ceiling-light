package p011c.p012a.p046d.p052z;

import com.xiaomi.mipush.sdk.Constants;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import org.apache.commons.p271io.IOUtils;

/* renamed from: c.a.d.z.c */
public class C0812c implements Closeable, Flushable {

    /* renamed from: j */
    private static final String[] f655j = new String[128];

    /* renamed from: k */
    private static final String[] f656k;

    /* renamed from: a */
    private final Writer f657a;

    /* renamed from: b */
    private int[] f658b = new int[32];

    /* renamed from: c */
    private int f659c = 0;

    /* renamed from: d */
    private String f660d;

    /* renamed from: e */
    private String f661e;

    /* renamed from: f */
    private boolean f662f;

    /* renamed from: g */
    private boolean f663g;

    /* renamed from: h */
    private String f664h;

    /* renamed from: i */
    private boolean f665i;

    static {
        for (int i = 0; i <= 31; i++) {
            f655j[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f655j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f656k = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C0812c(Writer writer) {
        m1076J(6);
        this.f661e = Constants.COLON_SEPARATOR;
        this.f665i = true;
        if (writer != null) {
            this.f657a = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    /* renamed from: C */
    private void m1073C() {
        if (this.f660d != null) {
            this.f657a.write(IOUtils.LINE_SEPARATOR_UNIX);
            int i = this.f659c;
            for (int i2 = 1; i2 < i; i2++) {
                this.f657a.write(this.f660d);
            }
        }
    }

    /* renamed from: F */
    private C0812c m1074F(int i, String str) {
        m1081b();
        m1076J(i);
        this.f657a.write(str);
        return this;
    }

    /* renamed from: I */
    private int m1075I() {
        int i = this.f659c;
        if (i != 0) {
            return this.f658b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: J */
    private void m1076J(int i) {
        int i2 = this.f659c;
        int[] iArr = this.f658b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f658b = iArr2;
        }
        int[] iArr3 = this.f658b;
        int i3 = this.f659c;
        this.f659c = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: K */
    private void m1077K(int i) {
        this.f658b[this.f659c - 1] = i;
    }

    /* renamed from: S */
    private void m1078S(String str) {
        String str2;
        String[] strArr = this.f663g ? f656k : f655j;
        this.f657a.write("\"");
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                this.f657a.write(str, i, i2 - i);
            }
            this.f657a.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.f657a.write(str, i, length - i);
        }
        this.f657a.write("\"");
    }

    /* renamed from: a */
    private void m1079a() {
        int I = m1075I();
        if (I == 5) {
            this.f657a.write(44);
        } else if (I != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m1073C();
        m1077K(4);
    }

    /* renamed from: a0 */
    private void m1080a0() {
        if (this.f664h != null) {
            m1079a();
            m1078S(this.f664h);
            this.f664h = null;
        }
    }

    /* renamed from: b */
    private void m1081b() {
        int I = m1075I();
        if (I == 1) {
            m1077K(2);
        } else if (I == 2) {
            this.f657a.append(',');
        } else if (I != 4) {
            if (I != 6) {
                if (I != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f662f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            m1077K(7);
            return;
        } else {
            this.f657a.append(this.f661e);
            m1077K(5);
            return;
        }
        m1073C();
    }

    /* renamed from: i */
    private C0812c m1082i(int i, int i2, String str) {
        int I = m1075I();
        if (I != i2 && I != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f664h == null) {
            this.f659c--;
            if (I == i2) {
                m1073C();
            }
            this.f657a.write(str);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.f664h);
        }
    }

    /* renamed from: D */
    public C0812c mo8874D() {
        if (this.f664h != null) {
            if (this.f665i) {
                m1080a0();
            } else {
                this.f664h = null;
                return this;
            }
        }
        m1081b();
        this.f657a.write("null");
        return this;
    }

    /* renamed from: L */
    public final void mo8976L(boolean z) {
        this.f663g = z;
    }

    /* renamed from: M */
    public final void mo8977M(String str) {
        String str2;
        if (str.length() == 0) {
            this.f660d = null;
            str2 = Constants.COLON_SEPARATOR;
        } else {
            this.f660d = str;
            str2 = ": ";
        }
        this.f661e = str2;
    }

    /* renamed from: Q */
    public final void mo8978Q(boolean z) {
        this.f662f = z;
    }

    /* renamed from: R */
    public final void mo8979R(boolean z) {
        this.f665i = z;
    }

    /* renamed from: T */
    public C0812c mo8875T(long j) {
        m1080a0();
        m1081b();
        this.f657a.write(Long.toString(j));
        return this;
    }

    /* renamed from: V */
    public C0812c mo8876V(Boolean bool) {
        if (bool == null) {
            return mo8874D();
        }
        m1080a0();
        m1081b();
        this.f657a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    /* renamed from: W */
    public C0812c mo8877W(Number number) {
        if (number == null) {
            return mo8874D();
        }
        m1080a0();
        String obj = number.toString();
        if (this.f662f || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            m1081b();
            this.f657a.append(obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    /* renamed from: X */
    public C0812c mo8878X(String str) {
        if (str == null) {
            return mo8874D();
        }
        m1080a0();
        m1081b();
        m1078S(str);
        return this;
    }

    /* renamed from: Z */
    public C0812c mo8879Z(boolean z) {
        m1080a0();
        m1081b();
        this.f657a.write(z ? "true" : "false");
        return this;
    }

    public void close() {
        this.f657a.close();
        int i = this.f659c;
        if (i > 1 || (i == 1 && this.f658b[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f659c = 0;
    }

    public void flush() {
        if (this.f659c != 0) {
            this.f657a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: g */
    public C0812c mo8883g() {
        m1080a0();
        m1074F(1, "[");
        return this;
    }

    /* renamed from: h */
    public C0812c mo8884h() {
        m1080a0();
        m1074F(3, "{");
        return this;
    }

    /* renamed from: j */
    public C0812c mo8885j() {
        m1082i(1, 2, "]");
        return this;
    }

    /* renamed from: n */
    public C0812c mo8886n() {
        m1082i(3, 5, "}");
        return this;
    }

    /* renamed from: o */
    public final boolean mo8980o() {
        return this.f665i;
    }

    /* renamed from: s */
    public final boolean mo8981s() {
        return this.f663g;
    }

    /* renamed from: t */
    public boolean mo8982t() {
        return this.f662f;
    }

    /* renamed from: u */
    public C0812c mo8887u(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f664h != null) {
            throw new IllegalStateException();
        } else if (this.f659c != 0) {
            this.f664h = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }
}

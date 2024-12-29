package com.google.gson.stream;

import com.xiaomi.mipush.sdk.Constants;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;
import org.apache.commons.p194io.IOUtils;

/* renamed from: com.google.gson.stream.a */
public class C2537a implements Closeable, Flushable {

    /* renamed from: j */
    private static final String[] f4275j = new String[128];

    /* renamed from: k */
    private static final String[] f4276k;

    /* renamed from: a */
    private final Writer f4277a;

    /* renamed from: b */
    private int[] f4278b = new int[32];

    /* renamed from: c */
    private int f4279c = 0;

    /* renamed from: d */
    private String f4280d;

    /* renamed from: e */
    private String f4281e;

    /* renamed from: f */
    private boolean f4282f;

    /* renamed from: g */
    private boolean f4283g;

    /* renamed from: h */
    private String f4284h;

    /* renamed from: i */
    private boolean f4285i;

    static {
        for (int i = 0; i <= 31; i++) {
            f4275j[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f4275j;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f4276k = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C2537a(Writer writer) {
        m6841A(6);
        this.f4281e = Constants.COLON_SEPARATOR;
        this.f4285i = true;
        Objects.requireNonNull(writer, "out == null");
        this.f4277a = writer;
    }

    /* renamed from: A */
    private void m6841A(int i) {
        int i2 = this.f4279c;
        int[] iArr = this.f4278b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f4278b = iArr2;
        }
        int[] iArr3 = this.f4278b;
        int i3 = this.f4279c;
        this.f4279c = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: B */
    private void m6842B(int i) {
        this.f4278b[this.f4279c - 1] = i;
    }

    /* renamed from: I */
    private void m6843I(String str) {
        String str2;
        String[] strArr = this.f4283g ? f4276k : f4275j;
        this.f4277a.write("\"");
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
                this.f4277a.write(str, i, i2 - i);
            }
            this.f4277a.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.f4277a.write(str, i, length - i);
        }
        this.f4277a.write("\"");
    }

    /* renamed from: W */
    private void m6844W() {
        if (this.f4284h != null) {
            m6845a();
            m6843I(this.f4284h);
            this.f4284h = null;
        }
    }

    /* renamed from: a */
    private void m6845a() {
        int z = m6850z();
        if (z == 5) {
            this.f4277a.write(44);
        } else if (z != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m6848q();
        m6842B(4);
    }

    /* renamed from: c */
    private void m6846c() {
        int z = m6850z();
        if (z == 1) {
            m6842B(2);
        } else if (z == 2) {
            this.f4277a.append(',');
        } else if (z != 4) {
            if (z != 6) {
                if (z != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f4282f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            m6842B(7);
            return;
        } else {
            this.f4277a.append(this.f4281e);
            m6842B(5);
            return;
        }
        m6848q();
    }

    /* renamed from: h */
    private C2537a m6847h(int i, int i2, String str) {
        int z = m6850z();
        if (z != i2 && z != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f4284h == null) {
            this.f4279c--;
            if (z == i2) {
                m6848q();
            }
            this.f4277a.write(str);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.f4284h);
        }
    }

    /* renamed from: q */
    private void m6848q() {
        if (this.f4280d != null) {
            this.f4277a.write(IOUtils.LINE_SEPARATOR_UNIX);
            int i = this.f4279c;
            for (int i2 = 1; i2 < i; i2++) {
                this.f4277a.write(this.f4280d);
            }
        }
    }

    /* renamed from: v */
    private C2537a m6849v(int i, String str) {
        m6846c();
        m6841A(i);
        this.f4277a.write(str);
        return this;
    }

    /* renamed from: z */
    private int m6850z() {
        int i = this.f4279c;
        if (i != 0) {
            return this.f4278b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: D */
    public final void mo19415D(boolean z) {
        this.f4283g = z;
    }

    /* renamed from: E */
    public final void mo19416E(String str) {
        String str2;
        if (str.length() == 0) {
            this.f4280d = null;
            str2 = Constants.COLON_SEPARATOR;
        } else {
            this.f4280d = str;
            str2 = ": ";
        }
        this.f4281e = str2;
    }

    /* renamed from: G */
    public final void mo19417G(boolean z) {
        this.f4282f = z;
    }

    /* renamed from: H */
    public final void mo19418H(boolean z) {
        this.f4285i = z;
    }

    /* renamed from: J */
    public C2537a mo19419J(long j) {
        m6844W();
        m6846c();
        this.f4277a.write(Long.toString(j));
        return this;
    }

    /* renamed from: N */
    public C2537a mo19420N(Boolean bool) {
        if (bool == null) {
            return mo19434s();
        }
        m6844W();
        m6846c();
        this.f4277a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    /* renamed from: P */
    public C2537a mo19421P(Number number) {
        if (number == null) {
            return mo19434s();
        }
        m6844W();
        String obj = number.toString();
        if (this.f4282f || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            m6846c();
            this.f4277a.append(obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    /* renamed from: T */
    public C2537a mo19422T(String str) {
        if (str == null) {
            return mo19434s();
        }
        m6844W();
        m6846c();
        m6843I(str);
        return this;
    }

    /* renamed from: V */
    public C2537a mo19423V(boolean z) {
        m6844W();
        m6846c();
        this.f4277a.write(z ? "true" : "false");
        return this;
    }

    public void close() {
        this.f4277a.close();
        int i = this.f4279c;
        if (i > 1 || (i == 1 && this.f4278b[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f4279c = 0;
    }

    /* renamed from: d */
    public C2537a mo19425d() {
        m6844W();
        return m6849v(1, "[");
    }

    /* renamed from: f */
    public C2537a mo19426f() {
        m6844W();
        return m6849v(3, "{");
    }

    public void flush() {
        if (this.f4279c != 0) {
            this.f4277a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: i */
    public C2537a mo19428i() {
        return m6847h(1, 2, "]");
    }

    /* renamed from: k */
    public C2537a mo19429k() {
        return m6847h(3, 5, "}");
    }

    /* renamed from: l */
    public final boolean mo19430l() {
        return this.f4285i;
    }

    /* renamed from: m */
    public final boolean mo19431m() {
        return this.f4283g;
    }

    /* renamed from: n */
    public boolean mo19432n() {
        return this.f4282f;
    }

    /* renamed from: p */
    public C2537a mo19433p(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f4284h != null) {
            throw new IllegalStateException();
        } else if (this.f4279c != 0) {
            this.f4284h = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: s */
    public C2537a mo19434s() {
        if (this.f4284h != null) {
            if (this.f4285i) {
                m6844W();
            } else {
                this.f4284h = null;
                return this;
            }
        }
        m6846c();
        this.f4277a.write("null");
        return this;
    }
}

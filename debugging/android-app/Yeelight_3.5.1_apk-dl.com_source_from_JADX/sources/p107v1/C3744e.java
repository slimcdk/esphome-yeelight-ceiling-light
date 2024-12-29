package p107v1;

import com.google.gson.C2478h;
import com.google.gson.C2529l;
import com.google.gson.C2530m;
import com.google.gson.C2531n;
import com.google.gson.stream.JsonToken;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.p194io.FilenameUtils;
import p122z1.C3929a;

/* renamed from: v1.e */
public final class C3744e extends C3929a {

    /* renamed from: u */
    private static final Object f6273u = new Object();

    /* renamed from: q */
    private Object[] f6274q;

    /* renamed from: r */
    private int f6275r;

    /* renamed from: s */
    private String[] f6276s;

    /* renamed from: t */
    private int[] f6277t;

    /* renamed from: v1.e$a */
    static class C3745a extends Reader {
        C3745a() {
        }

        public void close() {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    static {
        new C3745a();
    }

    /* renamed from: o0 */
    private void m10647o0(JsonToken jsonToken) {
        if (mo26169N() != jsonToken) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + mo26169N() + m10650s());
        }
    }

    /* renamed from: p0 */
    private Object m10648p0() {
        return this.f6274q[this.f6275r - 1];
    }

    /* renamed from: r0 */
    private Object m10649r0() {
        Object[] objArr = this.f6274q;
        int i = this.f6275r - 1;
        this.f6275r = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* renamed from: s */
    private String m10650s() {
        return " at path " + mo26176m();
    }

    /* renamed from: v0 */
    private void m10651v0(Object obj) {
        int i = this.f6275r;
        Object[] objArr = this.f6274q;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[(i * 2)];
            int[] iArr = new int[(i * 2)];
            String[] strArr = new String[(i * 2)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f6277t, 0, iArr, 0, this.f6275r);
            System.arraycopy(this.f6276s, 0, strArr, 0, this.f6275r);
            this.f6274q = objArr2;
            this.f6277t = iArr;
            this.f6276s = strArr;
        }
        Object[] objArr3 = this.f6274q;
        int i2 = this.f6275r;
        this.f6275r = i2 + 1;
        objArr3[i2] = obj;
    }

    /* renamed from: A */
    public int mo26164A() {
        JsonToken N = mo26169N();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (N == jsonToken || N == JsonToken.STRING) {
            int u = ((C2531n) m10648p0()).mo19407u();
            m10649r0();
            int i = this.f6275r;
            if (i > 0) {
                int[] iArr = this.f6277t;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return u;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + N + m10650s());
    }

    /* renamed from: B */
    public long mo26165B() {
        JsonToken N = mo26169N();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (N == jsonToken || N == JsonToken.STRING) {
            long v = ((C2531n) m10648p0()).mo19408v();
            m10649r0();
            int i = this.f6275r;
            if (i > 0) {
                int[] iArr = this.f6277t;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return v;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + N + m10650s());
    }

    /* renamed from: D */
    public String mo26166D() {
        m10647o0(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m10648p0()).next();
        String str = (String) entry.getKey();
        this.f6276s[this.f6275r - 1] = str;
        m10651v0(entry.getValue());
        return str;
    }

    /* renamed from: G */
    public void mo26167G() {
        m10647o0(JsonToken.NULL);
        m10649r0();
        int i = this.f6275r;
        if (i > 0) {
            int[] iArr = this.f6277t;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: I */
    public String mo26168I() {
        JsonToken N = mo26169N();
        JsonToken jsonToken = JsonToken.STRING;
        if (N == jsonToken || N == JsonToken.NUMBER) {
            String x = ((C2531n) m10649r0()).mo19410x();
            int i = this.f6275r;
            if (i > 0) {
                int[] iArr = this.f6277t;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return x;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + N + m10650s());
    }

    /* renamed from: N */
    public JsonToken mo26169N() {
        if (this.f6275r == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object p0 = m10648p0();
        if (p0 instanceof Iterator) {
            boolean z = this.f6274q[this.f6275r - 2] instanceof C2530m;
            Iterator it = (Iterator) p0;
            if (!it.hasNext()) {
                return z ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z) {
                return JsonToken.NAME;
            }
            m10651v0(it.next());
            return mo26169N();
        } else if (p0 instanceof C2530m) {
            return JsonToken.BEGIN_OBJECT;
        } else {
            if (p0 instanceof C2478h) {
                return JsonToken.BEGIN_ARRAY;
            }
            if (p0 instanceof C2531n) {
                C2531n nVar = (C2531n) p0;
                if (nVar.mo19400C()) {
                    return JsonToken.STRING;
                }
                if (nVar.mo19411y()) {
                    return JsonToken.BOOLEAN;
                }
                if (nVar.mo19399A()) {
                    return JsonToken.NUMBER;
                }
                throw new AssertionError();
            } else if (p0 instanceof C2529l) {
                return JsonToken.NULL;
            } else {
                if (p0 == f6273u) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    /* renamed from: a */
    public void mo26170a() {
        m10647o0(JsonToken.BEGIN_ARRAY);
        m10651v0(((C2478h) m10648p0()).iterator());
        this.f6277t[this.f6275r - 1] = 0;
    }

    /* renamed from: c */
    public void mo26171c() {
        m10647o0(JsonToken.BEGIN_OBJECT);
        m10651v0(((C2530m) m10648p0()).entrySet().iterator());
    }

    public void close() {
        this.f6274q = new Object[]{f6273u};
        this.f6275r = 1;
    }

    /* renamed from: i */
    public void mo26173i() {
        m10647o0(JsonToken.END_ARRAY);
        m10649r0();
        m10649r0();
        int i = this.f6275r;
        if (i > 0) {
            int[] iArr = this.f6277t;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: j0 */
    public void mo26174j0() {
        if (mo26169N() == JsonToken.NAME) {
            mo26166D();
            this.f6276s[this.f6275r - 2] = "null";
        } else {
            m10649r0();
            int i = this.f6275r;
            if (i > 0) {
                this.f6276s[i - 1] = "null";
            }
        }
        int i2 = this.f6275r;
        if (i2 > 0) {
            int[] iArr = this.f6277t;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    /* renamed from: k */
    public void mo26175k() {
        m10647o0(JsonToken.END_OBJECT);
        m10649r0();
        m10649r0();
        int i = this.f6275r;
        if (i > 0) {
            int[] iArr = this.f6277t;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: m */
    public String mo26176m() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (i < this.f6275r) {
            Object[] objArr = this.f6274q;
            if (objArr[i] instanceof C2478h) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f6277t[i]);
                    sb.append(']');
                }
            } else if (objArr[i] instanceof C2530m) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append(FilenameUtils.EXTENSION_SEPARATOR);
                    String[] strArr = this.f6276s;
                    if (strArr[i] != null) {
                        sb.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    /* renamed from: n */
    public boolean mo26177n() {
        JsonToken N = mo26169N();
        return (N == JsonToken.END_OBJECT || N == JsonToken.END_ARRAY) ? false : true;
    }

    public String toString() {
        return C3744e.class.getSimpleName();
    }

    /* renamed from: u0 */
    public void mo26179u0() {
        m10647o0(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m10648p0()).next();
        m10651v0(entry.getValue());
        m10651v0(new C2531n((String) entry.getKey()));
    }

    /* renamed from: v */
    public boolean mo26180v() {
        m10647o0(JsonToken.BOOLEAN);
        boolean o = ((C2531n) m10649r0()).mo19404o();
        int i = this.f6275r;
        if (i > 0) {
            int[] iArr = this.f6277t;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return o;
    }

    /* renamed from: z */
    public double mo26181z() {
        JsonToken N = mo26169N();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (N == jsonToken || N == JsonToken.STRING) {
            double t = ((C2531n) m10648p0()).mo19406t();
            if (mo26426p() || (!Double.isNaN(t) && !Double.isInfinite(t))) {
                m10649r0();
                int i = this.f6275r;
                if (i > 0) {
                    int[] iArr = this.f6277t;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return t;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + t);
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + N + m10650s());
    }
}

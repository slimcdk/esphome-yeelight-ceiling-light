package p011c.p012a.p046d.p047x.p048n;

import java.io.Reader;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.p271io.FilenameUtils;
import p011c.p012a.p046d.C0673i;
import p011c.p012a.p046d.C0678n;
import p011c.p012a.p046d.C0679o;
import p011c.p012a.p046d.C0681q;
import p011c.p012a.p046d.p052z.C0809a;
import p011c.p012a.p046d.p052z.C0811b;

/* renamed from: c.a.d.x.n.e */
public final class C0742e extends C0809a {

    /* renamed from: u */
    private static final Object f496u = new Object();

    /* renamed from: q */
    private Object[] f497q;

    /* renamed from: r */
    private int f498r;

    /* renamed from: s */
    private String[] f499s;

    /* renamed from: t */
    private int[] f500t;

    /* renamed from: c.a.d.x.n.e$a */
    static class C0743a extends Reader {
        C0743a() {
        }

        public void close() {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    static {
        new C0743a();
    }

    /* renamed from: D */
    private String m810D() {
        return " at path " + mo8869s();
    }

    /* renamed from: m0 */
    private void m811m0(C0811b bVar) {
        if (mo8861V() != bVar) {
            throw new IllegalStateException("Expected " + bVar + " but was " + mo8861V() + m810D());
        }
    }

    /* renamed from: n0 */
    private Object m812n0() {
        return this.f497q[this.f498r - 1];
    }

    /* renamed from: o0 */
    private Object m813o0() {
        Object[] objArr = this.f497q;
        int i = this.f498r - 1;
        this.f498r = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* renamed from: u0 */
    private void m814u0(Object obj) {
        int i = this.f498r;
        Object[] objArr = this.f497q;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[(i * 2)];
            int[] iArr = new int[(i * 2)];
            String[] strArr = new String[(i * 2)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f500t, 0, iArr, 0, this.f498r);
            System.arraycopy(this.f499s, 0, strArr, 0, this.f498r);
            this.f497q = objArr2;
            this.f500t = iArr;
            this.f499s = strArr;
        }
        Object[] objArr3 = this.f497q;
        int i2 = this.f498r;
        this.f498r = i2 + 1;
        objArr3[i2] = obj;
    }

    /* renamed from: F */
    public boolean mo8854F() {
        m811m0(C0811b.BOOLEAN);
        boolean j = ((C0681q) m813o0()).mo8757j();
        int i = this.f498r;
        if (i > 0) {
            int[] iArr = this.f500t;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return j;
    }

    /* renamed from: I */
    public double mo8855I() {
        C0811b V = mo8861V();
        if (V == C0811b.NUMBER || V == C0811b.STRING) {
            double l = ((C0681q) m812n0()).mo8759l();
            if (mo8975u() || (!Double.isNaN(l) && !Double.isInfinite(l))) {
                m813o0();
                int i = this.f498r;
                if (i > 0) {
                    int[] iArr = this.f500t;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return l;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + l);
        }
        throw new IllegalStateException("Expected " + C0811b.NUMBER + " but was " + V + m810D());
    }

    /* renamed from: J */
    public int mo8856J() {
        C0811b V = mo8861V();
        if (V == C0811b.NUMBER || V == C0811b.STRING) {
            int m = ((C0681q) m812n0()).mo8760m();
            m813o0();
            int i = this.f498r;
            if (i > 0) {
                int[] iArr = this.f500t;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return m;
        }
        throw new IllegalStateException("Expected " + C0811b.NUMBER + " but was " + V + m810D());
    }

    /* renamed from: K */
    public long mo8857K() {
        C0811b V = mo8861V();
        if (V == C0811b.NUMBER || V == C0811b.STRING) {
            long n = ((C0681q) m812n0()).mo8761n();
            m813o0();
            int i = this.f498r;
            if (i > 0) {
                int[] iArr = this.f500t;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return n;
        }
        throw new IllegalStateException("Expected " + C0811b.NUMBER + " but was " + V + m810D());
    }

    /* renamed from: L */
    public String mo8858L() {
        m811m0(C0811b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m812n0()).next();
        String str = (String) entry.getKey();
        this.f499s[this.f498r - 1] = str;
        m814u0(entry.getValue());
        return str;
    }

    /* renamed from: Q */
    public void mo8859Q() {
        m811m0(C0811b.NULL);
        m813o0();
        int i = this.f498r;
        if (i > 0) {
            int[] iArr = this.f500t;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: S */
    public String mo8860S() {
        C0811b V = mo8861V();
        if (V == C0811b.STRING || V == C0811b.NUMBER) {
            String p = ((C0681q) m813o0()).mo8763p();
            int i = this.f498r;
            if (i > 0) {
                int[] iArr = this.f500t;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return p;
        }
        throw new IllegalStateException("Expected " + C0811b.STRING + " but was " + V + m810D());
    }

    /* renamed from: V */
    public C0811b mo8861V() {
        if (this.f498r == 0) {
            return C0811b.END_DOCUMENT;
        }
        Object n0 = m812n0();
        if (n0 instanceof Iterator) {
            boolean z = this.f497q[this.f498r - 2] instanceof C0679o;
            Iterator it = (Iterator) n0;
            if (!it.hasNext()) {
                return z ? C0811b.END_OBJECT : C0811b.END_ARRAY;
            }
            if (z) {
                return C0811b.NAME;
            }
            m814u0(it.next());
            return mo8861V();
        } else if (n0 instanceof C0679o) {
            return C0811b.BEGIN_OBJECT;
        } else {
            if (n0 instanceof C0673i) {
                return C0811b.BEGIN_ARRAY;
            }
            if (n0 instanceof C0681q) {
                C0681q qVar = (C0681q) n0;
                if (qVar.mo8766v()) {
                    return C0811b.STRING;
                }
                if (qVar.mo8764q()) {
                    return C0811b.BOOLEAN;
                }
                if (qVar.mo8765s()) {
                    return C0811b.NUMBER;
                }
                throw new AssertionError();
            } else if (n0 instanceof C0678n) {
                return C0811b.NULL;
            } else {
                if (n0 == f496u) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    /* renamed from: a */
    public void mo8862a() {
        m811m0(C0811b.BEGIN_ARRAY);
        m814u0(((C0673i) m812n0()).iterator());
        this.f500t[this.f498r - 1] = 0;
    }

    /* renamed from: b */
    public void mo8863b() {
        m811m0(C0811b.BEGIN_OBJECT);
        m814u0(((C0679o) m812n0()).entrySet().iterator());
    }

    public void close() {
        this.f497q = new Object[]{f496u};
        this.f498r = 1;
    }

    /* renamed from: j */
    public void mo8865j() {
        m811m0(C0811b.END_ARRAY);
        m813o0();
        m813o0();
        int i = this.f498r;
        if (i > 0) {
            int[] iArr = this.f500t;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: j0 */
    public void mo8866j0() {
        if (mo8861V() == C0811b.NAME) {
            mo8858L();
            this.f499s[this.f498r - 2] = "null";
        } else {
            m813o0();
            int i = this.f498r;
            if (i > 0) {
                this.f499s[i - 1] = "null";
            }
        }
        int i2 = this.f498r;
        if (i2 > 0) {
            int[] iArr = this.f500t;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    /* renamed from: n */
    public void mo8867n() {
        m811m0(C0811b.END_OBJECT);
        m813o0();
        m813o0();
        int i = this.f498r;
        if (i > 0) {
            int[] iArr = this.f500t;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: r0 */
    public void mo8868r0() {
        m811m0(C0811b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m812n0()).next();
        m814u0(entry.getValue());
        m814u0(new C0681q((String) entry.getKey()));
    }

    /* renamed from: s */
    public String mo8869s() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (i < this.f498r) {
            Object[] objArr = this.f497q;
            if (objArr[i] instanceof C0673i) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f500t[i]);
                    sb.append(']');
                }
            } else if (objArr[i] instanceof C0679o) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append(FilenameUtils.EXTENSION_SEPARATOR);
                    String[] strArr = this.f499s;
                    if (strArr[i] != null) {
                        sb.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    /* renamed from: t */
    public boolean mo8870t() {
        C0811b V = mo8861V();
        return (V == C0811b.END_OBJECT || V == C0811b.END_ARRAY) ? false : true;
    }

    public String toString() {
        return C0742e.class.getSimpleName();
    }
}

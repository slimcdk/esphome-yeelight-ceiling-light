package p011c.p012a.p046d.p047x;

import java.math.BigDecimal;

/* renamed from: c.a.d.x.g */
public final class C0715g extends Number {

    /* renamed from: a */
    private final String f455a;

    public C0715g(String str) {
        this.f455a = str;
    }

    public double doubleValue() {
        return Double.parseDouble(this.f455a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0715g)) {
            return false;
        }
        String str = this.f455a;
        String str2 = ((C0715g) obj).f455a;
        return str == str2 || str.equals(str2);
    }

    public float floatValue() {
        return Float.parseFloat(this.f455a);
    }

    public int hashCode() {
        return this.f455a.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return (int) java.lang.Long.parseLong(r2.f455a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        return new java.math.BigDecimal(r2.f455a).intValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int intValue() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f455a     // Catch:{ NumberFormatException -> 0x0007 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
            return r0
        L_0x0007:
            java.lang.String r0 = r2.f455a     // Catch:{ NumberFormatException -> 0x000f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000f }
            int r1 = (int) r0
            return r1
        L_0x000f:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = r2.f455a
            r0.<init>(r1)
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p046d.p047x.C0715g.intValue():int");
    }

    public long longValue() {
        try {
            return Long.parseLong(this.f455a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f455a).longValue();
        }
    }

    public String toString() {
        return this.f455a;
    }
}

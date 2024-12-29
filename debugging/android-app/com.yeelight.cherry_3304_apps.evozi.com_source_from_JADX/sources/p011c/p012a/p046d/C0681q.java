package p011c.p012a.p046d;

import java.math.BigInteger;
import p011c.p012a.p046d.p047x.C0691a;
import p011c.p012a.p046d.p047x.C0715g;

/* renamed from: c.a.d.q */
public final class C0681q extends C0676l {

    /* renamed from: b */
    private static final Class<?>[] f416b = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: a */
    private Object f417a;

    public C0681q(Boolean bool) {
        mo8767w(bool);
    }

    public C0681q(Number number) {
        mo8767w(number);
    }

    C0681q(Object obj) {
        mo8767w(obj);
    }

    public C0681q(String str) {
        mo8767w(str);
    }

    /* renamed from: r */
    private static boolean m678r(C0681q qVar) {
        Object obj = qVar.f417a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    /* renamed from: u */
    private static boolean m679u(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> isAssignableFrom : f416b) {
            if (isAssignableFrom.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0681q.class != obj.getClass()) {
            return false;
        }
        C0681q qVar = (C0681q) obj;
        if (this.f417a == null) {
            return qVar.f417a == null;
        }
        if (m678r(this) && m678r(qVar)) {
            return mo8762o().longValue() == qVar.mo8762o().longValue();
        }
        if (!(this.f417a instanceof Number) || !(qVar.f417a instanceof Number)) {
            return this.f417a.equals(qVar.f417a);
        }
        double doubleValue = mo8762o().doubleValue();
        double doubleValue2 = qVar.mo8762o().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f417a == null) {
            return 31;
        }
        if (m678r(this)) {
            doubleToLongBits = mo8762o().longValue();
        } else {
            Object obj = this.f417a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(mo8762o().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    /* renamed from: j */
    public boolean mo8757j() {
        return mo8764q() ? mo8758k().booleanValue() : Boolean.parseBoolean(mo8763p());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Boolean mo8758k() {
        return (Boolean) this.f417a;
    }

    /* renamed from: l */
    public double mo8759l() {
        return mo8765s() ? mo8762o().doubleValue() : Double.parseDouble(mo8763p());
    }

    /* renamed from: m */
    public int mo8760m() {
        return mo8765s() ? mo8762o().intValue() : Integer.parseInt(mo8763p());
    }

    /* renamed from: n */
    public long mo8761n() {
        return mo8765s() ? mo8762o().longValue() : Long.parseLong(mo8763p());
    }

    /* renamed from: o */
    public Number mo8762o() {
        Object obj = this.f417a;
        return obj instanceof String ? new C0715g((String) this.f417a) : (Number) obj;
    }

    /* renamed from: p */
    public String mo8763p() {
        return mo8765s() ? mo8762o().toString() : mo8764q() ? mo8758k().toString() : (String) this.f417a;
    }

    /* renamed from: q */
    public boolean mo8764q() {
        return this.f417a instanceof Boolean;
    }

    /* renamed from: s */
    public boolean mo8765s() {
        return this.f417a instanceof Number;
    }

    /* renamed from: v */
    public boolean mo8766v() {
        return this.f417a instanceof String;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo8767w(Object obj) {
        if (obj instanceof Character) {
            obj = String.valueOf(((Character) obj).charValue());
        } else {
            C0691a.m699a((obj instanceof Number) || m679u(obj));
        }
        this.f417a = obj;
    }
}

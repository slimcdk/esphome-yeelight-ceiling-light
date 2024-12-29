package com.google.gson;

import com.google.gson.internal.C2496a;
import com.google.gson.internal.LazilyParsedNumber;
import java.math.BigInteger;

/* renamed from: com.google.gson.n */
public final class C2531n extends C2528k {

    /* renamed from: b */
    private static final Class<?>[] f4272b = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: a */
    private Object f4273a;

    public C2531n(Boolean bool) {
        mo19401F(bool);
    }

    public C2531n(Number number) {
        mo19401F(number);
    }

    C2531n(Object obj) {
        mo19401F(obj);
    }

    public C2531n(String str) {
        mo19401F(str);
    }

    /* renamed from: B */
    private static boolean m6820B(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> isAssignableFrom : f4272b) {
            if (isAssignableFrom.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    private static boolean m6821z(C2531n nVar) {
        Object obj = nVar.f4273a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    /* renamed from: A */
    public boolean mo19399A() {
        return this.f4273a instanceof Number;
    }

    /* renamed from: C */
    public boolean mo19400C() {
        return this.f4273a instanceof String;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo19401F(Object obj) {
        if (obj instanceof Character) {
            obj = String.valueOf(((Character) obj).charValue());
        } else {
            C2496a.m6749a((obj instanceof Number) || m6820B(obj));
        }
        this.f4273a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2531n.class != obj.getClass()) {
            return false;
        }
        C2531n nVar = (C2531n) obj;
        if (this.f4273a == null) {
            return nVar.f4273a == null;
        }
        if (m6821z(this) && m6821z(nVar)) {
            return mo19409w().longValue() == nVar.mo19409w().longValue();
        }
        Object obj2 = this.f4273a;
        if (!(obj2 instanceof Number) || !(nVar.f4273a instanceof Number)) {
            return obj2.equals(nVar.f4273a);
        }
        double doubleValue = mo19409w().doubleValue();
        double doubleValue2 = nVar.mo19409w().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f4273a == null) {
            return 31;
        }
        if (m6821z(this)) {
            doubleToLongBits = mo19409w().longValue();
        } else {
            Object obj = this.f4273a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(mo19409w().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    /* renamed from: o */
    public boolean mo19404o() {
        return mo19411y() ? mo19405r().booleanValue() : Boolean.parseBoolean(mo19410x());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Boolean mo19405r() {
        return (Boolean) this.f4273a;
    }

    /* renamed from: t */
    public double mo19406t() {
        return mo19399A() ? mo19409w().doubleValue() : Double.parseDouble(mo19410x());
    }

    /* renamed from: u */
    public int mo19407u() {
        return mo19399A() ? mo19409w().intValue() : Integer.parseInt(mo19410x());
    }

    /* renamed from: v */
    public long mo19408v() {
        return mo19399A() ? mo19409w().longValue() : Long.parseLong(mo19410x());
    }

    /* renamed from: w */
    public Number mo19409w() {
        Object obj = this.f4273a;
        return obj instanceof String ? new LazilyParsedNumber((String) obj) : (Number) obj;
    }

    /* renamed from: x */
    public String mo19410x() {
        return mo19399A() ? mo19409w().toString() : mo19411y() ? mo19405r().toString() : (String) this.f4273a;
    }

    /* renamed from: y */
    public boolean mo19411y() {
        return this.f4273a instanceof Boolean;
    }
}

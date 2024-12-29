package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.i */
public final class C1133i implements C1261q {

    /* renamed from: a */
    private final Double f1371a;

    public C1133i(Double d) {
        if (d == null) {
            this.f1371a = Double.valueOf(Double.NaN);
        } else {
            this.f1371a = d;
        }
    }

    /* renamed from: b */
    public final C1261q mo12760b() {
        return new C1133i(this.f1371a);
    }

    /* renamed from: c */
    public final Double mo12761c() {
        return this.f1371a;
    }

    /* renamed from: d */
    public final String mo12762d() {
        if (Double.isNaN(this.f1371a.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f1371a.doubleValue())) {
            return this.f1371a.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.f1371a.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((stripTrailingZeros.scale() > 0 ? stripTrailingZeros.precision() : stripTrailingZeros.scale()) - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace("E-", "e-").replace("E", "e+") : stripTrailingZeros.toPlainString();
    }

    /* renamed from: e */
    public final Boolean mo12763e() {
        boolean z = false;
        if (!Double.isNaN(this.f1371a.doubleValue()) && this.f1371a.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1133i)) {
            return false;
        }
        return this.f1371a.equals(((C1133i) obj).f1371a);
    }

    /* renamed from: g */
    public final Iterator mo12765g() {
        return null;
    }

    public final int hashCode() {
        return this.f1371a.hashCode();
    }

    /* renamed from: l */
    public final C1261q mo12637l(String str, C1250p4 p4Var, List list) {
        if ("toString".equals(str)) {
            return new C1324u(mo12762d());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{mo12762d(), str}));
    }

    public final String toString() {
        return mo12762d();
    }
}

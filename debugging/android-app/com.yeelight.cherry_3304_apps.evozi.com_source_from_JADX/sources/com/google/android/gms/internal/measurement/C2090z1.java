package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.z1 */
final class C2090z1 extends C2026v1<Double> {
    C2090z1(C1717b2 b2Var, String str, Double d, boolean z) {
        super(b2Var, str, d, z, (C2058x1) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final Double mo11421e(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String m = super.mo12124m();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(m).length() + 27 + String.valueOf(valueOf).length());
        sb.append("Invalid double value for ");
        sb.append(m);
        sb.append(": ");
        sb.append(valueOf);
        sb.toString();
        return null;
    }
}

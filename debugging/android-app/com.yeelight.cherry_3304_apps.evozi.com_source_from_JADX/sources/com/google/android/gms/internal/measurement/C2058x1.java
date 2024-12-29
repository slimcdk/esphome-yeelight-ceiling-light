package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.x1 */
final class C2058x1 extends C2026v1<Long> {
    C2058x1(C1717b2 b2Var, String str, Long l, boolean z) {
        super(b2Var, str, l, z, (C2058x1) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final Long mo11421e(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String m = super.mo12124m();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(m).length() + 25 + String.valueOf(valueOf).length());
        sb.append("Invalid long value for ");
        sb.append(m);
        sb.append(": ");
        sb.append(valueOf);
        sb.toString();
        return null;
    }
}

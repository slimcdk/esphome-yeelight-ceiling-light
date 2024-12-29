package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.a2 */
final class C1702a2 extends C2026v1<Boolean> {
    C1702a2(C1717b2 b2Var, String str, Boolean bool, boolean z) {
        super(b2Var, str, bool, z, (C2058x1) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ Object mo11421e(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (C1792g1.f3361c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (C1792g1.f3362d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String m = super.mo12124m();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(m).length() + 28 + String.valueOf(valueOf).length());
        sb.append("Invalid boolean value for ");
        sb.append(m);
        sb.append(": ");
        sb.append(valueOf);
        sb.toString();
        return null;
    }
}

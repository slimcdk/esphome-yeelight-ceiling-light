package com.google.android.gms.internal.measurement;

import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.measurement.k6 */
final class C1172k6 extends C1252p6 {
    C1172k6(C1204m6 m6Var, String str, Double d, boolean z) {
        super(m6Var, "measurement.test.double_flag", d, true, (C1236o6) null);
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo12877a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String c = super.mo13070c();
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid double value for ");
            sb.append(c);
            sb.append(": ");
            sb.append((String) obj);
            return null;
        }
    }
}

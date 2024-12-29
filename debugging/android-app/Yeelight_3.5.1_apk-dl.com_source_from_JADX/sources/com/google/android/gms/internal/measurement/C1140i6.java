package com.google.android.gms.internal.measurement;

import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.measurement.i6 */
final class C1140i6 extends C1252p6 {
    C1140i6(C1204m6 m6Var, String str, Long l, boolean z) {
        super(m6Var, str, l, true, (C1236o6) null);
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo12877a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String c = super.mo13070c();
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid long value for ");
            sb.append(c);
            sb.append(": ");
            sb.append((String) obj);
            return null;
        }
    }
}

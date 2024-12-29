package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.l0 */
public final class C1182l0 extends C1369x {
    /* renamed from: a */
    public final C1261q mo12511a(String str, C1250p4 p4Var, List list) {
        if (str == null || str.isEmpty() || !p4Var.mo13068h(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", new Object[]{str}));
        }
        C1261q d = p4Var.mo13064d(str);
        if (d instanceof C1149j) {
            return ((C1149j) d).mo12586a(p4Var, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", new Object[]{str}));
    }
}

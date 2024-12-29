package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x */
public abstract class C1369x {

    /* renamed from: a */
    final List f1702a = new ArrayList();

    protected C1369x() {
    }

    /* renamed from: a */
    public abstract C1261q mo12511a(String str, C1250p4 p4Var, List list);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C1261q mo13469b(String str) {
        if (this.f1702a.contains(C1267q5.m2512e(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}

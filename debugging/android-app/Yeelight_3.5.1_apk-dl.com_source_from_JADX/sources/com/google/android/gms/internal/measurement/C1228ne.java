package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.ne */
public final class C1228ne extends C1149j {

    /* renamed from: c */
    private final Callable f1453c;

    public C1228ne(String str, Callable callable) {
        super("internal.appMetadata");
        this.f1453c = callable;
    }

    /* renamed from: a */
    public final C1261q mo12586a(C1250p4 p4Var, List list) {
        try {
            return C1284r6.m2684b(this.f1453c.call());
        } catch (Exception unused) {
            return C1261q.f1536D;
        }
    }
}

package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* renamed from: com.google.android.gms.internal.measurement.o1 */
public final /* synthetic */ class C1922o1 {
    /* renamed from: a */
    public static <V> V m5627a(C1907n1<V> n1Var) {
        long clearCallingIdentity;
        try {
            return n1Var.mo11770C();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V C = n1Var.mo11770C();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return C;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}

package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* renamed from: com.google.android.gms.internal.measurement.y5 */
public final /* synthetic */ class C1390y5 {
    /* renamed from: a */
    public static Object m3297a(C1405z5 z5Var) {
        long clearCallingIdentity;
        try {
            return z5Var.zza();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            Object zza = z5Var.zza();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return zza;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}

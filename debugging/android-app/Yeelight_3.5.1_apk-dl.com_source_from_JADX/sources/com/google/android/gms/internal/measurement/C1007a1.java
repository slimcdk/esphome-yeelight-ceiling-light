package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;
import p223w3.C11627r;

/* renamed from: com.google.android.gms.internal.measurement.a1 */
public final class C1007a1 extends C1103g1 {

    /* renamed from: a */
    private final AtomicReference f1223a = new AtomicReference();

    /* renamed from: b */
    private boolean f1224b;

    /* renamed from: T */
    public static final Object m1667T(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get(C11627r.f21359c0)) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            String.format("Unexpected object type. Expected, Received: %s, %s", new Object[]{cls.getCanonicalName(), obj.getClass().getCanonicalName()});
            throw e;
        }
    }

    /* renamed from: a */
    public final void mo12512a(Bundle bundle) {
        synchronized (this.f1223a) {
            try {
                this.f1223a.set(bundle);
                this.f1224b = true;
                this.f1223a.notify();
            } catch (Throwable th) {
                this.f1223a.notify();
                throw th;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000d */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo12513e(long r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.f1223a
            monitor-enter(r0)
            boolean r1 = r2.f1224b     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0010
            java.util.concurrent.atomic.AtomicReference r1 = r2.f1223a     // Catch:{ InterruptedException -> 0x000d }
            r1.wait(r3)     // Catch:{ InterruptedException -> 0x000d }
            goto L_0x0010
        L_0x000d:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            r3 = 0
            return r3
        L_0x0010:
            java.util.concurrent.atomic.AtomicReference r3 = r2.f1223a     // Catch:{ all -> 0x001a }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x001a }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x001a }
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r3
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1007a1.mo12513e(long):android.os.Bundle");
    }

    /* renamed from: f */
    public final String mo12514f(long j) {
        return (String) m1667T(mo12513e(j), String.class);
    }
}

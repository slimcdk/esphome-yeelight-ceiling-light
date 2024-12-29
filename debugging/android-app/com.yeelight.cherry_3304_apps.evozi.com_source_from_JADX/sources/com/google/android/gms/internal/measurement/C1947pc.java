package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.yeelight.yeelib.p150c.p183m.C7200r;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.pc */
public final class C1947pc extends C2039vc {

    /* renamed from: a */
    private final AtomicReference<Bundle> f3675a = new AtomicReference<>();

    /* renamed from: b */
    private boolean f3676b;

    /* renamed from: c */
    public static <T> T m5822c(Bundle bundle, Class<T> cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get(C7200r.f14712G)) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            String canonicalName = cls.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            String.format("Unexpected object type. Expected, Received".concat(": %s, %s"), new Object[]{canonicalName, canonicalName2});
            throw e;
        }
    }

    /* renamed from: b */
    public final void mo11948b(Bundle bundle) {
        synchronized (this.f3675a) {
            try {
                this.f3675a.set(bundle);
                this.f3676b = true;
                this.f3675a.notify();
            } catch (Throwable th) {
                this.f3675a.notify();
                throw th;
            }
        }
    }

    /* renamed from: e */
    public final String mo11949e(long j) {
        return (String) m5822c(mo11950f(j), String.class);
    }

    /* renamed from: f */
    public final Bundle mo11950f(long j) {
        Bundle bundle;
        synchronized (this.f3675a) {
            if (!this.f3676b) {
                try {
                    this.f3675a.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.f3675a.get();
        }
        return bundle;
    }
}

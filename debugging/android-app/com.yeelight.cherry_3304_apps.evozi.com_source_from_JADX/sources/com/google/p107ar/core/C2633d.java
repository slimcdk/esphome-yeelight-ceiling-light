package com.google.p107ar.core;

import com.google.p107ar.core.ArCoreApk;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.ar.core.d */
class C2633d implements ArCoreApk.C2618a {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f5093a;

    C2633d(AtomicReference atomicReference) {
        this.f5093a = atomicReference;
    }

    /* renamed from: a */
    public void mo14945a(ArCoreApk.Availability availability) {
        this.f5093a.set(availability);
    }
}

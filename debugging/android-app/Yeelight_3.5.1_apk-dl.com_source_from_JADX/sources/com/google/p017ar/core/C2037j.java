package com.google.p017ar.core;

import com.google.p017ar.core.ArCoreApk;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.ar.core.j */
class C2037j implements ArCoreApk.C2003a {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f3187a;

    C2037j(AtomicReference atomicReference) {
        this.f3187a = atomicReference;
    }

    /* renamed from: a */
    public void mo16395a(ArCoreApk.Availability availability) {
        this.f3187a.set(availability);
    }
}

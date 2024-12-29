package com.google.p017ar.core;

import android.os.Bundle;
import com.google.p017ar.core.ArCoreApk;
import p027e.C3141e;

/* renamed from: com.google.ar.core.i0 */
final class C2036i0 extends C3141e {

    /* renamed from: a */
    private final /* synthetic */ C2038j0 f3186a;

    C2036i0(C2038j0 j0Var) {
        this.f3186a = j0Var;
    }

    /* renamed from: R */
    public final void mo16649R(Bundle bundle) {
        ArCoreApk.C2003a aVar;
        ArCoreApk.Availability availability;
        int i = bundle.getInt("error.code", -100);
        if (i != -5) {
            if (i != -3) {
                if (i != 0) {
                    StringBuilder sb = new StringBuilder(33);
                    sb.append("requestInfo returned: ");
                    sb.append(i);
                } else {
                    aVar = this.f3186a.f3189b;
                    availability = ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED;
                }
            }
            aVar = this.f3186a.f3189b;
            availability = ArCoreApk.Availability.UNKNOWN_ERROR;
        } else {
            aVar = this.f3186a.f3189b;
            availability = ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE;
        }
        aVar.mo16395a(availability);
    }

    /* renamed from: a */
    public final void mo16650a() {
    }

    /* renamed from: m */
    public final void mo16651m(Bundle bundle) {
    }
}

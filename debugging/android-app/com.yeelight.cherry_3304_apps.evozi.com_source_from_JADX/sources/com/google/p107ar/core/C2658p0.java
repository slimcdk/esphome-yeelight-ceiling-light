package com.google.p107ar.core;

import android.os.Bundle;
import com.google.p107ar.core.ArCoreApk;
import p011c.p012a.p013a.p015b.p016a.p017a.p018a.C0457e;

/* renamed from: com.google.ar.core.p0 */
final class C2658p0 extends C0457e {

    /* renamed from: a */
    private final /* synthetic */ C2660q0 f5140a;

    C2658p0(C2660q0 q0Var) {
        this.f5140a = q0Var;
    }

    /* renamed from: a */
    public final void mo8388a() {
    }

    /* renamed from: b0 */
    public final void mo8389b0(Bundle bundle) {
        ArCoreApk.C2618a aVar;
        ArCoreApk.Availability availability;
        int i = bundle.getInt("error.code", -100);
        if (i != -5) {
            if (i != -3) {
                if (i != 0) {
                    StringBuilder sb = new StringBuilder(33);
                    sb.append("requestInfo returned: ");
                    sb.append(i);
                    sb.toString();
                } else {
                    aVar = this.f5140a.f5144b;
                    availability = ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED;
                }
            }
            aVar = this.f5140a.f5144b;
            availability = ArCoreApk.Availability.UNKNOWN_ERROR;
        } else {
            aVar = this.f5140a.f5144b;
            availability = ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE;
        }
        aVar.mo14945a(availability);
    }

    /* renamed from: q */
    public final void mo8390q(Bundle bundle) {
    }
}

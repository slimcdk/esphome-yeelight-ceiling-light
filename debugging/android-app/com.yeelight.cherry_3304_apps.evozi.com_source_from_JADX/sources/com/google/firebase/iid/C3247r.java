package com.google.firebase.iid;

import android.os.Bundle;
import com.miot.bluetooth.channel.packet.Packet;

/* renamed from: com.google.firebase.iid.r */
final class C3247r extends C3243p<Bundle> {
    C3247r(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo17850a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(Packet.DATA);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        mo17852c(bundle2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo17853d() {
        return false;
    }
}

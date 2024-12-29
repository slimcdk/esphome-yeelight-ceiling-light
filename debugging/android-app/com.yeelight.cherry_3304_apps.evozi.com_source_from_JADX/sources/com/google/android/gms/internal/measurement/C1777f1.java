package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.f1 */
final class C1777f1 extends ContentObserver {
    C1777f1(Handler handler) {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        C1792g1.f3363e.set(true);
    }
}

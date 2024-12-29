package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.o5 */
final class C1235o5 extends ContentObserver {
    C1235o5(Handler handler) {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        C1251p5.f1507e.set(true);
    }
}

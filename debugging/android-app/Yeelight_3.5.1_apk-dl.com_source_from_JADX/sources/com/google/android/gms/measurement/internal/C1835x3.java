package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.C0879d;
import com.google.android.gms.common.internal.C0897c;

/* renamed from: com.google.android.gms.measurement.internal.x3 */
public final class C1835x3 extends C0897c {
    public C1835x3(Context context, Looper looper, C0897c.C0898a aVar, C0897c.C0899b bVar) {
        super(context, looper, 93, aVar, bVar, (String) null);
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: G */
    public final String mo12198G() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: H */
    public final String mo12199H() {
        return "com.google.android.gms.measurement.START";
    }

    /* renamed from: k */
    public final int mo12226k() {
        return C0879d.f886a;
    }

    /* renamed from: u */
    public final /* synthetic */ IInterface mo12233u(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof C1763r3 ? (C1763r3) queryLocalInterface : new C1739p3(iBinder);
    }
}

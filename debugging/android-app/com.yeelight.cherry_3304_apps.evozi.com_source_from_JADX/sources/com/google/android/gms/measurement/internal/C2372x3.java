package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.C1533g;
import com.google.android.gms.common.internal.C1550d;

/* renamed from: com.google.android.gms.measurement.internal.x3 */
public final class C2372x3 extends C1550d<C2273o3> {
    public C2372x3(Context context, Looper looper, C1550d.C1551a aVar, C1550d.C1552b bVar) {
        super(context, looper, 93, aVar, bVar, (String) null);
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: k */
    public final String mo11164k() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    /* renamed from: l */
    public final /* synthetic */ IInterface mo11165l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof C2273o3 ? (C2273o3) queryLocalInterface : new C2295q3(iBinder);
    }

    /* renamed from: n */
    public final int mo11167n() {
        return C1533g.f2900a;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: t */
    public final String mo11172t() {
        return "com.google.android.gms.measurement.START";
    }
}

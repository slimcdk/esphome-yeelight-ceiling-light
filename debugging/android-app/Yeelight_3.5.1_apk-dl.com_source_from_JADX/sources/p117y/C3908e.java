package p117y;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C0773f;
import com.google.android.gms.common.api.internal.C0810m;
import com.google.android.gms.common.internal.C0904d;
import com.google.android.gms.common.internal.C0907e;
import p040h0.C3233d;
import p109w.C3844i;

/* renamed from: y.e */
public final class C3908e extends C0907e {

    /* renamed from: S */
    private final C3844i f6548S;

    public C3908e(Context context, Looper looper, C0904d dVar, C3844i iVar, C0773f fVar, C0810m mVar) {
        super(context, looper, 270, dVar, fVar, mVar);
        this.f6548S = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Bundle mo12194C() {
        return this.f6548S.mo26318b();
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: G */
    public final String mo12198G() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: H */
    public final String mo12199H() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final boolean mo12202K() {
        return true;
    }

    /* renamed from: k */
    public final int mo12226k() {
        return 203400000;
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: u */
    public final /* synthetic */ IInterface mo12233u(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof C3904a ? (C3904a) queryLocalInterface : new C3904a(iBinder);
    }

    /* renamed from: x */
    public final Feature[] mo12236x() {
        return C3233d.f5216b;
    }
}

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import p109w.C3834d0;

@KeepName
@KeepForSdk
public final class BinderWrapper implements Parcelable {
    @NonNull
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new C0896b0();

    /* renamed from: a */
    private IBinder f931a;

    /* synthetic */ BinderWrapper(Parcel parcel, C3834d0 d0Var) {
        this.f931a = parcel.readStrongBinder();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f931a);
    }
}

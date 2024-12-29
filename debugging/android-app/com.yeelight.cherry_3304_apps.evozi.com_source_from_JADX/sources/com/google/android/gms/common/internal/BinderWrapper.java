package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
@KeepForSdk
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new C1573h0();

    /* renamed from: a */
    private IBinder f2941a;

    public BinderWrapper() {
        this.f2941a = null;
    }

    private BinderWrapper(Parcel parcel) {
        this.f2941a = null;
        this.f2941a = parcel.readStrongBinder();
    }

    /* synthetic */ BinderWrapper(Parcel parcel, C1573h0 h0Var) {
        this(parcel);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f2941a);
    }
}

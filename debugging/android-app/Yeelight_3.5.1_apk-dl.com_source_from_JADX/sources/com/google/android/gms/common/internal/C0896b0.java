package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p109w.C3834d0;

/* renamed from: com.google.android.gms.common.internal.b0 */
final class C0896b0 implements Parcelable.Creator {
    C0896b0() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BinderWrapper(parcel, (C3834d0) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BinderWrapper[i];
    }
}

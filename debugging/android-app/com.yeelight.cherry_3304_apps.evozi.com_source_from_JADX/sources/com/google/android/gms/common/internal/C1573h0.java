package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.common.internal.h0 */
final class C1573h0 implements Parcelable.Creator<BinderWrapper> {
    C1573h0() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BinderWrapper(parcel, (C1573h0) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BinderWrapper[i];
    }
}

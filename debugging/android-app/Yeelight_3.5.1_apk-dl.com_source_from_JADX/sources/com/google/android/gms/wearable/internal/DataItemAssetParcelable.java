package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.xiaomi.mipush.sdk.Constants;
import p069n0.C3361g;
import p113x.C3897a;

@KeepName
@SafeParcelable.Class(creator = "DataItemAssetParcelableCreator")
@SafeParcelable.Reserved({1})
public class DataItemAssetParcelable extends AbstractSafeParcelable implements C3361g, ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<DataItemAssetParcelable> CREATOR = new C1910a();
    @SafeParcelable.Field(getter = "getId", mo12312id = 2)

    /* renamed from: a */
    private final String f2989a;
    @SafeParcelable.Field(getter = "getDataItemKey", mo12312id = 3)

    /* renamed from: b */
    private final String f2990b;

    @SafeParcelable.Constructor
    DataItemAssetParcelable(@SafeParcelable.Param(mo12315id = 2) String str, @SafeParcelable.Param(mo12315id = 3) String str2) {
        this.f2989a = str;
        this.f2990b = str2;
    }

    public DataItemAssetParcelable(@RecentlyNonNull C3361g gVar) {
        this.f2989a = (String) C0917i.m1419j(gVar.getId());
        this.f2990b = (String) C0917i.m1419j(gVar.mo14829v());
    }

    @RecentlyNonNull
    /* renamed from: P */
    public final /* bridge */ /* synthetic */ Object mo14826P() {
        return this;
    }

    @RecentlyNonNull
    public final String getId() {
        return this.f2989a;
    }

    @RecentlyNonNull
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("DataItemAssetParcelable[@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.f2989a == null) {
            str = ",noid";
        } else {
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            str = this.f2989a;
        }
        sb.append(str);
        sb.append(", key=");
        sb.append(this.f2990b);
        sb.append("]");
        return sb.toString();
    }

    @RecentlyNonNull
    /* renamed from: v */
    public final String mo14829v() {
        return this.f2990b;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11122r(parcel, 2, this.f2989a, false);
        C3897a.m11122r(parcel, 3, this.f2990b, false);
        C3897a.m11106b(parcel, a);
    }
}

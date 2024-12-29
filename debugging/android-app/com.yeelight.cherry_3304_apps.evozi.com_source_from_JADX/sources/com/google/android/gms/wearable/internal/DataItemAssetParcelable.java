package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.C2424g;
import com.xiaomi.mipush.sdk.Constants;

@KeepName
@SafeParcelable.Class(creator = "DataItemAssetParcelableCreator")
@SafeParcelable.Reserved({1})
public class DataItemAssetParcelable extends AbstractSafeParcelable implements ReflectedParcelable, C2424g {
    public static final Parcelable.Creator<DataItemAssetParcelable> CREATOR = new C2506v();
    @SafeParcelable.Field(getter = "getId", mo11280id = 2)

    /* renamed from: a */
    private final String f4858a;
    @SafeParcelable.Field(getter = "getDataItemKey", mo11280id = 3)

    /* renamed from: b */
    private final String f4859b;

    public DataItemAssetParcelable(C2424g gVar) {
        String id = gVar.getId();
        C1609u.m4475k(id);
        this.f4858a = id;
        String o = gVar.mo13230o();
        C1609u.m4475k(o);
        this.f4859b = o;
    }

    @SafeParcelable.Constructor
    DataItemAssetParcelable(@SafeParcelable.Param(mo11283id = 2) String str, @SafeParcelable.Param(mo11283id = 3) String str2) {
        this.f4858a = str;
        this.f4859b = str2;
    }

    /* renamed from: L */
    public /* bridge */ /* synthetic */ Object mo11089L() {
        return this;
    }

    public String getId() {
        return this.f4858a;
    }

    /* renamed from: o */
    public String mo13230o() {
        return this.f4859b;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("DataItemAssetParcelable[");
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.f4858a == null) {
            str = ",noid";
        } else {
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            str = this.f4858a;
        }
        sb.append(str);
        sb.append(", key=");
        sb.append(this.f4859b);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4452r(parcel, 2, getId(), false);
        C1604b.m4452r(parcel, 3, mo13230o(), false);
        C1604b.m4436b(parcel, a);
    }
}

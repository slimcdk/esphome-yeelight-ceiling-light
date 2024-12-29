package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

@SafeParcelable.Class(creator = "ConverterWrapperCreator")
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new C1631a();
    @SafeParcelable.VersionField(mo11286id = 1)

    /* renamed from: a */
    private final int f3120a;
    @SafeParcelable.Field(getter = "getStringToIntConverter", mo11280id = 2)

    /* renamed from: b */
    private final StringToIntConverter f3121b;

    @SafeParcelable.Constructor
    zaa(@SafeParcelable.Param(mo11283id = 1) int i, @SafeParcelable.Param(mo11283id = 2) StringToIntConverter stringToIntConverter) {
        this.f3120a = i;
        this.f3121b = stringToIntConverter;
    }

    private zaa(StringToIntConverter stringToIntConverter) {
        this.f3120a = 1;
        this.f3121b = stringToIntConverter;
    }

    /* renamed from: Q */
    public static zaa m4518Q(FastJsonResponse.C1634a<?, ?> aVar) {
        if (aVar instanceof StringToIntConverter) {
            return new zaa((StringToIntConverter) aVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    /* renamed from: R */
    public final FastJsonResponse.C1634a<?, ?> mo11330R() {
        StringToIntConverter stringToIntConverter = this.f3121b;
        if (stringToIntConverter != null) {
            return stringToIntConverter;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 1, this.f3120a);
        C1604b.m4451q(parcel, 2, this.f3121b, i, false);
        C1604b.m4436b(parcel, a);
    }
}

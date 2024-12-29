package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import p113x.C3897a;

@SafeParcelable.Class(creator = "ConverterWrapperCreator")
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new C0947a();
    @SafeParcelable.VersionField(mo12321id = 1)

    /* renamed from: a */
    final int f1122a;
    @SafeParcelable.Field(getter = "getStringToIntConverter", mo12312id = 2)

    /* renamed from: b */
    private final StringToIntConverter f1123b;

    @SafeParcelable.Constructor
    zaa(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) StringToIntConverter stringToIntConverter) {
        this.f1122a = i;
        this.f1123b = stringToIntConverter;
    }

    private zaa(StringToIntConverter stringToIntConverter) {
        this.f1122a = 1;
        this.f1123b = stringToIntConverter;
    }

    /* renamed from: V */
    public static zaa m1542V(FastJsonResponse.C0950a aVar) {
        if (aVar instanceof StringToIntConverter) {
            return new zaa((StringToIntConverter) aVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    /* renamed from: W */
    public final FastJsonResponse.C0950a mo12377W() {
        StringToIntConverter stringToIntConverter = this.f1123b;
        if (stringToIntConverter != null) {
            return stringToIntConverter;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, this.f1122a);
        C3897a.m11121q(parcel, 2, this.f1123b, i, false);
        C3897a.m11106b(parcel, a);
    }
}

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.Map;

@ShowFirstParty
@SafeParcelable.Class(creator = "FieldMappingDictionaryEntryCreator")
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new C1638d();
    @SafeParcelable.VersionField(mo11286id = 1)

    /* renamed from: a */
    private final int f3143a;
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: b */
    final String f3144b;
    @SafeParcelable.Field(mo11280id = 3)

    /* renamed from: c */
    final ArrayList<zam> f3145c;

    @SafeParcelable.Constructor
    zal(@SafeParcelable.Param(mo11283id = 1) int i, @SafeParcelable.Param(mo11283id = 2) String str, @SafeParcelable.Param(mo11283id = 3) ArrayList<zam> arrayList) {
        this.f3143a = i;
        this.f3144b = str;
        this.f3145c = arrayList;
    }

    zal(String str, Map<String, FastJsonResponse.Field<?, ?>> map) {
        ArrayList<zam> arrayList;
        this.f3143a = 1;
        this.f3144b = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>();
            for (String next : map.keySet()) {
                arrayList.add(new zam(next, map.get(next)));
            }
        }
        this.f3145c = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 1, this.f3143a);
        C1604b.m4452r(parcel, 2, this.f3144b, false);
        C1604b.m4456v(parcel, 3, this.f3145c, false);
        C1604b.m4436b(parcel, a);
    }
}

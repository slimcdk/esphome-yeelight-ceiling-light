package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.Map;
import p113x.C3897a;

@ShowFirstParty
@SafeParcelable.Class(creator = "FieldMappingDictionaryEntryCreator")
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new C0954d();
    @SafeParcelable.VersionField(mo12321id = 1)

    /* renamed from: a */
    final int f1145a;
    @SafeParcelable.Field(mo12312id = 2)

    /* renamed from: b */
    final String f1146b;
    @SafeParcelable.Field(mo12312id = 3)
    @Nullable

    /* renamed from: c */
    final ArrayList f1147c;

    @SafeParcelable.Constructor
    zal(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) String str, @SafeParcelable.Param(mo12315id = 3) ArrayList arrayList) {
        this.f1145a = i;
        this.f1146b = str;
        this.f1147c = arrayList;
    }

    zal(String str, Map map) {
        ArrayList arrayList;
        this.f1145a = 1;
        this.f1146b = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam(str2, (FastJsonResponse.Field) map.get(str2)));
            }
        }
        this.f1147c = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, this.f1145a);
        C3897a.m11122r(parcel, 2, this.f1146b, false);
        C3897a.m11126v(parcel, 3, this.f1147c, false);
        C3897a.m11106b(parcel, a);
    }
}

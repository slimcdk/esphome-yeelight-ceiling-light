package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;

@KeepForSdk
@SafeParcelable.Class(creator = "StringToIntConverterCreator")
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.C1634a<String, Integer> {
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new C1632b();
    @SafeParcelable.VersionField(mo11286id = 1)

    /* renamed from: a */
    private final int f3114a;

    /* renamed from: b */
    private final HashMap<String, Integer> f3115b;

    /* renamed from: c */
    private final SparseArray<String> f3116c;

    @SafeParcelable.Class(creator = "StringToIntConverterEntryCreator")
    public static final class zaa extends AbstractSafeParcelable {
        public static final Parcelable.Creator<zaa> CREATOR = new C1633c();
        @SafeParcelable.VersionField(mo11286id = 1)

        /* renamed from: a */
        private final int f3117a;
        @SafeParcelable.Field(mo11280id = 2)

        /* renamed from: b */
        final String f3118b;
        @SafeParcelable.Field(mo11280id = 3)

        /* renamed from: c */
        final int f3119c;

        @SafeParcelable.Constructor
        zaa(@SafeParcelable.Param(mo11283id = 1) int i, @SafeParcelable.Param(mo11283id = 2) String str, @SafeParcelable.Param(mo11283id = 3) int i2) {
            this.f3117a = i;
            this.f3118b = str;
            this.f3119c = i2;
        }

        zaa(String str, int i) {
            this.f3117a = 1;
            this.f3118b = str;
            this.f3119c = i;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C1604b.m4435a(parcel);
            C1604b.m4446l(parcel, 1, this.f3117a);
            C1604b.m4452r(parcel, 2, this.f3118b, false);
            C1604b.m4446l(parcel, 3, this.f3119c);
            C1604b.m4436b(parcel, a);
        }
    }

    @KeepForSdk
    public StringToIntConverter() {
        this.f3114a = 1;
        this.f3115b = new HashMap<>();
        this.f3116c = new SparseArray<>();
    }

    @SafeParcelable.Constructor
    StringToIntConverter(@SafeParcelable.Param(mo11283id = 1) int i, @SafeParcelable.Param(mo11283id = 2) ArrayList<zaa> arrayList) {
        this.f3114a = i;
        this.f3115b = new HashMap<>();
        this.f3116c = new SparseArray<>();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            zaa zaa2 = arrayList.get(i2);
            i2++;
            zaa zaa3 = zaa2;
            mo11320Q(zaa3.f3118b, zaa3.f3119c);
        }
    }

    @KeepForSdk
    /* renamed from: Q */
    public final StringToIntConverter mo11320Q(String str, int i) {
        this.f3115b.put(str, Integer.valueOf(i));
        this.f3116c.put(i, str);
        return this;
    }

    /* renamed from: n */
    public final /* synthetic */ Object mo11321n(Object obj) {
        String str = this.f3116c.get(((Integer) obj).intValue());
        return (str != null || !this.f3115b.containsKey("gms_unknown")) ? str : "gms_unknown";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 1, this.f3114a);
        ArrayList arrayList = new ArrayList();
        for (String next : this.f3115b.keySet()) {
            arrayList.add(new zaa(next, this.f3115b.get(next).intValue()));
        }
        C1604b.m4456v(parcel, 2, arrayList, false);
        C1604b.m4436b(parcel, a);
    }
}

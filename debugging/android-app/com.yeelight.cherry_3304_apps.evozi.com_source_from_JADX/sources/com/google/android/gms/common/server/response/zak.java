package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@ShowFirstParty
@SafeParcelable.Class(creator = "FieldMappingDictionaryCreator")
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new C1637c();
    @SafeParcelable.VersionField(mo11286id = 1)

    /* renamed from: a */
    private final int f3140a;

    /* renamed from: b */
    private final HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> f3141b;
    @SafeParcelable.Field(getter = "getRootClassName", mo11280id = 3)

    /* renamed from: c */
    private final String f3142c;

    @SafeParcelable.Constructor
    zak(@SafeParcelable.Param(mo11283id = 1) int i, @SafeParcelable.Param(mo11283id = 2) ArrayList<zal> arrayList, @SafeParcelable.Param(mo11283id = 3) String str) {
        this.f3140a = i;
        HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> hashMap = new HashMap<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zal = arrayList.get(i2);
            String str2 = zal.f3144b;
            HashMap hashMap2 = new HashMap();
            int size2 = zal.f3145c.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zam = zal.f3145c.get(i3);
                hashMap2.put(zam.f3147b, zam.f3148c);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f3141b = hashMap;
        C1609u.m4475k(str);
        this.f3142c = str;
        mo11357Q();
    }

    /* renamed from: Q */
    public final void mo11357Q() {
        for (String str : this.f3141b.keySet()) {
            Map map = this.f3141b.get(str);
            for (String str2 : map.keySet()) {
                ((FastJsonResponse.Field) map.get(str2)).mo11337S(this);
            }
        }
    }

    /* renamed from: R */
    public final String mo11358R() {
        return this.f3142c;
    }

    /* renamed from: S */
    public final Map<String, FastJsonResponse.Field<?, ?>> mo11359S(String str) {
        return this.f3141b.get(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String next : this.f3141b.keySet()) {
            sb.append(next);
            sb.append(":\n");
            Map map = this.f3141b.get(next);
            for (String str : map.keySet()) {
                sb.append("  ");
                sb.append(str);
                sb.append(": ");
                sb.append(map.get(str));
            }
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 1, this.f3140a);
        ArrayList arrayList = new ArrayList();
        for (String next : this.f3141b.keySet()) {
            arrayList.add(new zal(next, this.f3141b.get(next)));
        }
        C1604b.m4456v(parcel, 2, arrayList, false);
        C1604b.m4452r(parcel, 3, this.f3142c, false);
        C1604b.m4436b(parcel, a);
    }
}

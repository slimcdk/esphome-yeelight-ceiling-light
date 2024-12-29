package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p113x.C3897a;

@ShowFirstParty
@SafeParcelable.Class(creator = "FieldMappingDictionaryCreator")
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new C0953c();
    @SafeParcelable.VersionField(mo12321id = 1)

    /* renamed from: a */
    final int f1151a;

    /* renamed from: b */
    private final HashMap f1152b;
    @SafeParcelable.Field(getter = "getRootClassName", mo12312id = 3)

    /* renamed from: c */
    private final String f1153c;

    @SafeParcelable.Constructor
    zan(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) ArrayList arrayList, @SafeParcelable.Param(mo12315id = 3) String str) {
        this.f1151a = i;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zal = (zal) arrayList.get(i2);
            String str2 = zal.f1146b;
            HashMap hashMap2 = new HashMap();
            int size2 = ((ArrayList) C0917i.m1419j(zal.f1147c)).size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zam = (zam) zal.f1147c.get(i3);
                hashMap2.put(zam.f1149b, zam.f1150c);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f1152b = hashMap;
        this.f1153c = (String) C0917i.m1419j(str);
        mo12414c0();
    }

    /* renamed from: V */
    public final String mo12412V() {
        return this.f1153c;
    }

    @Nullable
    /* renamed from: W */
    public final Map mo12413W(String str) {
        return (Map) this.f1152b.get(str);
    }

    /* renamed from: c0 */
    public final void mo12414c0() {
        for (String str : this.f1152b.keySet()) {
            Map map = (Map) this.f1152b.get(str);
            for (String str2 : map.keySet()) {
                ((FastJsonResponse.Field) map.get(str2)).mo12391h0(this);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f1152b.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map = (Map) this.f1152b.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, this.f1151a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f1152b.keySet()) {
            arrayList.add(new zal(str, (Map) this.f1152b.get(str)));
        }
        C3897a.m11126v(parcel, 2, arrayList, false);
        C3897a.m11122r(parcel, 3, this.f1153c, false);
        C3897a.m11106b(parcel, a);
    }
}

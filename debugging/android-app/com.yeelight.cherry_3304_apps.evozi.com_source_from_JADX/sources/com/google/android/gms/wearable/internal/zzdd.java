package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.wearable.C2423f;
import com.google.android.gms.wearable.C2424g;
import java.util.HashMap;
import java.util.Map;

@SafeParcelable.Class(creator = "DataItemParcelableCreator")
@SafeParcelable.Reserved({1})
@VisibleForTesting
public final class zzdd extends AbstractSafeParcelable implements C2423f {
    public static final Parcelable.Creator<zzdd> CREATOR = new C2515y();
    @SafeParcelable.Field(getter = "getUri", mo11280id = 2)

    /* renamed from: a */
    private final Uri f4947a;
    @SafeParcelable.Field(getter = "getAssetsInternal", mo11280id = 4, type = "android.os.Bundle")

    /* renamed from: b */
    private final Map<String, C2424g> f4948b;
    @SafeParcelable.Field(getter = "getData", mo11280id = 5)

    /* renamed from: c */
    private byte[] f4949c;

    @SafeParcelable.Constructor
    zzdd(@SafeParcelable.Param(mo11283id = 2) Uri uri, @SafeParcelable.Param(mo11283id = 4) Bundle bundle, @SafeParcelable.Param(mo11283id = 5) byte[] bArr) {
        this.f4947a = uri;
        HashMap hashMap = new HashMap();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (String str : bundle.keySet()) {
            hashMap.put(str, (DataItemAssetParcelable) bundle.getParcelable(str));
        }
        this.f4948b = hashMap;
        this.f4949c = bArr;
    }

    /* renamed from: L */
    public final /* bridge */ /* synthetic */ Object mo11089L() {
        return this;
    }

    /* renamed from: M */
    public final Uri mo13226M() {
        return this.f4947a;
    }

    @VisibleForTesting
    /* renamed from: h */
    public final byte[] mo13227h() {
        return this.f4949c;
    }

    public final String toString() {
        String str;
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemParcelable[");
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.f4949c;
        String valueOf = String.valueOf(bArr == null ? "null" : Integer.valueOf(bArr.length));
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb2.append(",dataSz=");
        sb2.append(valueOf);
        sb.append(sb2.toString());
        int size = this.f4948b.size();
        StringBuilder sb3 = new StringBuilder(23);
        sb3.append(", numAssets=");
        sb3.append(size);
        sb.append(sb3.toString());
        String valueOf2 = String.valueOf(this.f4947a);
        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 6);
        sb4.append(", uri=");
        sb4.append(valueOf2);
        sb.append(sb4.toString());
        if (!isLoggable) {
            str = "]";
        } else {
            sb.append("]\n  assets: ");
            for (String next : this.f4948b.keySet()) {
                String valueOf3 = String.valueOf(this.f4948b.get(next));
                StringBuilder sb5 = new StringBuilder(String.valueOf(next).length() + 7 + String.valueOf(valueOf3).length());
                sb5.append("\n    ");
                sb5.append(next);
                sb5.append(": ");
                sb5.append(valueOf3);
                sb.append(sb5.toString());
            }
            str = "\n  ]";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: u */
    public final Map<String, C2424g> mo13228u() {
        return this.f4948b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4451q(parcel, 2, mo13226M(), i, false);
        Bundle bundle = new Bundle();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (Map.Entry next : this.f4948b.entrySet()) {
            bundle.putParcelable((String) next.getKey(), new DataItemAssetParcelable((C2424g) next.getValue()));
        }
        C1604b.m4439e(parcel, 4, bundle, false);
        C1604b.m4441g(parcel, 5, mo13227h(), false);
        C1604b.m4436b(parcel, a);
    }
}

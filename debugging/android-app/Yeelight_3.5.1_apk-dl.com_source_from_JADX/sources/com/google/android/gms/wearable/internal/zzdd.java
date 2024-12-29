package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
import p069n0.C3360f;
import p069n0.C3361g;
import p113x.C3897a;

@SafeParcelable.Class(creator = "DataItemParcelableCreator")
@SafeParcelable.Reserved({1})
@VisibleForTesting
public final class zzdd extends AbstractSafeParcelable implements C3360f {
    public static final Parcelable.Creator<zzdd> CREATOR = new C1911b();
    @SafeParcelable.Field(getter = "getUri", mo12312id = 2)

    /* renamed from: a */
    private final Uri f3019a;
    @SafeParcelable.Field(getter = "getAssetsInternal", mo12312id = 4, type = "android.os.Bundle")

    /* renamed from: b */
    private final Map<String, C3361g> f3020b;
    @SafeParcelable.Field(getter = "getData", mo12312id = 5)

    /* renamed from: c */
    private byte[] f3021c;

    @SafeParcelable.Constructor
    zzdd(@SafeParcelable.Param(mo12315id = 2) Uri uri, @SafeParcelable.Param(mo12315id = 4) Bundle bundle, @SafeParcelable.Param(mo12315id = 5) byte[] bArr) {
        this.f3019a = uri;
        HashMap hashMap = new HashMap();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (String str : bundle.keySet()) {
            hashMap.put(str, (DataItemAssetParcelable) bundle.getParcelable(str));
        }
        this.f3020b = hashMap;
        this.f3021c = bArr;
    }

    /* renamed from: A */
    public final Map<String, C3361g> mo14868A() {
        return this.f3020b;
    }

    /* renamed from: P */
    public final /* bridge */ /* synthetic */ Object mo14826P() {
        return this;
    }

    /* renamed from: T */
    public final Uri mo14869T() {
        return this.f3019a;
    }

    @VisibleForTesting
    /* renamed from: m */
    public final byte[] mo14870m() {
        return this.f3021c;
    }

    public final String toString() {
        String str;
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemParcelable[");
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.f3021c;
        String valueOf = String.valueOf(bArr == null ? "null" : Integer.valueOf(bArr.length));
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
        sb2.append(",dataSz=");
        sb2.append(valueOf);
        sb.append(sb2.toString());
        int size = this.f3020b.size();
        StringBuilder sb3 = new StringBuilder(23);
        sb3.append(", numAssets=");
        sb3.append(size);
        sb.append(sb3.toString());
        String valueOf2 = String.valueOf(this.f3019a);
        StringBuilder sb4 = new StringBuilder(valueOf2.length() + 6);
        sb4.append(", uri=");
        sb4.append(valueOf2);
        sb.append(sb4.toString());
        if (!isLoggable) {
            str = "]";
        } else {
            sb.append("]\n  assets: ");
            for (String next : this.f3020b.keySet()) {
                String valueOf3 = String.valueOf(this.f3020b.get(next));
                StringBuilder sb5 = new StringBuilder(String.valueOf(next).length() + 7 + valueOf3.length());
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

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11121q(parcel, 2, this.f3019a, i, false);
        Bundle bundle = new Bundle();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (Map.Entry next : this.f3020b.entrySet()) {
            bundle.putParcelable((String) next.getKey(), new DataItemAssetParcelable((C3361g) next.getValue()));
        }
        C3897a.m11109e(parcel, 4, bundle, false);
        C3897a.m11111g(parcel, 5, this.f3021c, false);
        C3897a.m11106b(parcel, a);
    }
}

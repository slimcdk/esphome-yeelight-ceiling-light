package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C1548c;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@SafeParcelable.Class(creator = "PutDataRequestCreator")
@SafeParcelable.Reserved({1})
@VisibleForTesting
public class PutDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PutDataRequest> CREATOR = new C2533s();
    public static final String WEAR_URI_SCHEME = "wear";

    /* renamed from: e */
    private static final long f4849e = TimeUnit.MINUTES.toMillis(30);
    @SafeParcelable.Field(getter = "getUri", mo11280id = 2)

    /* renamed from: a */
    private final Uri f4850a;
    @SafeParcelable.Field(getter = "getAssetsInternal", mo11280id = 4)

    /* renamed from: b */
    private final Bundle f4851b;
    @SafeParcelable.Field(getter = "getData", mo11280id = 5)

    /* renamed from: c */
    private byte[] f4852c;
    @SafeParcelable.Field(getter = "getSyncDeadline", mo11280id = 6)

    /* renamed from: d */
    private long f4853d;

    static {
        new SecureRandom();
    }

    private PutDataRequest(Uri uri) {
        this(uri, new Bundle(), (byte[]) null, f4849e);
    }

    @SafeParcelable.Constructor
    PutDataRequest(@SafeParcelable.Param(mo11283id = 2) Uri uri, @SafeParcelable.Param(mo11283id = 4) Bundle bundle, @SafeParcelable.Param(mo11283id = 5) byte[] bArr, @SafeParcelable.Param(mo11283id = 6) long j) {
        this.f4850a = uri;
        this.f4851b = bundle;
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        this.f4852c = bArr;
        this.f4853d = j;
    }

    /* renamed from: Q */
    public static PutDataRequest m7859Q(@NonNull String str) {
        C1548c.m4205d(str, "path must not be null");
        return m7861Z(m7860X(str));
    }

    /* renamed from: X */
    private static Uri m7860X(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("An empty path was supplied.");
        } else if (!str.startsWith(MiotCloudImpl.COOKIE_PATH)) {
            throw new IllegalArgumentException("A path must start with a single / .");
        } else if (!str.startsWith("//")) {
            return new Uri.Builder().scheme(WEAR_URI_SCHEME).path(str).build();
        } else {
            throw new IllegalArgumentException("A path must start with a single / .");
        }
    }

    /* renamed from: Z */
    public static PutDataRequest m7861Z(@NonNull Uri uri) {
        C1548c.m4205d(uri, "uri must not be null");
        return new PutDataRequest(uri);
    }

    /* renamed from: M */
    public Uri mo13208M() {
        return this.f4850a;
    }

    /* renamed from: R */
    public boolean mo13209R() {
        return this.f4853d == 0;
    }

    /* renamed from: S */
    public PutDataRequest mo13210S(@NonNull String str, @NonNull Asset asset) {
        C1609u.m4475k(str);
        C1609u.m4475k(asset);
        this.f4851b.putParcelable(str, asset);
        return this;
    }

    /* renamed from: T */
    public PutDataRequest mo13211T(byte[] bArr) {
        this.f4852c = bArr;
        return this;
    }

    /* renamed from: V */
    public PutDataRequest mo13212V() {
        this.f4853d = 0;
        return this;
    }

    /* renamed from: W */
    public String mo13213W(boolean z) {
        String str;
        StringBuilder sb = new StringBuilder("PutDataRequest[");
        byte[] bArr = this.f4852c;
        String valueOf = String.valueOf(bArr == null ? "null" : Integer.valueOf(bArr.length));
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 7);
        sb2.append("dataSz=");
        sb2.append(valueOf);
        sb.append(sb2.toString());
        int size = this.f4851b.size();
        StringBuilder sb3 = new StringBuilder(23);
        sb3.append(", numAssets=");
        sb3.append(size);
        sb.append(sb3.toString());
        String valueOf2 = String.valueOf(this.f4850a);
        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 6);
        sb4.append(", uri=");
        sb4.append(valueOf2);
        sb.append(sb4.toString());
        long j = this.f4853d;
        StringBuilder sb5 = new StringBuilder(35);
        sb5.append(", syncDeadline=");
        sb5.append(j);
        sb.append(sb5.toString());
        if (!z) {
            str = "]";
        } else {
            sb.append("]\n  assets: ");
            for (String str2 : this.f4851b.keySet()) {
                String valueOf3 = String.valueOf(this.f4851b.getParcelable(str2));
                StringBuilder sb6 = new StringBuilder(String.valueOf(str2).length() + 7 + String.valueOf(valueOf3).length());
                sb6.append("\n    ");
                sb6.append(str2);
                sb6.append(": ");
                sb6.append(valueOf3);
                sb.append(sb6.toString());
            }
            str = "\n  ]";
        }
        sb.append(str);
        return sb.toString();
    }

    @VisibleForTesting
    /* renamed from: h */
    public byte[] mo13214h() {
        return this.f4852c;
    }

    public String toString() {
        return mo13213W(Log.isLoggable("DataMap", 3));
    }

    /* renamed from: u */
    public Map<String, Asset> mo13216u() {
        HashMap hashMap = new HashMap();
        for (String str : this.f4851b.keySet()) {
            hashMap.put(str, (Asset) this.f4851b.getParcelable(str));
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        C1548c.m4205d(parcel, "dest must not be null");
        int a = C1604b.m4435a(parcel);
        C1604b.m4451q(parcel, 2, mo13208M(), i, false);
        C1604b.m4439e(parcel, 4, this.f4851b, false);
        C1604b.m4441g(parcel, 5, mo13214h(), false);
        C1604b.m4448n(parcel, 6, this.f4853d);
        C1604b.m4436b(parcel, a);
    }
}

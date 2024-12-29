package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p113x.C3897a;

@SafeParcelable.Class(creator = "PutDataRequestCreator")
@SafeParcelable.Reserved({1})
@VisibleForTesting
public class PutDataRequest extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<PutDataRequest> CREATOR = new C1908e();
    @RecentlyNonNull
    public static final String WEAR_URI_SCHEME = "wear";

    /* renamed from: e */
    private static final long f2978e = TimeUnit.MINUTES.toMillis(30);
    @SafeParcelable.Field(getter = "getUri", mo12312id = 2)

    /* renamed from: a */
    private final Uri f2979a;
    @SafeParcelable.Field(getter = "getAssetsInternal", mo12312id = 4)

    /* renamed from: b */
    private final Bundle f2980b;
    @SafeParcelable.Field(getter = "getData", mo12312id = 5)
    @Nullable

    /* renamed from: c */
    private byte[] f2981c;
    @SafeParcelable.Field(getter = "getSyncDeadline", mo12312id = 6)

    /* renamed from: d */
    private long f2982d;

    static {
        new SecureRandom();
    }

    private PutDataRequest(Uri uri) {
        this(uri, new Bundle(), (byte[]) null, f2978e);
    }

    @SafeParcelable.Constructor
    PutDataRequest(@SafeParcelable.Param(mo12315id = 2) Uri uri, @SafeParcelable.Param(mo12315id = 4) Bundle bundle, @SafeParcelable.Param(mo12315id = 5) @Nullable byte[] bArr, @SafeParcelable.Param(mo12315id = 6) long j) {
        this.f2979a = uri;
        this.f2980b = bundle;
        bundle.setClassLoader((ClassLoader) C0917i.m1419j(DataItemAssetParcelable.class.getClassLoader()));
        this.f2981c = bArr;
        this.f2982d = j;
    }

    @RecentlyNonNull
    /* renamed from: V */
    public static PutDataRequest m5034V(@RecentlyNonNull String str) {
        C0917i.m1420k(str, "path must not be null");
        return m5035h0(m5036k0(str));
    }

    @RecentlyNonNull
    /* renamed from: h0 */
    public static PutDataRequest m5035h0(@RecentlyNonNull Uri uri) {
        C0917i.m1420k(uri, "uri must not be null");
        return new PutDataRequest(uri);
    }

    /* renamed from: k0 */
    private static Uri m5036k0(String str) {
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

    @RecentlyNonNull
    /* renamed from: A */
    public Map<String, Asset> mo14807A() {
        HashMap hashMap = new HashMap();
        for (String str : this.f2980b.keySet()) {
            hashMap.put(str, (Asset) this.f2980b.getParcelable(str));
        }
        return Collections.unmodifiableMap(hashMap);
    }

    @RecentlyNonNull
    /* renamed from: T */
    public Uri mo14808T() {
        return this.f2979a;
    }

    /* renamed from: W */
    public boolean mo14809W() {
        return this.f2982d == 0;
    }

    @RecentlyNonNull
    /* renamed from: c0 */
    public PutDataRequest mo14810c0(@RecentlyNonNull String str, @RecentlyNonNull Asset asset) {
        C0917i.m1419j(str);
        C0917i.m1419j(asset);
        this.f2980b.putParcelable(str, asset);
        return this;
    }

    @RecentlyNonNull
    /* renamed from: d0 */
    public PutDataRequest mo14811d0(@RecentlyNonNull byte[] bArr) {
        this.f2981c = bArr;
        return this;
    }

    @RecentlyNonNull
    /* renamed from: f0 */
    public PutDataRequest mo14812f0() {
        this.f2982d = 0;
        return this;
    }

    @RecentlyNonNull
    /* renamed from: g0 */
    public String mo14813g0(boolean z) {
        String str;
        StringBuilder sb = new StringBuilder("PutDataRequest[");
        byte[] bArr = this.f2981c;
        String valueOf = String.valueOf(bArr == null ? "null" : Integer.valueOf(bArr.length));
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 7);
        sb2.append("dataSz=");
        sb2.append(valueOf);
        sb.append(sb2.toString());
        int size = this.f2980b.size();
        StringBuilder sb3 = new StringBuilder(23);
        sb3.append(", numAssets=");
        sb3.append(size);
        sb.append(sb3.toString());
        String valueOf2 = String.valueOf(this.f2979a);
        StringBuilder sb4 = new StringBuilder(valueOf2.length() + 6);
        sb4.append(", uri=");
        sb4.append(valueOf2);
        sb.append(sb4.toString());
        long j = this.f2982d;
        StringBuilder sb5 = new StringBuilder(35);
        sb5.append(", syncDeadline=");
        sb5.append(j);
        sb.append(sb5.toString());
        if (!z) {
            str = "]";
        } else {
            sb.append("]\n  assets: ");
            for (String str2 : this.f2980b.keySet()) {
                String valueOf3 = String.valueOf(this.f2980b.getParcelable(str2));
                StringBuilder sb6 = new StringBuilder(String.valueOf(str2).length() + 7 + valueOf3.length());
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

    @RecentlyNullable
    @VisibleForTesting
    /* renamed from: m */
    public byte[] mo14814m() {
        return this.f2981c;
    }

    @RecentlyNonNull
    public String toString() {
        return mo14813g0(Log.isLoggable("DataMap", 3));
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        C0917i.m1420k(parcel, "dest must not be null");
        int a = C3897a.m11105a(parcel);
        C3897a.m11121q(parcel, 2, mo14808T(), i, false);
        C3897a.m11109e(parcel, 4, this.f2980b, false);
        C3897a.m11111g(parcel, 5, mo14814m(), false);
        C3897a.m11118n(parcel, 6, this.f2982d);
        C3897a.m11106b(parcel, a);
    }
}

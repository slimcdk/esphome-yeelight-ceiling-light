package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C0914h;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Arrays;
import p113x.C3897a;

@SafeParcelable.Class(creator = "AssetCreator")
@SafeParcelable.Reserved({1})
@VisibleForTesting
public class Asset extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<Asset> CREATOR = new C1906c();
    @SafeParcelable.Field(getter = "getData", mo12312id = 2)
    @Nullable

    /* renamed from: a */
    private byte[] f2963a;
    @SafeParcelable.Field(getter = "getDigest", mo12312id = 3)
    @Nullable

    /* renamed from: b */
    private String f2964b;
    @SafeParcelable.Field(mo12312id = 4)
    @RecentlyNullable

    /* renamed from: c */
    public ParcelFileDescriptor f2965c;
    @SafeParcelable.Field(mo12312id = 5)
    @RecentlyNullable

    /* renamed from: d */
    public Uri f2966d;

    @SafeParcelable.Constructor
    Asset(@SafeParcelable.Param(mo12315id = 2) @Nullable byte[] bArr, @SafeParcelable.Param(mo12315id = 3) @Nullable String str, @SafeParcelable.Param(mo12315id = 4) @Nullable ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param(mo12315id = 5) @Nullable Uri uri) {
        this.f2963a = bArr;
        this.f2964b = str;
        this.f2965c = parcelFileDescriptor;
        this.f2966d = uri;
    }

    @RecentlyNonNull
    @VisibleForTesting
    /* renamed from: V */
    public static Asset m5019V(@RecentlyNonNull ParcelFileDescriptor parcelFileDescriptor) {
        C0917i.m1419j(parcelFileDescriptor);
        return new Asset((byte[]) null, (String) null, parcelFileDescriptor, (Uri) null);
    }

    @RecentlyNonNull
    /* renamed from: W */
    public static Asset m5020W(@RecentlyNonNull String str) {
        C0917i.m1419j(str);
        return new Asset((byte[]) null, str, (ParcelFileDescriptor) null, (Uri) null);
    }

    @RecentlyNullable
    /* renamed from: T */
    public Uri mo14780T() {
        return this.f2966d;
    }

    @RecentlyNullable
    /* renamed from: c0 */
    public String mo14781c0() {
        return this.f2964b;
    }

    @RecentlyNullable
    /* renamed from: d0 */
    public ParcelFileDescriptor mo14782d0() {
        return this.f2965c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) obj;
        return Arrays.equals(this.f2963a, asset.f2963a) && C0914h.m1402a(this.f2964b, asset.f2964b) && C0914h.m1402a(this.f2965c, asset.f2965c) && C0914h.m1402a(this.f2966d, asset.f2966d);
    }

    @RecentlyNullable
    /* renamed from: f0 */
    public final byte[] mo14784f0() {
        return this.f2963a;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.f2963a, this.f2964b, this.f2965c, this.f2966d});
    }

    @RecentlyNonNull
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Asset[@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.f2964b == null) {
            str = ", nodigest";
        } else {
            sb.append(", ");
            str = this.f2964b;
        }
        sb.append(str);
        if (this.f2963a != null) {
            sb.append(", size=");
            sb.append(((byte[]) C0917i.m1419j(this.f2963a)).length);
        }
        if (this.f2965c != null) {
            sb.append(", fd=");
            sb.append(this.f2965c);
        }
        if (this.f2966d != null) {
            sb.append(", uri=");
            sb.append(this.f2966d);
        }
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        C0917i.m1419j(parcel);
        int i2 = i | 1;
        int a = C3897a.m11105a(parcel);
        C3897a.m11111g(parcel, 2, this.f2963a, false);
        C3897a.m11122r(parcel, 3, mo14781c0(), false);
        C3897a.m11121q(parcel, 4, this.f2965c, i2, false);
        C3897a.m11121q(parcel, 5, this.f2966d, i2, false);
        C3897a.m11106b(parcel, a);
    }
}

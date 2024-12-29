package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C1548c;
import com.google.android.gms.common.internal.C1599s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Arrays;

@SafeParcelable.Class(creator = "AssetCreator")
@SafeParcelable.Reserved({1})
@VisibleForTesting
public class Asset extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Asset> CREATOR = new C2531q();
    @SafeParcelable.Field(getter = "getData", mo11280id = 2)

    /* renamed from: a */
    private byte[] f4836a;
    @SafeParcelable.Field(getter = "getDigest", mo11280id = 3)

    /* renamed from: b */
    private String f4837b;
    @SafeParcelable.Field(mo11280id = 4)

    /* renamed from: c */
    private ParcelFileDescriptor f4838c;
    @SafeParcelable.Field(mo11280id = 5)

    /* renamed from: d */
    private Uri f4839d;

    @SafeParcelable.Constructor
    Asset(@SafeParcelable.Param(mo11283id = 2) byte[] bArr, @SafeParcelable.Param(mo11283id = 3) String str, @SafeParcelable.Param(mo11283id = 4) ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param(mo11283id = 5) Uri uri) {
        this.f4836a = bArr;
        this.f4837b = str;
        this.f4838c = parcelFileDescriptor;
        this.f4839d = uri;
    }

    @VisibleForTesting
    /* renamed from: Q */
    public static Asset m7842Q(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
        C1548c.m4204c(parcelFileDescriptor);
        return new Asset((byte[]) null, (String) null, parcelFileDescriptor, (Uri) null);
    }

    /* renamed from: R */
    public static Asset m7843R(@NonNull String str) {
        C1548c.m4204c(str);
        return new Asset((byte[]) null, str, (ParcelFileDescriptor) null, (Uri) null);
    }

    /* renamed from: M */
    public Uri mo13185M() {
        return this.f4839d;
    }

    /* renamed from: S */
    public String mo13186S() {
        return this.f4837b;
    }

    /* renamed from: T */
    public ParcelFileDescriptor mo13187T() {
        return this.f4838c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) obj;
        return Arrays.equals(this.f4836a, asset.f4836a) && C1599s.m4388a(this.f4837b, asset.f4837b) && C1599s.m4388a(this.f4838c, asset.f4838c) && C1599s.m4388a(this.f4839d, asset.f4839d);
    }

    /* renamed from: h */
    public final byte[] mo13189h() {
        return this.f4836a;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.f4836a, this.f4837b, this.f4838c, this.f4839d});
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Asset[@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.f4837b == null) {
            str = ", nodigest";
        } else {
            sb.append(", ");
            str = this.f4837b;
        }
        sb.append(str);
        if (this.f4836a != null) {
            sb.append(", size=");
            sb.append(this.f4836a.length);
        }
        if (this.f4838c != null) {
            sb.append(", fd=");
            sb.append(this.f4838c);
        }
        if (this.f4839d != null) {
            sb.append(", uri=");
            sb.append(this.f4839d);
        }
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        C1548c.m4204c(parcel);
        int i2 = i | 1;
        int a = C1604b.m4435a(parcel);
        C1604b.m4441g(parcel, 2, this.f4836a, false);
        C1604b.m4452r(parcel, 3, mo13186S(), false);
        C1604b.m4451q(parcel, 4, this.f4838c, i2, false);
        C1604b.m4451q(parcel, 5, this.f4839d, i2, false);
        C1604b.m4436b(parcel, a);
    }
}

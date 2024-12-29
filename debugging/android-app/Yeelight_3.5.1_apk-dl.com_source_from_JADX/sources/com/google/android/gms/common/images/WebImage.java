package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0914h;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;
import p113x.C3897a;

@SafeParcelable.Class(creator = "WebImageCreator")
public final class WebImage extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<WebImage> CREATOR = new C0892d();
    @SafeParcelable.VersionField(mo12321id = 1)

    /* renamed from: a */
    final int f919a;
    @SafeParcelable.Field(getter = "getUrl", mo12312id = 2)

    /* renamed from: b */
    private final Uri f920b;
    @SafeParcelable.Field(getter = "getWidth", mo12312id = 3)

    /* renamed from: c */
    private final int f921c;
    @SafeParcelable.Field(getter = "getHeight", mo12312id = 4)

    /* renamed from: d */
    private final int f922d;

    @SafeParcelable.Constructor
    WebImage(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) Uri uri, @SafeParcelable.Param(mo12315id = 3) int i2, @SafeParcelable.Param(mo12315id = 4) int i3) {
        this.f919a = i;
        this.f920b = uri;
        this.f921c = i2;
        this.f922d = i3;
    }

    /* renamed from: V */
    public int mo12148V() {
        return this.f922d;
    }

    @NonNull
    /* renamed from: W */
    public Uri mo12149W() {
        return this.f920b;
    }

    /* renamed from: c0 */
    public int mo12150c0() {
        return this.f921c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            return C0914h.m1402a(this.f920b, webImage.f920b) && this.f921c == webImage.f921c && this.f922d == webImage.f922d;
        }
    }

    public int hashCode() {
        return C0914h.m1403b(this.f920b, Integer.valueOf(this.f921c), Integer.valueOf(this.f922d));
    }

    @NonNull
    public String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.f921c), Integer.valueOf(this.f922d), this.f920b.toString()});
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, this.f919a);
        C3897a.m11121q(parcel, 2, mo12149W(), i, false);
        C3897a.m11116l(parcel, 3, mo12150c0());
        C3897a.m11116l(parcel, 4, mo12148V());
        C3897a.m11106b(parcel, a);
    }
}

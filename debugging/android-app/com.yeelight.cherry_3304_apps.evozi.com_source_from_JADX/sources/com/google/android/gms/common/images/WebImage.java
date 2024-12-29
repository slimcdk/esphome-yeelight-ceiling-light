package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1599s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

@SafeParcelable.Class(creator = "WebImageCreator")
public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebImage> CREATOR = new C1543c();
    @SafeParcelable.VersionField(mo11286id = 1)

    /* renamed from: a */
    private final int f2929a;
    @SafeParcelable.Field(getter = "getUrl", mo11280id = 2)

    /* renamed from: b */
    private final Uri f2930b;
    @SafeParcelable.Field(getter = "getWidth", mo11280id = 3)

    /* renamed from: c */
    private final int f2931c;
    @SafeParcelable.Field(getter = "getHeight", mo11280id = 4)

    /* renamed from: d */
    private final int f2932d;

    @SafeParcelable.Constructor
    WebImage(@SafeParcelable.Param(mo11283id = 1) int i, @SafeParcelable.Param(mo11283id = 2) Uri uri, @SafeParcelable.Param(mo11283id = 3) int i2, @SafeParcelable.Param(mo11283id = 4) int i3) {
        this.f2929a = i;
        this.f2930b = uri;
        this.f2931c = i2;
        this.f2932d = i3;
    }

    /* renamed from: Q */
    public final int mo11100Q() {
        return this.f2932d;
    }

    /* renamed from: R */
    public final Uri mo11101R() {
        return this.f2930b;
    }

    /* renamed from: S */
    public final int mo11102S() {
        return this.f2931c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            return C1599s.m4388a(this.f2930b, webImage.f2930b) && this.f2931c == webImage.f2931c && this.f2932d == webImage.f2932d;
        }
    }

    public final int hashCode() {
        return C1599s.m4389b(this.f2930b, Integer.valueOf(this.f2931c), Integer.valueOf(this.f2932d));
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.f2931c), Integer.valueOf(this.f2932d), this.f2930b.toString()});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 1, this.f2929a);
        C1604b.m4451q(parcel, 2, mo11101R(), i, false);
        C1604b.m4446l(parcel, 3, mo11102S());
        C1604b.m4446l(parcel, 4, mo11100Q());
        C1604b.m4436b(parcel, a);
    }
}

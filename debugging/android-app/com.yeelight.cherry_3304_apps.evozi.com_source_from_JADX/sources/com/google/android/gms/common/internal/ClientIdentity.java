package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.xiaomi.mipush.sdk.Constants;

@KeepForSdk
@SafeParcelable.Class(creator = "ClientIdentityCreator")
@SafeParcelable.Reserved({1000})
public class ClientIdentity extends AbstractSafeParcelable {
    @KeepForSdk
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new C1616y();
    @SafeParcelable.Field(defaultValueUnchecked = "0", mo11280id = 1)

    /* renamed from: a */
    private final int f2942a;
    @SafeParcelable.Field(defaultValueUnchecked = "null", mo11280id = 2)
    @Nullable

    /* renamed from: b */
    private final String f2943b;

    @SafeParcelable.Constructor
    public ClientIdentity(@SafeParcelable.Param(mo11283id = 1) int i, @SafeParcelable.Param(mo11283id = 2) @Nullable String str) {
        this.f2942a = i;
        this.f2943b = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ClientIdentity)) {
            ClientIdentity clientIdentity = (ClientIdentity) obj;
            return clientIdentity.f2942a == this.f2942a && C1599s.m4388a(clientIdentity.f2943b, this.f2943b);
        }
    }

    public int hashCode() {
        return this.f2942a;
    }

    public String toString() {
        int i = this.f2942a;
        String str = this.f2943b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(Constants.COLON_SEPARATOR);
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 1, this.f2942a);
        C1604b.m4452r(parcel, 2, this.f2943b, false);
        C1604b.m4436b(parcel, a);
    }
}

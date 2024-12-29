package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1599s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ConnectionConfigurationCreator")
@SafeParcelable.Reserved({1})
public class ConnectionConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ConnectionConfiguration> CREATOR = new C2532r();
    @SafeParcelable.Field(getter = "getName", mo11280id = 2)

    /* renamed from: a */
    private final String f4840a;
    @SafeParcelable.Field(getter = "getAddress", mo11280id = 3)

    /* renamed from: b */
    private final String f4841b;
    @SafeParcelable.Field(getter = "getType", mo11280id = 4)

    /* renamed from: c */
    private final int f4842c;
    @SafeParcelable.Field(getter = "getRole", mo11280id = 5)

    /* renamed from: d */
    private final int f4843d;
    @SafeParcelable.Field(getter = "isEnabled", mo11280id = 6)

    /* renamed from: e */
    private final boolean f4844e;
    @SafeParcelable.Field(getter = "isConnected", mo11280id = 7)

    /* renamed from: f */
    private volatile boolean f4845f;
    @SafeParcelable.Field(getter = "getPeerNodeId", mo11280id = 8)

    /* renamed from: g */
    private volatile String f4846g;
    @SafeParcelable.Field(getter = "getBtlePriority", mo11280id = 9)

    /* renamed from: h */
    private boolean f4847h;
    @SafeParcelable.Field(getter = "getNodeId", mo11280id = 10)

    /* renamed from: i */
    private String f4848i;

    @SafeParcelable.Constructor
    ConnectionConfiguration(@SafeParcelable.Param(mo11283id = 2) String str, @SafeParcelable.Param(mo11283id = 3) String str2, @SafeParcelable.Param(mo11283id = 4) int i, @SafeParcelable.Param(mo11283id = 5) int i2, @SafeParcelable.Param(mo11283id = 6) boolean z, @SafeParcelable.Param(mo11283id = 7) boolean z2, @SafeParcelable.Param(mo11283id = 8) String str3, @SafeParcelable.Param(mo11283id = 9) boolean z3, @SafeParcelable.Param(mo11283id = 10) String str4) {
        this.f4840a = str;
        this.f4841b = str2;
        this.f4842c = i;
        this.f4843d = i2;
        this.f4844e = z;
        this.f4845f = z2;
        this.f4846g = str3;
        this.f4847h = z3;
        this.f4848i = str4;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        return C1599s.m4388a(this.f4840a, connectionConfiguration.f4840a) && C1599s.m4388a(this.f4841b, connectionConfiguration.f4841b) && C1599s.m4388a(Integer.valueOf(this.f4842c), Integer.valueOf(connectionConfiguration.f4842c)) && C1599s.m4388a(Integer.valueOf(this.f4843d), Integer.valueOf(connectionConfiguration.f4843d)) && C1599s.m4388a(Boolean.valueOf(this.f4844e), Boolean.valueOf(connectionConfiguration.f4844e)) && C1599s.m4388a(Boolean.valueOf(this.f4847h), Boolean.valueOf(connectionConfiguration.f4847h));
    }

    public int hashCode() {
        return C1599s.m4389b(this.f4840a, this.f4841b, Integer.valueOf(this.f4842c), Integer.valueOf(this.f4843d), Boolean.valueOf(this.f4844e), Boolean.valueOf(this.f4847h));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConnectionConfiguration[ ");
        String valueOf = String.valueOf(this.f4840a);
        sb.append(valueOf.length() != 0 ? "mName=".concat(valueOf) : new String("mName="));
        String valueOf2 = String.valueOf(this.f4841b);
        sb.append(valueOf2.length() != 0 ? ", mAddress=".concat(valueOf2) : new String(", mAddress="));
        int i = this.f4842c;
        StringBuilder sb2 = new StringBuilder(19);
        sb2.append(", mType=");
        sb2.append(i);
        sb.append(sb2.toString());
        int i2 = this.f4843d;
        StringBuilder sb3 = new StringBuilder(19);
        sb3.append(", mRole=");
        sb3.append(i2);
        sb.append(sb3.toString());
        boolean z = this.f4844e;
        StringBuilder sb4 = new StringBuilder(16);
        sb4.append(", mEnabled=");
        sb4.append(z);
        sb.append(sb4.toString());
        boolean z2 = this.f4845f;
        StringBuilder sb5 = new StringBuilder(20);
        sb5.append(", mIsConnected=");
        sb5.append(z2);
        sb.append(sb5.toString());
        String valueOf3 = String.valueOf(this.f4846g);
        sb.append(valueOf3.length() != 0 ? ", mPeerNodeId=".concat(valueOf3) : new String(", mPeerNodeId="));
        boolean z3 = this.f4847h;
        StringBuilder sb6 = new StringBuilder(21);
        sb6.append(", mBtlePriority=");
        sb6.append(z3);
        sb.append(sb6.toString());
        String valueOf4 = String.valueOf(this.f4848i);
        sb.append(valueOf4.length() != 0 ? ", mNodeId=".concat(valueOf4) : new String(", mNodeId="));
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4452r(parcel, 2, this.f4840a, false);
        C1604b.m4452r(parcel, 3, this.f4841b, false);
        C1604b.m4446l(parcel, 4, this.f4842c);
        C1604b.m4446l(parcel, 5, this.f4843d);
        C1604b.m4437c(parcel, 6, this.f4844e);
        C1604b.m4437c(parcel, 7, this.f4845f);
        C1604b.m4452r(parcel, 8, this.f4846g, false);
        C1604b.m4437c(parcel, 9, this.f4847h);
        C1604b.m4452r(parcel, 10, this.f4848i, false);
        C1604b.m4436b(parcel, a);
    }
}

package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C0914h;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p113x.C3897a;

@ShowFirstParty
@SafeParcelable.Class(creator = "ConnectionConfigurationCreator")
@SafeParcelable.Reserved({1})
public class ConnectionConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<ConnectionConfiguration> CREATOR = new C1907d();
    @SafeParcelable.Field(getter = "getName", mo12312id = 2)
    @Nullable

    /* renamed from: a */
    private final String f2967a;
    @SafeParcelable.Field(getter = "getAddress", mo12312id = 3)
    @Nullable

    /* renamed from: b */
    private final String f2968b;
    @SafeParcelable.Field(getter = "getType", mo12312id = 4)

    /* renamed from: c */
    private final int f2969c;
    @SafeParcelable.Field(getter = "getRole", mo12312id = 5)

    /* renamed from: d */
    private final int f2970d;
    @SafeParcelable.Field(getter = "isEnabled", mo12312id = 6)

    /* renamed from: e */
    private final boolean f2971e;
    @SafeParcelable.Field(getter = "isConnected", mo12312id = 7)

    /* renamed from: f */
    private volatile boolean f2972f;
    @SafeParcelable.Field(getter = "getPeerNodeId", mo12312id = 8)
    @Nullable

    /* renamed from: g */
    private volatile String f2973g;
    @SafeParcelable.Field(getter = "getBtlePriority", mo12312id = 9)

    /* renamed from: h */
    private boolean f2974h;
    @SafeParcelable.Field(getter = "getNodeId", mo12312id = 10)
    @Nullable

    /* renamed from: i */
    private String f2975i;
    @SafeParcelable.Field(getter = "getPackageName", mo12312id = 11)
    @Nullable

    /* renamed from: j */
    private String f2976j;

    @SafeParcelable.Constructor
    ConnectionConfiguration(@SafeParcelable.Param(mo12315id = 2) @Nullable String str, @SafeParcelable.Param(mo12315id = 3) @Nullable String str2, @SafeParcelable.Param(mo12315id = 4) int i, @SafeParcelable.Param(mo12315id = 5) int i2, @SafeParcelable.Param(mo12315id = 6) boolean z, @SafeParcelable.Param(mo12315id = 7) boolean z2, @SafeParcelable.Param(mo12315id = 8) @Nullable String str3, @SafeParcelable.Param(mo12315id = 9) boolean z3, @SafeParcelable.Param(mo12315id = 10) @Nullable String str4, @SafeParcelable.Param(mo12315id = 11) @Nullable String str5) {
        this.f2967a = str;
        this.f2968b = str2;
        this.f2969c = i;
        this.f2970d = i2;
        this.f2971e = z;
        this.f2972f = z2;
        this.f2973g = str3;
        this.f2974h = z3;
        this.f2975i = str4;
        this.f2976j = str5;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        return C0914h.m1402a(this.f2967a, connectionConfiguration.f2967a) && C0914h.m1402a(this.f2968b, connectionConfiguration.f2968b) && C0914h.m1402a(Integer.valueOf(this.f2969c), Integer.valueOf(connectionConfiguration.f2969c)) && C0914h.m1402a(Integer.valueOf(this.f2970d), Integer.valueOf(connectionConfiguration.f2970d)) && C0914h.m1402a(Boolean.valueOf(this.f2971e), Boolean.valueOf(connectionConfiguration.f2971e)) && C0914h.m1402a(Boolean.valueOf(this.f2974h), Boolean.valueOf(connectionConfiguration.f2974h));
    }

    public final int hashCode() {
        return C0914h.m1403b(this.f2967a, this.f2968b, Integer.valueOf(this.f2969c), Integer.valueOf(this.f2970d), Boolean.valueOf(this.f2971e), Boolean.valueOf(this.f2974h));
    }

    @RecentlyNonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectionConfiguration[ ");
        String valueOf = String.valueOf(this.f2967a);
        sb.append(valueOf.length() != 0 ? "Name=".concat(valueOf) : new String("Name="));
        String valueOf2 = String.valueOf(this.f2968b);
        sb.append(valueOf2.length() != 0 ? ", Address=".concat(valueOf2) : new String(", Address="));
        int i = this.f2969c;
        StringBuilder sb2 = new StringBuilder(18);
        sb2.append(", Type=");
        sb2.append(i);
        sb.append(sb2.toString());
        int i2 = this.f2970d;
        StringBuilder sb3 = new StringBuilder(18);
        sb3.append(", Role=");
        sb3.append(i2);
        sb.append(sb3.toString());
        boolean z = this.f2971e;
        StringBuilder sb4 = new StringBuilder(15);
        sb4.append(", Enabled=");
        sb4.append(z);
        sb.append(sb4.toString());
        boolean z2 = this.f2972f;
        StringBuilder sb5 = new StringBuilder(19);
        sb5.append(", IsConnected=");
        sb5.append(z2);
        sb.append(sb5.toString());
        String valueOf3 = String.valueOf(this.f2973g);
        sb.append(valueOf3.length() != 0 ? ", PeerNodeId=".concat(valueOf3) : new String(", PeerNodeId="));
        boolean z3 = this.f2974h;
        StringBuilder sb6 = new StringBuilder(20);
        sb6.append(", BtlePriority=");
        sb6.append(z3);
        sb.append(sb6.toString());
        String valueOf4 = String.valueOf(this.f2975i);
        sb.append(valueOf4.length() != 0 ? ", NodeId=".concat(valueOf4) : new String(", NodeId="));
        String valueOf5 = String.valueOf(this.f2976j);
        sb.append(valueOf5.length() != 0 ? ", PackageName=".concat(valueOf5) : new String(", PackageName="));
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11122r(parcel, 2, this.f2967a, false);
        C3897a.m11122r(parcel, 3, this.f2968b, false);
        C3897a.m11116l(parcel, 4, this.f2969c);
        C3897a.m11116l(parcel, 5, this.f2970d);
        C3897a.m11107c(parcel, 6, this.f2971e);
        C3897a.m11107c(parcel, 7, this.f2972f);
        C3897a.m11122r(parcel, 8, this.f2973g, false);
        C3897a.m11107c(parcel, 9, this.f2974h);
        C3897a.m11122r(parcel, 10, this.f2975i, false);
        C3897a.m11122r(parcel, 11, this.f2976j, false);
        C3897a.m11106b(parcel, a);
    }
}

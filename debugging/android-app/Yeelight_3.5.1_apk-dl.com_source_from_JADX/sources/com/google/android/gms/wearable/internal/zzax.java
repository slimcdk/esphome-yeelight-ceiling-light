package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p069n0.C3357c;
import p076o0.C3433g;
import p113x.C3897a;

@SafeParcelable.Class(creator = "ChannelEventParcelableCreator")
@SafeParcelable.Reserved({1})
public final class zzax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzax> CREATOR = new C3433g();
    @SafeParcelable.Field(mo12312id = 2)

    /* renamed from: a */
    final zzbi f3005a;
    @SafeParcelable.Field(mo12312id = 3)

    /* renamed from: b */
    final int f3006b;
    @SafeParcelable.Field(mo12312id = 4)

    /* renamed from: c */
    final int f3007c;
    @SafeParcelable.Field(mo12312id = 5)

    /* renamed from: d */
    final int f3008d;

    @SafeParcelable.Constructor
    public zzax(@SafeParcelable.Param(mo12315id = 2) zzbi zzbi, @SafeParcelable.Param(mo12315id = 3) int i, @SafeParcelable.Param(mo12315id = 4) int i2, @SafeParcelable.Param(mo12315id = 5) int i3) {
        this.f3005a = zzbi;
        this.f3006b = i;
        this.f3007c = i2;
        this.f3008d = i3;
    }

    /* renamed from: V */
    public final void mo14857V(C3357c cVar) {
        int i = this.f3006b;
        if (i == 1) {
            cVar.mo24105a(this.f3005a);
        } else if (i == 2) {
            cVar.mo24106b(this.f3005a, this.f3007c, this.f3008d);
        } else if (i == 3) {
            cVar.mo24107c(this.f3005a, this.f3007c, this.f3008d);
        } else if (i != 4) {
            StringBuilder sb = new StringBuilder(25);
            sb.append("Unknown type: ");
            sb.append(i);
        } else {
            cVar.mo24108d(this.f3005a, this.f3007c, this.f3008d);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f3005a);
        int i = this.f3006b;
        String num = i != 1 ? i != 2 ? i != 3 ? i != 4 ? Integer.toString(i) : "OUTPUT_CLOSED" : "INPUT_CLOSED" : "CHANNEL_CLOSED" : "CHANNEL_OPENED";
        int i2 = this.f3007c;
        String num2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? Integer.toString(i2) : "CLOSE_REASON_LOCAL_CLOSE" : "CLOSE_REASON_REMOTE_CLOSE" : "CLOSE_REASON_DISCONNECTED" : "CLOSE_REASON_NORMAL";
        int i3 = this.f3008d;
        StringBuilder sb = new StringBuilder(valueOf.length() + 81 + String.valueOf(num).length() + String.valueOf(num2).length());
        sb.append("ChannelEventParcelable[, channel=");
        sb.append(valueOf);
        sb.append(", type=");
        sb.append(num);
        sb.append(", closeReason=");
        sb.append(num2);
        sb.append(", appErrorCode=");
        sb.append(i3);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11121q(parcel, 2, this.f3005a, i, false);
        C3897a.m11116l(parcel, 3, this.f3006b);
        C3897a.m11116l(parcel, 4, this.f3007c);
        C3897a.m11116l(parcel, 5, this.f3008d);
        C3897a.m11106b(parcel, a);
    }
}

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.C2420c;

@SafeParcelable.Class(creator = "ChannelEventParcelableCreator")
@SafeParcelable.Reserved({1})
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new C2451g();
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: a */
    private final zzay f4933a;
    @SafeParcelable.Field(mo11280id = 3)

    /* renamed from: b */
    private final int f4934b;
    @SafeParcelable.Field(mo11280id = 4)

    /* renamed from: c */
    private final int f4935c;
    @SafeParcelable.Field(mo11280id = 5)

    /* renamed from: d */
    private final int f4936d;

    @SafeParcelable.Constructor
    public zzaw(@SafeParcelable.Param(mo11283id = 2) zzay zzay, @SafeParcelable.Param(mo11283id = 3) int i, @SafeParcelable.Param(mo11283id = 4) int i2, @SafeParcelable.Param(mo11283id = 5) int i3) {
        this.f4933a = zzay;
        this.f4934b = i;
        this.f4935c = i2;
        this.f4936d = i3;
    }

    /* renamed from: Q */
    public final void mo13399Q(C2420c cVar) {
        int i = this.f4934b;
        if (i == 1) {
            cVar.mo13220a(this.f4933a);
        } else if (i == 2) {
            cVar.mo13221b(this.f4933a, this.f4935c, this.f4936d);
        } else if (i == 3) {
            cVar.mo13222c(this.f4933a, this.f4935c, this.f4936d);
        } else if (i != 4) {
            StringBuilder sb = new StringBuilder(25);
            sb.append("Unknown type: ");
            sb.append(i);
            sb.toString();
        } else {
            cVar.mo13223d(this.f4933a, this.f4935c, this.f4936d);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4933a);
        int i = this.f4934b;
        String num = i != 1 ? i != 2 ? i != 3 ? i != 4 ? Integer.toString(i) : "OUTPUT_CLOSED" : "INPUT_CLOSED" : "CHANNEL_CLOSED" : "CHANNEL_OPENED";
        int i2 = this.f4935c;
        String num2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? Integer.toString(i2) : "CLOSE_REASON_LOCAL_CLOSE" : "CLOSE_REASON_REMOTE_CLOSE" : "CLOSE_REASON_DISCONNECTED" : "CLOSE_REASON_NORMAL";
        int i3 = this.f4936d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81 + String.valueOf(num).length() + String.valueOf(num2).length());
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
        int a = C1604b.m4435a(parcel);
        C1604b.m4451q(parcel, 2, this.f4933a, i, false);
        C1604b.m4446l(parcel, 3, this.f4934b);
        C1604b.m4446l(parcel, 4, this.f4935c);
        C1604b.m4446l(parcel, 5, this.f4936d);
        C1604b.m4436b(parcel, a);
    }
}

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
import p069n0.C3373r;
import p113x.C3897a;

@ShowFirstParty
@SafeParcelable.Class(creator = "MessageOptionsCreator")
@SafeParcelable.Reserved({1})
public class MessageOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<MessageOptions> CREATOR = new C3373r();
    public static final int MESSAGE_PRIORITY_HIGH = 1;
    public static final int MESSAGE_PRIORITY_LOW = 0;
    @SafeParcelable.Field(getter = "getPriority", mo12312id = 2)

    /* renamed from: a */
    private final int f2977a;

    @SafeParcelable.Constructor
    public MessageOptions(@SafeParcelable.Param(mo12315id = 2) int i) {
        this.f2977a = i;
    }

    /* renamed from: V */
    public int mo14802V() {
        return this.f2977a;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof MessageOptions) && this.f2977a == ((MessageOptions) obj).f2977a;
    }

    public int hashCode() {
        return C0914h.m1403b(Integer.valueOf(this.f2977a));
    }

    @RecentlyNonNull
    public String toString() {
        return "MessageOptions[ " + "priority=" + this.f2977a + "]";
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 2, mo14802V());
        C3897a.m11106b(parcel, a);
    }
}

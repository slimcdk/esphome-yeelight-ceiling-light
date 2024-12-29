package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;

@SafeParcelable.Class(creator = "WakeLockEventCreator")
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new C1644e();
    @SafeParcelable.VersionField(mo11286id = 1)

    /* renamed from: a */
    private final int f3149a;
    @SafeParcelable.Field(getter = "getTimeMillis", mo11280id = 2)

    /* renamed from: b */
    private final long f3150b;
    @SafeParcelable.Field(getter = "getEventType", mo11280id = 11)

    /* renamed from: c */
    private int f3151c;
    @SafeParcelable.Field(getter = "getWakeLockName", mo11280id = 4)

    /* renamed from: d */
    private final String f3152d;
    @SafeParcelable.Field(getter = "getSecondaryWakeLockName", mo11280id = 10)

    /* renamed from: e */
    private final String f3153e;
    @SafeParcelable.Field(getter = "getCodePackage", mo11280id = 17)

    /* renamed from: f */
    private final String f3154f;
    @SafeParcelable.Field(getter = "getWakeLockType", mo11280id = 5)

    /* renamed from: g */
    private final int f3155g;
    @SafeParcelable.Field(getter = "getCallingPackages", mo11280id = 6)

    /* renamed from: h */
    private final List<String> f3156h;
    @SafeParcelable.Field(getter = "getEventKey", mo11280id = 12)

    /* renamed from: i */
    private final String f3157i;
    @SafeParcelable.Field(getter = "getElapsedRealtime", mo11280id = 8)

    /* renamed from: j */
    private final long f3158j;
    @SafeParcelable.Field(getter = "getDeviceState", mo11280id = 14)

    /* renamed from: k */
    private int f3159k;
    @SafeParcelable.Field(getter = "getHostPackage", mo11280id = 13)

    /* renamed from: l */
    private final String f3160l;
    @SafeParcelable.Field(getter = "getBeginPowerPercentage", mo11280id = 15)

    /* renamed from: m */
    private final float f3161m;
    @SafeParcelable.Field(getter = "getTimeout", mo11280id = 16)

    /* renamed from: n */
    private final long f3162n;
    @SafeParcelable.Field(getter = "getAcquiredWithTimeout", mo11280id = 18)

    /* renamed from: o */
    private final boolean f3163o;

    /* renamed from: p */
    private long f3164p;

    @SafeParcelable.Constructor
    WakeLockEvent(@SafeParcelable.Param(mo11283id = 1) int i, @SafeParcelable.Param(mo11283id = 2) long j, @SafeParcelable.Param(mo11283id = 11) int i2, @SafeParcelable.Param(mo11283id = 4) String str, @SafeParcelable.Param(mo11283id = 5) int i3, @SafeParcelable.Param(mo11283id = 6) List<String> list, @SafeParcelable.Param(mo11283id = 12) String str2, @SafeParcelable.Param(mo11283id = 8) long j2, @SafeParcelable.Param(mo11283id = 14) int i4, @SafeParcelable.Param(mo11283id = 10) String str3, @SafeParcelable.Param(mo11283id = 13) String str4, @SafeParcelable.Param(mo11283id = 15) float f, @SafeParcelable.Param(mo11283id = 16) long j3, @SafeParcelable.Param(mo11283id = 17) String str5, @SafeParcelable.Param(mo11283id = 18) boolean z) {
        this.f3149a = i;
        this.f3150b = j;
        this.f3151c = i2;
        this.f3152d = str;
        this.f3153e = str3;
        this.f3154f = str5;
        this.f3155g = i3;
        this.f3164p = -1;
        this.f3156h = list;
        this.f3157i = str2;
        this.f3158j = j2;
        this.f3159k = i4;
        this.f3160l = str4;
        this.f3161m = f;
        this.f3162n = j3;
        this.f3163o = z;
    }

    public WakeLockEvent(long j, int i, String str, int i2, List<String> list, String str2, long j2, int i3, String str3, String str4, float f, long j3, String str5, boolean z) {
        this(2, j, i, str, i2, list, str2, j2, i3, str3, str4, f, j3, str5, z);
    }

    /* renamed from: Q */
    public final int mo11364Q() {
        return this.f3151c;
    }

    /* renamed from: R */
    public final long mo11365R() {
        return this.f3150b;
    }

    /* renamed from: S */
    public final long mo11366S() {
        return this.f3164p;
    }

    /* renamed from: T */
    public final String mo11367T() {
        String str = this.f3152d;
        int i = this.f3155g;
        List<String> list = this.f3156h;
        String str2 = "";
        String join = list == null ? str2 : TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, list);
        int i2 = this.f3159k;
        String str3 = this.f3153e;
        if (str3 == null) {
            str3 = str2;
        }
        String str4 = this.f3160l;
        if (str4 == null) {
            str4 = str2;
        }
        float f = this.f3161m;
        String str5 = this.f3154f;
        if (str5 != null) {
            str2 = str5;
        }
        boolean z = this.f3163o;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(join).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str2).length());
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i);
        sb.append("\t");
        sb.append(join);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(str3);
        sb.append("\t");
        sb.append(str4);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 1, this.f3149a);
        C1604b.m4448n(parcel, 2, mo11365R());
        C1604b.m4452r(parcel, 4, this.f3152d, false);
        C1604b.m4446l(parcel, 5, this.f3155g);
        C1604b.m4454t(parcel, 6, this.f3156h, false);
        C1604b.m4448n(parcel, 8, this.f3158j);
        C1604b.m4452r(parcel, 10, this.f3153e, false);
        C1604b.m4446l(parcel, 11, mo11364Q());
        C1604b.m4452r(parcel, 12, this.f3157i, false);
        C1604b.m4452r(parcel, 13, this.f3160l, false);
        C1604b.m4446l(parcel, 14, this.f3159k);
        C1604b.m4443i(parcel, 15, this.f3161m);
        C1604b.m4448n(parcel, 16, this.f3162n);
        C1604b.m4452r(parcel, 17, this.f3154f, false);
        C1604b.m4437c(parcel, 18, this.f3163o);
        C1604b.m4436b(parcel, a);
    }
}

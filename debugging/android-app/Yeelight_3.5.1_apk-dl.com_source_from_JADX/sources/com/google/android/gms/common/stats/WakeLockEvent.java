package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;
import javax.annotation.Nullable;
import p113x.C3897a;

@KeepForSdk
@SafeParcelable.Class(creator = "WakeLockEventCreator")
@Deprecated
public final class WakeLockEvent extends StatsEvent {
    @NonNull
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new C0957b();
    @SafeParcelable.VersionField(mo12321id = 1)

    /* renamed from: a */
    final int f1154a;
    @SafeParcelable.Field(getter = "getTimeMillis", mo12312id = 2)

    /* renamed from: b */
    private final long f1155b;
    @SafeParcelable.Field(getter = "getEventType", mo12312id = 11)

    /* renamed from: c */
    private int f1156c;
    @SafeParcelable.Field(getter = "getWakeLockName", mo12312id = 4)

    /* renamed from: d */
    private final String f1157d;
    @SafeParcelable.Field(getter = "getSecondaryWakeLockName", mo12312id = 10)

    /* renamed from: e */
    private final String f1158e;
    @SafeParcelable.Field(getter = "getCodePackage", mo12312id = 17)

    /* renamed from: f */
    private final String f1159f;
    @SafeParcelable.Field(getter = "getWakeLockType", mo12312id = 5)

    /* renamed from: g */
    private final int f1160g;
    @SafeParcelable.Field(getter = "getCallingPackages", mo12312id = 6)
    @Nullable

    /* renamed from: h */
    private final List f1161h;
    @SafeParcelable.Field(getter = "getEventKey", mo12312id = 12)

    /* renamed from: i */
    private final String f1162i;
    @SafeParcelable.Field(getter = "getElapsedRealtime", mo12312id = 8)

    /* renamed from: j */
    private final long f1163j;
    @SafeParcelable.Field(getter = "getDeviceState", mo12312id = 14)

    /* renamed from: k */
    private int f1164k;
    @SafeParcelable.Field(getter = "getHostPackage", mo12312id = 13)

    /* renamed from: l */
    private final String f1165l;
    @SafeParcelable.Field(getter = "getBeginPowerPercentage", mo12312id = 15)

    /* renamed from: m */
    private final float f1166m;
    @SafeParcelable.Field(getter = "getTimeout", mo12312id = 16)

    /* renamed from: n */
    private final long f1167n;
    @SafeParcelable.Field(getter = "getAcquiredWithTimeout", mo12312id = 18)

    /* renamed from: o */
    private final boolean f1168o;

    /* renamed from: p */
    private long f1169p = -1;

    @SafeParcelable.Constructor
    WakeLockEvent(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) long j, @SafeParcelable.Param(mo12315id = 11) int i2, @SafeParcelable.Param(mo12315id = 4) String str, @SafeParcelable.Param(mo12315id = 5) int i3, @SafeParcelable.Param(mo12315id = 6) @Nullable List list, @SafeParcelable.Param(mo12315id = 12) String str2, @SafeParcelable.Param(mo12315id = 8) long j2, @SafeParcelable.Param(mo12315id = 14) int i4, @SafeParcelable.Param(mo12315id = 10) String str3, @SafeParcelable.Param(mo12315id = 13) String str4, @SafeParcelable.Param(mo12315id = 15) float f, @SafeParcelable.Param(mo12315id = 16) long j3, @SafeParcelable.Param(mo12315id = 17) String str5, @SafeParcelable.Param(mo12315id = 18) boolean z) {
        this.f1154a = i;
        this.f1155b = j;
        this.f1156c = i2;
        this.f1157d = str;
        this.f1158e = str3;
        this.f1159f = str5;
        this.f1160g = i3;
        this.f1161h = list;
        this.f1162i = str2;
        this.f1163j = j2;
        this.f1164k = i4;
        this.f1165l = str4;
        this.f1166m = f;
        this.f1167n = j3;
        this.f1168o = z;
    }

    /* renamed from: V */
    public final int mo12417V() {
        return this.f1156c;
    }

    /* renamed from: W */
    public final long mo12418W() {
        return this.f1169p;
    }

    /* renamed from: c0 */
    public final long mo12419c0() {
        return this.f1155b;
    }

    @NonNull
    /* renamed from: d0 */
    public final String mo12420d0() {
        List list = this.f1161h;
        String str = this.f1157d;
        int i = this.f1160g;
        String str2 = "";
        String join = list == null ? str2 : TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, list);
        int i2 = this.f1164k;
        String str3 = this.f1158e;
        if (str3 == null) {
            str3 = str2;
        }
        String str4 = this.f1165l;
        if (str4 == null) {
            str4 = str2;
        }
        float f = this.f1166m;
        String str5 = this.f1159f;
        if (str5 != null) {
            str2 = str5;
        }
        boolean z = this.f1168o;
        return "\t" + str + "\t" + i + "\t" + join + "\t" + i2 + "\t" + str3 + "\t" + str4 + "\t" + f + "\t" + str2 + "\t" + z;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, this.f1154a);
        C3897a.m11118n(parcel, 2, this.f1155b);
        C3897a.m11122r(parcel, 4, this.f1157d, false);
        C3897a.m11116l(parcel, 5, this.f1160g);
        C3897a.m11124t(parcel, 6, this.f1161h, false);
        C3897a.m11118n(parcel, 8, this.f1163j);
        C3897a.m11122r(parcel, 10, this.f1158e, false);
        C3897a.m11116l(parcel, 11, this.f1156c);
        C3897a.m11122r(parcel, 12, this.f1162i, false);
        C3897a.m11122r(parcel, 13, this.f1165l, false);
        C3897a.m11116l(parcel, 14, this.f1164k);
        C3897a.m11113i(parcel, 15, this.f1166m);
        C3897a.m11118n(parcel, 16, this.f1167n);
        C3897a.m11122r(parcel, 17, this.f1159f, false);
        C3897a.m11107c(parcel, 18, this.f1168o);
        C3897a.m11106b(parcel, a);
    }
}

package com.google.android.gms.internal.wearable;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.wearable.v0 */
public final class C1520v0 {
    static {
        C1520v0.class.getClassLoader();
    }

    private C1520v0() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m3844a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m3845b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.IInterface, android.os.IBinder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m3846c(android.os.Parcel r0, android.os.IInterface r1) {
        /*
            r0.writeStrongBinder(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.C1520v0.m3846c(android.os.Parcel, android.os.IInterface):void");
    }
}

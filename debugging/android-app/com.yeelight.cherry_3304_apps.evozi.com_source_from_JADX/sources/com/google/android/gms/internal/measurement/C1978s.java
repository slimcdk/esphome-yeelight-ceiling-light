package com.google.android.gms.internal.measurement;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.s */
public class C1978s {

    /* renamed from: a */
    private static final ClassLoader f3707a = C1978s.class.getClassLoader();

    private C1978s() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m5920a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m5921b(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: c */
    public static void m5922c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: d */
    public static void m5923d(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: e */
    public static boolean m5924e(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: f */
    public static HashMap m5925f(Parcel parcel) {
        return parcel.readHashMap(f3707a);
    }
}

package com.google.android.gms.internal.measurement;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.p0 */
public final class C1246p0 {

    /* renamed from: a */
    private static final ClassLoader f1491a = C1246p0.class.getClassLoader();

    private C1246p0() {
    }

    /* renamed from: a */
    public static Parcelable m2428a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static HashMap m2429b(Parcel parcel) {
        return parcel.readHashMap(f1491a);
    }

    /* renamed from: c */
    public static void m2430c(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException("Parcel data not fully consumed, unread size: " + dataAvail);
        }
    }

    /* renamed from: d */
    public static void m2431d(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: e */
    public static void m2432e(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: f */
    public static void m2433f(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: g */
    public static boolean m2434g(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}

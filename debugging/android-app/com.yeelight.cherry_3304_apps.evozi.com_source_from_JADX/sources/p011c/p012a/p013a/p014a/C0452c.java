package p011c.p012a.p013a.p014a;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.a.a.a.c */
public class C0452c {
    static {
        C0452c.class.getClassLoader();
    }

    private C0452c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m26a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m27b(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: c */
    public static void m28c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}

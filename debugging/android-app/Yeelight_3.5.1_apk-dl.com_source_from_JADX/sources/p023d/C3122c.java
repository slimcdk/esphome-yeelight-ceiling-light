package p023d;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d.c */
public class C3122c {
    static {
        C3122c.class.getClassLoader();
    }

    private C3122c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m8310a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m8311b(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: c */
    public static void m8312c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}

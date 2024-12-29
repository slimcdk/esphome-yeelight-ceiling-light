package p011c.p012a.p019b.p028b.p032c.p036d;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.a.b.b.c.d.c */
public class C0583c {
    static {
        C0583c.class.getClassLoader();
    }

    private C0583c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m358a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m359b(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: c */
    public static void m360c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}

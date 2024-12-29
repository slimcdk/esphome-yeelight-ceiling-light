package p011c.p012a.p019b.p028b.p032c.p034b;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.a.b.b.c.b.c */
public class C0573c {
    static {
        C0573c.class.getClassLoader();
    }

    private C0573c() {
    }

    /* renamed from: a */
    public static void m346a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: b */
    public static <T extends Parcelable> T m347b(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: c */
    public static void m348c(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }

    /* renamed from: d */
    public static void m349d(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: e */
    public static boolean m350e(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}

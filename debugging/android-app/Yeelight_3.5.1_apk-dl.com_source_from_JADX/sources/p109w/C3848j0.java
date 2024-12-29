package p109w;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.C0988a;
import p032f0.C3155a;

/* renamed from: w.j0 */
public final class C3848j0 extends C0988a implements C3852l0 {
    C3848j0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: E */
    public final int mo12360E() {
        Parcel c = mo12458c(2, mo12459e());
        int readInt = c.readInt();
        c.recycle();
        return readInt;
    }

    /* renamed from: b */
    public final C3155a mo12362b() {
        Parcel c = mo12458c(1, mo12459e());
        C3155a e = C3155a.C3156a.m8426e(c.readStrongBinder());
        c.recycle();
        return e;
    }
}

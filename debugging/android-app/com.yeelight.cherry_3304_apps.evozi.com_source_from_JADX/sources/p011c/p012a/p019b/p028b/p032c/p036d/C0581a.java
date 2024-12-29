package p011c.p012a.p019b.p028b.p032c.p036d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: c.a.b.b.c.d.a */
public class C0581a implements IInterface {

    /* renamed from: a */
    private final IBinder f233a;

    /* renamed from: b */
    private final String f234b;

    protected C0581a(IBinder iBinder, String str) {
        this.f233a = iBinder;
        this.f234b = str;
    }

    public IBinder asBinder() {
        return this.f233a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Parcel mo8555c() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f234b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo8556e(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f233a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo8557f(int i, Parcel parcel) {
        try {
            this.f233a.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}

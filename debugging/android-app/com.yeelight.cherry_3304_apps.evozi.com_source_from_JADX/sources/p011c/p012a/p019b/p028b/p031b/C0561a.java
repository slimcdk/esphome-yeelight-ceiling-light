package p011c.p012a.p019b.p028b.p031b;

import android.os.IBinder;
import android.os.IInterface;
import p011c.p012a.p019b.p028b.p032c.p034b.C0571a;
import p011c.p012a.p019b.p028b.p032c.p034b.C0572b;

/* renamed from: c.a.b.b.b.a */
public interface C0561a extends IInterface {

    /* renamed from: c.a.b.b.b.a$a */
    public static abstract class C0562a extends C0572b implements C0561a {

        /* renamed from: c.a.b.b.b.a$a$a */
        public static class C0563a extends C0571a implements C0561a {
            C0563a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public C0562a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: c */
        public static C0561a m333c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof C0561a ? (C0561a) queryLocalInterface : new C0563a(iBinder);
        }
    }
}

package p027e;

import android.os.IBinder;
import android.os.IInterface;
import p023d.C3120a;

/* renamed from: e.a */
public abstract class C3137a extends C3120a implements C3138b {
    /* renamed from: e */
    public static C3138b m8387e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.install.protocol.IInstallService");
        return queryLocalInterface instanceof C3138b ? (C3138b) queryLocalInterface : new C3140d(iBinder);
    }
}

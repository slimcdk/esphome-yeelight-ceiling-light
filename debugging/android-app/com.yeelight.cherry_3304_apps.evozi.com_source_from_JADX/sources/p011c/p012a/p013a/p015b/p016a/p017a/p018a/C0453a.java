package p011c.p012a.p013a.p015b.p016a.p017a.p018a;

import android.os.IBinder;
import android.os.IInterface;
import p011c.p012a.p013a.p014a.C0450a;

/* renamed from: c.a.a.b.a.a.a.a */
public abstract class C0453a extends C0450a implements C0454b {
    /* renamed from: c */
    public static C0454b m29c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.install.protocol.IInstallService");
        return queryLocalInterface instanceof C0454b ? (C0454b) queryLocalInterface : new C0456d(iBinder);
    }
}

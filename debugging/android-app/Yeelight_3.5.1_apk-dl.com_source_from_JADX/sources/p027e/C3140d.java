package p027e;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;
import p023d.C3121b;
import p023d.C3122c;

/* renamed from: e.d */
public final class C3140d extends C3121b implements C3138b {
    C3140d(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.install.protocol.IInstallService");
    }

    /* renamed from: C0 */
    public final void mo23624C0(String str, List<Bundle> list, Bundle bundle, C3139c cVar) {
        Parcel c = mo23589c();
        c.writeString(str);
        c.writeTypedList(list);
        C3122c.m8312c(c, bundle);
        C3122c.m8311b(c, cVar);
        mo23591f(1, c);
    }

    /* renamed from: x0 */
    public final void mo23625x0(String str, Bundle bundle, C3139c cVar) {
        Parcel c = mo23589c();
        c.writeString(str);
        C3122c.m8312c(c, bundle);
        C3122c.m8311b(c, cVar);
        mo23591f(2, c);
    }
}

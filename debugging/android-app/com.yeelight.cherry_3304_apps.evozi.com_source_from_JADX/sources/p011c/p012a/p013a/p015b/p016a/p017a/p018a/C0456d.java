package p011c.p012a.p013a.p015b.p016a.p017a.p018a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;
import p011c.p012a.p013a.p014a.C0451b;
import p011c.p012a.p013a.p014a.C0452c;

/* renamed from: c.a.a.b.a.a.a.d */
public final class C0456d extends C0451b implements C0454b {
    C0456d(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.install.protocol.IInstallService");
    }

    /* renamed from: m */
    public final void mo8386m(String str, Bundle bundle, C0455c cVar) {
        Parcel c = mo8383c();
        c.writeString(str);
        C0452c.m28c(c, bundle);
        C0452c.m27b(c, cVar);
        mo8385f(2, c);
    }

    /* renamed from: o0 */
    public final void mo8387o0(String str, List<Bundle> list, Bundle bundle, C0455c cVar) {
        Parcel c = mo8383c();
        c.writeString(str);
        c.writeTypedList(list);
        C0452c.m28c(c, bundle);
        C0452c.m27b(c, cVar);
        mo8385f(1, c);
    }
}

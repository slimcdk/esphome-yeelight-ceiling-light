package p011c.p012a.p013a.p015b.p016a.p017a.p018a;

import android.os.Bundle;
import android.os.Parcel;
import p011c.p012a.p013a.p014a.C0450a;
import p011c.p012a.p013a.p014a.C0452c;

/* renamed from: c.a.a.b.a.a.a.e */
public abstract class C0457e extends C0450a implements C0455c {
    public C0457e() {
        super("com.google.android.play.core.install.protocol.IInstallServiceCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo8379a(int i, Parcel parcel) {
        if (i == 1) {
            mo8390q((Bundle) C0452c.m26a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            mo8389b0((Bundle) C0452c.m26a(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            Bundle bundle = (Bundle) C0452c.m26a(parcel, Bundle.CREATOR);
            mo8388a();
        }
        return true;
    }
}

package p027e;

import android.os.Bundle;
import android.os.Parcel;
import p023d.C3120a;
import p023d.C3122c;

/* renamed from: e.e */
public abstract class C3141e extends C3120a implements C3139c {
    public C3141e() {
        super("com.google.android.play.core.install.protocol.IInstallServiceCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo23586c(int i, Parcel parcel) {
        if (i == 1) {
            mo16651m((Bundle) C3122c.m8310a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            mo16649R((Bundle) C3122c.m8310a(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            Bundle bundle = (Bundle) C3122c.m8310a(parcel, Bundle.CREATOR);
            mo16650a();
        }
        return true;
    }
}

package com.google.android.gms.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.C1691b;
import com.google.android.gms.internal.base.C1692c;

/* renamed from: com.google.android.gms.signin.internal.e */
public abstract class C2405e extends C1691b implements C2404d {
    public C2405e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: O0 */
    public boolean mo11403O0(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 3) {
            mo13169x0((ConnectionResult) C1692c.m4685b(parcel, ConnectionResult.CREATOR), (zaa) C1692c.m4685b(parcel, zaa.CREATOR));
        } else if (i == 4) {
            mo13166g0((Status) C1692c.m4685b(parcel, Status.CREATOR));
        } else if (i == 6) {
            mo13168l0((Status) C1692c.m4685b(parcel, Status.CREATOR));
        } else if (i == 7) {
            mo13167i((Status) C1692c.m4685b(parcel, Status.CREATOR), (GoogleSignInAccount) C1692c.m4685b(parcel, GoogleSignInAccount.CREATOR));
        } else if (i != 8) {
            return false;
        } else {
            mo10940r((zaj) C1692c.m4685b(parcel, zaj.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}

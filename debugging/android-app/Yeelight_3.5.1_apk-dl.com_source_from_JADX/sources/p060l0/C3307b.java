package p060l0;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.zaa;
import com.google.android.gms.signin.internal.zag;
import com.google.android.gms.signin.internal.zak;
import p040h0.C3231b;
import p040h0.C3232c;

/* renamed from: l0.b */
public abstract class C3307b extends C3231b implements C3308c {
    public C3307b() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public final boolean mo23788D0(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 3:
                ConnectionResult connectionResult = (ConnectionResult) C3232c.m8685a(parcel, ConnectionResult.CREATOR);
                zaa zaa = (zaa) C3232c.m8685a(parcel, zaa.CREATOR);
                break;
            case 4:
            case 6:
                Status status = (Status) C3232c.m8685a(parcel, Status.CREATOR);
                break;
            case 7:
                Status status2 = (Status) C3232c.m8685a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) C3232c.m8685a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                C3232c.m8686b(parcel);
                mo12005v((zak) C3232c.m8685a(parcel, zak.CREATOR));
                break;
            case 9:
                zag zag = (zag) C3232c.m8685a(parcel, zag.CREATOR);
                break;
            default:
                return false;
        }
        C3232c.m8686b(parcel);
        parcel2.writeNoException();
        return true;
    }
}

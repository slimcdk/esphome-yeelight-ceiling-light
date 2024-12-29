package p120z;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;

/* renamed from: z.b */
public final class C3920b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int J = SafeParcelReader.m1462J(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            if (SafeParcelReader.m1485u(C) != 1) {
                SafeParcelReader.m1461I(parcel, C);
            } else {
                pendingIntent = (PendingIntent) SafeParcelReader.m1478n(parcel, C, PendingIntent.CREATOR);
            }
        }
        SafeParcelReader.m1484t(parcel, J);
        return new ModuleInstallIntentResponse(pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ModuleInstallIntentResponse[i];
    }
}

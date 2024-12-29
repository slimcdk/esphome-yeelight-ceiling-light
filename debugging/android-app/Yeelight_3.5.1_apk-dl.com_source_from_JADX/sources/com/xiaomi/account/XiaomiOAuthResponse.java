package com.xiaomi.account;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.account.IXiaomiAuthResponse;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;

public class XiaomiOAuthResponse implements Parcelable {
    public static final Parcelable.Creator<XiaomiOAuthResponse> CREATOR = new Parcelable.Creator<XiaomiOAuthResponse>() {
        public XiaomiOAuthResponse createFromParcel(Parcel parcel) {
            return new XiaomiOAuthResponse(parcel);
        }

        public XiaomiOAuthResponse[] newArray(int i) {
            return new XiaomiOAuthResponse[i];
        }
    };
    private static final String TAG = XiaomiOAuthResponse.class.getName();
    private IXiaomiAuthResponse mResponse;

    public XiaomiOAuthResponse(Parcel parcel) {
        this.mResponse = IXiaomiAuthResponse.Stub.asInterface(parcel.readStrongBinder());
    }

    public XiaomiOAuthResponse(IXiaomiAuthResponse iXiaomiAuthResponse) {
        this.mResponse = iXiaomiAuthResponse;
    }

    public static void setIXiaomiAuthResponseCancel(IXiaomiAuthResponse iXiaomiAuthResponse) {
        if (iXiaomiAuthResponse != null) {
            try {
                iXiaomiAuthResponse.onCancel();
            } catch (RemoteException | RuntimeException unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:8:? A[ExcHandler: RemoteException (unused android.os.RemoteException), SYNTHETIC, Splitter:B:6:0x001e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setIXiaomiAuthResponseResult(com.xiaomi.account.IXiaomiAuthResponse r3, android.os.Bundle r4) {
        /*
            if (r3 == 0) goto L_0x0021
            if (r4 != 0) goto L_0x0005
            goto L_0x0021
        L_0x0005:
            r3.onResult(r4)     // Catch:{ RuntimeException -> 0x0009 }
            goto L_0x0021
        L_0x0009:
            r4 = move-exception
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1 = -1
            java.lang.String r2 = "extra_error_code"
            r0.putInt(r2, r1)
            java.lang.String r4 = r4.getMessage()
            java.lang.String r1 = "extra_error_description"
            r0.putString(r1, r4)
            r3.onResult(r0)     // Catch:{ RemoteException -> 0x0021, RemoteException -> 0x0021 }
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.account.XiaomiOAuthResponse.setIXiaomiAuthResponseResult(com.xiaomi.account.IXiaomiAuthResponse, android.os.Bundle):void");
    }

    public int describeContents() {
        return 0;
    }

    public void onCancel() {
        setIXiaomiAuthResponseCancel(this.mResponse);
    }

    public void onError(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(XiaomiOAuthConstants.EXTRA_ERROR_CODE, i);
        bundle.putString(XiaomiOAuthConstants.EXTRA_ERROR_DESCRIPTION, str);
        setIXiaomiAuthResponseResult(this.mResponse, bundle);
    }

    public void onResult(Bundle bundle) {
        setIXiaomiAuthResponseResult(this.mResponse, bundle);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.mResponse.asBinder());
    }
}

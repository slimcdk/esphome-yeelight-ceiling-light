package org.fourthline.cling.android;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.logging.Logger;
import org.fourthline.cling.model.C10018f;

/* renamed from: org.fourthline.cling.android.e */
public class C10009e {

    /* renamed from: a */
    private static final Logger f18475a = Logger.getLogger(C10009e.class.getName());

    /* renamed from: a */
    public static NetworkInfo m24771a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) {
            return activeNetworkInfo;
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo != null && networkInfo.isAvailable() && networkInfo.isConnected()) {
            return networkInfo;
        }
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
        if (networkInfo2 != null && networkInfo2.isAvailable() && networkInfo2.isConnected()) {
            return networkInfo2;
        }
        NetworkInfo networkInfo3 = connectivityManager.getNetworkInfo(6);
        if (networkInfo3 != null && networkInfo3.isAvailable() && networkInfo3.isConnected()) {
            return networkInfo3;
        }
        NetworkInfo networkInfo4 = connectivityManager.getNetworkInfo(9);
        if (networkInfo4 != null && networkInfo4.isAvailable() && networkInfo4.isConnected()) {
            return networkInfo4;
        }
        f18475a.info("Could not find any connected network...");
        return null;
    }

    /* renamed from: b */
    public static boolean m24772b(NetworkInfo networkInfo, int i) {
        return networkInfo != null && networkInfo.getType() == i;
    }

    /* renamed from: c */
    public static boolean m24773c(NetworkInfo networkInfo) {
        return m24772b(networkInfo, 1) || C10018f.f18493b;
    }
}

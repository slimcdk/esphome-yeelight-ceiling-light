package com.miot.api;

import android.os.RemoteException;
import com.miot.common.exception.MiotException;

public class LogHelper {
    private static final String TAG = "LogHelper";
    private static ILogHelperInterface mILogHelperInterface;

    public static void enableLog(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("LogHelper enableLog: ");
        sb.append(z);
        ILogHelperInterface iLogHelperInterface = mILogHelperInterface;
        if (iLogHelperInterface != null) {
            try {
                iLogHelperInterface.enableLog(z);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        } else {
            throw new MiotException("service not bound");
        }
    }

    public static void log(String str, String str2) {
        if (mILogHelperInterface == null) {
            try {
                throw new MiotException("service not bound");
            } catch (MiotException e) {
                e.printStackTrace();
            }
        }
        try {
            mILogHelperInterface.log(str, str2);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    public static void setBinderInterface(ILogHelperInterface iLogHelperInterface) {
        mILogHelperInterface = iLogHelperInterface;
    }
}

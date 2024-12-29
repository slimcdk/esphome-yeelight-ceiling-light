package com.miot.service.log;

import com.miot.api.ILogHelperInterface;
import com.xiaomi.mipush.sdk.Constants;

public class LogHelperImp extends ILogHelperInterface.Stub {
    public void enableLog(boolean z) {
        MyLogger.getInstance().enableLog(z);
    }

    public void log(String str, String str2) {
        MyLogger instance = MyLogger.getInstance();
        instance.log(str + Constants.COLON_SEPARATOR + str2);
    }
}

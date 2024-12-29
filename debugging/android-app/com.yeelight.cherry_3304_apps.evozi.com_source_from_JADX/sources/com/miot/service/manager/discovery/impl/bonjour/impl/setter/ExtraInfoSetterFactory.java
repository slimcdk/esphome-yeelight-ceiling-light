package com.miot.service.manager.discovery.impl.bonjour.impl.setter;

import android.os.Build;
import com.miot.service.manager.discovery.impl.bonjour.impl.setter.impl.ExtraInfoSetterOnKitKat;
import com.miot.service.manager.discovery.impl.bonjour.impl.setter.impl.ExtraInfoSetterOnL;

public class ExtraInfoSetterFactory {
    private static final String TAG = "ExtraInfoSetterFactory";

    public static ExtraInfoSetter create() {
        "Build.VERSION.SDK_INT: " + Build.VERSION.SDK_INT;
        int i = Build.VERSION.SDK_INT;
        if (i == 19 || i == 20) {
            return new ExtraInfoSetterOnKitKat();
        }
        if (i >= 21) {
            return new ExtraInfoSetterOnL();
        }
        return null;
    }
}

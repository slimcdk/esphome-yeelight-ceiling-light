package com.miot.service.manager.discovery.impl.bonjour.impl.getter;

import android.os.Build;
import com.miot.service.manager.discovery.impl.bonjour.impl.getter.impl.ExtraInfoGetterOnKitKat;
import com.miot.service.manager.discovery.impl.bonjour.impl.getter.impl.ExtraInfoGetterOnL;

public class ExtraInfoGetterFactory {
    private static final String TAG = "ExtraInfoGetterFactory";

    public static ExtraInfoGetter create() {
        "Build.VERSION.SDK_INT: " + Build.VERSION.SDK_INT;
        int i = Build.VERSION.SDK_INT;
        if (i == 19 || i == 20) {
            return new ExtraInfoGetterOnKitKat();
        }
        if (i >= 21) {
            return new ExtraInfoGetterOnL();
        }
        return null;
    }
}

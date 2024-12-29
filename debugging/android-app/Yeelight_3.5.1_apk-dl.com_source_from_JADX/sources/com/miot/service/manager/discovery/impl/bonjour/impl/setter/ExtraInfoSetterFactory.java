package com.miot.service.manager.discovery.impl.bonjour.impl.setter;

import android.os.Build;
import com.miot.service.manager.discovery.impl.bonjour.impl.setter.impl.ExtraInfoSetterOnKitKat;
import com.miot.service.manager.discovery.impl.bonjour.impl.setter.impl.ExtraInfoSetterOnL;

public class ExtraInfoSetterFactory {
    private static final String TAG = "ExtraInfoSetterFactory";

    public static ExtraInfoSetter create() {
        StringBuilder sb = new StringBuilder();
        sb.append("Build.VERSION.SDK_INT: ");
        int i = Build.VERSION.SDK_INT;
        sb.append(i);
        if (i == 19 || i == 20) {
            return new ExtraInfoSetterOnKitKat();
        }
        if (i >= 21) {
            return new ExtraInfoSetterOnL();
        }
        return null;
    }
}

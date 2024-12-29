package com.miot.service.manager.discovery.impl.bonjour;

import android.content.Context;
import android.os.Build;
import com.miot.service.manager.discovery.impl.bonjour.impl.AndroidBonjourImpl;
import com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl;

public class BonjourFactory {
    public static Bonjour create(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            AndroidBonjourImpl.getInstance(context);
        } else {
            JavaBonjourImpl.getInstance(context);
        }
        return JavaBonjourImpl.getInstance(context);
    }
}

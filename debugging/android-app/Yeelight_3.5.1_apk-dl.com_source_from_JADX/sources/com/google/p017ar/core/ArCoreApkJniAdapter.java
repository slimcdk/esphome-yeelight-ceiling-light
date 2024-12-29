package com.google.p017ar.core;

import android.app.Activity;
import android.content.Context;
import com.google.p017ar.core.ArCoreApk;
import com.google.p017ar.core.Session;
import com.google.p017ar.core.annotations.UsedByNative;
import com.google.p017ar.core.exceptions.ResourceExhaustedException;
import com.google.p017ar.core.exceptions.UnavailableApkTooOldException;
import com.google.p017ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.p017ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.p017ar.core.exceptions.UnavailableSdkTooOldException;
import com.google.p017ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import java.util.HashMap;
import java.util.Map;

@UsedByNative("arcoreapk.cc")
/* renamed from: com.google.ar.core.ArCoreApkJniAdapter */
class ArCoreApkJniAdapter {

    /* renamed from: a */
    private static final Map<Class<? extends Throwable>, Integer> f3106a;

    static {
        HashMap hashMap = new HashMap();
        f3106a = hashMap;
        hashMap.put(IllegalArgumentException.class, Integer.valueOf(Session.C2008a.ERROR_INVALID_ARGUMENT.f3145j));
        hashMap.put(ResourceExhaustedException.class, Integer.valueOf(Session.C2008a.ERROR_RESOURCE_EXHAUSTED.f3145j));
        hashMap.put(UnavailableArcoreNotInstalledException.class, Integer.valueOf(Session.C2008a.UNAVAILABLE_ARCORE_NOT_INSTALLED.f3145j));
        hashMap.put(UnavailableDeviceNotCompatibleException.class, Integer.valueOf(Session.C2008a.UNAVAILABLE_DEVICE_NOT_COMPATIBLE.f3145j));
        hashMap.put(UnavailableApkTooOldException.class, Integer.valueOf(Session.C2008a.UNAVAILABLE_APK_TOO_OLD.f3145j));
        hashMap.put(UnavailableSdkTooOldException.class, Integer.valueOf(Session.C2008a.UNAVAILABLE_SDK_TOO_OLD.f3145j));
        hashMap.put(UnavailableUserDeclinedInstallationException.class, Integer.valueOf(Session.C2008a.UNAVAILABLE_USER_DECLINED_INSTALLATION.f3145j));
    }

    ArCoreApkJniAdapter() {
    }

    /* renamed from: a */
    private static int m5090a(Throwable th) {
        Class<?> cls = th.getClass();
        Map<Class<? extends Throwable>, Integer> map = f3106a;
        return map.containsKey(cls) ? map.get(cls).intValue() : Session.C2008a.ERROR_FATAL.f3145j;
    }

    @UsedByNative("arcoreapk.cc")
    static int checkAvailability(Context context) {
        try {
            return ArCoreApk.getInstance().checkAvailability(context).nativeCode;
        } catch (Throwable th) {
            m5090a(th);
            return ArCoreApk.Availability.UNKNOWN_ERROR.nativeCode;
        }
    }

    @UsedByNative("arcoreapk.cc")
    static int requestInstall(Activity activity, boolean z, int[] iArr) {
        try {
            iArr[0] = ArCoreApk.getInstance().requestInstall(activity, z).nativeCode;
            return Session.C2008a.SUCCESS.f3145j;
        } catch (Throwable th) {
            return m5090a(th);
        }
    }

    @UsedByNative("arcoreapk.cc")
    static int requestInstallCustom(Activity activity, boolean z, int i, int i2, int[] iArr) {
        try {
            iArr[0] = ArCoreApk.getInstance().requestInstall(activity, z, ArCoreApk.InstallBehavior.forNumber(i), ArCoreApk.UserMessageType.forNumber(i2)).nativeCode;
            return Session.C2008a.SUCCESS.f3145j;
        } catch (Throwable th) {
            return m5090a(th);
        }
    }
}

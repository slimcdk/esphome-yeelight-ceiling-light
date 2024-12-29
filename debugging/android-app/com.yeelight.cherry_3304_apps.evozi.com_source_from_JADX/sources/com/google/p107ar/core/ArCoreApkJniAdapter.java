package com.google.p107ar.core;

import android.app.Activity;
import android.content.Context;
import com.google.p107ar.core.ArCoreApk;
import com.google.p107ar.core.Session;
import com.google.p107ar.core.annotations.UsedByNative;
import com.google.p107ar.core.exceptions.ResourceExhaustedException;
import com.google.p107ar.core.exceptions.UnavailableApkTooOldException;
import com.google.p107ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.p107ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.p107ar.core.exceptions.UnavailableSdkTooOldException;
import com.google.p107ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import java.util.HashMap;
import java.util.Map;

@UsedByNative("arcoreapk.cc")
/* renamed from: com.google.ar.core.ArCoreApkJniAdapter */
class ArCoreApkJniAdapter {

    /* renamed from: a */
    private static final Map<Class<? extends Throwable>, Integer> f5032a;

    static {
        HashMap hashMap = new HashMap();
        f5032a = hashMap;
        hashMap.put(IllegalArgumentException.class, Integer.valueOf(Session.C2623a.ERROR_INVALID_ARGUMENT.f5071a));
        f5032a.put(ResourceExhaustedException.class, Integer.valueOf(Session.C2623a.ERROR_RESOURCE_EXHAUSTED.f5071a));
        f5032a.put(UnavailableArcoreNotInstalledException.class, Integer.valueOf(Session.C2623a.UNAVAILABLE_ARCORE_NOT_INSTALLED.f5071a));
        f5032a.put(UnavailableDeviceNotCompatibleException.class, Integer.valueOf(Session.C2623a.UNAVAILABLE_DEVICE_NOT_COMPATIBLE.f5071a));
        f5032a.put(UnavailableApkTooOldException.class, Integer.valueOf(Session.C2623a.UNAVAILABLE_APK_TOO_OLD.f5071a));
        f5032a.put(UnavailableSdkTooOldException.class, Integer.valueOf(Session.C2623a.UNAVAILABLE_SDK_TOO_OLD.f5071a));
        f5032a.put(UnavailableUserDeclinedInstallationException.class, Integer.valueOf(Session.C2623a.UNAVAILABLE_USER_DECLINED_INSTALLATION.f5071a));
    }

    ArCoreApkJniAdapter() {
    }

    /* renamed from: a */
    private static int m8137a(Throwable th) {
        Class<?> cls = th.getClass();
        return f5032a.containsKey(cls) ? f5032a.get(cls).intValue() : Session.C2623a.ERROR_FATAL.f5071a;
    }

    @UsedByNative("arcoreapk.cc")
    static int checkAvailability(Context context) {
        try {
            return ArCoreApk.getInstance().checkAvailability(context).nativeCode;
        } catch (Throwable th) {
            m8137a(th);
            return ArCoreApk.Availability.UNKNOWN_ERROR.nativeCode;
        }
    }

    @UsedByNative("arcoreapk.cc")
    static int requestInstall(Activity activity, boolean z, int[] iArr) {
        try {
            iArr[0] = ArCoreApk.getInstance().requestInstall(activity, z).nativeCode;
            return Session.C2623a.SUCCESS.f5071a;
        } catch (Throwable th) {
            return m8137a(th);
        }
    }

    @UsedByNative("arcoreapk.cc")
    static int requestInstallCustom(Activity activity, boolean z, int i, int i2, int[] iArr) {
        try {
            iArr[0] = ArCoreApk.getInstance().requestInstall(activity, z, ArCoreApk.InstallBehavior.forNumber(i), ArCoreApk.UserMessageType.forNumber(i2)).nativeCode;
            return Session.C2623a.SUCCESS.f5071a;
        } catch (Throwable th) {
            return m8137a(th);
        }
    }
}

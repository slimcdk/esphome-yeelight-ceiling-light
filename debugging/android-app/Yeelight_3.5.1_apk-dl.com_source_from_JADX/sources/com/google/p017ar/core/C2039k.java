package com.google.p017ar.core;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.p017ar.core.ArCoreApk;
import com.google.p017ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.p017ar.core.exceptions.UnavailableUserDeclinedInstallationException;

/* renamed from: com.google.ar.core.k */
class C2039k implements ArCoreApk.C2003a {

    /* renamed from: a */
    final /* synthetic */ C2058z f3191a;

    C2039k(C2058z zVar) {
        this.f3191a = zVar;
    }

    /* renamed from: b */
    public static Uri m5149b(String str) {
        return new Uri.Builder().scheme("content").authority("com.google.ar.core.services.arcorecontentprovider").path(str).build();
    }

    /* renamed from: c */
    static ArCoreApk.Availability m5150c(Context context) {
        try {
            return m5151d(context) != null ? ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD : ArCoreApk.Availability.SUPPORTED_INSTALLED;
        } catch (UnavailableDeviceNotCompatibleException unused) {
            return ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE;
        } catch (UnavailableUserDeclinedInstallationException | RuntimeException unused2) {
            return ArCoreApk.Availability.UNKNOWN_ERROR;
        }
    }

    /* renamed from: d */
    static PendingIntent m5151d(Context context) {
        Object newInstance;
        try {
            Bundle call = context.getContentResolver().call(m5149b(""), "getSetupIntent", context.getPackageName(), (Bundle) null);
            if (call == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) call.getParcelable("intent");
            if (pendingIntent != null) {
                return pendingIntent;
            }
            String string = call.getString("exceptionType", "");
            if (string.isEmpty()) {
                return null;
            }
            if (string.equals(UnavailableDeviceNotCompatibleException.class.getName())) {
                throw new UnavailableDeviceNotCompatibleException();
            } else if (!string.equals(UnavailableUserDeclinedInstallationException.class.getName())) {
                Class<? extends U> asSubclass = Class.forName(string).asSubclass(RuntimeException.class);
                String string2 = call.getString("exceptionText", (String) null);
                if (string2 != null) {
                    newInstance = asSubclass.getConstructor(new Class[]{String.class}).newInstance(new Object[]{string2});
                } else {
                    newInstance = asSubclass.getConstructor(new Class[0]).newInstance(new Object[0]);
                }
                throw ((RuntimeException) newInstance);
            } else {
                throw new UnavailableUserDeclinedInstallationException();
            }
        } catch (ReflectiveOperationException | RuntimeException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo16395a(ArCoreApk.Availability availability) {
        synchronized (this.f3191a) {
            ArCoreApk.Availability unused = this.f3191a.f3239e = availability;
            boolean unused2 = this.f3191a.f3240f = false;
        }
    }
}

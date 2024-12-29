package com.google.p107ar.core;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.p107ar.core.ArCoreApk;
import com.google.p107ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.p107ar.core.exceptions.UnavailableUserDeclinedInstallationException;

/* renamed from: com.google.ar.core.k */
class C2647k implements ArCoreApk.C2618a {

    /* renamed from: a */
    final /* synthetic */ C2636e0 f5109a;

    C2647k(C2636e0 e0Var) {
        this.f5109a = e0Var;
    }

    /* renamed from: b */
    public static Uri m8184b(String str) {
        return new Uri.Builder().scheme("content").authority("com.google.ar.core.services.arcorecontentprovider").path(str).build();
    }

    /* renamed from: c */
    static ArCoreApk.Availability m8185c(Context context) {
        try {
            return m8186d(context) != null ? ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD : ArCoreApk.Availability.SUPPORTED_INSTALLED;
        } catch (UnavailableDeviceNotCompatibleException unused) {
            return ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE;
        } catch (UnavailableUserDeclinedInstallationException | RuntimeException unused2) {
            return ArCoreApk.Availability.UNKNOWN_ERROR;
        }
    }

    /* renamed from: d */
    static PendingIntent m8186d(Context context) {
        Object newInstance;
        try {
            Bundle call = context.getContentResolver().call(m8184b(""), "getSetupIntent", context.getPackageName(), (Bundle) null);
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
    public void mo14945a(ArCoreApk.Availability availability) {
        synchronized (this.f5109a) {
            ArCoreApk.Availability unused = this.f5109a.f5099e = availability;
            boolean unused2 = this.f5109a.f5100f = false;
        }
    }
}

package com.google.p017ar.core;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.p017ar.core.ArCoreApk;
import com.google.p017ar.core.exceptions.FatalException;
import com.google.p017ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.p017ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import com.miot.api.Constants;

/* renamed from: com.google.ar.core.z */
final class C2058z extends ArCoreApk {

    /* renamed from: k */
    private static final C2058z f3234k = new C2058z();

    /* renamed from: a */
    Exception f3235a;

    /* renamed from: b */
    private boolean f3236b;

    /* renamed from: c */
    private int f3237c;

    /* renamed from: d */
    private long f3238d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ArCoreApk.Availability f3239e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f3240f;

    /* renamed from: g */
    private C2030f0 f3241g;

    /* renamed from: h */
    private boolean f3242h;

    /* renamed from: i */
    private boolean f3243i;

    /* renamed from: j */
    private int f3244j;

    C2058z() {
    }

    /* renamed from: b */
    private static ArCoreApk.InstallStatus m5158b(Activity activity) {
        PendingIntent d = C2039k.m5151d(activity);
        if (d != null) {
            try {
                activity.startIntentSender(d.getIntentSender(), (Intent) null, 0, 0, 0);
                return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
            } catch (IntentSender.SendIntentException | RuntimeException unused) {
            }
        }
        return ArCoreApk.InstallStatus.INSTALLED;
    }

    /* renamed from: c */
    public static C2058z m5159c() {
        return f3234k;
    }

    /* renamed from: h */
    private static boolean m5161h() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* renamed from: i */
    private final boolean m5162i(Context context) {
        m5164k(context);
        return this.f3243i;
    }

    /* renamed from: j */
    private static int m5163j(Context context) {
        ServiceInfo[] serviceInfoArr;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.ar.core", 4);
            int i = packageInfo.versionCode;
            if (i == 0 && ((serviceInfoArr = packageInfo.services) == null || serviceInfoArr.length == 0)) {
                return -1;
            }
            return i;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    /* renamed from: k */
    private final synchronized void m5164k(Context context) {
        if (!this.f3242h) {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            try {
                Bundle bundle = packageManager.getApplicationInfo(packageName, 128).metaData;
                if (bundle.containsKey("com.google.ar.core")) {
                    this.f3243i = bundle.getString("com.google.ar.core").equals("required");
                    if (bundle.containsKey("com.google.ar.core.min_apk_version")) {
                        this.f3244j = bundle.getInt("com.google.ar.core.min_apk_version");
                        ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(packageName, 1).activities;
                        String canonicalName = InstallActivity.class.getCanonicalName();
                        int length = activityInfoArr.length;
                        boolean z = false;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            } else if (canonicalName.equals(activityInfoArr[i].name)) {
                                z = true;
                                break;
                            } else {
                                i++;
                            }
                        }
                        if (!z) {
                            String valueOf = String.valueOf(canonicalName);
                            throw new FatalException(valueOf.length() != 0 ? "Application manifest must contain activity ".concat(valueOf) : new String("Application manifest must contain activity "));
                        } else {
                            this.f3242h = true;
                        }
                    } else {
                        throw new FatalException("Application manifest must contain meta-data com.google.ar.core.min_apk_version");
                    }
                } else {
                    throw new FatalException("Application manifest must contain meta-data com.google.ar.core");
                }
            } catch (PackageManager.NameNotFoundException e) {
                throw new FatalException("Could not load application package metadata", e);
            } catch (PackageManager.NameNotFoundException e2) {
                throw new FatalException("Could not load application package info", e2);
            }
        }
    }

    public final ArCoreApk.Availability checkAvailability(Context context) {
        ArCoreApk.Availability availability;
        if (!m5161h()) {
            return ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE;
        }
        try {
            if (mo16679g(context)) {
                mo16678f();
                return C2039k.m5150c(context);
            }
            synchronized (this) {
                ArCoreApk.Availability availability2 = this.f3239e;
                if ((availability2 == null || availability2.isUnknown()) && !this.f3240f) {
                    this.f3240f = true;
                    C2039k kVar = new C2039k(this);
                    if (mo16679g(context)) {
                        availability = ArCoreApk.Availability.SUPPORTED_INSTALLED;
                    } else if (m5163j(context) != -1) {
                        availability = ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD;
                    } else if (m5162i(context)) {
                        availability = ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED;
                    } else {
                        mo16677d(context).mo16643e(context, kVar);
                    }
                    kVar.mo16395a(availability);
                }
                ArCoreApk.Availability availability3 = this.f3239e;
                if (availability3 != null) {
                    return availability3;
                }
                if (this.f3240f) {
                    ArCoreApk.Availability availability4 = ArCoreApk.Availability.UNKNOWN_CHECKING;
                    return availability4;
                }
                ArCoreApk.Availability availability5 = ArCoreApk.Availability.UNKNOWN_ERROR;
                return availability5;
            }
        } catch (FatalException unused) {
            return ArCoreApk.Availability.UNKNOWN_ERROR;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized C2030f0 mo16677d(Context context) {
        if (this.f3241g == null) {
            C2030f0 f0Var = new C2030f0((byte) 0);
            f0Var.mo16642d(context.getApplicationContext());
            this.f3241g = f0Var;
        }
        return this.f3241g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized void mo16678f() {
        if (this.f3235a == null) {
            this.f3237c = 0;
        }
        this.f3236b = false;
        C2030f0 f0Var = this.f3241g;
        if (f0Var != null) {
            f0Var.mo16640a();
            this.f3241g = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo16679g(Context context) {
        m5164k(context);
        return m5163j(context) == 0 || m5163j(context) >= this.f3244j;
    }

    public final ArCoreApk.InstallStatus requestInstall(Activity activity, boolean z) {
        return requestInstall(activity, z, m5162i(activity) ? ArCoreApk.InstallBehavior.REQUIRED : ArCoreApk.InstallBehavior.OPTIONAL, m5162i(activity) ? ArCoreApk.UserMessageType.APPLICATION : ArCoreApk.UserMessageType.USER_ALREADY_INFORMED);
    }

    public final ArCoreApk.InstallStatus requestInstall(Activity activity, boolean z, ArCoreApk.InstallBehavior installBehavior, ArCoreApk.UserMessageType userMessageType) {
        if (!m5161h()) {
            throw new UnavailableDeviceNotCompatibleException();
        } else if (mo16679g(activity)) {
            mo16678f();
            return m5158b(activity);
        } else if (this.f3236b) {
            return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
        } else {
            Exception exc = this.f3235a;
            if (exc != null) {
                if (z) {
                    this.f3235a = null;
                } else if (exc instanceof UnavailableDeviceNotCompatibleException) {
                    throw ((UnavailableDeviceNotCompatibleException) exc);
                } else if (exc instanceof UnavailableUserDeclinedInstallationException) {
                    throw ((UnavailableUserDeclinedInstallationException) exc);
                } else if (exc instanceof RuntimeException) {
                    throw ((RuntimeException) exc);
                } else {
                    throw new RuntimeException("Unexpected exception type", this.f3235a);
                }
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.f3238d > 5000) {
                this.f3237c = 0;
            }
            int i = this.f3237c + 1;
            this.f3237c = i;
            this.f3238d = uptimeMillis;
            if (i <= 2) {
                try {
                    activity.startActivity(new Intent(activity, InstallActivity.class).putExtra(Constants.EXTRA_PUSH_MESSAGE, userMessageType).putExtra("behavior", installBehavior));
                    this.f3236b = true;
                    return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
                } catch (ActivityNotFoundException e) {
                    throw new FatalException("Failed to launch InstallActivity", e);
                }
            } else {
                throw new FatalException("Requesting ARCore installation too rapidly.");
            }
        }
    }
}

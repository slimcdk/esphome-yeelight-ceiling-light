package com.google.p107ar.core;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.p107ar.core.ArCoreApk;
import com.google.p107ar.core.exceptions.FatalException;
import com.google.p107ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.p107ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import com.miot.api.Constants;

/* renamed from: com.google.ar.core.e0 */
final class C2636e0 extends ArCoreApk {

    /* renamed from: k */
    private static final C2636e0 f5094k = new C2636e0();

    /* renamed from: a */
    Exception f5095a;

    /* renamed from: b */
    private boolean f5096b;

    /* renamed from: c */
    private int f5097c;

    /* renamed from: d */
    private long f5098d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ArCoreApk.Availability f5099e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f5100f;

    /* renamed from: g */
    private C2652m0 f5101g;

    /* renamed from: h */
    private boolean f5102h;

    /* renamed from: i */
    private boolean f5103i;

    /* renamed from: j */
    private int f5104j;

    C2636e0() {
    }

    /* renamed from: b */
    private static ArCoreApk.InstallStatus m8168b(Activity activity) {
        PendingIntent d = C2647k.m8186d(activity);
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
    public static C2636e0 m8169c() {
        return f5094k;
    }

    /* renamed from: h */
    private static boolean m8171h() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* renamed from: i */
    private final boolean m8172i(Context context) {
        m8174k(context);
        return this.f5103i;
    }

    /* renamed from: j */
    private static int m8173j(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.ar.core", 4);
            int i = packageInfo.versionCode;
            if (i == 0 && (packageInfo.services == null || packageInfo.services.length == 0)) {
                return -1;
            }
            return i;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    /* renamed from: k */
    private final synchronized void m8174k(Context context) {
        if (!this.f5102h) {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            try {
                Bundle bundle = packageManager.getApplicationInfo(packageName, 128).metaData;
                if (bundle.containsKey("com.google.ar.core")) {
                    this.f5103i = bundle.getString("com.google.ar.core").equals("required");
                    if (bundle.containsKey("com.google.ar.core.min_apk_version")) {
                        this.f5104j = bundle.getInt("com.google.ar.core.min_apk_version");
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
                            this.f5102h = true;
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
        if (!m8171h()) {
            return ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE;
        }
        try {
            if (mo15187g(context)) {
                mo15186f();
                return C2647k.m8185c(context);
            }
            synchronized (this) {
                if ((this.f5099e == null || this.f5099e.isUnknown()) && !this.f5100f) {
                    this.f5100f = true;
                    C2647k kVar = new C2647k(this);
                    if (mo15187g(context)) {
                        availability = ArCoreApk.Availability.SUPPORTED_INSTALLED;
                    } else if (m8173j(context) != -1) {
                        availability = ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD;
                    } else if (m8172i(context)) {
                        availability = ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED;
                    } else {
                        mo15185d(context).mo15202e(context, kVar);
                    }
                    kVar.mo14945a(availability);
                }
                if (this.f5099e != null) {
                    ArCoreApk.Availability availability2 = this.f5099e;
                    return availability2;
                } else if (this.f5100f) {
                    ArCoreApk.Availability availability3 = ArCoreApk.Availability.UNKNOWN_CHECKING;
                    return availability3;
                } else {
                    ArCoreApk.Availability availability4 = ArCoreApk.Availability.UNKNOWN_ERROR;
                    return availability4;
                }
            }
        } catch (FatalException unused) {
            return ArCoreApk.Availability.UNKNOWN_ERROR;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized C2652m0 mo15185d(Context context) {
        if (this.f5101g == null) {
            C2652m0 m0Var = new C2652m0((byte) 0);
            m0Var.mo15201d(context.getApplicationContext());
            this.f5101g = m0Var;
        }
        return this.f5101g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized void mo15186f() {
        if (this.f5095a == null) {
            this.f5097c = 0;
        }
        this.f5096b = false;
        if (this.f5101g != null) {
            this.f5101g.mo15199a();
            this.f5101g = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo15187g(Context context) {
        m8174k(context);
        return m8173j(context) == 0 || m8173j(context) >= this.f5104j;
    }

    public final ArCoreApk.InstallStatus requestInstall(Activity activity, boolean z) {
        return requestInstall(activity, z, m8172i(activity) ? ArCoreApk.InstallBehavior.REQUIRED : ArCoreApk.InstallBehavior.OPTIONAL, m8172i(activity) ? ArCoreApk.UserMessageType.APPLICATION : ArCoreApk.UserMessageType.USER_ALREADY_INFORMED);
    }

    public final ArCoreApk.InstallStatus requestInstall(Activity activity, boolean z, ArCoreApk.InstallBehavior installBehavior, ArCoreApk.UserMessageType userMessageType) {
        if (!m8171h()) {
            throw new UnavailableDeviceNotCompatibleException();
        } else if (mo15187g(activity)) {
            mo15186f();
            return m8168b(activity);
        } else if (this.f5096b) {
            return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
        } else {
            Exception exc = this.f5095a;
            if (exc != null) {
                if (z) {
                    this.f5095a = null;
                } else if (exc instanceof UnavailableDeviceNotCompatibleException) {
                    throw ((UnavailableDeviceNotCompatibleException) exc);
                } else if (exc instanceof UnavailableUserDeclinedInstallationException) {
                    throw ((UnavailableUserDeclinedInstallationException) exc);
                } else if (exc instanceof RuntimeException) {
                    throw ((RuntimeException) exc);
                } else {
                    throw new RuntimeException("Unexpected exception type", this.f5095a);
                }
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.f5098d > 5000) {
                this.f5097c = 0;
            }
            int i = this.f5097c + 1;
            this.f5097c = i;
            this.f5098d = uptimeMillis;
            if (i <= 2) {
                try {
                    activity.startActivity(new Intent(activity, InstallActivity.class).putExtra(Constants.EXTRA_PUSH_MESSAGE, userMessageType).putExtra("behavior", installBehavior));
                    this.f5096b = true;
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

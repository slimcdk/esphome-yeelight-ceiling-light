package com.xiaomi.mistatistic.sdk.controller.asyncjobs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.core.p005os.EnvironmentCompat;
import com.miot.service.connection.wifi.SmartConfigDataProvider;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.account.openauth.AuthorizeActivityBase;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mistatistic.sdk.BuildSetting;
import com.xiaomi.mistatistic.sdk.C4094b;
import com.xiaomi.mistatistic.sdk.CustomSettings;
import com.xiaomi.mistatistic.sdk.controller.C4113c;
import com.xiaomi.mistatistic.sdk.controller.C4115d;
import com.xiaomi.mistatistic.sdk.controller.C4120e;
import com.xiaomi.mistatistic.sdk.controller.C4130h;
import com.xiaomi.mistatistic.sdk.controller.C4137k;
import com.xiaomi.mistatistic.sdk.controller.C4139l;
import com.xiaomi.mistatistic.sdk.controller.C4162q;
import com.xiaomi.mistatistic.sdk.controller.LocalEventRecorder;
import com.xiaomi.mistatistic.sdk.data.C4169e;
import com.xiaomi.mistatistic.sdk.data.C4172h;
import com.yeelight.yeelib.p150c.p183m.C7425x;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

/* renamed from: com.xiaomi.mistatistic.sdk.controller.asyncjobs.a */
public class C4105a implements C4115d.C4118a {

    /* renamed from: a */
    private boolean f7017a = false;

    /* renamed from: a */
    private static String m11071a(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class}).invoke((Object) null, new Object[]{str});
        } catch (Exception e) {
            C4130h.m11176a("", (Throwable) e);
            return null;
        }
    }

    /* renamed from: a */
    private static void m11072a(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            LocalEventRecorder.insertEvent(new C4172h("mistat_basic", str, str2));
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    private static boolean m11073a(Context context, String str) {
        try {
            StorageManager storageManager = (StorageManager) context.getSystemService("storage");
            return "mounted".equals((String) storageManager.getClass().getMethod("getVolumeState", new Class[]{String.class}).invoke(storageManager, new Object[]{str}));
        } catch (Throwable th) {
            C4130h.m11176a("", th);
        }
    }

    /* renamed from: b */
    public static void m11074b() {
        try {
            Context a = C4113c.m11105a();
            if (!C4162q.m11290a(C4137k.m11203a(a, "dau_time", 0)) && C4162q.m11292a(a)) {
                LocalEventRecorder.insertEvent(new C4169e("mistat_basic", "mistat_dau_dummy"));
                C4137k.m11211b(a, "dau_time", System.currentTimeMillis());
                C4130h.m11177b("addDauEventWhenForeground " + System.currentTimeMillis());
            }
        } catch (Exception e) {
            C4130h.m11176a("addDauEventWhenForeground exception: ", (Throwable) e);
        }
    }

    /* renamed from: b */
    private void m11075b(Context context) {
        int i = new GregorianCalendar().get(6);
        if (i != C4137k.m11202a(context, "last_day", 0)) {
            C4137k.m11210b(context, "last_day", i);
            LocalEventRecorder.insertEvent(new C4169e("mistat_basic", "mistat_dau"));
            m11077d(context);
            m11072a("ui_version", m11071a("ro.miui.ui.version.name"));
            m11072a("version", Build.VERSION.INCREMENTAL);
            m11072a("sd", m11079f(context));
            m11072a("network", m11078e(context));
            m11072a("carrier_name", m11071a("ro.carrier.name"));
            m11072a("region", m11071a("ro.miui.region"));
            m11072a(Constants.EXTRA_KEY_IMEI_MD5, C4162q.m11296b(C4120e.m11127b(context)));
            m11072a("miui_imei_md5", C4162q.m11296b(C4162q.m11302f(context)));
            m11072a("android_id_md5", C4162q.m11296b(C4162q.m11297c(context)));
            m11072a("serial_num_md5", C4162q.m11296b(C4162q.m11287a()));
            this.f7017a = true;
        }
    }

    /* renamed from: c */
    private void m11076c(Context context) {
        if (C4137k.m11202a(context, "uep_property", 0) == 0) {
            LocalEventRecorder.insertEvent(C4162q.m11300d(context) ? BuildSetting.isUserExperienceProgramEnabled(context) ? new C4172h("mistat_basic", "UEP", "yes") : new C4172h("mistat_basic", "UEP", "no") : new C4172h("mistat_basic", "UEP", "not_miui"));
            C4137k.m11210b(C4113c.m11105a(), "uep_property", 1);
        }
    }

    /* renamed from: d */
    private static void m11077d(Context context) {
        try {
            if (CustomSettings.isUploadInstalledPackageEnabled()) {
                ArrayList arrayList = new ArrayList();
                List<ApplicationInfo> installedApplications = context.getPackageManager().getInstalledApplications(0);
                if (installedApplications != null) {
                    for (ApplicationInfo applicationInfo : installedApplications) {
                        arrayList.add(applicationInfo.packageName);
                    }
                    LocalEventRecorder.insertEvent(new C4172h("mistat_basic", "installed_package", TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, arrayList)));
                }
            }
        } catch (Throwable th) {
            C4130h.m11176a("", th);
        }
    }

    /* renamed from: e */
    private static String m11078e(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    if (activeNetworkInfo.getType() == 1) {
                        return "WIFI";
                    }
                    if (activeNetworkInfo.getType() == 0) {
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                            case 11:
                                return "2G";
                            case 3:
                            case 5:
                            case 6:
                            case 8:
                            case 9:
                            case 10:
                            case 12:
                            case 14:
                            case 15:
                                return "3G";
                            case 13:
                                return "4G";
                        }
                    }
                    return EnvironmentCompat.MEDIA_UNKNOWN;
                }
            }
            return EnvironmentCompat.MEDIA_UNKNOWN;
        } catch (Throwable th) {
            C4130h.m11176a("", th);
        }
    }

    /* renamed from: f */
    private static String m11079f(Context context) {
        try {
            String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
            String str = System.getenv("SECONDARY_STORAGE");
            if (TextUtils.isEmpty(str)) {
                return TimerCodec.DISENABLE;
            }
            return (!m11073a(context, str) || str.equals(absolutePath)) ? "2" : TimerCodec.ENABLE;
        } catch (Throwable th) {
            C4130h.m11176a("", th);
            return TimerCodec.DISENABLE;
        }
    }

    /* renamed from: a */
    public void mo22986a() {
        Context a = C4113c.m11105a();
        m11075b(a);
        m11076c(a);
        if (!C4137k.m11215c(a, "basic_info_reported")) {
            mo23031a(a);
            C4137k.m11210b(a, "basic_info_reported", 1);
            this.f7017a = true;
        }
        String e = C4113c.m11112e();
        String a2 = C4137k.m11205a(a, "basic_info_version", "");
        if (!TextUtils.isEmpty(a2) && !a2.equals(e)) {
            C4094b.m11027c();
            LocalEventRecorder.insertEvent(new C4169e("mistat_basic", "upgrade"));
        }
        C4137k.m11212b(a, "basic_info_version", e);
        if (this.f7017a) {
            new C4139l().mo23077a();
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo23031a(Context context) {
        StringBuilder sb;
        LocalEventRecorder.insertEvent(new C4169e("mistat_basic", "new"));
        LocalEventRecorder.insertEvent(new C4172h("mistat_basic", "model", Build.MODEL));
        LocalEventRecorder.insertEvent(new C4172h("mistat_basic", "OS", "android" + Build.VERSION.SDK_INT));
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (!TextUtils.isEmpty(telephonyManager.getNetworkOperatorName())) {
            LocalEventRecorder.insertEvent(new C4172h("mistat_basic", AuthorizeActivityBase.KEY_OPERATOR, telephonyManager.getSimOperator()));
        }
        m11072a("device_id", new C4120e().mo23042a());
        m11072a(Constants.EXTRA_KEY_IMEI_MD5, C4162q.m11296b(C4120e.m11127b(context)));
        m11072a("android_id_md5", C4162q.m11296b(C4162q.m11297c(context)));
        m11072a("serial_num_md5", C4162q.m11296b(C4162q.m11287a()));
        m11072a("mac_md5", C4162q.m11295b(context));
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            if (i < i2) {
                sb.append(i);
                sb.append(C7425x.f15025G);
                sb.append(i2);
            } else {
                sb = new StringBuilder();
                sb.append(i2);
                sb.append(C7425x.f15025G);
                sb.append(i);
            }
            LocalEventRecorder.insertEvent(new C4172h("mistat_basic", "resolution", sb.toString()));
        }
        m11072a("locale", Locale.getDefault().toString());
        m11072a("channel", m11071a("ro.sys.miui_rom_channel_id"));
        m11072a(SmartConfigDataProvider.KEY_DEVICE_NAME, m11071a("ro.product.mod_device"));
        m11072a("real_model", m11071a("ro.product.model.real"));
        if (C4162q.m11300d(C4113c.m11105a())) {
            try {
                String str = Class.forName("miui.os.Build").getField("IS_INTERNATIONAL_BUILD").getBoolean((Object) null) ? TimerCodec.ENABLE : TimerCodec.DISENABLE;
                C4130h.m11177b("mi:" + str);
                m11072a("mi", str);
            } catch (Exception e) {
                C4130h.m11176a("", (Throwable) e);
            }
            try {
                Class<?> cls = Class.forName("miui.os.Build");
                String str2 = cls.getField("IS_ALPHA_BUILD").getBoolean((Object) null) ? "A" : cls.getField("IS_DEVELOPMENT_VERSION").getBoolean((Object) null) ? "D" : "S";
                C4130h.m11177b("bc:" + str2);
                m11072a("bc", str2);
            } catch (Exception e2) {
                C4130h.m11176a("", (Throwable) e2);
            }
        }
    }
}

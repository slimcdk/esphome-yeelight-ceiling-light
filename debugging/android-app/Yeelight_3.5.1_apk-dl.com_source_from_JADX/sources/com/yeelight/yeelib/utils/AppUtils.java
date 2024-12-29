package com.yeelight.yeelib.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.bluetooth.BluetoothManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import com.google.p017ar.core.ArCoreApk;
import com.miot.common.config.AppConfiguration;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.yeelight.cherry.p141ui.activity.LauncherActivity;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.managers.C3092s;
import com.yeelight.yeelib.managers.C8281l;
import com.yeelight.yeelib.service.RestartJobService;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p051j4.C3278f;
import p051j4.C3283v;
import p051j4.C9205u;

public class AppUtils {

    /* renamed from: a */
    public static boolean f4977a = false;

    /* renamed from: b */
    public static boolean f4978b = false;

    /* renamed from: c */
    public static boolean f4979c = false;

    /* renamed from: d */
    public static int f4980d = 2368;

    /* renamed from: e */
    public static Properties f4981e = null;

    /* renamed from: f */
    public static int f4982f = 0;

    /* renamed from: g */
    public static int f4983g = 0;

    /* renamed from: h */
    public static Context f4984h = null;

    /* renamed from: i */
    public static boolean f4985i = true;

    /* renamed from: j */
    public static boolean f4986j = true;

    /* renamed from: k */
    public static String f4987k = "https://api-bj.yeelight.com/";

    /* renamed from: l */
    public static String f4988l = "https://api-bj.yeelight.com/";

    /* renamed from: m */
    public static String f4989m = "https://page.yeelight.com/";

    /* renamed from: n */
    public static String f4990n = "https://page.yeelight.com/app-faq.html#/";

    /* renamed from: o */
    public static String f4991o = "https://page.yeelight.com/";

    /* renamed from: p */
    public static String f4992p = "https://api.yeelight.com/";

    /* renamed from: q */
    public static String f4993q = "https://api-bj.yeelight.com/api/v2/";

    /* renamed from: r */
    public static String f4994r = "https://api-bj.yeelight.com/hw/v2/";

    /* renamed from: s */
    public static String f4995s = "https://api-bj.yeelight.com/api/v3/";

    /* renamed from: t */
    public static String f4996t = "https://account.xiaomi.com/oauth2/token";

    /* renamed from: u */
    public static String f4997u = "https://api-dev.yeedev.com/";

    /* renamed from: v */
    public static String f4998v = "https://api-test.yeedev.com/";

    public static class SuicideException extends RuntimeException {
        public SuicideException(String str, String str2) {
            super(str + ": " + str2);
        }

        public void suicide() {
            throw this;
        }
    }

    /* renamed from: a */
    public static void m8280a(String str, String str2) {
        new SuicideException(str, str2).suicide();
    }

    /* renamed from: b */
    public static String m8281b() {
        String str;
        String a = C3283v.m8835a();
        if (a != null && !a.equals("02:00:00:00:00:00")) {
            return a;
        }
        if (Build.VERSION.SDK_INT < 23) {
            try {
                str = ((BluetoothManager) f4984h.getSystemService("bluetooth")).getAdapter().getAddress();
            } catch (Exception unused) {
                str = "01:23:45:67:89:ab";
            }
        } else {
            try {
                str = UUID.randomUUID().toString();
            } catch (Exception unused2) {
                str = UUID.randomUUID().toString();
            }
        }
        C3283v.m8847m(str);
        return str;
    }

    /* renamed from: c */
    public static int m8282c() {
        try {
            return f4984h.getPackageManager().getPackageInfo(f4984h.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: d */
    public static String m8283d() {
        try {
            return f4984h.getPackageManager().getPackageInfo(f4984h.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public static boolean m8284e() {
        return f4984h.getSharedPreferences("debug_mode", 0).getBoolean("enable", false);
    }

    /* renamed from: f */
    public static String m8285f() {
        return f4984h.getSharedPreferences(XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2, 0).getString("token", (String) null);
    }

    /* renamed from: g */
    public static void m8286g(Context context) {
        f4984h = context;
        f4977a = m8284e() || m8289j();
        C3283v.m8841g(f4984h);
        f4978b = C3283v.m8836b("CRASH_UTIL_FORCE_ENABLE", false);
        f4979c = C3283v.m8843i();
        f4983g = C3283v.m8837c("APP_ENVIRONMENT", 0);
        Properties properties = new Properties();
        f4981e = properties;
        try {
            properties.load(new FileInputStream(new File(Environment.getRootDirectory(), "build.prop")));
        } catch (IOException unused) {
        }
        ArCoreApk.getInstance().checkAvailability(f4984h);
    }

    /* renamed from: h */
    private static void m8287h(String str, String str2) {
        f4987k = str;
        f4988l = str2;
        f4993q = str + "api/v2/";
        f4994r = str + "hw/v2/";
        f4995s = str + "api/v3/";
    }

    /* renamed from: i */
    public static boolean m8288i() {
        return Build.VERSION.SDK_INT >= 23;
    }

    /* renamed from: j */
    public static boolean m8289j() {
        try {
            return (f4984h.getApplicationInfo().flags & 2) != 0;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: k */
    public static boolean m8290k() {
        SharedPreferences sharedPreferences = f4984h.getSharedPreferences("yeelight", 0);
        int i = sharedPreferences.getInt("app_version_history", -1);
        int c = m8282c();
        if (i < c) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt("app_version_history", c);
            edit.apply();
        }
        return i < f4980d;
    }

    /* renamed from: l */
    public static boolean m8291l() {
        return f4981e.getProperty("ro.miui.ui.version.name", (String) null) != null;
    }

    /* renamed from: m */
    public static boolean m8292m(String str) {
        if (str == null) {
            return false;
        }
        return str.contains("yeelight.com") || str.contains("yeedev.com") || str.contains("http://35.167.253.230/");
    }

    /* renamed from: n */
    public static void m8293n() {
        String f = m8285f();
        if (f != null && !f.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(f);
                try {
                    jSONObject.put(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2, System.currentTimeMillis());
                    SharedPreferences.Editor edit = f4984h.getSharedPreferences(XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2, 0).edit();
                    edit.putString("token", jSONObject.toString());
                    edit.apply();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: o */
    public static void m8294o(Context context) {
        Class<LauncherActivity> cls = LauncherActivity.class;
        try {
            int i = LauncherActivity.f10581f;
            ((AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM)).set(1, System.currentTimeMillis() + ((long) 500), PendingIntent.getActivity(context, 0, new Intent(context, cls), C9205u.m22205b(268435456)));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

    /* renamed from: p */
    public static void m8295p(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            m8296q(context);
        } else {
            m8294o(context);
        }
    }

    @RequiresApi(api = 21)
    /* renamed from: q */
    private static void m8296q(Context context) {
        JobInfo.Builder builder = new JobInfo.Builder(0, new ComponentName(context, RestartJobService.class));
        builder.setMinimumLatency((long) 500);
        builder.setOverrideDeadline((long) 1000);
        ((JobScheduler) context.getSystemService("jobscheduler")).schedule(builder.build());
        System.exit(0);
    }

    /* renamed from: r */
    public static void m8297r(boolean z) {
        SharedPreferences.Editor edit = f4984h.getSharedPreferences("debug_mode", 0).edit();
        edit.putBoolean("enable", z);
        edit.apply();
    }

    /* renamed from: s */
    public static void m8298s(String str, String str2, long j) {
        SharedPreferences.Editor edit = f4984h.getSharedPreferences(XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2, 0).edit();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uid", str2);
            jSONObject.put("token", str);
            jSONObject.put("locale", C8281l.m19542b().mo35223a());
            jSONObject.put("created", j);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        edit.putString("token", jSONObject.toString());
        edit.apply();
    }

    /* renamed from: t */
    public static void m8299t(boolean z) {
        f4978b = z;
        C3283v.m8844j("CRASH_UTIL_FORCE_ENABLE", z);
    }

    /* renamed from: u */
    public static void m8300u(String str, String str2) {
        m8302w(str, str2, true);
    }

    /* renamed from: v */
    public static void m8301v(String str, String str2, C3010c cVar) {
        if (cVar != null) {
            str2 = str2 + ", device model: " + cVar.mo23208T() + ", device id: " + cVar.mo23185G();
        }
        m8300u(str, str2);
    }

    /* renamed from: w */
    public static void m8302w(String str, String str2, boolean z) {
        C3092s.m8139f().mo23493r();
        if (f4977a) {
            new SuicideException(str, str2).suicide();
        } else if (z) {
            C3278f.m8797b(new SuicideException(str, str2 + ", userId: " + C3051a.m7925r().mo23366v()));
        }
    }

    /* renamed from: x */
    private static void m8303x(String str) {
        int i = f4983g;
        f4989m = i != 1 ? i != 2 ? i != 4 ? (str.isEmpty() || str.equals(AppConfiguration.Locale.cn.name())) ? "https://page.yeelight.com/" : str.equals(AppConfiguration.Locale.us.name()) ? "https://page-us.yeelight.com/" : str.equals(AppConfiguration.Locale.sg.name()) ? "https://page-sg.yeelight.com/" : str.equals(AppConfiguration.Locale.ru.name()) ? "https://page-ru.yeelight.com/" : str.equals(AppConfiguration.Locale.de.name()) ? "https://page-de.yeelight.com/" : "https://page-in.yeelight.com/" : (str.isEmpty() || str.equals(AppConfiguration.Locale.cn.name())) ? "https://page-st.yeelight.com/" : str.equals(AppConfiguration.Locale.us.name()) ? "https://page-us-st.yeelight.com/" : str.equals(AppConfiguration.Locale.sg.name()) ? "https://page-sg-st.yeelight.com/" : str.equals(AppConfiguration.Locale.ru.name()) ? "https://page-ru-st.yeelight.com/" : str.equals(AppConfiguration.Locale.de.name()) ? "https://page-de-st.yeelight.com/" : "https://page-in-st.yeelight.com/" : "http://page-test.yeedev.com/" : "http://page-dev.yeedev.com/";
        f4990n = f4989m + "app-faq.html#/";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0076, code lost:
        if (r0.equals(com.miot.common.config.AppConfiguration.Locale.de.name()) != false) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0125, code lost:
        if (r0.equals(com.miot.common.config.AppConfiguration.Locale.de.name()) != false) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0127, code lost:
        m8287h("https://api-de.yeelight.com/", "https://api-de.yeelight.com/");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012c, code lost:
        m8287h("https://api-in.yeelight.com/", "https://api-in.yeelight.com/");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m8304y() {
        /*
            com.yeelight.yeelib.managers.l r0 = com.yeelight.yeelib.managers.C8281l.m19542b()
            java.lang.String r0 = r0.mo35223a()
            m8303x(r0)
            int r1 = f4983g
            r2 = 1
            java.lang.String r3 = "api/v3/"
            java.lang.String r4 = "hw/v2/"
            java.lang.String r5 = "api/v2/"
            if (r1 == r2) goto L_0x0168
            r2 = 2
            if (r1 == r2) goto L_0x0134
            r2 = 3
            java.lang.String r3 = "https://api-us.yeelight.com/"
            java.lang.String r4 = "https://api-de.yeelight.com/"
            java.lang.String r5 = "https://api-in.yeelight.com/"
            java.lang.String r6 = "https://api-ru.yeelight.com/"
            java.lang.String r7 = "https://api-sg.yeelight.com/"
            java.lang.String r8 = "https://api-bj.yeelight.com/"
            if (r1 == r2) goto L_0x00d3
            r2 = 4
            if (r1 == r2) goto L_0x007a
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0130
            com.miot.common.config.AppConfiguration$Locale r1 = com.miot.common.config.AppConfiguration.Locale.cn
            java.lang.String r1 = r1.name()
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x003f
            goto L_0x0130
        L_0x003f:
            com.miot.common.config.AppConfiguration$Locale r1 = com.miot.common.config.AppConfiguration.Locale.us
            java.lang.String r1 = r1.name()
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0050
            m8287h(r3, r3)
            goto L_0x01a7
        L_0x0050:
            com.miot.common.config.AppConfiguration$Locale r1 = com.miot.common.config.AppConfiguration.Locale.sg
            java.lang.String r1 = r1.name()
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x005e
            goto L_0x0105
        L_0x005e:
            com.miot.common.config.AppConfiguration$Locale r1 = com.miot.common.config.AppConfiguration.Locale.ru
            java.lang.String r1 = r1.name()
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x006c
            goto L_0x0116
        L_0x006c:
            com.miot.common.config.AppConfiguration$Locale r1 = com.miot.common.config.AppConfiguration.Locale.de
            java.lang.String r1 = r1.name()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x012c
            goto L_0x0127
        L_0x007a:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x00cc
            com.miot.common.config.AppConfiguration$Locale r1 = com.miot.common.config.AppConfiguration.Locale.cn
            java.lang.String r1 = r1.name()
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x008d
            goto L_0x00cc
        L_0x008d:
            com.miot.common.config.AppConfiguration$Locale r1 = com.miot.common.config.AppConfiguration.Locale.us
            java.lang.String r1 = r1.name()
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x009c
            java.lang.String r0 = "https://api-us-st.yeelight.com/"
            goto L_0x00ce
        L_0x009c:
            com.miot.common.config.AppConfiguration$Locale r1 = com.miot.common.config.AppConfiguration.Locale.sg
            java.lang.String r1 = r1.name()
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00ab
            java.lang.String r0 = "https://api-sg-st.yeelight.com/"
            goto L_0x00ce
        L_0x00ab:
            com.miot.common.config.AppConfiguration$Locale r1 = com.miot.common.config.AppConfiguration.Locale.ru
            java.lang.String r1 = r1.name()
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00ba
            java.lang.String r0 = "https://api-ru-st.yeelight.com/"
            goto L_0x00ce
        L_0x00ba:
            com.miot.common.config.AppConfiguration$Locale r1 = com.miot.common.config.AppConfiguration.Locale.de
            java.lang.String r1 = r1.name()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c9
            java.lang.String r0 = "https://api-de-st.yeelight.com/"
            goto L_0x00ce
        L_0x00c9:
            java.lang.String r0 = "https://api-in-st.yeelight.com/"
            goto L_0x00ce
        L_0x00cc:
            java.lang.String r0 = "https://api-bj-st.yeelight.com/"
        L_0x00ce:
            m8287h(r0, r0)
            goto L_0x01a7
        L_0x00d3:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0130
            com.miot.common.config.AppConfiguration$Locale r1 = com.miot.common.config.AppConfiguration.Locale.cn
            java.lang.String r1 = r1.name()
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00e6
            goto L_0x0130
        L_0x00e6:
            com.miot.common.config.AppConfiguration$Locale r1 = com.miot.common.config.AppConfiguration.Locale.us
            java.lang.String r1 = r1.name()
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00f9
            java.lang.String r0 = "http://35.167.253.230/"
            m8287h(r0, r3)
            goto L_0x01a7
        L_0x00f9:
            com.miot.common.config.AppConfiguration$Locale r1 = com.miot.common.config.AppConfiguration.Locale.sg
            java.lang.String r1 = r1.name()
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x010a
        L_0x0105:
            m8287h(r7, r7)
            goto L_0x01a7
        L_0x010a:
            com.miot.common.config.AppConfiguration$Locale r1 = com.miot.common.config.AppConfiguration.Locale.ru
            java.lang.String r1 = r1.name()
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x011b
        L_0x0116:
            m8287h(r6, r6)
            goto L_0x01a7
        L_0x011b:
            com.miot.common.config.AppConfiguration$Locale r1 = com.miot.common.config.AppConfiguration.Locale.de
            java.lang.String r1 = r1.name()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x012c
        L_0x0127:
            m8287h(r4, r4)
            goto L_0x01a7
        L_0x012c:
            m8287h(r5, r5)
            goto L_0x01a7
        L_0x0130:
            m8287h(r8, r8)
            goto L_0x01a7
        L_0x0134:
            java.lang.String r0 = f4998v
            f4987k = r0
            f4988l = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = f4998v
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            f4993q = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = f4998v
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            f4994r = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = f4998v
            goto L_0x019b
        L_0x0168:
            java.lang.String r0 = f4997u
            f4987k = r0
            f4988l = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = f4997u
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            f4993q = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = f4997u
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            f4994r = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = f4997u
        L_0x019b:
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            f4995s = r0
        L_0x01a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.utils.AppUtils.m8304y():void");
    }

    /* renamed from: z */
    public static void m8305z(String str, String str2) {
        String f = m8285f();
        JSONObject jSONObject = new JSONObject();
        if (f != null && !f.isEmpty()) {
            try {
                jSONObject = new JSONObject(f);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        try {
            jSONObject.put("uid", str2);
            jSONObject.put("token", str);
            jSONObject.put("locale", C8281l.m19542b().mo35223a());
            jSONObject.put("updated", System.currentTimeMillis());
            SharedPreferences.Editor edit = f4984h.getSharedPreferences(XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2, 0).edit();
            edit.putString("token", jSONObject.toString());
            edit.apply();
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}

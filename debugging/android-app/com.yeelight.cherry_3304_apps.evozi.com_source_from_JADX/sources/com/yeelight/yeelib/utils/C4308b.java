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
import com.google.p107ar.core.ArCoreApk;
import com.miot.common.config.AppConfiguration;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p152f.C4230l;
import com.yeelight.yeelib.p152f.C4243s;
import com.yeelight.yeelib.service.RestartJobService;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.utils.b */
public class C4308b {

    /* renamed from: a */
    public static boolean f7482a = false;

    /* renamed from: b */
    public static boolean f7483b = false;

    /* renamed from: c */
    public static int f7484c = 2368;

    /* renamed from: d */
    public static Properties f7485d = null;

    /* renamed from: e */
    public static int f7486e = 0;

    /* renamed from: f */
    public static Context f7487f = null;

    /* renamed from: g */
    public static boolean f7488g = true;

    /* renamed from: h */
    public static boolean f7489h = true;

    /* renamed from: i */
    public static String f7490i = "https://cloud-bj.yeelight.com/";

    /* renamed from: j */
    public static String f7491j = "https://api-bj.yeelight.com/";

    /* renamed from: k */
    public static String f7492k = "https://cloud-bj.yeelight.com/api/v2/";

    /* renamed from: l */
    public static String f7493l = "https://cloud-bj.yeelight.com/hw/v2/";

    /* renamed from: m */
    public static String f7494m = "https://cloud-bj.yeelight.com/api/v3/";

    /* renamed from: n */
    public static String f7495n = "https://account.xiaomi.com/oauth2/token";

    /* renamed from: o */
    public static String f7496o = "https://www.mi.com";

    /* renamed from: com.yeelight.yeelib.utils.b$a */
    public static class C4309a extends RuntimeException {
        public C4309a(String str, String str2) {
            super(str + ": " + str2);
        }

        /* renamed from: a */
        public void mo23771a() {
            throw this;
        }
    }

    /* renamed from: a */
    public static void m12122a(String str, String str2) {
        new C4309a(str, str2).mo23771a();
        throw null;
    }

    /* renamed from: b */
    public static String m12123b() {
        String str;
        String a = C10559w.m25805a();
        if (a != null && !a.equals("02:00:00:00:00:00")) {
            return a;
        }
        if (Build.VERSION.SDK_INT < 23) {
            try {
                str = ((BluetoothManager) f7487f.getSystemService("bluetooth")).getAdapter().getAddress();
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
        C10559w.m25817m(str);
        return str;
    }

    /* renamed from: c */
    public static int m12124c() {
        try {
            return f7487f.getPackageManager().getPackageInfo(f7487f.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: d */
    public static String m12125d() {
        try {
            return f7487f.getPackageManager().getPackageInfo(f7487f.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public static boolean m12126e() {
        return f7487f.getSharedPreferences("debug_mode", 0).getBoolean("enable", false);
    }

    /* renamed from: f */
    public static String m12127f() {
        return f7487f.getSharedPreferences(XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2, 0).getString("token", (String) null);
    }

    /* renamed from: g */
    public static void m12128g(Context context) {
        f7487f = context;
        f7482a = m12126e() || m12130i();
        C10559w.m25811g(f7487f);
        f7483b = C10559w.m25813i();
        Properties properties = new Properties();
        f7485d = properties;
        try {
            properties.load(new FileInputStream(new File(Environment.getRootDirectory(), "build.prop")));
        } catch (IOException unused) {
        }
        ArCoreApk.getInstance().checkAvailability(f7487f);
    }

    /* renamed from: h */
    public static boolean m12129h() {
        return Build.VERSION.SDK_INT >= 23;
    }

    /* renamed from: i */
    public static boolean m12130i() {
        try {
            return (f7487f.getApplicationInfo().flags & 2) != 0;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: j */
    public static boolean m12131j() {
        SharedPreferences sharedPreferences = f7487f.getSharedPreferences("yeelight", 0);
        int i = sharedPreferences.getInt("app_version_history", -1);
        int c = m12124c();
        if (i < c) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt("app_version_history", c);
            edit.apply();
        }
        return i < f7484c;
    }

    /* renamed from: k */
    public static boolean m12132k() {
        return f7485d.getProperty("ro.miui.ui.version.name", (String) null) != null;
    }

    /* renamed from: l */
    public static void m12133l() {
        String f = m12127f();
        if (f != null && !f.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(f);
                try {
                    jSONObject.put(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2, System.currentTimeMillis());
                    SharedPreferences.Editor edit = f7487f.getSharedPreferences(XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2, 0).edit();
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

    /* renamed from: m */
    public static void m12134m(Context context) {
        try {
            ((AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM)).set(1, System.currentTimeMillis() + ((long) 500), PendingIntent.getActivity(context, 0, new Intent(context, Class.forName("com.yeelight.cherry.ui.activity.LauncherActivity")), 268435456));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

    /* renamed from: n */
    public static void m12135n(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            m12136o(context);
        } else {
            m12134m(context);
        }
    }

    @RequiresApi(api = 21)
    /* renamed from: o */
    private static void m12136o(Context context) {
        JobInfo.Builder builder = new JobInfo.Builder(0, new ComponentName(context, RestartJobService.class));
        builder.setMinimumLatency((long) 500);
        builder.setOverrideDeadline((long) 1000);
        ((JobScheduler) context.getSystemService("jobscheduler")).schedule(builder.build());
        System.exit(0);
    }

    /* renamed from: p */
    public static void m12137p(boolean z) {
        SharedPreferences.Editor edit = f7487f.getSharedPreferences("debug_mode", 0).edit();
        edit.putBoolean("enable", z);
        edit.apply();
    }

    /* renamed from: q */
    public static void m12138q(String str, String str2, long j) {
        SharedPreferences.Editor edit = f7487f.getSharedPreferences(XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2, 0).edit();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uid", str2);
            jSONObject.put("token", str);
            jSONObject.put("locale", C4230l.m11766b().mo23552a());
            jSONObject.put("created", j);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        edit.putString("token", jSONObject.toString());
        edit.apply();
    }

    /* renamed from: r */
    public static void m12139r(String str, String str2) {
        m12141t(str, str2, true);
    }

    /* renamed from: s */
    public static void m12140s(String str, String str2, C4198d dVar) {
        if (dVar != null) {
            str2 = str2 + ", device model: " + dVar.mo23395T() + ", device id: " + dVar.mo23372G();
        }
        m12139r(str, str2);
    }

    /* renamed from: t */
    public static void m12141t(String str, String str2, boolean z) {
        C4243s.m11829f().mo23600r();
        if (f7482a) {
            new C4309a(str, str2).mo23771a();
            throw null;
        } else if (z) {
            C4310h.m12146b(new C4309a(str, str2 + ", userId: " + C4201a.m11607r().mo23452v()));
        }
    }

    /* renamed from: u */
    public static void m12142u() {
        String str;
        String a = C4230l.m11766b().mo23552a();
        if (a.isEmpty() || a.equals(AppConfiguration.Locale.cn.name())) {
            f7490i = "https://cloud-bj.yeelight.com/";
            f7491j = "https://api-bj.yeelight.com/";
            f7492k = "https://cloud-bj.yeelight.com/api/v2/";
            f7493l = "https://cloud-bj.yeelight.com/hw/v2/";
            str = "https://cloud-bj.yeelight.com/api/v3/";
        } else if (a.equals(AppConfiguration.Locale.us.name())) {
            f7490i = "https://cloud-us.yeelight.com/";
            f7491j = "https://api-us.yeelight.com/";
            f7492k = "https://cloud-us.yeelight.com/api/v2/";
            f7493l = "https://cloud-us.yeelight.com/hw/v2/";
            str = "https://cloud-us.yeelight.com/api/v3/";
        } else if (a.equals(AppConfiguration.Locale.sg.name())) {
            f7490i = "https://cloud-sg.yeelight.com/";
            f7491j = "https://api-sg.yeelight.com/";
            f7492k = "https://cloud-sg.yeelight.com/api/v2/";
            f7493l = "https://cloud-sg.yeelight.com/hw/v2/";
            str = "https://cloud-sg.yeelight.com/api/v3/";
        } else if (a.equals(AppConfiguration.Locale.ru.name())) {
            f7490i = "https://cloud-ru.yeelight.com/";
            f7491j = "https://api-ru.yeelight.com/";
            f7492k = "https://cloud-ru.yeelight.com/api/v2/";
            f7493l = "https://cloud-ru.yeelight.com/hw/v2/";
            str = "https://cloud-ru.yeelight.com/api/v3/";
        } else if (a.equals(AppConfiguration.Locale.de.name())) {
            f7490i = "https://cloud-de.yeelight.com/";
            f7491j = "https://api-de.yeelight.com/";
            f7492k = "https://cloud-de.yeelight.com/api/v2/";
            f7493l = "https://cloud-de.yeelight.com/hw/v2/";
            str = "https://cloud-de.yeelight.com/api/v3/";
        } else {
            f7490i = "https://cloud-in.yeelight.com/";
            f7491j = "https://api-in.yeelight.com/";
            f7492k = "https://cloud-in.yeelight.com/api/v2/";
            f7493l = "https://cloud-in.yeelight.com/hw/v2/";
            str = "https://cloud-in.yeelight.com/api/v3/";
        }
        f7494m = str;
    }

    /* renamed from: v */
    public static void m12143v(String str, String str2) {
        String f = m12127f();
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
            jSONObject.put("locale", C4230l.m11766b().mo23552a());
            jSONObject.put("updated", System.currentTimeMillis());
            SharedPreferences.Editor edit = f7487f.getSharedPreferences(XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2, 0).edit();
            edit.putString("token", jSONObject.toString());
            edit.apply();
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}

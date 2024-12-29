package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4689g;
import com.xiaomi.push.C4753i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.xiaomi.mipush.sdk.b */
public class C4056b {

    /* renamed from: a */
    private static volatile C4056b f6908a;

    /* renamed from: a */
    private Context f6909a;

    /* renamed from: a */
    private C4057a f6910a;

    /* renamed from: a */
    String f6911a;

    /* renamed from: a */
    private Map<String, C4057a> f6912a;

    /* renamed from: com.xiaomi.mipush.sdk.b$a */
    public static class C4057a {

        /* renamed from: a */
        public int f6913a = 1;

        /* renamed from: a */
        private Context f6914a;

        /* renamed from: a */
        public String f6915a;

        /* renamed from: a */
        public boolean f6916a = true;

        /* renamed from: b */
        public String f6917b;

        /* renamed from: b */
        public boolean f6918b = false;

        /* renamed from: c */
        public String f6919c;

        /* renamed from: d */
        public String f6920d;

        /* renamed from: e */
        public String f6921e;

        /* renamed from: f */
        public String f6922f;

        /* renamed from: g */
        public String f6923g;

        /* renamed from: h */
        public String f6924h;

        public C4057a(Context context) {
            this.f6914a = context;
        }

        /* renamed from: a */
        public static C4057a m10915a(Context context, String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                C4057a aVar = new C4057a(context);
                aVar.f6915a = jSONObject.getString("appId");
                aVar.f6917b = jSONObject.getString("appToken");
                aVar.f6919c = jSONObject.getString("regId");
                aVar.f6920d = jSONObject.getString("regSec");
                aVar.f6922f = jSONObject.getString("devId");
                aVar.f6921e = jSONObject.getString("vName");
                aVar.f6916a = jSONObject.getBoolean("valid");
                aVar.f6918b = jSONObject.getBoolean("paused");
                aVar.f6913a = jSONObject.getInt("envType");
                aVar.f6923g = jSONObject.getString("regResource");
                return aVar;
            } catch (Throwable th) {
                C3989b.m10678a(th);
                return null;
            }
        }

        /* renamed from: a */
        private String mo22944a() {
            Context context = this.f6914a;
            return C4689g.m14350a(context, context.getPackageName());
        }

        /* renamed from: a */
        public static String m10917a(C4057a aVar) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("appId", aVar.f6915a);
                jSONObject.put("appToken", aVar.f6917b);
                jSONObject.put("regId", aVar.f6919c);
                jSONObject.put("regSec", aVar.f6920d);
                jSONObject.put("devId", aVar.f6922f);
                jSONObject.put("vName", aVar.f6921e);
                jSONObject.put("valid", aVar.f6916a);
                jSONObject.put("paused", aVar.f6918b);
                jSONObject.put("envType", aVar.f6913a);
                jSONObject.put("regResource", aVar.f6923g);
                return jSONObject.toString();
            } catch (Throwable th) {
                C3989b.m10678a(th);
                return null;
            }
        }

        /* renamed from: a */
        public void m10918a() {
            C4056b.m10888a(this.f6914a).edit().clear().commit();
            this.f6915a = null;
            this.f6917b = null;
            this.f6919c = null;
            this.f6920d = null;
            this.f6922f = null;
            this.f6921e = null;
            this.f6916a = false;
            this.f6918b = false;
            this.f6924h = null;
            this.f6913a = 1;
        }

        /* renamed from: a */
        public void mo22945a(int i) {
            this.f6913a = i;
        }

        /* renamed from: a */
        public void mo22946a(String str, String str2) {
            this.f6919c = str;
            this.f6920d = str2;
            this.f6922f = C4753i.m14766l(this.f6914a);
            this.f6921e = mo22944a();
            this.f6916a = true;
        }

        /* renamed from: a */
        public void mo22947a(String str, String str2, String str3) {
            this.f6915a = str;
            this.f6917b = str2;
            this.f6923g = str3;
            SharedPreferences.Editor edit = C4056b.m10888a(this.f6914a).edit();
            edit.putString("appId", this.f6915a);
            edit.putString("appToken", str2);
            edit.putString("regResource", str3);
            edit.commit();
        }

        /* renamed from: a */
        public void mo22948a(boolean z) {
            this.f6918b = z;
        }

        /* renamed from: a */
        public boolean m10923a() {
            return mo22946a(this.f6915a, this.f6917b);
        }

        /* renamed from: a */
        public boolean m10924a(String str, String str2) {
            return TextUtils.equals(this.f6915a, str) && TextUtils.equals(this.f6917b, str2) && !TextUtils.isEmpty(this.f6919c) && !TextUtils.isEmpty(this.f6920d) && (TextUtils.equals(this.f6922f, C4753i.m14766l(this.f6914a)) || TextUtils.equals(this.f6922f, C4753i.m14765k(this.f6914a)));
        }

        /* renamed from: b */
        public void mo22949b() {
            this.f6916a = false;
            C4056b.m10888a(this.f6914a).edit().putBoolean("valid", this.f6916a).commit();
        }

        /* renamed from: b */
        public void mo22950b(String str, String str2, String str3) {
            this.f6919c = str;
            this.f6920d = str2;
            this.f6922f = C4753i.m14766l(this.f6914a);
            this.f6921e = mo22944a();
            this.f6916a = true;
            this.f6924h = str3;
            SharedPreferences.Editor edit = C4056b.m10888a(this.f6914a).edit();
            edit.putString("regId", str);
            edit.putString("regSec", str2);
            edit.putString("devId", this.f6922f);
            edit.putString("vName", mo22944a());
            edit.putBoolean("valid", true);
            edit.putString("appRegion", str3);
            edit.commit();
        }

        /* renamed from: c */
        public void mo22951c(String str, String str2, String str3) {
            this.f6915a = str;
            this.f6917b = str2;
            this.f6923g = str3;
        }
    }

    private C4056b(Context context) {
        this.f6909a = context;
        mo22940c();
    }

    /* renamed from: a */
    public static SharedPreferences m10888a(Context context) {
        return context.getSharedPreferences("mipush", 0);
    }

    /* renamed from: a */
    public static C4056b m10889a(Context context) {
        if (f6908a == null) {
            synchronized (C4056b.class) {
                if (f6908a == null) {
                    f6908a = new C4056b(context);
                }
            }
        }
        return f6908a;
    }

    /* renamed from: c */
    private void mo22940c() {
        this.f6910a = new C4057a(this.f6909a);
        this.f6912a = new HashMap();
        SharedPreferences a = m10888a(this.f6909a);
        this.f6910a.f6915a = a.getString("appId", (String) null);
        this.f6910a.f6917b = a.getString("appToken", (String) null);
        this.f6910a.f6919c = a.getString("regId", (String) null);
        this.f6910a.f6920d = a.getString("regSec", (String) null);
        this.f6910a.f6922f = a.getString("devId", (String) null);
        if (!TextUtils.isEmpty(this.f6910a.f6922f) && C4753i.m14736a(this.f6910a.f6922f)) {
            this.f6910a.f6922f = C4753i.m14766l(this.f6909a);
            a.edit().putString("devId", this.f6910a.f6922f).commit();
        }
        this.f6910a.f6921e = a.getString("vName", (String) null);
        this.f6910a.f6916a = a.getBoolean("valid", true);
        this.f6910a.f6918b = a.getBoolean("paused", false);
        this.f6910a.f6913a = a.getInt("envType", 1);
        this.f6910a.f6923g = a.getString("regResource", (String) null);
        this.f6910a.f6924h = a.getString("appRegion", (String) null);
    }

    /* renamed from: a */
    public int mo22930a() {
        return this.f6910a.f6913a;
    }

    /* renamed from: a */
    public C4057a mo22931a(String str) {
        if (this.f6912a.containsKey(str)) {
            return this.f6912a.get(str);
        }
        String str2 = "hybrid_app_info_" + str;
        SharedPreferences a = m10888a(this.f6909a);
        if (!a.contains(str2)) {
            return null;
        }
        C4057a a2 = C4057a.m10915a(this.f6909a, a.getString(str2, ""));
        this.f6912a.put(str2, a2);
        return a2;
    }

    /* renamed from: a */
    public String m10893a() {
        return this.f6910a.f6915a;
    }

    /* renamed from: a */
    public void m10894a() {
        this.f6910a.mo22944a();
    }

    /* renamed from: a */
    public void mo22932a(int i) {
        this.f6910a.mo22945a(i);
        m10888a(this.f6909a).edit().putInt("envType", i).commit();
    }

    /* renamed from: a */
    public void m10896a(String str) {
        SharedPreferences.Editor edit = m10888a(this.f6909a).edit();
        edit.putString("vName", str);
        edit.commit();
        this.f6910a.f6921e = str;
    }

    /* renamed from: a */
    public void mo22933a(String str, C4057a aVar) {
        this.f6912a.put(str, aVar);
        String a = C4057a.m10917a(aVar);
        m10888a(this.f6909a).edit().putString("hybrid_app_info_" + str, a).commit();
    }

    /* renamed from: a */
    public void mo22934a(String str, String str2, String str3) {
        this.f6910a.mo22947a(str, str2, str3);
    }

    /* renamed from: a */
    public void mo22935a(boolean z) {
        this.f6910a.mo22948a(z);
        m10888a(this.f6909a).edit().putBoolean("paused", z).commit();
    }

    /* renamed from: a */
    public boolean m10900a() {
        Context context = this.f6909a;
        return !TextUtils.equals(C4689g.m14350a(context, context.getPackageName()), this.f6910a.f6921e);
    }

    /* renamed from: a */
    public boolean mo22936a(String str, String str2) {
        return this.f6910a.mo22946a(str, str2);
    }

    /* renamed from: a */
    public boolean m10902a(String str, String str2, String str3) {
        C4057a a = mo22931a(str3);
        return a != null && TextUtils.equals(str, a.f6915a) && TextUtils.equals(str2, a.f6917b);
    }

    /* renamed from: b */
    public String mo22937b() {
        return this.f6910a.f6917b;
    }

    /* renamed from: b */
    public void m10904b() {
        this.f6910a.mo22949b();
    }

    /* renamed from: b */
    public void mo22938b(String str) {
        this.f6912a.remove(str);
        m10888a(this.f6909a).edit().remove("hybrid_app_info_" + str).commit();
    }

    /* renamed from: b */
    public void mo22939b(String str, String str2, String str3) {
        this.f6910a.mo22950b(str, str2, str3);
    }

    /* renamed from: b */
    public boolean m10907b() {
        if (this.f6910a.mo22944a()) {
            return true;
        }
        C3989b.m10669a("Don't send message before initialization succeeded!");
        return false;
    }

    /* renamed from: c */
    public String m10908c() {
        return this.f6910a.f6919c;
    }

    /* renamed from: c */
    public boolean m10909c() {
        return this.f6910a.mo22944a();
    }

    /* renamed from: d */
    public String mo22941d() {
        return this.f6910a.f6920d;
    }

    /* renamed from: d */
    public boolean m10911d() {
        return this.f6910a.f6918b;
    }

    /* renamed from: e */
    public String mo22942e() {
        return this.f6910a.f6923g;
    }

    /* renamed from: e */
    public boolean m10913e() {
        return !this.f6910a.f6916a;
    }

    /* renamed from: f */
    public String mo22943f() {
        return this.f6910a.f6924h;
    }
}

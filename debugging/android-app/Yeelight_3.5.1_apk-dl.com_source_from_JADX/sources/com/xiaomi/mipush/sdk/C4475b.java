package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4747h;
import com.xiaomi.push.C4805j;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.xiaomi.mipush.sdk.b */
public class C4475b {

    /* renamed from: a */
    private static volatile C4475b f7475a;

    /* renamed from: a */
    private Context f7476a;

    /* renamed from: a */
    private C4476a f7477a;

    /* renamed from: a */
    String f7478a;

    /* renamed from: a */
    private Map<String, C4476a> f7479a;

    /* renamed from: com.xiaomi.mipush.sdk.b$a */
    public static class C4476a {

        /* renamed from: a */
        public int f7480a = 1;

        /* renamed from: a */
        private Context f7481a;

        /* renamed from: a */
        public String f7482a;

        /* renamed from: a */
        public boolean f7483a = true;

        /* renamed from: b */
        public String f7484b;

        /* renamed from: b */
        public boolean f7485b = false;

        /* renamed from: c */
        public String f7486c;

        /* renamed from: d */
        public String f7487d;

        /* renamed from: e */
        public String f7488e;

        /* renamed from: f */
        public String f7489f;

        /* renamed from: g */
        public String f7490g;

        /* renamed from: h */
        public String f7491h;

        public C4476a(Context context) {
            this.f7481a = context;
        }

        /* renamed from: a */
        public static C4476a m12733a(Context context, String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                C4476a aVar = new C4476a(context);
                aVar.f7482a = jSONObject.getString("appId");
                aVar.f7484b = jSONObject.getString("appToken");
                aVar.f7486c = jSONObject.getString("regId");
                aVar.f7487d = jSONObject.getString("regSec");
                aVar.f7489f = jSONObject.getString("devId");
                aVar.f7488e = jSONObject.getString("vName");
                aVar.f7483a = jSONObject.getBoolean("valid");
                aVar.f7485b = jSONObject.getBoolean("paused");
                aVar.f7480a = jSONObject.getInt("envType");
                aVar.f7490g = jSONObject.getString("regResource");
                return aVar;
            } catch (Throwable th) {
                C4408b.m12478a(th);
                return null;
            }
        }

        /* renamed from: a */
        private String mo28698a() {
            Context context = this.f7481a;
            return C4747h.m14123a(context, context.getPackageName());
        }

        /* renamed from: a */
        public static String m12735a(C4476a aVar) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("appId", aVar.f7482a);
                jSONObject.put("appToken", aVar.f7484b);
                jSONObject.put("regId", aVar.f7486c);
                jSONObject.put("regSec", aVar.f7487d);
                jSONObject.put("devId", aVar.f7489f);
                jSONObject.put("vName", aVar.f7488e);
                jSONObject.put("valid", aVar.f7483a);
                jSONObject.put("paused", aVar.f7485b);
                jSONObject.put("envType", aVar.f7480a);
                jSONObject.put("regResource", aVar.f7490g);
                return jSONObject.toString();
            } catch (Throwable th) {
                C4408b.m12478a(th);
                return null;
            }
        }

        /* renamed from: a */
        public void m12736a() {
            C4475b.m12705a(this.f7481a).edit().clear().commit();
            this.f7482a = null;
            this.f7484b = null;
            this.f7486c = null;
            this.f7487d = null;
            this.f7489f = null;
            this.f7488e = null;
            this.f7483a = false;
            this.f7485b = false;
            this.f7491h = null;
            this.f7480a = 1;
        }

        /* renamed from: a */
        public void mo28699a(int i) {
            this.f7480a = i;
        }

        /* renamed from: a */
        public void mo28700a(String str, String str2) {
            this.f7486c = str;
            this.f7487d = str2;
            this.f7489f = C4805j.m14886j(this.f7481a);
            this.f7488e = mo28698a();
            this.f7483a = true;
        }

        /* renamed from: a */
        public void mo28701a(String str, String str2, String str3) {
            this.f7482a = str;
            this.f7484b = str2;
            this.f7490g = str3;
            SharedPreferences.Editor edit = C4475b.m12705a(this.f7481a).edit();
            edit.putString("appId", this.f7482a);
            edit.putString("appToken", str2);
            edit.putString("regResource", str3);
            edit.commit();
        }

        /* renamed from: a */
        public void mo28702a(boolean z) {
            this.f7485b = z;
        }

        /* renamed from: a */
        public boolean m12741a() {
            return mo28700a(this.f7482a, this.f7484b);
        }

        /* renamed from: a */
        public boolean m12742a(String str, String str2) {
            boolean equals = TextUtils.equals(this.f7482a, str);
            boolean equals2 = TextUtils.equals(this.f7484b, str2);
            boolean z = !TextUtils.isEmpty(this.f7486c);
            boolean z2 = !TextUtils.isEmpty(this.f7487d);
            boolean z3 = TextUtils.equals(this.f7489f, C4805j.m14886j(this.f7481a)) || TextUtils.equals(this.f7489f, C4805j.m14885i(this.f7481a));
            boolean z4 = equals && equals2 && z && z2 && z3;
            if (!z4) {
                C4408b.m12484e(String.format("register invalid, aid=%s;atn=%s;rid=%s;rse=%s;did=%s", new Object[]{Boolean.valueOf(equals), Boolean.valueOf(equals2), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3)}));
            }
            return z4;
        }

        /* renamed from: b */
        public void mo28703b() {
            this.f7483a = false;
            C4475b.m12705a(this.f7481a).edit().putBoolean("valid", this.f7483a).commit();
        }

        /* renamed from: b */
        public void mo28704b(String str, String str2, String str3) {
            this.f7486c = str;
            this.f7487d = str2;
            this.f7489f = C4805j.m14886j(this.f7481a);
            this.f7488e = mo28698a();
            this.f7483a = true;
            this.f7491h = str3;
            SharedPreferences.Editor edit = C4475b.m12705a(this.f7481a).edit();
            edit.putString("regId", str);
            edit.putString("regSec", str2);
            edit.putString("devId", this.f7489f);
            edit.putString("vName", mo28698a());
            edit.putBoolean("valid", true);
            edit.putString("appRegion", str3);
            edit.commit();
        }

        /* renamed from: c */
        public void mo28705c(String str, String str2, String str3) {
            this.f7482a = str;
            this.f7484b = str2;
            this.f7490g = str3;
        }
    }

    private C4475b(Context context) {
        this.f7476a = context;
        mo28694c();
    }

    /* renamed from: a */
    public static SharedPreferences m12705a(Context context) {
        return context.getSharedPreferences("mipush", 0);
    }

    /* renamed from: a */
    public static C4475b m12706a(Context context) {
        if (f7475a == null) {
            synchronized (C4475b.class) {
                if (f7475a == null) {
                    f7475a = new C4475b(context);
                }
            }
        }
        return f7475a;
    }

    /* renamed from: c */
    private void mo28694c() {
        this.f7477a = new C4476a(this.f7476a);
        this.f7479a = new HashMap();
        SharedPreferences a = m12705a(this.f7476a);
        this.f7477a.f7482a = a.getString("appId", (String) null);
        this.f7477a.f7484b = a.getString("appToken", (String) null);
        this.f7477a.f7486c = a.getString("regId", (String) null);
        this.f7477a.f7487d = a.getString("regSec", (String) null);
        this.f7477a.f7489f = a.getString("devId", (String) null);
        if (!TextUtils.isEmpty(this.f7477a.f7489f) && C4805j.m14867a(this.f7477a.f7489f)) {
            this.f7477a.f7489f = C4805j.m14886j(this.f7476a);
            a.edit().putString("devId", this.f7477a.f7489f).commit();
        }
        this.f7477a.f7488e = a.getString("vName", (String) null);
        this.f7477a.f7483a = a.getBoolean("valid", true);
        this.f7477a.f7485b = a.getBoolean("paused", false);
        this.f7477a.f7480a = a.getInt("envType", 1);
        this.f7477a.f7490g = a.getString("regResource", (String) null);
        this.f7477a.f7491h = a.getString("appRegion", (String) null);
    }

    /* renamed from: a */
    public int mo28684a() {
        return this.f7477a.f7480a;
    }

    /* renamed from: a */
    public C4476a mo28685a(String str) {
        if (this.f7479a.containsKey(str)) {
            return this.f7479a.get(str);
        }
        String str2 = "hybrid_app_info_" + str;
        SharedPreferences a = m12705a(this.f7476a);
        if (!a.contains(str2)) {
            return null;
        }
        C4476a a2 = C4476a.m12733a(this.f7476a, a.getString(str2, ""));
        this.f7479a.put(str2, a2);
        return a2;
    }

    /* renamed from: a */
    public String m12710a() {
        return this.f7477a.f7482a;
    }

    /* renamed from: a */
    public void m12711a() {
        this.f7477a.mo28698a();
    }

    /* renamed from: a */
    public void mo28686a(int i) {
        this.f7477a.mo28699a(i);
        m12705a(this.f7476a).edit().putInt("envType", i).commit();
    }

    /* renamed from: a */
    public void m12713a(String str) {
        SharedPreferences.Editor edit = m12705a(this.f7476a).edit();
        edit.putString("vName", str);
        edit.commit();
        this.f7477a.f7488e = str;
    }

    /* renamed from: a */
    public void mo28687a(String str, C4476a aVar) {
        this.f7479a.put(str, aVar);
        String a = C4476a.m12735a(aVar);
        m12705a(this.f7476a).edit().putString("hybrid_app_info_" + str, a).commit();
    }

    /* renamed from: a */
    public void mo28688a(String str, String str2, String str3) {
        this.f7477a.mo28701a(str, str2, str3);
    }

    /* renamed from: a */
    public void mo28689a(boolean z) {
        this.f7477a.mo28702a(z);
        m12705a(this.f7476a).edit().putBoolean("paused", z).commit();
    }

    /* renamed from: a */
    public boolean m12717a() {
        Context context = this.f7476a;
        return !TextUtils.equals(C4747h.m14123a(context, context.getPackageName()), this.f7477a.f7488e);
    }

    /* renamed from: a */
    public boolean mo28690a(String str, String str2) {
        return this.f7477a.mo28700a(str, str2);
    }

    /* renamed from: a */
    public boolean m12719a(String str, String str2, String str3) {
        C4476a a = mo28685a(str3);
        return a != null && TextUtils.equals(str, a.f7482a) && TextUtils.equals(str2, a.f7484b);
    }

    /* renamed from: b */
    public String mo28691b() {
        return this.f7477a.f7484b;
    }

    /* renamed from: b */
    public void m12721b() {
        this.f7477a.mo28703b();
    }

    /* renamed from: b */
    public void mo28692b(String str) {
        this.f7479a.remove(str);
        m12705a(this.f7476a).edit().remove("hybrid_app_info_" + str).commit();
    }

    /* renamed from: b */
    public void mo28693b(String str, String str2, String str3) {
        this.f7477a.mo28704b(str, str2, str3);
    }

    /* renamed from: b */
    public boolean m12724b() {
        if (this.f7477a.mo28698a()) {
            return true;
        }
        C4408b.m12464a("Don't send message before initialization succeeded!");
        return false;
    }

    /* renamed from: c */
    public String m12725c() {
        return this.f7477a.f7486c;
    }

    /* renamed from: c */
    public boolean m12726c() {
        return this.f7477a.mo28698a();
    }

    /* renamed from: d */
    public String mo28695d() {
        return this.f7477a.f7487d;
    }

    /* renamed from: d */
    public boolean m12728d() {
        return !TextUtils.isEmpty(this.f7477a.f7482a) && !TextUtils.isEmpty(this.f7477a.f7484b) && !TextUtils.isEmpty(this.f7477a.f7486c) && !TextUtils.isEmpty(this.f7477a.f7487d);
    }

    /* renamed from: e */
    public String mo28696e() {
        return this.f7477a.f7490g;
    }

    /* renamed from: e */
    public boolean m12730e() {
        return this.f7477a.f7485b;
    }

    /* renamed from: f */
    public String mo28697f() {
        return this.f7477a.f7491h;
    }

    /* renamed from: f */
    public boolean m12732f() {
        return !this.f7477a.f7483a;
    }
}

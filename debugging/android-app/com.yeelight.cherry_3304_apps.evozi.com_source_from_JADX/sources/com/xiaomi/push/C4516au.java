package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import java.util.Map;

/* renamed from: com.xiaomi.push.au */
public class C4516au implements C4513ar {

    /* renamed from: a */
    private static volatile C4516au f8189a;

    /* renamed from: a */
    private C4513ar f8190a;

    private C4516au(Context context) {
        this.f8190a = C4515at.m13332a(context);
        C3989b.m10669a("create id manager is: " + this.f8190a);
    }

    /* renamed from: a */
    public static C4516au m13333a(Context context) {
        if (f8189a == null) {
            synchronized (C4516au.class) {
                if (f8189a == null) {
                    f8189a = new C4516au(context.getApplicationContext());
                }
            }
        }
        return f8189a;
    }

    /* renamed from: a */
    private String m13334a(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: a */
    public String mo24744a() {
        return m13334a(this.f8190a.mo24744a());
    }

    /* renamed from: a */
    public void mo24750a(Map<String, String> map) {
        if (map != null) {
            String a = mo24744a();
            if (!TextUtils.isEmpty(a)) {
                map.put("udid", a);
            }
            String b = mo24745b();
            if (!TextUtils.isEmpty(b)) {
                map.put("oaid", b);
            }
            String c = mo24746c();
            if (!TextUtils.isEmpty(c)) {
                map.put("vaid", c);
            }
            String d = mo24747d();
            if (!TextUtils.isEmpty(d)) {
                map.put("aaid", d);
            }
        }
    }

    /* renamed from: a */
    public boolean m13337a() {
        return this.f8190a.mo24744a();
    }

    /* renamed from: b */
    public String mo24745b() {
        return m13334a(this.f8190a.mo24745b());
    }

    /* renamed from: c */
    public String mo24746c() {
        return m13334a(this.f8190a.mo24746c());
    }

    /* renamed from: d */
    public String mo24747d() {
        return m13334a(this.f8190a.mo24747d());
    }
}

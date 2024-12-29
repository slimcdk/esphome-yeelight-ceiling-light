package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import java.util.Map;

/* renamed from: com.xiaomi.push.ba */
public class C4539ba implements C4531au {

    /* renamed from: a */
    private static volatile C4539ba f7619a;

    /* renamed from: a */
    private int f7620a = C4537az.f7607a;

    /* renamed from: a */
    private C4531au f7621a;

    private C4539ba(Context context) {
        this.f7621a = C4537az.m12923a(context);
        C4408b.m12464a("create id manager is: " + this.f7620a);
    }

    /* renamed from: a */
    public static C4539ba m12950a(Context context) {
        if (f7619a == null) {
            synchronized (C4539ba.class) {
                if (f7619a == null) {
                    f7619a = new C4539ba(context.getApplicationContext());
                }
            }
        }
        return f7619a;
    }

    /* renamed from: a */
    private String m12951a(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: a */
    public String mo28753a() {
        return m12951a(this.f7621a.mo28753a());
    }

    /* renamed from: a */
    public void m12953a() {
    }

    /* renamed from: a */
    public void mo28767a(Map<String, String> map) {
        if (map != null) {
            String b = mo28768b();
            if (!TextUtils.isEmpty(b)) {
                map.put("udid", b);
            }
            String a = mo28753a();
            if (!TextUtils.isEmpty(a)) {
                map.put("oaid", a);
            }
            String c = mo28769c();
            if (!TextUtils.isEmpty(c)) {
                map.put("vaid", c);
            }
            String d = mo28770d();
            if (!TextUtils.isEmpty(d)) {
                map.put("aaid", d);
            }
            map.put("oaid_type", String.valueOf(this.f7620a));
        }
    }

    /* renamed from: a */
    public boolean m12955a() {
        return this.f7621a.mo28753a();
    }

    /* renamed from: b */
    public String mo28768b() {
        return null;
    }

    /* renamed from: c */
    public String mo28769c() {
        return null;
    }

    /* renamed from: d */
    public String mo28770d() {
        return null;
    }
}

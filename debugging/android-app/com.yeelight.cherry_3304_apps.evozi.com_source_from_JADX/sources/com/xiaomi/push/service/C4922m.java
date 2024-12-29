package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4532bf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.xiaomi.push.service.m */
public class C4922m {

    /* renamed from: a */
    private static C4922m f10166a;

    /* renamed from: a */
    private Context f10167a;

    /* renamed from: a */
    private List<String> f10168a = new ArrayList();

    /* renamed from: b */
    private final List<String> f10169b = new ArrayList();

    /* renamed from: c */
    private final List<String> f10170c = new ArrayList();

    private C4922m(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f10167a = applicationContext;
        if (applicationContext == null) {
            this.f10167a = context;
        }
        SharedPreferences sharedPreferences = this.f10167a.getSharedPreferences("mipush_app_info", 0);
        for (String str : sharedPreferences.getString("unregistered_pkg_names", "").split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            if (TextUtils.isEmpty(str)) {
                this.f10168a.add(str);
            }
        }
        for (String str2 : sharedPreferences.getString("disable_push_pkg_names", "").split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            if (!TextUtils.isEmpty(str2)) {
                this.f10169b.add(str2);
            }
        }
        for (String str3 : sharedPreferences.getString("disable_push_pkg_names_cache", "").split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            if (!TextUtils.isEmpty(str3)) {
                this.f10170c.add(str3);
            }
        }
    }

    /* renamed from: a */
    public static C4922m m15798a(Context context) {
        if (f10166a == null) {
            f10166a = new C4922m(context);
        }
        return f10166a;
    }

    /* renamed from: a */
    public void mo25992a(String str) {
        synchronized (this.f10168a) {
            if (!this.f10168a.contains(str)) {
                this.f10168a.add(str);
                this.f10167a.getSharedPreferences("mipush_app_info", 0).edit().putString("unregistered_pkg_names", C4532bf.m13433a((Collection<?>) this.f10168a, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }

    /* renamed from: a */
    public boolean m15800a(String str) {
        boolean contains;
        synchronized (this.f10168a) {
            contains = this.f10168a.contains(str);
        }
        return contains;
    }

    /* renamed from: b */
    public void mo25993b(String str) {
        synchronized (this.f10169b) {
            if (!this.f10169b.contains(str)) {
                this.f10169b.add(str);
                this.f10167a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names", C4532bf.m13433a((Collection<?>) this.f10169b, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }

    /* renamed from: b */
    public boolean m15802b(String str) {
        boolean contains;
        synchronized (this.f10169b) {
            contains = this.f10169b.contains(str);
        }
        return contains;
    }

    /* renamed from: c */
    public void mo25994c(String str) {
        synchronized (this.f10170c) {
            if (!this.f10170c.contains(str)) {
                this.f10170c.add(str);
                this.f10167a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", C4532bf.m13433a((Collection<?>) this.f10170c, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }

    /* renamed from: c */
    public boolean m15804c(String str) {
        boolean contains;
        synchronized (this.f10170c) {
            contains = this.f10170c.contains(str);
        }
        return contains;
    }

    /* renamed from: d */
    public void mo25995d(String str) {
        synchronized (this.f10168a) {
            if (this.f10168a.contains(str)) {
                this.f10168a.remove(str);
                this.f10167a.getSharedPreferences("mipush_app_info", 0).edit().putString("unregistered_pkg_names", C4532bf.m13433a((Collection<?>) this.f10168a, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }

    /* renamed from: e */
    public void mo25996e(String str) {
        synchronized (this.f10169b) {
            if (this.f10169b.contains(str)) {
                this.f10169b.remove(str);
                this.f10167a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names", C4532bf.m13433a((Collection<?>) this.f10169b, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }

    /* renamed from: f */
    public void mo25997f(String str) {
        synchronized (this.f10170c) {
            if (this.f10170c.contains(str)) {
                this.f10170c.remove(str);
                this.f10167a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", C4532bf.m13433a((Collection<?>) this.f10170c, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }
}

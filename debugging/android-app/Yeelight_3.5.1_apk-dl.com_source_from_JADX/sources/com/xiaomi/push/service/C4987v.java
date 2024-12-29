package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4561bp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.xiaomi.push.service.v */
public class C4987v {

    /* renamed from: a */
    private static C4987v f9749a;

    /* renamed from: a */
    private Context f9750a;

    /* renamed from: a */
    private List<String> f9751a = new ArrayList();

    /* renamed from: b */
    private final List<String> f9752b = new ArrayList();

    /* renamed from: c */
    private final List<String> f9753c = new ArrayList();

    private C4987v(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f9750a = applicationContext;
        if (applicationContext == null) {
            this.f9750a = context;
        }
        SharedPreferences sharedPreferences = this.f9750a.getSharedPreferences("mipush_app_info", 0);
        for (String str : sharedPreferences.getString("unregistered_pkg_names", "").split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            if (TextUtils.isEmpty(str)) {
                this.f9751a.add(str);
            }
        }
        for (String str2 : sharedPreferences.getString("disable_push_pkg_names", "").split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            if (!TextUtils.isEmpty(str2)) {
                this.f9752b.add(str2);
            }
        }
        for (String str3 : sharedPreferences.getString("disable_push_pkg_names_cache", "").split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            if (!TextUtils.isEmpty(str3)) {
                this.f9753c.add(str3);
            }
        }
    }

    /* renamed from: a */
    public static C4987v m15686a(Context context) {
        if (f9749a == null) {
            f9749a = new C4987v(context);
        }
        return f9749a;
    }

    /* renamed from: a */
    public void mo30085a(String str) {
        synchronized (this.f9751a) {
            if (!this.f9751a.contains(str)) {
                this.f9751a.add(str);
                this.f9750a.getSharedPreferences("mipush_app_info", 0).edit().putString("unregistered_pkg_names", C4561bp.m13044a((Collection<?>) this.f9751a, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }

    /* renamed from: a */
    public boolean m15688a(String str) {
        boolean contains;
        synchronized (this.f9751a) {
            contains = this.f9751a.contains(str);
        }
        return contains;
    }

    /* renamed from: b */
    public void mo30086b(String str) {
        synchronized (this.f9752b) {
            if (!this.f9752b.contains(str)) {
                this.f9752b.add(str);
                this.f9750a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names", C4561bp.m13044a((Collection<?>) this.f9752b, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }

    /* renamed from: b */
    public boolean m15690b(String str) {
        boolean contains;
        synchronized (this.f9752b) {
            contains = this.f9752b.contains(str);
        }
        return contains;
    }

    /* renamed from: c */
    public void mo30087c(String str) {
        synchronized (this.f9753c) {
            if (!this.f9753c.contains(str)) {
                this.f9753c.add(str);
                this.f9750a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", C4561bp.m13044a((Collection<?>) this.f9753c, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }

    /* renamed from: c */
    public boolean m15692c(String str) {
        boolean contains;
        synchronized (this.f9753c) {
            contains = this.f9753c.contains(str);
        }
        return contains;
    }

    /* renamed from: d */
    public void mo30088d(String str) {
        synchronized (this.f9751a) {
            if (this.f9751a.contains(str)) {
                this.f9751a.remove(str);
                this.f9750a.getSharedPreferences("mipush_app_info", 0).edit().putString("unregistered_pkg_names", C4561bp.m13044a((Collection<?>) this.f9751a, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }

    /* renamed from: e */
    public void mo30089e(String str) {
        synchronized (this.f9752b) {
            if (this.f9752b.contains(str)) {
                this.f9752b.remove(str);
                this.f9750a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names", C4561bp.m13044a((Collection<?>) this.f9752b, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }

    /* renamed from: f */
    public void mo30090f(String str) {
        synchronized (this.f9753c) {
            if (this.f9753c.contains(str)) {
                this.f9753c.remove(str);
                this.f9750a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", C4561bp.m13044a((Collection<?>) this.f9753c, Constants.ACCEPT_TIME_SEPARATOR_SP)).commit();
            }
        }
    }
}

package com.yeelight.yeelib.utils;

import android.os.Build;
import android.os.LocaleList;
import com.yeelight.yeelib.p152f.C4297y;
import java.util.Locale;

/* renamed from: com.yeelight.yeelib.utils.q */
public class C10550q {

    /* renamed from: c */
    private static C10550q f20169c;

    /* renamed from: a */
    private Locale f20170a;

    /* renamed from: b */
    private LocaleList f20171b;

    private C10550q() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f20171b = LocaleList.getDefault();
        }
    }

    /* renamed from: b */
    public static C10550q m25766b() {
        synchronized (C10550q.class) {
            if (f20169c == null) {
                f20169c = new C10550q();
            }
        }
        return f20169c;
    }

    /* renamed from: a */
    public Locale mo33378a() {
        Locale locale;
        LocaleList localeList;
        Locale locale2 = this.f20170a;
        if (locale2 != null) {
            return locale2;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList localeList2 = this.f20171b;
            if (localeList2 == null || localeList2.size() <= 0) {
                this.f20171b = LocaleList.getDefault();
                localeList = C4297y.f7456e.getResources().getConfiguration().getLocales();
            } else {
                localeList = this.f20171b;
            }
            locale = localeList.get(0);
        } else {
            locale = Locale.getDefault();
        }
        this.f20170a = locale;
        return locale;
    }

    /* renamed from: c */
    public String mo33379c() {
        return mo33378a().getLanguage() + "_" + mo33378a().getCountry();
    }
}

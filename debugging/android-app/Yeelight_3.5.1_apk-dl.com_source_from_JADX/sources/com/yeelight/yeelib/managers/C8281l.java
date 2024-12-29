package com.yeelight.yeelib.managers;

import android.text.TextUtils;
import com.miot.api.MiotManager;
import com.miot.common.config.AppConfiguration;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p051j4.C9196o;

/* renamed from: com.yeelight.yeelib.managers.l */
public class C8281l {

    /* renamed from: b */
    private static C8281l f14200b;

    /* renamed from: a */
    private List<C3080a> f14201a = new ArrayList();

    /* renamed from: com.yeelight.yeelib.managers.l$a */
    public interface C3080a {
        /* renamed from: c */
        void mo23281c(String str);
    }

    private C8281l() {
    }

    /* renamed from: b */
    public static C8281l m19542b() {
        if (f14200b == null) {
            f14200b = new C8281l();
        }
        return f14200b;
    }

    /* renamed from: d */
    private void m19543d(String str) {
        if (C3051a.m7928z()) {
            for (C3080a c : this.f14201a) {
                c.mo23281c(str);
            }
        }
    }

    /* renamed from: a */
    public String mo35223a() {
        return C3108x.f4951e.getSharedPreferences("locale", 0).getString("locale", "");
    }

    /* renamed from: c */
    public String mo35224c() {
        Locale a = C9196o.m22165b().mo37277a();
        String country = a.getCountry();
        if (!TextUtils.equals(a.getLanguage(), "zh") && (!TextUtils.equals(a.getLanguage(), "pt") || !TextUtils.equals(country, "BR"))) {
            return a.getLanguage();
        }
        return a.getLanguage() + "_" + country;
    }

    /* renamed from: e */
    public void mo35225e(C3080a aVar) {
        if (aVar != null) {
            this.f14201a.add(aVar);
            aVar.mo23281c(mo35223a());
        }
    }

    /* renamed from: f */
    public void mo35226f(AppConfiguration.Locale locale) {
        C3108x.f4951e.getSharedPreferences("locale", 0).edit().putString("locale", locale.name()).commit();
        MiotManager.getInstance().setLocale(locale);
        AppUtils.m8304y();
        m19543d(locale.name());
    }

    /* renamed from: g */
    public void mo35227g(C3080a aVar) {
        if (this.f14201a.contains(aVar)) {
            this.f14201a.remove(aVar);
        }
    }
}

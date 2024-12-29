package com.yeelight.yeelib.p152f;

import android.text.TextUtils;
import com.miot.api.MiotManager;
import com.miot.common.config.AppConfiguration;
import com.yeelight.yeelib.utils.C10550q;
import com.yeelight.yeelib.utils.C4308b;
import com.yeelight.yeelib.utils.C4310h;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.yeelight.yeelib.f.l */
public class C4230l {

    /* renamed from: b */
    private static C4230l f7343b;

    /* renamed from: a */
    private List<C4231a> f7344a = new ArrayList();

    /* renamed from: com.yeelight.yeelib.f.l$a */
    public interface C4231a {
        /* renamed from: c */
        void mo23557c(String str);
    }

    private C4230l() {
    }

    /* renamed from: b */
    public static C4230l m11766b() {
        if (f7343b == null) {
            f7343b = new C4230l();
        }
        return f7343b;
    }

    /* renamed from: d */
    private void m11767d(String str) {
        if (C4201a.m11610z()) {
            for (C4231a c : this.f7344a) {
                c.mo23557c(str);
            }
        }
    }

    /* renamed from: a */
    public String mo23552a() {
        return C4297y.f7456e.getSharedPreferences("locale", 0).getString("locale", "");
    }

    /* renamed from: c */
    public String mo23553c() {
        Locale a = C10550q.m25766b().mo33378a();
        String country = a.getCountry();
        if (!TextUtils.equals(a.getLanguage(), "zh") && (!TextUtils.equals(a.getLanguage(), "pt") || !TextUtils.equals(country, "BR"))) {
            return a.getLanguage();
        }
        return a.getLanguage() + "_" + country;
    }

    /* renamed from: e */
    public void mo23554e(C4231a aVar) {
        if (aVar != null) {
            this.f7344a.add(aVar);
            aVar.mo23557c(mo23552a());
        }
    }

    /* renamed from: f */
    public void mo23555f(AppConfiguration.Locale locale) {
        C4297y.f7456e.getSharedPreferences("locale", 0).edit().putString("locale", locale.name()).commit();
        MiotManager.getInstance().setLocale(locale);
        if (!C4308b.f7482a) {
            C4310h.m12148d("Server", locale.name());
        }
        C4308b.m12142u();
        m11767d(locale.name());
    }

    /* renamed from: g */
    public void mo23556g(C4231a aVar) {
        if (this.f7344a.contains(aVar)) {
            this.f7344a.remove(aVar);
        }
    }
}

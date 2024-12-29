package com.yeelight.yeelib.managers;

import android.os.Build;
import android.text.TextUtils;
import com.miot.api.Constants;
import com.yeelight.yeelib.data.AppConfigurationProvider;
import com.yeelight.yeelib.utils.AppUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;
import p129b4.C3988b;
import p134c4.C4007b;

/* renamed from: com.yeelight.yeelib.managers.s */
public class C3092s {

    /* renamed from: c */
    private static C3092s f4927c;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f4928a = 1;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3095c f4929b;

    /* renamed from: com.yeelight.yeelib.managers.s$a */
    class C3093a implements C4007b<String> {
        C3093a() {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("queryRatingDestination, onSuccess, response: ");
            sb.append(str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getInt("code") == 1) {
                    int unused = C3092s.this.f4928a = jSONObject.getInt(Constants.EXTRA_PUSH_MESSAGE);
                    if (C3092s.this.f4929b != null) {
                        C3092s.this.f4929b.mo23503D();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("queryRatingDestination, onFailure, response: ");
            sb.append(str);
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.s$b */
    class C3094b implements C4007b<String> {

        /* renamed from: a */
        final /* synthetic */ int f4931a;

        C3094b(int i) {
            this.f4931a = i;
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("rateInnerScore, onSuccess, response: ");
            sb.append(str);
            C3092s.this.f4929b.mo23505z(this.f4931a);
        }

        public void onFailure(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("rateInnerScore, onFailure, response: ");
            sb.append(str);
            C3092s.this.f4929b.mo23504u();
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.s$c */
    public interface C3095c {
        /* renamed from: D */
        void mo23503D();

        /* renamed from: u */
        void mo23504u();

        /* renamed from: z */
        void mo23505z(int i);
    }

    private C3092s() {
    }

    /* renamed from: d */
    public static String m8138d() {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));
    }

    /* renamed from: f */
    public static C3092s m8139f() {
        if (f4927c == null) {
            f4927c = new C3092s();
        }
        return f4927c;
    }

    /* renamed from: l */
    private boolean m8140l() {
        String i = mo23486i();
        StringBuilder sb = new StringBuilder();
        sb.append("ratedVersion = ");
        sb.append(i);
        sb.append("， current version = ");
        sb.append(AppUtils.m8283d());
        return !TextUtils.isEmpty(i) && i.equals(AppUtils.m8283d());
    }

    /* renamed from: n */
    private boolean m8141n() {
        if (TextUtils.isEmpty(mo23485h())) {
            return true;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parse = simpleDateFormat.parse(simpleDateFormat.format(new Date(System.currentTimeMillis())));
            String h = mo23485h();
            long time = TextUtils.isEmpty(h) ? 0 : simpleDateFormat.parse(h).getTime();
            StringBuilder sb = new StringBuilder();
            sb.append("currentData = ");
            sb.append(parse.getTime());
            sb.append(", rateData = ");
            sb.append(time);
            return (parse.getTime() - time) / 86400000 >= 60;
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    public String mo23482c() {
        return AppConfigurationProvider.m17574f("app_last_start_time");
    }

    /* renamed from: e */
    public int mo23483e() {
        String f = AppConfigurationProvider.m17574f("rating_yeelight_external");
        StringBuilder sb = new StringBuilder();
        sb.append("getExternal rating index = ");
        sb.append(f);
        if (TextUtils.isEmpty(f)) {
            return 0;
        }
        return Integer.valueOf(f).intValue();
    }

    /* renamed from: g */
    public int mo23484g() {
        String f = AppConfigurationProvider.m17574f("rating_yeelight_internal");
        StringBuilder sb = new StringBuilder();
        sb.append("getInternal rating index = ");
        sb.append(f);
        if (TextUtils.isEmpty(f)) {
            return 0;
        }
        return Integer.valueOf(f).intValue();
    }

    /* renamed from: h */
    public String mo23485h() {
        return AppConfigurationProvider.m17574f("user_rating_time");
    }

    /* renamed from: i */
    public String mo23486i() {
        return AppConfigurationProvider.m17574f("user_rating_app_version");
    }

    /* renamed from: j */
    public int mo23487j() {
        String f = AppConfigurationProvider.m17574f("user_rating_threshold");
        StringBuilder sb = new StringBuilder();
        sb.append("getUser Rating threshold = ");
        sb.append(f);
        if (!TextUtils.isEmpty(f)) {
            return Integer.valueOf(f).intValue();
        }
        mo23500y(10);
        return 10;
    }

    /* renamed from: k */
    public int mo23488k() {
        return this.f4928a;
    }

    /* renamed from: m */
    public boolean mo23489m() {
        boolean z = (this.f4928a == 1 ? mo23484g() : mo23483e()) >= mo23487j();
        boolean l = m8140l();
        boolean n = m8141n();
        StringBuilder sb = new StringBuilder();
        sb.append("isReachThreshold = ");
        sb.append(z);
        sb.append(", isCurrentVersionRated = ");
        sb.append(l);
        sb.append(", isRatedTimeOverSixMonth = ");
        sb.append(n);
        return z && !l && n;
    }

    /* renamed from: o */
    public void mo23490o() {
        String str = AppUtils.f4993q + "android/score_type/" + AppUtils.m8283d();
        StringBuilder sb = new StringBuilder();
        sb.append("queryRatingDestination, url = ");
        sb.append(str);
        C3988b.m11567c(str, String.class, new C3093a());
    }

    /* renamed from: p */
    public void mo23491p(int i) {
        String str = AppUtils.f4993q + "inner_score/create/";
        StringBuilder sb = new StringBuilder();
        sb.append("queryRatingDestination, url = ");
        sb.append(str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_uuid", AppUtils.m8281b());
            jSONObject.put("mid", C3051a.m7925r().mo23366v());
            jSONObject.put("os", "android");
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("phone_model", Build.MODEL);
            jSONObject.put("score", i);
            jSONObject.put(com.xiaomi.mipush.sdk.Constants.EXTRA_KEY_APP_VERSION, AppUtils.m8283d());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("value = ");
            sb2.append(jSONObject.toString());
            C3988b.m11572h(str, jSONObject.toString(), String.class, new C3094b(i));
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("rateInnerScore, onFailure : ");
            sb3.append(e.toString());
            sb3.append(", message = ");
            sb3.append(e.getMessage());
            e.printStackTrace();
        }
    }

    /* renamed from: q */
    public void mo23492q(C3095c cVar) {
        this.f4929b = cVar;
    }

    /* renamed from: r */
    public void mo23493r() {
        mo23496u(0);
        mo23495t(0);
    }

    /* renamed from: s */
    public void mo23494s() {
        this.f4929b = null;
    }

    /* renamed from: t */
    public void mo23495t(int i) {
        AppConfigurationProvider.m17582n("rating_yeelight_external", String.valueOf(i));
    }

    /* renamed from: u */
    public void mo23496u(int i) {
        AppConfigurationProvider.m17582n("rating_yeelight_internal", String.valueOf(i));
    }

    /* renamed from: v */
    public void mo23497v() {
        AppConfigurationProvider.m17582n("user_rating_app_version", AppUtils.m8283d());
    }

    /* renamed from: w */
    public void mo23498w() {
        StringBuilder sb = new StringBuilder();
        sb.append("current data = ");
        sb.append(m8138d());
        sb.append(" , last time = ");
        sb.append(mo23482c());
        if (AppUtils.f4977a) {
            int g = mo23484g();
            int e = mo23483e();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("updateRatingIndex, internal = ");
            sb2.append(g);
            sb2.append(", external = ");
            sb2.append(e);
            mo23496u(g + 1);
            mo23495t(e + 1);
        } else if (!m8138d().equals(mo23482c())) {
            int g2 = mo23484g();
            int e2 = mo23483e();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("updateRatingIndex, internal = ");
            sb3.append(g2);
            sb3.append(", external = ");
            sb3.append(e2);
            mo23496u(g2 + 1);
            mo23495t(e2 + 1);
        }
    }

    /* renamed from: x */
    public void mo23499x() {
        AppConfigurationProvider.m17582n("app_last_start_time", m8138d());
    }

    /* renamed from: y */
    public void mo23500y(int i) {
        AppConfigurationProvider.m17582n("user_rating_threshold", String.valueOf(i));
    }
}

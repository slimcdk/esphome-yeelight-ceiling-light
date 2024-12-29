package com.yeelight.yeelib.p152f;

import android.os.Build;
import android.text.TextUtils;
import com.miot.api.Constants;
import com.xiaomi.mistatistic.sdk.MiStatInterface;
import com.yeelight.yeelib.data.AppConfigurationProvider;
import com.yeelight.yeelib.p187h.C9862d;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import com.yeelight.yeelib.utils.C4308b;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.f.s */
public class C4243s {

    /* renamed from: c */
    private static C4243s f7371c;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f7372a = 1;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4246c f7373b;

    /* renamed from: com.yeelight.yeelib.f.s$a */
    class C4244a implements C9874b<String> {
        C4244a() {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            "queryRatingDestination, onSuccess, response: " + str;
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getInt("code") == 1) {
                    int unused = C4243s.this.f7372a = jSONObject.getInt(Constants.EXTRA_PUSH_MESSAGE);
                    if (C4243s.this.f7373b != null) {
                        C4243s.this.f7373b.mo23610D();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            "queryRatingDestination, onFailure, response: " + str;
        }
    }

    /* renamed from: com.yeelight.yeelib.f.s$b */
    class C4245b implements C9874b<String> {

        /* renamed from: a */
        final /* synthetic */ int f7375a;

        C4245b(int i) {
            this.f7375a = i;
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            "rateInnerScore, onSuccess, response: " + str;
            C4243s.this.f7373b.mo23612z(this.f7375a);
        }

        public void onFailure(int i, String str) {
            "rateInnerScore, onFailure, response: " + str;
            C4243s.this.f7373b.mo23611u();
        }
    }

    /* renamed from: com.yeelight.yeelib.f.s$c */
    public interface C4246c {
        /* renamed from: D */
        void mo23610D();

        /* renamed from: u */
        void mo23611u();

        /* renamed from: z */
        void mo23612z(int i);
    }

    private C4243s() {
    }

    /* renamed from: d */
    public static String m11828d() {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));
    }

    /* renamed from: f */
    public static C4243s m11829f() {
        if (f7371c == null) {
            f7371c = new C4243s();
        }
        return f7371c;
    }

    /* renamed from: l */
    private boolean m11830l() {
        String i = mo23593i();
        "ratedVersion = " + i + "， current version = " + C4308b.m12125d();
        return !TextUtils.isEmpty(i) && i.equals(C4308b.m12125d());
    }

    /* renamed from: n */
    private boolean m11831n() {
        if (TextUtils.isEmpty(mo23592h())) {
            return true;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parse = simpleDateFormat.parse(simpleDateFormat.format(new Date(System.currentTimeMillis())));
            String h = mo23592h();
            long time = TextUtils.isEmpty(h) ? 0 : simpleDateFormat.parse(h).getTime();
            "currentData = " + parse.getTime() + ", rateData = " + time;
            return (parse.getTime() - time) / MiStatInterface.MAX_UPLOAD_INTERVAL >= 60;
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    public String mo23589c() {
        return AppConfigurationProvider.m22353f("app_last_start_time");
    }

    /* renamed from: e */
    public int mo23590e() {
        String f = AppConfigurationProvider.m22353f("rating_yeelight_external");
        "getExternal rating index = " + f;
        if (TextUtils.isEmpty(f)) {
            return 0;
        }
        return Integer.valueOf(f).intValue();
    }

    /* renamed from: g */
    public int mo23591g() {
        String f = AppConfigurationProvider.m22353f("rating_yeelight_internal");
        "getInternal rating index = " + f;
        if (TextUtils.isEmpty(f)) {
            return 0;
        }
        return Integer.valueOf(f).intValue();
    }

    /* renamed from: h */
    public String mo23592h() {
        return AppConfigurationProvider.m22353f("user_rating_time");
    }

    /* renamed from: i */
    public String mo23593i() {
        return AppConfigurationProvider.m22353f("user_rating_app_version");
    }

    /* renamed from: j */
    public int mo23594j() {
        String f = AppConfigurationProvider.m22353f("user_rating_threshold");
        "getUser Rating threshold = " + f;
        if (!TextUtils.isEmpty(f)) {
            return Integer.valueOf(f).intValue();
        }
        mo23607y(10);
        return 10;
    }

    /* renamed from: k */
    public int mo23595k() {
        return this.f7372a;
    }

    /* renamed from: m */
    public boolean mo23596m() {
        boolean z = (this.f7372a == 1 ? mo23591g() : mo23590e()) >= mo23594j();
        boolean l = m11830l();
        boolean n = m11831n();
        "isReachThreshold = " + z + ", isCurrentVersionRated = " + l + ", isRatedTimeOverSixMonth = " + n;
        return z && !l && n;
    }

    /* renamed from: o */
    public void mo23597o() {
        String str = C4308b.f7492k + "android/score_type/" + C4308b.m12125d();
        "queryRatingDestination, url = " + str;
        C9862d.m24133c(str, String.class, new C4244a());
    }

    /* renamed from: p */
    public void mo23598p(int i) {
        String str = C4308b.f7492k + "inner_score/create/";
        "queryRatingDestination, url = " + str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_uuid", C4308b.m12123b());
            jSONObject.put("mid", C4201a.m11607r().mo23452v());
            jSONObject.put("os", "android");
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("phone_model", Build.MODEL);
            jSONObject.put("score", i);
            jSONObject.put(com.xiaomi.mipush.sdk.Constants.EXTRA_KEY_APP_VERSION, C4308b.m12125d());
            "value = " + jSONObject.toString();
            C9862d.m24138h(str, jSONObject.toString(), String.class, new C4245b(i));
        } catch (Exception e) {
            "rateInnerScore, onFailure : " + e.toString() + ", message = " + e.getMessage();
            e.printStackTrace();
        }
    }

    /* renamed from: q */
    public void mo23599q(C4246c cVar) {
        this.f7373b = cVar;
    }

    /* renamed from: r */
    public void mo23600r() {
        mo23603u(0);
        mo23602t(0);
    }

    /* renamed from: s */
    public void mo23601s() {
        this.f7373b = null;
    }

    /* renamed from: t */
    public void mo23602t(int i) {
        AppConfigurationProvider.m22361n("rating_yeelight_external", String.valueOf(i));
    }

    /* renamed from: u */
    public void mo23603u(int i) {
        AppConfigurationProvider.m22361n("rating_yeelight_internal", String.valueOf(i));
    }

    /* renamed from: v */
    public void mo23604v() {
        AppConfigurationProvider.m22361n("user_rating_app_version", C4308b.m12125d());
    }

    /* renamed from: w */
    public void mo23605w() {
        "current data = " + m11828d() + " , last time = " + mo23589c();
        if (C4308b.f7482a) {
            int g = mo23591g();
            int e = mo23590e();
            "updateRatingIndex, internal = " + g + ", external = " + e;
            mo23603u(g + 1);
            mo23602t(e + 1);
        } else if (!m11828d().equals(mo23589c())) {
            int g2 = mo23591g();
            int e2 = mo23590e();
            "updateRatingIndex, internal = " + g2 + ", external = " + e2;
            mo23603u(g2 + 1);
            mo23602t(e2 + 1);
        }
    }

    /* renamed from: x */
    public void mo23606x() {
        AppConfigurationProvider.m22361n("app_last_start_time", m11828d());
    }

    /* renamed from: y */
    public void mo23607y(int i) {
        AppConfigurationProvider.m22361n("user_rating_threshold", String.valueOf(i));
    }
}

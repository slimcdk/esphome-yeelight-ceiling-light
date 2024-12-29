package p051j4;

import android.content.SharedPreferences;
import android.os.Build;
import com.google.gson.C2530m;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.device.C6119c;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.models.C8318j;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p129b4.C3988b;
import p134c4.C4007b;

/* renamed from: j4.l */
public class C3280l implements C3051a.C3052i {

    /* renamed from: f */
    private static C3280l f5286f = null;

    /* renamed from: g */
    public static int f5287g = 0;

    /* renamed from: h */
    public static long f5288h = 0;

    /* renamed from: i */
    public static boolean f5289i = false;

    /* renamed from: j */
    public static boolean f5290j = false;

    /* renamed from: a */
    public List<C8318j> f5291a = new ArrayList();

    /* renamed from: b */
    public int f5292b = 0;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public SharedPreferences f5293c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List<C3282b> f5294d = new ArrayList();

    /* renamed from: e */
    C4007b<String> f5295e = new C3281a();

    /* renamed from: j4.l$a */
    class C3281a implements C4007b<String> {
        C3281a() {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            String str2 = str;
            StringBuilder sb = new StringBuilder();
            sb.append("onsuccess ");
            sb.append(str2);
            try {
                JSONObject jSONObject = new JSONObject(str2);
                C3280l.this.f5292b = jSONObject.getInt("total");
                long j = jSONObject.getLong("last_reply");
                long j2 = jSONObject.getLong("last_query");
                C3280l lVar = C3280l.this;
                if (!(lVar.f5292b == 0 || j2 == 0)) {
                    long j3 = lVar.f5293c.getLong("last_reply", 0);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("local saved lastReply = ");
                    sb2.append(j3);
                    sb2.append(", server return lastReply = ");
                    sb2.append(j);
                    C3280l.f5288h = j;
                    C3280l.f5290j = j > j3;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("has new feedback?");
                    sb3.append(C3280l.f5290j);
                    SharedPreferences a = C3280l.this.f5293c;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("reply");
                    sb4.append(j);
                    C3280l.f5289i = !a.contains(sb4.toString());
                    C3280l.this.f5293c.edit().putLong("last_query", j2).putLong("last_reply", j).commit();
                }
                if (jSONObject.has("feedbacks")) {
                    JSONArray jSONArray = jSONObject.getJSONArray("feedbacks");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        C8318j jVar = new C8318j();
                        jVar.mo35371d(jSONObject2.getString("content"));
                        jVar.mo35372e(jSONObject2.getString("created_at"));
                        JSONArray jSONArray2 = jSONObject2.getJSONArray("replies");
                        new ArrayList();
                        C3280l.this.f5291a.add(jVar);
                        int size = C3280l.this.f5291a.size();
                        int i2 = 1;
                        int length = jSONArray2.length() - 1;
                        while (length >= 0) {
                            JSONObject jSONObject3 = jSONArray2.getJSONObject(length);
                            C8318j jVar2 = new C8318j(i2);
                            jVar2.mo35371d(jSONObject3.getString("content"));
                            jVar2.mo35372e(jSONObject3.getString("created_at"));
                            C3280l.this.f5291a.add(size - 1, jVar2);
                            length--;
                            i2 = 1;
                        }
                    }
                    for (C3282b B : C3280l.this.f5294d) {
                        B.mo23862B();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFailure message = ");
            sb.append(str);
            for (C3282b G : C3280l.this.f5294d) {
                G.mo23863G(str);
            }
        }
    }

    /* renamed from: j4.l$b */
    public interface C3282b {
        /* renamed from: B */
        void mo23862B();

        /* renamed from: G */
        void mo23863G(String str);
    }

    private C3280l() {
        C3051a.m7925r().mo23358M(this);
        this.f5293c = C3108x.f4951e.getSharedPreferences("feedback", 0);
    }

    /* renamed from: c */
    public static C3280l m8817c() {
        if (f5286f == null) {
            f5286f = new C3280l();
        }
        return f5286f;
    }

    /* renamed from: C */
    public void mo23255C(C3051a.C3062k kVar) {
    }

    /* renamed from: H */
    public void mo23262H() {
    }

    /* renamed from: d */
    public void mo23283d() {
    }

    /* renamed from: e */
    public List<C8318j> mo23856e() {
        return this.f5291a;
    }

    /* renamed from: f */
    public void mo23857f() {
        long j = 0;
        long j2 = 0;
        for (C8318j c : this.f5291a) {
            if (c.mo35370c() == 0) {
                j2++;
            }
        }
        long j3 = j2 - ((long) f5287g);
        if (j3 != 0) {
            j = this.f5293c.getLong("last_query", 0);
        }
        C3988b.m11567c(AppUtils.f4993q + "fb-query-by-uid/" + C3051a.m7925r().mo23366v() + MiotCloudImpl.COOKIE_PATH + j3 + MiotCloudImpl.COOKIE_PATH + j, String.class, this.f5295e);
    }

    /* renamed from: g */
    public void mo23288g() {
    }

    /* renamed from: h */
    public void mo23291h() {
        this.f5291a.clear();
        f5287g = 0;
        f5290j = false;
        this.f5292b = 0;
        mo23857f();
    }

    /* renamed from: i */
    public void mo23858i(C3282b bVar) {
        this.f5294d.add(bVar);
    }

    /* renamed from: j */
    public void mo23859j(String str, String str2, int i, C3010c cVar, String str3, C4007b<String> bVar) {
        String c = (cVar == null || cVar.mo23197N() == null) ? "N/A" : cVar.mo23197N().mo42511c();
        String str4 = AppUtils.f4993q + "feedback/";
        C2530m mVar = new C2530m();
        mVar.mo19398t("contact", str2);
        mVar.mo19398t("content", str);
        mVar.mo19397r("type", Integer.valueOf(i));
        mVar.mo19398t(Constants.EXTRA_KEY_APP_VERSION, AppUtils.m8283d());
        mVar.mo19398t("os_version", Build.VERSION.RELEASE);
        mVar.mo19398t("app_uuid", AppUtils.m8281b());
        mVar.mo19398t("phone_model", Build.MODEL);
        mVar.mo19398t("uid", C3051a.m7925r().mo23366v());
        if (cVar != null) {
            String G = cVar.mo23185G();
            try {
                if (G.matches("^[a-fA-F0-9]{2}+:[a-fA-F0-9]{2}+:[a-fA-F0-9]{2}+:[a-fA-F0-9]{2}+:[a-fA-F0-9]{2}+:[a-fA-F0-9]{2}$")) {
                    G = String.valueOf(Long.parseLong("FF" + G.replace(Constants.COLON_SEPARATOR, ""), 16));
                }
            } catch (Exception e) {
                e.printStackTrace();
                G = cVar.mo23185G();
            }
            mVar.mo19398t("device_id", G);
            mVar.mo19398t("firmware_version", c);
            mVar.mo19398t("product_model", cVar.mo23208T());
            if (cVar instanceof C6119c) {
                mVar.mo19398t("group_dev", TimerCodec.ENABLE);
            }
        } else {
            mVar.mo19398t("product_model", str3);
        }
        C3988b.m11572h(str4, mVar.toString(), String.class, bVar);
    }

    /* renamed from: k */
    public void mo23860k(C3282b bVar) {
        this.f5294d.remove(bVar);
    }

    /* renamed from: l */
    public void mo23300l() {
    }

    /* renamed from: q */
    public void mo23308q(String str) {
    }

    /* renamed from: r */
    public void mo23310r(String str) {
    }
}

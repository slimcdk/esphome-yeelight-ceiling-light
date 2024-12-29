package com.yeelight.yeelib.utils;

import android.content.SharedPreferences;
import android.os.Build;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.p150c.C5980c;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p153g.C9842k;
import com.yeelight.yeelib.p187h.C9862d;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p011c.p012a.p046d.C0679o;

/* renamed from: com.yeelight.yeelib.utils.n */
public class C4312n implements C4201a.C4202i {

    /* renamed from: f */
    private static C4312n f7498f = null;

    /* renamed from: g */
    public static int f7499g = 0;

    /* renamed from: h */
    public static long f7500h = 0;

    /* renamed from: i */
    public static boolean f7501i = false;

    /* renamed from: j */
    public static boolean f7502j = false;

    /* renamed from: a */
    public List<C9842k> f7503a = new ArrayList();

    /* renamed from: b */
    public int f7504b = 0;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public SharedPreferences f7505c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List<C4314b> f7506d = new ArrayList();

    /* renamed from: e */
    C9874b<String> f7507e = new C4313a();

    /* renamed from: com.yeelight.yeelib.utils.n$a */
    class C4313a implements C9874b<String> {
        C4313a() {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            String str2 = str;
            "onsuccess " + str2;
            try {
                JSONObject jSONObject = new JSONObject(str2);
                C4312n.this.f7504b = jSONObject.getInt("total");
                long j = jSONObject.getLong("last_reply");
                long j2 = jSONObject.getLong("last_query");
                if (!(C4312n.this.f7504b == 0 || j2 == 0)) {
                    long j3 = C4312n.this.f7505c.getLong("last_reply", 0);
                    "local saved lastReply = " + j3 + ", server return lastReply = " + j;
                    C4312n.f7500h = j;
                    C4312n.f7502j = j > j3;
                    "has new feedback?" + C4312n.f7502j;
                    SharedPreferences a = C4312n.this.f7505c;
                    StringBuilder sb = new StringBuilder();
                    sb.append("reply");
                    sb.append(j);
                    C4312n.f7501i = !a.contains(sb.toString());
                    C4312n.this.f7505c.edit().putLong("last_query", j2).putLong("last_reply", j).commit();
                }
                if (jSONObject.has("feedbacks")) {
                    JSONArray jSONArray = jSONObject.getJSONArray("feedbacks");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        C9842k kVar = new C9842k();
                        kVar.mo31784d(jSONObject2.getString("content"));
                        kVar.mo31785e(jSONObject2.getString("created_at"));
                        JSONArray jSONArray2 = jSONObject2.getJSONArray("replies");
                        new ArrayList();
                        C4312n.this.f7503a.add(kVar);
                        int size = C4312n.this.f7503a.size();
                        for (int length = jSONArray2.length() - 1; length >= 0; length--) {
                            JSONObject jSONObject3 = jSONArray2.getJSONObject(length);
                            C9842k kVar2 = new C9842k(1);
                            kVar2.mo31784d(jSONObject3.getString("content"));
                            kVar2.mo31785e(jSONObject3.getString("created_at"));
                            C4312n.this.f7503a.add(size - 1, kVar2);
                        }
                    }
                    for (C4314b B : C4312n.this.f7506d) {
                        B.mo23778B();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            "onFailure message = " + str;
            for (C4314b G : C4312n.this.f7506d) {
                G.mo23779G(str);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.utils.n$b */
    public interface C4314b {
        /* renamed from: B */
        void mo23778B();

        /* renamed from: G */
        void mo23779G(String str);
    }

    private C4312n() {
        C4201a.m11607r().mo23444M(this);
        this.f7505c = C4297y.f7456e.getSharedPreferences("feedback", 0);
    }

    /* renamed from: c */
    public static C4312n m12166c() {
        if (f7498f == null) {
            f7498f = new C4312n();
        }
        return f7498f;
    }

    /* renamed from: C */
    public void mo23456C(C4201a.C4212k kVar) {
    }

    /* renamed from: H */
    public void mo23457H() {
    }

    /* renamed from: d */
    public void mo23458d() {
    }

    /* renamed from: e */
    public List<C9842k> mo23772e() {
        return this.f7503a;
    }

    /* renamed from: f */
    public void mo23773f() {
        long j = 0;
        long j2 = 0;
        for (C9842k c : this.f7503a) {
            if (c.mo31783c() == 0) {
                j2++;
            }
        }
        long j3 = j2 - ((long) f7499g);
        if (j3 != 0) {
            j = this.f7505c.getLong("last_query", 0);
        }
        C9862d.m24133c(C4308b.f7492k + "fb-query-by-uid/" + C4201a.m11607r().mo23452v() + MiotCloudImpl.COOKIE_PATH + j3 + MiotCloudImpl.COOKIE_PATH + j, String.class, this.f7507e);
    }

    /* renamed from: g */
    public void mo23459g() {
    }

    /* renamed from: h */
    public void mo23774h(C4314b bVar) {
        this.f7506d.add(bVar);
    }

    /* renamed from: i */
    public void mo23460i() {
        this.f7503a.clear();
        f7499g = 0;
        f7502j = false;
        this.f7504b = 0;
        mo23773f();
    }

    /* renamed from: j */
    public void mo23775j(String str, String str2, int i, C4198d dVar, String str3, C9874b<String> bVar) {
        String c = (dVar == null || dVar.mo23384N() == null) ? "N/A" : dVar.mo23384N().mo29040c();
        String str4 = C4308b.f7492k + "feedback/";
        C0679o oVar = new C0679o();
        oVar.mo8754l("contact", str2);
        oVar.mo8754l("content", str);
        oVar.mo8753k("type", Integer.valueOf(i));
        oVar.mo8754l(Constants.EXTRA_KEY_APP_VERSION, C4308b.m12125d());
        oVar.mo8754l("os_version", Build.VERSION.RELEASE);
        oVar.mo8754l("app_uuid", C4308b.m12123b());
        oVar.mo8754l("phone_model", Build.MODEL);
        oVar.mo8754l("uid", C4201a.m11607r().mo23452v());
        if (dVar != null) {
            String G = dVar.mo23372G();
            try {
                if (G.matches("^[a-fA-F0-9]{2}+:[a-fA-F0-9]{2}+:[a-fA-F0-9]{2}+:[a-fA-F0-9]{2}+:[a-fA-F0-9]{2}+:[a-fA-F0-9]{2}$")) {
                    G = String.valueOf(Long.parseLong("FF" + G.replace(Constants.COLON_SEPARATOR, ""), 16));
                }
            } catch (Exception e) {
                e.printStackTrace();
                G = dVar.mo23372G();
            }
            oVar.mo8754l("device_id", G);
            oVar.mo8754l("firmware_version", c);
            oVar.mo8754l("product_model", dVar.mo23395T());
            if (dVar instanceof C5980c) {
                oVar.mo8754l("group_dev", TimerCodec.ENABLE);
            }
        } else {
            oVar.mo8754l("product_model", str3);
        }
        C9862d.m24138h(str4, oVar.toString(), String.class, bVar);
    }

    /* renamed from: k */
    public void mo23776k(C4314b bVar) {
        this.f7506d.remove(bVar);
    }

    /* renamed from: l */
    public void mo23461l() {
    }

    /* renamed from: q */
    public void mo23462q(String str) {
    }

    /* renamed from: r */
    public void mo23463r(String str) {
    }
}

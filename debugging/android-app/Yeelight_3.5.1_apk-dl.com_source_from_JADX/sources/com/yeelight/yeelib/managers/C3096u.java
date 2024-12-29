package com.yeelight.yeelib.managers;

import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.managers.C8281l;
import com.yeelight.yeelib.models.C8329t;
import com.yeelight.yeelib.models.SceneTemplateBean;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p129b4.C3988b;
import p134c4.C4007b;

/* renamed from: com.yeelight.yeelib.managers.u */
public class C3096u implements C3051a.C3052i, C8281l.C3080a {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String f4933g = "u";

    /* renamed from: h */
    private static C3096u f4934h;

    /* renamed from: i */
    public static HashMap<String, Object> f4935i;

    /* renamed from: a */
    private boolean f4936a = false;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f4937b = false;

    /* renamed from: c */
    private int f4938c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List<C8329t> f4939d = new CopyOnWriteArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<SceneTemplateBean> f4940e = new CopyOnWriteArrayList();

    /* renamed from: f */
    private List<C3104d> f4941f = new ArrayList();

    /* renamed from: com.yeelight.yeelib.managers.u$a */
    class C3097a implements C4007b<String> {
        C3097a() {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            boolean unused = C3096u.this.f4937b = true;
            String unused2 = C3096u.f4933g;
            StringBuilder sb = new StringBuilder();
            sb.append("scene bundle load onSuccess ");
            sb.append(str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getInt("code") == 1) {
                    ArrayList arrayList = new ArrayList();
                    String unused3 = C3096u.f4933g;
                    JSONArray jSONArray = jSONObject.getJSONArray("bundles");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(C8329t.m19856f(jSONArray.getJSONObject(i)));
                    }
                    C3096u.this.f4939d.clear();
                    List unused4 = C3096u.this.f4939d = arrayList;
                    String unused5 = C3096u.f4933g;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("scene bundle load onSuccess, count: ");
                    sb2.append(C3096u.this.f4939d.size());
                    C3096u.this.m8176w();
                    return;
                }
                C3096u.this.m8177x();
            } catch (JSONException e) {
                e.printStackTrace();
                C3096u.this.m8177x();
            }
        }

        public void onFailure(int i, String str) {
            String unused = C3096u.f4933g;
            StringBuilder sb = new StringBuilder();
            sb.append("onFailure, e = ");
            sb.append(str);
            C3096u.this.m8177x();
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.u$b */
    class C3098b implements C4007b<String> {

        /* renamed from: a */
        final /* synthetic */ C3105e f4943a;

        C3098b(C3105e eVar) {
            this.f4943a = eVar;
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            String unused = C3096u.f4933g;
            StringBuilder sb = new StringBuilder();
            sb.append("get scene onSuccess, return result: ");
            sb.append(str);
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("scenes");
                C3096u.this.f4940e.clear();
                for (int i = 0; i < jSONArray.length(); i++) {
                    C3096u.this.f4940e.add(new SceneTemplateBean(jSONArray.getJSONObject(i)));
                }
                C3105e eVar = this.f4943a;
                if (eVar != null) {
                    eVar.mo23529a();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            String unused = C3096u.f4933g;
            StringBuilder sb = new StringBuilder();
            sb.append("get scene onFailure, return result: ");
            sb.append(str);
            C3105e eVar = this.f4943a;
            if (eVar != null) {
                eVar.mo23530b();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.u$c */
    class C3099c implements C4007b<String> {

        /* renamed from: a */
        final /* synthetic */ C8329t f4945a;

        /* renamed from: com.yeelight.yeelib.managers.u$c$a */
        class C3100a extends Thread {

            /* renamed from: com.yeelight.yeelib.managers.u$c$a$a */
            class C3101a implements Runnable {
                C3101a(C3100a aVar) {
                }

                public void run() {
                    Toast.makeText(C3108x.f4951e, R$string.scene_cache_del_success, 0).show();
                }
            }

            C3100a(C3099c cVar) {
            }

            public void run() {
                new Handler(Looper.getMainLooper()).post(new C3101a(this));
            }
        }

        /* renamed from: com.yeelight.yeelib.managers.u$c$b */
        class C3102b extends Thread {

            /* renamed from: com.yeelight.yeelib.managers.u$c$b$a */
            class C3103a implements Runnable {
                C3103a(C3102b bVar) {
                }

                public void run() {
                    Toast.makeText(C3108x.f4951e, R$string.scene_cache_del_fail, 0).show();
                }
            }

            C3102b(C3099c cVar) {
            }

            public void run() {
                new Handler(Looper.getMainLooper()).post(new C3103a(this));
            }
        }

        C3099c(C8329t tVar) {
            this.f4945a = tVar;
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            String unused = C3096u.f4933g;
            new C3100a(this).start();
            C3096u.this.f4939d.remove(this.f4945a);
            C3096u.this.m8176w();
            C3096u.this.mo23508D();
        }

        public void onFailure(int i, String str) {
            String unused = C3096u.f4933g;
            StringBuilder sb = new StringBuilder();
            sb.append("deleteSceneBundle, onFailure, exception message = ");
            sb.append(str);
            new C3102b(this).start();
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.u$d */
    public interface C3104d {
        /* renamed from: f */
        void mo23525f();

        /* renamed from: n */
        void mo23526n();

        /* renamed from: p */
        void mo23527p();

        /* renamed from: q */
        void mo23528q();
    }

    /* renamed from: com.yeelight.yeelib.managers.u$e */
    public interface C3105e {
        /* renamed from: a */
        void mo23529a();

        /* renamed from: b */
        void mo23530b();
    }

    private C3096u() {
        C3051a.m7925r().mo23358M(this);
        C8281l.m19542b().mo35225e(this);
    }

    /* renamed from: n */
    public static C3096u m8175n() {
        if (f4934h == null) {
            f4934h = new C3096u();
        }
        return f4934h;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m8176w() {
        this.f4936a = false;
        this.f4938c = 0;
        for (C3104d n : this.f4941f) {
            n.mo23526n();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m8177x() {
        this.f4936a = false;
        int i = this.f4938c + 1;
        this.f4938c = i;
        if (i > 3) {
            for (C3104d q : this.f4941f) {
                q.mo23528q();
            }
        }
    }

    /* renamed from: y */
    private void m8178y() {
        for (C3104d f : this.f4941f) {
            f.mo23525f();
        }
    }

    /* renamed from: z */
    private void m8179z() {
        this.f4936a = true;
        for (C3104d p : this.f4941f) {
            p.mo23527p();
        }
    }

    /* renamed from: A */
    public void mo23506A(C3104d dVar) {
        if (!this.f4941f.contains(dVar)) {
            this.f4941f.add(dVar);
        }
        for (C3104d f : this.f4941f) {
            f.mo23525f();
        }
    }

    /* renamed from: B */
    public void mo23507B(C8329t tVar, C4007b<String> bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(AppUtils.f4994r);
        sb.append("scene/bundle/create");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("saveSceneBundle URL -> ");
        sb2.append(sb.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("saveSceneBundle scene bundle -> ");
        sb3.append(tVar.mo35479t().toString());
        C3988b.m11572h(sb.toString(), tVar.mo35479t().toString(), String.class, bVar);
    }

    /* renamed from: C */
    public void mo23255C(C3051a.C3062k kVar) {
    }

    /* renamed from: D */
    public void mo23508D() {
        if (!this.f4936a) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("uid", C3051a.m7925r().mo23366v());
                m8179z();
                StringBuilder sb = new StringBuilder();
                sb.append(AppUtils.f4994r);
                sb.append("scene/bundle/lists");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("success URL -> ");
                sb2.append(sb.toString());
                C3988b.m11572h(sb.toString(), jSONObject.toString(), String.class, new C3097a());
                mo23517v((C3105e) null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: E */
    public void mo23509E(C3104d dVar) {
        this.f4941f.remove(dVar);
    }

    /* renamed from: F */
    public void mo23510F(C8329t tVar, C4007b<String> bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(AppUtils.f4994r);
        sb.append("scene/bundle/edit");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("updateSceneBundle URL -> ");
        sb2.append(sb.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("updateSceneBundle scene bundle -> ");
        sb3.append(tVar.mo35479t().toString());
        C3988b.m11572h(sb.toString(), tVar.mo35479t().toString(), String.class, bVar);
    }

    /* renamed from: H */
    public void mo23262H() {
    }

    /* renamed from: c */
    public void mo23281c(String str) {
        mo23508D();
    }

    /* renamed from: d */
    public void mo23283d() {
    }

    /* renamed from: g */
    public void mo23288g() {
        this.f4939d.clear();
        m8178y();
    }

    /* renamed from: h */
    public void mo23291h() {
        mo23508D();
    }

    /* renamed from: l */
    public void mo23300l() {
    }

    /* renamed from: m */
    public void mo23511m(C8329t tVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uid", C3051a.m7925r().mo23366v());
            jSONObject.put("id", tVar.mo35471l());
            StringBuilder sb = new StringBuilder();
            sb.append(AppUtils.f4994r);
            sb.append("scene/bundle/delete");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("deleteSceneBundle URL -> ");
            sb2.append(sb.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("deleteSceneBundle params -> ");
            sb3.append(jSONObject.toString());
            C3988b.m11572h(sb.toString(), jSONObject.toString(), String.class, new C3099c(tVar));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: o */
    public C8329t mo23512o(String str) {
        for (C8329t next : this.f4939d) {
            if (next.mo35471l().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: p */
    public List<C8329t> mo23513p() {
        return this.f4939d;
    }

    /* renamed from: q */
    public void mo23308q(String str) {
    }

    /* renamed from: r */
    public void mo23310r(String str) {
    }

    /* renamed from: s */
    public SceneTemplateBean mo23514s(String str) {
        for (SceneTemplateBean next : this.f4940e) {
            if (next.getTemplateId().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: t */
    public List<SceneTemplateBean> mo23515t() {
        return this.f4940e;
    }

    /* renamed from: u */
    public boolean mo23516u() {
        return this.f4937b;
    }

    /* renamed from: v */
    public void mo23517v(C3105e eVar) {
        String str = AppUtils.f4993q + "user_scene_templates?debug=" + (AppUtils.f4977a ? 1 : 0) + "&lang=" + C8281l.m19542b().mo35224c();
        StringBuilder sb = new StringBuilder();
        sb.append("loadTemplate url: ");
        sb.append(str);
        C3988b.m11567c(str, String.class, new C3098b(eVar));
    }
}

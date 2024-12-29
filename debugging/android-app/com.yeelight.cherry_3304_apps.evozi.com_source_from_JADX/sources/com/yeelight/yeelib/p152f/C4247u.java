package com.yeelight.yeelib.p152f;

import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p152f.C4230l;
import com.yeelight.yeelib.p153g.C9832c0;
import com.yeelight.yeelib.p153g.C9858z;
import com.yeelight.yeelib.p187h.C9862d;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import com.yeelight.yeelib.utils.C4308b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.f.u */
public class C4247u implements C4201a.C4202i, C4230l.C4231a {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String f7377g = "u";

    /* renamed from: h */
    private static C4247u f7378h;

    /* renamed from: i */
    public static HashMap<String, Object> f7379i;

    /* renamed from: a */
    private boolean f7380a = false;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f7381b = false;

    /* renamed from: c */
    private int f7382c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List<C9858z> f7383d = new CopyOnWriteArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<C9832c0> f7384e = new CopyOnWriteArrayList();

    /* renamed from: f */
    private List<C4255d> f7385f = new ArrayList();

    /* renamed from: com.yeelight.yeelib.f.u$a */
    class C4248a implements C9874b<String> {
        C4248a() {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            boolean unused = C4247u.this.f7381b = true;
            String unused2 = C4247u.f7377g;
            "scene bundle load onSuccess " + str;
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getInt("code") == 1) {
                    ArrayList arrayList = new ArrayList();
                    String unused3 = C4247u.f7377g;
                    JSONArray jSONArray = jSONObject.getJSONArray("bundles");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(C9858z.m24110f(jSONArray.getJSONObject(i)));
                    }
                    C4247u.this.f7383d.clear();
                    List unused4 = C4247u.this.f7383d = arrayList;
                    String unused5 = C4247u.f7377g;
                    "scene bundle load onSuccess, count: " + C4247u.this.f7383d.size();
                    C4247u.this.m11866w();
                    return;
                }
                C4247u.this.m11867x();
            } catch (JSONException e) {
                e.printStackTrace();
                C4247u.this.m11867x();
            }
        }

        public void onFailure(int i, String str) {
            String unused = C4247u.f7377g;
            "onFailure, e = " + str;
            C4247u.this.m11867x();
        }
    }

    /* renamed from: com.yeelight.yeelib.f.u$b */
    class C4249b implements C9874b<String> {

        /* renamed from: a */
        final /* synthetic */ C4256e f7387a;

        C4249b(C4256e eVar) {
            this.f7387a = eVar;
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            String unused = C4247u.f7377g;
            "get scene onSuccess, return result: " + str;
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("scenes");
                C4247u.this.f7384e.clear();
                for (int i = 0; i < jSONArray.length(); i++) {
                    C4247u.this.f7384e.add(new C9832c0(jSONArray.getJSONObject(i)));
                }
                if (this.f7387a != null) {
                    this.f7387a.mo23636a();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            String unused = C4247u.f7377g;
            "get scene onFailure, return result: " + str;
            C4256e eVar = this.f7387a;
            if (eVar != null) {
                eVar.mo23637b();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.f.u$c */
    class C4250c implements C9874b<String> {

        /* renamed from: a */
        final /* synthetic */ C9858z f7389a;

        /* renamed from: com.yeelight.yeelib.f.u$c$a */
        class C4251a extends Thread {

            /* renamed from: com.yeelight.yeelib.f.u$c$a$a */
            class C4252a implements Runnable {
                C4252a(C4251a aVar) {
                }

                public void run() {
                    Toast.makeText(C4297y.f7456e, R$string.scene_cache_del_success, 0).show();
                }
            }

            C4251a(C4250c cVar) {
            }

            public void run() {
                new Handler(Looper.getMainLooper()).post(new C4252a(this));
            }
        }

        /* renamed from: com.yeelight.yeelib.f.u$c$b */
        class C4253b extends Thread {

            /* renamed from: com.yeelight.yeelib.f.u$c$b$a */
            class C4254a implements Runnable {
                C4254a(C4253b bVar) {
                }

                public void run() {
                    Toast.makeText(C4297y.f7456e, R$string.scene_cache_del_fail, 0).show();
                }
            }

            C4253b(C4250c cVar) {
            }

            public void run() {
                new Handler(Looper.getMainLooper()).post(new C4254a(this));
            }
        }

        C4250c(C9858z zVar) {
            this.f7389a = zVar;
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            String unused = C4247u.f7377g;
            new C4251a(this).start();
            C4247u.this.f7383d.remove(this.f7389a);
            C4247u.this.m11866w();
            C4247u.this.mo23615D();
        }

        public void onFailure(int i, String str) {
            String unused = C4247u.f7377g;
            "deleteSceneBundle, onFailure, exception message = " + str;
            new C4253b(this).start();
        }
    }

    /* renamed from: com.yeelight.yeelib.f.u$d */
    public interface C4255d {
        /* renamed from: e */
        void mo23632e();

        /* renamed from: g */
        void mo23633g();

        /* renamed from: i */
        void mo23634i();

        /* renamed from: l */
        void mo23635l();
    }

    /* renamed from: com.yeelight.yeelib.f.u$e */
    public interface C4256e {
        /* renamed from: a */
        void mo23636a();

        /* renamed from: b */
        void mo23637b();
    }

    private C4247u() {
        C4201a.m11607r().mo23444M(this);
        C4230l.m11766b().mo23554e(this);
    }

    /* renamed from: n */
    public static C4247u m11865n() {
        if (f7378h == null) {
            f7378h = new C4247u();
        }
        return f7378h;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m11866w() {
        this.f7380a = false;
        this.f7382c = 0;
        for (C4255d g : this.f7385f) {
            g.mo23633g();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m11867x() {
        this.f7380a = false;
        int i = this.f7382c + 1;
        this.f7382c = i;
        if (i > 3) {
            for (C4255d l : this.f7385f) {
                l.mo23635l();
            }
        }
    }

    /* renamed from: y */
    private void m11868y() {
        for (C4255d e : this.f7385f) {
            e.mo23632e();
        }
    }

    /* renamed from: z */
    private void m11869z() {
        this.f7380a = true;
        for (C4255d i : this.f7385f) {
            i.mo23634i();
        }
    }

    /* renamed from: A */
    public void mo23613A(C4255d dVar) {
        if (!this.f7385f.contains(dVar)) {
            this.f7385f.add(dVar);
        }
        for (C4255d e : this.f7385f) {
            e.mo23632e();
        }
    }

    /* renamed from: B */
    public void mo23614B(C9858z zVar, C9874b<String> bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(C4308b.f7493l);
        sb.append("scene/bundle/create");
        "saveSceneBundle URL -> " + sb.toString();
        "saveSceneBundle scene bundle -> " + zVar.mo31914t().toString();
        C9862d.m24138h(sb.toString(), zVar.mo31914t().toString(), String.class, bVar);
    }

    /* renamed from: C */
    public void mo23456C(C4201a.C4212k kVar) {
    }

    /* renamed from: D */
    public void mo23615D() {
        if (!this.f7380a) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("uid", C4201a.m11607r().mo23452v());
                m11869z();
                StringBuilder sb = new StringBuilder();
                sb.append(C4308b.f7493l);
                sb.append("scene/bundle/lists");
                "success URL -> " + sb.toString();
                C9862d.m24138h(sb.toString(), jSONObject.toString(), String.class, new C4248a());
                mo23624v((C4256e) null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: E */
    public void mo23616E(C4255d dVar) {
        this.f7385f.remove(dVar);
    }

    /* renamed from: F */
    public void mo23617F(C9858z zVar, C9874b<String> bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(C4308b.f7493l);
        sb.append("scene/bundle/edit");
        "updateSceneBundle URL -> " + sb.toString();
        "updateSceneBundle scene bundle -> " + zVar.mo31914t().toString();
        C9862d.m24138h(sb.toString(), zVar.mo31914t().toString(), String.class, bVar);
    }

    /* renamed from: H */
    public void mo23457H() {
    }

    /* renamed from: c */
    public void mo23557c(String str) {
        mo23615D();
    }

    /* renamed from: d */
    public void mo23458d() {
    }

    /* renamed from: g */
    public void mo23459g() {
        this.f7383d.clear();
        m11868y();
    }

    /* renamed from: i */
    public void mo23460i() {
        mo23615D();
    }

    /* renamed from: l */
    public void mo23461l() {
    }

    /* renamed from: m */
    public void mo23618m(C9858z zVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uid", C4201a.m11607r().mo23452v());
            jSONObject.put("id", zVar.mo31906l());
            StringBuilder sb = new StringBuilder();
            sb.append(C4308b.f7493l);
            sb.append("scene/bundle/delete");
            "deleteSceneBundle URL -> " + sb.toString();
            "deleteSceneBundle params -> " + jSONObject.toString();
            C9862d.m24138h(sb.toString(), jSONObject.toString(), String.class, new C4250c(zVar));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: o */
    public C9858z mo23619o(String str) {
        for (C9858z next : this.f7383d) {
            if (next.mo31906l().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: p */
    public List<C9858z> mo23620p() {
        return this.f7383d;
    }

    /* renamed from: q */
    public void mo23462q(String str) {
    }

    /* renamed from: r */
    public void mo23463r(String str) {
    }

    /* renamed from: s */
    public C9832c0 mo23621s(String str) {
        for (C9832c0 next : this.f7384e) {
            if (next.mo31754i().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: t */
    public List<C9832c0> mo23622t() {
        return this.f7384e;
    }

    /* renamed from: u */
    public boolean mo23623u() {
        return this.f7381b;
    }

    /* renamed from: v */
    public void mo23624v(C4256e eVar) {
        String str = C4308b.f7492k + "user_scene_templates?debug=" + (C4308b.f7482a ? 1 : 0) + "&lang=" + C4230l.m11766b().mo23553c();
        "loadTemplate url: " + str;
        C9862d.m24133c(str, String.class, new C4249b(eVar));
    }
}

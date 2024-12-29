package com.yeelight.yeelib.p152f;

import com.yeelight.yeelib.p187h.C9862d;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import com.yeelight.yeelib.utils.C4308b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.f.f */
public class C9786f {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f17700b = "f";

    /* renamed from: c */
    private static C9786f f17701c;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C9788b f17702a;

    /* renamed from: com.yeelight.yeelib.f.f$a */
    class C9787a implements C9874b<String> {
        C9787a() {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            try {
                String unused = C9786f.f17700b;
                "destroyAllUserData onResponse, msg : " + str + ", size = " + str.length();
                JSONObject jSONObject = new JSONObject(str);
                if (C9786f.this.f17702a == null) {
                    return;
                }
                if (jSONObject.getInt("code") == 0) {
                    String unused2 = C9786f.f17700b;
                    C9786f.this.f17702a.mo31643x(false);
                } else if (jSONObject.getInt("code") == 1) {
                    String unused3 = C9786f.f17700b;
                    C9786f.this.f17702a.mo31643x(true);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            String unused = C9786f.f17700b;
            "destroyAllUserData onFailure, request : " + str;
            if (C9786f.this.f17702a != null) {
                C9786f.this.f17702a.mo31643x(false);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.f.f$b */
    public interface C9788b {
        /* renamed from: x */
        void mo31643x(boolean z);
    }

    /* renamed from: d */
    public static C9786f m23727d() {
        if (f17701c == null) {
            f17701c = new C9786f();
        }
        return f17701c;
    }

    /* renamed from: c */
    public void mo31639c() {
        String str = C4308b.f7490i + "api/v2/consumer_destroy/" + C4201a.m11607r().mo23452v();
        "destroyAllUserData, url = " + str;
        C9862d.m24133c(str, String.class, new C9787a());
    }

    /* renamed from: e */
    public void mo31640e(C9788b bVar) {
        this.f17702a = bVar;
    }

    /* renamed from: f */
    public void mo31641f() {
        this.f17702a = null;
    }
}

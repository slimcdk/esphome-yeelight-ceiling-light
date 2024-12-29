package com.yeelight.yeelib.managers;

import com.yeelight.yeelib.utils.AppUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p129b4.C3988b;
import p134c4.C4007b;

/* renamed from: com.yeelight.yeelib.managers.f */
public class C8274f {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f14194b = "f";

    /* renamed from: c */
    private static C8274f f14195c;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C8276b f14196a;

    /* renamed from: com.yeelight.yeelib.managers.f$a */
    class C8275a implements C4007b<String> {
        C8275a() {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            try {
                String unused = C8274f.f14194b;
                StringBuilder sb = new StringBuilder();
                sb.append("destroyAllUserData onResponse, msg : ");
                sb.append(str);
                sb.append(", size = ");
                sb.append(str.length());
                JSONObject jSONObject = new JSONObject(str);
                if (C8274f.this.f14196a == null) {
                    return;
                }
                if (jSONObject.getInt("code") == 0) {
                    String unused2 = C8274f.f14194b;
                    C8274f.this.f14196a.mo35219x(false);
                } else if (jSONObject.getInt("code") == 1) {
                    String unused3 = C8274f.f14194b;
                    C8274f.this.f14196a.mo35219x(true);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            String unused = C8274f.f14194b;
            StringBuilder sb = new StringBuilder();
            sb.append("destroyAllUserData onFailure, request : ");
            sb.append(str);
            if (C8274f.this.f14196a != null) {
                C8274f.this.f14196a.mo35219x(false);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.f$b */
    public interface C8276b {
        /* renamed from: x */
        void mo35219x(boolean z);
    }

    /* renamed from: d */
    public static C8274f m19527d() {
        if (f14195c == null) {
            f14195c = new C8274f();
        }
        return f14195c;
    }

    /* renamed from: c */
    public void mo35215c() {
        String str = AppUtils.f4987k + "api/v2/consumer_destroy/" + C3051a.m7925r().mo23366v();
        StringBuilder sb = new StringBuilder();
        sb.append("destroyAllUserData, url = ");
        sb.append(str);
        C3988b.m11567c(str, String.class, new C8275a());
    }

    /* renamed from: e */
    public void mo35216e(C8276b bVar) {
        this.f14196a = bVar;
    }

    /* renamed from: f */
    public void mo35217f() {
        this.f14196a = null;
    }
}

package com.yeelight.yeelib.managers;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.miot.api.Constants;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p129b4.C3988b;
import p134c4.C4007b;

/* renamed from: com.yeelight.yeelib.managers.k */
public class C8278k {

    /* renamed from: a */
    private static C8278k f14198a;

    /* renamed from: com.yeelight.yeelib.managers.k$a */
    class C8279a implements C4007b<String> {

        /* renamed from: a */
        final /* synthetic */ C8280b f14199a;

        C8279a(C8278k kVar, C8280b bVar) {
            this.f14199a = bVar;
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("getShareTagBySceneId, onSuccess, response: ");
            sb.append(str);
            try {
                String string = new JSONObject(str).getJSONObject(Constants.EXTRA_PUSH_MESSAGE).getString("share_code");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("getShareTagBySceneId, share_code: ");
                sb2.append(string);
                this.f14199a.mo30784b(string);
            } catch (JSONException e) {
                e.printStackTrace();
                this.f14199a.mo30783a("parce data exception!");
            }
        }

        public void onFailure(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("getShareTagBySceneId, onFailure, response: ");
            sb.append(str);
            this.f14199a.mo30783a(str);
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.k$b */
    public interface C8280b {
        /* renamed from: a */
        void mo30783a(String str);

        /* renamed from: b */
        void mo30784b(String str);
    }

    static {
        Pattern.compile("￥[0-9A-Z]{8}￥");
    }

    private C8278k() {
    }

    /* renamed from: b */
    public static C8278k m19535b() {
        if (f14198a == null) {
            f14198a = new C8278k();
        }
        return f14198a;
    }

    /* renamed from: a */
    public void mo35220a(Context context, String str) {
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("LightShare", str));
    }

    /* renamed from: c */
    public void mo35221c(int i, C8280b bVar) {
        String str = AppUtils.f4993q + "user_share";
        StringBuilder sb = new StringBuilder();
        sb.append("getShareTagBySceneId, url = ");
        sb.append(str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("source_id", i);
            jSONObject.put("source_type", "user_scenes");
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getShareTagBySceneId, params = ");
            sb2.append(jSONObject2);
            C3988b.m11572h(str, jSONObject2, String.class, new C8279a(this, bVar));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}

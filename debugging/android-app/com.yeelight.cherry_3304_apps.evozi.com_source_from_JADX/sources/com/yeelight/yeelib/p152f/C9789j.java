package com.yeelight.yeelib.p152f;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import com.miot.api.Constants;
import com.yeelight.yeelib.p153g.C4300b0;
import com.yeelight.yeelib.p153g.C9838i;
import com.yeelight.yeelib.p187h.C9862d;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import com.yeelight.yeelib.utils.C4308b;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.f.j */
public class C9789j {

    /* renamed from: a */
    private static Pattern f17704a = Pattern.compile("￥[0-9A-Z]{8}￥");

    /* renamed from: b */
    private static C9789j f17705b;

    /* renamed from: com.yeelight.yeelib.f.j$a */
    class C9790a implements C9874b<String> {

        /* renamed from: a */
        final /* synthetic */ C9792c f17706a;

        C9790a(C9789j jVar, C9792c cVar) {
            this.f17706a = cVar;
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            "getShareTagBySceneId, onSuccess, response: " + str;
            try {
                String string = new JSONObject(str).getJSONObject(Constants.EXTRA_PUSH_MESSAGE).getString("share_code");
                "getShareTagBySceneId, share_code: " + string;
                this.f17706a.mo26712b(string);
            } catch (JSONException e) {
                e.printStackTrace();
                this.f17706a.mo26711a("parce data exception!");
            }
        }

        public void onFailure(int i, String str) {
            "getShareTagBySceneId, onFailure, response: " + str;
            this.f17706a.mo26711a(str);
        }
    }

    /* renamed from: com.yeelight.yeelib.f.j$b */
    class C9791b implements C9874b<String> {

        /* renamed from: a */
        final /* synthetic */ C9793d f17707a;

        C9791b(C9789j jVar, C9793d dVar) {
            this.f17707a = dVar;
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            "restoreSceneDataByShareTag, onSuccess, response: " + str;
            try {
                JSONObject jSONObject = new JSONObject(str);
                int i = jSONObject.getInt("code");
                if (i == 1) {
                    C9838i b0 = C9838i.m23957b0(jSONObject.getJSONObject(Constants.EXTRA_PUSH_MESSAGE));
                    if (b0 == null) {
                        this.f17707a.mo26582b();
                        return;
                    }
                    for (C9838i r : C4300b0.m12083u().mo23745i()) {
                        if (b0.mo31886r() == r.mo31886r()) {
                            return;
                        }
                    }
                    this.f17707a.mo26581a(i, b0);
                    return;
                }
                this.f17707a.mo26581a(i, (C9838i) null);
            } catch (JSONException e) {
                e.printStackTrace();
                this.f17707a.mo26582b();
            }
        }

        public void onFailure(int i, String str) {
            "restoreSceneDataByShareTag, onFailure, response: " + str;
            this.f17707a.mo26582b();
        }
    }

    /* renamed from: com.yeelight.yeelib.f.j$c */
    public interface C9792c {
        /* renamed from: a */
        void mo26711a(String str);

        /* renamed from: b */
        void mo26712b(String str);
    }

    /* renamed from: com.yeelight.yeelib.f.j$d */
    public interface C9793d {
        /* renamed from: a */
        void mo26581a(int i, C9838i iVar);

        /* renamed from: b */
        void mo26582b();
    }

    private C9789j() {
    }

    /* renamed from: b */
    public static C9789j m23734b() {
        if (f17705b == null) {
            f17705b = new C9789j();
        }
        return f17705b;
    }

    /* renamed from: a */
    public void mo31644a(Context context, String str) {
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("LightShare", str));
    }

    /* renamed from: c */
    public void mo31645c(int i, C9792c cVar) {
        String str = C4308b.f7492k + "user_share";
        "getShareTagBySceneId, url = " + str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("source_id", i);
            jSONObject.put("source_type", "user_scenes");
            String jSONObject2 = jSONObject.toString();
            "getShareTagBySceneId, params = " + jSONObject2;
            C9862d.m24138h(str, jSONObject2, String.class, new C9790a(this, cVar));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public String mo31646d(Context context) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                String item = primaryClip.getItemAt(0).toString();
                "getShareTagFromClipboard, clipText: " + item;
                if (!TextUtils.isEmpty(item)) {
                    Matcher matcher = f17704a.matcher(item);
                    if (matcher.find()) {
                        String group = matcher.group();
                        "getShareTagFromClipboard, share_code: " + group;
                        return group;
                    }
                }
            }
        } catch (SecurityException unused) {
        }
        return null;
    }

    /* renamed from: e */
    public void mo31647e(String str, C9793d dVar) {
        String str2 = C4308b.f7492k + "get_shared_data";
        "restoreSceneDataByShareTag, shareTag = " + str;
        "restoreSceneDataByShareTag, url = " + str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("shared_data", str);
            C9862d.m24138h(str2, jSONObject.toString(), String.class, new C9791b(this, dVar));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}

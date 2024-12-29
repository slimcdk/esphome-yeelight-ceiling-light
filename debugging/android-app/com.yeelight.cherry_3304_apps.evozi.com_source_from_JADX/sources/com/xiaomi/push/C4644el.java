package com.xiaomi.push;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.xiaomi.channel.commonutils.logger.C3989b;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.xiaomi.push.el */
public class C4644el {
    /* renamed from: a */
    public static Uri m14073a(String str, String str2) {
        return Uri.parse("content://" + str).buildUpon().appendPath(str2).build();
    }

    /* renamed from: a */
    public static String m14074a(String str) {
        return Base64.encodeToString(C4532bf.m13431a(str), 2);
    }

    /* renamed from: a */
    public static String m14075a(HashMap<String, String> hashMap) {
        if (hashMap == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (String next : hashMap.keySet()) {
                jSONObject.put(next, hashMap.get(next));
            }
        } catch (JSONException e) {
            C3989b.m10678a((Throwable) e);
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    public static String m14076b(String str) {
        return C4532bf.m13435a(Base64.decode(str, 2));
    }

    /* renamed from: b */
    public static String m14077b(HashMap<String, String> hashMap) {
        HashMap hashMap2 = new HashMap();
        if (hashMap != null) {
            hashMap2.put("event_type", hashMap.get("event_type") + "");
            hashMap2.put("description", hashMap.get("description") + "");
            String str = hashMap.get("awake_info");
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    hashMap2.put("__planId__", String.valueOf(jSONObject.opt("__planId__")));
                    hashMap2.put("flow_id", String.valueOf(jSONObject.opt("flow_id")));
                    hashMap2.put("jobkey", String.valueOf(jSONObject.opt("jobkey")));
                    hashMap2.put("msg_id", String.valueOf(jSONObject.opt("msg_id")));
                    hashMap2.put("A", String.valueOf(jSONObject.opt("awake_app")));
                    hashMap2.put("B", String.valueOf(jSONObject.opt("awakened_app")));
                    hashMap2.put("module", String.valueOf(jSONObject.opt("awake_type")));
                } catch (JSONException e) {
                    C3989b.m10678a((Throwable) e);
                }
            }
        }
        return m14075a((HashMap<String, String>) hashMap2);
    }
}

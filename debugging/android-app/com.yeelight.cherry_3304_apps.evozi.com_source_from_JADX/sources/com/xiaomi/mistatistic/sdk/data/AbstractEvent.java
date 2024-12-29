package com.xiaomi.mistatistic.sdk.data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public abstract class AbstractEvent {
    protected long mTS = System.currentTimeMillis();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: com.xiaomi.mistatistic.sdk.data.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: com.xiaomi.mistatistic.sdk.data.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: com.xiaomi.mistatistic.sdk.data.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: com.xiaomi.mistatistic.sdk.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: com.xiaomi.mistatistic.sdk.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: com.xiaomi.mistatistic.sdk.data.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.xiaomi.mistatistic.sdk.data.c} */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.xiaomi.mistatistic.sdk.data.AbstractEvent jsonToEvent(java.lang.String r8) {
        /*
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0072 }
            r1.<init>(r8)     // Catch:{ JSONException -> 0x0072 }
            java.lang.String r8 = "category"
            java.lang.String r3 = r1.optString(r8)     // Catch:{ JSONException -> 0x0072 }
            java.lang.String r8 = "key"
            java.lang.String r4 = r1.optString(r8)     // Catch:{ JSONException -> 0x0072 }
            java.lang.String r8 = "type"
            java.lang.String r8 = r1.optString(r8)     // Catch:{ JSONException -> 0x0072 }
            java.lang.String r2 = "value"
            java.lang.String r2 = r1.optString(r2)     // Catch:{ JSONException -> 0x0072 }
            java.lang.String r5 = "params"
            org.json.JSONObject r1 = r1.optJSONObject(r5)     // Catch:{ JSONException -> 0x0072 }
            if (r1 == 0) goto L_0x002c
            java.util.Map r1 = jsonToMap(r1)     // Catch:{ JSONException -> 0x0072 }
            r7 = r1
            goto L_0x002d
        L_0x002c:
            r7 = r0
        L_0x002d:
            java.lang.String r1 = "count"
            boolean r1 = android.text.TextUtils.equals(r8, r1)     // Catch:{ JSONException -> 0x0072 }
            if (r1 == 0) goto L_0x0042
            com.xiaomi.mistatistic.sdk.data.c r8 = new com.xiaomi.mistatistic.sdk.data.c     // Catch:{ JSONException -> 0x0072 }
            int r1 = java.lang.Integer.parseInt(r2)     // Catch:{ JSONException -> 0x0072 }
            long r5 = (long) r1     // Catch:{ JSONException -> 0x0072 }
            r2 = r8
            r2.<init>(r3, r4, r5, r7)     // Catch:{ JSONException -> 0x0072 }
        L_0x0040:
            r0 = r8
            goto L_0x0071
        L_0x0042:
            java.lang.String r1 = "event"
            boolean r1 = android.text.TextUtils.equals(r8, r1)     // Catch:{ JSONException -> 0x0072 }
            if (r1 == 0) goto L_0x0050
            com.xiaomi.mistatistic.sdk.data.e r8 = new com.xiaomi.mistatistic.sdk.data.e     // Catch:{ JSONException -> 0x0072 }
            r8.<init>(r3, r4, r7)     // Catch:{ JSONException -> 0x0072 }
            goto L_0x0040
        L_0x0050:
            java.lang.String r1 = "numeric"
            boolean r1 = android.text.TextUtils.equals(r8, r1)     // Catch:{ JSONException -> 0x0072 }
            if (r1 == 0) goto L_0x0063
            com.xiaomi.mistatistic.sdk.data.g r8 = new com.xiaomi.mistatistic.sdk.data.g     // Catch:{ JSONException -> 0x0072 }
            int r1 = java.lang.Integer.parseInt(r2)     // Catch:{ JSONException -> 0x0072 }
            long r1 = (long) r1     // Catch:{ JSONException -> 0x0072 }
            r8.<init>(r3, r4, r1)     // Catch:{ JSONException -> 0x0072 }
            goto L_0x0040
        L_0x0063:
            java.lang.String r1 = "property"
            boolean r8 = android.text.TextUtils.equals(r8, r1)     // Catch:{ JSONException -> 0x0072 }
            if (r8 == 0) goto L_0x0071
            com.xiaomi.mistatistic.sdk.data.h r8 = new com.xiaomi.mistatistic.sdk.data.h     // Catch:{ JSONException -> 0x0072 }
            r8.<init>(r3, r4, r2)     // Catch:{ JSONException -> 0x0072 }
            goto L_0x0040
        L_0x0071:
            return r0
        L_0x0072:
            r8 = move-exception
            java.lang.String r1 = ""
            com.xiaomi.mistatistic.sdk.controller.C4130h.m11176a((java.lang.String) r1, (java.lang.Throwable) r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mistatistic.sdk.data.AbstractEvent.jsonToEvent(java.lang.String):com.xiaomi.mistatistic.sdk.data.AbstractEvent");
    }

    private static Map<String, String> jsonToMap(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.optString(next));
        }
        return hashMap;
    }

    public abstract String getCategory();

    public void setTS(long j) {
        this.mTS = j;
    }

    public abstract StatEventPojo toPojo();

    public abstract JSONObject valueToJSon();
}

package com.xiaomi.miio;

public class MiioLocalRpcResult {
    public MiioLocalErrorCode code;
    public String data;
    public long did;

    /* renamed from: ip */
    public String f6824ip;
    public int stamp;
    public String token;

    public MiioLocalRpcResult(MiioLocalErrorCode miioLocalErrorCode) {
        this.code = miioLocalErrorCode;
    }

    public MiioLocalRpcResult(MiioLocalErrorCode miioLocalErrorCode, String str, long j, int i, String str2, String str3) {
        this.code = miioLocalErrorCode;
        this.data = str;
        this.did = j;
        this.stamp = i;
        this.token = str2;
        this.f6824ip = str3;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:6|7|8|(2:10|11)|12|13|(1:15)|16|(2:18|19)(1:(2:21|22)(2:23|24))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x003c */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043 A[Catch:{ JSONException -> 0x006a }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d A[Catch:{ JSONException -> 0x006a }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058 A[Catch:{ JSONException -> 0x006a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toAPIString() {
        /*
            r7 = this;
            java.lang.String r0 = "id"
            java.lang.String r1 = "result"
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "code"
            com.xiaomi.miio.MiioLocalErrorCode r4 = r7.code     // Catch:{ JSONException -> 0x006a }
            int r4 = r4.getCode()     // Catch:{ JSONException -> 0x006a }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x006a }
            java.lang.String r3 = "message"
            com.xiaomi.miio.MiioLocalErrorCode r4 = r7.code     // Catch:{ JSONException -> 0x006a }
            java.lang.String r4 = r4.getMessage()     // Catch:{ JSONException -> 0x006a }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x006a }
            com.xiaomi.miio.MiioLocalErrorCode r3 = r7.code     // Catch:{ JSONException -> 0x006a }
            com.xiaomi.miio.MiioLocalErrorCode r4 = com.xiaomi.miio.MiioLocalErrorCode.SUCCESS     // Catch:{ JSONException -> 0x006a }
            if (r3 == r4) goto L_0x002a
            java.lang.String r0 = r2.toString()     // Catch:{ JSONException -> 0x006a }
            return r0
        L_0x002a:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x006a }
            java.lang.String r4 = r7.data     // Catch:{ JSONException -> 0x006a }
            r3.<init>(r4)     // Catch:{ JSONException -> 0x006a }
            int r4 = r3.getInt(r1)     // Catch:{ JSONException -> 0x003c }
            if (r4 != 0) goto L_0x003c
            java.lang.String r0 = r2.toString()     // Catch:{ JSONException -> 0x003c }
            return r0
        L_0x003c:
            org.json.JSONObject r4 = r3.optJSONObject(r1)     // Catch:{ JSONException -> 0x006a }
            r5 = 0
            if (r4 != 0) goto L_0x0047
            org.json.JSONArray r5 = r3.optJSONArray(r1)     // Catch:{ JSONException -> 0x006a }
        L_0x0047:
            int r6 = r3.getInt(r0)     // Catch:{ JSONException -> 0x006a }
            if (r4 == 0) goto L_0x0058
            r2.put(r1, r4)     // Catch:{ JSONException -> 0x006a }
            r2.put(r0, r6)     // Catch:{ JSONException -> 0x006a }
            java.lang.String r0 = r2.toString()     // Catch:{ JSONException -> 0x006a }
            return r0
        L_0x0058:
            if (r5 == 0) goto L_0x0065
            r2.put(r1, r5)     // Catch:{ JSONException -> 0x006a }
            r2.put(r0, r6)     // Catch:{ JSONException -> 0x006a }
            java.lang.String r0 = r2.toString()     // Catch:{ JSONException -> 0x006a }
            return r0
        L_0x0065:
            java.lang.String r0 = r3.toString()     // Catch:{ JSONException -> 0x006a }
            return r0
        L_0x006a:
            r0 = move-exception
            r0.printStackTrace()
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.miio.MiioLocalRpcResult.toAPIString():java.lang.String");
    }
}

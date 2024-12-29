package com.xiaomi.clientreport.data;

import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4536bj;
import com.xiaomi.push.C4808l;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.xiaomi.clientreport.data.a */
public class C3990a {
    public String clientInterfaceId;
    private String miuiVersion = C4808l.m15356a();

    /* renamed from: os */
    private String f6797os = C4536bj.m13449a();
    private String pkgName;
    public int production;
    public int reportType;
    private String sdkVersion;

    public String getPackageName() {
        return this.pkgName;
    }

    public void setAppPackageName(String str) {
        this.pkgName = str;
    }

    public void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("production", this.production);
            jSONObject.put("reportType", this.reportType);
            jSONObject.put("clientInterfaceId", this.clientInterfaceId);
            jSONObject.put("os", this.f6797os);
            jSONObject.put("miuiVersion", this.miuiVersion);
            jSONObject.put("pkgName", this.pkgName);
            jSONObject.put("sdkVersion", this.sdkVersion);
            return jSONObject;
        } catch (JSONException e) {
            C3989b.m10678a((Throwable) e);
            return null;
        }
    }

    public String toJsonString() {
        JSONObject json = toJson();
        return json == null ? "" : json.toString();
    }
}

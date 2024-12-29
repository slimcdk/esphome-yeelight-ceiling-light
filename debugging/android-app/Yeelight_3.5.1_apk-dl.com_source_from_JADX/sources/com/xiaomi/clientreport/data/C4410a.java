package com.xiaomi.clientreport.data;

import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4565bt;
import com.xiaomi.push.C4830m;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.xiaomi.clientreport.data.a */
public class C4410a {
    public String clientInterfaceId;
    private String miuiVersion = C4830m.m14997a();

    /* renamed from: os */
    private String f7364os = C4565bt.m13061a();
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
            jSONObject.put("os", this.f7364os);
            jSONObject.put("miuiVersion", this.miuiVersion);
            jSONObject.put("pkgName", this.pkgName);
            jSONObject.put("sdkVersion", this.sdkVersion);
            return jSONObject;
        } catch (JSONException e) {
            C4408b.m12478a((Throwable) e);
            return null;
        }
    }

    public String toJsonString() {
        JSONObject json = toJson();
        return json == null ? "" : json.toString();
    }
}

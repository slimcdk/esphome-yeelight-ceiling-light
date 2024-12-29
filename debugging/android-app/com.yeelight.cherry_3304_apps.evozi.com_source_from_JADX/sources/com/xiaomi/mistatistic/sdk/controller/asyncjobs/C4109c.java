package com.xiaomi.mistatistic.sdk.controller.asyncjobs;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.miot.bluetooth.channel.packet.Packet;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mistatistic.sdk.BuildSetting;
import com.xiaomi.mistatistic.sdk.controller.C4112b;
import com.xiaomi.mistatistic.sdk.controller.C4113c;
import com.xiaomi.mistatistic.sdk.controller.C4115d;
import com.xiaomi.mistatistic.sdk.controller.C4120e;
import com.xiaomi.mistatistic.sdk.controller.C4130h;
import com.xiaomi.mistatistic.sdk.controller.C4132j;
import com.xiaomi.mistatistic.sdk.controller.C4139l;
import com.xiaomi.mistatistic.sdk.controller.C4150o;
import com.xiaomi.mistatistic.sdk.controller.C4154p;
import com.xiaomi.mistatistic.sdk.controller.C4162q;
import java.util.TreeMap;
import org.json.JSONObject;

/* renamed from: com.xiaomi.mistatistic.sdk.controller.asyncjobs.c */
public class C4109c implements C4115d.C4118a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C4111a f7031a;

    /* renamed from: b */
    private String f7032b;

    /* renamed from: c */
    private int f7033c;

    /* renamed from: com.xiaomi.mistatistic.sdk.controller.asyncjobs.c$a */
    public interface C4111a {
        /* renamed from: a */
        void mo23034a(boolean z);
    }

    public C4109c(String str, C4111a aVar, int i) {
        this.f7031a = aVar;
        this.f7032b = str;
        this.f7033c = i;
    }

    /* renamed from: a */
    private String m11094a(String str, String str2, String str3) {
        return C4162q.m11296b(String.format("seed:%s-%s-%s", new Object[]{str, str2, str3})).substring(0, 16);
    }

    /* renamed from: a */
    private void m11095a(JSONObject jSONObject) {
        if (jSONObject.has(Packet.DATA)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(Packet.DATA);
            if (jSONObject2.has("delay")) {
                C4139l.m11216a(jSONObject2.getLong("delay"));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m11097a(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("Upload complete, result: ");
        sb.append(str == null ? "" : str.trim());
        C4130h.m11182c("RDUJ", sb.toString());
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(NotificationCompat.CATEGORY_STATUS);
            m11095a(jSONObject);
            if ("ok".equals(string)) {
                if ("test ok".equals(jSONObject.optString("reason"))) {
                    C4150o.m11251a().mo23085c();
                    str2 = "test ok, enable shake detector";
                } else {
                    C4150o.m11251a().mo23086d();
                    str2 = "test not ok, disable shake detector";
                }
                C4130h.m11172a(str2);
                return true;
            }
            C4130h.m11181c("result status isn't ok, " + string);
            return false;
        } catch (Exception e) {
            C4130h.m11176a("parseUploadingResult exception ", (Throwable) e);
            return false;
        }
    }

    /* renamed from: a */
    public void mo22986a() {
        try {
            int g = C4154p.m11271a().mo23103g();
            long f = C4154p.m11271a().mo23102f();
            TreeMap treeMap = new TreeMap();
            treeMap.put(Constants.APP_ID, C4113c.m11108b());
            treeMap.put("app_key", C4113c.m11110c());
            treeMap.put("device_id", new C4120e().mo23042a());
            treeMap.put("channel", C4113c.m11111d());
            treeMap.put("policy", String.valueOf(g));
            treeMap.put("interval", String.valueOf(f));
            C4130h.m11172a(String.format("upload policy:%d, upload interval:%d, mistat upload version:%d, upload %d events.", new Object[]{Integer.valueOf(g), Long.valueOf(f), 3, Integer.valueOf(this.f7033c)}));
            String e = C4113c.m11112e();
            if (!TextUtils.isEmpty(e)) {
                treeMap.put("version", e);
            }
            C4130h.m11177b("raw upload content:" + this.f7032b);
            treeMap.put("stat_value", C4112b.m11101a(this.f7032b, m11094a(C4113c.m11108b(), C4113c.m11110c(), new C4120e().mo23042a())));
            treeMap.put("mistatv", String.valueOf(3));
            treeMap.put("size", String.valueOf(this.f7033c));
            C4132j.m11190a(BuildSetting.isTest() ? "http://10.235.124.13:8097/mistats" : "http://data.mistat.xiaomi.com/mistats/v2", treeMap, new C4132j.C4136b() {
                /* renamed from: a */
                public void mo23019a(String str) {
                    boolean z;
                    try {
                        z = C4109c.this.m11097a(str);
                    } catch (Exception e) {
                        C4130h.m11176a("Upload MiStat data failed: ", (Throwable) e);
                        z = false;
                    }
                    C4109c.this.f7031a.mo23034a(z);
                }
            });
        } catch (Exception e2) {
            C4130h.m11184d("RDUJ", "RemoteDataUploadJob exception: " + e2.getMessage());
            this.f7031a.mo23034a(false);
        }
    }
}

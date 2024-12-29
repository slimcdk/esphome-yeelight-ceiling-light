package com.xiaomi.mistatistic.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.miot.common.device.parser.xml.DddTag;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mistatistic.sdk.controller.C4132j;
import com.xiaomi.mistatistic.sdk.data.C4166b;
import com.xiaomi.mistatistic.sdk.data.C4169e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.xiaomi.mistatistic.sdk.controller.a */
public class C4102a {

    /* renamed from: a */
    private static int f7012a;

    /* renamed from: c */
    private static volatile C4102a f7013c;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f7014b;

    private C4102a() {
        try {
            this.f7014b = C4113c.m11105a();
        } catch (Exception e) {
            C4130h.m11176a("ABTestManager initialize  Exception:", (Throwable) e);
        }
    }

    /* renamed from: a */
    public static synchronized C4102a m11048a() {
        C4102a aVar;
        synchronized (C4102a.class) {
            if (f7013c == null) {
                f7013c = new C4102a();
            }
            aVar = f7013c;
        }
        return aVar;
    }

    /* renamed from: a */
    private String m11049a(int i) {
        return i + Constants.ACCEPT_TIME_SEPARATOR_SERVER + NotificationCompat.CATEGORY_STATUS;
    }

    /* renamed from: a */
    private void m11050a(int i, int i2) {
        C4137k.m11210b(this.f7014b, m11049a(i), i2);
    }

    /* renamed from: a */
    private void m11051a(int i, Boolean bool) {
        Context context = this.f7014b;
        C4137k.m11206a(context, i + Constants.ACCEPT_TIME_SEPARATOR_SERVER + "isAbTest", bool.booleanValue());
    }

    /* renamed from: a */
    private void m11052a(long j) {
        C4137k.m11211b(this.f7014b, "deploy_last_time", j);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11055a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.getInt("errorCode") == 0) {
                if (!TextUtils.isEmpty(str)) {
                    C4130h.m11178b("ABTEST", "获取数据解析JSON");
                    JSONArray jSONArray = jSONObject.getJSONArray("result");
                    m11052a(System.currentTimeMillis());
                    if (jSONArray != null && jSONArray.length() > 0) {
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            int i2 = jSONObject2.getInt("experiment_id");
                            int i3 = jSONObject2.getInt(NotificationCompat.CATEGORY_STATUS);
                            Boolean valueOf = Boolean.valueOf(jSONObject2.getBoolean("isAbTest"));
                            m11050a(i2, i3);
                            m11051a(i2, valueOf);
                            JSONObject optJSONObject = jSONObject2.optJSONObject("content");
                            if (optJSONObject != null && optJSONObject.length() > 0) {
                                Iterator<String> keys = optJSONObject.keys();
                                while (keys.hasNext()) {
                                    String obj = keys.next().toString();
                                    m11057b(i2, obj, optJSONObject.getString(obj));
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
            }
            C4130h.m11173a("ABTEST", "Error to getServiceDate the error:" + jSONObject.getInt("errorCode"));
            m11052a(0);
        } catch (Exception e) {
            C4130h.m11174a("ABTEST", "Error to getControlVarValue the exception ", (Throwable) e);
        }
    }

    /* renamed from: a */
    private static boolean m11056a(int i, HashMap<String, String> hashMap) {
        if (hashMap != null && hashMap.size() > 0) {
            return true;
        }
        C4130h.m11184d("ABTEST", String.format("AbTest local configuration has not been completed exid:%d", new Object[]{Integer.valueOf(i)}));
        return false;
    }

    /* renamed from: b */
    private void m11057b(int i, String str, String str2) {
        Context context = this.f7014b;
        String valueOf = String.valueOf(i);
        C4137k.m11212b(context, valueOf, str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m11058b(Context context, C4132j.C4136b bVar) {
        TreeMap treeMap = new TreeMap();
        treeMap.put(Constants.APP_ID, C4113c.m11108b());
        treeMap.put("device_id", C4120e.m11124a(context));
        treeMap.put(Constants.PACKAGE_NAME, context.getPackageName());
        C4130h.m11173a("ABTEST", "ServiceData the parameters: " + treeMap);
        try {
            C4132j.m11189a(context, "http://abtest.mistat.xiaomi.com/experiments", (Map<String, String>) treeMap, bVar);
        } catch (Exception e) {
            int i = f7012a + 1;
            f7012a = i;
            C4130h.m11179b("ABTEST", String.format("retry %d, failed to getServiceDate, exception ", new Object[]{Integer.valueOf(i)}), (Throwable) e);
            if (f7012a < 3) {
                m11058b(context, bVar);
            } else {
                f7012a = 0;
            }
        }
    }

    /* renamed from: b */
    private void m11059b(String str, int i) {
        if (m11060b(i)) {
            LocalEventRecorder.insertEvent(new C4169e("mistat_metrics", str, (Map<String, String>) null));
        }
    }

    /* renamed from: b */
    private boolean m11060b(int i) {
        try {
            int a = C4137k.m11202a(this.f7014b, m11049a(i), 0);
            if (!(a == 0 || a == -1 || a == 1 || a == 3)) {
                if (a != 4) {
                    Context context = this.f7014b;
                    if (C4137k.m11208a(context, i + Constants.ACCEPT_TIME_SEPARATOR_SERVER + "isAbTest")) {
                        C4130h.m11178b("ABTEST", "流量内，打点");
                        return true;
                    }
                    C4130h.m11178b("ABTEST", "流量外");
                    return false;
                }
            }
            C4130h.m11178b("ABTEST", "4种无打点状态:" + a);
            return false;
        } catch (Exception e) {
            C4130h.m11174a("ABTEST", "Exception in getControlVarValue", (Throwable) e);
            return false;
        }
    }

    /* renamed from: c */
    private HashMap<String, String> m11061c(int i) {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            String a = C4137k.m11205a(this.f7014b, String.valueOf(i), "");
            String[] split = a.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            if (!TextUtils.isEmpty(a)) {
                if (split.length > 1) {
                    hashMap.put("control_key", split[0]);
                    hashMap.put("control_value", split[1]);
                    hashMap.put("abtest_category", "mistat_abtest");
                    return hashMap;
                }
            }
            JSONArray jSONArray = new JSONArray(C4137k.m11205a(this.f7014b, "mistat_group", "[]"));
            if (jSONArray.length() > 0) {
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.get(i2);
                    if (i == jSONObject.optInt("experiment_id")) {
                        hashMap.put("control_key", jSONObject.optString("control_key"));
                        hashMap.put("control_value", jSONObject.optString("control_value"));
                        hashMap.put("abtest_category", "mistat_group");
                    }
                }
            }
        } catch (Exception e) {
            C4130h.m11174a("ABTEST", "getGroupData exception", (Throwable) e);
        }
        return hashMap;
    }

    /* renamed from: c */
    private void m11062c(String str, String str2, int i) {
        try {
            String a = C4137k.m11205a(this.f7014b, "mistat_group", "");
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (!TextUtils.isEmpty(a)) {
                jSONArray = new JSONArray(a);
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    arrayList.add(Integer.valueOf(((JSONObject) jSONArray.get(i2)).optInt("experiment_id")));
                }
                if (!arrayList.contains(Integer.valueOf(i))) {
                    jSONObject.put("experiment_id", i);
                    jSONObject.put("control_key", str);
                }
                jSONArray.put(jSONObject);
                C4137k.m11212b(this.f7014b, "mistat_group", jSONArray.toString());
            }
            jSONObject.put("experiment_id", i);
            jSONObject.put("control_key", str);
            jSONObject.put("control_value", str2);
            jSONArray.put(jSONObject);
            C4137k.m11212b(this.f7014b, "mistat_group", jSONArray.toString());
        } catch (Exception e) {
            C4130h.m11174a("ABTEST", "updatePreGroups exception", (Throwable) e);
        }
    }

    /* renamed from: a */
    public String mo23023a(int i, String str, String str2) {
        String str3;
        try {
            int a = C4137k.m11202a(this.f7014b, m11049a(i), 0);
            if (!(a == -1 || a == 1)) {
                if (a != 3) {
                    String a2 = C4137k.m11205a(this.f7014b, String.valueOf(i), "");
                    if (TextUtils.isEmpty(a2)) {
                        str3 = "experimentId 找不到对象";
                    } else {
                        String[] split = a2.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                        if (split.length <= 1 || !str.equals(split[0])) {
                            str3 = String.format("分组异常 controlKey 不匹配:%s---%s", new Object[]{a2, str});
                        } else {
                            if (a == 2) {
                                String str4 = i + Constants.ACCEPT_TIME_SEPARATOR_SERVER + a2;
                                C4130h.m11178b("ABTEST", String.format("customKey:%s", new Object[]{str4}));
                                m11059b(str4, i);
                            }
                            return split[1];
                        }
                    }
                    C4130h.m11178b("ABTEST", str3);
                    return str2;
                }
            }
            str3 = "3种无需获取分组状态:" + a;
            C4130h.m11178b("ABTEST", str3);
        } catch (Exception e) {
            C4130h.m11174a("ABTEST", "Exception in getControlVarValue", (Throwable) e);
        }
        return str2;
    }

    /* renamed from: a */
    public void mo23024a(String str, int i) {
        if (m11060b(i)) {
            HashMap<String, String> c = m11061c(i);
            if (m11056a(i, c)) {
                LocalEventRecorder.insertEvent(new C4166b("mistat_metrics", "event", str, 1, (Map<String, String>) c));
            }
        }
    }

    /* renamed from: a */
    public void mo23025a(String str, long j, int i) {
        if (m11060b(i)) {
            HashMap<String, String> c = m11061c(i);
            if (m11056a(i, c)) {
                LocalEventRecorder.insertEvent(new C4166b("mistat_metrics", "count", str, j, (Map<String, String>) c));
            }
        }
    }

    /* renamed from: a */
    public void mo23026a(String str, String str2, int i) {
        if (m11060b(i)) {
            HashMap<String, String> c = m11061c(i);
            if (m11056a(i, c)) {
                LocalEventRecorder.insertEvent(new C4166b("mistat_metrics", DddTag.PL_PROPERTY, str, str2, (Map<String, String>) c));
            }
        }
    }

    /* renamed from: b */
    public void mo23027b() {
        try {
            long a = C4137k.m11203a(this.f7014b, "deploy_last_time", 0);
            C4130h.m11178b("ABTEST", String.format("abTest check config lastTime %d", new Object[]{Long.valueOf(a)}));
            if (a != 0) {
                if (!C4162q.m11291a(a, 1800000)) {
                    C4130h.m11178b("ABTEST", "没到更新时间, 从本地拿已缓存数据");
                    return;
                }
            }
            C4130h.m11178b("ABTEST", "更新数据");
            new Thread(new Runnable() {
                public void run() {
                    C4102a.m11058b(C4102a.this.f7014b, (C4132j.C4136b) new C4132j.C4136b() {
                        /* renamed from: a */
                        public void mo23019a(String str) {
                            C4102a.this.m11055a(str);
                        }
                    });
                }
            }).start();
        } catch (Exception e) {
            C4130h.m11176a("updateABTestConfig Exception:", (Throwable) e);
        }
    }

    /* renamed from: b */
    public void mo23028b(String str, long j, int i) {
        if (m11060b(i)) {
            HashMap<String, String> c = m11061c(i);
            if (m11056a(i, c)) {
                LocalEventRecorder.insertEvent(new C4166b("mistat_metrics", "numeric", str, j, (Map<String, String>) c));
            }
        }
    }

    /* renamed from: b */
    public void mo23029b(String str, String str2, int i) {
        if (m11060b(i)) {
            LocalEventRecorder.insertEvent(new C4169e("mistat_metrics", i + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str2, (Map<String, String>) null));
            m11062c(str, str2, i);
        }
    }
}

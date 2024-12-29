package com.xiaomi.mistatistic.sdk.controller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.miot.bluetooth.channel.packet.Packet;
import com.miot.service.connection.wifi.SmartConfigDataProvider;
import com.miot.service.connection.wifi.WebShellActivity;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mistatistic.sdk.BuildSetting;
import com.xiaomi.mistatistic.sdk.MiStatInterface;
import com.xiaomi.mistatistic.sdk.controller.C4115d;
import com.xiaomi.mistatistic.sdk.controller.C4132j;
import com.xiaomi.mistatistic.sdk.controller.asyncjobs.C4105a;
import com.xiaomi.mistatistic.sdk.data.HttpEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.xiaomi.mistatistic.sdk.controller.g */
public class C4124g {

    /* renamed from: a */
    private static C4124g f7065a = new C4124g();

    /* renamed from: b */
    private HttpEventFilter f7066b = new HttpEventFilter() {
        public HttpEvent onEvent(HttpEvent httpEvent) {
            String url = httpEvent.getUrl();
            if (TextUtils.isEmpty(url)) {
                return null;
            }
            httpEvent.setUrl(url.split("\\?")[0]);
            return httpEvent;
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<HttpEvent> f7067c = new LinkedList();

    /* renamed from: d */
    private Handler f7068d = new Handler(Looper.getMainLooper()) {
        public void handleMessage(Message message) {
            if (message.what == 1023) {
                C4115d.m11120b().mo23037a((C4115d.C4118a) new C4115d.C4118a() {
                    /* renamed from: a */
                    public void mo22986a() {
                        if (C4124g.this.mo23066c()) {
                            try {
                                List<HttpEvent> b = C4124g.this.mo23065b();
                                int size = b.size();
                                if (size > 0) {
                                    int i = 0;
                                    while (i < size) {
                                        int i2 = i + 30;
                                        final List<HttpEvent> subList = i2 >= size ? b.subList(i, size) : b.subList(i, i2);
                                        C4124g.this.m11154a(subList, (C4132j.C4136b) new C4132j.C4136b() {
                                            /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
                                            /* JADX WARNING: Removed duplicated region for block: B:9:0x003b A[Catch:{ Exception -> 0x0074 }] */
                                            /* renamed from: a */
                                            /* Code decompiled incorrectly, please refer to instructions dump. */
                                            public void mo23019a(java.lang.String r3) {
                                                /*
                                                    r2 = this;
                                                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                                    r0.<init>()
                                                    java.lang.String r1 = "http data complete, result="
                                                    r0.append(r1)
                                                    r0.append(r3)
                                                    java.lang.String r0 = r0.toString()
                                                    com.xiaomi.mistatistic.sdk.controller.C4130h.m11172a(r0)
                                                    boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0074 }
                                                    if (r0 != 0) goto L_0x0038
                                                    org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0074 }
                                                    r0.<init>(r3)     // Catch:{ Exception -> 0x0074 }
                                                    java.lang.String r3 = "ok"
                                                    java.lang.String r1 = "status"
                                                    java.lang.String r1 = r0.getString(r1)     // Catch:{ Exception -> 0x0074 }
                                                    boolean r3 = r3.equals(r1)     // Catch:{ Exception -> 0x0074 }
                                                    if (r3 == 0) goto L_0x0038
                                                    com.xiaomi.mistatistic.sdk.controller.g$2$1 r3 = com.xiaomi.mistatistic.sdk.controller.C4124g.C41262.C41271.this     // Catch:{ Exception -> 0x0074 }
                                                    com.xiaomi.mistatistic.sdk.controller.g$2 r3 = com.xiaomi.mistatistic.sdk.controller.C4124g.C41262.this     // Catch:{ Exception -> 0x0074 }
                                                    com.xiaomi.mistatistic.sdk.controller.g r3 = com.xiaomi.mistatistic.sdk.controller.C4124g.this     // Catch:{ Exception -> 0x0074 }
                                                    r3.mo23064a((org.json.JSONObject) r0)     // Catch:{ Exception -> 0x0074 }
                                                    r3 = 1
                                                    goto L_0x0039
                                                L_0x0038:
                                                    r3 = 0
                                                L_0x0039:
                                                    if (r3 == 0) goto L_0x007a
                                                    com.xiaomi.mistatistic.sdk.controller.g$2$1 r3 = com.xiaomi.mistatistic.sdk.controller.C4124g.C41262.C41271.this     // Catch:{ Exception -> 0x0074 }
                                                    com.xiaomi.mistatistic.sdk.controller.g$2 r3 = com.xiaomi.mistatistic.sdk.controller.C4124g.C41262.this     // Catch:{ Exception -> 0x0074 }
                                                    com.xiaomi.mistatistic.sdk.controller.g r3 = com.xiaomi.mistatistic.sdk.controller.C4124g.this     // Catch:{ Exception -> 0x0074 }
                                                    java.util.List r3 = r3.f7067c     // Catch:{ Exception -> 0x0074 }
                                                    monitor-enter(r3)     // Catch:{ Exception -> 0x0074 }
                                                    java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
                                                    r0.<init>()     // Catch:{ all -> 0x0071 }
                                                    java.lang.String r1 = "upload success, synchronizing remove http events "
                                                    r0.append(r1)     // Catch:{ all -> 0x0071 }
                                                    java.util.List r1 = r3     // Catch:{ all -> 0x0071 }
                                                    int r1 = r1.size()     // Catch:{ all -> 0x0071 }
                                                    r0.append(r1)     // Catch:{ all -> 0x0071 }
                                                    java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0071 }
                                                    com.xiaomi.mistatistic.sdk.controller.C4130h.m11172a(r0)     // Catch:{ all -> 0x0071 }
                                                    com.xiaomi.mistatistic.sdk.controller.g$2$1 r0 = com.xiaomi.mistatistic.sdk.controller.C4124g.C41262.C41271.this     // Catch:{ all -> 0x0071 }
                                                    com.xiaomi.mistatistic.sdk.controller.g$2 r0 = com.xiaomi.mistatistic.sdk.controller.C4124g.C41262.this     // Catch:{ all -> 0x0071 }
                                                    com.xiaomi.mistatistic.sdk.controller.g r0 = com.xiaomi.mistatistic.sdk.controller.C4124g.this     // Catch:{ all -> 0x0071 }
                                                    java.util.List r0 = r0.f7067c     // Catch:{ all -> 0x0071 }
                                                    java.util.List r1 = r3     // Catch:{ all -> 0x0071 }
                                                    r0.removeAll(r1)     // Catch:{ all -> 0x0071 }
                                                    monitor-exit(r3)     // Catch:{ all -> 0x0071 }
                                                    goto L_0x007a
                                                L_0x0071:
                                                    r0 = move-exception
                                                    monitor-exit(r3)     // Catch:{ all -> 0x0071 }
                                                    throw r0     // Catch:{ Exception -> 0x0074 }
                                                L_0x0074:
                                                    r3 = move-exception
                                                    java.lang.String r0 = "upload events response exception:"
                                                    com.xiaomi.mistatistic.sdk.controller.C4130h.m11176a((java.lang.String) r0, (java.lang.Throwable) r3)
                                                L_0x007a:
                                                    return
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mistatistic.sdk.controller.C4124g.C41262.C41271.C41281.mo23019a(java.lang.String):void");
                                            }
                                        });
                                        i = i2;
                                    }
                                }
                            } catch (IOException | JSONException e) {
                                C4130h.m11176a("", e);
                            }
                        } else if (C4124g.this.mo23067d()) {
                            C4124g.this.mo23063a(new JSONArray().toString(), (C4132j.C4136b) new C4132j.C4136b() {
                                /* renamed from: a */
                                public void mo23019a(String str) {
                                    C4130h.m11172a("upload empty http events result:" + str);
                                }
                            });
                        }
                    }
                });
            }
        }
    };

    private C4124g() {
    }

    /* renamed from: a */
    public static C4124g m11151a() {
        return f7065a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11154a(List<HttpEvent> list, C4132j.C4136b bVar) {
        HashMap hashMap = new HashMap();
        if (list != null && !list.isEmpty()) {
            for (HttpEvent next : list) {
                String url = next.getUrl();
                if (!TextUtils.isEmpty(url)) {
                    if (!hashMap.containsKey(url)) {
                        hashMap.put(url, new ArrayList());
                    }
                    ((List) hashMap.get(url)).add(next);
                }
            }
            if (!hashMap.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (String str : hashMap.keySet()) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (HttpEvent json : (List) hashMap.get(str)) {
                        jSONArray2.put(json.toJSON());
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(WebShellActivity.ARGS_KEY_URL, str);
                    jSONObject.put(Packet.DATA, jSONArray2);
                    jSONArray.put(jSONObject);
                }
                mo23063a(jSONArray.toString(), bVar);
            }
        }
    }

    /* renamed from: a */
    private boolean m11155a(String str) {
        return str.equals(m11156f()) || str.equals("https://data.mistat.xiaomi.com/micrash") || str.equals("https://data.mistat.xiaomi.com/mistats") || str.equals("http://data.mistat.xiaomi.com/mistats/v2") || str.equals("http://abtest.mistat.xiaomi.com/experiments");
    }

    /* renamed from: f */
    private String m11156f() {
        return BuildSetting.isTest() ? "http://10.99.168.145:8097/realtime_network" : "https://data.mistat.xiaomi.com/realtime_network";
    }

    /* renamed from: a */
    public void mo23061a(HttpEventFilter httpEventFilter) {
        this.f7066b = httpEventFilter;
    }

    /* renamed from: a */
    public void mo23062a(HttpEvent httpEvent) {
        String str;
        Context a = C4113c.m11105a();
        if (a == null) {
            str = "add http event without initialization.";
        } else if (BuildSetting.isDisabled(a)) {
            str = "disabled the http event upload";
        } else if (!m11155a(httpEvent.getUrl()) || BuildSetting.isSelfStats()) {
            if (this.f7066b != null && !httpEvent.getUrl().equals(m11156f())) {
                httpEvent = this.f7066b.onEvent(httpEvent);
            }
            if (httpEvent != null && !TextUtils.isEmpty(httpEvent.getUrl())) {
                synchronized (this.f7067c) {
                    this.f7067c.add(httpEvent);
                    if (this.f7067c.size() > 100) {
                        this.f7067c.remove(0);
                    }
                }
                if (!this.f7068d.hasMessages(1023) && !httpEvent.getUrl().equals(m11156f())) {
                    C4105a.m11074b();
                    this.f7068d.sendEmptyMessageDelayed(1023, mo23068e());
                    return;
                }
                return;
            }
            return;
        } else {
            return;
        }
        C4130h.m11172a(str);
    }

    /* renamed from: a */
    public void mo23063a(String str, C4132j.C4136b bVar) {
        TreeMap treeMap = new TreeMap();
        treeMap.put(Constants.APP_ID, C4113c.m11108b());
        treeMap.put("app_package", C4113c.m11114g());
        treeMap.put("app_key", C4113c.m11110c());
        treeMap.put("device_uuid", new C4120e().mo23042a());
        treeMap.put("device_os", "android" + Build.VERSION.SDK_INT);
        treeMap.put(SmartConfigDataProvider.KEY_DEVICE_MODEL, Build.MODEL);
        treeMap.put(Constants.EXTRA_KEY_APP_VERSION, C4113c.m11112e());
        treeMap.put("app_channel", C4113c.m11111d());
        treeMap.put("time", String.valueOf(System.currentTimeMillis()));
        treeMap.put("net_value", str);
        C4132j.m11190a(m11156f(), treeMap, bVar);
    }

    /* renamed from: a */
    public void mo23064a(JSONObject jSONObject) {
        if (jSONObject.has(Packet.DATA)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(Packet.DATA);
            int optInt = jSONObject2.optInt("sample_rate", 10000);
            int optInt2 = jSONObject2.optInt("delay", 300000);
            long optLong = jSONObject2.optLong("ban_time", 0);
            C4137k.m11210b(C4113c.m11105a(), "rt_upload_rate", optInt);
            C4137k.m11211b(C4113c.m11105a(), "rt_upload_delay", (long) optInt2);
            C4137k.m11211b(C4113c.m11105a(), "rt_ban_time", optLong);
            C4137k.m11211b(C4113c.m11105a(), "rt_update_time", System.currentTimeMillis());
        }
    }

    /* renamed from: b */
    public List<HttpEvent> mo23065b() {
        LinkedList linkedList;
        synchronized (this.f7067c) {
            linkedList = new LinkedList(this.f7067c);
        }
        return linkedList;
    }

    /* renamed from: c */
    public boolean mo23066c() {
        return System.currentTimeMillis() > C4137k.m11203a(C4113c.m11105a(), "rt_ban_time", 0) && Math.random() * 10000.0d <= ((double) C4137k.m11202a(C4113c.m11105a(), "rt_upload_rate", 10000));
    }

    /* renamed from: d */
    public boolean mo23067d() {
        return System.currentTimeMillis() - C4137k.m11203a(C4113c.m11105a(), "rt_update_time", 0) > MiStatInterface.MAX_UPLOAD_INTERVAL;
    }

    /* renamed from: e */
    public long mo23068e() {
        return C4137k.m11203a(C4113c.m11105a(), "rt_upload_delay", (long) Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL);
    }
}

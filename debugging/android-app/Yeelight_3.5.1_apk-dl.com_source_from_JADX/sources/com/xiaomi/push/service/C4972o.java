package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4719gc;
import com.xiaomi.push.C4747h;
import com.xiaomi.push.C4757hg;
import com.xiaomi.push.C4764hn;
import com.xiaomi.push.C4765ho;
import com.xiaomi.push.C4830m;
import com.xiaomi.push.C4835q;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: com.xiaomi.push.service.o */
public class C4972o {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a */
    private static volatile C4972o f9695a;

    /* renamed from: a */
    private int f9696a = -1;

    /* renamed from: a */
    private long f9697a;

    /* renamed from: a */
    private final Context f9698a;

    /* renamed from: a */
    private final SharedPreferences f9699a;

    /* renamed from: a */
    private String f9700a = null;

    /* renamed from: a */
    private final AtomicInteger f9701a = new AtomicInteger(0);

    /* renamed from: a */
    private volatile boolean f9702a = false;

    /* renamed from: b */
    private String f9703b = null;

    /* renamed from: b */
    private final AtomicInteger f9704b = new AtomicInteger(0);

    /* renamed from: b */
    private final boolean f9705b;

    /* renamed from: c */
    private final AtomicInteger f9706c = new AtomicInteger(0);

    /* renamed from: c */
    private final boolean f9707c;

    /* renamed from: com.xiaomi.push.service.o$a */
    private static class C4973a {
        /* renamed from: a */
        public static String m15613a() {
            return "support_wifi_digest";
        }

        /* renamed from: a */
        public static String m15614a(String str) {
            return String.format("HB_%s", new Object[]{str});
        }

        /* renamed from: b */
        public static String m15615b() {
            return "record_support_wifi_digest_reported";
        }

        /* renamed from: b */
        public static String m15616b(String str) {
            return String.format("HB_dead_time_%s", new Object[]{str});
        }

        /* renamed from: c */
        public static String m15617c() {
            return "record_hb_count_start";
        }

        /* renamed from: d */
        public static String m15618d() {
            return "record_short_hb_count";
        }

        /* renamed from: e */
        public static String m15619e() {
            return "record_long_hb_count";
        }

        /* renamed from: f */
        public static String m15620f() {
            return "record_hb_change";
        }

        /* renamed from: g */
        public static String m15621g() {
            return "record_mobile_ptc";
        }

        /* renamed from: h */
        public static String m15622h() {
            return "record_wifi_ptc";
        }

        /* renamed from: i */
        public static String m15623i() {
            return "record_ptc_start";
        }

        /* renamed from: j */
        public static String m15624j() {
            return "keep_short_hb_effective_time";
        }
    }

    private C4972o(Context context) {
        this.f9698a = context;
        this.f9707c = C4830m.m14998a(context);
        this.f9705b = C4898ba.m15362a(context).mo29996a(C4765ho.IntelligentHeartbeatSwitchBoolean.mo29322a(), true);
        SharedPreferences sharedPreferences = context.getSharedPreferences("hb_record", 0);
        this.f9699a = sharedPreferences;
        long currentTimeMillis = System.currentTimeMillis();
        if (sharedPreferences.getLong(C4973a.m15617c(), -1) == -1) {
            sharedPreferences.edit().putLong(C4973a.m15617c(), currentTimeMillis).apply();
        }
        long j = sharedPreferences.getLong(C4973a.m15623i(), -1);
        this.f9697a = j;
        if (j == -1) {
            this.f9697a = currentTimeMillis;
            sharedPreferences.edit().putLong(C4973a.m15623i(), currentTimeMillis).apply();
        }
    }

    /* renamed from: a */
    private int mo30056a() {
        if (TextUtils.isEmpty(this.f9700a)) {
            return -1;
        }
        try {
            return this.f9699a.getInt(C4973a.m15614a(this.f9700a), -1);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static C4972o m15587a(Context context) {
        if (f9695a == null) {
            synchronized (C4972o.class) {
                if (f9695a == null) {
                    f9695a = new C4972o(context);
                }
            }
        }
        return f9695a;
    }

    /* renamed from: a */
    private void m15588a(String str, String str2, Map<String, String> map) {
        C4764hn hnVar = new C4764hn();
        hnVar.mo29307d(str);
        hnVar.mo29303c("hb_name");
        hnVar.mo29295a("hb_channel");
        hnVar.mo29294a(1);
        hnVar.mo29300b(str2);
        hnVar.mo29297a(false);
        hnVar.mo29299b(System.currentTimeMillis());
        hnVar.mo29314g(this.f9698a.getPackageName());
        hnVar.mo29309e("com.xiaomi.xmsf");
        if (map == null) {
            map = new HashMap<>();
        }
        String str3 = null;
        C4984t a = C4985u.m15674a(this.f9698a);
        if (a != null && !TextUtils.isEmpty(a.f9741a)) {
            String[] split = a.f9741a.split("@");
            if (split.length > 0) {
                str3 = split[0];
            }
        }
        map.put("uuid", str3);
        map.put("model", Build.MODEL);
        Context context = this.f9698a;
        map.put("avc", String.valueOf(C4747h.m14123a(context, context.getPackageName())));
        map.put("pvc", String.valueOf(40091));
        map.put("cvc", String.valueOf(48));
        hnVar.mo29296a(map);
        C4757hg a2 = C4757hg.m14171a(this.f9698a);
        if (a2 != null) {
            a2.mo29279a(hnVar, this.f9698a.getPackageName());
        }
    }

    /* renamed from: a */
    private void m15589a(boolean z) {
        if (mo30061c()) {
            int incrementAndGet = (z ? this.f9704b : this.f9706c).incrementAndGet();
            Object[] objArr = new Object[2];
            String str = "short";
            objArr[0] = z ? str : "long";
            objArr[1] = Integer.valueOf(incrementAndGet);
            C4408b.m12481b(String.format("[HB] %s ping interval count: %s", objArr));
            if (incrementAndGet >= 5) {
                String d = z ? C4973a.m15618d() : C4973a.m15619e();
                int i = this.f9699a.getInt(d, 0) + incrementAndGet;
                this.f9699a.edit().putInt(d, i).apply();
                Object[] objArr2 = new Object[2];
                if (!z) {
                    str = "long";
                }
                objArr2[0] = str;
                objArr2[1] = Integer.valueOf(i);
                C4408b.m12464a(String.format("[HB] accumulate %s hb count(%s) and write to file. ", objArr2));
                (z ? this.f9704b : this.f9706c).set(0);
            }
        }
    }

    /* renamed from: a */
    private boolean m15590a() {
        return this.f9701a.get() >= Math.max(C4898ba.m15362a(this.f9698a).mo29988a(C4765ho.IntelligentHeartbeatNATCountInt.mo29322a(), 5), 3);
    }

    /* renamed from: a */
    private boolean mo30059a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("W-") || str.startsWith("M-");
    }

    /* renamed from: b */
    private long mo30060b() {
        return this.f9699a.getLong(C4973a.m15624j(), -1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m15593b(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "WIFI-ID-UNKNOWN"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0016
            java.lang.String r10 = r9.f9700a
            if (r10 == 0) goto L_0x0015
            java.lang.String r0 = "W-"
            boolean r10 = r10.startsWith(r0)
            if (r10 == 0) goto L_0x0015
            goto L_0x0018
        L_0x0015:
            r10 = 0
        L_0x0016:
            r9.f9700a = r10
        L_0x0018:
            android.content.SharedPreferences r10 = r9.f9699a
            java.lang.String r0 = r9.f9700a
            java.lang.String r0 = com.xiaomi.push.service.C4972o.C4973a.m15614a(r0)
            r1 = -1
            int r10 = r10.getInt(r0, r1)
            android.content.SharedPreferences r0 = r9.f9699a
            java.lang.String r2 = r9.f9700a
            java.lang.String r2 = com.xiaomi.push.service.C4972o.C4973a.m15616b(r2)
            r3 = -1
            long r5 = r0.getLong(r2, r3)
            long r7 = java.lang.System.currentTimeMillis()
            if (r10 == r1) goto L_0x0075
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 != 0) goto L_0x0056
            android.content.SharedPreferences r10 = r9.f9699a
            android.content.SharedPreferences$Editor r10 = r10.edit()
            java.lang.String r0 = r9.f9700a
            java.lang.String r0 = com.xiaomi.push.service.C4972o.C4973a.m15616b(r0)
            long r2 = r9.mo30061c()
            long r7 = r7 + r2
            android.content.SharedPreferences$Editor r10 = r10.putLong(r0, r7)
        L_0x0052:
            r10.apply()
            goto L_0x0075
        L_0x0056:
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 <= 0) goto L_0x0075
            android.content.SharedPreferences r10 = r9.f9699a
            android.content.SharedPreferences$Editor r10 = r10.edit()
            java.lang.String r0 = r9.f9700a
            java.lang.String r0 = com.xiaomi.push.service.C4972o.C4973a.m15614a(r0)
            android.content.SharedPreferences$Editor r10 = r10.remove(r0)
            java.lang.String r0 = r9.f9700a
            java.lang.String r0 = com.xiaomi.push.service.C4972o.C4973a.m15616b(r0)
            android.content.SharedPreferences$Editor r10 = r10.remove(r0)
            goto L_0x0052
        L_0x0075:
            java.util.concurrent.atomic.AtomicInteger r10 = r9.f9701a
            r0 = 0
            r10.getAndSet(r0)
            java.lang.String r10 = r9.f9700a
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            r2 = 1
            if (r10 != 0) goto L_0x008e
            int r10 = r9.mo30056a()
            if (r10 == r1) goto L_0x008b
            goto L_0x008e
        L_0x008b:
            r9.f9702a = r2
            goto L_0x0090
        L_0x008e:
            r9.f9702a = r0
        L_0x0090:
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.String r1 = r9.f9700a
            r10[r0] = r1
            boolean r0 = r9.f9702a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r10[r2] = r0
            java.lang.String r0 = "[HB] network changed, netid:%s, %s"
            java.lang.String r10 = java.lang.String.format(r0, r10)
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4972o.m15593b(java.lang.String):void");
    }

    /* renamed from: b */
    private boolean m15594b() {
        return !TextUtils.isEmpty(this.f9700a) && this.f9700a.startsWith("M-") && !C4898ba.m15362a(this.f9698a).mo29996a(C4765ho.IntelligentHeartbeatUseInMobileNetworkBoolean.mo29322a(), false);
    }

    /* renamed from: c */
    private long mo30061c() {
        return C4898ba.m15362a(this.f9698a).mo29990a(C4765ho.ShortHeartbeatEffectivePeriodMsLong.mo29322a(), 777600000);
    }

    /* renamed from: c */
    private void m15596c(String str) {
        if (mo30059a(str)) {
            this.f9699a.edit().putInt(C4973a.m15614a(str), 235000).apply();
            this.f9699a.edit().putLong(C4973a.m15616b(this.f9700a), System.currentTimeMillis() + mo30061c()).apply();
        }
    }

    /* renamed from: c */
    private boolean m15597c() {
        return mo30062d() && C4898ba.m15362a(this.f9698a).mo29996a(C4765ho.IntelligentHeartbeatDataCollectSwitchBoolean.mo29322a(), true) && C4835q.China.name().equals(C4860a.m15159a(this.f9698a).mo29957a());
    }

    /* renamed from: d */
    private void m15598d(String str) {
        String str2;
        String str3;
        if (mo30061c() && !TextUtils.isEmpty(str)) {
            if (str.startsWith("W-")) {
                str2 = "W";
            } else if (str.startsWith("M-")) {
                str2 = "M";
            } else {
                return;
            }
            String valueOf = String.valueOf(235000);
            String valueOf2 = String.valueOf(System.currentTimeMillis() / 1000);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(":::");
            sb.append(str2);
            sb.append(":::");
            sb.append(valueOf);
            sb.append(":::");
            sb.append(valueOf2);
            String string = this.f9699a.getString(C4973a.m15620f(), (String) null);
            if (TextUtils.isEmpty(string)) {
                str3 = sb.toString();
            } else {
                str3 = string + "###" + sb.toString();
            }
            this.f9699a.edit().putString(C4973a.m15620f(), str3).apply();
        }
    }

    /* renamed from: d */
    private boolean mo30062d() {
        return this.f9707c && (this.f9705b || ((mo30060b() > System.currentTimeMillis() ? 1 : (mo30060b() == System.currentTimeMillis() ? 0 : -1)) >= 0));
    }

    /* renamed from: e */
    private void m15600e() {
        if (!this.f9699a.getBoolean(C4973a.m15613a(), false)) {
            this.f9699a.edit().putBoolean(C4973a.m15613a(), true).apply();
        }
    }

    /* renamed from: e */
    private boolean m15601e() {
        long j = this.f9699a.getLong(C4973a.m15617c(), -1);
        if (j == -1) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        return j > currentTimeMillis || currentTimeMillis - j >= 259200000;
    }

    /* renamed from: f */
    private void m15602f() {
        int i = this.f9696a;
        String h = i != 0 ? i != 1 ? null : C4973a.m15622h() : C4973a.m15621g();
        if (!TextUtils.isEmpty(h)) {
            if (this.f9699a.getLong(C4973a.m15623i(), -1) == -1) {
                this.f9697a = System.currentTimeMillis();
                this.f9699a.edit().putLong(C4973a.m15623i(), this.f9697a).apply();
            }
            this.f9699a.edit().putInt(h, this.f9699a.getInt(h, 0) + 1).apply();
        }
    }

    /* renamed from: f */
    private boolean m15603f() {
        if (this.f9697a == -1) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f9697a;
        return j > currentTimeMillis || currentTimeMillis - j >= 259200000;
    }

    /* renamed from: g */
    private void m15604g() {
        int i;
        String[] split;
        String[] split2;
        if (mo30061c()) {
            String string = this.f9699a.getString(C4973a.m15620f(), (String) null);
            char c = 1;
            char c2 = 0;
            if (!TextUtils.isEmpty(string) && (split = string.split("###")) != null) {
                int i2 = 0;
                while (i2 < split.length) {
                    if (!TextUtils.isEmpty(split[i2]) && (split2 = split[i2].split(":::")) != null && split2.length >= 4) {
                        String str = split2[c2];
                        String str2 = split2[c];
                        String str3 = split2[2];
                        String str4 = split2[3];
                        HashMap hashMap = new HashMap();
                        hashMap.put("event", "change");
                        hashMap.put("model", Build.MODEL);
                        hashMap.put("net_type", str2);
                        hashMap.put("net_name", str);
                        hashMap.put("interval", str3);
                        hashMap.put("timestamp", str4);
                        m15588a("category_hb_change", (String) null, hashMap);
                        C4408b.m12464a("[HB] report hb changed events.");
                    }
                    i2++;
                    c = 1;
                    c2 = 0;
                }
                this.f9699a.edit().remove(C4973a.m15620f()).apply();
            }
            if (this.f9699a.getBoolean(C4973a.m15613a(), false) && !this.f9699a.getBoolean(C4973a.m15615b(), false)) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("event", "support");
                hashMap2.put("model", Build.MODEL);
                hashMap2.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));
                m15588a("category_hb_change", (String) null, hashMap2);
                C4408b.m12464a("[HB] report support wifi digest events.");
                this.f9699a.edit().putBoolean(C4973a.m15615b(), true).apply();
            }
            if (m15600e()) {
                int i3 = this.f9699a.getInt(C4973a.m15618d(), 0);
                int i4 = this.f9699a.getInt(C4973a.m15619e(), 0);
                if (i3 > 0 || i4 > 0) {
                    long j = this.f9699a.getLong(C4973a.m15617c(), -1);
                    String valueOf = String.valueOf(235000);
                    String valueOf2 = String.valueOf(j);
                    String valueOf3 = String.valueOf(System.currentTimeMillis());
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("interval", valueOf);
                        jSONObject.put("c_short", String.valueOf(i3));
                        jSONObject.put("c_long", String.valueOf(i4));
                        jSONObject.put("count", String.valueOf(i3 + i4));
                        jSONObject.put("start_time", valueOf2);
                        jSONObject.put("end_time", valueOf3);
                        String jSONObject2 = jSONObject.toString();
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("event", "long_and_short_hb_count");
                        m15588a("category_hb_count", jSONObject2, hashMap3);
                        C4408b.m12464a("[HB] report short/long hb count events.");
                    } catch (Throwable unused) {
                    }
                }
                this.f9699a.edit().putInt(C4973a.m15618d(), 0).putInt(C4973a.m15619e(), 0).putLong(C4973a.m15617c(), System.currentTimeMillis()).apply();
            }
            if (m15602f()) {
                String valueOf4 = String.valueOf(this.f9697a);
                String valueOf5 = String.valueOf(System.currentTimeMillis());
                int i5 = this.f9699a.getInt(C4973a.m15621g(), 0);
                if (i5 > 0) {
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("net_type", "M");
                        jSONObject3.put("ptc", i5);
                        jSONObject3.put("start_time", valueOf4);
                        jSONObject3.put("end_time", valueOf5);
                        String jSONObject4 = jSONObject3.toString();
                        HashMap hashMap4 = new HashMap();
                        hashMap4.put("event", "ptc_event");
                        m15588a("category_lc_ptc", jSONObject4, hashMap4);
                        C4408b.m12464a("[HB] report ping timeout count events of mobile network.");
                        this.f9699a.edit().putInt(C4973a.m15621g(), 0).apply();
                    } catch (Throwable unused2) {
                        i = 0;
                        this.f9699a.edit().putInt(C4973a.m15621g(), 0).apply();
                    }
                }
                i = 0;
                int i6 = this.f9699a.getInt(C4973a.m15622h(), i);
                if (i6 > 0) {
                    try {
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("net_type", "W");
                        jSONObject5.put("ptc", i6);
                        jSONObject5.put("start_time", valueOf4);
                        jSONObject5.put("end_time", valueOf5);
                        String jSONObject6 = jSONObject5.toString();
                        HashMap hashMap5 = new HashMap();
                        hashMap5.put("event", "ptc_event");
                        m15588a("category_lc_ptc", jSONObject6, hashMap5);
                        C4408b.m12464a("[HB] report ping timeout count events of wifi network.");
                    } catch (Throwable unused3) {
                    }
                    this.f9699a.edit().putInt(C4973a.m15622h(), 0).apply();
                }
                this.f9697a = System.currentTimeMillis();
                this.f9699a.edit().putLong(C4973a.m15623i(), this.f9697a).apply();
            }
        }
    }

    /* renamed from: a */
    public long m15605a() {
        int a;
        long b = (long) C4719gc.m13995b();
        boolean z = true;
        if (this.f9707c && !mo30060b() && ((C4898ba.m15362a(this.f9698a).mo29996a(C4765ho.IntelligentHeartbeatSwitchBoolean.mo29322a(), true) || mo30060b() >= System.currentTimeMillis()) && (a = mo30056a()) != -1)) {
            b = (long) a;
        }
        if (!TextUtils.isEmpty(this.f9700a) && !"WIFI-ID-UNKNOWN".equals(this.f9700a) && this.f9696a == 1) {
            if (b >= Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL) {
                z = false;
            }
            m15589a(z);
        }
        C4408b.m12464a("[HB] ping interval:" + b);
        return b;
    }

    /* renamed from: a */
    public void m15606a() {
    }

    /* renamed from: a */
    public void mo30057a(int i) {
        this.f9699a.edit().putLong(C4973a.m15624j(), System.currentTimeMillis() + ((long) (i * 1000))).apply();
    }

    /* renamed from: a */
    public synchronized void mo30058a(NetworkInfo networkInfo) {
        if (mo30062d()) {
            String str = null;
            if (networkInfo == null) {
                m15593b((String) null);
            } else if (networkInfo.getType() == 0) {
                String subtypeName = networkInfo.getSubtypeName();
                if (!TextUtils.isEmpty(subtypeName) && !"UNKNOWN".equalsIgnoreCase(subtypeName)) {
                    str = "M-" + subtypeName;
                }
                m15593b(str);
                this.f9696a = 0;
            } else {
                if (networkInfo.getType() != 1) {
                    if (networkInfo.getType() != 6) {
                        m15593b((String) null);
                    }
                }
                m15593b("WIFI-ID-UNKNOWN");
                this.f9696a = 1;
            }
            this.f9696a = -1;
        }
    }

    /* renamed from: a */
    public synchronized void m15609a(String str) {
        if (!TextUtils.isEmpty(str)) {
            m15600e();
        }
        if (mo30062d() && !TextUtils.isEmpty(str)) {
            m15593b("W-" + str);
        }
    }

    /* renamed from: b */
    public void m15610b() {
        if (mo30062d()) {
            m15602f();
            if (this.f9702a && !TextUtils.isEmpty(this.f9700a) && this.f9700a.equals(this.f9703b)) {
                this.f9701a.getAndIncrement();
                C4408b.m12464a("[HB] ping timeout count:" + this.f9701a);
                if (mo30056a()) {
                    C4408b.m12464a("[HB] change hb interval for net:" + this.f9700a);
                    m15596c(this.f9700a);
                    this.f9702a = false;
                    this.f9701a.getAndSet(0);
                    m15598d(this.f9700a);
                }
            }
        }
    }

    /* renamed from: c */
    public void m15611c() {
        if (mo30062d()) {
            this.f9703b = this.f9700a;
        }
    }

    /* renamed from: d */
    public void m15612d() {
        if (mo30062d()) {
            m15604g();
            if (this.f9702a) {
                this.f9701a.getAndSet(0);
            }
        }
    }
}

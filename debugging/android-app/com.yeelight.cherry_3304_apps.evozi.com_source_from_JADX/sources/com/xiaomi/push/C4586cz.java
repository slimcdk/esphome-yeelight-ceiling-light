package com.xiaomi.push;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.p005os.EnvironmentCompat;
import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import com.miot.bluetooth.channel.packet.Packet;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.service.C4836a;
import com.xiaomi.push.service.module.PushChannelRegion;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.p271io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.xiaomi.push.cz */
public class C4586cz {

    /* renamed from: a */
    protected static Context f8354a;

    /* renamed from: a */
    private static C4587a f8355a;

    /* renamed from: a */
    private static C4586cz f8356a;

    /* renamed from: a */
    protected static boolean f8357a = false;

    /* renamed from: b */
    protected static Map<String, C4582cv> f8358b = new HashMap();

    /* renamed from: c */
    private static String f8359c;

    /* renamed from: d */
    private static String f8360d;

    /* renamed from: a */
    private long f8361a;

    /* renamed from: a */
    private C4585cy f8362a;

    /* renamed from: a */
    protected C4588b f8363a;

    /* renamed from: a */
    private String f8364a;

    /* renamed from: a */
    protected Map<String, C4583cw> f8365a;

    /* renamed from: b */
    private final long f8366b;

    /* renamed from: b */
    private String f8367b;

    /* renamed from: c */
    private long f8368c;

    /* renamed from: com.xiaomi.push.cz$a */
    public interface C4587a {
        /* renamed from: a */
        C4586cz mo24901a(Context context, C4585cy cyVar, C4588b bVar, String str);
    }

    /* renamed from: com.xiaomi.push.cz$b */
    public interface C4588b {
        /* renamed from: a */
        String mo24902a(String str);
    }

    protected C4586cz(Context context, C4585cy cyVar, C4588b bVar, String str) {
        this(context, cyVar, bVar, str, (String) null, (String) null);
    }

    protected C4586cz(Context context, C4585cy cyVar, C4588b bVar, String str, String str2, String str3) {
        this.f8365a = new HashMap();
        this.f8364a = TimerCodec.DISENABLE;
        this.f8361a = 0;
        this.f8366b = 15;
        this.f8368c = 0;
        this.f8367b = "isp_prov_city_country_ip";
        this.f8363a = bVar;
        this.f8362a = cyVar == null ? new C4590da(this) : cyVar;
        this.f8364a = str;
        f8359c = str2 == null ? context.getPackageName() : str2;
        f8360d = str3 == null ? m13658f() : str3;
    }

    /* renamed from: a */
    public static synchronized C4586cz mo24892a() {
        C4586cz czVar;
        synchronized (C4586cz.class) {
            if (f8356a != null) {
                czVar = f8356a;
            } else {
                throw new IllegalStateException("the host manager is not initialized yet.");
            }
        }
        return czVar;
    }

    /* renamed from: a */
    static String m13652a() {
        NetworkInfo activeNetworkInfo;
        Context context = f8354a;
        if (context == null) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return EnvironmentCompat.MEDIA_UNKNOWN;
            }
            if (activeNetworkInfo.getType() == 1) {
                WifiManager wifiManager = (WifiManager) f8354a.getSystemService("wifi");
                if (!(wifiManager == null || wifiManager.getConnectionInfo() == null)) {
                    return "WIFI-" + wifiManager.getConnectionInfo().getSSID();
                }
                return EnvironmentCompat.MEDIA_UNKNOWN;
            }
            return activeNetworkInfo.getTypeName() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + activeNetworkInfo.getSubtypeName();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    static String mo24889a(String str) {
        try {
            int length = str.length();
            byte[] bytes = str.getBytes("UTF-8");
            for (int i = 0; i < bytes.length; i++) {
                byte b = bytes[i];
                byte b2 = b & 240;
                if (b2 != 240) {
                    bytes[i] = (byte) (((b & ParameterInitDefType.CubemapSamplerInit) ^ ((byte) (((b >> 4) + length) & 15))) | b2);
                }
            }
            return new String(bytes);
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    /* renamed from: a */
    private ArrayList<C4582cv> m13654a(ArrayList<String> arrayList) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        ArrayList<String> arrayList2 = arrayList;
        mo24899d();
        synchronized (this.f8365a) {
            mo24892a();
            for (String next : this.f8365a.keySet()) {
                if (!arrayList2.contains(next)) {
                    arrayList2.add(next);
                }
            }
        }
        boolean isEmpty = f8358b.isEmpty();
        synchronized (f8358b) {
            for (Object obj : f8358b.values().toArray()) {
                C4582cv cvVar = (C4582cv) obj;
                if (!cvVar.mo24878b()) {
                    f8358b.remove(cvVar.f8341b);
                    isEmpty = true;
                }
            }
        }
        if (!arrayList2.contains(mo24895b())) {
            arrayList2.add(mo24895b());
        }
        ArrayList<C4582cv> arrayList3 = new ArrayList<>(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList3.add((Object) null);
        }
        try {
            String str = C4521az.m13368d(f8354a) ? "wifi" : "wap";
            String a = mo24891a(arrayList2, str, this.f8364a, isEmpty);
            if (!TextUtils.isEmpty(a)) {
                JSONObject jSONObject3 = new JSONObject(a);
                C3989b.m10679b(a);
                if ("OK".equalsIgnoreCase(jSONObject3.getString("S"))) {
                    JSONObject jSONObject4 = jSONObject3.getJSONObject("R");
                    String string = jSONObject4.getString("province");
                    String string2 = jSONObject4.getString("city");
                    String string3 = jSONObject4.getString("isp");
                    String string4 = jSONObject4.getString("ip");
                    String string5 = jSONObject4.getString("country");
                    JSONObject jSONObject5 = jSONObject4.getJSONObject(str);
                    C3989b.m10680c("get bucket: net=" + string3 + ", hosts=" + jSONObject5.toString());
                    int i2 = 0;
                    while (i2 < arrayList.size()) {
                        String str2 = arrayList2.get(i2);
                        JSONArray optJSONArray = jSONObject5.optJSONArray(str2);
                        if (optJSONArray == null) {
                            C3989b.m10669a("no bucket found for " + str2);
                            jSONObject = jSONObject5;
                        } else {
                            C4582cv cvVar2 = new C4582cv(str2);
                            int i3 = 0;
                            while (i3 < optJSONArray.length()) {
                                String string6 = optJSONArray.getString(i3);
                                if (!TextUtils.isEmpty(string6)) {
                                    jSONObject2 = jSONObject5;
                                    cvVar2.mo24868a(new C4595de(string6, optJSONArray.length() - i3));
                                } else {
                                    jSONObject2 = jSONObject5;
                                }
                                i3++;
                                jSONObject5 = jSONObject2;
                            }
                            jSONObject = jSONObject5;
                            arrayList3.set(i2, cvVar2);
                            cvVar2.f8346g = string5;
                            cvVar2.f8342c = string;
                            cvVar2.f8344e = string3;
                            cvVar2.f8345f = string4;
                            cvVar2.f8343d = string2;
                            if (jSONObject4.has("stat-percent")) {
                                cvVar2.mo24866a(jSONObject4.getDouble("stat-percent"));
                            }
                            if (jSONObject4.has("stat-domain")) {
                                cvVar2.mo24875b(jSONObject4.getString("stat-domain"));
                            }
                            if (jSONObject4.has("ttl")) {
                                cvVar2.mo24867a(((long) jSONObject4.getInt("ttl")) * 1000);
                            }
                            mo24889a(cvVar2.mo24863a());
                        }
                        i2++;
                        jSONObject5 = jSONObject;
                    }
                    JSONObject optJSONObject = jSONObject4.optJSONObject("reserved");
                    if (optJSONObject != null) {
                        long j = 604800000;
                        if (jSONObject4.has("reserved-ttl")) {
                            j = ((long) jSONObject4.getInt("reserved-ttl")) * 1000;
                        }
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String next2 = keys.next();
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray(next2);
                            if (optJSONArray2 == null) {
                                C3989b.m10669a("no bucket found for " + next2);
                            } else {
                                C4582cv cvVar3 = new C4582cv(next2);
                                cvVar3.mo24867a(j);
                                for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                                    String string7 = optJSONArray2.getString(i4);
                                    if (!TextUtils.isEmpty(string7)) {
                                        cvVar3.mo24868a(new C4595de(string7, optJSONArray2.length() - i4));
                                    }
                                }
                                synchronized (f8358b) {
                                    if (this.f8362a.mo24888a(next2)) {
                                        f8358b.put(next2, cvVar3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            C3989b.m10669a("failed to get bucket " + e.getMessage());
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            C4582cv cvVar4 = arrayList3.get(i5);
            if (cvVar4 != null) {
                mo24893a(arrayList2.get(i5), cvVar4);
            }
        }
        mo24897c();
        return arrayList3;
    }

    /* renamed from: a */
    public static synchronized void m13655a(Context context, C4585cy cyVar, C4588b bVar, String str, String str2, String str3) {
        synchronized (C4586cz.class) {
            Context applicationContext = context.getApplicationContext();
            f8354a = applicationContext;
            if (applicationContext == null) {
                f8354a = context;
            }
            if (f8356a == null) {
                if (f8355a == null) {
                    f8356a = new C4586cz(context, cyVar, bVar, str, str2, str3);
                } else {
                    f8356a = f8355a.mo24901a(context, cyVar, bVar, str);
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m13656a(C4587a aVar) {
        synchronized (C4586cz.class) {
            f8355a = aVar;
            f8356a = null;
        }
    }

    /* renamed from: a */
    public static void m13657a(String str, String str2) {
        C4582cv cvVar = f8358b.get(str);
        synchronized (f8358b) {
            if (cvVar == null) {
                C4582cv cvVar2 = new C4582cv(str);
                cvVar2.mo24867a(604800000);
                cvVar2.mo24864a(str2);
                f8358b.put(str, cvVar2);
            } else {
                cvVar.mo24864a(str2);
            }
        }
    }

    /* renamed from: f */
    private String m13658f() {
        try {
            PackageInfo packageInfo = f8354a.getPackageManager().getPackageInfo(f8354a.getPackageName(), 16384);
            return packageInfo != null ? packageInfo.versionName : TimerCodec.DISENABLE;
        } catch (Exception unused) {
            return TimerCodec.DISENABLE;
        }
    }

    /* renamed from: a */
    public C4582cv m13659a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return mo24890a(new URL(str).getHost(), true);
        }
        throw new IllegalArgumentException("the url is empty");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        r4 = mo24898d(r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.xiaomi.push.C4582cv mo24890a(java.lang.String r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0034
            com.xiaomi.push.cy r0 = r2.f8362a
            boolean r0 = r0.mo24888a(r3)
            if (r0 != 0) goto L_0x0010
            r3 = 0
            return r3
        L_0x0010:
            com.xiaomi.push.cv r0 = r2.mo24896c(r3)
            if (r0 == 0) goto L_0x001d
            boolean r1 = r0.mo24878b()
            if (r1 == 0) goto L_0x001d
            return r0
        L_0x001d:
            if (r4 == 0) goto L_0x002e
            android.content.Context r4 = f8354a
            boolean r4 = com.xiaomi.push.C4521az.m13366b(r4)
            if (r4 == 0) goto L_0x002e
            com.xiaomi.push.cv r4 = r2.mo24898d(r3)
            if (r4 == 0) goto L_0x002e
            return r4
        L_0x002e:
            com.xiaomi.push.db r4 = new com.xiaomi.push.db
            r4.<init>(r2, r3, r0)
            return r4
        L_0x0034:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "the host is empty"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4586cz.mo24890a(java.lang.String, boolean):com.xiaomi.push.cv");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo24891a(ArrayList<String> arrayList, String str, String str2, boolean z) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<C4520ay> arrayList3 = new ArrayList<>();
        arrayList3.add(new C4518aw("type", str));
        if (str.equals("wap")) {
            arrayList3.add(new C4518aw("conpt", mo24889a(C4521az.m13351a(f8354a))));
        }
        if (z) {
            arrayList3.add(new C4518aw("reserved", TimerCodec.ENABLE));
        }
        arrayList3.add(new C4518aw("uuid", str2));
        arrayList3.add(new C4518aw("list", C4532bf.m13433a((Collection<?>) arrayList, Constants.ACCEPT_TIME_SEPARATOR_SP)));
        arrayList3.add(new C4518aw("countrycode", C4836a.m15481a(f8354a).mo25896b()));
        C4582cv c = mo24896c(mo24895b());
        String format = String.format(Locale.US, "http://%1$s/gslb/?ver=4.0", new Object[]{mo24895b()});
        if (c == null) {
            arrayList2.add(format);
            synchronized (f8358b) {
                C4582cv cvVar = f8358b.get("resolver.msg.xiaomi.net");
                if (cvVar != null) {
                    Iterator<String> it = cvVar.mo24865a(true).iterator();
                    while (it.hasNext()) {
                        arrayList2.add(String.format(Locale.US, "http://%1$s/gslb/?ver=4.0", new Object[]{it.next()}));
                    }
                }
            }
        } else {
            arrayList2 = c.mo24864a(format);
        }
        Iterator<String> it2 = arrayList2.iterator();
        IOException e = null;
        while (it2.hasNext()) {
            Uri.Builder buildUpon = Uri.parse(it2.next()).buildUpon();
            for (C4520ay ayVar : arrayList3) {
                buildUpon.appendQueryParameter(ayVar.mo24751a(), ayVar.mo24752b());
            }
            try {
                return this.f8363a == null ? C4521az.m13358a(f8354a, new URL(buildUpon.toString())) : this.f8363a.mo24902a(buildUpon.toString());
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (e == null) {
            return null;
        }
        C3989b.m10669a("network exception: " + e.getMessage());
        throw e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public JSONObject m13662a() {
        JSONObject jSONObject;
        synchronized (this.f8365a) {
            jSONObject = new JSONObject();
            jSONObject.put("ver", 2);
            JSONArray jSONArray = new JSONArray();
            for (C4583cw a : this.f8365a.values()) {
                jSONArray.put(a.mo24881a());
            }
            jSONObject.put(Packet.DATA, jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (C4582cv a2 : f8358b.values()) {
                jSONArray2.put(a2.mo24863a());
            }
            jSONObject.put("reserved", jSONArray2);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public void m13663a() {
        synchronized (this.f8365a) {
            this.f8365a.clear();
        }
    }

    /* renamed from: a */
    public void m13664a(String str) {
        this.f8367b = str;
    }

    /* renamed from: a */
    public void mo24893a(String str, C4582cv cvVar) {
        if (TextUtils.isEmpty(str) || cvVar == null) {
            throw new IllegalArgumentException("the argument is invalid " + str + ", " + cvVar);
        } else if (this.f8362a.mo24888a(str)) {
            synchronized (this.f8365a) {
                mo24892a();
                if (this.f8365a.containsKey(str)) {
                    this.f8365a.get(str).mo24883a(cvVar);
                } else {
                    C4583cw cwVar = new C4583cw(str);
                    cwVar.mo24883a(cvVar);
                    this.f8365a.put(str, cwVar);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean m13666a() {
        synchronized (this.f8365a) {
            if (f8357a) {
                return true;
            }
            f8357a = true;
            this.f8365a.clear();
            try {
                String d = mo24899d();
                if (!TextUtils.isEmpty(d)) {
                    mo24894b(d);
                    C3989b.m10679b("loading the new hosts succeed");
                    return true;
                }
            } catch (Throwable th) {
                C3989b.m10669a("load bucket failure: " + th.getMessage());
            }
        }
        return false;
    }

    /* renamed from: b */
    public C4582cv mo24894b(String str) {
        return mo24890a(str, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo24895b() {
        String a = C4836a.m15481a(f8354a).mo25894a();
        return (TextUtils.isEmpty(a) || PushChannelRegion.China.name().equals(a)) ? "resolver.msg.xiaomi.net" : "resolver.msg.global.xiaomi.net";
    }

    /* renamed from: b */
    public void m13669b() {
        ArrayList arrayList;
        synchronized (this.f8365a) {
            mo24892a();
            arrayList = new ArrayList(this.f8365a.keySet());
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C4583cw cwVar = this.f8365a.get(arrayList.get(size));
                if (!(cwVar == null || cwVar.mo24881a() == null)) {
                    arrayList.remove(size);
                }
            }
        }
        ArrayList<C4582cv> a = m13654a((ArrayList<String>) arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            if (a.get(i) != null) {
                mo24893a((String) arrayList.get(i), a.get(i));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void m13670b(String str) {
        synchronized (this.f8365a) {
            this.f8365a.clear();
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("ver") == 2) {
                JSONArray optJSONArray = jSONObject.optJSONArray(Packet.DATA);
                for (int i = 0; i < optJSONArray.length(); i++) {
                    C4583cw a = new C4583cw().mo24882a(optJSONArray.getJSONObject(i));
                    this.f8365a.put(a.mo24881a(), a);
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("reserved");
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    C4582cv a2 = new C4582cv("").mo24862a(optJSONArray2.getJSONObject(i2));
                    f8358b.put(a2.f8341b, a2);
                }
            } else {
                throw new JSONException("Bad version");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C4582cv mo24896c(String str) {
        C4583cw cwVar;
        C4582cv a;
        synchronized (this.f8365a) {
            mo24892a();
            cwVar = this.f8365a.get(str);
        }
        if (cwVar == null || (a = cwVar.mo24881a()) == null) {
            return null;
        }
        return a;
    }

    /* renamed from: c */
    public String mo24897c() {
        StringBuilder sb = new StringBuilder();
        synchronized (this.f8365a) {
            for (Map.Entry next : this.f8365a.entrySet()) {
                sb.append((String) next.getKey());
                sb.append(":\n");
                sb.append(((C4583cw) next.getValue()).toString());
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    public void m13673c() {
        synchronized (this.f8365a) {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(f8354a.openFileOutput(mo24900e(), 0)));
                String jSONObject = mo24892a().toString();
                if (!TextUtils.isEmpty(jSONObject)) {
                    bufferedWriter.write(jSONObject);
                }
                bufferedWriter.close();
            } catch (Exception e) {
                C3989b.m10669a("persist bucket failure: " + e.getMessage());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C4582cv mo24898d(String str) {
        if (System.currentTimeMillis() - this.f8368c <= this.f8361a * 60 * 1000) {
            return null;
        }
        this.f8368c = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        C4582cv cvVar = m13654a((ArrayList<String>) arrayList).get(0);
        if (cvVar != null) {
            this.f8361a = 0;
            return cvVar;
        }
        long j = this.f8361a;
        if (j >= 15) {
            return null;
        }
        this.f8361a = j + 1;
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo24899d() {
        BufferedReader bufferedReader;
        try {
            File file = new File(f8354a.getFilesDir(), mo24900e());
            if (file.isFile()) {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            sb.append(readLine);
                        } else {
                            String sb2 = sb.toString();
                            C4942y.m15884a((Closeable) bufferedReader);
                            return sb2;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        C3989b.m10669a("load host exception " + th.getMessage());
                        return null;
                    } finally {
                        C4942y.m15884a((Closeable) bufferedReader);
                    }
                }
            } else {
                C4942y.m15884a((Closeable) null);
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
            C3989b.m10669a("load host exception " + th.getMessage());
            return null;
        }
    }

    /* renamed from: d */
    public void m13676d() {
        synchronized (this.f8365a) {
            for (C4583cw a : this.f8365a.values()) {
                a.mo24884a(true);
            }
            while (true) {
                for (boolean z = false; !z; z = true) {
                    for (String next : this.f8365a.keySet()) {
                        if (this.f8365a.get(next).mo24881a().isEmpty()) {
                            this.f8365a.remove(next);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo24900e() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) f8354a.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return "com.xiaomi";
        }
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.pid == Process.myPid()) {
                return next.processName;
            }
        }
        return "com.xiaomi";
    }
}

package com.xiaomi.push;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.p007os.EnvironmentCompat;
import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import com.miot.bluetooth.channel.packet.Packet;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.service.C4860a;
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
import java.util.Locale;
import java.util.Map;
import org.apache.commons.p194io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.xiaomi.push.cv */
public class C4600cv {

    /* renamed from: a */
    protected static Context f7753a;

    /* renamed from: a */
    private static C4601a f7754a;

    /* renamed from: a */
    private static C4600cv f7755a;

    /* renamed from: a */
    protected static boolean f7756a = false;

    /* renamed from: b */
    protected static final Map<String, C4596cr> f7757b = new HashMap();

    /* renamed from: c */
    private static String f7758c;

    /* renamed from: d */
    private static String f7759d;

    /* renamed from: a */
    private long f7760a;

    /* renamed from: a */
    private C4599cu f7761a;

    /* renamed from: a */
    protected C4602b f7762a;

    /* renamed from: a */
    private String f7763a;

    /* renamed from: a */
    protected final Map<String, C4597cs> f7764a;

    /* renamed from: b */
    private final long f7765b;

    /* renamed from: b */
    private String f7766b;

    /* renamed from: c */
    private long f7767c;

    /* renamed from: com.xiaomi.push.cv$a */
    public interface C4601a {
        /* renamed from: a */
        C4600cv mo28891a(Context context, C4599cu cuVar, C4602b bVar, String str);
    }

    /* renamed from: com.xiaomi.push.cv$b */
    public interface C4602b {
        /* renamed from: a */
        String mo28892a(String str);
    }

    protected C4600cv(Context context, C4599cu cuVar, C4602b bVar, String str) {
        this(context, cuVar, bVar, str, (String) null, (String) null);
    }

    protected C4600cv(Context context, C4599cu cuVar, C4602b bVar, String str, String str2, String str3) {
        this.f7764a = new HashMap();
        this.f7763a = TimerCodec.DISENABLE;
        this.f7760a = 0;
        this.f7765b = 15;
        this.f7767c = 0;
        this.f7766b = "isp_prov_city_country_ip";
        this.f7762a = bVar;
        this.f7761a = cuVar == null ? new C4603cw(this) : cuVar;
        this.f7763a = str;
        f7758c = str2 == null ? context.getPackageName() : str2;
        f7759d = str3 == null ? m13232f() : str3;
    }

    /* renamed from: a */
    public static synchronized C4600cv mo28881a() {
        C4600cv cvVar;
        synchronized (C4600cv.class) {
            cvVar = f7755a;
            if (cvVar == null) {
                throw new IllegalStateException("the host manager is not initialized yet.");
            }
        }
        return cvVar;
    }

    /* renamed from: a */
    static String m13226a() {
        NetworkInfo activeNetworkInfo;
        Context context = f7753a;
        if (context == null) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return EnvironmentCompat.MEDIA_UNKNOWN;
            }
            if (activeNetworkInfo.getType() == 1) {
                return "WIFI-UNKNOWN";
            }
            return activeNetworkInfo.getTypeName() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + activeNetworkInfo.getSubtypeName();
        } catch (Throwable unused) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
    }

    /* renamed from: a */
    static String mo28878a(String str) {
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
    private ArrayList<C4596cr> m13228a(ArrayList<String> arrayList) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        ArrayList<String> arrayList2 = arrayList;
        mo28888d();
        synchronized (this.f7764a) {
            mo28881a();
            for (String next : this.f7764a.keySet()) {
                if (!arrayList2.contains(next)) {
                    arrayList2.add(next);
                }
            }
        }
        Map<String, C4596cr> map = f7757b;
        synchronized (map) {
            for (Object obj : map.values().toArray()) {
                C4596cr crVar = (C4596cr) obj;
                if (!crVar.mo28867b()) {
                    f7757b.remove(crVar.f7740b);
                }
            }
        }
        if (!arrayList2.contains(mo28884b())) {
            arrayList2.add(mo28884b());
        }
        ArrayList<C4596cr> arrayList3 = new ArrayList<>(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList3.add((Object) null);
        }
        try {
            String str = C4551bj.m13003e(f7753a) ? "wifi" : "wap";
            String a = mo28880a(arrayList2, str, this.f7763a, true);
            if (!TextUtils.isEmpty(a)) {
                JSONObject jSONObject3 = new JSONObject(a);
                C4408b.m12481b(a);
                if ("OK".equalsIgnoreCase(jSONObject3.getString("S"))) {
                    JSONObject jSONObject4 = jSONObject3.getJSONObject("R");
                    String string = jSONObject4.getString("province");
                    String string2 = jSONObject4.getString("city");
                    String string3 = jSONObject4.getString("isp");
                    String string4 = jSONObject4.getString("ip");
                    String string5 = jSONObject4.getString("country");
                    JSONObject jSONObject5 = jSONObject4.getJSONObject(str);
                    C4408b.m12482c("get bucket: net=" + string3 + ", hosts=" + jSONObject5.toString());
                    int i2 = 0;
                    while (i2 < arrayList.size()) {
                        String str2 = arrayList2.get(i2);
                        JSONArray optJSONArray = jSONObject5.optJSONArray(str2);
                        if (optJSONArray == null) {
                            C4408b.m12464a("no bucket found for " + str2);
                            jSONObject = jSONObject5;
                        } else {
                            C4596cr crVar2 = new C4596cr(str2);
                            int i3 = 0;
                            while (i3 < optJSONArray.length()) {
                                String string6 = optJSONArray.getString(i3);
                                if (!TextUtils.isEmpty(string6)) {
                                    jSONObject2 = jSONObject5;
                                    crVar2.mo28857a(new C4609da(string6, optJSONArray.length() - i3));
                                } else {
                                    jSONObject2 = jSONObject5;
                                }
                                i3++;
                                jSONObject5 = jSONObject2;
                            }
                            jSONObject = jSONObject5;
                            arrayList3.set(i2, crVar2);
                            crVar2.f7745g = string5;
                            crVar2.f7741c = string;
                            crVar2.f7743e = string3;
                            crVar2.f7744f = string4;
                            crVar2.f7742d = string2;
                            if (jSONObject4.has("stat-percent")) {
                                crVar2.mo28855a(jSONObject4.getDouble("stat-percent"));
                            }
                            if (jSONObject4.has("stat-domain")) {
                                crVar2.mo28864b(jSONObject4.getString("stat-domain"));
                            }
                            if (jSONObject4.has("ttl")) {
                                crVar2.mo28856a(((long) jSONObject4.getInt("ttl")) * 1000);
                            }
                            mo28878a(crVar2.mo28852a());
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
                                C4408b.m12464a("no bucket found for " + next2);
                            } else {
                                C4596cr crVar3 = new C4596cr(next2);
                                crVar3.mo28856a(j);
                                for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                                    String string7 = optJSONArray2.getString(i4);
                                    if (!TextUtils.isEmpty(string7)) {
                                        crVar3.mo28857a(new C4609da(string7, optJSONArray2.length() - i4));
                                    }
                                }
                                Map<String, C4596cr> map2 = f7757b;
                                synchronized (map2) {
                                    if (this.f7761a.mo28877a(next2)) {
                                        map2.put(next2, crVar3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            C4408b.m12464a("failed to get bucket " + e.getMessage());
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            C4596cr crVar4 = arrayList3.get(i5);
            if (crVar4 != null) {
                mo28882a(arrayList2.get(i5), crVar4);
            }
        }
        mo28886c();
        return arrayList3;
    }

    /* renamed from: a */
    public static synchronized void m13229a(Context context, C4599cu cuVar, C4602b bVar, String str, String str2, String str3) {
        synchronized (C4600cv.class) {
            Context applicationContext = context.getApplicationContext();
            f7753a = applicationContext;
            if (applicationContext == null) {
                f7753a = context;
            }
            if (f7755a == null) {
                C4601a aVar = f7754a;
                if (aVar == null) {
                    f7755a = new C4600cv(context, cuVar, bVar, str, str2, str3);
                } else {
                    f7755a = aVar.mo28891a(context, cuVar, bVar, str);
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m13230a(C4601a aVar) {
        synchronized (C4600cv.class) {
            f7754a = aVar;
            f7755a = null;
        }
    }

    /* renamed from: a */
    public static void m13231a(String str, String str2) {
        Map<String, C4596cr> map = f7757b;
        C4596cr crVar = map.get(str);
        synchronized (map) {
            if (crVar == null) {
                C4596cr crVar2 = new C4596cr(str);
                crVar2.mo28856a(604800000);
                crVar2.mo28853a(str2);
                map.put(str, crVar2);
            } else {
                crVar.mo28853a(str2);
            }
        }
    }

    /* renamed from: f */
    private String m13232f() {
        try {
            PackageInfo packageInfo = f7753a.getPackageManager().getPackageInfo(f7753a.getPackageName(), 16384);
            return packageInfo != null ? packageInfo.versionName : TimerCodec.DISENABLE;
        } catch (Exception unused) {
            return TimerCodec.DISENABLE;
        }
    }

    /* renamed from: a */
    public C4596cr m13233a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return mo28879a(new URL(str).getHost(), true);
        }
        throw new IllegalArgumentException("the url is empty");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        r4 = mo28889e(r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.xiaomi.push.C4596cr mo28879a(java.lang.String r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0034
            com.xiaomi.push.cu r0 = r2.f7761a
            boolean r0 = r0.mo28877a(r3)
            if (r0 != 0) goto L_0x0010
            r3 = 0
            return r3
        L_0x0010:
            com.xiaomi.push.cr r0 = r2.mo28885c(r3)
            if (r0 == 0) goto L_0x001d
            boolean r1 = r0.mo28867b()
            if (r1 == 0) goto L_0x001d
            return r0
        L_0x001d:
            if (r4 == 0) goto L_0x002e
            android.content.Context r4 = f7753a
            boolean r4 = com.xiaomi.push.C4551bj.m13000b(r4)
            if (r4 == 0) goto L_0x002e
            com.xiaomi.push.cr r4 = r2.mo28889e(r3)
            if (r4 == 0) goto L_0x002e
            return r4
        L_0x002e:
            com.xiaomi.push.cx r4 = new com.xiaomi.push.cx
            r4.<init>(r2, r3, r0)
            return r4
        L_0x0034:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "the host is empty"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4600cv.mo28879a(java.lang.String, boolean):com.xiaomi.push.cr");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo28880a(ArrayList<String> arrayList, String str, String str2, boolean z) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<C4550bi> arrayList3 = new ArrayList<>();
        arrayList3.add(new C4548bg("type", str));
        if (str.equals("wap")) {
            arrayList3.add(new C4548bg("conpt", mo28878a(C4551bj.m12985a(f7753a))));
        }
        if (z) {
            arrayList3.add(new C4548bg("reserved", TimerCodec.ENABLE));
        }
        arrayList3.add(new C4548bg("uuid", str2));
        arrayList3.add(new C4548bg("list", C4561bp.m13044a((Collection<?>) arrayList, Constants.ACCEPT_TIME_SEPARATOR_SP)));
        arrayList3.add(new C4548bg("countrycode", C4860a.m15159a(f7753a).mo29959b()));
        String b = mo28884b();
        C4596cr c = mo28885c(b);
        String format = String.format(Locale.US, "https://%1$s/gslb/?ver=4.0", new Object[]{b});
        if (c == null) {
            arrayList2.add(format);
            Map<String, C4596cr> map = f7757b;
            synchronized (map) {
                C4596cr crVar = map.get(b);
                if (crVar != null) {
                    Iterator<String> it = crVar.mo28854a(true).iterator();
                    while (it.hasNext()) {
                        arrayList2.add(String.format(Locale.US, "https://%1$s/gslb/?ver=4.0", new Object[]{it.next()}));
                    }
                }
            }
        } else {
            arrayList2 = c.mo28853a(format);
        }
        Iterator<String> it2 = arrayList2.iterator();
        IOException e = null;
        while (it2.hasNext()) {
            Uri.Builder buildUpon = Uri.parse(it2.next()).buildUpon();
            for (C4550bi biVar : arrayList3) {
                buildUpon.appendQueryParameter(biVar.mo28774a(), biVar.mo28775b());
            }
            try {
                C4602b bVar = this.f7762a;
                return bVar == null ? C4551bj.m12992a(f7753a, new URL(buildUpon.toString())) : bVar.mo28892a(buildUpon.toString());
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (e == null) {
            return null;
        }
        C4408b.m12464a("network exception: " + e.getMessage());
        throw e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public JSONObject m13236a() {
        JSONObject jSONObject;
        synchronized (this.f7764a) {
            jSONObject = new JSONObject();
            jSONObject.put("ver", 2);
            JSONArray jSONArray = new JSONArray();
            for (C4597cs a : this.f7764a.values()) {
                jSONArray.put(a.mo28870a());
            }
            jSONObject.put(Packet.DATA, jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (C4596cr a2 : f7757b.values()) {
                jSONArray2.put(a2.mo28852a());
            }
            jSONObject.put("reserved", jSONArray2);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public void m13237a() {
        synchronized (this.f7764a) {
            this.f7764a.clear();
        }
    }

    /* renamed from: a */
    public void m13238a(String str) {
        this.f7766b = str;
    }

    /* renamed from: a */
    public void mo28882a(String str, C4596cr crVar) {
        if (TextUtils.isEmpty(str) || crVar == null) {
            throw new IllegalArgumentException("the argument is invalid " + str + ", " + crVar);
        } else if (this.f7761a.mo28877a(str)) {
            synchronized (this.f7764a) {
                mo28881a();
                if (this.f7764a.containsKey(str)) {
                    this.f7764a.get(str).mo28872a(crVar);
                } else {
                    C4597cs csVar = new C4597cs(str);
                    csVar.mo28872a(crVar);
                    this.f7764a.put(str, csVar);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean m13240a() {
        synchronized (this.f7764a) {
            if (f7756a) {
                return true;
            }
            f7756a = true;
            this.f7764a.clear();
            try {
                String d = mo28888d();
                if (!TextUtils.isEmpty(d)) {
                    mo28883b(d);
                    C4408b.m12481b("loading the new hosts succeed");
                    return true;
                }
            } catch (Throwable th) {
                C4408b.m12464a("load bucket failure: " + th.getMessage());
            }
        }
        return false;
    }

    /* renamed from: b */
    public C4596cr mo28883b(String str) {
        return mo28879a(str, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo28884b() {
        String a = C4860a.m15159a(f7753a).mo29957a();
        return (TextUtils.isEmpty(a) || PushChannelRegion.China.name().equals(a)) ? "resolver.msg.xiaomi.net" : "resolver.msg.global.xiaomi.net";
    }

    /* renamed from: b */
    public void m13243b() {
        ArrayList arrayList;
        synchronized (this.f7764a) {
            mo28881a();
            arrayList = new ArrayList(this.f7764a.keySet());
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C4597cs csVar = this.f7764a.get(arrayList.get(size));
                if (!(csVar == null || csVar.mo28870a() == null)) {
                    arrayList.remove(size);
                }
            }
        }
        ArrayList<C4596cr> a = m13228a((ArrayList<String>) arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            if (a.get(i) != null) {
                mo28882a((String) arrayList.get(i), a.get(i));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void m13244b(String str) {
        synchronized (this.f7764a) {
            this.f7764a.clear();
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("ver") == 2) {
                JSONArray optJSONArray = jSONObject.optJSONArray(Packet.DATA);
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        C4597cs a = new C4597cs().mo28871a(optJSONArray.getJSONObject(i));
                        this.f7764a.put(a.mo28870a(), a);
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("reserved");
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        JSONObject jSONObject2 = optJSONArray2.getJSONObject(i2);
                        String optString = jSONObject2.optString("host");
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                C4596cr a2 = new C4596cr(optString).mo28851a(jSONObject2);
                                f7757b.put(a2.f7740b, a2);
                                C4408b.m12464a("load local reserved host for " + a2.f7740b);
                            } catch (JSONException unused) {
                                C4408b.m12464a("parse reserved host fail.");
                            }
                        }
                    }
                }
            } else {
                throw new JSONException("Bad version");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C4596cr mo28885c(String str) {
        C4597cs csVar;
        C4596cr a;
        synchronized (this.f7764a) {
            mo28881a();
            csVar = this.f7764a.get(str);
        }
        if (csVar == null || (a = csVar.mo28870a()) == null) {
            return null;
        }
        return a;
    }

    /* renamed from: c */
    public String mo28886c() {
        StringBuilder sb = new StringBuilder();
        synchronized (this.f7764a) {
            for (Map.Entry next : this.f7764a.entrySet()) {
                sb.append((String) next.getKey());
                sb.append(":\n");
                sb.append(((C4597cs) next.getValue()).toString());
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    public void m13247c() {
        synchronized (this.f7764a) {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(f7753a.openFileOutput(mo28890e(), 0)));
                String jSONObject = mo28881a().toString();
                if (!TextUtils.isEmpty(jSONObject)) {
                    bufferedWriter.write(jSONObject);
                }
                bufferedWriter.close();
            } catch (Exception e) {
                C4408b.m12464a("persist bucket failure: " + e.getMessage());
            }
        }
    }

    /* renamed from: d */
    public C4596cr mo28887d(String str) {
        C4596cr crVar;
        Map<String, C4596cr> map = f7757b;
        synchronized (map) {
            crVar = map.get(str);
        }
        return crVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo28888d() {
        BufferedReader bufferedReader;
        try {
            File file = new File(f7753a.getFilesDir(), mo28890e());
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
                            C4506ab.m12831a((Closeable) bufferedReader);
                            return sb2;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        C4408b.m12464a("load host exception " + th.getMessage());
                        return null;
                    } finally {
                        C4506ab.m12831a((Closeable) bufferedReader);
                    }
                }
            } else {
                C4506ab.m12831a((Closeable) null);
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
            C4408b.m12464a("load host exception " + th.getMessage());
            return null;
        }
    }

    /* renamed from: d */
    public void m13250d() {
        synchronized (this.f7764a) {
            for (C4597cs a : this.f7764a.values()) {
                a.mo28873a(true);
            }
            while (true) {
                for (boolean z = false; !z; z = true) {
                    for (String next : this.f7764a.keySet()) {
                        if (this.f7764a.get(next).mo28870a().isEmpty()) {
                            this.f7764a.remove(next);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C4596cr mo28889e(String str) {
        if (System.currentTimeMillis() - this.f7767c <= this.f7760a * 60 * 1000) {
            return null;
        }
        this.f7767c = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        C4596cr crVar = m13228a((ArrayList<String>) arrayList).get(0);
        if (crVar != null) {
            this.f7760a = 0;
            return crVar;
        }
        long j = this.f7760a;
        if (j >= 15) {
            return null;
        }
        this.f7760a = j + 1;
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo28890e() {
        if ("com.xiaomi.xmsf".equals(f7758c)) {
            return f7758c;
        }
        return f7758c + ":pushservice";
    }
}

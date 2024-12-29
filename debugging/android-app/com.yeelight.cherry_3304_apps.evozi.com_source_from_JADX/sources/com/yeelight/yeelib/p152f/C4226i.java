package com.yeelight.yeelib.p152f;

import android.content.Context;
import com.miot.api.Constants;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.miot.service.connection.wifi.WebShellActivity;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p153g.C9846o;
import com.yeelight.yeelib.p153g.C9848q;
import com.yeelight.yeelib.p187h.C9862d;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C10548o;
import com.yeelight.yeelib.utils.C10550q;
import com.yeelight.yeelib.utils.C4308b;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.f.i */
public class C4226i implements C4201a.C4202i {

    /* renamed from: b */
    public static final String f7339b = "i";

    /* renamed from: c */
    public static C4226i f7340c;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f7341a;

    /* renamed from: com.yeelight.yeelib.f.i$a */
    class C4227a implements C9874b<String> {
        C4227a() {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            String string;
            String str2;
            "queryLatestLaunchPage, onSuccess, response: " + str;
            try {
                JSONObject jSONObject = new JSONObject(str);
                boolean z = true;
                if (jSONObject.getInt("code") == 1) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(Constants.EXTRA_PUSH_MESSAGE);
                    String string2 = jSONObject2.getString("id");
                    String string3 = jSONObject2.getString(ScanBarcodeActivity.TITLE);
                    if (C10547m.m25756f(C4226i.this.f7341a)) {
                        string = jSONObject2.getString("image_18_9_code");
                        str2 = "image_18_9";
                    } else {
                        string = jSONObject2.getString("image_code");
                        str2 = "image";
                    }
                    String string4 = jSONObject2.getString(str2);
                    C9848q qVar = C9848q.values()[jSONObject2.getInt("type")];
                    Long valueOf = Long.valueOf(jSONObject2.getLong("endtime"));
                    boolean has = jSONObject2.has(WebShellActivity.ARGS_KEY_URL);
                    String str3 = "";
                    if (has) {
                        str3 = jSONObject2.getString(WebShellActivity.ARGS_KEY_URL);
                    }
                    if (jSONObject2.getInt("dark_mode") != 1) {
                        z = false;
                    }
                    int i = jSONObject2.getInt("show_seconds");
                    int i2 = jSONObject2.getInt("show_nums");
                    C9846o oVar = new C9846o(string2, string3, string);
                    oVar.mo31816v(qVar);
                    oVar.mo31811q(valueOf.longValue());
                    oVar.mo31809o(has);
                    if (has) {
                        oVar.mo31808n(str3);
                    }
                    oVar.mo31812r(string4);
                    oVar.mo31810p(z);
                    oVar.mo31815u(i);
                    oVar.mo31814t(i2);
                    if (!C4226i.this.mo23545f(oVar)) {
                        C4226i.this.mo23547m(oVar);
                        C4295x.m12055g().mo23721b(oVar);
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            "queryLatestLaunchPage, onFailure, message = " + str;
        }
    }

    /* renamed from: com.yeelight.yeelib.f.i$b */
    static class C4228b implements C9874b<String> {
        C4228b() {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
        }

        public void onFailure(int i, String str) {
        }
    }

    /* renamed from: com.yeelight.yeelib.f.i$c */
    static class C4229c implements C9874b<String> {
        C4229c() {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
        }

        public void onFailure(int i, String str) {
            "reportShowPage, onFailure code: " + i + "    errorMessage: " + str;
        }
    }

    private C4226i() {
        C4201a.m11607r().mo23444M(this);
    }

    private C4226i(Context context) {
        C4201a.m11608s(context).mo23444M(this);
        this.f7341a = context;
    }

    /* renamed from: c */
    public static C4226i m11743c() {
        if (f7340c == null) {
            f7340c = new C4226i();
        }
        return f7340c;
    }

    /* renamed from: e */
    public static C4226i m11744e(Context context) {
        if (f7340c == null) {
            f7340c = new C4226i(context);
        }
        return f7340c;
    }

    /* renamed from: j */
    public static void m11745j(String str) {
        String str2 = C4308b.f7492k + "ad-hits?ad_id=" + str;
        if (C4308b.f7482a) {
            str2 = str2 + "&debug=1";
        }
        "reportPageClicked, url = " + str2;
        C9862d.m24134d(str2, String.class, new C4228b(), false);
    }

    /* renamed from: k */
    public static void m11746k(String str) {
        String str2 = C4308b.f7492k + "ad-shows?ad_id=" + str;
        if (C4308b.f7482a) {
            str2 = str2 + "&debug=1";
        }
        "reportShowPage, url = " + str2;
        C9862d.m24134d(str2, String.class, new C4229c(), false);
    }

    /* renamed from: C */
    public void mo23456C(C4201a.C4212k kVar) {
    }

    /* renamed from: H */
    public void mo23457H() {
    }

    /* renamed from: b */
    public C9846o mo23544b() {
        File e;
        File externalFilesDir = this.f7341a.getExternalFilesDir((String) null);
        if (externalFilesDir == null) {
            return null;
        }
        File file = new File(externalFilesDir.getAbsolutePath() + "/launch");
        if (!file.exists() || (e = C10548o.m25763e(file)) == null) {
            return null;
        }
        "Found latest sub dir: " + e.getName();
        C9846o n = mo23548n(e);
        if (n == null && !C4295x.m12055g().mo23727i(e.getName())) {
            C10548o.m25759a(e);
        }
        return n;
    }

    /* renamed from: d */
    public void mo23458d() {
    }

    /* renamed from: f */
    public boolean mo23545f(C9846o oVar) {
        if (oVar.mo31798d() == null || oVar.mo31798d().isEmpty()) {
            C4308b.m12139r(f7339b, "Invalid page id, fix me!");
        }
        File externalFilesDir = this.f7341a.getExternalFilesDir((String) null);
        if (externalFilesDir == null) {
            return false;
        }
        String str = externalFilesDir.getAbsolutePath() + "/launch/" + oVar.mo31798d() + MiotCloudImpl.COOKIE_PATH + "pic.png";
        File file = new File(str);
        File file2 = new File(externalFilesDir.getAbsolutePath() + "/launch/" + oVar.mo31798d() + MiotCloudImpl.COOKIE_PATH + "config.txt");
        "isPageDownloaded, launch page picture file: " + file.getAbsolutePath();
        "isPageDownloaded, launch page config file: " + file2.getAbsolutePath();
        if (!file.exists() || !file2.exists()) {
            return false;
        }
        "isPageDownloaded, launch page: " + oVar.mo31798d() + ", file found, check md5: " + oVar.mo31795a();
        String d = C10548o.m25762d(file);
        if (d != null && d.equals(oVar.mo31795a())) {
            return true;
        }
        C10548o.m25759a(file.getParentFile());
        return false;
    }

    /* renamed from: g */
    public void mo23459g() {
    }

    /* renamed from: h */
    public void mo23546h() {
        String str = C4308b.f7492k + "current-ad?language=" + C10550q.m25766b().mo33379c();
        if (C4308b.f7482a) {
            str = str + "&debug=1";
        }
        "queryLatestLaunchPage, url = " + str;
        C9862d.m24133c(str, String.class, new C4227a());
    }

    /* renamed from: i */
    public void mo23460i() {
        if (C9784e.m23711b().mo31629e() && !C4230l.m11766b().mo23552a().isEmpty()) {
            mo23546h();
        }
    }

    /* renamed from: l */
    public void mo23461l() {
    }

    /* renamed from: m */
    public boolean mo23547m(C9846o oVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", oVar.mo31798d());
            jSONObject.put(ScanBarcodeActivity.TITLE, oVar.mo31803i());
            jSONObject.put("checksum", oVar.mo31795a());
            jSONObject.put("endtime", oVar.mo31797c());
            jSONObject.put("type", oVar.mo31804j().ordinal());
            if (oVar.mo31806l()) {
                jSONObject.put(WebShellActivity.ARGS_KEY_URL, oVar.mo31796b());
            }
            jSONObject.put("dark_mode", oVar.mo31807m());
            jSONObject.put("show_seconds", oVar.mo31802h());
            jSONObject.put("show_nums", oVar.mo31801g());
            if (oVar.mo31801g() != 0) {
                jSONObject.put("show_count", oVar.mo31800f());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (oVar.mo31798d() == null || oVar.mo31798d().isEmpty()) {
            C4308b.m12139r(f7339b, "Invalid page id, fix me!");
            return false;
        }
        File externalFilesDir = this.f7341a.getExternalFilesDir((String) null);
        if (externalFilesDir == null) {
            return false;
        }
        File file = new File(externalFilesDir.getAbsolutePath() + "/launch/" + oVar.mo31798d() + MiotCloudImpl.COOKIE_PATH + "config.txt");
        File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        } else if (file.exists()) {
            file.delete();
        }
        "Trying to write config file: " + file.getAbsolutePath();
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(jSONObject.toString());
            fileWriter.close();
            return true;
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00cc A[Catch:{ JSONException -> 0x0114 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00e5 A[Catch:{ JSONException -> 0x0114 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f1 A[Catch:{ JSONException -> 0x0114 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f2 A[Catch:{ JSONException -> 0x0114 }] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yeelight.yeelib.p153g.C9846o mo23548n(java.io.File r15) {
        /*
            r14 = this;
            java.lang.String r0 = "url"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "validateDownloadedPage, dir: "
            r1.append(r2)
            java.lang.String r2 = r15.getName()
            r1.append(r2)
            r1.toString()
            boolean r1 = r15.exists()
            r2 = 0
            if (r1 == 0) goto L_0x0118
            boolean r1 = r15.isDirectory()
            if (r1 != 0) goto L_0x0025
            goto L_0x0118
        L_0x0025:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r15.getPath()
            r3.append(r4)
            java.lang.String r4 = "/"
            r3.append(r4)
            java.lang.String r5 = "pic.png"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r1.<init>(r3)
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r15 = r15.getPath()
            r5.append(r15)
            r5.append(r4)
            java.lang.String r15 = "config.txt"
            r5.append(r15)
            java.lang.String r15 = r5.toString()
            r3.<init>(r15)
            boolean r15 = r1.exists()
            if (r15 == 0) goto L_0x0118
            boolean r15 = r3.exists()
            if (r15 != 0) goto L_0x006f
            goto L_0x0118
        L_0x006f:
            java.lang.String r15 = com.yeelight.yeelib.utils.C10548o.m25762d(r1)
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x008c }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x008c }
            r4.<init>(r3)     // Catch:{ Exception -> 0x008c }
            r1.<init>(r4)     // Catch:{ Exception -> 0x008c }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x008c }
            r3.<init>(r1)     // Catch:{ Exception -> 0x008c }
            java.lang.String r3 = r3.readLine()     // Catch:{ Exception -> 0x008c }
            r1.close()     // Catch:{ Exception -> 0x008a }
            goto L_0x0091
        L_0x008a:
            r1 = move-exception
            goto L_0x008e
        L_0x008c:
            r1 = move-exception
            r3 = r2
        L_0x008e:
            r1.printStackTrace()
        L_0x0091:
            if (r3 == 0) goto L_0x0118
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x009b
            goto L_0x0118
        L_0x009b:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0114 }
            r1.<init>(r3)     // Catch:{ JSONException -> 0x0114 }
            java.lang.String r3 = "id"
            java.lang.String r3 = r1.getString(r3)     // Catch:{ JSONException -> 0x0114 }
            java.lang.String r4 = "title"
            java.lang.String r4 = r1.getString(r4)     // Catch:{ JSONException -> 0x0114 }
            java.lang.String r5 = "checksum"
            java.lang.String r5 = r1.getString(r5)     // Catch:{ JSONException -> 0x0114 }
            com.yeelight.yeelib.g.q[] r6 = com.yeelight.yeelib.p153g.C9848q.values()     // Catch:{ JSONException -> 0x0114 }
            java.lang.String r7 = "type"
            int r7 = r1.getInt(r7)     // Catch:{ JSONException -> 0x0114 }
            r6 = r6[r7]     // Catch:{ JSONException -> 0x0114 }
            java.lang.String r7 = "endtime"
            long r7 = r1.getLong(r7)     // Catch:{ JSONException -> 0x0114 }
            boolean r9 = r1.has(r0)     // Catch:{ JSONException -> 0x0114 }
            java.lang.String r10 = ""
            if (r9 == 0) goto L_0x00d0
            java.lang.String r10 = r1.getString(r0)     // Catch:{ JSONException -> 0x0114 }
        L_0x00d0:
            java.lang.String r0 = "dark_mode"
            boolean r0 = r1.getBoolean(r0)     // Catch:{ JSONException -> 0x0114 }
            java.lang.String r11 = "show_seconds"
            int r11 = r1.getInt(r11)     // Catch:{ JSONException -> 0x0114 }
            java.lang.String r12 = "show_nums"
            int r12 = r1.getInt(r12)     // Catch:{ JSONException -> 0x0114 }
            r13 = 0
            if (r12 == 0) goto L_0x00eb
            java.lang.String r13 = "show_count"
            int r13 = r1.getInt(r13)     // Catch:{ JSONException -> 0x0114 }
        L_0x00eb:
            boolean r15 = r5.equals(r15)     // Catch:{ JSONException -> 0x0114 }
            if (r15 != 0) goto L_0x00f2
            return r2
        L_0x00f2:
            com.yeelight.yeelib.g.o r15 = new com.yeelight.yeelib.g.o     // Catch:{ JSONException -> 0x0114 }
            r15.<init>(r3, r4, r5)     // Catch:{ JSONException -> 0x0114 }
            r15.mo31816v(r6)     // Catch:{ JSONException -> 0x0114 }
            r15.mo31811q(r7)     // Catch:{ JSONException -> 0x0114 }
            r15.mo31809o(r9)     // Catch:{ JSONException -> 0x0114 }
            if (r9 == 0) goto L_0x0105
            r15.mo31808n(r10)     // Catch:{ JSONException -> 0x0114 }
        L_0x0105:
            r15.mo31810p(r0)     // Catch:{ JSONException -> 0x0114 }
            r15.mo31815u(r11)     // Catch:{ JSONException -> 0x0114 }
            r15.mo31814t(r12)     // Catch:{ JSONException -> 0x0114 }
            if (r12 == 0) goto L_0x0113
            r15.mo31813s(r13)     // Catch:{ JSONException -> 0x0114 }
        L_0x0113:
            return r15
        L_0x0114:
            r15 = move-exception
            r15.printStackTrace()
        L_0x0118:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p152f.C4226i.mo23548n(java.io.File):com.yeelight.yeelib.g.o");
    }

    /* renamed from: q */
    public void mo23462q(String str) {
    }

    /* renamed from: r */
    public void mo23463r(String str) {
    }
}

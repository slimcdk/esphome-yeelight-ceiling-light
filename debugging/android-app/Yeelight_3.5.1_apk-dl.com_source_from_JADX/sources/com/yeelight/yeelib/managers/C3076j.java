package com.yeelight.yeelib.managers;

import android.content.Context;
import com.miot.api.Constants;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.miot.service.connection.wifi.WebShellActivity;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.models.C8320l;
import com.yeelight.yeelib.models.LaunchPageType;
import com.yeelight.yeelib.utils.AppUtils;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p051j4.C9193k;
import p051j4.C9194m;
import p051j4.C9196o;
import p129b4.C3988b;
import p134c4.C4007b;

/* renamed from: com.yeelight.yeelib.managers.j */
public class C3076j implements C3051a.C3052i {

    /* renamed from: b */
    public static final String f4897b = "j";

    /* renamed from: c */
    public static C3076j f4898c;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f4899a;

    /* renamed from: com.yeelight.yeelib.managers.j$a */
    class C3077a implements C4007b<String> {
        C3077a() {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            String string;
            String str2;
            StringBuilder sb = new StringBuilder();
            sb.append("queryLatestLaunchPage, onSuccess, response: ");
            sb.append(str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                boolean z = true;
                if (jSONObject.getInt("code") == 1) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(Constants.EXTRA_PUSH_MESSAGE);
                    String string2 = jSONObject2.getString("id");
                    String string3 = jSONObject2.getString(ScanBarcodeActivity.TITLE);
                    if (C9193k.m22155f(C3076j.this.f4899a)) {
                        string = jSONObject2.getString("image_18_9_code");
                        str2 = "image_18_9";
                    } else {
                        string = jSONObject2.getString("image_code");
                        str2 = "image";
                    }
                    String string4 = jSONObject2.getString(str2);
                    LaunchPageType launchPageType = LaunchPageType.values()[jSONObject2.getInt("type")];
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
                    C8320l lVar = new C8320l(string2, string3, string);
                    lVar.mo35403v(launchPageType);
                    lVar.mo35398q(valueOf.longValue());
                    lVar.mo35396o(has);
                    if (has) {
                        lVar.mo35395n(str3);
                    }
                    lVar.mo35399r(string4);
                    lVar.mo35397p(z);
                    lVar.mo35402u(i);
                    lVar.mo35401t(i2);
                    if (!C3076j.this.mo23444f(lVar)) {
                        C3076j.this.mo23446m(lVar);
                        C3106w.m8214g().mo23531b(lVar);
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("queryLatestLaunchPage, onFailure, message = ");
            sb.append(str);
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.j$b */
    class C3078b implements C4007b<String> {
        C3078b() {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
        }

        public void onFailure(int i, String str) {
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.j$c */
    class C3079c implements C4007b<String> {
        C3079c() {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
        }

        public void onFailure(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("reportShowPage, onFailure code: ");
            sb.append(i);
            sb.append("    errorMessage: ");
            sb.append(str);
        }
    }

    private C3076j() {
        C3051a.m7925r().mo23358M(this);
    }

    private C3076j(Context context) {
        C3051a.m7926s(context).mo23358M(this);
        this.f4899a = context;
    }

    /* renamed from: c */
    public static C3076j m8060c() {
        if (f4898c == null) {
            f4898c = new C3076j();
        }
        return f4898c;
    }

    /* renamed from: e */
    public static C3076j m8061e(Context context) {
        if (f4898c == null) {
            f4898c = new C3076j(context);
        }
        return f4898c;
    }

    /* renamed from: j */
    public static void m8062j(String str) {
        String str2 = AppUtils.f4993q + "ad-hits?ad_id=" + str;
        if (AppUtils.f4977a) {
            str2 = str2 + "&debug=1";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("reportPageClicked, url = ");
        sb.append(str2);
        C3988b.m11568d(str2, String.class, new C3078b(), false);
    }

    /* renamed from: k */
    public static void m8063k(String str) {
        String str2 = AppUtils.f4993q + "ad-shows?ad_id=" + str;
        if (AppUtils.f4977a) {
            str2 = str2 + "&debug=1";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("reportShowPage, url = ");
        sb.append(str2);
        C3988b.m11568d(str2, String.class, new C3079c(), false);
    }

    /* renamed from: C */
    public void mo23255C(C3051a.C3062k kVar) {
    }

    /* renamed from: H */
    public void mo23262H() {
    }

    /* renamed from: b */
    public C8320l mo23443b() {
        File e;
        File externalFilesDir = this.f4899a.getExternalFilesDir((String) null);
        if (externalFilesDir == null) {
            return null;
        }
        File file = new File(externalFilesDir.getAbsolutePath() + "/launch");
        if (!file.exists() || (e = C9194m.m22162e(file)) == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Found latest sub dir: ");
        sb.append(e.getName());
        C8320l n = mo23447n(e);
        if (n == null && !C3106w.m8214g().mo23537i(e.getName())) {
            C9194m.m22158a(e);
        }
        return n;
    }

    /* renamed from: d */
    public void mo23283d() {
    }

    /* renamed from: f */
    public boolean mo23444f(C8320l lVar) {
        if (lVar.mo35385d() == null || lVar.mo35385d().isEmpty()) {
            AppUtils.m8300u(f4897b, "Invalid page id, fix me!");
        }
        File externalFilesDir = this.f4899a.getExternalFilesDir((String) null);
        if (externalFilesDir == null) {
            return false;
        }
        String str = externalFilesDir.getAbsolutePath() + "/launch/" + lVar.mo35385d() + MiotCloudImpl.COOKIE_PATH + "pic.png";
        File file = new File(str);
        File file2 = new File(externalFilesDir.getAbsolutePath() + "/launch/" + lVar.mo35385d() + MiotCloudImpl.COOKIE_PATH + "config.txt");
        StringBuilder sb = new StringBuilder();
        sb.append("isPageDownloaded, launch page picture file: ");
        sb.append(file.getAbsolutePath());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("isPageDownloaded, launch page config file: ");
        sb2.append(file2.getAbsolutePath());
        if (!file.exists() || !file2.exists()) {
            return false;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("isPageDownloaded, launch page: ");
        sb3.append(lVar.mo35385d());
        sb3.append(", file found, check md5: ");
        sb3.append(lVar.mo35382a());
        String d = C9194m.m22161d(file);
        if (d != null && d.equals(lVar.mo35382a())) {
            return true;
        }
        C9194m.m22158a(file.getParentFile());
        return false;
    }

    /* renamed from: g */
    public void mo23288g() {
    }

    /* renamed from: h */
    public void mo23291h() {
        if (C8272e.m19511b().mo35205e() && !C8281l.m19542b().mo35223a().isEmpty()) {
            mo23445i();
        }
    }

    /* renamed from: i */
    public void mo23445i() {
        String str = AppUtils.f4993q + "current-ad?language=" + C9196o.m22165b().mo37278c();
        if (AppUtils.f4977a) {
            str = str + "&debug=1";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("queryLatestLaunchPage, url = ");
        sb.append(str);
        C3988b.m11567c(str, String.class, new C3077a());
    }

    /* renamed from: l */
    public void mo23300l() {
    }

    /* renamed from: m */
    public boolean mo23446m(C8320l lVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", lVar.mo35385d());
            jSONObject.put(ScanBarcodeActivity.TITLE, lVar.mo35390i());
            jSONObject.put("checksum", lVar.mo35382a());
            jSONObject.put("endtime", lVar.mo35384c());
            jSONObject.put("type", lVar.mo35391j().ordinal());
            if (lVar.mo35393l()) {
                jSONObject.put(WebShellActivity.ARGS_KEY_URL, lVar.mo35383b());
            }
            jSONObject.put("dark_mode", lVar.mo35394m());
            jSONObject.put("show_seconds", lVar.mo35389h());
            jSONObject.put("show_nums", lVar.mo35388g());
            if (lVar.mo35388g() != 0) {
                jSONObject.put("show_count", lVar.mo35387f());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (lVar.mo35385d() == null || lVar.mo35385d().isEmpty()) {
            AppUtils.m8300u(f4897b, "Invalid page id, fix me!");
            return false;
        }
        File externalFilesDir = this.f4899a.getExternalFilesDir((String) null);
        if (externalFilesDir == null) {
            return false;
        }
        File file = new File(externalFilesDir.getAbsolutePath() + "/launch/" + lVar.mo35385d() + MiotCloudImpl.COOKIE_PATH + "config.txt");
        File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        } else if (file.exists()) {
            file.delete();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Trying to write config file: ");
        sb.append(file.getAbsolutePath());
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

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c9 A[Catch:{ JSONException -> 0x0111 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00e2 A[Catch:{ JSONException -> 0x0111 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ee A[Catch:{ JSONException -> 0x0111 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ef A[Catch:{ JSONException -> 0x0111 }] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yeelight.yeelib.models.C8320l mo23447n(java.io.File r15) {
        /*
            r14 = this;
            java.lang.String r0 = "url"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "validateDownloadedPage, dir: "
            r1.append(r2)
            java.lang.String r2 = r15.getName()
            r1.append(r2)
            boolean r1 = r15.exists()
            r2 = 0
            if (r1 == 0) goto L_0x0115
            boolean r1 = r15.isDirectory()
            if (r1 != 0) goto L_0x0022
            goto L_0x0115
        L_0x0022:
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
            if (r15 == 0) goto L_0x0115
            boolean r15 = r3.exists()
            if (r15 != 0) goto L_0x006c
            goto L_0x0115
        L_0x006c:
            java.lang.String r15 = p051j4.C9194m.m22161d(r1)
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0089 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0089 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x0089 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0089 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0089 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r3 = r3.readLine()     // Catch:{ Exception -> 0x0089 }
            r1.close()     // Catch:{ Exception -> 0x0087 }
            goto L_0x008e
        L_0x0087:
            r1 = move-exception
            goto L_0x008b
        L_0x0089:
            r1 = move-exception
            r3 = r2
        L_0x008b:
            r1.printStackTrace()
        L_0x008e:
            if (r3 == 0) goto L_0x0115
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L_0x0098
            goto L_0x0115
        L_0x0098:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0111 }
            r1.<init>(r3)     // Catch:{ JSONException -> 0x0111 }
            java.lang.String r3 = "id"
            java.lang.String r3 = r1.getString(r3)     // Catch:{ JSONException -> 0x0111 }
            java.lang.String r4 = "title"
            java.lang.String r4 = r1.getString(r4)     // Catch:{ JSONException -> 0x0111 }
            java.lang.String r5 = "checksum"
            java.lang.String r5 = r1.getString(r5)     // Catch:{ JSONException -> 0x0111 }
            com.yeelight.yeelib.models.LaunchPageType[] r6 = com.yeelight.yeelib.models.LaunchPageType.values()     // Catch:{ JSONException -> 0x0111 }
            java.lang.String r7 = "type"
            int r7 = r1.getInt(r7)     // Catch:{ JSONException -> 0x0111 }
            r6 = r6[r7]     // Catch:{ JSONException -> 0x0111 }
            java.lang.String r7 = "endtime"
            long r7 = r1.getLong(r7)     // Catch:{ JSONException -> 0x0111 }
            boolean r9 = r1.has(r0)     // Catch:{ JSONException -> 0x0111 }
            java.lang.String r10 = ""
            if (r9 == 0) goto L_0x00cd
            java.lang.String r10 = r1.getString(r0)     // Catch:{ JSONException -> 0x0111 }
        L_0x00cd:
            java.lang.String r0 = "dark_mode"
            boolean r0 = r1.getBoolean(r0)     // Catch:{ JSONException -> 0x0111 }
            java.lang.String r11 = "show_seconds"
            int r11 = r1.getInt(r11)     // Catch:{ JSONException -> 0x0111 }
            java.lang.String r12 = "show_nums"
            int r12 = r1.getInt(r12)     // Catch:{ JSONException -> 0x0111 }
            r13 = 0
            if (r12 == 0) goto L_0x00e8
            java.lang.String r13 = "show_count"
            int r13 = r1.getInt(r13)     // Catch:{ JSONException -> 0x0111 }
        L_0x00e8:
            boolean r15 = r5.equals(r15)     // Catch:{ JSONException -> 0x0111 }
            if (r15 != 0) goto L_0x00ef
            return r2
        L_0x00ef:
            com.yeelight.yeelib.models.l r15 = new com.yeelight.yeelib.models.l     // Catch:{ JSONException -> 0x0111 }
            r15.<init>(r3, r4, r5)     // Catch:{ JSONException -> 0x0111 }
            r15.mo35403v(r6)     // Catch:{ JSONException -> 0x0111 }
            r15.mo35398q(r7)     // Catch:{ JSONException -> 0x0111 }
            r15.mo35396o(r9)     // Catch:{ JSONException -> 0x0111 }
            if (r9 == 0) goto L_0x0102
            r15.mo35395n(r10)     // Catch:{ JSONException -> 0x0111 }
        L_0x0102:
            r15.mo35397p(r0)     // Catch:{ JSONException -> 0x0111 }
            r15.mo35402u(r11)     // Catch:{ JSONException -> 0x0111 }
            r15.mo35401t(r12)     // Catch:{ JSONException -> 0x0111 }
            if (r12 == 0) goto L_0x0110
            r15.mo35400s(r13)     // Catch:{ JSONException -> 0x0111 }
        L_0x0110:
            return r15
        L_0x0111:
            r15 = move-exception
            r15.printStackTrace()
        L_0x0115:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.managers.C3076j.mo23447n(java.io.File):com.yeelight.yeelib.models.l");
    }

    /* renamed from: q */
    public void mo23308q(String str) {
    }

    /* renamed from: r */
    public void mo23310r(String str) {
    }
}

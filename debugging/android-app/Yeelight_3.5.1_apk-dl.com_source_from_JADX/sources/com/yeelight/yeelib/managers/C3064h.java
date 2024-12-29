package com.yeelight.yeelib.managers;

import android.content.Context;
import android.text.TextUtils;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.utils.AppUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p051j4.C9194m;
import p129b4.C3988b;
import p134c4.C4007b;

/* renamed from: com.yeelight.yeelib.managers.h */
public class C3064h implements C3051a.C3052i {

    /* renamed from: f */
    public static final String f4851f = "h";

    /* renamed from: g */
    private static C3064h f4852g;

    /* renamed from: a */
    private Context f4853a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<String> f4854b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public HashMap<String, C3069d> f4855c = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f4856d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f4857e = 35;

    /* renamed from: com.yeelight.yeelib.managers.h$a */
    class C3065a implements C4007b<String> {
        C3065a() {
        }

        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo23338a(java.lang.String r8) {
            /*
                r7 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "queryGingkoFirmware, onSuccess, response: "
                r0.append(r1)
                r0.append(r8)
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x005e }
                r0.<init>(r8)     // Catch:{ Exception -> 0x005e }
                java.lang.String r8 = "release_version"
                java.lang.String r3 = r0.getString(r8)     // Catch:{ Exception -> 0x005e }
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x005e }
                java.lang.String r8 = "release_note_json"
                java.lang.String r8 = r0.getString(r8)     // Catch:{ Exception -> 0x005e }
                r5.<init>(r8)     // Catch:{ Exception -> 0x005e }
                java.lang.String r8 = "file_url"
                java.lang.String r4 = r0.getString(r8)     // Catch:{ Exception -> 0x005e }
                java.lang.String r8 = "md5_checksum"
                java.lang.String r6 = r0.getString(r8)     // Catch:{ Exception -> 0x005e }
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005e }
                r8.<init>()     // Catch:{ Exception -> 0x005e }
                java.lang.String r0 = "queryGingkoFirmware, onSuccess, latest version: "
                r8.append(r0)     // Catch:{ Exception -> 0x005e }
                r8.append(r3)     // Catch:{ Exception -> 0x005e }
                com.yeelight.yeelib.managers.h$e r8 = new com.yeelight.yeelib.managers.h$e
                com.yeelight.yeelib.managers.h r2 = com.yeelight.yeelib.managers.C3064h.this
                r1 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                com.yeelight.yeelib.managers.h r0 = com.yeelight.yeelib.managers.C3064h.this
                java.util.HashMap r0 = r0.f4855c
                java.lang.String r1 = "yeelink.light.gingko"
                r0.put(r1, r8)
                com.yeelight.yeelib.managers.h r0 = com.yeelight.yeelib.managers.C3064h.this
                boolean r0 = r0.m7984s(r8)
                if (r0 != 0) goto L_0x005e
                com.yeelight.yeelib.managers.w r0 = com.yeelight.yeelib.managers.C3106w.m8214g()     // Catch:{  }
                r0.mo23531b(r8)     // Catch:{  }
            L_0x005e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.managers.C3064h.C3065a.mo23338a(java.lang.String):void");
        }

        public void onFailure(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("queryGingkoFirmware, onFailure!!");
            sb.append(str);
            sb.append(", fail mesage = ");
            sb.append(str);
            C3064h.this.f4854b.remove("yeelink.light.ble1");
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.h$b */
    class C3066b implements C4007b<String> {

        /* renamed from: com.yeelight.yeelib.managers.h$b$a */
        class C3067a implements C4007b<String> {
            C3067a() {
            }

            /* renamed from: b */
            public void mo23338a(String str) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    int i = jSONObject.getInt("code");
                    boolean z = jSONObject.getBoolean("canUpgrade");
                    if (i != 1 || !z) {
                        boolean unused = C3064h.this.f4856d = false;
                        String str2 = C3064h.f4851f;
                        return;
                    }
                    boolean unused2 = C3064h.this.f4856d = true;
                    int unused3 = C3064h.this.f4857e = jSONObject.getInt("otaSendDelay");
                } catch (Exception e) {
                    e.printStackTrace();
                    boolean unused4 = C3064h.this.f4856d = false;
                }
            }

            public void onFailure(int i, String str) {
                boolean unused = C3064h.this.f4856d = false;
            }
        }

        C3066b() {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("queryCherryFirmware, onSuccess, response: ");
            sb.append(str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                int v = C3064h.this.mo23398v(jSONObject.getString("release_version"));
                String string = jSONObject.getString("file_url");
                String string2 = jSONObject.getString("file2_url");
                String string3 = jSONObject.getString("md5_checksum");
                String string4 = jSONObject.getString("md5_checksum2");
                int v2 = C3064h.this.mo23398v(jSONObject.getString("bt_version"));
                String string5 = jSONObject.getString("bt_url");
                String string6 = jSONObject.getString("bt_md5_checksum");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("queryCherryFirmware, onSuccess, latest version: ");
                sb2.append(v);
                C3068c cVar = new C3068c(C3064h.this, v, string, string3, string2, string4, v2, string5, string6);
                C3064h.this.f4855c.put("yeelink.light.ble1", cVar);
                if (!C3064h.this.mo23395o(cVar)) {
                    try {
                        C3106w.m8214g().mo23531b(cVar);
                    } catch (Exception unused) {
                    }
                }
                if (AppUtils.f4977a) {
                    boolean unused2 = C3064h.this.f4856d = true;
                    return;
                }
                C3988b.m11567c(AppUtils.f4993q + "gray-upgrade?firmware_version=" + C3064h.this.mo23391B(cVar.mo23418a()) + "&app_uuid=" + AppUtils.m8281b(), String.class, new C3067a());
            } catch (Exception unused3) {
            }
        }

        public void onFailure(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("queryCherryFirmware, onFailure, response: ");
            sb.append(str);
            sb.append(", message = ");
            sb.append(str);
            C3064h.this.f4854b.remove("yeelink.light.ble1");
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.h$c */
    public class C3068c extends C3069d {

        /* renamed from: c */
        private int f4861c;

        /* renamed from: d */
        private String f4862d;

        /* renamed from: e */
        private String f4863e;

        /* renamed from: f */
        private String f4864f;

        /* renamed from: g */
        private String f4865g;

        /* renamed from: h */
        private File f4866h;

        /* renamed from: i */
        private File f4867i;

        /* renamed from: j */
        private String f4868j;

        /* renamed from: k */
        private String f4869k;

        /* renamed from: l */
        private File f4870l;

        public C3068c(C3064h hVar, int i, String str, String str2, String str3, String str4, int i2, String str5, String str6) {
            super(hVar, i);
            this.f4871a = "yeelink.light.ble1";
            this.f4862d = str;
            this.f4863e = str3;
            this.f4864f = str2;
            this.f4865g = str4;
            this.f4861c = i2;
            this.f4868j = str5;
            this.f4869k = str6;
        }

        /* renamed from: c */
        public File mo23406c() {
            return this.f4870l;
        }

        /* renamed from: d */
        public String mo23407d() {
            return this.f4869k;
        }

        /* renamed from: e */
        public String mo23408e() {
            return this.f4868j;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C3068c)) {
                return false;
            }
            C3068c cVar = (C3068c) obj;
            return cVar.mo23419b().equals(mo23419b()) && cVar.mo23418a() == mo23418a();
        }

        /* renamed from: f */
        public File mo23410f() {
            return this.f4866h;
        }

        /* renamed from: g */
        public String mo23411g() {
            return this.f4864f;
        }

        /* renamed from: h */
        public String mo23412h() {
            return this.f4862d;
        }

        /* renamed from: i */
        public File mo23413i() {
            return this.f4867i;
        }

        /* renamed from: j */
        public String mo23414j() {
            return this.f4865g;
        }

        /* renamed from: k */
        public String mo23415k() {
            return this.f4863e;
        }

        /* renamed from: l */
        public int mo23416l() {
            return this.f4861c;
        }

        /* renamed from: m */
        public void mo23417m(int i, File file) {
            if (i == 1) {
                this.f4866h = file;
            } else if (i == 2) {
                this.f4867i = file;
            } else if (i == 2541) {
                this.f4870l = file;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.h$d */
    public class C3069d {

        /* renamed from: a */
        protected String f4871a;

        /* renamed from: b */
        private int f4872b;

        public C3069d(C3064h hVar, int i) {
            this.f4872b = i;
        }

        /* renamed from: a */
        public int mo23418a() {
            return this.f4872b;
        }

        /* renamed from: b */
        public String mo23419b() {
            return this.f4871a;
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.h$e */
    public class C3070e extends C3069d {

        /* renamed from: c */
        private File f4873c;

        /* renamed from: d */
        private String f4874d;

        /* renamed from: e */
        private String f4875e = TimerCodec.DISENABLE;

        /* renamed from: f */
        private JSONObject f4876f;

        /* renamed from: g */
        private String f4877g;

        public C3070e(C3064h hVar, String str, String str2, JSONObject jSONObject, String str3) {
            super(hVar, hVar.mo23398v(str));
            this.f4871a = "yeelink.light.gingko";
            this.f4874d = str2;
            this.f4875e = str;
            this.f4876f = jSONObject;
            this.f4877g = str3;
        }

        /* renamed from: c */
        public String mo23420c() {
            return this.f4877g;
        }

        /* renamed from: d */
        public File mo23421d() {
            return this.f4873c;
        }

        /* renamed from: e */
        public String mo23422e() {
            return this.f4874d;
        }

        /* renamed from: f */
        public String mo23423f() {
            return this.f4875e;
        }

        /* renamed from: g */
        public String mo23424g() {
            try {
                if (this.f4876f != null) {
                    String string = this.f4876f.getString(C8281l.m19542b().mo35224c());
                    return TextUtils.isEmpty(string) ? this.f4876f.getString("en") : string;
                }
            } catch (JSONException unused) {
            }
            return null;
        }

        /* renamed from: h */
        public void mo23425h(File file) {
            this.f4873c = file;
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.h$f */
    public class C3071f extends C3069d {

        /* renamed from: c */
        private File f4878c;

        /* renamed from: d */
        private String f4879d;

        /* renamed from: e */
        private String f4880e = TimerCodec.DISENABLE;

        /* renamed from: f */
        private String f4881f;

        /* renamed from: g */
        private String f4882g;

        public C3071f(C3064h hVar, String str, String str2, String str3, String str4, String str5) {
            super(hVar, hVar.mo23399w(str, str5));
            this.f4871a = str5;
            this.f4879d = str2;
            this.f4880e = str;
            this.f4881f = str3;
            this.f4882g = str4;
        }

        /* renamed from: c */
        public String mo23426c() {
            return this.f4882g;
        }

        /* renamed from: d */
        public File mo23427d() {
            return this.f4878c;
        }

        /* renamed from: e */
        public String mo23428e() {
            return this.f4879d;
        }

        /* renamed from: f */
        public String mo23429f() {
            return this.f4880e;
        }

        /* renamed from: g */
        public String mo23430g() {
            return this.f4881f;
        }

        /* renamed from: h */
        public void mo23431h(File file) {
            this.f4878c = file;
        }
    }

    private C3064h() {
        C3051a.m7925r().mo23358M(this);
    }

    private C3064h(Context context) {
        this.f4853a = context;
        C3051a.m7925r().mo23358M(this);
    }

    /* renamed from: j */
    public static C3064h m7982j() {
        if (f4852g == null) {
            f4852g = new C3064h();
        }
        return f4852g;
    }

    /* renamed from: k */
    public static C3064h m7983k(Context context) {
        if (f4852g == null) {
            f4852g = new C3064h(context);
        }
        return f4852g;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public boolean m7984s(C3070e eVar) {
        File externalFilesDir = this.f4853a.getExternalFilesDir((String) null);
        if (externalFilesDir == null) {
            return false;
        }
        File file = new File(externalFilesDir.getAbsolutePath() + "/gingko/" + eVar.mo23423f() + ".bin");
        StringBuilder sb = new StringBuilder();
        sb.append("isFirmwareFileValid, firmware image file: ");
        sb.append(file.getAbsolutePath());
        if (!file.exists()) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("isFirmwareFileValid, firmware image file found, check md5: ");
        sb2.append(eVar.mo23420c());
        String d = C9194m.m22161d(file);
        if (d == null || !d.equals(eVar.mo23420c())) {
            C9194m.m22158a(file.getParentFile());
            return false;
        }
        eVar.mo23425h(file);
        return true;
    }

    /* renamed from: t */
    private boolean m7985t(C3071f fVar) {
        File externalFilesDir = this.f4853a.getExternalFilesDir((String) null);
        if (externalFilesDir == null) {
            return false;
        }
        File file = new File(externalFilesDir.getAbsolutePath() + MiotCloudImpl.COOKIE_PATH + C3106w.m8214g().mo23536h(fVar.mo23419b()) + MiotCloudImpl.COOKIE_PATH + fVar.mo23429f() + ".bin");
        StringBuilder sb = new StringBuilder();
        sb.append("isFirmwareFileValid, firmware image file: ");
        sb.append(file.getAbsolutePath());
        if (!file.exists()) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("isFirmwareFileValid, firmware image file found, check md5: ");
        sb2.append(fVar.mo23426c());
        String d = C9194m.m22161d(file);
        if (d == null || !d.equals(fVar.mo23426c())) {
            C9194m.m22158a(file.getParentFile());
            return false;
        }
        fVar.mo23431h(file);
        return true;
    }

    /* renamed from: A */
    public void mo23390A(String str) {
        if (!this.f4854b.contains(str)) {
            this.f4854b.add(str);
            str.hashCode();
            if (str.equals("yeelink.light.ble1")) {
                mo23400x();
            } else if (str.equals("yeelink.light.gingko")) {
                mo23402z();
            }
        }
    }

    /* renamed from: B */
    public String mo23391B(int i) {
        String valueOf = String.valueOf(i);
        if (valueOf.length() != 4) {
            String str = f4851f;
            AppUtils.m8300u(str, "Invalid firmware format: " + valueOf);
            return "";
        }
        String substring = valueOf.substring(0, 1);
        String substring2 = valueOf.substring(1, 2);
        String substring3 = valueOf.substring(2, 4);
        return substring + "." + substring2 + "." + substring3;
    }

    /* renamed from: C */
    public void mo23255C(C3051a.C3062k kVar) {
    }

    /* renamed from: H */
    public void mo23262H() {
    }

    /* renamed from: d */
    public void mo23283d() {
    }

    /* renamed from: g */
    public void mo23288g() {
    }

    /* renamed from: h */
    public void mo23291h() {
        mo23401y();
    }

    /* renamed from: i */
    public int mo23392i() {
        return this.f4857e;
    }

    /* renamed from: l */
    public void mo23300l() {
    }

    /* renamed from: m */
    public C3069d mo23393m(String str) {
        return mo23394n(str, false);
    }

    /* renamed from: n */
    public C3069d mo23394n(String str, boolean z) {
        C3069d dVar = this.f4855c.get(str);
        if (dVar == null) {
            mo23390A(str);
            return null;
        } else if (!mo23395o(dVar)) {
            C3106w.m8214g().mo23531b(dVar);
            return null;
        } else if (this.f4856d || z || !"yeelink.light.ble1".equals(str)) {
            return dVar;
        } else {
            return null;
        }
    }

    /* renamed from: o */
    public boolean mo23395o(C3069d dVar) {
        String b = dVar.mo23419b();
        b.hashCode();
        char c = 65535;
        switch (b.hashCode()) {
            case -1400275319:
                if (b.equals("yeelink.light.ble1")) {
                    c = 0;
                    break;
                }
                break;
            case -1199119278:
                if (b.equals("yeelink.light.gingko")) {
                    c = 1;
                    break;
                }
                break;
            case -443031172:
                if (b.equals("yeelink.light.spot1")) {
                    c = 2;
                    break;
                }
                break;
            case 1201766335:
                if (b.equals("yeelink.light.ml1")) {
                    c = 3;
                    break;
                }
                break;
            case 1201766336:
                if (b.equals("yeelink.light.ml2")) {
                    c = 4;
                    break;
                }
                break;
            case 2102612488:
                if (b.equals("yeelink.light.meshbulb1")) {
                    c = 5;
                    break;
                }
                break;
            case 2102612489:
                if (b.equals("yeelink.light.meshbulb2")) {
                    c = 6;
                    break;
                }
                break;
            case 2146130361:
                if (b.equals("yeelink.light.dnlight2")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                C3068c cVar = (C3068c) dVar;
                return mo23396p(cVar, 1, cVar.mo23411g()) && mo23396p(cVar, 2, cVar.mo23414j()) && mo23396p(cVar, 2541, cVar.mo23407d());
            case 1:
                return m7984s((C3070e) dVar);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return m7985t((C3071f) dVar);
            default:
                return false;
        }
    }

    /* renamed from: p */
    public boolean mo23396p(C3068c cVar, int i, String str) {
        if (!(i == 1 || i == 2 || i == 2541)) {
            AppUtils.m8300u(f4851f, "Invalid firmware subindex, fix me!");
        }
        File externalFilesDir = this.f4853a.getExternalFilesDir((String) null);
        if (externalFilesDir == null) {
            return false;
        }
        File file = new File(externalFilesDir.getAbsolutePath() + "/cherry/" + cVar.mo23418a() + "/app" + i + ".bin");
        StringBuilder sb = new StringBuilder();
        sb.append("isFirmwareFileValid, firmware image file: ");
        sb.append(file.getAbsolutePath());
        if (!file.exists()) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("isFirmwareFileValid, firmware image: ");
        sb2.append(i);
        sb2.append(", file found, check md5: ");
        sb2.append(str);
        String d = C9194m.m22161d(file);
        if (d == null || !d.equals(str)) {
            C9194m.m22158a(file.getParentFile());
            return false;
        }
        cVar.mo23417m(i, file);
        return true;
    }

    /* renamed from: q */
    public void mo23308q(String str) {
    }

    /* renamed from: r */
    public void mo23310r(String str) {
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23397u(org.json.JSONObject r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "parseMeshDeviceFirmwareInfor, response: "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = "result"
            org.json.JSONObject r9 = r9.getJSONObject(r0)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r0 = "version"
            java.lang.String r3 = r9.getString(r0)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r0 = "changeLog"
            java.lang.String r5 = r9.getString(r0)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r0 = "safe_url"
            java.lang.String r4 = r9.getString(r0)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r0 = "md5"
            java.lang.String r6 = r9.getString(r0)     // Catch:{ Exception -> 0x0045 }
            com.yeelight.yeelib.managers.h$f r9 = new com.yeelight.yeelib.managers.h$f
            r1 = r9
            r2 = r8
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.util.HashMap<java.lang.String, com.yeelight.yeelib.managers.h$d> r0 = r8.f4855c
            r0.put(r10, r9)
            boolean r10 = r8.m7985t(r9)
            if (r10 != 0) goto L_0x0045
            com.yeelight.yeelib.managers.w r10 = com.yeelight.yeelib.managers.C3106w.m8214g()     // Catch:{  }
            r10.mo23531b(r9)     // Catch:{  }
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.managers.C3064h.mo23397u(org.json.JSONObject, java.lang.String):void");
    }

    /* renamed from: v */
    public int mo23398v(String str) {
        return mo23399w(str, "");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        if (r6.equals("yeelink.light.spot1") == false) goto L_0x000d;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo23399w(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = -1
            int r2 = r6.hashCode()
            r3 = 1
            switch(r2) {
                case -443031172: goto L_0x0046;
                case 1201766335: goto L_0x003b;
                case 1201766336: goto L_0x0030;
                case 2102612488: goto L_0x0025;
                case 2102612489: goto L_0x001a;
                case 2146130361: goto L_0x000f;
                default: goto L_0x000d;
            }
        L_0x000d:
            r0 = -1
            goto L_0x004f
        L_0x000f:
            java.lang.String r0 = "yeelink.light.dnlight2"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0018
            goto L_0x000d
        L_0x0018:
            r0 = 5
            goto L_0x004f
        L_0x001a:
            java.lang.String r0 = "yeelink.light.meshbulb2"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0023
            goto L_0x000d
        L_0x0023:
            r0 = 4
            goto L_0x004f
        L_0x0025:
            java.lang.String r0 = "yeelink.light.meshbulb1"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x002e
            goto L_0x000d
        L_0x002e:
            r0 = 3
            goto L_0x004f
        L_0x0030:
            java.lang.String r0 = "yeelink.light.ml2"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0039
            goto L_0x000d
        L_0x0039:
            r0 = 2
            goto L_0x004f
        L_0x003b:
            java.lang.String r0 = "yeelink.light.ml1"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0044
            goto L_0x000d
        L_0x0044:
            r0 = 1
            goto L_0x004f
        L_0x0046:
            java.lang.String r2 = "yeelink.light.spot1"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x004f
            goto L_0x000d
        L_0x004f:
            switch(r0) {
                case 0: goto L_0x006f;
                case 1: goto L_0x006f;
                case 2: goto L_0x006f;
                case 3: goto L_0x006f;
                case 4: goto L_0x006f;
                case 5: goto L_0x006f;
                default: goto L_0x0052;
            }
        L_0x0052:
            java.lang.String r6 = "[^0-9]"
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6)
            java.util.regex.Matcher r5 = r6.matcher(r5)
            java.lang.String r6 = ""
            java.lang.String r5 = r5.replaceAll(r6)
            java.lang.String r5 = r5.trim()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r5 = r5.intValue()
            return r5
        L_0x006f:
            java.lang.String r6 = "_"
            int r6 = r5.indexOf(r6)
            int r6 = r6 + r3
            java.lang.String r5 = r5.substring(r6)
            java.lang.String r5 = r5.trim()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r5 = r5.intValue()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "parseVersionNumber, version = "
            r6.append(r0)
            r6.append(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.managers.C3064h.mo23399w(java.lang.String, java.lang.String):int");
    }

    /* renamed from: x */
    public void mo23400x() {
        String str = AppUtils.f4993q + "firmware/update";
        if (AppUtils.f4977a) {
            str = str + "?debug=1";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("queryCherryFirmware, url = ");
        sb.append(str);
        C3988b.m11567c(str, String.class, new C3066b());
    }

    /* renamed from: y */
    public void mo23401y() {
        mo23390A("yeelink.light.ble1");
        mo23390A("yeelink.light.gingko");
    }

    /* renamed from: z */
    public void mo23402z() {
        String str = AppUtils.f4993q + "firmware/update?model=gingko&uuid=" + AppUtils.m8281b();
        if (AppUtils.f4977a) {
            str = str + "&debug=1";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("queryGingkoFirmware, url = ");
        sb.append(str);
        C3988b.m11567c(str, String.class, new C3065a());
    }
}

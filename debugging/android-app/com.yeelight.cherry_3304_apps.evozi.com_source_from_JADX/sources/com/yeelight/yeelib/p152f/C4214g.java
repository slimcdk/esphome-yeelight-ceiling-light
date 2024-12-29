package com.yeelight.yeelib.p152f;

import android.content.Context;
import android.text.TextUtils;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p187h.C9862d;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import com.yeelight.yeelib.utils.C10548o;
import com.yeelight.yeelib.utils.C4308b;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.f.g */
public class C4214g implements C4201a.C4202i {

    /* renamed from: f */
    public static final String f7293f = "g";

    /* renamed from: g */
    private static C4214g f7294g;

    /* renamed from: a */
    private Context f7295a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<String> f7296b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public HashMap<String, C4219d> f7297c = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f7298d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f7299e = 35;

    /* renamed from: com.yeelight.yeelib.f.g$a */
    class C4215a implements C9874b<String> {
        C4215a() {
        }

        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo23475a(java.lang.String r8) {
            /*
                r7 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "queryGingkoFirmware, onSuccess, response: "
                r0.append(r1)
                r0.append(r8)
                r0.toString()
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0064 }
                r0.<init>(r8)     // Catch:{ Exception -> 0x0064 }
                java.lang.String r8 = "release_version"
                java.lang.String r3 = r0.getString(r8)     // Catch:{ Exception -> 0x0064 }
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x0064 }
                java.lang.String r8 = "release_note_json"
                java.lang.String r8 = r0.getString(r8)     // Catch:{ Exception -> 0x0064 }
                r5.<init>(r8)     // Catch:{ Exception -> 0x0064 }
                java.lang.String r8 = "file_url"
                java.lang.String r4 = r0.getString(r8)     // Catch:{ Exception -> 0x0064 }
                java.lang.String r8 = "md5_checksum"
                java.lang.String r6 = r0.getString(r8)     // Catch:{ Exception -> 0x0064 }
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0064 }
                r8.<init>()     // Catch:{ Exception -> 0x0064 }
                java.lang.String r0 = "queryGingkoFirmware, onSuccess, latest version: "
                r8.append(r0)     // Catch:{ Exception -> 0x0064 }
                r8.append(r3)     // Catch:{ Exception -> 0x0064 }
                r8.toString()     // Catch:{ Exception -> 0x0064 }
                com.yeelight.yeelib.f.g$e r8 = new com.yeelight.yeelib.f.g$e
                com.yeelight.yeelib.f.g r2 = com.yeelight.yeelib.p152f.C4214g.this
                r1 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                com.yeelight.yeelib.f.g r0 = com.yeelight.yeelib.p152f.C4214g.this
                java.util.HashMap r0 = r0.f7297c
                java.lang.String r1 = "yeelink.light.gingko"
                r0.put(r1, r8)
                com.yeelight.yeelib.f.g r0 = com.yeelight.yeelib.p152f.C4214g.this
                boolean r0 = r0.m11667s(r8)
                if (r0 != 0) goto L_0x0064
                com.yeelight.yeelib.f.x r0 = com.yeelight.yeelib.p152f.C4295x.m12055g()     // Catch:{  }
                r0.mo23721b(r8)     // Catch:{  }
            L_0x0064:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p152f.C4214g.C4215a.mo23475a(java.lang.String):void");
        }

        public void onFailure(int i, String str) {
            "queryGingkoFirmware, onFailure!!" + str + ", fail mesage = " + str;
            C4214g.this.f7296b.remove("yeelink.light.ble1");
        }
    }

    /* renamed from: com.yeelight.yeelib.f.g$b */
    class C4216b implements C9874b<String> {

        /* renamed from: com.yeelight.yeelib.f.g$b$a */
        class C4217a implements C9874b<String> {
            C4217a() {
            }

            /* renamed from: b */
            public void mo23475a(String str) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    int i = jSONObject.getInt("code");
                    boolean z = jSONObject.getBoolean("canUpgrade");
                    if (i != 1 || !z) {
                        boolean unused = C4214g.this.f7298d = false;
                        String str2 = C4214g.f7293f;
                        return;
                    }
                    boolean unused2 = C4214g.this.f7298d = true;
                    int unused3 = C4214g.this.f7299e = jSONObject.getInt("otaSendDelay");
                } catch (Exception e) {
                    e.printStackTrace();
                    boolean unused4 = C4214g.this.f7298d = false;
                }
            }

            public void onFailure(int i, String str) {
                boolean unused = C4214g.this.f7298d = false;
            }
        }

        C4216b() {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            "queryCherryFirmware, onSuccess, response: " + str;
            try {
                JSONObject jSONObject = new JSONObject(str);
                int v = C4214g.this.mo23499v(jSONObject.getString("release_version"));
                String string = jSONObject.getString("file_url");
                String string2 = jSONObject.getString("file2_url");
                "queryCherryFirmware, onSuccess, latest version: " + v;
                C4218c cVar = new C4218c(C4214g.this, v, string, jSONObject.getString("md5_checksum"), string2, jSONObject.getString("md5_checksum2"), C4214g.this.mo23499v(jSONObject.getString("bt_version")), jSONObject.getString("bt_url"), jSONObject.getString("bt_md5_checksum"));
                C4214g.this.f7297c.put("yeelink.light.ble1", cVar);
                if (!C4214g.this.mo23496o(cVar)) {
                    try {
                        C4295x.m12055g().mo23721b(cVar);
                    } catch (Exception unused) {
                    }
                }
                if (C4308b.f7482a) {
                    boolean unused2 = C4214g.this.f7298d = true;
                    return;
                }
                C9862d.m24133c(C4308b.f7492k + "gray-upgrade?firmware_version=" + C4214g.this.mo23492B(cVar.mo23519a()) + "&app_uuid=" + C4308b.m12123b(), String.class, new C4217a());
            } catch (Exception unused3) {
            }
        }

        public void onFailure(int i, String str) {
            "queryCherryFirmware, onFailure, response: " + str + ", message = " + str;
            C4214g.this.f7296b.remove("yeelink.light.ble1");
        }
    }

    /* renamed from: com.yeelight.yeelib.f.g$c */
    public class C4218c extends C4219d {

        /* renamed from: c */
        private int f7303c;

        /* renamed from: d */
        private String f7304d;

        /* renamed from: e */
        private String f7305e;

        /* renamed from: f */
        private String f7306f;

        /* renamed from: g */
        private String f7307g;

        /* renamed from: h */
        private File f7308h;

        /* renamed from: i */
        private File f7309i;

        /* renamed from: j */
        private String f7310j;

        /* renamed from: k */
        private String f7311k;

        /* renamed from: l */
        private File f7312l;

        public C4218c(C4214g gVar, int i, String str, String str2, String str3, String str4, int i2, String str5, String str6) {
            super(gVar, i);
            this.f7313a = "yeelink.light.ble1";
            this.f7304d = str;
            this.f7305e = str3;
            this.f7306f = str2;
            this.f7307g = str4;
            this.f7303c = i2;
            this.f7310j = str5;
            this.f7311k = str6;
        }

        /* renamed from: c */
        public File mo23507c() {
            return this.f7312l;
        }

        /* renamed from: d */
        public String mo23508d() {
            return this.f7311k;
        }

        /* renamed from: e */
        public String mo23509e() {
            return this.f7310j;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C4218c)) {
                return false;
            }
            C4218c cVar = (C4218c) obj;
            return cVar.mo23520b().equals(mo23520b()) && cVar.mo23519a() == mo23519a();
        }

        /* renamed from: f */
        public File mo23511f() {
            return this.f7308h;
        }

        /* renamed from: g */
        public String mo23512g() {
            return this.f7306f;
        }

        /* renamed from: h */
        public String mo23513h() {
            return this.f7304d;
        }

        /* renamed from: i */
        public File mo23514i() {
            return this.f7309i;
        }

        /* renamed from: j */
        public String mo23515j() {
            return this.f7307g;
        }

        /* renamed from: k */
        public String mo23516k() {
            return this.f7305e;
        }

        /* renamed from: l */
        public int mo23517l() {
            return this.f7303c;
        }

        /* renamed from: m */
        public void mo23518m(int i, File file) {
            if (i == 1) {
                this.f7308h = file;
            } else if (i == 2) {
                this.f7309i = file;
            } else if (i == 2541) {
                this.f7312l = file;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.f.g$d */
    public class C4219d {

        /* renamed from: a */
        protected String f7313a;

        /* renamed from: b */
        private int f7314b;

        public C4219d(C4214g gVar, int i) {
            this.f7314b = i;
        }

        /* renamed from: a */
        public int mo23519a() {
            return this.f7314b;
        }

        /* renamed from: b */
        public String mo23520b() {
            return this.f7313a;
        }
    }

    /* renamed from: com.yeelight.yeelib.f.g$e */
    public class C4220e extends C4219d {

        /* renamed from: c */
        private File f7315c;

        /* renamed from: d */
        private String f7316d;

        /* renamed from: e */
        private String f7317e = TimerCodec.DISENABLE;

        /* renamed from: f */
        private JSONObject f7318f;

        /* renamed from: g */
        private String f7319g;

        public C4220e(C4214g gVar, String str, String str2, JSONObject jSONObject, String str3) {
            super(gVar, gVar.mo23499v(str));
            this.f7313a = "yeelink.light.gingko";
            this.f7316d = str2;
            this.f7317e = str;
            this.f7318f = jSONObject;
            this.f7319g = str3;
        }

        /* renamed from: c */
        public String mo23521c() {
            return this.f7319g;
        }

        /* renamed from: d */
        public File mo23522d() {
            return this.f7315c;
        }

        /* renamed from: e */
        public String mo23523e() {
            return this.f7316d;
        }

        /* renamed from: f */
        public String mo23524f() {
            return this.f7317e;
        }

        /* renamed from: g */
        public String mo23525g() {
            try {
                if (this.f7318f != null) {
                    String string = this.f7318f.getString(C4230l.m11766b().mo23553c());
                    return TextUtils.isEmpty(string) ? this.f7318f.getString("en") : string;
                }
            } catch (JSONException unused) {
            }
            return null;
        }

        /* renamed from: h */
        public void mo23526h(File file) {
            this.f7315c = file;
        }
    }

    /* renamed from: com.yeelight.yeelib.f.g$f */
    public class C4221f extends C4219d {

        /* renamed from: c */
        private File f7320c;

        /* renamed from: d */
        private String f7321d;

        /* renamed from: e */
        private String f7322e = TimerCodec.DISENABLE;

        /* renamed from: f */
        private String f7323f;

        /* renamed from: g */
        private String f7324g;

        public C4221f(C4214g gVar, String str, String str2, String str3, String str4, String str5) {
            super(gVar, gVar.mo23500w(str, str5));
            this.f7313a = str5;
            this.f7321d = str2;
            this.f7322e = str;
            this.f7323f = str3;
            this.f7324g = str4;
        }

        /* renamed from: c */
        public String mo23527c() {
            return this.f7324g;
        }

        /* renamed from: d */
        public File mo23528d() {
            return this.f7320c;
        }

        /* renamed from: e */
        public String mo23529e() {
            return this.f7321d;
        }

        /* renamed from: f */
        public String mo23530f() {
            return this.f7322e;
        }

        /* renamed from: g */
        public String mo23531g() {
            return this.f7323f;
        }

        /* renamed from: h */
        public void mo23532h(File file) {
            this.f7320c = file;
        }
    }

    private C4214g() {
        C4201a.m11607r().mo23444M(this);
    }

    private C4214g(Context context) {
        this.f7295a = context;
        C4201a.m11607r().mo23444M(this);
    }

    /* renamed from: j */
    public static C4214g m11665j() {
        if (f7294g == null) {
            f7294g = new C4214g();
        }
        return f7294g;
    }

    /* renamed from: k */
    public static C4214g m11666k(Context context) {
        if (f7294g == null) {
            f7294g = new C4214g(context);
        }
        return f7294g;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public boolean m11667s(C4220e eVar) {
        File externalFilesDir = this.f7295a.getExternalFilesDir((String) null);
        if (externalFilesDir == null) {
            return false;
        }
        File file = new File(externalFilesDir.getAbsolutePath() + "/gingko/" + eVar.mo23524f() + ".bin");
        StringBuilder sb = new StringBuilder();
        sb.append("isFirmwareFileValid, firmware image file: ");
        sb.append(file.getAbsolutePath());
        sb.toString();
        if (!file.exists()) {
            return false;
        }
        "isFirmwareFileValid, firmware image file found, check md5: " + eVar.mo23521c();
        String d = C10548o.m25762d(file);
        if (d == null || !d.equals(eVar.mo23521c())) {
            C10548o.m25759a(file.getParentFile());
            return false;
        }
        eVar.mo23526h(file);
        return true;
    }

    /* renamed from: t */
    private boolean m11668t(C4221f fVar) {
        File externalFilesDir = this.f7295a.getExternalFilesDir((String) null);
        if (externalFilesDir == null) {
            return false;
        }
        File file = new File(externalFilesDir.getAbsolutePath() + MiotCloudImpl.COOKIE_PATH + C4295x.m12055g().mo23726h(fVar.mo23520b()) + MiotCloudImpl.COOKIE_PATH + fVar.mo23530f() + ".bin");
        StringBuilder sb = new StringBuilder();
        sb.append("isFirmwareFileValid, firmware image file: ");
        sb.append(file.getAbsolutePath());
        sb.toString();
        if (!file.exists()) {
            return false;
        }
        "isFirmwareFileValid, firmware image file found, check md5: " + fVar.mo23527c();
        String d = C10548o.m25762d(file);
        if (d == null || !d.equals(fVar.mo23527c())) {
            C10548o.m25759a(file.getParentFile());
            return false;
        }
        fVar.mo23532h(file);
        return true;
    }

    /* renamed from: A */
    public void mo23491A(String str) {
        if (!this.f7296b.contains(str)) {
            this.f7296b.add(str);
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1400275319) {
                if (hashCode == -1199119278 && str.equals("yeelink.light.gingko")) {
                    c = 1;
                }
            } else if (str.equals("yeelink.light.ble1")) {
                c = 0;
            }
            if (c == 0) {
                mo23501x();
            } else if (c == 1) {
                mo23503z();
            }
        }
    }

    /* renamed from: B */
    public String mo23492B(int i) {
        String valueOf = String.valueOf(i);
        if (valueOf.length() != 4) {
            String str = f7293f;
            C4308b.m12139r(str, "Invalid firmware format: " + valueOf);
            return "";
        }
        String substring = valueOf.substring(0, 1);
        String substring2 = valueOf.substring(1, 2);
        String substring3 = valueOf.substring(2, 4);
        return substring + "." + substring2 + "." + substring3;
    }

    /* renamed from: C */
    public void mo23456C(C4201a.C4212k kVar) {
    }

    /* renamed from: H */
    public void mo23457H() {
    }

    /* renamed from: d */
    public void mo23458d() {
    }

    /* renamed from: g */
    public void mo23459g() {
    }

    /* renamed from: h */
    public int mo23493h() {
        return this.f7299e;
    }

    /* renamed from: i */
    public void mo23460i() {
        mo23502y();
    }

    /* renamed from: l */
    public void mo23461l() {
    }

    /* renamed from: m */
    public C4219d mo23494m(String str) {
        return mo23495n(str, false);
    }

    /* renamed from: n */
    public C4219d mo23495n(String str, boolean z) {
        C4219d dVar = this.f7297c.get(str);
        if (dVar == null) {
            mo23491A(str);
            return null;
        } else if (!mo23496o(dVar)) {
            C4295x.m12055g().mo23721b(dVar);
            return null;
        } else if (this.f7298d || z || !"yeelink.light.ble1".equals(str)) {
            return dVar;
        } else {
            return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo23496o(com.yeelight.yeelib.p152f.C4214g.C4219d r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.mo23520b()
            int r1 = r0.hashCode()
            r2 = 2
            r3 = 0
            r4 = 1
            switch(r1) {
                case -1400275319: goto L_0x0055;
                case -1199119278: goto L_0x004b;
                case -443031172: goto L_0x0041;
                case 1201766335: goto L_0x0037;
                case 1201766336: goto L_0x002d;
                case 2102612488: goto L_0x0023;
                case 2102612489: goto L_0x0019;
                case 2146130361: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x005f
        L_0x000f:
            java.lang.String r1 = "yeelink.light.dnlight2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005f
            r0 = 2
            goto L_0x0060
        L_0x0019:
            java.lang.String r1 = "yeelink.light.meshbulb2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005f
            r0 = 4
            goto L_0x0060
        L_0x0023:
            java.lang.String r1 = "yeelink.light.meshbulb1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005f
            r0 = 3
            goto L_0x0060
        L_0x002d:
            java.lang.String r1 = "yeelink.light.ml2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005f
            r0 = 7
            goto L_0x0060
        L_0x0037:
            java.lang.String r1 = "yeelink.light.ml1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005f
            r0 = 6
            goto L_0x0060
        L_0x0041:
            java.lang.String r1 = "yeelink.light.spot1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005f
            r0 = 5
            goto L_0x0060
        L_0x004b:
            java.lang.String r1 = "yeelink.light.gingko"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005f
            r0 = 1
            goto L_0x0060
        L_0x0055:
            java.lang.String r1 = "yeelink.light.ble1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005f
            r0 = 0
            goto L_0x0060
        L_0x005f:
            r0 = -1
        L_0x0060:
            switch(r0) {
                case 0: goto L_0x0072;
                case 1: goto L_0x006b;
                case 2: goto L_0x0064;
                case 3: goto L_0x0064;
                case 4: goto L_0x0064;
                case 5: goto L_0x0064;
                case 6: goto L_0x0064;
                case 7: goto L_0x0064;
                default: goto L_0x0063;
            }
        L_0x0063:
            return r3
        L_0x0064:
            com.yeelight.yeelib.f.g$f r7 = (com.yeelight.yeelib.p152f.C4214g.C4221f) r7
            boolean r7 = r6.m11668t(r7)
            return r7
        L_0x006b:
            com.yeelight.yeelib.f.g$e r7 = (com.yeelight.yeelib.p152f.C4214g.C4220e) r7
            boolean r7 = r6.m11667s(r7)
            return r7
        L_0x0072:
            com.yeelight.yeelib.f.g$c r7 = (com.yeelight.yeelib.p152f.C4214g.C4218c) r7
            java.lang.String r0 = r7.mo23512g()
            boolean r0 = r6.mo23497p(r7, r4, r0)
            java.lang.String r1 = r7.mo23515j()
            boolean r1 = r6.mo23497p(r7, r2, r1)
            r2 = 2541(0x9ed, float:3.56E-42)
            java.lang.String r5 = r7.mo23508d()
            boolean r7 = r6.mo23497p(r7, r2, r5)
            if (r0 == 0) goto L_0x0095
            if (r1 == 0) goto L_0x0095
            if (r7 == 0) goto L_0x0095
            r3 = 1
        L_0x0095:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p152f.C4214g.mo23496o(com.yeelight.yeelib.f.g$d):boolean");
    }

    /* renamed from: p */
    public boolean mo23497p(C4218c cVar, int i, String str) {
        if (!(i == 1 || i == 2 || i == 2541)) {
            C4308b.m12139r(f7293f, "Invalid firmware subindex, fix me!");
        }
        File externalFilesDir = this.f7295a.getExternalFilesDir((String) null);
        if (externalFilesDir == null) {
            return false;
        }
        File file = new File(externalFilesDir.getAbsolutePath() + "/cherry/" + cVar.mo23519a() + "/app" + i + ".bin");
        StringBuilder sb = new StringBuilder();
        sb.append("isFirmwareFileValid, firmware image file: ");
        sb.append(file.getAbsolutePath());
        sb.toString();
        if (!file.exists()) {
            return false;
        }
        "isFirmwareFileValid, firmware image: " + i + ", file found, check md5: " + str;
        String d = C10548o.m25762d(file);
        if (d == null || !d.equals(str)) {
            C10548o.m25759a(file.getParentFile());
            return false;
        }
        cVar.mo23518m(i, file);
        return true;
    }

    /* renamed from: q */
    public void mo23462q(String str) {
    }

    /* renamed from: r */
    public void mo23463r(String str) {
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23498u(org.json.JSONObject r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "parseMeshDeviceFirmwareInfor, response: "
            r0.append(r1)
            r0.append(r9)
            r0.toString()
            java.lang.String r0 = "result"
            org.json.JSONObject r9 = r9.getJSONObject(r0)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r0 = "version"
            java.lang.String r3 = r9.getString(r0)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r0 = "changeLog"
            java.lang.String r5 = r9.getString(r0)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r0 = "safe_url"
            java.lang.String r4 = r9.getString(r0)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r0 = "md5"
            java.lang.String r6 = r9.getString(r0)     // Catch:{ Exception -> 0x0048 }
            com.yeelight.yeelib.f.g$f r9 = new com.yeelight.yeelib.f.g$f
            r1 = r9
            r2 = r8
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.util.HashMap<java.lang.String, com.yeelight.yeelib.f.g$d> r0 = r8.f7297c
            r0.put(r10, r9)
            boolean r10 = r8.m11668t(r9)
            if (r10 != 0) goto L_0x0048
            com.yeelight.yeelib.f.x r10 = com.yeelight.yeelib.p152f.C4295x.m12055g()     // Catch:{  }
            r10.mo23721b(r9)     // Catch:{  }
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p152f.C4214g.mo23498u(org.json.JSONObject, java.lang.String):void");
    }

    /* renamed from: v */
    public int mo23499v(String str) {
        return mo23500w(str, "");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r10.equals("yeelink.light.dnlight2") != false) goto L_0x004e;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo23500w(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            r0 = 0
            if (r10 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = -1
            int r2 = r10.hashCode()
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            switch(r2) {
                case -443031172: goto L_0x0043;
                case 1201766335: goto L_0x0039;
                case 1201766336: goto L_0x002f;
                case 2102612488: goto L_0x0025;
                case 2102612489: goto L_0x001b;
                case 2146130361: goto L_0x0012;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x004d
        L_0x0012:
            java.lang.String r2 = "yeelink.light.dnlight2"
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L_0x004d
            goto L_0x004e
        L_0x001b:
            java.lang.String r0 = "yeelink.light.meshbulb2"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x004d
            r0 = 2
            goto L_0x004e
        L_0x0025:
            java.lang.String r0 = "yeelink.light.meshbulb1"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x004d
            r0 = 1
            goto L_0x004e
        L_0x002f:
            java.lang.String r0 = "yeelink.light.ml2"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x004d
            r0 = 5
            goto L_0x004e
        L_0x0039:
            java.lang.String r0 = "yeelink.light.ml1"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x004d
            r0 = 4
            goto L_0x004e
        L_0x0043:
            java.lang.String r0 = "yeelink.light.spot1"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x004d
            r0 = 3
            goto L_0x004e
        L_0x004d:
            r0 = -1
        L_0x004e:
            if (r0 == 0) goto L_0x0077
            if (r0 == r7) goto L_0x0077
            if (r0 == r6) goto L_0x0077
            if (r0 == r5) goto L_0x0077
            if (r0 == r4) goto L_0x0077
            if (r0 == r3) goto L_0x0077
            java.lang.String r10 = "[^0-9]"
            java.util.regex.Pattern r10 = java.util.regex.Pattern.compile(r10)
            java.util.regex.Matcher r9 = r10.matcher(r9)
            java.lang.String r10 = ""
            java.lang.String r9 = r9.replaceAll(r10)
            java.lang.String r9 = r9.trim()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            int r9 = r9.intValue()
            return r9
        L_0x0077:
            java.lang.String r10 = "_"
            int r10 = r9.indexOf(r10)
            int r10 = r10 + r7
            java.lang.String r9 = r9.substring(r10)
            java.lang.String r9 = r9.trim()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            int r9 = r9.intValue()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "parseVersionNumber, version = "
            r10.append(r0)
            r10.append(r9)
            r10.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p152f.C4214g.mo23500w(java.lang.String, java.lang.String):int");
    }

    /* renamed from: x */
    public void mo23501x() {
        String str = C4308b.f7492k + "firmware/update";
        if (C4308b.f7482a) {
            str = str + "?debug=1";
        }
        "queryCherryFirmware, url = " + str;
        C9862d.m24133c(str, String.class, new C4216b());
    }

    /* renamed from: y */
    public void mo23502y() {
        mo23491A("yeelink.light.ble1");
        mo23491A("yeelink.light.gingko");
    }

    /* renamed from: z */
    public void mo23503z() {
        String str = C4308b.f7492k + "firmware/update?model=gingko&uuid=" + C4308b.m12123b();
        if (C4308b.f7482a) {
            str = str + "&debug=1";
        }
        "queryGingkoFirmware, url = " + str;
        C9862d.m24133c(str, String.class, new C4215a());
    }
}

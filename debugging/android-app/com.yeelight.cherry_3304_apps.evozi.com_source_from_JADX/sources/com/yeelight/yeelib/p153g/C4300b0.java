package com.yeelight.yeelib.p153g;

import com.miot.service.common.crypto.rc4coder.Coder;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.miot.service.manager.timer.TimerCodec;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p152f.C4230l;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p187h.C9862d;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import com.yeelight.yeelib.utils.C10559w;
import com.yeelight.yeelib.utils.C4308b;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p011c.p079c.p080a.p081a.C0985a;

/* renamed from: com.yeelight.yeelib.g.b0 */
public class C4300b0 {

    /* renamed from: e */
    private static C4300b0 f7463e;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Map<String, List<C9849r>> f7464a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Map<String, List<C9849r>> f7465b = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<C9838i> f7466c = new ArrayList();

    /* renamed from: d */
    private C9838i f7467d = new C9838i();

    /* renamed from: com.yeelight.yeelib.g.b0$a */
    class C4301a implements C9874b<String> {

        /* renamed from: a */
        final /* synthetic */ String f7468a;

        /* renamed from: b */
        final /* synthetic */ C4307g f7469b;

        C4301a(String str, C4307g gVar) {
            this.f7468a = str;
            this.f7469b = gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0050 A[Catch:{ JSONException -> 0x0071 }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo23475a(java.lang.String r4) {
            /*
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "get scene onSuccess, return result: "
                r0.append(r1)
                r0.append(r4)
                r0.toString()
                java.lang.String r0 = r3.f7468a
                int r1 = r0.hashCode()
                switch(r1) {
                    case -1400275319: goto L_0x0036;
                    case -1308146495: goto L_0x0033;
                    case -1063384694: goto L_0x0030;
                    case -948847040: goto L_0x002d;
                    case -448603205: goto L_0x002a;
                    case -448603202: goto L_0x0027;
                    case -448603201: goto L_0x0024;
                    case -448603157: goto L_0x0021;
                    case -448603156: goto L_0x001a;
                    default: goto L_0x0019;
                }
            L_0x0019:
                goto L_0x0039
            L_0x001a:
                java.lang.String r1 = "yeelink.light.monob"
            L_0x001c:
                boolean r0 = r0.equals(r1)
                goto L_0x0039
            L_0x0021:
                java.lang.String r1 = "yeelink.light.monoa"
                goto L_0x001c
            L_0x0024:
                java.lang.String r1 = "yeelink.light.mono5"
                goto L_0x001c
            L_0x0027:
                java.lang.String r1 = "yeelink.light.mono4"
                goto L_0x001c
            L_0x002a:
                java.lang.String r1 = "yeelink.light.mono1"
                goto L_0x001c
            L_0x002d:
                java.lang.String r1 = "yeelink.light.panel1"
                goto L_0x001c
            L_0x0030:
                java.lang.String r1 = "yeelink.light.lamp10"
                goto L_0x001c
            L_0x0033:
                java.lang.String r1 = "yeelink.light.color1"
                goto L_0x001c
            L_0x0036:
                java.lang.String r1 = "yeelink.light.ble1"
                goto L_0x001c
            L_0x0039:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0071 }
                r1.<init>(r4)     // Catch:{ JSONException -> 0x0071 }
                java.lang.String r4 = "scenes"
                org.json.JSONArray r4 = r1.getJSONArray(r4)     // Catch:{ JSONException -> 0x0071 }
                r1 = 0
            L_0x004a:
                int r2 = r4.length()     // Catch:{ JSONException -> 0x0071 }
                if (r1 >= r2) goto L_0x005e
                org.json.JSONObject r2 = r4.getJSONObject(r1)     // Catch:{ JSONException -> 0x0071 }
                com.yeelight.yeelib.g.r r2 = com.yeelight.yeelib.p153g.C9849r.m24017U(r2)     // Catch:{ JSONException -> 0x0071 }
                r0.add(r2)     // Catch:{ JSONException -> 0x0071 }
                int r1 = r1 + 1
                goto L_0x004a
            L_0x005e:
                com.yeelight.yeelib.g.b0 r4 = com.yeelight.yeelib.p153g.C4300b0.this
                java.util.Map r4 = r4.f7465b
                java.lang.String r1 = r3.f7468a
                r4.put(r1, r0)
                com.yeelight.yeelib.g.b0$g r4 = r3.f7469b
                if (r4 == 0) goto L_0x0070
                r4.onRefresh()
            L_0x0070:
                return
            L_0x0071:
                r4 = move-exception
                r4.printStackTrace()
                com.yeelight.yeelib.g.b0$g r4 = r3.f7469b
                if (r4 == 0) goto L_0x007e
                java.lang.String r0 = "Parse error !"
                r4.mo23766a(r0)
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p153g.C4300b0.C4301a.mo23475a(java.lang.String):void");
        }

        public void onFailure(int i, String str) {
            C4307g gVar = this.f7469b;
            if (gVar != null) {
                gVar.mo23770p(C4297y.f7456e.getString(R$string.scene_cache_get_list_fail));
                this.f7469b.mo23766a(C4297y.f7456e.getString(R$string.scene_cache_get_list_fail));
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.g.b0$b */
    class C4302b implements C9874b<String> {

        /* renamed from: a */
        final /* synthetic */ String f7471a;

        /* renamed from: b */
        final /* synthetic */ boolean f7472b;

        /* renamed from: c */
        final /* synthetic */ C4307g f7473c;

        C4302b(String str, boolean z, C4307g gVar) {
            this.f7471a = str;
            this.f7472b = z;
            this.f7473c = gVar;
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            C4307g gVar;
            try {
                "get scene onSuccess, return result: " + str;
                JSONArray jSONArray = new JSONObject(str).getJSONArray("scenes");
                C4300b0.this.f7466c.clear();
                for (int i = 0; i < jSONArray.length(); i++) {
                    C9838i a0 = C9838i.m23956a0(jSONArray.getJSONObject(i));
                    if (a0 != null) {
                        C4300b0.this.f7466c.add(a0);
                    }
                }
                C4300b0.this.mo23741e(this.f7471a, str);
            } catch (JSONException e) {
                e.printStackTrace();
                if (!this.f7472b && (gVar = this.f7473c) != null) {
                    gVar.mo23766a("Parse error !");
                    return;
                }
                return;
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            C4307g gVar2 = this.f7473c;
            if (gVar2 != null) {
                gVar2.onRefresh();
            }
        }

        public void onFailure(int i, String str) {
            C4307g gVar = this.f7473c;
            if (gVar != null && !this.f7472b) {
                gVar.mo23770p(C4297y.f7456e.getString(R$string.scene_cache_get_list_fail));
                this.f7473c.mo23766a(C4297y.f7456e.getString(R$string.scene_cache_get_list_fail));
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.g.b0$c */
    class C4303c implements C9874b<String> {

        /* renamed from: a */
        final /* synthetic */ C4307g f7475a;

        C4303c(C4300b0 b0Var, C4307g gVar) {
            this.f7475a = gVar;
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            C4307g gVar;
            String string;
            try {
                int i = new JSONObject(str).getInt("code");
                "save scene onSuccess, return code: " + i;
                "save scene onSuccess, return result: " + str;
                if (i <= 0) {
                    if (i == -2) {
                        if (this.f7475a != null) {
                            this.f7475a.mo23770p(C4297y.f7456e.getString(R$string.scene_cache_save_limitation));
                            gVar = this.f7475a;
                            string = C4297y.f7456e.getString(R$string.scene_cache_save_limitation);
                        } else {
                            return;
                        }
                    } else if (i == -3) {
                        if (this.f7475a != null) {
                            this.f7475a.mo23770p(C4297y.f7456e.getString(R$string.scene_bundle_name_save_repeat));
                            gVar = this.f7475a;
                            string = C4297y.f7456e.getString(R$string.scene_bundle_name_save_repeat);
                        } else {
                            return;
                        }
                    } else if (this.f7475a != null) {
                        this.f7475a.mo23770p(C4297y.f7456e.getString(R$string.scene_cache_save_fail));
                        gVar = this.f7475a;
                        string = C4297y.f7456e.getString(R$string.scene_cache_save_fail);
                    } else {
                        return;
                    }
                    gVar.mo23766a(string);
                } else if (this.f7475a != null) {
                    this.f7475a.onRefresh();
                    this.f7475a.mo23770p(C4297y.f7456e.getString(R$string.scene_save_succeed));
                }
            } catch (JSONException e) {
                e.printStackTrace();
                C4307g gVar2 = this.f7475a;
                if (gVar2 != null) {
                    gVar2.mo23770p(C4297y.f7456e.getString(R$string.scene_cache_save_fail));
                    this.f7475a.mo23766a(e.getMessage());
                }
            }
        }

        public void onFailure(int i, String str) {
            "save scene onFailure message = " + str;
            C4307g gVar = this.f7475a;
            if (gVar != null) {
                gVar.mo23770p(C4297y.f7456e.getString(R$string.scene_cache_save_fail));
                this.f7475a.mo23766a(str);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.g.b0$d */
    class C4304d implements C9874b<String> {

        /* renamed from: a */
        final /* synthetic */ C4307g f7476a;

        C4304d(C4300b0 b0Var, C4307g gVar) {
            this.f7476a = gVar;
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            try {
                "delScene msg : " + str + ", size = " + str.length();
                if (new JSONObject(str).getInt("code") != 1) {
                    return;
                }
                if (this.f7476a != null) {
                    this.f7476a.mo23770p(C4297y.f7456e.getString(R$string.scene_cache_del_success));
                    this.f7476a.mo23767f();
                } else if (this.f7476a != null) {
                    this.f7476a.mo23770p(C4297y.f7456e.getString(R$string.scene_cache_del_fail));
                    this.f7476a.mo23766a(C4297y.f7456e.getString(R$string.scene_cache_del_fail));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            C4307g gVar = this.f7476a;
            if (gVar != null) {
                gVar.mo23770p(C4297y.f7456e.getString(R$string.scene_cache_del_fail));
                this.f7476a.mo23766a(C4297y.f7456e.getString(R$string.scene_cache_del_fail));
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.g.b0$e */
    class C4305e implements C9874b<String> {

        /* renamed from: a */
        final /* synthetic */ C4307g f7477a;

        C4305e(C4300b0 b0Var, C4307g gVar) {
            this.f7477a = gVar;
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            C4307g gVar;
            String string;
            try {
                "pdateCustomScene onResponse msg : " + str + ", size = " + str.length();
                int i = new JSONObject(str).getInt("code");
                "updateCustomScene onSuccess, return code: " + i;
                if (i <= 0) {
                    if (i == -2) {
                        if (this.f7477a != null) {
                            this.f7477a.mo23770p(C4297y.f7456e.getString(R$string.scene_cache_save_limitation));
                            gVar = this.f7477a;
                            string = C4297y.f7456e.getString(R$string.scene_cache_save_limitation);
                        } else {
                            return;
                        }
                    } else if (i == -3) {
                        if (this.f7477a != null) {
                            this.f7477a.mo23770p(C4297y.f7456e.getString(R$string.scene_bundle_name_save_repeat));
                            gVar = this.f7477a;
                            string = C4297y.f7456e.getString(R$string.scene_bundle_name_save_repeat);
                        } else {
                            return;
                        }
                    } else if (this.f7477a != null) {
                        this.f7477a.mo23770p(C4297y.f7456e.getString(R$string.scene_cache_save_fail));
                        gVar = this.f7477a;
                        string = C4297y.f7456e.getString(R$string.scene_cache_save_fail);
                    } else {
                        return;
                    }
                    gVar.mo23766a(string);
                } else if (this.f7477a != null) {
                    this.f7477a.onRefresh();
                    this.f7477a.mo23770p(C4297y.f7456e.getString(R$string.common_text_save_succeed));
                }
            } catch (JSONException e) {
                e.printStackTrace();
                C4307g gVar2 = this.f7477a;
                if (gVar2 != null) {
                    gVar2.mo23770p(C4297y.f7456e.getString(R$string.scene_cache_save_fail));
                    this.f7477a.mo23766a(e.getMessage());
                }
            }
        }

        public void onFailure(int i, String str) {
            "updateCustomScene scene onFailure, errot msg: " + str;
            C4307g gVar = this.f7477a;
            if (gVar != null) {
                gVar.mo23770p(C4297y.f7456e.getString(R$string.scene_cache_save_fail));
                this.f7477a.mo23766a(C4297y.f7456e.getString(R$string.scene_cache_save_fail));
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.g.b0$f */
    class C4306f implements C9874b<String> {

        /* renamed from: a */
        final /* synthetic */ String f7478a;

        /* renamed from: b */
        final /* synthetic */ C4307g f7479b;

        /* renamed from: c */
        final /* synthetic */ String f7480c;

        C4306f(String str, C4307g gVar, String str2) {
            this.f7478a = str;
            this.f7479b = gVar;
            this.f7480c = str2;
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            "get recommend scene onSuccess, return result: " + str;
            ArrayList arrayList = new ArrayList();
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getInt("count") > 0) {
                    JSONArray jSONArray = jSONObject.getJSONArray("scenes");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(C9849r.m24017U(jSONArray.getJSONObject(i)));
                    }
                }
                C4300b0.this.f7464a.put(this.f7478a, arrayList);
                if (this.f7479b != null) {
                    this.f7479b.mo23768n(false, arrayList);
                }
                C4300b0.this.mo23741e(this.f7480c, str);
            } catch (JSONException e) {
                e.printStackTrace();
                C4307g gVar = this.f7479b;
                if (gVar != null) {
                    gVar.mo23766a("queryRecommendScene onFailure !");
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            "queryRecommendScene onFailure, message = " + str;
            C4307g gVar = this.f7479b;
            if (gVar != null) {
                gVar.mo23766a("queryRecommendScene onFailure !");
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.g.b0$g */
    public interface C4307g {
        /* renamed from: a */
        void mo23766a(String str);

        /* renamed from: f */
        void mo23767f();

        /* renamed from: n */
        void mo23768n(boolean z, List<C9849r> list);

        void onRefresh();

        /* renamed from: p */
        void mo23770p(String str);
    }

    private C4300b0() {
    }

    /* renamed from: d */
    private String m12080d(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* renamed from: o */
    public static String m12081o(String str, JSONObject jSONObject) {
        String str2 = C4308b.f7490i + str;
        if (jSONObject != null) {
            try {
                JSONArray names = jSONObject.names();
                for (int i = 0; i < names.length(); i++) {
                    String string = names.getString(i);
                    String str3 = "&";
                    if (i == 0) {
                        str3 = "?";
                    }
                    str2 = str2 + str3 + string + "=" + jSONObject.getString(string);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return str2;
    }

    /* renamed from: t */
    private String m12082t(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(Coder.KEY_MD5);
            instance.update(str.getBytes());
            return m12080d(instance.digest());
        } catch (NoSuchAlgorithmException unused) {
            return String.valueOf(str.hashCode());
        }
    }

    /* renamed from: u */
    public static C4300b0 m12083u() {
        if (f7463e == null) {
            f7463e = new C4300b0();
        }
        return f7463e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x009a A[Catch:{ JSONException -> 0x00d4 }] */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23738A(com.yeelight.yeelib.p153g.C9849r r7, com.yeelight.yeelib.p153g.C4300b0.C4307g r8) {
        /*
            r6 = this;
            java.lang.String r0 = "type"
            java.lang.String r1 = "hw/v2/scene/create"
            r2 = 0
            java.lang.String r1 = m12081o(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "save scene url: "
            r2.append(r3)
            r2.append(r1)
            r2.toString()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "uid"
            com.yeelight.yeelib.f.a r4 = com.yeelight.yeelib.p152f.C4201a.m11607r()     // Catch:{ JSONException -> 0x00d4 }
            java.lang.String r4 = r4.mo23452v()     // Catch:{ JSONException -> 0x00d4 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x00d4 }
            java.lang.String r3 = "title"
            java.lang.String r4 = r7.mo31888t()     // Catch:{ JSONException -> 0x00d4 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x00d4 }
            java.lang.String r3 = "mode"
            int r4 = r7.mo31884p()     // Catch:{ JSONException -> 0x00d4 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x00d4 }
            java.lang.String r3 = "bright"
            int r4 = r7.mo31874f()     // Catch:{ JSONException -> 0x00d4 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ JSONException -> 0x00d4 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x00d4 }
            java.lang.String r3 = "color_temperature"
            int r4 = r7.mo31876h()     // Catch:{ JSONException -> 0x00d4 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ JSONException -> 0x00d4 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x00d4 }
            java.lang.String r3 = "wrgb"
            int r4 = r7.mo31875g()     // Catch:{ JSONException -> 0x00d4 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ JSONException -> 0x00d4 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x00d4 }
            int r3 = r7.mo31884p()     // Catch:{ JSONException -> 0x00d4 }
            r4 = 4
            java.lang.String r5 = "colorflow"
            if (r3 != r4) goto L_0x0075
            java.lang.String r3 = r7.mo31872d()     // Catch:{ JSONException -> 0x00d4 }
        L_0x0071:
            r2.put(r5, r3)     // Catch:{ JSONException -> 0x00d4 }
            goto L_0x0088
        L_0x0075:
            com.yeelight.yeelib.g.a r3 = r7.mo31871c()     // Catch:{ JSONException -> 0x00d4 }
            if (r3 == 0) goto L_0x0088
            com.yeelight.yeelib.g.a r3 = r7.mo31871c()     // Catch:{ JSONException -> 0x00d4 }
            org.json.JSONArray r3 = r3.mo31729n()     // Catch:{ JSONException -> 0x00d4 }
            java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x00d4 }
            goto L_0x0071
        L_0x0088:
            java.lang.String r3 = "remark"
            java.lang.String r4 = r7.mo31817V()     // Catch:{ JSONException -> 0x00d4 }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x00d4 }
            java.lang.String r3 = "1"
            r2.put(r0, r3)     // Catch:{ JSONException -> 0x00d4 }
            boolean r3 = r7 instanceof com.yeelight.yeelib.p153g.C9838i     // Catch:{ JSONException -> 0x00d4 }
            if (r3 == 0) goto L_0x00b5
            r3 = r7
            com.yeelight.yeelib.g.i r3 = (com.yeelight.yeelib.p153g.C9838i) r3     // Catch:{ JSONException -> 0x00d4 }
            int r3 = r3.mo31761d0()     // Catch:{ JSONException -> 0x00d4 }
            if (r3 <= 0) goto L_0x00aa
            com.yeelight.yeelib.g.i r7 = (com.yeelight.yeelib.p153g.C9838i) r7     // Catch:{ JSONException -> 0x00d4 }
            int r7 = r7.mo31761d0()     // Catch:{ JSONException -> 0x00d4 }
            goto L_0x00ab
        L_0x00aa:
            r7 = 0
        L_0x00ab:
            java.lang.String r3 = "subtype"
            r2.put(r3, r7)     // Catch:{ JSONException -> 0x00d4 }
            java.lang.String r7 = "2"
            r2.put(r0, r7)     // Catch:{ JSONException -> 0x00d4 }
        L_0x00b5:
            java.lang.String r7 = r2.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "save scene jsonObject: "
            r0.append(r2)
            r0.append(r7)
            r0.toString()
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            com.yeelight.yeelib.g.b0$c r2 = new com.yeelight.yeelib.g.b0$c
            r2.<init>(r6, r8)
            com.yeelight.yeelib.p187h.C9862d.m24138h(r1, r7, r0, r2)
            return
        L_0x00d4:
            r7 = move-exception
            r7.printStackTrace()
            if (r8 == 0) goto L_0x00e5
            android.content.Context r7 = com.yeelight.yeelib.p152f.C4297y.f7456e
            int r0 = com.yeelight.yeelib.R$string.scene_cache_save_fail
            java.lang.String r7 = r7.getString(r0)
            r8.mo23766a(r7)
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p153g.C4300b0.mo23738A(com.yeelight.yeelib.g.r, com.yeelight.yeelib.g.b0$g):void");
    }

    /* renamed from: B */
    public void mo23739B(C9838i iVar) {
        this.f7467d = iVar;
    }

    /* renamed from: C */
    public void mo23740C(C9849r rVar, C4307g gVar) {
        String o = m12081o("hw/v2/scene/user/" + rVar.mo31886r(), (JSONObject) null);
        "updateCustomScene url: " + o;
        new C0985a("utf-8");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uid", C4201a.m11607r().mo23452v());
            jSONObject.put(ScanBarcodeActivity.TITLE, rVar.mo31888t());
            jSONObject.put("mode", rVar.mo31884p());
            jSONObject.put("bright", String.valueOf(rVar.mo31874f()));
            jSONObject.put("color_temperature", String.valueOf(rVar.mo31876h()));
            jSONObject.put("wrgb", String.valueOf(rVar.mo31875g()));
            jSONObject.put("colorflow", rVar.mo31871c().mo31729n().toString());
            jSONObject.put("type", TimerCodec.ENABLE);
            jSONObject.put("subtype", ((C9838i) rVar).mo31761d0() > 0 ? ((C9838i) rVar).mo31761d0() : 0);
            jSONObject.put("type", "2");
            String jSONObject2 = jSONObject.toString();
            "updateCustomScene scene jsonObject: " + jSONObject2;
            C9862d.m24142l(o, jSONObject2, String.class, new C4305e(this, gVar));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    public void mo23741e(String str, String str2) {
        C10559w.m25816l(m12082t(str), str2);
    }

    /* renamed from: f */
    public void mo23742f(C9849r rVar, C4307g gVar) {
        String o = m12081o("hw/v2/scene/user/" + rVar.mo31886r(), (JSONObject) null);
        "del scene url: " + o;
        C9862d.m24131a(o, String.class, new C4304d(this, gVar));
    }

    /* renamed from: g */
    public String mo23743g(String str) {
        return C10559w.m25810f(m12082t(str), (String) null);
    }

    /* renamed from: h */
    public C9856y mo23744h(int i) {
        if (this.f7466c.size() == 0) {
            mo23755v((C4307g) null);
            return null;
        }
        for (C9830b next : this.f7466c) {
            if (next.mo31886r() == i) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: i */
    public List<C9838i> mo23745i() {
        return this.f7466c;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.yeelight.yeelib.p153g.C9838i> mo23746j(java.lang.String r5) {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r5.hashCode()
            r3 = 0
            switch(r2) {
                case -1644531059: goto L_0x03b8;
                case -1462015191: goto L_0x03ad;
                case -1462015190: goto L_0x03a2;
                case -1462015189: goto L_0x0397;
                case -1462015188: goto L_0x038c;
                case -1462015187: goto L_0x0381;
                case -1462015186: goto L_0x0376;
                case -1462015185: goto L_0x036b;
                case -1462015184: goto L_0x0360;
                case -1462015183: goto L_0x0354;
                case -1462015182: goto L_0x0348;
                case -1462015160: goto L_0x033c;
                case -1462015159: goto L_0x0330;
                case -1462015158: goto L_0x0324;
                case -1462015157: goto L_0x0318;
                case -1462015156: goto L_0x030c;
                case -1317475940: goto L_0x0300;
                case -1317475939: goto L_0x02f4;
                case -1317475937: goto L_0x02e8;
                case -1317475915: goto L_0x02dc;
                case -1317475914: goto L_0x02d0;
                case -1317475913: goto L_0x02c4;
                case -1317475912: goto L_0x02b8;
                case -1308146495: goto L_0x02ad;
                case -1308146494: goto L_0x02a2;
                case -1308146493: goto L_0x0297;
                case -1308146492: goto L_0x028c;
                case -1308146491: goto L_0x0281;
                case -1308146490: goto L_0x0276;
                case -1308146488: goto L_0x026b;
                case -1308146447: goto L_0x0260;
                case -1308146446: goto L_0x0254;
                case -1308146445: goto L_0x0248;
                case -1235140472: goto L_0x023c;
                case -1235140471: goto L_0x0230;
                case -1235140468: goto L_0x0224;
                case -1235140467: goto L_0x0218;
                case -1063384694: goto L_0x020c;
                case -1063384689: goto L_0x0200;
                case -1063384687: goto L_0x01f4;
                case -1063384685: goto L_0x01e8;
                case -948847040: goto L_0x01dc;
                case -948847038: goto L_0x01d0;
                case -888668266: goto L_0x01c4;
                case -888668265: goto L_0x01b8;
                case -888668264: goto L_0x01ac;
                case -845289556: goto L_0x01a0;
                case -845289555: goto L_0x0194;
                case -845289553: goto L_0x0188;
                case -845289551: goto L_0x017c;
                case -845289508: goto L_0x0170;
                case -458141175: goto L_0x0164;
                case -458141174: goto L_0x0158;
                case -458141173: goto L_0x014c;
                case -458141172: goto L_0x0140;
                case -449944730: goto L_0x0134;
                case -449944729: goto L_0x0128;
                case -449944728: goto L_0x011c;
                case -449944727: goto L_0x0110;
                case -449944724: goto L_0x0104;
                case -449944723: goto L_0x00f8;
                case -449944722: goto L_0x00ec;
                case -448603205: goto L_0x00e0;
                case -448603202: goto L_0x00d4;
                case -448603201: goto L_0x00c8;
                case -448603157: goto L_0x00bc;
                case -448603156: goto L_0x00b0;
                case 922669543: goto L_0x00a4;
                case 922669544: goto L_0x0098;
                case 922669545: goto L_0x008c;
                case 922669546: goto L_0x0080;
                case 922669547: goto L_0x0074;
                case 922669548: goto L_0x0068;
                case 922669549: goto L_0x005c;
                case 922669550: goto L_0x0050;
                case 1201756974: goto L_0x0044;
                case 1201757021: goto L_0x0038;
                case 1623724661: goto L_0x002c;
                case 1623724662: goto L_0x0020;
                case 1623724663: goto L_0x0014;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x03c3
        L_0x0014:
            java.lang.String r2 = "yeelink.light.bslamp3"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 72
            goto L_0x03c4
        L_0x0020:
            java.lang.String r2 = "yeelink.light.bslamp2"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 71
            goto L_0x03c4
        L_0x002c:
            java.lang.String r2 = "yeelink.light.bslamp1"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 10
            goto L_0x03c4
        L_0x0038:
            java.lang.String r2 = "yeelink.light.cta"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 25
            goto L_0x03c4
        L_0x0044:
            java.lang.String r2 = "yeelink.light.ct2"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 24
            goto L_0x03c4
        L_0x0050:
            java.lang.String r2 = "yeelink.light.ceiling8"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 40
            goto L_0x03c4
        L_0x005c:
            java.lang.String r2 = "yeelink.light.ceiling7"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 39
            goto L_0x03c4
        L_0x0068:
            java.lang.String r2 = "yeelink.light.ceiling6"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 38
            goto L_0x03c4
        L_0x0074:
            java.lang.String r2 = "yeelink.light.ceiling5"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 37
            goto L_0x03c4
        L_0x0080:
            java.lang.String r2 = "yeelink.light.ceiling4"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 36
            goto L_0x03c4
        L_0x008c:
            java.lang.String r2 = "yeelink.light.ceiling3"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 35
            goto L_0x03c4
        L_0x0098:
            java.lang.String r2 = "yeelink.light.ceiling2"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 23
            goto L_0x03c4
        L_0x00a4:
            java.lang.String r2 = "yeelink.light.ceiling1"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 34
            goto L_0x03c4
        L_0x00b0:
            java.lang.String r2 = "yeelink.light.monob"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 20
            goto L_0x03c4
        L_0x00bc:
            java.lang.String r2 = "yeelink.light.monoa"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 19
            goto L_0x03c4
        L_0x00c8:
            java.lang.String r2 = "yeelink.light.mono5"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 18
            goto L_0x03c4
        L_0x00d4:
            java.lang.String r2 = "yeelink.light.mono4"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 17
            goto L_0x03c4
        L_0x00e0:
            java.lang.String r2 = "yeelink.light.mono1"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 16
            goto L_0x03c4
        L_0x00ec:
            java.lang.String r2 = "yeelink.light.lamp9"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 32
            goto L_0x03c4
        L_0x00f8:
            java.lang.String r2 = "yeelink.light.lamp8"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 31
            goto L_0x03c4
        L_0x0104:
            java.lang.String r2 = "yeelink.light.lamp7"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 30
            goto L_0x03c4
        L_0x0110:
            java.lang.String r2 = "yeelink.light.lamp4"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 29
            goto L_0x03c4
        L_0x011c:
            java.lang.String r2 = "yeelink.light.lamp3"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 74
            goto L_0x03c4
        L_0x0128:
            java.lang.String r2 = "yeelink.light.lamp2"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 70
            goto L_0x03c4
        L_0x0134:
            java.lang.String r2 = "yeelink.light.lamp1"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 28
            goto L_0x03c4
        L_0x0140:
            java.lang.String r2 = "yeelink.light.ceild"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 66
            goto L_0x03c4
        L_0x014c:
            java.lang.String r2 = "yeelink.light.ceilc"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 65
            goto L_0x03c4
        L_0x0158:
            java.lang.String r2 = "yeelink.light.ceilb"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 64
            goto L_0x03c4
        L_0x0164:
            java.lang.String r2 = "yeelink.light.ceila"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 63
            goto L_0x03c4
        L_0x0170:
            java.lang.String r2 = "yeelink.light.stripa"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 14
            goto L_0x03c4
        L_0x017c:
            java.lang.String r2 = "yeelink.light.strip6"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 13
            goto L_0x03c4
        L_0x0188:
            java.lang.String r2 = "yeelink.light.strip4"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 26
            goto L_0x03c4
        L_0x0194:
            java.lang.String r2 = "yeelink.light.strip2"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 12
            goto L_0x03c4
        L_0x01a0:
            java.lang.String r2 = "yeelink.light.strip1"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 11
            goto L_0x03c4
        L_0x01ac:
            java.lang.String r2 = "yilai.light.ceiling3"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 69
            goto L_0x03c4
        L_0x01b8:
            java.lang.String r2 = "yilai.light.ceiling2"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 68
            goto L_0x03c4
        L_0x01c4:
            java.lang.String r2 = "yilai.light.ceiling1"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 67
            goto L_0x03c4
        L_0x01d0:
            java.lang.String r2 = "yeelink.light.panel3"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 27
            goto L_0x03c4
        L_0x01dc:
            java.lang.String r2 = "yeelink.light.panel1"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 21
            goto L_0x03c4
        L_0x01e8:
            java.lang.String r2 = "yeelink.light.lamp19"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 73
            goto L_0x03c4
        L_0x01f4:
            java.lang.String r2 = "yeelink.light.lamp17"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 22
            goto L_0x03c4
        L_0x0200:
            java.lang.String r2 = "yeelink.light.lamp15"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 33
            goto L_0x03c4
        L_0x020c:
            java.lang.String r2 = "yeelink.light.lamp10"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 15
            goto L_0x03c4
        L_0x0218:
            java.lang.String r2 = "yeelink.light.fancl6"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 79
            goto L_0x03c4
        L_0x0224:
            java.lang.String r2 = "yeelink.light.fancl5"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 78
            goto L_0x03c4
        L_0x0230:
            java.lang.String r2 = "yeelink.light.fancl2"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 77
            goto L_0x03c4
        L_0x023c:
            java.lang.String r2 = "yeelink.light.fancl1"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 76
            goto L_0x03c4
        L_0x0248:
            java.lang.String r2 = "yeelink.light.colorc"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 9
            goto L_0x03c4
        L_0x0254:
            java.lang.String r2 = "yeelink.light.colorb"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 8
            goto L_0x03c4
        L_0x0260:
            java.lang.String r2 = "yeelink.light.colora"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 7
            goto L_0x03c4
        L_0x026b:
            java.lang.String r2 = "yeelink.light.color8"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 6
            goto L_0x03c4
        L_0x0276:
            java.lang.String r2 = "yeelink.light.color6"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 5
            goto L_0x03c4
        L_0x0281:
            java.lang.String r2 = "yeelink.light.color5"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 4
            goto L_0x03c4
        L_0x028c:
            java.lang.String r2 = "yeelink.light.color4"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 3
            goto L_0x03c4
        L_0x0297:
            java.lang.String r2 = "yeelink.light.color3"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 2
            goto L_0x03c4
        L_0x02a2:
            java.lang.String r2 = "yeelink.light.color2"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 1
            goto L_0x03c4
        L_0x02ad:
            java.lang.String r2 = "yeelink.light.color1"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 0
            goto L_0x03c4
        L_0x02b8:
            java.lang.String r2 = "yeelink.light.ceil33"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 62
            goto L_0x03c4
        L_0x02c4:
            java.lang.String r2 = "yeelink.light.ceil32"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 61
            goto L_0x03c4
        L_0x02d0:
            java.lang.String r2 = "yeelink.light.ceil31"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 60
            goto L_0x03c4
        L_0x02dc:
            java.lang.String r2 = "yeelink.light.ceil30"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 59
            goto L_0x03c4
        L_0x02e8:
            java.lang.String r2 = "yeelink.light.ceil29"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 58
            goto L_0x03c4
        L_0x02f4:
            java.lang.String r2 = "yeelink.light.ceil27"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 57
            goto L_0x03c4
        L_0x0300:
            java.lang.String r2 = "yeelink.light.ceil26"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 56
            goto L_0x03c4
        L_0x030c:
            java.lang.String r2 = "yeelink.light.ceiling24"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 55
            goto L_0x03c4
        L_0x0318:
            java.lang.String r2 = "yeelink.light.ceiling23"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 54
            goto L_0x03c4
        L_0x0324:
            java.lang.String r2 = "yeelink.light.ceiling22"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 53
            goto L_0x03c4
        L_0x0330:
            java.lang.String r2 = "yeelink.light.ceiling21"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 52
            goto L_0x03c4
        L_0x033c:
            java.lang.String r2 = "yeelink.light.ceiling20"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 51
            goto L_0x03c4
        L_0x0348:
            java.lang.String r2 = "yeelink.light.ceiling19"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 50
            goto L_0x03c4
        L_0x0354:
            java.lang.String r2 = "yeelink.light.ceiling18"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 49
            goto L_0x03c4
        L_0x0360:
            java.lang.String r2 = "yeelink.light.ceiling17"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 48
            goto L_0x03c4
        L_0x036b:
            java.lang.String r2 = "yeelink.light.ceiling16"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 47
            goto L_0x03c4
        L_0x0376:
            java.lang.String r2 = "yeelink.light.ceiling15"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 46
            goto L_0x03c4
        L_0x0381:
            java.lang.String r2 = "yeelink.light.ceiling14"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 45
            goto L_0x03c4
        L_0x038c:
            java.lang.String r2 = "yeelink.light.ceiling13"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 44
            goto L_0x03c4
        L_0x0397:
            java.lang.String r2 = "yeelink.light.ceiling12"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 43
            goto L_0x03c4
        L_0x03a2:
            java.lang.String r2 = "yeelink.light.ceiling11"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 42
            goto L_0x03c4
        L_0x03ad:
            java.lang.String r2 = "yeelink.light.ceiling10"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 41
            goto L_0x03c4
        L_0x03b8:
            java.lang.String r2 = "yeelink.bhf_light.v1"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x03c3
            r5 = 75
            goto L_0x03c4
        L_0x03c3:
            r5 = -1
        L_0x03c4:
            switch(r5) {
                case 0: goto L_0x046b;
                case 1: goto L_0x046b;
                case 2: goto L_0x046b;
                case 3: goto L_0x046b;
                case 4: goto L_0x046b;
                case 5: goto L_0x046b;
                case 6: goto L_0x046b;
                case 7: goto L_0x046b;
                case 8: goto L_0x046b;
                case 9: goto L_0x046b;
                case 10: goto L_0x046b;
                case 11: goto L_0x046b;
                case 12: goto L_0x046b;
                case 13: goto L_0x046b;
                case 14: goto L_0x046b;
                case 15: goto L_0x046b;
                case 16: goto L_0x0424;
                case 17: goto L_0x0424;
                case 18: goto L_0x0424;
                case 19: goto L_0x0424;
                case 20: goto L_0x0424;
                case 21: goto L_0x0424;
                case 22: goto L_0x0424;
                case 23: goto L_0x0424;
                case 24: goto L_0x03c9;
                case 25: goto L_0x03c9;
                case 26: goto L_0x03c9;
                case 27: goto L_0x03c9;
                case 28: goto L_0x03c9;
                case 29: goto L_0x03c9;
                case 30: goto L_0x03c9;
                case 31: goto L_0x03c9;
                case 32: goto L_0x03c9;
                case 33: goto L_0x03c9;
                case 34: goto L_0x03c9;
                case 35: goto L_0x03c9;
                case 36: goto L_0x03c9;
                case 37: goto L_0x03c9;
                case 38: goto L_0x03c9;
                case 39: goto L_0x03c9;
                case 40: goto L_0x03c9;
                case 41: goto L_0x03c9;
                case 42: goto L_0x03c9;
                case 43: goto L_0x03c9;
                case 44: goto L_0x03c9;
                case 45: goto L_0x03c9;
                case 46: goto L_0x03c9;
                case 47: goto L_0x03c9;
                case 48: goto L_0x03c9;
                case 49: goto L_0x03c9;
                case 50: goto L_0x03c9;
                case 51: goto L_0x03c9;
                case 52: goto L_0x03c9;
                case 53: goto L_0x03c9;
                case 54: goto L_0x03c9;
                case 55: goto L_0x03c9;
                case 56: goto L_0x03c9;
                case 57: goto L_0x03c9;
                case 58: goto L_0x03c9;
                case 59: goto L_0x03c9;
                case 60: goto L_0x03c9;
                case 61: goto L_0x03c9;
                case 62: goto L_0x03c9;
                case 63: goto L_0x03c9;
                case 64: goto L_0x03c9;
                case 65: goto L_0x03c9;
                case 66: goto L_0x03c9;
                case 67: goto L_0x03c9;
                case 68: goto L_0x03c9;
                case 69: goto L_0x03c9;
                case 70: goto L_0x03c9;
                case 71: goto L_0x03c9;
                case 72: goto L_0x03c9;
                case 73: goto L_0x03c9;
                case 74: goto L_0x03c9;
                case 75: goto L_0x03c9;
                case 76: goto L_0x03c9;
                case 77: goto L_0x03c9;
                case 78: goto L_0x03c9;
                case 79: goto L_0x03c9;
                default: goto L_0x03c7;
            }
        L_0x03c7:
            goto L_0x0470
        L_0x03c9:
            java.util.List<com.yeelight.yeelib.g.i> r5 = r4.f7466c
            int r5 = r5.size()
            if (r3 >= r5) goto L_0x0470
            java.util.List<com.yeelight.yeelib.g.i> r5 = r4.f7466c
            java.lang.Object r5 = r5.get(r3)
            com.yeelight.yeelib.g.i r5 = (com.yeelight.yeelib.p153g.C9838i) r5
            com.yeelight.yeelib.g.i$a r5 = r5.mo31760c0()
            com.yeelight.yeelib.g.i$a r2 = com.yeelight.yeelib.p153g.C9838i.C9839a.MODE_BRIGHT_ONLY
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L_0x0418
            java.util.List<com.yeelight.yeelib.g.i> r5 = r4.f7466c
            java.lang.Object r5 = r5.get(r3)
            com.yeelight.yeelib.g.i r5 = (com.yeelight.yeelib.p153g.C9838i) r5
            com.yeelight.yeelib.g.i$a r5 = r5.mo31760c0()
            com.yeelight.yeelib.g.i$a r2 = com.yeelight.yeelib.p153g.C9838i.C9839a.MODE_SUSPEND
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L_0x0418
            java.util.List<com.yeelight.yeelib.g.i> r5 = r4.f7466c
            java.lang.Object r5 = r5.get(r3)
            com.yeelight.yeelib.g.i r5 = (com.yeelight.yeelib.p153g.C9838i) r5
            com.yeelight.yeelib.g.i$a r5 = r5.mo31760c0()
            com.yeelight.yeelib.g.i$a r2 = com.yeelight.yeelib.p153g.C9838i.C9839a.MODE_CT
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x040e
            goto L_0x0418
        L_0x040e:
            java.util.List<com.yeelight.yeelib.g.i> r5 = r4.f7466c
            java.lang.Object r5 = r5.get(r3)
            r1.add(r5)
            goto L_0x0421
        L_0x0418:
            java.util.List<com.yeelight.yeelib.g.i> r5 = r4.f7466c
            java.lang.Object r5 = r5.get(r3)
            r0.add(r5)
        L_0x0421:
            int r3 = r3 + 1
            goto L_0x03c9
        L_0x0424:
            java.util.List<com.yeelight.yeelib.g.i> r5 = r4.f7466c
            int r5 = r5.size()
            if (r3 >= r5) goto L_0x0470
            java.util.List<com.yeelight.yeelib.g.i> r5 = r4.f7466c
            java.lang.Object r5 = r5.get(r3)
            com.yeelight.yeelib.g.i r5 = (com.yeelight.yeelib.p153g.C9838i) r5
            com.yeelight.yeelib.g.i$a r5 = r5.mo31760c0()
            com.yeelight.yeelib.g.i$a r2 = com.yeelight.yeelib.p153g.C9838i.C9839a.MODE_BRIGHT_ONLY
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L_0x045f
            java.util.List<com.yeelight.yeelib.g.i> r5 = r4.f7466c
            java.lang.Object r5 = r5.get(r3)
            com.yeelight.yeelib.g.i r5 = (com.yeelight.yeelib.p153g.C9838i) r5
            com.yeelight.yeelib.g.i$a r5 = r5.mo31760c0()
            com.yeelight.yeelib.g.i$a r2 = com.yeelight.yeelib.p153g.C9838i.C9839a.MODE_SUSPEND
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x0455
            goto L_0x045f
        L_0x0455:
            java.util.List<com.yeelight.yeelib.g.i> r5 = r4.f7466c
            java.lang.Object r5 = r5.get(r3)
            r1.add(r5)
            goto L_0x0468
        L_0x045f:
            java.util.List<com.yeelight.yeelib.g.i> r5 = r4.f7466c
            java.lang.Object r5 = r5.get(r3)
            r0.add(r5)
        L_0x0468:
            int r3 = r3 + 1
            goto L_0x0424
        L_0x046b:
            java.util.List<com.yeelight.yeelib.g.i> r5 = r4.f7466c
            r0.addAll(r5)
        L_0x0470:
            r0.addAll(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p153g.C4300b0.mo23746j(java.lang.String):java.util.List");
    }

    /* renamed from: k */
    public List<C9849r> mo23747k(String str) {
        return this.f7464a.get(str);
    }

    /* renamed from: l */
    public void mo23748l(String str, C4307g gVar) {
        mo23749m(str, gVar, true);
    }

    /* renamed from: m */
    public void mo23749m(String str, C4307g gVar, boolean z) {
        if (!this.f7464a.containsKey(str) || gVar == null) {
            mo23757x(str, gVar, z);
        } else {
            gVar.mo23768n(false, this.f7464a.get(str));
        }
    }

    /* renamed from: n */
    public C9856y mo23750n(int i, String str) {
        "getRecommmendSceneById: scene id : " + i + ", model : " + str;
        List list = this.f7464a.get(str);
        if (list == null) {
            mo23748l(str, (C4307g) null);
            return null;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            "recommendSceneList Id : " + ((C9849r) list.get(i2)).mo31886r() + " scene mode = " + ((C9849r) list.get(i2)).mo31884p();
            if (((C9849r) list.get(i2)).mo31886r() == i) {
                return (C9856y) list.get(i2);
            }
        }
        return null;
    }

    /* renamed from: p */
    public List<C9849r> mo23751p(String str) {
        return this.f7465b.get(str);
    }

    /* renamed from: q */
    public List<C9849r> mo23752q(String str, C4307g gVar) {
        if (str == null) {
            return null;
        }
        String o = m12081o("hw/v2/scene/user/" + C4201a.m11607r().mo23452v() + MiotCloudImpl.COOKIE_PATH + str, (JSONObject) null);
        StringBuilder sb = new StringBuilder();
        sb.append("get scene url: ");
        sb.append(o);
        sb.toString();
        C9862d.m24133c(o, String.class, new C4301a(str, gVar));
        return mo23751p(str);
    }

    /* renamed from: r */
    public C9838i mo23753r() {
        return this.f7467d;
    }

    /* renamed from: s */
    public C9856y mo23754s(int i, String str) {
        "getUserSceneById: scene id : " + i + ", model : " + str;
        List list = this.f7465b.get(str);
        if (list == null) {
            mo23752q(str, (C4307g) null);
            mo23748l(str, (C4307g) null);
            return null;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            "SceneList id : " + ((C9849r) list.get(i2)).mo31886r() + ", scene mode : " + ((C9849r) list.get(i2)).mo31884p();
            if (((C9849r) list.get(i2)).mo31886r() == i) {
                return (C9856y) list.get(i2);
            }
        }
        return null;
    }

    /* renamed from: v */
    public void mo23755v(C4307g gVar) {
        mo23756w(gVar, true);
    }

    /* renamed from: w */
    public void mo23756w(C4307g gVar, boolean z) {
        this.f7466c.clear();
        String o = m12081o("hw/v2/diyscene/user/" + C4201a.m11607r().mo23452v(), (JSONObject) null);
        "get scene url: " + o;
        boolean z2 = false;
        if (z) {
            try {
                String g = mo23743g(o);
                if (g != null) {
                    "queryCustomSceneFromCloud cacheData : " + g;
                    JSONArray jSONArray = new JSONObject(g).getJSONArray("scenes");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        C9838i a0 = C9838i.m23956a0(jSONArray.getJSONObject(i));
                        if (a0 != null) {
                            this.f7466c.add(a0);
                        }
                    }
                    if (gVar != null) {
                        gVar.onRefresh();
                    }
                    z2 = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        C9862d.m24133c(o, String.class, new C4302b(o, z2, gVar));
    }

    /* renamed from: x */
    public synchronized void mo23757x(String str, C4307g gVar, boolean z) {
        "queryRecommendScene , model = " + str;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                jSONObject.put("version", 2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        jSONObject.put("start", TimerCodec.DISENABLE);
        jSONObject.put("end", "32");
        jSONObject.put("product_model", str);
        jSONObject.put("lang", C4230l.m11766b().mo23553c());
        String o = m12081o("hw/v2/recommend_scene", jSONObject);
        String str2 = o + MiotCloudImpl.COOKIE_PATH + str;
        try {
            String g = mo23743g(str2);
            if (g != null) {
                "get recommend scene from cache: " + g;
                ArrayList arrayList = new ArrayList();
                try {
                    JSONObject jSONObject2 = new JSONObject(g);
                    if (jSONObject2.getInt("count") > 0) {
                        JSONArray jSONArray = jSONObject2.getJSONArray("scenes");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            arrayList.add(C9849r.m24017U(jSONArray.getJSONObject(i)));
                        }
                    }
                    if (gVar != null) {
                        gVar.mo23768n(false, arrayList);
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    if (gVar != null) {
                        gVar.mo23766a("queryRecommendScene onFailure !");
                    }
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        if (C4308b.f7482a) {
            o = o + "&debug=1";
        }
        "get recommend scene url: " + o;
        C9862d.m24133c(o, String.class, new C4306f(str, gVar, str2));
    }

    /* renamed from: y */
    public void mo23758y() {
        this.f7464a.clear();
    }

    /* renamed from: z */
    public void mo23759z() {
        this.f7467d = new C9838i();
    }
}

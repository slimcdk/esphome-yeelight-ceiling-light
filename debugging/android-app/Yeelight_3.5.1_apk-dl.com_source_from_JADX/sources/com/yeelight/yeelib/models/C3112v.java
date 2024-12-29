package com.yeelight.yeelib.models;

import android.content.Context;
import com.miot.service.common.crypto.rc4coder.Coder;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.miot.service.manager.timer.TimerCodec;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.C8281l;
import com.yeelight.yeelib.utils.AppUtils;
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
import p051j4.C3283v;
import p116x2.C3903a;
import p129b4.C3988b;
import p134c4.C4007b;

/* renamed from: com.yeelight.yeelib.models.v */
public class C3112v {

    /* renamed from: e */
    private static C3112v f4958e;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Map<String, List<C8321m>> f4959a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Map<String, List<C8321m>> f4960b = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<CustomAdvancedFlowScene> f4961c = new ArrayList();

    /* renamed from: d */
    private CustomAdvancedFlowScene f4962d = new CustomAdvancedFlowScene();

    /* renamed from: com.yeelight.yeelib.models.v$a */
    class C3113a implements C4007b<String> {

        /* renamed from: a */
        final /* synthetic */ String f4963a;

        /* renamed from: b */
        final /* synthetic */ C3119g f4964b;

        C3113a(String str, C3119g gVar) {
            this.f4963a = str;
            this.f4964b = gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x004d A[Catch:{ JSONException -> 0x006e }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x006a  */
        /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo23338a(java.lang.String r4) {
            /*
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "get scene onSuccess, return result: "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r0 = r3.f4963a
                int r1 = r0.hashCode()
                switch(r1) {
                    case -1400275319: goto L_0x0033;
                    case -1308146495: goto L_0x0030;
                    case -1063384694: goto L_0x002d;
                    case -948847040: goto L_0x002a;
                    case -448603205: goto L_0x0027;
                    case -448603202: goto L_0x0024;
                    case -448603201: goto L_0x0021;
                    case -448603157: goto L_0x001e;
                    case -448603156: goto L_0x0017;
                    default: goto L_0x0016;
                }
            L_0x0016:
                goto L_0x0036
            L_0x0017:
                java.lang.String r1 = "yeelink.light.monob"
            L_0x0019:
                boolean r0 = r0.equals(r1)
                goto L_0x0036
            L_0x001e:
                java.lang.String r1 = "yeelink.light.monoa"
                goto L_0x0019
            L_0x0021:
                java.lang.String r1 = "yeelink.light.mono5"
                goto L_0x0019
            L_0x0024:
                java.lang.String r1 = "yeelink.light.mono4"
                goto L_0x0019
            L_0x0027:
                java.lang.String r1 = "yeelink.light.mono1"
                goto L_0x0019
            L_0x002a:
                java.lang.String r1 = "yeelink.light.panel1"
                goto L_0x0019
            L_0x002d:
                java.lang.String r1 = "yeelink.light.lamp10"
                goto L_0x0019
            L_0x0030:
                java.lang.String r1 = "yeelink.light.color1"
                goto L_0x0019
            L_0x0033:
                java.lang.String r1 = "yeelink.light.ble1"
                goto L_0x0019
            L_0x0036:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x006e }
                r1.<init>(r4)     // Catch:{ JSONException -> 0x006e }
                java.lang.String r4 = "scenes"
                org.json.JSONArray r4 = r1.getJSONArray(r4)     // Catch:{ JSONException -> 0x006e }
                r1 = 0
            L_0x0047:
                int r2 = r4.length()     // Catch:{ JSONException -> 0x006e }
                if (r1 >= r2) goto L_0x005b
                org.json.JSONObject r2 = r4.getJSONObject(r1)     // Catch:{ JSONException -> 0x006e }
                com.yeelight.yeelib.models.m r2 = com.yeelight.yeelib.models.C8321m.m19779V(r2)     // Catch:{ JSONException -> 0x006e }
                r0.add(r2)     // Catch:{ JSONException -> 0x006e }
                int r1 = r1 + 1
                goto L_0x0047
            L_0x005b:
                com.yeelight.yeelib.models.v r4 = com.yeelight.yeelib.models.C3112v.this
                java.util.Map r4 = r4.f4960b
                java.lang.String r1 = r3.f4963a
                r4.put(r1, r0)
                com.yeelight.yeelib.models.v$g r4 = r3.f4964b
                if (r4 == 0) goto L_0x006d
                r4.onRefresh()
            L_0x006d:
                return
            L_0x006e:
                r4 = move-exception
                r4.printStackTrace()
                com.yeelight.yeelib.models.v$g r4 = r3.f4964b
                if (r4 == 0) goto L_0x007b
                java.lang.String r0 = "Parse error !"
                r4.mo23579a(r0)
            L_0x007b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.models.C3112v.C3113a.mo23338a(java.lang.String):void");
        }

        public void onFailure(int i, String str) {
            C3119g gVar = this.f4964b;
            if (gVar != null) {
                Context context = C3108x.f4951e;
                int i2 = R$string.scene_cache_get_list_fail;
                gVar.mo23583s(context.getString(i2));
                this.f4964b.mo23579a(C3108x.f4951e.getString(i2));
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.models.v$b */
    class C3114b implements C4007b<String> {

        /* renamed from: a */
        final /* synthetic */ String f4966a;

        /* renamed from: b */
        final /* synthetic */ boolean f4967b;

        /* renamed from: c */
        final /* synthetic */ C3119g f4968c;

        C3114b(String str, boolean z, C3119g gVar) {
            this.f4966a = str;
            this.f4967b = z;
            this.f4968c = gVar;
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            C3119g gVar;
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("get scene onSuccess, return result: ");
                sb.append(str);
                JSONArray jSONArray = new JSONObject(str).getJSONArray("scenes");
                C3112v.this.f4961c.clear();
                for (int i = 0; i < jSONArray.length(); i++) {
                    CustomAdvancedFlowScene b0 = CustomAdvancedFlowScene.m19683b0(jSONArray.getJSONObject(i));
                    if (b0 != null) {
                        C3112v.this.f4961c.add(b0);
                    }
                }
                C3112v.this.mo23554e(this.f4966a, str);
            } catch (JSONException e) {
                e.printStackTrace();
                if (!this.f4967b && (gVar = this.f4968c) != null) {
                    gVar.mo23579a("Parse error !");
                    return;
                }
                return;
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            C3119g gVar2 = this.f4968c;
            if (gVar2 != null) {
                gVar2.onRefresh();
            }
        }

        public void onFailure(int i, String str) {
            C3119g gVar = this.f4968c;
            if (gVar != null && !this.f4967b) {
                Context context = C3108x.f4951e;
                int i2 = R$string.scene_cache_get_list_fail;
                gVar.mo23583s(context.getString(i2));
                this.f4968c.mo23579a(C3108x.f4951e.getString(i2));
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.models.v$c */
    class C3115c implements C4007b<String> {

        /* renamed from: a */
        final /* synthetic */ C3119g f4970a;

        C3115c(C3112v vVar, C3119g gVar) {
            this.f4970a = gVar;
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            C3119g gVar;
            String string;
            try {
                int i = new JSONObject(str).getInt("code");
                StringBuilder sb = new StringBuilder();
                sb.append("save scene onSuccess, return code: ");
                sb.append(i);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("save scene onSuccess, return result: ");
                sb2.append(str);
                if (i > 0) {
                    C3119g gVar2 = this.f4970a;
                    if (gVar2 != null) {
                        gVar2.onRefresh();
                        this.f4970a.mo23583s(C3108x.f4951e.getString(R$string.scene_save_succeed));
                        return;
                    }
                    return;
                }
                if (i == -2) {
                    C3119g gVar3 = this.f4970a;
                    if (gVar3 != null) {
                        Context context = C3108x.f4951e;
                        int i2 = R$string.scene_cache_save_limitation;
                        gVar3.mo23583s(context.getString(i2));
                        gVar = this.f4970a;
                        string = C3108x.f4951e.getString(i2);
                    } else {
                        return;
                    }
                } else if (i == -3) {
                    C3119g gVar4 = this.f4970a;
                    if (gVar4 != null) {
                        Context context2 = C3108x.f4951e;
                        int i3 = R$string.scene_bundle_name_save_repeat;
                        gVar4.mo23583s(context2.getString(i3));
                        gVar = this.f4970a;
                        string = C3108x.f4951e.getString(i3);
                    } else {
                        return;
                    }
                } else {
                    C3119g gVar5 = this.f4970a;
                    if (gVar5 != null) {
                        Context context3 = C3108x.f4951e;
                        int i4 = R$string.scene_cache_save_fail;
                        gVar5.mo23583s(context3.getString(i4));
                        gVar = this.f4970a;
                        string = C3108x.f4951e.getString(i4);
                    } else {
                        return;
                    }
                }
                gVar.mo23579a(string);
            } catch (JSONException e) {
                e.printStackTrace();
                C3119g gVar6 = this.f4970a;
                if (gVar6 != null) {
                    gVar6.mo23583s(C3108x.f4951e.getString(R$string.scene_cache_save_fail));
                    this.f4970a.mo23579a(e.getMessage());
                }
            }
        }

        public void onFailure(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("save scene onFailure message = ");
            sb.append(str);
            C3119g gVar = this.f4970a;
            if (gVar != null) {
                gVar.mo23583s(C3108x.f4951e.getString(R$string.scene_cache_save_fail));
                this.f4970a.mo23579a(str);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.models.v$d */
    class C3116d implements C4007b<String> {

        /* renamed from: a */
        final /* synthetic */ C3119g f4971a;

        C3116d(C3112v vVar, C3119g gVar) {
            this.f4971a = gVar;
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("delScene msg : ");
                sb.append(str);
                sb.append(", size = ");
                sb.append(str.length());
                if (new JSONObject(str).getInt("code") == 1) {
                    C3119g gVar = this.f4971a;
                    if (gVar != null) {
                        gVar.mo23583s(C3108x.f4951e.getString(R$string.scene_cache_del_success));
                        this.f4971a.mo23580g();
                    } else if (gVar != null) {
                        Context context = C3108x.f4951e;
                        int i = R$string.scene_cache_del_fail;
                        gVar.mo23583s(context.getString(i));
                        this.f4971a.mo23579a(C3108x.f4951e.getString(i));
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            C3119g gVar = this.f4971a;
            if (gVar != null) {
                Context context = C3108x.f4951e;
                int i2 = R$string.scene_cache_del_fail;
                gVar.mo23583s(context.getString(i2));
                this.f4971a.mo23579a(C3108x.f4951e.getString(i2));
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.models.v$e */
    class C3117e implements C4007b<String> {

        /* renamed from: a */
        final /* synthetic */ C3119g f4972a;

        C3117e(C3112v vVar, C3119g gVar) {
            this.f4972a = gVar;
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            C3119g gVar;
            String string;
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("pdateCustomScene onResponse msg : ");
                sb.append(str);
                sb.append(", size = ");
                sb.append(str.length());
                int i = new JSONObject(str).getInt("code");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("updateCustomScene onSuccess, return code: ");
                sb2.append(i);
                if (i > 0) {
                    C3119g gVar2 = this.f4972a;
                    if (gVar2 != null) {
                        gVar2.onRefresh();
                        this.f4972a.mo23583s(C3108x.f4951e.getString(R$string.common_text_save_succeed));
                        return;
                    }
                    return;
                }
                if (i == -2) {
                    C3119g gVar3 = this.f4972a;
                    if (gVar3 != null) {
                        Context context = C3108x.f4951e;
                        int i2 = R$string.scene_cache_save_limitation;
                        gVar3.mo23583s(context.getString(i2));
                        gVar = this.f4972a;
                        string = C3108x.f4951e.getString(i2);
                    } else {
                        return;
                    }
                } else if (i == -3) {
                    C3119g gVar4 = this.f4972a;
                    if (gVar4 != null) {
                        Context context2 = C3108x.f4951e;
                        int i3 = R$string.scene_bundle_name_save_repeat;
                        gVar4.mo23583s(context2.getString(i3));
                        gVar = this.f4972a;
                        string = C3108x.f4951e.getString(i3);
                    } else {
                        return;
                    }
                } else {
                    C3119g gVar5 = this.f4972a;
                    if (gVar5 != null) {
                        Context context3 = C3108x.f4951e;
                        int i4 = R$string.scene_cache_save_fail;
                        gVar5.mo23583s(context3.getString(i4));
                        gVar = this.f4972a;
                        string = C3108x.f4951e.getString(i4);
                    } else {
                        return;
                    }
                }
                gVar.mo23579a(string);
            } catch (JSONException e) {
                e.printStackTrace();
                C3119g gVar6 = this.f4972a;
                if (gVar6 != null) {
                    gVar6.mo23583s(C3108x.f4951e.getString(R$string.scene_cache_save_fail));
                    this.f4972a.mo23579a(e.getMessage());
                }
            }
        }

        public void onFailure(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("updateCustomScene scene onFailure, errot msg: ");
            sb.append(str);
            C3119g gVar = this.f4972a;
            if (gVar != null) {
                Context context = C3108x.f4951e;
                int i2 = R$string.scene_cache_save_fail;
                gVar.mo23583s(context.getString(i2));
                this.f4972a.mo23579a(C3108x.f4951e.getString(i2));
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.models.v$f */
    class C3118f implements C4007b<String> {

        /* renamed from: a */
        final /* synthetic */ String f4973a;

        /* renamed from: b */
        final /* synthetic */ C3119g f4974b;

        /* renamed from: c */
        final /* synthetic */ String f4975c;

        C3118f(String str, C3119g gVar, String str2) {
            this.f4973a = str;
            this.f4974b = gVar;
            this.f4975c = str2;
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("get recommend scene onSuccess, return result: ");
            sb.append(str);
            ArrayList arrayList = new ArrayList();
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getInt("count") > 0) {
                    JSONArray jSONArray = jSONObject.getJSONArray("scenes");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(C8321m.m19779V(jSONArray.getJSONObject(i)));
                    }
                }
                C3112v.this.f4959a.put(this.f4973a, arrayList);
                C3119g gVar = this.f4974b;
                if (gVar != null) {
                    gVar.mo23582r(false, arrayList);
                }
                C3112v.this.mo23554e(this.f4975c, str);
            } catch (JSONException e) {
                e.printStackTrace();
                C3119g gVar2 = this.f4974b;
                if (gVar2 != null) {
                    gVar2.mo23579a("queryRecommendScene onFailure !");
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("queryRecommendScene onFailure, message = ");
            sb.append(str);
            C3119g gVar = this.f4974b;
            if (gVar != null) {
                gVar.mo23579a("queryRecommendScene onFailure !");
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.models.v$g */
    public interface C3119g {
        /* renamed from: a */
        void mo23579a(String str);

        /* renamed from: g */
        void mo23580g();

        void onRefresh();

        /* renamed from: r */
        void mo23582r(boolean z, List<C8321m> list);

        /* renamed from: s */
        void mo23583s(String str);
    }

    private C3112v() {
    }

    /* renamed from: d */
    private String m8239d(byte[] bArr) {
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
    public static String m8240o(String str, JSONObject jSONObject) {
        String str2 = AppUtils.f4987k + str;
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
    private String m8241t(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(Coder.KEY_MD5);
            instance.update(str.getBytes());
            return m8239d(instance.digest());
        } catch (NoSuchAlgorithmException unused) {
            return String.valueOf(str.hashCode());
        }
    }

    /* renamed from: u */
    public static C3112v m8242u() {
        if (f4958e == null) {
            f4958e = new C3112v();
        }
        return f4958e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0097 A[Catch:{ JSONException -> 0x00ce }] */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23552A(com.yeelight.yeelib.models.C8321m r7, com.yeelight.yeelib.models.C3112v.C3119g r8) {
        /*
            r6 = this;
            java.lang.String r0 = "type"
            java.lang.String r1 = "hw/v2/scene/create"
            r2 = 0
            java.lang.String r1 = m8240o(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "save scene url: "
            r2.append(r3)
            r2.append(r1)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "uid"
            com.yeelight.yeelib.managers.a r4 = com.yeelight.yeelib.managers.C3051a.m7925r()     // Catch:{ JSONException -> 0x00ce }
            java.lang.String r4 = r4.mo23366v()     // Catch:{ JSONException -> 0x00ce }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x00ce }
            java.lang.String r3 = "title"
            java.lang.String r4 = r7.mo35453t()     // Catch:{ JSONException -> 0x00ce }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x00ce }
            java.lang.String r3 = "mode"
            int r4 = r7.mo35449p()     // Catch:{ JSONException -> 0x00ce }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x00ce }
            java.lang.String r3 = "bright"
            int r4 = r7.mo35439f()     // Catch:{ JSONException -> 0x00ce }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ JSONException -> 0x00ce }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x00ce }
            java.lang.String r3 = "color_temperature"
            int r4 = r7.mo35441h()     // Catch:{ JSONException -> 0x00ce }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ JSONException -> 0x00ce }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x00ce }
            java.lang.String r3 = "wrgb"
            int r4 = r7.mo35440g()     // Catch:{ JSONException -> 0x00ce }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ JSONException -> 0x00ce }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x00ce }
            int r3 = r7.mo35449p()     // Catch:{ JSONException -> 0x00ce }
            r4 = 4
            java.lang.String r5 = "colorflow"
            if (r3 != r4) goto L_0x0072
            java.lang.String r3 = r7.mo35437d()     // Catch:{ JSONException -> 0x00ce }
        L_0x006e:
            r2.put(r5, r3)     // Catch:{ JSONException -> 0x00ce }
            goto L_0x0085
        L_0x0072:
            com.yeelight.yeelib.models.a r3 = r7.mo35436c()     // Catch:{ JSONException -> 0x00ce }
            if (r3 == 0) goto L_0x0085
            com.yeelight.yeelib.models.a r3 = r7.mo35436c()     // Catch:{ JSONException -> 0x00ce }
            org.json.JSONArray r3 = r3.mo35344n()     // Catch:{ JSONException -> 0x00ce }
            java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x00ce }
            goto L_0x006e
        L_0x0085:
            java.lang.String r3 = "remark"
            java.lang.String r4 = r7.mo35404W()     // Catch:{ JSONException -> 0x00ce }
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x00ce }
            java.lang.String r3 = "1"
            r2.put(r0, r3)     // Catch:{ JSONException -> 0x00ce }
            boolean r3 = r7 instanceof com.yeelight.yeelib.models.CustomAdvancedFlowScene     // Catch:{ JSONException -> 0x00ce }
            if (r3 == 0) goto L_0x00b2
            r3 = r7
            com.yeelight.yeelib.models.CustomAdvancedFlowScene r3 = (com.yeelight.yeelib.models.CustomAdvancedFlowScene) r3     // Catch:{ JSONException -> 0x00ce }
            int r3 = r3.mo35296d0()     // Catch:{ JSONException -> 0x00ce }
            if (r3 <= 0) goto L_0x00a7
            com.yeelight.yeelib.models.CustomAdvancedFlowScene r7 = (com.yeelight.yeelib.models.CustomAdvancedFlowScene) r7     // Catch:{ JSONException -> 0x00ce }
            int r7 = r7.mo35296d0()     // Catch:{ JSONException -> 0x00ce }
            goto L_0x00a8
        L_0x00a7:
            r7 = 0
        L_0x00a8:
            java.lang.String r3 = "subtype"
            r2.put(r3, r7)     // Catch:{ JSONException -> 0x00ce }
            java.lang.String r7 = "2"
            r2.put(r0, r7)     // Catch:{ JSONException -> 0x00ce }
        L_0x00b2:
            java.lang.String r7 = r2.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "save scene jsonObject: "
            r0.append(r2)
            r0.append(r7)
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            com.yeelight.yeelib.models.v$c r2 = new com.yeelight.yeelib.models.v$c
            r2.<init>(r6, r8)
            p129b4.C3988b.m11572h(r1, r7, r0, r2)
            return
        L_0x00ce:
            r7 = move-exception
            r7.printStackTrace()
            if (r8 == 0) goto L_0x00df
            android.content.Context r7 = com.yeelight.yeelib.managers.C3108x.f4951e
            int r0 = com.yeelight.yeelib.R$string.scene_cache_save_fail
            java.lang.String r7 = r7.getString(r0)
            r8.mo23579a(r7)
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.models.C3112v.mo23552A(com.yeelight.yeelib.models.m, com.yeelight.yeelib.models.v$g):void");
    }

    /* renamed from: B */
    public void mo23553B(C8321m mVar, C3119g gVar) {
        String o = m8240o("hw/v2/scene/user/" + mVar.mo35451r(), (JSONObject) null);
        StringBuilder sb = new StringBuilder();
        sb.append("updateCustomScene url: ");
        sb.append(o);
        new C3903a("utf-8");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uid", C3051a.m7925r().mo23366v());
            jSONObject.put(ScanBarcodeActivity.TITLE, mVar.mo35453t());
            jSONObject.put("mode", mVar.mo35449p());
            jSONObject.put("bright", String.valueOf(mVar.mo35439f()));
            jSONObject.put("color_temperature", String.valueOf(mVar.mo35441h()));
            jSONObject.put("wrgb", String.valueOf(mVar.mo35440g()));
            jSONObject.put("colorflow", mVar.mo35436c().mo35344n().toString());
            jSONObject.put("type", TimerCodec.ENABLE);
            jSONObject.put("subtype", ((CustomAdvancedFlowScene) mVar).mo35296d0() > 0 ? ((CustomAdvancedFlowScene) mVar).mo35296d0() : 0);
            jSONObject.put("type", "2");
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("updateCustomScene scene jsonObject: ");
            sb2.append(jSONObject2);
            C3988b.m11576l(o, jSONObject2, String.class, new C3117e(this, gVar));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    public void mo23554e(String str, String str2) {
        C3283v.m8846l(m8241t(str), str2);
    }

    /* renamed from: f */
    public void mo23555f(C8321m mVar, C3119g gVar) {
        String o = m8240o("hw/v2/scene/user/" + mVar.mo35451r(), (JSONObject) null);
        StringBuilder sb = new StringBuilder();
        sb.append("del scene url: ");
        sb.append(o);
        C3988b.m11565a(o, String.class, new C3116d(this, gVar));
    }

    /* renamed from: g */
    public String mo23556g(String str) {
        return C3283v.m8840f(m8241t(str), (String) null);
    }

    /* renamed from: h */
    public C8327s mo23557h(int i) {
        if (this.f4961c.size() == 0) {
            mo23568v((C3119g) null);
            return null;
        }
        for (C8309b next : this.f4961c) {
            if (next.mo35451r() == i) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: i */
    public List<CustomAdvancedFlowScene> mo23558i() {
        return this.f4961c;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.yeelight.yeelib.models.CustomAdvancedFlowScene> mo23559j(java.lang.String r6) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.hashCode()
            int r2 = r6.hashCode()
            r3 = 0
            r4 = -1
            switch(r2) {
                case -1644531059: goto L_0x049b;
                case -1462015191: goto L_0x0490;
                case -1462015190: goto L_0x0485;
                case -1462015189: goto L_0x047a;
                case -1462015188: goto L_0x046f;
                case -1462015187: goto L_0x0464;
                case -1462015186: goto L_0x0459;
                case -1462015185: goto L_0x044e;
                case -1462015184: goto L_0x0440;
                case -1462015183: goto L_0x0432;
                case -1462015182: goto L_0x0424;
                case -1462015160: goto L_0x0416;
                case -1462015159: goto L_0x0408;
                case -1462015158: goto L_0x03fa;
                case -1462015157: goto L_0x03ec;
                case -1462015156: goto L_0x03de;
                case -1317475940: goto L_0x03d0;
                case -1317475939: goto L_0x03c2;
                case -1317475937: goto L_0x03b4;
                case -1317475915: goto L_0x03a6;
                case -1317475914: goto L_0x0398;
                case -1317475913: goto L_0x038a;
                case -1317475912: goto L_0x037c;
                case -1317475910: goto L_0x036e;
                case -1308146495: goto L_0x0360;
                case -1308146494: goto L_0x0352;
                case -1308146493: goto L_0x0344;
                case -1308146492: goto L_0x0336;
                case -1308146491: goto L_0x0328;
                case -1308146490: goto L_0x031a;
                case -1308146488: goto L_0x030c;
                case -1308146447: goto L_0x02fe;
                case -1308146446: goto L_0x02f0;
                case -1308146445: goto L_0x02e2;
                case -1308146443: goto L_0x02d4;
                case -1235140472: goto L_0x02c6;
                case -1235140471: goto L_0x02b8;
                case -1235140468: goto L_0x02aa;
                case -1235140467: goto L_0x029c;
                case -1063384694: goto L_0x028e;
                case -1063384689: goto L_0x0280;
                case -1063384687: goto L_0x0272;
                case -1063384685: goto L_0x0264;
                case -948847040: goto L_0x0256;
                case -948847038: goto L_0x0248;
                case -888668266: goto L_0x023a;
                case -888668265: goto L_0x022c;
                case -888668264: goto L_0x021e;
                case -845289556: goto L_0x0210;
                case -845289555: goto L_0x0202;
                case -845289553: goto L_0x01f4;
                case -845289551: goto L_0x01e6;
                case -845289549: goto L_0x01d8;
                case -845289508: goto L_0x01ca;
                case -458141175: goto L_0x01bc;
                case -458141174: goto L_0x01ae;
                case -458141173: goto L_0x01a0;
                case -458141172: goto L_0x0192;
                case -458141171: goto L_0x0184;
                case -449944730: goto L_0x0176;
                case -449944729: goto L_0x0168;
                case -449944728: goto L_0x015a;
                case -449944727: goto L_0x014c;
                case -449944724: goto L_0x013e;
                case -449944723: goto L_0x0130;
                case -449944722: goto L_0x0122;
                case -448603205: goto L_0x0114;
                case -448603202: goto L_0x0106;
                case -448603201: goto L_0x00f8;
                case -448603157: goto L_0x00ea;
                case -448603156: goto L_0x00dc;
                case 922669543: goto L_0x00ce;
                case 922669544: goto L_0x00c0;
                case 922669545: goto L_0x00b2;
                case 922669546: goto L_0x00a4;
                case 922669547: goto L_0x0096;
                case 922669548: goto L_0x0088;
                case 922669549: goto L_0x007a;
                case 922669550: goto L_0x006c;
                case 1201756974: goto L_0x005e;
                case 1201757021: goto L_0x0050;
                case 1201757023: goto L_0x0042;
                case 1623724661: goto L_0x0034;
                case 1623724662: goto L_0x0026;
                case 1623724663: goto L_0x0018;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x04a5
        L_0x0018:
            java.lang.String r2 = "yeelink.light.bslamp3"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0022
            goto L_0x04a5
        L_0x0022:
            r4 = 84
            goto L_0x04a5
        L_0x0026:
            java.lang.String r2 = "yeelink.light.bslamp2"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0030
            goto L_0x04a5
        L_0x0030:
            r4 = 83
            goto L_0x04a5
        L_0x0034:
            java.lang.String r2 = "yeelink.light.bslamp1"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x003e
            goto L_0x04a5
        L_0x003e:
            r4 = 82
            goto L_0x04a5
        L_0x0042:
            java.lang.String r2 = "yeelink.light.ctc"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x004c
            goto L_0x04a5
        L_0x004c:
            r4 = 81
            goto L_0x04a5
        L_0x0050:
            java.lang.String r2 = "yeelink.light.cta"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x005a
            goto L_0x04a5
        L_0x005a:
            r4 = 80
            goto L_0x04a5
        L_0x005e:
            java.lang.String r2 = "yeelink.light.ct2"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0068
            goto L_0x04a5
        L_0x0068:
            r4 = 79
            goto L_0x04a5
        L_0x006c:
            java.lang.String r2 = "yeelink.light.ceiling8"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0076
            goto L_0x04a5
        L_0x0076:
            r4 = 78
            goto L_0x04a5
        L_0x007a:
            java.lang.String r2 = "yeelink.light.ceiling7"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0084
            goto L_0x04a5
        L_0x0084:
            r4 = 77
            goto L_0x04a5
        L_0x0088:
            java.lang.String r2 = "yeelink.light.ceiling6"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0092
            goto L_0x04a5
        L_0x0092:
            r4 = 76
            goto L_0x04a5
        L_0x0096:
            java.lang.String r2 = "yeelink.light.ceiling5"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x00a0
            goto L_0x04a5
        L_0x00a0:
            r4 = 75
            goto L_0x04a5
        L_0x00a4:
            java.lang.String r2 = "yeelink.light.ceiling4"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x00ae
            goto L_0x04a5
        L_0x00ae:
            r4 = 74
            goto L_0x04a5
        L_0x00b2:
            java.lang.String r2 = "yeelink.light.ceiling3"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x00bc
            goto L_0x04a5
        L_0x00bc:
            r4 = 73
            goto L_0x04a5
        L_0x00c0:
            java.lang.String r2 = "yeelink.light.ceiling2"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x00ca
            goto L_0x04a5
        L_0x00ca:
            r4 = 72
            goto L_0x04a5
        L_0x00ce:
            java.lang.String r2 = "yeelink.light.ceiling1"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x00d8
            goto L_0x04a5
        L_0x00d8:
            r4 = 71
            goto L_0x04a5
        L_0x00dc:
            java.lang.String r2 = "yeelink.light.monob"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x00e6
            goto L_0x04a5
        L_0x00e6:
            r4 = 70
            goto L_0x04a5
        L_0x00ea:
            java.lang.String r2 = "yeelink.light.monoa"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x00f4
            goto L_0x04a5
        L_0x00f4:
            r4 = 69
            goto L_0x04a5
        L_0x00f8:
            java.lang.String r2 = "yeelink.light.mono5"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0102
            goto L_0x04a5
        L_0x0102:
            r4 = 68
            goto L_0x04a5
        L_0x0106:
            java.lang.String r2 = "yeelink.light.mono4"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0110
            goto L_0x04a5
        L_0x0110:
            r4 = 67
            goto L_0x04a5
        L_0x0114:
            java.lang.String r2 = "yeelink.light.mono1"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x011e
            goto L_0x04a5
        L_0x011e:
            r4 = 66
            goto L_0x04a5
        L_0x0122:
            java.lang.String r2 = "yeelink.light.lamp9"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x012c
            goto L_0x04a5
        L_0x012c:
            r4 = 65
            goto L_0x04a5
        L_0x0130:
            java.lang.String r2 = "yeelink.light.lamp8"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x013a
            goto L_0x04a5
        L_0x013a:
            r4 = 64
            goto L_0x04a5
        L_0x013e:
            java.lang.String r2 = "yeelink.light.lamp7"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0148
            goto L_0x04a5
        L_0x0148:
            r4 = 63
            goto L_0x04a5
        L_0x014c:
            java.lang.String r2 = "yeelink.light.lamp4"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0156
            goto L_0x04a5
        L_0x0156:
            r4 = 62
            goto L_0x04a5
        L_0x015a:
            java.lang.String r2 = "yeelink.light.lamp3"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0164
            goto L_0x04a5
        L_0x0164:
            r4 = 61
            goto L_0x04a5
        L_0x0168:
            java.lang.String r2 = "yeelink.light.lamp2"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0172
            goto L_0x04a5
        L_0x0172:
            r4 = 60
            goto L_0x04a5
        L_0x0176:
            java.lang.String r2 = "yeelink.light.lamp1"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0180
            goto L_0x04a5
        L_0x0180:
            r4 = 59
            goto L_0x04a5
        L_0x0184:
            java.lang.String r2 = "yeelink.light.ceile"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x018e
            goto L_0x04a5
        L_0x018e:
            r4 = 58
            goto L_0x04a5
        L_0x0192:
            java.lang.String r2 = "yeelink.light.ceild"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x019c
            goto L_0x04a5
        L_0x019c:
            r4 = 57
            goto L_0x04a5
        L_0x01a0:
            java.lang.String r2 = "yeelink.light.ceilc"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x01aa
            goto L_0x04a5
        L_0x01aa:
            r4 = 56
            goto L_0x04a5
        L_0x01ae:
            java.lang.String r2 = "yeelink.light.ceilb"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x01b8
            goto L_0x04a5
        L_0x01b8:
            r4 = 55
            goto L_0x04a5
        L_0x01bc:
            java.lang.String r2 = "yeelink.light.ceila"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x01c6
            goto L_0x04a5
        L_0x01c6:
            r4 = 54
            goto L_0x04a5
        L_0x01ca:
            java.lang.String r2 = "yeelink.light.stripa"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x01d4
            goto L_0x04a5
        L_0x01d4:
            r4 = 53
            goto L_0x04a5
        L_0x01d8:
            java.lang.String r2 = "yeelink.light.strip8"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x01e2
            goto L_0x04a5
        L_0x01e2:
            r4 = 52
            goto L_0x04a5
        L_0x01e6:
            java.lang.String r2 = "yeelink.light.strip6"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x01f0
            goto L_0x04a5
        L_0x01f0:
            r4 = 51
            goto L_0x04a5
        L_0x01f4:
            java.lang.String r2 = "yeelink.light.strip4"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x01fe
            goto L_0x04a5
        L_0x01fe:
            r4 = 50
            goto L_0x04a5
        L_0x0202:
            java.lang.String r2 = "yeelink.light.strip2"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x020c
            goto L_0x04a5
        L_0x020c:
            r4 = 49
            goto L_0x04a5
        L_0x0210:
            java.lang.String r2 = "yeelink.light.strip1"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x021a
            goto L_0x04a5
        L_0x021a:
            r4 = 48
            goto L_0x04a5
        L_0x021e:
            java.lang.String r2 = "yilai.light.ceiling3"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0228
            goto L_0x04a5
        L_0x0228:
            r4 = 47
            goto L_0x04a5
        L_0x022c:
            java.lang.String r2 = "yilai.light.ceiling2"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0236
            goto L_0x04a5
        L_0x0236:
            r4 = 46
            goto L_0x04a5
        L_0x023a:
            java.lang.String r2 = "yilai.light.ceiling1"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0244
            goto L_0x04a5
        L_0x0244:
            r4 = 45
            goto L_0x04a5
        L_0x0248:
            java.lang.String r2 = "yeelink.light.panel3"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0252
            goto L_0x04a5
        L_0x0252:
            r4 = 44
            goto L_0x04a5
        L_0x0256:
            java.lang.String r2 = "yeelink.light.panel1"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0260
            goto L_0x04a5
        L_0x0260:
            r4 = 43
            goto L_0x04a5
        L_0x0264:
            java.lang.String r2 = "yeelink.light.lamp19"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x026e
            goto L_0x04a5
        L_0x026e:
            r4 = 42
            goto L_0x04a5
        L_0x0272:
            java.lang.String r2 = "yeelink.light.lamp17"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x027c
            goto L_0x04a5
        L_0x027c:
            r4 = 41
            goto L_0x04a5
        L_0x0280:
            java.lang.String r2 = "yeelink.light.lamp15"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x028a
            goto L_0x04a5
        L_0x028a:
            r4 = 40
            goto L_0x04a5
        L_0x028e:
            java.lang.String r2 = "yeelink.light.lamp10"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0298
            goto L_0x04a5
        L_0x0298:
            r4 = 39
            goto L_0x04a5
        L_0x029c:
            java.lang.String r2 = "yeelink.light.fancl6"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x02a6
            goto L_0x04a5
        L_0x02a6:
            r4 = 38
            goto L_0x04a5
        L_0x02aa:
            java.lang.String r2 = "yeelink.light.fancl5"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x02b4
            goto L_0x04a5
        L_0x02b4:
            r4 = 37
            goto L_0x04a5
        L_0x02b8:
            java.lang.String r2 = "yeelink.light.fancl2"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x02c2
            goto L_0x04a5
        L_0x02c2:
            r4 = 36
            goto L_0x04a5
        L_0x02c6:
            java.lang.String r2 = "yeelink.light.fancl1"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x02d0
            goto L_0x04a5
        L_0x02d0:
            r4 = 35
            goto L_0x04a5
        L_0x02d4:
            java.lang.String r2 = "yeelink.light.colore"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x02de
            goto L_0x04a5
        L_0x02de:
            r4 = 34
            goto L_0x04a5
        L_0x02e2:
            java.lang.String r2 = "yeelink.light.colorc"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x02ec
            goto L_0x04a5
        L_0x02ec:
            r4 = 33
            goto L_0x04a5
        L_0x02f0:
            java.lang.String r2 = "yeelink.light.colorb"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x02fa
            goto L_0x04a5
        L_0x02fa:
            r4 = 32
            goto L_0x04a5
        L_0x02fe:
            java.lang.String r2 = "yeelink.light.colora"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0308
            goto L_0x04a5
        L_0x0308:
            r4 = 31
            goto L_0x04a5
        L_0x030c:
            java.lang.String r2 = "yeelink.light.color8"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0316
            goto L_0x04a5
        L_0x0316:
            r4 = 30
            goto L_0x04a5
        L_0x031a:
            java.lang.String r2 = "yeelink.light.color6"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0324
            goto L_0x04a5
        L_0x0324:
            r4 = 29
            goto L_0x04a5
        L_0x0328:
            java.lang.String r2 = "yeelink.light.color5"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0332
            goto L_0x04a5
        L_0x0332:
            r4 = 28
            goto L_0x04a5
        L_0x0336:
            java.lang.String r2 = "yeelink.light.color4"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0340
            goto L_0x04a5
        L_0x0340:
            r4 = 27
            goto L_0x04a5
        L_0x0344:
            java.lang.String r2 = "yeelink.light.color3"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x034e
            goto L_0x04a5
        L_0x034e:
            r4 = 26
            goto L_0x04a5
        L_0x0352:
            java.lang.String r2 = "yeelink.light.color2"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x035c
            goto L_0x04a5
        L_0x035c:
            r4 = 25
            goto L_0x04a5
        L_0x0360:
            java.lang.String r2 = "yeelink.light.color1"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x036a
            goto L_0x04a5
        L_0x036a:
            r4 = 24
            goto L_0x04a5
        L_0x036e:
            java.lang.String r2 = "yeelink.light.ceil35"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0378
            goto L_0x04a5
        L_0x0378:
            r4 = 23
            goto L_0x04a5
        L_0x037c:
            java.lang.String r2 = "yeelink.light.ceil33"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0386
            goto L_0x04a5
        L_0x0386:
            r4 = 22
            goto L_0x04a5
        L_0x038a:
            java.lang.String r2 = "yeelink.light.ceil32"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0394
            goto L_0x04a5
        L_0x0394:
            r4 = 21
            goto L_0x04a5
        L_0x0398:
            java.lang.String r2 = "yeelink.light.ceil31"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x03a2
            goto L_0x04a5
        L_0x03a2:
            r4 = 20
            goto L_0x04a5
        L_0x03a6:
            java.lang.String r2 = "yeelink.light.ceil30"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x03b0
            goto L_0x04a5
        L_0x03b0:
            r4 = 19
            goto L_0x04a5
        L_0x03b4:
            java.lang.String r2 = "yeelink.light.ceil29"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x03be
            goto L_0x04a5
        L_0x03be:
            r4 = 18
            goto L_0x04a5
        L_0x03c2:
            java.lang.String r2 = "yeelink.light.ceil27"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x03cc
            goto L_0x04a5
        L_0x03cc:
            r4 = 17
            goto L_0x04a5
        L_0x03d0:
            java.lang.String r2 = "yeelink.light.ceil26"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x03da
            goto L_0x04a5
        L_0x03da:
            r4 = 16
            goto L_0x04a5
        L_0x03de:
            java.lang.String r2 = "yeelink.light.ceiling24"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x03e8
            goto L_0x04a5
        L_0x03e8:
            r4 = 15
            goto L_0x04a5
        L_0x03ec:
            java.lang.String r2 = "yeelink.light.ceiling23"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x03f6
            goto L_0x04a5
        L_0x03f6:
            r4 = 14
            goto L_0x04a5
        L_0x03fa:
            java.lang.String r2 = "yeelink.light.ceiling22"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0404
            goto L_0x04a5
        L_0x0404:
            r4 = 13
            goto L_0x04a5
        L_0x0408:
            java.lang.String r2 = "yeelink.light.ceiling21"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0412
            goto L_0x04a5
        L_0x0412:
            r4 = 12
            goto L_0x04a5
        L_0x0416:
            java.lang.String r2 = "yeelink.light.ceiling20"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0420
            goto L_0x04a5
        L_0x0420:
            r4 = 11
            goto L_0x04a5
        L_0x0424:
            java.lang.String r2 = "yeelink.light.ceiling19"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x042e
            goto L_0x04a5
        L_0x042e:
            r4 = 10
            goto L_0x04a5
        L_0x0432:
            java.lang.String r2 = "yeelink.light.ceiling18"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x043c
            goto L_0x04a5
        L_0x043c:
            r4 = 9
            goto L_0x04a5
        L_0x0440:
            java.lang.String r2 = "yeelink.light.ceiling17"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x044a
            goto L_0x04a5
        L_0x044a:
            r4 = 8
            goto L_0x04a5
        L_0x044e:
            java.lang.String r2 = "yeelink.light.ceiling16"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0457
            goto L_0x04a5
        L_0x0457:
            r4 = 7
            goto L_0x04a5
        L_0x0459:
            java.lang.String r2 = "yeelink.light.ceiling15"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0462
            goto L_0x04a5
        L_0x0462:
            r4 = 6
            goto L_0x04a5
        L_0x0464:
            java.lang.String r2 = "yeelink.light.ceiling14"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x046d
            goto L_0x04a5
        L_0x046d:
            r4 = 5
            goto L_0x04a5
        L_0x046f:
            java.lang.String r2 = "yeelink.light.ceiling13"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0478
            goto L_0x04a5
        L_0x0478:
            r4 = 4
            goto L_0x04a5
        L_0x047a:
            java.lang.String r2 = "yeelink.light.ceiling12"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0483
            goto L_0x04a5
        L_0x0483:
            r4 = 3
            goto L_0x04a5
        L_0x0485:
            java.lang.String r2 = "yeelink.light.ceiling11"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x048e
            goto L_0x04a5
        L_0x048e:
            r4 = 2
            goto L_0x04a5
        L_0x0490:
            java.lang.String r2 = "yeelink.light.ceiling10"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x0499
            goto L_0x04a5
        L_0x0499:
            r4 = 1
            goto L_0x04a5
        L_0x049b:
            java.lang.String r2 = "yeelink.bhf_light.v1"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x04a4
            goto L_0x04a5
        L_0x04a4:
            r4 = 0
        L_0x04a5:
            switch(r4) {
                case 0: goto L_0x04fb;
                case 1: goto L_0x04fb;
                case 2: goto L_0x04fb;
                case 3: goto L_0x04fb;
                case 4: goto L_0x04fb;
                case 5: goto L_0x04fb;
                case 6: goto L_0x04fb;
                case 7: goto L_0x04fb;
                case 8: goto L_0x04fb;
                case 9: goto L_0x04fb;
                case 10: goto L_0x04fb;
                case 11: goto L_0x04fb;
                case 12: goto L_0x04fb;
                case 13: goto L_0x04fb;
                case 14: goto L_0x04fb;
                case 15: goto L_0x04fb;
                case 16: goto L_0x04fb;
                case 17: goto L_0x04fb;
                case 18: goto L_0x04fb;
                case 19: goto L_0x04fb;
                case 20: goto L_0x04fb;
                case 21: goto L_0x04fb;
                case 22: goto L_0x04fb;
                case 23: goto L_0x04fb;
                case 24: goto L_0x04f5;
                case 25: goto L_0x04f5;
                case 26: goto L_0x04f5;
                case 27: goto L_0x04f5;
                case 28: goto L_0x04f5;
                case 29: goto L_0x04f5;
                case 30: goto L_0x04f5;
                case 31: goto L_0x04f5;
                case 32: goto L_0x04f5;
                case 33: goto L_0x04f5;
                case 34: goto L_0x04f5;
                case 35: goto L_0x04fb;
                case 36: goto L_0x04fb;
                case 37: goto L_0x04fb;
                case 38: goto L_0x04fb;
                case 39: goto L_0x04f5;
                case 40: goto L_0x04fb;
                case 41: goto L_0x04aa;
                case 42: goto L_0x04fb;
                case 43: goto L_0x04aa;
                case 44: goto L_0x04fb;
                case 45: goto L_0x04fb;
                case 46: goto L_0x04fb;
                case 47: goto L_0x04fb;
                case 48: goto L_0x04f5;
                case 49: goto L_0x04f5;
                case 50: goto L_0x04fb;
                case 51: goto L_0x04f5;
                case 52: goto L_0x04f5;
                case 53: goto L_0x04f5;
                case 54: goto L_0x04fb;
                case 55: goto L_0x04fb;
                case 56: goto L_0x04fb;
                case 57: goto L_0x04fb;
                case 58: goto L_0x04fb;
                case 59: goto L_0x04fb;
                case 60: goto L_0x04fb;
                case 61: goto L_0x04fb;
                case 62: goto L_0x04fb;
                case 63: goto L_0x04fb;
                case 64: goto L_0x04fb;
                case 65: goto L_0x04fb;
                case 66: goto L_0x04aa;
                case 67: goto L_0x04aa;
                case 68: goto L_0x04aa;
                case 69: goto L_0x04aa;
                case 70: goto L_0x04aa;
                case 71: goto L_0x04fb;
                case 72: goto L_0x04aa;
                case 73: goto L_0x04fb;
                case 74: goto L_0x04fb;
                case 75: goto L_0x04fb;
                case 76: goto L_0x04fb;
                case 77: goto L_0x04fb;
                case 78: goto L_0x04fb;
                case 79: goto L_0x04fb;
                case 80: goto L_0x04fb;
                case 81: goto L_0x04fb;
                case 82: goto L_0x04f5;
                case 83: goto L_0x04fb;
                case 84: goto L_0x04fb;
                default: goto L_0x04a8;
            }
        L_0x04a8:
            goto L_0x055a
        L_0x04aa:
            java.util.List<com.yeelight.yeelib.models.CustomAdvancedFlowScene> r6 = r5.f4961c
            int r6 = r6.size()
            if (r3 >= r6) goto L_0x055a
            java.util.List<com.yeelight.yeelib.models.CustomAdvancedFlowScene> r6 = r5.f4961c
            java.lang.Object r6 = r6.get(r3)
            com.yeelight.yeelib.models.CustomAdvancedFlowScene r6 = (com.yeelight.yeelib.models.CustomAdvancedFlowScene) r6
            com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r6 = r6.mo35295c0()
            com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r2 = com.yeelight.yeelib.models.CustomAdvancedFlowScene.LightMode.MODE_BRIGHT_ONLY
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x04e7
            java.util.List<com.yeelight.yeelib.models.CustomAdvancedFlowScene> r6 = r5.f4961c
            java.lang.Object r6 = r6.get(r3)
            com.yeelight.yeelib.models.CustomAdvancedFlowScene r6 = (com.yeelight.yeelib.models.CustomAdvancedFlowScene) r6
            com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r6 = r6.mo35295c0()
            com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r2 = com.yeelight.yeelib.models.CustomAdvancedFlowScene.LightMode.MODE_SUSPEND
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x04db
            goto L_0x04e7
        L_0x04db:
            java.util.List<com.yeelight.yeelib.models.CustomAdvancedFlowScene> r6 = r5.f4961c
            java.lang.Object r6 = r6.get(r3)
            com.yeelight.yeelib.models.CustomAdvancedFlowScene r6 = (com.yeelight.yeelib.models.CustomAdvancedFlowScene) r6
            r1.add(r6)
            goto L_0x04f2
        L_0x04e7:
            java.util.List<com.yeelight.yeelib.models.CustomAdvancedFlowScene> r6 = r5.f4961c
            java.lang.Object r6 = r6.get(r3)
            com.yeelight.yeelib.models.CustomAdvancedFlowScene r6 = (com.yeelight.yeelib.models.CustomAdvancedFlowScene) r6
            r0.add(r6)
        L_0x04f2:
            int r3 = r3 + 1
            goto L_0x04aa
        L_0x04f5:
            java.util.List<com.yeelight.yeelib.models.CustomAdvancedFlowScene> r6 = r5.f4961c
            r0.addAll(r6)
            goto L_0x055a
        L_0x04fb:
            java.util.List<com.yeelight.yeelib.models.CustomAdvancedFlowScene> r6 = r5.f4961c
            int r6 = r6.size()
            if (r3 >= r6) goto L_0x055a
            java.util.List<com.yeelight.yeelib.models.CustomAdvancedFlowScene> r6 = r5.f4961c
            java.lang.Object r6 = r6.get(r3)
            com.yeelight.yeelib.models.CustomAdvancedFlowScene r6 = (com.yeelight.yeelib.models.CustomAdvancedFlowScene) r6
            com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r6 = r6.mo35295c0()
            com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r2 = com.yeelight.yeelib.models.CustomAdvancedFlowScene.LightMode.MODE_BRIGHT_ONLY
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x054c
            java.util.List<com.yeelight.yeelib.models.CustomAdvancedFlowScene> r6 = r5.f4961c
            java.lang.Object r6 = r6.get(r3)
            com.yeelight.yeelib.models.CustomAdvancedFlowScene r6 = (com.yeelight.yeelib.models.CustomAdvancedFlowScene) r6
            com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r6 = r6.mo35295c0()
            com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r2 = com.yeelight.yeelib.models.CustomAdvancedFlowScene.LightMode.MODE_SUSPEND
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x054c
            java.util.List<com.yeelight.yeelib.models.CustomAdvancedFlowScene> r6 = r5.f4961c
            java.lang.Object r6 = r6.get(r3)
            com.yeelight.yeelib.models.CustomAdvancedFlowScene r6 = (com.yeelight.yeelib.models.CustomAdvancedFlowScene) r6
            com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r6 = r6.mo35295c0()
            com.yeelight.yeelib.models.CustomAdvancedFlowScene$LightMode r2 = com.yeelight.yeelib.models.CustomAdvancedFlowScene.LightMode.MODE_CT
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x0540
            goto L_0x054c
        L_0x0540:
            java.util.List<com.yeelight.yeelib.models.CustomAdvancedFlowScene> r6 = r5.f4961c
            java.lang.Object r6 = r6.get(r3)
            com.yeelight.yeelib.models.CustomAdvancedFlowScene r6 = (com.yeelight.yeelib.models.CustomAdvancedFlowScene) r6
            r1.add(r6)
            goto L_0x0557
        L_0x054c:
            java.util.List<com.yeelight.yeelib.models.CustomAdvancedFlowScene> r6 = r5.f4961c
            java.lang.Object r6 = r6.get(r3)
            com.yeelight.yeelib.models.CustomAdvancedFlowScene r6 = (com.yeelight.yeelib.models.CustomAdvancedFlowScene) r6
            r0.add(r6)
        L_0x0557:
            int r3 = r3 + 1
            goto L_0x04fb
        L_0x055a:
            r0.addAll(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.models.C3112v.mo23559j(java.lang.String):java.util.List");
    }

    /* renamed from: k */
    public List<C8321m> mo23560k(String str) {
        return this.f4959a.get(str);
    }

    /* renamed from: l */
    public void mo23561l(String str, C3119g gVar) {
        mo23562m(str, gVar, true);
    }

    /* renamed from: m */
    public void mo23562m(String str, C3119g gVar, boolean z) {
        if (!this.f4959a.containsKey(str) || gVar == null) {
            mo23570x(str, gVar, z);
        } else {
            gVar.mo23582r(false, this.f4959a.get(str));
        }
    }

    /* renamed from: n */
    public C8327s mo23563n(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("getRecommmendSceneById: scene id : ");
        sb.append(i);
        sb.append(", model : ");
        sb.append(str);
        List list = this.f4959a.get(str);
        if (list == null) {
            mo23561l(str, (C3119g) null);
            return null;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("recommendSceneList Id : ");
            sb2.append(((C8321m) list.get(i2)).mo35451r());
            sb2.append(" scene mode = ");
            sb2.append(((C8321m) list.get(i2)).mo35449p());
            if (((C8321m) list.get(i2)).mo35451r() == i) {
                return (C8327s) list.get(i2);
            }
        }
        return null;
    }

    /* renamed from: p */
    public List<C8321m> mo23564p(String str) {
        return this.f4960b.get(str);
    }

    /* renamed from: q */
    public List<C8321m> mo23565q(String str, C3119g gVar) {
        if (str == null) {
            return null;
        }
        String o = m8240o("hw/v2/scene/user/" + C3051a.m7925r().mo23366v() + MiotCloudImpl.COOKIE_PATH + str, (JSONObject) null);
        StringBuilder sb = new StringBuilder();
        sb.append("get scene url: ");
        sb.append(o);
        C3988b.m11567c(o, String.class, new C3113a(str, gVar));
        return mo23564p(str);
    }

    /* renamed from: r */
    public CustomAdvancedFlowScene mo23566r() {
        return this.f4962d;
    }

    /* renamed from: s */
    public C8327s mo23567s(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("getUserSceneById: scene id : ");
        sb.append(i);
        sb.append(", model : ");
        sb.append(str);
        List list = this.f4960b.get(str);
        if (list == null) {
            mo23565q(str, (C3119g) null);
            mo23561l(str, (C3119g) null);
            return null;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SceneList id : ");
            sb2.append(((C8321m) list.get(i2)).mo35451r());
            sb2.append(", scene mode : ");
            sb2.append(((C8321m) list.get(i2)).mo35449p());
            if (((C8321m) list.get(i2)).mo35451r() == i) {
                return (C8327s) list.get(i2);
            }
        }
        return null;
    }

    /* renamed from: v */
    public void mo23568v(C3119g gVar) {
        mo23569w(gVar, true);
    }

    /* renamed from: w */
    public void mo23569w(C3119g gVar, boolean z) {
        this.f4961c.clear();
        String o = m8240o("hw/v2/diyscene/user/" + C3051a.m7925r().mo23366v(), (JSONObject) null);
        StringBuilder sb = new StringBuilder();
        sb.append("get scene url: ");
        sb.append(o);
        boolean z2 = false;
        if (z) {
            try {
                String g = mo23556g(o);
                if (g != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("queryCustomSceneFromCloud cacheData : ");
                    sb2.append(g);
                    JSONArray jSONArray = new JSONObject(g).getJSONArray("scenes");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        CustomAdvancedFlowScene b0 = CustomAdvancedFlowScene.m19683b0(jSONArray.getJSONObject(i));
                        if (b0 != null) {
                            this.f4961c.add(b0);
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
        C3988b.m11567c(o, String.class, new C3114b(o, z2, gVar));
    }

    /* renamed from: x */
    public synchronized void mo23570x(String str, C3119g gVar, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("queryRecommendScene , model = ");
        sb.append(str);
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                jSONObject.put(Constants.VERSION, 2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        jSONObject.put("start", TimerCodec.DISENABLE);
        jSONObject.put("end", "32");
        jSONObject.put("product_model", str);
        jSONObject.put("lang", C8281l.m19542b().mo35224c());
        String o = m8240o("hw/v2/recommend_scene", jSONObject);
        String str2 = o + MiotCloudImpl.COOKIE_PATH + str;
        try {
            String g = mo23556g(str2);
            if (g != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("get recommend scene from cache: ");
                sb2.append(g);
                ArrayList arrayList = new ArrayList();
                try {
                    JSONObject jSONObject2 = new JSONObject(g);
                    if (jSONObject2.getInt("count") > 0) {
                        JSONArray jSONArray = jSONObject2.getJSONArray("scenes");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            arrayList.add(C8321m.m19779V(jSONArray.getJSONObject(i)));
                        }
                    }
                    if (gVar != null) {
                        gVar.mo23582r(false, arrayList);
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    if (gVar != null) {
                        gVar.mo23579a("queryRecommendScene onFailure !");
                    }
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        if (AppUtils.f4977a) {
            o = o + "&debug=1";
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("get recommend scene url: ");
        sb3.append(o);
        C3988b.m11567c(o, String.class, new C3118f(str, gVar, str2));
    }

    /* renamed from: y */
    public void mo23571y() {
        this.f4959a.clear();
    }

    /* renamed from: z */
    public void mo23572z() {
        this.f4962d = new CustomAdvancedFlowScene();
    }
}

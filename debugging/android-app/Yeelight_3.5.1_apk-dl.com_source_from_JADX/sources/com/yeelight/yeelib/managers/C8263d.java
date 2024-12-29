package com.yeelight.yeelib.managers;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.miot.api.Constants;
import com.yeelight.yeelib.device.C6081a;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.C6094f;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.models.C8316i;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p129b4.C3988b;
import p134c4.C4007b;

/* renamed from: com.yeelight.yeelib.managers.d */
public class C8263d implements C3051a.C3052i {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String f14169g = "d";

    /* renamed from: h */
    private static C8263d f14170h;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f14171a = 0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<C8316i> f14172b;

    /* renamed from: c */
    private String f14173c = null;

    /* renamed from: d */
    private String f14174d = null;

    /* renamed from: e */
    private HandlerThread f14175e;

    /* renamed from: f */
    private Handler f14176f;

    /* renamed from: com.yeelight.yeelib.managers.d$a */
    class C8264a implements C4007b<String> {

        /* renamed from: a */
        final /* synthetic */ C8271h f14177a;

        C8264a(C8271h hVar) {
            this.f14177a = hVar;
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            C8271h hVar;
            String unused = C8263d.f14169g;
            StringBuilder sb = new StringBuilder();
            sb.append("executeScene onSuccess ");
            sb.append(str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getInt("code") == 1) {
                    String unused2 = C8263d.f14169g;
                    if (C8263d.this.m19486v(jSONObject.getJSONArray("result").getJSONObject(0)) && (hVar = this.f14177a) != null) {
                        hVar.tokenOauthFailed();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            String unused = C8263d.f14169g;
            StringBuilder sb = new StringBuilder();
            sb.append("executeScene onFailure, e = ");
            sb.append(str);
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.d$b */
    class C8265b implements C4007b<String> {

        /* renamed from: a */
        final /* synthetic */ C8271h f14179a;

        C8265b(C8271h hVar) {
            this.f14179a = hVar;
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            C8271h hVar;
            String unused = C8263d.f14169g;
            StringBuilder sb = new StringBuilder();
            sb.append("executeOpenAppControlDevice onSuccess ");
            sb.append(str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getInt("code") == 1) {
                    String unused2 = C8263d.f14169g;
                    if (C8263d.this.m19486v(jSONObject.getJSONArray("result").getJSONObject(0)) && (hVar = this.f14179a) != null) {
                        hVar.tokenOauthFailed();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            String unused = C8263d.f14169g;
            StringBuilder sb = new StringBuilder();
            sb.append("executeOpenAppControlDevice onFailure, e = ");
            sb.append(str);
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.d$c */
    class C8266c implements C4007b<String> {

        /* renamed from: a */
        final /* synthetic */ C8271h f14181a;

        C8266c(C8271h hVar) {
            this.f14181a = hVar;
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            C8271h hVar;
            String unused = C8263d.f14169g;
            StringBuilder sb = new StringBuilder();
            sb.append("executeOpenHomeControlDevice onSuccess ");
            sb.append(str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getInt("code") == 1) {
                    String unused2 = C8263d.f14169g;
                    if (C8263d.this.m19486v(jSONObject.getJSONArray("result").getJSONObject(0)) && (hVar = this.f14181a) != null) {
                        hVar.tokenOauthFailed();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            String unused = C8263d.f14169g;
            StringBuilder sb = new StringBuilder();
            sb.append("executeOpenHomeControlDevice onFailure, e = ");
            sb.append(str);
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.d$d */
    class C8267d implements C4007b<String> {

        /* renamed from: a */
        final /* synthetic */ C8271h f14183a;

        C8267d(C8271h hVar) {
            this.f14183a = hVar;
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            C8271h hVar;
            String unused = C8263d.f14169g;
            StringBuilder sb = new StringBuilder();
            sb.append("executeUserScene onSuccess ");
            sb.append(str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getInt("code") == 1) {
                    String unused2 = C8263d.f14169g;
                    if (C8263d.this.m19486v(jSONObject.getJSONArray("result").getJSONObject(0)) && (hVar = this.f14183a) != null) {
                        hVar.tokenOauthFailed();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            String unused = C8263d.f14169g;
            StringBuilder sb = new StringBuilder();
            sb.append("executeUserScene onFailure, e = ");
            sb.append(str);
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.d$e */
    class C8268e implements C4007b<String> {

        /* renamed from: a */
        final /* synthetic */ C8271h f14185a;

        C8268e(C8271h hVar) {
            this.f14185a = hVar;
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            C8271h hVar;
            String unused = C8263d.f14169g;
            StringBuilder sb = new StringBuilder();
            sb.append("executeRecommendScene onSuccess ");
            sb.append(str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getInt("code") == 1) {
                    String unused2 = C8263d.f14169g;
                    if (C8263d.this.m19486v(jSONObject.getJSONArray("result").getJSONObject(0)) && (hVar = this.f14185a) != null) {
                        hVar.tokenOauthFailed();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            String unused = C8263d.f14169g;
            StringBuilder sb = new StringBuilder();
            sb.append("executeRecommendScene onFailure, e = ");
            sb.append(str);
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.d$f */
    class C8269f extends Handler {
        C8269f(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what == 1 && C8263d.this.f14171a <= 20) {
                for (C8316i k : C8263d.this.f14172b) {
                    C8263d.this.mo35189k(k, (C8271h) null);
                    C8263d.m19480e(C8263d.this);
                }
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.d$g */
    static /* synthetic */ class C8270g {

        /* renamed from: a */
        static final /* synthetic */ int[] f14188a;

        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|(3:41|42|44)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.yeelight.yeelib.interaction.ActionType[] r0 = com.yeelight.yeelib.interaction.ActionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14188a = r0
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.SCENE_BUNDLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14188a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.TURN_ON_ALL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14188a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.TURN_OFF_ALL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f14188a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.COMMAND     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f14188a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.ON     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f14188a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.OFF     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f14188a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.TOGGLE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f14188a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.BRIGHT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f14188a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.BRIGHT_VARIABLE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f14188a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.CT_VARIABLE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f14188a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.COLOR_VARIABLE     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f14188a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.CT     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f14188a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.COLOR     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f14188a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.SCENE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f14188a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.RECOMMEND_SCENE     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f14188a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.CONNECT     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f14188a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.LAUNCH     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f14188a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.MODE     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = f14188a     // Catch:{ NoSuchFieldError -> 0x00e4 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.DIMMER     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = f14188a     // Catch:{ NoSuchFieldError -> 0x00f0 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.BRIGHT_UP     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = f14188a     // Catch:{ NoSuchFieldError -> 0x00fc }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.BRIGHT_DOWN     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.managers.C8263d.C8270g.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.d$h */
    public interface C8271h {
        void tokenOauthFailed();
    }

    private C8263d() {
        m19485u();
        this.f14172b = new CopyOnWriteArrayList();
        C3051a.m7925r().mo23358M(this);
    }

    /* renamed from: e */
    static /* synthetic */ int m19480e(C8263d dVar) {
        int i = dVar.f14171a;
        dVar.f14171a = i + 1;
        return i;
    }

    /* renamed from: i */
    private String m19482i(boolean z) {
        String str = z ? "on" : "off";
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray2 = new JSONArray();
            jSONArray.put(str);
            jSONObject.put("method", "set_power");
            jSONObject.put("params", jSONArray);
            for (C3010c next : YeelightDeviceManager.m7800o0().mo23321w0()) {
                if (!(next instanceof C6081a)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("did", next.mo23185G());
                    jSONObject2.put(Constants.EXTRA_PUSH_COMMAND, jSONObject);
                    jSONArray2.put(jSONObject2);
                }
            }
            if (jSONArray2.length() == 0) {
                return null;
            }
            return jSONArray2.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ba, code lost:
        r2.put("params", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0160, code lost:
        r2.put("params", r4);
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m19483j(com.yeelight.yeelib.models.C8316i r17, com.yeelight.yeelib.device.base.C3012e r18) {
        /*
            r16 = this;
            r0 = r18
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            r5 = 0
            int[] r6 = com.yeelight.yeelib.managers.C8263d.C8270g.f14188a     // Catch:{ JSONException -> 0x01e1 }
            com.yeelight.yeelib.interaction.ActionType r7 = r17.mo35350a()     // Catch:{ JSONException -> 0x01e1 }
            int r7 = r7.ordinal()     // Catch:{ JSONException -> 0x01e1 }
            r6 = r6[r7]     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r7 = "set_ct_abx"
            java.lang.String r8 = "set_rgb"
            java.lang.String r9 = "set_bright"
            java.lang.String r10 = "set_power"
            java.lang.String r11 = "did"
            r12 = 500(0x1f4, float:7.0E-43)
            java.lang.String r13 = "smooth"
            java.lang.String r14 = "params"
            java.lang.String r15 = "method"
            switch(r6) {
                case 4: goto L_0x0176;
                case 5: goto L_0x016d;
                case 6: goto L_0x0164;
                case 7: goto L_0x015b;
                case 8: goto L_0x0145;
                case 9: goto L_0x0122;
                case 10: goto L_0x00e9;
                case 11: goto L_0x00d4;
                case 12: goto L_0x00bf;
                case 13: goto L_0x009e;
                case 14: goto L_0x003a;
                case 15: goto L_0x003a;
                default: goto L_0x0038;
            }
        L_0x0038:
            goto L_0x018a
        L_0x003a:
            java.lang.String r2 = r17.mo35362m()     // Catch:{ NumberFormatException -> 0x009d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x009d }
            int r2 = r2.intValue()     // Catch:{ NumberFormatException -> 0x009d }
            boolean r4 = r0 instanceof com.yeelight.yeelib.device.C6119c     // Catch:{ NumberFormatException -> 0x009d }
            java.lang.String r6 = "scene_id"
            if (r4 == 0) goto L_0x0086
            com.yeelight.yeelib.device.c r0 = (com.yeelight.yeelib.device.C6119c) r0     // Catch:{ NumberFormatException -> 0x009d }
            java.util.List r0 = r0.mo31753K1()     // Catch:{ NumberFormatException -> 0x009d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ NumberFormatException -> 0x009d }
        L_0x0056:
            boolean r1 = r0.hasNext()     // Catch:{ NumberFormatException -> 0x009d }
            if (r1 == 0) goto L_0x007a
            java.lang.Object r1 = r0.next()     // Catch:{ NumberFormatException -> 0x009d }
            com.yeelight.yeelib.device.base.c r1 = (com.yeelight.yeelib.device.base.C3010c) r1     // Catch:{ NumberFormatException -> 0x009d }
            boolean r4 = r1 instanceof com.yeelight.yeelib.device.C6081a     // Catch:{ NumberFormatException -> 0x009d }
            if (r4 == 0) goto L_0x0067
            goto L_0x0056
        L_0x0067:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ NumberFormatException -> 0x009d }
            r4.<init>()     // Catch:{ NumberFormatException -> 0x009d }
            java.lang.String r1 = r1.mo23185G()     // Catch:{ NumberFormatException -> 0x009d }
            r4.put(r11, r1)     // Catch:{ NumberFormatException -> 0x009d }
            r4.put(r6, r2)     // Catch:{ NumberFormatException -> 0x009d }
            r3.put(r4)     // Catch:{ NumberFormatException -> 0x009d }
            goto L_0x0056
        L_0x007a:
            int r0 = r3.length()     // Catch:{ NumberFormatException -> 0x009d }
            if (r0 != 0) goto L_0x0081
            return r5
        L_0x0081:
            java.lang.String r0 = r3.toString()     // Catch:{ NumberFormatException -> 0x009d }
            return r0
        L_0x0086:
            java.lang.String r0 = r17.mo35358i()     // Catch:{ NumberFormatException -> 0x009d }
            r1.put(r11, r0)     // Catch:{ NumberFormatException -> 0x009d }
            r1.put(r6, r2)     // Catch:{ NumberFormatException -> 0x009d }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ NumberFormatException -> 0x009d }
            r0.<init>()     // Catch:{ NumberFormatException -> 0x009d }
            r0.put(r1)     // Catch:{ NumberFormatException -> 0x009d }
            java.lang.String r0 = r0.toString()     // Catch:{ NumberFormatException -> 0x009d }
            return r0
        L_0x009d:
            return r5
        L_0x009e:
            java.lang.String r6 = r17.mo35353d()     // Catch:{ NumberFormatException -> 0x018a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ NumberFormatException -> 0x018a }
            int r6 = r6.intValue()     // Catch:{ NumberFormatException -> 0x018a }
            r7 = 16777215(0xffffff, float:2.3509886E-38)
            r6 = r6 & r7
            r4.put(r6)     // Catch:{ NumberFormatException -> 0x018a }
            r4.put(r13)     // Catch:{ NumberFormatException -> 0x018a }
            r4.put(r12)     // Catch:{ NumberFormatException -> 0x018a }
            r2.put(r15, r8)     // Catch:{ NumberFormatException -> 0x018a }
        L_0x00ba:
            r2.put(r14, r4)     // Catch:{ NumberFormatException -> 0x018a }
            goto L_0x018a
        L_0x00bf:
            java.lang.String r6 = r17.mo35363n()     // Catch:{ NumberFormatException -> 0x018a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ NumberFormatException -> 0x018a }
            r4.put(r6)     // Catch:{ NumberFormatException -> 0x018a }
            r4.put(r13)     // Catch:{ NumberFormatException -> 0x018a }
            r4.put(r12)     // Catch:{ NumberFormatException -> 0x018a }
            r2.put(r15, r7)     // Catch:{ NumberFormatException -> 0x018a }
            goto L_0x00ba
        L_0x00d4:
            java.lang.String r6 = r17.mo35354e()     // Catch:{ NumberFormatException -> 0x018a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ NumberFormatException -> 0x018a }
            r4.put(r6)     // Catch:{ NumberFormatException -> 0x018a }
            r4.put(r13)     // Catch:{ NumberFormatException -> 0x018a }
            r4.put(r12)     // Catch:{ NumberFormatException -> 0x018a }
            r2.put(r15, r8)     // Catch:{ NumberFormatException -> 0x018a }
            goto L_0x00ba
        L_0x00e9:
            java.lang.String r6 = r17.mo35356g()     // Catch:{ NumberFormatException -> 0x018a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ NumberFormatException -> 0x018a }
            int r6 = r6.intValue()     // Catch:{ NumberFormatException -> 0x018a }
            if (r0 == 0) goto L_0x0115
            java.lang.String r8 = r18.mo23144i1()     // Catch:{ NumberFormatException -> 0x018a }
            x3.i$a r8 = p227x3.C11972i.m30704b(r8)     // Catch:{ NumberFormatException -> 0x018a }
            if (r8 == 0) goto L_0x0115
            int r9 = r8.mo42546a()     // Catch:{ NumberFormatException -> 0x018a }
            if (r6 <= r9) goto L_0x010b
            int r6 = r8.mo42546a()     // Catch:{ NumberFormatException -> 0x018a }
        L_0x010b:
            int r9 = r8.mo42547b()     // Catch:{ NumberFormatException -> 0x018a }
            if (r6 >= r9) goto L_0x0115
            int r6 = r8.mo42547b()     // Catch:{ NumberFormatException -> 0x018a }
        L_0x0115:
            r4.put(r6)     // Catch:{ NumberFormatException -> 0x018a }
            r4.put(r13)     // Catch:{ NumberFormatException -> 0x018a }
            r4.put(r12)     // Catch:{ NumberFormatException -> 0x018a }
            r2.put(r15, r7)     // Catch:{ NumberFormatException -> 0x018a }
            goto L_0x00ba
        L_0x0122:
            java.lang.String r6 = r17.mo35352c()     // Catch:{ NumberFormatException -> 0x018a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ NumberFormatException -> 0x018a }
            int r6 = r6.intValue()     // Catch:{ NumberFormatException -> 0x018a }
            r7 = 100
            if (r6 <= r7) goto L_0x0134
            r6 = 100
        L_0x0134:
            if (r6 >= 0) goto L_0x0137
            r6 = 0
        L_0x0137:
            r4.put(r6)     // Catch:{ NumberFormatException -> 0x018a }
            r4.put(r13)     // Catch:{ NumberFormatException -> 0x018a }
            r4.put(r12)     // Catch:{ NumberFormatException -> 0x018a }
            r2.put(r15, r9)     // Catch:{ NumberFormatException -> 0x018a }
            goto L_0x00ba
        L_0x0145:
            java.lang.String r6 = r17.mo35351b()     // Catch:{ NumberFormatException -> 0x018a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ NumberFormatException -> 0x018a }
            r4.put(r6)     // Catch:{ NumberFormatException -> 0x018a }
            r4.put(r13)     // Catch:{ NumberFormatException -> 0x018a }
            r4.put(r12)     // Catch:{ NumberFormatException -> 0x018a }
            r2.put(r15, r9)     // Catch:{ NumberFormatException -> 0x018a }
            goto L_0x00ba
        L_0x015b:
            java.lang.String r6 = "toggle"
            r2.put(r15, r6)     // Catch:{ JSONException -> 0x01e1 }
        L_0x0160:
            r2.put(r14, r4)     // Catch:{ JSONException -> 0x01e1 }
            goto L_0x018a
        L_0x0164:
            java.lang.String r6 = "off"
            r4.put(r6)     // Catch:{ JSONException -> 0x01e1 }
            r2.put(r15, r10)     // Catch:{ JSONException -> 0x01e1 }
            goto L_0x0160
        L_0x016d:
            java.lang.String r6 = "on"
            r4.put(r6)     // Catch:{ JSONException -> 0x01e1 }
            r2.put(r15, r10)     // Catch:{ JSONException -> 0x01e1 }
            goto L_0x0160
        L_0x0176:
            org.json.JSONObject r4 = r17.mo35355f()     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r4 = r4.getString(r15)     // Catch:{ JSONException -> 0x01e1 }
            r2.put(r15, r4)     // Catch:{ JSONException -> 0x01e1 }
            org.json.JSONObject r4 = r17.mo35355f()     // Catch:{ JSONException -> 0x01e1 }
            org.json.JSONArray r4 = r4.getJSONArray(r14)     // Catch:{ JSONException -> 0x01e1 }
            goto L_0x0160
        L_0x018a:
            boolean r4 = r0 instanceof com.yeelight.yeelib.device.C6119c     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r6 = "command"
            if (r4 == 0) goto L_0x01ca
            com.yeelight.yeelib.device.c r0 = (com.yeelight.yeelib.device.C6119c) r0     // Catch:{ JSONException -> 0x01e1 }
            java.util.List r0 = r0.mo31753K1()     // Catch:{ JSONException -> 0x01e1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ JSONException -> 0x01e1 }
        L_0x019a:
            boolean r1 = r0.hasNext()     // Catch:{ JSONException -> 0x01e1 }
            if (r1 == 0) goto L_0x01be
            java.lang.Object r1 = r0.next()     // Catch:{ JSONException -> 0x01e1 }
            com.yeelight.yeelib.device.base.c r1 = (com.yeelight.yeelib.device.base.C3010c) r1     // Catch:{ JSONException -> 0x01e1 }
            boolean r4 = r1 instanceof com.yeelight.yeelib.device.C6081a     // Catch:{ JSONException -> 0x01e1 }
            if (r4 == 0) goto L_0x01ab
            goto L_0x019a
        L_0x01ab:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01e1 }
            r4.<init>()     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r1 = r1.mo23185G()     // Catch:{ JSONException -> 0x01e1 }
            r4.put(r11, r1)     // Catch:{ JSONException -> 0x01e1 }
            r4.put(r6, r2)     // Catch:{ JSONException -> 0x01e1 }
            r3.put(r4)     // Catch:{ JSONException -> 0x01e1 }
            goto L_0x019a
        L_0x01be:
            int r0 = r3.length()     // Catch:{ JSONException -> 0x01e1 }
            if (r0 != 0) goto L_0x01c5
            return r5
        L_0x01c5:
            java.lang.String r0 = r3.toString()     // Catch:{ JSONException -> 0x01e1 }
            return r0
        L_0x01ca:
            java.lang.String r0 = r17.mo35358i()     // Catch:{ JSONException -> 0x01e1 }
            r1.put(r11, r0)     // Catch:{ JSONException -> 0x01e1 }
            r1.put(r6, r2)     // Catch:{ JSONException -> 0x01e1 }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x01e1 }
            r0.<init>()     // Catch:{ JSONException -> 0x01e1 }
            r0.put(r1)     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x01e1 }
            return r0
        L_0x01e1:
            r0 = move-exception
            r0.printStackTrace()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.managers.C8263d.m19483j(com.yeelight.yeelib.models.i, com.yeelight.yeelib.device.base.e):java.lang.String");
    }

    /* renamed from: t */
    public static C8263d m19484t() {
        synchronized (C8263d.class) {
            if (f14170h == null) {
                f14170h = new C8263d();
            }
        }
        return f14170h;
    }

    /* renamed from: u */
    private void m19485u() {
        HandlerThread handlerThread = new HandlerThread(f14169g);
        this.f14175e = handlerThread;
        handlerThread.start();
        this.f14176f = new C8269f(this.f14175e.getLooper());
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public boolean m19486v(JSONObject jSONObject) {
        try {
            int i = jSONObject.getInt("errno");
            String string = jSONObject.getString("errmsg");
            StringBuilder sb = new StringBuilder();
            sb.append("return code : ");
            sb.append(i);
            sb.append(" , msg = ");
            sb.append(string);
            return i == -13;
        } catch (JSONException unused) {
        }
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
        String str = this.f14173c;
        if (str != null) {
            mo35190m(str, (C8271h) null);
            this.f14173c = null;
        }
        String str2 = this.f14174d;
        if (str2 != null) {
            mo35194s(str2, (C8271h) null);
            this.f14174d = null;
        }
    }

    /* renamed from: k */
    public void mo35189k(C8316i iVar, C8271h hVar) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Execute action, device id: ");
        sb.append(iVar.mo35358i());
        sb.append(", action type: ");
        sb.append(iVar.mo35350a().name());
        sb.append(" , device type = ");
        sb.append(iVar.mo35359j());
        boolean z = false;
        if (TextUtils.isEmpty(iVar.mo35358i())) {
            int i = C8270g.f14188a[iVar.mo35350a().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("type: ");
                    sb2.append(iVar.mo35350a().name());
                    str = m19482i(true);
                } else if (i == 3) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("type: ");
                    sb3.append(iVar.mo35350a().name());
                    str = m19482i(false);
                }
                mo35190m(str, hVar);
            } else {
                mo35193p(iVar.mo35361l(), hVar);
            }
        } else {
            C3012e eVar = (C3012e) YeelightDeviceManager.m7794j0(iVar.mo35358i());
            if (eVar == null) {
                String j = iVar.mo35359j();
                if (!TextUtils.isEmpty(j)) {
                    j.hashCode();
                    if (j.equals("type_device")) {
                        switch (C8270g.f14188a[iVar.mo35350a().ordinal()]) {
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                                String j2 = m19483j(iVar, (C3012e) null);
                                if (C3051a.m7928z()) {
                                    mo35190m(j2, hVar);
                                    return;
                                } else {
                                    this.f14173c = j2;
                                    return;
                                }
                            case 14:
                                String j3 = m19483j(iVar, (C3012e) null);
                                if (C3051a.m7928z()) {
                                    mo35194s(j3, hVar);
                                    return;
                                } else {
                                    this.f14174d = j3;
                                    return;
                                }
                            case 15:
                                String j4 = m19483j(iVar, (C3012e) null);
                                if (C3051a.m7928z()) {
                                    mo35192o(j4, hVar);
                                    return;
                                }
                                return;
                        }
                    }
                }
                Iterator<C8316i> it = this.f14172b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().equals(iVar)) {
                            z = true;
                        }
                    }
                }
                if (!z) {
                    this.f14172b.add(iVar);
                }
                this.f14176f.sendEmptyMessageDelayed(1, 300);
                return;
            } else if (!(eVar instanceof C6081a)) {
                this.f14172b.remove(iVar);
                switch (C8270g.f14188a[iVar.mo35350a().ordinal()]) {
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        if (eVar instanceof C6094f) {
                            mo35191n((C6094f) eVar, iVar, hVar);
                            return;
                        } else {
                            mo35190m(m19483j(iVar, eVar), hVar);
                            return;
                        }
                    case 14:
                        mo35194s(m19483j(iVar, eVar), hVar);
                        return;
                    case 15:
                        mo35192o(m19483j(iVar, eVar), hVar);
                        return;
                    case 16:
                        eVar.mo23151n();
                        return;
                    default:
                        return;
                }
            }
        }
        LocalActionExecutor.m19455e().mo35166d(iVar, true);
    }

    /* renamed from: l */
    public void mo23300l() {
    }

    /* renamed from: m */
    public void mo35190m(String str, C8271h hVar) {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("accesstoken", C3051a.m7925r().mo23362o());
                jSONObject.put("bundleData", new JSONArray(str));
                StringBuilder sb = new StringBuilder();
                sb.append("executeOpenAppControlDevice params -> ");
                sb.append(jSONObject.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(AppUtils.f4987k);
                sb2.append("thirdparty/");
                sb2.append("yeelight-android");
                sb2.append("/control_old_devices");
                StringBuilder sb3 = new StringBuilder();
                sb3.append("executeOpenAppControlDevice URL -> ");
                sb3.append(sb2.toString());
                C3988b.m11573i(sb2.toString(), jSONObject.toString(), String.class, new C8265b(hVar), false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35191n(com.yeelight.yeelib.device.base.C6094f r12, com.yeelight.yeelib.models.C8316i r13, com.yeelight.yeelib.managers.C8263d.C8271h r14) {
        /*
            r11 = this;
            if (r12 != 0) goto L_0x0003
            return
        L_0x0003:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = ""
            int[] r2 = com.yeelight.yeelib.managers.C8263d.C8270g.f14188a
            com.yeelight.yeelib.interaction.ActionType r3 = r13.mo35350a()
            int r3 = r3.ordinal()
            r2 = r2[r3]
            java.lang.String r3 = "false"
            java.lang.String r4 = "true"
            java.lang.String r5 = "setColorTemperature"
            java.lang.String r6 = "setBrightness"
            r7 = 0
            r8 = 100
            java.lang.String r9 = "onOff"
            java.lang.String r10 = "value"
            switch(r2) {
                case 5: goto L_0x00e9;
                case 6: goto L_0x00e3;
                case 7: goto L_0x00d5;
                case 8: goto L_0x00b3;
                case 9: goto L_0x0097;
                case 10: goto L_0x0064;
                case 11: goto L_0x0028;
                case 12: goto L_0x002a;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x00f2
        L_0x002a:
            java.lang.String r13 = r13.mo35363n()     // Catch:{ NumberFormatException -> 0x005d }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ NumberFormatException -> 0x005d }
            int r13 = r13.intValue()     // Catch:{ NumberFormatException -> 0x005d }
            java.lang.String r1 = r12.mo23144i1()     // Catch:{ NumberFormatException -> 0x005d }
            x3.i$a r1 = p227x3.C11972i.m30704b(r1)     // Catch:{ NumberFormatException -> 0x005d }
            if (r1 == 0) goto L_0x0054
            int r2 = r1.mo42546a()     // Catch:{ NumberFormatException -> 0x005d }
            if (r13 <= r2) goto L_0x004a
            int r13 = r1.mo42546a()     // Catch:{ NumberFormatException -> 0x005d }
        L_0x004a:
            int r2 = r1.mo42547b()     // Catch:{ NumberFormatException -> 0x005d }
            if (r13 >= r2) goto L_0x0054
            int r13 = r1.mo42547b()     // Catch:{ NumberFormatException -> 0x005d }
        L_0x0054:
            r0.put(r10, r13)     // Catch:{ JSONException -> 0x0058 }
            goto L_0x0061
        L_0x0058:
            r13 = move-exception
            r13.printStackTrace()     // Catch:{ NumberFormatException -> 0x005d }
            goto L_0x0061
        L_0x005d:
            r13 = move-exception
            r13.printStackTrace()
        L_0x0061:
            r1 = r5
            goto L_0x00f2
        L_0x0064:
            java.lang.String r13 = r13.mo35356g()     // Catch:{ NumberFormatException -> 0x00f2 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ NumberFormatException -> 0x00f2 }
            int r13 = r13.intValue()     // Catch:{ NumberFormatException -> 0x00f2 }
            java.lang.String r2 = r12.mo23144i1()     // Catch:{ NumberFormatException -> 0x00f2 }
            x3.i$a r2 = p227x3.C11972i.m30704b(r2)     // Catch:{ NumberFormatException -> 0x00f2 }
            if (r2 == 0) goto L_0x008e
            int r3 = r2.mo42546a()     // Catch:{ NumberFormatException -> 0x00f2 }
            if (r13 <= r3) goto L_0x0084
            int r13 = r2.mo42546a()     // Catch:{ NumberFormatException -> 0x00f2 }
        L_0x0084:
            int r3 = r2.mo42547b()     // Catch:{ NumberFormatException -> 0x00f2 }
            if (r13 >= r3) goto L_0x008e
            int r13 = r2.mo42547b()     // Catch:{ NumberFormatException -> 0x00f2 }
        L_0x008e:
            r0.put(r10, r13)     // Catch:{ JSONException -> 0x0092 }
            goto L_0x0061
        L_0x0092:
            r13 = move-exception
            r13.printStackTrace()     // Catch:{ NumberFormatException -> 0x0061 }
            goto L_0x0061
        L_0x0097:
            java.lang.String r13 = r13.mo35352c()     // Catch:{ NumberFormatException -> 0x00f2 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ NumberFormatException -> 0x00f2 }
            int r13 = r13.intValue()     // Catch:{ NumberFormatException -> 0x00f2 }
            if (r13 <= r8) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            r8 = r13
        L_0x00a7:
            if (r8 >= 0) goto L_0x00aa
            r8 = 0
        L_0x00aa:
            r0.put(r10, r8)     // Catch:{ JSONException -> 0x00ae }
            goto L_0x00d3
        L_0x00ae:
            r13 = move-exception
            r13.printStackTrace()     // Catch:{ NumberFormatException -> 0x00d3 }
            goto L_0x00d3
        L_0x00b3:
            java.lang.String r13 = r13.mo35351b()     // Catch:{ Exception -> 0x00cf }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x00cf }
            int r13 = r13.intValue()     // Catch:{ Exception -> 0x00cf }
            if (r13 <= r8) goto L_0x00c2
            goto L_0x00c3
        L_0x00c2:
            r8 = r13
        L_0x00c3:
            if (r8 >= 0) goto L_0x00c6
            r8 = 0
        L_0x00c6:
            r0.put(r10, r8)     // Catch:{ JSONException -> 0x00ca }
            goto L_0x00d3
        L_0x00ca:
            r13 = move-exception
            r13.printStackTrace()     // Catch:{ Exception -> 0x00cf }
            goto L_0x00d3
        L_0x00cf:
            r13 = move-exception
            r13.printStackTrace()
        L_0x00d3:
            r1 = r6
            goto L_0x00f2
        L_0x00d5:
            boolean r13 = r12.mo23146k1()
            if (r13 == 0) goto L_0x00dc
            goto L_0x00dd
        L_0x00dc:
            r3 = r4
        L_0x00dd:
            r0.put(r10, r3)     // Catch:{ JSONException -> 0x00e1 }
            goto L_0x00f1
        L_0x00e1:
            r13 = move-exception
            goto L_0x00ee
        L_0x00e3:
            r0.put(r10, r3)     // Catch:{ JSONException -> 0x00e7 }
            goto L_0x00f1
        L_0x00e7:
            r13 = move-exception
            goto L_0x00ee
        L_0x00e9:
            r0.put(r10, r4)     // Catch:{ JSONException -> 0x00ed }
            goto L_0x00f1
        L_0x00ed:
            r13 = move-exception
        L_0x00ee:
            r13.printStackTrace()
        L_0x00f1:
            r1 = r9
        L_0x00f2:
            com.mi.iot.common.abstractdevice.AbstractDevice r13 = r12.mo31697E1()
            com.mi.iot.common.instance.Device r13 = r13.getDevice()
            com.mi.iot.common.urn.UrnType r13 = r13.getDeviceType()
            java.lang.String r2 = "accesstoken"
            com.yeelight.yeelib.managers.a r3 = com.yeelight.yeelib.managers.C3051a.m7925r()     // Catch:{ Exception -> 0x018d }
            java.lang.String r3 = r3.mo23362o()     // Catch:{ Exception -> 0x018d }
            r0.put(r2, r3)     // Catch:{ Exception -> 0x018d }
            java.lang.String r2 = "did"
            java.lang.String r12 = r12.mo23185G()     // Catch:{ Exception -> 0x018d }
            r0.put(r2, r12)     // Catch:{ Exception -> 0x018d }
            java.lang.String r12 = "type"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018d }
            r2.<init>()     // Catch:{ Exception -> 0x018d }
            java.lang.String r3 = r13.toString()     // Catch:{ Exception -> 0x018d }
            r2.append(r3)     // Catch:{ Exception -> 0x018d }
            java.lang.String r3 = ":"
            r2.append(r3)     // Catch:{ Exception -> 0x018d }
            java.lang.String r13 = r13.getVersion()     // Catch:{ Exception -> 0x018d }
            r2.append(r13)     // Catch:{ Exception -> 0x018d }
            java.lang.String r13 = ":0000C802"
            r2.append(r13)     // Catch:{ Exception -> 0x018d }
            java.lang.String r13 = r2.toString()     // Catch:{ Exception -> 0x018d }
            r0.put(r12, r13)     // Catch:{ Exception -> 0x018d }
            java.lang.String r12 = "action"
            r0.put(r12, r1)     // Catch:{ Exception -> 0x018d }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "executeOpenHomeControlDevice params -> "
            r12.append(r13)
            java.lang.String r13 = r0.toString()
            r12.append(r13)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = com.yeelight.yeelib.utils.AppUtils.f4987k
            r12.append(r13)
            java.lang.String r13 = "thirdparty/"
            r12.append(r13)
            java.lang.String r13 = "yeelight-android"
            r12.append(r13)
            java.lang.String r13 = "/control_device"
            r12.append(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r1 = "executeOpenHomeControlDevice URL -> "
            r13.append(r1)
            java.lang.String r1 = r12.toString()
            r13.append(r1)
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = r0.toString()
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            com.yeelight.yeelib.managers.d$c r1 = new com.yeelight.yeelib.managers.d$c
            r1.<init>(r14)
            p129b4.C3988b.m11573i(r12, r13, r0, r1, r7)
            return
        L_0x018d:
            r12 = move-exception
            r12.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.managers.C8263d.mo35191n(com.yeelight.yeelib.device.base.f, com.yeelight.yeelib.models.i, com.yeelight.yeelib.managers.d$h):void");
    }

    /* renamed from: o */
    public void mo35192o(String str, C8271h hVar) {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("accesstoken", C3051a.m7925r().mo23362o());
                jSONObject.put("userSceneData", new JSONArray(str));
                StringBuilder sb = new StringBuilder();
                sb.append("executeRecommendScene params -> ");
                sb.append(jSONObject.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(AppUtils.f4987k);
                sb2.append("thirdparty/");
                sb2.append("yeelight-android");
                sb2.append("/recommend_scene_execute");
                StringBuilder sb3 = new StringBuilder();
                sb3.append("executeRecommendScene URL -> ");
                sb3.append(sb2.toString());
                C3988b.m11573i(sb2.toString(), jSONObject.toString(), String.class, new C8268e(hVar), false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: p */
    public void mo35193p(String str, C8271h hVar) {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("accesstoken", C3051a.m7925r().mo23362o());
                jSONObject.put("id", Integer.valueOf(str));
                StringBuilder sb = new StringBuilder();
                sb.append("executeScene params -> ");
                sb.append(jSONObject.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(AppUtils.f4987k);
                sb2.append("thirdparty/");
                sb2.append("yeelight-android");
                sb2.append("/scene_execute");
                StringBuilder sb3 = new StringBuilder();
                sb3.append("executeScene URL -> ");
                sb3.append(sb2.toString());
                C3988b.m11573i(sb2.toString(), jSONObject.toString(), String.class, new C8264a(hVar), false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: q */
    public void mo23308q(String str) {
    }

    /* renamed from: r */
    public void mo23310r(String str) {
    }

    /* renamed from: s */
    public void mo35194s(String str, C8271h hVar) {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("accesstoken", C3051a.m7925r().mo23362o());
                jSONObject.put("userSceneData", new JSONArray(str));
                StringBuilder sb = new StringBuilder();
                sb.append("executeUserScene params -> ");
                sb.append(jSONObject.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(AppUtils.f4987k);
                sb2.append("thirdparty/");
                sb2.append("yeelight-android");
                sb2.append("/user_scene_execute");
                StringBuilder sb3 = new StringBuilder();
                sb3.append("executeUserScene URL -> ");
                sb3.append(sb2.toString());
                C3988b.m11573i(sb2.toString(), jSONObject.toString(), String.class, new C8267d(hVar), false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

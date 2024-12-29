package com.yeelight.yeelib.p152f;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.miot.api.Constants;
import com.yeelight.yeelib.p150c.C5972a;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p153g.C9840j;
import com.yeelight.yeelib.p187h.C9862d;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import com.yeelight.yeelib.utils.C4308b;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.f.d */
public class C9775d implements C4201a.C4202i {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String f17675g = "d";

    /* renamed from: h */
    private static C9775d f17676h;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f17677a = 0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<C9840j> f17678b;

    /* renamed from: c */
    private String f17679c = null;

    /* renamed from: d */
    private String f17680d = null;

    /* renamed from: e */
    private HandlerThread f17681e;

    /* renamed from: f */
    private Handler f17682f;

    /* renamed from: com.yeelight.yeelib.f.d$a */
    class C9776a implements C9874b<String> {

        /* renamed from: a */
        final /* synthetic */ C9783h f17683a;

        C9776a(C9783h hVar) {
            this.f17683a = hVar;
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            String unused = C9775d.f17675g;
            "executeScene onSuccess " + str;
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getInt("code") == 1) {
                    String unused2 = C9775d.f17675g;
                    if (C9775d.this.m23686v(jSONObject.getJSONArray("result").getJSONObject(0)) && this.f17683a != null) {
                        this.f17683a.tokenOauthFailed();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            String unused = C9775d.f17675g;
            "executeScene onFailure, e = " + str;
        }
    }

    /* renamed from: com.yeelight.yeelib.f.d$b */
    class C9777b implements C9874b<String> {

        /* renamed from: a */
        final /* synthetic */ C9783h f17685a;

        C9777b(C9783h hVar) {
            this.f17685a = hVar;
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            String unused = C9775d.f17675g;
            "executeOpenAppControlDevice onSuccess " + str;
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getInt("code") == 1) {
                    String unused2 = C9775d.f17675g;
                    if (C9775d.this.m23686v(jSONObject.getJSONArray("result").getJSONObject(0)) && this.f17685a != null) {
                        this.f17685a.tokenOauthFailed();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            String unused = C9775d.f17675g;
            "executeOpenAppControlDevice onFailure, e = " + str;
        }
    }

    /* renamed from: com.yeelight.yeelib.f.d$c */
    class C9778c implements C9874b<String> {

        /* renamed from: a */
        final /* synthetic */ C9783h f17687a;

        C9778c(C9783h hVar) {
            this.f17687a = hVar;
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            String unused = C9775d.f17675g;
            "executeOpenHomeControlDevice onSuccess " + str;
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getInt("code") == 1) {
                    String unused2 = C9775d.f17675g;
                    if (C9775d.this.m23686v(jSONObject.getJSONArray("result").getJSONObject(0)) && this.f17687a != null) {
                        this.f17687a.tokenOauthFailed();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            String unused = C9775d.f17675g;
            "executeOpenHomeControlDevice onFailure, e = " + str;
        }
    }

    /* renamed from: com.yeelight.yeelib.f.d$d */
    class C9779d implements C9874b<String> {

        /* renamed from: a */
        final /* synthetic */ C9783h f17689a;

        C9779d(C9783h hVar) {
            this.f17689a = hVar;
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            String unused = C9775d.f17675g;
            "executeUserScene onSuccess " + str;
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getInt("code") == 1) {
                    String unused2 = C9775d.f17675g;
                    if (C9775d.this.m23686v(jSONObject.getJSONArray("result").getJSONObject(0)) && this.f17689a != null) {
                        this.f17689a.tokenOauthFailed();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            String unused = C9775d.f17675g;
            "executeUserScene onFailure, e = " + str;
        }
    }

    /* renamed from: com.yeelight.yeelib.f.d$e */
    class C9780e implements C9874b<String> {

        /* renamed from: a */
        final /* synthetic */ C9783h f17691a;

        C9780e(C9783h hVar) {
            this.f17691a = hVar;
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            String unused = C9775d.f17675g;
            "executeRecommendScene onSuccess " + str;
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getInt("code") == 1) {
                    String unused2 = C9775d.f17675g;
                    if (C9775d.this.m23686v(jSONObject.getJSONArray("result").getJSONObject(0)) && this.f17691a != null) {
                        this.f17691a.tokenOauthFailed();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            String unused = C9775d.f17675g;
            "executeRecommendScene onFailure, e = " + str;
        }
    }

    /* renamed from: com.yeelight.yeelib.f.d$f */
    class C9781f extends Handler {
        C9781f(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what == 1 && C9775d.this.f17677a <= 20) {
                for (C9840j k : C9775d.this.f17678b) {
                    C9775d.this.mo31613k(k, (C9783h) null);
                    C9775d.m23680e(C9775d.this);
                }
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.f.d$g */
    static /* synthetic */ class C9782g {

        /* renamed from: a */
        static final /* synthetic */ int[] f17694a;

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
                com.yeelight.yeelib.d.a[] r0 = com.yeelight.yeelib.p185d.C7563a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17694a = r0
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.SCENE_BUNDLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17694a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.TURN_ON_ALL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f17694a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.TURN_OFF_ALL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f17694a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.COMMAND     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f17694a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.ON     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f17694a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.OFF     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f17694a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.TOGGLE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f17694a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.BRIGHT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f17694a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.BRIGHT_VARIABLE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f17694a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.CT_VARIABLE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f17694a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.COLOR_VARIABLE     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f17694a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.CT     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f17694a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.COLOR     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f17694a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.SCENE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f17694a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.RECOMMEND_SCENE     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f17694a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.CONNECT     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f17694a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.LAUNCH     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f17694a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.MODE     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = f17694a     // Catch:{ NoSuchFieldError -> 0x00e4 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.DIMMER     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = f17694a     // Catch:{ NoSuchFieldError -> 0x00f0 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.BRIGHT_UP     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = f17694a     // Catch:{ NoSuchFieldError -> 0x00fc }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.BRIGHT_DOWN     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p152f.C9775d.C9782g.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.f.d$h */
    public interface C9783h {
        void tokenOauthFailed();
    }

    private C9775d() {
        m23685u();
        this.f17678b = new CopyOnWriteArrayList();
        C4201a.m11607r().mo23444M(this);
    }

    /* renamed from: e */
    static /* synthetic */ int m23680e(C9775d dVar) {
        int i = dVar.f17677a;
        dVar.f17677a = i + 1;
        return i;
    }

    /* renamed from: h */
    private String m23682h(boolean z) {
        String str = z ? "on" : "off";
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray2 = new JSONArray();
            jSONArray.put(str);
            jSONObject.put("method", "set_power");
            jSONObject.put("params", jSONArray);
            for (C4198d next : C4257w.m11947l0().mo23688t0()) {
                if (!(next instanceof C5972a)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("did", next.mo23372G());
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
    private java.lang.String m23683j(com.yeelight.yeelib.p153g.C9840j r17, com.yeelight.yeelib.p150c.p151i.C4200i r18) {
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
            int[] r6 = com.yeelight.yeelib.p152f.C9775d.C9782g.f17694a     // Catch:{ JSONException -> 0x01e1 }
            com.yeelight.yeelib.d.a r7 = r17.mo31763a()     // Catch:{ JSONException -> 0x01e1 }
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
            java.lang.String r2 = r17.mo31775m()     // Catch:{ NumberFormatException -> 0x009d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x009d }
            int r2 = r2.intValue()     // Catch:{ NumberFormatException -> 0x009d }
            boolean r4 = r0 instanceof com.yeelight.yeelib.p150c.C5980c     // Catch:{ NumberFormatException -> 0x009d }
            java.lang.String r6 = "scene_id"
            if (r4 == 0) goto L_0x0086
            com.yeelight.yeelib.c.c r0 = (com.yeelight.yeelib.p150c.C5980c) r0     // Catch:{ NumberFormatException -> 0x009d }
            java.util.List r0 = r0.mo27498K1()     // Catch:{ NumberFormatException -> 0x009d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ NumberFormatException -> 0x009d }
        L_0x0056:
            boolean r1 = r0.hasNext()     // Catch:{ NumberFormatException -> 0x009d }
            if (r1 == 0) goto L_0x007a
            java.lang.Object r1 = r0.next()     // Catch:{ NumberFormatException -> 0x009d }
            com.yeelight.yeelib.c.i.d r1 = (com.yeelight.yeelib.p150c.p151i.C4198d) r1     // Catch:{ NumberFormatException -> 0x009d }
            boolean r4 = r1 instanceof com.yeelight.yeelib.p150c.C5972a     // Catch:{ NumberFormatException -> 0x009d }
            if (r4 == 0) goto L_0x0067
            goto L_0x0056
        L_0x0067:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ NumberFormatException -> 0x009d }
            r4.<init>()     // Catch:{ NumberFormatException -> 0x009d }
            java.lang.String r1 = r1.mo23372G()     // Catch:{ NumberFormatException -> 0x009d }
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
            java.lang.String r0 = r17.mo31771i()     // Catch:{ NumberFormatException -> 0x009d }
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
            java.lang.String r6 = r17.mo31766d()     // Catch:{ NumberFormatException -> 0x018a }
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
            java.lang.String r6 = r17.mo31776n()     // Catch:{ NumberFormatException -> 0x018a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ NumberFormatException -> 0x018a }
            r4.put(r6)     // Catch:{ NumberFormatException -> 0x018a }
            r4.put(r13)     // Catch:{ NumberFormatException -> 0x018a }
            r4.put(r12)     // Catch:{ NumberFormatException -> 0x018a }
            r2.put(r15, r7)     // Catch:{ NumberFormatException -> 0x018a }
            goto L_0x00ba
        L_0x00d4:
            java.lang.String r6 = r17.mo31767e()     // Catch:{ NumberFormatException -> 0x018a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ NumberFormatException -> 0x018a }
            r4.put(r6)     // Catch:{ NumberFormatException -> 0x018a }
            r4.put(r13)     // Catch:{ NumberFormatException -> 0x018a }
            r4.put(r12)     // Catch:{ NumberFormatException -> 0x018a }
            r2.put(r15, r8)     // Catch:{ NumberFormatException -> 0x018a }
            goto L_0x00ba
        L_0x00e9:
            java.lang.String r6 = r17.mo31769g()     // Catch:{ NumberFormatException -> 0x018a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ NumberFormatException -> 0x018a }
            int r6 = r6.intValue()     // Catch:{ NumberFormatException -> 0x018a }
            if (r0 == 0) goto L_0x0115
            java.lang.String r8 = r18.mo23330i1()     // Catch:{ NumberFormatException -> 0x018a }
            com.yeelight.yeelib.device.models.k$a r8 = com.yeelight.yeelib.device.models.C7632k.m22541b(r8)     // Catch:{ NumberFormatException -> 0x018a }
            if (r8 == 0) goto L_0x0115
            int r9 = r8.mo29079a()     // Catch:{ NumberFormatException -> 0x018a }
            if (r6 <= r9) goto L_0x010b
            int r6 = r8.mo29079a()     // Catch:{ NumberFormatException -> 0x018a }
        L_0x010b:
            int r9 = r8.mo29080b()     // Catch:{ NumberFormatException -> 0x018a }
            if (r6 >= r9) goto L_0x0115
            int r6 = r8.mo29080b()     // Catch:{ NumberFormatException -> 0x018a }
        L_0x0115:
            r4.put(r6)     // Catch:{ NumberFormatException -> 0x018a }
            r4.put(r13)     // Catch:{ NumberFormatException -> 0x018a }
            r4.put(r12)     // Catch:{ NumberFormatException -> 0x018a }
            r2.put(r15, r7)     // Catch:{ NumberFormatException -> 0x018a }
            goto L_0x00ba
        L_0x0122:
            java.lang.String r6 = r17.mo31765c()     // Catch:{ NumberFormatException -> 0x018a }
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
            java.lang.String r6 = r17.mo31764b()     // Catch:{ NumberFormatException -> 0x018a }
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
            org.json.JSONObject r4 = r17.mo31768f()     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r4 = r4.getString(r15)     // Catch:{ JSONException -> 0x01e1 }
            r2.put(r15, r4)     // Catch:{ JSONException -> 0x01e1 }
            org.json.JSONObject r4 = r17.mo31768f()     // Catch:{ JSONException -> 0x01e1 }
            org.json.JSONArray r4 = r4.getJSONArray(r14)     // Catch:{ JSONException -> 0x01e1 }
            goto L_0x0160
        L_0x018a:
            boolean r4 = r0 instanceof com.yeelight.yeelib.p150c.C5980c     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r6 = "command"
            if (r4 == 0) goto L_0x01ca
            com.yeelight.yeelib.c.c r0 = (com.yeelight.yeelib.p150c.C5980c) r0     // Catch:{ JSONException -> 0x01e1 }
            java.util.List r0 = r0.mo27498K1()     // Catch:{ JSONException -> 0x01e1 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ JSONException -> 0x01e1 }
        L_0x019a:
            boolean r1 = r0.hasNext()     // Catch:{ JSONException -> 0x01e1 }
            if (r1 == 0) goto L_0x01be
            java.lang.Object r1 = r0.next()     // Catch:{ JSONException -> 0x01e1 }
            com.yeelight.yeelib.c.i.d r1 = (com.yeelight.yeelib.p150c.p151i.C4198d) r1     // Catch:{ JSONException -> 0x01e1 }
            boolean r4 = r1 instanceof com.yeelight.yeelib.p150c.C5972a     // Catch:{ JSONException -> 0x01e1 }
            if (r4 == 0) goto L_0x01ab
            goto L_0x019a
        L_0x01ab:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01e1 }
            r4.<init>()     // Catch:{ JSONException -> 0x01e1 }
            java.lang.String r1 = r1.mo23372G()     // Catch:{ JSONException -> 0x01e1 }
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
            java.lang.String r0 = r17.mo31771i()     // Catch:{ JSONException -> 0x01e1 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p152f.C9775d.m23683j(com.yeelight.yeelib.g.j, com.yeelight.yeelib.c.i.i):java.lang.String");
    }

    /* renamed from: t */
    public static C9775d m23684t() {
        synchronized (C9775d.class) {
            if (f17676h == null) {
                f17676h = new C9775d();
            }
        }
        return f17676h;
    }

    /* renamed from: u */
    private void m23685u() {
        HandlerThread handlerThread = new HandlerThread(f17675g);
        this.f17681e = handlerThread;
        handlerThread.start();
        this.f17682f = new C9781f(this.f17681e.getLooper());
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public boolean m23686v(JSONObject jSONObject) {
        try {
            int i = jSONObject.getInt("errno");
            "return code : " + i + " , msg = " + jSONObject.getString("errmsg");
            return i == -13;
        } catch (JSONException unused) {
        }
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

    /* renamed from: i */
    public void mo23460i() {
        String str = this.f17679c;
        if (str != null) {
            mo31614m(str, (C9783h) null);
            this.f17679c = null;
        }
        String str2 = this.f17680d;
        if (str2 != null) {
            mo31618s(str2, (C9783h) null);
            this.f17680d = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0113, code lost:
        if (r0.equals("type_room") == false) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x012e  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo31613k(com.yeelight.yeelib.p153g.C9840j r8, com.yeelight.yeelib.p152f.C9775d.C9783h r9) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Execute action, device id: "
            r0.append(r1)
            java.lang.String r1 = r8.mo31771i()
            r0.append(r1)
            java.lang.String r1 = ", action type: "
            r0.append(r1)
            com.yeelight.yeelib.d.a r1 = r8.mo31763a()
            java.lang.String r1 = r1.name()
            r0.append(r1)
            java.lang.String r1 = " , device type = "
            r0.append(r1)
            java.lang.String r1 = r8.mo31772j()
            r0.append(r1)
            r0.toString()
            java.lang.String r0 = r8.mo31771i()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x009c
            int[] r0 = com.yeelight.yeelib.p152f.C9775d.C9782g.f17694a
            com.yeelight.yeelib.d.a r4 = r8.mo31763a()
            int r4 = r4.ordinal()
            r0 = r0[r4]
            if (r0 == r3) goto L_0x008c
            java.lang.String r4 = "type: "
            if (r0 == r1) goto L_0x006e
            r1 = 3
            if (r0 == r1) goto L_0x0053
            goto L_0x0093
        L_0x0053:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            com.yeelight.yeelib.d.a r1 = r8.mo31763a()
            java.lang.String r1 = r1.name()
            r0.append(r1)
            r0.toString()
            java.lang.String r0 = r7.m23682h(r2)
            goto L_0x0088
        L_0x006e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            com.yeelight.yeelib.d.a r1 = r8.mo31763a()
            java.lang.String r1 = r1.name()
            r0.append(r1)
            r0.toString()
            java.lang.String r0 = r7.m23682h(r3)
        L_0x0088:
            r7.mo31614m(r0, r9)
            goto L_0x0093
        L_0x008c:
            java.lang.String r0 = r8.mo31774l()
            r7.mo31617p(r0, r9)
        L_0x0093:
            com.yeelight.yeelib.f.k r9 = com.yeelight.yeelib.p152f.C9794k.m23749e()
            r9.mo31651d(r8, r3)
            goto L_0x0196
        L_0x009c:
            java.lang.String r0 = r8.mo31771i()
            com.yeelight.yeelib.c.i.d r0 = com.yeelight.yeelib.p152f.C4257w.m11945h0(r0)
            com.yeelight.yeelib.c.i.i r0 = (com.yeelight.yeelib.p150c.p151i.C4200i) r0
            if (r0 == 0) goto L_0x00ee
            boolean r1 = r0 instanceof com.yeelight.yeelib.p150c.C5972a
            if (r1 == 0) goto L_0x00ad
            goto L_0x0093
        L_0x00ad:
            java.util.List<com.yeelight.yeelib.g.j> r1 = r7.f17678b
            r1.remove(r8)
            int[] r1 = com.yeelight.yeelib.p152f.C9775d.C9782g.f17694a
            com.yeelight.yeelib.d.a r2 = r8.mo31763a()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            switch(r1) {
                case 4: goto L_0x00da;
                case 5: goto L_0x00da;
                case 6: goto L_0x00da;
                case 7: goto L_0x00da;
                case 8: goto L_0x00da;
                case 9: goto L_0x00da;
                case 10: goto L_0x00da;
                case 11: goto L_0x00da;
                case 12: goto L_0x00da;
                case 13: goto L_0x00da;
                case 14: goto L_0x00d1;
                case 15: goto L_0x00c8;
                case 16: goto L_0x00c3;
                default: goto L_0x00c1;
            }
        L_0x00c1:
            goto L_0x0196
        L_0x00c3:
            r0.mo23337n()
            goto L_0x0196
        L_0x00c8:
            java.lang.String r8 = r7.m23683j(r8, r0)
            r7.mo31616o(r8, r9)
            goto L_0x0196
        L_0x00d1:
            java.lang.String r8 = r7.m23683j(r8, r0)
            r7.mo31618s(r8, r9)
            goto L_0x0196
        L_0x00da:
            boolean r1 = r0 instanceof com.yeelight.yeelib.p150c.p151i.C6039j
            if (r1 == 0) goto L_0x00e5
            com.yeelight.yeelib.c.i.j r0 = (com.yeelight.yeelib.p150c.p151i.C6039j) r0
            r7.mo31615n(r0, r8, r9)
            goto L_0x0196
        L_0x00e5:
            java.lang.String r8 = r7.m23683j(r8, r0)
            r7.mo31614m(r8, r9)
            goto L_0x0196
        L_0x00ee:
            java.lang.String r0 = r8.mo31772j()
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x016f
            r4 = -1
            int r5 = r0.hashCode()
            r6 = -1091168966(0xffffffffbef6153a, float:-0.4806307)
            if (r5 == r6) goto L_0x0120
            r6 = 435803899(0x19f9d6fb, float:2.5832826E-23)
            if (r5 == r6) goto L_0x0116
            r6 = 519315136(0x1ef41ec0, float:2.5847223E-20)
            if (r5 == r6) goto L_0x010d
            goto L_0x012a
        L_0x010d:
            java.lang.String r5 = "type_room"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x012a
            goto L_0x012b
        L_0x0116:
            java.lang.String r1 = "type_device"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x012a
            r1 = 0
            goto L_0x012b
        L_0x0120:
            java.lang.String r1 = "type_group"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x012a
            r1 = 1
            goto L_0x012b
        L_0x012a:
            r1 = -1
        L_0x012b:
            if (r1 == 0) goto L_0x012e
            goto L_0x016f
        L_0x012e:
            int[] r0 = com.yeelight.yeelib.p152f.C9775d.C9782g.f17694a
            com.yeelight.yeelib.d.a r1 = r8.mo31763a()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 0
            switch(r0) {
                case 4: goto L_0x015e;
                case 5: goto L_0x015e;
                case 6: goto L_0x015e;
                case 7: goto L_0x015e;
                case 8: goto L_0x015e;
                case 9: goto L_0x015e;
                case 10: goto L_0x015e;
                case 11: goto L_0x015e;
                case 12: goto L_0x015e;
                case 13: goto L_0x015e;
                case 14: goto L_0x014d;
                case 15: goto L_0x013f;
                default: goto L_0x013e;
            }
        L_0x013e:
            goto L_0x016f
        L_0x013f:
            java.lang.String r8 = r7.m23683j(r8, r1)
            boolean r0 = com.yeelight.yeelib.p152f.C4201a.m11610z()
            if (r0 == 0) goto L_0x014c
            r7.mo31616o(r8, r9)
        L_0x014c:
            return
        L_0x014d:
            java.lang.String r8 = r7.m23683j(r8, r1)
            boolean r0 = com.yeelight.yeelib.p152f.C4201a.m11610z()
            if (r0 == 0) goto L_0x015b
            r7.mo31618s(r8, r9)
            goto L_0x015d
        L_0x015b:
            r7.f17680d = r8
        L_0x015d:
            return
        L_0x015e:
            java.lang.String r8 = r7.m23683j(r8, r1)
            boolean r0 = com.yeelight.yeelib.p152f.C4201a.m11610z()
            if (r0 == 0) goto L_0x016c
            r7.mo31614m(r8, r9)
            goto L_0x016e
        L_0x016c:
            r7.f17679c = r8
        L_0x016e:
            return
        L_0x016f:
            java.util.List<com.yeelight.yeelib.g.j> r9 = r7.f17678b
            java.util.Iterator r9 = r9.iterator()
        L_0x0175:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0188
            java.lang.Object r0 = r9.next()
            com.yeelight.yeelib.g.j r0 = (com.yeelight.yeelib.p153g.C9840j) r0
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0175
            r2 = 1
        L_0x0188:
            if (r2 != 0) goto L_0x018f
            java.util.List<com.yeelight.yeelib.g.j> r9 = r7.f17678b
            r9.add(r8)
        L_0x018f:
            android.os.Handler r8 = r7.f17682f
            r0 = 300(0x12c, double:1.48E-321)
            r8.sendEmptyMessageDelayed(r3, r0)
        L_0x0196:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p152f.C9775d.mo31613k(com.yeelight.yeelib.g.j, com.yeelight.yeelib.f.d$h):void");
    }

    /* renamed from: l */
    public void mo23461l() {
    }

    /* renamed from: m */
    public void mo31614m(String str, C9783h hVar) {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("accesstoken", C4201a.m11607r().mo23448o());
                jSONObject.put("bundleData", new JSONArray(str));
                "executeOpenAppControlDevice params -> " + jSONObject.toString();
                StringBuilder sb = new StringBuilder();
                sb.append(C4308b.f7490i);
                sb.append("thirdparty/");
                sb.append("yeelight-android");
                sb.append("/control_old_devices");
                "executeOpenAppControlDevice URL -> " + sb.toString();
                C9862d.m24139i(sb.toString(), jSONObject.toString(), String.class, new C9777b(hVar), false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo31615n(com.yeelight.yeelib.p150c.p151i.C6039j r12, com.yeelight.yeelib.p153g.C9840j r13, com.yeelight.yeelib.p152f.C9775d.C9783h r14) {
        /*
            r11 = this;
            if (r12 != 0) goto L_0x0003
            return
        L_0x0003:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = ""
            int[] r2 = com.yeelight.yeelib.p152f.C9775d.C9782g.f17694a
            com.yeelight.yeelib.d.a r3 = r13.mo31763a()
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
            java.lang.String r13 = r13.mo31776n()     // Catch:{ NumberFormatException -> 0x005d }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ NumberFormatException -> 0x005d }
            int r13 = r13.intValue()     // Catch:{ NumberFormatException -> 0x005d }
            java.lang.String r1 = r12.mo23330i1()     // Catch:{ NumberFormatException -> 0x005d }
            com.yeelight.yeelib.device.models.k$a r1 = com.yeelight.yeelib.device.models.C7632k.m22541b(r1)     // Catch:{ NumberFormatException -> 0x005d }
            if (r1 == 0) goto L_0x0054
            int r2 = r1.mo29079a()     // Catch:{ NumberFormatException -> 0x005d }
            if (r13 <= r2) goto L_0x004a
            int r13 = r1.mo29079a()     // Catch:{ NumberFormatException -> 0x005d }
        L_0x004a:
            int r2 = r1.mo29080b()     // Catch:{ NumberFormatException -> 0x005d }
            if (r13 >= r2) goto L_0x0054
            int r13 = r1.mo29080b()     // Catch:{ NumberFormatException -> 0x005d }
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
            java.lang.String r13 = r13.mo31769g()     // Catch:{ NumberFormatException -> 0x00f2 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ NumberFormatException -> 0x00f2 }
            int r13 = r13.intValue()     // Catch:{ NumberFormatException -> 0x00f2 }
            java.lang.String r2 = r12.mo23330i1()     // Catch:{ NumberFormatException -> 0x00f2 }
            com.yeelight.yeelib.device.models.k$a r2 = com.yeelight.yeelib.device.models.C7632k.m22541b(r2)     // Catch:{ NumberFormatException -> 0x00f2 }
            if (r2 == 0) goto L_0x008e
            int r3 = r2.mo29079a()     // Catch:{ NumberFormatException -> 0x00f2 }
            if (r13 <= r3) goto L_0x0084
            int r13 = r2.mo29079a()     // Catch:{ NumberFormatException -> 0x00f2 }
        L_0x0084:
            int r3 = r2.mo29080b()     // Catch:{ NumberFormatException -> 0x00f2 }
            if (r13 >= r3) goto L_0x008e
            int r13 = r2.mo29080b()     // Catch:{ NumberFormatException -> 0x00f2 }
        L_0x008e:
            r0.put(r10, r13)     // Catch:{ JSONException -> 0x0092 }
            goto L_0x0061
        L_0x0092:
            r13 = move-exception
            r13.printStackTrace()     // Catch:{ NumberFormatException -> 0x0061 }
            goto L_0x0061
        L_0x0097:
            java.lang.String r13 = r13.mo31765c()     // Catch:{ NumberFormatException -> 0x00f2 }
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
            java.lang.String r13 = r13.mo31764b()     // Catch:{ Exception -> 0x00cf }
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
            boolean r13 = r12.mo23332k1()
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
            com.mi.iot.common.abstractdevice.AbstractDevice r13 = r12.mo27787E1()
            com.mi.iot.common.instance.Device r13 = r13.getDevice()
            com.mi.iot.common.urn.UrnType r13 = r13.getDeviceType()
            java.lang.String r2 = "accesstoken"
            com.yeelight.yeelib.f.a r3 = com.yeelight.yeelib.p152f.C4201a.m11607r()     // Catch:{ Exception -> 0x0193 }
            java.lang.String r3 = r3.mo23448o()     // Catch:{ Exception -> 0x0193 }
            r0.put(r2, r3)     // Catch:{ Exception -> 0x0193 }
            java.lang.String r2 = "did"
            java.lang.String r12 = r12.mo23372G()     // Catch:{ Exception -> 0x0193 }
            r0.put(r2, r12)     // Catch:{ Exception -> 0x0193 }
            java.lang.String r12 = "type"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0193 }
            r2.<init>()     // Catch:{ Exception -> 0x0193 }
            java.lang.String r3 = r13.toString()     // Catch:{ Exception -> 0x0193 }
            r2.append(r3)     // Catch:{ Exception -> 0x0193 }
            java.lang.String r3 = ":"
            r2.append(r3)     // Catch:{ Exception -> 0x0193 }
            java.lang.String r13 = r13.getVersion()     // Catch:{ Exception -> 0x0193 }
            r2.append(r13)     // Catch:{ Exception -> 0x0193 }
            java.lang.String r13 = ":0000C802"
            r2.append(r13)     // Catch:{ Exception -> 0x0193 }
            java.lang.String r13 = r2.toString()     // Catch:{ Exception -> 0x0193 }
            r0.put(r12, r13)     // Catch:{ Exception -> 0x0193 }
            java.lang.String r12 = "action"
            r0.put(r12, r1)     // Catch:{ Exception -> 0x0193 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "executeOpenHomeControlDevice params -> "
            r12.append(r13)
            java.lang.String r13 = r0.toString()
            r12.append(r13)
            r12.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = com.yeelight.yeelib.utils.C4308b.f7490i
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
            r13.toString()
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = r0.toString()
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            com.yeelight.yeelib.f.d$c r1 = new com.yeelight.yeelib.f.d$c
            r1.<init>(r14)
            com.yeelight.yeelib.p187h.C9862d.m24139i(r12, r13, r0, r1, r7)
            return
        L_0x0193:
            r12 = move-exception
            r12.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p152f.C9775d.mo31615n(com.yeelight.yeelib.c.i.j, com.yeelight.yeelib.g.j, com.yeelight.yeelib.f.d$h):void");
    }

    /* renamed from: o */
    public void mo31616o(String str, C9783h hVar) {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("accesstoken", C4201a.m11607r().mo23448o());
                jSONObject.put("userSceneData", new JSONArray(str));
                "executeRecommendScene params -> " + jSONObject.toString();
                StringBuilder sb = new StringBuilder();
                sb.append(C4308b.f7490i);
                sb.append("thirdparty/");
                sb.append("yeelight-android");
                sb.append("/recommend_scene_execute");
                "executeRecommendScene URL -> " + sb.toString();
                C9862d.m24139i(sb.toString(), jSONObject.toString(), String.class, new C9780e(hVar), false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: p */
    public void mo31617p(String str, C9783h hVar) {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("accesstoken", C4201a.m11607r().mo23448o());
                jSONObject.put("id", Integer.valueOf(str));
                "executeScene params -> " + jSONObject.toString();
                StringBuilder sb = new StringBuilder();
                sb.append(C4308b.f7490i);
                sb.append("thirdparty/");
                sb.append("yeelight-android");
                sb.append("/scene_execute");
                "executeScene URL -> " + sb.toString();
                C9862d.m24139i(sb.toString(), jSONObject.toString(), String.class, new C9776a(hVar), false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: q */
    public void mo23462q(String str) {
    }

    /* renamed from: r */
    public void mo23463r(String str) {
    }

    /* renamed from: s */
    public void mo31618s(String str, C9783h hVar) {
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("accesstoken", C4201a.m11607r().mo23448o());
                jSONObject.put("userSceneData", new JSONArray(str));
                "executeUserScene params -> " + jSONObject.toString();
                StringBuilder sb = new StringBuilder();
                sb.append(C4308b.f7490i);
                sb.append("thirdparty/");
                sb.append("yeelight-android");
                sb.append("/user_scene_execute");
                "executeUserScene URL -> " + sb.toString();
                C9862d.m24139i(sb.toString(), jSONObject.toString(), String.class, new C9779d(hVar), false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

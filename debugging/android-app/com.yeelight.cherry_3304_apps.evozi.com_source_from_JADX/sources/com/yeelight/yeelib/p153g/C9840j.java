package com.yeelight.yeelib.p153g;

import com.yeelight.yeelib.p185d.C7563a;
import com.yeelight.yeelib.utils.C4308b;
import com.yeelight.yeelib.utils.C4310h;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.g.j */
public class C9840j {

    /* renamed from: o */
    private static final String f17815o = "j";

    /* renamed from: a */
    private String f17816a;

    /* renamed from: b */
    private String f17817b;

    /* renamed from: c */
    private C7563a f17818c;

    /* renamed from: d */
    private String f17819d;

    /* renamed from: e */
    private String f17820e;

    /* renamed from: f */
    private String f17821f;

    /* renamed from: g */
    private String f17822g;

    /* renamed from: h */
    private String f17823h;

    /* renamed from: i */
    private String f17824i;

    /* renamed from: j */
    private String f17825j;

    /* renamed from: k */
    private String f17826k;

    /* renamed from: l */
    private String f17827l;

    /* renamed from: m */
    private JSONObject f17828m;

    /* renamed from: n */
    private int f17829n = -1;

    /* renamed from: com.yeelight.yeelib.g.j$a */
    static /* synthetic */ class C9841a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17830a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.yeelight.yeelib.d.a[] r0 = com.yeelight.yeelib.p185d.C7563a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17830a = r0
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.SCENE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17830a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.RECOMMEND_SCENE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f17830a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.SCENE_BUNDLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f17830a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.BRIGHT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f17830a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.BRIGHT_VARIABLE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f17830a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.CT_VARIABLE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f17830a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.COLOR_VARIABLE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f17830a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.COMMAND     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f17830a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.CT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f17830a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.COLOR     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p153g.C9840j.C9841a.<clinit>():void");
        }
    }

    public C9840j(String str) {
        this.f17817b = str;
        this.f17818c = C7563a.COMMAND;
    }

    public C9840j(String str, String str2, C7563a aVar, String str3) {
        this.f17816a = str;
        this.f17817b = str2;
        this.f17818c = aVar;
        switch (C9841a.f17830a[aVar.ordinal()]) {
            case 1:
            case 2:
                this.f17820e = str3;
                return;
            case 3:
                this.f17821f = str3;
                return;
            case 4:
                this.f17822g = str3;
                return;
            case 5:
                this.f17823h = str3;
                return;
            case 6:
                this.f17824i = str3;
                return;
            case 7:
                this.f17825j = str3;
                return;
            case 8:
                try {
                    this.f17828m = new JSONObject(str3);
                    return;
                } catch (JSONException unused) {
                    this.f17828m = null;
                    String str4 = f17815o;
                    C4310h.m12146b(new C4308b.C4309a(str4, "Invalid device action param: " + str3));
                    return;
                }
            case 9:
                this.f17826k = str3;
                return;
            case 10:
                this.f17827l = str3;
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public C7563a mo31763a() {
        return this.f17818c;
    }

    /* renamed from: b */
    public String mo31764b() {
        return this.f17822g;
    }

    /* renamed from: c */
    public String mo31765c() {
        return this.f17823h;
    }

    /* renamed from: d */
    public String mo31766d() {
        return this.f17827l;
    }

    /* renamed from: e */
    public String mo31767e() {
        return this.f17825j;
    }

    /* renamed from: f */
    public JSONObject mo31768f() {
        return this.f17828m;
    }

    /* renamed from: g */
    public String mo31769g() {
        return this.f17824i;
    }

    /* renamed from: h */
    public int mo31770h() {
        return this.f17829n;
    }

    /* renamed from: i */
    public String mo31771i() {
        return this.f17817b;
    }

    /* renamed from: j */
    public String mo31772j() {
        return this.f17816a;
    }

    /* renamed from: k */
    public String mo31773k() {
        return this.f17819d;
    }

    /* renamed from: l */
    public String mo31774l() {
        return this.f17821f;
    }

    /* renamed from: m */
    public String mo31775m() {
        return this.f17820e;
    }

    /* renamed from: n */
    public String mo31776n() {
        return this.f17826k;
    }

    /* renamed from: o */
    public void mo31777o(JSONObject jSONObject) {
        this.f17828m = jSONObject;
    }

    /* renamed from: p */
    public void mo31778p(int i) {
        this.f17829n = i;
    }

    /* renamed from: q */
    public void mo31779q(String str) {
        this.f17819d = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("device type: " + this.f17816a);
        sb.append("; device id: " + this.f17817b);
        sb.append("; action type: " + this.f17818c);
        sb.append("; parent scene id: " + this.f17819d);
        sb.append("; scene id: " + this.f17820e);
        sb.append("; scene bundle id: " + this.f17821f);
        sb.append("; command: " + this.f17828m);
        return sb.toString();
    }
}

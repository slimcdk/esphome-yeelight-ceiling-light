package com.yeelight.yeelib.models;

import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.utils.AppUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p051j4.C3278f;

/* renamed from: com.yeelight.yeelib.models.i */
public class C8316i {

    /* renamed from: o */
    private static final String f14274o = "i";

    /* renamed from: a */
    private String f14275a;

    /* renamed from: b */
    private String f14276b;

    /* renamed from: c */
    private ActionType f14277c;

    /* renamed from: d */
    private String f14278d;

    /* renamed from: e */
    private String f14279e;

    /* renamed from: f */
    private String f14280f;

    /* renamed from: g */
    private String f14281g;

    /* renamed from: h */
    private String f14282h;

    /* renamed from: i */
    private String f14283i;

    /* renamed from: j */
    private String f14284j;

    /* renamed from: k */
    private String f14285k;

    /* renamed from: l */
    private String f14286l;

    /* renamed from: m */
    private JSONObject f14287m;

    /* renamed from: n */
    private int f14288n = -1;

    /* renamed from: com.yeelight.yeelib.models.i$a */
    static /* synthetic */ class C8317a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14289a;

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
                com.yeelight.yeelib.interaction.ActionType[] r0 = com.yeelight.yeelib.interaction.ActionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14289a = r0
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.SCENE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14289a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.RECOMMEND_SCENE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14289a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.SCENE_BUNDLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f14289a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.BRIGHT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f14289a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.BRIGHT_VARIABLE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f14289a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.CT_VARIABLE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f14289a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.COLOR_VARIABLE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f14289a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.COMMAND     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f14289a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.CT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f14289a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.COLOR     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.models.C8316i.C8317a.<clinit>():void");
        }
    }

    public C8316i(String str) {
        this.f14276b = str;
        this.f14277c = ActionType.COMMAND;
    }

    public C8316i(String str, String str2, ActionType actionType, String str3) {
        this.f14275a = str;
        this.f14276b = str2;
        this.f14277c = actionType;
        switch (C8317a.f14289a[actionType.ordinal()]) {
            case 1:
            case 2:
                this.f14279e = str3;
                return;
            case 3:
                this.f14280f = str3;
                return;
            case 4:
                this.f14281g = str3;
                return;
            case 5:
                this.f14282h = str3;
                return;
            case 6:
                this.f14283i = str3;
                return;
            case 7:
                this.f14284j = str3;
                return;
            case 8:
                try {
                    this.f14287m = new JSONObject(str3);
                    return;
                } catch (JSONException unused) {
                    this.f14287m = null;
                    String str4 = f14274o;
                    C3278f.m8797b(new AppUtils.SuicideException(str4, "Invalid device action param: " + str3));
                    return;
                }
            case 9:
                this.f14285k = str3;
                return;
            case 10:
                this.f14286l = str3;
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public ActionType mo35350a() {
        return this.f14277c;
    }

    /* renamed from: b */
    public String mo35351b() {
        return this.f14281g;
    }

    /* renamed from: c */
    public String mo35352c() {
        return this.f14282h;
    }

    /* renamed from: d */
    public String mo35353d() {
        return this.f14286l;
    }

    /* renamed from: e */
    public String mo35354e() {
        return this.f14284j;
    }

    /* renamed from: f */
    public JSONObject mo35355f() {
        return this.f14287m;
    }

    /* renamed from: g */
    public String mo35356g() {
        return this.f14283i;
    }

    /* renamed from: h */
    public int mo35357h() {
        return this.f14288n;
    }

    /* renamed from: i */
    public String mo35358i() {
        return this.f14276b;
    }

    /* renamed from: j */
    public String mo35359j() {
        return this.f14275a;
    }

    /* renamed from: k */
    public String mo35360k() {
        return this.f14278d;
    }

    /* renamed from: l */
    public String mo35361l() {
        return this.f14280f;
    }

    /* renamed from: m */
    public String mo35362m() {
        return this.f14279e;
    }

    /* renamed from: n */
    public String mo35363n() {
        return this.f14285k;
    }

    /* renamed from: o */
    public void mo35364o(JSONObject jSONObject) {
        this.f14287m = jSONObject;
    }

    /* renamed from: p */
    public void mo35365p(int i) {
        this.f14288n = i;
    }

    /* renamed from: q */
    public void mo35366q(String str) {
        this.f14278d = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("device type: " + this.f14275a);
        sb.append("; device id: " + this.f14276b);
        sb.append("; action type: " + this.f14277c);
        sb.append("; parent scene id: " + this.f14278d);
        sb.append("; scene id: " + this.f14279e);
        sb.append("; scene bundle id: " + this.f14280f);
        sb.append("; command: " + this.f14287m);
        return sb.toString();
    }
}

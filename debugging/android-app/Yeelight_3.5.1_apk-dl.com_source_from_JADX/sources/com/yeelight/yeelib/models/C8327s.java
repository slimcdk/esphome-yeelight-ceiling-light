package com.yeelight.yeelib.models;

import android.graphics.Color;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.xiaomi.mipush.sdk.Constants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p051j4.C9188d;

/* renamed from: com.yeelight.yeelib.models.s */
public class C8327s {

    /* renamed from: a */
    protected int f14319a;

    /* renamed from: b */
    protected String f14320b;

    /* renamed from: c */
    protected String f14321c;

    /* renamed from: d */
    protected int f14322d;

    /* renamed from: e */
    protected int f14323e;

    /* renamed from: f */
    protected int f14324f;

    /* renamed from: g */
    protected int f14325g;

    /* renamed from: h */
    protected int f14326h = 0;

    /* renamed from: i */
    protected int f14327i = 0;

    /* renamed from: j */
    protected C8328a[] f14328j;

    /* renamed from: k */
    protected String f14329k;

    /* renamed from: l */
    protected C8308a f14330l;

    /* renamed from: m */
    protected int f14331m = 0;

    /* renamed from: com.yeelight.yeelib.models.s$a */
    public static class C8328a {

        /* renamed from: a */
        private int f14332a = 0;

        /* renamed from: b */
        private int f14333b = 0;

        /* renamed from: c */
        private int f14334c = 0;

        /* renamed from: d */
        private int f14335d = 0;

        public C8328a(int i, int i2, int i3, int i4) {
            this.f14332a = i;
            this.f14333b = i2;
            this.f14334c = i3;
            this.f14335d = i4;
        }

        /* renamed from: a */
        public int mo35460a() {
            return this.f14335d;
        }

        /* renamed from: b */
        public int mo35461b() {
            return this.f14332a;
        }

        /* renamed from: c */
        public int mo35462c() {
            return this.f14333b;
        }

        /* renamed from: d */
        public int mo35463d() {
            return this.f14334c;
        }
    }

    public C8327s() {
    }

    public C8327s(int i, int i2, int i3, int i4, String str) {
        this.f14322d = i;
        this.f14323e = i2;
        this.f14324f = i3;
        this.f14325g = i4;
        this.f14329k = str;
    }

    public C8327s(int i, String str, int i2, int i3, int i4, int i5, C8328a[] aVarArr) {
        this.f14319a = i;
        this.f14320b = str;
        this.f14322d = i2;
        this.f14323e = i3;
        this.f14324f = i4;
        this.f14325g = i5;
        this.f14328j = aVarArr;
    }

    /* renamed from: b */
    public static C8327s m19803b(C8327s sVar) {
        return new C8327s(sVar.mo35451r(), sVar.mo35450q(), sVar.mo35449p(), sVar.mo35439f(), sVar.mo35441h(), sVar.mo35440g(), sVar.mo35448o());
    }

    /* renamed from: A */
    public boolean mo35416A() {
        return mo35454u() || mo35456w();
    }

    /* renamed from: B */
    public boolean mo35417B() {
        return this.f14322d == 2;
    }

    /* renamed from: C */
    public boolean mo35418C() {
        return this.f14322d == 7;
    }

    /* renamed from: D */
    public boolean mo35419D() {
        return this.f14322d == 3;
    }

    /* renamed from: E */
    public boolean mo35420E() {
        return mo35455v() || mo35456w();
    }

    /* renamed from: F */
    public boolean mo35421F() {
        return this.f14322d == 6;
    }

    /* renamed from: G */
    public boolean mo35422G() {
        return this.f14322d == 10;
    }

    /* renamed from: H */
    public boolean mo35423H() {
        return this.f14322d == 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo35424I() {
        if (this.f14320b == null) {
            this.f14320b = "";
        }
        int i = this.f14322d;
        if (!(i == 1 || i == 3 || i == 2 || i == 4 || i == 6 || i == 7 || i == 8 || i == 10)) {
            this.f14322d = 3;
        }
        if (this.f14323e < 1) {
            this.f14323e = 1;
        }
        if (this.f14323e > 100) {
            this.f14323e = 100;
        }
        if (this.f14324f < 1700) {
            this.f14324f = 1700;
        }
        if (this.f14324f > 6500) {
            this.f14324f = 6500;
        }
    }

    /* renamed from: J */
    public void mo35425J(C8308a aVar) {
        this.f14330l = aVar;
    }

    /* renamed from: K */
    public void mo35426K(int i) {
        this.f14323e = i;
    }

    /* renamed from: L */
    public void mo35427L(int i) {
        if (mo35417B()) {
            this.f14325g = i;
        }
    }

    /* renamed from: M */
    public void mo35428M(int i) {
        this.f14324f = i;
    }

    /* renamed from: N */
    public void mo35429N(String str) {
        this.f14321c = str;
    }

    /* renamed from: O */
    public void mo35430O(int i) {
        this.f14322d = i;
    }

    /* renamed from: P */
    public void mo35431P(String str) {
        this.f14320b = str;
    }

    /* renamed from: Q */
    public void mo35432Q(boolean z) {
    }

    /* renamed from: R */
    public void mo35433R(boolean z) {
    }

    /* renamed from: S */
    public void mo35434S(int i) {
        this.f14331m = i;
    }

    /* renamed from: T */
    public void mo35435T(String str) {
        this.f14320b = str;
    }

    /* renamed from: a */
    public JSONObject mo35294a() {
        return null;
    }

    /* renamed from: c */
    public C8308a mo35436c() {
        return this.f14330l;
    }

    /* renamed from: d */
    public String mo35437d() {
        JSONArray jSONArray = new JSONArray();
        if (this.f14322d == 4) {
            String str = this.f14329k;
            if (str != null) {
                return str;
            }
            jSONArray.put("cf");
            jSONArray.put(this.f14326h);
            jSONArray.put(this.f14327i);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < this.f14328j.length; i++) {
                if (i != 0) {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb.append(this.f14328j[i].mo35461b());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(this.f14328j[i].mo35462c());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(this.f14328j[i].mo35463d() & ViewCompat.MEASURED_SIZE_MASK);
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(this.f14328j[i].mo35460a());
            }
            jSONArray.put(sb.toString());
        }
        return jSONArray.toString();
    }

    /* renamed from: e */
    public int[] mo35438e(String str) {
        int i = this.f14322d;
        if (i == 4) {
            C8328a[] aVarArr = this.f14328j;
            if (aVarArr == null || aVarArr.length < 1) {
                return new int[]{16711680, MotionEventCompat.ACTION_POINTER_INDEX_MASK, 255, 16776960};
            }
            int length = aVarArr.length;
            int[] iArr = new int[length];
            float[] fArr = new float[3];
            for (int i2 = 0; i2 < length; i2++) {
                Color.colorToHSV(this.f14328j[i2].mo35463d() | ViewCompat.MEASURED_STATE_MASK, fArr);
                fArr[2] = C9188d.m22130a(this.f14323e);
                iArr[i2] = Color.HSVToColor(fArr);
            }
            return iArr;
        }
        int[] iArr2 = new int[1];
        if (i == 2) {
            int g = mo35440g();
            int f = mo35439f();
            if (!(g == -1 || f == -1)) {
                iArr2[0] = C9188d.m22131b(g, f);
            }
        } else if (i == 0) {
            iArr2[0] = -12303292;
        } else if (i == 3 || i == 10) {
            int h = mo35441h();
            int f2 = mo35439f();
            if (!(h == -1 || f2 == -1)) {
                iArr2[0] = C9188d.m22132c(h, f2, str);
            }
        } else if (i == 1) {
            int f3 = mo35439f();
            float[] fArr2 = new float[3];
            Color.colorToHSV(Color.parseColor("#fff6c1"), fArr2);
            fArr2[2] = C9188d.m22130a(f3);
            iArr2[0] = Color.HSVToColor(fArr2);
        } else if (i == 6) {
            return new int[]{C9188d.m22132c(mo35441h(), mo35439f(), str)};
        } else if (i == 5) {
            return new int[]{-570490880, -587137280, -587202305, -570425600};
        } else {
            if (i == 7 || i == 8) {
                return new int[]{-16128, -6021, -2367, -257};
            }
        }
        return iArr2;
    }

    /* renamed from: f */
    public int mo35439f() {
        return this.f14323e;
    }

    /* renamed from: g */
    public int mo35440g() {
        if (mo35417B()) {
            return this.f14325g;
        }
        return -1;
    }

    /* renamed from: h */
    public int mo35441h() {
        if (mo35419D() || mo35458y() || mo35422G()) {
            return this.f14324f;
        }
        return -1;
    }

    /* renamed from: i */
    public String mo35442i() {
        return this.f14321c;
    }

    /* renamed from: j */
    public int[] mo35443j() {
        C8328a[] aVarArr;
        if (!mo35416A() || (aVarArr = this.f14328j) == null) {
            return null;
        }
        int[] iArr = new int[aVarArr.length];
        int i = 0;
        while (true) {
            C8328a[] aVarArr2 = this.f14328j;
            if (i >= aVarArr2.length) {
                return iArr;
            }
            iArr[i] = aVarArr2[i].mo35463d();
            i++;
        }
    }

    /* renamed from: k */
    public int mo35444k() {
        return this.f14326h;
    }

    /* renamed from: l */
    public int mo35445l() {
        return this.f14327i;
    }

    /* renamed from: m */
    public int mo35446m() {
        if (mo35416A()) {
            return this.f14328j[0].mo35461b();
        }
        return -1;
    }

    /* renamed from: n */
    public String mo35447n() {
        StringBuilder sb = new StringBuilder();
        if (this.f14328j != null) {
            for (int i = 0; i < this.f14328j.length; i++) {
                if (i != 0) {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb.append(this.f14328j[i].mo35461b());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(this.f14328j[i].mo35462c());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(this.f14328j[i].mo35463d() & ViewCompat.MEASURED_SIZE_MASK);
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(this.f14328j[i].mo35460a());
            }
        }
        return sb.toString();
    }

    /* renamed from: o */
    public C8328a[] mo35448o() {
        return this.f14328j;
    }

    /* renamed from: p */
    public int mo35449p() {
        return this.f14322d;
    }

    /* renamed from: q */
    public String mo35450q() {
        return this.f14320b;
    }

    /* renamed from: r */
    public int mo35451r() {
        return this.f14319a;
    }

    /* renamed from: s */
    public int mo35452s() {
        return this.f14331m;
    }

    /* renamed from: t */
    public String mo35453t() {
        return this.f14320b;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mode", this.f14322d);
            jSONObject.put("bright", this.f14323e);
            jSONObject.put("ct", this.f14324f);
            jSONObject.put("color", this.f14325g);
            jSONObject.put("flowParam", this.f14329k);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: u */
    public boolean mo35454u() {
        return this.f14322d == 5;
    }

    /* renamed from: v */
    public boolean mo35455v() {
        return mo35454u() || mo35418C() || mo35457x();
    }

    /* renamed from: w */
    public boolean mo35456w() {
        return this.f14322d == 4;
    }

    /* renamed from: x */
    public boolean mo35457x() {
        return this.f14322d == 8;
    }

    /* renamed from: y */
    public boolean mo35458y() {
        return this.f14322d == 1;
    }

    /* renamed from: z */
    public boolean mo35459z() {
        return this.f14322d == 9;
    }
}

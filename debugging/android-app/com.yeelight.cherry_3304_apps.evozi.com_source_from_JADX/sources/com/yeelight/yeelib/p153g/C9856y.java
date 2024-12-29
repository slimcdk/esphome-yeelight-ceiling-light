package com.yeelight.yeelib.p153g;

import android.graphics.Color;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.utils.C10542f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.g.y */
public class C9856y {

    /* renamed from: a */
    protected int f17891a;

    /* renamed from: b */
    protected String f17892b;

    /* renamed from: c */
    protected String f17893c;

    /* renamed from: d */
    protected int f17894d;

    /* renamed from: e */
    protected int f17895e;

    /* renamed from: f */
    protected int f17896f;

    /* renamed from: g */
    protected int f17897g;

    /* renamed from: h */
    protected int f17898h = 0;

    /* renamed from: i */
    protected int f17899i = 0;

    /* renamed from: j */
    protected C9857a[] f17900j;

    /* renamed from: k */
    protected String f17901k;

    /* renamed from: l */
    protected C9827a f17902l;

    /* renamed from: m */
    protected int f17903m = 0;

    /* renamed from: com.yeelight.yeelib.g.y$a */
    public static class C9857a {

        /* renamed from: a */
        private int f17904a = 0;

        /* renamed from: b */
        private int f17905b = 0;

        /* renamed from: c */
        private int f17906c = 0;

        /* renamed from: d */
        private int f17907d = 0;

        public C9857a(int i, int i2, int i3, int i4) {
            this.f17904a = i;
            this.f17905b = i2;
            this.f17906c = i3;
            this.f17907d = i4;
        }

        /* renamed from: a */
        public int mo31895a() {
            return this.f17907d;
        }

        /* renamed from: b */
        public int mo31896b() {
            return this.f17904a;
        }

        /* renamed from: c */
        public int mo31897c() {
            return this.f17905b;
        }

        /* renamed from: d */
        public int mo31898d() {
            return this.f17906c;
        }
    }

    public C9856y() {
    }

    public C9856y(int i, int i2, int i3, int i4, String str) {
        this.f17894d = i;
        this.f17895e = i2;
        this.f17896f = i3;
        this.f17897g = i4;
        this.f17901k = str;
    }

    public C9856y(int i, String str, int i2, int i3, int i4, int i5, C9857a[] aVarArr) {
        this.f17891a = i;
        this.f17892b = str;
        this.f17894d = i2;
        this.f17895e = i3;
        this.f17896f = i4;
        this.f17897g = i5;
        this.f17900j = aVarArr;
    }

    /* renamed from: b */
    public static C9856y m24058b(C9856y yVar) {
        return new C9856y(yVar.mo31886r(), yVar.mo31885q(), yVar.mo31884p(), yVar.mo31874f(), yVar.mo31876h(), yVar.mo31875g(), yVar.mo31883o());
    }

    /* renamed from: A */
    public boolean mo31852A() {
        return mo31889u() || mo31891w();
    }

    /* renamed from: B */
    public boolean mo31853B() {
        return this.f17894d == 2;
    }

    /* renamed from: C */
    public boolean mo31854C() {
        return this.f17894d == 7;
    }

    /* renamed from: D */
    public boolean mo31855D() {
        return this.f17894d == 3;
    }

    /* renamed from: E */
    public boolean mo31856E() {
        return mo31890v() || mo31891w();
    }

    /* renamed from: F */
    public boolean mo31857F() {
        return this.f17894d == 6;
    }

    /* renamed from: G */
    public boolean mo31858G() {
        return this.f17894d == 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo31859H() {
        if (this.f17892b == null) {
            this.f17892b = "";
        }
        int i = this.f17894d;
        if (!(i == 1 || i == 3 || i == 2 || i == 4 || i == 6 || i == 7 || i == 8)) {
            this.f17894d = 3;
        }
        if (this.f17895e < 1) {
            this.f17895e = 1;
        }
        if (this.f17895e > 100) {
            this.f17895e = 100;
        }
        if (this.f17896f < 1700) {
            this.f17896f = 1700;
        }
        if (this.f17896f > 6500) {
            this.f17896f = 6500;
        }
    }

    /* renamed from: I */
    public void mo31860I(C9827a aVar) {
        this.f17902l = aVar;
    }

    /* renamed from: J */
    public void mo31861J(int i) {
        this.f17895e = i;
    }

    /* renamed from: K */
    public void mo31862K(int i) {
        if (mo31853B()) {
            this.f17897g = i;
        }
    }

    /* renamed from: L */
    public void mo31863L(int i) {
        this.f17896f = i;
    }

    /* renamed from: M */
    public void mo31864M(String str) {
        this.f17893c = str;
    }

    /* renamed from: N */
    public void mo31865N(int i) {
        this.f17894d = i;
    }

    /* renamed from: O */
    public void mo31866O(String str) {
        this.f17892b = str;
    }

    /* renamed from: P */
    public void mo31867P(boolean z) {
    }

    /* renamed from: Q */
    public void mo31868Q(boolean z) {
    }

    /* renamed from: R */
    public void mo31869R(int i) {
        this.f17903m = i;
    }

    /* renamed from: S */
    public void mo31870S(String str) {
        this.f17892b = str;
    }

    /* renamed from: a */
    public JSONObject mo31743a() {
        return null;
    }

    /* renamed from: c */
    public C9827a mo31871c() {
        return this.f17902l;
    }

    /* renamed from: d */
    public String mo31872d() {
        JSONArray jSONArray = new JSONArray();
        if (this.f17894d == 4) {
            String str = this.f17901k;
            if (str != null) {
                return str;
            }
            jSONArray.put("cf");
            jSONArray.put(this.f17898h);
            jSONArray.put(this.f17899i);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < this.f17900j.length; i++) {
                if (i != 0) {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb.append(this.f17900j[i].mo31896b());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(this.f17900j[i].mo31897c());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(this.f17900j[i].mo31898d() & ViewCompat.MEASURED_SIZE_MASK);
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(this.f17900j[i].mo31895a());
            }
            jSONArray.put(sb.toString());
        }
        return jSONArray.toString();
    }

    /* renamed from: e */
    public int[] mo31873e(String str) {
        int i = this.f17894d;
        if (i == 4) {
            C9857a[] aVarArr = this.f17900j;
            if (aVarArr == null || aVarArr.length < 1) {
                return new int[]{16711680, MotionEventCompat.ACTION_POINTER_INDEX_MASK, 255, 16776960};
            }
            int length = aVarArr.length;
            int[] iArr = new int[length];
            float[] fArr = new float[3];
            for (int i2 = 0; i2 < length; i2++) {
                Color.colorToHSV(this.f17900j[i2].mo31898d() | ViewCompat.MEASURED_STATE_MASK, fArr);
                fArr[2] = C10542f.m25732a(this.f17895e);
                iArr[i2] = Color.HSVToColor(fArr);
            }
            return iArr;
        }
        int[] iArr2 = new int[1];
        if (i == 2) {
            int g = mo31875g();
            int f = mo31874f();
            if (!(g == -1 || f == -1)) {
                iArr2[0] = C10542f.m25733b(g, f);
            }
        } else if (i == 0) {
            iArr2[0] = -12303292;
        } else if (i == 3) {
            int h = mo31876h();
            int f2 = mo31874f();
            if (!(h == -1 || f2 == -1)) {
                iArr2[0] = C10542f.m25734c(h, f2, str);
            }
        } else if (i == 1) {
            int f3 = mo31874f();
            float[] fArr2 = new float[3];
            Color.colorToHSV(Color.parseColor("#fff6c1"), fArr2);
            fArr2[2] = C10542f.m25732a(f3);
            iArr2[0] = Color.HSVToColor(fArr2);
        } else if (i == 6) {
            return new int[]{C10542f.m25734c(mo31876h(), mo31874f(), str)};
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
    public int mo31874f() {
        return this.f17895e;
    }

    /* renamed from: g */
    public int mo31875g() {
        if (mo31853B()) {
            return this.f17897g;
        }
        return -1;
    }

    /* renamed from: h */
    public int mo31876h() {
        if (mo31855D() || mo31893y()) {
            return this.f17896f;
        }
        return -1;
    }

    /* renamed from: i */
    public String mo31877i() {
        return this.f17893c;
    }

    /* renamed from: j */
    public int[] mo31878j() {
        C9857a[] aVarArr;
        if (!mo31852A() || (aVarArr = this.f17900j) == null) {
            return null;
        }
        int[] iArr = new int[aVarArr.length];
        int i = 0;
        while (true) {
            C9857a[] aVarArr2 = this.f17900j;
            if (i >= aVarArr2.length) {
                return iArr;
            }
            iArr[i] = aVarArr2[i].mo31898d();
            i++;
        }
    }

    /* renamed from: k */
    public int mo31879k() {
        return this.f17898h;
    }

    /* renamed from: l */
    public int mo31880l() {
        return this.f17899i;
    }

    /* renamed from: m */
    public int mo31881m() {
        if (mo31852A()) {
            return this.f17900j[0].mo31896b();
        }
        return -1;
    }

    /* renamed from: n */
    public String mo31882n() {
        StringBuilder sb = new StringBuilder();
        if (this.f17900j != null) {
            for (int i = 0; i < this.f17900j.length; i++) {
                if (i != 0) {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb.append(this.f17900j[i].mo31896b());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(this.f17900j[i].mo31897c());
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(this.f17900j[i].mo31898d() & ViewCompat.MEASURED_SIZE_MASK);
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                sb.append(this.f17900j[i].mo31895a());
            }
        }
        return sb.toString();
    }

    /* renamed from: o */
    public C9857a[] mo31883o() {
        return this.f17900j;
    }

    /* renamed from: p */
    public int mo31884p() {
        return this.f17894d;
    }

    /* renamed from: q */
    public String mo31885q() {
        return this.f17892b;
    }

    /* renamed from: r */
    public int mo31886r() {
        return this.f17891a;
    }

    /* renamed from: s */
    public int mo31887s() {
        return this.f17903m;
    }

    /* renamed from: t */
    public String mo31888t() {
        return this.f17892b;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mode", this.f17894d);
            jSONObject.put("bright", this.f17895e);
            jSONObject.put("ct", this.f17896f);
            jSONObject.put("color", this.f17897g);
            jSONObject.put("flowParam", this.f17901k);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: u */
    public boolean mo31889u() {
        return this.f17894d == 5;
    }

    /* renamed from: v */
    public boolean mo31890v() {
        return mo31889u() || mo31854C() || mo31892x();
    }

    /* renamed from: w */
    public boolean mo31891w() {
        return this.f17894d == 4;
    }

    /* renamed from: x */
    public boolean mo31892x() {
        return this.f17894d == 8;
    }

    /* renamed from: y */
    public boolean mo31893y() {
        return this.f17894d == 1;
    }

    /* renamed from: z */
    public boolean mo31894z() {
        return this.f17894d == 9;
    }
}

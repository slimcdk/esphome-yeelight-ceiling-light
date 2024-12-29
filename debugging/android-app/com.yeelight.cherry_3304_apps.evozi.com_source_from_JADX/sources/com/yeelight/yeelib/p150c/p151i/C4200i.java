package com.yeelight.yeelib.p150c.p151i;

import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p152f.C4237p;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p178b.C5969b;
import com.yeelight.yeelib.p186e.C9768c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.c.i.i */
public abstract class C4200i extends C4198d implements C4237p.C4238a {

    /* renamed from: v */
    public String f7260v = getClass().getSimpleName();

    /* renamed from: w */
    protected C5969b f7261w;

    public C4200i(String str, String str2, C6024e eVar) {
        super(str, str2, eVar);
    }

    /* renamed from: A0 */
    public void mo23363A0(C9768c cVar, boolean z) {
        if (!this.f7242e.contains(cVar)) {
            this.f7242e.add(cVar);
        }
        if (z) {
            cVar.onConnectionStateChanged(-1, mo23419q0() ? 11 : this.f7253p);
        }
    }

    /* renamed from: A1 */
    public abstract boolean mo23300A1();

    /* renamed from: B1 */
    public void mo23426B1() {
        C4237p.m11800a().mo23572c(this);
    }

    /* renamed from: Z0 */
    public void mo23427Z0() {
        int m = mo23408d0().mo27700m();
        int i = 1;
        if (m != 1) {
            int i2 = m - 20;
            if (i2 >= 0) {
                i = i2;
            }
            mo23340p1((long) i);
        }
    }

    /* renamed from: a1 */
    public void mo23428a1() {
        int m = mo23408d0().mo27700m();
        int i = 100;
        if (m != 100) {
            int i2 = m + 20;
            if (i2 <= 100) {
                i = i2;
            }
            mo23340p1((long) i);
        }
    }

    /* renamed from: b1 */
    public abstract boolean mo23326b1();

    /* renamed from: c1 */
    public abstract boolean mo23327c1();

    /* renamed from: d1 */
    public void mo23429d1(boolean z) {
    }

    /* renamed from: e1 */
    public void mo23430e1(boolean z) {
    }

    /* renamed from: f1 */
    public abstract boolean mo23328f1(boolean z);

    /* renamed from: g1 */
    public boolean mo23431g1(boolean z, String str, String str2, int i) {
        return false;
    }

    /* renamed from: h1 */
    public void mo23432h1(boolean z) {
    }

    /* renamed from: i1 */
    public abstract String mo23330i1();

    /* renamed from: j1 */
    public C6024e.C6028d mo23433j1(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? C6024e.C6028d.DEVICE_MODE_SUNSHINE : C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT : C6024e.C6028d.DEVICE_MODE_FLOW : C6024e.C6028d.DEVICE_MODE_COLOR_HSV : C6024e.C6028d.DEVICE_MODE_COLOR : C6024e.C6028d.DEVICE_MODE_SUNSHINE;
    }

    /* renamed from: k1 */
    public boolean mo23332k1() {
        return mo23408d0().mo27681c0();
    }

    /* renamed from: l1 */
    public abstract boolean mo23334l1();

    /* renamed from: m1 */
    public abstract boolean mo23336m1(int i);

    /* renamed from: n1 */
    public void mo23434n1() {
        C4237p.m11800a().mo23571b(this);
    }

    /* renamed from: o1 */
    public abstract boolean mo23338o1(C6024e.C6028d dVar);

    /* renamed from: p1 */
    public abstract boolean mo23340p1(long j);

    /* renamed from: q1 */
    public abstract boolean mo23341q1(int i);

    /* renamed from: r1 */
    public abstract boolean mo23343r1(int i, int[] iArr, int i2);

    /* renamed from: s1 */
    public abstract boolean mo23345s1(int i);

    /* renamed from: t1 */
    public abstract boolean mo23346t1();

    /* renamed from: u */
    public void mo23423u(boolean z) {
    }

    /* renamed from: u1 */
    public abstract boolean mo23348u1(int i);

    /* renamed from: v */
    public void mo23424v(boolean z) {
    }

    /* renamed from: v1 */
    public abstract boolean mo23350v1(boolean z);

    /* renamed from: w1 */
    public abstract boolean mo23352w1(C6024e.C6028d dVar);

    /* renamed from: x1 */
    public abstract boolean mo23355x1(C9856y yVar);

    /* renamed from: y1 */
    public boolean mo23435y1(long j) {
        return false;
    }

    /* renamed from: z1 */
    public String mo23436z1() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("com.yeelight.cherry.device_id", mo23372G());
            jSONObject.put("com.yeelight.cherry.device_name", mo23397U());
            jSONObject.put("com.yeelight.cherry.device_mode", mo23395T());
            jSONObject.put("com.yeelight.cherry.device_power", mo23332k1());
            jSONObject.put("com.yeelight.cherry.device_online", mo23416o0());
            jSONObject.put("com.yeelight.cherry.device_connecting", mo23333l0());
            jSONObject.put("com.yeelight.cherry.device_connect", mo23331k0());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }
}

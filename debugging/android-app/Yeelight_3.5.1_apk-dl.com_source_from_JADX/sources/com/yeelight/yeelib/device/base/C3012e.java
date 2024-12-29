package com.yeelight.yeelib.device.base;

import com.yeelight.yeelib.authority.DeviceAuthorityBase;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.C3086p;
import com.yeelight.yeelib.models.C8327s;
import org.json.JSONException;
import org.json.JSONObject;
import p237z3.C12143c;

/* renamed from: com.yeelight.yeelib.device.base.e */
public abstract class C3012e extends C3010c implements C3086p.C3087a {

    /* renamed from: v */
    public String f4758v = getClass().getSimpleName();

    /* renamed from: w */
    protected DeviceAuthorityBase f4759w;

    public C3012e(String str, String str2, DeviceStatusBase deviceStatusBase) {
        super(str, str2, deviceStatusBase);
    }

    /* renamed from: A0 */
    public void mo23176A0(C12143c cVar, boolean z) {
        if (!this.f4740e.contains(cVar)) {
            this.f4740e.add(cVar);
        }
        if (z) {
            cVar.onConnectionStateChanged(-1, mo23233q0() ? 11 : this.f4751p);
        }
    }

    /* renamed from: A1 */
    public abstract boolean mo23114A1();

    /* renamed from: B1 */
    public void mo23240B1() {
        C3086p.m8110a().mo23465c(this);
    }

    /* renamed from: Z0 */
    public void mo23241Z0() {
        int m = mo23221d0().mo31601m();
        int i = 1;
        if (m != 1) {
            int i2 = m - 20;
            if (i2 >= 0) {
                i = i2;
            }
            mo23154p1((long) i);
        }
    }

    /* renamed from: a1 */
    public void mo23242a1() {
        int m = mo23221d0().mo31601m();
        int i = 100;
        if (m != 100) {
            int i2 = m + 20;
            if (i2 <= 100) {
                i = i2;
            }
            mo23154p1((long) i);
        }
    }

    /* renamed from: b1 */
    public abstract boolean mo23140b1();

    /* renamed from: c1 */
    public abstract boolean mo23141c1();

    /* renamed from: d1 */
    public void mo23243d1(boolean z) {
    }

    /* renamed from: e1 */
    public void mo23244e1(boolean z) {
    }

    /* renamed from: f1 */
    public abstract boolean mo23142f1(boolean z);

    /* renamed from: g1 */
    public boolean mo23245g1(boolean z, String str, String str2, int i) {
        return false;
    }

    /* renamed from: h1 */
    public void mo23246h1(boolean z) {
    }

    /* renamed from: i1 */
    public abstract String mo23144i1();

    /* renamed from: j1 */
    public DeviceStatusBase.DeviceMode mo23247j1(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE : DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT : DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW : DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR_HSV : DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR : DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE;
    }

    /* renamed from: k1 */
    public boolean mo23146k1() {
        return mo23221d0().mo31584d0();
    }

    /* renamed from: l1 */
    public abstract boolean mo23148l1();

    /* renamed from: m1 */
    public abstract boolean mo23150m1(int i);

    /* renamed from: n1 */
    public void mo23248n1() {
        C3086p.m8110a().mo23464b(this);
    }

    /* renamed from: o1 */
    public abstract boolean mo23152o1(DeviceStatusBase.DeviceMode deviceMode);

    /* renamed from: p1 */
    public abstract boolean mo23154p1(long j);

    /* renamed from: q1 */
    public abstract boolean mo23155q1(int i);

    /* renamed from: r1 */
    public abstract boolean mo23157r1(int i, int[] iArr, int i2);

    /* renamed from: s1 */
    public abstract boolean mo23159s1(int i);

    /* renamed from: t1 */
    public abstract boolean mo23160t1();

    /* renamed from: u */
    public void mo23237u(boolean z) {
    }

    /* renamed from: u1 */
    public abstract boolean mo23162u1(int i);

    /* renamed from: v */
    public void mo23238v(boolean z) {
    }

    /* renamed from: v1 */
    public abstract boolean mo23249v1(boolean z);

    /* renamed from: w1 */
    public abstract boolean mo23165w1(DeviceStatusBase.DeviceMode deviceMode);

    /* renamed from: x1 */
    public abstract boolean mo23168x1(C8327s sVar);

    /* renamed from: y1 */
    public boolean mo23250y1(long j) {
        return false;
    }

    /* renamed from: z1 */
    public String mo23251z1() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("com.yeelight.cherry.device_id", mo23185G());
            jSONObject.put("com.yeelight.cherry.device_name", mo23210U());
            jSONObject.put("com.yeelight.cherry.device_mode", mo23208T());
            jSONObject.put("com.yeelight.cherry.device_power", mo23146k1());
            jSONObject.put("com.yeelight.cherry.device_online", mo23230o0());
            jSONObject.put("com.yeelight.cherry.device_connecting", mo23147l0());
            jSONObject.put("com.yeelight.cherry.device_connect", mo23145k0());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }
}

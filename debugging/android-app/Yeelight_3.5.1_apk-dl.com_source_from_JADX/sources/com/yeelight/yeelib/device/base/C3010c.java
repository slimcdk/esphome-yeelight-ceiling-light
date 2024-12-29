package com.yeelight.yeelib.device.base;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.config.AppConfiguration;
import com.miot.common.device.Device;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.LanDevice;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.models.ProductModelBase;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.C8281l;
import com.yeelight.yeelib.managers.C8293t;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.C8308a;
import com.yeelight.yeelib.models.C8309b;
import com.yeelight.yeelib.models.C8319k;
import com.yeelight.yeelib.models.C8321m;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.utils.AppUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p051j4.C9201q;
import p145d4.C8937a;
import p179k4.C9295a;
import p207s3.C10337c;
import p215u3.C10457h0;
import p215u3.C10507u;
import p215u3.C10510v;
import p223w3.C10689c;
import p227x3.C11969f;
import p227x3.C11972i;
import p232y3.C12041e;
import p232y3.C12043g;
import p237z3.C12143c;
import p237z3.C12145e;
import p237z3.C12147g;

/* renamed from: com.yeelight.yeelib.device.base.c */
public abstract class C3010c {

    /* renamed from: a */
    protected String f4736a;

    /* renamed from: b */
    private Map<Integer, String> f4737b;

    /* renamed from: c */
    private List<C10507u> f4738c;

    /* renamed from: d */
    private List<C6093d> f4739d;

    /* renamed from: e */
    protected List<C12143c> f4740e = new CopyOnWriteArrayList();

    /* renamed from: f */
    protected LanDevice f4741f;

    /* renamed from: g */
    protected int f4742g = 0;

    /* renamed from: h */
    protected ProductModelBase f4743h;

    /* renamed from: i */
    private DeviceStatusBase f4744i;

    /* renamed from: j */
    private Device.Ownership f4745j;

    /* renamed from: k */
    private String f4746k;

    /* renamed from: l */
    private int f4747l = 15;

    /* renamed from: m */
    private String f4748m;

    /* renamed from: n */
    protected AbstractDevice f4749n;

    /* renamed from: o */
    protected String f4750o = "";
    /* access modifiers changed from: protected */

    /* renamed from: p */
    public int f4751p = 0;

    /* renamed from: q */
    protected int f4752q = -1;

    /* renamed from: r */
    protected String f4753r;

    /* renamed from: s */
    protected String f4754s;

    /* renamed from: t */
    protected C10689c f4755t;

    /* renamed from: u */
    protected C12145e f4756u = new C3011a();

    /* renamed from: com.yeelight.yeelib.device.base.c$a */
    class C3011a implements C12145e {
        C3011a() {
        }

        public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
            if (i == 1) {
                C3010c.this.mo23221d0().mo31551M0(true);
            } else if (i == 2) {
                C3010c.this.mo23221d0().mo31551M0(false);
            } else if (i == 4) {
                C3010c.this.mo23221d0().mo31531C0(deviceStatusBase.mo31627z());
            } else if (i == 8) {
                C3010c.this.mo23221d0().mo31600l0((long) deviceStatusBase.mo31601m());
            } else if (i == 16) {
                C3010c.this.mo23221d0().mo31602m0(deviceStatusBase.mo31603n());
            } else if (i == 32) {
                C3010c.this.mo23221d0().mo31610q0(deviceStatusBase.mo31607p());
            } else if (i == 64) {
                C3010c.this.mo23221d0().mo31604n0(deviceStatusBase.mo31605o());
            }
        }
    }

    public C3010c(String str, String str2, DeviceStatusBase deviceStatusBase) {
        mo23187H0(str);
        this.f4736a = str2;
        mo23201P0(C11972i.m30709g(str2));
        mo23205R0(deviceStatusBase);
        m7629i0(str2);
    }

    /* renamed from: O */
    private C10457h0 m7628O() {
        return new C10457h0(R$drawable.setting_rename, C3108x.f4951e.getString(R$string.google_home_add_title), 48, mo23185G());
    }

    /* renamed from: i0 */
    private final void m7629i0(String str) {
        this.f4737b = C10510v.m26755Z(str);
    }

    /* renamed from: l */
    private boolean m7630l() {
        return !TextUtils.equals(C8281l.m19542b().mo35223a(), AppConfiguration.Locale.cn.toString()) && !YeelightDeviceManager.m7777V0(mo23208T()) && !TextUtils.equals(mo23208T(), "yeelink.light.ble1") && !TextUtils.equals(mo23208T(), "yeelink.light.gingko") && !TextUtils.equals(mo23208T(), "yeelink.light.gingko.group") && !TextUtils.equals(mo23208T(), "yeelink.light.room") && !TextUtils.equals(mo23208T(), "yeelink.light.group") && !TextUtils.equals(mo23208T(), "yeelink.gateway.v1") && !TextUtils.equals(mo23208T(), "yeelink.gateway.va") && !TextUtils.equals(mo23208T(), "yeelink.wifispeaker.v1") && !TextUtils.equals(mo23208T(), "yeelink.switch.sw1") && !TextUtils.equals(mo23208T(), "yeelink.plug.plug") && !TextUtils.equals(mo23208T(), "yeelink.light.fancl1") && !TextUtils.equals(mo23208T(), "yeelink.light.fancl2") && !TextUtils.equals(mo23208T(), "yeelink.light.fancl5") && !TextUtils.equals(mo23208T(), "yeelink.light.fancl6");
    }

    /* renamed from: A */
    public int mo23113A() {
        return this.f4751p;
    }

    /* renamed from: A0 */
    public void mo23176A0(C12143c cVar, boolean z) {
        if (!this.f4740e.contains(cVar)) {
            StringBuilder sb = new StringBuilder();
            sb.append("registerConnStateChangeListener : ");
            sb.append(cVar);
            this.f4740e.add(cVar);
        }
        if (z) {
            cVar.onConnectionStateChanged(-1, this.f4751p);
        }
    }

    /* renamed from: B */
    public JSONObject mo23177B() {
        DeviceStatusBase d0;
        int k;
        StringBuilder sb;
        String sb2;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            if (!mo23221d0().mo31584d0()) {
                jSONObject.put("method", "set_power");
                sb2 = "off";
            } else {
                if (mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR) {
                    jSONObject.put("method", "set_scene");
                    jSONArray.put("color");
                    jSONArray.put(mo23221d0().mo31603n());
                    d0 = mo23221d0();
                } else {
                    if (!(mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE || mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_COMPUTER)) {
                        if (mo23221d0().mo31627z() != DeviceStatusBase.DeviceMode.DEVICE_MODE_READ) {
                            if (mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW) {
                                jSONObject.put("method", "set_scene");
                                jSONArray.put("cf");
                                int i = 0;
                                jSONArray.put(0);
                                jSONArray.put(0);
                                if (this instanceof WifiDeviceBase) {
                                    sb = new StringBuilder();
                                    C8308a t = mo23221d0().mo31615t();
                                    if (t != null) {
                                        List<C8319k> h = t.mo35338h();
                                        while (i < h.size()) {
                                            if (i != 0) {
                                                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                            }
                                            sb.append(h.get(i).mo35375c());
                                            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                            sb.append(h.get(i).mo35376d().ordinal());
                                            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                            sb.append(h.get(i).mo35377e());
                                            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                            sb.append(h.get(i).mo35374b());
                                            i++;
                                        }
                                    }
                                } else {
                                    sb = new StringBuilder();
                                    List<C12043g.C12044a> c = mo23221d0().mo31619v().mo42689c();
                                    if (c == null || c.isEmpty()) {
                                        c.add(new C12043g.C12044a(Color.rgb(33, 199, 202), 2000));
                                        c.add(new C12043g.C12044a(Color.rgb(185, 72, 201), 2000));
                                        c.add(new C12043g.C12044a(Color.rgb(219, 37, 109), 2000));
                                        c.add(new C12043g.C12044a(Color.rgb(120, 230, 45), 2000));
                                    }
                                    int size = c.size();
                                    while (i < size) {
                                        if (i != 0) {
                                            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                        }
                                        sb.append(c.get(i).mo42714b());
                                        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                        sb.append(1);
                                        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                        sb.append(c.get(i).mo42713a() & ViewCompat.MEASURED_SIZE_MASK);
                                        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                        sb.append(mo23221d0().mo31601m());
                                        i++;
                                    }
                                }
                                sb2 = sb.toString();
                            } else if (mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR_HSV) {
                                jSONObject.put("method", "set_scene");
                                jSONArray.put("hsv");
                                jSONArray.put(mo23221d0().mo31619v().mo42694h());
                                jSONArray.put(mo23221d0().mo31619v().mo42699m());
                                d0 = mo23221d0();
                            } else if (mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT) {
                                jSONObject.put("method", "set_scene");
                                jSONArray.put("nightlight");
                                k = mo23221d0().mo31619v().mo42697k();
                                jSONArray.put(k);
                            }
                            jSONObject.put("params", jSONArray);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("snapshot of device, command: ");
                            sb3.append(jSONObject.toString());
                            return jSONObject;
                        }
                    }
                    jSONObject.put("method", "set_scene");
                    jSONArray.put("ct");
                    jSONArray.put(mo23221d0().mo31607p());
                    d0 = mo23221d0();
                }
                k = d0.mo31601m();
                jSONArray.put(k);
                jSONObject.put("params", jSONArray);
                StringBuilder sb32 = new StringBuilder();
                sb32.append("snapshot of device, command: ");
                sb32.append(jSONObject.toString());
                return jSONObject;
            }
            jSONArray.put(sb2);
            jSONObject.put("params", jSONArray);
        } catch (Exception unused) {
        }
        StringBuilder sb322 = new StringBuilder();
        sb322.append("snapshot of device, command: ");
        sb322.append(jSONObject.toString());
        return jSONObject;
    }

    /* renamed from: B0 */
    public void mo23178B0(C12145e eVar) {
        mo23180C0(eVar, true);
    }

    /* renamed from: C */
    public C12041e mo23179C() {
        return (C12041e) mo23221d0().mo31611r(2);
    }

    /* renamed from: C0 */
    public void mo23180C0(C12145e eVar, boolean z) {
        this.f4744i.mo31594i0(eVar, z);
    }

    /* renamed from: D */
    public int mo23181D() {
        return this.f4747l;
    }

    /* renamed from: D0 */
    public void mo23182D0(C12147g gVar) {
        this.f4744i.mo31596j0(gVar);
    }

    /* renamed from: E0 */
    public void mo23183E0(int i) {
        this.f4742g = (i ^ -1) & this.f4742g;
    }

    /* renamed from: F */
    public abstract int mo23116F();

    /* access modifiers changed from: protected */
    /* renamed from: F0 */
    public void mo23184F0(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("setConnectState: ");
        sb.append(i);
        int i2 = this.f4751p;
        if (i != i2) {
            this.f4752q = i2;
            this.f4751p = i;
            mo23235s0(i2, i);
            if (i == 11 || i == 2 || i == 0) {
                C9295a.m22761c().mo37826a();
            }
        }
    }

    /* renamed from: G */
    public String mo23185G() {
        return this.f4753r;
    }

    /* renamed from: G0 */
    public void mo23186G0(int i) {
        this.f4747l = i;
    }

    /* renamed from: H */
    public abstract int mo23119H();

    /* renamed from: H0 */
    public void mo23187H0(String str) {
        this.f4753r = str;
    }

    /* renamed from: I */
    public ProductModelBase mo23188I() {
        return this.f4743h;
    }

    /* renamed from: I0 */
    public void mo23189I0(String str) {
        this.f4746k = str;
    }

    /* renamed from: J */
    public String mo23190J() {
        return this.f4746k;
    }

    /* renamed from: J0 */
    public void mo23191J0(C11969f fVar) {
        if (mo23221d0().mo31614s0(fVar)) {
            mo23228j0();
        }
    }

    /* renamed from: K */
    public final List<C10507u> mo23192K() {
        return this.f4738c;
    }

    /* renamed from: K0 */
    public void mo23193K0(LanDevice lanDevice) {
        this.f4741f = lanDevice;
        if (lanDevice != null) {
            for (C12143c onLocalConnected : this.f4740e) {
                onLocalConnected.onLocalConnected();
            }
            return;
        }
        for (C12143c onLocalDisconnected : this.f4740e) {
            onLocalDisconnected.onLocalDisconnected();
        }
    }

    /* renamed from: L0 */
    public void mo23194L0(String str) {
        this.f4754s = str;
    }

    /* renamed from: M */
    public List<C6093d> mo23195M() {
        return this.f4739d;
    }

    /* renamed from: M0 */
    public void mo23196M0(AbstractDevice abstractDevice) {
        this.f4749n = abstractDevice;
    }

    /* renamed from: N */
    public final C11969f mo23197N() {
        DeviceStatusBase deviceStatusBase = this.f4744i;
        if (deviceStatusBase != null) {
            return deviceStatusBase.mo31613s();
        }
        return null;
    }

    /* renamed from: N0 */
    public void mo23198N0(String str) {
        this.f4744i.mo31533D0(str);
    }

    /* renamed from: O0 */
    public void mo23199O0(Device.Ownership ownership) {
        this.f4745j = ownership;
    }

    /* renamed from: P */
    public LanDevice mo23200P() {
        return this.f4741f;
    }

    /* renamed from: P0 */
    public void mo23201P0(ProductModelBase productModelBase) {
        this.f4743h = productModelBase;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public String mo23202Q(String str) {
        String[] split = str.toLowerCase().split(Constants.COLON_SEPARATOR);
        return split[split.length - 2] + Constants.COLON_SEPARATOR + split[split.length - 1];
    }

    /* renamed from: Q0 */
    public void mo23203Q0(String str) {
        this.f4748m = str;
    }

    /* renamed from: R */
    public String mo23204R() {
        return this.f4754s;
    }

    /* renamed from: R0 */
    public void mo23205R0(DeviceStatusBase deviceStatusBase) {
        this.f4744i = deviceStatusBase;
    }

    /* renamed from: S */
    public AbstractDevice mo23206S() {
        return this.f4749n;
    }

    /* renamed from: S0 */
    public void mo23207S0(String str) {
        this.f4750o = str;
    }

    /* renamed from: T */
    public String mo23208T() {
        return this.f4736a;
    }

    /* renamed from: T0 */
    public void mo23209T0(C10689c cVar) {
        if (cVar != null) {
            cVar.mo23178B0(this.f4756u);
            C10689c cVar2 = this.f4755t;
            if (cVar2 != null) {
                cVar2.mo23213W0(this.f4756u);
            }
        } else {
            C10689c cVar3 = this.f4755t;
            if (cVar3 != null) {
                cVar3.mo23213W0(this.f4756u);
                mo23236t0();
            }
        }
        this.f4755t = cVar;
    }

    /* renamed from: U */
    public String mo23210U() {
        if (!AppUtils.f4977a || this.f4741f == null) {
            return this.f4744i.mo31526A();
        }
        return this.f4744i.mo31526A() + " ( LOCAL )";
    }

    /* renamed from: U0 */
    public abstract boolean mo23131U0();

    /* renamed from: V */
    public boolean mo23211V() {
        return this.f4744i.mo31542I() == 1;
    }

    /* renamed from: V0 */
    public void mo23133V0(C12143c cVar) {
        if (cVar == null) {
            this.f4740e.clear();
        } else {
            this.f4740e.remove(cVar);
        }
    }

    /* renamed from: W */
    public Device.Ownership mo23212W() {
        if (this.f4745j == null) {
            this.f4745j = Device.Ownership.NOONES;
        }
        return this.f4745j;
    }

    /* renamed from: W0 */
    public void mo23213W0(C12145e eVar) {
        this.f4744i.mo31569V0(eVar);
    }

    /* renamed from: X */
    public String mo23214X() {
        return "setPower";
    }

    /* renamed from: X0 */
    public void mo23215X0(C12147g gVar) {
        this.f4744i.mo31571W0(gVar);
    }

    /* renamed from: Y */
    public int mo23216Y() {
        return this.f4752q;
    }

    /* renamed from: Y0 */
    public abstract boolean mo23137Y0();

    /* renamed from: Z */
    public String mo23217Z() {
        return this.f4748m;
    }

    /* renamed from: a0 */
    public C8937a mo23218a0() {
        return C8293t.m19620n().mo35256p(this.f4748m);
    }

    /* renamed from: b0 */
    public String mo23219b0() {
        C8937a a0 = mo23218a0();
        return a0 == null ? "" : a0.mo36723o();
    }

    /* renamed from: c0 */
    public C8321m mo23220c0() {
        int i;
        int i2;
        int i3;
        int i4;
        C8327s.C8328a[] aVarArr;
        int i5;
        int i6;
        int i7;
        int m = mo23221d0().mo31601m();
        if ((this instanceof WifiDeviceBase) || (this instanceof C10337c)) {
            boolean S = mo23221d0().mo31562S();
            C8308a t = mo23221d0().mo31615t();
            if (!S || t == null) {
                if (mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR || mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR_HSV) {
                    i3 = m;
                    i = mo23221d0().mo31603n();
                    i4 = 2;
                    i2 = -1;
                } else {
                    if (mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE || mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_COMPUTER || mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_READ) {
                        if (this.f4743h.mo31881b(ProductModelBase.CapabilityType.CT_TAB)) {
                            i3 = m;
                            i2 = mo23221d0().mo31607p();
                            i4 = 3;
                            i = -1;
                        }
                    } else if (mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT) {
                        int F = mo23221d0().mo31536F();
                        if (this.f4743h.mo31881b(ProductModelBase.CapabilityType.MOON_WITH_CT_TAB)) {
                            i3 = F;
                            i2 = mo23221d0().mo31528B();
                            i4 = 10;
                        } else {
                            i3 = F;
                            i4 = 6;
                            i2 = 2700;
                        }
                        i = -1;
                    }
                    i3 = m;
                    i4 = 1;
                    i2 = -1;
                    i = -1;
                }
                return new C8321m("", i4, i3, i2, i, (C8327s.C8328a[]) null);
            }
            C8309b bVar = new C8309b("", -1, t.mo35335d());
            bVar.mo35425J(t);
            return bVar;
        }
        if (this instanceof C6094f) {
            m = C9201q.m22193e(m);
        }
        int i8 = m;
        if (mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR || mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR_HSV) {
            aVarArr = null;
            i5 = mo23221d0().mo31603n();
            i7 = 2;
            i6 = -1;
        } else {
            if (mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE || mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_READ || mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_COMPUTER) {
                if (this.f4743h.mo31881b(ProductModelBase.CapabilityType.CT_TAB)) {
                    aVarArr = null;
                    i6 = mo23221d0().mo31607p();
                    i7 = 3;
                    i5 = -1;
                }
            } else if (mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW) {
                List<C12043g.C12044a> o = mo23221d0().mo31605o();
                int size = o.size();
                C8327s.C8328a[] aVarArr2 = new C8327s.C8328a[size];
                for (int i9 = 0; i9 < size; i9++) {
                    aVarArr2[i9] = new C8327s.C8328a(o.get(i9).mo42714b(), 1, o.get(i9).mo42713a(), i8);
                }
                aVarArr = aVarArr2;
                i7 = 4;
                i6 = -1;
                i5 = -1;
            }
            aVarArr = null;
            i7 = 1;
            i6 = -1;
            i5 = -1;
        }
        return new C8321m("", i7, i8, i6, i5, aVarArr);
    }

    /* renamed from: d0 */
    public DeviceStatusBase mo23221d0() {
        return this.f4744i;
    }

    /* renamed from: e0 */
    public String mo23222e0() {
        long currentTimeMillis = System.currentTimeMillis();
        if (!mo23230o0()) {
            return C3108x.f4951e.getString(R$string.common_text_status_subtitle_offline);
        }
        if (!mo23145k0()) {
            return mo23147l0() ? C3108x.f4951e.getString(R$string.common_text_status_connecting) : C3108x.f4951e.getString(R$string.common_text_status_subtitle_online);
        }
        if (mo23153p0()) {
            return C3108x.f4951e.getString(R$string.common_text_status_upgrade);
        }
        if (!mo23221d0().mo31584d0()) {
            DeviceStatusBase.C6089a H = mo23221d0().mo31540H();
            if (H == null) {
                return C3108x.f4951e.getString(R$string.common_text_status_subtitle_off);
            }
            return String.format(C3108x.f4951e.getString(R$string.common_text_status_subtitle_on_job_at_time), new Object[]{new SimpleDateFormat("HH:mm").format(new Date(H.mo31629a()))});
        }
        DeviceStatusBase.C6089a G = mo23221d0().mo31538G();
        if (G == null) {
            return mo23221d0().mo31580b0() ? C3108x.f4951e.getString(R$string.common_text_status_subtitle_music_flow) : mo23221d0().mo31562S() ? C3108x.f4951e.getString(R$string.common_text_status_subtitle_flow_mode) : mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_COMPUTER ? C3108x.f4951e.getString(R$string.common_text_status_subtitle_pc_mode) : mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_READ ? C3108x.f4951e.getString(R$string.common_text_status_subtitle_reading_mode) : mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT ? C3108x.f4951e.getString(R$string.common_text_status_subtitle_moon_light) : C3108x.f4951e.getString(R$string.common_text_status_subtitle_on);
        }
        long a = G.mo31629a();
        if (G.mo31630b() == DeviceStatusBase.CronJobType.CRON_JOB_TYPE_SCHEDULE) {
            return String.format(C3108x.f4951e.getString(R$string.common_text_status_subtitle_off_job_at_time), new Object[]{new SimpleDateFormat("HH:mm").format(new Date(a))});
        }
        return String.format(C3108x.f4951e.getString(R$string.common_text_status_subtitle_off_job_min), new Object[]{Long.valueOf(((a - currentTimeMillis) / 60) / 1000)});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r3 = ((com.yeelight.yeelib.device.base.C3010c) r3).mo23185G();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.yeelight.yeelib.device.base.C3010c
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.yeelight.yeelib.device.base.c r3 = (com.yeelight.yeelib.device.base.C3010c) r3
            java.lang.String r3 = r3.mo23185G()
            if (r3 == 0) goto L_0x0019
            java.lang.String r0 = r2.mo23185G()
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0019
            r1 = 1
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.base.C3010c.equals(java.lang.Object):boolean");
    }

    /* renamed from: f0 */
    public String mo23224f0() {
        return this.f4750o;
    }

    /* renamed from: g0 */
    public abstract int mo23143g0();

    /* renamed from: h0 */
    public final void mo23225h0() {
        List<C6093d> list = this.f4739d;
        if (list != null) {
            for (C6093d W0 : list) {
                mo23213W0(W0);
            }
        }
        this.f4739d = C10510v.m26766d(this.f4736a, this);
    }

    public int hashCode() {
        String G = mo23185G();
        if (G != null) {
            return G.hashCode();
        }
        return 0;
    }

    /* renamed from: j */
    public void mo23227j(int i) {
        this.f4742g = i | this.f4742g;
    }

    /* renamed from: j0 */
    public void mo23228j0() {
        List<C6093d> c;
        List<C10507u> list = this.f4738c;
        if (list != null) {
            for (C10507u c2 : list) {
                for (C6093d W0 : c2.mo42176c()) {
                    mo23213W0(W0);
                }
            }
        }
        List<C10507u> v1 = C10510v.m26822v1(this.f4736a, this);
        this.f4738c = v1;
        if (v1 != null && v1.size() > 0 && m7630l() && (c = this.f4738c.get(0).mo42176c()) != null) {
            c.add(m7628O());
        }
        mo23225h0();
    }

    /* renamed from: k0 */
    public abstract boolean mo23145k0();

    /* renamed from: l0 */
    public abstract boolean mo23147l0();

    /* renamed from: m0 */
    public boolean mo23149m0() {
        return !mo23145k0();
    }

    /* renamed from: n */
    public abstract void mo23151n();

    /* renamed from: n0 */
    public final boolean mo23229n0(int i) {
        if ((mo23212W() == Device.Ownership.MINE || !C10510v.m26789k1().contains(Integer.valueOf(i))) && this.f4737b != null) {
            return mo23197N() == null ? this.f4737b.containsKey(Integer.valueOf(i)) && this.f4737b.get(Integer.valueOf(i)).equals(TimerCodec.DISENABLE) : this.f4737b.containsKey(Integer.valueOf(i)) && !this.f4737b.get(Integer.valueOf(i)).equals("-1") && mo23197N().mo42509a(Integer.valueOf(this.f4737b.get(Integer.valueOf(i))).intValue());
        }
        return false;
    }

    /* renamed from: o0 */
    public boolean mo23230o0() {
        return this.f4744i.mo31544J();
    }

    /* renamed from: p */
    public final View mo23231p(Activity activity) {
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        if (this.f4738c != null) {
            for (int i = 0; i < this.f4738c.size(); i++) {
                View a = this.f4738c.get(i).mo42174a(activity, this);
                if (a != null) {
                    linearLayout.addView(a);
                }
            }
        }
        return linearLayout;
    }

    /* renamed from: p0 */
    public abstract boolean mo23153p0();

    /* renamed from: q */
    public final void mo23232q() {
        if (this.f4738c != null) {
            for (int i = 0; i < this.f4738c.size(); i++) {
                this.f4738c.get(i).mo42175b();
            }
        }
    }

    /* renamed from: q0 */
    public boolean mo23233q0() {
        return this.f4755t != null;
    }

    /* renamed from: r */
    public abstract void mo23156r();

    /* renamed from: r0 */
    public boolean mo23234r0() {
        return this.f4755t != null;
    }

    /* renamed from: s */
    public abstract boolean mo23158s(ActionType actionType);

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public void mo23235s0(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("notifyConnStateChanged, device: ");
        sb.append(mo23185G());
        sb.append(", state: ");
        sb.append(i);
        sb.append(" -> ");
        sb.append(i2);
        for (C12143c onConnectionStateChanged : this.f4740e) {
            onConnectionStateChanged.onConnectionStateChanged(i, i2);
        }
    }

    /* renamed from: t0 */
    public void mo23236t0() {
        for (C12143c onConnectionStateChanged : this.f4740e) {
            onConnectionStateChanged.onConnectionStateChanged(11, 0);
        }
    }

    /* renamed from: u */
    public abstract void mo23237u(boolean z);

    /* renamed from: u0 */
    public abstract void mo23161u0(View view);

    /* renamed from: v */
    public abstract void mo23238v(boolean z);

    /* renamed from: v0 */
    public void mo23163v0() {
        mo23133V0((C12143c) null);
        mo23213W0((C12145e) null);
        mo23215X0((C12147g) null);
    }

    /* renamed from: w0 */
    public abstract boolean mo23164w0(String str);

    /* renamed from: x */
    public abstract boolean mo23166x(int i, Object obj);

    /* renamed from: x0 */
    public abstract boolean mo23167x0();

    /* renamed from: y0 */
    public abstract void mo23169y0();

    /* renamed from: z */
    public abstract String[] mo23170z();

    /* renamed from: z0 */
    public void mo23171z0(C12143c cVar) {
        mo23176A0(cVar, true);
    }
}

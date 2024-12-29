package com.yeelight.yeelib.p150c.p151i;

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
import com.yeelight.yeelib.device.models.C7622g;
import com.yeelight.yeelib.device.models.C7628j;
import com.yeelight.yeelib.device.models.C7632k;
import com.yeelight.yeelib.p150c.C4191d;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p181l.C6122c0;
import com.yeelight.yeelib.p150c.p181l.C6126d0;
import com.yeelight.yeelib.p150c.p181l.C6167l0;
import com.yeelight.yeelib.p150c.p183m.C6324c;
import com.yeelight.yeelib.p150c.p184n.C7554e;
import com.yeelight.yeelib.p150c.p184n.C7556g;
import com.yeelight.yeelib.p152f.C4230l;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p152f.C9812t;
import com.yeelight.yeelib.p153g.C9827a;
import com.yeelight.yeelib.p153g.C9830b;
import com.yeelight.yeelib.p153g.C9844m;
import com.yeelight.yeelib.p153g.C9849r;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p185d.C7563a;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p186e.C9772g;
import com.yeelight.yeelib.p190i.C9875a;
import com.yeelight.yeelib.utils.C10555s;
import com.yeelight.yeelib.utils.C4308b;
import com.yeelight.yeelib.wear.C10567a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.c.i.d */
public abstract class C4198d {

    /* renamed from: a */
    protected String f7238a;

    /* renamed from: b */
    private Map<Integer, String> f7239b;

    /* renamed from: c */
    private List<C6122c0> f7240c;

    /* renamed from: d */
    private List<C6038h> f7241d;

    /* renamed from: e */
    protected List<C9768c> f7242e = new CopyOnWriteArrayList();

    /* renamed from: f */
    protected C4191d f7243f;

    /* renamed from: g */
    protected int f7244g = 0;

    /* renamed from: h */
    protected C7628j f7245h;

    /* renamed from: i */
    private C6024e f7246i;

    /* renamed from: j */
    private Device.Ownership f7247j;

    /* renamed from: k */
    private String f7248k;

    /* renamed from: l */
    private int f7249l = 15;

    /* renamed from: m */
    private String f7250m;

    /* renamed from: n */
    protected AbstractDevice f7251n;

    /* renamed from: o */
    protected String f7252o = "";
    /* access modifiers changed from: protected */

    /* renamed from: p */
    public int f7253p = 0;

    /* renamed from: q */
    protected int f7254q = -1;

    /* renamed from: r */
    protected String f7255r;

    /* renamed from: s */
    protected String f7256s;

    /* renamed from: t */
    protected C6324c f7257t;

    /* renamed from: u */
    protected C9770e f7258u = new C4199a();

    /* renamed from: com.yeelight.yeelib.c.i.d$a */
    class C4199a implements C9770e {
        C4199a() {
        }

        public void onStatusChange(int i, C6024e eVar) {
            if (i == 1) {
                C4198d.this.mo23408d0().mo27648K0(true);
            } else if (i == 2) {
                C4198d.this.mo23408d0().mo27648K0(false);
            } else if (i == 4) {
                C4198d.this.mo23408d0().mo27630B0(eVar.mo27726z());
            } else if (i == 8) {
                C4198d.this.mo23408d0().mo27697k0((long) eVar.mo27700m());
            } else if (i == 16) {
                C4198d.this.mo23408d0().mo27699l0(eVar.mo27702n());
            } else if (i == 32) {
                C4198d.this.mo23408d0().mo27707p0(eVar.mo27706p());
            } else if (i == 64) {
                C4198d.this.mo23408d0().mo27701m0(eVar.mo27704o());
            }
        }
    }

    public C4198d(String str, String str2, C6024e eVar) {
        mo23374H0(str);
        this.f7238a = str2;
        mo23388P0(C7632k.m22546g(str2));
        mo23392R0(eVar);
        m11470i0(str2);
    }

    /* renamed from: O */
    private C6167l0 m11469O() {
        return new C6167l0(R$drawable.setting_rename, C4297y.f7456e.getString(R$string.google_home_add_title), 48, mo23372G());
    }

    /* renamed from: i0 */
    private final void m11470i0(String str) {
        this.f7239b = C6126d0.m18426X(str);
    }

    /* renamed from: l */
    private boolean m11471l() {
        return !TextUtils.equals(C4230l.m11766b().mo23552a(), AppConfiguration.Locale.cn.toString()) && !C4257w.m11926R0(mo23395T()) && !TextUtils.equals(mo23395T(), "yeelink.light.ble1") && !TextUtils.equals(mo23395T(), "yeelink.light.gingko") && !TextUtils.equals(mo23395T(), "yeelink.light.gingko.group") && !TextUtils.equals(mo23395T(), "yeelink.light.room") && !TextUtils.equals(mo23395T(), "yeelink.light.group") && !TextUtils.equals(mo23395T(), "yeelink.gateway.v1") && !TextUtils.equals(mo23395T(), "yeelink.gateway.va") && !TextUtils.equals(mo23395T(), "yeelink.wifispeaker.v1") && !TextUtils.equals(mo23395T(), "yeelink.switch.sw1") && !TextUtils.equals(mo23395T(), "yeelink.plug.plug") && !TextUtils.equals(mo23395T(), "yeelink.light.fancl1") && !TextUtils.equals(mo23395T(), "yeelink.light.fancl2") && !TextUtils.equals(mo23395T(), "yeelink.light.fancl5") && !TextUtils.equals(mo23395T(), "yeelink.light.fancl6");
    }

    /* renamed from: A */
    public int mo23299A() {
        return this.f7253p;
    }

    /* renamed from: A0 */
    public void mo23363A0(C9768c cVar, boolean z) {
        if (!this.f7242e.contains(cVar)) {
            "registerConnStateChangeListener : " + cVar;
            this.f7242e.add(cVar);
        }
        if (z) {
            cVar.onConnectionStateChanged(-1, this.f7253p);
        }
    }

    /* renamed from: B */
    public JSONObject mo23364B() {
        C6024e d0;
        int k;
        StringBuilder sb;
        String sb2;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            if (!mo23408d0().mo27681c0()) {
                jSONObject.put("method", "set_power");
                sb2 = "off";
            } else {
                if (mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_COLOR) {
                    jSONObject.put("method", "set_scene");
                    jSONArray.put("color");
                    jSONArray.put(mo23408d0().mo27702n());
                    d0 = mo23408d0();
                } else {
                    if (!(mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_SUNSHINE || mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_COMPUTER)) {
                        if (mo23408d0().mo27726z() != C6024e.C6028d.DEVICE_MODE_READ) {
                            if (mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_FLOW) {
                                jSONObject.put("method", "set_scene");
                                jSONArray.put("cf");
                                int i = 0;
                                jSONArray.put(0);
                                jSONArray.put(0);
                                if (this instanceof C6006h) {
                                    sb = new StringBuilder();
                                    C9827a t = mo23408d0().mo27714t();
                                    if (t != null) {
                                        List<C9844m> h = t.mo31723h();
                                        while (i < h.size()) {
                                            if (i != 0) {
                                                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                            }
                                            sb.append(h.get(i).mo31788c());
                                            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                            sb.append(h.get(i).mo31789d().ordinal());
                                            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                            sb.append(h.get(i).mo31790e());
                                            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                            sb.append(h.get(i).mo31787b());
                                            i++;
                                        }
                                    }
                                } else {
                                    sb = new StringBuilder();
                                    List<C7556g.C7557a> c = mo23408d0().mo27718v().mo28890c();
                                    if (c == null || c.isEmpty()) {
                                        c.add(new C7556g.C7557a(Color.rgb(33, 199, 202), 2000));
                                        c.add(new C7556g.C7557a(Color.rgb(185, 72, 201), 2000));
                                        c.add(new C7556g.C7557a(Color.rgb(219, 37, 109), 2000));
                                        c.add(new C7556g.C7557a(Color.rgb(120, 230, 45), 2000));
                                    }
                                    int size = c.size();
                                    while (i < size) {
                                        if (i != 0) {
                                            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                        }
                                        sb.append(c.get(i).mo28915b());
                                        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                        sb.append(1);
                                        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                        sb.append(c.get(i).mo28914a() & ViewCompat.MEASURED_SIZE_MASK);
                                        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                        sb.append(mo23408d0().mo27700m());
                                        i++;
                                    }
                                }
                                sb2 = sb.toString();
                            } else if (mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_COLOR_HSV) {
                                jSONObject.put("method", "set_scene");
                                jSONArray.put("hsv");
                                jSONArray.put(mo23408d0().mo27718v().mo28895h());
                                jSONArray.put(mo23408d0().mo27718v().mo28899l());
                                d0 = mo23408d0();
                            } else if (mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT) {
                                jSONObject.put("method", "set_scene");
                                jSONArray.put("nightlight");
                                k = mo23408d0().mo27718v().mo28898k();
                                jSONArray.put(k);
                            }
                            jSONObject.put("params", jSONArray);
                            "snapshot of device, command: " + jSONObject.toString();
                            return jSONObject;
                        }
                    }
                    jSONObject.put("method", "set_scene");
                    jSONArray.put("ct");
                    jSONArray.put(mo23408d0().mo27706p());
                    d0 = mo23408d0();
                }
                k = d0.mo27700m();
                jSONArray.put(k);
                jSONObject.put("params", jSONArray);
                "snapshot of device, command: " + jSONObject.toString();
                return jSONObject;
            }
            jSONArray.put(sb2);
            jSONObject.put("params", jSONArray);
        } catch (Exception unused) {
        }
        "snapshot of device, command: " + jSONObject.toString();
        return jSONObject;
    }

    /* renamed from: B0 */
    public void mo23365B0(C9770e eVar) {
        mo23367C0(eVar, true);
    }

    /* renamed from: C */
    public C7554e mo23366C() {
        return (C7554e) mo23408d0().mo27710r(2);
    }

    /* renamed from: C0 */
    public void mo23367C0(C9770e eVar, boolean z) {
        this.f7246i.mo27691h0(eVar, z);
    }

    /* renamed from: D */
    public int mo23368D() {
        return this.f7249l;
    }

    /* renamed from: D0 */
    public void mo23369D0(C9772g gVar) {
        this.f7246i.mo27693i0(gVar);
    }

    /* renamed from: E0 */
    public void mo23370E0(int i) {
        this.f7244g = (i ^ -1) & this.f7244g;
    }

    /* renamed from: F */
    public abstract int mo23303F();

    /* access modifiers changed from: protected */
    /* renamed from: F0 */
    public void mo23371F0(int i) {
        "setConnectState: " + i;
        int i2 = this.f7253p;
        if (i != i2) {
            this.f7254q = i2;
            this.f7253p = i;
            mo23421s0(i2, i);
            if (i == 11 || i == 2 || i == 0) {
                C10567a.m25859c().mo33401a();
            }
        }
    }

    /* renamed from: G */
    public String mo23372G() {
        return this.f7255r;
    }

    /* renamed from: G0 */
    public void mo23373G0(int i) {
        this.f7249l = i;
    }

    /* renamed from: H */
    public abstract int mo23306H();

    /* renamed from: H0 */
    public void mo23374H0(String str) {
        this.f7255r = str;
    }

    /* renamed from: I */
    public C7628j mo23375I() {
        return this.f7245h;
    }

    /* renamed from: I0 */
    public void mo23376I0(String str) {
        this.f7248k = str;
    }

    /* renamed from: J */
    public String mo23377J() {
        return this.f7248k;
    }

    /* renamed from: J0 */
    public void mo23378J0(C7622g gVar) {
        if (mo23408d0().mo27711r0(gVar)) {
            mo23414j0();
        }
    }

    /* renamed from: K */
    public final List<C6122c0> mo23379K() {
        return this.f7240c;
    }

    /* renamed from: K0 */
    public void mo23380K0(C4191d dVar) {
        this.f7243f = dVar;
        if (dVar != null) {
            for (C9768c onLocalConnected : this.f7242e) {
                onLocalConnected.onLocalConnected();
            }
            return;
        }
        for (C9768c onLocalDisconnected : this.f7242e) {
            onLocalDisconnected.onLocalDisconnected();
        }
    }

    /* renamed from: L0 */
    public void mo23381L0(String str) {
        this.f7256s = str;
    }

    /* renamed from: M */
    public List<C6038h> mo23382M() {
        return this.f7241d;
    }

    /* renamed from: M0 */
    public void mo23383M0(AbstractDevice abstractDevice) {
        this.f7251n = abstractDevice;
    }

    /* renamed from: N */
    public final C7622g mo23384N() {
        C6024e eVar = this.f7246i;
        if (eVar != null) {
            return eVar.mo27712s();
        }
        return null;
    }

    /* renamed from: N0 */
    public void mo23385N0(String str) {
        this.f7246i.mo27632C0(str);
    }

    /* renamed from: O0 */
    public void mo23386O0(Device.Ownership ownership) {
        this.f7247j = ownership;
    }

    /* renamed from: P */
    public C4191d mo23387P() {
        return this.f7243f;
    }

    /* renamed from: P0 */
    public void mo23388P0(C7628j jVar) {
        this.f7245h = jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public String mo23389Q(String str) {
        String[] split = str.toLowerCase().split(Constants.COLON_SEPARATOR);
        return split[split.length - 2] + Constants.COLON_SEPARATOR + split[split.length - 1];
    }

    /* renamed from: Q0 */
    public void mo23390Q0(String str) {
        this.f7250m = str;
    }

    /* renamed from: R */
    public String mo23391R() {
        return this.f7256s;
    }

    /* renamed from: R0 */
    public void mo23392R0(C6024e eVar) {
        this.f7246i = eVar;
    }

    /* renamed from: S */
    public AbstractDevice mo23393S() {
        return this.f7251n;
    }

    /* renamed from: S0 */
    public void mo23394S0(String str) {
        this.f7252o = str;
    }

    /* renamed from: T */
    public String mo23395T() {
        return this.f7238a;
    }

    /* renamed from: T0 */
    public void mo23396T0(C6324c cVar) {
        if (cVar != null) {
            cVar.mo23365B0(this.f7258u);
            C6324c cVar2 = this.f7257t;
            if (cVar2 != null) {
                cVar2.mo23400W0(this.f7258u);
            }
        } else {
            C6324c cVar3 = this.f7257t;
            if (cVar3 != null) {
                cVar3.mo23400W0(this.f7258u);
                mo23422t0();
            }
        }
        this.f7257t = cVar;
    }

    /* renamed from: U */
    public String mo23397U() {
        if (!C4308b.f7482a || this.f7243f == null) {
            return this.f7246i.mo27627A();
        }
        return this.f7246i.mo27627A() + " ( LOCAL )";
    }

    /* renamed from: U0 */
    public abstract boolean mo23317U0();

    /* renamed from: V */
    public boolean mo23398V() {
        return this.f7246i.mo27641H() == 1;
    }

    /* renamed from: V0 */
    public void mo23319V0(C9768c cVar) {
        if (cVar == null) {
            this.f7242e.clear();
        } else {
            this.f7242e.remove(cVar);
        }
    }

    /* renamed from: W */
    public Device.Ownership mo23399W() {
        if (this.f7247j == null) {
            this.f7247j = Device.Ownership.NOONES;
        }
        return this.f7247j;
    }

    /* renamed from: W0 */
    public void mo23400W0(C9770e eVar) {
        this.f7246i.mo27666T0(eVar);
    }

    /* renamed from: X */
    public String mo23401X() {
        return "setPower";
    }

    /* renamed from: X0 */
    public void mo23402X0(C9772g gVar) {
        this.f7246i.mo27668U0(gVar);
    }

    /* renamed from: Y */
    public int mo23403Y() {
        return this.f7254q;
    }

    /* renamed from: Y0 */
    public abstract boolean mo23323Y0();

    /* renamed from: Z */
    public String mo23404Z() {
        return this.f7250m;
    }

    /* renamed from: a0 */
    public C9875a mo23405a0() {
        return C9812t.m23832j().mo31686m(this.f7250m);
    }

    /* renamed from: b0 */
    public String mo23406b0() {
        C9875a a0 = mo23405a0();
        return a0 == null ? "" : a0.mo31954o();
    }

    /* renamed from: c0 */
    public C9849r mo23407c0() {
        int i;
        int i2;
        int i3;
        int i4;
        C9856y.C9857a[] aVarArr;
        int i5;
        int i6;
        int i7;
        int m = mo23408d0().mo27700m();
        if ((this instanceof C6006h) || (this instanceof C6033g)) {
            boolean R = mo23408d0().mo27661R();
            C9827a t = mo23408d0().mo27714t();
            if (!R || t == null) {
                if (mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_COLOR || mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_COLOR_HSV) {
                    i3 = m;
                    i = mo23408d0().mo27702n();
                    i4 = 2;
                    i2 = -1;
                } else {
                    if (mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_SUNSHINE || mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_COMPUTER || mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_READ) {
                        if (this.f7245h.mo29076b(C7628j.C7630b.CT_TAB)) {
                            i3 = m;
                            i2 = mo23408d0().mo27706p();
                            i4 = 3;
                            i = -1;
                        }
                    } else if (mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT) {
                        i3 = mo23408d0().mo27635E();
                        i4 = 6;
                        i2 = 2700;
                        i = -1;
                    }
                    i3 = m;
                    i4 = 1;
                    i2 = -1;
                    i = -1;
                }
                return new C9849r("", i4, i3, i2, i, (C9856y.C9857a[]) null);
            }
            C9830b bVar = new C9830b("", -1, t.mo31720d());
            bVar.mo31860I(t);
            return bVar;
        }
        if (this instanceof C6039j) {
            m = C10555s.m25794e(m);
        }
        int i8 = m;
        if (mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_COLOR || mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_COLOR_HSV) {
            aVarArr = null;
            i5 = mo23408d0().mo27702n();
            i7 = 2;
            i6 = -1;
        } else {
            if (mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_SUNSHINE || mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_READ || mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_COMPUTER) {
                if (this.f7245h.mo29076b(C7628j.C7630b.CT_TAB)) {
                    aVarArr = null;
                    i6 = mo23408d0().mo27706p();
                    i7 = 3;
                    i5 = -1;
                }
            } else if (mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_FLOW) {
                List<C7556g.C7557a> o = mo23408d0().mo27704o();
                int size = o.size();
                C9856y.C9857a[] aVarArr2 = new C9856y.C9857a[size];
                for (int i9 = 0; i9 < size; i9++) {
                    aVarArr2[i9] = new C9856y.C9857a(o.get(i9).mo28915b(), 1, o.get(i9).mo28914a(), i8);
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
        return new C9849r("", i7, i8, i6, i5, aVarArr);
    }

    /* renamed from: d0 */
    public C6024e mo23408d0() {
        return this.f7246i;
    }

    /* renamed from: e0 */
    public String mo23409e0() {
        long currentTimeMillis = System.currentTimeMillis();
        if (!mo23416o0()) {
            return C4297y.f7456e.getString(R$string.common_text_status_subtitle_offline);
        }
        if (!mo23331k0()) {
            return mo23333l0() ? C4297y.f7456e.getString(R$string.common_text_status_connecting) : C4297y.f7456e.getString(R$string.common_text_status_subtitle_online);
        }
        if (mo23339p0()) {
            return C4297y.f7456e.getString(R$string.common_text_status_upgrade);
        }
        if (!mo23408d0().mo27681c0()) {
            C6024e.C6027c G = mo23408d0().mo27639G();
            if (G == null) {
                return C4297y.f7456e.getString(R$string.common_text_status_subtitle_off);
            }
            return String.format(C4297y.f7456e.getString(R$string.common_text_status_subtitle_on_job_at_time), new Object[]{new SimpleDateFormat("HH:mm").format(new Date(G.mo27728a()))});
        }
        C6024e.C6027c F = mo23408d0().mo27637F();
        if (F == null) {
            return mo23408d0().mo27677a0() ? C4297y.f7456e.getString(R$string.common_text_status_subtitle_music_flow) : mo23408d0().mo27661R() ? C4297y.f7456e.getString(R$string.common_text_status_subtitle_flow_mode) : mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_COMPUTER ? C4297y.f7456e.getString(R$string.common_text_status_subtitle_pc_mode) : mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_READ ? C4297y.f7456e.getString(R$string.common_text_status_subtitle_reading_mode) : mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT ? C4297y.f7456e.getString(R$string.common_text_status_subtitle_moon_light) : C4297y.f7456e.getString(R$string.common_text_status_subtitle_on);
        }
        long a = F.mo27728a();
        if (F.mo27729b() == C6024e.C6026b.CRON_JOB_TYPE_SCHEDULE) {
            return String.format(C4297y.f7456e.getString(R$string.common_text_status_subtitle_off_job_at_time), new Object[]{new SimpleDateFormat("HH:mm").format(new Date(a))});
        }
        return String.format(C4297y.f7456e.getString(R$string.common_text_status_subtitle_off_job_min), new Object[]{Long.valueOf(((a - currentTimeMillis) / 60) / 1000)});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r3 = ((com.yeelight.yeelib.p150c.p151i.C4198d) r3).mo23372G();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.yeelight.yeelib.p150c.p151i.C4198d
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.yeelight.yeelib.c.i.d r3 = (com.yeelight.yeelib.p150c.p151i.C4198d) r3
            java.lang.String r3 = r3.mo23372G()
            if (r3 == 0) goto L_0x0019
            java.lang.String r0 = r2.mo23372G()
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0019
            r1 = 1
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p151i.C4198d.equals(java.lang.Object):boolean");
    }

    /* renamed from: f0 */
    public String mo23411f0() {
        return this.f7252o;
    }

    /* renamed from: g0 */
    public abstract int mo23329g0();

    /* renamed from: h0 */
    public final void mo23412h0() {
        List<C6038h> list = this.f7241d;
        if (list != null) {
            for (C6038h W0 : list) {
                mo23400W0(W0);
            }
        }
        this.f7241d = C6126d0.m18441d(this.f7238a, this);
    }

    /* renamed from: j */
    public void mo23413j(int i) {
        this.f7244g = i | this.f7244g;
    }

    /* renamed from: j0 */
    public void mo23414j0() {
        List<C6038h> c;
        List<C6122c0> list = this.f7240c;
        if (list != null) {
            for (C6122c0 c2 : list) {
                for (C6038h W0 : c2.mo28007c()) {
                    mo23400W0(W0);
                }
            }
        }
        List<C6122c0> q1 = C6126d0.m18482q1(this.f7238a, this);
        this.f7240c = q1;
        if (q1 != null && q1.size() > 0 && m11471l() && (c = this.f7240c.get(0).mo28007c()) != null) {
            c.add(m11469O());
        }
        mo23412h0();
    }

    /* renamed from: k0 */
    public abstract boolean mo23331k0();

    /* renamed from: l0 */
    public abstract boolean mo23333l0();

    /* renamed from: m0 */
    public boolean mo23335m0() {
        return !mo23331k0();
    }

    /* renamed from: n */
    public abstract void mo23337n();

    /* renamed from: n0 */
    public final boolean mo23415n0(int i) {
        if ((mo23399W() == Device.Ownership.MINE || !C6126d0.m18458i1().contains(Integer.valueOf(i))) && this.f7239b != null) {
            return mo23384N() == null ? this.f7239b.containsKey(Integer.valueOf(i)) && this.f7239b.get(Integer.valueOf(i)).equals(TimerCodec.DISENABLE) : this.f7239b.containsKey(Integer.valueOf(i)) && !this.f7239b.get(Integer.valueOf(i)).equals("-1") && mo23384N().mo29038a(Integer.valueOf(this.f7239b.get(Integer.valueOf(i))).intValue());
        }
        return false;
    }

    /* renamed from: o0 */
    public boolean mo23416o0() {
        return this.f7246i.mo27643I();
    }

    /* renamed from: p */
    public final View mo23417p(Activity activity) {
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        if (this.f7240c != null) {
            for (int i = 0; i < this.f7240c.size(); i++) {
                View a = this.f7240c.get(i).mo28005a(activity, this);
                if (a != null) {
                    linearLayout.addView(a);
                }
            }
        }
        return linearLayout;
    }

    /* renamed from: p0 */
    public abstract boolean mo23339p0();

    /* renamed from: q */
    public final void mo23418q() {
        if (this.f7240c != null) {
            for (int i = 0; i < this.f7240c.size(); i++) {
                this.f7240c.get(i).mo28006b();
            }
        }
    }

    /* renamed from: q0 */
    public boolean mo23419q0() {
        return this.f7257t != null;
    }

    /* renamed from: r */
    public abstract void mo23342r();

    /* renamed from: r0 */
    public boolean mo23420r0() {
        return this.f7257t != null;
    }

    /* renamed from: s */
    public abstract boolean mo23344s(C7563a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public void mo23421s0(int i, int i2) {
        "notifyConnStateChanged, device: " + mo23372G() + ", state: " + i + " -> " + i2;
        for (C9768c onConnectionStateChanged : this.f7242e) {
            onConnectionStateChanged.onConnectionStateChanged(i, i2);
        }
    }

    /* renamed from: t0 */
    public void mo23422t0() {
        for (C9768c onConnectionStateChanged : this.f7242e) {
            onConnectionStateChanged.onConnectionStateChanged(11, 0);
        }
    }

    /* renamed from: u */
    public abstract void mo23423u(boolean z);

    /* renamed from: u0 */
    public abstract void mo23347u0(View view);

    /* renamed from: v */
    public abstract void mo23424v(boolean z);

    /* renamed from: v0 */
    public void mo23349v0() {
        mo23319V0((C9768c) null);
        mo23400W0((C9770e) null);
        mo23402X0((C9772g) null);
    }

    /* renamed from: w0 */
    public abstract boolean mo23351w0(String str);

    /* renamed from: x */
    public abstract boolean mo23353x(int i, Object obj);

    /* renamed from: x0 */
    public abstract boolean mo23354x0();

    /* renamed from: y0 */
    public abstract void mo23356y0();

    /* renamed from: z */
    public abstract String[] mo23357z();

    /* renamed from: z0 */
    public void mo23358z0(C9768c cVar) {
        mo23363A0(cVar, true);
    }
}

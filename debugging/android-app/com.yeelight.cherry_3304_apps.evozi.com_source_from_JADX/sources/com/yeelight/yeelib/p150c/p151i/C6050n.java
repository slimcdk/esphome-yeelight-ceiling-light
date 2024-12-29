package com.yeelight.yeelib.p150c.p151i;

import android.content.Context;
import android.text.TextUtils;
import com.miot.api.CommonHandler;
import com.miot.api.CompletionHandler;
import com.miot.api.DeviceManager;
import com.miot.api.MiotManager;
import com.miot.common.exception.MiotException;
import com.p146mi.iot.common.abstractdevice.AbstractDevice;
import com.p146mi.iot.common.error.IotError;
import com.p146mi.iot.common.handler.CompletedHandler;
import com.p146mi.iot.common.instance.Property;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.models.C7638m0;
import com.yeelight.yeelib.device.models.YeelightTimer;
import com.yeelight.yeelib.device.xiaomi.base.C9763a;
import com.yeelight.yeelib.device.xiaomi.base.C9765c;
import com.yeelight.yeelib.device.xiaomi.base.MiSpecDevice;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p153g.C9830b;
import com.yeelight.yeelib.p153g.C9835f;
import com.yeelight.yeelib.p153g.C9851t;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.utils.C10555s;
import com.yeelight.yeelib.utils.C4308b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.c.i.n */
public abstract class C6050n extends C4200i {

    /* renamed from: B */
    private static Timer f12864B = new Timer();

    /* renamed from: A */
    private String f12865A;

    /* renamed from: x */
    private TimerTask f12866x;
    /* access modifiers changed from: protected */

    /* renamed from: y */
    public boolean f12867y = false;

    /* renamed from: z */
    protected AbstractDevice f12868z;

    /* renamed from: com.yeelight.yeelib.c.i.n$a */
    class C6051a implements CompletedHandler {
        C6051a() {
        }

        public void onFailed(IotError iotError) {
            String str = C6050n.this.f7260v;
            "PROPERTY_ON onFailed: false" + iotError;
        }

        public void onSucceed() {
            String str = C6050n.this.f7260v;
            C6050n.this.mo23408d0().mo27648K0(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.i.n$b */
    class C6052b implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ long f12870a;

        C6052b(long j) {
            this.f12870a = j;
        }

        public void onFailed(IotError iotError) {
            String str = C6050n.this.f7260v;
        }

        public void onSucceed() {
            String str = C6050n.this.f7260v;
            "setBright onSucceed: " + this.f12870a;
            C6050n nVar = C6050n.this;
            nVar.f12867y = true;
            nVar.mo23408d0().mo27697k0(this.f12870a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.i.n$c */
    class C6053c implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f12872a;

        C6053c(int i) {
            this.f12872a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6050n.this.f7260v;
        }

        public void onSucceed() {
            String str = C6050n.this.f7260v;
            "setBright onSucceed: " + this.f12872a;
            C6050n.this.mo23408d0().mo27707p0(this.f12872a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.i.n$d */
    class C6054d implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f12874a;

        C6054d(C9856y yVar) {
            this.f12874a = yVar;
        }

        public void onFailed(IotError iotError) {
            String str = C6050n.this.f7260v;
        }

        public void onSucceed() {
            String str = C6050n.this.f7260v;
            "setScene, bright scene --> onSucceed " + this.f12874a.mo31874f();
            C6050n.this.mo23408d0().mo27697k0((long) C10555s.m25795f(this.f12874a.mo31874f()));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.i.n$e */
    class C6055e implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ C9856y f12876a;

        C6055e(C9856y yVar) {
            this.f12876a = yVar;
        }

        public void onFailed(IotError iotError) {
            String str = C6050n.this.f7260v;
        }

        public void onSucceed() {
            String str = C6050n.this.f7260v;
            "setScene, ct scene --> onSucceed " + this.f12876a.mo31876h();
            C6050n.this.mo23408d0().mo27707p0(this.f12876a.mo31876h());
            if (this.f12876a.mo31874f() > 0) {
                C6050n.this.mo23408d0().mo27697k0((long) C10555s.m25795f(this.f12876a.mo31874f()));
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.c.i.n$f */
    class C6056f implements CompletedHandler {
        C6056f() {
        }

        public void onFailed(IotError iotError) {
            String str = C6050n.this.f7260v;
        }

        public void onSucceed() {
            String str = C6050n.this.f7260v;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.i.n$g */
    class C6057g implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f12879a;

        C6057g(boolean z) {
            this.f12879a = z;
        }

        public void onFailed(IotError iotError) {
            String str = C6050n.this.f7260v;
            "setSmartSwitch --> onFailed " + this.f12879a;
        }

        public void onSucceed() {
            String str = C6050n.this.f7260v;
            "setSmartSwitch --> onSucceed: " + this.f12879a;
            C6050n nVar = C6050n.this;
            nVar.f12867y = true;
            nVar.mo23408d0().mo27696k(this.f12879a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.i.n$h */
    class C6058h implements DeviceManager.TimerListener {
        C6058h() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed(List<com.miot.common.timer.Timer> list) {
            ArrayList arrayList = new ArrayList();
            for (com.miot.common.timer.Timer yeelightTimer : list) {
                arrayList.add(new YeelightTimer(yeelightTimer));
            }
            C6050n.this.mo23408d0().mo27678b(1, arrayList);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.i.n$i */
    class C6059i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f12882a;

        C6059i(String str) {
            this.f12882a = str;
        }

        public void onFailed(int i, String str) {
            String str2 = C6050n.this.f7260v;
            "rename onFailed, error = " + str;
        }

        public void onSucceed() {
            String str = C6050n.this.f7260v;
            C6050n.this.mo23408d0().mo27632C0(this.f12882a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.i.n$j */
    class C6060j implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ String f12884a;

        C6060j(String str) {
            this.f12884a = str;
        }

        public void onFailed(IotError iotError) {
            "rename onFailed, error = " + iotError.toString();
        }

        public void onSucceed() {
            C6050n.this.mo23408d0().mo27632C0(this.f12884a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.i.n$k */
    class C6061k implements CompletionHandler {
        C6061k(C6050n nVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.i.n$l */
    class C6062l extends TimerTask {
        C6062l() {
        }

        public void run() {
            C6050n nVar = C6050n.this;
            if (!nVar.f12867y) {
                nVar.mo27845f2();
            } else {
                nVar.f12867y = false;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.c.i.n$m */
    class C6063m implements CommonHandler<String> {

        /* renamed from: a */
        final /* synthetic */ CompletedHandler f12887a;

        C6063m(CompletedHandler completedHandler) {
            this.f12887a = completedHandler;
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            String str2 = C6050n.this.f7260v;
            "setProperties, onSucceed ret = " + str;
            CompletedHandler completedHandler = this.f12887a;
            if (completedHandler != null) {
                completedHandler.onSucceed();
            }
        }

        public void onFailed(int i, String str) {
            CompletedHandler completedHandler = this.f12887a;
            if (completedHandler != null) {
                completedHandler.onFailed(new IotError(i, str));
            }
            String str2 = C6050n.this.f7260v;
            "setProfileProperty, onFailed ret = " + str + ", i = " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.i.n$n */
    class C6064n implements C9763a<Map<Integer, Object>> {

        /* renamed from: a */
        final /* synthetic */ int f12889a;

        /* renamed from: b */
        final /* synthetic */ C9763a f12890b;

        C6064n(C6050n nVar, int i, C9763a aVar) {
            this.f12889a = i;
            this.f12890b = aVar;
        }

        /* renamed from: a */
        public void onSucceed(Map<Integer, Object> map) {
            Object obj = map.get(Integer.valueOf(this.f12889a));
            C9763a aVar = this.f12890b;
            if (aVar != null) {
                aVar.onSucceed(obj);
            }
        }

        public void onFailed(IotError iotError) {
            this.f12890b.onFailed(iotError);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.i.n$o */
    class C6065o implements CommonHandler<String> {

        /* renamed from: a */
        final /* synthetic */ C9763a f12891a;

        C6065o(C9763a aVar) {
            this.f12891a = aVar;
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            String str2 = C6050n.this.f7260v;
            "getProfileProperties, onSucceed ret = " + str;
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                HashMap hashMap = new HashMap();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    hashMap.put(Integer.valueOf(jSONObject.getInt("piid")), jSONObject.get("value"));
                }
                if (this.f12891a != null) {
                    this.f12891a.onSucceed(hashMap);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            String str2 = C6050n.this.f7260v;
            "getProfileProperties, onFailed ret = " + str + ", i = " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.i.n$p */
    class C6066p implements CompletedHandler {
        C6066p() {
        }

        public void onFailed(IotError iotError) {
            String str = C6050n.this.f7260v;
            "PROPERTY_ON onFailed: true" + iotError;
        }

        public void onSucceed() {
            String str = C6050n.this.f7260v;
            C6050n.this.mo23408d0().mo27648K0(true);
        }
    }

    public C6050n(String str, String str2, String str3, int i, String str4) {
        super(str, str2, new C6024e(str3));
        mo27846g2();
        this.f12865A = str4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C1 */
    public boolean mo27821C1(int i, int i2) {
        mo27843b2(i, i2, Boolean.FALSE, new C6051a());
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D1 */
    public boolean mo27822D1(int i, int i2, boolean z) {
        "enableFlexSwitch: " + z;
        mo27843b2(i, i2, Integer.valueOf(z ? 1 : 0), new C6057g(z));
        return true;
    }

    /* renamed from: E1 */
    public AbstractDevice mo27787E1() {
        return this.f12868z;
    }

    /* renamed from: F1 */
    public void mo27823F1(int i, int[] iArr, C9763a<Map<Integer, Object>> aVar) {
        String str = "/device/rpc/" + mo27788M1();
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("did", mo27788M1());
            jSONObject.put("id", 1);
            jSONObject.put("method", "get_properties");
            for (int put : iArr) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("did", mo27788M1());
                jSONObject2.put("siid", i);
                jSONObject2.put("piid", put);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("params", jSONArray);
        } catch (JSONException e) {
            "setProfileProperties params exception:" + e.toString();
        }
        try {
            MiotManager.getDeviceManager().callSmarthomeApi(str, jSONObject, new C6065o(aVar));
        } catch (MiotException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: G1 */
    public <T> void mo27824G1(int i, int i2, C9763a<T> aVar) {
        mo27823F1(i, new int[]{i2}, new C6064n(this, i2, aVar));
    }

    /* renamed from: H1 */
    public <T> void mo27825H1(int i, int i2, C9763a<T> aVar) {
        AbstractDevice E1 = mo27787E1();
        if (E1 instanceof MiSpecDevice) {
            ((MiSpecDevice) E1).getProperty(i, i2, aVar);
        } else if (!C4308b.f7482a) {
            getClass().getSimpleName() + "   getProperty: illegal " + E1;
        } else {
            throw new C4308b.C4309a("MiSpecDeviceError", "getProperty: AbstractDevice is not a MiSpecDevice. Fix it in YeelightApplication!!!");
        }
    }

    /* renamed from: I1 */
    public abstract List<Property> mo27826I1();

    /* renamed from: J1 */
    public List<Property> mo27827J1(int i, int[] iArr) {
        AbstractDevice E1 = mo27787E1();
        if (E1 == null) {
            return null;
        }
        if (E1 instanceof MiSpecDevice) {
            return ((MiSpecDevice) E1).getQueryProperties(i, iArr);
        }
        if (!C4308b.f7482a) {
            getClass().getSimpleName() + "   getProperties: illegal " + E1;
            return null;
        }
        throw new C4308b.C4309a("MiSpecDeviceError", "getProperties: AbstractDevice is not a MiSpecDevice. Fix it in YeelightApplication!!!" + E1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K1 */
    public String mo27828K1(C9856y yVar) {
        Context context;
        int i;
        if (!TextUtils.isEmpty(yVar.mo31885q())) {
            return yVar.mo31885q();
        }
        if (yVar instanceof C9835f) {
            context = C4297y.f7456e;
            i = R$string.common_text_colors;
        } else if (yVar instanceof C9830b) {
            context = C4297y.f7456e;
            i = R$string.common_text_flow;
        } else if (yVar instanceof C9851t) {
            context = C4297y.f7456e;
            i = R$string.common_text_night_light;
        } else {
            context = C4297y.f7456e;
            i = R$string.common_text_sunshine;
        }
        return context.getString(i);
    }

    /* renamed from: L1 */
    public List<YeelightTimer> mo27829L1() {
        return (List) mo23408d0().mo27710r(1);
    }

    /* renamed from: M0 */
    public void mo23383M0(com.miot.common.abstractdevice.AbstractDevice abstractDevice) {
        super.mo23383M0(abstractDevice);
        mo23385N0(this.f7251n.getName());
    }

    /* renamed from: M1 */
    public String mo27788M1() {
        return this.f12865A;
    }

    /* renamed from: N1 */
    public abstract C7638m0[] mo27830N1(C9856y yVar);

    /* renamed from: O1 */
    public abstract C7638m0[] mo27831O1(boolean z);

    /* renamed from: P1 */
    public abstract void mo27832P1(int i, int i2, Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: Q1 */
    public boolean mo27833Q1(int i, int i2) {
        mo27843b2(i, i2, Boolean.TRUE, new C6066p());
        return true;
    }

    /* renamed from: R1 */
    public void mo27834R1() {
        try {
            MiotManager.getDeviceManager().queryTimerList(mo27788M1(), new C6058h());
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: S1 */
    public boolean mo27835S1(int i, int i2, long j) {
        "setBright: " + j;
        mo27843b2(i, i2, Long.valueOf(j), new C6052b(j));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T1 */
    public boolean mo27836T1(int i, int i2, C9856y yVar) {
        "setBrightScene: " + yVar.mo31874f();
        mo27843b2(i, i2, Integer.valueOf(C10555s.m25790a(yVar.mo31874f(), 500)), new C6054d(yVar));
        return true;
    }

    /* renamed from: U0 */
    public boolean mo23317U0() {
        mo23342r();
        mo23319V0((C9768c) null);
        mo23400W0((C9770e) null);
        DeviceDataProvider.m22405i(this);
        if (this.f7251n == null) {
            return false;
        }
        try {
            MiotManager.getDeviceManager().disclaimOwnership(this.f7251n, new C6061k(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: U1 */
    public boolean mo27837U1(int i, int i2, int i3) {
        "setCt: " + i3;
        mo27843b2(i, i2, Integer.valueOf(i3), new C6053c(i3));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V1 */
    public boolean mo27838V1(int i, int i2, C9856y yVar) {
        "setCtScene: " + yVar.mo31876h();
        mo27843b2(i, i2, Integer.valueOf(C10555s.m25791b(yVar.mo31876h(), yVar.mo31874f())), new C6055e(yVar));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W1 */
    public boolean mo27839W1(int i, int i2, int i3) {
        "setDelayOff: " + i3;
        mo27843b2(i, i2, Integer.valueOf(i3), new C6056f());
        return true;
    }

    /* renamed from: X1 */
    public void mo27789X1(AbstractDevice abstractDevice) {
        this.f12868z = abstractDevice;
        this.f7255r = abstractDevice.getDeviceId();
        mo23408d0().mo27646J0(this.f12868z.isOnline());
        mo23371F0(mo23331k0() ? 11 : 0);
    }

    /* renamed from: Y1 */
    public boolean mo27840Y1(int i) {
        return false;
    }

    /* renamed from: Z1 */
    public void mo27841Z1(int i, int i2, Object obj, CompletedHandler completedHandler) {
        String str = "/device/rpc/" + mo27788M1();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject.put("did", mo27788M1());
            jSONObject.put("id", 1);
            jSONObject.put("method", "set_properties");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("siid", i);
            jSONObject2.put("piid", i2);
            jSONObject2.put("value", obj);
            jSONArray.put(jSONObject2);
            jSONObject.put("params", jSONArray);
        } catch (JSONException e) {
            "setProfileProperty params exception:" + e.toString();
        }
        "setProfileProperty cmd :" + jSONArray.toString() + ", path = " + str + " , jAction = " + jSONObject.toString();
        try {
            MiotManager.getDeviceManager().callSmarthomeApi(str, jSONObject, new C6063m(completedHandler));
        } catch (MiotException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a2 */
    public void mo27842a2(C9765c[] cVarArr, CompletedHandler completedHandler) {
        AbstractDevice E1 = mo27787E1();
        if (!(E1 instanceof MiSpecDevice)) {
            "setProperty: illegal " + E1;
            return;
        }
        ((MiSpecDevice) E1).setProperties(cVarArr, completedHandler);
    }

    /* renamed from: b2 */
    public void mo27843b2(int i, int i2, Object obj, CompletedHandler completedHandler) {
        AbstractDevice E1 = mo27787E1();
        "setProperty model: " + mo23395T() + "  serviceId: " + i + "  propertyId: " + i2 + "  param: " + obj;
        if (!(E1 instanceof MiSpecDevice)) {
            "setProperty: illegal " + E1;
            return;
        }
        ((MiSpecDevice) E1).setProperty(i, i2, obj, completedHandler);
    }

    /* renamed from: c2 */
    public boolean mo27844c2(boolean z) {
        return false;
    }

    /* renamed from: d2 */
    public void mo27790d2(String str) {
    }

    /* renamed from: e2 */
    public void mo27791e2(String str) {
        this.f12865A = str;
    }

    /* renamed from: f2 */
    public abstract boolean mo27845f2();

    /* renamed from: g2 */
    public void mo27846g2() {
        if (this.f12866x == null) {
            C6062l lVar = new C6062l();
            this.f12866x = lVar;
            Timer timer = f12864B;
            if (timer != null) {
                timer.schedule(lVar, 1000, 6000);
            }
        }
    }

    /* renamed from: h2 */
    public void mo27847h2() {
        TimerTask timerTask = this.f12866x;
        if (timerTask != null) {
            timerTask.cancel();
            this.f12866x = null;
        }
        Timer timer = f12864B;
        if (timer != null) {
            timer.purge();
        }
    }

    /* renamed from: i1 */
    public String mo23330i1() {
        return this.f7238a;
    }

    /* renamed from: k0 */
    public boolean mo23331k0() {
        AbstractDevice abstractDevice = this.f12868z;
        return abstractDevice != null && abstractDevice.isOnline();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public void mo23421s0(int i, int i2) {
        "SpecDeviceBase, notifyConnStateChanged, " + i + " -> " + i2;
        for (C9768c onConnectionStateChanged : this.f7242e) {
            onConnectionStateChanged.onConnectionStateChanged(i, i2);
        }
        if (i2 == 11) {
            mo23356y0();
        }
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27847h2();
    }

    /* renamed from: w1 */
    public boolean mo23352w1(C6024e.C6028d dVar) {
        mo23408d0().mo27630B0(dVar);
        return true;
    }

    /* renamed from: x */
    public boolean mo23353x(int i, Object obj) {
        if (i == 0 || i == 1) {
            String str = (String) obj;
            "rename --> invoke, name = " + str;
            if (TextUtils.equals(mo23395T(), "yeelink.switch.sw1")) {
                try {
                    MiotManager.getDeviceManager().renameDevice(this.f7251n, str, new C6059i(str));
                    return false;
                } catch (MiotException e) {
                    e.printStackTrace();
                    return false;
                }
            } else {
                MiotManager.getControllerManager().renameDevice(this.f12868z.getDevice(), str, new C6060j(str));
                return false;
            }
        } else if (i != 8) {
            return false;
        } else {
            mo27834R1();
            return false;
        }
    }

    /* renamed from: y0 */
    public void mo23356y0() {
        mo23414j0();
    }
}

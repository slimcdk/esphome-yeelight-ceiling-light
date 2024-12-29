package com.yeelight.yeelib.device.base;

import android.content.Context;
import android.text.TextUtils;
import com.miot.api.CommonHandler;
import com.miot.api.CompletionHandler;
import com.miot.api.DeviceManager;
import com.miot.api.MiotManager;
import com.miot.common.exception.MiotException;
import com.p022mi.iot.common.abstractdevice.AbstractDevice;
import com.p022mi.iot.common.error.IotError;
import com.p022mi.iot.common.handler.CompletedHandler;
import com.p022mi.iot.common.instance.Property;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.models.YeelightTimer;
import com.yeelight.yeelib.device.xiaomi.base.C8251a;
import com.yeelight.yeelib.device.xiaomi.base.C8253c;
import com.yeelight.yeelib.device.xiaomi.base.MiSpecDevice;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.models.C8309b;
import com.yeelight.yeelib.models.C8313f;
import com.yeelight.yeelib.models.C8322n;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p051j4.C9201q;
import p227x3.C11980p;
import p237z3.C12143c;
import p237z3.C12145e;

/* renamed from: com.yeelight.yeelib.device.base.g */
public abstract class C6100g extends C3012e {

    /* renamed from: B */
    private static Timer f12523B = new Timer();

    /* renamed from: A */
    private String f12524A;

    /* renamed from: x */
    private TimerTask f12525x;
    /* access modifiers changed from: protected */

    /* renamed from: y */
    public boolean f12526y = false;

    /* renamed from: z */
    protected AbstractDevice f12527z;

    /* renamed from: com.yeelight.yeelib.device.base.g$a */
    class C6101a implements CompletedHandler {
        C6101a() {
        }

        public void onFailed(IotError iotError) {
            String str = C6100g.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("PROPERTY_ON onFailed: false");
            sb.append(iotError);
        }

        public void onSucceed() {
            String str = C6100g.this.f4758v;
            C6100g.this.mo23221d0().mo31551M0(false);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.base.g$b */
    class C6102b implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ long f12529a;

        C6102b(long j) {
            this.f12529a = j;
        }

        public void onFailed(IotError iotError) {
            String str = C6100g.this.f4758v;
        }

        public void onSucceed() {
            String str = C6100g.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setBright onSucceed: ");
            sb.append(this.f12529a);
            C6100g gVar = C6100g.this;
            gVar.f12526y = true;
            gVar.mo23221d0().mo31600l0(this.f12529a);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.base.g$c */
    class C6103c implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f12531a;

        C6103c(int i) {
            this.f12531a = i;
        }

        public void onFailed(IotError iotError) {
            String str = C6100g.this.f4758v;
        }

        public void onSucceed() {
            String str = C6100g.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setBright onSucceed: ");
            sb.append(this.f12531a);
            C6100g.this.mo23221d0().mo31610q0(this.f12531a);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.base.g$d */
    class C6104d implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f12533a;

        C6104d(C8327s sVar) {
            this.f12533a = sVar;
        }

        public void onFailed(IotError iotError) {
            String str = C6100g.this.f4758v;
        }

        public void onSucceed() {
            String str = C6100g.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setScene, bright scene --> onSucceed ");
            sb.append(this.f12533a.mo35439f());
            C6100g.this.mo23221d0().mo31600l0((long) C9201q.m22194f(this.f12533a.mo35439f()));
        }
    }

    /* renamed from: com.yeelight.yeelib.device.base.g$e */
    class C6105e implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ C8327s f12535a;

        C6105e(C8327s sVar) {
            this.f12535a = sVar;
        }

        public void onFailed(IotError iotError) {
            String str = C6100g.this.f4758v;
        }

        public void onSucceed() {
            String str = C6100g.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setScene, ct scene --> onSucceed ");
            sb.append(this.f12535a.mo35441h());
            C6100g.this.mo23221d0().mo31610q0(this.f12535a.mo35441h());
            if (this.f12535a.mo35439f() > 0) {
                C6100g.this.mo23221d0().mo31600l0((long) C9201q.m22194f(this.f12535a.mo35439f()));
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.base.g$f */
    class C6106f implements CompletedHandler {
        C6106f() {
        }

        public void onFailed(IotError iotError) {
            String str = C6100g.this.f4758v;
        }

        public void onSucceed() {
            String str = C6100g.this.f4758v;
        }
    }

    /* renamed from: com.yeelight.yeelib.device.base.g$g */
    class C6107g implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f12538a;

        C6107g(boolean z) {
            this.f12538a = z;
        }

        public void onFailed(IotError iotError) {
            String str = C6100g.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setSmartSwitch --> onFailed ");
            sb.append(this.f12538a);
        }

        public void onSucceed() {
            String str = C6100g.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setSmartSwitch --> onSucceed: ");
            sb.append(this.f12538a);
            C6100g gVar = C6100g.this;
            gVar.f12526y = true;
            gVar.mo23221d0().mo31597k(this.f12538a);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.base.g$h */
    class C6108h implements DeviceManager.TimerListener {
        C6108h() {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed(List<com.miot.common.timer.Timer> list) {
            ArrayList arrayList = new ArrayList();
            for (com.miot.common.timer.Timer yeelightTimer : list) {
                arrayList.add(new YeelightTimer(yeelightTimer));
            }
            C6100g.this.mo23221d0().mo31579b(1, arrayList);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.base.g$i */
    class C6109i implements CompletionHandler {

        /* renamed from: a */
        final /* synthetic */ String f12541a;

        C6109i(String str) {
            this.f12541a = str;
        }

        public void onFailed(int i, String str) {
            String str2 = C6100g.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("rename onFailed, error = ");
            sb.append(str);
        }

        public void onSucceed() {
            String str = C6100g.this.f4758v;
            C6100g.this.mo23221d0().mo31533D0(this.f12541a);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.base.g$j */
    class C6110j implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ String f12543a;

        C6110j(String str) {
            this.f12543a = str;
        }

        public void onFailed(IotError iotError) {
            StringBuilder sb = new StringBuilder();
            sb.append("rename onFailed, error = ");
            sb.append(iotError.toString());
        }

        public void onSucceed() {
            C6100g.this.mo23221d0().mo31533D0(this.f12543a);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.base.g$k */
    class C6111k implements CompletionHandler {
        C6111k(C6100g gVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.device.base.g$l */
    class C6112l extends TimerTask {
        C6112l() {
        }

        public void run() {
            C6100g gVar = C6100g.this;
            if (!gVar.f12526y) {
                gVar.mo31731f2();
            } else {
                gVar.f12526y = false;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.base.g$m */
    class C6113m implements CommonHandler<String> {

        /* renamed from: a */
        final /* synthetic */ CompletedHandler f12546a;

        C6113m(CompletedHandler completedHandler) {
            this.f12546a = completedHandler;
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            String str2 = C6100g.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setProperties, onSucceed ret = ");
            sb.append(str);
            CompletedHandler completedHandler = this.f12546a;
            if (completedHandler != null) {
                completedHandler.onSucceed();
            }
        }

        public void onFailed(int i, String str) {
            CompletedHandler completedHandler = this.f12546a;
            if (completedHandler != null) {
                completedHandler.onFailed(new IotError(i, str));
            }
            String str2 = C6100g.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setProfileProperty, onFailed ret = ");
            sb.append(str);
            sb.append(", i = ");
            sb.append(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.base.g$n */
    class C6114n implements C8251a<Map<Integer, Object>> {

        /* renamed from: a */
        final /* synthetic */ int f12548a;

        /* renamed from: b */
        final /* synthetic */ C8251a f12549b;

        C6114n(C6100g gVar, int i, C8251a aVar) {
            this.f12548a = i;
            this.f12549b = aVar;
        }

        /* renamed from: a */
        public void onSucceed(Map<Integer, Object> map) {
            Object obj = map.get(Integer.valueOf(this.f12548a));
            C8251a aVar = this.f12549b;
            if (aVar != null) {
                aVar.onSucceed(obj);
            }
        }

        public void onFailed(IotError iotError) {
            this.f12549b.onFailed(iotError);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.base.g$o */
    class C6115o implements CommonHandler<String> {

        /* renamed from: a */
        final /* synthetic */ C8251a f12550a;

        C6115o(C8251a aVar) {
            this.f12550a = aVar;
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            String str2 = C6100g.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("getProfileProperties, onSucceed ret = ");
            sb.append(str);
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                HashMap hashMap = new HashMap();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    hashMap.put(Integer.valueOf(jSONObject.getInt("piid")), jSONObject.get("value"));
                }
                C8251a aVar = this.f12550a;
                if (aVar != null) {
                    aVar.onSucceed(hashMap);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            String str2 = C6100g.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("getProfileProperties, onFailed ret = ");
            sb.append(str);
            sb.append(", i = ");
            sb.append(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.base.g$p */
    class C6116p implements CompletedHandler {
        C6116p() {
        }

        public void onFailed(IotError iotError) {
            String str = C6100g.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("PROPERTY_ON onFailed: true");
            sb.append(iotError);
        }

        public void onSucceed() {
            String str = C6100g.this.f4758v;
            C6100g.this.mo23221d0().mo31551M0(true);
        }
    }

    public C6100g(String str, String str2, String str3, int i, String str4) {
        super(str, str2, new DeviceStatusBase(str3));
        mo31732g2();
        this.f12524A = str4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C1 */
    public boolean mo31707C1(int i, int i2) {
        mo31729b2(i, i2, Boolean.FALSE, new C6101a());
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D1 */
    public boolean mo31708D1(int i, int i2, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("enableFlexSwitch: ");
        sb.append(z);
        mo31729b2(i, i2, Integer.valueOf(z ? 1 : 0), new C6107g(z));
        return true;
    }

    /* renamed from: E1 */
    public AbstractDevice mo31697E1() {
        return this.f12527z;
    }

    /* renamed from: F1 */
    public void mo31709F1(int i, int[] iArr, C8251a<Map<Integer, Object>> aVar) {
        String str = "/device/rpc/" + mo31698M1();
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("did", mo31698M1());
            jSONObject.put("id", 1);
            jSONObject.put("method", "get_properties");
            for (int put : iArr) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("did", mo31698M1());
                jSONObject2.put("siid", i);
                jSONObject2.put("piid", put);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("params", jSONArray);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("setProfileProperties params exception:");
            sb.append(e.toString());
        }
        try {
            MiotManager.getDeviceManager().callSmarthomeApi(str, jSONObject, new C6115o(aVar));
        } catch (MiotException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: G1 */
    public <T> void mo31710G1(int i, int i2, C8251a<T> aVar) {
        mo31709F1(i, new int[]{i2}, new C6114n(this, i2, aVar));
    }

    /* renamed from: H1 */
    public <T> void mo31711H1(int i, int i2, C8251a<T> aVar) {
        AbstractDevice E1 = mo31697E1();
        if (E1 instanceof MiSpecDevice) {
            ((MiSpecDevice) E1).getProperty(i, i2, aVar);
        } else if (!AppUtils.f4977a) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append("   getProperty: illegal ");
            sb.append(E1);
        } else {
            throw new AppUtils.SuicideException("MiSpecDeviceError", "getProperty: AbstractDevice is not a MiSpecDevice. Fix it in YeelightApplication!!!");
        }
    }

    /* renamed from: I1 */
    public abstract List<Property> mo31712I1();

    /* renamed from: J1 */
    public List<Property> mo31713J1(int i, int[] iArr) {
        AbstractDevice E1 = mo31697E1();
        if (E1 == null) {
            return null;
        }
        if (E1 instanceof MiSpecDevice) {
            return ((MiSpecDevice) E1).getQueryProperties(i, iArr);
        }
        if (!AppUtils.f4977a) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append("   getProperties: illegal ");
            sb.append(E1);
            return null;
        }
        throw new AppUtils.SuicideException("MiSpecDeviceError", "getProperties: AbstractDevice is not a MiSpecDevice. Fix it in YeelightApplication!!!" + E1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K1 */
    public String mo31714K1(C8327s sVar) {
        Context context;
        int i;
        if (!TextUtils.isEmpty(sVar.mo35450q())) {
            return sVar.mo35450q();
        }
        if (sVar instanceof C8313f) {
            context = C3108x.f4951e;
            i = R$string.common_text_colors;
        } else if (sVar instanceof C8309b) {
            context = C3108x.f4951e;
            i = R$string.common_text_flow;
        } else if (sVar instanceof C8322n) {
            context = C3108x.f4951e;
            i = R$string.common_text_night_light;
        } else {
            context = C3108x.f4951e;
            i = R$string.common_text_sunshine;
        }
        return context.getString(i);
    }

    /* renamed from: L1 */
    public List<YeelightTimer> mo31715L1() {
        return (List) mo23221d0().mo31611r(1);
    }

    /* renamed from: M0 */
    public void mo23196M0(com.miot.common.abstractdevice.AbstractDevice abstractDevice) {
        super.mo23196M0(abstractDevice);
        mo23198N0(this.f4749n.getName());
    }

    /* renamed from: M1 */
    public String mo31698M1() {
        return this.f12524A;
    }

    /* renamed from: N1 */
    public abstract C11980p[] mo31716N1(C8327s sVar);

    /* renamed from: O1 */
    public abstract C11980p[] mo31717O1(boolean z);

    /* renamed from: P1 */
    public abstract void mo31718P1(int i, int i2, Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: Q1 */
    public boolean mo31719Q1(int i, int i2) {
        mo31729b2(i, i2, Boolean.TRUE, new C6116p());
        return true;
    }

    /* renamed from: R1 */
    public void mo31720R1() {
        try {
            MiotManager.getDeviceManager().queryTimerList(mo31698M1(), new C6108h());
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: S1 */
    public boolean mo31721S1(int i, int i2, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("setBright: ");
        sb.append(j);
        mo31729b2(i, i2, Long.valueOf(j), new C6102b(j));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T1 */
    public boolean mo31722T1(int i, int i2, C8327s sVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("setBrightScene: ");
        sb.append(sVar.mo35439f());
        mo31729b2(i, i2, Integer.valueOf(C9201q.m22189a(sVar.mo35439f(), 500)), new C6104d(sVar));
        return true;
    }

    /* renamed from: U0 */
    public boolean mo23131U0() {
        mo23156r();
        mo23133V0((C12143c) null);
        mo23213W0((C12145e) null);
        DeviceDataProvider.m17627i(this);
        if (this.f4749n == null) {
            return false;
        }
        try {
            MiotManager.getDeviceManager().disclaimOwnership(this.f4749n, new C6111k(this));
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: U1 */
    public boolean mo31723U1(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append("setCt: ");
        sb.append(i3);
        mo31729b2(i, i2, Integer.valueOf(i3), new C6103c(i3));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V1 */
    public boolean mo31724V1(int i, int i2, C8327s sVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("setCtScene: ");
        sb.append(sVar.mo35441h());
        mo31729b2(i, i2, Integer.valueOf(C9201q.m22190b(sVar.mo35441h(), sVar.mo35439f())), new C6105e(sVar));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W1 */
    public boolean mo31725W1(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append("setDelayOff: ");
        sb.append(i3);
        mo31729b2(i, i2, Integer.valueOf(i3), new C6106f());
        return true;
    }

    /* renamed from: X1 */
    public void mo31699X1(AbstractDevice abstractDevice) {
        this.f12527z = abstractDevice;
        this.f4753r = abstractDevice.getDeviceId();
        mo23221d0().mo31549L0(this.f12527z.isOnline());
        mo23184F0(mo23145k0() ? 11 : 0);
    }

    /* renamed from: Y1 */
    public boolean mo31726Y1(int i) {
        return false;
    }

    /* renamed from: Z1 */
    public void mo31727Z1(int i, int i2, Object obj, CompletedHandler completedHandler) {
        String str = "/device/rpc/" + mo31698M1();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject.put("did", mo31698M1());
            jSONObject.put("id", 1);
            jSONObject.put("method", "set_properties");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("siid", i);
            jSONObject2.put("piid", i2);
            jSONObject2.put("value", obj);
            jSONArray.put(jSONObject2);
            jSONObject.put("params", jSONArray);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("setProfileProperty params exception:");
            sb.append(e.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("setProfileProperty cmd :");
        sb2.append(jSONArray.toString());
        sb2.append(", path = ");
        sb2.append(str);
        sb2.append(" , jAction = ");
        sb2.append(jSONObject.toString());
        try {
            MiotManager.getDeviceManager().callSmarthomeApi(str, jSONObject, new C6113m(completedHandler));
        } catch (MiotException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a2 */
    public void mo31728a2(C8253c[] cVarArr, CompletedHandler completedHandler) {
        AbstractDevice E1 = mo31697E1();
        if (!(E1 instanceof MiSpecDevice)) {
            StringBuilder sb = new StringBuilder();
            sb.append("setProperty: illegal ");
            sb.append(E1);
            return;
        }
        ((MiSpecDevice) E1).setProperties(cVarArr, completedHandler);
    }

    /* renamed from: b2 */
    public void mo31729b2(int i, int i2, Object obj, CompletedHandler completedHandler) {
        AbstractDevice E1 = mo31697E1();
        StringBuilder sb = new StringBuilder();
        sb.append("setProperty model: ");
        sb.append(mo23208T());
        sb.append("  serviceId: ");
        sb.append(i);
        sb.append("  propertyId: ");
        sb.append(i2);
        sb.append("  param: ");
        sb.append(obj);
        if (!(E1 instanceof MiSpecDevice)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("setProperty: illegal ");
            sb2.append(E1);
            return;
        }
        ((MiSpecDevice) E1).setProperty(i, i2, obj, completedHandler);
    }

    /* renamed from: c2 */
    public boolean mo31730c2(boolean z) {
        return false;
    }

    /* renamed from: d2 */
    public void mo31700d2(String str) {
    }

    /* renamed from: e2 */
    public void mo31701e2(String str) {
        this.f12524A = str;
    }

    /* renamed from: f2 */
    public abstract boolean mo31731f2();

    /* renamed from: g2 */
    public void mo31732g2() {
        if (this.f12525x == null) {
            C6112l lVar = new C6112l();
            this.f12525x = lVar;
            Timer timer = f12523B;
            if (timer != null) {
                timer.schedule(lVar, 1000, 6000);
            }
        }
    }

    /* renamed from: h2 */
    public void mo31733h2() {
        TimerTask timerTask = this.f12525x;
        if (timerTask != null) {
            timerTask.cancel();
            this.f12525x = null;
        }
        Timer timer = f12523B;
        if (timer != null) {
            timer.purge();
        }
    }

    /* renamed from: i1 */
    public String mo23144i1() {
        return this.f4736a;
    }

    /* renamed from: k0 */
    public boolean mo23145k0() {
        AbstractDevice abstractDevice = this.f12527z;
        return abstractDevice != null && abstractDevice.isOnline();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public void mo23235s0(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("SpecDeviceBase, notifyConnStateChanged, ");
        sb.append(i);
        sb.append(" -> ");
        sb.append(i2);
        for (C12143c onConnectionStateChanged : this.f4740e) {
            onConnectionStateChanged.onConnectionStateChanged(i, i2);
        }
        if (i2 == 11) {
            mo23169y0();
        }
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31733h2();
    }

    /* renamed from: w1 */
    public boolean mo23165w1(DeviceStatusBase.DeviceMode deviceMode) {
        mo23221d0().mo31531C0(deviceMode);
        return true;
    }

    /* renamed from: x */
    public boolean mo23166x(int i, Object obj) {
        if (i == 0 || i == 1) {
            String str = (String) obj;
            StringBuilder sb = new StringBuilder();
            sb.append("rename --> invoke, name = ");
            sb.append(str);
            if (TextUtils.equals(mo23208T(), "yeelink.switch.sw1")) {
                try {
                    MiotManager.getDeviceManager().renameDevice(this.f4749n, str, new C6109i(str));
                    return false;
                } catch (MiotException e) {
                    e.printStackTrace();
                    return false;
                }
            } else {
                MiotManager.getControllerManager().renameDevice(this.f12527z.getDevice(), str, new C6110j(str));
                return false;
            }
        } else if (i != 8) {
            return false;
        } else {
            mo31720R1();
            return false;
        }
    }

    /* renamed from: y0 */
    public void mo23169y0() {
        mo23228j0();
    }
}

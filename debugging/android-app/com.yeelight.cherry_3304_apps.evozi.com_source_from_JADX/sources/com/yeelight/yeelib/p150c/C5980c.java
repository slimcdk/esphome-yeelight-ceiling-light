package com.yeelight.yeelib.p150c;

import android.content.Intent;
import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.miot.api.CommonHandler;
import com.miot.common.device.Device;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.data.C7579c;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.models.C7615c0;
import com.yeelight.yeelib.device.models.C7628j;
import com.yeelight.yeelib.device.models.C7632k;
import com.yeelight.yeelib.device.models.C7639n;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6039j;
import com.yeelight.yeelib.p150c.p151i.C6050n;
import com.yeelight.yeelib.p150c.p184n.C7554e;
import com.yeelight.yeelib.p150c.p184n.C7555f;
import com.yeelight.yeelib.p150c.p184n.C7556g;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p153g.C9827a;
import com.yeelight.yeelib.p153g.C9844m;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p185d.C7563a;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p186e.C9772g;
import com.yeelight.yeelib.utils.C10555s;
import com.yeelight.yeelib.utils.C4308b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.c.c */
public class C5980c extends C4200i implements C9768c, C9770e, C9772g {
    /* access modifiers changed from: private */

    /* renamed from: B */
    public static final String f12670B = "c";

    /* renamed from: A */
    Handler f12671A = new C5991k(Looper.getMainLooper());

    /* renamed from: x */
    CopyOnWriteArrayList<C4200i> f12672x = new CopyOnWriteArrayList<>();

    /* renamed from: y */
    private ContentObserver f12673y = new C5990j(new Handler(Looper.getMainLooper()));

    /* renamed from: z */
    int f12674z;

    /* renamed from: com.yeelight.yeelib.c.c$a */
    class C5981a implements CommonHandler<String> {

        /* renamed from: a */
        final /* synthetic */ long f12675a;

        C5981a(long j) {
            this.f12675a = j;
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "device group setBright, onSucceed : " + str;
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int i2 = jSONObject.getInt("code");
                    String string = jSONObject.getString("did");
                    if (i2 == 0) {
                        C4200i J1 = C5980c.this.mo27497J1(string);
                        if (J1 != null) {
                            J1.mo23408d0().mo27697k0(this.f12675a);
                        } else {
                            C4308b.m12139r(C5980c.f12670B, "Invalid did return from cloud: " + string);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            "device group setBright, onFailed : error : " + str + " , error code : " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.c$b */
    class C5982b implements CommonHandler<String> {

        /* renamed from: a */
        final /* synthetic */ int f12677a;

        C5982b(int i) {
            this.f12677a = i;
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "device group setCt, onSucceed : " + str;
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int i2 = jSONObject.getInt("code");
                    String string = jSONObject.getString("did");
                    if (i2 == 0) {
                        C4200i J1 = C5980c.this.mo27497J1(string);
                        if (J1 != null) {
                            J1.mo23408d0().mo27707p0(this.f12677a);
                        } else {
                            C4308b.m12139r(C5980c.f12670B, "Invalid did return from cloud: " + string);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            "device group setCt, onFailed : error : " + str + " , error code : " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.c$c */
    class C5983c implements CommonHandler<String> {

        /* renamed from: a */
        final /* synthetic */ int f12679a;

        C5983c(int i) {
            this.f12679a = i;
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "device group setCt, onSucceed : " + str;
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int i2 = jSONObject.getInt("code");
                    String string = jSONObject.getString("did");
                    if (i2 == 0) {
                        C4200i J1 = C5980c.this.mo27497J1(string);
                        if (J1 != null) {
                            J1.mo23408d0().mo27707p0(this.f12679a);
                        } else {
                            C4308b.m12139r(C5980c.f12670B, "Invalid did return from cloud: " + string);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            "device group setCt, onFailed : error : " + str + " , error code : " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.c$d */
    class C5984d implements CommonHandler<String> {

        /* renamed from: a */
        final /* synthetic */ int f12681a;

        C5984d(int i) {
            this.f12681a = i;
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "device group setColor, onSucceed : " + str;
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int i2 = jSONObject.getInt("code");
                    String string = jSONObject.getString("did");
                    if (i2 == 0) {
                        C4200i J1 = C5980c.this.mo27497J1(string);
                        if (J1 != null) {
                            J1.mo23408d0().mo27699l0(this.f12681a);
                        } else {
                            C4308b.m12139r(C5980c.f12670B, "Invalid did return from cloud: " + string);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            "device group setColor, onFailed : error : " + str + " , error code : " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.c$e */
    class C5985e implements CommonHandler<String> {

        /* renamed from: a */
        final /* synthetic */ int f12683a;

        C5985e(int i) {
            this.f12683a = i;
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "device group setColor, onSucceed : " + str;
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int i2 = jSONObject.getInt("code");
                    String string = jSONObject.getString("did");
                    if (i2 == 0) {
                        C4200i J1 = C5980c.this.mo27497J1(string);
                        if (J1 != null) {
                            J1.mo23408d0().mo27699l0(this.f12683a);
                        } else {
                            C4308b.m12139r(C5980c.f12670B, "Invalid did return from cloud: " + string);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            "device group setColor, onFailed : error : " + str + " , error code : " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.c$f */
    class C5986f implements CommonHandler<String> {

        /* renamed from: a */
        final /* synthetic */ C9856y f12685a;

        C5986f(C9856y yVar) {
            this.f12685a = yVar;
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "device group setScene, onSucceed : " + str;
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int i2 = jSONObject.getInt("code");
                    String string = jSONObject.getString("did");
                    if (i2 == 0) {
                        C4200i J1 = C5980c.this.mo27497J1(string);
                        if (J1 != null) {
                            J1.mo23408d0().mo27654N0(this.f12685a);
                        } else {
                            C4308b.m12139r(C5980c.f12670B, "Invalid did return from cloud: " + string);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            "device group setScene, onFailed : error : " + str + " , error code : " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.c$g */
    class C5987g implements CommonHandler<String> {

        /* renamed from: a */
        final /* synthetic */ C9856y f12687a;

        C5987g(C9856y yVar) {
            this.f12687a = yVar;
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "device group setScene, onSucceed : " + str;
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int i2 = jSONObject.getInt("code");
                    String string = jSONObject.getString("did");
                    if (i2 == 0) {
                        C4200i J1 = C5980c.this.mo27497J1(string);
                        if (J1 != null) {
                            J1.mo23408d0().mo27654N0(this.f12687a);
                        } else {
                            C4308b.m12139r(C5980c.f12670B, "Invalid did return from cloud: " + string);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            "device group setScene, onFailed : error : " + str + " , error code : " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.c$h */
    class C5988h implements CommonHandler<String> {
        C5988h(C5980c cVar) {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "device group cron_add, onSucceed : " + str;
        }

        public void onFailed(int i, String str) {
            "device group open, onFailed : error : " + str + " , error code : " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.c$i */
    class C5989i implements CommonHandler<String> {
        C5989i(C5980c cVar) {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "device group cron_del, onSucceed : " + str;
        }

        public void onFailed(int i, String str) {
            "device cron_del, onFailed : error : " + str + " , error code : " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.c$j */
    class C5990j extends ContentObserver {
        C5990j(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z) {
            super.onChange(z);
            C5980c.this.mo27503P1();
        }
    }

    /* renamed from: com.yeelight.yeelib.c.c$k */
    class C5991k extends Handler {
        C5991k(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            C6024e eVar;
            int i = message.what;
            int i2 = 0;
            if (i == 1) {
                Iterator<C4200i> it = C5980c.this.f12672x.iterator();
                while (it.hasNext()) {
                    C4200i next = it.next();
                    if ((next instanceof C5972a) && !next.mo23331k0() && !next.mo23333l0()) {
                        "DeviceGroup, auto connect to device: " + next.mo23372G();
                        next.mo23337n();
                        i2 = 1;
                    }
                }
                if (i2 != 0) {
                    C5980c.this.f12671A.sendEmptyMessageDelayed(1, 5000);
                }
            } else if (i == 2) {
                C7554e eVar2 = (C7554e) C5980c.this.mo23408d0().mo27710r(2);
                if (eVar2 != null) {
                    eVar2.mo28884e(0);
                }
                Iterator<C4200i> it2 = C5980c.this.f12672x.iterator();
                boolean z = false;
                while (it2.hasNext()) {
                    C4200i next2 = it2.next();
                    C7554e eVar3 = (C7554e) next2.mo23408d0().mo27710r(2);
                    if (eVar3 != null) {
                        if (eVar2 == null) {
                            eVar2 = eVar3;
                        } else if (eVar3.mo28880a() > eVar2.mo28880a()) {
                            eVar2.mo28884e(eVar3.mo28880a());
                        }
                        if (eVar3.mo28882c()) {
                            z = true;
                        }
                        "device " + next2.mo23397U() + " delayOff = " + eVar3.mo28880a();
                    }
                }
                if (eVar2 == null) {
                    eVar = C5980c.this.mo23408d0();
                    i2 = -1;
                } else if (z) {
                    C5980c.this.mo23408d0().mo27670V0(eVar2.mo28880a());
                    return;
                } else {
                    eVar = C5980c.this.mo23408d0();
                }
                eVar.mo27670V0(i2);
            } else if (i == 3) {
                C5980c.this.mo27512Y1();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.c.c$l */
    class C5992l implements CommonHandler<String> {
        C5992l() {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "device group open, onSucceed : " + str;
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int i2 = jSONObject.getInt("code");
                    String string = jSONObject.getString("did");
                    if (i2 == 0) {
                        C4200i J1 = C5980c.this.mo27497J1(string);
                        if (J1 != null) {
                            J1.mo23408d0().mo27648K0(true);
                        } else {
                            C4308b.m12139r(C5980c.f12670B, "Invalid did return from cloud: " + string);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            "device group open, onFailed : error : " + str + " , error code : " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.c$m */
    class C5993m implements CommonHandler<String> {
        C5993m() {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "device group open, onSucceed : " + str;
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int i2 = jSONObject.getInt("code");
                    String string = jSONObject.getString("did");
                    if (i2 == 0) {
                        C4200i J1 = C5980c.this.mo27497J1(string);
                        if (J1 != null) {
                            J1.mo23408d0().mo27648K0(true);
                        } else {
                            C4308b.m12139r(C5980c.f12670B, "Invalid did return from cloud: " + string);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            "device group open, onFailed : error : " + str + " , error code : " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.c$n */
    class C5994n implements CommonHandler<String> {

        /* renamed from: a */
        final /* synthetic */ int f12693a;

        C5994n(int i) {
            this.f12693a = i;
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "device group openWithMode, onSucceed : " + str;
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int i2 = jSONObject.getInt("code");
                    String string = jSONObject.getString("did");
                    if (i2 == 0) {
                        C4200i J1 = C5980c.this.mo27497J1(string);
                        if (J1 != null) {
                            J1.mo23408d0().mo27648K0(true);
                            C5980c.this.mo23352w1(C5980c.this.mo23433j1(this.f12693a));
                        } else {
                            C4308b.m12139r(C5980c.f12670B, "Invalid did return from cloud: " + string);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            "device group openWithMode, onFailed : error : " + str + " , error code : " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.c$o */
    class C5995o implements CommonHandler<String> {

        /* renamed from: a */
        final /* synthetic */ int f12695a;

        C5995o(int i) {
            this.f12695a = i;
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "device group openWithMode, onSucceed : " + str;
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int i2 = jSONObject.getInt("code");
                    String string = jSONObject.getString("did");
                    if (i2 == 0) {
                        C4200i J1 = C5980c.this.mo27497J1(string);
                        if (J1 != null) {
                            J1.mo23408d0().mo27648K0(true);
                            C5980c.this.mo23352w1(C5980c.this.mo23433j1(this.f12695a));
                        } else {
                            C4308b.m12139r(C5980c.f12670B, "Invalid did return from cloud: " + string);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            "device group openWithMode, onFailed : error : " + str + " , error code : " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.c$p */
    class C5996p implements CommonHandler<String> {
        C5996p() {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "device group close, onSucceed : " + str;
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int i2 = jSONObject.getInt("code");
                    String string = jSONObject.getString("did");
                    if (i2 == 0) {
                        C4200i J1 = C5980c.this.mo27497J1(string);
                        if (J1 != null) {
                            J1.mo23408d0().mo27648K0(false);
                        } else {
                            C4308b.m12139r(C5980c.f12670B, "Invalid did return from cloud: " + string);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            "device group close, onFailed : error : " + str + " , error code : " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.c$q */
    class C5997q implements CommonHandler<String> {
        C5997q() {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "device group close, onSucceed : " + str;
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int i2 = jSONObject.getInt("code");
                    String string = jSONObject.getString("did");
                    if (i2 == 0) {
                        C4200i J1 = C5980c.this.mo27497J1(string);
                        if (J1 != null) {
                            J1.mo23408d0().mo27648K0(false);
                        } else {
                            C4308b.m12139r(C5980c.f12670B, "Invalid did return from cloud: " + string);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            "device group close, onFailed : error : " + str + " , error code : " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.c$r */
    class C5998r implements CommonHandler<String> {

        /* renamed from: a */
        final /* synthetic */ long f12699a;

        C5998r(long j) {
            this.f12699a = j;
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "device group setBright, onSucceed : " + str;
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int i2 = jSONObject.getInt("code");
                    String string = jSONObject.getString("did");
                    if (i2 == 0) {
                        C4200i J1 = C5980c.this.mo27497J1(string);
                        if (J1 != null) {
                            J1.mo23408d0().mo27697k0(this.f12699a);
                        } else {
                            C4308b.m12139r(C5980c.f12670B, "Invalid did return from cloud: " + string);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            "device group setBright, onFailed : error : " + str + " , error code : " + i;
        }
    }

    public C5980c(String str, String str2) {
        super(str, "yeelink.light.group", new C7555f(str2));
        mo23386O0(Device.Ownership.MINE);
        mo27508U1();
        mo23365B0(this);
        mo23374H0(str);
        mo27503P1();
        mo23414j0();
        mo23408d0().mo27697k0((long) mo27495F1());
    }

    public C5980c(String str, String str2, C6024e eVar) {
        super(str, str2, eVar);
    }

    /* renamed from: D1 */
    private List<C7556g.C7557a> m17537D1(C9827a aVar) {
        ArrayList arrayList = new ArrayList();
        for (C9844m next : aVar.mo31723h()) {
            arrayList.add(new C7556g.C7557a(next.mo31790e(), next.mo31788c()));
        }
        return arrayList;
    }

    /* renamed from: G1 */
    private int[] m17538G1(List<C7556g.C7557a> list) {
        int[] iArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = list.get(i).mo28914a();
        }
        return iArr;
    }

    /* renamed from: H1 */
    private int m17539H1() {
        if (this.f12672x.size() < 1) {
            return 0;
        }
        int i = 1023;
        for (int i2 = 0; i2 < this.f12672x.size(); i2++) {
            i = C7632k.m22540a(i, C7632k.m22542c(this.f12672x.get(i2).mo23375I().mo29075a()));
        }
        return i;
    }

    /* renamed from: A */
    public int mo23299A() {
        return 11;
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        "device group, toggle, isOpen: " + mo23332k1();
        if (mo23332k1()) {
            mo23326b1();
            return false;
        }
        mo23334l1();
        return false;
    }

    /* renamed from: E1 */
    public boolean mo27494E1(String str) {
        CopyOnWriteArrayList<C4200i> copyOnWriteArrayList = this.f12672x;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            Iterator<C4200i> it = this.f12672x.iterator();
            while (it.hasNext()) {
                if (it.next().mo23395T().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: F */
    public int mo23303F() {
        return R$drawable.icon_yeelight_device_badge_group_small;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F1 */
    public int mo27495F1() {
        Iterator<C4200i> it = this.f12672x.iterator();
        int i = 1;
        while (it.hasNext()) {
            int m = it.next().mo23408d0().mo27700m();
            if (m > i) {
                i = m;
            }
        }
        return i;
    }

    /* renamed from: H */
    public int mo23306H() {
        return R$drawable.icon_yeelight_device_badge_group_big;
    }

    /* renamed from: I */
    public C7628j mo23375I() {
        if (this.f7245h == null) {
            mo27504Q1();
        }
        return this.f7245h;
    }

    /* renamed from: I1 */
    public int mo27496I1() {
        return this.f12674z;
    }

    /* renamed from: J */
    public String mo23377J() {
        return "group";
    }

    /* renamed from: J1 */
    public C4200i mo27497J1(String str) {
        if (str == null || str.isEmpty()) {
            String str2 = f12670B;
            C4308b.m12139r(str2, "DeviceGroup, getDeviceById, invalid did param: " + str);
            return null;
        }
        Iterator<C4200i> it = this.f12672x.iterator();
        while (it.hasNext()) {
            C4200i next = it.next();
            if (next.mo23372G().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: K1 */
    public List<C4200i> mo27498K1() {
        return this.f12672x;
    }

    /* renamed from: L1 */
    public int[] mo27499L1() {
        int[] iArr = {0, 0};
        Iterator<C4200i> it = this.f12672x.iterator();
        while (it.hasNext()) {
            C4200i next = it.next();
            if (next.mo23331k0()) {
                if (next.mo23332k1()) {
                    iArr[0] = iArr[0] + 1;
                } else {
                    iArr[1] = iArr[1] + 1;
                }
            }
        }
        return iArr;
    }

    /* renamed from: M1 */
    public int mo27500M1() {
        return mo27501N1().size();
    }

    /* renamed from: N1 */
    public List<C4200i> mo27501N1() {
        ArrayList arrayList = new ArrayList();
        Iterator<C4200i> it = this.f12672x.iterator();
        while (it.hasNext()) {
            C4200i next = it.next();
            if (!next.mo23416o0()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: O1 */
    public int mo27502O1() {
        return this.f12672x.size() - mo27500M1();
    }

    /* renamed from: P1 */
    public void mo27503P1() {
        mo27509V1();
        this.f12672x.clear();
        this.f7245h = null;
        this.f12671A.removeMessages(1, (Object) null);
        Cursor N = DeviceDataProvider.m22379N(mo23372G());
        this.f12674z = N.getCount();
        if (N.moveToFirst()) {
            do {
                String string = N.getString(N.getColumnIndex(C7579c.C7580a.C7581a.f15372c));
                "DeviceGroup, device ID: " + string;
                C4200i o0 = C4257w.m11953o0(string);
                if (o0 != null) {
                    this.f12672x.add(o0);
                }
            } while (N.moveToNext());
        }
        N.close();
        "Device list size: " + this.f12672x.size();
        mo27506S1();
        mo27512Y1();
    }

    /* renamed from: Q1 */
    public void mo27504Q1() {
        int H1 = m17539H1();
        if (H1 != -1) {
            C7628j e = C7632k.m22544e(H1);
            this.f7245h = e;
            if ((e instanceof C7639n) && mo27494E1("yeelink.light.lamp15")) {
                this.f7245h = new C7615c0("yeelink.light.group");
            }
        }
    }

    /* renamed from: R1 */
    public boolean mo27505R1() {
        Iterator<C4200i> it = this.f12672x.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof C6006h)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S1 */
    public void mo27506S1() {
        Iterator<C4200i> it = this.f12672x.iterator();
        while (it.hasNext()) {
            C4200i next = it.next();
            next.mo23358z0(this);
            next.mo23369D0(this);
        }
    }

    /* renamed from: T1 */
    public void mo27507T1() {
        mo23414j0();
    }

    /* renamed from: U */
    public String mo23397U() {
        String U = super.mo23397U();
        return (U == null || U.isEmpty()) ? C4297y.f7456e.getResources().getString(R$string.yeelight_device_name_group) : super.mo23397U();
    }

    /* renamed from: U0 */
    public boolean mo23317U0() {
        DeviceDataProvider.m22407k(mo23372G());
        C4257w.m11947l0().mo23686r1(mo23372G());
        return true;
    }

    /* renamed from: U1 */
    public void mo27508U1() {
        C4297y.f7456e.getContentResolver().registerContentObserver(C7579c.C7588e.f15416a, true, this.f12673y);
    }

    /* renamed from: V0 */
    public void mo23319V0(C9768c cVar) {
        this.f7242e.remove(cVar);
    }

    /* renamed from: V1 */
    public void mo27509V1() {
        Iterator<C4200i> it = this.f12672x.iterator();
        while (it.hasNext()) {
            C4200i next = it.next();
            next.mo23319V0(this);
            next.mo23402X0(this);
        }
    }

    /* renamed from: W1 */
    public void mo27510W1() {
        this.f12671A.sendEmptyMessageDelayed(1, 5000);
    }

    /* renamed from: X1 */
    public void mo27511X1() {
        C4297y.f7456e.getContentResolver().unregisterContentObserver(this.f12673y);
    }

    /* renamed from: Y0 */
    public boolean mo23323Y0() {
        return false;
    }

    /* renamed from: Y1 */
    public void mo27512Y1() {
        mo23408d0().mo27648K0(mo23332k1());
        C7554e eVar = (C7554e) mo23408d0().mo27710r(2);
        if (eVar != null) {
            eVar.mo28884e(0);
        }
        Iterator<C4200i> it = this.f12672x.iterator();
        int i = 1;
        while (it.hasNext()) {
            C4198d next = it.next();
            int m = next.mo23408d0().mo27700m();
            if (next instanceof C6039j) {
                m = C10555s.m25794e(m);
            }
            if (next.mo23331k0() && m > i) {
                i = m;
            }
            C7554e eVar2 = (C7554e) next.mo23408d0().mo27710r(2);
            if (eVar == null) {
                eVar = eVar2;
            } else if (eVar2 != null && eVar2.mo28880a() > eVar.mo28880a()) {
                eVar.mo28884e(eVar2.mo28880a());
            }
        }
        if (eVar == null) {
            eVar = new C7554e(mo23368D(), 0);
        }
        mo23408d0().mo27676a(eVar);
        mo23408d0().mo27697k0((long) i);
        mo23408d0().mo27687f0();
    }

    /* renamed from: b1 */
    public boolean mo23326b1() {
        "device group, close: " + this.f12672x.size();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<C4200i> it = this.f12672x.iterator();
            while (it.hasNext()) {
                C4198d next = it.next();
                if (next.mo23331k0()) {
                    if (next instanceof C5972a) {
                        ((C5972a) next).mo23326b1();
                    } else if ((next instanceof C6006h) && next.mo23387P() != null) {
                        ((C6006h) next).mo23326b1();
                    } else if (next instanceof C6050n) {
                        ((C6050n) next).mo23326b1();
                    } else {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put("off");
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("did", next.mo23372G());
                        jSONObject2.put("params", jSONArray2);
                        jSONArray.put(jSONObject2);
                        if (jSONArray.length() == 49) {
                            jSONObject.put("method", "set_power");
                            jSONObject.put("rpcs", jSONArray);
                            "DeviceGroup, close, json to send: " + jSONObject.toString();
                            C4257w.m11925R(jSONObject, new C5996p());
                            jSONObject = new JSONObject();
                            jSONArray = new JSONArray();
                        }
                    }
                }
            }
            if (jSONArray.length() == 0) {
                return true;
            }
            jSONObject.put("method", "set_power");
            jSONObject.put("rpcs", jSONArray);
            "DeviceGroup, close, json to send: " + jSONObject.toString();
            C4257w.m11925R(jSONObject, new C5997q());
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<C4200i> it = this.f12672x.iterator();
            while (it.hasNext()) {
                C4200i next = it.next();
                if (next instanceof C5972a) {
                    if (!next.mo23331k0()) {
                    }
                } else if (!(next instanceof C6006h) || next.mo23387P() == null) {
                    if (next instanceof C6050n) {
                        next.mo23348u1(0);
                    } else {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(0);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("did", next.mo23372G());
                        jSONObject2.put("params", jSONArray2);
                        jSONArray.put(jSONObject2);
                    }
                }
                next.mo23327c1();
            }
            if (jSONArray.length() == 0) {
                return true;
            }
            jSONObject.put("method", "cron_del");
            jSONObject.put("rpcs", jSONArray);
            "DeviceGroup cron_del params = " + jSONObject.toString();
            return C4257w.m11925R(jSONObject, new C5989i(this));
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public void mo27513d(int i, C6024e eVar) {
        int i2;
        Handler handler;
        long j;
        if (i != 1) {
            i2 = 2;
            if (!(i == 2 || i == 8)) {
                if (i == 4096) {
                    this.f12671A.removeMessages(2);
                    handler = this.f12671A;
                    j = 2000;
                    handler.sendEmptyMessageDelayed(i2, j);
                }
                return;
            }
        }
        i2 = 3;
        this.f12671A.removeMessages(3);
        handler = this.f12671A;
        j = 100;
        handler.sendEmptyMessageDelayed(i2, j);
    }

    /* renamed from: f1 */
    public boolean mo23328f1(boolean z) {
        return false;
    }

    /* renamed from: g0 */
    public int mo23329g0() {
        return 0;
    }

    /* renamed from: i1 */
    public String mo23330i1() {
        int H1 = m17539H1();
        if (H1 == 0) {
            return "";
        }
        String d = C7632k.m22543d(H1);
        return (!TextUtils.equals(d, "yeelink.light.ceiling10") || !mo27494E1("yeelink.light.lamp15")) ? d : "yeelink.light.lamp15";
    }

    /* renamed from: k0 */
    public boolean mo23331k0() {
        Iterator<C4200i> it = this.f12672x.iterator();
        while (it.hasNext()) {
            if (it.next().mo23331k0()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k1 */
    public boolean mo23332k1() {
        Iterator<C4200i> it = this.f12672x.iterator();
        while (it.hasNext()) {
            C4200i next = it.next();
            if (next.mo23331k0() && next.mo23332k1()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l0 */
    public boolean mo23333l0() {
        return false;
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        "device group, open: " + this.f12672x.size();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<C4200i> it = this.f12672x.iterator();
            while (it.hasNext()) {
                C4198d next = it.next();
                if (next.mo23331k0()) {
                    if (next instanceof C5972a) {
                        ((C5972a) next).mo23334l1();
                    } else if ((next instanceof C6006h) && next.mo23387P() != null) {
                        ((C6006h) next).mo23334l1();
                    } else if (next instanceof C6050n) {
                        ((C6050n) next).mo23334l1();
                    } else {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put("on");
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("did", next.mo23372G());
                        jSONObject2.put("params", jSONArray2);
                        jSONArray.put(jSONObject2);
                        if (jSONArray.length() == 49) {
                            jSONObject.put("method", "set_power");
                            jSONObject.put("rpcs", jSONArray);
                            "DeviceGroup, open, json to send: " + jSONObject.toString();
                            C4257w.m11925R(jSONObject, new C5992l());
                            jSONObject = new JSONObject();
                            jSONArray = new JSONArray();
                        }
                    }
                }
            }
            if (jSONArray.length() == 0) {
                return true;
            }
            jSONObject.put("method", "set_power");
            jSONObject.put("rpcs", jSONArray);
            "DeviceGroup, open, json to send: " + jSONObject.toString();
            C4257w.m11925R(jSONObject, new C5993m());
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: m0 */
    public boolean mo23335m0() {
        return !mo23331k0();
    }

    /* renamed from: m1 */
    public boolean mo23336m1(int i) {
        "device group, open with mode: " + i;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<C4200i> it = this.f12672x.iterator();
            while (it.hasNext()) {
                C4198d next = it.next();
                if (next.mo23331k0()) {
                    if (next instanceof C5972a) {
                        if (!((C5972a) next).mo23332k1()) {
                            ((C5972a) next).mo23334l1();
                        }
                        C6024e.C6028d z = next.mo23408d0().mo27726z();
                        ((C5972a) next).mo23352w1(C6024e.C6028d.DEVICE_MODE_COLOR);
                        ((C5972a) next).mo23338o1(z);
                    } else if ((next instanceof C6006h) && next.mo23387P() != null) {
                        ((C6006h) next).mo23336m1(i);
                    } else if (next instanceof C6050n) {
                        ((C6050n) next).mo23336m1(i);
                    } else {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put("on");
                        jSONArray2.put("smooth");
                        jSONArray2.put(500);
                        jSONArray2.put(i);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("did", next.mo23372G());
                        jSONObject2.put("params", jSONArray2);
                        jSONArray.put(jSONObject2);
                        if (jSONArray.length() == 49) {
                            jSONObject.put("method", "set_power");
                            jSONObject.put("rpcs", jSONArray);
                            "DeviceGroup, openWithMode, json to send: " + jSONObject.toString();
                            C4257w.m11925R(jSONObject, new C5994n(i));
                            jSONObject = new JSONObject();
                            jSONArray = new JSONArray();
                        }
                    }
                }
            }
            if (jSONArray.length() == 0) {
                return true;
            }
            jSONObject.put("method", "set_power");
            jSONObject.put("rpcs", jSONArray);
            "DeviceGroup, openWithMode, json to send: " + jSONObject.toString();
            C4257w.m11925R(jSONObject, new C5995o(i));
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: n */
    public void mo23337n() {
    }

    /* renamed from: o0 */
    public boolean mo23416o0() {
        Iterator<C4200i> it = this.f12672x.iterator();
        while (it.hasNext()) {
            if (it.next().mo23416o0()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o1 */
    public boolean mo23338o1(C6024e.C6028d dVar) {
        return false;
    }

    public void onConnectionStateChanged(int i, int i2) {
        for (C9768c onConnectionStateChanged : this.f7242e) {
            onConnectionStateChanged.onConnectionStateChanged(i, i2);
        }
        if (i2 == 11 || i2 == 0) {
            mo27504Q1();
        }
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == 1024) {
            "GroupDevice, onStatusChange, TYPE_NAME " + eVar.mo27627A() + ", device id" + mo23372G();
            DeviceDataProvider.m22399d0(this);
        }
    }

    /* renamed from: p0 */
    public boolean mo23339p0() {
        return false;
    }

    /* renamed from: p1 */
    public boolean mo23340p1(long j) {
        "device group, setBright: " + this.f12672x.size();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<C4200i> it = this.f12672x.iterator();
            while (it.hasNext()) {
                C4198d next = it.next();
                if (next.mo23331k0()) {
                    if (next instanceof C5972a) {
                        ((C5972a) next).mo23340p1(j);
                    } else if ((next instanceof C6006h) && next.mo23387P() != null) {
                        ((C6006h) next).mo23340p1(j);
                    } else if (next instanceof C6050n) {
                        ((C6050n) next).mo23340p1(j);
                    } else {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put("bright");
                        jSONArray2.put(j);
                        jSONArray2.put(500);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("did", next.mo23372G());
                        jSONObject2.put("params", jSONArray2);
                        jSONArray.put(jSONObject2);
                        if (jSONArray.length() == 49) {
                            jSONObject.put("method", "set_scene");
                            jSONObject.put("rpcs", jSONArray);
                            "DeviceGroup, setBright, json to send: " + jSONObject.toString();
                            C4257w.m11925R(jSONObject, new C5998r(j));
                            jSONObject = new JSONObject();
                            jSONArray = new JSONArray();
                        }
                    }
                }
            }
            if (jSONArray.length() == 0) {
                return true;
            }
            jSONObject.put("method", "set_scene");
            jSONObject.put("rpcs", jSONArray);
            "DeviceGroup, setBright, json to send: " + jSONObject.toString();
            C4257w.m11925R(jSONObject, new C5981a(j));
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: q1 */
    public boolean mo23341q1(int i) {
        mo23408d0().mo27699l0(i);
        mo23408d0().mo27630B0(C6024e.C6028d.DEVICE_MODE_COLOR);
        "device group, setColor: " + this.f12672x.size();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<C4200i> it = this.f12672x.iterator();
            while (it.hasNext()) {
                C4198d next = it.next();
                if (next.mo23331k0()) {
                    if (next instanceof C5972a) {
                        ((C5972a) next).mo23341q1(i);
                    } else if ((next instanceof C6006h) && next.mo23387P() != null) {
                        ((C6006h) next).mo23341q1(i);
                    } else if (next instanceof C6050n) {
                        ((C6050n) next).mo23341q1(i);
                    } else {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(16777215 & i);
                        jSONArray2.put("smooth");
                        jSONArray2.put(500);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("did", next.mo23372G());
                        jSONObject2.put("params", jSONArray2);
                        jSONArray.put(jSONObject2);
                        if (jSONArray.length() == 49) {
                            jSONObject.put("method", "set_rgb");
                            jSONObject.put("rpcs", jSONArray);
                            "DeviceGroup, setColor, json to send: " + jSONObject.toString();
                            C4257w.m11925R(jSONObject, new C5984d(i));
                            jSONObject = new JSONObject();
                            jSONArray = new JSONArray();
                        }
                    }
                }
            }
            if (jSONArray.length() == 0) {
                return true;
            }
            jSONObject.put("method", "set_rgb");
            jSONObject.put("rpcs", jSONArray);
            "DeviceGroup, setColor, json to send: " + jSONObject.toString();
            C4257w.m11925R(jSONObject, new C5985e(i));
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: r */
    public void mo23342r() {
    }

    /* renamed from: r1 */
    public boolean mo23343r1(int i, int[] iArr, int i2) {
        ArrayList arrayList = new ArrayList();
        for (int aVar : iArr) {
            arrayList.add(new C7556g.C7557a(aVar, i));
        }
        mo23408d0().mo27701m0(arrayList);
        mo23408d0().mo27630B0(C6024e.C6028d.DEVICE_MODE_FLOW);
        Iterator<C4200i> it = this.f12672x.iterator();
        while (it.hasNext()) {
            C4200i next = it.next();
            if (next.mo23331k0()) {
                next.mo23343r1(i, iArr, i2);
            }
        }
        return true;
    }

    /* renamed from: s */
    public boolean mo23344s(C7563a aVar) {
        return false;
    }

    /* renamed from: s1 */
    public boolean mo23345s1(int i) {
        mo23408d0().mo27707p0(i);
        mo23408d0().mo27630B0(C6024e.C6028d.DEVICE_MODE_SUNSHINE);
        "device group, setCt: " + this.f12672x.size();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<C4200i> it = this.f12672x.iterator();
            while (it.hasNext()) {
                C4198d next = it.next();
                if (next.mo23331k0()) {
                    if (next instanceof C5972a) {
                        ((C5972a) next).mo23345s1(i);
                    } else if ((next instanceof C6006h) && next.mo23387P() != null) {
                        ((C6006h) next).mo23345s1(i);
                    } else if (next instanceof C6050n) {
                        ((C6050n) next).mo23345s1(i);
                    } else {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(i);
                        jSONArray2.put("smooth");
                        jSONArray2.put(500);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("did", next.mo23372G());
                        jSONObject2.put("params", jSONArray2);
                        jSONArray.put(jSONObject2);
                        if (jSONArray.length() == 49) {
                            jSONObject.put("method", "set_ct_abx");
                            jSONObject.put("rpcs", jSONArray);
                            "DeviceGroup, setCt, json to send: " + jSONObject.toString();
                            C4257w.m11925R(jSONObject, new C5982b(i));
                            jSONObject = new JSONObject();
                            jSONArray = new JSONArray();
                        }
                    }
                }
            }
            if (jSONArray.length() == 0) {
                return true;
            }
            jSONObject.put("method", "set_ct_abx");
            jSONObject.put("rpcs", jSONArray);
            "DeviceGroup, setCt, json to send: " + jSONObject.toString();
            C4257w.m11925R(jSONObject, new C5983c(i));
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        return false;
    }

    /* renamed from: u0 */
    public void mo23347u0(View view) {
        Intent intent;
        Class<?> cls = null;
        if (mo23331k0()) {
            try {
                cls = Class.forName("com.yeelight.cherry.ui.activity.DemoControlViewActivity");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            if (cls != null) {
                intent = new Intent();
                intent.setClass(view.getContext(), cls);
                intent.putExtra("com.yeelight.cherry.device_id", mo23372G());
                intent.putExtra("group_flag", true);
            } else {
                return;
            }
        } else {
            try {
                cls = Class.forName("com.yeelight.cherry.ui.activity.DeviceSettingActivity");
            } catch (ClassNotFoundException e2) {
                e2.printStackTrace();
            }
            if (cls != null) {
                intent = new Intent();
                intent.setClass(view.getContext(), cls);
                intent.putExtra("com.yeelight.cherry.device_id", mo23372G());
            } else {
                return;
            }
        }
        view.getContext().startActivity(intent);
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<C4200i> it = this.f12672x.iterator();
            while (it.hasNext()) {
                C4200i next = it.next();
                if (next instanceof C5972a) {
                    if (!next.mo23331k0()) {
                    }
                } else if (!(next instanceof C6006h) || next.mo23387P() == null) {
                    if (!(next instanceof C6050n)) {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(0);
                        jSONArray2.put(i);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("did", next.mo23372G());
                        jSONObject2.put("params", jSONArray2);
                        jSONArray.put(jSONObject2);
                    }
                }
                next.mo23348u1(i);
            }
            if (jSONArray.length() == 0) {
                return true;
            }
            jSONObject.put("method", "cron_add");
            jSONObject.put("rpcs", jSONArray);
            "DeviceGroup cron_add params = " + jSONObject.toString();
            return C4257w.m11925R(jSONObject, new C5988h(this));
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
        mo27509V1();
        mo27511X1();
    }

    /* renamed from: v1 */
    public boolean mo23350v1(boolean z) {
        return false;
    }

    /* renamed from: w0 */
    public boolean mo23351w0(String str) {
        return false;
    }

    /* renamed from: w1 */
    public boolean mo23352w1(C6024e.C6028d dVar) {
        mo23408d0().mo27630B0(dVar);
        Iterator<C4200i> it = this.f12672x.iterator();
        while (it.hasNext()) {
            C4200i next = it.next();
            if (next.mo23331k0() || next.mo23419q0()) {
                next.mo23352w1(dVar);
            }
        }
        return true;
    }

    /* renamed from: x */
    public boolean mo23353x(int i, Object obj) {
        if (i == 1) {
            mo23385N0((String) obj);
            return false;
        } else if (i == 10) {
            C7554e eVar = (C7554e) obj;
            mo23348u1(eVar.mo28881b());
            mo23408d0().mo27676a(eVar);
            return false;
        } else if (i != 14) {
            return false;
        } else {
            mo23327c1();
            return false;
        }
    }

    /* renamed from: x0 */
    public boolean mo23354x0() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003a, code lost:
        if (mo23375I().mo29076b(com.yeelight.yeelib.device.models.C7628j.C7630b.f15606m) != false) goto L_0x003c;
     */
    /* renamed from: x1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo23355x1(com.yeelight.yeelib.p153g.C9856y r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.mo31884p()
            r3 = 0
            switch(r2) {
                case 0: goto L_0x00c5;
                case 1: goto L_0x00b2;
                case 2: goto L_0x008d;
                case 3: goto L_0x0069;
                case 4: goto L_0x0043;
                case 5: goto L_0x0025;
                case 6: goto L_0x000e;
                case 7: goto L_0x0025;
                case 8: goto L_0x0025;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x00cc
        L_0x000e:
            com.yeelight.yeelib.c.i.e r2 = r16.mo23408d0()
            int r4 = r17.mo31874f()
            long r4 = (long) r4
            r2.mo27642H0(r4)
            com.yeelight.yeelib.c.i.e r2 = r16.mo23408d0()
            com.yeelight.yeelib.c.i.e$d r4 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT
        L_0x0020:
            r2.mo27630B0(r4)
            goto L_0x00cc
        L_0x0025:
            com.yeelight.yeelib.c.i.e r2 = r16.mo23408d0()
            com.yeelight.yeelib.g.a r4 = r17.mo31871c()
            r2.mo27713s0(r4)
            com.yeelight.yeelib.device.models.j r2 = r16.mo23375I()
            com.yeelight.yeelib.device.models.j$b r4 = com.yeelight.yeelib.device.models.C7628j.C7630b.CONTROL_FLOW_H
            boolean r2 = r2.mo29076b(r4)
            if (r2 == 0) goto L_0x00cc
        L_0x003c:
            com.yeelight.yeelib.c.i.e r2 = r16.mo23408d0()
            com.yeelight.yeelib.c.i.e$d r4 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_FLOW
            goto L_0x0020
        L_0x0043:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int[] r4 = r17.mo31878j()
            int r5 = r4.length
            r6 = 0
        L_0x004e:
            if (r6 >= r5) goto L_0x0061
            r7 = r4[r6]
            com.yeelight.yeelib.c.n.g$a r8 = new com.yeelight.yeelib.c.n.g$a
            int r9 = r17.mo31881m()
            r8.<init>(r7, r9)
            r2.add(r8)
            int r6 = r6 + 1
            goto L_0x004e
        L_0x0061:
            com.yeelight.yeelib.c.i.e r4 = r16.mo23408d0()
            r4.mo27701m0(r2)
            goto L_0x003c
        L_0x0069:
            int r2 = r17.mo31874f()
            if (r2 <= 0) goto L_0x007b
            com.yeelight.yeelib.c.i.e r2 = r16.mo23408d0()
            int r4 = r17.mo31874f()
            long r4 = (long) r4
            r2.mo27697k0(r4)
        L_0x007b:
            com.yeelight.yeelib.c.i.e r2 = r16.mo23408d0()
            int r4 = r17.mo31876h()
            r2.mo27707p0(r4)
            com.yeelight.yeelib.c.i.e r2 = r16.mo23408d0()
            com.yeelight.yeelib.c.i.e$d r4 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_SUNSHINE
            goto L_0x0020
        L_0x008d:
            int r2 = r17.mo31874f()
            if (r2 <= 0) goto L_0x009f
            com.yeelight.yeelib.c.i.e r2 = r16.mo23408d0()
            int r4 = r17.mo31874f()
            long r4 = (long) r4
            r2.mo27697k0(r4)
        L_0x009f:
            com.yeelight.yeelib.c.i.e r2 = r16.mo23408d0()
            int r4 = r17.mo31875g()
            r2.mo27699l0(r4)
            com.yeelight.yeelib.c.i.e r2 = r16.mo23408d0()
            com.yeelight.yeelib.c.i.e$d r4 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_COLOR
            goto L_0x0020
        L_0x00b2:
            int r2 = r17.mo31874f()
            if (r2 <= 0) goto L_0x00cc
            com.yeelight.yeelib.c.i.e r2 = r16.mo23408d0()
            int r4 = r17.mo31874f()
            long r4 = (long) r4
            r2.mo27697k0(r4)
            goto L_0x00cc
        L_0x00c5:
            com.yeelight.yeelib.c.i.e r2 = r16.mo23408d0()
            r2.mo27648K0(r3)
        L_0x00cc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "device group, setScene: "
            r2.append(r4)
            java.util.concurrent.CopyOnWriteArrayList<com.yeelight.yeelib.c.i.i> r4 = r0.f12672x
            int r4 = r4.size()
            r2.append(r4)
            r2.toString()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            java.util.concurrent.CopyOnWriteArrayList<com.yeelight.yeelib.c.i.i> r5 = r0.f12672x     // Catch:{ JSONException -> 0x0313 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ JSONException -> 0x0313 }
        L_0x00f2:
            boolean r6 = r5.hasNext()     // Catch:{ JSONException -> 0x0313 }
            java.lang.String r7 = "DeviceGroup, setScene, json to send: "
            java.lang.String r8 = "rpcs"
            java.lang.String r9 = "set_scene"
            java.lang.String r10 = "method"
            if (r6 == 0) goto L_0x02ea
            java.lang.Object r6 = r5.next()     // Catch:{ JSONException -> 0x0313 }
            com.yeelight.yeelib.c.i.d r6 = (com.yeelight.yeelib.p150c.p151i.C4198d) r6     // Catch:{ JSONException -> 0x0313 }
            boolean r11 = r6.mo23331k0()     // Catch:{ JSONException -> 0x0313 }
            if (r11 != 0) goto L_0x010e
            goto L_0x02e7
        L_0x010e:
            boolean r11 = r6 instanceof com.yeelight.yeelib.p150c.C5972a     // Catch:{ JSONException -> 0x0313 }
            if (r11 == 0) goto L_0x016f
            int r7 = r17.mo31884p()     // Catch:{ JSONException -> 0x0313 }
            r8 = 5
            if (r7 != r8) goto L_0x0168
            com.yeelight.yeelib.g.a r7 = r17.mo31871c()     // Catch:{ JSONException -> 0x0313 }
            java.util.List r7 = r0.m17537D1(r7)     // Catch:{ JSONException -> 0x0313 }
            com.yeelight.yeelib.c.i.e r8 = r6.mo23408d0()     // Catch:{ JSONException -> 0x0313 }
            com.yeelight.yeelib.c.i.e$d r8 = r8.mo27726z()     // Catch:{ JSONException -> 0x0313 }
            com.yeelight.yeelib.c.i.e$d r9 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_FLOW     // Catch:{ JSONException -> 0x0313 }
            if (r8 != r9) goto L_0x0151
            r8 = r6
            com.yeelight.yeelib.c.m.q r8 = (com.yeelight.yeelib.p150c.p183m.C7186q) r8     // Catch:{ JSONException -> 0x0313 }
            java.lang.Object r9 = r7.get(r3)     // Catch:{ JSONException -> 0x0313 }
            com.yeelight.yeelib.c.n.g$a r9 = (com.yeelight.yeelib.p150c.p184n.C7556g.C7557a) r9     // Catch:{ JSONException -> 0x0313 }
            int r9 = r9.mo28915b()     // Catch:{ JSONException -> 0x0313 }
            int[] r7 = r0.m17538G1(r7)     // Catch:{ JSONException -> 0x0313 }
            int r10 = r16.mo27495F1()     // Catch:{ JSONException -> 0x0313 }
            r8.mo23343r1(r9, r7, r10)     // Catch:{ JSONException -> 0x0313 }
            com.yeelight.yeelib.c.m.q r6 = (com.yeelight.yeelib.p150c.p183m.C7186q) r6     // Catch:{ JSONException -> 0x0313 }
            int r7 = r16.mo27495F1()     // Catch:{ JSONException -> 0x0313 }
            long r7 = (long) r7     // Catch:{ JSONException -> 0x0313 }
            r6.mo23340p1(r7)     // Catch:{ JSONException -> 0x0313 }
            goto L_0x02e7
        L_0x0151:
            com.yeelight.yeelib.c.i.e r7 = r6.mo23408d0()     // Catch:{ JSONException -> 0x0313 }
            com.yeelight.yeelib.c.i.e$d r7 = r7.mo27726z()     // Catch:{ JSONException -> 0x0313 }
            r8 = r6
            com.yeelight.yeelib.c.m.q r8 = (com.yeelight.yeelib.p150c.p183m.C7186q) r8     // Catch:{ JSONException -> 0x0313 }
            com.yeelight.yeelib.c.i.e$d r9 = com.yeelight.yeelib.p150c.p151i.C6024e.C6028d.DEVICE_MODE_FLOW     // Catch:{ JSONException -> 0x0313 }
            r8.mo23352w1(r9)     // Catch:{ JSONException -> 0x0313 }
            com.yeelight.yeelib.c.m.q r6 = (com.yeelight.yeelib.p150c.p183m.C7186q) r6     // Catch:{ JSONException -> 0x0313 }
            r6.mo23338o1(r7)     // Catch:{ JSONException -> 0x0313 }
            goto L_0x02e7
        L_0x0168:
            com.yeelight.yeelib.c.a r6 = (com.yeelight.yeelib.p150c.C5972a) r6     // Catch:{ JSONException -> 0x0313 }
            r6.mo23355x1(r1)     // Catch:{ JSONException -> 0x0313 }
            goto L_0x02e7
        L_0x016f:
            boolean r11 = r6 instanceof com.yeelight.yeelib.p150c.C6006h     // Catch:{ JSONException -> 0x0313 }
            if (r11 == 0) goto L_0x0180
            com.yeelight.yeelib.c.d r11 = r6.mo23387P()     // Catch:{ JSONException -> 0x0313 }
            if (r11 == 0) goto L_0x0180
            com.yeelight.yeelib.c.h r6 = (com.yeelight.yeelib.p150c.C6006h) r6     // Catch:{ JSONException -> 0x0313 }
            r6.mo23355x1(r1)     // Catch:{ JSONException -> 0x0313 }
            goto L_0x02e7
        L_0x0180:
            boolean r11 = r6 instanceof com.yeelight.yeelib.p150c.p151i.C6050n     // Catch:{ JSONException -> 0x0313 }
            if (r11 == 0) goto L_0x018b
            com.yeelight.yeelib.c.i.n r6 = (com.yeelight.yeelib.p150c.p151i.C6050n) r6     // Catch:{ JSONException -> 0x0313 }
            r6.mo23355x1(r1)     // Catch:{ JSONException -> 0x0313 }
            goto L_0x02e7
        L_0x018b:
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0313 }
            r11.<init>()     // Catch:{ JSONException -> 0x0313 }
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0313 }
            r12.<init>()     // Catch:{ JSONException -> 0x0313 }
            boolean r13 = r17.mo31890v()     // Catch:{ JSONException -> 0x0313 }
            java.lang.String r14 = "cf"
            java.lang.String r15 = "params"
            java.lang.String r3 = "did"
            if (r13 == 0) goto L_0x01d5
            r11.put(r14)     // Catch:{ JSONException -> 0x0313 }
            com.yeelight.yeelib.g.a r13 = r17.mo31871c()     // Catch:{ JSONException -> 0x0313 }
            int r13 = r13.mo31724i()     // Catch:{ JSONException -> 0x0313 }
            r11.put(r13)     // Catch:{ JSONException -> 0x0313 }
            com.yeelight.yeelib.g.a r13 = r17.mo31871c()     // Catch:{ JSONException -> 0x0313 }
            com.yeelight.yeelib.g.l r13 = r13.mo31721f()     // Catch:{ JSONException -> 0x0313 }
            int r13 = r13.ordinal()     // Catch:{ JSONException -> 0x0313 }
            r11.put(r13)     // Catch:{ JSONException -> 0x0313 }
            com.yeelight.yeelib.g.a r13 = r17.mo31871c()     // Catch:{ JSONException -> 0x0313 }
            java.lang.String r13 = r13.mo31722g()     // Catch:{ JSONException -> 0x0313 }
            r11.put(r13)     // Catch:{ JSONException -> 0x0313 }
            java.lang.String r6 = r6.mo23372G()     // Catch:{ JSONException -> 0x0313 }
            r12.put(r3, r6)     // Catch:{ JSONException -> 0x0313 }
        L_0x01d0:
            r12.put(r15, r11)     // Catch:{ JSONException -> 0x0313 }
            goto L_0x0297
        L_0x01d5:
            boolean r13 = r17.mo31858G()     // Catch:{ JSONException -> 0x0313 }
            if (r13 == 0) goto L_0x01ef
            java.lang.String r13 = "off"
            r11.put(r13)     // Catch:{ JSONException -> 0x0313 }
            r13 = 0
            r11.put(r13)     // Catch:{ JSONException -> 0x0313 }
            r11.put(r13)     // Catch:{ JSONException -> 0x0313 }
            java.lang.String r6 = r6.mo23372G()     // Catch:{ JSONException -> 0x0313 }
            r12.put(r3, r6)     // Catch:{ JSONException -> 0x0313 }
            goto L_0x01d0
        L_0x01ef:
            boolean r13 = r17.mo31893y()     // Catch:{ JSONException -> 0x0313 }
            if (r13 == 0) goto L_0x020e
            java.lang.String r13 = "bright"
            r11.put(r13)     // Catch:{ JSONException -> 0x0313 }
            int r13 = r17.mo31874f()     // Catch:{ JSONException -> 0x0313 }
            r11.put(r13)     // Catch:{ JSONException -> 0x0313 }
            r13 = 500(0x1f4, float:7.0E-43)
            r11.put(r13)     // Catch:{ JSONException -> 0x0313 }
            java.lang.String r6 = r6.mo23372G()     // Catch:{ JSONException -> 0x0313 }
            r12.put(r3, r6)     // Catch:{ JSONException -> 0x0313 }
            goto L_0x01d0
        L_0x020e:
            boolean r13 = r17.mo31855D()     // Catch:{ JSONException -> 0x0313 }
            if (r13 == 0) goto L_0x022f
            java.lang.String r13 = "ct"
            r11.put(r13)     // Catch:{ JSONException -> 0x0313 }
            int r13 = r17.mo31876h()     // Catch:{ JSONException -> 0x0313 }
            r11.put(r13)     // Catch:{ JSONException -> 0x0313 }
            int r13 = r17.mo31874f()     // Catch:{ JSONException -> 0x0313 }
            r11.put(r13)     // Catch:{ JSONException -> 0x0313 }
            java.lang.String r6 = r6.mo23372G()     // Catch:{ JSONException -> 0x0313 }
            r12.put(r3, r6)     // Catch:{ JSONException -> 0x0313 }
            goto L_0x01d0
        L_0x022f:
            boolean r13 = r17.mo31853B()     // Catch:{ JSONException -> 0x0313 }
            if (r13 == 0) goto L_0x0255
            java.lang.String r13 = "color"
            r11.put(r13)     // Catch:{ JSONException -> 0x0313 }
            int r13 = r17.mo31875g()     // Catch:{ JSONException -> 0x0313 }
            r14 = 16777215(0xffffff, float:2.3509886E-38)
            r13 = r13 & r14
            r11.put(r13)     // Catch:{ JSONException -> 0x0313 }
            int r13 = r17.mo31874f()     // Catch:{ JSONException -> 0x0313 }
            r11.put(r13)     // Catch:{ JSONException -> 0x0313 }
            java.lang.String r6 = r6.mo23372G()     // Catch:{ JSONException -> 0x0313 }
            r12.put(r3, r6)     // Catch:{ JSONException -> 0x0313 }
            goto L_0x01d0
        L_0x0255:
            boolean r13 = r17.mo31891w()     // Catch:{ JSONException -> 0x0313 }
            if (r13 == 0) goto L_0x027c
            r11.put(r14)     // Catch:{ JSONException -> 0x0313 }
            int r13 = r17.mo31879k()     // Catch:{ JSONException -> 0x0313 }
            r11.put(r13)     // Catch:{ JSONException -> 0x0313 }
            int r13 = r17.mo31880l()     // Catch:{ JSONException -> 0x0313 }
            r11.put(r13)     // Catch:{ JSONException -> 0x0313 }
            java.lang.String r13 = r17.mo31882n()     // Catch:{ JSONException -> 0x0313 }
            r11.put(r13)     // Catch:{ JSONException -> 0x0313 }
            java.lang.String r6 = r6.mo23372G()     // Catch:{ JSONException -> 0x0313 }
            r12.put(r3, r6)     // Catch:{ JSONException -> 0x0313 }
            goto L_0x01d0
        L_0x027c:
            boolean r13 = r17.mo31857F()     // Catch:{ JSONException -> 0x0313 }
            if (r13 == 0) goto L_0x02cd
            java.lang.String r13 = "nightlight"
            r11.put(r13)     // Catch:{ JSONException -> 0x0313 }
            int r13 = r17.mo31874f()     // Catch:{ JSONException -> 0x0313 }
            r11.put(r13)     // Catch:{ JSONException -> 0x0313 }
            java.lang.String r6 = r6.mo23372G()     // Catch:{ JSONException -> 0x0313 }
            r12.put(r3, r6)     // Catch:{ JSONException -> 0x0313 }
            goto L_0x01d0
        L_0x0297:
            r4.put(r12)     // Catch:{ JSONException -> 0x0313 }
            int r3 = r4.length()     // Catch:{ JSONException -> 0x0313 }
            r6 = 49
            if (r3 != r6) goto L_0x02e7
            r2.put(r10, r9)     // Catch:{ JSONException -> 0x0313 }
            r2.put(r8, r4)     // Catch:{ JSONException -> 0x0313 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0313 }
            r3.<init>()     // Catch:{ JSONException -> 0x0313 }
            r3.append(r7)     // Catch:{ JSONException -> 0x0313 }
            java.lang.String r4 = r2.toString()     // Catch:{ JSONException -> 0x0313 }
            r3.append(r4)     // Catch:{ JSONException -> 0x0313 }
            r3.toString()     // Catch:{ JSONException -> 0x0313 }
            com.yeelight.yeelib.c.c$f r3 = new com.yeelight.yeelib.c.c$f     // Catch:{ JSONException -> 0x0313 }
            r3.<init>(r1)     // Catch:{ JSONException -> 0x0313 }
            com.yeelight.yeelib.p152f.C4257w.m11925R(r2, r3)     // Catch:{ JSONException -> 0x0313 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0313 }
            r2.<init>()     // Catch:{ JSONException -> 0x0313 }
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0313 }
            r4.<init>()     // Catch:{ JSONException -> 0x0313 }
            goto L_0x02e7
        L_0x02cd:
            java.lang.String r3 = "BATCH_RPC"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0313 }
            r6.<init>()     // Catch:{ JSONException -> 0x0313 }
            java.lang.String r7 = "invalid scene mode: "
            r6.append(r7)     // Catch:{ JSONException -> 0x0313 }
            int r7 = r17.mo31884p()     // Catch:{ JSONException -> 0x0313 }
            r6.append(r7)     // Catch:{ JSONException -> 0x0313 }
            java.lang.String r6 = r6.toString()     // Catch:{ JSONException -> 0x0313 }
            com.yeelight.yeelib.utils.C4308b.m12139r(r3, r6)     // Catch:{ JSONException -> 0x0313 }
        L_0x02e7:
            r3 = 0
            goto L_0x00f2
        L_0x02ea:
            int r3 = r4.length()     // Catch:{ JSONException -> 0x0313 }
            r5 = 1
            if (r3 != 0) goto L_0x02f2
            return r5
        L_0x02f2:
            r2.put(r10, r9)     // Catch:{ JSONException -> 0x0313 }
            r2.put(r8, r4)     // Catch:{ JSONException -> 0x0313 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0313 }
            r3.<init>()     // Catch:{ JSONException -> 0x0313 }
            r3.append(r7)     // Catch:{ JSONException -> 0x0313 }
            java.lang.String r4 = r2.toString()     // Catch:{ JSONException -> 0x0313 }
            r3.append(r4)     // Catch:{ JSONException -> 0x0313 }
            r3.toString()     // Catch:{ JSONException -> 0x0313 }
            com.yeelight.yeelib.c.c$g r3 = new com.yeelight.yeelib.c.c$g     // Catch:{ JSONException -> 0x0313 }
            r3.<init>(r1)     // Catch:{ JSONException -> 0x0313 }
            com.yeelight.yeelib.p152f.C4257w.m11925R(r2, r3)     // Catch:{ JSONException -> 0x0313 }
            return r5
        L_0x0313:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.C5980c.mo23355x1(com.yeelight.yeelib.g.y):boolean");
    }

    /* renamed from: y0 */
    public void mo23356y0() {
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[0];
    }

    /* renamed from: z0 */
    public void mo23358z0(C9768c cVar) {
        this.f7242e.add(cVar);
    }
}

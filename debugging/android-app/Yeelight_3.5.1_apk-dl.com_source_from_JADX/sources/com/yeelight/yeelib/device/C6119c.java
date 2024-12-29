package com.yeelight.yeelib.device;

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
import com.yeelight.cherry.p141ui.activity.DemoControlViewActivity;
import com.yeelight.cherry.p141ui.activity.DeviceSettingActivity;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.data.C6043b;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.C6094f;
import com.yeelight.yeelib.device.base.C6100g;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.models.C6174c;
import com.yeelight.yeelib.device.models.C6188q;
import com.yeelight.yeelib.device.models.ProductModelBase;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.C8308a;
import com.yeelight.yeelib.models.C8319k;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p051j4.C9201q;
import p227x3.C11972i;
import p232y3.C12041e;
import p232y3.C12042f;
import p232y3.C12043g;
import p237z3.C12143c;
import p237z3.C12145e;
import p237z3.C12147g;

/* renamed from: com.yeelight.yeelib.device.c */
public class C6119c extends C3012e implements C12143c, C12145e, C12147g {
    /* access modifiers changed from: private */

    /* renamed from: B */
    public static final String f12559B = "c";

    /* renamed from: A */
    Handler f12560A = new C6130k(Looper.getMainLooper());

    /* renamed from: x */
    CopyOnWriteArrayList<C3012e> f12561x = new CopyOnWriteArrayList<>();

    /* renamed from: y */
    private ContentObserver f12562y = new C6129j(new Handler(Looper.getMainLooper()));

    /* renamed from: z */
    int f12563z;

    /* renamed from: com.yeelight.yeelib.device.c$a */
    class C6120a implements CommonHandler<String> {

        /* renamed from: a */
        final /* synthetic */ long f12564a;

        C6120a(long j) {
            this.f12564a = j;
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group setBright, onSucceed : ");
            sb.append(str);
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int i2 = jSONObject.getInt("code");
                    String string = jSONObject.getString("did");
                    if (i2 == 0) {
                        C3012e J1 = C6119c.this.mo31752J1(string);
                        if (J1 != null) {
                            J1.mo23221d0().mo31600l0(this.f12564a);
                        } else {
                            String C1 = C6119c.f12559B;
                            AppUtils.m8300u(C1, "Invalid did return from cloud: " + string);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group setBright, onFailed : error : ");
            sb.append(str);
            sb.append(" , error code : ");
            sb.append(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.c$b */
    class C6121b implements CommonHandler<String> {

        /* renamed from: a */
        final /* synthetic */ int f12566a;

        C6121b(int i) {
            this.f12566a = i;
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group setCt, onSucceed : ");
            sb.append(str);
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int i2 = jSONObject.getInt("code");
                    String string = jSONObject.getString("did");
                    if (i2 == 0) {
                        C3012e J1 = C6119c.this.mo31752J1(string);
                        if (J1 != null) {
                            J1.mo23221d0().mo31610q0(this.f12566a);
                        } else {
                            String C1 = C6119c.f12559B;
                            AppUtils.m8300u(C1, "Invalid did return from cloud: " + string);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group setCt, onFailed : error : ");
            sb.append(str);
            sb.append(" , error code : ");
            sb.append(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.c$c */
    class C6122c implements CommonHandler<String> {

        /* renamed from: a */
        final /* synthetic */ int f12568a;

        C6122c(int i) {
            this.f12568a = i;
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group setCt, onSucceed : ");
            sb.append(str);
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int i2 = jSONObject.getInt("code");
                    String string = jSONObject.getString("did");
                    if (i2 == 0) {
                        C3012e J1 = C6119c.this.mo31752J1(string);
                        if (J1 != null) {
                            J1.mo23221d0().mo31610q0(this.f12568a);
                        } else {
                            String C1 = C6119c.f12559B;
                            AppUtils.m8300u(C1, "Invalid did return from cloud: " + string);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group setCt, onFailed : error : ");
            sb.append(str);
            sb.append(" , error code : ");
            sb.append(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.c$d */
    class C6123d implements CommonHandler<String> {

        /* renamed from: a */
        final /* synthetic */ int f12570a;

        C6123d(int i) {
            this.f12570a = i;
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group setColor, onSucceed : ");
            sb.append(str);
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int i2 = jSONObject.getInt("code");
                    String string = jSONObject.getString("did");
                    if (i2 == 0) {
                        C3012e J1 = C6119c.this.mo31752J1(string);
                        if (J1 != null) {
                            J1.mo23221d0().mo31602m0(this.f12570a);
                        } else {
                            String C1 = C6119c.f12559B;
                            AppUtils.m8300u(C1, "Invalid did return from cloud: " + string);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group setColor, onFailed : error : ");
            sb.append(str);
            sb.append(" , error code : ");
            sb.append(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.c$e */
    class C6124e implements CommonHandler<String> {

        /* renamed from: a */
        final /* synthetic */ int f12572a;

        C6124e(int i) {
            this.f12572a = i;
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group setColor, onSucceed : ");
            sb.append(str);
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int i2 = jSONObject.getInt("code");
                    String string = jSONObject.getString("did");
                    if (i2 == 0) {
                        C3012e J1 = C6119c.this.mo31752J1(string);
                        if (J1 != null) {
                            J1.mo23221d0().mo31602m0(this.f12572a);
                        } else {
                            String C1 = C6119c.f12559B;
                            AppUtils.m8300u(C1, "Invalid did return from cloud: " + string);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group setColor, onFailed : error : ");
            sb.append(str);
            sb.append(" , error code : ");
            sb.append(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.c$f */
    class C6125f implements CommonHandler<String> {

        /* renamed from: a */
        final /* synthetic */ C8327s f12574a;

        C6125f(C8327s sVar) {
            this.f12574a = sVar;
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group setScene, onSucceed : ");
            sb.append(str);
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int i2 = jSONObject.getInt("code");
                    String string = jSONObject.getString("did");
                    if (i2 == 0) {
                        C3012e J1 = C6119c.this.mo31752J1(string);
                        if (J1 != null) {
                            J1.mo23221d0().mo31557P0(this.f12574a);
                        } else {
                            String C1 = C6119c.f12559B;
                            AppUtils.m8300u(C1, "Invalid did return from cloud: " + string);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group setScene, onFailed : error : ");
            sb.append(str);
            sb.append(" , error code : ");
            sb.append(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.c$g */
    class C6126g implements CommonHandler<String> {

        /* renamed from: a */
        final /* synthetic */ C8327s f12576a;

        C6126g(C8327s sVar) {
            this.f12576a = sVar;
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group setScene, onSucceed : ");
            sb.append(str);
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int i2 = jSONObject.getInt("code");
                    String string = jSONObject.getString("did");
                    if (i2 == 0) {
                        C3012e J1 = C6119c.this.mo31752J1(string);
                        if (J1 != null) {
                            J1.mo23221d0().mo31557P0(this.f12576a);
                        } else {
                            String C1 = C6119c.f12559B;
                            AppUtils.m8300u(C1, "Invalid did return from cloud: " + string);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group setScene, onFailed : error : ");
            sb.append(str);
            sb.append(" , error code : ");
            sb.append(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.c$h */
    class C6127h implements CommonHandler<String> {
        C6127h(C6119c cVar) {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group cron_add, onSucceed : ");
            sb.append(str);
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group open, onFailed : error : ");
            sb.append(str);
            sb.append(" , error code : ");
            sb.append(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.c$i */
    class C6128i implements CommonHandler<String> {
        C6128i(C6119c cVar) {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group cron_del, onSucceed : ");
            sb.append(str);
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device cron_del, onFailed : error : ");
            sb.append(str);
            sb.append(" , error code : ");
            sb.append(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.c$j */
    class C6129j extends ContentObserver {
        C6129j(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z) {
            super.onChange(z);
            C6119c.this.mo31758P1();
        }
    }

    /* renamed from: com.yeelight.yeelib.device.c$k */
    class C6130k extends Handler {
        C6130k(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            DeviceStatusBase deviceStatusBase;
            int i = message.what;
            int i2 = 0;
            if (i == 1) {
                Iterator<C3012e> it = C6119c.this.f12561x.iterator();
                while (it.hasNext()) {
                    C3012e next = it.next();
                    if ((next instanceof C6081a) && !next.mo23145k0() && !next.mo23147l0()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("DeviceGroup, auto connect to device: ");
                        sb.append(next.mo23185G());
                        next.mo23151n();
                        i2 = 1;
                    }
                }
                if (i2 != 0) {
                    C6119c.this.f12560A.sendEmptyMessageDelayed(1, 5000);
                }
            } else if (i == 2) {
                C12041e eVar = (C12041e) C6119c.this.mo23221d0().mo31611r(2);
                if (eVar != null) {
                    eVar.mo42681e(0);
                }
                Iterator<C3012e> it2 = C6119c.this.f12561x.iterator();
                boolean z = false;
                while (it2.hasNext()) {
                    C3012e next2 = it2.next();
                    C12041e eVar2 = (C12041e) next2.mo23221d0().mo31611r(2);
                    if (eVar2 != null) {
                        if (eVar == null) {
                            eVar = eVar2;
                        } else if (eVar2.mo42677a() > eVar.mo42677a()) {
                            eVar.mo42681e(eVar2.mo42677a());
                        }
                        if (eVar2.mo42679c()) {
                            z = true;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("device ");
                        sb2.append(next2.mo23210U());
                        sb2.append(" delayOff = ");
                        sb2.append(eVar2.mo42677a());
                    }
                }
                if (eVar == null) {
                    deviceStatusBase = C6119c.this.mo23221d0();
                    i2 = -1;
                } else if (z) {
                    C6119c.this.mo23221d0().mo31573X0(eVar.mo42677a());
                    return;
                } else {
                    deviceStatusBase = C6119c.this.mo23221d0();
                }
                deviceStatusBase.mo31573X0(i2);
            } else if (i == 3) {
                C6119c.this.mo31767Y1();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.c$l */
    class C6131l implements CommonHandler<String> {
        C6131l() {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group open, onSucceed : ");
            sb.append(str);
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int i2 = jSONObject.getInt("code");
                    String string = jSONObject.getString("did");
                    if (i2 == 0) {
                        C3012e J1 = C6119c.this.mo31752J1(string);
                        if (J1 != null) {
                            J1.mo23221d0().mo31551M0(true);
                        } else {
                            String C1 = C6119c.f12559B;
                            AppUtils.m8300u(C1, "Invalid did return from cloud: " + string);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group open, onFailed : error : ");
            sb.append(str);
            sb.append(" , error code : ");
            sb.append(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.c$m */
    class C6132m implements CommonHandler<String> {
        C6132m() {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group open, onSucceed : ");
            sb.append(str);
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int i2 = jSONObject.getInt("code");
                    String string = jSONObject.getString("did");
                    if (i2 == 0) {
                        C3012e J1 = C6119c.this.mo31752J1(string);
                        if (J1 != null) {
                            J1.mo23221d0().mo31551M0(true);
                        } else {
                            String C1 = C6119c.f12559B;
                            AppUtils.m8300u(C1, "Invalid did return from cloud: " + string);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group open, onFailed : error : ");
            sb.append(str);
            sb.append(" , error code : ");
            sb.append(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.c$n */
    class C6133n implements CommonHandler<String> {

        /* renamed from: a */
        final /* synthetic */ int f12582a;

        C6133n(int i) {
            this.f12582a = i;
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group openWithMode, onSucceed : ");
            sb.append(str);
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int i2 = jSONObject.getInt("code");
                    String string = jSONObject.getString("did");
                    if (i2 == 0) {
                        C3012e J1 = C6119c.this.mo31752J1(string);
                        if (J1 != null) {
                            J1.mo23221d0().mo31551M0(true);
                            C6119c cVar = C6119c.this;
                            cVar.mo23165w1(cVar.mo23247j1(this.f12582a));
                        } else {
                            String C1 = C6119c.f12559B;
                            AppUtils.m8300u(C1, "Invalid did return from cloud: " + string);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group openWithMode, onFailed : error : ");
            sb.append(str);
            sb.append(" , error code : ");
            sb.append(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.c$o */
    class C6134o implements CommonHandler<String> {

        /* renamed from: a */
        final /* synthetic */ int f12584a;

        C6134o(int i) {
            this.f12584a = i;
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group openWithMode, onSucceed : ");
            sb.append(str);
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int i2 = jSONObject.getInt("code");
                    String string = jSONObject.getString("did");
                    if (i2 == 0) {
                        C3012e J1 = C6119c.this.mo31752J1(string);
                        if (J1 != null) {
                            J1.mo23221d0().mo31551M0(true);
                            C6119c cVar = C6119c.this;
                            cVar.mo23165w1(cVar.mo23247j1(this.f12584a));
                        } else {
                            String C1 = C6119c.f12559B;
                            AppUtils.m8300u(C1, "Invalid did return from cloud: " + string);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group openWithMode, onFailed : error : ");
            sb.append(str);
            sb.append(" , error code : ");
            sb.append(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.c$p */
    class C6135p implements CommonHandler<String> {
        C6135p() {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group close, onSucceed : ");
            sb.append(str);
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int i2 = jSONObject.getInt("code");
                    String string = jSONObject.getString("did");
                    if (i2 == 0) {
                        C3012e J1 = C6119c.this.mo31752J1(string);
                        if (J1 != null) {
                            J1.mo23221d0().mo31551M0(false);
                        } else {
                            String C1 = C6119c.f12559B;
                            AppUtils.m8300u(C1, "Invalid did return from cloud: " + string);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group close, onFailed : error : ");
            sb.append(str);
            sb.append(" , error code : ");
            sb.append(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.c$q */
    class C6136q implements CommonHandler<String> {
        C6136q() {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group close, onSucceed : ");
            sb.append(str);
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int i2 = jSONObject.getInt("code");
                    String string = jSONObject.getString("did");
                    if (i2 == 0) {
                        C3012e J1 = C6119c.this.mo31752J1(string);
                        if (J1 != null) {
                            J1.mo23221d0().mo31551M0(false);
                        } else {
                            String C1 = C6119c.f12559B;
                            AppUtils.m8300u(C1, "Invalid did return from cloud: " + string);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group close, onFailed : error : ");
            sb.append(str);
            sb.append(" , error code : ");
            sb.append(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.c$r */
    class C6137r implements CommonHandler<String> {

        /* renamed from: a */
        final /* synthetic */ long f12588a;

        C6137r(long j) {
            this.f12588a = j;
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group setBright, onSucceed : ");
            sb.append(str);
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int i2 = jSONObject.getInt("code");
                    String string = jSONObject.getString("did");
                    if (i2 == 0) {
                        C3012e J1 = C6119c.this.mo31752J1(string);
                        if (J1 != null) {
                            J1.mo23221d0().mo31600l0(this.f12588a);
                        } else {
                            String C1 = C6119c.f12559B;
                            AppUtils.m8300u(C1, "Invalid did return from cloud: " + string);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group setBright, onFailed : error : ");
            sb.append(str);
            sb.append(" , error code : ");
            sb.append(i);
        }
    }

    public C6119c(String str, String str2) {
        super(str, "yeelink.light.group", new C12042f(str2));
        mo23199O0(Device.Ownership.MINE);
        mo31763U1();
        mo23178B0(this);
        mo23187H0(str);
        mo31758P1();
        mo23228j0();
        mo23221d0().mo31600l0((long) mo31750F1());
    }

    public C6119c(String str, String str2, DeviceStatusBase deviceStatusBase) {
        super(str, str2, deviceStatusBase);
    }

    /* renamed from: D1 */
    private List<C12043g.C12044a> m18062D1(C8308a aVar) {
        ArrayList arrayList = new ArrayList();
        for (C8319k next : aVar.mo35338h()) {
            arrayList.add(new C12043g.C12044a(next.mo35377e(), next.mo35375c()));
        }
        return arrayList;
    }

    /* renamed from: G1 */
    private int[] m18063G1(List<C12043g.C12044a> list) {
        int[] iArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = list.get(i).mo42713a();
        }
        return iArr;
    }

    /* renamed from: H1 */
    private int m18064H1() {
        if (this.f12561x.size() < 1) {
            return 0;
        }
        int i = 1023;
        for (int i2 = 0; i2 < this.f12561x.size(); i2++) {
            i = C11972i.m30703a(i, C11972i.m30705c(this.f12561x.get(i2).mo23188I().mo31880a()));
        }
        return i;
    }

    /* renamed from: A */
    public int mo23113A() {
        return 11;
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        StringBuilder sb = new StringBuilder();
        sb.append("device group, toggle, isOpen: ");
        sb.append(mo23146k1());
        if (mo23146k1()) {
            mo23140b1();
            return false;
        }
        mo23148l1();
        return false;
    }

    /* renamed from: E1 */
    public boolean mo31749E1(String str) {
        CopyOnWriteArrayList<C3012e> copyOnWriteArrayList = this.f12561x;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            Iterator<C3012e> it = this.f12561x.iterator();
            while (it.hasNext()) {
                if (it.next().mo23208T().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: F */
    public int mo23116F() {
        return R$drawable.icon_yeelight_device_badge_group_small;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F1 */
    public int mo31750F1() {
        Iterator<C3012e> it = this.f12561x.iterator();
        int i = 1;
        while (it.hasNext()) {
            int m = it.next().mo23221d0().mo31601m();
            if (m > i) {
                i = m;
            }
        }
        return i;
    }

    /* renamed from: H */
    public int mo23119H() {
        return R$drawable.icon_yeelight_device_badge_group_big;
    }

    /* renamed from: I */
    public ProductModelBase mo23188I() {
        if (this.f4743h == null) {
            mo31759Q1();
        }
        return this.f4743h;
    }

    /* renamed from: I1 */
    public int mo31751I1() {
        return this.f12563z;
    }

    /* renamed from: J */
    public String mo23190J() {
        return "group";
    }

    /* renamed from: J1 */
    public C3012e mo31752J1(String str) {
        if (str == null || str.isEmpty()) {
            String str2 = f12559B;
            AppUtils.m8300u(str2, "DeviceGroup, getDeviceById, invalid did param: " + str);
            return null;
        }
        Iterator<C3012e> it = this.f12561x.iterator();
        while (it.hasNext()) {
            C3012e next = it.next();
            if (next.mo23185G().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: K1 */
    public List<C3012e> mo31753K1() {
        return this.f12561x;
    }

    /* renamed from: L1 */
    public int[] mo31754L1() {
        int[] iArr = {0, 0};
        Iterator<C3012e> it = this.f12561x.iterator();
        while (it.hasNext()) {
            C3012e next = it.next();
            if (next.mo23145k0()) {
                if (next.mo23146k1()) {
                    iArr[0] = iArr[0] + 1;
                } else {
                    iArr[1] = iArr[1] + 1;
                }
            }
        }
        return iArr;
    }

    /* renamed from: M1 */
    public int mo31755M1() {
        return mo31756N1().size();
    }

    /* renamed from: N1 */
    public List<C3012e> mo31756N1() {
        ArrayList arrayList = new ArrayList();
        Iterator<C3012e> it = this.f12561x.iterator();
        while (it.hasNext()) {
            C3012e next = it.next();
            if (!next.mo23230o0()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: O1 */
    public int mo31757O1() {
        return this.f12561x.size() - mo31755M1();
    }

    /* renamed from: P1 */
    public void mo31758P1() {
        mo31764V1();
        this.f12561x.clear();
        this.f4743h = null;
        this.f12560A.removeMessages(1, (Object) null);
        Cursor N = DeviceDataProvider.m17601N(mo23185G());
        this.f12563z = N.getCount();
        if (N.moveToFirst()) {
            do {
                String string = N.getString(N.getColumnIndex(C6043b.C6044a.C6045a.f12331c));
                StringBuilder sb = new StringBuilder();
                sb.append("DeviceGroup, device ID: ");
                sb.append(string);
                C3012e r0 = YeelightDeviceManager.m7804r0(string);
                if (r0 != null) {
                    this.f12561x.add(r0);
                }
            } while (N.moveToNext());
        }
        N.close();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Device list size: ");
        sb2.append(this.f12561x.size());
        mo31761S1();
        mo31767Y1();
    }

    /* renamed from: Q1 */
    public void mo31759Q1() {
        int H1 = m18064H1();
        if (H1 != -1) {
            ProductModelBase e = C11972i.m30707e(H1);
            this.f4743h = e;
            if ((e instanceof C6174c) && mo31749E1("yeelink.light.lamp15")) {
                this.f4743h = new C6188q("yeelink.light.group");
            }
        }
    }

    /* renamed from: R1 */
    public boolean mo31760R1() {
        Iterator<C3012e> it = this.f12561x.iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof WifiDeviceBase)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S1 */
    public void mo31761S1() {
        Iterator<C3012e> it = this.f12561x.iterator();
        while (it.hasNext()) {
            C3012e next = it.next();
            next.mo23171z0(this);
            next.mo23182D0(this);
        }
    }

    /* renamed from: T1 */
    public void mo31762T1() {
        mo23228j0();
    }

    /* renamed from: U */
    public String mo23210U() {
        String U = super.mo23210U();
        return (U == null || U.isEmpty()) ? C3108x.f4951e.getResources().getString(R$string.yeelight_device_name_group) : super.mo23210U();
    }

    /* renamed from: U0 */
    public boolean mo23131U0() {
        DeviceDataProvider.m17629k(mo23185G());
        YeelightDeviceManager.m7800o0().mo23320v1(mo23185G());
        return true;
    }

    /* renamed from: U1 */
    public void mo31763U1() {
        C3108x.f4951e.getContentResolver().registerContentObserver(C6043b.C6052e.f12375a, true, this.f12562y);
    }

    /* renamed from: V0 */
    public void mo23133V0(C12143c cVar) {
        this.f4740e.remove(cVar);
    }

    /* renamed from: V1 */
    public void mo31764V1() {
        Iterator<C3012e> it = this.f12561x.iterator();
        while (it.hasNext()) {
            C3012e next = it.next();
            next.mo23133V0(this);
            next.mo23215X0(this);
        }
    }

    /* renamed from: W1 */
    public void mo31765W1() {
        this.f12560A.sendEmptyMessageDelayed(1, 5000);
    }

    /* renamed from: X1 */
    public void mo31766X1() {
        C3108x.f4951e.getContentResolver().unregisterContentObserver(this.f12562y);
    }

    /* renamed from: Y0 */
    public boolean mo23137Y0() {
        return false;
    }

    /* renamed from: Y1 */
    public void mo31767Y1() {
        mo23221d0().mo31551M0(mo23146k1());
        C12041e eVar = (C12041e) mo23221d0().mo31611r(2);
        if (eVar != null) {
            eVar.mo42681e(0);
        }
        Iterator<C3012e> it = this.f12561x.iterator();
        int i = 1;
        while (it.hasNext()) {
            C3010c next = it.next();
            int m = next.mo23221d0().mo31601m();
            if (next instanceof C6094f) {
                m = C9201q.m22193e(m);
            }
            if (next.mo23145k0() && m > i) {
                i = m;
            }
            C12041e eVar2 = (C12041e) next.mo23221d0().mo31611r(2);
            if (eVar == null) {
                eVar = eVar2;
            } else if (eVar2 != null && eVar2.mo42677a() > eVar.mo42677a()) {
                eVar.mo42681e(eVar2.mo42677a());
            }
        }
        if (eVar == null) {
            eVar = new C12041e(mo23181D(), 0);
        }
        mo23221d0().mo31577a(eVar);
        mo23221d0().mo31600l0((long) i);
        mo23221d0().mo31590g0();
    }

    /* renamed from: b1 */
    public boolean mo23140b1() {
        StringBuilder sb = new StringBuilder();
        sb.append("device group, close: ");
        sb.append(this.f12561x.size());
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<C3012e> it = this.f12561x.iterator();
            while (it.hasNext()) {
                C3010c next = it.next();
                if (next.mo23145k0()) {
                    if (next instanceof C6081a) {
                        ((C6081a) next).mo23140b1();
                    } else if ((next instanceof WifiDeviceBase) && next.mo23200P() != null) {
                        ((WifiDeviceBase) next).mo23140b1();
                    } else if (next instanceof C6100g) {
                        ((C6100g) next).mo23140b1();
                    } else {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put("off");
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("did", next.mo23185G());
                        jSONObject2.put("params", jSONArray2);
                        jSONArray.put(jSONObject2);
                        if (jSONArray.length() == 49) {
                            jSONObject.put("method", "set_power");
                            jSONObject.put("rpcs", jSONArray);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("DeviceGroup, close, json to send: ");
                            sb2.append(jSONObject.toString());
                            YeelightDeviceManager.m7770S(jSONObject, new C6135p());
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
            StringBuilder sb3 = new StringBuilder();
            sb3.append("DeviceGroup, close, json to send: ");
            sb3.append(jSONObject.toString());
            YeelightDeviceManager.m7770S(jSONObject, new C6136q());
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<C3012e> it = this.f12561x.iterator();
            while (it.hasNext()) {
                C3012e next = it.next();
                if (next instanceof C6081a) {
                    if (!next.mo23145k0()) {
                    }
                } else if (!(next instanceof WifiDeviceBase) || next.mo23200P() == null) {
                    if (next instanceof C6100g) {
                        next.mo23162u1(0);
                    } else {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(0);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("did", next.mo23185G());
                        jSONObject2.put("params", jSONArray2);
                        jSONArray.put(jSONObject2);
                    }
                }
                next.mo23141c1();
            }
            if (jSONArray.length() == 0) {
                return true;
            }
            jSONObject.put("method", "cron_del");
            jSONObject.put("rpcs", jSONArray);
            StringBuilder sb = new StringBuilder();
            sb.append("DeviceGroup cron_del params = ");
            sb.append(jSONObject.toString());
            return YeelightDeviceManager.m7770S(jSONObject, new C6128i(this));
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public void mo31768d(int i, DeviceStatusBase deviceStatusBase) {
        int i2;
        Handler handler;
        long j;
        if (i != 1) {
            i2 = 2;
            if (!(i == 2 || i == 8)) {
                if (i == 4096) {
                    this.f12560A.removeMessages(2);
                    handler = this.f12560A;
                    j = 2000;
                    handler.sendEmptyMessageDelayed(i2, j);
                }
                return;
            }
        }
        i2 = 3;
        this.f12560A.removeMessages(3);
        handler = this.f12560A;
        j = 100;
        handler.sendEmptyMessageDelayed(i2, j);
    }

    /* renamed from: f1 */
    public boolean mo23142f1(boolean z) {
        return false;
    }

    /* renamed from: g0 */
    public int mo23143g0() {
        return 0;
    }

    /* renamed from: i1 */
    public String mo23144i1() {
        int H1 = m18064H1();
        if (H1 == 0) {
            return "";
        }
        String d = C11972i.m30706d(H1);
        return (!TextUtils.equals(d, "yeelink.light.ceiling10") || !mo31749E1("yeelink.light.lamp15")) ? d : "yeelink.light.lamp15";
    }

    /* renamed from: k0 */
    public boolean mo23145k0() {
        Iterator<C3012e> it = this.f12561x.iterator();
        while (it.hasNext()) {
            if (it.next().mo23145k0()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k1 */
    public boolean mo23146k1() {
        Iterator<C3012e> it = this.f12561x.iterator();
        while (it.hasNext()) {
            C3012e next = it.next();
            if (next.mo23145k0() && next.mo23146k1()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l0 */
    public boolean mo23147l0() {
        return false;
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        StringBuilder sb = new StringBuilder();
        sb.append("device group, open: ");
        sb.append(this.f12561x.size());
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<C3012e> it = this.f12561x.iterator();
            while (it.hasNext()) {
                C3010c next = it.next();
                if (next.mo23145k0()) {
                    if (next instanceof C6081a) {
                        ((C6081a) next).mo23148l1();
                    } else if ((next instanceof WifiDeviceBase) && next.mo23200P() != null) {
                        ((WifiDeviceBase) next).mo23148l1();
                    } else if (next instanceof C6100g) {
                        ((C6100g) next).mo23148l1();
                    } else {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put("on");
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("did", next.mo23185G());
                        jSONObject2.put("params", jSONArray2);
                        jSONArray.put(jSONObject2);
                        if (jSONArray.length() == 49) {
                            jSONObject.put("method", "set_power");
                            jSONObject.put("rpcs", jSONArray);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("DeviceGroup, open, json to send: ");
                            sb2.append(jSONObject.toString());
                            YeelightDeviceManager.m7770S(jSONObject, new C6131l());
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
            StringBuilder sb3 = new StringBuilder();
            sb3.append("DeviceGroup, open, json to send: ");
            sb3.append(jSONObject.toString());
            YeelightDeviceManager.m7770S(jSONObject, new C6132m());
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: m0 */
    public boolean mo23149m0() {
        return !mo23145k0();
    }

    /* renamed from: m1 */
    public boolean mo23150m1(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("device group, open with mode: ");
        sb.append(i);
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<C3012e> it = this.f12561x.iterator();
            while (it.hasNext()) {
                C3010c next = it.next();
                if (next.mo23145k0()) {
                    if (next instanceof C6081a) {
                        if (!((C6081a) next).mo23146k1()) {
                            ((C6081a) next).mo23148l1();
                        }
                        DeviceStatusBase.DeviceMode z = next.mo23221d0().mo31627z();
                        ((C6081a) next).mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR);
                        ((C6081a) next).mo23152o1(z);
                    } else if ((next instanceof WifiDeviceBase) && next.mo23200P() != null) {
                        ((WifiDeviceBase) next).mo23150m1(i);
                    } else if (next instanceof C6100g) {
                        ((C6100g) next).mo23150m1(i);
                    } else {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put("on");
                        jSONArray2.put("smooth");
                        jSONArray2.put(500);
                        jSONArray2.put(i);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("did", next.mo23185G());
                        jSONObject2.put("params", jSONArray2);
                        jSONArray.put(jSONObject2);
                        if (jSONArray.length() == 49) {
                            jSONObject.put("method", "set_power");
                            jSONObject.put("rpcs", jSONArray);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("DeviceGroup, openWithMode, json to send: ");
                            sb2.append(jSONObject.toString());
                            YeelightDeviceManager.m7770S(jSONObject, new C6133n(i));
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
            StringBuilder sb3 = new StringBuilder();
            sb3.append("DeviceGroup, openWithMode, json to send: ");
            sb3.append(jSONObject.toString());
            YeelightDeviceManager.m7770S(jSONObject, new C6134o(i));
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: n */
    public void mo23151n() {
    }

    /* renamed from: o0 */
    public boolean mo23230o0() {
        Iterator<C3012e> it = this.f12561x.iterator();
        while (it.hasNext()) {
            if (it.next().mo23230o0()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o1 */
    public boolean mo23152o1(DeviceStatusBase.DeviceMode deviceMode) {
        return false;
    }

    public void onConnectionStateChanged(int i, int i2) {
        for (C12143c onConnectionStateChanged : this.f4740e) {
            onConnectionStateChanged.onConnectionStateChanged(i, i2);
        }
        if (i2 == 11 || i2 == 0) {
            mo31759Q1();
        }
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == 1024) {
            StringBuilder sb = new StringBuilder();
            sb.append("GroupDevice, onStatusChange, TYPE_NAME ");
            sb.append(deviceStatusBase.mo31526A());
            sb.append(", device id");
            sb.append(mo23185G());
            DeviceDataProvider.m17621d0(this);
        }
    }

    /* renamed from: p0 */
    public boolean mo23153p0() {
        return false;
    }

    /* renamed from: p1 */
    public boolean mo23154p1(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("device group, setBright: ");
        sb.append(this.f12561x.size());
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<C3012e> it = this.f12561x.iterator();
            while (it.hasNext()) {
                C3010c next = it.next();
                if (next.mo23145k0()) {
                    if (next instanceof C6081a) {
                        ((C6081a) next).mo23154p1(j);
                    } else if ((next instanceof WifiDeviceBase) && next.mo23200P() != null) {
                        ((WifiDeviceBase) next).mo23154p1(j);
                    } else if (next instanceof C6100g) {
                        ((C6100g) next).mo23154p1(j);
                    } else {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put("bright");
                        jSONArray2.put(j);
                        jSONArray2.put(500);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("did", next.mo23185G());
                        jSONObject2.put("params", jSONArray2);
                        jSONArray.put(jSONObject2);
                        if (jSONArray.length() == 49) {
                            jSONObject.put("method", "set_scene");
                            jSONObject.put("rpcs", jSONArray);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("DeviceGroup, setBright, json to send: ");
                            sb2.append(jSONObject.toString());
                            YeelightDeviceManager.m7770S(jSONObject, new C6137r(j));
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
            StringBuilder sb3 = new StringBuilder();
            sb3.append("DeviceGroup, setBright, json to send: ");
            sb3.append(jSONObject.toString());
            YeelightDeviceManager.m7770S(jSONObject, new C6120a(j));
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: q1 */
    public boolean mo23155q1(int i) {
        mo23221d0().mo31602m0(i);
        mo23221d0().mo31531C0(DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR);
        StringBuilder sb = new StringBuilder();
        sb.append("device group, setColor: ");
        sb.append(this.f12561x.size());
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<C3012e> it = this.f12561x.iterator();
            while (it.hasNext()) {
                C3010c next = it.next();
                if (next.mo23145k0()) {
                    if (next instanceof C6081a) {
                        ((C6081a) next).mo23155q1(i);
                    } else if ((next instanceof WifiDeviceBase) && next.mo23200P() != null) {
                        ((WifiDeviceBase) next).mo23155q1(i);
                    } else if (next instanceof C6100g) {
                        ((C6100g) next).mo23155q1(i);
                    } else {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(16777215 & i);
                        jSONArray2.put("smooth");
                        jSONArray2.put(500);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("did", next.mo23185G());
                        jSONObject2.put("params", jSONArray2);
                        jSONArray.put(jSONObject2);
                        if (jSONArray.length() == 49) {
                            jSONObject.put("method", "set_rgb");
                            jSONObject.put("rpcs", jSONArray);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("DeviceGroup, setColor, json to send: ");
                            sb2.append(jSONObject.toString());
                            YeelightDeviceManager.m7770S(jSONObject, new C6123d(i));
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
            StringBuilder sb3 = new StringBuilder();
            sb3.append("DeviceGroup, setColor, json to send: ");
            sb3.append(jSONObject.toString());
            YeelightDeviceManager.m7770S(jSONObject, new C6124e(i));
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: r */
    public void mo23156r() {
    }

    /* renamed from: r1 */
    public boolean mo23157r1(int i, int[] iArr, int i2) {
        ArrayList arrayList = new ArrayList();
        for (int aVar : iArr) {
            arrayList.add(new C12043g.C12044a(aVar, i));
        }
        mo23221d0().mo31604n0(arrayList);
        mo23221d0().mo31531C0(DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW);
        Iterator<C3012e> it = this.f12561x.iterator();
        while (it.hasNext()) {
            C3012e next = it.next();
            if (next.mo23145k0()) {
                next.mo23157r1(i, iArr, i2);
            }
        }
        return true;
    }

    /* renamed from: s */
    public boolean mo23158s(ActionType actionType) {
        return false;
    }

    /* renamed from: s1 */
    public boolean mo23159s1(int i) {
        mo23221d0().mo31610q0(i);
        mo23221d0().mo31531C0(DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE);
        StringBuilder sb = new StringBuilder();
        sb.append("device group, setCt: ");
        sb.append(this.f12561x.size());
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<C3012e> it = this.f12561x.iterator();
            while (it.hasNext()) {
                C3010c next = it.next();
                if (next.mo23145k0()) {
                    if (next instanceof C6081a) {
                        ((C6081a) next).mo23159s1(i);
                    } else if ((next instanceof WifiDeviceBase) && next.mo23200P() != null) {
                        ((WifiDeviceBase) next).mo23159s1(i);
                    } else if (next instanceof C6100g) {
                        ((C6100g) next).mo23159s1(i);
                    } else {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(i);
                        jSONArray2.put("smooth");
                        jSONArray2.put(500);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("did", next.mo23185G());
                        jSONObject2.put("params", jSONArray2);
                        jSONArray.put(jSONObject2);
                        if (jSONArray.length() == 49) {
                            jSONObject.put("method", "set_ct_abx");
                            jSONObject.put("rpcs", jSONArray);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("DeviceGroup, setCt, json to send: ");
                            sb2.append(jSONObject.toString());
                            YeelightDeviceManager.m7770S(jSONObject, new C6121b(i));
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
            StringBuilder sb3 = new StringBuilder();
            sb3.append("DeviceGroup, setCt, json to send: ");
            sb3.append(jSONObject.toString());
            YeelightDeviceManager.m7770S(jSONObject, new C6122c(i));
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: u0 */
    public void mo23161u0(View view) {
        Intent intent;
        Class<DemoControlViewActivity> cls = null;
        if (mo23145k0()) {
            Class<DemoControlViewActivity> cls2 = DemoControlViewActivity.class;
            try {
                int i = DemoControlViewActivity.f10265p;
                cls = cls2;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            if (cls != null) {
                intent = new Intent();
                intent.setClass(view.getContext(), cls);
                intent.putExtra("com.yeelight.cherry.device_id", mo23185G());
                intent.putExtra("group_flag", true);
            } else {
                return;
            }
        } else {
            Class<DeviceSettingActivity> cls3 = DeviceSettingActivity.class;
            try {
                int i2 = DeviceSettingActivity.f10342d;
                cls = cls3;
            } catch (ClassNotFoundException e2) {
                e2.printStackTrace();
            }
            if (cls != null) {
                intent = new Intent();
                intent.setClass(view.getContext(), cls);
                intent.putExtra("com.yeelight.cherry.device_id", mo23185G());
            } else {
                return;
            }
        }
        view.getContext().startActivity(intent);
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<C3012e> it = this.f12561x.iterator();
            while (it.hasNext()) {
                C3012e next = it.next();
                if (next instanceof C6081a) {
                    if (!next.mo23145k0()) {
                    }
                } else if (!(next instanceof WifiDeviceBase) || next.mo23200P() == null) {
                    if (!(next instanceof C6100g)) {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(0);
                        jSONArray2.put(i);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("did", next.mo23185G());
                        jSONObject2.put("params", jSONArray2);
                        jSONArray.put(jSONObject2);
                    }
                }
                next.mo23162u1(i);
            }
            if (jSONArray.length() == 0) {
                return true;
            }
            jSONObject.put("method", "cron_add");
            jSONObject.put("rpcs", jSONArray);
            StringBuilder sb = new StringBuilder();
            sb.append("DeviceGroup cron_add params = ");
            sb.append(jSONObject.toString());
            return YeelightDeviceManager.m7770S(jSONObject, new C6127h(this));
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
        mo31764V1();
        mo31766X1();
    }

    /* renamed from: w0 */
    public boolean mo23164w0(String str) {
        return false;
    }

    /* renamed from: w1 */
    public boolean mo23165w1(DeviceStatusBase.DeviceMode deviceMode) {
        mo23221d0().mo31531C0(deviceMode);
        Iterator<C3012e> it = this.f12561x.iterator();
        while (it.hasNext()) {
            C3012e next = it.next();
            if (next.mo23145k0() || next.mo23233q0()) {
                next.mo23165w1(deviceMode);
            }
        }
        return true;
    }

    /* renamed from: x */
    public boolean mo23166x(int i, Object obj) {
        if (i == 1) {
            mo23198N0((String) obj);
            return false;
        } else if (i == 10) {
            C12041e eVar = (C12041e) obj;
            mo23162u1(eVar.mo42678b());
            mo23221d0().mo31577a(eVar);
            return false;
        } else if (i != 14) {
            return false;
        } else {
            mo23141c1();
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003a, code lost:
        if (mo23188I().mo31881b(com.yeelight.yeelib.device.models.ProductModelBase.CapabilityType.CONTROL_FLOW_H) != false) goto L_0x003c;
     */
    /* renamed from: x1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo23168x1(com.yeelight.yeelib.models.C8327s r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.mo35449p()
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
            com.yeelight.yeelib.device.base.DeviceStatusBase r2 = r16.mo23221d0()
            int r4 = r17.mo35439f()
            long r4 = (long) r4
            r2.mo31545J0(r4)
            com.yeelight.yeelib.device.base.DeviceStatusBase r2 = r16.mo23221d0()
            com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r4 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT
        L_0x0020:
            r2.mo31531C0(r4)
            goto L_0x00cc
        L_0x0025:
            com.yeelight.yeelib.device.base.DeviceStatusBase r2 = r16.mo23221d0()
            com.yeelight.yeelib.models.a r4 = r17.mo35436c()
            r2.mo31616t0(r4)
            com.yeelight.yeelib.device.models.ProductModelBase r2 = r16.mo23188I()
            com.yeelight.yeelib.device.models.ProductModelBase$CapabilityType r4 = com.yeelight.yeelib.device.models.ProductModelBase.CapabilityType.CONTROL_FLOW_H
            boolean r2 = r2.mo31881b(r4)
            if (r2 == 0) goto L_0x00cc
        L_0x003c:
            com.yeelight.yeelib.device.base.DeviceStatusBase r2 = r16.mo23221d0()
            com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r4 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW
            goto L_0x0020
        L_0x0043:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int[] r4 = r17.mo35443j()
            int r5 = r4.length
            r6 = 0
        L_0x004e:
            if (r6 >= r5) goto L_0x0061
            r7 = r4[r6]
            y3.g$a r8 = new y3.g$a
            int r9 = r17.mo35446m()
            r8.<init>(r7, r9)
            r2.add(r8)
            int r6 = r6 + 1
            goto L_0x004e
        L_0x0061:
            com.yeelight.yeelib.device.base.DeviceStatusBase r4 = r16.mo23221d0()
            r4.mo31604n0(r2)
            goto L_0x003c
        L_0x0069:
            int r2 = r17.mo35439f()
            if (r2 <= 0) goto L_0x007b
            com.yeelight.yeelib.device.base.DeviceStatusBase r2 = r16.mo23221d0()
            int r4 = r17.mo35439f()
            long r4 = (long) r4
            r2.mo31600l0(r4)
        L_0x007b:
            com.yeelight.yeelib.device.base.DeviceStatusBase r2 = r16.mo23221d0()
            int r4 = r17.mo35441h()
            r2.mo31610q0(r4)
            com.yeelight.yeelib.device.base.DeviceStatusBase r2 = r16.mo23221d0()
            com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r4 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE
            goto L_0x0020
        L_0x008d:
            int r2 = r17.mo35439f()
            if (r2 <= 0) goto L_0x009f
            com.yeelight.yeelib.device.base.DeviceStatusBase r2 = r16.mo23221d0()
            int r4 = r17.mo35439f()
            long r4 = (long) r4
            r2.mo31600l0(r4)
        L_0x009f:
            com.yeelight.yeelib.device.base.DeviceStatusBase r2 = r16.mo23221d0()
            int r4 = r17.mo35440g()
            r2.mo31602m0(r4)
            com.yeelight.yeelib.device.base.DeviceStatusBase r2 = r16.mo23221d0()
            com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r4 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR
            goto L_0x0020
        L_0x00b2:
            int r2 = r17.mo35439f()
            if (r2 <= 0) goto L_0x00cc
            com.yeelight.yeelib.device.base.DeviceStatusBase r2 = r16.mo23221d0()
            int r4 = r17.mo35439f()
            long r4 = (long) r4
            r2.mo31600l0(r4)
            goto L_0x00cc
        L_0x00c5:
            com.yeelight.yeelib.device.base.DeviceStatusBase r2 = r16.mo23221d0()
            r2.mo31551M0(r3)
        L_0x00cc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "device group, setScene: "
            r2.append(r4)
            java.util.concurrent.CopyOnWriteArrayList<com.yeelight.yeelib.device.base.e> r4 = r0.f12561x
            int r4 = r4.size()
            r2.append(r4)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            java.util.concurrent.CopyOnWriteArrayList<com.yeelight.yeelib.device.base.e> r5 = r0.f12561x     // Catch:{ JSONException -> 0x0308 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ JSONException -> 0x0308 }
        L_0x00ef:
            boolean r6 = r5.hasNext()     // Catch:{ JSONException -> 0x0308 }
            java.lang.String r7 = "DeviceGroup, setScene, json to send: "
            java.lang.String r8 = "rpcs"
            java.lang.String r9 = "set_scene"
            java.lang.String r10 = "method"
            if (r6 == 0) goto L_0x02e2
            java.lang.Object r6 = r5.next()     // Catch:{ JSONException -> 0x0308 }
            com.yeelight.yeelib.device.base.c r6 = (com.yeelight.yeelib.device.base.C3010c) r6     // Catch:{ JSONException -> 0x0308 }
            boolean r11 = r6.mo23145k0()     // Catch:{ JSONException -> 0x0308 }
            if (r11 != 0) goto L_0x010b
            goto L_0x02df
        L_0x010b:
            boolean r11 = r6 instanceof com.yeelight.yeelib.device.C6081a     // Catch:{ JSONException -> 0x0308 }
            if (r11 == 0) goto L_0x016a
            int r7 = r17.mo35449p()     // Catch:{ JSONException -> 0x0308 }
            r8 = 5
            if (r7 != r8) goto L_0x0163
            com.yeelight.yeelib.models.a r7 = r17.mo35436c()     // Catch:{ JSONException -> 0x0308 }
            java.util.List r7 = r0.m18062D1(r7)     // Catch:{ JSONException -> 0x0308 }
            com.yeelight.yeelib.device.base.DeviceStatusBase r8 = r6.mo23221d0()     // Catch:{ JSONException -> 0x0308 }
            com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r8 = r8.mo31627z()     // Catch:{ JSONException -> 0x0308 }
            com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r9 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_FLOW     // Catch:{ JSONException -> 0x0308 }
            if (r8 != r9) goto L_0x014e
            r8 = r6
            w3.r r8 = (p223w3.C11627r) r8     // Catch:{ JSONException -> 0x0308 }
            java.lang.Object r9 = r7.get(r3)     // Catch:{ JSONException -> 0x0308 }
            y3.g$a r9 = (p232y3.C12043g.C12044a) r9     // Catch:{ JSONException -> 0x0308 }
            int r9 = r9.mo42714b()     // Catch:{ JSONException -> 0x0308 }
            int[] r7 = r0.m18063G1(r7)     // Catch:{ JSONException -> 0x0308 }
            int r10 = r16.mo31750F1()     // Catch:{ JSONException -> 0x0308 }
            r8.mo23157r1(r9, r7, r10)     // Catch:{ JSONException -> 0x0308 }
            w3.r r6 = (p223w3.C11627r) r6     // Catch:{ JSONException -> 0x0308 }
            int r7 = r16.mo31750F1()     // Catch:{ JSONException -> 0x0308 }
            long r7 = (long) r7     // Catch:{ JSONException -> 0x0308 }
            r6.mo23154p1(r7)     // Catch:{ JSONException -> 0x0308 }
            goto L_0x02df
        L_0x014e:
            com.yeelight.yeelib.device.base.DeviceStatusBase r7 = r6.mo23221d0()     // Catch:{ JSONException -> 0x0308 }
            com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r7 = r7.mo31627z()     // Catch:{ JSONException -> 0x0308 }
            r8 = r6
            w3.r r8 = (p223w3.C11627r) r8     // Catch:{ JSONException -> 0x0308 }
            r8.mo23165w1(r9)     // Catch:{ JSONException -> 0x0308 }
            w3.r r6 = (p223w3.C11627r) r6     // Catch:{ JSONException -> 0x0308 }
            r6.mo23152o1(r7)     // Catch:{ JSONException -> 0x0308 }
            goto L_0x02df
        L_0x0163:
            com.yeelight.yeelib.device.a r6 = (com.yeelight.yeelib.device.C6081a) r6     // Catch:{ JSONException -> 0x0308 }
            r6.mo23168x1(r1)     // Catch:{ JSONException -> 0x0308 }
            goto L_0x02df
        L_0x016a:
            boolean r11 = r6 instanceof com.yeelight.yeelib.device.WifiDeviceBase     // Catch:{ JSONException -> 0x0308 }
            if (r11 == 0) goto L_0x017b
            com.yeelight.yeelib.device.LanDevice r11 = r6.mo23200P()     // Catch:{ JSONException -> 0x0308 }
            if (r11 == 0) goto L_0x017b
            com.yeelight.yeelib.device.WifiDeviceBase r6 = (com.yeelight.yeelib.device.WifiDeviceBase) r6     // Catch:{ JSONException -> 0x0308 }
            r6.mo23168x1(r1)     // Catch:{ JSONException -> 0x0308 }
            goto L_0x02df
        L_0x017b:
            boolean r11 = r6 instanceof com.yeelight.yeelib.device.base.C6100g     // Catch:{ JSONException -> 0x0308 }
            if (r11 == 0) goto L_0x0186
            com.yeelight.yeelib.device.base.g r6 = (com.yeelight.yeelib.device.base.C6100g) r6     // Catch:{ JSONException -> 0x0308 }
            r6.mo23168x1(r1)     // Catch:{ JSONException -> 0x0308 }
            goto L_0x02df
        L_0x0186:
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0308 }
            r11.<init>()     // Catch:{ JSONException -> 0x0308 }
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0308 }
            r12.<init>()     // Catch:{ JSONException -> 0x0308 }
            boolean r13 = r17.mo35455v()     // Catch:{ JSONException -> 0x0308 }
            java.lang.String r14 = "cf"
            java.lang.String r15 = "params"
            java.lang.String r3 = "did"
            if (r13 == 0) goto L_0x01d0
            r11.put(r14)     // Catch:{ JSONException -> 0x0308 }
            com.yeelight.yeelib.models.a r13 = r17.mo35436c()     // Catch:{ JSONException -> 0x0308 }
            int r13 = r13.mo35339i()     // Catch:{ JSONException -> 0x0308 }
            r11.put(r13)     // Catch:{ JSONException -> 0x0308 }
            com.yeelight.yeelib.models.a r13 = r17.mo35436c()     // Catch:{ JSONException -> 0x0308 }
            com.yeelight.yeelib.models.FlowCompleteAction r13 = r13.mo35336f()     // Catch:{ JSONException -> 0x0308 }
            int r13 = r13.ordinal()     // Catch:{ JSONException -> 0x0308 }
            r11.put(r13)     // Catch:{ JSONException -> 0x0308 }
            com.yeelight.yeelib.models.a r13 = r17.mo35436c()     // Catch:{ JSONException -> 0x0308 }
            java.lang.String r13 = r13.mo35337g()     // Catch:{ JSONException -> 0x0308 }
            r11.put(r13)     // Catch:{ JSONException -> 0x0308 }
            java.lang.String r6 = r6.mo23185G()     // Catch:{ JSONException -> 0x0308 }
            r12.put(r3, r6)     // Catch:{ JSONException -> 0x0308 }
        L_0x01cb:
            r12.put(r15, r11)     // Catch:{ JSONException -> 0x0308 }
            goto L_0x0292
        L_0x01d0:
            boolean r13 = r17.mo35423H()     // Catch:{ JSONException -> 0x0308 }
            if (r13 == 0) goto L_0x01ea
            java.lang.String r13 = "off"
            r11.put(r13)     // Catch:{ JSONException -> 0x0308 }
            r13 = 0
            r11.put(r13)     // Catch:{ JSONException -> 0x0308 }
            r11.put(r13)     // Catch:{ JSONException -> 0x0308 }
            java.lang.String r6 = r6.mo23185G()     // Catch:{ JSONException -> 0x0308 }
            r12.put(r3, r6)     // Catch:{ JSONException -> 0x0308 }
            goto L_0x01cb
        L_0x01ea:
            boolean r13 = r17.mo35458y()     // Catch:{ JSONException -> 0x0308 }
            if (r13 == 0) goto L_0x0209
            java.lang.String r13 = "bright"
            r11.put(r13)     // Catch:{ JSONException -> 0x0308 }
            int r13 = r17.mo35439f()     // Catch:{ JSONException -> 0x0308 }
            r11.put(r13)     // Catch:{ JSONException -> 0x0308 }
            r13 = 500(0x1f4, float:7.0E-43)
            r11.put(r13)     // Catch:{ JSONException -> 0x0308 }
            java.lang.String r6 = r6.mo23185G()     // Catch:{ JSONException -> 0x0308 }
            r12.put(r3, r6)     // Catch:{ JSONException -> 0x0308 }
            goto L_0x01cb
        L_0x0209:
            boolean r13 = r17.mo35419D()     // Catch:{ JSONException -> 0x0308 }
            if (r13 == 0) goto L_0x022a
            java.lang.String r13 = "ct"
            r11.put(r13)     // Catch:{ JSONException -> 0x0308 }
            int r13 = r17.mo35441h()     // Catch:{ JSONException -> 0x0308 }
            r11.put(r13)     // Catch:{ JSONException -> 0x0308 }
            int r13 = r17.mo35439f()     // Catch:{ JSONException -> 0x0308 }
            r11.put(r13)     // Catch:{ JSONException -> 0x0308 }
            java.lang.String r6 = r6.mo23185G()     // Catch:{ JSONException -> 0x0308 }
            r12.put(r3, r6)     // Catch:{ JSONException -> 0x0308 }
            goto L_0x01cb
        L_0x022a:
            boolean r13 = r17.mo35417B()     // Catch:{ JSONException -> 0x0308 }
            if (r13 == 0) goto L_0x0250
            java.lang.String r13 = "color"
            r11.put(r13)     // Catch:{ JSONException -> 0x0308 }
            int r13 = r17.mo35440g()     // Catch:{ JSONException -> 0x0308 }
            r14 = 16777215(0xffffff, float:2.3509886E-38)
            r13 = r13 & r14
            r11.put(r13)     // Catch:{ JSONException -> 0x0308 }
            int r13 = r17.mo35439f()     // Catch:{ JSONException -> 0x0308 }
            r11.put(r13)     // Catch:{ JSONException -> 0x0308 }
            java.lang.String r6 = r6.mo23185G()     // Catch:{ JSONException -> 0x0308 }
            r12.put(r3, r6)     // Catch:{ JSONException -> 0x0308 }
            goto L_0x01cb
        L_0x0250:
            boolean r13 = r17.mo35456w()     // Catch:{ JSONException -> 0x0308 }
            if (r13 == 0) goto L_0x0277
            r11.put(r14)     // Catch:{ JSONException -> 0x0308 }
            int r13 = r17.mo35444k()     // Catch:{ JSONException -> 0x0308 }
            r11.put(r13)     // Catch:{ JSONException -> 0x0308 }
            int r13 = r17.mo35445l()     // Catch:{ JSONException -> 0x0308 }
            r11.put(r13)     // Catch:{ JSONException -> 0x0308 }
            java.lang.String r13 = r17.mo35447n()     // Catch:{ JSONException -> 0x0308 }
            r11.put(r13)     // Catch:{ JSONException -> 0x0308 }
            java.lang.String r6 = r6.mo23185G()     // Catch:{ JSONException -> 0x0308 }
            r12.put(r3, r6)     // Catch:{ JSONException -> 0x0308 }
            goto L_0x01cb
        L_0x0277:
            boolean r13 = r17.mo35421F()     // Catch:{ JSONException -> 0x0308 }
            if (r13 == 0) goto L_0x02c5
            java.lang.String r13 = "nightlight"
            r11.put(r13)     // Catch:{ JSONException -> 0x0308 }
            int r13 = r17.mo35439f()     // Catch:{ JSONException -> 0x0308 }
            r11.put(r13)     // Catch:{ JSONException -> 0x0308 }
            java.lang.String r6 = r6.mo23185G()     // Catch:{ JSONException -> 0x0308 }
            r12.put(r3, r6)     // Catch:{ JSONException -> 0x0308 }
            goto L_0x01cb
        L_0x0292:
            r4.put(r12)     // Catch:{ JSONException -> 0x0308 }
            int r3 = r4.length()     // Catch:{ JSONException -> 0x0308 }
            r6 = 49
            if (r3 != r6) goto L_0x02df
            r2.put(r10, r9)     // Catch:{ JSONException -> 0x0308 }
            r2.put(r8, r4)     // Catch:{ JSONException -> 0x0308 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0308 }
            r3.<init>()     // Catch:{ JSONException -> 0x0308 }
            r3.append(r7)     // Catch:{ JSONException -> 0x0308 }
            java.lang.String r4 = r2.toString()     // Catch:{ JSONException -> 0x0308 }
            r3.append(r4)     // Catch:{ JSONException -> 0x0308 }
            com.yeelight.yeelib.device.c$f r3 = new com.yeelight.yeelib.device.c$f     // Catch:{ JSONException -> 0x0308 }
            r3.<init>(r1)     // Catch:{ JSONException -> 0x0308 }
            com.yeelight.yeelib.managers.YeelightDeviceManager.m7770S(r2, r3)     // Catch:{ JSONException -> 0x0308 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0308 }
            r2.<init>()     // Catch:{ JSONException -> 0x0308 }
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0308 }
            r4.<init>()     // Catch:{ JSONException -> 0x0308 }
            goto L_0x02df
        L_0x02c5:
            java.lang.String r3 = "BATCH_RPC"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0308 }
            r6.<init>()     // Catch:{ JSONException -> 0x0308 }
            java.lang.String r7 = "invalid scene mode: "
            r6.append(r7)     // Catch:{ JSONException -> 0x0308 }
            int r7 = r17.mo35449p()     // Catch:{ JSONException -> 0x0308 }
            r6.append(r7)     // Catch:{ JSONException -> 0x0308 }
            java.lang.String r6 = r6.toString()     // Catch:{ JSONException -> 0x0308 }
            com.yeelight.yeelib.utils.AppUtils.m8300u(r3, r6)     // Catch:{ JSONException -> 0x0308 }
        L_0x02df:
            r3 = 0
            goto L_0x00ef
        L_0x02e2:
            int r3 = r4.length()     // Catch:{ JSONException -> 0x0308 }
            r5 = 1
            if (r3 != 0) goto L_0x02ea
            return r5
        L_0x02ea:
            r2.put(r10, r9)     // Catch:{ JSONException -> 0x0308 }
            r2.put(r8, r4)     // Catch:{ JSONException -> 0x0308 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0308 }
            r3.<init>()     // Catch:{ JSONException -> 0x0308 }
            r3.append(r7)     // Catch:{ JSONException -> 0x0308 }
            java.lang.String r4 = r2.toString()     // Catch:{ JSONException -> 0x0308 }
            r3.append(r4)     // Catch:{ JSONException -> 0x0308 }
            com.yeelight.yeelib.device.c$g r3 = new com.yeelight.yeelib.device.c$g     // Catch:{ JSONException -> 0x0308 }
            r3.<init>(r1)     // Catch:{ JSONException -> 0x0308 }
            com.yeelight.yeelib.managers.YeelightDeviceManager.m7770S(r2, r3)     // Catch:{ JSONException -> 0x0308 }
            return r5
        L_0x0308:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.C6119c.mo23168x1(com.yeelight.yeelib.models.s):boolean");
    }

    /* renamed from: y0 */
    public void mo23169y0() {
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[0];
    }

    /* renamed from: z0 */
    public void mo23171z0(C12143c cVar) {
        this.f4740e.add(cVar);
    }
}

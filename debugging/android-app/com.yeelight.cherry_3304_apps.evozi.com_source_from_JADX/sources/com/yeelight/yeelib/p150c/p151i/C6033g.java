package com.yeelight.yeelib.p150c.p151i;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import androidx.annotation.StringRes;
import com.miot.api.CommonHandler;
import com.miot.api.Constants;
import com.miot.api.MiotManager;
import com.miot.common.exception.MiotException;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p150c.C5999e;
import com.yeelight.yeelib.p150c.p181l.C6126d0;
import com.yeelight.yeelib.p150c.p184n.C7554e;
import com.yeelight.yeelib.p152f.C9784e;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.activity.DeviceOfflinePromptActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.c.i.g */
public abstract class C6033g extends C6067o {

    /* renamed from: G */
    protected C6037d f12820G;

    /* renamed from: H */
    protected int f12821H = 0;

    /* renamed from: I */
    private List<C6038h> f12822I;

    /* renamed from: J */
    private Map<Integer, C6036c> f12823J;

    /* renamed from: com.yeelight.yeelib.c.i.g$a */
    class C6034a implements CommonHandler<String> {
        C6034a() {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            String str2 = C6033g.this.f7260v;
            "queryBoundRemoteList, onSucceed ret = " + str;
            C6033g.this.mo23408d0().mo27709q0(C6033g.this.mo27747i2(str));
        }

        public void onFailed(int i, String str) {
            String str2 = C6033g.this.f7260v;
            "queryBoundRemoteList, onFailed ret = " + str + ", i = " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.i.g$b */
    class C6035b implements CommonHandler<String> {

        /* renamed from: a */
        final /* synthetic */ int f12825a;

        C6035b(int i) {
            this.f12825a = i;
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "unbindRemote, onSucceed ret = " + str;
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getString(Constants.EXTRA_PUSH_MESSAGE).equals("ok") && jSONObject.getString("result").contains("ok") && (this.f12825a == 21 || this.f12825a == 296 || this.f12825a == 295 || this.f12825a == 294)) {
                    C6033g.this.mo23408d0().mo27628A0((C6046l) null);
                }
                C6033g.this.mo23408d0().mo27689g0(4096);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            "unbindRemote, onFailed ret = " + str + ", i = " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.i.g$c */
    public class C6036c {

        /* renamed from: a */
        private int f12827a;

        /* renamed from: b */
        private int f12828b;

        /* renamed from: c */
        private int f12829c;

        /* renamed from: d */
        private int f12830d;

        /* renamed from: e */
        private boolean f12831e;

        public C6036c(int i, int i2, @StringRes int i3) {
            this.f12827a = i;
            this.f12828b = i2;
            this.f12829c = i3;
        }

        public C6036c(int i, int i2, int i3, int i4) {
            this.f12827a = i;
            this.f12828b = i2;
            this.f12829c = i3;
            this.f12830d = i4;
        }

        public C6036c(int i, int i2, int i3, boolean z) {
            this.f12827a = i;
            this.f12828b = i2;
            this.f12829c = i3;
            this.f12831e = z;
        }

        /* renamed from: a */
        public int mo27762a() {
            return this.f12827a;
        }

        /* renamed from: b */
        public int mo27763b() {
            return this.f12830d;
        }

        /* renamed from: c */
        public int mo27764c() {
            return this.f12829c;
        }

        /* renamed from: d */
        public int mo27765d() {
            return this.f12828b;
        }

        /* renamed from: e */
        public boolean mo27766e() {
            return this.f12831e;
        }

        /* renamed from: f */
        public void mo27767f(int i) {
            if (this.f12830d != i) {
                this.f12830d = i;
                C6033g.this.mo27756v2().mo27689g0(4096);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.c.i.g$d */
    public static class C6037d extends C6024e {

        /* renamed from: K */
        private int f12833K;

        public C6037d(String str) {
            super(str);
        }

        /* renamed from: X0 */
        public int mo27768X0() {
            return this.f12833K;
        }

        /* renamed from: Y0 */
        public void mo27769Y0(int i) {
        }

        /* renamed from: Z0 */
        public void mo27770Z0(int i) {
            if (this.f12833K != i) {
                mo27689g0(4096);
                this.f12833K = i;
            }
        }
    }

    public C6033g(String str, String str2, String str3, int i, String str4) {
        super(str, str2, str3, i, str4);
        this.f12820G = new C6037d(str3);
    }

    /* renamed from: w2 */
    private void m17912w2() {
        List<C6038h> list = this.f12822I;
        if (list != null) {
            for (C6038h W0 : list) {
                mo23400W0(W0);
            }
        }
        this.f12822I = C6126d0.m18457i0(this.f7238a, this);
    }

    /* renamed from: A2 */
    public void mo27742A2(int i) {
        this.f12821H = i;
    }

    /* renamed from: B0 */
    public void mo23365B0(C9770e eVar) {
        super.mo23365B0(eVar);
        mo27756v2().mo27691h0(eVar, true);
    }

    /* renamed from: B2 */
    public abstract void mo27743B2(int i);

    /* renamed from: C */
    public C7554e mo23366C() {
        return (C7554e) (this.f12821H == 0 ? mo23408d0() : mo27756v2()).mo27710r(2);
    }

    /* renamed from: C2 */
    public void mo27744C2(Map<Integer, C6036c> map) {
        this.f12823J = map;
    }

    /* renamed from: D2 */
    public abstract void mo27745D2(C6036c cVar, int i);

    /* renamed from: E2 */
    public abstract void mo27746E2(int i);

    /* renamed from: W0 */
    public void mo23400W0(C9770e eVar) {
        super.mo23400W0(eVar);
        mo27756v2().mo27666T0(eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i2 */
    public ArrayList<C5999e> mo27747i2(String str) {
        C5999e eVar;
        "parseRemoteDevicelist result:" + str;
        ArrayList<C5999e> arrayList = new ArrayList<>();
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = new JSONObject(jSONArray.getString(i));
                String string = jSONObject.getString("mac");
                String string2 = jSONObject.getString("beaconkey");
                int i2 = jSONObject.getInt(ScanBarcodeActivity.PID);
                int i3 = jSONObject.getInt("evtid");
                String m2 = mo27854m2(string);
                if (i2 == 339 || i2 == 950 || i2 == 959 || i2 == 1678) {
                    "parseRemoteDevicelist mac :" + m2;
                    eVar = new C5999e(string, m2, string2, i2, i3);
                } else if (i3 == 8193) {
                    "parseMiBandDevicelist mac :" + m2;
                    C6046l lVar = new C6046l(m2);
                    lVar.mo27800d(i2);
                    mo23408d0().mo27628A0(lVar);
                } else {
                    "parseRemoteDevicelist mac :" + m2;
                    eVar = new C5999e(string, m2, string2, i2, i3);
                }
                arrayList.add(eVar);
            }
            mo27852j2(arrayList);
            return arrayList;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: j0 */
    public void mo23414j0() {
        super.mo23414j0();
        m17912w2();
    }

    /* renamed from: k2 */
    public boolean mo27748k2() {
        String str = "/device/rpc/" + mo27788M1();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("did", mo27788M1());
            jSONObject.put("id", 1);
            jSONObject.put("method", "ble_dbg_tbl_dump");
            jSONObject2.put("table", "evtRuleTbl");
            jSONObject.put("params", jSONObject2);
            "queryBoundRemoteList cmd :" + jSONObject2.toString() + ", path = " + str + " , jAction = " + jSONObject.toString();
            try {
                MiotManager.getDeviceManager().callSmarthomeApi(str, jSONObject, new C6034a());
                return true;
            } catch (MiotException e) {
                e.printStackTrace();
                return false;
            }
        } catch (JSONException e2) {
            "queryBoundRemoteList params exception:" + e2.toString();
            return false;
        }
    }

    /* renamed from: o2 */
    public boolean mo27749o2(String str, int i, int i2) {
        String str2 = "/device/rpc/" + mo27788M1();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("did", mo27788M1());
            jSONObject.put("id", 1);
            jSONObject.put("method", "miIO.bleEvtRuleDel");
            jSONObject2.put("mac", str);
            jSONObject2.put(ScanBarcodeActivity.PID, i);
            jSONObject2.put("eid", i2);
            jSONObject.put("params", jSONObject2);
            "unbindRemote cmd :" + jSONObject2.toString();
            try {
                MiotManager.getDeviceManager().callSmarthomeApi(str2, jSONObject, new C6035b(i));
                return true;
            } catch (MiotException e) {
                e.printStackTrace();
                return false;
            }
        } catch (JSONException e2) {
            "unbindRemote params exception:" + e2.toString();
            return false;
        }
    }

    /* renamed from: p2 */
    public abstract void mo27750p2();

    /* renamed from: q2 */
    public abstract void mo27751q2(boolean z);

    /* renamed from: r2 */
    public int mo27752r2() {
        return this.f12821H;
    }

    /* renamed from: s2 */
    public abstract C6036c mo27753s2();

    /* renamed from: t2 */
    public List<C6038h> mo27754t2() {
        return this.f12822I;
    }

    /* renamed from: u0 */
    public void mo23347u0(View view) {
        if (!C9784e.m23711b().mo31628d()) {
            Toast.makeText(view.getContext(), view.getContext().getResources().getString(R$string.common_text_please_check_network), 0).show();
        } else if (mo23331k0()) {
            Class<?> cls = null;
            try {
                cls = Class.forName("com.yeelight.cherry.ui.activity.FanclControlViewActivity");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            if (cls != null && mo23331k0()) {
                Intent intent = new Intent();
                intent.setClass(view.getContext(), cls);
                intent.putExtra("com.yeelight.cherry.device_id", mo23372G());
                view.getContext().startActivity(intent);
            }
        } else {
            Intent intent2 = new Intent();
            intent2.setClass(view.getContext(), DeviceOfflinePromptActivity.class);
            intent2.putExtra("com.yeelight.cherry.device_id", this.f7255r);
            view.getContext().startActivity(intent2);
        }
    }

    /* renamed from: u2 */
    public Map<Integer, C6036c> mo27755u2() {
        return this.f12823J;
    }

    /* renamed from: v2 */
    public C6037d mo27756v2() {
        return this.f12820G;
    }

    /* renamed from: x2 */
    public boolean mo27757x2() {
        C7554e eVar = (C7554e) mo27756v2().mo27710r(2);
        if (eVar != null) {
            return eVar.mo28882c();
        }
        return false;
    }

    /* renamed from: y2 */
    public boolean mo27758y2() {
        return this.f12820G.mo27681c0();
    }

    /* renamed from: z2 */
    public abstract void mo27759z2();
}

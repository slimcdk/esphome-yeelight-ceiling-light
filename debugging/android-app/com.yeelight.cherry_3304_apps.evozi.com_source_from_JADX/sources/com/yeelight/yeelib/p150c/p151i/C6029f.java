package com.yeelight.yeelib.p150c.p151i;

import com.miot.api.CommonHandler;
import com.miot.api.Constants;
import com.miot.api.MiotManager;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p150c.C5999e;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C4297y;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.c.i.f */
public abstract class C6029f extends C6006h {

    /* renamed from: com.yeelight.yeelib.c.i.f$a */
    class C6030a implements CommonHandler<String> {
        C6030a() {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "queryBoundRemoteList, onSucceed ret = " + str;
            C6029f.this.mo23408d0().mo27709q0(C6029f.this.m17897b2(str));
        }

        public void onFailed(int i, String str) {
            "queryBoundRemoteList, onFailed ret = " + str + ", i = " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.i.f$b */
    class C6031b implements CommonHandler<String> {

        /* renamed from: a */
        final /* synthetic */ int f12816a;

        C6031b(int i) {
            this.f12816a = i;
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "bindRemote, onSucceed ret = " + str;
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getString(Constants.EXTRA_PUSH_MESSAGE).equals("ok") && jSONObject.getString("result").contains("ok") && this.f12816a == 21) {
                    C6029f.this.mo27735d2();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            "bindRemote, onFailed ret = " + str + ", i = " + i;
            C6029f.this.mo23408d0().mo27689g0(131072);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.i.f$c */
    class C6032c implements CommonHandler<String> {

        /* renamed from: a */
        final /* synthetic */ int f12818a;

        C6032c(int i) {
            this.f12818a = i;
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "unbindRemote, onSucceed ret = " + str;
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getString(Constants.EXTRA_PUSH_MESSAGE).equals("ok") && jSONObject.getString("result").contains("ok") && (this.f12818a == 21 || this.f12818a == 296 || this.f12818a == 295 || this.f12818a == 294)) {
                    C6029f.this.mo23408d0().mo27628A0((C6046l) null);
                }
                C6029f.this.mo23408d0().mo27689g0(4096);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            "unbindRemote, onFailed ret = " + str + ", i = " + i;
        }
    }

    public C6029f(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str2, str3, ownership);
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public ArrayList<C5999e> m17897b2(String str) {
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
                String g2 = m17899g2(string);
                if (i2 == 339 || i2 == 950 || i2 == 959 || i2 == 1678) {
                    "parseRemoteDevicelist mac :" + g2;
                    eVar = new C5999e(string, g2, string2, i2, i3);
                } else if (i3 == 8193) {
                    "parseMiBandDevicelist mac :" + g2;
                    C6046l lVar = new C6046l(g2);
                    lVar.mo27800d(i2);
                    mo23408d0().mo27628A0(lVar);
                } else {
                    "parseRemoteDevicelist mac :" + g2;
                    eVar = new C5999e(string, g2, string2, i2, i3);
                }
                arrayList.add(eVar);
            }
            m17898c2(arrayList);
            return arrayList;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: c2 */
    private void m17898c2(ArrayList<C5999e> arrayList) {
        Iterator<C5999e> it = arrayList.iterator();
        C5999e eVar = null;
        C5999e eVar2 = null;
        C5999e eVar3 = null;
        C5999e eVar4 = null;
        C5999e eVar5 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (it.hasNext()) {
            C5999e next = it.next();
            if (next.mo27536e() == 339) {
                i++;
                next.mo27537f(C4297y.f7456e.getResources().getText(R$string.feature_remote_management) + " " + i);
                eVar = next;
            } else if (next.mo27536e() == 950) {
                i2++;
                next.mo27537f(C4297y.f7456e.getResources().getText(R$string.remote_control_seesaw) + " " + i2);
                eVar2 = next;
            } else if (next.mo27536e() == 959) {
                i3++;
                next.mo27537f(C4297y.f7456e.getResources().getText(R$string.remote_control_bhf) + " " + i3);
                eVar3 = next;
            } else if (next.mo27536e() == 1678) {
                i4++;
                next.mo27537f(C4297y.f7456e.getResources().getText(R$string.feature_remote_management) + " " + i4);
                eVar4 = next;
            } else {
                i5++;
                next.mo27537f(C4297y.f7456e.getResources().getText(R$string.remote_control_unknown) + " " + i5);
                eVar5 = next;
            }
        }
        if (i == 1 && eVar != null) {
            eVar.mo27537f(C4297y.f7456e.getResources().getText(R$string.feature_remote_management).toString());
        }
        if (i2 == 1 && eVar2 != null) {
            eVar2.mo27537f(C4297y.f7456e.getResources().getText(R$string.remote_control_seesaw).toString());
        }
        if (i3 == 1 && eVar3 != null) {
            eVar3.mo27537f(C4297y.f7456e.getResources().getText(R$string.remote_control_bhf).toString());
        }
        if (i4 == 1 && eVar4 != null) {
            eVar4.mo27537f(C4297y.f7456e.getResources().getText(R$string.feature_remote_management).toString());
        }
        if (i5 == 1 && eVar5 != null) {
            eVar5.mo27537f(C4297y.f7456e.getResources().getText(R$string.remote_control_unknown).toString());
        }
    }

    /* renamed from: g2 */
    private String m17899g2(String str) {
        String str2 = "";
        for (int i = 0; i < str.length(); i += 2) {
            str2 = str.charAt(i) + (str.charAt(i + 1) + str2);
        }
        StringBuilder sb = new StringBuilder(str2);
        for (int i2 = 10; i2 > 0; i2 -= 2) {
            sb.insert(i2, com.xiaomi.mipush.sdk.Constants.COLON_SEPARATOR);
        }
        return sb.toString();
    }

    /* renamed from: Y1 */
    public void mo27732Y1(String str) {
        "bindDevice mac = " + str;
        for (C6046l next : C4257w.m11947l0().mo23685r0()) {
            "Found connected mac = " + str;
            if (next.mo27797a().equals(str)) {
                mo27733Z1(str, "ffffffffffffffffffffffff", next.mo27799c(), next.mo27798b());
                return;
            }
        }
    }

    /* renamed from: Z1 */
    public boolean mo27733Z1(String str, String str2, int i, int i2) {
        String str3 = "/device/rpc/" + mo23372G();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("did", mo23372G());
            jSONObject.put("id", 1);
            jSONObject.put("method", "miIO.bleEvtRuleAdd");
            jSONObject2.put("mac", str);
            jSONObject2.put(ScanBarcodeActivity.PID, i);
            jSONObject2.put("eid", i2);
            jSONObject2.put("beaconKey", str2);
            jSONObject.put("params", jSONObject2);
            "bindRemote cmd :" + jSONObject2.toString();
            try {
                MiotManager.getDeviceManager().callSmarthomeApi(str3, jSONObject, new C6031b(i));
                return true;
            } catch (MiotException e) {
                e.printStackTrace();
                return false;
            }
        } catch (JSONException e2) {
            "bindRemote params exception:" + e2.toString();
            return false;
        }
    }

    /* renamed from: a2 */
    public abstract boolean mo27734a2(boolean z);

    /* renamed from: d2 */
    public boolean mo27735d2() {
        String str = "/device/rpc/" + mo23372G();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("did", mo23372G());
            jSONObject.put("id", 1);
            jSONObject.put("method", "ble_dbg_tbl_dump");
            jSONObject2.put("table", "evtRuleTbl");
            jSONObject.put("params", jSONObject2);
            "queryBoundRemoteList cmd :" + jSONObject2.toString() + ", path = " + str + " , jAction = " + jSONObject.toString();
            try {
                MiotManager.getDeviceManager().callSmarthomeApi(str, jSONObject, new C6030a());
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

    /* renamed from: e2 */
    public void mo27736e2() {
        mo27735d2();
    }

    /* renamed from: f2 */
    public abstract boolean mo27737f2(int i);

    /* renamed from: h2 */
    public boolean mo27738h2(String str, int i, int i2) {
        String str2 = "/device/rpc/" + mo23372G();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("did", mo23372G());
            jSONObject.put("id", 1);
            jSONObject.put("method", "miIO.bleEvtRuleDel");
            jSONObject2.put("mac", str);
            jSONObject2.put(ScanBarcodeActivity.PID, i);
            jSONObject2.put("eid", i2);
            jSONObject.put("params", jSONObject2);
            "unbindRemote cmd :" + jSONObject2.toString();
            try {
                MiotManager.getDeviceManager().callSmarthomeApi(str2, jSONObject, new C6032c(i));
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

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public void mo23421s0(int i, int i2) {
        super.mo23421s0(i, i2);
        if (i2 == 11) {
            mo27735d2();
        }
    }

    /* renamed from: x */
    public boolean mo23353x(int i, Object obj) {
        super.mo23353x(i, obj);
        if (i != 18) {
            return true;
        }
        mo27735d2();
        return true;
    }
}

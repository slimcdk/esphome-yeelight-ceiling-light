package p207s3;

import com.miot.api.CommonHandler;
import com.miot.api.Constants;
import com.miot.api.MiotManager;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.C6163d;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: s3.b */
public abstract class C10333b extends WifiDeviceBase {

    /* renamed from: s3.b$a */
    class C10334a implements CommonHandler<String> {
        C10334a() {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("queryBoundRemoteList, onSucceed ret = ");
            sb.append(str);
            C10333b.this.mo23221d0().mo31612r0(C10333b.this.m26023b2(str));
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("queryBoundRemoteList, onFailed ret = ");
            sb.append(str);
            sb.append(", i = ");
            sb.append(i);
        }
    }

    /* renamed from: s3.b$b */
    class C10335b implements CommonHandler<String> {

        /* renamed from: a */
        final /* synthetic */ int f19417a;

        C10335b(int i) {
            this.f19417a = i;
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("bindRemote, onSucceed ret = ");
            sb.append(str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getString(Constants.EXTRA_PUSH_MESSAGE).equals("ok") && jSONObject.getString("result").contains("ok") && this.f19417a == 21) {
                    C10333b.this.mo41883d2();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("bindRemote, onFailed ret = ");
            sb.append(str);
            sb.append(", i = ");
            sb.append(i);
            C10333b.this.mo23221d0().mo31592h0(131072);
        }
    }

    /* renamed from: s3.b$c */
    class C10336c implements CommonHandler<String> {

        /* renamed from: a */
        final /* synthetic */ int f19419a;

        C10336c(int i) {
            this.f19419a = i;
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            int i;
            StringBuilder sb = new StringBuilder();
            sb.append("unbindRemote, onSucceed ret = ");
            sb.append(str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getString(Constants.EXTRA_PUSH_MESSAGE).equals("ok") && jSONObject.getString("result").contains("ok") && ((i = this.f19419a) == 21 || i == 296 || i == 295 || i == 294)) {
                    C10333b.this.mo23221d0().mo31529B0((C10343e) null);
                }
                C10333b.this.mo23221d0().mo31592h0(4096);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("unbindRemote, onFailed ret = ");
            sb.append(str);
            sb.append(", i = ");
            sb.append(i);
        }
    }

    public C10333b(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, str2, str3, ownership);
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public ArrayList<C6163d> m26023b2(String str) {
        C6163d dVar;
        StringBuilder sb = new StringBuilder();
        sb.append("parseRemoteDevicelist result:");
        sb.append(str);
        ArrayList<C6163d> arrayList = new ArrayList<>();
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = new JSONObject(jSONArray.getString(i));
                String string = jSONObject.getString("mac");
                String string2 = jSONObject.getString("beaconkey");
                int i2 = jSONObject.getInt(ScanBarcodeActivity.PID);
                int i3 = jSONObject.getInt("evtid");
                String g2 = m26025g2(string);
                if (i2 == 339 || i2 == 950 || i2 == 959 || i2 == 1678) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("parseRemoteDevicelist mac :");
                    sb2.append(g2);
                    dVar = new C6163d(string, g2, string2, i2, i3);
                } else if (i3 == 8193) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("parseMiBandDevicelist mac :");
                    sb3.append(g2);
                    C10343e eVar = new C10343e(g2);
                    eVar.mo41922d(i2);
                    mo23221d0().mo31529B0(eVar);
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("parseRemoteDevicelist mac :");
                    sb4.append(g2);
                    dVar = new C6163d(string, g2, string2, i2, i3);
                }
                arrayList.add(dVar);
            }
            m26024c2(arrayList);
            return arrayList;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: c2 */
    private void m26024c2(ArrayList<C6163d> arrayList) {
        Iterator<C6163d> it = arrayList.iterator();
        C6163d dVar = null;
        C6163d dVar2 = null;
        C6163d dVar3 = null;
        C6163d dVar4 = null;
        C6163d dVar5 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (it.hasNext()) {
            C6163d next = it.next();
            if (next.mo31862e() == 339) {
                i++;
                next.mo31863f(C3108x.f4951e.getResources().getText(R$string.feature_remote_management) + " " + i);
                dVar = next;
            } else if (next.mo31862e() == 950) {
                i2++;
                next.mo31863f(C3108x.f4951e.getResources().getText(R$string.remote_control_seesaw) + " " + i2);
                dVar2 = next;
            } else if (next.mo31862e() == 959) {
                i3++;
                next.mo31863f(C3108x.f4951e.getResources().getText(R$string.remote_control_bhf) + " " + i3);
                dVar3 = next;
            } else if (next.mo31862e() == 1678) {
                i4++;
                next.mo31863f(C3108x.f4951e.getResources().getText(R$string.feature_remote_management) + " " + i4);
                dVar4 = next;
            } else {
                i5++;
                next.mo31863f(C3108x.f4951e.getResources().getText(R$string.remote_control_unknown) + " " + i5);
                dVar5 = next;
            }
        }
        if (i == 1 && dVar != null) {
            dVar.mo31863f(C3108x.f4951e.getResources().getText(R$string.feature_remote_management).toString());
        }
        if (i2 == 1 && dVar2 != null) {
            dVar2.mo31863f(C3108x.f4951e.getResources().getText(R$string.remote_control_seesaw).toString());
        }
        if (i3 == 1 && dVar3 != null) {
            dVar3.mo31863f(C3108x.f4951e.getResources().getText(R$string.remote_control_bhf).toString());
        }
        if (i4 == 1 && dVar4 != null) {
            dVar4.mo31863f(C3108x.f4951e.getResources().getText(R$string.feature_remote_management).toString());
        }
        if (i5 == 1 && dVar5 != null) {
            dVar5.mo31863f(C3108x.f4951e.getResources().getText(R$string.remote_control_unknown).toString());
        }
    }

    /* renamed from: g2 */
    private String m26025g2(String str) {
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
    public void mo41880Y1(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("bindDevice mac = ");
        sb.append(str);
        for (C10343e next : YeelightDeviceManager.m7800o0().mo23316u0()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Found connected mac = ");
            sb2.append(str);
            if (next.mo41919a().equals(str)) {
                mo41881Z1(str, "ffffffffffffffffffffffff", next.mo41921c(), next.mo41920b());
                return;
            }
        }
    }

    /* renamed from: Z1 */
    public boolean mo41881Z1(String str, String str2, int i, int i2) {
        String str3 = "/device/rpc/" + mo23185G();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("did", mo23185G());
            jSONObject.put("id", 1);
            jSONObject.put("method", "miIO.bleEvtRuleAdd");
            jSONObject2.put("mac", str);
            jSONObject2.put(ScanBarcodeActivity.PID, i);
            jSONObject2.put("eid", i2);
            jSONObject2.put("beaconKey", str2);
            jSONObject.put("params", jSONObject2);
            StringBuilder sb = new StringBuilder();
            sb.append("bindRemote cmd :");
            sb.append(jSONObject2.toString());
            try {
                MiotManager.getDeviceManager().callSmarthomeApi(str3, jSONObject, new C10335b(i));
                return true;
            } catch (MiotException e) {
                e.printStackTrace();
                return false;
            }
        } catch (JSONException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bindRemote params exception:");
            sb2.append(e2.toString());
            return false;
        }
    }

    /* renamed from: a2 */
    public abstract boolean mo41882a2(boolean z);

    /* renamed from: d2 */
    public boolean mo41883d2() {
        if (!mo23229n0(25) && !mo23229n0(20)) {
            return false;
        }
        String str = "/device/rpc/" + mo23185G();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("did", mo23185G());
            jSONObject.put("id", 1);
            jSONObject.put("method", "ble_dbg_tbl_dump");
            jSONObject2.put("table", "evtRuleTbl");
            jSONObject.put("params", jSONObject2);
            StringBuilder sb = new StringBuilder();
            sb.append("queryBoundRemoteList cmd :");
            sb.append(jSONObject2.toString());
            sb.append(", path = ");
            sb.append(str);
            sb.append(" , jAction = ");
            sb.append(jSONObject.toString());
            try {
                MiotManager.getDeviceManager().callSmarthomeApi(str, jSONObject, new C10334a());
                return true;
            } catch (MiotException e) {
                e.printStackTrace();
                return false;
            }
        } catch (JSONException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("queryBoundRemoteList params exception:");
            sb2.append(e2.toString());
            return false;
        }
    }

    /* renamed from: e2 */
    public void mo41884e2() {
        mo41883d2();
    }

    /* renamed from: f2 */
    public abstract boolean mo41885f2(int i);

    /* renamed from: h2 */
    public boolean mo41886h2(String str, int i, int i2) {
        String str2 = "/device/rpc/" + mo23185G();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("did", mo23185G());
            jSONObject.put("id", 1);
            jSONObject.put("method", "miIO.bleEvtRuleDel");
            jSONObject2.put("mac", str);
            jSONObject2.put(ScanBarcodeActivity.PID, i);
            jSONObject2.put("eid", i2);
            jSONObject.put("params", jSONObject2);
            StringBuilder sb = new StringBuilder();
            sb.append("unbindRemote cmd :");
            sb.append(jSONObject2.toString());
            try {
                MiotManager.getDeviceManager().callSmarthomeApi(str2, jSONObject, new C10336c(i));
                return true;
            } catch (MiotException e) {
                e.printStackTrace();
                return false;
            }
        } catch (JSONException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("unbindRemote params exception:");
            sb2.append(e2.toString());
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public void mo23235s0(int i, int i2) {
        super.mo23235s0(i, i2);
        if (i2 == 11) {
            mo41883d2();
        }
    }

    /* renamed from: x */
    public boolean mo23166x(int i, Object obj) {
        super.mo23166x(i, obj);
        if (i != 18) {
            return true;
        }
        mo41883d2();
        return true;
    }
}

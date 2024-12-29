package com.yeelight.yeelib.p150c.p151i;

import com.miot.api.CompletionHandler;
import com.miot.api.DeviceManager;
import com.miot.api.MiotManager;
import com.miot.common.device.firmware.MiotFirmware;
import com.miot.common.exception.MiotException;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.p146mi.iot.common.error.IotError;
import com.p146mi.iot.common.handler.CompletedHandler;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.models.C7640n0;
import com.yeelight.yeelib.device.xiaomi.base.C9763a;
import com.yeelight.yeelib.p150c.C5999e;
import com.yeelight.yeelib.p152f.C4297y;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.c.i.o */
public abstract class C6067o extends C6050n {

    /* renamed from: com.yeelight.yeelib.c.i.o$a */
    class C6068a implements DeviceManager.QueryFirmwareHandler {
        C6068a() {
        }

        public void onFailed(int i, String str) {
            String str2 = C6067o.this.f7260v;
            String.format("queryFirmware: Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed(MiotFirmware miotFirmware) {
            String str = C6067o.this.f7260v;
            "queryFirmware:: onSucceed, device: " + C6067o.this.mo23397U() + "   ver: " + miotFirmware.getCurrentVersion();
            C6067o.this.mo23378J0(new C7640n0(miotFirmware));
        }
    }

    /* renamed from: com.yeelight.yeelib.c.i.o$b */
    class C6069b implements CompletionHandler {
        C6069b() {
        }

        public void onFailed(int i, String str) {
            String.format("upgradeFirmware: onFailed,  code: %d %s", new Object[]{Integer.valueOf(i), str});
            if (C6067o.this.mo23384N() != null) {
                C6067o.this.mo23384N().mo29068k(false);
            }
        }

        public void onSucceed() {
            if (C6067o.this.mo23384N() != null) {
                C6067o.this.mo23384N().mo29068k(true);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.c.i.o$c */
    class C6070c implements C9763a<String> {
        C6070c() {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            String str2 = C6067o.this.f7260v;
            "getRclist onSucceed: " + str;
            C6067o.this.mo23408d0().mo27709q0(C6067o.this.mo27747i2(str));
        }

        public void onFailed(IotError iotError) {
            String str = C6067o.this.f7260v;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.i.o$d */
    class C6071d implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ String f12897a;

        C6071d(String str) {
            this.f12897a = str;
        }

        public void onFailed(IotError iotError) {
            String str = C6067o.this.f7260v;
        }

        public void onSucceed() {
            String str = C6067o.this.f7260v;
            "setRclistfordel onSucceed: " + this.f12897a;
            C6067o.this.mo23408d0().mo27689g0(4096);
        }
    }

    public C6067o(String str, String str2, String str3, int i, String str4) {
        super(str, str2, str3, i, str4);
        mo23376I0("spec_wifi");
    }

    /* renamed from: Y0 */
    public boolean mo23323Y0() {
        mo23384N().mo29068k(true);
        try {
            MiotManager.getDeviceManager().startUpgradeFirmware(this.f7251n, new C6069b());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i2 */
    public ArrayList<C5999e> mo27747i2(String str) {
        C5999e eVar;
        "parseRemoteDevicelist result:" + str;
        ArrayList<C5999e> arrayList = new ArrayList<>();
        try {
            JSONArray jSONArray = new JSONArray(str);
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

    /* access modifiers changed from: protected */
    /* renamed from: j2 */
    public void mo27852j2(ArrayList<C5999e> arrayList) {
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

    /* renamed from: k2 */
    public boolean mo27748k2() {
        return false;
    }

    /* renamed from: l2 */
    public boolean mo27853l2(int i, int i2) {
        mo27825H1(i, i2, new C6070c());
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m2 */
    public String mo27854m2(String str) {
        String str2 = "";
        for (int i = 0; i < str.length(); i += 2) {
            str2 = str.charAt(i) + (str.charAt(i + 1) + str2);
        }
        StringBuilder sb = new StringBuilder(str2);
        for (int i2 = 10; i2 > 0; i2 -= 2) {
            sb.insert(i2, Constants.COLON_SEPARATOR);
        }
        return sb.toString();
    }

    /* renamed from: n2 */
    public boolean mo27855n2(int i, int i2, String str) {
        mo27843b2(i, i2, str, new C6071d(str));
        return true;
    }

    /* renamed from: o2 */
    public boolean mo27749o2(String str, int i, int i2) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public void mo23421s0(int i, int i2) {
        super.mo23421s0(i, i2);
        if (i2 == 11) {
            mo27748k2();
        }
    }

    /* renamed from: x */
    public boolean mo23353x(int i, Object obj) {
        super.mo23353x(i, obj);
        if (i != 18) {
            return true;
        }
        mo27748k2();
        return true;
    }

    /* renamed from: y0 */
    public void mo23356y0() {
        super.mo23356y0();
        "queryFirmware: " + mo23408d0().mo27627A();
        MiotFirmware miotFirmware = this.f7251n.getMiotFirmware();
        if (miotFirmware != null) {
            C7640n0 n0Var = new C7640n0(miotFirmware);
            mo23378J0(n0Var);
            n0Var.toString();
            return;
        }
        try {
            MiotManager.getDeviceManager().queryFirmwareInfo(this.f7251n, new C6068a());
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }
}

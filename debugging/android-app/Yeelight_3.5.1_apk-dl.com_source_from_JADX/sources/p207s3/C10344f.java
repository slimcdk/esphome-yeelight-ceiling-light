package p207s3;

import com.miot.api.CompletionHandler;
import com.miot.api.DeviceManager;
import com.miot.api.MiotManager;
import com.miot.common.device.firmware.MiotFirmware;
import com.miot.common.exception.MiotException;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.p022mi.iot.common.error.IotError;
import com.p022mi.iot.common.handler.CompletedHandler;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.C6163d;
import com.yeelight.yeelib.device.base.C6100g;
import com.yeelight.yeelib.device.xiaomi.base.C8251a;
import com.yeelight.yeelib.managers.C3108x;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p227x3.C11981q;

/* renamed from: s3.f */
public abstract class C10344f extends C6100g {

    /* renamed from: s3.f$a */
    class C10345a implements DeviceManager.QueryFirmwareHandler {
        C10345a() {
        }

        public void onFailed(int i, String str) {
            String str2 = C10344f.this.f4758v;
            String.format("queryFirmware: Failed, code: %d %s", new Object[]{Integer.valueOf(i), str});
        }

        public void onSucceed(MiotFirmware miotFirmware) {
            String str = C10344f.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("queryFirmware:: onSucceed, device: ");
            sb.append(C10344f.this.mo23210U());
            sb.append("   ver: ");
            sb.append(miotFirmware.getCurrentVersion());
            C10344f.this.mo23191J0(new C11981q(miotFirmware));
        }
    }

    /* renamed from: s3.f$b */
    class C10346b implements CompletionHandler {
        C10346b() {
        }

        public void onFailed(int i, String str) {
            String.format("upgradeFirmware: onFailed,  code: %d %s", new Object[]{Integer.valueOf(i), str});
            if (C10344f.this.mo23197N() != null) {
                C10344f.this.mo23197N().mo42539k(false);
            }
        }

        public void onSucceed() {
            if (C10344f.this.mo23197N() != null) {
                C10344f.this.mo23197N().mo42539k(true);
            }
        }
    }

    /* renamed from: s3.f$c */
    class C10347c implements C8251a<String> {
        C10347c() {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            String str2 = C10344f.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("getRclist onSucceed: ");
            sb.append(str);
            C10344f.this.mo23221d0().mo31612r0(C10344f.this.mo41895i2(str));
        }

        public void onFailed(IotError iotError) {
            String str = C10344f.this.f4758v;
        }
    }

    /* renamed from: s3.f$d */
    class C10348d implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ String f19441a;

        C10348d(String str) {
            this.f19441a = str;
        }

        public void onFailed(IotError iotError) {
            String str = C10344f.this.f4758v;
        }

        public void onSucceed() {
            String str = C10344f.this.f4758v;
            StringBuilder sb = new StringBuilder();
            sb.append("setRclistfordel onSucceed: ");
            sb.append(this.f19441a);
            C10344f.this.mo23221d0().mo31592h0(4096);
        }
    }

    public C10344f(String str, String str2, String str3, int i, String str4) {
        super(str, str2, str3, i, str4);
        mo23189I0("spec_wifi");
    }

    /* renamed from: Y0 */
    public boolean mo23137Y0() {
        mo23197N().mo42539k(true);
        try {
            MiotManager.getDeviceManager().startUpgradeFirmware(this.f4749n, new C10346b());
            return true;
        } catch (MiotException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i2 */
    public ArrayList<C6163d> mo41895i2(String str) {
        C6163d dVar;
        StringBuilder sb = new StringBuilder();
        sb.append("parseRemoteDevicelist result:");
        sb.append(str);
        ArrayList<C6163d> arrayList = new ArrayList<>();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = new JSONObject(jSONArray.getString(i));
                String string = jSONObject.getString("mac");
                String string2 = jSONObject.getString("beaconkey");
                int i2 = jSONObject.getInt(ScanBarcodeActivity.PID);
                int i3 = jSONObject.getInt("evtid");
                String m2 = mo41927m2(string);
                if (i2 == 339 || i2 == 950 || i2 == 959 || i2 == 1678) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("parseRemoteDevicelist mac :");
                    sb2.append(m2);
                    dVar = new C6163d(string, m2, string2, i2, i3);
                } else if (i3 == 8193) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("parseMiBandDevicelist mac :");
                    sb3.append(m2);
                    C10343e eVar = new C10343e(m2);
                    eVar.mo41922d(i2);
                    mo23221d0().mo31529B0(eVar);
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("parseRemoteDevicelist mac :");
                    sb4.append(m2);
                    dVar = new C6163d(string, m2, string2, i2, i3);
                }
                arrayList.add(dVar);
            }
            mo41925j2(arrayList);
            return arrayList;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j2 */
    public void mo41925j2(ArrayList<C6163d> arrayList) {
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

    /* renamed from: k2 */
    public boolean mo41896k2() {
        return false;
    }

    /* renamed from: l2 */
    public boolean mo41926l2(int i, int i2) {
        mo31711H1(i, i2, new C10347c());
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m2 */
    public String mo41927m2(String str) {
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
    public boolean mo41928n2(int i, int i2, String str) {
        mo31729b2(i, i2, str, new C10348d(str));
        return true;
    }

    /* renamed from: o2 */
    public boolean mo41897o2(String str, int i, int i2) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public void mo23235s0(int i, int i2) {
        super.mo23235s0(i, i2);
        if (i2 == 11) {
            mo41896k2();
        }
    }

    /* renamed from: x */
    public boolean mo23166x(int i, Object obj) {
        super.mo23166x(i, obj);
        if (i != 18) {
            return true;
        }
        mo41896k2();
        return true;
    }

    /* renamed from: y0 */
    public void mo23169y0() {
        super.mo23169y0();
        StringBuilder sb = new StringBuilder();
        sb.append("queryFirmware: ");
        sb.append(mo23221d0().mo31526A());
        MiotFirmware miotFirmware = this.f4749n.getMiotFirmware();
        if (miotFirmware != null) {
            mo23191J0(new C11981q(miotFirmware));
            return;
        }
        try {
            MiotManager.getDeviceManager().queryFirmwareInfo(this.f4749n, new C10345a());
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }
}

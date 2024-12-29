package com.yeelight.yeelib.p150c.p183m;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.inuker.bluetooth.library.connect.response.BluetoothConnectStatusResponse;
import com.miot.api.CompletionHandler;
import com.miot.api.MiotManager;
import com.miot.api.bluetooth.BindStyle;
import com.miot.api.bluetooth.BluetoothDeviceConfig;
import com.miot.api.bluetooth.XmBluetoothManager;
import com.miot.bluetooth.BluetoothConstants;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.exception.MiotException;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p178b.C5971c;
import com.yeelight.yeelib.p185d.C7563a;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.utils.C10539d;

/* renamed from: com.yeelight.yeelib.c.m.b */
public class C6295b extends C4198d {
    /* access modifiers changed from: private */

    /* renamed from: v */
    public String f13308v;

    /* renamed from: w */
    protected AbstractDevice f13309w;

    /* renamed from: x */
    private final BluetoothConnectStatusResponse f13310x = new C6297b();

    /* renamed from: com.yeelight.yeelib.c.m.b$a */
    class C6296a implements CompletionHandler {
        C6296a(C6295b bVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: com.yeelight.yeelib.c.m.b$b */
    class C6297b extends BluetoothConnectStatusResponse {
        C6297b() {
        }

        public void onAuthResponse(int i, Bundle bundle) {
        }

        public void onBindResponse(int i, Bundle bundle) {
        }

        public void onCallback(int i, Bundle bundle) {
            if (i == 0) {
                "ble rc, connect succeed! data : " + bundle.toString();
                byte[] byteArray = bundle.getByteArray(BluetoothConstants.KEY_TOKEN);
                byte[] byteArray2 = bundle.getByteArray(BluetoothConstants.KEY_DID);
                String string = bundle.getString(BluetoothConstants.KEY_BEACONKEY);
                String str = new String(byteArray2);
                "token: " + C10539d.m25672c(byteArray);
                "device id: " + str + " , beacon key = " + string;
                String unused = C6295b.this.f13308v = C10539d.m25672c(byteArray);
                C6295b.this.mo23374H0(str);
                C6295b.this.mo28118d1(string);
                C6295b.this.mo23371F0(11);
                C4257w.m11947l0().mo23686r1(C6295b.this.mo23391R());
                C4257w.m11947l0().mo23652P(C6295b.this);
                return;
            }
            "ble rc, connect failed, error code: " + i;
            C6295b.this.mo23371F0(0);
        }

        public void onConnectResponse(int i, Bundle bundle) {
        }
    }

    public C6295b(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, "yeelink.bleremote.v1", new C6024e(str3));
        mo23381L0(str2);
        mo23386O0(ownership);
        mo23376I0("bluetooth");
    }

    /* renamed from: A */
    public int mo23299A() {
        return this.f7253p;
    }

    /* renamed from: F */
    public int mo23303F() {
        return 0;
    }

    /* renamed from: H */
    public int mo23306H() {
        return 0;
    }

    /* renamed from: M0 */
    public void mo23383M0(AbstractDevice abstractDevice) {
        this.f13309w = abstractDevice;
        new C5971c();
        mo23408d0().mo27646J0(this.f13309w.isOnline());
    }

    /* renamed from: S */
    public AbstractDevice mo23393S() {
        return this.f13309w;
    }

    /* renamed from: S0 */
    public void mo23394S0(String str) {
    }

    /* renamed from: U0 */
    public boolean mo23317U0() {
        if (mo23393S() != null) {
            mo28117c1();
        }
        DeviceDataProvider.m22405i(this);
        return true;
    }

    /* renamed from: Y0 */
    public boolean mo23323Y0() {
        return false;
    }

    /* renamed from: c1 */
    public void mo28117c1() {
        mo23319V0((C9768c) null);
        mo23400W0((C9770e) null);
        try {
            MiotManager.getDeviceManager().disclaimOwnership(this.f13309w, new C6296a(this));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d1 */
    public void mo28118d1(String str) {
    }

    /* renamed from: g0 */
    public int mo23329g0() {
        return 0;
    }

    /* renamed from: k0 */
    public boolean mo23331k0() {
        return this.f7253p == 11;
    }

    /* renamed from: l0 */
    public boolean mo23333l0() {
        return this.f7253p == 2;
    }

    /* renamed from: m0 */
    public boolean mo23335m0() {
        return this.f7253p == 0;
    }

    /* renamed from: n */
    public void mo23337n() {
        BluetoothDeviceConfig bluetoothDeviceConfig = new BluetoothDeviceConfig();
        bluetoothDeviceConfig.bindStyle = BindStyle.WEAK;
        bluetoothDeviceConfig.model = "yeelink.bleremote.v1";
        bluetoothDeviceConfig.productId = 339;
        XmBluetoothManager.getInstance().setDeviceConfig(bluetoothDeviceConfig);
        "trying to connect device: " + this.f7256s;
        XmBluetoothManager.getInstance().secureConnect(this.f7256s, this.f13310x);
        mo23371F0(2);
    }

    /* renamed from: p0 */
    public boolean mo23339p0() {
        return false;
    }

    /* renamed from: r */
    public void mo23342r() {
        XmBluetoothManager.getInstance().disconnect(mo23391R());
        mo23371F0(0);
    }

    /* renamed from: s */
    public boolean mo23344s(C7563a aVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public void mo23421s0(int i, int i2) {
        "notifyConnStateChanged, device: " + mo23372G() + ", state: " + i + " -> " + i2;
        super.mo23421s0(i, i2);
    }

    /* renamed from: u */
    public void mo23423u(boolean z) {
    }

    /* renamed from: u0 */
    public void mo23347u0(View view) {
        if (mo23419q0() || mo23420r0() || C4297y.m12064f().mo23736j()) {
            Class<?> cls = null;
            if (!mo23331k0() && mo23416o0()) {
                try {
                    cls = Class.forName("com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                Intent intent = new Intent();
                intent.setClass(view.getContext(), cls);
                intent.putExtra("com.yeelight.cherry.device_id", mo23372G());
                view.getContext().startActivity(intent);
                return;
            }
            return;
        }
        Toast.makeText(view.getContext(), view.getContext().getResources().getString(R$string.common_text_please_check_bluetooth), 0).show();
    }

    /* renamed from: v */
    public void mo23424v(boolean z) {
    }

    /* renamed from: w0 */
    public boolean mo23351w0(String str) {
        return false;
    }

    /* renamed from: x */
    public boolean mo23353x(int i, Object obj) {
        return false;
    }

    /* renamed from: x0 */
    public boolean mo23354x0() {
        return false;
    }

    /* renamed from: y0 */
    public void mo23356y0() {
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[0];
    }
}

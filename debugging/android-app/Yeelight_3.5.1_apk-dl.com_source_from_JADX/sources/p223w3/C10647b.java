package p223w3;

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
import com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.authority.C6031b;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.utils.C8896a;
import p237z3.C12143c;
import p237z3.C12145e;

/* renamed from: w3.b */
public class C10647b extends C3010c {
    /* access modifiers changed from: private */

    /* renamed from: v */
    public String f19848v;

    /* renamed from: w */
    protected AbstractDevice f19849w;

    /* renamed from: x */
    private final BluetoothConnectStatusResponse f19850x = new C10649b();

    /* renamed from: w3.b$a */
    class C10648a implements CompletionHandler {
        C10648a(C10647b bVar) {
        }

        public void onFailed(int i, String str) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: w3.b$b */
    class C10649b extends BluetoothConnectStatusResponse {
        C10649b() {
        }

        public void onAuthResponse(int i, Bundle bundle) {
        }

        public void onBindResponse(int i, Bundle bundle) {
        }

        public void onCallback(int i, Bundle bundle) {
            if (i == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("ble rc, connect succeed! data : ");
                sb.append(bundle.toString());
                byte[] byteArray = bundle.getByteArray(BluetoothConstants.KEY_TOKEN);
                byte[] byteArray2 = bundle.getByteArray(BluetoothConstants.KEY_DID);
                String string = bundle.getString(BluetoothConstants.KEY_BEACONKEY);
                String str = new String(byteArray2);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("token: ");
                sb2.append(C8896a.m21226c(byteArray));
                StringBuilder sb3 = new StringBuilder();
                sb3.append("device id: ");
                sb3.append(str);
                sb3.append(" , beacon key = ");
                sb3.append(string);
                String unused = C10647b.this.f19848v = C8896a.m21226c(byteArray);
                C10647b.this.mo23187H0(str);
                C10647b.this.mo42231d1(string);
                C10647b.this.mo23184F0(11);
                YeelightDeviceManager.m7800o0().mo23320v1(C10647b.this.mo23204R());
                YeelightDeviceManager.m7800o0().mo23275Q(C10647b.this);
                return;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("ble rc, connect failed, error code: ");
            sb4.append(i);
            C10647b.this.mo23184F0(0);
        }

        public void onConnectResponse(int i, Bundle bundle) {
        }
    }

    public C10647b(String str, String str2, String str3, Device.Ownership ownership) {
        super(str, "yeelink.bleremote.v1", new DeviceStatusBase(str3));
        mo23194L0(str2);
        mo23199O0(ownership);
        mo23189I0("bluetooth");
    }

    /* renamed from: A */
    public int mo23113A() {
        return this.f4751p;
    }

    /* renamed from: F */
    public int mo23116F() {
        return 0;
    }

    /* renamed from: H */
    public int mo23119H() {
        return 0;
    }

    /* renamed from: M0 */
    public void mo23196M0(AbstractDevice abstractDevice) {
        this.f19849w = abstractDevice;
        new C6031b();
        mo23221d0().mo31549L0(this.f19849w.isOnline());
    }

    /* renamed from: S */
    public AbstractDevice mo23206S() {
        return this.f19849w;
    }

    /* renamed from: S0 */
    public void mo23207S0(String str) {
    }

    /* renamed from: U0 */
    public boolean mo23131U0() {
        if (mo23206S() != null) {
            mo42230c1();
        }
        DeviceDataProvider.m17627i(this);
        return true;
    }

    /* renamed from: Y0 */
    public boolean mo23137Y0() {
        return false;
    }

    /* renamed from: c1 */
    public void mo42230c1() {
        mo23133V0((C12143c) null);
        mo23213W0((C12145e) null);
        try {
            MiotManager.getDeviceManager().disclaimOwnership(this.f19849w, new C10648a(this));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d1 */
    public void mo42231d1(String str) {
    }

    /* renamed from: g0 */
    public int mo23143g0() {
        return 0;
    }

    /* renamed from: k0 */
    public boolean mo23145k0() {
        return this.f4751p == 11;
    }

    /* renamed from: l0 */
    public boolean mo23147l0() {
        return this.f4751p == 2;
    }

    /* renamed from: m0 */
    public boolean mo23149m0() {
        return this.f4751p == 0;
    }

    /* renamed from: n */
    public void mo23151n() {
        BluetoothDeviceConfig bluetoothDeviceConfig = new BluetoothDeviceConfig();
        bluetoothDeviceConfig.bindStyle = BindStyle.WEAK;
        bluetoothDeviceConfig.model = "yeelink.bleremote.v1";
        bluetoothDeviceConfig.productId = 339;
        XmBluetoothManager.getInstance().setDeviceConfig(bluetoothDeviceConfig);
        StringBuilder sb = new StringBuilder();
        sb.append("trying to connect device: ");
        sb.append(this.f4754s);
        XmBluetoothManager.getInstance().secureConnect(this.f4754s, this.f19850x);
        mo23184F0(2);
    }

    /* renamed from: p0 */
    public boolean mo23153p0() {
        return false;
    }

    /* renamed from: r */
    public void mo23156r() {
        XmBluetoothManager.getInstance().disconnect(mo23204R());
        mo23184F0(0);
    }

    /* renamed from: s */
    public boolean mo23158s(ActionType actionType) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public void mo23235s0(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("notifyConnStateChanged, device: ");
        sb.append(mo23185G());
        sb.append(", state: ");
        sb.append(i);
        sb.append(" -> ");
        sb.append(i2);
        super.mo23235s0(i, i2);
    }

    /* renamed from: u */
    public void mo23237u(boolean z) {
    }

    /* renamed from: u0 */
    public void mo23161u0(View view) {
        if (mo23233q0() || mo23234r0() || C3108x.m8223f().mo23546j()) {
            Class<BluetoothConnectNewActivity> cls = null;
            if (!mo23145k0() && mo23230o0()) {
                Class<BluetoothConnectNewActivity> cls2 = BluetoothConnectNewActivity.class;
                try {
                    int i = BluetoothConnectNewActivity.f9951e;
                    cls = cls2;
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                Intent intent = new Intent();
                intent.setClass(view.getContext(), cls);
                intent.putExtra("com.yeelight.cherry.device_id", mo23185G());
                view.getContext().startActivity(intent);
                return;
            }
            return;
        }
        Toast.makeText(view.getContext(), view.getContext().getResources().getString(R$string.common_text_please_check_bluetooth), 0).show();
    }

    /* renamed from: v */
    public void mo23238v(boolean z) {
    }

    /* renamed from: w0 */
    public boolean mo23164w0(String str) {
        return false;
    }

    /* renamed from: x */
    public boolean mo23166x(int i, Object obj) {
        return false;
    }

    /* renamed from: y0 */
    public void mo23169y0() {
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[0];
    }
}

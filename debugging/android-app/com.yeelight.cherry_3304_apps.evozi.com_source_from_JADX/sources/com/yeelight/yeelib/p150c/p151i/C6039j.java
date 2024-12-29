package com.yeelight.yeelib.p150c.p151i;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.inuker.bluetooth.library.Constants;
import com.inuker.bluetooth.library.connect.response.BluetoothConnectStatusResponse;
import com.miot.api.MiotManager;
import com.miot.api.bluetooth.BindStyle;
import com.miot.api.bluetooth.BluetoothDeviceConfig;
import com.miot.api.bluetooth.XmBluetoothManager;
import com.miot.api.bluetooth.response.BleResponse;
import com.miot.api.bluetooth.response.MiotBleResponse;
import com.miot.common.device.Device;
import com.p146mi.iot.common.abstractdevice.AbstractDevice;
import com.p146mi.iot.common.error.IotError;
import com.p146mi.iot.common.handler.CompletedHandler;
import com.p146mi.iot.manager.ControllerManager;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.models.C7626i;
import com.yeelight.yeelib.p152f.C4214g;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C9784e;
import com.yeelight.yeelib.p152f.C9820v;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.activity.DeviceOfflinePromptActivity;
import miot.bluetooth.security.mesh.IBleMeshUpgradeResponse;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.c.i.j */
public abstract class C6039j extends C6050n implements C9770e {

    /* renamed from: G */
    private int f12841G;

    /* renamed from: H */
    private String f12842H;

    /* renamed from: I */
    private String f12843I;

    /* renamed from: J */
    private final BluetoothConnectStatusResponse f12844J = new C6040a();

    /* renamed from: com.yeelight.yeelib.c.i.j$a */
    class C6040a extends BluetoothConnectStatusResponse {
        C6040a() {
        }

        public void onAuthResponse(int i, Bundle bundle) {
            String str = C6039j.this.f7260v;
        }

        public void onBindResponse(int i, Bundle bundle) {
            String str = C6039j.this.f7260v;
        }

        public void onCallback(int i, Bundle bundle) {
            if (i == 0) {
                "mesh device, data.get(\"did\"); = " + bundle.toString();
                C6039j.this.mo23371F0(11);
                C4257w.m11947l0().mo23686r1(C6039j.this.mo23391R());
                return;
            }
            "mesh device, connect failed, error code: " + i;
            C6039j.this.mo23371F0(0);
        }

        public void onConnectResponse(int i, Bundle bundle) {
            String str = C6039j.this.f7260v;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.i.j$b */
    class C6041b extends MiotBleResponse {
        C6041b() {
        }

        public void onResponse(int i, Bundle bundle) {
            if (bundle != null) {
                try {
                    JSONObject jSONObject = new JSONObject(bundle.getString(Constants.EXTRA_DATA_JSON));
                    "queryBleMeshFirmwareUpdateInfo data: " + jSONObject;
                    C4214g.m11665j().mo23498u(jSONObject, C6039j.this.mo23395T());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.c.i.j$c */
    class C6042c implements IBleMeshUpgradeResponse {
        C6042c() {
        }

        public void onProgress(int i) {
            "upgradeFirmware, progress = " + i;
            if (C6039j.this.mo23384N() != null) {
                ((C7626i) C6039j.this.mo23384N()).mo29073n(i);
            }
        }

        public void onResponse(int i, String str) {
            "upgradeFirmware, onResponse code = " + i + ", message = " + str;
            if (C6039j.this.mo23384N() != null) {
                ((C7626i) C6039j.this.mo23384N()).mo29072m(i);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.c.i.j$d */
    class C6043d implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ String f12848a;

        C6043d(String str) {
            this.f12848a = str;
        }

        public void onFailed(IotError iotError) {
            "rename onFailed, error = " + iotError.toString();
        }

        public void onSucceed() {
            C6039j.this.mo23408d0().mo27632C0(this.f12848a);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.i.j$e */
    class C6044e implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ String f12850a;

        C6044e(String str) {
            this.f12850a = str;
        }

        public void onFailed(IotError iotError) {
            "rename onFailed, error = " + iotError.toString();
        }

        public void onSucceed() {
            C6039j.this.mo23408d0().mo27632C0(this.f12850a);
        }
    }

    public C6039j(String str, String str2, String str3, int i, String str4) {
        super(str, str2, str3, i, str4);
        mo23376I0("bluetooth_mesh");
        this.f12841G = i;
        this.f12842H = str4;
        mo23365B0(this);
        "mesh device create: " + str3;
    }

    /* renamed from: E1 */
    public AbstractDevice mo27787E1() {
        return this.f12868z;
    }

    /* renamed from: M1 */
    public String mo27788M1() {
        return this.f12842H;
    }

    /* renamed from: X1 */
    public void mo27789X1(AbstractDevice abstractDevice) {
        this.f12868z = abstractDevice;
        this.f7255r = abstractDevice.getDeviceId();
        mo23408d0().mo27646J0(this.f12868z.isOnline());
        mo23371F0(mo23331k0() ? 11 : 0);
    }

    /* renamed from: Y0 */
    public boolean mo23323Y0() {
        C4214g.C4221f fVar = (C4214g.C4221f) C4214g.m11665j().mo23494m(mo23395T());
        if (fVar == null) {
            return true;
        }
        XmBluetoothManager.getInstance().startBleMeshUpgrade(mo23391R(), mo27788M1(), fVar.mo23530f(), fVar.mo23528d().getAbsolutePath(), new C6042c());
        return true;
    }

    /* renamed from: d2 */
    public void mo27790d2(String str) {
        this.f12843I = str;
    }

    /* renamed from: e2 */
    public void mo27791e2(String str) {
        this.f12842H = str;
    }

    /* renamed from: i2 */
    public void mo27792i2(BluetoothConnectStatusResponse bluetoothConnectStatusResponse) {
        "bleMeshConnect --> invoke !, device token = " + mo27795l2() + ", mac = " + mo23391R() + "， deviceId = " + mo23372G();
        XmBluetoothManager.getInstance().bleMeshConnect(mo23391R(), mo27788M1(), mo27795l2(), bluetoothConnectStatusResponse);
    }

    /* renamed from: j2 */
    public void mo27793j2(BleResponse<String> bleResponse) {
        XmBluetoothManager.getInstance().getBleMeshFirmwareVersion(mo23391R(), bleResponse);
    }

    /* renamed from: k0 */
    public boolean mo23331k0() {
        AbstractDevice abstractDevice = this.f12868z;
        return abstractDevice != null && abstractDevice.isOnline();
    }

    /* renamed from: k2 */
    public int mo27794k2() {
        return this.f12841G;
    }

    /* renamed from: l2 */
    public String mo27795l2() {
        return this.f12843I;
    }

    /* renamed from: m0 */
    public boolean mo23335m0() {
        return !mo23331k0();
    }

    /* renamed from: m2 */
    public void mo27796m2() {
        XmBluetoothManager.getInstance().getBleMeshFirmwareUpdateInfo(mo27788M1(), new C6041b());
    }

    /* renamed from: n */
    public void mo23337n() {
        String R = mo23391R();
        BluetoothDeviceConfig bluetoothDeviceConfig = new BluetoothDeviceConfig();
        bluetoothDeviceConfig.bindStyle = BindStyle.STRONG;
        bluetoothDeviceConfig.model = mo23395T();
        bluetoothDeviceConfig.productId = mo27794k2();
        XmBluetoothManager.getInstance().setDeviceConfig(bluetoothDeviceConfig);
        mo23371F0(2);
        "trying to connect device: " + this.f7256s + ", model = " + mo23395T();
        XmBluetoothManager.getInstance().bleMeshBind(R, this.f12844J);
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == 1024 && (mo23399W() == Device.Ownership.MINE || mo23399W() == Device.Ownership.OTHERS)) {
            DeviceDataProvider.m22393a0(this);
        }
        if ((this.f7244g & i) != 0) {
            C9820v.m23869b(mo23372G(), i & this.f7244g);
        }
    }

    /* renamed from: r */
    public void mo23342r() {
        mo23371F0(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public void mo23421s0(int i, int i2) {
        "MeshDeviceBase, notifyConnStateChanged, " + i + " -> " + i2;
        for (C9768c onConnectionStateChanged : this.f7242e) {
            onConnectionStateChanged.onConnectionStateChanged(i, i2);
        }
        if (i2 == 11) {
            mo23354x0();
            mo23356y0();
        }
    }

    /* renamed from: u0 */
    public void mo23347u0(View view) {
        if (!C9784e.m23711b().mo31628d()) {
            Toast.makeText(view.getContext(), view.getContext().getResources().getString(R$string.common_text_please_check_network), 0).show();
        } else if (mo23331k0()) {
            Class<?> cls = null;
            try {
                cls = Class.forName("com.yeelight.cherry.ui.activity.DemoControlViewActivity");
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

    /* renamed from: x */
    public boolean mo23353x(int i, Object obj) {
        String str;
        ControllerManager controllerManager;
        CompletedHandler completedHandler;
        com.p146mi.iot.common.instance.Device device;
        if (i == 0) {
            str = (String) obj;
            "rename --> invoke, name = " + str;
            controllerManager = MiotManager.getControllerManager();
            device = this.f12868z.getDevice();
            completedHandler = new C6044e(str);
        } else if (i == 1) {
            str = (String) obj;
            "rename --> invoke, name = " + str;
            controllerManager = MiotManager.getControllerManager();
            device = this.f12868z.getDevice();
            completedHandler = new C6043d(str);
        } else if (i != 8) {
            return false;
        } else {
            mo27834R1();
            return false;
        }
        controllerManager.renameDevice(device, str, completedHandler);
        return false;
    }

    /* renamed from: y0 */
    public void mo23356y0() {
        mo27796m2();
        mo23414j0();
    }
}

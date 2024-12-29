package com.yeelight.yeelib.device.base;

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
import com.p022mi.iot.common.abstractdevice.AbstractDevice;
import com.p022mi.iot.common.error.IotError;
import com.p022mi.iot.common.handler.CompletedHandler;
import com.p022mi.iot.manager.ControllerManager;
import com.yeelight.cherry.p141ui.activity.DemoControlViewActivity;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.managers.C3064h;
import com.yeelight.yeelib.managers.C8272e;
import com.yeelight.yeelib.managers.C8301v;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.DeviceOfflinePromptActivity;
import miot.bluetooth.security.mesh.IBleMeshUpgradeResponse;
import org.json.JSONObject;
import p227x3.C11971h;
import p237z3.C12143c;
import p237z3.C12145e;

/* renamed from: com.yeelight.yeelib.device.base.f */
public abstract class C6094f extends C6100g implements C12145e {

    /* renamed from: C */
    private int f12512C;

    /* renamed from: Q */
    private String f12513Q;

    /* renamed from: R */
    private String f12514R;

    /* renamed from: S */
    private final BluetoothConnectStatusResponse f12515S = new C6095a();

    /* renamed from: com.yeelight.yeelib.device.base.f$a */
    class C6095a extends BluetoothConnectStatusResponse {
        C6095a() {
        }

        public void onAuthResponse(int i, Bundle bundle) {
            String str = C6094f.this.f4758v;
        }

        public void onBindResponse(int i, Bundle bundle) {
            String str = C6094f.this.f4758v;
        }

        public void onCallback(int i, Bundle bundle) {
            if (i == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("mesh device, data.get(\"did\"); = ");
                sb.append(bundle.toString());
                C6094f.this.mo23184F0(11);
                YeelightDeviceManager.m7800o0().mo23320v1(C6094f.this.mo23204R());
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("mesh device, connect failed, error code: ");
            sb2.append(i);
            C6094f.this.mo23184F0(0);
        }

        public void onConnectResponse(int i, Bundle bundle) {
            String str = C6094f.this.f4758v;
        }
    }

    /* renamed from: com.yeelight.yeelib.device.base.f$b */
    class C6096b extends MiotBleResponse {
        C6096b() {
        }

        public void onResponse(int i, Bundle bundle) {
            if (bundle != null) {
                try {
                    JSONObject jSONObject = new JSONObject(bundle.getString(Constants.EXTRA_DATA_JSON));
                    StringBuilder sb = new StringBuilder();
                    sb.append("queryBleMeshFirmwareUpdateInfo data: ");
                    sb.append(jSONObject);
                    C3064h.m7982j().mo23397u(jSONObject, C6094f.this.mo23208T());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.base.f$c */
    class C6097c implements IBleMeshUpgradeResponse {
        C6097c() {
        }

        public void onProgress(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("upgradeFirmware, progress = ");
            sb.append(i);
            if (C6094f.this.mo23197N() != null) {
                ((C11971h) C6094f.this.mo23197N()).mo42544n(i);
            }
        }

        public void onResponse(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("upgradeFirmware, onResponse code = ");
            sb.append(i);
            sb.append(", message = ");
            sb.append(str);
            if (C6094f.this.mo23197N() != null) {
                ((C11971h) C6094f.this.mo23197N()).mo42543m(i);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.base.f$d */
    class C6098d implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ String f12519a;

        C6098d(String str) {
            this.f12519a = str;
        }

        public void onFailed(IotError iotError) {
            StringBuilder sb = new StringBuilder();
            sb.append("rename onFailed, error = ");
            sb.append(iotError.toString());
        }

        public void onSucceed() {
            C6094f.this.mo23221d0().mo31533D0(this.f12519a);
        }
    }

    /* renamed from: com.yeelight.yeelib.device.base.f$e */
    class C6099e implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ String f12521a;

        C6099e(String str) {
            this.f12521a = str;
        }

        public void onFailed(IotError iotError) {
            StringBuilder sb = new StringBuilder();
            sb.append("rename onFailed, error = ");
            sb.append(iotError.toString());
        }

        public void onSucceed() {
            C6094f.this.mo23221d0().mo31533D0(this.f12521a);
        }
    }

    public C6094f(String str, String str2, String str3, int i, String str4) {
        super(str, str2, str3, i, str4);
        mo23189I0("bluetooth_mesh");
        this.f12512C = i;
        this.f12513Q = str4;
        mo23178B0(this);
        StringBuilder sb = new StringBuilder();
        sb.append("mesh device create: ");
        sb.append(str3);
    }

    /* renamed from: E1 */
    public AbstractDevice mo31697E1() {
        return this.f12527z;
    }

    /* renamed from: M1 */
    public String mo31698M1() {
        return this.f12513Q;
    }

    /* renamed from: X1 */
    public void mo31699X1(AbstractDevice abstractDevice) {
        this.f12527z = abstractDevice;
        this.f4753r = abstractDevice.getDeviceId();
        mo23221d0().mo31549L0(this.f12527z.isOnline());
        mo23184F0(mo23145k0() ? 11 : 0);
    }

    /* renamed from: Y0 */
    public boolean mo23137Y0() {
        C3064h.C3071f fVar = (C3064h.C3071f) C3064h.m7982j().mo23393m(mo23208T());
        if (fVar == null) {
            return true;
        }
        XmBluetoothManager.getInstance().startBleMeshUpgrade(mo23204R(), mo31698M1(), fVar.mo23429f(), fVar.mo23427d().getAbsolutePath(), new C6097c());
        return true;
    }

    /* renamed from: d2 */
    public void mo31700d2(String str) {
        this.f12514R = str;
    }

    /* renamed from: e2 */
    public void mo31701e2(String str) {
        this.f12513Q = str;
    }

    /* renamed from: i2 */
    public void mo31702i2(BluetoothConnectStatusResponse bluetoothConnectStatusResponse) {
        StringBuilder sb = new StringBuilder();
        sb.append("bleMeshConnect --> invoke !, device token = ");
        sb.append(mo31705l2());
        sb.append(", mac = ");
        sb.append(mo23204R());
        sb.append("， deviceId = ");
        sb.append(mo23185G());
        XmBluetoothManager.getInstance().bleMeshConnect(mo23204R(), mo31698M1(), mo31705l2(), bluetoothConnectStatusResponse);
    }

    /* renamed from: j2 */
    public void mo31703j2(BleResponse<String> bleResponse) {
        XmBluetoothManager.getInstance().getBleMeshFirmwareVersion(mo23204R(), bleResponse);
    }

    /* renamed from: k0 */
    public boolean mo23145k0() {
        AbstractDevice abstractDevice = this.f12527z;
        return abstractDevice != null && abstractDevice.isOnline();
    }

    /* renamed from: k2 */
    public int mo31704k2() {
        return this.f12512C;
    }

    /* renamed from: l2 */
    public String mo31705l2() {
        return this.f12514R;
    }

    /* renamed from: m0 */
    public boolean mo23149m0() {
        return !mo23145k0();
    }

    /* renamed from: m2 */
    public void mo31706m2() {
        XmBluetoothManager.getInstance().getBleMeshFirmwareUpdateInfo(mo31698M1(), new C6096b());
    }

    /* renamed from: n */
    public void mo23151n() {
        String R = mo23204R();
        BluetoothDeviceConfig bluetoothDeviceConfig = new BluetoothDeviceConfig();
        bluetoothDeviceConfig.bindStyle = BindStyle.STRONG;
        bluetoothDeviceConfig.model = mo23208T();
        bluetoothDeviceConfig.productId = mo31704k2();
        XmBluetoothManager.getInstance().setDeviceConfig(bluetoothDeviceConfig);
        mo23184F0(2);
        StringBuilder sb = new StringBuilder();
        sb.append("trying to connect device: ");
        sb.append(this.f4754s);
        sb.append(", model = ");
        sb.append(mo23208T());
        XmBluetoothManager.getInstance().bleMeshBind(R, this.f12515S);
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == 1024 && (mo23212W() == Device.Ownership.MINE || mo23212W() == Device.Ownership.OTHERS)) {
            DeviceDataProvider.m17615a0(this);
        }
        if ((this.f4742g & i) != 0) {
            C8301v.m19658b(mo23185G(), i & this.f4742g);
        }
    }

    /* renamed from: r */
    public void mo23156r() {
        mo23184F0(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public void mo23235s0(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("MeshDeviceBase, notifyConnStateChanged, ");
        sb.append(i);
        sb.append(" -> ");
        sb.append(i2);
        for (C12143c onConnectionStateChanged : this.f4740e) {
            onConnectionStateChanged.onConnectionStateChanged(i, i2);
        }
        if (i2 == 11) {
            mo23167x0();
            mo23169y0();
        }
    }

    /* renamed from: u0 */
    public void mo23161u0(View view) {
        if (!C8272e.m19511b().mo35204d()) {
            Toast.makeText(view.getContext(), view.getContext().getResources().getString(R$string.common_text_please_check_network), 0).show();
        } else if (mo23145k0()) {
            Class<DemoControlViewActivity> cls = null;
            Class<DemoControlViewActivity> cls2 = DemoControlViewActivity.class;
            try {
                int i = DemoControlViewActivity.f10265p;
                cls = cls2;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            if (cls != null && mo23145k0()) {
                Intent intent = new Intent();
                intent.setClass(view.getContext(), cls);
                intent.putExtra("com.yeelight.cherry.device_id", mo23185G());
                view.getContext().startActivity(intent);
            }
        } else {
            Intent intent2 = new Intent();
            intent2.setClass(view.getContext(), DeviceOfflinePromptActivity.class);
            intent2.putExtra("com.yeelight.cherry.device_id", this.f4753r);
            view.getContext().startActivity(intent2);
        }
    }

    /* renamed from: x */
    public boolean mo23166x(int i, Object obj) {
        String str;
        ControllerManager controllerManager;
        CompletedHandler completedHandler;
        com.p022mi.iot.common.instance.Device device;
        if (i == 0) {
            str = (String) obj;
            StringBuilder sb = new StringBuilder();
            sb.append("rename --> invoke, name = ");
            sb.append(str);
            controllerManager = MiotManager.getControllerManager();
            device = this.f12527z.getDevice();
            completedHandler = new C6099e(str);
        } else if (i == 1) {
            str = (String) obj;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("rename --> invoke, name = ");
            sb2.append(str);
            controllerManager = MiotManager.getControllerManager();
            device = this.f12527z.getDevice();
            completedHandler = new C6098d(str);
        } else if (i != 8) {
            return false;
        } else {
            mo31720R1();
            return false;
        }
        controllerManager.renameDevice(device, str, completedHandler);
        return false;
    }

    /* renamed from: y0 */
    public void mo23169y0() {
        mo31706m2();
        mo23228j0();
    }
}

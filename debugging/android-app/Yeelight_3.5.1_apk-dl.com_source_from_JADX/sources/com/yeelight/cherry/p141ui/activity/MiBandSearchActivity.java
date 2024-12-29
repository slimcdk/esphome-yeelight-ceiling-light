package com.yeelight.cherry.p141ui.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Paint;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.yeelight.cherry.C12224R$drawable;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.C8272e;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CircleBarView;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p051j4.C9193k;
import p170i4.C9113d;
import p207s3.C10333b;
import p207s3.C10343e;
import p237z3.C12143c;
import p237z3.C12145e;

/* renamed from: com.yeelight.cherry.ui.activity.MiBandSearchActivity */
public class MiBandSearchActivity extends BaseActivity implements C12145e, C12143c {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final String f10907k = "MiBandSearchActivity";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C10333b f10908a;

    /* renamed from: b */
    private BluetoothManager f10909b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<BluetoothDevice> f10910c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public BluetoothDevice f10911d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public BluetoothGatt f10912e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C9113d f10913f;

    /* renamed from: g */
    private C9113d f10914g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f10915h;

    /* renamed from: i */
    private boolean f10916i;
    /* access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})

    /* renamed from: j */
    public Handler f10917j = new C5479a();
    @BindView(2131296540)
    CircleBarView mCircleBarView;
    @BindView(2131296882)
    ImageView mImgConnectStatus;
    @BindView(2131296911)
    ImageView mImgRefresh;
    @BindView(2131297087)
    LinearLayout mLLConnectStatus;
    @BindView(2131297086)
    LinearLayout mLlConnect;
    @BindView(2131297093)
    LinearLayout mLlSearch;
    @BindView(2131297636)
    TextView mTvCancel;
    @BindView(2131297643)
    TextView mTvConnectStatus;

    /* renamed from: com.yeelight.cherry.ui.activity.MiBandSearchActivity$a */
    class C5479a extends Handler {

        /* renamed from: com.yeelight.cherry.ui.activity.MiBandSearchActivity$a$a */
        class C5480a extends BluetoothGattCallback {
            C5480a() {
            }

            public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
                super.onConnectionStateChange(bluetoothGatt, i, i2);
                if (i2 == 2) {
                    bluetoothGatt.discoverServices();
                }
            }

            public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
                super.onServicesDiscovered(bluetoothGatt, i);
                if (bluetoothGatt.getService(UUID.fromString("0000fee0-0000-1000-8000-00805f9b34fb")) != null) {
                    BluetoothDevice unused = MiBandSearchActivity.this.f10911d = bluetoothGatt.getDevice();
                    MiBandSearchActivity.this.f10917j.removeMessages(12);
                    MiBandSearchActivity.this.f10917j.sendEmptyMessageDelayed(9, 1500);
                }
            }
        }

        C5479a() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 4) {
                if (i != 12) {
                    if (i == 8) {
                        removeMessages(12);
                        if (MiBandSearchActivity.this.f10910c == null || MiBandSearchActivity.this.f10910c.isEmpty()) {
                            sendEmptyMessageDelayed(9, 1500);
                            return;
                        }
                        BluetoothDevice bluetoothDevice = (BluetoothDevice) MiBandSearchActivity.this.f10910c.remove(0);
                        if (bluetoothDevice.getName() != null && bluetoothDevice.getName().contains("MI Band 2")) {
                            sendEmptyMessage(8);
                            return;
                        } else if (bluetoothDevice.getAddress().equals(MiBandSearchActivity.this.f10908a.mo23185G())) {
                            sendEmptyMessage(8);
                            return;
                        } else {
                            sendEmptyMessageDelayed(12, 6000);
                            bluetoothDevice.connectGatt(MiBandSearchActivity.this.getApplicationContext(), false, new C5480a());
                            return;
                        }
                    } else if (i == 9) {
                        if (MiBandSearchActivity.this.f10911d != null) {
                            MiBandSearchActivity.this.mo30693H0();
                            return;
                        }
                    } else {
                        return;
                    }
                }
                MiBandSearchActivity.this.m16666K0();
                return;
            }
            MiBandSearchActivity.this.f10908a.mo41884e2();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MiBandSearchActivity$b */
    class C5481b implements Runnable {
        C5481b() {
        }

        public void run() {
            MiBandSearchActivity.this.f10908a.mo41884e2();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MiBandSearchActivity$c */
    class C5482c extends BluetoothGattCallback {

        /* renamed from: com.yeelight.cherry.ui.activity.MiBandSearchActivity$c$a */
        class C5483a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ BluetoothGatt f10922a;

            /* renamed from: b */
            final /* synthetic */ BluetoothGattCharacteristic f10923b;

            C5483a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                this.f10922a = bluetoothGatt;
                this.f10923b = bluetoothGattCharacteristic;
            }

            public void run() {
                if (!MiBandSearchActivity.this.f10915h) {
                    this.f10922a.close();
                    return;
                }
                this.f10923b.setValue(new byte[]{3});
                this.f10922a.writeCharacteristic(this.f10923b);
                this.f10922a.close();
                MiBandSearchActivity.this.m16664I0();
            }
        }

        C5482c() {
        }

        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            if (i2 == 2) {
                bluetoothGatt.discoverServices();
            }
        }

        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            BluetoothGatt unused = MiBandSearchActivity.this.f10912e = bluetoothGatt;
            BluetoothDevice unused2 = MiBandSearchActivity.this.f10911d = bluetoothGatt.getDevice();
            for (BluetoothGattService next : bluetoothGatt.getServices()) {
                String uuid = next.getUuid().toString();
                String unused3 = MiBandSearchActivity.f10907k;
                StringBuilder sb = new StringBuilder();
                sb.append("oServicesDiscovered serviceId : ");
                sb.append(uuid);
                if ("00001802-0000-1000-8000-00805f9b34fb".equals(uuid)) {
                    for (BluetoothGattCharacteristic next2 : next.getCharacteristics()) {
                        if (next2.getUuid().toString().equals("00002a06-0000-1000-8000-00805f9b34fb")) {
                            next2.setValue(new byte[]{3});
                            bluetoothGatt.writeCharacteristic(next2);
                            new Handler(Looper.getMainLooper()).postDelayed(new C5483a(bluetoothGatt, next2), 2200);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MiBandSearchActivity$d */
    class C5484d implements DialogInterface.OnClickListener {
        C5484d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            MiBandSearchActivity.this.f10913f.dismiss();
            MiBandSearchActivity.this.f10917j.sendEmptyMessage(8);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MiBandSearchActivity$e */
    class C5485e implements Runnable {
        C5485e() {
        }

        public void run() {
            MiBandSearchActivity.this.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public /* synthetic */ void m16658A0(int i, DeviceStatusBase deviceStatusBase) {
        StringBuilder sb = new StringBuilder();
        sb.append("read miband type = ");
        sb.append(i);
        sb.append("    status = ");
        sb.append(deviceStatusBase);
        if (i == 8192) {
            this.f10917j.removeMessages(4);
            C10343e y = deviceStatusBase.mo31625y();
            if (y == null || y.mo41919a() == null) {
                return;
            }
        } else if (i == 65536) {
            this.f10917j.removeMessages(4);
            this.f10908a.mo41884e2();
        } else if (i == 131072) {
            m16692u0();
            return;
        } else if (i == 16384) {
            this.f10917j.postDelayed(new C5481b(), 1000);
            return;
        } else if (i == 32768) {
            this.f10908a.mo41884e2();
            return;
        } else if (i != 4096) {
            return;
        }
        m16691t0();
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public /* synthetic */ void m16659B0(DialogInterface dialogInterface, int i) {
        this.f10913f.dismiss();
        m16693v0();
    }

    /* access modifiers changed from: private */
    /* renamed from: D0 */
    public /* synthetic */ void m16661D0(AlertDialog alertDialog, int i, View view) {
        alertDialog.dismiss();
        if (i == 1) {
            startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        } else if (i == 2) {
            m16695x0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E0 */
    public /* synthetic */ void m16662E0(DialogInterface dialogInterface, int i) {
        this.f10914g.dismiss();
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: F0 */
    public /* synthetic */ void m16663F0(DialogInterface dialogInterface, int i) {
        this.f10914g.dismiss();
        m16689r0();
    }

    /* access modifiers changed from: private */
    /* renamed from: I0 */
    public void m16664I0() {
        if (this.f10915h) {
            if (this.f10913f == null) {
                this.f10913f = new C9113d.C9118e(this).mo37176f(2131755881).mo37175e(C12224R$drawable.icon_yeelight_mi_band_shake).mo37174d(-2, getString(2131755882), new C5484d()).mo37174d(-1, getString(2131755883), new C5862z1(this)).mo37172b();
            }
            if (!this.f10913f.isShowing()) {
                this.f10913f.show();
            }
        }
    }

    /* renamed from: J0 */
    private void m16665J0(int i) {
        int i2;
        View inflate = View.inflate(this, C12228R$layout.dialog_device_scan_permission_denied, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C12225R$id.tv_permission_content);
        ImageView imageView = (ImageView) inflate.findViewById(C12225R$id.img_permission_type);
        if (i == 1) {
            textView.setText(2131755522);
            i2 = C12224R$drawable.icon_device_permission_location;
        } else {
            if (i == 2) {
                textView.setText(2131755196);
                i2 = C12224R$drawable.icon_device_permission_bluetooth;
            }
            inflate.setLayerType(1, (Paint) null);
            AlertDialog create = new AlertDialog.Builder(this, 2131820942).create();
            create.requestWindowFeature(1);
            create.setCancelable(false);
            create.show();
            create.setContentView(inflate);
            inflate.findViewById(2131296480).setOnClickListener(new C5725a2(create));
            inflate.findViewById(2131296491).setOnClickListener(new C5731b2(this, create, i));
            Display defaultDisplay = getWindowManager().getDefaultDisplay();
            WindowManager.LayoutParams attributes = create.getWindow().getAttributes();
            attributes.height = -2;
            double width = (double) defaultDisplay.getWidth();
            Double.isNaN(width);
            attributes.width = (int) (width * 0.78d);
            create.getWindow().setAttributes(attributes);
        }
        imageView.setImageResource(i2);
        inflate.setLayerType(1, (Paint) null);
        AlertDialog create2 = new AlertDialog.Builder(this, 2131820942).create();
        create2.requestWindowFeature(1);
        create2.setCancelable(false);
        create2.show();
        create2.setContentView(inflate);
        inflate.findViewById(2131296480).setOnClickListener(new C5725a2(create2));
        inflate.findViewById(2131296491).setOnClickListener(new C5731b2(this, create2, i));
        Display defaultDisplay2 = getWindowManager().getDefaultDisplay();
        WindowManager.LayoutParams attributes2 = create2.getWindow().getAttributes();
        attributes2.height = -2;
        double width2 = (double) defaultDisplay2.getWidth();
        Double.isNaN(width2);
        attributes2.width = (int) (width2 * 0.78d);
        create2.getWindow().setAttributes(attributes2);
    }

    /* access modifiers changed from: private */
    /* renamed from: K0 */
    public void m16666K0() {
        if (this.f10915h) {
            if (this.f10914g == null) {
                this.f10914g = new C9113d.C9118e(this).mo37178h(2131755891).mo37176f(2131755909).mo37174d(-2, getString(2131755232), new C5852x1(this)).mo37174d(-1, getString(2131755308), new C5857y1(this)).mo37172b();
            }
            if (!this.f10914g.isShowing()) {
                this.f10914g.show();
            }
        }
    }

    /* renamed from: n0 */
    private void m16685n0() {
        if (C8272e.m19511b().mo35203c()) {
            mo30692G0();
        } else {
            m16665J0(2);
        }
    }

    @RequiresApi(api = 31)
    /* renamed from: o0 */
    private void m16686o0() {
        if (m16696y0("android.permission.BLUETOOTH_SCAN") && m16696y0("android.permission.BLUETOOTH_CONNECT")) {
            m16685n0();
        } else if (ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.BLUETOOTH_SCAN") || ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.BLUETOOTH_CONNECT")) {
            mo35655S(2131755993);
        } else {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"}, 2);
        }
    }

    /* renamed from: p0 */
    private void m16687p0() {
        if (!C8272e.m19511b().mo35203c()) {
            m16665J0(2);
        } else if (m16696y0("android.permission.ACCESS_FINE_LOCATION") && m16696y0("android.permission.ACCESS_COARSE_LOCATION")) {
            m16688q0();
        } else if (ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.ACCESS_FINE_LOCATION")) {
            mo35655S(2131755994);
        } else {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 1);
        }
    }

    /* renamed from: q0 */
    private void m16688q0() {
        LocationManager locationManager = (LocationManager) getSystemService("location");
        if (!locationManager.isProviderEnabled("gps") || !locationManager.isProviderEnabled("network")) {
            m16665J0(1);
        } else {
            mo30692G0();
        }
    }

    /* renamed from: r0 */
    private void m16689r0() {
        if (Build.VERSION.SDK_INT < 31) {
            m16687p0();
        } else {
            m16686o0();
        }
    }

    /* renamed from: s0 */
    private void m16690s0() {
        BluetoothDevice bluetoothDevice = this.f10911d;
        String address = bluetoothDevice != null ? bluetoothDevice.getAddress() : null;
        if (address != null) {
            this.f10908a.mo41880Y1(address);
            this.f10908a.mo41882a2(true);
            this.f10917j.sendEmptyMessageDelayed(4, 2000);
        }
    }

    /* renamed from: t0 */
    private void m16691t0() {
        this.f10916i = true;
        this.mImgRefresh.setVisibility(4);
        this.mTvConnectStatus.setText(2131755888);
        this.mCircleBarView.mo36139k();
        this.mCircleBarView.postDelayed(new C5485e(), 2500);
    }

    /* renamed from: u0 */
    private void m16692u0() {
        if (!this.f10916i) {
            this.mLLConnectStatus.setEnabled(true);
            this.mImgRefresh.setVisibility(0);
            this.mCircleBarView.mo36141m();
            this.mTvConnectStatus.setText(2131755886);
            this.mImgConnectStatus.setImageResource(C12224R$drawable.icon_yeelight_mi_band_connect_failed);
        }
    }

    /* renamed from: v0 */
    private void m16693v0() {
        this.mLLConnectStatus.setEnabled(false);
        this.mImgRefresh.setVisibility(8);
        this.mLlSearch.setVisibility(4);
        this.mLlConnect.setVisibility(0);
        this.mTvCancel.setVisibility(4);
        this.mImgConnectStatus.setImageResource(C12224R$drawable.icon_yeelight_mi_band_connecting);
        this.mTvConnectStatus.setText(2131755888);
        this.mCircleBarView.mo36138j();
        this.mCircleBarView.mo36140l(80.0f, 5000);
        m16694w0();
        m16690s0();
    }

    /* renamed from: w0 */
    private void m16694w0() {
        BluetoothGatt bluetoothGatt;
        if (this.f10908a != null && (bluetoothGatt = this.f10912e) != null) {
            bluetoothGatt.disconnect();
            this.f10912e.close();
            this.f10912e = null;
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: x0 */
    private void m16695x0() {
        if (Build.VERSION.SDK_INT < 33) {
            C3108x.m8223f().mo23541b().enable();
        } else {
            startActivity(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
        }
    }

    /* renamed from: y0 */
    private boolean m16696y0(String str) {
        return ContextCompat.checkSelfPermission(this, str) == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public /* synthetic */ void m16697z0() {
        this.mTvConnectStatus.setText(2131755887);
        this.mImgConnectStatus.setImageResource(C12224R$drawable.icon_yeelight_mi_band_connect_success);
    }

    /* renamed from: G0 */
    public void mo30692G0() {
        YeelightDeviceManager.m7800o0().mo23278Z(true, false, false);
        List<BluetoothDevice> connectedDevices = this.f10909b.getConnectedDevices(7);
        this.f10910c = connectedDevices;
        Iterator<BluetoothDevice> it = connectedDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            BluetoothDevice next = it.next();
            if (YeelightDeviceManager.m7775U0(next.getName())) {
                this.f10911d = next;
                break;
            }
        }
        if (this.f10911d != null) {
            this.f10917j.sendEmptyMessageDelayed(9, 1000);
        } else {
            this.f10917j.sendEmptyMessage(8);
        }
    }

    /* renamed from: H0 */
    public void mo30693H0() {
        BluetoothDevice bluetoothDevice = this.f10911d;
        if (bluetoothDevice != null) {
            bluetoothDevice.connectGatt(this, false, new C5482c());
        }
    }

    public void onConnectionStateChanged(int i, int i2) {
        if (i2 == 0) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C12228R$layout.activity_mi_band_search);
        ButterKnife.bind((Activity) this);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f10907k, "Activity has not device id", false);
            finish();
            return;
        }
        this.f10908a = (C10333b) YeelightDeviceManager.m7800o0().mo23274P0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        C9193k.m22157h(true, this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        findViewById(2131297598).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        this.f10909b = (BluetoothManager) getSystemService("bluetooth");
        this.mCircleBarView.setOnCompleteListener(new C5737c2(this));
        m16689r0();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C9113d dVar = this.f10913f;
        if (dVar != null && dVar.isShowing()) {
            this.f10913f.dismiss();
        }
        C9113d dVar2 = this.f10914g;
        if (dVar2 != null && dVar2.isShowing()) {
            this.f10914g.dismiss();
        }
        super.onDestroy();
        this.f10917j.removeCallbacksAndMessages((Object) null);
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        int i2;
        super.onRequestPermissionsResult(i, strArr, iArr);
        boolean z = false;
        if (iArr.length > 0) {
            int length = iArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    z = true;
                    break;
                } else if (iArr[i3] != 0) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (i == 1) {
            if (z) {
                m16688q0();
                return;
            }
            i2 = 2131755994;
        } else if (i != 2) {
            return;
        } else {
            if (z) {
                m16685n0();
                return;
            }
            i2 = 2131755993;
        }
        mo35655S(i2);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f10915h = true;
        this.f10908a.mo23178B0(this);
        this.f10908a.mo23171z0(this);
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        runOnUiThread(new C5743d2(this, i, deviceStatusBase));
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f10915h = false;
        this.f10908a.mo23213W0(this);
        this.f10908a.mo23133V0(this);
    }

    @OnClick({2131296876, 2131297636, 2131297087})
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id != 2131296876) {
            if (id == 2131297087) {
                m16693v0();
                return;
            } else if (id != 2131297636) {
                return;
            }
        }
        finish();
    }
}

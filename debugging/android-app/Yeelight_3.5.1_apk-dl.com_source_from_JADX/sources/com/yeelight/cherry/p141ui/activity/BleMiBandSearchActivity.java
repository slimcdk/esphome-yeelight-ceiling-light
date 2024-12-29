package com.yeelight.cherry.p141ui.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.yeelight.cherry.C12224R$drawable;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CircleBarView;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p051j4.C9193k;
import p170i4.C9113d;
import p223w3.C11627r;
import p237z3.C12143c;
import p237z3.C12145e;

/* renamed from: com.yeelight.cherry.ui.activity.BleMiBandSearchActivity */
public class BleMiBandSearchActivity extends BaseActivity implements C12145e, C12143c {

    /* renamed from: a */
    private String f9925a = BleMiBandSearchActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C11627r f9926b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public BluetoothGatt f9927c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List<BluetoothDevice> f9928d = null;

    /* renamed from: e */
    private BluetoothManager f9929e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public BluetoothDevice f9930f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C9113d f9931g;

    /* renamed from: h */
    private C9113d f9932h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f9933i;
    /* access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})

    /* renamed from: j */
    public Handler f9934j = new C5061a();
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

    /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandSearchActivity$a */
    class C5061a extends Handler {

        /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandSearchActivity$a$a */
        class C5062a extends BluetoothGattCallback {
            C5062a() {
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
                    BluetoothDevice unused = BleMiBandSearchActivity.this.f9930f = bluetoothGatt.getDevice();
                    BleMiBandSearchActivity.this.f9934j.removeMessages(12);
                    BleMiBandSearchActivity.this.f9934j.sendEmptyMessageDelayed(9, 1500);
                }
            }
        }

        C5061a() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 4) {
                if (i != 12) {
                    if (i == 8) {
                        removeMessages(12);
                        if (BleMiBandSearchActivity.this.f9928d == null || BleMiBandSearchActivity.this.f9928d.isEmpty()) {
                            sendEmptyMessageDelayed(9, 1500);
                            return;
                        }
                        BluetoothDevice bluetoothDevice = (BluetoothDevice) BleMiBandSearchActivity.this.f9928d.remove(0);
                        if (bluetoothDevice.getName() != null && bluetoothDevice.getName().contains("MI Band 2")) {
                            sendEmptyMessage(8);
                            return;
                        } else if (!bluetoothDevice.getAddress().equals(BleMiBandSearchActivity.this.f9926b.mo23185G())) {
                            sendEmptyMessageDelayed(12, 6000);
                            bluetoothDevice.connectGatt(BleMiBandSearchActivity.this.getApplicationContext(), false, new C5062a());
                            return;
                        }
                    } else if (i == 9) {
                        if (BleMiBandSearchActivity.this.f9930f == null) {
                            BleMiBandSearchActivity.this.m15892x0();
                            return;
                        } else {
                            BleMiBandSearchActivity.this.mo30195v0();
                            return;
                        }
                    } else {
                        return;
                    }
                }
                sendEmptyMessage(8);
                return;
            }
            BleMiBandSearchActivity.this.f9926b.mo42337A2();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandSearchActivity$b */
    class C5063b extends BluetoothGattCallback {

        /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandSearchActivity$b$a */
        class C5064a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ BluetoothGatt f9938a;

            /* renamed from: b */
            final /* synthetic */ BluetoothGattCharacteristic f9939b;

            C5064a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                this.f9938a = bluetoothGatt;
                this.f9939b = bluetoothGattCharacteristic;
            }

            public void run() {
                if (!BleMiBandSearchActivity.this.f9933i) {
                    this.f9938a.close();
                    return;
                }
                this.f9939b.setValue(new byte[]{3});
                this.f9938a.writeCharacteristic(this.f9939b);
                this.f9938a.close();
                BleMiBandSearchActivity.this.m15891w0();
            }
        }

        C5063b() {
        }

        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            if (i2 == 2) {
                bluetoothGatt.discoverServices();
            }
        }

        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            BluetoothGatt unused = BleMiBandSearchActivity.this.f9927c = bluetoothGatt;
            BluetoothDevice unused2 = BleMiBandSearchActivity.this.f9930f = bluetoothGatt.getDevice();
            for (BluetoothGattService next : bluetoothGatt.getServices()) {
                if ("00001802-0000-1000-8000-00805f9b34fb".equals(next.getUuid().toString())) {
                    for (BluetoothGattCharacteristic next2 : next.getCharacteristics()) {
                        if (next2.getUuid().toString().equals("00002a06-0000-1000-8000-00805f9b34fb")) {
                            next2.setValue(new byte[]{3});
                            bluetoothGatt.writeCharacteristic(next2);
                            new Handler(Looper.getMainLooper()).postDelayed(new C5064a(bluetoothGatt, next2), 2200);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandSearchActivity$c */
    class C5065c implements DialogInterface.OnClickListener {
        C5065c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            BleMiBandSearchActivity.this.f9931g.dismiss();
            BleMiBandSearchActivity.this.f9934j.sendEmptyMessage(8);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandSearchActivity$d */
    class C5066d implements Runnable {
        C5066d() {
        }

        public void run() {
            BleMiBandSearchActivity.this.finish();
        }
    }

    /* renamed from: k0 */
    private void m15880k0() {
        BluetoothDevice bluetoothDevice = this.f9930f;
        String address = bluetoothDevice != null ? bluetoothDevice.getAddress() : null;
        if (address != null) {
            if (this.f9930f.getName() == null || !this.f9930f.getName().toLowerCase().startsWith("mi band 2")) {
                this.f9926b.mo42344n2(address);
            } else {
                this.f9926b.mo42345o2(address, 1);
            }
            this.f9934j.sendEmptyMessageDelayed(4, 2000);
        }
    }

    /* renamed from: l0 */
    private void m15881l0() {
        this.mImgRefresh.setVisibility(4);
        this.mCircleBarView.mo36139k();
        this.mCircleBarView.postDelayed(new C5066d(), 2500);
    }

    /* renamed from: m0 */
    private void m15882m0() {
        this.mLLConnectStatus.setEnabled(true);
        this.mImgRefresh.setVisibility(0);
        this.mCircleBarView.mo36141m();
        this.mTvConnectStatus.setText(2131755886);
        this.mImgConnectStatus.setImageResource(C12224R$drawable.icon_yeelight_mi_band_connect_failed);
    }

    /* renamed from: n0 */
    private void m15883n0() {
        this.mLLConnectStatus.setEnabled(false);
        this.mImgRefresh.setVisibility(8);
        this.mLlSearch.setVisibility(4);
        this.mLlConnect.setVisibility(0);
        this.mTvCancel.setVisibility(4);
        this.mImgConnectStatus.setImageResource(C12224R$drawable.icon_yeelight_mi_band_connecting);
        this.mTvConnectStatus.setText(2131755888);
        this.mCircleBarView.mo36138j();
        this.mCircleBarView.mo36140l(80.0f, 5000);
        m15884o0();
        m15880k0();
    }

    /* renamed from: o0 */
    private void m15884o0() {
        BluetoothGatt bluetoothGatt;
        if (this.f9926b != null && (bluetoothGatt = this.f9927c) != null) {
            bluetoothGatt.disconnect();
            this.f9927c.close();
            this.f9927c = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public /* synthetic */ void m15885p0() {
        this.mTvConnectStatus.setText(2131755887);
        this.mImgConnectStatus.setImageResource(C12224R$drawable.icon_yeelight_mi_band_connect_success);
    }

    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public /* synthetic */ void m15886q0(int i) {
        if (i == 65536) {
            this.f9934j.removeMessages(4);
            this.f9926b.mo42337A2();
            m15881l0();
        } else if (i == 131072) {
            m15882m0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public /* synthetic */ void m15887r0(DialogInterface dialogInterface, int i) {
        this.f9931g.dismiss();
        m15883n0();
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public /* synthetic */ void m15888s0(DialogInterface dialogInterface, int i) {
        this.f9932h.dismiss();
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public /* synthetic */ void m15889t0(DialogInterface dialogInterface, int i) {
        this.f9932h.dismiss();
        m15890u0();
    }

    /* renamed from: u0 */
    private void m15890u0() {
        YeelightDeviceManager.m7800o0().mo23278Z(true, false, false);
        List<BluetoothDevice> connectedDevices = this.f9929e.getConnectedDevices(7);
        this.f9928d = connectedDevices;
        Iterator<BluetoothDevice> it = connectedDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            BluetoothDevice next = it.next();
            if (YeelightDeviceManager.m7775U0(next.getName())) {
                this.f9930f = next;
                break;
            }
        }
        if (this.f9930f != null) {
            this.f9934j.sendEmptyMessageDelayed(9, 1000);
        } else {
            this.f9934j.sendEmptyMessage(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w0 */
    public void m15891w0() {
        if (this.f9933i) {
            if (this.f9931g == null) {
                this.f9931g = new C9113d.C9118e(this).mo37176f(2131755881).mo37175e(C12224R$drawable.icon_yeelight_mi_band_shake).mo37174d(-2, getString(2131755882), new C5065c()).mo37174d(-1, getString(2131755883), new C5805o(this)).mo37172b();
            }
            if (!this.f9931g.isShowing()) {
                this.f9931g.show();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public void m15892x0() {
        if (this.f9933i) {
            if (this.f9932h == null) {
                this.f9932h = new C9113d.C9118e(this).mo37178h(2131755891).mo37176f(2131755909).mo37174d(-2, getString(2131755232), new C5810p(this)).mo37174d(-1, getString(2131755308), new C5800n(this)).mo37172b();
            }
            if (!this.f9932h.isShowing()) {
                this.f9932h.show();
            }
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
        C9193k.m22157h(true, this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        findViewById(2131297598).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        this.f9929e = (BluetoothManager) getSystemService("bluetooth");
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(this.f9925a, "Activity has not device id", false);
            finish();
            return;
        }
        this.f9926b = (C11627r) YeelightDeviceManager.m7800o0().mo23295i0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.mCircleBarView.setOnCompleteListener(new C5815q(this));
        m15890u0();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C9113d dVar = this.f9931g;
        if (dVar != null && dVar.isShowing()) {
            this.f9931g.dismiss();
        }
        C9113d dVar2 = this.f9932h;
        if (dVar2 != null && dVar2.isShowing()) {
            this.f9932h.dismiss();
        }
        super.onDestroy();
        this.f9934j.removeCallbacksAndMessages((Object) null);
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f9933i = false;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f9933i = true;
        this.f9926b.mo23178B0(this);
        this.f9926b.mo23171z0(this);
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        runOnUiThread(new C5820r(this, i));
    }

    @OnClick({2131296876, 2131297636, 2131297087})
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id != 2131296876) {
            if (id == 2131297087) {
                m15883n0();
                return;
            } else if (id != 2131297636) {
                return;
            }
        }
        finish();
    }

    /* renamed from: v0 */
    public void mo30195v0() {
        BluetoothDevice bluetoothDevice = this.f9930f;
        if (bluetoothDevice != null) {
            bluetoothDevice.connectGatt(this, false, new C5063b());
        }
    }
}

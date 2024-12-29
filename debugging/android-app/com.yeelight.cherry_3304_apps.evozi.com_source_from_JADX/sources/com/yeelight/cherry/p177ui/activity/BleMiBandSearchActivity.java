package com.yeelight.cherry.p177ui.activity;

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
import com.yeelight.cherry.C11744R$drawable;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p183m.C7186q;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CircleBarView;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: com.yeelight.cherry.ui.activity.BleMiBandSearchActivity */
public class BleMiBandSearchActivity extends BaseActivity implements C9770e, C9768c {

    /* renamed from: b */
    private String f10380b = BleMiBandSearchActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C7186q f10381c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public BluetoothGatt f10382d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<BluetoothDevice> f10383e = null;

    /* renamed from: f */
    private BluetoothManager f10384f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public BluetoothDevice f10385g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C10526e f10386h;

    /* renamed from: i */
    private C10526e f10387i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f10388j;
    /* access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})

    /* renamed from: k */
    public Handler f10389k = new C5016a();
    @BindView(2131296474)
    CircleBarView mCircleBarView;
    @BindView(2131296778)
    ImageView mImgConnectStatus;
    @BindView(2131296807)
    ImageView mImgRefresh;
    @BindView(2131296970)
    LinearLayout mLLConnectStatus;
    @BindView(2131296969)
    LinearLayout mLlConnect;
    @BindView(2131296976)
    LinearLayout mLlSearch;
    @BindView(2131297465)
    TextView mTvCancel;
    @BindView(2131297468)
    TextView mTvConnectStatus;

    /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandSearchActivity$a */
    class C5016a extends Handler {

        /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandSearchActivity$a$a */
        class C5017a extends BluetoothGattCallback {
            C5017a() {
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
                    BluetoothDevice unused = BleMiBandSearchActivity.this.f10385g = bluetoothGatt.getDevice();
                    BleMiBandSearchActivity.this.f10389k.removeMessages(12);
                    BleMiBandSearchActivity.this.f10389k.sendEmptyMessageDelayed(9, 1500);
                }
            }
        }

        C5016a() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 4) {
                if (i != 12) {
                    if (i == 8) {
                        removeMessages(12);
                        if (BleMiBandSearchActivity.this.f10383e == null || BleMiBandSearchActivity.this.f10383e.isEmpty()) {
                            sendEmptyMessageDelayed(9, 1500);
                            return;
                        }
                        BluetoothDevice bluetoothDevice = (BluetoothDevice) BleMiBandSearchActivity.this.f10383e.remove(0);
                        if (bluetoothDevice.getName() != null && bluetoothDevice.getName().contains("MI Band 2")) {
                            sendEmptyMessage(8);
                            return;
                        } else if (!bluetoothDevice.getAddress().equals(BleMiBandSearchActivity.this.f10381c.mo23372G())) {
                            sendEmptyMessageDelayed(12, 6000);
                            bluetoothDevice.connectGatt(BleMiBandSearchActivity.this.getApplicationContext(), false, new C5017a());
                            return;
                        }
                    } else if (i == 9) {
                        if (BleMiBandSearchActivity.this.f10385g == null) {
                            BleMiBandSearchActivity.this.m16027s0();
                            return;
                        } else {
                            BleMiBandSearchActivity.this.mo26145q0();
                            return;
                        }
                    } else {
                        return;
                    }
                }
                sendEmptyMessage(8);
                return;
            }
            BleMiBandSearchActivity.this.f10381c.mo28617A2();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandSearchActivity$b */
    class C5018b extends BluetoothGattCallback {

        /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandSearchActivity$b$a */
        class C5019a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ BluetoothGatt f10393a;

            /* renamed from: b */
            final /* synthetic */ BluetoothGattCharacteristic f10394b;

            C5019a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                this.f10393a = bluetoothGatt;
                this.f10394b = bluetoothGattCharacteristic;
            }

            public void run() {
                if (!BleMiBandSearchActivity.this.f10388j) {
                    this.f10393a.close();
                    return;
                }
                this.f10394b.setValue(new byte[]{3});
                this.f10393a.writeCharacteristic(this.f10394b);
                this.f10393a.close();
                BleMiBandSearchActivity.this.m16026r0();
            }
        }

        C5018b() {
        }

        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            if (i2 == 2) {
                bluetoothGatt.discoverServices();
            }
        }

        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            BluetoothGatt unused = BleMiBandSearchActivity.this.f10382d = bluetoothGatt;
            BluetoothDevice unused2 = BleMiBandSearchActivity.this.f10385g = bluetoothGatt.getDevice();
            for (BluetoothGattService next : bluetoothGatt.getServices()) {
                if ("00001802-0000-1000-8000-00805f9b34fb".equals(next.getUuid().toString())) {
                    for (BluetoothGattCharacteristic next2 : next.getCharacteristics()) {
                        if (next2.getUuid().toString().equals("00002a06-0000-1000-8000-00805f9b34fb")) {
                            next2.setValue(new byte[]{3});
                            bluetoothGatt.writeCharacteristic(next2);
                            new Handler(Looper.getMainLooper()).postDelayed(new C5019a(bluetoothGatt, next2), 2200);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandSearchActivity$c */
    class C5020c implements DialogInterface.OnClickListener {
        C5020c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            BleMiBandSearchActivity.this.f10386h.dismiss();
            BleMiBandSearchActivity.this.f10389k.sendEmptyMessage(8);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandSearchActivity$d */
    class C5021d implements Runnable {
        C5021d() {
        }

        public void run() {
            BleMiBandSearchActivity.this.finish();
        }
    }

    /* renamed from: f0 */
    private void m16020f0() {
        BluetoothDevice bluetoothDevice = this.f10385g;
        String address = bluetoothDevice != null ? bluetoothDevice.getAddress() : null;
        if (address != null) {
            if (this.f10385g.getName() == null || !this.f10385g.getName().toLowerCase().startsWith("mi band 2")) {
                this.f10381c.mo28624n2(address);
            } else {
                this.f10381c.mo28625o2(address, 1);
            }
            this.f10389k.sendEmptyMessageDelayed(4, 2000);
        }
    }

    /* renamed from: g0 */
    private void m16021g0() {
        this.mImgRefresh.setVisibility(4);
        this.mCircleBarView.mo32769k();
        this.mCircleBarView.postDelayed(new C5021d(), 2500);
    }

    /* renamed from: h0 */
    private void m16022h0() {
        this.mLLConnectStatus.setEnabled(true);
        this.mImgRefresh.setVisibility(0);
        this.mCircleBarView.mo32771m();
        this.mTvConnectStatus.setText(2131755876);
        this.mImgConnectStatus.setImageResource(C11744R$drawable.icon_yeelight_mi_band_connect_failed);
    }

    /* renamed from: i0 */
    private void m16023i0() {
        this.mLLConnectStatus.setEnabled(false);
        this.mImgRefresh.setVisibility(8);
        this.mLlSearch.setVisibility(4);
        this.mLlConnect.setVisibility(0);
        this.mTvCancel.setVisibility(4);
        this.mImgConnectStatus.setImageResource(C11744R$drawable.icon_yeelight_mi_band_connecting);
        this.mTvConnectStatus.setText(2131755878);
        this.mCircleBarView.mo32768j();
        this.mCircleBarView.mo32770l(80.0f, 5000);
        m16024j0();
        m16020f0();
    }

    /* renamed from: j0 */
    private void m16024j0() {
        BluetoothGatt bluetoothGatt;
        if (this.f10381c != null && (bluetoothGatt = this.f10382d) != null) {
            bluetoothGatt.disconnect();
            this.f10382d.close();
            this.f10382d = null;
        }
    }

    /* renamed from: p0 */
    private void m16025p0() {
        C4257w.m11947l0().mo23655X(true, false, false);
        List<BluetoothDevice> connectedDevices = this.f10384f.getConnectedDevices(7);
        this.f10383e = connectedDevices;
        Iterator<BluetoothDevice> it = connectedDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            BluetoothDevice next = it.next();
            if (C4257w.m11924Q0(next.getName())) {
                this.f10385g = next;
                break;
            }
        }
        if (this.f10385g != null) {
            this.f10389k.sendEmptyMessageDelayed(9, 1000);
        } else {
            this.f10389k.sendEmptyMessage(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public void m16026r0() {
        if (this.f10388j) {
            if (this.f10386h == null) {
                C10526e.C10531e eVar = new C10526e.C10531e(this);
                eVar.mo33355f(2131755871);
                eVar.mo33354e(C11744R$drawable.icon_yeelight_mi_band_shake);
                eVar.mo33353d(-2, getString(2131755872), new C5020c());
                eVar.mo33353d(-1, getString(2131755873), new C5725j(this));
                this.f10386h = eVar.mo33351b();
            }
            if (!this.f10386h.isShowing()) {
                this.f10386h.show();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public void m16027s0() {
        if (this.f10388j) {
            if (this.f10387i == null) {
                C10526e.C10531e eVar = new C10526e.C10531e(this);
                eVar.mo33357h(2131755881);
                eVar.mo33355f(2131755899);
                eVar.mo33353d(-2, getString(2131755229), new C5745n(this));
                eVar.mo33353d(-1, getString(2131755304), new C5735l(this));
                this.f10387i = eVar.mo33351b();
            }
            if (!this.f10387i.isShowing()) {
                this.f10387i.show();
            }
        }
    }

    /* renamed from: k0 */
    public /* synthetic */ void mo26139k0() {
        this.mTvConnectStatus.setText(2131755877);
        this.mImgConnectStatus.setImageResource(C11744R$drawable.icon_yeelight_mi_band_connect_success);
    }

    /* renamed from: l0 */
    public /* synthetic */ void mo26140l0(int i) {
        if (i == 65536) {
            this.f10389k.removeMessages(4);
            this.f10381c.mo28617A2();
            m16021g0();
        } else if (i == 131072) {
            m16022h0();
        }
    }

    /* renamed from: m0 */
    public /* synthetic */ void mo26141m0(DialogInterface dialogInterface, int i) {
        this.f10386h.dismiss();
        m16023i0();
    }

    /* renamed from: n0 */
    public /* synthetic */ void mo26142n0(DialogInterface dialogInterface, int i) {
        this.f10387i.dismiss();
        finish();
    }

    /* renamed from: o0 */
    public /* synthetic */ void mo26143o0(DialogInterface dialogInterface, int i) {
        this.f10387i.dismiss();
        m16025p0();
    }

    public void onConnectionStateChanged(int i, int i2) {
        if (i2 == 0) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C11748R$layout.activity_mi_band_search);
        ButterKnife.bind((Activity) this);
        C10547m.m25758h(true, this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        findViewById(2131297431).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        this.f10384f = (BluetoothManager) getSystemService("bluetooth");
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(this.f10380b, "Activity has not device id", false);
            finish();
            return;
        }
        this.f10381c = (C7186q) C4257w.m11947l0().mo23668g0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.mCircleBarView.setOnCompleteListener(new C5730k(this));
        m16025p0();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C10526e eVar = this.f10386h;
        if (eVar != null && eVar.isShowing()) {
            this.f10386h.dismiss();
        }
        C10526e eVar2 = this.f10387i;
        if (eVar2 != null && eVar2.isShowing()) {
            this.f10387i.dismiss();
        }
        super.onDestroy();
        this.f10389k.removeCallbacksAndMessages((Object) null);
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f10388j = false;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f10388j = true;
        this.f10381c.mo23365B0(this);
        this.f10381c.mo23358z0(this);
    }

    public void onStatusChange(int i, C6024e eVar) {
        runOnUiThread(new C5740m(this, i));
    }

    @OnClick({2131296772, 2131297465, 2131296970})
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id != 2131296772) {
            if (id == 2131296970) {
                m16023i0();
                return;
            } else if (id != 2131297465) {
                return;
            }
        }
        finish();
    }

    /* renamed from: q0 */
    public void mo26145q0() {
        BluetoothDevice bluetoothDevice = this.f10385g;
        if (bluetoothDevice != null) {
            bluetoothDevice.connectGatt(this, false, new C5018b());
        }
    }
}

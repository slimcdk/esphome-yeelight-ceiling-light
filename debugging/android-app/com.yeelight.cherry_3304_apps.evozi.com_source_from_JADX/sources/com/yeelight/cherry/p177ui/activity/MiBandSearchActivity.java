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
import com.yeelight.yeelib.p150c.p151i.C6029f;
import com.yeelight.yeelib.p150c.p151i.C6046l;
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

/* renamed from: com.yeelight.cherry.ui.activity.MiBandSearchActivity */
public class MiBandSearchActivity extends BaseActivity implements C9770e, C9768c {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final String f11337l = MiBandSearchActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C6029f f11338b;

    /* renamed from: c */
    private BluetoothManager f11339c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List<BluetoothDevice> f11340d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public BluetoothDevice f11341e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public BluetoothGatt f11342f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C10526e f11343g;

    /* renamed from: h */
    private C10526e f11344h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f11345i;

    /* renamed from: j */
    private boolean f11346j;
    /* access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})

    /* renamed from: k */
    public Handler f11347k = new C5433a();
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

    /* renamed from: com.yeelight.cherry.ui.activity.MiBandSearchActivity$a */
    class C5433a extends Handler {

        /* renamed from: com.yeelight.cherry.ui.activity.MiBandSearchActivity$a$a */
        class C5434a extends BluetoothGattCallback {
            C5434a() {
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
                    BluetoothDevice unused = MiBandSearchActivity.this.f11341e = bluetoothGatt.getDevice();
                    MiBandSearchActivity.this.f11347k.removeMessages(12);
                    MiBandSearchActivity.this.f11347k.sendEmptyMessageDelayed(9, 1500);
                }
            }
        }

        C5433a() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 4) {
                if (i != 12) {
                    if (i == 8) {
                        removeMessages(12);
                        if (MiBandSearchActivity.this.f11340d == null || MiBandSearchActivity.this.f11340d.isEmpty()) {
                            sendEmptyMessageDelayed(9, 1500);
                            return;
                        }
                        BluetoothDevice bluetoothDevice = (BluetoothDevice) MiBandSearchActivity.this.f11340d.remove(0);
                        if (bluetoothDevice.getName() != null && bluetoothDevice.getName().contains("MI Band 2")) {
                            sendEmptyMessage(8);
                            return;
                        } else if (bluetoothDevice.getAddress().equals(MiBandSearchActivity.this.f11338b.mo23372G())) {
                            sendEmptyMessage(8);
                            return;
                        } else {
                            sendEmptyMessageDelayed(12, 6000);
                            bluetoothDevice.connectGatt(MiBandSearchActivity.this.getApplicationContext(), false, new C5434a());
                            return;
                        }
                    } else if (i == 9) {
                        if (MiBandSearchActivity.this.f11341e != null) {
                            MiBandSearchActivity.this.mo26685r0();
                            return;
                        }
                    } else {
                        return;
                    }
                }
                MiBandSearchActivity.this.m16714t0();
                return;
            }
            MiBandSearchActivity.this.f11338b.mo27736e2();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MiBandSearchActivity$b */
    class C5435b extends BluetoothGattCallback {

        /* renamed from: com.yeelight.cherry.ui.activity.MiBandSearchActivity$b$a */
        class C5436a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ BluetoothGatt f11351a;

            /* renamed from: b */
            final /* synthetic */ BluetoothGattCharacteristic f11352b;

            C5436a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                this.f11351a = bluetoothGatt;
                this.f11352b = bluetoothGattCharacteristic;
            }

            public void run() {
                if (!MiBandSearchActivity.this.f11345i) {
                    this.f11351a.close();
                    return;
                }
                this.f11352b.setValue(new byte[]{3});
                this.f11351a.writeCharacteristic(this.f11352b);
                this.f11351a.close();
                MiBandSearchActivity.this.m16713s0();
            }
        }

        C5435b() {
        }

        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            if (i2 == 2) {
                bluetoothGatt.discoverServices();
            }
        }

        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            BluetoothGatt unused = MiBandSearchActivity.this.f11342f = bluetoothGatt;
            BluetoothDevice unused2 = MiBandSearchActivity.this.f11341e = bluetoothGatt.getDevice();
            for (BluetoothGattService next : bluetoothGatt.getServices()) {
                String uuid = next.getUuid().toString();
                String unused3 = MiBandSearchActivity.f11337l;
                "oServicesDiscovered serviceId : " + uuid;
                if ("00001802-0000-1000-8000-00805f9b34fb".equals(uuid)) {
                    for (BluetoothGattCharacteristic next2 : next.getCharacteristics()) {
                        if (next2.getUuid().toString().equals("00002a06-0000-1000-8000-00805f9b34fb")) {
                            next2.setValue(new byte[]{3});
                            bluetoothGatt.writeCharacteristic(next2);
                            new Handler(Looper.getMainLooper()).postDelayed(new C5436a(bluetoothGatt, next2), 2200);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MiBandSearchActivity$c */
    class C5437c implements DialogInterface.OnClickListener {
        C5437c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            MiBandSearchActivity.this.f11343g.dismiss();
            MiBandSearchActivity.this.f11347k.sendEmptyMessage(8);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MiBandSearchActivity$d */
    class C5438d implements Runnable {
        C5438d() {
        }

        public void run() {
            MiBandSearchActivity.this.finish();
        }
    }

    /* renamed from: g0 */
    private void m16708g0() {
        BluetoothDevice bluetoothDevice = this.f11341e;
        String address = bluetoothDevice != null ? bluetoothDevice.getAddress() : null;
        if (address != null) {
            this.f11338b.mo27732Y1(address);
            this.f11338b.mo27734a2(true);
            this.f11347k.sendEmptyMessageDelayed(4, 2000);
        }
    }

    /* renamed from: h0 */
    private void m16709h0() {
        this.f11346j = true;
        this.mImgRefresh.setVisibility(4);
        this.mTvConnectStatus.setText(2131755878);
        this.mCircleBarView.mo32769k();
        this.mCircleBarView.postDelayed(new C5438d(), 2500);
    }

    /* renamed from: i0 */
    private void m16710i0() {
        if (!this.f11346j) {
            this.mLLConnectStatus.setEnabled(true);
            this.mImgRefresh.setVisibility(0);
            this.mCircleBarView.mo32771m();
            this.mTvConnectStatus.setText(2131755876);
            this.mImgConnectStatus.setImageResource(C11744R$drawable.icon_yeelight_mi_band_connect_failed);
        }
    }

    /* renamed from: j0 */
    private void m16711j0() {
        this.mLLConnectStatus.setEnabled(false);
        this.mImgRefresh.setVisibility(8);
        this.mLlSearch.setVisibility(4);
        this.mLlConnect.setVisibility(0);
        this.mTvCancel.setVisibility(4);
        this.mImgConnectStatus.setImageResource(C11744R$drawable.icon_yeelight_mi_band_connecting);
        this.mTvConnectStatus.setText(2131755878);
        this.mCircleBarView.mo32768j();
        this.mCircleBarView.mo32770l(80.0f, 5000);
        m16712k0();
        m16708g0();
    }

    /* renamed from: k0 */
    private void m16712k0() {
        BluetoothGatt bluetoothGatt;
        if (this.f11338b != null && (bluetoothGatt = this.f11342f) != null) {
            bluetoothGatt.disconnect();
            this.f11342f.close();
            this.f11342f = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public void m16713s0() {
        if (this.f11345i) {
            if (this.f11343g == null) {
                C10526e.C10531e eVar = new C10526e.C10531e(this);
                eVar.mo33355f(2131755871);
                eVar.mo33354e(C11744R$drawable.icon_yeelight_mi_band_shake);
                eVar.mo33353d(-2, getString(2131755872), new C5437c());
                eVar.mo33353d(-1, getString(2131755873), new C5722i1(this));
                this.f11343g = eVar.mo33351b();
            }
            if (!this.f11343g.isShowing()) {
                this.f11343g.show();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public void m16714t0() {
        if (this.f11345i) {
            if (this.f11344h == null) {
                C10526e.C10531e eVar = new C10526e.C10531e(this);
                eVar.mo33357h(2131755881);
                eVar.mo33355f(2131755899);
                eVar.mo33353d(-2, getString(2131755229), new C5727j1(this));
                eVar.mo33353d(-1, getString(2131755304), new C5717h1(this));
                this.f11344h = eVar.mo33351b();
            }
            if (!this.f11344h.isShowing()) {
                this.f11344h.show();
            }
        }
    }

    /* renamed from: l0 */
    public /* synthetic */ void mo26678l0() {
        this.mTvConnectStatus.setText(2131755877);
        this.mImgConnectStatus.setImageResource(C11744R$drawable.icon_yeelight_mi_band_connect_success);
    }

    /* renamed from: m0 */
    public /* synthetic */ void mo26679m0(int i, C6024e eVar) {
        "read miband type = " + i + "    status = " + eVar;
        if (i == 8192) {
            this.f11347k.removeMessages(4);
            C6046l y = eVar.mo27724y();
            if (y == null || y.mo27797a() == null) {
                return;
            }
        } else if (i == 65536) {
            this.f11347k.removeMessages(4);
            this.f11338b.mo27736e2();
        } else if (i == 131072) {
            m16710i0();
            return;
        } else if (i == 16384) {
            this.f11347k.postDelayed(new C5769r3(this), 1000);
            return;
        } else if (i == 32768) {
            this.f11338b.mo27736e2();
            return;
        } else if (i != 4096) {
            return;
        }
        m16709h0();
    }

    /* renamed from: n0 */
    public /* synthetic */ void mo26680n0(DialogInterface dialogInterface, int i) {
        this.f11343g.dismiss();
        m16711j0();
    }

    /* renamed from: o0 */
    public /* synthetic */ void mo26681o0(DialogInterface dialogInterface, int i) {
        this.f11344h.dismiss();
        finish();
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
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f11337l, "Activity has not device id", false);
            finish();
            return;
        }
        this.f11338b = (C6029f) C4257w.m11947l0().mo23651L0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        C10547m.m25758h(true, this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        findViewById(2131297431).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        this.f11339c = (BluetoothManager) getSystemService("bluetooth");
        this.mCircleBarView.setOnCompleteListener(new C5732k1(this));
        mo26684q0();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C10526e eVar = this.f11343g;
        if (eVar != null && eVar.isShowing()) {
            this.f11343g.dismiss();
        }
        C10526e eVar2 = this.f11344h;
        if (eVar2 != null && eVar2.isShowing()) {
            this.f11344h.dismiss();
        }
        super.onDestroy();
        this.f11347k.removeCallbacksAndMessages((Object) null);
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f11345i = true;
        this.f11338b.mo23365B0(this);
        this.f11338b.mo23358z0(this);
    }

    public void onStatusChange(int i, C6024e eVar) {
        runOnUiThread(new C5712g1(this, i, eVar));
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f11345i = false;
        this.f11338b.mo23400W0(this);
        this.f11338b.mo23319V0(this);
    }

    @OnClick({2131296772, 2131297465, 2131296970})
    public void onViewClicked(View view) {
        int id = view.getId();
        if (id != 2131296772) {
            if (id == 2131296970) {
                m16711j0();
                return;
            } else if (id != 2131297465) {
                return;
            }
        }
        finish();
    }

    /* renamed from: p0 */
    public /* synthetic */ void mo26683p0(DialogInterface dialogInterface, int i) {
        this.f11344h.dismiss();
        mo26684q0();
    }

    /* renamed from: q0 */
    public void mo26684q0() {
        C4257w.m11947l0().mo23655X(true, false, false);
        List<BluetoothDevice> connectedDevices = this.f11339c.getConnectedDevices(7);
        this.f11340d = connectedDevices;
        Iterator<BluetoothDevice> it = connectedDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            BluetoothDevice next = it.next();
            if (C4257w.m11924Q0(next.getName())) {
                this.f11341e = next;
                break;
            }
        }
        if (this.f11341e != null) {
            this.f11347k.sendEmptyMessageDelayed(9, 1000);
        } else {
            this.f11347k.sendEmptyMessage(8);
        }
    }

    /* renamed from: r0 */
    public void mo26685r0() {
        BluetoothDevice bluetoothDevice = this.f11341e;
        if (bluetoothDevice != null) {
            bluetoothDevice.connectGatt(this, false, new C5435b());
        }
    }
}

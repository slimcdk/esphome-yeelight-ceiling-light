package com.yeelight.cherry.p141ui.activity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.fragment.C5998i;
import com.yeelight.cherry.p141ui.fragment.C6000j;
import com.yeelight.cherry.p141ui.fragment.C6002k;
import com.yeelight.cherry.p141ui.fragment.MIBandControlFragment;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p207s3.C10333b;
import p207s3.C10343e;
import p237z3.C12143c;
import p237z3.C12145e;

/* renamed from: com.yeelight.cherry.ui.activity.WifiMiBandActivity */
public class WifiMiBandActivity extends MiBandBaseActivity implements C12145e, C12143c {

    /* renamed from: q */
    public static final String f11493q = "WifiMiBandActivity";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C10343e f11494a;

    /* renamed from: b */
    private BluetoothManager f11495b;

    /* renamed from: c */
    private FragmentManager f11496c;

    /* renamed from: d */
    private FragmentTransaction f11497d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<BluetoothDevice> f11498e = null;

    /* renamed from: f */
    public C10333b f11499f = null;

    /* renamed from: g */
    public BluetoothDevice f11500g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C5998i f11501h;

    /* renamed from: i */
    private C6002k f11502i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C6000j f11503j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public MIBandControlFragment f11504k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Fragment f11505l;

    /* renamed from: m */
    public List<String> f11506m = null;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f11507n = false;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Handler f11508o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public BluetoothGatt f11509p;

    /* renamed from: com.yeelight.cherry.ui.activity.WifiMiBandActivity$a */
    class C5715a implements Runnable {
        C5715a() {
        }

        public void run() {
            WifiMiBandActivity.this.mo30219Y(true);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.WifiMiBandActivity$b */
    class C5716b extends Handler {

        /* renamed from: com.yeelight.cherry.ui.activity.WifiMiBandActivity$b$a */
        class C5717a extends BluetoothGattCallback {
            C5717a() {
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
                    WifiMiBandActivity.this.f11500g = bluetoothGatt.getDevice();
                    WifiMiBandActivity.this.f11508o.removeMessages(12);
                    WifiMiBandActivity.this.f11508o.sendEmptyMessageDelayed(9, 1500);
                }
            }
        }

        C5716b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x008c, code lost:
            r7.f11511a.mo30216V(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ac, code lost:
            r7.f11511a.f11506m = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d8, code lost:
            r7.f11511a.f11499f.mo41884e2();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r8) {
            /*
                r7 = this;
                int r0 = r8.what
                r1 = 8
                r2 = 12
                if (r0 == r2) goto L_0x0109
                r3 = 0
                r4 = 1
                r5 = 4
                r6 = 0
                switch(r0) {
                    case 0: goto L_0x00e0;
                    case 1: goto L_0x00d0;
                    case 2: goto L_0x00cc;
                    case 3: goto L_0x00b1;
                    case 4: goto L_0x00d8;
                    case 5: goto L_0x00a0;
                    case 6: goto L_0x0093;
                    case 7: goto L_0x008c;
                    case 8: goto L_0x0021;
                    case 9: goto L_0x0011;
                    default: goto L_0x000f;
                }
            L_0x000f:
                goto L_0x010c
            L_0x0011:
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.WifiMiBandActivity.this
                android.bluetooth.BluetoothDevice r0 = r8.f11500g
                if (r0 != 0) goto L_0x001c
                r8.mo30218X()
                goto L_0x010c
            L_0x001c:
                r8.mo30945q0()
                goto L_0x010c
            L_0x0021:
                r7.removeMessages(r2)
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.WifiMiBandActivity.this
                java.util.List r8 = r8.f11498e
                if (r8 == 0) goto L_0x0083
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.WifiMiBandActivity.this
                java.util.List r8 = r8.f11498e
                boolean r8 = r8.isEmpty()
                if (r8 != 0) goto L_0x0083
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.WifiMiBandActivity.this
                java.util.List r8 = r8.f11498e
                java.lang.Object r8 = r8.remove(r6)
                android.bluetooth.BluetoothDevice r8 = (android.bluetooth.BluetoothDevice) r8
                java.lang.String r0 = r8.getName()
                if (r0 == 0) goto L_0x005a
                java.lang.String r0 = r8.getName()
                java.lang.String r3 = "MI Band 2"
                boolean r0 = r0.contains(r3)
                if (r0 == 0) goto L_0x005a
                r7.sendEmptyMessage(r1)
                return
            L_0x005a:
                java.lang.String r0 = r8.getAddress()
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r3 = com.yeelight.cherry.p141ui.activity.WifiMiBandActivity.this
                s3.b r3 = r3.f11499f
                java.lang.String r3 = r3.mo23185G()
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L_0x006e
                goto L_0x0109
            L_0x006e:
                r0 = 6000(0x1770, double:2.9644E-320)
                r7.sendEmptyMessageDelayed(r2, r0)
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r0 = com.yeelight.cherry.p141ui.activity.WifiMiBandActivity.this
                android.content.Context r0 = r0.getApplicationContext()
                com.yeelight.cherry.ui.activity.WifiMiBandActivity$b$a r1 = new com.yeelight.cherry.ui.activity.WifiMiBandActivity$b$a
                r1.<init>()
                r8.connectGatt(r0, r6, r1)
                goto L_0x010c
            L_0x0083:
                r8 = 9
                r0 = 1500(0x5dc, double:7.41E-321)
                r7.sendEmptyMessageDelayed(r8, r0)
                goto L_0x010c
            L_0x008c:
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.WifiMiBandActivity.this
                r8.mo30216V(r6)
                goto L_0x010c
            L_0x0093:
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.WifiMiBandActivity.this
                r8.mo30216V(r6)
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.WifiMiBandActivity.this
                s3.b r8 = r8.f11499f
                r8.mo41884e2()
                goto L_0x00ac
            L_0x00a0:
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.WifiMiBandActivity.this
                r8.mo30216V(r6)
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.WifiMiBandActivity.this
                s3.b r8 = r8.f11499f
                r8.mo41882a2(r6)
            L_0x00ac:
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.WifiMiBandActivity.this
                r8.f11506m = r3
                goto L_0x010c
            L_0x00b1:
                r7.removeMessages(r5)
                int r8 = r8.arg1
                if (r8 != r4) goto L_0x00b9
                goto L_0x00ba
            L_0x00b9:
                r4 = 0
            L_0x00ba:
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.WifiMiBandActivity.this
                com.yeelight.cherry.ui.fragment.MIBandControlFragment r8 = r8.f11504k
                if (r8 == 0) goto L_0x010c
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.WifiMiBandActivity.this
                com.yeelight.cherry.ui.fragment.MIBandControlFragment r8 = r8.f11504k
                r8.mo31258f(r4)
                goto L_0x010c
            L_0x00cc:
                r7.removeMessages(r5)
                goto L_0x010c
            L_0x00d0:
                r7.removeMessages(r5)
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.WifiMiBandActivity.this
                r8.mo30216V(r4)
            L_0x00d8:
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.WifiMiBandActivity.this
                s3.b r8 = r8.f11499f
                r8.mo41884e2()
                goto L_0x010c
            L_0x00e0:
                r8 = 7
                r7.removeMessages(r8)
                r7.removeMessages(r5)
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.WifiMiBandActivity.this
                java.util.List<java.lang.String> r8 = r8.f11506m
                if (r8 == 0) goto L_0x00fa
                boolean r8 = r8.isEmpty()
                if (r8 == 0) goto L_0x00f4
                goto L_0x00fa
            L_0x00f4:
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.WifiMiBandActivity.this
                r8.mo30216V(r4)
                goto L_0x010c
            L_0x00fa:
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.WifiMiBandActivity.this
                android.app.Fragment r8 = r8.f11505l
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r0 = com.yeelight.cherry.p141ui.activity.WifiMiBandActivity.this
                com.yeelight.cherry.ui.fragment.j r0 = r0.f11503j
                if (r8 == r0) goto L_0x010c
                goto L_0x008c
            L_0x0109:
                r7.sendEmptyMessage(r1)
            L_0x010c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.WifiMiBandActivity.C5716b.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.WifiMiBandActivity$c */
    class C5718c extends BluetoothGattCallback {

        /* renamed from: com.yeelight.cherry.ui.activity.WifiMiBandActivity$c$a */
        class C5719a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ BluetoothGatt f11514a;

            /* renamed from: b */
            final /* synthetic */ BluetoothGattCharacteristic f11515b;

            C5719a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                this.f11514a = bluetoothGatt;
                this.f11515b = bluetoothGattCharacteristic;
            }

            public void run() {
                if (WifiMiBandActivity.this.f11507n) {
                    this.f11515b.setValue(new byte[]{1});
                    this.f11514a.writeCharacteristic(this.f11515b);
                }
                this.f11514a.close();
            }
        }

        C5718c() {
        }

        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            if (i2 == 2) {
                bluetoothGatt.discoverServices();
            } else {
                WifiMiBandActivity.this.f11508o.sendEmptyMessage(11);
            }
        }

        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            BluetoothGatt unused = WifiMiBandActivity.this.f11509p = bluetoothGatt;
            WifiMiBandActivity.this.f11500g = bluetoothGatt.getDevice();
            for (BluetoothGattService characteristics : bluetoothGatt.getServices()) {
                for (BluetoothGattCharacteristic next : characteristics.getCharacteristics()) {
                    if (next.getUuid().toString().equals("00002a06-0000-1000-8000-00805f9b34fb")) {
                        next.setValue(new byte[]{1});
                        bluetoothGatt.writeCharacteristic(next);
                        WifiMiBandActivity.this.f11508o.sendEmptyMessage(10);
                        new Handler(Looper.getMainLooper()).postDelayed(new C5719a(bluetoothGatt, next), 2200);
                    }
                }
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.WifiMiBandActivity$d */
    class C5720d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f11517a;

        /* renamed from: b */
        final /* synthetic */ DeviceStatusBase f11518b;

        /* renamed from: com.yeelight.cherry.ui.activity.WifiMiBandActivity$d$a */
        class C5721a implements Runnable {
            C5721a() {
            }

            public void run() {
                WifiMiBandActivity.this.f11499f.mo41884e2();
            }
        }

        C5720d(int i, DeviceStatusBase deviceStatusBase) {
            this.f11517a = i;
            this.f11518b = deviceStatusBase;
        }

        public void run() {
            int i = this.f11517a;
            if (i == 8192) {
                String str = WifiMiBandActivity.f11493q;
                StringBuilder sb = new StringBuilder();
                sb.append("read miband = ");
                sb.append(this.f11518b.mo31625y());
                WifiMiBandActivity.this.f11508o.removeMessages(7);
                WifiMiBandActivity.this.f11508o.removeMessages(4);
                C10343e unused = WifiMiBandActivity.this.f11494a = this.f11518b.mo31625y();
                if (WifiMiBandActivity.this.f11494a != null && WifiMiBandActivity.this.f11494a.mo41919a() != null) {
                    WifiMiBandActivity.this.mo30216V(true);
                } else if (WifiMiBandActivity.this.f11505l != WifiMiBandActivity.this.f11503j && WifiMiBandActivity.this.f11505l != WifiMiBandActivity.this.f11501h) {
                    WifiMiBandActivity.this.mo30216V(false);
                    if (WifiMiBandActivity.this.f11504k != null) {
                        WifiMiBandActivity.this.f11504k.mo31258f(false);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            } else {
                if (i == 65536) {
                    WifiMiBandActivity.this.f11508o.removeMessages(4);
                    WifiMiBandActivity.this.mo30216V(true);
                } else if (i != 131072) {
                    if (i == 16384) {
                        WifiMiBandActivity.this.mo30216V(false);
                        WifiMiBandActivity.this.f11508o.postDelayed(new C5721a(), 1000);
                        return;
                    } else if (i != 32768) {
                        if (i != 4096) {
                            return;
                        }
                    }
                } else {
                    return;
                }
                WifiMiBandActivity.this.f11499f.mo41884e2();
                return;
            }
            WifiMiBandActivity.this.f11504k.mo31258f(this.f11518b.mo31578a0());
        }
    }

    public WifiMiBandActivity() {
        new C5715a();
        this.f11508o = new C5716b();
    }

    /* renamed from: r0 */
    private void m17170r0() {
        this.f11494a = this.f11499f.mo23221d0().mo31625y();
        this.f11504k.mo31258f(this.f11499f.mo23221d0().mo31578a0());
        if (this.f11505l == this.f11504k) {
            C10343e eVar = this.f11494a;
            mo30216V((eVar == null || eVar.mo41919a() == null) ? false : true);
        }
    }

    /* renamed from: V */
    public void mo30216V(boolean z) {
        if (this.f11507n) {
            FragmentTransaction beginTransaction = this.f11496c.beginTransaction();
            this.f11497d = beginTransaction;
            beginTransaction.setCustomAnimations(2130837504, 2130837505);
            this.f11504k.mo31259g(z);
            this.f11504k.mo31260h();
            this.f11497d.replace(C12225R$id.fragment_container, this.f11504k);
            this.f11505l = this.f11504k;
            this.f11497d.commit();
        }
    }

    /* renamed from: W */
    public void mo30217W() {
        if (this.f11507n) {
            FragmentTransaction beginTransaction = this.f11496c.beginTransaction();
            this.f11497d = beginTransaction;
            beginTransaction.setCustomAnimations(2130837504, 2130837505);
            this.f11497d.replace(C12225R$id.fragment_container, this.f11501h);
            this.f11505l = this.f11501h;
            this.f11497d.commit();
        }
    }

    /* renamed from: X */
    public void mo30218X() {
        mo30944p0(false, true);
    }

    /* renamed from: Y */
    public void mo30219Y(boolean z) {
        mo30944p0(z, false);
    }

    /* renamed from: Z */
    public boolean mo30220Z(String str) {
        if (str == null) {
            BluetoothDevice bluetoothDevice = this.f11500g;
            if (bluetoothDevice == null) {
                return false;
            }
            str = bluetoothDevice.getAddress();
        }
        this.f11499f.mo41880Y1(str);
        this.f11499f.mo41882a2(true);
        this.f11508o.sendEmptyMessageDelayed(4, 2000);
        return true;
    }

    /* renamed from: a0 */
    public void mo30221a0() {
        BluetoothGatt bluetoothGatt;
        if (this.f11499f != null && (bluetoothGatt = this.f11509p) != null) {
            bluetoothGatt.disconnect();
            this.f11509p.close();
            this.f11509p = null;
        }
    }

    /* renamed from: b0 */
    public void mo30222b0(boolean z) {
        this.f11499f.mo41882a2(z);
    }

    public void back(View view) {
        finish();
    }

    /* renamed from: c0 */
    public void mo30224c0() {
        List<BluetoothDevice> connectedDevices = this.f11495b.getConnectedDevices(7);
        this.f11498e = connectedDevices;
        Iterator<BluetoothDevice> it = connectedDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            BluetoothDevice next = it.next();
            if (next.getAddress().startsWith("88:0F:") || next.getAddress().startsWith("C8:0F") || (next.getName() != null && (next.getName().startsWith("MI") || next.getName().startsWith("Amazfit")))) {
                this.f11500g = next;
            }
        }
        if (this.f11500g != null) {
            this.f11508o.sendEmptyMessageDelayed(9, 1000);
        } else {
            this.f11508o.sendEmptyMessage(8);
        }
    }

    /* renamed from: d0 */
    public void mo30225d0() {
        BluetoothDevice bluetoothDevice = this.f11500g;
        if (bluetoothDevice != null) {
            bluetoothDevice.connectGatt(this, false, new C5718c());
        }
    }

    /* renamed from: e0 */
    public void mo30226e0() {
        C10343e eVar = this.f11494a;
        if (eVar != null && eVar.mo41919a() != null) {
            this.f11499f.mo41886h2(this.f11494a.mo41919a(), this.f11494a.mo41921c(), 8193);
        }
    }

    public void onConnectionStateChanged(int i, int i2) {
        if (i2 == 0) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().addFlags(67108864);
        }
        setContentView(C12228R$layout.activity_cherry_mi_band);
        getWindow().getDecorView().setBackgroundResource(2131230892);
        BluetoothManager bluetoothManager = (BluetoothManager) getSystemService("bluetooth");
        this.f11495b = bluetoothManager;
        bluetoothManager.getAdapter();
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f11493q, "Activity has not device id", false);
            finish();
            return;
        }
        C10333b bVar = (C10333b) YeelightDeviceManager.m7800o0().mo23274P0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f11499f = bVar;
        if (bVar == null || !bVar.mo23145k0()) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        this.f11496c = getFragmentManager();
        this.f11503j = new C6000j();
        this.f11502i = new C6002k();
        this.f11504k = new MIBandControlFragment();
        Bundle bundle2 = new Bundle();
        if (this.f11499f.mo23188I().mo31880a().equals("yeelink.light.ceiling1") || this.f11499f.mo23188I().mo31880a().equals("yeelink.light.ceiling2") || this.f11499f.mo23188I().mo31880a().equals("yeelink.light.ceiling6") || this.f11499f.mo23188I().mo31880a().equals("yeelink.light.ceiling7") || this.f11499f.mo23188I().mo31880a().equals("yeelink.light.ceiling11") || this.f11499f.mo23188I().mo31880a().equals("yeelink.light.ceiling12") || this.f11499f.mo23188I().mo31880a().equals("yeelink.light.ceiling13") || this.f11499f.mo23188I().mo31880a().equals("yeelink.light.ceiling14") || this.f11499f.mo23188I().mo31880a().equals("yeelink.light.ceiling15") || this.f11499f.mo23188I().mo31880a().equals("yeelink.light.ceiling16") || this.f11499f.mo23188I().mo31880a().equals("yeelink.light.ceiling17") || this.f11499f.mo23188I().mo31880a().equals("yeelink.light.ceiling18") || this.f11499f.mo23188I().mo31880a().equals("yeelink.light.ceiling19") || this.f11499f.mo23188I().mo31880a().equals("yeelink.light.ceiling20") || this.f11499f.mo23188I().mo31880a().equals("yeelink.light.ceiling21") || this.f11499f.mo23188I().mo31880a().equals("yeelink.light.ceiling22") || this.f11499f.mo23188I().mo31880a().equals("yeelink.light.ceiling23") || this.f11499f.mo23188I().mo31880a().equals("yeelink.light.ceiling24") || this.f11499f.mo23188I().mo31880a().equals("yeelink.light.ceil30") || this.f11499f.mo23188I().mo31880a().equals("yeelink.light.ceil31") || this.f11499f.mo23188I().mo31880a().equals("yeelink.light.ceil32") || this.f11499f.mo23188I().mo31880a().equals("yeelink.light.ceil35") || this.f11499f.mo23188I().mo31880a().equals("yeelink.light.ceile") || this.f11499f.mo23188I().mo31880a().equals("yilai.light.ceiling1") || this.f11499f.mo23188I().mo31880a().equals("yilai.light.ceiling2") || this.f11499f.mo23188I().mo31880a().equals("yilai.light.ceiling3") || this.f11499f.mo23188I().mo31880a().equals("yeelink.light.ceiling8")) {
            i = 2131231832;
        } else {
            if (this.f11499f.mo23188I().mo31880a().equals("yeelink.light.ceiling3") || this.f11499f.mo23188I().mo31880a().equals("yeelink.light.ceiling4") || this.f11499f.mo23188I().mo31880a().equals("yeelink.light.ceiling10") || this.f11499f.mo23188I().mo31880a().equals("yeelink.light.ceiling5")) {
                i = 2131231830;
            }
            this.f11504k.setArguments(bundle2);
            this.f11501h = new C5998i();
            this.f11505l = this.f11504k;
            m17170r0();
        }
        bundle2.putInt("middleImgRes", i);
        this.f11504k.setArguments(bundle2);
        this.f11501h = new C5998i();
        this.f11505l = this.f11504k;
        m17170r0();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f11507n = false;
        C10333b bVar = this.f11499f;
        if (bVar != null) {
            bVar.mo23213W0(this);
            this.f11499f.mo23133V0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f11499f.mo23171z0(this);
        this.f11499f.mo23178B0(this);
        if (this.f11499f != null) {
            this.f11507n = true;
            m17170r0();
            return;
        }
        finish();
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        runOnUiThread(new C5720d(i, deviceStatusBase));
    }

    /* renamed from: p0 */
    public void mo30944p0(boolean z, boolean z2) {
        if (this.f11507n) {
            this.f11497d = this.f11496c.beginTransaction();
            Fragment fragment = this.f11505l;
            C6000j jVar = this.f11503j;
            if (fragment != jVar) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("isNoDevice", z2);
                this.f11503j.setArguments(bundle);
                this.f11497d.setCustomAnimations(2130837504, 2130837505);
                this.f11497d.replace(C12225R$id.fragment_container, this.f11503j);
                this.f11505l = this.f11503j;
                if (z) {
                    mo30224c0();
                }
                this.f11497d.commit();
            } else if (!jVar.isHidden()) {
                this.f11503j.mo31325b(z2 ? 1 : 0);
            }
        }
    }

    /* renamed from: q0 */
    public void mo30945q0() {
        if (this.f11507n) {
            FragmentTransaction beginTransaction = this.f11496c.beginTransaction();
            this.f11497d = beginTransaction;
            beginTransaction.setCustomAnimations(2130837504, 2130837505);
            this.f11497d.replace(C12225R$id.fragment_container, this.f11502i);
            this.f11505l = this.f11502i;
            this.f11497d.commit();
        }
    }
}

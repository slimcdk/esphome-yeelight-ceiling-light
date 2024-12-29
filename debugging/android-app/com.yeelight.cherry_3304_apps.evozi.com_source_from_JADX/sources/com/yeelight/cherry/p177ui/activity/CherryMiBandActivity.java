package com.yeelight.cherry.p177ui.activity;

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
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.fragment.C5951x;
import com.yeelight.cherry.p177ui.fragment.C5953y;
import com.yeelight.cherry.p177ui.fragment.C5955z;
import com.yeelight.cherry.p177ui.fragment.MIBandControlFragment;
import com.yeelight.yeelib.device.models.C7616d;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p183m.C7186q;
import com.yeelight.yeelib.p150c.p184n.C7551c;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.utils.C4308b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.yeelight.cherry.ui.activity.CherryMiBandActivity */
public class CherryMiBandActivity extends MiBandBaseActivity implements C9770e, C9768c {

    /* renamed from: s */
    public static final String f10436s = CherryMiBandActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C7616d f10437b;

    /* renamed from: c */
    private BluetoothManager f10438c;

    /* renamed from: d */
    private FragmentManager f10439d;

    /* renamed from: e */
    private FragmentTransaction f10440e;

    /* renamed from: f */
    private List<Map<String, Object>> f10441f = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public List<BluetoothDevice> f10442g = null;

    /* renamed from: h */
    public C7186q f10443h;

    /* renamed from: i */
    public BluetoothDevice f10444i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C5951x f10445j;

    /* renamed from: k */
    private C5955z f10446k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C5953y f10447l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public MIBandControlFragment f10448m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Fragment f10449n;

    /* renamed from: o */
    public List<String> f10450o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f10451p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Handler f10452q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public BluetoothGatt f10453r;

    /* renamed from: com.yeelight.cherry.ui.activity.CherryMiBandActivity$a */
    class C5038a extends Handler {

        /* renamed from: com.yeelight.cherry.ui.activity.CherryMiBandActivity$a$a */
        class C5039a extends BluetoothGattCallback {
            C5039a() {
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
                    CherryMiBandActivity.this.f10444i = bluetoothGatt.getDevice();
                    CherryMiBandActivity.this.f10452q.removeMessages(12);
                    CherryMiBandActivity.this.f10452q.sendEmptyMessageDelayed(9, 1500);
                }
            }
        }

        C5038a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x008c, code lost:
            r7.f10454a.mo26166V(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ac, code lost:
            r7.f10454a.f10450o = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e3, code lost:
            r7.f10454a.f10443h.mo28617A2();
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
                if (r0 == r2) goto L_0x0115
                r3 = 0
                r4 = 1
                r5 = 4
                r6 = 0
                switch(r0) {
                    case 0: goto L_0x00eb;
                    case 1: goto L_0x00db;
                    case 2: goto L_0x00cc;
                    case 3: goto L_0x00b1;
                    case 4: goto L_0x00e3;
                    case 5: goto L_0x00a0;
                    case 6: goto L_0x0093;
                    case 7: goto L_0x008c;
                    case 8: goto L_0x0021;
                    case 9: goto L_0x0011;
                    default: goto L_0x000f;
                }
            L_0x000f:
                goto L_0x0118
            L_0x0011:
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.CherryMiBandActivity.this
                android.bluetooth.BluetoothDevice r0 = r8.f10444i
                if (r0 != 0) goto L_0x001c
                r8.mo26168X()
                goto L_0x0118
            L_0x001c:
                r8.mo26179q0()
                goto L_0x0118
            L_0x0021:
                r7.removeMessages(r2)
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.CherryMiBandActivity.this
                java.util.List r8 = r8.f10442g
                if (r8 == 0) goto L_0x0083
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.CherryMiBandActivity.this
                java.util.List r8 = r8.f10442g
                boolean r8 = r8.isEmpty()
                if (r8 != 0) goto L_0x0083
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.CherryMiBandActivity.this
                java.util.List r8 = r8.f10442g
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
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r3 = com.yeelight.cherry.p177ui.activity.CherryMiBandActivity.this
                com.yeelight.yeelib.c.m.q r3 = r3.f10443h
                java.lang.String r3 = r3.mo23372G()
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L_0x006e
                goto L_0x0115
            L_0x006e:
                r0 = 6000(0x1770, double:2.9644E-320)
                r7.sendEmptyMessageDelayed(r2, r0)
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r0 = com.yeelight.cherry.p177ui.activity.CherryMiBandActivity.this
                android.content.Context r0 = r0.getApplicationContext()
                com.yeelight.cherry.ui.activity.CherryMiBandActivity$a$a r1 = new com.yeelight.cherry.ui.activity.CherryMiBandActivity$a$a
                r1.<init>()
                r8.connectGatt(r0, r6, r1)
                goto L_0x0118
            L_0x0083:
                r8 = 9
                r0 = 1500(0x5dc, double:7.41E-321)
                r7.sendEmptyMessageDelayed(r8, r0)
                goto L_0x0118
            L_0x008c:
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.CherryMiBandActivity.this
                r8.mo26166V(r6)
                goto L_0x0118
            L_0x0093:
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.CherryMiBandActivity.this
                r8.mo26166V(r6)
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.CherryMiBandActivity.this
                com.yeelight.yeelib.c.m.q r8 = r8.f10443h
                r8.mo28617A2()
                goto L_0x00ac
            L_0x00a0:
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.CherryMiBandActivity.this
                r8.mo26166V(r6)
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.CherryMiBandActivity.this
                com.yeelight.yeelib.c.m.q r8 = r8.f10443h
                r8.mo28630u2(r6)
            L_0x00ac:
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.CherryMiBandActivity.this
                r8.f10450o = r3
                goto L_0x0118
            L_0x00b1:
                r7.removeMessages(r5)
                int r8 = r8.arg1
                if (r8 != r4) goto L_0x00b9
                goto L_0x00ba
            L_0x00b9:
                r4 = 0
            L_0x00ba:
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.CherryMiBandActivity.this
                com.yeelight.cherry.ui.fragment.MIBandControlFragment r8 = r8.f10448m
                if (r8 == 0) goto L_0x0118
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.CherryMiBandActivity.this
                com.yeelight.cherry.ui.fragment.MIBandControlFragment r8 = r8.f10448m
                r8.mo27299f(r4)
                goto L_0x0118
            L_0x00cc:
                r7.removeMessages(r5)
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.CherryMiBandActivity.this
                java.lang.String r0 = "添加失败"
                android.widget.Toast r8 = android.widget.Toast.makeText(r8, r0, r6)
                r8.show()
                goto L_0x0118
            L_0x00db:
                r7.removeMessages(r5)
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.CherryMiBandActivity.this
                r8.mo26166V(r4)
            L_0x00e3:
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.CherryMiBandActivity.this
                com.yeelight.yeelib.c.m.q r8 = r8.f10443h
                r8.mo28617A2()
                goto L_0x0118
            L_0x00eb:
                r8 = 7
                r7.removeMessages(r8)
                r7.removeMessages(r5)
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.CherryMiBandActivity.this
                java.util.List<java.lang.String> r8 = r8.f10450o
                if (r8 == 0) goto L_0x0105
                boolean r8 = r8.isEmpty()
                if (r8 == 0) goto L_0x00ff
                goto L_0x0105
            L_0x00ff:
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.CherryMiBandActivity.this
                r8.mo26166V(r4)
                goto L_0x0118
            L_0x0105:
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.CherryMiBandActivity.this
                android.app.Fragment r8 = r8.f10449n
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r0 = com.yeelight.cherry.p177ui.activity.CherryMiBandActivity.this
                com.yeelight.cherry.ui.fragment.y r0 = r0.f10447l
                if (r8 == r0) goto L_0x0118
                goto L_0x008c
            L_0x0115:
                r7.sendEmptyMessage(r1)
            L_0x0118:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.CherryMiBandActivity.C5038a.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CherryMiBandActivity$b */
    class C5040b implements Runnable {
        C5040b() {
        }

        public void run() {
            CherryMiBandActivity.this.f10443h.mo28617A2();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CherryMiBandActivity$c */
    class C5041c extends BluetoothGattCallback {

        /* renamed from: com.yeelight.cherry.ui.activity.CherryMiBandActivity$c$a */
        class C5042a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ BluetoothGatt f10458a;

            /* renamed from: b */
            final /* synthetic */ BluetoothGattCharacteristic f10459b;

            C5042a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                this.f10458a = bluetoothGatt;
                this.f10459b = bluetoothGattCharacteristic;
            }

            public void run() {
                if (CherryMiBandActivity.this.f10451p) {
                    this.f10459b.setValue(new byte[]{1});
                    this.f10458a.writeCharacteristic(this.f10459b);
                }
                this.f10458a.close();
            }
        }

        C5041c() {
        }

        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            if (i2 == 2) {
                bluetoothGatt.discoverServices();
            } else {
                CherryMiBandActivity.this.f10452q.sendEmptyMessage(11);
            }
        }

        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            BluetoothGatt unused = CherryMiBandActivity.this.f10453r = bluetoothGatt;
            CherryMiBandActivity.this.f10444i = bluetoothGatt.getDevice();
            for (BluetoothGattService characteristics : bluetoothGatt.getServices()) {
                for (BluetoothGattCharacteristic next : characteristics.getCharacteristics()) {
                    if (next.getUuid().toString().equals("00002a06-0000-1000-8000-00805f9b34fb")) {
                        next.setValue(new byte[]{1});
                        bluetoothGatt.writeCharacteristic(next);
                        CherryMiBandActivity.this.f10452q.sendEmptyMessage(10);
                        new Handler(Looper.getMainLooper()).postDelayed(new C5042a(bluetoothGatt, next), 2200);
                    }
                }
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CherryMiBandActivity$d */
    class C5043d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f10461a;

        /* renamed from: b */
        final /* synthetic */ C6024e f10462b;

        /* renamed from: com.yeelight.cherry.ui.activity.CherryMiBandActivity$d$a */
        class C5044a implements Runnable {
            C5044a() {
            }

            public void run() {
                CherryMiBandActivity.this.f10443h.mo28617A2();
            }
        }

        C5043d(int i, C6024e eVar) {
            this.f10461a = i;
            this.f10462b = eVar;
        }

        public void run() {
            int i = this.f10461a;
            if (i == 8192) {
                CherryMiBandActivity.this.f10452q.removeMessages(7);
                CherryMiBandActivity.this.f10452q.removeMessages(4);
                C7616d unused = CherryMiBandActivity.this.f10437b = ((C7551c) this.f10462b).mo28870X0();
                if (CherryMiBandActivity.this.f10437b.mo29061a() != null) {
                    CherryMiBandActivity.this.mo26166V(true);
                    if (CherryMiBandActivity.this.f10448m != null) {
                        CherryMiBandActivity.this.f10448m.mo27299f(CherryMiBandActivity.this.f10437b.mo29062b());
                    }
                } else if (CherryMiBandActivity.this.f10449n != CherryMiBandActivity.this.f10447l && CherryMiBandActivity.this.f10449n != CherryMiBandActivity.this.f10445j) {
                    CherryMiBandActivity.this.mo26166V(false);
                    if (CherryMiBandActivity.this.f10448m != null) {
                        CherryMiBandActivity.this.f10448m.mo27299f(false);
                    }
                }
            } else {
                if (i == 65536) {
                    CherryMiBandActivity.this.f10452q.removeMessages(4);
                    CherryMiBandActivity.this.mo26166V(true);
                } else if (i != 131072) {
                    if (i == 16384) {
                        CherryMiBandActivity.this.mo26166V(false);
                        ((C7551c) CherryMiBandActivity.this.f10443h.mo23408d0()).mo28870X0().mo29063c();
                        CherryMiBandActivity.this.f10452q.postDelayed(new C5044a(), 1000);
                        return;
                    } else if (i != 32768) {
                        return;
                    }
                } else {
                    return;
                }
                CherryMiBandActivity.this.f10443h.mo28617A2();
            }
        }
    }

    public CherryMiBandActivity() {
        new HashMap();
        this.f10443h = null;
        this.f10450o = null;
        this.f10451p = false;
        this.f10452q = new C5038a();
    }

    /* renamed from: r0 */
    private void m16069r0() {
    }

    /* renamed from: V */
    public void mo26166V(boolean z) {
        if (this.f10451p) {
            FragmentTransaction beginTransaction = this.f10439d.beginTransaction();
            this.f10440e = beginTransaction;
            beginTransaction.setCustomAnimations(2130837504, 2130837505);
            this.f10448m.mo27300g(z);
            this.f10448m.mo27301h();
            this.f10440e.replace(C11745R$id.fragment_container, this.f10448m);
            this.f10449n = this.f10448m;
            this.f10440e.commit();
        }
    }

    /* renamed from: W */
    public void mo26167W() {
        if (this.f10451p) {
            FragmentTransaction beginTransaction = this.f10439d.beginTransaction();
            this.f10440e = beginTransaction;
            beginTransaction.setCustomAnimations(2130837504, 2130837505);
            if (!this.f10445j.isAdded()) {
                this.f10440e.replace(C11745R$id.fragment_container, this.f10445j);
            } else {
                this.f10440e.show(this.f10445j);
            }
            Fragment fragment = this.f10449n;
            if (!(fragment == null || fragment == this.f10445j)) {
                this.f10440e.hide(fragment);
            }
            this.f10449n = this.f10445j;
            this.f10440e.commit();
        }
    }

    /* renamed from: X */
    public void mo26168X() {
        mo26178p0(false, true);
    }

    /* renamed from: Y */
    public void mo26169Y(boolean z) {
        mo26178p0(z, false);
    }

    /* renamed from: Z */
    public boolean mo26170Z(String str) {
        if (str == null) {
            BluetoothDevice bluetoothDevice = this.f10444i;
            if (bluetoothDevice == null) {
                return false;
            }
            str = bluetoothDevice.getAddress();
        }
        if (this.f10444i.getName() == null || !this.f10444i.getName().toLowerCase().startsWith("mi band 2")) {
            this.f10443h.mo28624n2(str);
        } else {
            this.f10443h.mo28625o2(str, 1);
        }
        this.f10452q.sendEmptyMessageDelayed(4, 2000);
        return true;
    }

    /* renamed from: a0 */
    public void mo26171a0() {
        BluetoothGatt bluetoothGatt;
        if (this.f10443h != null && (bluetoothGatt = this.f10453r) != null) {
            bluetoothGatt.disconnect();
            this.f10453r.close();
            this.f10453r = null;
        }
    }

    /* renamed from: b0 */
    public void mo26172b0(boolean z) {
        this.f10443h.mo28630u2(z);
    }

    public void back(View view) {
        finish();
    }

    /* renamed from: c0 */
    public void mo26174c0() {
        this.f10441f.clear();
        List<BluetoothDevice> connectedDevices = this.f10438c.getConnectedDevices(7);
        this.f10442g = connectedDevices;
        Iterator<BluetoothDevice> it = connectedDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            BluetoothDevice next = it.next();
            if (next.getAddress().startsWith("88:0F:") || next.getAddress().startsWith("C8:0F") || (next.getName() != null && (next.getName().startsWith("MI") || next.getName().startsWith("Amazfit")))) {
                this.f10444i = next;
            }
        }
        if (this.f10444i != null) {
            this.f10452q.sendEmptyMessageDelayed(9, 1000);
        } else {
            this.f10452q.sendEmptyMessage(8);
        }
    }

    /* renamed from: d0 */
    public void mo26175d0() {
        BluetoothDevice bluetoothDevice = this.f10444i;
        if (bluetoothDevice != null) {
            bluetoothDevice.connectGatt(this, false, new C5041c());
        }
    }

    /* renamed from: e0 */
    public void mo26176e0() {
        C7616d dVar = this.f10437b;
        if (dVar != null && dVar.mo29061a() != null) {
            try {
                String[] split = this.f10437b.mo29061a().split("#");
                this.f10443h.mo28628s2(split[0], split[1], split[2]);
            } catch (Exception e) {
                e.printStackTrace();
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
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().addFlags(67108864);
        }
        setContentView(C11748R$layout.activity_cherry_mi_band);
        getWindow().getDecorView().setBackgroundResource(2131230878);
        BluetoothManager bluetoothManager = (BluetoothManager) getSystemService("bluetooth");
        this.f10438c = bluetoothManager;
        bluetoothManager.getAdapter();
        this.f10439d = getFragmentManager();
        this.f10447l = new C5953y();
        this.f10446k = new C5955z();
        this.f10448m = new MIBandControlFragment();
        this.f10445j = new C5951x();
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f10436s, "Activity has not device id", false);
        } else {
            C7186q qVar = (C7186q) C4257w.m11947l0().mo23668g0(intent.getStringExtra("com.yeelight.cherry.device_id"));
            this.f10443h = qVar;
            if (qVar == null || !qVar.mo23331k0()) {
                BaseActivity.m24384U(this);
            } else {
                getSharedPreferences("miband", 0);
                Iterator<BluetoothDevice> it = C4297y.m12064f().mo23734e().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    BluetoothDevice next = it.next();
                    if (next.getAddress().startsWith("88:0F:")) {
                        this.f10444i = next;
                        break;
                    }
                }
                m16069r0();
                return;
            }
        }
        finish();
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
        this.f10451p = false;
        C7186q qVar = this.f10443h;
        if (qVar != null) {
            qVar.mo23400W0(this);
            this.f10443h.mo23319V0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f10443h.mo23358z0(this);
        this.f10443h.mo23365B0(this);
        if (this.f10443h != null) {
            this.f10451p = true;
            this.f10452q.postDelayed(new C5040b(), 500);
            this.f10452q.sendEmptyMessageDelayed(7, 1500);
            return;
        }
        finish();
    }

    public void onStatusChange(int i, C6024e eVar) {
        runOnUiThread(new C5043d(i, eVar));
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    /* renamed from: p0 */
    public void mo26178p0(boolean z, boolean z2) {
        if (this.f10451p) {
            this.f10440e = this.f10439d.beginTransaction();
            Fragment fragment = this.f10449n;
            C5953y yVar = this.f10447l;
            if (fragment != yVar) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("isNoDevice", z2);
                this.f10447l.setArguments(bundle);
                this.f10440e.setCustomAnimations(2130837504, 2130837505);
                this.f10440e.replace(C11745R$id.fragment_container, this.f10447l);
                this.f10449n = this.f10447l;
                if (z) {
                    mo26174c0();
                }
                this.f10440e.commit();
            } else if (!yVar.isHidden()) {
                this.f10447l.mo27395b(z2 ? 1 : 0);
            }
        }
    }

    /* renamed from: q0 */
    public void mo26179q0() {
        if (this.f10451p) {
            FragmentTransaction beginTransaction = this.f10439d.beginTransaction();
            this.f10440e = beginTransaction;
            beginTransaction.setCustomAnimations(2130837504, 2130837505);
            this.f10440e.replace(C11745R$id.fragment_container, this.f10446k);
            this.f10449n = this.f10446k;
            this.f10440e.commit();
        }
    }
}

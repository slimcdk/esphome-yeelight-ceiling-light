package com.yeelight.cherry.p141ui.activity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.bluetooth.BluetoothAdapter;
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
import com.miot.common.device.parser.xml.DddTag;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.fragment.C5998i;
import com.yeelight.cherry.p141ui.fragment.C6000j;
import com.yeelight.cherry.p141ui.fragment.C6002k;
import com.yeelight.cherry.p141ui.fragment.MIBandControlFragment;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p223w3.C11627r;
import p227x3.C11966c;
import p232y3.C12038c;
import p237z3.C12143c;
import p237z3.C12145e;

/* renamed from: com.yeelight.cherry.ui.activity.CherryMiBandActivity */
public class CherryMiBandActivity extends MiBandBaseActivity implements C12145e, C12143c {

    /* renamed from: r */
    public static final String f9984r = "CherryMiBandActivity";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C11966c f9985a;

    /* renamed from: b */
    private BluetoothManager f9986b;

    /* renamed from: c */
    private FragmentManager f9987c;

    /* renamed from: d */
    private FragmentTransaction f9988d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<Map<String, Object>> f9989e = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public List<BluetoothDevice> f9990f = null;

    /* renamed from: g */
    public C11627r f9991g;

    /* renamed from: h */
    public BluetoothDevice f9992h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C5998i f9993i;

    /* renamed from: j */
    private C6002k f9994j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C6000j f9995k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public MIBandControlFragment f9996l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Fragment f9997m;

    /* renamed from: n */
    public List<String> f9998n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f9999o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Handler f10000p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public BluetoothGatt f10001q;

    /* renamed from: com.yeelight.cherry.ui.activity.CherryMiBandActivity$a */
    class C5083a implements Runnable {
        C5083a() {
        }

        public void run() {
            CherryMiBandActivity.this.mo30219Y(true);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CherryMiBandActivity$b */
    class C5084b extends Handler {

        /* renamed from: com.yeelight.cherry.ui.activity.CherryMiBandActivity$b$a */
        class C5085a extends BluetoothGattCallback {
            C5085a() {
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
                    CherryMiBandActivity.this.f9992h = bluetoothGatt.getDevice();
                    CherryMiBandActivity.this.f10000p.removeMessages(12);
                    CherryMiBandActivity.this.f10000p.sendEmptyMessageDelayed(9, 1500);
                }
            }
        }

        C5084b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x008c, code lost:
            r7.f10003a.mo30216V(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ac, code lost:
            r7.f10003a.f9998n = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e3, code lost:
            r7.f10003a.f9991g.mo42337A2();
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
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.CherryMiBandActivity.this
                android.bluetooth.BluetoothDevice r0 = r8.f9992h
                if (r0 != 0) goto L_0x001c
                r8.mo30218X()
                goto L_0x0118
            L_0x001c:
                r8.mo30229r0()
                goto L_0x0118
            L_0x0021:
                r7.removeMessages(r2)
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.CherryMiBandActivity.this
                java.util.List r8 = r8.f9990f
                if (r8 == 0) goto L_0x0083
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.CherryMiBandActivity.this
                java.util.List r8 = r8.f9990f
                boolean r8 = r8.isEmpty()
                if (r8 != 0) goto L_0x0083
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.CherryMiBandActivity.this
                java.util.List r8 = r8.f9990f
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
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r3 = com.yeelight.cherry.p141ui.activity.CherryMiBandActivity.this
                w3.r r3 = r3.f9991g
                java.lang.String r3 = r3.mo23185G()
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L_0x006e
                goto L_0x0115
            L_0x006e:
                r0 = 6000(0x1770, double:2.9644E-320)
                r7.sendEmptyMessageDelayed(r2, r0)
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r0 = com.yeelight.cherry.p141ui.activity.CherryMiBandActivity.this
                android.content.Context r0 = r0.getApplicationContext()
                com.yeelight.cherry.ui.activity.CherryMiBandActivity$b$a r1 = new com.yeelight.cherry.ui.activity.CherryMiBandActivity$b$a
                r1.<init>()
                r8.connectGatt(r0, r6, r1)
                goto L_0x0118
            L_0x0083:
                r8 = 9
                r0 = 1500(0x5dc, double:7.41E-321)
                r7.sendEmptyMessageDelayed(r8, r0)
                goto L_0x0118
            L_0x008c:
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.CherryMiBandActivity.this
                r8.mo30216V(r6)
                goto L_0x0118
            L_0x0093:
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.CherryMiBandActivity.this
                r8.mo30216V(r6)
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.CherryMiBandActivity.this
                w3.r r8 = r8.f9991g
                r8.mo42337A2()
                goto L_0x00ac
            L_0x00a0:
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.CherryMiBandActivity.this
                r8.mo30216V(r6)
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.CherryMiBandActivity.this
                w3.r r8 = r8.f9991g
                r8.mo42350u2(r6)
            L_0x00ac:
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.CherryMiBandActivity.this
                r8.f9998n = r3
                goto L_0x0118
            L_0x00b1:
                r7.removeMessages(r5)
                int r8 = r8.arg1
                if (r8 != r4) goto L_0x00b9
                goto L_0x00ba
            L_0x00b9:
                r4 = 0
            L_0x00ba:
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.CherryMiBandActivity.this
                com.yeelight.cherry.ui.fragment.MIBandControlFragment r8 = r8.f9996l
                if (r8 == 0) goto L_0x0118
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.CherryMiBandActivity.this
                com.yeelight.cherry.ui.fragment.MIBandControlFragment r8 = r8.f9996l
                r8.mo31258f(r4)
                goto L_0x0118
            L_0x00cc:
                r7.removeMessages(r5)
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.CherryMiBandActivity.this
                java.lang.String r0 = "添加失败"
                android.widget.Toast r8 = android.widget.Toast.makeText(r8, r0, r6)
                r8.show()
                goto L_0x0118
            L_0x00db:
                r7.removeMessages(r5)
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.CherryMiBandActivity.this
                r8.mo30216V(r4)
            L_0x00e3:
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.CherryMiBandActivity.this
                w3.r r8 = r8.f9991g
                r8.mo42337A2()
                goto L_0x0118
            L_0x00eb:
                r8 = 7
                r7.removeMessages(r8)
                r7.removeMessages(r5)
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.CherryMiBandActivity.this
                java.util.List<java.lang.String> r8 = r8.f9998n
                if (r8 == 0) goto L_0x0105
                boolean r8 = r8.isEmpty()
                if (r8 == 0) goto L_0x00ff
                goto L_0x0105
            L_0x00ff:
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.CherryMiBandActivity.this
                r8.mo30216V(r4)
                goto L_0x0118
            L_0x0105:
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r8 = com.yeelight.cherry.p141ui.activity.CherryMiBandActivity.this
                android.app.Fragment r8 = r8.f9997m
                com.yeelight.cherry.ui.activity.CherryMiBandActivity r0 = com.yeelight.cherry.p141ui.activity.CherryMiBandActivity.this
                com.yeelight.cherry.ui.fragment.j r0 = r0.f9995k
                if (r8 == r0) goto L_0x0118
                goto L_0x008c
            L_0x0115:
                r7.sendEmptyMessage(r1)
            L_0x0118:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.CherryMiBandActivity.C5084b.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CherryMiBandActivity$c */
    class C5086c implements BluetoothAdapter.LeScanCallback {
        C5086c() {
        }

        public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            try {
                if (bluetoothDevice.getName() != null && bluetoothDevice.getName().equals("MI")) {
                    Iterator it = CherryMiBandActivity.this.f9989e.iterator();
                    do {
                        if (!it.hasNext()) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("name", bluetoothDevice.getName() + " " + bluetoothDevice.getAddress());
                            hashMap.put(DddTag.DEVICE, bluetoothDevice);
                            hashMap.put("rssi", Integer.valueOf(i));
                            hashMap.put("scanRecord", bArr);
                            CherryMiBandActivity.this.f9989e.add(hashMap);
                            return;
                        }
                    } while (!((Map) it.next()).get("name").toString().contains(bluetoothDevice.getAddress()));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CherryMiBandActivity$d */
    class C5087d implements Runnable {
        C5087d() {
        }

        public void run() {
            CherryMiBandActivity.this.f9991g.mo42337A2();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CherryMiBandActivity$e */
    class C5088e extends BluetoothGattCallback {

        /* renamed from: com.yeelight.cherry.ui.activity.CherryMiBandActivity$e$a */
        class C5089a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ BluetoothGatt f10008a;

            /* renamed from: b */
            final /* synthetic */ BluetoothGattCharacteristic f10009b;

            C5089a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                this.f10008a = bluetoothGatt;
                this.f10009b = bluetoothGattCharacteristic;
            }

            public void run() {
                if (CherryMiBandActivity.this.f9999o) {
                    this.f10009b.setValue(new byte[]{1});
                    this.f10008a.writeCharacteristic(this.f10009b);
                }
                this.f10008a.close();
            }
        }

        C5088e() {
        }

        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            if (i2 == 2) {
                bluetoothGatt.discoverServices();
            } else {
                CherryMiBandActivity.this.f10000p.sendEmptyMessage(11);
            }
        }

        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            BluetoothGatt unused = CherryMiBandActivity.this.f10001q = bluetoothGatt;
            CherryMiBandActivity.this.f9992h = bluetoothGatt.getDevice();
            for (BluetoothGattService characteristics : bluetoothGatt.getServices()) {
                for (BluetoothGattCharacteristic next : characteristics.getCharacteristics()) {
                    if (next.getUuid().toString().equals("00002a06-0000-1000-8000-00805f9b34fb")) {
                        next.setValue(new byte[]{1});
                        bluetoothGatt.writeCharacteristic(next);
                        CherryMiBandActivity.this.f10000p.sendEmptyMessage(10);
                        new Handler(Looper.getMainLooper()).postDelayed(new C5089a(bluetoothGatt, next), 2200);
                    }
                }
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CherryMiBandActivity$f */
    class C5090f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f10011a;

        /* renamed from: b */
        final /* synthetic */ DeviceStatusBase f10012b;

        /* renamed from: com.yeelight.cherry.ui.activity.CherryMiBandActivity$f$a */
        class C5091a implements Runnable {
            C5091a() {
            }

            public void run() {
                CherryMiBandActivity.this.f9991g.mo42337A2();
            }
        }

        C5090f(int i, DeviceStatusBase deviceStatusBase) {
            this.f10011a = i;
            this.f10012b = deviceStatusBase;
        }

        public void run() {
            int i = this.f10011a;
            if (i == 8192) {
                CherryMiBandActivity.this.f10000p.removeMessages(7);
                CherryMiBandActivity.this.f10000p.removeMessages(4);
                C11966c unused = CherryMiBandActivity.this.f9985a = ((C12038c) this.f10012b).mo42667Z0();
                if (CherryMiBandActivity.this.f9985a.mo42532a() != null) {
                    CherryMiBandActivity.this.mo30216V(true);
                    if (CherryMiBandActivity.this.f9996l != null) {
                        CherryMiBandActivity.this.f9996l.mo31258f(CherryMiBandActivity.this.f9985a.mo42533b());
                    }
                } else if (CherryMiBandActivity.this.f9997m != CherryMiBandActivity.this.f9995k && CherryMiBandActivity.this.f9997m != CherryMiBandActivity.this.f9993i) {
                    CherryMiBandActivity.this.mo30216V(false);
                    if (CherryMiBandActivity.this.f9996l != null) {
                        CherryMiBandActivity.this.f9996l.mo31258f(false);
                    }
                }
            } else {
                if (i == 65536) {
                    CherryMiBandActivity.this.f10000p.removeMessages(4);
                    CherryMiBandActivity.this.mo30216V(true);
                } else if (i != 131072) {
                    if (i == 16384) {
                        CherryMiBandActivity.this.mo30216V(false);
                        ((C12038c) CherryMiBandActivity.this.f9991g.mo23221d0()).mo42667Z0().mo42534c();
                        CherryMiBandActivity.this.f10000p.postDelayed(new C5091a(), 1000);
                        return;
                    } else if (i != 32768) {
                        return;
                    }
                } else {
                    return;
                }
                CherryMiBandActivity.this.f9991g.mo42337A2();
            }
        }
    }

    public CherryMiBandActivity() {
        new HashMap();
        this.f9991g = null;
        this.f9998n = null;
        this.f9999o = false;
        new C5083a();
        this.f10000p = new C5084b();
        new C5086c();
    }

    /* renamed from: s0 */
    private void m15959s0() {
    }

    /* renamed from: V */
    public void mo30216V(boolean z) {
        if (this.f9999o) {
            FragmentTransaction beginTransaction = this.f9987c.beginTransaction();
            this.f9988d = beginTransaction;
            beginTransaction.setCustomAnimations(2130837504, 2130837505);
            this.f9996l.mo31259g(z);
            this.f9996l.mo31260h();
            this.f9988d.replace(C12225R$id.fragment_container, this.f9996l);
            this.f9997m = this.f9996l;
            this.f9988d.commit();
        }
    }

    /* renamed from: W */
    public void mo30217W() {
        if (this.f9999o) {
            FragmentTransaction beginTransaction = this.f9987c.beginTransaction();
            this.f9988d = beginTransaction;
            beginTransaction.setCustomAnimations(2130837504, 2130837505);
            if (!this.f9993i.isAdded()) {
                this.f9988d.replace(C12225R$id.fragment_container, this.f9993i);
            } else {
                this.f9988d.show(this.f9993i);
            }
            Fragment fragment = this.f9997m;
            if (!(fragment == null || fragment == this.f9993i)) {
                this.f9988d.hide(fragment);
            }
            this.f9997m = this.f9993i;
            this.f9988d.commit();
        }
    }

    /* renamed from: X */
    public void mo30218X() {
        mo30228q0(false, true);
    }

    /* renamed from: Y */
    public void mo30219Y(boolean z) {
        mo30228q0(z, false);
    }

    /* renamed from: Z */
    public boolean mo30220Z(String str) {
        if (str == null) {
            BluetoothDevice bluetoothDevice = this.f9992h;
            if (bluetoothDevice == null) {
                return false;
            }
            str = bluetoothDevice.getAddress();
        }
        if (this.f9992h.getName() == null || !this.f9992h.getName().toLowerCase().startsWith("mi band 2")) {
            this.f9991g.mo42344n2(str);
        } else {
            this.f9991g.mo42345o2(str, 1);
        }
        this.f10000p.sendEmptyMessageDelayed(4, 2000);
        return true;
    }

    /* renamed from: a0 */
    public void mo30221a0() {
        BluetoothGatt bluetoothGatt;
        if (this.f9991g != null && (bluetoothGatt = this.f10001q) != null) {
            bluetoothGatt.disconnect();
            this.f10001q.close();
            this.f10001q = null;
        }
    }

    /* renamed from: b0 */
    public void mo30222b0(boolean z) {
        this.f9991g.mo42350u2(z);
    }

    public void back(View view) {
        finish();
    }

    /* renamed from: c0 */
    public void mo30224c0() {
        this.f9989e.clear();
        List<BluetoothDevice> connectedDevices = this.f9986b.getConnectedDevices(7);
        this.f9990f = connectedDevices;
        Iterator<BluetoothDevice> it = connectedDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            BluetoothDevice next = it.next();
            if (next.getAddress().startsWith("88:0F:") || next.getAddress().startsWith("C8:0F") || (next.getName() != null && (next.getName().startsWith("MI") || next.getName().startsWith("Amazfit")))) {
                this.f9992h = next;
            }
        }
        if (this.f9992h != null) {
            this.f10000p.sendEmptyMessageDelayed(9, 1000);
        } else {
            this.f10000p.sendEmptyMessage(8);
        }
    }

    /* renamed from: d0 */
    public void mo30225d0() {
        BluetoothDevice bluetoothDevice = this.f9992h;
        if (bluetoothDevice != null) {
            bluetoothDevice.connectGatt(this, false, new C5088e());
        }
    }

    /* renamed from: e0 */
    public void mo30226e0() {
        C11966c cVar = this.f9985a;
        if (cVar != null && cVar.mo42532a() != null) {
            try {
                String[] split = this.f9985a.mo42532a().split("#");
                this.f9991g.mo42348s2(split[0], split[1], split[2]);
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
        setContentView(C12228R$layout.activity_cherry_mi_band);
        getWindow().getDecorView().setBackgroundResource(2131230892);
        BluetoothManager bluetoothManager = (BluetoothManager) getSystemService("bluetooth");
        this.f9986b = bluetoothManager;
        bluetoothManager.getAdapter();
        this.f9987c = getFragmentManager();
        this.f9995k = new C6000j();
        this.f9994j = new C6002k();
        this.f9996l = new MIBandControlFragment();
        this.f9993i = new C5998i();
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f9984r, "Activity has not device id", false);
        } else {
            C11627r rVar = (C11627r) YeelightDeviceManager.m7800o0().mo23295i0(intent.getStringExtra("com.yeelight.cherry.device_id"));
            this.f9991g = rVar;
            if (rVar == null || !rVar.mo23145k0()) {
                BaseActivity.m19947U(this);
            } else {
                getSharedPreferences("miband", 0);
                Iterator<BluetoothDevice> it = C3108x.m8223f().mo23544e().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    BluetoothDevice next = it.next();
                    if (next.getAddress().startsWith("88:0F:")) {
                        this.f9992h = next;
                        break;
                    }
                }
                m15959s0();
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
        this.f9999o = false;
        C11627r rVar = this.f9991g;
        if (rVar != null) {
            rVar.mo23213W0(this);
            this.f9991g.mo23133V0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f9991g.mo23171z0(this);
        this.f9991g.mo23178B0(this);
        if (this.f9991g != null) {
            this.f9999o = true;
            this.f10000p.postDelayed(new C5087d(), 500);
            this.f10000p.sendEmptyMessageDelayed(7, 1500);
            return;
        }
        finish();
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        runOnUiThread(new C5090f(i, deviceStatusBase));
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    /* renamed from: q0 */
    public void mo30228q0(boolean z, boolean z2) {
        if (this.f9999o) {
            this.f9988d = this.f9987c.beginTransaction();
            Fragment fragment = this.f9997m;
            C6000j jVar = this.f9995k;
            if (fragment != jVar) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("isNoDevice", z2);
                this.f9995k.setArguments(bundle);
                this.f9988d.setCustomAnimations(2130837504, 2130837505);
                this.f9988d.replace(C12225R$id.fragment_container, this.f9995k);
                this.f9997m = this.f9995k;
                if (z) {
                    mo30224c0();
                }
                this.f9988d.commit();
            } else if (!jVar.isHidden()) {
                this.f9995k.mo31325b(z2 ? 1 : 0);
            }
        }
    }

    /* renamed from: r0 */
    public void mo30229r0() {
        if (this.f9999o) {
            FragmentTransaction beginTransaction = this.f9987c.beginTransaction();
            this.f9988d = beginTransaction;
            beginTransaction.setCustomAnimations(2130837504, 2130837505);
            this.f9988d.replace(C12225R$id.fragment_container, this.f9994j);
            this.f9997m = this.f9994j;
            this.f9988d.commit();
        }
    }
}

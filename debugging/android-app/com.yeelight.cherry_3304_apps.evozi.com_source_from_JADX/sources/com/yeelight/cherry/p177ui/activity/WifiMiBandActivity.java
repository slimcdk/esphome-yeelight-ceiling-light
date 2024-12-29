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
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6029f;
import com.yeelight.yeelib.p150c.p151i.C6046l;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.utils.C4308b;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: com.yeelight.cherry.ui.activity.WifiMiBandActivity */
public class WifiMiBandActivity extends MiBandBaseActivity implements C9770e, C9768c {

    /* renamed from: r */
    public static final String f11919r = WifiMiBandActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C6046l f11920b;

    /* renamed from: c */
    private BluetoothManager f11921c;

    /* renamed from: d */
    private FragmentManager f11922d;

    /* renamed from: e */
    private FragmentTransaction f11923e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public List<BluetoothDevice> f11924f = null;

    /* renamed from: g */
    public C6029f f11925g = null;

    /* renamed from: h */
    public BluetoothDevice f11926h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C5951x f11927i;

    /* renamed from: j */
    private C5955z f11928j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C5953y f11929k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public MIBandControlFragment f11930l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Fragment f11931m;

    /* renamed from: n */
    public List<String> f11932n = null;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f11933o = false;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Handler f11934p = new C5674a();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public BluetoothGatt f11935q;

    /* renamed from: com.yeelight.cherry.ui.activity.WifiMiBandActivity$a */
    class C5674a extends Handler {

        /* renamed from: com.yeelight.cherry.ui.activity.WifiMiBandActivity$a$a */
        class C5675a extends BluetoothGattCallback {
            C5675a() {
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
                    WifiMiBandActivity.this.f11926h = bluetoothGatt.getDevice();
                    WifiMiBandActivity.this.f11934p.removeMessages(12);
                    WifiMiBandActivity.this.f11934p.sendEmptyMessageDelayed(9, 1500);
                }
            }
        }

        C5674a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x008c, code lost:
            r7.f11936a.mo26166V(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ac, code lost:
            r7.f11936a.f11932n = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d8, code lost:
            r7.f11936a.f11925g.mo27736e2();
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
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.WifiMiBandActivity.this
                android.bluetooth.BluetoothDevice r0 = r8.f11926h
                if (r0 != 0) goto L_0x001c
                r8.mo26168X()
                goto L_0x010c
            L_0x001c:
                r8.mo26997q0()
                goto L_0x010c
            L_0x0021:
                r7.removeMessages(r2)
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.WifiMiBandActivity.this
                java.util.List r8 = r8.f11924f
                if (r8 == 0) goto L_0x0083
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.WifiMiBandActivity.this
                java.util.List r8 = r8.f11924f
                boolean r8 = r8.isEmpty()
                if (r8 != 0) goto L_0x0083
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.WifiMiBandActivity.this
                java.util.List r8 = r8.f11924f
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
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r3 = com.yeelight.cherry.p177ui.activity.WifiMiBandActivity.this
                com.yeelight.yeelib.c.i.f r3 = r3.f11925g
                java.lang.String r3 = r3.mo23372G()
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L_0x006e
                goto L_0x0109
            L_0x006e:
                r0 = 6000(0x1770, double:2.9644E-320)
                r7.sendEmptyMessageDelayed(r2, r0)
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r0 = com.yeelight.cherry.p177ui.activity.WifiMiBandActivity.this
                android.content.Context r0 = r0.getApplicationContext()
                com.yeelight.cherry.ui.activity.WifiMiBandActivity$a$a r1 = new com.yeelight.cherry.ui.activity.WifiMiBandActivity$a$a
                r1.<init>()
                r8.connectGatt(r0, r6, r1)
                goto L_0x010c
            L_0x0083:
                r8 = 9
                r0 = 1500(0x5dc, double:7.41E-321)
                r7.sendEmptyMessageDelayed(r8, r0)
                goto L_0x010c
            L_0x008c:
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.WifiMiBandActivity.this
                r8.mo26166V(r6)
                goto L_0x010c
            L_0x0093:
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.WifiMiBandActivity.this
                r8.mo26166V(r6)
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.WifiMiBandActivity.this
                com.yeelight.yeelib.c.i.f r8 = r8.f11925g
                r8.mo27736e2()
                goto L_0x00ac
            L_0x00a0:
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.WifiMiBandActivity.this
                r8.mo26166V(r6)
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.WifiMiBandActivity.this
                com.yeelight.yeelib.c.i.f r8 = r8.f11925g
                r8.mo27734a2(r6)
            L_0x00ac:
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.WifiMiBandActivity.this
                r8.f11932n = r3
                goto L_0x010c
            L_0x00b1:
                r7.removeMessages(r5)
                int r8 = r8.arg1
                if (r8 != r4) goto L_0x00b9
                goto L_0x00ba
            L_0x00b9:
                r4 = 0
            L_0x00ba:
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.WifiMiBandActivity.this
                com.yeelight.cherry.ui.fragment.MIBandControlFragment r8 = r8.f11930l
                if (r8 == 0) goto L_0x010c
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.WifiMiBandActivity.this
                com.yeelight.cherry.ui.fragment.MIBandControlFragment r8 = r8.f11930l
                r8.mo27299f(r4)
                goto L_0x010c
            L_0x00cc:
                r7.removeMessages(r5)
                goto L_0x010c
            L_0x00d0:
                r7.removeMessages(r5)
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.WifiMiBandActivity.this
                r8.mo26166V(r4)
            L_0x00d8:
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.WifiMiBandActivity.this
                com.yeelight.yeelib.c.i.f r8 = r8.f11925g
                r8.mo27736e2()
                goto L_0x010c
            L_0x00e0:
                r8 = 7
                r7.removeMessages(r8)
                r7.removeMessages(r5)
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.WifiMiBandActivity.this
                java.util.List<java.lang.String> r8 = r8.f11932n
                if (r8 == 0) goto L_0x00fa
                boolean r8 = r8.isEmpty()
                if (r8 == 0) goto L_0x00f4
                goto L_0x00fa
            L_0x00f4:
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.WifiMiBandActivity.this
                r8.mo26166V(r4)
                goto L_0x010c
            L_0x00fa:
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r8 = com.yeelight.cherry.p177ui.activity.WifiMiBandActivity.this
                android.app.Fragment r8 = r8.f11931m
                com.yeelight.cherry.ui.activity.WifiMiBandActivity r0 = com.yeelight.cherry.p177ui.activity.WifiMiBandActivity.this
                com.yeelight.cherry.ui.fragment.y r0 = r0.f11929k
                if (r8 == r0) goto L_0x010c
                goto L_0x008c
            L_0x0109:
                r7.sendEmptyMessage(r1)
            L_0x010c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.WifiMiBandActivity.C5674a.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.WifiMiBandActivity$b */
    class C5676b extends BluetoothGattCallback {

        /* renamed from: com.yeelight.cherry.ui.activity.WifiMiBandActivity$b$a */
        class C5677a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ BluetoothGatt f11939a;

            /* renamed from: b */
            final /* synthetic */ BluetoothGattCharacteristic f11940b;

            C5677a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                this.f11939a = bluetoothGatt;
                this.f11940b = bluetoothGattCharacteristic;
            }

            public void run() {
                if (WifiMiBandActivity.this.f11933o) {
                    this.f11940b.setValue(new byte[]{1});
                    this.f11939a.writeCharacteristic(this.f11940b);
                }
                this.f11939a.close();
            }
        }

        C5676b() {
        }

        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            if (i2 == 2) {
                bluetoothGatt.discoverServices();
            } else {
                WifiMiBandActivity.this.f11934p.sendEmptyMessage(11);
            }
        }

        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            BluetoothGatt unused = WifiMiBandActivity.this.f11935q = bluetoothGatt;
            WifiMiBandActivity.this.f11926h = bluetoothGatt.getDevice();
            for (BluetoothGattService characteristics : bluetoothGatt.getServices()) {
                for (BluetoothGattCharacteristic next : characteristics.getCharacteristics()) {
                    if (next.getUuid().toString().equals("00002a06-0000-1000-8000-00805f9b34fb")) {
                        next.setValue(new byte[]{1});
                        bluetoothGatt.writeCharacteristic(next);
                        WifiMiBandActivity.this.f11934p.sendEmptyMessage(10);
                        new Handler(Looper.getMainLooper()).postDelayed(new C5677a(bluetoothGatt, next), 2200);
                    }
                }
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.WifiMiBandActivity$c */
    class C5678c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f11942a;

        /* renamed from: b */
        final /* synthetic */ C6024e f11943b;

        /* renamed from: com.yeelight.cherry.ui.activity.WifiMiBandActivity$c$a */
        class C5679a implements Runnable {
            C5679a() {
            }

            public void run() {
                WifiMiBandActivity.this.f11925g.mo27736e2();
            }
        }

        C5678c(int i, C6024e eVar) {
            this.f11942a = i;
            this.f11943b = eVar;
        }

        public void run() {
            int i = this.f11942a;
            if (i == 8192) {
                String str = WifiMiBandActivity.f11919r;
                "read miband = " + this.f11943b.mo27724y();
                WifiMiBandActivity.this.f11934p.removeMessages(7);
                WifiMiBandActivity.this.f11934p.removeMessages(4);
                C6046l unused = WifiMiBandActivity.this.f11920b = this.f11943b.mo27724y();
                if (WifiMiBandActivity.this.f11920b != null && WifiMiBandActivity.this.f11920b.mo27797a() != null) {
                    WifiMiBandActivity.this.mo26166V(true);
                } else if (WifiMiBandActivity.this.f11931m != WifiMiBandActivity.this.f11929k && WifiMiBandActivity.this.f11931m != WifiMiBandActivity.this.f11927i) {
                    WifiMiBandActivity.this.mo26166V(false);
                    if (WifiMiBandActivity.this.f11930l != null) {
                        WifiMiBandActivity.this.f11930l.mo27299f(false);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            } else {
                if (i == 65536) {
                    WifiMiBandActivity.this.f11934p.removeMessages(4);
                    WifiMiBandActivity.this.mo26166V(true);
                } else if (i != 131072) {
                    if (i == 16384) {
                        WifiMiBandActivity.this.mo26166V(false);
                        WifiMiBandActivity.this.f11934p.postDelayed(new C5679a(), 1000);
                        return;
                    } else if (i != 32768) {
                        if (i != 4096) {
                            return;
                        }
                    }
                } else {
                    return;
                }
                WifiMiBandActivity.this.f11925g.mo27736e2();
                return;
            }
            WifiMiBandActivity.this.f11930l.mo27299f(this.f11943b.mo27675Z());
        }
    }

    /* renamed from: r0 */
    private void m17135r0() {
        this.f11920b = this.f11925g.mo23408d0().mo27724y();
        this.f11930l.mo27299f(this.f11925g.mo23408d0().mo27675Z());
        if (this.f11931m == this.f11930l) {
            C6046l lVar = this.f11920b;
            mo26166V((lVar == null || lVar.mo27797a() == null) ? false : true);
        }
    }

    /* renamed from: V */
    public void mo26166V(boolean z) {
        if (this.f11933o) {
            FragmentTransaction beginTransaction = this.f11922d.beginTransaction();
            this.f11923e = beginTransaction;
            beginTransaction.setCustomAnimations(2130837504, 2130837505);
            this.f11930l.mo27300g(z);
            this.f11930l.mo27301h();
            this.f11923e.replace(C11745R$id.fragment_container, this.f11930l);
            this.f11931m = this.f11930l;
            this.f11923e.commit();
        }
    }

    /* renamed from: W */
    public void mo26167W() {
        if (this.f11933o) {
            FragmentTransaction beginTransaction = this.f11922d.beginTransaction();
            this.f11923e = beginTransaction;
            beginTransaction.setCustomAnimations(2130837504, 2130837505);
            this.f11923e.replace(C11745R$id.fragment_container, this.f11927i);
            this.f11931m = this.f11927i;
            this.f11923e.commit();
        }
    }

    /* renamed from: X */
    public void mo26168X() {
        mo26996p0(false, true);
    }

    /* renamed from: Y */
    public void mo26169Y(boolean z) {
        mo26996p0(z, false);
    }

    /* renamed from: Z */
    public boolean mo26170Z(String str) {
        if (str == null) {
            BluetoothDevice bluetoothDevice = this.f11926h;
            if (bluetoothDevice == null) {
                return false;
            }
            str = bluetoothDevice.getAddress();
        }
        this.f11925g.mo27732Y1(str);
        this.f11925g.mo27734a2(true);
        this.f11934p.sendEmptyMessageDelayed(4, 2000);
        return true;
    }

    /* renamed from: a0 */
    public void mo26171a0() {
        BluetoothGatt bluetoothGatt;
        if (this.f11925g != null && (bluetoothGatt = this.f11935q) != null) {
            bluetoothGatt.disconnect();
            this.f11935q.close();
            this.f11935q = null;
        }
    }

    /* renamed from: b0 */
    public void mo26172b0(boolean z) {
        this.f11925g.mo27734a2(z);
    }

    public void back(View view) {
        finish();
    }

    /* renamed from: c0 */
    public void mo26174c0() {
        List<BluetoothDevice> connectedDevices = this.f11921c.getConnectedDevices(7);
        this.f11924f = connectedDevices;
        Iterator<BluetoothDevice> it = connectedDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            BluetoothDevice next = it.next();
            if (next.getAddress().startsWith("88:0F:") || next.getAddress().startsWith("C8:0F") || (next.getName() != null && (next.getName().startsWith("MI") || next.getName().startsWith("Amazfit")))) {
                this.f11926h = next;
            }
        }
        if (this.f11926h != null) {
            this.f11934p.sendEmptyMessageDelayed(9, 1000);
        } else {
            this.f11934p.sendEmptyMessage(8);
        }
    }

    /* renamed from: d0 */
    public void mo26175d0() {
        BluetoothDevice bluetoothDevice = this.f11926h;
        if (bluetoothDevice != null) {
            bluetoothDevice.connectGatt(this, false, new C5676b());
        }
    }

    /* renamed from: e0 */
    public void mo26176e0() {
        C6046l lVar = this.f11920b;
        if (lVar != null && lVar.mo27797a() != null) {
            this.f11925g.mo27738h2(this.f11920b.mo27797a(), this.f11920b.mo27799c(), 8193);
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
        setContentView(C11748R$layout.activity_cherry_mi_band);
        getWindow().getDecorView().setBackgroundResource(2131230878);
        BluetoothManager bluetoothManager = (BluetoothManager) getSystemService("bluetooth");
        this.f11921c = bluetoothManager;
        bluetoothManager.getAdapter();
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f11919r, "Activity has not device id", false);
            finish();
            return;
        }
        C6029f fVar = (C6029f) C4257w.m11947l0().mo23651L0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f11925g = fVar;
        if (fVar == null || !fVar.mo23331k0()) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        this.f11922d = getFragmentManager();
        this.f11929k = new C5953y();
        this.f11928j = new C5955z();
        this.f11930l = new MIBandControlFragment();
        Bundle bundle2 = new Bundle();
        if (this.f11925g.mo23375I().mo29075a().equals("yeelink.light.ceiling1") || this.f11925g.mo23375I().mo29075a().equals("yeelink.light.ceiling2") || this.f11925g.mo23375I().mo29075a().equals("yeelink.light.ceiling6") || this.f11925g.mo23375I().mo29075a().equals("yeelink.light.ceiling7") || this.f11925g.mo23375I().mo29075a().equals("yeelink.light.ceiling11") || this.f11925g.mo23375I().mo29075a().equals("yeelink.light.ceiling12") || this.f11925g.mo23375I().mo29075a().equals("yeelink.light.ceiling13") || this.f11925g.mo23375I().mo29075a().equals("yeelink.light.ceiling14") || this.f11925g.mo23375I().mo29075a().equals("yeelink.light.ceiling15") || this.f11925g.mo23375I().mo29075a().equals("yeelink.light.ceiling16") || this.f11925g.mo23375I().mo29075a().equals("yeelink.light.ceiling17") || this.f11925g.mo23375I().mo29075a().equals("yeelink.light.ceiling18") || this.f11925g.mo23375I().mo29075a().equals("yeelink.light.ceiling19") || this.f11925g.mo23375I().mo29075a().equals("yeelink.light.ceiling20") || this.f11925g.mo23375I().mo29075a().equals("yeelink.light.ceiling21") || this.f11925g.mo23375I().mo29075a().equals("yeelink.light.ceiling22") || this.f11925g.mo23375I().mo29075a().equals("yeelink.light.ceiling23") || this.f11925g.mo23375I().mo29075a().equals("yeelink.light.ceiling24") || this.f11925g.mo23375I().mo29075a().equals("yeelink.light.ceil30") || this.f11925g.mo23375I().mo29075a().equals("yeelink.light.ceil31") || this.f11925g.mo23375I().mo29075a().equals("yeelink.light.ceil32") || this.f11925g.mo23375I().mo29075a().equals("yilai.light.ceiling1") || this.f11925g.mo23375I().mo29075a().equals("yilai.light.ceiling2") || this.f11925g.mo23375I().mo29075a().equals("yilai.light.ceiling3") || this.f11925g.mo23375I().mo29075a().equals("yeelink.light.ceiling8")) {
            i = 2131231810;
        } else {
            if (this.f11925g.mo23375I().mo29075a().equals("yeelink.light.ceiling3") || this.f11925g.mo23375I().mo29075a().equals("yeelink.light.ceiling4") || this.f11925g.mo23375I().mo29075a().equals("yeelink.light.ceiling10") || this.f11925g.mo23375I().mo29075a().equals("yeelink.light.ceiling5")) {
                i = 2131231808;
            }
            this.f11930l.setArguments(bundle2);
            this.f11927i = new C5951x();
            this.f11931m = this.f11930l;
            m17135r0();
        }
        bundle2.putInt("middleImgRes", i);
        this.f11930l.setArguments(bundle2);
        this.f11927i = new C5951x();
        this.f11931m = this.f11930l;
        m17135r0();
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
        this.f11933o = false;
        C6029f fVar = this.f11925g;
        if (fVar != null) {
            fVar.mo23400W0(this);
            this.f11925g.mo23319V0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f11925g.mo23358z0(this);
        this.f11925g.mo23365B0(this);
        if (this.f11925g != null) {
            this.f11933o = true;
            m17135r0();
            return;
        }
        finish();
    }

    public void onStatusChange(int i, C6024e eVar) {
        runOnUiThread(new C5678c(i, eVar));
    }

    /* renamed from: p0 */
    public void mo26996p0(boolean z, boolean z2) {
        if (this.f11933o) {
            this.f11923e = this.f11922d.beginTransaction();
            Fragment fragment = this.f11931m;
            C5953y yVar = this.f11929k;
            if (fragment != yVar) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("isNoDevice", z2);
                this.f11929k.setArguments(bundle);
                this.f11923e.setCustomAnimations(2130837504, 2130837505);
                this.f11923e.replace(C11745R$id.fragment_container, this.f11929k);
                this.f11931m = this.f11929k;
                if (z) {
                    mo26174c0();
                }
                this.f11923e.commit();
            } else if (!yVar.isHidden()) {
                this.f11929k.mo27395b(z2 ? 1 : 0);
            }
        }
    }

    /* renamed from: q0 */
    public void mo26997q0() {
        if (this.f11933o) {
            FragmentTransaction beginTransaction = this.f11922d.beginTransaction();
            this.f11923e = beginTransaction;
            beginTransaction.setCustomAnimations(2130837504, 2130837505);
            this.f11923e.replace(C11745R$id.fragment_container, this.f11928j);
            this.f11931m = this.f11928j;
            this.f11923e.commit();
        }
    }
}

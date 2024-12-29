package com.yeelight.yeelib.device;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import androidx.core.internal.view.SupportMenu;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.cherry.p141ui.activity.MeshGroupMainActivity;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.PrivateMeshDeviceBase;
import com.yeelight.yeelib.device.models.C6190s;
import com.yeelight.yeelib.device.models.ProductModelBase;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.models.MeshNetWork;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p149e3.C8964a;
import p223w3.C10898f0;
import p232y3.C12042f;
import p237z3.C12144d;

/* renamed from: com.yeelight.yeelib.device.e */
public class C6164e extends C6119c implements C12144d, PrivateMeshDeviceBase.C6090a {
    /* access modifiers changed from: private */

    /* renamed from: C */
    public String f12684C = C6164e.class.getSimpleName();

    /* renamed from: Q */
    private MeshNetWork f12685Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public PrivateMeshDeviceBase f12686R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public List<C6168d> f12687S = new CopyOnWriteArrayList();

    /* renamed from: T */
    private boolean f12688T;

    /* renamed from: U */
    private int f12689U = -1;

    /* renamed from: V */
    private int f12690V = 0;

    /* renamed from: W */
    private int f12691W = 0;

    /* renamed from: X */
    private Runnable f12692X = new C6165a();

    /* renamed from: Y */
    private Runnable f12693Y = new C6166b();

    /* renamed from: com.yeelight.yeelib.device.e$a */
    class C6165a implements Runnable {
        C6165a() {
        }

        public void run() {
            if (C6164e.this.f12686R != null && C6164e.this.f12686R.mo31636W1()) {
                C6164e.this.f12686R.mo31644f2();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.e$b */
    class C6166b implements Runnable {
        C6166b() {
        }

        public void run() {
            C6164e.this.f12687S.clear();
            if (C6164e.this.f12686R != null && C6164e.this.f12686R.mo31636W1()) {
                C6164e.this.f12686R.mo31644f2();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.e$c */
    class C6167c implements Runnable {
        C6167c() {
        }

        public void run() {
            Iterator<C3012e> it = C6164e.this.f12561x.iterator();
            while (it.hasNext()) {
                PrivateMeshDeviceBase privateMeshDeviceBase = (PrivateMeshDeviceBase) it.next();
                if (privateMeshDeviceBase.mo23145k0() && privateMeshDeviceBase.mo31636W1()) {
                    if (C6164e.this.f12686R == null || !C6164e.this.f12686R.mo31636W1() || !C6164e.this.f12686R.mo31637X1()) {
                        PrivateMeshDeviceBase unused = C6164e.this.f12686R = privateMeshDeviceBase;
                        C6164e.this.f12686R.mo31646h2(C6164e.this);
                        String unused2 = C6164e.this.f12684C;
                        privateMeshDeviceBase.mo31643d2();
                        privateMeshDeviceBase.mo31644f2();
                        return;
                    } else if (privateMeshDeviceBase.mo31637X1()) {
                        privateMeshDeviceBase.mo31633T1();
                        return;
                    } else {
                        return;
                    }
                }
            }
            String unused3 = C6164e.this.f12684C;
        }
    }

    /* renamed from: com.yeelight.yeelib.device.e$d */
    public class C6168d {

        /* renamed from: a */
        public boolean f12697a;

        /* renamed from: b */
        public int f12698b;

        /* renamed from: c */
        public int f12699c;

        public C6168d(C6164e eVar, boolean z, int i, int i2) {
            this.f12697a = z;
            this.f12698b = i;
            this.f12699c = i2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return obj != null && (obj instanceof C6168d) && ((C6168d) obj).f12698b == this.f12698b;
        }
    }

    public C6164e(MeshNetWork meshNetWork) {
        super(meshNetWork.getName() + "_" + meshNetWork.getId(), "yeelink.light.gingko.group", new C12042f(meshNetWork.getNetworkName()));
        this.f12685Q = meshNetWork;
        mo31758P1();
        mo23228j0();
    }

    /* renamed from: e2 */
    private PrivateMeshDeviceBase m18235e2() {
        Iterator<C3012e> it = this.f12561x.iterator();
        while (it.hasNext()) {
            C3010c next = it.next();
            if (next.mo23145k0()) {
                return (PrivateMeshDeviceBase) next;
            }
        }
        return null;
    }

    /* renamed from: i2 */
    private byte[] m18236i2(byte[] bArr) {
        byte[] bArr2 = null;
        for (byte b : bArr) {
            if (b != 0) {
                if (bArr2 == null) {
                    bArr2 = new byte[]{b};
                } else {
                    int length = bArr2.length + 1;
                    byte[] bArr3 = new byte[length];
                    System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                    bArr3[length - 1] = b;
                    bArr2 = bArr3;
                }
            }
        }
        return bArr2;
    }

    /* renamed from: E */
    public void mo30149E(C3012e eVar) {
    }

    /* renamed from: F */
    public int mo23116F() {
        return R$drawable.icon_yeelight_device_badge_gingko_group_small;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F1 */
    public int mo31750F1() {
        if (this.f12689U == -1) {
            this.f12689U = super.mo31750F1();
        }
        return this.f12689U;
    }

    /* renamed from: H */
    public int mo23119H() {
        return R$drawable.icon_yeelight_device_badge_gingko_group_big;
    }

    /* renamed from: I */
    public ProductModelBase mo23188I() {
        return super.mo23188I();
    }

    /* renamed from: I1 */
    public int mo31751I1() {
        return this.f12563z;
    }

    /* renamed from: L */
    public void mo30150L() {
    }

    /* renamed from: L1 */
    public int[] mo31754L1() {
        return new int[]{this.f12690V, this.f12691W};
    }

    /* renamed from: M1 */
    public int mo31755M1() {
        return (this.f12563z - this.f12690V) - this.f12691W;
    }

    /* renamed from: P1 */
    public void mo31758P1() {
        this.f12560A.removeCallbacksAndMessages((Object) null);
        List<C3010c> x0 = YeelightDeviceManager.m7800o0().mo23322x0();
        StringBuilder sb = new StringBuilder();
        sb.append("Init list - all devices:");
        sb.append(x0.size());
        Iterator<C3012e> it = this.f12561x.iterator();
        while (it.hasNext()) {
            C3010c next = it.next();
            next.mo23133V0(this);
            ((C10898f0) next).mo31646h2((PrivateMeshDeviceBase.C6090a) null);
        }
        this.f12690V = 0;
        this.f12691W = 0;
        this.f12563z = 0;
        this.f12561x.clear();
        if (this.f12686R == null) {
            this.f12687S.clear();
        }
        this.f12686R = null;
        for (C3010c next2 : x0) {
            if (next2 instanceof C10898f0) {
                C10898f0 f0Var = (C10898f0) next2;
                if (f0Var.mo31635V1().equals(this.f12685Q)) {
                    this.f12561x.add(f0Var);
                    next2.mo23171z0(this);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("device count = ");
                    sb2.append(this.f12563z);
                    sb2.append("， current Device = ");
                    sb2.append(next2.mo23185G());
                    if (f0Var.mo31636W1() && this.f12686R == null) {
                        this.f12686R = f0Var;
                        f0Var.mo31646h2(this);
                        this.f12686R.mo31643d2();
                        this.f12686R.mo31644f2();
                    } else if (this.f12686R != null && f0Var.mo31637X1()) {
                        f0Var.mo42252o3();
                        f0Var.mo31633T1();
                    }
                }
            }
        }
        mo31767Y1();
    }

    /* renamed from: Q1 */
    public void mo31759Q1() {
        this.f4743h = new C6190s(mo23144i1());
    }

    /* renamed from: U0 */
    public boolean mo23131U0() {
        YeelightDeviceManager.m7800o0().mo23320v1(mo23185G());
        DeviceDataProvider.m17630l(this.f12685Q.getId());
        mo31767Y1();
        Iterator<C3012e> it = this.f12561x.iterator();
        while (it.hasNext()) {
            C3010c next = it.next();
            if (next instanceof C10898f0) {
                C10898f0 f0Var = (C10898f0) next;
                f0Var.mo31647i2(new MeshNetWork());
                if (f0Var.mo31636W1()) {
                    f0Var.mo42252o3();
                }
            }
        }
        return true;
    }

    /* renamed from: Y1 */
    public void mo31767Y1() {
        mo23221d0().mo31590g0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0109, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo31651b(int r6, boolean r7, int r8, int r9) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x010a }
            r0.<init>()     // Catch:{ all -> 0x010a }
            java.lang.String r1 = "onMesh status onMeshDeviceFound address = "
            r0.append(r1)     // Catch:{ all -> 0x010a }
            r0.append(r6)     // Catch:{ all -> 0x010a }
            java.lang.String r1 = " , isOpen = "
            r0.append(r1)     // Catch:{ all -> 0x010a }
            r0.append(r7)     // Catch:{ all -> 0x010a }
            java.lang.String r1 = ", brightness = "
            r0.append(r1)     // Catch:{ all -> 0x010a }
            r0.append(r8)     // Catch:{ all -> 0x010a }
            java.lang.String r1 = ", opCode ="
            r0.append(r1)     // Catch:{ all -> 0x010a }
            java.lang.String r1 = java.lang.Integer.toHexString(r9)     // Catch:{ all -> 0x010a }
            r0.append(r1)     // Catch:{ all -> 0x010a }
            if (r6 != 0) goto L_0x002e
            monitor-exit(r5)
            return
        L_0x002e:
            com.telink.bluetooth.light.Opcode r0 = com.telink.bluetooth.light.Opcode.BLE_GATT_OP_CTRL_DB     // Catch:{ all -> 0x010a }
            byte r0 = r0.getValue()     // Catch:{ all -> 0x010a }
            r1 = 0
            r2 = 1
            if (r9 == r0) goto L_0x0075
            android.os.Handler r9 = r5.f12560A     // Catch:{ all -> 0x010a }
            java.lang.Runnable r0 = r5.f12692X     // Catch:{ all -> 0x010a }
            r9.removeCallbacks(r0)     // Catch:{ all -> 0x010a }
            android.os.Handler r9 = r5.f12560A     // Catch:{ all -> 0x010a }
            java.lang.Runnable r0 = r5.f12692X     // Catch:{ all -> 0x010a }
            r3 = 1000(0x3e8, double:4.94E-321)
            r9.postDelayed(r0, r3)     // Catch:{ all -> 0x010a }
            java.util.List<com.yeelight.yeelib.device.e$d> r9 = r5.f12687S     // Catch:{ all -> 0x010a }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x010a }
        L_0x004e:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x010a }
            if (r0 == 0) goto L_0x0061
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x010a }
            com.yeelight.yeelib.device.e$d r0 = (com.yeelight.yeelib.device.C6164e.C6168d) r0     // Catch:{ all -> 0x010a }
            int r3 = r0.f12698b     // Catch:{ all -> 0x010a }
            if (r3 != r6) goto L_0x004e
            r0.f12697a = r7     // Catch:{ all -> 0x010a }
            r1 = 1
        L_0x0061:
            if (r1 != 0) goto L_0x0108
            com.yeelight.yeelib.device.e$d r9 = new com.yeelight.yeelib.device.e$d     // Catch:{ all -> 0x010a }
            r9.<init>(r5, r7, r6, r8)     // Catch:{ all -> 0x010a }
            int r6 = r9.f12699c     // Catch:{ all -> 0x010a }
            if (r6 >= 0) goto L_0x006e
            r9.f12699c = r2     // Catch:{ all -> 0x010a }
        L_0x006e:
            java.util.List<com.yeelight.yeelib.device.e$d> r6 = r5.f12687S     // Catch:{ all -> 0x010a }
            r6.add(r9)     // Catch:{ all -> 0x010a }
            goto L_0x0108
        L_0x0075:
            java.util.List<com.yeelight.yeelib.device.e$d> r9 = r5.f12687S     // Catch:{ all -> 0x010a }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x010a }
        L_0x007b:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x010a }
            if (r0 == 0) goto L_0x0091
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x010a }
            com.yeelight.yeelib.device.e$d r0 = (com.yeelight.yeelib.device.C6164e.C6168d) r0     // Catch:{ all -> 0x010a }
            int r3 = r0.f12698b     // Catch:{ all -> 0x010a }
            if (r3 != r6) goto L_0x007b
            r0.f12697a = r7     // Catch:{ all -> 0x010a }
            r0.f12699c = r8     // Catch:{ all -> 0x010a }
            r9 = 1
            goto L_0x0092
        L_0x0091:
            r9 = 0
        L_0x0092:
            if (r9 != 0) goto L_0x00a4
            com.yeelight.yeelib.device.e$d r9 = new com.yeelight.yeelib.device.e$d     // Catch:{ all -> 0x010a }
            r9.<init>(r5, r7, r6, r8)     // Catch:{ all -> 0x010a }
            int r6 = r9.f12699c     // Catch:{ all -> 0x010a }
            if (r6 >= 0) goto L_0x009f
            r9.f12699c = r2     // Catch:{ all -> 0x010a }
        L_0x009f:
            java.util.List<com.yeelight.yeelib.device.e$d> r6 = r5.f12687S     // Catch:{ all -> 0x010a }
            r6.add(r9)     // Catch:{ all -> 0x010a }
        L_0x00a4:
            r5.f12688T = r1     // Catch:{ all -> 0x010a }
            r5.f12690V = r1     // Catch:{ all -> 0x010a }
            r5.f12691W = r1     // Catch:{ all -> 0x010a }
            java.util.List<com.yeelight.yeelib.device.e$d> r6 = r5.f12687S     // Catch:{ all -> 0x010a }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x010a }
        L_0x00b0:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x010a }
            if (r7 == 0) goto L_0x00d3
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x010a }
            com.yeelight.yeelib.device.e$d r7 = (com.yeelight.yeelib.device.C6164e.C6168d) r7     // Catch:{ all -> 0x010a }
            boolean r8 = r7.f12697a     // Catch:{ all -> 0x010a }
            if (r8 == 0) goto L_0x00c8
            r5.f12688T = r2     // Catch:{ all -> 0x010a }
            int r8 = r5.f12690V     // Catch:{ all -> 0x010a }
            int r8 = r8 + r2
            r5.f12690V = r8     // Catch:{ all -> 0x010a }
            goto L_0x00cd
        L_0x00c8:
            int r8 = r5.f12691W     // Catch:{ all -> 0x010a }
            int r8 = r8 + r2
            r5.f12691W = r8     // Catch:{ all -> 0x010a }
        L_0x00cd:
            int r7 = r7.f12699c     // Catch:{ all -> 0x010a }
            if (r1 >= r7) goto L_0x00b0
            r1 = r7
            goto L_0x00b0
        L_0x00d3:
            r5.f12689U = r1     // Catch:{ all -> 0x010a }
            java.util.List<com.yeelight.yeelib.device.e$d> r6 = r5.f12687S     // Catch:{ all -> 0x010a }
            int r6 = r6.size()     // Catch:{ all -> 0x010a }
            r5.f12563z = r6     // Catch:{ all -> 0x010a }
            com.yeelight.yeelib.device.base.DeviceStatusBase r6 = r5.mo23221d0()     // Catch:{ all -> 0x010a }
            long r7 = (long) r1     // Catch:{ all -> 0x010a }
            r6.mo31600l0(r7)     // Catch:{ all -> 0x010a }
            com.yeelight.yeelib.device.base.DeviceStatusBase r6 = r5.mo23221d0()     // Catch:{ all -> 0x010a }
            boolean r7 = r5.f12688T     // Catch:{ all -> 0x010a }
            r6.mo31551M0(r7)     // Catch:{ all -> 0x010a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x010a }
            r6.<init>()     // Catch:{ all -> 0x010a }
            java.lang.String r7 = "device size: "
            r6.append(r7)     // Catch:{ all -> 0x010a }
            java.util.List<com.yeelight.yeelib.device.e$d> r7 = r5.f12687S     // Catch:{ all -> 0x010a }
            int r7 = r7.size()     // Catch:{ all -> 0x010a }
            r6.append(r7)     // Catch:{ all -> 0x010a }
            com.yeelight.yeelib.device.base.DeviceStatusBase r6 = r5.mo23221d0()     // Catch:{ all -> 0x010a }
            r6.mo31590g0()     // Catch:{ all -> 0x010a }
        L_0x0108:
            monitor-exit(r5)
            return
        L_0x010a:
            r6 = move-exception
            monitor-exit(r5)
            goto L_0x010e
        L_0x010d:
            throw r6
        L_0x010e:
            goto L_0x010d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.C6164e.mo31651b(int, boolean, int, int):void");
    }

    /* renamed from: b1 */
    public boolean mo23140b1() {
        return mo31864d2(SupportMenu.USER_MASK);
    }

    /* renamed from: d2 */
    public boolean mo31864d2(int i) {
        PrivateMeshDeviceBase privateMeshDeviceBase = this.f12686R;
        if (privateMeshDeviceBase == null) {
            return false;
        }
        if (!privateMeshDeviceBase.mo31637X1()) {
            this.f12686R.mo31643d2();
        }
        this.f12686R.mo31639Z1(i);
        this.f12688T = false;
        mo23221d0().mo31551M0(false);
        mo31767Y1();
        return true;
    }

    /* renamed from: e */
    public void mo31652e(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("device offline:");
        sb.append(i);
        this.f12560A.removeCallbacks(this.f12693Y);
        this.f12560A.postDelayed(this.f12693Y, 2000);
    }

    /* renamed from: f */
    public void mo31653f() {
        this.f12560A.postDelayed(new C6167c(), 500);
    }

    /* renamed from: f2 */
    public List<C6168d> mo31865f2() {
        return this.f12687S;
    }

    /* renamed from: g2 */
    public MeshNetWork mo31866g2() {
        return this.f12685Q;
    }

    /* renamed from: h2 */
    public boolean mo31867h2(int i) {
        PrivateMeshDeviceBase privateMeshDeviceBase = this.f12686R;
        if (privateMeshDeviceBase == null) {
            return false;
        }
        if (!privateMeshDeviceBase.mo31637X1()) {
            this.f12686R.mo31643d2();
        }
        this.f12686R.mo31640a2(i);
        this.f12688T = true;
        mo23221d0().mo31551M0(true);
        mo31767Y1();
        return true;
    }

    /* renamed from: i */
    public void mo31654i() {
    }

    /* renamed from: i1 */
    public String mo23144i1() {
        return "yeelink.light.gingko";
    }

    /* renamed from: k */
    public void mo30151k() {
    }

    /* renamed from: k0 */
    public boolean mo23145k0() {
        return this.f12686R != null;
    }

    /* renamed from: k1 */
    public boolean mo23146k1() {
        return this.f12688T;
    }

    /* renamed from: l0 */
    public boolean mo23147l0() {
        Iterator<C3012e> it = this.f12561x.iterator();
        while (it.hasNext()) {
            if (it.next().mo23147l0()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        return mo31867h2(SupportMenu.USER_MASK);
    }

    /* renamed from: m */
    public void mo30152m(C3012e eVar) {
        if (eVar instanceof PrivateMeshDeviceBase) {
            PrivateMeshDeviceBase privateMeshDeviceBase = (PrivateMeshDeviceBase) eVar;
            String str = new String(m18236i2((byte[]) privateMeshDeviceBase.mo31634U1("ADV_MESH_NAME")));
            StringBuilder sb = new StringBuilder();
            sb.append("mesh group on Device found:");
            sb.append(str);
            sb.append(" , bytes= ");
            sb.append(C8964a.m21435a(m18236i2((byte[]) privateMeshDeviceBase.mo31634U1("ADV_MESH_NAME")), Constants.COLON_SEPARATOR));
            if (mo23210U().equals(str)) {
                if (this.f12561x.contains(eVar)) {
                    this.f12561x.remove(eVar);
                    eVar.mo23171z0(this);
                    ((PrivateMeshDeviceBase) eVar).mo31646h2(this);
                }
                this.f12561x.add(eVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("on Device found device count = ");
                sb2.append(this.f12561x.size());
            }
        }
    }

    /* renamed from: n */
    public void mo23151n() {
        Iterator<C3012e> it = this.f12561x.iterator();
        while (it.hasNext()) {
            C3010c next = it.next();
            if (next.mo23230o0()) {
                next.mo23151n();
                return;
            }
        }
    }

    /* renamed from: o */
    public void mo30153o() {
    }

    /* renamed from: o0 */
    public boolean mo23230o0() {
        Iterator<C3012e> it = this.f12561x.iterator();
        while (it.hasNext()) {
            if (it.next().mo23230o0()) {
                return true;
            }
        }
        return false;
    }

    public void onConnectionStateChanged(int i, int i2) {
        PrivateMeshDeviceBase privateMeshDeviceBase;
        PrivateMeshDeviceBase e2;
        super.onConnectionStateChanged(i, i2);
        StringBuilder sb = new StringBuilder();
        sb.append("onConnectionStateChanged newState = ");
        sb.append(i2);
        if (i2 == 11) {
            PrivateMeshDeviceBase privateMeshDeviceBase2 = this.f12686R;
            if ((privateMeshDeviceBase2 == null || !privateMeshDeviceBase2.mo31636W1()) && (e2 = m18235e2()) != null && !e2.mo31636W1()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("device ");
                sb2.append(e2.mo23185G());
                sb2.append(" start login");
                e2.mo31638Y1(this.f12685Q.getNetworkName(), this.f12685Q.getPassword());
                this.f12686R = e2;
                e2.mo31646h2(this);
            }
        } else if (i2 == 0 && (privateMeshDeviceBase = this.f12686R) != null && !privateMeshDeviceBase.mo31636W1()) {
            this.f12686R.mo23221d0().mo31549L0(false);
            this.f12686R.mo31646h2((PrivateMeshDeviceBase.C6090a) null);
            this.f12686R = null;
            PrivateMeshDeviceBase e22 = m18235e2();
            if (e22 != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("find next bridge device ");
                sb3.append(e22.mo23185G());
                sb3.append(" start login");
                if (!e22.mo31636W1()) {
                    e22.mo31638Y1(this.f12685Q.getNetworkName(), this.f12685Q.getPassword());
                }
                this.f12686R = e22;
                e22.mo31646h2(this);
                this.f12686R.mo31643d2();
                this.f12686R.mo31644f2();
            }
            if (this.f12686R == null) {
                this.f12563z = 0;
                this.f12690V = 0;
                this.f12691W = 0;
                this.f12687S.clear();
            }
        }
    }

    /* renamed from: p1 */
    public boolean mo23154p1(long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("mesh group start setbrightness : ");
        sb.append(j);
        int i = (int) j;
        this.f12689U = i;
        PrivateMeshDeviceBase privateMeshDeviceBase = this.f12686R;
        if (privateMeshDeviceBase == null) {
            return false;
        }
        privateMeshDeviceBase.mo31641b2(i);
        mo23221d0().mo31600l0(j);
        mo31767Y1();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("mesh group setbrightness : ");
        sb2.append(j);
        return true;
    }

    /* renamed from: t */
    public void mo30160t() {
    }

    /* renamed from: u0 */
    public void mo23161u0(View view) {
        if (!C3108x.m8223f().mo23546j()) {
            Toast.makeText(view.getContext(), view.getContext().getResources().getString(R$string.common_text_please_check_bluetooth), 0).show();
            return;
        }
        Class<MeshGroupMainActivity> cls = null;
        Class<MeshGroupMainActivity> cls2 = MeshGroupMainActivity.class;
        try {
            int i = MeshGroupMainActivity.f10788d;
            cls = cls2;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (cls != null) {
            Intent intent = new Intent();
            intent.setClass(view.getContext(), cls);
            intent.putExtra("com.yeelight.cherry.device_id", mo23185G());
            view.getContext().startActivity(intent);
        }
    }

    /* renamed from: x0 */
    public boolean mo23167x0() {
        PrivateMeshDeviceBase privateMeshDeviceBase = this.f12686R;
        if (privateMeshDeviceBase == null) {
            return false;
        }
        privateMeshDeviceBase.mo31644f2();
        return true;
    }

    /* renamed from: x1 */
    public boolean mo23168x1(C8327s sVar) {
        if (sVar.mo35449p() != 1) {
            return false;
        }
        mo23221d0().mo31600l0((long) sVar.mo35439f());
        PrivateMeshDeviceBase privateMeshDeviceBase = this.f12686R;
        if (privateMeshDeviceBase != null) {
            privateMeshDeviceBase.mo31641b2(sVar.mo35439f());
        }
        return true;
    }

    /* renamed from: y */
    public void mo30163y(int i) {
    }
}

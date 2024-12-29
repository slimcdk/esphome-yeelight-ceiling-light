package com.yeelight.yeelib.p150c;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import androidx.core.internal.view.SupportMenu;
import com.telink.p149b.C3962a;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.models.C7621f0;
import com.yeelight.yeelib.device.models.C7628j;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6047m;
import com.yeelight.yeelib.p150c.p183m.C6459e0;
import com.yeelight.yeelib.p150c.p184n.C7555f;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p153g.C9850s;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p186e.C9769d;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.yeelight.yeelib.c.f */
public class C6000f extends C5980c implements C9769d, C6047m.C6048a {
    /* access modifiers changed from: private */

    /* renamed from: G */
    public String f12706G = C6000f.class.getSimpleName();

    /* renamed from: H */
    private C9850s f12707H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C6047m f12708I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public List<C6004d> f12709J = new CopyOnWriteArrayList();

    /* renamed from: K */
    private boolean f12710K;

    /* renamed from: L */
    private int f12711L = -1;

    /* renamed from: M */
    private int f12712M = 0;

    /* renamed from: N */
    private int f12713N = 0;

    /* renamed from: O */
    private Runnable f12714O = new C6001a();

    /* renamed from: P */
    private Runnable f12715P = new C6002b();

    /* renamed from: com.yeelight.yeelib.c.f$a */
    class C6001a implements Runnable {
        C6001a() {
        }

        public void run() {
            if (C6000f.this.f12708I != null && C6000f.this.f12708I.mo27806W1()) {
                C6000f.this.f12708I.mo27814f2();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.c.f$b */
    class C6002b implements Runnable {
        C6002b() {
        }

        public void run() {
            C6000f.this.f12709J.clear();
            if (C6000f.this.f12708I != null && C6000f.this.f12708I.mo27806W1()) {
                C6000f.this.f12708I.mo27814f2();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.c.f$c */
    class C6003c implements Runnable {
        C6003c() {
        }

        public void run() {
            Iterator<C4200i> it = C6000f.this.f12672x.iterator();
            while (it.hasNext()) {
                C6047m mVar = (C6047m) it.next();
                if (mVar.mo23331k0() && mVar.mo27806W1()) {
                    if (C6000f.this.f12708I == null || !C6000f.this.f12708I.mo27806W1() || !C6000f.this.f12708I.mo27807X1()) {
                        C6047m unused = C6000f.this.f12708I = mVar;
                        C6000f.this.f12708I.mo27816h2(C6000f.this);
                        String unused2 = C6000f.this.f12706G;
                        mVar.mo27813d2();
                        mVar.mo27814f2();
                        return;
                    } else if (mVar.mo27807X1()) {
                        mVar.mo27803T1();
                        return;
                    } else {
                        return;
                    }
                }
            }
            String unused3 = C6000f.this.f12706G;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.f$d */
    public class C6004d {

        /* renamed from: a */
        public boolean f12719a;

        /* renamed from: b */
        public int f12720b;

        /* renamed from: c */
        public int f12721c;

        public C6004d(C6000f fVar, boolean z, int i, int i2) {
            this.f12719a = z;
            this.f12720b = i;
            this.f12721c = i2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return obj != null && (obj instanceof C6004d) && ((C6004d) obj).f12720b == this.f12720b;
        }
    }

    public C6000f(C9850s sVar) {
        super(sVar.mo31821b() + "_" + sVar.mo31820a(), "yeelink.light.gingko.group", new C7555f(sVar.mo31822c()));
        this.f12707H = sVar;
        mo27503P1();
        mo23414j0();
    }

    /* renamed from: e2 */
    private C6047m m17630e2() {
        Iterator<C4200i> it = this.f12672x.iterator();
        while (it.hasNext()) {
            C4198d next = it.next();
            if (next.mo23331k0()) {
                return (C6047m) next;
            }
        }
        return null;
    }

    /* renamed from: i2 */
    private byte[] m17631i2(byte[] bArr) {
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
    public void mo26093E(C4200i iVar) {
    }

    /* renamed from: F */
    public int mo23303F() {
        return R$drawable.icon_yeelight_device_badge_gingko_group_small;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F1 */
    public int mo27495F1() {
        if (this.f12711L == -1) {
            this.f12711L = super.mo27495F1();
        }
        return this.f12711L;
    }

    /* renamed from: H */
    public int mo23306H() {
        return R$drawable.icon_yeelight_device_badge_gingko_group_big;
    }

    /* renamed from: I */
    public C7628j mo23375I() {
        return super.mo23375I();
    }

    /* renamed from: I1 */
    public int mo27496I1() {
        return this.f12674z;
    }

    /* renamed from: L */
    public void mo26094L() {
    }

    /* renamed from: L1 */
    public int[] mo27499L1() {
        return new int[]{this.f12712M, this.f12713N};
    }

    /* renamed from: M1 */
    public int mo27500M1() {
        return (this.f12674z - this.f12712M) - this.f12713N;
    }

    /* renamed from: P1 */
    public void mo27503P1() {
        this.f12671A.removeCallbacksAndMessages((Object) null);
        List<C4198d> u0 = C4257w.m11947l0().mo23690u0();
        "Init list - all devices:" + u0.size();
        Iterator<C4200i> it = this.f12672x.iterator();
        while (it.hasNext()) {
            C4198d next = it.next();
            next.mo23319V0(this);
            ((C6459e0) next).mo27816h2((C6047m.C6048a) null);
        }
        this.f12712M = 0;
        this.f12713N = 0;
        this.f12674z = 0;
        this.f12672x.clear();
        if (this.f12708I == null) {
            this.f12709J.clear();
        }
        this.f12708I = null;
        for (C4198d next2 : u0) {
            if (next2 instanceof C6459e0) {
                C6459e0 e0Var = (C6459e0) next2;
                if (e0Var.mo27805V1().equals(this.f12707H)) {
                    this.f12672x.add(e0Var);
                    next2.mo23358z0(this);
                    "device count = " + this.f12674z + "， current Device = " + next2.mo23372G();
                    if (e0Var.mo27806W1() && this.f12708I == null) {
                        this.f12708I = e0Var;
                        e0Var.mo27816h2(this);
                        this.f12708I.mo27813d2();
                        this.f12708I.mo27814f2();
                    } else if (this.f12708I != null && e0Var.mo27807X1()) {
                        e0Var.mo28183o3();
                        e0Var.mo27803T1();
                    }
                }
            }
        }
        mo27512Y1();
    }

    /* renamed from: Q1 */
    public void mo27504Q1() {
        this.f7245h = new C7621f0(mo23330i1());
    }

    /* renamed from: U0 */
    public boolean mo23317U0() {
        C4257w.m11947l0().mo23686r1(mo23372G());
        DeviceDataProvider.m22408l(this.f12707H.mo31820a());
        mo27512Y1();
        Iterator<C4200i> it = this.f12672x.iterator();
        while (it.hasNext()) {
            C4198d next = it.next();
            if (next instanceof C6459e0) {
                C6459e0 e0Var = (C6459e0) next;
                e0Var.mo27817i2(new C9850s());
                if (e0Var.mo27806W1()) {
                    e0Var.mo28183o3();
                }
            }
        }
        return true;
    }

    /* renamed from: Y1 */
    public void mo27512Y1() {
        mo23408d0().mo27687f0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0111, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo27538b(int r6, boolean r7, int r8, int r9) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0112 }
            r0.<init>()     // Catch:{ all -> 0x0112 }
            java.lang.String r1 = "onMesh status onMeshDeviceFound address = "
            r0.append(r1)     // Catch:{ all -> 0x0112 }
            r0.append(r6)     // Catch:{ all -> 0x0112 }
            java.lang.String r1 = " , isOpen = "
            r0.append(r1)     // Catch:{ all -> 0x0112 }
            r0.append(r7)     // Catch:{ all -> 0x0112 }
            java.lang.String r1 = ", brightness = "
            r0.append(r1)     // Catch:{ all -> 0x0112 }
            r0.append(r8)     // Catch:{ all -> 0x0112 }
            java.lang.String r1 = ", opCode ="
            r0.append(r1)     // Catch:{ all -> 0x0112 }
            java.lang.String r1 = java.lang.Integer.toHexString(r9)     // Catch:{ all -> 0x0112 }
            r0.append(r1)     // Catch:{ all -> 0x0112 }
            r0.toString()     // Catch:{ all -> 0x0112 }
            if (r6 != 0) goto L_0x0031
            monitor-exit(r5)
            return
        L_0x0031:
            com.telink.bluetooth.light.a r0 = com.telink.bluetooth.light.C3967a.BLE_GATT_OP_CTRL_DB     // Catch:{ all -> 0x0112 }
            byte r0 = r0.mo22535a()     // Catch:{ all -> 0x0112 }
            r1 = 0
            r2 = 1
            if (r9 == r0) goto L_0x0078
            android.os.Handler r9 = r5.f12671A     // Catch:{ all -> 0x0112 }
            java.lang.Runnable r0 = r5.f12714O     // Catch:{ all -> 0x0112 }
            r9.removeCallbacks(r0)     // Catch:{ all -> 0x0112 }
            android.os.Handler r9 = r5.f12671A     // Catch:{ all -> 0x0112 }
            java.lang.Runnable r0 = r5.f12714O     // Catch:{ all -> 0x0112 }
            r3 = 1000(0x3e8, double:4.94E-321)
            r9.postDelayed(r0, r3)     // Catch:{ all -> 0x0112 }
            java.util.List<com.yeelight.yeelib.c.f$d> r9 = r5.f12709J     // Catch:{ all -> 0x0112 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0112 }
        L_0x0051:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0112 }
            if (r0 == 0) goto L_0x0064
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x0112 }
            com.yeelight.yeelib.c.f$d r0 = (com.yeelight.yeelib.p150c.C6000f.C6004d) r0     // Catch:{ all -> 0x0112 }
            int r3 = r0.f12720b     // Catch:{ all -> 0x0112 }
            if (r3 != r6) goto L_0x0051
            r0.f12719a = r7     // Catch:{ all -> 0x0112 }
            r1 = 1
        L_0x0064:
            if (r1 != 0) goto L_0x0110
            com.yeelight.yeelib.c.f$d r9 = new com.yeelight.yeelib.c.f$d     // Catch:{ all -> 0x0112 }
            r9.<init>(r5, r7, r6, r8)     // Catch:{ all -> 0x0112 }
            int r6 = r9.f12721c     // Catch:{ all -> 0x0112 }
            if (r6 >= 0) goto L_0x0071
            r9.f12721c = r2     // Catch:{ all -> 0x0112 }
        L_0x0071:
            java.util.List<com.yeelight.yeelib.c.f$d> r6 = r5.f12709J     // Catch:{ all -> 0x0112 }
            r6.add(r9)     // Catch:{ all -> 0x0112 }
            goto L_0x0110
        L_0x0078:
            java.util.List<com.yeelight.yeelib.c.f$d> r9 = r5.f12709J     // Catch:{ all -> 0x0112 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0112 }
        L_0x007e:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0112 }
            if (r0 == 0) goto L_0x0094
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x0112 }
            com.yeelight.yeelib.c.f$d r0 = (com.yeelight.yeelib.p150c.C6000f.C6004d) r0     // Catch:{ all -> 0x0112 }
            int r3 = r0.f12720b     // Catch:{ all -> 0x0112 }
            if (r3 != r6) goto L_0x007e
            r0.f12719a = r7     // Catch:{ all -> 0x0112 }
            r0.f12721c = r8     // Catch:{ all -> 0x0112 }
            r9 = 1
            goto L_0x0095
        L_0x0094:
            r9 = 0
        L_0x0095:
            if (r9 != 0) goto L_0x00a7
            com.yeelight.yeelib.c.f$d r9 = new com.yeelight.yeelib.c.f$d     // Catch:{ all -> 0x0112 }
            r9.<init>(r5, r7, r6, r8)     // Catch:{ all -> 0x0112 }
            int r6 = r9.f12721c     // Catch:{ all -> 0x0112 }
            if (r6 >= 0) goto L_0x00a2
            r9.f12721c = r2     // Catch:{ all -> 0x0112 }
        L_0x00a2:
            java.util.List<com.yeelight.yeelib.c.f$d> r6 = r5.f12709J     // Catch:{ all -> 0x0112 }
            r6.add(r9)     // Catch:{ all -> 0x0112 }
        L_0x00a7:
            r5.f12710K = r1     // Catch:{ all -> 0x0112 }
            r5.f12712M = r1     // Catch:{ all -> 0x0112 }
            r5.f12713N = r1     // Catch:{ all -> 0x0112 }
            java.util.List<com.yeelight.yeelib.c.f$d> r6 = r5.f12709J     // Catch:{ all -> 0x0112 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0112 }
        L_0x00b3:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0112 }
            if (r7 == 0) goto L_0x00d8
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0112 }
            com.yeelight.yeelib.c.f$d r7 = (com.yeelight.yeelib.p150c.C6000f.C6004d) r7     // Catch:{ all -> 0x0112 }
            boolean r8 = r7.f12719a     // Catch:{ all -> 0x0112 }
            if (r8 == 0) goto L_0x00cb
            r5.f12710K = r2     // Catch:{ all -> 0x0112 }
            int r8 = r5.f12712M     // Catch:{ all -> 0x0112 }
            int r8 = r8 + r2
            r5.f12712M = r8     // Catch:{ all -> 0x0112 }
            goto L_0x00d0
        L_0x00cb:
            int r8 = r5.f12713N     // Catch:{ all -> 0x0112 }
            int r8 = r8 + r2
            r5.f12713N = r8     // Catch:{ all -> 0x0112 }
        L_0x00d0:
            int r8 = r7.f12721c     // Catch:{ all -> 0x0112 }
            if (r1 >= r8) goto L_0x00b3
            int r7 = r7.f12721c     // Catch:{ all -> 0x0112 }
            r1 = r7
            goto L_0x00b3
        L_0x00d8:
            r5.f12711L = r1     // Catch:{ all -> 0x0112 }
            java.util.List<com.yeelight.yeelib.c.f$d> r6 = r5.f12709J     // Catch:{ all -> 0x0112 }
            int r6 = r6.size()     // Catch:{ all -> 0x0112 }
            r5.f12674z = r6     // Catch:{ all -> 0x0112 }
            com.yeelight.yeelib.c.i.e r6 = r5.mo23408d0()     // Catch:{ all -> 0x0112 }
            long r7 = (long) r1     // Catch:{ all -> 0x0112 }
            r6.mo27697k0(r7)     // Catch:{ all -> 0x0112 }
            com.yeelight.yeelib.c.i.e r6 = r5.mo23408d0()     // Catch:{ all -> 0x0112 }
            boolean r7 = r5.f12710K     // Catch:{ all -> 0x0112 }
            r6.mo27648K0(r7)     // Catch:{ all -> 0x0112 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0112 }
            r6.<init>()     // Catch:{ all -> 0x0112 }
            java.lang.String r7 = "device size: "
            r6.append(r7)     // Catch:{ all -> 0x0112 }
            java.util.List<com.yeelight.yeelib.c.f$d> r7 = r5.f12709J     // Catch:{ all -> 0x0112 }
            int r7 = r7.size()     // Catch:{ all -> 0x0112 }
            r6.append(r7)     // Catch:{ all -> 0x0112 }
            r6.toString()     // Catch:{ all -> 0x0112 }
            com.yeelight.yeelib.c.i.e r6 = r5.mo23408d0()     // Catch:{ all -> 0x0112 }
            r6.mo27687f0()     // Catch:{ all -> 0x0112 }
        L_0x0110:
            monitor-exit(r5)
            return
        L_0x0112:
            r6 = move-exception
            monitor-exit(r5)
            goto L_0x0116
        L_0x0115:
            throw r6
        L_0x0116:
            goto L_0x0115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.C6000f.mo27538b(int, boolean, int, int):void");
    }

    /* renamed from: b1 */
    public boolean mo23326b1() {
        return mo27539d2(SupportMenu.USER_MASK);
    }

    /* renamed from: d2 */
    public boolean mo27539d2(int i) {
        C6047m mVar = this.f12708I;
        if (mVar == null) {
            return false;
        }
        if (!mVar.mo27807X1()) {
            this.f12708I.mo27813d2();
        }
        this.f12708I.mo27809Z1(i);
        this.f12710K = false;
        mo23408d0().mo27648K0(false);
        mo27512Y1();
        return true;
    }

    /* renamed from: e */
    public void mo27540e(int i) {
        "device offline:" + i;
        this.f12671A.removeCallbacks(this.f12715P);
        this.f12671A.postDelayed(this.f12715P, 2000);
    }

    /* renamed from: f */
    public void mo27541f() {
        this.f12671A.postDelayed(new C6003c(), 500);
    }

    /* renamed from: f2 */
    public List<C6004d> mo27542f2() {
        return this.f12709J;
    }

    /* renamed from: g2 */
    public C9850s mo27543g2() {
        return this.f12707H;
    }

    /* renamed from: h2 */
    public boolean mo27544h2(int i) {
        C6047m mVar = this.f12708I;
        if (mVar == null) {
            return false;
        }
        if (!mVar.mo27807X1()) {
            this.f12708I.mo27813d2();
        }
        this.f12708I.mo27810a2(i);
        this.f12710K = true;
        mo23408d0().mo27648K0(true);
        mo27512Y1();
        return true;
    }

    /* renamed from: i */
    public void mo27545i() {
    }

    /* renamed from: i1 */
    public String mo23330i1() {
        return "yeelink.light.gingko";
    }

    /* renamed from: k */
    public void mo26095k() {
    }

    /* renamed from: k0 */
    public boolean mo23331k0() {
        return this.f12708I != null;
    }

    /* renamed from: k1 */
    public boolean mo23332k1() {
        return this.f12710K;
    }

    /* renamed from: l0 */
    public boolean mo23333l0() {
        Iterator<C4200i> it = this.f12672x.iterator();
        while (it.hasNext()) {
            if (it.next().mo23333l0()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        return mo27544h2(SupportMenu.USER_MASK);
    }

    /* renamed from: m */
    public void mo26096m(C4200i iVar) {
        if (iVar instanceof C6047m) {
            C6047m mVar = (C6047m) iVar;
            String str = new String(m17631i2((byte[]) mVar.mo27804U1("ADV_MESH_NAME")));
            "mesh group on Device found:" + str + " , bytes= " + C3962a.m10649a(m17631i2((byte[]) mVar.mo27804U1("ADV_MESH_NAME")), Constants.COLON_SEPARATOR);
            if (mo23397U().equals(str)) {
                if (this.f12672x.contains(iVar)) {
                    this.f12672x.remove(iVar);
                    iVar.mo23358z0(this);
                    mVar.mo27816h2(this);
                }
                this.f12672x.add(iVar);
                "on Device found device count = " + this.f12672x.size();
            }
        }
    }

    /* renamed from: n */
    public void mo23337n() {
        Iterator<C4200i> it = this.f12672x.iterator();
        while (it.hasNext()) {
            C4198d next = it.next();
            if (next.mo23416o0()) {
                next.mo23337n();
                return;
            }
        }
    }

    /* renamed from: o */
    public void mo26097o() {
    }

    /* renamed from: o0 */
    public boolean mo23416o0() {
        Iterator<C4200i> it = this.f12672x.iterator();
        while (it.hasNext()) {
            if (it.next().mo23416o0()) {
                return true;
            }
        }
        return false;
    }

    public void onConnectionStateChanged(int i, int i2) {
        C6047m mVar;
        C6047m e2;
        super.onConnectionStateChanged(i, i2);
        "onConnectionStateChanged newState = " + i2;
        if (i2 == 11) {
            C6047m mVar2 = this.f12708I;
            if ((mVar2 == null || !mVar2.mo27806W1()) && (e2 = m17630e2()) != null && !e2.mo27806W1()) {
                "device " + e2.mo23372G() + " start login";
                e2.mo27808Y1(this.f12707H.mo31822c(), this.f12707H.mo31823d());
                this.f12708I = e2;
                e2.mo27816h2(this);
            }
        } else if (i2 == 0 && (mVar = this.f12708I) != null && !mVar.mo27806W1()) {
            this.f12708I.mo23408d0().mo27646J0(false);
            this.f12708I.mo27816h2((C6047m.C6048a) null);
            this.f12708I = null;
            C6047m e22 = m17630e2();
            if (e22 != null) {
                "find next bridge device " + e22.mo23372G() + " start login";
                if (!e22.mo27806W1()) {
                    e22.mo27808Y1(this.f12707H.mo31822c(), this.f12707H.mo31823d());
                }
                this.f12708I = e22;
                e22.mo27816h2(this);
                this.f12708I.mo27813d2();
                this.f12708I.mo27814f2();
            }
            if (this.f12708I == null) {
                this.f12674z = 0;
                this.f12712M = 0;
                this.f12713N = 0;
                this.f12709J.clear();
            }
        }
    }

    /* renamed from: p1 */
    public boolean mo23340p1(long j) {
        "mesh group start setbrightness : " + j;
        int i = (int) j;
        this.f12711L = i;
        C6047m mVar = this.f12708I;
        if (mVar == null) {
            return false;
        }
        mVar.mo27811b2(i);
        mo23408d0().mo27697k0(j);
        mo27512Y1();
        "mesh group setbrightness : " + j;
        return true;
    }

    /* renamed from: t */
    public void mo26104t() {
    }

    /* renamed from: u0 */
    public void mo23347u0(View view) {
        if (!C4297y.m12064f().mo23736j()) {
            Toast.makeText(view.getContext(), view.getContext().getResources().getString(R$string.common_text_please_check_bluetooth), 0).show();
            return;
        }
        Class<?> cls = null;
        try {
            cls = Class.forName("com.yeelight.cherry.ui.activity.MeshGroupMainActivity");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (cls != null) {
            Intent intent = new Intent();
            intent.setClass(view.getContext(), cls);
            intent.putExtra("com.yeelight.cherry.device_id", mo23372G());
            view.getContext().startActivity(intent);
        }
    }

    /* renamed from: x0 */
    public boolean mo23354x0() {
        C6047m mVar = this.f12708I;
        if (mVar == null) {
            return false;
        }
        mVar.mo27814f2();
        return true;
    }

    /* renamed from: x1 */
    public boolean mo23355x1(C9856y yVar) {
        if (yVar.mo31884p() != 1) {
            return false;
        }
        mo23408d0().mo27697k0((long) yVar.mo31874f());
        C6047m mVar = this.f12708I;
        if (mVar != null) {
            mVar.mo27811b2(yVar.mo31874f());
        }
        return true;
    }

    /* renamed from: y */
    public void mo26107y(int i) {
    }
}

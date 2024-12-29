package com.yeelight.yeelib.device.base;

import android.view.View;
import com.miot.common.abstractdevice.AbstractDevice;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.models.C8327s;
import p207s3.C10344f;
import p232y3.C12041e;

/* renamed from: com.yeelight.yeelib.device.base.h */
public abstract class C6117h extends C10344f {

    /* renamed from: C */
    protected int f12553C;

    /* renamed from: Q */
    private C6118a[] f12554Q;

    /* renamed from: com.yeelight.yeelib.device.base.h$a */
    public class C6118a {

        /* renamed from: a */
        private boolean f12555a;

        /* renamed from: b */
        private int f12556b;

        /* renamed from: c */
        private C12041e f12557c;

        public C6118a() {
        }

        /* renamed from: a */
        public void mo31742a(C12041e eVar) {
            this.f12557c = eVar;
            C6117h.this.mo23221d0().mo31592h0(4096);
        }

        /* renamed from: b */
        public C12041e mo31743b() {
            return this.f12557c;
        }

        /* renamed from: c */
        public int mo31744c() {
            return this.f12556b;
        }

        /* renamed from: d */
        public boolean mo31745d() {
            return this.f12555a;
        }

        /* renamed from: e */
        public void mo31746e(int i) {
            if (this.f12556b != i) {
                this.f12556b = i;
                C6117h.this.mo23221d0().mo31592h0(4096);
            }
        }

        /* renamed from: f */
        public void mo31747f(boolean z) {
            DeviceStatusBase deviceStatusBase;
            int i;
            if (this.f12555a != z) {
                this.f12555a = z;
                if (z) {
                    deviceStatusBase = C6117h.this.mo23221d0();
                    i = 1;
                } else {
                    deviceStatusBase = C6117h.this.mo23221d0();
                    i = 2;
                }
                deviceStatusBase.mo31592h0(i);
            }
        }

        /* renamed from: g */
        public void mo31748g(int i) {
            C12041e eVar = this.f12557c;
            if (eVar != null && eVar.mo42681e(i)) {
                C6117h.this.mo23221d0().mo31592h0(4096);
            }
        }
    }

    public C6117h(String str, String str2, String str3, int i, String str4, int i2) {
        super(str, str2, str3, i, str4);
        this.f12554Q = new C6118a[i2];
        int i3 = 0;
        while (true) {
            C6118a[] aVarArr = this.f12554Q;
            if (i3 < aVarArr.length) {
                aVarArr[i3] = new C6118a();
                this.f12554Q[i3].mo31742a(new C12041e(0, 0));
                i3++;
            } else {
                return;
            }
        }
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        return false;
    }

    /* renamed from: F */
    public int mo23116F() {
        return 0;
    }

    /* renamed from: H */
    public int mo23119H() {
        return 0;
    }

    /* renamed from: b1 */
    public boolean mo23140b1() {
        return false;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        return false;
    }

    /* renamed from: f1 */
    public boolean mo23142f1(boolean z) {
        return false;
    }

    /* renamed from: g0 */
    public int mo23143g0() {
        return 0;
    }

    /* renamed from: k0 */
    public boolean mo23145k0() {
        AbstractDevice abstractDevice = this.f4749n;
        return abstractDevice != null && abstractDevice.isOnline();
    }

    /* renamed from: l0 */
    public boolean mo23147l0() {
        return false;
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        return false;
    }

    /* renamed from: m1 */
    public boolean mo23150m1(int i) {
        return false;
    }

    /* renamed from: n */
    public void mo23151n() {
    }

    /* renamed from: o0 */
    public boolean mo23230o0() {
        return mo23145k0();
    }

    /* renamed from: o1 */
    public boolean mo23152o1(DeviceStatusBase.DeviceMode deviceMode) {
        return false;
    }

    /* renamed from: p0 */
    public boolean mo23153p0() {
        return false;
    }

    /* renamed from: p1 */
    public boolean mo23154p1(long j) {
        return false;
    }

    /* renamed from: p2 */
    public int mo31738p2() {
        return this.f12553C;
    }

    /* renamed from: q1 */
    public boolean mo23155q1(int i) {
        return false;
    }

    /* renamed from: q2 */
    public C6118a mo31739q2(int i) {
        C6118a[] aVarArr = this.f12554Q;
        if (aVarArr == null) {
            return null;
        }
        return aVarArr[i];
    }

    /* renamed from: r */
    public void mo23156r() {
    }

    /* renamed from: r1 */
    public boolean mo23157r1(int i, int[] iArr, int i2) {
        return false;
    }

    /* renamed from: r2 */
    public boolean mo31740r2() {
        C12041e b = mo31739q2(this.f12553C).mo31743b();
        if (b != null) {
            return b.mo42679c();
        }
        return false;
    }

    /* renamed from: s */
    public boolean mo23158s(ActionType actionType) {
        return false;
    }

    /* renamed from: s1 */
    public boolean mo23159s1(int i) {
        return false;
    }

    /* renamed from: s2 */
    public void mo31741s2(int i) {
        this.f12553C = i;
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        return false;
    }

    /* renamed from: u0 */
    public void mo23161u0(View view) {
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        return false;
    }

    /* renamed from: w0 */
    public boolean mo23164w0(String str) {
        return false;
    }

    /* renamed from: w1 */
    public boolean mo23165w1(DeviceStatusBase.DeviceMode deviceMode) {
        return false;
    }

    /* renamed from: x0 */
    public boolean mo23167x0() {
        return false;
    }

    /* renamed from: x1 */
    public boolean mo23168x1(C8327s sVar) {
        return false;
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[0];
    }
}

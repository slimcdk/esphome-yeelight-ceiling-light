package com.yeelight.yeelib.p150c.p151i;

import android.view.View;
import com.miot.common.abstractdevice.AbstractDevice;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p184n.C7554e;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p185d.C7563a;

/* renamed from: com.yeelight.yeelib.c.i.p */
public abstract class C6072p extends C6067o {

    /* renamed from: G */
    protected int f12899G;

    /* renamed from: H */
    private C6073a[] f12900H;

    /* renamed from: com.yeelight.yeelib.c.i.p$a */
    public class C6073a {

        /* renamed from: a */
        private boolean f12901a;

        /* renamed from: b */
        private int f12902b;

        /* renamed from: c */
        private C7554e f12903c;

        public C6073a() {
        }

        /* renamed from: a */
        public void mo27861a(C7554e eVar) {
            this.f12903c = eVar;
            C6072p.this.mo23408d0().mo27689g0(4096);
        }

        /* renamed from: b */
        public C7554e mo27862b() {
            return this.f12903c;
        }

        /* renamed from: c */
        public int mo27863c() {
            return this.f12902b;
        }

        /* renamed from: d */
        public boolean mo27864d() {
            return this.f12901a;
        }

        /* renamed from: e */
        public void mo27865e(int i) {
            if (this.f12902b != i) {
                this.f12902b = i;
                C6072p.this.mo23408d0().mo27689g0(4096);
            }
        }

        /* renamed from: f */
        public void mo27866f(boolean z) {
            C6024e eVar;
            int i;
            if (this.f12901a != z) {
                this.f12901a = z;
                if (z) {
                    eVar = C6072p.this.mo23408d0();
                    i = 1;
                } else {
                    eVar = C6072p.this.mo23408d0();
                    i = 2;
                }
                eVar.mo27689g0(i);
            }
        }

        /* renamed from: g */
        public void mo27867g(int i) {
            C7554e eVar = this.f12903c;
            if (eVar != null && eVar.mo28884e(i)) {
                C6072p.this.mo23408d0().mo27689g0(4096);
            }
        }
    }

    public C6072p(String str, String str2, String str3, int i, String str4, int i2) {
        super(str, str2, str3, i, str4);
        this.f12900H = new C6073a[i2];
        int i3 = 0;
        while (true) {
            C6073a[] aVarArr = this.f12900H;
            if (i3 < aVarArr.length) {
                aVarArr[i3] = new C6073a();
                this.f12900H[i3].mo27861a(new C7554e(0, 0));
                i3++;
            } else {
                return;
            }
        }
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        return false;
    }

    /* renamed from: F */
    public int mo23303F() {
        return 0;
    }

    /* renamed from: H */
    public int mo23306H() {
        return 0;
    }

    /* renamed from: b1 */
    public boolean mo23326b1() {
        return false;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        return false;
    }

    /* renamed from: f1 */
    public boolean mo23328f1(boolean z) {
        return false;
    }

    /* renamed from: g0 */
    public int mo23329g0() {
        return 0;
    }

    /* renamed from: k0 */
    public boolean mo23331k0() {
        AbstractDevice abstractDevice = this.f7251n;
        return abstractDevice != null && abstractDevice.isOnline();
    }

    /* renamed from: l0 */
    public boolean mo23333l0() {
        return false;
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        return false;
    }

    /* renamed from: m1 */
    public boolean mo23336m1(int i) {
        return false;
    }

    /* renamed from: n */
    public void mo23337n() {
    }

    /* renamed from: o0 */
    public boolean mo23416o0() {
        return mo23331k0();
    }

    /* renamed from: o1 */
    public boolean mo23338o1(C6024e.C6028d dVar) {
        return false;
    }

    /* renamed from: p0 */
    public boolean mo23339p0() {
        return false;
    }

    /* renamed from: p1 */
    public boolean mo23340p1(long j) {
        return false;
    }

    /* renamed from: p2 */
    public int mo27857p2() {
        return this.f12899G;
    }

    /* renamed from: q1 */
    public boolean mo23341q1(int i) {
        return false;
    }

    /* renamed from: q2 */
    public C6073a mo27858q2(int i) {
        C6073a[] aVarArr = this.f12900H;
        if (aVarArr == null) {
            return null;
        }
        return aVarArr[i];
    }

    /* renamed from: r */
    public void mo23342r() {
    }

    /* renamed from: r1 */
    public boolean mo23343r1(int i, int[] iArr, int i2) {
        return false;
    }

    /* renamed from: r2 */
    public boolean mo27859r2() {
        C7554e b = mo27858q2(this.f12899G).mo27862b();
        if (b != null) {
            return b.mo28882c();
        }
        return false;
    }

    /* renamed from: s */
    public boolean mo23344s(C7563a aVar) {
        return false;
    }

    /* renamed from: s1 */
    public boolean mo23345s1(int i) {
        return false;
    }

    /* renamed from: s2 */
    public void mo27860s2(int i) {
        this.f12899G = i;
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        return false;
    }

    /* renamed from: u0 */
    public void mo23347u0(View view) {
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        return false;
    }

    /* renamed from: v1 */
    public boolean mo23350v1(boolean z) {
        return false;
    }

    /* renamed from: w0 */
    public boolean mo23351w0(String str) {
        return false;
    }

    /* renamed from: w1 */
    public boolean mo23352w1(C6024e.C6028d dVar) {
        return false;
    }

    /* renamed from: x0 */
    public boolean mo23354x0() {
        return false;
    }

    /* renamed from: x1 */
    public boolean mo23355x1(C9856y yVar) {
        return false;
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[0];
    }
}

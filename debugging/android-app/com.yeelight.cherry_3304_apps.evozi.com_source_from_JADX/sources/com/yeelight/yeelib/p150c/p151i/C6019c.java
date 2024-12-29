package com.yeelight.yeelib.p150c.p151i;

import com.p146mi.iot.common.error.IotError;
import com.p146mi.iot.common.handler.CompletedHandler;

/* renamed from: com.yeelight.yeelib.c.i.c */
public abstract class C6019c extends C6067o {

    /* renamed from: G */
    protected Integer f12745G;

    /* renamed from: H */
    protected Boolean f12746H;

    /* renamed from: I */
    protected boolean f12747I;

    /* renamed from: J */
    protected int f12748J;

    /* renamed from: K */
    protected int f12749K;

    /* renamed from: L */
    protected int f12750L;

    /* renamed from: M */
    protected boolean f12751M;

    /* renamed from: N */
    protected boolean f12752N;

    /* renamed from: com.yeelight.yeelib.c.i.c$a */
    class C6020a implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f12753a;

        C6020a(int i) {
            this.f12753a = i;
        }

        public void onFailed(IotError iotError) {
        }

        public void onSucceed() {
            C6019c.this.f12745G = Integer.valueOf(this.f12753a);
            C6019c.this.mo23408d0().mo27689g0(67108864);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.i.c$b */
    class C6021b implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f12755a;

        C6021b(int i) {
            this.f12755a = i;
        }

        public void onFailed(IotError iotError) {
        }

        public void onSucceed() {
            C6019c.this.f12749K = this.f12755a;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.i.c$c */
    class C6022c implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f12757a;

        C6022c(boolean z) {
            this.f12757a = z;
        }

        public void onFailed(IotError iotError) {
        }

        public void onSucceed() {
            "setHandoperateen onSucceed: " + this.f12757a;
            C6019c cVar = C6019c.this;
            cVar.f12747I = this.f12757a;
            cVar.mo23408d0().mo27689g0(4096);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.i.c$d */
    class C6023d implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f12759a;

        C6023d(int i) {
            this.f12759a = i;
        }

        public void onFailed(IotError iotError) {
        }

        public void onSucceed() {
            "setRcCtrlType onSucceed: " + this.f12759a;
            C6019c cVar = C6019c.this;
            cVar.f12748J = this.f12759a;
            cVar.mo23408d0().mo27689g0(4096);
        }
    }

    public C6019c(String str, String str2, String str3, int i, String str4) {
        super(str, str2, str3, i, str4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A2 */
    public void mo27615A2(int i, int i2, int i3) {
        mo27843b2(i, i2, Integer.valueOf(i3), new C6021b(i3));
    }

    /* renamed from: p2 */
    public int mo27616p2() {
        return this.f12749K;
    }

    /* renamed from: q2 */
    public Integer mo27617q2() {
        return this.f12745G;
    }

    /* renamed from: r2 */
    public boolean mo27618r2() {
        return this.f12747I;
    }

    /* renamed from: s2 */
    public int mo27619s2() {
        return this.f12748J;
    }

    /* renamed from: t2 */
    public int mo27620t2() {
        return this.f12750L;
    }

    /* renamed from: u2 */
    public void mo27621u2(int i) {
        this.f12749K = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo27622v2(int i, int i2, boolean z) {
        mo27843b2(i, i2, Boolean.valueOf(z), new C6022c(z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: w2 */
    public void mo27623w2(int i, int i2, int i3) {
        mo27843b2(i, i2, Integer.valueOf(i3), new C6020a(i3));
    }

    /* renamed from: x2 */
    public void mo27624x2(int i) {
        mo27625y2(i, (CompletedHandler) null);
    }

    /* renamed from: y2 */
    public abstract void mo27625y2(int i, CompletedHandler completedHandler);

    /* access modifiers changed from: protected */
    /* renamed from: z2 */
    public void mo27626z2(int i, int i2, int i3) {
        mo27843b2(i, i2, Integer.valueOf(i3), new C6023d(i3));
    }
}

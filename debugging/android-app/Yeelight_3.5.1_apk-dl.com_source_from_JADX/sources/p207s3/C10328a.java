package p207s3;

import com.p022mi.iot.common.error.IotError;
import com.p022mi.iot.common.handler.CompletedHandler;

/* renamed from: s3.a */
public abstract class C10328a extends C10344f {

    /* renamed from: C */
    protected Integer f19400C;

    /* renamed from: Q */
    protected Boolean f19401Q;

    /* renamed from: R */
    protected boolean f19402R;

    /* renamed from: S */
    protected int f19403S;

    /* renamed from: T */
    protected int f19404T;

    /* renamed from: U */
    protected int f19405U;

    /* renamed from: V */
    protected boolean f19406V;

    /* renamed from: W */
    protected boolean f19407W;

    /* renamed from: s3.a$a */
    class C10329a implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f19408a;

        C10329a(int i) {
            this.f19408a = i;
        }

        public void onFailed(IotError iotError) {
        }

        public void onSucceed() {
            C10328a.this.f19400C = Integer.valueOf(this.f19408a);
            C10328a.this.mo23221d0().mo31592h0(67108864);
        }
    }

    /* renamed from: s3.a$b */
    class C10330b implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f19410a;

        C10330b(int i) {
            this.f19410a = i;
        }

        public void onFailed(IotError iotError) {
        }

        public void onSucceed() {
            C10328a.this.f19404T = this.f19410a;
        }
    }

    /* renamed from: s3.a$c */
    class C10331c implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f19412a;

        C10331c(boolean z) {
            this.f19412a = z;
        }

        public void onFailed(IotError iotError) {
        }

        public void onSucceed() {
            StringBuilder sb = new StringBuilder();
            sb.append("setHandoperateen onSucceed: ");
            sb.append(this.f19412a);
            C10328a aVar = C10328a.this;
            aVar.f19402R = this.f19412a;
            aVar.mo23221d0().mo31592h0(4096);
        }
    }

    /* renamed from: s3.a$d */
    class C10332d implements CompletedHandler {

        /* renamed from: a */
        final /* synthetic */ int f19414a;

        C10332d(int i) {
            this.f19414a = i;
        }

        public void onFailed(IotError iotError) {
        }

        public void onSucceed() {
            StringBuilder sb = new StringBuilder();
            sb.append("setRcCtrlType onSucceed: ");
            sb.append(this.f19414a);
            C10328a aVar = C10328a.this;
            aVar.f19403S = this.f19414a;
            aVar.mo23221d0().mo31592h0(4096);
        }
    }

    public C10328a(String str, String str2, String str3, int i, String str4) {
        super(str, str2, str3, i, str4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A2 */
    public void mo41868A2(int i, int i2, int i3) {
        mo31729b2(i, i2, Integer.valueOf(i3), new C10330b(i3));
    }

    /* renamed from: p2 */
    public int mo41869p2() {
        return this.f19404T;
    }

    /* renamed from: q2 */
    public Integer mo41870q2() {
        return this.f19400C;
    }

    /* renamed from: r2 */
    public boolean mo41871r2() {
        return this.f19402R;
    }

    /* renamed from: s2 */
    public int mo41872s2() {
        return this.f19403S;
    }

    /* renamed from: t2 */
    public int mo41873t2() {
        return this.f19405U;
    }

    /* renamed from: u2 */
    public void mo41874u2(int i) {
        this.f19404T = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo41875v2(int i, int i2, boolean z) {
        mo31729b2(i, i2, Boolean.valueOf(z), new C10331c(z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: w2 */
    public void mo41876w2(int i, int i2, int i3) {
        mo31729b2(i, i2, Integer.valueOf(i3), new C10329a(i3));
    }

    /* renamed from: x2 */
    public void mo41877x2(int i) {
        mo41878y2(i, (CompletedHandler) null);
    }

    /* renamed from: y2 */
    public abstract void mo41878y2(int i, CompletedHandler completedHandler);

    /* access modifiers changed from: protected */
    /* renamed from: z2 */
    public void mo41879z2(int i, int i2, int i3) {
        mo31729b2(i, i2, Integer.valueOf(i3), new C10332d(i3));
    }
}

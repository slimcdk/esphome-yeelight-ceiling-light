package p035g;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.C0688a;
import com.google.android.datatransport.runtime.dagger.internal.C0689b;
import com.google.android.datatransport.runtime.dagger.internal.C0690c;
import com.google.android.datatransport.runtime.dagger.internal.C0691d;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.concurrent.Executor;
import p035g.C3204t;
import p039h.C3225e;
import p039h.C3228g;
import p064m.C3326c;
import p064m.C3327d;
import p064m.C3330g;
import p064m.C3332i;
import p068n.C3350p;
import p068n.C3351q;
import p068n.C3352t;
import p068n.C3353u;
import p068n.C3354v;
import p075o.C3388d;
import p075o.C3392g;
import p075o.C3394h;
import p075o.C3395i;
import p075o.C3397j;
import p075o.C3400m0;
import p075o.C3405n0;
import p075o.C3408u0;
import p083q.C3606c;
import p083q.C3608d;
import p191o4.C9779a;

/* renamed from: g.e */
final class C3182e extends C3204t {

    /* renamed from: a */
    private C9779a<Executor> f5139a;

    /* renamed from: b */
    private C9779a<Context> f5140b;

    /* renamed from: c */
    private C9779a f5141c;

    /* renamed from: d */
    private C9779a f5142d;

    /* renamed from: e */
    private C9779a f5143e;

    /* renamed from: f */
    private C9779a<String> f5144f;

    /* renamed from: g */
    private C9779a<C3400m0> f5145g;

    /* renamed from: h */
    private C9779a<SchedulerConfig> f5146h;

    /* renamed from: i */
    private C9779a<C3354v> f5147i;

    /* renamed from: j */
    private C9779a<C3326c> f5148j;

    /* renamed from: k */
    private C9779a<C3350p> f5149k;

    /* renamed from: l */
    private C9779a<C3352t> f5150l;

    /* renamed from: m */
    private C9779a<C3203s> f5151m;

    /* renamed from: g.e$b */
    private static final class C3184b implements C3204t.C3205a {

        /* renamed from: a */
        private Context f5152a;

        private C3184b() {
        }

        /* renamed from: b */
        public C3184b mo23742a(Context context) {
            this.f5152a = (Context) C0691d.m536b(context);
            return this;
        }

        public C3204t build() {
            C0691d.m535a(this.f5152a, Context.class);
            return new C3182e(this.f5152a);
        }
    }

    private C3182e(Context context) {
        m8558f(context);
    }

    /* renamed from: d */
    public static C3204t.C3205a m8557d() {
        return new C3184b();
    }

    /* renamed from: f */
    private void m8558f(Context context) {
        this.f5139a = C0688a.m532b(C3191k.m8590a());
        C0689b a = C0690c.m534a(context);
        this.f5140b = a;
        C3225e a2 = C3225e.m8669a(a, C3606c.m10258a(), C3608d.m10262a());
        this.f5141c = a2;
        this.f5142d = C0688a.m532b(C3228g.m8676a(this.f5140b, a2));
        this.f5143e = C3408u0.m9396a(this.f5140b, C3392g.m9274a(), C3395i.m9281a());
        this.f5144f = C3394h.m9278a(this.f5140b);
        this.f5145g = C0688a.m532b(C3405n0.m9379a(C3606c.m10258a(), C3608d.m10262a(), C3397j.m9285a(), this.f5143e, this.f5144f));
        C3330g b = C3330g.m9066b(C3606c.m10258a());
        this.f5146h = b;
        C3332i a3 = C3332i.m9069a(this.f5140b, this.f5145g, b, C3608d.m10262a());
        this.f5147i = a3;
        C9779a<Executor> aVar = this.f5139a;
        C9779a aVar2 = this.f5142d;
        C9779a<C3400m0> aVar3 = this.f5145g;
        this.f5148j = C3327d.m9060a(aVar, aVar2, a3, aVar3, aVar3);
        C9779a<Context> aVar4 = this.f5140b;
        C9779a aVar5 = this.f5142d;
        C9779a<C3400m0> aVar6 = this.f5145g;
        this.f5149k = C3351q.m9151a(aVar4, aVar5, aVar6, this.f5147i, this.f5139a, aVar6, C3606c.m10258a(), C3608d.m10262a(), this.f5145g);
        C9779a<Executor> aVar7 = this.f5139a;
        C9779a<C3400m0> aVar8 = this.f5145g;
        this.f5150l = C3353u.m9159a(aVar7, aVar8, this.f5147i, aVar8);
        this.f5151m = C0688a.m532b(C3206u.m8632a(C3606c.m10258a(), C3608d.m10262a(), this.f5148j, this.f5149k, this.f5150l));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C3388d mo23740a() {
        return this.f5145g.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C3203s mo23741c() {
        return this.f5151m.get();
    }
}

package p011c.p012a.p019b.p020a.p021i;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.C1324k;
import com.google.android.datatransport.runtime.backends.C1327m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1337g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1347m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1348n;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1351q;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1352r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1353s;
import com.google.android.datatransport.runtime.time.C1356c;
import com.google.android.datatransport.runtime.time.C1357d;
import dagger.internal.C10741a;
import dagger.internal.C10742b;
import dagger.internal.C10743c;
import dagger.internal.C10744d;
import java.util.concurrent.Executor;
import javax.inject.C11584a;
import p011c.p012a.p019b.p020a.p021i.C0493q;
import p011c.p012a.p019b.p020a.p021i.p024u.C0502c;
import p011c.p012a.p019b.p020a.p021i.p024u.C0503d;
import p011c.p012a.p019b.p020a.p021i.p024u.C0506g;
import p011c.p012a.p019b.p020a.p021i.p024u.C0508i;
import p011c.p012a.p019b.p020a.p021i.p024u.p025j.C0514b0;
import p011c.p012a.p019b.p020a.p021i.p024u.p025j.C0519c;
import p011c.p012a.p019b.p020a.p021i.p024u.p025j.C0520c0;
import p011c.p012a.p019b.p020a.p021i.p024u.p025j.C0526f;
import p011c.p012a.p019b.p020a.p021i.p024u.p025j.C0528g;
import p011c.p012a.p019b.p020a.p021i.p024u.p025j.C0530h;
import p011c.p012a.p019b.p020a.p021i.p024u.p025j.C0534i0;

/* renamed from: c.a.b.a.i.d */
final class C0475d extends C0493q {

    /* renamed from: a */
    private C11584a<Executor> f83a;

    /* renamed from: b */
    private C11584a<Context> f84b;

    /* renamed from: c */
    private C11584a f85c;

    /* renamed from: d */
    private C11584a f86d;

    /* renamed from: e */
    private C11584a f87e;

    /* renamed from: f */
    private C11584a<C0514b0> f88f;

    /* renamed from: g */
    private C11584a<C1337g> f89g;

    /* renamed from: h */
    private C11584a<C1353s> f90h;

    /* renamed from: i */
    private C11584a<C0502c> f91i;

    /* renamed from: j */
    private C11584a<C1347m> f92j;

    /* renamed from: k */
    private C11584a<C1351q> f93k;

    /* renamed from: l */
    private C11584a<C0492p> f94l;

    /* renamed from: c.a.b.a.i.d$b */
    private static final class C0477b implements C0493q.C0494a {

        /* renamed from: a */
        private Context f95a;

        private C0477b() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ C0493q.C0494a mo8447a(Context context) {
            mo8448b(context);
            return this;
        }

        /* renamed from: b */
        public C0477b mo8448b(Context context) {
            C10744d.m26605b(context);
            this.f95a = context;
            return this;
        }

        public C0493q build() {
            C10744d.m26604a(this.f95a, Context.class);
            return new C0475d(this.f95a);
        }
    }

    private C0475d(Context context) {
        m83h(context);
    }

    /* renamed from: g */
    public static C0493q.C0494a m82g() {
        return new C0477b();
    }

    /* renamed from: h */
    private void m83h(Context context) {
        this.f83a = C10741a.m26601a(C0484j.m115a());
        C10742b a = C10743c.m26603a(context);
        this.f84b = a;
        C1324k a2 = C1324k.m3481a(a, C1356c.m3560a(), C1357d.m3563a());
        this.f85c = a2;
        this.f86d = C10741a.m26601a(C1327m.m3488a(this.f84b, a2));
        this.f87e = C0534i0.m293a(this.f84b, C0526f.m269a(), C0528g.m274a());
        this.f88f = C10741a.m26601a(C0520c0.m248a(C1356c.m3560a(), C1357d.m3563a(), C0530h.m279a(), this.f87e));
        C0506g b = C0506g.m174b(C1356c.m3560a());
        this.f89g = b;
        C0508i a3 = C0508i.m177a(this.f84b, this.f88f, b, C1357d.m3563a());
        this.f90h = a3;
        C11584a<Executor> aVar = this.f83a;
        C11584a aVar2 = this.f86d;
        C11584a<C0514b0> aVar3 = this.f88f;
        this.f91i = C0503d.m169a(aVar, aVar2, a3, aVar3, aVar3);
        C11584a<Context> aVar4 = this.f84b;
        C11584a aVar5 = this.f86d;
        C11584a<C0514b0> aVar6 = this.f88f;
        this.f92j = C1348n.m3546a(aVar4, aVar5, aVar6, this.f90h, this.f83a, aVar6, C1356c.m3560a());
        C11584a<Executor> aVar7 = this.f83a;
        C11584a<C0514b0> aVar8 = this.f88f;
        this.f93k = C1352r.m3554a(aVar7, aVar8, this.f90h, aVar8);
        this.f94l = C10741a.m26601a(C0495r.m153a(C1356c.m3560a(), C1357d.m3563a(), this.f91i, this.f92j, this.f93k));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0519c mo8445a() {
        return this.f88f.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0492p mo8446b() {
        return this.f94l.get();
    }
}

package p068n;

import java.util.concurrent.Executor;
import javax.inject.Inject;
import p035g.C3198o;
import p075o.C3388d;
import p079p.C3590a;

/* renamed from: n.t */
public class C3352t {

    /* renamed from: a */
    private final Executor f5469a;

    /* renamed from: b */
    private final C3388d f5470b;

    /* renamed from: c */
    private final C3354v f5471c;

    /* renamed from: d */
    private final C3590a f5472d;

    @Inject
    C3352t(Executor executor, C3388d dVar, C3354v vVar, C3590a aVar) {
        this.f5469a = executor;
        this.f5470b = dVar;
        this.f5471c = vVar;
        this.f5472d = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m9156d() {
        for (C3198o a : this.f5470b.mo24182U()) {
            this.f5471c.mo24093a(a, 1);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m9157e() {
        this.f5472d.mo24194a(new C9715s(this));
    }

    /* renamed from: c */
    public void mo24102c() {
        this.f5469a.execute(new C9714r(this));
    }
}

package p164h.p165b.p166a.p168i;

import p164h.p165b.p166a.C4423b;
import p164h.p165b.p166a.p240h.p243r.C11243d;
import p164h.p165b.p166a.p240h.p243r.C11244e;

/* renamed from: h.b.a.i.h */
public abstract class C11405h<IN extends C11243d, OUT extends C11244e> extends C11404g {

    /* renamed from: c */
    private final IN f22690c;

    /* renamed from: d */
    protected OUT f22691d;

    protected C11405h(C4423b bVar, IN in) {
        super(bVar);
        this.f22690c = in;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo36172b() {
        this.f22691d = mo36176d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract OUT mo36176d();

    /* renamed from: e */
    public IN mo36177e() {
        return this.f22690c;
    }

    /* renamed from: f */
    public OUT mo36178f() {
        return this.f22691d;
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }
}

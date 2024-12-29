package p230x6;

import org.fourthline.cling.C10010b;
import org.fourthline.cling.model.message.C10030d;
import org.fourthline.cling.model.message.C10031e;

/* renamed from: x6.f */
public abstract class C12009f<IN extends C10030d, OUT extends C10031e> extends C12008e {

    /* renamed from: c */
    private final IN f21991c;

    /* renamed from: d */
    protected OUT f21992d;

    protected C12009f(C10010b bVar, IN in) {
        super(bVar);
        this.f21991c = in;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo42616b() {
        this.f21992d = mo42620d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract OUT mo42620d();

    /* renamed from: e */
    public IN mo42621e() {
        return this.f21991c;
    }

    /* renamed from: f */
    public OUT mo42622f() {
        return this.f21992d;
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }
}

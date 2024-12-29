package p110w0;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import p077o1.C3500a;
import p077o1.C3502b;

/* renamed from: w0.y */
class C3891y<T> implements C3502b<T>, C3500a<T> {

    /* renamed from: c */
    private static final C3500a.C3501a<Object> f6528c = C10564w.f19727a;

    /* renamed from: d */
    private static final C3502b<Object> f6529d = C10565x.f19728a;
    @GuardedBy("this")

    /* renamed from: a */
    private C3500a.C3501a<T> f6530a;

    /* renamed from: b */
    private volatile C3502b<T> f6531b;

    private C3891y(C3500a.C3501a<T> aVar, C3502b<T> bVar) {
        this.f6530a = aVar;
        this.f6531b = bVar;
    }

    /* renamed from: e */
    static <T> C3891y<T> m11078e() {
        return new C3891y<>(f6528c, f6529d);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m11079f(C3502b bVar) {
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ Object m11080g() {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m11081h(C3500a.C3501a aVar, C3500a.C3501a aVar2, C3502b bVar) {
        aVar.mo24335a(bVar);
        aVar2.mo24335a(bVar);
    }

    /* renamed from: i */
    static <T> C3891y<T> m11082i(C3502b<T> bVar) {
        return new C3891y<>((C3500a.C3501a) null, bVar);
    }

    /* renamed from: a */
    public void mo24334a(@NonNull C3500a.C3501a<T> aVar) {
        C3502b<T> bVar;
        C3502b<T> bVar2 = this.f6531b;
        C3502b<Object> bVar3 = f6529d;
        if (bVar2 != bVar3) {
            aVar.mo24335a(bVar2);
            return;
        }
        C3502b<T> bVar4 = null;
        synchronized (this) {
            bVar = this.f6531b;
            if (bVar != bVar3) {
                bVar4 = bVar;
            } else {
                this.f6530a = new C10563v(this.f6530a, aVar);
            }
        }
        if (bVar4 != null) {
            aVar.mo24335a(bVar);
        }
    }

    public T get() {
        return this.f6531b.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo26379j(C3502b<T> bVar) {
        C3500a.C3501a<T> aVar;
        if (this.f6531b == f6529d) {
            synchronized (this) {
                aVar = this.f6530a;
                this.f6530a = null;
                this.f6531b = bVar;
            }
            aVar.mo24335a(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }
}

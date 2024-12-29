package p164h.p165b.p166a.p169j;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import p164h.p165b.p166a.p240h.C11223m;
import p164h.p165b.p166a.p240h.p242q.C11237b;
import p164h.p165b.p166a.p240h.p248s.C11323c;
import p164h.p165b.p166a.p240h.p250u.C11346c;
import p164h.p165b.p166a.p240h.p252w.C11365e0;
import p164h.p165b.p166a.p240h.p252w.C11381l;
import p164h.p165b.p166a.p240h.p252w.C11397x;

/* renamed from: h.b.a.j.g */
abstract class C11443g<D extends C11323c, S extends C11237b> {

    /* renamed from: a */
    protected final C4433e f22757a;

    /* renamed from: b */
    protected final Set<C11442f<C11365e0, D>> f22758b = new HashSet();

    /* renamed from: c */
    protected final Set<C11442f<String, S>> f22759c = new HashSet();

    C11443g(C4433e eVar) {
        this.f22757a = eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36256a(S s) {
        this.f22759c.add(new C11442f(s.mo35724O(), s, s.mo35727g()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Collection<D> mo36231b() {
        HashSet hashSet = new HashSet();
        for (C11442f<C11365e0, D> b : this.f22758b) {
            hashSet.add(b.mo36251b());
        }
        return hashSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Collection<D> mo36257c(C11381l lVar) {
        HashSet hashSet = new HashSet();
        for (C11442f<C11365e0, D> b : this.f22758b) {
            C11323c[] f = ((C11323c) b.mo36251b()).mo35888f(lVar);
            if (f != null) {
                hashSet.addAll(Arrays.asList(f));
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Collection<D> mo36258d(C11397x xVar) {
        HashSet hashSet = new HashSet();
        for (C11442f<C11365e0, D> b : this.f22758b) {
            C11323c[] g = ((C11323c) b.mo36251b()).mo35889g(xVar);
            if (g != null) {
                hashSet.addAll(Arrays.asList(g));
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public D mo36259e(C11365e0 e0Var, boolean z) {
        D e;
        for (C11442f next : this.f22758b) {
            D d = (C11323c) next.mo36251b();
            if (d.mo35899p().mo35922b().equals(e0Var)) {
                return d;
            }
            if (!z && (e = ((C11323c) next.mo36251b()).mo35886e(e0Var)) != null) {
                return e;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Set<C11442f<C11365e0, D>> mo36260f() {
        return this.f22758b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C11346c[] mo36261g(C11323c cVar) {
        try {
            return this.f22757a.mo24440M().getNamespace().mo35657l(cVar);
        } catch (C11223m e) {
            throw new C11441c("Resource discover error: " + e.toString(), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public S mo36262h(String str) {
        for (C11442f next : this.f22759c) {
            if (((String) next.mo36252c()).equals(str)) {
                return (C11237b) next.mo36251b();
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Set<C11442f<String, S>> mo36263i() {
        return this.f22759c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo36264j(S s) {
        return this.f22759c.remove(new C11442f(s.mo35724O()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo36265k(S s) {
        if (!mo36264j(s)) {
            return false;
        }
        mo36256a(s);
        return true;
    }
}

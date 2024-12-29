package org.fourthline.cling.registry;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.meta.C10067b;
import org.fourthline.cling.model.types.C10089j;
import org.fourthline.cling.model.types.C10098s;
import org.fourthline.cling.model.types.C10105z;
import p200p6.C10275a;
import p222v6.C10549c;

/* renamed from: org.fourthline.cling.registry.d */
abstract class C10112d<D extends C10067b, S extends C10275a> {

    /* renamed from: a */
    protected final C3578b f18665a;

    /* renamed from: b */
    protected final Set<C10111c<C10105z, D>> f18666b = new HashSet();

    /* renamed from: c */
    protected final Set<C10111c<String, S>> f18667c = new HashSet();

    C10112d(C3578b bVar) {
        this.f18665a = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo40691a(S s) {
        this.f18667c.add(new C10111c(s.mo41767K(), s, s.mo41770p()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Collection<D> mo40666b() {
        HashSet hashSet = new HashSet();
        for (C10111c<C10105z, D> b : this.f18666b) {
            hashSet.add(b.mo40686b());
        }
        return hashSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Collection<D> mo40692c(C10089j jVar) {
        HashSet hashSet = new HashSet();
        for (C10111c<C10105z, D> b : this.f18666b) {
            C10067b[] f = ((C10067b) b.mo40686b()).mo40495f(jVar);
            if (f != null) {
                hashSet.addAll(Arrays.asList(f));
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Collection<D> mo40693d(C10098s sVar) {
        HashSet hashSet = new HashSet();
        for (C10111c<C10105z, D> b : this.f18666b) {
            C10067b[] g = ((C10067b) b.mo40686b()).mo40496g(sVar);
            if (g != null) {
                hashSet.addAll(Arrays.asList(g));
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public D mo40694e(C10105z zVar, boolean z) {
        D e;
        for (C10111c next : this.f18666b) {
            D d = (C10067b) next.mo40686b();
            if (d.mo40506p().mo42058b().equals(zVar)) {
                return d;
            }
            if (!z && (e = ((C10067b) next.mo40686b()).mo40493e(zVar)) != null) {
                return e;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Set<C10111c<C10105z, D>> mo40695f() {
        return this.f18666b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C10549c[] mo40696g(C10067b bVar) {
        try {
            return this.f18665a.mo24928M().getNamespace().mo40362l(bVar);
        } catch (ValidationException e) {
            throw new RegistrationException("Resource discover error: " + e.toString(), (Throwable) e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public S mo40697h(String str) {
        for (C10111c next : this.f18667c) {
            if (((String) next.mo40687c()).equals(str)) {
                return (C10275a) next.mo40686b();
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Set<C10111c<String, S>> mo40698i() {
        return this.f18667c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo40699j(S s) {
        return this.f18667c.remove(new C10111c(s.mo41767K()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo40700k(S s) {
        if (!mo40699j(s)) {
            return false;
        }
        mo40691a(s);
        return true;
    }
}

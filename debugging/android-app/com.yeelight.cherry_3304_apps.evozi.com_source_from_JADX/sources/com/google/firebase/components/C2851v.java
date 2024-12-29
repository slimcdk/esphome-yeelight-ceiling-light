package com.google.firebase.components;

import com.google.firebase.p131g.C3194c;
import com.google.firebase.p133i.C3201a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.v */
final class C2851v extends C2822a {

    /* renamed from: a */
    private final Set<Class<?>> f5488a;

    /* renamed from: b */
    private final Set<Class<?>> f5489b;

    /* renamed from: c */
    private final Set<Class<?>> f5490c;

    /* renamed from: d */
    private final Set<Class<?>> f5491d;

    /* renamed from: e */
    private final Set<Class<?>> f5492e;

    /* renamed from: f */
    private final C2828e f5493f;

    /* renamed from: com.google.firebase.components.v$a */
    private static class C2852a implements C3194c {
        public C2852a(Set<Class<?>> set, C3194c cVar) {
        }
    }

    C2851v(C2825d<?> dVar, C2828e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (C2843n next : dVar.mo17076c()) {
            if (next.mo17105b()) {
                boolean d = next.mo17107d();
                Class<?> a = next.mo17104a();
                if (d) {
                    hashSet3.add(a);
                } else {
                    hashSet.add(a);
                }
            } else {
                boolean d2 = next.mo17107d();
                Class<?> a2 = next.mo17104a();
                if (d2) {
                    hashSet4.add(a2);
                } else {
                    hashSet2.add(a2);
                }
            }
        }
        if (!dVar.mo17079f().isEmpty()) {
            hashSet.add(C3194c.class);
        }
        this.f5488a = Collections.unmodifiableSet(hashSet);
        this.f5489b = Collections.unmodifiableSet(hashSet2);
        this.f5490c = Collections.unmodifiableSet(hashSet3);
        this.f5491d = Collections.unmodifiableSet(hashSet4);
        this.f5492e = dVar.mo17079f();
        this.f5493f = eVar;
    }

    /* renamed from: a */
    public <T> T mo17074a(Class<T> cls) {
        if (this.f5488a.contains(cls)) {
            T a = this.f5493f.mo17074a(cls);
            return !cls.equals(C3194c.class) ? a : new C2852a(this.f5492e, (C3194c) a);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    /* renamed from: b */
    public <T> C3201a<T> mo17089b(Class<T> cls) {
        if (this.f5489b.contains(cls)) {
            return this.f5493f.mo17089b(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    /* renamed from: c */
    public <T> C3201a<Set<T>> mo17090c(Class<T> cls) {
        if (this.f5491d.contains(cls)) {
            return this.f5493f.mo17090c(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }

    /* renamed from: d */
    public <T> Set<T> mo17075d(Class<T> cls) {
        if (this.f5490c.contains(cls)) {
            return this.f5493f.mo17075d(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }
}

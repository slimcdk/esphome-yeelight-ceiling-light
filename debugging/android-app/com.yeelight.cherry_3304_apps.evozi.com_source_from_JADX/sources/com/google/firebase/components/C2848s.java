package com.google.firebase.components;

import com.google.firebase.p133i.C3201a;

/* renamed from: com.google.firebase.components.s */
public class C2848s<T> implements C3201a<T> {

    /* renamed from: c */
    private static final Object f5485c = new Object();

    /* renamed from: a */
    private volatile Object f5486a = f5485c;

    /* renamed from: b */
    private volatile C3201a<T> f5487b;

    public C2848s(C3201a<T> aVar) {
        this.f5487b = aVar;
    }

    public T get() {
        T t = this.f5486a;
        if (t == f5485c) {
            synchronized (this) {
                t = this.f5486a;
                if (t == f5485c) {
                    t = this.f5487b.get();
                    this.f5486a = t;
                    this.f5487b = null;
                }
            }
        }
        return t;
    }
}

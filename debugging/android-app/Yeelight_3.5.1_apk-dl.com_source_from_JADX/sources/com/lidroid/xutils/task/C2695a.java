package com.lidroid.xutils.task;

/* renamed from: com.lidroid.xutils.task.a */
class C2695a<T> {

    /* renamed from: a */
    private boolean f4677a = false;

    /* renamed from: b */
    private C2696b<?> f4678b;

    /* renamed from: c */
    C2695a<T> f4679c;

    C2695a(T t) {
        mo20384c(t);
    }

    /* renamed from: a */
    public Priority mo20382a() {
        return this.f4678b.f4680a;
    }

    /* renamed from: b */
    public T mo20383b() {
        T t = this.f4678b;
        if (t == null) {
            return null;
        }
        return this.f4677a ? t : t.f4681b;
    }

    /* renamed from: c */
    public void mo20384c(T t) {
        if (t == null) {
            this.f4678b = null;
        } else if (t instanceof C2696b) {
            this.f4678b = (C2696b) t;
            this.f4677a = true;
        } else {
            this.f4678b = new C2696b<>(Priority.DEFAULT, t);
        }
    }
}

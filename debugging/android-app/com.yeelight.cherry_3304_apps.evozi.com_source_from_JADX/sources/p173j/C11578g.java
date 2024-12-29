package p173j;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import p173j.C11573c;

/* renamed from: j.g */
final class C11578g extends C11573c.C4447a {

    /* renamed from: a */
    final Executor f22996a;

    /* renamed from: j.g$a */
    class C11579a implements C11573c<Object, C4446b<?>> {

        /* renamed from: a */
        final /* synthetic */ Type f22997a;

        C11579a(Type type) {
            this.f22997a = type;
        }

        /* renamed from: b */
        public C4446b<Object> mo36498a(C4446b<Object> bVar) {
            return new C11580b(C11578g.this.f22996a, bVar);
        }

        public Type responseType() {
            return this.f22997a;
        }
    }

    /* renamed from: j.g$b */
    static final class C11580b<T> implements C4446b<T> {

        /* renamed from: a */
        final Executor f22999a;

        /* renamed from: b */
        final C4446b<T> f23000b;

        /* renamed from: j.g$b$a */
        class C11581a implements C11574d<T> {

            /* renamed from: a */
            final /* synthetic */ C11574d f23001a;

            /* renamed from: j.g$b$a$a */
            class C11582a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C4476l f23003a;

                C11582a(C4476l lVar) {
                    this.f23003a = lVar;
                }

                public void run() {
                    if (C11580b.this.f23000b.mo24526K()) {
                        C11581a aVar = C11581a.this;
                        aVar.f23001a.mo31921a(C11580b.this, new IOException("Canceled"));
                        return;
                    }
                    C11581a aVar2 = C11581a.this;
                    aVar2.f23001a.mo31922b(C11580b.this, this.f23003a);
                }
            }

            /* renamed from: j.g$b$a$b */
            class C11583b implements Runnable {

                /* renamed from: a */
                final /* synthetic */ Throwable f23005a;

                C11583b(Throwable th) {
                    this.f23005a = th;
                }

                public void run() {
                    C11581a aVar = C11581a.this;
                    aVar.f23001a.mo31921a(C11580b.this, this.f23005a);
                }
            }

            C11581a(C11574d dVar) {
                this.f23001a = dVar;
            }

            /* renamed from: a */
            public void mo31921a(C4446b<T> bVar, Throwable th) {
                C11580b.this.f22999a.execute(new C11583b(th));
            }

            /* renamed from: b */
            public void mo31922b(C4446b<T> bVar, C4476l<T> lVar) {
                C11580b.this.f22999a.execute(new C11582a(lVar));
            }
        }

        C11580b(Executor executor, C4446b<T> bVar) {
            this.f22999a = executor;
            this.f23000b = bVar;
        }

        /* renamed from: K */
        public boolean mo24526K() {
            return this.f23000b.mo24526K();
        }

        /* renamed from: L */
        public C4446b<T> clone() {
            return new C11580b(this.f22999a, this.f23000b.mo24527L());
        }

        /* renamed from: n */
        public void mo24528n(C11574d<T> dVar) {
            C4482o.m13230b(dVar, "callback == null");
            this.f23000b.mo24528n(new C11581a(dVar));
        }
    }

    C11578g(Executor executor) {
        this.f22996a = executor;
    }

    /* renamed from: a */
    public C11573c<?, ?> mo24529a(Type type, Annotation[] annotationArr, C4477m mVar) {
        if (C11573c.C4447a.m13118b(type) != C4446b.class) {
            return null;
        }
        return new C11579a(C4482o.m13234f(type));
    }
}

package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import p177j7.C9216a;
import p177j7.C9217b;
import retrofit2.C10318b;

/* renamed from: retrofit2.e */
final class C10322e extends C10318b.C3637a {

    /* renamed from: a */
    final Executor f19389a;

    /* renamed from: retrofit2.e$a */
    class C10323a implements C10318b<Object, C9216a<?>> {

        /* renamed from: a */
        final /* synthetic */ Type f19390a;

        C10323a(Type type) {
            this.f19390a = type;
        }

        /* renamed from: b */
        public C9216a<Object> mo41861a(C9216a<Object> aVar) {
            return new C10324b(C10322e.this.f19389a, aVar);
        }

        public Type responseType() {
            return this.f19390a;
        }
    }

    /* renamed from: retrofit2.e$b */
    static final class C10324b<T> implements C9216a<T> {

        /* renamed from: a */
        final Executor f19392a;

        /* renamed from: b */
        final C9216a<T> f19393b;

        /* renamed from: retrofit2.e$b$a */
        class C10325a implements C9217b<T> {

            /* renamed from: a */
            final /* synthetic */ C9217b f19394a;

            /* renamed from: retrofit2.e$b$a$a */
            class C10326a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C3666j f19396a;

                C10326a(C3666j jVar) {
                    this.f19396a = jVar;
                }

                public void run() {
                    if (C10324b.this.f19393b.mo25984H()) {
                        C10325a aVar = C10325a.this;
                        aVar.f19394a.mo26576b(C10324b.this, new IOException("Canceled"));
                        return;
                    }
                    C10325a aVar2 = C10325a.this;
                    aVar2.f19394a.mo26575a(C10324b.this, this.f19396a);
                }
            }

            /* renamed from: retrofit2.e$b$a$b */
            class C10327b implements Runnable {

                /* renamed from: a */
                final /* synthetic */ Throwable f19398a;

                C10327b(Throwable th) {
                    this.f19398a = th;
                }

                public void run() {
                    C10325a aVar = C10325a.this;
                    aVar.f19394a.mo26576b(C10324b.this, this.f19398a);
                }
            }

            C10325a(C9217b bVar) {
                this.f19394a = bVar;
            }

            /* renamed from: a */
            public void mo26575a(C9216a<T> aVar, C3666j<T> jVar) {
                C10324b.this.f19392a.execute(new C10326a(jVar));
            }

            /* renamed from: b */
            public void mo26576b(C9216a<T> aVar, Throwable th) {
                C10324b.this.f19392a.execute(new C10327b(th));
            }
        }

        C10324b(Executor executor, C9216a<T> aVar) {
            this.f19392a = executor;
            this.f19393b = aVar;
        }

        /* renamed from: H */
        public boolean mo25984H() {
            return this.f19393b.mo25984H();
        }

        /* renamed from: I */
        public C9216a<T> clone() {
            return new C10324b(this.f19392a, this.f19393b.mo25985I());
        }

        /* renamed from: c0 */
        public void mo25988c0(C9217b<T> bVar) {
            C3672m.m10495b(bVar, "callback == null");
            this.f19393b.mo25988c0(new C10325a(bVar));
        }
    }

    C10322e(Executor executor) {
        this.f19389a = executor;
    }

    /* renamed from: a */
    public C10318b<?, ?> mo25980a(Type type, Annotation[] annotationArr, C3667k kVar) {
        if (C10318b.C3637a.m10383b(type) != C9216a.class) {
            return null;
        }
        return new C10323a(C3672m.m10499f(type));
    }
}

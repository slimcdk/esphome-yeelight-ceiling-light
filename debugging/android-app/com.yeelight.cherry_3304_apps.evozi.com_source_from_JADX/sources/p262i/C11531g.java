package p262i;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import p262i.C11525d;

/* renamed from: i.g */
final class C11531g implements C11525d.C11526a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Executor f22892a;

    /* renamed from: i.g$a */
    class C11532a implements C11525d<C11524c<?>> {

        /* renamed from: a */
        final /* synthetic */ Type f22893a;

        C11532a(Type type) {
            this.f22893a = type;
        }

        /* renamed from: a */
        public <R> C11524c<R> adapt(C11524c<R> cVar) {
            return new C11533b(C11531g.this.f22892a, cVar);
        }

        public Type responseType() {
            return this.f22893a;
        }
    }

    /* renamed from: i.g$b */
    static final class C11533b<T> implements C11524c<T> {

        /* renamed from: a */
        private final Executor f22895a;

        /* renamed from: b */
        private final C11524c<T> f22896b;

        C11533b(Executor executor, C11524c<T> cVar) {
            this.f22895a = executor;
            this.f22896b = cVar;
        }

        /* renamed from: J */
        public C11561r<T> mo36446J() {
            return this.f22896b.mo36446J();
        }

        /* renamed from: L */
        public C11524c<T> clone() {
            return new C11533b(this.f22895a, this.f22896b.mo36447L());
        }
    }

    C11531g(Executor executor) {
        this.f22892a = executor;
    }

    public C11525d<C11524c<?>> get(Type type, Annotation[] annotationArr, C11562s sVar) {
        if (C11566t.m30355d(type) != C11524c.class) {
            return null;
        }
        return new C11532a(C11566t.m30354c(type));
    }
}

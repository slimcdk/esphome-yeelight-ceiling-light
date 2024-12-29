package p173i7;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import p173i7.C9136d;

/* renamed from: i7.g */
final class C9142g implements C9136d.C9137a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Executor f16904a;

    /* renamed from: i7.g$a */
    class C9143a implements C9136d<C9135c<?>> {

        /* renamed from: a */
        final /* synthetic */ Type f16905a;

        C9143a(Type type) {
            this.f16905a = type;
        }

        /* renamed from: a */
        public <R> C9135c<R> adapt(C9135c<R> cVar) {
            return new C9144b(C9142g.this.f16904a, cVar);
        }

        public Type responseType() {
            return this.f16905a;
        }
    }

    /* renamed from: i7.g$b */
    static final class C9144b<T> implements C9135c<T> {

        /* renamed from: a */
        private final Executor f16907a;

        /* renamed from: b */
        private final C9135c<T> f16908b;

        C9144b(Executor executor, C9135c<T> cVar) {
            this.f16907a = executor;
            this.f16908b = cVar;
        }

        /* renamed from: I */
        public C9135c<T> clone() {
            return new C9144b(this.f16907a, this.f16908b.mo37222I());
        }

        /* renamed from: J */
        public C9172r<T> mo37223J() {
            return this.f16908b.mo37223J();
        }
    }

    C9142g(Executor executor) {
        this.f16904a = executor;
    }

    public C9136d<C9135c<?>> get(Type type, Annotation[] annotationArr, C9173s sVar) {
        if (C9177t.m22063d(type) != C9135c.class) {
            return null;
        }
        return new C9143a(C9177t.m22062c(type));
    }
}

package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233y4.C12049a;
import p233y4.C12060l;

/* renamed from: kotlin.sequences.b */
final class C9480b<T> implements C9482c<T> {
    /* access modifiers changed from: private */
    @NotNull

    /* renamed from: a */
    public final C12049a<T> f17337a;
    /* access modifiers changed from: private */
    @NotNull

    /* renamed from: b */
    public final C12060l<T, T> f17338b;

    /* renamed from: kotlin.sequences.b$a */
    public static final class C9481a implements Iterator<T> {
        @Nullable

        /* renamed from: a */
        private T f17339a;

        /* renamed from: b */
        private int f17340b = -2;

        /* renamed from: c */
        final /* synthetic */ C9480b<T> f17341c;

        C9481a(C9480b<T> bVar) {
            this.f17341c = bVar;
        }

        /* renamed from: a */
        private final void m23083a() {
            T t;
            if (this.f17340b == -2) {
                t = this.f17341c.f17337a.invoke();
            } else {
                C12060l b = this.f17341c.f17338b;
                T t2 = this.f17339a;
                C9424q.m22993b(t2);
                t = b.invoke(t2);
            }
            this.f17339a = t;
            this.f17340b = t == null ? 0 : 1;
        }

        public boolean hasNext() {
            if (this.f17340b < 0) {
                m23083a();
            }
            return this.f17340b == 1;
        }

        @NotNull
        public T next() {
            if (this.f17340b < 0) {
                m23083a();
            }
            if (this.f17340b != 0) {
                T t = this.f17339a;
                C9424q.m22994c(t, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f17340b = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C9480b(@NotNull C12049a<? extends T> aVar, @NotNull C12060l<? super T, ? extends T> lVar) {
        C9424q.m22996e(aVar, "getInitialValue");
        C9424q.m22996e(lVar, "getNextValue");
        this.f17337a = aVar;
        this.f17338b = lVar;
    }

    @NotNull
    public Iterator<T> iterator() {
        return new C9481a(this);
    }
}

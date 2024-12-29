package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import p233y4.C12060l;

/* renamed from: kotlin.sequences.k */
public final class C9491k<T, R> implements C9482c<R> {
    /* access modifiers changed from: private */
    @NotNull

    /* renamed from: a */
    public final C9482c<T> f17347a;
    /* access modifiers changed from: private */
    @NotNull

    /* renamed from: b */
    public final C12060l<T, R> f17348b;

    /* renamed from: kotlin.sequences.k$a */
    public static final class C9492a implements Iterator<R> {
        @NotNull

        /* renamed from: a */
        private final Iterator<T> f17349a;

        /* renamed from: b */
        final /* synthetic */ C9491k<T, R> f17350b;

        C9492a(C9491k<T, R> kVar) {
            this.f17350b = kVar;
            this.f17349a = kVar.f17347a.iterator();
        }

        public boolean hasNext() {
            return this.f17349a.hasNext();
        }

        public R next() {
            return this.f17350b.f17348b.invoke(this.f17349a.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C9491k(@NotNull C9482c<? extends T> cVar, @NotNull C12060l<? super T, ? extends R> lVar) {
        C9424q.m22996e(cVar, "sequence");
        C9424q.m22996e(lVar, "transformer");
        this.f17347a = cVar;
        this.f17348b = lVar;
    }

    @NotNull
    public Iterator<R> iterator() {
        return new C9492a(this);
    }
}

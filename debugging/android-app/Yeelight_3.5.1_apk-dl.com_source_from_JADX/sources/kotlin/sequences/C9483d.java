package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C9400h;
import kotlin.C9478s;
import kotlin.Result;
import kotlin.coroutines.C9378a;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.C9393e;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.sequences.d */
final class C9483d<T> extends C9484e<T> implements Iterator<T>, C9378a<C9478s> {

    /* renamed from: a */
    private int f17342a;
    @Nullable

    /* renamed from: b */
    private T f17343b;
    @Nullable

    /* renamed from: c */
    private Iterator<? extends T> f17344c;
    @Nullable

    /* renamed from: d */
    private C9378a<? super C9478s> f17345d;

    /* renamed from: d */
    private final Throwable m23084d() {
        int i = this.f17342a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f17342a);
    }

    /* renamed from: e */
    private final T m23085e() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Nullable
    /* renamed from: a */
    public Object mo38431a(T t, @NotNull C9378a<? super C9478s> aVar) {
        this.f17343b = t;
        this.f17342a = 3;
        this.f17345d = aVar;
        Object b = C9388b.m22940b();
        if (b == C9388b.m22940b()) {
            C9393e.m22948c(aVar);
        }
        return b == C9388b.m22940b() ? b : C9478s.f17335a;
    }

    @Nullable
    /* renamed from: b */
    public Object mo38432b(@NotNull Iterator<? extends T> it, @NotNull C9378a<? super C9478s> aVar) {
        if (!it.hasNext()) {
            return C9478s.f17335a;
        }
        this.f17344c = it;
        this.f17342a = 2;
        this.f17345d = aVar;
        Object b = C9388b.m22940b();
        if (b == C9388b.m22940b()) {
            C9393e.m22948c(aVar);
        }
        return b == C9388b.m22940b() ? b : C9478s.f17335a;
    }

    /* renamed from: f */
    public final void mo38433f(@Nullable C9378a<? super C9478s> aVar) {
        this.f17345d = aVar;
    }

    @NotNull
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    public boolean hasNext() {
        while (true) {
            int i = this.f17342a;
            if (i != 0) {
                if (i == 1) {
                    Iterator<? extends T> it = this.f17344c;
                    C9424q.m22993b(it);
                    if (it.hasNext()) {
                        this.f17342a = 2;
                        return true;
                    }
                    this.f17344c = null;
                } else if (i == 2 || i == 3) {
                    return true;
                } else {
                    if (i == 4) {
                        return false;
                    }
                    throw m23084d();
                }
            }
            this.f17342a = 5;
            C9378a<? super C9478s> aVar = this.f17345d;
            C9424q.m22993b(aVar);
            this.f17345d = null;
            Result.C9301a aVar2 = Result.Companion;
            aVar.resumeWith(Result.m32001constructorimpl(C9478s.f17335a));
        }
    }

    public T next() {
        int i = this.f17342a;
        if (i == 0 || i == 1) {
            return m23085e();
        }
        if (i == 2) {
            this.f17342a = 1;
            Iterator<? extends T> it = this.f17344c;
            C9424q.m22993b(it);
            return it.next();
        } else if (i == 3) {
            this.f17342a = 0;
            T t = this.f17343b;
            this.f17343b = null;
            return t;
        } else {
            throw m23084d();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void resumeWith(@NotNull Object obj) {
        C9400h.m22954b(obj);
        this.f17342a = 4;
    }
}

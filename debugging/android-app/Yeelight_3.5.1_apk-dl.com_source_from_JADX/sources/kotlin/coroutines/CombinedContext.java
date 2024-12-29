package kotlin.coroutines;

import java.io.Serializable;
import kotlin.C9478s;
import kotlin.SinceKotlin;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C9422o;
import kotlin.jvm.internal.C9424q;
import kotlin.jvm.internal.Ref$IntRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233y4.C12064p;

@SinceKotlin(version = "1.3")
public final class CombinedContext implements CoroutineContext, Serializable {
    @NotNull
    private final CoroutineContext.C9376a element;
    @NotNull
    private final CoroutineContext left;

    private static final class Serialized implements Serializable {
        @NotNull
        public static final C9375a Companion = new C9375a((C9422o) null);
        private static final long serialVersionUID = 0;
        @NotNull
        private final CoroutineContext[] elements;

        /* renamed from: kotlin.coroutines.CombinedContext$Serialized$a */
        public static final class C9375a {
            private C9375a() {
            }

            public /* synthetic */ C9375a(C9422o oVar) {
                this();
            }
        }

        public Serialized(@NotNull CoroutineContext[] coroutineContextArr) {
            C9424q.m22996e(coroutineContextArr, "elements");
            this.elements = coroutineContextArr;
        }

        private final Object readResolve() {
            CoroutineContext[] coroutineContextArr = this.elements;
            CoroutineContext coroutineContext = EmptyCoroutineContext.INSTANCE;
            for (CoroutineContext plus : coroutineContextArr) {
                coroutineContext = coroutineContext.plus(plus);
            }
            return coroutineContext;
        }

        @NotNull
        public final CoroutineContext[] getElements() {
            return this.elements;
        }
    }

    public CombinedContext(@NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext.C9376a aVar) {
        C9424q.m22996e(coroutineContext, "left");
        C9424q.m22996e(aVar, "element");
        this.left = coroutineContext;
        this.element = aVar;
    }

    private final boolean contains(CoroutineContext.C9376a aVar) {
        return C9424q.m22992a(get(aVar.getKey()), aVar);
    }

    private final boolean containsAll(CombinedContext combinedContext) {
        while (contains(combinedContext.element)) {
            CoroutineContext coroutineContext = combinedContext.left;
            if (coroutineContext instanceof CombinedContext) {
                combinedContext = (CombinedContext) coroutineContext;
            } else {
                C9424q.m22994c(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return contains((CoroutineContext.C9376a) coroutineContext);
            }
        }
        return false;
    }

    private final int size() {
        int i = 2;
        CombinedContext combinedContext = this;
        while (true) {
            CoroutineContext coroutineContext = combinedContext.left;
            combinedContext = coroutineContext instanceof CombinedContext ? (CombinedContext) coroutineContext : null;
            if (combinedContext == null) {
                return i;
            }
            i++;
        }
    }

    private final Object writeReplace() {
        int size = size();
        CoroutineContext[] coroutineContextArr = new CoroutineContext[size];
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        fold(C9478s.f17335a, new CombinedContext$writeReplace$1(coroutineContextArr, ref$IntRef));
        if (ref$IntRef.element == size) {
            return new Serialized(coroutineContextArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof CombinedContext) {
                CombinedContext combinedContext = (CombinedContext) obj;
                if (combinedContext.size() != size() || !combinedContext.containsAll(this)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public <R> R fold(R r, @NotNull C12064p<? super R, ? super CoroutineContext.C9376a, ? extends R> pVar) {
        C9424q.m22996e(pVar, "operation");
        return pVar.invoke(this.left.fold(r, pVar), this.element);
    }

    @Nullable
    public <E extends CoroutineContext.C9376a> E get(@NotNull CoroutineContext.C9377b<E> bVar) {
        C9424q.m22996e(bVar, "key");
        CombinedContext combinedContext = this;
        while (true) {
            E e = combinedContext.element.get(bVar);
            if (e != null) {
                return e;
            }
            CoroutineContext coroutineContext = combinedContext.left;
            if (!(coroutineContext instanceof CombinedContext)) {
                return coroutineContext.get(bVar);
            }
            combinedContext = (CombinedContext) coroutineContext;
        }
    }

    public int hashCode() {
        return this.left.hashCode() + this.element.hashCode();
    }

    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.C9377b<?> bVar) {
        C9424q.m22996e(bVar, "key");
        if (this.element.get(bVar) != null) {
            return this.left;
        }
        CoroutineContext minusKey = this.left.minusKey(bVar);
        return minusKey == this.left ? this : minusKey == EmptyCoroutineContext.INSTANCE ? this.element : new CombinedContext(minusKey, this.element);
    }

    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.DefaultImpls.m22934a(this, coroutineContext);
    }

    @NotNull
    public String toString() {
        return '[' + ((String) fold("", CombinedContext$toString$1.INSTANCE)) + ']';
    }
}

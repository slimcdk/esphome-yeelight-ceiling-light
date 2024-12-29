package kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C9422o;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233y4.C12049a;

final class SafePublicationLazyImpl<T> implements C9396d<T>, Serializable {
    @NotNull
    public static final C9302a Companion = new C9302a((C9422o) null);
    private static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> valueUpdater = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "_value");
    @Nullable
    private volatile Object _value;
    @NotNull

    /* renamed from: final  reason: not valid java name */
    private final Object f22563final;
    @Nullable
    private volatile C12049a<? extends T> initializer;

    /* renamed from: kotlin.SafePublicationLazyImpl$a */
    public static final class C9302a {
        private C9302a() {
        }

        public /* synthetic */ C9302a(C9422o oVar) {
            this();
        }
    }

    public SafePublicationLazyImpl(@NotNull C12049a<? extends T> aVar) {
        C9424q.m22996e(aVar, "initializer");
        this.initializer = aVar;
        C9440p pVar = C9440p.f17321a;
        this._value = pVar;
        this.f22563final = pVar;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    public T getValue() {
        T t = this._value;
        T t2 = C9440p.f17321a;
        if (t != t2) {
            return t;
        }
        C12049a<? extends T> aVar = this.initializer;
        if (aVar != null) {
            T invoke = aVar.invoke();
            if (valueUpdater.compareAndSet(this, t2, invoke)) {
                this.initializer = null;
                return invoke;
            }
        }
        return this._value;
    }

    public boolean isInitialized() {
        return this._value != C9440p.f17321a;
    }

    @NotNull
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

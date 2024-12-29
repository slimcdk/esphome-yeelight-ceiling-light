package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.C9422o;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233y4.C12049a;

final class SynchronizedLazyImpl<T> implements C9396d<T>, Serializable {
    @Nullable
    private volatile Object _value;
    @Nullable
    private C12049a<? extends T> initializer;
    @NotNull
    private final Object lock;

    public SynchronizedLazyImpl(@NotNull C12049a<? extends T> aVar, @Nullable Object obj) {
        C9424q.m22996e(aVar, "initializer");
        this.initializer = aVar;
        this._value = C9440p.f17321a;
        this.lock = obj == null ? this : obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SynchronizedLazyImpl(C12049a aVar, Object obj, int i, C9422o oVar) {
        this(aVar, (i & 2) != 0 ? null : obj);
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    public T getValue() {
        T t;
        T t2 = this._value;
        T t3 = C9440p.f17321a;
        if (t2 != t3) {
            return t2;
        }
        synchronized (this.lock) {
            t = this._value;
            if (t == t3) {
                C12049a aVar = this.initializer;
                C9424q.m22993b(aVar);
                t = aVar.invoke();
                this._value = t;
                this.initializer = null;
            }
        }
        return t;
    }

    public boolean isInitialized() {
        return this._value != C9440p.f17321a;
    }

    @NotNull
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

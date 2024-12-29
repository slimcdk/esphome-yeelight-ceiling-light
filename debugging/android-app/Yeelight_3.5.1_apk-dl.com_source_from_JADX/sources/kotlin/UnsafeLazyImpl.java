package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233y4.C12049a;

public final class UnsafeLazyImpl<T> implements C9396d<T>, Serializable {
    @Nullable
    private Object _value = C9440p.f17321a;
    @Nullable
    private C12049a<? extends T> initializer;

    public UnsafeLazyImpl(@NotNull C12049a<? extends T> aVar) {
        C9424q.m22996e(aVar, "initializer");
        this.initializer = aVar;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    public T getValue() {
        if (this._value == C9440p.f17321a) {
            C12049a<? extends T> aVar = this.initializer;
            C9424q.m22993b(aVar);
            this._value = aVar.invoke();
            this.initializer = null;
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

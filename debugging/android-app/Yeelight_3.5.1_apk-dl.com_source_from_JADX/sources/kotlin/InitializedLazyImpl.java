package kotlin;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

public final class InitializedLazyImpl<T> implements C9396d<T>, Serializable {
    private final T value;

    public InitializedLazyImpl(T t) {
        this.value = t;
    }

    public T getValue() {
        return this.value;
    }

    public boolean isInitialized() {
        return true;
    }

    @NotNull
    public String toString() {
        return String.valueOf(getValue());
    }
}

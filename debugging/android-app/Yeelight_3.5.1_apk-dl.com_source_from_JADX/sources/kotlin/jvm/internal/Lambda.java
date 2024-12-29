package kotlin.jvm.internal;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

public abstract class Lambda<R> implements C9423p<R>, Serializable {
    private final int arity;

    public Lambda(int i) {
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    @NotNull
    public String toString() {
        String k = C9427t.m23022k(this);
        C9424q.m22995d(k, "renderLambdaToString(this)");
        return k;
    }
}

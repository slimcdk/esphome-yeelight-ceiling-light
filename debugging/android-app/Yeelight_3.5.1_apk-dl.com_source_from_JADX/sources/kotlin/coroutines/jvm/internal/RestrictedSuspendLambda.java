package kotlin.coroutines.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.coroutines.C9378a;
import kotlin.jvm.internal.C9423p;
import kotlin.jvm.internal.C9424q;
import kotlin.jvm.internal.C9427t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements C9423p<Object> {
    private final int arity;

    public RestrictedSuspendLambda(int i) {
        this(i, (C9378a<Object>) null);
    }

    public RestrictedSuspendLambda(int i, @Nullable C9378a<Object> aVar) {
        super(aVar);
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    @NotNull
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String j = C9427t.m23021j(this);
        C9424q.m22995d(j, "renderLambdaToString(this)");
        return j;
    }
}

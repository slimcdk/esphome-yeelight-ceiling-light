package kotlin.reflect;

import kotlin.SinceKotlin;
import kotlin.reflect.C9466k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233y4.C12064p;

/* renamed from: kotlin.reflect.n */
public interface C9472n<D, E, V> extends C9466k<V>, C12064p<D, E, V> {

    /* renamed from: kotlin.reflect.n$a */
    public interface C9473a<D, E, V> extends C9466k.C9467a<V>, C12064p<D, E, V> {
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    Object getDelegate(D d, E e);

    @NotNull
    C9473a<D, E, V> getGetter();
}

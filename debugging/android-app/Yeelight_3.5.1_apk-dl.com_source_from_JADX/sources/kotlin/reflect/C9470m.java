package kotlin.reflect;

import kotlin.SinceKotlin;
import kotlin.reflect.C9466k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233y4.C12060l;

/* renamed from: kotlin.reflect.m */
public interface C9470m<T, V> extends C9466k<V>, C12060l<T, V> {

    /* renamed from: kotlin.reflect.m$a */
    public interface C9471a<T, V> extends C9466k.C9467a<V>, C12060l<T, V> {
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    Object getDelegate(T t);

    @NotNull
    C9471a<T, V> getGetter();
}

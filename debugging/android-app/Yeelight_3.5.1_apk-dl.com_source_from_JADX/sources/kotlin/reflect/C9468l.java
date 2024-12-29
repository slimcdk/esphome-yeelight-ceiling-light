package kotlin.reflect;

import kotlin.SinceKotlin;
import kotlin.reflect.C9466k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233y4.C12049a;

/* renamed from: kotlin.reflect.l */
public interface C9468l<V> extends C9466k<V>, C12049a<V> {

    /* renamed from: kotlin.reflect.l$a */
    public interface C9469a<V> extends C9466k.C9467a<V>, C12049a<V> {
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    Object getDelegate();

    @NotNull
    C9469a<V> getGetter();
}

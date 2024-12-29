package kotlin.sequences;

import java.util.Iterator;
import kotlin.C9478s;
import kotlin.SinceKotlin;
import kotlin.coroutines.C9378a;
import kotlin.coroutines.RestrictsSuspension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictsSuspension
@SinceKotlin(version = "1.3")
/* renamed from: kotlin.sequences.e */
public abstract class C9484e<T> {
    @Nullable
    /* renamed from: a */
    public abstract Object mo38431a(T t, @NotNull C9378a<? super C9478s> aVar);

    @Nullable
    /* renamed from: b */
    public abstract Object mo38432b(@NotNull Iterator<? extends T> it, @NotNull C9378a<? super C9478s> aVar);

    @Nullable
    /* renamed from: c */
    public final Object mo38437c(@NotNull C9482c<? extends T> cVar, @NotNull C9378a<? super C9478s> aVar) {
        Object b = mo38432b(cVar.iterator(), aVar);
        return b == C9388b.m22940b() ? b : C9478s.f17335a;
    }
}

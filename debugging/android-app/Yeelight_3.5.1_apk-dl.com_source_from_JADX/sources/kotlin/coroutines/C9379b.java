package kotlin.coroutines;

import kotlin.SinceKotlin;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(version = "1.3")
/* renamed from: kotlin.coroutines.b */
public interface C9379b extends CoroutineContext.C9376a {
    @NotNull

    /* renamed from: L */
    public static final C9380a f17271L = C9380a.f17272a;

    /* renamed from: kotlin.coroutines.b$a */
    public static final class C9380a implements CoroutineContext.C9377b<C9379b> {

        /* renamed from: a */
        static final /* synthetic */ C9380a f17272a = new C9380a();

        private C9380a() {
        }
    }

    /* renamed from: a */
    void mo38225a(@NotNull C9378a<?> aVar);

    @NotNull
    /* renamed from: b */
    <T> C9378a<T> mo38226b(@NotNull C9378a<? super T> aVar);
}

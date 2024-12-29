package kotlin.sequences;

import java.util.Iterator;
import kotlin.BuilderInference;
import kotlin.C9478s;
import kotlin.SinceKotlin;
import kotlin.coroutines.C9378a;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import p233y4.C12064p;

/* renamed from: kotlin.sequences.g */
class C9486g {

    /* renamed from: kotlin.sequences.g$a */
    public static final class C9487a implements C9482c<T> {

        /* renamed from: a */
        final /* synthetic */ C12064p f17346a;

        public C9487a(C12064p pVar) {
            this.f17346a = pVar;
        }

        @NotNull
        public Iterator<T> iterator() {
            return C9486g.m23098a(this.f17346a);
        }
    }

    @NotNull
    @SinceKotlin(version = "1.3")
    /* renamed from: a */
    public static final <T> Iterator<T> m23098a(@NotNull @BuilderInference C12064p<? super C9484e<? super T>, ? super C9378a<? super C9478s>, ? extends Object> pVar) {
        C9424q.m22996e(pVar, "block");
        C9483d dVar = new C9483d();
        dVar.mo38433f(IntrinsicsKt__IntrinsicsJvmKt.m22937a(pVar, dVar, dVar));
        return dVar;
    }

    @NotNull
    @SinceKotlin(version = "1.3")
    /* renamed from: b */
    public static <T> C9482c<T> m23099b(@NotNull @BuilderInference C12064p<? super C9484e<? super T>, ? super C9378a<? super C9478s>, ? extends Object> pVar) {
        C9424q.m22996e(pVar, "block");
        return new C9487a(pVar);
    }
}

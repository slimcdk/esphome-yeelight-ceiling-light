package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.C9424q;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import p223w3.C11571p0;
import p233y4.C12060l;

final /* synthetic */ class SequencesKt___SequencesKt$flatMapIndexed$2 extends FunctionReferenceImpl implements C12060l<C9482c<Object>, Iterator<Object>> {
    public static final SequencesKt___SequencesKt$flatMapIndexed$2 INSTANCE = new SequencesKt___SequencesKt$flatMapIndexed$2();

    SequencesKt___SequencesKt$flatMapIndexed$2() {
        super(1, C9482c.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @NotNull
    public final Iterator<Object> invoke(@NotNull C9482c<Object> cVar) {
        C9424q.m22996e(cVar, C11571p0.f21272C);
        return cVar.iterator();
    }
}

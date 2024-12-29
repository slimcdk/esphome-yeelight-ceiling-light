package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.C9424q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p233y4.C12060l;

final class SequencesKt__SequencesKt$flatten$1 extends Lambda implements C12060l<C9482c<Object>, Iterator<Object>> {
    public static final SequencesKt__SequencesKt$flatten$1 INSTANCE = new SequencesKt__SequencesKt$flatten$1();

    SequencesKt__SequencesKt$flatten$1() {
        super(1);
    }

    @NotNull
    public final Iterator<Object> invoke(@NotNull C9482c<Object> cVar) {
        C9424q.m22996e(cVar, "it");
        return cVar.iterator();
    }
}

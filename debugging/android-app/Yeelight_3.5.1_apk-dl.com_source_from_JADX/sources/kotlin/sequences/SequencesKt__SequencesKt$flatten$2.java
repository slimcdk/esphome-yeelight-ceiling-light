package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.C9424q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p233y4.C12060l;

final class SequencesKt__SequencesKt$flatten$2 extends Lambda implements C12060l<Iterable<Object>, Iterator<Object>> {
    public static final SequencesKt__SequencesKt$flatten$2 INSTANCE = new SequencesKt__SequencesKt$flatten$2();

    SequencesKt__SequencesKt$flatten$2() {
        super(1);
    }

    @NotNull
    public final Iterator<Object> invoke(@NotNull Iterable<Object> iterable) {
        C9424q.m22996e(iterable, "it");
        return iterable.iterator();
    }
}

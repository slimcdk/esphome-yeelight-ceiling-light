package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p233y4.C12049a;

final class CollectionsKt___CollectionsKt$withIndex$1 extends Lambda implements C12049a<Iterator<Object>> {
    final /* synthetic */ Iterable<Object> $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CollectionsKt___CollectionsKt$withIndex$1(Iterable<Object> iterable) {
        super(0);
        this.$this_withIndex = iterable;
    }

    @NotNull
    public final Iterator<Object> invoke() {
        return this.$this_withIndex.iterator();
    }
}

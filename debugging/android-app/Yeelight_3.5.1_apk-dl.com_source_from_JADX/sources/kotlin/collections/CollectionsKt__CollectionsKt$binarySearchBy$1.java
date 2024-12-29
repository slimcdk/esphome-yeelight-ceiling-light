package kotlin.collections;

import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p233y4.C12060l;

public final class CollectionsKt__CollectionsKt$binarySearchBy$1 extends Lambda implements C12060l<Object, Integer> {
    final /* synthetic */ Comparable $key;
    final /* synthetic */ C12060l<Object, Comparable> $selector;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectionsKt__CollectionsKt$binarySearchBy$1(C12060l<Object, Comparable> lVar, Comparable comparable) {
        super(1);
        this.$selector = lVar;
        this.$key = comparable;
    }

    @NotNull
    public final Integer invoke(Object obj) {
        return Integer.valueOf(C10393b.m26326a(this.$selector.invoke(obj), this.$key));
    }
}

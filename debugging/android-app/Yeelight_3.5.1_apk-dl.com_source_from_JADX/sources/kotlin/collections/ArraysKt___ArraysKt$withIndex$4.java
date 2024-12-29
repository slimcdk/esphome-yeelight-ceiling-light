package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.C9415i;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p233y4.C12049a;

final class ArraysKt___ArraysKt$withIndex$4 extends Lambda implements C12049a<Iterator<? extends Integer>> {
    final /* synthetic */ int[] $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArraysKt___ArraysKt$withIndex$4(int[] iArr) {
        super(0);
        this.$this_withIndex = iArr;
    }

    @NotNull
    public final Iterator<Integer> invoke() {
        return C9415i.m22983f(this.$this_withIndex);
    }
}

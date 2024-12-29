package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.C9415i;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p233y4.C12049a;

final class ArraysKt___ArraysKt$withIndex$8 extends Lambda implements C12049a<Iterator<? extends Boolean>> {
    final /* synthetic */ boolean[] $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArraysKt___ArraysKt$withIndex$8(boolean[] zArr) {
        super(0);
        this.$this_withIndex = zArr;
    }

    @NotNull
    public final Iterator<Boolean> invoke() {
        return C9415i.m22978a(this.$this_withIndex);
    }
}

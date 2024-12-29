package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.C9415i;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p233y4.C12049a;

final class ArraysKt___ArraysKt$withIndex$3 extends Lambda implements C12049a<Iterator<? extends Short>> {
    final /* synthetic */ short[] $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArraysKt___ArraysKt$withIndex$3(short[] sArr) {
        super(0);
        this.$this_withIndex = sArr;
    }

    @NotNull
    public final Iterator<Short> invoke() {
        return C9415i.m22985h(this.$this_withIndex);
    }
}

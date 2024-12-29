package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.C9415i;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p233y4.C12049a;

final class ArraysKt___ArraysKt$withIndex$9 extends Lambda implements C12049a<Iterator<? extends Character>> {
    final /* synthetic */ char[] $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArraysKt___ArraysKt$withIndex$9(char[] cArr) {
        super(0);
        this.$this_withIndex = cArr;
    }

    @NotNull
    public final Iterator<Character> invoke() {
        return C9415i.m22980c(this.$this_withIndex);
    }
}

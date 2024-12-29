package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.C9414h;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p233y4.C12049a;

final class ArraysKt___ArraysKt$withIndex$1 extends Lambda implements C12049a<Iterator<Object>> {
    final /* synthetic */ T[] $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArraysKt___ArraysKt$withIndex$1(T[] tArr) {
        super(0);
        this.$this_withIndex = tArr;
    }

    @NotNull
    public final Iterator<Object> invoke() {
        return C9414h.m22977a(this.$this_withIndex);
    }
}

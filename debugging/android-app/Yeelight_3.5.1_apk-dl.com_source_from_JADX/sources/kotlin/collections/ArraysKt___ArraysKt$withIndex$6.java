package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.C9415i;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p233y4.C12049a;

final class ArraysKt___ArraysKt$withIndex$6 extends Lambda implements C12049a<Iterator<? extends Float>> {
    final /* synthetic */ float[] $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArraysKt___ArraysKt$withIndex$6(float[] fArr) {
        super(0);
        this.$this_withIndex = fArr;
    }

    @NotNull
    public final Iterator<Float> invoke() {
        return C9415i.m22982e(this.$this_withIndex);
    }
}

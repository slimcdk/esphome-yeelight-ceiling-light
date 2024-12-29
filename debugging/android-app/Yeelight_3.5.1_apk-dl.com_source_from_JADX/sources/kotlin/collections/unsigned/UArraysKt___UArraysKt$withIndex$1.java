package kotlin.collections.unsigned;

import java.util.Iterator;
import kotlin.C9432l;
import kotlin.C9434m;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p233y4.C12049a;

final class UArraysKt___UArraysKt$withIndex$1 extends Lambda implements C12049a<Iterator<? extends C9432l>> {
    final /* synthetic */ int[] $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UArraysKt___UArraysKt$withIndex$1(int[] iArr) {
        super(0);
        this.$this_withIndex = iArr;
    }

    @NotNull
    public final Iterator<C9432l> invoke() {
        return C9434m.m23049b(this.$this_withIndex);
    }
}

package kotlin.collections.unsigned;

import java.util.Iterator;
import kotlin.C9441q;
import kotlin.C9443r;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p233y4.C12049a;

final class UArraysKt___UArraysKt$withIndex$4 extends Lambda implements C12049a<Iterator<? extends C9441q>> {
    final /* synthetic */ short[] $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UArraysKt___UArraysKt$withIndex$4(short[] sArr) {
        super(0);
        this.$this_withIndex = sArr;
    }

    @NotNull
    public final Iterator<C9441q> invoke() {
        return C9443r.m23065b(this.$this_withIndex);
    }
}

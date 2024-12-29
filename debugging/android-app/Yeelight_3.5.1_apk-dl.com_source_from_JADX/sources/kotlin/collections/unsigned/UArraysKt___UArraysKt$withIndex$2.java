package kotlin.collections.unsigned;

import java.util.Iterator;
import kotlin.C9436n;
import kotlin.C9438o;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p233y4.C12049a;

final class UArraysKt___UArraysKt$withIndex$2 extends Lambda implements C12049a<Iterator<? extends C9436n>> {
    final /* synthetic */ long[] $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UArraysKt___UArraysKt$withIndex$2(long[] jArr) {
        super(0);
        this.$this_withIndex = jArr;
    }

    @NotNull
    public final Iterator<C9436n> invoke() {
        return C9438o.m23057b(this.$this_withIndex);
    }
}

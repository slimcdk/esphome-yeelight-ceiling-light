package kotlin.collections.unsigned;

import java.util.Iterator;
import kotlin.C9403j;
import kotlin.C9430k;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p233y4.C12049a;

final class UArraysKt___UArraysKt$withIndex$3 extends Lambda implements C12049a<Iterator<? extends C9403j>> {
    final /* synthetic */ byte[] $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UArraysKt___UArraysKt$withIndex$3(byte[] bArr) {
        super(0);
        this.$this_withIndex = bArr;
    }

    @NotNull
    public final Iterator<C9403j> invoke() {
        return C9430k.m23041b(this.$this_withIndex);
    }
}

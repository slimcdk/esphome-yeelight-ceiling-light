package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.C9415i;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p233y4.C12049a;

final class ArraysKt___ArraysKt$withIndex$2 extends Lambda implements C12049a<Iterator<? extends Byte>> {
    final /* synthetic */ byte[] $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ArraysKt___ArraysKt$withIndex$2(byte[] bArr) {
        super(0);
        this.$this_withIndex = bArr;
    }

    @NotNull
    public final Iterator<Byte> invoke() {
        return C9415i.m22979b(this.$this_withIndex);
    }
}

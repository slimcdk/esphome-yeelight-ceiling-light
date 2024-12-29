package kotlin.text;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p233y4.C12049a;

final class StringsKt___StringsKt$withIndex$1 extends Lambda implements C12049a<Iterator<? extends Character>> {
    final /* synthetic */ CharSequence $this_withIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StringsKt___StringsKt$withIndex$1(CharSequence charSequence) {
        super(0);
        this.$this_withIndex = charSequence;
    }

    @NotNull
    public final Iterator<Character> invoke() {
        return C9515r.m23153p(this.$this_withIndex);
    }
}

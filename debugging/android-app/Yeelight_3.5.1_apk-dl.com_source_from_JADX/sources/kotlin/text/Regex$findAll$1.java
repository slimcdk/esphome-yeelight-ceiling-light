package kotlin.text;

import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p233y4.C12049a;

final class Regex$findAll$1 extends Lambda implements C12049a<C9503f> {
    final /* synthetic */ CharSequence $input;
    final /* synthetic */ int $startIndex;
    final /* synthetic */ Regex this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Regex$findAll$1(Regex regex, CharSequence charSequence, int i) {
        super(0);
        this.this$0 = regex;
        this.$input = charSequence;
        this.$startIndex = i;
    }

    @Nullable
    public final C9503f invoke() {
        return this.this$0.find(this.$input, this.$startIndex);
    }
}

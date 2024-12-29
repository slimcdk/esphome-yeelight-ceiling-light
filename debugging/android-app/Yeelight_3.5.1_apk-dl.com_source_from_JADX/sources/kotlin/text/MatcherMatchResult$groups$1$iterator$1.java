package kotlin.text;

import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p233y4.C12060l;

final class MatcherMatchResult$groups$1$iterator$1 extends Lambda implements C12060l<Integer, C9502e> {
    final /* synthetic */ MatcherMatchResult$groups$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MatcherMatchResult$groups$1$iterator$1(MatcherMatchResult$groups$1 matcherMatchResult$groups$1) {
        super(1);
        this.this$0 = matcherMatchResult$groups$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    @Nullable
    public final C9502e invoke(int i) {
        return this.this$0.mo38448g(i);
    }
}

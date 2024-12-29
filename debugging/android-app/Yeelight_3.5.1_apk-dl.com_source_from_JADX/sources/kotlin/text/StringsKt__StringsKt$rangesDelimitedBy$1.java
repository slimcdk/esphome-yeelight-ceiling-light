package kotlin.text;

import kotlin.C9401i;
import kotlin.Pair;
import kotlin.jvm.internal.C9424q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233y4.C12064p;

final class StringsKt__StringsKt$rangesDelimitedBy$1 extends Lambda implements C12064p<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {
    final /* synthetic */ char[] $delimiters;
    final /* synthetic */ boolean $ignoreCase;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StringsKt__StringsKt$rangesDelimitedBy$1(char[] cArr, boolean z) {
        super(2);
        this.$delimiters = cArr;
        this.$ignoreCase = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((CharSequence) obj, ((Number) obj2).intValue());
    }

    @Nullable
    public final Pair<Integer, Integer> invoke(@NotNull CharSequence charSequence, int i) {
        C9424q.m22996e(charSequence, "$this$$receiver");
        int o = C9515r.m23152o(charSequence, this.$delimiters, i, this.$ignoreCase);
        if (o < 0) {
            return null;
        }
        return C9401i.m22955a(Integer.valueOf(o), 1);
    }
}

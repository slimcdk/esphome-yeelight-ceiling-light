package kotlin.text;

import java.util.List;
import kotlin.C9401i;
import kotlin.Pair;
import kotlin.jvm.internal.C9424q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233y4.C12064p;

final class StringsKt__StringsKt$rangesDelimitedBy$2 extends Lambda implements C12064p<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {
    final /* synthetic */ List<String> $delimitersList;
    final /* synthetic */ boolean $ignoreCase;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StringsKt__StringsKt$rangesDelimitedBy$2(List<String> list, boolean z) {
        super(2);
        this.$delimitersList = list;
        this.$ignoreCase = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((CharSequence) obj, ((Number) obj2).intValue());
    }

    @Nullable
    public final Pair<Integer, Integer> invoke(@NotNull CharSequence charSequence, int i) {
        C9424q.m22996e(charSequence, "$this$$receiver");
        Pair e = C9515r.m23143f(charSequence, this.$delimitersList, i, this.$ignoreCase, false);
        if (e != null) {
            return C9401i.m22955a(e.getFirst(), Integer.valueOf(((String) e.getSecond()).length()));
        }
        return null;
    }
}

package kotlin.text;

import kotlin.jvm.internal.C9424q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p125a5.C3975c;
import p233y4.C12060l;

final class StringsKt__StringsKt$splitToSequence$2 extends Lambda implements C12060l<C3975c, String> {
    final /* synthetic */ CharSequence $this_splitToSequence;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StringsKt__StringsKt$splitToSequence$2(CharSequence charSequence) {
        super(1);
        this.$this_splitToSequence = charSequence;
    }

    @NotNull
    public final String invoke(@NotNull C3975c cVar) {
        C9424q.m22996e(cVar, "it");
        return C9515r.m23161x(this.$this_splitToSequence, cVar);
    }
}

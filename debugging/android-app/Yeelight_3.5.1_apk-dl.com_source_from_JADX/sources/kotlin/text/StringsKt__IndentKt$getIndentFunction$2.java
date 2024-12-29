package kotlin.text;

import kotlin.jvm.internal.C9424q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p233y4.C12060l;

final class StringsKt__IndentKt$getIndentFunction$2 extends Lambda implements C12060l<String, String> {
    final /* synthetic */ String $indent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StringsKt__IndentKt$getIndentFunction$2(String str) {
        super(1);
        this.$indent = str;
    }

    @NotNull
    public final String invoke(@NotNull String str) {
        C9424q.m22996e(str, "line");
        return this.$indent + str;
    }
}

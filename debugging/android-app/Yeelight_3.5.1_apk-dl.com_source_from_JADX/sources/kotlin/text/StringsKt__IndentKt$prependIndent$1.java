package kotlin.text;

import kotlin.jvm.internal.C9424q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p233y4.C12060l;

final class StringsKt__IndentKt$prependIndent$1 extends Lambda implements C12060l<String, String> {
    final /* synthetic */ String $indent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StringsKt__IndentKt$prependIndent$1(String str) {
        super(1);
        this.$indent = str;
    }

    @NotNull
    public final String invoke(@NotNull String str) {
        C9424q.m22996e(str, "it");
        if (C9514q.m23139b(str)) {
            return str.length() < this.$indent.length() ? this.$indent : str;
        }
        return this.$indent + str;
    }
}

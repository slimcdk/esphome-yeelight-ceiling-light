package kotlin.text;

import kotlin.jvm.internal.C9424q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p233y4.C12060l;

final class StringsKt___StringsKt$chunkedSequence$1 extends Lambda implements C12060l<CharSequence, String> {
    public static final StringsKt___StringsKt$chunkedSequence$1 INSTANCE = new StringsKt___StringsKt$chunkedSequence$1();

    StringsKt___StringsKt$chunkedSequence$1() {
        super(1);
    }

    @NotNull
    public final String invoke(@NotNull CharSequence charSequence) {
        C9424q.m22996e(charSequence, "it");
        return charSequence.toString();
    }
}

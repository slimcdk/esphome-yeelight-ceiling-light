package kotlin.text;

import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p233y4.C12060l;

final class Regex$special$$inlined$fromInt$1 extends Lambda implements C12060l<RegexOption, Boolean> {
    final /* synthetic */ int $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Regex$special$$inlined$fromInt$1(int i) {
        super(1);
        this.$value = i;
    }

    @NotNull
    public final Boolean invoke(RegexOption regexOption) {
        C9501d dVar = regexOption;
        return Boolean.valueOf((this.$value & dVar.getMask()) == dVar.getValue());
    }
}

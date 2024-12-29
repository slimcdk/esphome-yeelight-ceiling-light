package kotlin.text;

import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p233y4.C12060l;

public final class RegexKt$fromInt$1$1 extends Lambda implements C12060l<Enum, Boolean> {
    final /* synthetic */ int $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegexKt$fromInt$1$1(int i) {
        super(1);
        this.$value = i;
    }

    @NotNull
    public final Boolean invoke(Enum enumR) {
        C9501d dVar = (C9501d) enumR;
        return Boolean.valueOf((this.$value & dVar.getMask()) == dVar.getValue());
    }
}

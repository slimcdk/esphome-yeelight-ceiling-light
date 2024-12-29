package kotlin.text;

import kotlin.jvm.internal.C9424q;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p223w3.C11571p0;
import p233y4.C12060l;

/* synthetic */ class Regex$findAll$2 extends FunctionReferenceImpl implements C12060l<C9503f, C9503f> {
    public static final Regex$findAll$2 INSTANCE = new Regex$findAll$2();

    Regex$findAll$2() {
        super(1, C9503f.class, "next", "next()Lkotlin/text/MatchResult;", 0);
    }

    @Nullable
    public final C9503f invoke(@NotNull C9503f fVar) {
        C9424q.m22996e(fVar, C11571p0.f21272C);
        return fVar.next();
    }
}

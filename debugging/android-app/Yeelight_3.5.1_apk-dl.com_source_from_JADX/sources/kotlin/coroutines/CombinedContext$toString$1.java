package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C9424q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p233y4.C12064p;

final class CombinedContext$toString$1 extends Lambda implements C12064p<String, CoroutineContext.C9376a, String> {
    public static final CombinedContext$toString$1 INSTANCE = new CombinedContext$toString$1();

    CombinedContext$toString$1() {
        super(2);
    }

    @NotNull
    public final String invoke(@NotNull String str, @NotNull CoroutineContext.C9376a aVar) {
        C9424q.m22996e(str, "acc");
        C9424q.m22996e(aVar, "element");
        if (str.length() == 0) {
            return aVar.toString();
        }
        return str + ", " + aVar;
    }
}

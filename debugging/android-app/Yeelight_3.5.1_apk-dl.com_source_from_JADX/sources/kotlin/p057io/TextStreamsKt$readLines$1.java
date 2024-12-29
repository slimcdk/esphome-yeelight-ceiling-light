package kotlin.p057io;

import java.util.ArrayList;
import kotlin.C9478s;
import kotlin.jvm.internal.C9424q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p233y4.C12060l;

/* renamed from: kotlin.io.TextStreamsKt$readLines$1 */
final class TextStreamsKt$readLines$1 extends Lambda implements C12060l<String, C9478s> {
    final /* synthetic */ ArrayList<String> $result;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextStreamsKt$readLines$1(ArrayList<String> arrayList) {
        super(1);
        this.$result = arrayList;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C9478s.f17335a;
    }

    public final void invoke(@NotNull String str) {
        C9424q.m22996e(str, "it");
        this.$result.add(str);
    }
}

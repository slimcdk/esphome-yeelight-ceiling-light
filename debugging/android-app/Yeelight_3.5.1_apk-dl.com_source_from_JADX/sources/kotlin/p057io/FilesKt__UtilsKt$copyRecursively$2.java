package kotlin.p057io;

import java.io.File;
import java.io.IOException;
import kotlin.C9478s;
import kotlin.jvm.internal.C9424q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p223w3.C10865f;
import p233y4.C12064p;

/* renamed from: kotlin.io.FilesKt__UtilsKt$copyRecursively$2 */
final class FilesKt__UtilsKt$copyRecursively$2 extends Lambda implements C12064p<File, IOException, C9478s> {
    final /* synthetic */ C12064p<File, IOException, OnErrorAction> $onError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FilesKt__UtilsKt$copyRecursively$2(C12064p<? super File, ? super IOException, ? extends OnErrorAction> pVar) {
        super(2);
        this.$onError = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((File) obj, (IOException) obj2);
        return C9478s.f17335a;
    }

    public final void invoke(@NotNull File file, @NotNull IOException iOException) {
        C9424q.m22996e(file, C10865f.f20187C);
        C9424q.m22996e(iOException, "e");
        if (this.$onError.invoke(file, iOException) == OnErrorAction.TERMINATE) {
            throw new TerminateException(file);
        }
    }
}

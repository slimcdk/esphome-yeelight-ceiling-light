package kotlin.p057io;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.C9424q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p233y4.C12064p;

/* renamed from: kotlin.io.FilesKt__UtilsKt$copyRecursively$1 */
final class FilesKt__UtilsKt$copyRecursively$1 extends Lambda implements C12064p {
    public static final FilesKt__UtilsKt$copyRecursively$1 INSTANCE = new FilesKt__UtilsKt$copyRecursively$1();

    FilesKt__UtilsKt$copyRecursively$1() {
        super(2);
    }

    @NotNull
    public final Void invoke(@NotNull File file, @NotNull IOException iOException) {
        C9424q.m22996e(file, "<anonymous parameter 0>");
        C9424q.m22996e(iOException, "exception");
        throw iOException;
    }
}

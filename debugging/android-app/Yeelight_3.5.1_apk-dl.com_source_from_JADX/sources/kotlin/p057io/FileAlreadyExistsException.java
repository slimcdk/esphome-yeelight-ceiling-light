package kotlin.p057io;

import java.io.File;
import kotlin.jvm.internal.C9422o;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.io.FileAlreadyExistsException */
public final class FileAlreadyExistsException extends FileSystemException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FileAlreadyExistsException(@NotNull File file, @Nullable File file2, @Nullable String str) {
        super(file, file2, str);
        C9424q.m22996e(file, "file");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FileAlreadyExistsException(File file, File file2, String str, int i, C9422o oVar) {
        this(file, (i & 2) != 0 ? null : file2, (i & 4) != 0 ? null : str);
    }
}

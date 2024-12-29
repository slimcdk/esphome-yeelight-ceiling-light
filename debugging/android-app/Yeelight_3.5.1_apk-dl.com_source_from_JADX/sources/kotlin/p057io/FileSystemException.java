package kotlin.p057io;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.C9422o;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.io.FileSystemException */
public class FileSystemException extends IOException {
    @NotNull
    private final File file;
    @Nullable
    private final File other;
    @Nullable
    private final String reason;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FileSystemException(@NotNull File file2, @Nullable File file3, @Nullable String str) {
        super(C9402a.m22956a(file2, file3, str));
        C9424q.m22996e(file2, "file");
        this.file = file2;
        this.other = file3;
        this.reason = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FileSystemException(File file2, File file3, String str, int i, C9422o oVar) {
        this(file2, (i & 2) != 0 ? null : file3, (i & 4) != 0 ? null : str);
    }

    @NotNull
    public final File getFile() {
        return this.file;
    }

    @Nullable
    public final File getOther() {
        return this.other;
    }

    @Nullable
    public final String getReason() {
        return this.reason;
    }
}

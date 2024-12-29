package kotlin.p057io;

import java.io.File;
import kotlin.jvm.internal.C9422o;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.io.TerminateException */
final class TerminateException extends FileSystemException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TerminateException(@NotNull File file) {
        super(file, (File) null, (String) null, 6, (C9422o) null);
        C9424q.m22996e(file, "file");
    }
}

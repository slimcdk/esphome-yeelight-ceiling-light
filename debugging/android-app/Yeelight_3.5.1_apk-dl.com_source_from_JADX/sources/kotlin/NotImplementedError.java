package kotlin;

import com.miot.api.Constants;
import kotlin.jvm.internal.C9422o;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;

public final class NotImplementedError extends Error {
    public NotImplementedError() {
        this((String) null, 1, (C9422o) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotImplementedError(@NotNull String str) {
        super(str);
        C9424q.m22996e(str, Constants.EXTRA_PUSH_MESSAGE);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NotImplementedError(String str, int i, C9422o oVar) {
        this((i & 1) != 0 ? "An operation is not implemented." : str);
    }
}

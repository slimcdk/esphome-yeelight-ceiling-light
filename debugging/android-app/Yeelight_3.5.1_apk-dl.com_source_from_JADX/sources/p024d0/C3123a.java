package p024d0;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.common.C0999l;
import java.util.concurrent.Executor;

@KeepForSdk
/* renamed from: d0.a */
public class C3123a implements Executor {

    /* renamed from: a */
    private final Handler f5001a;

    @KeepForSdk
    public C3123a(@NonNull Looper looper) {
        this.f5001a = new C0999l(looper);
    }

    public final void execute(@NonNull Runnable runnable) {
        this.f5001a.post(runnable);
    }
}

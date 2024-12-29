package p011c.p012a.p019b.p028b.p038e;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: c.a.b.b.e.j */
public final class C0621j {

    /* renamed from: a */
    public static final Executor f312a = new C0622a();

    /* renamed from: b */
    static final Executor f313b = new C0611b0();

    /* renamed from: c.a.b.b.e.j$a */
    private static final class C0622a implements Executor {

        /* renamed from: a */
        private final Handler f314a = new Handler(Looper.getMainLooper());

        public final void execute(@NonNull Runnable runnable) {
            this.f314a.post(runnable);
        }
    }
}

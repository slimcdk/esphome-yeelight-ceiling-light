package androidx.core.p005os;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: androidx.core.os.HandlerCompat */
public final class HandlerCompat {
    private HandlerCompat() {
    }

    public static boolean postDelayed(@NonNull Handler handler, @NonNull Runnable runnable, @Nullable Object obj, long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            return handler.postDelayed(runnable, obj, j);
        }
        Message obtain = Message.obtain(handler, runnable);
        obtain.obj = obj;
        return handler.sendMessageDelayed(obtain, j);
    }
}

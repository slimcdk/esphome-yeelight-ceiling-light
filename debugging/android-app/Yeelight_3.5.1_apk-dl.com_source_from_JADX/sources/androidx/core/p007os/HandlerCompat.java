package androidx.core.p007os;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.core.os.HandlerCompat */
public final class HandlerCompat {
    private static final String TAG = "HandlerCompat";

    @RequiresApi(28)
    /* renamed from: androidx.core.os.HandlerCompat$Api28Impl */
    private static class Api28Impl {
        private Api28Impl() {
        }

        public static Handler createAsync(Looper looper) {
            return Handler.createAsync(looper);
        }

        public static Handler createAsync(Looper looper, Handler.Callback callback) {
            return Handler.createAsync(looper, callback);
        }

        public static boolean postDelayed(Handler handler, Runnable runnable, Object obj, long j) {
            return handler.postDelayed(runnable, obj, j);
        }
    }

    @RequiresApi(29)
    /* renamed from: androidx.core.os.HandlerCompat$Api29Impl */
    private static class Api29Impl {
        private Api29Impl() {
        }

        public static boolean hasCallbacks(Handler handler, Runnable runnable) {
            return handler.hasCallbacks(runnable);
        }
    }

    private HandlerCompat() {
    }

    @NonNull
    public static Handler createAsync(@NonNull Looper looper) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return Api28Impl.createAsync(looper);
        }
        if (i >= 17) {
            Class<Handler> cls = Handler.class;
            try {
                return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                } else if (cause instanceof Error) {
                    throw ((Error) cause);
                } else {
                    throw new RuntimeException(cause);
                }
            }
        }
        return new Handler(looper);
    }

    @NonNull
    public static Handler createAsync(@NonNull Looper looper, @NonNull Handler.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return Api28Impl.createAsync(looper, callback);
        }
        if (i >= 17) {
            Class<Handler> cls = Handler.class;
            try {
                return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, callback, Boolean.TRUE});
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                } else if (cause instanceof Error) {
                    throw ((Error) cause);
                } else {
                    throw new RuntimeException(cause);
                }
            }
        }
        return new Handler(looper, callback);
    }

    @RequiresApi(16)
    public static boolean hasCallbacks(@NonNull Handler handler, @NonNull Runnable runnable) {
        Throwable e;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            return Api29Impl.hasCallbacks(handler, runnable);
        }
        if (i >= 16) {
            try {
                return ((Boolean) Handler.class.getMethod("hasCallbacks", new Class[]{Runnable.class}).invoke(handler, new Object[]{runnable})).booleanValue();
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                } else if (cause instanceof Error) {
                    throw ((Error) cause);
                } else {
                    throw new RuntimeException(cause);
                }
            } catch (IllegalAccessException | NoSuchMethodException | NullPointerException e3) {
                e = e3;
            }
        } else {
            e = null;
            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e);
        }
    }

    public static boolean postDelayed(@NonNull Handler handler, @NonNull Runnable runnable, @Nullable Object obj, long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.postDelayed(handler, runnable, obj, j);
        }
        Message obtain = Message.obtain(handler, runnable);
        obtain.obj = obj;
        return handler.sendMessageDelayed(obtain, j);
    }
}

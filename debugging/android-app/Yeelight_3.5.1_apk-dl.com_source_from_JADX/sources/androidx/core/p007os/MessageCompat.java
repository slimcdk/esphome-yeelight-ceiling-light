package androidx.core.p007os;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Message;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* renamed from: androidx.core.os.MessageCompat */
public final class MessageCompat {
    private static boolean sTryIsAsynchronous = true;
    private static boolean sTrySetAsynchronous = true;

    @RequiresApi(22)
    /* renamed from: androidx.core.os.MessageCompat$Api22Impl */
    static class Api22Impl {
        private Api22Impl() {
        }

        @DoNotInline
        static boolean isAsynchronous(Message message) {
            return message.isAsynchronous();
        }

        @DoNotInline
        static void setAsynchronous(Message message, boolean z) {
            message.setAsynchronous(z);
        }
    }

    private MessageCompat() {
    }

    @SuppressLint({"NewApi"})
    public static boolean isAsynchronous(@NonNull Message message) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 22) {
            return Api22Impl.isAsynchronous(message);
        }
        if (sTryIsAsynchronous && i >= 16) {
            try {
                return Api22Impl.isAsynchronous(message);
            } catch (NoSuchMethodError unused) {
                sTryIsAsynchronous = false;
            }
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    public static void setAsynchronous(@NonNull Message message, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 22) {
            Api22Impl.setAsynchronous(message, z);
        } else if (sTrySetAsynchronous && i >= 16) {
            try {
                Api22Impl.setAsynchronous(message, z);
            } catch (NoSuchMethodError unused) {
                sTrySetAsynchronous = false;
            }
        }
    }
}

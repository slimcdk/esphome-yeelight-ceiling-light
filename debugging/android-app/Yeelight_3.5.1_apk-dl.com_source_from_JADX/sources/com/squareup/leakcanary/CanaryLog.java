package com.squareup.leakcanary;

import android.util.Log;
import org.apache.commons.p194io.IOUtils;

public final class CanaryLog {
    private static volatile Logger logger = new DefaultLogger();

    private static class DefaultLogger implements Logger {
        DefaultLogger() {
        }

        /* renamed from: d */
        public void mo27726d(String str, Object... objArr) {
            String format = String.format(str, objArr);
            if (format.length() >= 4000) {
                for (String str2 : format.split(IOUtils.LINE_SEPARATOR_UNIX)) {
                }
            }
        }

        /* renamed from: d */
        public void mo27727d(Throwable th, String str, Object... objArr) {
            mo27726d(String.format(str, objArr) + 10 + Log.getStackTraceString(th), new Object[0]);
        }
    }

    public interface Logger {
        /* renamed from: d */
        void mo27726d(String str, Object... objArr);

        /* renamed from: d */
        void mo27727d(Throwable th, String str, Object... objArr);
    }

    private CanaryLog() {
        throw new AssertionError();
    }

    /* renamed from: d */
    public static void m11817d(String str, Object... objArr) {
        Logger logger2 = logger;
        if (logger2 != null) {
            logger2.mo27726d(str, objArr);
        }
    }

    /* renamed from: d */
    public static void m11818d(Throwable th, String str, Object... objArr) {
        Logger logger2 = logger;
        if (logger2 != null) {
            logger2.mo27727d(th, str, objArr);
        }
    }

    public static void setLogger(Logger logger2) {
        logger = logger2;
    }
}

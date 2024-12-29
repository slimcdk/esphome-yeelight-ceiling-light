package com.squareup.leakcanary;

import android.util.Log;
import org.apache.commons.p271io.IOUtils;

public final class CanaryLog {
    private static volatile Logger logger = new DefaultLogger();

    private static class DefaultLogger implements Logger {
        DefaultLogger() {
        }

        /* renamed from: d */
        public void mo22435d(String str, Object... objArr) {
            String format = String.format(str, objArr);
            if (format.length() >= 4000) {
                for (String str2 : format.split(IOUtils.LINE_SEPARATOR_UNIX)) {
                }
            }
        }

        /* renamed from: d */
        public void mo22436d(Throwable th, String str, Object... objArr) {
            mo22435d(String.format(str, objArr) + 10 + Log.getStackTraceString(th), new Object[0]);
        }
    }

    public interface Logger {
        /* renamed from: d */
        void mo22435d(String str, Object... objArr);

        /* renamed from: d */
        void mo22436d(Throwable th, String str, Object... objArr);
    }

    private CanaryLog() {
        throw new AssertionError();
    }

    /* renamed from: d */
    public static void m10641d(String str, Object... objArr) {
        Logger logger2 = logger;
        if (logger2 != null) {
            logger2.mo22435d(str, objArr);
        }
    }

    /* renamed from: d */
    public static void m10642d(Throwable th, String str, Object... objArr) {
        Logger logger2 = logger;
        if (logger2 != null) {
            logger2.mo22436d(th, str, objArr);
        }
    }

    public static void setLogger(Logger logger2) {
        logger = logger2;
    }
}

package androidx.core.p007os;

import android.os.Build;
import android.os.Trace;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;

@Deprecated
/* renamed from: androidx.core.os.TraceCompat */
public final class TraceCompat {
    private static final String TAG = "TraceCompat";
    private static Method sAsyncTraceBeginMethod;
    private static Method sAsyncTraceEndMethod;
    private static Method sIsTagEnabledMethod;
    private static Method sTraceCounterMethod;
    private static long sTraceTagApp;

    @RequiresApi(18)
    /* renamed from: androidx.core.os.TraceCompat$Api18Impl */
    static class Api18Impl {
        private Api18Impl() {
        }

        @DoNotInline
        static void beginSection(String str) {
            Trace.beginSection(str);
        }

        @DoNotInline
        static void endSection() {
            Trace.endSection();
        }
    }

    @RequiresApi(29)
    /* renamed from: androidx.core.os.TraceCompat$Api29Impl */
    static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        static void beginAsyncSection(String str, int i) {
            Trace.beginAsyncSection(str, i);
        }

        @DoNotInline
        static void endAsyncSection(String str, int i) {
            Trace.endAsyncSection(str, i);
        }

        @DoNotInline
        static boolean isEnabled() {
            return Trace.isEnabled();
        }

        @DoNotInline
        static void setCounter(String str, long j) {
            Trace.setCounter(str, j);
        }
    }

    static {
        Class<String> cls = String.class;
        int i = Build.VERSION.SDK_INT;
        if (i >= 18 && i < 29) {
            try {
                sTraceTagApp = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                Class cls2 = Long.TYPE;
                sIsTagEnabledMethod = Trace.class.getMethod("isTagEnabled", new Class[]{cls2});
                Class cls3 = Integer.TYPE;
                sAsyncTraceBeginMethod = Trace.class.getMethod("asyncTraceBegin", new Class[]{cls2, cls, cls3});
                sAsyncTraceEndMethod = Trace.class.getMethod("asyncTraceEnd", new Class[]{cls2, cls, cls3});
                sTraceCounterMethod = Trace.class.getMethod("traceCounter", new Class[]{cls2, cls, cls3});
            } catch (Exception unused) {
            }
        }
    }

    private TraceCompat() {
    }

    public static void beginAsyncSection(@NonNull String str, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            Api29Impl.beginAsyncSection(str, i);
        } else if (i2 >= 18) {
            try {
                sAsyncTraceBeginMethod.invoke((Object) null, new Object[]{Long.valueOf(sTraceTagApp), str, Integer.valueOf(i)});
            } catch (Exception unused) {
            }
        }
    }

    public static void beginSection(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Api18Impl.beginSection(str);
        }
    }

    public static void endAsyncSection(@NonNull String str, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            Api29Impl.endAsyncSection(str, i);
        } else if (i2 >= 18) {
            try {
                sAsyncTraceEndMethod.invoke((Object) null, new Object[]{Long.valueOf(sTraceTagApp), str, Integer.valueOf(i)});
            } catch (Exception unused) {
            }
        }
    }

    public static void endSection() {
        if (Build.VERSION.SDK_INT >= 18) {
            Api18Impl.endSection();
        }
    }

    public static boolean isEnabled() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            return Api29Impl.isEnabled();
        }
        if (i >= 18) {
            try {
                return ((Boolean) sIsTagEnabledMethod.invoke((Object) null, new Object[]{Long.valueOf(sTraceTagApp)})).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static void setCounter(@NonNull String str, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            Api29Impl.setCounter(str, (long) i);
        } else if (i2 >= 18) {
            try {
                sTraceCounterMethod.invoke((Object) null, new Object[]{Long.valueOf(sTraceTagApp), str, Integer.valueOf(i)});
            } catch (Exception unused) {
            }
        }
    }
}

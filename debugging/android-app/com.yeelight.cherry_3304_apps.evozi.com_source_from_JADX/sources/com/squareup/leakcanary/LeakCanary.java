package com.squareup.leakcanary;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.format.Formatter;
import android.util.Log;
import com.squareup.leakcanary.HeapDump;
import com.squareup.leakcanary.internal.DisplayLeakActivity;
import com.squareup.leakcanary.internal.HeapAnalyzerService;
import com.squareup.leakcanary.internal.LeakCanaryInternals;
import com.xiaomi.mipush.sdk.Constants;
import org.apache.commons.p271io.IOUtils;

public final class LeakCanary {
    private LeakCanary() {
        throw new AssertionError();
    }

    public static RefWatcher androidWatcher(Context context, HeapDump.Listener listener, ExcludedRefs excludedRefs) {
        DefaultLeakDirectoryProvider defaultLeakDirectoryProvider = new DefaultLeakDirectoryProvider(context);
        AndroidDebuggerControl androidDebuggerControl = new AndroidDebuggerControl();
        AndroidHeapDumper androidHeapDumper = new AndroidHeapDumper(context, defaultLeakDirectoryProvider);
        androidHeapDumper.cleanup();
        return new RefWatcher(new AndroidWatchExecutor(context.getResources().getInteger(C3940R.integer.leak_canary_watch_delay_millis)), androidDebuggerControl, GcTrigger.DEFAULT, androidHeapDumper, listener, excludedRefs);
    }

    public static void enableDisplayLeakActivity(Context context) {
        LeakCanaryInternals.setEnabled(context, DisplayLeakActivity.class, true);
    }

    public static RefWatcher install(Application application) {
        return install(application, DisplayLeakService.class, AndroidExcludedRefs.createAppDefaults().build());
    }

    public static RefWatcher install(Application application, Class<? extends AbstractAnalysisResultService> cls, ExcludedRefs excludedRefs) {
        if (isInAnalyzerProcess(application)) {
            return RefWatcher.DISABLED;
        }
        enableDisplayLeakActivity(application);
        RefWatcher androidWatcher = androidWatcher(application, new ServiceHeapDumpListener(application, cls), excludedRefs);
        ActivityRefWatcher.installOnIcsPlus(application, androidWatcher);
        return androidWatcher;
    }

    public static boolean isInAnalyzerProcess(Context context) {
        return LeakCanaryInternals.isInServiceProcess(context, HeapAnalyzerService.class);
    }

    public static String leakInfo(Context context, HeapDump heapDump, AnalysisResult analysisResult, boolean z) {
        String str;
        StringBuilder sb;
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            String str2 = "In " + packageName + Constants.COLON_SEPARATOR + packageInfo.versionName + Constants.COLON_SEPARATOR + packageInfo.versionCode + ".\n";
            String str3 = "";
            if (analysisResult.leakFound) {
                if (analysisResult.excludedLeak) {
                    str2 = str2 + "* EXCLUDED LEAK.\n";
                }
                String str4 = str2 + "* " + analysisResult.className;
                if (!heapDump.referenceName.equals(str3)) {
                    str4 = str4 + " (" + heapDump.referenceName + ")";
                }
                str = (str4 + " has leaked:\n" + analysisResult.leakTrace.toString() + IOUtils.LINE_SEPARATOR_UNIX) + "* Retaining: " + Formatter.formatShortFileSize(context, analysisResult.retainedHeapSize) + ".\n";
                if (z) {
                    str3 = "\n* Details:\n" + analysisResult.leakTrace.toDetailedString();
                }
            } else {
                if (analysisResult.failure != null) {
                    sb = new StringBuilder();
                    sb.append(str2);
                    sb.append("* FAILURE:\n");
                    sb.append(Log.getStackTraceString(analysisResult.failure));
                    sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                } else {
                    sb = new StringBuilder();
                    sb.append(str2);
                    sb.append("* NO LEAK FOUND.\n\n");
                }
                str = sb.toString();
            }
            if (z) {
                str3 = str3 + "* Excluded Refs:\n" + heapDump.excludedRefs;
            }
            return str + "* Reference Key: " + heapDump.referenceKey + IOUtils.LINE_SEPARATOR_UNIX + "* Device: " + Build.MANUFACTURER + " " + Build.BRAND + " " + Build.MODEL + " " + Build.PRODUCT + IOUtils.LINE_SEPARATOR_UNIX + "* Android Version: " + Build.VERSION.RELEASE + " API: " + Build.VERSION.SDK_INT + " LeakCanary: " + BuildConfig.LIBRARY_VERSION + " " + BuildConfig.GIT_SHA + IOUtils.LINE_SEPARATOR_UNIX + "* Durations: watch=" + heapDump.watchDurationMs + "ms, gc=" + heapDump.gcDurationMs + "ms, heap dump=" + heapDump.heapDumpDurationMs + "ms, analysis=" + analysisResult.analysisDurationMs + "ms" + IOUtils.LINE_SEPARATOR_UNIX + str3;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void setDisplayLeakActivityDirectoryProvider(LeakDirectoryProvider leakDirectoryProvider) {
        DisplayLeakActivity.setLeakDirectoryProvider(leakDirectoryProvider);
    }
}

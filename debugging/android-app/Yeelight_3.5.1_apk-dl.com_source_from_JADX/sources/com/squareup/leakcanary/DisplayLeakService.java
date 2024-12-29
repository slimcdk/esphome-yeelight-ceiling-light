package com.squareup.leakcanary;

import android.app.PendingIntent;
import android.text.format.Formatter;
import com.squareup.leakcanary.internal.DisplayLeakActivity;
import com.squareup.leakcanary.internal.LeakCanaryInternals;
import java.io.File;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;

public class DisplayLeakService extends AbstractAnalysisResultService {
    private HeapDump renameHeapdump(HeapDump heapDump) {
        File file = new File(heapDump.heapDumpFile.getParent(), new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss_SSS'.hprof'", Locale.US).format(new Date()));
        if (!heapDump.heapDumpFile.renameTo(file)) {
            CanaryLog.m11817d("Could not rename heap dump file %s to %s", heapDump.heapDumpFile.getPath(), file.getPath());
        }
        HeapDump heapDump2 = new HeapDump(file, heapDump.referenceKey, heapDump.referenceName, heapDump.excludedRefs, heapDump.watchDurationMs, heapDump.gcDurationMs, heapDump.heapDumpDurationMs);
        int max = Math.max(getResources().getInteger(C4247R.integer.leak_canary_max_stored_leaks), 1);
        File[] listFiles = heapDump2.heapDumpFile.getParentFile().listFiles(new FilenameFilter() {
            public boolean accept(File file, String str) {
                return str.endsWith(".hprof");
            }
        });
        if (listFiles.length > max) {
            Arrays.sort(listFiles, new Comparator<File>() {
                public int compare(File file, File file2) {
                    return Long.valueOf(file.lastModified()).compareTo(Long.valueOf(file2.lastModified()));
                }
            });
            if (!listFiles[0].delete()) {
                CanaryLog.m11817d("Could not delete old hprof file %s", listFiles[0].getPath());
            }
        }
        return heapDump2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b A[SYNTHETIC, Splitter:B:20:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0051 A[SYNTHETIC, Splitter:B:25:0x0051] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean saveResult(com.squareup.leakcanary.HeapDump r5, com.squareup.leakcanary.AnalysisResult r6) {
        /*
            r4 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r5.heapDumpFile
            java.io.File r1 = r1.getParentFile()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.io.File r3 = r5.heapDumpFile
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r3 = ".result"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0040 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0040 }
            java.io.ObjectOutputStream r0 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x003b, all -> 0x0038 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x003b, all -> 0x0038 }
            r0.writeObject(r5)     // Catch:{ IOException -> 0x003b, all -> 0x0038 }
            r0.writeObject(r6)     // Catch:{ IOException -> 0x003b, all -> 0x0038 }
            r5 = 1
            r2.close()     // Catch:{ IOException -> 0x0037 }
        L_0x0037:
            return r5
        L_0x0038:
            r5 = move-exception
            r1 = r2
            goto L_0x004f
        L_0x003b:
            r5 = move-exception
            r1 = r2
            goto L_0x0041
        L_0x003e:
            r5 = move-exception
            goto L_0x004f
        L_0x0040:
            r5 = move-exception
        L_0x0041:
            java.lang.String r6 = "Could not save leak analysis result to disk."
            r0 = 0
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x003e }
            com.squareup.leakcanary.CanaryLog.m11818d(r5, r6, r2)     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x004e
            r1.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            return r0
        L_0x004f:
            if (r1 == 0) goto L_0x0054
            r1.close()     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.leakcanary.DisplayLeakService.saveResult(com.squareup.leakcanary.HeapDump, com.squareup.leakcanary.AnalysisResult):boolean");
    }

    /* access modifiers changed from: protected */
    public void afterDefaultHandling(HeapDump heapDump, AnalysisResult analysisResult, String str) {
    }

    /* access modifiers changed from: protected */
    public final void onHeapAnalyzed(HeapDump heapDump, AnalysisResult analysisResult) {
        boolean z;
        String string;
        int i;
        String leakInfo = LeakCanary.leakInfo(this, heapDump, analysisResult, true);
        CanaryLog.m11817d(leakInfo, new Object[0]);
        boolean z2 = analysisResult.leakFound || analysisResult.failure != null;
        if (z2) {
            heapDump = renameHeapdump(heapDump);
            z = saveResult(heapDump, analysisResult);
        } else {
            z = false;
        }
        PendingIntent pendingIntent = null;
        if (!z2) {
            string = getString(C4247R.string.leak_canary_no_leak_title);
            i = C4247R.string.leak_canary_no_leak_text;
        } else if (z) {
            pendingIntent = DisplayLeakActivity.createPendingIntent(this, heapDump.referenceKey);
            if (analysisResult.failure == null) {
                String formatShortFileSize = Formatter.formatShortFileSize(this, analysisResult.retainedHeapSize);
                String classSimpleName = LeakCanaryInternals.classSimpleName(analysisResult.className);
                string = analysisResult.excludedLeak ? getString(C4247R.string.leak_canary_leak_excluded, new Object[]{classSimpleName, formatShortFileSize}) : getString(C4247R.string.leak_canary_class_has_leaked, new Object[]{classSimpleName, formatShortFileSize});
            } else {
                string = getString(C4247R.string.leak_canary_analysis_failed);
            }
            i = C4247R.string.leak_canary_notification_message;
        } else {
            string = getString(C4247R.string.leak_canary_could_not_save_title);
            i = C4247R.string.leak_canary_could_not_save_text;
        }
        LeakCanaryInternals.showNotification(this, string, getString(i), pendingIntent);
        afterDefaultHandling(heapDump, analysisResult, leakInfo);
    }
}

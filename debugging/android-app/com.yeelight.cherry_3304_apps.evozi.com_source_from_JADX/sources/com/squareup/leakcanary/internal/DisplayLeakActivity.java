package com.squareup.leakcanary.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.format.DateUtils;
import android.text.format.Formatter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.squareup.leakcanary.AnalysisResult;
import com.squareup.leakcanary.C3940R;
import com.squareup.leakcanary.CanaryLog;
import com.squareup.leakcanary.DefaultLeakDirectoryProvider;
import com.squareup.leakcanary.HeapDump;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.LeakDirectoryProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

@TargetApi(11)
public final class DisplayLeakActivity extends Activity {
    private static final String SHOW_LEAK_EXTRA = "show_latest";
    private static LeakDirectoryProvider leakDirectoryProvider;
    private Button actionButton;
    private TextView failureView;
    List<Leak> leaks;
    private ListView listView;
    String visibleLeakRefKey;

    static class Leak {
        final HeapDump heapDump;
        final AnalysisResult result;
        final File resultFile;

        Leak(HeapDump heapDump2, AnalysisResult analysisResult, File file) {
            this.heapDump = heapDump2;
            this.result = analysisResult;
            this.resultFile = file;
        }
    }

    class LeakListAdapter extends BaseAdapter {
        LeakListAdapter() {
        }

        public int getCount() {
            return DisplayLeakActivity.this.leaks.size();
        }

        public Leak getItem(int i) {
            return DisplayLeakActivity.this.leaks.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            StringBuilder sb;
            if (view == null) {
                view = LayoutInflater.from(DisplayLeakActivity.this).inflate(C3940R.layout.leak_canary_leak_row, viewGroup, false);
            }
            TextView textView = (TextView) view.findViewById(C3940R.C3942id.__leak_canary_row_text);
            TextView textView2 = (TextView) view.findViewById(C3940R.C3942id.__leak_canary_row_time);
            Leak item = getItem(i);
            String str = (DisplayLeakActivity.this.leaks.size() - i) + ". ";
            AnalysisResult analysisResult = item.result;
            if (analysisResult.failure == null) {
                String string = DisplayLeakActivity.this.getString(C3940R.string.leak_canary_class_has_leaked, new Object[]{DisplayLeakActivity.classSimpleName(analysisResult.className), Formatter.formatShortFileSize(DisplayLeakActivity.this, item.result.retainedHeapSize)});
                if (item.result.excludedLeak) {
                    string = DisplayLeakActivity.this.getString(C3940R.string.leak_canary_excluded_row, new Object[]{string});
                }
                sb = new StringBuilder();
                sb.append(str);
                sb.append(string);
            } else {
                sb = new StringBuilder();
                sb.append(str);
                sb.append(item.result.failure.getClass().getSimpleName());
                sb.append(" ");
                sb.append(item.result.failure.getMessage());
            }
            textView.setText(sb.toString());
            textView2.setText(DateUtils.formatDateTime(DisplayLeakActivity.this, item.resultFile.lastModified(), 17));
            return view;
        }
    }

    static class LoadLeaks implements Runnable {
        static final Executor backgroundExecutor = LeakCanaryInternals.newSingleThreadExecutor("LoadLeaks");
        static final List<LoadLeaks> inFlight = new ArrayList();
        DisplayLeakActivity activityOrNull;
        private final File leakDirectory;
        private final Handler mainHandler = new Handler(Looper.getMainLooper());

        LoadLeaks(DisplayLeakActivity displayLeakActivity) {
            this.activityOrNull = displayLeakActivity;
            this.leakDirectory = DisplayLeakActivity.getLeakDirectory(displayLeakActivity);
        }

        static void forgetActivity() {
            for (LoadLeaks loadLeaks : inFlight) {
                loadLeaks.activityOrNull = null;
            }
            inFlight.clear();
        }

        static void load(DisplayLeakActivity displayLeakActivity) {
            LoadLeaks loadLeaks = new LoadLeaks(displayLeakActivity);
            inFlight.add(loadLeaks);
            backgroundExecutor.execute(loadLeaks);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x004f A[Catch:{ all -> 0x0068 }] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0059 A[Catch:{ all -> 0x0068 }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x006c A[SYNTHETIC, Splitter:B:26:0x006c] */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0065 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r11 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.io.File r1 = r11.leakDirectory
                com.squareup.leakcanary.internal.DisplayLeakActivity$LoadLeaks$1 r2 = new com.squareup.leakcanary.internal.DisplayLeakActivity$LoadLeaks$1
                r2.<init>()
                java.io.File[] r1 = r1.listFiles(r2)
                if (r1 == 0) goto L_0x0078
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L_0x0015:
                if (r4 >= r2) goto L_0x0070
                r5 = r1[r4]
                r6 = 0
                java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0044, ClassNotFoundException -> 0x0042, all -> 0x0040 }
                r7.<init>(r5)     // Catch:{ IOException -> 0x0044, ClassNotFoundException -> 0x0042, all -> 0x0040 }
                java.io.ObjectInputStream r6 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x003e, ClassNotFoundException -> 0x003c }
                r6.<init>(r7)     // Catch:{ IOException -> 0x003e, ClassNotFoundException -> 0x003c }
                java.lang.Object r8 = r6.readObject()     // Catch:{ IOException -> 0x003e, ClassNotFoundException -> 0x003c }
                com.squareup.leakcanary.HeapDump r8 = (com.squareup.leakcanary.HeapDump) r8     // Catch:{ IOException -> 0x003e, ClassNotFoundException -> 0x003c }
                java.lang.Object r6 = r6.readObject()     // Catch:{ IOException -> 0x003e, ClassNotFoundException -> 0x003c }
                com.squareup.leakcanary.AnalysisResult r6 = (com.squareup.leakcanary.AnalysisResult) r6     // Catch:{ IOException -> 0x003e, ClassNotFoundException -> 0x003c }
                com.squareup.leakcanary.internal.DisplayLeakActivity$Leak r9 = new com.squareup.leakcanary.internal.DisplayLeakActivity$Leak     // Catch:{ IOException -> 0x003e, ClassNotFoundException -> 0x003c }
                r9.<init>(r8, r6, r5)     // Catch:{ IOException -> 0x003e, ClassNotFoundException -> 0x003c }
                r0.add(r9)     // Catch:{ IOException -> 0x003e, ClassNotFoundException -> 0x003c }
            L_0x0038:
                r7.close()     // Catch:{ IOException -> 0x0065 }
                goto L_0x0065
            L_0x003c:
                r6 = move-exception
                goto L_0x0048
            L_0x003e:
                r6 = move-exception
                goto L_0x0048
            L_0x0040:
                r0 = move-exception
                goto L_0x006a
            L_0x0042:
                r7 = move-exception
                goto L_0x0045
            L_0x0044:
                r7 = move-exception
            L_0x0045:
                r10 = r7
                r7 = r6
                r6 = r10
            L_0x0048:
                boolean r8 = r5.delete()     // Catch:{ all -> 0x0068 }
                r9 = 1
                if (r8 == 0) goto L_0x0059
                java.lang.String r8 = "Could not read result file %s, deleted it."
                java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x0068 }
                r9[r3] = r5     // Catch:{ all -> 0x0068 }
                com.squareup.leakcanary.CanaryLog.m10642d(r6, r8, r9)     // Catch:{ all -> 0x0068 }
                goto L_0x0062
            L_0x0059:
                java.lang.String r8 = "Could not read result file %s, could not delete it either."
                java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x0068 }
                r9[r3] = r5     // Catch:{ all -> 0x0068 }
                com.squareup.leakcanary.CanaryLog.m10642d(r6, r8, r9)     // Catch:{ all -> 0x0068 }
            L_0x0062:
                if (r7 == 0) goto L_0x0065
                goto L_0x0038
            L_0x0065:
                int r4 = r4 + 1
                goto L_0x0015
            L_0x0068:
                r0 = move-exception
                r6 = r7
            L_0x006a:
                if (r6 == 0) goto L_0x006f
                r6.close()     // Catch:{ IOException -> 0x006f }
            L_0x006f:
                throw r0
            L_0x0070:
                com.squareup.leakcanary.internal.DisplayLeakActivity$LoadLeaks$2 r1 = new com.squareup.leakcanary.internal.DisplayLeakActivity$LoadLeaks$2
                r1.<init>()
                java.util.Collections.sort(r0, r1)
            L_0x0078:
                android.os.Handler r1 = r11.mainHandler
                com.squareup.leakcanary.internal.DisplayLeakActivity$LoadLeaks$3 r2 = new com.squareup.leakcanary.internal.DisplayLeakActivity$LoadLeaks$3
                r2.<init>(r0)
                r1.post(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.leakcanary.internal.DisplayLeakActivity.LoadLeaks.run():void");
        }
    }

    static String classSimpleName(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }

    public static PendingIntent createPendingIntent(Context context) {
        return createPendingIntent(context, (String) null);
    }

    public static PendingIntent createPendingIntent(Context context, String str) {
        Intent intent = new Intent(context, DisplayLeakActivity.class);
        intent.putExtra(SHOW_LEAK_EXTRA, str);
        intent.setFlags(335544320);
        return PendingIntent.getActivity(context, 1, intent, 134217728);
    }

    static File getLeakDirectory(Context context) {
        LeakDirectoryProvider leakDirectoryProvider2 = leakDirectoryProvider;
        return leakDirectoryProvider2 != null ? leakDirectoryProvider2.leakDirectory() : new DefaultLeakDirectoryProvider(context).leakDirectory();
    }

    public static void setLeakDirectoryProvider(LeakDirectoryProvider leakDirectoryProvider2) {
        leakDirectoryProvider = leakDirectoryProvider2;
    }

    /* access modifiers changed from: package-private */
    public void deleteAllLeaks() {
        File[] listFiles = getLeakDirectory(this).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!file.delete()) {
                    CanaryLog.m10641d("Could not delete file %s", file.getPath());
                }
            }
        }
        this.leaks = Collections.emptyList();
        updateUi();
    }

    /* access modifiers changed from: package-private */
    public void deleteVisibleLeak() {
        Leak visibleLeak = getVisibleLeak();
        File file = visibleLeak.heapDump.heapDumpFile;
        File file2 = visibleLeak.resultFile;
        if (!file2.delete()) {
            CanaryLog.m10641d("Could not delete result file %s", file2.getPath());
        }
        if (!file.delete()) {
            CanaryLog.m10641d("Could not delete heap dump file %s", file.getPath());
        }
        this.visibleLeakRefKey = null;
        this.leaks.remove(visibleLeak);
        updateUi();
    }

    /* access modifiers changed from: package-private */
    public Leak getVisibleLeak() {
        List<Leak> list = this.leaks;
        if (list == null) {
            return null;
        }
        for (Leak next : list) {
            if (next.heapDump.referenceKey.equals(this.visibleLeakRefKey)) {
                return next;
            }
        }
        return null;
    }

    public void onBackPressed() {
        if (this.visibleLeakRefKey != null) {
            this.visibleLeakRefKey = null;
            updateUi();
            return;
        }
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        if (bundle != null) {
            stringExtra = bundle.getString("visibleLeakRefKey");
        } else {
            Intent intent = getIntent();
            if (intent.hasExtra(SHOW_LEAK_EXTRA)) {
                stringExtra = intent.getStringExtra(SHOW_LEAK_EXTRA);
            }
            this.leaks = (List) getLastNonConfigurationInstance();
            setContentView(C3940R.layout.leak_canary_display_leak);
            this.listView = (ListView) findViewById(C3940R.C3942id.__leak_canary_display_leak_list);
            this.failureView = (TextView) findViewById(C3940R.C3942id.__leak_canary_display_leak_failure);
            this.actionButton = (Button) findViewById(C3940R.C3942id.__leak_canary_action);
            updateUi();
        }
        this.visibleLeakRefKey = stringExtra;
        this.leaks = (List) getLastNonConfigurationInstance();
        setContentView(C3940R.layout.leak_canary_display_leak);
        this.listView = (ListView) findViewById(C3940R.C3942id.__leak_canary_display_leak_list);
        this.failureView = (TextView) findViewById(C3940R.C3942id.__leak_canary_display_leak_failure);
        this.actionButton = (Button) findViewById(C3940R.C3942id.__leak_canary_action);
        updateUi();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        Leak visibleLeak = getVisibleLeak();
        if (visibleLeak == null) {
            return false;
        }
        menu.add(C3940R.string.leak_canary_share_leak).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem menuItem) {
                DisplayLeakActivity.this.shareLeak();
                return true;
            }
        });
        if (!visibleLeak.heapDump.heapDumpFile.exists()) {
            return true;
        }
        menu.add(C3940R.string.leak_canary_share_heap_dump).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem menuItem) {
                DisplayLeakActivity.this.shareHeapDump();
                return true;
            }
        });
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        LoadLeaks.forgetActivity();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        this.visibleLeakRefKey = null;
        updateUi();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        LoadLeaks.load(this);
    }

    public Object onRetainNonConfigurationInstance() {
        return this.leaks;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("visibleLeakRefKey", this.visibleLeakRefKey);
    }

    public void setTheme(int i) {
        if (i == C3940R.style.leak_canary_LeakCanary_Base) {
            super.setTheme(i);
        }
    }

    /* access modifiers changed from: package-private */
    public void shareHeapDump() {
        File file = getVisibleLeak().heapDump.heapDumpFile;
        file.setReadable(true, false);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("application/octet-stream");
        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
        startActivity(Intent.createChooser(intent, getString(C3940R.string.leak_canary_share_with)));
    }

    /* access modifiers changed from: package-private */
    public void shareLeak() {
        Leak visibleLeak = getVisibleLeak();
        String leakInfo = LeakCanary.leakInfo(this, visibleLeak.heapDump, visibleLeak.result, true);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", leakInfo);
        startActivity(Intent.createChooser(intent, getString(C3940R.string.leak_canary_share_with)));
    }

    /* access modifiers changed from: package-private */
    public void updateUi() {
        final DisplayLeakAdapter displayLeakAdapter;
        List<Leak> list = this.leaks;
        if (list == null) {
            setTitle("Loading leaks...");
            return;
        }
        if (list.isEmpty()) {
            this.visibleLeakRefKey = null;
        }
        Leak visibleLeak = getVisibleLeak();
        if (visibleLeak == null) {
            this.visibleLeakRefKey = null;
        }
        ListAdapter adapter = this.listView.getAdapter();
        int i = 0;
        this.listView.setVisibility(0);
        this.failureView.setVisibility(8);
        if (visibleLeak != null) {
            AnalysisResult analysisResult = visibleLeak.result;
            if (analysisResult.failure != null) {
                this.listView.setVisibility(8);
                this.failureView.setVisibility(0);
                TextView textView = this.failureView;
                textView.setText(getString(C3940R.string.leak_canary_failure_report) + Log.getStackTraceString(analysisResult.failure));
                setTitle(C3940R.string.leak_canary_analysis_failed);
                invalidateOptionsMenu();
                getActionBar().setDisplayHomeAsUpEnabled(true);
                this.actionButton.setVisibility(0);
                this.actionButton.setText(C3940R.string.leak_canary_delete);
                this.actionButton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        DisplayLeakActivity.this.deleteVisibleLeak();
                    }
                });
                this.listView.setAdapter((ListAdapter) null);
                return;
            }
            if (adapter instanceof DisplayLeakAdapter) {
                displayLeakAdapter = (DisplayLeakAdapter) adapter;
            } else {
                displayLeakAdapter = new DisplayLeakAdapter();
                this.listView.setAdapter(displayLeakAdapter);
                this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                        displayLeakAdapter.toggleRow(i);
                    }
                });
                invalidateOptionsMenu();
                getActionBar().setDisplayHomeAsUpEnabled(true);
                this.actionButton.setVisibility(0);
                this.actionButton.setText(C3940R.string.leak_canary_delete);
                this.actionButton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        DisplayLeakActivity.this.deleteVisibleLeak();
                    }
                });
            }
            HeapDump heapDump = visibleLeak.heapDump;
            displayLeakAdapter.update(analysisResult.leakTrace, heapDump.referenceKey, heapDump.referenceName);
            String formatShortFileSize = Formatter.formatShortFileSize(this, analysisResult.retainedHeapSize);
            String classSimpleName = classSimpleName(analysisResult.className);
            setTitle(getString(C3940R.string.leak_canary_class_has_leaked, new Object[]{classSimpleName, formatShortFileSize}));
            return;
        }
        if (adapter instanceof LeakListAdapter) {
            ((LeakListAdapter) adapter).notifyDataSetChanged();
        } else {
            this.listView.setAdapter(new LeakListAdapter());
            this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    DisplayLeakActivity displayLeakActivity = DisplayLeakActivity.this;
                    displayLeakActivity.visibleLeakRefKey = displayLeakActivity.leaks.get(i).heapDump.referenceKey;
                    DisplayLeakActivity.this.updateUi();
                }
            });
            invalidateOptionsMenu();
            setTitle(getString(C3940R.string.leak_canary_leak_list_title, new Object[]{getPackageName()}));
            getActionBar().setDisplayHomeAsUpEnabled(false);
            this.actionButton.setText(C3940R.string.leak_canary_delete_all);
            this.actionButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    DisplayLeakActivity.this.deleteAllLeaks();
                }
            });
        }
        Button button = this.actionButton;
        if (this.leaks.size() == 0) {
            i = 8;
        }
        button.setVisibility(i);
    }
}

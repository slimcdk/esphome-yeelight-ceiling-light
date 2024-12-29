package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ActivityChooserModel extends DataSetObservable {
    static final String ATTRIBUTE_ACTIVITY = "activity";
    static final String ATTRIBUTE_TIME = "time";
    static final String ATTRIBUTE_WEIGHT = "weight";
    static final boolean DEBUG = false;
    private static final int DEFAULT_ACTIVITY_INFLATION = 5;
    private static final float DEFAULT_HISTORICAL_RECORD_WEIGHT = 1.0f;
    public static final String DEFAULT_HISTORY_FILE_NAME = "activity_choser_model_history.xml";
    public static final int DEFAULT_HISTORY_MAX_LENGTH = 50;
    private static final String HISTORY_FILE_EXTENSION = ".xml";
    private static final int INVALID_INDEX = -1;
    static final String LOG_TAG = ActivityChooserModel.class.getSimpleName();
    static final String TAG_HISTORICAL_RECORD = "historical-record";
    static final String TAG_HISTORICAL_RECORDS = "historical-records";
    private static final Map<String, ActivityChooserModel> sDataModelRegistry = new HashMap();
    private static final Object sRegistryLock = new Object();
    private final List<ActivityResolveInfo> mActivities = new ArrayList();
    private OnChooseActivityListener mActivityChoserModelPolicy;
    private ActivitySorter mActivitySorter = new DefaultSorter();
    boolean mCanReadHistoricalData = true;
    final Context mContext;
    private final List<HistoricalRecord> mHistoricalRecords = new ArrayList();
    private boolean mHistoricalRecordsChanged = true;
    final String mHistoryFileName;
    private int mHistoryMaxSize = 50;
    private final Object mInstanceLock = new Object();
    private Intent mIntent;
    private boolean mReadShareHistoryCalled = false;
    private boolean mReloadActivities = false;

    public interface ActivityChooserModelClient {
        void setActivityChooserModel(ActivityChooserModel activityChooserModel);
    }

    public static final class ActivityResolveInfo implements Comparable<ActivityResolveInfo> {
        public final ResolveInfo resolveInfo;
        public float weight;

        public ActivityResolveInfo(ResolveInfo resolveInfo2) {
            this.resolveInfo = resolveInfo2;
        }

        public int compareTo(ActivityResolveInfo activityResolveInfo) {
            return Float.floatToIntBits(activityResolveInfo.weight) - Float.floatToIntBits(this.weight);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && ActivityResolveInfo.class == obj.getClass() && Float.floatToIntBits(this.weight) == Float.floatToIntBits(((ActivityResolveInfo) obj).weight);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.weight) + 31;
        }

        public String toString() {
            return "[" + "resolveInfo:" + this.resolveInfo.toString() + "; weight:" + new BigDecimal((double) this.weight) + "]";
        }
    }

    public interface ActivitySorter {
        void sort(Intent intent, List<ActivityResolveInfo> list, List<HistoricalRecord> list2);
    }

    private static final class DefaultSorter implements ActivitySorter {
        private static final float WEIGHT_DECAY_COEFFICIENT = 0.95f;
        private final Map<ComponentName, ActivityResolveInfo> mPackageNameToActivityMap = new HashMap();

        DefaultSorter() {
        }

        public void sort(Intent intent, List<ActivityResolveInfo> list, List<HistoricalRecord> list2) {
            Map<ComponentName, ActivityResolveInfo> map = this.mPackageNameToActivityMap;
            map.clear();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ActivityResolveInfo activityResolveInfo = list.get(i);
                activityResolveInfo.weight = 0.0f;
                ActivityInfo activityInfo = activityResolveInfo.resolveInfo.activityInfo;
                map.put(new ComponentName(activityInfo.packageName, activityInfo.name), activityResolveInfo);
            }
            float f = ActivityChooserModel.DEFAULT_HISTORICAL_RECORD_WEIGHT;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                HistoricalRecord historicalRecord = list2.get(size2);
                ActivityResolveInfo activityResolveInfo2 = map.get(historicalRecord.activity);
                if (activityResolveInfo2 != null) {
                    activityResolveInfo2.weight += historicalRecord.weight * f;
                    f *= WEIGHT_DECAY_COEFFICIENT;
                }
            }
            Collections.sort(list);
        }
    }

    public static final class HistoricalRecord {
        public final ComponentName activity;
        public final long time;
        public final float weight;

        public HistoricalRecord(ComponentName componentName, long j, float f) {
            this.activity = componentName;
            this.time = j;
            this.weight = f;
        }

        public HistoricalRecord(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || HistoricalRecord.class != obj.getClass()) {
                return false;
            }
            HistoricalRecord historicalRecord = (HistoricalRecord) obj;
            ComponentName componentName = this.activity;
            if (componentName == null) {
                if (historicalRecord.activity != null) {
                    return false;
                }
            } else if (!componentName.equals(historicalRecord.activity)) {
                return false;
            }
            return this.time == historicalRecord.time && Float.floatToIntBits(this.weight) == Float.floatToIntBits(historicalRecord.weight);
        }

        public int hashCode() {
            ComponentName componentName = this.activity;
            int hashCode = componentName == null ? 0 : componentName.hashCode();
            long j = this.time;
            return ((((hashCode + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.weight);
        }

        public String toString() {
            return "[" + "; activity:" + this.activity + "; time:" + this.time + "; weight:" + new BigDecimal((double) this.weight) + "]";
        }
    }

    public interface OnChooseActivityListener {
        boolean onChooseActivity(ActivityChooserModel activityChooserModel, Intent intent);
    }

    private final class PersistHistoryAsyncTask extends AsyncTask<Object, Void, Void> {
        PersistHistoryAsyncTask() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x006b, code lost:
            if (r15 != null) goto L_0x006d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            r15.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0071, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r0 = androidx.appcompat.widget.ActivityChooserModel.LOG_TAG;
            r0 = new java.lang.StringBuilder();
            r0.append("Error writing historical record file: ");
            r0.append(r14.this$0.mHistoryFileName);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0084, code lost:
            r14.this$0.mCanReadHistoricalData = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0088, code lost:
            if (r15 == null) goto L_0x00bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r0 = androidx.appcompat.widget.ActivityChooserModel.LOG_TAG;
            r0 = new java.lang.StringBuilder();
            r0.append("Error writing historical record file: ");
            r0.append(r14.this$0.mHistoryFileName);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x009c, code lost:
            r14.this$0.mCanReadHistoricalData = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a0, code lost:
            if (r15 == null) goto L_0x00bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            r0 = androidx.appcompat.widget.ActivityChooserModel.LOG_TAG;
            r0 = new java.lang.StringBuilder();
            r0.append("Error writing historical record file: ");
            r0.append(r14.this$0.mHistoryFileName);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b4, code lost:
            r14.this$0.mCanReadHistoricalData = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b8, code lost:
            if (r15 == null) goto L_0x00bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bc, code lost:
            r14.this$0.mCanReadHistoricalData = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c0, code lost:
            if (r15 != null) goto L_0x00c2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            r15.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c5, code lost:
            throw r0;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:14:0x0073, B:18:0x008b, B:22:0x00a3] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x008b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x00a3 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Object... r15) {
            /*
                r14 = this;
                java.lang.String r0 = "historical-record"
                java.lang.String r1 = "historical-records"
                java.lang.String r2 = "Error writing historical record file: "
                r3 = 0
                r4 = r15[r3]
                java.util.List r4 = (java.util.List) r4
                r5 = 1
                r15 = r15[r5]
                java.lang.String r15 = (java.lang.String) r15
                r6 = 0
                androidx.appcompat.widget.ActivityChooserModel r7 = androidx.appcompat.widget.ActivityChooserModel.this     // Catch:{ FileNotFoundException -> 0x00c6 }
                android.content.Context r7 = r7.mContext     // Catch:{ FileNotFoundException -> 0x00c6 }
                java.io.FileOutputStream r15 = r7.openFileOutput(r15, r3)     // Catch:{ FileNotFoundException -> 0x00c6 }
                org.xmlpull.v1.XmlSerializer r7 = android.util.Xml.newSerializer()
                r7.setOutput(r15, r6)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                java.lang.String r8 = "UTF-8"
                java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                r7.startDocument(r8, r9)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                r7.startTag(r6, r1)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                int r8 = r4.size()     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                r9 = 0
            L_0x002f:
                if (r9 >= r8) goto L_0x0061
                java.lang.Object r10 = r4.remove(r3)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord r10 = (androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord) r10     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                r7.startTag(r6, r0)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                java.lang.String r11 = "activity"
                android.content.ComponentName r12 = r10.activity     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                java.lang.String r12 = r12.flattenToString()     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                r7.attribute(r6, r11, r12)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                java.lang.String r11 = "time"
                long r12 = r10.time     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                r7.attribute(r6, r11, r12)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                java.lang.String r11 = "weight"
                float r10 = r10.weight     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                r7.attribute(r6, r11, r10)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                r7.endTag(r6, r0)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                int r9 = r9 + 1
                goto L_0x002f
            L_0x0061:
                r7.endTag(r6, r1)     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                r7.endDocument()     // Catch:{ IllegalArgumentException -> 0x00a3, IllegalStateException -> 0x008b, IOException -> 0x0073 }
                androidx.appcompat.widget.ActivityChooserModel r0 = androidx.appcompat.widget.ActivityChooserModel.this
                r0.mCanReadHistoricalData = r5
                if (r15 == 0) goto L_0x00bb
            L_0x006d:
                r15.close()     // Catch:{ IOException -> 0x00bb }
                goto L_0x00bb
            L_0x0071:
                r0 = move-exception
                goto L_0x00bc
            L_0x0073:
                java.lang.String r0 = androidx.appcompat.widget.ActivityChooserModel.LOG_TAG     // Catch:{ all -> 0x0071 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
                r0.<init>()     // Catch:{ all -> 0x0071 }
                r0.append(r2)     // Catch:{ all -> 0x0071 }
                androidx.appcompat.widget.ActivityChooserModel r1 = androidx.appcompat.widget.ActivityChooserModel.this     // Catch:{ all -> 0x0071 }
                java.lang.String r1 = r1.mHistoryFileName     // Catch:{ all -> 0x0071 }
                r0.append(r1)     // Catch:{ all -> 0x0071 }
                androidx.appcompat.widget.ActivityChooserModel r0 = androidx.appcompat.widget.ActivityChooserModel.this
                r0.mCanReadHistoricalData = r5
                if (r15 == 0) goto L_0x00bb
                goto L_0x006d
            L_0x008b:
                java.lang.String r0 = androidx.appcompat.widget.ActivityChooserModel.LOG_TAG     // Catch:{ all -> 0x0071 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
                r0.<init>()     // Catch:{ all -> 0x0071 }
                r0.append(r2)     // Catch:{ all -> 0x0071 }
                androidx.appcompat.widget.ActivityChooserModel r1 = androidx.appcompat.widget.ActivityChooserModel.this     // Catch:{ all -> 0x0071 }
                java.lang.String r1 = r1.mHistoryFileName     // Catch:{ all -> 0x0071 }
                r0.append(r1)     // Catch:{ all -> 0x0071 }
                androidx.appcompat.widget.ActivityChooserModel r0 = androidx.appcompat.widget.ActivityChooserModel.this
                r0.mCanReadHistoricalData = r5
                if (r15 == 0) goto L_0x00bb
                goto L_0x006d
            L_0x00a3:
                java.lang.String r0 = androidx.appcompat.widget.ActivityChooserModel.LOG_TAG     // Catch:{ all -> 0x0071 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
                r0.<init>()     // Catch:{ all -> 0x0071 }
                r0.append(r2)     // Catch:{ all -> 0x0071 }
                androidx.appcompat.widget.ActivityChooserModel r1 = androidx.appcompat.widget.ActivityChooserModel.this     // Catch:{ all -> 0x0071 }
                java.lang.String r1 = r1.mHistoryFileName     // Catch:{ all -> 0x0071 }
                r0.append(r1)     // Catch:{ all -> 0x0071 }
                androidx.appcompat.widget.ActivityChooserModel r0 = androidx.appcompat.widget.ActivityChooserModel.this
                r0.mCanReadHistoricalData = r5
                if (r15 == 0) goto L_0x00bb
                goto L_0x006d
            L_0x00bb:
                return r6
            L_0x00bc:
                androidx.appcompat.widget.ActivityChooserModel r1 = androidx.appcompat.widget.ActivityChooserModel.this
                r1.mCanReadHistoricalData = r5
                if (r15 == 0) goto L_0x00c5
                r15.close()     // Catch:{ IOException -> 0x00c5 }
            L_0x00c5:
                throw r0
            L_0x00c6:
                java.lang.String r0 = androidx.appcompat.widget.ActivityChooserModel.LOG_TAG
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                r0.append(r15)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActivityChooserModel.PersistHistoryAsyncTask.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }

    private ActivityChooserModel(Context context, String str) {
        this.mContext = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(HISTORY_FILE_EXTENSION)) {
            this.mHistoryFileName = str;
            return;
        }
        this.mHistoryFileName = str + HISTORY_FILE_EXTENSION;
    }

    private boolean addHistoricalRecord(HistoricalRecord historicalRecord) {
        boolean add = this.mHistoricalRecords.add(historicalRecord);
        if (add) {
            this.mHistoricalRecordsChanged = true;
            pruneExcessiveHistoricalRecordsIfNeeded();
            persistHistoricalDataIfNeeded();
            sortActivitiesIfNeeded();
            notifyChanged();
        }
        return add;
    }

    private void ensureConsistentState() {
        boolean loadActivitiesIfNeeded = loadActivitiesIfNeeded() | readHistoricalDataIfNeeded();
        pruneExcessiveHistoricalRecordsIfNeeded();
        if (loadActivitiesIfNeeded) {
            sortActivitiesIfNeeded();
            notifyChanged();
        }
    }

    public static ActivityChooserModel get(Context context, String str) {
        ActivityChooserModel activityChooserModel;
        synchronized (sRegistryLock) {
            Map<String, ActivityChooserModel> map = sDataModelRegistry;
            activityChooserModel = map.get(str);
            if (activityChooserModel == null) {
                activityChooserModel = new ActivityChooserModel(context, str);
                map.put(str, activityChooserModel);
            }
        }
        return activityChooserModel;
    }

    private boolean loadActivitiesIfNeeded() {
        if (!this.mReloadActivities || this.mIntent == null) {
            return false;
        }
        this.mReloadActivities = false;
        this.mActivities.clear();
        List<ResolveInfo> queryIntentActivities = this.mContext.getPackageManager().queryIntentActivities(this.mIntent, 0);
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.mActivities.add(new ActivityResolveInfo(queryIntentActivities.get(i)));
        }
        return true;
    }

    private void persistHistoricalDataIfNeeded() {
        if (!this.mReadShareHistoryCalled) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        } else if (this.mHistoricalRecordsChanged) {
            this.mHistoricalRecordsChanged = false;
            if (!TextUtils.isEmpty(this.mHistoryFileName)) {
                new PersistHistoryAsyncTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[]{new ArrayList(this.mHistoricalRecords), this.mHistoryFileName});
            }
        }
    }

    private void pruneExcessiveHistoricalRecordsIfNeeded() {
        int size = this.mHistoricalRecords.size() - this.mHistoryMaxSize;
        if (size > 0) {
            this.mHistoricalRecordsChanged = true;
            for (int i = 0; i < size; i++) {
                HistoricalRecord remove = this.mHistoricalRecords.remove(0);
            }
        }
    }

    private boolean readHistoricalDataIfNeeded() {
        if (!this.mCanReadHistoricalData || !this.mHistoricalRecordsChanged || TextUtils.isEmpty(this.mHistoryFileName)) {
            return false;
        }
        this.mCanReadHistoricalData = false;
        this.mReadShareHistoryCalled = true;
        readHistoricalDataImpl();
        return true;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0085 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void readHistoricalDataImpl() {
        /*
            r10 = this;
            java.lang.String r0 = "Error reading historical recrod file: "
            android.content.Context r1 = r10.mContext     // Catch:{ FileNotFoundException -> 0x00ac }
            java.lang.String r2 = r10.mHistoryFileName     // Catch:{ FileNotFoundException -> 0x00ac }
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch:{ FileNotFoundException -> 0x00ac }
            org.xmlpull.v1.XmlPullParser r2 = android.util.Xml.newPullParser()     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            java.lang.String r3 = "UTF-8"
            r2.setInput(r1, r3)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            r3 = 0
        L_0x0014:
            r4 = 1
            if (r3 == r4) goto L_0x001f
            r5 = 2
            if (r3 == r5) goto L_0x001f
            int r3 = r2.next()     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            goto L_0x0014
        L_0x001f:
            java.lang.String r3 = "historical-records"
            java.lang.String r5 = r2.getName()     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            boolean r3 = r3.equals(r5)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            if (r3 == 0) goto L_0x007b
            java.util.List<androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord> r3 = r10.mHistoricalRecords     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            r3.clear()     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
        L_0x0030:
            int r5 = r2.next()     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            if (r5 != r4) goto L_0x003c
            if (r1 == 0) goto L_0x00a5
        L_0x0038:
            r1.close()     // Catch:{ IOException -> 0x00a5 }
            goto L_0x00a5
        L_0x003c:
            r6 = 3
            if (r5 == r6) goto L_0x0030
            r6 = 4
            if (r5 != r6) goto L_0x0043
            goto L_0x0030
        L_0x0043:
            java.lang.String r5 = r2.getName()     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            java.lang.String r6 = "historical-record"
            boolean r5 = r6.equals(r5)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            if (r5 == 0) goto L_0x0073
            java.lang.String r5 = "activity"
            r6 = 0
            java.lang.String r5 = r2.getAttributeValue(r6, r5)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            java.lang.String r7 = "time"
            java.lang.String r7 = r2.getAttributeValue(r6, r7)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            long r7 = java.lang.Long.parseLong(r7)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            java.lang.String r9 = "weight"
            java.lang.String r6 = r2.getAttributeValue(r6, r9)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            float r6 = java.lang.Float.parseFloat(r6)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord r9 = new androidx.appcompat.widget.ActivityChooserModel$HistoricalRecord     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            r9.<init>((java.lang.String) r5, (long) r7, (float) r6)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            r3.add(r9)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            goto L_0x0030
        L_0x0073:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            java.lang.String r3 = "Share records file not well-formed."
            r2.<init>(r3)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
        L_0x007b:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            java.lang.String r3 = "Share records file does not start with historical-records tag."
            r2.<init>(r3)     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
            throw r2     // Catch:{ XmlPullParserException -> 0x0095, IOException -> 0x0085 }
        L_0x0083:
            r0 = move-exception
            goto L_0x00a6
        L_0x0085:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0083 }
            r2.<init>()     // Catch:{ all -> 0x0083 }
            r2.append(r0)     // Catch:{ all -> 0x0083 }
            java.lang.String r0 = r10.mHistoryFileName     // Catch:{ all -> 0x0083 }
            r2.append(r0)     // Catch:{ all -> 0x0083 }
            if (r1 == 0) goto L_0x00a5
            goto L_0x0038
        L_0x0095:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0083 }
            r2.<init>()     // Catch:{ all -> 0x0083 }
            r2.append(r0)     // Catch:{ all -> 0x0083 }
            java.lang.String r0 = r10.mHistoryFileName     // Catch:{ all -> 0x0083 }
            r2.append(r0)     // Catch:{ all -> 0x0083 }
            if (r1 == 0) goto L_0x00a5
            goto L_0x0038
        L_0x00a5:
            return
        L_0x00a6:
            if (r1 == 0) goto L_0x00ab
            r1.close()     // Catch:{ IOException -> 0x00ab }
        L_0x00ab:
            throw r0
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActivityChooserModel.readHistoricalDataImpl():void");
    }

    private boolean sortActivitiesIfNeeded() {
        if (this.mActivitySorter == null || this.mIntent == null || this.mActivities.isEmpty() || this.mHistoricalRecords.isEmpty()) {
            return false;
        }
        this.mActivitySorter.sort(this.mIntent, this.mActivities, Collections.unmodifiableList(this.mHistoricalRecords));
        return true;
    }

    public Intent chooseActivity(int i) {
        synchronized (this.mInstanceLock) {
            if (this.mIntent == null) {
                return null;
            }
            ensureConsistentState();
            ActivityInfo activityInfo = this.mActivities.get(i).resolveInfo.activityInfo;
            ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
            Intent intent = new Intent(this.mIntent);
            intent.setComponent(componentName);
            if (this.mActivityChoserModelPolicy != null) {
                if (this.mActivityChoserModelPolicy.onChooseActivity(this, new Intent(intent))) {
                    return null;
                }
            }
            addHistoricalRecord(new HistoricalRecord(componentName, System.currentTimeMillis(), (float) DEFAULT_HISTORICAL_RECORD_WEIGHT));
            return intent;
        }
    }

    public ResolveInfo getActivity(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.mInstanceLock) {
            ensureConsistentState();
            resolveInfo = this.mActivities.get(i).resolveInfo;
        }
        return resolveInfo;
    }

    public int getActivityCount() {
        int size;
        synchronized (this.mInstanceLock) {
            ensureConsistentState();
            size = this.mActivities.size();
        }
        return size;
    }

    public int getActivityIndex(ResolveInfo resolveInfo) {
        synchronized (this.mInstanceLock) {
            ensureConsistentState();
            List<ActivityResolveInfo> list = this.mActivities;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).resolveInfo == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    public ResolveInfo getDefaultActivity() {
        synchronized (this.mInstanceLock) {
            ensureConsistentState();
            if (this.mActivities.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = this.mActivities.get(0).resolveInfo;
            return resolveInfo;
        }
    }

    public int getHistoryMaxSize() {
        int i;
        synchronized (this.mInstanceLock) {
            i = this.mHistoryMaxSize;
        }
        return i;
    }

    public int getHistorySize() {
        int size;
        synchronized (this.mInstanceLock) {
            ensureConsistentState();
            size = this.mHistoricalRecords.size();
        }
        return size;
    }

    public Intent getIntent() {
        Intent intent;
        synchronized (this.mInstanceLock) {
            intent = this.mIntent;
        }
        return intent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setActivitySorter(androidx.appcompat.widget.ActivityChooserModel.ActivitySorter r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.mInstanceLock
            monitor-enter(r0)
            androidx.appcompat.widget.ActivityChooserModel$ActivitySorter r1 = r2.mActivitySorter     // Catch:{ all -> 0x0016 }
            if (r1 != r3) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return
        L_0x0009:
            r2.mActivitySorter = r3     // Catch:{ all -> 0x0016 }
            boolean r3 = r2.sortActivitiesIfNeeded()     // Catch:{ all -> 0x0016 }
            if (r3 == 0) goto L_0x0014
            r2.notifyChanged()     // Catch:{ all -> 0x0016 }
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return
        L_0x0016:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActivityChooserModel.setActivitySorter(androidx.appcompat.widget.ActivityChooserModel$ActivitySorter):void");
    }

    public void setDefaultActivity(int i) {
        synchronized (this.mInstanceLock) {
            ensureConsistentState();
            ActivityResolveInfo activityResolveInfo = this.mActivities.get(i);
            ActivityResolveInfo activityResolveInfo2 = this.mActivities.get(0);
            float f = activityResolveInfo2 != null ? (activityResolveInfo2.weight - activityResolveInfo.weight) + 5.0f : DEFAULT_HISTORICAL_RECORD_WEIGHT;
            ActivityInfo activityInfo = activityResolveInfo.resolveInfo.activityInfo;
            addHistoricalRecord(new HistoricalRecord(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setHistoryMaxSize(int r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.mInstanceLock
            monitor-enter(r0)
            int r1 = r2.mHistoryMaxSize     // Catch:{ all -> 0x0019 }
            if (r1 != r3) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return
        L_0x0009:
            r2.mHistoryMaxSize = r3     // Catch:{ all -> 0x0019 }
            r2.pruneExcessiveHistoricalRecordsIfNeeded()     // Catch:{ all -> 0x0019 }
            boolean r3 = r2.sortActivitiesIfNeeded()     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0017
            r2.notifyChanged()     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return
        L_0x0019:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActivityChooserModel.setHistoryMaxSize(int):void");
    }

    public void setIntent(Intent intent) {
        synchronized (this.mInstanceLock) {
            if (this.mIntent != intent) {
                this.mIntent = intent;
                this.mReloadActivities = true;
                ensureConsistentState();
            }
        }
    }

    public void setOnChooseActivityListener(OnChooseActivityListener onChooseActivityListener) {
        synchronized (this.mInstanceLock) {
            this.mActivityChoserModelPolicy = onChooseActivityListener;
        }
    }
}

package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C1122h4;
import com.google.android.gms.internal.measurement.C1411zb;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.l */
final class C1686l extends C1606ea {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String[] f2249f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String[] f2250g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final String[] f2251h = {Constants.EXTRA_KEY_APP_VERSION, "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final String[] f2252i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final String[] f2253j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final String[] f2254k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final String[] f2255l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final String[] f2256m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d */
    private final C1673k f2257d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1554aa f2258e = new C1554aa(this.f2143a.mo14229c());

    C1686l(C1770ra raVar) {
        super(raVar);
        this.f2143a.mo14402z();
        this.f2257d = new C1673k(this, this.f2143a.mo14231f(), "google_app_measurement.db");
    }

    @WorkerThread
    /* renamed from: H */
    static final void m4421H(ContentValues contentValues, String str, Object obj) {
        C0917i.m1415f("value");
        C0917i.m1419j(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    @WorkerThread
    /* renamed from: I */
    private final long m4422I(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = mo14320P().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                cursor.close();
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            this.f2143a.mo14228b().mo14035r().mo14695c("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @WorkerThread
    /* renamed from: K */
    private final long m4423K(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = mo14320P().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            }
            rawQuery.close();
            return j;
        } catch (SQLiteException e) {
            this.f2143a.mo14228b().mo14035r().mo14695c("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.lang.String[]} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:13:0x0040=Splitter:B:13:0x0040, B:31:0x008c=Splitter:B:31:0x008c} */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14314G(java.lang.String r21, long r22, long r24, com.google.android.gms.measurement.internal.C1734oa r26) {
        /*
            r20 = this;
            r1 = r20
            r2 = r26
            com.google.android.gms.common.internal.C0917i.m1419j(r26)
            r20.mo14009h()
            r20.mo14128i()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r0 = r20.mo14320P()     // Catch:{ SQLiteException -> 0x020d, all -> 0x020b }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ SQLiteException -> 0x020d, all -> 0x020b }
            java.lang.String r5 = ""
            r13 = -1
            r15 = 2
            r12 = 1
            r11 = 0
            if (r4 == 0) goto L_0x0073
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0032
            java.lang.String[] r4 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x020d, all -> 0x020b }
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x020d, all -> 0x020b }
            r4[r11] = r6     // Catch:{ SQLiteException -> 0x020d, all -> 0x020b }
            java.lang.String r6 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x020d, all -> 0x020b }
            r4[r12] = r6     // Catch:{ SQLiteException -> 0x020d, all -> 0x020b }
            goto L_0x003a
        L_0x0032:
            java.lang.String[] r4 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x020d, all -> 0x020b }
            java.lang.String r6 = java.lang.String.valueOf(r22)     // Catch:{ SQLiteException -> 0x020d, all -> 0x020b }
            r4[r11] = r6     // Catch:{ SQLiteException -> 0x020d, all -> 0x020b }
        L_0x003a:
            int r6 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r6 == 0) goto L_0x0040
            java.lang.String r5 = "rowid <= ? and "
        L_0x0040:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x020d, all -> 0x020b }
            r6.<init>()     // Catch:{ SQLiteException -> 0x020d, all -> 0x020b }
            java.lang.String r7 = "select app_id, metadata_fingerprint from raw_events where "
            r6.append(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x020b }
            r6.append(r5)     // Catch:{ SQLiteException -> 0x020d, all -> 0x020b }
            java.lang.String r5 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r6.append(r5)     // Catch:{ SQLiteException -> 0x020d, all -> 0x020b }
            java.lang.String r5 = r6.toString()     // Catch:{ SQLiteException -> 0x020d, all -> 0x020b }
            android.database.Cursor r4 = r0.rawQuery(r5, r4)     // Catch:{ SQLiteException -> 0x020d, all -> 0x020b }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0070 }
            if (r5 != 0) goto L_0x0064
            r4.close()
            return
        L_0x0064:
            java.lang.String r3 = r4.getString(r11)     // Catch:{ SQLiteException -> 0x0070 }
            java.lang.String r5 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x0070 }
            r4.close()     // Catch:{ SQLiteException -> 0x0070 }
            goto L_0x00b7
        L_0x0070:
            r0 = move-exception
            goto L_0x020f
        L_0x0073:
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0082
            java.lang.String[] r4 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x020d, all -> 0x020b }
            r4[r11] = r3     // Catch:{ SQLiteException -> 0x020d, all -> 0x020b }
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x020d, all -> 0x020b }
            r4[r12] = r6     // Catch:{ SQLiteException -> 0x020d, all -> 0x020b }
            goto L_0x0086
        L_0x0082:
            java.lang.String[] r4 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x020d, all -> 0x020b }
        L_0x0086:
            int r6 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r6 == 0) goto L_0x008c
            java.lang.String r5 = " and rowid <= ?"
        L_0x008c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x020d, all -> 0x020b }
            r6.<init>()     // Catch:{ SQLiteException -> 0x020d, all -> 0x020b }
            java.lang.String r7 = "select metadata_fingerprint from raw_events where app_id = ?"
            r6.append(r7)     // Catch:{ SQLiteException -> 0x020d, all -> 0x020b }
            r6.append(r5)     // Catch:{ SQLiteException -> 0x020d, all -> 0x020b }
            java.lang.String r5 = " order by rowid limit 1;"
            r6.append(r5)     // Catch:{ SQLiteException -> 0x020d, all -> 0x020b }
            java.lang.String r5 = r6.toString()     // Catch:{ SQLiteException -> 0x020d, all -> 0x020b }
            android.database.Cursor r4 = r0.rawQuery(r5, r4)     // Catch:{ SQLiteException -> 0x020d, all -> 0x020b }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0070 }
            if (r5 != 0) goto L_0x00b0
            r4.close()
            return
        L_0x00b0:
            java.lang.String r5 = r4.getString(r11)     // Catch:{ SQLiteException -> 0x0070 }
            r4.close()     // Catch:{ SQLiteException -> 0x0070 }
        L_0x00b7:
            r16 = r4
            r17 = r5
            java.lang.String r4 = "metadata"
            java.lang.String[] r6 = new java.lang.String[]{r4}     // Catch:{ SQLiteException -> 0x0207, all -> 0x0203 }
            java.lang.String[] r8 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0207, all -> 0x0203 }
            r8[r11] = r3     // Catch:{ SQLiteException -> 0x0207, all -> 0x0203 }
            r8[r12] = r17     // Catch:{ SQLiteException -> 0x0207, all -> 0x0203 }
            java.lang.String r5 = "raw_events_metadata"
            java.lang.String r7 = "app_id = ? and metadata_fingerprint = ?"
            r9 = 0
            r10 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = "2"
            r4 = r0
            r15 = 0
            r11 = r18
            r12 = r19
            android.database.Cursor r12 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x0207, all -> 0x0203 }
            boolean r4 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fb }
            if (r4 != 0) goto L_0x00f8
            com.google.android.gms.measurement.internal.n5 r0 = r1.f2143a     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fb }
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fb }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14035r()     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fb }
            java.lang.String r2 = "Raw event metadata record is missing. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r3)     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fb }
            r0.mo14694b(r2, r4)     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fb }
            r12.close()
            return
        L_0x00f8:
            byte[] r4 = r12.getBlob(r15)     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fb }
            com.google.android.gms.internal.measurement.r4 r5 = com.google.android.gms.internal.measurement.C1298s4.m2790P1()     // Catch:{ IOException -> 0x01de }
            com.google.android.gms.internal.measurement.k9 r4 = com.google.android.gms.measurement.internal.C1794ta.m4742C(r5, r4)     // Catch:{ IOException -> 0x01de }
            com.google.android.gms.internal.measurement.r4 r4 = (com.google.android.gms.internal.measurement.C1282r4) r4     // Catch:{ IOException -> 0x01de }
            com.google.android.gms.internal.measurement.k8 r4 = r4.mo12838q()     // Catch:{ IOException -> 0x01de }
            com.google.android.gms.internal.measurement.s4 r4 = (com.google.android.gms.internal.measurement.C1298s4) r4     // Catch:{ IOException -> 0x01de }
            boolean r5 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fb }
            if (r5 == 0) goto L_0x0125
            com.google.android.gms.measurement.internal.n5 r5 = r1.f2143a     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fb }
            com.google.android.gms.measurement.internal.c4 r5 = r5.mo14228b()     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fb }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo14040w()     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fb }
            java.lang.String r6 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r3)     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fb }
            r5.mo14694b(r6, r7)     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fb }
        L_0x0125:
            r12.close()     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fb }
            com.google.android.gms.common.internal.C0917i.m1419j(r4)     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fb }
            r2.f2495a = r4     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fb }
            r11 = 3
            int r4 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0145
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            java.lang.String[] r5 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fb }
            r5[r15] = r3     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fb }
            r13 = 1
            r5[r13] = r17     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fb }
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fb }
            r7 = 2
            r5[r7] = r6     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fb }
            r7 = r4
            r8 = r5
            goto L_0x0151
        L_0x0145:
            r13 = 1
            java.lang.String r4 = "app_id = ? and metadata_fingerprint = ?"
            r5 = 2
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fb }
            r6[r15] = r3     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fb }
            r6[r13] = r17     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fb }
            r7 = r4
            r8 = r6
        L_0x0151:
            java.lang.String r4 = "rowid"
            java.lang.String r5 = "name"
            java.lang.String r6 = "timestamp"
            java.lang.String r9 = "data"
            java.lang.String[] r6 = new java.lang.String[]{r4, r5, r6, r9}     // Catch:{ SQLiteException -> 0x01ff, all -> 0x01fb }
            java.lang.String r5 = "raw_events"
            r9 = 0
            r10 = 0
            java.lang.String r14 = "rowid"
            r16 = 0
            r4 = r0
            r13 = 3
            r11 = r14
            r14 = r12
            r12 = r16
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x01f9, all -> 0x01f7 }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0070 }
            if (r0 == 0) goto L_0x01c7
        L_0x0175:
            long r5 = r4.getLong(r15)     // Catch:{ SQLiteException -> 0x0070 }
            byte[] r0 = r4.getBlob(r13)     // Catch:{ SQLiteException -> 0x0070 }
            com.google.android.gms.internal.measurement.g4 r7 = com.google.android.gms.internal.measurement.C1122h4.m2041C()     // Catch:{ IOException -> 0x01a7 }
            com.google.android.gms.internal.measurement.k9 r0 = com.google.android.gms.measurement.internal.C1794ta.m4742C(r7, r0)     // Catch:{ IOException -> 0x01a7 }
            com.google.android.gms.internal.measurement.g4 r0 = (com.google.android.gms.internal.measurement.C1106g4) r0     // Catch:{ IOException -> 0x01a7 }
            r7 = 1
            java.lang.String r8 = r4.getString(r7)     // Catch:{ SQLiteException -> 0x0070 }
            r0.mo12812K(r8)     // Catch:{ SQLiteException -> 0x0070 }
            r8 = 2
            long r9 = r4.getLong(r8)     // Catch:{ SQLiteException -> 0x0070 }
            r0.mo12816Q(r9)     // Catch:{ SQLiteException -> 0x0070 }
            com.google.android.gms.internal.measurement.k8 r0 = r0.mo12838q()     // Catch:{ SQLiteException -> 0x0070 }
            com.google.android.gms.internal.measurement.h4 r0 = (com.google.android.gms.internal.measurement.C1122h4) r0     // Catch:{ SQLiteException -> 0x0070 }
            boolean r0 = r2.mo14413a(r5, r0)     // Catch:{ SQLiteException -> 0x0070 }
            if (r0 != 0) goto L_0x01bd
            r4.close()
            return
        L_0x01a7:
            r0 = move-exception
            r7 = 1
            r8 = 2
            com.google.android.gms.measurement.internal.n5 r5 = r1.f2143a     // Catch:{ SQLiteException -> 0x0070 }
            com.google.android.gms.measurement.internal.c4 r5 = r5.mo14228b()     // Catch:{ SQLiteException -> 0x0070 }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo14035r()     // Catch:{ SQLiteException -> 0x0070 }
            java.lang.String r6 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r3)     // Catch:{ SQLiteException -> 0x0070 }
            r5.mo14695c(r6, r9, r0)     // Catch:{ SQLiteException -> 0x0070 }
        L_0x01bd:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x0070 }
            if (r0 != 0) goto L_0x0175
            r4.close()
            return
        L_0x01c7:
            com.google.android.gms.measurement.internal.n5 r0 = r1.f2143a     // Catch:{ SQLiteException -> 0x0070 }
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()     // Catch:{ SQLiteException -> 0x0070 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14040w()     // Catch:{ SQLiteException -> 0x0070 }
            java.lang.String r2 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r3)     // Catch:{ SQLiteException -> 0x0070 }
            r0.mo14694b(r2, r5)     // Catch:{ SQLiteException -> 0x0070 }
            r4.close()
            return
        L_0x01de:
            r0 = move-exception
            r14 = r12
            com.google.android.gms.measurement.internal.n5 r2 = r1.f2143a     // Catch:{ SQLiteException -> 0x01f9, all -> 0x01f7 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo14228b()     // Catch:{ SQLiteException -> 0x01f9, all -> 0x01f7 }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14035r()     // Catch:{ SQLiteException -> 0x01f9, all -> 0x01f7 }
            java.lang.String r4 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r3)     // Catch:{ SQLiteException -> 0x01f9, all -> 0x01f7 }
            r2.mo14695c(r4, r5, r0)     // Catch:{ SQLiteException -> 0x01f9, all -> 0x01f7 }
            r14.close()
            return
        L_0x01f7:
            r0 = move-exception
            goto L_0x01fd
        L_0x01f9:
            r0 = move-exception
            goto L_0x0201
        L_0x01fb:
            r0 = move-exception
            r14 = r12
        L_0x01fd:
            r3 = r14
            goto L_0x022a
        L_0x01ff:
            r0 = move-exception
            r14 = r12
        L_0x0201:
            r4 = r14
            goto L_0x020f
        L_0x0203:
            r0 = move-exception
            r3 = r16
            goto L_0x022a
        L_0x0207:
            r0 = move-exception
            r4 = r16
            goto L_0x020f
        L_0x020b:
            r0 = move-exception
            goto L_0x022a
        L_0x020d:
            r0 = move-exception
            r4 = r3
        L_0x020f:
            com.google.android.gms.measurement.internal.n5 r2 = r1.f2143a     // Catch:{ all -> 0x0228 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo14228b()     // Catch:{ all -> 0x0228 }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14035r()     // Catch:{ all -> 0x0228 }
            java.lang.String r5 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r3)     // Catch:{ all -> 0x0228 }
            r2.mo14695c(r5, r3, r0)     // Catch:{ all -> 0x0228 }
            if (r4 == 0) goto L_0x0227
            r4.close()
        L_0x0227:
            return
        L_0x0228:
            r0 = move-exception
            r3 = r4
        L_0x022a:
            if (r3 == 0) goto L_0x022f
            r3.close()
        L_0x022f:
            goto L_0x0231
        L_0x0230:
            throw r0
        L_0x0231:
            goto L_0x0230
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1686l.mo14314G(java.lang.String, long, long, com.google.android.gms.measurement.internal.oa):void");
    }

    @WorkerThread
    /* renamed from: J */
    public final int mo14315J(String str, String str2) {
        C0917i.m1415f(str);
        C0917i.m1415f(str2);
        mo14009h();
        mo14128i();
        try {
            return mo14320P().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.f2143a.mo14228b().mo14035r().mo14696d("Error deleting conditional property", C1574c4.m4083z(str), this.f2143a.mo14373D().mo14619f(str2), e);
            return 0;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    @WorkerThread
    @VisibleForTesting
    /* renamed from: L */
    public final long mo14316L(String str, String str2) {
        String str3 = str;
        C0917i.m1415f(str);
        C0917i.m1415f("first_open_count");
        mo14009h();
        mo14128i();
        SQLiteDatabase P = mo14320P();
        P.beginTransaction();
        long j = 0;
        try {
            long K = m4423K("select " + "first_open_count" + " from app2 where app_id=?", new String[]{str3}, -1);
            if (K == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(Constants.APP_ID, str3);
                contentValues.put("first_open_count", 0);
                contentValues.put("previous_install_count", 0);
                if (P.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                    this.f2143a.mo14228b().mo14035r().mo14695c("Failed to insert column (got -1). appId", C1574c4.m4083z(str), "first_open_count");
                    P.endTransaction();
                    return -1;
                }
                K = 0;
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(Constants.APP_ID, str3);
                contentValues2.put("first_open_count", Long.valueOf(1 + K));
                if (((long) P.update("app2", contentValues2, "app_id = ?", new String[]{str3})) == 0) {
                    this.f2143a.mo14228b().mo14035r().mo14695c("Failed to update column (got 0). appId", C1574c4.m4083z(str), "first_open_count");
                    P.endTransaction();
                    return -1;
                }
                P.setTransactionSuccessful();
                P.endTransaction();
                return K;
            } catch (SQLiteException e) {
                e = e;
                j = K;
                try {
                    this.f2143a.mo14228b().mo14035r().mo14696d("Error inserting column. appId", C1574c4.m4083z(str), "first_open_count", e);
                    P.endTransaction();
                    return j;
                } catch (Throwable th) {
                    P.endTransaction();
                    throw th;
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            this.f2143a.mo14228b().mo14035r().mo14696d("Error inserting column. appId", C1574c4.m4083z(str), "first_open_count", e);
            P.endTransaction();
            return j;
        }
    }

    @WorkerThread
    /* renamed from: M */
    public final long mo14317M() {
        return m4423K("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    @WorkerThread
    /* renamed from: N */
    public final long mo14318N() {
        return m4423K("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    /* renamed from: O */
    public final long mo14319O(String str) {
        C0917i.m1415f(str);
        return m4423K("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @VisibleForTesting
    /* renamed from: P */
    public final SQLiteDatabase mo14320P() {
        mo14009h();
        try {
            return this.f2257d.getWritableDatabase();
        } catch (SQLiteException e) {
            this.f2143a.mo14228b().mo14040w().mo14694b("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d9  */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo14321Q(java.lang.String r8) {
        /*
            r7 = this;
            r7.mo14009h()
            r7.mo14128i()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.mo14320P()     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            r3 = 0
            r2[r3] = r8     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            java.lang.String r4 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r1 = r1.rawQuery(r4, r2)     // Catch:{ SQLiteException -> 0x00be, all -> 0x00bc }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x00ba }
            if (r2 != 0) goto L_0x0030
            com.google.android.gms.measurement.internal.n5 r8 = r7.f2143a     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.measurement.internal.c4 r8 = r8.mo14228b()     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.measurement.internal.z3 r8 = r8.mo14039v()     // Catch:{ SQLiteException -> 0x00ba }
            java.lang.String r2 = "Default event parameters not found"
            r8.mo14693a(r2)     // Catch:{ SQLiteException -> 0x00ba }
            r1.close()
            return r0
        L_0x0030:
            byte[] r2 = r1.getBlob(r3)     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.internal.measurement.g4 r3 = com.google.android.gms.internal.measurement.C1122h4.m2041C()     // Catch:{ IOException -> 0x00a2 }
            com.google.android.gms.internal.measurement.k9 r2 = com.google.android.gms.measurement.internal.C1794ta.m4742C(r3, r2)     // Catch:{ IOException -> 0x00a2 }
            com.google.android.gms.internal.measurement.g4 r2 = (com.google.android.gms.internal.measurement.C1106g4) r2     // Catch:{ IOException -> 0x00a2 }
            com.google.android.gms.internal.measurement.k8 r2 = r2.mo12838q()     // Catch:{ IOException -> 0x00a2 }
            com.google.android.gms.internal.measurement.h4 r2 = (com.google.android.gms.internal.measurement.C1122h4) r2     // Catch:{ IOException -> 0x00a2 }
            com.google.android.gms.measurement.internal.ra r8 = r7.f2045b     // Catch:{ SQLiteException -> 0x00ba }
            r8.mo14475f0()     // Catch:{ SQLiteException -> 0x00ba }
            java.util.List r8 = r2.mo12855G()     // Catch:{ SQLiteException -> 0x00ba }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ SQLiteException -> 0x00ba }
            r2.<init>()     // Catch:{ SQLiteException -> 0x00ba }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ SQLiteException -> 0x00ba }
        L_0x0056:
            boolean r3 = r8.hasNext()     // Catch:{ SQLiteException -> 0x00ba }
            if (r3 == 0) goto L_0x009e
            java.lang.Object r3 = r8.next()     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.internal.measurement.l4 r3 = (com.google.android.gms.internal.measurement.C1186l4) r3     // Catch:{ SQLiteException -> 0x00ba }
            java.lang.String r4 = r3.mo12953E()     // Catch:{ SQLiteException -> 0x00ba }
            boolean r5 = r3.mo12956R()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0074
            double r5 = r3.mo12961x()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putDouble(r4, r5)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x0074:
            boolean r5 = r3.mo12957S()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0082
            float r3 = r3.mo12962y()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putFloat(r4, r3)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x0082:
            boolean r5 = r3.mo12960V()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0090
            java.lang.String r3 = r3.mo12954F()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putString(r4, r3)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x0090:
            boolean r5 = r3.mo12958T()     // Catch:{ SQLiteException -> 0x00ba }
            if (r5 == 0) goto L_0x0056
            long r5 = r3.mo12952A()     // Catch:{ SQLiteException -> 0x00ba }
            r2.putLong(r4, r5)     // Catch:{ SQLiteException -> 0x00ba }
            goto L_0x0056
        L_0x009e:
            r1.close()
            return r2
        L_0x00a2:
            r2 = move-exception
            com.google.android.gms.measurement.internal.n5 r3 = r7.f2143a     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.measurement.internal.c4 r3 = r3.mo14228b()     // Catch:{ SQLiteException -> 0x00ba }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo14035r()     // Catch:{ SQLiteException -> 0x00ba }
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r8)     // Catch:{ SQLiteException -> 0x00ba }
            r3.mo14695c(r4, r8, r2)     // Catch:{ SQLiteException -> 0x00ba }
            r1.close()
            return r0
        L_0x00ba:
            r8 = move-exception
            goto L_0x00c0
        L_0x00bc:
            r8 = move-exception
            goto L_0x00d7
        L_0x00be:
            r8 = move-exception
            r1 = r0
        L_0x00c0:
            com.google.android.gms.measurement.internal.n5 r2 = r7.f2143a     // Catch:{ all -> 0x00d5 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo14228b()     // Catch:{ all -> 0x00d5 }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14035r()     // Catch:{ all -> 0x00d5 }
            java.lang.String r3 = "Error selecting default event parameters"
            r2.mo14694b(r3, r8)     // Catch:{ all -> 0x00d5 }
            if (r1 == 0) goto L_0x00d4
            r1.close()
        L_0x00d4:
            return r0
        L_0x00d5:
            r8 = move-exception
            r0 = r1
        L_0x00d7:
            if (r0 == 0) goto L_0x00dc
            r0.close()
        L_0x00dc:
            goto L_0x00de
        L_0x00dd:
            throw r8
        L_0x00de:
            goto L_0x00dd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1686l.mo14321Q(java.lang.String):android.os.Bundle");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0119 A[Catch:{ SQLiteException -> 0x01ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x011d A[Catch:{ SQLiteException -> 0x01ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0159 A[Catch:{ SQLiteException -> 0x01ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0172 A[Catch:{ SQLiteException -> 0x01ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x018e A[Catch:{ SQLiteException -> 0x01ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x018f A[Catch:{ SQLiteException -> 0x01ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x019e A[Catch:{ SQLiteException -> 0x01ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01c1 A[Catch:{ SQLiteException -> 0x01ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01d3 A[Catch:{ SQLiteException -> 0x01ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x020d  */
    @androidx.annotation.WorkerThread
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C1589d6 mo14322R(java.lang.String r35) {
        /*
            r34 = this;
            r1 = r34
            r2 = r35
            com.google.android.gms.common.internal.C0917i.m1415f(r35)
            r34.mo14009h()
            r34.mo14128i()
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r34.mo14320P()     // Catch:{ SQLiteException -> 0x01ee, all -> 0x01ec }
            java.lang.String r5 = "app_instance_id"
            java.lang.String r6 = "gmp_app_id"
            java.lang.String r7 = "resettable_device_id_hash"
            java.lang.String r8 = "last_bundle_index"
            java.lang.String r9 = "last_bundle_start_timestamp"
            java.lang.String r10 = "last_bundle_end_timestamp"
            java.lang.String r11 = "app_version"
            java.lang.String r12 = "app_store"
            java.lang.String r13 = "gmp_version"
            java.lang.String r14 = "dev_cert_hash"
            java.lang.String r15 = "measurement_enabled"
            java.lang.String r16 = "day"
            java.lang.String r17 = "daily_public_events_count"
            java.lang.String r18 = "daily_events_count"
            java.lang.String r19 = "daily_conversions_count"
            java.lang.String r20 = "config_fetched_time"
            java.lang.String r21 = "failed_config_fetch_time"
            java.lang.String r22 = "app_version_int"
            java.lang.String r23 = "firebase_instance_id"
            java.lang.String r24 = "daily_error_events_count"
            java.lang.String r25 = "daily_realtime_events_count"
            java.lang.String r26 = "health_monitor_sample"
            java.lang.String r27 = "android_id"
            java.lang.String r28 = "adid_reporting_enabled"
            java.lang.String r29 = "admob_app_id"
            java.lang.String r30 = "dynamite_version"
            java.lang.String r31 = "safelisted_events"
            java.lang.String r32 = "ga_app_id"
            java.lang.String r33 = "session_stitching_token"
            java.lang.String[] r6 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33}     // Catch:{ SQLiteException -> 0x01ee, all -> 0x01ec }
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x01ee, all -> 0x01ec }
            r12 = 0
            r8[r12] = r2     // Catch:{ SQLiteException -> 0x01ee, all -> 0x01ec }
            java.lang.String r5 = "apps"
            java.lang.String r7 = "app_id=?"
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x01ee, all -> 0x01ec }
            boolean r5 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x01ea }
            if (r5 != 0) goto L_0x006b
            r4.close()
            return r3
        L_0x006b:
            com.google.android.gms.measurement.internal.d6 r5 = new com.google.android.gms.measurement.internal.d6     // Catch:{ SQLiteException -> 0x01ea }
            com.google.android.gms.measurement.internal.ra r6 = r1.f2045b     // Catch:{ SQLiteException -> 0x01ea }
            com.google.android.gms.measurement.internal.n5 r6 = r6.mo14471b0()     // Catch:{ SQLiteException -> 0x01ea }
            r5.<init>(r6, r2)     // Catch:{ SQLiteException -> 0x01ea }
            java.lang.String r6 = r4.getString(r12)     // Catch:{ SQLiteException -> 0x01ea }
            r5.mo14096i(r6)     // Catch:{ SQLiteException -> 0x01ea }
            java.lang.String r6 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x01ea }
            r5.mo14114x(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r6 = 2
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r5.mo14060G(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r6 = 3
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r5.mo14056C(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r6 = 4
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r5.mo14057D(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r6 = 5
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r5.mo14055B(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r6 = 6
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r5.mo14100k(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r6 = 7
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r5.mo14098j(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r6 = 8
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r5.mo14115y(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r6 = 9
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r5.mo14110t(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r6 = 10
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x01ea }
            if (r7 != 0) goto L_0x00d7
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x01ea }
            if (r6 == 0) goto L_0x00d5
            goto L_0x00d7
        L_0x00d5:
            r6 = 0
            goto L_0x00d8
        L_0x00d7:
            r6 = 1
        L_0x00d8:
            r5.mo14058E(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r6 = 11
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r5.mo14109s(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r6 = 12
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r5.mo14107q(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r6 = 13
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r5.mo14106p(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r6 = 14
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r5.mo14104n(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r6 = 15
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r5.mo14103m(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r6 = 16
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r5.mo14112v(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r6 = 17
            boolean r7 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x01ea }
            if (r7 == 0) goto L_0x011d
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0122
        L_0x011d:
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x01ea }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x01ea }
        L_0x0122:
            r5.mo14102l(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r6 = 18
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r5.mo14113w(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r6 = 19
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r5.mo14105o(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r6 = 20
            long r6 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r5.mo14108r(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r6 = 21
            java.lang.String r6 = r4.getString(r6)     // Catch:{ SQLiteException -> 0x01ea }
            r5.mo14116z(r6)     // Catch:{ SQLiteException -> 0x01ea }
            com.google.android.gms.measurement.internal.n5 r6 = r1.f2143a     // Catch:{ SQLiteException -> 0x01ea }
            com.google.android.gms.measurement.internal.g r6 = r6.mo14402z()     // Catch:{ SQLiteException -> 0x01ea }
            com.google.android.gms.measurement.internal.n3 r7 = com.google.android.gms.measurement.internal.C1727o3.f2444h0     // Catch:{ SQLiteException -> 0x01ea }
            boolean r6 = r6.mo14163B(r3, r7)     // Catch:{ SQLiteException -> 0x01ea }
            r7 = 0
            if (r6 != 0) goto L_0x016a
            r6 = 22
            boolean r9 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x01ea }
            if (r9 == 0) goto L_0x0163
            r9 = r7
            goto L_0x0167
        L_0x0163:
            long r9 = r4.getLong(r6)     // Catch:{ SQLiteException -> 0x01ea }
        L_0x0167:
            r5.mo14094h(r9)     // Catch:{ SQLiteException -> 0x01ea }
        L_0x016a:
            r6 = 23
            boolean r9 = r4.isNull(r6)     // Catch:{ SQLiteException -> 0x01ea }
            if (r9 != 0) goto L_0x017a
            int r6 = r4.getInt(r6)     // Catch:{ SQLiteException -> 0x01ea }
            if (r6 == 0) goto L_0x0179
            goto L_0x017a
        L_0x0179:
            r0 = 0
        L_0x017a:
            r5.mo14092g(r0)     // Catch:{ SQLiteException -> 0x01ea }
            r0 = 24
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x01ea }
            r5.mo14090f(r0)     // Catch:{ SQLiteException -> 0x01ea }
            r0 = 25
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x01ea }
            if (r6 == 0) goto L_0x018f
            goto L_0x0193
        L_0x018f:
            long r7 = r4.getLong(r0)     // Catch:{ SQLiteException -> 0x01ea }
        L_0x0193:
            r5.mo14111u(r7)     // Catch:{ SQLiteException -> 0x01ea }
            r0 = 26
            boolean r6 = r4.isNull(r0)     // Catch:{ SQLiteException -> 0x01ea }
            if (r6 != 0) goto L_0x01b0
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x01ea }
            java.lang.String r6 = ","
            r7 = -1
            java.lang.String[] r0 = r0.split(r6, r7)     // Catch:{ SQLiteException -> 0x01ea }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ SQLiteException -> 0x01ea }
            r5.mo14061H(r0)     // Catch:{ SQLiteException -> 0x01ea }
        L_0x01b0:
            com.google.android.gms.internal.measurement.C1338ud.m3082b()     // Catch:{ SQLiteException -> 0x01ea }
            com.google.android.gms.measurement.internal.n5 r0 = r1.f2143a     // Catch:{ SQLiteException -> 0x01ea }
            com.google.android.gms.measurement.internal.g r0 = r0.mo14402z()     // Catch:{ SQLiteException -> 0x01ea }
            com.google.android.gms.measurement.internal.n3 r6 = com.google.android.gms.measurement.internal.C1727o3.f2401F0     // Catch:{ SQLiteException -> 0x01ea }
            boolean r0 = r0.mo14163B(r3, r6)     // Catch:{ SQLiteException -> 0x01ea }
            if (r0 == 0) goto L_0x01ca
            r0 = 28
            java.lang.String r0 = r4.getString(r0)     // Catch:{ SQLiteException -> 0x01ea }
            r5.mo14062I(r0)     // Catch:{ SQLiteException -> 0x01ea }
        L_0x01ca:
            r5.mo14086d()     // Catch:{ SQLiteException -> 0x01ea }
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x01ea }
            if (r0 == 0) goto L_0x01e6
            com.google.android.gms.measurement.internal.n5 r0 = r1.f2143a     // Catch:{ SQLiteException -> 0x01ea }
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()     // Catch:{ SQLiteException -> 0x01ea }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14035r()     // Catch:{ SQLiteException -> 0x01ea }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r35)     // Catch:{ SQLiteException -> 0x01ea }
            r0.mo14694b(r6, r7)     // Catch:{ SQLiteException -> 0x01ea }
        L_0x01e6:
            r4.close()
            return r5
        L_0x01ea:
            r0 = move-exception
            goto L_0x01f0
        L_0x01ec:
            r0 = move-exception
            goto L_0x020b
        L_0x01ee:
            r0 = move-exception
            r4 = r3
        L_0x01f0:
            com.google.android.gms.measurement.internal.n5 r5 = r1.f2143a     // Catch:{ all -> 0x0209 }
            com.google.android.gms.measurement.internal.c4 r5 = r5.mo14228b()     // Catch:{ all -> 0x0209 }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo14035r()     // Catch:{ all -> 0x0209 }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r35)     // Catch:{ all -> 0x0209 }
            r5.mo14695c(r6, r2, r0)     // Catch:{ all -> 0x0209 }
            if (r4 == 0) goto L_0x0208
            r4.close()
        L_0x0208:
            return r3
        L_0x0209:
            r0 = move-exception
            r3 = r4
        L_0x020b:
            if (r3 == 0) goto L_0x0210
            r3.close()
        L_0x0210:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1686l.mo14322R(java.lang.String):com.google.android.gms.measurement.internal.d6");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0126  */
    @androidx.annotation.WorkerThread
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzac mo14323S(java.lang.String r31, java.lang.String r32) {
        /*
            r30 = this;
            r1 = r30
            r8 = r32
            com.google.android.gms.common.internal.C0917i.m1415f(r31)
            com.google.android.gms.common.internal.C0917i.m1415f(r32)
            r30.mo14009h()
            r30.mo14128i()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r30.mo14320P()     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            java.lang.String r11 = "origin"
            java.lang.String r12 = "value"
            java.lang.String r13 = "active"
            java.lang.String r14 = "trigger_event_name"
            java.lang.String r15 = "trigger_timeout"
            java.lang.String r16 = "timed_out_event"
            java.lang.String r17 = "creation_timestamp"
            java.lang.String r18 = "triggered_event"
            java.lang.String r19 = "triggered_timestamp"
            java.lang.String r20 = "time_to_live"
            java.lang.String r21 = "expired_event"
            java.lang.String[] r12 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            r2 = 0
            r14[r2] = r31     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            r3 = 1
            r14[r3] = r8     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            java.lang.String r11 = "conditional_properties"
            java.lang.String r13 = "app_id=? and name=?"
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x00fd, all -> 0x00fb }
            boolean r4 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x00f9 }
            if (r4 != 0) goto L_0x004f
            r10.close()
            return r9
        L_0x004f:
            java.lang.String r4 = r10.getString(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            if (r4 != 0) goto L_0x0057
            java.lang.String r4 = ""
        L_0x0057:
            r17 = r4
            java.lang.Object r6 = r1.mo14328Y(r10, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            int r0 = r10.getInt(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            if (r0 == 0) goto L_0x0066
            r21 = 1
            goto L_0x0068
        L_0x0066:
            r21 = 0
        L_0x0068:
            r0 = 3
            java.lang.String r22 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 4
            long r24 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.ra r0 = r1.f2045b     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.ta r0 = r0.mo14475f0()     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = 5
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzaw> r3 = com.google.android.gms.measurement.internal.zzaw.CREATOR     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable r0 = r0.mo14590z(r2, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            r23 = r0
            com.google.android.gms.measurement.internal.zzaw r23 = (com.google.android.gms.measurement.internal.zzaw) r23     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 6
            long r19 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.ra r0 = r1.f2045b     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.ta r0 = r0.mo14475f0()     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = 7
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable r0 = r0.mo14590z(r2, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            r26 = r0
            com.google.android.gms.measurement.internal.zzaw r26 = (com.google.android.gms.measurement.internal.zzaw) r26     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 8
            long r4 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            r0 = 9
            long r27 = r10.getLong(r0)     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.ra r0 = r1.f2045b     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.ta r0 = r0.mo14475f0()     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = 10
            byte[] r2 = r10.getBlob(r2)     // Catch:{ SQLiteException -> 0x00f9 }
            android.os.Parcelable r0 = r0.mo14590z(r2, r3)     // Catch:{ SQLiteException -> 0x00f9 }
            r29 = r0
            com.google.android.gms.measurement.internal.zzaw r29 = (com.google.android.gms.measurement.internal.zzaw) r29     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.zzlo r18 = new com.google.android.gms.measurement.internal.zzlo     // Catch:{ SQLiteException -> 0x00f9 }
            r2 = r18
            r3 = r32
            r7 = r17
            r2.<init>(r3, r4, r6, r7)     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.zzac r0 = new com.google.android.gms.measurement.internal.zzac     // Catch:{ SQLiteException -> 0x00f9 }
            r15 = r0
            r16 = r31
            r15.<init>(r16, r17, r18, r19, r21, r22, r23, r24, r26, r27, r29)     // Catch:{ SQLiteException -> 0x00f9 }
            boolean r2 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x00f9 }
            if (r2 == 0) goto L_0x00f5
            com.google.android.gms.measurement.internal.n5 r2 = r1.f2143a     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo14228b()     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14035r()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r3 = "Got multiple records for conditional property, expected one"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r31)     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.n5 r5 = r1.f2143a     // Catch:{ SQLiteException -> 0x00f9 }
            com.google.android.gms.measurement.internal.w3 r5 = r5.mo14373D()     // Catch:{ SQLiteException -> 0x00f9 }
            java.lang.String r5 = r5.mo14619f(r8)     // Catch:{ SQLiteException -> 0x00f9 }
            r2.mo14695c(r3, r4, r5)     // Catch:{ SQLiteException -> 0x00f9 }
        L_0x00f5:
            r10.close()
            return r0
        L_0x00f9:
            r0 = move-exception
            goto L_0x00ff
        L_0x00fb:
            r0 = move-exception
            goto L_0x0124
        L_0x00fd:
            r0 = move-exception
            r10 = r9
        L_0x00ff:
            com.google.android.gms.measurement.internal.n5 r2 = r1.f2143a     // Catch:{ all -> 0x0122 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo14228b()     // Catch:{ all -> 0x0122 }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14035r()     // Catch:{ all -> 0x0122 }
            java.lang.String r3 = "Error querying conditional property"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r31)     // Catch:{ all -> 0x0122 }
            com.google.android.gms.measurement.internal.n5 r5 = r1.f2143a     // Catch:{ all -> 0x0122 }
            com.google.android.gms.measurement.internal.w3 r5 = r5.mo14373D()     // Catch:{ all -> 0x0122 }
            java.lang.String r5 = r5.mo14619f(r8)     // Catch:{ all -> 0x0122 }
            r2.mo14696d(r3, r4, r5, r0)     // Catch:{ all -> 0x0122 }
            if (r10 == 0) goto L_0x0121
            r10.close()
        L_0x0121:
            return r9
        L_0x0122:
            r0 = move-exception
            r9 = r10
        L_0x0124:
            if (r9 == 0) goto L_0x0129
            r9.close()
        L_0x0129:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1686l.mo14323S(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzac");
    }

    @WorkerThread
    /* renamed from: T */
    public final C1660j mo14324T(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return mo14325U(j, str, 1, false, false, z3, false, z5);
    }

    @WorkerThread
    /* renamed from: U */
    public final C1660j mo14325U(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C0917i.m1415f(str);
        mo14009h();
        mo14128i();
        String[] strArr = {str};
        C1660j jVar = new C1660j();
        Cursor cursor = null;
        try {
            SQLiteDatabase P = mo14320P();
            cursor = P.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                this.f2143a.mo14228b().mo14040w().mo14694b("Not updating daily counts, app is not known. appId", C1574c4.m4083z(str));
                cursor.close();
                return jVar;
            }
            if (cursor.getLong(0) == j) {
                jVar.f2176b = cursor.getLong(1);
                jVar.f2175a = cursor.getLong(2);
                jVar.f2177c = cursor.getLong(3);
                jVar.f2178d = cursor.getLong(4);
                jVar.f2179e = cursor.getLong(5);
            }
            if (z) {
                jVar.f2176b += j2;
            }
            if (z2) {
                jVar.f2175a += j2;
            }
            if (z3) {
                jVar.f2177c += j2;
            }
            if (z4) {
                jVar.f2178d += j2;
            }
            if (z5) {
                jVar.f2179e += j2;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j));
            contentValues.put("daily_public_events_count", Long.valueOf(jVar.f2175a));
            contentValues.put("daily_events_count", Long.valueOf(jVar.f2176b));
            contentValues.put("daily_conversions_count", Long.valueOf(jVar.f2177c));
            contentValues.put("daily_error_events_count", Long.valueOf(jVar.f2178d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(jVar.f2179e));
            P.update("apps", contentValues, "app_id=?", strArr);
            cursor.close();
            return jVar;
        } catch (SQLiteException e) {
            this.f2143a.mo14228b().mo14035r().mo14695c("Error updating daily counts. appId", C1574c4.m4083z(str), e);
            if (cursor != null) {
                cursor.close();
            }
            return jVar;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0150  */
    @androidx.annotation.WorkerThread
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C1759r mo14326V(java.lang.String r28, java.lang.String r29) {
        /*
            r27 = this;
            r1 = r27
            r15 = r29
            com.google.android.gms.common.internal.C0917i.m1415f(r28)
            com.google.android.gms.common.internal.C0917i.m1415f(r29)
            r27.mo14009h()
            r27.mo14128i()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r2 = "lifetime_count"
            java.lang.String r3 = "current_bundle_count"
            java.lang.String r4 = "last_fire_timestamp"
            java.lang.String r5 = "last_bundled_timestamp"
            java.lang.String r6 = "last_bundled_day"
            java.lang.String r7 = "last_sampled_complex_event_id"
            java.lang.String r8 = "last_sampling_rate"
            java.lang.String r9 = "last_exempt_from_sampling"
            java.lang.String r10 = "current_session_count"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            r19 = 0
            android.database.sqlite.SQLiteDatabase r2 = r27.mo14320P()     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r10 = 0
            java.lang.String[] r3 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r4 = r0
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r0 = 2
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r6[r10] = r28     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            r11 = 1
            r6[r11] = r15     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            java.lang.String r3 = "events"
            java.lang.String r5 = "app_id=? and name=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0123, all -> 0x0121 }
            boolean r2 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r2 != 0) goto L_0x005c
            r13.close()
            return r19
        L_0x005c:
            long r5 = r13.getLong(r10)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            long r7 = r13.getLong(r11)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            long r16 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r0 = 3
            boolean r2 = r13.isNull(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r3 = 0
            if (r2 == 0) goto L_0x0074
            r20 = r3
            goto L_0x0078
        L_0x0074:
            long r20 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
        L_0x0078:
            r0 = 4
            boolean r2 = r13.isNull(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r2 == 0) goto L_0x0082
            r0 = r19
            goto L_0x008a
        L_0x0082:
            long r22 = r13.getLong(r0)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            java.lang.Long r0 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
        L_0x008a:
            r2 = 5
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 == 0) goto L_0x0094
            r18 = r19
            goto L_0x009e
        L_0x0094:
            long r22 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r18 = r2
        L_0x009e:
            r2 = 6
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 == 0) goto L_0x00a8
            r22 = r19
            goto L_0x00b2
        L_0x00a8:
            long r22 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            java.lang.Long r2 = java.lang.Long.valueOf(r22)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r22 = r2
        L_0x00b2:
            r2 = 7
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 != 0) goto L_0x00cb
            long r23 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r25 = 1
            int r2 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r2 != 0) goto L_0x00c4
            r10 = 1
        L_0x00c4:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r23 = r2
            goto L_0x00cd
        L_0x00cb:
            r23 = r19
        L_0x00cd:
            r2 = 8
            boolean r9 = r13.isNull(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            if (r9 == 0) goto L_0x00d7
            r9 = r3
            goto L_0x00dc
        L_0x00d7:
            long r2 = r13.getLong(r2)     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r9 = r2
        L_0x00dc:
            com.google.android.gms.measurement.internal.r r24 = new com.google.android.gms.measurement.internal.r     // Catch:{ SQLiteException -> 0x011b, all -> 0x0115 }
            r2 = r24
            r3 = r28
            r4 = r29
            r11 = r16
            r25 = r13
            r13 = r20
            r15 = r0
            r16 = r18
            r17 = r22
            r18 = r23
            r2.<init>(r3, r4, r5, r7, r9, r11, r13, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            boolean r0 = r25.moveToNext()     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            if (r0 == 0) goto L_0x010d
            com.google.android.gms.measurement.internal.n5 r0 = r1.f2143a     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14035r()     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            java.lang.String r2 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r28)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
            r0.mo14694b(r2, r3)     // Catch:{ SQLiteException -> 0x0113, all -> 0x0111 }
        L_0x010d:
            r25.close()
            return r24
        L_0x0111:
            r0 = move-exception
            goto L_0x0118
        L_0x0113:
            r0 = move-exception
            goto L_0x011e
        L_0x0115:
            r0 = move-exception
            r25 = r13
        L_0x0118:
            r19 = r25
            goto L_0x014e
        L_0x011b:
            r0 = move-exception
            r25 = r13
        L_0x011e:
            r13 = r25
            goto L_0x0126
        L_0x0121:
            r0 = move-exception
            goto L_0x014e
        L_0x0123:
            r0 = move-exception
            r13 = r19
        L_0x0126:
            com.google.android.gms.measurement.internal.n5 r2 = r1.f2143a     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo14228b()     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14035r()     // Catch:{ all -> 0x014b }
            java.lang.String r3 = "Error querying events. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r28)     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.n5 r5 = r1.f2143a     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.w3 r5 = r5.mo14373D()     // Catch:{ all -> 0x014b }
            r6 = r29
            java.lang.String r5 = r5.mo14617d(r6)     // Catch:{ all -> 0x014b }
            r2.mo14696d(r3, r4, r5, r0)     // Catch:{ all -> 0x014b }
            if (r13 == 0) goto L_0x014a
            r13.close()
        L_0x014a:
            return r19
        L_0x014b:
            r0 = move-exception
            r19 = r13
        L_0x014e:
            if (r19 == 0) goto L_0x0153
            r19.close()
        L_0x0153:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1686l.mo14326V(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.r");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a6  */
    @androidx.annotation.WorkerThread
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C1818va mo14327X(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r9 = r21
            com.google.android.gms.common.internal.C0917i.m1415f(r20)
            com.google.android.gms.common.internal.C0917i.m1415f(r21)
            r19.mo14009h()
            r19.mo14128i()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.mo14320P()     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            java.lang.String r0 = "set_timestamp"
            java.lang.String r2 = "value"
            java.lang.String r3 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r0, r2, r3}     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            r0 = 2
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            r2 = 0
            r15[r2] = r20     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            r3 = 1
            r15[r3] = r9     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            java.lang.String r12 = "user_attributes"
            java.lang.String r14 = "app_id=? and name=?"
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteException -> 0x007d, all -> 0x007b }
            boolean r4 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0079 }
            if (r4 != 0) goto L_0x0040
            r11.close()
            return r10
        L_0x0040:
            long r6 = r11.getLong(r2)     // Catch:{ SQLiteException -> 0x0079 }
            java.lang.Object r8 = r1.mo14328Y(r11, r3)     // Catch:{ SQLiteException -> 0x0079 }
            if (r8 != 0) goto L_0x004e
            r11.close()
            return r10
        L_0x004e:
            java.lang.String r4 = r11.getString(r0)     // Catch:{ SQLiteException -> 0x0079 }
            com.google.android.gms.measurement.internal.va r0 = new com.google.android.gms.measurement.internal.va     // Catch:{ SQLiteException -> 0x0079 }
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch:{ SQLiteException -> 0x0079 }
            boolean r2 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x0079 }
            if (r2 == 0) goto L_0x0075
            com.google.android.gms.measurement.internal.n5 r2 = r1.f2143a     // Catch:{ SQLiteException -> 0x0079 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo14228b()     // Catch:{ SQLiteException -> 0x0079 }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14035r()     // Catch:{ SQLiteException -> 0x0079 }
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r20)     // Catch:{ SQLiteException -> 0x0079 }
            r2.mo14694b(r3, r4)     // Catch:{ SQLiteException -> 0x0079 }
        L_0x0075:
            r11.close()
            return r0
        L_0x0079:
            r0 = move-exception
            goto L_0x007f
        L_0x007b:
            r0 = move-exception
            goto L_0x00a4
        L_0x007d:
            r0 = move-exception
            r11 = r10
        L_0x007f:
            com.google.android.gms.measurement.internal.n5 r2 = r1.f2143a     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo14228b()     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14035r()     // Catch:{ all -> 0x00a2 }
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r20)     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.n5 r5 = r1.f2143a     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.w3 r5 = r5.mo14373D()     // Catch:{ all -> 0x00a2 }
            java.lang.String r5 = r5.mo14619f(r9)     // Catch:{ all -> 0x00a2 }
            r2.mo14696d(r3, r4, r5, r0)     // Catch:{ all -> 0x00a2 }
            if (r11 == 0) goto L_0x00a1
            r11.close()
        L_0x00a1:
            return r10
        L_0x00a2:
            r0 = move-exception
            r10 = r11
        L_0x00a4:
            if (r10 == 0) goto L_0x00a9
            r10.close()
        L_0x00a9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1686l.mo14327X(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.va");
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @VisibleForTesting
    /* renamed from: Y */
    public final Object mo14328Y(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            this.f2143a.mo14228b().mo14035r().mo14693a("Loaded invalid null value from database");
            return null;
        } else if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        } else {
            if (type == 2) {
                return Double.valueOf(cursor.getDouble(i));
            }
            if (type == 3) {
                return cursor.getString(i);
            }
            if (type != 4) {
                this.f2143a.mo14228b().mo14035r().mo14694b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            this.f2143a.mo14228b().mo14035r().mo14693a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    @androidx.annotation.WorkerThread
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo14329Z() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.mo14320P()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0022, all -> 0x0020 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x001e }
            if (r2 == 0) goto L_0x001a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x001e }
            r0.close()
            return r1
        L_0x001a:
            r0.close()
            return r1
        L_0x001e:
            r2 = move-exception
            goto L_0x0025
        L_0x0020:
            r0 = move-exception
            goto L_0x003e
        L_0x0022:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L_0x0025:
            com.google.android.gms.measurement.internal.n5 r3 = r6.f2143a     // Catch:{ all -> 0x003a }
            com.google.android.gms.measurement.internal.c4 r3 = r3.mo14228b()     // Catch:{ all -> 0x003a }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo14035r()     // Catch:{ all -> 0x003a }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.mo14694b(r4, r2)     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0039
            r0.close()
        L_0x0039:
            return r1
        L_0x003a:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x003e:
            if (r1 == 0) goto L_0x0043
            r1.close()
        L_0x0043:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1686l.mo14329Z():java.lang.String");
    }

    @WorkerThread
    /* renamed from: a0 */
    public final List mo14330a0(String str, String str2, String str3) {
        C0917i.m1415f(str);
        mo14009h();
        mo14128i();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return mo14331b0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* renamed from: b0 */
    public final List mo14331b0(String str, String[] strArr) {
        mo14009h();
        mo14128i();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase P = mo14320P();
            String[] strArr2 = {Constants.APP_ID, "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"};
            this.f2143a.mo14402z();
            Cursor query = P.query("conditional_properties", strArr2, str, strArr, (String) null, (String) null, "rowid", "1001");
            if (query.moveToFirst()) {
                while (true) {
                    int size = arrayList.size();
                    this.f2143a.mo14402z();
                    if (size < 1000) {
                        String string = query.getString(0);
                        String string2 = query.getString(1);
                        String string3 = query.getString(2);
                        Object Y = mo14328Y(query, 3);
                        boolean z = query.getInt(4) != 0;
                        String string4 = query.getString(5);
                        long j = query.getLong(6);
                        C1794ta f0 = this.f2045b.mo14475f0();
                        byte[] blob = query.getBlob(7);
                        Parcelable.Creator<zzaw> creator = zzaw.CREATOR;
                        arrayList.add(new zzac(string, string2, new zzlo(string3, query.getLong(10), Y, string2), query.getLong(8), z, string4, (zzaw) f0.mo14590z(blob, creator), j, (zzaw) this.f2045b.mo14475f0().mo14590z(query.getBlob(9), creator), query.getLong(11), (zzaw) this.f2045b.mo14475f0().mo14590z(query.getBlob(12), creator)));
                        if (!query.moveToNext()) {
                            break;
                        }
                    } else {
                        C1859z3 r = this.f2143a.mo14228b().mo14035r();
                        this.f2143a.mo14402z();
                        r.mo14694b("Read more than the max allowed conditional properties, ignoring extra", 1000);
                        break;
                    }
                }
                query.close();
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e) {
            this.f2143a.mo14228b().mo14035r().mo14694b("Error querying conditional user property value", e);
            List emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @WorkerThread
    /* renamed from: c0 */
    public final List mo14332c0(String str) {
        C0917i.m1415f(str);
        mo14009h();
        mo14128i();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            this.f2143a.mo14402z();
            Cursor query = mo14320P().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", "1000");
            if (query.moveToFirst()) {
                do {
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j = query.getLong(2);
                    Object Y = mo14328Y(query, 3);
                    if (Y == null) {
                        this.f2143a.mo14228b().mo14035r().mo14694b("Read invalid user property value, ignoring it. appId", C1574c4.m4083z(str));
                    } else {
                        arrayList.add(new C1818va(str, str2, string, j, Y));
                    }
                } while (query.moveToNext());
                query.close();
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e) {
            this.f2143a.mo14228b().mo14035r().mo14695c("Error querying user properties. appId", C1574c4.m4083z(str), e);
            List emptyList = Collections.emptyList();
            if (cursor != null) {
                cursor.close();
            }
            return emptyList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0124 A[DONT_GENERATE] */
    @androidx.annotation.WorkerThread
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo14333d0(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            com.google.android.gms.common.internal.C0917i.m1415f(r18)
            r17.mo14009h()
            r17.mo14128i()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r11 = "1001"
            r12 = 0
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0106 }
            r13 = 3
            r3.<init>(r13)     // Catch:{ SQLiteException -> 0x0106 }
            r14 = r18
            r3.add(r14)     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0104 }
            java.lang.String r5 = "app_id=?"
            r4.<init>(r5)     // Catch:{ SQLiteException -> 0x0104 }
            boolean r5 = android.text.TextUtils.isEmpty(r19)     // Catch:{ SQLiteException -> 0x0104 }
            if (r5 != 0) goto L_0x0038
            r15 = r19
            r3.add(r15)     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r5 = " and origin=?"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0100 }
            goto L_0x003a
        L_0x0038:
            r15 = r19
        L_0x003a:
            boolean r5 = android.text.TextUtils.isEmpty(r20)     // Catch:{ SQLiteException -> 0x0100 }
            if (r5 != 0) goto L_0x0059
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0100 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x0100 }
            r5.append(r0)     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r6 = "*"
            r5.append(r6)     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r5 = r5.toString()     // Catch:{ SQLiteException -> 0x0100 }
            r3.add(r5)     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r5 = " and name glob ?"
            r4.append(r5)     // Catch:{ SQLiteException -> 0x0100 }
        L_0x0059:
            int r5 = r3.size()     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.Object[] r3 = r3.toArray(r5)     // Catch:{ SQLiteException -> 0x0100 }
            r7 = r3
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ SQLiteException -> 0x0100 }
            android.database.sqlite.SQLiteDatabase r3 = r17.mo14320P()     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r5 = "user_attributes"
            java.lang.String r6 = "name"
            java.lang.String r8 = "set_timestamp"
            java.lang.String r9 = "value"
            java.lang.String r10 = "origin"
            java.lang.String[] r6 = new java.lang.String[]{r6, r8, r9, r10}     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r8 = r4.toString()     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r10 = "rowid"
            com.google.android.gms.measurement.internal.n5 r4 = r1.f2143a     // Catch:{ SQLiteException -> 0x0100 }
            r4.mo14402z()     // Catch:{ SQLiteException -> 0x0100 }
            r9 = 0
            r16 = 0
            r4 = r5
            r5 = r6
            r6 = r8
            r8 = r9
            r9 = r16
            android.database.Cursor r12 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x0100 }
            boolean r3 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x0100 }
            if (r3 != 0) goto L_0x009a
            r12.close()
            return r2
        L_0x009a:
            int r3 = r2.size()     // Catch:{ SQLiteException -> 0x0100 }
            com.google.android.gms.measurement.internal.n5 r4 = r1.f2143a     // Catch:{ SQLiteException -> 0x0100 }
            r4.mo14402z()     // Catch:{ SQLiteException -> 0x0100 }
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r4) goto L_0x00c0
            com.google.android.gms.measurement.internal.n5 r0 = r1.f2143a     // Catch:{ SQLiteException -> 0x0100 }
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()     // Catch:{ SQLiteException -> 0x0100 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14035r()     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r3 = "Read more than the max allowed user properties, ignoring excess"
            com.google.android.gms.measurement.internal.n5 r5 = r1.f2143a     // Catch:{ SQLiteException -> 0x0100 }
            r5.mo14402z()     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ SQLiteException -> 0x0100 }
            r0.mo14694b(r3, r4)     // Catch:{ SQLiteException -> 0x0100 }
            goto L_0x00fc
        L_0x00c0:
            r3 = 0
            java.lang.String r7 = r12.getString(r3)     // Catch:{ SQLiteException -> 0x0100 }
            r3 = 1
            long r8 = r12.getLong(r3)     // Catch:{ SQLiteException -> 0x0100 }
            r3 = 2
            java.lang.Object r10 = r1.mo14328Y(r12, r3)     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r15 = r12.getString(r13)     // Catch:{ SQLiteException -> 0x0100 }
            if (r10 != 0) goto L_0x00e9
            com.google.android.gms.measurement.internal.n5 r3 = r1.f2143a     // Catch:{ SQLiteException -> 0x0100 }
            com.google.android.gms.measurement.internal.c4 r3 = r3.mo14228b()     // Catch:{ SQLiteException -> 0x0100 }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo14035r()     // Catch:{ SQLiteException -> 0x0100 }
            java.lang.String r4 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r18)     // Catch:{ SQLiteException -> 0x0100 }
            r3.mo14696d(r4, r5, r15, r0)     // Catch:{ SQLiteException -> 0x0100 }
            goto L_0x00f5
        L_0x00e9:
            com.google.android.gms.measurement.internal.va r3 = new com.google.android.gms.measurement.internal.va     // Catch:{ SQLiteException -> 0x0100 }
            r4 = r3
            r5 = r18
            r6 = r15
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x0100 }
            r2.add(r3)     // Catch:{ SQLiteException -> 0x0100 }
        L_0x00f5:
            boolean r3 = r12.moveToNext()     // Catch:{ SQLiteException -> 0x0100 }
            if (r3 == 0) goto L_0x00fc
            goto L_0x009a
        L_0x00fc:
            r12.close()
            return r2
        L_0x0100:
            r0 = move-exception
            goto L_0x010b
        L_0x0102:
            r0 = move-exception
            goto L_0x0128
        L_0x0104:
            r0 = move-exception
            goto L_0x0109
        L_0x0106:
            r0 = move-exception
            r14 = r18
        L_0x0109:
            r15 = r19
        L_0x010b:
            com.google.android.gms.measurement.internal.n5 r2 = r1.f2143a     // Catch:{ all -> 0x0102 }
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo14228b()     // Catch:{ all -> 0x0102 }
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14035r()     // Catch:{ all -> 0x0102 }
            java.lang.String r3 = "(2)Error querying user properties"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r18)     // Catch:{ all -> 0x0102 }
            r2.mo14696d(r3, r4, r15, r0)     // Catch:{ all -> 0x0102 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0102 }
            if (r12 == 0) goto L_0x0127
            r12.close()
        L_0x0127:
            return r0
        L_0x0128:
            if (r12 == 0) goto L_0x012d
            r12.close()
        L_0x012d:
            goto L_0x012f
        L_0x012e:
            throw r0
        L_0x012f:
            goto L_0x012e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1686l.mo14333d0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    @WorkerThread
    /* renamed from: e0 */
    public final void mo14334e0() {
        mo14128i();
        mo14320P().beginTransaction();
    }

    @WorkerThread
    /* renamed from: f0 */
    public final void mo14335f0() {
        mo14128i();
        mo14320P().endTransaction();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @VisibleForTesting
    /* renamed from: g0 */
    public final void mo14336g0(List list) {
        mo14009h();
        mo14128i();
        C0917i.m1419j(list);
        C0917i.m1421l(list.size());
        if (mo14346u()) {
            String str = "(" + TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, list) + ")";
            if (m4422I("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0) {
                this.f2143a.mo14228b().mo14040w().mo14693a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                mo14320P().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                this.f2143a.mo14228b().mo14035r().mo14694b("Error incrementing retry count. error", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: h0 */
    public final void mo14337h0() {
        mo14009h();
        mo14128i();
        if (mo14346u()) {
            long a = this.f2045b.mo14473d0().f2283h.mo14368a();
            long b = this.f2143a.mo14229c().mo11030b();
            long abs = Math.abs(b - a);
            this.f2143a.mo14402z();
            if (abs > ((Long) C1727o3.f2477y.mo14366a((Object) null)).longValue()) {
                this.f2045b.mo14473d0().f2283h.mo14369b(b);
                mo14009h();
                mo14128i();
                if (mo14346u()) {
                    SQLiteDatabase P = mo14320P();
                    this.f2143a.mo14402z();
                    int delete = P.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.f2143a.mo14229c().mo11029a()), String.valueOf(C1621g.m4215i())});
                    if (delete > 0) {
                        this.f2143a.mo14228b().mo14039v().mo14694b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo14018l() {
        return false;
    }

    @WorkerThread
    /* renamed from: m */
    public final void mo14338m(String str, String str2) {
        C0917i.m1415f(str);
        C0917i.m1415f(str2);
        mo14009h();
        mo14128i();
        try {
            mo14320P().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.f2143a.mo14228b().mo14035r().mo14696d("Error deleting user property. appId", C1574c4.m4083z(str), this.f2143a.mo14373D().mo14619f(str2), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0318, code lost:
        r12 = java.lang.Integer.valueOf(r3.mo12807x());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0321, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0322, code lost:
        r11.put("filter_id", r12);
        r22 = r0;
        r11.put("property_name", r3.mo12801C());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0334, code lost:
        if (r3.mo12806I() == false) goto L_0x033f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0336, code lost:
        r0 = java.lang.Boolean.valueOf(r3.mo12804G());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x033f, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0340, code lost:
        r11.put("session_scoped", r0);
        r11.put(com.miot.bluetooth.channel.packet.Packet.DATA, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0354, code lost:
        if (mo14320P().insertWithOnConflict("property_filters", (java.lang.String) null, r11, 5) != -1) goto L_0x036a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0356, code lost:
        r9.f2143a.mo14228b().mo14035r().mo14694b("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.C1574c4.m4083z(r24));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x036a, code lost:
        r0 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x036e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        r3 = r9.f2143a.mo14228b().mo14035r();
        r4 = "Error storing property filter. appId";
        r7 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0381, code lost:
        mo14128i();
        mo14009h();
        com.google.android.gms.common.internal.C0917i.m1415f(r24);
        r0 = mo14320P();
        r3 = r17;
        r0.delete("property_filters", r3, new java.lang.String[]{r2, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", r3, new java.lang.String[]{r2, java.lang.String.valueOf(r10)});
        r17 = r3;
        r4 = r21;
        r3 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x03b8, code lost:
        r3 = r25;
        r4 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0187, code lost:
        r0.mo14695c(r7, r8, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x018b, code lost:
        r11 = r0.mo13423F().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0197, code lost:
        if (r11.hasNext() == false) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01a3, code lost:
        if (((com.google.android.gms.internal.measurement.C1105g3) r11.next()).mo12805H() != false) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01a5, code lost:
        r0 = r9.f2143a.mo14228b().mo14040w();
        r7 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
        r8 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r24);
        r10 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01ba, code lost:
        r11 = r0.mo13422E().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01d0, code lost:
        if (r11.hasNext() == false) goto L_0x02a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r12 = (com.google.android.gms.internal.measurement.C1372x2) r11.next();
        mo14128i();
        mo14009h();
        com.google.android.gms.common.internal.C0917i.m1415f(r24);
        com.google.android.gms.common.internal.C0917i.m1419j(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01ec, code lost:
        if (r12.mo13472E().isEmpty() == false) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01ee, code lost:
        r0 = r9.f2143a.mo14228b().mo14040w();
        r8 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r24);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0206, code lost:
        if (r12.mo13478M() == false) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0208, code lost:
        r20 = java.lang.Integer.valueOf(r12.mo13481y());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0213, code lost:
        r20 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0215, code lost:
        r0.mo14696d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r8, r11, java.lang.String.valueOf(r20));
        r21 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0220, code lost:
        r3 = r12.mo13507j();
        r21 = r4;
        r4 = new android.content.ContentValues();
        r4.put(com.xiaomi.mipush.sdk.Constants.APP_ID, r2);
        r4.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0239, code lost:
        if (r12.mo13478M() == false) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x023b, code lost:
        r8 = java.lang.Integer.valueOf(r12.mo13481y());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0244, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0245, code lost:
        r4.put("filter_id", r8);
        r4.put("event_name", r12.mo13472E());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0255, code lost:
        if (r12.mo13479N() == false) goto L_0x0260;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0257, code lost:
        r8 = java.lang.Boolean.valueOf(r12.mo13476K());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0260, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0261, code lost:
        r4.put("session_scoped", r8);
        r4.put(com.miot.bluetooth.channel.packet.Packet.DATA, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0275, code lost:
        if (mo14320P().insertWithOnConflict("event_filters", (java.lang.String) null, r4, 5) != -1) goto L_0x028a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0277, code lost:
        r9.f2143a.mo14228b().mo14035r().mo14694b("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.C1574c4.m4083z(r24));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x028a, code lost:
        r3 = r25;
        r4 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02a1, code lost:
        r3.mo14695c(r4, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02a6, code lost:
        r21 = r4;
        r0 = r0.mo13423F().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02b4, code lost:
        if (r0.hasNext() == false) goto L_0x03b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02b6, code lost:
        r3 = (com.google.android.gms.internal.measurement.C1105g3) r0.next();
        mo14128i();
        mo14009h();
        com.google.android.gms.common.internal.C0917i.m1415f(r24);
        com.google.android.gms.common.internal.C0917i.m1419j(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02d0, code lost:
        if (r3.mo12801C().isEmpty() == false) goto L_0x02ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02d2, code lost:
        r0 = r9.f2143a.mo14228b().mo14040w();
        r7 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r24);
        r8 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02ea, code lost:
        if (r3.mo12805H() == false) goto L_0x02f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02ec, code lost:
        r3 = java.lang.Integer.valueOf(r3.mo12807x());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02f5, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02f6, code lost:
        r0.mo14696d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r7, r8, java.lang.String.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02ff, code lost:
        r4 = r3.mo13507j();
        r11 = new android.content.ContentValues();
        r11.put(com.xiaomi.mipush.sdk.Constants.APP_ID, r2);
        r11.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0316, code lost:
        if (r3.mo12805H() == false) goto L_0x0321;
     */
    @androidx.annotation.WorkerThread
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14339n(java.lang.String r24, java.util.List r25) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            r3 = r25
            java.lang.String r4 = "app_id=? and audience_id=?"
            java.lang.String r0 = "app_id=?"
            java.lang.String r5 = "event_filters"
            java.lang.String r6 = "property_filters"
            com.google.android.gms.common.internal.C0917i.m1419j(r25)
            r8 = 0
        L_0x0012:
            int r9 = r25.size()
            if (r8 >= r9) goto L_0x00e9
            java.lang.Object r9 = r3.get(r8)
            com.google.android.gms.internal.measurement.v2 r9 = (com.google.android.gms.internal.measurement.C1342v2) r9
            com.google.android.gms.internal.measurement.g8 r9 = r9.mo12916l()
            com.google.android.gms.internal.measurement.u2 r9 = (com.google.android.gms.internal.measurement.C1327u2) r9
            int r11 = r9.mo13392t()
            if (r11 == 0) goto L_0x00a6
            r12 = r9
            r11 = 0
        L_0x002c:
            int r13 = r12.mo13392t()
            if (r11 >= r13) goto L_0x00a3
            com.google.android.gms.internal.measurement.x2 r13 = r12.mo13396y(r11)
            com.google.android.gms.internal.measurement.g8 r13 = r13.mo12916l()
            com.google.android.gms.internal.measurement.w2 r13 = (com.google.android.gms.internal.measurement.C1357w2) r13
            com.google.android.gms.internal.measurement.g8 r14 = r13.clone()
            com.google.android.gms.internal.measurement.w2 r14 = (com.google.android.gms.internal.measurement.C1357w2) r14
            java.lang.String r15 = r13.mo13444y()
            java.lang.String r15 = com.google.android.gms.measurement.internal.C1693l6.m4467b(r15)
            if (r15 == 0) goto L_0x0051
            r14.mo13441u(r15)
            r15 = 1
            goto L_0x0052
        L_0x0051:
            r15 = 0
        L_0x0052:
            r7 = 0
        L_0x0053:
            int r10 = r13.mo13440t()
            if (r7 >= r10) goto L_0x008b
            com.google.android.gms.internal.measurement.z2 r10 = r13.mo13443x(r7)
            r16 = r13
            java.lang.String r13 = r10.mo13514C()
            r17 = r4
            java.lang.String[] r4 = com.google.android.gms.measurement.internal.C1706m6.f2303a
            java.lang.String[] r1 = com.google.android.gms.measurement.internal.C1706m6.f2304b
            java.lang.String r1 = com.google.android.gms.measurement.internal.C1863z7.m4907a(r13, r4, r1)
            if (r1 == 0) goto L_0x0082
            com.google.android.gms.internal.measurement.g8 r4 = r10.mo12916l()
            com.google.android.gms.internal.measurement.y2 r4 = (com.google.android.gms.internal.measurement.C1387y2) r4
            r4.mo13504t(r1)
            com.google.android.gms.internal.measurement.k8 r1 = r4.mo12838q()
            com.google.android.gms.internal.measurement.z2 r1 = (com.google.android.gms.internal.measurement.C1402z2) r1
            r14.mo13442w(r7, r1)
            r15 = 1
        L_0x0082:
            int r7 = r7 + 1
            r1 = r23
            r13 = r16
            r4 = r17
            goto L_0x0053
        L_0x008b:
            r17 = r4
            if (r15 == 0) goto L_0x009c
            r12.mo13394w(r11, r14)
            com.google.android.gms.internal.measurement.k8 r1 = r9.mo12838q()
            com.google.android.gms.internal.measurement.v2 r1 = (com.google.android.gms.internal.measurement.C1342v2) r1
            r3.set(r8, r1)
            r12 = r9
        L_0x009c:
            int r11 = r11 + 1
            r1 = r23
            r4 = r17
            goto L_0x002c
        L_0x00a3:
            r17 = r4
            goto L_0x00a9
        L_0x00a6:
            r17 = r4
            r12 = r9
        L_0x00a9:
            int r1 = r12.mo13393u()
            if (r1 == 0) goto L_0x00e1
            r1 = 0
        L_0x00b0:
            int r4 = r12.mo13393u()
            if (r1 >= r4) goto L_0x00e1
            com.google.android.gms.internal.measurement.g3 r4 = r12.mo13391C(r1)
            java.lang.String r7 = r4.mo12801C()
            java.lang.String[] r10 = com.google.android.gms.measurement.internal.C1718n6.f2367a
            java.lang.String[] r11 = com.google.android.gms.measurement.internal.C1718n6.f2368b
            java.lang.String r7 = com.google.android.gms.measurement.internal.C1863z7.m4907a(r7, r10, r11)
            if (r7 == 0) goto L_0x00de
            com.google.android.gms.internal.measurement.g8 r4 = r4.mo12916l()
            com.google.android.gms.internal.measurement.f3 r4 = (com.google.android.gms.internal.measurement.C1089f3) r4
            r4.mo12782t(r7)
            r12.mo13395x(r1, r4)
            com.google.android.gms.internal.measurement.k8 r4 = r9.mo12838q()
            com.google.android.gms.internal.measurement.v2 r4 = (com.google.android.gms.internal.measurement.C1342v2) r4
            r3.set(r8, r4)
            r12 = r9
        L_0x00de:
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00e1:
            int r8 = r8 + 1
            r1 = r23
            r4 = r17
            goto L_0x0012
        L_0x00e9:
            r17 = r4
            r23.mo14128i()
            r23.mo14009h()
            com.google.android.gms.common.internal.C0917i.m1415f(r24)
            com.google.android.gms.common.internal.C0917i.m1419j(r25)
            android.database.sqlite.SQLiteDatabase r1 = r23.mo14320P()
            r1.beginTransaction()
            r23.mo14128i()     // Catch:{ all -> 0x04a5 }
            r23.mo14009h()     // Catch:{ all -> 0x04a5 }
            com.google.android.gms.common.internal.C0917i.m1415f(r24)     // Catch:{ all -> 0x04a5 }
            android.database.sqlite.SQLiteDatabase r4 = r23.mo14320P()     // Catch:{ all -> 0x04a5 }
            r7 = 1
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch:{ all -> 0x04a5 }
            r9 = 0
            r8[r9] = r2     // Catch:{ all -> 0x04a5 }
            r4.delete(r6, r0, r8)     // Catch:{ all -> 0x04a5 }
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch:{ all -> 0x04a5 }
            r8[r9] = r2     // Catch:{ all -> 0x04a5 }
            r4.delete(r5, r0, r8)     // Catch:{ all -> 0x04a5 }
            java.util.Iterator r4 = r25.iterator()     // Catch:{ all -> 0x04a5 }
        L_0x011f:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x04a5 }
            if (r0 == 0) goto L_0x03be
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x04a5 }
            com.google.android.gms.internal.measurement.v2 r0 = (com.google.android.gms.internal.measurement.C1342v2) r0     // Catch:{ all -> 0x04a5 }
            r23.mo14128i()     // Catch:{ all -> 0x04a5 }
            r23.mo14009h()     // Catch:{ all -> 0x04a5 }
            com.google.android.gms.common.internal.C0917i.m1415f(r24)     // Catch:{ all -> 0x04a5 }
            com.google.android.gms.common.internal.C0917i.m1419j(r0)     // Catch:{ all -> 0x04a5 }
            boolean r9 = r0.mo13424I()     // Catch:{ all -> 0x04a5 }
            if (r9 != 0) goto L_0x0153
            r9 = r23
            com.google.android.gms.measurement.internal.n5 r0 = r9.f2143a     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14040w()     // Catch:{ all -> 0x04a3 }
            java.lang.String r7 = "Audience with no ID. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r24)     // Catch:{ all -> 0x04a3 }
            r0.mo14694b(r7, r8)     // Catch:{ all -> 0x04a3 }
            goto L_0x011f
        L_0x0153:
            r9 = r23
            int r10 = r0.mo13425x()     // Catch:{ all -> 0x04a3 }
            java.util.List r11 = r0.mo13422E()     // Catch:{ all -> 0x04a3 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x04a3 }
        L_0x0161:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x04a3 }
            if (r12 == 0) goto L_0x018b
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.internal.measurement.x2 r12 = (com.google.android.gms.internal.measurement.C1372x2) r12     // Catch:{ all -> 0x04a3 }
            boolean r12 = r12.mo13478M()     // Catch:{ all -> 0x04a3 }
            if (r12 != 0) goto L_0x0161
            com.google.android.gms.measurement.internal.n5 r0 = r9.f2143a     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14040w()     // Catch:{ all -> 0x04a3 }
            java.lang.String r7 = "Event filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r24)     // Catch:{ all -> 0x04a3 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04a3 }
        L_0x0187:
            r0.mo14695c(r7, r8, r10)     // Catch:{ all -> 0x04a3 }
            goto L_0x011f
        L_0x018b:
            java.util.List r11 = r0.mo13423F()     // Catch:{ all -> 0x04a3 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x04a3 }
        L_0x0193:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x04a3 }
            if (r12 == 0) goto L_0x01ba
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.internal.measurement.g3 r12 = (com.google.android.gms.internal.measurement.C1105g3) r12     // Catch:{ all -> 0x04a3 }
            boolean r12 = r12.mo12805H()     // Catch:{ all -> 0x04a3 }
            if (r12 != 0) goto L_0x0193
            com.google.android.gms.measurement.internal.n5 r0 = r9.f2143a     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14040w()     // Catch:{ all -> 0x04a3 }
            java.lang.String r7 = "Property filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r24)     // Catch:{ all -> 0x04a3 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04a3 }
            goto L_0x0187
        L_0x01ba:
            java.util.List r11 = r0.mo13422E()     // Catch:{ all -> 0x04a3 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x04a3 }
        L_0x01c2:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x04a3 }
            java.lang.String r7 = "data"
            java.lang.String r13 = "session_scoped"
            java.lang.String r14 = "filter_id"
            java.lang.String r8 = "audience_id"
            java.lang.String r15 = "app_id"
            if (r12 == 0) goto L_0x02a6
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.internal.measurement.x2 r12 = (com.google.android.gms.internal.measurement.C1372x2) r12     // Catch:{ all -> 0x04a3 }
            r23.mo14128i()     // Catch:{ all -> 0x04a3 }
            r23.mo14009h()     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.common.internal.C0917i.m1415f(r24)     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.common.internal.C0917i.m1419j(r12)     // Catch:{ all -> 0x04a3 }
            java.lang.String r21 = r12.mo13472E()     // Catch:{ all -> 0x04a3 }
            boolean r21 = r21.isEmpty()     // Catch:{ all -> 0x04a3 }
            if (r21 == 0) goto L_0x0220
            com.google.android.gms.measurement.internal.n5 r0 = r9.f2143a     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14040w()     // Catch:{ all -> 0x04a3 }
            java.lang.String r7 = "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r24)     // Catch:{ all -> 0x04a3 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04a3 }
            boolean r13 = r12.mo13478M()     // Catch:{ all -> 0x04a3 }
            if (r13 == 0) goto L_0x0213
            int r12 = r12.mo13481y()     // Catch:{ all -> 0x04a3 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x04a3 }
            r20 = r12
            goto L_0x0215
        L_0x0213:
            r20 = 0
        L_0x0215:
            java.lang.String r12 = java.lang.String.valueOf(r20)     // Catch:{ all -> 0x04a3 }
            r0.mo14696d(r7, r8, r11, r12)     // Catch:{ all -> 0x04a3 }
            r21 = r4
            goto L_0x0381
        L_0x0220:
            byte[] r3 = r12.mo13507j()     // Catch:{ all -> 0x04a3 }
            r21 = r4
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x04a3 }
            r4.<init>()     // Catch:{ all -> 0x04a3 }
            r4.put(r15, r2)     // Catch:{ all -> 0x04a3 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04a3 }
            r4.put(r8, r15)     // Catch:{ all -> 0x04a3 }
            boolean r8 = r12.mo13478M()     // Catch:{ all -> 0x04a3 }
            if (r8 == 0) goto L_0x0244
            int r8 = r12.mo13481y()     // Catch:{ all -> 0x04a3 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x04a3 }
            goto L_0x0245
        L_0x0244:
            r8 = 0
        L_0x0245:
            r4.put(r14, r8)     // Catch:{ all -> 0x04a3 }
            java.lang.String r8 = "event_name"
            java.lang.String r14 = r12.mo13472E()     // Catch:{ all -> 0x04a3 }
            r4.put(r8, r14)     // Catch:{ all -> 0x04a3 }
            boolean r8 = r12.mo13479N()     // Catch:{ all -> 0x04a3 }
            if (r8 == 0) goto L_0x0260
            boolean r8 = r12.mo13476K()     // Catch:{ all -> 0x04a3 }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x04a3 }
            goto L_0x0261
        L_0x0260:
            r8 = 0
        L_0x0261:
            r4.put(r13, r8)     // Catch:{ all -> 0x04a3 }
            r4.put(r7, r3)     // Catch:{ all -> 0x04a3 }
            android.database.sqlite.SQLiteDatabase r3 = r23.mo14320P()     // Catch:{ SQLiteException -> 0x0290 }
            r7 = 5
            r8 = 0
            long r3 = r3.insertWithOnConflict(r5, r8, r4, r7)     // Catch:{ SQLiteException -> 0x0290 }
            r7 = -1
            int r12 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r12 != 0) goto L_0x028a
            com.google.android.gms.measurement.internal.n5 r3 = r9.f2143a     // Catch:{ SQLiteException -> 0x0290 }
            com.google.android.gms.measurement.internal.c4 r3 = r3.mo14228b()     // Catch:{ SQLiteException -> 0x0290 }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo14035r()     // Catch:{ SQLiteException -> 0x0290 }
            java.lang.String r4 = "Failed to insert event filter (got -1). appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r24)     // Catch:{ SQLiteException -> 0x0290 }
            r3.mo14694b(r4, r7)     // Catch:{ SQLiteException -> 0x0290 }
        L_0x028a:
            r3 = r25
            r4 = r21
            goto L_0x01c2
        L_0x0290:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n5 r3 = r9.f2143a     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.c4 r3 = r3.mo14228b()     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo14035r()     // Catch:{ all -> 0x04a3 }
            java.lang.String r4 = "Error storing event filter. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r24)     // Catch:{ all -> 0x04a3 }
        L_0x02a1:
            r3.mo14695c(r4, r7, r0)     // Catch:{ all -> 0x04a3 }
            goto L_0x0381
        L_0x02a6:
            r21 = r4
            java.util.List r0 = r0.mo13423F()     // Catch:{ all -> 0x04a3 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x04a3 }
        L_0x02b0:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x04a3 }
            if (r3 == 0) goto L_0x03b8
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.internal.measurement.g3 r3 = (com.google.android.gms.internal.measurement.C1105g3) r3     // Catch:{ all -> 0x04a3 }
            r23.mo14128i()     // Catch:{ all -> 0x04a3 }
            r23.mo14009h()     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.common.internal.C0917i.m1415f(r24)     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.common.internal.C0917i.m1419j(r3)     // Catch:{ all -> 0x04a3 }
            java.lang.String r4 = r3.mo12801C()     // Catch:{ all -> 0x04a3 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x04a3 }
            if (r4 == 0) goto L_0x02ff
            com.google.android.gms.measurement.internal.n5 r0 = r9.f2143a     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14040w()     // Catch:{ all -> 0x04a3 }
            java.lang.String r4 = "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r24)     // Catch:{ all -> 0x04a3 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04a3 }
            boolean r11 = r3.mo12805H()     // Catch:{ all -> 0x04a3 }
            if (r11 == 0) goto L_0x02f5
            int r3 = r3.mo12807x()     // Catch:{ all -> 0x04a3 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x04a3 }
            goto L_0x02f6
        L_0x02f5:
            r3 = 0
        L_0x02f6:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x04a3 }
            r0.mo14696d(r4, r7, r8, r3)     // Catch:{ all -> 0x04a3 }
            goto L_0x0381
        L_0x02ff:
            byte[] r4 = r3.mo13507j()     // Catch:{ all -> 0x04a3 }
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x04a3 }
            r11.<init>()     // Catch:{ all -> 0x04a3 }
            r11.put(r15, r2)     // Catch:{ all -> 0x04a3 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x04a3 }
            r11.put(r8, r12)     // Catch:{ all -> 0x04a3 }
            boolean r12 = r3.mo12805H()     // Catch:{ all -> 0x04a3 }
            if (r12 == 0) goto L_0x0321
            int r12 = r3.mo12807x()     // Catch:{ all -> 0x04a3 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x04a3 }
            goto L_0x0322
        L_0x0321:
            r12 = 0
        L_0x0322:
            r11.put(r14, r12)     // Catch:{ all -> 0x04a3 }
            java.lang.String r12 = "property_name"
            r22 = r0
            java.lang.String r0 = r3.mo12801C()     // Catch:{ all -> 0x04a3 }
            r11.put(r12, r0)     // Catch:{ all -> 0x04a3 }
            boolean r0 = r3.mo12806I()     // Catch:{ all -> 0x04a3 }
            if (r0 == 0) goto L_0x033f
            boolean r0 = r3.mo12804G()     // Catch:{ all -> 0x04a3 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x04a3 }
            goto L_0x0340
        L_0x033f:
            r0 = 0
        L_0x0340:
            r11.put(r13, r0)     // Catch:{ all -> 0x04a3 }
            r11.put(r7, r4)     // Catch:{ all -> 0x04a3 }
            android.database.sqlite.SQLiteDatabase r0 = r23.mo14320P()     // Catch:{ SQLiteException -> 0x036e }
            r3 = 0
            r4 = 5
            long r11 = r0.insertWithOnConflict(r6, r3, r11, r4)     // Catch:{ SQLiteException -> 0x036e }
            r18 = -1
            int r0 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x036a
            com.google.android.gms.measurement.internal.n5 r0 = r9.f2143a     // Catch:{ SQLiteException -> 0x036e }
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()     // Catch:{ SQLiteException -> 0x036e }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14035r()     // Catch:{ SQLiteException -> 0x036e }
            java.lang.String r3 = "Failed to insert property filter (got -1). appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r24)     // Catch:{ SQLiteException -> 0x036e }
            r0.mo14694b(r3, r4)     // Catch:{ SQLiteException -> 0x036e }
            goto L_0x0381
        L_0x036a:
            r0 = r22
            goto L_0x02b0
        L_0x036e:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n5 r3 = r9.f2143a     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.c4 r3 = r3.mo14228b()     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo14035r()     // Catch:{ all -> 0x04a3 }
            java.lang.String r4 = "Error storing property filter. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r24)     // Catch:{ all -> 0x04a3 }
            goto L_0x02a1
        L_0x0381:
            r23.mo14128i()     // Catch:{ all -> 0x04a3 }
            r23.mo14009h()     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.common.internal.C0917i.m1415f(r24)     // Catch:{ all -> 0x04a3 }
            android.database.sqlite.SQLiteDatabase r0 = r23.mo14320P()     // Catch:{ all -> 0x04a3 }
            r3 = 2
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ all -> 0x04a3 }
            r3 = 0
            r4[r3] = r2     // Catch:{ all -> 0x04a3 }
            java.lang.String r3 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x04a3 }
            r7 = 1
            r4[r7] = r3     // Catch:{ all -> 0x04a3 }
            r3 = r17
            r0.delete(r6, r3, r4)     // Catch:{ all -> 0x04a3 }
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x04a3 }
            r7 = 0
            r4[r7] = r2     // Catch:{ all -> 0x04a3 }
            java.lang.String r7 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x04a3 }
            r8 = 1
            r4[r8] = r7     // Catch:{ all -> 0x04a3 }
            r0.delete(r5, r3, r4)     // Catch:{ all -> 0x04a3 }
            r17 = r3
            r4 = r21
            r3 = r25
            goto L_0x011f
        L_0x03b8:
            r3 = r25
            r4 = r21
            goto L_0x011f
        L_0x03be:
            r3 = 0
            r9 = r23
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x04a3 }
            r0.<init>()     // Catch:{ all -> 0x04a3 }
            java.util.Iterator r4 = r25.iterator()     // Catch:{ all -> 0x04a3 }
        L_0x03ca:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x04a3 }
            if (r5 == 0) goto L_0x03ea
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.internal.measurement.v2 r5 = (com.google.android.gms.internal.measurement.C1342v2) r5     // Catch:{ all -> 0x04a3 }
            boolean r6 = r5.mo13424I()     // Catch:{ all -> 0x04a3 }
            if (r6 == 0) goto L_0x03e5
            int r5 = r5.mo13425x()     // Catch:{ all -> 0x04a3 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x04a3 }
            goto L_0x03e6
        L_0x03e5:
            r8 = r3
        L_0x03e6:
            r0.add(r8)     // Catch:{ all -> 0x04a3 }
            goto L_0x03ca
        L_0x03ea:
            com.google.android.gms.common.internal.C0917i.m1415f(r24)     // Catch:{ all -> 0x04a3 }
            r23.mo14128i()     // Catch:{ all -> 0x04a3 }
            r23.mo14009h()     // Catch:{ all -> 0x04a3 }
            android.database.sqlite.SQLiteDatabase r3 = r23.mo14320P()     // Catch:{ all -> 0x04a3 }
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0488 }
            r4 = 0
            r5[r4] = r2     // Catch:{ SQLiteException -> 0x0488 }
            java.lang.String r4 = "select count(1) from audience_filter_values where app_id=?"
            long r4 = r9.m4422I(r4, r5)     // Catch:{ SQLiteException -> 0x0488 }
            com.google.android.gms.measurement.internal.n5 r6 = r9.f2143a     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.g r6 = r6.mo14402z()     // Catch:{ all -> 0x04a3 }
            r7 = 2000(0x7d0, float:2.803E-42)
            com.google.android.gms.measurement.internal.n3 r8 = com.google.android.gms.measurement.internal.C1727o3.f2400F     // Catch:{ all -> 0x04a3 }
            int r6 = r6.mo14174o(r2, r8)     // Catch:{ all -> 0x04a3 }
            int r6 = java.lang.Math.min(r7, r6)     // Catch:{ all -> 0x04a3 }
            r7 = 0
            int r6 = java.lang.Math.max(r7, r6)     // Catch:{ all -> 0x04a3 }
            long r7 = (long) r6     // Catch:{ all -> 0x04a3 }
            int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r10 > 0) goto L_0x0421
            goto L_0x049c
        L_0x0421:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x04a3 }
            r4.<init>()     // Catch:{ all -> 0x04a3 }
            r5 = 0
        L_0x0427:
            int r7 = r0.size()     // Catch:{ all -> 0x04a3 }
            if (r5 >= r7) goto L_0x0443
            java.lang.Object r7 = r0.get(r5)     // Catch:{ all -> 0x04a3 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x04a3 }
            if (r7 == 0) goto L_0x049c
            int r7 = r7.intValue()     // Catch:{ all -> 0x04a3 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x04a3 }
            r4.add(r7)     // Catch:{ all -> 0x04a3 }
            int r5 = r5 + 1
            goto L_0x0427
        L_0x0443:
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r4)     // Catch:{ all -> 0x04a3 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x04a3 }
            r4.<init>()     // Catch:{ all -> 0x04a3 }
            java.lang.String r5 = "("
            r4.append(r5)     // Catch:{ all -> 0x04a3 }
            r4.append(r0)     // Catch:{ all -> 0x04a3 }
            java.lang.String r0 = ")"
            r4.append(r0)     // Catch:{ all -> 0x04a3 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x04a3 }
            r0.<init>()     // Catch:{ all -> 0x04a3 }
            java.lang.String r5 = "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in "
            r0.append(r5)     // Catch:{ all -> 0x04a3 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x04a3 }
            r0.append(r4)     // Catch:{ all -> 0x04a3 }
            java.lang.String r4 = " order by rowid desc limit -1 offset ?)"
            r0.append(r4)     // Catch:{ all -> 0x04a3 }
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x04a3 }
            r5 = 0
            r4[r5] = r2     // Catch:{ all -> 0x04a3 }
            java.lang.String r2 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x04a3 }
            r5 = 1
            r4[r5] = r2     // Catch:{ all -> 0x04a3 }
            java.lang.String r2 = "audience_filter_values"
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x04a3 }
            r3.delete(r2, r0, r4)     // Catch:{ all -> 0x04a3 }
            goto L_0x049c
        L_0x0488:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n5 r3 = r9.f2143a     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.c4 r3 = r3.mo14228b()     // Catch:{ all -> 0x04a3 }
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo14035r()     // Catch:{ all -> 0x04a3 }
            java.lang.String r4 = "Database error querying filters. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r24)     // Catch:{ all -> 0x04a3 }
            r3.mo14695c(r4, r2, r0)     // Catch:{ all -> 0x04a3 }
        L_0x049c:
            r1.setTransactionSuccessful()     // Catch:{ all -> 0x04a3 }
            r1.endTransaction()
            return
        L_0x04a3:
            r0 = move-exception
            goto L_0x04a8
        L_0x04a5:
            r0 = move-exception
            r9 = r23
        L_0x04a8:
            r1.endTransaction()
            goto L_0x04ad
        L_0x04ac:
            throw r0
        L_0x04ad:
            goto L_0x04ac
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1686l.mo14339n(java.lang.String, java.util.List):void");
    }

    @WorkerThread
    /* renamed from: o */
    public final void mo14340o() {
        mo14128i();
        mo14320P().setTransactionSuccessful();
    }

    @WorkerThread
    /* renamed from: p */
    public final void mo14341p(C1589d6 d6Var) {
        C0917i.m1419j(d6Var);
        mo14009h();
        mo14128i();
        String e0 = d6Var.mo14089e0();
        C0917i.m1419j(e0);
        ContentValues contentValues = new ContentValues();
        contentValues.put(Constants.APP_ID, e0);
        contentValues.put("app_instance_id", d6Var.mo14091f0());
        contentValues.put("gmp_app_id", d6Var.mo14099j0());
        contentValues.put("resettable_device_id_hash", d6Var.mo14080a());
        contentValues.put("last_bundle_index", Long.valueOf(d6Var.mo14079Z()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(d6Var.mo14081a0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(d6Var.mo14078Y()));
        contentValues.put(Constants.EXTRA_KEY_APP_VERSION, d6Var.mo14095h0());
        contentValues.put("app_store", d6Var.mo14093g0());
        contentValues.put("gmp_version", Long.valueOf(d6Var.mo14077X()));
        contentValues.put("dev_cert_hash", Long.valueOf(d6Var.mo14074U()));
        contentValues.put("measurement_enabled", Boolean.valueOf(d6Var.mo14064K()));
        contentValues.put("day", Long.valueOf(d6Var.mo14073T()));
        contentValues.put("daily_public_events_count", Long.valueOf(d6Var.mo14071R()));
        contentValues.put("daily_events_count", Long.valueOf(d6Var.mo14070Q()));
        contentValues.put("daily_conversions_count", Long.valueOf(d6Var.mo14068O()));
        contentValues.put("config_fetched_time", Long.valueOf(d6Var.mo14067N()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(d6Var.mo14076W()));
        contentValues.put("app_version_int", Long.valueOf(d6Var.mo14066M()));
        contentValues.put("firebase_instance_id", d6Var.mo14097i0());
        contentValues.put("daily_error_events_count", Long.valueOf(d6Var.mo14069P()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(d6Var.mo14072S()));
        contentValues.put("health_monitor_sample", d6Var.mo14101k0());
        contentValues.put("android_id", Long.valueOf(d6Var.mo14054A()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(d6Var.mo14063J()));
        contentValues.put("admob_app_id", d6Var.mo14085c0());
        contentValues.put("dynamite_version", Long.valueOf(d6Var.mo14075V()));
        contentValues.put("session_stitching_token", d6Var.mo14082b());
        List c = d6Var.mo14084c();
        if (c != null) {
            if (c.isEmpty()) {
                this.f2143a.mo14228b().mo14040w().mo14694b("Safelisted events should not be an empty list. appId", e0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, c));
            }
        }
        C1411zb.m3413b();
        if (this.f2143a.mo14402z().mo14163B((String) null, C1727o3.f2474w0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase P = mo14320P();
            if (((long) P.update("apps", contentValues, "app_id = ?", new String[]{e0})) == 0 && P.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                this.f2143a.mo14228b().mo14035r().mo14694b("Failed to insert/update app (got -1). appId", C1574c4.m4083z(e0));
            }
        } catch (SQLiteException e) {
            this.f2143a.mo14228b().mo14035r().mo14695c("Error storing app. appId", C1574c4.m4083z(e0), e);
        }
    }

    @WorkerThread
    /* renamed from: q */
    public final void mo14342q(C1759r rVar) {
        C0917i.m1419j(rVar);
        mo14009h();
        mo14128i();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Constants.APP_ID, rVar.f2546a);
        contentValues.put("name", rVar.f2547b);
        contentValues.put("lifetime_count", Long.valueOf(rVar.f2548c));
        contentValues.put("current_bundle_count", Long.valueOf(rVar.f2549d));
        contentValues.put("last_fire_timestamp", Long.valueOf(rVar.f2551f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(rVar.f2552g));
        contentValues.put("last_bundled_day", rVar.f2553h);
        contentValues.put("last_sampled_complex_event_id", rVar.f2554i);
        contentValues.put("last_sampling_rate", rVar.f2555j);
        contentValues.put("current_session_count", Long.valueOf(rVar.f2550e));
        Boolean bool = rVar.f2556k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (mo14320P().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                this.f2143a.mo14228b().mo14035r().mo14694b("Failed to insert/update event aggregates (got -1). appId", C1574c4.m4083z(rVar.f2546a));
            }
        } catch (SQLiteException e) {
            this.f2143a.mo14228b().mo14035r().mo14695c("Error storing event aggregates. appId", C1574c4.m4083z(rVar.f2546a), e);
        }
    }

    /* renamed from: r */
    public final boolean mo14343r() {
        return m4422I("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    /* renamed from: s */
    public final boolean mo14344s() {
        return m4422I("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    /* renamed from: t */
    public final boolean mo14345t() {
        return m4422I("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    /* renamed from: u */
    public final boolean mo14346u() {
        Context f = this.f2143a.mo14231f();
        this.f2143a.mo14402z();
        return f.getDatabasePath("google_app_measurement.db").exists();
    }

    /* renamed from: v */
    public final boolean mo14347v(String str, Long l, long j, C1122h4 h4Var) {
        mo14009h();
        mo14128i();
        C0917i.m1419j(h4Var);
        C0917i.m1415f(str);
        C0917i.m1419j(l);
        byte[] j2 = h4Var.mo13507j();
        this.f2143a.mo14228b().mo14039v().mo14695c("Saving complex main event, appId, data size", this.f2143a.mo14373D().mo14617d(str), Integer.valueOf(j2.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(Constants.APP_ID, str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", j2);
        try {
            if (mo14320P().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            this.f2143a.mo14228b().mo14035r().mo14694b("Failed to insert complex main event (got -1). appId", C1574c4.m4083z(str));
            return false;
        } catch (SQLiteException e) {
            this.f2143a.mo14228b().mo14035r().mo14695c("Error storing complex main event. appId", C1574c4.m4083z(str), e);
            return false;
        }
    }

    @WorkerThread
    /* renamed from: w */
    public final boolean mo14348w(zzac zzac) {
        C0917i.m1419j(zzac);
        mo14009h();
        mo14128i();
        String str = zzac.f2843a;
        C0917i.m1419j(str);
        if (mo14327X(str, zzac.f2845c.f2860b) == null) {
            long I = m4422I("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f2143a.mo14402z();
            if (I >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(Constants.APP_ID, str);
        contentValues.put("origin", zzac.f2844b);
        contentValues.put("name", zzac.f2845c.f2860b);
        m4421H(contentValues, "value", C0917i.m1419j(zzac.f2845c.mo14714V()));
        contentValues.put("active", Boolean.valueOf(zzac.f2847e));
        contentValues.put("trigger_event_name", zzac.f2848f);
        contentValues.put("trigger_timeout", Long.valueOf(zzac.f2850h));
        contentValues.put("timed_out_event", this.f2143a.mo14382N().mo14667c0(zzac.f2849g));
        contentValues.put("creation_timestamp", Long.valueOf(zzac.f2846d));
        contentValues.put("triggered_event", this.f2143a.mo14382N().mo14667c0(zzac.f2851i));
        contentValues.put("triggered_timestamp", Long.valueOf(zzac.f2845c.f2861c));
        contentValues.put("time_to_live", Long.valueOf(zzac.f2852j));
        contentValues.put("expired_event", this.f2143a.mo14382N().mo14667c0(zzac.f2853k));
        try {
            if (mo14320P().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                this.f2143a.mo14228b().mo14035r().mo14694b("Failed to insert/update conditional user property (got -1)", C1574c4.m4083z(str));
            }
        } catch (SQLiteException e) {
            this.f2143a.mo14228b().mo14035r().mo14695c("Error storing conditional user property", C1574c4.m4083z(str), e);
        }
        return true;
    }

    @WorkerThread
    /* renamed from: x */
    public final boolean mo14349x(C1818va vaVar) {
        C0917i.m1419j(vaVar);
        mo14009h();
        mo14128i();
        if (mo14327X(vaVar.f2730a, vaVar.f2732c) == null) {
            if (C1854ya.m4832X(vaVar.f2732c)) {
                if (m4422I("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{vaVar.f2730a}) >= ((long) this.f2143a.mo14402z().mo14175p(vaVar.f2730a, C1727o3.f2402G, 25, 100))) {
                    return false;
                }
            } else if (!"_npa".equals(vaVar.f2732c)) {
                long I = m4422I("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{vaVar.f2730a, vaVar.f2731b});
                this.f2143a.mo14402z();
                if (I >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(Constants.APP_ID, vaVar.f2730a);
        contentValues.put("origin", vaVar.f2731b);
        contentValues.put("name", vaVar.f2732c);
        contentValues.put("set_timestamp", Long.valueOf(vaVar.f2733d));
        m4421H(contentValues, "value", vaVar.f2734e);
        try {
            if (mo14320P().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                this.f2143a.mo14228b().mo14035r().mo14694b("Failed to insert/update user property (got -1). appId", C1574c4.m4083z(vaVar.f2730a));
            }
        } catch (SQLiteException e) {
            this.f2143a.mo14228b().mo14035r().mo14695c("Error storing user property. appId", C1574c4.m4083z(vaVar.f2730a), e);
        }
        return true;
    }
}

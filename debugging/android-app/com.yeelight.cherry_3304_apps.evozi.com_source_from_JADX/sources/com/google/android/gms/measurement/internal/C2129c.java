package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.C1760e0;
import com.google.android.gms.internal.measurement.C1775f0;
import com.google.android.gms.internal.measurement.C1790g0;
import com.google.android.gms.internal.measurement.C1821i0;
import com.google.android.gms.internal.measurement.C1832ia;
import com.google.android.gms.internal.measurement.C1889m4;
import com.google.android.gms.internal.measurement.C1994t0;
import com.google.android.gms.internal.measurement.C2024v0;
import com.google.android.gms.internal.measurement.C2056x0;
import com.miot.bluetooth.channel.packet.Packet;
import com.miot.service.connection.wifi.step.SmartConfigStep;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.c */
final class C2129c extends C2211i9 {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String[] f3981f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String[] f3982g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final String[] f3983h = {Constants.EXTRA_KEY_APP_VERSION, "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"};
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final String[] f3984i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final String[] f3985j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final String[] f3986k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final String[] f3987l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final String[] f3988m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d */
    private final C2189h f3989d = new C2189h(this, mo12428c(), "google_app_measurement.db");
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2151d9 f3990e = new C2151d9(mo12429f());

    C2129c(C2245l9 l9Var) {
        super(l9Var);
    }

    @WorkerThread
    @VisibleForTesting
    /* renamed from: E */
    private final Object m6804E(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            mo12427b().mo13096F().mo13130a("Loaded invalid null value from database");
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
                mo12427b().mo13096F().mo13131b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                return null;
            }
            mo12427b().mo13096F().mo13130a("Loaded invalid blob type value, ignoring it");
            return null;
        }
    }

    @WorkerThread
    /* renamed from: L */
    private static void m6805L(ContentValues contentValues, String str, Object obj) {
        C1609u.m4471g(str);
        C1609u.m4475k(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    @WorkerThread
    /* renamed from: U */
    private final boolean m6806U(String str, int i, C1775f0 f0Var) {
        mo12749r();
        mo12567h();
        C1609u.m4471g(str);
        C1609u.m4475k(f0Var);
        Integer num = null;
        if (TextUtils.isEmpty(f0Var.mo11621G())) {
            C2383y3 J = mo12427b().mo13099J();
            Object w = C2361w3.m7696w(str);
            Integer valueOf = Integer.valueOf(i);
            if (f0Var.mo11619E()) {
                num = Integer.valueOf(f0Var.mo11620F());
            }
            J.mo13133d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", w, valueOf, String.valueOf(num));
            return false;
        }
        byte[] h = f0Var.mo12168h();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Constants.APP_ID, str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", f0Var.mo11619E() ? Integer.valueOf(f0Var.mo11620F()) : null);
        contentValues.put("event_name", f0Var.mo11621G());
        contentValues.put("session_scoped", f0Var.mo11628P() ? Boolean.valueOf(f0Var.mo11629Q()) : null);
        contentValues.put(Packet.DATA, h);
        try {
            if (mo12525v().insertWithOnConflict("event_filters", (String) null, contentValues, 5) != -1) {
                return true;
            }
            mo12427b().mo13096F().mo13131b("Failed to insert event filter (got -1). appId", C2361w3.m7696w(str));
            return true;
        } catch (SQLiteException e) {
            mo12427b().mo13096F().mo13132c("Error storing event filter. appId", C2361w3.m7696w(str), e);
            return false;
        }
    }

    @WorkerThread
    /* renamed from: V */
    private final boolean m6807V(String str, int i, C1821i0 i0Var) {
        mo12749r();
        mo12567h();
        C1609u.m4471g(str);
        C1609u.m4475k(i0Var);
        Integer num = null;
        if (TextUtils.isEmpty(i0Var.mo11727D())) {
            C2383y3 J = mo12427b().mo13099J();
            Object w = C2361w3.m7696w(str);
            Integer valueOf = Integer.valueOf(i);
            if (i0Var.mo11725A()) {
                num = Integer.valueOf(i0Var.mo11726B());
            }
            J.mo13133d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", w, valueOf, String.valueOf(num));
            return false;
        }
        byte[] h = i0Var.mo12168h();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Constants.APP_ID, str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", i0Var.mo11725A() ? Integer.valueOf(i0Var.mo11726B()) : null);
        contentValues.put("property_name", i0Var.mo11727D());
        contentValues.put("session_scoped", i0Var.mo11731H() ? Boolean.valueOf(i0Var.mo11732J()) : null);
        contentValues.put(Packet.DATA, h);
        try {
            if (mo12525v().insertWithOnConflict("property_filters", (String) null, contentValues, 5) != -1) {
                return true;
            }
            mo12427b().mo13096F().mo13131b("Failed to insert property filter (got -1). appId", C2361w3.m7696w(str));
            return false;
        } catch (SQLiteException e) {
            mo12427b().mo13096F().mo13132c("Error storing property filter. appId", C2361w3.m7696w(str), e);
            return false;
        }
    }

    @VisibleForTesting
    /* renamed from: g0 */
    private final boolean m6816g0() {
        return mo12428c().getDatabasePath("google_app_measurement.db").exists();
    }

    @WorkerThread
    /* renamed from: h0 */
    private final long m6817h0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = mo12525v().rawQuery(str, strArr);
            if (cursor.moveToFirst()) {
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            }
            throw new SQLiteException("Database returned empty set");
        } catch (SQLiteException e) {
            mo12427b().mo13096F().mo13132c("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: l0 */
    private final boolean m6818l0(String str, List<Integer> list) {
        C1609u.m4471g(str);
        mo12749r();
        mo12567h();
        SQLiteDatabase v = mo12525v();
        try {
            long h0 = m6817h0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, mo13112m().mo12476u(str, C2302r.f4467F)));
            if (h0 <= ((long) max)) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = list.get(i);
                if (num == null || !(num instanceof Integer)) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String join = TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 140);
            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb3.append(sb2);
            sb3.append(" order by rowid desc limit -1 offset ?)");
            return v.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e) {
            mo12427b().mo13096F().mo13132c("Database error querying filters. appId", C2361w3.m7696w(str), e);
            return false;
        }
    }

    @WorkerThread
    /* renamed from: y */
    private final long m6819y(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            Cursor rawQuery = mo12525v().rawQuery(str, strArr);
            if (rawQuery.moveToFirst()) {
                long j2 = rawQuery.getLong(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return j2;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return j;
        } catch (SQLiteException e) {
            mo12427b().mo13096F().mo13132c("Database error", str, e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @WorkerThread
    /* renamed from: A */
    public final C2165f mo12488A(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C1609u.m4471g(str);
        mo12567h();
        mo12749r();
        String[] strArr = {str};
        C2165f fVar = new C2165f();
        Cursor cursor = null;
        try {
            SQLiteDatabase v = mo12525v();
            cursor = v.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                mo12427b().mo13099J().mo13131b("Not updating daily counts, app is not known. appId", C2361w3.m7696w(str));
                if (cursor != null) {
                    cursor.close();
                }
                return fVar;
            }
            if (cursor.getLong(0) == j) {
                fVar.f4102b = cursor.getLong(1);
                fVar.f4101a = cursor.getLong(2);
                fVar.f4103c = cursor.getLong(3);
                fVar.f4104d = cursor.getLong(4);
                fVar.f4105e = cursor.getLong(5);
            }
            if (z) {
                fVar.f4102b += j2;
            }
            if (z2) {
                fVar.f4101a += j2;
            }
            if (z3) {
                fVar.f4103c += j2;
            }
            if (z4) {
                fVar.f4104d += j2;
            }
            if (z5) {
                fVar.f4105e += j2;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j));
            contentValues.put("daily_public_events_count", Long.valueOf(fVar.f4101a));
            contentValues.put("daily_events_count", Long.valueOf(fVar.f4102b));
            contentValues.put("daily_conversions_count", Long.valueOf(fVar.f4103c));
            contentValues.put("daily_error_events_count", Long.valueOf(fVar.f4104d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(fVar.f4105e));
            v.update("apps", contentValues, "app_id=?", strArr);
            if (cursor != null) {
                cursor.close();
            }
            return fVar;
        } catch (SQLiteException e) {
            mo12427b().mo13096F().mo13132c("Error updating daily counts. appId", C2361w3.m7696w(str), e);
            if (cursor != null) {
                cursor.close();
            }
            return fVar;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: A0 */
    public final boolean mo12489A0() {
        return m6817h0("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    @WorkerThread
    /* renamed from: B */
    public final C2165f mo12490B(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return mo12488A(j, str, 1, false, false, z3, false, z5);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: B0 */
    public final void mo12491B0() {
        int delete;
        mo12567h();
        mo12749r();
        if (m6816g0()) {
            long a = mo13111l().f4225h.mo12849a();
            long b = mo12429f().mo11379b();
            if (Math.abs(b - a) > C2302r.f4549y.mo12867a(null).longValue()) {
                mo13111l().f4225h.mo12850b(b);
                mo12567h();
                mo12749r();
                if (m6816g0() && (delete = mo12525v().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(mo12429f().mo11378a()), String.valueOf(C2117b.m6762M())})) > 0) {
                    mo12427b().mo13104O().mo13131b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0150  */
    @androidx.annotation.WorkerThread
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C2247m mo12492C(java.lang.String r26, java.lang.String r27) {
        /*
            r25 = this;
            r15 = r27
            com.google.android.gms.common.internal.C1609u.m4471g(r26)
            com.google.android.gms.common.internal.C1609u.m4471g(r27)
            r25.mo12567h()
            r25.mo12749r()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r1 = "lifetime_count"
            java.lang.String r2 = "current_bundle_count"
            java.lang.String r3 = "last_fire_timestamp"
            java.lang.String r4 = "last_bundled_timestamp"
            java.lang.String r5 = "last_bundled_day"
            java.lang.String r6 = "last_sampled_complex_event_id"
            java.lang.String r7 = "last_sampling_rate"
            java.lang.String r8 = "last_exempt_from_sampling"
            java.lang.String r9 = "current_session_count"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            r18 = 0
            android.database.sqlite.SQLiteDatabase r1 = r25.mo12525v()     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.String r2 = "events"
            r9 = 0
            java.lang.String[] r3 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            r3 = r0
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            java.lang.String r4 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            r5[r9] = r26     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            r10 = 1
            r5[r10] = r15     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0127, all -> 0x0125 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r1 != 0) goto L_0x005c
            if (r14 == 0) goto L_0x005b
            r14.close()
        L_0x005b:
            return r18
        L_0x005c:
            long r4 = r14.getLong(r9)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            long r6 = r14.getLong(r10)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            long r11 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r0 = 3
            boolean r1 = r14.isNull(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r2 = 0
            if (r1 == 0) goto L_0x0074
            r16 = r2
            goto L_0x007a
        L_0x0074:
            long r0 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r16 = r0
        L_0x007a:
            r0 = 4
            boolean r1 = r14.isNull(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r1 == 0) goto L_0x0084
            r0 = r18
            goto L_0x008c
        L_0x0084:
            long r0 = r14.getLong(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
        L_0x008c:
            r1 = 5
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r8 == 0) goto L_0x0096
            r19 = r18
            goto L_0x00a0
        L_0x0096:
            long r19 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            java.lang.Long r1 = java.lang.Long.valueOf(r19)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r19 = r1
        L_0x00a0:
            r1 = 6
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r8 == 0) goto L_0x00aa
            r20 = r18
            goto L_0x00b4
        L_0x00aa:
            long r20 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            java.lang.Long r1 = java.lang.Long.valueOf(r20)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r20 = r1
        L_0x00b4:
            r1 = 7
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r8 != 0) goto L_0x00d0
            long r21 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x00cd }
            r23 = 1
            int r1 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r1 != 0) goto L_0x00c6
            r9 = 1
        L_0x00c6:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)     // Catch:{ SQLiteException -> 0x00cd }
            r21 = r1
            goto L_0x00d2
        L_0x00cd:
            r0 = move-exception
            goto L_0x012a
        L_0x00d0:
            r21 = r18
        L_0x00d2:
            r1 = 8
            boolean r8 = r14.isNull(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            if (r8 == 0) goto L_0x00dc
            r8 = r2
            goto L_0x00e1
        L_0x00dc:
            long r1 = r14.getLong(r1)     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r8 = r1
        L_0x00e1:
            com.google.android.gms.measurement.internal.m r22 = new com.google.android.gms.measurement.internal.m     // Catch:{ SQLiteException -> 0x0121, all -> 0x011b }
            r1 = r22
            r2 = r26
            r3 = r27
            r10 = r11
            r12 = r16
            r23 = r14
            r14 = r0
            r15 = r19
            r16 = r20
            r17 = r21
            r1.<init>(r2, r3, r4, r6, r8, r10, r12, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            boolean r0 = r23.moveToNext()     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            if (r0 == 0) goto L_0x010f
            com.google.android.gms.measurement.internal.w3 r0 = r25.mo12427b()     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13096F()     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            java.lang.String r1 = "Got multiple records for event aggregates, expected one. appId"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r26)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
            r0.mo13131b(r1, r2)     // Catch:{ SQLiteException -> 0x0117, all -> 0x0115 }
        L_0x010f:
            if (r23 == 0) goto L_0x0114
            r23.close()
        L_0x0114:
            return r22
        L_0x0115:
            r0 = move-exception
            goto L_0x011e
        L_0x0117:
            r0 = move-exception
            r14 = r23
            goto L_0x012a
        L_0x011b:
            r0 = move-exception
            r23 = r14
        L_0x011e:
            r18 = r23
            goto L_0x014e
        L_0x0121:
            r0 = move-exception
            r23 = r14
            goto L_0x012a
        L_0x0125:
            r0 = move-exception
            goto L_0x014e
        L_0x0127:
            r0 = move-exception
            r14 = r18
        L_0x012a:
            com.google.android.gms.measurement.internal.w3 r1 = r25.mo12427b()     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo13096F()     // Catch:{ all -> 0x014b }
            java.lang.String r2 = "Error querying events. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r26)     // Catch:{ all -> 0x014b }
            com.google.android.gms.measurement.internal.u3 r4 = r25.mo13109j()     // Catch:{ all -> 0x014b }
            r5 = r27
            java.lang.String r4 = r4.mo12995v(r5)     // Catch:{ all -> 0x014b }
            r1.mo13133d(r2, r3, r4, r0)     // Catch:{ all -> 0x014b }
            if (r14 == 0) goto L_0x014a
            r14.close()
        L_0x014a:
            return r18
        L_0x014b:
            r0 = move-exception
            r18 = r14
        L_0x014e:
            if (r18 == 0) goto L_0x0153
            r18.close()
        L_0x0153:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2129c.mo12492C(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.m");
    }

    @WorkerThread
    /* renamed from: C0 */
    public final long mo12493C0() {
        return m6819y("select max(bundle_end_timestamp) from queue", (String[]) null, 0);
    }

    @WorkerThread
    /* renamed from: D0 */
    public final long mo12494D0() {
        return m6819y("select max(timestamp) from raw_events", (String[]) null, 0);
    }

    /* renamed from: E0 */
    public final boolean mo12495E0() {
        return m6817h0("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo12496F(long r5) {
        /*
            r4 = this;
            r4.mo12567h()
            r4.mo12749r()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.mo12525v()     // Catch:{ SQLiteException -> 0x0042, all -> 0x0040 }
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0042, all -> 0x0040 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0042, all -> 0x0040 }
            r6 = 0
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x0042, all -> 0x0040 }
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x0042, all -> 0x0040 }
            boolean r1 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x003e }
            if (r1 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.w3 r6 = r4.mo12427b()     // Catch:{ SQLiteException -> 0x003e }
            com.google.android.gms.measurement.internal.y3 r6 = r6.mo13104O()     // Catch:{ SQLiteException -> 0x003e }
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.mo13130a(r1)     // Catch:{ SQLiteException -> 0x003e }
            if (r5 == 0) goto L_0x0033
            r5.close()
        L_0x0033:
            return r0
        L_0x0034:
            java.lang.String r6 = r5.getString(r6)     // Catch:{ SQLiteException -> 0x003e }
            if (r5 == 0) goto L_0x003d
            r5.close()
        L_0x003d:
            return r6
        L_0x003e:
            r6 = move-exception
            goto L_0x0044
        L_0x0040:
            r6 = move-exception
            goto L_0x0059
        L_0x0042:
            r6 = move-exception
            r5 = r0
        L_0x0044:
            com.google.android.gms.measurement.internal.w3 r1 = r4.mo12427b()     // Catch:{ all -> 0x0057 }
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo13096F()     // Catch:{ all -> 0x0057 }
            java.lang.String r2 = "Error selecting expired configs"
            r1.mo13131b(r2, r6)     // Catch:{ all -> 0x0057 }
            if (r5 == 0) goto L_0x0056
            r5.close()
        L_0x0056:
            return r0
        L_0x0057:
            r6 = move-exception
            r0 = r5
        L_0x0059:
            if (r0 == 0) goto L_0x005e
            r0.close()
        L_0x005e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2129c.mo12496F(long):java.lang.String");
    }

    /* renamed from: F0 */
    public final boolean mo12497F0() {
        return m6817h0("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    @androidx.annotation.WorkerThread
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.C2334t9> mo12498G(java.lang.String r14) {
        /*
            r13 = this;
            com.google.android.gms.common.internal.C1609u.m4471g(r14)
            r13.mo12567h()
            r13.mo12749r()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r13.mo12525v()     // Catch:{ SQLiteException -> 0x0084, all -> 0x0082 }
            java.lang.String r3 = "user_attributes"
            java.lang.String r4 = "name"
            java.lang.String r5 = "origin"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}     // Catch:{ SQLiteException -> 0x0084, all -> 0x0082 }
            java.lang.String r5 = "app_id=?"
            r11 = 1
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0084, all -> 0x0082 }
            r12 = 0
            r6[r12] = r14     // Catch:{ SQLiteException -> 0x0084, all -> 0x0082 }
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x0084, all -> 0x0082 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0080 }
            if (r3 != 0) goto L_0x003f
            if (r2 == 0) goto L_0x003e
            r2.close()
        L_0x003e:
            return r0
        L_0x003f:
            java.lang.String r7 = r2.getString(r12)     // Catch:{ SQLiteException -> 0x0080 }
            java.lang.String r3 = r2.getString(r11)     // Catch:{ SQLiteException -> 0x0080 }
            if (r3 != 0) goto L_0x004b
            java.lang.String r3 = ""
        L_0x004b:
            r6 = r3
            r3 = 2
            long r8 = r2.getLong(r3)     // Catch:{ SQLiteException -> 0x0080 }
            r3 = 3
            java.lang.Object r10 = r13.m6804E(r2, r3)     // Catch:{ SQLiteException -> 0x0080 }
            if (r10 != 0) goto L_0x006a
            com.google.android.gms.measurement.internal.w3 r3 = r13.mo12427b()     // Catch:{ SQLiteException -> 0x0080 }
            com.google.android.gms.measurement.internal.y3 r3 = r3.mo13096F()     // Catch:{ SQLiteException -> 0x0080 }
            java.lang.String r4 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r14)     // Catch:{ SQLiteException -> 0x0080 }
            r3.mo13131b(r4, r5)     // Catch:{ SQLiteException -> 0x0080 }
            goto L_0x0074
        L_0x006a:
            com.google.android.gms.measurement.internal.t9 r3 = new com.google.android.gms.measurement.internal.t9     // Catch:{ SQLiteException -> 0x0080 }
            r4 = r3
            r5 = r14
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x0080 }
            r0.add(r3)     // Catch:{ SQLiteException -> 0x0080 }
        L_0x0074:
            boolean r3 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0080 }
            if (r3 != 0) goto L_0x003f
            if (r2 == 0) goto L_0x007f
            r2.close()
        L_0x007f:
            return r0
        L_0x0080:
            r0 = move-exception
            goto L_0x0086
        L_0x0082:
            r14 = move-exception
            goto L_0x009f
        L_0x0084:
            r0 = move-exception
            r2 = r1
        L_0x0086:
            com.google.android.gms.measurement.internal.w3 r3 = r13.mo12427b()     // Catch:{ all -> 0x009d }
            com.google.android.gms.measurement.internal.y3 r3 = r3.mo13096F()     // Catch:{ all -> 0x009d }
            java.lang.String r4 = "Error querying user properties. appId"
            java.lang.Object r14 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r14)     // Catch:{ all -> 0x009d }
            r3.mo13132c(r4, r14, r0)     // Catch:{ all -> 0x009d }
            if (r2 == 0) goto L_0x009c
            r2.close()
        L_0x009c:
            return r1
        L_0x009d:
            r14 = move-exception
            r1 = r2
        L_0x009f:
            if (r1 == 0) goto L_0x00a4
            r1.close()
        L_0x00a4:
            goto L_0x00a6
        L_0x00a5:
            throw r14
        L_0x00a6:
            goto L_0x00a5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2129c.mo12498G(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c4 A[LOOP:0: B:18:0x0054->B:42:0x00c4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c6 A[EDGE_INSN: B:56:0x00c6->B:43:0x00c6 ?: BREAK  , SYNTHETIC] */
    @androidx.annotation.WorkerThread
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<android.util.Pair<com.google.android.gms.internal.measurement.C2056x0, java.lang.Long>> mo12499H(java.lang.String r13, int r14, int r15) {
        /*
            r12 = this;
            r12.mo12567h()
            r12.mo12749r()
            r0 = 1
            r1 = 0
            if (r14 <= 0) goto L_0x000c
            r2 = 1
            goto L_0x000d
        L_0x000c:
            r2 = 0
        L_0x000d:
            com.google.android.gms.common.internal.C1609u.m4465a(r2)
            if (r15 <= 0) goto L_0x0014
            r2 = 1
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            com.google.android.gms.common.internal.C1609u.m4465a(r2)
            com.google.android.gms.common.internal.C1609u.m4471g(r13)
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r12.mo12525v()     // Catch:{ SQLiteException -> 0x00ce }
            java.lang.String r4 = "queue"
            java.lang.String r5 = "rowid"
            java.lang.String r6 = "data"
            java.lang.String r7 = "retry_count"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7}     // Catch:{ SQLiteException -> 0x00ce }
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00ce }
            r7[r1] = r13     // Catch:{ SQLiteException -> 0x00ce }
            r8 = 0
            r9 = 0
            java.lang.String r10 = "rowid"
            java.lang.String r11 = java.lang.String.valueOf(r14)     // Catch:{ SQLiteException -> 0x00ce }
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x00ce }
            boolean r14 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x00ce }
            if (r14 != 0) goto L_0x004e
            java.util.List r13 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x00ce }
            if (r2 == 0) goto L_0x004d
            r2.close()
        L_0x004d:
            return r13
        L_0x004e:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x00ce }
            r14.<init>()     // Catch:{ SQLiteException -> 0x00ce }
            r3 = 0
        L_0x0054:
            long r4 = r2.getLong(r1)     // Catch:{ SQLiteException -> 0x00ce }
            byte[] r6 = r2.getBlob(r0)     // Catch:{ IOException -> 0x00ae }
            com.google.android.gms.measurement.internal.p9 r7 = r12.mo12778n()     // Catch:{ IOException -> 0x00ae }
            byte[] r6 = r7.mo12891V(r6)     // Catch:{ IOException -> 0x00ae }
            boolean r7 = r14.isEmpty()     // Catch:{ SQLiteException -> 0x00ce }
            if (r7 != 0) goto L_0x006e
            int r7 = r6.length     // Catch:{ SQLiteException -> 0x00ce }
            int r7 = r7 + r3
            if (r7 > r15) goto L_0x00c6
        L_0x006e:
            com.google.android.gms.internal.measurement.x0$a r7 = com.google.android.gms.internal.measurement.C2056x0.m6324N0()     // Catch:{ IOException -> 0x009b }
            com.google.android.gms.measurement.internal.C2290p9.m7352y(r7, r6)     // Catch:{ IOException -> 0x009b }
            com.google.android.gms.internal.measurement.x0$a r7 = (com.google.android.gms.internal.measurement.C2056x0.C2057a) r7     // Catch:{ IOException -> 0x009b }
            r8 = 2
            boolean r9 = r2.isNull(r8)     // Catch:{ SQLiteException -> 0x00ce }
            if (r9 != 0) goto L_0x0085
            int r8 = r2.getInt(r8)     // Catch:{ SQLiteException -> 0x00ce }
            r7.mo12282X0(r8)     // Catch:{ SQLiteException -> 0x00ce }
        L_0x0085:
            int r6 = r6.length     // Catch:{ SQLiteException -> 0x00ce }
            int r3 = r3 + r6
            com.google.android.gms.internal.measurement.x5 r6 = r7.mo11851I()     // Catch:{ SQLiteException -> 0x00ce }
            com.google.android.gms.internal.measurement.m4 r6 = (com.google.android.gms.internal.measurement.C1889m4) r6     // Catch:{ SQLiteException -> 0x00ce }
            com.google.android.gms.internal.measurement.x0 r6 = (com.google.android.gms.internal.measurement.C2056x0) r6     // Catch:{ SQLiteException -> 0x00ce }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x00ce }
            android.util.Pair r4 = android.util.Pair.create(r6, r4)     // Catch:{ SQLiteException -> 0x00ce }
            r14.add(r4)     // Catch:{ SQLiteException -> 0x00ce }
            goto L_0x00be
        L_0x009b:
            r4 = move-exception
            com.google.android.gms.measurement.internal.w3 r5 = r12.mo12427b()     // Catch:{ SQLiteException -> 0x00ce }
            com.google.android.gms.measurement.internal.y3 r5 = r5.mo13096F()     // Catch:{ SQLiteException -> 0x00ce }
            java.lang.String r6 = "Failed to merge queued bundle. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r13)     // Catch:{ SQLiteException -> 0x00ce }
        L_0x00aa:
            r5.mo13132c(r6, r7, r4)     // Catch:{ SQLiteException -> 0x00ce }
            goto L_0x00be
        L_0x00ae:
            r4 = move-exception
            com.google.android.gms.measurement.internal.w3 r5 = r12.mo12427b()     // Catch:{ SQLiteException -> 0x00ce }
            com.google.android.gms.measurement.internal.y3 r5 = r5.mo13096F()     // Catch:{ SQLiteException -> 0x00ce }
            java.lang.String r6 = "Failed to unzip queued bundle. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r13)     // Catch:{ SQLiteException -> 0x00ce }
            goto L_0x00aa
        L_0x00be:
            boolean r4 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x00ce }
            if (r4 == 0) goto L_0x00c6
            if (r3 <= r15) goto L_0x0054
        L_0x00c6:
            if (r2 == 0) goto L_0x00cb
            r2.close()
        L_0x00cb:
            return r14
        L_0x00cc:
            r13 = move-exception
            goto L_0x00ea
        L_0x00ce:
            r14 = move-exception
            com.google.android.gms.measurement.internal.w3 r15 = r12.mo12427b()     // Catch:{ all -> 0x00cc }
            com.google.android.gms.measurement.internal.y3 r15 = r15.mo13096F()     // Catch:{ all -> 0x00cc }
            java.lang.String r0 = "Error querying bundles. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r13)     // Catch:{ all -> 0x00cc }
            r15.mo13132c(r0, r13, r14)     // Catch:{ all -> 0x00cc }
            java.util.List r13 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00cc }
            if (r2 == 0) goto L_0x00e9
            r2.close()
        L_0x00e9:
            return r13
        L_0x00ea:
            if (r2 == 0) goto L_0x00ef
            r2.close()
        L_0x00ef:
            goto L_0x00f1
        L_0x00f0:
            throw r13
        L_0x00f1:
            goto L_0x00f0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2129c.mo12499H(java.lang.String, int, int):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f9, code lost:
        r12 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0100, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0101, code lost:
        r12 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0104, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0105, code lost:
        r12 = r21;
        r11 = r22;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0100 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0127  */
    @androidx.annotation.WorkerThread
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.measurement.internal.C2334t9> mo12500J(java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            r21 = this;
            com.google.android.gms.common.internal.C1609u.m4471g(r22)
            r21.mo12567h()
            r21.mo12749r()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0104, all -> 0x0100 }
            r3 = 3
            r2.<init>(r3)     // Catch:{ SQLiteException -> 0x0104, all -> 0x0100 }
            r11 = r22
            r2.add(r11)     // Catch:{ SQLiteException -> 0x00fc, all -> 0x0100 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00fc, all -> 0x0100 }
            java.lang.String r5 = "app_id=?"
            r4.<init>(r5)     // Catch:{ SQLiteException -> 0x00fc, all -> 0x0100 }
            boolean r5 = android.text.TextUtils.isEmpty(r23)     // Catch:{ SQLiteException -> 0x00fc, all -> 0x0100 }
            if (r5 != 0) goto L_0x0032
            r5 = r23
            r2.add(r5)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.String r6 = " and origin=?"
            r4.append(r6)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            goto L_0x0034
        L_0x0032:
            r5 = r23
        L_0x0034:
            boolean r6 = android.text.TextUtils.isEmpty(r24)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            if (r6 != 0) goto L_0x004c
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.String r7 = "*"
            java.lang.String r6 = r6.concat(r7)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            r2.add(r6)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.String r6 = " and name glob ?"
            r4.append(r6)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
        L_0x004c:
            int r6 = r2.size()     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.Object[] r2 = r2.toArray(r6)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            r16 = r2
            java.lang.String[] r16 = (java.lang.String[]) r16     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            android.database.sqlite.SQLiteDatabase r12 = r21.mo12525v()     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.String r13 = "user_attributes"
            java.lang.String r2 = "name"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String r8 = "origin"
            java.lang.String[] r14 = new java.lang.String[]{r2, r6, r7, r8}     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            java.lang.String r15 = r4.toString()     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            r17 = 0
            r18 = 0
            java.lang.String r19 = "rowid"
            java.lang.String r20 = "1001"
            android.database.Cursor r2 = r12.query(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ SQLiteException -> 0x00f8, all -> 0x0100 }
            boolean r4 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            if (r4 != 0) goto L_0x0088
            if (r2 == 0) goto L_0x0087
            r2.close()
        L_0x0087:
            return r0
        L_0x0088:
            int r4 = r0.size()     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r4 < r6) goto L_0x00a4
            com.google.android.gms.measurement.internal.w3 r3 = r21.mo12427b()     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            com.google.android.gms.measurement.internal.y3 r3 = r3.mo13096F()     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            java.lang.String r4 = "Read more than the max allowed user properties, ignoring excess"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            r3.mo13131b(r4, r6)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            r12 = r21
            goto L_0x00e3
        L_0x00a4:
            r4 = 0
            java.lang.String r7 = r2.getString(r4)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            r4 = 1
            long r8 = r2.getLong(r4)     // Catch:{ SQLiteException -> 0x00f4, all -> 0x00f0 }
            r4 = 2
            r12 = r21
            java.lang.Object r10 = r12.m6804E(r2, r4)     // Catch:{ SQLiteException -> 0x00ee }
            java.lang.String r13 = r2.getString(r3)     // Catch:{ SQLiteException -> 0x00ee }
            if (r10 != 0) goto L_0x00cf
            com.google.android.gms.measurement.internal.w3 r4 = r21.mo12427b()     // Catch:{ SQLiteException -> 0x00eb }
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo13096F()     // Catch:{ SQLiteException -> 0x00eb }
            java.lang.String r5 = "(2)Read invalid user property value, ignoring it"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r22)     // Catch:{ SQLiteException -> 0x00eb }
            r14 = r24
            r4.mo13133d(r5, r6, r13, r14)     // Catch:{ SQLiteException -> 0x00eb }
            goto L_0x00dd
        L_0x00cf:
            r14 = r24
            com.google.android.gms.measurement.internal.t9 r15 = new com.google.android.gms.measurement.internal.t9     // Catch:{ SQLiteException -> 0x00eb }
            r4 = r15
            r5 = r22
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ SQLiteException -> 0x00eb }
            r0.add(r15)     // Catch:{ SQLiteException -> 0x00eb }
        L_0x00dd:
            boolean r4 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x00eb }
            if (r4 != 0) goto L_0x00e9
        L_0x00e3:
            if (r2 == 0) goto L_0x00e8
            r2.close()
        L_0x00e8:
            return r0
        L_0x00e9:
            r5 = r13
            goto L_0x0088
        L_0x00eb:
            r0 = move-exception
            r5 = r13
            goto L_0x010c
        L_0x00ee:
            r0 = move-exception
            goto L_0x010c
        L_0x00f0:
            r0 = move-exception
            r12 = r21
            goto L_0x0124
        L_0x00f4:
            r0 = move-exception
            r12 = r21
            goto L_0x010c
        L_0x00f8:
            r0 = move-exception
            r12 = r21
            goto L_0x010b
        L_0x00fc:
            r0 = move-exception
            r12 = r21
            goto L_0x0109
        L_0x0100:
            r0 = move-exception
            r12 = r21
            goto L_0x0125
        L_0x0104:
            r0 = move-exception
            r12 = r21
            r11 = r22
        L_0x0109:
            r5 = r23
        L_0x010b:
            r2 = r1
        L_0x010c:
            com.google.android.gms.measurement.internal.w3 r3 = r21.mo12427b()     // Catch:{ all -> 0x0123 }
            com.google.android.gms.measurement.internal.y3 r3 = r3.mo13096F()     // Catch:{ all -> 0x0123 }
            java.lang.String r4 = "(2)Error querying user properties"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r22)     // Catch:{ all -> 0x0123 }
            r3.mo13133d(r4, r6, r5, r0)     // Catch:{ all -> 0x0123 }
            if (r2 == 0) goto L_0x0122
            r2.close()
        L_0x0122:
            return r1
        L_0x0123:
            r0 = move-exception
        L_0x0124:
            r1 = r2
        L_0x0125:
            if (r1 == 0) goto L_0x012a
            r1.close()
        L_0x012a:
            goto L_0x012c
        L_0x012b:
            throw r0
        L_0x012c:
            goto L_0x012b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2129c.mo12500J(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: K */
    public final List<zzy> mo12501K(String str, String[] strArr) {
        mo12567h();
        mo12749r();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = mo12525v().query("conditional_properties", new String[]{Constants.APP_ID, "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, (String) null, (String) null, "rowid", "1001");
            if (!cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            }
            while (true) {
                if (arrayList.size() < 1000) {
                    boolean z = false;
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    String string3 = cursor.getString(2);
                    Object E = m6804E(cursor, 3);
                    if (cursor.getInt(4) != 0) {
                        z = true;
                    }
                    String string4 = cursor.getString(5);
                    long j = cursor.getLong(6);
                    long j2 = cursor.getLong(8);
                    long j3 = cursor.getLong(10);
                    boolean z2 = z;
                    zzy zzy = r3;
                    zzy zzy2 = new zzy(string, string2, new zzkn(string3, j3, E, string2), j2, z2, string4, (zzaq) mo12778n().mo12895w(cursor.getBlob(7), zzaq.CREATOR), j, (zzaq) mo12778n().mo12895w(cursor.getBlob(9), zzaq.CREATOR), cursor.getLong(11), (zzaq) mo12778n().mo12895w(cursor.getBlob(12), zzaq.CREATOR));
                    arrayList.add(zzy);
                    if (!cursor.moveToNext()) {
                        break;
                    }
                } else {
                    mo12427b().mo13096F().mo13131b("Read more than the max allowed conditional properties, ignoring extra", 1000);
                    break;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (SQLiteException e) {
            mo12427b().mo13096F().mo13131b("Error querying conditional user property value", e);
            List<zzy> emptyList = Collections.emptyList();
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
    /* renamed from: M */
    public final void mo12502M(C2247m mVar) {
        C1609u.m4475k(mVar);
        mo12567h();
        mo12749r();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Constants.APP_ID, mVar.f4343a);
        contentValues.put("name", mVar.f4344b);
        contentValues.put("lifetime_count", Long.valueOf(mVar.f4345c));
        contentValues.put("current_bundle_count", Long.valueOf(mVar.f4346d));
        contentValues.put("last_fire_timestamp", Long.valueOf(mVar.f4348f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(mVar.f4349g));
        contentValues.put("last_bundled_day", mVar.f4350h);
        contentValues.put("last_sampled_complex_event_id", mVar.f4351i);
        contentValues.put("last_sampling_rate", mVar.f4352j);
        contentValues.put("current_session_count", Long.valueOf(mVar.f4347e));
        Boolean bool = mVar.f4353k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (mo12525v().insertWithOnConflict("events", (String) null, contentValues, 5) == -1) {
                mo12427b().mo13096F().mo13131b("Failed to insert/update event aggregates (got -1). appId", C2361w3.m7696w(mVar.f4343a));
            }
        } catch (SQLiteException e) {
            mo12427b().mo13096F().mo13132c("Error storing event aggregates. appId", C2361w3.m7696w(mVar.f4343a), e);
        }
    }

    @WorkerThread
    /* renamed from: N */
    public final void mo12503N(C2147d5 d5Var) {
        C1609u.m4475k(d5Var);
        mo12567h();
        mo12749r();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Constants.APP_ID, d5Var.mo12634t());
        contentValues.put("app_instance_id", d5Var.mo12638x());
        contentValues.put("gmp_app_id", d5Var.mo12576A());
        contentValues.put("resettable_device_id_hash", d5Var.mo12585J());
        contentValues.put("last_bundle_index", Long.valueOf(d5Var.mo12613f0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(d5Var.mo12591P()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(d5Var.mo12593R()));
        contentValues.put(Constants.EXTRA_KEY_APP_VERSION, d5Var.mo12595T());
        contentValues.put("app_store", d5Var.mo12599X());
        contentValues.put("gmp_version", Long.valueOf(d5Var.mo12601Z()));
        contentValues.put("dev_cert_hash", Long.valueOf(d5Var.mo12605b0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(d5Var.mo12611e0()));
        contentValues.put("day", Long.valueOf(d5Var.mo12621j0()));
        contentValues.put("daily_public_events_count", Long.valueOf(d5Var.mo12623k0()));
        contentValues.put("daily_events_count", Long.valueOf(d5Var.mo12625l0()));
        contentValues.put("daily_conversions_count", Long.valueOf(d5Var.mo12627m0()));
        contentValues.put("config_fetched_time", Long.valueOf(d5Var.mo12615g0()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(d5Var.mo12617h0()));
        contentValues.put("app_version_int", Long.valueOf(d5Var.mo12597V()));
        contentValues.put("firebase_instance_id", d5Var.mo12588M());
        contentValues.put("daily_error_events_count", Long.valueOf(d5Var.mo12616h()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(d5Var.mo12614g()));
        contentValues.put("health_monitor_sample", d5Var.mo12618i());
        contentValues.put("android_id", Long.valueOf(d5Var.mo12622k()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(d5Var.mo12624l()));
        contentValues.put("ssaid_reporting_enabled", Boolean.valueOf(d5Var.mo12626m()));
        contentValues.put("admob_app_id", d5Var.mo12579D());
        contentValues.put("dynamite_version", Long.valueOf(d5Var.mo12609d0()));
        if (d5Var.mo12629o() != null) {
            if (d5Var.mo12629o().size() == 0) {
                mo12427b().mo13099J().mo13131b("Safelisted events should not be an empty list. appId", d5Var.mo12634t());
            } else {
                contentValues.put("safelisted_events", TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, d5Var.mo12629o()));
            }
        }
        if (C1832ia.m5256a() && mo13112m().mo12456B(d5Var.mo12634t(), C2302r.f4532p0)) {
            contentValues.put("ga_app_id", d5Var.mo12582G());
        }
        try {
            SQLiteDatabase v = mo12525v();
            if (((long) v.update("apps", contentValues, "app_id = ?", new String[]{d5Var.mo12634t()})) == 0 && v.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                mo12427b().mo13096F().mo13131b("Failed to insert/update app (got -1). appId", C2361w3.m7696w(d5Var.mo12634t()));
            }
        } catch (SQLiteException e) {
            mo12427b().mo13096F().mo13132c("Error storing app. appId", C2361w3.m7696w(d5Var.mo12634t()), e);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: O */
    public final void mo12504O(String str, List<C1760e0> list) {
        boolean z;
        C2383y3 J;
        String str2;
        Object w;
        Integer valueOf;
        boolean z2;
        String str3 = str;
        List<C1760e0> list2 = list;
        C1609u.m4475k(list);
        for (int i = 0; i < list.size(); i++) {
            C1760e0.C1761a aVar = (C1760e0.C1761a) list2.get(i).mo11850u();
            if (aVar.mo11592y() != 0) {
                for (int i2 = 0; i2 < aVar.mo11592y(); i2++) {
                    C1775f0.C1776a aVar2 = (C1775f0.C1776a) aVar.mo11593z(i2).mo11850u();
                    C1775f0.C1776a aVar3 = (C1775f0.C1776a) ((C1889m4.C1891b) aVar2.clone());
                    String b = C2112a6.m6754b(aVar2.mo11634x());
                    if (b != null) {
                        aVar3.mo11632v(b);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    for (int i3 = 0; i3 < aVar2.mo11635y(); i3++) {
                        C1790g0 w2 = aVar2.mo11633w(i3);
                        String a = C2396z5.m7798a(w2.mo11677J());
                        if (a != null) {
                            C1790g0.C1791a aVar4 = (C1790g0.C1791a) w2.mo11850u();
                            aVar4.mo11678u(a);
                            aVar3.mo11631u(i3, (C1790g0) ((C1889m4) aVar4.mo11851I()));
                            z2 = true;
                        }
                    }
                    if (z2) {
                        aVar.mo11589v(i2, aVar3);
                        list2.set(i, (C1760e0) ((C1889m4) aVar.mo11851I()));
                    }
                }
            }
            if (aVar.mo11588u() != 0) {
                for (int i4 = 0; i4 < aVar.mo11588u(); i4++) {
                    C1821i0 x = aVar.mo11591x(i4);
                    String a2 = C2136c6.m6876a(x.mo11727D());
                    if (a2 != null) {
                        C1821i0.C1822a aVar5 = (C1821i0.C1822a) x.mo11850u();
                        aVar5.mo11733u(a2);
                        aVar.mo11590w(i4, aVar5);
                        list2.set(i, (C1760e0) ((C1889m4) aVar.mo11851I()));
                    }
                }
            }
        }
        mo12749r();
        mo12567h();
        C1609u.m4471g(str);
        C1609u.m4475k(list);
        SQLiteDatabase v = mo12525v();
        v.beginTransaction();
        try {
            mo12749r();
            mo12567h();
            C1609u.m4471g(str);
            SQLiteDatabase v2 = mo12525v();
            v2.delete("property_filters", "app_id=?", new String[]{str3});
            v2.delete("event_filters", "app_id=?", new String[]{str3});
            for (C1760e0 next : list) {
                mo12749r();
                mo12567h();
                C1609u.m4471g(str);
                C1609u.m4475k(next);
                if (next.mo11580E()) {
                    int F = next.mo11581F();
                    Iterator<C1775f0> it = next.mo11585K().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().mo11619E()) {
                                J = mo12427b().mo13099J();
                                str2 = "Event filter with no ID. Audience definition ignored. appId, audienceId";
                                w = C2361w3.m7696w(str);
                                valueOf = Integer.valueOf(F);
                                break;
                            }
                        } else {
                            for (C1821i0 A : next.mo11583H()) {
                                if (!A.mo11725A()) {
                                    J = mo12427b().mo13099J();
                                    str2 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
                                    w = C2361w3.m7696w(str);
                                    valueOf = Integer.valueOf(F);
                                }
                            }
                            Iterator<C1775f0> it2 = next.mo11585K().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!m6806U(str3, F, it2.next())) {
                                        z = false;
                                        break;
                                    }
                                } else {
                                    z = true;
                                    break;
                                }
                            }
                            if (z) {
                                Iterator<C1821i0> it3 = next.mo11583H().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (!m6807V(str3, F, it3.next())) {
                                            z = false;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            if (!z) {
                                mo12749r();
                                mo12567h();
                                C1609u.m4471g(str);
                                SQLiteDatabase v3 = mo12525v();
                                v3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str3, String.valueOf(F)});
                                v3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str3, String.valueOf(F)});
                            }
                        }
                    }
                    J.mo13132c(str2, w, valueOf);
                    break;
                }
                mo12427b().mo13099J().mo13131b("Audience with no ID. appId", C2361w3.m7696w(str));
            }
            ArrayList arrayList = new ArrayList();
            for (C1760e0 next2 : list) {
                arrayList.add(next2.mo11580E() ? Integer.valueOf(next2.mo11581F()) : null);
            }
            m6818l0(str3, arrayList);
            v.setTransactionSuccessful();
        } finally {
            v.endTransaction();
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @VisibleForTesting
    /* renamed from: P */
    public final void mo12505P(List<Long> list) {
        mo12567h();
        mo12749r();
        C1609u.m4475k(list);
        C1609u.m4477m(list.size());
        if (m6816g0()) {
            String join = TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(sb2);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (m6817h0(sb3.toString(), (String[]) null) > 0) {
                mo12427b().mo13099J().mo13130a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase v = mo12525v();
                StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                v.execSQL(sb4.toString());
            } catch (SQLiteException e) {
                mo12427b().mo13096F().mo13131b("Error incrementing retry count. error", e);
            }
        }
    }

    @WorkerThread
    /* renamed from: Q */
    public final boolean mo12506Q(C2056x0 x0Var, boolean z) {
        C2383y3 F;
        Object w;
        String str;
        mo12567h();
        mo12749r();
        C1609u.m4475k(x0Var);
        C1609u.m4471g(x0Var.mo12206I2());
        C1609u.m4478n(x0Var.mo12233j2());
        mo12491B0();
        long a = mo12429f().mo11378a();
        if (x0Var.mo12235k2() < a - C2117b.m6762M() || x0Var.mo12235k2() > C2117b.m6762M() + a) {
            mo12427b().mo13099J().mo13133d("Storing bundle outside of the max uploading time span. appId, now, timestamp", C2361w3.m7696w(x0Var.mo12206I2()), Long.valueOf(a), Long.valueOf(x0Var.mo12235k2()));
        }
        try {
            byte[] W = mo12778n().mo12892W(x0Var.mo12168h());
            mo12427b().mo13104O().mo13131b("Saving bundle, size", Integer.valueOf(W.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put(Constants.APP_ID, x0Var.mo12206I2());
            contentValues.put("bundle_end_timestamp", Long.valueOf(x0Var.mo12235k2()));
            contentValues.put(Packet.DATA, W);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (x0Var.mo12250w0()) {
                contentValues.put("retry_count", Integer.valueOf(x0Var.mo12205I0()));
            }
            try {
                if (mo12525v().insert("queue", (String) null, contentValues) != -1) {
                    return true;
                }
                mo12427b().mo13096F().mo13131b("Failed to insert bundle (got -1). appId", C2361w3.m7696w(x0Var.mo12206I2()));
                return false;
            } catch (SQLiteException e) {
                e = e;
                F = mo12427b().mo13096F();
                w = C2361w3.m7696w(x0Var.mo12206I2());
                str = "Error storing bundle. appId";
                F.mo13132c(str, w, e);
                return false;
            }
        } catch (IOException e2) {
            e = e2;
            F = mo12427b().mo13096F();
            w = C2361w3.m7696w(x0Var.mo12206I2());
            str = "Data loss. Failed to serialize bundle. appId";
            F.mo13132c(str, w, e);
            return false;
        }
    }

    /* renamed from: R */
    public final boolean mo12507R(C2224k kVar, long j, boolean z) {
        mo12567h();
        mo12749r();
        C1609u.m4475k(kVar);
        C1609u.m4471g(kVar.f4253a);
        C1994t0.C1995a c0 = C1994t0.m5974c0();
        c0.mo12079G(kVar.f4257e);
        Iterator<String> it = kVar.f4258f.iterator();
        while (it.hasNext()) {
            String next = it.next();
            C2024v0.C2025a d0 = C2024v0.m6072d0();
            d0.mo12123z(next);
            mo12778n().mo12887H(d0, kVar.f4258f.mo13150S(next));
            c0.mo12087x(d0);
        }
        byte[] h = ((C1994t0) ((C1889m4) c0.mo11851I())).mo12168h();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Constants.APP_ID, kVar.f4253a);
        contentValues.put("name", kVar.f4254b);
        contentValues.put("timestamp", Long.valueOf(kVar.f4256d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put(Packet.DATA, h);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (mo12525v().insert("raw_events", (String) null, contentValues) != -1) {
                return true;
            }
            mo12427b().mo13096F().mo13131b("Failed to insert raw event (got -1). appId", C2361w3.m7696w(kVar.f4253a));
            return false;
        } catch (SQLiteException e) {
            mo12427b().mo13096F().mo13132c("Error storing raw event. appId", C2361w3.m7696w(kVar.f4253a), e);
            return false;
        }
    }

    @WorkerThread
    /* renamed from: S */
    public final boolean mo12508S(C2334t9 t9Var) {
        C1609u.m4475k(t9Var);
        mo12567h();
        mo12749r();
        if (mo12516n0(t9Var.f4626a, t9Var.f4628c) == null) {
            if (C2323s9.m7567b0(t9Var.f4628c)) {
                if (m6817h0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{t9Var.f4626a}) >= ((long) mo13112m().mo12478w(t9Var.f4626a))) {
                    return false;
                }
            } else if (!"_npa".equals(t9Var.f4628c)) {
                if (m6817h0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{t9Var.f4626a, t9Var.f4627b}) >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(Constants.APP_ID, t9Var.f4626a);
        contentValues.put("origin", t9Var.f4627b);
        contentValues.put("name", t9Var.f4628c);
        contentValues.put("set_timestamp", Long.valueOf(t9Var.f4629d));
        m6805L(contentValues, "value", t9Var.f4630e);
        try {
            if (mo12525v().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) == -1) {
                mo12427b().mo13096F().mo13131b("Failed to insert/update user property (got -1). appId", C2361w3.m7696w(t9Var.f4626a));
            }
        } catch (SQLiteException e) {
            mo12427b().mo13096F().mo13132c("Error storing user property. appId", C2361w3.m7696w(t9Var.f4626a), e);
        }
        return true;
    }

    @WorkerThread
    /* renamed from: T */
    public final boolean mo12509T(zzy zzy) {
        C1609u.m4475k(zzy);
        mo12567h();
        mo12749r();
        if (mo12516n0(zzy.f4799a, zzy.f4801c.f4771b) == null) {
            if (m6817h0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{zzy.f4799a}) >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(Constants.APP_ID, zzy.f4799a);
        contentValues.put("origin", zzy.f4800b);
        contentValues.put("name", zzy.f4801c.f4771b);
        m6805L(contentValues, "value", zzy.f4801c.mo13160Q());
        contentValues.put("active", Boolean.valueOf(zzy.f4803e));
        contentValues.put("trigger_event_name", zzy.f4804f);
        contentValues.put("trigger_timeout", Long.valueOf(zzy.f4806h));
        mo13110k();
        contentValues.put("timed_out_event", C2323s9.m7571l0(zzy.f4805g));
        contentValues.put("creation_timestamp", Long.valueOf(zzy.f4802d));
        mo13110k();
        contentValues.put("triggered_event", C2323s9.m7571l0(zzy.f4807i));
        contentValues.put("triggered_timestamp", Long.valueOf(zzy.f4801c.f4772c));
        contentValues.put("time_to_live", Long.valueOf(zzy.f4808j));
        mo13110k();
        contentValues.put("expired_event", C2323s9.m7571l0(zzy.f4809k));
        try {
            if (mo12525v().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) == -1) {
                mo12427b().mo13096F().mo13131b("Failed to insert/update conditional user property (got -1)", C2361w3.m7696w(zzy.f4799a));
            }
        } catch (SQLiteException e) {
            mo12427b().mo13096F().mo13132c("Error storing conditional user property", C2361w3.m7696w(zzy.f4799a), e);
        }
        return true;
    }

    /* renamed from: W */
    public final boolean mo12510W(String str, Long l, long j, C1994t0 t0Var) {
        mo12567h();
        mo12749r();
        C1609u.m4475k(t0Var);
        C1609u.m4471g(str);
        C1609u.m4475k(l);
        byte[] h = t0Var.mo12168h();
        mo12427b().mo13104O().mo13132c("Saving complex main event, appId, data size", mo13109j().mo12995v(str), Integer.valueOf(h.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(Constants.APP_ID, str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", h);
        try {
            if (mo12525v().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            mo12427b().mo13096F().mo13131b("Failed to insert complex main event (got -1). appId", C2361w3.m7696w(str));
            return false;
        } catch (SQLiteException e) {
            mo12427b().mo13096F().mo13132c("Error storing complex main event. appId", C2361w3.m7696w(str), e);
            return false;
        }
    }

    /* renamed from: X */
    public final long mo12511X() {
        Cursor cursor = null;
        try {
            cursor = mo12525v().rawQuery("select rowid from raw_events order by rowid desc limit 1;", (String[]) null);
            if (!cursor.moveToFirst()) {
                if (cursor != null) {
                    cursor.close();
                }
                return -1;
            }
            long j = cursor.getLong(0);
            if (cursor != null) {
                cursor.close();
            }
            return j;
        } catch (SQLiteException e) {
            mo12427b().mo13096F().mo13131b("Error querying raw events", e);
            if (cursor != null) {
                cursor.close();
            }
            return -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x011b A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x011f A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0159 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0172 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0187 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01a3 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01a4 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b3 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01e9 A[Catch:{ SQLiteException -> 0x0200 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x022d  */
    @androidx.annotation.WorkerThread
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C2147d5 mo12512i0(java.lang.String r35) {
        /*
            r34 = this;
            r1 = r35
            com.google.android.gms.common.internal.C1609u.m4471g(r35)
            r34.mo12567h()
            r34.mo12749r()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r34.mo12525v()     // Catch:{ SQLiteException -> 0x020e, all -> 0x020a }
            java.lang.String r4 = "apps"
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
            java.lang.String r29 = "ssaid_reporting_enabled"
            java.lang.String r30 = "admob_app_id"
            java.lang.String r31 = "dynamite_version"
            java.lang.String r32 = "safelisted_events"
            java.lang.String r33 = "ga_app_id"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33}     // Catch:{ SQLiteException -> 0x020e, all -> 0x020a }
            java.lang.String r6 = "app_id=?"
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x020e, all -> 0x020a }
            r11 = 0
            r7[r11] = r1     // Catch:{ SQLiteException -> 0x020e, all -> 0x020a }
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x020e, all -> 0x020a }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0206, all -> 0x0202 }
            if (r4 != 0) goto L_0x006b
            if (r3 == 0) goto L_0x006a
            r3.close()
        L_0x006a:
            return r2
        L_0x006b:
            com.google.android.gms.measurement.internal.d5 r4 = new com.google.android.gms.measurement.internal.d5     // Catch:{ SQLiteException -> 0x0206, all -> 0x0202 }
            r5 = r34
            com.google.android.gms.measurement.internal.l9 r6 = r5.f4252b     // Catch:{ SQLiteException -> 0x0200 }
            com.google.android.gms.measurement.internal.a5 r6 = r6.mo12829f0()     // Catch:{ SQLiteException -> 0x0200 }
            r4.<init>(r6, r1)     // Catch:{ SQLiteException -> 0x0200 }
            java.lang.String r6 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo12606c(r6)     // Catch:{ SQLiteException -> 0x0200 }
            java.lang.String r6 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo12632r(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 2
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo12578C(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 3
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo12583H(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 4
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo12602a(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 5
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo12631q(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 6
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo12584I(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 7
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo12587L(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 8
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo12639y(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 9
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo12577B(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 10
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r7 != 0) goto L_0x00d9
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r6 == 0) goto L_0x00d7
            goto L_0x00d9
        L_0x00d7:
            r6 = 0
            goto L_0x00da
        L_0x00d9:
            r6 = 1
        L_0x00da:
            r4.mo12610e(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 11
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo12592Q(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 12
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo12594S(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 13
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo12596U(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 14
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo12598W(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 15
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo12586K(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 16
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo12589N(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 17
            boolean r7 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r7 == 0) goto L_0x011f
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            goto L_0x0124
        L_0x011f:
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0200 }
            long r6 = (long) r6     // Catch:{ SQLiteException -> 0x0200 }
        L_0x0124:
            r4.mo12635u(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 18
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo12581F(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 19
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo12603a0(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 20
            long r6 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo12600Y(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 21
            java.lang.String r6 = r3.getString(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo12590O(r6)     // Catch:{ SQLiteException -> 0x0200 }
            com.google.android.gms.measurement.internal.b r6 = r34.mo13112m()     // Catch:{ SQLiteException -> 0x0200 }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.C2302r.f4484N0     // Catch:{ SQLiteException -> 0x0200 }
            boolean r6 = r6.mo12474s(r7)     // Catch:{ SQLiteException -> 0x0200 }
            r7 = 0
            if (r6 != 0) goto L_0x016a
            r6 = 22
            boolean r9 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r9 == 0) goto L_0x0163
            r9 = r7
            goto L_0x0167
        L_0x0163:
            long r9 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x0200 }
        L_0x0167:
            r4.mo12607c0(r9)     // Catch:{ SQLiteException -> 0x0200 }
        L_0x016a:
            r6 = 23
            boolean r9 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r9 != 0) goto L_0x017b
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r6 == 0) goto L_0x0179
            goto L_0x017b
        L_0x0179:
            r6 = 0
            goto L_0x017c
        L_0x017b:
            r6 = 1
        L_0x017c:
            r4.mo12633s(r6)     // Catch:{ SQLiteException -> 0x0200 }
            r6 = 24
            boolean r9 = r3.isNull(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r9 != 0) goto L_0x018f
            int r6 = r3.getInt(r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r6 == 0) goto L_0x018e
            goto L_0x018f
        L_0x018e:
            r0 = 0
        L_0x018f:
            r4.mo12637w(r0)     // Catch:{ SQLiteException -> 0x0200 }
            r0 = 25
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo12636v(r0)     // Catch:{ SQLiteException -> 0x0200 }
            r0 = 26
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x0200 }
            if (r6 == 0) goto L_0x01a4
            goto L_0x01a8
        L_0x01a4:
            long r7 = r3.getLong(r0)     // Catch:{ SQLiteException -> 0x0200 }
        L_0x01a8:
            r4.mo12580E(r7)     // Catch:{ SQLiteException -> 0x0200 }
            r0 = 27
            boolean r6 = r3.isNull(r0)     // Catch:{ SQLiteException -> 0x0200 }
            if (r6 != 0) goto L_0x01c5
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x0200 }
            java.lang.String r6 = ","
            r7 = -1
            java.lang.String[] r0 = r0.split(r6, r7)     // Catch:{ SQLiteException -> 0x0200 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo12608d(r0)     // Catch:{ SQLiteException -> 0x0200 }
        L_0x01c5:
            boolean r0 = com.google.android.gms.internal.measurement.C1832ia.m5256a()     // Catch:{ SQLiteException -> 0x0200 }
            if (r0 == 0) goto L_0x01e0
            com.google.android.gms.measurement.internal.b r0 = r34.mo13112m()     // Catch:{ SQLiteException -> 0x0200 }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.C2302r.f4532p0     // Catch:{ SQLiteException -> 0x0200 }
            boolean r0 = r0.mo12456B(r1, r6)     // Catch:{ SQLiteException -> 0x0200 }
            if (r0 == 0) goto L_0x01e0
            r0 = 28
            java.lang.String r0 = r3.getString(r0)     // Catch:{ SQLiteException -> 0x0200 }
            r4.mo12640z(r0)     // Catch:{ SQLiteException -> 0x0200 }
        L_0x01e0:
            r4.mo12630p()     // Catch:{ SQLiteException -> 0x0200 }
            boolean r0 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x0200 }
            if (r0 == 0) goto L_0x01fa
            com.google.android.gms.measurement.internal.w3 r0 = r34.mo12427b()     // Catch:{ SQLiteException -> 0x0200 }
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13096F()     // Catch:{ SQLiteException -> 0x0200 }
            java.lang.String r6 = "Got multiple records for app, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r35)     // Catch:{ SQLiteException -> 0x0200 }
            r0.mo13131b(r6, r7)     // Catch:{ SQLiteException -> 0x0200 }
        L_0x01fa:
            if (r3 == 0) goto L_0x01ff
            r3.close()
        L_0x01ff:
            return r4
        L_0x0200:
            r0 = move-exception
            goto L_0x0212
        L_0x0202:
            r0 = move-exception
            r5 = r34
            goto L_0x022a
        L_0x0206:
            r0 = move-exception
            r5 = r34
            goto L_0x0212
        L_0x020a:
            r0 = move-exception
            r5 = r34
            goto L_0x022b
        L_0x020e:
            r0 = move-exception
            r5 = r34
            r3 = r2
        L_0x0212:
            com.google.android.gms.measurement.internal.w3 r4 = r34.mo12427b()     // Catch:{ all -> 0x0229 }
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo13096F()     // Catch:{ all -> 0x0229 }
            java.lang.String r6 = "Error querying app. appId"
            java.lang.Object r1 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r35)     // Catch:{ all -> 0x0229 }
            r4.mo13132c(r6, r1, r0)     // Catch:{ all -> 0x0229 }
            if (r3 == 0) goto L_0x0228
            r3.close()
        L_0x0228:
            return r2
        L_0x0229:
            r0 = move-exception
        L_0x022a:
            r2 = r3
        L_0x022b:
            if (r2 == 0) goto L_0x0230
            r2.close()
        L_0x0230:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2129c.mo12512i0(java.lang.String):com.google.android.gms.measurement.internal.d5");
    }

    @WorkerThread
    /* renamed from: j0 */
    public final List<zzy> mo12513j0(String str, String str2, String str3) {
        C1609u.m4471g(str);
        mo12567h();
        mo12749r();
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
        return mo12501K(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @WorkerThread
    /* renamed from: k0 */
    public final void mo12514k0(String str, String str2) {
        C1609u.m4471g(str);
        C1609u.m4471g(str2);
        mo12567h();
        mo12749r();
        try {
            mo12525v().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            mo12427b().mo13096F().mo13133d("Error deleting user property. appId", C2361w3.m7696w(str), mo13109j().mo12997z(str2), e);
        }
    }

    /* renamed from: m0 */
    public final long mo12515m0(String str) {
        C1609u.m4471g(str);
        mo12567h();
        mo12749r();
        try {
            return (long) mo12525v().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, mo13112m().mo12476u(str, C2302r.f4531p))))});
        } catch (SQLiteException e) {
            mo12427b().mo13096F().mo13132c("Error deleting over the limit events. appId", C2361w3.m7696w(str), e);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a9  */
    @androidx.annotation.WorkerThread
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C2334t9 mo12516n0(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            com.google.android.gms.common.internal.C1609u.m4471g(r19)
            com.google.android.gms.common.internal.C1609u.m4471g(r20)
            r18.mo12567h()
            r18.mo12749r()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.mo12525v()     // Catch:{ SQLiteException -> 0x0082, all -> 0x007e }
            java.lang.String r11 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r1 = "value"
            java.lang.String r2 = "origin"
            java.lang.String[] r12 = new java.lang.String[]{r0, r1, r2}     // Catch:{ SQLiteException -> 0x0082, all -> 0x007e }
            java.lang.String r13 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x0082, all -> 0x007e }
            r1 = 0
            r14[r1] = r19     // Catch:{ SQLiteException -> 0x0082, all -> 0x007e }
            r2 = 1
            r14[r2] = r8     // Catch:{ SQLiteException -> 0x0082, all -> 0x007e }
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ SQLiteException -> 0x0082, all -> 0x007e }
            boolean r3 = r10.moveToFirst()     // Catch:{ SQLiteException -> 0x007a, all -> 0x0076 }
            if (r3 != 0) goto L_0x003f
            if (r10 == 0) goto L_0x003e
            r10.close()
        L_0x003e:
            return r9
        L_0x003f:
            long r5 = r10.getLong(r1)     // Catch:{ SQLiteException -> 0x007a, all -> 0x0076 }
            r11 = r18
            java.lang.Object r7 = r11.m6804E(r10, r2)     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.String r3 = r10.getString(r0)     // Catch:{ SQLiteException -> 0x0074 }
            com.google.android.gms.measurement.internal.t9 r0 = new com.google.android.gms.measurement.internal.t9     // Catch:{ SQLiteException -> 0x0074 }
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch:{ SQLiteException -> 0x0074 }
            boolean r1 = r10.moveToNext()     // Catch:{ SQLiteException -> 0x0074 }
            if (r1 == 0) goto L_0x006e
            com.google.android.gms.measurement.internal.w3 r1 = r18.mo12427b()     // Catch:{ SQLiteException -> 0x0074 }
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo13096F()     // Catch:{ SQLiteException -> 0x0074 }
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r19)     // Catch:{ SQLiteException -> 0x0074 }
            r1.mo13131b(r2, r3)     // Catch:{ SQLiteException -> 0x0074 }
        L_0x006e:
            if (r10 == 0) goto L_0x0073
            r10.close()
        L_0x0073:
            return r0
        L_0x0074:
            r0 = move-exception
            goto L_0x0086
        L_0x0076:
            r0 = move-exception
            r11 = r18
            goto L_0x00a6
        L_0x007a:
            r0 = move-exception
            r11 = r18
            goto L_0x0086
        L_0x007e:
            r0 = move-exception
            r11 = r18
            goto L_0x00a7
        L_0x0082:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L_0x0086:
            com.google.android.gms.measurement.internal.w3 r1 = r18.mo12427b()     // Catch:{ all -> 0x00a5 }
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo13096F()     // Catch:{ all -> 0x00a5 }
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r19)     // Catch:{ all -> 0x00a5 }
            com.google.android.gms.measurement.internal.u3 r4 = r18.mo13109j()     // Catch:{ all -> 0x00a5 }
            java.lang.String r4 = r4.mo12997z(r8)     // Catch:{ all -> 0x00a5 }
            r1.mo13133d(r2, r3, r4, r0)     // Catch:{ all -> 0x00a5 }
            if (r10 == 0) goto L_0x00a4
            r10.close()
        L_0x00a4:
            return r9
        L_0x00a5:
            r0 = move-exception
        L_0x00a6:
            r9 = r10
        L_0x00a7:
            if (r9 == 0) goto L_0x00ac
            r9.close()
        L_0x00ac:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2129c.mo12516n0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.t9");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0125  */
    @androidx.annotation.WorkerThread
    /* renamed from: o0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzy mo12517o0(java.lang.String r30, java.lang.String r31) {
        /*
            r29 = this;
            r7 = r31
            com.google.android.gms.common.internal.C1609u.m4471g(r30)
            com.google.android.gms.common.internal.C1609u.m4471g(r31)
            r29.mo12567h()
            r29.mo12749r()
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r29.mo12525v()     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            java.lang.String r10 = "conditional_properties"
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
            java.lang.String[] r11 = new java.lang.String[]{r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            java.lang.String r12 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            r1 = 0
            r13[r1] = r30     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            r2 = 1
            r13[r2] = r7     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            r14 = 0
            r15 = 0
            r16 = 0
            android.database.Cursor r9 = r9.query(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ SQLiteException -> 0x00fe, all -> 0x00fa }
            boolean r3 = r9.moveToFirst()     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f2 }
            if (r3 != 0) goto L_0x004e
            if (r9 == 0) goto L_0x004d
            r9.close()
        L_0x004d:
            return r8
        L_0x004e:
            java.lang.String r16 = r9.getString(r1)     // Catch:{ SQLiteException -> 0x00f6, all -> 0x00f2 }
            r10 = r29
            java.lang.Object r5 = r10.m6804E(r9, r2)     // Catch:{ SQLiteException -> 0x00f0 }
            int r0 = r9.getInt(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            if (r0 == 0) goto L_0x0061
            r20 = 1
            goto L_0x0063
        L_0x0061:
            r20 = 0
        L_0x0063:
            r0 = 3
            java.lang.String r21 = r9.getString(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 4
            long r23 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.p9 r0 = r29.mo12778n()     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = 5
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzaq> r2 = com.google.android.gms.measurement.internal.zzaq.CREATOR     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable r0 = r0.mo12895w(r1, r2)     // Catch:{ SQLiteException -> 0x00f0 }
            r22 = r0
            com.google.android.gms.measurement.internal.zzaq r22 = (com.google.android.gms.measurement.internal.zzaq) r22     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 6
            long r18 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.p9 r0 = r29.mo12778n()     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = 7
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzaq> r2 = com.google.android.gms.measurement.internal.zzaq.CREATOR     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable r0 = r0.mo12895w(r1, r2)     // Catch:{ SQLiteException -> 0x00f0 }
            r25 = r0
            com.google.android.gms.measurement.internal.zzaq r25 = (com.google.android.gms.measurement.internal.zzaq) r25     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 8
            long r3 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            r0 = 9
            long r26 = r9.getLong(r0)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.p9 r0 = r29.mo12778n()     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = 10
            byte[] r1 = r9.getBlob(r1)     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzaq> r2 = com.google.android.gms.measurement.internal.zzaq.CREATOR     // Catch:{ SQLiteException -> 0x00f0 }
            android.os.Parcelable r0 = r0.mo12895w(r1, r2)     // Catch:{ SQLiteException -> 0x00f0 }
            r28 = r0
            com.google.android.gms.measurement.internal.zzaq r28 = (com.google.android.gms.measurement.internal.zzaq) r28     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.zzkn r17 = new com.google.android.gms.measurement.internal.zzkn     // Catch:{ SQLiteException -> 0x00f0 }
            r1 = r17
            r2 = r31
            r6 = r16
            r1.<init>(r2, r3, r5, r6)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.zzy r0 = new com.google.android.gms.measurement.internal.zzy     // Catch:{ SQLiteException -> 0x00f0 }
            r14 = r0
            r15 = r30
            r14.<init>(r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r28)     // Catch:{ SQLiteException -> 0x00f0 }
            boolean r1 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x00f0 }
            if (r1 == 0) goto L_0x00ea
            com.google.android.gms.measurement.internal.w3 r1 = r29.mo12427b()     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo13096F()     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r2 = "Got multiple records for conditional property, expected one"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r30)     // Catch:{ SQLiteException -> 0x00f0 }
            com.google.android.gms.measurement.internal.u3 r4 = r29.mo13109j()     // Catch:{ SQLiteException -> 0x00f0 }
            java.lang.String r4 = r4.mo12997z(r7)     // Catch:{ SQLiteException -> 0x00f0 }
            r1.mo13132c(r2, r3, r4)     // Catch:{ SQLiteException -> 0x00f0 }
        L_0x00ea:
            if (r9 == 0) goto L_0x00ef
            r9.close()
        L_0x00ef:
            return r0
        L_0x00f0:
            r0 = move-exception
            goto L_0x0102
        L_0x00f2:
            r0 = move-exception
            r10 = r29
            goto L_0x0122
        L_0x00f6:
            r0 = move-exception
            r10 = r29
            goto L_0x0102
        L_0x00fa:
            r0 = move-exception
            r10 = r29
            goto L_0x0123
        L_0x00fe:
            r0 = move-exception
            r10 = r29
            r9 = r8
        L_0x0102:
            com.google.android.gms.measurement.internal.w3 r1 = r29.mo12427b()     // Catch:{ all -> 0x0121 }
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo13096F()     // Catch:{ all -> 0x0121 }
            java.lang.String r2 = "Error querying conditional property"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r30)     // Catch:{ all -> 0x0121 }
            com.google.android.gms.measurement.internal.u3 r4 = r29.mo13109j()     // Catch:{ all -> 0x0121 }
            java.lang.String r4 = r4.mo12997z(r7)     // Catch:{ all -> 0x0121 }
            r1.mo13133d(r2, r3, r4, r0)     // Catch:{ all -> 0x0121 }
            if (r9 == 0) goto L_0x0120
            r9.close()
        L_0x0120:
            return r8
        L_0x0121:
            r0 = move-exception
        L_0x0122:
            r8 = r9
        L_0x0123:
            if (r8 == 0) goto L_0x0128
            r8.close()
        L_0x0128:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2129c.mo12517o0(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzy");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0073  */
    @androidx.annotation.WorkerThread
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo12518p0(java.lang.String r11) {
        /*
            r10 = this;
            com.google.android.gms.common.internal.C1609u.m4471g(r11)
            r10.mo12567h()
            r10.mo12749r()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.mo12525v()     // Catch:{ SQLiteException -> 0x0056, all -> 0x0054 }
            java.lang.String r2 = "apps"
            java.lang.String r3 = "remote_config"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x0056, all -> 0x0054 }
            java.lang.String r4 = "app_id=?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0056, all -> 0x0054 }
            r9 = 0
            r5[r9] = r11     // Catch:{ SQLiteException -> 0x0056, all -> 0x0054 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0056, all -> 0x0054 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0052 }
            if (r2 != 0) goto L_0x0031
            if (r1 == 0) goto L_0x0030
            r1.close()
        L_0x0030:
            return r0
        L_0x0031:
            byte[] r2 = r1.getBlob(r9)     // Catch:{ SQLiteException -> 0x0052 }
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0052 }
            if (r3 == 0) goto L_0x004c
            com.google.android.gms.measurement.internal.w3 r3 = r10.mo12427b()     // Catch:{ SQLiteException -> 0x0052 }
            com.google.android.gms.measurement.internal.y3 r3 = r3.mo13096F()     // Catch:{ SQLiteException -> 0x0052 }
            java.lang.String r4 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r11)     // Catch:{ SQLiteException -> 0x0052 }
            r3.mo13131b(r4, r5)     // Catch:{ SQLiteException -> 0x0052 }
        L_0x004c:
            if (r1 == 0) goto L_0x0051
            r1.close()
        L_0x0051:
            return r2
        L_0x0052:
            r2 = move-exception
            goto L_0x0058
        L_0x0054:
            r11 = move-exception
            goto L_0x0071
        L_0x0056:
            r2 = move-exception
            r1 = r0
        L_0x0058:
            com.google.android.gms.measurement.internal.w3 r3 = r10.mo12427b()     // Catch:{ all -> 0x006f }
            com.google.android.gms.measurement.internal.y3 r3 = r3.mo13096F()     // Catch:{ all -> 0x006f }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r11)     // Catch:{ all -> 0x006f }
            r3.mo13132c(r4, r11, r2)     // Catch:{ all -> 0x006f }
            if (r1 == 0) goto L_0x006e
            r1.close()
        L_0x006e:
            return r0
        L_0x006f:
            r11 = move-exception
            r0 = r1
        L_0x0071:
            if (r0 == 0) goto L_0x0076
            r0.close()
        L_0x0076:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2129c.mo12518p0(java.lang.String):byte[]");
    }

    @WorkerThread
    /* renamed from: q0 */
    public final int mo12519q0(String str, String str2) {
        C1609u.m4471g(str);
        C1609u.m4471g(str2);
        mo12567h();
        mo12749r();
        try {
            return mo12525v().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            mo12427b().mo13096F().mo13133d("Error deleting conditional property", C2361w3.m7696w(str), mo13109j().mo12997z(str2), e);
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public final Map<Integer, List<C1775f0>> mo12520r0(String str) {
        C1609u.m4471g(str);
        ArrayMap arrayMap = new ArrayMap();
        SQLiteDatabase v = mo12525v();
        Cursor cursor = null;
        try {
            cursor = v.query("event_filters", new String[]{"audience_id", Packet.DATA}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
            if (!cursor.moveToFirst()) {
                Map<Integer, List<C1775f0>> emptyMap = Collections.emptyMap();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyMap;
            }
            do {
                byte[] blob = cursor.getBlob(1);
                try {
                    C1775f0.C1776a R = C1775f0.m5051R();
                    C2290p9.m7352y(R, blob);
                    C1775f0 f0Var = (C1775f0) ((C1889m4) R.mo11851I());
                    if (f0Var.mo11624K()) {
                        int i = cursor.getInt(0);
                        List list = (List) arrayMap.get(Integer.valueOf(i));
                        if (list == null) {
                            list = new ArrayList();
                            arrayMap.put(Integer.valueOf(i), list);
                        }
                        list.add(f0Var);
                    }
                } catch (IOException e) {
                    mo12427b().mo13096F().mo13132c("Failed to merge filter. appId", C2361w3.m7696w(str), e);
                }
            } while (cursor.moveToNext());
            if (cursor != null) {
                cursor.close();
            }
            return arrayMap;
        } catch (SQLiteException e2) {
            mo12427b().mo13096F().mo13132c("Database error querying filters. appId", C2361w3.m7696w(str), e2);
            Map<Integer, List<C1775f0>> emptyMap2 = Collections.emptyMap();
            if (cursor != null) {
                cursor.close();
            }
            return emptyMap2;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0086  */
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> mo12521s0(java.lang.String r8) {
        /*
            r7 = this;
            r7.mo12749r()
            r7.mo12567h()
            com.google.android.gms.common.internal.C1609u.m4471g(r8)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r7.mo12525v()
            r2 = 0
            java.lang.String r3 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0069, all -> 0x0067 }
            r5 = 0
            r4[r5] = r8     // Catch:{ SQLiteException -> 0x0069, all -> 0x0067 }
            r6 = 1
            r4[r6] = r8     // Catch:{ SQLiteException -> 0x0069, all -> 0x0067 }
            android.database.Cursor r1 = r1.rawQuery(r3, r4)     // Catch:{ SQLiteException -> 0x0069, all -> 0x0067 }
            boolean r3 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0065 }
            if (r3 != 0) goto L_0x0032
            java.util.Map r8 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0065 }
            if (r1 == 0) goto L_0x0031
            r1.close()
        L_0x0031:
            return r8
        L_0x0032:
            int r3 = r1.getInt(r5)     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ SQLiteException -> 0x0065 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ SQLiteException -> 0x0065 }
            if (r4 != 0) goto L_0x004e
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0065 }
            r4.<init>()     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0065 }
            r0.put(r3, r4)     // Catch:{ SQLiteException -> 0x0065 }
        L_0x004e:
            int r3 = r1.getInt(r6)     // Catch:{ SQLiteException -> 0x0065 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ SQLiteException -> 0x0065 }
            r4.add(r3)     // Catch:{ SQLiteException -> 0x0065 }
            boolean r3 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0065 }
            if (r3 != 0) goto L_0x0032
            if (r1 == 0) goto L_0x0064
            r1.close()
        L_0x0064:
            return r0
        L_0x0065:
            r0 = move-exception
            goto L_0x006b
        L_0x0067:
            r8 = move-exception
            goto L_0x0084
        L_0x0069:
            r0 = move-exception
            r1 = r2
        L_0x006b:
            com.google.android.gms.measurement.internal.w3 r3 = r7.mo12427b()     // Catch:{ all -> 0x0082 }
            com.google.android.gms.measurement.internal.y3 r3 = r3.mo13096F()     // Catch:{ all -> 0x0082 }
            java.lang.String r4 = "Database error querying scoped filters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r8)     // Catch:{ all -> 0x0082 }
            r3.mo13132c(r4, r8, r0)     // Catch:{ all -> 0x0082 }
            if (r1 == 0) goto L_0x0081
            r1.close()
        L_0x0081:
            return r2
        L_0x0082:
            r8 = move-exception
            r2 = r1
        L_0x0084:
            if (r2 == 0) goto L_0x0089
            r2.close()
        L_0x0089:
            goto L_0x008b
        L_0x008a:
            throw r8
        L_0x008b:
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2129c.mo12521s0(java.lang.String):java.util.Map");
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo12453t() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b6  */
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.C1775f0>> mo12522t0(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.mo12749r()
            r12.mo12567h()
            com.google.android.gms.common.internal.C1609u.m4471g(r13)
            com.google.android.gms.common.internal.C1609u.m4471g(r14)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.mo12525v()
            r9 = 0
            java.lang.String r2 = "event_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            java.lang.String r4 = "app_id=? AND event_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            r10 = 0
            r5[r10] = r13     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            r11 = 1
            r5[r11] = r14     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0095 }
            if (r1 != 0) goto L_0x0042
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0095 }
            if (r14 == 0) goto L_0x0041
            r14.close()
        L_0x0041:
            return r13
        L_0x0042:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x0095 }
            com.google.android.gms.internal.measurement.f0$a r2 = com.google.android.gms.internal.measurement.C1775f0.m5051R()     // Catch:{ IOException -> 0x0077 }
            com.google.android.gms.measurement.internal.C2290p9.m7352y(r2, r1)     // Catch:{ IOException -> 0x0077 }
            com.google.android.gms.internal.measurement.f0$a r2 = (com.google.android.gms.internal.measurement.C1775f0.C1776a) r2     // Catch:{ IOException -> 0x0077 }
            com.google.android.gms.internal.measurement.x5 r1 = r2.mo11851I()     // Catch:{ IOException -> 0x0077 }
            com.google.android.gms.internal.measurement.m4 r1 = (com.google.android.gms.internal.measurement.C1889m4) r1     // Catch:{ IOException -> 0x0077 }
            com.google.android.gms.internal.measurement.f0 r1 = (com.google.android.gms.internal.measurement.C1775f0) r1     // Catch:{ IOException -> 0x0077 }
            int r2 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x0095 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x0095 }
            if (r3 != 0) goto L_0x0073
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0095 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0095 }
            r0.put(r2, r3)     // Catch:{ SQLiteException -> 0x0095 }
        L_0x0073:
            r3.add(r1)     // Catch:{ SQLiteException -> 0x0095 }
            goto L_0x0089
        L_0x0077:
            r1 = move-exception
            com.google.android.gms.measurement.internal.w3 r2 = r12.mo12427b()     // Catch:{ SQLiteException -> 0x0095 }
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo13096F()     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.String r3 = "Failed to merge filter. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r13)     // Catch:{ SQLiteException -> 0x0095 }
            r2.mo13132c(r3, r4, r1)     // Catch:{ SQLiteException -> 0x0095 }
        L_0x0089:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0095 }
            if (r1 != 0) goto L_0x0042
            if (r14 == 0) goto L_0x0094
            r14.close()
        L_0x0094:
            return r0
        L_0x0095:
            r0 = move-exception
            goto L_0x009b
        L_0x0097:
            r13 = move-exception
            goto L_0x00b4
        L_0x0099:
            r0 = move-exception
            r14 = r9
        L_0x009b:
            com.google.android.gms.measurement.internal.w3 r1 = r12.mo12427b()     // Catch:{ all -> 0x00b2 }
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo13096F()     // Catch:{ all -> 0x00b2 }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r13)     // Catch:{ all -> 0x00b2 }
            r1.mo13132c(r2, r13, r0)     // Catch:{ all -> 0x00b2 }
            if (r14 == 0) goto L_0x00b1
            r14.close()
        L_0x00b1:
            return r9
        L_0x00b2:
            r13 = move-exception
            r9 = r14
        L_0x00b4:
            if (r9 == 0) goto L_0x00b9
            r9.close()
        L_0x00b9:
            goto L_0x00bb
        L_0x00ba:
            throw r13
        L_0x00bb:
            goto L_0x00ba
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2129c.mo12522t0(java.lang.String, java.lang.String):java.util.Map");
    }

    @WorkerThread
    /* renamed from: u */
    public final void mo12523u() {
        mo12749r();
        mo12525v().setTransactionSuccessful();
    }

    @WorkerThread
    /* renamed from: u0 */
    public final void mo12524u0() {
        mo12749r();
        mo12525v().beginTransaction();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @VisibleForTesting
    /* renamed from: v */
    public final SQLiteDatabase mo12525v() {
        mo12567h();
        try {
            return this.f3989d.getWritableDatabase();
        } catch (SQLiteException e) {
            mo12427b().mo13099J().mo13131b("Error opening database", e);
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009c  */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, com.google.android.gms.internal.measurement.C2088z0> mo12526v0(java.lang.String r12) {
        /*
            r11 = this;
            r11.mo12749r()
            r11.mo12567h()
            com.google.android.gms.common.internal.C1609u.m4471g(r12)
            android.database.sqlite.SQLiteDatabase r0 = r11.mo12525v()
            r8 = 0
            java.lang.String r1 = "audience_filter_values"
            java.lang.String r2 = "audience_id"
            java.lang.String r3 = "current_results"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch:{ SQLiteException -> 0x007f, all -> 0x007d }
            java.lang.String r3 = "app_id=?"
            r9 = 1
            java.lang.String[] r4 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x007f, all -> 0x007d }
            r10 = 0
            r4[r10] = r12     // Catch:{ SQLiteException -> 0x007f, all -> 0x007d }
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ SQLiteException -> 0x007f, all -> 0x007d }
            boolean r1 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x007b }
            if (r1 != 0) goto L_0x0033
            if (r0 == 0) goto L_0x0032
            r0.close()
        L_0x0032:
            return r8
        L_0x0033:
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap     // Catch:{ SQLiteException -> 0x007b }
            r1.<init>()     // Catch:{ SQLiteException -> 0x007b }
        L_0x0038:
            int r2 = r0.getInt(r10)     // Catch:{ SQLiteException -> 0x007b }
            byte[] r3 = r0.getBlob(r9)     // Catch:{ SQLiteException -> 0x007b }
            com.google.android.gms.internal.measurement.z0$a r4 = com.google.android.gms.internal.measurement.C2088z0.m6633b0()     // Catch:{ IOException -> 0x0059 }
            com.google.android.gms.measurement.internal.C2290p9.m7352y(r4, r3)     // Catch:{ IOException -> 0x0059 }
            com.google.android.gms.internal.measurement.z0$a r4 = (com.google.android.gms.internal.measurement.C2088z0.C2089a) r4     // Catch:{ IOException -> 0x0059 }
            com.google.android.gms.internal.measurement.x5 r3 = r4.mo11851I()     // Catch:{ IOException -> 0x0059 }
            com.google.android.gms.internal.measurement.m4 r3 = (com.google.android.gms.internal.measurement.C1889m4) r3     // Catch:{ IOException -> 0x0059 }
            com.google.android.gms.internal.measurement.z0 r3 = (com.google.android.gms.internal.measurement.C2088z0) r3     // Catch:{ IOException -> 0x0059 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x007b }
            r1.put(r2, r3)     // Catch:{ SQLiteException -> 0x007b }
            goto L_0x006f
        L_0x0059:
            r3 = move-exception
            com.google.android.gms.measurement.internal.w3 r4 = r11.mo12427b()     // Catch:{ SQLiteException -> 0x007b }
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo13096F()     // Catch:{ SQLiteException -> 0x007b }
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r12)     // Catch:{ SQLiteException -> 0x007b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x007b }
            r4.mo13133d(r5, r6, r2, r3)     // Catch:{ SQLiteException -> 0x007b }
        L_0x006f:
            boolean r2 = r0.moveToNext()     // Catch:{ SQLiteException -> 0x007b }
            if (r2 != 0) goto L_0x0038
            if (r0 == 0) goto L_0x007a
            r0.close()
        L_0x007a:
            return r1
        L_0x007b:
            r1 = move-exception
            goto L_0x0081
        L_0x007d:
            r12 = move-exception
            goto L_0x009a
        L_0x007f:
            r1 = move-exception
            r0 = r8
        L_0x0081:
            com.google.android.gms.measurement.internal.w3 r2 = r11.mo12427b()     // Catch:{ all -> 0x0098 }
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo13096F()     // Catch:{ all -> 0x0098 }
            java.lang.String r3 = "Database error querying filter results. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r12)     // Catch:{ all -> 0x0098 }
            r2.mo13132c(r3, r12, r1)     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0097
            r0.close()
        L_0x0097:
            return r8
        L_0x0098:
            r12 = move-exception
            r8 = r0
        L_0x009a:
            if (r8 == 0) goto L_0x009f
            r8.close()
        L_0x009f:
            goto L_0x00a1
        L_0x00a0:
            throw r12
        L_0x00a1:
            goto L_0x00a0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2129c.mo12526v0(java.lang.String):java.util.Map");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0041  */
    @androidx.annotation.WorkerThread
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo12527w() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.mo12525v()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ SQLiteException -> 0x0029, all -> 0x0024 }
            boolean r2 = r0.moveToFirst()     // Catch:{ SQLiteException -> 0x0022 }
            if (r2 == 0) goto L_0x001c
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch:{ SQLiteException -> 0x0022 }
            if (r0 == 0) goto L_0x001b
            r0.close()
        L_0x001b:
            return r1
        L_0x001c:
            if (r0 == 0) goto L_0x0021
            r0.close()
        L_0x0021:
            return r1
        L_0x0022:
            r2 = move-exception
            goto L_0x002b
        L_0x0024:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x003f
        L_0x0029:
            r2 = move-exception
            r0 = r1
        L_0x002b:
            com.google.android.gms.measurement.internal.w3 r3 = r6.mo12427b()     // Catch:{ all -> 0x003e }
            com.google.android.gms.measurement.internal.y3 r3 = r3.mo13096F()     // Catch:{ all -> 0x003e }
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.mo13131b(r4, r2)     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x003d
            r0.close()
        L_0x003d:
            return r1
        L_0x003e:
            r1 = move-exception
        L_0x003f:
            if (r0 == 0) goto L_0x0044
            r0.close()
        L_0x0044:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2129c.mo12527w():java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b6  */
    /* renamed from: w0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.C1821i0>> mo12528w0(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r12.mo12749r()
            r12.mo12567h()
            com.google.android.gms.common.internal.C1609u.m4471g(r13)
            com.google.android.gms.common.internal.C1609u.m4471g(r14)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r1 = r12.mo12525v()
            r9 = 0
            java.lang.String r2 = "property_filters"
            java.lang.String r3 = "audience_id"
            java.lang.String r4 = "data"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            java.lang.String r4 = "app_id=? AND property_name=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            r10 = 0
            r5[r10] = r13     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            r11 = 1
            r5[r11] = r14     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x0099, all -> 0x0097 }
            boolean r1 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x0095 }
            if (r1 != 0) goto L_0x0042
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0095 }
            if (r14 == 0) goto L_0x0041
            r14.close()
        L_0x0041:
            return r13
        L_0x0042:
            byte[] r1 = r14.getBlob(r11)     // Catch:{ SQLiteException -> 0x0095 }
            com.google.android.gms.internal.measurement.i0$a r2 = com.google.android.gms.internal.measurement.C1821i0.m5224K()     // Catch:{ IOException -> 0x0077 }
            com.google.android.gms.measurement.internal.C2290p9.m7352y(r2, r1)     // Catch:{ IOException -> 0x0077 }
            com.google.android.gms.internal.measurement.i0$a r2 = (com.google.android.gms.internal.measurement.C1821i0.C1822a) r2     // Catch:{ IOException -> 0x0077 }
            com.google.android.gms.internal.measurement.x5 r1 = r2.mo11851I()     // Catch:{ IOException -> 0x0077 }
            com.google.android.gms.internal.measurement.m4 r1 = (com.google.android.gms.internal.measurement.C1889m4) r1     // Catch:{ IOException -> 0x0077 }
            com.google.android.gms.internal.measurement.i0 r1 = (com.google.android.gms.internal.measurement.C1821i0) r1     // Catch:{ IOException -> 0x0077 }
            int r2 = r14.getInt(r10)     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ SQLiteException -> 0x0095 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ SQLiteException -> 0x0095 }
            if (r3 != 0) goto L_0x0073
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0095 }
            r3.<init>()     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ SQLiteException -> 0x0095 }
            r0.put(r2, r3)     // Catch:{ SQLiteException -> 0x0095 }
        L_0x0073:
            r3.add(r1)     // Catch:{ SQLiteException -> 0x0095 }
            goto L_0x0089
        L_0x0077:
            r1 = move-exception
            com.google.android.gms.measurement.internal.w3 r2 = r12.mo12427b()     // Catch:{ SQLiteException -> 0x0095 }
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo13096F()     // Catch:{ SQLiteException -> 0x0095 }
            java.lang.String r3 = "Failed to merge filter"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r13)     // Catch:{ SQLiteException -> 0x0095 }
            r2.mo13132c(r3, r4, r1)     // Catch:{ SQLiteException -> 0x0095 }
        L_0x0089:
            boolean r1 = r14.moveToNext()     // Catch:{ SQLiteException -> 0x0095 }
            if (r1 != 0) goto L_0x0042
            if (r14 == 0) goto L_0x0094
            r14.close()
        L_0x0094:
            return r0
        L_0x0095:
            r0 = move-exception
            goto L_0x009b
        L_0x0097:
            r13 = move-exception
            goto L_0x00b4
        L_0x0099:
            r0 = move-exception
            r14 = r9
        L_0x009b:
            com.google.android.gms.measurement.internal.w3 r1 = r12.mo12427b()     // Catch:{ all -> 0x00b2 }
            com.google.android.gms.measurement.internal.y3 r1 = r1.mo13096F()     // Catch:{ all -> 0x00b2 }
            java.lang.String r2 = "Database error querying filters. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r13)     // Catch:{ all -> 0x00b2 }
            r1.mo13132c(r2, r13, r0)     // Catch:{ all -> 0x00b2 }
            if (r14 == 0) goto L_0x00b1
            r14.close()
        L_0x00b1:
            return r9
        L_0x00b2:
            r13 = move-exception
            r9 = r14
        L_0x00b4:
            if (r9 == 0) goto L_0x00b9
            r9.close()
        L_0x00b9:
            goto L_0x00bb
        L_0x00ba:
            throw r13
        L_0x00bb:
            goto L_0x00ba
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2129c.mo12528w0(java.lang.String, java.lang.String):java.util.Map");
    }

    /* renamed from: x */
    public final long mo12529x(C2056x0 x0Var) {
        mo12567h();
        mo12749r();
        C1609u.m4475k(x0Var);
        C1609u.m4471g(x0Var.mo12206I2());
        byte[] h = x0Var.mo12168h();
        long v = mo12778n().mo12894v(h);
        ContentValues contentValues = new ContentValues();
        contentValues.put(Constants.APP_ID, x0Var.mo12206I2());
        contentValues.put("metadata_fingerprint", Long.valueOf(v));
        contentValues.put("metadata", h);
        try {
            mo12525v().insertWithOnConflict("raw_events_metadata", (String) null, contentValues, 4);
            return v;
        } catch (SQLiteException e) {
            mo12427b().mo13096F().mo13132c("Error storing raw event metadata. appId", C2361w3.m7696w(x0Var.mo12206I2()), e);
            throw e;
        }
    }

    /* renamed from: x0 */
    public final long mo12530x0(String str) {
        C1609u.m4471g(str);
        return m6819y("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    @VisibleForTesting
    /* renamed from: y0 */
    public final long mo12531y0(String str, String str2) {
        long y;
        String str3 = str;
        String str4 = str2;
        C1609u.m4471g(str);
        C1609u.m4471g(str2);
        mo12567h();
        mo12749r();
        SQLiteDatabase v = mo12525v();
        v.beginTransaction();
        long j = 0;
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 32);
            sb.append("select ");
            sb.append(str4);
            sb.append(" from app2 where app_id=?");
            try {
                y = m6819y(sb.toString(), new String[]{str3}, -1);
                if (y == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(Constants.APP_ID, str3);
                    contentValues.put("first_open_count", 0);
                    contentValues.put("previous_install_count", 0);
                    if (v.insertWithOnConflict("app2", (String) null, contentValues, 5) == -1) {
                        mo12427b().mo13096F().mo13132c("Failed to insert column (got -1). appId", C2361w3.m7696w(str), str4);
                        v.endTransaction();
                        return -1;
                    }
                    y = 0;
                }
            } catch (SQLiteException e) {
                e = e;
                try {
                    mo12427b().mo13096F().mo13133d("Error inserting column. appId", C2361w3.m7696w(str), str4, e);
                    v.endTransaction();
                    return j;
                } catch (Throwable th) {
                    th = th;
                    v.endTransaction();
                    throw th;
                }
            }
            try {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(Constants.APP_ID, str3);
                contentValues2.put(str4, Long.valueOf(1 + y));
                if (((long) v.update("app2", contentValues2, "app_id = ?", new String[]{str3})) == 0) {
                    mo12427b().mo13096F().mo13132c("Failed to update column (got 0). appId", C2361w3.m7696w(str), str4);
                    v.endTransaction();
                    return -1;
                }
                v.setTransactionSuccessful();
                v.endTransaction();
                return y;
            } catch (SQLiteException e2) {
                e = e2;
                j = y;
                mo12427b().mo13096F().mo13133d("Error inserting column. appId", C2361w3.m7696w(str), str4, e);
                v.endTransaction();
                return j;
            }
        } catch (SQLiteException e3) {
            e = e3;
            mo12427b().mo13096F().mo13133d("Error inserting column. appId", C2361w3.m7696w(str), str4, e);
            v.endTransaction();
            return j;
        } catch (Throwable th2) {
            th = th2;
            v.endTransaction();
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0093  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<com.google.android.gms.internal.measurement.C1994t0, java.lang.Long> mo12532z(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.mo12567h()
            r7.mo12749r()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.mo12525v()     // Catch:{ SQLiteException -> 0x007a, all -> 0x0078 }
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x007a, all -> 0x0078 }
            r4 = 0
            r3[r4] = r8     // Catch:{ SQLiteException -> 0x007a, all -> 0x0078 }
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x007a, all -> 0x0078 }
            r6 = 1
            r3[r6] = r5     // Catch:{ SQLiteException -> 0x007a, all -> 0x0078 }
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch:{ SQLiteException -> 0x007a, all -> 0x0078 }
            boolean r2 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x0076 }
            if (r2 != 0) goto L_0x0037
            com.google.android.gms.measurement.internal.w3 r8 = r7.mo12427b()     // Catch:{ SQLiteException -> 0x0076 }
            com.google.android.gms.measurement.internal.y3 r8 = r8.mo13104O()     // Catch:{ SQLiteException -> 0x0076 }
            java.lang.String r9 = "Main event not found"
            r8.mo13130a(r9)     // Catch:{ SQLiteException -> 0x0076 }
            if (r1 == 0) goto L_0x0036
            r1.close()
        L_0x0036:
            return r0
        L_0x0037:
            byte[] r2 = r1.getBlob(r4)     // Catch:{ SQLiteException -> 0x0076 }
            long r3 = r1.getLong(r6)     // Catch:{ SQLiteException -> 0x0076 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ SQLiteException -> 0x0076 }
            com.google.android.gms.internal.measurement.t0$a r4 = com.google.android.gms.internal.measurement.C1994t0.m5974c0()     // Catch:{ IOException -> 0x005e }
            com.google.android.gms.measurement.internal.C2290p9.m7352y(r4, r2)     // Catch:{ IOException -> 0x005e }
            com.google.android.gms.internal.measurement.t0$a r4 = (com.google.android.gms.internal.measurement.C1994t0.C1995a) r4     // Catch:{ IOException -> 0x005e }
            com.google.android.gms.internal.measurement.x5 r2 = r4.mo11851I()     // Catch:{ IOException -> 0x005e }
            com.google.android.gms.internal.measurement.m4 r2 = (com.google.android.gms.internal.measurement.C1889m4) r2     // Catch:{ IOException -> 0x005e }
            com.google.android.gms.internal.measurement.t0 r2 = (com.google.android.gms.internal.measurement.C1994t0) r2     // Catch:{ IOException -> 0x005e }
            android.util.Pair r8 = android.util.Pair.create(r2, r3)     // Catch:{ SQLiteException -> 0x0076 }
            if (r1 == 0) goto L_0x005d
            r1.close()
        L_0x005d:
            return r8
        L_0x005e:
            r2 = move-exception
            com.google.android.gms.measurement.internal.w3 r3 = r7.mo12427b()     // Catch:{ SQLiteException -> 0x0076 }
            com.google.android.gms.measurement.internal.y3 r3 = r3.mo13096F()     // Catch:{ SQLiteException -> 0x0076 }
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C2361w3.m7696w(r8)     // Catch:{ SQLiteException -> 0x0076 }
            r3.mo13133d(r4, r8, r9, r2)     // Catch:{ SQLiteException -> 0x0076 }
            if (r1 == 0) goto L_0x0075
            r1.close()
        L_0x0075:
            return r0
        L_0x0076:
            r8 = move-exception
            goto L_0x007c
        L_0x0078:
            r8 = move-exception
            goto L_0x0091
        L_0x007a:
            r8 = move-exception
            r1 = r0
        L_0x007c:
            com.google.android.gms.measurement.internal.w3 r9 = r7.mo12427b()     // Catch:{ all -> 0x008f }
            com.google.android.gms.measurement.internal.y3 r9 = r9.mo13096F()     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "Error selecting main event"
            r9.mo13131b(r2, r8)     // Catch:{ all -> 0x008f }
            if (r1 == 0) goto L_0x008e
            r1.close()
        L_0x008e:
            return r0
        L_0x008f:
            r8 = move-exception
            r0 = r1
        L_0x0091:
            if (r0 == 0) goto L_0x0096
            r0.close()
        L_0x0096:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2129c.mo12532z(java.lang.String, java.lang.Long):android.util.Pair");
    }

    @WorkerThread
    /* renamed from: z0 */
    public final void mo12533z0() {
        mo12749r();
        mo12525v().endTransaction();
    }
}

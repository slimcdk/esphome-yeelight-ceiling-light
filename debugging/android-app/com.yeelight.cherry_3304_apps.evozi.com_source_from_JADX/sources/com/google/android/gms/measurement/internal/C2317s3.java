package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.VisibleForTesting;
import com.miot.service.manager.timer.TimerCodec;

/* renamed from: com.google.android.gms.measurement.internal.s3 */
public final class C2317s3 extends C2133c3 {

    /* renamed from: c */
    private final C2350v3 f4576c = new C2350v3(this, mo12428c(), "google_app_measurement_local.db");

    /* renamed from: d */
    private boolean f4577d;

    C2317s3(C2111a5 a5Var) {
        super(a5Var);
    }

    /* renamed from: B */
    private static long m7535B(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, (String) null, (String) null, "rowid desc", TimerCodec.ENABLE);
            if (cursor.moveToFirst()) {
                return cursor.getLong(0);
            }
            if (cursor == null) {
                return -1;
            }
            cursor.close();
            return -1;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r7v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c4 A[SYNTHETIC, Splitter:B:47:0x00c4] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0118 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0118 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0118 A[SYNTHETIC] */
    @androidx.annotation.WorkerThread
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m7536D(int r17, byte[] r18) {
        /*
            r16 = this;
            r1 = r16
            r16.mo12566d()
            r16.mo12567h()
            boolean r0 = r1.f4577d
            r2 = 0
            if (r0 == 0) goto L_0x000e
            return r2
        L_0x000e:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            java.lang.String r4 = "type"
            r3.put(r4, r0)
            java.lang.String r0 = "entry"
            r4 = r18
            r3.put(r0, r4)
            r4 = 5
            r5 = 0
            r6 = 5
        L_0x0026:
            if (r5 >= r4) goto L_0x012a
            r7 = 0
            r8 = 1
            android.database.sqlite.SQLiteDatabase r9 = r16.m7537L()     // Catch:{ SQLiteFullException -> 0x00fe, SQLiteDatabaseLockedException -> 0x00ec, SQLiteException -> 0x00c0, all -> 0x00bd }
            if (r9 != 0) goto L_0x0038
            r1.f4577d = r8     // Catch:{ SQLiteFullException -> 0x00bb, SQLiteDatabaseLockedException -> 0x00ed, SQLiteException -> 0x00b7 }
            if (r9 == 0) goto L_0x0037
            r9.close()
        L_0x0037:
            return r2
        L_0x0038:
            r9.beginTransaction()     // Catch:{ SQLiteFullException -> 0x00bb, SQLiteDatabaseLockedException -> 0x00ed, SQLiteException -> 0x00b7 }
            r10 = 0
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r12 = r9.rawQuery(r0, r7)     // Catch:{ SQLiteFullException -> 0x00bb, SQLiteDatabaseLockedException -> 0x00ed, SQLiteException -> 0x00b7 }
            if (r12 == 0) goto L_0x0059
            boolean r0 = r12.moveToFirst()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            if (r0 == 0) goto L_0x0059
            long r10 = r12.getLong(r2)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            goto L_0x0059
        L_0x0050:
            r0 = move-exception
            goto L_0x00ea
        L_0x0053:
            r0 = move-exception
            goto L_0x00b9
        L_0x0055:
            r0 = move-exception
            r7 = r12
            goto L_0x0100
        L_0x0059:
            java.lang.String r0 = "messages"
            r13 = 100000(0x186a0, double:4.94066E-319)
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x00a0
            com.google.android.gms.measurement.internal.w3 r15 = r16.mo12427b()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            com.google.android.gms.measurement.internal.y3 r15 = r15.mo13096F()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            java.lang.String r4 = "Data loss, local db full"
            r15.mo13130a(r4)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            long r13 = r13 - r10
            r10 = 1
            long r13 = r13 + r10
            java.lang.String r4 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            java.lang.String[] r10 = new java.lang.String[r8]     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            java.lang.String r11 = java.lang.Long.toString(r13)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            r10[r2] = r11     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            int r4 = r9.delete(r0, r4, r10)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            long r10 = (long) r4     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            int r4 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x00a0
            com.google.android.gms.measurement.internal.w3 r4 = r16.mo12427b()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo13096F()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            java.lang.String r15 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r2 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            java.lang.Long r8 = java.lang.Long.valueOf(r10)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            long r13 = r13 - r10
            java.lang.Long r10 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            r4.mo13133d(r15, r2, r8, r10)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
        L_0x00a0:
            r9.insertOrThrow(r0, r7, r3)     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            r9.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            r9.endTransaction()     // Catch:{ SQLiteFullException -> 0x0055, SQLiteDatabaseLockedException -> 0x00b5, SQLiteException -> 0x0053, all -> 0x0050 }
            if (r12 == 0) goto L_0x00ae
            r12.close()
        L_0x00ae:
            if (r9 == 0) goto L_0x00b3
            r9.close()
        L_0x00b3:
            r2 = 1
            return r2
        L_0x00b5:
            r7 = r12
            goto L_0x00ed
        L_0x00b7:
            r0 = move-exception
            r12 = r7
        L_0x00b9:
            r7 = r9
            goto L_0x00c2
        L_0x00bb:
            r0 = move-exception
            goto L_0x0100
        L_0x00bd:
            r0 = move-exception
            r9 = r7
            goto L_0x011f
        L_0x00c0:
            r0 = move-exception
            r12 = r7
        L_0x00c2:
            if (r7 == 0) goto L_0x00cd
            boolean r2 = r7.inTransaction()     // Catch:{ all -> 0x00e8 }
            if (r2 == 0) goto L_0x00cd
            r7.endTransaction()     // Catch:{ all -> 0x00e8 }
        L_0x00cd:
            com.google.android.gms.measurement.internal.w3 r2 = r16.mo12427b()     // Catch:{ all -> 0x00e8 }
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo13096F()     // Catch:{ all -> 0x00e8 }
            java.lang.String r4 = "Error writing entry to local database"
            r2.mo13131b(r4, r0)     // Catch:{ all -> 0x00e8 }
            r2 = 1
            r1.f4577d = r2     // Catch:{ all -> 0x00e8 }
            if (r12 == 0) goto L_0x00e2
            r12.close()
        L_0x00e2:
            if (r7 == 0) goto L_0x0118
            r7.close()
            goto L_0x0118
        L_0x00e8:
            r0 = move-exception
            r9 = r7
        L_0x00ea:
            r7 = r12
            goto L_0x011f
        L_0x00ec:
            r9 = r7
        L_0x00ed:
            long r10 = (long) r6
            android.os.SystemClock.sleep(r10)     // Catch:{ all -> 0x011e }
            int r6 = r6 + 20
            if (r7 == 0) goto L_0x00f8
            r7.close()
        L_0x00f8:
            if (r9 == 0) goto L_0x0118
        L_0x00fa:
            r9.close()
            goto L_0x0118
        L_0x00fe:
            r0 = move-exception
            r9 = r7
        L_0x0100:
            com.google.android.gms.measurement.internal.w3 r2 = r16.mo12427b()     // Catch:{ all -> 0x011e }
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo13096F()     // Catch:{ all -> 0x011e }
            java.lang.String r4 = "Error writing entry; local database full"
            r2.mo13131b(r4, r0)     // Catch:{ all -> 0x011e }
            r2 = 1
            r1.f4577d = r2     // Catch:{ all -> 0x011e }
            if (r7 == 0) goto L_0x0115
            r7.close()
        L_0x0115:
            if (r9 == 0) goto L_0x0118
            goto L_0x00fa
        L_0x0118:
            int r5 = r5 + 1
            r2 = 0
            r4 = 5
            goto L_0x0026
        L_0x011e:
            r0 = move-exception
        L_0x011f:
            if (r7 == 0) goto L_0x0124
            r7.close()
        L_0x0124:
            if (r9 == 0) goto L_0x0129
            r9.close()
        L_0x0129:
            throw r0
        L_0x012a:
            com.google.android.gms.measurement.internal.w3 r0 = r16.mo12427b()
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13104O()
            java.lang.String r2 = "Failed to write entry to local database"
            r0.mo13130a(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2317s3.m7536D(int, byte[]):boolean");
    }

    @WorkerThread
    @VisibleForTesting
    /* renamed from: L */
    private final SQLiteDatabase m7537L() {
        if (this.f4577d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f4576c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f4577d = true;
        return null;
    }

    @VisibleForTesting
    /* renamed from: M */
    private final boolean m7538M() {
        return mo12428c().getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final boolean mo12534A() {
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:60|61|62|63) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:75|76|77|78) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:47|48|49|50|172) */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0183, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0186, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0187, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x018a, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x018e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x018f, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x019e, code lost:
        if (r15.inTransaction() != false) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01a0, code lost:
        r15.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01b2, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01c2, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x01e8, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x01e9, code lost:
        r3 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x01ea, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x01ed, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x01f2, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        mo12427b().mo13096F().mo13130a("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r11.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        mo12427b().mo13096F().mo13130a("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r11.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        mo12427b().mo13096F().mo13130a("Failed to load conditional user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        r11.recycle();
        r0 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00a4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x00d4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0107 */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0183 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:12:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:113:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), SYNTHETIC, Splitter:B:12:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x019a A[SYNTHETIC, Splitter:B:126:0x019a] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x01e3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x01e3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x01e3 A[SYNTHETIC] */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable> mo12931C(int r22) {
        /*
            r21 = this;
            r1 = r21
            java.lang.String r2 = "Error reading entries from local database"
            r21.mo12567h()
            r21.mo12566d()
            boolean r0 = r1.f4577d
            r3 = 0
            if (r0 == 0) goto L_0x0010
            return r3
        L_0x0010:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r0 = r21.m7538M()
            if (r0 != 0) goto L_0x001c
            return r4
        L_0x001c:
            r5 = 5
            r6 = 0
            r7 = 0
            r8 = 5
        L_0x0020:
            if (r7 >= r5) goto L_0x01f6
            r9 = 1
            android.database.sqlite.SQLiteDatabase r15 = r21.m7537L()     // Catch:{ SQLiteFullException -> 0x01cb, SQLiteDatabaseLockedException -> 0x01b8, SQLiteException -> 0x0195, all -> 0x0192 }
            if (r15 != 0) goto L_0x0037
            r1.f4577d = r9     // Catch:{ SQLiteFullException -> 0x0034, SQLiteDatabaseLockedException -> 0x018a, SQLiteException -> 0x0031, all -> 0x0183 }
            if (r15 == 0) goto L_0x0030
            r15.close()
        L_0x0030:
            return r3
        L_0x0031:
            r0 = move-exception
            goto L_0x0188
        L_0x0034:
            r0 = move-exception
            goto L_0x0190
        L_0x0037:
            r15.beginTransaction()     // Catch:{ SQLiteFullException -> 0x018e, SQLiteDatabaseLockedException -> 0x018a, SQLiteException -> 0x0186, all -> 0x0183 }
            long r10 = m7535B(r15)     // Catch:{ SQLiteFullException -> 0x018e, SQLiteDatabaseLockedException -> 0x018a, SQLiteException -> 0x0186, all -> 0x0183 }
            r19 = -1
            int r0 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "rowid<?"
            java.lang.String[] r12 = new java.lang.String[r9]     // Catch:{ SQLiteFullException -> 0x0034, SQLiteDatabaseLockedException -> 0x018a, SQLiteException -> 0x0031, all -> 0x0183 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ SQLiteFullException -> 0x0034, SQLiteDatabaseLockedException -> 0x018a, SQLiteException -> 0x0031, all -> 0x0183 }
            r12[r6] = r10     // Catch:{ SQLiteFullException -> 0x0034, SQLiteDatabaseLockedException -> 0x018a, SQLiteException -> 0x0031, all -> 0x0183 }
            r13 = r0
            r14 = r12
            goto L_0x0053
        L_0x0051:
            r13 = r3
            r14 = r13
        L_0x0053:
            java.lang.String r11 = "messages"
            java.lang.String r0 = "rowid"
            java.lang.String r10 = "type"
            java.lang.String r12 = "entry"
            java.lang.String[] r12 = new java.lang.String[]{r0, r10, r12}     // Catch:{ SQLiteFullException -> 0x018e, SQLiteDatabaseLockedException -> 0x018a, SQLiteException -> 0x0186, all -> 0x0183 }
            r0 = 0
            r16 = 0
            java.lang.String r17 = "rowid asc"
            r10 = 100
            java.lang.String r18 = java.lang.Integer.toString(r10)     // Catch:{ SQLiteFullException -> 0x018e, SQLiteDatabaseLockedException -> 0x018a, SQLiteException -> 0x0186, all -> 0x0183 }
            r10 = r15
            r5 = r15
            r15 = r0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteFullException -> 0x017f, SQLiteDatabaseLockedException -> 0x018b, SQLiteException -> 0x017b, all -> 0x0178 }
        L_0x0071:
            boolean r0 = r10.moveToNext()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            if (r0 == 0) goto L_0x013c
            long r19 = r10.getLong(r6)     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            int r0 = r10.getInt(r9)     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            r11 = 2
            byte[] r12 = r10.getBlob(r11)     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            if (r0 != 0) goto L_0x00b9
            android.os.Parcel r11 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            int r0 = r12.length     // Catch:{ a -> 0x00a4 }
            r11.unmarshall(r12, r6, r0)     // Catch:{ a -> 0x00a4 }
            r11.setDataPosition(r6)     // Catch:{ a -> 0x00a4 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzaq> r0 = com.google.android.gms.measurement.internal.zzaq.CREATOR     // Catch:{ a -> 0x00a4 }
            java.lang.Object r0 = r0.createFromParcel(r11)     // Catch:{ a -> 0x00a4 }
            com.google.android.gms.measurement.internal.zzaq r0 = (com.google.android.gms.measurement.internal.zzaq) r0     // Catch:{ a -> 0x00a4 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            if (r0 == 0) goto L_0x0071
        L_0x009e:
            r4.add(r0)     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            goto L_0x0071
        L_0x00a2:
            r0 = move-exception
            goto L_0x00b5
        L_0x00a4:
            com.google.android.gms.measurement.internal.w3 r0 = r21.mo12427b()     // Catch:{ all -> 0x00a2 }
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13096F()     // Catch:{ all -> 0x00a2 }
            java.lang.String r12 = "Failed to load event from local database"
            r0.mo13130a(r12)     // Catch:{ all -> 0x00a2 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            goto L_0x0071
        L_0x00b5:
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            throw r0     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
        L_0x00b9:
            if (r0 != r9) goto L_0x00ec
            android.os.Parcel r11 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            int r0 = r12.length     // Catch:{ a -> 0x00d4 }
            r11.unmarshall(r12, r6, r0)     // Catch:{ a -> 0x00d4 }
            r11.setDataPosition(r6)     // Catch:{ a -> 0x00d4 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzkn> r0 = com.google.android.gms.measurement.internal.zzkn.CREATOR     // Catch:{ a -> 0x00d4 }
            java.lang.Object r0 = r0.createFromParcel(r11)     // Catch:{ a -> 0x00d4 }
            com.google.android.gms.measurement.internal.zzkn r0 = (com.google.android.gms.measurement.internal.zzkn) r0     // Catch:{ a -> 0x00d4 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            goto L_0x00e5
        L_0x00d2:
            r0 = move-exception
            goto L_0x00e8
        L_0x00d4:
            com.google.android.gms.measurement.internal.w3 r0 = r21.mo12427b()     // Catch:{ all -> 0x00d2 }
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13096F()     // Catch:{ all -> 0x00d2 }
            java.lang.String r12 = "Failed to load user property from local database"
            r0.mo13130a(r12)     // Catch:{ all -> 0x00d2 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            r0 = r3
        L_0x00e5:
            if (r0 == 0) goto L_0x0071
            goto L_0x009e
        L_0x00e8:
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            throw r0     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
        L_0x00ec:
            if (r0 != r11) goto L_0x011f
            android.os.Parcel r11 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            int r0 = r12.length     // Catch:{ a -> 0x0107 }
            r11.unmarshall(r12, r6, r0)     // Catch:{ a -> 0x0107 }
            r11.setDataPosition(r6)     // Catch:{ a -> 0x0107 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzy> r0 = com.google.android.gms.measurement.internal.zzy.CREATOR     // Catch:{ a -> 0x0107 }
            java.lang.Object r0 = r0.createFromParcel(r11)     // Catch:{ a -> 0x0107 }
            com.google.android.gms.measurement.internal.zzy r0 = (com.google.android.gms.measurement.internal.zzy) r0     // Catch:{ a -> 0x0107 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            goto L_0x0118
        L_0x0105:
            r0 = move-exception
            goto L_0x011b
        L_0x0107:
            com.google.android.gms.measurement.internal.w3 r0 = r21.mo12427b()     // Catch:{ all -> 0x0105 }
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13096F()     // Catch:{ all -> 0x0105 }
            java.lang.String r12 = "Failed to load conditional user property from local database"
            r0.mo13130a(r12)     // Catch:{ all -> 0x0105 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            r0 = r3
        L_0x0118:
            if (r0 == 0) goto L_0x0071
            goto L_0x009e
        L_0x011b:
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            throw r0     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
        L_0x011f:
            r11 = 3
            if (r0 != r11) goto L_0x0131
            com.google.android.gms.measurement.internal.w3 r0 = r21.mo12427b()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13099J()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            java.lang.String r11 = "Skipping app launch break"
        L_0x012c:
            r0.mo13130a(r11)     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            goto L_0x0071
        L_0x0131:
            com.google.android.gms.measurement.internal.w3 r0 = r21.mo12427b()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13096F()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            java.lang.String r11 = "Unknown record type in local database"
            goto L_0x012c
        L_0x013c:
            java.lang.String r0 = "messages"
            java.lang.String r11 = "rowid <= ?"
            java.lang.String[] r12 = new java.lang.String[r9]     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            java.lang.String r13 = java.lang.Long.toString(r19)     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            r12[r6] = r13     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            int r0 = r5.delete(r0, r11, r12)     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            int r11 = r4.size()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            if (r0 >= r11) goto L_0x015f
            com.google.android.gms.measurement.internal.w3 r0 = r21.mo12427b()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13096F()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            java.lang.String r11 = "Fewer entries removed from local database than expected"
            r0.mo13130a(r11)     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
        L_0x015f:
            r5.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            r5.endTransaction()     // Catch:{ SQLiteFullException -> 0x0176, SQLiteDatabaseLockedException -> 0x018c, SQLiteException -> 0x0174, all -> 0x0170 }
            if (r10 == 0) goto L_0x016a
            r10.close()
        L_0x016a:
            if (r5 == 0) goto L_0x016f
            r5.close()
        L_0x016f:
            return r4
        L_0x0170:
            r0 = move-exception
            r3 = r10
            goto L_0x01eb
        L_0x0174:
            r0 = move-exception
            goto L_0x017d
        L_0x0176:
            r0 = move-exception
            goto L_0x0181
        L_0x0178:
            r0 = move-exception
            goto L_0x01eb
        L_0x017b:
            r0 = move-exception
            r10 = r3
        L_0x017d:
            r15 = r5
            goto L_0x0198
        L_0x017f:
            r0 = move-exception
            r10 = r3
        L_0x0181:
            r15 = r5
            goto L_0x01ce
        L_0x0183:
            r0 = move-exception
            goto L_0x01ea
        L_0x0186:
            r0 = move-exception
            r5 = r15
        L_0x0188:
            r10 = r3
            goto L_0x0198
        L_0x018a:
            r5 = r15
        L_0x018b:
            r10 = r3
        L_0x018c:
            r15 = r5
            goto L_0x01ba
        L_0x018e:
            r0 = move-exception
            r5 = r15
        L_0x0190:
            r10 = r3
            goto L_0x01ce
        L_0x0192:
            r0 = move-exception
            r5 = r3
            goto L_0x01eb
        L_0x0195:
            r0 = move-exception
            r10 = r3
            r15 = r10
        L_0x0198:
            if (r15 == 0) goto L_0x01a3
            boolean r5 = r15.inTransaction()     // Catch:{ all -> 0x01e8 }
            if (r5 == 0) goto L_0x01a3
            r15.endTransaction()     // Catch:{ all -> 0x01e8 }
        L_0x01a3:
            com.google.android.gms.measurement.internal.w3 r5 = r21.mo12427b()     // Catch:{ all -> 0x01e8 }
            com.google.android.gms.measurement.internal.y3 r5 = r5.mo13096F()     // Catch:{ all -> 0x01e8 }
            r5.mo13131b(r2, r0)     // Catch:{ all -> 0x01e8 }
            r1.f4577d = r9     // Catch:{ all -> 0x01e8 }
            if (r10 == 0) goto L_0x01b5
            r10.close()
        L_0x01b5:
            if (r15 == 0) goto L_0x01e3
            goto L_0x01c7
        L_0x01b8:
            r10 = r3
            r15 = r10
        L_0x01ba:
            long r11 = (long) r8
            android.os.SystemClock.sleep(r11)     // Catch:{ all -> 0x01e8 }
            int r8 = r8 + 20
            if (r10 == 0) goto L_0x01c5
            r10.close()
        L_0x01c5:
            if (r15 == 0) goto L_0x01e3
        L_0x01c7:
            r15.close()
            goto L_0x01e3
        L_0x01cb:
            r0 = move-exception
            r10 = r3
            r15 = r10
        L_0x01ce:
            com.google.android.gms.measurement.internal.w3 r5 = r21.mo12427b()     // Catch:{ all -> 0x01e8 }
            com.google.android.gms.measurement.internal.y3 r5 = r5.mo13096F()     // Catch:{ all -> 0x01e8 }
            r5.mo13131b(r2, r0)     // Catch:{ all -> 0x01e8 }
            r1.f4577d = r9     // Catch:{ all -> 0x01e8 }
            if (r10 == 0) goto L_0x01e0
            r10.close()
        L_0x01e0:
            if (r15 == 0) goto L_0x01e3
            goto L_0x01c7
        L_0x01e3:
            int r7 = r7 + 1
            r5 = 5
            goto L_0x0020
        L_0x01e8:
            r0 = move-exception
            r3 = r10
        L_0x01ea:
            r5 = r15
        L_0x01eb:
            if (r3 == 0) goto L_0x01f0
            r3.close()
        L_0x01f0:
            if (r5 == 0) goto L_0x01f5
            r5.close()
        L_0x01f5:
            throw r0
        L_0x01f6:
            com.google.android.gms.measurement.internal.w3 r0 = r21.mo12427b()
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13099J()
            java.lang.String r2 = "Failed to read events from database in reasonable time"
            r0.mo13130a(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2317s3.mo12931C(int):java.util.List");
    }

    /* renamed from: E */
    public final boolean mo12932E(zzaq zzaq) {
        Parcel obtain = Parcel.obtain();
        zzaq.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return m7536D(0, marshall);
        }
        mo12427b().mo13097G().mo13130a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    /* renamed from: F */
    public final boolean mo12933F(zzkn zzkn) {
        Parcel obtain = Parcel.obtain();
        zzkn.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return m7536D(1, marshall);
        }
        mo12427b().mo13097G().mo13130a("User property too long for local database. Sending directly to service");
        return false;
    }

    /* renamed from: G */
    public final boolean mo12934G(zzy zzy) {
        mo13110k();
        byte[] l0 = C2323s9.m7571l0(zzy);
        if (l0.length <= 131072) {
            return m7536D(2, l0);
        }
        mo12427b().mo13097G().mo13130a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    @WorkerThread
    /* renamed from: H */
    public final void mo12935H() {
        mo12566d();
        mo12567h();
        try {
            int delete = m7537L().delete("messages", (String) null, (String[]) null) + 0;
            if (delete > 0) {
                mo12427b().mo13104O().mo13131b("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            mo12427b().mo13096F().mo13131b("Error resetting local analytics data. error", e);
        }
    }

    @WorkerThread
    /* renamed from: J */
    public final boolean mo12936J() {
        return m7536D(3, new byte[0]);
    }

    @WorkerThread
    /* renamed from: K */
    public final boolean mo12937K() {
        mo12567h();
        mo12566d();
        if (this.f4577d || !m7538M()) {
            return false;
        }
        int i = 0;
        int i2 = 5;
        while (i < 5) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabase = m7537L();
                if (sQLiteDatabase == null) {
                    this.f4577d = true;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    return false;
                }
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                return true;
            } catch (SQLiteFullException e) {
                mo12427b().mo13096F().mo13131b("Error deleting app launch break from local database", e);
                this.f4577d = true;
                if (sQLiteDatabase == null) {
                    i++;
                }
                sQLiteDatabase.close();
                i++;
            } catch (SQLiteDatabaseLockedException unused) {
                SystemClock.sleep((long) i2);
                i2 += 20;
                if (sQLiteDatabase == null) {
                    i++;
                }
                sQLiteDatabase.close();
                i++;
            } catch (SQLiteException e2) {
                if (sQLiteDatabase != null) {
                    if (sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                }
                mo12427b().mo13096F().mo13131b("Error deleting app launch break from local database", e2);
                this.f4577d = true;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                    i++;
                } else {
                    i++;
                }
            } catch (Throwable th) {
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        }
        mo12427b().mo13099J().mo13130a("Error deleting app launch break from local database in reasonable time");
        return false;
    }
}

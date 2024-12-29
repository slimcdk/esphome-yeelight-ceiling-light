package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* renamed from: com.google.android.gms.measurement.internal.m */
public final class C1699m {
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r0 == false) goto L_0x003f;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0079 A[Catch:{ all -> 0x00d0, SQLiteException -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a5 A[Catch:{ all -> 0x00d0, SQLiteException -> 0x00d5 }, LOOP:1: B:31:0x00a5->B:36:0x00b7, LOOP_START, PHI: r12 
      PHI: (r12v1 int) = (r12v0 int), (r12v2 int) binds: [B:30:0x00a3, B:36:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c0 A[Catch:{ all -> 0x00d0, SQLiteException -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[Catch:{  }, RETURN, SYNTHETIC] */
    @androidx.annotation.WorkerThread
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m4476a(com.google.android.gms.measurement.internal.C1574c4 r14, android.database.sqlite.SQLiteDatabase r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String[] r19) {
        /*
            r9 = r15
            r10 = r16
            r11 = r19
            if (r14 == 0) goto L_0x00e8
            r12 = 0
            r13 = 0
            java.lang.String r0 = "name"
            java.lang.String[] r3 = new java.lang.String[]{r0}     // Catch:{ SQLiteException -> 0x002f, all -> 0x002c }
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x002f, all -> 0x002c }
            r5[r12] = r10     // Catch:{ SQLiteException -> 0x002f, all -> 0x002c }
            java.lang.String r2 = "SQLITE_MASTER"
            java.lang.String r4 = "name=?"
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r15
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SQLiteException -> 0x002f, all -> 0x002c }
            boolean r0 = r1.moveToFirst()     // Catch:{ SQLiteException -> 0x002a }
            r1.close()
            if (r0 != 0) goto L_0x0044
            goto L_0x003f
        L_0x002a:
            r0 = move-exception
            goto L_0x0031
        L_0x002c:
            r0 = move-exception
            goto L_0x00e2
        L_0x002f:
            r0 = move-exception
            r1 = r13
        L_0x0031:
            com.google.android.gms.measurement.internal.z3 r2 = r14.mo14040w()     // Catch:{ all -> 0x00e0 }
            java.lang.String r3 = "Error querying for table"
            r2.mo14695c(r3, r10, r0)     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x003f
            r1.close()
        L_0x003f:
            r1 = r17
            r15.execSQL(r1)
        L_0x0044:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ SQLiteException -> 0x00d5 }
            r0.<init>()     // Catch:{ SQLiteException -> 0x00d5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00d5 }
            r1.<init>()     // Catch:{ SQLiteException -> 0x00d5 }
            java.lang.String r2 = "SELECT * FROM "
            r1.append(r2)     // Catch:{ SQLiteException -> 0x00d5 }
            r1.append(r10)     // Catch:{ SQLiteException -> 0x00d5 }
            java.lang.String r2 = " LIMIT 0"
            r1.append(r2)     // Catch:{ SQLiteException -> 0x00d5 }
            java.lang.String r1 = r1.toString()     // Catch:{ SQLiteException -> 0x00d5 }
            android.database.Cursor r1 = r15.rawQuery(r1, r13)     // Catch:{ SQLiteException -> 0x00d5 }
            java.lang.String[] r2 = r1.getColumnNames()     // Catch:{ all -> 0x00d0 }
            java.util.Collections.addAll(r0, r2)     // Catch:{ all -> 0x00d0 }
            r1.close()     // Catch:{ SQLiteException -> 0x00d5 }
            java.lang.String r1 = ","
            r2 = r18
            java.lang.String[] r1 = r2.split(r1)     // Catch:{ SQLiteException -> 0x00d5 }
            int r2 = r1.length     // Catch:{ SQLiteException -> 0x00d5 }
            r3 = 0
        L_0x0077:
            if (r3 >= r2) goto L_0x00a3
            r4 = r1[r3]     // Catch:{ SQLiteException -> 0x00d5 }
            boolean r5 = r0.remove(r4)     // Catch:{ SQLiteException -> 0x00d5 }
            if (r5 == 0) goto L_0x0084
            int r3 = r3 + 1
            goto L_0x0077
        L_0x0084:
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ SQLiteException -> 0x00d5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00d5 }
            r1.<init>()     // Catch:{ SQLiteException -> 0x00d5 }
            java.lang.String r2 = "Table "
            r1.append(r2)     // Catch:{ SQLiteException -> 0x00d5 }
            r1.append(r10)     // Catch:{ SQLiteException -> 0x00d5 }
            java.lang.String r2 = " is missing required column: "
            r1.append(r2)     // Catch:{ SQLiteException -> 0x00d5 }
            r1.append(r4)     // Catch:{ SQLiteException -> 0x00d5 }
            java.lang.String r1 = r1.toString()     // Catch:{ SQLiteException -> 0x00d5 }
            r0.<init>(r1)     // Catch:{ SQLiteException -> 0x00d5 }
            throw r0     // Catch:{ SQLiteException -> 0x00d5 }
        L_0x00a3:
            if (r11 == 0) goto L_0x00ba
        L_0x00a5:
            int r1 = r11.length     // Catch:{ SQLiteException -> 0x00d5 }
            if (r12 >= r1) goto L_0x00ba
            r1 = r11[r12]     // Catch:{ SQLiteException -> 0x00d5 }
            boolean r1 = r0.remove(r1)     // Catch:{ SQLiteException -> 0x00d5 }
            if (r1 != 0) goto L_0x00b7
            int r1 = r12 + 1
            r1 = r11[r1]     // Catch:{ SQLiteException -> 0x00d5 }
            r15.execSQL(r1)     // Catch:{ SQLiteException -> 0x00d5 }
        L_0x00b7:
            int r12 = r12 + 2
            goto L_0x00a5
        L_0x00ba:
            boolean r1 = r0.isEmpty()     // Catch:{ SQLiteException -> 0x00d5 }
            if (r1 != 0) goto L_0x00cf
            com.google.android.gms.measurement.internal.z3 r1 = r14.mo14040w()     // Catch:{ SQLiteException -> 0x00d5 }
            java.lang.String r2 = "Table has extra columns. table, columns"
            java.lang.String r3 = ", "
            java.lang.String r0 = android.text.TextUtils.join(r3, r0)     // Catch:{ SQLiteException -> 0x00d5 }
            r1.mo14695c(r2, r10, r0)     // Catch:{ SQLiteException -> 0x00d5 }
        L_0x00cf:
            return
        L_0x00d0:
            r0 = move-exception
            r1.close()     // Catch:{ SQLiteException -> 0x00d5 }
            throw r0     // Catch:{ SQLiteException -> 0x00d5 }
        L_0x00d5:
            r0 = move-exception
            com.google.android.gms.measurement.internal.z3 r1 = r14.mo14035r()
            java.lang.String r2 = "Failed to verify columns on table that was just created"
            r1.mo14694b(r2, r10)
            throw r0
        L_0x00e0:
            r0 = move-exception
            r13 = r1
        L_0x00e2:
            if (r13 == 0) goto L_0x00e7
            r13.close()
        L_0x00e7:
            throw r0
        L_0x00e8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Monitor must not be null"
            r0.<init>(r1)
            goto L_0x00f1
        L_0x00f0:
            throw r0
        L_0x00f1:
            goto L_0x00f0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1699m.m4476a(com.google.android.gms.measurement.internal.c4, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    /* renamed from: b */
    static void m4477b(C1574c4 c4Var, SQLiteDatabase sQLiteDatabase) {
        if (c4Var != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                c4Var.mo14040w().mo14693a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                c4Var.mo14040w().mo14693a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                c4Var.mo14040w().mo14693a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                c4Var.mo14040w().mo14693a("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }
}

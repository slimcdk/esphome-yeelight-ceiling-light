package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.measurement.internal.g */
public final class C2177g {
    @WorkerThread
    /* renamed from: a */
    private static Set<String> m7022a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
        sb.append("SELECT * FROM ");
        sb.append(str);
        sb.append(" LIMIT 0");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), (String[]) null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    /* renamed from: b */
    static void m7023b(C2361w3 w3Var, SQLiteDatabase sQLiteDatabase) {
        if (w3Var != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                w3Var.mo13099J().mo13130a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                w3Var.mo13099J().mo13130a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                w3Var.mo13099J().mo13130a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                w3Var.mo13099J().mo13130a("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    @WorkerThread
    /* renamed from: c */
    static void m7024c(C2361w3 w3Var, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        if (w3Var != null) {
            if (!m7025d(w3Var, sQLiteDatabase, str)) {
                sQLiteDatabase.execSQL(str2);
            }
            if (w3Var != null) {
                try {
                    Set<String> a = m7022a(sQLiteDatabase, str);
                    String[] split = str3.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    int length = split.length;
                    int i = 0;
                    while (i < length) {
                        String str4 = split[i];
                        if (a.remove(str4)) {
                            i++;
                        } else {
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35 + String.valueOf(str4).length());
                            sb.append("Table ");
                            sb.append(str);
                            sb.append(" is missing required column: ");
                            sb.append(str4);
                            throw new SQLiteException(sb.toString());
                        }
                    }
                    if (strArr != null) {
                        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                            if (!a.remove(strArr[i2])) {
                                sQLiteDatabase.execSQL(strArr[i2 + 1]);
                            }
                        }
                    }
                    if (!a.isEmpty()) {
                        w3Var.mo13099J().mo13132c("Table has extra columns. table, columns", str, TextUtils.join(", ", a));
                    }
                } catch (SQLiteException e) {
                    w3Var.mo13096F().mo13131b("Failed to verify columns on table that was just created", str);
                    throw e;
                }
            } else {
                throw new IllegalArgumentException("Monitor must not be null");
            }
        } else {
            throw new IllegalArgumentException("Monitor must not be null");
        }
    }

    @WorkerThread
    /* renamed from: d */
    private static boolean m7025d(C2361w3 w3Var, SQLiteDatabase sQLiteDatabase, String str) {
        if (w3Var != null) {
            Cursor cursor = null;
            try {
                SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                Cursor query = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, (String) null, (String) null, (String) null);
                boolean moveToFirst = query.moveToFirst();
                if (query != null) {
                    query.close();
                }
                return moveToFirst;
            } catch (SQLiteException e) {
                w3Var.mo13099J().mo13132c("Error querying for table", str, e);
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Monitor must not be null");
        }
    }
}

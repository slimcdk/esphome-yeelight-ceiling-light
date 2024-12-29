package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* renamed from: com.google.android.gms.measurement.internal.t3 */
final class C1787t3 extends SQLiteOpenHelper {

    /* renamed from: a */
    final /* synthetic */ C1799u3 f2670a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1787t3(C1799u3 u3Var, Context context, String str) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f2670a = u3Var;
    }

    @WorkerThread
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.f2670a.f2143a.mo14228b().mo14035r().mo14693a("Opening the local database failed, dropping and recreating it");
            this.f2670a.f2143a.mo14402z();
            if (!this.f2670a.f2143a.mo14231f().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f2670a.f2143a.mo14228b().mo14035r().mo14694b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.f2670a.f2143a.mo14228b().mo14035r().mo14694b("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    @WorkerThread
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C1699m.m4477b(this.f2670a.f2143a.mo14228b(), sQLiteDatabase);
    }

    @WorkerThread
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @WorkerThread
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        C1699m.m4476a(this.f2670a.f2143a.mo14228b(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    @WorkerThread
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}

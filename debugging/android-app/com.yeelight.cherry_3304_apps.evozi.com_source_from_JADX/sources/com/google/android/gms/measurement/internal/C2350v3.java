package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* renamed from: com.google.android.gms.measurement.internal.v3 */
final class C2350v3 extends SQLiteOpenHelper {

    /* renamed from: a */
    private final /* synthetic */ C2317s3 f4656a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2350v3(C2317s3 s3Var, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f4656a = s3Var;
    }

    @WorkerThread
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.f4656a.mo12427b().mo13096F().mo13130a("Opening the local database failed, dropping and recreating it");
            if (!this.f4656a.mo12428c().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f4656a.mo12427b().mo13096F().mo13131b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.f4656a.mo12427b().mo13096F().mo13131b("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    @WorkerThread
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C2177g.m7023b(this.f4656a.mo12427b(), sQLiteDatabase);
    }

    @WorkerThread
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @WorkerThread
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        C2177g.m7024c(this.f4656a.mo12427b(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    @WorkerThread
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}

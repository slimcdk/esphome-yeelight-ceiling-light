package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* renamed from: com.google.android.gms.measurement.internal.k */
final class C1673k extends SQLiteOpenHelper {

    /* renamed from: a */
    final /* synthetic */ C1686l f2213a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1673k(C1686l lVar, Context context, String str) {
        super(context, "google_app_measurement.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f2213a = lVar;
    }

    @WorkerThread
    public final SQLiteDatabase getWritableDatabase() {
        C1686l lVar = this.f2213a;
        C1554aa W = lVar.f2258e;
        lVar.f2143a.mo14402z();
        if (W.mo14016c(3600000)) {
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException unused) {
                this.f2213a.f2258e.mo14015b();
                this.f2213a.f2143a.mo14228b().mo14035r().mo14693a("Opening the database failed, dropping and recreating it");
                this.f2213a.f2143a.mo14402z();
                if (!this.f2213a.f2143a.mo14231f().getDatabasePath("google_app_measurement.db").delete()) {
                    this.f2213a.f2143a.mo14228b().mo14035r().mo14694b("Failed to delete corrupted db file", "google_app_measurement.db");
                }
                try {
                    SQLiteDatabase writableDatabase = super.getWritableDatabase();
                    this.f2213a.f2258e.mo14014a();
                    return writableDatabase;
                } catch (SQLiteException e) {
                    this.f2213a.f2143a.mo14228b().mo14035r().mo14694b("Failed to open freshly created database", e);
                    throw e;
                }
            }
        } else {
            throw new SQLiteException("Database open failed");
        }
    }

    @WorkerThread
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C1699m.m4477b(this.f2213a.f2143a.mo14228b(), sQLiteDatabase);
    }

    @WorkerThread
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @WorkerThread
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        C1699m.m4476a(this.f2213a.f2143a.mo14228b(), sQLiteDatabase2, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", C1686l.f2249f);
        C1699m.m4476a(this.f2213a.f2143a.mo14228b(), sQLiteDatabase2, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", (String[]) null);
        C1699m.m4476a(this.f2213a.f2143a.mo14228b(), sQLiteDatabase2, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", C1686l.f2250g);
        C1699m.m4476a(this.f2213a.f2143a.mo14228b(), sQLiteDatabase2, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", C1686l.f2251h);
        C1699m.m4476a(this.f2213a.f2143a.mo14228b(), sQLiteDatabase2, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", C1686l.f2253j);
        C1699m.m4476a(this.f2213a.f2143a.mo14228b(), sQLiteDatabase2, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", (String[]) null);
        C1699m.m4476a(this.f2213a.f2143a.mo14228b(), sQLiteDatabase2, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", C1686l.f2252i);
        C1699m.m4476a(this.f2213a.f2143a.mo14228b(), sQLiteDatabase2, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", C1686l.f2254k);
        C1699m.m4476a(this.f2213a.f2143a.mo14228b(), sQLiteDatabase2, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", C1686l.f2255l);
        C1699m.m4476a(this.f2213a.f2143a.mo14228b(), sQLiteDatabase2, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", (String[]) null);
        C1699m.m4476a(this.f2213a.f2143a.mo14228b(), sQLiteDatabase2, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", C1686l.f2256m);
        C1699m.m4476a(this.f2213a.f2143a.mo14228b(), sQLiteDatabase2, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", (String[]) null);
        C1699m.m4476a(this.f2213a.f2143a.mo14228b(), sQLiteDatabase2, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", (String[]) null);
        C1699m.m4476a(this.f2213a.f2143a.mo14228b(), sQLiteDatabase2, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", (String[]) null);
    }

    @WorkerThread
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}

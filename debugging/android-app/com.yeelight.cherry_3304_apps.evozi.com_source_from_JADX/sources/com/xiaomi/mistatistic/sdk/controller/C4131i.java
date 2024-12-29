package com.xiaomi.mistatistic.sdk.controller;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.xiaomi.mistatistic.sdk.controller.i */
public class C4131i extends SQLiteOpenHelper {

    /* renamed from: a */
    public static final Object f7076a = new Object();

    public C4131i(Context context) {
        super(context, "mistat.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        close();
        super.finalize();
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        synchronized (f7076a) {
            sQLiteDatabase.execSQL(String.format("create table %s(_id integer primary key autoincrement, category text, ts integer, key text, value text, type text, extra text)", new Object[]{"mistat_event"}));
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}

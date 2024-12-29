package com.xiaomi.push.providers;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.xiaomi.push.providers.a */
public class C4813a extends SQLiteOpenHelper {

    /* renamed from: a */
    private static int f9864a = 1;

    /* renamed from: a */
    public static final Object f9865a = new Object();

    /* renamed from: a */
    private static final String[] f9866a = {Constants.PACKAGE_NAME, "TEXT", "message_ts", " LONG DEFAULT 0 ", "bytes", " LONG DEFAULT 0 ", "network_type", " INT DEFAULT -1 ", "rcv", " INT DEFAULT -1 ", "imsi", "TEXT"};

    public C4813a(Context context) {
        super(context, "traffic.db", (SQLiteDatabase.CursorFactory) null, f9864a);
    }

    /* renamed from: a */
    private void m15378a(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder("CREATE TABLE traffic(_id INTEGER  PRIMARY KEY ,");
        for (int i = 0; i < f9866a.length - 1; i += 2) {
            if (i != 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb.append(f9866a[i]);
            sb.append(" ");
            sb.append(f9866a[i + 1]);
        }
        sb.append(");");
        sQLiteDatabase.execSQL(sb.toString());
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        synchronized (f9865a) {
            try {
                m15378a(sQLiteDatabase);
            } catch (SQLException e) {
                C3989b.m10678a((Throwable) e);
            }
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}

package com.xiaomi.push.providers;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.xiaomi.push.providers.a */
public class C4834a extends SQLiteOpenHelper {

    /* renamed from: a */
    private static int f9332a = 1;

    /* renamed from: a */
    public static final Object f9333a = new Object();

    /* renamed from: a */
    private static final String[] f9334a = {Constants.PACKAGE_NAME, "TEXT", "message_ts", " LONG DEFAULT 0 ", "bytes", " LONG DEFAULT 0 ", "network_type", " INT DEFAULT -1 ", "rcv", " INT DEFAULT -1 ", "imsi", "TEXT"};

    public C4834a(Context context) {
        super(context, "traffic.db", (SQLiteDatabase.CursorFactory) null, f9332a);
    }

    /* renamed from: a */
    private void m15029a(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder("CREATE TABLE traffic(_id INTEGER  PRIMARY KEY ,");
        int i = 0;
        while (true) {
            String[] strArr = f9334a;
            if (i < strArr.length - 1) {
                if (i != 0) {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb.append(strArr[i]);
                sb.append(" ");
                sb.append(strArr[i + 1]);
                i += 2;
            } else {
                sb.append(");");
                sQLiteDatabase.execSQL(sb.toString());
                return;
            }
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        synchronized (f9333a) {
            try {
                m15029a(sQLiteDatabase);
            } catch (SQLException e) {
                C4408b.m12478a((Throwable) e);
            }
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}

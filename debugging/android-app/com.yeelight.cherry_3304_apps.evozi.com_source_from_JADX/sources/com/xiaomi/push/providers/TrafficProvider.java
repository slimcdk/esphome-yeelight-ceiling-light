package com.xiaomi.push.providers;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import com.xiaomi.push.C4718gx;

public class TrafficProvider extends ContentProvider {

    /* renamed from: a */
    private static final UriMatcher f9861a;

    /* renamed from: a */
    public static final Uri f9862a = Uri.parse("content://com.xiaomi.push.providers.TrafficProvider/traffic");

    /* renamed from: a */
    private SQLiteOpenHelper f9863a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f9861a = uriMatcher;
        uriMatcher.addURI("com.xiaomi.push.providers.TrafficProvider", "traffic", 1);
        f9861a.addURI("com.xiaomi.push.providers.TrafficProvider", "update_imsi", 2);
    }

    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        return 0;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        if (f9861a.match(uri) == 1) {
            return "vnd.android.cursor.dir/vnd.xiaomi.push.traffic";
        }
        throw new IllegalArgumentException("Unknown URI " + uri);
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        this.f9863a = new C4813a(getContext());
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor query;
        synchronized (C4813a.f9865a) {
            if (f9861a.match(uri) == 1) {
                query = this.f9863a.getReadableDatabase().query("traffic", strArr, str, strArr2, (String) null, (String) null, str2);
            } else {
                throw new IllegalArgumentException("Unknown URI " + uri);
            }
        }
        return query;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (f9861a.match(uri) != 2 || contentValues == null || !contentValues.containsKey("imsi")) {
            return 0;
        }
        C4718gx.m14470a(contentValues.getAsString("imsi"));
        return 0;
    }
}

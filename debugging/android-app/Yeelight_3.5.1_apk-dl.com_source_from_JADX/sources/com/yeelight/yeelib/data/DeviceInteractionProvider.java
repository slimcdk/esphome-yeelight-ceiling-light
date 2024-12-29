package com.yeelight.yeelib.data;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.yeelight.yeelib.data.C6062e;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.utils.AppUtils;

public class DeviceInteractionProvider extends ContentProvider {

    /* renamed from: c */
    private static final String f12302c = DeviceInteractionProvider.class.getSimpleName();

    /* renamed from: d */
    private static final UriMatcher f12303d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static int f12304e = 1;

    /* renamed from: a */
    private SQLiteDatabase f12305a;

    /* renamed from: b */
    private C6037a f12306b;

    /* renamed from: com.yeelight.yeelib.data.DeviceInteractionProvider$a */
    private static class C6037a extends SQLiteOpenHelper {
        public C6037a(Context context) {
            this(context, "interaction.db", (SQLiteDatabase.CursorFactory) null, DeviceInteractionProvider.f12304e);
        }

        public C6037a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
            super(context, str, cursorFactory, i);
        }

        /* renamed from: a */
        private void m17663a(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS interactions(" + C6062e.C6063a.C6064a.f12409a + " integer primary key," + C6062e.C6063a.C6064a.f12412d + " varchar," + C6062e.C6063a.C6064a.f12413e + " integer," + C6062e.C6063a.C6064a.f12410b + " varchar," + C6062e.C6063a.C6064a.f12411c + " integer," + C6062e.C6063a.C6064a.f12414f + " integer)");
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            m17663a(sQLiteDatabase);
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f12303d = uriMatcher;
        uriMatcher.addURI("com.yeelight.cherry.database.interaction", "interactions/#", 1);
        uriMatcher.addURI("com.yeelight.cherry.database.interaction", "interactions", 2);
    }

    /* renamed from: b */
    private int m17656b(Uri uri, String str, String[] strArr) {
        return this.f12305a.delete(m17662h(uri), str, strArr);
    }

    /* renamed from: c */
    private Cursor m17657c(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return this.f12305a.query(m17662h(uri), strArr, str, strArr2, (String) null, (String) null, str2);
    }

    /* renamed from: d */
    private int m17658d(Uri uri, ContentValues contentValues) {
        StringBuilder sb = new StringBuilder();
        sb.append("doUpgrade, uri: ");
        sb.append(uri.toString());
        long parseId = ContentUris.parseId(uri);
        return m17659e(uri, contentValues, C6062e.C6063a.C6064a.f12409a + " = ?", new String[]{Long.toString(parseId)});
    }

    /* renamed from: e */
    private int m17659e(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return this.f12305a.update(m17662h(uri), contentValues, str, strArr);
    }

    /* renamed from: f */
    public static Cursor m17660f(C3012e eVar) {
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        return contentResolver.query(C6062e.C6063a.f12408a, (String[]) null, C6062e.C6063a.C6064a.f12412d + " = ? AND " + C6062e.C6063a.C6064a.f12414f + " = 1", new String[]{eVar.mo23185G()}, (String) null);
    }

    /* renamed from: g */
    public static Cursor m17661g(String str, int i) {
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        return contentResolver.query(C6062e.C6063a.f12408a, (String[]) null, C6062e.C6063a.C6064a.f12412d + " = ? AND " + C6062e.C6063a.C6064a.f12413e + " = ?", new String[]{str, String.valueOf(i)}, (String) null);
    }

    /* renamed from: h */
    private String m17662h(Uri uri) {
        int match = f12303d.match(uri);
        if (match == 1 || match == 2) {
            return "interactions";
        }
        return null;
    }

    public int delete(@NonNull Uri uri, String str, String[] strArr) {
        this.f12305a = this.f12306b.getWritableDatabase();
        if (f12303d.match(uri) != 2) {
            String str2 = f12302c;
            AppUtils.m8300u(str2, "Invalid Uri: " + uri.toString());
            return -1;
        }
        int b = m17656b(uri, str, strArr);
        getContext().getContentResolver().notifyChange(C6062e.C6063a.f12408a, (ContentObserver) null);
        return b;
    }

    public String getType(@NonNull Uri uri) {
        if (f12303d.match(uri) == 2) {
            return "vnd.android.cursor.dir/interaction";
        }
        String str = f12302c;
        AppUtils.m8300u(str, "Unknown Uri: " + uri.toString());
        return null;
    }

    public Uri insert(@NonNull Uri uri, ContentValues contentValues) {
        this.f12305a = this.f12306b.getWritableDatabase();
        if (f12303d.match(uri) != 2) {
            String str = f12302c;
            AppUtils.m8300u(str, "Invalid Uri: " + uri.toString());
            return null;
        }
        Uri withAppendedId = ContentUris.withAppendedId(uri, this.f12305a.insert(m17662h(uri), (String) null, contentValues));
        getContext().getContentResolver().notifyChange(C6062e.C6063a.f12408a, (ContentObserver) null);
        return withAppendedId;
    }

    public boolean onCreate() {
        this.f12306b = new C6037a(getContext());
        return true;
    }

    public Cursor query(@NonNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        this.f12305a = this.f12306b.getReadableDatabase();
        if (f12303d.match(uri) != 2) {
            return null;
        }
        return m17657c(uri, strArr, str, strArr2, str2);
    }

    public int update(@NonNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int i;
        int match = f12303d.match(uri);
        if (match == 1) {
            i = m17658d(uri, contentValues);
        } else if (match != 2) {
            String str2 = f12302c;
            AppUtils.m8300u(str2, "Invalid Uri: " + uri.toString());
            return -1;
        } else {
            i = m17659e(uri, contentValues, str, strArr);
        }
        getContext().getContentResolver().notifyChange(C6062e.C6063a.f12408a, (ContentObserver) null);
        return i;
    }
}

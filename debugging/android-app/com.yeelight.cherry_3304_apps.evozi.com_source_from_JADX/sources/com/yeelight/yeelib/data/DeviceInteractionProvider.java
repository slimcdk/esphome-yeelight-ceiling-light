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
import com.yeelight.yeelib.data.C7598f;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.utils.C4308b;

public class DeviceInteractionProvider extends ContentProvider {

    /* renamed from: c */
    private static final String f15299c = DeviceInteractionProvider.class.getSimpleName();

    /* renamed from: d */
    private static final UriMatcher f15300d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static int f15301e = 1;

    /* renamed from: a */
    private SQLiteDatabase f15302a;

    /* renamed from: b */
    private C7568a f15303b;

    /* renamed from: com.yeelight.yeelib.data.DeviceInteractionProvider$a */
    private static class C7568a extends SQLiteOpenHelper {
        public C7568a(Context context) {
            this(context, "interaction.db", (SQLiteDatabase.CursorFactory) null, DeviceInteractionProvider.f15301e);
        }

        public C7568a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
            super(context, str, cursorFactory, i);
        }

        /* renamed from: a */
        private void m22441a(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS interactions(" + C7598f.C7599a.C7600a.f15450a + " integer primary key," + C7598f.C7599a.C7600a.f15453d + " varchar," + C7598f.C7599a.C7600a.f15454e + " integer," + C7598f.C7599a.C7600a.f15451b + " varchar," + C7598f.C7599a.C7600a.f15452c + " integer," + C7598f.C7599a.C7600a.f15455f + " integer)");
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            m22441a(sQLiteDatabase);
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f15300d = uriMatcher;
        uriMatcher.addURI("com.yeelight.cherry.database.interaction", "interactions/#", 1);
        f15300d.addURI("com.yeelight.cherry.database.interaction", "interactions", 2);
    }

    /* renamed from: b */
    private int m22434b(Uri uri, String str, String[] strArr) {
        return this.f15302a.delete(m22440h(uri), str, strArr);
    }

    /* renamed from: c */
    private Cursor m22435c(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return this.f15302a.query(m22440h(uri), strArr, str, strArr2, (String) null, (String) null, str2);
    }

    /* renamed from: d */
    private int m22436d(Uri uri, ContentValues contentValues) {
        "doUpgrade, uri: " + uri.toString();
        return m22437e(uri, contentValues, C7598f.C7599a.C7600a.f15450a + " = ?", new String[]{Long.toString(ContentUris.parseId(uri))});
    }

    /* renamed from: e */
    private int m22437e(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return this.f15302a.update(m22440h(uri), contentValues, str, strArr);
    }

    /* renamed from: f */
    public static Cursor m22438f(C4200i iVar) {
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        return contentResolver.query(C7598f.C7599a.f15449a, (String[]) null, C7598f.C7599a.C7600a.f15453d + " = ? AND " + C7598f.C7599a.C7600a.f15455f + " = 1", new String[]{iVar.mo23372G()}, (String) null);
    }

    /* renamed from: g */
    public static Cursor m22439g(String str, int i) {
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        return contentResolver.query(C7598f.C7599a.f15449a, (String[]) null, C7598f.C7599a.C7600a.f15453d + " = ? AND " + C7598f.C7599a.C7600a.f15454e + " = ?", new String[]{str, String.valueOf(i)}, (String) null);
    }

    /* renamed from: h */
    private String m22440h(Uri uri) {
        int match = f15300d.match(uri);
        if (match == 1 || match == 2) {
            return "interactions";
        }
        return null;
    }

    public int delete(@NonNull Uri uri, String str, String[] strArr) {
        this.f15302a = this.f15303b.getWritableDatabase();
        if (f15300d.match(uri) != 2) {
            String str2 = f15299c;
            C4308b.m12139r(str2, "Invalid Uri: " + uri.toString());
            return -1;
        }
        int b = m22434b(uri, str, strArr);
        getContext().getContentResolver().notifyChange(C7598f.C7599a.f15449a, (ContentObserver) null);
        return b;
    }

    public String getType(@NonNull Uri uri) {
        if (f15300d.match(uri) == 2) {
            return "vnd.android.cursor.dir/interaction";
        }
        String str = f15299c;
        C4308b.m12139r(str, "Unknown Uri: " + uri.toString());
        return null;
    }

    public Uri insert(@NonNull Uri uri, ContentValues contentValues) {
        this.f15302a = this.f15303b.getWritableDatabase();
        if (f15300d.match(uri) != 2) {
            String str = f15299c;
            C4308b.m12139r(str, "Invalid Uri: " + uri.toString());
            return null;
        }
        Uri withAppendedId = ContentUris.withAppendedId(uri, this.f15302a.insert(m22440h(uri), (String) null, contentValues));
        getContext().getContentResolver().notifyChange(C7598f.C7599a.f15449a, (ContentObserver) null);
        return withAppendedId;
    }

    public boolean onCreate() {
        this.f15303b = new C7568a(getContext());
        return true;
    }

    public Cursor query(@NonNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        this.f15302a = this.f15303b.getReadableDatabase();
        if (f15300d.match(uri) != 2) {
            return null;
        }
        return m22435c(uri, strArr, str, strArr2, str2);
    }

    public int update(@NonNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int i;
        int match = f15300d.match(uri);
        if (match == 1) {
            i = m22436d(uri, contentValues);
        } else if (match != 2) {
            String str2 = f15299c;
            C4308b.m12139r(str2, "Invalid Uri: " + uri.toString());
            return -1;
        } else {
            i = m22437e(uri, contentValues, str, strArr);
        }
        getContext().getContentResolver().notifyChange(C7598f.C7599a.f15449a, (ContentObserver) null);
        return i;
    }
}

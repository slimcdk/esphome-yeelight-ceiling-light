package com.yeelight.yeelib.data;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yeelight.yeelib.data.C7569a;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.utils.C4308b;

public class AppConfigurationProvider extends ContentProvider {

    /* renamed from: c */
    private static final String f15287c = AppConfigurationProvider.class.getSimpleName();

    /* renamed from: d */
    private static final UriMatcher f15288d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static int f15289e = 1;

    /* renamed from: a */
    private SQLiteDatabase f15290a;

    /* renamed from: b */
    private C7566a f15291b;

    /* renamed from: com.yeelight.yeelib.data.AppConfigurationProvider$a */
    private static class C7566a extends SQLiteOpenHelper {
        public C7566a(Context context) {
            this(context, "config.db", (SQLiteDatabase.CursorFactory) null, AppConfigurationProvider.f15289e);
        }

        public C7566a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
            super(context, str, cursorFactory, i);
        }

        /* renamed from: a */
        private void m22363a(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS configuration(" + C7569a.C7570a.C7571a.f15307a + " varchar," + C7569a.C7570a.C7571a.f15308b + " varchar)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS sharehistory(" + C7569a.C7572b.C7573a.f15311a + " integer primary key," + C7569a.C7572b.C7573a.f15312b + " varchar," + C7569a.C7572b.C7573a.f15313c + " varchar," + C7569a.C7572b.C7573a.f15314d + " varchar," + C7569a.C7572b.C7573a.f15315e + " integer)");
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            m22363a(sQLiteDatabase);
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f15288d = uriMatcher;
        uriMatcher.addURI("com.yeelight.cherry.database.configuration", "configuration/#", 1);
        f15288d.addURI("com.yeelight.cherry.database.configuration", "configuration", 2);
        f15288d.addURI("com.yeelight.cherry.database.configuration", "sharehistory/#", 3);
        f15288d.addURI("com.yeelight.cherry.database.configuration", "sharehistory", 4);
    }

    /* renamed from: b */
    private int m22349b(Uri uri, String str, String[] strArr) {
        return this.f15290a.delete(m22358k(uri), str, strArr);
    }

    /* renamed from: c */
    private Cursor m22350c(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return this.f15290a.query(m22358k(uri), strArr, str, strArr2, (String) null, (String) null, str2);
    }

    /* renamed from: d */
    private int m22351d(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        "doUpdate : " + contentValues.toString() + ", selection = " + str + ", args = " + strArr[0];
        return this.f15290a.update(m22358k(uri), contentValues, str, strArr);
    }

    /* renamed from: e */
    public static Cursor m22352e(String str) {
        return C4297y.f7456e.getContentResolver().query(C7569a.C7570a.f15306a, (String[]) null, C7569a.C7570a.C7571a.f15307a + " = ?", new String[]{str}, (String) null);
    }

    /* renamed from: f */
    public static String m22353f(String str) {
        Cursor e = m22352e(str);
        String string = (e == null || !e.moveToFirst()) ? "" : e.getString(e.getColumnIndex(C7569a.C7570a.C7571a.f15308b));
        if (e != null) {
            e.close();
        }
        return string;
    }

    /* renamed from: g */
    public static boolean m22354g() {
        return Boolean.parseBoolean(m22353f("dark_widget_skin"));
    }

    /* renamed from: h */
    public static boolean m22355h() {
        return Boolean.parseBoolean(m22353f("dark_widget_skin_room"));
    }

    /* renamed from: i */
    public static Cursor m22356i() {
        return C4297y.f7456e.getContentResolver().query(C7569a.C7572b.f15309a, (String[]) null, (String) null, (String[]) null, C7569a.C7572b.f15310b);
    }

    /* renamed from: j */
    public static Cursor m22357j(String str) {
        return C4297y.f7456e.getContentResolver().query(C7569a.C7572b.f15309a, (String[]) null, C7569a.C7572b.C7573a.f15312b + " = ?", new String[]{str}, (String) null);
    }

    /* renamed from: k */
    private String m22358k(Uri uri) {
        int match = f15288d.match(uri);
        if (match == 1 || match == 2) {
            return "configuration";
        }
        if (match == 3 || match == 4) {
            return "sharehistory";
        }
        return null;
    }

    /* renamed from: l */
    public static void m22359l(boolean z) {
        m22361n("dark_widget_skin", String.valueOf(z));
    }

    /* renamed from: m */
    public static void m22360m(boolean z) {
        m22361n("dark_widget_skin_room", String.valueOf(z));
    }

    /* renamed from: n */
    public static Uri m22361n(String str, String str2) {
        Uri uri;
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put(C7569a.C7570a.C7571a.f15307a, str);
        contentValues.put(C7569a.C7570a.C7571a.f15308b, str2);
        Cursor e = m22352e(str);
        if (e == null || !e.moveToFirst()) {
            "insert config key : " + str + " value = " + str2;
            uri = contentResolver.insert(C7569a.C7570a.f15306a, contentValues);
        } else {
            "update config key: " + str + " value = " + str2;
            uri = Uri.withAppendedPath(C7569a.C7570a.f15306a, String.valueOf(contentResolver.update(C7569a.C7570a.f15306a, contentValues, C7569a.C7570a.C7571a.f15307a + " = ?", new String[]{str})));
        }
        if (e != null) {
            e.close();
        }
        return uri;
    }

    /* renamed from: o */
    public static Uri m22362o(C4201a.C4212k kVar) {
        Uri uri;
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put(C7569a.C7572b.C7573a.f15312b, kVar.mo23485b());
        contentValues.put(C7569a.C7572b.C7573a.f15313c, kVar.mo23486c());
        contentValues.put(C7569a.C7572b.C7573a.f15314d, kVar.mo23484a());
        contentValues.put(C7569a.C7572b.C7573a.f15315e, Long.valueOf(System.currentTimeMillis()));
        Cursor j = m22357j(kVar.mo23485b());
        if (j == null || !j.moveToFirst()) {
            "insert share user mid: " + kVar.mo23485b();
            uri = contentResolver.insert(C7569a.C7572b.f15309a, contentValues);
        } else {
            "update share user mid: " + kVar.mo23485b();
            uri = Uri.withAppendedPath(C7569a.C7572b.f15309a, String.valueOf(contentResolver.update(C7569a.C7572b.f15309a, contentValues, C7569a.C7572b.C7573a.f15312b + " = ?", new String[]{kVar.mo23485b()})));
        }
        if (j != null) {
            j.close();
        }
        return uri;
    }

    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        if (this.f15290a == null) {
            this.f15290a = this.f15291b.getReadableDatabase();
        }
        int match = f15288d.match(uri);
        if (match == 2 || match == 4) {
            return m22349b(uri, str, strArr);
        }
        String str2 = f15287c;
        C4308b.m12139r(str2, "Invalid Uri: " + uri.toString());
        return -1;
    }

    @Nullable
    public String getType(@NonNull Uri uri) {
        int match = f15288d.match(uri);
        if (match == 1) {
            return "vnd.android.cursor.item/device";
        }
        if (match == 2) {
            return "vnd.android.cursor.dir/devices";
        }
        if (match == 3) {
            return "vnd.android.cursor.item/device";
        }
        if (match == 4) {
            return "vnd.android.cursor.dir/devices";
        }
        String str = f15287c;
        C4308b.m12139r(str, "Unknown Uri: " + uri.toString());
        return null;
    }

    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        if (this.f15290a == null) {
            this.f15290a = this.f15291b.getReadableDatabase();
        }
        int match = f15288d.match(uri);
        if (match == 2 || match == 4) {
            return ContentUris.withAppendedId(uri, this.f15290a.insert(m22358k(uri), (String) null, contentValues));
        }
        String str = f15287c;
        C4308b.m12139r(str, "Invalid Uri: " + uri.toString());
        return null;
    }

    public boolean onCreate() {
        this.f15291b = new C7566a(getContext());
        return true;
    }

    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        if (this.f15290a == null) {
            this.f15290a = this.f15291b.getReadableDatabase();
        }
        int match = f15288d.match(uri);
        if (match == 1 || match == 2 || match == 3 || match == 4) {
            return m22350c(uri, strArr, str, strArr2, str2);
        }
        return null;
    }

    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        if (this.f15290a == null) {
            this.f15290a = this.f15291b.getReadableDatabase();
        }
        int match = f15288d.match(uri);
        if (match == 2 || match == 4) {
            return m22351d(uri, contentValues, str, strArr);
        }
        String str2 = f15287c;
        C4308b.m12139r(str2, "Invalid Uri: " + uri.toString());
        return -1;
    }
}

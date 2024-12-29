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
import com.yeelight.yeelib.data.C6038a;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.utils.AppUtils;

public class AppConfigurationProvider extends ContentProvider {

    /* renamed from: c */
    private static final String f12250c = AppConfigurationProvider.class.getSimpleName();

    /* renamed from: d */
    private static final UriMatcher f12251d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static int f12252e = 1;

    /* renamed from: a */
    private SQLiteDatabase f12253a;

    /* renamed from: b */
    private C6032a f12254b;

    /* renamed from: com.yeelight.yeelib.data.AppConfigurationProvider$a */
    private static class C6032a extends SQLiteOpenHelper {
        public C6032a(Context context) {
            this(context, "config.db", (SQLiteDatabase.CursorFactory) null, AppConfigurationProvider.f12252e);
        }

        public C6032a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
            super(context, str, cursorFactory, i);
        }

        /* renamed from: a */
        private void m17584a(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS configuration(" + C6038a.C6039a.C6040a.f12310a + " varchar," + C6038a.C6039a.C6040a.f12311b + " varchar)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS sharehistory(" + C6038a.C6041b.C6042a.f12314a + " integer primary key," + C6038a.C6041b.C6042a.f12315b + " varchar," + C6038a.C6041b.C6042a.f12316c + " varchar," + C6038a.C6041b.C6042a.f12317d + " varchar," + C6038a.C6041b.C6042a.f12318e + " integer)");
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            m17584a(sQLiteDatabase);
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f12251d = uriMatcher;
        uriMatcher.addURI("com.yeelight.cherry.database.configuration", "configuration/#", 1);
        uriMatcher.addURI("com.yeelight.cherry.database.configuration", "configuration", 2);
        uriMatcher.addURI("com.yeelight.cherry.database.configuration", "sharehistory/#", 3);
        uriMatcher.addURI("com.yeelight.cherry.database.configuration", "sharehistory", 4);
    }

    /* renamed from: b */
    private int m17570b(Uri uri, String str, String[] strArr) {
        return this.f12253a.delete(m17579k(uri), str, strArr);
    }

    /* renamed from: c */
    private Cursor m17571c(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return this.f12253a.query(m17579k(uri), strArr, str, strArr2, (String) null, (String) null, str2);
    }

    /* renamed from: d */
    private int m17572d(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("doUpdate : ");
        sb.append(contentValues.toString());
        sb.append(", selection = ");
        sb.append(str);
        sb.append(", args = ");
        sb.append(strArr[0]);
        return this.f12253a.update(m17579k(uri), contentValues, str, strArr);
    }

    /* renamed from: e */
    public static Cursor m17573e(String str) {
        return C3108x.f4951e.getContentResolver().query(C6038a.C6039a.f12309a, (String[]) null, C6038a.C6039a.C6040a.f12310a + " = ?", new String[]{str}, (String) null);
    }

    /* renamed from: f */
    public static String m17574f(String str) {
        Cursor e = m17573e(str);
        String string = (e == null || !e.moveToFirst()) ? "" : e.getString(e.getColumnIndex(C6038a.C6039a.C6040a.f12311b));
        if (e != null) {
            e.close();
        }
        return string;
    }

    /* renamed from: g */
    public static boolean m17575g() {
        return Boolean.parseBoolean(m17574f("dark_widget_skin"));
    }

    /* renamed from: h */
    public static boolean m17576h() {
        return Boolean.parseBoolean(m17574f("dark_widget_skin_room"));
    }

    /* renamed from: i */
    public static Cursor m17577i() {
        return C3108x.f4951e.getContentResolver().query(C6038a.C6041b.f12312a, (String[]) null, (String) null, (String[]) null, C6038a.C6041b.f12313b);
    }

    /* renamed from: j */
    public static Cursor m17578j(String str) {
        return C3108x.f4951e.getContentResolver().query(C6038a.C6041b.f12312a, (String[]) null, C6038a.C6041b.C6042a.f12315b + " = ?", new String[]{str}, (String) null);
    }

    /* renamed from: k */
    private String m17579k(Uri uri) {
        int match = f12251d.match(uri);
        if (match == 1 || match == 2) {
            return "configuration";
        }
        if (match == 3 || match == 4) {
            return "sharehistory";
        }
        return null;
    }

    /* renamed from: l */
    public static void m17580l(boolean z) {
        m17582n("dark_widget_skin", String.valueOf(z));
    }

    /* renamed from: m */
    public static void m17581m(boolean z) {
        m17582n("dark_widget_skin_room", String.valueOf(z));
    }

    /* renamed from: n */
    public static Uri m17582n(String str, String str2) {
        Uri uri;
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put(C6038a.C6039a.C6040a.f12310a, str);
        contentValues.put(C6038a.C6039a.C6040a.f12311b, str2);
        Cursor e = m17573e(str);
        if (e == null || !e.moveToFirst()) {
            StringBuilder sb = new StringBuilder();
            sb.append("insert config key : ");
            sb.append(str);
            sb.append(" value = ");
            sb.append(str2);
            uri = contentResolver.insert(C6038a.C6039a.f12309a, contentValues);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("update config key: ");
            sb2.append(str);
            sb2.append(" value = ");
            sb2.append(str2);
            String[] strArr = {str};
            Uri uri2 = C6038a.C6039a.f12309a;
            uri = Uri.withAppendedPath(uri2, String.valueOf(contentResolver.update(uri2, contentValues, C6038a.C6039a.C6040a.f12310a + " = ?", strArr)));
        }
        if (e != null) {
            e.close();
        }
        return uri;
    }

    /* renamed from: o */
    public static Uri m17583o(C3051a.C3062k kVar) {
        Uri uri;
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put(C6038a.C6041b.C6042a.f12315b, kVar.mo23388b());
        contentValues.put(C6038a.C6041b.C6042a.f12316c, kVar.mo23389c());
        contentValues.put(C6038a.C6041b.C6042a.f12317d, kVar.mo23387a());
        contentValues.put(C6038a.C6041b.C6042a.f12318e, Long.valueOf(System.currentTimeMillis()));
        Cursor j = m17578j(kVar.mo23388b());
        if (j == null || !j.moveToFirst()) {
            StringBuilder sb = new StringBuilder();
            sb.append("insert share user mid: ");
            sb.append(kVar.mo23388b());
            uri = contentResolver.insert(C6038a.C6041b.f12312a, contentValues);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("update share user mid: ");
            sb2.append(kVar.mo23388b());
            String[] strArr = {kVar.mo23388b()};
            Uri uri2 = C6038a.C6041b.f12312a;
            uri = Uri.withAppendedPath(uri2, String.valueOf(contentResolver.update(uri2, contentValues, C6038a.C6041b.C6042a.f12315b + " = ?", strArr)));
        }
        if (j != null) {
            j.close();
        }
        return uri;
    }

    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        if (this.f12253a == null) {
            this.f12253a = this.f12254b.getReadableDatabase();
        }
        int match = f12251d.match(uri);
        if (match == 2 || match == 4) {
            return m17570b(uri, str, strArr);
        }
        String str2 = f12250c;
        AppUtils.m8300u(str2, "Invalid Uri: " + uri.toString());
        return -1;
    }

    @Nullable
    public String getType(@NonNull Uri uri) {
        int match = f12251d.match(uri);
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
        String str = f12250c;
        AppUtils.m8300u(str, "Unknown Uri: " + uri.toString());
        return null;
    }

    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        if (this.f12253a == null) {
            this.f12253a = this.f12254b.getReadableDatabase();
        }
        int match = f12251d.match(uri);
        if (match == 2 || match == 4) {
            return ContentUris.withAppendedId(uri, this.f12253a.insert(m17579k(uri), (String) null, contentValues));
        }
        String str = f12250c;
        AppUtils.m8300u(str, "Invalid Uri: " + uri.toString());
        return null;
    }

    public boolean onCreate() {
        this.f12254b = new C6032a(getContext());
        return true;
    }

    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        if (this.f12253a == null) {
            this.f12253a = this.f12254b.getReadableDatabase();
        }
        int match = f12251d.match(uri);
        if (match == 1 || match == 2 || match == 3 || match == 4) {
            return m17571c(uri, strArr, str, strArr2, str2);
        }
        return null;
    }

    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        if (this.f12253a == null) {
            this.f12253a = this.f12254b.getReadableDatabase();
        }
        int match = f12251d.match(uri);
        if (match == 2 || match == 4) {
            return m17572d(uri, contentValues, str, strArr);
        }
        String str2 = f12250c;
        AppUtils.m8300u(str2, "Invalid Uri: " + uri.toString());
        return -1;
    }
}

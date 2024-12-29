package com.yeelight.yeelib.data;

import android.content.ContentProvider;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.UriMatcher;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.miot.common.config.AppConfiguration;
import com.miot.common.device.Device;
import com.miot.common.device.parser.xml.DddTag;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.data.C6043b;
import com.yeelight.yeelib.data.DeviceBrowserContract;
import com.yeelight.yeelib.device.C6119c;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.C8281l;
import com.yeelight.yeelib.managers.C8293t;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.MeshNetWork;
import com.yeelight.yeelib.service.ShortcutUtils;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p051j4.C9189e;
import p145d4.C8937a;

public class DeviceDataProvider extends ContentProvider {

    /* renamed from: c */
    private static final String f12297c = DeviceDataProvider.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static int f12298d = 12;

    /* renamed from: e */
    private static final UriMatcher f12299e;

    /* renamed from: a */
    private SQLiteDatabase f12300a;

    /* renamed from: b */
    private C6036a f12301b;

    /* renamed from: com.yeelight.yeelib.data.DeviceDataProvider$a */
    public static class C6036a extends SQLiteOpenHelper {
        public C6036a(Context context) {
            this(context, "device.db", (SQLiteDatabase.CursorFactory) null, DeviceDataProvider.f12298d);
        }

        public C6036a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
            super(context, str, cursorFactory, i);
        }

        /* renamed from: a */
        private void m17645a(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS device(" + C6043b.C6044a.C6045a.f12329a + " integer primary key," + C6043b.C6044a.C6045a.f12330b + " varchar," + C6043b.C6044a.C6045a.f12331c + " varchar," + C6043b.C6044a.C6045a.f12332d + " varchar," + C6043b.C6044a.C6045a.f12333e + " varchar," + C6043b.C6044a.C6045a.f12334f + " varchar," + C6043b.C6044a.C6045a.f12335g + " varchar," + C6043b.C6044a.C6045a.f12336h + " varchar," + C6043b.C6044a.C6045a.f12337i + " varchar default 15," + C6043b.C6044a.C6045a.f12338j + " varchar," + C6043b.C6044a.C6045a.f12339k + " varchar," + C6043b.C6044a.C6045a.f12340l + " varchar )");
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE IF NOT EXISTS mesh_network(");
            sb.append(C6043b.C6054f.C6055a.f12380a);
            sb.append(" integer primary key,");
            sb.append(C6043b.C6054f.C6055a.f12381b);
            sb.append(" varchar,");
            sb.append(C6043b.C6054f.C6055a.f12382c);
            sb.append(" varchar,");
            sb.append(C6043b.C6054f.C6055a.f12383d);
            sb.append(" varchar)");
            sQLiteDatabase.execSQL(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CREATE TABLE IF NOT EXISTS device_group(");
            sb2.append(C6043b.C6046b.C6047a.f12342a);
            sb2.append(" integer primary key,");
            sb2.append(C6043b.C6046b.C6047a.f12343b);
            sb2.append(" varchar,");
            sb2.append(C6043b.C6046b.C6047a.f12344c);
            sb2.append(" varchar,");
            sb2.append(C6043b.C6046b.C6047a.f12345d);
            sb2.append(" varchar default 15,");
            sb2.append(C6043b.C6044a.C6045a.f12340l);
            sb2.append(" varchar )");
            sQLiteDatabase.execSQL(sb2.toString());
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS group_device_rel(" + C6043b.C6052e.C6053a.f12376a + " integer," + C6043b.C6052e.C6053a.f12377b + " integer)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ignore_device(" + C6060c.f12399a + " integer primary key," + C6060c.f12400b + " varchar," + C6060c.f12401c + " varchar)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tomato_record(" + C6061d.f12402a + " integer primary key," + C6061d.f12403b + " varchar," + C6061d.f12404c + " varchar," + C6061d.f12405d + " integer," + C6061d.f12406e + " varchar)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS device_records(" + C6043b.C6050d.C6051a.f12354a + " integer primary key," + C6043b.C6050d.C6051a.f12355b + " varchar," + C6043b.C6050d.C6051a.f12356c + " integer," + C6043b.C6050d.C6051a.f12357d + " integer," + C6043b.C6050d.C6051a.f12358e + " integer," + C6043b.C6050d.C6051a.f12359f + " integer," + C6043b.C6050d.C6051a.f12360g + " integer," + C6043b.C6050d.C6051a.f12361h + " integer," + C6043b.C6050d.C6051a.f12362i + " integer," + C6043b.C6050d.C6051a.f12363j + " integer," + C6043b.C6050d.C6051a.f12364k + " integer," + C6043b.C6050d.C6051a.f12365l + " integer," + C6043b.C6050d.C6051a.f12366m + " integer," + C6043b.C6050d.C6051a.f12367n + " integer," + C6043b.C6050d.C6051a.f12368o + " integer," + C6043b.C6050d.C6051a.f12369p + " integer," + C6043b.C6050d.C6051a.f12370q + " integer," + C6043b.C6050d.C6051a.f12371r + " integer," + C6043b.C6050d.C6051a.f12372s + " integer," + C6043b.C6050d.C6051a.f12373t + " integer," + C6043b.C6050d.C6051a.f12374u + " integer)");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("CREATE TABLE IF NOT EXISTS device_log(");
            sb3.append(C6043b.C6048c.C6049a.f12348a);
            sb3.append(" integer primary key,");
            sb3.append(C6043b.C6048c.C6049a.f12349b);
            sb3.append(" varchar,");
            sb3.append(C6043b.C6048c.C6049a.f12350c);
            sb3.append(" varchar,");
            sb3.append(C6043b.C6048c.C6049a.f12351d);
            sb3.append(" varchar,");
            sb3.append(C6043b.C6048c.C6049a.f12352e);
            sb3.append(" varchar)");
            sQLiteDatabase.execSQL(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("CREATE TABLE IF NOT EXISTS room(");
            sb4.append(C6043b.C6056g.C6057a.f12387b);
            sb4.append(" varchar,");
            sb4.append(C6043b.C6056g.C6057a.f12388c);
            sb4.append(" integer,");
            sb4.append(C6043b.C6056g.C6057a.f12389d);
            sb4.append(" varchar,");
            sb4.append(C6043b.C6056g.C6057a.f12390e);
            sb4.append(" varchar,");
            sb4.append(C6043b.C6056g.C6057a.f12391f);
            sb4.append(" integer,");
            sb4.append(C6043b.C6056g.C6057a.f12392g);
            sb4.append(" integer default 0,");
            sb4.append(C6043b.C6056g.C6057a.f12393h);
            sb4.append(" varchar,");
            sb4.append(C6043b.C6056g.C6057a.f12394i);
            sb4.append(" varchar default 15)");
            sQLiteDatabase.execSQL(sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("CREATE TABLE IF NOT EXISTS room_widget(");
            sb5.append(C6043b.C6058h.C6059a.f12397b);
            sb5.append(" varchar,");
            sb5.append(C6043b.C6058h.C6059a.f12398c);
            sb5.append(" varchar,");
            sb5.append(C6043b.C6058h.C6059a.f12396a);
            sb5.append(" varchar)");
            sQLiteDatabase.execSQL(sb5.toString());
        }

        /* renamed from: c */
        private void m17646c(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("alter table device rename to device_temp");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS device(" + C6043b.C6044a.C6045a.f12329a + " integer primary key," + C6043b.C6044a.C6045a.f12330b + " varchar," + C6043b.C6044a.C6045a.f12331c + " varchar," + C6043b.C6044a.C6045a.f12332d + " varchar," + C6043b.C6044a.C6045a.f12333e + " varchar," + C6043b.C6044a.C6045a.f12334f + " varchar," + C6043b.C6044a.C6045a.f12335g + " varchar," + C6043b.C6044a.C6045a.f12336h + " varchar," + C6043b.C6044a.C6045a.f12337i + " varchar default 15," + C6043b.C6044a.C6045a.f12338j + " varchar," + C6043b.C6044a.C6045a.f12339k + " varchar," + C6043b.C6044a.C6045a.f12340l + " varchar )");
            sQLiteDatabase.execSQL("INSERT INTO device SELECT * FROM device_temp");
            sQLiteDatabase.execSQL("drop table if exists device_temp");
            sQLiteDatabase.execSQL("DELETE FROM group_device_rel WHERE device_id = 0 ");
        }

        /* renamed from: d */
        private void m17647d(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_widget(" + C6043b.C6058h.C6059a.f12397b + " varchar," + C6043b.C6058h.C6059a.f12398c + " varchar," + C6043b.C6058h.C6059a.f12396a + " varchar)");
        }

        /* renamed from: m */
        private void m17648m(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE room_temp as select " + C6043b.C6056g.C6057a.f12388c + Constants.ACCEPT_TIME_SEPARATOR_SP + C6043b.C6056g.C6057a.f12389d + Constants.ACCEPT_TIME_SEPARATOR_SP + C6043b.C6056g.C6057a.f12390e + " from " + "room");
            sQLiteDatabase.execSQL("drop table if exists room");
            sQLiteDatabase.execSQL("alter table room_temp rename to room");
            StringBuilder sb = new StringBuilder();
            sb.append("ALTER TABLE room ADD ");
            sb.append(C6043b.C6056g.C6057a.f12387b);
            sb.append(" varchar");
            sQLiteDatabase.execSQL(sb.toString());
            sQLiteDatabase.execSQL("ALTER TABLE room ADD " + C6043b.C6056g.C6057a.f12391f + " integer");
            sQLiteDatabase.execSQL("ALTER TABLE room ADD " + C6043b.C6056g.C6057a.f12392g + " integer default 0");
            sQLiteDatabase.execSQL("ALTER TABLE room ADD " + C6043b.C6056g.C6057a.f12393h + " varchar");
            sQLiteDatabase.execSQL("CREATE TABLE device_temp as select " + C6043b.C6044a.C6045a.f12329a + Constants.ACCEPT_TIME_SEPARATOR_SP + C6043b.C6044a.C6045a.f12330b + Constants.ACCEPT_TIME_SEPARATOR_SP + C6043b.C6044a.C6045a.f12331c + Constants.ACCEPT_TIME_SEPARATOR_SP + C6043b.C6044a.C6045a.f12332d + Constants.ACCEPT_TIME_SEPARATOR_SP + C6043b.C6044a.C6045a.f12333e + Constants.ACCEPT_TIME_SEPARATOR_SP + C6043b.C6044a.C6045a.f12334f + Constants.ACCEPT_TIME_SEPARATOR_SP + C6043b.C6044a.C6045a.f12335g + Constants.ACCEPT_TIME_SEPARATOR_SP + C6043b.C6044a.C6045a.f12336h + Constants.ACCEPT_TIME_SEPARATOR_SP + C6043b.C6044a.C6045a.f12337i + " from " + DddTag.DEVICE);
            sQLiteDatabase.execSQL("drop table if exists device");
            sQLiteDatabase.execSQL("alter table device_temp rename to device");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ALTER TABLE device ADD ");
            sb2.append(C6043b.C6044a.C6045a.f12338j);
            sb2.append(" varchar");
            sQLiteDatabase.execSQL(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("CREATE TABLE IF NOT EXISTS mesh_network(");
            sb3.append(C6043b.C6054f.C6055a.f12380a);
            sb3.append(" integer primary key,");
            sb3.append(C6043b.C6054f.C6055a.f12381b);
            sb3.append(" varchar,");
            sb3.append(C6043b.C6054f.C6055a.f12382c);
            sb3.append(" varchar,");
            sb3.append(C6043b.C6054f.C6055a.f12383d);
            sb3.append(" varchar)");
            sQLiteDatabase.execSQL(sb3.toString());
            sQLiteDatabase.execSQL("ALTER TABLE device ADD mesh_id integer default 30");
        }

        /* renamed from: f */
        public void mo31438f(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("ALTER TABLE room ADD " + C6043b.C6056g.C6057a.f12394i + " varchar default 15");
        }

        /* renamed from: h */
        public void mo31439h(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("ALTER TABLE device ADD mac_address varchar");
        }

        /* renamed from: i */
        public void mo31440i(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("ALTER TABLE device ADD delay_off integer default 15");
        }

        /* renamed from: k */
        public void mo31441k(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room(" + C6043b.C6056g.C6057a.f12386a + " integer primary key," + C6043b.C6056g.C6057a.f12388c + " integer," + C6043b.C6056g.C6057a.f12389d + " varchar," + C6043b.C6056g.C6057a.f12390e + " varchar)");
            sQLiteDatabase.execSQL("ALTER TABLE device ADD room_id INTEGER DEFAULT -1");
        }

        /* renamed from: l */
        public void mo31442l(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("ALTER TABLE device_group ADD delay_off integer default 15");
        }

        /* renamed from: n */
        public void mo31443n(SQLiteDatabase sQLiteDatabase) {
            String a = C8281l.m19542b().mo35223a();
            if (a.isEmpty()) {
                a = AppConfiguration.Locale.cn.name();
            }
            sQLiteDatabase.execSQL("DELETE FROM device WHERE device_type = 'virtual'");
            sQLiteDatabase.execSQL("ALTER TABLE device ADD server varchar default " + a);
            sQLiteDatabase.execSQL("ALTER TABLE device_group ADD server varchar default " + a);
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            m17645a(sQLiteDatabase);
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i < 4) {
                mo31439h(sQLiteDatabase);
                i = 4;
            }
            if (i < 5) {
                mo31440i(sQLiteDatabase);
                i = 5;
            }
            if (i < 6) {
                mo31441k(sQLiteDatabase);
                i = 6;
            }
            if (i < 7) {
                mo31442l(sQLiteDatabase);
                i = 7;
            }
            if (i < 8) {
                m17648m(sQLiteDatabase);
                i = 8;
            }
            if (i < 9) {
                mo31443n(sQLiteDatabase);
                i = 9;
            }
            if (i < 10) {
                m17646c(sQLiteDatabase);
                i = 10;
            }
            if (i < 11) {
                m17647d(sQLiteDatabase);
                i = 11;
            }
            if (i < 12) {
                mo31438f(sQLiteDatabase);
            }
        }
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f12299e = uriMatcher;
        uriMatcher.addURI("com.yeelight.cherry.device.database", "device/#", 1);
        uriMatcher.addURI("com.yeelight.cherry.device.database", DddTag.DEVICE, 2);
        uriMatcher.addURI("com.yeelight.cherry.device.database", "room/#", 14);
        uriMatcher.addURI("com.yeelight.cherry.device.database", "room", 15);
        uriMatcher.addURI("com.yeelight.cherry.device.database", "device_group/#", 3);
        uriMatcher.addURI("com.yeelight.cherry.device.database", "device_group", 4);
        uriMatcher.addURI("com.yeelight.cherry.device.database", "group_device_rel/#", 5);
        uriMatcher.addURI("com.yeelight.cherry.device.database", "group_device_rel", 5);
        uriMatcher.addURI("com.yeelight.cherry.device.database", "ignore_device/#", 6);
        uriMatcher.addURI("com.yeelight.cherry.device.database", "ignore_device", 7);
        uriMatcher.addURI("com.yeelight.cherry.device.database", "tomato_record/#", 8);
        uriMatcher.addURI("com.yeelight.cherry.device.database", "tomato_record", 9);
        uriMatcher.addURI("com.yeelight.cherry.device.database", "device_records/#", 10);
        uriMatcher.addURI("com.yeelight.cherry.device.database", "device_records", 11);
        uriMatcher.addURI("com.yeelight.cherry.device.database", "device_log/#", 12);
        uriMatcher.addURI("com.yeelight.cherry.device.database", "device_log", 13);
        uriMatcher.addURI("com.yeelight.cherry.device.database", "mesh_network/#", 16);
        uriMatcher.addURI("com.yeelight.cherry.device.database", "mesh_network", 17);
        uriMatcher.addURI("com.yeelight.cherry.device.database", "all", 101);
        uriMatcher.addURI("com.yeelight.cherry.device.database", "all_except_device", 111);
        uriMatcher.addURI("com.yeelight.cherry.device.database", "bulb", 102);
        uriMatcher.addURI("com.yeelight.cherry.device.database", "lamp", 103);
        uriMatcher.addURI("com.yeelight.cherry.device.database", "group", 104);
        uriMatcher.addURI("com.yeelight.cherry.device.database", "cherry", 105);
        uriMatcher.addURI("com.yeelight.cherry.device.database", "light", 106);
        uriMatcher.addURI("com.yeelight.cherry.device.database", "light_dn2grp", 107);
        uriMatcher.addURI("com.yeelight.cherry.device.database", "light_mb1grp", 108);
        uriMatcher.addURI("com.yeelight.cherry.device.database", "light_mb2grp", 109);
        uriMatcher.addURI("com.yeelight.cherry.device.database", "light_sp1grp", 110);
        uriMatcher.addURI("com.yeelight.cherry.device.database", "room_widget", 18);
    }

    /* renamed from: A */
    public static Cursor m17588A() {
        if (!C3051a.m7928z()) {
            return new MatrixCursor(C6043b.C6044a.f12328b);
        }
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        return contentResolver.query(C6043b.f12321c, (String[]) null, " ( " + C6043b.C6044a.C6045a.f12340l + " = ? OR " + C6043b.C6044a.C6045a.f12330b + " = ? ) ", new String[]{C8281l.m19542b().mo35223a(), "bluetooth"}, (String) null);
    }

    /* renamed from: B */
    public static Cursor m17589B() {
        if (!C3051a.m7928z()) {
            return new MatrixCursor(C6043b.C6044a.f12328b);
        }
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        String a = C8281l.m19542b().mo35223a();
        return contentResolver.query(C6043b.C6044a.f12327a, (String[]) null, " ( " + C6043b.C6044a.C6045a.f12340l + " = ? OR " + C6043b.C6044a.C6045a.f12330b + " = ? ) AND ( " + C6043b.C6044a.C6045a.f12335g + " != ? AND " + C6043b.C6044a.C6045a.f12335g + " != ? AND " + C6043b.C6044a.C6045a.f12335g + " != ? AND " + C6043b.C6044a.C6045a.f12335g + " != ? )", new String[]{a, "bluetooth", "yeelink.wifispeaker.v1", "yeelink.gateway.v1", "yeelink.gateway.v1", "yeelink.switch.sw1"}, (String) null);
    }

    /* renamed from: C */
    public static Cursor m17590C() {
        if (!C3051a.m7928z()) {
            return new MatrixCursor(C6043b.C6044a.f12328b);
        }
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        return contentResolver.query(C6043b.C6046b.f12341a, (String[]) null, C6043b.C6044a.C6045a.f12340l + " = ? ", new String[]{C8281l.m19542b().mo35223a()}, (String) null);
    }

    /* renamed from: D */
    public static Cursor m17591D() {
        return !C3051a.m7928z() ? new MatrixCursor(C6043b.C6054f.f12379b) : C3108x.f4951e.getContentResolver().query(C6043b.C6054f.f12378a, (String[]) null, (String) null, (String[]) null, (String) null);
    }

    /* renamed from: E */
    public static Cursor m17592E() {
        if (!C3051a.m7928z()) {
            return new MatrixCursor(C6043b.C6056g.f12385b);
        }
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        String str = C6043b.C6056g.C6057a.f12393h;
        return contentResolver.query(C6043b.C6056g.f12384a, (String[]) null, C6043b.C6056g.C6057a.f12393h + " = ? ", new String[]{C8281l.m19542b().mo35223a()}, (String) null);
    }

    /* renamed from: F */
    public static Cursor m17593F() {
        if (!C3051a.m7928z()) {
            return new MatrixCursor(C6043b.C6044a.f12328b);
        }
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        return contentResolver.query(C6043b.C6044a.f12327a, (String[]) null, C6043b.C6044a.C6045a.f12330b + " = ? AND " + C6043b.C6044a.C6045a.f12340l + " = ? AND ( " + C6043b.C6044a.C6045a.f12335g + " != ? AND " + C6043b.C6044a.C6045a.f12335g + " != ? AND " + C6043b.C6044a.C6045a.f12335g + " != ? AND " + C6043b.C6044a.C6045a.f12335g + " != ? AND " + C6043b.C6044a.C6045a.f12335g + " != ? AND " + C6043b.C6044a.C6045a.f12335g + " != ? )", new String[]{"wifi", C8281l.m19542b().mo35223a(), "yeelink.wifispeaker.v1", "yeelink.gateway.v1", "yeelink.gateway.va", "yeelink.plug.plug", "yeelink.curtain.ctmt1", "yeelink.switch.sw1"}, (String) null);
    }

    /* renamed from: G */
    public static Cursor m17594G() {
        if (!C3051a.m7928z()) {
            return new MatrixCursor(C6043b.C6044a.f12328b);
        }
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        String a = C8281l.m19542b().mo35223a();
        return contentResolver.query(C6043b.C6044a.f12327a, (String[]) null, " ( " + C6043b.C6044a.C6045a.f12340l + " = ? OR " + C6043b.C6044a.C6045a.f12330b + " = ? ) AND ( " + C6043b.C6044a.C6045a.f12335g + " != ? AND " + C6043b.C6044a.C6045a.f12335g + " != ? AND " + C6043b.C6044a.C6045a.f12335g + " != ? AND " + C6043b.C6044a.C6045a.f12335g + " != ? AND " + C6043b.C6044a.C6045a.f12335g + " != ? AND " + C6043b.C6044a.C6045a.f12335g + " != ? AND " + C6043b.C6044a.C6045a.f12335g + " != ? )", new String[]{a, "bluetooth", "yeelink.wifispeaker.v1", "yeelink.gateway.v1", "yeelink.gateway.va", "yeelink.gateway.va", "yeelink.curtain.ctmt1", "yeelink.switch.sw1", "yeelink.plug.plug"}, (String) null);
    }

    /* renamed from: H */
    public static Cursor m17595H(int i) {
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        Uri withAppendedId = ContentUris.withAppendedId(C6043b.C6044a.f12327a, (long) i);
        String a = C8281l.m19542b().mo35223a();
        return contentResolver.query(withAppendedId, (String[]) null, C6043b.C6044a.C6045a.f12340l + " = ?", new String[]{a}, (String) null);
    }

    /* renamed from: I */
    public static Cursor m17596I(String str) {
        if (!C3051a.m7928z()) {
            return new MatrixCursor(C6043b.C6044a.f12328b);
        }
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        return contentResolver.query(C6043b.C6044a.f12327a, (String[]) null, C6043b.C6044a.C6045a.f12331c + " = ? and ( " + C6043b.C6044a.C6045a.f12340l + " = ? OR " + C6043b.C6044a.C6045a.f12330b + " = ? )", new String[]{str, C8281l.m19542b().mo35223a(), "bluetooth"}, (String) null);
    }

    /* renamed from: J */
    public static Cursor m17597J(String str) {
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        Cursor query = contentResolver.query(C6043b.C6044a.f12327a, new String[]{C6043b.C6044a.C6045a.f12339k}, C6043b.C6044a.C6045a.f12331c + " = ?", new String[]{str}, (String) null);
        if (query.moveToFirst()) {
            try {
                return contentResolver.query(C6043b.C6054f.f12378a, C6043b.C6054f.f12379b, C6043b.C6054f.C6055a.f12380a + " = ?", new String[]{String.valueOf(query.getInt(query.getColumnIndex(C6043b.C6054f.C6055a.f12380a)))}, (String) null);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } else {
            query.close();
            return null;
        }
    }

    /* renamed from: K */
    public static Cursor m17598K(String str) {
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        return contentResolver.query(C6043b.C6046b.f12341a, (String[]) null, C6043b.C6046b.C6047a.f12342a + " = ? and " + C6043b.C6046b.C6047a.f12346e + " = ?", new String[]{str, C8281l.m19542b().mo35223a()}, (String) null);
    }

    /* renamed from: L */
    public static int m17599L(String str) {
        return m17601N(str).getCount();
    }

    /* renamed from: M */
    public static Cursor m17600M(C3010c cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("get all groups contain device, device id: ");
        sb.append(cVar.mo23185G());
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        return contentResolver.query(C6043b.C6052e.f12375a, (String[]) null, C6043b.C6052e.C6053a.f12377b + " = ?", new String[]{String.valueOf(m17602O(cVar))}, (String) null);
    }

    /* renamed from: N */
    public static Cursor m17601N(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("getGroupDevices, group id: ");
        sb.append(str);
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        Cursor query = contentResolver.query(C6043b.C6052e.f12375a, (String[]) null, C6043b.C6052e.C6053a.f12376a + " = ?", new String[]{str}, (String) null);
        MatrixCursor matrixCursor = new MatrixCursor(C6043b.C6044a.f12328b);
        if (query.moveToFirst()) {
            do {
                int i = query.getInt(query.getColumnIndex(C6043b.C6052e.C6053a.f12377b));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("_id = ");
                sb2.append(i);
                Cursor H = m17595H(i);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("device data cursor, count: ");
                sb3.append(H.getCount());
                StringBuilder sb4 = new StringBuilder();
                sb4.append("device data cursor, _ID index: ");
                sb4.append(H.getColumnIndex(C6043b.C6044a.C6045a.f12329a));
                if (H.moveToFirst()) {
                    matrixCursor.addRow(new Object[]{Integer.valueOf(H.getInt(H.getColumnIndex(C6043b.C6044a.C6045a.f12329a))), H.getString(H.getColumnIndex(C6043b.C6044a.C6045a.f12330b)), H.getString(H.getColumnIndex(C6043b.C6044a.C6045a.f12331c)), H.getString(H.getColumnIndex(C6043b.C6044a.C6045a.f12334f)), H.getString(H.getColumnIndex(C6043b.C6044a.C6045a.f12335g)), H.getString(H.getColumnIndex(C6043b.C6044a.C6045a.f12336h)), H.getString(H.getColumnIndex(C6043b.C6044a.C6045a.f12339k)), H.getString(H.getColumnIndex(C6043b.C6044a.C6045a.f12340l))});
                }
                H.close();
            } while (query.moveToNext());
        }
        query.close();
        return matrixCursor;
    }

    /* renamed from: O */
    public static int m17602O(C3010c cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceDataProvider, getId, device id: ");
        sb.append(cVar.mo23185G());
        return m17603P(cVar.mo23185G());
    }

    /* renamed from: P */
    public static int m17603P(String str) {
        Cursor I = m17596I(str);
        int i = I.moveToFirst() ? I.getInt(I.getColumnIndex(C6043b.C6044a.C6045a.f12329a)) : -1;
        I.close();
        return i;
    }

    /* renamed from: Q */
    public static String m17604Q(String str) {
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        Cursor query = contentResolver.query(C6043b.C6044a.f12327a, (String[]) null, C6043b.C6044a.C6045a.f12338j + " = ?", new String[]{str}, (String) null);
        if (query == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (query.moveToFirst()) {
            do {
                sb.append(query.getString(query.getColumnIndex(C6043b.C6044a.C6045a.f12331c)));
                sb.append(";");
            } while (query.moveToNext());
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        query.close();
        return sb.toString();
    }

    /* renamed from: R */
    public static String m17605R(String str) {
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        Cursor query = contentResolver.query(C6043b.C6058h.f12395a, (String[]) null, C6043b.C6058h.C6059a.f12397b + " = ?", new String[]{str}, (String) null);
        String str2 = "";
        if (query == null) {
            return str2;
        }
        if (query.moveToFirst()) {
            str2 = query.getString(query.getColumnIndex(C6043b.C6058h.C6059a.f12396a));
        }
        query.close();
        return str2;
    }

    /* renamed from: S */
    private String m17606S(Uri uri) {
        int match = f12299e.match(uri);
        switch (match) {
            case 1:
            case 2:
                return DddTag.DEVICE;
            case 3:
            case 4:
                return "device_group";
            case 5:
                return "group_device_rel";
            case 6:
            case 7:
                return "ignore_device";
            case 8:
            case 9:
                return "tomato_record";
            case 10:
            case 11:
                return "device_records";
            case 12:
            case 13:
                return "device_log";
            case 14:
            case 15:
                return "room";
            case 16:
            case 17:
                return "mesh_network";
            case 18:
                return "room_widget";
            default:
                switch (match) {
                    case 107:
                    case 108:
                    case 109:
                    case 110:
                        return DddTag.DEVICE;
                    default:
                        return null;
                }
        }
    }

    /* renamed from: T */
    public static boolean m17607T(String str, String str2) {
        Cursor N = m17601N(str);
        if (N == null || N.getCount() == 0 || !N.moveToFirst()) {
            return false;
        }
        while (!N.getString(N.getColumnIndex(C6043b.C6044a.C6045a.f12331c)).equals(str2)) {
            if (!N.moveToNext()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: U */
    public static boolean m17608U(String str) {
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        Cursor query = contentResolver.query(C6043b.C6046b.f12341a, (String[]) null, C6043b.C6046b.C6047a.f12342a + " = ? and " + C6043b.C6046b.C6047a.f12346e + " = ?", new String[]{str, C8281l.m19542b().mo35223a()}, (String) null);
        boolean moveToFirst = query.moveToFirst();
        query.close();
        return moveToFirst;
    }

    /* renamed from: V */
    public static boolean m17609V(String str) {
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        Cursor query = contentResolver.query(C6043b.C6046b.f12341a, (String[]) null, C6043b.C6046b.C6047a.f12344c + " = ? and " + C6043b.C6046b.C6047a.f12346e + " = ?", new String[]{str, C8281l.m19542b().mo35223a()}, (String) null);
        boolean moveToFirst = query.moveToFirst();
        query.close();
        return moveToFirst;
    }

    /* renamed from: W */
    private void m17610W(Uri uri) {
        Uri uri2;
        switch (f12299e.match(uri)) {
            case 1:
            case 2:
                uri2 = C6043b.C6044a.f12327a;
                break;
            case 3:
            case 4:
            case 16:
            case 17:
                uri2 = C6043b.C6046b.f12341a;
                break;
            case 5:
                uri2 = C6043b.C6052e.f12375a;
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                return;
            case 10:
            case 11:
                uri2 = C6043b.C6050d.f12353a;
                break;
            case 12:
            case 13:
                uri2 = C6043b.C6048c.f12347a;
                break;
            case 14:
            case 15:
                uri2 = C6043b.C6056g.f12384a;
                break;
            case 18:
                uri2 = C6043b.C6058h.f12395a;
                break;
            default:
                String str = f12297c;
                AppUtils.m8300u(str, "Invalid Uri: " + uri.toString());
                return;
        }
        getContext().getContentResolver().notifyChange(uri2, (ContentObserver) null);
    }

    /* renamed from: X */
    public static void m17611X() {
        C3108x.f4951e.getContentResolver().notifyChange(C6043b.C6044a.f12327a, (ContentObserver) null);
    }

    /* renamed from: Y */
    public static void m17612Y(C3010c cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("remove device from group device relation table, device id: ");
        sb.append(cVar.mo23185G());
        Cursor M = m17600M(cVar);
        if (M.moveToFirst()) {
            ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
            do {
                String string = M.getString(M.getColumnIndexOrThrow(C6043b.C6052e.C6053a.f12376a));
                contentResolver.delete(C6043b.C6052e.f12375a, C6043b.C6052e.C6053a.f12377b + " = ? AND " + C6043b.C6052e.C6053a.f12376a + " = ?", new String[]{String.valueOf(m17602O(cVar)), string});
                if (m17599L(string) == 0) {
                    m17629k(string);
                }
            } while (M.moveToNext());
        }
    }

    /* renamed from: Z */
    public static boolean m17613Z(C8937a aVar) {
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.putNull(C6043b.C6044a.C6045a.f12338j);
        contentResolver.update(C6043b.C6044a.f12327a, contentValues, C6043b.C6044a.C6045a.f12338j + " = ?", new String[]{aVar.mo36722n()});
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put(C6043b.C6056g.C6057a.f12392g, 1);
        contentValues2.put(C6043b.C6056g.C6057a.f12391f, Long.valueOf(aVar.mo36725q()));
        contentResolver.update(C6043b.C6056g.f12384a, contentValues2, C6043b.C6056g.C6057a.f12387b + " = ?", new String[]{aVar.mo36722n()});
        return true;
    }

    /* renamed from: a0 */
    public static Uri m17615a0(C3010c cVar) {
        Uri uri;
        if (!C3051a.m7928z()) {
            AppUtils.m8300u(f12297c, "updateDeviceDatabase, no reason to be here, suicide! Good Luck!");
        }
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put(C6043b.C6044a.C6045a.f12330b, cVar.mo23190J());
        contentValues.put(C6043b.C6044a.C6045a.f12336h, cVar.mo23212W().name());
        contentValues.put(C6043b.C6044a.C6045a.f12331c, cVar.mo23185G());
        contentValues.put(C6043b.C6044a.C6045a.f12332d, cVar.mo23204R());
        contentValues.put(C6043b.C6044a.C6045a.f12333e, C3051a.m7925r().mo23366v());
        contentValues.put(C6043b.C6044a.C6045a.f12337i, Integer.valueOf(cVar.mo23181D()));
        if (cVar.mo23210U() != null && !cVar.mo23210U().isEmpty()) {
            contentValues.put(C6043b.C6044a.C6045a.f12334f, cVar.mo23210U());
        }
        contentValues.put(C6043b.C6044a.C6045a.f12335g, cVar.mo23208T());
        contentValues.put(C6043b.C6044a.C6045a.f12340l, C8281l.m19542b().mo35223a());
        Cursor I = m17596I(cVar.mo23185G());
        if (I.moveToFirst()) {
            StringBuilder sb = new StringBuilder();
            sb.append("update device: ");
            sb.append(cVar.mo23185G());
            String[] strArr = {cVar.mo23185G(), C8281l.m19542b().mo35223a()};
            Uri uri2 = C6043b.C6044a.f12327a;
            uri = Uri.withAppendedPath(uri2, String.valueOf(contentResolver.update(uri2, contentValues, C6043b.C6044a.C6045a.f12331c + " = ? AND " + C6043b.C6044a.C6045a.f12340l + " = ?", strArr)));
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("insert device: ");
            sb2.append(cVar.mo23185G());
            uri = contentResolver.insert(C6043b.C6044a.f12327a, contentValues);
        }
        I.close();
        return uri;
    }

    /* renamed from: b */
    public static boolean m17616b(String str, String str2) {
        int P = m17603P(str);
        StringBuilder sb = new StringBuilder();
        sb.append("Add device : ");
        sb.append(P);
        sb.append(", into room: ");
        sb.append(str2);
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put(C6043b.C6044a.C6045a.f12338j, str2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C6043b.C6044a.C6045a.f12331c);
        sb2.append(" = ? ");
        return contentResolver.update(C6043b.C6044a.f12327a, contentValues, sb2.toString(), new String[]{String.valueOf(str)}) > 0;
    }

    /* renamed from: b0 */
    public static Uri m17617b0(C3010c cVar, String str) {
        if (!C3051a.m7928z()) {
            AppUtils.m8300u(f12297c, "updateDeviceDatabase, no reason to be here, suicide! Good Luck!");
        }
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put(C6043b.C6044a.C6045a.f12335g, str);
        Cursor I = m17596I(cVar.mo23185G());
        StringBuilder sb = new StringBuilder();
        sb.append("update device: ");
        sb.append(cVar.mo23185G());
        String[] strArr = {cVar.mo23185G(), C8281l.m19542b().mo35223a()};
        Uri uri = C6043b.C6044a.f12327a;
        Uri withAppendedPath = Uri.withAppendedPath(uri, String.valueOf(contentResolver.update(uri, contentValues, C6043b.C6044a.C6045a.f12331c + " = ? AND " + C6043b.C6044a.C6045a.f12340l + " = ?", strArr)));
        I.close();
        return withAppendedPath;
    }

    /* renamed from: c */
    public static String m17618c(String str, List<C3010c> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("Add group, name : ");
        sb.append(str);
        sb.append(", device count: ");
        sb.append(list.size());
        if (str == null || str.isEmpty()) {
            return C3108x.f4951e.getResources().getString(R$string.error_invalid_group_name);
        }
        if (m17609V(str)) {
            return C3108x.f4951e.getResources().getString(R$string.error_group_name_exist);
        }
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put(C6043b.C6046b.C6047a.f12343b, C3051a.m7925r().mo23366v());
        contentValues.put(C6043b.C6046b.C6047a.f12344c, str);
        contentValues.put(C6043b.C6046b.C6047a.f12345d, 15);
        contentValues.put(C6043b.C6046b.C6047a.f12346e, C8281l.m19542b().mo35223a());
        long parseId = ContentUris.parseId(contentResolver.insert(C6043b.C6046b.f12341a, contentValues));
        for (C3010c O : list) {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put(C6043b.C6052e.C6053a.f12376a, Long.valueOf(parseId));
            contentValues2.put(C6043b.C6052e.C6053a.f12377b, Integer.valueOf(m17602O(O)));
            contentResolver.insert(C6043b.C6052e.f12375a, contentValues2);
        }
        YeelightDeviceManager.m7800o0().mo23275Q(new C6119c(String.valueOf(parseId), str));
        return null;
    }

    /* renamed from: c0 */
    public static boolean m17619c0(String str, int i) {
        if (!C3051a.m7928z()) {
            AppUtils.m8300u(f12297c, "updateDeviceMeshInfo, no reason to be here, suicide! Good Luck!");
        }
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put(C6043b.C6044a.C6045a.f12339k, Integer.valueOf(i));
        int update = contentResolver.update(C6043b.C6044a.f12327a, contentValues, C6043b.C6044a.C6045a.f12331c + " = ?", new String[]{str});
        StringBuilder sb = new StringBuilder();
        sb.append("updateDeviceMeshInfo result = ");
        sb.append(update);
        return update > 0;
    }

    /* renamed from: d */
    public static int m17620d(MeshNetWork meshNetWork) {
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        Uri uri = C6043b.C6054f.f12378a;
        Cursor query = contentResolver.query(uri, (String[]) null, C6043b.C6054f.C6055a.f12381b + " =? and " + C6043b.C6054f.C6055a.f12383d + " = ?", new String[]{meshNetWork.getNetworkName(), meshNetWork.getPassword()}, (String) null);
        if (query.moveToFirst()) {
            int i = query.getInt(query.getColumnIndex(C6043b.C6054f.C6055a.f12380a));
            query.close();
            return i | BasicMeasure.EXACTLY;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(C6043b.C6054f.C6055a.f12380a, (Integer) null);
        contentValues.put(C6043b.C6054f.C6055a.f12382c, meshNetWork.getName());
        contentValues.put(C6043b.C6054f.C6055a.f12381b, meshNetWork.getNetworkName());
        contentValues.put(C6043b.C6054f.C6055a.f12383d, meshNetWork.getPassword());
        Uri insert = contentResolver.insert(uri, contentValues);
        query.close();
        return (int) ContentUris.parseId(insert);
    }

    /* renamed from: d0 */
    public static void m17621d0(C6119c cVar) {
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put(C6043b.C6046b.C6047a.f12342a, cVar.mo23185G());
        contentValues.put(C6043b.C6046b.C6047a.f12343b, C3051a.m7925r().mo23366v());
        contentValues.put(C6043b.C6046b.C6047a.f12344c, cVar.mo23210U());
        contentValues.put(C6043b.C6046b.C6047a.f12345d, Integer.valueOf(cVar.mo23181D()));
        contentValues.put(C6043b.C6046b.C6047a.f12346e, C8281l.m19542b().mo35223a());
        Cursor K = m17598K(cVar.mo23185G());
        if (K.moveToFirst()) {
            StringBuilder sb = new StringBuilder();
            sb.append("update device group: ");
            sb.append(cVar.mo23185G());
            contentResolver.update(C6043b.C6046b.f12341a, contentValues, C6043b.C6046b.C6047a.f12342a + " = ?", new String[]{cVar.mo23185G()});
            K.close();
            return;
        }
        throw new IllegalArgumentException("updateGroupDatabase: No reason to be here, suicide!");
    }

    /* renamed from: e */
    public static boolean m17622e(C8937a aVar) {
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put(C6043b.C6056g.C6057a.f12387b, aVar.mo36722n());
        contentValues.put(C6043b.C6056g.C6057a.f12388c, Integer.valueOf(aVar.mo36726r()));
        contentValues.put(C6043b.C6056g.C6057a.f12389d, C3051a.m7925r().mo23366v());
        contentValues.put(C6043b.C6056g.C6057a.f12390e, aVar.mo36723o());
        contentValues.put(C6043b.C6056g.C6057a.f12391f, Long.valueOf(aVar.mo36725q()));
        contentValues.put(C6043b.C6056g.C6057a.f12392g, Boolean.valueOf(aVar.mo36728t()));
        contentValues.put(C6043b.C6056g.C6057a.f12393h, aVar.mo36724p());
        contentValues.put(C6043b.C6056g.C6057a.f12394i, Integer.valueOf(aVar.mo36717h()));
        contentResolver.insert(C6043b.C6056g.f12384a, contentValues);
        if (aVar.mo36728t()) {
            return true;
        }
        Iterator<C3012e> it = aVar.mo36718i().iterator();
        while (it.hasNext()) {
            C3010c next = it.next();
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put(C6043b.C6044a.C6045a.f12338j, aVar.mo36722n());
            contentResolver.update(C6043b.C6044a.f12327a, contentValues2, C6043b.C6044a.C6045a.f12331c + " = ?", new String[]{next.mo23185G()});
            StringBuilder sb = new StringBuilder();
            sb.append("Update ROOM_ID for device: ");
            sb.append(next.mo23210U());
            sb.append(", room: ");
            sb.append(aVar.mo36723o());
            next.mo23203Q0(aVar.mo36722n());
        }
        return true;
    }

    /* renamed from: e0 */
    public static boolean m17623e0(C8937a aVar) {
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put(C6043b.C6056g.C6057a.f12388c, Integer.valueOf(aVar.mo36726r()));
        contentValues.put(C6043b.C6056g.C6057a.f12390e, aVar.mo36723o());
        contentValues.put(C6043b.C6056g.C6057a.f12391f, Long.valueOf(aVar.mo36725q()));
        contentValues.put(C6043b.C6056g.C6057a.f12392g, Boolean.valueOf(aVar.mo36728t()));
        contentValues.put(C6043b.C6056g.C6057a.f12393h, aVar.mo36724p());
        contentValues.put(C6043b.C6056g.C6057a.f12394i, Integer.valueOf(aVar.mo36717h()));
        contentResolver.update(C6043b.C6056g.f12384a, contentValues, C6043b.C6056g.C6057a.f12387b + " = ?", new String[]{aVar.mo36722n()});
        ContentValues contentValues2 = new ContentValues();
        contentValues2.putNull(C6043b.C6044a.C6045a.f12338j);
        contentResolver.update(C6043b.C6044a.f12327a, contentValues2, C6043b.C6044a.C6045a.f12338j + " = ?", new String[]{aVar.mo36722n()});
        for (C3010c next : YeelightDeviceManager.m7800o0().mo23321w0()) {
            if (aVar.mo36722n().equals(next.mo23217Z())) {
                next.mo23203Q0((String) null);
            }
        }
        Iterator<C3012e> it = aVar.mo36718i().iterator();
        while (it.hasNext()) {
            C3010c next2 = it.next();
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put(C6043b.C6044a.C6045a.f12338j, aVar.mo36722n());
            contentResolver.update(C6043b.C6044a.f12327a, contentValues3, C6043b.C6044a.C6045a.f12331c + " = ?", new String[]{next2.mo23185G()});
            next2.mo23203Q0(aVar.mo36722n());
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m17624f(String str, String str2) {
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put(C6043b.C6058h.C6059a.f12397b, str2);
        contentValues.put(C6043b.C6058h.C6059a.f12396a, str);
        contentValues.put(C6043b.C6058h.C6059a.f12398c, C3051a.m7925r().mo23366v());
        contentResolver.insert(C6043b.C6058h.f12395a, contentValues);
        return true;
    }

    /* renamed from: g */
    public static boolean m17625g(List<C8937a> list) {
        ArrayList arrayList = new ArrayList();
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        for (C8937a next : list) {
            ContentProviderOperation.Builder newUpdate = ContentProviderOperation.newUpdate(C6043b.C6044a.f12327a);
            arrayList.add(newUpdate.withSelection(C6043b.C6044a.C6045a.f12338j + " = ?", new String[]{String.valueOf(next.mo36722n())}).withValue(C6043b.C6044a.C6045a.f12338j, (Object) null).build());
            ContentProviderOperation.Builder newUpdate2 = ContentProviderOperation.newUpdate(C6043b.C6056g.f12384a);
            arrayList.add(newUpdate2.withSelection(C6043b.C6056g.C6057a.f12387b + " = ?", new String[]{next.mo36722n()}).withValue(C6043b.C6056g.C6057a.f12392g, 1).withValue(C6043b.C6056g.C6057a.f12391f, Long.valueOf(next.mo36725q())).build());
        }
        try {
            contentResolver.applyBatch("com.yeelight.cherry.device.database", arrayList);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (OperationApplicationException e2) {
            e2.printStackTrace();
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m17626h(List<C8937a> list) {
        ArrayList arrayList = new ArrayList();
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        String str = C6043b.C6056g.C6057a.f12387b + " = ?";
        for (C8937a next : list) {
            arrayList.add(ContentProviderOperation.newUpdate(C6043b.C6056g.f12384a).withSelection(str, new String[]{String.valueOf(next.mo36722n())}).withValue(C6043b.C6056g.C6057a.f12388c, Integer.valueOf(next.mo36726r())).withValue(C6043b.C6056g.C6057a.f12390e, next.mo36723o()).withValue(C6043b.C6056g.C6057a.f12391f, Long.valueOf(next.mo36725q())).withValue(C6043b.C6056g.C6057a.f12392g, Boolean.valueOf(next.mo36728t())).withValue(C6043b.C6056g.C6057a.f12393h, next.mo36724p()).withValue(C6043b.C6056g.C6057a.f12394i, Integer.valueOf(next.mo36717h())).build());
            arrayList.add(ContentProviderOperation.newUpdate(C6043b.C6044a.f12327a).withSelection(C6043b.C6044a.C6045a.f12338j + " = ?", new String[]{next.mo36722n()}).withValue(C6043b.C6044a.C6045a.f12338j, (Object) null).build());
            for (C3010c next2 : YeelightDeviceManager.m7800o0().mo23321w0()) {
                if (next.mo36722n().equals(next2.mo23217Z())) {
                    next2.mo23203Q0((String) null);
                }
            }
            Iterator<C3012e> it = next.mo36718i().iterator();
            while (it.hasNext()) {
                C3010c next3 = it.next();
                String[] strArr = {next3.mo23185G()};
                next3.mo23203Q0(next.mo36722n());
                arrayList.add(ContentProviderOperation.newUpdate(C6043b.C6044a.f12327a).withSelection(C6043b.C6044a.C6045a.f12331c + " = ?", strArr).withValue(C6043b.C6044a.C6045a.f12338j, next.mo36722n()).build());
            }
        }
        try {
            contentResolver.applyBatch("com.yeelight.cherry.device.database", arrayList);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (OperationApplicationException e2) {
            e2.printStackTrace();
        }
        return false;
    }

    /* renamed from: i */
    public static void m17627i(C3010c cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("delete from database, device id: ");
        sb.append(cVar.mo23185G());
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        m17612Y(cVar);
        contentResolver.delete(C6043b.C6044a.f12327a, C6043b.C6044a.C6045a.f12331c + " = ? and ( " + C6043b.C6044a.C6045a.f12340l + " = ? OR " + C6043b.C6044a.C6045a.f12330b + " = ? )", new String[]{cVar.mo23185G(), C8281l.m19542b().mo35223a(), "bluetooth"});
        C8293t.m19620n().mo35261x(cVar.mo23217Z(), cVar.mo23185G());
        YeelightDeviceManager.m7800o0().mo23320v1(cVar.mo23185G());
        ShortcutUtils.removeShortcut(cVar);
    }

    /* renamed from: j */
    public static void m17628j(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("delete from database, device id: ");
        sb.append(str);
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        contentResolver.delete(C6043b.C6044a.f12327a, C6043b.C6044a.C6045a.f12331c + " = ? AND " + C6043b.C6044a.C6045a.f12340l + " = ?", new String[]{str, C8281l.m19542b().mo35223a()});
    }

    /* renamed from: k */
    public static void m17629k(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Delete group device, device id:");
        sb.append(str);
        if (m17608U(str)) {
            C3010c j0 = YeelightDeviceManager.m7794j0(str);
            YeelightDeviceManager.m7800o0().mo23320v1(str);
            ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
            contentResolver.delete(C6043b.C6046b.f12341a, C6043b.C6046b.C6047a.f12343b + " = ? AND " + C6043b.C6046b.C6047a.f12342a + " = ? AND " + C6043b.C6046b.C6047a.f12346e + " = ?", new String[]{C3051a.m7925r().mo23366v(), str, C8281l.m19542b().mo35223a()});
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C6043b.C6052e.C6053a.f12376a);
            sb2.append(" = ? ");
            contentResolver.delete(C6043b.C6052e.f12375a, sb2.toString(), new String[]{str});
            ShortcutUtils.removeShortcut(j0);
        }
    }

    /* renamed from: l */
    public static boolean m17630l(int i) {
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        int delete = contentResolver.delete(C6043b.C6054f.f12378a, C6043b.C6054f.C6055a.f12380a + " = ?", new String[]{String.valueOf(i)});
        StringBuilder sb = new StringBuilder();
        sb.append("deleteMeshNetwork result = ");
        sb.append(delete);
        return delete > 0;
    }

    /* renamed from: m */
    public static boolean m17631m(C8937a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Actually delete room from database, room name: ");
        sb.append(aVar.mo36723o());
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.putNull(C6043b.C6044a.C6045a.f12338j);
        contentResolver.update(C6043b.C6044a.f12327a, contentValues, C6043b.C6044a.C6045a.f12338j + " = ?", new String[]{aVar.mo36722n()});
        contentResolver.delete(C6043b.C6056g.f12384a, C6043b.C6056g.C6057a.f12387b + " = ?", new String[]{aVar.mo36722n()});
        if (!aVar.mo36728t()) {
            YeelightDeviceManager.m7800o0().mo23320v1(aVar.mo36722n());
        }
        return true;
    }

    /* renamed from: n */
    public static boolean m17632n(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Actually delete room from database, widgetId: ");
        sb.append(str);
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        contentResolver.delete(C6043b.C6058h.f12395a, C6043b.C6058h.C6059a.f12397b + " = ?", new String[]{str});
        return true;
    }

    /* renamed from: o */
    private int m17633o(Uri uri) {
        return m17634p(uri, "_id = ?", new String[]{Long.toString(ContentUris.parseId(uri))});
    }

    /* renamed from: p */
    private int m17634p(Uri uri, String str, String[] strArr) {
        return this.f12300a.delete(m17606S(uri), str, strArr);
    }

    /* renamed from: q */
    private Cursor m17635q(Uri uri, String[] strArr) {
        return m17636r(uri, strArr, "_id = ?", new String[]{Long.toString(ContentUris.parseId(uri))}, (String) null);
    }

    /* renamed from: r */
    private Cursor m17636r(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return this.f12300a.query(m17606S(uri), strArr, str, strArr2, (String) null, (String) null, str2);
    }

    /* renamed from: s */
    private Cursor m17637s(Uri uri, String[] strArr, String str, String[] strArr2, String str2, List<String> list) {
        int i;
        if (list != null) {
            for (String append : list) {
                StringBuilder sb = new StringBuilder();
                sb.append("doQuery, #####filter: ");
                sb.append(append);
            }
        }
        MatrixCursor matrixCursor = new MatrixCursor(C6043b.C6044a.f12328b);
        Cursor z = m17644z();
        if (z.moveToFirst()) {
            i = 1;
            do {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("GetAllDevice: ");
                sb2.append(z.getString(z.getColumnIndex(C6043b.C6044a.C6045a.f12331c)));
                sb2.append(" ,model = ");
                sb2.append(z.getString(z.getColumnIndex(C6043b.C6044a.C6045a.f12335g)));
                sb2.append(", mesh_id = ");
                sb2.append(z.getColumnIndex(C6043b.C6044a.C6045a.f12339k));
                if (list == null || list.contains(z.getString(z.getColumnIndex(C6043b.C6044a.C6045a.f12335g)))) {
                    matrixCursor.addRow(new Object[]{Integer.valueOf(i), z.getString(z.getColumnIndex(C6043b.C6044a.C6045a.f12330b)), z.getString(z.getColumnIndex(C6043b.C6044a.C6045a.f12331c)), z.getString(z.getColumnIndex(C6043b.C6044a.C6045a.f12334f)), z.getString(z.getColumnIndex(C6043b.C6044a.C6045a.f12335g)), z.getString(z.getColumnIndex(C6043b.C6044a.C6045a.f12336h)), z.getString(z.getColumnIndex(C6043b.C6044a.C6045a.f12339k)), z.getString(z.getColumnIndex(C6043b.C6044a.C6045a.f12340l))});
                    i++;
                }
            } while (z.moveToNext());
        } else {
            i = 1;
        }
        z.close();
        if (list == null || list.contains("yeelink.light.group")) {
            Cursor C = m17590C();
            if (C.moveToFirst()) {
                while (true) {
                    int i2 = i + 1;
                    matrixCursor.addRow(new Object[]{Integer.valueOf(i), "group", Integer.valueOf(C.getInt(C.getColumnIndex(C6043b.C6046b.C6047a.f12342a))), C.getString(C.getColumnIndex(C6043b.C6046b.C6047a.f12344c)), "yeelink.light.group", DeviceBrowserContract.DeviceBrowser.C6035b.f12294a, "-1", C.getString(C.getColumnIndex(C6043b.C6046b.C6047a.f12346e))});
                    if (!C.moveToNext()) {
                        break;
                    }
                    i = i2;
                }
            }
            C.close();
        }
        return matrixCursor;
    }

    /* renamed from: t */
    private Cursor m17638t(Uri uri, String[] strArr, String[] strArr2, String str, String str2) {
        String[] strArr3;
        String str3 = C6043b.C6044a.C6045a.f12333e + " = ? AND " + C6043b.C6044a.C6045a.f12340l + " = ? AND " + C6043b.C6044a.C6045a.f12336h + " = ? AND " + C6043b.C6044a.C6045a.f12335g + " = ?";
        String a = C8281l.m19542b().mo35223a();
        if (strArr2 == null) {
            strArr3 = new String[]{C3051a.m7925r().mo23366v(), a, String.valueOf(Device.Ownership.MINE), str2};
        } else {
            String[] strArr4 = new String[(strArr2.length + 4)];
            strArr4[0] = C3051a.m7925r().mo23366v();
            strArr4[1] = a;
            strArr4[2] = String.valueOf(Device.Ownership.MINE);
            strArr4[3] = str2;
            System.arraycopy(strArr2, 0, strArr4, 4, strArr2.length);
            strArr3 = strArr4;
        }
        return this.f12300a.query(m17606S(uri), strArr, str3, strArr3, (String) null, (String) null, str);
    }

    /* renamed from: u */
    private Cursor m17639u(Uri uri, String[] strArr, String[] strArr2, String str, String str2, String str3) {
        String[] strArr3;
        DeviceDataProvider deviceDataProvider;
        String[] strArr4 = strArr2;
        String str4 = C6043b.C6044a.C6045a.f12333e + " = ? AND " + C6043b.C6044a.C6045a.f12340l + " = ? AND " + C6043b.C6044a.C6045a.f12336h + " = ? AND (" + C6043b.C6044a.C6045a.f12335g + " = ? OR " + C6043b.C6044a.C6045a.f12335g + " = ?)";
        String a = C8281l.m19542b().mo35223a();
        if (strArr4 == null) {
            strArr3 = new String[]{C3051a.m7925r().mo23366v(), a, String.valueOf(Device.Ownership.MINE), str2, str3};
            deviceDataProvider = this;
        } else {
            String[] strArr5 = new String[(strArr4.length + 4)];
            strArr5[0] = C3051a.m7925r().mo23366v();
            strArr5[1] = a;
            strArr5[2] = String.valueOf(Device.Ownership.MINE);
            strArr5[3] = str2;
            strArr5[4] = str3;
            System.arraycopy(strArr2, 0, strArr5, 5, strArr4.length);
            deviceDataProvider = this;
            strArr3 = strArr5;
        }
        return deviceDataProvider.f12300a.query(m17606S(uri), strArr, str4, strArr3, (String) null, (String) null, str);
    }

    /* renamed from: v */
    private Cursor m17640v(Uri uri, String[] strArr, String str, String[] strArr2, String str2, List<String> list) {
        int i;
        if (list != null) {
            for (String append : list) {
                StringBuilder sb = new StringBuilder();
                sb.append("doQuery, #####filter: ");
                sb.append(append);
            }
        }
        MatrixCursor matrixCursor = new MatrixCursor(C6043b.C6044a.f12328b);
        Cursor B = m17589B();
        if (B.moveToFirst()) {
            i = 1;
            do {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("GetAllDevice: ");
                sb2.append(B.getString(B.getColumnIndex(C6043b.C6044a.C6045a.f12331c)));
                sb2.append(" ,model = ");
                sb2.append(B.getString(B.getColumnIndex(C6043b.C6044a.C6045a.f12335g)));
                sb2.append(", mesh_id = ");
                sb2.append(B.getColumnIndex(C6043b.C6044a.C6045a.f12339k));
                if (list == null || list.contains(B.getString(B.getColumnIndex(C6043b.C6044a.C6045a.f12335g)))) {
                    matrixCursor.addRow(new Object[]{Integer.valueOf(i), B.getString(B.getColumnIndex(C6043b.C6044a.C6045a.f12330b)), B.getString(B.getColumnIndex(C6043b.C6044a.C6045a.f12331c)), B.getString(B.getColumnIndex(C6043b.C6044a.C6045a.f12334f)), B.getString(B.getColumnIndex(C6043b.C6044a.C6045a.f12335g)), B.getString(B.getColumnIndex(C6043b.C6044a.C6045a.f12336h)), B.getString(B.getColumnIndex(C6043b.C6044a.C6045a.f12339k)), B.getString(B.getColumnIndex(C6043b.C6044a.C6045a.f12340l))});
                    i++;
                }
            } while (B.moveToNext());
        } else {
            i = 1;
        }
        B.close();
        if (list == null || list.contains("yeelink.light.group")) {
            Cursor C = m17590C();
            if (C.moveToFirst()) {
                while (true) {
                    int i2 = i + 1;
                    matrixCursor.addRow(new Object[]{Integer.valueOf(i), "group", Integer.valueOf(C.getInt(C.getColumnIndex(C6043b.C6046b.C6047a.f12342a))), C.getString(C.getColumnIndex(C6043b.C6046b.C6047a.f12344c)), "yeelink.light.group", DeviceBrowserContract.DeviceBrowser.C6035b.f12294a, "-1", C.getString(C.getColumnIndex(C6043b.C6046b.C6047a.f12346e))});
                    if (!C.moveToNext()) {
                        break;
                    }
                    i = i2;
                }
            }
            C.close();
        }
        return matrixCursor;
    }

    /* renamed from: w */
    private int m17641w(Uri uri, ContentValues contentValues) {
        return m17642x(uri, contentValues, "_id = ?", new String[]{Long.toString(ContentUris.parseId(uri))});
    }

    /* renamed from: x */
    private int m17642x(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return this.f12300a.update(m17606S(uri), contentValues, str, strArr);
    }

    /* renamed from: y */
    public static void m17643y(String str, List<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("Edit group, group id: ");
        sb.append(str);
        sb.append(", device count: ");
        sb.append(list.size());
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        contentResolver.delete(C6043b.C6052e.f12375a, C6043b.C6052e.C6053a.f12376a + " = ?", new String[]{str});
        for (String P : list) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(C6043b.C6052e.C6053a.f12376a, str);
            contentValues.put(C6043b.C6052e.C6053a.f12377b, Integer.valueOf(m17603P(P)));
            contentResolver.insert(C6043b.C6052e.f12375a, contentValues);
        }
    }

    /* renamed from: z */
    public static Cursor m17644z() {
        if (!C3051a.m7928z()) {
            return new MatrixCursor(C6043b.C6044a.f12328b);
        }
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        String a = C8281l.m19542b().mo35223a();
        return contentResolver.query(C6043b.C6044a.f12327a, (String[]) null, " ( " + C6043b.C6044a.C6045a.f12340l + " = ? OR " + C6043b.C6044a.C6045a.f12330b + " = ? ) ", new String[]{a, "bluetooth"}, (String) null);
    }

    public int delete(@NonNull Uri uri, String str, String[] strArr) {
        int i;
        String str2;
        String[] strArr2;
        if (this.f12300a == null) {
            this.f12300a = this.f12301b.getReadableDatabase();
        }
        switch (f12299e.match(uri)) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
            case 16:
                i = m17633o(uri);
                break;
            case 2:
            case 4:
            case 7:
            case 15:
            case 18:
                StringBuilder sb = new StringBuilder();
                sb.append(C6043b.C6044a.C6045a.f12333e);
                sb.append(" = ?");
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = " AND " + str;
                }
                sb.append(str2);
                String sb2 = sb.toString();
                if (strArr == null) {
                    strArr2 = new String[]{C3051a.m7925r().mo23366v()};
                } else {
                    String[] strArr3 = new String[(strArr.length + 1)];
                    strArr3[0] = C3051a.m7925r().mo23366v();
                    System.arraycopy(strArr, 0, strArr3, 1, strArr.length);
                    strArr2 = strArr3;
                }
                i = m17634p(uri, sb2, strArr2);
                break;
            case 5:
            case 9:
            case 11:
            case 13:
            case 17:
                i = m17634p(uri, str, strArr);
                break;
            default:
                AppUtils.m8300u(f12297c, "Invalid Uri: " + uri.toString());
                return -1;
        }
        m17610W(uri);
        return i;
    }

    public String getType(@NonNull Uri uri) {
        switch (f12299e.match(uri)) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 14:
            case 16:
                return "vnd.android.cursor.item/device";
            case 2:
            case 4:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
                return "vnd.android.cursor.dir/devices";
            default:
                String str = f12297c;
                AppUtils.m8300u(str, "Unknown Uri: " + uri.toString());
                return null;
        }
    }

    public Uri insert(@NonNull Uri uri, ContentValues contentValues) {
        if (this.f12300a == null) {
            this.f12300a = this.f12301b.getReadableDatabase();
        }
        int match = f12299e.match(uri);
        if (match == 2 || match == 7 || match == 9 || match == 11 || match == 13 || match == 15 || match == 4 || match == 5 || match == 17 || match == 18) {
            StringBuilder sb = new StringBuilder();
            sb.append("Insert to ");
            sb.append(m17606S(uri));
            sb.append(", content =  ");
            sb.append(contentValues.toString());
            Uri withAppendedId = ContentUris.withAppendedId(uri, this.f12300a.insert(m17606S(uri), (String) null, contentValues));
            m17610W(uri);
            return withAppendedId;
        }
        String str = f12297c;
        AppUtils.m8300u(str, "Invalid Uri: " + uri.toString());
        return null;
    }

    public boolean onCreate() {
        C9189e.m22138a("Yeelight_Database", "Content provider DeviceData onCreate!");
        this.f12301b = new C6036a(getContext());
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x035b, code lost:
        r1 = r27;
        r2 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0360, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append(com.yeelight.yeelib.data.C6043b.C6044a.C6045a.f12333e);
        r0.append(" = ?");
        r1 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0371, code lost:
        if (r1 != null) goto L_0x0376;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0373, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0376, code lost:
        r1 = " AND " + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0387, code lost:
        r0.append(r1);
        r3 = r0.toString();
        r2 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0392, code lost:
        if (r2 != null) goto L_0x03a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0394, code lost:
        r4 = new java.lang.String[]{com.yeelight.yeelib.managers.C3051a.m7925r().mo23366v()};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x03a2, code lost:
        r4 = new java.lang.String[(r2.length + 1)];
        r4[0] = com.yeelight.yeelib.managers.C3051a.m7925r().mo23366v();
        java.lang.System.arraycopy(r2, 0, r4, 1, r2.length);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x03c0, code lost:
        return m17636r(r25, r26, r3, r4, r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x03c5, code lost:
        return m17635q(r25, r26);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor query(@androidx.annotation.NonNull android.net.Uri r25, java.lang.String[] r26, java.lang.String r27, java.lang.String[] r28, java.lang.String r29) {
        /*
            r24 = this;
            r7 = r24
            r3 = r27
            r4 = r28
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            android.database.sqlite.SQLiteDatabase r0 = r7.f12300a
            if (r0 != 0) goto L_0x0017
            com.yeelight.yeelib.data.DeviceDataProvider$a r0 = r7.f12301b
            android.database.sqlite.SQLiteDatabase r0 = r0.getReadableDatabase()
            r7.f12300a = r0
        L_0x0017:
            android.content.UriMatcher r0 = f12299e
            r1 = r25
            int r0 = r0.match(r1)
            r2 = 11
            if (r0 == r2) goto L_0x03c6
            switch(r0) {
                case 1: goto L_0x03c1;
                case 2: goto L_0x0360;
                case 3: goto L_0x03c1;
                case 4: goto L_0x0360;
                case 5: goto L_0x035b;
                case 6: goto L_0x03c1;
                case 7: goto L_0x0360;
                case 8: goto L_0x03c1;
                case 9: goto L_0x035b;
                default: goto L_0x0026;
            }
        L_0x0026:
            switch(r0) {
                case 13: goto L_0x035b;
                case 14: goto L_0x03c1;
                case 15: goto L_0x0360;
                case 16: goto L_0x03c1;
                case 17: goto L_0x035b;
                case 18: goto L_0x0360;
                default: goto L_0x0029;
            }
        L_0x0029:
            java.lang.String r2 = "yeelink.light.cta"
            java.lang.String r5 = "yeelink.light.ct2"
            java.lang.String r8 = "yeelink.light.colorc"
            java.lang.String r9 = "yeelink.light.colore"
            java.lang.String r10 = "yeelink.light.colorb"
            java.lang.String r11 = "yeelink.light.colora"
            java.lang.String r12 = "yeelink.light.color8"
            java.lang.String r13 = "yeelink.light.color6"
            java.lang.String r14 = "yeelink.light.color5"
            java.lang.String r15 = "yeelink.light.color4"
            java.lang.String r1 = "yeelink.light.color3"
            java.lang.String r7 = "yeelink.light.color2"
            java.lang.String r4 = "yeelink.light.color1"
            java.lang.String r3 = "yeelink.light.monob"
            r16 = r8
            java.lang.String r8 = "yeelink.light.monoa"
            r17 = r9
            java.lang.String r9 = "yeelink.light.mono5"
            r18 = r10
            java.lang.String r10 = "yeelink.light.mono4"
            r19 = r11
            java.lang.String r11 = "yeelink.light.mono2"
            r20 = r12
            java.lang.String r12 = "yeelink.light.mono1"
            r21 = r13
            java.lang.String r13 = "yeelink.light.ble1"
            switch(r0) {
                case 101: goto L_0x0349;
                case 102: goto L_0x02de;
                case 103: goto L_0x029d;
                case 104: goto L_0x0287;
                case 105: goto L_0x0273;
                case 106: goto L_0x00bc;
                case 107: goto L_0x00a9;
                case 108: goto L_0x0096;
                case 109: goto L_0x0085;
                case 110: goto L_0x0074;
                case 111: goto L_0x0062;
                default: goto L_0x0060;
            }
        L_0x0060:
            r0 = 0
            return r0
        L_0x0062:
            r6 = 0
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r29
            android.database.Cursor r0 = r0.m17640v(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x0074:
            java.lang.String r5 = "yeelink.light.spot1"
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r28
            r4 = r29
            android.database.Cursor r0 = r0.m17638t(r1, r2, r3, r4, r5)
            return r0
        L_0x0085:
            java.lang.String r5 = "yeelink.light.meshbulb2"
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r28
            r4 = r29
            android.database.Cursor r0 = r0.m17638t(r1, r2, r3, r4, r5)
            return r0
        L_0x0096:
            java.lang.String r5 = "yeelink.light.meshbulb1"
            java.lang.String r6 = "yeelink.light.ml2"
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r28
            r4 = r29
            android.database.Cursor r0 = r0.m17639u(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x00a9:
            java.lang.String r5 = "yeelink.light.dnlight2"
            java.lang.String r6 = "yeelink.light.ml1"
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r28
            r4 = r29
            android.database.Cursor r0 = r0.m17639u(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x00bc:
            r6.add(r13)
            java.lang.String r0 = "yeelink.light.gingko"
            r6.add(r0)
            r6.add(r12)
            r6.add(r11)
            r6.add(r10)
            r6.add(r9)
            r6.add(r8)
            r6.add(r3)
            r6.add(r5)
            r6.add(r2)
            java.lang.String r0 = "yeelink.light.ctc"
            r6.add(r0)
            r6.add(r4)
            r6.add(r7)
            r6.add(r1)
            r6.add(r15)
            r6.add(r14)
            r0 = r21
            r6.add(r0)
            r13 = r20
            r6.add(r13)
            r0 = r19
            r6.add(r0)
            r0 = r18
            r6.add(r0)
            r0 = r17
            r6.add(r0)
            r0 = r16
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.plate2"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.lamp1"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.lamp4"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.lamp7"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.lamp8"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.lamp9"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.lamp10"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.lamp15"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.lamp17"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.lamp2"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.lamp3"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.lamp5"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.strip1"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.strip2"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.strip4"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.strip6"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.strip8"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.stripa"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceiling1"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceiling2"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceiling3"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceiling4"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceiling5"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceiling6"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceiling7"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceiling8"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceiling9"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceiling10"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceiling11"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceiling12"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceiling13"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceiling14"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceiling15"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceiling16"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceiling17"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceiling18"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceiling19"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceiling20"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceiling21"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceiling22"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceiling23"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceiling24"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceil26"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceil27"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceil29"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceil30"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceil31"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceil32"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceil33"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceil35"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceila"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceilb"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceilc"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceild"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceile"
            r6.add(r0)
            java.lang.String r0 = "yilai.light.ceiling1"
            r6.add(r0)
            java.lang.String r0 = "yilai.light.ceiling2"
            r6.add(r0)
            java.lang.String r0 = "yilai.light.ceiling3"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.bslamp1"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.bslamp2"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.bslamp3"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.lamp19"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.panel1"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.panel3"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.fancl1"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.fancl2"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.fancl5"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.fancl6"
            r6.add(r0)
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r29
            android.database.Cursor r0 = r0.m17637s(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x0273:
            r6.add(r13)
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r29
            android.database.Cursor r0 = r0.m17637s(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x0287:
            java.lang.String r0 = "yeelink.light.group"
            r6.add(r0)
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r29
            android.database.Cursor r0 = r0.m17637s(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x029d:
            r6.add(r13)
            java.lang.String r0 = "yeelink.light.lamp1"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.lamp2"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.lamp3"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.lamp5"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.lamp4"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.lamp7"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.lamp8"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.lamp9"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.lamp17"
            r6.add(r0)
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r29
            android.database.Cursor r0 = r0.m17637s(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x02de:
            r13 = r20
            r0 = r21
            r22 = r16
            r16 = r2
            r2 = r18
            r18 = r22
            r23 = r17
            r17 = r5
            r5 = r19
            r19 = r23
            r6.add(r12)
            r6.add(r11)
            r6.add(r10)
            r6.add(r9)
            r6.add(r8)
            r6.add(r3)
            r6.add(r4)
            r6.add(r7)
            r6.add(r1)
            r6.add(r15)
            r6.add(r14)
            r6.add(r0)
            r6.add(r13)
            r6.add(r5)
            r6.add(r2)
            r0 = r19
            r6.add(r0)
            r0 = r18
            r6.add(r0)
            r0 = r17
            r6.add(r0)
            r0 = r16
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ctc"
            r6.add(r0)
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r29
            android.database.Cursor r0 = r0.m17637s(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x0349:
            r6 = 0
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r29
            android.database.Cursor r0 = r0.m17637s(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x035b:
            r1 = r27
            r2 = r28
            goto L_0x03c8
        L_0x0360:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.yeelight.yeelib.data.C6043b.C6044a.C6045a.f12333e
            r0.append(r1)
            java.lang.String r1 = " = ?"
            r0.append(r1)
            r1 = r27
            if (r1 != 0) goto L_0x0376
            java.lang.String r1 = ""
            goto L_0x0387
        L_0x0376:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = " AND "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x0387:
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            r0 = 0
            r1 = 1
            r2 = r28
            if (r2 != 0) goto L_0x03a2
            java.lang.String[] r1 = new java.lang.String[r1]
            com.yeelight.yeelib.managers.a r2 = com.yeelight.yeelib.managers.C3051a.m7925r()
            java.lang.String r2 = r2.mo23366v()
            r1[r0] = r2
            r4 = r1
            goto L_0x03b4
        L_0x03a2:
            int r4 = r2.length
            int r4 = r4 + r1
            java.lang.String[] r4 = new java.lang.String[r4]
            com.yeelight.yeelib.managers.a r5 = com.yeelight.yeelib.managers.C3051a.m7925r()
            java.lang.String r5 = r5.mo23366v()
            r4[r0] = r5
            int r5 = r2.length
            java.lang.System.arraycopy(r2, r0, r4, r1, r5)
        L_0x03b4:
            r0 = r24
            r1 = r25
            r2 = r26
            r5 = r29
            android.database.Cursor r0 = r0.m17636r(r1, r2, r3, r4, r5)
            return r0
        L_0x03c1:
            android.database.Cursor r0 = r24.m17635q(r25, r26)
            return r0
        L_0x03c6:
            r1 = r3
            r2 = r4
        L_0x03c8:
            android.database.Cursor r0 = r24.m17636r(r25, r26, r27, r28, r29)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.data.DeviceDataProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    public int update(@NonNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int i;
        String str2;
        String[] strArr2;
        switch (f12299e.match(uri)) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 14:
            case 16:
                i = m17641w(uri, contentValues);
                break;
            case 2:
            case 4:
            case 7:
            case 15:
            case 17:
            case 18:
                StringBuilder sb = new StringBuilder();
                sb.append(C6043b.C6044a.C6045a.f12333e);
                sb.append(" = ?");
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = " AND " + str;
                }
                sb.append(str2);
                String sb2 = sb.toString();
                if (strArr == null) {
                    strArr2 = new String[]{C3051a.m7925r().mo23366v()};
                } else {
                    String[] strArr3 = new String[(strArr.length + 1)];
                    strArr3[0] = C3051a.m7925r().mo23366v();
                    System.arraycopy(strArr, 0, strArr3, 1, strArr.length);
                    strArr2 = strArr3;
                }
                i = m17642x(uri, contentValues, sb2, strArr2);
                break;
            case 9:
            case 11:
                i = m17642x(uri, contentValues, str, strArr);
                break;
            default:
                AppUtils.m8300u(f12297c, "Invalid Uri: " + uri.toString());
                return -1;
        }
        m17610W(uri);
        return i;
    }
}

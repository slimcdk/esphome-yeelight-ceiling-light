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
import com.miot.common.config.AppConfiguration;
import com.miot.common.device.Device;
import com.miot.common.device.parser.xml.DddTag;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.data.C7574b;
import com.yeelight.yeelib.data.C7579c;
import com.yeelight.yeelib.p150c.C5980c;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p152f.C4230l;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p152f.C9812t;
import com.yeelight.yeelib.p153g.C9850s;
import com.yeelight.yeelib.p190i.C9875a;
import com.yeelight.yeelib.service.ShortcutUtils;
import com.yeelight.yeelib.utils.C10543g;
import com.yeelight.yeelib.utils.C4308b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DeviceDataProvider extends ContentProvider {

    /* renamed from: c */
    private static final String f15294c = DeviceDataProvider.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static int f15295d = 12;

    /* renamed from: e */
    private static final UriMatcher f15296e;

    /* renamed from: a */
    private SQLiteDatabase f15297a;

    /* renamed from: b */
    private C7567a f15298b;

    /* renamed from: com.yeelight.yeelib.data.DeviceDataProvider$a */
    public static class C7567a extends SQLiteOpenHelper {
        public C7567a(Context context) {
            this(context, "device.db", (SQLiteDatabase.CursorFactory) null, DeviceDataProvider.f15295d);
        }

        public C7567a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
            super(context, str, cursorFactory, i);
        }

        /* renamed from: a */
        private void m22423a(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS device(" + C7579c.C7580a.C7581a.f15370a + " integer primary key," + C7579c.C7580a.C7581a.f15371b + " varchar," + C7579c.C7580a.C7581a.f15372c + " varchar," + C7579c.C7580a.C7581a.f15373d + " varchar," + C7579c.C7580a.C7581a.f15374e + " varchar," + C7579c.C7580a.C7581a.f15375f + " varchar," + C7579c.C7580a.C7581a.f15376g + " varchar," + C7579c.C7580a.C7581a.f15377h + " varchar," + C7579c.C7580a.C7581a.f15378i + " varchar default 15," + C7579c.C7580a.C7581a.f15379j + " varchar," + C7579c.C7580a.C7581a.f15380k + " varchar," + C7579c.C7580a.C7581a.f15381l + " varchar )");
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE IF NOT EXISTS mesh_network(");
            sb.append(C7579c.C7590f.C7591a.f15421a);
            sb.append(" integer primary key,");
            sb.append(C7579c.C7590f.C7591a.f15422b);
            sb.append(" varchar,");
            sb.append(C7579c.C7590f.C7591a.f15423c);
            sb.append(" varchar,");
            sb.append(C7579c.C7590f.C7591a.f15424d);
            sb.append(" varchar)");
            sQLiteDatabase.execSQL(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CREATE TABLE IF NOT EXISTS device_group(");
            sb2.append(C7579c.C7582b.C7583a.f15383a);
            sb2.append(" integer primary key,");
            sb2.append(C7579c.C7582b.C7583a.f15384b);
            sb2.append(" varchar,");
            sb2.append(C7579c.C7582b.C7583a.f15385c);
            sb2.append(" varchar,");
            sb2.append(C7579c.C7582b.C7583a.f15386d);
            sb2.append(" varchar default 15,");
            sb2.append(C7579c.C7580a.C7581a.f15381l);
            sb2.append(" varchar )");
            sQLiteDatabase.execSQL(sb2.toString());
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS group_device_rel(" + C7579c.C7588e.C7589a.f15417a + " integer," + C7579c.C7588e.C7589a.f15418b + " integer)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ignore_device(" + C7596d.f15440a + " integer primary key," + C7596d.f15441b + " varchar," + C7596d.f15442c + " varchar)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tomato_record(" + C7597e.f15443a + " integer primary key," + C7597e.f15444b + " varchar," + C7597e.f15445c + " varchar," + C7597e.f15446d + " integer," + C7597e.f15447e + " varchar)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS device_records(" + C7579c.C7586d.C7587a.f15395a + " integer primary key," + C7579c.C7586d.C7587a.f15396b + " varchar," + C7579c.C7586d.C7587a.f15397c + " integer," + C7579c.C7586d.C7587a.f15398d + " integer," + C7579c.C7586d.C7587a.f15399e + " integer," + C7579c.C7586d.C7587a.f15400f + " integer," + C7579c.C7586d.C7587a.f15401g + " integer," + C7579c.C7586d.C7587a.f15402h + " integer," + C7579c.C7586d.C7587a.f15403i + " integer," + C7579c.C7586d.C7587a.f15404j + " integer," + C7579c.C7586d.C7587a.f15405k + " integer," + C7579c.C7586d.C7587a.f15406l + " integer," + C7579c.C7586d.C7587a.f15407m + " integer," + C7579c.C7586d.C7587a.f15408n + " integer," + C7579c.C7586d.C7587a.f15409o + " integer," + C7579c.C7586d.C7587a.f15410p + " integer," + C7579c.C7586d.C7587a.f15411q + " integer," + C7579c.C7586d.C7587a.f15412r + " integer," + C7579c.C7586d.C7587a.f15413s + " integer," + C7579c.C7586d.C7587a.f15414t + " integer," + C7579c.C7586d.C7587a.f15415u + " integer)");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("CREATE TABLE IF NOT EXISTS device_log(");
            sb3.append(C7579c.C7584c.C7585a.f15389a);
            sb3.append(" integer primary key,");
            sb3.append(C7579c.C7584c.C7585a.f15390b);
            sb3.append(" varchar,");
            sb3.append(C7579c.C7584c.C7585a.f15391c);
            sb3.append(" varchar,");
            sb3.append(C7579c.C7584c.C7585a.f15392d);
            sb3.append(" varchar,");
            sb3.append(C7579c.C7584c.C7585a.f15393e);
            sb3.append(" varchar)");
            sQLiteDatabase.execSQL(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("CREATE TABLE IF NOT EXISTS room(");
            sb4.append(C7579c.C7592g.C7593a.f15428b);
            sb4.append(" varchar,");
            sb4.append(C7579c.C7592g.C7593a.f15429c);
            sb4.append(" integer,");
            sb4.append(C7579c.C7592g.C7593a.f15430d);
            sb4.append(" varchar,");
            sb4.append(C7579c.C7592g.C7593a.f15431e);
            sb4.append(" varchar,");
            sb4.append(C7579c.C7592g.C7593a.f15432f);
            sb4.append(" integer,");
            sb4.append(C7579c.C7592g.C7593a.f15433g);
            sb4.append(" integer default 0,");
            sb4.append(C7579c.C7592g.C7593a.f15434h);
            sb4.append(" varchar,");
            sb4.append(C7579c.C7592g.C7593a.f15435i);
            sb4.append(" varchar default 15)");
            sQLiteDatabase.execSQL(sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("CREATE TABLE IF NOT EXISTS room_widget(");
            sb5.append(C7579c.C7594h.C7595a.f15438b);
            sb5.append(" varchar,");
            sb5.append(C7579c.C7594h.C7595a.f15439c);
            sb5.append(" varchar,");
            sb5.append(C7579c.C7594h.C7595a.f15437a);
            sb5.append(" varchar)");
            sQLiteDatabase.execSQL(sb5.toString());
        }

        /* renamed from: b */
        private void m22424b(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("alter table device rename to device_temp");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS device(" + C7579c.C7580a.C7581a.f15370a + " integer primary key," + C7579c.C7580a.C7581a.f15371b + " varchar," + C7579c.C7580a.C7581a.f15372c + " varchar," + C7579c.C7580a.C7581a.f15373d + " varchar," + C7579c.C7580a.C7581a.f15374e + " varchar," + C7579c.C7580a.C7581a.f15375f + " varchar," + C7579c.C7580a.C7581a.f15376g + " varchar," + C7579c.C7580a.C7581a.f15377h + " varchar," + C7579c.C7580a.C7581a.f15378i + " varchar default 15," + C7579c.C7580a.C7581a.f15379j + " varchar," + C7579c.C7580a.C7581a.f15380k + " varchar," + C7579c.C7580a.C7581a.f15381l + " varchar )");
            sQLiteDatabase.execSQL("INSERT INTO device SELECT * FROM device_temp");
            sQLiteDatabase.execSQL("drop table if exists device_temp");
            sQLiteDatabase.execSQL("DELETE FROM group_device_rel WHERE device_id = 0 ");
        }

        /* renamed from: g */
        private void m22425g(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_widget(" + C7579c.C7594h.C7595a.f15438b + " varchar," + C7579c.C7594h.C7595a.f15439c + " varchar," + C7579c.C7594h.C7595a.f15437a + " varchar)");
        }

        /* renamed from: s */
        private void m22426s(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE room_temp as select " + C7579c.C7592g.C7593a.f15429c + Constants.ACCEPT_TIME_SEPARATOR_SP + C7579c.C7592g.C7593a.f15430d + Constants.ACCEPT_TIME_SEPARATOR_SP + C7579c.C7592g.C7593a.f15431e + " from " + "room");
            sQLiteDatabase.execSQL("drop table if exists room");
            sQLiteDatabase.execSQL("alter table room_temp rename to room");
            StringBuilder sb = new StringBuilder();
            sb.append("ALTER TABLE room ADD ");
            sb.append(C7579c.C7592g.C7593a.f15428b);
            sb.append(" varchar");
            sQLiteDatabase.execSQL(sb.toString());
            sQLiteDatabase.execSQL("ALTER TABLE room ADD " + C7579c.C7592g.C7593a.f15432f + " integer");
            sQLiteDatabase.execSQL("ALTER TABLE room ADD " + C7579c.C7592g.C7593a.f15433g + " integer default 0");
            sQLiteDatabase.execSQL("ALTER TABLE room ADD " + C7579c.C7592g.C7593a.f15434h + " varchar");
            sQLiteDatabase.execSQL("CREATE TABLE device_temp as select " + C7579c.C7580a.C7581a.f15370a + Constants.ACCEPT_TIME_SEPARATOR_SP + C7579c.C7580a.C7581a.f15371b + Constants.ACCEPT_TIME_SEPARATOR_SP + C7579c.C7580a.C7581a.f15372c + Constants.ACCEPT_TIME_SEPARATOR_SP + C7579c.C7580a.C7581a.f15373d + Constants.ACCEPT_TIME_SEPARATOR_SP + C7579c.C7580a.C7581a.f15374e + Constants.ACCEPT_TIME_SEPARATOR_SP + C7579c.C7580a.C7581a.f15375f + Constants.ACCEPT_TIME_SEPARATOR_SP + C7579c.C7580a.C7581a.f15376g + Constants.ACCEPT_TIME_SEPARATOR_SP + C7579c.C7580a.C7581a.f15377h + Constants.ACCEPT_TIME_SEPARATOR_SP + C7579c.C7580a.C7581a.f15378i + " from " + DddTag.DEVICE);
            sQLiteDatabase.execSQL("drop table if exists device");
            sQLiteDatabase.execSQL("alter table device_temp rename to device");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ALTER TABLE device ADD ");
            sb2.append(C7579c.C7580a.C7581a.f15379j);
            sb2.append(" varchar");
            sQLiteDatabase.execSQL(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("CREATE TABLE IF NOT EXISTS mesh_network(");
            sb3.append(C7579c.C7590f.C7591a.f15421a);
            sb3.append(" integer primary key,");
            sb3.append(C7579c.C7590f.C7591a.f15422b);
            sb3.append(" varchar,");
            sb3.append(C7579c.C7590f.C7591a.f15423c);
            sb3.append(" varchar,");
            sb3.append(C7579c.C7590f.C7591a.f15424d);
            sb3.append(" varchar)");
            sQLiteDatabase.execSQL(sb3.toString());
            sQLiteDatabase.execSQL("ALTER TABLE device ADD mesh_id integer default 30");
        }

        /* renamed from: h */
        public void mo28993h(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("ALTER TABLE room ADD " + C7579c.C7592g.C7593a.f15435i + " varchar default 15");
        }

        /* renamed from: i */
        public void mo28994i(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("ALTER TABLE device ADD mac_address varchar");
        }

        /* renamed from: j */
        public void mo28995j(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("ALTER TABLE device ADD delay_off integer default 15");
        }

        /* renamed from: n */
        public void mo28996n(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room(" + C7579c.C7592g.C7593a.f15427a + " integer primary key," + C7579c.C7592g.C7593a.f15429c + " integer," + C7579c.C7592g.C7593a.f15430d + " varchar," + C7579c.C7592g.C7593a.f15431e + " varchar)");
            sQLiteDatabase.execSQL("ALTER TABLE device ADD room_id INTEGER DEFAULT -1");
        }

        /* renamed from: o */
        public void mo28997o(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("ALTER TABLE device_group ADD delay_off integer default 15");
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            m22423a(sQLiteDatabase);
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i < 4) {
                mo28994i(sQLiteDatabase);
                i = 4;
            }
            if (i < 5) {
                mo28995j(sQLiteDatabase);
                i = 5;
            }
            if (i < 6) {
                mo28996n(sQLiteDatabase);
                i = 6;
            }
            if (i < 7) {
                mo28997o(sQLiteDatabase);
                i = 7;
            }
            if (i < 8) {
                m22426s(sQLiteDatabase);
                i = 8;
            }
            if (i < 9) {
                mo29000t(sQLiteDatabase);
                i = 9;
            }
            if (i < 10) {
                m22424b(sQLiteDatabase);
                i = 10;
            }
            if (i < 11) {
                m22425g(sQLiteDatabase);
                i = 11;
            }
            if (i < 12) {
                mo28993h(sQLiteDatabase);
            }
        }

        /* renamed from: t */
        public void mo29000t(SQLiteDatabase sQLiteDatabase) {
            String a = C4230l.m11766b().mo23552a();
            if (a.isEmpty()) {
                a = AppConfiguration.Locale.cn.name();
            }
            sQLiteDatabase.execSQL("DELETE FROM device WHERE device_type = 'virtual'");
            sQLiteDatabase.execSQL("ALTER TABLE device ADD server varchar default " + a);
            sQLiteDatabase.execSQL("ALTER TABLE device_group ADD server varchar default " + a);
        }
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f15296e = uriMatcher;
        uriMatcher.addURI("com.yeelight.cherry.device.database", "device/#", 1);
        f15296e.addURI("com.yeelight.cherry.device.database", DddTag.DEVICE, 2);
        f15296e.addURI("com.yeelight.cherry.device.database", "room/#", 14);
        f15296e.addURI("com.yeelight.cherry.device.database", "room", 15);
        f15296e.addURI("com.yeelight.cherry.device.database", "device_group/#", 3);
        f15296e.addURI("com.yeelight.cherry.device.database", "device_group", 4);
        f15296e.addURI("com.yeelight.cherry.device.database", "group_device_rel/#", 5);
        f15296e.addURI("com.yeelight.cherry.device.database", "group_device_rel", 5);
        f15296e.addURI("com.yeelight.cherry.device.database", "ignore_device/#", 6);
        f15296e.addURI("com.yeelight.cherry.device.database", "ignore_device", 7);
        f15296e.addURI("com.yeelight.cherry.device.database", "tomato_record/#", 8);
        f15296e.addURI("com.yeelight.cherry.device.database", "tomato_record", 9);
        f15296e.addURI("com.yeelight.cherry.device.database", "device_records/#", 10);
        f15296e.addURI("com.yeelight.cherry.device.database", "device_records", 11);
        f15296e.addURI("com.yeelight.cherry.device.database", "device_log/#", 12);
        f15296e.addURI("com.yeelight.cherry.device.database", "device_log", 13);
        f15296e.addURI("com.yeelight.cherry.device.database", "mesh_network/#", 16);
        f15296e.addURI("com.yeelight.cherry.device.database", "mesh_network", 17);
        f15296e.addURI("com.yeelight.cherry.device.database", "all", 101);
        f15296e.addURI("com.yeelight.cherry.device.database", "all_except_device", 111);
        f15296e.addURI("com.yeelight.cherry.device.database", "bulb", 102);
        f15296e.addURI("com.yeelight.cherry.device.database", "lamp", 103);
        f15296e.addURI("com.yeelight.cherry.device.database", "group", 104);
        f15296e.addURI("com.yeelight.cherry.device.database", "cherry", 105);
        f15296e.addURI("com.yeelight.cherry.device.database", "light", 106);
        f15296e.addURI("com.yeelight.cherry.device.database", "light_dn2grp", 107);
        f15296e.addURI("com.yeelight.cherry.device.database", "light_mb1grp", 108);
        f15296e.addURI("com.yeelight.cherry.device.database", "light_mb2grp", 109);
        f15296e.addURI("com.yeelight.cherry.device.database", "light_sp1grp", 110);
        f15296e.addURI("com.yeelight.cherry.device.database", "room_widget", 18);
    }

    /* renamed from: A */
    public static Cursor m22366A() {
        if (!C4201a.m11610z()) {
            return new MatrixCursor(C7579c.C7580a.f15369b);
        }
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        return contentResolver.query(C7579c.f15358c, (String[]) null, " ( " + C7579c.C7580a.C7581a.f15381l + " = ? OR " + C7579c.C7580a.C7581a.f15371b + " = ? ) ", new String[]{C4230l.m11766b().mo23552a(), "bluetooth"}, (String) null);
    }

    /* renamed from: B */
    public static Cursor m22367B() {
        if (!C4201a.m11610z()) {
            return new MatrixCursor(C7579c.C7580a.f15369b);
        }
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        String a = C4230l.m11766b().mo23552a();
        return contentResolver.query(C7579c.C7580a.f15368a, (String[]) null, " ( " + C7579c.C7580a.C7581a.f15381l + " = ? OR " + C7579c.C7580a.C7581a.f15371b + " = ? ) AND ( " + C7579c.C7580a.C7581a.f15376g + " != ? AND " + C7579c.C7580a.C7581a.f15376g + " != ? AND " + C7579c.C7580a.C7581a.f15376g + " != ? AND " + C7579c.C7580a.C7581a.f15376g + " != ? )", new String[]{a, "bluetooth", "yeelink.wifispeaker.v1", "yeelink.gateway.v1", "yeelink.gateway.v1", "yeelink.switch.sw1"}, (String) null);
    }

    /* renamed from: C */
    public static Cursor m22368C() {
        if (!C4201a.m11610z()) {
            return new MatrixCursor(C7579c.C7580a.f15369b);
        }
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        return contentResolver.query(C7579c.C7582b.f15382a, (String[]) null, C7579c.C7580a.C7581a.f15381l + " = ? ", new String[]{C4230l.m11766b().mo23552a()}, (String) null);
    }

    /* renamed from: D */
    public static Cursor m22369D() {
        return !C4201a.m11610z() ? new MatrixCursor(C7579c.C7590f.f15420b) : C4297y.f7456e.getContentResolver().query(C7579c.C7590f.f15419a, (String[]) null, (String) null, (String[]) null, (String) null);
    }

    /* renamed from: E */
    public static Cursor m22370E() {
        if (!C4201a.m11610z()) {
            return new MatrixCursor(C7579c.C7592g.f15426b);
        }
        C7579c.C7592g.C7593a.f15434h + " = ? AND deleted = 0";
        return C4297y.f7456e.getContentResolver().query(C7579c.C7592g.f15425a, (String[]) null, C7579c.C7592g.C7593a.f15434h + " = ? ", new String[]{C4230l.m11766b().mo23552a()}, (String) null);
    }

    /* renamed from: F */
    public static Cursor m22371F() {
        if (!C4201a.m11610z()) {
            return new MatrixCursor(C7579c.C7580a.f15369b);
        }
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        return contentResolver.query(C7579c.C7580a.f15368a, (String[]) null, C7579c.C7580a.C7581a.f15371b + " = ? AND " + C7579c.C7580a.C7581a.f15381l + " = ? AND ( " + C7579c.C7580a.C7581a.f15376g + " != ? AND " + C7579c.C7580a.C7581a.f15376g + " != ? AND " + C7579c.C7580a.C7581a.f15376g + " != ? AND " + C7579c.C7580a.C7581a.f15376g + " != ? AND " + C7579c.C7580a.C7581a.f15376g + " != ? AND " + C7579c.C7580a.C7581a.f15376g + " != ? )", new String[]{"wifi", C4230l.m11766b().mo23552a(), "yeelink.wifispeaker.v1", "yeelink.gateway.v1", "yeelink.gateway.va", "yeelink.plug.plug", "yeelink.curtain.ctmt1", "yeelink.switch.sw1"}, (String) null);
    }

    /* renamed from: G */
    public static Cursor m22372G() {
        if (!C4201a.m11610z()) {
            return new MatrixCursor(C7579c.C7580a.f15369b);
        }
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        String a = C4230l.m11766b().mo23552a();
        return contentResolver.query(C7579c.C7580a.f15368a, (String[]) null, " ( " + C7579c.C7580a.C7581a.f15381l + " = ? OR " + C7579c.C7580a.C7581a.f15371b + " = ? ) AND ( " + C7579c.C7580a.C7581a.f15376g + " != ? AND " + C7579c.C7580a.C7581a.f15376g + " != ? AND " + C7579c.C7580a.C7581a.f15376g + " != ? AND " + C7579c.C7580a.C7581a.f15376g + " != ? AND " + C7579c.C7580a.C7581a.f15376g + " != ? AND " + C7579c.C7580a.C7581a.f15376g + " != ? AND " + C7579c.C7580a.C7581a.f15376g + " != ? )", new String[]{a, "bluetooth", "yeelink.wifispeaker.v1", "yeelink.gateway.v1", "yeelink.gateway.va", "yeelink.gateway.va", "yeelink.curtain.ctmt1", "yeelink.switch.sw1", "yeelink.plug.plug"}, (String) null);
    }

    /* renamed from: H */
    public static Cursor m22373H(int i) {
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        Uri withAppendedId = ContentUris.withAppendedId(C7579c.C7580a.f15368a, (long) i);
        String a = C4230l.m11766b().mo23552a();
        return contentResolver.query(withAppendedId, (String[]) null, C7579c.C7580a.C7581a.f15381l + " = ?", new String[]{a}, (String) null);
    }

    /* renamed from: I */
    public static Cursor m22374I(String str) {
        if (!C4201a.m11610z()) {
            return new MatrixCursor(C7579c.C7580a.f15369b);
        }
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        return contentResolver.query(C7579c.C7580a.f15368a, (String[]) null, C7579c.C7580a.C7581a.f15372c + " = ? and ( " + C7579c.C7580a.C7581a.f15381l + " = ? OR " + C7579c.C7580a.C7581a.f15371b + " = ? )", new String[]{str, C4230l.m11766b().mo23552a(), "bluetooth"}, (String) null);
    }

    /* renamed from: J */
    public static Cursor m22375J(String str) {
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        Cursor query = contentResolver.query(C7579c.C7580a.f15368a, new String[]{C7579c.C7580a.C7581a.f15380k}, C7579c.C7580a.C7581a.f15372c + " = ?", new String[]{str}, (String) null);
        if (query.moveToFirst()) {
            try {
                return contentResolver.query(C7579c.C7590f.f15419a, C7579c.C7590f.f15420b, C7579c.C7590f.C7591a.f15421a + " = ?", new String[]{String.valueOf(query.getInt(query.getColumnIndex(C7579c.C7590f.C7591a.f15421a)))}, (String) null);
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
    public static Cursor m22376K(String str) {
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        return contentResolver.query(C7579c.C7582b.f15382a, (String[]) null, C7579c.C7582b.C7583a.f15383a + " = ? and " + C7579c.C7582b.C7583a.f15387e + " = ?", new String[]{str, C4230l.m11766b().mo23552a()}, (String) null);
    }

    /* renamed from: L */
    public static int m22377L(String str) {
        return m22379N(str).getCount();
    }

    /* renamed from: M */
    public static Cursor m22378M(C4198d dVar) {
        "get all groups contain device, device id: " + dVar.mo23372G();
        return C4297y.f7456e.getContentResolver().query(C7579c.C7588e.f15416a, (String[]) null, C7579c.C7588e.C7589a.f15418b + " = ?", new String[]{String.valueOf(m22380O(dVar))}, (String) null);
    }

    /* renamed from: N */
    public static Cursor m22379N(String str) {
        "getGroupDevices, group id: " + str;
        Cursor query = C4297y.f7456e.getContentResolver().query(C7579c.C7588e.f15416a, (String[]) null, C7579c.C7588e.C7589a.f15417a + " = ?", new String[]{str}, (String) null);
        MatrixCursor matrixCursor = new MatrixCursor(C7579c.C7580a.f15369b);
        if (query.moveToFirst()) {
            do {
                int i = query.getInt(query.getColumnIndex(C7579c.C7588e.C7589a.f15418b));
                "_id = " + i;
                Cursor H = m22373H(i);
                "device data cursor, count: " + H.getCount();
                "device data cursor, _ID index: " + H.getColumnIndex(C7579c.C7580a.C7581a.f15370a);
                if (H.moveToFirst()) {
                    matrixCursor.addRow(new Object[]{Integer.valueOf(H.getInt(H.getColumnIndex(C7579c.C7580a.C7581a.f15370a))), H.getString(H.getColumnIndex(C7579c.C7580a.C7581a.f15371b)), H.getString(H.getColumnIndex(C7579c.C7580a.C7581a.f15372c)), H.getString(H.getColumnIndex(C7579c.C7580a.C7581a.f15375f)), H.getString(H.getColumnIndex(C7579c.C7580a.C7581a.f15376g)), H.getString(H.getColumnIndex(C7579c.C7580a.C7581a.f15377h)), H.getString(H.getColumnIndex(C7579c.C7580a.C7581a.f15380k)), H.getString(H.getColumnIndex(C7579c.C7580a.C7581a.f15381l))});
                }
                H.close();
            } while (query.moveToNext());
        }
        query.close();
        return matrixCursor;
    }

    /* renamed from: O */
    public static int m22380O(C4198d dVar) {
        "DeviceDataProvider, getId, device id: " + dVar.mo23372G();
        return m22381P(dVar.mo23372G());
    }

    /* renamed from: P */
    public static int m22381P(String str) {
        Cursor I = m22374I(str);
        int i = I.moveToFirst() ? I.getInt(I.getColumnIndex(C7579c.C7580a.C7581a.f15370a)) : -1;
        I.close();
        return i;
    }

    /* renamed from: Q */
    public static String m22382Q(String str) {
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        Cursor query = contentResolver.query(C7579c.C7580a.f15368a, (String[]) null, C7579c.C7580a.C7581a.f15379j + " = ?", new String[]{str}, (String) null);
        if (query == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (query.moveToFirst()) {
            do {
                sb.append(query.getString(query.getColumnIndex(C7579c.C7580a.C7581a.f15372c)));
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
    public static String m22383R(String str) {
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        Cursor query = contentResolver.query(C7579c.C7594h.f15436a, (String[]) null, C7579c.C7594h.C7595a.f15438b + " = ?", new String[]{str}, (String) null);
        String str2 = "";
        if (query == null) {
            return str2;
        }
        if (query.moveToFirst()) {
            str2 = query.getString(query.getColumnIndex(C7579c.C7594h.C7595a.f15437a));
        }
        query.close();
        return str2;
    }

    /* renamed from: S */
    private String m22384S(Uri uri) {
        int match = f15296e.match(uri);
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
    public static boolean m22385T(String str, String str2) {
        Cursor N = m22379N(str);
        if (N == null || N.getCount() == 0 || !N.moveToFirst()) {
            return false;
        }
        while (!N.getString(N.getColumnIndex(C7579c.C7580a.C7581a.f15372c)).equals(str2)) {
            if (!N.moveToNext()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: U */
    public static boolean m22386U(String str) {
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        Cursor query = contentResolver.query(C7579c.C7582b.f15382a, (String[]) null, C7579c.C7582b.C7583a.f15383a + " = ? and " + C7579c.C7582b.C7583a.f15387e + " = ?", new String[]{str, C4230l.m11766b().mo23552a()}, (String) null);
        boolean moveToFirst = query.moveToFirst();
        query.close();
        return moveToFirst;
    }

    /* renamed from: V */
    public static boolean m22387V(String str) {
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        Cursor query = contentResolver.query(C7579c.C7582b.f15382a, (String[]) null, C7579c.C7582b.C7583a.f15385c + " = ? and " + C7579c.C7582b.C7583a.f15387e + " = ?", new String[]{str, C4230l.m11766b().mo23552a()}, (String) null);
        boolean moveToFirst = query.moveToFirst();
        query.close();
        return moveToFirst;
    }

    /* renamed from: W */
    private void m22388W(Uri uri) {
        Uri uri2;
        switch (f15296e.match(uri)) {
            case 1:
            case 2:
                uri2 = C7579c.C7580a.f15368a;
                break;
            case 3:
            case 4:
            case 16:
            case 17:
                uri2 = C7579c.C7582b.f15382a;
                break;
            case 5:
                uri2 = C7579c.C7588e.f15416a;
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                return;
            case 10:
            case 11:
                uri2 = C7579c.C7586d.f15394a;
                break;
            case 12:
            case 13:
                uri2 = C7579c.C7584c.f15388a;
                break;
            case 14:
            case 15:
                uri2 = C7579c.C7592g.f15425a;
                break;
            case 18:
                uri2 = C7579c.C7594h.f15436a;
                break;
            default:
                String str = f15294c;
                C4308b.m12139r(str, "Invalid Uri: " + uri.toString());
                return;
        }
        getContext().getContentResolver().notifyChange(uri2, (ContentObserver) null);
    }

    /* renamed from: X */
    public static void m22389X() {
        C4297y.f7456e.getContentResolver().notifyChange(C7579c.C7580a.f15368a, (ContentObserver) null);
    }

    /* renamed from: Y */
    public static void m22390Y(C4198d dVar) {
        "remove device from group device relation table, device id: " + dVar.mo23372G();
        Cursor M = m22378M(dVar);
        if (M.moveToFirst()) {
            ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
            do {
                String string = M.getString(M.getColumnIndexOrThrow(C7579c.C7588e.C7589a.f15417a));
                contentResolver.delete(C7579c.C7588e.f15416a, C7579c.C7588e.C7589a.f15418b + " = ? AND " + C7579c.C7588e.C7589a.f15417a + " = ?", new String[]{String.valueOf(m22380O(dVar)), string});
                if (m22377L(string) == 0) {
                    m22407k(string);
                }
            } while (M.moveToNext());
        }
    }

    /* renamed from: Z */
    public static boolean m22391Z(C9875a aVar) {
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.putNull(C7579c.C7580a.C7581a.f15379j);
        contentResolver.update(C7579c.C7580a.f15368a, contentValues, C7579c.C7580a.C7581a.f15379j + " = ?", new String[]{aVar.mo31953n()});
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put(C7579c.C7592g.C7593a.f15433g, 1);
        contentValues2.put(C7579c.C7592g.C7593a.f15432f, Long.valueOf(aVar.mo31956q()));
        contentResolver.update(C7579c.C7592g.f15425a, contentValues2, C7579c.C7592g.C7593a.f15428b + " = ?", new String[]{aVar.mo31953n()});
        return true;
    }

    /* renamed from: a0 */
    public static Uri m22393a0(C4198d dVar) {
        Uri uri;
        if (!C4201a.m11610z()) {
            C4308b.m12139r(f15294c, "updateDeviceDatabase, no reason to be here, suicide! Good Luck!");
        }
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put(C7579c.C7580a.C7581a.f15371b, dVar.mo23377J());
        contentValues.put(C7579c.C7580a.C7581a.f15377h, dVar.mo23399W().name());
        contentValues.put(C7579c.C7580a.C7581a.f15372c, dVar.mo23372G());
        contentValues.put(C7579c.C7580a.C7581a.f15373d, dVar.mo23391R());
        contentValues.put(C7579c.C7580a.C7581a.f15374e, C4201a.m11607r().mo23452v());
        contentValues.put(C7579c.C7580a.C7581a.f15378i, Integer.valueOf(dVar.mo23368D()));
        if (dVar.mo23397U() != null && !dVar.mo23397U().isEmpty()) {
            contentValues.put(C7579c.C7580a.C7581a.f15375f, dVar.mo23397U());
        }
        contentValues.put(C7579c.C7580a.C7581a.f15376g, dVar.mo23395T());
        contentValues.put(C7579c.C7580a.C7581a.f15381l, C4230l.m11766b().mo23552a());
        Cursor I = m22374I(dVar.mo23372G());
        if (I.moveToFirst()) {
            "update device: " + dVar.mo23372G();
            uri = Uri.withAppendedPath(C7579c.C7580a.f15368a, String.valueOf(contentResolver.update(C7579c.C7580a.f15368a, contentValues, C7579c.C7580a.C7581a.f15372c + " = ? AND " + C7579c.C7580a.C7581a.f15381l + " = ?", new String[]{dVar.mo23372G(), C4230l.m11766b().mo23552a()})));
        } else {
            "insert device: " + dVar.mo23372G();
            uri = contentResolver.insert(C7579c.C7580a.f15368a, contentValues);
        }
        I.close();
        return uri;
    }

    /* renamed from: b */
    public static boolean m22394b(String str, String str2) {
        "Add device : " + m22381P(str) + ", into room: " + str2;
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put(C7579c.C7580a.C7581a.f15379j, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(C7579c.C7580a.C7581a.f15372c);
        sb.append(" = ? ");
        return contentResolver.update(C7579c.C7580a.f15368a, contentValues, sb.toString(), new String[]{String.valueOf(str)}) > 0;
    }

    /* renamed from: b0 */
    public static Uri m22395b0(C4198d dVar, String str) {
        if (!C4201a.m11610z()) {
            C4308b.m12139r(f15294c, "updateDeviceDatabase, no reason to be here, suicide! Good Luck!");
        }
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put(C7579c.C7580a.C7581a.f15376g, str);
        Cursor I = m22374I(dVar.mo23372G());
        "update device: " + dVar.mo23372G();
        Uri withAppendedPath = Uri.withAppendedPath(C7579c.C7580a.f15368a, String.valueOf(contentResolver.update(C7579c.C7580a.f15368a, contentValues, C7579c.C7580a.C7581a.f15372c + " = ? AND " + C7579c.C7580a.C7581a.f15381l + " = ?", new String[]{dVar.mo23372G(), C4230l.m11766b().mo23552a()})));
        I.close();
        return withAppendedPath;
    }

    /* renamed from: c */
    public static String m22396c(String str, List<C4198d> list) {
        "Add group, name : " + str + ", device count: " + list.size();
        if (str == null || str.isEmpty()) {
            return C4297y.f7456e.getResources().getString(R$string.error_invalid_group_name);
        }
        if (m22387V(str)) {
            return C4297y.f7456e.getResources().getString(R$string.error_group_name_exist);
        }
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put(C7579c.C7582b.C7583a.f15384b, C4201a.m11607r().mo23452v());
        contentValues.put(C7579c.C7582b.C7583a.f15385c, str);
        contentValues.put(C7579c.C7582b.C7583a.f15386d, 15);
        contentValues.put(C7579c.C7582b.C7583a.f15387e, C4230l.m11766b().mo23552a());
        long parseId = ContentUris.parseId(contentResolver.insert(C7579c.C7582b.f15382a, contentValues));
        for (C4198d O : list) {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put(C7579c.C7588e.C7589a.f15417a, Long.valueOf(parseId));
            contentValues2.put(C7579c.C7588e.C7589a.f15418b, Integer.valueOf(m22380O(O)));
            contentResolver.insert(C7579c.C7588e.f15416a, contentValues2);
        }
        C4257w.m11947l0().mo23652P(new C5980c(String.valueOf(parseId), str));
        return null;
    }

    /* renamed from: c0 */
    public static boolean m22397c0(String str, int i) {
        if (!C4201a.m11610z()) {
            C4308b.m12139r(f15294c, "updateDeviceMeshInfo, no reason to be here, suicide! Good Luck!");
        }
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put(C7579c.C7580a.C7581a.f15380k, Integer.valueOf(i));
        int update = contentResolver.update(C7579c.C7580a.f15368a, contentValues, C7579c.C7580a.C7581a.f15372c + " = ?", new String[]{str});
        "updateDeviceMeshInfo result = " + update;
        return update > 0;
    }

    /* renamed from: d */
    public static int m22398d(C9850s sVar) {
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        Uri uri = C7579c.C7590f.f15419a;
        Cursor query = contentResolver.query(uri, (String[]) null, C7579c.C7590f.C7591a.f15422b + " =? and " + C7579c.C7590f.C7591a.f15424d + " = ?", new String[]{sVar.mo31822c(), sVar.mo31823d()}, (String) null);
        if (query.moveToFirst()) {
            int i = query.getInt(query.getColumnIndex(C7579c.C7590f.C7591a.f15421a));
            query.close();
            return i | 1073741824;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(C7579c.C7590f.C7591a.f15421a, (Integer) null);
        contentValues.put(C7579c.C7590f.C7591a.f15423c, sVar.mo31821b());
        contentValues.put(C7579c.C7590f.C7591a.f15422b, sVar.mo31822c());
        contentValues.put(C7579c.C7590f.C7591a.f15424d, sVar.mo31823d());
        Uri insert = contentResolver.insert(C7579c.C7590f.f15419a, contentValues);
        query.close();
        return (int) ContentUris.parseId(insert);
    }

    /* renamed from: d0 */
    public static void m22399d0(C5980c cVar) {
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put(C7579c.C7582b.C7583a.f15383a, cVar.mo23372G());
        contentValues.put(C7579c.C7582b.C7583a.f15384b, C4201a.m11607r().mo23452v());
        contentValues.put(C7579c.C7582b.C7583a.f15385c, cVar.mo23397U());
        contentValues.put(C7579c.C7582b.C7583a.f15386d, Integer.valueOf(cVar.mo23368D()));
        contentValues.put(C7579c.C7582b.C7583a.f15387e, C4230l.m11766b().mo23552a());
        Cursor K = m22376K(cVar.mo23372G());
        if (K.moveToFirst()) {
            "update device group: " + cVar.mo23372G();
            contentResolver.update(C7579c.C7582b.f15382a, contentValues, C7579c.C7582b.C7583a.f15383a + " = ?", new String[]{cVar.mo23372G()});
            K.close();
            return;
        }
        throw new IllegalArgumentException("updateGroupDatabase: No reason to be here, suicide!");
    }

    /* renamed from: e */
    public static boolean m22400e(C9875a aVar) {
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put(C7579c.C7592g.C7593a.f15428b, aVar.mo31953n());
        contentValues.put(C7579c.C7592g.C7593a.f15429c, Integer.valueOf(aVar.mo31957r()));
        contentValues.put(C7579c.C7592g.C7593a.f15430d, C4201a.m11607r().mo23452v());
        contentValues.put(C7579c.C7592g.C7593a.f15431e, aVar.mo31954o());
        contentValues.put(C7579c.C7592g.C7593a.f15432f, Long.valueOf(aVar.mo31956q()));
        contentValues.put(C7579c.C7592g.C7593a.f15433g, Boolean.valueOf(aVar.mo31959t()));
        contentValues.put(C7579c.C7592g.C7593a.f15434h, aVar.mo31955p());
        contentValues.put(C7579c.C7592g.C7593a.f15435i, Integer.valueOf(aVar.mo31948h()));
        contentResolver.insert(C7579c.C7592g.f15425a, contentValues);
        if (aVar.mo31959t()) {
            return true;
        }
        Iterator<C4200i> it = aVar.mo31949i().iterator();
        while (it.hasNext()) {
            C4198d next = it.next();
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put(C7579c.C7580a.C7581a.f15379j, aVar.mo31953n());
            contentResolver.update(C7579c.C7580a.f15368a, contentValues2, C7579c.C7580a.C7581a.f15372c + " = ?", new String[]{next.mo23372G()});
            "Update ROOM_ID for device: " + next.mo23397U() + ", room: " + aVar.mo31954o();
            next.mo23390Q0(aVar.mo31953n());
        }
        return true;
    }

    /* renamed from: e0 */
    public static boolean m22401e0(C9875a aVar) {
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put(C7579c.C7592g.C7593a.f15429c, Integer.valueOf(aVar.mo31957r()));
        contentValues.put(C7579c.C7592g.C7593a.f15431e, aVar.mo31954o());
        contentValues.put(C7579c.C7592g.C7593a.f15432f, Long.valueOf(aVar.mo31956q()));
        contentValues.put(C7579c.C7592g.C7593a.f15433g, Boolean.valueOf(aVar.mo31959t()));
        contentValues.put(C7579c.C7592g.C7593a.f15434h, aVar.mo31955p());
        contentValues.put(C7579c.C7592g.C7593a.f15435i, Integer.valueOf(aVar.mo31948h()));
        contentResolver.update(C7579c.C7592g.f15425a, contentValues, C7579c.C7592g.C7593a.f15428b + " = ?", new String[]{aVar.mo31953n()});
        ContentValues contentValues2 = new ContentValues();
        contentValues2.putNull(C7579c.C7580a.C7581a.f15379j);
        contentResolver.update(C7579c.C7580a.f15368a, contentValues2, C7579c.C7580a.C7581a.f15379j + " = ?", new String[]{aVar.mo31953n()});
        for (C4198d next : C4257w.m11947l0().mo23688t0()) {
            if (aVar.mo31953n().equals(next.mo23404Z())) {
                next.mo23390Q0((String) null);
            }
        }
        Iterator<C4200i> it = aVar.mo31949i().iterator();
        while (it.hasNext()) {
            C4198d next2 = it.next();
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put(C7579c.C7580a.C7581a.f15379j, aVar.mo31953n());
            contentResolver.update(C7579c.C7580a.f15368a, contentValues3, C7579c.C7580a.C7581a.f15372c + " = ?", new String[]{next2.mo23372G()});
            next2.mo23390Q0(aVar.mo31953n());
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m22402f(String str, String str2) {
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put(C7579c.C7594h.C7595a.f15438b, str2);
        contentValues.put(C7579c.C7594h.C7595a.f15437a, str);
        contentValues.put(C7579c.C7594h.C7595a.f15439c, C4201a.m11607r().mo23452v());
        contentResolver.insert(C7579c.C7594h.f15436a, contentValues);
        return true;
    }

    /* renamed from: g */
    public static boolean m22403g(List<C9875a> list) {
        ArrayList arrayList = new ArrayList();
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        for (C9875a next : list) {
            ContentProviderOperation.Builder newUpdate = ContentProviderOperation.newUpdate(C7579c.C7580a.f15368a);
            arrayList.add(newUpdate.withSelection(C7579c.C7580a.C7581a.f15379j + " = ?", new String[]{String.valueOf(next.mo31953n())}).withValue(C7579c.C7580a.C7581a.f15379j, (Object) null).build());
            ContentProviderOperation.Builder newUpdate2 = ContentProviderOperation.newUpdate(C7579c.C7592g.f15425a);
            arrayList.add(newUpdate2.withSelection(C7579c.C7592g.C7593a.f15428b + " = ?", new String[]{next.mo31953n()}).withValue(C7579c.C7592g.C7593a.f15433g, 1).withValue(C7579c.C7592g.C7593a.f15432f, Long.valueOf(next.mo31956q())).build());
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
    public static boolean m22404h(List<C9875a> list) {
        ArrayList arrayList = new ArrayList();
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        String str = C7579c.C7592g.C7593a.f15428b + " = ?";
        for (C9875a next : list) {
            arrayList.add(ContentProviderOperation.newUpdate(C7579c.C7592g.f15425a).withSelection(str, new String[]{String.valueOf(next.mo31953n())}).withValue(C7579c.C7592g.C7593a.f15429c, Integer.valueOf(next.mo31957r())).withValue(C7579c.C7592g.C7593a.f15431e, next.mo31954o()).withValue(C7579c.C7592g.C7593a.f15432f, Long.valueOf(next.mo31956q())).withValue(C7579c.C7592g.C7593a.f15433g, Boolean.valueOf(next.mo31959t())).withValue(C7579c.C7592g.C7593a.f15434h, next.mo31955p()).withValue(C7579c.C7592g.C7593a.f15435i, Integer.valueOf(next.mo31948h())).build());
            arrayList.add(ContentProviderOperation.newUpdate(C7579c.C7580a.f15368a).withSelection(C7579c.C7580a.C7581a.f15379j + " = ?", new String[]{next.mo31953n()}).withValue(C7579c.C7580a.C7581a.f15379j, (Object) null).build());
            for (C4198d next2 : C4257w.m11947l0().mo23688t0()) {
                if (next.mo31953n().equals(next2.mo23404Z())) {
                    next2.mo23390Q0((String) null);
                }
            }
            Iterator<C4200i> it = next.mo31949i().iterator();
            while (it.hasNext()) {
                C4198d next3 = it.next();
                String[] strArr = {next3.mo23372G()};
                next3.mo23390Q0(next.mo31953n());
                arrayList.add(ContentProviderOperation.newUpdate(C7579c.C7580a.f15368a).withSelection(C7579c.C7580a.C7581a.f15372c + " = ?", strArr).withValue(C7579c.C7580a.C7581a.f15379j, next.mo31953n()).build());
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
    public static void m22405i(C4198d dVar) {
        "delete from database, device id: " + dVar.mo23372G();
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        m22390Y(dVar);
        contentResolver.delete(C7579c.C7580a.f15368a, C7579c.C7580a.C7581a.f15372c + " = ? and ( " + C7579c.C7580a.C7581a.f15381l + " = ? OR " + C7579c.C7580a.C7581a.f15371b + " = ? )", new String[]{dVar.mo23372G(), C4230l.m11766b().mo23552a(), "bluetooth"});
        C9812t.m23832j().mo31691u(dVar.mo23404Z(), dVar.mo23372G());
        C4257w.m11947l0().mo23686r1(dVar.mo23372G());
        ShortcutUtils.removeShortcut(dVar);
    }

    /* renamed from: j */
    public static void m22406j(String str) {
        "delete from database, device id: " + str;
        C4297y.f7456e.getContentResolver().delete(C7579c.C7580a.f15368a, C7579c.C7580a.C7581a.f15372c + " = ? AND " + C7579c.C7580a.C7581a.f15381l + " = ?", new String[]{str, C4230l.m11766b().mo23552a()});
    }

    /* renamed from: k */
    public static void m22407k(String str) {
        "Delete group device, device id:" + str;
        if (m22386U(str)) {
            C4198d h0 = C4257w.m11945h0(str);
            C4257w.m11947l0().mo23686r1(str);
            ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
            contentResolver.delete(C7579c.C7582b.f15382a, C7579c.C7582b.C7583a.f15384b + " = ? AND " + C7579c.C7582b.C7583a.f15383a + " = ? AND " + C7579c.C7582b.C7583a.f15387e + " = ?", new String[]{C4201a.m11607r().mo23452v(), str, C4230l.m11766b().mo23552a()});
            StringBuilder sb = new StringBuilder();
            sb.append(C7579c.C7588e.C7589a.f15417a);
            sb.append(" = ? ");
            contentResolver.delete(C7579c.C7588e.f15416a, sb.toString(), new String[]{str});
            ShortcutUtils.removeShortcut(h0);
        }
    }

    /* renamed from: l */
    public static boolean m22408l(int i) {
        int delete = C4297y.f7456e.getContentResolver().delete(C7579c.C7590f.f15419a, C7579c.C7590f.C7591a.f15421a + " = ?", new String[]{String.valueOf(i)});
        "deleteMeshNetwork result = " + delete;
        return delete > 0;
    }

    /* renamed from: m */
    public static boolean m22409m(C9875a aVar) {
        "Actually delete room from database, room name: " + aVar.mo31954o();
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.putNull(C7579c.C7580a.C7581a.f15379j);
        contentResolver.update(C7579c.C7580a.f15368a, contentValues, C7579c.C7580a.C7581a.f15379j + " = ?", new String[]{aVar.mo31953n()});
        contentResolver.delete(C7579c.C7592g.f15425a, C7579c.C7592g.C7593a.f15428b + " = ?", new String[]{aVar.mo31953n()});
        if (!aVar.mo31959t()) {
            C4257w.m11947l0().mo23686r1(aVar.mo31953n());
        }
        return true;
    }

    /* renamed from: n */
    public static boolean m22410n(String str) {
        "Actually delete room from database, widgetId: " + str;
        C4297y.f7456e.getContentResolver().delete(C7579c.C7594h.f15436a, C7579c.C7594h.C7595a.f15438b + " = ?", new String[]{str});
        return true;
    }

    /* renamed from: o */
    private int m22411o(Uri uri) {
        return m22412p(uri, "_id = ?", new String[]{Long.toString(ContentUris.parseId(uri))});
    }

    /* renamed from: p */
    private int m22412p(Uri uri, String str, String[] strArr) {
        return this.f15297a.delete(m22384S(uri), str, strArr);
    }

    /* renamed from: q */
    private Cursor m22413q(Uri uri, String[] strArr) {
        return m22414r(uri, strArr, "_id = ?", new String[]{Long.toString(ContentUris.parseId(uri))}, (String) null);
    }

    /* renamed from: r */
    private Cursor m22414r(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return this.f15297a.query(m22384S(uri), strArr, str, strArr2, (String) null, (String) null, str2);
    }

    /* renamed from: s */
    private Cursor m22415s(Uri uri, String[] strArr, String str, String[] strArr2, String str2, List<String> list) {
        int i;
        if (list != null) {
            for (String str3 : list) {
                "doQuery, #####filter: " + str3;
            }
        }
        MatrixCursor matrixCursor = new MatrixCursor(C7579c.C7580a.f15369b);
        Cursor z = m22422z();
        if (z.moveToFirst()) {
            i = 1;
            do {
                "GetAllDevice: " + z.getString(z.getColumnIndex(C7579c.C7580a.C7581a.f15372c)) + " ,model = " + z.getString(z.getColumnIndex(C7579c.C7580a.C7581a.f15376g)) + ", mesh_id = " + z.getColumnIndex(C7579c.C7580a.C7581a.f15380k);
                if (list == null || list.contains(z.getString(z.getColumnIndex(C7579c.C7580a.C7581a.f15376g)))) {
                    matrixCursor.addRow(new Object[]{Integer.valueOf(i), z.getString(z.getColumnIndex(C7579c.C7580a.C7581a.f15371b)), z.getString(z.getColumnIndex(C7579c.C7580a.C7581a.f15372c)), z.getString(z.getColumnIndex(C7579c.C7580a.C7581a.f15375f)), z.getString(z.getColumnIndex(C7579c.C7580a.C7581a.f15376g)), z.getString(z.getColumnIndex(C7579c.C7580a.C7581a.f15377h)), z.getString(z.getColumnIndex(C7579c.C7580a.C7581a.f15380k)), z.getString(z.getColumnIndex(C7579c.C7580a.C7581a.f15381l))});
                    i++;
                }
            } while (z.moveToNext());
        } else {
            i = 1;
        }
        z.close();
        if (list == null || list.contains("yeelink.light.group")) {
            Cursor C = m22368C();
            if (C.moveToFirst()) {
                while (true) {
                    int i2 = i + 1;
                    matrixCursor.addRow(new Object[]{Integer.valueOf(i), "group", Integer.valueOf(C.getInt(C.getColumnIndex(C7579c.C7582b.C7583a.f15383a))), C.getString(C.getColumnIndex(C7579c.C7582b.C7583a.f15385c)), "yeelink.light.group", C7574b.C7575a.C7578c.f15355a, "-1", C.getString(C.getColumnIndex(C7579c.C7582b.C7583a.f15387e))});
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
    private Cursor m22416t(Uri uri, String[] strArr, String[] strArr2, String str, String str2) {
        String[] strArr3;
        String str3 = C7579c.C7580a.C7581a.f15374e + " = ? AND " + C7579c.C7580a.C7581a.f15381l + " = ? AND " + C7579c.C7580a.C7581a.f15377h + " = ? AND " + C7579c.C7580a.C7581a.f15376g + " = ?";
        String a = C4230l.m11766b().mo23552a();
        if (strArr2 == null) {
            strArr3 = new String[]{C4201a.m11607r().mo23452v(), a, String.valueOf(Device.Ownership.MINE), str2};
        } else {
            String[] strArr4 = new String[(strArr2.length + 4)];
            strArr4[0] = C4201a.m11607r().mo23452v();
            strArr4[1] = a;
            strArr4[2] = String.valueOf(Device.Ownership.MINE);
            strArr4[3] = str2;
            System.arraycopy(strArr2, 0, strArr4, 4, strArr2.length);
            strArr3 = strArr4;
        }
        return this.f15297a.query(m22384S(uri), strArr, str3, strArr3, (String) null, (String) null, str);
    }

    /* renamed from: u */
    private Cursor m22417u(Uri uri, String[] strArr, String[] strArr2, String str, String str2, String str3) {
        String[] strArr3;
        DeviceDataProvider deviceDataProvider;
        String[] strArr4 = strArr2;
        String str4 = C7579c.C7580a.C7581a.f15374e + " = ? AND " + C7579c.C7580a.C7581a.f15381l + " = ? AND " + C7579c.C7580a.C7581a.f15377h + " = ? AND (" + C7579c.C7580a.C7581a.f15376g + " = ? OR " + C7579c.C7580a.C7581a.f15376g + " = ?)";
        String a = C4230l.m11766b().mo23552a();
        if (strArr4 == null) {
            strArr3 = new String[]{C4201a.m11607r().mo23452v(), a, String.valueOf(Device.Ownership.MINE), str2, str3};
            deviceDataProvider = this;
        } else {
            String[] strArr5 = new String[(strArr4.length + 4)];
            strArr5[0] = C4201a.m11607r().mo23452v();
            strArr5[1] = a;
            strArr5[2] = String.valueOf(Device.Ownership.MINE);
            strArr5[3] = str2;
            strArr5[4] = str3;
            System.arraycopy(strArr2, 0, strArr5, 5, strArr4.length);
            deviceDataProvider = this;
            strArr3 = strArr5;
        }
        return deviceDataProvider.f15297a.query(m22384S(uri), strArr, str4, strArr3, (String) null, (String) null, str);
    }

    /* renamed from: v */
    private Cursor m22418v(Uri uri, String[] strArr, String str, String[] strArr2, String str2, List<String> list) {
        int i;
        if (list != null) {
            for (String str3 : list) {
                "doQuery, #####filter: " + str3;
            }
        }
        MatrixCursor matrixCursor = new MatrixCursor(C7579c.C7580a.f15369b);
        Cursor B = m22367B();
        if (B.moveToFirst()) {
            i = 1;
            do {
                "GetAllDevice: " + B.getString(B.getColumnIndex(C7579c.C7580a.C7581a.f15372c)) + " ,model = " + B.getString(B.getColumnIndex(C7579c.C7580a.C7581a.f15376g)) + ", mesh_id = " + B.getColumnIndex(C7579c.C7580a.C7581a.f15380k);
                if (list == null || list.contains(B.getString(B.getColumnIndex(C7579c.C7580a.C7581a.f15376g)))) {
                    matrixCursor.addRow(new Object[]{Integer.valueOf(i), B.getString(B.getColumnIndex(C7579c.C7580a.C7581a.f15371b)), B.getString(B.getColumnIndex(C7579c.C7580a.C7581a.f15372c)), B.getString(B.getColumnIndex(C7579c.C7580a.C7581a.f15375f)), B.getString(B.getColumnIndex(C7579c.C7580a.C7581a.f15376g)), B.getString(B.getColumnIndex(C7579c.C7580a.C7581a.f15377h)), B.getString(B.getColumnIndex(C7579c.C7580a.C7581a.f15380k)), B.getString(B.getColumnIndex(C7579c.C7580a.C7581a.f15381l))});
                    i++;
                }
            } while (B.moveToNext());
        } else {
            i = 1;
        }
        B.close();
        if (list == null || list.contains("yeelink.light.group")) {
            Cursor C = m22368C();
            if (C.moveToFirst()) {
                while (true) {
                    int i2 = i + 1;
                    matrixCursor.addRow(new Object[]{Integer.valueOf(i), "group", Integer.valueOf(C.getInt(C.getColumnIndex(C7579c.C7582b.C7583a.f15383a))), C.getString(C.getColumnIndex(C7579c.C7582b.C7583a.f15385c)), "yeelink.light.group", C7574b.C7575a.C7578c.f15355a, "-1", C.getString(C.getColumnIndex(C7579c.C7582b.C7583a.f15387e))});
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
    private int m22419w(Uri uri, ContentValues contentValues) {
        return m22420x(uri, contentValues, "_id = ?", new String[]{Long.toString(ContentUris.parseId(uri))});
    }

    /* renamed from: x */
    private int m22420x(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return this.f15297a.update(m22384S(uri), contentValues, str, strArr);
    }

    /* renamed from: y */
    public static void m22421y(String str, List<String> list) {
        "Edit group, group id: " + str + ", device count: " + list.size();
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        contentResolver.delete(C7579c.C7588e.f15416a, C7579c.C7588e.C7589a.f15417a + " = ?", new String[]{str});
        for (String P : list) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(C7579c.C7588e.C7589a.f15417a, str);
            contentValues.put(C7579c.C7588e.C7589a.f15418b, Integer.valueOf(m22381P(P)));
            contentResolver.insert(C7579c.C7588e.f15416a, contentValues);
        }
    }

    /* renamed from: z */
    public static Cursor m22422z() {
        if (!C4201a.m11610z()) {
            return new MatrixCursor(C7579c.C7580a.f15369b);
        }
        ContentResolver contentResolver = C4297y.f7456e.getContentResolver();
        String a = C4230l.m11766b().mo23552a();
        return contentResolver.query(C7579c.C7580a.f15368a, (String[]) null, " ( " + C7579c.C7580a.C7581a.f15381l + " = ? OR " + C7579c.C7580a.C7581a.f15371b + " = ? ) ", new String[]{a, "bluetooth"}, (String) null);
    }

    public int delete(@NonNull Uri uri, String str, String[] strArr) {
        int i;
        String str2;
        String[] strArr2;
        if (this.f15297a == null) {
            this.f15297a = this.f15298b.getReadableDatabase();
        }
        switch (f15296e.match(uri)) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
            case 16:
                i = m22411o(uri);
                break;
            case 2:
            case 4:
            case 7:
            case 15:
            case 18:
                StringBuilder sb = new StringBuilder();
                sb.append(C7579c.C7580a.C7581a.f15374e);
                sb.append(" = ?");
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = " AND " + str;
                }
                sb.append(str2);
                String sb2 = sb.toString();
                if (strArr == null) {
                    strArr2 = new String[]{C4201a.m11607r().mo23452v()};
                } else {
                    String[] strArr3 = new String[(strArr.length + 1)];
                    strArr3[0] = C4201a.m11607r().mo23452v();
                    System.arraycopy(strArr, 0, strArr3, 1, strArr.length);
                    strArr2 = strArr3;
                }
                i = m22412p(uri, sb2, strArr2);
                break;
            case 5:
            case 9:
            case 11:
            case 13:
            case 17:
                i = m22412p(uri, str, strArr);
                break;
            default:
                C4308b.m12139r(f15294c, "Invalid Uri: " + uri.toString());
                return -1;
        }
        m22388W(uri);
        return i;
    }

    public String getType(@NonNull Uri uri) {
        switch (f15296e.match(uri)) {
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
                String str = f15294c;
                C4308b.m12139r(str, "Unknown Uri: " + uri.toString());
                return null;
        }
    }

    public Uri insert(@NonNull Uri uri, ContentValues contentValues) {
        if (this.f15297a == null) {
            this.f15297a = this.f15298b.getReadableDatabase();
        }
        int match = f15296e.match(uri);
        if (match == 2 || match == 7 || match == 9 || match == 11 || match == 13 || match == 15 || match == 4 || match == 5 || match == 17 || match == 18) {
            "Insert to " + m22384S(uri) + ", content =  " + contentValues.toString();
            Uri withAppendedId = ContentUris.withAppendedId(uri, this.f15297a.insert(m22384S(uri), (String) null, contentValues));
            m22388W(uri);
            return withAppendedId;
        }
        C4308b.m12139r(f15294c, "Invalid Uri: " + uri.toString());
        return null;
    }

    public boolean onCreate() {
        C10543g.m25740a("Yeelight_Database", "Content provider DeviceData onCreate!");
        this.f15298b = new C7567a(getContext());
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x032f, code lost:
        r1 = r26;
        r2 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0334, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append(com.yeelight.yeelib.data.C7579c.C7580a.C7581a.f15374e);
        r0.append(" = ?");
        r1 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0345, code lost:
        if (r1 != null) goto L_0x034a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0347, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x034a, code lost:
        r1 = " AND " + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x035b, code lost:
        r0.append(r1);
        r3 = r0.toString();
        r2 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0366, code lost:
        if (r2 != null) goto L_0x0376;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0368, code lost:
        r4 = new java.lang.String[]{com.yeelight.yeelib.p152f.C4201a.m11607r().mo23452v()};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0376, code lost:
        r4 = new java.lang.String[(r2.length + 1)];
        r4[0] = com.yeelight.yeelib.p152f.C4201a.m11607r().mo23452v();
        java.lang.System.arraycopy(r2, 0, r4, 1, r2.length);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0394, code lost:
        return m22414r(r24, r25, r3, r4, r28);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0399, code lost:
        return m22413q(r24, r25);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor query(@androidx.annotation.NonNull android.net.Uri r24, java.lang.String[] r25, java.lang.String r26, java.lang.String[] r27, java.lang.String r28) {
        /*
            r23 = this;
            r7 = r23
            r3 = r26
            r4 = r27
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            android.database.sqlite.SQLiteDatabase r0 = r7.f15297a
            if (r0 != 0) goto L_0x0017
            com.yeelight.yeelib.data.DeviceDataProvider$a r0 = r7.f15298b
            android.database.sqlite.SQLiteDatabase r0 = r0.getReadableDatabase()
            r7.f15297a = r0
        L_0x0017:
            android.content.UriMatcher r0 = f15296e
            r1 = r24
            int r0 = r0.match(r1)
            r2 = 11
            if (r0 == r2) goto L_0x039a
            switch(r0) {
                case 1: goto L_0x0395;
                case 2: goto L_0x0334;
                case 3: goto L_0x0395;
                case 4: goto L_0x0334;
                case 5: goto L_0x032f;
                case 6: goto L_0x0395;
                case 7: goto L_0x0334;
                case 8: goto L_0x0395;
                case 9: goto L_0x032f;
                default: goto L_0x0026;
            }
        L_0x0026:
            switch(r0) {
                case 13: goto L_0x032f;
                case 14: goto L_0x0395;
                case 15: goto L_0x0334;
                case 16: goto L_0x0395;
                case 17: goto L_0x032f;
                case 18: goto L_0x0334;
                default: goto L_0x0029;
            }
        L_0x0029:
            java.lang.String r2 = "yeelink.light.lamp1"
            java.lang.String r5 = "yeelink.light.cta"
            java.lang.String r8 = "yeelink.light.ct2"
            java.lang.String r9 = "yeelink.light.colorc"
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
            r16 = r2
            java.lang.String r2 = "yeelink.light.monoa"
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
                case 101: goto L_0x031d;
                case 102: goto L_0x02c0;
                case 103: goto L_0x027f;
                case 104: goto L_0x0269;
                case 105: goto L_0x0255;
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
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            android.database.Cursor r0 = r0.m22418v(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x0074:
            java.lang.String r5 = "yeelink.light.spot1"
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r27
            r4 = r28
            android.database.Cursor r0 = r0.m22416t(r1, r2, r3, r4, r5)
            return r0
        L_0x0085:
            java.lang.String r5 = "yeelink.light.meshbulb2"
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r27
            r4 = r28
            android.database.Cursor r0 = r0.m22416t(r1, r2, r3, r4, r5)
            return r0
        L_0x0096:
            java.lang.String r5 = "yeelink.light.meshbulb1"
            java.lang.String r6 = "yeelink.light.ml2"
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r27
            r4 = r28
            android.database.Cursor r0 = r0.m22417u(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x00a9:
            java.lang.String r5 = "yeelink.light.dnlight2"
            java.lang.String r6 = "yeelink.light.ml1"
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r27
            r4 = r28
            android.database.Cursor r0 = r0.m22417u(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x00bc:
            r6.add(r13)
            java.lang.String r0 = "yeelink.light.gingko"
            r6.add(r0)
            r6.add(r12)
            r6.add(r11)
            r6.add(r10)
            r6.add(r9)
            r6.add(r2)
            r6.add(r3)
            r6.add(r8)
            r6.add(r5)
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
            java.lang.String r0 = "yeelink.light.ceila"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceilb"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceilc"
            r6.add(r0)
            java.lang.String r0 = "yeelink.light.ceild"
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
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            android.database.Cursor r0 = r0.m22415s(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x0255:
            r6.add(r13)
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            android.database.Cursor r0 = r0.m22415s(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x0269:
            java.lang.String r0 = "yeelink.light.group"
            r6.add(r0)
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            android.database.Cursor r0 = r0.m22415s(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x027f:
            r0 = r16
            r6.add(r13)
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
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            android.database.Cursor r0 = r0.m22415s(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x02c0:
            r16 = r5
            r5 = r19
            r13 = r20
            r0 = r21
            r22 = r17
            r17 = r8
            r8 = r18
            r18 = r22
            r6.add(r12)
            r6.add(r11)
            r6.add(r10)
            r6.add(r9)
            r6.add(r2)
            r6.add(r3)
            r6.add(r4)
            r6.add(r7)
            r6.add(r1)
            r6.add(r15)
            r6.add(r14)
            r6.add(r0)
            r6.add(r13)
            r6.add(r5)
            r6.add(r8)
            r0 = r18
            r6.add(r0)
            r0 = r17
            r6.add(r0)
            r0 = r16
            r6.add(r0)
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            android.database.Cursor r0 = r0.m22415s(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x031d:
            r6 = 0
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            android.database.Cursor r0 = r0.m22415s(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x032f:
            r1 = r26
            r2 = r27
            goto L_0x039c
        L_0x0334:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.yeelight.yeelib.data.C7579c.C7580a.C7581a.f15374e
            r0.append(r1)
            java.lang.String r1 = " = ?"
            r0.append(r1)
            r1 = r26
            if (r1 != 0) goto L_0x034a
            java.lang.String r1 = ""
            goto L_0x035b
        L_0x034a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = " AND "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x035b:
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            r0 = 0
            r1 = 1
            r2 = r27
            if (r2 != 0) goto L_0x0376
            java.lang.String[] r1 = new java.lang.String[r1]
            com.yeelight.yeelib.f.a r2 = com.yeelight.yeelib.p152f.C4201a.m11607r()
            java.lang.String r2 = r2.mo23452v()
            r1[r0] = r2
            r4 = r1
            goto L_0x0388
        L_0x0376:
            int r4 = r2.length
            int r4 = r4 + r1
            java.lang.String[] r4 = new java.lang.String[r4]
            com.yeelight.yeelib.f.a r5 = com.yeelight.yeelib.p152f.C4201a.m11607r()
            java.lang.String r5 = r5.mo23452v()
            r4[r0] = r5
            int r5 = r2.length
            java.lang.System.arraycopy(r2, r0, r4, r1, r5)
        L_0x0388:
            r0 = r23
            r1 = r24
            r2 = r25
            r5 = r28
            android.database.Cursor r0 = r0.m22414r(r1, r2, r3, r4, r5)
            return r0
        L_0x0395:
            android.database.Cursor r0 = r23.m22413q(r24, r25)
            return r0
        L_0x039a:
            r1 = r3
            r2 = r4
        L_0x039c:
            android.database.Cursor r0 = r23.m22414r(r24, r25, r26, r27, r28)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.data.DeviceDataProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    public int update(@NonNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int i;
        String str2;
        String[] strArr2;
        switch (f15296e.match(uri)) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 14:
            case 16:
                i = m22419w(uri, contentValues);
                break;
            case 2:
            case 4:
            case 7:
            case 15:
            case 17:
            case 18:
                StringBuilder sb = new StringBuilder();
                sb.append(C7579c.C7580a.C7581a.f15374e);
                sb.append(" = ?");
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = " AND " + str;
                }
                sb.append(str2);
                String sb2 = sb.toString();
                if (strArr == null) {
                    strArr2 = new String[]{C4201a.m11607r().mo23452v()};
                } else {
                    String[] strArr3 = new String[(strArr.length + 1)];
                    strArr3[0] = C4201a.m11607r().mo23452v();
                    System.arraycopy(strArr, 0, strArr3, 1, strArr.length);
                    strArr2 = strArr3;
                }
                i = m22420x(uri, contentValues, sb2, strArr2);
                break;
            case 9:
            case 11:
                i = m22420x(uri, contentValues, str, strArr);
                break;
            default:
                C4308b.m12139r(f15294c, "Invalid Uri: " + uri.toString());
                return -1;
        }
        m22388W(uri);
        return i;
    }
}

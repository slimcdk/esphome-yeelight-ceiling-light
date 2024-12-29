package com.yeelight.yeelib.data;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.miot.common.device.parser.xml.DddTag;
import com.yeelight.yeelib.data.C7605h;
import com.yeelight.yeelib.p150c.C4191d;
import com.yeelight.yeelib.p152f.C4222h;

public class LanDeviceBrowserProvider extends ContentProvider {

    /* renamed from: a */
    private static final UriMatcher f15304a;

    static {
        Class<LanDeviceBrowserProvider> cls = LanDeviceBrowserProvider.class;
        UriMatcher uriMatcher = new UriMatcher(-1);
        f15304a = uriMatcher;
        uriMatcher.addURI("com.yeelight.cherry.landevice", "device/#", 1);
        f15304a.addURI("com.yeelight.cherry.landevice", DddTag.DEVICE, 2);
    }

    /* renamed from: a */
    private Cursor m22442a(String[] strArr, String str, String[] strArr2, String str2) {
        MatrixCursor matrixCursor = new MatrixCursor(C7605h.C7606a.f15469b);
        int i = 1;
        for (C4191d G : C4222h.m11725k().mo23535g()) {
            matrixCursor.addRow(new Object[]{Integer.valueOf(i), G.mo23372G()});
            i++;
        }
        return matrixCursor;
    }

    public int delete(@NonNull Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(@NonNull Uri uri) {
        int match = f15304a.match(uri);
        if (match == 1) {
            return "vnd.android.cursor.item/device";
        }
        if (match != 2) {
            return null;
        }
        return "vnd.android.cursor.dir/devices";
    }

    public Uri insert(@NonNull Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        return true;
    }

    public Cursor query(@NonNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int match = f15304a.match(uri);
        if (match == 1 || match == 2) {
            return m22442a(strArr, str, strArr2, str2);
        }
        throw new IllegalStateException("Invalid Uri: " + uri.toString());
    }

    public int update(@NonNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}

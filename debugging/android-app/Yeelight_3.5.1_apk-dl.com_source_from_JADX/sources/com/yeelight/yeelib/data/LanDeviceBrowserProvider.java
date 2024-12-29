package com.yeelight.yeelib.data;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.miot.common.device.parser.xml.DddTag;
import com.yeelight.yeelib.data.C6069g;
import com.yeelight.yeelib.device.LanDevice;
import com.yeelight.yeelib.managers.C3072i;

public class LanDeviceBrowserProvider extends ContentProvider {

    /* renamed from: a */
    private static final UriMatcher f12307a;

    static {
        Class<LanDeviceBrowserProvider> cls = LanDeviceBrowserProvider.class;
        UriMatcher uriMatcher = new UriMatcher(-1);
        f12307a = uriMatcher;
        uriMatcher.addURI("com.yeelight.cherry.landevice", "device/#", 1);
        uriMatcher.addURI("com.yeelight.cherry.landevice", DddTag.DEVICE, 2);
    }

    /* renamed from: a */
    private Cursor m17664a(String[] strArr, String str, String[] strArr2, String str2) {
        MatrixCursor matrixCursor = new MatrixCursor(C6069g.C6070a.f12427a);
        int i = 1;
        for (LanDevice G : C3072i.m8042k().mo23434g()) {
            matrixCursor.addRow(new Object[]{Integer.valueOf(i), G.mo23185G()});
            i++;
        }
        return matrixCursor;
    }

    public int delete(@NonNull Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(@NonNull Uri uri) {
        int match = f12307a.match(uri);
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
        int match = f12307a.match(uri);
        if (match == 1 || match == 2) {
            return m17664a(strArr, str, strArr2, str2);
        }
        throw new IllegalStateException("Invalid Uri: " + uri.toString());
    }

    public int update(@NonNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}

package com.yeelight.yeelib.service;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ShortcutManager;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p194ui.activity.ShortcutIntentHandlingActivity;
import com.yeelight.yeelib.utils.C4308b;
import java.util.ArrayList;
import java.util.List;

public class ShortcutUtils {
    public static final String ACTION_ADD_SHORTCUT = "com.android.launcher.action.INSTALL_SHORTCUT";
    public static final String ACTION_REMOVE_SHORTCUT = "com.android.launcher.action.UNINSTALL_SHORTCUT";
    public static final String ACTION_REMOVE_SHORTCUT_MIUI = "com.miui.home.launcher.action.UNINSTALL_SHORTCUT";
    public static final String ACTION_YEELIGHT_SHORTCUT = "com.yeelight.cherry.action.shortcut";
    public static final String ACTION_YEELIGHT_SHORTCUT_TURN_OFF_ALL = "com.yeelight.cherry.action.shortcut.turn.off.all";
    public static final String ACTION_YEELIGHT_SHORTCUT_TURN_ON_ALL = "com.yeelight.cherry.action.shortcut.turn.on.all";
    public static final String EXTRA_SHORTCUT_DEVICE_ID = "com.yeelight.cherry.shortcut.device_id";
    public static final String EXTRA_SHORTCUT_PARAM = "com.yeelight.cherry.shortcut.action_param";
    public static final String EXTRA_SHORTCUT_TYPE = "com.yeelight.cherry.shortcut.action_type";
    public static final String SHORTCUT_TYPE_BRIGHT = "com.yeelight.cherry.action.bright";
    public static final String SHORTCUT_TYPE_BRIGHT_DOWN = "com.yeelight.cherry.action.bright_down";
    public static final String SHORTCUT_TYPE_BRIGHT_UP = "com.yeelight.cherry.action.bright_up";
    public static final String SHORTCUT_TYPE_DIMMER = "com.yeelight.cherry.action.dimmer";
    public static final String SHORTCUT_TYPE_SCENE = "com.yeelight.cherry.action.scene";
    public static final String SHORTCUT_TYPE_SCENE_BUNDLE = "com.yeelight.cherry.action.scene.bundle";
    public static final String SHORTCUT_TYPE_TOGGLE = "com.yeelight.cherry.action.toggle";
    public static final String SHORTCUT_TYPE_TURN_OFF_ALL = "com.yeelight.cherry.action.turn.off.all";
    public static final String SHORTCUT_TYPE_TURN_ON_ALL = "com.yeelight.cherry.action.turn.on.all";
    public static final String TAG = "ShortcutUtils";

    @RequiresApi(api = 26)
    public static boolean isShortcutSupported() {
        return ((ShortcutManager) C4297y.f7456e.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported();
    }

    public static List<String> queryShortcut(C4198d dVar) {
        ArrayList arrayList = new ArrayList();
        if (ContextCompat.checkSelfPermission(C4297y.f7456e, "com.android.launcher.permission.READ_SETTINGS") != 0) {
            return arrayList;
        }
        List<PackageInfo> installedPackages = C4297y.f7456e.getPackageManager().getInstalledPackages(8);
        String str = "com.android.launcher2.settings";
        if (installedPackages != null) {
            for (PackageInfo packageInfo : installedPackages) {
                ProviderInfo[] providerInfoArr = packageInfo.providers;
                if (providerInfoArr != null) {
                    int length = providerInfoArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        ProviderInfo providerInfo = providerInfoArr[i];
                        if ("com.android.launcher.permission.READ_SETTINGS".equals(providerInfo.readPermission)) {
                            "launcher authority: " + providerInfo.authority;
                            str = providerInfo.authority;
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        Uri parse = Uri.parse("content://" + str + "/favorites?notify=true");
        Cursor query = C4297y.f7456e.getContentResolver().query(parse, new String[]{ScanBarcodeActivity.TITLE}, "title like ?", new String[]{dVar.mo23397U() + '%'}, (String) null);
        if (query != null) {
            "query device shortcut, name: " + dVar.mo23397U() + ", size: " + query.getCount();
            if (query.moveToFirst()) {
                do {
                    String string = query.getString(0);
                    "shortcut title: " + string;
                    if (!arrayList.contains(string)) {
                        arrayList.add(string);
                    }
                } while (query.moveToNext());
            }
        }
        return arrayList;
    }

    public static void removeShortcut(C4198d dVar) {
        removeShortcut(queryShortcut(dVar));
    }

    public static void removeShortcut(List<String> list) {
        for (String next : list) {
            Intent intent = C4308b.m12132k() ? new Intent(ACTION_REMOVE_SHORTCUT_MIUI) : new Intent(ACTION_REMOVE_SHORTCUT);
            intent.putExtra("android.intent.extra.shortcut.NAME", next);
            Intent intent2 = new Intent();
            intent2.setAction("android.intent.action.MAIN");
            intent2.setClass(C4297y.f7456e, ShortcutIntentHandlingActivity.class);
            intent.putExtra("android.intent.extra.shortcut.INTENT", intent2);
            C4297y.f7456e.sendBroadcast(intent);
        }
    }
}

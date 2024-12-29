package com.yeelight.yeelib.service;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ShortcutManager;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.p142ui.activity.ShortcutIntentHandlingActivity;
import com.yeelight.yeelib.utils.AppUtils;
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
        return ((ShortcutManager) C3108x.f4951e.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported();
    }

    public static List<String> queryShortcut(C3010c cVar) {
        ArrayList arrayList = new ArrayList();
        if (ContextCompat.checkSelfPermission(C3108x.f4951e, "com.android.launcher.permission.READ_SETTINGS") != 0) {
            return arrayList;
        }
        List<PackageInfo> installedPackages = C3108x.f4951e.getPackageManager().getInstalledPackages(8);
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
                            StringBuilder sb = new StringBuilder();
                            sb.append("launcher authority: ");
                            sb.append(providerInfo.authority);
                            str = providerInfo.authority;
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        Uri parse = Uri.parse("content://" + str + "/favorites?notify=true");
        ContentResolver contentResolver = C3108x.f4951e.getContentResolver();
        String[] strArr = {ScanBarcodeActivity.TITLE};
        Cursor query = contentResolver.query(parse, strArr, "title like ?", new String[]{cVar.mo23210U() + '%'}, (String) null);
        if (query != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("query device shortcut, name: ");
            sb2.append(cVar.mo23210U());
            sb2.append(", size: ");
            sb2.append(query.getCount());
            if (query.moveToFirst()) {
                do {
                    String string = query.getString(0);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("shortcut title: ");
                    sb3.append(string);
                    if (!arrayList.contains(string)) {
                        arrayList.add(string);
                    }
                } while (query.moveToNext());
            }
        }
        return arrayList;
    }

    public static void removeShortcut(C3010c cVar) {
        removeShortcut(queryShortcut(cVar));
    }

    public static void removeShortcut(List<String> list) {
        for (String next : list) {
            Intent intent = AppUtils.m8291l() ? new Intent(ACTION_REMOVE_SHORTCUT_MIUI) : new Intent(ACTION_REMOVE_SHORTCUT);
            intent.putExtra("android.intent.extra.shortcut.NAME", next);
            Intent intent2 = new Intent();
            intent2.setAction("android.intent.action.MAIN");
            intent2.setClass(C3108x.f4951e, ShortcutIntentHandlingActivity.class);
            intent.putExtra("android.intent.extra.shortcut.INTENT", intent2);
            C3108x.f4951e.sendBroadcast(intent);
        }
    }
}

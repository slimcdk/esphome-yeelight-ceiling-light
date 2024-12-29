package com.yeelight.yeelib.data;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.yeelight.yeelib.data.DeviceBrowserContract;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.managers.C3088r;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p223w3.C10647b;

public class DeviceBrowserProvider extends ContentProvider {

    /* renamed from: a */
    private static final String f12295a = DeviceBrowserProvider.class.getSimpleName();

    /* renamed from: b */
    private static final UriMatcher f12296b;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f12296b = uriMatcher;
        uriMatcher.addURI("com.yeelight.cherry.device", "all/#", 1);
        uriMatcher.addURI("com.yeelight.cherry.device", "all", 2);
        uriMatcher.addURI("com.yeelight.cherry.device", "lamp", 3);
        uriMatcher.addURI("com.yeelight.cherry.device", "bulb", 4);
        uriMatcher.addURI("com.yeelight.cherry.device", "mesh", 5);
        uriMatcher.addURI("com.yeelight.cherry.device", "cherry", 6);
        uriMatcher.addURI("com.yeelight.cherry.device", "ceiling", 7);
        uriMatcher.addURI("com.yeelight.cherry.device", "mango", 8);
        uriMatcher.addURI("com.yeelight.cherry.device", "elf", 15);
        uriMatcher.addURI("com.yeelight.cherry.device", "muse", 16);
        uriMatcher.addURI("com.yeelight.cherry.device", "vision", 20);
        uriMatcher.addURI("com.yeelight.cherry.device", "doris", 21);
        uriMatcher.addURI("com.yeelight.cherry.device", "libra", 27);
        uriMatcher.addURI("com.yeelight.cherry.device", "wonder", 9);
        uriMatcher.addURI("com.yeelight.cherry.device", "dolphin", 10);
        uriMatcher.addURI("com.yeelight.cherry.device", "bslamp", 11);
        uriMatcher.addURI("com.yeelight.cherry.device", "bslamp2", 17);
        uriMatcher.addURI("com.yeelight.cherry.device", "bslamp3", 23);
        uriMatcher.addURI("com.yeelight.cherry.device", "strip", 12);
        uriMatcher.addURI("com.yeelight.cherry.device", "panel", 19);
        uriMatcher.addURI("com.yeelight.cherry.device", "plate", 28);
        uriMatcher.addURI("com.yeelight.cherry.device", "gingko", 13);
        uriMatcher.addURI("com.yeelight.cherry.device", "speaker", 14);
        uriMatcher.addURI("com.yeelight.cherry.device", "bath_heater", 18);
        uriMatcher.addURI("com.yeelight.cherry.device", "mesh_gateway", 22);
        uriMatcher.addURI("com.yeelight.cherry.device", "curtain", 24);
        uriMatcher.addURI("com.yeelight.cherry.device", "switch", 25);
        uriMatcher.addURI("com.yeelight.cherry.device", "plug", 26);
    }

    /* renamed from: a */
    private Cursor m17586a(String[] strArr, String str, String[] strArr2, String str2, List<String> list) {
        if (!(strArr == null && strArr2 == null && str2 == null)) {
            AppUtils.m8300u(f12295a, "Invalid projection, only support null so far");
        }
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!C3088r.m8117g().mo23474o(next)) {
                    it.remove();
                    StringBuilder sb = new StringBuilder();
                    sb.append("doQuery, #####filter model is removed: ");
                    sb.append(next);
                }
            }
            for (String append : list) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("doQuery, #####filter: ");
                sb2.append(append);
            }
        }
        MatrixCursor matrixCursor = new MatrixCursor(DeviceBrowserContract.DeviceBrowser.f12282z);
        int i = 1;
        for (C3010c next2 : YeelightDeviceManager.m7800o0().mo23260F0()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("GetAllDevice from browser: ");
            sb3.append(next2.mo23185G());
            sb3.append(", model = ");
            sb3.append(next2.mo23208T());
            if ((list == null || list.contains(next2.mo23188I().mo31880a())) && !(next2 instanceof C10647b)) {
                matrixCursor.addRow(new Object[]{Integer.valueOf(i), next2.mo23190J(), next2.mo23185G(), next2.mo23210U(), next2.mo23208T(), next2.mo23212W(), Boolean.FALSE});
                i++;
            }
        }
        return matrixCursor;
    }

    /* renamed from: b */
    public static void m17587b() {
        C3108x.f4951e.getContentResolver().notifyChange(DeviceBrowserContract.DeviceBrowser.f12281y, (ContentObserver) null);
    }

    public int delete(@NonNull Uri uri, String str, String[] strArr) {
        f12296b.match(uri);
        String str2 = f12295a;
        AppUtils.m8300u(str2, "Invalid Uri: " + uri.toString());
        return -1;
    }

    public String getType(@NonNull Uri uri) {
        int match = f12296b.match(uri);
        if (match == 1) {
            return "vnd.android.cursor.item/device";
        }
        if (match == 2 || match == 3 || match == 4) {
            return "vnd.android.cursor.dir/devices";
        }
        String str = f12295a;
        AppUtils.m8300u(str, "Unknown Uri: " + uri.toString());
        return null;
    }

    public Uri insert(@NonNull Uri uri, ContentValues contentValues) {
        f12296b.match(uri);
        String str = f12295a;
        AppUtils.m8300u(str, "Invalid Uri: " + uri.toString());
        return null;
    }

    public boolean onCreate() {
        return true;
    }

    public Cursor query(@NonNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String str3 = str;
        ArrayList arrayList = new ArrayList();
        Object obj = "yeelink.light.color6";
        Object obj2 = "yeelink.light.color5";
        Object obj3 = "yeelink.light.color4";
        Object obj4 = "yeelink.light.color3";
        Object obj5 = "yeelink.light.color2";
        Object obj6 = "yeelink.light.color1";
        Object obj7 = "yeelink.light.lamp4";
        Object obj8 = "yeelink.light.lamp1";
        switch (f12296b.match(uri)) {
            case 2:
                return m17586a(strArr, str, strArr2, str2, (List<String>) null);
            case 3:
                arrayList.add("yeelink.light.ble1");
                arrayList.add(obj8);
                arrayList.add(obj7);
                arrayList.add("yeelink.light.lamp3");
                arrayList.add("yeelink.light.lamp2");
                arrayList.add("yeelink.light.lamp5");
                arrayList.add("yeelink.light.lamp17");
                arrayList.add("yeelink.light.lamp7");
                arrayList.add("yeelink.light.lamp8");
                arrayList.add("yeelink.light.lamp9");
                arrayList.add("yeelink.light.lamp15");
                return m17586a(strArr, str, strArr2, str2, arrayList);
            case 4:
                String str4 = str;
                arrayList.add("yeelink.light.mono1");
                arrayList.add("yeelink.light.mono2");
                arrayList.add("yeelink.light.mono4");
                arrayList.add("yeelink.light.mono5");
                arrayList.add("yeelink.light.monoa");
                arrayList.add("yeelink.light.monob");
                arrayList.add(obj6);
                arrayList.add(obj5);
                arrayList.add(obj4);
                arrayList.add(obj3);
                arrayList.add(obj2);
                arrayList.add(obj);
                arrayList.add("yeelink.light.color8");
                arrayList.add("yeelink.light.colora");
                arrayList.add("yeelink.light.colorb");
                arrayList.add("yeelink.light.colore");
                arrayList.add("yeelink.light.colorc");
                arrayList.add("yeelink.light.ct2");
                arrayList.add("yeelink.light.cta");
                arrayList.add("yeelink.light.ctc");
                return m17586a(strArr, str, strArr2, str2, arrayList);
            case 5:
                String str5 = str;
                if (str5 != null) {
                    arrayList.add(str5);
                }
                return m17586a(strArr, str, strArr2, str2, arrayList);
            case 6:
                arrayList.add("yeelink.light.ble1");
                return m17586a(strArr, str, strArr2, str2, arrayList);
            case 7:
                arrayList.add("yeelink.light.ceiling1");
                arrayList.add("yeelink.light.ceiling2");
                arrayList.add("yeelink.light.ceiling3");
                arrayList.add("yeelink.light.ceiling4");
                arrayList.add("yeelink.light.ceiling5");
                arrayList.add("yeelink.light.ceiling6");
                arrayList.add("yeelink.light.ceiling7");
                arrayList.add("yeelink.light.ceiling8");
                arrayList.add("yeelink.light.ceiling9");
                arrayList.add("yeelink.light.ceiling10");
                arrayList.add("yeelink.light.ceiling11");
                arrayList.add("yeelink.light.ceiling12");
                arrayList.add("yeelink.light.ceiling13");
                arrayList.add("yeelink.light.ceiling14");
                arrayList.add("yeelink.light.ceiling15");
                arrayList.add("yeelink.light.ceiling16");
                arrayList.add("yeelink.light.ceiling17");
                arrayList.add("yeelink.light.ceiling18");
                arrayList.add("yeelink.light.ceiling19");
                arrayList.add("yeelink.light.ceiling20");
                arrayList.add("yeelink.light.ceiling21");
                arrayList.add("yeelink.light.ceiling22");
                arrayList.add("yeelink.light.ceiling23");
                arrayList.add("yeelink.light.ceiling24");
                arrayList.add("yeelink.light.ceil26");
                arrayList.add("yeelink.light.ceil27");
                arrayList.add("yeelink.light.ceil29");
                arrayList.add("yeelink.light.ceil30");
                arrayList.add("yeelink.light.ceil31");
                arrayList.add("yeelink.light.ceil32");
                arrayList.add("yeelink.light.ceil33");
                arrayList.add("yeelink.light.ceil35");
                arrayList.add("yeelink.light.ceila");
                arrayList.add("yeelink.light.ceilb");
                arrayList.add("yeelink.light.ceilc");
                arrayList.add("yeelink.light.ceild");
                arrayList.add("yeelink.light.ceile");
                arrayList.add("yilai.light.ceiling1");
                arrayList.add("yilai.light.ceiling2");
                arrayList.add("yilai.light.ceiling3");
                arrayList.add("yeelink.light.fancl1");
                arrayList.add("yeelink.light.fancl2");
                arrayList.add("yeelink.light.fancl5");
                arrayList.add("yeelink.light.fancl6");
                return m17586a(strArr, str, strArr2, str2, arrayList);
            case 8:
                arrayList.add(obj8);
                arrayList.add(obj7);
                return m17586a(strArr, str, strArr2, str2, arrayList);
            case 9:
                arrayList.add(obj6);
                arrayList.add(obj5);
                arrayList.add(obj4);
                arrayList.add(obj3);
                arrayList.add(obj2);
                arrayList.add(obj);
                arrayList.add("yeelink.light.color8");
                arrayList.add("yeelink.light.colora");
                arrayList.add("yeelink.light.colorb");
                arrayList.add("yeelink.light.colore");
                arrayList.add("yeelink.light.colorc");
                return m17586a(strArr, str, strArr2, str2, arrayList);
            case 10:
                arrayList.add("yeelink.light.mono1");
                arrayList.add("yeelink.light.mono4");
                arrayList.add("yeelink.light.mono5");
                arrayList.add("yeelink.light.monoa");
                arrayList.add("yeelink.light.monob");
                arrayList.add("yeelink.light.ct2");
                arrayList.add("yeelink.light.cta");
                arrayList.add("yeelink.light.ctc");
                return m17586a(strArr, str, strArr2, str2, arrayList);
            case 11:
                arrayList.add("yeelink.light.bslamp1");
                return m17586a(strArr, str, strArr2, str2, arrayList);
            case 12:
                arrayList.add("yeelink.light.strip1");
                arrayList.add("yeelink.light.strip2");
                arrayList.add("yeelink.light.strip4");
                arrayList.add("yeelink.light.strip6");
                arrayList.add("yeelink.light.strip8");
                arrayList.add("yeelink.light.stripa");
                return m17586a(strArr, str, strArr2, str2, arrayList);
            case 13:
                arrayList.add("yeelink.light.gingko");
                return m17586a(strArr, str, strArr2, str2, arrayList);
            case 14:
                arrayList.add("yeelink.wifispeaker.v1");
                return m17586a(strArr, str, strArr2, str2, arrayList);
            case 15:
                arrayList.add("yeelink.light.lamp2");
                return m17586a(strArr, str, strArr2, str2, arrayList);
            case 16:
                arrayList.add("yeelink.light.lamp3");
                arrayList.add("yeelink.light.lamp5");
                arrayList.add("yeelink.light.lamp17");
                return m17586a(strArr, str, strArr2, str2, arrayList);
            case 17:
                arrayList.add("yeelink.light.bslamp2");
                return m17586a(strArr, str, strArr2, str2, arrayList);
            case 18:
                arrayList.add("yeelink.bhf_light.v1");
                return m17586a(strArr, str, strArr2, str2, arrayList);
            case 19:
                arrayList.add("yeelink.light.panel1");
                arrayList.add("yeelink.light.panel3");
                return m17586a(strArr, str, strArr2, str2, arrayList);
            case 20:
                arrayList.add("yeelink.light.lamp7");
                arrayList.add("yeelink.light.lamp8");
                return m17586a(strArr, str, strArr2, str2, arrayList);
            case 21:
                arrayList.add("yeelink.light.lamp9");
                arrayList.add("yeelink.light.lamp10");
                return m17586a(strArr, str, strArr2, str2, arrayList);
            case 22:
                arrayList.add("yeelink.gateway.v1");
                arrayList.add("yeelink.gateway.va");
                return m17586a(strArr, str, strArr2, str2, arrayList);
            case 23:
                arrayList.add("yeelink.light.bslamp3");
                arrayList.add("yeelink.light.lamp19");
                return m17586a(strArr, str, strArr2, str2, arrayList);
            case 24:
                arrayList.add("yeelink.curtain.ctmt1");
                return m17586a(strArr, str, strArr2, str2, arrayList);
            case 25:
                arrayList.add("yeelink.switch.sw1");
                return m17586a(strArr, str, strArr2, str2, arrayList);
            case 26:
                arrayList.add("yeelink.plug.plug");
                return m17586a(strArr, str, strArr2, str2, arrayList);
            case 27:
                arrayList.add("yeelink.light.lamp15");
                return m17586a(strArr, str, strArr2, str2, arrayList);
            case 28:
                arrayList.add("yeelink.light.plate2");
                return m17586a(strArr, str, strArr2, str2, arrayList);
            default:
                String str6 = f12295a;
                AppUtils.m8300u(str6, "Invalid Uri: " + uri.toString());
                return null;
        }
    }

    public int update(@NonNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        f12296b.match(uri);
        String str2 = f12295a;
        AppUtils.m8300u(str2, "Invalid Uri: " + uri.toString());
        return -1;
    }
}

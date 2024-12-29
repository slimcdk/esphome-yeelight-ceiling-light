package com.yeelight.yeelib.utils;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.yeelib.utils.a */
public class C10533a {
    /* renamed from: a */
    public static List<String> m25656a(PackageManager packageManager) {
        ArrayList arrayList = new ArrayList();
        try {
            List<PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
            for (int i = 0; i < installedPackages.size(); i++) {
                arrayList.add(installedPackages.get(i).packageName);
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }
}

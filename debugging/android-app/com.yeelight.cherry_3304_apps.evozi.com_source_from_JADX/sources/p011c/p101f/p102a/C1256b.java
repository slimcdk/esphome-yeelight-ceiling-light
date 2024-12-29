package p011c.p101f.p102a;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: c.f.a.b */
public final class C1256b {

    /* renamed from: a */
    private static final Set<String> f2214a = m3242a();

    /* renamed from: a */
    private static Set<String> m3242a() {
        HashSet hashSet = new HashSet();
        hashSet.add("com.twofortyfouram.locale");
        hashSet.add("net.dinglisch.android.taskerm");
        hashSet.add("net.dinglisch.android.tasker");
        hashSet.add("net.dinglisch.android.taskercupcake");
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: b */
    public static String m3243b(PackageManager packageManager, String str) {
        List<PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
        if (f2214a.contains(str)) {
            for (PackageInfo packageInfo : installedPackages) {
                String str2 = packageInfo.packageName;
                if (str.equals(str2)) {
                    return str2;
                }
            }
        }
        for (String next : f2214a) {
            if (!next.equals(str)) {
                for (PackageInfo packageInfo2 : installedPackages) {
                    String str3 = packageInfo2.packageName;
                    if (next.equals(str3)) {
                        return str3;
                    }
                }
                continue;
            }
        }
        return null;
    }
}

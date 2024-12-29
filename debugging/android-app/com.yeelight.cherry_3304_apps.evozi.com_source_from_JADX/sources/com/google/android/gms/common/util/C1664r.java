package com.google.android.gms.common.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.p105j.C1620c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@KeepForSdk
/* renamed from: com.google.android.gms.common.util.r */
public class C1664r {

    /* renamed from: a */
    private static final Method f3179a = m4628l();

    /* renamed from: b */
    private static final Method f3180b = m4629m();

    /* renamed from: c */
    private static final Method f3181c = m4630n();

    /* renamed from: d */
    private static final Method f3182d = m4625i();

    static {
        Process.myUid();
        m4624h();
        m4626j();
        m4627k();
    }

    @KeepForSdk
    @Nullable
    /* renamed from: a */
    public static WorkSource m4617a(Context context, @Nullable String str) {
        if (!(context == null || context.getPackageManager() == null || str == null)) {
            try {
                ApplicationInfo c = C1620c.m4502a(context).mo11301c(str, 0);
                if (c != null) {
                    return m4621e(c.uid, str);
                }
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    "Could not get applicationInfo from package: ".concat(valueOf);
                } else {
                    new String("Could not get applicationInfo from package: ");
                }
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                String valueOf2 = String.valueOf(str);
                if (valueOf2.length() != 0) {
                    "Could not find package: ".concat(valueOf2);
                } else {
                    new String("Could not find package: ");
                }
            }
        }
        return null;
    }

    @KeepForSdk
    /* renamed from: b */
    public static List<String> m4618b(@Nullable WorkSource workSource) {
        int d = workSource == null ? 0 : m4620d(workSource);
        if (d == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < d; i++) {
            String f = m4622f(workSource, i);
            if (!C1662p.m4614a(f)) {
                arrayList.add(f);
            }
        }
        return arrayList;
    }

    @KeepForSdk
    /* renamed from: c */
    public static boolean m4619c(Context context) {
        return (context == null || context.getPackageManager() == null || C1620c.m4502a(context).mo11300b("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }

    /* renamed from: d */
    private static int m4620d(WorkSource workSource) {
        Method method = f3181c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(workSource, new Object[0])).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }

    /* renamed from: e */
    private static WorkSource m4621e(int i, String str) {
        WorkSource workSource = new WorkSource();
        m4623g(workSource, i, str);
        return workSource;
    }

    @Nullable
    /* renamed from: f */
    private static String m4622f(WorkSource workSource, int i) {
        Method method = f3182d;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, new Object[]{Integer.valueOf(i)});
        } catch (Exception e) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            return null;
        }
    }

    /* renamed from: g */
    private static void m4623g(WorkSource workSource, int i, @Nullable String str) {
        if (f3180b != null) {
            if (str == null) {
                str = "";
            }
            try {
                f3180b.invoke(workSource, new Object[]{Integer.valueOf(i), str});
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        } else {
            Method method = f3179a;
            if (method != null) {
                try {
                    method.invoke(workSource, new Object[]{Integer.valueOf(i)});
                } catch (Exception e2) {
                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                }
            }
        }
    }

    /* renamed from: h */
    private static Method m4624h() {
        try {
            return WorkSource.class.getMethod("get", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: i */
    private static Method m4625i() {
        if (C1660n.m4604d()) {
            try {
                return WorkSource.class.getMethod("getName", new Class[]{Integer.TYPE});
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: j */
    private static final Method m4626j() {
        if (C1660n.m4610j()) {
            try {
                return WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: k */
    private static final Method m4627k() {
        if (C1660n.m4610j()) {
            try {
                return Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[]{Integer.TYPE, String.class});
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: l */
    private static Method m4628l() {
        try {
            return WorkSource.class.getMethod("add", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: m */
    private static Method m4629m() {
        if (C1660n.m4604d()) {
            try {
                return WorkSource.class.getMethod("add", new Class[]{Integer.TYPE, String.class});
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: n */
    private static Method m4630n() {
        try {
            return WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

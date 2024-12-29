package com.xiaomi.push.service;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4554bk;
import com.xiaomi.push.C4830m;
import com.xiaomi.push.C4994v;
import com.xiaomi.push.C4995w;
import com.xiaomi.push.service.C4894ay;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.push.service.e */
class C4960e {

    /* renamed from: a */
    private static final SparseArray<C4894ay.C4895a<String, String, String>> f9687a = new C4961f(5);

    /* renamed from: a */
    private static final int[] f9688a = {1, 2, 4, 8, 16};

    /* renamed from: b */
    private static final SparseArray<Integer> f9689b = new C4962g(5);

    C4960e() {
    }

    /* renamed from: a */
    static int m15545a(String str, String str2) {
        int i = 8;
        if (!m15556a(str, str2, 8)) {
            i = 0;
        }
        if (m15556a(str, str2, 16)) {
            i |= 16;
        }
        if (m15556a(str, str2, 1)) {
            i |= 1;
        }
        if (m15556a(str, str2, 2)) {
            i |= 2;
        }
        return m15556a(str, str2, 4) ? i | 4 : i;
    }

    /* renamed from: a */
    private static SharedPreferences m15546a(Context context) {
        return context.getSharedPreferences("ch_permission_cache_file", 0);
    }

    /* renamed from: a */
    static void m15547a(Context context, String str) {
        List<NotificationChannel> a;
        if (C4830m.m14998a(context) && !TextUtils.isEmpty(str) && (a = C4893ax.m15315a(context, str).mo29979a()) != null) {
            synchronized (C4960e.class) {
                SharedPreferences a2 = m15546a(context);
                ArrayList arrayList = new ArrayList();
                for (NotificationChannel a3 : a) {
                    String str2 = (String) C4554bk.m13011a((Object) a3, "mId");
                    if (!TextUtils.isEmpty(str2) && a2.contains(str2)) {
                        arrayList.add(str2);
                    }
                }
                if (arrayList.size() > 0) {
                    m15552a(a2, (List<String>) arrayList);
                }
            }
        }
    }

    /* renamed from: a */
    static void m15548a(Context context, String str, String str2, int i, String str3, boolean z, int i2) {
        Class<C4960e> cls = C4960e.class;
        if (C4830m.m14998a(context) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            int a = C4995w.m15744a(str3, 0);
            boolean a2 = m15555a(i, a);
            if (z) {
                m15553a(str, str2, a, i2);
                if (a2) {
                    synchronized (cls) {
                        m15549a(m15546a(context), a, str2);
                    }
                    return;
                }
                return;
            }
            synchronized (cls) {
                SharedPreferences a3 = m15546a(context);
                if (a2 || a3.contains(str2)) {
                    m15550a(a3, a, str, str2, i2);
                    if (a2) {
                        m15549a(a3, a, str2);
                    } else {
                        m15551a(a3, str2);
                    }
                }
            }
        } else if (C4830m.m14998a(context)) {
            C4408b.m12464a("ChannelPC: can`t setup permission with permissionCode:" + String.valueOf(str3) + " channelId:" + String.valueOf(str2) + " targetPkg:" + str);
        }
    }

    /* renamed from: a */
    private static void m15549a(SharedPreferences sharedPreferences, int i, String str) {
        sharedPreferences.edit().putInt(str, i).commit();
    }

    /* renamed from: a */
    private static void m15550a(SharedPreferences sharedPreferences, int i, String str, String str2, int i2) {
        if (sharedPreferences.getInt(str2, 0) != i) {
            m15553a(str, str2, i, i2);
        }
    }

    /* renamed from: a */
    private static void m15551a(SharedPreferences sharedPreferences, String str) {
        m15552a(sharedPreferences, (List<String>) new C4963h(str));
    }

    /* renamed from: a */
    private static void m15552a(SharedPreferences sharedPreferences, List<String> list) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String remove : list) {
            edit.remove(remove);
        }
        edit.commit();
    }

    /* renamed from: a */
    static void m15553a(String str, String str2, int i, int i2) {
        for (int i3 : f9688a) {
            if ((f9689b.get(i3).intValue() & i2) == 0) {
                m15554a(str, str2, i3, (i & i3) > 0);
            } else {
                C4408b.m12464a("ChannelPermissions.grantPermission:" + str + Constants.COLON_SEPARATOR + str2 + ": <" + i3 + "> :stoped by userLock");
            }
        }
    }

    /* renamed from: a */
    private static void m15554a(String str, String str2, int i, boolean z) {
        boolean a = C4894ay.m15355a(C4994v.m15733a(), str, str2, f9687a.get(i), z);
        C4408b.m12464a("ChannelPermissions.grantPermission:" + str + Constants.COLON_SEPARATOR + str2 + ": <" + i + "=" + z + "> :" + a);
    }

    /* renamed from: a */
    private static boolean m15555a(int i, int i2) {
        return i >= 4 || (i2 & 2) > 0 || (i2 & 1) > 0 || (i2 & 8) > 0 || (i2 & 16) > 0;
    }

    /* renamed from: a */
    private static boolean m15556a(String str, String str2, int i) {
        boolean z = true;
        if (C4894ay.m15341a(C4994v.m15733a(), str, str2, f9687a.get(i)) != 1) {
            z = false;
        }
        C4408b.m12464a("ChannelPermissions.checkPermission:" + str + Constants.COLON_SEPARATOR + str2 + ": <" + i + "=" + z + ">");
        return z;
    }
}

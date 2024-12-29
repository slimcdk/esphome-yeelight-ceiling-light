package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4511ag;
import com.xiaomi.push.C4516al;
import com.xiaomi.push.C4561bp;
import com.xiaomi.push.C4765ho;
import com.xiaomi.push.C4786ii;
import com.xiaomi.push.service.C4898ba;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: com.xiaomi.mipush.sdk.av */
public class C4473av {
    /* renamed from: a */
    public static void m12699a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        long j = sharedPreferences.getLong("last_sync_info", -1);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        long a = (long) C4898ba.m15362a(context).mo29988a(C4765ho.SyncInfoFrequency.mo29322a(), 1209600);
        if (j != -1) {
            if (Math.abs(currentTimeMillis - j) > a) {
                m12701a(context, true);
            } else {
                return;
            }
        }
        sharedPreferences.edit().putLong("last_sync_info", currentTimeMillis).commit();
    }

    /* renamed from: a */
    public static void m12700a(Context context, C4786ii iiVar) {
        C4408b.m12464a("need to update local info with: " + iiVar.mo29592a());
        String str = (String) iiVar.mo29592a().get(Constants.EXTRA_KEY_ACCEPT_TIME);
        if (str != null) {
            MiPushClient.removeAcceptTime(context);
            String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            if (split.length == 2) {
                MiPushClient.addAcceptTime(context, split[0], split[1]);
                if (!"00:00".equals(split[0]) || !"00:00".equals(split[1])) {
                    C4475b.m12705a(context).mo28689a(false);
                } else {
                    C4475b.m12705a(context).mo28689a(true);
                }
            }
        }
        String str2 = (String) iiVar.mo29592a().get(Constants.EXTRA_KEY_ALIASES);
        if (str2 != null) {
            MiPushClient.removeAllAliases(context);
            if (!"".equals(str2)) {
                for (String addAlias : str2.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                    MiPushClient.addAlias(context, addAlias);
                }
            }
        }
        String str3 = (String) iiVar.mo29592a().get(Constants.EXTRA_KEY_TOPICS);
        if (str3 != null) {
            MiPushClient.removeAllTopics(context);
            if (!"".equals(str3)) {
                for (String addTopic : str3.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                    MiPushClient.addTopic(context, addTopic);
                }
            }
        }
        String str4 = (String) iiVar.mo29592a().get(Constants.EXTRA_KEY_ACCOUNTS);
        if (str4 != null) {
            MiPushClient.removeAllAccounts(context);
            if (!"".equals(str4)) {
                for (String addAccount : str4.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                    MiPushClient.addAccount(context, addAccount);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m12701a(Context context, boolean z) {
        C4516al.m12857a(context).mo28733a((Runnable) new C4474aw(context, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static String m12703c(List<String> list) {
        String a = C4561bp.m13042a(m12704d(list));
        return (TextUtils.isEmpty(a) || a.length() <= 4) ? "" : a.substring(0, 4).toLowerCase();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static String m12704d(List<String> list) {
        String str = "";
        if (C4511ag.m12849a(list)) {
            return str;
        }
        ArrayList<String> arrayList = new ArrayList<>(list);
        Collections.sort(arrayList, Collator.getInstance(Locale.CHINA));
        for (String str2 : arrayList) {
            if (!TextUtils.isEmpty(str)) {
                str = str + Constants.ACCEPT_TIME_SEPARATOR_SP;
            }
            str = str + str2;
        }
        return str;
    }
}

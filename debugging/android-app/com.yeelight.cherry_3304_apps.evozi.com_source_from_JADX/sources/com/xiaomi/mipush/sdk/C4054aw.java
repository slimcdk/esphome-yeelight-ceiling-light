package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4493ad;
import com.xiaomi.push.C4498ai;
import com.xiaomi.push.C4532bf;
import com.xiaomi.push.C4744hr;
import com.xiaomi.push.C4765il;
import com.xiaomi.push.service.C4854ak;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: com.xiaomi.mipush.sdk.aw */
public class C4054aw {
    /* renamed from: a */
    public static void m10882a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        long j = sharedPreferences.getLong("last_sync_info", -1);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        long a = (long) C4854ak.m15568a(context).mo25906a(C4744hr.SyncInfoFrequency.mo25291a(), 1209600);
        if (j != -1) {
            if (Math.abs(currentTimeMillis - j) > a) {
                m10884a(context, true);
            } else {
                return;
            }
        }
        sharedPreferences.edit().putLong("last_sync_info", currentTimeMillis).commit();
    }

    /* renamed from: a */
    public static void m10883a(Context context, C4765il ilVar) {
        C3989b.m10669a("need to update local info with: " + ilVar.mo25560a());
        String str = (String) ilVar.mo25560a().get(Constants.EXTRA_KEY_ACCEPT_TIME);
        if (str != null) {
            MiPushClient.removeAcceptTime(context);
            String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            if (split.length == 2) {
                MiPushClient.addAcceptTime(context, split[0], split[1]);
                if (!"00:00".equals(split[0]) || !"00:00".equals(split[1])) {
                    C4056b.m10888a(context).mo22935a(false);
                } else {
                    C4056b.m10888a(context).mo22935a(true);
                }
            }
        }
        String str2 = (String) ilVar.mo25560a().get(Constants.EXTRA_KEY_ALIASES);
        if (str2 != null) {
            MiPushClient.removeAllAliases(context);
            if (!"".equals(str2)) {
                for (String addAlias : str2.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                    MiPushClient.addAlias(context, addAlias);
                }
            }
        }
        String str3 = (String) ilVar.mo25560a().get(Constants.EXTRA_KEY_TOPICS);
        if (str3 != null) {
            MiPushClient.removeAllTopics(context);
            if (!"".equals(str3)) {
                for (String addTopic : str3.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                    MiPushClient.addTopic(context, addTopic);
                }
            }
        }
        String str4 = (String) ilVar.mo25560a().get(Constants.EXTRA_KEY_ACCOUNTS);
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
    public static void m10884a(Context context, boolean z) {
        C4498ai.m13271a(context).mo24725a((Runnable) new C4055ax(context, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static String m10886c(List<String> list) {
        String a = C4532bf.m13431a(m10887d(list));
        return (TextUtils.isEmpty(a) || a.length() <= 4) ? "" : a.substring(0, 4).toLowerCase();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static String m10887d(List<String> list) {
        String str = "";
        if (C4493ad.m13262a(list)) {
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

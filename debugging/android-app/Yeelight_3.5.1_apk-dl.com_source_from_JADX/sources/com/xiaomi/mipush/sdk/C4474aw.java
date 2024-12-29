package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4539ba;
import com.xiaomi.push.C4561bp;
import com.xiaomi.push.C4747h;
import com.xiaomi.push.C4760hj;
import com.xiaomi.push.C4770ht;
import com.xiaomi.push.C4773hw;
import com.xiaomi.push.C4786ii;
import com.xiaomi.push.C4805j;
import com.xiaomi.push.C4830m;
import com.xiaomi.push.C4831n;
import com.xiaomi.push.service.C4902bd;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.mipush.sdk.aw */
final class C4474aw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f7473a;

    /* renamed from: a */
    final /* synthetic */ boolean f7474a;

    C4474aw(Context context, boolean z) {
        this.f7473a = context;
        this.f7474a = z;
    }

    public void run() {
        String str;
        String str2;
        Map<String, String> map;
        C4408b.m12464a("do sync info");
        C4786ii iiVar = new C4786ii(C4902bd.m15380a(), false);
        C4475b a = C4475b.m12705a(this.f7473a);
        iiVar.mo29602c(C4770ht.SyncInfo.f8718a);
        iiVar.mo29599b(a.mo28684a());
        iiVar.mo29606d(this.f7473a.getPackageName());
        HashMap hashMap = new HashMap();
        iiVar.f8983a = hashMap;
        Context context = this.f7473a;
        C4831n.m15021a((Map<String, String>) hashMap, Constants.EXTRA_KEY_APP_VERSION, C4747h.m14123a(context, context.getPackageName()));
        Map<String, String> map2 = iiVar.f8983a;
        Context context2 = this.f7473a;
        C4831n.m15021a(map2, Constants.EXTRA_KEY_APP_VERSION_CODE, Integer.toString(C4747h.m14123a(context2, context2.getPackageName())));
        C4831n.m15021a(iiVar.f8983a, "push_sdk_vn", "4_9_1");
        C4831n.m15021a(iiVar.f8983a, "push_sdk_vc", Integer.toString(40091));
        C4831n.m15021a(iiVar.f8983a, "token", a.mo28691b());
        if (!C4830m.m15015d()) {
            String a2 = C4561bp.m13042a(C4805j.m14879d(this.f7473a));
            String f = C4805j.m14882f(this.f7473a);
            if (!TextUtils.isEmpty(f)) {
                a2 = a2 + Constants.ACCEPT_TIME_SEPARATOR_SP + f;
            }
            if (!TextUtils.isEmpty(a2)) {
                C4831n.m15021a(iiVar.f8983a, Constants.EXTRA_KEY_IMEI_MD5, a2);
            }
        }
        C4539ba.m12950a(this.f7473a).mo28767a(iiVar.f8983a);
        C4831n.m15021a(iiVar.f8983a, Constants.EXTRA_KEY_REG_ID, a.mo28694c());
        C4831n.m15021a(iiVar.f8983a, Constants.EXTRA_KEY_REG_SECRET, a.mo28695d());
        C4831n.m15021a(iiVar.f8983a, Constants.EXTRA_KEY_ACCEPT_TIME, MiPushClient.getAcceptTime(this.f7473a).replace(Constants.ACCEPT_TIME_SEPARATOR_SP, Constants.ACCEPT_TIME_SEPARATOR_SERVER));
        if (this.f7474a) {
            C4831n.m15021a(iiVar.f8983a, Constants.EXTRA_KEY_ALIASES_MD5, C4473av.m12703c(MiPushClient.getAllAlias(this.f7473a)));
            C4831n.m15021a(iiVar.f8983a, Constants.EXTRA_KEY_TOPICS_MD5, C4473av.m12703c(MiPushClient.getAllTopic(this.f7473a)));
            map = iiVar.f8983a;
            str2 = C4473av.m12703c(MiPushClient.getAllUserAccount(this.f7473a));
            str = Constants.EXTRA_KEY_ACCOUNTS_MD5;
        } else {
            C4831n.m15021a(iiVar.f8983a, Constants.EXTRA_KEY_ALIASES, C4473av.m12704d(MiPushClient.getAllAlias(this.f7473a)));
            C4831n.m15021a(iiVar.f8983a, Constants.EXTRA_KEY_TOPICS, C4473av.m12704d(MiPushClient.getAllTopic(this.f7473a)));
            map = iiVar.f8983a;
            str2 = C4473av.m12704d(MiPushClient.getAllUserAccount(this.f7473a));
            str = Constants.EXTRA_KEY_ACCOUNTS;
        }
        C4831n.m15021a(map, str, str2);
        C4465ao.m12646a(this.f7473a).mo28663a(iiVar, C4760hj.Notification, false, (C4773hw) null);
    }
}

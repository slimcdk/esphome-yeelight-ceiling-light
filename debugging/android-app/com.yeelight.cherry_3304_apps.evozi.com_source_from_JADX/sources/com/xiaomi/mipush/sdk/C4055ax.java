package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4516au;
import com.xiaomi.push.C4532bf;
import com.xiaomi.push.C4689g;
import com.xiaomi.push.C4739hm;
import com.xiaomi.push.C4749hw;
import com.xiaomi.push.C4752hz;
import com.xiaomi.push.C4753i;
import com.xiaomi.push.C4765il;
import com.xiaomi.push.C4808l;
import com.xiaomi.push.C4810n;
import com.xiaomi.push.service.C4858an;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.mipush.sdk.ax */
final class C4055ax implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f6906a;

    /* renamed from: a */
    final /* synthetic */ boolean f6907a;

    C4055ax(Context context, boolean z) {
        this.f6906a = context;
        this.f6907a = z;
    }

    public void run() {
        String str;
        String str2;
        Map<String, String> map;
        C3989b.m10669a("do sync info");
        C4765il ilVar = new C4765il(C4858an.m15586a(), false);
        C4056b a = C4056b.m10888a(this.f6906a);
        ilVar.mo25565c(C4749hw.SyncInfo.f9252a);
        ilVar.mo25562b(a.mo22930a());
        ilVar.mo25569d(this.f6906a.getPackageName());
        HashMap hashMap = new HashMap();
        ilVar.f9524a = hashMap;
        Context context = this.f6906a;
        C4810n.m15370a((Map<String, String>) hashMap, Constants.EXTRA_KEY_APP_VERSION, C4689g.m14350a(context, context.getPackageName()));
        Map<String, String> map2 = ilVar.f9524a;
        Context context2 = this.f6906a;
        C4810n.m15370a(map2, Constants.EXTRA_KEY_APP_VERSION_CODE, Integer.toString(C4689g.m14350a(context2, context2.getPackageName())));
        C4810n.m15370a(ilVar.f9524a, "push_sdk_vn", "3_7_5");
        C4810n.m15370a(ilVar.f9524a, "push_sdk_vc", Integer.toString(30705));
        C4810n.m15370a(ilVar.f9524a, "token", a.mo22937b());
        if (!C4808l.m15366d()) {
            String a2 = C4532bf.m13431a(C4753i.m14760f(this.f6906a));
            String h = C4753i.m14762h(this.f6906a);
            if (!TextUtils.isEmpty(h)) {
                a2 = a2 + Constants.ACCEPT_TIME_SEPARATOR_SP + h;
            }
            if (!TextUtils.isEmpty(a2)) {
                C4810n.m15370a(ilVar.f9524a, Constants.EXTRA_KEY_IMEI_MD5, a2);
            }
        }
        C4516au.m13333a(this.f6906a).mo24750a(ilVar.f9524a);
        C4810n.m15370a(ilVar.f9524a, Constants.EXTRA_KEY_REG_ID, a.mo22940c());
        C4810n.m15370a(ilVar.f9524a, Constants.EXTRA_KEY_REG_SECRET, a.mo22941d());
        C4810n.m15370a(ilVar.f9524a, Constants.EXTRA_KEY_ACCEPT_TIME, MiPushClient.getAcceptTime(this.f6906a).replace(Constants.ACCEPT_TIME_SEPARATOR_SP, Constants.ACCEPT_TIME_SEPARATOR_SERVER));
        if (this.f6907a) {
            C4810n.m15370a(ilVar.f9524a, Constants.EXTRA_KEY_ALIASES_MD5, C4054aw.m10886c(MiPushClient.getAllAlias(this.f6906a)));
            C4810n.m15370a(ilVar.f9524a, Constants.EXTRA_KEY_TOPICS_MD5, C4054aw.m10886c(MiPushClient.getAllTopic(this.f6906a)));
            map = ilVar.f9524a;
            str2 = C4054aw.m10886c(MiPushClient.getAllUserAccount(this.f6906a));
            str = Constants.EXTRA_KEY_ACCOUNTS_MD5;
        } else {
            C4810n.m15370a(ilVar.f9524a, Constants.EXTRA_KEY_ALIASES, C4054aw.m10887d(MiPushClient.getAllAlias(this.f6906a)));
            C4810n.m15370a(ilVar.f9524a, Constants.EXTRA_KEY_TOPICS, C4054aw.m10887d(MiPushClient.getAllTopic(this.f6906a)));
            map = ilVar.f9524a;
            str2 = C4054aw.m10887d(MiPushClient.getAllUserAccount(this.f6906a));
            str = Constants.EXTRA_KEY_ACCOUNTS;
        }
        C4810n.m15370a(map, str, str2);
        C4047aq.m10835a(this.f6906a).mo22912a(ilVar, C4739hm.Notification, false, (C4752hz) null);
    }
}

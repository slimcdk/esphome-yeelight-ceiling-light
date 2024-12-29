package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.miot.common.ReturnCode;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.service.C4909f;

/* renamed from: com.xiaomi.push.ev */
class C4654ev implements C4652et {
    C4654ev() {
    }

    /* renamed from: a */
    private void m14118a(Context context, String str) {
        try {
            if (!TextUtils.isEmpty(str) && context != null) {
                String[] split = str.split(MiotCloudImpl.COOKIE_PATH);
                if (split.length > 0 && !TextUtils.isEmpty(split[split.length - 1])) {
                    String str2 = split[split.length - 1];
                    if (TextUtils.isEmpty(str2)) {
                        C4645em.m14078a(context, "provider", 1008, "B get a incorrect message");
                        return;
                    }
                    String decode = Uri.decode(str2);
                    if (TextUtils.isEmpty(decode)) {
                        C4645em.m14078a(context, "provider", 1008, "B get a incorrect message");
                        return;
                    }
                    String b = C4644el.m14076b(decode);
                    if (!TextUtils.isEmpty(b)) {
                        C4645em.m14078a(context, b, 1007, "play with provider successfully");
                        return;
                    }
                }
            }
            C4645em.m14078a(context, "provider", 1008, "B get a incorrect message");
        } catch (Exception e) {
            C4645em.m14078a(context, "provider", 1008, "B meet a exception" + e.getMessage());
        }
    }

    /* renamed from: b */
    private void m14119b(Context context, C4648ep epVar) {
        String b = epVar.mo25042b();
        String d = epVar.mo25046d();
        int a = epVar.mo25039a();
        if (context == null || TextUtils.isEmpty(b) || TextUtils.isEmpty(d)) {
            if (TextUtils.isEmpty(d)) {
                C4645em.m14078a(context, "provider", 1008, "argument error");
            } else {
                C4645em.m14078a(context, d, 1008, "argument error");
            }
        } else if (!C4909f.m15743b(context, b)) {
            C4645em.m14078a(context, d, 1003, "B is not ready");
        } else {
            C4645em.m14078a(context, d, 1002, "B is ready");
            C4645em.m14078a(context, d, 1004, "A is ready");
            String a2 = C4644el.m14074a(d);
            try {
                if (TextUtils.isEmpty(a2)) {
                    C4645em.m14078a(context, d, 1008, "info is empty");
                } else if (a != 1 || C4649eq.m14098a(context)) {
                    String type = context.getContentResolver().getType(C4644el.m14073a(b, a2));
                    if (TextUtils.isEmpty(type) || !"success".equals(type)) {
                        C4645em.m14078a(context, d, 1008, "A is fail to help B's provider");
                        return;
                    }
                    C4645em.m14078a(context, d, ReturnCode.E_INVALID_OPERATION, "A is successful");
                    C4645em.m14078a(context, d, 1006, "The job is finished");
                } else {
                    C4645em.m14078a(context, d, 1008, "A not in foreground");
                }
            } catch (Exception e) {
                C3989b.m10678a((Throwable) e);
                C4645em.m14078a(context, d, 1008, "A meet a exception when help B's provider");
            }
        }
    }

    /* renamed from: a */
    public void mo25037a(Context context, Intent intent, String str) {
        m14118a(context, str);
    }

    /* renamed from: a */
    public void mo25038a(Context context, C4648ep epVar) {
        if (epVar != null) {
            m14119b(context, epVar);
        } else {
            C4645em.m14078a(context, "provider", 1008, "A receive incorrect message");
        }
    }
}

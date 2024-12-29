package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.miot.common.ReturnCode;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.service.C4969l;

/* renamed from: com.xiaomi.push.ei */
class C4660ei implements C4658eg {
    C4660ei() {
    }

    /* renamed from: a */
    private void m13659a(Context context, String str) {
        try {
            if (!TextUtils.isEmpty(str) && context != null) {
                String[] split = str.split(MiotCloudImpl.COOKIE_PATH);
                if (split.length > 0 && !TextUtils.isEmpty(split[split.length - 1])) {
                    String str2 = split[split.length - 1];
                    if (TextUtils.isEmpty(str2)) {
                        C4650dz.m13610a(context, "provider", 1008, "B get a incorrect message");
                        return;
                    }
                    String decode = Uri.decode(str2);
                    if (TextUtils.isEmpty(decode)) {
                        C4650dz.m13610a(context, "provider", 1008, "B get a incorrect message");
                        return;
                    }
                    String b = C4649dy.m13608b(decode);
                    if (!TextUtils.isEmpty(b)) {
                        C4650dz.m13610a(context, b, 1007, "play with provider successfully");
                        return;
                    }
                }
            }
            C4650dz.m13610a(context, "provider", 1008, "B get a incorrect message");
        } catch (Exception e) {
            C4650dz.m13610a(context, "provider", 1008, "B meet a exception" + e.getMessage());
        }
    }

    /* renamed from: b */
    private void m13660b(Context context, C4654ec ecVar) {
        String b = ecVar.mo29033b();
        String d = ecVar.mo29037d();
        int a = ecVar.mo29030a();
        if (context == null || TextUtils.isEmpty(b) || TextUtils.isEmpty(d)) {
            if (TextUtils.isEmpty(d)) {
                C4650dz.m13610a(context, "provider", 1008, "argument error");
            } else {
                C4650dz.m13610a(context, d, 1008, "argument error");
            }
        } else if (!C4969l.m15577b(context, b)) {
            C4650dz.m13610a(context, d, 1003, "B is not ready");
        } else {
            C4650dz.m13610a(context, d, 1002, "B is ready");
            C4650dz.m13610a(context, d, 1004, "A is ready");
            String a2 = C4649dy.m13606a(d);
            try {
                if (TextUtils.isEmpty(a2)) {
                    C4650dz.m13610a(context, d, 1008, "info is empty");
                } else if (a != 1 || C4655ed.m13639a(context)) {
                    String type = context.getContentResolver().getType(C4649dy.m13605a(b, a2));
                    if (TextUtils.isEmpty(type) || !"success".equals(type)) {
                        C4650dz.m13610a(context, d, 1008, "A is fail to help B's provider");
                        return;
                    }
                    C4650dz.m13610a(context, d, ReturnCode.E_INVALID_OPERATION, "A is successful");
                    C4650dz.m13610a(context, d, 1006, "The job is finished");
                } else {
                    C4650dz.m13610a(context, d, 1008, "A not in foreground");
                }
            } catch (Exception e) {
                C4408b.m12478a((Throwable) e);
                C4650dz.m13610a(context, d, 1008, "A meet a exception when help B's provider");
            }
        }
    }

    /* renamed from: a */
    public void mo29028a(Context context, Intent intent, String str) {
        m13659a(context, str);
    }

    /* renamed from: a */
    public void mo29029a(Context context, C4654ec ecVar) {
        if (ecVar != null) {
            m13660b(context, ecVar);
        } else {
            C4650dz.m13610a(context, "provider", 1008, "A receive incorrect message");
        }
    }
}

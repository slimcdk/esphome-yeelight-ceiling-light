package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.C4066k;
import com.xiaomi.push.C4525ba;

/* renamed from: com.xiaomi.mipush.sdk.al */
public class C4042al {
    /* renamed from: a */
    public static AbstractPushManager m10808a(Context context, C4059d dVar) {
        return m10809b(context, dVar);
    }

    /* renamed from: b */
    private static AbstractPushManager m10809b(Context context, C4059d dVar) {
        C4066k.C4067a a = C4066k.m10961a(dVar);
        if (a == null || TextUtils.isEmpty(a.f6944a) || TextUtils.isEmpty(a.f6945b)) {
            return null;
        }
        return (AbstractPushManager) C4525ba.m13405a(a.f6944a, a.f6945b, context);
    }
}

package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.C4486l;
import com.xiaomi.push.C4554bk;

/* renamed from: com.xiaomi.mipush.sdk.ak */
public class C4461ak {
    /* renamed from: a */
    public static AbstractPushManager m12620a(Context context, C4479e eVar) {
        return m12621b(context, eVar);
    }

    /* renamed from: b */
    private static AbstractPushManager m12621b(Context context, C4479e eVar) {
        C4486l.C4487a a = C4486l.m12787a(eVar);
        if (a == null || TextUtils.isEmpty(a.f7511a) || TextUtils.isEmpty(a.f7512b)) {
            return null;
        }
        return (AbstractPushManager) C4554bk.m13014a(a.f7511a, a.f7512b, context);
    }
}

package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import java.text.SimpleDateFormat;

/* renamed from: com.xiaomi.push.co */
public class C4593co {

    /* renamed from: a */
    private static String f7728a;

    /* renamed from: a */
    private static SimpleDateFormat f7729a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        f7729a = simpleDateFormat;
        f7728a = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: a */
    public static C4764hn m13185a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C4764hn hnVar = new C4764hn();
        hnVar.mo29307d("category_push_stat");
        hnVar.mo29295a("push_sdk_stat_channel");
        hnVar.mo29294a(1);
        hnVar.mo29300b(str);
        hnVar.mo29297a(true);
        hnVar.mo29299b(System.currentTimeMillis());
        hnVar.mo29314g(C4569bx.m13076a(context).mo28791a());
        hnVar.mo29309e("com.xiaomi.xmsf");
        hnVar.mo29312f("");
        hnVar.mo29303c("push_stat");
        return hnVar;
    }
}

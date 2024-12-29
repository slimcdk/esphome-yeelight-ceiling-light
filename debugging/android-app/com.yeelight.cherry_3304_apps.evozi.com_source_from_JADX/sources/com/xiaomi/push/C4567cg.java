package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import java.text.SimpleDateFormat;

/* renamed from: com.xiaomi.push.cg */
public class C4567cg {

    /* renamed from: a */
    private static String f8297a;

    /* renamed from: a */
    private static SimpleDateFormat f8298a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        f8298a = simpleDateFormat;
        f8297a = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: a */
    public static C4743hq m13583a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C4743hq hqVar = new C4743hq();
        hqVar.mo25276d("category_push_stat");
        hqVar.mo25266a("push_sdk_stat_channel");
        hqVar.mo25265a(1);
        hqVar.mo25269b(str);
        hqVar.mo25267a(true);
        hqVar.mo25268b(System.currentTimeMillis());
        hqVar.mo25283g(C4543bp.m13474a(context).mo24783a());
        hqVar.mo25278e("com.xiaomi.xmsf");
        hqVar.mo25281f("");
        hqVar.mo25272c("push_stat");
        return hqVar;
    }
}

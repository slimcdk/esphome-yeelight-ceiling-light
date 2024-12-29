package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;

/* renamed from: com.xiaomi.mipush.sdk.j */
final class C4484j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f7506a;

    /* renamed from: a */
    final /* synthetic */ C4479e f7507a;

    /* renamed from: a */
    final /* synthetic */ String f7508a;

    C4484j(String str, Context context, C4479e eVar) {
        this.f7508a = str;
        this.f7506a = context;
        this.f7507a = eVar;
    }

    public void run() {
        String str;
        if (!TextUtils.isEmpty(this.f7508a)) {
            String[] split = this.f7508a.split(Constants.WAVE_SEPARATOR);
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    str = "";
                    break;
                }
                String str2 = split[i];
                if (!TextUtils.isEmpty(str2) && str2.startsWith("token:")) {
                    str = str2.substring(str2.indexOf(Constants.COLON_SEPARATOR) + 1);
                    break;
                }
                i++;
            }
            if (!TextUtils.isEmpty(str)) {
                C4408b.m12464a("ASSEMBLE_PUSH : receive correct token");
                C4483i.m12786d(this.f7506a, this.f7507a, str);
                C4483i.m12764a(this.f7506a);
                return;
            }
            C4408b.m12464a("ASSEMBLE_PUSH : receive incorrect token");
        }
    }
}

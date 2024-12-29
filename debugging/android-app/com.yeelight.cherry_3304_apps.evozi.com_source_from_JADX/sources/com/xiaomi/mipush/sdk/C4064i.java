package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;

/* renamed from: com.xiaomi.mipush.sdk.i */
final class C4064i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f6939a;

    /* renamed from: a */
    final /* synthetic */ C4059d f6940a;

    /* renamed from: a */
    final /* synthetic */ String f6941a;

    C4064i(String str, Context context, C4059d dVar) {
        this.f6941a = str;
        this.f6939a = context;
        this.f6940a = dVar;
    }

    public void run() {
        String str;
        if (!TextUtils.isEmpty(this.f6941a)) {
            String[] split = this.f6941a.split(Constants.WAVE_SEPARATOR);
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
                C3989b.m10669a("ASSEMBLE_PUSH : receive correct token");
                C4063h.m10960d(this.f6939a, this.f6940a, str);
                C4063h.m10943a(this.f6939a);
                return;
            }
            C3989b.m10669a("ASSEMBLE_PUSH : receive incorrect token");
        }
    }
}

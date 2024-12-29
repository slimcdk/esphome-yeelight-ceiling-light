package com.xiaomi.mistatistic.sdk;

import com.xiaomi.mistatistic.sdk.controller.C4113c;
import com.xiaomi.mistatistic.sdk.controller.C4130h;
import com.xiaomi.mistatistic.sdk.controller.C4137k;

public class WebViewLoadingStats {
    public static void onPageEnd(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        long a = C4137k.m11203a(C4113c.m11105a(), str, 0);
        long j = currentTimeMillis - a;
        if (a <= 0 || j < 0) {
            C4130h.m11180b("", "web_view_page_loading record time is invalid, record startTime is : %d,record end time is : %d", Long.valueOf(a), Long.valueOf(currentTimeMillis));
            return;
        }
        C4137k.m11211b(C4113c.m11105a(), str, 0);
        C4130h.m11180b("", "web_view_page_loading time is:%d, url is:%s", Long.valueOf(j), str);
        MiStatInterface.recordCalculateEvent("web_view_page_loading_time", str, j);
    }

    public static void onPageStart(String str) {
        C4137k.m11211b(C4113c.m11105a(), str, System.currentTimeMillis());
    }
}

package com.xiaomi.mipush.sdk;

import com.xiaomi.mipush.sdk.MiTinyDataClient;
import java.util.concurrent.ScheduledFuture;

/* renamed from: com.xiaomi.mipush.sdk.ae */
class C4035ae implements Runnable {

    /* renamed from: a */
    final /* synthetic */ MiTinyDataClient.C4027a.C4028a f6857a;

    C4035ae(MiTinyDataClient.C4027a.C4028a aVar) {
        this.f6857a = aVar;
    }

    public void run() {
        if (this.f6857a.f6845a.size() != 0) {
            this.f6857a.m10770b();
        } else if (MiTinyDataClient.C4027a.C4028a.m10766a(this.f6857a) != null) {
            MiTinyDataClient.C4027a.C4028a.m10766a(this.f6857a).cancel(false);
            ScheduledFuture unused = this.f6857a.f6846a = null;
        }
    }
}

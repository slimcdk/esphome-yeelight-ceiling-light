package com.xiaomi.push;

import com.miot.service.manager.timer.TimerCodec;
import java.nio.ByteBuffer;

/* renamed from: com.xiaomi.push.fr */
public final class C4705fr extends C4695fl {
    public C4705fr() {
        mo29150a("PING", (String) null);
        mo29149a(TimerCodec.DISENABLE);
        mo29147a(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ByteBuffer mo29146a(ByteBuffer byteBuffer) {
        return mo29145a().length == 0 ? byteBuffer : super.mo29146a(byteBuffer);
    }

    /* renamed from: c */
    public int mo29156c() {
        if (mo29145a().length == 0) {
            return 0;
        }
        return super.mo29156c();
    }
}

package com.xiaomi.push;

import com.miot.service.manager.timer.TimerCodec;
import java.nio.ByteBuffer;

/* renamed from: com.xiaomi.push.fp */
public final class C4677fp extends C4673fl {
    public C4677fp() {
        mo25117a("PING", (String) null);
        mo25116a(TimerCodec.DISENABLE);
        mo25114a(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ByteBuffer mo25113a(ByteBuffer byteBuffer) {
        return mo25112a().length == 0 ? byteBuffer : super.mo25113a(byteBuffer);
    }

    /* renamed from: c */
    public int mo25122c() {
        if (mo25112a().length == 0) {
            return 0;
        }
        return super.mo25122c();
    }
}

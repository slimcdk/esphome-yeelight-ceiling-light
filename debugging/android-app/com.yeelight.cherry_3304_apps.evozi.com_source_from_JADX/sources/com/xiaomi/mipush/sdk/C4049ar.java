package com.xiaomi.mipush.sdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;

/* renamed from: com.xiaomi.mipush.sdk.ar */
class C4049ar extends Handler {

    /* renamed from: a */
    final /* synthetic */ C4047aq f6895a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4049ar(C4047aq aqVar, Looper looper) {
        super(looper);
        this.f6895a = aqVar;
    }

    public void dispatchMessage(Message message) {
        C4047aq aqVar;
        C4053av avVar;
        HashMap<String, String> a;
        C4047aq aqVar2;
        C4053av avVar2;
        if (message.what == 19) {
            String str = (String) message.obj;
            int i = message.arg1;
            synchronized (C4037ag.class) {
                if (C4037ag.m10796a(C4047aq.m10830a(this.f6895a)).mo22894a(str)) {
                    if (C4037ag.m10796a(C4047aq.m10830a(this.f6895a)).mo22894a(str) < 10) {
                        if (C4053av.DISABLE_PUSH.ordinal() == i && "syncing".equals(C4037ag.m10796a(C4047aq.m10830a(this.f6895a)).mo22895a(C4053av.DISABLE_PUSH))) {
                            aqVar2 = this.f6895a;
                            avVar2 = C4053av.DISABLE_PUSH;
                        } else if (C4053av.ENABLE_PUSH.ordinal() != i || !"syncing".equals(C4037ag.m10796a(C4047aq.m10830a(this.f6895a)).mo22895a(C4053av.ENABLE_PUSH))) {
                            if (C4053av.UPLOAD_HUAWEI_TOKEN.ordinal() == i && "syncing".equals(C4037ag.m10796a(C4047aq.m10830a(this.f6895a)).mo22895a(C4053av.UPLOAD_HUAWEI_TOKEN))) {
                                aqVar = this.f6895a;
                                avVar = C4053av.UPLOAD_HUAWEI_TOKEN;
                                a = C4063h.m10946a(C4047aq.m10830a(this.f6895a), C4059d.ASSEMBLE_PUSH_HUAWEI);
                            } else if (C4053av.UPLOAD_FCM_TOKEN.ordinal() == i && "syncing".equals(C4037ag.m10796a(C4047aq.m10830a(this.f6895a)).mo22895a(C4053av.UPLOAD_FCM_TOKEN))) {
                                aqVar = this.f6895a;
                                avVar = C4053av.UPLOAD_FCM_TOKEN;
                                a = C4063h.m10946a(C4047aq.m10830a(this.f6895a), C4059d.ASSEMBLE_PUSH_FCM);
                            } else if (C4053av.UPLOAD_COS_TOKEN.ordinal() != i || !"syncing".equals(C4037ag.m10796a(C4047aq.m10830a(this.f6895a)).mo22895a(C4053av.UPLOAD_COS_TOKEN))) {
                                if (C4053av.UPLOAD_FTOS_TOKEN.ordinal() == i && "syncing".equals(C4037ag.m10796a(C4047aq.m10830a(this.f6895a)).mo22895a(C4053av.UPLOAD_FTOS_TOKEN))) {
                                    aqVar = this.f6895a;
                                    avVar = C4053av.UPLOAD_FTOS_TOKEN;
                                    a = C4063h.m10946a(C4047aq.m10830a(this.f6895a), C4059d.ASSEMBLE_PUSH_FTOS);
                                }
                                C4037ag.m10796a(C4047aq.m10830a(this.f6895a)).mo22897b(str);
                            } else {
                                aqVar = this.f6895a;
                                avVar = C4053av.UPLOAD_COS_TOKEN;
                                a = C4063h.m10946a(C4047aq.m10830a(this.f6895a), C4059d.ASSEMBLE_PUSH_COS);
                            }
                            aqVar.m10841a(str, avVar, false, a);
                            C4037ag.m10796a(C4047aq.m10830a(this.f6895a)).mo22897b(str);
                        } else {
                            aqVar2 = this.f6895a;
                            avVar2 = C4053av.ENABLE_PUSH;
                        }
                        aqVar2.m10841a(str, avVar2, true, (HashMap<String, String>) null);
                        C4037ag.m10796a(C4047aq.m10830a(this.f6895a)).mo22897b(str);
                    } else {
                        C4037ag.m10796a(C4047aq.m10830a(this.f6895a)).mo22898c(str);
                    }
                }
            }
        }
    }
}

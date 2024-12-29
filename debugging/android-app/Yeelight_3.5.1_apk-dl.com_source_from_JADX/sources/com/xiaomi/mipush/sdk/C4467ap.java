package com.xiaomi.mipush.sdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;

/* renamed from: com.xiaomi.mipush.sdk.ap */
class C4467ap extends Handler {

    /* renamed from: a */
    final /* synthetic */ C4465ao f7461a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4467ap(C4465ao aoVar, Looper looper) {
        super(looper);
        this.f7461a = aoVar;
    }

    public void dispatchMessage(Message message) {
        C4465ao aoVar;
        HashMap a;
        C4465ao aoVar2;
        if (message.what == 19) {
            String str = (String) message.obj;
            int i = message.arg1;
            synchronized (C4456af.class) {
                if (C4456af.m12606a(C4465ao.m12641a(this.f7461a)).mo28645a(str)) {
                    if (C4456af.m12606a(C4465ao.m12641a(this.f7461a)).mo28645a(str) < 10) {
                        C4472au auVar = C4472au.DISABLE_PUSH;
                        if (auVar.ordinal() != i || !"syncing".equals(C4456af.m12606a(C4465ao.m12641a(this.f7461a)).mo28646a(auVar))) {
                            auVar = C4472au.ENABLE_PUSH;
                            if (auVar.ordinal() != i || !"syncing".equals(C4456af.m12606a(C4465ao.m12641a(this.f7461a)).mo28646a(auVar))) {
                                C4472au auVar2 = C4472au.UPLOAD_HUAWEI_TOKEN;
                                if (auVar2.ordinal() != i || !"syncing".equals(C4456af.m12606a(C4465ao.m12641a(this.f7461a)).mo28646a(auVar2))) {
                                    auVar2 = C4472au.UPLOAD_FCM_TOKEN;
                                    if (auVar2.ordinal() != i || !"syncing".equals(C4456af.m12606a(C4465ao.m12641a(this.f7461a)).mo28646a(auVar2))) {
                                        auVar2 = C4472au.UPLOAD_COS_TOKEN;
                                        if (auVar2.ordinal() != i || !"syncing".equals(C4456af.m12606a(C4465ao.m12641a(this.f7461a)).mo28646a(auVar2))) {
                                            auVar2 = C4472au.UPLOAD_FTOS_TOKEN;
                                            if (auVar2.ordinal() == i && "syncing".equals(C4456af.m12606a(C4465ao.m12641a(this.f7461a)).mo28646a(auVar2))) {
                                                aoVar = this.f7461a;
                                                a = C4483i.m12765a(C4465ao.m12641a(aoVar), C4479e.ASSEMBLE_PUSH_FTOS);
                                            }
                                            C4456af.m12606a(C4465ao.m12641a(this.f7461a)).mo28648b(str);
                                        } else {
                                            aoVar = this.f7461a;
                                            a = C4483i.m12765a(C4465ao.m12641a(aoVar), C4479e.ASSEMBLE_PUSH_COS);
                                        }
                                    } else {
                                        aoVar = this.f7461a;
                                        a = C4483i.m12765a(C4465ao.m12641a(aoVar), C4479e.ASSEMBLE_PUSH_FCM);
                                    }
                                } else {
                                    aoVar = this.f7461a;
                                    a = C4483i.m12765a(C4465ao.m12641a(aoVar), C4479e.ASSEMBLE_PUSH_HUAWEI);
                                }
                                aoVar.m12652a(str, auVar2, false, (HashMap<String, String>) a);
                                C4456af.m12606a(C4465ao.m12641a(this.f7461a)).mo28648b(str);
                            } else {
                                aoVar2 = this.f7461a;
                            }
                        } else {
                            aoVar2 = this.f7461a;
                        }
                        aoVar2.m12652a(str, auVar, true, (HashMap<String, String>) null);
                        C4456af.m12606a(C4465ao.m12641a(this.f7461a)).mo28648b(str);
                    } else {
                        C4456af.m12606a(C4465ao.m12641a(this.f7461a)).mo28649c(str);
                    }
                }
            }
        }
    }
}

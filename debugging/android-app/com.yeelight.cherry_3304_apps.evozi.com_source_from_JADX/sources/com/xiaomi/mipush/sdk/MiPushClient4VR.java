package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.miot.bluetooth.channel.packet.Packet;
import com.xiaomi.push.C4739hm;
import com.xiaomi.push.C4749hw;
import com.xiaomi.push.C4752hz;
import com.xiaomi.push.C4765il;
import com.xiaomi.push.service.C4858an;

public class MiPushClient4VR {
    public static void uploadData(Context context, String str) {
        C4765il ilVar = new C4765il();
        ilVar.mo25565c(C4749hw.VRUpload.f9252a);
        ilVar.mo25562b(C4056b.m10888a(context).mo22930a());
        ilVar.mo25569d(context.getPackageName());
        ilVar.mo25561a(Packet.DATA, str);
        ilVar.mo25555a(C4858an.m15586a());
        C4047aq.m10835a(context).mo22910a(ilVar, C4739hm.Notification, (C4752hz) null);
    }
}

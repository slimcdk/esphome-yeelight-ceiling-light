package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.miot.bluetooth.channel.packet.Packet;
import com.xiaomi.push.C4760hj;
import com.xiaomi.push.C4770ht;
import com.xiaomi.push.C4773hw;
import com.xiaomi.push.C4786ii;
import com.xiaomi.push.service.C4902bd;

public class MiPushClient4VR {
    public static void uploadData(Context context, String str) {
        C4786ii iiVar = new C4786ii();
        iiVar.mo29602c(C4770ht.VRUpload.f8718a);
        iiVar.mo29599b(C4475b.m12705a(context).mo28684a());
        iiVar.mo29606d(context.getPackageName());
        iiVar.mo29598a(Packet.DATA, str);
        iiVar.mo29593a(C4902bd.m15380a());
        C4465ao.m12646a(context).mo28661a(iiVar, C4760hj.Notification, (C4773hw) null);
    }
}

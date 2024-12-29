package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.mipush.sdk.C4475b;
import com.xiaomi.push.C4561bp;
import com.xiaomi.push.C4678ey;
import com.xiaomi.push.C4747h;
import com.xiaomi.push.C4760hj;
import com.xiaomi.push.C4770ht;
import com.xiaomi.push.C4773hw;
import com.xiaomi.push.C4774hx;
import com.xiaomi.push.C4776hz;
import com.xiaomi.push.C4786ii;
import com.xiaomi.push.C4787ij;
import com.xiaomi.push.C4788ik;
import com.xiaomi.push.C4793ip;
import com.xiaomi.push.C4794iq;
import com.xiaomi.push.C4797it;
import com.xiaomi.push.C4805j;
import com.xiaomi.push.C4830m;
import com.xiaomi.push.service.C4874al;
import com.xiaomi.push.service.C4902bd;
import com.xiaomi.push.service.C4925br;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MiPushClient4Hybrid {
    private static Map<String, C4475b.C4476a> dataMap = new HashMap();
    private static MiPushCallback sCallback;
    private static Map<String, Long> sRegisterTimeMap = new HashMap();

    public static class MiPushCallback {
        public void onCommandResult(String str, MiPushCommandMessage miPushCommandMessage) {
        }

        public void onReceiveRegisterResult(String str, MiPushCommandMessage miPushCommandMessage) {
        }

        public void onReceiveUnregisterResult(String str, MiPushCommandMessage miPushCommandMessage) {
        }
    }

    private static void addPullNotificationTime(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        sharedPreferences.edit().putLong("last_pull_notification_" + str, System.currentTimeMillis()).commit();
    }

    private static short getDeviceStatus(MiPushMessage miPushMessage, boolean z) {
        String str = miPushMessage.getExtra() == null ? "" : miPushMessage.getExtra().get(Constants.EXTRA_KEY_HYBRID_DEVICE_STATUS);
        int i = 0;
        if (!TextUtils.isEmpty(str)) {
            i = Integer.valueOf(str).intValue();
        }
        if (!z) {
            i = (i & -4) + C4747h.C4748a.NOT_ALLOWED.mo29273a();
        }
        return (short) i;
    }

    public static boolean isRegistered(Context context, String str) {
        return C4475b.m12705a(context).mo28685a(str) != null;
    }

    public static void onReceiveRegisterResult(Context context, C4788ik ikVar) {
        C4475b.C4476a aVar;
        String c = ikVar.mo29682c();
        if (ikVar.mo29678a() == 0 && (aVar = dataMap.get(c)) != null) {
            aVar.mo28700a(ikVar.f9088e, ikVar.f9089f);
            C4475b.m12705a(context).mo28687a(c, aVar);
        }
        ArrayList arrayList = null;
        if (!TextUtils.isEmpty(ikVar.f9088e)) {
            arrayList = new ArrayList();
            arrayList.add(ikVar.f9088e);
        }
        MiPushCommandMessage generateCommandMessage = PushMessageHelper.generateCommandMessage(C4678ey.COMMAND_REGISTER.f8040a, arrayList, ikVar.f9076a, ikVar.f9087d, (String) null, (List<String>) null);
        MiPushCallback miPushCallback = sCallback;
        if (miPushCallback != null) {
            miPushCallback.onReceiveRegisterResult(c, generateCommandMessage);
        }
    }

    public static void onReceiveUnregisterResult(Context context, C4794iq iqVar) {
        MiPushCommandMessage generateCommandMessage = PushMessageHelper.generateCommandMessage(C4678ey.COMMAND_UNREGISTER.f8040a, (List<String>) null, iqVar.f9211a, iqVar.f9219d, (String) null, (List<String>) null);
        String a = iqVar.mo29797a();
        MiPushCallback miPushCallback = sCallback;
        if (miPushCallback != null) {
            miPushCallback.onReceiveUnregisterResult(a, generateCommandMessage);
        }
    }

    public static void registerPush(Context context, String str, String str2, String str3) {
        if (C4475b.m12705a(context).mo28688a(str2, str3, str)) {
            ArrayList arrayList = new ArrayList();
            C4475b.C4476a a = C4475b.m12705a(context).mo28685a(str);
            if (a != null) {
                arrayList.add(a.f7486c);
                MiPushCommandMessage generateCommandMessage = PushMessageHelper.generateCommandMessage(C4678ey.COMMAND_REGISTER.f8040a, arrayList, 0, (String) null, (String) null, (List<String>) null);
                MiPushCallback miPushCallback = sCallback;
                if (miPushCallback != null) {
                    miPushCallback.onReceiveRegisterResult(str, generateCommandMessage);
                }
            }
            if (shouldPullNotification(context, str)) {
                C4786ii iiVar = new C4786ii();
                iiVar.mo29599b(str2);
                iiVar.mo29602c(C4770ht.PullOfflineMessage.f8718a);
                iiVar.mo29593a(C4902bd.m15380a());
                iiVar.mo29596a(false);
                C4465ao.m12646a(context).mo28666a(iiVar, C4760hj.Notification, false, true, (C4773hw) null, false, str, str2);
                C4408b.m12481b("MiPushClient4Hybrid pull offline pass through message");
                addPullNotificationTime(context, str);
                return;
            }
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - (sRegisterTimeMap.get(str) != null ? sRegisterTimeMap.get(str).longValue() : 0)) < 5000) {
            C4408b.m12464a("MiPushClient4Hybrid  Could not send register message within 5s repeatedly.");
            return;
        }
        sRegisterTimeMap.put(str, Long.valueOf(currentTimeMillis));
        String a2 = C4561bp.m13041a(6);
        C4475b.C4476a aVar = new C4475b.C4476a(context);
        aVar.mo28705c(str2, str3, a2);
        dataMap.put(str, aVar);
        C4787ij ijVar = new C4787ij();
        ijVar.mo29628a(C4902bd.m15380a());
        ijVar.mo29632b(str2);
        ijVar.mo29643e(str3);
        ijVar.mo29640d(str);
        ijVar.mo29647f(a2);
        ijVar.mo29636c(C4747h.m14123a(context, context.getPackageName()));
        ijVar.mo29631b(C4747h.m14123a(context, context.getPackageName()));
        ijVar.mo29653h("4_9_1");
        ijVar.mo29626a(40091);
        ijVar.mo29627a(C4774hx.Init);
        if (!C4830m.m15015d()) {
            String e = C4805j.m14881e(context);
            if (!TextUtils.isEmpty(e)) {
                ijVar.mo29657i(C4561bp.m13042a(e));
            }
        }
        int a3 = C4805j.m14859a();
        if (a3 >= 0) {
            ijVar.mo29635c(a3);
        }
        C4786ii iiVar2 = new C4786ii();
        iiVar2.mo29602c(C4770ht.HybridRegister.f8718a);
        iiVar2.mo29599b(C4475b.m12705a(context).mo28684a());
        iiVar2.mo29606d(context.getPackageName());
        iiVar2.mo29597a(C4797it.m14834a(ijVar));
        iiVar2.mo29593a(C4902bd.m15380a());
        C4465ao.m12646a(context).mo28661a(iiVar2, C4760hj.Notification, (C4773hw) null);
    }

    public static void removeDuplicateCache(Context context, MiPushMessage miPushMessage) {
        String str = miPushMessage.getExtra() != null ? miPushMessage.getExtra().get("jobkey") : null;
        if (TextUtils.isEmpty(str)) {
            str = miPushMessage.getMessageId();
        }
        C4463am.m12627a(context, str);
    }

    public static void reportMessageArrived(Context context, MiPushMessage miPushMessage, boolean z) {
        if (miPushMessage == null || miPushMessage.getExtra() == null) {
            C4408b.m12464a("do not ack message, message is null");
            return;
        }
        try {
            C4776hz hzVar = new C4776hz();
            hzVar.mo29446b(C4475b.m12705a(context).mo28684a());
            hzVar.mo29442a(miPushMessage.getMessageId());
            hzVar.mo29441a(Long.valueOf(miPushMessage.getExtra().get(Constants.EXTRA_KEY_HYBRID_MESSAGE_TS)).longValue());
            hzVar.mo29443a(getDeviceStatus(miPushMessage, z));
            if (!TextUtils.isEmpty(miPushMessage.getTopic())) {
                hzVar.mo29449c(miPushMessage.getTopic());
            }
            C4465ao.m12646a(context).mo28663a(hzVar, C4760hj.AckMessage, false, C4925br.m15458a(PushMessageHelper.generateMessage(miPushMessage)));
            C4408b.m12481b("MiPushClient4Hybrid ack mina message, messageId is " + miPushMessage.getMessageId());
        } catch (Throwable th) {
            miPushMessage.getExtra().remove(Constants.EXTRA_KEY_HYBRID_MESSAGE_TS);
            miPushMessage.getExtra().remove(Constants.EXTRA_KEY_HYBRID_DEVICE_STATUS);
            throw th;
        }
        miPushMessage.getExtra().remove(Constants.EXTRA_KEY_HYBRID_MESSAGE_TS);
        miPushMessage.getExtra().remove(Constants.EXTRA_KEY_HYBRID_DEVICE_STATUS);
    }

    public static void reportMessageClicked(Context context, MiPushMessage miPushMessage) {
        MiPushClient.reportMessageClicked(context, miPushMessage);
    }

    public static void setCallback(MiPushCallback miPushCallback) {
        sCallback = miPushCallback;
    }

    private static boolean shouldPullNotification(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        StringBuilder sb = new StringBuilder();
        sb.append("last_pull_notification_");
        sb.append(str);
        return Math.abs(System.currentTimeMillis() - sharedPreferences.getLong(sb.toString(), -1)) > Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL;
    }

    public static void unregisterPush(Context context, String str) {
        sRegisterTimeMap.remove(str);
        C4475b.C4476a a = C4475b.m12705a(context).mo28685a(str);
        if (a != null) {
            C4793ip ipVar = new C4793ip();
            ipVar.mo29773a(C4902bd.m15380a());
            ipVar.mo29782d(str);
            ipVar.mo29776b(a.f7482a);
            ipVar.mo29779c(a.f7486c);
            ipVar.mo29784e(a.f7484b);
            C4786ii iiVar = new C4786ii();
            iiVar.mo29602c(C4770ht.HybridUnregister.f8718a);
            iiVar.mo29599b(C4475b.m12705a(context).mo28684a());
            iiVar.mo29606d(context.getPackageName());
            iiVar.mo29597a(C4797it.m14834a(ipVar));
            iiVar.mo29593a(C4902bd.m15380a());
            C4465ao.m12646a(context).mo28661a(iiVar, C4760hj.Notification, (C4773hw) null);
            C4475b.m12705a(context).mo28692b(str);
        }
    }

    public static void uploadClearMessageData(Context context, LinkedList<? extends Object> linkedList) {
        C4874al.m15234a(context, linkedList);
    }
}

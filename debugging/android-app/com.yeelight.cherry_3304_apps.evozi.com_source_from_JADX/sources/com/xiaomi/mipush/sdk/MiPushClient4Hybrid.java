package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.mipush.sdk.C4056b;
import com.xiaomi.push.C4532bf;
import com.xiaomi.push.C4668fg;
import com.xiaomi.push.C4689g;
import com.xiaomi.push.C4739hm;
import com.xiaomi.push.C4749hw;
import com.xiaomi.push.C4752hz;
import com.xiaomi.push.C4753i;
import com.xiaomi.push.C4754ia;
import com.xiaomi.push.C4756ic;
import com.xiaomi.push.C4765il;
import com.xiaomi.push.C4766im;
import com.xiaomi.push.C4767in;
import com.xiaomi.push.C4772is;
import com.xiaomi.push.C4773it;
import com.xiaomi.push.C4776iw;
import com.xiaomi.push.C4808l;
import com.xiaomi.push.service.C4837aa;
import com.xiaomi.push.service.C4858an;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MiPushClient4Hybrid {
    private static Map<String, C4056b.C4057a> dataMap = new HashMap();
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
            i = (i & -4) + C4689g.C4690a.NOT_ALLOWED.mo25171a();
        }
        return (short) i;
    }

    public static boolean isRegistered(Context context, String str) {
        return C4056b.m10888a(context).mo22931a(str) != null;
    }

    public static void onReceiveRegisterResult(Context context, C4767in inVar) {
        C4056b.C4057a aVar;
        String b = inVar.mo25643b();
        if (inVar.mo25641a() == 0 && (aVar = dataMap.get(b)) != null) {
            aVar.mo22946a(inVar.f9623e, inVar.f9624f);
            C4056b.m10888a(context).mo22933a(b, aVar);
        }
        ArrayList arrayList = null;
        if (!TextUtils.isEmpty(inVar.f9623e)) {
            arrayList = new ArrayList();
            arrayList.add(inVar.f9623e);
        }
        MiPushCommandMessage generateCommandMessage = PushMessageHelper.generateCommandMessage(C4668fg.COMMAND_REGISTER.f8633a, arrayList, inVar.f9613a, inVar.f9622d, (String) null);
        MiPushCallback miPushCallback = sCallback;
        if (miPushCallback != null) {
            miPushCallback.onReceiveRegisterResult(b, generateCommandMessage);
        }
    }

    public static void onReceiveUnregisterResult(Context context, C4773it itVar) {
        MiPushCommandMessage generateCommandMessage = PushMessageHelper.generateCommandMessage(C4668fg.COMMAND_UNREGISTER.f8633a, (List<String>) null, itVar.f9746a, itVar.f9754d, (String) null);
        String a = itVar.mo25757a();
        MiPushCallback miPushCallback = sCallback;
        if (miPushCallback != null) {
            miPushCallback.onReceiveUnregisterResult(a, generateCommandMessage);
        }
    }

    public static void registerPush(Context context, String str, String str2, String str3) {
        if (C4056b.m10888a(context).mo22934a(str2, str3, str)) {
            ArrayList arrayList = new ArrayList();
            C4056b.C4057a a = C4056b.m10888a(context).mo22931a(str);
            if (a != null) {
                arrayList.add(a.f6919c);
                MiPushCommandMessage generateCommandMessage = PushMessageHelper.generateCommandMessage(C4668fg.COMMAND_REGISTER.f8633a, arrayList, 0, (String) null, (String) null);
                MiPushCallback miPushCallback = sCallback;
                if (miPushCallback != null) {
                    miPushCallback.onReceiveRegisterResult(str, generateCommandMessage);
                }
            }
            if (shouldPullNotification(context, str)) {
                C4765il ilVar = new C4765il();
                ilVar.mo25562b(str2);
                ilVar.mo25565c(C4749hw.PullOfflineMessage.f9252a);
                ilVar.mo25555a(C4858an.m15586a());
                ilVar.mo25558a(false);
                C4047aq.m10835a(context).mo22915a(ilVar, C4739hm.Notification, false, true, (C4752hz) null, false, str, str2);
                C3989b.m10679b("MiPushClient4Hybrid pull offline pass through message");
                addPullNotificationTime(context, str);
                return;
            }
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - (sRegisterTimeMap.get(str) != null ? sRegisterTimeMap.get(str).longValue() : 0)) < 5000) {
            C3989b.m10669a("MiPushClient4Hybrid  Could not send register message within 5s repeatedly.");
            return;
        }
        sRegisterTimeMap.put(str, Long.valueOf(currentTimeMillis));
        String a2 = C4532bf.m13430a(6);
        C4056b.C4057a aVar = new C4056b.C4057a(context);
        aVar.mo22951c(str2, str3, a2);
        dataMap.put(str, aVar);
        C4766im imVar = new C4766im();
        imVar.mo25590a(C4858an.m15586a());
        imVar.mo25594b(str2);
        imVar.mo25605e(str3);
        imVar.mo25602d(str);
        imVar.mo25609f(a2);
        imVar.mo25598c(C4689g.m14350a(context, context.getPackageName()));
        imVar.mo25593b(C4689g.m14350a(context, context.getPackageName()));
        imVar.mo25615h("3_7_5");
        imVar.mo25588a(30705);
        imVar.mo25618i(C4753i.m14759e(context));
        imVar.mo25589a(C4754ia.Init);
        if (!C4808l.m15366d()) {
            String g = C4753i.m14761g(context);
            if (!TextUtils.isEmpty(g)) {
                imVar.mo25622k(C4532bf.m13431a(g));
            }
        }
        imVar.mo25620j(C4753i.m14735a());
        int a3 = C4753i.m14735a();
        if (a3 >= 0) {
            imVar.mo25597c(a3);
        }
        C4765il ilVar2 = new C4765il();
        ilVar2.mo25565c(C4749hw.HybridRegister.f9252a);
        ilVar2.mo25562b(C4056b.m10888a(context).mo22930a());
        ilVar2.mo25569d(context.getPackageName());
        ilVar2.mo25559a(C4776iw.m15225a(imVar));
        ilVar2.mo25555a(C4858an.m15586a());
        C4047aq.m10835a(context).mo22910a(ilVar2, C4739hm.Notification, (C4752hz) null);
    }

    public static void removeDuplicateCache(Context context, MiPushMessage miPushMessage) {
        String str = miPushMessage.getExtra() != null ? miPushMessage.getExtra().get("jobkey") : null;
        if (TextUtils.isEmpty(str)) {
            str = miPushMessage.getMessageId();
        }
        C4044an.m10816a(context, str);
    }

    public static void reportMessageArrived(Context context, MiPushMessage miPushMessage, boolean z) {
        if (miPushMessage == null || miPushMessage.getExtra() == null) {
            C3989b.m10669a("do not ack message, message is null");
            return;
        }
        try {
            C4756ic icVar = new C4756ic();
            icVar.mo25415b(C4056b.m10888a(context).mo22930a());
            icVar.mo25411a(miPushMessage.getMessageId());
            icVar.mo25410a(Long.valueOf(miPushMessage.getExtra().get(Constants.EXTRA_KEY_HYBRID_MESSAGE_TS)).longValue());
            icVar.mo25412a(getDeviceStatus(miPushMessage, z));
            if (!TextUtils.isEmpty(miPushMessage.getTopic())) {
                icVar.mo25418c(miPushMessage.getTopic());
            }
            C4047aq.m10835a(context).mo22912a(icVar, C4739hm.AckMessage, false, PushMessageHelper.generateMessage(miPushMessage));
            C3989b.m10679b("MiPushClient4Hybrid ack mina message, messageId is " + miPushMessage.getMessageId());
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
        C4056b.C4057a a = C4056b.m10888a(context).mo22931a(str);
        if (a != null) {
            C4772is isVar = new C4772is();
            isVar.mo25733a(C4858an.m15586a());
            isVar.mo25742d(str);
            isVar.mo25736b(a.f6915a);
            isVar.mo25739c(a.f6919c);
            isVar.mo25744e(a.f6917b);
            C4765il ilVar = new C4765il();
            ilVar.mo25565c(C4749hw.HybridUnregister.f9252a);
            ilVar.mo25562b(C4056b.m10888a(context).mo22930a());
            ilVar.mo25569d(context.getPackageName());
            ilVar.mo25559a(C4776iw.m15225a(isVar));
            ilVar.mo25555a(C4858an.m15586a());
            C4047aq.m10835a(context).mo22910a(ilVar, C4739hm.Notification, (C4752hz) null);
            C4056b.m10888a(context).mo22938b(str);
        }
    }

    public static void uploadClearMessageData(Context context, LinkedList<? extends Object> linkedList) {
        C4837aa.m15510a(context, linkedList);
    }
}

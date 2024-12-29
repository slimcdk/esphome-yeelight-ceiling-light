package com.xiaomi.mipush.sdk;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import com.xiaomi.push.C4561bp;
import com.xiaomi.push.C4569bx;
import com.xiaomi.push.C4610db;
import com.xiaomi.push.C4665en;
import com.xiaomi.push.C4667eo;
import com.xiaomi.push.C4678ey;
import com.xiaomi.push.C4760hj;
import com.xiaomi.push.C4765ho;
import com.xiaomi.push.C4770ht;
import com.xiaomi.push.C4772hv;
import com.xiaomi.push.C4773hw;
import com.xiaomi.push.C4774hx;
import com.xiaomi.push.C4776hz;
import com.xiaomi.push.C4778ia;
import com.xiaomi.push.C4782ie;
import com.xiaomi.push.C4783if;
import com.xiaomi.push.C4784ig;
import com.xiaomi.push.C4785ih;
import com.xiaomi.push.C4786ii;
import com.xiaomi.push.C4788ik;
import com.xiaomi.push.C4790im;
import com.xiaomi.push.C4792io;
import com.xiaomi.push.C4794iq;
import com.xiaomi.push.C4796is;
import com.xiaomi.push.C4797it;
import com.xiaomi.push.C4798iu;
import com.xiaomi.push.C4804iz;
import com.xiaomi.push.C4992t;
import com.xiaomi.push.C4995w;
import com.xiaomi.push.service.C4874al;
import com.xiaomi.push.service.C4894ay;
import com.xiaomi.push.service.C4898ba;
import com.xiaomi.push.service.C4900bb;
import com.xiaomi.push.service.C4916bk;
import com.xiaomi.push.service.C4925br;
import com.xiaomi.push.service.C4964i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TimeZone;

/* renamed from: com.xiaomi.mipush.sdk.am */
public class C4463am {

    /* renamed from: a */
    private static C4463am f7440a;

    /* renamed from: a */
    private static Object f7441a = new Object();

    /* renamed from: a */
    private static Queue<String> f7442a;

    /* renamed from: a */
    private Context f7443a;

    private C4463am(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f7443a = applicationContext;
        if (applicationContext == null) {
            this.f7443a = context;
        }
    }

    /* renamed from: a */
    public static Intent m12622a(Context context, String str, Map<String, String> map, int i) {
        return C4874al.m15247b(context, str, map, i);
    }

    /* renamed from: a */
    private PushMessageHandler.C4449a m12623a(C4783if ifVar, boolean z, byte[] bArr, String str, int i, Intent intent) {
        C4667eo a;
        String packageName;
        String a2;
        String str2;
        String str3;
        String str4;
        MiPushMessage miPushMessage;
        String str5;
        int i2;
        String str6;
        String str7;
        C4667eo eoVar;
        C4783if ifVar2 = ifVar;
        boolean z2 = z;
        byte[] bArr2 = bArr;
        String str8 = str;
        int i3 = i;
        Class<C4456af> cls = C4456af.class;
        ArrayList arrayList = null;
        try {
            C4798iu a3 = C4459ai.m12617a(this.f7443a, ifVar2);
            if (a3 == null) {
                C4408b.m12483d("receiving an un-recognized message. " + ifVar2.f8947a);
                C4667eo.m13689a(this.f7443a).mo29055b(this.f7443a.getPackageName(), C4665en.m13673a(i), str8, "18");
                C4494s.m12809c(this.f7443a, ifVar2, z2);
                return null;
            }
            C4760hj a4 = ifVar.mo29558a();
            C4408b.m12464a("processing a message, action=" + a4);
            switch (C4464an.f7444a[a4.ordinal()]) {
                case 1:
                    if (!ifVar.mo29567b()) {
                        C4408b.m12483d("receiving an un-encrypt message(SendMessage).");
                        return null;
                    } else if (!C4475b.m12705a(this.f7443a).mo28696e() || z2) {
                        C4790im imVar = (C4790im) a3;
                        C4772hv a5 = imVar.mo29722a();
                        if (a5 == null) {
                            C4408b.m12483d("receive an empty message without push content, drop it");
                            C4667eo.m13689a(this.f7443a).mo29055b(this.f7443a.getPackageName(), C4665en.m13673a(i), str8, "22");
                            C4494s.m12810d(this.f7443a, ifVar2, z2);
                            return null;
                        }
                        int intExtra = intent.getIntExtra("notification_click_button", 0);
                        if (z2) {
                            if (C4874al.m15226a(ifVar)) {
                                MiPushClient.reportIgnoreRegMessageClicked(this.f7443a, a5.mo29366a(), ifVar.mo29558a(), ifVar2.f8954b, a5.mo29368b());
                            } else {
                                C4773hw hwVar = ifVar.mo29558a() != null ? new C4773hw(ifVar.mo29558a()) : new C4773hw();
                                if (hwVar.mo29392a() == null) {
                                    hwVar.mo29396a((Map<String, String>) new HashMap());
                                }
                                hwVar.mo29392a().put("notification_click_button", String.valueOf(intExtra));
                                MiPushClient.reportMessageClicked(this.f7443a, a5.mo29366a(), hwVar, a5.mo29368b());
                            }
                        }
                        if (!z2) {
                            if (!TextUtils.isEmpty(imVar.mo29727d()) && MiPushClient.aliasSetTime(this.f7443a, imVar.mo29727d()) < 0) {
                                MiPushClient.addAlias(this.f7443a, imVar.mo29727d());
                            } else if (!TextUtils.isEmpty(imVar.mo29725c()) && MiPushClient.topicSubscribedTime(this.f7443a, imVar.mo29725c()) < 0) {
                                MiPushClient.addTopic(this.f7443a, imVar.mo29725c());
                            }
                        }
                        C4773hw hwVar2 = ifVar2.f8948a;
                        if (hwVar2 == null || hwVar2.mo29392a() == null) {
                            str4 = null;
                            str3 = null;
                        } else {
                            str4 = ifVar2.f8948a.f8791a.get("jobkey");
                            str3 = str4;
                        }
                        if (TextUtils.isEmpty(str4)) {
                            str4 = a5.mo29366a();
                        }
                        if (z2 || !m12627a(this.f7443a, str4)) {
                            MiPushMessage generateMessage = PushMessageHelper.generateMessage(imVar, ifVar.mo29558a(), z2);
                            if (generateMessage.getPassThrough() != 0 || z2 || !C4874al.m15210a(generateMessage.getExtra())) {
                                C4408b.m12464a("receive a message, msgid=" + a5.mo29366a() + ", jobkey=" + str4 + ", btn=" + intExtra);
                                String a6 = C4874al.m15227a(generateMessage.getExtra(), intExtra);
                                if (!z2 || generateMessage.getExtra() == null || TextUtils.isEmpty(a6)) {
                                    miPushMessage = generateMessage;
                                } else {
                                    Map<String, String> extra = generateMessage.getExtra();
                                    if (!(intExtra == 0 || ifVar.mo29558a() == null)) {
                                        C4465ao.m12646a(this.f7443a).mo28655a(ifVar.mo29558a().mo29404c(), intExtra);
                                    }
                                    if (C4874al.m15226a(ifVar)) {
                                        Intent a7 = m12622a(this.f7443a, ifVar2.f8954b, extra, intExtra);
                                        a7.putExtra("eventMessageType", i3);
                                        a7.putExtra("messageId", str8);
                                        a7.putExtra("jobkey", str3);
                                        String c = a5.mo29370c();
                                        if (!TextUtils.isEmpty(c)) {
                                            a7.putExtra("payload", c);
                                        }
                                        this.f7443a.startActivity(a7);
                                        C4494s.m12805a(this.f7443a, ifVar2);
                                        C4667eo.m13689a(this.f7443a).mo29053a(this.f7443a.getPackageName(), C4665en.m13673a(i), str, 3006, a6);
                                        return null;
                                    }
                                    Context context = this.f7443a;
                                    Intent a8 = m12622a(context, context.getPackageName(), extra, intExtra);
                                    if (a8 == null) {
                                        return null;
                                    }
                                    if (!a6.equals(C4916bk.f9581c)) {
                                        a8.putExtra(PushMessageHelper.KEY_MESSAGE, generateMessage);
                                        a8.putExtra("eventMessageType", i3);
                                        a8.putExtra("messageId", str8);
                                        a8.putExtra("jobkey", str3);
                                    }
                                    this.f7443a.startActivity(a8);
                                    C4494s.m12805a(this.f7443a, ifVar2);
                                    C4408b.m12464a("start activity succ");
                                    C4667eo.m13689a(this.f7443a).mo29053a(this.f7443a.getPackageName(), C4665en.m13673a(i), str, 1006, a6);
                                    if (!a6.equals(C4916bk.f9581c)) {
                                        return null;
                                    }
                                    C4667eo.m13689a(this.f7443a).mo29054a(this.f7443a.getPackageName(), C4665en.m13673a(i), str8, "13");
                                    return null;
                                }
                            } else {
                                C4874al.m15221a(this.f7443a, ifVar2, bArr2);
                                return null;
                            }
                        } else {
                            C4408b.m12464a("drop a duplicate message, key=" + str4);
                            C4667eo a9 = C4667eo.m13689a(this.f7443a);
                            String packageName2 = this.f7443a.getPackageName();
                            String a10 = C4665en.m13673a(i);
                            a9.mo29056c(packageName2, a10, str8, "2:" + str4);
                            miPushMessage = null;
                        }
                        if (ifVar.mo29558a() == null && !z2) {
                            m12631a(imVar, ifVar2);
                        }
                        return miPushMessage;
                    } else {
                        C4408b.m12464a("receive a message in pause state. drop it");
                        C4667eo.m13689a(this.f7443a).mo29054a(this.f7443a.getPackageName(), C4665en.m13673a(i), str8, "12");
                        return null;
                    }
                case 2:
                    C4788ik ikVar = (C4788ik) a3;
                    String str9 = C4475b.m12705a(this.f7443a).f7478a;
                    if (TextUtils.isEmpty(str9) || !TextUtils.equals(str9, ikVar.mo29678a())) {
                        C4408b.m12464a("bad Registration result:");
                        C4667eo.m13689a(this.f7443a).mo29055b(this.f7443a.getPackageName(), C4665en.m13673a(i), str8, "21");
                        return null;
                    }
                    long a11 = C4465ao.m12646a(this.f7443a).mo28653a();
                    if (a11 <= 0 || SystemClock.elapsedRealtime() - a11 <= 900000) {
                        C4475b.m12705a(this.f7443a).f7478a = null;
                        int i4 = (ikVar.f9076a > 0 ? 1 : (ikVar.f9076a == 0 ? 0 : -1));
                        Context context2 = this.f7443a;
                        if (i4 == 0) {
                            C4475b.m12705a(context2).mo28693b(ikVar.f9088e, ikVar.f9089f, ikVar.f9095l);
                            FCMPushHelper.persistIfXmsfSupDecrypt(this.f7443a);
                            eoVar = C4667eo.m13689a(this.f7443a);
                            str7 = this.f7443a.getPackageName();
                            str6 = C4665en.m13673a(i);
                            i2 = 6006;
                            str5 = TimerCodec.ENABLE;
                        } else {
                            eoVar = C4667eo.m13689a(context2);
                            str7 = this.f7443a.getPackageName();
                            str6 = C4665en.m13673a(i);
                            i2 = 6006;
                            str5 = "2";
                        }
                        eoVar.mo29053a(str7, str6, str, i2, str5);
                        if (!TextUtils.isEmpty(ikVar.f9088e)) {
                            arrayList = new ArrayList();
                            arrayList.add(ikVar.f9088e);
                        }
                        MiPushCommandMessage generateCommandMessage = PushMessageHelper.generateCommandMessage(C4678ey.COMMAND_REGISTER.f8040a, arrayList, ikVar.f9076a, ikVar.f9087d, (String) null, ikVar.mo29678a());
                        C4465ao.m12646a(this.f7443a).mo28676d();
                        return generateCommandMessage;
                    }
                    C4408b.m12464a("The received registration result has expired.");
                    C4667eo.m13689a(this.f7443a).mo29055b(this.f7443a.getPackageName(), C4665en.m13673a(i), str8, "26");
                    return null;
                case 3:
                    if (ifVar.mo29567b()) {
                        if (((C4794iq) a3).f9211a == 0) {
                            C4475b.m12705a(this.f7443a).mo28684a();
                            MiPushClient.clearExtras(this.f7443a);
                        }
                        PushMessageHandler.mo28523a();
                        break;
                    } else {
                        C4408b.m12483d("receiving an un-encrypt message(UnRegistration).");
                        return null;
                    }
                case 4:
                    C4792io ioVar = (C4792io) a3;
                    if (ioVar.f9165a == 0) {
                        MiPushClient.addTopic(this.f7443a, ioVar.mo29760b());
                    }
                    if (!TextUtils.isEmpty(ioVar.mo29760b())) {
                        arrayList = new ArrayList();
                        arrayList.add(ioVar.mo29760b());
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("resp-cmd:");
                    C4678ey eyVar = C4678ey.COMMAND_SUBSCRIBE_TOPIC;
                    sb.append(eyVar);
                    sb.append(", ");
                    sb.append(ioVar.mo29758a());
                    C4408b.m12484e(sb.toString());
                    return PushMessageHelper.generateCommandMessage(eyVar.f8040a, arrayList, ioVar.f9165a, ioVar.f9171d, ioVar.mo29761c(), (List<String>) null);
                case 5:
                    C4796is isVar = (C4796is) a3;
                    if (isVar.f9248a == 0) {
                        MiPushClient.removeTopic(this.f7443a, isVar.mo29834b());
                    }
                    if (!TextUtils.isEmpty(isVar.mo29834b())) {
                        arrayList = new ArrayList();
                        arrayList.add(isVar.mo29834b());
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("resp-cmd:");
                    C4678ey eyVar2 = C4678ey.COMMAND_UNSUBSCRIBE_TOPIC;
                    sb2.append(eyVar2);
                    sb2.append(", ");
                    sb2.append(isVar.mo29832a());
                    C4408b.m12484e(sb2.toString());
                    return PushMessageHelper.generateCommandMessage(eyVar2.f8040a, arrayList, isVar.f9248a, isVar.f9254d, isVar.mo29835c(), (List<String>) null);
                case 6:
                    C4610db.m13287a(this.f7443a.getPackageName(), this.f7443a, a3, C4760hj.Command, bArr2.length);
                    C4782ie ieVar = (C4782ie) a3;
                    String b = ieVar.mo29543b();
                    List<String> a12 = ieVar.mo29541a();
                    if (ieVar.f8927a == 0) {
                        if (TextUtils.equals(b, C4678ey.COMMAND_SET_ACCEPT_TIME.f8040a) && a12 != null && a12.size() > 1) {
                            MiPushClient.addAcceptTime(this.f7443a, a12.get(0), a12.get(1));
                            if (!"00:00".equals(a12.get(0)) || !"00:00".equals(a12.get(1))) {
                                C4475b.m12705a(this.f7443a).mo28689a(false);
                            } else {
                                C4475b.m12705a(this.f7443a).mo28689a(true);
                            }
                            a12 = mo28652a(TimeZone.getTimeZone("GMT+08"), TimeZone.getDefault(), a12);
                        } else if (TextUtils.equals(b, C4678ey.COMMAND_SET_ALIAS.f8040a) && a12 != null && a12.size() > 0) {
                            MiPushClient.addAlias(this.f7443a, a12.get(0));
                        } else if (TextUtils.equals(b, C4678ey.COMMAND_UNSET_ALIAS.f8040a) && a12 != null && a12.size() > 0) {
                            MiPushClient.removeAlias(this.f7443a, a12.get(0));
                        } else if (TextUtils.equals(b, C4678ey.COMMAND_SET_ACCOUNT.f8040a) && a12 != null && a12.size() > 0) {
                            MiPushClient.addAccount(this.f7443a, a12.get(0));
                        } else if (TextUtils.equals(b, C4678ey.COMMAND_UNSET_ACCOUNT.f8040a) && a12 != null && a12.size() > 0) {
                            MiPushClient.removeAccount(this.f7443a, a12.get(0));
                        } else if (TextUtils.equals(b, C4678ey.COMMAND_CHK_VDEVID.f8040a)) {
                            return null;
                        }
                    }
                    List<String> list = a12;
                    C4408b.m12484e("resp-cmd:" + b + ", " + ieVar.mo29541a());
                    return PushMessageHelper.generateCommandMessage(b, list, ieVar.f8927a, ieVar.f8935d, ieVar.mo29545c(), (List<String>) null);
                case 7:
                    C4610db.m13287a(this.f7443a.getPackageName(), this.f7443a, a3, C4760hj.Notification, bArr2.length);
                    if (!(a3 instanceof C4778ia)) {
                        if (a3 instanceof C4786ii) {
                            C4786ii iiVar = (C4786ii) a3;
                            if (!"registration id expired".equalsIgnoreCase(iiVar.f8988d)) {
                                if (!C4770ht.ClientInfoUpdateOk.f8718a.equalsIgnoreCase(iiVar.f8988d)) {
                                    if (!C4770ht.AwakeApp.f8718a.equalsIgnoreCase(iiVar.f8988d)) {
                                        if (!C4770ht.NormalClientConfigUpdate.f8718a.equalsIgnoreCase(iiVar.f8988d)) {
                                            if (!C4770ht.CustomClientConfigUpdate.f8718a.equalsIgnoreCase(iiVar.f8988d)) {
                                                if (!C4770ht.SyncInfoResult.f8718a.equalsIgnoreCase(iiVar.f8988d)) {
                                                    if (!C4770ht.ForceSync.f8718a.equalsIgnoreCase(iiVar.f8988d)) {
                                                        if (!C4770ht.CancelPushMessage.f8718a.equals(iiVar.f8988d)) {
                                                            if (!C4770ht.HybridRegisterResult.f8718a.equals(iiVar.f8988d)) {
                                                                if (!C4770ht.HybridUnregisterResult.f8718a.equals(iiVar.f8988d)) {
                                                                    if (!C4770ht.PushLogUpload.f8718a.equals(iiVar.f8988d)) {
                                                                        if (!C4770ht.DetectAppAlive.f8718a.equals(iiVar.f8988d)) {
                                                                            if (C4964i.m15558a(iiVar)) {
                                                                                C4408b.m12481b("receive notification handle by cpra");
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            C4408b.m12481b("receive detect msg");
                                                                            m12637b(iiVar);
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    C4794iq iqVar = new C4794iq();
                                                                    C4797it.m14833a(iqVar, iiVar.mo29592a());
                                                                    MiPushClient4Hybrid.onReceiveUnregisterResult(this.f7443a, iqVar);
                                                                    break;
                                                                }
                                                            } else {
                                                                try {
                                                                    C4788ik ikVar2 = new C4788ik();
                                                                    C4797it.m14833a(ikVar2, iiVar.mo29592a());
                                                                    MiPushClient4Hybrid.onReceiveRegisterResult(this.f7443a, ikVar2);
                                                                    break;
                                                                } catch (C4804iz e) {
                                                                    C4408b.m12478a((Throwable) e);
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            C4408b.m12484e("resp-type:" + iiVar.f8988d + ", " + iiVar.mo29592a());
                                                            if (iiVar.mo29592a() != null) {
                                                                int i5 = -2;
                                                                if (iiVar.mo29592a().containsKey(C4916bk.f9577M)) {
                                                                    String str10 = (String) iiVar.mo29592a().get(C4916bk.f9577M);
                                                                    if (!TextUtils.isEmpty(str10)) {
                                                                        try {
                                                                            i5 = Integer.parseInt(str10);
                                                                        } catch (NumberFormatException e2) {
                                                                            e2.printStackTrace();
                                                                        }
                                                                    }
                                                                }
                                                                if (i5 >= -1) {
                                                                    MiPushClient.clearNotification(this.f7443a, i5);
                                                                } else {
                                                                    String str11 = "";
                                                                    String str12 = "";
                                                                    if (iiVar.mo29592a().containsKey(C4916bk.f9575K)) {
                                                                        str11 = (String) iiVar.mo29592a().get(C4916bk.f9575K);
                                                                    }
                                                                    if (iiVar.mo29592a().containsKey(C4916bk.f9576L)) {
                                                                        str12 = (String) iiVar.mo29592a().get(C4916bk.f9576L);
                                                                    }
                                                                    MiPushClient.clearNotification(this.f7443a, str11, str12);
                                                                }
                                                            }
                                                            m12630a(iiVar);
                                                            break;
                                                        }
                                                    } else {
                                                        C4408b.m12464a("receive force sync notification");
                                                        C4473av.m12701a(this.f7443a, false);
                                                        break;
                                                    }
                                                } else {
                                                    C4473av.m12700a(this.f7443a, iiVar);
                                                    break;
                                                }
                                            } else {
                                                C4784ig igVar = new C4784ig();
                                                C4797it.m14833a(igVar, iiVar.mo29592a());
                                                C4900bb.m15378a(C4898ba.m15362a(this.f7443a), igVar);
                                                break;
                                            }
                                        } else {
                                            C4785ih ihVar = new C4785ih();
                                            try {
                                                C4797it.m14833a(ihVar, iiVar.mo29592a());
                                                C4900bb.m15379a(C4898ba.m15362a(this.f7443a), ihVar);
                                                break;
                                            } catch (C4804iz unused) {
                                                break;
                                            }
                                        }
                                    } else if (ifVar.mo29567b() && iiVar.mo29592a() != null && iiVar.mo29592a().containsKey("awake_info")) {
                                        Context context3 = this.f7443a;
                                        C4490o.m12800a(context3, C4475b.m12705a(context3).mo28684a(), C4898ba.m15362a(this.f7443a).mo29988a(C4765ho.AwakeInfoUploadWaySwitch.mo29322a(), 0), (String) iiVar.mo29592a().get("awake_info"));
                                        break;
                                    }
                                } else if (iiVar.mo29592a() != null && iiVar.mo29592a().containsKey(Constants.EXTRA_KEY_APP_VERSION)) {
                                    C4475b.m12705a(this.f7443a).mo28685a((String) iiVar.mo29592a().get(Constants.EXTRA_KEY_APP_VERSION));
                                    break;
                                }
                            } else {
                                List<String> allAlias = MiPushClient.getAllAlias(this.f7443a);
                                List<String> allTopic = MiPushClient.getAllTopic(this.f7443a);
                                List<String> allUserAccount = MiPushClient.getAllUserAccount(this.f7443a);
                                String acceptTime = MiPushClient.getAcceptTime(this.f7443a);
                                C4408b.m12484e("resp-type:" + iiVar.f8988d + ", " + iiVar.mo29592a());
                                MiPushClient.reInitialize(this.f7443a, C4774hx.RegIdExpired);
                                for (String next : allAlias) {
                                    MiPushClient.removeAlias(this.f7443a, next);
                                    MiPushClient.setAlias(this.f7443a, next, (String) null);
                                }
                                for (String next2 : allTopic) {
                                    MiPushClient.removeTopic(this.f7443a, next2);
                                    MiPushClient.subscribe(this.f7443a, next2, (String) null);
                                }
                                for (String next3 : allUserAccount) {
                                    MiPushClient.removeAccount(this.f7443a, next3);
                                    MiPushClient.setUserAccount(this.f7443a, next3, (String) null);
                                }
                                String[] split = acceptTime.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                if (split.length == 2) {
                                    MiPushClient.removeAcceptTime(this.f7443a);
                                    MiPushClient.addAcceptTime(this.f7443a, split[0], split[1]);
                                    break;
                                }
                            }
                        }
                    } else {
                        C4778ia iaVar = (C4778ia) a3;
                        String a13 = iaVar.mo29480a();
                        C4408b.m12484e("resp-type:" + iaVar.mo29483b() + ", code:" + iaVar.f8874a + ", " + a13);
                        if (!C4770ht.DisablePushMessage.f8718a.equalsIgnoreCase(iaVar.f8881d)) {
                            if (!C4770ht.EnablePushMessage.f8718a.equalsIgnoreCase(iaVar.f8881d)) {
                                if (!C4770ht.ThirdPartyRegUpdate.f8718a.equalsIgnoreCase(iaVar.f8881d)) {
                                    if (C4770ht.UploadTinyData.f8718a.equalsIgnoreCase(iaVar.f8881d)) {
                                        m12628a(iaVar);
                                        break;
                                    }
                                } else {
                                    m12635b(iaVar);
                                    break;
                                }
                            } else if (iaVar.f8874a != 0) {
                                if ("syncing".equals(C4456af.m12606a(this.f7443a).mo28646a(C4472au.ENABLE_PUSH))) {
                                    synchronized (cls) {
                                        if (C4456af.m12606a(this.f7443a).mo28645a(a13)) {
                                            if (C4456af.m12606a(this.f7443a).mo28645a(a13) < 10) {
                                                C4456af.m12606a(this.f7443a).mo28648b(a13);
                                                C4465ao.m12646a(this.f7443a).mo28672a(false, a13);
                                            } else {
                                                C4456af.m12606a(this.f7443a).mo28649c(a13);
                                            }
                                        }
                                    }
                                    break;
                                }
                            } else {
                                synchronized (cls) {
                                    if (C4456af.m12606a(this.f7443a).mo28645a(a13)) {
                                        C4456af.m12606a(this.f7443a).mo28649c(a13);
                                        C4456af a14 = C4456af.m12606a(this.f7443a);
                                        C4472au auVar = C4472au.ENABLE_PUSH;
                                        if ("syncing".equals(a14.mo28646a(auVar))) {
                                            C4456af.m12606a(this.f7443a).mo28647a(auVar, "synced");
                                        }
                                    }
                                }
                                break;
                            }
                        } else if (iaVar.f8874a != 0) {
                            if ("syncing".equals(C4456af.m12606a(this.f7443a).mo28646a(C4472au.DISABLE_PUSH))) {
                                synchronized (cls) {
                                    if (C4456af.m12606a(this.f7443a).mo28645a(a13)) {
                                        if (C4456af.m12606a(this.f7443a).mo28645a(a13) < 10) {
                                            C4456af.m12606a(this.f7443a).mo28648b(a13);
                                            C4465ao.m12646a(this.f7443a).mo28672a(true, a13);
                                        } else {
                                            C4456af.m12606a(this.f7443a).mo28649c(a13);
                                        }
                                    }
                                }
                                break;
                            }
                        } else {
                            synchronized (cls) {
                                if (C4456af.m12606a(this.f7443a).mo28645a(a13)) {
                                    C4456af.m12606a(this.f7443a).mo28649c(a13);
                                    C4456af a15 = C4456af.m12606a(this.f7443a);
                                    C4472au auVar2 = C4472au.DISABLE_PUSH;
                                    if ("syncing".equals(a15.mo28646a(auVar2))) {
                                        C4456af.m12606a(this.f7443a).mo28647a(auVar2, "synced");
                                        MiPushClient.clearNotification(this.f7443a);
                                        MiPushClient.clearLocalNotificationType(this.f7443a);
                                        PushMessageHandler.mo28523a();
                                        C4465ao.m12646a(this.f7443a).mo28673b();
                                    }
                                }
                            }
                            break;
                        }
                        C4456af.m12606a(this.f7443a).mo28649c(a13);
                        break;
                    }
                    break;
            }
            return null;
        } catch (C4496u e3) {
            C4408b.m12478a((Throwable) e3);
            m12629a(ifVar);
            a = C4667eo.m13689a(this.f7443a);
            packageName = this.f7443a.getPackageName();
            a2 = C4665en.m13673a(i);
            str2 = "19";
            a.mo29055b(packageName, a2, str8, str2);
            C4494s.m12809c(this.f7443a, ifVar2, z2);
            return null;
        } catch (C4804iz e4) {
            C4408b.m12478a((Throwable) e4);
            C4408b.m12483d("receive a message which action string is not valid. is the reg expired?");
            a = C4667eo.m13689a(this.f7443a);
            packageName = this.f7443a.getPackageName();
            a2 = C4665en.m13673a(i);
            str2 = "20";
            a.mo29055b(packageName, a2, str8, str2);
            C4494s.m12809c(this.f7443a, ifVar2, z2);
            return null;
        }
    }

    /* renamed from: a */
    private PushMessageHandler.C4449a m12624a(C4783if ifVar, byte[] bArr) {
        String str;
        String str2 = null;
        try {
            C4798iu a = C4459ai.m12617a(this.f7443a, ifVar);
            if (a == null) {
                C4408b.m12483d("message arrived: receiving an un-recognized message. " + ifVar.f8947a);
                return null;
            }
            C4760hj a2 = ifVar.mo29558a();
            C4408b.m12464a("message arrived: processing an arrived message, action=" + a2);
            if (C4464an.f7444a[a2.ordinal()] != 1) {
                return null;
            }
            if (!ifVar.mo29567b()) {
                str = "message arrived: receiving an un-encrypt message(SendMessage).";
            } else {
                C4790im imVar = (C4790im) a;
                C4772hv a3 = imVar.mo29722a();
                if (a3 == null) {
                    str = "message arrived: receive an empty message without push content, drop it";
                } else {
                    C4773hw hwVar = ifVar.f8948a;
                    if (!(hwVar == null || hwVar.mo29392a() == null)) {
                        str2 = ifVar.f8948a.f8791a.get("jobkey");
                    }
                    MiPushMessage generateMessage = PushMessageHelper.generateMessage(imVar, ifVar.mo29558a(), false);
                    generateMessage.setArrivedMessage(true);
                    C4408b.m12464a("message arrived: receive a message, msgid=" + a3.mo29366a() + ", jobkey=" + str2);
                    return generateMessage;
                }
            }
            C4408b.m12483d(str);
            return null;
        } catch (C4496u e) {
            C4408b.m12478a((Throwable) e);
            str = "message arrived: receive a message but decrypt failed. report when click.";
        } catch (C4804iz e2) {
            C4408b.m12478a((Throwable) e2);
            str = "message arrived: receive a message which action string is not valid. is the reg expired?";
        }
    }

    /* renamed from: a */
    public static C4463am m12625a(Context context) {
        if (f7440a == null) {
            f7440a = new C4463am(context);
        }
        return f7440a;
    }

    /* renamed from: a */
    private void m12626a() {
        SharedPreferences sharedPreferences = this.f7443a.getSharedPreferences("mipush_extra", 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - sharedPreferences.getLong(Constants.SP_KEY_LAST_REINITIALIZE, 0)) > 1800000) {
            MiPushClient.reInitialize(this.f7443a, C4774hx.PackageUnregistered);
            sharedPreferences.edit().putLong(Constants.SP_KEY_LAST_REINITIALIZE, currentTimeMillis).commit();
        }
    }

    /* renamed from: a */
    public static void m12627a(Context context, String str) {
        synchronized (f7441a) {
            f7442a.remove(str);
            C4475b.m12705a(context);
            SharedPreferences a = C4475b.m12705a(context);
            String a2 = C4561bp.m13044a((Collection<?>) f7442a, Constants.ACCEPT_TIME_SEPARATOR_SP);
            SharedPreferences.Editor edit = a.edit();
            edit.putString("pref_msg_ids", a2);
            C4992t.m15731a(edit);
        }
    }

    /* renamed from: a */
    private void m12628a(C4778ia iaVar) {
        String a = iaVar.mo29480a();
        C4408b.m12481b("receive ack " + a);
        Map a2 = iaVar.mo29480a();
        if (a2 != null) {
            String str = (String) a2.get("real_source");
            if (!TextUtils.isEmpty(str)) {
                C4408b.m12481b("receive ack : messageId = " + a + "  realSource = " + str);
                C4569bx.m13076a(this.f7443a).mo28795a(a, str, Boolean.valueOf(iaVar.f8874a == 0));
            }
        }
    }

    /* renamed from: a */
    private void m12629a(C4783if ifVar) {
        C4408b.m12464a("receive a message but decrypt failed. report now.");
        C4786ii iiVar = new C4786ii(ifVar.mo29558a().f8789a, false);
        iiVar.mo29602c(C4770ht.DecryptMessageFail.f8718a);
        iiVar.mo29599b(ifVar.mo29558a());
        iiVar.mo29606d(ifVar.f8954b);
        HashMap hashMap = new HashMap();
        iiVar.f8983a = hashMap;
        hashMap.put("regid", MiPushClient.getRegId(this.f7443a));
        C4465ao.m12646a(this.f7443a).mo28663a(iiVar, C4760hj.Notification, false, (C4773hw) null);
    }

    /* renamed from: a */
    private void m12630a(C4786ii iiVar) {
        C4778ia iaVar = new C4778ia();
        iaVar.mo29484c(C4770ht.CancelPushMessageACK.f8718a);
        iaVar.mo29479a(iiVar.mo29592a());
        iaVar.mo29478a(iiVar.mo29592a());
        iaVar.mo29482b(iiVar.mo29600b());
        iaVar.mo29489e(iiVar.mo29603c());
        iaVar.mo29477a(0);
        iaVar.mo29487d("success clear push message.");
        C4465ao.m12646a(this.f7443a).mo28667a(iaVar, C4760hj.Notification, false, true, (C4773hw) null, false, this.f7443a.getPackageName(), C4475b.m12705a(this.f7443a).mo28684a(), false);
    }

    /* renamed from: a */
    private void m12631a(C4790im imVar, C4783if ifVar) {
        C4773hw a = ifVar.mo29558a();
        if (a != null) {
            a = C4925br.m15458a(a.mo29392a());
        }
        C4776hz hzVar = new C4776hz();
        hzVar.mo29446b(imVar.mo29724b());
        hzVar.mo29442a(imVar.mo29722a());
        hzVar.mo29441a(imVar.mo29722a().mo29366a());
        if (!TextUtils.isEmpty(imVar.mo29725c())) {
            hzVar.mo29449c(imVar.mo29725c());
        }
        if (!TextUtils.isEmpty(imVar.mo29727d())) {
            hzVar.mo29453d(imVar.mo29727d());
        }
        hzVar.mo29443a(C4797it.m14831a(this.f7443a, ifVar));
        C4465ao.m12646a(this.f7443a).mo28661a(hzVar, C4760hj.AckMessage, a);
    }

    /* renamed from: a */
    private void m12632a(String str, long j, C4479e eVar) {
        Class<C4456af> cls = C4456af.class;
        C4472au a = C4486l.m12787a(eVar);
        if (a != null) {
            if (j == 0) {
                synchronized (cls) {
                    if (C4456af.m12606a(this.f7443a).mo28645a(str)) {
                        C4456af.m12606a(this.f7443a).mo28649c(str);
                        if ("syncing".equals(C4456af.m12606a(this.f7443a).mo28646a(a))) {
                            C4456af.m12606a(this.f7443a).mo28647a(a, "synced");
                        }
                    }
                }
            } else if ("syncing".equals(C4456af.m12606a(this.f7443a).mo28646a(a))) {
                synchronized (cls) {
                    if (C4456af.m12606a(this.f7443a).mo28645a(str)) {
                        if (C4456af.m12606a(this.f7443a).mo28645a(str) < 10) {
                            C4456af.m12606a(this.f7443a).mo28648b(str);
                            C4465ao.m12646a(this.f7443a).mo28669a(str, a, eVar);
                        } else {
                            C4456af.m12606a(this.f7443a).mo28649c(str);
                        }
                    }
                }
            } else {
                C4456af.m12606a(this.f7443a).mo28649c(str);
            }
        }
    }

    /* renamed from: a */
    private static boolean m12633a(Context context, String str) {
        synchronized (f7441a) {
            C4475b.m12705a(context);
            SharedPreferences a = C4475b.m12705a(context);
            if (f7442a == null) {
                String[] split = a.getString("pref_msg_ids", "").split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                f7442a = new LinkedList();
                for (String add : split) {
                    f7442a.add(add);
                }
            }
            if (f7442a.contains(str)) {
                return true;
            }
            f7442a.add(str);
            if (f7442a.size() > 25) {
                f7442a.poll();
            }
            String a2 = C4561bp.m13044a((Collection<?>) f7442a, Constants.ACCEPT_TIME_SEPARATOR_SP);
            SharedPreferences.Editor edit = a.edit();
            edit.putString("pref_msg_ids", a2);
            C4992t.m15731a(edit);
            return false;
        }
    }

    /* renamed from: a */
    private boolean m12634a(C4783if ifVar) {
        Map a = ifVar.mo29558a() == null ? null : ifVar.mo29558a().mo29392a();
        if (a == null) {
            return false;
        }
        String str = (String) a.get(Constants.EXTRA_KEY_PUSH_SERVER_ACTION);
        return TextUtils.equals(str, Constants.EXTRA_VALUE_HYBRID_MESSAGE) || TextUtils.equals(str, Constants.EXTRA_VALUE_PLATFORM_MESSAGE);
    }

    /* renamed from: b */
    private void m12635b(C4778ia iaVar) {
        Context context;
        C4479e eVar;
        C4408b.m12482c("ASSEMBLE_PUSH : " + iaVar.toString());
        String a = iaVar.mo29480a();
        Map a2 = iaVar.mo29480a();
        if (a2 != null) {
            String str = (String) a2.get(Constants.ASSEMBLE_PUSH_REG_INFO);
            if (!TextUtils.isEmpty(str)) {
                if (str.contains("brand:" + C4457ag.FCM.name())) {
                    C4408b.m12464a("ASSEMBLE_PUSH : receive fcm token sync ack");
                    context = this.f7443a;
                    eVar = C4479e.ASSEMBLE_PUSH_FCM;
                } else {
                    if (str.contains("brand:" + C4457ag.HUAWEI.name())) {
                        C4408b.m12464a("ASSEMBLE_PUSH : receive hw token sync ack");
                        context = this.f7443a;
                        eVar = C4479e.ASSEMBLE_PUSH_HUAWEI;
                    } else {
                        if (str.contains("brand:" + C4457ag.OPPO.name())) {
                            C4408b.m12464a("ASSEMBLE_PUSH : receive COS token sync ack");
                            context = this.f7443a;
                            eVar = C4479e.ASSEMBLE_PUSH_COS;
                        } else {
                            if (str.contains("brand:" + C4457ag.VIVO.name())) {
                                C4408b.m12464a("ASSEMBLE_PUSH : receive FTOS token sync ack");
                                context = this.f7443a;
                                eVar = C4479e.ASSEMBLE_PUSH_FTOS;
                            } else {
                                return;
                            }
                        }
                    }
                }
                C4483i.m12782b(context, eVar, str);
                m12632a(a, iaVar.f8874a, eVar);
            }
        }
    }

    /* renamed from: b */
    private void m12636b(C4783if ifVar) {
        C4773hw a = ifVar.mo29558a();
        if (a != null) {
            a = C4925br.m15458a(a.mo29392a());
        }
        C4776hz hzVar = new C4776hz();
        hzVar.mo29446b(ifVar.mo29558a());
        hzVar.mo29442a(a.mo29392a());
        hzVar.mo29441a(a.mo29392a());
        if (!TextUtils.isEmpty(a.mo29399b())) {
            hzVar.mo29449c(a.mo29399b());
        }
        hzVar.mo29443a(C4797it.m14831a(this.f7443a, ifVar));
        C4465ao.m12646a(this.f7443a).mo28663a(hzVar, C4760hj.AckMessage, false, a);
    }

    /* renamed from: b */
    private void m12637b(C4786ii iiVar) {
        String str;
        Map a = iiVar.mo29592a();
        if (a == null) {
            str = "detect failed because null";
        } else {
            String str2 = (String) C4894ay.m15344a((Object) a, "pkgList", null);
            if (TextUtils.isEmpty(str2)) {
                str = "detect failed because empty";
            } else {
                try {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f7443a.getSystemService("activity")).getRunningAppProcesses();
                    if (!C4995w.m15747a((Collection<?>) runningAppProcesses)) {
                        String[] split = str2.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                        HashMap hashMap = new HashMap();
                        for (String split2 : split) {
                            String[] split3 = split2.split(Constants.WAVE_SEPARATOR);
                            if (split3.length >= 2) {
                                hashMap.put(split3[1], split3[0]);
                            }
                        }
                        C4995w.C4996a aVar = new C4995w.C4996a(Constants.WAVE_SEPARATOR, Constants.ACCEPT_TIME_SEPARATOR_SP);
                        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                            if (hashMap.containsKey(next.processName)) {
                                aVar.mo30094a((String) hashMap.get(next.processName), String.valueOf(next.importance));
                                hashMap.remove(next.processName);
                            }
                        }
                        if (aVar.toString().length() > 0) {
                            C4786ii iiVar2 = new C4786ii();
                            iiVar2.mo29593a(iiVar.mo29592a());
                            iiVar2.mo29599b(iiVar.mo29600b());
                            iiVar2.mo29606d(iiVar.mo29603c());
                            iiVar2.mo29602c(C4770ht.DetectAppAliveResult.f8718a);
                            HashMap hashMap2 = new HashMap();
                            iiVar2.f8983a = hashMap2;
                            hashMap2.put("alive", aVar.toString());
                            if (Boolean.parseBoolean((String) C4894ay.m15344a((Object) a, "reportNotAliveApp", "false")) && hashMap.size() > 0) {
                                C4995w.C4996a aVar2 = new C4995w.C4996a("", Constants.ACCEPT_TIME_SEPARATOR_SP);
                                for (String str3 : hashMap.keySet()) {
                                    aVar2.mo30094a((String) hashMap.get(str3), "");
                                }
                                iiVar2.f8983a.put("notAlive", aVar2.toString());
                            }
                            C4465ao.m12646a(this.f7443a).mo28663a(iiVar2, C4760hj.Notification, false, (C4773hw) null);
                            return;
                        }
                        C4408b.m12481b("detect failed because no alive process");
                        return;
                    }
                    C4408b.m12464a("detect failed because params illegal");
                    return;
                } catch (Throwable th) {
                    C4408b.m12464a("detect failed " + th);
                    return;
                }
            }
        }
        C4408b.m12464a(str);
    }

    /* renamed from: a */
    public PushMessageHandler.C4449a mo28651a(Intent intent) {
        String str;
        String str2;
        String str3;
        C4667eo eoVar;
        C4667eo a;
        String packageName;
        String format;
        Intent intent2 = intent;
        String action = intent.getAction();
        C4408b.m12464a("receive an intent from server, action=" + action);
        String stringExtra = intent2.getStringExtra("mrt");
        if (stringExtra == null) {
            stringExtra = Long.toString(System.currentTimeMillis());
        }
        String stringExtra2 = intent2.getStringExtra("messageId");
        int intExtra = intent2.getIntExtra("eventMessageType", -1);
        if ("com.xiaomi.mipush.RECEIVE_MESSAGE".equals(action)) {
            byte[] byteArrayExtra = intent2.getByteArrayExtra("mipush_payload");
            boolean booleanExtra = intent2.getBooleanExtra("mipush_notified", false);
            if (byteArrayExtra == null) {
                C4408b.m12483d("receiving an empty message, drop");
                C4667eo.m13689a(this.f7443a).mo29051a(this.f7443a.getPackageName(), intent2, "12");
                return null;
            }
            C4783if ifVar = new C4783if();
            try {
                C4797it.m14833a(ifVar, byteArrayExtra);
                C4475b a2 = C4475b.m12705a(this.f7443a);
                C4773hw a3 = ifVar.mo29558a();
                C4760hj a4 = ifVar.mo29558a();
                C4760hj hjVar = C4760hj.SendMessage;
                if (a4 == hjVar && a3 != null && !a2.mo28696e() && !booleanExtra) {
                    a3.mo29397a("mrt", stringExtra);
                    a3.mo29397a("mat", Long.toString(System.currentTimeMillis()));
                    if (!m12629a(ifVar)) {
                        m12636b(ifVar);
                    } else {
                        C4408b.m12481b("this is a mina's message, ack later");
                        a3.mo29397a(Constants.EXTRA_KEY_HYBRID_MESSAGE_TS, String.valueOf(a3.mo29392a()));
                        a3.mo29397a(Constants.EXTRA_KEY_HYBRID_DEVICE_STATUS, String.valueOf(C4797it.m14831a(this.f7443a, ifVar)));
                    }
                }
                String str4 = "";
                if (ifVar.mo29558a() == hjVar) {
                    if (!ifVar.mo29567b()) {
                        if (C4874al.m15226a(ifVar)) {
                            Object[] objArr = new Object[2];
                            objArr[0] = ifVar.mo29567b();
                            if (a3 != null) {
                                str4 = a3.mo29392a();
                            }
                            objArr[1] = str4;
                            C4408b.m12464a(String.format("drop an un-encrypted wake-up messages. %1$s, %2$s", objArr));
                            a = C4667eo.m13689a(this.f7443a);
                            packageName = this.f7443a.getPackageName();
                            format = String.format("13: %1$s", new Object[]{ifVar.mo29567b()});
                        } else {
                            Object[] objArr2 = new Object[2];
                            objArr2[0] = ifVar.mo29567b();
                            if (a3 != null) {
                                str4 = a3.mo29392a();
                            }
                            objArr2[1] = str4;
                            C4408b.m12464a(String.format("drop an un-encrypted messages. %1$s, %2$s", objArr2));
                            a = C4667eo.m13689a(this.f7443a);
                            packageName = this.f7443a.getPackageName();
                            format = String.format("14: %1$s", new Object[]{ifVar.mo29567b()});
                        }
                        a.mo29051a(packageName, intent2, format);
                        C4494s.m12806a(this.f7443a, ifVar, booleanExtra);
                        return null;
                    }
                }
                if (ifVar.mo29558a() == hjVar && ifVar.mo29567b() && C4874al.m15226a(ifVar)) {
                    if (!booleanExtra || a3 == null || a3.mo29392a() == null || !a3.mo29392a().containsKey("notify_effect")) {
                        Object[] objArr3 = new Object[2];
                        objArr3[0] = ifVar.mo29567b();
                        if (a3 != null) {
                            str4 = a3.mo29392a();
                        }
                        objArr3[1] = str4;
                        C4408b.m12464a(String.format("drop a wake-up messages which not has 'notify_effect' attr. %1$s, %2$s", objArr3));
                        C4667eo.m13689a(this.f7443a).mo29051a(this.f7443a.getPackageName(), intent2, String.format("25: %1$s", new Object[]{ifVar.mo29567b()}));
                        C4494s.m12808b(this.f7443a, ifVar, booleanExtra);
                        return null;
                    }
                }
                if (a2.mo28694c() || ifVar.f8947a == C4760hj.Registration) {
                    if (!a2.mo28694c() || !a2.mo28697f()) {
                        return m12623a(ifVar, booleanExtra, byteArrayExtra, stringExtra2, intExtra, intent);
                    }
                    if (ifVar.f8947a != C4760hj.UnRegistration) {
                        C4494s.m12811e(this.f7443a, ifVar, booleanExtra);
                        MiPushClient.unregisterPush(this.f7443a);
                    } else if (ifVar.mo29567b()) {
                        a2.mo28684a();
                        MiPushClient.clearExtras(this.f7443a);
                        PushMessageHandler.mo28523a();
                    } else {
                        C4408b.m12483d("receiving an un-encrypt unregistration message");
                    }
                } else if (C4874al.m15226a(ifVar)) {
                    return m12623a(ifVar, booleanExtra, byteArrayExtra, stringExtra2, intExtra, intent);
                } else {
                    C4494s.m12811e(this.f7443a, ifVar, booleanExtra);
                    boolean d = a2.mo28695d();
                    C4408b.m12483d("receive message without registration. need re-register!registered?" + d);
                    C4667eo.m13689a(this.f7443a).mo29051a(this.f7443a.getPackageName(), intent2, "15");
                    if (d) {
                        m12626a();
                    }
                }
            } catch (C4804iz e) {
                e = e;
                eoVar = C4667eo.m13689a(this.f7443a);
                str3 = this.f7443a.getPackageName();
                str2 = "16";
                eoVar.mo29051a(str3, intent2, str2);
                C4408b.m12478a(e);
                return null;
            } catch (Exception e2) {
                e = e2;
                eoVar = C4667eo.m13689a(this.f7443a);
                str3 = this.f7443a.getPackageName();
                str2 = "17";
                eoVar.mo29051a(str3, intent2, str2);
                C4408b.m12478a(e);
                return null;
            }
        } else if ("com.xiaomi.mipush.ERROR".equals(action)) {
            MiPushCommandMessage miPushCommandMessage = new MiPushCommandMessage();
            C4783if ifVar2 = new C4783if();
            try {
                byte[] byteArrayExtra2 = intent2.getByteArrayExtra("mipush_payload");
                if (byteArrayExtra2 != null) {
                    C4797it.m14833a(ifVar2, byteArrayExtra2);
                }
            } catch (C4804iz unused) {
            }
            miPushCommandMessage.setCommand(String.valueOf(ifVar2.mo29558a()));
            miPushCommandMessage.setResultCode((long) intent2.getIntExtra("mipush_error_code", 0));
            miPushCommandMessage.setReason(intent2.getStringExtra("mipush_error_msg"));
            C4408b.m12483d("receive a error message. code = " + intent2.getIntExtra("mipush_error_code", 0) + ", msg= " + intent2.getStringExtra("mipush_error_msg"));
            return miPushCommandMessage;
        } else if ("com.xiaomi.mipush.MESSAGE_ARRIVED".equals(action)) {
            byte[] byteArrayExtra3 = intent2.getByteArrayExtra("mipush_payload");
            if (byteArrayExtra3 == null) {
                C4408b.m12483d("message arrived: receiving an empty message, drop");
                return null;
            }
            C4783if ifVar3 = new C4783if();
            try {
                C4797it.m14833a(ifVar3, byteArrayExtra3);
                C4475b a5 = C4475b.m12705a(this.f7443a);
                if (C4874al.m15226a(ifVar3)) {
                    str = "message arrived: receive ignore reg message, ignore!";
                } else if (!a5.mo28694c()) {
                    str = "message arrived: receive message without registration. need unregister or re-register!";
                } else if (!a5.mo28694c() || !a5.mo28697f()) {
                    return m12624a(ifVar3, byteArrayExtra3);
                } else {
                    str = "message arrived: app info is invalidated";
                }
                C4408b.m12483d(str);
            } catch (Exception e3) {
                C4408b.m12483d("fail to deal with arrived message. " + e3);
            }
        }
        return null;
    }

    /* renamed from: a */
    public List<String> mo28652a(TimeZone timeZone, TimeZone timeZone2, List<String> list) {
        List<String> list2 = list;
        if (timeZone.equals(timeZone2)) {
            return list2;
        }
        long rawOffset = (long) (((timeZone.getRawOffset() - timeZone2.getRawOffset()) / 1000) / 60);
        long parseLong = Long.parseLong(list2.get(0).split(Constants.COLON_SEPARATOR)[0]);
        long parseLong2 = Long.parseLong(list2.get(0).split(Constants.COLON_SEPARATOR)[1]);
        long j = ((((parseLong * 60) + parseLong2) - rawOffset) + 1440) % 1440;
        long parseLong3 = ((((Long.parseLong(list2.get(1).split(Constants.COLON_SEPARATOR)[0]) * 60) + Long.parseLong(list2.get(1).split(Constants.COLON_SEPARATOR)[1])) - rawOffset) + 1440) % 1440;
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.format("%1$02d:%2$02d", new Object[]{Long.valueOf(j / 60), Long.valueOf(j % 60)}));
        arrayList.add(String.format("%1$02d:%2$02d", new Object[]{Long.valueOf(parseLong3 / 60), Long.valueOf(parseLong3 % 60)}));
        return arrayList;
    }
}

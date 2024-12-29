package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.miot.common.ReturnCode;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4596df;
import com.xiaomi.push.C4662fb;
import com.xiaomi.push.C4673fl;
import com.xiaomi.push.C4689g;
import com.xiaomi.push.C4694gd;
import com.xiaomi.push.C4697gg;
import com.xiaomi.push.C4700gi;
import com.xiaomi.push.C4701gj;
import com.xiaomi.push.C4718gx;
import com.xiaomi.push.C4739hm;
import com.xiaomi.push.C4749hw;
import com.xiaomi.push.C4752hz;
import com.xiaomi.push.C4756ic;
import com.xiaomi.push.C4762ii;
import com.xiaomi.push.C4765il;
import com.xiaomi.push.C4776iw;
import com.xiaomi.push.C4777ix;
import com.xiaomi.push.C4937t;
import com.xiaomi.push.service.C4837aa;
import com.xiaomi.push.service.C4860ap;
import com.xiaomi.push.service.XMPushService;
import com.yeelight.yeelib.p150c.p183m.C7230s;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.xiaomi.push.service.p */
public class C4925p {
    /* renamed from: a */
    public static Intent m15816a(byte[] bArr, long j) {
        C4762ii a = m15818a(bArr);
        if (a == null) {
            return null;
        }
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.putExtra("mipush_payload", bArr);
        intent.putExtra("mrt", Long.toString(j));
        intent.setPackage(a.f9495b);
        return intent;
    }

    /* renamed from: a */
    public static C4762ii m15817a(Context context, C4762ii iiVar) {
        C4756ic icVar = new C4756ic();
        icVar.mo25415b(iiVar.mo25521a());
        C4752hz a = iiVar.mo25521a();
        if (a != null) {
            icVar.mo25411a(a.mo25361a());
            icVar.mo25410a(a.mo25361a());
            if (!TextUtils.isEmpty(a.mo25368b())) {
                icVar.mo25418c(a.mo25368b());
            }
        }
        icVar.mo25412a(C4776iw.m15223a(context, iiVar));
        C4762ii a2 = C4933w.m15854a(iiVar.mo25530b(), iiVar.mo25521a(), icVar, C4739hm.AckMessage);
        C4752hz a3 = iiVar.mo25521a().mo25361a();
        a3.mo25366a("mat", Long.toString(System.currentTimeMillis()));
        a2.mo25523a(a3);
        return a2;
    }

    /* renamed from: a */
    public static C4762ii m15818a(byte[] bArr) {
        C4762ii iiVar = new C4762ii();
        try {
            C4776iw.m15224a(iiVar, bArr);
            return iiVar;
        } catch (Throwable th) {
            C3989b.m10678a(th);
            return null;
        }
    }

    /* renamed from: a */
    private static void m15819a(XMPushService xMPushService, C4762ii iiVar) {
        xMPushService.mo25871a((XMPushService.C4827i) new C4926q(4, xMPushService, iiVar));
    }

    /* renamed from: a */
    private static void m15820a(XMPushService xMPushService, C4762ii iiVar, String str) {
        xMPushService.mo25871a((XMPushService.C4827i) new C4931u(4, xMPushService, iiVar, str));
    }

    /* renamed from: a */
    private static void m15821a(XMPushService xMPushService, C4762ii iiVar, String str, String str2) {
        xMPushService.mo25871a((XMPushService.C4827i) new C4932v(4, xMPushService, iiVar, str, str2));
    }

    /* renamed from: a */
    public static void m15822a(XMPushService xMPushService, String str, byte[] bArr, Intent intent) {
        C4662fb a;
        String b;
        String a2;
        int i;
        String str2;
        String str3;
        C4662fb a3;
        String b2;
        String b3;
        String a4;
        String str4;
        boolean z;
        XMPushService xMPushService2 = xMPushService;
        byte[] bArr2 = bArr;
        Intent intent2 = intent;
        C4762ii a5 = m15818a(bArr);
        C4752hz a6 = a5.mo25521a();
        String str5 = null;
        if (bArr2 != null) {
            C4596df.m13712a(a5.mo25530b(), xMPushService.getApplicationContext(), (C4777ix) null, a5.mo25521a(), bArr2.length);
        }
        if (m15831c(a5) && m15825a((Context) xMPushService, str)) {
            if (C4837aa.m15528e(a5)) {
                C4662fb.m14151a(xMPushService.getApplicationContext()).mo25063a(a5.mo25530b(), C4837aa.m15520b(a5), a6.mo25361a(), "5");
            }
            m15830c(xMPushService2, a5);
        } else if (m15826a(a5) && !m15825a((Context) xMPushService, str) && !m15829b(a5)) {
            if (C4837aa.m15528e(a5)) {
                C4662fb.m14151a(xMPushService.getApplicationContext()).mo25063a(a5.mo25530b(), C4837aa.m15520b(a5), a6.mo25361a(), "6");
            }
            m15832d(xMPushService2, a5);
        } else if ((C4837aa.m15505a(a5) && C4689g.m14357b((Context) xMPushService2, a5.f9495b)) || m15824a((Context) xMPushService2, intent2)) {
            if (C4739hm.Registration == a5.mo25521a()) {
                String b4 = a5.mo25530b();
                SharedPreferences.Editor edit = xMPushService2.getSharedPreferences("pref_registered_pkg_names", 0).edit();
                edit.putString(b4, a5.f9491a);
                edit.commit();
                C4662fb.m14151a(xMPushService.getApplicationContext()).mo25062a(b4, "E100003", a6.mo25361a(), 6003, (String) null);
                if (!TextUtils.isEmpty(a6.mo25361a())) {
                    intent2.putExtra("messageId", a6.mo25361a());
                    intent2.putExtra("eventMessageType", 6000);
                }
            }
            if (C4837aa.m15526c(a5)) {
                C4662fb.m14151a(xMPushService.getApplicationContext()).mo25061a(a5.mo25530b(), C4837aa.m15520b(a5), a6.mo25361a(), 1001, System.currentTimeMillis(), (String) null);
                if (!TextUtils.isEmpty(a6.mo25361a())) {
                    intent2.putExtra("messageId", a6.mo25361a());
                    intent2.putExtra("eventMessageType", 1000);
                }
            }
            if (C4837aa.m15520b(a5)) {
                C4662fb.m14151a(xMPushService.getApplicationContext()).mo25061a(a5.mo25530b(), C4837aa.m15520b(a5), a6.mo25361a(), ReturnCode.E_ACTION_NOT_SUPPORT, System.currentTimeMillis(), (String) null);
                if (!TextUtils.isEmpty(a6.mo25361a())) {
                    intent2.putExtra("messageId", a6.mo25361a());
                    intent2.putExtra("eventMessageType", 2000);
                }
            }
            if (C4837aa.m15505a(a5)) {
                C4662fb.m14151a(xMPushService.getApplicationContext()).mo25061a(a5.mo25530b(), C4837aa.m15520b(a5), a6.mo25361a(), ReturnCode.E_SERVICE_NOT_BOUND, System.currentTimeMillis(), (String) null);
                if (!TextUtils.isEmpty(a6.mo25361a())) {
                    intent2.putExtra("messageId", a6.mo25361a());
                    intent2.putExtra("eventMessageType", PathInterpolatorCompat.MAX_NUM_POINTS);
                }
            }
            if (a6 != null && !TextUtils.isEmpty(a6.mo25373c()) && !TextUtils.isEmpty(a6.mo25379d()) && a6.f9327b != 1 && (C4837aa.m15490a((Map<String, String>) a6.mo25361a()) || !C4837aa.m15488a((Context) xMPushService2, a5.f9495b))) {
                if (a6 != null) {
                    Map<String, String> map = a6.f9325a;
                    if (map != null) {
                        str5 = map.get("jobkey");
                    }
                    if (TextUtils.isEmpty(str5)) {
                        str5 = a6.mo25361a();
                    }
                    z = C4842ac.m15531a(xMPushService2, a5.f9495b, str5);
                } else {
                    z = false;
                }
                if (z) {
                    C4662fb a7 = C4662fb.m14151a(xMPushService.getApplicationContext());
                    String b5 = a5.mo25530b();
                    String b6 = C4837aa.m15520b(a5);
                    String a8 = a6.mo25361a();
                    a7.mo25065c(b5, b6, a8, "1:" + str5);
                    C3989b.m10669a("drop a duplicate message, key=" + str5);
                } else {
                    C4837aa.C4840c a9 = C4837aa.m15501a((Context) xMPushService2, a5, bArr2);
                    if (a9.f9943a > 0 && !TextUtils.isEmpty(a9.f9944a)) {
                        C4718gx.m14478a(xMPushService, a9.f9944a, a9.f9943a, true, false, System.currentTimeMillis());
                    }
                    if (!C4837aa.m15505a(a5)) {
                        Intent intent3 = new Intent("com.xiaomi.mipush.MESSAGE_ARRIVED");
                        intent3.putExtra("mipush_payload", bArr2);
                        intent3.setPackage(a5.f9495b);
                        try {
                            List<ResolveInfo> queryBroadcastReceivers = xMPushService.getPackageManager().queryBroadcastReceivers(intent3, 0);
                            if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
                                xMPushService2.sendBroadcast(intent3, C4933w.m15856a(a5.f9495b));
                            }
                        } catch (Exception unused) {
                            xMPushService2.sendBroadcast(intent3, C4933w.m15856a(a5.f9495b));
                            C4662fb.m14151a(xMPushService.getApplicationContext()).mo25064b(a5.mo25530b(), C4837aa.m15520b(a5), a6.mo25361a(), TimerCodec.ENABLE);
                        }
                    }
                }
                m15828b(xMPushService2, a5);
            } else if ("com.xiaomi.xmsf".contains(a5.f9495b) && !a5.mo25530b() && a6 != null && a6.mo25361a() != null && a6.mo25361a().containsKey("ab")) {
                m15828b(xMPushService2, a5);
                C3989b.m10680c("receive abtest message. ack it." + a6.mo25361a());
            } else if (m15827a(xMPushService2, str, a5, a6)) {
                if (a6 != null && !TextUtils.isEmpty(a6.mo25361a())) {
                    if (C4837aa.m15520b(a5)) {
                        a = C4662fb.m14151a(xMPushService.getApplicationContext());
                        b = a5.mo25530b();
                        str3 = C4837aa.m15520b(a5);
                        a2 = a6.mo25361a();
                        i = 2002;
                        str2 = null;
                    } else {
                        if (C4837aa.m15505a(a5)) {
                            a3 = C4662fb.m14151a(xMPushService.getApplicationContext());
                            b2 = a5.mo25530b();
                            b3 = C4837aa.m15520b(a5);
                            a4 = a6.mo25361a();
                            str4 = "7";
                        } else if (C4837aa.m15526c(a5)) {
                            a3 = C4662fb.m14151a(xMPushService.getApplicationContext());
                            b2 = a5.mo25530b();
                            b3 = C4837aa.m15520b(a5);
                            a4 = a6.mo25361a();
                            str4 = "8";
                        } else if (C4837aa.m15527d(a5)) {
                            a = C4662fb.m14151a(xMPushService.getApplicationContext());
                            b = a5.mo25530b();
                            a2 = a6.mo25361a();
                            i = 6004;
                            str2 = null;
                            str3 = "E100003";
                        }
                        a3.mo25063a(b2, b3, a4, str4);
                    }
                    a.mo25062a(b, str3, a2, i, str2);
                }
                xMPushService2.sendBroadcast(intent2, C4933w.m15856a(a5.f9495b));
            } else {
                C4662fb.m14151a(xMPushService.getApplicationContext()).mo25063a(a5.mo25530b(), C4837aa.m15520b(a5), a6.mo25361a(), "9");
            }
            if (a5.mo25521a() == C4739hm.UnRegistration && !"com.xiaomi.xmsf".equals(xMPushService.getPackageName())) {
                xMPushService.stopSelf();
            }
        } else if (!C4689g.m14357b((Context) xMPushService2, a5.f9495b)) {
            if (C4837aa.m15528e(a5)) {
                C4662fb.m14151a(xMPushService.getApplicationContext()).mo25064b(a5.mo25530b(), C4837aa.m15520b(a5), a6.mo25361a(), "2");
            }
            m15819a(xMPushService2, a5);
        } else {
            C3989b.m10669a("receive a mipush message, we can see the app, but we can't see the receiver.");
            if (C4837aa.m15528e(a5)) {
                C4662fb.m14151a(xMPushService.getApplicationContext()).mo25064b(a5.mo25530b(), C4837aa.m15520b(a5), a6.mo25361a(), "3");
            }
        }
    }

    /* renamed from: a */
    private static void m15823a(XMPushService xMPushService, byte[] bArr, long j) {
        Map a;
        C4762ii a2 = m15818a(bArr);
        if (a2 != null) {
            if (TextUtils.isEmpty(a2.f9495b)) {
                C3989b.m10669a("receive a mipush message without package name");
                return;
            }
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            Intent a3 = m15816a(bArr, valueOf.longValue());
            String a4 = C4837aa.m15505a(a2);
            C4718gx.m14478a(xMPushService, a4, j, true, true, System.currentTimeMillis());
            C4752hz a5 = a2.mo25521a();
            if (a5 != null) {
                a5.mo25366a("mrt", Long.toString(valueOf.longValue()));
            }
            String str = "";
            if (C4739hm.SendMessage == a2.mo25521a() && C4922m.m15798a((Context) xMPushService).mo25992a(a2.f9495b) && !C4837aa.m15505a(a2)) {
                if (a5 != null) {
                    str = a5.mo25361a();
                    if (C4837aa.m15528e(a2)) {
                        C4662fb.m14151a(xMPushService.getApplicationContext()).mo25063a(a2.mo25530b(), C4837aa.m15520b(a2), str, TimerCodec.ENABLE);
                    }
                }
                C3989b.m10669a("Drop a message for unregistered, msgid=" + str);
                m15820a(xMPushService, a2, a2.f9495b);
            } else if (C4739hm.SendMessage == a2.mo25521a() && C4922m.m15798a((Context) xMPushService).mo25994c(a2.f9495b) && !C4837aa.m15505a(a2)) {
                if (a5 != null) {
                    str = a5.mo25361a();
                    if (C4837aa.m15528e(a2)) {
                        C4662fb.m14151a(xMPushService.getApplicationContext()).mo25063a(a2.mo25530b(), C4837aa.m15520b(a2), str, "2");
                    }
                }
                C3989b.m10669a("Drop a message for push closed, msgid=" + str);
                m15820a(xMPushService, a2, a2.f9495b);
            } else if (C4739hm.SendMessage != a2.mo25521a() || TextUtils.equals(xMPushService.getPackageName(), "com.xiaomi.xmsf") || TextUtils.equals(xMPushService.getPackageName(), a2.f9495b)) {
                if (!(a5 == null || a5.mo25361a() == null)) {
                    C3989b.m10669a(String.format("receive a message, appid=%1$s, msgid= %2$s", new Object[]{a2.mo25521a(), a5.mo25361a()}));
                }
                if (a5 == null || (a = a5.mo25361a()) == null || !a.containsKey("hide") || !"true".equalsIgnoreCase((String) a.get("hide"))) {
                    if (!(a5 == null || a5.mo25361a() == null || !a5.mo25361a().containsKey("__miid"))) {
                        String str2 = (String) a5.mo25361a().get("__miid");
                        String a6 = C4937t.m15869a(xMPushService.getApplicationContext());
                        if (TextUtils.isEmpty(a6) || !TextUtils.equals(str2, a6)) {
                            if (C4837aa.m15528e(a2)) {
                                C4662fb.m14151a(xMPushService.getApplicationContext()).mo25063a(a2.mo25530b(), C4837aa.m15520b(a2), a5.mo25361a(), "4");
                            }
                            C3989b.m10669a(str2 + " should be login, but got " + a6);
                            m15821a(xMPushService, a2, "miid already logout or anther already login", str2 + " should be login, but got " + a6);
                            return;
                        }
                    }
                    m15822a(xMPushService, a4, bArr, a3);
                    return;
                }
                m15828b(xMPushService, a2);
            } else {
                C3989b.m10669a("Receive a message with wrong package name, expect " + xMPushService.getPackageName() + ", received " + a2.f9495b);
                m15821a(xMPushService, a2, "unmatched_package", "package should be " + xMPushService.getPackageName() + ", but got " + a2.f9495b);
                if (a5 != null && C4837aa.m15528e(a2)) {
                    C4662fb.m14151a(xMPushService.getApplicationContext()).mo25063a(a2.mo25530b(), C4837aa.m15520b(a2), a5.mo25361a(), "3");
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m15824a(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            return queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty();
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: a */
    private static boolean m15825a(Context context, String str) {
        Intent intent = new Intent("com.xiaomi.mipush.miui.CLICK_MESSAGE");
        intent.setPackage(str);
        Intent intent2 = new Intent("com.xiaomi.mipush.miui.RECEIVE_MESSAGE");
        intent2.setPackage(str);
        PackageManager packageManager = context.getPackageManager();
        try {
            return !packageManager.queryBroadcastReceivers(intent2, 32).isEmpty() || !packageManager.queryIntentServices(intent, 32).isEmpty();
        } catch (Exception e) {
            C3989b.m10678a((Throwable) e);
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m15826a(C4762ii iiVar) {
        return "com.xiaomi.xmsf".equals(iiVar.f9495b) && iiVar.mo25521a() != null && iiVar.mo25521a().mo25361a() != null && iiVar.mo25521a().mo25361a().containsKey("miui_package_name");
    }

    /* renamed from: a */
    private static boolean m15827a(XMPushService xMPushService, String str, C4762ii iiVar, C4752hz hzVar) {
        boolean z = true;
        if (hzVar != null && hzVar.mo25361a() != null && hzVar.mo25361a().containsKey("__check_alive") && hzVar.mo25361a().containsKey("__awake")) {
            C4765il ilVar = new C4765il();
            ilVar.mo25562b(iiVar.mo25521a());
            ilVar.mo25569d(str);
            ilVar.mo25565c(C4749hw.AwakeSystemApp.f9252a);
            ilVar.mo25555a(hzVar.mo25361a());
            ilVar.f9524a = new HashMap();
            boolean a = C4689g.m14350a(xMPushService.getApplicationContext(), str);
            ilVar.f9524a.put("app_running", Boolean.toString(a));
            if (!a) {
                boolean parseBoolean = Boolean.parseBoolean((String) hzVar.mo25361a().get("__awake"));
                ilVar.f9524a.put("awaked", Boolean.toString(parseBoolean));
                if (!parseBoolean) {
                    z = false;
                }
            }
            try {
                C4933w.m15858a(xMPushService, C4933w.m15854a(iiVar.mo25530b(), iiVar.mo25521a(), ilVar, C4739hm.Notification));
            } catch (C4694gd e) {
                C3989b.m10678a((Throwable) e);
            }
        }
        return z;
    }

    /* renamed from: b */
    private static void m15828b(XMPushService xMPushService, C4762ii iiVar) {
        xMPushService.mo25871a((XMPushService.C4827i) new C4927r(4, xMPushService, iiVar));
    }

    /* renamed from: b */
    private static boolean m15829b(C4762ii iiVar) {
        Map a = iiVar.mo25521a().mo25361a();
        return a != null && a.containsKey("notify_effect");
    }

    /* renamed from: c */
    private static void m15830c(XMPushService xMPushService, C4762ii iiVar) {
        xMPushService.mo25871a((XMPushService.C4827i) new C4929s(4, xMPushService, iiVar));
    }

    /* renamed from: c */
    private static boolean m15831c(C4762ii iiVar) {
        if (iiVar.mo25521a() == null || iiVar.mo25521a().mo25361a() == null) {
            return false;
        }
        return TimerCodec.ENABLE.equals(iiVar.mo25521a().mo25361a().get("obslete_ads_message"));
    }

    /* renamed from: d */
    private static void m15832d(XMPushService xMPushService, C4762ii iiVar) {
        xMPushService.mo25871a((XMPushService.C4827i) new C4930t(4, xMPushService, iiVar));
    }

    /* renamed from: a */
    public void mo25998a(Context context, C4860ap.C4862b bVar, boolean z, int i, String str) {
        C4919k a;
        if (!z && (a = C4920l.m15789a(context)) != null && "token-expired".equals(str)) {
            try {
                C4920l.m15790a(context, a.f10163f, a.f10161d, a.f10162e);
            } catch (IOException | JSONException e) {
                C3989b.m10678a(e);
            }
        }
    }

    /* renamed from: a */
    public void mo25999a(XMPushService xMPushService, C4673fl flVar, C4860ap.C4862b bVar) {
        try {
            m15823a(xMPushService, flVar.mo25116a(bVar.f9999h), (long) flVar.mo25122c());
        } catch (IllegalArgumentException e) {
            C3989b.m10678a((Throwable) e);
        }
    }

    /* renamed from: a */
    public void mo26000a(XMPushService xMPushService, C4701gj gjVar, C4860ap.C4862b bVar) {
        if (gjVar instanceof C4700gi) {
            C4700gi giVar = (C4700gi) gjVar;
            C4697gg a = giVar.mo25191a(C7230s.f14753G);
            if (a != null) {
                try {
                    m15823a(xMPushService, C4877ay.m15653a(C4877ay.m15652a(bVar.f9999h, giVar.mo25214j()), a.mo25183c()), (long) C4718gx.m14470a(gjVar.mo25186a()));
                } catch (IllegalArgumentException e) {
                    C3989b.m10678a((Throwable) e);
                }
            }
        } else {
            C3989b.m10669a("not a mipush message");
        }
    }
}

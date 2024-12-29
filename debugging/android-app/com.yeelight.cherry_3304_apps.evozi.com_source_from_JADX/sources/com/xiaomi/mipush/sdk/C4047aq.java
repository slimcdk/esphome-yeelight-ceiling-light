package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4521az;
import com.xiaomi.push.C4531be;
import com.xiaomi.push.C4596df;
import com.xiaomi.push.C4662fb;
import com.xiaomi.push.C4739hm;
import com.xiaomi.push.C4740hn;
import com.xiaomi.push.C4743hq;
import com.xiaomi.push.C4744hr;
import com.xiaomi.push.C4749hw;
import com.xiaomi.push.C4752hz;
import com.xiaomi.push.C4762ii;
import com.xiaomi.push.C4765il;
import com.xiaomi.push.C4766im;
import com.xiaomi.push.C4772is;
import com.xiaomi.push.C4776iw;
import com.xiaomi.push.C4777ix;
import com.xiaomi.push.C4808l;
import com.xiaomi.push.service.C4854ak;
import com.xiaomi.push.service.C4858an;
import com.xiaomi.push.service.C4870at;
import com.xiaomi.push.service.C4875aw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.xiaomi.mipush.sdk.aq */
public class C4047aq {

    /* renamed from: a */
    private static C4047aq f6880a = null;

    /* renamed from: a */
    private static final ArrayList<C4048a> f6881a = new ArrayList<>();

    /* renamed from: b */
    private static boolean f6882b = false;

    /* renamed from: a */
    private Context f6883a;

    /* renamed from: a */
    private Intent f6884a = null;

    /* renamed from: a */
    private Handler f6885a = null;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Messenger f6886a;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Integer f6887a = null;

    /* renamed from: a */
    private String f6888a;

    /* renamed from: a */
    private List<Message> f6889a = new ArrayList();

    /* renamed from: a */
    private boolean f6890a = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f6891c = false;

    /* renamed from: com.xiaomi.mipush.sdk.aq$a */
    static class C4048a<T extends C4777ix<T, ?>> {

        /* renamed from: a */
        C4739hm f6892a;

        /* renamed from: a */
        T f6893a;

        /* renamed from: a */
        boolean f6894a;

        C4048a() {
        }
    }

    private C4047aq(Context context) {
        this.f6883a = context.getApplicationContext();
        this.f6888a = null;
        this.f6890a = mo22922c();
        f6882b = mo22923d();
        this.f6885a = new C4049ar(this, Looper.getMainLooper());
        Intent b = mo22920b();
        if (b != null) {
            m10844b(b);
        }
    }

    /* renamed from: a */
    private synchronized int mo22903a() {
        return this.f6883a.getSharedPreferences("mipush_extra", 0).getInt(Constants.EXTRA_KEY_BOOT_SERVICE_MODE, -1);
    }

    /* renamed from: a */
    private Intent m10831a() {
        return (!mo22903a() || "com.xiaomi.xmsf".equals(this.f6883a.getPackageName())) ? mo22924e() : mo22923d();
    }

    /* renamed from: a */
    private Message mo22906a(Intent intent) {
        Message obtain = Message.obtain();
        obtain.what = 17;
        obtain.obj = intent;
        return obtain;
    }

    /* renamed from: a */
    public static synchronized C4047aq m10835a(Context context) {
        C4047aq aqVar;
        synchronized (C4047aq.class) {
            if (f6880a == null) {
                f6880a = new C4047aq(context);
            }
            aqVar = f6880a;
        }
        return aqVar;
    }

    /* renamed from: a */
    private String m10838a() {
        try {
            return this.f6883a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 106 ? "com.xiaomi.push.service.XMPushService" : "com.xiaomi.xmsf.push.service.XMPushService";
        } catch (Exception unused) {
            return "com.xiaomi.xmsf.push.service.XMPushService";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10841a(String str, C4053av avVar, boolean z, HashMap<String, String> hashMap) {
        C4765il ilVar;
        String str2;
        if (C4056b.m10888a(this.f6883a).mo22937b() && C4521az.m13366b(this.f6883a)) {
            C4765il ilVar2 = new C4765il();
            ilVar2.mo25558a(true);
            Intent a = mo22903a();
            if (TextUtils.isEmpty(str)) {
                str = C4858an.m15586a();
                ilVar2.mo25555a(str);
                ilVar = z ? new C4765il(str, true) : null;
                synchronized (C4037ag.class) {
                    C4037ag.m10796a(this.f6883a).mo22894a(str);
                }
            } else {
                ilVar2.mo25555a(str);
                ilVar = z ? new C4765il(str, true) : null;
            }
            switch (C4052au.f6898a[avVar.ordinal()]) {
                case 1:
                    ilVar2.mo25565c(C4749hw.DisablePushMessage.f9252a);
                    ilVar.mo25565c(C4749hw.DisablePushMessage.f9252a);
                    if (hashMap != null) {
                        ilVar2.mo25557a((Map<String, String>) hashMap);
                        ilVar.mo25557a((Map<String, String>) hashMap);
                    }
                    str2 = "com.xiaomi.mipush.DISABLE_PUSH_MESSAGE";
                    break;
                case 2:
                    ilVar2.mo25565c(C4749hw.EnablePushMessage.f9252a);
                    ilVar.mo25565c(C4749hw.EnablePushMessage.f9252a);
                    if (hashMap != null) {
                        ilVar2.mo25557a((Map<String, String>) hashMap);
                        ilVar.mo25557a((Map<String, String>) hashMap);
                    }
                    str2 = "com.xiaomi.mipush.ENABLE_PUSH_MESSAGE";
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    ilVar2.mo25565c(C4749hw.ThirdPartyRegUpdate.f9252a);
                    if (hashMap != null) {
                        ilVar2.mo25557a((Map<String, String>) hashMap);
                        break;
                    }
                    break;
            }
            a.setAction(str2);
            ilVar2.mo25562b(C4056b.m10888a(this.f6883a).mo22930a());
            ilVar2.mo25569d(this.f6883a.getPackageName());
            mo22912a(ilVar2, C4739hm.Notification, false, (C4752hz) null);
            if (z) {
                ilVar.mo25562b(C4056b.m10888a(this.f6883a).mo22930a());
                ilVar.mo25569d(this.f6883a.getPackageName());
                Context context = this.f6883a;
                byte[] a2 = C4776iw.m15225a(C4040aj.m10805a(context, ilVar, C4739hm.Notification, false, context.getPackageName(), C4056b.m10888a(this.f6883a).mo22930a()));
                if (a2 != null) {
                    C4596df.m13712a(this.f6883a.getPackageName(), this.f6883a, ilVar, C4739hm.Notification, a2.length);
                    a.putExtra("mipush_payload", a2);
                    a.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
                    a.putExtra("mipush_app_id", C4056b.m10888a(this.f6883a).mo22930a());
                    a.putExtra("mipush_app_token", C4056b.m10888a(this.f6883a).mo22937b());
                    m10847c(a);
                }
            }
            Message obtain = Message.obtain();
            obtain.what = 19;
            int ordinal = avVar.ordinal();
            obtain.obj = str;
            obtain.arg1 = ordinal;
            this.f6885a.sendMessageDelayed(obtain, 5000);
        }
    }

    /* renamed from: b */
    private Intent mo22920b() {
        if (!"com.xiaomi.xmsf".equals(this.f6883a.getPackageName())) {
            return mo22922c();
        }
        C3989b.m10680c("pushChannel xmsf create own channel");
        return mo22924e();
    }

    /* renamed from: b */
    private void m10844b(Intent intent) {
        try {
            if (C4808l.m15356a() || Build.VERSION.SDK_INT < 26) {
                this.f6883a.startService(intent);
            } else {
                m10850d(intent);
            }
        } catch (Exception e) {
            C3989b.m10678a((Throwable) e);
        }
    }

    /* renamed from: c */
    private Intent mo22922c() {
        if (mo22903a()) {
            C3989b.m10680c("pushChannel app start miui china channel");
            return mo22923d();
        }
        C3989b.m10680c("pushChannel app start  own channel");
        return mo22924e();
    }

    /* renamed from: c */
    private synchronized void m10846c(int i) {
        this.f6883a.getSharedPreferences("mipush_extra", 0).edit().putInt(Constants.EXTRA_KEY_BOOT_SERVICE_MODE, i).commit();
    }

    /* renamed from: c */
    private void m10847c(Intent intent) {
        int a = C4854ak.m15568a(this.f6883a).mo25906a(C4744hr.ServiceBootMode.mo25291a(), C4740hn.START.mo25254a());
        int a2 = mo22903a();
        boolean z = a == C4740hn.BIND.mo25254a() && f6882b;
        int a3 = (z ? C4740hn.BIND : C4740hn.START).mo25254a();
        if (a3 != a2) {
            mo22904a(a3);
        }
        if (z) {
            m10850d(intent);
        } else {
            m10844b(intent);
        }
    }

    /* renamed from: c */
    private boolean m10848c() {
        try {
            PackageInfo packageInfo = this.f6883a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
            return packageInfo != null && packageInfo.versionCode >= 105;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: d */
    private Intent mo22923d() {
        Intent intent = new Intent();
        String packageName = this.f6883a.getPackageName();
        intent.setPackage("com.xiaomi.xmsf");
        intent.setClassName("com.xiaomi.xmsf", mo22903a());
        intent.putExtra("mipush_app_package", packageName);
        m10854f();
        return intent;
    }

    /* renamed from: d */
    private synchronized void m10850d(Intent intent) {
        if (this.f6891c) {
            Message a = mo22906a(intent);
            if (this.f6889a.size() >= 50) {
                this.f6889a.remove(0);
            }
            this.f6889a.add(a);
            return;
        } else if (this.f6886a == null) {
            this.f6883a.bindService(intent, new C4051at(this), 1);
            this.f6891c = true;
            this.f6889a.clear();
            this.f6889a.add(mo22906a(intent));
        } else {
            try {
                this.f6886a.send(mo22906a(intent));
            } catch (RemoteException unused) {
                this.f6886a = null;
                this.f6891c = false;
            }
        }
    }

    /* renamed from: d */
    private boolean m10851d() {
        if (mo22903a()) {
            try {
                return this.f6883a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 108;
            } catch (Exception unused) {
            }
        }
        return true;
    }

    /* renamed from: e */
    private Intent mo22924e() {
        Intent intent = new Intent();
        String packageName = this.f6883a.getPackageName();
        m10855g();
        intent.setComponent(new ComponentName(this.f6883a, "com.xiaomi.push.service.XMPushService"));
        intent.putExtra("mipush_app_package", packageName);
        return intent;
    }

    /* renamed from: e */
    private boolean m10853e() {
        String packageName = this.f6883a.getPackageName();
        return packageName.contains("miui") || packageName.contains("xiaomi") || (this.f6883a.getApplicationInfo().flags & 1) != 0;
    }

    /* renamed from: f */
    private void m10854f() {
        try {
            PackageManager packageManager = this.f6883a.getPackageManager();
            ComponentName componentName = new ComponentName(this.f6883a, "com.xiaomi.push.service.XMPushService");
            if (packageManager.getComponentEnabledSetting(componentName) != 2) {
                packageManager.setComponentEnabledSetting(componentName, 2, 1);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: g */
    private void m10855g() {
        try {
            PackageManager packageManager = this.f6883a.getPackageManager();
            ComponentName componentName = new ComponentName(this.f6883a, "com.xiaomi.push.service.XMPushService");
            if (packageManager.getComponentEnabledSetting(componentName) != 1) {
                packageManager.setComponentEnabledSetting(componentName, 1, 1);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void m10856a() {
        m10844b(mo22903a());
    }

    /* renamed from: a */
    public void mo22904a(int i) {
        Intent a = mo22903a();
        a.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        a.putExtra(C4870at.f10051z, this.f6883a.getPackageName());
        a.putExtra(C4870at.f10016A, i);
        m10847c(a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo22905a(int i, String str) {
        Intent a = mo22903a();
        a.setAction("com.xiaomi.mipush.thirdparty");
        a.putExtra("com.xiaomi.mipush.thirdparty_LEVEL", i);
        a.putExtra("com.xiaomi.mipush.thirdparty_DESC", str);
        m10844b(a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void m10859a(Intent intent) {
        intent.fillIn(mo22903a(), 24);
        m10847c(intent);
    }

    /* renamed from: a */
    public final void mo22907a(C4743hq hqVar) {
        Intent a = mo22903a();
        byte[] a2 = C4776iw.m15225a(hqVar);
        if (a2 == null) {
            C3989b.m10669a("send TinyData failed, because tinyDataBytes is null.");
            return;
        }
        a.setAction("com.xiaomi.mipush.SEND_TINYDATA");
        a.putExtra("mipush_payload", a2);
        m10844b(a);
    }

    /* renamed from: a */
    public final void mo22908a(C4766im imVar, boolean z) {
        C4662fb.m14151a(this.f6883a.getApplicationContext()).mo25062a(this.f6883a.getPackageName(), "E100003", imVar.mo25591a(), 6001, (String) null);
        this.f6884a = null;
        C4056b.m10888a(this.f6883a).f6911a = imVar.mo25591a();
        Intent a = mo22903a();
        byte[] a2 = C4776iw.m15225a(C4040aj.m10804a(this.f6883a, imVar, C4739hm.Registration));
        if (a2 == null) {
            C3989b.m10669a("register fail, because msgBytes is null.");
            return;
        }
        a.setAction("com.xiaomi.mipush.REGISTER_APP");
        a.putExtra("mipush_app_id", C4056b.m10888a(this.f6883a).mo22930a());
        a.putExtra("mipush_payload", a2);
        a.putExtra("mipush_session", this.f6888a);
        a.putExtra("mipush_env_chanage", z);
        a.putExtra("mipush_env_type", C4056b.m10888a(this.f6883a).mo22930a());
        if (!C4521az.m13366b(this.f6883a) || !mo22920b()) {
            this.f6884a = a;
        } else {
            m10847c(a);
        }
    }

    /* renamed from: a */
    public final void mo22909a(C4772is isVar) {
        byte[] a = C4776iw.m15225a(C4040aj.m10804a(this.f6883a, isVar, C4739hm.UnRegistration));
        if (a == null) {
            C3989b.m10669a("unregister fail, because msgBytes is null.");
            return;
        }
        Intent a2 = mo22903a();
        a2.setAction("com.xiaomi.mipush.UNREGISTER_APP");
        a2.putExtra("mipush_app_id", C4056b.m10888a(this.f6883a).mo22930a());
        a2.putExtra("mipush_payload", a);
        m10847c(a2);
    }

    /* renamed from: a */
    public final <T extends C4777ix<T, ?>> void mo22910a(T t, C4739hm hmVar, C4752hz hzVar) {
        mo22912a(t, hmVar, !hmVar.equals(C4739hm.Registration), hzVar);
    }

    /* renamed from: a */
    public <T extends C4777ix<T, ?>> void mo22911a(T t, C4739hm hmVar, boolean z) {
        C4048a aVar = new C4048a();
        aVar.f6893a = t;
        aVar.f6892a = hmVar;
        aVar.f6894a = z;
        synchronized (f6881a) {
            f6881a.add(aVar);
            if (f6881a.size() > 10) {
                f6881a.remove(0);
            }
        }
    }

    /* renamed from: a */
    public final <T extends C4777ix<T, ?>> void mo22912a(T t, C4739hm hmVar, boolean z, C4752hz hzVar) {
        mo22914a(t, hmVar, z, true, hzVar, true);
    }

    /* renamed from: a */
    public final <T extends C4777ix<T, ?>> void mo22913a(T t, C4739hm hmVar, boolean z, C4752hz hzVar, boolean z2) {
        mo22914a(t, hmVar, z, true, hzVar, z2);
    }

    /* renamed from: a */
    public final <T extends C4777ix<T, ?>> void mo22914a(T t, C4739hm hmVar, boolean z, boolean z2, C4752hz hzVar, boolean z3) {
        mo22915a(t, hmVar, z, z2, hzVar, z3, this.f6883a.getPackageName(), C4056b.m10888a(this.f6883a).mo22930a());
    }

    /* renamed from: a */
    public final <T extends C4777ix<T, ?>> void mo22915a(T t, C4739hm hmVar, boolean z, boolean z2, C4752hz hzVar, boolean z3, String str, String str2) {
        if (C4056b.m10888a(this.f6883a).mo22940c()) {
            C4762ii a = C4040aj.m10805a(this.f6883a, t, hmVar, z, str, str2);
            if (hzVar != null) {
                a.mo25523a(hzVar);
            }
            byte[] a2 = C4776iw.m15225a(a);
            if (a2 == null) {
                C3989b.m10669a("send message fail, because msgBytes is null.");
                return;
            }
            C4596df.m13712a(this.f6883a.getPackageName(), this.f6883a, t, hmVar, a2.length);
            Intent a3 = mo22903a();
            a3.setAction("com.xiaomi.mipush.SEND_MESSAGE");
            a3.putExtra("mipush_payload", a2);
            a3.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", z3);
            m10847c(a3);
        } else if (z2) {
            mo22911a(t, hmVar, z);
        } else {
            C3989b.m10669a("drop the message before initialization.");
        }
    }

    /* renamed from: a */
    public final void mo22916a(String str, C4053av avVar, C4059d dVar) {
        C4037ag.m10796a(this.f6883a).mo22896a(avVar, "syncing");
        m10841a(str, avVar, false, C4063h.m10946a(this.f6883a, dVar));
    }

    /* renamed from: a */
    public void mo22917a(String str, String str2) {
        Intent a = mo22903a();
        a.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        a.putExtra(C4870at.f10051z, this.f6883a.getPackageName());
        a.putExtra(C4870at.f10020E, str);
        a.putExtra(C4870at.f10021F, str2);
        m10847c(a);
    }

    /* renamed from: a */
    public final void mo22918a(boolean z) {
        mo22919a(z, (String) null);
    }

    /* renamed from: a */
    public final void mo22919a(boolean z, String str) {
        C4053av avVar;
        if (z) {
            C4037ag.m10796a(this.f6883a).mo22896a(C4053av.DISABLE_PUSH, "syncing");
            C4037ag.m10796a(this.f6883a).mo22896a(C4053av.ENABLE_PUSH, "");
            avVar = C4053av.DISABLE_PUSH;
        } else {
            C4037ag.m10796a(this.f6883a).mo22896a(C4053av.ENABLE_PUSH, "syncing");
            C4037ag.m10796a(this.f6883a).mo22896a(C4053av.DISABLE_PUSH, "");
            avVar = C4053av.ENABLE_PUSH;
        }
        m10841a(str, avVar, true, (HashMap<String, String>) null);
    }

    /* renamed from: a */
    public boolean m10873a() {
        return this.f6890a && 1 == C4056b.m10888a(this.f6883a).mo22930a();
    }

    /* renamed from: a */
    public boolean m10874a(int i) {
        if (!C4056b.m10888a(this.f6883a).mo22937b()) {
            return false;
        }
        m10846c(i);
        C4765il ilVar = new C4765il();
        ilVar.mo25555a(C4858an.m15586a());
        ilVar.mo25562b(C4056b.m10888a(this.f6883a).mo22930a());
        ilVar.mo25569d(this.f6883a.getPackageName());
        ilVar.mo25565c(C4749hw.ClientABTest.f9252a);
        HashMap hashMap = new HashMap();
        ilVar.f9524a = hashMap;
        hashMap.put("boot_mode", i + "");
        m10835a(this.f6883a).mo22912a(ilVar, C4739hm.Notification, false, (C4752hz) null);
        return true;
    }

    /* renamed from: b */
    public final void m10875b() {
        Intent a = mo22903a();
        a.setAction("com.xiaomi.mipush.DISABLE_PUSH");
        m10847c(a);
    }

    /* renamed from: b */
    public void mo22921b(int i) {
        Intent a = mo22903a();
        a.setAction("com.xiaomi.mipush.SET_NOTIFICATION_TYPE");
        a.putExtra(C4870at.f10051z, this.f6883a.getPackageName());
        a.putExtra(C4870at.f10017B, i);
        String str = C4870at.f10019D;
        a.putExtra(str, C4531be.m13429b(this.f6883a.getPackageName() + i));
        m10847c(a);
    }

    /* renamed from: b */
    public boolean m10877b() {
        if (!mo22903a() || !mo22924e()) {
            return true;
        }
        if (this.f6887a == null) {
            Integer valueOf = Integer.valueOf(C4875aw.m15643a(this.f6883a).mo25938a());
            this.f6887a = valueOf;
            if (valueOf.intValue() == 0) {
                this.f6883a.getContentResolver().registerContentObserver(C4875aw.m15643a(this.f6883a).mo25938a(), false, new C4050as(this, new Handler(Looper.getMainLooper())));
            }
        }
        return this.f6887a.intValue() != 0;
    }

    /* renamed from: c */
    public void m10878c() {
        Intent intent = this.f6884a;
        if (intent != null) {
            m10847c(intent);
            this.f6884a = null;
        }
    }

    /* renamed from: d */
    public void m10879d() {
        synchronized (f6881a) {
            Iterator<C4048a> it = f6881a.iterator();
            while (it.hasNext()) {
                C4048a next = it.next();
                mo22914a(next.f6893a, next.f6892a, next.f6894a, false, (C4752hz) null, true);
            }
            f6881a.clear();
        }
    }

    /* renamed from: e */
    public void m10880e() {
        Intent a = mo22903a();
        a.setAction("com.xiaomi.mipush.SET_NOTIFICATION_TYPE");
        a.putExtra(C4870at.f10051z, this.f6883a.getPackageName());
        a.putExtra(C4870at.f10019D, C4531be.m13429b(this.f6883a.getPackageName()));
        m10847c(a);
    }
}

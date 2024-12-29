package com.xiaomi.mipush.sdk;

import android.app.Application;
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
import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4551bj;
import com.xiaomi.push.C4554bk;
import com.xiaomi.push.C4560bo;
import com.xiaomi.push.C4610db;
import com.xiaomi.push.C4667eo;
import com.xiaomi.push.C4760hj;
import com.xiaomi.push.C4761hk;
import com.xiaomi.push.C4764hn;
import com.xiaomi.push.C4765ho;
import com.xiaomi.push.C4770ht;
import com.xiaomi.push.C4773hw;
import com.xiaomi.push.C4783if;
import com.xiaomi.push.C4786ii;
import com.xiaomi.push.C4787ij;
import com.xiaomi.push.C4793ip;
import com.xiaomi.push.C4797it;
import com.xiaomi.push.C4798iu;
import com.xiaomi.push.C4830m;
import com.xiaomi.push.service.C4898ba;
import com.xiaomi.push.service.C4902bd;
import com.xiaomi.push.service.C4916bk;
import com.xiaomi.push.service.C4921bn;
import com.xiaomi.push.service.C4964i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.xiaomi.mipush.sdk.ao */
public class C4465ao {

    /* renamed from: a */
    private static C4465ao f7445a = null;

    /* renamed from: a */
    private static final ArrayList<C4466a> f7446a = new ArrayList<>();

    /* renamed from: b */
    private static boolean f7447b = false;

    /* renamed from: a */
    private long f7448a;

    /* renamed from: a */
    private Context f7449a;

    /* renamed from: a */
    private Intent f7450a = null;

    /* renamed from: a */
    private Handler f7451a = null;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Messenger f7452a;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Integer f7453a = null;

    /* renamed from: a */
    private String f7454a;

    /* renamed from: a */
    private List<Message> f7455a = new ArrayList();

    /* renamed from: a */
    private boolean f7456a = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f7457c = false;

    /* renamed from: com.xiaomi.mipush.sdk.ao$a */
    static class C4466a<T extends C4798iu<T, ?>> {

        /* renamed from: a */
        C4760hj f7458a;

        /* renamed from: a */
        T f7459a;

        /* renamed from: a */
        boolean f7460a;

        C4466a() {
        }
    }

    private C4465ao(Context context) {
        this.f7449a = context.getApplicationContext();
        this.f7454a = null;
        this.f7456a = mo28675c();
        f7447b = mo28676d();
        this.f7451a = new C4467ap(this, Looper.getMainLooper());
        if (C4830m.m14998a(context)) {
            C4964i.m15557a((C4964i.C4966b) new C4468aq(this));
        }
        Intent b = mo28673b();
        if (b != null) {
            m12655b(b);
        }
    }

    /* renamed from: a */
    private synchronized int mo28653a() {
        return this.f7449a.getSharedPreferences("mipush_extra", 0).getInt(Constants.EXTRA_KEY_BOOT_SERVICE_MODE, -1);
    }

    /* renamed from: a */
    private Intent m12642a() {
        return (!mo28653a() || "com.xiaomi.xmsf".equals(this.f7449a.getPackageName())) ? mo28677e() : mo28676d();
    }

    /* renamed from: a */
    private Message mo28657a(Intent intent) {
        Message obtain = Message.obtain();
        obtain.what = 17;
        obtain.obj = intent;
        return obtain;
    }

    /* renamed from: a */
    public static synchronized C4465ao m12646a(Context context) {
        C4465ao aoVar;
        synchronized (C4465ao.class) {
            if (f7445a == null) {
                f7445a = new C4465ao(context);
            }
            aoVar = f7445a;
        }
        return aoVar;
    }

    /* renamed from: a */
    private String m12649a() {
        try {
            return this.f7449a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 106 ? "com.xiaomi.push.service.XMPushService" : "com.xiaomi.xmsf.push.service.XMPushService";
        } catch (Exception unused) {
            return "com.xiaomi.xmsf.push.service.XMPushService";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m12652a(String str, C4472au auVar, boolean z, HashMap<String, String> hashMap) {
        C4786ii iiVar;
        String str2;
        if (C4475b.m12705a(this.f7449a).mo28691b() && C4551bj.m13000b(this.f7449a)) {
            C4786ii iiVar2 = new C4786ii();
            iiVar2.mo29596a(true);
            Intent a = mo28653a();
            if (TextUtils.isEmpty(str)) {
                str = C4902bd.m15380a();
                iiVar2.mo29593a(str);
                iiVar = z ? new C4786ii(str, true) : null;
                synchronized (C4456af.class) {
                    C4456af.m12606a(this.f7449a).mo28645a(str);
                }
            } else {
                iiVar2.mo29593a(str);
                iiVar = z ? new C4786ii(str, true) : null;
            }
            switch (C4471at.f7465a[auVar.ordinal()]) {
                case 1:
                    C4770ht htVar = C4770ht.DisablePushMessage;
                    iiVar2.mo29602c(htVar.f8718a);
                    iiVar.mo29602c(htVar.f8718a);
                    if (hashMap != null) {
                        iiVar2.mo29595a((Map<String, String>) hashMap);
                        iiVar.mo29595a((Map<String, String>) hashMap);
                    }
                    str2 = "com.xiaomi.mipush.DISABLE_PUSH_MESSAGE";
                    break;
                case 2:
                    C4770ht htVar2 = C4770ht.EnablePushMessage;
                    iiVar2.mo29602c(htVar2.f8718a);
                    iiVar.mo29602c(htVar2.f8718a);
                    if (hashMap != null) {
                        iiVar2.mo29595a((Map<String, String>) hashMap);
                        iiVar.mo29595a((Map<String, String>) hashMap);
                    }
                    str2 = "com.xiaomi.mipush.ENABLE_PUSH_MESSAGE";
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    iiVar2.mo29602c(C4770ht.ThirdPartyRegUpdate.f8718a);
                    if (hashMap != null) {
                        iiVar2.mo29595a((Map<String, String>) hashMap);
                        break;
                    }
                    break;
            }
            a.setAction(str2);
            C4408b.m12484e("type:" + auVar + ", " + str);
            iiVar2.mo29599b(C4475b.m12705a(this.f7449a).mo28684a());
            iiVar2.mo29606d(this.f7449a.getPackageName());
            C4760hj hjVar = C4760hj.Notification;
            mo28663a(iiVar2, hjVar, false, (C4773hw) null);
            if (z) {
                iiVar.mo29599b(C4475b.m12705a(this.f7449a).mo28684a());
                iiVar.mo29606d(this.f7449a.getPackageName());
                Context context = this.f7449a;
                byte[] a2 = C4797it.m14834a(C4459ai.m12615a(context, iiVar, hjVar, false, context.getPackageName(), C4475b.m12705a(this.f7449a).mo28684a()));
                if (a2 != null) {
                    C4610db.m13287a(this.f7449a.getPackageName(), this.f7449a, iiVar, hjVar, a2.length);
                    a.putExtra("mipush_payload", a2);
                    a.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
                    a.putExtra("mipush_app_id", C4475b.m12705a(this.f7449a).mo28684a());
                    a.putExtra("mipush_app_token", C4475b.m12705a(this.f7449a).mo28691b());
                    m12658c(a);
                }
            }
            Message obtain = Message.obtain();
            obtain.what = 19;
            int ordinal = auVar.ordinal();
            obtain.obj = str;
            obtain.arg1 = ordinal;
            this.f7451a.sendMessageDelayed(obtain, 5000);
        }
    }

    /* renamed from: b */
    private Intent mo28673b() {
        if (!"com.xiaomi.xmsf".equals(this.f7449a.getPackageName())) {
            return mo28675c();
        }
        C4408b.m12482c("pushChannel xmsf create own channel");
        return mo28677e();
    }

    /* renamed from: b */
    private void m12655b(Intent intent) {
        try {
            if (C4830m.m14997a() || Build.VERSION.SDK_INT < 26) {
                this.f7449a.startService(intent);
            } else {
                m12661d(intent);
            }
        } catch (Exception e) {
            C4408b.m12478a((Throwable) e);
        }
    }

    /* renamed from: c */
    private Intent mo28675c() {
        if (mo28653a()) {
            C4408b.m12482c("pushChannel app start miui china channel");
            return mo28676d();
        }
        C4408b.m12482c("pushChannel app start  own channel");
        return mo28677e();
    }

    /* renamed from: c */
    private synchronized void m12657c(int i) {
        this.f7449a.getSharedPreferences("mipush_extra", 0).edit().putInt(Constants.EXTRA_KEY_BOOT_SERVICE_MODE, i).commit();
    }

    /* renamed from: c */
    private void m12658c(Intent intent) {
        C4898ba a = C4898ba.m15362a(this.f7449a);
        int a2 = C4765ho.ServiceBootMode.mo29322a();
        C4761hk hkVar = C4761hk.START;
        int a3 = a.mo29988a(a2, hkVar.mo29283a());
        int a4 = mo28653a();
        C4761hk hkVar2 = C4761hk.BIND;
        boolean z = a3 == hkVar2.mo29283a() && f7447b;
        int a5 = z ? hkVar2.mo29283a() : hkVar.mo29283a();
        if (a5 != a4) {
            mo28654a(a5);
        }
        if (z) {
            m12661d(intent);
        } else {
            m12655b(intent);
        }
    }

    /* renamed from: c */
    private boolean m12659c() {
        try {
            PackageInfo packageInfo = this.f7449a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
            return packageInfo != null && packageInfo.versionCode >= 105;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: d */
    private Intent mo28676d() {
        Intent intent = new Intent();
        String packageName = this.f7449a.getPackageName();
        intent.setPackage("com.xiaomi.xmsf");
        intent.setClassName("com.xiaomi.xmsf", mo28653a());
        intent.putExtra("mipush_app_package", packageName);
        m12666h();
        return intent;
    }

    /* renamed from: d */
    private synchronized void m12661d(Intent intent) {
        if (this.f7457c) {
            Message a = mo28657a(intent);
            if (this.f7455a.size() >= 50) {
                this.f7455a.remove(0);
            }
            this.f7455a.add(a);
            return;
        } else if (this.f7452a == null) {
            this.f7449a.bindService(intent, new C4470as(this), 1);
            this.f7457c = true;
            this.f7455a.clear();
            this.f7455a.add(mo28657a(intent));
        } else {
            try {
                this.f7452a.send(mo28657a(intent));
            } catch (RemoteException unused) {
                this.f7452a = null;
                this.f7457c = false;
            }
        }
    }

    /* renamed from: d */
    private boolean m12662d() {
        if (mo28653a()) {
            try {
                return this.f7449a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 108;
            } catch (Exception unused) {
            }
        }
        return true;
    }

    /* renamed from: e */
    private Intent mo28677e() {
        Intent intent = new Intent();
        String packageName = this.f7449a.getPackageName();
        m12667i();
        intent.setComponent(new ComponentName(this.f7449a, "com.xiaomi.push.service.XMPushService"));
        intent.putExtra("mipush_app_package", packageName);
        return intent;
    }

    /* renamed from: e */
    private boolean m12664e() {
        String packageName = this.f7449a.getPackageName();
        return packageName.contains("miui") || packageName.contains("xiaomi") || (this.f7449a.getApplicationInfo().flags & 1) != 0;
    }

    /* renamed from: g */
    private void m12665g() {
        this.f7448a = SystemClock.elapsedRealtime();
    }

    /* renamed from: h */
    private void m12666h() {
        try {
            PackageManager packageManager = this.f7449a.getPackageManager();
            ComponentName componentName = new ComponentName(this.f7449a, "com.xiaomi.push.service.XMPushService");
            if (packageManager.getComponentEnabledSetting(componentName) != 2) {
                packageManager.setComponentEnabledSetting(componentName, 2, 1);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: i */
    private void m12667i() {
        try {
            PackageManager packageManager = this.f7449a.getPackageManager();
            ComponentName componentName = new ComponentName(this.f7449a, "com.xiaomi.push.service.XMPushService");
            if (packageManager.getComponentEnabledSetting(componentName) != 1) {
                packageManager.setComponentEnabledSetting(componentName, 1, 1);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public long m12668a() {
        return this.f7448a;
    }

    /* renamed from: a */
    public void m12669a() {
        m12655b(mo28653a());
    }

    /* renamed from: a */
    public void mo28654a(int i) {
        mo28655a(i, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo28655a(int i, int i2) {
        Intent a = mo28653a();
        a.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        a.putExtra(C4916bk.f9566B, this.f7449a.getPackageName());
        a.putExtra(C4916bk.f9567C, i);
        a.putExtra(C4916bk.f9568D, i2);
        m12658c(a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo28656a(int i, String str) {
        Intent a = mo28653a();
        a.setAction("com.xiaomi.mipush.thirdparty");
        a.putExtra("com.xiaomi.mipush.thirdparty_LEVEL", i);
        a.putExtra("com.xiaomi.mipush.thirdparty_DESC", str);
        m12655b(a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void m12673a(Intent intent) {
        intent.fillIn(mo28653a(), 24);
        m12658c(intent);
    }

    /* renamed from: a */
    public final void mo28658a(C4764hn hnVar) {
        Intent a = mo28653a();
        byte[] a2 = C4797it.m14834a(hnVar);
        if (a2 == null) {
            C4408b.m12464a("send TinyData failed, because tinyDataBytes is null.");
            return;
        }
        a.setAction("com.xiaomi.mipush.SEND_TINYDATA");
        a.putExtra("mipush_payload", a2);
        m12655b(a);
    }

    /* renamed from: a */
    public final void mo28659a(C4787ij ijVar, boolean z) {
        C4667eo.m13689a(this.f7449a.getApplicationContext()).mo29053a(this.f7449a.getPackageName(), "E100003", ijVar.mo29629a(), 6001, (String) null);
        this.f7450a = null;
        C4475b.m12705a(this.f7449a).f7478a = ijVar.mo29629a();
        Intent a = mo28653a();
        byte[] a2 = C4797it.m14834a(C4459ai.m12614a(this.f7449a, ijVar, C4760hj.Registration));
        if (a2 == null) {
            C4408b.m12464a("register fail, because msgBytes is null.");
            return;
        }
        a.setAction("com.xiaomi.mipush.REGISTER_APP");
        a.putExtra("mipush_app_id", C4475b.m12705a(this.f7449a).mo28684a());
        a.putExtra("mipush_payload", a2);
        a.putExtra("mipush_session", this.f7454a);
        a.putExtra("mipush_env_chanage", z);
        a.putExtra("mipush_env_type", C4475b.m12705a(this.f7449a).mo28684a());
        if (!C4551bj.m13000b(this.f7449a) || !mo28673b()) {
            this.f7450a = a;
            return;
        }
        m12665g();
        m12658c(a);
    }

    /* renamed from: a */
    public final void mo28660a(C4793ip ipVar) {
        byte[] a = C4797it.m14834a(C4459ai.m12614a(this.f7449a, ipVar, C4760hj.UnRegistration));
        if (a == null) {
            C4408b.m12464a("unregister fail, because msgBytes is null.");
            return;
        }
        Intent a2 = mo28653a();
        a2.setAction("com.xiaomi.mipush.UNREGISTER_APP");
        a2.putExtra("mipush_app_id", C4475b.m12705a(this.f7449a).mo28684a());
        a2.putExtra("mipush_payload", a);
        m12658c(a2);
    }

    /* renamed from: a */
    public final <T extends C4798iu<T, ?>> void mo28661a(T t, C4760hj hjVar, C4773hw hwVar) {
        mo28663a(t, hjVar, !hjVar.equals(C4760hj.Registration), hwVar);
    }

    /* renamed from: a */
    public <T extends C4798iu<T, ?>> void mo28662a(T t, C4760hj hjVar, boolean z) {
        C4466a aVar = new C4466a();
        aVar.f7459a = t;
        aVar.f7458a = hjVar;
        aVar.f7460a = z;
        ArrayList<C4466a> arrayList = f7446a;
        synchronized (arrayList) {
            arrayList.add(aVar);
            if (arrayList.size() > 10) {
                arrayList.remove(0);
            }
        }
    }

    /* renamed from: a */
    public final <T extends C4798iu<T, ?>> void mo28663a(T t, C4760hj hjVar, boolean z, C4773hw hwVar) {
        mo28665a(t, hjVar, z, true, hwVar, true);
    }

    /* renamed from: a */
    public final <T extends C4798iu<T, ?>> void mo28664a(T t, C4760hj hjVar, boolean z, C4773hw hwVar, boolean z2) {
        mo28665a(t, hjVar, z, true, hwVar, z2);
    }

    /* renamed from: a */
    public final <T extends C4798iu<T, ?>> void mo28665a(T t, C4760hj hjVar, boolean z, boolean z2, C4773hw hwVar, boolean z3) {
        mo28666a(t, hjVar, z, z2, hwVar, z3, this.f7449a.getPackageName(), C4475b.m12705a(this.f7449a).mo28684a());
    }

    /* renamed from: a */
    public final <T extends C4798iu<T, ?>> void mo28666a(T t, C4760hj hjVar, boolean z, boolean z2, C4773hw hwVar, boolean z3, String str, String str2) {
        mo28667a(t, hjVar, z, z2, hwVar, z3, str, str2, true);
    }

    /* renamed from: a */
    public final <T extends C4798iu<T, ?>> void mo28667a(T t, C4760hj hjVar, boolean z, boolean z2, C4773hw hwVar, boolean z3, String str, String str2, boolean z4) {
        mo28668a(t, hjVar, z, z2, hwVar, z3, str, str2, z4, true);
    }

    /* renamed from: a */
    public final <T extends C4798iu<T, ?>> void mo28668a(T t, C4760hj hjVar, boolean z, boolean z2, C4773hw hwVar, boolean z3, String str, String str2, boolean z4, boolean z5) {
        C4773hw hwVar2 = hwVar;
        if (!z5 || C4475b.m12705a(this.f7449a).mo28694c()) {
            C4783if a = z4 ? C4459ai.m12615a(this.f7449a, t, hjVar, z, str, str2) : C4459ai.m12619b(this.f7449a, t, hjVar, z, str, str2);
            if (hwVar2 != null) {
                a.mo29560a(hwVar);
            }
            byte[] a2 = C4797it.m14834a(a);
            if (a2 == null) {
                C4408b.m12464a("send message fail, because msgBytes is null.");
                return;
            }
            T t2 = t;
            C4760hj hjVar2 = hjVar;
            C4610db.m13287a(this.f7449a.getPackageName(), this.f7449a, t, hjVar, a2.length);
            Intent a3 = mo28653a();
            a3.setAction("com.xiaomi.mipush.SEND_MESSAGE");
            a3.putExtra("mipush_payload", a2);
            boolean z6 = z3;
            a3.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", z3);
            m12658c(a3);
        } else if (z2) {
            mo28662a(t, hjVar, z);
        } else {
            C4408b.m12464a("drop the message before initialization.");
        }
    }

    /* renamed from: a */
    public final void mo28669a(String str, C4472au auVar, C4479e eVar) {
        C4456af.m12606a(this.f7449a).mo28647a(auVar, "syncing");
        m12652a(str, auVar, false, (HashMap<String, String>) C4483i.m12765a(this.f7449a, eVar));
    }

    /* renamed from: a */
    public void mo28670a(String str, String str2) {
        Intent a = mo28653a();
        a.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        a.putExtra(C4916bk.f9566B, this.f7449a.getPackageName());
        a.putExtra(C4916bk.f9572H, str);
        a.putExtra(C4916bk.f9573I, str2);
        m12658c(a);
    }

    /* renamed from: a */
    public final void mo28671a(boolean z) {
        mo28672a(z, (String) null);
    }

    /* renamed from: a */
    public final void mo28672a(boolean z, String str) {
        C4456af afVar;
        C4472au auVar;
        C4472au auVar2;
        if (z) {
            C4456af a = C4456af.m12606a(this.f7449a);
            auVar = C4472au.DISABLE_PUSH;
            a.mo28647a(auVar, "syncing");
            afVar = C4456af.m12606a(this.f7449a);
            auVar2 = C4472au.ENABLE_PUSH;
        } else {
            C4456af a2 = C4456af.m12606a(this.f7449a);
            auVar = C4472au.ENABLE_PUSH;
            a2.mo28647a(auVar, "syncing");
            afVar = C4456af.m12606a(this.f7449a);
            auVar2 = C4472au.DISABLE_PUSH;
        }
        afVar.mo28647a(auVar2, "");
        m12652a(str, auVar, true, (HashMap<String, String>) null);
    }

    /* renamed from: a */
    public boolean m12689a() {
        return this.f7456a && 1 == C4475b.m12705a(this.f7449a).mo28684a();
    }

    /* renamed from: a */
    public boolean m12690a(int i) {
        if (!C4475b.m12705a(this.f7449a).mo28691b()) {
            return false;
        }
        m12657c(i);
        C4786ii iiVar = new C4786ii();
        iiVar.mo29593a(C4902bd.m15380a());
        iiVar.mo29599b(C4475b.m12705a(this.f7449a).mo28684a());
        iiVar.mo29606d(this.f7449a.getPackageName());
        iiVar.mo29602c(C4770ht.ClientABTest.f8718a);
        HashMap hashMap = new HashMap();
        iiVar.f8983a = hashMap;
        hashMap.put("boot_mode", i + "");
        m12646a(this.f7449a).mo28663a(iiVar, C4760hj.Notification, false, (C4773hw) null);
        return true;
    }

    /* renamed from: b */
    public final void m12691b() {
        Intent a = mo28653a();
        a.setAction("com.xiaomi.mipush.DISABLE_PUSH");
        m12658c(a);
    }

    /* renamed from: b */
    public void mo28674b(int i) {
        Intent a = mo28653a();
        a.setAction("com.xiaomi.mipush.SET_NOTIFICATION_TYPE");
        a.putExtra(C4916bk.f9566B, this.f7449a.getPackageName());
        a.putExtra(C4916bk.f9569E, i);
        String str = C4916bk.f9571G;
        a.putExtra(str, C4560bo.m13040b(this.f7449a.getPackageName() + i));
        m12658c(a);
    }

    /* renamed from: b */
    public boolean m12693b() {
        if (!mo28653a() || !mo28677e()) {
            return true;
        }
        if (this.f7453a == null) {
            Integer valueOf = Integer.valueOf(C4921bn.m15441a(this.f7449a).mo30023a());
            this.f7453a = valueOf;
            if (valueOf.intValue() == 0) {
                this.f7449a.getContentResolver().registerContentObserver(C4921bn.m15441a(this.f7449a).mo30023a(), false, new C4469ar(this, new Handler(Looper.getMainLooper())));
            }
        }
        return this.f7453a.intValue() != 0;
    }

    /* renamed from: c */
    public void m12694c() {
        if (this.f7450a != null) {
            m12665g();
            m12658c(this.f7450a);
            this.f7450a = null;
        }
    }

    /* renamed from: d */
    public void m12695d() {
        ArrayList<C4466a> arrayList = f7446a;
        synchronized (arrayList) {
            boolean z = Thread.currentThread() == Looper.getMainLooper().getThread();
            Iterator<C4466a> it = arrayList.iterator();
            while (it.hasNext()) {
                C4466a next = it.next();
                mo28665a(next.f7459a, next.f7458a, next.f7460a, false, (C4773hw) null, true);
                if (!z) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            f7446a.clear();
        }
    }

    /* renamed from: e */
    public void m12696e() {
        Intent a = mo28653a();
        a.setAction("com.xiaomi.mipush.CLEAR_HEADSUPNOTIFICATION");
        Application application = (Application) C4554bk.m13014a("android.app.ActivityThread", "currentApplication", new Object[0]);
        String packageName = (application == null || application.getApplicationContext() == null) ? null : application.getApplicationContext().getPackageName();
        String packageName2 = this.f7449a.getPackageName();
        if (TextUtils.isEmpty(packageName) || packageName.equals(packageName2)) {
            packageName = packageName2;
        } else {
            C4408b.m12464a("application package name: " + packageName + ", not equals context package name: " + packageName2);
        }
        a.putExtra(C4916bk.f9566B, packageName);
        m12658c(a);
    }

    /* renamed from: f */
    public void mo28678f() {
        Intent a = mo28653a();
        a.setAction("com.xiaomi.mipush.SET_NOTIFICATION_TYPE");
        a.putExtra(C4916bk.f9566B, this.f7449a.getPackageName());
        a.putExtra(C4916bk.f9571G, C4560bo.m13040b(this.f7449a.getPackageName()));
        m12658c(a);
    }
}

package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4491ab;
import com.xiaomi.push.C4808l;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.push.service.bb */
public class C4881bb {

    /* renamed from: a */
    private static C4881bb f10075a;

    /* renamed from: a */
    private static String f10076a;

    /* renamed from: a */
    private Context f10077a;

    /* renamed from: a */
    private Messenger f10078a;

    /* renamed from: a */
    private List<Message> f10079a = new ArrayList();

    /* renamed from: a */
    private boolean f10080a = false;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Messenger f10081b;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f10082b = false;

    private C4881bb(Context context) {
        this.f10077a = context.getApplicationContext();
        this.f10078a = new Messenger(new C4882bc(this, Looper.getMainLooper()));
        if (m15669a()) {
            C3989b.m10680c("use miui push service");
            this.f10080a = true;
        }
    }

    /* renamed from: a */
    private Message mo25943a(Intent intent) {
        Message obtain = Message.obtain();
        obtain.what = 17;
        obtain.obj = intent;
        return obtain;
    }

    /* renamed from: a */
    public static C4881bb m15666a(Context context) {
        if (f10075a == null) {
            f10075a = new C4881bb(context);
        }
        return f10075a;
    }

    /* renamed from: a */
    private synchronized void m15668a(Intent intent) {
        if (this.f10082b) {
            Message a = mo25943a(intent);
            if (this.f10079a.size() >= 50) {
                this.f10079a.remove(0);
            }
            this.f10079a.add(a);
            return;
        } else if (this.f10081b == null) {
            this.f10077a.bindService(intent, new C4883bd(this), 1);
            this.f10082b = true;
            this.f10079a.clear();
            this.f10079a.add(mo25943a(intent));
        } else {
            try {
                this.f10081b.send(mo25943a(intent));
            } catch (RemoteException unused) {
                this.f10081b = null;
                this.f10082b = false;
            }
        }
    }

    /* renamed from: a */
    private boolean m15669a() {
        if (C4491ab.f8147e) {
            return false;
        }
        try {
            PackageInfo packageInfo = this.f10077a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
            return packageInfo != null && packageInfo.versionCode >= 104;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public boolean m15671a(Intent intent) {
        try {
            if (C4808l.m15356a() || Build.VERSION.SDK_INT < 26) {
                this.f10077a.startService(intent);
                return true;
            }
            mo25943a(intent);
            return true;
        } catch (Exception e) {
            C3989b.m10678a((Throwable) e);
            return false;
        }
    }
}

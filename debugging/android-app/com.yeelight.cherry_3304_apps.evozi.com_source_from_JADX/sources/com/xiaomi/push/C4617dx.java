package com.xiaomi.push;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4498ai;
import com.xiaomi.push.service.C4854ak;

/* renamed from: com.xiaomi.push.dx */
public class C4617dx {

    /* renamed from: a */
    private static volatile C4617dx f8431a;

    /* renamed from: a */
    private Context f8432a;

    private C4617dx(Context context) {
        this.f8432a = context;
    }

    /* renamed from: a */
    private int m13766a(int i) {
        return Math.max(60, i);
    }

    /* renamed from: a */
    public static C4617dx m13767a(Context context) {
        if (f8431a == null) {
            synchronized (C4617dx.class) {
                if (f8431a == null) {
                    f8431a = new C4617dx(context);
                }
            }
        }
        return f8431a;
    }

    /* renamed from: a */
    private void m13769a(C4854ak akVar, C4498ai aiVar, boolean z) {
        if (akVar.mo25911a(C4744hr.UploadSwitch.mo25291a(), true)) {
            C4629ei eiVar = new C4629ei(this.f8432a);
            if (z) {
                aiVar.mo24729a((C4498ai.C4499a) eiVar, m13766a(akVar.mo25906a(C4744hr.UploadFrequency.mo25291a(), 86400)));
            } else {
                aiVar.mo24728a((C4498ai.C4499a) eiVar);
            }
        }
    }

    /* renamed from: a */
    private boolean mo24928a() {
        if (Build.VERSION.SDK_INT >= 14) {
            try {
                ((Application) (this.f8432a instanceof Application ? this.f8432a : this.f8432a.getApplicationContext())).registerActivityLifecycleCallbacks(new C4608do(this.f8432a, String.valueOf(System.currentTimeMillis() / 1000)));
                return true;
            } catch (Exception e) {
                C3989b.m10678a((Throwable) e);
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m13771b() {
        C4498ai a = C4498ai.m13271a(this.f8432a);
        C4854ak a2 = C4854ak.m15568a(this.f8432a);
        SharedPreferences sharedPreferences = this.f8432a.getSharedPreferences("mipush_extra", 0);
        long currentTimeMillis = System.currentTimeMillis();
        long j = sharedPreferences.getLong("first_try_ts", currentTimeMillis);
        if (j == currentTimeMillis) {
            sharedPreferences.edit().putLong("first_try_ts", currentTimeMillis).commit();
        }
        if (Math.abs(currentTimeMillis - j) >= 172800000) {
            m13769a(a2, a, false);
            if (a2.mo25911a(C4744hr.StorageCollectionSwitch.mo25291a(), true)) {
                int a3 = m13766a(a2.mo25906a(C4744hr.StorageCollectionFrequency.mo25291a(), 86400));
                a.mo24730a(new C4627eg(this.f8432a, a3), a3, 0);
            }
            boolean a4 = a2.mo25911a(C4744hr.AppIsInstalledCollectionSwitch.mo25291a(), false);
            String a5 = a2.mo25907a(C4744hr.AppIsInstalledList.mo25291a(), (String) null);
            if (a4 && !TextUtils.isEmpty(a5)) {
                int a6 = m13766a(a2.mo25906a(C4744hr.AppIsInstalledCollectionFrequency.mo25291a(), 86400));
                a.mo24730a(new C4621ea(this.f8432a, a6, a5), a6, 0);
            }
            boolean a7 = a2.mo25911a(C4744hr.ScreenSizeCollectionSwitch.mo25291a(), true);
            boolean a8 = a2.mo25911a(C4744hr.AndroidVnCollectionSwitch.mo25291a(), true);
            boolean a9 = a2.mo25911a(C4744hr.AndroidVcCollectionSwitch.mo25291a(), true);
            boolean a10 = a2.mo25911a(C4744hr.AndroidIdCollectionSwitch.mo25291a(), true);
            boolean a11 = a2.mo25911a(C4744hr.OperatorSwitch.mo25291a(), true);
            if (a7 || a8 || a9 || a10 || a11) {
                int a12 = m13766a(a2.mo25906a(C4744hr.DeviceInfoCollectionFrequency.mo25291a(), 1209600));
                a.mo24730a(new C4626ef(this.f8432a, a12, a7, a8, a9, a10, a11), a12, 0);
            }
            boolean a13 = a2.mo25911a(C4744hr.MacCollectionSwitch.mo25291a(), false);
            boolean a14 = a2.mo25911a(C4744hr.IMSICollectionSwitch.mo25291a(), false);
            boolean a15 = a2.mo25911a(C4744hr.IccidCollectionSwitch.mo25291a(), false);
            boolean a16 = a2.mo25911a(C4744hr.DeviceIdSwitch.mo25291a(), false);
            if (a13 || a14 || a15 || a16) {
                int a17 = m13766a(a2.mo25906a(C4744hr.DeviceBaseInfoCollectionFrequency.mo25291a(), 1209600));
                a.mo24730a(new C4625ee(this.f8432a, a17, a13, a14, a15, a16), a17, 0);
            }
            if (Build.VERSION.SDK_INT < 21 && a2.mo25911a(C4744hr.AppActiveListCollectionSwitch.mo25291a(), false)) {
                int a18 = m13766a(a2.mo25906a(C4744hr.AppActiveListCollectionFrequency.mo25291a(), 900));
                a.mo24730a(new C4619dz(this.f8432a, a18), a18, 0);
            }
            if (a2.mo25911a(C4744hr.TopAppCollectionSwitch.mo25291a(), false)) {
                int a19 = m13766a(a2.mo25906a(C4744hr.TopAppCollectionFrequency.mo25291a(), 300));
                a.mo24730a(new C4628eh(this.f8432a, a19), a19, 0);
            }
            if (a2.mo25911a(C4744hr.BroadcastActionCollectionSwitch.mo25291a(), true)) {
                int a20 = m13766a(a2.mo25906a(C4744hr.BroadcastActionCollectionFrequency.mo25291a(), 900));
                a.mo24730a(new C4623ec(this.f8432a, a20), a20, 0);
            }
            if (a2.mo25911a(C4744hr.ActivityTSSwitch.mo25291a(), false)) {
                mo24928a();
            }
            if (a2.mo25911a(C4744hr.BatteryCollectionSwitch.mo25291a(), false)) {
                int a21 = m13766a(a2.mo25906a(C4744hr.BatteryCollectionFrequency.mo25291a(), 3600));
                a.mo24730a(new C4622eb(this.f8432a, a21), a21, 0);
            }
            m13769a(a2, a, true);
        }
    }

    /* renamed from: a */
    public void m13772a() {
        C4498ai.m13271a(this.f8432a).mo24725a((Runnable) new C4618dy(this));
    }
}

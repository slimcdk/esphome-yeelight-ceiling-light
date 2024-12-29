package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.service.C4854ak;
import com.xiaomi.push.service.XMPushService;
import java.io.File;

/* renamed from: com.xiaomi.push.hh */
public class C4733hh implements XMPushService.C4830l {

    /* renamed from: a */
    private static boolean f8960a = false;

    /* renamed from: a */
    private int f8961a;

    /* renamed from: a */
    private Context f8962a;

    /* renamed from: b */
    private boolean f8963b;

    public C4733hh(Context context) {
        this.f8962a = context;
    }

    /* renamed from: a */
    private String m14533a(String str) {
        return "com.xiaomi.xmsf".equals(str) ? "1000271" : this.f8962a.getSharedPreferences("pref_registered_pkg_names", 0).getString(str, (String) null);
    }

    /* renamed from: a */
    private void m14534a(Context context) {
        this.f8963b = C4854ak.m15568a(context).mo25911a(C4744hr.TinyDataUploadSwitch.mo25291a(), true);
        int a = C4854ak.m15568a(context).mo25906a(C4744hr.TinyDataUploadFrequency.mo25291a(), 7200);
        this.f8961a = a;
        this.f8961a = Math.max(60, a);
    }

    /* renamed from: a */
    public static void m14535a(boolean z) {
        f8960a = z;
    }

    /* renamed from: a */
    private boolean mo25246a() {
        return Math.abs((System.currentTimeMillis() / 1000) - this.f8962a.getSharedPreferences("mipush_extra", 4).getLong("last_tiny_data_upload_timestamp", -1)) > ((long) this.f8961a);
    }

    /* renamed from: a */
    private boolean m14537a(C4738hl hlVar) {
        if (C4521az.m13366b(this.f8962a) && hlVar != null && !TextUtils.isEmpty(m14533a(this.f8962a.getPackageName())) && new File(this.f8962a.getFilesDir(), "tiny_data.data").exists() && !f8960a) {
            return !C4854ak.m15568a(this.f8962a).mo25911a(C4744hr.ScreenOnOrChargingTinyDataUploadSwitch.mo25291a(), false) || C4753i.m14740a(this.f8962a) || C4753i.m14747b(this.f8962a);
        }
        return false;
    }

    /* renamed from: a */
    public void m14538a() {
        m14534a(this.f8962a);
        if (this.f8963b && mo25246a()) {
            C3989b.m10669a("TinyData TinyDataCacheProcessor.pingFollowUpAction ts:" + System.currentTimeMillis());
            C4738hl a = C4737hk.m14549a(this.f8962a).mo25248a();
            if (!m14537a(a)) {
                C3989b.m10669a("TinyData TinyDataCacheProcessor.pingFollowUpAction !canUpload(uploader) ts:" + System.currentTimeMillis());
                return;
            }
            f8960a = true;
            C4734hi.m14540a(this.f8962a, a);
        }
    }
}

package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.service.C4898ba;
import com.xiaomi.push.service.C4937ca;
import com.xiaomi.push.service.XMPushService;
import java.io.File;
import java.util.List;

/* renamed from: com.xiaomi.push.hd */
public class C4753hd implements XMPushService.C4853n {

    /* renamed from: a */
    private static boolean f8398a = false;

    /* renamed from: a */
    private int f8399a;

    /* renamed from: a */
    private Context f8400a;

    /* renamed from: b */
    private boolean f8401b;

    public C4753hd(Context context) {
        this.f8400a = context;
    }

    /* renamed from: a */
    private String m14155a(String str) {
        return "com.xiaomi.xmsf".equals(str) ? "1000271" : this.f8400a.getSharedPreferences("pref_registered_pkg_names", 0).getString(str, (String) null);
    }

    /* renamed from: a */
    private void m14156a(Context context) {
        this.f8401b = C4898ba.m15362a(context).mo29996a(C4765ho.TinyDataUploadSwitch.mo29322a(), true);
        int a = C4898ba.m15362a(context).mo29988a(C4765ho.TinyDataUploadFrequency.mo29322a(), 7200);
        this.f8399a = a;
        this.f8399a = Math.max(60, a);
    }

    /* renamed from: a */
    public static void m14157a(boolean z) {
        f8398a = z;
    }

    /* renamed from: a */
    private boolean mo29275a() {
        return Math.abs((System.currentTimeMillis() / 1000) - this.f8400a.getSharedPreferences("mipush_extra", 4).getLong("last_tiny_data_upload_timestamp", -1)) > ((long) this.f8399a);
    }

    /* renamed from: a */
    private boolean m14159a(C4758hh hhVar) {
        if (C4551bj.m13000b(this.f8400a) && hhVar != null && !TextUtils.isEmpty(m14155a(this.f8400a.getPackageName())) && new File(this.f8400a.getFilesDir(), "tiny_data.data").exists() && !f8398a) {
            return !C4898ba.m15362a(this.f8400a).mo29996a(C4765ho.ScreenOnOrChargingTinyDataUploadSwitch.mo29322a(), false) || C4805j.m14863a(this.f8400a) || C4805j.m14870b(this.f8400a);
        }
        return false;
    }

    /* renamed from: a */
    public void m14160a() {
        C4758hh a = C4757hg.m14171a(this.f8400a).mo29277a();
        if (C4759hi.m14179a(this.f8400a) && a != null) {
            C4756hf.m14169a(this.f8400a, a, (List<C4764hn>) C4937ca.f9650a);
            C4937ca.m15502a();
            C4408b.m12482c("coord data upload");
        }
        m14156a(this.f8400a);
        if (this.f8401b && mo29275a()) {
            C4408b.m12464a("TinyData TinyDataCacheProcessor.pingFollowUpAction ts:" + System.currentTimeMillis());
            if (!m14159a(a)) {
                C4408b.m12464a("TinyData TinyDataCacheProcessor.pingFollowUpAction !canUpload(uploader) ts:" + System.currentTimeMillis());
                return;
            }
            f8398a = true;
            C4754he.m14162a(this.f8400a, a);
        }
    }
}

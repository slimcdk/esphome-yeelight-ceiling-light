package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.service.C4890bi;
import com.xiaomi.push.service.C4891bj;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.push.hk */
public class C4737hk {

    /* renamed from: a */
    private static volatile C4737hk f8967a;

    /* renamed from: a */
    private final Context f8968a;

    /* renamed from: a */
    private Map<String, C4738hl> f8969a = new HashMap();

    private C4737hk(Context context) {
        this.f8968a = context;
    }

    /* renamed from: a */
    public static C4737hk m14549a(Context context) {
        if (context == null) {
            C3989b.m10681d("[TinyDataManager]:mContext is null, TinyDataManager.getInstance(Context) failed.");
            return null;
        }
        if (f8967a == null) {
            synchronized (C4737hk.class) {
                if (f8967a == null) {
                    f8967a = new C4737hk(context);
                }
            }
        }
        return f8967a;
    }

    /* renamed from: a */
    private boolean m14550a(String str, String str2, String str3, String str4, long j, String str5) {
        C4743hq hqVar = new C4743hq();
        hqVar.mo25276d(str3);
        hqVar.mo25272c(str4);
        hqVar.mo25265a(j);
        hqVar.mo25269b(str5);
        hqVar.mo25267a(true);
        hqVar.mo25266a("push_sdk_channel");
        hqVar.mo25278e(str2);
        return mo25250a(hqVar, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C4738hl mo25248a() {
        C4738hl hlVar = this.f8969a.get("UPLOADER_PUSH_CHANNEL");
        if (hlVar != null) {
            return hlVar;
        }
        C4738hl hlVar2 = this.f8969a.get("UPLOADER_HTTP");
        if (hlVar2 != null) {
            return hlVar2;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Map<String, C4738hl> m14552a() {
        return this.f8969a;
    }

    /* renamed from: a */
    public void mo25249a(C4738hl hlVar, String str) {
        if (hlVar == null) {
            C3989b.m10681d("[TinyDataManager]: please do not add null mUploader to TinyDataManager.");
        } else if (TextUtils.isEmpty(str)) {
            C3989b.m10681d("[TinyDataManager]: can not add a provider from unkown resource.");
        } else {
            mo25248a().put(str, hlVar);
        }
    }

    /* renamed from: a */
    public boolean mo25250a(C4743hq hqVar, String str) {
        if (TextUtils.isEmpty(str)) {
            C3989b.m10669a("pkgName is null or empty, upload ClientUploadDataItem failed.");
            return false;
        } else if (C4890bi.m15705a(hqVar, false)) {
            return false;
        } else {
            if (TextUtils.isEmpty(hqVar.mo25277d())) {
                hqVar.mo25281f(C4890bi.m15702a());
            }
            hqVar.mo25283g(str);
            C4891bj.m15707a(this.f8968a, hqVar);
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo25251a(String str, String str2, long j, String str3) {
        return m14550a(this.f8968a.getPackageName(), this.f8968a.getPackageName(), str, str2, j, str3);
    }
}

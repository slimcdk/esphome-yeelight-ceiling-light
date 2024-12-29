package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.service.C4935bz;
import com.xiaomi.push.service.C4937ca;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.push.hg */
public class C4757hg {

    /* renamed from: a */
    private static volatile C4757hg f8405a;

    /* renamed from: a */
    private final Context f8406a;

    /* renamed from: a */
    private Map<String, C4758hh> f8407a = new HashMap();

    private C4757hg(Context context) {
        this.f8406a = context;
    }

    /* renamed from: a */
    public static C4757hg m14171a(Context context) {
        if (context == null) {
            C4408b.m12483d("[TinyDataManager]:mContext is null, TinyDataManager.getInstance(Context) failed.");
            return null;
        }
        if (f8405a == null) {
            synchronized (C4757hg.class) {
                if (f8405a == null) {
                    f8405a = new C4757hg(context);
                }
            }
        }
        return f8405a;
    }

    /* renamed from: a */
    private boolean m14172a(String str, String str2, String str3, String str4, long j, String str5) {
        C4764hn hnVar = new C4764hn();
        hnVar.mo29307d(str3);
        hnVar.mo29303c(str4);
        hnVar.mo29294a(j);
        hnVar.mo29300b(str5);
        hnVar.mo29297a(true);
        hnVar.mo29295a("push_sdk_channel");
        hnVar.mo29309e(str2);
        return mo29279a(hnVar, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C4758hh mo29277a() {
        C4758hh hhVar = this.f8407a.get("UPLOADER_PUSH_CHANNEL");
        if (hhVar != null) {
            return hhVar;
        }
        C4758hh hhVar2 = this.f8407a.get("UPLOADER_HTTP");
        if (hhVar2 != null) {
            return hhVar2;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Map<String, C4758hh> m14174a() {
        return this.f8407a;
    }

    /* renamed from: a */
    public void mo29278a(C4758hh hhVar, String str) {
        if (hhVar == null) {
            C4408b.m12483d("[TinyDataManager]: please do not add null mUploader to TinyDataManager.");
        } else if (TextUtils.isEmpty(str)) {
            C4408b.m12483d("[TinyDataManager]: can not add a provider from unkown resource.");
        } else {
            mo29277a().put(str, hhVar);
        }
    }

    /* renamed from: a */
    public boolean mo29279a(C4764hn hnVar, String str) {
        if (TextUtils.isEmpty(str)) {
            C4408b.m12464a("pkgName is null or empty, upload ClientUploadDataItem failed.");
            return false;
        } else if (C4935bz.m15498a(hnVar, false)) {
            return false;
        } else {
            if (TextUtils.isEmpty(hnVar.mo29308d())) {
                hnVar.mo29312f(C4935bz.m15494a());
            }
            hnVar.mo29314g(str);
            C4937ca.m15503a(this.f8406a, hnVar);
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo29280a(String str, String str2, long j, String str3) {
        return m14172a(this.f8406a.getPackageName(), this.f8406a.getPackageName(), str, str2, j, str3);
    }
}

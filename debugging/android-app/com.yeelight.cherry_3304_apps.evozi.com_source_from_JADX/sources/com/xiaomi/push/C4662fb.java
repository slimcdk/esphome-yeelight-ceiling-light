package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.miot.common.ReturnCode;
import com.xiaomi.clientreport.data.C3990a;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.clientreport.manager.ClientReportClient;

/* renamed from: com.xiaomi.push.fb */
public class C4662fb {

    /* renamed from: a */
    private static volatile C4662fb f8610a;

    /* renamed from: a */
    private Context f8611a;

    private C4662fb(Context context) {
        this.f8611a = context;
    }

    /* renamed from: a */
    public static C4662fb m14151a(Context context) {
        if (f8610a == null) {
            synchronized (C4662fb.class) {
                if (f8610a == null) {
                    f8610a = new C4662fb(context);
                }
            }
        }
        return f8610a;
    }

    /* renamed from: a */
    private void m14152a(C3990a aVar) {
        if (aVar instanceof PerfClientReport) {
            ClientReportClient.reportPerf(this.f8611a, (PerfClientReport) aVar);
        } else if (aVar instanceof EventClientReport) {
            ClientReportClient.reportEvent(this.f8611a, (EventClientReport) aVar);
        }
    }

    /* renamed from: a */
    public void mo25058a(String str, int i, long j, long j2) {
        if (i >= 0 && j2 >= 0 && j > 0) {
            PerfClientReport a = C4660fa.m14141a(this.f8611a, i, j, j2);
            a.setAppPackageName(str);
            a.setSdkVersion("3_7_5");
            m14152a((C3990a) a);
        }
    }

    /* renamed from: a */
    public void mo25059a(String str, Intent intent, int i, String str2) {
        if (intent != null) {
            String str3 = str;
            mo25061a(str3, C4660fa.m14135a(intent.getIntExtra("eventMessageType", -1)), intent.getStringExtra("messageId"), i, System.currentTimeMillis(), str2);
        }
    }

    /* renamed from: a */
    public void mo25060a(String str, Intent intent, String str2) {
        if (intent != null) {
            String str3 = str;
            mo25061a(str3, C4660fa.m14135a(intent.getIntExtra("eventMessageType", -1)), intent.getStringExtra("messageId"), 5001, System.currentTimeMillis(), str2);
        }
    }

    /* renamed from: a */
    public void mo25061a(String str, String str2, String str3, int i, long j, String str4) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            EventClientReport a = C4660fa.m14138a(this.f8611a, str2, str3, i, j, str4);
            a.setAppPackageName(str);
            a.setSdkVersion("3_7_5");
            m14152a((C3990a) a);
        }
    }

    /* renamed from: a */
    public void mo25062a(String str, String str2, String str3, int i, String str4) {
        mo25061a(str, str2, str3, i, System.currentTimeMillis(), str4);
    }

    /* renamed from: a */
    public void mo25063a(String str, String str2, String str3, String str4) {
        mo25061a(str, str2, str3, 5002, System.currentTimeMillis(), str4);
    }

    /* renamed from: b */
    public void mo25064b(String str, String str2, String str3, String str4) {
        mo25061a(str, str2, str3, 5001, System.currentTimeMillis(), str4);
    }

    /* renamed from: c */
    public void mo25065c(String str, String str2, String str3, String str4) {
        mo25061a(str, str2, str3, ReturnCode.E_ACCOUNT_LOGOUT, System.currentTimeMillis(), str4);
    }
}

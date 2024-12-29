package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.miot.common.ReturnCode;
import com.xiaomi.clientreport.data.C4410a;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.clientreport.manager.ClientReportClient;

/* renamed from: com.xiaomi.push.eo */
public class C4667eo {

    /* renamed from: a */
    private static volatile C4667eo f7994a;

    /* renamed from: a */
    private Context f7995a;

    private C4667eo(Context context) {
        this.f7995a = context;
    }

    /* renamed from: a */
    public static C4667eo m13689a(Context context) {
        if (f7994a == null) {
            synchronized (C4667eo.class) {
                if (f7994a == null) {
                    f7994a = new C4667eo(context);
                }
            }
        }
        return f7994a;
    }

    /* renamed from: a */
    private void m13690a(C4410a aVar) {
        if (aVar instanceof PerfClientReport) {
            ClientReportClient.reportPerf(this.f7995a, (PerfClientReport) aVar);
        } else if (aVar instanceof EventClientReport) {
            ClientReportClient.reportEvent(this.f7995a, (EventClientReport) aVar);
        }
    }

    /* renamed from: a */
    public void mo29049a(String str, int i, long j, long j2) {
        if (i >= 0 && j2 >= 0 && j > 0) {
            PerfClientReport a = C4665en.m13679a(this.f7995a, i, j, j2);
            a.setAppPackageName(str);
            a.setSdkVersion("4_9_1");
            m13690a((C4410a) a);
        }
    }

    /* renamed from: a */
    public void mo29050a(String str, Intent intent, int i, String str2) {
        if (intent != null) {
            String str3 = str;
            mo29052a(str3, C4665en.m13673a(intent.getIntExtra("eventMessageType", -1)), intent.getStringExtra("messageId"), i, System.currentTimeMillis(), str2);
        }
    }

    /* renamed from: a */
    public void mo29051a(String str, Intent intent, String str2) {
        if (intent != null) {
            String str3 = str;
            mo29052a(str3, C4665en.m13673a(intent.getIntExtra("eventMessageType", -1)), intent.getStringExtra("messageId"), 5001, System.currentTimeMillis(), str2);
        }
    }

    /* renamed from: a */
    public void mo29052a(String str, String str2, String str3, int i, long j, String str4) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            EventClientReport a = C4665en.m13676a(this.f7995a, str2, str3, i, j, str4);
            a.setAppPackageName(str);
            a.setSdkVersion("4_9_1");
            m13690a((C4410a) a);
        }
    }

    /* renamed from: a */
    public void mo29053a(String str, String str2, String str3, int i, String str4) {
        mo29052a(str, str2, str3, i, System.currentTimeMillis(), str4);
    }

    /* renamed from: a */
    public void mo29054a(String str, String str2, String str3, String str4) {
        mo29052a(str, str2, str3, 5002, System.currentTimeMillis(), str4);
    }

    /* renamed from: b */
    public void mo29055b(String str, String str2, String str3, String str4) {
        mo29052a(str, str2, str3, 5001, System.currentTimeMillis(), str4);
    }

    /* renamed from: c */
    public void mo29056c(String str, String str2, String str3, String str4) {
        mo29052a(str, str2, str3, ReturnCode.E_ACCOUNT_LOGOUT, System.currentTimeMillis(), str4);
    }
}

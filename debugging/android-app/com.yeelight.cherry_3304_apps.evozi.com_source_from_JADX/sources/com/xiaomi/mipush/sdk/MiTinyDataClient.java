package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4739hm;
import com.xiaomi.push.C4743hq;
import com.xiaomi.push.C4752hz;
import com.xiaomi.push.C4765il;
import com.xiaomi.push.service.C4858an;
import com.xiaomi.push.service.C4890bi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MiTinyDataClient {
    public static final String PENDING_REASON_APPID = "com.xiaomi.xmpushsdk.tinydataPending.appId";
    public static final String PENDING_REASON_CHANNEL = "com.xiaomi.xmpushsdk.tinydataPending.channel";
    public static final String PENDING_REASON_INIT = "com.xiaomi.xmpushsdk.tinydataPending.init";

    /* renamed from: com.xiaomi.mipush.sdk.MiTinyDataClient$a */
    public static class C4027a {

        /* renamed from: a */
        private static volatile C4027a f6837a;
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Context f6838a;

        /* renamed from: a */
        private C4028a f6839a = new C4028a();

        /* renamed from: a */
        private Boolean f6840a;

        /* renamed from: a */
        private String f6841a;

        /* renamed from: a */
        private final ArrayList<C4743hq> f6842a = new ArrayList<>();

        /* renamed from: com.xiaomi.mipush.sdk.MiTinyDataClient$a$a */
        public class C4028a {

            /* renamed from: a */
            private final Runnable f6844a = new C4035ae(this);

            /* renamed from: a */
            public final ArrayList<C4743hq> f6845a = new ArrayList<>();
            /* access modifiers changed from: private */

            /* renamed from: a */
            public ScheduledFuture<?> f6846a;

            /* renamed from: a */
            private ScheduledThreadPoolExecutor f6847a = new ScheduledThreadPoolExecutor(1);

            public C4028a() {
            }

            /* renamed from: a */
            private void m10768a() {
                if (this.f6846a == null) {
                    this.f6846a = this.f6847a.scheduleAtFixedRate(this.f6844a, 1000, 1000, TimeUnit.MILLISECONDS);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public void m10770b() {
                C4743hq remove = this.f6845a.remove(0);
                for (C4765il a : C4890bi.m15703a(Arrays.asList(new C4743hq[]{remove}), C4027a.this.f6838a.getPackageName(), C4056b.m10888a(C4027a.this.f6838a).mo22930a(), 30720)) {
                    C3989b.m10680c("MiTinyDataClient Send item by PushServiceClient.sendMessage(XmActionNotification)." + remove.mo25277d());
                    C4047aq.m10835a(C4027a.this.f6838a).mo22912a(a, C4739hm.Notification, true, (C4752hz) null);
                }
            }

            /* renamed from: a */
            public void mo22859a(C4743hq hqVar) {
                this.f6847a.execute(new C4034ad(this, hqVar));
            }
        }

        /* renamed from: a */
        public static C4027a mo22856a() {
            if (f6837a == null) {
                synchronized (C4027a.class) {
                    if (f6837a == null) {
                        f6837a = new C4027a();
                    }
                }
            }
            return f6837a;
        }

        /* renamed from: a */
        private void mo22857a(C4743hq hqVar) {
            synchronized (this.f6842a) {
                if (!this.f6842a.contains(hqVar)) {
                    this.f6842a.add(hqVar);
                    if (this.f6842a.size() > 100) {
                        this.f6842a.remove(0);
                    }
                }
            }
        }

        /* renamed from: a */
        private boolean mo22854a(Context context) {
            if (!C4047aq.m10835a(context).mo22903a()) {
                return true;
            }
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
                return packageInfo != null && packageInfo.versionCode >= 108;
            } catch (Exception unused) {
                return false;
            }
        }

        /* renamed from: b */
        private boolean m10759b(Context context) {
            return C4056b.m10888a(context).mo22930a() == null && !mo22854a(this.f6838a);
        }

        /* renamed from: b */
        private boolean m10760b(C4743hq hqVar) {
            if (C4890bi.m15705a(hqVar, false)) {
                return false;
            }
            if (this.f6840a.booleanValue()) {
                C3989b.m10680c("MiTinyDataClient Send item by PushServiceClient.sendTinyData(ClientUploadDataItem)." + hqVar.mo25277d());
                C4047aq.m10835a(this.f6838a).mo22907a(hqVar);
                return true;
            }
            this.f6839a.mo22859a(hqVar);
            return true;
        }

        /* renamed from: a */
        public void m10761a(Context context) {
            if (context == null) {
                C3989b.m10669a("context is null, MiTinyDataClientImp.init() failed.");
                return;
            }
            this.f6838a = context;
            this.f6840a = Boolean.valueOf(mo22854a(context));
            mo22858b(MiTinyDataClient.PENDING_REASON_INIT);
        }

        /* renamed from: a */
        public synchronized void mo22855a(String str) {
            if (TextUtils.isEmpty(str)) {
                C3989b.m10669a("channel is null, MiTinyDataClientImp.setChannel(String) failed.");
                return;
            }
            this.f6841a = str;
            mo22858b(MiTinyDataClient.PENDING_REASON_CHANNEL);
        }

        /* renamed from: a */
        public boolean m10763a() {
            return this.f6838a != null;
        }

        /* renamed from: a */
        public synchronized boolean m10764a(C4743hq hqVar) {
            String str;
            boolean z = false;
            if (hqVar == null) {
                return false;
            }
            if (C4890bi.m15705a(hqVar, true)) {
                return false;
            }
            boolean z2 = TextUtils.isEmpty(hqVar.mo25264a()) && TextUtils.isEmpty(this.f6841a);
            boolean z3 = !mo22856a();
            if (this.f6838a == null || m10759b(this.f6838a)) {
                z = true;
            }
            if (!z3 && !z2) {
                if (!z) {
                    C3989b.m10680c("MiTinyDataClient Send item immediately." + hqVar.mo25277d());
                    if (TextUtils.isEmpty(hqVar.mo25277d())) {
                        hqVar.mo25281f(C4858an.m15586a());
                    }
                    if (TextUtils.isEmpty(hqVar.mo25264a())) {
                        hqVar.mo25266a(this.f6841a);
                    }
                    if (TextUtils.isEmpty(hqVar.mo25273c())) {
                        hqVar.mo25278e(this.f6838a.getPackageName());
                    }
                    if (hqVar.mo25264a() <= 0) {
                        hqVar.mo25268b(System.currentTimeMillis());
                    }
                    return m10760b(hqVar);
                }
            }
            if (z2) {
                str = "MiTinyDataClient Pending " + hqVar.mo25270b() + " reason is " + MiTinyDataClient.PENDING_REASON_CHANNEL;
            } else if (z3) {
                str = "MiTinyDataClient Pending " + hqVar.mo25270b() + " reason is " + MiTinyDataClient.PENDING_REASON_INIT;
            } else {
                if (z) {
                    str = "MiTinyDataClient Pending " + hqVar.mo25270b() + " reason is " + MiTinyDataClient.PENDING_REASON_APPID;
                }
                mo22857a(hqVar);
                return true;
            }
            C3989b.m10680c(str);
            mo22857a(hqVar);
            return true;
        }

        /* renamed from: b */
        public void mo22858b(String str) {
            C3989b.m10680c("MiTinyDataClient.processPendingList(" + str + ")");
            ArrayList arrayList = new ArrayList();
            synchronized (this.f6842a) {
                arrayList.addAll(this.f6842a);
                this.f6842a.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                mo22857a((C4743hq) it.next());
            }
        }
    }

    public static void init(Context context, String str) {
        if (context == null) {
            C3989b.m10669a("context is null, MiTinyDataClient.init(Context, String) failed.");
            return;
        }
        C4027a.mo22856a().mo22854a(context);
        if (TextUtils.isEmpty(str)) {
            C3989b.m10669a("channel is null or empty, MiTinyDataClient.init(Context, String) failed.");
        } else {
            C4027a.mo22856a().mo22855a(str);
        }
    }

    public static boolean upload(Context context, C4743hq hqVar) {
        C3989b.m10680c("MiTinyDataClient.upload " + hqVar.mo25277d());
        if (!C4027a.mo22856a().mo22856a()) {
            C4027a.mo22856a().mo22854a(context);
        }
        return C4027a.mo22856a().mo22857a(hqVar);
    }

    public static boolean upload(Context context, String str, String str2, long j, String str3) {
        C4743hq hqVar = new C4743hq();
        hqVar.mo25276d(str);
        hqVar.mo25272c(str2);
        hqVar.mo25265a(j);
        hqVar.mo25269b(str3);
        hqVar.mo25267a(true);
        hqVar.mo25266a("push_sdk_channel");
        return upload(context, hqVar);
    }

    public static boolean upload(String str, String str2, long j, String str3) {
        C4743hq hqVar = new C4743hq();
        hqVar.mo25276d(str);
        hqVar.mo25272c(str2);
        hqVar.mo25265a(j);
        hqVar.mo25269b(str3);
        return C4027a.mo22856a().mo22857a(hqVar);
    }
}

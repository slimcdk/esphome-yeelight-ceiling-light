package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4760hj;
import com.xiaomi.push.C4764hn;
import com.xiaomi.push.C4773hw;
import com.xiaomi.push.C4786ii;
import com.xiaomi.push.service.C4902bd;
import com.xiaomi.push.service.C4935bz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MiTinyDataClient {
    public static final String PENDING_REASON_APPID = "com.xiaomi.xmpushsdk.tinydataPending.appId";
    public static final String PENDING_REASON_CHANNEL = "com.xiaomi.xmpushsdk.tinydataPending.channel";
    public static final String PENDING_REASON_INIT = "com.xiaomi.xmpushsdk.tinydataPending.init";

    /* renamed from: com.xiaomi.mipush.sdk.MiTinyDataClient$a */
    public static class C4447a {

        /* renamed from: a */
        private static volatile C4447a f7404a;
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Context f7405a;

        /* renamed from: a */
        private C4448a f7406a = new C4448a();

        /* renamed from: a */
        private Boolean f7407a;

        /* renamed from: a */
        private String f7408a;

        /* renamed from: a */
        private final ArrayList<C4764hn> f7409a = new ArrayList<>();

        /* renamed from: com.xiaomi.mipush.sdk.MiTinyDataClient$a$a */
        public class C4448a {

            /* renamed from: a */
            private final Runnable f7411a = new C4452ab(this);

            /* renamed from: a */
            public final ArrayList<C4764hn> f7412a = new ArrayList<>();
            /* access modifiers changed from: private */

            /* renamed from: a */
            public ScheduledFuture<?> f7413a;

            /* renamed from: a */
            private ScheduledThreadPoolExecutor f7414a = new ScheduledThreadPoolExecutor(1);

            public C4448a() {
            }

            /* renamed from: a */
            private void m12577a() {
                if (this.f7413a == null) {
                    this.f7413a = this.f7414a.scheduleAtFixedRate(this.f7411a, 1000, 1000, TimeUnit.MILLISECONDS);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public void m12579b() {
                C4764hn remove = this.f7412a.remove(0);
                for (C4786ii a : C4935bz.m15495a((List<C4764hn>) Arrays.asList(new C4764hn[]{remove}), C4447a.this.f7405a.getPackageName(), C4475b.m12705a(C4447a.this.f7405a).mo28684a(), 30720)) {
                    C4408b.m12482c("MiTinyDataClient Send item by PushServiceClient.sendMessage(XmActionNotification)." + remove.mo29308d());
                    C4465ao.m12646a(C4447a.this.f7405a).mo28663a(a, C4760hj.Notification, true, (C4773hw) null);
                }
            }

            /* renamed from: a */
            public void mo28606a(C4764hn hnVar) {
                this.f7414a.execute(new C4451aa(this, hnVar));
            }
        }

        /* renamed from: a */
        public static C4447a mo28603a() {
            if (f7404a == null) {
                synchronized (C4447a.class) {
                    if (f7404a == null) {
                        f7404a = new C4447a();
                    }
                }
            }
            return f7404a;
        }

        /* renamed from: a */
        private void mo28604a(C4764hn hnVar) {
            synchronized (this.f7409a) {
                if (!this.f7409a.contains(hnVar)) {
                    this.f7409a.add(hnVar);
                    if (this.f7409a.size() > 100) {
                        this.f7409a.remove(0);
                    }
                }
            }
        }

        /* renamed from: a */
        private boolean mo28601a(Context context) {
            if (!C4465ao.m12646a(context).mo28653a()) {
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
        private boolean m12568b(Context context) {
            return C4475b.m12705a(context).mo28684a() == null && !mo28601a(this.f7405a);
        }

        /* renamed from: b */
        private boolean m12569b(C4764hn hnVar) {
            if (C4935bz.m15498a(hnVar, false)) {
                return false;
            }
            if (this.f7407a.booleanValue()) {
                C4408b.m12482c("MiTinyDataClient Send item by PushServiceClient.sendTinyData(ClientUploadDataItem)." + hnVar.mo29308d());
                C4465ao.m12646a(this.f7405a).mo28658a(hnVar);
                return true;
            }
            this.f7406a.mo28606a(hnVar);
            return true;
        }

        /* renamed from: a */
        public void m12570a(Context context) {
            if (context == null) {
                C4408b.m12464a("context is null, MiTinyDataClientImp.init() failed.");
                return;
            }
            this.f7405a = context;
            this.f7407a = Boolean.valueOf(mo28601a(context));
            mo28605b(MiTinyDataClient.PENDING_REASON_INIT);
        }

        /* renamed from: a */
        public synchronized void mo28602a(String str) {
            if (TextUtils.isEmpty(str)) {
                C4408b.m12464a("channel is null, MiTinyDataClientImp.setChannel(String) failed.");
                return;
            }
            this.f7408a = str;
            mo28605b(MiTinyDataClient.PENDING_REASON_CHANNEL);
        }

        /* renamed from: a */
        public boolean m12572a() {
            return this.f7405a != null;
        }

        /* renamed from: a */
        public synchronized boolean m12573a(C4764hn hnVar) {
            String str;
            boolean z = false;
            if (hnVar == null) {
                return false;
            }
            if (C4935bz.m15498a(hnVar, true)) {
                return false;
            }
            boolean z2 = TextUtils.isEmpty(hnVar.mo29293a()) && TextUtils.isEmpty(this.f7408a);
            boolean z3 = !mo28603a();
            Context context = this.f7405a;
            if (context == null || m12568b(context)) {
                z = true;
            }
            if (!z3 && !z2) {
                if (!z) {
                    C4408b.m12482c("MiTinyDataClient Send item immediately." + hnVar.mo29308d());
                    if (TextUtils.isEmpty(hnVar.mo29308d())) {
                        hnVar.mo29312f(C4902bd.m15380a());
                    }
                    if (TextUtils.isEmpty(hnVar.mo29293a())) {
                        hnVar.mo29295a(this.f7408a);
                    }
                    if (TextUtils.isEmpty(hnVar.mo29304c())) {
                        hnVar.mo29309e(this.f7405a.getPackageName());
                    }
                    if (hnVar.mo29293a() <= 0) {
                        hnVar.mo29299b(System.currentTimeMillis());
                    }
                    return m12569b(hnVar);
                }
            }
            if (z2) {
                str = "MiTinyDataClient Pending " + hnVar.mo29301b() + " reason is " + MiTinyDataClient.PENDING_REASON_CHANNEL;
            } else if (z3) {
                str = "MiTinyDataClient Pending " + hnVar.mo29301b() + " reason is " + MiTinyDataClient.PENDING_REASON_INIT;
            } else {
                if (z) {
                    str = "MiTinyDataClient Pending " + hnVar.mo29301b() + " reason is " + MiTinyDataClient.PENDING_REASON_APPID;
                }
                mo28604a(hnVar);
                return true;
            }
            C4408b.m12482c(str);
            mo28604a(hnVar);
            return true;
        }

        /* renamed from: b */
        public void mo28605b(String str) {
            C4408b.m12482c("MiTinyDataClient.processPendingList(" + str + ")");
            ArrayList arrayList = new ArrayList();
            synchronized (this.f7409a) {
                arrayList.addAll(this.f7409a);
                this.f7409a.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                mo28604a((C4764hn) it.next());
            }
        }
    }

    public static void init(Context context, String str) {
        if (context == null) {
            C4408b.m12464a("context is null, MiTinyDataClient.init(Context, String) failed.");
            return;
        }
        C4447a.mo28603a().mo28601a(context);
        if (TextUtils.isEmpty(str)) {
            C4408b.m12464a("channel is null or empty, MiTinyDataClient.init(Context, String) failed.");
        } else {
            C4447a.mo28603a().mo28602a(str);
        }
    }

    public static boolean upload(Context context, C4764hn hnVar) {
        C4408b.m12482c("MiTinyDataClient.upload " + hnVar.mo29308d());
        if (!C4447a.mo28603a().mo28603a()) {
            C4447a.mo28603a().mo28601a(context);
        }
        return C4447a.mo28603a().mo28604a(hnVar);
    }

    public static boolean upload(Context context, String str, String str2, long j, String str3) {
        C4764hn hnVar = new C4764hn();
        hnVar.mo29307d(str);
        hnVar.mo29303c(str2);
        hnVar.mo29294a(j);
        hnVar.mo29300b(str3);
        hnVar.mo29297a(true);
        hnVar.mo29295a("push_sdk_channel");
        return upload(context, hnVar);
    }

    public static boolean upload(String str, String str2, long j, String str3) {
        C4764hn hnVar = new C4764hn();
        hnVar.mo29307d(str);
        hnVar.mo29303c(str2);
        hnVar.mo29294a(j);
        hnVar.mo29300b(str3);
        return C4447a.mo28603a().mo28604a(hnVar);
    }
}

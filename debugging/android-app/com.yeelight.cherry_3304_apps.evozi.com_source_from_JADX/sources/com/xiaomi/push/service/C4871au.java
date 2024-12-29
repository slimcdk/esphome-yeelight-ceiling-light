package com.xiaomi.push.service;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4521az;
import com.xiaomi.push.C4582cv;
import com.xiaomi.push.C4585cy;
import com.xiaomi.push.C4586cz;
import com.xiaomi.push.C4630ej;
import com.xiaomi.push.C4632ek;
import com.xiaomi.push.C4669fh;
import com.xiaomi.push.C4680fs;
import com.xiaomi.push.C4715gu;
import com.xiaomi.push.C4728he;
import com.xiaomi.push.C4731hg;
import com.xiaomi.push.C4937t;
import com.xiaomi.push.service.C4884be;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.xiaomi.push.service.au */
public class C4871au extends C4884be.C4885a implements C4586cz.C4587a {

    /* renamed from: a */
    private long f10052a;

    /* renamed from: a */
    private XMPushService f10053a;

    /* renamed from: com.xiaomi.push.service.au$a */
    static class C4872a implements C4586cz.C4588b {
        C4872a() {
        }

        /* renamed from: a */
        public String mo24902a(String str) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter("sdkver", String.valueOf(39));
            buildUpon.appendQueryParameter("osver", String.valueOf(Build.VERSION.SDK_INT));
            buildUpon.appendQueryParameter("os", C4715gu.m14461a(Build.MODEL + Constants.COLON_SEPARATOR + Build.VERSION.INCREMENTAL));
            buildUpon.appendQueryParameter("mi", String.valueOf(C4937t.m15865a()));
            String builder = buildUpon.toString();
            C3989b.m10680c("fetch bucket from : " + builder);
            URL url = new URL(builder);
            int port = url.getPort() == -1 ? 80 : url.getPort();
            try {
                long currentTimeMillis = System.currentTimeMillis();
                String a = C4521az.m13358a(C4937t.m15865a(), url);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                C4731hg.m14528a(url.getHost() + Constants.COLON_SEPARATOR + port, (int) currentTimeMillis2, (Exception) null);
                return a;
            } catch (IOException e) {
                C4731hg.m14528a(url.getHost() + Constants.COLON_SEPARATOR + port, -1, e);
                throw e;
            }
        }
    }

    /* renamed from: com.xiaomi.push.service.au$b */
    static class C4873b extends C4586cz {
        protected C4873b(Context context, C4585cy cyVar, C4586cz.C4588b bVar, String str) {
            super(context, cyVar, bVar, str);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo24891a(ArrayList<String> arrayList, String str, String str2, boolean z) {
            try {
                if (C4728he.mo25240a().mo25240a()) {
                    str2 = C4884be.mo25947a();
                }
                return super.mo24891a(arrayList, str, str2, z);
            } catch (IOException e) {
                C4731hg.m14525a(0, C4669fh.GSLB_ERR.mo25070a(), 1, (String) null, C4521az.m13366b(C4586cz.f8354a) ? 1 : 0);
                throw e;
            }
        }
    }

    C4871au(XMPushService xMPushService) {
        this.f10053a = xMPushService;
    }

    /* renamed from: a */
    public static void m15634a(XMPushService xMPushService) {
        C4871au auVar = new C4871au(xMPushService);
        C4884be.mo25947a().mo25949a((C4884be.C4885a) auVar);
        synchronized (C4586cz.class) {
            C4586cz.m13656a((C4586cz.C4587a) auVar);
            C4586cz.m13655a(xMPushService, (C4585cy) null, new C4872a(), TimerCodec.DISENABLE, "push", "2.2");
        }
    }

    /* renamed from: a */
    public C4586cz mo24901a(Context context, C4585cy cyVar, C4586cz.C4588b bVar, String str) {
        return new C4873b(context, cyVar, bVar, str);
    }

    /* renamed from: a */
    public void mo25937a(C4630ej.C4631a aVar) {
    }

    /* renamed from: a */
    public void mo25245a(C4632ek.C4634b bVar) {
        C4582cv b;
        if (bVar.mo24936b() && bVar.mo24930a() && System.currentTimeMillis() - this.f10052a > 3600000) {
            C3989b.m10669a("fetch bucket :" + bVar.mo24930a());
            this.f10052a = System.currentTimeMillis();
            C4586cz a = C4586cz.mo24892a();
            a.mo24892a();
            a.mo24895b();
            C4680fs a2 = this.f10053a.mo25867a();
            if (a2 != null && (b = a.mo24894b(a2.mo25134a().mo25164c())) != null) {
                ArrayList a3 = b.mo24863a();
                boolean z = true;
                Iterator it = a3.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((String) it.next()).equals(a2.mo25134a())) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z && !a3.isEmpty()) {
                    C3989b.m10669a("bucket changed, force reconnect");
                    this.f10053a.mo25869a(0, (Exception) null);
                    this.f10053a.mo25877a(false);
                }
            }
        }
    }
}

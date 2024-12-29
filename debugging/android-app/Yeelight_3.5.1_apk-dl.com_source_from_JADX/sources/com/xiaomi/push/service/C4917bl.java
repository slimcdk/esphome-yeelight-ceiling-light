package com.xiaomi.push.service;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4551bj;
import com.xiaomi.push.C4596cr;
import com.xiaomi.push.C4599cu;
import com.xiaomi.push.C4600cv;
import com.xiaomi.push.C4635dw;
import com.xiaomi.push.C4637dx;
import com.xiaomi.push.C4679ez;
import com.xiaomi.push.C4689fh;
import com.xiaomi.push.C4692fj;
import com.xiaomi.push.C4711fw;
import com.xiaomi.push.C4745gy;
import com.xiaomi.push.C4994v;
import com.xiaomi.push.service.C4929bv;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.xiaomi.push.service.bl */
public class C4917bl extends C4929bv.C4930a implements C4600cv.C4601a {

    /* renamed from: a */
    private long f9605a;

    /* renamed from: a */
    private XMPushService f9606a;

    /* renamed from: com.xiaomi.push.service.bl$a */
    static class C4918a implements C4600cv.C4602b {
        C4918a() {
        }

        /* renamed from: a */
        public String mo28892a(String str) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter("sdkver", String.valueOf(48));
            buildUpon.appendQueryParameter("osver", String.valueOf(Build.VERSION.SDK_INT));
            buildUpon.appendQueryParameter("os", C4745gy.m14115a(Build.MODEL + Constants.COLON_SEPARATOR + Build.VERSION.INCREMENTAL));
            buildUpon.appendQueryParameter("mi", String.valueOf(C4994v.m15733a()));
            String builder = buildUpon.toString();
            C4408b.m12482c("fetch bucket from : " + builder);
            URL url = new URL(builder);
            int port = url.getPort() == -1 ? 80 : url.getPort();
            try {
                long currentTimeMillis = System.currentTimeMillis();
                String a = C4551bj.m12992a(C4994v.m15733a(), url);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                C4692fj.m13854a(url.getHost() + Constants.COLON_SEPARATOR + port, (int) currentTimeMillis2, (Exception) null);
                return a;
            } catch (IOException e) {
                C4692fj.m13854a(url.getHost() + Constants.COLON_SEPARATOR + port, -1, e);
                throw e;
            }
        }
    }

    /* renamed from: com.xiaomi.push.service.bl$b */
    static class C4919b extends C4600cv {
        protected C4919b(Context context, C4599cu cuVar, C4600cv.C4602b bVar, String str) {
            super(context, cuVar, bVar, str);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo28880a(ArrayList<String> arrayList, String str, String str2, boolean z) {
            try {
                if (C4689fh.mo29139a().mo29139a()) {
                    str2 = C4929bv.mo30029a();
                }
                return super.mo28880a(arrayList, str, str2, z);
            } catch (IOException e) {
                C4692fj.m13851a(0, C4679ez.GSLB_ERR.mo29089a(), 1, (String) null, C4551bj.m13001c(C4600cv.f7753a) ? 1 : 0);
                throw e;
            }
        }
    }

    C4917bl(XMPushService xMPushService) {
        this.f9606a = xMPushService;
    }

    /* renamed from: a */
    public static void m15432a(XMPushService xMPushService) {
        C4917bl blVar = new C4917bl(xMPushService);
        C4929bv.mo30029a().mo30031a((C4929bv.C4930a) blVar);
        synchronized (C4600cv.class) {
            C4600cv.m13230a((C4600cv.C4601a) blVar);
            C4600cv.m13229a(xMPushService, (C4599cu) null, new C4918a(), TimerCodec.DISENABLE, "push", "2.2");
        }
    }

    /* renamed from: a */
    public C4600cv mo28891a(Context context, C4599cu cuVar, C4600cv.C4602b bVar, String str) {
        return new C4919b(context, cuVar, bVar, str);
    }

    /* renamed from: a */
    public void mo30022a(C4635dw.C4636a aVar) {
    }

    /* renamed from: a */
    public void mo29144a(C4637dx.C4639b bVar) {
        C4596cr b;
        if (bVar.mo28930b() && bVar.mo28924a() && System.currentTimeMillis() - this.f9605a > 3600000) {
            C4408b.m12464a("fetch bucket :" + bVar.mo28924a());
            this.f9605a = System.currentTimeMillis();
            C4600cv a = C4600cv.mo28881a();
            a.mo28881a();
            a.mo28884b();
            C4711fw a2 = this.f9606a.mo29927a();
            if (a2 != null && (b = a.mo28883b(a2.mo29170a().mo29201c())) != null) {
                ArrayList a3 = b.mo28852a();
                boolean z = true;
                Iterator it = a3.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((String) it.next()).equals(a2.mo29170a())) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z && !a3.isEmpty()) {
                    C4408b.m12464a("bucket changed, force reconnect");
                    this.f9606a.mo29929a(0, (Exception) null);
                    this.f9606a.mo29937a(false);
                }
            }
        }
    }
}

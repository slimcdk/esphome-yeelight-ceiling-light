package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.C4491ab;
import com.xiaomi.push.C4498ai;
import com.xiaomi.push.C4508ao;
import com.xiaomi.push.C4521az;
import com.xiaomi.push.C4531be;
import com.xiaomi.push.C4586cz;
import com.xiaomi.push.C4599di;
import com.xiaomi.push.C4649eq;
import com.xiaomi.push.C4653eu;
import com.xiaomi.push.C4662fb;
import com.xiaomi.push.C4663fc;
import com.xiaomi.push.C4673fl;
import com.xiaomi.push.C4678fq;
import com.xiaomi.push.C4680fs;
import com.xiaomi.push.C4682ft;
import com.xiaomi.push.C4684fv;
import com.xiaomi.push.C4685fw;
import com.xiaomi.push.C4686fx;
import com.xiaomi.push.C4687fy;
import com.xiaomi.push.C4694gd;
import com.xiaomi.push.C4696gf;
import com.xiaomi.push.C4700gi;
import com.xiaomi.push.C4701gj;
import com.xiaomi.push.C4718gx;
import com.xiaomi.push.C4728he;
import com.xiaomi.push.C4731hg;
import com.xiaomi.push.C4733hh;
import com.xiaomi.push.C4737hk;
import com.xiaomi.push.C4738hl;
import com.xiaomi.push.C4739hm;
import com.xiaomi.push.C4744hr;
import com.xiaomi.push.C4753i;
import com.xiaomi.push.C4762ii;
import com.xiaomi.push.C4765il;
import com.xiaomi.push.C4766im;
import com.xiaomi.push.C4776iw;
import com.xiaomi.push.C4787jc;
import com.xiaomi.push.C4808l;
import com.xiaomi.push.C4811o;
import com.xiaomi.push.C4937t;
import com.xiaomi.push.service.C4860ap;
import com.xiaomi.push.service.C4910g;
import com.xiaomi.push.service.C4920l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class XMPushService extends Service implements C4684fv {

    /* renamed from: a */
    public static int f9876a = 1;

    /* renamed from: d */
    private static final int f9877d = Process.myPid();

    /* renamed from: a */
    private long f9878a = 0;

    /* renamed from: a */
    private ContentObserver f9879a;

    /* renamed from: a */
    Messenger f9880a = null;

    /* renamed from: a */
    private C4678fq f9881a;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C4680fs f9882a;

    /* renamed from: a */
    private C4682ft f9883a;

    /* renamed from: a */
    private C4686fx f9884a = new C4893bl(this);

    /* renamed from: a */
    private C4823e f9885a;

    /* renamed from: a */
    private C4834p f9886a;

    /* renamed from: a */
    private C4859ao f9887a = null;

    /* renamed from: a */
    private C4878az f9888a;

    /* renamed from: a */
    private C4907d f9889a;

    /* renamed from: a */
    private C4910g f9890a = null;

    /* renamed from: a */
    protected Class f9891a = XMJobService.class;

    /* renamed from: a */
    private String f9892a;

    /* renamed from: a */
    private ArrayList<C4830l> f9893a = new ArrayList<>();

    /* renamed from: a */
    private Collection<C4845af> f9894a = Collections.synchronizedCollection(new ArrayList());

    /* renamed from: b */
    private int f9895b = 0;

    /* renamed from: b */
    private ContentObserver f9896b;

    /* renamed from: c */
    private int f9897c = 0;

    /* renamed from: com.xiaomi.push.service.XMPushService$a */
    class C4819a extends C4827i {

        /* renamed from: a */
        C4860ap.C4862b f9899a = null;

        public C4819a(C4860ap.C4862b bVar) {
            super(9);
            this.f9899a = bVar;
        }

        /* renamed from: a */
        public String mo25172a() {
            return "bind the client. " + this.f9899a.f9998g;
        }

        /* renamed from: a */
        public void m15453a() {
            String str;
            try {
                if (!XMPushService.this.mo25882c()) {
                    C3989b.m10681d("trying bind while the connection is not created, quit!");
                    return;
                }
                C4860ap.C4862b a = C4860ap.mo25920a().mo25921a(this.f9899a.f9998g, this.f9899a.f9992b);
                if (a == null) {
                    str = "ignore bind because the channel " + this.f9899a.f9998g + " is removed ";
                } else if (a.f9986a == C4860ap.C4866c.unbind) {
                    a.mo25933a(C4860ap.C4866c.binding, 0, 0, (String) null, (String) null);
                    XMPushService.m15384a(XMPushService.this).mo25138a(a);
                    C4731hg.m14527a(XMPushService.this, a);
                    return;
                } else {
                    str = "trying duplicate bind, ingore! " + a.f9986a;
                }
                C3989b.m10669a(str);
            } catch (Exception e) {
                C3989b.m10678a((Throwable) e);
                XMPushService.this.mo25869a(10, e);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$b */
    static class C4820b extends C4827i {

        /* renamed from: a */
        private final C4860ap.C4862b f9900a;

        public C4820b(C4860ap.C4862b bVar) {
            super(12);
            this.f9900a = bVar;
        }

        /* renamed from: a */
        public String mo25172a() {
            return "bind time out. chid=" + this.f9900a.f9998g;
        }

        /* renamed from: a */
        public void m15455a() {
            this.f9900a.mo25933a(C4860ap.C4866c.unbind, 1, 21, (String) null, (String) null);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C4820b)) {
                return false;
            }
            return TextUtils.equals(((C4820b) obj).f9900a.f9998g, this.f9900a.f9998g);
        }

        public int hashCode() {
            return this.f9900a.f9998g.hashCode();
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$c */
    class C4821c extends C4827i {

        /* renamed from: a */
        private C4673fl f9901a = null;

        public C4821c(C4673fl flVar) {
            super(8);
            this.f9901a = flVar;
        }

        /* renamed from: a */
        public String mo25172a() {
            return "receive a message.";
        }

        /* renamed from: a */
        public void m15457a() {
            XMPushService.m15384a(XMPushService.this).mo25917a(this.f9901a);
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$d */
    public class C4822d extends C4827i {
        C4822d() {
            super(1);
        }

        /* renamed from: a */
        public String mo25172a() {
            return "do reconnect..";
        }

        /* renamed from: a */
        public void m15459a() {
            if (XMPushService.this.mo25867a()) {
                XMPushService.this.m15415f();
            } else {
                C3989b.m10669a("should not connect. quit the job.");
            }
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$e */
    class C4823e extends BroadcastReceiver {
        C4823e() {
        }

        public void onReceive(Context context, Intent intent) {
            XMPushService.this.onStart(intent, XMPushService.f9876a);
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$f */
    public class C4824f extends C4827i {

        /* renamed from: a */
        public Exception f9906a;

        /* renamed from: b */
        public int f9907b;

        C4824f(int i, Exception exc) {
            super(2);
            this.f9907b = i;
            this.f9906a = exc;
        }

        /* renamed from: a */
        public String mo25172a() {
            return "disconnect the connection.";
        }

        /* renamed from: a */
        public void m15461a() {
            XMPushService.this.mo25869a(this.f9907b, this.f9906a);
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$g */
    class C4825g extends C4827i {
        C4825g() {
            super(SupportMenu.USER_MASK);
        }

        /* renamed from: a */
        public String mo25172a() {
            return "Init Job";
        }

        /* renamed from: a */
        public void m15463a() {
            XMPushService.m15403b(XMPushService.this);
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$h */
    class C4826h extends C4827i {

        /* renamed from: a */
        private Intent f9909a = null;

        public C4826h(Intent intent) {
            super(15);
            this.f9909a = intent;
        }

        /* renamed from: a */
        public String mo25172a() {
            return "Handle intent action = " + this.f9909a.getAction();
        }

        /* renamed from: a */
        public void m15465a() {
            XMPushService.this.m15407c(this.f9909a);
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$i */
    public static abstract class C4827i extends C4910g.C4912b {
        public C4827i(int i) {
            super(i);
        }

        /* renamed from: a */
        public abstract String mo25172a();

        /* renamed from: a */
        public abstract void m15467a();

        public void run() {
            int i = this.f10135a;
            if (!(i == 4 || i == 8)) {
                C3989b.m10669a("JOB: " + mo25172a());
            }
            mo25172a();
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$j */
    class C4828j extends C4827i {
        public C4828j() {
            super(5);
        }

        /* renamed from: a */
        public String mo25172a() {
            return "ask the job queue to quit";
        }

        /* renamed from: a */
        public void m15469a() {
            XMPushService.m15384a(XMPushService.this).mo25973a();
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$k */
    class C4829k extends C4827i {

        /* renamed from: a */
        private C4701gj f9912a = null;

        public C4829k(C4701gj gjVar) {
            super(8);
            this.f9912a = gjVar;
        }

        /* renamed from: a */
        public String mo25172a() {
            return "receive a message.";
        }

        /* renamed from: a */
        public void m15471a() {
            XMPushService.m15384a(XMPushService.this).mo25918a(this.f9912a);
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$l */
    public interface C4830l {
        /* renamed from: a */
        void mo25246a();
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$m */
    class C4831m extends C4827i {

        /* renamed from: a */
        boolean f9915a;

        public C4831m(boolean z) {
            super(4);
            this.f9915a = z;
        }

        /* renamed from: a */
        public String mo25172a() {
            return "send ping..";
        }

        /* renamed from: a */
        public void m15474a() {
            if (XMPushService.this.mo25882c()) {
                try {
                    if (!this.f9915a) {
                        C4731hg.m14522a();
                    }
                    XMPushService.m15384a(XMPushService.this).mo25154b(this.f9915a);
                } catch (C4694gd e) {
                    C3989b.m10678a((Throwable) e);
                    XMPushService.this.mo25869a(10, (Exception) e);
                }
            }
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$n */
    class C4832n extends C4827i {

        /* renamed from: a */
        C4860ap.C4862b f9917a = null;

        public C4832n(C4860ap.C4862b bVar) {
            super(4);
            this.f9917a = bVar;
        }

        /* renamed from: a */
        public String mo25172a() {
            return "rebind the client. " + this.f9917a.f9998g;
        }

        /* renamed from: a */
        public void m15476a() {
            try {
                this.f9917a.mo25933a(C4860ap.C4866c.unbind, 1, 16, (String) null, (String) null);
                XMPushService.m15384a(XMPushService.this).mo25139a(this.f9917a.f9998g, this.f9917a.f9992b);
                this.f9917a.mo25933a(C4860ap.C4866c.binding, 1, 16, (String) null, (String) null);
                XMPushService.m15384a(XMPushService.this).mo25138a(this.f9917a);
            } catch (C4694gd e) {
                C3989b.m10678a((Throwable) e);
                XMPushService.this.mo25869a(10, (Exception) e);
            }
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$o */
    class C4833o extends C4827i {
        C4833o() {
            super(3);
        }

        /* renamed from: a */
        public String mo25172a() {
            return "reset the connection.";
        }

        /* renamed from: a */
        public void m15478a() {
            XMPushService.this.mo25869a(11, (Exception) null);
            if (XMPushService.this.mo25867a()) {
                XMPushService.this.m15415f();
            }
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$p */
    class C4834p extends BroadcastReceiver {
        C4834p() {
        }

        public void onReceive(Context context, Intent intent) {
            XMPushService.this.onStart(intent, 1);
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$q */
    class C4835q extends C4827i {

        /* renamed from: a */
        C4860ap.C4862b f9921a = null;

        /* renamed from: a */
        String f9922a;

        /* renamed from: b */
        int f9923b;

        /* renamed from: b */
        String f9924b;

        public C4835q(C4860ap.C4862b bVar, int i, String str, String str2) {
            super(9);
            this.f9921a = bVar;
            this.f9923b = i;
            this.f9922a = str;
            this.f9924b = str2;
        }

        /* renamed from: a */
        public String mo25172a() {
            return "unbind the channel. " + this.f9921a.f9998g;
        }

        /* renamed from: a */
        public void m15480a() {
            if (!(this.f9921a.f9986a == C4860ap.C4866c.unbind || XMPushService.m15384a(XMPushService.this) == null)) {
                try {
                    XMPushService.m15384a(XMPushService.this).mo25139a(this.f9921a.f9998g, this.f9921a.f9992b);
                } catch (C4694gd e) {
                    C3989b.m10678a((Throwable) e);
                    XMPushService.this.mo25869a(10, (Exception) e);
                }
            }
            this.f9921a.mo25933a(C4860ap.C4866c.unbind, this.f9923b, 0, this.f9924b, this.f9922a);
        }
    }

    static {
        C4586cz.m13657a("cn.app.chat.xiaomi.net", "cn.app.chat.xiaomi.net");
    }

    @TargetApi(11)
    /* renamed from: a */
    public static Notification m15383a(Context context) {
        Intent intent = new Intent(context, XMPushService.class);
        if (Build.VERSION.SDK_INT >= 11) {
            Notification.Builder builder = new Notification.Builder(context);
            builder.setSmallIcon(context.getApplicationInfo().icon);
            builder.setContentTitle("Push Service");
            builder.setContentText("Push Service");
            builder.setContentIntent(PendingIntent.getActivity(context, 0, intent, 0));
            return builder.getNotification();
        }
        Notification notification = new Notification();
        PendingIntent service = PendingIntent.getService(context, 0, intent, 0);
        try {
            notification.getClass().getMethod("setLatestEventInfo", new Class[]{Context.class, CharSequence.class, CharSequence.class, PendingIntent.class}).invoke(notification, new Object[]{context, "Push Service", "Push Service", service});
        } catch (Exception e) {
            C3989b.m10678a((Throwable) e);
        }
        return notification;
    }

    /* renamed from: a */
    private C4701gj m15387a(C4701gj gjVar, String str, String str2) {
        StringBuilder sb;
        String str3;
        C4860ap a = C4860ap.mo25920a();
        List a2 = a.mo25922a(str);
        if (a2.isEmpty()) {
            sb = new StringBuilder();
            str3 = "open channel should be called first before sending a packet, pkg=";
        } else {
            gjVar.mo25224o(str);
            str = gjVar.mo25215k();
            if (TextUtils.isEmpty(str)) {
                str = (String) a2.get(0);
                gjVar.mo25218l(str);
            }
            C4860ap.C4862b a3 = a.mo25921a(str, gjVar.mo25219m());
            if (!mo25882c()) {
                sb = new StringBuilder();
                str3 = "drop a packet as the channel is not connected, chid=";
            } else if (a3 == null || a3.f9986a != C4860ap.C4866c.binded) {
                sb = new StringBuilder();
                str3 = "drop a packet as the channel is not opened, chid=";
            } else if (TextUtils.equals(str2, a3.f10000i)) {
                return gjVar;
            } else {
                sb = new StringBuilder();
                sb.append("invalid session. ");
                sb.append(str2);
                C3989b.m10669a(sb.toString());
                return null;
            }
        }
        sb.append(str3);
        sb.append(str);
        C3989b.m10669a(sb.toString());
        return null;
    }

    /* renamed from: a */
    private C4860ap.C4862b m15389a(String str, Intent intent) {
        C4860ap.C4862b a = C4860ap.mo25920a().mo25921a(str, intent.getStringExtra(C4870at.f10041p));
        if (a == null) {
            a = new C4860ap.C4862b(this);
        }
        a.f9998g = intent.getStringExtra(C4870at.f10043r);
        a.f9992b = intent.getStringExtra(C4870at.f10041p);
        a.f9994c = intent.getStringExtra(C4870at.f10045t);
        a.f9988a = intent.getStringExtra(C4870at.f10051z);
        a.f9996e = intent.getStringExtra(C4870at.f10049x);
        a.f9997f = intent.getStringExtra(C4870at.f10050y);
        a.f9990a = intent.getBooleanExtra(C4870at.f10048w, false);
        a.f9999h = intent.getStringExtra(C4870at.f10047v);
        a.f10000i = intent.getStringExtra(C4870at.f10018C);
        a.f9995d = intent.getStringExtra(C4870at.f10046u);
        a.f9987a = this.f9889a;
        a.mo25931a((Messenger) intent.getParcelableExtra(C4870at.f10022G));
        a.f9980a = getApplicationContext();
        C4860ap.mo25920a().mo25926a(a);
        return a;
    }

    /* renamed from: a */
    private String m15391a() {
        String str;
        C4508ao.m13301a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Object obj = new Object();
        String str2 = null;
        if ("com.xiaomi.xmsf".equals(getPackageName())) {
            C4875aw a = C4875aw.m15643a(this);
            str = null;
            while (true) {
                if (!TextUtils.isEmpty(str) && a.mo25938a() != 0) {
                    break;
                }
                if (TextUtils.isEmpty(str)) {
                    str = C4808l.m15357a("ro.miui.region");
                    if (TextUtils.isEmpty(str)) {
                        str = C4808l.m15357a("ro.product.locale.region");
                    }
                }
                try {
                    synchronized (obj) {
                        obj.wait(100);
                    }
                } catch (InterruptedException unused) {
                }
            }
        } else {
            str = C4808l.m15363b();
        }
        if (!TextUtils.isEmpty(str)) {
            C4836a.m15481a(getApplicationContext()).mo25897b(str);
            str2 = C4808l.m15357a(str).name();
        }
        C3989b.m10669a("wait region :" + str2 + " cost = " + (SystemClock.elapsedRealtime() - elapsedRealtime));
        return str2;
    }

    /* renamed from: a */
    private void m15393a(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null) {
            try {
                unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e) {
                C3989b.m10678a((Throwable) e);
            }
        }
    }

    /* renamed from: a */
    private void m15394a(Intent intent) {
        String stringExtra = intent.getStringExtra(C4870at.f10051z);
        String stringExtra2 = intent.getStringExtra(C4870at.f10018C);
        Bundle bundleExtra = intent.getBundleExtra("ext_packet");
        C4860ap a = C4860ap.mo25920a();
        C4673fl flVar = null;
        if (bundleExtra != null) {
            C4700gi giVar = (C4700gi) m15387a((C4701gj) new C4700gi(bundleExtra), stringExtra, stringExtra2);
            if (giVar != null) {
                flVar = C4673fl.m14224a((C4701gj) giVar, a.mo25921a(giVar.mo25215k(), giVar.mo25219m()).f9999h);
            } else {
                return;
            }
        } else {
            byte[] byteArrayExtra = intent.getByteArrayExtra("ext_raw_packet");
            if (byteArrayExtra != null) {
                long longExtra = intent.getLongExtra(C4870at.f10041p, 0);
                String stringExtra3 = intent.getStringExtra(C4870at.f10042q);
                String stringExtra4 = intent.getStringExtra("ext_chid");
                C4860ap.C4862b a2 = a.mo25921a(stringExtra4, Long.toString(longExtra));
                if (a2 != null) {
                    C4673fl flVar2 = new C4673fl();
                    try {
                        flVar2.mo25114a(Integer.parseInt(stringExtra4));
                    } catch (NumberFormatException unused) {
                    }
                    flVar2.mo25117a("SECMSG", (String) null);
                    flVar2.mo25115a(longExtra, "xiaomi.com", stringExtra3);
                    flVar2.mo25116a(intent.getStringExtra("ext_pkt_id"));
                    flVar2.mo25119a(byteArrayExtra, a2.f9999h);
                    flVar = flVar2;
                }
            }
        }
        if (flVar != null) {
            m15408c((C4827i) new C4880ba(this, flVar));
        }
    }

    /* renamed from: a */
    private void m15395a(Intent intent, int i) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
        boolean booleanExtra = intent.getBooleanExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
        C4765il ilVar = new C4765il();
        try {
            C4776iw.m15224a(ilVar, byteArrayExtra);
            C4498ai.m13271a(getApplicationContext()).mo24729a((C4498ai.C4499a) new C4879b(ilVar, new WeakReference(this), booleanExtra), i);
        } catch (C4787jc unused) {
            C3989b.m10681d("aw_ping : send help app ping  error");
        }
    }

    /* renamed from: a */
    private void m15398a(String str, int i) {
        Collection<C4860ap.C4862b> a = C4860ap.mo25920a().mo25922a(str);
        if (a != null) {
            for (C4860ap.C4862b bVar : a) {
                if (bVar != null) {
                    mo25871a((C4827i) new C4835q(bVar, i, (String) null, (String) null));
                }
            }
        }
        C4860ap.mo25920a().mo25922a(str);
    }

    /* renamed from: a */
    private boolean m15400a(String str, Intent intent) {
        C4860ap.C4862b a = C4860ap.mo25920a().mo25921a(str, intent.getStringExtra(C4870at.f10041p));
        boolean z = false;
        if (a == null || str == null) {
            return false;
        }
        String stringExtra = intent.getStringExtra(C4870at.f10018C);
        String stringExtra2 = intent.getStringExtra(C4870at.f10047v);
        if (!TextUtils.isEmpty(a.f10000i) && !TextUtils.equals(stringExtra, a.f10000i)) {
            C3989b.m10669a("session changed. old session=" + a.f10000i + ", new session=" + stringExtra + " chid = " + str);
            z = true;
        }
        if (stringExtra2.equals(a.f9999h)) {
            return z;
        }
        C3989b.m10669a("security changed. chid = " + str + " sechash = " + C4531be.m13428a(stringExtra2));
        return true;
    }

    /* renamed from: a */
    private int[] m15401a() {
        String[] split;
        String a = C4854ak.m15568a(getApplicationContext()).mo25907a(C4744hr.FallDownTimeRange.mo25291a(), "");
        if (!TextUtils.isEmpty(a) && (split = a.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) != null && split.length >= 2) {
            int[] iArr = new int[2];
            try {
                iArr[0] = Integer.valueOf(split[0]).intValue();
                iArr[1] = Integer.valueOf(split[1]).intValue();
                if (iArr[0] < 0 || iArr[0] > 23 || iArr[1] < 0 || iArr[1] > 23 || iArr[0] == iArr[1]) {
                    return null;
                }
                return iArr;
            } catch (NumberFormatException e) {
                C3989b.m10681d("parse falldown time range failure: " + e);
            }
        }
        return null;
    }

    /* renamed from: b */
    private void m15402b(Intent intent) {
        String stringExtra = intent.getStringExtra(C4870at.f10051z);
        String stringExtra2 = intent.getStringExtra(C4870at.f10018C);
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("ext_packets");
        int length = parcelableArrayExtra.length;
        C4700gi[] giVarArr = new C4700gi[length];
        intent.getBooleanExtra("ext_encrypt", true);
        int i = 0;
        while (i < parcelableArrayExtra.length) {
            giVarArr[i] = new C4700gi((Bundle) parcelableArrayExtra[i]);
            giVarArr[i] = (C4700gi) m15387a((C4701gj) giVarArr[i], stringExtra, stringExtra2);
            if (giVarArr[i] != null) {
                i++;
            } else {
                return;
            }
        }
        C4860ap a = C4860ap.mo25920a();
        C4673fl[] flVarArr = new C4673fl[length];
        for (int i2 = 0; i2 < length; i2++) {
            C4700gi giVar = giVarArr[i2];
            flVarArr[i2] = C4673fl.m14224a((C4701gj) giVar, a.mo25921a(giVar.mo25215k(), giVar.mo25219m()).f9999h);
        }
        m15408c((C4827i) new C4906c(this, flVarArr));
    }

    /* renamed from: b */
    private void m15404b(boolean z) {
        this.f9878a = System.currentTimeMillis();
        if (mo25882c()) {
            if (this.f9882a.mo25156d() || this.f9882a.mo25157e() || C4521az.m13368d(this)) {
                m15408c((C4827i) new C4831m(z));
                return;
            }
            m15408c((C4827i) new C4824f(17, (Exception) null));
        }
        mo25877a(true);
    }

    /* renamed from: c */
    private void mo25882c() {
        String str;
        C4836a a = C4836a.m15481a(getApplicationContext());
        String a2 = a.mo25894a();
        C3989b.m10669a("region of cache is " + a2);
        if (TextUtils.isEmpty(a2)) {
            a2 = mo25867a();
        }
        if (!TextUtils.isEmpty(a2)) {
            this.f9892a = a2;
            a.mo25895a(a2);
            if (C4811o.Global.name().equals(this.f9892a)) {
                str = "app.chat.global.xiaomi.net";
            } else if (C4811o.Europe.name().equals(this.f9892a)) {
                str = "fr.app.chat.global.xiaomi.net";
            } else if (C4811o.Russia.name().equals(this.f9892a)) {
                str = "ru.app.chat.global.xiaomi.net";
            } else if (C4811o.India.name().equals(this.f9892a)) {
                str = "idmb.app.chat.global.xiaomi.net";
            }
            C4682ft.m14309a(str);
        } else {
            this.f9892a = C4811o.China.name();
        }
        if (C4811o.China.name().equals(this.f9892a)) {
            C4682ft.m14309a("cn.app.chat.xiaomi.net");
        }
        if (m15419h()) {
            C4903bv bvVar = new C4903bv(this, 11);
            mo25871a((C4827i) bvVar);
            C4920l.m15795a((C4920l.C4921a) new C4904bw(this, bvVar));
        }
        try {
            if (C4937t.m15865a()) {
                this.f9889a.mo25965a((Context) this);
            }
        } catch (Exception e) {
            C3989b.m10678a((Throwable) e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: com.xiaomi.push.service.XMPushService$n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: com.xiaomi.push.service.XMPushService$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v60, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v133, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v47, resolved type: com.xiaomi.push.service.ap$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v82, resolved type: com.xiaomi.push.service.XMPushService$o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v96, resolved type: com.xiaomi.push.service.bx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v97, resolved type: com.xiaomi.push.service.bx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v151, resolved type: com.xiaomi.push.service.bx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v98, resolved type: com.xiaomi.push.service.bx} */
    /* JADX WARNING: type inference failed for: r12v12, types: [com.xiaomi.push.service.XMPushService$i] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m15407c(android.content.Intent r12) {
        /*
            r11 = this;
            com.xiaomi.push.service.ap r0 = com.xiaomi.push.service.C4860ap.mo25920a()
            java.lang.String r1 = com.xiaomi.push.service.C4870at.f10029d
            java.lang.String r2 = r12.getAction()
            boolean r1 = r1.equalsIgnoreCase(r2)
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x0756
            java.lang.String r1 = com.xiaomi.push.service.C4870at.f10035j
            java.lang.String r5 = r12.getAction()
            boolean r1 = r1.equalsIgnoreCase(r5)
            if (r1 == 0) goto L_0x0021
            goto L_0x0756
        L_0x0021:
            java.lang.String r1 = com.xiaomi.push.service.C4870at.f10034i
            java.lang.String r5 = r12.getAction()
            boolean r1 = r1.equalsIgnoreCase(r5)
            if (r1 == 0) goto L_0x0091
            java.lang.String r1 = com.xiaomi.push.service.C4870at.f10051z
            java.lang.String r1 = r12.getStringExtra(r1)
            java.lang.String r3 = com.xiaomi.push.service.C4870at.f10043r
            java.lang.String r5 = r12.getStringExtra(r3)
            java.lang.String r3 = com.xiaomi.push.service.C4870at.f10041p
            java.lang.String r6 = r12.getStringExtra(r3)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r3 = "Service called close channel chid = "
            r12.append(r3)
            r12.append(r5)
            java.lang.String r3 = " res = "
            r12.append(r3)
            java.lang.String r3 = com.xiaomi.push.service.C4860ap.C4862b.m15611a((java.lang.String) r6)
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r12)
            boolean r12 = android.text.TextUtils.isEmpty(r5)
            if (r12 == 0) goto L_0x007d
            java.util.List r12 = r0.mo25922a((java.lang.String) r1)
            java.util.Iterator r12 = r12.iterator()
        L_0x006d:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x07ca
            java.lang.Object r0 = r12.next()
            java.lang.String r0 = (java.lang.String) r0
            r11.m15398a((java.lang.String) r0, (int) r2)
            goto L_0x006d
        L_0x007d:
            boolean r12 = android.text.TextUtils.isEmpty(r6)
            if (r12 == 0) goto L_0x0088
            r11.m15398a((java.lang.String) r5, (int) r2)
            goto L_0x07ca
        L_0x0088:
            r7 = 2
            r8 = 0
            r9 = 0
            r4 = r11
            r4.mo25875a(r5, r6, r7, r8, r9)
            goto L_0x07ca
        L_0x0091:
            java.lang.String r1 = com.xiaomi.push.service.C4870at.f10030e
            java.lang.String r2 = r12.getAction()
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x00a2
            r11.m15394a((android.content.Intent) r12)
            goto L_0x07ca
        L_0x00a2:
            java.lang.String r1 = com.xiaomi.push.service.C4870at.f10032g
            java.lang.String r2 = r12.getAction()
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x00b3
            r11.m15402b((android.content.Intent) r12)
            goto L_0x07ca
        L_0x00b3:
            java.lang.String r1 = com.xiaomi.push.service.C4870at.f10031f
            java.lang.String r2 = r12.getAction()
            boolean r1 = r1.equalsIgnoreCase(r2)
            java.lang.String r2 = "ext_packet"
            if (r1 == 0) goto L_0x00f8
            java.lang.String r1 = com.xiaomi.push.service.C4870at.f10051z
            java.lang.String r1 = r12.getStringExtra(r1)
            java.lang.String r3 = com.xiaomi.push.service.C4870at.f10018C
            java.lang.String r3 = r12.getStringExtra(r3)
            android.os.Bundle r12 = r12.getBundleExtra(r2)
            com.xiaomi.push.gh r2 = new com.xiaomi.push.gh
            r2.<init>(r12)
            com.xiaomi.push.gj r12 = r11.m15387a((com.xiaomi.push.C4701gj) r2, (java.lang.String) r1, (java.lang.String) r3)
            if (r12 == 0) goto L_0x07ca
            java.lang.String r1 = r12.mo25215k()
            java.lang.String r2 = r12.mo25219m()
            com.xiaomi.push.service.ap$b r0 = r0.mo25921a((java.lang.String) r1, (java.lang.String) r2)
            java.lang.String r0 = r0.f9999h
            com.xiaomi.push.fl r12 = com.xiaomi.push.C4673fl.m14224a((com.xiaomi.push.C4701gj) r12, (java.lang.String) r0)
            com.xiaomi.push.service.ba r0 = new com.xiaomi.push.service.ba
            r0.<init>(r11, r12)
        L_0x00f3:
            r11.m15408c((com.xiaomi.push.service.XMPushService.C4827i) r0)
            goto L_0x07ca
        L_0x00f8:
            java.lang.String r1 = com.xiaomi.push.service.C4870at.f10033h
            java.lang.String r5 = r12.getAction()
            boolean r1 = r1.equalsIgnoreCase(r5)
            if (r1 == 0) goto L_0x0137
            java.lang.String r1 = com.xiaomi.push.service.C4870at.f10051z
            java.lang.String r1 = r12.getStringExtra(r1)
            java.lang.String r3 = com.xiaomi.push.service.C4870at.f10018C
            java.lang.String r3 = r12.getStringExtra(r3)
            android.os.Bundle r12 = r12.getBundleExtra(r2)
            com.xiaomi.push.gl r2 = new com.xiaomi.push.gl
            r2.<init>((android.os.Bundle) r12)
            com.xiaomi.push.gj r12 = r11.m15387a((com.xiaomi.push.C4701gj) r2, (java.lang.String) r1, (java.lang.String) r3)
            if (r12 == 0) goto L_0x07ca
            java.lang.String r1 = r12.mo25215k()
            java.lang.String r2 = r12.mo25219m()
            com.xiaomi.push.service.ap$b r0 = r0.mo25921a((java.lang.String) r1, (java.lang.String) r2)
            java.lang.String r0 = r0.f9999h
            com.xiaomi.push.fl r12 = com.xiaomi.push.C4673fl.m14224a((com.xiaomi.push.C4701gj) r12, (java.lang.String) r0)
            com.xiaomi.push.service.ba r0 = new com.xiaomi.push.service.ba
            r0.<init>(r11, r12)
            goto L_0x00f3
        L_0x0137:
            java.lang.String r1 = com.xiaomi.push.service.C4870at.f10036k
            java.lang.String r2 = r12.getAction()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x01a0
            java.lang.String r0 = com.xiaomi.push.service.C4870at.f10043r
            java.lang.String r0 = r12.getStringExtra(r0)
            java.lang.String r1 = com.xiaomi.push.service.C4870at.f10041p
            java.lang.String r1 = r12.getStringExtra(r1)
            if (r0 == 0) goto L_0x07ca
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "request reset connection from chid = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r2)
            com.xiaomi.push.service.ap r2 = com.xiaomi.push.service.C4860ap.mo25920a()
            com.xiaomi.push.service.ap$b r0 = r2.mo25921a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 == 0) goto L_0x07ca
            java.lang.String r1 = r0.f9999h
            java.lang.String r2 = com.xiaomi.push.service.C4870at.f10047v
            java.lang.String r12 = r12.getStringExtra(r2)
            boolean r12 = r1.equals(r12)
            if (r12 == 0) goto L_0x07ca
            com.xiaomi.push.service.ap$c r12 = r0.f9986a
            com.xiaomi.push.service.ap$c r0 = com.xiaomi.push.service.C4860ap.C4866c.binded
            if (r12 != r0) goto L_0x07ca
            com.xiaomi.push.fs r12 = r11.mo25867a()
            if (r12 == 0) goto L_0x0196
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 15000(0x3a98, double:7.411E-320)
            long r0 = r0 - r2
            boolean r12 = r12.mo25149a((long) r0)
            if (r12 != 0) goto L_0x07ca
        L_0x0196:
            com.xiaomi.push.service.XMPushService$o r12 = new com.xiaomi.push.service.XMPushService$o
            r12.<init>()
        L_0x019b:
            r11.m15408c((com.xiaomi.push.service.XMPushService.C4827i) r12)
            goto L_0x07ca
        L_0x01a0:
            java.lang.String r1 = com.xiaomi.push.service.C4870at.f10037l
            java.lang.String r2 = r12.getAction()
            boolean r1 = r1.equals(r2)
            r2 = 0
            if (r1 == 0) goto L_0x0230
            java.lang.String r1 = com.xiaomi.push.service.C4870at.f10051z
            java.lang.String r1 = r12.getStringExtra(r1)
            java.util.List r3 = r0.mo25922a((java.lang.String) r1)
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L_0x01d2
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "open channel should be called first before update info, pkg="
            r12.append(r0)
            r12.append(r1)
            java.lang.String r12 = r12.toString()
        L_0x01ce:
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r12)
            return
        L_0x01d2:
            java.lang.String r1 = com.xiaomi.push.service.C4870at.f10043r
            java.lang.String r1 = r12.getStringExtra(r1)
            java.lang.String r5 = com.xiaomi.push.service.C4870at.f10041p
            java.lang.String r5 = r12.getStringExtra(r5)
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            if (r6 == 0) goto L_0x01ea
            java.lang.Object r1 = r3.get(r4)
            java.lang.String r1 = (java.lang.String) r1
        L_0x01ea:
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 == 0) goto L_0x0208
            java.util.Collection r0 = r0.mo25922a((java.lang.String) r1)
            if (r0 == 0) goto L_0x020c
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x020c
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            r2 = r0
            com.xiaomi.push.service.ap$b r2 = (com.xiaomi.push.service.C4860ap.C4862b) r2
            goto L_0x020c
        L_0x0208:
            com.xiaomi.push.service.ap$b r2 = r0.mo25921a((java.lang.String) r1, (java.lang.String) r5)
        L_0x020c:
            if (r2 == 0) goto L_0x07ca
            java.lang.String r0 = com.xiaomi.push.service.C4870at.f10049x
            boolean r0 = r12.hasExtra(r0)
            if (r0 == 0) goto L_0x021e
            java.lang.String r0 = com.xiaomi.push.service.C4870at.f10049x
            java.lang.String r0 = r12.getStringExtra(r0)
            r2.f9996e = r0
        L_0x021e:
            java.lang.String r0 = com.xiaomi.push.service.C4870at.f10050y
            boolean r0 = r12.hasExtra(r0)
            if (r0 == 0) goto L_0x07ca
            java.lang.String r0 = com.xiaomi.push.service.C4870at.f10050y
            java.lang.String r12 = r12.getStringExtra(r0)
            r2.f9997f = r12
            goto L_0x07ca
        L_0x0230:
            java.lang.String r0 = r12.getAction()
            java.lang.String r1 = "android.intent.action.SCREEN_ON"
            boolean r0 = r1.equals(r0)
            java.lang.String r5 = "android.intent.action.SCREEN_OFF"
            if (r0 != 0) goto L_0x070d
            java.lang.String r0 = r12.getAction()
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x024a
            goto L_0x070d
        L_0x024a:
            java.lang.String r0 = r12.getAction()
            java.lang.String r1 = "com.xiaomi.mipush.REGISTER_APP"
            boolean r0 = r1.equals(r0)
            java.lang.String r1 = "com.xiaomi.xmsf"
            java.lang.String r5 = "mipush_payload"
            java.lang.String r6 = "mipush_app_package"
            if (r0 == 0) goto L_0x02c8
            android.content.Context r0 = r11.getApplicationContext()
            com.xiaomi.push.service.aw r0 = com.xiaomi.push.service.C4875aw.m15643a(r0)
            boolean r0 = r0.mo25938a()
            if (r0 == 0) goto L_0x028f
            android.content.Context r0 = r11.getApplicationContext()
            com.xiaomi.push.service.aw r0 = com.xiaomi.push.service.C4875aw.m15643a(r0)
            int r0 = r0.mo25938a()
            if (r0 != 0) goto L_0x028f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "register without being provisioned. "
            r0.append(r1)
            java.lang.String r12 = r12.getStringExtra(r6)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            goto L_0x01ce
        L_0x028f:
            byte[] r5 = r12.getByteArrayExtra(r5)
            java.lang.String r6 = r12.getStringExtra(r6)
            java.lang.String r0 = "mipush_env_chanage"
            boolean r0 = r12.getBooleanExtra(r0, r4)
            java.lang.String r2 = "mipush_env_type"
            int r3 = r12.getIntExtra(r2, r3)
            com.xiaomi.push.service.m r12 = com.xiaomi.push.service.C4922m.m15798a((android.content.Context) r11)
            r12.mo25995d(r6)
            if (r0 == 0) goto L_0x02c3
            java.lang.String r12 = r11.getPackageName()
            boolean r12 = r1.equals(r12)
            if (r12 != 0) goto L_0x02c3
            com.xiaomi.push.service.bx r12 = new com.xiaomi.push.service.bx
            r2 = 14
            r0 = r12
            r1 = r11
            r4 = r5
            r5 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x019b
        L_0x02c3:
            r11.mo25878a((byte[]) r5, (java.lang.String) r6)
            goto L_0x07ca
        L_0x02c8:
            java.lang.String r0 = r12.getAction()
            java.lang.String r7 = "com.xiaomi.mipush.SEND_MESSAGE"
            boolean r0 = r7.equals(r0)
            java.lang.String r7 = "com.xiaomi.mipush.UNREGISTER_APP"
            if (r0 != 0) goto L_0x06e9
            java.lang.String r0 = r12.getAction()
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x02e2
            goto L_0x06e9
        L_0x02e2:
            java.lang.String r0 = com.xiaomi.push.service.C4876ax.f10057a
            java.lang.String r7 = r12.getAction()
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x03a0
            java.lang.String r0 = "uninstall_pkg_name"
            java.lang.String r12 = r12.getStringExtra(r0)
            if (r12 == 0) goto L_0x039f
            java.lang.String r0 = r12.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0302
            goto L_0x039f
        L_0x0302:
            android.content.pm.PackageManager r0 = r11.getPackageManager()     // Catch:{ NameNotFoundException -> 0x030b }
            r0.getPackageInfo(r12, r4)     // Catch:{ NameNotFoundException -> 0x030b }
            r3 = 0
            goto L_0x030c
        L_0x030b:
        L_0x030c:
            java.lang.String r0 = "com.xiaomi.channel"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x032d
            com.xiaomi.push.service.ap r0 = com.xiaomi.push.service.C4860ap.mo25920a()
            java.lang.String r1 = "1"
            java.util.Collection r0 = r0.mo25922a((java.lang.String) r1)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x032d
            if (r3 == 0) goto L_0x032d
            r11.m15398a((java.lang.String) r1, (int) r4)
            java.lang.String r12 = "close the miliao channel as the app is uninstalled."
            goto L_0x01ce
        L_0x032d:
            java.lang.String r0 = "pref_registered_pkg_names"
            android.content.SharedPreferences r0 = r11.getSharedPreferences(r0, r4)
            java.lang.String r1 = r0.getString(r12, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x07ca
            if (r3 == 0) goto L_0x07ca
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.remove(r12)
            r0.commit()
            boolean r0 = com.xiaomi.push.service.C4837aa.m15518b((android.content.Context) r11, (java.lang.String) r12)
            if (r0 == 0) goto L_0x0352
            com.xiaomi.push.service.C4837aa.m15518b((android.content.Context) r11, (java.lang.String) r12)
        L_0x0352:
            com.xiaomi.push.service.C4837aa.m15488a((android.content.Context) r11, (java.lang.String) r12)
            boolean r0 = r11.mo25882c()
            if (r0 == 0) goto L_0x07ca
            if (r1 == 0) goto L_0x07ca
            com.xiaomi.push.ii r0 = com.xiaomi.push.service.C4933w.m15853a((java.lang.String) r12, (java.lang.String) r1)     // Catch:{ gd -> 0x037f }
            com.xiaomi.push.service.C4933w.m15858a((com.xiaomi.push.service.XMPushService) r11, (com.xiaomi.push.C4762ii) r0)     // Catch:{ gd -> 0x037f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ gd -> 0x037f }
            r0.<init>()     // Catch:{ gd -> 0x037f }
            java.lang.String r1 = "uninstall "
            r0.append(r1)     // Catch:{ gd -> 0x037f }
            r0.append(r12)     // Catch:{ gd -> 0x037f }
            java.lang.String r12 = " msg sent"
            r0.append(r12)     // Catch:{ gd -> 0x037f }
            java.lang.String r12 = r0.toString()     // Catch:{ gd -> 0x037f }
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r12)     // Catch:{ gd -> 0x037f }
            goto L_0x07ca
        L_0x037f:
            r12 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fail to send Message: "
            r0.append(r1)
            java.lang.String r1 = r12.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.xiaomi.channel.commonutils.logger.C3989b.m10681d(r0)
            r0 = 10
            r11.mo25869a((int) r0, (java.lang.Exception) r12)
            goto L_0x07ca
        L_0x039f:
            return
        L_0x03a0:
            java.lang.String r0 = com.xiaomi.push.service.C4876ax.f10058b
            java.lang.String r7 = r12.getAction()
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x03d9
            java.lang.String r0 = "data_cleared_pkg_name"
            java.lang.String r12 = r12.getStringExtra(r0)
            if (r12 == 0) goto L_0x03d8
            java.lang.String r0 = r12.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x03bf
            goto L_0x03d8
        L_0x03bf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "clear notifications of package "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r0)
            com.xiaomi.push.service.C4837aa.m15488a((android.content.Context) r11, (java.lang.String) r12)
            goto L_0x07ca
        L_0x03d8:
            return
        L_0x03d9:
            java.lang.String r0 = r12.getAction()
            java.lang.String r7 = "com.xiaomi.mipush.CLEAR_NOTIFICATION"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0411
            java.lang.String r0 = com.xiaomi.push.service.C4870at.f10051z
            java.lang.String r0 = r12.getStringExtra(r0)
            java.lang.String r1 = com.xiaomi.push.service.C4870at.f10016A
            r2 = -2
            int r1 = r12.getIntExtra(r1, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x07ca
            r2 = -1
            if (r1 < r2) goto L_0x0400
            com.xiaomi.push.service.C4837aa.m15508a((android.content.Context) r11, (java.lang.String) r0, (int) r1)
            goto L_0x07ca
        L_0x0400:
            java.lang.String r1 = com.xiaomi.push.service.C4870at.f10020E
            java.lang.String r1 = r12.getStringExtra(r1)
            java.lang.String r2 = com.xiaomi.push.service.C4870at.f10021F
            java.lang.String r12 = r12.getStringExtra(r2)
            com.xiaomi.push.service.C4837aa.m15509a((android.content.Context) r11, (java.lang.String) r0, (java.lang.String) r1, (java.lang.String) r12)
            goto L_0x07ca
        L_0x0411:
            java.lang.String r0 = r12.getAction()
            java.lang.String r7 = "com.xiaomi.mipush.SET_NOTIFICATION_TYPE"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0480
            java.lang.String r0 = com.xiaomi.push.service.C4870at.f10051z
            java.lang.String r0 = r12.getStringExtra(r0)
            java.lang.String r1 = com.xiaomi.push.service.C4870at.f10019D
            java.lang.String r1 = r12.getStringExtra(r1)
            java.lang.String r2 = com.xiaomi.push.service.C4870at.f10017B
            boolean r2 = r12.hasExtra(r2)
            if (r2 == 0) goto L_0x044d
            java.lang.String r2 = com.xiaomi.push.service.C4870at.f10017B
            int r12 = r12.getIntExtra(r2, r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = com.xiaomi.push.C4531be.m13429b(r2)
            r4 = r12
            r3 = 0
            goto L_0x0451
        L_0x044d:
            java.lang.String r2 = com.xiaomi.push.C4531be.m13429b(r0)
        L_0x0451:
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 != 0) goto L_0x046a
            boolean r12 = android.text.TextUtils.equals(r1, r2)
            if (r12 != 0) goto L_0x045e
            goto L_0x046a
        L_0x045e:
            if (r3 == 0) goto L_0x0465
            com.xiaomi.push.service.C4837aa.m15518b((android.content.Context) r11, (java.lang.String) r0)
            goto L_0x07ca
        L_0x0465:
            com.xiaomi.push.service.C4837aa.m15522b(r11, r0, r4)
            goto L_0x07ca
        L_0x046a:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "invalid notification for "
            r12.append(r1)
            r12.append(r0)
            java.lang.String r12 = r12.toString()
        L_0x047b:
            com.xiaomi.channel.commonutils.logger.C3989b.m10681d(r12)
            goto L_0x07ca
        L_0x0480:
            java.lang.String r0 = r12.getAction()
            java.lang.String r7 = "com.xiaomi.mipush.DISABLE_PUSH"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x04b4
            java.lang.String r12 = r12.getStringExtra(r6)
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x049d
            com.xiaomi.push.service.m r0 = com.xiaomi.push.service.C4922m.m15798a((android.content.Context) r11)
            r0.mo25993b((java.lang.String) r12)
        L_0x049d:
            java.lang.String r12 = r11.getPackageName()
            boolean r12 = r1.equals(r12)
            if (r12 != 0) goto L_0x07ca
            r12 = 19
            r11.mo25869a((int) r12, (java.lang.Exception) r2)
            r11.m15413e()
            r11.stopSelf()
            goto L_0x07ca
        L_0x04b4:
            java.lang.String r0 = r12.getAction()
            java.lang.String r2 = "com.xiaomi.mipush.DISABLE_PUSH_MESSAGE"
            boolean r0 = r2.equals(r0)
            java.lang.String r7 = "android.net.conn.CONNECTIVITY_CHANGE"
            java.lang.String r8 = "com.xiaomi.mipush.ENABLE_PUSH_MESSAGE"
            if (r0 != 0) goto L_0x0672
            java.lang.String r0 = r12.getAction()
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x04d0
            goto L_0x0672
        L_0x04d0:
            java.lang.String r0 = r12.getAction()
            java.lang.String r2 = "com.xiaomi.mipush.SEND_TINYDATA"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x04fb
            java.lang.String r0 = r12.getStringExtra(r6)
            byte[] r12 = r12.getByteArrayExtra(r5)
            com.xiaomi.push.hq r1 = new com.xiaomi.push.hq
            r1.<init>()
            com.xiaomi.push.C4776iw.m15224a(r1, (byte[]) r12)     // Catch:{ jc -> 0x04f5 }
            com.xiaomi.push.hk r12 = com.xiaomi.push.C4737hk.m14549a(r11)     // Catch:{ jc -> 0x04f5 }
            r12.mo25250a((com.xiaomi.push.C4743hq) r1, (java.lang.String) r0)     // Catch:{ jc -> 0x04f5 }
            goto L_0x07ca
        L_0x04f5:
            r12 = move-exception
            com.xiaomi.channel.commonutils.logger.C3989b.m10678a((java.lang.Throwable) r12)
            goto L_0x07ca
        L_0x04fb:
            java.lang.String r0 = r12.getAction()
            java.lang.String r2 = "com.xiaomi.push.timer"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0526
            java.lang.String r12 = "Service called on timer"
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r12)
            boolean r12 = r11.m15421i()
            if (r12 == 0) goto L_0x051c
            boolean r12 = com.xiaomi.push.C4663fc.m14161a()
            if (r12 == 0) goto L_0x07ca
            java.lang.String r12 = "enter falldown mode, stop alarm"
            goto L_0x074e
        L_0x051c:
            com.xiaomi.push.C4663fc.m14164a((boolean) r4)
            boolean r12 = r11.m15413e()
            if (r12 == 0) goto L_0x07ca
            goto L_0x053d
        L_0x0526:
            java.lang.String r0 = r12.getAction()
            java.lang.String r2 = "com.xiaomi.push.check_alive"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0542
            java.lang.String r12 = "Service called on check alive."
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r12)
            boolean r12 = r11.m15413e()
            if (r12 == 0) goto L_0x07ca
        L_0x053d:
            r11.m15404b((boolean) r4)
            goto L_0x07ca
        L_0x0542:
            java.lang.String r0 = r12.getAction()
            java.lang.String r2 = "com.xiaomi.mipush.thirdparty"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0573
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "on thirdpart push :"
            r0.append(r1)
            java.lang.String r1 = "com.xiaomi.mipush.thirdparty_DESC"
            java.lang.String r1 = r12.getStringExtra(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r0)
            java.lang.String r0 = "com.xiaomi.mipush.thirdparty_LEVEL"
            int r12 = r12.getIntExtra(r0, r4)
            com.xiaomi.push.C4663fc.m14163a(r11, r12)
            goto L_0x07ca
        L_0x0573:
            java.lang.String r0 = r12.getAction()
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0582
            r11.mo25883d()
            goto L_0x07ca
        L_0x0582:
            java.lang.String r0 = r12.getAction()
            java.lang.String r2 = "action_cr_config"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0609
            java.lang.String r0 = "action_cr_event_switch"
            boolean r0 = r12.getBooleanExtra(r0, r4)
            java.lang.String r2 = "action_cr_event_frequency"
            r5 = 86400(0x15180, double:4.26873E-319)
            long r7 = r12.getLongExtra(r2, r5)
            java.lang.String r2 = "action_cr_perf_switch"
            boolean r2 = r12.getBooleanExtra(r2, r4)
            java.lang.String r4 = "action_cr_perf_frequency"
            long r4 = r12.getLongExtra(r4, r5)
            java.lang.String r6 = "action_cr_event_en"
            boolean r3 = r12.getBooleanExtra(r6, r3)
            r9 = 1048576(0x100000, double:5.180654E-318)
            java.lang.String r6 = "action_cr_max_file_size"
            long r9 = r12.getLongExtra(r6, r9)
            com.xiaomi.clientreport.data.Config$Builder r12 = com.xiaomi.clientreport.data.Config.getBuilder()
            com.xiaomi.clientreport.data.Config$Builder r12 = r12.setEventUploadSwitchOpen(r0)
            com.xiaomi.clientreport.data.Config$Builder r12 = r12.setEventUploadFrequency(r7)
            com.xiaomi.clientreport.data.Config$Builder r12 = r12.setPerfUploadSwitchOpen(r2)
            com.xiaomi.clientreport.data.Config$Builder r12 = r12.setPerfUploadFrequency(r4)
            android.content.Context r0 = r11.getApplicationContext()
            java.lang.String r0 = com.xiaomi.push.C4536bj.m13450a((android.content.Context) r0)
            com.xiaomi.clientreport.data.Config$Builder r12 = r12.setAESKey(r0)
            com.xiaomi.clientreport.data.Config$Builder r12 = r12.setEventEncrypted(r3)
            com.xiaomi.clientreport.data.Config$Builder r12 = r12.setMaxFileLength(r9)
            android.content.Context r0 = r11.getApplicationContext()
            com.xiaomi.clientreport.data.Config r12 = r12.build(r0)
            java.lang.String r0 = r11.getPackageName()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x07ca
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x07ca
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x07ca
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x07ca
            android.content.Context r0 = r11.getApplicationContext()
            com.xiaomi.push.C4660fa.m14146a((android.content.Context) r0, (com.xiaomi.clientreport.data.Config) r12)
            goto L_0x07ca
        L_0x0609:
            java.lang.String r0 = r12.getAction()
            java.lang.String r2 = "action_help_ping"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0661
            java.lang.String r0 = "extra_help_ping_switch"
            boolean r0 = r12.getBooleanExtra(r0, r4)
            java.lang.String r2 = "extra_help_ping_frequency"
            int r2 = r12.getIntExtra(r2, r4)
            r3 = 30
            if (r2 < 0) goto L_0x062e
            if (r2 >= r3) goto L_0x062e
            java.lang.String r2 = "aw_ping: frquency need > 30s."
            com.xiaomi.channel.commonutils.logger.C3989b.m10680c(r2)
            r2 = 30
        L_0x062e:
            if (r2 >= 0) goto L_0x0631
            goto L_0x0632
        L_0x0631:
            r4 = r0
        L_0x0632:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "aw_ping: receive a aw_ping message. switch: "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = " frequency: "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r0)
            if (r4 == 0) goto L_0x07ca
            if (r2 <= 0) goto L_0x07ca
            java.lang.String r0 = r11.getPackageName()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x07ca
            r11.m15395a((android.content.Intent) r12, (int) r2)
            goto L_0x07ca
        L_0x0661:
            java.lang.String r0 = r12.getAction()
            java.lang.String r1 = "action_aw_app_logic"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x07ca
            r11.m15412d(r12)
            goto L_0x07ca
        L_0x0672:
            java.lang.String r3 = r12.getStringExtra(r6)
            byte[] r6 = r12.getByteArrayExtra(r5)
            java.lang.String r0 = "mipush_app_id"
            java.lang.String r4 = r12.getStringExtra(r0)
            java.lang.String r0 = "mipush_app_token"
            java.lang.String r5 = r12.getStringExtra(r0)
            java.lang.String r0 = r12.getAction()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0697
            com.xiaomi.push.service.m r0 = com.xiaomi.push.service.C4922m.m15798a((android.content.Context) r11)
            r0.mo25994c((java.lang.String) r3)
        L_0x0697:
            java.lang.String r0 = r12.getAction()
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x06af
            com.xiaomi.push.service.m r0 = com.xiaomi.push.service.C4922m.m15798a((android.content.Context) r11)
            r0.mo25996e(r3)
            com.xiaomi.push.service.m r0 = com.xiaomi.push.service.C4922m.m15798a((android.content.Context) r11)
            r0.mo25997f(r3)
        L_0x06af:
            if (r6 != 0) goto L_0x06bb
            r12 = 70000003(0x42c1d83, float:2.0232054E-36)
            java.lang.String r0 = "null payload"
            com.xiaomi.push.service.C4924o.m15811a(r11, r3, r6, r12, r0)
            goto L_0x07ca
        L_0x06bb:
            com.xiaomi.push.service.C4924o.m15815b(r3, r6)
            com.xiaomi.push.service.n r0 = new com.xiaomi.push.service.n
            r1 = r0
            r2 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r11.mo25871a((com.xiaomi.push.service.XMPushService.C4827i) r0)
            java.lang.String r12 = r12.getAction()
            boolean r12 = r8.equals(r12)
            if (r12 == 0) goto L_0x07ca
            com.xiaomi.push.service.XMPushService$e r12 = r11.f9885a
            if (r12 != 0) goto L_0x07ca
            com.xiaomi.push.service.XMPushService$e r12 = new com.xiaomi.push.service.XMPushService$e
            r12.<init>()
            r11.f9885a = r12
            android.content.IntentFilter r12 = new android.content.IntentFilter
            r12.<init>(r7)
            com.xiaomi.push.service.XMPushService$e r0 = r11.f9885a
            r11.registerReceiver(r0, r12)
            goto L_0x07ca
        L_0x06e9:
            java.lang.String r0 = r12.getStringExtra(r6)
            byte[] r1 = r12.getByteArrayExtra(r5)
            java.lang.String r2 = "com.xiaomi.mipush.MESSAGE_CACHE"
            boolean r2 = r12.getBooleanExtra(r2, r3)
            java.lang.String r12 = r12.getAction()
            boolean r12 = r7.equals(r12)
            if (r12 == 0) goto L_0x0708
            com.xiaomi.push.service.m r12 = com.xiaomi.push.service.C4922m.m15798a((android.content.Context) r11)
            r12.mo25992a((java.lang.String) r0)
        L_0x0708:
            r11.mo25876a((java.lang.String) r0, (byte[]) r1, (boolean) r2)
            goto L_0x07ca
        L_0x070d:
            java.lang.String r0 = r12.getAction()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0736
            boolean r12 = r11.m15421i()
            if (r12 != 0) goto L_0x07ca
            java.lang.String r12 = "exit falldown mode, activate alarm."
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r12)
            r11.m15413e()
            boolean r12 = r11.mo25882c()
            if (r12 != 0) goto L_0x07ca
            boolean r12 = r11.mo25883d()
            if (r12 != 0) goto L_0x07ca
        L_0x0731:
            r11.mo25877a((boolean) r3)
            goto L_0x07ca
        L_0x0736:
            java.lang.String r12 = r12.getAction()
            boolean r12 = r5.equals(r12)
            if (r12 == 0) goto L_0x07ca
            boolean r12 = r11.m15421i()
            if (r12 == 0) goto L_0x07ca
            boolean r12 = com.xiaomi.push.C4663fc.m14161a()
            if (r12 == 0) goto L_0x07ca
            java.lang.String r12 = "enter falldown mode, stop alarm."
        L_0x074e:
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r12)
            com.xiaomi.push.C4663fc.m14161a()
            goto L_0x07ca
        L_0x0756:
            java.lang.String r0 = com.xiaomi.push.service.C4870at.f10043r
            java.lang.String r0 = r12.getStringExtra(r0)
            java.lang.String r1 = com.xiaomi.push.service.C4870at.f10047v
            java.lang.String r1 = r12.getStringExtra(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x076b
            java.lang.String r12 = "security is empty. ignore."
            goto L_0x07b9
        L_0x076b:
            if (r0 == 0) goto L_0x07c6
            boolean r1 = r11.m15389a((java.lang.String) r0, (android.content.Intent) r12)
            com.xiaomi.push.service.ap$b r7 = r11.m15389a((java.lang.String) r0, (android.content.Intent) r12)
            boolean r12 = com.xiaomi.push.C4521az.m13366b(r11)
            if (r12 != 0) goto L_0x0785
            com.xiaomi.push.service.d r5 = r11.f9889a
            r8 = 0
            r9 = 2
        L_0x077f:
            r10 = 0
            r6 = r11
            r5.mo25968a(r6, r7, r8, r9, r10)
            goto L_0x07ca
        L_0x0785:
            boolean r12 = r11.mo25882c()
            if (r12 == 0) goto L_0x0731
            com.xiaomi.push.service.ap$c r12 = r7.f9986a
            com.xiaomi.push.service.ap$c r0 = com.xiaomi.push.service.C4860ap.C4866c.unbind
            if (r12 != r0) goto L_0x0798
            com.xiaomi.push.service.XMPushService$a r12 = new com.xiaomi.push.service.XMPushService$a
            r12.<init>(r7)
            goto L_0x019b
        L_0x0798:
            if (r1 == 0) goto L_0x07a1
            com.xiaomi.push.service.XMPushService$n r12 = new com.xiaomi.push.service.XMPushService$n
            r12.<init>(r7)
            goto L_0x019b
        L_0x07a1:
            com.xiaomi.push.service.ap$c r0 = com.xiaomi.push.service.C4860ap.C4866c.binding
            if (r12 != r0) goto L_0x07bd
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.String r0 = r7.f9998g
            r12[r4] = r0
            java.lang.String r0 = r7.f9992b
            java.lang.String r0 = com.xiaomi.push.service.C4860ap.C4862b.m15611a((java.lang.String) r0)
            r12[r3] = r0
            java.lang.String r0 = "the client is binding. %1$s %2$s."
            java.lang.String r12 = java.lang.String.format(r0, r12)
        L_0x07b9:
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r12)
            goto L_0x07ca
        L_0x07bd:
            com.xiaomi.push.service.ap$c r0 = com.xiaomi.push.service.C4860ap.C4866c.binded
            if (r12 != r0) goto L_0x07ca
            com.xiaomi.push.service.d r5 = r11.f9889a
            r8 = 1
            r9 = 0
            goto L_0x077f
        L_0x07c6:
            java.lang.String r12 = "channel id is empty, do nothing!"
            goto L_0x047b
        L_0x07ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.XMPushService.m15407c(android.content.Intent):void");
    }

    /* renamed from: c */
    private void m15408c(C4827i iVar) {
        this.f9890a.mo25976a((C4910g.C4912b) iVar);
    }

    /* renamed from: c */
    private void m15410c(boolean z) {
        try {
            if (!C4937t.m15865a()) {
                return;
            }
            if (z) {
                sendBroadcast(new Intent("miui.intent.action.NETWORK_CONNECTED"));
                for (C4845af a : (C4845af[]) this.f9894a.toArray(new C4845af[0])) {
                    a.mo25902a();
                }
                return;
            }
            sendBroadcast(new Intent("miui.intent.action.NETWORK_BLOCKED"));
        } catch (Exception e) {
            C3989b.m10678a((Throwable) e);
        }
    }

    /* renamed from: d */
    private void mo25883d() {
        NetworkInfo networkInfo;
        try {
            networkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception e) {
            C3989b.m10678a((Throwable) e);
            networkInfo = null;
        }
        if (networkInfo != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("network changed,");
            sb.append("[" + "type: " + networkInfo.getTypeName() + "[" + networkInfo.getSubtypeName() + "], state: " + networkInfo.getState() + MiotCloudImpl.COOKIE_PATH + networkInfo.getDetailedState());
            C3989b.m10669a(sb.toString());
            NetworkInfo.State state = networkInfo.getState();
            if (state == NetworkInfo.State.SUSPENDED || state == NetworkInfo.State.UNKNOWN) {
                return;
            }
        } else {
            C3989b.m10669a("network changed, no active network");
        }
        if (C4728he.mo25240a() != null) {
            C4728he.mo25240a().mo25239a();
        }
        C4718gx.m14469a((Context) this);
        this.f9881a.mo25156d();
        if (C4521az.m13366b(this)) {
            if (mo25882c() && m15413e()) {
                m15404b(false);
            }
            if (!mo25882c() && !mo25883d()) {
                this.f9890a.mo25974a(1);
                mo25871a((C4827i) new C4822d());
            }
            C4599di.m13721a((Context) this).mo24915a();
        } else {
            mo25871a((C4827i) new C4824f(2, (Exception) null));
        }
        m15413e();
    }

    /* renamed from: d */
    private void m15412d(Intent intent) {
        int i;
        try {
            C4649eq.m14098a(getApplicationContext()).mo25052a((C4653eu) new C4874av());
            String stringExtra = intent.getStringExtra("mipush_app_package");
            byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
            if (byteArrayExtra != null) {
                C4765il ilVar = new C4765il();
                C4776iw.m15224a(ilVar, byteArrayExtra);
                String b = ilVar.mo25563b();
                Map a = ilVar.mo25560a();
                if (a != null) {
                    String str = (String) a.get("extra_help_aw_info");
                    String str2 = (String) a.get("extra_aw_app_online_cmd");
                    if (!TextUtils.isEmpty(str2)) {
                        try {
                            i = Integer.parseInt(str2);
                        } catch (NumberFormatException unused) {
                            i = 0;
                        }
                        if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(b) && !TextUtils.isEmpty(str)) {
                            C4649eq.m14098a(getApplicationContext()).mo25050a(this, str, i, stringExtra, b);
                        }
                    }
                }
            }
        } catch (C4787jc e) {
            C3989b.m10681d("aw_logic: translate fail. " + e.getMessage());
        }
    }

    /* renamed from: e */
    private void m15413e() {
        if (!mo25867a()) {
            C4663fc.m14161a();
        } else if (!C4663fc.m14161a()) {
            C4663fc.m14164a(true);
        }
    }

    /* renamed from: e */
    private boolean m15414e() {
        if (System.currentTimeMillis() - this.f9878a < 30000) {
            return false;
        }
        return C4521az.m13367c(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m15415f() {
        String str;
        C4680fs fsVar = this.f9882a;
        if (fsVar == null || !fsVar.mo25150b()) {
            C4680fs fsVar2 = this.f9882a;
            if (fsVar2 == null || !fsVar2.mo25155c()) {
                this.f9883a.mo25163b(C4521az.m13351a((Context) this));
                m15417g();
                if (this.f9882a == null) {
                    C4860ap.mo25920a().mo25923a((Context) this);
                    m15410c(false);
                    return;
                }
                return;
            }
            str = "try to connect while is connected.";
        } else {
            str = "try to connect while connecting.";
        }
        C3989b.m10681d(str);
    }

    /* renamed from: f */
    private boolean m15416f() {
        return "com.xiaomi.xmsf".equals(getPackageName()) && Settings.Secure.getInt(getContentResolver(), "EXTREME_POWER_MODE_ENABLE", 0) == 1;
    }

    /* renamed from: g */
    private void m15417g() {
        try {
            this.f9881a.mo25147a(this.f9884a, (C4696gf) new C4896bo(this));
            this.f9881a.mo25157e();
            this.f9882a = this.f9881a;
        } catch (C4694gd e) {
            C3989b.m10677a("fail to create Slim connection", (Throwable) e);
            this.f9881a.mo25151b(3, e);
        }
    }

    /* renamed from: g */
    private boolean m15418g() {
        return "com.xiaomi.xmsf".equals(getPackageName()) && Settings.System.getInt(getContentResolver(), "power_supersave_mode_open", 0) == 1;
    }

    /* renamed from: h */
    private void m15419h() {
        if (Build.VERSION.SDK_INT < 18) {
            startForeground(f9877d, new Notification());
        } else {
            bindService(new Intent(this, this.f9891a), new C4897bp(this), 1);
        }
    }

    /* renamed from: h */
    private boolean m15420h() {
        return "com.xiaomi.xmsf".equals(getPackageName()) || !C4922m.m15798a((Context) this).mo25993b(getPackageName());
    }

    /* renamed from: i */
    private void m15421i() {
        synchronized (this.f9893a) {
            this.f9893a.clear();
        }
    }

    /* renamed from: i */
    private boolean m15422i() {
        return getApplicationContext().getPackageName().equals("com.xiaomi.xmsf") && m15423j() && !C4753i.m14747b((Context) this) && !C4753i.m14740a(getApplicationContext());
    }

    /* renamed from: j */
    private boolean m15423j() {
        int intValue = Integer.valueOf(String.format("%tH", new Object[]{new Date()})).intValue();
        int i = this.f9895b;
        int i2 = this.f9897c;
        if (i <= i2) {
            return i < i2 && intValue >= i && intValue < i2;
        }
        if (intValue >= i || intValue < i2) {
            return true;
        }
    }

    /* renamed from: k */
    private boolean m15424k() {
        if (TextUtils.equals(getPackageName(), "com.xiaomi.xmsf")) {
            return false;
        }
        return C4854ak.m15568a((Context) this).mo25911a(C4744hr.ForegroundServiceSwitch.mo25291a(), false);
    }

    /* renamed from: a */
    public C4680fs m15425a() {
        return this.f9882a;
    }

    /* renamed from: a */
    public C4907d m15426a() {
        return new C4907d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void m15427a() {
        if (System.currentTimeMillis() - this.f9878a >= ((long) C4687fy.m14326a()) && C4521az.m13367c(this)) {
            m15404b(true);
        }
    }

    /* renamed from: a */
    public void mo25868a(int i) {
        this.f9890a.mo25974a(i);
    }

    /* renamed from: a */
    public void mo25869a(int i, Exception exc) {
        StringBuilder sb = new StringBuilder();
        sb.append("disconnect ");
        sb.append(hashCode());
        sb.append(", ");
        C4680fs fsVar = this.f9882a;
        sb.append(fsVar == null ? null : Integer.valueOf(fsVar.hashCode()));
        C3989b.m10669a(sb.toString());
        C4680fs fsVar2 = this.f9882a;
        if (fsVar2 != null) {
            fsVar2.mo25151b(i, exc);
            this.f9882a = null;
        }
        mo25868a(7);
        mo25868a(4);
        C4860ap.mo25920a().mo25924a((Context) this, i);
    }

    /* renamed from: a */
    public void mo25870a(C4673fl flVar) {
        C4680fs fsVar = this.f9882a;
        if (fsVar != null) {
            fsVar.mo25142b(flVar);
            return;
        }
        throw new C4694gd("try send msg while connection is null.");
    }

    /* renamed from: a */
    public void mo24779a(C4680fs fsVar) {
        C4728he.mo25240a().mo24779a(fsVar);
        m15410c(true);
        this.f9888a.mo25940a();
        if (!C4663fc.m14161a() && !m15421i()) {
            C3989b.m10669a("reconnection successful, reactivate alarm.");
            C4663fc.m14164a(true);
        }
        Iterator it = C4860ap.mo25920a().mo25920a().iterator();
        while (it.hasNext()) {
            mo25871a((C4827i) new C4819a((C4860ap.C4862b) it.next()));
        }
    }

    /* renamed from: a */
    public void mo24780a(C4680fs fsVar, int i, Exception exc) {
        C4728he.mo25240a().mo24780a(fsVar, i, exc);
        if (!m15421i()) {
            mo25877a(false);
        }
    }

    /* renamed from: a */
    public void mo24781a(C4680fs fsVar, Exception exc) {
        C4728he.mo25240a().mo24781a(fsVar, exc);
        m15410c(false);
        if (!m15421i()) {
            mo25877a(false);
        }
    }

    /* renamed from: a */
    public void mo25871a(C4827i iVar) {
        mo25872a(iVar, 0);
    }

    /* renamed from: a */
    public void mo25872a(C4827i iVar, long j) {
        try {
            this.f9890a.mo25977a((C4910g.C4912b) iVar, j);
        } catch (IllegalStateException e) {
            C3989b.m10669a("can't execute job err = " + e.getMessage());
        }
    }

    /* renamed from: a */
    public void mo25873a(C4830l lVar) {
        synchronized (this.f9893a) {
            this.f9893a.add(lVar);
        }
    }

    /* renamed from: a */
    public void mo25874a(C4860ap.C4862b bVar) {
        if (bVar != null) {
            long a = bVar.mo25929a();
            C3989b.m10669a("schedule rebind job in " + (a / 1000));
            mo25872a((C4827i) new C4819a(bVar), a);
        }
    }

    /* renamed from: a */
    public void mo25875a(String str, String str2, int i, String str3, String str4) {
        C4860ap.C4862b a = C4860ap.mo25920a().mo25921a(str, str2);
        if (a != null) {
            mo25871a((C4827i) new C4835q(a, i, str4, str3));
        }
        C4860ap.mo25920a().mo25921a(str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo25876a(String str, byte[] bArr, boolean z) {
        Collection a = C4860ap.mo25920a().mo25922a("5");
        if (a.isEmpty()) {
            if (!z) {
                return;
            }
        } else if (((C4860ap.C4862b) a.iterator().next()).f9986a == C4860ap.C4866c.binded) {
            mo25871a((C4827i) new C4894bm(this, 4, str, bArr));
            return;
        } else if (!z) {
            return;
        }
        C4924o.m15815b(str, bArr);
    }

    /* renamed from: a */
    public void mo25877a(boolean z) {
        this.f9888a.mo25941a(z);
    }

    /* renamed from: a */
    public void mo25878a(byte[] bArr, String str) {
        if (bArr == null) {
            C4924o.m15811a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, "null payload");
            C3989b.m10669a("register request without payload");
            return;
        }
        C4762ii iiVar = new C4762ii();
        try {
            C4776iw.m15224a(iiVar, bArr);
            if (iiVar.f9488a == C4739hm.Registration) {
                C4766im imVar = new C4766im();
                try {
                    C4776iw.m15224a(imVar, iiVar.mo25521a());
                    C4924o.m15813a(iiVar.mo25530b(), bArr);
                    mo25871a((C4827i) new C4923n(this, iiVar.mo25530b(), imVar.mo25595b(), imVar.mo25599c(), bArr));
                    C4662fb.m14151a(getApplicationContext()).mo25062a(iiVar.mo25530b(), "E100003", imVar.mo25591a(), 6002, (String) null);
                } catch (C4787jc e) {
                    C3989b.m10678a((Throwable) e);
                    C4924o.m15811a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, " data action error.");
                }
            } else {
                C4924o.m15811a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, " registration action required.");
                C3989b.m10669a("register request with invalid payload");
            }
        } catch (C4787jc e2) {
            C3989b.m10678a((Throwable) e2);
            C4924o.m15811a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, " data container error.");
        }
    }

    /* renamed from: a */
    public void mo25879a(C4673fl[] flVarArr) {
        C4680fs fsVar = this.f9882a;
        if (fsVar != null) {
            fsVar.mo25141a(flVarArr);
            return;
        }
        throw new C4694gd("try send msg while connection is null.");
    }

    /* renamed from: a */
    public boolean m15443a() {
        return C4521az.m13366b(this) && C4860ap.mo25920a().mo25920a() > 0 && !mo25880b() && m15419h() && !m15417g() && !m15415f();
    }

    /* renamed from: a */
    public boolean m15444a(int i) {
        return this.f9890a.mo25974a(i);
    }

    /* renamed from: b */
    public C4907d mo25880b() {
        return this.f9889a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void m15446b() {
        Iterator it = new ArrayList(this.f9893a).iterator();
        while (it.hasNext()) {
            ((C4830l) it.next()).mo25246a();
        }
    }

    /* renamed from: b */
    public void mo24782b(C4680fs fsVar) {
        C3989b.m10680c("begin to connect...");
        C4728he.mo25240a().mo24782b(fsVar);
    }

    /* renamed from: b */
    public void mo25881b(C4827i iVar) {
        this.f9890a.mo25975a(iVar.f10135a, (C4910g.C4912b) iVar);
    }

    /* renamed from: b */
    public boolean m15449b() {
        try {
            Class<?> a = C4937t.m15867a(this, "miui.os.Build");
            return a.getField("IS_CM_CUSTOMIZATION_TEST").getBoolean((Object) null) || a.getField("IS_CU_CUSTOMIZATION_TEST").getBoolean((Object) null) || a.getField("IS_CT_CUSTOMIZATION_TEST").getBoolean((Object) null);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: c */
    public boolean m15450c() {
        C4680fs fsVar = this.f9882a;
        return fsVar != null && fsVar.mo25155c();
    }

    /* renamed from: d */
    public boolean m15451d() {
        C4680fs fsVar = this.f9882a;
        return fsVar != null && fsVar.mo25150b();
    }

    public IBinder onBind(Intent intent) {
        return this.f9880a.getBinder();
    }

    public void onCreate() {
        super.onCreate();
        C4937t.m15869a((Context) this);
        C4919k a = C4920l.m15789a((Context) this);
        if (a != null) {
            C4491ab.m13257a(a.f10157a);
        }
        this.f9880a = new Messenger(new C4898bq(this));
        C4871au.m15634a(this);
        C4899br brVar = new C4899br(this, (Map) null, 5222, "xiaomi.com", (C4685fw) null);
        this.f9883a = brVar;
        brVar.mo25161a(true);
        this.f9881a = new C4678fq(this, this.f9883a);
        this.f9889a = mo25867a();
        C4663fc.m14162a((Context) this);
        this.f9881a.mo25146a((C4684fv) this);
        this.f9887a = new C4859ao(this);
        this.f9888a = new C4878az(this);
        new C4908e().mo25971a();
        C4728he.mo25240a().mo25243a(this);
        this.f9890a = new C4910g("Connection Controller Thread");
        C4860ap a2 = C4860ap.mo25920a();
        a2.mo25927b();
        a2.mo25925a((C4860ap.C4861a) new C4900bs(this));
        if (m15424k()) {
            m15419h();
        }
        C4737hk.m14549a(this).mo25249a((C4738hl) new C4917i(this), "UPLOADER_PUSH_CHANNEL");
        mo25873a((C4830l) new C4733hh(this));
        mo25871a((C4827i) new C4825g());
        this.f9894a.add(C4887bg.m15694a((Context) this));
        if (m15419h()) {
            this.f9885a = new C4823e();
            registerReceiver(this.f9885a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        if ("com.xiaomi.xmsf".equals(getPackageName())) {
            Uri uriFor = Settings.Secure.getUriFor("EXTREME_POWER_MODE_ENABLE");
            if (uriFor != null) {
                this.f9879a = new C4901bt(this, new Handler(Looper.getMainLooper()));
                try {
                    getContentResolver().registerContentObserver(uriFor, false, this.f9879a);
                } catch (Throwable th) {
                    C3989b.m10669a("register observer err:" + th.getMessage());
                }
            }
            Uri uriFor2 = Settings.System.getUriFor("power_supersave_mode_open");
            if (uriFor2 != null) {
                this.f9896b = new C4902bu(this, new Handler(Looper.getMainLooper()));
                try {
                    getContentResolver().registerContentObserver(uriFor2, false, this.f9896b);
                } catch (Throwable th2) {
                    C3989b.m10681d("register super-power-mode observer err:" + th2.getMessage());
                }
            }
            int[] a3 = mo25867a();
            if (a3 != null) {
                this.f9886a = new C4834p();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                registerReceiver(this.f9886a, intentFilter);
                this.f9895b = a3[0];
                this.f9897c = a3[1];
                C3989b.m10669a("falldown initialized: " + this.f9895b + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f9897c);
            }
        }
        C3989b.m10669a("XMPushService created pid = " + f9877d);
    }

    public void onDestroy() {
        C4823e eVar = this.f9885a;
        if (eVar != null) {
            m15393a((BroadcastReceiver) eVar);
            this.f9885a = null;
        }
        C4834p pVar = this.f9886a;
        if (pVar != null) {
            m15393a((BroadcastReceiver) pVar);
            this.f9886a = null;
        }
        if ("com.xiaomi.xmsf".equals(getPackageName()) && this.f9879a != null) {
            try {
                getContentResolver().unregisterContentObserver(this.f9879a);
            } catch (Throwable th) {
                C3989b.m10669a("unregister observer err:" + th.getMessage());
            }
        }
        if ("com.xiaomi.xmsf".equals(getPackageName()) && this.f9896b != null) {
            try {
                getContentResolver().unregisterContentObserver(this.f9896b);
            } catch (Throwable th2) {
                C3989b.m10681d("unregister super-power-mode err:" + th2.getMessage());
            }
        }
        this.f9894a.clear();
        this.f9890a.mo25978b();
        mo25871a((C4827i) new C4895bn(this, 2));
        mo25871a((C4827i) new C4828j());
        C4860ap.mo25920a().mo25927b();
        C4860ap.mo25920a().mo25924a((Context) this, 15);
        C4860ap.mo25920a().mo25920a();
        this.f9881a.mo25152b((C4684fv) this);
        C4884be.mo25947a().mo25947a();
        C4663fc.m14161a();
        m15421i();
        super.onDestroy();
        C3989b.m10669a("Service destroyed");
    }

    public void onStart(Intent intent, int i) {
        C4826h hVar;
        long currentTimeMillis = System.currentTimeMillis();
        if (intent == null) {
            C3989b.m10681d("onStart() with intent NULL");
        } else {
            C3989b.m10680c(String.format("onStart() with intent.Action = %s, chid = %s, pkg = %s|%s, from-bridge = %s", new Object[]{intent.getAction(), intent.getStringExtra(C4870at.f10043r), intent.getStringExtra(C4870at.f10051z), intent.getStringExtra("mipush_app_package"), intent.getStringExtra("ext_is_xmpushservice_bridge")}));
        }
        if (!(intent == null || intent.getAction() == null)) {
            if ("com.xiaomi.push.timer".equalsIgnoreCase(intent.getAction()) || "com.xiaomi.push.check_alive".equalsIgnoreCase(intent.getAction())) {
                if (this.f9890a.mo25973a()) {
                    C3989b.m10681d("ERROR, the job controller is blocked.");
                    C4860ap.mo25920a().mo25924a((Context) this, 14);
                    stopSelf();
                } else {
                    hVar = new C4826h(intent);
                }
            } else if (!"com.xiaomi.push.network_status_changed".equalsIgnoreCase(intent.getAction())) {
                hVar = new C4826h(intent);
            }
            mo25871a((C4827i) hVar);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 > 50) {
            C3989b.m10680c("[Prefs] spend " + currentTimeMillis2 + " ms, too more times.");
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        onStart(intent, i2);
        return f9876a;
    }
}

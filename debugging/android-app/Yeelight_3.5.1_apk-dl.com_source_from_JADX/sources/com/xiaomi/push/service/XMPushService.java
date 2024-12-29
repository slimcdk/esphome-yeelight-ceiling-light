package com.xiaomi.push.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
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
import com.xiaomi.channel.commonutils.logger.C4407a;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.C4509ae;
import com.xiaomi.push.C4516al;
import com.xiaomi.push.C4526ar;
import com.xiaomi.push.C4551bj;
import com.xiaomi.push.C4560bo;
import com.xiaomi.push.C4600cv;
import com.xiaomi.push.C4612dd;
import com.xiaomi.push.C4614df;
import com.xiaomi.push.C4655ed;
import com.xiaomi.push.C4659eh;
import com.xiaomi.push.C4667eo;
import com.xiaomi.push.C4673eu;
import com.xiaomi.push.C4689fh;
import com.xiaomi.push.C4692fj;
import com.xiaomi.push.C4695fl;
import com.xiaomi.push.C4706fs;
import com.xiaomi.push.C4711fw;
import com.xiaomi.push.C4713fx;
import com.xiaomi.push.C4715fz;
import com.xiaomi.push.C4717ga;
import com.xiaomi.push.C4718gb;
import com.xiaomi.push.C4719gc;
import com.xiaomi.push.C4724gh;
import com.xiaomi.push.C4726gj;
import com.xiaomi.push.C4730gm;
import com.xiaomi.push.C4731gn;
import com.xiaomi.push.C4747h;
import com.xiaomi.push.C4750hb;
import com.xiaomi.push.C4753hd;
import com.xiaomi.push.C4757hg;
import com.xiaomi.push.C4758hh;
import com.xiaomi.push.C4760hj;
import com.xiaomi.push.C4765ho;
import com.xiaomi.push.C4783if;
import com.xiaomi.push.C4786ii;
import com.xiaomi.push.C4787ij;
import com.xiaomi.push.C4797it;
import com.xiaomi.push.C4804iz;
import com.xiaomi.push.C4805j;
import com.xiaomi.push.C4830m;
import com.xiaomi.push.C4835q;
import com.xiaomi.push.C4994v;
import com.xiaomi.push.C4995w;
import com.xiaomi.push.service.C4906bg;
import com.xiaomi.push.service.C4974p;
import com.xiaomi.push.service.C4985u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class XMPushService extends Service implements C4715fz {

    /* renamed from: b */
    private static boolean f9364b = false;

    /* renamed from: a */
    private int f9365a = 0;

    /* renamed from: a */
    private long f9366a = 0;

    /* renamed from: a */
    private ContentObserver f9367a;

    /* renamed from: a */
    Messenger f9368a = null;

    /* renamed from: a */
    private C4706fs f9369a;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C4711fw f9370a;

    /* renamed from: a */
    private C4713fx f9371a;

    /* renamed from: a */
    private C4718gb f9372a = new C4945ci(this);

    /* renamed from: a */
    private C4840a f9373a;

    /* renamed from: a */
    private C4845f f9374a;

    /* renamed from: a */
    private C4850k f9375a;

    /* renamed from: a */
    private C4857r f9376a;

    /* renamed from: a */
    private C4859t f9377a;

    /* renamed from: a */
    private C4903be f9378a = null;

    /* renamed from: a */
    private C4924bq f9379a;

    /* renamed from: a */
    private C4967j f9380a;

    /* renamed from: a */
    private C4974p f9381a = null;

    /* renamed from: a */
    protected Class f9382a = XMJobService.class;

    /* renamed from: a */
    private String f9383a;

    /* renamed from: a */
    private ArrayList<C4853n> f9384a = new ArrayList<>();

    /* renamed from: a */
    private Collection<C4883ar> f9385a = Collections.synchronizedCollection(new ArrayList());
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f9386a = false;

    /* renamed from: b */
    private int f9387b = 0;

    /* renamed from: com.xiaomi.push.service.XMPushService$a */
    private class C4840a extends BroadcastReceiver {

        /* renamed from: a */
        private final Object f9389a;

        private C4840a() {
            this.f9389a = new Object();
        }

        /* synthetic */ C4840a(XMPushService xMPushService, C4945ci ciVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m15125a() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                C4408b.m12483d("[Alarm] Cannot perform lock.notifyAll in the UI thread!");
                return;
            }
            synchronized (this.f9389a) {
                try {
                    this.f9389a.notifyAll();
                } catch (Exception e) {
                    C4408b.m12464a("[Alarm] notify lock. " + e);
                }
            }
        }

        /* renamed from: a */
        private void m15126a(long j) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                C4408b.m12483d("[Alarm] Cannot perform lock.wait in the UI thread!");
                return;
            }
            synchronized (this.f9389a) {
                try {
                    this.f9389a.wait(j);
                } catch (InterruptedException e) {
                    C4408b.m12464a("[Alarm] interrupt from waiting state. " + e);
                }
            }
        }

        public void onReceive(Context context, Intent intent) {
            long currentTimeMillis = System.currentTimeMillis();
            C4408b.m12482c("[Alarm] heartbeat alarm has been triggered.");
            if (!C4916bk.f9594p.equals(intent.getAction())) {
                C4408b.m12464a("[Alarm] cancel the old ping timer");
                C4673eu.m13753a();
            } else if (TextUtils.equals(context.getPackageName(), intent.getPackage())) {
                C4408b.m12482c("[Alarm] Ping XMChannelService on timer");
                try {
                    Intent intent2 = new Intent(context, XMPushService.class);
                    intent2.putExtra("time_stamp", System.currentTimeMillis());
                    intent2.setAction("com.xiaomi.push.timer");
                    ServiceClient.getInstance(context).startServiceSafely(intent2);
                    m15126a(3000);
                    C4408b.m12464a("[Alarm] heartbeat alarm finish in " + (System.currentTimeMillis() - currentTimeMillis));
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$b */
    class C4841b extends C4849j {

        /* renamed from: a */
        C4906bg.C4908b f9391a = null;

        public C4841b(C4906bg.C4908b bVar) {
            super(9);
            this.f9391a = bVar;
        }

        /* renamed from: a */
        public String mo29133a() {
            return "bind the client. " + this.f9391a.f9547g;
        }

        /* renamed from: a */
        public void m15129a() {
            String str;
            try {
                if (!XMPushService.this.mo29942c()) {
                    C4408b.m12483d("trying bind while the connection is not created, quit!");
                    return;
                }
                C4906bg a = C4906bg.mo30005a();
                C4906bg.C4908b bVar = this.f9391a;
                C4906bg.C4908b a2 = a.mo30006a(bVar.f9547g, bVar.f9541b);
                if (a2 == null) {
                    str = "ignore bind because the channel " + this.f9391a.f9547g + " is removed ";
                } else if (a2.f9535a == C4906bg.C4912c.unbind) {
                    a2.mo30018a(C4906bg.C4912c.binding, 0, 0, (String) null, (String) null);
                    XMPushService.m15050a(XMPushService.this).mo29174a(a2);
                    C4692fj.m13853a(XMPushService.this, a2);
                    return;
                } else {
                    str = "trying duplicate bind, ingore! " + a2.f9535a;
                }
                C4408b.m12464a(str);
            } catch (Exception e) {
                C4408b.m12483d("Meet error when trying to bind. " + e);
                XMPushService.this.mo29929a(10, e);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$c */
    static class C4842c extends C4849j {

        /* renamed from: a */
        private final C4906bg.C4908b f9392a;

        public C4842c(C4906bg.C4908b bVar) {
            super(12);
            this.f9392a = bVar;
        }

        /* renamed from: a */
        public String mo29133a() {
            return "bind time out. chid=" + this.f9392a.f9547g;
        }

        /* renamed from: a */
        public void m15131a() {
            this.f9392a.mo30018a(C4906bg.C4912c.unbind, 1, 21, (String) null, (String) null);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C4842c)) {
                return false;
            }
            return TextUtils.equals(((C4842c) obj).f9392a.f9547g, this.f9392a.f9547g);
        }

        public int hashCode() {
            return this.f9392a.f9547g.hashCode();
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$d */
    class C4843d extends C4849j {

        /* renamed from: a */
        private C4695fl f9393a = null;

        public C4843d(C4695fl flVar) {
            super(8);
            this.f9393a = flVar;
        }

        /* renamed from: a */
        public C4695fl mo29133a() {
            return this.f9393a;
        }

        /* renamed from: a */
        public String m15133a() {
            return "receive a message.";
        }

        /* renamed from: a */
        public void m15134a() {
            C4880ao aoVar = this.f9393a.f8170a;
            if (aoVar != null) {
                aoVar.f9475c = System.currentTimeMillis();
            }
            XMPushService.m15050a(XMPushService.this).mo30001a(this.f9393a);
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$e */
    public class C4844e extends C4849j {
        C4844e() {
            super(1);
        }

        /* renamed from: a */
        public String mo29133a() {
            return "do reconnect..";
        }

        /* renamed from: a */
        public void m15136a() {
            if (XMPushService.this.mo29927a()) {
                XMPushService xMPushService = XMPushService.this;
                if (xMPushService.m15067a(xMPushService.getApplicationContext())) {
                    XMPushService.this.m15088f();
                    return;
                }
            }
            C4408b.m12464a("should not connect. quit the job.");
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$f */
    class C4845f extends BroadcastReceiver {
        C4845f() {
        }

        public void onReceive(Context context, Intent intent) {
            C4408b.m12464a("network changed, " + C4830m.m15001a(intent));
            XMPushService.this.onStart(intent, 1);
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$g */
    public class C4846g extends C4849j {

        /* renamed from: a */
        public Exception f9398a;

        /* renamed from: b */
        public int f9399b;

        C4846g(int i, Exception exc) {
            super(2);
            this.f9399b = i;
            this.f9398a = exc;
        }

        /* renamed from: a */
        public String mo29133a() {
            return "disconnect the connection.";
        }

        /* renamed from: a */
        public void m15138a() {
            XMPushService.this.mo29929a(this.f9399b, this.f9398a);
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$h */
    class C4847h extends C4849j {
        C4847h() {
            super(SupportMenu.USER_MASK);
        }

        /* renamed from: a */
        public String mo29133a() {
            return "Init Job";
        }

        /* renamed from: a */
        public void m15140a() {
            XMPushService.m15075b(XMPushService.this);
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$i */
    class C4848i extends C4849j {

        /* renamed from: a */
        private Intent f9401a = null;

        public C4848i(Intent intent) {
            super(15);
            this.f9401a = intent;
        }

        /* renamed from: a */
        public Intent mo29133a() {
            return this.f9401a;
        }

        /* renamed from: a */
        public String m15142a() {
            return "Handle intent action = " + this.f9401a.getAction();
        }

        /* renamed from: a */
        public void m15143a() {
            XMPushService.this.m15084d(this.f9401a);
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$j */
    public static abstract class C4849j extends C4974p.C4976b {
        public C4849j(int i) {
            super(i);
        }

        /* renamed from: a */
        public abstract String mo29133a();

        /* renamed from: a */
        public abstract void m15145a();

        public void run() {
            int i = this.f9714a;
            if (!(i == 4 || i == 8)) {
                C4408b.m12467a(C4407a.f7351a, mo29133a());
            }
            mo29133a();
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$k */
    class C4850k extends BroadcastReceiver {
        C4850k() {
        }

        public void onReceive(Context context, Intent intent) {
            C4408b.m12464a("[HB] hold short heartbeat, " + C4830m.m15001a(intent));
            if (intent != null && intent.getExtras() != null) {
                XMPushService.this.onStart(intent, 1);
            }
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$l */
    class C4851l extends C4849j {
        public C4851l() {
            super(5);
        }

        /* renamed from: a */
        public String mo29133a() {
            return "ask the job queue to quit";
        }

        /* renamed from: a */
        public void m15147a() {
            XMPushService.m15050a(XMPushService.this).mo30063a();
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$m */
    class C4852m extends C4849j {

        /* renamed from: a */
        private C4731gn f9405a = null;

        public C4852m(C4731gn gnVar) {
            super(8);
            this.f9405a = gnVar;
        }

        /* renamed from: a */
        public String mo29133a() {
            return "receive a message.";
        }

        /* renamed from: a */
        public void m15149a() {
            XMPushService.m15050a(XMPushService.this).mo30002a(this.f9405a);
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$n */
    public interface C4853n {
        /* renamed from: a */
        void mo29275a();
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$o */
    class C4854o extends C4849j {

        /* renamed from: a */
        boolean f9408a;

        public C4854o(boolean z) {
            super(4);
            this.f9408a = z;
        }

        /* renamed from: a */
        public String mo29133a() {
            return "send ping..";
        }

        /* renamed from: a */
        public void m15152a() {
            if (XMPushService.this.mo29942c()) {
                try {
                    if (!this.f9408a) {
                        C4692fj.m13848a();
                    }
                    XMPushService.m15050a(XMPushService.this).mo29192b(this.f9408a);
                } catch (C4724gh e) {
                    C4408b.m12478a((Throwable) e);
                    XMPushService.this.mo29929a(10, (Exception) e);
                }
            }
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$p */
    class C4855p extends C4849j {

        /* renamed from: a */
        C4906bg.C4908b f9410a = null;

        public C4855p(C4906bg.C4908b bVar) {
            super(4);
            this.f9410a = bVar;
        }

        /* renamed from: a */
        public String mo29133a() {
            return "rebind the client. " + this.f9410a.f9547g;
        }

        /* renamed from: a */
        public void m15154a() {
            try {
                this.f9410a.mo30018a(C4906bg.C4912c.unbind, 1, 16, (String) null, (String) null);
                C4711fw a = XMPushService.m15050a(XMPushService.this);
                C4906bg.C4908b bVar = this.f9410a;
                a.mo29175a(bVar.f9547g, bVar.f9541b);
                XMPushService xMPushService = XMPushService.this;
                xMPushService.mo29932a((C4849j) new C4841b(this.f9410a), 300);
            } catch (C4724gh e) {
                C4408b.m12478a((Throwable) e);
                XMPushService.this.mo29929a(10, (Exception) e);
            }
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$q */
    class C4856q extends C4849j {
        C4856q() {
            super(3);
        }

        /* renamed from: a */
        public String mo29133a() {
            return "reset the connection.";
        }

        /* renamed from: a */
        public void m15156a() {
            XMPushService.this.mo29929a(11, (Exception) null);
            if (XMPushService.this.mo29927a()) {
                XMPushService xMPushService = XMPushService.this;
                if (xMPushService.m15067a(xMPushService.getApplicationContext())) {
                    XMPushService.this.m15088f();
                }
            }
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$r */
    class C4857r extends BroadcastReceiver {
        C4857r() {
        }

        public void onReceive(Context context, Intent intent) {
            XMPushService.this.onStart(intent, 1);
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$s */
    class C4858s extends C4849j {

        /* renamed from: a */
        C4906bg.C4908b f9414a = null;

        /* renamed from: a */
        String f9415a;

        /* renamed from: b */
        int f9416b;

        /* renamed from: b */
        String f9417b;

        public C4858s(C4906bg.C4908b bVar, int i, String str, String str2) {
            super(9);
            this.f9414a = bVar;
            this.f9416b = i;
            this.f9415a = str;
            this.f9417b = str2;
        }

        /* renamed from: a */
        public String mo29133a() {
            return "unbind the channel. " + this.f9414a.f9547g;
        }

        /* renamed from: a */
        public void m15158a() {
            if (!(this.f9414a.f9535a == C4906bg.C4912c.unbind || XMPushService.m15050a(XMPushService.this) == null)) {
                try {
                    C4711fw a = XMPushService.m15050a(XMPushService.this);
                    C4906bg.C4908b bVar = this.f9414a;
                    a.mo29175a(bVar.f9547g, bVar.f9541b);
                } catch (C4724gh e) {
                    C4408b.m12478a((Throwable) e);
                    XMPushService.this.mo29929a(10, (Exception) e);
                }
            }
            this.f9414a.mo30018a(C4906bg.C4912c.unbind, this.f9416b, 0, this.f9417b, this.f9415a);
        }
    }

    /* renamed from: com.xiaomi.push.service.XMPushService$t */
    class C4859t extends BroadcastReceiver {
        C4859t() {
        }

        public void onReceive(Context context, Intent intent) {
            if (!XMPushService.m15075b(XMPushService.this)) {
                boolean unused = XMPushService.this.f9386a = true;
            }
            C4408b.m12464a("[HB] wifi changed, " + C4830m.m15001a(intent));
            XMPushService.this.onStart(intent, 1);
        }
    }

    /* renamed from: a */
    private C4731gn m15053a(C4731gn gnVar, String str, String str2) {
        StringBuilder sb;
        String str3;
        C4906bg a = C4906bg.mo30005a();
        List a2 = a.mo30007a(str);
        if (a2.isEmpty()) {
            sb = new StringBuilder();
            str3 = "open channel should be called first before sending a packet, pkg=";
        } else {
            gnVar.mo29261o(str);
            str = gnVar.mo29252k();
            if (TextUtils.isEmpty(str)) {
                str = (String) a2.get(0);
                gnVar.mo29255l(str);
            }
            C4906bg.C4908b a3 = a.mo30006a(str, gnVar.mo29256m());
            if (!mo29942c()) {
                sb = new StringBuilder();
                str3 = "drop a packet as the channel is not connected, chid=";
            } else if (a3 == null || a3.f9535a != C4906bg.C4912c.binded) {
                sb = new StringBuilder();
                str3 = "drop a packet as the channel is not opened, chid=";
            } else if (TextUtils.equals(str2, a3.f9549i)) {
                return gnVar;
            } else {
                sb = new StringBuilder();
                sb.append("invalid session. ");
                sb.append(str2);
                C4408b.m12464a(sb.toString());
                return null;
            }
        }
        sb.append(str3);
        sb.append(str);
        C4408b.m12464a(sb.toString());
        return null;
    }

    /* renamed from: a */
    private C4906bg.C4908b m15055a(String str, Intent intent) {
        C4906bg.C4908b a = C4906bg.mo30005a().mo30006a(str, intent.getStringExtra(C4916bk.f9595q));
        if (a == null) {
            a = new C4906bg.C4908b(this);
        }
        a.f9547g = intent.getStringExtra(C4916bk.f9598t);
        a.f9541b = intent.getStringExtra(C4916bk.f9595q);
        a.f9543c = intent.getStringExtra(C4916bk.f9600v);
        a.f9537a = intent.getStringExtra(C4916bk.f9566B);
        a.f9545e = intent.getStringExtra(C4916bk.f9604z);
        a.f9546f = intent.getStringExtra(C4916bk.f9565A);
        a.f9539a = intent.getBooleanExtra(C4916bk.f9603y, false);
        a.f9548h = intent.getStringExtra(C4916bk.f9602x);
        a.f9549i = intent.getStringExtra(C4916bk.f9570F);
        a.f9544d = intent.getStringExtra(C4916bk.f9601w);
        a.f9536a = this.f9380a;
        a.mo30016a((Messenger) intent.getParcelableExtra(C4916bk.f9574J));
        a.f9529a = getApplicationContext();
        C4906bg.mo30005a().mo30011a(a);
        return a;
    }

    /* renamed from: a */
    private String mo29927a() {
        String a = C4830m.m14999a("ro.miui.region");
        return TextUtils.isEmpty(a) ? C4830m.m14999a("ro.product.locale.region") : a;
    }

    /* renamed from: a */
    private void m15059a(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null) {
            try {
                unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e) {
                C4408b.m12478a((Throwable) e);
            }
        }
    }

    /* renamed from: a */
    private void m15060a(Intent intent) {
        Bundle extras;
        if (intent != null && (extras = intent.getExtras()) != null) {
            C4972o.m15587a(getApplicationContext()).mo30059a(extras.getString("digest"));
        }
    }

    /* renamed from: a */
    private void m15061a(Intent intent, int i) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
        boolean booleanExtra = intent.getBooleanExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
        C4786ii iiVar = new C4786ii();
        try {
            C4797it.m14833a(iiVar, byteArrayExtra);
            C4516al.m12857a(getApplicationContext()).mo28736a((C4516al.C4517a) new C4897b(iiVar, new WeakReference(this), booleanExtra), i);
        } catch (C4804iz unused) {
            C4408b.m12483d("aw_ping : send help app ping  error");
        }
    }

    /* renamed from: a */
    private void m15064a(C4860a aVar) {
        String str;
        String str2;
        if (aVar == null || !TextUtils.isEmpty(aVar.mo29959b()) || TextUtils.isEmpty(aVar.mo29957a())) {
            str = "no need to check country code";
        } else {
            String a = "com.xiaomi.xmsf".equals(getPackageName()) ? mo29927a() : C4830m.m15010b();
            if (!TextUtils.isEmpty(a)) {
                String name = C4830m.m14999a(a).name();
                if (TextUtils.equals(name, aVar.mo29957a())) {
                    aVar.mo29960b(a);
                    str2 = "update country code";
                } else {
                    str2 = "not update country code, because not equals " + name;
                }
                C4408b.m12464a(str2);
                return;
            }
            str = "check no country code";
        }
        C4408b.m12481b(str);
    }

    /* renamed from: a */
    private static void m15065a(String str) {
        String str2;
        String str3;
        if (C4835q.China.name().equals(str)) {
            C4600cv.m13231a("cn.app.chat.xiaomi.net", "cn.app.chat.xiaomi.net");
            C4600cv.m13231a("cn.app.chat.xiaomi.net", "111.13.141.211:443");
            C4600cv.m13231a("cn.app.chat.xiaomi.net", "39.156.81.172:443");
            C4600cv.m13231a("cn.app.chat.xiaomi.net", "111.202.1.250:443");
            C4600cv.m13231a("cn.app.chat.xiaomi.net", "123.125.102.213:443");
            str2 = "resolver.msg.xiaomi.net";
            C4600cv.m13231a(str2, "111.13.142.153:443");
            str3 = "111.202.1.252:443";
        } else {
            C4600cv.m13231a("app.chat.global.xiaomi.net", "app.chat.global.xiaomi.net");
            str2 = "resolver.msg.global.xiaomi.net";
            C4600cv.m13231a(str2, "161.117.97.14:443");
            str3 = "161.117.180.178:443";
        }
        C4600cv.m13231a(str2, str3);
    }

    /* renamed from: a */
    private void m15066a(String str, int i) {
        Collection<C4906bg.C4908b> a = C4906bg.mo30005a().mo30007a(str);
        if (a != null) {
            for (C4906bg.C4908b bVar : a) {
                if (bVar != null) {
                    mo29931a((C4849j) new C4858s(bVar, i, (String) null, (String) null));
                }
            }
        }
        C4906bg.mo30005a().mo30007a(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m15067a(Context context) {
        try {
            C4526ar.m12889a();
            for (int i = 100; i > 0; i--) {
                if (C4551bj.m13001c(context)) {
                    C4408b.m12464a("network connectivity ok.");
                    return true;
                }
                try {
                    Thread.sleep(100);
                } catch (Exception unused) {
                }
            }
            return false;
        } catch (Exception unused2) {
            return true;
        }
    }

    /* renamed from: a */
    private boolean m15071a(String str, Intent intent) {
        C4906bg.C4908b a = C4906bg.mo30005a().mo30006a(str, intent.getStringExtra(C4916bk.f9595q));
        boolean z = false;
        if (a == null || str == null) {
            return false;
        }
        String stringExtra = intent.getStringExtra(C4916bk.f9570F);
        String stringExtra2 = intent.getStringExtra(C4916bk.f9602x);
        if (!TextUtils.isEmpty(a.f9549i) && !TextUtils.equals(stringExtra, a.f9549i)) {
            C4408b.m12464a("session changed. old session=" + a.f9549i + ", new session=" + stringExtra + " chid = " + str);
            z = true;
        }
        if (stringExtra2.equals(a.f9548h)) {
            return z;
        }
        C4408b.m12464a("security changed. chid = " + str + " sechash = " + C4560bo.m13038a(stringExtra2));
        return true;
    }

    /* renamed from: a */
    private int[] m15072a() {
        String[] split;
        String a = C4898ba.m15362a(getApplicationContext()).mo29991a(C4765ho.FallDownTimeRange.mo29322a(), "");
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
                C4408b.m12483d("parse falldown time range failure: " + e);
            }
        }
        return null;
    }

    /* renamed from: b */
    private String mo29940b() {
        String str;
        C4526ar.m12889a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Object obj = new Object();
        String str2 = null;
        int i = 0;
        if ("com.xiaomi.xmsf".equals(getPackageName())) {
            C4921bn a = C4921bn.m15441a(this);
            String str3 = null;
            while (true) {
                if (!TextUtils.isEmpty(str3) && a.mo30023a() != 0) {
                    break;
                }
                if (TextUtils.isEmpty(str3)) {
                    str3 = mo29927a();
                }
                try {
                    synchronized (obj) {
                        if (i < 30) {
                            obj.wait(1000);
                        } else {
                            obj.wait(30000);
                        }
                    }
                } catch (InterruptedException unused) {
                }
                i++;
            }
            str = mo29927a();
        } else {
            str = C4830m.m15010b();
        }
        if (!TextUtils.isEmpty(str)) {
            C4860a.m15159a(getApplicationContext()).mo29960b(str);
            str2 = C4830m.m14999a(str).name();
        }
        C4408b.m12464a("wait region :" + str2 + " cost = " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " , count = " + i);
        return str2;
    }

    /* renamed from: b */
    private void m15074b(Intent intent) {
        C4695fl flVar;
        long j;
        String str;
        Intent intent2 = intent;
        String stringExtra = intent2.getStringExtra(C4916bk.f9566B);
        String stringExtra2 = intent2.getStringExtra(C4916bk.f9570F);
        Bundle bundleExtra = intent2.getBundleExtra("ext_packet");
        C4906bg a = C4906bg.mo30005a();
        if (bundleExtra != null) {
            C4730gm gmVar = (C4730gm) m15053a((C4731gn) new C4730gm(bundleExtra), stringExtra, stringExtra2);
            if (gmVar != null) {
                flVar = C4695fl.m13861a((C4731gn) gmVar, a.mo30006a(gmVar.mo29252k(), gmVar.mo29256m()).f9548h);
            } else {
                return;
            }
        } else {
            byte[] byteArrayExtra = intent2.getByteArrayExtra("ext_raw_packet");
            if (byteArrayExtra != null) {
                try {
                    j = Long.parseLong(intent2.getStringExtra(C4916bk.f9595q));
                } catch (NumberFormatException unused) {
                    j = 0;
                }
                String stringExtra3 = intent2.getStringExtra(C4916bk.f9596r);
                String stringExtra4 = intent2.getStringExtra(C4916bk.f9597s);
                String stringExtra5 = intent2.getStringExtra("ext_chid");
                C4906bg.C4908b a2 = a.mo30006a(stringExtra5, String.valueOf(j));
                if (a2 != null) {
                    C4695fl flVar2 = new C4695fl();
                    if ("10".equals(stringExtra5)) {
                        flVar2.mo29154b(Integer.parseInt("10"));
                        flVar2.f8170a.f9471a = intent2.getBooleanExtra("screen_on", true);
                        flVar2.f8170a.f9474b = intent2.getBooleanExtra("wifi", true);
                        str = stringExtra3;
                        flVar2.f8170a.f9470a = intent2.getLongExtra("rx_msg", -1);
                        flVar2.f8170a.f9473b = intent2.getLongExtra("enqueue", -1);
                        flVar2.f8170a.f9472b = intent2.getIntExtra("num", -1);
                        flVar2.f8170a.f9475c = intent2.getLongExtra("run", -1);
                    } else {
                        str = stringExtra3;
                    }
                    try {
                        flVar2.mo29147a(Integer.parseInt(stringExtra5));
                    } catch (NumberFormatException unused2) {
                    }
                    flVar2.mo29150a("SECMSG", (String) null);
                    flVar2.mo29148a(j, TextUtils.isEmpty(str) ? "xiaomi.com" : str, stringExtra4);
                    flVar2.mo29149a(intent2.getStringExtra("ext_pkt_id"));
                    flVar2.mo29152a(byteArrayExtra, a2.f9548h);
                    C4408b.m12464a("send a message: chid=" + stringExtra5 + ", packetId=" + intent2.getStringExtra("ext_pkt_id"));
                    flVar = flVar2;
                }
            }
            flVar = null;
        }
        if (flVar != null) {
            m15080c((C4849j) new C4927bt(this, flVar));
        }
    }

    /* renamed from: b */
    private void m15076b(boolean z) {
        this.f9366a = SystemClock.elapsedRealtime();
        if (mo29942c()) {
            if (C4551bj.m13000b(this)) {
                m15080c((C4849j) new C4854o(z));
                return;
            }
            m15080c((C4849j) new C4846g(17, (Exception) null));
        }
        mo29937a(true);
    }

    /* renamed from: c */
    private void mo29942c() {
        String str;
        C4860a a = C4860a.m15159a(getApplicationContext());
        String a2 = a.mo29957a();
        C4408b.m12464a("region of cache is " + a2);
        if (TextUtils.isEmpty(a2)) {
            a2 = mo29940b();
        } else {
            m15064a(a);
        }
        if (!TextUtils.isEmpty(a2)) {
            this.f9383a = a2;
            a.mo29958a(a2);
            if (C4835q.Global.name().equals(this.f9383a)) {
                str = "app.chat.global.xiaomi.net";
            } else if (C4835q.Europe.name().equals(this.f9383a)) {
                str = "fr.app.chat.global.xiaomi.net";
            } else if (C4835q.Russia.name().equals(this.f9383a)) {
                str = "ru.app.chat.global.xiaomi.net";
            } else if (C4835q.India.name().equals(this.f9383a)) {
                str = "idmb.app.chat.global.xiaomi.net";
            }
            C4713fx.m13972a(str);
        } else {
            this.f9383a = C4835q.China.name();
        }
        if (C4835q.China.name().equals(this.f9383a)) {
            C4713fx.m13972a("cn.app.chat.xiaomi.net");
        }
        m15065a(this.f9383a);
        if (m15092h()) {
            C4955cs csVar = new C4955cs(this, 11);
            mo29931a((C4849j) csVar);
            C4985u.m15683a((C4985u.C4986a) new C4956ct(this, csVar));
        }
        try {
            if (C4994v.m15733a()) {
                this.f9380a.mo30048a((Context) this);
            }
        } catch (Exception e) {
            C4408b.m12478a((Throwable) e);
        }
    }

    /* renamed from: c */
    private void m15079c(Intent intent) {
        String stringExtra = intent.getStringExtra(C4916bk.f9566B);
        String stringExtra2 = intent.getStringExtra(C4916bk.f9570F);
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("ext_packets");
        int length = parcelableArrayExtra.length;
        C4730gm[] gmVarArr = new C4730gm[length];
        intent.getBooleanExtra("ext_encrypt", true);
        int i = 0;
        while (i < parcelableArrayExtra.length) {
            gmVarArr[i] = new C4730gm((Bundle) parcelableArrayExtra[i]);
            gmVarArr[i] = (C4730gm) m15053a((C4731gn) gmVarArr[i], stringExtra, stringExtra2);
            if (gmVarArr[i] != null) {
                i++;
            } else {
                return;
            }
        }
        C4906bg a = C4906bg.mo30005a();
        C4695fl[] flVarArr = new C4695fl[length];
        for (int i2 = 0; i2 < length; i2++) {
            C4730gm gmVar = gmVarArr[i2];
            flVarArr[i2] = C4695fl.m13861a((C4731gn) gmVar, a.mo30006a(gmVar.mo29252k(), gmVar.mo29256m()).f9548h);
        }
        m15080c((C4849j) new C4936c(this, flVarArr));
    }

    /* renamed from: c */
    private void m15080c(C4849j jVar) {
        this.f9381a.mo30066a((C4974p.C4976b) jVar);
    }

    /* renamed from: c */
    private void m15082c(boolean z) {
        try {
            if (!C4994v.m15733a()) {
                return;
            }
            if (z) {
                sendBroadcast(new Intent("miui.intent.action.NETWORK_CONNECTED"));
                for (C4883ar a : (C4883ar[]) this.f9385a.toArray(new C4883ar[0])) {
                    a.mo29970a();
                }
                return;
            }
            sendBroadcast(new Intent("miui.intent.action.NETWORK_BLOCKED"));
        } catch (Exception e) {
            C4408b.m12478a((Throwable) e);
        }
    }

    /* renamed from: d */
    private void mo29943d() {
        NetworkInfo networkInfo;
        try {
            networkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception e) {
            C4408b.m12478a((Throwable) e);
            networkInfo = null;
        }
        C4972o.m15587a(getApplicationContext()).mo30058a(networkInfo);
        if (networkInfo != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("network changed,");
            sb.append("[" + "type: " + networkInfo.getTypeName() + "[" + networkInfo.getSubtypeName() + "], state: " + networkInfo.getState() + MiotCloudImpl.COOKIE_PATH + networkInfo.getDetailedState());
            C4408b.m12464a(sb.toString());
            NetworkInfo.State state = networkInfo.getState();
            if (state == NetworkInfo.State.SUSPENDED || state == NetworkInfo.State.UNKNOWN) {
                return;
            }
        } else {
            C4408b.m12464a("network changed, no active network");
        }
        if (C4689fh.mo29139a() != null) {
            C4689fh.mo29139a().mo29134a();
        }
        C4750hb.m14138a((Context) this);
        this.f9369a.mo29194d();
        if (C4551bj.m13000b(this)) {
            if (mo29942c() && m15088f()) {
                m15076b(false);
            }
            if (!mo29942c() && !mo29943d()) {
                this.f9381a.mo30064a(1);
                mo29931a((C4849j) new C4844e());
            }
            C4614df.m13297a((Context) this).mo28905a();
        } else {
            mo29931a((C4849j) new C4846g(2, (Exception) null));
        }
        m15085e();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: com.xiaomi.push.service.XMPushService$p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: com.xiaomi.push.service.XMPushService$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v66, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v49, resolved type: com.xiaomi.push.service.bg$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v90, resolved type: com.xiaomi.push.service.XMPushService$q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v104, resolved type: com.xiaomi.push.service.cu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v105, resolved type: com.xiaomi.push.service.cu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v184, resolved type: com.xiaomi.push.service.cu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v106, resolved type: com.xiaomi.push.service.cu} */
    /* JADX WARNING: type inference failed for: r12v12, types: [com.xiaomi.push.service.XMPushService$j] */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v45 */
    /* JADX WARNING: type inference failed for: r2v63 */
    /* JADX WARNING: type inference failed for: r2v64 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0424  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0452  */
    /* JADX WARNING: Removed duplicated region for block: B:358:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m15084d(android.content.Intent r12) {
        /*
            r11 = this;
            com.xiaomi.push.service.bg r0 = com.xiaomi.push.service.C4906bg.mo30005a()
            java.lang.String r1 = com.xiaomi.push.service.C4916bk.f9582d
            java.lang.String r2 = r12.getAction()
            boolean r1 = r1.equalsIgnoreCase(r2)
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x088a
            java.lang.String r1 = com.xiaomi.push.service.C4916bk.f9588j
            java.lang.String r5 = r12.getAction()
            boolean r1 = r1.equalsIgnoreCase(r5)
            if (r1 == 0) goto L_0x0021
            goto L_0x088a
        L_0x0021:
            java.lang.String r1 = com.xiaomi.push.service.C4916bk.f9587i
            java.lang.String r5 = r12.getAction()
            boolean r1 = r1.equalsIgnoreCase(r5)
            if (r1 == 0) goto L_0x0091
            java.lang.String r1 = com.xiaomi.push.service.C4916bk.f9566B
            java.lang.String r1 = r12.getStringExtra(r1)
            java.lang.String r3 = com.xiaomi.push.service.C4916bk.f9598t
            java.lang.String r5 = r12.getStringExtra(r3)
            java.lang.String r3 = com.xiaomi.push.service.C4916bk.f9595q
            java.lang.String r6 = r12.getStringExtra(r3)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r3 = "Service called close channel chid = "
            r12.append(r3)
            r12.append(r5)
            java.lang.String r3 = " res = "
            r12.append(r3)
            java.lang.String r3 = com.xiaomi.push.service.C4906bg.C4908b.m15409a((java.lang.String) r6)
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r12)
            boolean r12 = android.text.TextUtils.isEmpty(r5)
            if (r12 == 0) goto L_0x007d
            java.util.List r12 = r0.mo30007a((java.lang.String) r1)
            java.util.Iterator r12 = r12.iterator()
        L_0x006d:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0901
            java.lang.Object r0 = r12.next()
            java.lang.String r0 = (java.lang.String) r0
            r11.m15066a((java.lang.String) r0, (int) r2)
            goto L_0x006d
        L_0x007d:
            boolean r12 = android.text.TextUtils.isEmpty(r6)
            if (r12 == 0) goto L_0x0088
            r11.m15066a((java.lang.String) r5, (int) r2)
            goto L_0x0901
        L_0x0088:
            r7 = 2
            r8 = 0
            r9 = 0
            r4 = r11
            r4.mo29935a(r5, r6, r7, r8, r9)
            goto L_0x0901
        L_0x0091:
            java.lang.String r1 = com.xiaomi.push.service.C4916bk.f9583e
            java.lang.String r2 = r12.getAction()
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x00b9
            java.lang.String r0 = "ext_chid"
            java.lang.String r0 = r12.getStringExtra(r0)
            java.lang.String r1 = "10"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b4
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "run"
            r12.putExtra(r2, r0)
        L_0x00b4:
            r11.m15074b((android.content.Intent) r12)
            goto L_0x0901
        L_0x00b9:
            java.lang.String r1 = com.xiaomi.push.service.C4916bk.f9585g
            java.lang.String r2 = r12.getAction()
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x00ca
            r11.m15079c((android.content.Intent) r12)
            goto L_0x0901
        L_0x00ca:
            java.lang.String r1 = com.xiaomi.push.service.C4916bk.f9584f
            java.lang.String r2 = r12.getAction()
            boolean r1 = r1.equalsIgnoreCase(r2)
            java.lang.String r2 = "ext_packet"
            if (r1 == 0) goto L_0x010f
            java.lang.String r1 = com.xiaomi.push.service.C4916bk.f9566B
            java.lang.String r1 = r12.getStringExtra(r1)
            java.lang.String r3 = com.xiaomi.push.service.C4916bk.f9570F
            java.lang.String r3 = r12.getStringExtra(r3)
            android.os.Bundle r12 = r12.getBundleExtra(r2)
            com.xiaomi.push.gl r2 = new com.xiaomi.push.gl
            r2.<init>(r12)
            com.xiaomi.push.gn r12 = r11.m15053a((com.xiaomi.push.C4731gn) r2, (java.lang.String) r1, (java.lang.String) r3)
            if (r12 == 0) goto L_0x0901
            java.lang.String r1 = r12.mo29252k()
            java.lang.String r2 = r12.mo29256m()
            com.xiaomi.push.service.bg$b r0 = r0.mo30006a((java.lang.String) r1, (java.lang.String) r2)
            java.lang.String r0 = r0.f9548h
            com.xiaomi.push.fl r12 = com.xiaomi.push.C4695fl.m13861a((com.xiaomi.push.C4731gn) r12, (java.lang.String) r0)
            com.xiaomi.push.service.bt r0 = new com.xiaomi.push.service.bt
            r0.<init>(r11, r12)
        L_0x010a:
            r11.m15080c((com.xiaomi.push.service.XMPushService.C4849j) r0)
            goto L_0x0901
        L_0x010f:
            java.lang.String r1 = com.xiaomi.push.service.C4916bk.f9586h
            java.lang.String r5 = r12.getAction()
            boolean r1 = r1.equalsIgnoreCase(r5)
            if (r1 == 0) goto L_0x014e
            java.lang.String r1 = com.xiaomi.push.service.C4916bk.f9566B
            java.lang.String r1 = r12.getStringExtra(r1)
            java.lang.String r3 = com.xiaomi.push.service.C4916bk.f9570F
            java.lang.String r3 = r12.getStringExtra(r3)
            android.os.Bundle r12 = r12.getBundleExtra(r2)
            com.xiaomi.push.gp r2 = new com.xiaomi.push.gp
            r2.<init>((android.os.Bundle) r12)
            com.xiaomi.push.gn r12 = r11.m15053a((com.xiaomi.push.C4731gn) r2, (java.lang.String) r1, (java.lang.String) r3)
            if (r12 == 0) goto L_0x0901
            java.lang.String r1 = r12.mo29252k()
            java.lang.String r2 = r12.mo29256m()
            com.xiaomi.push.service.bg$b r0 = r0.mo30006a((java.lang.String) r1, (java.lang.String) r2)
            java.lang.String r0 = r0.f9548h
            com.xiaomi.push.fl r12 = com.xiaomi.push.C4695fl.m13861a((com.xiaomi.push.C4731gn) r12, (java.lang.String) r0)
            com.xiaomi.push.service.bt r0 = new com.xiaomi.push.service.bt
            r0.<init>(r11, r12)
            goto L_0x010a
        L_0x014e:
            java.lang.String r1 = com.xiaomi.push.service.C4916bk.f9589k
            java.lang.String r2 = r12.getAction()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x01b7
            java.lang.String r0 = com.xiaomi.push.service.C4916bk.f9598t
            java.lang.String r0 = r12.getStringExtra(r0)
            java.lang.String r1 = com.xiaomi.push.service.C4916bk.f9595q
            java.lang.String r1 = r12.getStringExtra(r1)
            if (r0 == 0) goto L_0x0901
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "request reset connection from chid = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r2)
            com.xiaomi.push.service.bg r2 = com.xiaomi.push.service.C4906bg.mo30005a()
            com.xiaomi.push.service.bg$b r0 = r2.mo30006a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 == 0) goto L_0x0901
            java.lang.String r1 = r0.f9548h
            java.lang.String r2 = com.xiaomi.push.service.C4916bk.f9602x
            java.lang.String r12 = r12.getStringExtra(r2)
            boolean r12 = r1.equals(r12)
            if (r12 == 0) goto L_0x0901
            com.xiaomi.push.service.bg$c r12 = r0.f9535a
            com.xiaomi.push.service.bg$c r0 = com.xiaomi.push.service.C4906bg.C4912c.binded
            if (r12 != r0) goto L_0x0901
            com.xiaomi.push.fw r12 = r11.mo29927a()
            if (r12 == 0) goto L_0x01ad
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2 = 15000(0x3a98, double:7.411E-320)
            long r0 = r0 - r2
            boolean r12 = r12.mo29187a((long) r0)
            if (r12 != 0) goto L_0x0901
        L_0x01ad:
            com.xiaomi.push.service.XMPushService$q r12 = new com.xiaomi.push.service.XMPushService$q
            r12.<init>()
        L_0x01b2:
            r11.m15080c((com.xiaomi.push.service.XMPushService.C4849j) r12)
            goto L_0x0901
        L_0x01b7:
            java.lang.String r1 = com.xiaomi.push.service.C4916bk.f9590l
            java.lang.String r2 = r12.getAction()
            boolean r1 = r1.equals(r2)
            r2 = 0
            if (r1 == 0) goto L_0x0247
            java.lang.String r1 = com.xiaomi.push.service.C4916bk.f9566B
            java.lang.String r1 = r12.getStringExtra(r1)
            java.util.List r3 = r0.mo30007a((java.lang.String) r1)
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L_0x01e9
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "open channel should be called first before update info, pkg="
            r12.append(r0)
            r12.append(r1)
            java.lang.String r12 = r12.toString()
        L_0x01e5:
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r12)
            return
        L_0x01e9:
            java.lang.String r1 = com.xiaomi.push.service.C4916bk.f9598t
            java.lang.String r1 = r12.getStringExtra(r1)
            java.lang.String r5 = com.xiaomi.push.service.C4916bk.f9595q
            java.lang.String r5 = r12.getStringExtra(r5)
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            if (r6 == 0) goto L_0x0201
            java.lang.Object r1 = r3.get(r4)
            java.lang.String r1 = (java.lang.String) r1
        L_0x0201:
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 == 0) goto L_0x021f
            java.util.Collection r0 = r0.mo30007a((java.lang.String) r1)
            if (r0 == 0) goto L_0x0223
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0223
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            r2 = r0
            com.xiaomi.push.service.bg$b r2 = (com.xiaomi.push.service.C4906bg.C4908b) r2
            goto L_0x0223
        L_0x021f:
            com.xiaomi.push.service.bg$b r2 = r0.mo30006a((java.lang.String) r1, (java.lang.String) r5)
        L_0x0223:
            if (r2 == 0) goto L_0x0901
            java.lang.String r0 = com.xiaomi.push.service.C4916bk.f9604z
            boolean r0 = r12.hasExtra(r0)
            if (r0 == 0) goto L_0x0235
            java.lang.String r0 = com.xiaomi.push.service.C4916bk.f9604z
            java.lang.String r0 = r12.getStringExtra(r0)
            r2.f9545e = r0
        L_0x0235:
            java.lang.String r0 = com.xiaomi.push.service.C4916bk.f9565A
            boolean r0 = r12.hasExtra(r0)
            if (r0 == 0) goto L_0x0901
            java.lang.String r0 = com.xiaomi.push.service.C4916bk.f9565A
            java.lang.String r12 = r12.getStringExtra(r0)
            r2.f9546f = r12
            goto L_0x0901
        L_0x0247:
            java.lang.String r0 = r12.getAction()
            java.lang.String r1 = "android.intent.action.SCREEN_ON"
            boolean r0 = r1.equals(r0)
            java.lang.String r5 = "android.intent.action.SCREEN_OFF"
            if (r0 != 0) goto L_0x0841
            java.lang.String r0 = r12.getAction()
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0261
            goto L_0x0841
        L_0x0261:
            java.lang.String r0 = r12.getAction()
            java.lang.String r1 = "com.xiaomi.mipush.REGISTER_APP"
            boolean r0 = r1.equals(r0)
            java.lang.String r1 = "com.xiaomi.xmsf"
            java.lang.String r5 = "mipush_payload"
            java.lang.String r6 = "mipush_app_package"
            if (r0 == 0) goto L_0x02de
            android.content.Context r0 = r11.getApplicationContext()
            com.xiaomi.push.service.bn r0 = com.xiaomi.push.service.C4921bn.m15441a(r0)
            boolean r0 = r0.mo30023a()
            if (r0 == 0) goto L_0x02a6
            android.content.Context r0 = r11.getApplicationContext()
            com.xiaomi.push.service.bn r0 = com.xiaomi.push.service.C4921bn.m15441a(r0)
            int r0 = r0.mo30023a()
            if (r0 != 0) goto L_0x02a6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "register without being provisioned. "
            r0.append(r1)
            java.lang.String r12 = r12.getStringExtra(r6)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            goto L_0x01e5
        L_0x02a6:
            byte[] r5 = r12.getByteArrayExtra(r5)
            java.lang.String r6 = r12.getStringExtra(r6)
            java.lang.String r0 = "mipush_env_chanage"
            boolean r0 = r12.getBooleanExtra(r0, r4)
            java.lang.String r2 = "mipush_env_type"
            int r3 = r12.getIntExtra(r2, r3)
            com.xiaomi.push.service.v r12 = com.xiaomi.push.service.C4987v.m15686a((android.content.Context) r11)
            r12.mo30088d(r6)
            if (r0 == 0) goto L_0x02d9
            java.lang.String r12 = r11.getPackageName()
            boolean r12 = r1.equals(r12)
            if (r12 != 0) goto L_0x02d9
            com.xiaomi.push.service.cu r12 = new com.xiaomi.push.service.cu
            r2 = 14
            r0 = r12
            r1 = r11
            r4 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x01b2
        L_0x02d9:
            r11.mo29938a((byte[]) r5, (java.lang.String) r6)
            goto L_0x0901
        L_0x02de:
            java.lang.String r0 = r12.getAction()
            java.lang.String r7 = "com.xiaomi.mipush.SEND_MESSAGE"
            boolean r0 = r7.equals(r0)
            java.lang.String r7 = "com.xiaomi.mipush.UNREGISTER_APP"
            if (r0 != 0) goto L_0x07f0
            java.lang.String r0 = r12.getAction()
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x02f8
            goto L_0x07f0
        L_0x02f8:
            java.lang.String r0 = com.xiaomi.push.service.C4922bo.f9610a
            java.lang.String r7 = r12.getAction()
            boolean r0 = r0.equals(r7)
            java.lang.String r7 = "pref_registered_pkg_names"
            if (r0 == 0) goto L_0x03e1
            java.lang.String r0 = "uninstall_pkg_name"
            java.lang.String r12 = r12.getStringExtra(r0)
            if (r12 == 0) goto L_0x03e0
            java.lang.String r0 = r12.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x031a
            goto L_0x03e0
        L_0x031a:
            android.content.pm.PackageManager r0 = r11.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0347 }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r12, r4)     // Catch:{ NameNotFoundException -> 0x0347 }
            if (r0 == 0) goto L_0x0345
            android.content.pm.ApplicationInfo r1 = r0.applicationInfo     // Catch:{ NameNotFoundException -> 0x0347 }
            if (r1 == 0) goto L_0x0345
            java.lang.String r0 = r0.packageName     // Catch:{ NameNotFoundException -> 0x0347 }
            boolean r0 = com.xiaomi.push.C4805j.m14866a((android.content.Context) r11, (java.lang.String) r0)     // Catch:{ NameNotFoundException -> 0x0347 }
            if (r0 == 0) goto L_0x0345
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x0347 }
            r0.<init>()     // Catch:{ NameNotFoundException -> 0x0347 }
            java.lang.String r1 = "dual space's app uninstalled "
            r0.append(r1)     // Catch:{ NameNotFoundException -> 0x0347 }
            r0.append(r12)     // Catch:{ NameNotFoundException -> 0x0347 }
            java.lang.String r0 = r0.toString()     // Catch:{ NameNotFoundException -> 0x0347 }
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r0)     // Catch:{ NameNotFoundException -> 0x0347 }
            goto L_0x0348
        L_0x0345:
            r3 = 0
            goto L_0x0348
        L_0x0347:
        L_0x0348:
            java.lang.String r0 = "com.xiaomi.channel"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0369
            com.xiaomi.push.service.bg r0 = com.xiaomi.push.service.C4906bg.mo30005a()
            java.lang.String r1 = "1"
            java.util.Collection r0 = r0.mo30007a((java.lang.String) r1)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0369
            if (r3 == 0) goto L_0x0369
            r11.m15066a((java.lang.String) r1, (int) r4)
            java.lang.String r12 = "close the miliao channel as the app is uninstalled."
            goto L_0x01e5
        L_0x0369:
            android.content.SharedPreferences r0 = r11.getSharedPreferences(r7, r4)
            java.lang.String r1 = r0.getString(r12, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0901
            if (r3 == 0) goto L_0x0901
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.remove(r12)
            r0.commit()
            boolean r0 = com.xiaomi.push.service.C4874al.m15245b((android.content.Context) r11, (java.lang.String) r12)
            if (r0 == 0) goto L_0x038c
            com.xiaomi.push.service.C4874al.m15256c(r11, r12)
        L_0x038c:
            com.xiaomi.push.service.C4874al.m15207a((android.content.Context) r11, (java.lang.String) r12)
            android.content.Context r0 = r11.getApplicationContext()
            com.xiaomi.push.service.C4885at.m15280a((android.content.Context) r0, (java.lang.String) r12)
            boolean r0 = r11.mo29942c()
            if (r0 == 0) goto L_0x0901
            if (r1 == 0) goto L_0x0901
            com.xiaomi.push.if r0 = com.xiaomi.push.service.C4870ah.m15192a((java.lang.String) r12, (java.lang.String) r1)     // Catch:{ gh -> 0x03c0 }
            com.xiaomi.push.service.C4870ah.m15198a((com.xiaomi.push.service.XMPushService) r11, (com.xiaomi.push.C4783if) r0)     // Catch:{ gh -> 0x03c0 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ gh -> 0x03c0 }
            r0.<init>()     // Catch:{ gh -> 0x03c0 }
            java.lang.String r1 = "uninstall "
            r0.append(r1)     // Catch:{ gh -> 0x03c0 }
            r0.append(r12)     // Catch:{ gh -> 0x03c0 }
            java.lang.String r12 = " msg sent"
            r0.append(r12)     // Catch:{ gh -> 0x03c0 }
            java.lang.String r12 = r0.toString()     // Catch:{ gh -> 0x03c0 }
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r12)     // Catch:{ gh -> 0x03c0 }
            goto L_0x0901
        L_0x03c0:
            r12 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fail to send Message: "
            r0.append(r1)
            java.lang.String r1 = r12.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12483d(r0)
            r0 = 10
            r11.mo29929a((int) r0, (java.lang.Exception) r12)
            goto L_0x0901
        L_0x03e0:
            return
        L_0x03e1:
            java.lang.String r0 = com.xiaomi.push.service.C4922bo.f9611b
            java.lang.String r8 = r12.getAction()
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0457
            java.lang.String r0 = "data_cleared_pkg_name"
            java.lang.String r12 = r12.getStringExtra(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L_0x03fa
            return
        L_0x03fa:
            android.content.SharedPreferences r0 = r11.getSharedPreferences(r7, r4)     // Catch:{ all -> 0x0408 }
            if (r0 == 0) goto L_0x041e
            java.lang.String r1 = r0.getString(r12, r2)     // Catch:{ all -> 0x0406 }
            r2 = r1
            goto L_0x041e
        L_0x0406:
            r1 = move-exception
            goto L_0x040a
        L_0x0408:
            r1 = move-exception
            r0 = r2
        L_0x040a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Fail to get sp or appId : "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r1)
        L_0x041e:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x0445
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.remove(r12)
            r0.commit()
            boolean r0 = com.xiaomi.push.service.C4874al.m15245b((android.content.Context) r11, (java.lang.String) r12)
            if (r0 == 0) goto L_0x0437
            com.xiaomi.push.service.C4874al.m15256c(r11, r12)
        L_0x0437:
            com.xiaomi.push.service.C4874al.m15207a((android.content.Context) r11, (java.lang.String) r12)
            com.xiaomi.push.if r0 = com.xiaomi.push.service.C4870ah.m15202b(r12, r2)
            byte[] r0 = com.xiaomi.push.C4797it.m14834a(r0)
            r11.mo29936a((java.lang.String) r12, (byte[]) r0, (boolean) r3)
        L_0x0445:
            com.xiaomi.push.service.C4885at.m15280a((android.content.Context) r11, (java.lang.String) r12)
            android.content.Context r0 = r11.getApplicationContext()
            boolean r0 = com.xiaomi.push.C4830m.m14998a((android.content.Context) r0)
            if (r0 == 0) goto L_0x0901
            com.xiaomi.push.service.C4867ag.m15181a((java.lang.String) r12)
            goto L_0x0901
        L_0x0457:
            java.lang.String r0 = r12.getAction()
            java.lang.String r7 = "com.xiaomi.mipush.CLEAR_NOTIFICATION"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0495
            java.lang.String r0 = com.xiaomi.push.service.C4916bk.f9566B
            java.lang.String r0 = r12.getStringExtra(r0)
            java.lang.String r1 = com.xiaomi.push.service.C4916bk.f9567C
            r2 = -2
            int r1 = r12.getIntExtra(r1, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0901
            r2 = -1
            if (r1 < r2) goto L_0x0484
            java.lang.String r3 = com.xiaomi.push.service.C4916bk.f9568D
            int r12 = r12.getIntExtra(r3, r2)
            com.xiaomi.push.service.C4874al.m15232a((android.content.Context) r11, (java.lang.String) r0, (int) r1, (int) r12)
            goto L_0x0901
        L_0x0484:
            java.lang.String r1 = com.xiaomi.push.service.C4916bk.f9572H
            java.lang.String r1 = r12.getStringExtra(r1)
            java.lang.String r2 = com.xiaomi.push.service.C4916bk.f9573I
            java.lang.String r12 = r12.getStringExtra(r2)
            com.xiaomi.push.service.C4874al.m15233a((android.content.Context) r11, (java.lang.String) r0, (java.lang.String) r1, (java.lang.String) r12)
            goto L_0x0901
        L_0x0495:
            java.lang.String r0 = r12.getAction()
            java.lang.String r7 = "com.xiaomi.mipush.CLEAR_HEADSUPNOTIFICATION"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x04b2
            java.lang.String r0 = com.xiaomi.push.service.C4916bk.f9566B
            java.lang.String r12 = r12.getStringExtra(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0901
            com.xiaomi.push.service.C4874al.m15245b((android.content.Context) r11, (java.lang.String) r12)
            goto L_0x0901
        L_0x04b2:
            java.lang.String r0 = r12.getAction()
            java.lang.String r7 = "com.xiaomi.mipush.SET_NOTIFICATION_TYPE"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0521
            java.lang.String r0 = com.xiaomi.push.service.C4916bk.f9566B
            java.lang.String r0 = r12.getStringExtra(r0)
            java.lang.String r1 = com.xiaomi.push.service.C4916bk.f9571G
            java.lang.String r1 = r12.getStringExtra(r1)
            java.lang.String r2 = com.xiaomi.push.service.C4916bk.f9569E
            boolean r2 = r12.hasExtra(r2)
            if (r2 == 0) goto L_0x04ee
            java.lang.String r2 = com.xiaomi.push.service.C4916bk.f9569E
            int r12 = r12.getIntExtra(r2, r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = com.xiaomi.push.C4560bo.m13040b(r2)
            r4 = r12
            r3 = 0
            goto L_0x04f2
        L_0x04ee:
            java.lang.String r2 = com.xiaomi.push.C4560bo.m13040b(r0)
        L_0x04f2:
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 != 0) goto L_0x050b
            boolean r12 = android.text.TextUtils.equals(r1, r2)
            if (r12 != 0) goto L_0x04ff
            goto L_0x050b
        L_0x04ff:
            if (r3 == 0) goto L_0x0506
            com.xiaomi.push.service.C4874al.m15256c(r11, r0)
            goto L_0x0901
        L_0x0506:
            com.xiaomi.push.service.C4874al.m15250b(r11, r0, r4)
            goto L_0x0901
        L_0x050b:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "invalid notification for "
            r12.append(r1)
            r12.append(r0)
            java.lang.String r12 = r12.toString()
        L_0x051c:
            com.xiaomi.channel.commonutils.logger.C4408b.m12483d(r12)
            goto L_0x0901
        L_0x0521:
            java.lang.String r0 = r12.getAction()
            java.lang.String r7 = "com.xiaomi.mipush.DISABLE_PUSH"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0555
            java.lang.String r12 = r12.getStringExtra(r6)
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x053e
            com.xiaomi.push.service.v r0 = com.xiaomi.push.service.C4987v.m15686a((android.content.Context) r11)
            r0.mo30086b((java.lang.String) r12)
        L_0x053e:
            java.lang.String r12 = r11.getPackageName()
            boolean r12 = r1.equals(r12)
            if (r12 != 0) goto L_0x0901
            r12 = 19
            r11.mo29929a((int) r12, (java.lang.Exception) r2)
            r11.m15085e()
            r11.stopSelf()
            goto L_0x0901
        L_0x0555:
            java.lang.String r0 = r12.getAction()
            java.lang.String r2 = "com.xiaomi.mipush.DISABLE_PUSH_MESSAGE"
            boolean r0 = r2.equals(r0)
            java.lang.String r7 = "android.net.conn.CONNECTIVITY_CHANGE"
            java.lang.String r8 = "com.xiaomi.mipush.ENABLE_PUSH_MESSAGE"
            if (r0 != 0) goto L_0x0779
            java.lang.String r0 = r12.getAction()
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0571
            goto L_0x0779
        L_0x0571:
            java.lang.String r0 = r12.getAction()
            java.lang.String r2 = "com.xiaomi.mipush.SEND_TINYDATA"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x059c
            java.lang.String r0 = r12.getStringExtra(r6)
            byte[] r12 = r12.getByteArrayExtra(r5)
            com.xiaomi.push.hn r1 = new com.xiaomi.push.hn
            r1.<init>()
            com.xiaomi.push.C4797it.m14833a(r1, (byte[]) r12)     // Catch:{ iz -> 0x0596 }
            com.xiaomi.push.hg r12 = com.xiaomi.push.C4757hg.m14171a(r11)     // Catch:{ iz -> 0x0596 }
            r12.mo29279a((com.xiaomi.push.C4764hn) r1, (java.lang.String) r0)     // Catch:{ iz -> 0x0596 }
            goto L_0x0901
        L_0x0596:
            r12 = move-exception
            com.xiaomi.channel.commonutils.logger.C4408b.m12478a((java.lang.Throwable) r12)
            goto L_0x0901
        L_0x059c:
            java.lang.String r0 = r12.getAction()
            java.lang.String r2 = "com.xiaomi.push.timer"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x05d7
            java.lang.String r12 = "[Alarm] Service called on timer"
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r12)
            boolean r12 = r11.m15094i()
            if (r12 == 0) goto L_0x05c2
            boolean r12 = com.xiaomi.push.C4673eu.m13753a()
            if (r12 == 0) goto L_0x05ce
            java.lang.String r12 = "enter falldown mode, stop alarm"
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r12)
            com.xiaomi.push.C4673eu.m13753a()
            goto L_0x05ce
        L_0x05c2:
            com.xiaomi.push.C4673eu.m13756a((boolean) r4)
            boolean r12 = r11.m15088f()
            if (r12 == 0) goto L_0x05ce
            r11.m15076b((boolean) r4)
        L_0x05ce:
            com.xiaomi.push.service.XMPushService$a r12 = r11.f9373a
            if (r12 == 0) goto L_0x0901
            r12.m15125a()
            goto L_0x0901
        L_0x05d7:
            java.lang.String r0 = r12.getAction()
            java.lang.String r2 = "com.xiaomi.push.check_alive"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x05f3
            java.lang.String r12 = "Service called on check alive."
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r12)
            boolean r12 = r11.m15088f()
            if (r12 == 0) goto L_0x0901
            r11.m15076b((boolean) r4)
            goto L_0x0901
        L_0x05f3:
            java.lang.String r0 = r12.getAction()
            java.lang.String r2 = "com.xiaomi.mipush.thirdparty"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0624
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "on thirdpart push :"
            r0.append(r1)
            java.lang.String r1 = "com.xiaomi.mipush.thirdparty_DESC"
            java.lang.String r1 = r12.getStringExtra(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r0)
            java.lang.String r0 = "com.xiaomi.mipush.thirdparty_LEVEL"
            int r12 = r12.getIntExtra(r0, r4)
            com.xiaomi.push.C4673eu.m13755a(r11, r12)
            goto L_0x0901
        L_0x0624:
            java.lang.String r0 = r12.getAction()
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0633
            r11.mo29943d()
            goto L_0x0901
        L_0x0633:
            java.lang.String r0 = r12.getAction()
            java.lang.String r2 = "miui.net.wifi.DIGEST_INFORMATION_CHANGED"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0644
            r11.m15060a((android.content.Intent) r12)
            goto L_0x0901
        L_0x0644:
            java.lang.String r0 = r12.getAction()
            java.lang.String r2 = "com.xiaomi.xmsf.USE_INTELLIGENT_HB"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0674
            android.os.Bundle r0 = r12.getExtras()
            if (r0 == 0) goto L_0x0901
            android.os.Bundle r12 = r12.getExtras()
            java.lang.String r0 = "effectivePeriod"
            int r12 = r12.getInt(r0, r4)
            if (r12 <= 0) goto L_0x0901
            r0 = 604800(0x93a80, float:8.47505E-40)
            if (r12 > r0) goto L_0x0901
            android.content.Context r0 = r11.getApplicationContext()
            com.xiaomi.push.service.o r0 = com.xiaomi.push.service.C4972o.m15587a((android.content.Context) r0)
            r0.mo30057a((int) r12)
            goto L_0x0901
        L_0x0674:
            java.lang.String r0 = r12.getAction()
            java.lang.String r2 = "action_cr_config"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x06fb
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
            java.lang.String r0 = com.xiaomi.push.C4565bt.m13062a((android.content.Context) r0)
            com.xiaomi.clientreport.data.Config$Builder r12 = r12.setAESKey(r0)
            com.xiaomi.clientreport.data.Config$Builder r12 = r12.setEventEncrypted(r3)
            com.xiaomi.clientreport.data.Config$Builder r12 = r12.setMaxFileLength(r9)
            android.content.Context r0 = r11.getApplicationContext()
            com.xiaomi.clientreport.data.Config r12 = r12.build(r0)
            java.lang.String r0 = r11.getPackageName()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0901
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0901
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0901
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0901
            android.content.Context r0 = r11.getApplicationContext()
            com.xiaomi.push.C4665en.m13684a((android.content.Context) r0, (com.xiaomi.clientreport.data.Config) r12)
            goto L_0x0901
        L_0x06fb:
            java.lang.String r0 = r12.getAction()
            java.lang.String r2 = "action_help_ping"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0753
            java.lang.String r0 = "extra_help_ping_switch"
            boolean r0 = r12.getBooleanExtra(r0, r4)
            java.lang.String r2 = "extra_help_ping_frequency"
            int r2 = r12.getIntExtra(r2, r4)
            r3 = 30
            if (r2 < 0) goto L_0x0720
            if (r2 >= r3) goto L_0x0720
            java.lang.String r2 = "aw_ping: frquency need > 30s."
            com.xiaomi.channel.commonutils.logger.C4408b.m12482c(r2)
            r2 = 30
        L_0x0720:
            if (r2 >= 0) goto L_0x0723
            goto L_0x0724
        L_0x0723:
            r4 = r0
        L_0x0724:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "aw_ping: receive a aw_ping message. switch: "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = " frequency: "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r0)
            if (r4 == 0) goto L_0x0901
            if (r2 <= 0) goto L_0x0901
            java.lang.String r0 = r11.getPackageName()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0901
            r11.m15061a((android.content.Intent) r12, (int) r2)
            goto L_0x0901
        L_0x0753:
            java.lang.String r0 = r12.getAction()
            java.lang.String r1 = "action_aw_app_logic"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0764
            r11.m15086e(r12)
            goto L_0x0901
        L_0x0764:
            java.lang.String r0 = com.xiaomi.push.service.C4916bk.f9592n
            java.lang.String r1 = r12.getAction()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0901
            android.content.Context r0 = r11.getApplicationContext()
            com.xiaomi.push.service.C4971n.m15582a((android.content.Context) r0, (android.content.Intent) r12)
            goto L_0x0901
        L_0x0779:
            java.lang.String r3 = r12.getStringExtra(r6)
            byte[] r6 = r12.getByteArrayExtra(r5)
            java.lang.String r0 = "mipush_app_id"
            java.lang.String r4 = r12.getStringExtra(r0)
            java.lang.String r0 = "mipush_app_token"
            java.lang.String r5 = r12.getStringExtra(r0)
            java.lang.String r0 = r12.getAction()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x079e
            com.xiaomi.push.service.v r0 = com.xiaomi.push.service.C4987v.m15686a((android.content.Context) r11)
            r0.mo30087c((java.lang.String) r3)
        L_0x079e:
            java.lang.String r0 = r12.getAction()
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x07b6
            com.xiaomi.push.service.v r0 = com.xiaomi.push.service.C4987v.m15686a((android.content.Context) r11)
            r0.mo30089e(r3)
            com.xiaomi.push.service.v r0 = com.xiaomi.push.service.C4987v.m15686a((android.content.Context) r11)
            r0.mo30090f(r3)
        L_0x07b6:
            if (r6 != 0) goto L_0x07c2
            r12 = 70000003(0x42c1d83, float:2.0232054E-36)
            java.lang.String r0 = "null payload"
            com.xiaomi.push.service.C4989x.m15699a(r11, r3, r6, r12, r0)
            goto L_0x0901
        L_0x07c2:
            com.xiaomi.push.service.C4989x.m15703b(r3, r6)
            com.xiaomi.push.service.w r0 = new com.xiaomi.push.service.w
            r1 = r0
            r2 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r11.mo29931a((com.xiaomi.push.service.XMPushService.C4849j) r0)
            java.lang.String r12 = r12.getAction()
            boolean r12 = r8.equals(r12)
            if (r12 == 0) goto L_0x0901
            com.xiaomi.push.service.XMPushService$f r12 = r11.f9374a
            if (r12 != 0) goto L_0x0901
            com.xiaomi.push.service.XMPushService$f r12 = new com.xiaomi.push.service.XMPushService$f
            r12.<init>()
            r11.f9374a = r12
            android.content.IntentFilter r12 = new android.content.IntentFilter
            r12.<init>(r7)
            com.xiaomi.push.service.XMPushService$f r0 = r11.f9374a
            r11.registerReceiver(r0, r12)
            goto L_0x0901
        L_0x07f0:
            java.lang.String r0 = r12.getStringExtra(r6)
            byte[] r1 = r12.getByteArrayExtra(r5)
            java.lang.String r2 = "com.xiaomi.mipush.MESSAGE_CACHE"
            boolean r2 = r12.getBooleanExtra(r2, r3)
            boolean r3 = com.xiaomi.push.service.C4970m.m15580a(r1, r0)
            if (r3 == 0) goto L_0x081e
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "duplicate msg from: "
            r12.append(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r12.append(r0)
            java.lang.String r12 = r12.toString()
        L_0x0819:
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r12)
            goto L_0x0901
        L_0x081e:
            java.lang.String r12 = r12.getAction()
            boolean r12 = r7.equals(r12)
            if (r12 == 0) goto L_0x083c
            com.xiaomi.push.service.v r12 = com.xiaomi.push.service.C4987v.m15686a((android.content.Context) r11)
            r12.mo30085a((java.lang.String) r0)
            android.content.Context r12 = r11.getApplicationContext()
            boolean r12 = com.xiaomi.push.C4830m.m14998a((android.content.Context) r12)
            if (r12 == 0) goto L_0x083c
            com.xiaomi.push.service.C4867ag.m15181a((java.lang.String) r0)
        L_0x083c:
            r11.mo29936a((java.lang.String) r0, (byte[]) r1, (boolean) r2)
            goto L_0x0901
        L_0x0841:
            java.lang.String r0 = r12.getAction()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x086a
            boolean r12 = r11.m15094i()
            if (r12 != 0) goto L_0x0901
            java.lang.String r12 = "exit falldown mode, activate alarm."
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r12)
            r11.m15085e()
            boolean r12 = r11.mo29942c()
            if (r12 != 0) goto L_0x0901
            boolean r12 = r11.mo29943d()
            if (r12 != 0) goto L_0x0901
        L_0x0865:
            r11.mo29937a((boolean) r3)
            goto L_0x0901
        L_0x086a:
            java.lang.String r12 = r12.getAction()
            boolean r12 = r5.equals(r12)
            if (r12 == 0) goto L_0x0901
            boolean r12 = r11.m15094i()
            if (r12 == 0) goto L_0x0901
            boolean r12 = com.xiaomi.push.C4673eu.m13753a()
            if (r12 == 0) goto L_0x0901
            java.lang.String r12 = "enter falldown mode, stop alarm."
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r12)
            com.xiaomi.push.C4673eu.m13753a()
            goto L_0x0901
        L_0x088a:
            java.lang.String r0 = com.xiaomi.push.service.C4916bk.f9598t
            java.lang.String r0 = r12.getStringExtra(r0)
            java.lang.String r1 = com.xiaomi.push.service.C4916bk.f9602x
            java.lang.String r1 = r12.getStringExtra(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x08a0
            java.lang.String r12 = "security is empty. ignore."
            goto L_0x0819
        L_0x08a0:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x08fd
            boolean r1 = r11.m15055a((java.lang.String) r0, (android.content.Intent) r12)
            com.xiaomi.push.service.bg$b r7 = r11.m15055a((java.lang.String) r0, (android.content.Intent) r12)
            boolean r12 = com.xiaomi.push.C4551bj.m13001c(r11)
            if (r12 != 0) goto L_0x08be
            com.xiaomi.push.service.j r5 = r11.f9380a
            r8 = 0
            r9 = 2
        L_0x08b8:
            r10 = 0
            r6 = r11
            r5.mo30051a(r6, r7, r8, r9, r10)
            goto L_0x0901
        L_0x08be:
            boolean r12 = r11.mo29942c()
            if (r12 == 0) goto L_0x0865
            com.xiaomi.push.service.bg$c r12 = r7.f9535a
            com.xiaomi.push.service.bg$c r0 = com.xiaomi.push.service.C4906bg.C4912c.unbind
            if (r12 != r0) goto L_0x08d1
            com.xiaomi.push.service.XMPushService$b r12 = new com.xiaomi.push.service.XMPushService$b
            r12.<init>(r7)
            goto L_0x01b2
        L_0x08d1:
            if (r1 == 0) goto L_0x08da
            com.xiaomi.push.service.XMPushService$p r12 = new com.xiaomi.push.service.XMPushService$p
            r12.<init>(r7)
            goto L_0x01b2
        L_0x08da:
            com.xiaomi.push.service.bg$c r0 = com.xiaomi.push.service.C4906bg.C4912c.binding
            if (r12 != r0) goto L_0x08f4
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.String r0 = r7.f9547g
            r12[r4] = r0
            java.lang.String r0 = r7.f9541b
            java.lang.String r0 = com.xiaomi.push.service.C4906bg.C4908b.m15409a((java.lang.String) r0)
            r12[r3] = r0
            java.lang.String r0 = "the client is binding. %1$s %2$s."
            java.lang.String r12 = java.lang.String.format(r0, r12)
            goto L_0x0819
        L_0x08f4:
            com.xiaomi.push.service.bg$c r0 = com.xiaomi.push.service.C4906bg.C4912c.binded
            if (r12 != r0) goto L_0x0901
            com.xiaomi.push.service.j r5 = r11.f9380a
            r8 = 1
            r9 = 0
            goto L_0x08b8
        L_0x08fd:
            java.lang.String r12 = "channel id is empty, do nothing!"
            goto L_0x051c
        L_0x0901:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.XMPushService.m15084d(android.content.Intent):void");
    }

    /* renamed from: e */
    private void m15085e() {
        if (!mo29927a()) {
            C4673eu.m13753a();
        } else if (!C4673eu.m13753a()) {
            C4673eu.m13756a(true);
        }
    }

    /* renamed from: e */
    private void m15086e(Intent intent) {
        int i;
        try {
            C4655ed.m13639a(getApplicationContext()).mo29043a((C4659eh) new C4920bm());
            String stringExtra = intent.getStringExtra("mipush_app_package");
            byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
            if (byteArrayExtra != null) {
                C4786ii iiVar = new C4786ii();
                C4797it.m14833a(iiVar, byteArrayExtra);
                String b = iiVar.mo29600b();
                Map a = iiVar.mo29592a();
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
                            C4655ed.m13639a(getApplicationContext()).mo29041a(this, str, i, stringExtra, b);
                        }
                    }
                }
            }
        } catch (C4804iz e) {
            C4408b.m12483d("aw_logic: translate fail. " + e.getMessage());
        }
    }

    /* renamed from: e */
    public static boolean m15087e() {
        return f9364b;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m15088f() {
        String str;
        C4711fw fwVar = this.f9370a;
        if (fwVar == null || !fwVar.mo29188b()) {
            C4711fw fwVar2 = this.f9370a;
            if (fwVar2 == null || !fwVar2.mo29193c()) {
                this.f9371a.mo29200b(C4551bj.m12985a((Context) this));
                m15090g();
                if (this.f9370a == null) {
                    C4906bg.mo30005a().mo30008a((Context) this);
                    m15082c(false);
                    return;
                }
                return;
            }
            str = "try to connect while is connected.";
        } else {
            str = "try to connect while connecting.";
        }
        C4408b.m12483d(str);
    }

    /* renamed from: f */
    private boolean m15089f() {
        if (SystemClock.elapsedRealtime() - this.f9366a < 30000) {
            return false;
        }
        return C4551bj.m13002d(this);
    }

    /* renamed from: g */
    private void m15090g() {
        try {
            this.f9369a.mo29185a(this.f9372a, (C4726gj) new C4948cl(this));
            this.f9369a.mo29206e();
            this.f9370a = this.f9369a;
        } catch (C4724gh e) {
            C4408b.m12477a("fail to create Slim connection", (Throwable) e);
            this.f9369a.mo29189b(3, e);
        }
    }

    /* renamed from: g */
    private boolean m15091g() {
        return "com.xiaomi.xmsf".equals(getPackageName()) && Settings.System.getInt(getContentResolver(), "power_supersave_mode_open", 0) == 1;
    }

    /* renamed from: h */
    private void m15092h() {
    }

    /* renamed from: h */
    private boolean m15093h() {
        return "com.xiaomi.xmsf".equals(getPackageName()) || !C4987v.m15686a((Context) this).mo30086b(getPackageName());
    }

    /* renamed from: i */
    private void m15094i() {
        synchronized (this.f9384a) {
            this.f9384a.clear();
        }
    }

    /* renamed from: i */
    private boolean m15095i() {
        return getApplicationContext().getPackageName().equals("com.xiaomi.xmsf") && m15096j() && !C4805j.m14870b((Context) this) && !C4805j.m14863a(getApplicationContext());
    }

    /* renamed from: j */
    private boolean m15096j() {
        int intValue = Integer.valueOf(String.format("%tH", new Object[]{new Date()})).intValue();
        int i = this.f9365a;
        int i2 = this.f9387b;
        if (i <= i2) {
            return i < i2 && intValue >= i && intValue < i2;
        }
        if (intValue >= i || intValue < i2) {
            return true;
        }
    }

    /* renamed from: k */
    private boolean m15097k() {
        if (TextUtils.equals(getPackageName(), "com.xiaomi.xmsf")) {
            return false;
        }
        return C4898ba.m15362a((Context) this).mo29996a(C4765ho.ForegroundServiceSwitch.mo29322a(), false);
    }

    /* renamed from: a */
    public C4711fw m15098a() {
        return this.f9370a;
    }

    /* renamed from: a */
    public C4967j m15099a() {
        return new C4967j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void m15100a() {
        if (SystemClock.elapsedRealtime() - this.f9366a >= ((long) C4719gc.m13990a()) && C4551bj.m13002d(this)) {
            m15076b(true);
        }
    }

    /* renamed from: a */
    public void mo29928a(int i) {
        this.f9381a.mo30064a(i);
    }

    /* renamed from: a */
    public void mo29929a(int i, Exception exc) {
        StringBuilder sb = new StringBuilder();
        sb.append("disconnect ");
        sb.append(hashCode());
        sb.append(", ");
        C4711fw fwVar = this.f9370a;
        sb.append(fwVar == null ? null : Integer.valueOf(fwVar.hashCode()));
        C4408b.m12464a(sb.toString());
        C4711fw fwVar2 = this.f9370a;
        if (fwVar2 != null) {
            fwVar2.mo29189b(i, exc);
            this.f9370a = null;
        }
        mo29928a(7);
        mo29928a(4);
        C4906bg.mo30005a().mo30009a((Context) this, i);
    }

    /* renamed from: a */
    public void mo29930a(C4695fl flVar) {
        C4711fw fwVar = this.f9370a;
        if (fwVar != null) {
            fwVar.mo29178b(flVar);
            return;
        }
        throw new C4724gh("try send msg while connection is null.");
    }

    /* renamed from: a */
    public void mo29135a(C4711fw fwVar) {
        C4408b.m12482c("begin to connect...");
        C4689fh.mo29139a().mo29135a(fwVar);
    }

    /* renamed from: a */
    public void mo29136a(C4711fw fwVar, int i, Exception exc) {
        C4689fh.mo29139a().mo29136a(fwVar, i, exc);
        if (!m15094i()) {
            mo29937a(false);
        }
    }

    /* renamed from: a */
    public void mo29137a(C4711fw fwVar, Exception exc) {
        C4689fh.mo29139a().mo29137a(fwVar, exc);
        m15082c(false);
        if (!m15094i()) {
            mo29937a(false);
        }
    }

    /* renamed from: a */
    public void mo29931a(C4849j jVar) {
        mo29932a(jVar, 0);
    }

    /* renamed from: a */
    public void mo29932a(C4849j jVar, long j) {
        try {
            this.f9381a.mo30067a((C4974p.C4976b) jVar, j);
        } catch (IllegalStateException e) {
            C4408b.m12464a("can't execute job err = " + e.getMessage());
        }
    }

    /* renamed from: a */
    public void mo29933a(C4853n nVar) {
        synchronized (this.f9384a) {
            this.f9384a.add(nVar);
        }
    }

    /* renamed from: a */
    public void mo29934a(C4906bg.C4908b bVar) {
        if (bVar != null) {
            long a = bVar.mo30014a();
            C4408b.m12464a("schedule rebind job in " + (a / 1000));
            mo29932a((C4849j) new C4841b(bVar), a);
        }
    }

    /* renamed from: a */
    public void mo29935a(String str, String str2, int i, String str3, String str4) {
        C4906bg.C4908b a = C4906bg.mo30005a().mo30006a(str, str2);
        if (a != null) {
            mo29931a((C4849j) new C4858s(a, i, str4, str3));
        }
        C4906bg.mo30005a().mo30006a(str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo29936a(String str, byte[] bArr, boolean z) {
        Collection a = C4906bg.mo30005a().mo30007a("5");
        if (a.isEmpty()) {
            if (!z) {
                return;
            }
        } else if (((C4906bg.C4908b) a.iterator().next()).f9535a == C4906bg.C4912c.binded) {
            mo29931a((C4849j) new C4946cj(this, 4, str, bArr));
            return;
        } else if (!z) {
            return;
        }
        C4989x.m15703b(str, bArr);
    }

    /* renamed from: a */
    public void mo29937a(boolean z) {
        this.f9379a.mo30026a(z);
    }

    /* renamed from: a */
    public void mo29938a(byte[] bArr, String str) {
        if (bArr == null) {
            C4989x.m15699a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, "null payload");
            C4408b.m12464a("register request without payload");
            return;
        }
        C4783if ifVar = new C4783if();
        try {
            C4797it.m14833a(ifVar, bArr);
            if (ifVar.f8947a == C4760hj.Registration) {
                C4787ij ijVar = new C4787ij();
                try {
                    C4797it.m14833a(ijVar, ifVar.mo29558a());
                    mo29931a((C4849j) new C4988w(this, ifVar.mo29567b(), ijVar.mo29633b(), ijVar.mo29637c(), bArr));
                    C4667eo.m13689a(getApplicationContext()).mo29053a(ifVar.mo29567b(), "E100003", ijVar.mo29629a(), 6002, (String) null);
                } catch (C4804iz e) {
                    C4408b.m12483d("app register error. " + e);
                    C4989x.m15699a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, " data action error.");
                }
            } else {
                C4989x.m15699a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, " registration action required.");
                C4408b.m12464a("register request with invalid payload");
            }
        } catch (C4804iz e2) {
            C4408b.m12483d("app register fail. " + e2);
            C4989x.m15699a(this, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, " data container error.");
        }
    }

    /* renamed from: a */
    public void mo29939a(C4695fl[] flVarArr) {
        C4711fw fwVar = this.f9370a;
        if (fwVar != null) {
            fwVar.mo29177a(flVarArr);
            return;
        }
        throw new C4724gh("try send msg while connection is null.");
    }

    /* renamed from: a */
    public boolean m15116a() {
        boolean b = C4551bj.m13000b(this);
        boolean z = C4906bg.mo30005a().mo30005a() > 0;
        boolean z2 = !mo29940b();
        boolean h = m15092h();
        boolean z3 = !m15090g();
        boolean z4 = b && z && z2 && h && z3;
        if (!z4) {
            C4408b.m12484e(String.format("not conn, net=%s;cnt=%s;!dis=%s;enb=%s;!spm=%s;", new Object[]{Boolean.valueOf(b), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(h), Boolean.valueOf(z3)}));
        }
        return z4;
    }

    /* renamed from: a */
    public boolean m15117a(int i) {
        return this.f9381a.mo30064a(i);
    }

    /* renamed from: b */
    public C4967j m15118b() {
        return this.f9380a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void m15119b() {
        C4972o.m15587a(getApplicationContext()).mo30062d();
        Iterator it = new ArrayList(this.f9384a).iterator();
        while (it.hasNext()) {
            ((C4853n) it.next()).mo29275a();
        }
    }

    /* renamed from: b */
    public void mo29138b(C4711fw fwVar) {
        C4689fh.mo29139a().mo29138b(fwVar);
        m15082c(true);
        this.f9379a.mo30025a();
        if (!C4673eu.m13753a() && !m15094i()) {
            C4408b.m12464a("reconnection successful, reactivate alarm.");
            C4673eu.m13756a(true);
        }
        Iterator it = C4906bg.mo30005a().mo30005a().iterator();
        while (it.hasNext()) {
            mo29931a((C4849j) new C4841b((C4906bg.C4908b) it.next()));
        }
        if (!this.f9386a && C4830m.m14998a(getApplicationContext())) {
            C4516al.m12857a(getApplicationContext()).mo28733a((Runnable) new C4949cm(this));
        }
    }

    /* renamed from: b */
    public void mo29941b(C4849j jVar) {
        this.f9381a.mo30065a(jVar.f9714a, (C4974p.C4976b) jVar);
    }

    /* renamed from: b */
    public boolean m15122b() {
        try {
            Class<?> a = C4994v.m15735a(this, "miui.os.Build");
            return a.getField("IS_CM_CUSTOMIZATION_TEST").getBoolean((Object) null) || a.getField("IS_CU_CUSTOMIZATION_TEST").getBoolean((Object) null) || a.getField("IS_CT_CUSTOMIZATION_TEST").getBoolean((Object) null);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: c */
    public boolean m15123c() {
        C4711fw fwVar = this.f9370a;
        return fwVar != null && fwVar.mo29193c();
    }

    /* renamed from: d */
    public boolean m15124d() {
        C4711fw fwVar = this.f9370a;
        return fwVar != null && fwVar.mo29188b();
    }

    public IBinder onBind(Intent intent) {
        return this.f9368a.getBinder();
    }

    public void onCreate() {
        String[] split;
        super.onCreate();
        C4408b.m12472a(getApplicationContext());
        C4994v.m15737a((Context) this);
        C4984t a = C4985u.m15674a((Context) this);
        if (a != null) {
            C4509ae.m12844a(a.f9740a);
        }
        if (C4830m.m14998a(getApplicationContext())) {
            HandlerThread handlerThread = new HandlerThread("hb-alarm");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            this.f9373a = new C4840a(this, (C4945ci) null);
            registerReceiver(this.f9373a, new IntentFilter(C4916bk.f9594p), (String) null, handler);
            f9364b = true;
            handler.post(new C4950cn(this));
        }
        this.f9368a = new Messenger(new C4951co(this));
        C4917bl.m15432a(this);
        C4952cp cpVar = new C4952cp(this, (Map) null, 5222, "xiaomi.com", (C4717ga) null);
        this.f9371a = cpVar;
        cpVar.mo29198a(true);
        this.f9369a = new C4706fs(this, this.f9371a);
        this.f9380a = mo29927a();
        C4673eu.m13754a((Context) this);
        this.f9369a.mo29184a((C4715fz) this);
        this.f9378a = new C4903be(this);
        this.f9379a = new C4924bq(this);
        new C4968k().mo30054a();
        C4689fh.mo29139a().mo29142a(this);
        this.f9381a = new C4974p("Connection Controller Thread");
        C4906bg a2 = C4906bg.mo30005a();
        a2.mo30012b();
        a2.mo30010a((C4906bg.C4907a) new C4953cq(this));
        if (m15097k()) {
            m15092h();
        }
        C4757hg.m14171a(this).mo29278a((C4758hh) new C4981r(this), "UPLOADER_PUSH_CHANNEL");
        mo29933a((C4853n) new C4753hd(this));
        mo29933a((C4853n) new C4943cg(this));
        if (C4830m.m14998a((Context) this)) {
            mo29933a((C4853n) new C4904bf());
        }
        mo29931a((C4849j) new C4847h());
        this.f9385a.add(C4932bx.m15485a((Context) this));
        if (m15092h()) {
            this.f9374a = new C4845f();
            registerReceiver(this.f9374a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        if (C4830m.m14998a(getApplicationContext())) {
            this.f9377a = new C4859t();
            registerReceiver(this.f9377a, new IntentFilter("miui.net.wifi.DIGEST_INFORMATION_CHANGED"), "miui.net.wifi.permission.ACCESS_WIFI_DIGEST_INFO", (Handler) null);
            C4850k kVar = new C4850k();
            this.f9375a = kVar;
            registerReceiver(kVar, new IntentFilter("com.xiaomi.xmsf.USE_INTELLIGENT_HB"), "com.xiaomi.xmsf.permission.INTELLIGENT_HB", (Handler) null);
        }
        C4972o.m15587a(getApplicationContext()).mo30056a();
        if ("com.xiaomi.xmsf".equals(getPackageName())) {
            Uri uriFor = Settings.System.getUriFor("power_supersave_mode_open");
            if (uriFor != null) {
                this.f9367a = new C4954cr(this, new Handler(Looper.getMainLooper()));
                try {
                    getContentResolver().registerContentObserver(uriFor, false, this.f9367a);
                } catch (Throwable th) {
                    C4408b.m12483d("register super-power-mode observer err:" + th.getMessage());
                }
            }
            int[] a3 = mo29927a();
            if (a3 != null) {
                this.f9376a = new C4857r();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                registerReceiver(this.f9376a, intentFilter);
                this.f9365a = a3[0];
                this.f9387b = a3[1];
                C4408b.m12464a("falldown initialized: " + this.f9365a + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f9387b);
            }
        }
        String str = "";
        if (a != null) {
            try {
                if (!TextUtils.isEmpty(a.f9741a) && (split = a.f9741a.split("@")) != null && split.length > 0) {
                    str = split[0];
                }
            } catch (Exception unused) {
            }
        }
        C4612dd.m13289a(this);
        C4408b.m12484e("XMPushService created. pid=" + Process.myPid() + ", uid=" + Process.myUid() + ", vc=" + C4747h.m14123a(getApplicationContext(), getPackageName()) + ", uuid=" + str);
    }

    public void onDestroy() {
        C4845f fVar = this.f9374a;
        if (fVar != null) {
            m15059a((BroadcastReceiver) fVar);
            this.f9374a = null;
        }
        C4859t tVar = this.f9377a;
        if (tVar != null) {
            m15059a((BroadcastReceiver) tVar);
            this.f9377a = null;
        }
        C4850k kVar = this.f9375a;
        if (kVar != null) {
            m15059a((BroadcastReceiver) kVar);
            this.f9375a = null;
        }
        C4857r rVar = this.f9376a;
        if (rVar != null) {
            m15059a((BroadcastReceiver) rVar);
            this.f9376a = null;
        }
        C4840a aVar = this.f9373a;
        if (aVar != null) {
            m15059a((BroadcastReceiver) aVar);
            this.f9373a = null;
        }
        if ("com.xiaomi.xmsf".equals(getPackageName()) && this.f9367a != null) {
            try {
                getContentResolver().unregisterContentObserver(this.f9367a);
            } catch (Throwable th) {
                C4408b.m12483d("unregister super-power-mode err:" + th.getMessage());
            }
        }
        this.f9385a.clear();
        this.f9381a.mo30068b();
        mo29931a((C4849j) new C4947ck(this, 2));
        mo29931a((C4849j) new C4851l());
        C4906bg.mo30005a().mo30012b();
        C4906bg.mo30005a().mo30009a((Context) this, 15);
        C4906bg.mo30005a().mo30005a();
        this.f9369a.mo29190b((C4715fz) this);
        C4929bv.mo30029a().mo30029a();
        C4673eu.m13753a();
        m15094i();
        super.onDestroy();
        C4408b.m12464a("Service destroyed");
    }

    public void onStart(Intent intent, int i) {
        C4848i iVar;
        long currentTimeMillis = System.currentTimeMillis();
        if (intent == null) {
            C4408b.m12483d("onStart() with intent NULL");
        } else {
            C4408b.m12464a(String.format("onStart() with intent.Action = %s, chid = %s, pkg = %s|%s", new Object[]{intent.getAction(), intent.getStringExtra(C4916bk.f9598t), intent.getStringExtra(C4916bk.f9566B), intent.getStringExtra("mipush_app_package")}));
        }
        if (!(intent == null || intent.getAction() == null)) {
            if ("com.xiaomi.push.timer".equalsIgnoreCase(intent.getAction()) || "com.xiaomi.push.check_alive".equalsIgnoreCase(intent.getAction())) {
                if (this.f9381a.mo30063a()) {
                    C4408b.m12483d("ERROR, the job controller is blocked.");
                    C4906bg.mo30005a().mo30009a((Context) this, 14);
                    stopSelf();
                } else {
                    iVar = new C4848i(intent);
                }
            } else if (!"com.xiaomi.push.network_status_changed".equalsIgnoreCase(intent.getAction())) {
                if ("10".equals(intent.getStringExtra("ext_chid"))) {
                    intent.putExtra("rx_msg", System.currentTimeMillis());
                    intent.putExtra("screen_on", C4995w.m15746a(getApplicationContext()));
                    intent.putExtra("wifi", C4551bj.m13003e(getApplicationContext()));
                }
                iVar = new C4848i(intent);
            }
            mo29931a((C4849j) iVar);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 > 50) {
            C4408b.m12482c("[Prefs] spend " + currentTimeMillis2 + " ms, too more times.");
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        onStart(intent, i2);
        return 1;
    }
}

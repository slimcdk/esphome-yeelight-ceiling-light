package com.xiaomi.push.service;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.core.p007os.EnvironmentCompat;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.xiaomi.push.service.bg */
public class C4906bg {

    /* renamed from: a */
    private static C4906bg f9525a;

    /* renamed from: a */
    private List<C4907a> f9526a = new ArrayList();

    /* renamed from: a */
    private ConcurrentHashMap<String, HashMap<String, C4908b>> f9527a = new ConcurrentHashMap<>();

    /* renamed from: com.xiaomi.push.service.bg$a */
    public interface C4907a {
        /* renamed from: a */
        void mo30013a();
    }

    /* renamed from: com.xiaomi.push.service.bg$b */
    public static class C4908b {

        /* renamed from: a */
        private int f9528a = 0;

        /* renamed from: a */
        public Context f9529a;

        /* renamed from: a */
        IBinder.DeathRecipient f9530a = null;

        /* renamed from: a */
        Messenger f9531a;

        /* renamed from: a */
        private XMPushService.C4842c f9532a = new XMPushService.C4842c(this);

        /* renamed from: a */
        private XMPushService f9533a;

        /* renamed from: a */
        final C4910b f9534a = new C4910b();

        /* renamed from: a */
        C4912c f9535a = C4912c.unbind;

        /* renamed from: a */
        public C4967j f9536a;

        /* renamed from: a */
        public String f9537a;

        /* renamed from: a */
        private List<C4909a> f9538a = new ArrayList();

        /* renamed from: a */
        public boolean f9539a;

        /* renamed from: b */
        C4912c f9540b = null;

        /* renamed from: b */
        public String f9541b;

        /* renamed from: b */
        private boolean f9542b = false;

        /* renamed from: c */
        public String f9543c;

        /* renamed from: d */
        public String f9544d;

        /* renamed from: e */
        public String f9545e;

        /* renamed from: f */
        public String f9546f;

        /* renamed from: g */
        public String f9547g;

        /* renamed from: h */
        public String f9548h;

        /* renamed from: i */
        public String f9549i;

        /* renamed from: com.xiaomi.push.service.bg$b$a */
        public interface C4909a {
            /* renamed from: a */
            void mo29132a(C4912c cVar, C4912c cVar2, int i);
        }

        /* renamed from: com.xiaomi.push.service.bg$b$b */
        class C4910b extends XMPushService.C4849j {

            /* renamed from: a */
            String f9551a;

            /* renamed from: b */
            int f9552b;

            /* renamed from: b */
            String f9553b;

            /* renamed from: c */
            int f9554c;

            public C4910b() {
                super(0);
            }

            /* renamed from: a */
            public XMPushService.C4849j mo30020a(int i, int i2, String str, String str2) {
                this.f9552b = i;
                this.f9554c = i2;
                this.f9553b = str2;
                this.f9551a = str;
                return this;
            }

            /* renamed from: a */
            public String mo29133a() {
                return "notify job";
            }

            /* renamed from: a */
            public void m15425a() {
                if (C4908b.this.m15412a(this.f9552b, this.f9554c, this.f9553b)) {
                    C4908b.this.m15410a(this.f9552b, this.f9554c, this.f9551a, this.f9553b);
                    return;
                }
                C4408b.m12481b(" ignore notify client :" + C4908b.this.f9547g);
            }
        }

        /* renamed from: com.xiaomi.push.service.bg$b$c */
        class C4911c implements IBinder.DeathRecipient {

            /* renamed from: a */
            final Messenger f9555a;

            /* renamed from: a */
            final C4908b f9556a;

            C4911c(C4908b bVar, Messenger messenger) {
                this.f9556a = bVar;
                this.f9555a = messenger;
            }

            public void binderDied() {
                C4408b.m12481b("peer died, chid = " + this.f9556a.f9547g);
                C4908b.m15407a(C4908b.this).mo29932a((XMPushService.C4849j) new C4914bi(this, 0), 0);
                if ("9".equals(this.f9556a.f9547g) && "com.xiaomi.xmsf".equals(C4908b.m15407a(C4908b.this).getPackageName())) {
                    C4908b.m15407a(C4908b.this).mo29932a((XMPushService.C4849j) new C4915bj(this, 0), 60000);
                }
            }
        }

        public C4908b() {
        }

        public C4908b(XMPushService xMPushService) {
            this.f9533a = xMPushService;
            mo30017a((C4909a) new C4913bh(this));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
            r0 = r3.lastIndexOf(com.miot.service.common.miotcloud.impl.MiotCloudImpl.COOKIE_PATH);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.String m15409a(java.lang.String r3) {
            /*
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                java.lang.String r1 = ""
                if (r0 == 0) goto L_0x0009
                return r1
            L_0x0009:
                java.lang.String r0 = "/"
                int r0 = r3.lastIndexOf(r0)
                r2 = -1
                if (r0 == r2) goto L_0x0018
                int r0 = r0 + 1
                java.lang.String r1 = r3.substring(r0)
            L_0x0018:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4906bg.C4908b.m15409a(java.lang.String):java.lang.String");
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m15410a(int i, int i2, String str, String str2) {
            C4912c cVar = this.f9535a;
            this.f9540b = cVar;
            if (i == 2) {
                this.f9536a.mo30049a(this.f9529a, this, i2);
            } else if (i == 3) {
                this.f9536a.mo30050a(this.f9529a, this, str2, str);
            } else if (i == 1) {
                boolean z = cVar == C4912c.binded;
                if (!z && "wait".equals(str2)) {
                    this.f9528a++;
                } else if (z) {
                    this.f9528a = 0;
                    if (this.f9531a != null) {
                        try {
                            this.f9531a.send(Message.obtain((Handler) null, 16, this.f9533a.f9368a));
                        } catch (RemoteException unused) {
                        }
                    }
                }
                this.f9536a.mo30051a(this.f9533a, this, z, i2, str);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean m15412a(int i, int i2, String str) {
            boolean z;
            StringBuilder sb;
            String str2;
            C4912c cVar = this.f9540b;
            if (cVar == null || !(z = this.f9542b)) {
                return true;
            }
            if (cVar == this.f9535a) {
                sb = new StringBuilder();
                str2 = " status recovered, don't notify client:";
            } else if (this.f9531a == null || !z) {
                sb = new StringBuilder();
                str2 = "peer died, ignore notify ";
            } else {
                C4408b.m12481b("Peer alive notify status to client:" + this.f9547g);
                return true;
            }
            sb.append(str2);
            sb.append(this.f9547g);
            C4408b.m12481b(sb.toString());
            return false;
        }

        /* renamed from: b */
        private boolean m15414b(int i, int i2, String str) {
            if (i == 1) {
                return this.f9535a != C4912c.binded && this.f9533a.mo29942c() && i2 != 21 && (i2 != 7 || !"wait".equals(str));
            }
            if (i == 2) {
                return this.f9533a.mo29942c();
            }
            if (i != 3) {
                return false;
            }
            return !"wait".equals(str);
        }

        /* renamed from: a */
        public long mo30014a() {
            return (((long) ((Math.random() * 20.0d) - 10.0d)) + ((long) ((this.f9528a + 1) * 15))) * 1000;
        }

        /* renamed from: a */
        public String mo30015a(int i) {
            return i != 1 ? i != 2 ? i != 3 ? EnvironmentCompat.MEDIA_UNKNOWN : "KICK" : "CLOSE" : "OPEN";
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void m15417a() {
            try {
                Messenger messenger = this.f9531a;
                if (!(messenger == null || this.f9530a == null)) {
                    messenger.getBinder().unlinkToDeath(this.f9530a, 0);
                }
            } catch (Exception unused) {
            }
            this.f9540b = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo30016a(Messenger messenger) {
            mo30014a();
            if (messenger != null) {
                try {
                    this.f9531a = messenger;
                    this.f9542b = true;
                    this.f9530a = new C4911c(this, messenger);
                    messenger.getBinder().linkToDeath(this.f9530a, 0);
                } catch (Exception e) {
                    C4408b.m12481b("peer linkToDeath err: " + e.getMessage());
                    this.f9531a = null;
                    this.f9542b = false;
                }
            } else {
                C4408b.m12481b("peer linked with old sdk chid = " + this.f9547g);
            }
        }

        /* renamed from: a */
        public void mo30017a(C4909a aVar) {
            synchronized (this.f9538a) {
                this.f9538a.add(aVar);
            }
        }

        /* renamed from: a */
        public void mo30018a(C4912c cVar, int i, int i2, String str, String str2) {
            boolean z;
            synchronized (this.f9538a) {
                for (C4909a a : this.f9538a) {
                    a.mo29132a(this.f9535a, cVar, i2);
                }
            }
            C4912c cVar2 = this.f9535a;
            int i3 = 0;
            if (cVar2 != cVar) {
                C4408b.m12464a(String.format("update the client %7$s status. %1$s->%2$s %3$s %4$s %5$s %6$s", new Object[]{cVar2, cVar, mo30015a(i), C4916bk.m15431a(i2), str, str2, this.f9547g}));
                this.f9535a = cVar;
            }
            if (this.f9536a == null) {
                C4408b.m12483d("status changed while the client dispatcher is missing");
            } else if (cVar != C4912c.binding) {
                if (this.f9540b != null && (z = this.f9542b)) {
                    i3 = (this.f9531a == null || !z) ? 10100 : 1000;
                }
                this.f9533a.mo29941b((XMPushService.C4849j) this.f9534a);
                if (m15414b(i, i2, str2)) {
                    m15410a(i, i2, str, str2);
                } else {
                    this.f9533a.mo29932a(this.f9534a.mo30020a(i, i2, str, str2), (long) i3);
                }
            }
        }

        /* renamed from: b */
        public void mo30019b(C4909a aVar) {
            synchronized (this.f9538a) {
                this.f9538a.remove(aVar);
            }
        }
    }

    /* renamed from: com.xiaomi.push.service.bg$c */
    public enum C4912c {
        unbind,
        binding,
        binded
    }

    private C4906bg() {
    }

    /* renamed from: a */
    public static synchronized C4906bg mo30005a() {
        C4906bg bgVar;
        synchronized (C4906bg.class) {
            if (f9525a == null) {
                f9525a = new C4906bg();
            }
            bgVar = f9525a;
        }
        return bgVar;
    }

    /* renamed from: a */
    private String mo30007a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("@");
        return indexOf > 0 ? str.substring(0, indexOf) : str;
    }

    /* renamed from: a */
    public synchronized int m15393a() {
        return this.f9527a.size();
    }

    /* renamed from: a */
    public synchronized C4908b mo30006a(String str, String str2) {
        HashMap hashMap = this.f9527a.get(str);
        if (hashMap == null) {
            return null;
        }
        return (C4908b) hashMap.get(mo30007a(str2));
    }

    /* renamed from: a */
    public synchronized ArrayList<C4908b> m15395a() {
        ArrayList<C4908b> arrayList;
        arrayList = new ArrayList<>();
        for (HashMap<String, C4908b> values : this.f9527a.values()) {
            arrayList.addAll(values.values());
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized Collection<C4908b> m15396a(String str) {
        if (!this.f9527a.containsKey(str)) {
            return new ArrayList();
        }
        return ((HashMap) this.f9527a.get(str).clone()).values();
    }

    /* renamed from: a */
    public synchronized List<String> m15397a(String str) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (HashMap<String, C4908b> values : this.f9527a.values()) {
            for (C4908b bVar : values.values()) {
                if (str.equals(bVar.f9537a)) {
                    arrayList.add(bVar.f9547g);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized void m15398a() {
        Iterator it = mo30005a().iterator();
        while (it.hasNext()) {
            ((C4908b) it.next()).mo30014a();
        }
        this.f9527a.clear();
    }

    /* renamed from: a */
    public synchronized void mo30008a(Context context) {
        for (HashMap<String, C4908b> values : this.f9527a.values()) {
            for (C4908b a : values.values()) {
                a.mo30018a(C4912c.unbind, 1, 3, (String) null, (String) null);
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo30009a(Context context, int i) {
        for (HashMap<String, C4908b> values : this.f9527a.values()) {
            for (C4908b a : values.values()) {
                a.mo30018a(C4912c.unbind, 2, i, (String) null, (String) null);
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo30010a(C4907a aVar) {
        this.f9526a.add(aVar);
    }

    /* renamed from: a */
    public synchronized void mo30011a(C4908b bVar) {
        HashMap hashMap = this.f9527a.get(bVar.f9547g);
        if (hashMap == null) {
            hashMap = new HashMap();
            this.f9527a.put(bVar.f9547g, hashMap);
        }
        hashMap.put(mo30007a(bVar.f9541b), bVar);
        C4408b.m12464a("add active client. " + bVar.f9537a);
        for (C4907a a : this.f9526a) {
            a.mo30013a();
        }
    }

    /* renamed from: a */
    public synchronized void m15403a(String str) {
        HashMap hashMap = this.f9527a.get(str);
        if (hashMap != null) {
            for (C4908b a : hashMap.values()) {
                a.mo30014a();
            }
            hashMap.clear();
            this.f9527a.remove(str);
        }
        for (C4907a a2 : this.f9526a) {
            a2.mo30013a();
        }
    }

    /* renamed from: a */
    public synchronized void m15404a(String str, String str2) {
        HashMap hashMap = this.f9527a.get(str);
        if (hashMap != null) {
            C4908b bVar = (C4908b) hashMap.get(mo30007a(str2));
            if (bVar != null) {
                bVar.mo30014a();
            }
            hashMap.remove(mo30007a(str2));
            if (hashMap.isEmpty()) {
                this.f9527a.remove(str);
            }
        }
        for (C4907a a : this.f9526a) {
            a.mo30013a();
        }
    }

    /* renamed from: b */
    public synchronized void mo30012b() {
        this.f9526a.clear();
    }
}

package com.xiaomi.push.service;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.core.p005os.EnvironmentCompat;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.mistatistic.sdk.MiStatInterface;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.xiaomi.push.service.ap */
public class C4860ap {

    /* renamed from: a */
    private static C4860ap f9976a;

    /* renamed from: a */
    private List<C4861a> f9977a = new ArrayList();

    /* renamed from: a */
    private ConcurrentHashMap<String, HashMap<String, C4862b>> f9978a = new ConcurrentHashMap<>();

    /* renamed from: com.xiaomi.push.service.ap$a */
    public interface C4861a {
        /* renamed from: a */
        void mo25928a();
    }

    /* renamed from: com.xiaomi.push.service.ap$b */
    public static class C4862b {

        /* renamed from: a */
        private int f9979a = 0;

        /* renamed from: a */
        public Context f9980a;

        /* renamed from: a */
        IBinder.DeathRecipient f9981a = null;

        /* renamed from: a */
        Messenger f9982a;

        /* renamed from: a */
        private XMPushService.C4820b f9983a = new XMPushService.C4820b(this);

        /* renamed from: a */
        private XMPushService f9984a;

        /* renamed from: a */
        final C4864b f9985a = new C4864b();

        /* renamed from: a */
        C4866c f9986a = C4866c.unbind;

        /* renamed from: a */
        public C4907d f9987a;

        /* renamed from: a */
        public String f9988a;

        /* renamed from: a */
        private List<C4863a> f9989a = new ArrayList();

        /* renamed from: a */
        public boolean f9990a;

        /* renamed from: b */
        C4866c f9991b = null;

        /* renamed from: b */
        public String f9992b;

        /* renamed from: b */
        private boolean f9993b = false;

        /* renamed from: c */
        public String f9994c;

        /* renamed from: d */
        public String f9995d;

        /* renamed from: e */
        public String f9996e;

        /* renamed from: f */
        public String f9997f;

        /* renamed from: g */
        public String f9998g;

        /* renamed from: h */
        public String f9999h;

        /* renamed from: i */
        public String f10000i;

        /* renamed from: com.xiaomi.push.service.ap$b$a */
        public interface C4863a {
            /* renamed from: a */
            void mo25238a(C4866c cVar, C4866c cVar2, int i);
        }

        /* renamed from: com.xiaomi.push.service.ap$b$b */
        class C4864b extends XMPushService.C4827i {

            /* renamed from: a */
            String f10002a;

            /* renamed from: b */
            int f10003b;

            /* renamed from: b */
            String f10004b;

            /* renamed from: c */
            int f10005c;

            public C4864b() {
                super(0);
            }

            /* renamed from: a */
            public XMPushService.C4827i mo25935a(int i, int i2, String str, String str2) {
                this.f10003b = i;
                this.f10005c = i2;
                this.f10004b = str2;
                this.f10002a = str;
                return this;
            }

            /* renamed from: a */
            public String mo25172a() {
                return "notify job";
            }

            /* renamed from: a */
            public void m15627a() {
                if (C4862b.this.m15614a(this.f10003b, this.f10005c, this.f10004b)) {
                    C4862b.this.m15612a(this.f10003b, this.f10005c, this.f10002a, this.f10004b);
                    return;
                }
                C3989b.m10679b(" ignore notify client :" + C4862b.this.f9998g);
            }
        }

        /* renamed from: com.xiaomi.push.service.ap$b$c */
        class C4865c implements IBinder.DeathRecipient {

            /* renamed from: a */
            final Messenger f10006a;

            /* renamed from: a */
            final C4862b f10007a;

            C4865c(C4862b bVar, Messenger messenger) {
                this.f10007a = bVar;
                this.f10006a = messenger;
            }

            public void binderDied() {
                C3989b.m10679b("peer died, chid = " + this.f10007a.f9998g);
                C4862b.m15609a(C4862b.this).mo25872a((XMPushService.C4827i) new C4868ar(this, 0), 0);
                if ("9".equals(this.f10007a.f9998g) && "com.xiaomi.xmsf".equals(C4862b.m15609a(C4862b.this).getPackageName())) {
                    C4862b.m15609a(C4862b.this).mo25872a((XMPushService.C4827i) new C4869as(this, 0), (long) MiStatInterface.MIN_UPLOAD_INTERVAL);
                }
            }
        }

        public C4862b() {
        }

        public C4862b(XMPushService xMPushService) {
            this.f9984a = xMPushService;
            mo25932a((C4863a) new C4867aq(this));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
            r0 = r3.lastIndexOf(com.miot.service.common.miotcloud.impl.MiotCloudImpl.COOKIE_PATH);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.String m15611a(java.lang.String r3) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4860ap.C4862b.m15611a(java.lang.String):java.lang.String");
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m15612a(int i, int i2, String str, String str2) {
            C4866c cVar = this.f9986a;
            this.f9991b = cVar;
            if (i == 2) {
                this.f9987a.mo25966a(this.f9980a, this, i2);
            } else if (i == 3) {
                this.f9987a.mo25967a(this.f9980a, this, str2, str);
            } else if (i == 1) {
                boolean z = cVar == C4866c.binded;
                if (!z && "wait".equals(str2)) {
                    this.f9979a++;
                } else if (z) {
                    this.f9979a = 0;
                    if (this.f9982a != null) {
                        try {
                            this.f9982a.send(Message.obtain((Handler) null, 16, this.f9984a.f9880a));
                        } catch (RemoteException unused) {
                        }
                    }
                }
                this.f9987a.mo25968a(this.f9984a, this, z, i2, str);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean m15614a(int i, int i2, String str) {
            boolean z;
            StringBuilder sb;
            String str2;
            C4866c cVar = this.f9991b;
            if (cVar == null || !(z = this.f9993b)) {
                return true;
            }
            if (cVar == this.f9986a) {
                sb = new StringBuilder();
                str2 = " status recovered, don't notify client:";
            } else if (this.f9982a == null || !z) {
                sb = new StringBuilder();
                str2 = "peer died, ignore notify ";
            } else {
                C3989b.m10679b("Peer alive notify status to client:" + this.f9998g);
                return true;
            }
            sb.append(str2);
            sb.append(this.f9998g);
            C3989b.m10679b(sb.toString());
            return false;
        }

        /* renamed from: b */
        private boolean m15616b(int i, int i2, String str) {
            if (i == 1) {
                return this.f9986a != C4866c.binded && this.f9984a.mo25882c() && i2 != 21 && (i2 != 7 || !"wait".equals(str));
            }
            if (i == 2) {
                return this.f9984a.mo25882c();
            }
            if (i != 3) {
                return false;
            }
            return !"wait".equals(str);
        }

        /* renamed from: a */
        public long mo25929a() {
            return (((long) ((Math.random() * 20.0d) - 10.0d)) + ((long) ((this.f9979a + 1) * 15))) * 1000;
        }

        /* renamed from: a */
        public String mo25930a(int i) {
            return i != 1 ? i != 2 ? i != 3 ? EnvironmentCompat.MEDIA_UNKNOWN : "KICK" : "CLOSE" : "OPEN";
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void m15619a() {
            try {
                Messenger messenger = this.f9982a;
                if (!(messenger == null || this.f9981a == null)) {
                    messenger.getBinder().unlinkToDeath(this.f9981a, 0);
                }
            } catch (Exception unused) {
            }
            this.f9991b = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo25931a(Messenger messenger) {
            mo25929a();
            if (messenger != null) {
                try {
                    this.f9982a = messenger;
                    this.f9993b = true;
                    this.f9981a = new C4865c(this, messenger);
                    messenger.getBinder().linkToDeath(this.f9981a, 0);
                } catch (Exception e) {
                    C3989b.m10679b("peer linkToDeath err: " + e.getMessage());
                    this.f9982a = null;
                    this.f9993b = false;
                }
            } else {
                C3989b.m10679b("peer linked with old sdk chid = " + this.f9998g);
            }
        }

        /* renamed from: a */
        public void mo25932a(C4863a aVar) {
            synchronized (this.f9989a) {
                this.f9989a.add(aVar);
            }
        }

        /* renamed from: a */
        public void mo25933a(C4866c cVar, int i, int i2, String str, String str2) {
            boolean z;
            synchronized (this.f9989a) {
                for (C4863a a : this.f9989a) {
                    a.mo25238a(this.f9986a, cVar, i2);
                }
            }
            C4866c cVar2 = this.f9986a;
            int i3 = 0;
            if (cVar2 != cVar) {
                C3989b.m10669a(String.format("update the client %7$s status. %1$s->%2$s %3$s %4$s %5$s %6$s", new Object[]{cVar2, cVar, mo25930a(i), C4870at.m15633a(i2), str, str2, this.f9998g}));
                this.f9986a = cVar;
            }
            if (this.f9987a == null) {
                C3989b.m10681d("status changed while the client dispatcher is missing");
            } else if (cVar != C4866c.binding) {
                if (this.f9991b != null && (z = this.f9993b)) {
                    i3 = (this.f9982a == null || !z) ? 10100 : 1000;
                }
                this.f9984a.mo25881b((XMPushService.C4827i) this.f9985a);
                if (m15616b(i, i2, str2)) {
                    m15612a(i, i2, str, str2);
                } else {
                    this.f9984a.mo25872a(this.f9985a.mo25935a(i, i2, str, str2), (long) i3);
                }
            }
        }

        /* renamed from: b */
        public void mo25934b(C4863a aVar) {
            synchronized (this.f9989a) {
                this.f9989a.remove(aVar);
            }
        }
    }

    /* renamed from: com.xiaomi.push.service.ap$c */
    public enum C4866c {
        unbind,
        binding,
        binded
    }

    private C4860ap() {
    }

    /* renamed from: a */
    public static synchronized C4860ap mo25920a() {
        C4860ap apVar;
        synchronized (C4860ap.class) {
            if (f9976a == null) {
                f9976a = new C4860ap();
            }
            apVar = f9976a;
        }
        return apVar;
    }

    /* renamed from: a */
    private String mo25922a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("@");
        return indexOf > 0 ? str.substring(0, indexOf) : str;
    }

    /* renamed from: a */
    public synchronized int m15595a() {
        return this.f9978a.size();
    }

    /* renamed from: a */
    public synchronized C4862b mo25921a(String str, String str2) {
        HashMap hashMap = this.f9978a.get(str);
        if (hashMap == null) {
            return null;
        }
        return (C4862b) hashMap.get(mo25922a(str2));
    }

    /* renamed from: a */
    public synchronized ArrayList<C4862b> m15597a() {
        ArrayList<C4862b> arrayList;
        arrayList = new ArrayList<>();
        for (HashMap<String, C4862b> values : this.f9978a.values()) {
            arrayList.addAll(values.values());
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized Collection<C4862b> m15598a(String str) {
        if (!this.f9978a.containsKey(str)) {
            return new ArrayList();
        }
        return ((HashMap) this.f9978a.get(str).clone()).values();
    }

    /* renamed from: a */
    public synchronized List<String> m15599a(String str) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (HashMap<String, C4862b> values : this.f9978a.values()) {
            for (C4862b bVar : values.values()) {
                if (str.equals(bVar.f9988a)) {
                    arrayList.add(bVar.f9998g);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized void m15600a() {
        Iterator it = mo25920a().iterator();
        while (it.hasNext()) {
            ((C4862b) it.next()).mo25929a();
        }
        this.f9978a.clear();
    }

    /* renamed from: a */
    public synchronized void mo25923a(Context context) {
        for (HashMap<String, C4862b> values : this.f9978a.values()) {
            for (C4862b a : values.values()) {
                a.mo25933a(C4866c.unbind, 1, 3, (String) null, (String) null);
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo25924a(Context context, int i) {
        for (HashMap<String, C4862b> values : this.f9978a.values()) {
            for (C4862b a : values.values()) {
                a.mo25933a(C4866c.unbind, 2, i, (String) null, (String) null);
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo25925a(C4861a aVar) {
        this.f9977a.add(aVar);
    }

    /* renamed from: a */
    public synchronized void mo25926a(C4862b bVar) {
        HashMap hashMap = this.f9978a.get(bVar.f9998g);
        if (hashMap == null) {
            hashMap = new HashMap();
            this.f9978a.put(bVar.f9998g, hashMap);
        }
        hashMap.put(mo25922a(bVar.f9992b), bVar);
        for (C4861a a : this.f9977a) {
            a.mo25928a();
        }
    }

    /* renamed from: a */
    public synchronized void m15605a(String str) {
        HashMap hashMap = this.f9978a.get(str);
        if (hashMap != null) {
            for (C4862b a : hashMap.values()) {
                a.mo25929a();
            }
            hashMap.clear();
            this.f9978a.remove(str);
        }
        for (C4861a a2 : this.f9977a) {
            a2.mo25928a();
        }
    }

    /* renamed from: a */
    public synchronized void m15606a(String str, String str2) {
        HashMap hashMap = this.f9978a.get(str);
        if (hashMap != null) {
            C4862b bVar = (C4862b) hashMap.get(mo25922a(str2));
            if (bVar != null) {
                bVar.mo25929a();
            }
            hashMap.remove(mo25922a(str2));
            if (hashMap.isEmpty()) {
                this.f9978a.remove(str);
            }
        }
        for (C4861a a : this.f9977a) {
            a.mo25928a();
        }
    }

    /* renamed from: b */
    public synchronized void mo25927b() {
        this.f9977a.clear();
    }
}

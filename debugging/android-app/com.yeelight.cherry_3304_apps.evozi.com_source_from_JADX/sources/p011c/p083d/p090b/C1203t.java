package p011c.p083d.p090b;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import androidx.core.internal.view.SupportMenu;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import p011c.p083d.p090b.C1153a;

/* renamed from: c.d.b.t */
public class C1203t {

    /* renamed from: p */
    static final Handler f2054p = new C1204a(Looper.getMainLooper());

    /* renamed from: q */
    static volatile C1203t f2055q = null;

    /* renamed from: a */
    private final C1208d f2056a;

    /* renamed from: b */
    private final C1211g f2057b;

    /* renamed from: c */
    private final C1206c f2058c;

    /* renamed from: d */
    private final List<C1220y> f2059d;

    /* renamed from: e */
    final Context f2060e;

    /* renamed from: f */
    final C1184i f2061f;

    /* renamed from: g */
    final C1168d f2062g;

    /* renamed from: h */
    final C1155a0 f2063h;

    /* renamed from: i */
    final Map<Object, C1153a> f2064i;

    /* renamed from: j */
    final Map<ImageView, C1183h> f2065j;

    /* renamed from: k */
    final ReferenceQueue<Object> f2066k;

    /* renamed from: l */
    final Bitmap.Config f2067l;

    /* renamed from: m */
    boolean f2068m;

    /* renamed from: n */
    volatile boolean f2069n;

    /* renamed from: o */
    boolean f2070o;

    /* renamed from: c.d.b.t$a */
    static class C1204a extends Handler {
        C1204a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 3) {
                int i2 = 0;
                if (i == 8) {
                    List list = (List) message.obj;
                    int size = list.size();
                    while (i2 < size) {
                        C1160c cVar = (C1160c) list.get(i2);
                        cVar.f1962b.mo9998d(cVar);
                        i2++;
                    }
                } else if (i == 13) {
                    List list2 = (List) message.obj;
                    int size2 = list2.size();
                    while (i2 < size2) {
                        C1153a aVar = (C1153a) list2.get(i2);
                        aVar.f1912a.mo10005l(aVar);
                        i2++;
                    }
                } else {
                    throw new AssertionError("Unknown handler message received: " + message.what);
                }
            } else {
                C1153a aVar2 = (C1153a) message.obj;
                if (aVar2.mo9892g().f2069n) {
                    C1173e0.m3031v("Main", "canceled", aVar2.f1913b.mo10025d(), "target got garbage collected");
                }
                aVar2.f1912a.m3104b(aVar2.mo9896k());
            }
        }
    }

    /* renamed from: c.d.b.t$b */
    public static class C1205b {

        /* renamed from: a */
        private final Context f2071a;

        /* renamed from: b */
        private C1189j f2072b;

        /* renamed from: c */
        private ExecutorService f2073c;

        /* renamed from: d */
        private C1168d f2074d;

        /* renamed from: e */
        private C1208d f2075e;

        /* renamed from: f */
        private C1211g f2076f;

        /* renamed from: g */
        private List<C1220y> f2077g;

        /* renamed from: h */
        private Bitmap.Config f2078h;

        /* renamed from: i */
        private boolean f2079i;

        /* renamed from: j */
        private boolean f2080j;

        public C1205b(Context context) {
            if (context != null) {
                this.f2071a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        /* renamed from: a */
        public C1203t mo10009a() {
            Context context = this.f2071a;
            if (this.f2072b == null) {
                this.f2072b = C1173e0.m3016g(context);
            }
            if (this.f2074d == null) {
                this.f2074d = new C1194m(context);
            }
            if (this.f2073c == null) {
                this.f2073c = new C1214v();
            }
            if (this.f2076f == null) {
                this.f2076f = C1211g.f2093a;
            }
            C1155a0 a0Var = new C1155a0(this.f2074d);
            Context context2 = context;
            return new C1203t(context2, new C1184i(context2, this.f2073c, C1203t.f2054p, this.f2072b, this.f2074d, a0Var), this.f2074d, this.f2075e, this.f2076f, this.f2077g, a0Var, this.f2078h, this.f2079i, this.f2080j);
        }
    }

    /* renamed from: c.d.b.t$c */
    private static class C1206c extends Thread {

        /* renamed from: a */
        private final ReferenceQueue<Object> f2081a;

        /* renamed from: b */
        private final Handler f2082b;

        /* renamed from: c.d.b.t$c$a */
        class C1207a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Exception f2083a;

            C1207a(C1206c cVar, Exception exc) {
                this.f2083a = exc;
            }

            public void run() {
                throw new RuntimeException(this.f2083a);
            }
        }

        C1206c(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f2081a = referenceQueue;
            this.f2082b = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    C1153a.C1154a aVar = (C1153a.C1154a) this.f2081a.remove(1000);
                    Message obtainMessage = this.f2082b.obtainMessage();
                    if (aVar != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = aVar.f1924a;
                        this.f2082b.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    this.f2082b.post(new C1207a(this, e));
                    return;
                }
            }
        }
    }

    /* renamed from: c.d.b.t$d */
    public interface C1208d {
        /* renamed from: a */
        void mo10012a(C1203t tVar, Uri uri, Exception exc);
    }

    /* renamed from: c.d.b.t$e */
    public enum C1209e {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(SupportMenu.CATEGORY_MASK);
        

        /* renamed from: a */
        final int f2088a;

        private C1209e(int i) {
            this.f2088a = i;
        }
    }

    /* renamed from: c.d.b.t$f */
    public enum C1210f {
        LOW,
        NORMAL,
        HIGH
    }

    /* renamed from: c.d.b.t$g */
    public interface C1211g {

        /* renamed from: a */
        public static final C1211g f2093a = new C1212a();

        /* renamed from: c.d.b.t$g$a */
        static class C1212a implements C1211g {
            C1212a() {
            }

            /* renamed from: a */
            public C1216w mo10013a(C1216w wVar) {
                return wVar;
            }
        }

        /* renamed from: a */
        C1216w mo10013a(C1216w wVar);
    }

    C1203t(Context context, C1184i iVar, C1168d dVar, C1208d dVar2, C1211g gVar, List<C1220y> list, C1155a0 a0Var, Bitmap.Config config, boolean z, boolean z2) {
        this.f2060e = context;
        this.f2061f = iVar;
        this.f2062g = dVar;
        this.f2056a = dVar2;
        this.f2057b = gVar;
        this.f2067l = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new C1222z(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new C1180f(context));
        arrayList.add(new C1196o(context));
        arrayList.add(new C1182g(context));
        arrayList.add(new C1158b(context));
        arrayList.add(new C1192k(context));
        arrayList.add(new C1200r(iVar.f1999d, a0Var));
        this.f2059d = Collections.unmodifiableList(arrayList);
        this.f2063h = a0Var;
        this.f2064i = new WeakHashMap();
        this.f2065j = new WeakHashMap();
        this.f2068m = z;
        this.f2069n = z2;
        this.f2066k = new ReferenceQueue<>();
        C1206c cVar = new C1206c(this.f2066k, f2054p);
        this.f2058c = cVar;
        cVar.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m3104b(Object obj) {
        C1183h remove;
        C1173e0.m3012c();
        C1153a remove2 = this.f2064i.remove(obj);
        if (remove2 != null) {
            remove2.mo9886a();
            this.f2061f.mo9959c(remove2);
        }
        if ((obj instanceof ImageView) && (remove = this.f2065j.remove((ImageView) obj)) != null) {
            remove.mo9956a();
        }
    }

    /* renamed from: f */
    private void m3105f(Bitmap bitmap, C1209e eVar, C1153a aVar) {
        if (!aVar.mo9897l()) {
            if (!aVar.mo9898m()) {
                this.f2064i.remove(aVar.mo9896k());
            }
            if (bitmap == null) {
                aVar.mo9888c();
                if (this.f2069n) {
                    C1173e0.m3030u("Main", "errored", aVar.f1913b.mo10025d());
                }
            } else if (eVar != null) {
                aVar.mo9887b(bitmap, eVar);
                if (this.f2069n) {
                    String d = aVar.f1913b.mo10025d();
                    C1173e0.m3031v("Main", "completed", d, "from " + eVar);
                }
            } else {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
        }
    }

    /* renamed from: o */
    public static C1203t m3106o(Context context) {
        if (f2055q == null) {
            synchronized (C1203t.class) {
                if (f2055q == null) {
                    f2055q = new C1205b(context).mo10009a();
                }
            }
        }
        return f2055q;
    }

    /* renamed from: c */
    public void mo9997c(ImageView imageView) {
        m3104b(imageView);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9998d(C1160c cVar) {
        C1153a i = cVar.mo9919i();
        List<C1153a> j = cVar.mo9920j();
        boolean z = true;
        boolean z2 = j != null && !j.isEmpty();
        if (i == null && !z2) {
            z = false;
        }
        if (z) {
            Uri uri = cVar.mo9921k().f2107d;
            Exception l = cVar.mo9922l();
            Bitmap r = cVar.mo9928r();
            C1209e n = cVar.mo9924n();
            if (i != null) {
                m3105f(r, n, i);
            }
            if (z2) {
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    m3105f(r, n, j.get(i2));
                }
            }
            C1208d dVar = this.f2056a;
            if (dVar != null && l != null) {
                dVar.mo10012a(this, uri, l);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo9999e(ImageView imageView, C1183h hVar) {
        this.f2065j.put(imageView, hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo10000g(C1153a aVar) {
        Object k = aVar.mo9896k();
        if (!(k == null || this.f2064i.get(k) == aVar)) {
            m3104b(k);
            this.f2064i.put(k, aVar);
        }
        mo10006m(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public List<C1220y> mo10001h() {
        return this.f2059d;
    }

    /* renamed from: i */
    public C1219x mo10002i(Uri uri) {
        return new C1219x(this, uri, 0);
    }

    /* renamed from: j */
    public C1219x mo10003j(String str) {
        if (str == null) {
            return new C1219x(this, (Uri) null, 0);
        }
        if (str.trim().length() != 0) {
            return mo10002i(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Bitmap mo10004k(String str) {
        Bitmap a = this.f2062g.mo9942a(str);
        C1155a0 a0Var = this.f2063h;
        if (a != null) {
            a0Var.mo9902d();
        } else {
            a0Var.mo9903e();
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo10005l(C1153a aVar) {
        Bitmap k = C1198p.m3091a(aVar.f1916e) ? mo10004k(aVar.mo9889d()) : null;
        if (k != null) {
            m3105f(k, C1209e.MEMORY, aVar);
            if (this.f2069n) {
                String d = aVar.f1913b.mo10025d();
                C1173e0.m3031v("Main", "completed", d, "from " + C1209e.MEMORY);
                return;
            }
            return;
        }
        mo10000g(aVar);
        if (this.f2069n) {
            C1173e0.m3030u("Main", "resumed", aVar.f1913b.mo10025d());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo10006m(C1153a aVar) {
        this.f2061f.mo9964h(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C1216w mo10007n(C1216w wVar) {
        this.f2057b.mo10013a(wVar);
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalStateException("Request transformer " + this.f2057b.getClass().getCanonicalName() + " returned null for " + wVar);
    }
}

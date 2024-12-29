package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import androidx.core.internal.view.SupportMenu;
import com.squareup.picasso.C4332a;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

public class Picasso {

    /* renamed from: p */
    static final Handler f7116p = new C4325a(Looper.getMainLooper());

    /* renamed from: q */
    static volatile Picasso f7117q = null;

    /* renamed from: a */
    private final C4329d f7118a;

    /* renamed from: b */
    private final C4330e f7119b;

    /* renamed from: c */
    private final C4327c f7120c;

    /* renamed from: d */
    private final List<C4365s> f7121d;

    /* renamed from: e */
    final Context f7122e;

    /* renamed from: f */
    final C4348i f7123f;

    /* renamed from: g */
    final C4342d f7124g;

    /* renamed from: h */
    final C4368u f7125h;

    /* renamed from: i */
    final Map<Object, C4332a> f7126i;

    /* renamed from: j */
    final Map<ImageView, C4347h> f7127j;

    /* renamed from: k */
    final ReferenceQueue<Object> f7128k;

    /* renamed from: l */
    final Bitmap.Config f7129l;

    /* renamed from: m */
    boolean f7130m;

    /* renamed from: n */
    volatile boolean f7131n;

    /* renamed from: o */
    boolean f7132o;

    public enum LoadedFrom {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(SupportMenu.CATEGORY_MASK);
        
        final int debugColor;

        private LoadedFrom(int i) {
            this.debugColor = i;
        }
    }

    public enum Priority {
        LOW,
        NORMAL,
        HIGH
    }

    /* renamed from: com.squareup.picasso.Picasso$a */
    static class C4325a extends Handler {
        C4325a(Looper looper) {
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
                        C4335c cVar = (C4335c) list.get(i2);
                        cVar.f7167b.mo28106d(cVar);
                        i2++;
                    }
                } else if (i == 13) {
                    List list2 = (List) message.obj;
                    int size2 = list2.size();
                    while (i2 < size2) {
                        C4332a aVar = (C4332a) list2.get(i2);
                        aVar.f7147a.mo28113l(aVar);
                        i2++;
                    }
                } else {
                    throw new AssertionError("Unknown handler message received: " + message.what);
                }
            } else {
                C4332a aVar2 = (C4332a) message.obj;
                if (aVar2.mo28128g().f7131n) {
                    C4376y.m12448v("Main", "canceled", aVar2.f7148b.mo28212d(), "target got garbage collected");
                }
                aVar2.f7147a.m12251b(aVar2.mo28132k());
            }
        }
    }

    /* renamed from: com.squareup.picasso.Picasso$b */
    public static class C4326b {

        /* renamed from: a */
        private final Context f7133a;

        /* renamed from: b */
        private Downloader f7134b;

        /* renamed from: c */
        private ExecutorService f7135c;

        /* renamed from: d */
        private C4342d f7136d;

        /* renamed from: e */
        private C4329d f7137e;

        /* renamed from: f */
        private C4330e f7138f;

        /* renamed from: g */
        private List<C4365s> f7139g;

        /* renamed from: h */
        private Bitmap.Config f7140h;

        /* renamed from: i */
        private boolean f7141i;

        /* renamed from: j */
        private boolean f7142j;

        public C4326b(Context context) {
            if (context != null) {
                this.f7133a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        /* renamed from: a */
        public Picasso mo28117a() {
            Context context = this.f7133a;
            if (this.f7134b == null) {
                this.f7134b = C4376y.m12433g(context);
            }
            if (this.f7136d == null) {
                this.f7136d = new C4355l(context);
            }
            if (this.f7135c == null) {
                this.f7135c = new C4359p();
            }
            if (this.f7138f == null) {
                this.f7138f = C4330e.f7146a;
            }
            C4368u uVar = new C4368u(this.f7136d);
            Context context2 = context;
            return new Picasso(context2, new C4348i(context2, this.f7135c, Picasso.f7116p, this.f7134b, this.f7136d, uVar), this.f7136d, this.f7137e, this.f7138f, this.f7139g, uVar, this.f7140h, this.f7141i, this.f7142j);
        }
    }

    /* renamed from: com.squareup.picasso.Picasso$c */
    private static class C4327c extends Thread {

        /* renamed from: a */
        private final ReferenceQueue<Object> f7143a;

        /* renamed from: b */
        private final Handler f7144b;

        /* renamed from: com.squareup.picasso.Picasso$c$a */
        class C4328a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Exception f7145a;

            C4328a(C4327c cVar, Exception exc) {
                this.f7145a = exc;
            }

            public void run() {
                throw new RuntimeException(this.f7145a);
            }
        }

        C4327c(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f7143a = referenceQueue;
            this.f7144b = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    C4332a.C4333a aVar = (C4332a.C4333a) this.f7143a.remove(1000);
                    Message obtainMessage = this.f7144b.obtainMessage();
                    if (aVar != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = aVar.f7159a;
                        this.f7144b.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    this.f7144b.post(new C4328a(this, e));
                    return;
                }
            }
        }
    }

    /* renamed from: com.squareup.picasso.Picasso$d */
    public interface C4329d {
        /* renamed from: a */
        void mo28120a(Picasso picasso, Uri uri, Exception exc);
    }

    /* renamed from: com.squareup.picasso.Picasso$e */
    public interface C4330e {

        /* renamed from: a */
        public static final C4330e f7146a = new C4331a();

        /* renamed from: com.squareup.picasso.Picasso$e$a */
        static class C4331a implements C4330e {
            C4331a() {
            }

            /* renamed from: a */
            public C4361q mo28121a(C4361q qVar) {
                return qVar;
            }
        }

        /* renamed from: a */
        C4361q mo28121a(C4361q qVar);
    }

    Picasso(Context context, C4348i iVar, C4342d dVar, C4329d dVar2, C4330e eVar, List<C4365s> list, C4368u uVar, Bitmap.Config config, boolean z, boolean z2) {
        this.f7122e = context;
        this.f7123f = iVar;
        this.f7124g = dVar;
        this.f7118a = dVar2;
        this.f7119b = eVar;
        this.f7129l = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new C4367t(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new C4344f(context));
        arrayList.add(new MediaStoreRequestHandler(context));
        arrayList.add(new C4346g(context));
        arrayList.add(new C4334b(context));
        arrayList.add(new C4353j(context));
        arrayList.add(new NetworkRequestHandler(iVar.f7199d, uVar));
        this.f7121d = Collections.unmodifiableList(arrayList);
        this.f7125h = uVar;
        this.f7126i = new WeakHashMap();
        this.f7127j = new WeakHashMap();
        this.f7130m = z;
        this.f7131n = z2;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f7128k = referenceQueue;
        C4327c cVar = new C4327c(referenceQueue, f7116p);
        this.f7120c = cVar;
        cVar.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m12251b(Object obj) {
        C4347h remove;
        C4376y.m12429c();
        C4332a remove2 = this.f7126i.remove(obj);
        if (remove2 != null) {
            remove2.mo28122a();
            this.f7123f.mo28169c(remove2);
        }
        if ((obj instanceof ImageView) && (remove = this.f7127j.remove((ImageView) obj)) != null) {
            remove.mo28166a();
        }
    }

    /* renamed from: f */
    private void m12252f(Bitmap bitmap, LoadedFrom loadedFrom, C4332a aVar) {
        if (!aVar.mo28133l()) {
            if (!aVar.mo28134m()) {
                this.f7126i.remove(aVar.mo28132k());
            }
            if (bitmap == null) {
                aVar.mo28124c();
                if (this.f7131n) {
                    C4376y.m12447u("Main", "errored", aVar.f7148b.mo28212d());
                }
            } else if (loadedFrom != null) {
                aVar.mo28123b(bitmap, loadedFrom);
                if (this.f7131n) {
                    String d = aVar.f7148b.mo28212d();
                    C4376y.m12448v("Main", "completed", d, "from " + loadedFrom);
                }
            } else {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
        }
    }

    /* renamed from: o */
    public static Picasso m12253o(Context context) {
        if (f7117q == null) {
            synchronized (Picasso.class) {
                if (f7117q == null) {
                    f7117q = new C4326b(context).mo28117a();
                }
            }
        }
        return f7117q;
    }

    /* renamed from: c */
    public void mo28105c(ImageView imageView) {
        m12251b(imageView);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo28106d(C4335c cVar) {
        C4332a i = cVar.mo28138i();
        List<C4332a> j = cVar.mo28139j();
        boolean z = true;
        boolean z2 = j != null && !j.isEmpty();
        if (i == null && !z2) {
            z = false;
        }
        if (z) {
            Uri uri = cVar.mo28140k().f7242d;
            Exception l = cVar.mo28141l();
            Bitmap s = cVar.mo28148s();
            LoadedFrom n = cVar.mo28143n();
            if (i != null) {
                m12252f(s, n, i);
            }
            if (z2) {
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    m12252f(s, n, j.get(i2));
                }
            }
            C4329d dVar = this.f7118a;
            if (dVar != null && l != null) {
                dVar.mo28120a(this, uri, l);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo28107e(ImageView imageView, C4347h hVar) {
        this.f7127j.put(imageView, hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo28108g(C4332a aVar) {
        Object k = aVar.mo28132k();
        if (!(k == null || this.f7126i.get(k) == aVar)) {
            m12251b(k);
            this.f7126i.put(k, aVar);
        }
        mo28114m(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public List<C4365s> mo28109h() {
        return this.f7121d;
    }

    /* renamed from: i */
    public C4364r mo28110i(Uri uri) {
        return new C4364r(this, uri, 0);
    }

    /* renamed from: j */
    public C4364r mo28111j(String str) {
        if (str == null) {
            return new C4364r(this, (Uri) null, 0);
        }
        if (str.trim().length() != 0) {
            return mo28110i(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Bitmap mo28112k(String str) {
        Bitmap bitmap = this.f7124g.get(str);
        C4368u uVar = this.f7125h;
        if (bitmap != null) {
            uVar.mo28235d();
        } else {
            uVar.mo28236e();
        }
        return bitmap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo28113l(C4332a aVar) {
        Bitmap k = MemoryPolicy.shouldReadFromMemoryCache(aVar.f7151e) ? mo28112k(aVar.mo28125d()) : null;
        if (k != null) {
            LoadedFrom loadedFrom = LoadedFrom.MEMORY;
            m12252f(k, loadedFrom, aVar);
            if (this.f7131n) {
                String d = aVar.f7148b.mo28212d();
                C4376y.m12448v("Main", "completed", d, "from " + loadedFrom);
                return;
            }
            return;
        }
        mo28108g(aVar);
        if (this.f7131n) {
            C4376y.m12447u("Main", "resumed", aVar.f7148b.mo28212d());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo28114m(C4332a aVar) {
        this.f7123f.mo28174h(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C4361q mo28115n(C4361q qVar) {
        C4361q a = this.f7119b.mo28121a(qVar);
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("Request transformer " + this.f7119b.getClass().getCanonicalName() + " returned null for " + qVar);
    }
}

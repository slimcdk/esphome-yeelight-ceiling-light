package p011c.p083d.p090b;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* renamed from: c.d.b.a0 */
class C1155a0 {

    /* renamed from: a */
    final HandlerThread f1925a;

    /* renamed from: b */
    final C1168d f1926b;

    /* renamed from: c */
    final Handler f1927c = new C1156a(this.f1925a.getLooper(), this);

    /* renamed from: d */
    long f1928d;

    /* renamed from: e */
    long f1929e;

    /* renamed from: f */
    long f1930f;

    /* renamed from: g */
    long f1931g;

    /* renamed from: h */
    long f1932h;

    /* renamed from: i */
    long f1933i;

    /* renamed from: j */
    long f1934j;

    /* renamed from: k */
    long f1935k;

    /* renamed from: l */
    int f1936l;

    /* renamed from: m */
    int f1937m;

    /* renamed from: n */
    int f1938n;

    /* renamed from: c.d.b.a0$a */
    private static class C1156a extends Handler {

        /* renamed from: a */
        private final C1155a0 f1939a;

        /* renamed from: c.d.b.a0$a$a */
        class C1157a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Message f1940a;

            C1157a(C1156a aVar, Message message) {
                this.f1940a = message;
            }

            public void run() {
                throw new AssertionError("Unhandled stats message." + this.f1940a.what);
            }
        }

        public C1156a(Looper looper, C1155a0 a0Var) {
            super(looper);
            this.f1939a = a0Var;
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.f1939a.mo9907j();
            } else if (i == 1) {
                this.f1939a.mo9908k();
            } else if (i == 2) {
                this.f1939a.mo9905h((long) message.arg1);
            } else if (i == 3) {
                this.f1939a.mo9906i((long) message.arg1);
            } else if (i != 4) {
                C1203t.f2054p.post(new C1157a(this, message));
            } else {
                this.f1939a.mo9909l((Long) message.obj);
            }
        }
    }

    C1155a0(C1168d dVar) {
        this.f1926b = dVar;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.f1925a = handlerThread;
        handlerThread.start();
        C1173e0.m3019j(this.f1925a.getLooper());
    }

    /* renamed from: g */
    private static long m2954g(int i, long j) {
        return j / ((long) i);
    }

    /* renamed from: m */
    private void m2955m(Bitmap bitmap, int i) {
        int k = C1173e0.m3020k(bitmap);
        Handler handler = this.f1927c;
        handler.sendMessage(handler.obtainMessage(i, k, 0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1159b0 mo9899a() {
        return new C1159b0(this.f1926b.mo9943b(), this.f1926b.size(), this.f1928d, this.f1929e, this.f1930f, this.f1931g, this.f1932h, this.f1933i, this.f1934j, this.f1935k, this.f1936l, this.f1937m, this.f1938n, System.currentTimeMillis());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9900b(Bitmap bitmap) {
        m2955m(bitmap, 2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9901c(Bitmap bitmap) {
        m2955m(bitmap, 3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9902d() {
        this.f1927c.sendEmptyMessage(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo9903e() {
        this.f1927c.sendEmptyMessage(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo9904f(long j) {
        Handler handler = this.f1927c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo9905h(long j) {
        int i = this.f1937m + 1;
        this.f1937m = i;
        long j2 = this.f1931g + j;
        this.f1931g = j2;
        this.f1934j = m2954g(i, j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo9906i(long j) {
        this.f1938n++;
        long j2 = this.f1932h + j;
        this.f1932h = j2;
        this.f1935k = m2954g(this.f1937m, j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo9907j() {
        this.f1928d++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo9908k() {
        this.f1929e++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo9909l(Long l) {
        this.f1936l++;
        long longValue = this.f1930f + l.longValue();
        this.f1930f = longValue;
        this.f1933i = m2954g(this.f1936l, longValue);
    }
}

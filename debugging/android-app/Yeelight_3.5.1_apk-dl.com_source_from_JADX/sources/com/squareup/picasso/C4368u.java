package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.squareup.picasso.u */
class C4368u {

    /* renamed from: a */
    final HandlerThread f7290a;

    /* renamed from: b */
    final C4342d f7291b;

    /* renamed from: c */
    final Handler f7292c;

    /* renamed from: d */
    long f7293d;

    /* renamed from: e */
    long f7294e;

    /* renamed from: f */
    long f7295f;

    /* renamed from: g */
    long f7296g;

    /* renamed from: h */
    long f7297h;

    /* renamed from: i */
    long f7298i;

    /* renamed from: j */
    long f7299j;

    /* renamed from: k */
    long f7300k;

    /* renamed from: l */
    int f7301l;

    /* renamed from: m */
    int f7302m;

    /* renamed from: n */
    int f7303n;

    /* renamed from: com.squareup.picasso.u$a */
    private static class C4369a extends Handler {

        /* renamed from: a */
        private final C4368u f7304a;

        /* renamed from: com.squareup.picasso.u$a$a */
        class C4370a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Message f7305a;

            C4370a(C4369a aVar, Message message) {
                this.f7305a = message;
            }

            public void run() {
                throw new AssertionError("Unhandled stats message." + this.f7305a.what);
            }
        }

        public C4369a(Looper looper, C4368u uVar) {
            super(looper);
            this.f7304a = uVar;
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.f7304a.mo28240j();
            } else if (i == 1) {
                this.f7304a.mo28241k();
            } else if (i == 2) {
                this.f7304a.mo28238h((long) message.arg1);
            } else if (i == 3) {
                this.f7304a.mo28239i((long) message.arg1);
            } else if (i != 4) {
                Picasso.f7116p.post(new C4370a(this, message));
            } else {
                this.f7304a.mo28242l((Long) message.obj);
            }
        }
    }

    C4368u(C4342d dVar) {
        this.f7291b = dVar;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.f7290a = handlerThread;
        handlerThread.start();
        C4376y.m12436j(handlerThread.getLooper());
        this.f7292c = new C4369a(handlerThread.getLooper(), this);
    }

    /* renamed from: g */
    private static long m12406g(int i, long j) {
        return j / ((long) i);
    }

    /* renamed from: m */
    private void m12407m(Bitmap bitmap, int i) {
        int k = C4376y.m12437k(bitmap);
        Handler handler = this.f7292c;
        handler.sendMessage(handler.obtainMessage(i, k, 0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C4371v mo28232a() {
        return new C4371v(this.f7291b.mo28159a(), this.f7291b.size(), this.f7293d, this.f7294e, this.f7295f, this.f7296g, this.f7297h, this.f7298i, this.f7299j, this.f7300k, this.f7301l, this.f7302m, this.f7303n, System.currentTimeMillis());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo28233b(Bitmap bitmap) {
        m12407m(bitmap, 2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo28234c(Bitmap bitmap) {
        m12407m(bitmap, 3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo28235d() {
        this.f7292c.sendEmptyMessage(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo28236e() {
        this.f7292c.sendEmptyMessage(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo28237f(long j) {
        Handler handler = this.f7292c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo28238h(long j) {
        int i = this.f7302m + 1;
        this.f7302m = i;
        long j2 = this.f7296g + j;
        this.f7296g = j2;
        this.f7299j = m12406g(i, j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo28239i(long j) {
        this.f7303n++;
        long j2 = this.f7297h + j;
        this.f7297h = j2;
        this.f7300k = m12406g(this.f7302m, j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo28240j() {
        this.f7293d++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo28241k() {
        this.f7294e++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo28242l(Long l) {
        this.f7301l++;
        long longValue = this.f7295f + l.longValue();
        this.f7295f = longValue;
        this.f7298i = m12406g(this.f7301l, longValue);
    }
}

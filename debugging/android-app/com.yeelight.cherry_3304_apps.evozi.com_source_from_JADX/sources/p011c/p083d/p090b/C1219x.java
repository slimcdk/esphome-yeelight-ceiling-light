package p011c.p083d.p090b;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicInteger;
import p011c.p083d.p090b.C1203t;
import p011c.p083d.p090b.C1216w;

/* renamed from: c.d.b.x */
public class C1219x {

    /* renamed from: m */
    private static final AtomicInteger f2137m = new AtomicInteger();

    /* renamed from: a */
    private final C1203t f2138a;

    /* renamed from: b */
    private final C1216w.C1218b f2139b;

    /* renamed from: c */
    private boolean f2140c;

    /* renamed from: d */
    private boolean f2141d;

    /* renamed from: e */
    private boolean f2142e = true;

    /* renamed from: f */
    private int f2143f;

    /* renamed from: g */
    private int f2144g;

    /* renamed from: h */
    private int f2145h;

    /* renamed from: i */
    private int f2146i;

    /* renamed from: j */
    private Drawable f2147j;

    /* renamed from: k */
    private Drawable f2148k;

    /* renamed from: l */
    private Object f2149l;

    C1219x(C1203t tVar, Uri uri, int i) {
        if (!tVar.f2070o) {
            this.f2138a = tVar;
            this.f2139b = new C1216w.C1218b(uri, i, tVar.f2067l);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }

    /* renamed from: b */
    private C1216w m3141b(long j) {
        int andIncrement = f2137m.getAndIncrement();
        C1216w a = this.f2139b.mo10030a();
        a.f2104a = andIncrement;
        a.f2105b = j;
        boolean z = this.f2138a.f2069n;
        if (z) {
            C1173e0.m3031v("Main", "created", a.mo10028g(), a.toString());
        }
        this.f2138a.mo10007n(a);
        if (a != a) {
            a.f2104a = andIncrement;
            a.f2105b = j;
            if (z) {
                String d = a.mo10025d();
                C1173e0.m3031v("Main", "changed", d, "into " + a);
            }
        }
        return a;
    }

    /* renamed from: c */
    private Drawable m3142c() {
        return this.f2143f != 0 ? this.f2138a.f2060e.getResources().getDrawable(this.f2143f) : this.f2147j;
    }

    /* renamed from: a */
    public C1219x mo10035a() {
        this.f2139b.mo10031b();
        return this;
    }

    /* renamed from: d */
    public void mo10036d(ImageView imageView) {
        mo10037e(imageView, (C1172e) null);
    }

    /* renamed from: e */
    public void mo10037e(ImageView imageView, C1172e eVar) {
        Bitmap k;
        ImageView imageView2 = imageView;
        C1172e eVar2 = eVar;
        long nanoTime = System.nanoTime();
        C1173e0.m3012c();
        if (imageView2 == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.f2139b.mo10032c()) {
            this.f2138a.mo9997c(imageView2);
            if (this.f2142e) {
                C1213u.m3125d(imageView2, m3142c());
            }
        } else {
            if (this.f2141d) {
                if (!this.f2139b.mo10033d()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width == 0 || height == 0) {
                        if (this.f2142e) {
                            C1213u.m3125d(imageView2, m3142c());
                        }
                        this.f2138a.mo9999e(imageView2, new C1183h(this, imageView2, eVar2));
                        return;
                    }
                    this.f2139b.mo10034e(width, height);
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            C1216w b = m3141b(nanoTime);
            String h = C1173e0.m3017h(b);
            if (!C1198p.m3091a(this.f2145h) || (k = this.f2138a.mo10004k(h)) == null) {
                if (this.f2142e) {
                    C1213u.m3125d(imageView2, m3142c());
                }
                this.f2138a.mo10000g(new C1193l(this.f2138a, imageView, b, this.f2145h, this.f2146i, this.f2144g, this.f2148k, h, this.f2149l, eVar, this.f2140c));
                return;
            }
            this.f2138a.mo9997c(imageView2);
            C1203t tVar = this.f2138a;
            C1213u.m3124c(imageView, tVar.f2060e, k, C1203t.C1209e.MEMORY, this.f2140c, tVar.f2068m);
            if (this.f2138a.f2069n) {
                String g = b.mo10028g();
                C1173e0.m3031v("Main", "completed", g, "from " + C1203t.C1209e.MEMORY);
            }
            if (eVar2 != null) {
                eVar.mo9951b();
            }
        }
    }

    /* renamed from: f */
    public C1219x mo10038f(int i) {
        if (!this.f2142e) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        } else if (i == 0) {
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        } else if (this.f2147j == null) {
            this.f2143f = i;
            return this;
        } else {
            throw new IllegalStateException("Placeholder image already set.");
        }
    }

    /* renamed from: g */
    public C1219x mo10039g(int i, int i2) {
        this.f2139b.mo10034e(i, i2);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C1219x mo10040h() {
        this.f2141d = false;
        return this;
    }
}

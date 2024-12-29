package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.C4361q;
import com.squareup.picasso.Picasso;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.squareup.picasso.r */
public class C4364r {

    /* renamed from: m */
    private static final AtomicInteger f7272m = new AtomicInteger();

    /* renamed from: a */
    private final Picasso f7273a;

    /* renamed from: b */
    private final C4361q.C4363b f7274b;

    /* renamed from: c */
    private boolean f7275c;

    /* renamed from: d */
    private boolean f7276d;

    /* renamed from: e */
    private boolean f7277e = true;

    /* renamed from: f */
    private int f7278f;

    /* renamed from: g */
    private int f7279g;

    /* renamed from: h */
    private int f7280h;

    /* renamed from: i */
    private int f7281i;

    /* renamed from: j */
    private Drawable f7282j;

    /* renamed from: k */
    private Drawable f7283k;

    /* renamed from: l */
    private Object f7284l;

    C4364r(Picasso picasso, Uri uri, int i) {
        if (!picasso.f7132o) {
            this.f7273a = picasso;
            this.f7274b = new C4361q.C4363b(uri, i, picasso.f7129l);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }

    /* renamed from: b */
    private C4361q m12382b(long j) {
        int andIncrement = f7272m.getAndIncrement();
        C4361q a = this.f7274b.mo28217a();
        a.f7239a = andIncrement;
        a.f7240b = j;
        boolean z = this.f7273a.f7131n;
        if (z) {
            C4376y.m12448v("Main", "created", a.mo28215g(), a.toString());
        }
        C4361q n = this.f7273a.mo28115n(a);
        if (n != a) {
            n.f7239a = andIncrement;
            n.f7240b = j;
            if (z) {
                String d = n.mo28212d();
                C4376y.m12448v("Main", "changed", d, "into " + n);
            }
        }
        return n;
    }

    /* renamed from: c */
    private Drawable m12383c() {
        return this.f7278f != 0 ? this.f7273a.f7122e.getResources().getDrawable(this.f7278f) : this.f7282j;
    }

    /* renamed from: a */
    public C4364r mo28222a() {
        this.f7274b.mo28218b();
        return this;
    }

    /* renamed from: d */
    public void mo28223d(ImageView imageView) {
        mo28224e(imageView, (C4343e) null);
    }

    /* renamed from: e */
    public void mo28224e(ImageView imageView, C4343e eVar) {
        Bitmap k;
        ImageView imageView2 = imageView;
        C4343e eVar2 = eVar;
        long nanoTime = System.nanoTime();
        C4376y.m12429c();
        if (imageView2 == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.f7274b.mo28219c()) {
            this.f7273a.mo28105c(imageView2);
            if (this.f7277e) {
                C4358o.m12366d(imageView2, m12383c());
            }
        } else {
            if (this.f7276d) {
                if (!this.f7274b.mo28220d()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width == 0 || height == 0) {
                        if (this.f7277e) {
                            C4358o.m12366d(imageView2, m12383c());
                        }
                        this.f7273a.mo28107e(imageView2, new C4347h(this, imageView2, eVar2));
                        return;
                    }
                    this.f7274b.mo28221e(width, height);
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            C4361q b = m12382b(nanoTime);
            String h = C4376y.m12434h(b);
            if (!MemoryPolicy.shouldReadFromMemoryCache(this.f7280h) || (k = this.f7273a.mo28112k(h)) == null) {
                if (this.f7277e) {
                    C4358o.m12366d(imageView2, m12383c());
                }
                this.f7273a.mo28108g(new C4354k(this.f7273a, imageView, b, this.f7280h, this.f7281i, this.f7279g, this.f7283k, h, this.f7284l, eVar, this.f7275c));
                return;
            }
            this.f7273a.mo28105c(imageView2);
            Picasso picasso = this.f7273a;
            Context context = picasso.f7122e;
            Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.MEMORY;
            C4358o.m12365c(imageView, context, k, loadedFrom, this.f7275c, picasso.f7130m);
            if (this.f7273a.f7131n) {
                String g = b.mo28215g();
                C4376y.m12448v("Main", "completed", g, "from " + loadedFrom);
            }
            if (eVar2 != null) {
                eVar.mo28163b();
            }
        }
    }

    /* renamed from: f */
    public C4364r mo28225f(int i) {
        if (!this.f7277e) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        } else if (i == 0) {
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        } else if (this.f7282j == null) {
            this.f7278f = i;
            return this;
        } else {
            throw new IllegalStateException("Placeholder image already set.");
        }
    }

    /* renamed from: g */
    public C4364r mo28226g(int i, int i2) {
        this.f7274b.mo28221e(i, i2);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C4364r mo28227h() {
        this.f7276d = false;
        return this;
    }
}

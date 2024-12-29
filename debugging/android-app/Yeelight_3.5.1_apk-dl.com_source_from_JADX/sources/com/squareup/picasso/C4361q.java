package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import com.squareup.picasso.Picasso;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.squareup.picasso.q */
public final class C4361q {

    /* renamed from: s */
    private static final long f7238s = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a */
    int f7239a;

    /* renamed from: b */
    long f7240b;

    /* renamed from: c */
    int f7241c;

    /* renamed from: d */
    public final Uri f7242d;

    /* renamed from: e */
    public final int f7243e;

    /* renamed from: f */
    public final String f7244f;

    /* renamed from: g */
    public final List<C4372w> f7245g;

    /* renamed from: h */
    public final int f7246h;

    /* renamed from: i */
    public final int f7247i;

    /* renamed from: j */
    public final boolean f7248j;

    /* renamed from: k */
    public final boolean f7249k;

    /* renamed from: l */
    public final boolean f7250l;

    /* renamed from: m */
    public final float f7251m;

    /* renamed from: n */
    public final float f7252n;

    /* renamed from: o */
    public final float f7253o;

    /* renamed from: p */
    public final boolean f7254p;

    /* renamed from: q */
    public final Bitmap.Config f7255q;

    /* renamed from: r */
    public final Picasso.Priority f7256r;

    /* renamed from: com.squareup.picasso.q$b */
    public static final class C4363b {

        /* renamed from: a */
        private Uri f7257a;

        /* renamed from: b */
        private int f7258b;

        /* renamed from: c */
        private String f7259c;

        /* renamed from: d */
        private int f7260d;

        /* renamed from: e */
        private int f7261e;

        /* renamed from: f */
        private boolean f7262f;

        /* renamed from: g */
        private boolean f7263g;

        /* renamed from: h */
        private boolean f7264h;

        /* renamed from: i */
        private float f7265i;

        /* renamed from: j */
        private float f7266j;

        /* renamed from: k */
        private float f7267k;

        /* renamed from: l */
        private boolean f7268l;

        /* renamed from: m */
        private List<C4372w> f7269m;

        /* renamed from: n */
        private Bitmap.Config f7270n;

        /* renamed from: o */
        private Picasso.Priority f7271o;

        C4363b(Uri uri, int i, Bitmap.Config config) {
            this.f7257a = uri;
            this.f7258b = i;
            this.f7270n = config;
        }

        /* renamed from: a */
        public C4361q mo28217a() {
            boolean z = this.f7263g;
            if (z && this.f7262f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            } else if (this.f7262f && this.f7260d == 0 && this.f7261e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            } else if (z && this.f7260d == 0 && this.f7261e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            } else {
                if (this.f7271o == null) {
                    this.f7271o = Picasso.Priority.NORMAL;
                }
                C4361q qVar = r2;
                C4361q qVar2 = new C4361q(this.f7257a, this.f7258b, this.f7259c, this.f7269m, this.f7260d, this.f7261e, this.f7262f, this.f7263g, this.f7264h, this.f7265i, this.f7266j, this.f7267k, this.f7268l, this.f7270n, this.f7271o);
                return qVar;
            }
        }

        /* renamed from: b */
        public C4363b mo28218b() {
            if (!this.f7262f) {
                this.f7263g = true;
                return this;
            }
            throw new IllegalStateException("Center inside can not be used after calling centerCrop");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo28219c() {
            return (this.f7257a == null && this.f7258b == 0) ? false : true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo28220d() {
            return (this.f7260d == 0 && this.f7261e == 0) ? false : true;
        }

        /* renamed from: e */
        public C4363b mo28221e(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            } else if (i2 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            } else if (i2 == 0 && i == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            } else {
                this.f7260d = i;
                this.f7261e = i2;
                return this;
            }
        }
    }

    private C4361q(Uri uri, int i, String str, List<C4372w> list, int i2, int i3, boolean z, boolean z2, boolean z3, float f, float f2, float f3, boolean z4, Bitmap.Config config, Picasso.Priority priority) {
        this.f7242d = uri;
        this.f7243e = i;
        this.f7244f = str;
        this.f7245g = list == null ? null : Collections.unmodifiableList(list);
        this.f7246h = i2;
        this.f7247i = i3;
        this.f7248j = z;
        this.f7249k = z2;
        this.f7250l = z3;
        this.f7251m = f;
        this.f7252n = f2;
        this.f7253o = f3;
        this.f7254p = z4;
        this.f7255q = config;
        this.f7256r = priority;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo28209a() {
        Uri uri = this.f7242d;
        return uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(this.f7243e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo28210b() {
        return this.f7245g != null;
    }

    /* renamed from: c */
    public boolean mo28211c() {
        return (this.f7246h == 0 && this.f7247i == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo28212d() {
        StringBuilder sb;
        long nanoTime = System.nanoTime() - this.f7240b;
        if (nanoTime > f7238s) {
            sb.append(mo28215g());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toSeconds(nanoTime));
            sb.append('s');
        } else {
            sb = new StringBuilder();
            sb.append(mo28215g());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toMillis(nanoTime));
            sb.append("ms");
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo28213e() {
        return mo28211c() || this.f7251m != 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo28214f() {
        return mo28213e() || mo28210b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo28215g() {
        return "[R" + this.f7239a + ']';
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i = this.f7243e;
        if (i > 0) {
            sb.append(i);
        } else {
            sb.append(this.f7242d);
        }
        List<C4372w> list = this.f7245g;
        if (list != null && !list.isEmpty()) {
            for (C4372w b : this.f7245g) {
                sb.append(' ');
                sb.append(b.mo28248b());
            }
        }
        if (this.f7244f != null) {
            sb.append(" stableKey(");
            sb.append(this.f7244f);
            sb.append(')');
        }
        if (this.f7246h > 0) {
            sb.append(" resize(");
            sb.append(this.f7246h);
            sb.append(',');
            sb.append(this.f7247i);
            sb.append(')');
        }
        if (this.f7248j) {
            sb.append(" centerCrop");
        }
        if (this.f7249k) {
            sb.append(" centerInside");
        }
        if (this.f7251m != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.f7251m);
            if (this.f7254p) {
                sb.append(" @ ");
                sb.append(this.f7252n);
                sb.append(',');
                sb.append(this.f7253o);
            }
            sb.append(')');
        }
        if (this.f7255q != null) {
            sb.append(' ');
            sb.append(this.f7255q);
        }
        sb.append('}');
        return sb.toString();
    }
}

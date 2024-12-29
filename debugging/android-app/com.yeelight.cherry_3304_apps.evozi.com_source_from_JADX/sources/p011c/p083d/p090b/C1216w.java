package p011c.p083d.p090b;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p011c.p083d.p090b.C1203t;

/* renamed from: c.d.b.w */
public final class C1216w {

    /* renamed from: s */
    private static final long f2103s = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a */
    int f2104a;

    /* renamed from: b */
    long f2105b;

    /* renamed from: c */
    int f2106c;

    /* renamed from: d */
    public final Uri f2107d;

    /* renamed from: e */
    public final int f2108e;

    /* renamed from: f */
    public final String f2109f;

    /* renamed from: g */
    public final List<C1167c0> f2110g;

    /* renamed from: h */
    public final int f2111h;

    /* renamed from: i */
    public final int f2112i;

    /* renamed from: j */
    public final boolean f2113j;

    /* renamed from: k */
    public final boolean f2114k;

    /* renamed from: l */
    public final boolean f2115l;

    /* renamed from: m */
    public final float f2116m;

    /* renamed from: n */
    public final float f2117n;

    /* renamed from: o */
    public final float f2118o;

    /* renamed from: p */
    public final boolean f2119p;

    /* renamed from: q */
    public final Bitmap.Config f2120q;

    /* renamed from: r */
    public final C1203t.C1210f f2121r;

    /* renamed from: c.d.b.w$b */
    public static final class C1218b {

        /* renamed from: a */
        private Uri f2122a;

        /* renamed from: b */
        private int f2123b;

        /* renamed from: c */
        private String f2124c;

        /* renamed from: d */
        private int f2125d;

        /* renamed from: e */
        private int f2126e;

        /* renamed from: f */
        private boolean f2127f;

        /* renamed from: g */
        private boolean f2128g;

        /* renamed from: h */
        private boolean f2129h;

        /* renamed from: i */
        private float f2130i;

        /* renamed from: j */
        private float f2131j;

        /* renamed from: k */
        private float f2132k;

        /* renamed from: l */
        private boolean f2133l;

        /* renamed from: m */
        private List<C1167c0> f2134m;

        /* renamed from: n */
        private Bitmap.Config f2135n;

        /* renamed from: o */
        private C1203t.C1210f f2136o;

        C1218b(Uri uri, int i, Bitmap.Config config) {
            this.f2122a = uri;
            this.f2123b = i;
            this.f2135n = config;
        }

        /* renamed from: a */
        public C1216w mo10030a() {
            if (this.f2128g && this.f2127f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            } else if (this.f2127f && this.f2125d == 0 && this.f2126e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            } else if (this.f2128g && this.f2125d == 0 && this.f2126e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            } else {
                if (this.f2136o == null) {
                    this.f2136o = C1203t.C1210f.NORMAL;
                }
                C1216w wVar = r2;
                C1216w wVar2 = new C1216w(this.f2122a, this.f2123b, this.f2124c, this.f2134m, this.f2125d, this.f2126e, this.f2127f, this.f2128g, this.f2129h, this.f2130i, this.f2131j, this.f2132k, this.f2133l, this.f2135n, this.f2136o);
                return wVar;
            }
        }

        /* renamed from: b */
        public C1218b mo10031b() {
            if (!this.f2127f) {
                this.f2128g = true;
                return this;
            }
            throw new IllegalStateException("Center inside can not be used after calling centerCrop");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo10032c() {
            return (this.f2122a == null && this.f2123b == 0) ? false : true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo10033d() {
            return (this.f2125d == 0 && this.f2126e == 0) ? false : true;
        }

        /* renamed from: e */
        public C1218b mo10034e(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            } else if (i2 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            } else if (i2 == 0 && i == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            } else {
                this.f2125d = i;
                this.f2126e = i2;
                return this;
            }
        }
    }

    private C1216w(Uri uri, int i, String str, List<C1167c0> list, int i2, int i3, boolean z, boolean z2, boolean z3, float f, float f2, float f3, boolean z4, Bitmap.Config config, C1203t.C1210f fVar) {
        this.f2107d = uri;
        this.f2108e = i;
        this.f2109f = str;
        this.f2110g = list == null ? null : Collections.unmodifiableList(list);
        this.f2111h = i2;
        this.f2112i = i3;
        this.f2113j = z;
        this.f2114k = z2;
        this.f2115l = z3;
        this.f2116m = f;
        this.f2117n = f2;
        this.f2118o = f3;
        this.f2119p = z4;
        this.f2120q = config;
        this.f2121r = fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo10022a() {
        Uri uri = this.f2107d;
        return uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(this.f2108e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo10023b() {
        return this.f2110g != null;
    }

    /* renamed from: c */
    public boolean mo10024c() {
        return (this.f2111h == 0 && this.f2112i == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo10025d() {
        StringBuilder sb;
        long nanoTime = System.nanoTime() - this.f2105b;
        if (nanoTime > f2103s) {
            sb.append(mo10028g());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toSeconds(nanoTime));
            sb.append('s');
        } else {
            sb = new StringBuilder();
            sb.append(mo10028g());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toMillis(nanoTime));
            sb.append("ms");
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo10026e() {
        return mo10024c() || this.f2116m != 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo10027f() {
        return mo10026e() || mo10023b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo10028g() {
        return "[R" + this.f2104a + ']';
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i = this.f2108e;
        if (i > 0) {
            sb.append(i);
        } else {
            sb.append(this.f2107d);
        }
        List<C1167c0> list = this.f2110g;
        if (list != null && !list.isEmpty()) {
            for (C1167c0 b : this.f2110g) {
                sb.append(' ');
                sb.append(b.mo9941b());
            }
        }
        if (this.f2109f != null) {
            sb.append(" stableKey(");
            sb.append(this.f2109f);
            sb.append(')');
        }
        if (this.f2111h > 0) {
            sb.append(" resize(");
            sb.append(this.f2111h);
            sb.append(',');
            sb.append(this.f2112i);
            sb.append(')');
        }
        if (this.f2113j) {
            sb.append(" centerCrop");
        }
        if (this.f2114k) {
            sb.append(" centerInside");
        }
        if (this.f2116m != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.f2116m);
            if (this.f2119p) {
                sb.append(" @ ");
                sb.append(this.f2117n);
                sb.append(',');
                sb.append(this.f2118o);
            }
            sb.append(')');
        }
        if (this.f2120q != null) {
            sb.append(' ');
            sb.append(this.f2120q);
        }
        sb.append('}');
        return sb.toString();
    }
}

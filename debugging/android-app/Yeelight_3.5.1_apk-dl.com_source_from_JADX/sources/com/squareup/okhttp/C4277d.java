package com.squareup.okhttp;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.concurrent.TimeUnit;

/* renamed from: com.squareup.okhttp.d */
public final class C4277d {

    /* renamed from: m */
    public static final C4277d f6918m = new C4279b().mo27849e().mo27846b(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, TimeUnit.SECONDS).mo27845a();

    /* renamed from: a */
    private final boolean f6919a;

    /* renamed from: b */
    private final boolean f6920b;

    /* renamed from: c */
    private final int f6921c;

    /* renamed from: d */
    private final int f6922d;

    /* renamed from: e */
    private final boolean f6923e;

    /* renamed from: f */
    private final boolean f6924f;

    /* renamed from: g */
    private final boolean f6925g;

    /* renamed from: h */
    private final int f6926h;

    /* renamed from: i */
    private final int f6927i;

    /* renamed from: j */
    private final boolean f6928j;

    /* renamed from: k */
    private final boolean f6929k;

    /* renamed from: l */
    String f6930l;

    /* renamed from: com.squareup.okhttp.d$b */
    public static final class C4279b {

        /* renamed from: a */
        boolean f6931a;

        /* renamed from: b */
        boolean f6932b;

        /* renamed from: c */
        int f6933c = -1;

        /* renamed from: d */
        int f6934d = -1;

        /* renamed from: e */
        int f6935e = -1;

        /* renamed from: f */
        boolean f6936f;

        /* renamed from: g */
        boolean f6937g;

        /* renamed from: a */
        public C4277d mo27845a() {
            return new C4277d(this);
        }

        /* renamed from: b */
        public C4279b mo27846b(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds((long) i);
                this.f6934d = seconds > 2147483647L ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i);
        }

        /* renamed from: c */
        public C4279b mo27847c() {
            this.f6931a = true;
            return this;
        }

        /* renamed from: d */
        public C4279b mo27848d() {
            this.f6932b = true;
            return this;
        }

        /* renamed from: e */
        public C4279b mo27849e() {
            this.f6936f = true;
            return this;
        }
    }

    static {
        new C4279b().mo27847c().mo27845a();
    }

    private C4277d(C4279b bVar) {
        this.f6919a = bVar.f6931a;
        this.f6920b = bVar.f6932b;
        this.f6921c = bVar.f6933c;
        this.f6922d = -1;
        this.f6923e = false;
        this.f6924f = false;
        this.f6925g = false;
        this.f6926h = bVar.f6934d;
        this.f6927i = bVar.f6935e;
        this.f6928j = bVar.f6936f;
        this.f6929k = bVar.f6937g;
    }

    private C4277d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, String str) {
        this.f6919a = z;
        this.f6920b = z2;
        this.f6921c = i;
        this.f6922d = i2;
        this.f6923e = z3;
        this.f6924f = z4;
        this.f6925g = z5;
        this.f6926h = i3;
        this.f6927i = i4;
        this.f6928j = z6;
        this.f6929k = z7;
        this.f6930l = str;
    }

    /* renamed from: a */
    private String m11873a() {
        StringBuilder sb = new StringBuilder();
        if (this.f6919a) {
            sb.append("no-cache, ");
        }
        if (this.f6920b) {
            sb.append("no-store, ");
        }
        if (this.f6921c != -1) {
            sb.append("max-age=");
            sb.append(this.f6921c);
            sb.append(", ");
        }
        if (this.f6922d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f6922d);
            sb.append(", ");
        }
        if (this.f6923e) {
            sb.append("private, ");
        }
        if (this.f6924f) {
            sb.append("public, ");
        }
        if (this.f6925g) {
            sb.append("must-revalidate, ");
        }
        if (this.f6926h != -1) {
            sb.append("max-stale=");
            sb.append(this.f6926h);
            sb.append(", ");
        }
        if (this.f6927i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f6927i);
            sb.append(", ");
        }
        if (this.f6928j) {
            sb.append("only-if-cached, ");
        }
        if (this.f6929k) {
            sb.append("no-transform, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.squareup.okhttp.C4277d m11874k(com.squareup.okhttp.C4299p r21) {
        /*
            r0 = r21
            int r1 = r21.mo27935g()
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
        L_0x0018:
            if (r6 >= r1) goto L_0x0131
            java.lang.String r2 = r0.mo27933d(r6)
            java.lang.String r4 = r0.mo27936h(r6)
            java.lang.String r3 = "Cache-Control"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x002f
            if (r8 == 0) goto L_0x002d
            goto L_0x0037
        L_0x002d:
            r8 = r4
            goto L_0x0038
        L_0x002f:
            java.lang.String r3 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x012a
        L_0x0037:
            r7 = 0
        L_0x0038:
            r2 = 0
        L_0x0039:
            int r3 = r4.length()
            if (r2 >= r3) goto L_0x012a
            java.lang.String r3 = "=,;"
            int r3 = p123a3.C3938e.m11280b(r4, r2, r3)
            java.lang.String r2 = r4.substring(r2, r3)
            java.lang.String r2 = r2.trim()
            int r5 = r4.length()
            if (r3 == r5) goto L_0x0097
            char r5 = r4.charAt(r3)
            r0 = 44
            if (r5 == r0) goto L_0x0097
            char r0 = r4.charAt(r3)
            r5 = 59
            if (r0 != r5) goto L_0x0064
            goto L_0x0097
        L_0x0064:
            int r3 = r3 + 1
            int r0 = p123a3.C3938e.m11281c(r4, r3)
            int r3 = r4.length()
            if (r0 >= r3) goto L_0x0087
            char r3 = r4.charAt(r0)
            r5 = 34
            if (r3 != r5) goto L_0x0087
            int r0 = r0 + 1
            java.lang.String r3 = "\""
            int r3 = p123a3.C3938e.m11280b(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            r5 = 1
            int r3 = r3 + r5
            goto L_0x009b
        L_0x0087:
            r5 = 1
            java.lang.String r3 = ",;"
            int r3 = p123a3.C3938e.m11280b(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            java.lang.String r0 = r0.trim()
            goto L_0x009b
        L_0x0097:
            r5 = 1
            int r3 = r3 + 1
            r0 = 0
        L_0x009b:
            java.lang.String r5 = "no-cache"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00a7
            r5 = -1
            r9 = 1
            goto L_0x0125
        L_0x00a7:
            java.lang.String r5 = "no-store"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00b3
            r5 = -1
            r10 = 1
            goto L_0x0125
        L_0x00b3:
            java.lang.String r5 = "max-age"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00c1
            r5 = -1
            int r11 = p123a3.C3938e.m11279a(r0, r5)
            goto L_0x0125
        L_0x00c1:
            java.lang.String r5 = "s-maxage"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00cf
            r5 = -1
            int r12 = p123a3.C3938e.m11279a(r0, r5)
            goto L_0x0125
        L_0x00cf:
            java.lang.String r5 = "private"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00da
            r5 = -1
            r13 = 1
            goto L_0x0125
        L_0x00da:
            java.lang.String r5 = "public"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00e5
            r5 = -1
            r14 = 1
            goto L_0x0125
        L_0x00e5:
            java.lang.String r5 = "must-revalidate"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00f0
            r5 = -1
            r15 = 1
            goto L_0x0125
        L_0x00f0:
            java.lang.String r5 = "max-stale"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0101
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r16 = p123a3.C3938e.m11279a(r0, r2)
            r5 = -1
            goto L_0x0125
        L_0x0101:
            java.lang.String r5 = "min-fresh"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x010f
            r5 = -1
            int r17 = p123a3.C3938e.m11279a(r0, r5)
            goto L_0x0125
        L_0x010f:
            r5 = -1
            java.lang.String r0 = "only-if-cached"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x011b
            r18 = 1
            goto L_0x0125
        L_0x011b:
            java.lang.String r0 = "no-transform"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0125
            r19 = 1
        L_0x0125:
            r0 = r21
            r2 = r3
            goto L_0x0039
        L_0x012a:
            r5 = -1
            int r6 = r6 + 1
            r0 = r21
            goto L_0x0018
        L_0x0131:
            if (r7 != 0) goto L_0x0136
            r20 = 0
            goto L_0x0138
        L_0x0136:
            r20 = r8
        L_0x0138:
            com.squareup.okhttp.d r0 = new com.squareup.okhttp.d
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.C4277d.m11874k(com.squareup.okhttp.p):com.squareup.okhttp.d");
    }

    /* renamed from: b */
    public boolean mo27835b() {
        return this.f6923e;
    }

    /* renamed from: c */
    public boolean mo27836c() {
        return this.f6924f;
    }

    /* renamed from: d */
    public int mo27837d() {
        return this.f6921c;
    }

    /* renamed from: e */
    public int mo27838e() {
        return this.f6926h;
    }

    /* renamed from: f */
    public int mo27839f() {
        return this.f6927i;
    }

    /* renamed from: g */
    public boolean mo27840g() {
        return this.f6925g;
    }

    /* renamed from: h */
    public boolean mo27841h() {
        return this.f6919a;
    }

    /* renamed from: i */
    public boolean mo27842i() {
        return this.f6920b;
    }

    /* renamed from: j */
    public boolean mo27843j() {
        return this.f6928j;
    }

    public String toString() {
        String str = this.f6930l;
        if (str != null) {
            return str;
        }
        String a = m11873a();
        this.f6930l = a;
        return a;
    }
}

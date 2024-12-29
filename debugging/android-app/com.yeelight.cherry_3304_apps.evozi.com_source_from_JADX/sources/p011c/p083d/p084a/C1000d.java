package p011c.p083d.p084a;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.concurrent.TimeUnit;

/* renamed from: c.d.a.d */
public final class C1000d {

    /* renamed from: m */
    public static final C1000d f1256m;

    /* renamed from: a */
    private final boolean f1257a;

    /* renamed from: b */
    private final boolean f1258b;

    /* renamed from: c */
    private final int f1259c;

    /* renamed from: d */
    private final int f1260d;

    /* renamed from: e */
    private final boolean f1261e;

    /* renamed from: f */
    private final boolean f1262f;

    /* renamed from: g */
    private final boolean f1263g;

    /* renamed from: h */
    private final int f1264h;

    /* renamed from: i */
    private final int f1265i;

    /* renamed from: j */
    private final boolean f1266j;

    /* renamed from: k */
    private final boolean f1267k;

    /* renamed from: l */
    String f1268l;

    /* renamed from: c.d.a.d$b */
    public static final class C1002b {

        /* renamed from: a */
        boolean f1269a;

        /* renamed from: b */
        boolean f1270b;

        /* renamed from: c */
        int f1271c = -1;

        /* renamed from: d */
        int f1272d = -1;

        /* renamed from: e */
        int f1273e = -1;

        /* renamed from: f */
        boolean f1274f;

        /* renamed from: g */
        boolean f1275g;

        /* renamed from: a */
        public C1000d mo9424a() {
            return new C1000d(this);
        }

        /* renamed from: b */
        public C1002b mo9425b(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds((long) i);
                this.f1272d = seconds > 2147483647L ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i);
        }

        /* renamed from: c */
        public C1002b mo9426c() {
            this.f1269a = true;
            return this;
        }

        /* renamed from: d */
        public C1002b mo9427d() {
            this.f1270b = true;
            return this;
        }

        /* renamed from: e */
        public C1002b mo9428e() {
            this.f1274f = true;
            return this;
        }
    }

    static {
        C1002b bVar = new C1002b();
        bVar.mo9426c();
        bVar.mo9424a();
        C1002b bVar2 = new C1002b();
        bVar2.mo9428e();
        bVar2.mo9425b(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, TimeUnit.SECONDS);
        f1256m = bVar2.mo9424a();
    }

    private C1000d(C1002b bVar) {
        this.f1257a = bVar.f1269a;
        this.f1258b = bVar.f1270b;
        this.f1259c = bVar.f1271c;
        this.f1260d = -1;
        this.f1261e = false;
        this.f1262f = false;
        this.f1263g = false;
        this.f1264h = bVar.f1272d;
        this.f1265i = bVar.f1273e;
        this.f1266j = bVar.f1274f;
        this.f1267k = bVar.f1275g;
    }

    private C1000d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, String str) {
        this.f1257a = z;
        this.f1258b = z2;
        this.f1259c = i;
        this.f1260d = i2;
        this.f1261e = z3;
        this.f1262f = z4;
        this.f1263g = z5;
        this.f1264h = i3;
        this.f1265i = i4;
        this.f1266j = z6;
        this.f1267k = z7;
        this.f1268l = str;
    }

    /* renamed from: a */
    private String m1956a() {
        StringBuilder sb = new StringBuilder();
        if (this.f1257a) {
            sb.append("no-cache, ");
        }
        if (this.f1258b) {
            sb.append("no-store, ");
        }
        if (this.f1259c != -1) {
            sb.append("max-age=");
            sb.append(this.f1259c);
            sb.append(", ");
        }
        if (this.f1260d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f1260d);
            sb.append(", ");
        }
        if (this.f1261e) {
            sb.append("private, ");
        }
        if (this.f1262f) {
            sb.append("public, ");
        }
        if (this.f1263g) {
            sb.append("must-revalidate, ");
        }
        if (this.f1264h != -1) {
            sb.append("max-stale=");
            sb.append(this.f1264h);
            sb.append(", ");
        }
        if (this.f1265i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f1265i);
            sb.append(", ");
        }
        if (this.f1266j) {
            sb.append("only-if-cached, ");
        }
        if (this.f1267k) {
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
    public static p011c.p083d.p084a.C1000d m1957k(p011c.p083d.p084a.C1130q r21) {
        /*
            r0 = r21
            int r1 = r21.mo9748g()
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
            java.lang.String r2 = r0.mo9746d(r6)
            java.lang.String r4 = r0.mo9749h(r6)
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
            int r3 = p011c.p083d.p084a.p085d0.p087n.C1079e.m2422b(r4, r2, r3)
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
            int r0 = p011c.p083d.p084a.p085d0.p087n.C1079e.m2423c(r4, r3)
            int r3 = r4.length()
            if (r0 >= r3) goto L_0x0087
            char r3 = r4.charAt(r0)
            r5 = 34
            if (r3 != r5) goto L_0x0087
            int r0 = r0 + 1
            java.lang.String r3 = "\""
            int r3 = p011c.p083d.p084a.p085d0.p087n.C1079e.m2422b(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            r5 = 1
            int r3 = r3 + r5
            goto L_0x009b
        L_0x0087:
            r5 = 1
            java.lang.String r3 = ",;"
            int r3 = p011c.p083d.p084a.p085d0.p087n.C1079e.m2422b(r4, r0, r3)
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
            int r11 = p011c.p083d.p084a.p085d0.p087n.C1079e.m2421a(r0, r5)
            goto L_0x0125
        L_0x00c1:
            java.lang.String r5 = "s-maxage"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00cf
            r5 = -1
            int r12 = p011c.p083d.p084a.p085d0.p087n.C1079e.m2421a(r0, r5)
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
            int r16 = p011c.p083d.p084a.p085d0.p087n.C1079e.m2421a(r0, r2)
            r5 = -1
            goto L_0x0125
        L_0x0101:
            java.lang.String r5 = "min-fresh"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x010f
            r5 = -1
            int r17 = p011c.p083d.p084a.p085d0.p087n.C1079e.m2421a(r0, r5)
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
            c.d.a.d r0 = new c.d.a.d
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p084a.C1000d.m1957k(c.d.a.q):c.d.a.d");
    }

    /* renamed from: b */
    public boolean mo9414b() {
        return this.f1261e;
    }

    /* renamed from: c */
    public boolean mo9415c() {
        return this.f1262f;
    }

    /* renamed from: d */
    public int mo9416d() {
        return this.f1259c;
    }

    /* renamed from: e */
    public int mo9417e() {
        return this.f1264h;
    }

    /* renamed from: f */
    public int mo9418f() {
        return this.f1265i;
    }

    /* renamed from: g */
    public boolean mo9419g() {
        return this.f1263g;
    }

    /* renamed from: h */
    public boolean mo9420h() {
        return this.f1257a;
    }

    /* renamed from: i */
    public boolean mo9421i() {
        return this.f1258b;
    }

    /* renamed from: j */
    public boolean mo9422j() {
        return this.f1266j;
    }

    public String toString() {
        String str = this.f1268l;
        if (str != null) {
            return str;
        }
        String a = m1956a();
        this.f1268l = a;
        return a;
    }
}

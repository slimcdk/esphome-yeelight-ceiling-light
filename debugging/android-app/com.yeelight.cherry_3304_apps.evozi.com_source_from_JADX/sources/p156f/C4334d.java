package p156f;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* renamed from: f.d */
public final class C4334d {

    /* renamed from: a */
    private final boolean f7604a;

    /* renamed from: b */
    private final boolean f7605b;

    /* renamed from: c */
    private final int f7606c;

    /* renamed from: d */
    private final int f7607d;

    /* renamed from: e */
    private final boolean f7608e;

    /* renamed from: f */
    private final boolean f7609f;

    /* renamed from: g */
    private final boolean f7610g;

    /* renamed from: h */
    private final int f7611h;

    /* renamed from: i */
    private final int f7612i;

    /* renamed from: j */
    private final boolean f7613j;

    /* renamed from: k */
    private final boolean f7614k;

    /* renamed from: l */
    private final boolean f7615l;
    @Nullable

    /* renamed from: m */
    String f7616m;

    /* renamed from: f.d$a */
    public static final class C4335a {

        /* renamed from: a */
        boolean f7617a;

        /* renamed from: b */
        boolean f7618b;

        /* renamed from: c */
        int f7619c = -1;

        /* renamed from: d */
        int f7620d = -1;

        /* renamed from: e */
        int f7621e = -1;

        /* renamed from: f */
        boolean f7622f;

        /* renamed from: g */
        boolean f7623g;

        /* renamed from: h */
        boolean f7624h;

        /* renamed from: a */
        public C4334d mo23895a() {
            return new C4334d(this);
        }

        /* renamed from: b */
        public C4335a mo23896b(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds((long) i);
                this.f7620d = seconds > 2147483647L ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i);
        }

        /* renamed from: c */
        public C4335a mo23897c() {
            this.f7617a = true;
            return this;
        }

        /* renamed from: d */
        public C4335a mo23898d() {
            this.f7622f = true;
            return this;
        }
    }

    static {
        C4335a aVar = new C4335a();
        aVar.mo23897c();
        aVar.mo23895a();
        C4335a aVar2 = new C4335a();
        aVar2.mo23898d();
        aVar2.mo23896b(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, TimeUnit.SECONDS);
        aVar2.mo23895a();
    }

    C4334d(C4335a aVar) {
        this.f7604a = aVar.f7617a;
        this.f7605b = aVar.f7618b;
        this.f7606c = aVar.f7619c;
        this.f7607d = -1;
        this.f7608e = false;
        this.f7609f = false;
        this.f7610g = false;
        this.f7611h = aVar.f7620d;
        this.f7612i = aVar.f7621e;
        this.f7613j = aVar.f7622f;
        this.f7614k = aVar.f7623g;
        this.f7615l = aVar.f7624h;
    }

    private C4334d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, @Nullable String str) {
        this.f7604a = z;
        this.f7605b = z2;
        this.f7606c = i;
        this.f7607d = i2;
        this.f7608e = z3;
        this.f7609f = z4;
        this.f7610g = z5;
        this.f7611h = i3;
        this.f7612i = i4;
        this.f7613j = z6;
        this.f7614k = z7;
        this.f7615l = z8;
        this.f7616m = str;
    }

    /* renamed from: a */
    private String m12290a() {
        StringBuilder sb = new StringBuilder();
        if (this.f7604a) {
            sb.append("no-cache, ");
        }
        if (this.f7605b) {
            sb.append("no-store, ");
        }
        if (this.f7606c != -1) {
            sb.append("max-age=");
            sb.append(this.f7606c);
            sb.append(", ");
        }
        if (this.f7607d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f7607d);
            sb.append(", ");
        }
        if (this.f7608e) {
            sb.append("private, ");
        }
        if (this.f7609f) {
            sb.append("public, ");
        }
        if (this.f7610g) {
            sb.append("must-revalidate, ");
        }
        if (this.f7611h != -1) {
            sb.append("max-stale=");
            sb.append(this.f7611h);
            sb.append(", ");
        }
        if (this.f7612i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f7612i);
            sb.append(", ");
        }
        if (this.f7613j) {
            sb.append("only-if-cached, ");
        }
        if (this.f7614k) {
            sb.append("no-transform, ");
        }
        if (this.f7615l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p156f.C4334d m12291k(p156f.C4388s r22) {
        /*
            r0 = r22
            int r1 = r22.mo24089h()
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
            r20 = 0
        L_0x001a:
            if (r6 >= r1) goto L_0x013f
            java.lang.String r2 = r0.mo24086e(r6)
            java.lang.String r4 = r0.mo24091i(r6)
            java.lang.String r3 = "Cache-Control"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0031
            if (r8 == 0) goto L_0x002f
            goto L_0x0039
        L_0x002f:
            r8 = r4
            goto L_0x003a
        L_0x0031:
            java.lang.String r3 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x0138
        L_0x0039:
            r7 = 0
        L_0x003a:
            r2 = 0
        L_0x003b:
            int r3 = r4.length()
            if (r2 >= r3) goto L_0x0138
            java.lang.String r3 = "=,;"
            int r3 = p156f.p157g0.p160g.C10771e.m26692h(r4, r2, r3)
            java.lang.String r2 = r4.substring(r2, r3)
            java.lang.String r2 = r2.trim()
            int r5 = r4.length()
            if (r3 == r5) goto L_0x0099
            char r5 = r4.charAt(r3)
            r0 = 44
            if (r5 == r0) goto L_0x0099
            char r0 = r4.charAt(r3)
            r5 = 59
            if (r0 != r5) goto L_0x0066
            goto L_0x0099
        L_0x0066:
            int r3 = r3 + 1
            int r0 = p156f.p157g0.p160g.C10771e.m26693i(r4, r3)
            int r3 = r4.length()
            if (r0 >= r3) goto L_0x0089
            char r3 = r4.charAt(r0)
            r5 = 34
            if (r3 != r5) goto L_0x0089
            int r0 = r0 + 1
            java.lang.String r3 = "\""
            int r3 = p156f.p157g0.p160g.C10771e.m26692h(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            r5 = 1
            int r3 = r3 + r5
            goto L_0x009d
        L_0x0089:
            r5 = 1
            java.lang.String r3 = ",;"
            int r3 = p156f.p157g0.p160g.C10771e.m26692h(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            java.lang.String r0 = r0.trim()
            goto L_0x009d
        L_0x0099:
            r5 = 1
            int r3 = r3 + 1
            r0 = 0
        L_0x009d:
            java.lang.String r5 = "no-cache"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00a9
            r5 = -1
            r9 = 1
            goto L_0x0133
        L_0x00a9:
            java.lang.String r5 = "no-store"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00b5
            r5 = -1
            r10 = 1
            goto L_0x0133
        L_0x00b5:
            java.lang.String r5 = "max-age"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00c4
            r5 = -1
            int r11 = p156f.p157g0.p160g.C10771e.m26690f(r0, r5)
            goto L_0x0133
        L_0x00c4:
            java.lang.String r5 = "s-maxage"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00d2
            r5 = -1
            int r12 = p156f.p157g0.p160g.C10771e.m26690f(r0, r5)
            goto L_0x0133
        L_0x00d2:
            java.lang.String r5 = "private"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00dd
            r5 = -1
            r13 = 1
            goto L_0x0133
        L_0x00dd:
            java.lang.String r5 = "public"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00e8
            r5 = -1
            r14 = 1
            goto L_0x0133
        L_0x00e8:
            java.lang.String r5 = "must-revalidate"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00f3
            r5 = -1
            r15 = 1
            goto L_0x0133
        L_0x00f3:
            java.lang.String r5 = "max-stale"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0104
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r16 = p156f.p157g0.p160g.C10771e.m26690f(r0, r2)
            r5 = -1
            goto L_0x0133
        L_0x0104:
            java.lang.String r5 = "min-fresh"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0112
            r5 = -1
            int r17 = p156f.p157g0.p160g.C10771e.m26690f(r0, r5)
            goto L_0x0133
        L_0x0112:
            r5 = -1
            java.lang.String r0 = "only-if-cached"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x011e
            r18 = 1
            goto L_0x0133
        L_0x011e:
            java.lang.String r0 = "no-transform"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0129
            r19 = 1
            goto L_0x0133
        L_0x0129:
            java.lang.String r0 = "immutable"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0133
            r20 = 1
        L_0x0133:
            r0 = r22
            r2 = r3
            goto L_0x003b
        L_0x0138:
            r5 = -1
            int r6 = r6 + 1
            r0 = r22
            goto L_0x001a
        L_0x013f:
            if (r7 != 0) goto L_0x0144
            r21 = 0
            goto L_0x0146
        L_0x0144:
            r21 = r8
        L_0x0146:
            f.d r0 = new f.d
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p156f.C4334d.m12291k(f.s):f.d");
    }

    /* renamed from: b */
    public boolean mo23885b() {
        return this.f7608e;
    }

    /* renamed from: c */
    public boolean mo23886c() {
        return this.f7609f;
    }

    /* renamed from: d */
    public int mo23887d() {
        return this.f7606c;
    }

    /* renamed from: e */
    public int mo23888e() {
        return this.f7611h;
    }

    /* renamed from: f */
    public int mo23889f() {
        return this.f7612i;
    }

    /* renamed from: g */
    public boolean mo23890g() {
        return this.f7610g;
    }

    /* renamed from: h */
    public boolean mo23891h() {
        return this.f7604a;
    }

    /* renamed from: i */
    public boolean mo23892i() {
        return this.f7605b;
    }

    /* renamed from: j */
    public boolean mo23893j() {
        return this.f7613j;
    }

    public String toString() {
        String str = this.f7616m;
        if (str != null) {
            return str;
        }
        String a = m12290a();
        this.f7616m = a;
        return a;
    }
}

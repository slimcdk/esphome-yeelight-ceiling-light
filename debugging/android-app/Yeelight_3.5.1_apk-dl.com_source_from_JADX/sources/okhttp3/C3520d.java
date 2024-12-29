package okhttp3;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* renamed from: okhttp3.d */
public final class C3520d {

    /* renamed from: a */
    private final boolean f5682a;

    /* renamed from: b */
    private final boolean f5683b;

    /* renamed from: c */
    private final int f5684c;

    /* renamed from: d */
    private final int f5685d;

    /* renamed from: e */
    private final boolean f5686e;

    /* renamed from: f */
    private final boolean f5687f;

    /* renamed from: g */
    private final boolean f5688g;

    /* renamed from: h */
    private final int f5689h;

    /* renamed from: i */
    private final int f5690i;

    /* renamed from: j */
    private final boolean f5691j;

    /* renamed from: k */
    private final boolean f5692k;

    /* renamed from: l */
    private final boolean f5693l;
    @Nullable

    /* renamed from: m */
    String f5694m;

    /* renamed from: okhttp3.d$a */
    public static final class C3521a {

        /* renamed from: a */
        boolean f5695a;

        /* renamed from: b */
        boolean f5696b;

        /* renamed from: c */
        int f5697c = -1;

        /* renamed from: d */
        int f5698d = -1;

        /* renamed from: e */
        int f5699e = -1;

        /* renamed from: f */
        boolean f5700f;

        /* renamed from: g */
        boolean f5701g;

        /* renamed from: h */
        boolean f5702h;

        /* renamed from: a */
        public C3520d mo24422a() {
            return new C3520d(this);
        }

        /* renamed from: b */
        public C3521a mo24423b(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds((long) i);
                this.f5698d = seconds > 2147483647L ? ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i);
        }

        /* renamed from: c */
        public C3521a mo24424c() {
            this.f5695a = true;
            return this;
        }

        /* renamed from: d */
        public C3521a mo24425d() {
            this.f5700f = true;
            return this;
        }
    }

    static {
        new C3521a().mo24424c().mo24422a();
        new C3521a().mo24425d().mo24423b(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, TimeUnit.SECONDS).mo24422a();
    }

    C3520d(C3521a aVar) {
        this.f5682a = aVar.f5695a;
        this.f5683b = aVar.f5696b;
        this.f5684c = aVar.f5697c;
        this.f5685d = -1;
        this.f5686e = false;
        this.f5687f = false;
        this.f5688g = false;
        this.f5689h = aVar.f5698d;
        this.f5690i = aVar.f5699e;
        this.f5691j = aVar.f5700f;
        this.f5692k = aVar.f5701g;
        this.f5693l = aVar.f5702h;
    }

    private C3520d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, @Nullable String str) {
        this.f5682a = z;
        this.f5683b = z2;
        this.f5684c = i;
        this.f5685d = i2;
        this.f5686e = z3;
        this.f5687f = z4;
        this.f5688g = z5;
        this.f5689h = i3;
        this.f5690i = i4;
        this.f5691j = z6;
        this.f5692k = z7;
        this.f5693l = z8;
        this.f5694m = str;
    }

    /* renamed from: a */
    private String m9650a() {
        StringBuilder sb = new StringBuilder();
        if (this.f5682a) {
            sb.append("no-cache, ");
        }
        if (this.f5683b) {
            sb.append("no-store, ");
        }
        if (this.f5684c != -1) {
            sb.append("max-age=");
            sb.append(this.f5684c);
            sb.append(", ");
        }
        if (this.f5685d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f5685d);
            sb.append(", ");
        }
        if (this.f5686e) {
            sb.append("private, ");
        }
        if (this.f5687f) {
            sb.append("public, ");
        }
        if (this.f5688g) {
            sb.append("must-revalidate, ");
        }
        if (this.f5689h != -1) {
            sb.append("max-stale=");
            sb.append(this.f5689h);
            sb.append(", ");
        }
        if (this.f5690i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f5690i);
            sb.append(", ");
        }
        if (this.f5691j) {
            sb.append("only-if-cached, ");
        }
        if (this.f5692k) {
            sb.append("no-transform, ");
        }
        if (this.f5693l) {
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
    public static okhttp3.C3520d m9651k(okhttp3.C3544s r22) {
        /*
            r0 = r22
            int r1 = r22.mo24548h()
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
            java.lang.String r2 = r0.mo24545e(r6)
            java.lang.String r4 = r0.mo24550i(r6)
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
            int r3 = p073n5.C9732e.m23362h(r4, r2, r3)
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
            int r0 = p073n5.C9732e.m23363i(r4, r3)
            int r3 = r4.length()
            if (r0 >= r3) goto L_0x0089
            char r3 = r4.charAt(r0)
            r5 = 34
            if (r3 != r5) goto L_0x0089
            int r0 = r0 + 1
            java.lang.String r3 = "\""
            int r3 = p073n5.C9732e.m23362h(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            r5 = 1
            int r3 = r3 + r5
            goto L_0x009d
        L_0x0089:
            r5 = 1
            java.lang.String r3 = ",;"
            int r3 = p073n5.C9732e.m23362h(r4, r0, r3)
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
            int r11 = p073n5.C9732e.m23360f(r0, r5)
            goto L_0x0133
        L_0x00c4:
            java.lang.String r5 = "s-maxage"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00d2
            r5 = -1
            int r12 = p073n5.C9732e.m23360f(r0, r5)
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
            int r16 = p073n5.C9732e.m23360f(r0, r2)
            r5 = -1
            goto L_0x0133
        L_0x0104:
            java.lang.String r5 = "min-fresh"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0112
            r5 = -1
            int r17 = p073n5.C9732e.m23360f(r0, r5)
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
            okhttp3.d r0 = new okhttp3.d
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C3520d.m9651k(okhttp3.s):okhttp3.d");
    }

    /* renamed from: b */
    public boolean mo24412b() {
        return this.f5686e;
    }

    /* renamed from: c */
    public boolean mo24413c() {
        return this.f5687f;
    }

    /* renamed from: d */
    public int mo24414d() {
        return this.f5684c;
    }

    /* renamed from: e */
    public int mo24415e() {
        return this.f5689h;
    }

    /* renamed from: f */
    public int mo24416f() {
        return this.f5690i;
    }

    /* renamed from: g */
    public boolean mo24417g() {
        return this.f5688g;
    }

    /* renamed from: h */
    public boolean mo24418h() {
        return this.f5682a;
    }

    /* renamed from: i */
    public boolean mo24419i() {
        return this.f5683b;
    }

    /* renamed from: j */
    public boolean mo24420j() {
        return this.f5691j;
    }

    public String toString() {
        String str = this.f5694m;
        if (str != null) {
            return str;
        }
        String a = m9650a();
        this.f5694m = a;
        return a;
    }
}

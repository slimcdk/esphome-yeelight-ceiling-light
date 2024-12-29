package p164h.p165b.p166a.p240h.p252w;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: h.b.a.h.w.e */
public class C11364e {

    /* renamed from: a */
    private Long f22545a;

    /* renamed from: b */
    private Long f22546b;

    /* renamed from: c */
    private Long f22547c;

    public C11364e(Long l, Long l2, Long l3) {
        this.f22545a = l;
        this.f22546b = l2;
        this.f22547c = l3;
    }

    /* renamed from: c */
    public static C11364e m29783c(String str) {
        return m29784d(str, (String) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p164h.p165b.p166a.p240h.p252w.C11364e m29784d(java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "bytes="
            if (r6 == 0) goto L_0x0006
            r1 = r6
            goto L_0x0007
        L_0x0006:
            r1 = r0
        L_0x0007:
            boolean r1 = r5.startsWith(r1)
            if (r1 == 0) goto L_0x007c
            if (r6 == 0) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            r6 = r0
        L_0x0011:
            int r6 = r6.length()
            java.lang.String r6 = r5.substring(r6)
            java.lang.String r0 = "[-/]"
            java.lang.String[] r6 = r6.split(r0)
            int r0 = r6.length
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x005d
            r3 = 2
            if (r0 == r3) goto L_0x0047
            r4 = 3
            if (r0 != r4) goto L_0x007c
            r0 = r6[r3]
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0047
            r0 = r6[r3]
            java.lang.String r4 = "*"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0047
            r0 = r6[r3]
            long r3 = java.lang.Long.parseLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            goto L_0x0048
        L_0x0047:
            r0 = r2
        L_0x0048:
            r3 = r6[r1]
            int r3 = r3.length()
            if (r3 == 0) goto L_0x005b
            r1 = r6[r1]
            long r3 = java.lang.Long.parseLong(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto L_0x005f
        L_0x005b:
            r1 = r2
            goto L_0x005f
        L_0x005d:
            r0 = r2
            r1 = r0
        L_0x005f:
            r3 = 0
            r4 = r6[r3]
            int r4 = r4.length()
            if (r4 == 0) goto L_0x0072
            r6 = r6[r3]
            long r2 = java.lang.Long.parseLong(r6)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
        L_0x0072:
            if (r2 != 0) goto L_0x0076
            if (r1 == 0) goto L_0x007c
        L_0x0076:
            h.b.a.h.w.e r5 = new h.b.a.h.w.e
            r5.<init>(r2, r1, r0)
            return r5
        L_0x007c:
            h.b.a.h.w.r r6 = new h.b.a.h.w.r
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Can't parse Bytes Range: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p165b.p166a.p240h.p252w.C11364e.m29784d(java.lang.String, java.lang.String):h.b.a.h.w.e");
    }

    /* renamed from: a */
    public String mo36057a() {
        return mo36058b(false, (String) null);
    }

    /* renamed from: b */
    public String mo36058b(boolean z, String str) {
        if (str == null) {
            str = "bytes=";
        }
        if (this.f22545a != null) {
            str = str + this.f22545a.toString();
        }
        String str2 = str + Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        if (this.f22546b != null) {
            str2 = str2 + this.f22546b.toString();
        }
        if (!z) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(MiotCloudImpl.COOKIE_PATH);
        Long l = this.f22547c;
        sb.append(l != null ? l.toString() : "*");
        return sb.toString();
    }
}

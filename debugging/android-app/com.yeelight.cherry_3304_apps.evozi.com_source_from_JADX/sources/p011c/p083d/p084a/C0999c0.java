package p011c.p083d.p084a;

/* renamed from: c.d.a.c0 */
public enum C0999c0 {
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    

    /* renamed from: a */
    final String f1255a;

    private C0999c0(String str) {
        this.f1255a = str;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p011c.p083d.p084a.C0999c0 m1955a(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -503070503: goto L_0x0029;
                case -503070502: goto L_0x001f;
                case 79201641: goto L_0x0015;
                case 79923350: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0033
        L_0x000b:
            java.lang.String r0 = "TLSv1"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 2
            goto L_0x0034
        L_0x0015:
            java.lang.String r0 = "SSLv3"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 3
            goto L_0x0034
        L_0x001f:
            java.lang.String r0 = "TLSv1.2"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 0
            goto L_0x0034
        L_0x0029:
            java.lang.String r0 = "TLSv1.1"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = -1
        L_0x0034:
            if (r0 == 0) goto L_0x005c
            if (r0 == r3) goto L_0x0059
            if (r0 == r2) goto L_0x0056
            if (r0 != r1) goto L_0x003f
            c.d.a.c0 r4 = SSL_3_0
            return r4
        L_0x003f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected TLS version: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L_0x0056:
            c.d.a.c0 r4 = TLS_1_0
            return r4
        L_0x0059:
            c.d.a.c0 r4 = TLS_1_1
            return r4
        L_0x005c:
            c.d.a.c0 r4 = TLS_1_2
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p083d.p084a.C0999c0.m1955a(java.lang.String):c.d.a.c0");
    }
}

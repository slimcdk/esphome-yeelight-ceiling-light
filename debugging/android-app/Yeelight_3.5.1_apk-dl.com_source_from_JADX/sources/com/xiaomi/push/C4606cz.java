package com.xiaomi.push;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.List;

/* renamed from: com.xiaomi.push.cz */
public abstract class C4606cz {

    /* renamed from: com.xiaomi.push.cz$a */
    public static class C4607a extends C4605cy {
        public C4607a() {
            super(1);
        }

        /* renamed from: a */
        public String mo28894a(Context context, String str, List<C4550bi> list) {
            URL url;
            if (list == null) {
                url = new URL(str);
            } else {
                Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                for (C4550bi next : list) {
                    buildUpon.appendQueryParameter(next.mo28774a(), next.mo28775b());
                }
                url = new URL(buildUpon.toString());
            }
            return C4551bj.m12992a(context, url);
        }
    }

    /* renamed from: a */
    static int m13262a(int i, int i2) {
        return (((i2 + 243) / 1448) * 132) + 1080 + i + i2;
    }

    /* renamed from: a */
    static int m13263a(int i, int i2, int i3) {
        return (((i2 + 200) / 1448) * 132) + 1011 + i2 + i + i3;
    }

    /* renamed from: a */
    private static int m13264a(C4605cy cyVar, String str, List<C4550bi> list, String str2) {
        if (cyVar.mo28893a() == 1) {
            return m13262a(str.length(), m13265a(str2));
        }
        if (cyVar.mo28893a() != 2) {
            return -1;
        }
        return m13263a(str.length(), m13266a(list), m13265a(str2));
    }

    /* renamed from: a */
    static int m13265a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    static int m13266a(List<C4550bi> list) {
        int i = 0;
        for (C4550bi next : list) {
            if (!TextUtils.isEmpty(next.mo28774a())) {
                i += next.mo28774a().length();
            }
            if (!TextUtils.isEmpty(next.mo28775b())) {
                i += next.mo28775b().length();
            }
        }
        return i * 2;
    }

    /* renamed from: a */
    public static String m13267a(Context context, String str, List<C4550bi> list) {
        return m13268a(context, str, list, new C4607a(), true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00aa A[SYNTHETIC, Splitter:B:50:0x00aa] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m13268a(android.content.Context r20, java.lang.String r21, java.util.List<com.xiaomi.push.C4550bi> r22, com.xiaomi.push.C4605cy r23, boolean r24) {
        /*
            r1 = r20
            r0 = r21
            r2 = r22
            r3 = r23
            boolean r4 = com.xiaomi.push.C4551bj.m13000b(r20)
            r5 = 0
            if (r4 == 0) goto L_0x00c7
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x00c3 }
            r4.<init>()     // Catch:{ MalformedURLException -> 0x00c3 }
            if (r24 == 0) goto L_0x0026
            com.xiaomi.push.cv r6 = com.xiaomi.push.C4600cv.mo28881a()     // Catch:{ MalformedURLException -> 0x00c3 }
            com.xiaomi.push.cr r6 = r6.mo28878a((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x00c3 }
            if (r6 == 0) goto L_0x0024
            java.util.ArrayList r4 = r6.mo28853a((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x00c3 }
        L_0x0024:
            r13 = r6
            goto L_0x0027
        L_0x0026:
            r13 = r5
        L_0x0027:
            boolean r6 = r4.contains(r0)     // Catch:{ MalformedURLException -> 0x00c3 }
            if (r6 != 0) goto L_0x0030
            r4.add(r0)     // Catch:{ MalformedURLException -> 0x00c3 }
        L_0x0030:
            java.util.Iterator r4 = r4.iterator()     // Catch:{ MalformedURLException -> 0x00c3 }
            r6 = r5
        L_0x0035:
            boolean r0 = r4.hasNext()     // Catch:{ MalformedURLException -> 0x00c3 }
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r0 = r4.next()     // Catch:{ MalformedURLException -> 0x00c3 }
            r14 = r0
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ MalformedURLException -> 0x00c3 }
            if (r2 == 0) goto L_0x004b
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x00c3 }
            r0.<init>(r2)     // Catch:{ MalformedURLException -> 0x00c3 }
            r15 = r0
            goto L_0x004c
        L_0x004b:
            r15 = r5
        L_0x004c:
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ MalformedURLException -> 0x00c3 }
            boolean r0 = r3.mo28894a((android.content.Context) r1, (java.lang.String) r14, (java.util.List<com.xiaomi.push.C4550bi>) r15)     // Catch:{ IOException -> 0x00a4 }
            if (r0 != 0) goto L_0x0058
            goto L_0x00c2
        L_0x0058:
            java.lang.String r12 = r3.mo28894a((android.content.Context) r1, (java.lang.String) r14, (java.util.List<com.xiaomi.push.C4550bi>) r15)     // Catch:{ IOException -> 0x00a4 }
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ IOException -> 0x009a }
            if (r0 != 0) goto L_0x007c
            if (r13 == 0) goto L_0x007a
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x0075 }
            long r8 = r6 - r16
            int r0 = m13264a(r3, r14, r15, r12)     // Catch:{ IOException -> 0x0075 }
            long r10 = (long) r0     // Catch:{ IOException -> 0x0075 }
            r6 = r13
            r7 = r14
            r6.mo28859a(r7, r8, r10)     // Catch:{ IOException -> 0x0075 }
            goto L_0x007a
        L_0x0075:
            r0 = move-exception
            r18 = r0
            r0 = r12
            goto L_0x00a8
        L_0x007a:
            r6 = r12
            goto L_0x00c2
        L_0x007c:
            if (r13 == 0) goto L_0x0095
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x009a }
            long r8 = r6 - r16
            int r0 = m13264a(r3, r14, r15, r12)     // Catch:{ IOException -> 0x009a }
            long r10 = (long) r0
            r0 = 0
            r6 = r13
            r7 = r14
            r18 = r12
            r12 = r0
            r6.mo28860a(r7, r8, r10, r12)     // Catch:{ IOException -> 0x0093 }
            goto L_0x0097
        L_0x0093:
            r0 = move-exception
            goto L_0x009d
        L_0x0095:
            r18 = r12
        L_0x0097:
            r6 = r18
            goto L_0x0035
        L_0x009a:
            r0 = move-exception
            r18 = r12
        L_0x009d:
            r19 = r18
            r18 = r0
            r0 = r19
            goto L_0x00a8
        L_0x00a4:
            r0 = move-exception
            r18 = r0
            r0 = r6
        L_0x00a8:
            if (r13 == 0) goto L_0x00bc
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ MalformedURLException -> 0x00c3 }
            long r8 = r6 - r16
            int r6 = m13264a(r3, r14, r15, r0)     // Catch:{ MalformedURLException -> 0x00c3 }
            long r10 = (long) r6     // Catch:{ MalformedURLException -> 0x00c3 }
            r6 = r13
            r7 = r14
            r12 = r18
            r6.mo28860a(r7, r8, r10, r12)     // Catch:{ MalformedURLException -> 0x00c3 }
        L_0x00bc:
            r18.printStackTrace()     // Catch:{ MalformedURLException -> 0x00c3 }
            r6 = r0
            goto L_0x0035
        L_0x00c2:
            return r6
        L_0x00c3:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00c7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4606cz.m13268a(android.content.Context, java.lang.String, java.util.List, com.xiaomi.push.cy, boolean):java.lang.String");
    }
}

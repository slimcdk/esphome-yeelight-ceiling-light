package p164h.p211a.p212a.p222f;

import p154d.p155b.p204f0.C10707a;
import p164h.p211a.p212a.p228h.C11126j;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.f.g */
public class C11029g {

    /* renamed from: e */
    private static final C11158c f21604e = C11156b.m29015a(C11029g.class);

    /* renamed from: a */
    private C10707a[] f21605a;

    /* renamed from: b */
    private C10707a[] f21606b;

    /* renamed from: c */
    Object f21607c;

    /* renamed from: d */
    int f21608d;

    /* renamed from: a */
    public void mo34894a(String str) {
        if (str != null) {
            String trim = str.trim();
            if (trim.length() != 0) {
                int q = C11126j.m28890q(this.f21607c);
                int i = this.f21608d;
                if (q > i) {
                    if (!trim.equals(C11126j.m28884j(this.f21607c, i))) {
                        while (true) {
                            int q2 = C11126j.m28890q(this.f21607c);
                            int i2 = this.f21608d;
                            if (q2 <= i2) {
                                break;
                            }
                            this.f21607c = C11126j.m28887m(this.f21607c, i2);
                        }
                    } else {
                        this.f21608d++;
                        return;
                    }
                }
                this.f21605a = null;
                this.f21606b = null;
                Object obj = this.f21607c;
                int i3 = this.f21608d;
                this.f21608d = i3 + 1;
                this.f21607c = C11126j.m28878a(obj, i3, trim);
            }
        }
    }

    /* renamed from: b */
    public C10707a[] mo34895b() {
        Object obj;
        C10707a[] aVarArr = this.f21605a;
        if (aVarArr != null) {
            return aVarArr;
        }
        if (this.f21606b == null || (obj = this.f21607c) == null || this.f21608d != C11126j.m28890q(obj)) {
            mo34896c();
        } else {
            this.f21605a = this.f21606b;
        }
        C10707a[] aVarArr2 = this.f21605a;
        this.f21606b = aVarArr2;
        return aVarArr2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v29, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v31, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v34, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v34, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v35, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v35, resolved type: java.lang.Object} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0173, code lost:
        r15 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0174, code lost:
        r17 = r17;
        r16 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0174, code lost:
        r17 = r17;
        r16 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0174, code lost:
        r17 = r17;
        r16 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0174, code lost:
        r17 = r17;
        r16 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        if (r11 != r8) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        r0 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        if (r12 == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        r17 = r6.substring(r14, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        r15 = r11;
        r17 = "";
        r16 = r6.substring(r14, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
        r15 = r11;
        r16 = r16;
        r17 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
        r3 = false;
        r17 = r17;
        r16 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        if (r11 == r8) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009c, code lost:
        if (r11 == r8) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00bc, code lost:
        if (r11 == r8) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00bf, code lost:
        if (r14 < 0) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c1, code lost:
        r16 = r6.substring(r14, r15 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c7, code lost:
        r12 = true;
        r14 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00cb, code lost:
        if (r14 < 0) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00cd, code lost:
        r17 = "";
        r16 = r6.substring(r14, r15 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d5, code lost:
        r3 = r0;
        r17 = r17;
        r16 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00dc, code lost:
        if (r11 == r8) goto L_0x00de;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34896c() {
        /*
            r20 = this;
            r1 = r20
            r2 = 0
            r1.f21606b = r2
            r1.f21605a = r2
        L_0x0007:
            java.lang.Object r0 = r1.f21607c
            int r0 = p164h.p211a.p212a.p228h.C11126j.m28890q(r0)
            int r3 = r1.f21608d
            if (r0 <= r3) goto L_0x001a
            java.lang.Object r0 = r1.f21607c
            java.lang.Object r0 = p164h.p211a.p212a.p228h.C11126j.m28887m(r0, r3)
            r1.f21607c = r0
            goto L_0x0007
        L_0x001a:
            r0 = r2
            r4 = 0
            r5 = 0
        L_0x001d:
            int r6 = r1.f21608d
            if (r4 >= r6) goto L_0x017f
            java.lang.Object r6 = r1.f21607c
            java.lang.Object r6 = p164h.p211a.p212a.p228h.C11126j.m28884j(r6, r4)
            java.lang.String r6 = (java.lang.String) r6
            int r7 = r6.length()
            int r8 = r7 + -1
            r16 = r2
            r17 = r16
            r10 = r5
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = -1
            r15 = -1
            r5 = r0
            r0 = 0
        L_0x003b:
            if (r11 >= r7) goto L_0x0178
            char r3 = r6.charAt(r11)
            r9 = 34
            java.lang.String r18 = ""
            r19 = 1
            if (r0 == 0) goto L_0x0070
            if (r13 == 0) goto L_0x004e
            r13 = 0
            goto L_0x0174
        L_0x004e:
            if (r3 == r9) goto L_0x0059
            r9 = 92
            if (r3 == r9) goto L_0x0056
            goto L_0x0174
        L_0x0056:
            r13 = 1
            goto L_0x0174
        L_0x0059:
            if (r11 != r8) goto L_0x006c
            int r0 = r11 + 1
            if (r12 == 0) goto L_0x0064
            java.lang.String r17 = r6.substring(r14, r0)
            goto L_0x006c
        L_0x0064:
            java.lang.String r16 = r6.substring(r14, r0)
            r15 = r11
            r17 = r18
            goto L_0x006d
        L_0x006c:
            r15 = r11
        L_0x006d:
            r3 = 0
            goto L_0x00e8
        L_0x0070:
            r9 = 9
            if (r12 == 0) goto L_0x00a7
            if (r3 == r9) goto L_0x0174
            r9 = 32
            if (r3 == r9) goto L_0x0174
            r9 = 34
            if (r3 == r9) goto L_0x0098
            r9 = 59
            if (r3 == r9) goto L_0x0088
            if (r14 >= 0) goto L_0x0085
            r14 = r11
        L_0x0085:
            if (r11 != r8) goto L_0x0173
            goto L_0x009e
        L_0x0088:
            if (r14 < 0) goto L_0x0093
            int r3 = r15 + 1
            java.lang.String r3 = r6.substring(r14, r3)
            r17 = r3
            goto L_0x0095
        L_0x0093:
            r17 = r18
        L_0x0095:
            r3 = r0
            r12 = 0
            goto L_0x00d6
        L_0x0098:
            if (r14 >= 0) goto L_0x009c
            r14 = r11
            r0 = 1
        L_0x009c:
            if (r11 != r8) goto L_0x0173
        L_0x009e:
            int r3 = r11 + 1
            java.lang.String r17 = r6.substring(r14, r3)
            r3 = r0
            r15 = r11
            goto L_0x00e8
        L_0x00a7:
            if (r3 == r9) goto L_0x0174
            r9 = 32
            if (r3 == r9) goto L_0x0174
            r9 = 34
            if (r3 == r9) goto L_0x00d8
            r9 = 59
            if (r3 == r9) goto L_0x00cb
            r9 = 61
            if (r3 == r9) goto L_0x00bf
            if (r14 >= 0) goto L_0x00bc
            r14 = r11
        L_0x00bc:
            if (r11 != r8) goto L_0x0173
            goto L_0x00de
        L_0x00bf:
            if (r14 < 0) goto L_0x00c7
            int r3 = r15 + 1
            java.lang.String r16 = r6.substring(r14, r3)
        L_0x00c7:
            r12 = 1
            r14 = -1
            goto L_0x0174
        L_0x00cb:
            if (r14 < 0) goto L_0x00d5
            int r3 = r15 + 1
            java.lang.String r16 = r6.substring(r14, r3)
            r17 = r18
        L_0x00d5:
            r3 = r0
        L_0x00d6:
            r14 = -1
            goto L_0x00e8
        L_0x00d8:
            if (r14 >= 0) goto L_0x00dc
            r14 = r11
            r0 = 1
        L_0x00dc:
            if (r11 != r8) goto L_0x0173
        L_0x00de:
            int r3 = r11 + 1
            java.lang.String r16 = r6.substring(r14, r3)
            r3 = r0
            r15 = r11
            r17 = r18
        L_0x00e8:
            if (r17 == 0) goto L_0x016e
            if (r16 == 0) goto L_0x016e
            java.lang.String r0 = p164h.p211a.p212a.p228h.C11132o.m28909d(r16)
            java.lang.String r9 = p164h.p211a.p212a.p228h.C11132o.m28909d(r17)
            r18 = r3
            java.lang.String r3 = "$"
            boolean r3 = r0.startsWith(r3)     // Catch:{ Exception -> 0x0161 }
            if (r3 == 0) goto L_0x014d
            java.util.Locale r3 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x0161 }
            java.lang.String r0 = r0.toLowerCase(r3)     // Catch:{ Exception -> 0x0161 }
            java.lang.String r3 = "$path"
            boolean r3 = r3.equals(r0)     // Catch:{ Exception -> 0x0161 }
            if (r3 == 0) goto L_0x0112
            if (r2 == 0) goto L_0x0167
            r2.mo33913f(r9)     // Catch:{ Exception -> 0x0161 }
            goto L_0x0167
        L_0x0112:
            java.lang.String r3 = "$domain"
            boolean r3 = r3.equals(r0)     // Catch:{ Exception -> 0x0161 }
            if (r3 == 0) goto L_0x0120
            if (r2 == 0) goto L_0x0167
            r2.mo33912e(r9)     // Catch:{ Exception -> 0x0161 }
            goto L_0x0167
        L_0x0120:
            java.lang.String r3 = "$port"
            boolean r3 = r3.equals(r0)     // Catch:{ Exception -> 0x0161 }
            if (r3 == 0) goto L_0x013f
            if (r2 == 0) goto L_0x0167
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0161 }
            r0.<init>()     // Catch:{ Exception -> 0x0161 }
            java.lang.String r3 = "$port="
            r0.append(r3)     // Catch:{ Exception -> 0x0161 }
            r0.append(r9)     // Catch:{ Exception -> 0x0161 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0161 }
            r2.mo33911d(r0)     // Catch:{ Exception -> 0x0161 }
            goto L_0x0167
        L_0x013f:
            java.lang.String r3 = "$version"
            boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x0161 }
            if (r0 == 0) goto L_0x0167
            int r0 = java.lang.Integer.parseInt(r9)     // Catch:{ Exception -> 0x0161 }
            r10 = r0
            goto L_0x0167
        L_0x014d:
            d.b.f0.a r3 = new d.b.f0.a     // Catch:{ Exception -> 0x0161 }
            r3.<init>(r0, r9)     // Catch:{ Exception -> 0x0161 }
            if (r10 <= 0) goto L_0x0157
            r3.mo33914j(r10)     // Catch:{ Exception -> 0x015e }
        L_0x0157:
            java.lang.Object r0 = p164h.p211a.p212a.p228h.C11126j.m28879b(r5, r3)     // Catch:{ Exception -> 0x015e }
            r5 = r0
            r2 = r3
            goto L_0x0167
        L_0x015e:
            r0 = move-exception
            r2 = r3
            goto L_0x0162
        L_0x0161:
            r0 = move-exception
        L_0x0162:
            h.a.a.h.y.c r3 = f21604e
            r3.mo35487c(r0)
        L_0x0167:
            r0 = r18
            r16 = 0
            r17 = 0
            goto L_0x0174
        L_0x016e:
            r18 = r3
            r0 = r18
            goto L_0x0174
        L_0x0173:
            r15 = r11
        L_0x0174:
            int r11 = r11 + 1
            goto L_0x003b
        L_0x0178:
            int r4 = r4 + 1
            r0 = r5
            r5 = r10
            r2 = 0
            goto L_0x001d
        L_0x017f:
            java.lang.Class<d.b.f0.a> r2 = p154d.p155b.p204f0.C10707a.class
            java.lang.Object r0 = p164h.p211a.p212a.p228h.C11126j.m28891r(r0, r2)
            d.b.f0.a[] r0 = (p154d.p155b.p204f0.C10707a[]) r0
            r1.f21605a = r0
            r1.f21606b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p222f.C11029g.mo34896c():void");
    }

    /* renamed from: d */
    public void mo34897d() {
        this.f21605a = null;
        this.f21608d = 0;
    }
}

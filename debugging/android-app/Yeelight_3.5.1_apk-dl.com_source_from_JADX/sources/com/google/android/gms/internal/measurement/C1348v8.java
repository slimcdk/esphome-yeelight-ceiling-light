package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.v8 */
final class C1348v8 extends C1408z8 {

    /* renamed from: c */
    private static final Class f1685c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ C1348v8(C1333u8 u8Var) {
        super((C1393y8) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13432a(Object obj, long j) {
        Object obj2;
        List list = (List) C1380xa.m3267k(obj, j);
        if (list instanceof C1318t8) {
            obj2 = ((C1318t8) list).mo13347a();
        } else if (!f1685c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C1303s9) || !(list instanceof C1254p8)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                C1254p8 p8Var = (C1254p8) list;
                if (p8Var.mo13072E()) {
                    p8Var.mo13071D();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        C1380xa.m3280x(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.android.gms.internal.measurement.s8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.google.android.gms.internal.measurement.s8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.google.android.gms.internal.measurement.s8} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13433b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.lang.Object r6 = com.google.android.gms.internal.measurement.C1380xa.m3267k(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = com.google.android.gms.internal.measurement.C1380xa.m3267k(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0039
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C1318t8
            if (r2 == 0) goto L_0x0020
            com.google.android.gms.internal.measurement.s8 r1 = new com.google.android.gms.internal.measurement.s8
            r1.<init>((int) r0)
            goto L_0x0035
        L_0x0020:
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C1303s9
            if (r2 == 0) goto L_0x0030
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C1254p8
            if (r2 == 0) goto L_0x0030
            com.google.android.gms.internal.measurement.p8 r1 = (com.google.android.gms.internal.measurement.C1254p8) r1
            com.google.android.gms.internal.measurement.p8 r0 = r1.mo12539s(r0)
            r1 = r0
            goto L_0x0035
        L_0x0030:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0035:
            com.google.android.gms.internal.measurement.C1380xa.m3280x(r5, r7, r1)
            goto L_0x008a
        L_0x0039:
            java.lang.Class r2 = f1685c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0057
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
        L_0x0052:
            com.google.android.gms.internal.measurement.C1380xa.m3280x(r5, r7, r2)
            r1 = r2
            goto L_0x008a
        L_0x0057:
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C1304sa
            if (r2 == 0) goto L_0x006f
            com.google.android.gms.internal.measurement.s8 r2 = new com.google.android.gms.internal.measurement.s8
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            com.google.android.gms.internal.measurement.sa r1 = (com.google.android.gms.internal.measurement.C1304sa) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            goto L_0x0052
        L_0x006f:
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C1303s9
            if (r2 == 0) goto L_0x008a
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.C1254p8
            if (r2 == 0) goto L_0x008a
            r2 = r1
            com.google.android.gms.internal.measurement.p8 r2 = (com.google.android.gms.internal.measurement.C1254p8) r2
            boolean r3 = r2.mo13072E()
            if (r3 != 0) goto L_0x008a
            int r1 = r1.size()
            int r1 = r1 + r0
            com.google.android.gms.internal.measurement.p8 r1 = r2.mo12539s(r1)
            goto L_0x0035
        L_0x008a:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L_0x0099
            if (r2 <= 0) goto L_0x0099
            r1.addAll(r6)
        L_0x0099:
            if (r0 > 0) goto L_0x009c
            goto L_0x009d
        L_0x009c:
            r6 = r1
        L_0x009d:
            com.google.android.gms.internal.measurement.C1380xa.m3280x(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1348v8.mo13433b(java.lang.Object, java.lang.Object, long):void");
    }
}

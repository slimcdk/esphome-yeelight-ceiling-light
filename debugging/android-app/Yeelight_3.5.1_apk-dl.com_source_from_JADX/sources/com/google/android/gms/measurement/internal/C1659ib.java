package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1122h4;

/* renamed from: com.google.android.gms.measurement.internal.ib */
final class C1659ib {

    /* renamed from: a */
    private C1122h4 f2171a;

    /* renamed from: b */
    private Long f2172b;

    /* renamed from: c */
    private long f2173c;

    /* renamed from: d */
    final /* synthetic */ C1556b f2174d;

    /* synthetic */ C1659ib(C1556b bVar, C1646hb hbVar) {
        this.f2174d = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fa, code lost:
        if (r14 == null) goto L_0x00ff;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01e2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C1122h4 mo14252a(java.lang.String r18, com.google.android.gms.internal.measurement.C1122h4 r19) {
        /*
            r17 = this;
            r1 = r17
            r3 = r18
            r8 = r19
            java.lang.String r0 = r19.mo12854F()
            java.util.List r9 = r19.mo12855G()
            com.google.android.gms.measurement.internal.b r2 = r1.f2174d
            com.google.android.gms.measurement.internal.ra r2 = r2.f2045b
            r2.mo14475f0()
            java.lang.String r2 = "_eid"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C1794ta.m4749o(r8, r2)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L_0x0233
            java.lang.String r5 = "_ep"
            boolean r5 = r0.equals(r5)
            r6 = 0
            if (r5 == 0) goto L_0x01e6
            com.google.android.gms.common.internal.C0917i.m1419j(r4)
            com.google.android.gms.measurement.internal.b r0 = r1.f2174d
            com.google.android.gms.measurement.internal.ra r0 = r0.f2045b
            r0.mo14475f0()
            java.lang.String r0 = "_en"
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C1794ta.m4749o(r8, r0)
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r5 = 0
            if (r0 == 0) goto L_0x0055
            com.google.android.gms.measurement.internal.b r0 = r1.f2174d
            com.google.android.gms.measurement.internal.n5 r0 = r0.f2143a
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14037t()
            java.lang.String r2 = "Extra parameter without an event name. eventId"
            r0.mo14694b(r2, r4)
            return r5
        L_0x0055:
            com.google.android.gms.internal.measurement.h4 r0 = r1.f2171a
            r11 = 1
            r12 = 0
            if (r0 == 0) goto L_0x006d
            java.lang.Long r0 = r1.f2172b
            if (r0 == 0) goto L_0x006d
            long r13 = r4.longValue()
            java.lang.Long r0 = r1.f2172b
            long r15 = r0.longValue()
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0127
        L_0x006d:
            com.google.android.gms.measurement.internal.b r0 = r1.f2174d
            com.google.android.gms.measurement.internal.ra r0 = r0.f2045b
            com.google.android.gms.measurement.internal.l r13 = r0.mo14466V()
            r13.mo14009h()
            r13.mo14128i()
            android.database.sqlite.SQLiteDatabase r0 = r13.mo14320P()     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            r14 = 2
            java.lang.String[] r14 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            r14[r12] = r3     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            java.lang.String r15 = r4.toString()     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            r14[r11] = r15     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            java.lang.String r15 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            android.database.Cursor r14 = r0.rawQuery(r15, r14)     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            boolean r0 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x00e3 }
            if (r0 != 0) goto L_0x00aa
            com.google.android.gms.measurement.internal.n5 r0 = r13.f2143a     // Catch:{ SQLiteException -> 0x00e3 }
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()     // Catch:{ SQLiteException -> 0x00e3 }
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14039v()     // Catch:{ SQLiteException -> 0x00e3 }
            java.lang.String r15 = "Main event not found"
            r0.mo14693a(r15)     // Catch:{ SQLiteException -> 0x00e3 }
            r14.close()
            r0 = r5
            goto L_0x0100
        L_0x00aa:
            byte[] r0 = r14.getBlob(r12)     // Catch:{ SQLiteException -> 0x00e3 }
            long r15 = r14.getLong(r11)     // Catch:{ SQLiteException -> 0x00e3 }
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ SQLiteException -> 0x00e3 }
            com.google.android.gms.internal.measurement.g4 r5 = com.google.android.gms.internal.measurement.C1122h4.m2041C()     // Catch:{ IOException -> 0x00ce }
            com.google.android.gms.internal.measurement.k9 r0 = com.google.android.gms.measurement.internal.C1794ta.m4742C(r5, r0)     // Catch:{ IOException -> 0x00ce }
            com.google.android.gms.internal.measurement.g4 r0 = (com.google.android.gms.internal.measurement.C1106g4) r0     // Catch:{ IOException -> 0x00ce }
            com.google.android.gms.internal.measurement.k8 r0 = r0.mo12838q()     // Catch:{ IOException -> 0x00ce }
            com.google.android.gms.internal.measurement.h4 r0 = (com.google.android.gms.internal.measurement.C1122h4) r0     // Catch:{ IOException -> 0x00ce }
            android.util.Pair r0 = android.util.Pair.create(r0, r15)     // Catch:{ SQLiteException -> 0x00e3 }
            r14.close()
            goto L_0x0100
        L_0x00ce:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n5 r5 = r13.f2143a     // Catch:{ SQLiteException -> 0x00e3 }
            com.google.android.gms.measurement.internal.c4 r5 = r5.mo14228b()     // Catch:{ SQLiteException -> 0x00e3 }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo14035r()     // Catch:{ SQLiteException -> 0x00e3 }
            java.lang.String r15 = "Failed to merge main event. appId, eventId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C1574c4.m4083z(r18)     // Catch:{ SQLiteException -> 0x00e3 }
            r5.mo14696d(r15, r12, r4, r0)     // Catch:{ SQLiteException -> 0x00e3 }
            goto L_0x00fc
        L_0x00e3:
            r0 = move-exception
            goto L_0x00eb
        L_0x00e5:
            r0 = move-exception
            r5 = 0
            goto L_0x01e0
        L_0x00e9:
            r0 = move-exception
            r14 = 0
        L_0x00eb:
            com.google.android.gms.measurement.internal.n5 r5 = r13.f2143a     // Catch:{ all -> 0x01de }
            com.google.android.gms.measurement.internal.c4 r5 = r5.mo14228b()     // Catch:{ all -> 0x01de }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo14035r()     // Catch:{ all -> 0x01de }
            java.lang.String r12 = "Error selecting main event"
            r5.mo14694b(r12, r0)     // Catch:{ all -> 0x01de }
            if (r14 == 0) goto L_0x00ff
        L_0x00fc:
            r14.close()
        L_0x00ff:
            r0 = 0
        L_0x0100:
            if (r0 == 0) goto L_0x01cb
            java.lang.Object r5 = r0.first
            if (r5 != 0) goto L_0x0108
            goto L_0x01cb
        L_0x0108:
            com.google.android.gms.internal.measurement.h4 r5 = (com.google.android.gms.internal.measurement.C1122h4) r5
            r1.f2171a = r5
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r12 = r0.longValue()
            r1.f2173c = r12
            com.google.android.gms.measurement.internal.b r0 = r1.f2174d
            com.google.android.gms.measurement.internal.ra r0 = r0.f2045b
            r0.mo14475f0()
            com.google.android.gms.internal.measurement.h4 r0 = r1.f2171a
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C1794ta.m4749o(r0, r2)
            java.lang.Long r0 = (java.lang.Long) r0
            r1.f2172b = r0
        L_0x0127:
            long r12 = r1.f2173c
            r14 = -1
            long r12 = r12 + r14
            r1.f2173c = r12
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x016c
            com.google.android.gms.measurement.internal.b r0 = r1.f2174d
            com.google.android.gms.measurement.internal.ra r0 = r0.f2045b
            com.google.android.gms.measurement.internal.l r2 = r0.mo14466V()
            r2.mo14009h()
            com.google.android.gms.measurement.internal.n5 r0 = r2.f2143a
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14039v()
            java.lang.String r4 = "Clearing complex main event info. appId"
            r0.mo14694b(r4, r3)
            android.database.sqlite.SQLiteDatabase r0 = r2.mo14320P()     // Catch:{ SQLiteException -> 0x015b }
            java.lang.String[] r4 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x015b }
            r5 = 0
            r4[r5] = r3     // Catch:{ SQLiteException -> 0x015b }
            java.lang.String r3 = "delete from main_event_params where app_id=?"
            r0.execSQL(r3, r4)     // Catch:{ SQLiteException -> 0x015b }
            goto L_0x017d
        L_0x015b:
            r0 = move-exception
            com.google.android.gms.measurement.internal.n5 r2 = r2.f2143a
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo14228b()
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14035r()
            java.lang.String r3 = "Error clearing complex main event"
            r2.mo14694b(r3, r0)
            goto L_0x017d
        L_0x016c:
            com.google.android.gms.measurement.internal.b r0 = r1.f2174d
            com.google.android.gms.measurement.internal.ra r0 = r0.f2045b
            com.google.android.gms.measurement.internal.l r2 = r0.mo14466V()
            long r5 = r1.f2173c
            com.google.android.gms.internal.measurement.h4 r7 = r1.f2171a
            r3 = r18
            r2.mo14347v(r3, r4, r5, r7)
        L_0x017d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.internal.measurement.h4 r2 = r1.f2171a
            java.util.List r2 = r2.mo12855G()
            java.util.Iterator r2 = r2.iterator()
        L_0x018c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01ad
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.l4 r3 = (com.google.android.gms.internal.measurement.C1186l4) r3
            com.google.android.gms.measurement.internal.b r4 = r1.f2174d
            com.google.android.gms.measurement.internal.ra r4 = r4.f2045b
            r4.mo14475f0()
            java.lang.String r4 = r3.mo12953E()
            com.google.android.gms.internal.measurement.l4 r4 = com.google.android.gms.measurement.internal.C1794ta.m4748n(r8, r4)
            if (r4 != 0) goto L_0x018c
            r0.add(r3)
            goto L_0x018c
        L_0x01ad:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x01b8
            r0.addAll(r9)
            r9 = r0
            goto L_0x01c9
        L_0x01b8:
            com.google.android.gms.measurement.internal.b r0 = r1.f2174d
            com.google.android.gms.measurement.internal.n5 r0 = r0.f2143a
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14037t()
            java.lang.String r2 = "No unique parameters in main event. eventName"
            r0.mo14694b(r2, r10)
        L_0x01c9:
            r0 = r10
            goto L_0x0233
        L_0x01cb:
            com.google.android.gms.measurement.internal.b r0 = r1.f2174d
            com.google.android.gms.measurement.internal.n5 r0 = r0.f2143a
            com.google.android.gms.measurement.internal.c4 r0 = r0.mo14228b()
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo14037t()
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            r0.mo14695c(r2, r10, r4)
            r2 = 0
            return r2
        L_0x01de:
            r0 = move-exception
            r5 = r14
        L_0x01e0:
            if (r5 == 0) goto L_0x01e5
            r5.close()
        L_0x01e5:
            throw r0
        L_0x01e6:
            r1.f2172b = r4
            r1.f2171a = r8
            com.google.android.gms.measurement.internal.b r2 = r1.f2174d
            com.google.android.gms.measurement.internal.ra r2 = r2.f2045b
            r2.mo14475f0()
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r5 = "_epc"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C1794ta.m4749o(r8, r5)
            if (r5 == 0) goto L_0x01fe
            r2 = r5
        L_0x01fe:
            java.lang.Long r2 = (java.lang.Long) r2
            long r10 = r2.longValue()
            r1.f2173c = r10
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x021c
            com.google.android.gms.measurement.internal.b r2 = r1.f2174d
            com.google.android.gms.measurement.internal.n5 r2 = r2.f2143a
            com.google.android.gms.measurement.internal.c4 r2 = r2.mo14228b()
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo14037t()
            java.lang.String r3 = "Complex event with zero extra param count. eventName"
            r2.mo14694b(r3, r0)
            goto L_0x0233
        L_0x021c:
            com.google.android.gms.measurement.internal.b r2 = r1.f2174d
            com.google.android.gms.measurement.internal.ra r2 = r2.f2045b
            com.google.android.gms.measurement.internal.l r2 = r2.mo14466V()
            java.lang.Object r4 = com.google.android.gms.common.internal.C0917i.m1419j(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r5 = r1.f2173c
            r3 = r18
            r7 = r19
            r2.mo14347v(r3, r4, r5, r7)
        L_0x0233:
            com.google.android.gms.internal.measurement.g8 r2 = r19.mo12916l()
            com.google.android.gms.internal.measurement.g4 r2 = (com.google.android.gms.internal.measurement.C1106g4) r2
            r2.mo12812K(r0)
            r2.mo12810D()
            r2.mo12824x(r9)
            com.google.android.gms.internal.measurement.k8 r0 = r2.mo12838q()
            com.google.android.gms.internal.measurement.h4 r0 = (com.google.android.gms.internal.measurement.C1122h4) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C1659ib.mo14252a(java.lang.String, com.google.android.gms.internal.measurement.h4):com.google.android.gms.internal.measurement.h4");
    }
}

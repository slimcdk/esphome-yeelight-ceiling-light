package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1994t0;

/* renamed from: com.google.android.gms.measurement.internal.ba */
final class C2128ba {

    /* renamed from: a */
    private C1994t0 f3977a;

    /* renamed from: b */
    private Long f3978b;

    /* renamed from: c */
    private long f3979c;

    /* renamed from: d */
    private final /* synthetic */ C2116aa f3980d;

    private C2128ba(C2116aa aaVar) {
        this.f3980d = aaVar;
    }

    /* synthetic */ C2128ba(C2116aa aaVar, C2400z9 z9Var) {
        this(aaVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C1994t0 mo12487a(java.lang.String r18, com.google.android.gms.internal.measurement.C1994t0 r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r8 = r19
            java.lang.String r9 = r19.mo12065U()
            java.util.List r10 = r19.mo12073z()
            com.google.android.gms.measurement.internal.aa r2 = r1.f3980d
            com.google.android.gms.measurement.internal.p9 r2 = r2.mo12778n()
            java.lang.String r3 = "_eid"
            java.lang.Object r2 = r2.mo12890U(r8, r3)
            r4 = r2
            java.lang.Long r4 = (java.lang.Long) r4
            r2 = 1
            r5 = 0
            if (r4 == 0) goto L_0x0023
            r6 = 1
            goto L_0x0024
        L_0x0023:
            r6 = 0
        L_0x0024:
            if (r6 == 0) goto L_0x0030
            java.lang.String r7 = "_ep"
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L_0x0030
            r7 = 1
            goto L_0x0031
        L_0x0030:
            r7 = 0
        L_0x0031:
            r11 = 0
            if (r7 == 0) goto L_0x0147
            com.google.android.gms.measurement.internal.aa r6 = r1.f3980d
            com.google.android.gms.measurement.internal.p9 r6 = r6.mo12778n()
            java.lang.String r7 = "_en"
            java.lang.Object r6 = r6.mo12890U(r8, r7)
            r9 = r6
            java.lang.String r9 = (java.lang.String) r9
            boolean r6 = android.text.TextUtils.isEmpty(r9)
            r7 = 0
            if (r6 == 0) goto L_0x005b
            com.google.android.gms.measurement.internal.aa r0 = r1.f3980d
            com.google.android.gms.measurement.internal.w3 r0 = r0.mo12427b()
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13097G()
            java.lang.String r2 = "Extra parameter without an event name. eventId"
            r0.mo13131b(r2, r4)
            return r7
        L_0x005b:
            com.google.android.gms.internal.measurement.t0 r6 = r1.f3977a
            if (r6 == 0) goto L_0x0071
            java.lang.Long r6 = r1.f3978b
            if (r6 == 0) goto L_0x0071
            long r13 = r4.longValue()
            java.lang.Long r6 = r1.f3978b
            long r15 = r6.longValue()
            int r6 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r6 == 0) goto L_0x00a1
        L_0x0071:
            com.google.android.gms.measurement.internal.aa r6 = r1.f3980d
            com.google.android.gms.measurement.internal.c r6 = r6.mo12779o()
            android.util.Pair r6 = r6.mo12532z(r0, r4)
            if (r6 == 0) goto L_0x0137
            java.lang.Object r13 = r6.first
            if (r13 != 0) goto L_0x0083
            goto L_0x0137
        L_0x0083:
            com.google.android.gms.internal.measurement.t0 r13 = (com.google.android.gms.internal.measurement.C1994t0) r13
            r1.f3977a = r13
            java.lang.Object r6 = r6.second
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            r1.f3979c = r6
            com.google.android.gms.measurement.internal.aa r6 = r1.f3980d
            com.google.android.gms.measurement.internal.p9 r6 = r6.mo12778n()
            com.google.android.gms.internal.measurement.t0 r7 = r1.f3977a
            java.lang.Object r3 = r6.mo12890U(r7, r3)
            java.lang.Long r3 = (java.lang.Long) r3
            r1.f3978b = r3
        L_0x00a1:
            long r6 = r1.f3979c
            r13 = 1
            long r6 = r6 - r13
            r1.f3979c = r6
            int r3 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r3 > 0) goto L_0x00df
            com.google.android.gms.measurement.internal.aa r3 = r1.f3980d
            com.google.android.gms.measurement.internal.c r3 = r3.mo12779o()
            r3.mo12567h()
            com.google.android.gms.measurement.internal.w3 r4 = r3.mo12427b()
            com.google.android.gms.measurement.internal.y3 r4 = r4.mo13104O()
            java.lang.String r6 = "Clearing complex main event info. appId"
            r4.mo13131b(r6, r0)
            android.database.sqlite.SQLiteDatabase r4 = r3.mo12525v()     // Catch:{ SQLiteException -> 0x00d0 }
            java.lang.String r6 = "delete from main_event_params where app_id=?"
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00d0 }
            r2[r5] = r0     // Catch:{ SQLiteException -> 0x00d0 }
            r4.execSQL(r6, r2)     // Catch:{ SQLiteException -> 0x00d0 }
            goto L_0x00ee
        L_0x00d0:
            r0 = move-exception
            com.google.android.gms.measurement.internal.w3 r2 = r3.mo12427b()
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo13096F()
            java.lang.String r3 = "Error clearing complex main event"
            r2.mo13131b(r3, r0)
            goto L_0x00ee
        L_0x00df:
            com.google.android.gms.measurement.internal.aa r2 = r1.f3980d
            com.google.android.gms.measurement.internal.c r2 = r2.mo12779o()
            long r5 = r1.f3979c
            com.google.android.gms.internal.measurement.t0 r7 = r1.f3977a
            r3 = r18
            r2.mo12510W(r3, r4, r5, r7)
        L_0x00ee:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.internal.measurement.t0 r2 = r1.f3977a
            java.util.List r2 = r2.mo12073z()
            java.util.Iterator r2 = r2.iterator()
        L_0x00fd:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x011c
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.v0 r3 = (com.google.android.gms.internal.measurement.C2024v0) r3
            com.google.android.gms.measurement.internal.aa r4 = r1.f3980d
            r4.mo12778n()
            java.lang.String r4 = r3.mo12104L()
            com.google.android.gms.internal.measurement.v0 r4 = com.google.android.gms.measurement.internal.C2290p9.m7351x(r8, r4)
            if (r4 != 0) goto L_0x00fd
            r0.add(r3)
            goto L_0x00fd
        L_0x011c:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x0127
            r0.addAll(r10)
            r10 = r0
            goto L_0x0189
        L_0x0127:
            com.google.android.gms.measurement.internal.aa r0 = r1.f3980d
            com.google.android.gms.measurement.internal.w3 r0 = r0.mo12427b()
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13097G()
            java.lang.String r2 = "No unique parameters in main event. eventName"
        L_0x0133:
            r0.mo13131b(r2, r9)
            goto L_0x0189
        L_0x0137:
            com.google.android.gms.measurement.internal.aa r0 = r1.f3980d
            com.google.android.gms.measurement.internal.w3 r0 = r0.mo12427b()
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13097G()
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            r0.mo13132c(r2, r9, r4)
            return r7
        L_0x0147:
            if (r6 == 0) goto L_0x0189
            r1.f3978b = r4
            r1.f3977a = r8
            com.google.android.gms.measurement.internal.aa r2 = r1.f3980d
            com.google.android.gms.measurement.internal.p9 r2 = r2.mo12778n()
            java.lang.Long r3 = java.lang.Long.valueOf(r11)
            java.lang.String r5 = "_epc"
            java.lang.Object r2 = r2.mo12890U(r8, r5)
            if (r2 != 0) goto L_0x0160
            goto L_0x0161
        L_0x0160:
            r3 = r2
        L_0x0161:
            java.lang.Long r3 = (java.lang.Long) r3
            long r2 = r3.longValue()
            r1.f3979c = r2
            int r5 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r5 > 0) goto L_0x017a
            com.google.android.gms.measurement.internal.aa r0 = r1.f3980d
            com.google.android.gms.measurement.internal.w3 r0 = r0.mo12427b()
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13097G()
            java.lang.String r2 = "Complex event with zero extra param count. eventName"
            goto L_0x0133
        L_0x017a:
            com.google.android.gms.measurement.internal.aa r2 = r1.f3980d
            com.google.android.gms.measurement.internal.c r2 = r2.mo12779o()
            long r5 = r1.f3979c
            r3 = r18
            r7 = r19
            r2.mo12510W(r3, r4, r5, r7)
        L_0x0189:
            com.google.android.gms.internal.measurement.m4$b r0 = r19.mo11850u()
            com.google.android.gms.internal.measurement.t0$a r0 = (com.google.android.gms.internal.measurement.C1994t0.C1995a) r0
            r0.mo12074A(r9)
            r0.mo12080N()
            r0.mo12089z(r10)
            com.google.android.gms.internal.measurement.x5 r0 = r0.mo11851I()
            com.google.android.gms.internal.measurement.m4 r0 = (com.google.android.gms.internal.measurement.C1889m4) r0
            com.google.android.gms.internal.measurement.t0 r0 = (com.google.android.gms.internal.measurement.C1994t0) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2128ba.mo12487a(java.lang.String, com.google.android.gms.internal.measurement.t0):com.google.android.gms.internal.measurement.t0");
    }
}

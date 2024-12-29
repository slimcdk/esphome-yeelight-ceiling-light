package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.MainThread;

@TargetApi(14)
@MainThread
/* renamed from: com.google.android.gms.measurement.internal.a7 */
final class C2113a7 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final /* synthetic */ C2196h6 f3946a;

    private C2113a7(C2196h6 h6Var) {
        this.f3946a = h6Var;
    }

    /* synthetic */ C2113a7(C2196h6 h6Var, C2208i6 i6Var) {
        this(h6Var);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a1 A[SYNTHETIC, Splitter:B:33:0x00a1] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fe A[Catch:{ Exception -> 0x01d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010f A[SYNTHETIC, Splitter:B:51:0x010f] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x013e A[Catch:{ Exception -> 0x01d6 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013f A[Catch:{ Exception -> 0x01d6 }] */
    @androidx.annotation.WorkerThread
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m6756b(boolean r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21) {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            r2 = r21
            com.google.android.gms.measurement.internal.h6 r3 = r1.f3946a
            r3.mo12567h()
            com.google.android.gms.measurement.internal.h6 r3 = r1.f3946a     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.b r3 = r3.mo13112m()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.C2302r.f4520j0     // Catch:{ Exception -> 0x01d6 }
            boolean r3 = r3.mo12474s(r4)     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r4 = "Activity created with data 'referrer' without required params"
            java.lang.String r5 = "utm_medium"
            java.lang.String r6 = "_cis"
            java.lang.String r7 = "utm_source"
            java.lang.String r8 = "utm_campaign"
            java.lang.String r10 = "gclid"
            if (r3 != 0) goto L_0x0044
            com.google.android.gms.measurement.internal.h6 r3 = r1.f3946a     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.b r3 = r3.mo13112m()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.C2302r.f4524l0     // Catch:{ Exception -> 0x01d6 }
            boolean r3 = r3.mo12474s(r11)     // Catch:{ Exception -> 0x01d6 }
            if (r3 != 0) goto L_0x0044
            com.google.android.gms.measurement.internal.h6 r3 = r1.f3946a     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.b r3 = r3.mo13112m()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.C2302r.f4522k0     // Catch:{ Exception -> 0x01d6 }
            boolean r3 = r3.mo12474s(r11)     // Catch:{ Exception -> 0x01d6 }
            if (r3 == 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r3 = 0
            goto L_0x009b
        L_0x0044:
            com.google.android.gms.measurement.internal.h6 r3 = r1.f3946a     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.s9 r3 = r3.mo13110k()     // Catch:{ Exception -> 0x01d6 }
            boolean r11 = android.text.TextUtils.isEmpty(r21)     // Catch:{ Exception -> 0x01d6 }
            if (r11 == 0) goto L_0x0051
            goto L_0x0042
        L_0x0051:
            boolean r11 = r2.contains(r10)     // Catch:{ Exception -> 0x01d6 }
            if (r11 != 0) goto L_0x0075
            boolean r11 = r2.contains(r8)     // Catch:{ Exception -> 0x01d6 }
            if (r11 != 0) goto L_0x0075
            boolean r11 = r2.contains(r7)     // Catch:{ Exception -> 0x01d6 }
            if (r11 != 0) goto L_0x0075
            boolean r11 = r2.contains(r5)     // Catch:{ Exception -> 0x01d6 }
            if (r11 != 0) goto L_0x0075
            com.google.android.gms.measurement.internal.w3 r3 = r3.mo12427b()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.y3 r3 = r3.mo13103N()     // Catch:{ Exception -> 0x01d6 }
            r3.mo13130a(r4)     // Catch:{ Exception -> 0x01d6 }
            goto L_0x0042
        L_0x0075:
            java.lang.String r11 = "https://google.com/search?"
            java.lang.String r12 = java.lang.String.valueOf(r21)     // Catch:{ Exception -> 0x01d6 }
            int r13 = r12.length()     // Catch:{ Exception -> 0x01d6 }
            if (r13 == 0) goto L_0x0086
            java.lang.String r11 = r11.concat(r12)     // Catch:{ Exception -> 0x01d6 }
            goto L_0x008c
        L_0x0086:
            java.lang.String r12 = new java.lang.String     // Catch:{ Exception -> 0x01d6 }
            r12.<init>(r11)     // Catch:{ Exception -> 0x01d6 }
            r11 = r12
        L_0x008c:
            android.net.Uri r11 = android.net.Uri.parse(r11)     // Catch:{ Exception -> 0x01d6 }
            android.os.Bundle r3 = r3.mo12979z(r11)     // Catch:{ Exception -> 0x01d6 }
            if (r3 == 0) goto L_0x009b
            java.lang.String r11 = "referrer"
            r3.putString(r6, r11)     // Catch:{ Exception -> 0x01d6 }
        L_0x009b:
            r11 = 0
            java.lang.String r12 = "_cmp"
            r13 = 1
            if (r18 == 0) goto L_0x00fe
            com.google.android.gms.measurement.internal.h6 r14 = r1.f3946a     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.s9 r14 = r14.mo13110k()     // Catch:{ Exception -> 0x01d6 }
            r15 = r19
            android.os.Bundle r14 = r14.mo12979z(r15)     // Catch:{ Exception -> 0x01d6 }
            if (r14 == 0) goto L_0x00ff
            java.lang.String r15 = "intent"
            r14.putString(r6, r15)     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.h6 r6 = r1.f3946a     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.b r6 = r6.mo13112m()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r15 = com.google.android.gms.measurement.internal.C2302r.f4520j0     // Catch:{ Exception -> 0x01d6 }
            boolean r6 = r6.mo12474s(r15)     // Catch:{ Exception -> 0x01d6 }
            if (r6 == 0) goto L_0x00e3
            boolean r6 = r14.containsKey(r10)     // Catch:{ Exception -> 0x01d6 }
            if (r6 != 0) goto L_0x00e3
            if (r3 == 0) goto L_0x00e3
            boolean r6 = r3.containsKey(r10)     // Catch:{ Exception -> 0x01d6 }
            if (r6 == 0) goto L_0x00e3
            java.lang.String r6 = "_cer"
            java.lang.String r15 = "gclid=%s"
            java.lang.Object[] r9 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r16 = r3.getString(r10)     // Catch:{ Exception -> 0x01d6 }
            r9[r11] = r16     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r9 = java.lang.String.format(r15, r9)     // Catch:{ Exception -> 0x01d6 }
            r14.putString(r6, r9)     // Catch:{ Exception -> 0x01d6 }
        L_0x00e3:
            com.google.android.gms.measurement.internal.h6 r6 = r1.f3946a     // Catch:{ Exception -> 0x01d6 }
            r6.mo12709S(r0, r12, r14)     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.h6 r6 = r1.f3946a     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.b r6 = r6.mo13112m()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.C2302r.f4490Q0     // Catch:{ Exception -> 0x01d6 }
            boolean r6 = r6.mo12474s(r9)     // Catch:{ Exception -> 0x01d6 }
            if (r6 == 0) goto L_0x00ff
            com.google.android.gms.measurement.internal.h6 r6 = r1.f3946a     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.x9 r6 = r6.f4162h     // Catch:{ Exception -> 0x01d6 }
            r6.mo13128b(r0, r14)     // Catch:{ Exception -> 0x01d6 }
            goto L_0x00ff
        L_0x00fe:
            r14 = 0
        L_0x00ff:
            com.google.android.gms.measurement.internal.h6 r6 = r1.f3946a     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.b r6 = r6.mo13112m()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.C2302r.f4524l0     // Catch:{ Exception -> 0x01d6 }
            boolean r6 = r6.mo12474s(r9)     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r9 = "auto"
            if (r6 == 0) goto L_0x0138
            com.google.android.gms.measurement.internal.h6 r6 = r1.f3946a     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.b r6 = r6.mo13112m()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r15 = com.google.android.gms.measurement.internal.C2302r.f4522k0     // Catch:{ Exception -> 0x01d6 }
            boolean r6 = r6.mo12474s(r15)     // Catch:{ Exception -> 0x01d6 }
            if (r6 != 0) goto L_0x0138
            if (r3 == 0) goto L_0x0138
            boolean r6 = r3.containsKey(r10)     // Catch:{ Exception -> 0x01d6 }
            if (r6 == 0) goto L_0x0138
            if (r14 == 0) goto L_0x012d
            boolean r6 = r14.containsKey(r10)     // Catch:{ Exception -> 0x01d6 }
            if (r6 != 0) goto L_0x0138
        L_0x012d:
            com.google.android.gms.measurement.internal.h6 r6 = r1.f3946a     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r14 = "_lgclid"
            java.lang.String r15 = r3.getString(r10)     // Catch:{ Exception -> 0x01d6 }
            r6.mo12713W(r9, r14, r15, r13)     // Catch:{ Exception -> 0x01d6 }
        L_0x0138:
            boolean r6 = android.text.TextUtils.isEmpty(r21)     // Catch:{ Exception -> 0x01d6 }
            if (r6 == 0) goto L_0x013f
            return
        L_0x013f:
            com.google.android.gms.measurement.internal.h6 r6 = r1.f3946a     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.w3 r6 = r6.mo12427b()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.y3 r6 = r6.mo13103N()     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r14 = "Activity created with referrer"
            r6.mo13131b(r14, r2)     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.h6 r6 = r1.f3946a     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.b r6 = r6.mo13112m()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.C2302r.f4522k0     // Catch:{ Exception -> 0x01d6 }
            boolean r6 = r6.mo12474s(r14)     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r14 = "_ldl"
            if (r6 == 0) goto L_0x0191
            if (r3 == 0) goto L_0x017b
            com.google.android.gms.measurement.internal.h6 r2 = r1.f3946a     // Catch:{ Exception -> 0x01d6 }
            r2.mo12709S(r0, r12, r3)     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.h6 r2 = r1.f3946a     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.b r2 = r2.mo13112m()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.p3<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.C2302r.f4490Q0     // Catch:{ Exception -> 0x01d6 }
            boolean r2 = r2.mo12474s(r4)     // Catch:{ Exception -> 0x01d6 }
            if (r2 == 0) goto L_0x018a
            com.google.android.gms.measurement.internal.h6 r2 = r1.f3946a     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.x9 r2 = r2.f4162h     // Catch:{ Exception -> 0x01d6 }
            r2.mo13128b(r0, r3)     // Catch:{ Exception -> 0x01d6 }
            goto L_0x018a
        L_0x017b:
            com.google.android.gms.measurement.internal.h6 r0 = r1.f3946a     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.w3 r0 = r0.mo12427b()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13103N()     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r3 = "Referrer does not contain valid parameters"
            r0.mo13131b(r3, r2)     // Catch:{ Exception -> 0x01d6 }
        L_0x018a:
            com.google.android.gms.measurement.internal.h6 r0 = r1.f3946a     // Catch:{ Exception -> 0x01d6 }
            r2 = 0
            r0.mo12713W(r9, r14, r2, r13)     // Catch:{ Exception -> 0x01d6 }
            return
        L_0x0191:
            boolean r0 = r2.contains(r10)     // Catch:{ Exception -> 0x01d6 }
            if (r0 == 0) goto L_0x01ba
            boolean r0 = r2.contains(r8)     // Catch:{ Exception -> 0x01d6 }
            if (r0 != 0) goto L_0x01b9
            boolean r0 = r2.contains(r7)     // Catch:{ Exception -> 0x01d6 }
            if (r0 != 0) goto L_0x01b9
            boolean r0 = r2.contains(r5)     // Catch:{ Exception -> 0x01d6 }
            if (r0 != 0) goto L_0x01b9
            java.lang.String r0 = "utm_term"
            boolean r0 = r2.contains(r0)     // Catch:{ Exception -> 0x01d6 }
            if (r0 != 0) goto L_0x01b9
            java.lang.String r0 = "utm_content"
            boolean r0 = r2.contains(r0)     // Catch:{ Exception -> 0x01d6 }
            if (r0 == 0) goto L_0x01ba
        L_0x01b9:
            r11 = 1
        L_0x01ba:
            if (r11 != 0) goto L_0x01ca
            com.google.android.gms.measurement.internal.h6 r0 = r1.f3946a     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.w3 r0 = r0.mo12427b()     // Catch:{ Exception -> 0x01d6 }
            com.google.android.gms.measurement.internal.y3 r0 = r0.mo13103N()     // Catch:{ Exception -> 0x01d6 }
            r0.mo13130a(r4)     // Catch:{ Exception -> 0x01d6 }
            return
        L_0x01ca:
            boolean r0 = android.text.TextUtils.isEmpty(r21)     // Catch:{ Exception -> 0x01d6 }
            if (r0 != 0) goto L_0x01d5
            com.google.android.gms.measurement.internal.h6 r0 = r1.f3946a     // Catch:{ Exception -> 0x01d6 }
            r0.mo12713W(r9, r14, r2, r13)     // Catch:{ Exception -> 0x01d6 }
        L_0x01d5:
            return
        L_0x01d6:
            r0 = move-exception
            com.google.android.gms.measurement.internal.h6 r2 = r1.f3946a
            com.google.android.gms.measurement.internal.w3 r2 = r2.mo12427b()
            com.google.android.gms.measurement.internal.y3 r2 = r2.mo13096F()
            java.lang.String r3 = "Throwable caught in handleReferrerForOnActivityCreated"
            r2.mo13131b(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2113a7.m6756b(boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.f3946a.mo12427b().mo13104O().mo13130a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    if (data.isHierarchical()) {
                        this.f3946a.mo13110k();
                        this.f3946a.mo12426a().mo13122y(new C2161e7(this, bundle == null, data, C2323s9.m7563X(intent) ? "gs" : "auto", data.getQueryParameter("referrer")));
                    }
                }
            }
        } catch (Exception e) {
            this.f3946a.mo12427b().mo13096F().mo13131b("Throwable caught in onActivityCreated", e);
        } catch (Throwable th) {
            this.f3946a.mo12573s().mo12801G(activity, bundle);
            throw th;
        }
        this.f3946a.mo12573s().mo12801G(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f3946a.mo12573s().mo12807T(activity);
    }

    @MainThread
    public final void onActivityPaused(Activity activity) {
        this.f3946a.mo12573s().mo12805R(activity);
        C2366w8 u = this.f3946a.mo12575u();
        u.mo12426a().mo13122y(new C2388y8(u, u.mo12429f().mo11379b()));
    }

    @MainThread
    public final void onActivityResumed(Activity activity) {
        C2366w8 u = this.f3946a.mo12575u();
        u.mo12426a().mo13122y(new C2355v8(u, u.mo12429f().mo11379b()));
        this.f3946a.mo12573s().mo12800F(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f3946a.mo12573s().mo12806S(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}

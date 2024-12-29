package com.xiaomi.mistatistic.sdk.controller;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.ViewParent;
import android.widget.GridView;
import android.widget.ListView;
import com.xiaomi.mistatistic.sdk.data.C4165a;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"NewApi"})
/* renamed from: com.xiaomi.mistatistic.sdk.controller.r */
public class C4163r {

    /* renamed from: a */
    private List<C4165a> f7139a = new ArrayList();

    /* renamed from: b */
    private boolean m11303b(View view) {
        ViewParent parent = view.getParent();
        return (parent instanceof ListView) || (parent instanceof GridView);
    }

    /* renamed from: a */
    public List<C4165a> mo23105a() {
        return this.f7139a;
    }

    /* renamed from: a */
    public void mo23106a(Activity activity) {
        mo23107a(activity.getWindow().getDecorView().getRootView());
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23107a(android.view.View r4) {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 15
            if (r0 < r1) goto L_0x003c
            boolean r0 = r4.hasOnClickListeners()
            if (r0 == 0) goto L_0x0017
            java.util.List<com.xiaomi.mistatistic.sdk.data.a> r0 = r3.f7139a
            com.xiaomi.mistatistic.sdk.data.a r1 = new com.xiaomi.mistatistic.sdk.data.a
            r1.<init>(r4)
        L_0x0013:
            r0.add(r1)
            goto L_0x0025
        L_0x0017:
            boolean r0 = r3.m11303b(r4)
            if (r0 == 0) goto L_0x0025
            java.util.List<com.xiaomi.mistatistic.sdk.data.a> r0 = r3.f7139a
            com.xiaomi.mistatistic.sdk.data.a r1 = new com.xiaomi.mistatistic.sdk.data.a
            r1.<init>(r4)
            goto L_0x0013
        L_0x0025:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x003c
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            r1 = 0
        L_0x0030:
            if (r1 >= r0) goto L_0x003c
            android.view.View r2 = r4.getChildAt(r1)
            r3.mo23107a((android.view.View) r2)
            int r1 = r1 + 1
            goto L_0x0030
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mistatistic.sdk.controller.C4163r.mo23107a(android.view.View):void");
    }
}

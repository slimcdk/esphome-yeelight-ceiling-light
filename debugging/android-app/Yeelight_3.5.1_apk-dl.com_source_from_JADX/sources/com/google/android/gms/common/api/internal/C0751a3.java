package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* renamed from: com.google.android.gms.common.api.internal.a3 */
final class C0751a3 extends C0817n1 {

    /* renamed from: a */
    final /* synthetic */ Dialog f576a;

    /* renamed from: b */
    final /* synthetic */ C0756b3 f577b;

    C0751a3(C0756b3 b3Var, Dialog dialog) {
        this.f577b = b3Var;
        this.f576a = dialog;
    }

    /* renamed from: a */
    public final void mo11902a() {
        this.f577b.f586b.m762o();
        if (this.f576a.isShowing()) {
            this.f576a.dismiss();
        }
    }
}

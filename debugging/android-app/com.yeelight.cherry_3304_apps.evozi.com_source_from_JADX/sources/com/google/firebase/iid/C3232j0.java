package com.google.firebase.iid;

import android.content.Intent;
import p011c.p012a.p019b.p028b.p038e.C0619h;
import p011c.p012a.p019b.p028b.p038e.C0620i;

/* renamed from: com.google.firebase.iid.j0 */
final class C3232j0 {

    /* renamed from: a */
    final Intent f6250a;

    /* renamed from: b */
    private final C0620i<Void> f6251b = new C0620i<>();

    C3232j0(Intent intent) {
        this.f6250a = intent;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0619h<Void> mo17837a() {
        return this.f6251b.mo8666a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo17838b() {
        this.f6251b.mo8670e(null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo17839c() {
        String action = this.f6250a.getAction();
        StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
        sb.append("Service took too long to process intent: ");
        sb.append(action);
        sb.append(" App may get closed.");
        sb.toString();
        mo17838b();
    }
}

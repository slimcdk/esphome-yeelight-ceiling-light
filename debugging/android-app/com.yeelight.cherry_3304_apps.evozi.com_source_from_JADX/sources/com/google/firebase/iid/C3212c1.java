package com.google.firebase.iid;

import android.os.Bundle;
import p011c.p012a.p019b.p028b.p038e.C0620i;

/* renamed from: com.google.firebase.iid.c1 */
final /* synthetic */ class C3212c1 implements Runnable {

    /* renamed from: a */
    private final C3215d1 f6210a;

    /* renamed from: b */
    private final String f6211b;

    /* renamed from: c */
    private final String f6212c;

    /* renamed from: d */
    private final String f6213d;

    /* renamed from: e */
    private final Bundle f6214e;

    /* renamed from: f */
    private final C0620i f6215f;

    C3212c1(C3215d1 d1Var, String str, String str2, String str3, Bundle bundle, C0620i iVar) {
        this.f6210a = d1Var;
        this.f6211b = str;
        this.f6212c = str2;
        this.f6213d = str3;
        this.f6214e = bundle;
        this.f6215f = iVar;
    }

    public final void run() {
        this.f6210a.mo17815d(this.f6211b, this.f6212c, this.f6213d, this.f6214e, this.f6215f);
    }
}

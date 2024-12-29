package com.yeelight.yeelib.pickcolor;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: com.yeelight.yeelib.pickcolor.a */
public final class C8340a implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {

    /* renamed from: a */
    private final Activity f14395a;

    public C8340a(Activity activity) {
        this.f14395a = activity;
    }

    /* renamed from: a */
    private void m19929a() {
        this.f14395a.finish();
    }

    public void onCancel(DialogInterface dialogInterface) {
        m19929a();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        m19929a();
    }
}

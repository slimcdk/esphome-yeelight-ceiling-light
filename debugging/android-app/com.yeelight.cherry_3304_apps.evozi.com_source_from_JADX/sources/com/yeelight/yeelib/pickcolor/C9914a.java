package com.yeelight.yeelib.pickcolor;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: com.yeelight.yeelib.pickcolor.a */
public final class C9914a implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {

    /* renamed from: a */
    private final Activity f18058a;

    public C9914a(Activity activity) {
        this.f18058a = activity;
    }

    /* renamed from: a */
    private void m24336a() {
        this.f18058a.finish();
    }

    public void onCancel(DialogInterface dialogInterface) {
        m24336a();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        m24336a();
    }
}

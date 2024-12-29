package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.internal.g */
public abstract class C1570g implements DialogInterface.OnClickListener {
    /* renamed from: a */
    public static C1570g m4314a(Activity activity, Intent intent, int i) {
        return new C1617z(intent, activity, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo11212b();

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo11212b();
        } catch (ActivityNotFoundException unused) {
        } finally {
            dialogInterface.dismiss();
        }
    }
}

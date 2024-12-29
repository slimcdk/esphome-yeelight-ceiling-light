package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.C1609u;

/* renamed from: com.google.android.gms.common.b */
public class C1517b extends DialogFragment {

    /* renamed from: a */
    private Dialog f2868a = null;

    /* renamed from: b */
    private DialogInterface.OnCancelListener f2869b = null;

    /* renamed from: a */
    public static C1517b m4094a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C1517b bVar = new C1517b();
        C1609u.m4476l(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        bVar.f2868a = dialog2;
        if (onCancelListener != null) {
            bVar.f2869b = onCancelListener;
        }
        return bVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f2869b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f2868a == null) {
            setShowsDialog(false);
        }
        return this.f2868a;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}

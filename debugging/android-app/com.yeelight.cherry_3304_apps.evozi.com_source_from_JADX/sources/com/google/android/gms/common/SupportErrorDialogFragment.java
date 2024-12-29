package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.C1609u;

public class SupportErrorDialogFragment extends DialogFragment {

    /* renamed from: a */
    private Dialog f2541a = null;

    /* renamed from: b */
    private DialogInterface.OnCancelListener f2542b = null;

    /* renamed from: q */
    public static SupportErrorDialogFragment m3606q(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        C1609u.m4476l(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        supportErrorDialogFragment.f2541a = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.f2542b = onCancelListener;
        }
        return supportErrorDialogFragment;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f2542b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f2541a == null) {
            setShowsDialog(false);
        }
        return this.f2541a;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}

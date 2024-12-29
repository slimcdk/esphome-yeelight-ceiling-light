package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.C0917i;

public class SupportErrorDialogFragment extends DialogFragment {

    /* renamed from: a */
    private Dialog f504a;

    /* renamed from: b */
    private DialogInterface.OnCancelListener f505b;
    @Nullable

    /* renamed from: c */
    private Dialog f506c;

    @NonNull
    /* renamed from: u */
    public static SupportErrorDialogFragment m616u(@NonNull Dialog dialog, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        Dialog dialog2 = (Dialog) C0917i.m1420k(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        supportErrorDialogFragment.f504a = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.f505b = onCancelListener;
        }
        return supportErrorDialogFragment;
    }

    public void onCancel(@NonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f505b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialog = this.f504a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f506c == null) {
            this.f506c = new AlertDialog.Builder((Context) C0917i.m1419j(getContext())).create();
        }
        return this.f506c;
    }

    public void show(@NonNull FragmentManager fragmentManager, @Nullable String str) {
        super.show(fragmentManager, str);
    }
}

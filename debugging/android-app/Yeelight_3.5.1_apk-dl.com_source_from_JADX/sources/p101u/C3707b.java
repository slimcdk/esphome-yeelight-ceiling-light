package p101u;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0917i;

/* renamed from: u.b */
public class C3707b extends DialogFragment {

    /* renamed from: a */
    private Dialog f6231a;

    /* renamed from: b */
    private DialogInterface.OnCancelListener f6232b;
    @Nullable

    /* renamed from: c */
    private Dialog f6233c;

    @NonNull
    /* renamed from: a */
    public static C3707b m10587a(@NonNull Dialog dialog, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        C3707b bVar = new C3707b();
        Dialog dialog2 = (Dialog) C0917i.m1420k(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        bVar.f6231a = dialog2;
        if (onCancelListener != null) {
            bVar.f6232b = onCancelListener;
        }
        return bVar;
    }

    public void onCancel(@NonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f6232b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialog = this.f6231a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f6233c == null) {
            this.f6233c = new AlertDialog.Builder((Context) C0917i.m1419j(getActivity())).create();
        }
        return this.f6233c;
    }

    public void show(@NonNull FragmentManager fragmentManager, @Nullable String str) {
        super.show(fragmentManager, str);
    }
}

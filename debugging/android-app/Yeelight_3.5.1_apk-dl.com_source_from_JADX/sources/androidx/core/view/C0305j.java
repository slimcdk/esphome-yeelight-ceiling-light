package androidx.core.view;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: androidx.core.view.j */
public final /* synthetic */ class C0305j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ View f161a;

    public /* synthetic */ C0305j(View view) {
        this.f161a = view;
    }

    public final void run() {
        ((InputMethodManager) this.f161a.getContext().getSystemService("input_method")).showSoftInput(this.f161a, 0);
    }
}

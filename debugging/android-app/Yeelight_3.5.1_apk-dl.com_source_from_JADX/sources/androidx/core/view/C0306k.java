package androidx.core.view;

import android.view.WindowInsetsController;
import androidx.core.view.WindowInsetsControllerCompat;

/* renamed from: androidx.core.view.k */
public final /* synthetic */ class C0306k implements WindowInsetsController.OnControllableInsetsChangedListener {

    /* renamed from: a */
    public final /* synthetic */ WindowInsetsControllerCompat.Impl30 f162a;

    /* renamed from: b */
    public final /* synthetic */ WindowInsetsControllerCompat.OnControllableInsetsChangedListener f163b;

    public /* synthetic */ C0306k(WindowInsetsControllerCompat.Impl30 impl30, WindowInsetsControllerCompat.OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        this.f162a = impl30;
        this.f163b = onControllableInsetsChangedListener;
    }

    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i) {
        this.f162a.lambda$addOnControllableInsetsChangedListener$0(this.f163b, windowInsetsController, i);
    }
}

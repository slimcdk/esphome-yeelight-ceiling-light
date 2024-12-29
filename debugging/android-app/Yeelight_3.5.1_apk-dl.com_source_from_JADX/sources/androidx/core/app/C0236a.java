package androidx.core.app;

import android.app.Activity;

/* renamed from: androidx.core.app.a */
public final /* synthetic */ class C0236a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Activity f82a;

    public /* synthetic */ C0236a(Activity activity) {
        this.f82a = activity;
    }

    public final void run() {
        ActivityCompat.lambda$recreate$0(this.f82a);
    }
}

package androidx.constraintlayout.motion.widget;

import android.view.View;

/* renamed from: androidx.constraintlayout.motion.widget.a */
public final /* synthetic */ class C0207a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ViewTransition f71a;

    /* renamed from: b */
    public final /* synthetic */ View[] f72b;

    public /* synthetic */ C0207a(ViewTransition viewTransition, View[] viewArr) {
        this.f71a = viewTransition;
        this.f72b = viewArr;
    }

    public final void run() {
        this.f71a.lambda$applyTransition$0(this.f72b);
    }
}

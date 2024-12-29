package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: androidx.core.view.i */
public final /* synthetic */ class C0301i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ ViewPropertyAnimatorUpdateListener f158a;

    /* renamed from: b */
    public final /* synthetic */ View f159b;

    public /* synthetic */ C0301i(ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener, View view) {
        this.f158a = viewPropertyAnimatorUpdateListener;
        this.f159b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f158a.onAnimationUpdate(this.f159b);
    }
}

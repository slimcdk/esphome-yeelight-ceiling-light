package androidx.core.view;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* renamed from: androidx.core.view.e */
public final /* synthetic */ class C0297e implements LifecycleEventObserver {

    /* renamed from: a */
    public final /* synthetic */ MenuHostHelper f153a;

    /* renamed from: b */
    public final /* synthetic */ Lifecycle.State f154b;

    /* renamed from: c */
    public final /* synthetic */ MenuProvider f155c;

    public /* synthetic */ C0297e(MenuHostHelper menuHostHelper, Lifecycle.State state, MenuProvider menuProvider) {
        this.f153a = menuHostHelper;
        this.f154b = state;
        this.f155c = menuProvider;
    }

    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        this.f153a.lambda$addMenuProvider$1(this.f154b, this.f155c, lifecycleOwner, event);
    }
}

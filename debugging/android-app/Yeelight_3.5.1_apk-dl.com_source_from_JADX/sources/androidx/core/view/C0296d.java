package androidx.core.view;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* renamed from: androidx.core.view.d */
public final /* synthetic */ class C0296d implements LifecycleEventObserver {

    /* renamed from: a */
    public final /* synthetic */ MenuHostHelper f151a;

    /* renamed from: b */
    public final /* synthetic */ MenuProvider f152b;

    public /* synthetic */ C0296d(MenuHostHelper menuHostHelper, MenuProvider menuProvider) {
        this.f151a = menuHostHelper;
        this.f152b = menuProvider;
    }

    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        this.f151a.lambda$addMenuProvider$0(this.f152b, lifecycleOwner, event);
    }
}

package androidx.core.view;

import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.ViewCompat;

/* renamed from: androidx.core.view.h */
public final /* synthetic */ class C0300h implements View.OnUnhandledKeyEventListener {

    /* renamed from: a */
    public final /* synthetic */ ViewCompat.OnUnhandledKeyEventListenerCompat f157a;

    public /* synthetic */ C0300h(ViewCompat.OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
        this.f157a = onUnhandledKeyEventListenerCompat;
    }

    public final boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
        return this.f157a.onUnhandledKeyEvent(view, keyEvent);
    }
}

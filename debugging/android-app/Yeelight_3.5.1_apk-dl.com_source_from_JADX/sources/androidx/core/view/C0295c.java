package androidx.core.view;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: androidx.core.view.c */
public final /* synthetic */ class C0295c implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ DragStartHelper f150a;

    public /* synthetic */ C0295c(DragStartHelper dragStartHelper) {
        this.f150a = dragStartHelper;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f150a.onTouch(view, motionEvent);
    }
}

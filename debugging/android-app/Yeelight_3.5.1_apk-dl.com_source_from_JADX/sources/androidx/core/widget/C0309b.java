package androidx.core.widget;

/* renamed from: androidx.core.widget.b */
public final /* synthetic */ class C0309b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ContentLoadingProgressBar f165a;

    public /* synthetic */ C0309b(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.f165a = contentLoadingProgressBar;
    }

    public final void run() {
        this.f165a.hideOnUiThread();
    }
}

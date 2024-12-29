package androidx.core.widget;

/* renamed from: androidx.core.widget.d */
public final /* synthetic */ class C0311d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ContentLoadingProgressBar f167a;

    public /* synthetic */ C0311d(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.f167a = contentLoadingProgressBar;
    }

    public final void run() {
        this.f167a.showOnUiThread();
    }
}

package androidx.core.content.res;

import androidx.core.content.res.ResourcesCompat;

/* renamed from: androidx.core.content.res.a */
public final /* synthetic */ class C0242a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ResourcesCompat.FontCallback f92a;

    /* renamed from: b */
    public final /* synthetic */ int f93b;

    public /* synthetic */ C0242a(ResourcesCompat.FontCallback fontCallback, int i) {
        this.f92a = fontCallback;
        this.f93b = i;
    }

    public final void run() {
        this.f92a.lambda$callbackFailAsync$1(this.f93b);
    }
}

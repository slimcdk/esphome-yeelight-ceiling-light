package androidx.core.content.res;

import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;

/* renamed from: androidx.core.content.res.b */
public final /* synthetic */ class C0243b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ResourcesCompat.FontCallback f94a;

    /* renamed from: b */
    public final /* synthetic */ Typeface f95b;

    public /* synthetic */ C0243b(ResourcesCompat.FontCallback fontCallback, Typeface typeface) {
        this.f94a = fontCallback;
        this.f95b = typeface;
    }

    public final void run() {
        this.f94a.lambda$callbackSuccessAsync$0(this.f95b);
    }
}

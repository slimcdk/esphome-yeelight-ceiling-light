package p011c.p083d.p090b;

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: c.d.b.h */
class C1183h implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final C1219x f1993a;

    /* renamed from: b */
    final WeakReference<ImageView> f1994b;

    /* renamed from: c */
    C1172e f1995c;

    C1183h(C1219x xVar, ImageView imageView, C1172e eVar) {
        this.f1993a = xVar;
        this.f1994b = new WeakReference<>(imageView);
        this.f1995c = eVar;
        imageView.getViewTreeObserver().addOnPreDrawListener(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9956a() {
        this.f1995c = null;
        ImageView imageView = (ImageView) this.f1994b.get();
        if (imageView != null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
        }
    }

    public boolean onPreDraw() {
        ImageView imageView = (ImageView) this.f1994b.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            viewTreeObserver.removeOnPreDrawListener(this);
            C1219x xVar = this.f1993a;
            xVar.mo10040h();
            xVar.mo10039g(width, height);
            xVar.mo10037e(imageView, this.f1995c);
        }
        return true;
    }
}

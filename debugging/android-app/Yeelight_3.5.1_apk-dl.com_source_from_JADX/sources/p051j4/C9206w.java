package p051j4;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.HorizontalScrollView;

/* renamed from: j4.w */
public class C9206w {

    /* renamed from: j4.w$a */
    class C9207a implements ViewTreeObserver.OnGlobalLayoutListener {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public float f17020a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Rect f17021b = new Rect();
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f17022c = false;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f17023d = false;

        /* renamed from: e */
        final /* synthetic */ View f17024e;

        /* renamed from: f */
        final /* synthetic */ HorizontalScrollView f17025f;

        /* renamed from: j4.w$a$a */
        class C9208a implements View.OnTouchListener {
            C9208a() {
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 1) {
                    boolean unused = C9207a.this.f17023d = false;
                    if (C9207a.this.mo37286j()) {
                        C9207a.this.mo37285h();
                    }
                } else if (action == 2) {
                    float c = C9207a.this.f17020a;
                    float x = motionEvent.getX();
                    int i = (int) (x - c);
                    if (!C9207a.this.f17022c) {
                        i = 0;
                    }
                    C9207a.this.mo37287k();
                    if (C9207a.this.f17023d) {
                        if (C9207a.this.f17021b.isEmpty()) {
                            C9207a.this.f17021b.set(C9207a.this.f17024e.getLeft(), C9207a.this.f17024e.getTop(), C9207a.this.f17024e.getRight(), C9207a.this.f17024e.getBottom());
                        }
                        View view2 = C9207a.this.f17024e;
                        int i2 = i / 2;
                        view2.layout(view2.getLeft() + i2, C9207a.this.f17024e.getTop(), C9207a.this.f17024e.getRight() + i2, C9207a.this.f17024e.getBottom());
                    }
                    boolean unused2 = C9207a.this.f17022c = true;
                    float unused3 = C9207a.this.f17020a = x;
                }
                return false;
            }
        }

        C9207a(View view, HorizontalScrollView horizontalScrollView) {
            this.f17024e = view;
            this.f17025f = horizontalScrollView;
        }

        @SuppressLint({"NewApi"})
        /* renamed from: i */
        private void m22214i() {
            this.f17025f.setOverScrollMode(2);
        }

        /* renamed from: h */
        public void mo37285h() {
            TranslateAnimation translateAnimation = new TranslateAnimation((float) this.f17024e.getLeft(), (float) this.f17021b.left, 0.0f, 0.0f);
            translateAnimation.setDuration(300);
            translateAnimation.setInterpolator(new DecelerateInterpolator());
            this.f17024e.startAnimation(translateAnimation);
            View view = this.f17024e;
            Rect rect = this.f17021b;
            view.layout(rect.left, rect.top, rect.right, rect.bottom);
            this.f17021b.setEmpty();
            this.f17022c = false;
            this.f17020a = 0.0f;
        }

        /* renamed from: j */
        public boolean mo37286j() {
            return !this.f17021b.isEmpty();
        }

        /* renamed from: k */
        public void mo37287k() {
            this.f17023d = true;
        }

        public void onGlobalLayout() {
            this.f17025f.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            if (Build.VERSION.SDK_INT > 9) {
                m22214i();
            }
            this.f17025f.setOnTouchListener(new C9208a());
        }
    }

    /* renamed from: a */
    public static void m22206a(HorizontalScrollView horizontalScrollView) {
        horizontalScrollView.getViewTreeObserver().addOnGlobalLayoutListener(new C9207a(horizontalScrollView.getChildAt(0), horizontalScrollView));
    }
}

package com.yeelight.yeelib.utils;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.HorizontalScrollView;

/* renamed from: com.yeelight.yeelib.utils.x */
public class C10560x {

    /* renamed from: com.yeelight.yeelib.utils.x$a */
    static class C10561a implements ViewTreeObserver.OnGlobalLayoutListener {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public float f20177a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Rect f20178b = new Rect();
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f20179c = false;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f20180d = false;

        /* renamed from: e */
        final /* synthetic */ View f20181e;

        /* renamed from: f */
        final /* synthetic */ HorizontalScrollView f20182f;

        /* renamed from: com.yeelight.yeelib.utils.x$a$a */
        class C10562a implements View.OnTouchListener {
            C10562a() {
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 1) {
                    boolean unused = C10561a.this.f20180d = false;
                    if (C10561a.this.mo33387j()) {
                        C10561a.this.mo33386h();
                    }
                } else if (action == 2) {
                    float c = C10561a.this.f20177a;
                    float x = motionEvent.getX();
                    int i = (int) (x - c);
                    if (!C10561a.this.f20179c) {
                        i = 0;
                    }
                    C10561a.this.mo33388k();
                    if (C10561a.this.f20180d) {
                        if (C10561a.this.f20178b.isEmpty()) {
                            C10561a.this.f20178b.set(C10561a.this.f20181e.getLeft(), C10561a.this.f20181e.getTop(), C10561a.this.f20181e.getRight(), C10561a.this.f20181e.getBottom());
                        }
                        View view2 = C10561a.this.f20181e;
                        int i2 = i / 2;
                        view2.layout(view2.getLeft() + i2, C10561a.this.f20181e.getTop(), C10561a.this.f20181e.getRight() + i2, C10561a.this.f20181e.getBottom());
                    }
                    boolean unused2 = C10561a.this.f20179c = true;
                    float unused3 = C10561a.this.f20177a = x;
                }
                return false;
            }
        }

        C10561a(View view, HorizontalScrollView horizontalScrollView) {
            this.f20181e = view;
            this.f20182f = horizontalScrollView;
        }

        @SuppressLint({"NewApi"})
        /* renamed from: i */
        private void m25829i() {
            this.f20182f.setOverScrollMode(2);
        }

        /* renamed from: h */
        public void mo33386h() {
            TranslateAnimation translateAnimation = new TranslateAnimation((float) this.f20181e.getLeft(), (float) this.f20178b.left, 0.0f, 0.0f);
            translateAnimation.setDuration(300);
            translateAnimation.setInterpolator(new DecelerateInterpolator());
            this.f20181e.startAnimation(translateAnimation);
            View view = this.f20181e;
            Rect rect = this.f20178b;
            view.layout(rect.left, rect.top, rect.right, rect.bottom);
            this.f20178b.setEmpty();
            this.f20179c = false;
            this.f20177a = 0.0f;
        }

        /* renamed from: j */
        public boolean mo33387j() {
            return !this.f20178b.isEmpty();
        }

        /* renamed from: k */
        public void mo33388k() {
            this.f20180d = true;
        }

        public void onGlobalLayout() {
            this.f20182f.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            if (Build.VERSION.SDK_INT > 9) {
                m25829i();
            }
            this.f20182f.setOnTouchListener(new C10562a());
        }
    }

    /* renamed from: a */
    public static void m25821a(HorizontalScrollView horizontalScrollView) {
        horizontalScrollView.getViewTreeObserver().addOnGlobalLayoutListener(new C10561a(horizontalScrollView.getChildAt(0), horizontalScrollView));
    }
}

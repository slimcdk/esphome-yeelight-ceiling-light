package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private static final float DEFAULT_ALPHA_END_DISTANCE = 0.5f;
    private static final float DEFAULT_ALPHA_START_DISTANCE = 0.0f;
    private static final float DEFAULT_DRAG_DISMISS_THRESHOLD = 0.5f;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final int SWIPE_DIRECTION_ANY = 2;
    public static final int SWIPE_DIRECTION_END_TO_START = 1;
    public static final int SWIPE_DIRECTION_START_TO_END = 0;
    float alphaEndSwipeDistance = 0.5f;
    float alphaStartSwipeDistance = 0.0f;
    private final ViewDragHelper.Callback dragCallback = new ViewDragHelper.Callback() {
        private static final int INVALID_POINTER_ID = -1;
        private int activePointerId = -1;
        private int originalCapturedViewLeft;

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0025 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0034 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean shouldDismiss(android.view.View r6, float r7) {
            /*
                r5 = this;
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x0036
                int r6 = androidx.core.view.ViewCompat.getLayoutDirection(r6)
                if (r6 != r2) goto L_0x000f
                r6 = 1
                goto L_0x0010
            L_0x000f:
                r6 = 0
            L_0x0010:
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r3 = r3.swipeDirection
                r4 = 2
                if (r3 != r4) goto L_0x0018
                return r2
            L_0x0018:
                if (r3 != 0) goto L_0x0027
                if (r6 == 0) goto L_0x0021
                int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r6 >= 0) goto L_0x0026
                goto L_0x0025
            L_0x0021:
                int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r6 <= 0) goto L_0x0026
            L_0x0025:
                r1 = 1
            L_0x0026:
                return r1
            L_0x0027:
                if (r3 != r2) goto L_0x0035
                if (r6 == 0) goto L_0x0030
                int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r6 <= 0) goto L_0x0035
                goto L_0x0034
            L_0x0030:
                int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r6 >= 0) goto L_0x0035
            L_0x0034:
                r1 = 1
            L_0x0035:
                return r1
            L_0x0036:
                int r7 = r6.getLeft()
                int r0 = r5.originalCapturedViewLeft
                int r7 = r7 - r0
                int r6 = r6.getWidth()
                float r6 = (float) r6
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r0 = r0.dragDismissThreshold
                float r6 = r6 * r0
                int r6 = java.lang.Math.round(r6)
                int r7 = java.lang.Math.abs(r7)
                if (r7 < r6) goto L_0x0053
                r1 = 1
            L_0x0053:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C19301.shouldDismiss(android.view.View, float):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
            if (r5 != false) goto L_0x001c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            if (r5 != false) goto L_0x0012;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            r5 = r2.originalCapturedViewLeft;
            r3 = r3.getWidth() + r5;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int clampViewPositionHorizontal(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = androidx.core.view.ViewCompat.getLayoutDirection(r3)
                r0 = 1
                if (r5 != r0) goto L_0x0009
                r5 = 1
                goto L_0x000a
            L_0x0009:
                r5 = 0
            L_0x000a:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.swipeDirection
                if (r1 != 0) goto L_0x0024
                if (r5 == 0) goto L_0x001c
            L_0x0012:
                int r5 = r2.originalCapturedViewLeft
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.originalCapturedViewLeft
                goto L_0x0037
            L_0x001c:
                int r5 = r2.originalCapturedViewLeft
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L_0x0037
            L_0x0024:
                if (r1 != r0) goto L_0x0029
                if (r5 == 0) goto L_0x0012
                goto L_0x001c
            L_0x0029:
                int r5 = r2.originalCapturedViewLeft
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.originalCapturedViewLeft
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L_0x0037:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.clamp((int) r5, (int) r4, (int) r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C19301.clampViewPositionHorizontal(android.view.View, int, int):int");
        }

        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        public int getViewHorizontalDragRange(View view) {
            return view.getWidth();
        }

        public void onViewCaptured(View view, int i) {
            this.activePointerId = i;
            this.originalCapturedViewLeft = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        public void onViewDragStateChanged(int i) {
            OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
            if (onDismissListener != null) {
                onDismissListener.onDragStateChanged(i);
            }
        }

        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.originalCapturedViewLeft) + (((float) view.getWidth()) * SwipeDismissBehavior.this.alphaStartSwipeDistance);
            float width2 = ((float) this.originalCapturedViewLeft) + (((float) view.getWidth()) * SwipeDismissBehavior.this.alphaEndSwipeDistance);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.clamp(0.0f, 1.0f - SwipeDismissBehavior.fraction(width, width2, f), 1.0f));
            }
        }

        public void onViewReleased(View view, float f, float f2) {
            boolean z;
            int i;
            OnDismissListener onDismissListener;
            this.activePointerId = -1;
            int width = view.getWidth();
            if (shouldDismiss(view, f)) {
                int left = view.getLeft();
                int i2 = this.originalCapturedViewLeft;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.originalCapturedViewLeft;
                z = false;
            }
            if (SwipeDismissBehavior.this.viewDragHelper.settleCapturedViewAt(i, view.getTop())) {
                ViewCompat.postOnAnimation(view, new SettleRunnable(view, z));
            } else if (z && (onDismissListener = SwipeDismissBehavior.this.listener) != null) {
                onDismissListener.onDismiss(view);
            }
        }

        public boolean tryCaptureView(View view, int i) {
            return this.activePointerId == -1 && SwipeDismissBehavior.this.canSwipeDismissView(view);
        }
    };
    float dragDismissThreshold = 0.5f;
    private boolean interceptingEvents;
    OnDismissListener listener;
    private float sensitivity = 0.0f;
    private boolean sensitivitySet;
    int swipeDirection = 2;
    ViewDragHelper viewDragHelper;

    public interface OnDismissListener {
        void onDismiss(View view);

        void onDragStateChanged(int i);
    }

    private class SettleRunnable implements Runnable {
        private final boolean dismiss;
        private final View view;

        SettleRunnable(View view2, boolean z) {
            this.view = view2;
            this.dismiss = z;
        }

        public void run() {
            OnDismissListener onDismissListener;
            ViewDragHelper viewDragHelper = SwipeDismissBehavior.this.viewDragHelper;
            if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                ViewCompat.postOnAnimation(this.view, this);
            } else if (this.dismiss && (onDismissListener = SwipeDismissBehavior.this.listener) != null) {
                onDismissListener.onDismiss(this.view);
            }
        }
    }

    static float clamp(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    static int clamp(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    private void ensureViewDragHelper(ViewGroup viewGroup) {
        if (this.viewDragHelper == null) {
            this.viewDragHelper = this.sensitivitySet ? ViewDragHelper.create(viewGroup, this.sensitivity, this.dragCallback) : ViewDragHelper.create(viewGroup, this.dragCallback);
        }
    }

    static float fraction(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    public boolean canSwipeDismissView(@NonNull View view) {
        return true;
    }

    public int getDragState() {
        ViewDragHelper viewDragHelper2 = this.viewDragHelper;
        if (viewDragHelper2 != null) {
            return viewDragHelper2.getViewDragState();
        }
        return 0;
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.interceptingEvents;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.isPointInChildBounds(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.interceptingEvents = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.interceptingEvents = false;
        }
        if (!z) {
            return false;
        }
        ensureViewDragHelper(coordinatorLayout);
        return this.viewDragHelper.shouldInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper2 = this.viewDragHelper;
        if (viewDragHelper2 == null) {
            return false;
        }
        viewDragHelper2.processTouchEvent(motionEvent);
        return true;
    }

    public void setDragDismissDistance(float f) {
        this.dragDismissThreshold = clamp(0.0f, f, 1.0f);
    }

    public void setEndAlphaSwipeDistance(float f) {
        this.alphaEndSwipeDistance = clamp(0.0f, f, 1.0f);
    }

    public void setListener(OnDismissListener onDismissListener) {
        this.listener = onDismissListener;
    }

    public void setSensitivity(float f) {
        this.sensitivity = f;
        this.sensitivitySet = true;
    }

    public void setStartAlphaSwipeDistance(float f) {
        this.alphaStartSwipeDistance = clamp(0.0f, f, 1.0f);
    }

    public void setSwipeDirection(int i) {
        this.swipeDirection = i;
    }
}

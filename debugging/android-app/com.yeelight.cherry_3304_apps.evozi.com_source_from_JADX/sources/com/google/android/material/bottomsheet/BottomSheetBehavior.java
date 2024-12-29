package com.google.android.material.bottomsheet;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    int activePointerId;
    private BottomSheetCallback callback;
    int collapsedOffset;
    private final ViewDragHelper.Callback dragCallback = new ViewDragHelper.Callback() {
        public int clampViewPositionHorizontal(@NonNull View view, int i, int i2) {
            return view.getLeft();
        }

        public int clampViewPositionVertical(@NonNull View view, int i, int i2) {
            int access$100 = BottomSheetBehavior.this.getExpandedOffset();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return MathUtils.clamp(i, access$100, bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset);
        }

        public int getViewVerticalDragRange(@NonNull View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset;
        }

        public void onViewDragStateChanged(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.setStateInternal(1);
            }
        }

        public void onViewPositionChanged(@NonNull View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.dispatchOnSlide(i2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a0, code lost:
            if (r9 < java.lang.Math.abs(r9 - r10.collapsedOffset)) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b2, code lost:
            if (java.lang.Math.abs(r9 - r1) < java.lang.Math.abs(r9 - r7.this$0.collapsedOffset)) goto L_0x00b4;
         */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00c8  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00d9  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onViewReleased(@androidx.annotation.NonNull android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r0 = 0
                r1 = 0
                r2 = 4
                r3 = 6
                r4 = 3
                int r5 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r5 >= 0) goto L_0x0029
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.fitToContents
                if (r9 == 0) goto L_0x0018
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.fitToContentsOffset
                r2 = 3
                goto L_0x00ba
            L_0x0018:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.halfExpandedOffset
                if (r9 <= r10) goto L_0x0025
                r0 = r10
            L_0x0023:
                r2 = 6
                goto L_0x0026
            L_0x0025:
                r2 = 3
            L_0x0026:
                r9 = r0
                goto L_0x00ba
            L_0x0029:
                com.google.android.material.bottomsheet.BottomSheetBehavior r5 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = r5.hideable
                if (r6 == 0) goto L_0x0051
                boolean r5 = r5.shouldHide(r8, r10)
                if (r5 == 0) goto L_0x0051
                int r5 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r6.collapsedOffset
                if (r5 > r6) goto L_0x004b
                float r5 = java.lang.Math.abs(r9)
                float r6 = java.lang.Math.abs(r10)
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 >= 0) goto L_0x0051
            L_0x004b:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.parentHeight
                r2 = 5
                goto L_0x00ba
            L_0x0051:
                int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r1 == 0) goto L_0x0067
                float r9 = java.lang.Math.abs(r9)
                float r10 = java.lang.Math.abs(r10)
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 <= 0) goto L_0x0062
                goto L_0x0067
            L_0x0062:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.collapsedOffset
                goto L_0x00ba
            L_0x0067:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r10.fitToContents
                if (r10 == 0) goto L_0x0092
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.fitToContentsOffset
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.collapsedOffset
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x008d
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.fitToContentsOffset
                goto L_0x0025
            L_0x008d:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.collapsedOffset
                goto L_0x0026
            L_0x0092:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r1 = r10.halfExpandedOffset
                if (r9 >= r1) goto L_0x00a3
                int r10 = r10.collapsedOffset
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto L_0x00b4
                goto L_0x0025
            L_0x00a3:
                int r10 = r9 - r1
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.collapsedOffset
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x008d
            L_0x00b4:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.halfExpandedOffset
                goto L_0x0023
            L_0x00ba:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                androidx.customview.widget.ViewDragHelper r10 = r10.viewDragHelper
                int r0 = r8.getLeft()
                boolean r9 = r10.settleCapturedViewAt(r0, r9)
                if (r9 == 0) goto L_0x00d9
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r10 = 2
                r9.setStateInternal(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior$SettleRunnable r9 = new com.google.android.material.bottomsheet.BottomSheetBehavior$SettleRunnable
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r9.<init>(r8, r2)
                androidx.core.view.ViewCompat.postOnAnimation(r8, r9)
                goto L_0x00de
            L_0x00d9:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r8.setStateInternal(r2)
            L_0x00de:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C25592.onViewReleased(android.view.View, float, float):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
            r7 = (android.view.View) r0.nestedScrollingChildRef.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
            r7 = r5.this$0.viewRef;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean tryCaptureView(@androidx.annotation.NonNull android.view.View r6, int r7) {
            /*
                r5 = this;
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r1 = r0.state
                r2 = 1
                r3 = 0
                if (r1 != r2) goto L_0x0009
                return r3
            L_0x0009:
                boolean r4 = r0.touchingScrollingChild
                if (r4 == 0) goto L_0x000e
                return r3
            L_0x000e:
                r4 = 3
                if (r1 != r4) goto L_0x0027
                int r1 = r0.activePointerId
                if (r1 != r7) goto L_0x0027
                java.lang.ref.WeakReference<android.view.View> r7 = r0.nestedScrollingChildRef
                java.lang.Object r7 = r7.get()
                android.view.View r7 = (android.view.View) r7
                if (r7 == 0) goto L_0x0027
                r0 = -1
                boolean r7 = r7.canScrollVertically(r0)
                if (r7 == 0) goto L_0x0027
                return r3
            L_0x0027:
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                java.lang.ref.WeakReference<V> r7 = r7.viewRef
                if (r7 == 0) goto L_0x0034
                java.lang.Object r7 = r7.get()
                if (r7 != r6) goto L_0x0034
                goto L_0x0035
            L_0x0034:
                r2 = 0
            L_0x0035:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C25592.tryCaptureView(android.view.View, int):boolean");
        }
    };
    /* access modifiers changed from: private */
    public boolean fitToContents = true;
    int fitToContentsOffset;
    int halfExpandedOffset;
    boolean hideable;
    private boolean ignoreEvents;
    private Map<View, Integer> importantForAccessibilityMap;
    private int initialY;
    private int lastNestedScrollDy;
    private int lastPeekHeight;
    private float maximumVelocity;
    private boolean nestedScrolled;
    WeakReference<View> nestedScrollingChildRef;
    int parentHeight;
    private int peekHeight;
    private boolean peekHeightAuto;
    private int peekHeightMin;
    private boolean skipCollapsed;
    int state = 4;
    boolean touchingScrollingChild;
    private VelocityTracker velocityTracker;
    ViewDragHelper viewDragHelper;
    WeakReference<V> viewRef;

    public static abstract class BottomSheetCallback {
        public abstract void onSlide(@NonNull View view, float f);

        public abstract void onStateChanged(@NonNull View view, int i);
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        final int state;

        public SavedState(Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.state = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
        }
    }

    private class SettleRunnable implements Runnable {
        private final int targetState;
        private final View view;

        SettleRunnable(View view2, int i) {
            this.view = view2;
            this.targetState = i;
        }

        public void run() {
            ViewDragHelper viewDragHelper = BottomSheetBehavior.this.viewDragHelper;
            if (viewDragHelper == null || !viewDragHelper.continueSettling(true)) {
                BottomSheetBehavior.this.setStateInternal(this.targetState);
            } else {
                ViewCompat.postOnAnimation(this.view, this);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public BottomSheetBehavior() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001f, code lost:
        r1 = r1.data;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BottomSheetBehavior(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r3.<init>(r4, r5)
            r0 = 1
            r3.fitToContents = r0
            r1 = 4
            r3.state = r1
            com.google.android.material.bottomsheet.BottomSheetBehavior$2 r1 = new com.google.android.material.bottomsheet.BottomSheetBehavior$2
            r1.<init>()
            r3.dragCallback = r1
            int[] r1 = com.google.android.material.C2535R.styleable.BottomSheetBehavior_Layout
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r1)
            int r1 = com.google.android.material.C2535R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight
            android.util.TypedValue r1 = r5.peekValue(r1)
            r2 = -1
            if (r1 == 0) goto L_0x0024
            int r1 = r1.data
            if (r1 != r2) goto L_0x0024
            goto L_0x002a
        L_0x0024:
            int r1 = com.google.android.material.C2535R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight
            int r1 = r5.getDimensionPixelSize(r1, r2)
        L_0x002a:
            r3.setPeekHeight(r1)
            int r1 = com.google.android.material.C2535R.styleable.BottomSheetBehavior_Layout_behavior_hideable
            r2 = 0
            boolean r1 = r5.getBoolean(r1, r2)
            r3.setHideable(r1)
            int r1 = com.google.android.material.C2535R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents
            boolean r0 = r5.getBoolean(r1, r0)
            r3.setFitToContents(r0)
            int r0 = com.google.android.material.C2535R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed
            boolean r0 = r5.getBoolean(r0, r2)
            r3.setSkipCollapsed(r0)
            r5.recycle()
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            int r4 = r4.getScaledMaximumFlingVelocity()
            float r4 = (float) r4
            r3.maximumVelocity = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private void calculateCollapsedOffset() {
        this.collapsedOffset = this.fitToContents ? Math.max(this.parentHeight - this.lastPeekHeight, this.fitToContentsOffset) : this.parentHeight - this.lastPeekHeight;
    }

    public static <V extends View> BottomSheetBehavior<V> from(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* access modifiers changed from: private */
    public int getExpandedOffset() {
        if (this.fitToContents) {
            return this.fitToContentsOffset;
        }
        return 0;
    }

    private float getYVelocity() {
        VelocityTracker velocityTracker2 = this.velocityTracker;
        if (velocityTracker2 == null) {
            return 0.0f;
        }
        velocityTracker2.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getYVelocity(this.activePointerId);
    }

    private void reset() {
        this.activePointerId = -1;
        VelocityTracker velocityTracker2 = this.velocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.velocityTracker = null;
        }
    }

    private void updateImportantForAccessibility(boolean z) {
        int i;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (Build.VERSION.SDK_INT >= 16 && z) {
                    if (this.importantForAccessibilityMap == null) {
                        this.importantForAccessibilityMap = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    if (childAt != this.viewRef.get()) {
                        if (!z) {
                            Map<View, Integer> map = this.importantForAccessibilityMap;
                            if (map != null && map.containsKey(childAt)) {
                                i = this.importantForAccessibilityMap.get(childAt).intValue();
                            }
                        } else {
                            if (Build.VERSION.SDK_INT >= 16) {
                                this.importantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            i = 4;
                        }
                        ViewCompat.setImportantForAccessibility(childAt, i);
                    }
                }
                if (!z) {
                    this.importantForAccessibilityMap = null;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnSlide(int i) {
        BottomSheetCallback bottomSheetCallback;
        float f;
        float f2;
        View view = (View) this.viewRef.get();
        if (view != null && (bottomSheetCallback = this.callback) != null) {
            int i2 = this.collapsedOffset;
            if (i > i2) {
                f = (float) (i2 - i);
                f2 = (float) (this.parentHeight - i2);
            } else {
                f = (float) (i2 - i);
                f2 = (float) (i2 - getExpandedOffset());
            }
            bottomSheetCallback.onSlide(view, f / f2);
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public View findScrollingChild(View view) {
        if (ViewCompat.isNestedScrollingEnabled(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View findScrollingChild = findScrollingChild(viewGroup.getChildAt(i));
            if (findScrollingChild != null) {
                return findScrollingChild;
            }
        }
        return null;
    }

    public final int getPeekHeight() {
        if (this.peekHeightAuto) {
            return -1;
        }
        return this.peekHeight;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public int getPeekHeightMin() {
        return this.peekHeightMin;
    }

    public boolean getSkipCollapsed() {
        return this.skipCollapsed;
    }

    public final int getState() {
        return this.state;
    }

    public boolean isFitToContents() {
        return this.fitToContents;
    }

    public boolean isHideable() {
        return this.hideable;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r9, V r10, android.view.MotionEvent r11) {
        /*
            r8 = this;
            boolean r0 = r10.isShown()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000b
            r8.ignoreEvents = r2
            return r1
        L_0x000b:
            int r0 = r11.getActionMasked()
            if (r0 != 0) goto L_0x0014
            r8.reset()
        L_0x0014:
            android.view.VelocityTracker r3 = r8.velocityTracker
            if (r3 != 0) goto L_0x001e
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r8.velocityTracker = r3
        L_0x001e:
            android.view.VelocityTracker r3 = r8.velocityTracker
            r3.addMovement(r11)
            r3 = 0
            r4 = -1
            if (r0 == 0) goto L_0x0038
            if (r0 == r2) goto L_0x002d
            r10 = 3
            if (r0 == r10) goto L_0x002d
            goto L_0x0077
        L_0x002d:
            r8.touchingScrollingChild = r1
            r8.activePointerId = r4
            boolean r10 = r8.ignoreEvents
            if (r10 == 0) goto L_0x0077
            r8.ignoreEvents = r1
            return r1
        L_0x0038:
            float r5 = r11.getX()
            int r5 = (int) r5
            float r6 = r11.getY()
            int r6 = (int) r6
            r8.initialY = r6
            java.lang.ref.WeakReference<android.view.View> r6 = r8.nestedScrollingChildRef
            if (r6 == 0) goto L_0x004f
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            goto L_0x0050
        L_0x004f:
            r6 = r3
        L_0x0050:
            if (r6 == 0) goto L_0x0066
            int r7 = r8.initialY
            boolean r6 = r9.isPointInChildBounds(r6, r5, r7)
            if (r6 == 0) goto L_0x0066
            int r6 = r11.getActionIndex()
            int r6 = r11.getPointerId(r6)
            r8.activePointerId = r6
            r8.touchingScrollingChild = r2
        L_0x0066:
            int r6 = r8.activePointerId
            if (r6 != r4) goto L_0x0074
            int r4 = r8.initialY
            boolean r10 = r9.isPointInChildBounds(r10, r5, r4)
            if (r10 != 0) goto L_0x0074
            r10 = 1
            goto L_0x0075
        L_0x0074:
            r10 = 0
        L_0x0075:
            r8.ignoreEvents = r10
        L_0x0077:
            boolean r10 = r8.ignoreEvents
            if (r10 != 0) goto L_0x0086
            androidx.customview.widget.ViewDragHelper r10 = r8.viewDragHelper
            if (r10 == 0) goto L_0x0086
            boolean r10 = r10.shouldInterceptTouchEvent(r11)
            if (r10 == 0) goto L_0x0086
            return r2
        L_0x0086:
            java.lang.ref.WeakReference<android.view.View> r10 = r8.nestedScrollingChildRef
            if (r10 == 0) goto L_0x0091
            java.lang.Object r10 = r10.get()
            r3 = r10
            android.view.View r3 = (android.view.View) r3
        L_0x0091:
            r10 = 2
            if (r0 != r10) goto L_0x00ca
            if (r3 == 0) goto L_0x00ca
            boolean r10 = r8.ignoreEvents
            if (r10 != 0) goto L_0x00ca
            int r10 = r8.state
            if (r10 == r2) goto L_0x00ca
            float r10 = r11.getX()
            int r10 = (int) r10
            float r0 = r11.getY()
            int r0 = (int) r0
            boolean r9 = r9.isPointInChildBounds(r3, r10, r0)
            if (r9 != 0) goto L_0x00ca
            androidx.customview.widget.ViewDragHelper r9 = r8.viewDragHelper
            if (r9 == 0) goto L_0x00ca
            int r9 = r8.initialY
            float r9 = (float) r9
            float r10 = r11.getY()
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            androidx.customview.widget.ViewDragHelper r10 = r8.viewDragHelper
            int r10 = r10.getTouchSlop()
            float r10 = (float) r10
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x00ca
            r1 = 1
        L_0x00ca:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, int r7) {
        /*
            r4 = this;
            boolean r0 = androidx.core.view.ViewCompat.getFitsSystemWindows(r5)
            r1 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = androidx.core.view.ViewCompat.getFitsSystemWindows(r6)
            if (r0 != 0) goto L_0x0010
            r6.setFitsSystemWindows(r1)
        L_0x0010:
            int r0 = r6.getTop()
            r5.onLayoutChild(r6, r7)
            int r7 = r5.getHeight()
            r4.parentHeight = r7
            boolean r7 = r4.peekHeightAuto
            if (r7 == 0) goto L_0x0043
            int r7 = r4.peekHeightMin
            if (r7 != 0) goto L_0x0031
            android.content.res.Resources r7 = r5.getResources()
            int r2 = com.google.android.material.C2535R.dimen.design_bottom_sheet_peek_height_min
            int r7 = r7.getDimensionPixelSize(r2)
            r4.peekHeightMin = r7
        L_0x0031:
            int r7 = r4.peekHeightMin
            int r2 = r4.parentHeight
            int r3 = r5.getWidth()
            int r3 = r3 * 9
            int r3 = r3 / 16
            int r2 = r2 - r3
            int r7 = java.lang.Math.max(r7, r2)
            goto L_0x0045
        L_0x0043:
            int r7 = r4.peekHeight
        L_0x0045:
            r4.lastPeekHeight = r7
            r7 = 0
            int r2 = r4.parentHeight
            int r3 = r6.getHeight()
            int r2 = r2 - r3
            int r7 = java.lang.Math.max(r7, r2)
            r4.fitToContentsOffset = r7
            int r7 = r4.parentHeight
            r2 = 2
            int r7 = r7 / r2
            r4.halfExpandedOffset = r7
            r4.calculateCollapsedOffset()
            int r7 = r4.state
            r3 = 3
            if (r7 != r3) goto L_0x006b
            int r7 = r4.getExpandedOffset()
        L_0x0067:
            androidx.core.view.ViewCompat.offsetTopAndBottom(r6, r7)
            goto L_0x008f
        L_0x006b:
            r3 = 6
            if (r7 != r3) goto L_0x0071
            int r7 = r4.halfExpandedOffset
            goto L_0x0067
        L_0x0071:
            boolean r3 = r4.hideable
            if (r3 == 0) goto L_0x007b
            r3 = 5
            if (r7 != r3) goto L_0x007b
            int r7 = r4.parentHeight
            goto L_0x0067
        L_0x007b:
            int r7 = r4.state
            r3 = 4
            if (r7 != r3) goto L_0x0083
            int r7 = r4.collapsedOffset
            goto L_0x0067
        L_0x0083:
            if (r7 == r1) goto L_0x0087
            if (r7 != r2) goto L_0x008f
        L_0x0087:
            int r7 = r6.getTop()
            int r0 = r0 - r7
            androidx.core.view.ViewCompat.offsetTopAndBottom(r6, r0)
        L_0x008f:
            androidx.customview.widget.ViewDragHelper r7 = r4.viewDragHelper
            if (r7 != 0) goto L_0x009b
            androidx.customview.widget.ViewDragHelper$Callback r7 = r4.dragCallback
            androidx.customview.widget.ViewDragHelper r5 = androidx.customview.widget.ViewDragHelper.create(r5, r7)
            r4.viewDragHelper = r5
        L_0x009b:
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r6)
            r4.viewRef = r5
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            android.view.View r6 = r4.findScrollingChild(r6)
            r5.<init>(r6)
            r4.nestedScrollingChildRef = r5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, float f, float f2) {
        return view == this.nestedScrollingChildRef.get() && (this.state != 3 || super.onNestedPreFling(coordinatorLayout, v, view, f, f2));
    }

    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        int i4;
        if (i3 != 1 && view == ((View) this.nestedScrollingChildRef.get())) {
            int top = v.getTop();
            int i5 = top - i2;
            if (i2 <= 0) {
                if (i2 < 0 && !view.canScrollVertically(-1)) {
                    int i6 = this.collapsedOffset;
                    if (i5 <= i6 || this.hideable) {
                        iArr[1] = i2;
                        ViewCompat.offsetTopAndBottom(v, -i2);
                        setStateInternal(1);
                    } else {
                        iArr[1] = top - i6;
                        ViewCompat.offsetTopAndBottom(v, -iArr[1]);
                        i4 = 4;
                    }
                }
                dispatchOnSlide(v.getTop());
                this.lastNestedScrollDy = i2;
                this.nestedScrolled = true;
            } else if (i5 < getExpandedOffset()) {
                iArr[1] = top - getExpandedOffset();
                ViewCompat.offsetTopAndBottom(v, -iArr[1]);
                i4 = 3;
            } else {
                iArr[1] = i2;
                ViewCompat.offsetTopAndBottom(v, -i2);
                setStateInternal(1);
                dispatchOnSlide(v.getTop());
                this.lastNestedScrollDy = i2;
                this.nestedScrolled = true;
            }
            setStateInternal(i4);
            dispatchOnSlide(v.getTop());
            this.lastNestedScrollDy = i2;
            this.nestedScrolled = true;
        }
    }

    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
        int i = savedState.state;
        if (i == 1 || i == 2) {
            i = 4;
        }
        this.state = i;
    }

    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v), this.state);
    }

    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
        this.lastNestedScrollDy = 0;
        this.nestedScrolled = false;
        return (i & 2) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        if (java.lang.Math.abs(r4 - r1) < java.lang.Math.abs(r4 - r3.collapsedOffset)) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onStopNestedScroll(@androidx.annotation.NonNull androidx.coordinatorlayout.widget.CoordinatorLayout r4, @androidx.annotation.NonNull V r5, @androidx.annotation.NonNull android.view.View r6, int r7) {
        /*
            r3 = this;
            int r4 = r5.getTop()
            int r7 = r3.getExpandedOffset()
            r0 = 3
            if (r4 != r7) goto L_0x000f
            r3.setStateInternal(r0)
            return
        L_0x000f:
            java.lang.ref.WeakReference<android.view.View> r4 = r3.nestedScrollingChildRef
            java.lang.Object r4 = r4.get()
            if (r6 != r4) goto L_0x009f
            boolean r4 = r3.nestedScrolled
            if (r4 != 0) goto L_0x001d
            goto L_0x009f
        L_0x001d:
            int r4 = r3.lastNestedScrollDy
            r6 = 0
            r7 = 4
            if (r4 <= 0) goto L_0x0028
            int r4 = r3.getExpandedOffset()
            goto L_0x0081
        L_0x0028:
            boolean r4 = r3.hideable
            if (r4 == 0) goto L_0x003a
            float r4 = r3.getYVelocity()
            boolean r4 = r3.shouldHide(r5, r4)
            if (r4 == 0) goto L_0x003a
            int r4 = r3.parentHeight
            r0 = 5
            goto L_0x0081
        L_0x003a:
            int r4 = r3.lastNestedScrollDy
            if (r4 != 0) goto L_0x007e
            int r4 = r5.getTop()
            boolean r1 = r3.fitToContents
            r2 = 6
            if (r1 == 0) goto L_0x005b
            int r1 = r3.fitToContentsOffset
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.collapsedOffset
            int r4 = r4 - r2
            int r4 = java.lang.Math.abs(r4)
            if (r1 >= r4) goto L_0x007e
            int r4 = r3.fitToContentsOffset
            goto L_0x0081
        L_0x005b:
            int r1 = r3.halfExpandedOffset
            if (r4 >= r1) goto L_0x006b
            int r7 = r3.collapsedOffset
            int r7 = r4 - r7
            int r7 = java.lang.Math.abs(r7)
            if (r4 >= r7) goto L_0x007a
            r4 = 0
            goto L_0x0081
        L_0x006b:
            int r0 = r4 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.collapsedOffset
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto L_0x007e
        L_0x007a:
            int r4 = r3.halfExpandedOffset
            r0 = 6
            goto L_0x0081
        L_0x007e:
            int r4 = r3.collapsedOffset
            r0 = 4
        L_0x0081:
            androidx.customview.widget.ViewDragHelper r7 = r3.viewDragHelper
            int r1 = r5.getLeft()
            boolean r4 = r7.smoothSlideViewTo(r5, r1, r4)
            if (r4 == 0) goto L_0x009a
            r4 = 2
            r3.setStateInternal(r4)
            com.google.android.material.bottomsheet.BottomSheetBehavior$SettleRunnable r4 = new com.google.android.material.bottomsheet.BottomSheetBehavior$SettleRunnable
            r4.<init>(r5, r0)
            androidx.core.view.ViewCompat.postOnAnimation(r5, r4)
            goto L_0x009d
        L_0x009a:
            r3.setStateInternal(r0)
        L_0x009d:
            r3.nestedScrolled = r6
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            return true;
        }
        ViewDragHelper viewDragHelper2 = this.viewDragHelper;
        if (viewDragHelper2 != null) {
            viewDragHelper2.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (actionMasked == 2 && !this.ignoreEvents && Math.abs(((float) this.initialY) - motionEvent.getY()) > ((float) this.viewDragHelper.getTouchSlop())) {
            this.viewDragHelper.captureChildView(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.ignoreEvents;
    }

    public void setBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        this.callback = bottomSheetCallback;
    }

    public void setFitToContents(boolean z) {
        if (this.fitToContents != z) {
            this.fitToContents = z;
            if (this.viewRef != null) {
                calculateCollapsedOffset();
            }
            setStateInternal((!this.fitToContents || this.state != 6) ? this.state : 3);
        }
    }

    public void setHideable(boolean z) {
        this.hideable = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setPeekHeight(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.peekHeightAuto
            if (r4 != 0) goto L_0x0015
            r3.peekHeightAuto = r0
            goto L_0x0024
        L_0x000c:
            boolean r2 = r3.peekHeightAuto
            if (r2 != 0) goto L_0x0017
            int r2 = r3.peekHeight
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0024
        L_0x0017:
            r3.peekHeightAuto = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.peekHeight = r1
            int r1 = r3.parentHeight
            int r1 = r1 - r4
            r3.collapsedOffset = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003a
            int r4 = r3.state
            r0 = 4
            if (r4 != r0) goto L_0x003a
            java.lang.ref.WeakReference<V> r4 = r3.viewRef
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003a
            r4.requestLayout()
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.setPeekHeight(int):void");
    }

    public void setSkipCollapsed(boolean z) {
        this.skipCollapsed = z;
    }

    public final void setState(final int i) {
        if (i != this.state) {
            WeakReference<V> weakReference = this.viewRef;
            if (weakReference != null) {
                final View view = (View) weakReference.get();
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent == null || !parent.isLayoutRequested() || !ViewCompat.isAttachedToWindow(view)) {
                        startSettlingAnimation(view, i);
                    } else {
                        view.post(new Runnable() {
                            public void run() {
                                BottomSheetBehavior.this.startSettlingAnimation(view, i);
                            }
                        });
                    }
                }
            } else if (i == 4 || i == 3 || i == 6 || (this.hideable && i == 5)) {
                this.state = i;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setStateInternal(int r3) {
        /*
            r2 = this;
            int r0 = r2.state
            if (r0 != r3) goto L_0x0005
            return
        L_0x0005:
            r2.state = r3
            r0 = 6
            if (r3 == r0) goto L_0x0016
            r0 = 3
            if (r3 != r0) goto L_0x000e
            goto L_0x0016
        L_0x000e:
            r0 = 5
            if (r3 == r0) goto L_0x0014
            r0 = 4
            if (r3 != r0) goto L_0x001a
        L_0x0014:
            r0 = 0
            goto L_0x0017
        L_0x0016:
            r0 = 1
        L_0x0017:
            r2.updateImportantForAccessibility(r0)
        L_0x001a:
            java.lang.ref.WeakReference<V> r0 = r2.viewRef
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x002b
            com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback r1 = r2.callback
            if (r1 == 0) goto L_0x002b
            r1.onStateChanged(r0, r3)
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.setStateInternal(int):void");
    }

    /* access modifiers changed from: package-private */
    public boolean shouldHide(View view, float f) {
        if (this.skipCollapsed) {
            return true;
        }
        return view.getTop() >= this.collapsedOffset && Math.abs((((float) view.getTop()) + (f * HIDE_FRICTION)) - ((float) this.collapsedOffset)) / ((float) this.peekHeight) > HIDE_THRESHOLD;
    }

    /* access modifiers changed from: package-private */
    public void startSettlingAnimation(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.collapsedOffset;
        } else if (i == 6) {
            int i4 = this.halfExpandedOffset;
            if (!this.fitToContents || i4 > (i3 = this.fitToContentsOffset)) {
                i2 = i4;
            } else {
                i2 = i3;
                i = 3;
            }
        } else if (i == 3) {
            i2 = getExpandedOffset();
        } else if (!this.hideable || i != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i);
        } else {
            i2 = this.parentHeight;
        }
        if (this.viewDragHelper.smoothSlideViewTo(view, view.getLeft(), i2)) {
            setStateInternal(2);
            ViewCompat.postOnAnimation(view, new SettleRunnable(view, i));
            return;
        }
        setStateInternal(i);
    }
}

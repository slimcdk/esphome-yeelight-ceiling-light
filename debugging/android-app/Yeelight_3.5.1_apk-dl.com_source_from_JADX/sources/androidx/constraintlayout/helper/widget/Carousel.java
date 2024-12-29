package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.C0218R;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.ArrayList;
import java.util.Iterator;

public class Carousel extends MotionHelper {
    private static final boolean DEBUG = false;
    private static final String TAG = "Carousel";
    public static final int TOUCH_UP_CARRY_ON = 2;
    public static final int TOUCH_UP_IMMEDIATE_STOP = 1;
    private int backwardTransition = -1;
    /* access modifiers changed from: private */
    public float dampening = 0.9f;
    private int emptyViewBehavior = 4;
    private int firstViewReference = -1;
    private int forwardTransition = -1;
    private boolean infiniteCarousel = false;
    /* access modifiers changed from: private */
    public Adapter mAdapter = null;
    private int mAnimateTargetDelay = 200;
    /* access modifiers changed from: private */
    public int mIndex = 0;
    int mLastStartId = -1;
    private final ArrayList<View> mList = new ArrayList<>();
    /* access modifiers changed from: private */
    public MotionLayout mMotionLayout;
    /* access modifiers changed from: private */
    public int mPreviousIndex = 0;
    private int mTargetIndex = -1;
    Runnable mUpdateRunnable = new Runnable() {
        public void run() {
            Carousel.this.mMotionLayout.setProgress(0.0f);
            Carousel.this.updateItems();
            Carousel.this.mAdapter.onNewItem(Carousel.this.mIndex);
            float velocity = Carousel.this.mMotionLayout.getVelocity();
            if (Carousel.this.touchUpMode == 2 && velocity > Carousel.this.velocityThreshold && Carousel.this.mIndex < Carousel.this.mAdapter.count() - 1) {
                final float access$600 = velocity * Carousel.this.dampening;
                if (Carousel.this.mIndex == 0 && Carousel.this.mPreviousIndex > Carousel.this.mIndex) {
                    return;
                }
                if (Carousel.this.mIndex != Carousel.this.mAdapter.count() - 1 || Carousel.this.mPreviousIndex >= Carousel.this.mIndex) {
                    Carousel.this.mMotionLayout.post(new Runnable() {
                        public void run() {
                            Carousel.this.mMotionLayout.touchAnimateTo(5, 1.0f, access$600);
                        }
                    });
                }
            }
        }
    };
    private int nextState = -1;
    private int previousState = -1;
    private int startIndex = 0;
    /* access modifiers changed from: private */
    public int touchUpMode = 1;
    /* access modifiers changed from: private */
    public float velocityThreshold = 2.0f;

    public interface Adapter {
        int count();

        void onNewItem(int i);

        void populate(View view, int i);
    }

    public Carousel(Context context) {
        super(context);
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public Carousel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    private void enableAllTransitions(boolean z) {
        Iterator<MotionScene.Transition> it = this.mMotionLayout.getDefinedTransitions().iterator();
        while (it.hasNext()) {
            it.next().setEnabled(z);
        }
    }

    private boolean enableTransition(int i, boolean z) {
        MotionLayout motionLayout;
        MotionScene.Transition transition;
        if (i == -1 || (motionLayout = this.mMotionLayout) == null || (transition = motionLayout.getTransition(i)) == null || z == transition.isEnabled()) {
            return false;
        }
        transition.setEnabled(z);
        return true;
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0218R.styleable.Carousel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0218R.styleable.Carousel_carousel_firstView) {
                    this.firstViewReference = obtainStyledAttributes.getResourceId(index, this.firstViewReference);
                } else if (index == C0218R.styleable.Carousel_carousel_backwardTransition) {
                    this.backwardTransition = obtainStyledAttributes.getResourceId(index, this.backwardTransition);
                } else if (index == C0218R.styleable.Carousel_carousel_forwardTransition) {
                    this.forwardTransition = obtainStyledAttributes.getResourceId(index, this.forwardTransition);
                } else if (index == C0218R.styleable.Carousel_carousel_emptyViewsBehavior) {
                    this.emptyViewBehavior = obtainStyledAttributes.getInt(index, this.emptyViewBehavior);
                } else if (index == C0218R.styleable.Carousel_carousel_previousState) {
                    this.previousState = obtainStyledAttributes.getResourceId(index, this.previousState);
                } else if (index == C0218R.styleable.Carousel_carousel_nextState) {
                    this.nextState = obtainStyledAttributes.getResourceId(index, this.nextState);
                } else if (index == C0218R.styleable.Carousel_carousel_touchUp_dampeningFactor) {
                    this.dampening = obtainStyledAttributes.getFloat(index, this.dampening);
                } else if (index == C0218R.styleable.Carousel_carousel_touchUpMode) {
                    this.touchUpMode = obtainStyledAttributes.getInt(index, this.touchUpMode);
                } else if (index == C0218R.styleable.Carousel_carousel_touchUp_velocityThreshold) {
                    this.velocityThreshold = obtainStyledAttributes.getFloat(index, this.velocityThreshold);
                } else if (index == C0218R.styleable.Carousel_carousel_infinite) {
                    this.infiniteCarousel = obtainStyledAttributes.getBoolean(index, this.infiniteCarousel);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$updateItems$0() {
        int i;
        MotionLayout motionLayout;
        this.mMotionLayout.setTransitionDuration(this.mAnimateTargetDelay);
        if (this.mTargetIndex < this.mIndex) {
            motionLayout = this.mMotionLayout;
            i = this.previousState;
        } else {
            motionLayout = this.mMotionLayout;
            i = this.nextState;
        }
        motionLayout.transitionToState(i, this.mAnimateTargetDelay);
    }

    /* access modifiers changed from: private */
    public void updateItems() {
        Adapter adapter = this.mAdapter;
        if (adapter != null && this.mMotionLayout != null && adapter.count() != 0) {
            int size = this.mList.size();
            for (int i = 0; i < size; i++) {
                View view = this.mList.get(i);
                int i2 = (this.mIndex + i) - this.startIndex;
                if (this.infiniteCarousel) {
                    if (i2 < 0) {
                        int i3 = this.emptyViewBehavior;
                        if (i3 != 4) {
                            updateViewVisibility(view, i3);
                        } else {
                            updateViewVisibility(view, 0);
                        }
                        if (i2 % this.mAdapter.count() == 0) {
                            this.mAdapter.populate(view, 0);
                        } else {
                            Adapter adapter2 = this.mAdapter;
                            adapter2.populate(view, adapter2.count() + (i2 % this.mAdapter.count()));
                        }
                    } else if (i2 >= this.mAdapter.count()) {
                        if (i2 == this.mAdapter.count()) {
                            i2 = 0;
                        } else if (i2 > this.mAdapter.count()) {
                            i2 %= this.mAdapter.count();
                        }
                        int i4 = this.emptyViewBehavior;
                        if (i4 != 4) {
                            updateViewVisibility(view, i4);
                            this.mAdapter.populate(view, i2);
                        }
                    }
                } else if (i2 < 0 || i2 >= this.mAdapter.count()) {
                    updateViewVisibility(view, this.emptyViewBehavior);
                }
                updateViewVisibility(view, 0);
                this.mAdapter.populate(view, i2);
            }
            int i5 = this.mTargetIndex;
            if (i5 != -1 && i5 != this.mIndex) {
                this.mMotionLayout.post(new C0194a(this));
            } else if (i5 == this.mIndex) {
                this.mTargetIndex = -1;
            }
            if (this.backwardTransition != -1 && this.forwardTransition != -1 && !this.infiniteCarousel) {
                int count = this.mAdapter.count();
                if (this.mIndex == 0) {
                    enableTransition(this.backwardTransition, false);
                } else {
                    enableTransition(this.backwardTransition, true);
                    this.mMotionLayout.setTransition(this.backwardTransition);
                }
                if (this.mIndex == count - 1) {
                    enableTransition(this.forwardTransition, false);
                    return;
                }
                enableTransition(this.forwardTransition, true);
                this.mMotionLayout.setTransition(this.forwardTransition);
            }
        }
    }

    private boolean updateViewVisibility(int i, View view, int i2) {
        ConstraintSet.Constraint constraint;
        ConstraintSet constraintSet = this.mMotionLayout.getConstraintSet(i);
        if (constraintSet == null || (constraint = constraintSet.getConstraint(view.getId())) == null) {
            return false;
        }
        constraint.propertySet.mVisibilityMode = 1;
        view.setVisibility(i2);
        return true;
    }

    private boolean updateViewVisibility(View view, int i) {
        MotionLayout motionLayout = this.mMotionLayout;
        if (motionLayout == null) {
            return false;
        }
        int[] constraintSetIds = motionLayout.getConstraintSetIds();
        boolean z = false;
        for (int updateViewVisibility : constraintSetIds) {
            z |= updateViewVisibility(updateViewVisibility, view, i);
        }
        return z;
    }

    public int getCount() {
        Adapter adapter = this.mAdapter;
        if (adapter != null) {
            return adapter.count();
        }
        return 0;
    }

    public int getCurrentIndex() {
        return this.mIndex;
    }

    public void jumpToIndex(int i) {
        this.mIndex = Math.max(0, Math.min(getCount() - 1, i));
        refresh();
    }

    /* access modifiers changed from: protected */
    @RequiresApi(api = 17)
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            for (int i = 0; i < this.mCount; i++) {
                int i2 = this.mIds[i];
                View viewById = motionLayout.getViewById(i2);
                if (this.firstViewReference == i2) {
                    this.startIndex = i;
                }
                this.mList.add(viewById);
            }
            this.mMotionLayout = motionLayout;
            if (this.touchUpMode == 2) {
                MotionScene.Transition transition = motionLayout.getTransition(this.forwardTransition);
                if (transition != null) {
                    transition.setOnTouchUp(5);
                }
                MotionScene.Transition transition2 = this.mMotionLayout.getTransition(this.backwardTransition);
                if (transition2 != null) {
                    transition2.setOnTouchUp(5);
                }
            }
            updateItems();
        }
    }

    public void onTransitionChange(MotionLayout motionLayout, int i, int i2, float f) {
        this.mLastStartId = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onTransitionCompleted(androidx.constraintlayout.motion.widget.MotionLayout r2, int r3) {
        /*
            r1 = this;
            int r2 = r1.mIndex
            r1.mPreviousIndex = r2
            int r0 = r1.nextState
            if (r3 != r0) goto L_0x000d
            int r2 = r2 + 1
        L_0x000a:
            r1.mIndex = r2
            goto L_0x0014
        L_0x000d:
            int r0 = r1.previousState
            if (r3 != r0) goto L_0x0014
            int r2 = r2 + -1
            goto L_0x000a
        L_0x0014:
            boolean r2 = r1.infiniteCarousel
            r3 = 0
            if (r2 == 0) goto L_0x0034
            int r2 = r1.mIndex
            androidx.constraintlayout.helper.widget.Carousel$Adapter r0 = r1.mAdapter
            int r0 = r0.count()
            if (r2 < r0) goto L_0x0025
            r1.mIndex = r3
        L_0x0025:
            int r2 = r1.mIndex
            if (r2 >= 0) goto L_0x004e
            androidx.constraintlayout.helper.widget.Carousel$Adapter r2 = r1.mAdapter
            int r2 = r2.count()
            int r2 = r2 + -1
            r1.mIndex = r2
            goto L_0x004e
        L_0x0034:
            int r2 = r1.mIndex
            androidx.constraintlayout.helper.widget.Carousel$Adapter r0 = r1.mAdapter
            int r0 = r0.count()
            if (r2 < r0) goto L_0x0048
            androidx.constraintlayout.helper.widget.Carousel$Adapter r2 = r1.mAdapter
            int r2 = r2.count()
            int r2 = r2 + -1
            r1.mIndex = r2
        L_0x0048:
            int r2 = r1.mIndex
            if (r2 >= 0) goto L_0x004e
            r1.mIndex = r3
        L_0x004e:
            int r2 = r1.mPreviousIndex
            int r3 = r1.mIndex
            if (r2 == r3) goto L_0x005b
            androidx.constraintlayout.motion.widget.MotionLayout r2 = r1.mMotionLayout
            java.lang.Runnable r3 = r1.mUpdateRunnable
            r2.post(r3)
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Carousel.onTransitionCompleted(androidx.constraintlayout.motion.widget.MotionLayout, int):void");
    }

    public void refresh() {
        int size = this.mList.size();
        for (int i = 0; i < size; i++) {
            View view = this.mList.get(i);
            if (this.mAdapter.count() == 0) {
                updateViewVisibility(view, this.emptyViewBehavior);
            } else {
                updateViewVisibility(view, 0);
            }
        }
        this.mMotionLayout.rebuildScene();
        updateItems();
    }

    public void setAdapter(Adapter adapter) {
        this.mAdapter = adapter;
    }

    public void transitionToIndex(int i, int i2) {
        int i3;
        MotionLayout motionLayout;
        this.mTargetIndex = Math.max(0, Math.min(getCount() - 1, i));
        int max = Math.max(0, i2);
        this.mAnimateTargetDelay = max;
        this.mMotionLayout.setTransitionDuration(max);
        if (i < this.mIndex) {
            motionLayout = this.mMotionLayout;
            i3 = this.previousState;
        } else {
            motionLayout = this.mMotionLayout;
            i3 = this.nextState;
        }
        motionLayout.transitionToState(i3, this.mAnimateTargetDelay);
    }
}

package com.miot.service.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.RelativeLayout;
import com.miot.service.C3602R;

public class ListItemView extends RelativeLayout {
    boolean mMeasured = false;
    private int mPosition = -1;

    public ListItemView(Context context) {
        super(context);
        init();
    }

    public ListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
        this.mPosition = getContext().obtainStyledAttributes(attributeSet, C3602R.styleable.ListItemView).getInt(C3602R.styleable.ListItemView_position, -1);
    }

    public ListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        Runnable runnable;
        super.drawableStateChanged();
        ViewParent parent = getParent();
        int i = 0;
        final View view = null;
        if (parent != null && (parent instanceof AbsListView)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            int i2 = this.mPosition;
            if (i2 != -1 && i2 != 0) {
                while (true) {
                    if (i < viewGroup.getChildCount()) {
                        if ((viewGroup.getChildAt(i) instanceof ListItemView) && ((ListItemView) viewGroup.getChildAt(i)).getPosition() != -1 && ((ListItemView) viewGroup.getChildAt(i)).getPosition() == this.mPosition - 1) {
                            view = viewGroup.getChildAt(i);
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
                if ((isSelected() || isPressed()) && view != null && (view instanceof ListItemView)) {
                    runnable = new Runnable() {
                        public void run() {
                            view.setEnabled(false);
                        }
                    };
                } else if (view != null && (view instanceof ListItemView)) {
                    runnable = new Runnable() {
                        public void run() {
                            view.setEnabled(true);
                        }
                    };
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup2 = (ViewGroup) parent;
            int childCount = viewGroup2.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                if (!equals(viewGroup2.getChildAt(childCount))) {
                    if (i != 0 && (viewGroup2.getChildAt(childCount) instanceof ListItemView)) {
                        view = viewGroup2.getChildAt(childCount);
                        break;
                    }
                } else {
                    i = 1;
                }
                childCount--;
            }
            if (view != null && (view instanceof ListItemView) && i != 0) {
                runnable = (isSelected() || isPressed()) ? new Runnable() {
                    public void run() {
                        view.setEnabled(false);
                    }
                } : new Runnable() {
                    public void run() {
                        view.setEnabled(true);
                    }
                };
            } else {
                return;
            }
        } else {
            return;
        }
        post(runnable);
    }

    public int getPosition() {
        return this.mPosition;
    }

    /* access modifiers changed from: package-private */
    public void init() {
    }

    public void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setPosition(int i) {
        this.mPosition = i;
    }
}

package com.miot.service.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class ResizeLayout extends RelativeLayout {
    private ResizeListener mListener;

    public interface ResizeListener {
        void onSizeChanged(int i, int i2);
    }

    public ResizeLayout(Context context) {
        super(context);
    }

    public ResizeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ResizeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        ResizeListener resizeListener = this.mListener;
        if (resizeListener != null) {
            resizeListener.onSizeChanged(i2, i4);
        }
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setResizeListener(ResizeListener resizeListener) {
        this.mListener = resizeListener;
    }
}

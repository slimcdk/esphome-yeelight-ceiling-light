package com.yeelight.yeelib.p142ui.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.core.widget.NestedScrollView;

/* renamed from: com.yeelight.yeelib.ui.view.YeelightScrollView */
public class YeelightScrollView extends NestedScrollView {
    public YeelightScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        return 0;
    }
}

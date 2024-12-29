package com.yeelight.cherry.p141ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;

/* renamed from: com.yeelight.cherry.ui.view.SquareLinearLayout */
public class SquareLinearLayout extends LinearLayout {
    public SquareLinearLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(LinearLayout.getDefaultSize(0, i), LinearLayout.getDefaultSize(0, i2));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), BasicMeasure.EXACTLY);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}

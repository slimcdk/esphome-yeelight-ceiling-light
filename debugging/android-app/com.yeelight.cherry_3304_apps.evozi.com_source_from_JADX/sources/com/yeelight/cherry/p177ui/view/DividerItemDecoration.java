package com.yeelight.cherry.p177ui.view;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.yeelight.cherry.ui.view.DividerItemDecoration */
public class DividerItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    private Drawable f12609a;

    /* renamed from: b */
    private int f12610b;

    public void drawHorizontal(Canvas canvas, RecyclerView recyclerView) {
        int paddingTop = recyclerView.getPaddingTop();
        int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int right = childAt.getRight() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).rightMargin;
            this.f12609a.setBounds(right, paddingTop, this.f12609a.getIntrinsicHeight() + right, height);
            this.f12609a.draw(canvas);
        }
    }

    public void drawVertical(Canvas canvas, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            this.f12609a.setBounds(paddingLeft, bottom, width, this.f12609a.getIntrinsicHeight() + bottom);
            this.f12609a.draw(canvas);
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.f12610b == 1) {
            rect.set(0, 0, 0, this.f12609a.getIntrinsicHeight());
        } else {
            rect.set(0, 0, this.f12609a.getIntrinsicWidth(), 0);
        }
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.f12610b == 1) {
            drawVertical(canvas, recyclerView);
        } else {
            drawHorizontal(canvas, recyclerView);
        }
    }
}

package com.dgreenhalgh.android.simpleitemdecoration.linear;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class DividerItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    private Drawable f294a;

    /* renamed from: b */
    private int f295b;

    /* renamed from: a */
    private void m312a(Canvas canvas, RecyclerView recyclerView) {
        int paddingTop = recyclerView.getPaddingTop();
        int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount - 1; i++) {
            View childAt = recyclerView.getChildAt(i);
            int right = childAt.getRight() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).rightMargin;
            this.f294a.setBounds(right, paddingTop, this.f294a.getIntrinsicWidth() + right, height);
            this.f294a.draw(canvas);
        }
    }

    /* renamed from: b */
    private void m313b(Canvas canvas, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount - 1; i++) {
            View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            this.f294a.setBounds(paddingLeft, bottom, width, this.f294a.getIntrinsicHeight() + bottom);
            this.f294a.draw(canvas);
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (recyclerView.getChildAdapterPosition(view) != 0) {
            int orientation = ((LinearLayoutManager) recyclerView.getLayoutManager()).getOrientation();
            this.f295b = orientation;
            if (orientation == 0) {
                rect.left = this.f294a.getIntrinsicWidth();
            } else if (orientation == 1) {
                rect.top = this.f294a.getIntrinsicHeight();
            }
        }
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int i = this.f295b;
        if (i == 0) {
            m312a(canvas, recyclerView);
        } else if (i == 1) {
            m313b(canvas, recyclerView);
        }
    }
}

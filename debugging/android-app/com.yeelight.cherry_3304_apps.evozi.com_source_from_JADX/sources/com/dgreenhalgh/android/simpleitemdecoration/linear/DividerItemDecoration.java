package com.dgreenhalgh.android.simpleitemdecoration.linear;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class DividerItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    private Drawable f2260a;

    /* renamed from: b */
    private int f2261b;

    /* renamed from: a */
    private void m3296a(Canvas canvas, RecyclerView recyclerView) {
        int paddingTop = recyclerView.getPaddingTop();
        int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount - 1; i++) {
            View childAt = recyclerView.getChildAt(i);
            int right = childAt.getRight() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).rightMargin;
            this.f2260a.setBounds(right, paddingTop, this.f2260a.getIntrinsicWidth() + right, height);
            this.f2260a.draw(canvas);
        }
    }

    /* renamed from: b */
    private void m3297b(Canvas canvas, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount - 1; i++) {
            View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            this.f2260a.setBounds(paddingLeft, bottom, width, this.f2260a.getIntrinsicHeight() + bottom);
            this.f2260a.draw(canvas);
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (recyclerView.getChildAdapterPosition(view) != 0) {
            int orientation = ((LinearLayoutManager) recyclerView.getLayoutManager()).getOrientation();
            this.f2261b = orientation;
            if (orientation == 0) {
                rect.left = this.f2260a.getIntrinsicWidth();
            } else if (orientation == 1) {
                rect.top = this.f2260a.getIntrinsicHeight();
            }
        }
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int i = this.f2261b;
        if (i == 0) {
            m3296a(canvas, recyclerView);
        } else if (i == 1) {
            m3297b(canvas, recyclerView);
        }
    }
}

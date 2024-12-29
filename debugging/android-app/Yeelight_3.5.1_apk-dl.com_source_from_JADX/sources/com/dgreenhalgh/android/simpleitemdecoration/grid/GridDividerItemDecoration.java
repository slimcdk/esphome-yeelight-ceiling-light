package com.dgreenhalgh.android.simpleitemdecoration.grid;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class GridDividerItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    private Drawable f289a;

    /* renamed from: b */
    private Drawable f290b;

    /* renamed from: c */
    private int f291c;

    public GridDividerItemDecoration(Drawable drawable, Drawable drawable2, int i) {
        this.f289a = drawable;
        this.f290b = drawable2;
        this.f291c = i;
    }

    /* renamed from: a */
    private void m310a(Canvas canvas, RecyclerView recyclerView) {
        int paddingTop = recyclerView.getPaddingTop();
        int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        for (int i = 0; i < this.f291c; i++) {
            View childAt = recyclerView.getChildAt(i);
            int right = childAt.getRight() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).rightMargin;
            this.f289a.setBounds(right, paddingTop, this.f289a.getIntrinsicWidth() + right, height);
            this.f289a.draw(canvas);
        }
    }

    /* renamed from: b */
    private void m311b(Canvas canvas, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        int i = this.f291c;
        int i2 = childCount % i;
        int i3 = childCount / i;
        if (i2 == 0) {
            i3--;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            View childAt = recyclerView.getChildAt(this.f291c * i4);
            int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            this.f290b.setBounds(paddingLeft, bottom, width, this.f290b.getIntrinsicHeight() + bottom);
            this.f290b.draw(canvas);
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        boolean z = true;
        if (!(recyclerView.getChildAdapterPosition(view) % this.f291c == 0)) {
            rect.left = this.f289a.getIntrinsicWidth();
        }
        if (recyclerView.getChildAdapterPosition(view) >= this.f291c) {
            z = false;
        }
        if (!z) {
            rect.top = this.f290b.getIntrinsicHeight();
        }
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        m310a(canvas, recyclerView);
        m311b(canvas, recyclerView);
    }
}

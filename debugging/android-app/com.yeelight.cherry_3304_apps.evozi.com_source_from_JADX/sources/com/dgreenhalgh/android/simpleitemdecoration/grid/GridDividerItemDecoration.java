package com.dgreenhalgh.android.simpleitemdecoration.grid;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class GridDividerItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    private Drawable f2255a;

    /* renamed from: b */
    private Drawable f2256b;

    /* renamed from: c */
    private int f2257c;

    public GridDividerItemDecoration(Drawable drawable, Drawable drawable2, int i) {
        this.f2255a = drawable;
        this.f2256b = drawable2;
        this.f2257c = i;
    }

    /* renamed from: a */
    private void m3294a(Canvas canvas, RecyclerView recyclerView) {
        int paddingTop = recyclerView.getPaddingTop();
        int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        for (int i = 0; i < this.f2257c; i++) {
            View childAt = recyclerView.getChildAt(i);
            int right = childAt.getRight() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).rightMargin;
            this.f2255a.setBounds(right, paddingTop, this.f2255a.getIntrinsicWidth() + right, height);
            this.f2255a.draw(canvas);
        }
    }

    /* renamed from: b */
    private void m3295b(Canvas canvas, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        int i = this.f2257c;
        int i2 = childCount % i;
        int i3 = childCount / i;
        if (i2 == 0) {
            i3--;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            View childAt = recyclerView.getChildAt(this.f2257c * i4);
            int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            this.f2256b.setBounds(paddingLeft, bottom, width, this.f2256b.getIntrinsicHeight() + bottom);
            this.f2256b.draw(canvas);
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        boolean z = true;
        if (!(recyclerView.getChildAdapterPosition(view) % this.f2257c == 0)) {
            rect.left = this.f2255a.getIntrinsicWidth();
        }
        if (recyclerView.getChildAdapterPosition(view) >= this.f2257c) {
            z = false;
        }
        if (!z) {
            rect.top = this.f2256b.getIntrinsicHeight();
        }
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        m3294a(canvas, recyclerView);
        m3295b(canvas, recyclerView);
    }
}

package com.dgreenhalgh.android.simpleitemdecoration.grid;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class GridTopOffsetItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    private int f2258a;

    /* renamed from: b */
    private int f2259b;

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (recyclerView.getChildAdapterPosition(view) < this.f2259b) {
            rect.top = this.f2258a;
        }
    }
}

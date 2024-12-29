package com.dgreenhalgh.android.simpleitemdecoration.linear;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class StartOffsetItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    private int f2263a;

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (recyclerView.getChildAdapterPosition(view) < 1) {
            int orientation = ((LinearLayoutManager) recyclerView.getLayoutManager()).getOrientation();
            if (orientation == 0) {
                rect.left = this.f2263a;
            } else if (orientation == 1) {
                rect.top = this.f2263a;
            }
        }
    }
}

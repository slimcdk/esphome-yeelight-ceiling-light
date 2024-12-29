package com.dgreenhalgh.android.simpleitemdecoration.grid;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class GridTopOffsetItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    private int f292a;

    /* renamed from: b */
    private int f293b;

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (recyclerView.getChildAdapterPosition(view) < this.f293b) {
            rect.top = this.f292a;
        }
    }
}

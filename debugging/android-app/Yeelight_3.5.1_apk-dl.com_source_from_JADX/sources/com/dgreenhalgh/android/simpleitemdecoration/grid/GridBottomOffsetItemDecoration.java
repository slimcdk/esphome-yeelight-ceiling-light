package com.dgreenhalgh.android.simpleitemdecoration.grid;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class GridBottomOffsetItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    private int f287a;

    /* renamed from: b */
    private int f288b;

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        int itemCount = state.getItemCount();
        int i = this.f288b;
        int i2 = itemCount % i;
        if (i2 != 0) {
            i = i2;
        }
        if (recyclerView.getChildAdapterPosition(view) >= itemCount - i) {
            rect.bottom = this.f287a;
        }
    }
}

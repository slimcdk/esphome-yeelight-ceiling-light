package com.dgreenhalgh.android.simpleitemdecoration.linear;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class EndOffsetItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    private int f2262a;

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (recyclerView.getChildAdapterPosition(view) != state.getItemCount() - 1) {
            return;
        }
        if (((LinearLayoutManager) recyclerView.getLayoutManager()).getOrientation() == 0) {
            rect.right = this.f2262a;
        } else {
            rect.bottom = this.f2262a;
        }
    }
}

package com.yeelight.yeelib.utils;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RVEmptyObserver extends RecyclerView.AdapterDataObserver {

    /* renamed from: a */
    private View f20142a;

    /* renamed from: b */
    private View f20143b;

    /* renamed from: c */
    private RecyclerView f20144c;

    public RVEmptyObserver(View view, View view2, @NonNull RecyclerView recyclerView) {
        this.f20144c = recyclerView;
        this.f20142a = view2;
        this.f20143b = view;
    }

    /* renamed from: a */
    private void m25655a() {
        RecyclerView recyclerView = this.f20144c;
        if (recyclerView != null) {
            int i = 0;
            boolean z = recyclerView.getAdapter().getItemCount() == 0;
            View view = this.f20142a;
            if (view != null) {
                view.setVisibility(z ? 0 : 8);
            }
            View view2 = this.f20143b;
            if (view2 != null) {
                if (z) {
                    i = 8;
                }
                view2.setVisibility(i);
            }
        }
    }

    public void onChanged() {
        m25655a();
    }

    public void onItemRangeInserted(int i, int i2) {
        m25655a();
    }

    public void onItemRangeRemoved(int i, int i2) {
        m25655a();
    }
}

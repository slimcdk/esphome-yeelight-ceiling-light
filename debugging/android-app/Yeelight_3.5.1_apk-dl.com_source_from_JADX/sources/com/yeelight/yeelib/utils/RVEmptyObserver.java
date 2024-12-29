package com.yeelight.yeelib.utils;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RVEmptyObserver extends RecyclerView.AdapterDataObserver {

    /* renamed from: a */
    private View f16332a;

    /* renamed from: b */
    private View f16333b;

    /* renamed from: c */
    private RecyclerView f16334c;

    public RVEmptyObserver(View view, View view2, @NonNull RecyclerView recyclerView) {
        this.f16334c = recyclerView;
        this.f16332a = view2;
        this.f16333b = view;
    }

    /* renamed from: a */
    private void m21223a() {
        RecyclerView recyclerView = this.f16334c;
        if (recyclerView != null) {
            int i = 0;
            boolean z = recyclerView.getAdapter().getItemCount() == 0;
            View view = this.f16332a;
            if (view != null) {
                view.setVisibility(z ? 0 : 8);
            }
            View view2 = this.f16333b;
            if (view2 != null) {
                if (z) {
                    i = 8;
                }
                view2.setVisibility(i);
            }
        }
    }

    public void onChanged() {
        m21223a();
    }

    public void onItemRangeInserted(int i, int i2) {
        m21223a();
    }

    public void onItemRangeRemoved(int i, int i2) {
        m21223a();
    }
}

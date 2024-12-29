package com.yeelight.cherry.p177ui.adapter;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.yeelight.cherry.p177ui.adapter.PersonalityLightFlowItemEditAdapter;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p153g.C4300b0;
import com.yeelight.yeelib.p153g.C9838i;
import com.yeelight.yeelib.utils.C10547m;
import java.util.Collections;

/* renamed from: com.yeelight.cherry.ui.adapter.PersonalityFlowItemTouchCallback */
public class PersonalityFlowItemTouchCallback extends ItemTouchHelper.Callback {

    /* renamed from: a */
    private C9838i f12171a;

    /* renamed from: b */
    private boolean f12172b = false;

    public PersonalityFlowItemTouchCallback(int i) {
        boolean z = false;
        this.f12171a = i != -1 ? true : z ? C4300b0.m12083u().mo23745i().get(i) : C4300b0.m12083u().mo23753r();
    }

    /* renamed from: a */
    public void mo27177a(boolean z) {
        this.f12172b = z;
    }

    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        CardView cardView;
        super.clearView(recyclerView, viewHolder);
        if (viewHolder instanceof PersonalityLightFlowItemEditAdapter.PersonalityFlowItemHolder) {
            PersonalityLightFlowItemEditAdapter.PersonalityFlowItemHolder personalityFlowItemHolder = (PersonalityLightFlowItemEditAdapter.PersonalityFlowItemHolder) viewHolder;
            personalityFlowItemHolder.f12246f.setCardElevation(0.0f);
            cardView = personalityFlowItemHolder.f12246f;
        } else if (viewHolder instanceof PersonalityLightFlowItemEditAdapter.PersonalityFlowItemSuspendHolder) {
            PersonalityLightFlowItemEditAdapter.PersonalityFlowItemSuspendHolder personalityFlowItemSuspendHolder = (PersonalityLightFlowItemEditAdapter.PersonalityFlowItemSuspendHolder) viewHolder;
            personalityFlowItemSuspendHolder.f12254c.setCardElevation(0.0f);
            cardView = personalityFlowItemSuspendHolder.f12254c;
        } else {
            return;
        }
        cardView.setBackgroundResource(2131099840);
    }

    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        return ItemTouchHelper.Callback.makeMovementFlags(recyclerView.getLayoutManager() instanceof GridLayoutManager ? 15 : 3, 0);
    }

    public boolean isLongPressDragEnabled() {
        return this.f12172b;
    }

    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        int adapterPosition = viewHolder.getAdapterPosition();
        int adapterPosition2 = viewHolder2.getAdapterPosition();
        int i = adapterPosition;
        if (adapterPosition < adapterPosition2) {
            while (i < adapterPosition2) {
                int i2 = i + 1;
                Collections.swap(this.f12171a.mo31871c().mo31723h(), i, i2);
                i = i2;
            }
        } else {
            while (i > adapterPosition2) {
                Collections.swap(this.f12171a.mo31871c().mo31723h(), i, i - 1);
                i--;
            }
        }
        recyclerView.getAdapter().notifyItemMoved(adapterPosition, adapterPosition2);
        return true;
    }

    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
        CardView cardView;
        if (viewHolder instanceof PersonalityLightFlowItemEditAdapter.PersonalityFlowItemHolder) {
            PersonalityLightFlowItemEditAdapter.PersonalityFlowItemHolder personalityFlowItemHolder = (PersonalityLightFlowItemEditAdapter.PersonalityFlowItemHolder) viewHolder;
            personalityFlowItemHolder.f12246f.setCardElevation((float) C10547m.m25752b(C4297y.f7456e, 4.0f));
            cardView = personalityFlowItemHolder.f12246f;
        } else {
            if (viewHolder instanceof PersonalityLightFlowItemEditAdapter.PersonalityFlowItemSuspendHolder) {
                PersonalityLightFlowItemEditAdapter.PersonalityFlowItemSuspendHolder personalityFlowItemSuspendHolder = (PersonalityLightFlowItemEditAdapter.PersonalityFlowItemSuspendHolder) viewHolder;
                personalityFlowItemSuspendHolder.f12254c.setCardElevation((float) C10547m.m25752b(C4297y.f7456e, 4.0f));
                cardView = personalityFlowItemSuspendHolder.f12254c;
            }
            super.onSelectedChanged(viewHolder, i);
        }
        cardView.setBackgroundResource(2131100180);
        super.onSelectedChanged(viewHolder, i);
    }

    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
    }
}

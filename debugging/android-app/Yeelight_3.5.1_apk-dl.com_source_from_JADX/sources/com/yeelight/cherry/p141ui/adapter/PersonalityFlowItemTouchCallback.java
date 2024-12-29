package com.yeelight.cherry.p141ui.adapter;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.yeelight.cherry.p141ui.adapter.PersonalityLightFlowItemEditAdapter;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.models.C3112v;
import com.yeelight.yeelib.models.CustomAdvancedFlowScene;
import java.util.Collections;
import p051j4.C9193k;

/* renamed from: com.yeelight.cherry.ui.adapter.PersonalityFlowItemTouchCallback */
public class PersonalityFlowItemTouchCallback extends ItemTouchHelper.Callback {

    /* renamed from: a */
    private CustomAdvancedFlowScene f11771a;

    /* renamed from: b */
    private boolean f11772b = false;

    public PersonalityFlowItemTouchCallback(int i) {
        boolean z = false;
        this.f11771a = i != -1 ? true : z ? C3112v.m8242u().mo23558i().get(i) : C3112v.m8242u().mo23566r();
    }

    /* renamed from: a */
    public void mo31144a(boolean z) {
        this.f11772b = z;
    }

    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        CardView cardView;
        super.clearView(recyclerView, viewHolder);
        if (viewHolder instanceof PersonalityLightFlowItemEditAdapter.PersonalityFlowItemHolder) {
            PersonalityLightFlowItemEditAdapter.PersonalityFlowItemHolder personalityFlowItemHolder = (PersonalityLightFlowItemEditAdapter.PersonalityFlowItemHolder) viewHolder;
            personalityFlowItemHolder.f11846f.setCardElevation(0.0f);
            cardView = personalityFlowItemHolder.f11846f;
        } else if (viewHolder instanceof PersonalityLightFlowItemEditAdapter.PersonalityFlowItemSuspendHolder) {
            PersonalityLightFlowItemEditAdapter.PersonalityFlowItemSuspendHolder personalityFlowItemSuspendHolder = (PersonalityLightFlowItemEditAdapter.PersonalityFlowItemSuspendHolder) viewHolder;
            personalityFlowItemSuspendHolder.f11854c.setCardElevation(0.0f);
            cardView = personalityFlowItemSuspendHolder.f11854c;
        } else {
            return;
        }
        cardView.setBackgroundResource(2131099843);
    }

    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        return ItemTouchHelper.Callback.makeMovementFlags(recyclerView.getLayoutManager() instanceof GridLayoutManager ? 15 : 3, 0);
    }

    public boolean isLongPressDragEnabled() {
        return this.f11772b;
    }

    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        int adapterPosition = viewHolder.getAdapterPosition();
        int adapterPosition2 = viewHolder2.getAdapterPosition();
        int i = adapterPosition;
        if (adapterPosition < adapterPosition2) {
            while (i < adapterPosition2) {
                int i2 = i + 1;
                Collections.swap(this.f11771a.mo35436c().mo35338h(), i, i2);
                i = i2;
            }
        } else {
            while (i > adapterPosition2) {
                Collections.swap(this.f11771a.mo35436c().mo35338h(), i, i - 1);
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
            personalityFlowItemHolder.f11846f.setCardElevation((float) C9193k.m22151b(C3108x.f4951e, 4.0f));
            cardView = personalityFlowItemHolder.f11846f;
        } else {
            if (viewHolder instanceof PersonalityLightFlowItemEditAdapter.PersonalityFlowItemSuspendHolder) {
                PersonalityLightFlowItemEditAdapter.PersonalityFlowItemSuspendHolder personalityFlowItemSuspendHolder = (PersonalityLightFlowItemEditAdapter.PersonalityFlowItemSuspendHolder) viewHolder;
                personalityFlowItemSuspendHolder.f11854c.setCardElevation((float) C9193k.m22151b(C3108x.f4951e, 4.0f));
                cardView = personalityFlowItemSuspendHolder.f11854c;
            }
            super.onSelectedChanged(viewHolder, i);
        }
        cardView.setBackgroundResource(2131100183);
        super.onSelectedChanged(viewHolder, i);
    }

    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
    }
}

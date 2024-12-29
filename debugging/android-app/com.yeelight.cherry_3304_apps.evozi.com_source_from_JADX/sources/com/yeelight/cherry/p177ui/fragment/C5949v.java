package com.yeelight.cherry.p177ui.fragment;

import android.content.Context;
import android.view.View;
import com.yeelight.yeelib.p150c.C5980c;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p152f.C9802n;

/* renamed from: com.yeelight.cherry.ui.fragment.v */
class C5949v implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ DiscoFragment f12557a;

    C5949v(DiscoFragment discoFragment) {
        this.f12557a = discoFragment;
    }

    public void onClick(View view) {
        Context context = this.f12557a.getContext();
        if (this.f12557a.f12411c instanceof C5980c) {
            for (int i = 0; i < ((C5980c) this.f12557a.f12411c).mo27498K1().size(); i++) {
                if (this.f12557a.f12411c.mo23415n0(21)) {
                    C9802n.m23790s(context).mo31663B((C6006h) ((C5980c) this.f12557a.f12411c).mo27498K1().get(i), false);
                }
            }
        } else {
            C9802n.m23790s(context).mo31663B((C6006h) this.f12557a.f12411c, false);
        }
        this.f12557a.m17334F(context);
    }
}

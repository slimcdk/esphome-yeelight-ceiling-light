package com.yeelight.yeelib.p150c.p181l;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6038h;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p194ui.activity.KidModeNewActivity;
import com.yeelight.yeelib.p194ui.view.RedSpotTipTextView;

/* renamed from: com.yeelight.yeelib.c.l.q0 */
public class C6189q0 extends C6038h {

    /* renamed from: h */
    private TextView f13138h;

    /* renamed from: com.yeelight.yeelib.c.l.q0$a */
    class C6190a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f13139a;

        /* renamed from: b */
        final /* synthetic */ C4198d f13140b;

        C6190a(Activity activity, C4198d dVar) {
            this.f13139a = activity;
            this.f13140b = dVar;
        }

        public void onClick(View view) {
            C6189q0.this.mo27785o(this.f13139a, this.f13140b.mo23372G());
        }
    }

    public C6189q0(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    public C6189q0(int i, String str, int i2, String str2, boolean z) {
        super(i, str, i2, str2, z);
    }

    /* renamed from: q */
    private void m18654q() {
    }

    /* renamed from: a */
    public View mo27771a(Activity activity, C4198d dVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12835b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12836c);
        this.f12839f = dVar.mo23372G();
        relativeLayout.setOnClickListener(new C6190a(activity, dVar));
        m18654q();
        return relativeLayout;
    }

    /* renamed from: b */
    public void mo27772b() {
        TextView textView = this.f13138h;
        if (textView != null) {
            textView.removeCallbacks((Runnable) null);
            this.f13138h = null;
        }
    }

    /* renamed from: c */
    public void mo27773c(C4198d dVar) {
        if (dVar.mo23408d0().mo27710r(17) == null) {
            dVar.mo23353x(16, (Object) null);
        }
    }

    /* renamed from: h */
    public Class mo27778h() {
        return KidModeNewActivity.class;
    }

    /* renamed from: j */
    public boolean mo27780j() {
        C4198d h0 = C4257w.m11945h0(this.f12839f);
        if (h0 != null) {
            return h0.mo23408d0().mo27671W();
        }
        return false;
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == -1 || i == 4096) {
            m18654q();
        }
    }
}
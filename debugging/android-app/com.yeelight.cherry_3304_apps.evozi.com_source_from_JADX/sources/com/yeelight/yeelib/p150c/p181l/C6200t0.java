package com.yeelight.yeelib.p150c.p181l;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6038h;
import com.yeelight.yeelib.p194ui.activity.LightGradientFeatureActivity;
import com.yeelight.yeelib.p194ui.view.RedSpotTipTextView;

/* renamed from: com.yeelight.yeelib.c.l.t0 */
public class C6200t0 extends C6038h {
    public C6200t0(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    /* renamed from: a */
    public View mo27771a(Activity activity, C4198d dVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RedSpotTipTextView redSpotTipTextView = (RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name);
        this.f12834a = redSpotTipTextView;
        redSpotTipTextView.setText(this.f12836c);
        ((RelativeLayout) inflate.findViewById(R$id.feature_item_root)).setOnClickListener(new C6176n(this, activity, dVar));
        return inflate;
    }

    /* renamed from: b */
    public void mo27772b() {
    }

    /* renamed from: c */
    public void mo27773c(C4198d dVar) {
    }

    /* renamed from: h */
    public Class mo27778h() {
        return LightGradientFeatureActivity.class;
    }

    /* renamed from: j */
    public boolean mo27780j() {
        return false;
    }

    public void onStatusChange(int i, C6024e eVar) {
    }

    /* renamed from: q */
    public /* synthetic */ void mo28064q(Activity activity, C4198d dVar, View view) {
        mo27785o(activity, dVar.mo23372G());
    }
}

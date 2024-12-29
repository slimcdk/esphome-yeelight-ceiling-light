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
import com.yeelight.yeelib.p194ui.activity.TouchPanelIndicatorActivity;
import com.yeelight.yeelib.p194ui.view.RedSpotTipTextView;

/* renamed from: com.yeelight.yeelib.c.l.k1 */
public class C6165k1 extends C6038h {
    public C6165k1(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    /* renamed from: a */
    public View mo27771a(Activity activity, C4198d dVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        RedSpotTipTextView redSpotTipTextView = (RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name);
        this.f12834a = redSpotTipTextView;
        redSpotTipTextView.setText(this.f12836c);
        if (mo27781k((C4198d) null)) {
            mo27784n(true);
        }
        relativeLayout.setOnClickListener(new C6179o(this, activity, dVar));
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
        return TouchPanelIndicatorActivity.class;
    }

    /* renamed from: j */
    public boolean mo27780j() {
        return false;
    }

    public void onStatusChange(int i, C6024e eVar) {
    }

    /* renamed from: q */
    public /* synthetic */ void mo28037q(Activity activity, C4198d dVar, View view) {
        mo27785o(activity, dVar.mo23372G());
    }
}

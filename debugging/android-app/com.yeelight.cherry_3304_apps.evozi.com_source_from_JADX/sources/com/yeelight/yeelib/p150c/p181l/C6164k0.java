package com.yeelight.yeelib.p150c.p181l;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6038h;
import com.yeelight.yeelib.p194ui.activity.DefaultScheduleActivity;
import com.yeelight.yeelib.p194ui.activity.YeelightWebviewActivity;
import com.yeelight.yeelib.p194ui.view.RedSpotTipTextView;

/* renamed from: com.yeelight.yeelib.c.l.k0 */
public class C6164k0 extends C6038h {
    public C6164k0(int i, String str, int i2, String str2) {
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
        relativeLayout.setOnClickListener(new C6159j(this, activity, dVar));
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
        return DefaultScheduleActivity.class;
    }

    /* renamed from: j */
    public boolean mo27780j() {
        return false;
    }

    /* renamed from: o */
    public void mo27785o(Activity activity, String str) {
        Intent intent = new Intent(activity, YeelightWebviewActivity.class);
        intent.putExtra("url_index", 27);
        activity.startActivity(intent);
    }

    public void onStatusChange(int i, C6024e eVar) {
    }

    /* renamed from: q */
    public /* synthetic */ void mo28036q(Activity activity, C4198d dVar, View view) {
        mo27785o(activity, dVar.mo23372G());
    }
}
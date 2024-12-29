package com.yeelight.yeelib.p150c.p181l;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6038h;
import com.yeelight.yeelib.p150c.p183m.C7472y;
import com.yeelight.yeelib.p194ui.view.RedSpotTipTextView;
import com.yeelight.yeelib.p194ui.view.YeelightSwitchButton;

/* renamed from: com.yeelight.yeelib.c.l.v */
public class C6204v extends C6038h {

    /* renamed from: h */
    private YeelightSwitchButton f13159h;

    /* renamed from: i */
    private C7472y f13160i;

    public C6204v(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    /* renamed from: a */
    public View mo27771a(Activity activity, C4198d dVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        this.f12834a = (RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name);
        inflate.findViewById(R$id.feature_item_more).setVisibility(8);
        YeelightSwitchButton yeelightSwitchButton = (YeelightSwitchButton) inflate.findViewById(R$id.feature_item_switch_view);
        this.f13159h = yeelightSwitchButton;
        yeelightSwitchButton.setVisibility(0);
        this.f12834a.setText(this.f12836c);
        if (mo27781k((C4198d) null)) {
            mo27784n(true);
        }
        C7472y yVar = (C7472y) dVar;
        this.f13160i = yVar;
        this.f13159h.setChecked(yVar.mo27618r2());
        this.f13159h.setOnPerformCheckedChangeListener(new C6125d(this));
        relativeLayout.setOnClickListener(new C6131e(this, activity, dVar));
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
        return null;
    }

    /* renamed from: j */
    public boolean mo27780j() {
        return false;
    }

    /* renamed from: o */
    public void mo27785o(Activity activity, String str) {
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (this.f13160i != null && i == 4096) {
            this.f13159h.post(new C6121c(this));
        }
    }

    /* renamed from: q */
    public /* synthetic */ void mo28067q(CompoundButton compoundButton, boolean z) {
        this.f13160i.mo28809C2(z);
    }

    /* renamed from: r */
    public /* synthetic */ void mo28068r(Activity activity, C4198d dVar, View view) {
        mo27785o(activity, dVar.mo23372G());
    }

    /* renamed from: s */
    public /* synthetic */ void mo28069s() {
        this.f13159h.setChecked(this.f13160i.mo27618r2());
    }
}

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
import com.yeelight.yeelib.p194ui.activity.BundleSceneDemoActivity;
import com.yeelight.yeelib.p194ui.view.RedSpotTipTextView;

/* renamed from: com.yeelight.yeelib.c.l.s */
public class C6193s extends C6038h {

    /* renamed from: h */
    private TextView f13142h;

    /* renamed from: com.yeelight.yeelib.c.l.s$a */
    class C6194a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f13143a;

        /* renamed from: b */
        final /* synthetic */ C4198d f13144b;

        C6194a(Activity activity, C4198d dVar) {
            this.f13143a = activity;
            this.f13144b = dVar;
        }

        public void onClick(View view) {
            C6193s.this.mo27785o(this.f13143a, this.f13144b.mo23372G());
        }
    }

    public C6193s(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    /* renamed from: q */
    private void m18672q() {
    }

    /* renamed from: a */
    public View mo27771a(Activity activity, C4198d dVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12835b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12836c);
        this.f12839f = dVar.mo23372G();
        relativeLayout.setOnClickListener(new C6194a(activity, dVar));
        m18672q();
        return relativeLayout;
    }

    /* renamed from: b */
    public void mo27772b() {
        TextView textView = this.f13142h;
        if (textView != null) {
            textView.removeCallbacks((Runnable) null);
            this.f13142h = null;
        }
    }

    /* renamed from: c */
    public void mo27773c(C4198d dVar) {
    }

    /* renamed from: h */
    public Class mo27778h() {
        return BundleSceneDemoActivity.class;
    }

    /* renamed from: j */
    public boolean mo27780j() {
        C4198d h0 = C4257w.m11945h0(this.f12839f);
        if (h0 != null) {
            return h0.mo23408d0().mo27663S();
        }
        return false;
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == -1 || i == 4096) {
            m18672q();
        }
    }
}

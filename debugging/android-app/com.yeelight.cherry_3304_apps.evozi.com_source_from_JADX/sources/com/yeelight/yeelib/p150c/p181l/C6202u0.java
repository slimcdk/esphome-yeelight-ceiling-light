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
import com.yeelight.yeelib.p194ui.activity.MangoShortKeyNewActivity;
import com.yeelight.yeelib.p194ui.view.RedSpotTipTextView;

/* renamed from: com.yeelight.yeelib.c.l.u0 */
public class C6202u0 extends C6038h {

    /* renamed from: h */
    private TextView f13155h;

    /* renamed from: com.yeelight.yeelib.c.l.u0$a */
    class C6203a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f13156a;

        /* renamed from: b */
        final /* synthetic */ C4198d f13157b;

        C6203a(Activity activity, C4198d dVar) {
            this.f13156a = activity;
            this.f13157b = dVar;
        }

        public void onClick(View view) {
            C6202u0.this.mo27785o(this.f13156a, this.f13157b.mo23372G());
        }
    }

    public C6202u0(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    /* renamed from: q */
    private void m18703q() {
    }

    /* renamed from: a */
    public View mo27771a(Activity activity, C4198d dVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12835b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12836c);
        this.f12839f = dVar.mo23372G();
        relativeLayout.setOnClickListener(new C6203a(activity, dVar));
        m18703q();
        return relativeLayout;
    }

    /* renamed from: b */
    public void mo27772b() {
        TextView textView = this.f13155h;
        if (textView != null) {
            textView.removeCallbacks((Runnable) null);
            this.f13155h = null;
        }
    }

    /* renamed from: c */
    public void mo27773c(C4198d dVar) {
    }

    /* renamed from: h */
    public Class mo27778h() {
        return MangoShortKeyNewActivity.class;
    }

    /* renamed from: j */
    public boolean mo27780j() {
        return false;
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == -1 || i == 4096) {
            m18703q();
        }
    }
}

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
import com.yeelight.yeelib.p194ui.view.RedSpotTipTextView;

/* renamed from: com.yeelight.yeelib.c.l.x0 */
public class C6211x0 extends C6038h {

    /* renamed from: com.yeelight.yeelib.c.l.x0$a */
    class C6212a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f13168a;

        /* renamed from: b */
        final /* synthetic */ C4198d f13169b;

        C6212a(Activity activity, C4198d dVar) {
            this.f13168a = activity;
            this.f13169b = dVar;
        }

        public void onClick(View view) {
            C6211x0.this.mo27785o(this.f13168a, this.f13169b.mo23372G());
        }
    }

    public C6211x0(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    public C6211x0(int i, String str, int i2, String str2, boolean z) {
        super(i, str, i2, str2, z);
    }

    /* renamed from: a */
    public View mo27771a(Activity activity, C4198d dVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        TextView textView = (TextView) inflate.findViewById(R$id.feature_item_info);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12835b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12836c);
        relativeLayout.setOnClickListener(new C6212a(activity, dVar));
        return relativeLayout;
    }

    /* renamed from: b */
    public void mo27772b() {
    }

    /* renamed from: c */
    public void mo27773c(C4198d dVar) {
    }

    /* renamed from: h */
    public Class mo27778h() {
        try {
            return Class.forName("com.yeelight.cherry.ui.activity.MiBandBindActivity");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: j */
    public boolean mo27780j() {
        C4198d h0 = C4257w.m11945h0(this.f12839f);
        if (h0 != null) {
            return h0.mo23408d0().mo27675Z();
        }
        return false;
    }

    public void onStatusChange(int i, C6024e eVar) {
    }
}

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
import com.yeelight.yeelib.p194ui.view.RedSpotTipTextView;

/* renamed from: com.yeelight.yeelib.c.l.w0 */
public class C6208w0 extends C6038h {

    /* renamed from: com.yeelight.yeelib.c.l.w0$a */
    class C6209a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f13165a;

        /* renamed from: b */
        final /* synthetic */ C4198d f13166b;

        C6209a(Activity activity, C4198d dVar) {
            this.f13165a = activity;
            this.f13166b = dVar;
        }

        public void onClick(View view) {
            C6208w0.this.mo27785o(this.f13165a, this.f13166b.mo23372G());
        }
    }

    public C6208w0(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    public C6208w0(int i, String str, int i2, String str2, boolean z) {
        super(i, str, i2, str2, z);
    }

    /* renamed from: a */
    public View mo27771a(Activity activity, C4198d dVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        TextView textView = (TextView) inflate.findViewById(R$id.feature_item_info);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12835b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12836c);
        relativeLayout.setOnClickListener(new C6209a(activity, dVar));
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
            return Class.forName("com.yeelight.cherry.ui.activity.BleMiBandBindActivity");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = ((com.yeelight.yeelib.p150c.p184n.C7551c) r0.mo23408d0()).mo28870X0();
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo27780j() {
        /*
            r3 = this;
            java.lang.String r0 = r3.f12839f
            com.yeelight.yeelib.c.i.d r0 = com.yeelight.yeelib.p152f.C4257w.m11945h0(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0022
            com.yeelight.yeelib.c.i.e r0 = r0.mo23408d0()
            com.yeelight.yeelib.c.n.c r0 = (com.yeelight.yeelib.p150c.p184n.C7551c) r0
            com.yeelight.yeelib.device.models.d r0 = r0.mo28870X0()
            if (r0 == 0) goto L_0x0022
            java.lang.String r2 = r0.mo29061a()
            if (r2 == 0) goto L_0x0022
            boolean r0 = r0.mo29062b()
            if (r0 == 0) goto L_0x0022
            r1 = 1
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p181l.C6208w0.mo27780j():boolean");
    }

    public void onStatusChange(int i, C6024e eVar) {
    }
}

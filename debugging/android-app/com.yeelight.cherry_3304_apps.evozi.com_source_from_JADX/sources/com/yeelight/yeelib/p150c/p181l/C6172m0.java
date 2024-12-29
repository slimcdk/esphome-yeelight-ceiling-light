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
import com.yeelight.yeelib.p150c.p151i.C6039j;
import com.yeelight.yeelib.p194ui.view.RedSpotTipTextView;

/* renamed from: com.yeelight.yeelib.c.l.m0 */
public class C6172m0 extends C6038h {

    /* renamed from: h */
    private TextView f13110h;

    /* renamed from: i */
    private C4198d f13111i;

    /* renamed from: com.yeelight.yeelib.c.l.m0$a */
    class C6173a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f13112a;

        /* renamed from: b */
        final /* synthetic */ C4198d f13113b;

        C6173a(Activity activity, C4198d dVar) {
            this.f13112a = activity;
            this.f13113b = dVar;
        }

        public void onClick(View view) {
            C6172m0.this.mo27785o(this.f13112a, this.f13113b.mo23372G());
        }
    }

    public C6172m0(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    /* renamed from: a */
    public View mo27771a(Activity activity, C4198d dVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        this.f13111i = dVar;
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12835b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12836c);
        this.f13110h = (TextView) inflate.findViewById(R$id.feature_item_info);
        relativeLayout.setOnClickListener(new C6173a(activity, dVar));
        return relativeLayout;
    }

    /* renamed from: b */
    public void mo27772b() {
        TextView textView = this.f13110h;
        if (textView != null) {
            textView.removeCallbacks((Runnable) null);
            this.f13110h = null;
        }
    }

    /* renamed from: c */
    public void mo27773c(C4198d dVar) {
    }

    /* renamed from: h */
    public Class mo27778h() {
        try {
            return this.f13111i instanceof C6039j ? Class.forName("com.yeelight.cherry.ui.activity.MeshGrpDeviceModifyActivity") : Class.forName("com.yeelight.cherry.ui.activity.GroupDeviceModifyActivity");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: j */
    public boolean mo27780j() {
        return false;
    }

    public void onStatusChange(int i, C6024e eVar) {
    }
}

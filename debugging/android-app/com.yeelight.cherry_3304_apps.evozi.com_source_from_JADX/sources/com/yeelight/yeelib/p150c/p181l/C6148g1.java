package com.yeelight.yeelib.p150c.p181l;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.p150c.C5972a;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6038h;
import com.yeelight.yeelib.p194ui.activity.ShareDeviceActivity;
import com.yeelight.yeelib.p194ui.view.RedSpotTipTextView;

/* renamed from: com.yeelight.yeelib.c.l.g1 */
public class C6148g1 extends C6038h {

    /* renamed from: h */
    private C4198d f13072h;

    /* renamed from: com.yeelight.yeelib.c.l.g1$a */
    class C6149a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f13073a;

        /* renamed from: b */
        final /* synthetic */ C4198d f13074b;

        C6149a(Activity activity, C4198d dVar) {
            this.f13073a = activity;
            this.f13074b = dVar;
        }

        public void onClick(View view) {
            C6148g1.this.mo27785o(this.f13073a, this.f13074b.mo23372G());
        }
    }

    public C6148g1(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    /* renamed from: a */
    public View mo27771a(Activity activity, C4198d dVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        this.f13072h = dVar;
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12835b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12836c);
        relativeLayout.setOnClickListener(new C6149a(activity, dVar));
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
        if (this.f13072h instanceof C5972a) {
            return ShareDeviceActivity.class;
        }
        try {
            return Class.forName("com.yeelight.cherry.ui.activity.DeviceShareActivity");
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

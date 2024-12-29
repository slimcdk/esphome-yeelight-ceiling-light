package com.yeelight.yeelib.p150c.p181l;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.device.models.YeelightTimer;
import com.yeelight.yeelib.p150c.C5972a;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6038h;
import com.yeelight.yeelib.p150c.p151i.C6050n;
import com.yeelight.yeelib.p150c.p184n.C7549a;
import com.yeelight.yeelib.p150c.p184n.C7561k;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p194ui.activity.LightAlarmActivity;
import com.yeelight.yeelib.p194ui.activity.WifiLightAlarmActivity;
import com.yeelight.yeelib.p194ui.view.RedSpotTipTextView;
import java.util.List;

/* renamed from: com.yeelight.yeelib.c.l.j1 */
public class C6161j1 extends C6038h {

    /* renamed from: com.yeelight.yeelib.c.l.j1$a */
    class C6162a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f13095a;

        /* renamed from: b */
        final /* synthetic */ C4198d f13096b;

        C6162a(Activity activity, C4198d dVar) {
            this.f13095a = activity;
            this.f13096b = dVar;
        }

        public void onClick(View view) {
            C6161j1.this.mo27785o(this.f13095a, this.f13096b.mo23372G());
        }
    }

    public C6161j1(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    /* renamed from: a */
    public View mo27771a(Activity activity, C4198d dVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12835b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12836c);
        relativeLayout.setOnClickListener(new C6162a(activity, dVar));
        return relativeLayout;
    }

    /* renamed from: b */
    public void mo27772b() {
    }

    /* renamed from: c */
    public void mo27773c(C4198d dVar) {
        if (!this.f12837d) {
            dVar.mo23353x(8, (Object) null);
        }
    }

    /* renamed from: h */
    public Class mo27778h() {
        if ((C4257w.m11945h0(this.f12839f) instanceof C6006h) || (C4257w.m11945h0(this.f12839f) instanceof C6050n)) {
            return WifiLightAlarmActivity.class;
        }
        if (C4257w.m11945h0(this.f12839f) instanceof C5972a) {
            return LightAlarmActivity.class;
        }
        return null;
    }

    /* renamed from: j */
    public boolean mo27780j() {
        List<C7561k> list;
        C4198d h0 = C4257w.m11945h0(this.f12839f);
        if (h0 instanceof C6006h) {
            List<YeelightTimer> list2 = (List) h0.mo23408d0().mo27710r(1);
            if (list2 != null) {
                for (YeelightTimer isTimerEnabled : list2) {
                    if (isTimerEnabled.isTimerEnabled()) {
                        return true;
                    }
                }
            }
        } else if (!(h0 == null || (list = (List) h0.mo23408d0().mo27710r(1)) == null)) {
            for (C7561k p : list) {
                if (p.mo28955p()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void onStatusChange(int i, C6024e eVar) {
        List<C7561k> list;
        if (i == 4096 && (eVar instanceof C7549a) && (list = (List) eVar.mo27710r(1)) != null) {
            for (C7561k kVar : list) {
                if (kVar != null) {
                    this.f12837d = true;
                    return;
                }
            }
        }
    }
}

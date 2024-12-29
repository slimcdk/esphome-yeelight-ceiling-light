package com.yeelight.yeelib.p150c.p181l;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6038h;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p194ui.activity.NightLightNewActivity;
import com.yeelight.yeelib.p194ui.view.RedSpotTipTextView;
import com.yeelight.yeelib.p194ui.view.YeelightSwitchButton;

/* renamed from: com.yeelight.yeelib.c.l.z0 */
public class C6222z0 extends C6038h {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public TextView f13188h;

    /* renamed from: i */
    private YeelightSwitchButton f13189i;

    /* renamed from: com.yeelight.yeelib.c.l.z0$a */
    class C6223a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f13190a;

        /* renamed from: b */
        final /* synthetic */ C4198d f13191b;

        C6223a(Activity activity, C4198d dVar) {
            this.f13190a = activity;
            this.f13191b = dVar;
        }

        public void onClick(View view) {
            C6222z0.this.mo27785o(this.f13190a, this.f13191b.mo23372G());
        }
    }

    /* renamed from: com.yeelight.yeelib.c.l.z0$b */
    class C6224b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C4198d f13193a;

        /* renamed from: b */
        final /* synthetic */ Activity f13194b;

        C6224b(C6222z0 z0Var, C4198d dVar, Activity activity) {
            this.f13193a = dVar;
            this.f13194b = activity;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ((C4200i) this.f13193a).mo23328f1(z);
            Activity activity = this.f13194b;
            Toast.makeText(activity, activity.getResources().getString(R$string.common_text_set_complete), 0).show();
            this.f13193a.mo23353x(3, (Object) null);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.l.z0$c */
    class C6225c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6024e f13195a;

        C6225c(C6024e eVar) {
            this.f13195a = eVar;
        }

        public void run() {
            if (C6222z0.this.f13188h != null) {
                C6222z0.this.m18768s(this.f13195a);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.c.l.z0$d */
    class C6226d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6024e f13197a;

        C6226d(C6024e eVar) {
            this.f13197a = eVar;
        }

        public void run() {
            if (C6222z0.this.f13188h != null) {
                C6222z0.this.m18768s(this.f13197a);
            }
        }
    }

    public C6222z0(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    public C6222z0(int i, String str, int i2, String str2, boolean z) {
        super(i, str, i2, str2, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m18768s(C6024e eVar) {
        YeelightSwitchButton yeelightSwitchButton = this.f13189i;
        if (yeelightSwitchButton != null) {
            yeelightSwitchButton.setChecked(eVar.mo27679b0());
        }
    }

    /* renamed from: a */
    public View mo27771a(Activity activity, C4198d dVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        TextView textView = (TextView) inflate.findViewById(R$id.feature_item_info);
        this.f13188h = textView;
        textView.setVisibility(8);
        YeelightSwitchButton yeelightSwitchButton = (YeelightSwitchButton) inflate.findViewById(R$id.feature_item_switch_view);
        this.f13189i = yeelightSwitchButton;
        yeelightSwitchButton.setVisibility(0);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12835b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12836c);
        relativeLayout.setOnClickListener(new C6223a(activity, dVar));
        this.f13189i.setChecked(((C4200i) dVar).mo23408d0().mo27679b0());
        this.f13189i.setOnPerformCheckedChangeListener(new C6224b(this, dVar, activity));
        m18768s(dVar.mo23408d0());
        return relativeLayout;
    }

    /* renamed from: b */
    public void mo27772b() {
        TextView textView = this.f13188h;
        if (textView != null) {
            textView.removeCallbacks((Runnable) null);
            this.f13188h = null;
        }
        this.f13189i = null;
    }

    /* renamed from: c */
    public void mo27773c(C4198d dVar) {
        if (!this.f12837d) {
            dVar.mo23353x(3, (Object) null);
        }
    }

    /* renamed from: h */
    public Class mo27778h() {
        return NightLightNewActivity.class;
    }

    /* renamed from: j */
    public boolean mo27780j() {
        C4198d h0 = C4257w.m11945h0(this.f12839f);
        if (h0 != null) {
            return h0.mo23408d0().mo27679b0();
        }
        return false;
    }

    public void onStatusChange(int i, C6024e eVar) {
        TextView textView;
        Runnable dVar;
        if (i != -1) {
            if (i == 4096) {
                this.f12837d = true;
                textView = this.f13188h;
                if (textView != null) {
                    dVar = new C6225c(eVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (this.f12837d && (textView = this.f13188h) != null) {
            dVar = new C6226d(eVar);
        } else {
            return;
        }
        textView.post(dVar);
    }
}

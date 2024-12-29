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
import com.yeelight.yeelib.p150c.p184n.C7559i;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p194ui.activity.PomodoroNewActivity;
import com.yeelight.yeelib.p194ui.view.RedSpotTipTextView;

/* renamed from: com.yeelight.yeelib.c.l.b1 */
public class C6119b1 extends C6038h {

    /* renamed from: h */
    private TextView f13024h;

    /* renamed from: com.yeelight.yeelib.c.l.b1$a */
    class C6120a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f13025a;

        /* renamed from: b */
        final /* synthetic */ C4198d f13026b;

        C6120a(Activity activity, C4198d dVar) {
            this.f13025a = activity;
            this.f13026b = dVar;
        }

        public void onClick(View view) {
            C6119b1.this.mo27785o(this.f13025a, this.f13026b.mo23372G());
        }
    }

    public C6119b1(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    public C6119b1(int i, String str, int i2, String str2, boolean z) {
        super(i, str, i2, str2, z);
    }

    /* renamed from: q */
    private void m18356q(C7559i iVar) {
    }

    /* renamed from: a */
    public View mo27771a(Activity activity, C4198d dVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12835b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12836c);
        this.f12839f = dVar.mo23372G();
        ((RelativeLayout) inflate.findViewById(R$id.feature_item_root)).setOnClickListener(new C6120a(activity, dVar));
        C7559i iVar = (C7559i) dVar.mo23408d0().mo27710r(11);
        if (iVar != null) {
            m18356q(iVar);
        }
        return null;
    }

    /* renamed from: b */
    public void mo27772b() {
        TextView textView = this.f13024h;
        if (textView != null) {
            textView.removeCallbacks((Runnable) null);
            this.f13024h = null;
        }
    }

    /* renamed from: c */
    public void mo27773c(C4198d dVar) {
        if (dVar.mo23408d0().mo27710r(11) == null) {
            dVar.mo23353x(15, (Object) null);
        }
    }

    /* renamed from: h */
    public Class mo27778h() {
        return PomodoroNewActivity.class;
    }

    /* renamed from: j */
    public boolean mo27780j() {
        C7559i iVar;
        C4198d h0 = C4257w.m11945h0(this.f12839f);
        if (h0 == null || (iVar = (C7559i) h0.mo23408d0().mo27710r(11)) == null) {
            return false;
        }
        return iVar.mo28927e();
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == -1 || i == 4096) {
            m18356q((C7559i) eVar.mo27710r(11));
        }
    }
}

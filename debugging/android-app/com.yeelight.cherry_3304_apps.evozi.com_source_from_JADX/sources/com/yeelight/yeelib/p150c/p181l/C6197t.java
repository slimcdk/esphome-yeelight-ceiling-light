package com.yeelight.yeelib.p150c.p181l;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6038h;
import com.yeelight.yeelib.p150c.p184n.C7550b;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p194ui.view.RedSpotTipTextView;

/* renamed from: com.yeelight.yeelib.c.l.t */
public class C6197t extends C6038h {

    /* renamed from: h */
    private TextView f13149h;

    /* renamed from: com.yeelight.yeelib.c.l.t$a */
    class C6198a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f13150a;

        /* renamed from: b */
        final /* synthetic */ C4198d f13151b;

        C6198a(Activity activity, C4198d dVar) {
            this.f13150a = activity;
            this.f13151b = dVar;
        }

        public void onClick(View view) {
            C6197t.this.mo27785o(this.f13150a, this.f13151b.mo23372G());
        }
    }

    /* renamed from: com.yeelight.yeelib.c.l.t$b */
    class C6199b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C7550b f13153a;

        C6199b(C7550b bVar) {
            this.f13153a = bVar;
        }

        public void run() {
            C6197t.this.m18685r(this.f13153a);
        }
    }

    public C6197t(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m18685r(C7550b bVar) {
        if (bVar.mo28869e()) {
            int a = bVar.mo28865a();
            int b = bVar.mo28866b();
            int c = bVar.mo28867c();
            int d = bVar.mo28868d();
            this.f13149h.setText(String.format("%02d", new Object[]{Integer.valueOf(a)}) + Constants.COLON_SEPARATOR + String.format("%02d", new Object[]{Integer.valueOf(b)}) + Constants.WAVE_SEPARATOR + String.format("%02d", new Object[]{Integer.valueOf(c)}) + Constants.COLON_SEPARATOR + String.format("%02d", new Object[]{Integer.valueOf(d)}));
            return;
        }
        this.f13149h.setText(C4297y.f7456e.getString(R$string.common_text_disabled));
    }

    /* renamed from: a */
    public View mo27771a(Activity activity, C4198d dVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12835b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12836c);
        this.f13149h = (TextView) inflate.findViewById(R$id.feature_item_info);
        C7550b bVar = (C7550b) dVar.mo23408d0().mo27710r(14);
        if (bVar != null) {
            m18685r(bVar);
            if (bVar.mo28869e()) {
                ((C4200i) dVar).mo23434n1();
            } else {
                ((C4200i) dVar).mo23426B1();
            }
        }
        relativeLayout.setOnClickListener(new C6198a(activity, dVar));
        return relativeLayout;
    }

    /* renamed from: b */
    public void mo27772b() {
        TextView textView = this.f13149h;
        if (textView != null) {
            textView.removeCallbacks((Runnable) null);
            this.f13149h = null;
        }
    }

    /* renamed from: c */
    public void mo27773c(C4198d dVar) {
        C7550b bVar = (C7550b) dVar.mo23408d0().mo27710r(14);
        if (bVar != null) {
            TextView textView = this.f13149h;
            if (textView != null) {
                textView.post(new C6199b(bVar));
            }
            C4200i iVar = (C4200i) dVar;
            if (bVar.mo28869e()) {
                iVar.mo23434n1();
            } else {
                iVar.mo23426B1();
            }
        }
    }

    /* renamed from: h */
    public Class mo27778h() {
        return null;
    }

    /* renamed from: j */
    public boolean mo27780j() {
        return false;
    }

    public void onStatusChange(int i, C6024e eVar) {
    }
}

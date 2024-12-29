package com.yeelight.yeelib.p150c.p181l;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6038h;
import com.yeelight.yeelib.p194ui.view.RedSpotTipTextView;
import com.yeelight.yeelib.p194ui.widget.C10526e;

/* renamed from: com.yeelight.yeelib.c.l.a0 */
public class C6112a0 extends C6038h {

    /* renamed from: com.yeelight.yeelib.c.l.a0$a */
    class C6113a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f13018a;

        /* renamed from: b */
        final /* synthetic */ C4198d f13019b;

        /* renamed from: com.yeelight.yeelib.c.l.a0$a$a */
        class C6114a implements DialogInterface.OnClickListener {
            C6114a(C6113a aVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }

        /* renamed from: com.yeelight.yeelib.c.l.a0$a$b */
        class C6115b implements DialogInterface.OnClickListener {
            C6115b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C6113a.this.f13019b.mo23342r();
                C6113a.this.f13018a.finish();
            }
        }

        C6113a(C6112a0 a0Var, Activity activity, C4198d dVar) {
            this.f13018a = activity;
            this.f13019b = dVar;
        }

        public void onClick(View view) {
            C10526e.C10531e eVar = new C10526e.C10531e(this.f13018a);
            eVar.mo33358i(this.f13018a.getString(R$string.feature_disconnect_bt));
            eVar.mo33356g(this.f13018a.getString(R$string.setting_disconnect_text_1));
            C10526e b = eVar.mo33351b();
            b.mo33335g(-2, this.f13018a.getString(R$string.cancel).toString(), new C6114a(this));
            b.mo33335g(-1, this.f13018a.getString(R$string.common_text_ok).toString(), new C6115b());
            b.setCancelable(true);
            b.show();
        }
    }

    public C6112a0(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    /* renamed from: a */
    public View mo27771a(Activity activity, C4198d dVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12835b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12836c);
        relativeLayout.setOnClickListener(new C6113a(this, activity, dVar));
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
        return null;
    }

    /* renamed from: j */
    public boolean mo27780j() {
        return false;
    }

    public void onStatusChange(int i, C6024e eVar) {
    }
}

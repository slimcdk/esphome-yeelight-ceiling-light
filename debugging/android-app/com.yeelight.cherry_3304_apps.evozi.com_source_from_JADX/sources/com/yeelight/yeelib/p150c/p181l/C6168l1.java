package com.yeelight.yeelib.p150c.p181l;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6038h;
import com.yeelight.yeelib.p150c.p183m.C7186q;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p194ui.view.RedSpotTipTextView;
import com.yeelight.yeelib.p194ui.widget.C10521d;

/* renamed from: com.yeelight.yeelib.c.l.l1 */
public class C6168l1 extends C6038h {

    /* renamed from: com.yeelight.yeelib.c.l.l1$a */
    class C6169a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f13104a;

        /* renamed from: b */
        final /* synthetic */ C4198d f13105b;

        /* renamed from: com.yeelight.yeelib.c.l.l1$a$a */
        class C6170a implements DialogInterface.OnClickListener {
            C6170a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C6169a.this.f13105b.mo23317U0();
                C6169a.this.f13104a.finish();
            }
        }

        C6169a(C6168l1 l1Var, Activity activity, C4198d dVar) {
            this.f13104a = activity;
            this.f13105b = dVar;
        }

        public void onClick(View view) {
            ImageView imageView = new ImageView(this.f13104a);
            imageView.setImageDrawable(ContextCompat.getDrawable(this.f13104a, R$drawable.setting_unbind_info));
            C10521d.C10523b bVar = new C10521d.C10523b(this.f13104a);
            bVar.mo33325j(C4297y.f7456e.getString(R$string.common_text_notice));
            bVar.mo33320e(this.f13104a.getString(R$string.recovery_info));
            bVar.mo33326k(imageView);
            bVar.mo33322g(this.f13104a.getString(R$string.common_text_cancel), (DialogInterface.OnClickListener) null);
            bVar.mo33324i(this.f13104a.getString(R$string.common_text_unbind_sure), new C6170a());
            if (this.f13105b instanceof C7186q) {
                bVar.mo33320e(this.f13104a.getString(R$string.setting_unbind_text_1));
            }
            bVar.mo33316a().show();
        }
    }

    public C6168l1(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    /* renamed from: a */
    public View mo27771a(Activity activity, C4198d dVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        TextView textView = (TextView) inflate.findViewById(R$id.feature_item_info);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12835b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12836c);
        relativeLayout.setOnClickListener(new C6169a(this, activity, dVar));
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

package com.yeelight.yeelib.p150c.p181l;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.device.models.C7622g;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6038h;
import com.yeelight.yeelib.p194ui.view.RedSpotTipTextView;

/* renamed from: com.yeelight.yeelib.c.l.g0 */
public class C6146g0 extends C6038h {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public TextView f13068h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ImageView f13069i;

    /* renamed from: com.yeelight.yeelib.c.l.g0$a */
    class C6147a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C7622g f13070a;

        C6147a(C7622g gVar) {
            this.f13070a = gVar;
        }

        public void run() {
            int i;
            ImageView imageView;
            if (C6146g0.this.f13068h != null) {
                if (this.f13070a.mo29042g()) {
                    C6146g0.this.f13068h.setTextColor(SupportMenu.CATEGORY_MASK);
                    C6146g0.this.f13068h.setText(this.f13070a.mo29041d());
                    imageView = C6146g0.this.f13069i;
                    i = 0;
                } else {
                    C6146g0.this.f13068h.setTextColor(ContextCompat.getColor(C6146g0.this.f13068h.getContext(), R$color.setting_item_info_text_color));
                    C6146g0.this.f13068h.setText(this.f13070a.mo29040c());
                    imageView = C6146g0.this.f13069i;
                    i = 4;
                }
                imageView.setVisibility(i);
            }
        }
    }

    public C6146g0(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    /* renamed from: a */
    public View mo27771a(Activity activity, C4198d dVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        this.f12834a = (RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name);
        this.f13068h = (TextView) inflate.findViewById(R$id.feature_item_info);
        this.f13069i = (ImageView) inflate.findViewById(R$id.feature_item_more);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12835b);
        this.f12834a.setText(this.f12836c);
        if (dVar.mo23384N() != null) {
            this.f13068h.setTextColor(ContextCompat.getColor(activity, R$color.setting_item_info_text_color));
            this.f13068h.setText(dVar.mo23384N().mo29040c());
            this.f13069i.setVisibility(4);
        }
        return relativeLayout;
    }

    /* renamed from: b */
    public void mo27772b() {
        TextView textView = this.f13068h;
        if (textView != null) {
            textView.removeCallbacks((Runnable) null);
            this.f13068h = null;
        }
        ImageView imageView = this.f13069i;
        if (imageView != null) {
            imageView.removeCallbacks((Runnable) null);
            this.f13069i = null;
        }
        this.f12834a = null;
    }

    /* renamed from: c */
    public void mo27773c(C4198d dVar) {
        if (dVar.mo23384N() == null || (dVar instanceof C6006h)) {
            dVar.mo23353x(5, (Object) null);
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
        if (i == 256) {
            C7622g e = mo27775e(eVar);
            TextView textView = this.f13068h;
            if (textView != null && e != null) {
                textView.post(new C6147a(e));
            }
        }
    }
}

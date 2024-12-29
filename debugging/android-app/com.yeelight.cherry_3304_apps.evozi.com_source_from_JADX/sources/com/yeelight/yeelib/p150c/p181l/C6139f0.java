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
import com.yeelight.yeelib.p150c.C5972a;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6038h;
import com.yeelight.yeelib.p150c.p151i.C6039j;
import com.yeelight.yeelib.p150c.p151i.C6067o;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p194ui.activity.BlankActivity;
import com.yeelight.yeelib.p194ui.view.RedSpotTipTextView;

/* renamed from: com.yeelight.yeelib.c.l.f0 */
public class C6139f0 extends C6038h {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public TextView f13052h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ImageView f13053i;

    /* renamed from: j */
    private int f13054j = -1;

    /* renamed from: com.yeelight.yeelib.c.l.f0$a */
    class C6140a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f13055a;

        /* renamed from: b */
        final /* synthetic */ C4198d f13056b;

        C6140a(Activity activity, C4198d dVar) {
            this.f13055a = activity;
            this.f13056b = dVar;
        }

        public void onClick(View view) {
            C6139f0.this.mo27785o(this.f13055a, this.f13056b.mo23372G());
        }
    }

    /* renamed from: com.yeelight.yeelib.c.l.f0$b */
    class C6141b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C7622g f13058a;

        C6141b(C7622g gVar) {
            this.f13058a = gVar;
        }

        public void run() {
            int i;
            ImageView imageView;
            if (C6139f0.this.f13052h != null) {
                if (this.f13058a.mo29042g()) {
                    C6139f0.this.f13052h.setTextColor(SupportMenu.CATEGORY_MASK);
                    C6139f0.this.f13052h.setText(this.f13058a.mo29041d());
                    imageView = C6139f0.this.f13053i;
                    i = 0;
                } else {
                    C6139f0.this.f13052h.setTextColor(ContextCompat.getColor(C6139f0.this.f13052h.getContext(), R$color.setting_item_info_text_color));
                    C6139f0.this.f13052h.setText(this.f13058a.mo29040c());
                    imageView = C6139f0.this.f13053i;
                    i = 4;
                }
                imageView.setVisibility(i);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.c.l.f0$c */
    class C6142c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C7622g f13060a;

        C6142c(C7622g gVar) {
            this.f13060a = gVar;
        }

        public void run() {
            int i;
            ImageView imageView;
            if (C6139f0.this.f13052h != null) {
                C6139f0.this.f13052h.setTextColor(ContextCompat.getColor(C6139f0.this.f13052h.getContext(), R$color.setting_item_info_text_color));
                if (this.f13060a.mo29042g()) {
                    C6139f0.this.f13052h.setText(this.f13060a.mo29041d());
                    imageView = C6139f0.this.f13053i;
                    i = 0;
                } else {
                    C6139f0.this.f13052h.setText(this.f13060a.mo29040c());
                    imageView = C6139f0.this.f13053i;
                    i = 4;
                }
                imageView.setVisibility(i);
            }
        }
    }

    public C6139f0(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
        int i3;
        C4198d h0 = C4257w.m11945h0(str2);
        if ((h0 instanceof C6006h) || (h0 instanceof C6067o)) {
            i3 = 0;
        } else if (h0 instanceof C5972a) {
            i3 = 1;
        } else if (h0 instanceof C6039j) {
            i3 = 2;
        } else {
            return;
        }
        this.f13054j = i3;
    }

    /* renamed from: a */
    public View mo27771a(Activity activity, C4198d dVar) {
        String str;
        TextView textView;
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        this.f12834a = (RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name);
        this.f13052h = (TextView) inflate.findViewById(R$id.feature_item_info);
        this.f13053i = (ImageView) inflate.findViewById(R$id.feature_item_more);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12835b);
        this.f12834a.setText(this.f12836c);
        if (dVar.mo23384N() != null) {
            if (dVar.mo23384N().mo29042g()) {
                this.f13052h.setTextColor(SupportMenu.CATEGORY_MASK);
                textView = this.f13052h;
                str = dVar.mo23384N().mo29041d();
            } else {
                this.f13052h.setTextColor(ContextCompat.getColor(activity, R$color.setting_item_info_text_color));
                textView = this.f13052h;
                str = dVar.mo23384N().mo29040c();
            }
            textView.setText(str);
        }
        relativeLayout.setOnClickListener(new C6140a(activity, dVar));
        return relativeLayout;
    }

    /* renamed from: b */
    public void mo27772b() {
        TextView textView = this.f13052h;
        if (textView != null) {
            textView.removeCallbacks((Runnable) null);
            this.f13052h = null;
        }
        ImageView imageView = this.f13053i;
        if (imageView != null) {
            imageView.removeCallbacks((Runnable) null);
            this.f13053i = null;
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
        try {
            int i = this.f13054j;
            return i != 0 ? i != 1 ? i != 2 ? BlankActivity.class : Class.forName("com.yeelight.cherry.ui.activity.MeshDeviceFirmwareUpgradeActivity") : Class.forName("com.yeelight.cherry.ui.activity.BluetoothDeviceUpgradeActivity") : Class.forName("com.yeelight.cherry.ui.activity.FirmwareUpgradeActivity");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: j */
    public boolean mo27780j() {
        return false;
    }

    /* renamed from: k */
    public boolean mo27781k(C4198d dVar) {
        if (dVar.mo23384N() != null) {
            return dVar.mo23384N().mo29042g();
        }
        return false;
    }

    public void onStatusChange(int i, C6024e eVar) {
        TextView textView;
        Runnable runnable;
        if (i == 256) {
            C7622g e = mo27775e(eVar);
            textView = this.f13052h;
            if (textView != null && e != null) {
                runnable = new C6141b(e);
            } else {
                return;
            }
        } else if (i == 512) {
            C7622g e2 = mo27775e(eVar);
            textView = this.f13052h;
            if (textView != null && e2 != null) {
                runnable = new C6142c(e2);
            } else {
                return;
            }
        } else {
            return;
        }
        textView.post(runnable);
    }
}

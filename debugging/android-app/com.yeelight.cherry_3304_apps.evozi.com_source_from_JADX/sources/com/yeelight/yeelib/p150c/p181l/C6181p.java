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
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6038h;
import com.yeelight.yeelib.p150c.p184n.C7561k;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p194ui.activity.WakeUpActivity;
import com.yeelight.yeelib.p194ui.view.RedSpotTipTextView;
import java.util.Calendar;

/* renamed from: com.yeelight.yeelib.c.l.p */
public class C6181p extends C6038h {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public TextView f13124h;

    /* renamed from: com.yeelight.yeelib.c.l.p$a */
    class C6182a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f13125a;

        /* renamed from: b */
        final /* synthetic */ C4198d f13126b;

        C6182a(Activity activity, C4198d dVar) {
            this.f13125a = activity;
            this.f13126b = dVar;
        }

        public void onClick(View view) {
            C6181p.this.mo27785o(this.f13125a, this.f13126b.mo23372G());
        }
    }

    /* renamed from: com.yeelight.yeelib.c.l.p$b */
    class C6183b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C7561k f13128a;

        C6183b(C7561k kVar) {
            this.f13128a = kVar;
        }

        public void run() {
            if (C6181p.this.f13124h != null) {
                C6181p.this.m18636s(this.f13128a);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.c.l.p$c */
    class C6184c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C7561k f13130a;

        C6184c(C7561k kVar) {
            this.f13130a = kVar;
        }

        public void run() {
            if (C6181p.this.f13124h != null) {
                C6181p.this.m18636s(this.f13130a);
            }
        }
    }

    public C6181p(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    public C6181p(int i, String str, int i2, String str2, boolean z) {
        super(i, str, i2, str2, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m18636s(C7561k kVar) {
        if (!kVar.mo28955p()) {
            this.f13124h.setText(R$string.common_text_disabled);
            return;
        }
        Calendar instance = Calendar.getInstance();
        instance.set(11, kVar.mo28942d());
        instance.set(12, kVar.mo28943e());
        instance.add(12, 30);
        int i = instance.get(11);
        int i2 = instance.get(12);
        this.f13124h.setText(String.format("%02d", new Object[]{Integer.valueOf(i)}) + Constants.COLON_SEPARATOR + String.format("%02d", new Object[]{Integer.valueOf(i2)}));
    }

    /* renamed from: a */
    public View mo27771a(Activity activity, C4198d dVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12835b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12836c);
        this.f13124h = (TextView) inflate.findViewById(R$id.feature_item_info);
        relativeLayout.setOnClickListener(new C6182a(activity, dVar));
        if (this.f12837d) {
            m18636s((C7561k) dVar.mo23408d0().mo27710r(4));
        }
        return relativeLayout;
    }

    /* renamed from: b */
    public void mo27772b() {
        TextView textView = this.f13124h;
        if (textView != null) {
            textView.removeCallbacks((Runnable) null);
            this.f13124h = null;
        }
    }

    /* renamed from: c */
    public void mo27773c(C4198d dVar) {
        if (!this.f12837d) {
            dVar.mo23353x(4, (Object) null);
        }
    }

    /* renamed from: h */
    public Class mo27778h() {
        return WakeUpActivity.class;
    }

    /* renamed from: j */
    public boolean mo27780j() {
        C7561k kVar;
        C4198d h0 = C4257w.m11945h0(this.f12839f);
        if (h0 == null || (kVar = (C7561k) h0.mo23408d0().mo27710r(4)) == null) {
            return false;
        }
        return kVar.mo28955p();
    }

    public void onStatusChange(int i, C6024e eVar) {
        TextView textView;
        Runnable cVar;
        C7561k kVar;
        if (i != -1) {
            if (i == 4096 && (kVar = (C7561k) eVar.mo27710r(4)) != null) {
                this.f12837d = true;
                textView = this.f13124h;
                if (textView != null) {
                    cVar = new C6183b(kVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (this.f12837d) {
            C7561k kVar2 = (C7561k) eVar.mo27710r(4);
            textView = this.f13124h;
            if (textView != null && kVar2 != null) {
                cVar = new C6184c(kVar2);
            } else {
                return;
            }
        } else {
            return;
        }
        textView.post(cVar);
    }
}

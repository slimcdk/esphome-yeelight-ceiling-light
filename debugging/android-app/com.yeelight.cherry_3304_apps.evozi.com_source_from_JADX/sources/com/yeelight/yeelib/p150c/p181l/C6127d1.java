package com.yeelight.yeelib.p150c.p181l;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p150c.C5972a;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6038h;
import com.yeelight.yeelib.p194ui.activity.DeviceNameEditActivity;
import com.yeelight.yeelib.p194ui.view.RedSpotTipTextView;

/* renamed from: com.yeelight.yeelib.c.l.d1 */
public class C6127d1 extends C6038h {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public TextView f13034h;

    /* renamed from: com.yeelight.yeelib.c.l.d1$a */
    class C6128a implements View.OnClickListener {
        C6128a() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_id", C6127d1.this.f12839f);
            intent.setClass(view.getContext(), DeviceNameEditActivity.class);
            view.getContext().startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.yeelib.c.l.d1$b */
    class C6129b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6024e f13036a;

        C6129b(C6024e eVar) {
            this.f13036a = eVar;
        }

        public void run() {
            String A;
            if (C6127d1.this.f13034h != null && (A = this.f13036a.mo27627A()) != null && !A.equals("")) {
                C6127d1.this.f13034h.setText(A);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.c.l.d1$c */
    class C6130c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6024e f13038a;

        C6130c(C6024e eVar) {
            this.f13038a = eVar;
        }

        public void run() {
            String A;
            if (C6127d1.this.f13034h != null && (A = this.f13038a.mo27627A()) != null && !A.equals("")) {
                C6127d1.this.f13034h.setText(A);
            }
        }
    }

    public C6127d1(int i, String str, int i2, String str2) {
        super(i, str, i2, str2);
    }

    /* renamed from: a */
    public View mo27771a(Activity activity, C4198d dVar) {
        View inflate = LayoutInflater.from(activity).inflate(R$layout.item_feature, (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R$id.feature_item_root);
        ((ImageView) inflate.findViewById(R$id.feature_item_icon)).setImageResource(this.f12835b);
        ((RedSpotTipTextView) inflate.findViewById(R$id.feature_item_name)).setText(this.f12836c);
        this.f13034h = (TextView) inflate.findViewById(R$id.feature_item_info);
        boolean z = dVar instanceof C5972a;
        String U = dVar.mo23397U();
        if (z && TextUtils.isEmpty(U)) {
            U = activity.getString(R$string.yeelight_device_name_cherry);
        }
        this.f13034h.setText(U);
        relativeLayout.setOnClickListener(new C6128a());
        return relativeLayout;
    }

    /* renamed from: b */
    public void mo27772b() {
        TextView textView = this.f13034h;
        if (textView != null) {
            textView.removeCallbacks((Runnable) null);
            this.f13034h = null;
        }
    }

    /* renamed from: c */
    public void mo27773c(C4198d dVar) {
        "RenameFeature, device name: " + dVar.mo23397U();
        if (dVar instanceof C5972a) {
            dVar.mo23353x(0, (Object) null);
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
        TextView textView;
        Runnable cVar;
        if (i != -1) {
            if (i == 1024) {
                this.f12837d = true;
                textView = this.f13034h;
                if (textView != null) {
                    cVar = new C6129b(eVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (this.f12837d && (textView = this.f13034h) != null) {
            cVar = new C6130c(eVar);
        } else {
            return;
        }
        textView.post(cVar);
    }
}

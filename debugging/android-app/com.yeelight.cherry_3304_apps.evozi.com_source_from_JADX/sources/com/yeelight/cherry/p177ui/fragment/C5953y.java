package com.yeelight.cherry.p177ui.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.yeelight.cherry.C11744R$drawable;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.activity.MiBandBaseActivity;
import com.yeelight.cherry.p177ui.view.CherrySearchCircleView;

/* renamed from: com.yeelight.cherry.ui.fragment.y */
public class C5953y extends Fragment {

    /* renamed from: a */
    private View f12561a;

    /* renamed from: b */
    private CherrySearchCircleView f12562b;

    /* renamed from: c */
    private TextView f12563c;

    /* renamed from: d */
    private TextView f12564d;

    /* renamed from: e */
    private ImageView f12565e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public MiBandBaseActivity f12566f;

    /* renamed from: g */
    private Button f12567g;

    /* renamed from: com.yeelight.cherry.ui.fragment.y$a */
    class C5954a implements View.OnClickListener {
        C5954a() {
        }

        public void onClick(View view) {
            C5953y.this.mo27395b(0);
            C5953y.this.f12566f.mo26174c0();
        }
    }

    /* renamed from: b */
    public void mo27395b(int i) {
        if (i == 0) {
            this.f12563c.setText(2131755905);
            this.f12564d.setText(2131755904);
            this.f12562b.setVisibility(0);
            this.f12562b.setType(1);
            this.f12567g.setVisibility(8);
            this.f12562b.mo27418b();
            this.f12565e.setImageResource(C11744R$drawable.miband_icon);
        }
        if (i == 1) {
            this.f12563c.setText(2131755900);
            this.f12564d.setText(2131755899);
            this.f12567g.setText(2131755898);
            this.f12562b.setType(0);
            this.f12567g.setVisibility(0);
            this.f12562b.mo27419c();
            this.f12565e.setImageResource(C11744R$drawable.common_x);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f12566f = (MiBandBaseActivity) getActivity();
        View inflate = layoutInflater.inflate(C11748R$layout.fragment_miband_common, viewGroup, false);
        this.f12561a = inflate;
        this.f12562b = (CherrySearchCircleView) inflate.findViewById(C11745R$id.progress);
        this.f12565e = (ImageView) this.f12561a.findViewById(C11745R$id.common_middle_image);
        Button button = (Button) this.f12561a.findViewById(C11745R$id.miband_bottom_btn);
        this.f12567g = button;
        button.setVisibility(8);
        this.f12567g.setOnClickListener(new C5954a());
        this.f12562b.setVisibility(0);
        this.f12562b.setType(1);
        this.f12564d = (TextView) this.f12561a.findViewById(C11745R$id.sub_title);
        this.f12563c = (TextView) this.f12561a.findViewById(2131297422);
        this.f12564d.setText(2131755904);
        this.f12563c.setText(2131755905);
        return this.f12561a;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            this.f12562b.mo27419c();
        } else {
            this.f12562b.mo27418b();
        }
    }

    public void onPause() {
        super.onPause();
        this.f12562b.mo27419c();
    }

    public void onResume() {
        super.onResume();
        this.f12562b.mo27418b();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        mo27395b((arguments == null || !arguments.getBoolean("isNoDevice")) ? 0 : 1);
    }
}

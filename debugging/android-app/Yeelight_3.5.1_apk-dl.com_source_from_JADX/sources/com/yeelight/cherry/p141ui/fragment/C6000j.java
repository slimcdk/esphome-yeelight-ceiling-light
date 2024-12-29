package com.yeelight.cherry.p141ui.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.yeelight.cherry.C12224R$drawable;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.activity.MiBandBaseActivity;
import com.yeelight.cherry.p141ui.view.CherrySearchCircleView;

/* renamed from: com.yeelight.cherry.ui.fragment.j */
public class C6000j extends Fragment {

    /* renamed from: a */
    private View f12140a;

    /* renamed from: b */
    private CherrySearchCircleView f12141b;

    /* renamed from: c */
    private TextView f12142c;

    /* renamed from: d */
    private TextView f12143d;

    /* renamed from: e */
    private ImageView f12144e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public MiBandBaseActivity f12145f;

    /* renamed from: g */
    private Button f12146g;

    /* renamed from: com.yeelight.cherry.ui.fragment.j$a */
    class C6001a implements View.OnClickListener {
        C6001a() {
        }

        public void onClick(View view) {
            C6000j.this.mo31325b(0);
            C6000j.this.f12145f.mo30224c0();
        }
    }

    /* renamed from: b */
    public void mo31325b(int i) {
        if (i == 0) {
            this.f12142c.setText(2131755915);
            this.f12143d.setText(2131755914);
            this.f12141b.setVisibility(0);
            this.f12141b.setType(1);
            this.f12146g.setVisibility(8);
            this.f12141b.mo31362b();
            this.f12144e.setImageResource(C12224R$drawable.miband_icon);
        }
        if (i == 1) {
            this.f12142c.setText(2131755910);
            this.f12143d.setText(2131755909);
            this.f12146g.setText(2131755908);
            this.f12141b.setType(0);
            this.f12146g.setVisibility(0);
            this.f12141b.mo31363c();
            this.f12144e.setImageResource(C12224R$drawable.common_x);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f12145f = (MiBandBaseActivity) getActivity();
        View inflate = layoutInflater.inflate(C12228R$layout.fragment_miband_common, viewGroup, false);
        this.f12140a = inflate;
        this.f12141b = (CherrySearchCircleView) inflate.findViewById(C12225R$id.progress);
        this.f12144e = (ImageView) this.f12140a.findViewById(C12225R$id.common_middle_image);
        Button button = (Button) this.f12140a.findViewById(C12225R$id.miband_bottom_btn);
        this.f12146g = button;
        button.setVisibility(8);
        this.f12146g.setOnClickListener(new C6001a());
        this.f12141b.setVisibility(0);
        this.f12141b.setType(1);
        this.f12143d = (TextView) this.f12140a.findViewById(C12225R$id.sub_title);
        this.f12142c = (TextView) this.f12140a.findViewById(2131297589);
        this.f12143d.setText(2131755914);
        this.f12142c.setText(2131755915);
        return this.f12140a;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            this.f12141b.mo31363c();
        } else {
            this.f12141b.mo31362b();
        }
    }

    public void onPause() {
        super.onPause();
        this.f12141b.mo31363c();
    }

    public void onResume() {
        super.onResume();
        this.f12141b.mo31362b();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        mo31325b((arguments == null || !arguments.getBoolean("isNoDevice")) ? 0 : 1);
    }
}

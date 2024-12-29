package com.yeelight.cherry.p141ui.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
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
import p051j4.C9193k;

/* renamed from: com.yeelight.cherry.ui.fragment.k */
public class C6002k extends Fragment {

    /* renamed from: a */
    private View f12148a;

    /* renamed from: b */
    private Button f12149b;

    /* renamed from: c */
    private Button f12150c;

    /* renamed from: d */
    private TextView f12151d;

    /* renamed from: e */
    private TextView f12152e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public MiBandBaseActivity f12153f;

    /* renamed from: g */
    private Handler f12154g = new C6003a();

    /* renamed from: com.yeelight.cherry.ui.fragment.k$a */
    class C6003a extends Handler {
        C6003a() {
        }

        public void handleMessage(Message message) {
            C6002k.this.f12153f.mo30225d0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.k$b */
    class C6004b implements View.OnClickListener {
        C6004b() {
        }

        public void onClick(View view) {
            C6002k.this.f12153f.mo30221a0();
            C6002k.this.f12153f.mo30220Z((String) null);
            C6002k.this.f12153f.mo30216V(true);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.k$c */
    class C6005c implements View.OnClickListener {
        C6005c() {
        }

        public void onClick(View view) {
            C6002k.this.f12153f.mo30218X();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.k$d */
    class C6006d implements View.OnClickListener {
        C6006d(C6002k kVar) {
        }

        public void onClick(View view) {
            view.setEnabled(false);
            view.setEnabled(true);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C12228R$layout.fragment_miband_common, viewGroup, false);
        this.f12148a = inflate;
        inflate.findViewById(C12225R$id.miband_bottom_btn).setOnClickListener(new C6004b());
        this.f12148a.findViewById(C12225R$id.progress).setVisibility(8);
        ImageView imageView = (ImageView) this.f12148a.findViewById(C12225R$id.common_middle_image);
        imageView.setImageResource(C12224R$drawable.miband_bind_large_icon);
        imageView.setTranslationY((float) (-C9193k.m22152c(getActivity(), 50.0f)));
        this.f12149b = (Button) this.f12148a.findViewById(C12225R$id.double_btn_left);
        this.f12150c = (Button) this.f12148a.findViewById(C12225R$id.double_btn_right);
        this.f12151d = (TextView) this.f12148a.findViewById(C12225R$id.sub_title);
        this.f12152e = (TextView) this.f12148a.findViewById(2131297589);
        this.f12151d.setText(2131755917);
        this.f12152e.setText(2131755918);
        this.f12149b.setOnClickListener(new C6005c());
        this.f12150c.setOnClickListener(new C6006d(this));
        this.f12153f = (MiBandBaseActivity) getActivity();
        return this.f12148a;
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            this.f12154g.removeMessages(0);
        }
    }

    public void onPause() {
        super.onPause();
        this.f12154g.removeMessages(0);
    }

    public void onResume() {
        super.onResume();
        if (!isHidden()) {
            this.f12154g.sendEmptyMessageDelayed(0, 2000);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }
}

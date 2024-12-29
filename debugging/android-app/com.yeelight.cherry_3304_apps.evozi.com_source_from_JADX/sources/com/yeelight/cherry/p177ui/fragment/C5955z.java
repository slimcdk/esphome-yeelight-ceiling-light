package com.yeelight.cherry.p177ui.fragment;

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
import com.yeelight.cherry.C11744R$drawable;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.activity.MiBandBaseActivity;
import com.yeelight.yeelib.utils.C10547m;

/* renamed from: com.yeelight.cherry.ui.fragment.z */
public class C5955z extends Fragment {

    /* renamed from: a */
    private View f12569a;

    /* renamed from: b */
    private Button f12570b;

    /* renamed from: c */
    private Button f12571c;

    /* renamed from: d */
    private TextView f12572d;

    /* renamed from: e */
    private TextView f12573e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public MiBandBaseActivity f12574f;

    /* renamed from: g */
    private Handler f12575g = new C5956a();

    /* renamed from: com.yeelight.cherry.ui.fragment.z$a */
    class C5956a extends Handler {
        C5956a() {
        }

        public void handleMessage(Message message) {
            C5955z.this.f12574f.mo26175d0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.z$b */
    class C5957b implements View.OnClickListener {
        C5957b() {
        }

        public void onClick(View view) {
            C5955z.this.f12574f.mo26171a0();
            C5955z.this.f12574f.mo26170Z((String) null);
            C5955z.this.f12574f.mo26166V(true);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.z$c */
    class C5958c implements View.OnClickListener {
        C5958c() {
        }

        public void onClick(View view) {
            C5955z.this.f12574f.mo26168X();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.z$d */
    class C5959d implements View.OnClickListener {
        C5959d(C5955z zVar) {
        }

        public void onClick(View view) {
            view.setEnabled(false);
            view.setEnabled(true);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C11748R$layout.fragment_miband_common, viewGroup, false);
        this.f12569a = inflate;
        inflate.findViewById(C11745R$id.miband_bottom_btn).setOnClickListener(new C5957b());
        this.f12569a.findViewById(C11745R$id.progress).setVisibility(8);
        ImageView imageView = (ImageView) this.f12569a.findViewById(C11745R$id.common_middle_image);
        imageView.setImageResource(C11744R$drawable.miband_bind_large_icon);
        imageView.setTranslationY((float) (-C10547m.m25753c(getActivity(), 50.0f)));
        this.f12570b = (Button) this.f12569a.findViewById(C11745R$id.double_btn_left);
        this.f12571c = (Button) this.f12569a.findViewById(C11745R$id.double_btn_right);
        this.f12572d = (TextView) this.f12569a.findViewById(C11745R$id.sub_title);
        this.f12573e = (TextView) this.f12569a.findViewById(2131297422);
        this.f12572d.setText(2131755907);
        this.f12573e.setText(2131755908);
        this.f12570b.setOnClickListener(new C5958c());
        this.f12571c.setOnClickListener(new C5959d(this));
        this.f12574f = (MiBandBaseActivity) getActivity();
        return this.f12569a;
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            this.f12575g.removeMessages(0);
        }
    }

    public void onPause() {
        super.onPause();
        this.f12575g.removeMessages(0);
    }

    public void onResume() {
        super.onResume();
        if (!isHidden()) {
            this.f12575g.sendEmptyMessageDelayed(0, 2000);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }
}

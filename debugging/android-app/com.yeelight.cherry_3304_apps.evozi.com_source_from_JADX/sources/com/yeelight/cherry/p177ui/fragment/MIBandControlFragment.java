package com.yeelight.cherry.p177ui.fragment;

import android.animation.ObjectAnimator;
import android.app.Fragment;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.core.content.ContextCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.yeelight.cherry.C11737R$anim;
import com.yeelight.cherry.C11743R$dimen;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.activity.MiBandBaseActivity;
import com.yeelight.yeelib.p191j.p192a.C9897c;
import com.yeelight.yeelib.utils.C10547m;
import java.lang.reflect.Field;

/* renamed from: com.yeelight.cherry.ui.fragment.MIBandControlFragment */
public class MIBandControlFragment extends Fragment implements ViewSwitcher.ViewFactory {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public MiBandBaseActivity f12446a;

    /* renamed from: b */
    private Unbinder f12447b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f12448c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f12449d = false;

    /* renamed from: e */
    private int f12450e = 2131231809;

    /* renamed from: f */
    private View f12451f;
    @BindView(2131296365)
    LinearLayout mBindLayout;
    @BindView(2131296364)
    TextView mBindText;
    @BindView(2131297002)
    TextView mBroadcastText;
    @BindView(2131297004)
    ImageView mMiddleImage;
    @BindView(2131297363)
    TextView mSubTitleText;
    @BindView(2131296762)
    ImageView mSwitchImage;
    @BindView(2131297373)
    LinearLayout mSwitchLayout;
    @BindView(2131297372)
    TextView mSwitchText;
    @BindView(2131297422)
    TextSwitcher mTitleText;

    /* renamed from: com.yeelight.cherry.ui.fragment.MIBandControlFragment$a */
    class C5898a implements Runnable {
        C5898a() {
        }

        public void run() {
            MIBandControlFragment mIBandControlFragment = MIBandControlFragment.this;
            mIBandControlFragment.mMiddleImage.setTranslationY((float) (-C10547m.m25751a(mIBandControlFragment.getActivity(), 10.0f)));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.MIBandControlFragment$b */
    class C5899b implements View.OnClickListener {

        /* renamed from: com.yeelight.cherry.ui.fragment.MIBandControlFragment$b$a */
        class C5900a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ View f12454a;

            C5900a(C5899b bVar, View view) {
                this.f12454a = view;
            }

            public void run() {
                this.f12454a.setEnabled(true);
            }
        }

        C5899b() {
        }

        public void onClick(View view) {
            view.setEnabled(false);
            MIBandControlFragment mIBandControlFragment = MIBandControlFragment.this;
            boolean unused = mIBandControlFragment.f12449d = !mIBandControlFragment.f12449d;
            MIBandControlFragment mIBandControlFragment2 = MIBandControlFragment.this;
            mIBandControlFragment2.mSwitchImage.setImageResource(mIBandControlFragment2.f12449d ? 2131232002 : 2131232001);
            MIBandControlFragment.this.f12446a.mo26172b0(MIBandControlFragment.this.f12449d);
            new Handler().postDelayed(new C5900a(this, view), 200);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.MIBandControlFragment$c */
    class C5901c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f12455a;

        /* renamed from: com.yeelight.cherry.ui.fragment.MIBandControlFragment$c$a */
        class C5902a implements C9897c.C9901d {
            C5902a() {
            }

            /* renamed from: a */
            public void mo27312a(String str, C9897c cVar) {
                MIBandControlFragment.this.f12446a.mo26176e0();
                MIBandControlFragment.this.mo27300g(false);
                MIBandControlFragment.this.mo27301h();
                cVar.dismiss();
            }
        }

        C5901c(int i) {
            this.f12455a = i;
        }

        public void onClick(View view) {
            MiBandBaseActivity c;
            int i;
            if (MIBandControlFragment.this.f12448c == 0) {
                int i2 = this.f12455a;
                if (i2 == 2131231810) {
                    c = MIBandControlFragment.this.f12446a;
                    i = 7;
                } else if (i2 == 2131231808) {
                    c = MIBandControlFragment.this.f12446a;
                    i = 8;
                } else {
                    c = MIBandControlFragment.this.f12446a;
                    i = 5;
                }
                C9897c e = C9897c.m24272e(c, i);
                e.mo32009m(2131755892);
                e.mo32008l(new C5902a());
                e.show();
                return;
            }
            MIBandControlFragment.this.f12446a.mo26167W();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.MIBandControlFragment$d */
    class C5903d implements Runnable {
        C5903d() {
        }

        public void run() {
            try {
                if (MIBandControlFragment.this.f12448c == 0) {
                    MIBandControlFragment.this.mSwitchLayout.setEnabled(true);
                    MIBandControlFragment.this.mSwitchText.setAlpha(1.0f);
                    MIBandControlFragment.this.mBindText.setText(2131755894);
                    MIBandControlFragment.this.mTitleText.setText(MIBandControlFragment.this.getResources().getString(2131755263));
                    MIBandControlFragment.this.mSubTitleText.setText(2131755888);
                    MIBandControlFragment.this.mBroadcastText.setVisibility(0);
                    return;
                }
                MIBandControlFragment.this.mSwitchLayout.setEnabled(false);
                MIBandControlFragment.this.mSwitchText.setAlpha(0.5f);
                MIBandControlFragment.this.mSwitchImage.setImageResource(2131232001);
                MIBandControlFragment.this.mBindText.setText(2131755874);
                MIBandControlFragment.this.mTitleText.setText(MIBandControlFragment.this.getResources().getString(2131755263));
                MIBandControlFragment.this.mSubTitleText.setText(2131755888);
                MIBandControlFragment.this.mBroadcastText.setVisibility(8);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: e */
    private void m17364e(int i) {
        this.mBindLayout.setOnClickListener(new C5901c(i));
    }

    /* renamed from: f */
    public void mo27299f(boolean z) {
        this.f12449d = z;
        ImageView imageView = this.mSwitchImage;
        if (imageView != null) {
            imageView.setImageResource(z ? 2131232002 : 2131232001);
        }
    }

    /* renamed from: g */
    public void mo27300g(boolean z) {
        this.f12448c = z ? 0 : 1;
    }

    /* renamed from: h */
    public void mo27301h() {
        new Handler(Looper.getMainLooper()).postDelayed(new C5903d(), this.mSwitchLayout == null ? 1000 : 1);
    }

    public View makeView() {
        TextView textView = new TextView(getActivity());
        textView.setTextSize((float) C10547m.m25757g(getActivity(), (float) getResources().getDimensionPixelSize(C11743R$dimen.common_title_text_size)));
        textView.setGravity(17);
        textView.setTextColor(ContextCompat.getColor(getActivity(), 2131100165));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f12446a = (MiBandBaseActivity) getActivity();
        View inflate = layoutInflater.inflate(C11748R$layout.fragment_miband_control, viewGroup, false);
        this.f12451f = inflate;
        this.f12447b = ButterKnife.bind((Object) this, inflate);
        this.mSwitchImage.setImageResource(this.f12449d ? 2131232002 : 2131232001);
        this.mTitleText.setFactory(this);
        this.mTitleText.setInAnimation(getActivity(), C11737R$anim.alpha_in);
        this.mTitleText.setOutAnimation(getActivity(), C11737R$anim.alpha_out);
        m17364e(2131231809);
        if (getArguments() != null) {
            int i = getArguments().getInt("middleImgRes", 2131231809);
            this.f12450e = i;
            m17364e(i);
        }
        this.mMiddleImage.setImageResource(this.f12450e);
        this.mMiddleImage.post(new C5898a());
        this.mBroadcastText.setText(2131755901);
        this.mBroadcastText.setAlpha(1.0f);
        this.mBroadcastText.setMovementMethod(LinkMovementMethod.getInstance());
        this.mSwitchLayout.setOnClickListener(new C5899b());
        mo27301h();
        return this.f12451f;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f12447b.unbind();
    }

    public void onDetach() {
        super.onDetach();
        try {
            Field declaredField = Fragment.class.getDeclaredField("mChildFragmentManager");
            declaredField.setAccessible(true);
            declaredField.set(this, (Object) null);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            mo27301h();
            ObjectAnimator.ofFloat(this.mMiddleImage, "scaleX", new float[]{0.0f, 1.0f}).start();
            ObjectAnimator.ofFloat(this.mMiddleImage, "scaleY", new float[]{0.0f, 1.0f}).start();
        }
    }

    public void onResume() {
        super.onResume();
        mo27301h();
    }
}

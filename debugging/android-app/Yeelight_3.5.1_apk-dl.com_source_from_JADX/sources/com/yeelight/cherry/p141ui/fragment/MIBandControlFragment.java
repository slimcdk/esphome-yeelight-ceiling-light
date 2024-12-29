package com.yeelight.cherry.p141ui.fragment;

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
import com.yeelight.cherry.C12217R$anim;
import com.yeelight.cherry.C12223R$dimen;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.activity.MiBandBaseActivity;
import java.lang.reflect.Field;
import p051j4.C9193k;
import p160g4.C9071c;

/* renamed from: com.yeelight.cherry.ui.fragment.MIBandControlFragment */
public class MIBandControlFragment extends Fragment implements ViewSwitcher.ViewFactory {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public MiBandBaseActivity f12040a;

    /* renamed from: b */
    private Unbinder f12041b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f12042c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f12043d = false;

    /* renamed from: e */
    private int f12044e = 2131231831;

    /* renamed from: f */
    private View f12045f;
    @BindView(2131296419)
    LinearLayout mBindLayout;
    @BindView(2131296418)
    TextView mBindText;
    @BindView(2131297121)
    TextView mBroadcastText;
    @BindView(2131297123)
    ImageView mMiddleImage;
    @BindView(2131297518)
    TextView mSubTitleText;
    @BindView(2131296866)
    ImageView mSwitchImage;
    @BindView(2131297529)
    LinearLayout mSwitchLayout;
    @BindView(2131297528)
    TextView mSwitchText;
    @BindView(2131297589)
    TextSwitcher mTitleText;

    /* renamed from: com.yeelight.cherry.ui.fragment.MIBandControlFragment$a */
    class C5958a implements Runnable {
        C5958a() {
        }

        public void run() {
            MIBandControlFragment mIBandControlFragment = MIBandControlFragment.this;
            mIBandControlFragment.mMiddleImage.setTranslationY((float) (-C9193k.m22150a(mIBandControlFragment.getActivity(), 10.0f)));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.MIBandControlFragment$b */
    class C5959b implements View.OnClickListener {

        /* renamed from: com.yeelight.cherry.ui.fragment.MIBandControlFragment$b$a */
        class C5960a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ View f12048a;

            C5960a(C5959b bVar, View view) {
                this.f12048a = view;
            }

            public void run() {
                this.f12048a.setEnabled(true);
            }
        }

        C5959b() {
        }

        public void onClick(View view) {
            view.setEnabled(false);
            MIBandControlFragment mIBandControlFragment = MIBandControlFragment.this;
            boolean unused = mIBandControlFragment.f12043d = !mIBandControlFragment.f12043d;
            MIBandControlFragment mIBandControlFragment2 = MIBandControlFragment.this;
            mIBandControlFragment2.mSwitchImage.setImageResource(mIBandControlFragment2.f12043d ? 2131232028 : 2131232027);
            MIBandControlFragment.this.f12040a.mo30222b0(MIBandControlFragment.this.f12043d);
            new Handler().postDelayed(new C5960a(this, view), 200);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.MIBandControlFragment$c */
    class C5961c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f12049a;

        /* renamed from: com.yeelight.cherry.ui.fragment.MIBandControlFragment$c$a */
        class C5962a implements C9071c.C9075d {
            C5962a() {
            }

            /* renamed from: a */
            public void mo31271a(String str, C9071c cVar) {
                MIBandControlFragment.this.f12040a.mo30226e0();
                MIBandControlFragment.this.mo31259g(false);
                MIBandControlFragment.this.mo31260h();
                cVar.dismiss();
            }
        }

        C5961c(int i) {
            this.f12049a = i;
        }

        public void onClick(View view) {
            MiBandBaseActivity c;
            int i;
            if (MIBandControlFragment.this.f12042c == 0) {
                int i2 = this.f12049a;
                if (i2 == 2131231832) {
                    c = MIBandControlFragment.this.f12040a;
                    i = 7;
                } else if (i2 == 2131231830) {
                    c = MIBandControlFragment.this.f12040a;
                    i = 8;
                } else {
                    c = MIBandControlFragment.this.f12040a;
                    i = 5;
                }
                C9071c e = C9071c.m21725e(c, i);
                e.mo37021m(2131755902);
                e.mo37020l(new C5962a());
                e.show();
                return;
            }
            MIBandControlFragment.this.f12040a.mo30217W();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.fragment.MIBandControlFragment$d */
    class C5963d implements Runnable {
        C5963d() {
        }

        public void run() {
            try {
                if (MIBandControlFragment.this.f12042c == 0) {
                    MIBandControlFragment.this.mSwitchLayout.setEnabled(true);
                    MIBandControlFragment.this.mSwitchText.setAlpha(1.0f);
                    MIBandControlFragment.this.mBindText.setText(2131755904);
                    MIBandControlFragment mIBandControlFragment = MIBandControlFragment.this;
                    mIBandControlFragment.mTitleText.setText(mIBandControlFragment.getResources().getString(2131755267));
                    MIBandControlFragment.this.mSubTitleText.setText(2131755898);
                    MIBandControlFragment.this.mBroadcastText.setVisibility(0);
                    return;
                }
                MIBandControlFragment.this.mSwitchLayout.setEnabled(false);
                MIBandControlFragment.this.mSwitchText.setAlpha(0.5f);
                MIBandControlFragment.this.mSwitchImage.setImageResource(2131232027);
                MIBandControlFragment.this.mBindText.setText(2131755884);
                MIBandControlFragment mIBandControlFragment2 = MIBandControlFragment.this;
                mIBandControlFragment2.mTitleText.setText(mIBandControlFragment2.getResources().getString(2131755267));
                MIBandControlFragment.this.mSubTitleText.setText(2131755898);
                MIBandControlFragment.this.mBroadcastText.setVisibility(8);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: e */
    private void m17418e(int i) {
        this.mBindLayout.setOnClickListener(new C5961c(i));
    }

    /* renamed from: f */
    public void mo31258f(boolean z) {
        this.f12043d = z;
        ImageView imageView = this.mSwitchImage;
        if (imageView != null) {
            imageView.setImageResource(z ? 2131232028 : 2131232027);
        }
    }

    /* renamed from: g */
    public void mo31259g(boolean z) {
        this.f12042c = z ? 0 : 1;
    }

    /* renamed from: h */
    public void mo31260h() {
        new Handler(Looper.getMainLooper()).postDelayed(new C5963d(), this.mSwitchLayout == null ? 1000 : 1);
    }

    public View makeView() {
        TextView textView = new TextView(getActivity());
        textView.setTextSize((float) C9193k.m22156g(getActivity(), (float) getResources().getDimensionPixelSize(C12223R$dimen.common_title_text_size)));
        textView.setGravity(17);
        textView.setTextColor(ContextCompat.getColor(getActivity(), 2131100168));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f12040a = (MiBandBaseActivity) getActivity();
        View inflate = layoutInflater.inflate(C12228R$layout.fragment_miband_control, viewGroup, false);
        this.f12045f = inflate;
        this.f12041b = ButterKnife.bind((Object) this, inflate);
        this.mSwitchImage.setImageResource(this.f12043d ? 2131232028 : 2131232027);
        this.mTitleText.setFactory(this);
        this.mTitleText.setInAnimation(getActivity(), C12217R$anim.alpha_in);
        this.mTitleText.setOutAnimation(getActivity(), C12217R$anim.alpha_out);
        m17418e(2131231831);
        if (getArguments() != null) {
            int i = getArguments().getInt("middleImgRes", 2131231831);
            this.f12044e = i;
            m17418e(i);
        }
        this.mMiddleImage.setImageResource(this.f12044e);
        this.mMiddleImage.post(new C5958a());
        this.mBroadcastText.setText(2131755911);
        this.mBroadcastText.setAlpha(1.0f);
        this.mBroadcastText.setMovementMethod(LinkMovementMethod.getInstance());
        this.mSwitchLayout.setOnClickListener(new C5959b());
        mo31260h();
        return this.f12045f;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f12041b.unbind();
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
            mo31260h();
            ObjectAnimator.ofFloat(this.mMiddleImage, "scaleX", new float[]{0.0f, 1.0f}).start();
            ObjectAnimator.ofFloat(this.mMiddleImage, "scaleY", new float[]{0.0f, 1.0f}).start();
        }
    }

    public void onResume() {
        super.onResume();
        mo31260h();
    }
}

package com.yeelight.cherry.p141ui.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.yeelight.cherry.C12225R$id;

/* renamed from: com.yeelight.cherry.ui.activity.MiBandBindActivity_ViewBinding */
public class MiBandBindActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MiBandBindActivity f10891a;

    /* renamed from: b */
    private View f10892b;

    /* renamed from: c */
    private View f10893c;

    /* renamed from: d */
    private View f10894d;

    /* renamed from: e */
    private View f10895e;

    /* renamed from: com.yeelight.cherry.ui.activity.MiBandBindActivity_ViewBinding$a */
    class C5473a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ MiBandBindActivity f10896a;

        C5473a(MiBandBindActivity_ViewBinding miBandBindActivity_ViewBinding, MiBandBindActivity miBandBindActivity) {
            this.f10896a = miBandBindActivity;
        }

        public void doClick(View view) {
            this.f10896a.onViewClicked(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MiBandBindActivity_ViewBinding$b */
    class C5474b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ MiBandBindActivity f10897a;

        C5474b(MiBandBindActivity_ViewBinding miBandBindActivity_ViewBinding, MiBandBindActivity miBandBindActivity) {
            this.f10897a = miBandBindActivity;
        }

        public void doClick(View view) {
            this.f10897a.onViewClicked(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MiBandBindActivity_ViewBinding$c */
    class C5475c extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ MiBandBindActivity f10898a;

        C5475c(MiBandBindActivity_ViewBinding miBandBindActivity_ViewBinding, MiBandBindActivity miBandBindActivity) {
            this.f10898a = miBandBindActivity;
        }

        public void doClick(View view) {
            this.f10898a.onViewClicked(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MiBandBindActivity_ViewBinding$d */
    class C5476d extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ MiBandBindActivity f10899a;

        C5476d(MiBandBindActivity_ViewBinding miBandBindActivity_ViewBinding, MiBandBindActivity miBandBindActivity) {
            this.f10899a = miBandBindActivity;
        }

        public void doClick(View view) {
            this.f10899a.onViewClicked(view);
        }
    }

    @UiThread
    public MiBandBindActivity_ViewBinding(MiBandBindActivity miBandBindActivity, View view) {
        this.f10891a = miBandBindActivity;
        View findRequiredView = Utils.findRequiredView(view, C12225R$id.ll_sleep_off, "field 'mLlSleepOff' and method 'onViewClicked'");
        miBandBindActivity.mLlSleepOff = (LinearLayout) Utils.castView(findRequiredView, C12225R$id.ll_sleep_off, "field 'mLlSleepOff'", LinearLayout.class);
        this.f10892b = findRequiredView;
        findRequiredView.setOnClickListener(new C5473a(this, miBandBindActivity));
        miBandBindActivity.mImgSleepSwitch = (ImageView) Utils.findRequiredViewAsType(view, C12225R$id.img_sleep_switch, "field 'mImgSleepSwitch'", ImageView.class);
        View findRequiredView2 = Utils.findRequiredView(view, C12225R$id.btn_bind_band, "field 'mBtnBindBand' and method 'onViewClicked'");
        miBandBindActivity.mBtnBindBand = (Button) Utils.castView(findRequiredView2, C12225R$id.btn_bind_band, "field 'mBtnBindBand'", Button.class);
        this.f10893c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C5474b(this, miBandBindActivity));
        View findRequiredView3 = Utils.findRequiredView(view, C12225R$id.tv_relieve_bind, "field 'mTvRelieveBind' and method 'onViewClicked'");
        miBandBindActivity.mTvRelieveBind = (TextView) Utils.castView(findRequiredView3, C12225R$id.tv_relieve_bind, "field 'mTvRelieveBind'", TextView.class);
        this.f10894d = findRequiredView3;
        findRequiredView3.setOnClickListener(new C5475c(this, miBandBindActivity));
        miBandBindActivity.mTvIntroduce = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.tv_introduce, "field 'mTvIntroduce'", TextView.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296876, "method 'onViewClicked'");
        this.f10895e = findRequiredView4;
        findRequiredView4.setOnClickListener(new C5476d(this, miBandBindActivity));
    }

    @CallSuper
    public void unbind() {
        MiBandBindActivity miBandBindActivity = this.f10891a;
        if (miBandBindActivity != null) {
            this.f10891a = null;
            miBandBindActivity.mLlSleepOff = null;
            miBandBindActivity.mImgSleepSwitch = null;
            miBandBindActivity.mBtnBindBand = null;
            miBandBindActivity.mTvRelieveBind = null;
            miBandBindActivity.mTvIntroduce = null;
            this.f10892b.setOnClickListener((View.OnClickListener) null);
            this.f10892b = null;
            this.f10893c.setOnClickListener((View.OnClickListener) null);
            this.f10893c = null;
            this.f10894d.setOnClickListener((View.OnClickListener) null);
            this.f10894d = null;
            this.f10895e.setOnClickListener((View.OnClickListener) null);
            this.f10895e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

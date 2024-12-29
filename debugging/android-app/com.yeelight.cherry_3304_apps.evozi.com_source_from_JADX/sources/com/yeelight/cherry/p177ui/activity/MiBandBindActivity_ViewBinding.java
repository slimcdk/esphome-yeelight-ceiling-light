package com.yeelight.cherry.p177ui.activity;

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
import com.yeelight.cherry.C11745R$id;

/* renamed from: com.yeelight.cherry.ui.activity.MiBandBindActivity_ViewBinding */
public class MiBandBindActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MiBandBindActivity f11321a;

    /* renamed from: b */
    private View f11322b;

    /* renamed from: c */
    private View f11323c;

    /* renamed from: d */
    private View f11324d;

    /* renamed from: e */
    private View f11325e;

    /* renamed from: com.yeelight.cherry.ui.activity.MiBandBindActivity_ViewBinding$a */
    class C5427a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ MiBandBindActivity f11326a;

        C5427a(MiBandBindActivity_ViewBinding miBandBindActivity_ViewBinding, MiBandBindActivity miBandBindActivity) {
            this.f11326a = miBandBindActivity;
        }

        public void doClick(View view) {
            this.f11326a.onViewClicked(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MiBandBindActivity_ViewBinding$b */
    class C5428b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ MiBandBindActivity f11327a;

        C5428b(MiBandBindActivity_ViewBinding miBandBindActivity_ViewBinding, MiBandBindActivity miBandBindActivity) {
            this.f11327a = miBandBindActivity;
        }

        public void doClick(View view) {
            this.f11327a.onViewClicked(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MiBandBindActivity_ViewBinding$c */
    class C5429c extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ MiBandBindActivity f11328a;

        C5429c(MiBandBindActivity_ViewBinding miBandBindActivity_ViewBinding, MiBandBindActivity miBandBindActivity) {
            this.f11328a = miBandBindActivity;
        }

        public void doClick(View view) {
            this.f11328a.onViewClicked(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MiBandBindActivity_ViewBinding$d */
    class C5430d extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ MiBandBindActivity f11329a;

        C5430d(MiBandBindActivity_ViewBinding miBandBindActivity_ViewBinding, MiBandBindActivity miBandBindActivity) {
            this.f11329a = miBandBindActivity;
        }

        public void doClick(View view) {
            this.f11329a.onViewClicked(view);
        }
    }

    @UiThread
    public MiBandBindActivity_ViewBinding(MiBandBindActivity miBandBindActivity, View view) {
        this.f11321a = miBandBindActivity;
        View findRequiredView = Utils.findRequiredView(view, C11745R$id.ll_sleep_off, "field 'mLlSleepOff' and method 'onViewClicked'");
        miBandBindActivity.mLlSleepOff = (LinearLayout) Utils.castView(findRequiredView, C11745R$id.ll_sleep_off, "field 'mLlSleepOff'", LinearLayout.class);
        this.f11322b = findRequiredView;
        findRequiredView.setOnClickListener(new C5427a(this, miBandBindActivity));
        miBandBindActivity.mImgSleepSwitch = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.img_sleep_switch, "field 'mImgSleepSwitch'", ImageView.class);
        View findRequiredView2 = Utils.findRequiredView(view, C11745R$id.btn_bind_band, "field 'mBtnBindBand' and method 'onViewClicked'");
        miBandBindActivity.mBtnBindBand = (Button) Utils.castView(findRequiredView2, C11745R$id.btn_bind_band, "field 'mBtnBindBand'", Button.class);
        this.f11323c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C5428b(this, miBandBindActivity));
        View findRequiredView3 = Utils.findRequiredView(view, C11745R$id.tv_relieve_bind, "field 'mTvRelieveBind' and method 'onViewClicked'");
        miBandBindActivity.mTvRelieveBind = (TextView) Utils.castView(findRequiredView3, C11745R$id.tv_relieve_bind, "field 'mTvRelieveBind'", TextView.class);
        this.f11324d = findRequiredView3;
        findRequiredView3.setOnClickListener(new C5429c(this, miBandBindActivity));
        miBandBindActivity.mTvIntroduce = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.tv_introduce, "field 'mTvIntroduce'", TextView.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296772, "method 'onViewClicked'");
        this.f11325e = findRequiredView4;
        findRequiredView4.setOnClickListener(new C5430d(this, miBandBindActivity));
    }

    @CallSuper
    public void unbind() {
        MiBandBindActivity miBandBindActivity = this.f11321a;
        if (miBandBindActivity != null) {
            this.f11321a = null;
            miBandBindActivity.mLlSleepOff = null;
            miBandBindActivity.mImgSleepSwitch = null;
            miBandBindActivity.mBtnBindBand = null;
            miBandBindActivity.mTvRelieveBind = null;
            miBandBindActivity.mTvIntroduce = null;
            this.f11322b.setOnClickListener((View.OnClickListener) null);
            this.f11322b = null;
            this.f11323c.setOnClickListener((View.OnClickListener) null);
            this.f11323c = null;
            this.f11324d.setOnClickListener((View.OnClickListener) null);
            this.f11324d = null;
            this.f11325e.setOnClickListener((View.OnClickListener) null);
            this.f11325e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

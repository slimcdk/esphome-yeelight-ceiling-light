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

/* renamed from: com.yeelight.cherry.ui.activity.BleMiBandBindActivity_ViewBinding */
public class BleMiBandBindActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BleMiBandBindActivity f10371a;

    /* renamed from: b */
    private View f10372b;

    /* renamed from: c */
    private View f10373c;

    /* renamed from: d */
    private View f10374d;

    /* renamed from: e */
    private View f10375e;

    /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandBindActivity_ViewBinding$a */
    class C5012a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ BleMiBandBindActivity f10376a;

        C5012a(BleMiBandBindActivity_ViewBinding bleMiBandBindActivity_ViewBinding, BleMiBandBindActivity bleMiBandBindActivity) {
            this.f10376a = bleMiBandBindActivity;
        }

        public void doClick(View view) {
            this.f10376a.onViewClicked(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandBindActivity_ViewBinding$b */
    class C5013b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ BleMiBandBindActivity f10377a;

        C5013b(BleMiBandBindActivity_ViewBinding bleMiBandBindActivity_ViewBinding, BleMiBandBindActivity bleMiBandBindActivity) {
            this.f10377a = bleMiBandBindActivity;
        }

        public void doClick(View view) {
            this.f10377a.onViewClicked(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandBindActivity_ViewBinding$c */
    class C5014c extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ BleMiBandBindActivity f10378a;

        C5014c(BleMiBandBindActivity_ViewBinding bleMiBandBindActivity_ViewBinding, BleMiBandBindActivity bleMiBandBindActivity) {
            this.f10378a = bleMiBandBindActivity;
        }

        public void doClick(View view) {
            this.f10378a.onViewClicked(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandBindActivity_ViewBinding$d */
    class C5015d extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ BleMiBandBindActivity f10379a;

        C5015d(BleMiBandBindActivity_ViewBinding bleMiBandBindActivity_ViewBinding, BleMiBandBindActivity bleMiBandBindActivity) {
            this.f10379a = bleMiBandBindActivity;
        }

        public void doClick(View view) {
            this.f10379a.onViewClicked(view);
        }
    }

    @UiThread
    public BleMiBandBindActivity_ViewBinding(BleMiBandBindActivity bleMiBandBindActivity, View view) {
        this.f10371a = bleMiBandBindActivity;
        View findRequiredView = Utils.findRequiredView(view, C11745R$id.ll_sleep_off, "field 'mLlSleepOff' and method 'onViewClicked'");
        bleMiBandBindActivity.mLlSleepOff = (LinearLayout) Utils.castView(findRequiredView, C11745R$id.ll_sleep_off, "field 'mLlSleepOff'", LinearLayout.class);
        this.f10372b = findRequiredView;
        findRequiredView.setOnClickListener(new C5012a(this, bleMiBandBindActivity));
        bleMiBandBindActivity.mImgSleepSwitch = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.img_sleep_switch, "field 'mImgSleepSwitch'", ImageView.class);
        View findRequiredView2 = Utils.findRequiredView(view, C11745R$id.btn_bind_band, "field 'mBtnBindBand' and method 'onViewClicked'");
        bleMiBandBindActivity.mBtnBindBand = (Button) Utils.castView(findRequiredView2, C11745R$id.btn_bind_band, "field 'mBtnBindBand'", Button.class);
        this.f10373c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C5013b(this, bleMiBandBindActivity));
        View findRequiredView3 = Utils.findRequiredView(view, C11745R$id.tv_relieve_bind, "field 'mTvRelieveBind' and method 'onViewClicked'");
        bleMiBandBindActivity.mTvRelieveBind = (TextView) Utils.castView(findRequiredView3, C11745R$id.tv_relieve_bind, "field 'mTvRelieveBind'", TextView.class);
        this.f10374d = findRequiredView3;
        findRequiredView3.setOnClickListener(new C5014c(this, bleMiBandBindActivity));
        bleMiBandBindActivity.mTvIntroduce = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.tv_introduce, "field 'mTvIntroduce'", TextView.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296772, "method 'onViewClicked'");
        this.f10375e = findRequiredView4;
        findRequiredView4.setOnClickListener(new C5015d(this, bleMiBandBindActivity));
    }

    @CallSuper
    public void unbind() {
        BleMiBandBindActivity bleMiBandBindActivity = this.f10371a;
        if (bleMiBandBindActivity != null) {
            this.f10371a = null;
            bleMiBandBindActivity.mLlSleepOff = null;
            bleMiBandBindActivity.mImgSleepSwitch = null;
            bleMiBandBindActivity.mBtnBindBand = null;
            bleMiBandBindActivity.mTvRelieveBind = null;
            bleMiBandBindActivity.mTvIntroduce = null;
            this.f10372b.setOnClickListener((View.OnClickListener) null);
            this.f10372b = null;
            this.f10373c.setOnClickListener((View.OnClickListener) null);
            this.f10373c = null;
            this.f10374d.setOnClickListener((View.OnClickListener) null);
            this.f10374d = null;
            this.f10375e.setOnClickListener((View.OnClickListener) null);
            this.f10375e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

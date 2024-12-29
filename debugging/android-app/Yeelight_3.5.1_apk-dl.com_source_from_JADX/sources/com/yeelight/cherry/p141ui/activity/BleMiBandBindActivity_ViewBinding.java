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

/* renamed from: com.yeelight.cherry.ui.activity.BleMiBandBindActivity_ViewBinding */
public class BleMiBandBindActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BleMiBandBindActivity f9916a;

    /* renamed from: b */
    private View f9917b;

    /* renamed from: c */
    private View f9918c;

    /* renamed from: d */
    private View f9919d;

    /* renamed from: e */
    private View f9920e;

    /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandBindActivity_ViewBinding$a */
    class C5057a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ BleMiBandBindActivity f9921a;

        C5057a(BleMiBandBindActivity_ViewBinding bleMiBandBindActivity_ViewBinding, BleMiBandBindActivity bleMiBandBindActivity) {
            this.f9921a = bleMiBandBindActivity;
        }

        public void doClick(View view) {
            this.f9921a.onViewClicked(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandBindActivity_ViewBinding$b */
    class C5058b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ BleMiBandBindActivity f9922a;

        C5058b(BleMiBandBindActivity_ViewBinding bleMiBandBindActivity_ViewBinding, BleMiBandBindActivity bleMiBandBindActivity) {
            this.f9922a = bleMiBandBindActivity;
        }

        public void doClick(View view) {
            this.f9922a.onViewClicked(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandBindActivity_ViewBinding$c */
    class C5059c extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ BleMiBandBindActivity f9923a;

        C5059c(BleMiBandBindActivity_ViewBinding bleMiBandBindActivity_ViewBinding, BleMiBandBindActivity bleMiBandBindActivity) {
            this.f9923a = bleMiBandBindActivity;
        }

        public void doClick(View view) {
            this.f9923a.onViewClicked(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandBindActivity_ViewBinding$d */
    class C5060d extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ BleMiBandBindActivity f9924a;

        C5060d(BleMiBandBindActivity_ViewBinding bleMiBandBindActivity_ViewBinding, BleMiBandBindActivity bleMiBandBindActivity) {
            this.f9924a = bleMiBandBindActivity;
        }

        public void doClick(View view) {
            this.f9924a.onViewClicked(view);
        }
    }

    @UiThread
    public BleMiBandBindActivity_ViewBinding(BleMiBandBindActivity bleMiBandBindActivity, View view) {
        this.f9916a = bleMiBandBindActivity;
        View findRequiredView = Utils.findRequiredView(view, C12225R$id.ll_sleep_off, "field 'mLlSleepOff' and method 'onViewClicked'");
        bleMiBandBindActivity.mLlSleepOff = (LinearLayout) Utils.castView(findRequiredView, C12225R$id.ll_sleep_off, "field 'mLlSleepOff'", LinearLayout.class);
        this.f9917b = findRequiredView;
        findRequiredView.setOnClickListener(new C5057a(this, bleMiBandBindActivity));
        bleMiBandBindActivity.mImgSleepSwitch = (ImageView) Utils.findRequiredViewAsType(view, C12225R$id.img_sleep_switch, "field 'mImgSleepSwitch'", ImageView.class);
        View findRequiredView2 = Utils.findRequiredView(view, C12225R$id.btn_bind_band, "field 'mBtnBindBand' and method 'onViewClicked'");
        bleMiBandBindActivity.mBtnBindBand = (Button) Utils.castView(findRequiredView2, C12225R$id.btn_bind_band, "field 'mBtnBindBand'", Button.class);
        this.f9918c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C5058b(this, bleMiBandBindActivity));
        View findRequiredView3 = Utils.findRequiredView(view, C12225R$id.tv_relieve_bind, "field 'mTvRelieveBind' and method 'onViewClicked'");
        bleMiBandBindActivity.mTvRelieveBind = (TextView) Utils.castView(findRequiredView3, C12225R$id.tv_relieve_bind, "field 'mTvRelieveBind'", TextView.class);
        this.f9919d = findRequiredView3;
        findRequiredView3.setOnClickListener(new C5059c(this, bleMiBandBindActivity));
        bleMiBandBindActivity.mTvIntroduce = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.tv_introduce, "field 'mTvIntroduce'", TextView.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296876, "method 'onViewClicked'");
        this.f9920e = findRequiredView4;
        findRequiredView4.setOnClickListener(new C5060d(this, bleMiBandBindActivity));
    }

    @CallSuper
    public void unbind() {
        BleMiBandBindActivity bleMiBandBindActivity = this.f9916a;
        if (bleMiBandBindActivity != null) {
            this.f9916a = null;
            bleMiBandBindActivity.mLlSleepOff = null;
            bleMiBandBindActivity.mImgSleepSwitch = null;
            bleMiBandBindActivity.mBtnBindBand = null;
            bleMiBandBindActivity.mTvRelieveBind = null;
            bleMiBandBindActivity.mTvIntroduce = null;
            this.f9917b.setOnClickListener((View.OnClickListener) null);
            this.f9917b = null;
            this.f9918c.setOnClickListener((View.OnClickListener) null);
            this.f9918c = null;
            this.f9919d.setOnClickListener((View.OnClickListener) null);
            this.f9919d = null;
            this.f9920e.setOnClickListener((View.OnClickListener) null);
            this.f9920e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

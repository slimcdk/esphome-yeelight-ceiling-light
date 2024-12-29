package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.yeelib.p194ui.view.CircleBarView;

/* renamed from: com.yeelight.cherry.ui.activity.BleMiBandSearchActivity_ViewBinding */
public class BleMiBandSearchActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BleMiBandSearchActivity f10398a;

    /* renamed from: b */
    private View f10399b;

    /* renamed from: c */
    private View f10400c;

    /* renamed from: d */
    private View f10401d;

    /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandSearchActivity_ViewBinding$a */
    class C5022a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ BleMiBandSearchActivity f10402a;

        C5022a(BleMiBandSearchActivity_ViewBinding bleMiBandSearchActivity_ViewBinding, BleMiBandSearchActivity bleMiBandSearchActivity) {
            this.f10402a = bleMiBandSearchActivity;
        }

        public void doClick(View view) {
            this.f10402a.onViewClicked(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandSearchActivity_ViewBinding$b */
    class C5023b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ BleMiBandSearchActivity f10403a;

        C5023b(BleMiBandSearchActivity_ViewBinding bleMiBandSearchActivity_ViewBinding, BleMiBandSearchActivity bleMiBandSearchActivity) {
            this.f10403a = bleMiBandSearchActivity;
        }

        public void doClick(View view) {
            this.f10403a.onViewClicked(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandSearchActivity_ViewBinding$c */
    class C5024c extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ BleMiBandSearchActivity f10404a;

        C5024c(BleMiBandSearchActivity_ViewBinding bleMiBandSearchActivity_ViewBinding, BleMiBandSearchActivity bleMiBandSearchActivity) {
            this.f10404a = bleMiBandSearchActivity;
        }

        public void doClick(View view) {
            this.f10404a.onViewClicked(view);
        }
    }

    @UiThread
    public BleMiBandSearchActivity_ViewBinding(BleMiBandSearchActivity bleMiBandSearchActivity, View view) {
        this.f10398a = bleMiBandSearchActivity;
        View findRequiredView = Utils.findRequiredView(view, C11745R$id.tv_cancel, "field 'mTvCancel' and method 'onViewClicked'");
        bleMiBandSearchActivity.mTvCancel = (TextView) Utils.castView(findRequiredView, C11745R$id.tv_cancel, "field 'mTvCancel'", TextView.class);
        this.f10399b = findRequiredView;
        findRequiredView.setOnClickListener(new C5022a(this, bleMiBandSearchActivity));
        bleMiBandSearchActivity.mCircleBarView = (CircleBarView) Utils.findRequiredViewAsType(view, C11745R$id.circleBarView, "field 'mCircleBarView'", CircleBarView.class);
        bleMiBandSearchActivity.mLlSearch = (LinearLayout) Utils.findRequiredViewAsType(view, C11745R$id.ll_search, "field 'mLlSearch'", LinearLayout.class);
        bleMiBandSearchActivity.mLlConnect = (LinearLayout) Utils.findRequiredViewAsType(view, C11745R$id.ll_connect, "field 'mLlConnect'", LinearLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, C11745R$id.ll_connect_status, "field 'mLLConnectStatus' and method 'onViewClicked'");
        bleMiBandSearchActivity.mLLConnectStatus = (LinearLayout) Utils.castView(findRequiredView2, C11745R$id.ll_connect_status, "field 'mLLConnectStatus'", LinearLayout.class);
        this.f10400c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C5023b(this, bleMiBandSearchActivity));
        bleMiBandSearchActivity.mTvConnectStatus = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.tv_connect_status, "field 'mTvConnectStatus'", TextView.class);
        bleMiBandSearchActivity.mImgConnectStatus = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.img_connect_status, "field 'mImgConnectStatus'", ImageView.class);
        bleMiBandSearchActivity.mImgRefresh = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.img_refresh, "field 'mImgRefresh'", ImageView.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131296772, "method 'onViewClicked'");
        this.f10401d = findRequiredView3;
        findRequiredView3.setOnClickListener(new C5024c(this, bleMiBandSearchActivity));
    }

    @CallSuper
    public void unbind() {
        BleMiBandSearchActivity bleMiBandSearchActivity = this.f10398a;
        if (bleMiBandSearchActivity != null) {
            this.f10398a = null;
            bleMiBandSearchActivity.mTvCancel = null;
            bleMiBandSearchActivity.mCircleBarView = null;
            bleMiBandSearchActivity.mLlSearch = null;
            bleMiBandSearchActivity.mLlConnect = null;
            bleMiBandSearchActivity.mLLConnectStatus = null;
            bleMiBandSearchActivity.mTvConnectStatus = null;
            bleMiBandSearchActivity.mImgConnectStatus = null;
            bleMiBandSearchActivity.mImgRefresh = null;
            this.f10399b.setOnClickListener((View.OnClickListener) null);
            this.f10399b = null;
            this.f10400c.setOnClickListener((View.OnClickListener) null);
            this.f10400c = null;
            this.f10401d.setOnClickListener((View.OnClickListener) null);
            this.f10401d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

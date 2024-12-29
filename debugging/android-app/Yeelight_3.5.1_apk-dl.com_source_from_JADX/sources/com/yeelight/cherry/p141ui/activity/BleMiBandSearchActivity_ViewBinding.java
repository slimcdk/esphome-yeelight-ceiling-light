package com.yeelight.cherry.p141ui.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.yeelib.p142ui.view.CircleBarView;

/* renamed from: com.yeelight.cherry.ui.activity.BleMiBandSearchActivity_ViewBinding */
public class BleMiBandSearchActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BleMiBandSearchActivity f9943a;

    /* renamed from: b */
    private View f9944b;

    /* renamed from: c */
    private View f9945c;

    /* renamed from: d */
    private View f9946d;

    /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandSearchActivity_ViewBinding$a */
    class C5067a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ BleMiBandSearchActivity f9947a;

        C5067a(BleMiBandSearchActivity_ViewBinding bleMiBandSearchActivity_ViewBinding, BleMiBandSearchActivity bleMiBandSearchActivity) {
            this.f9947a = bleMiBandSearchActivity;
        }

        public void doClick(View view) {
            this.f9947a.onViewClicked(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandSearchActivity_ViewBinding$b */
    class C5068b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ BleMiBandSearchActivity f9948a;

        C5068b(BleMiBandSearchActivity_ViewBinding bleMiBandSearchActivity_ViewBinding, BleMiBandSearchActivity bleMiBandSearchActivity) {
            this.f9948a = bleMiBandSearchActivity;
        }

        public void doClick(View view) {
            this.f9948a.onViewClicked(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BleMiBandSearchActivity_ViewBinding$c */
    class C5069c extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ BleMiBandSearchActivity f9949a;

        C5069c(BleMiBandSearchActivity_ViewBinding bleMiBandSearchActivity_ViewBinding, BleMiBandSearchActivity bleMiBandSearchActivity) {
            this.f9949a = bleMiBandSearchActivity;
        }

        public void doClick(View view) {
            this.f9949a.onViewClicked(view);
        }
    }

    @UiThread
    public BleMiBandSearchActivity_ViewBinding(BleMiBandSearchActivity bleMiBandSearchActivity, View view) {
        this.f9943a = bleMiBandSearchActivity;
        View findRequiredView = Utils.findRequiredView(view, C12225R$id.tv_cancel, "field 'mTvCancel' and method 'onViewClicked'");
        bleMiBandSearchActivity.mTvCancel = (TextView) Utils.castView(findRequiredView, C12225R$id.tv_cancel, "field 'mTvCancel'", TextView.class);
        this.f9944b = findRequiredView;
        findRequiredView.setOnClickListener(new C5067a(this, bleMiBandSearchActivity));
        bleMiBandSearchActivity.mCircleBarView = (CircleBarView) Utils.findRequiredViewAsType(view, C12225R$id.circleBarView, "field 'mCircleBarView'", CircleBarView.class);
        bleMiBandSearchActivity.mLlSearch = (LinearLayout) Utils.findRequiredViewAsType(view, C12225R$id.ll_search, "field 'mLlSearch'", LinearLayout.class);
        bleMiBandSearchActivity.mLlConnect = (LinearLayout) Utils.findRequiredViewAsType(view, C12225R$id.ll_connect, "field 'mLlConnect'", LinearLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, C12225R$id.ll_connect_status, "field 'mLLConnectStatus' and method 'onViewClicked'");
        bleMiBandSearchActivity.mLLConnectStatus = (LinearLayout) Utils.castView(findRequiredView2, C12225R$id.ll_connect_status, "field 'mLLConnectStatus'", LinearLayout.class);
        this.f9945c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C5068b(this, bleMiBandSearchActivity));
        bleMiBandSearchActivity.mTvConnectStatus = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.tv_connect_status, "field 'mTvConnectStatus'", TextView.class);
        bleMiBandSearchActivity.mImgConnectStatus = (ImageView) Utils.findRequiredViewAsType(view, C12225R$id.img_connect_status, "field 'mImgConnectStatus'", ImageView.class);
        bleMiBandSearchActivity.mImgRefresh = (ImageView) Utils.findRequiredViewAsType(view, C12225R$id.img_refresh, "field 'mImgRefresh'", ImageView.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131296876, "method 'onViewClicked'");
        this.f9946d = findRequiredView3;
        findRequiredView3.setOnClickListener(new C5069c(this, bleMiBandSearchActivity));
    }

    @CallSuper
    public void unbind() {
        BleMiBandSearchActivity bleMiBandSearchActivity = this.f9943a;
        if (bleMiBandSearchActivity != null) {
            this.f9943a = null;
            bleMiBandSearchActivity.mTvCancel = null;
            bleMiBandSearchActivity.mCircleBarView = null;
            bleMiBandSearchActivity.mLlSearch = null;
            bleMiBandSearchActivity.mLlConnect = null;
            bleMiBandSearchActivity.mLLConnectStatus = null;
            bleMiBandSearchActivity.mTvConnectStatus = null;
            bleMiBandSearchActivity.mImgConnectStatus = null;
            bleMiBandSearchActivity.mImgRefresh = null;
            this.f9944b.setOnClickListener((View.OnClickListener) null);
            this.f9944b = null;
            this.f9945c.setOnClickListener((View.OnClickListener) null);
            this.f9945c = null;
            this.f9946d.setOnClickListener((View.OnClickListener) null);
            this.f9946d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

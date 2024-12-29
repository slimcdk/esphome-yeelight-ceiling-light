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

/* renamed from: com.yeelight.cherry.ui.activity.MiBandSearchActivity_ViewBinding */
public class MiBandSearchActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MiBandSearchActivity f10927a;

    /* renamed from: b */
    private View f10928b;

    /* renamed from: c */
    private View f10929c;

    /* renamed from: d */
    private View f10930d;

    /* renamed from: com.yeelight.cherry.ui.activity.MiBandSearchActivity_ViewBinding$a */
    class C5486a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ MiBandSearchActivity f10931a;

        C5486a(MiBandSearchActivity_ViewBinding miBandSearchActivity_ViewBinding, MiBandSearchActivity miBandSearchActivity) {
            this.f10931a = miBandSearchActivity;
        }

        public void doClick(View view) {
            this.f10931a.onViewClicked(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MiBandSearchActivity_ViewBinding$b */
    class C5487b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ MiBandSearchActivity f10932a;

        C5487b(MiBandSearchActivity_ViewBinding miBandSearchActivity_ViewBinding, MiBandSearchActivity miBandSearchActivity) {
            this.f10932a = miBandSearchActivity;
        }

        public void doClick(View view) {
            this.f10932a.onViewClicked(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MiBandSearchActivity_ViewBinding$c */
    class C5488c extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ MiBandSearchActivity f10933a;

        C5488c(MiBandSearchActivity_ViewBinding miBandSearchActivity_ViewBinding, MiBandSearchActivity miBandSearchActivity) {
            this.f10933a = miBandSearchActivity;
        }

        public void doClick(View view) {
            this.f10933a.onViewClicked(view);
        }
    }

    @UiThread
    public MiBandSearchActivity_ViewBinding(MiBandSearchActivity miBandSearchActivity, View view) {
        this.f10927a = miBandSearchActivity;
        View findRequiredView = Utils.findRequiredView(view, C12225R$id.tv_cancel, "field 'mTvCancel' and method 'onViewClicked'");
        miBandSearchActivity.mTvCancel = (TextView) Utils.castView(findRequiredView, C12225R$id.tv_cancel, "field 'mTvCancel'", TextView.class);
        this.f10928b = findRequiredView;
        findRequiredView.setOnClickListener(new C5486a(this, miBandSearchActivity));
        miBandSearchActivity.mCircleBarView = (CircleBarView) Utils.findRequiredViewAsType(view, C12225R$id.circleBarView, "field 'mCircleBarView'", CircleBarView.class);
        miBandSearchActivity.mLlSearch = (LinearLayout) Utils.findRequiredViewAsType(view, C12225R$id.ll_search, "field 'mLlSearch'", LinearLayout.class);
        miBandSearchActivity.mLlConnect = (LinearLayout) Utils.findRequiredViewAsType(view, C12225R$id.ll_connect, "field 'mLlConnect'", LinearLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, C12225R$id.ll_connect_status, "field 'mLLConnectStatus' and method 'onViewClicked'");
        miBandSearchActivity.mLLConnectStatus = (LinearLayout) Utils.castView(findRequiredView2, C12225R$id.ll_connect_status, "field 'mLLConnectStatus'", LinearLayout.class);
        this.f10929c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C5487b(this, miBandSearchActivity));
        miBandSearchActivity.mTvConnectStatus = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.tv_connect_status, "field 'mTvConnectStatus'", TextView.class);
        miBandSearchActivity.mImgConnectStatus = (ImageView) Utils.findRequiredViewAsType(view, C12225R$id.img_connect_status, "field 'mImgConnectStatus'", ImageView.class);
        miBandSearchActivity.mImgRefresh = (ImageView) Utils.findRequiredViewAsType(view, C12225R$id.img_refresh, "field 'mImgRefresh'", ImageView.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131296876, "method 'onViewClicked'");
        this.f10930d = findRequiredView3;
        findRequiredView3.setOnClickListener(new C5488c(this, miBandSearchActivity));
    }

    @CallSuper
    public void unbind() {
        MiBandSearchActivity miBandSearchActivity = this.f10927a;
        if (miBandSearchActivity != null) {
            this.f10927a = null;
            miBandSearchActivity.mTvCancel = null;
            miBandSearchActivity.mCircleBarView = null;
            miBandSearchActivity.mLlSearch = null;
            miBandSearchActivity.mLlConnect = null;
            miBandSearchActivity.mLLConnectStatus = null;
            miBandSearchActivity.mTvConnectStatus = null;
            miBandSearchActivity.mImgConnectStatus = null;
            miBandSearchActivity.mImgRefresh = null;
            this.f10928b.setOnClickListener((View.OnClickListener) null);
            this.f10928b = null;
            this.f10929c.setOnClickListener((View.OnClickListener) null);
            this.f10929c = null;
            this.f10930d.setOnClickListener((View.OnClickListener) null);
            this.f10930d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

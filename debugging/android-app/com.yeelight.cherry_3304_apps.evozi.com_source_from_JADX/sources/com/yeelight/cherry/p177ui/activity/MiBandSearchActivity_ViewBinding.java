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

/* renamed from: com.yeelight.cherry.ui.activity.MiBandSearchActivity_ViewBinding */
public class MiBandSearchActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MiBandSearchActivity f11356a;

    /* renamed from: b */
    private View f11357b;

    /* renamed from: c */
    private View f11358c;

    /* renamed from: d */
    private View f11359d;

    /* renamed from: com.yeelight.cherry.ui.activity.MiBandSearchActivity_ViewBinding$a */
    class C5439a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ MiBandSearchActivity f11360a;

        C5439a(MiBandSearchActivity_ViewBinding miBandSearchActivity_ViewBinding, MiBandSearchActivity miBandSearchActivity) {
            this.f11360a = miBandSearchActivity;
        }

        public void doClick(View view) {
            this.f11360a.onViewClicked(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MiBandSearchActivity_ViewBinding$b */
    class C5440b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ MiBandSearchActivity f11361a;

        C5440b(MiBandSearchActivity_ViewBinding miBandSearchActivity_ViewBinding, MiBandSearchActivity miBandSearchActivity) {
            this.f11361a = miBandSearchActivity;
        }

        public void doClick(View view) {
            this.f11361a.onViewClicked(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MiBandSearchActivity_ViewBinding$c */
    class C5441c extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ MiBandSearchActivity f11362a;

        C5441c(MiBandSearchActivity_ViewBinding miBandSearchActivity_ViewBinding, MiBandSearchActivity miBandSearchActivity) {
            this.f11362a = miBandSearchActivity;
        }

        public void doClick(View view) {
            this.f11362a.onViewClicked(view);
        }
    }

    @UiThread
    public MiBandSearchActivity_ViewBinding(MiBandSearchActivity miBandSearchActivity, View view) {
        this.f11356a = miBandSearchActivity;
        View findRequiredView = Utils.findRequiredView(view, C11745R$id.tv_cancel, "field 'mTvCancel' and method 'onViewClicked'");
        miBandSearchActivity.mTvCancel = (TextView) Utils.castView(findRequiredView, C11745R$id.tv_cancel, "field 'mTvCancel'", TextView.class);
        this.f11357b = findRequiredView;
        findRequiredView.setOnClickListener(new C5439a(this, miBandSearchActivity));
        miBandSearchActivity.mCircleBarView = (CircleBarView) Utils.findRequiredViewAsType(view, C11745R$id.circleBarView, "field 'mCircleBarView'", CircleBarView.class);
        miBandSearchActivity.mLlSearch = (LinearLayout) Utils.findRequiredViewAsType(view, C11745R$id.ll_search, "field 'mLlSearch'", LinearLayout.class);
        miBandSearchActivity.mLlConnect = (LinearLayout) Utils.findRequiredViewAsType(view, C11745R$id.ll_connect, "field 'mLlConnect'", LinearLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, C11745R$id.ll_connect_status, "field 'mLLConnectStatus' and method 'onViewClicked'");
        miBandSearchActivity.mLLConnectStatus = (LinearLayout) Utils.castView(findRequiredView2, C11745R$id.ll_connect_status, "field 'mLLConnectStatus'", LinearLayout.class);
        this.f11358c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C5440b(this, miBandSearchActivity));
        miBandSearchActivity.mTvConnectStatus = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.tv_connect_status, "field 'mTvConnectStatus'", TextView.class);
        miBandSearchActivity.mImgConnectStatus = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.img_connect_status, "field 'mImgConnectStatus'", ImageView.class);
        miBandSearchActivity.mImgRefresh = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.img_refresh, "field 'mImgRefresh'", ImageView.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131296772, "method 'onViewClicked'");
        this.f11359d = findRequiredView3;
        findRequiredView3.setOnClickListener(new C5441c(this, miBandSearchActivity));
    }

    @CallSuper
    public void unbind() {
        MiBandSearchActivity miBandSearchActivity = this.f11356a;
        if (miBandSearchActivity != null) {
            this.f11356a = null;
            miBandSearchActivity.mTvCancel = null;
            miBandSearchActivity.mCircleBarView = null;
            miBandSearchActivity.mLlSearch = null;
            miBandSearchActivity.mLlConnect = null;
            miBandSearchActivity.mLLConnectStatus = null;
            miBandSearchActivity.mTvConnectStatus = null;
            miBandSearchActivity.mImgConnectStatus = null;
            miBandSearchActivity.mImgRefresh = null;
            this.f11357b.setOnClickListener((View.OnClickListener) null);
            this.f11357b = null;
            this.f11358c.setOnClickListener((View.OnClickListener) null);
            this.f11358c = null;
            this.f11359d.setOnClickListener((View.OnClickListener) null);
            this.f11359d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

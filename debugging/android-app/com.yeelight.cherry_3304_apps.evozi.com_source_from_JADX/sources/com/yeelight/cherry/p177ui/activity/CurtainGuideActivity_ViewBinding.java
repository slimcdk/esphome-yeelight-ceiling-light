package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.yeelight.cherry.C11745R$id;

/* renamed from: com.yeelight.cherry.ui.activity.CurtainGuideActivity_ViewBinding */
public class CurtainGuideActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CurtainGuideActivity f10676a;

    /* renamed from: b */
    private View f10677b;

    /* renamed from: c */
    private View f10678c;

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainGuideActivity_ViewBinding$a */
    class C5149a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CurtainGuideActivity f10679a;

        C5149a(CurtainGuideActivity_ViewBinding curtainGuideActivity_ViewBinding, CurtainGuideActivity curtainGuideActivity) {
            this.f10679a = curtainGuideActivity;
        }

        public void doClick(View view) {
            this.f10679a.onViewClick(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainGuideActivity_ViewBinding$b */
    class C5150b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CurtainGuideActivity f10680a;

        C5150b(CurtainGuideActivity_ViewBinding curtainGuideActivity_ViewBinding, CurtainGuideActivity curtainGuideActivity) {
            this.f10680a = curtainGuideActivity;
        }

        public void doClick(View view) {
            this.f10680a.onViewClick(view);
        }
    }

    @UiThread
    public CurtainGuideActivity_ViewBinding(CurtainGuideActivity curtainGuideActivity, View view) {
        this.f10676a = curtainGuideActivity;
        curtainGuideActivity.mTvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131297510, "field 'mTvTitle'", TextView.class);
        curtainGuideActivity.mTvSubTitle = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.tv_sub_title, "field 'mTvSubTitle'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, C11745R$id.btn_start, "field 'mBtnStart' and method 'onViewClick'");
        curtainGuideActivity.mBtnStart = (Button) Utils.castView(findRequiredView, C11745R$id.btn_start, "field 'mBtnStart'", Button.class);
        this.f10677b = findRequiredView;
        findRequiredView.setOnClickListener(new C5149a(this, curtainGuideActivity));
        curtainGuideActivity.mImgHint = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.img_hint, "field 'mImgHint'", ImageView.class);
        curtainGuideActivity.mImgConfigProgress = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.img_config_progress, "field 'mImgConfigProgress'", ImageView.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296772, "method 'onViewClick'");
        this.f10678c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C5150b(this, curtainGuideActivity));
    }

    @CallSuper
    public void unbind() {
        CurtainGuideActivity curtainGuideActivity = this.f10676a;
        if (curtainGuideActivity != null) {
            this.f10676a = null;
            curtainGuideActivity.mTvTitle = null;
            curtainGuideActivity.mTvSubTitle = null;
            curtainGuideActivity.mBtnStart = null;
            curtainGuideActivity.mImgHint = null;
            curtainGuideActivity.mImgConfigProgress = null;
            this.f10677b.setOnClickListener((View.OnClickListener) null);
            this.f10677b = null;
            this.f10678c.setOnClickListener((View.OnClickListener) null);
            this.f10678c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

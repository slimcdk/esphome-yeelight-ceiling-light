package com.yeelight.cherry.p141ui.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.yeelight.cherry.C12225R$id;

/* renamed from: com.yeelight.cherry.ui.activity.CurtainGuideActivity_ViewBinding */
public class CurtainGuideActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CurtainGuideActivity f10231a;

    /* renamed from: b */
    private View f10232b;

    /* renamed from: c */
    private View f10233c;

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainGuideActivity_ViewBinding$a */
    class C5197a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CurtainGuideActivity f10234a;

        C5197a(CurtainGuideActivity_ViewBinding curtainGuideActivity_ViewBinding, CurtainGuideActivity curtainGuideActivity) {
            this.f10234a = curtainGuideActivity;
        }

        public void doClick(View view) {
            this.f10234a.onViewClick(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainGuideActivity_ViewBinding$b */
    class C5198b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CurtainGuideActivity f10235a;

        C5198b(CurtainGuideActivity_ViewBinding curtainGuideActivity_ViewBinding, CurtainGuideActivity curtainGuideActivity) {
            this.f10235a = curtainGuideActivity;
        }

        public void doClick(View view) {
            this.f10235a.onViewClick(view);
        }
    }

    @UiThread
    public CurtainGuideActivity_ViewBinding(CurtainGuideActivity curtainGuideActivity, View view) {
        this.f10231a = curtainGuideActivity;
        curtainGuideActivity.mTvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131297686, "field 'mTvTitle'", TextView.class);
        curtainGuideActivity.mTvSubTitle = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.tv_sub_title, "field 'mTvSubTitle'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, C12225R$id.btn_start, "field 'mBtnStart' and method 'onViewClick'");
        curtainGuideActivity.mBtnStart = (Button) Utils.castView(findRequiredView, C12225R$id.btn_start, "field 'mBtnStart'", Button.class);
        this.f10232b = findRequiredView;
        findRequiredView.setOnClickListener(new C5197a(this, curtainGuideActivity));
        curtainGuideActivity.mImgHint = (ImageView) Utils.findRequiredViewAsType(view, C12225R$id.img_hint, "field 'mImgHint'", ImageView.class);
        curtainGuideActivity.mImgConfigProgress = (ImageView) Utils.findRequiredViewAsType(view, C12225R$id.img_config_progress, "field 'mImgConfigProgress'", ImageView.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296876, "method 'onViewClick'");
        this.f10233c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C5198b(this, curtainGuideActivity));
    }

    @CallSuper
    public void unbind() {
        CurtainGuideActivity curtainGuideActivity = this.f10231a;
        if (curtainGuideActivity != null) {
            this.f10231a = null;
            curtainGuideActivity.mTvTitle = null;
            curtainGuideActivity.mTvSubTitle = null;
            curtainGuideActivity.mBtnStart = null;
            curtainGuideActivity.mImgHint = null;
            curtainGuideActivity.mImgConfigProgress = null;
            this.f10232b.setOnClickListener((View.OnClickListener) null);
            this.f10232b = null;
            this.f10233c.setOnClickListener((View.OnClickListener) null);
            this.f10233c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.p177ui.view.CurtainControlView;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.CurtainControlActivity_ViewBinding */
public class CurtainControlActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CurtainControlActivity f10655a;

    /* renamed from: b */
    private View f10656b;

    /* renamed from: c */
    private View f10657c;

    /* renamed from: d */
    private View f10658d;

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainControlActivity_ViewBinding$a */
    class C5137a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CurtainControlActivity f10659a;

        C5137a(CurtainControlActivity_ViewBinding curtainControlActivity_ViewBinding, CurtainControlActivity curtainControlActivity) {
            this.f10659a = curtainControlActivity;
        }

        public void doClick(View view) {
            this.f10659a.onViewClick(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainControlActivity_ViewBinding$b */
    class C5138b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CurtainControlActivity f10660a;

        C5138b(CurtainControlActivity_ViewBinding curtainControlActivity_ViewBinding, CurtainControlActivity curtainControlActivity) {
            this.f10660a = curtainControlActivity;
        }

        public void doClick(View view) {
            this.f10660a.onViewClick(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainControlActivity_ViewBinding$c */
    class C5139c extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CurtainControlActivity f10661a;

        C5139c(CurtainControlActivity_ViewBinding curtainControlActivity_ViewBinding, CurtainControlActivity curtainControlActivity) {
            this.f10661a = curtainControlActivity;
        }

        public void doClick(View view) {
            this.f10661a.onViewClick(view);
        }
    }

    @UiThread
    public CurtainControlActivity_ViewBinding(CurtainControlActivity curtainControlActivity, View view) {
        this.f10655a = curtainControlActivity;
        curtainControlActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
        curtainControlActivity.mCurtainView = (CurtainControlView) Utils.findRequiredViewAsType(view, C11745R$id.CurtainView, "field 'mCurtainView'", CurtainControlView.class);
        curtainControlActivity.mTvProgress = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.tv_progress, "field 'mTvProgress'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, C11745R$id.img_open, "method 'onViewClick'");
        this.f10656b = findRequiredView;
        findRequiredView.setOnClickListener(new C5137a(this, curtainControlActivity));
        View findRequiredView2 = Utils.findRequiredView(view, C11745R$id.img_pause, "method 'onViewClick'");
        this.f10657c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C5138b(this, curtainControlActivity));
        View findRequiredView3 = Utils.findRequiredView(view, C11745R$id.img_close, "method 'onViewClick'");
        this.f10658d = findRequiredView3;
        findRequiredView3.setOnClickListener(new C5139c(this, curtainControlActivity));
    }

    @CallSuper
    public void unbind() {
        CurtainControlActivity curtainControlActivity = this.f10655a;
        if (curtainControlActivity != null) {
            this.f10655a = null;
            curtainControlActivity.mTitleBar = null;
            curtainControlActivity.mCurtainView = null;
            curtainControlActivity.mTvProgress = null;
            this.f10656b.setOnClickListener((View.OnClickListener) null);
            this.f10656b = null;
            this.f10657c.setOnClickListener((View.OnClickListener) null);
            this.f10657c = null;
            this.f10658d.setOnClickListener((View.OnClickListener) null);
            this.f10658d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

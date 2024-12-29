package com.yeelight.cherry.p141ui.activity;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.p141ui.view.CurtainControlView;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.CurtainControlActivity_ViewBinding */
public class CurtainControlActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CurtainControlActivity f10209a;

    /* renamed from: b */
    private View f10210b;

    /* renamed from: c */
    private View f10211c;

    /* renamed from: d */
    private View f10212d;

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainControlActivity_ViewBinding$a */
    class C5185a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CurtainControlActivity f10213a;

        C5185a(CurtainControlActivity_ViewBinding curtainControlActivity_ViewBinding, CurtainControlActivity curtainControlActivity) {
            this.f10213a = curtainControlActivity;
        }

        public void doClick(View view) {
            this.f10213a.onViewClick(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainControlActivity_ViewBinding$b */
    class C5186b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CurtainControlActivity f10214a;

        C5186b(CurtainControlActivity_ViewBinding curtainControlActivity_ViewBinding, CurtainControlActivity curtainControlActivity) {
            this.f10214a = curtainControlActivity;
        }

        public void doClick(View view) {
            this.f10214a.onViewClick(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainControlActivity_ViewBinding$c */
    class C5187c extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CurtainControlActivity f10215a;

        C5187c(CurtainControlActivity_ViewBinding curtainControlActivity_ViewBinding, CurtainControlActivity curtainControlActivity) {
            this.f10215a = curtainControlActivity;
        }

        public void doClick(View view) {
            this.f10215a.onViewClick(view);
        }
    }

    @UiThread
    public CurtainControlActivity_ViewBinding(CurtainControlActivity curtainControlActivity, View view) {
        this.f10209a = curtainControlActivity;
        curtainControlActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297591, "field 'mTitleBar'", CommonTitleBar.class);
        curtainControlActivity.mCurtainView = (CurtainControlView) Utils.findRequiredViewAsType(view, C12225R$id.CurtainView, "field 'mCurtainView'", CurtainControlView.class);
        curtainControlActivity.mTvProgress = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.tv_progress, "field 'mTvProgress'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, C12225R$id.img_open, "method 'onViewClick'");
        this.f10210b = findRequiredView;
        findRequiredView.setOnClickListener(new C5185a(this, curtainControlActivity));
        View findRequiredView2 = Utils.findRequiredView(view, C12225R$id.img_pause, "method 'onViewClick'");
        this.f10211c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C5186b(this, curtainControlActivity));
        View findRequiredView3 = Utils.findRequiredView(view, C12225R$id.img_close, "method 'onViewClick'");
        this.f10212d = findRequiredView3;
        findRequiredView3.setOnClickListener(new C5187c(this, curtainControlActivity));
    }

    @CallSuper
    public void unbind() {
        CurtainControlActivity curtainControlActivity = this.f10209a;
        if (curtainControlActivity != null) {
            this.f10209a = null;
            curtainControlActivity.mTitleBar = null;
            curtainControlActivity.mCurtainView = null;
            curtainControlActivity.mTvProgress = null;
            this.f10210b.setOnClickListener((View.OnClickListener) null);
            this.f10210b = null;
            this.f10211c.setOnClickListener((View.OnClickListener) null);
            this.f10211c = null;
            this.f10212d.setOnClickListener((View.OnClickListener) null);
            this.f10212d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

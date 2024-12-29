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

/* renamed from: com.yeelight.cherry.ui.activity.CurtainModeActivity_ViewBinding */
public class CurtainModeActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CurtainModeActivity f10683a;

    /* renamed from: b */
    private View f10684b;

    /* renamed from: c */
    private View f10685c;

    /* renamed from: d */
    private View f10686d;

    /* renamed from: e */
    private View f10687e;

    /* renamed from: f */
    private View f10688f;

    /* renamed from: g */
    private View f10689g;

    /* renamed from: h */
    private View f10690h;

    /* renamed from: i */
    private View f10691i;

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainModeActivity_ViewBinding$a */
    class C5151a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CurtainModeActivity f10692a;

        C5151a(CurtainModeActivity_ViewBinding curtainModeActivity_ViewBinding, CurtainModeActivity curtainModeActivity) {
            this.f10692a = curtainModeActivity;
        }

        public void doClick(View view) {
            this.f10692a.onViewClick(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainModeActivity_ViewBinding$b */
    class C5152b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CurtainModeActivity f10693a;

        C5152b(CurtainModeActivity_ViewBinding curtainModeActivity_ViewBinding, CurtainModeActivity curtainModeActivity) {
            this.f10693a = curtainModeActivity;
        }

        public void doClick(View view) {
            this.f10693a.onViewClick(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainModeActivity_ViewBinding$c */
    class C5153c extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CurtainModeActivity f10694a;

        C5153c(CurtainModeActivity_ViewBinding curtainModeActivity_ViewBinding, CurtainModeActivity curtainModeActivity) {
            this.f10694a = curtainModeActivity;
        }

        public void doClick(View view) {
            this.f10694a.onViewClick(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainModeActivity_ViewBinding$d */
    class C5154d extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CurtainModeActivity f10695a;

        C5154d(CurtainModeActivity_ViewBinding curtainModeActivity_ViewBinding, CurtainModeActivity curtainModeActivity) {
            this.f10695a = curtainModeActivity;
        }

        public void doClick(View view) {
            this.f10695a.onViewClick(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainModeActivity_ViewBinding$e */
    class C5155e extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CurtainModeActivity f10696a;

        C5155e(CurtainModeActivity_ViewBinding curtainModeActivity_ViewBinding, CurtainModeActivity curtainModeActivity) {
            this.f10696a = curtainModeActivity;
        }

        public void doClick(View view) {
            this.f10696a.onViewClick(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainModeActivity_ViewBinding$f */
    class C5156f extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CurtainModeActivity f10697a;

        C5156f(CurtainModeActivity_ViewBinding curtainModeActivity_ViewBinding, CurtainModeActivity curtainModeActivity) {
            this.f10697a = curtainModeActivity;
        }

        public void doClick(View view) {
            this.f10697a.onViewClick(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainModeActivity_ViewBinding$g */
    class C5157g extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CurtainModeActivity f10698a;

        C5157g(CurtainModeActivity_ViewBinding curtainModeActivity_ViewBinding, CurtainModeActivity curtainModeActivity) {
            this.f10698a = curtainModeActivity;
        }

        public void doClick(View view) {
            this.f10698a.onViewClick(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainModeActivity_ViewBinding$h */
    class C5158h extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CurtainModeActivity f10699a;

        C5158h(CurtainModeActivity_ViewBinding curtainModeActivity_ViewBinding, CurtainModeActivity curtainModeActivity) {
            this.f10699a = curtainModeActivity;
        }

        public void doClick(View view) {
            this.f10699a.onViewClick(view);
        }
    }

    @UiThread
    public CurtainModeActivity_ViewBinding(CurtainModeActivity curtainModeActivity, View view) {
        this.f10683a = curtainModeActivity;
        View findRequiredView = Utils.findRequiredView(view, C11745R$id.img_double, "field 'mImgDouble' and method 'onViewClick'");
        curtainModeActivity.mImgDouble = (ImageView) Utils.castView(findRequiredView, C11745R$id.img_double, "field 'mImgDouble'", ImageView.class);
        this.f10684b = findRequiredView;
        findRequiredView.setOnClickListener(new C5151a(this, curtainModeActivity));
        View findRequiredView2 = Utils.findRequiredView(view, C11745R$id.tv_double, "field 'mTvDouble' and method 'onViewClick'");
        curtainModeActivity.mTvDouble = (TextView) Utils.castView(findRequiredView2, C11745R$id.tv_double, "field 'mTvDouble'", TextView.class);
        this.f10685c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C5152b(this, curtainModeActivity));
        View findRequiredView3 = Utils.findRequiredView(view, C11745R$id.img_left, "field 'mImgLeft' and method 'onViewClick'");
        curtainModeActivity.mImgLeft = (ImageView) Utils.castView(findRequiredView3, C11745R$id.img_left, "field 'mImgLeft'", ImageView.class);
        this.f10686d = findRequiredView3;
        findRequiredView3.setOnClickListener(new C5153c(this, curtainModeActivity));
        View findRequiredView4 = Utils.findRequiredView(view, C11745R$id.tv_left, "field 'mTvLeft' and method 'onViewClick'");
        curtainModeActivity.mTvLeft = (TextView) Utils.castView(findRequiredView4, C11745R$id.tv_left, "field 'mTvLeft'", TextView.class);
        this.f10687e = findRequiredView4;
        findRequiredView4.setOnClickListener(new C5154d(this, curtainModeActivity));
        View findRequiredView5 = Utils.findRequiredView(view, C11745R$id.img_right, "field 'mImgRight' and method 'onViewClick'");
        curtainModeActivity.mImgRight = (ImageView) Utils.castView(findRequiredView5, C11745R$id.img_right, "field 'mImgRight'", ImageView.class);
        this.f10688f = findRequiredView5;
        findRequiredView5.setOnClickListener(new C5155e(this, curtainModeActivity));
        View findRequiredView6 = Utils.findRequiredView(view, C11745R$id.tv_right, "field 'mTvRight' and method 'onViewClick'");
        curtainModeActivity.mTvRight = (TextView) Utils.castView(findRequiredView6, C11745R$id.tv_right, "field 'mTvRight'", TextView.class);
        this.f10689g = findRequiredView6;
        findRequiredView6.setOnClickListener(new C5156f(this, curtainModeActivity));
        View findRequiredView7 = Utils.findRequiredView(view, C11745R$id.btn_done, "field 'mBtnDone' and method 'onViewClick'");
        curtainModeActivity.mBtnDone = (Button) Utils.castView(findRequiredView7, C11745R$id.btn_done, "field 'mBtnDone'", Button.class);
        this.f10690h = findRequiredView7;
        findRequiredView7.setOnClickListener(new C5157g(this, curtainModeActivity));
        View findRequiredView8 = Utils.findRequiredView(view, 2131296772, "method 'onViewClick'");
        this.f10691i = findRequiredView8;
        findRequiredView8.setOnClickListener(new C5158h(this, curtainModeActivity));
    }

    @CallSuper
    public void unbind() {
        CurtainModeActivity curtainModeActivity = this.f10683a;
        if (curtainModeActivity != null) {
            this.f10683a = null;
            curtainModeActivity.mImgDouble = null;
            curtainModeActivity.mTvDouble = null;
            curtainModeActivity.mImgLeft = null;
            curtainModeActivity.mTvLeft = null;
            curtainModeActivity.mImgRight = null;
            curtainModeActivity.mTvRight = null;
            curtainModeActivity.mBtnDone = null;
            this.f10684b.setOnClickListener((View.OnClickListener) null);
            this.f10684b = null;
            this.f10685c.setOnClickListener((View.OnClickListener) null);
            this.f10685c = null;
            this.f10686d.setOnClickListener((View.OnClickListener) null);
            this.f10686d = null;
            this.f10687e.setOnClickListener((View.OnClickListener) null);
            this.f10687e = null;
            this.f10688f.setOnClickListener((View.OnClickListener) null);
            this.f10688f = null;
            this.f10689g.setOnClickListener((View.OnClickListener) null);
            this.f10689g = null;
            this.f10690h.setOnClickListener((View.OnClickListener) null);
            this.f10690h = null;
            this.f10691i.setOnClickListener((View.OnClickListener) null);
            this.f10691i = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

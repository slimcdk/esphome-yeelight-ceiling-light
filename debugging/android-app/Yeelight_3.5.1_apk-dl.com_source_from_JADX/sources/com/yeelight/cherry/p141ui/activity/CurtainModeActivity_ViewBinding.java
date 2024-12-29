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

/* renamed from: com.yeelight.cherry.ui.activity.CurtainModeActivity_ViewBinding */
public class CurtainModeActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CurtainModeActivity f10239a;

    /* renamed from: b */
    private View f10240b;

    /* renamed from: c */
    private View f10241c;

    /* renamed from: d */
    private View f10242d;

    /* renamed from: e */
    private View f10243e;

    /* renamed from: f */
    private View f10244f;

    /* renamed from: g */
    private View f10245g;

    /* renamed from: h */
    private View f10246h;

    /* renamed from: i */
    private View f10247i;

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainModeActivity_ViewBinding$a */
    class C5199a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CurtainModeActivity f10248a;

        C5199a(CurtainModeActivity_ViewBinding curtainModeActivity_ViewBinding, CurtainModeActivity curtainModeActivity) {
            this.f10248a = curtainModeActivity;
        }

        public void doClick(View view) {
            this.f10248a.onViewClick(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainModeActivity_ViewBinding$b */
    class C5200b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CurtainModeActivity f10249a;

        C5200b(CurtainModeActivity_ViewBinding curtainModeActivity_ViewBinding, CurtainModeActivity curtainModeActivity) {
            this.f10249a = curtainModeActivity;
        }

        public void doClick(View view) {
            this.f10249a.onViewClick(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainModeActivity_ViewBinding$c */
    class C5201c extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CurtainModeActivity f10250a;

        C5201c(CurtainModeActivity_ViewBinding curtainModeActivity_ViewBinding, CurtainModeActivity curtainModeActivity) {
            this.f10250a = curtainModeActivity;
        }

        public void doClick(View view) {
            this.f10250a.onViewClick(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainModeActivity_ViewBinding$d */
    class C5202d extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CurtainModeActivity f10251a;

        C5202d(CurtainModeActivity_ViewBinding curtainModeActivity_ViewBinding, CurtainModeActivity curtainModeActivity) {
            this.f10251a = curtainModeActivity;
        }

        public void doClick(View view) {
            this.f10251a.onViewClick(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainModeActivity_ViewBinding$e */
    class C5203e extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CurtainModeActivity f10252a;

        C5203e(CurtainModeActivity_ViewBinding curtainModeActivity_ViewBinding, CurtainModeActivity curtainModeActivity) {
            this.f10252a = curtainModeActivity;
        }

        public void doClick(View view) {
            this.f10252a.onViewClick(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainModeActivity_ViewBinding$f */
    class C5204f extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CurtainModeActivity f10253a;

        C5204f(CurtainModeActivity_ViewBinding curtainModeActivity_ViewBinding, CurtainModeActivity curtainModeActivity) {
            this.f10253a = curtainModeActivity;
        }

        public void doClick(View view) {
            this.f10253a.onViewClick(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainModeActivity_ViewBinding$g */
    class C5205g extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CurtainModeActivity f10254a;

        C5205g(CurtainModeActivity_ViewBinding curtainModeActivity_ViewBinding, CurtainModeActivity curtainModeActivity) {
            this.f10254a = curtainModeActivity;
        }

        public void doClick(View view) {
            this.f10254a.onViewClick(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainModeActivity_ViewBinding$h */
    class C5206h extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CurtainModeActivity f10255a;

        C5206h(CurtainModeActivity_ViewBinding curtainModeActivity_ViewBinding, CurtainModeActivity curtainModeActivity) {
            this.f10255a = curtainModeActivity;
        }

        public void doClick(View view) {
            this.f10255a.onViewClick(view);
        }
    }

    @UiThread
    public CurtainModeActivity_ViewBinding(CurtainModeActivity curtainModeActivity, View view) {
        this.f10239a = curtainModeActivity;
        View findRequiredView = Utils.findRequiredView(view, C12225R$id.img_double, "field 'mImgDouble' and method 'onViewClick'");
        curtainModeActivity.mImgDouble = (ImageView) Utils.castView(findRequiredView, C12225R$id.img_double, "field 'mImgDouble'", ImageView.class);
        this.f10240b = findRequiredView;
        findRequiredView.setOnClickListener(new C5199a(this, curtainModeActivity));
        View findRequiredView2 = Utils.findRequiredView(view, C12225R$id.tv_double, "field 'mTvDouble' and method 'onViewClick'");
        curtainModeActivity.mTvDouble = (TextView) Utils.castView(findRequiredView2, C12225R$id.tv_double, "field 'mTvDouble'", TextView.class);
        this.f10241c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C5200b(this, curtainModeActivity));
        View findRequiredView3 = Utils.findRequiredView(view, C12225R$id.img_left, "field 'mImgLeft' and method 'onViewClick'");
        curtainModeActivity.mImgLeft = (ImageView) Utils.castView(findRequiredView3, C12225R$id.img_left, "field 'mImgLeft'", ImageView.class);
        this.f10242d = findRequiredView3;
        findRequiredView3.setOnClickListener(new C5201c(this, curtainModeActivity));
        View findRequiredView4 = Utils.findRequiredView(view, C12225R$id.tv_left, "field 'mTvLeft' and method 'onViewClick'");
        curtainModeActivity.mTvLeft = (TextView) Utils.castView(findRequiredView4, C12225R$id.tv_left, "field 'mTvLeft'", TextView.class);
        this.f10243e = findRequiredView4;
        findRequiredView4.setOnClickListener(new C5202d(this, curtainModeActivity));
        View findRequiredView5 = Utils.findRequiredView(view, C12225R$id.img_right, "field 'mImgRight' and method 'onViewClick'");
        curtainModeActivity.mImgRight = (ImageView) Utils.castView(findRequiredView5, C12225R$id.img_right, "field 'mImgRight'", ImageView.class);
        this.f10244f = findRequiredView5;
        findRequiredView5.setOnClickListener(new C5203e(this, curtainModeActivity));
        View findRequiredView6 = Utils.findRequiredView(view, C12225R$id.tv_right, "field 'mTvRight' and method 'onViewClick'");
        curtainModeActivity.mTvRight = (TextView) Utils.castView(findRequiredView6, C12225R$id.tv_right, "field 'mTvRight'", TextView.class);
        this.f10245g = findRequiredView6;
        findRequiredView6.setOnClickListener(new C5204f(this, curtainModeActivity));
        View findRequiredView7 = Utils.findRequiredView(view, C12225R$id.btn_done, "field 'mBtnDone' and method 'onViewClick'");
        curtainModeActivity.mBtnDone = (Button) Utils.castView(findRequiredView7, C12225R$id.btn_done, "field 'mBtnDone'", Button.class);
        this.f10246h = findRequiredView7;
        findRequiredView7.setOnClickListener(new C5205g(this, curtainModeActivity));
        View findRequiredView8 = Utils.findRequiredView(view, 2131296876, "method 'onViewClick'");
        this.f10247i = findRequiredView8;
        findRequiredView8.setOnClickListener(new C5206h(this, curtainModeActivity));
    }

    @CallSuper
    public void unbind() {
        CurtainModeActivity curtainModeActivity = this.f10239a;
        if (curtainModeActivity != null) {
            this.f10239a = null;
            curtainModeActivity.mImgDouble = null;
            curtainModeActivity.mTvDouble = null;
            curtainModeActivity.mImgLeft = null;
            curtainModeActivity.mTvLeft = null;
            curtainModeActivity.mImgRight = null;
            curtainModeActivity.mTvRight = null;
            curtainModeActivity.mBtnDone = null;
            this.f10240b.setOnClickListener((View.OnClickListener) null);
            this.f10240b = null;
            this.f10241c.setOnClickListener((View.OnClickListener) null);
            this.f10241c = null;
            this.f10242d.setOnClickListener((View.OnClickListener) null);
            this.f10242d = null;
            this.f10243e.setOnClickListener((View.OnClickListener) null);
            this.f10243e = null;
            this.f10244f.setOnClickListener((View.OnClickListener) null);
            this.f10244f = null;
            this.f10245g.setOnClickListener((View.OnClickListener) null);
            this.f10245g = null;
            this.f10246h.setOnClickListener((View.OnClickListener) null);
            this.f10246h = null;
            this.f10247i.setOnClickListener((View.OnClickListener) null);
            this.f10247i = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

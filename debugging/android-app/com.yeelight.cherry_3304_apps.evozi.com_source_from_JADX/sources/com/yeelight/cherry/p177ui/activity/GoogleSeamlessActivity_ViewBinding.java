package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.yeelight.cherry.C11745R$id;

/* renamed from: com.yeelight.cherry.ui.activity.GoogleSeamlessActivity_ViewBinding */
public class GoogleSeamlessActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private GoogleSeamlessActivity f10962a;

    /* renamed from: b */
    private View f10963b;

    /* renamed from: c */
    private View f10964c;

    /* renamed from: d */
    private View f10965d;

    /* renamed from: com.yeelight.cherry.ui.activity.GoogleSeamlessActivity_ViewBinding$a */
    class C5276a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ GoogleSeamlessActivity f10966a;

        C5276a(GoogleSeamlessActivity_ViewBinding googleSeamlessActivity_ViewBinding, GoogleSeamlessActivity googleSeamlessActivity) {
            this.f10966a = googleSeamlessActivity;
        }

        public void doClick(View view) {
            this.f10966a.onViewClick(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GoogleSeamlessActivity_ViewBinding$b */
    class C5277b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ GoogleSeamlessActivity f10967a;

        C5277b(GoogleSeamlessActivity_ViewBinding googleSeamlessActivity_ViewBinding, GoogleSeamlessActivity googleSeamlessActivity) {
            this.f10967a = googleSeamlessActivity;
        }

        public void doClick(View view) {
            this.f10967a.onViewClick(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GoogleSeamlessActivity_ViewBinding$c */
    class C5278c extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ GoogleSeamlessActivity f10968a;

        C5278c(GoogleSeamlessActivity_ViewBinding googleSeamlessActivity_ViewBinding, GoogleSeamlessActivity googleSeamlessActivity) {
            this.f10968a = googleSeamlessActivity;
        }

        public void doClick(View view) {
            this.f10968a.onViewClick(view);
        }
    }

    @UiThread
    public GoogleSeamlessActivity_ViewBinding(GoogleSeamlessActivity googleSeamlessActivity, View view) {
        this.f10962a = googleSeamlessActivity;
        View findRequiredView = Utils.findRequiredView(view, C11745R$id.tv_google_setup, "field 'mTvGoogleSetup' and method 'onViewClick'");
        googleSeamlessActivity.mTvGoogleSetup = (TextView) Utils.castView(findRequiredView, C11745R$id.tv_google_setup, "field 'mTvGoogleSetup'", TextView.class);
        this.f10963b = findRequiredView;
        findRequiredView.setOnClickListener(new C5276a(this, googleSeamlessActivity));
        View findRequiredView2 = Utils.findRequiredView(view, C11745R$id.img_back, "method 'onViewClick'");
        this.f10964c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C5277b(this, googleSeamlessActivity));
        View findRequiredView3 = Utils.findRequiredView(view, C11745R$id.btn_open_google_home, "method 'onViewClick'");
        this.f10965d = findRequiredView3;
        findRequiredView3.setOnClickListener(new C5278c(this, googleSeamlessActivity));
    }

    @CallSuper
    public void unbind() {
        GoogleSeamlessActivity googleSeamlessActivity = this.f10962a;
        if (googleSeamlessActivity != null) {
            this.f10962a = null;
            googleSeamlessActivity.mTvGoogleSetup = null;
            this.f10963b.setOnClickListener((View.OnClickListener) null);
            this.f10963b = null;
            this.f10964c.setOnClickListener((View.OnClickListener) null);
            this.f10964c = null;
            this.f10965d.setOnClickListener((View.OnClickListener) null);
            this.f10965d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

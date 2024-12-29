package com.yeelight.cherry.p141ui.activity;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.yeelight.cherry.C12225R$id;

/* renamed from: com.yeelight.cherry.ui.activity.GoogleSeamlessActivity_ViewBinding */
public class GoogleSeamlessActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private GoogleSeamlessActivity f10527a;

    /* renamed from: b */
    private View f10528b;

    /* renamed from: c */
    private View f10529c;

    /* renamed from: d */
    private View f10530d;

    /* renamed from: com.yeelight.cherry.ui.activity.GoogleSeamlessActivity_ViewBinding$a */
    class C5324a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ GoogleSeamlessActivity f10531a;

        C5324a(GoogleSeamlessActivity_ViewBinding googleSeamlessActivity_ViewBinding, GoogleSeamlessActivity googleSeamlessActivity) {
            this.f10531a = googleSeamlessActivity;
        }

        public void doClick(View view) {
            this.f10531a.onViewClick(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GoogleSeamlessActivity_ViewBinding$b */
    class C5325b extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ GoogleSeamlessActivity f10532a;

        C5325b(GoogleSeamlessActivity_ViewBinding googleSeamlessActivity_ViewBinding, GoogleSeamlessActivity googleSeamlessActivity) {
            this.f10532a = googleSeamlessActivity;
        }

        public void doClick(View view) {
            this.f10532a.onViewClick(view);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GoogleSeamlessActivity_ViewBinding$c */
    class C5326c extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ GoogleSeamlessActivity f10533a;

        C5326c(GoogleSeamlessActivity_ViewBinding googleSeamlessActivity_ViewBinding, GoogleSeamlessActivity googleSeamlessActivity) {
            this.f10533a = googleSeamlessActivity;
        }

        public void doClick(View view) {
            this.f10533a.onViewClick(view);
        }
    }

    @UiThread
    public GoogleSeamlessActivity_ViewBinding(GoogleSeamlessActivity googleSeamlessActivity, View view) {
        this.f10527a = googleSeamlessActivity;
        View findRequiredView = Utils.findRequiredView(view, C12225R$id.tv_google_setup, "field 'mTvGoogleSetup' and method 'onViewClick'");
        googleSeamlessActivity.mTvGoogleSetup = (TextView) Utils.castView(findRequiredView, C12225R$id.tv_google_setup, "field 'mTvGoogleSetup'", TextView.class);
        this.f10528b = findRequiredView;
        findRequiredView.setOnClickListener(new C5324a(this, googleSeamlessActivity));
        View findRequiredView2 = Utils.findRequiredView(view, C12225R$id.img_back, "method 'onViewClick'");
        this.f10529c = findRequiredView2;
        findRequiredView2.setOnClickListener(new C5325b(this, googleSeamlessActivity));
        View findRequiredView3 = Utils.findRequiredView(view, C12225R$id.btn_open_google_home, "method 'onViewClick'");
        this.f10530d = findRequiredView3;
        findRequiredView3.setOnClickListener(new C5326c(this, googleSeamlessActivity));
    }

    @CallSuper
    public void unbind() {
        GoogleSeamlessActivity googleSeamlessActivity = this.f10527a;
        if (googleSeamlessActivity != null) {
            this.f10527a = null;
            googleSeamlessActivity.mTvGoogleSetup = null;
            this.f10528b.setOnClickListener((View.OnClickListener) null);
            this.f10528b = null;
            this.f10529c.setOnClickListener((View.OnClickListener) null);
            this.f10529c = null;
            this.f10530d.setOnClickListener((View.OnClickListener) null);
            this.f10530d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

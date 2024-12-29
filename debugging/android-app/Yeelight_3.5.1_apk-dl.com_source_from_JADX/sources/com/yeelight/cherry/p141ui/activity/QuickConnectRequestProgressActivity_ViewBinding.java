package com.yeelight.cherry.p141ui.activity;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.QuickConnectRequestProgressActivity_ViewBinding */
public class QuickConnectRequestProgressActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private QuickConnectRequestProgressActivity f11216a;

    @UiThread
    public QuickConnectRequestProgressActivity_ViewBinding(QuickConnectRequestProgressActivity quickConnectRequestProgressActivity, View view) {
        this.f11216a = quickConnectRequestProgressActivity;
        quickConnectRequestProgressActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297591, "field 'mTitleBar'", CommonTitleBar.class);
        quickConnectRequestProgressActivity.mTitleView = (TextView) Utils.findRequiredViewAsType(view, 2131297589, "field 'mTitleView'", TextView.class);
        quickConnectRequestProgressActivity.mSubView = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.sub_info, "field 'mSubView'", TextView.class);
    }

    @CallSuper
    public void unbind() {
        QuickConnectRequestProgressActivity quickConnectRequestProgressActivity = this.f11216a;
        if (quickConnectRequestProgressActivity != null) {
            this.f11216a = null;
            quickConnectRequestProgressActivity.mTitleBar = null;
            quickConnectRequestProgressActivity.mTitleView = null;
            quickConnectRequestProgressActivity.mSubView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

package com.yeelight.cherry.p141ui.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.GeneralAboutActivity_ViewBinding */
public class GeneralAboutActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private GeneralAboutActivity f10526a;

    @UiThread
    public GeneralAboutActivity_ViewBinding(GeneralAboutActivity generalAboutActivity, View view) {
        this.f10526a = generalAboutActivity;
        generalAboutActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297591, "field 'mTitleBar'", CommonTitleBar.class);
        generalAboutActivity.mWeibo = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.yeelight_weibo, "field 'mWeibo'", TextView.class);
        generalAboutActivity.mWebsite = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.yeelight_website, "field 'mWebsite'", TextView.class);
        generalAboutActivity.mAppstore = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.yeelight_appstore, "field 'mAppstore'", TextView.class);
        generalAboutActivity.mVersionText = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.about_version, "field 'mVersionText'", TextView.class);
        generalAboutActivity.mLogo = (ImageView) Utils.findRequiredViewAsType(view, C12225R$id.general_setting_yeelight_logo, "field 'mLogo'", ImageView.class);
        generalAboutActivity.mBuildDate = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.application_build_date, "field 'mBuildDate'", TextView.class);
    }

    @CallSuper
    public void unbind() {
        GeneralAboutActivity generalAboutActivity = this.f10526a;
        if (generalAboutActivity != null) {
            this.f10526a = null;
            generalAboutActivity.mTitleBar = null;
            generalAboutActivity.mWeibo = null;
            generalAboutActivity.mWebsite = null;
            generalAboutActivity.mAppstore = null;
            generalAboutActivity.mVersionText = null;
            generalAboutActivity.mLogo = null;
            generalAboutActivity.mBuildDate = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.GeneralAboutActivity_ViewBinding */
public class GeneralAboutActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private GeneralAboutActivity f10961a;

    @UiThread
    public GeneralAboutActivity_ViewBinding(GeneralAboutActivity generalAboutActivity, View view) {
        this.f10961a = generalAboutActivity;
        generalAboutActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
        generalAboutActivity.mWeibo = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.yeelight_weibo, "field 'mWeibo'", TextView.class);
        generalAboutActivity.mWebsite = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.yeelight_website, "field 'mWebsite'", TextView.class);
        generalAboutActivity.mAppstore = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.yeelight_appstore, "field 'mAppstore'", TextView.class);
        generalAboutActivity.mVersionText = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.about_version, "field 'mVersionText'", TextView.class);
        generalAboutActivity.mLogo = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.general_setting_yeelight_logo, "field 'mLogo'", ImageView.class);
        generalAboutActivity.mBuildDate = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.application_build_date, "field 'mBuildDate'", TextView.class);
    }

    @CallSuper
    public void unbind() {
        GeneralAboutActivity generalAboutActivity = this.f10961a;
        if (generalAboutActivity != null) {
            this.f10961a = null;
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

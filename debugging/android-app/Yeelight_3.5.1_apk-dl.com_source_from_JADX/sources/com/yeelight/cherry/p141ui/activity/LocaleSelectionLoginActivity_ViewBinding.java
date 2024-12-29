package com.yeelight.cherry.p141ui.activity;

import android.view.View;
import android.widget.ListView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity_ViewBinding */
public class LocaleSelectionLoginActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private LocaleSelectionLoginActivity f10686a;

    @UiThread
    public LocaleSelectionLoginActivity_ViewBinding(LocaleSelectionLoginActivity localeSelectionLoginActivity, View view) {
        this.f10686a = localeSelectionLoginActivity;
        localeSelectionLoginActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297591, "field 'mTitleBar'", CommonTitleBar.class);
        localeSelectionLoginActivity.mLocaleListView = (ListView) Utils.findRequiredViewAsType(view, 2131297077, "field 'mLocaleListView'", ListView.class);
    }

    @CallSuper
    public void unbind() {
        LocaleSelectionLoginActivity localeSelectionLoginActivity = this.f10686a;
        if (localeSelectionLoginActivity != null) {
            this.f10686a = null;
            localeSelectionLoginActivity.mTitleBar = null;
            localeSelectionLoginActivity.mLocaleListView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

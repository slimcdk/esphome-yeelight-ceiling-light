package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import android.widget.ListView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionLoginActivity_ViewBinding */
public class LocaleSelectionLoginActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private LocaleSelectionLoginActivity f11120a;

    @UiThread
    public LocaleSelectionLoginActivity_ViewBinding(LocaleSelectionLoginActivity localeSelectionLoginActivity, View view) {
        this.f11120a = localeSelectionLoginActivity;
        localeSelectionLoginActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
        localeSelectionLoginActivity.mLocaleListView = (ListView) Utils.findRequiredViewAsType(view, 2131296964, "field 'mLocaleListView'", ListView.class);
    }

    @CallSuper
    public void unbind() {
        LocaleSelectionLoginActivity localeSelectionLoginActivity = this.f11120a;
        if (localeSelectionLoginActivity != null) {
            this.f11120a = null;
            localeSelectionLoginActivity.mTitleBar = null;
            localeSelectionLoginActivity.mLocaleListView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

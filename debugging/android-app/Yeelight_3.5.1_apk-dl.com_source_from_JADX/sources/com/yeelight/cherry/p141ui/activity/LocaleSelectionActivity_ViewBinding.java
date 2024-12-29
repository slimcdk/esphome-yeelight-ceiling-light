package com.yeelight.cherry.p141ui.activity;

import android.view.View;
import android.widget.ListView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity_ViewBinding */
public class LocaleSelectionActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private LocaleSelectionActivity f10652a;

    @UiThread
    public LocaleSelectionActivity_ViewBinding(LocaleSelectionActivity localeSelectionActivity, View view) {
        this.f10652a = localeSelectionActivity;
        localeSelectionActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297591, "field 'mTitleBar'", CommonTitleBar.class);
        localeSelectionActivity.mLocaleListView = (ListView) Utils.findRequiredViewAsType(view, 2131297077, "field 'mLocaleListView'", ListView.class);
    }

    @CallSuper
    public void unbind() {
        LocaleSelectionActivity localeSelectionActivity = this.f10652a;
        if (localeSelectionActivity != null) {
            this.f10652a = null;
            localeSelectionActivity.mTitleBar = null;
            localeSelectionActivity.mLocaleListView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

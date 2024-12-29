package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import android.widget.ListView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.LocaleSelectionActivity_ViewBinding */
public class LocaleSelectionActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private LocaleSelectionActivity f11085a;

    @UiThread
    public LocaleSelectionActivity_ViewBinding(LocaleSelectionActivity localeSelectionActivity, View view) {
        this.f11085a = localeSelectionActivity;
        localeSelectionActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
        localeSelectionActivity.mLocaleListView = (ListView) Utils.findRequiredViewAsType(view, 2131296964, "field 'mLocaleListView'", ListView.class);
    }

    @CallSuper
    public void unbind() {
        LocaleSelectionActivity localeSelectionActivity = this.f11085a;
        if (localeSelectionActivity != null) {
            this.f11085a = null;
            localeSelectionActivity.mTitleBar = null;
            localeSelectionActivity.mLocaleListView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

package com.yeelight.cherry.p141ui.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.FirmwareUpgradeActivity_ViewBinding */
public class FirmwareUpgradeActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FirmwareUpgradeActivity f10510a;

    @UiThread
    public FirmwareUpgradeActivity_ViewBinding(FirmwareUpgradeActivity firmwareUpgradeActivity, View view) {
        this.f10510a = firmwareUpgradeActivity;
        firmwareUpgradeActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297591, "field 'mTitleBar'", CommonTitleBar.class);
        firmwareUpgradeActivity.mNewUpdateLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C12225R$id.layout_new_update, "field 'mNewUpdateLayout'", LinearLayout.class);
        firmwareUpgradeActivity.mNewUpdateCurrentVersion = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.current_version, "field 'mNewUpdateCurrentVersion'", TextView.class);
        firmwareUpgradeActivity.mNewUpdateLatestVersion = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.latest_version, "field 'mNewUpdateLatestVersion'", TextView.class);
        firmwareUpgradeActivity.mNewUpdateReleaseNote = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.release_note, "field 'mNewUpdateReleaseNote'", TextView.class);
        firmwareUpgradeActivity.mBtnUpdate = (Button) Utils.findRequiredViewAsType(view, C12225R$id.btn_update, "field 'mBtnUpdate'", Button.class);
        firmwareUpgradeActivity.mBtnRetry = (Button) Utils.findRequiredViewAsType(view, C12225R$id.btn_retry, "field 'mBtnRetry'", Button.class);
        firmwareUpgradeActivity.mUpdatingLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C12225R$id.firmware_upgrading_layout, "field 'mUpdatingLayout'", LinearLayout.class);
        firmwareUpgradeActivity.mUpdatingHint = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.updating_hint_tx, "field 'mUpdatingHint'", TextView.class);
        firmwareUpgradeActivity.mUpdateFailLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C12225R$id.firmware_upgrade_fail_layout, "field 'mUpdateFailLayout'", LinearLayout.class);
        firmwareUpgradeActivity.mNoupdateLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C12225R$id.layout_no_update, "field 'mNoupdateLayout'", LinearLayout.class);
        firmwareUpgradeActivity.mNoUpdateCurrentVersion = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.no_update_current_version, "field 'mNoUpdateCurrentVersion'", TextView.class);
        firmwareUpgradeActivity.mProgressView = (ImageView) Utils.findRequiredViewAsType(view, C12225R$id.progress_bar_upgrade, "field 'mProgressView'", ImageView.class);
        firmwareUpgradeActivity.mProgress = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.update_progress, "field 'mProgress'", TextView.class);
    }

    @CallSuper
    public void unbind() {
        FirmwareUpgradeActivity firmwareUpgradeActivity = this.f10510a;
        if (firmwareUpgradeActivity != null) {
            this.f10510a = null;
            firmwareUpgradeActivity.mTitleBar = null;
            firmwareUpgradeActivity.mNewUpdateLayout = null;
            firmwareUpgradeActivity.mNewUpdateCurrentVersion = null;
            firmwareUpgradeActivity.mNewUpdateLatestVersion = null;
            firmwareUpgradeActivity.mNewUpdateReleaseNote = null;
            firmwareUpgradeActivity.mBtnUpdate = null;
            firmwareUpgradeActivity.mBtnRetry = null;
            firmwareUpgradeActivity.mUpdatingLayout = null;
            firmwareUpgradeActivity.mUpdatingHint = null;
            firmwareUpgradeActivity.mUpdateFailLayout = null;
            firmwareUpgradeActivity.mNoupdateLayout = null;
            firmwareUpgradeActivity.mNoUpdateCurrentVersion = null;
            firmwareUpgradeActivity.mProgressView = null;
            firmwareUpgradeActivity.mProgress = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

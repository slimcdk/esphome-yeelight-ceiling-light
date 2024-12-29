package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.MeshDeviceFirmwareUpgradeActivity_ViewBinding */
public class MeshDeviceFirmwareUpgradeActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MeshDeviceFirmwareUpgradeActivity f11203a;

    @UiThread
    public MeshDeviceFirmwareUpgradeActivity_ViewBinding(MeshDeviceFirmwareUpgradeActivity meshDeviceFirmwareUpgradeActivity, View view) {
        this.f11203a = meshDeviceFirmwareUpgradeActivity;
        meshDeviceFirmwareUpgradeActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
        meshDeviceFirmwareUpgradeActivity.mNewUpdateLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C11745R$id.layout_new_update, "field 'mNewUpdateLayout'", LinearLayout.class);
        meshDeviceFirmwareUpgradeActivity.mNewUpdateCurrentVersion = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.current_version, "field 'mNewUpdateCurrentVersion'", TextView.class);
        meshDeviceFirmwareUpgradeActivity.mNewUpdateLatestVersion = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.latest_version, "field 'mNewUpdateLatestVersion'", TextView.class);
        meshDeviceFirmwareUpgradeActivity.mNewUpdateReleaseNote = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.release_note, "field 'mNewUpdateReleaseNote'", TextView.class);
        meshDeviceFirmwareUpgradeActivity.mBtnUpdate = (Button) Utils.findRequiredViewAsType(view, C11745R$id.btn_update, "field 'mBtnUpdate'", Button.class);
        meshDeviceFirmwareUpgradeActivity.mBtnRetry = (Button) Utils.findRequiredViewAsType(view, C11745R$id.btn_retry, "field 'mBtnRetry'", Button.class);
        meshDeviceFirmwareUpgradeActivity.mBtnReCheckVersion = (Button) Utils.findRequiredViewAsType(view, C11745R$id.btn_reget, "field 'mBtnReCheckVersion'", Button.class);
        meshDeviceFirmwareUpgradeActivity.mUpdatingLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C11745R$id.firmware_upgrading_layout, "field 'mUpdatingLayout'", LinearLayout.class);
        meshDeviceFirmwareUpgradeActivity.mUpdatingHint = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.updating_hint_tx, "field 'mUpdatingHint'", TextView.class);
        meshDeviceFirmwareUpgradeActivity.mUpdateFailLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C11745R$id.firmware_upgrade_fail_layout, "field 'mUpdateFailLayout'", LinearLayout.class);
        meshDeviceFirmwareUpgradeActivity.mNoupdateLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C11745R$id.layout_no_update, "field 'mNoupdateLayout'", LinearLayout.class);
        meshDeviceFirmwareUpgradeActivity.mNoUpdateCurrentVersion = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.no_update_current_version, "field 'mNoUpdateCurrentVersion'", TextView.class);
        meshDeviceFirmwareUpgradeActivity.mProgressView = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.progress_bar_upgrade, "field 'mProgressView'", ImageView.class);
        meshDeviceFirmwareUpgradeActivity.mProgress = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.update_progress, "field 'mProgress'", TextView.class);
        meshDeviceFirmwareUpgradeActivity.mQueryCurrentFirmwareVersionLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C11745R$id.layout_get_current_firmware_version, "field 'mQueryCurrentFirmwareVersionLayout'", LinearLayout.class);
        meshDeviceFirmwareUpgradeActivity.mCheckVersionFailLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C11745R$id.layout_get_current_firmware_version_fail, "field 'mCheckVersionFailLayout'", LinearLayout.class);
        meshDeviceFirmwareUpgradeActivity.mGetVersionProgress = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.get_current_firmware_progress, "field 'mGetVersionProgress'", ImageView.class);
    }

    @CallSuper
    public void unbind() {
        MeshDeviceFirmwareUpgradeActivity meshDeviceFirmwareUpgradeActivity = this.f11203a;
        if (meshDeviceFirmwareUpgradeActivity != null) {
            this.f11203a = null;
            meshDeviceFirmwareUpgradeActivity.mTitleBar = null;
            meshDeviceFirmwareUpgradeActivity.mNewUpdateLayout = null;
            meshDeviceFirmwareUpgradeActivity.mNewUpdateCurrentVersion = null;
            meshDeviceFirmwareUpgradeActivity.mNewUpdateLatestVersion = null;
            meshDeviceFirmwareUpgradeActivity.mNewUpdateReleaseNote = null;
            meshDeviceFirmwareUpgradeActivity.mBtnUpdate = null;
            meshDeviceFirmwareUpgradeActivity.mBtnRetry = null;
            meshDeviceFirmwareUpgradeActivity.mBtnReCheckVersion = null;
            meshDeviceFirmwareUpgradeActivity.mUpdatingLayout = null;
            meshDeviceFirmwareUpgradeActivity.mUpdatingHint = null;
            meshDeviceFirmwareUpgradeActivity.mUpdateFailLayout = null;
            meshDeviceFirmwareUpgradeActivity.mNoupdateLayout = null;
            meshDeviceFirmwareUpgradeActivity.mNoUpdateCurrentVersion = null;
            meshDeviceFirmwareUpgradeActivity.mProgressView = null;
            meshDeviceFirmwareUpgradeActivity.mProgress = null;
            meshDeviceFirmwareUpgradeActivity.mQueryCurrentFirmwareVersionLayout = null;
            meshDeviceFirmwareUpgradeActivity.mCheckVersionFailLayout = null;
            meshDeviceFirmwareUpgradeActivity.mGetVersionProgress = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import android.widget.CheckedTextView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.yeelib.p194ui.view.BrightnessSeekBarView;
import com.yeelight.yeelib.p194ui.view.FavoriteSceneViewBar;
import com.yeelight.yeelib.p194ui.view.ModeSelectionViewNew;

/* renamed from: com.yeelight.cherry.ui.activity.ComboDeviceControlActivity_ViewBinding */
public class ComboDeviceControlActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ComboDeviceControlActivity f10510a;

    @UiThread
    public ComboDeviceControlActivity_ViewBinding(ComboDeviceControlActivity comboDeviceControlActivity, View view) {
        this.f10510a = comboDeviceControlActivity;
        comboDeviceControlActivity.mImgBack = (ImageView) Utils.findRequiredViewAsType(view, 2131296437, "field 'mImgBack'", ImageView.class);
        comboDeviceControlActivity.mImgMore = (ImageView) Utils.findRequiredViewAsType(view, 2131296438, "field 'mImgMore'", ImageView.class);
        comboDeviceControlActivity.mMainLampText = (CheckedTextView) Utils.findRequiredViewAsType(view, C11745R$id.eos_pro_main_lamp, "field 'mMainLampText'", CheckedTextView.class);
        comboDeviceControlActivity.mMainLampPrompt = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.eos_pro_main_lamp_prompt, "field 'mMainLampPrompt'", TextView.class);
        comboDeviceControlActivity.mAmbientLampText = (CheckedTextView) Utils.findRequiredViewAsType(view, C11745R$id.eos_pro_ambient_lamp, "field 'mAmbientLampText'", CheckedTextView.class);
        comboDeviceControlActivity.mAmbientLampPrompt = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.eos_pro_ambient_lamp_prompt, "field 'mAmbientLampPrompt'", TextView.class);
        comboDeviceControlActivity.mTitleBarRightText = (TextView) Utils.findRequiredViewAsType(view, 2131297414, "field 'mTitleBarRightText'", TextView.class);
        comboDeviceControlActivity.mFunctionGridView = (GridView) Utils.findRequiredViewAsType(view, C11745R$id.function_grid_view, "field 'mFunctionGridView'", GridView.class);
        comboDeviceControlActivity.mMoreLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C11745R$id.control_view_more, "field 'mMoreLayout'", LinearLayout.class);
        comboDeviceControlActivity.mLayoutShadows = (LinearLayout) Utils.findRequiredViewAsType(view, C11745R$id.shadow_view, "field 'mLayoutShadows'", LinearLayout.class);
        comboDeviceControlActivity.mLayoutAnimation = (LinearLayout) Utils.findRequiredViewAsType(view, C11745R$id.layout_animation, "field 'mLayoutAnimation'", LinearLayout.class);
        comboDeviceControlActivity.mLayoutLeft = (LinearLayout) Utils.findRequiredViewAsType(view, 2131296912, "field 'mLayoutLeft'", LinearLayout.class);
        comboDeviceControlActivity.mImageLeft = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.image_left, "field 'mImageLeft'", ImageView.class);
        comboDeviceControlActivity.mLayoutMiddle = (LinearLayout) Utils.findRequiredViewAsType(view, C11745R$id.layout_middle, "field 'mLayoutMiddle'", LinearLayout.class);
        comboDeviceControlActivity.mImageMiddle = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.image_middle, "field 'mImageMiddle'", ImageView.class);
        comboDeviceControlActivity.mLayoutRight = (LinearLayout) Utils.findRequiredViewAsType(view, 2131296921, "field 'mLayoutRight'", LinearLayout.class);
        comboDeviceControlActivity.mImageRight = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.image_right, "field 'mImageRight'", ImageView.class);
        comboDeviceControlActivity.mModeSelection = (ModeSelectionViewNew) Utils.findRequiredViewAsType(view, 2131297017, "field 'mModeSelection'", ModeSelectionViewNew.class);
        comboDeviceControlActivity.mBrightnessSeekBar = (BrightnessSeekBarView) Utils.findRequiredViewAsType(view, 2131296386, "field 'mBrightnessSeekBar'", BrightnessSeekBarView.class);
        comboDeviceControlActivity.mFavoriteSceneViewBar = (FavoriteSceneViewBar) Utils.findRequiredViewAsType(view, C11745R$id.favorite_scene_view_bar, "field 'mFavoriteSceneViewBar'", FavoriteSceneViewBar.class);
        comboDeviceControlActivity.mMainLampLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C11745R$id.main_lamp_layout, "field 'mMainLampLayout'", LinearLayout.class);
        comboDeviceControlActivity.mAmbientLampLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C11745R$id.ambient_lamp_layout, "field 'mAmbientLampLayout'", LinearLayout.class);
    }

    @CallSuper
    public void unbind() {
        ComboDeviceControlActivity comboDeviceControlActivity = this.f10510a;
        if (comboDeviceControlActivity != null) {
            this.f10510a = null;
            comboDeviceControlActivity.mImgBack = null;
            comboDeviceControlActivity.mImgMore = null;
            comboDeviceControlActivity.mMainLampText = null;
            comboDeviceControlActivity.mMainLampPrompt = null;
            comboDeviceControlActivity.mAmbientLampText = null;
            comboDeviceControlActivity.mAmbientLampPrompt = null;
            comboDeviceControlActivity.mTitleBarRightText = null;
            comboDeviceControlActivity.mFunctionGridView = null;
            comboDeviceControlActivity.mMoreLayout = null;
            comboDeviceControlActivity.mLayoutShadows = null;
            comboDeviceControlActivity.mLayoutAnimation = null;
            comboDeviceControlActivity.mLayoutLeft = null;
            comboDeviceControlActivity.mImageLeft = null;
            comboDeviceControlActivity.mLayoutMiddle = null;
            comboDeviceControlActivity.mImageMiddle = null;
            comboDeviceControlActivity.mLayoutRight = null;
            comboDeviceControlActivity.mImageRight = null;
            comboDeviceControlActivity.mModeSelection = null;
            comboDeviceControlActivity.mBrightnessSeekBar = null;
            comboDeviceControlActivity.mFavoriteSceneViewBar = null;
            comboDeviceControlActivity.mMainLampLayout = null;
            comboDeviceControlActivity.mAmbientLampLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
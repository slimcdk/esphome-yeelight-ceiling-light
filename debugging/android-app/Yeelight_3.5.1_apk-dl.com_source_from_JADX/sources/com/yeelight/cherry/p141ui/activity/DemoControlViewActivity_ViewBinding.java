package com.yeelight.cherry.p141ui.activity;

import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.yeelib.p142ui.view.BrightnessSeekBarView;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.p142ui.view.FavoriteSceneViewBar;
import com.yeelight.yeelib.p142ui.view.ModeSelectionViewNew;

/* renamed from: com.yeelight.cherry.ui.activity.DemoControlViewActivity_ViewBinding */
public class DemoControlViewActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DemoControlViewActivity f10319a;

    @UiThread
    public DemoControlViewActivity_ViewBinding(DemoControlViewActivity demoControlViewActivity, View view) {
        this.f10319a = demoControlViewActivity;
        demoControlViewActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297591, "field 'mTitleBar'", CommonTitleBar.class);
        demoControlViewActivity.mFunctionGridView = (GridView) Utils.findRequiredViewAsType(view, C12225R$id.function_grid_view, "field 'mFunctionGridView'", GridView.class);
        demoControlViewActivity.mMoreLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C12225R$id.control_view_more, "field 'mMoreLayout'", LinearLayout.class);
        demoControlViewActivity.mLayoutShadows = (LinearLayout) Utils.findRequiredViewAsType(view, C12225R$id.shadow_view, "field 'mLayoutShadows'", LinearLayout.class);
        demoControlViewActivity.mLayoutAnimation = (LinearLayout) Utils.findRequiredViewAsType(view, C12225R$id.layout_animation, "field 'mLayoutAnimation'", LinearLayout.class);
        demoControlViewActivity.mLayoutLeft = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297023, "field 'mLayoutLeft'", LinearLayout.class);
        demoControlViewActivity.mImageLeft = (ImageView) Utils.findRequiredViewAsType(view, C12225R$id.image_left, "field 'mImageLeft'", ImageView.class);
        demoControlViewActivity.mLayoutMiddle = (LinearLayout) Utils.findRequiredViewAsType(view, C12225R$id.layout_middle, "field 'mLayoutMiddle'", LinearLayout.class);
        demoControlViewActivity.mImageMiddle = (ImageView) Utils.findRequiredViewAsType(view, C12225R$id.image_middle, "field 'mImageMiddle'", ImageView.class);
        demoControlViewActivity.mLayoutRight = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297032, "field 'mLayoutRight'", LinearLayout.class);
        demoControlViewActivity.mImageRight = (ImageView) Utils.findRequiredViewAsType(view, C12225R$id.image_right, "field 'mImageRight'", ImageView.class);
        demoControlViewActivity.mModeSelection = (ModeSelectionViewNew) Utils.findRequiredViewAsType(view, 2131297136, "field 'mModeSelection'", ModeSelectionViewNew.class);
        demoControlViewActivity.mBrightnessSeekBar = (BrightnessSeekBarView) Utils.findRequiredViewAsType(view, 2131296444, "field 'mBrightnessSeekBar'", BrightnessSeekBarView.class);
        demoControlViewActivity.mFavoriteSceneViewBar = (FavoriteSceneViewBar) Utils.findRequiredViewAsType(view, C12225R$id.favorite_scene_view_bar, "field 'mFavoriteSceneViewBar'", FavoriteSceneViewBar.class);
    }

    @CallSuper
    public void unbind() {
        DemoControlViewActivity demoControlViewActivity = this.f10319a;
        if (demoControlViewActivity != null) {
            this.f10319a = null;
            demoControlViewActivity.mTitleBar = null;
            demoControlViewActivity.mFunctionGridView = null;
            demoControlViewActivity.mMoreLayout = null;
            demoControlViewActivity.mLayoutShadows = null;
            demoControlViewActivity.mLayoutAnimation = null;
            demoControlViewActivity.mLayoutLeft = null;
            demoControlViewActivity.mImageLeft = null;
            demoControlViewActivity.mLayoutMiddle = null;
            demoControlViewActivity.mImageMiddle = null;
            demoControlViewActivity.mLayoutRight = null;
            demoControlViewActivity.mImageRight = null;
            demoControlViewActivity.mModeSelection = null;
            demoControlViewActivity.mBrightnessSeekBar = null;
            demoControlViewActivity.mFavoriteSceneViewBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

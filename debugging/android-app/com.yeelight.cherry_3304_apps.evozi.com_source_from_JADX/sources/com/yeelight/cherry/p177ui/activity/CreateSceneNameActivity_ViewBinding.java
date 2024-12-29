package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.CreateSceneNameActivity_ViewBinding */
public class CreateSceneNameActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CreateSceneNameActivity f10632a;

    @UiThread
    public CreateSceneNameActivity_ViewBinding(CreateSceneNameActivity createSceneNameActivity, View view) {
        this.f10632a = createSceneNameActivity;
        createSceneNameActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
        createSceneNameActivity.mEtName = (EditText) Utils.findRequiredViewAsType(view, C11745R$id.et_name, "field 'mEtName'", EditText.class);
        createSceneNameActivity.mBtnClear = (ImageButton) Utils.findRequiredViewAsType(view, C11745R$id.btn_clear, "field 'mBtnClear'", ImageButton.class);
        createSceneNameActivity.mTypeImageView = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.sence_type_img, "field 'mTypeImageView'", ImageView.class);
        createSceneNameActivity.mBtnComplete = (TextView) Utils.findRequiredViewAsType(view, 2131296404, "field 'mBtnComplete'", TextView.class);
        createSceneNameActivity.mImageSelect = (FrameLayout) Utils.findRequiredViewAsType(view, C11745R$id.layout_image_select, "field 'mImageSelect'", FrameLayout.class);
    }

    @CallSuper
    public void unbind() {
        CreateSceneNameActivity createSceneNameActivity = this.f10632a;
        if (createSceneNameActivity != null) {
            this.f10632a = null;
            createSceneNameActivity.mTitleBar = null;
            createSceneNameActivity.mEtName = null;
            createSceneNameActivity.mBtnClear = null;
            createSceneNameActivity.mTypeImageView = null;
            createSceneNameActivity.mBtnComplete = null;
            createSceneNameActivity.mImageSelect = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

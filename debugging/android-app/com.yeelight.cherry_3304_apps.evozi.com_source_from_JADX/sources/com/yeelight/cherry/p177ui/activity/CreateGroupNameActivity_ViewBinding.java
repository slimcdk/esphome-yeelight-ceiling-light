package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.CreateGroupNameActivity_ViewBinding */
public class CreateGroupNameActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CreateGroupNameActivity f10533a;

    /* renamed from: b */
    private View f10534b;

    /* renamed from: com.yeelight.cherry.ui.activity.CreateGroupNameActivity_ViewBinding$a */
    class C5082a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CreateGroupNameActivity f10535a;

        C5082a(CreateGroupNameActivity_ViewBinding createGroupNameActivity_ViewBinding, CreateGroupNameActivity createGroupNameActivity) {
            this.f10535a = createGroupNameActivity;
        }

        public void doClick(View view) {
            this.f10535a.nextStep();
        }
    }

    @UiThread
    public CreateGroupNameActivity_ViewBinding(CreateGroupNameActivity createGroupNameActivity, View view) {
        this.f10533a = createGroupNameActivity;
        createGroupNameActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
        createGroupNameActivity.mEtName = (EditText) Utils.findRequiredViewAsType(view, C11745R$id.et_name, "field 'mEtName'", EditText.class);
        createGroupNameActivity.mBtnClear = (ImageButton) Utils.findRequiredViewAsType(view, C11745R$id.btn_clear, "field 'mBtnClear'", ImageButton.class);
        createGroupNameActivity.mTypeImageView = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.room_type_img, "field 'mTypeImageView'", ImageView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297043, "field 'mBtnNext' and method 'nextStep'");
        createGroupNameActivity.mBtnNext = (TextView) Utils.castView(findRequiredView, 2131297043, "field 'mBtnNext'", TextView.class);
        this.f10534b = findRequiredView;
        findRequiredView.setOnClickListener(new C5082a(this, createGroupNameActivity));
    }

    @CallSuper
    public void unbind() {
        CreateGroupNameActivity createGroupNameActivity = this.f10533a;
        if (createGroupNameActivity != null) {
            this.f10533a = null;
            createGroupNameActivity.mTitleBar = null;
            createGroupNameActivity.mEtName = null;
            createGroupNameActivity.mBtnClear = null;
            createGroupNameActivity.mTypeImageView = null;
            createGroupNameActivity.mBtnNext = null;
            this.f10534b.setOnClickListener((View.OnClickListener) null);
            this.f10534b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

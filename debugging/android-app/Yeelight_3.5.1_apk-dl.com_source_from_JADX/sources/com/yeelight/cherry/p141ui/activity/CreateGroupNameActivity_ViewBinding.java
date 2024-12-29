package com.yeelight.cherry.p141ui.activity;

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
import com.yeelight.cherry.C12225R$id;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.CreateGroupNameActivity_ViewBinding */
public class CreateGroupNameActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CreateGroupNameActivity f10084a;

    /* renamed from: b */
    private View f10085b;

    /* renamed from: com.yeelight.cherry.ui.activity.CreateGroupNameActivity_ViewBinding$a */
    class C5129a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CreateGroupNameActivity f10086a;

        C5129a(CreateGroupNameActivity_ViewBinding createGroupNameActivity_ViewBinding, CreateGroupNameActivity createGroupNameActivity) {
            this.f10086a = createGroupNameActivity;
        }

        public void doClick(View view) {
            this.f10086a.nextStep();
        }
    }

    @UiThread
    public CreateGroupNameActivity_ViewBinding(CreateGroupNameActivity createGroupNameActivity, View view) {
        this.f10084a = createGroupNameActivity;
        createGroupNameActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297591, "field 'mTitleBar'", CommonTitleBar.class);
        createGroupNameActivity.mEtName = (EditText) Utils.findRequiredViewAsType(view, C12225R$id.et_name, "field 'mEtName'", EditText.class);
        createGroupNameActivity.mBtnClear = (ImageButton) Utils.findRequiredViewAsType(view, C12225R$id.btn_clear, "field 'mBtnClear'", ImageButton.class);
        createGroupNameActivity.mTypeImageView = (ImageView) Utils.findRequiredViewAsType(view, C12225R$id.room_type_img, "field 'mTypeImageView'", ImageView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297165, "field 'mBtnNext' and method 'nextStep'");
        createGroupNameActivity.mBtnNext = (TextView) Utils.castView(findRequiredView, 2131297165, "field 'mBtnNext'", TextView.class);
        this.f10085b = findRequiredView;
        findRequiredView.setOnClickListener(new C5129a(this, createGroupNameActivity));
    }

    @CallSuper
    public void unbind() {
        CreateGroupNameActivity createGroupNameActivity = this.f10084a;
        if (createGroupNameActivity != null) {
            this.f10084a = null;
            createGroupNameActivity.mTitleBar = null;
            createGroupNameActivity.mEtName = null;
            createGroupNameActivity.mBtnClear = null;
            createGroupNameActivity.mTypeImageView = null;
            createGroupNameActivity.mBtnNext = null;
            this.f10085b.setOnClickListener((View.OnClickListener) null);
            this.f10085b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

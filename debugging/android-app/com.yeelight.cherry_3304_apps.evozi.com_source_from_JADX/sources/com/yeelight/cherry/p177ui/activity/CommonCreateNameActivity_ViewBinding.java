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

/* renamed from: com.yeelight.cherry.ui.activity.CommonCreateNameActivity_ViewBinding */
public class CommonCreateNameActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CommonCreateNameActivity f10522a;

    /* renamed from: b */
    private View f10523b;

    /* renamed from: com.yeelight.cherry.ui.activity.CommonCreateNameActivity_ViewBinding$a */
    class C5075a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonCreateNameActivity f10524a;

        C5075a(CommonCreateNameActivity_ViewBinding commonCreateNameActivity_ViewBinding, CommonCreateNameActivity commonCreateNameActivity) {
            this.f10524a = commonCreateNameActivity;
        }

        public void doClick(View view) {
            this.f10524a.nextStep();
        }
    }

    @UiThread
    public CommonCreateNameActivity_ViewBinding(CommonCreateNameActivity commonCreateNameActivity, View view) {
        this.f10522a = commonCreateNameActivity;
        commonCreateNameActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
        commonCreateNameActivity.mEtName = (EditText) Utils.findRequiredViewAsType(view, C11745R$id.et_name, "field 'mEtName'", EditText.class);
        commonCreateNameActivity.mBtnClear = (ImageButton) Utils.findRequiredViewAsType(view, C11745R$id.btn_clear, "field 'mBtnClear'", ImageButton.class);
        commonCreateNameActivity.mTypeImageView = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.room_type_img, "field 'mTypeImageView'", ImageView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297043, "field 'mBtnNext' and method 'nextStep'");
        commonCreateNameActivity.mBtnNext = (TextView) Utils.castView(findRequiredView, 2131297043, "field 'mBtnNext'", TextView.class);
        this.f10523b = findRequiredView;
        findRequiredView.setOnClickListener(new C5075a(this, commonCreateNameActivity));
    }

    @CallSuper
    public void unbind() {
        CommonCreateNameActivity commonCreateNameActivity = this.f10522a;
        if (commonCreateNameActivity != null) {
            this.f10522a = null;
            commonCreateNameActivity.mTitleBar = null;
            commonCreateNameActivity.mEtName = null;
            commonCreateNameActivity.mBtnClear = null;
            commonCreateNameActivity.mTypeImageView = null;
            commonCreateNameActivity.mBtnNext = null;
            this.f10523b.setOnClickListener((View.OnClickListener) null);
            this.f10523b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

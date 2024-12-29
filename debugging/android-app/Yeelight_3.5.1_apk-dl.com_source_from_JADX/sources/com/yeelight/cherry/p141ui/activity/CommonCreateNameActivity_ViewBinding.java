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

/* renamed from: com.yeelight.cherry.ui.activity.CommonCreateNameActivity_ViewBinding */
public class CommonCreateNameActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CommonCreateNameActivity f10073a;

    /* renamed from: b */
    private View f10074b;

    /* renamed from: com.yeelight.cherry.ui.activity.CommonCreateNameActivity_ViewBinding$a */
    class C5122a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonCreateNameActivity f10075a;

        C5122a(CommonCreateNameActivity_ViewBinding commonCreateNameActivity_ViewBinding, CommonCreateNameActivity commonCreateNameActivity) {
            this.f10075a = commonCreateNameActivity;
        }

        public void doClick(View view) {
            this.f10075a.nextStep();
        }
    }

    @UiThread
    public CommonCreateNameActivity_ViewBinding(CommonCreateNameActivity commonCreateNameActivity, View view) {
        this.f10073a = commonCreateNameActivity;
        commonCreateNameActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297591, "field 'mTitleBar'", CommonTitleBar.class);
        commonCreateNameActivity.mEtName = (EditText) Utils.findRequiredViewAsType(view, C12225R$id.et_name, "field 'mEtName'", EditText.class);
        commonCreateNameActivity.mBtnClear = (ImageButton) Utils.findRequiredViewAsType(view, C12225R$id.btn_clear, "field 'mBtnClear'", ImageButton.class);
        commonCreateNameActivity.mTypeImageView = (ImageView) Utils.findRequiredViewAsType(view, C12225R$id.room_type_img, "field 'mTypeImageView'", ImageView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297165, "field 'mBtnNext' and method 'nextStep'");
        commonCreateNameActivity.mBtnNext = (TextView) Utils.castView(findRequiredView, 2131297165, "field 'mBtnNext'", TextView.class);
        this.f10074b = findRequiredView;
        findRequiredView.setOnClickListener(new C5122a(this, commonCreateNameActivity));
    }

    @CallSuper
    public void unbind() {
        CommonCreateNameActivity commonCreateNameActivity = this.f10073a;
        if (commonCreateNameActivity != null) {
            this.f10073a = null;
            commonCreateNameActivity.mTitleBar = null;
            commonCreateNameActivity.mEtName = null;
            commonCreateNameActivity.mBtnClear = null;
            commonCreateNameActivity.mTypeImageView = null;
            commonCreateNameActivity.mBtnNext = null;
            this.f10074b.setOnClickListener((View.OnClickListener) null);
            this.f10074b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

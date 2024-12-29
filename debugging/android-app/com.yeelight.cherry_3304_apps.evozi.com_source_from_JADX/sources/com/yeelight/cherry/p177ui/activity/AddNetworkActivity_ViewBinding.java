package com.yeelight.cherry.p177ui.activity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.AddNetworkActivity_ViewBinding */
public class AddNetworkActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AddNetworkActivity f10333a;

    /* renamed from: b */
    private View f10334b;

    /* renamed from: com.yeelight.cherry.ui.activity.AddNetworkActivity_ViewBinding$a */
    class C4999a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ AddNetworkActivity f10335a;

        C4999a(AddNetworkActivity_ViewBinding addNetworkActivity_ViewBinding, AddNetworkActivity addNetworkActivity) {
            this.f10335a = addNetworkActivity;
        }

        public void doClick(View view) {
            this.f10335a.next();
        }
    }

    @UiThread
    public AddNetworkActivity_ViewBinding(AddNetworkActivity addNetworkActivity, View view) {
        this.f10333a = addNetworkActivity;
        addNetworkActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297424, "field 'mTitleBar'", CommonTitleBar.class);
        addNetworkActivity.mContentTop = (LinearLayout) Utils.findRequiredViewAsType(view, C11745R$id.content_top, "field 'mContentTop'", LinearLayout.class);
        addNetworkActivity.mSsidLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C11745R$id.ssid_layout, "field 'mSsidLayout'", LinearLayout.class);
        addNetworkActivity.mSsidIcon = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.ssid_icon, "field 'mSsidIcon'", ImageView.class);
        addNetworkActivity.mEtSsid = (EditText) Utils.findRequiredViewAsType(view, C11745R$id.et_ssid, "field 'mEtSsid'", EditText.class);
        addNetworkActivity.mPwdIcon = (ImageView) Utils.findRequiredViewAsType(view, C11745R$id.pwd_icon, "field 'mPwdIcon'", ImageView.class);
        addNetworkActivity.mEtPwd = (EditText) Utils.findRequiredViewAsType(view, C11745R$id.et_pwd, "field 'mEtPwd'", EditText.class);
        addNetworkActivity.mTitle = (TextView) Utils.findRequiredViewAsType(view, 2131297422, "field 'mTitle'", TextView.class);
        addNetworkActivity.mSubInfo = (TextView) Utils.findRequiredViewAsType(view, C11745R$id.sub_info, "field 'mSubInfo'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, C11745R$id.next, "field 'mBtnNext' and method 'next'");
        addNetworkActivity.mBtnNext = (Button) Utils.castView(findRequiredView, C11745R$id.next, "field 'mBtnNext'", Button.class);
        this.f10334b = findRequiredView;
        findRequiredView.setOnClickListener(new C4999a(this, addNetworkActivity));
    }

    @CallSuper
    public void unbind() {
        AddNetworkActivity addNetworkActivity = this.f10333a;
        if (addNetworkActivity != null) {
            this.f10333a = null;
            addNetworkActivity.mTitleBar = null;
            addNetworkActivity.mContentTop = null;
            addNetworkActivity.mSsidLayout = null;
            addNetworkActivity.mSsidIcon = null;
            addNetworkActivity.mEtSsid = null;
            addNetworkActivity.mPwdIcon = null;
            addNetworkActivity.mEtPwd = null;
            addNetworkActivity.mTitle = null;
            addNetworkActivity.mSubInfo = null;
            addNetworkActivity.mBtnNext = null;
            this.f10334b.setOnClickListener((View.OnClickListener) null);
            this.f10334b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

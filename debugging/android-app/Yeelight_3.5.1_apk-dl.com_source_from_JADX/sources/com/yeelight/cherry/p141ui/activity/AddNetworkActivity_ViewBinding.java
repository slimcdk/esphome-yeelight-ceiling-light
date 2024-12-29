package com.yeelight.cherry.p141ui.activity;

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
import com.yeelight.cherry.C12225R$id;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;

/* renamed from: com.yeelight.cherry.ui.activity.AddNetworkActivity_ViewBinding */
public class AddNetworkActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AddNetworkActivity f9877a;

    /* renamed from: b */
    private View f9878b;

    /* renamed from: com.yeelight.cherry.ui.activity.AddNetworkActivity_ViewBinding$a */
    class C5044a extends DebouncingOnClickListener {

        /* renamed from: a */
        final /* synthetic */ AddNetworkActivity f9879a;

        C5044a(AddNetworkActivity_ViewBinding addNetworkActivity_ViewBinding, AddNetworkActivity addNetworkActivity) {
            this.f9879a = addNetworkActivity;
        }

        public void doClick(View view) {
            this.f9879a.next();
        }
    }

    @UiThread
    public AddNetworkActivity_ViewBinding(AddNetworkActivity addNetworkActivity, View view) {
        this.f9877a = addNetworkActivity;
        addNetworkActivity.mTitleBar = (CommonTitleBar) Utils.findRequiredViewAsType(view, 2131297591, "field 'mTitleBar'", CommonTitleBar.class);
        addNetworkActivity.mContentTop = (LinearLayout) Utils.findRequiredViewAsType(view, C12225R$id.content_top, "field 'mContentTop'", LinearLayout.class);
        addNetworkActivity.mSsidLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C12225R$id.ssid_layout, "field 'mSsidLayout'", LinearLayout.class);
        addNetworkActivity.mSsidIcon = (ImageView) Utils.findRequiredViewAsType(view, C12225R$id.ssid_icon, "field 'mSsidIcon'", ImageView.class);
        addNetworkActivity.mEtSsid = (EditText) Utils.findRequiredViewAsType(view, C12225R$id.et_ssid, "field 'mEtSsid'", EditText.class);
        addNetworkActivity.mPwdIcon = (ImageView) Utils.findRequiredViewAsType(view, C12225R$id.pwd_icon, "field 'mPwdIcon'", ImageView.class);
        addNetworkActivity.mEtPwd = (EditText) Utils.findRequiredViewAsType(view, C12225R$id.et_pwd, "field 'mEtPwd'", EditText.class);
        addNetworkActivity.mTitle = (TextView) Utils.findRequiredViewAsType(view, 2131297589, "field 'mTitle'", TextView.class);
        addNetworkActivity.mSubInfo = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.sub_info, "field 'mSubInfo'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, C12225R$id.next, "field 'mBtnNext' and method 'next'");
        addNetworkActivity.mBtnNext = (Button) Utils.castView(findRequiredView, C12225R$id.next, "field 'mBtnNext'", Button.class);
        this.f9878b = findRequiredView;
        findRequiredView.setOnClickListener(new C5044a(this, addNetworkActivity));
    }

    @CallSuper
    public void unbind() {
        AddNetworkActivity addNetworkActivity = this.f9877a;
        if (addNetworkActivity != null) {
            this.f9877a = null;
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
            this.f9878b.setOnClickListener((View.OnClickListener) null);
            this.f9878b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

package com.yeelight.cherry.p141ui.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.yeelight.cherry.C12225R$id;

/* renamed from: com.yeelight.cherry.ui.fragment.MIBandControlFragment_ViewBinding */
public class MIBandControlFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MIBandControlFragment f12053a;

    @UiThread
    public MIBandControlFragment_ViewBinding(MIBandControlFragment mIBandControlFragment, View view) {
        this.f12053a = mIBandControlFragment;
        mIBandControlFragment.mTitleText = (TextSwitcher) Utils.findRequiredViewAsType(view, 2131297589, "field 'mTitleText'", TextSwitcher.class);
        mIBandControlFragment.mSubTitleText = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.sub_title, "field 'mSubTitleText'", TextView.class);
        mIBandControlFragment.mMiddleImage = (ImageView) Utils.findRequiredViewAsType(view, C12225R$id.miband_control_image, "field 'mMiddleImage'", ImageView.class);
        mIBandControlFragment.mBroadcastText = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.mi_band_open_broadcast, "field 'mBroadcastText'", TextView.class);
        mIBandControlFragment.mSwitchText = (TextView) Utils.findRequiredViewAsType(view, 2131297528, "field 'mSwitchText'", TextView.class);
        mIBandControlFragment.mSwitchLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C12225R$id.switchlayout, "field 'mSwitchLayout'", LinearLayout.class);
        mIBandControlFragment.mSwitchImage = (ImageView) Utils.findRequiredViewAsType(view, C12225R$id.image_left, "field 'mSwitchImage'", ImageView.class);
        mIBandControlFragment.mBindText = (TextView) Utils.findRequiredViewAsType(view, C12225R$id.bind_text, "field 'mBindText'", TextView.class);
        mIBandControlFragment.mBindLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C12225R$id.bindlayout, "field 'mBindLayout'", LinearLayout.class);
    }

    @CallSuper
    public void unbind() {
        MIBandControlFragment mIBandControlFragment = this.f12053a;
        if (mIBandControlFragment != null) {
            this.f12053a = null;
            mIBandControlFragment.mTitleText = null;
            mIBandControlFragment.mSubTitleText = null;
            mIBandControlFragment.mMiddleImage = null;
            mIBandControlFragment.mBroadcastText = null;
            mIBandControlFragment.mSwitchText = null;
            mIBandControlFragment.mSwitchLayout = null;
            mIBandControlFragment.mSwitchImage = null;
            mIBandControlFragment.mBindText = null;
            mIBandControlFragment.mBindLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
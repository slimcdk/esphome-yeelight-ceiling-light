package com.yeelight.cherry.p177ui.fragment;

import android.view.View;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

/* renamed from: com.yeelight.cherry.ui.fragment.w */
class C5950w implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ DiscoFragment f12558a;

    C5950w(DiscoFragment discoFragment) {
        this.f12558a = discoFragment;
    }

    public void onClick(View view) {
        this.f12558a.mControlProgressBar.setVisibility(0);
        this.f12558a.mBtnControl.setVisibility(4);
        if (ContextCompat.checkSelfPermission(this.f12558a.mBtnControl.getContext(), "android.permission.RECORD_AUDIO") == 0) {
            this.f12558a.m17336J();
        } else if (this.f12558a.getActivity() != null) {
            ActivityCompat.requestPermissions(this.f12558a.getActivity(), new String[]{"android.permission.RECORD_AUDIO"}, 100);
        }
    }
}

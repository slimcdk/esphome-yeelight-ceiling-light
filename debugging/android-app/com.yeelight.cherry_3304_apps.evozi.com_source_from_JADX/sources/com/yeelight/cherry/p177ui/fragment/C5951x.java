package com.yeelight.cherry.p177ui.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.activity.MiBandBaseActivity;

/* renamed from: com.yeelight.cherry.ui.fragment.x */
public class C5951x extends Fragment {

    /* renamed from: a */
    private View f12559a;

    /* renamed from: com.yeelight.cherry.ui.fragment.x$a */
    class C5952a implements View.OnClickListener {
        C5952a() {
        }

        public void onClick(View view) {
            ((MiBandBaseActivity) C5951x.this.getActivity()).mo26169Y(true);
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C11748R$layout.fragment_miband_ensure, viewGroup, false);
        this.f12559a = inflate;
        ImageView imageView = (ImageView) inflate.findViewById(C11745R$id.ensure_middle_image);
        this.f12559a.findViewById(C11745R$id.miband_bottom_btn).setOnClickListener(new C5952a());
        return this.f12559a;
    }
}

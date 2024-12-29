package com.yeelight.cherry.p141ui.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.activity.MiBandBaseActivity;

/* renamed from: com.yeelight.cherry.ui.fragment.i */
public class C5998i extends Fragment {

    /* renamed from: a */
    private View f12138a;

    /* renamed from: com.yeelight.cherry.ui.fragment.i$a */
    class C5999a implements View.OnClickListener {
        C5999a() {
        }

        public void onClick(View view) {
            ((MiBandBaseActivity) C5998i.this.getActivity()).mo30219Y(true);
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C12228R$layout.fragment_miband_ensure, viewGroup, false);
        this.f12138a = inflate;
        ImageView imageView = (ImageView) inflate.findViewById(C12225R$id.ensure_middle_image);
        this.f12138a.findViewById(C12225R$id.miband_bottom_btn).setOnClickListener(new C5999a());
        return this.f12138a;
    }
}

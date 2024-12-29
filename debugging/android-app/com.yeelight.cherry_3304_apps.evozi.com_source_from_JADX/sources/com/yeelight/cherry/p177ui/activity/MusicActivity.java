package com.yeelight.cherry.p177ui.activity;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.fragment.DiscoFragment;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.utils.C10559w;

/* renamed from: com.yeelight.cherry.ui.activity.MusicActivity */
public class MusicActivity extends BaseActivity {

    /* renamed from: com.yeelight.cherry.ui.activity.MusicActivity$a */
    class C5451a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageView f11375a;

        C5451a(MusicActivity musicActivity, ImageView imageView) {
            this.f11375a = imageView;
        }

        public void onClick(View view) {
            ImageView imageView = this.f11375a;
            imageView.setEnabled(!imageView.isEnabled());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MusicActivity$b */
    class C5452b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageView f11376a;

        /* renamed from: b */
        final /* synthetic */ AlertDialog f11377b;

        C5452b(MusicActivity musicActivity, ImageView imageView, AlertDialog alertDialog) {
            this.f11376a = imageView;
            this.f11377b = alertDialog;
        }

        public void onClick(View view) {
            if (this.f11376a.isEnabled()) {
                C10559w.m25819o(false);
            }
            this.f11377b.dismiss();
        }
    }

    /* renamed from: V */
    private void m16727V() {
        View inflate = View.inflate(this, C11748R$layout.music_mode_prompt_dialog_layout, (ViewGroup) null);
        inflate.setLayerType(1, (Paint) null);
        AlertDialog create = new AlertDialog.Builder(this, 2131820937).create();
        ImageView imageView = (ImageView) inflate.findViewById(C11745R$id.items_and_conditions_agree);
        imageView.setEnabled(false);
        ((LinearLayout) inflate.findViewById(C11745R$id.items_and_conditions_layout)).setOnClickListener(new C5451a(this, imageView));
        ((Button) inflate.findViewById(C11745R$id.btn_ok)).setOnClickListener(new C5452b(this, imageView, create));
        create.requestWindowFeature(1);
        create.setCancelable(false);
        create.show();
        create.setContentView(inflate);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        WindowManager.LayoutParams attributes = create.getWindow().getAttributes();
        attributes.height = -2;
        double width = (double) defaultDisplay.getWidth();
        Double.isNaN(width);
        attributes.width = (int) (width * 0.78d);
        create.getWindow().setAttributes(attributes);
    }

    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        setContentView(C11748R$layout.activity_music);
        DiscoFragment discoFragment = new DiscoFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString("com.yeelight.cherry.device_id", getIntent().getStringExtra("com.yeelight.cherry.device_id"));
        discoFragment.setArguments(bundle2);
        getSupportFragmentManager().beginTransaction().add(2131296510, (Fragment) discoFragment).commit();
        if (C10559w.m25809e()) {
            m16727V();
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }
}

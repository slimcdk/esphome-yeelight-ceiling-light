package com.yeelight.cherry.p141ui.activity;

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
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.fragment.DiscoFragment;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import p051j4.C3283v;

/* renamed from: com.yeelight.cherry.ui.activity.MusicActivity */
public class MusicActivity extends BaseActivity {

    /* renamed from: a */
    public static final /* synthetic */ int f10946a = 0;

    /* renamed from: com.yeelight.cherry.ui.activity.MusicActivity$a */
    class C5498a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageView f10947a;

        C5498a(MusicActivity musicActivity, ImageView imageView) {
            this.f10947a = imageView;
        }

        public void onClick(View view) {
            ImageView imageView = this.f10947a;
            imageView.setEnabled(!imageView.isEnabled());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MusicActivity$b */
    class C5499b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageView f10948a;

        /* renamed from: b */
        final /* synthetic */ AlertDialog f10949b;

        C5499b(MusicActivity musicActivity, ImageView imageView, AlertDialog alertDialog) {
            this.f10948a = imageView;
            this.f10949b = alertDialog;
        }

        public void onClick(View view) {
            if (this.f10948a.isEnabled()) {
                C3283v.m8849o(false);
            }
            this.f10949b.dismiss();
        }
    }

    /* renamed from: V */
    private void m16705V() {
        View inflate = View.inflate(this, C12228R$layout.music_mode_prompt_dialog_layout, (ViewGroup) null);
        inflate.setLayerType(1, (Paint) null);
        AlertDialog create = new AlertDialog.Builder(this, 2131820942).create();
        ImageView imageView = (ImageView) inflate.findViewById(C12225R$id.items_and_conditions_agree);
        imageView.setEnabled(false);
        ((LinearLayout) inflate.findViewById(C12225R$id.items_and_conditions_layout)).setOnClickListener(new C5498a(this, imageView));
        ((Button) inflate.findViewById(C12225R$id.btn_ok)).setOnClickListener(new C5499b(this, imageView, create));
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
        mo35653P();
        setContentView(C12228R$layout.activity_music);
        DiscoFragment discoFragment = new DiscoFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString("com.yeelight.cherry.device_id", getIntent().getStringExtra("com.yeelight.cherry.device_id"));
        discoFragment.setArguments(bundle2);
        getSupportFragmentManager().beginTransaction().add(2131296581, (Fragment) discoFragment).commit();
        if (C3283v.m8839e()) {
            m16705V();
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }
}

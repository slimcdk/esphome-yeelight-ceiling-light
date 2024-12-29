package com.yeelight.cherry.p177ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.yeelight.cherry.C11744R$drawable;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p183m.C7472y;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.cherry.ui.activity.CurtainModeActivity */
public class CurtainModeActivity extends BaseActivity implements C9770e {

    /* renamed from: b */
    private int f10681b;

    /* renamed from: c */
    private C7472y f10682c;
    @BindView(2131296413)
    Button mBtnDone;
    @BindView(2131296786)
    ImageView mImgDouble;
    @BindView(2131296798)
    ImageView mImgLeft;
    @BindView(2131296808)
    ImageView mImgRight;
    @BindView(2131297476)
    TextView mTvDouble;
    @BindView(2131297486)
    TextView mTvLeft;
    @BindView(2131297497)
    TextView mTvRight;

    /* renamed from: V */
    private void m16213V(int i) {
        TextView textView;
        this.f10681b = i;
        this.mBtnDone.setEnabled(true);
        this.mImgDouble.setImageResource(C11744R$drawable.icon_yeelight_curtain_double_nor);
        this.mImgLeft.setImageResource(C11744R$drawable.icon_yeelight_curtain_left_nor);
        this.mImgRight.setImageResource(C11744R$drawable.icon_yeelight_curtain_right_nor);
        this.mTvDouble.setTextColor(ContextCompat.getColor(this, 2131099835));
        this.mTvLeft.setTextColor(ContextCompat.getColor(this, 2131099835));
        this.mTvRight.setTextColor(ContextCompat.getColor(this, 2131099835));
        if (i == 1) {
            this.mImgDouble.setImageResource(C11744R$drawable.icon_yeelight_curtain_double_selected);
            textView = this.mTvDouble;
        } else if (i == 2) {
            this.mImgLeft.setImageResource(C11744R$drawable.icon_yeelight_curtain_left_selected);
            textView = this.mTvLeft;
        } else if (i == 3) {
            this.mImgRight.setImageResource(C11744R$drawable.icon_yeelight_curtain_right_selected);
            textView = this.mTvRight;
        } else {
            return;
        }
        textView.setTextColor(ContextCompat.getColor(this, 2131099837));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_curtain_style);
        ButterKnife.bind((Activity) this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        findViewById(2131297431).setLayoutParams(layoutParams);
        int i = 0;
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t("CurtainModeActivity", "Activity has not device id", false);
            finish();
            return;
        }
        C7472y yVar = (C7472y) C4257w.m11945h0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f10682c = yVar;
        if (yVar == null || !yVar.mo23331k0()) {
            BaseActivity.m24384U(this);
            finish();
        }
        this.f10682c.mo23367C0(this, false);
        if (this.f10682c.mo27617q2() != null) {
            i = this.f10682c.mo27617q2().intValue();
        }
        this.f10681b = i;
        if (i != 0) {
            m16213V(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C7472y yVar = this.f10682c;
        if (yVar != null) {
            yVar.mo23400W0(this);
        }
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == 67108864) {
            this.f10682c.mo28811E2();
            Intent intent = new Intent(this, CurtainControlActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", this.f10682c.mo23372G());
            startActivity(intent);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    @OnClick({2131296772, 2131296786, 2131297476, 2131296798, 2131297486, 2131296808, 2131297497, 2131296413})
    public void onViewClick(View view) {
        int i;
        switch (view.getId()) {
            case C11745R$id.btn_done:
                this.f10682c.mo28810D2(this.f10681b);
                return;
            case 2131296772:
                onBackPressed();
                return;
            case C11745R$id.img_double:
            case C11745R$id.tv_double:
                i = 1;
                break;
            case C11745R$id.img_left:
            case C11745R$id.tv_left:
                i = 2;
                break;
            case C11745R$id.img_right:
            case C11745R$id.tv_right:
                i = 3;
                break;
            default:
                return;
        }
        m16213V(i);
    }
}

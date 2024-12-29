package com.yeelight.cherry.p141ui.activity;

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
import com.yeelight.cherry.C12224R$drawable;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9193k;
import p223w3.C11911z;
import p237z3.C12145e;

/* renamed from: com.yeelight.cherry.ui.activity.CurtainModeActivity */
public class CurtainModeActivity extends BaseActivity implements C12145e {

    /* renamed from: c */
    public static final /* synthetic */ int f10236c = 0;

    /* renamed from: a */
    private int f10237a;

    /* renamed from: b */
    private C11911z f10238b;
    @BindView(2131296471)
    Button mBtnDone;
    @BindView(2131296890)
    ImageView mImgDouble;
    @BindView(2131296902)
    ImageView mImgLeft;
    @BindView(2131296912)
    ImageView mImgRight;
    @BindView(2131297651)
    TextView mTvDouble;
    @BindView(2131297661)
    TextView mTvLeft;
    @BindView(2131297673)
    TextView mTvRight;

    /* renamed from: V */
    private void m16125V(int i) {
        TextView textView;
        this.f10237a = i;
        this.mBtnDone.setEnabled(true);
        this.mImgDouble.setImageResource(C12224R$drawable.icon_yeelight_curtain_double_nor);
        this.mImgLeft.setImageResource(C12224R$drawable.icon_yeelight_curtain_left_nor);
        this.mImgRight.setImageResource(C12224R$drawable.icon_yeelight_curtain_right_nor);
        this.mTvDouble.setTextColor(ContextCompat.getColor(this, 2131099838));
        this.mTvLeft.setTextColor(ContextCompat.getColor(this, 2131099838));
        this.mTvRight.setTextColor(ContextCompat.getColor(this, 2131099838));
        if (i == 1) {
            this.mImgDouble.setImageResource(C12224R$drawable.icon_yeelight_curtain_double_selected);
            textView = this.mTvDouble;
        } else if (i == 2) {
            this.mImgLeft.setImageResource(C12224R$drawable.icon_yeelight_curtain_left_selected);
            textView = this.mTvLeft;
        } else if (i == 3) {
            this.mImgRight.setImageResource(C12224R$drawable.icon_yeelight_curtain_right_selected);
            textView = this.mTvRight;
        } else {
            return;
        }
        textView.setTextColor(ContextCompat.getColor(this, 2131099840));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_curtain_style);
        ButterKnife.bind((Activity) this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        findViewById(2131297598).setLayoutParams(layoutParams);
        int i = 0;
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w("CurtainModeActivity", "Activity has not device id", false);
            finish();
            return;
        }
        C11911z zVar = (C11911z) YeelightDeviceManager.m7794j0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f10238b = zVar;
        if (zVar == null || !zVar.mo23145k0()) {
            BaseActivity.m19947U(this);
            finish();
        }
        this.f10238b.mo23180C0(this, false);
        if (this.f10238b.mo41870q2() != null) {
            i = this.f10238b.mo41870q2().intValue();
        }
        this.f10237a = i;
        if (i != 0) {
            m16125V(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C11911z zVar = this.f10238b;
        if (zVar != null) {
            zVar.mo23213W0(this);
        }
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == 67108864) {
            this.f10238b.mo42395E2();
            Intent intent = new Intent(this, CurtainControlActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", this.f10238b.mo23185G());
            startActivity(intent);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    @OnClick({2131296876, 2131296890, 2131297651, 2131296902, 2131297661, 2131296912, 2131297673, 2131296471})
    public void onViewClick(View view) {
        int i;
        switch (view.getId()) {
            case C12225R$id.btn_done:
                this.f10238b.mo42394D2(this.f10237a);
                return;
            case 2131296876:
                onBackPressed();
                return;
            case C12225R$id.img_double:
            case C12225R$id.tv_double:
                i = 1;
                break;
            case C12225R$id.img_left:
            case C12225R$id.tv_left:
                i = 2;
                break;
            case C12225R$id.img_right:
            case C12225R$id.tv_right:
                i = 3;
                break;
            default:
                return;
        }
        m16125V(i);
    }
}

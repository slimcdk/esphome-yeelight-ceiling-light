package com.yeelight.cherry.p141ui.activity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.C6169f;
import com.yeelight.yeelib.managers.C8293t;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9193k;
import p051j4.C9195n;
import p170i4.C9107b;
import p170i4.C9113d;

/* renamed from: com.yeelight.cherry.ui.activity.RoomSettingActivity */
public class RoomSettingActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C6169f f11256a;

    /* renamed from: b */
    private C9107b.C9109b f11257b = null;

    /* renamed from: c */
    private String f11258c;

    /* renamed from: d */
    private int f11259d = -1;
    @BindView(2131296672)
    LinearLayout mManagerLayout;
    @BindView(2131296675)
    LinearLayout mNameLayout;
    @BindView(2131297361)
    TextView mNameView;
    @BindView(2131296676)
    TextView mNumberView;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;
    @BindView(2131296683)
    ImageView mTypeImage;
    @BindView(2131296684)
    LinearLayout mTypeLayout;

    /* renamed from: com.yeelight.cherry.ui.activity.RoomSettingActivity$a */
    class C5627a implements View.OnClickListener {
        C5627a() {
        }

        public void onClick(View view) {
            RoomSettingActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.RoomSettingActivity$b */
    class C5628b implements C8293t.C8299f {

        /* renamed from: a */
        final /* synthetic */ DialogInterface f11261a;

        C5628b(DialogInterface dialogInterface) {
            this.f11261a = dialogInterface;
        }

        /* renamed from: a */
        public void mo30328a() {
        }

        /* renamed from: b */
        public void mo30329b() {
            YeelightDeviceManager.m7800o0().mo23320v1(RoomSettingActivity.this.f11256a.mo23185G());
            this.f11261a.dismiss();
            Intent intent = new Intent(RoomSettingActivity.this, MainActivity.class);
            intent.addFlags(71303168);
            RoomSettingActivity.this.startActivity(intent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ void m16946Y(DialogInterface dialogInterface, int i) {
        this.f11256a.mo31875c2().mo36711C(System.currentTimeMillis());
        m16948a0();
        C8293t.m19620n().mo35262y(this.f11256a.mo31875c2(), new C5628b(dialogInterface));
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ void m16947Z() {
        C9107b.C9109b bVar = new C9107b.C9109b(this);
        this.f11257b = bVar;
        bVar.mo37129c(10000);
        this.f11257b.mo37128b(0, "");
        this.f11257b.mo37130d();
    }

    /* renamed from: a0 */
    private void m16948a0() {
        runOnUiThread(new C5750e3(this));
    }

    @OnClick({2131297355})
    public void deleteRoom() {
        C9113d.C9118e eVar = new C9113d.C9118e(this);
        eVar.mo37179i(getString(2131755247)).mo37177g(getString(2131756195)).mo37174d(-2, getString(2131755232), (DialogInterface.OnClickListener) null).mo37174d(-1, getString(2131755281), new C5744d3(this));
        eVar.mo37180j();
    }

    @OnClick({2131296672})
    public void modifyDevice() {
        Intent intent = new Intent(this, RoomDeviceModifyActivity.class);
        intent.putExtra("com.yeelight.cherry.device_id", this.f11256a.mo23185G());
        startActivityForResult(intent, 3);
    }

    @OnClick({2131296675})
    public void modifyName() {
        Intent intent = new Intent(this, CommonCreateNameActivity.class);
        intent.putExtra("edit_mode", true);
        intent.putExtra("room_name", this.f11256a.mo23210U());
        int i = this.f11259d;
        if (i == -1) {
            i = this.f11256a.mo31876d2();
        }
        intent.putExtra("create_res_index", i);
        startActivityForResult(intent, 2);
    }

    @OnClick({2131296684})
    public void modifyType() {
        Intent intent = new Intent(this, ImageModeSelectionActivity.class);
        intent.putExtra("image_type", 2);
        intent.putExtra("type_edit", true);
        int i = this.f11259d;
        if (i == -1) {
            i = this.f11256a.mo31876d2();
        }
        intent.putExtra("create_res_index", i);
        startActivityForResult(intent, 1);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (i2 != -1 || intent == null) {
                this.f11259d = -1;
                return;
            }
            int intExtra = intent.getIntExtra("create_res_index", -1);
            this.f11259d = intExtra;
            this.mTypeImage.setImageResource(C9195n.m22164a(2, intExtra));
            if (this.f11259d != -1) {
                this.f11256a.mo31875c2().mo36712D(this.f11259d);
            } else {
                return;
            }
        } else if (i == 2 && i2 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("room_name");
            this.f11258c = stringExtra;
            if (stringExtra != null) {
                this.mNameView.setText(stringExtra);
                this.f11256a.mo23198N0(this.f11258c);
            } else {
                return;
            }
        } else {
            return;
        }
        this.f11256a.mo31875c2().mo36711C(System.currentTimeMillis());
        C8293t.m19620n().mo35251A(this.f11256a.mo31875c2());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_room_setting);
        ButterKnife.bind((Activity) this);
        String stringExtra = getIntent().getStringExtra("com.yeelight.cherry.device_id");
        if (stringExtra == null) {
            AppUtils.m8300u("ROOM_DEBUG", "No room id!");
            finish();
            return;
        }
        C6169f J0 = YeelightDeviceManager.m7800o0().mo23268J0(stringExtra);
        this.f11256a = J0;
        if (J0 == null) {
            AppUtils.m8300u("ROOM_DEBUG", "Room device is null!!!");
            finish();
            return;
        }
        this.mTypeImage.setImageResource(J0.mo31873a2());
        this.mNameView.setText(this.f11256a.mo23210U());
        this.mTitleBar.setRightTextVisible(false);
        this.mTitleBar.mo36195a(getString(2131755317), new C5627a(), (View.OnClickListener) null);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.mNumberView.setText(String.format(getString(2131756196), new Object[]{Integer.valueOf(this.f11256a.mo31751I1())}));
    }
}

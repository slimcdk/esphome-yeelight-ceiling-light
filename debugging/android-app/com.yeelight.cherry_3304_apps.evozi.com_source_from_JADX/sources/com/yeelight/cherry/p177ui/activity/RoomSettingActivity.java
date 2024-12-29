package com.yeelight.cherry.p177ui.activity;

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
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p150c.C6005g;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C9812t;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C10549p;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.cherry.ui.activity.RoomSettingActivity */
public class RoomSettingActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C6005g f11689b;

    /* renamed from: c */
    private String f11690c;

    /* renamed from: d */
    private int f11691d = -1;
    @BindView(2131296594)
    LinearLayout mManagerLayout;
    @BindView(2131296597)
    LinearLayout mNameLayout;
    @BindView(2131297219)
    TextView mNameView;
    @BindView(2131296598)
    TextView mNumberView;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;
    @BindView(2131296605)
    ImageView mTypeImage;
    @BindView(2131296606)
    LinearLayout mTypeLayout;

    /* renamed from: com.yeelight.cherry.ui.activity.RoomSettingActivity$a */
    class C5586a implements View.OnClickListener {
        C5586a() {
        }

        public void onClick(View view) {
            RoomSettingActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.RoomSettingActivity$b */
    class C5587b implements DialogInterface.OnClickListener {
        C5587b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            RoomSettingActivity.this.f11689b.mo27553c2().mo31942C(System.currentTimeMillis());
            C9812t.m23832j().mo31692v(RoomSettingActivity.this.f11689b.mo27553c2());
            C4257w.m11947l0().mo23686r1(RoomSettingActivity.this.f11689b.mo23372G());
            dialogInterface.dismiss();
            Intent intent = new Intent(RoomSettingActivity.this, MainActivity.class);
            intent.addFlags(71303168);
            RoomSettingActivity.this.startActivity(intent);
        }
    }

    @OnClick({2131297213})
    public void deleteRoom() {
        C10526e.C10531e eVar = new C10526e.C10531e(this);
        eVar.mo33358i(getString(2131755244));
        eVar.mo33356g(getString(2131756171));
        eVar.mo33353d(-2, getString(2131755229), (DialogInterface.OnClickListener) null);
        eVar.mo33353d(-1, getString(2131755277), new C5587b());
        eVar.mo33359j();
    }

    @OnClick({2131296594})
    public void modifyDevice() {
        Intent intent = new Intent(this, RoomDeviceModifyActivity.class);
        intent.putExtra("com.yeelight.cherry.device_id", this.f11689b.mo23372G());
        startActivityForResult(intent, 3);
    }

    @OnClick({2131296597})
    public void modifyName() {
        Intent intent = new Intent(this, CommonCreateNameActivity.class);
        intent.putExtra("edit_mode", true);
        intent.putExtra("room_name", this.f11689b.mo23397U());
        int i = this.f11691d;
        if (i == -1) {
            i = this.f11689b.mo27554d2();
        }
        intent.putExtra("create_res_index", i);
        startActivityForResult(intent, 2);
    }

    @OnClick({2131296606})
    public void modifyType() {
        Intent intent = new Intent(this, ImageModeSelectionActivity.class);
        intent.putExtra("image_type", 2);
        intent.putExtra("type_edit", true);
        int i = this.f11691d;
        if (i == -1) {
            i = this.f11689b.mo27554d2();
        }
        intent.putExtra("create_res_index", i);
        startActivityForResult(intent, 1);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (i2 != -1 || intent == null) {
                this.f11691d = -1;
                return;
            }
            int intExtra = intent.getIntExtra("create_res_index", -1);
            this.f11691d = intExtra;
            this.mTypeImage.setImageResource(C10549p.m25765a(2, intExtra));
            if (this.f11691d != -1) {
                this.f11689b.mo27553c2().mo31943D(this.f11691d);
            } else {
                return;
            }
        } else if (i == 2 && i2 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("room_name");
            this.f11690c = stringExtra;
            if (stringExtra != null) {
                this.mNameView.setText(stringExtra);
                this.f11689b.mo23385N0(this.f11690c);
            } else {
                return;
            }
        } else {
            return;
        }
        this.f11689b.mo27553c2().mo31942C(System.currentTimeMillis());
        C9812t.m23832j().mo31694x(this.f11689b.mo27553c2());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_room_setting);
        ButterKnife.bind((Activity) this);
        String stringExtra = getIntent().getStringExtra("com.yeelight.cherry.device_id");
        if (stringExtra == null) {
            C4308b.m12139r("ROOM_DEBUG", "No room id!");
            finish();
            return;
        }
        C6005g G0 = C4257w.m11947l0().mo23647G0(stringExtra);
        this.f11689b = G0;
        if (G0 == null) {
            C4308b.m12139r("ROOM_DEBUG", "Room device is null!!!");
            finish();
            return;
        }
        this.mTypeImage.setImageResource(G0.mo27551a2());
        this.mNameView.setText(this.f11689b.mo23397U());
        this.mTitleBar.setRightTextVisible(false);
        this.mTitleBar.mo32825a(getString(2131755313), new C5586a(), (View.OnClickListener) null);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.mNumberView.setText(String.format(getString(2131756172), new Object[]{Integer.valueOf(this.f11689b.mo27496I1())}));
    }
}

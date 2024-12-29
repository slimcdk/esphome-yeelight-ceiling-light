package com.yeelight.cherry.p177ui.activity;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p150c.C5972a;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p183m.C6459e0;
import com.yeelight.yeelib.p152f.C4214g;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.Locale;

/* renamed from: com.yeelight.cherry.ui.activity.BluetoothDeviceUpgradeActivity */
public class BluetoothDeviceUpgradeActivity extends BaseActivity implements C9768c {

    /* renamed from: l */
    private static final String f10416l = BluetoothDeviceUpgradeActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C5972a f10417b;

    /* renamed from: c */
    private ObjectAnimator f10418c;

    /* renamed from: d */
    private C4214g.C4220e f10419d;

    /* renamed from: e */
    private boolean f10420e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f10421f = false;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f10422g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C10526e f10423h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C10526e f10424i = null;

    /* renamed from: j */
    private C9770e f10425j = new C5029a();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Handler f10426k = new C5031b();
    @BindView(2131296432)
    Button mBtnRetry;
    @BindView(2131296442)
    Button mBtnUpdate;
    @BindView(2131296531)
    TextView mNewUpdateCurrentVersion;
    @BindView(2131296869)
    TextView mNewUpdateLatestVersion;
    @BindView(2131296916)
    LinearLayout mNewUpdateLayout;
    @BindView(2131297158)
    TextView mNewUpdateReleaseNote;
    @BindView(2131297052)
    TextView mNoUpdateCurrentVersion;
    @BindView(2131296918)
    LinearLayout mNoupdateLayout;
    @BindView(2131297533)
    TextView mProgress;
    @BindView(2131297114)
    ImageView mProgressView;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;
    @BindView(2131296698)
    LinearLayout mUpdateFailLayout;
    @BindView(2131297535)
    TextView mUpdatingHint;
    @BindView(2131296699)
    LinearLayout mUpdatingLayout;

    /* renamed from: com.yeelight.cherry.ui.activity.BluetoothDeviceUpgradeActivity$a */
    class C5029a implements C9770e {

        /* renamed from: com.yeelight.cherry.ui.activity.BluetoothDeviceUpgradeActivity$a$a */
        class C5030a implements Runnable {
            C5030a() {
            }

            public void run() {
                BluetoothDeviceUpgradeActivity.this.m16057m0();
            }
        }

        C5029a() {
        }

        public void onStatusChange(int i, C6024e eVar) {
            if (i == 536870916) {
                BluetoothDeviceUpgradeActivity.this.runOnUiThread(new C5030a());
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BluetoothDeviceUpgradeActivity$b */
    class C5031b extends Handler {
        C5031b() {
        }

        public void handleMessage(Message message) {
            String str;
            C10526e eVar;
            switch (message.what) {
                case 1:
                    BluetoothDeviceUpgradeActivity bluetoothDeviceUpgradeActivity = BluetoothDeviceUpgradeActivity.this;
                    bluetoothDeviceUpgradeActivity.mProgress.setText(String.valueOf(bluetoothDeviceUpgradeActivity.f10417b.mo23329g0()));
                    return;
                case 2:
                    BluetoothDeviceUpgradeActivity.this.f10426k.sendEmptyMessage(1);
                    BluetoothDeviceUpgradeActivity.this.f10426k.sendEmptyMessageDelayed(2, 1000);
                    return;
                case 3:
                    removeMessages(2);
                    BluetoothDeviceUpgradeActivity.this.m16058n0();
                    BluetoothDeviceUpgradeActivity.this.mProgress.setText(String.valueOf(100));
                    removeMessages(6);
                    sendEmptyMessageDelayed(4, 1000);
                    return;
                case 4:
                    BluetoothDeviceUpgradeActivity.this.m16055k0();
                    return;
                case 5:
                    removeMessages(2);
                    removeMessages(6);
                    break;
                case 6:
                    removeMessages(2);
                    break;
                case 7:
                    C6459e0 e0Var = (C6459e0) BluetoothDeviceUpgradeActivity.this.f10417b;
                    if (BluetoothDeviceUpgradeActivity.this.f10421f) {
                        BluetoothDeviceUpgradeActivity bluetoothDeviceUpgradeActivity2 = BluetoothDeviceUpgradeActivity.this;
                        Toast.makeText(bluetoothDeviceUpgradeActivity2, bluetoothDeviceUpgradeActivity2.getResources().getString(2131755851), 0).show();
                    }
                    if (e0Var.mo27805V1().mo31820a() == 0) {
                        BluetoothDeviceUpgradeActivity.this.f10423h.setTitle((CharSequence) BluetoothDeviceUpgradeActivity.this.getResources().getString(2131755536));
                        eVar = BluetoothDeviceUpgradeActivity.this.f10423h;
                        str = BluetoothDeviceUpgradeActivity.this.getResources().getString(2131755523, new Object[]{new String((byte[]) e0Var.mo27804U1("ADV_MESH_NAME"))});
                    } else {
                        BluetoothDeviceUpgradeActivity.this.f10423h.setTitle((CharSequence) BluetoothDeviceUpgradeActivity.this.getResources().getString(2131755537));
                        eVar = BluetoothDeviceUpgradeActivity.this.f10423h;
                        str = BluetoothDeviceUpgradeActivity.this.getResources().getString(2131755525, new Object[]{new String((byte[]) e0Var.mo27804U1("ADV_MESH_NAME"))});
                    }
                    eVar.mo33339k(str);
                    BluetoothDeviceUpgradeActivity.this.f10423h.show();
                    BluetoothDeviceUpgradeActivity.this.m16053i0();
                    return;
                case 8:
                    sendEmptyMessage(5);
                    return;
                default:
                    return;
            }
            BluetoothDeviceUpgradeActivity.this.m16056l0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BluetoothDeviceUpgradeActivity$c */
    class C5032c implements View.OnClickListener {
        C5032c() {
        }

        public void onClick(View view) {
            BluetoothDeviceUpgradeActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BluetoothDeviceUpgradeActivity$d */
    class C5033d implements DialogInterface.OnClickListener {
        C5033d(BluetoothDeviceUpgradeActivity bluetoothDeviceUpgradeActivity) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BluetoothDeviceUpgradeActivity$e */
    class C5034e implements DialogInterface.OnClickListener {
        C5034e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            boolean unused = BluetoothDeviceUpgradeActivity.this.f10421f = true;
            C6459e0 e0Var = (C6459e0) BluetoothDeviceUpgradeActivity.this.f10417b;
            e0Var.mo27805V1().mo31827g(new String((byte[]) e0Var.mo27804U1("ADV_MESH_NAME")));
            e0Var.mo27805V1().mo31828h(BluetoothDeviceUpgradeActivity.this.f10423h.mo33332c().getText().toString());
            BluetoothDeviceUpgradeActivity.this.f10417b.mo23323Y0();
            BluetoothDeviceUpgradeActivity.this.f10426k.sendEmptyMessage(2);
            BluetoothDeviceUpgradeActivity.this.f10426k.sendEmptyMessageDelayed(6, 900000);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BluetoothDeviceUpgradeActivity$f */
    class C5035f implements DialogInterface.OnClickListener {
        C5035f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            boolean unused = BluetoothDeviceUpgradeActivity.this.f10422g = true;
            BluetoothDeviceUpgradeActivity.this.f10417b.mo23323Y0();
            BluetoothDeviceUpgradeActivity.this.f10426k.sendEmptyMessage(2);
            BluetoothDeviceUpgradeActivity.this.f10426k.sendEmptyMessageDelayed(6, 900000);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BluetoothDeviceUpgradeActivity$g */
    class C5036g implements View.OnClickListener {
        C5036g() {
        }

        public void onClick(View view) {
            if (!BluetoothDeviceUpgradeActivity.this.f10422g) {
                BluetoothDeviceUpgradeActivity.this.f10424i.show();
                return;
            }
            boolean unused = BluetoothDeviceUpgradeActivity.this.f10421f = false;
            BluetoothDeviceUpgradeActivity.this.f10417b.mo23323Y0();
            BluetoothDeviceUpgradeActivity.this.f10426k.sendEmptyMessage(2);
            BluetoothDeviceUpgradeActivity.this.f10426k.sendEmptyMessageDelayed(6, 900000);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BluetoothDeviceUpgradeActivity$h */
    class C5037h implements View.OnClickListener {
        C5037h() {
        }

        public void onClick(View view) {
            BluetoothDeviceUpgradeActivity.this.m16057m0();
            BluetoothDeviceUpgradeActivity.this.f10426k.sendEmptyMessage(2);
            BluetoothDeviceUpgradeActivity.this.f10426k.sendEmptyMessageDelayed(6, 900000);
            if (BluetoothDeviceUpgradeActivity.this.f10417b.mo23331k0()) {
                BluetoothDeviceUpgradeActivity.this.f10417b.mo23323Y0();
                return;
            }
            ((C6459e0) BluetoothDeviceUpgradeActivity.this.f10417b).mo28184q3(true);
            BluetoothDeviceUpgradeActivity.this.f10417b.mo23337n();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public void m16053i0() {
        C4214g.C4220e eVar = (C4214g.C4220e) C4214g.m11665j().mo23494m(this.f10417b.mo23395T());
        this.f10419d = eVar;
        if (eVar != null && eVar.mo23519a() > this.f10417b.mo23384N().mo29039b()) {
            this.mNewUpdateLayout.setVisibility(0);
            this.mNoupdateLayout.setVisibility(8);
            this.mUpdatingLayout.setVisibility(8);
            this.mUpdateFailLayout.setVisibility(8);
            m16054j0();
            return;
        }
        this.mNewUpdateLayout.setVisibility(8);
        this.mNoupdateLayout.setVisibility(0);
        this.mUpdatingLayout.setVisibility(8);
        this.mUpdateFailLayout.setVisibility(8);
        m16055k0();
    }

    /* renamed from: j0 */
    private void m16054j0() {
        this.mNewUpdateLayout.setVisibility(0);
        this.mNoupdateLayout.setVisibility(8);
        this.mUpdatingLayout.setVisibility(8);
        this.mUpdateFailLayout.setVisibility(8);
        String format = String.format(Locale.US, getText(2131755650).toString(), new Object[]{this.f10417b.mo23384N().mo29040c()});
        String format2 = String.format(Locale.US, getText(2131755651).toString(), new Object[]{this.f10419d.mo23524f()});
        this.mNewUpdateCurrentVersion.setText(format);
        this.mNewUpdateLatestVersion.setText(format2);
        this.mNewUpdateReleaseNote.setText(this.f10419d.mo23525g());
        this.mBtnUpdate.setOnClickListener(new C5036g());
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public void m16055k0() {
        this.mNewUpdateLayout.setVisibility(8);
        this.mNoupdateLayout.setVisibility(0);
        this.mUpdatingLayout.setVisibility(8);
        this.mUpdateFailLayout.setVisibility(8);
        if (this.f10417b.mo23384N() != null) {
            this.mNoUpdateCurrentVersion.setText(String.format(Locale.US, getText(2131755650).toString(), new Object[]{this.f10417b.mo23384N().mo29040c()}));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public void m16056l0() {
        this.mNewUpdateLayout.setVisibility(8);
        this.mNoupdateLayout.setVisibility(8);
        this.mUpdatingLayout.setVisibility(8);
        this.mUpdateFailLayout.setVisibility(0);
        ObjectAnimator objectAnimator = this.f10418c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.mBtnRetry.setOnClickListener(new C5037h());
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public void m16057m0() {
        this.mNewUpdateLayout.setVisibility(8);
        this.mNoupdateLayout.setVisibility(8);
        this.mUpdatingLayout.setVisibility(0);
        this.mUpdateFailLayout.setVisibility(8);
        this.mUpdatingHint.setText(2131755657);
        this.mProgressView.setImageResource(2131231487);
        ObjectAnimator objectAnimator = this.f10418c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        } else {
            this.f10426k.sendEmptyMessage(2);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mProgressView, "rotation", new float[]{0.0f, 359.0f});
        this.f10418c = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.f10418c.setDuration(1500);
        this.f10418c.setRepeatMode(1);
        this.f10418c.setRepeatCount(-1);
        this.f10418c.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public void m16058n0() {
        this.mNewUpdateLayout.setVisibility(8);
        this.mNoupdateLayout.setVisibility(8);
        this.mUpdatingLayout.setVisibility(0);
        this.mUpdateFailLayout.setVisibility(8);
        ObjectAnimator objectAnimator = this.f10418c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.mProgressView.setImageResource(2131231486);
        this.mUpdatingHint.setText(2131755654);
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onConnectionStateChanged(int i, int i2) {
        int i3;
        Handler handler;
        if (i2 == 0) {
            this.f10420e = false;
            handler = this.f10426k;
            i3 = 5;
        } else if (i2 == 1) {
            this.f10420e = true;
            return;
        } else if (i2 != 11) {
            if (i2 == 13) {
                handler = this.f10426k;
                i3 = 7;
            } else {
                return;
            }
        } else if (this.f10420e) {
            this.f10420e = false;
            handler = this.f10426k;
            i3 = 3;
        } else {
            return;
        }
        handler.sendEmptyMessage(i3);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        getWindow().addFlags(128);
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_wifi_firmware_upgrade_new);
        ButterKnife.bind((Activity) this);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f10416l, "Activity has no device id", false);
            finish();
            return;
        }
        C5972a g0 = C4257w.m11947l0().mo23668g0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f10417b = g0;
        if (g0 == null) {
            finish();
            return;
        }
        this.mTitleBar.mo32825a(getResources().getString(2131755653), new C5032c(), (View.OnClickListener) null);
        this.mTitleBar.setTitleTextSize(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.mTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        m16053i0();
        C10526e.C10531e eVar = new C10526e.C10531e(this);
        eVar.mo33358i(getText(2131755536).toString());
        eVar.mo33360k(true);
        eVar.mo33353d(-1, getResources().getString(2131755277), new C5034e());
        eVar.mo33353d(-2, getResources().getString(2131755229), new C5033d(this));
        this.f10423h = eVar.mo33351b();
        C10526e.C10531e eVar2 = new C10526e.C10531e(this);
        eVar2.mo33358i(getText(2131755535).toString());
        eVar2.mo33356g(getText(2131755522).toString());
        eVar2.mo33353d(-1, getResources().getString(2131755277), new C5035f());
        this.f10424i = eVar2.mo33351b();
        this.f10417b.mo23363A0(this, false);
        this.f10417b.mo23367C0(this.f10425j, false);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f10426k.removeCallbacksAndMessages((Object) null);
        super.onDestroy();
        mo32192M(this);
        C5972a aVar = this.f10417b;
        if (aVar != null) {
            aVar.mo23319V0(this);
            this.f10417b.mo23400W0(this.f10425j);
        }
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (!this.f10417b.mo23339p0()) {
            m16053i0();
        } else {
            m16057m0();
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
    }
}

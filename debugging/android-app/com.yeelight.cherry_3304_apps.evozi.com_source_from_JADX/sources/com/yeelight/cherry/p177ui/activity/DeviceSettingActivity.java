package com.yeelight.cherry.p177ui.activity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.yeelight.yeelib.p150c.C5980c;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6038h;
import com.yeelight.yeelib.p150c.p181l.C6122c0;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C9784e;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.activity.DeviceSettingActivity */
public class DeviceSettingActivity extends BaseActivity implements C9768c, C9770e, C9784e.C4213a {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String f10779d = DeviceSettingActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4198d f10780b;

    /* renamed from: c */
    private C5205d f10781c;
    @BindView(2131296562)
    TextView mBtnDelete;
    @BindView(2131297308)
    ScrollView mContentView;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceSettingActivity$a */
    class C5201a implements View.OnClickListener {
        C5201a() {
        }

        public void onClick(View view) {
            DeviceSettingActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceSettingActivity$b */
    class C5202b implements View.OnClickListener {

        /* renamed from: com.yeelight.cherry.ui.activity.DeviceSettingActivity$b$a */
        class C5203a implements DialogInterface.OnClickListener {
            C5203a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                DeviceSettingActivity.this.f10780b.mo23317U0();
                Intent intent = new Intent(DeviceSettingActivity.this, MainActivity.class);
                intent.addFlags(67108864);
                DeviceSettingActivity.this.startActivity(intent);
            }
        }

        C5202b() {
        }

        public void onClick(View view) {
            int i;
            DeviceSettingActivity deviceSettingActivity;
            C10526e.C10531e eVar = new C10526e.C10531e(DeviceSettingActivity.this);
            eVar.mo33358i(DeviceSettingActivity.this.getString(2131755244));
            if (DeviceSettingActivity.this.f10780b instanceof C5980c) {
                deviceSettingActivity = DeviceSettingActivity.this;
                i = 2131755705;
            } else {
                deviceSettingActivity = DeviceSettingActivity.this;
                i = 2131755435;
            }
            eVar.mo33356g(deviceSettingActivity.getString(i));
            eVar.mo33353d(-2, DeviceSettingActivity.this.getString(2131755229), (DialogInterface.OnClickListener) null);
            eVar.mo33353d(-1, DeviceSettingActivity.this.getString(2131755277), new C5203a());
            eVar.mo33359j();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceSettingActivity$c */
    class C5204c implements Runnable {
        C5204c() {
        }

        public void run() {
            DeviceSettingActivity.this.mo26385X();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceSettingActivity$d */
    private class C5205d extends Thread {

        /* renamed from: a */
        private Handler f10786a;

        /* renamed from: b */
        private List<Message> f10787b;

        /* renamed from: com.yeelight.cherry.ui.activity.DeviceSettingActivity$d$a */
        class C5206a extends Handler {
            C5206a() {
            }

            public void handleMessage(Message message) {
                if (message.what == 1) {
                    if (DeviceSettingActivity.this.f10780b.mo23379K() == null) {
                        String unused = DeviceSettingActivity.f10779d;
                        DeviceSettingActivity.this.f10780b.mo23356y0();
                        return;
                    }
                    for (C6122c0 c : DeviceSettingActivity.this.f10780b.mo23379K()) {
                        for (C6038h c2 : c.mo28007c()) {
                            c2.mo27773c(DeviceSettingActivity.this.f10780b);
                        }
                    }
                }
            }
        }

        private C5205d() {
            this.f10787b = new ArrayList();
        }

        /* synthetic */ C5205d(DeviceSettingActivity deviceSettingActivity, C5201a aVar) {
            this();
        }

        /* renamed from: b */
        public void mo26390b() {
            this.f10786a.removeCallbacksAndMessages((Object) null);
        }

        /* renamed from: c */
        public void mo26391c(int i) {
            Handler handler = this.f10786a;
            if (handler == null) {
                Message message = new Message();
                message.what = i;
                synchronized (this.f10787b) {
                    this.f10787b.add(message);
                }
                return;
            }
            handler.sendEmptyMessage(i);
        }

        /* renamed from: d */
        public void mo26392d() {
            this.f10786a.getLooper().quit();
        }

        public void run() {
            Looper.prepare();
            this.f10786a = new C5206a();
            synchronized (this.f10787b) {
                for (Message sendMessageDelayed : this.f10787b) {
                    this.f10786a.sendMessageDelayed(sendMessageDelayed, 500);
                }
                this.f10787b.clear();
            }
            Looper.loop();
        }
    }

    /* renamed from: I */
    public void mo23487I() {
        finish();
    }

    /* renamed from: X */
    public void mo26385X() {
        View p = this.f10780b.mo23417p(this);
        if (p != null) {
            this.mContentView.removeAllViews();
            this.mContentView.addView(p);
        }
    }

    /* renamed from: h */
    public void mo23488h(int i) {
    }

    /* renamed from: j */
    public void mo23489j() {
    }

    public void onConnectionStateChanged(int i, int i2) {
        if (i2 == 0) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(2131493025);
        ButterKnife.bind((Activity) this);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f10779d, "Activity has not device id", false);
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("com.yeelight.cherry.device_id");
        C4198d h0 = C4257w.m11945h0(stringExtra);
        this.f10780b = h0;
        if (h0 == null || !h0.mo23331k0()) {
            "device is null, device id: " + stringExtra;
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        this.mTitleBar.mo32825a(getString(2131755313), new C5201a(), (View.OnClickListener) null);
        this.mTitleBar.setTitleTextSize(16);
        if (this.f10780b.mo23379K() == null) {
            C4308b.m12140s(f10779d, "device feature group list is null", this.f10780b);
            this.f10780b.mo23356y0();
        } else {
            mo26385X();
        }
        C5205d dVar = new C5205d(this, (C5201a) null);
        this.f10781c = dVar;
        dVar.start();
        this.mBtnDelete.setOnClickListener(new C5202b());
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C4198d dVar = this.f10780b;
        if (dVar != null) {
            dVar.mo23418q();
        }
        C5205d dVar2 = this.f10781c;
        if (dVar2 != null) {
            dVar2.mo26390b();
            this.f10781c.mo26392d();
            this.f10781c = null;
        }
        super.onDestroy();
        mo32192M(this);
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
        this.f10781c.mo26391c(1);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C4198d dVar = this.f10780b;
        if ((dVar instanceof C6006h) || ((dVar instanceof C5980c) && ((C5980c) dVar).mo27505R1())) {
            C9784e.m23711b().mo31634j(this);
        }
        this.f10780b.mo23358z0(this);
        this.f10780b.mo23365B0(this);
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == 256) {
            runOnUiThread(new C5204c());
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C9784e.m23711b().mo31636m(this);
        this.f10780b.mo23319V0(this);
        this.f10780b.mo23400W0(this);
    }

    /* renamed from: v */
    public void mo23490v() {
    }
}

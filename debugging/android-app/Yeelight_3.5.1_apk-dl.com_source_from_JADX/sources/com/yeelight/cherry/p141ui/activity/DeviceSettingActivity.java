package com.yeelight.cherry.p141ui.activity;

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
import com.yeelight.yeelib.device.C6119c;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.C8272e;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.List;
import p051j4.C9193k;
import p170i4.C9113d;
import p215u3.C10507u;
import p237z3.C12143c;
import p237z3.C12145e;

/* renamed from: com.yeelight.cherry.ui.activity.DeviceSettingActivity */
public class DeviceSettingActivity extends BaseActivity implements C12143c, C12145e, C8272e.C3063a {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final String f10341c = "DeviceSettingActivity";

    /* renamed from: d */
    public static final /* synthetic */ int f10342d = 0;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C3010c f10343a;

    /* renamed from: b */
    private C5254d f10344b;
    @BindView(2131296638)
    TextView mBtnDelete;
    @BindView(2131297451)
    ScrollView mContentView;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceSettingActivity$a */
    class C5250a implements View.OnClickListener {
        C5250a() {
        }

        public void onClick(View view) {
            DeviceSettingActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceSettingActivity$b */
    class C5251b implements View.OnClickListener {

        /* renamed from: com.yeelight.cherry.ui.activity.DeviceSettingActivity$b$a */
        class C5252a implements DialogInterface.OnClickListener {
            C5252a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                DeviceSettingActivity.this.f10343a.mo23131U0();
                Intent intent = new Intent(DeviceSettingActivity.this, MainActivity.class);
                intent.addFlags(67108864);
                DeviceSettingActivity.this.startActivity(intent);
            }
        }

        C5251b() {
        }

        public void onClick(View view) {
            int i;
            DeviceSettingActivity deviceSettingActivity;
            C9113d.C9118e eVar = new C9113d.C9118e(DeviceSettingActivity.this);
            C9113d.C9118e i2 = eVar.mo37179i(DeviceSettingActivity.this.getString(2131755247));
            if (DeviceSettingActivity.this.f10343a instanceof C6119c) {
                deviceSettingActivity = DeviceSettingActivity.this;
                i = 2131755713;
            } else {
                deviceSettingActivity = DeviceSettingActivity.this;
                i = 2131755439;
            }
            i2.mo37177g(deviceSettingActivity.getString(i)).mo37174d(-2, DeviceSettingActivity.this.getString(2131755232), (DialogInterface.OnClickListener) null).mo37174d(-1, DeviceSettingActivity.this.getString(2131755281), new C5252a());
            eVar.mo37180j();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceSettingActivity$c */
    class C5253c implements Runnable {
        C5253c() {
        }

        public void run() {
            DeviceSettingActivity.this.mo30421X();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeviceSettingActivity$d */
    private class C5254d extends Thread {

        /* renamed from: a */
        private Handler f10349a;

        /* renamed from: b */
        private List<Message> f10350b;

        /* renamed from: com.yeelight.cherry.ui.activity.DeviceSettingActivity$d$a */
        class C5255a extends Handler {
            C5255a() {
            }

            public void handleMessage(Message message) {
                if (message.what == 1) {
                    if (DeviceSettingActivity.this.f10343a.mo23192K() == null) {
                        String unused = DeviceSettingActivity.f10341c;
                        DeviceSettingActivity.this.f10343a.mo23169y0();
                        return;
                    }
                    for (C10507u c : DeviceSettingActivity.this.f10343a.mo23192K()) {
                        for (C6093d c2 : c.mo42176c()) {
                            c2.mo31683c(DeviceSettingActivity.this.f10343a);
                        }
                    }
                }
            }
        }

        private C5254d() {
            this.f10350b = new ArrayList();
        }

        /* synthetic */ C5254d(DeviceSettingActivity deviceSettingActivity, C5250a aVar) {
            this();
        }

        /* renamed from: b */
        public void mo30426b() {
            this.f10349a.removeCallbacksAndMessages((Object) null);
        }

        /* renamed from: c */
        public void mo30427c(int i) {
            Handler handler = this.f10349a;
            if (handler == null) {
                Message message = new Message();
                message.what = i;
                synchronized (this.f10350b) {
                    this.f10350b.add(message);
                }
                return;
            }
            handler.sendEmptyMessage(i);
        }

        /* renamed from: d */
        public void mo30428d() {
            this.f10349a.getLooper().quit();
        }

        public void run() {
            Looper.prepare();
            this.f10349a = new C5255a();
            synchronized (this.f10350b) {
                for (Message sendMessageDelayed : this.f10350b) {
                    this.f10349a.sendMessageDelayed(sendMessageDelayed, 500);
                }
                this.f10350b.clear();
            }
            Looper.loop();
        }
    }

    /* renamed from: I */
    public void mo23265I() {
        finish();
    }

    /* renamed from: X */
    public void mo30421X() {
        View p = this.f10343a.mo23231p(this);
        if (p != null) {
            this.mContentView.removeAllViews();
            this.mContentView.addView(p);
        }
    }

    /* renamed from: i */
    public void mo23294i(int i) {
    }

    /* renamed from: j */
    public void mo23296j() {
    }

    public void onConnectionStateChanged(int i, int i2) {
        if (i2 == 0) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(2131493027);
        ButterKnife.bind((Activity) this);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f10341c, "Activity has not device id", false);
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("com.yeelight.cherry.device_id");
        C3010c j0 = YeelightDeviceManager.m7794j0(stringExtra);
        this.f10343a = j0;
        if (j0 == null || !j0.mo23145k0()) {
            StringBuilder sb = new StringBuilder();
            sb.append("device is null, device id: ");
            sb.append(stringExtra);
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        this.mTitleBar.mo36195a(getString(2131755317), new C5250a(), (View.OnClickListener) null);
        this.mTitleBar.setTitleTextSize(16);
        if (this.f10343a.mo23192K() == null) {
            AppUtils.m8301v(f10341c, "device feature group list is null", this.f10343a);
            this.f10343a.mo23169y0();
        } else {
            mo30421X();
        }
        C5254d dVar = new C5254d(this, (C5250a) null);
        this.f10344b = dVar;
        dVar.start();
        this.mBtnDelete.setOnClickListener(new C5251b());
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C3010c cVar = this.f10343a;
        if (cVar != null) {
            cVar.mo23232q();
        }
        C5254d dVar = this.f10344b;
        if (dVar != null) {
            dVar.mo30426b();
            this.f10344b.mo30428d();
            this.f10344b = null;
        }
        super.onDestroy();
        mo35652M(this);
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
        this.f10344b.mo30427c(1);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C3010c cVar = this.f10343a;
        if ((cVar instanceof WifiDeviceBase) || ((cVar instanceof C6119c) && ((C6119c) cVar).mo31760R1())) {
            C8272e.m19511b().mo35210j(this);
        }
        this.f10343a.mo23171z0(this);
        this.f10343a.mo23178B0(this);
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == 256) {
            runOnUiThread(new C5253c());
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C8272e.m19511b().mo35212m(this);
        this.f10343a.mo23133V0(this);
        this.f10343a.mo23213W0(this);
    }

    /* renamed from: v */
    public void mo23318v() {
    }
}

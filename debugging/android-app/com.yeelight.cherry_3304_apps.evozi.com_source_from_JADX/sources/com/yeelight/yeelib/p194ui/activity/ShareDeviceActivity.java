package com.yeelight.yeelib.p194ui.activity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Vibrator;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p150c.C5972a;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.service.ShareDevice;
import com.yeelight.yeelib.service.YeelightUpnpService;
import com.yeelight.yeelib.utils.C4308b;
import p164h.p165b.p166a.p167g.C11206a;
import p164h.p165b.p166a.p169j.C11435a;
import p164h.p165b.p166a.p169j.C4432d;
import p164h.p165b.p166a.p236e.C11170c;
import p164h.p165b.p166a.p240h.p241p.C11228b;
import p164h.p165b.p166a.p240h.p241p.C11232f;
import p164h.p165b.p166a.p240h.p243r.C11252j;
import p164h.p165b.p166a.p240h.p248s.C11327g;
import p164h.p165b.p166a.p240h.p248s.C11332l;
import p164h.p165b.p166a.p240h.p248s.C11333m;
import p164h.p165b.p166a.p240h.p248s.C11334n;

/* renamed from: com.yeelight.yeelib.ui.activity.ShareDeviceActivity */
public class ShareDeviceActivity extends BaseActivity implements SensorEventListener {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final String f18914l = ShareDeviceActivity.class.getSimpleName();

    /* renamed from: b */
    CommonTitleBar f18915b;

    /* renamed from: c */
    TextView f18916c;

    /* renamed from: d */
    TextView f18917d;

    /* renamed from: e */
    private C5972a f18918e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C11332l f18919f;

    /* renamed from: g */
    public C11170c f18920g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C10224f f18921h = new C10224f();

    /* renamed from: i */
    SensorManager f18922i = null;

    /* renamed from: j */
    Vibrator f18923j = null;

    /* renamed from: k */
    private ServiceConnection f18924k = new C10215a();

    /* renamed from: com.yeelight.yeelib.ui.activity.ShareDeviceActivity$a */
    class C10215a implements ServiceConnection {
        C10215a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            String unused = ShareDeviceActivity.f18914l;
            C11170c cVar = (C11170c) iBinder;
            ShareDeviceActivity.this.f18920g = cVar;
            cVar.getRegistry().mo24429t(ShareDeviceActivity.this.f18921h);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            String unused = ShareDeviceActivity.f18914l;
            ShareDeviceActivity.this.f18920g = null;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.ShareDeviceActivity$b */
    class C10216b implements View.OnClickListener {
        C10216b() {
        }

        public void onClick(View view) {
            ShareDeviceActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.ShareDeviceActivity$c */
    class C10217c implements View.OnClickListener {

        /* renamed from: com.yeelight.yeelib.ui.activity.ShareDeviceActivity$c$a */
        class C10218a implements Runnable {
            C10218a() {
            }

            public void run() {
                ShareDeviceActivity shareDeviceActivity = ShareDeviceActivity.this;
                shareDeviceActivity.mo32520b0(shareDeviceActivity.f18919f);
            }
        }

        C10217c() {
        }

        public void onClick(View view) {
            if (ShareDeviceActivity.this.f18919f != null) {
                ShareDeviceActivity.this.runOnUiThread(new C10218a());
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.ShareDeviceActivity$d */
    class C10219d extends C11206a {

        /* renamed from: com.yeelight.yeelib.ui.activity.ShareDeviceActivity$d$a */
        class C10220a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C11228b f18930a;

            C10220a(C11228b bVar) {
                this.f18930a = bVar;
            }

            public void run() {
                ShareDeviceActivity.this.f18917d.setVisibility(0);
                ShareDeviceActivity.this.f18916c.setText(this.f18930a.toString());
            }
        }

        C10219d(C11232f fVar) {
            super(fVar);
        }

        /* renamed from: d */
        public void mo28122d(C11232f fVar, C11252j jVar, String str) {
            String unused = ShareDeviceActivity.f18914l;
        }

        /* renamed from: g */
        public void mo28123g(C11232f fVar) {
            String unused = ShareDeviceActivity.f18914l;
            C11228b g = fVar.mo35706g(ShareDevice.sUserIdOutputArgument);
            String unused2 = ShareDeviceActivity.f18914l;
            "UserAccount, ActionArgumentValue: " + g.toString();
            ShareDeviceActivity.this.runOnUiThread(new C10220a(g));
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.ShareDeviceActivity$e */
    class C10221e extends C11206a {

        /* renamed from: com.yeelight.yeelib.ui.activity.ShareDeviceActivity$e$a */
        class C10222a implements Runnable {
            C10222a() {
            }

            public void run() {
                ShareDeviceActivity shareDeviceActivity = ShareDeviceActivity.this;
                Toast.makeText(shareDeviceActivity, shareDeviceActivity.getString(R$string.toast_share_device_success), 0);
                ShareDeviceActivity.this.finish();
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.ShareDeviceActivity$e$b */
        class C10223b implements Runnable {
            C10223b(C10221e eVar) {
            }

            public void run() {
            }
        }

        C10221e(C11232f fVar) {
            super(fVar);
        }

        /* renamed from: d */
        public void mo28122d(C11232f fVar, C11252j jVar, String str) {
            String unused = ShareDeviceActivity.f18914l;
            "shareDeviceToRemoteUser failure, msg: " + str;
            ShareDeviceActivity.this.runOnUiThread(new C10223b(this));
        }

        /* renamed from: g */
        public void mo28123g(C11232f fVar) {
            String unused = ShareDeviceActivity.f18914l;
            ShareDeviceActivity.this.runOnUiThread(new C10222a());
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.ShareDeviceActivity$f */
    protected class C10224f extends C11435a {

        /* renamed from: com.yeelight.yeelib.ui.activity.ShareDeviceActivity$f$a */
        class C10225a extends C11206a {

            /* renamed from: c */
            final /* synthetic */ C11332l f18935c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10225a(C11232f fVar, C11332l lVar) {
                super(fVar);
                this.f18935c = lVar;
            }

            /* renamed from: d */
            public void mo28122d(C11232f fVar, C11252j jVar, String str) {
                String unused = ShareDeviceActivity.f18914l;
            }

            /* renamed from: g */
            public void mo28123g(C11232f fVar) {
                String unused = ShareDeviceActivity.f18914l;
                C11228b g = fVar.mo35706g(ShareDevice.sShakingOutputArgument);
                String unused2 = ShareDeviceActivity.f18914l;
                "DeviceShaking, ActionArgumentValue: " + g.toString();
                if (g.toString().equals(TimerCodec.ENABLE)) {
                    String unused3 = ShareDeviceActivity.f18914l;
                    C11332l unused4 = ShareDeviceActivity.this.f18919f = this.f18935c;
                    ShareDeviceActivity.this.mo32518Z(this.f18935c);
                }
            }
        }

        protected C10224f() {
        }

        /* renamed from: c */
        public void mo31713c(C4432d dVar, C11327g gVar) {
            String unused = ShareDeviceActivity.f18914l;
        }

        /* renamed from: d */
        public void mo31714d(C4432d dVar, C11327g gVar) {
            String unused = ShareDeviceActivity.f18914l;
        }

        /* renamed from: e */
        public void mo31715e(C4432d dVar, C11332l lVar) {
            String unused = ShareDeviceActivity.f18914l;
        }

        /* renamed from: f */
        public void mo31716f(C4432d dVar, C11332l lVar, Exception exc) {
            String unused = ShareDeviceActivity.f18914l;
        }

        /* renamed from: g */
        public void mo31717g(C4432d dVar, C11332l lVar) {
            String unused = ShareDeviceActivity.f18914l;
        }

        /* renamed from: i */
        public void mo31718i(C4432d dVar, C11332l lVar) {
            String unused = ShareDeviceActivity.f18914l;
            "###################remoteDeviceAdded, device id: " + ((C11333m) lVar.mo35899p()).toString();
            C11334n a0 = ShareDeviceActivity.this.mo32519a0(lVar);
            if (a0 != null) {
                ShareDeviceActivity.this.f18920g.getControlPoint().mo24372a(new C10225a(new C11232f(a0.mo35980a(ShareDevice.sGetShakingActionName)), lVar));
            }
        }
    }

    /* renamed from: Z */
    public void mo32518Z(C11332l lVar) {
        this.f18920g.getControlPoint().mo24372a(new C10219d(new C11232f(mo32519a0(lVar).mo35980a(ShareDevice.sGetUserIdActionName))));
    }

    /* renamed from: a0 */
    public C11334n mo32519a0(C11332l lVar) {
        for (C11334n nVar : lVar.mo35902s()) {
            if (nVar.mo35985f().toString().contains(ShareDevice.sShareDeviceServiceID)) {
                return nVar;
            }
        }
        return null;
    }

    /* renamed from: b0 */
    public void mo32520b0(C11332l lVar) {
        C11232f fVar = new C11232f(mo32519a0(lVar).mo35980a("SetDeviceId"));
        fVar.mo35710k("NewDeviceIdValue", this.f18918e.mo23372G());
        "shareDeviceToRemoteUser, device id: " + this.f18918e.mo23372G();
        this.f18920g.getControlPoint().mo24372a(new C10221e(fVar));
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        setContentView(R$layout.activity_share_device);
        this.f18915b = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f18916c = (TextView) findViewById(R$id.text_view_state);
        this.f18917d = (TextView) findViewById(R$id.confirm_share_device);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18914l, "Activity has not device id", false);
            finish();
            return;
        }
        C5972a g0 = C4257w.m11947l0().mo23668g0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f18918e = g0;
        if (g0 == null) {
            finish();
            return;
        }
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f18915b = commonTitleBar;
        commonTitleBar.mo32825a(getString(R$string.feature_share_device), new C10216b(), (View.OnClickListener) null);
        this.f18915b.setTitleTextSize(16);
        this.f18917d.setOnClickListener(new C10217c());
        C4297y.f7456e.bindService(new Intent(C4297y.f7456e, YeelightUpnpService.class), this.f18924k, 1);
        this.f18922i = (SensorManager) getSystemService("sensor");
        this.f18923j = (Vibrator) getSystemService("vibrator");
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C11170c cVar = this.f18920g;
        if (cVar != null) {
            cVar.getRegistry().mo24412e(this.f18921h);
        }
        getApplicationContext().unbindService(this.f18924k);
    }

    public void onPause() {
        super.onPause();
        this.f18922i.unregisterListener(this);
    }

    public void onResume() {
        super.onResume();
        SensorManager sensorManager = this.f18922i;
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(1), 3);
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        int type = sensorEvent.sensor.getType();
        float[] fArr = sensorEvent.values;
        if (type != 1) {
            return;
        }
        if (Math.abs(fArr[0]) > 17.0f || Math.abs(fArr[1]) > 17.0f || Math.abs(fArr[2]) > 17.0f) {
            "============ values[0] = " + fArr[0];
            "============ values[1] = " + fArr[1];
            "============ values[2] = " + fArr[2];
            this.f18923j.vibrate(500);
        }
    }
}

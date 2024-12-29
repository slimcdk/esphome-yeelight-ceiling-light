package com.yeelight.yeelib.p142ui.activity;

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
import com.yeelight.yeelib.device.C6081a;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.service.ShareDevice;
import com.yeelight.yeelib.service.YeelightUpnpService;
import com.yeelight.yeelib.utils.AppUtils;
import org.fourthline.cling.android.C10006c;
import org.fourthline.cling.model.message.UpnpResponse;
import p074n6.C9738a;
import p127a7.C3982a;
import p127a7.C3983b;
import p193o6.C9790b;
import p193o6.C9792d;
import p214t6.C10403c;
import p214t6.C10407g;
import p214t6.C10408h;
import p214t6.C10409i;

/* renamed from: com.yeelight.yeelib.ui.activity.ShareDeviceActivity */
public class ShareDeviceActivity extends BaseActivity implements SensorEventListener {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final String f15222k = ShareDeviceActivity.class.getSimpleName();

    /* renamed from: a */
    CommonTitleBar f15223a;

    /* renamed from: b */
    TextView f15224b;

    /* renamed from: c */
    TextView f15225c;

    /* renamed from: d */
    private C6081a f15226d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C10407g f15227e;

    /* renamed from: f */
    public C10006c f15228f = null;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C8642f f15229g = new C8642f();

    /* renamed from: h */
    SensorManager f15230h = null;

    /* renamed from: i */
    Vibrator f15231i = null;

    /* renamed from: j */
    private ServiceConnection f15232j = new C8633a();

    /* renamed from: com.yeelight.yeelib.ui.activity.ShareDeviceActivity$a */
    class C8633a implements ServiceConnection {
        C8633a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            String unused = ShareDeviceActivity.f15222k;
            C10006c cVar = (C10006c) iBinder;
            ShareDeviceActivity.this.f15228f = cVar;
            cVar.getRegistry().mo24958u(ShareDeviceActivity.this.f15229g);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            String unused = ShareDeviceActivity.f15222k;
            ShareDeviceActivity.this.f15228f = null;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.ShareDeviceActivity$b */
    class C8634b implements View.OnClickListener {
        C8634b() {
        }

        public void onClick(View view) {
            ShareDeviceActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.ShareDeviceActivity$c */
    class C8635c implements View.OnClickListener {

        /* renamed from: com.yeelight.yeelib.ui.activity.ShareDeviceActivity$c$a */
        class C8636a implements Runnable {
            C8636a() {
            }

            public void run() {
                ShareDeviceActivity shareDeviceActivity = ShareDeviceActivity.this;
                shareDeviceActivity.mo35941b0(shareDeviceActivity.f15227e);
            }
        }

        C8635c() {
        }

        public void onClick(View view) {
            if (ShareDeviceActivity.this.f15227e != null) {
                ShareDeviceActivity.this.runOnUiThread(new C8636a());
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.ShareDeviceActivity$d */
    class C8637d extends C9738a {

        /* renamed from: com.yeelight.yeelib.ui.activity.ShareDeviceActivity$d$a */
        class C8638a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C9790b f15238a;

            C8638a(C9790b bVar) {
                this.f15238a = bVar;
            }

            public void run() {
                ShareDeviceActivity.this.f15225c.setVisibility(0);
                ShareDeviceActivity.this.f15224b.setText(this.f15238a.toString());
            }
        }

        C8637d(C9792d dVar) {
            super(dVar);
        }

        /* renamed from: d */
        public void mo35278d(C9792d dVar, UpnpResponse upnpResponse, String str) {
            String unused = ShareDeviceActivity.f15222k;
        }

        /* renamed from: g */
        public void mo35279g(C9792d dVar) {
            String unused = ShareDeviceActivity.f15222k;
            C9790b g = dVar.mo38973g(ShareDevice.sUserIdOutputArgument);
            String unused2 = ShareDeviceActivity.f15222k;
            StringBuilder sb = new StringBuilder();
            sb.append("UserAccount, ActionArgumentValue: ");
            sb.append(g.toString());
            ShareDeviceActivity.this.runOnUiThread(new C8638a(g));
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.ShareDeviceActivity$e */
    class C8639e extends C9738a {

        /* renamed from: com.yeelight.yeelib.ui.activity.ShareDeviceActivity$e$a */
        class C8640a implements Runnable {
            C8640a() {
            }

            public void run() {
                ShareDeviceActivity shareDeviceActivity = ShareDeviceActivity.this;
                Toast.makeText(shareDeviceActivity, shareDeviceActivity.getString(R$string.toast_share_device_success), 0);
                ShareDeviceActivity.this.finish();
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.ShareDeviceActivity$e$b */
        class C8641b implements Runnable {
            C8641b(C8639e eVar) {
            }

            public void run() {
            }
        }

        C8639e(C9792d dVar) {
            super(dVar);
        }

        /* renamed from: d */
        public void mo35278d(C9792d dVar, UpnpResponse upnpResponse, String str) {
            String unused = ShareDeviceActivity.f15222k;
            StringBuilder sb = new StringBuilder();
            sb.append("shareDeviceToRemoteUser failure, msg: ");
            sb.append(str);
            ShareDeviceActivity.this.runOnUiThread(new C8641b(this));
        }

        /* renamed from: g */
        public void mo35279g(C9792d dVar) {
            String unused = ShareDeviceActivity.f15222k;
            ShareDeviceActivity.this.runOnUiThread(new C8640a());
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.ShareDeviceActivity$f */
    protected class C8642f extends C3982a {

        /* renamed from: com.yeelight.yeelib.ui.activity.ShareDeviceActivity$f$a */
        class C8643a extends C9738a {

            /* renamed from: c */
            final /* synthetic */ C10407g f15243c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C8643a(C9792d dVar, C10407g gVar) {
                super(dVar);
                this.f15243c = gVar;
            }

            /* renamed from: d */
            public void mo35278d(C9792d dVar, UpnpResponse upnpResponse, String str) {
                String unused = ShareDeviceActivity.f15222k;
            }

            /* renamed from: g */
            public void mo35279g(C9792d dVar) {
                String unused = ShareDeviceActivity.f15222k;
                C9790b g = dVar.mo38973g(ShareDevice.sShakingOutputArgument);
                String unused2 = ShareDeviceActivity.f15222k;
                StringBuilder sb = new StringBuilder();
                sb.append("DeviceShaking, ActionArgumentValue: ");
                sb.append(g.toString());
                if (g.toString().equals(TimerCodec.ENABLE)) {
                    String unused3 = ShareDeviceActivity.f15222k;
                    C10407g unused4 = ShareDeviceActivity.this.f15227e = this.f15243c;
                    ShareDeviceActivity.this.mo35939Z(this.f15243c);
                }
            }
        }

        protected C8642f() {
        }

        /* renamed from: a */
        public void mo26556a(C3983b bVar, C10403c cVar) {
            String unused = ShareDeviceActivity.f15222k;
        }

        /* renamed from: b */
        public void mo26557b(C3983b bVar, C10407g gVar) {
            String unused = ShareDeviceActivity.f15222k;
        }

        /* renamed from: c */
        public void mo26558c(C3983b bVar, C10403c cVar) {
            String unused = ShareDeviceActivity.f15222k;
        }

        /* renamed from: d */
        public void mo26559d(C3983b bVar, C10407g gVar) {
            String unused = ShareDeviceActivity.f15222k;
            StringBuilder sb = new StringBuilder();
            sb.append("###################remoteDeviceAdded, device id: ");
            sb.append(((C10408h) gVar.mo40506p()).toString());
            C10409i a0 = ShareDeviceActivity.this.mo35940a0(gVar);
            if (a0 != null) {
                ShareDeviceActivity.this.f15228f.getControlPoint().mo24152b(new C8643a(new C9792d(a0.mo40528a(ShareDevice.sGetShakingActionName)), gVar));
            }
        }

        /* renamed from: g */
        public void mo26560g(C3983b bVar, C10407g gVar, Exception exc) {
            String unused = ShareDeviceActivity.f15222k;
        }

        /* renamed from: i */
        public void mo26561i(C3983b bVar, C10407g gVar) {
            String unused = ShareDeviceActivity.f15222k;
        }
    }

    /* renamed from: Z */
    public void mo35939Z(C10407g gVar) {
        this.f15228f.getControlPoint().mo24152b(new C8637d(new C9792d(mo35940a0(gVar).mo40528a(ShareDevice.sGetUserIdActionName))));
    }

    /* renamed from: a0 */
    public C10409i mo35940a0(C10407g gVar) {
        for (C10409i iVar : gVar.mo40509s()) {
            if (iVar.mo40533f().toString().contains(ShareDevice.sShareDeviceServiceID)) {
                return iVar;
            }
        }
        return null;
    }

    /* renamed from: b0 */
    public void mo35941b0(C10407g gVar) {
        C9792d dVar = new C9792d(mo35940a0(gVar).mo40528a("SetDeviceId"));
        dVar.mo38977k("NewDeviceIdValue", this.f15226d.mo23185G());
        StringBuilder sb = new StringBuilder();
        sb.append("shareDeviceToRemoteUser, device id: ");
        sb.append(this.f15226d.mo23185G());
        this.f15228f.getControlPoint().mo24152b(new C8639e(dVar));
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        setContentView(R$layout.activity_share_device);
        int i = R$id.title_bar;
        this.f15223a = (CommonTitleBar) findViewById(i);
        this.f15224b = (TextView) findViewById(R$id.text_view_state);
        this.f15225c = (TextView) findViewById(R$id.confirm_share_device);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f15222k, "Activity has not device id", false);
            finish();
            return;
        }
        C6081a i0 = YeelightDeviceManager.m7800o0().mo23295i0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f15226d = i0;
        if (i0 == null) {
            finish();
            return;
        }
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(i);
        this.f15223a = commonTitleBar;
        commonTitleBar.mo36195a(getString(R$string.feature_share_device), new C8634b(), (View.OnClickListener) null);
        this.f15223a.setTitleTextSize(16);
        this.f15225c.setOnClickListener(new C8635c());
        C3108x.f4951e.bindService(new Intent(C3108x.f4951e, YeelightUpnpService.class), this.f15232j, 1);
        this.f15230h = (SensorManager) getSystemService("sensor");
        this.f15231i = (Vibrator) getSystemService("vibrator");
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C10006c cVar = this.f15228f;
        if (cVar != null) {
            cVar.getRegistry().mo24963z(this.f15229g);
        }
        getApplicationContext().unbindService(this.f15232j);
    }

    public void onPause() {
        super.onPause();
        this.f15230h.unregisterListener(this);
    }

    public void onResume() {
        super.onResume();
        SensorManager sensorManager = this.f15230h;
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(1), 3);
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        int type = sensorEvent.sensor.getType();
        float[] fArr = sensorEvent.values;
        if (type != 1) {
            return;
        }
        if (Math.abs(fArr[0]) > 17.0f || Math.abs(fArr[1]) > 17.0f || Math.abs(fArr[2]) > 17.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append("============ values[0] = ");
            sb.append(fArr[0]);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("============ values[1] = ");
            sb2.append(fArr[1]);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("============ values[2] = ");
            sb3.append(fArr[2]);
            this.f15231i.vibrate(500);
        }
    }
}

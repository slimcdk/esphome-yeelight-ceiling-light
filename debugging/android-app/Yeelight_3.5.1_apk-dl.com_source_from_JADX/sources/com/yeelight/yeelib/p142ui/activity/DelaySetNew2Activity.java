package com.yeelight.yeelib.p142ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yeelight.yeelib.R$array;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.C6081a;
import com.yeelight.yeelib.device.C6119c;
import com.yeelight.yeelib.device.C6169f;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C6100g;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.widget.WheelPicker;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.Arrays;
import java.util.List;
import p051j4.C9193k;
import p150e4.C8979h;
import p150e4.C8980i;
import p150e4.C8981j;
import p232y3.C12041e;
import p237z3.C12143c;
import p237z3.C12145e;

/* renamed from: com.yeelight.yeelib.ui.activity.DelaySetNew2Activity */
public class DelaySetNew2Activity extends BaseActivity implements C12145e, C12143c {
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final String f14536p = "DelaySetNew2Activity";

    /* renamed from: a */
    ImageView f14537a;

    /* renamed from: b */
    FrameLayout f14538b;

    /* renamed from: c */
    ViewGroup f14539c;

    /* renamed from: d */
    WheelPicker f14540d;

    /* renamed from: e */
    WheelPicker f14541e;

    /* renamed from: f */
    TextView f14542f;

    /* renamed from: g */
    TextView f14543g;

    /* renamed from: h */
    TextView f14544h;

    /* renamed from: i */
    TextView f14545i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C3010c f14546j;

    /* renamed from: k */
    int f14547k = 0;

    /* renamed from: l */
    int f14548l = 0;

    /* renamed from: m */
    private List<String> f14549m;

    /* renamed from: n */
    private List<String> f14550n;

    /* renamed from: o */
    private Handler f14551o = new C8401d();

    /* renamed from: com.yeelight.yeelib.ui.activity.DelaySetNew2Activity$a */
    class C8397a implements View.OnClickListener {
        C8397a() {
        }

        public void onClick(View view) {
            DelaySetNew2Activity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DelaySetNew2Activity$b */
    class C8398b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C12041e f14553a;

        C8398b(C12041e eVar) {
            this.f14553a = eVar;
        }

        public void onClick(View view) {
            String unused = DelaySetNew2Activity.f14536p;
            this.f14553a.mo42681e(0);
            DelaySetNew2Activity.this.f14546j.mo23166x(14, this.f14553a);
            DelaySetNew2Activity.this.m20038e0(this.f14553a);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DelaySetNew2Activity$c */
    class C8399c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C12041e f14555a;

        /* renamed from: com.yeelight.yeelib.ui.activity.DelaySetNew2Activity$c$a */
        class C8400a implements Runnable {
            C8400a() {
            }

            public void run() {
                DelaySetNew2Activity delaySetNew2Activity = DelaySetNew2Activity.this;
                int i = (delaySetNew2Activity.f14548l * 60) + delaySetNew2Activity.f14547k;
                if (i <= 0) {
                    delaySetNew2Activity.mo35655S(R$string.feature_delay_time_hint);
                }
                C8399c.this.f14555a.mo42682f(i);
                C8399c.this.f14555a.mo42681e(i);
                DelaySetNew2Activity.this.f14546j.mo23166x(10, C8399c.this.f14555a);
                if ((DelaySetNew2Activity.this.f14546j instanceof WifiDeviceBase) || (DelaySetNew2Activity.this.f14546j instanceof C6100g)) {
                    DelaySetNew2Activity.this.f14546j.mo23186G0(i);
                    DeviceDataProvider.m17615a0(DelaySetNew2Activity.this.f14546j);
                } else if (DelaySetNew2Activity.this.f14546j instanceof C6169f) {
                    DelaySetNew2Activity.this.f14546j.mo23186G0(i);
                    DeviceDataProvider.m17623e0(((C6169f) DelaySetNew2Activity.this.f14546j).mo31875c2());
                } else if (DelaySetNew2Activity.this.f14546j instanceof C6119c) {
                    DelaySetNew2Activity.this.f14546j.mo23186G0(i);
                    DeviceDataProvider.m17621d0((C6119c) DelaySetNew2Activity.this.f14546j);
                }
            }
        }

        C8399c(C12041e eVar) {
            this.f14555a = eVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0039, code lost:
            if ((com.yeelight.yeelib.p142ui.activity.DelaySetNew2Activity.m20033Z(r4.f14556b) instanceof p223w3.C11627r) != false) goto L_0x003d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r5) {
            /*
                r4 = this;
                com.yeelight.yeelib.ui.activity.DelaySetNew2Activity r5 = com.yeelight.yeelib.p142ui.activity.DelaySetNew2Activity.this
                com.yeelight.yeelib.device.base.c r5 = r5.f14546j
                boolean r5 = r5 instanceof com.yeelight.yeelib.device.C6119c
                r0 = 1000(0x3e8, float:1.401E-42)
                if (r5 == 0) goto L_0x0018
                com.yeelight.yeelib.ui.activity.DelaySetNew2Activity r5 = com.yeelight.yeelib.p142ui.activity.DelaySetNew2Activity.this
                com.yeelight.yeelib.device.base.c r5 = r5.f14546j
                com.yeelight.yeelib.device.c r5 = (com.yeelight.yeelib.device.C6119c) r5
                r5.mo23148l1()
                goto L_0x003d
            L_0x0018:
                com.yeelight.yeelib.ui.activity.DelaySetNew2Activity r5 = com.yeelight.yeelib.p142ui.activity.DelaySetNew2Activity.this
                com.yeelight.yeelib.device.base.c r5 = r5.f14546j
                com.yeelight.yeelib.device.base.e r5 = (com.yeelight.yeelib.device.base.C3012e) r5
                boolean r5 = r5.mo23146k1()
                if (r5 != 0) goto L_0x003c
                com.yeelight.yeelib.ui.activity.DelaySetNew2Activity r5 = com.yeelight.yeelib.p142ui.activity.DelaySetNew2Activity.this
                com.yeelight.yeelib.device.base.c r5 = r5.f14546j
                com.yeelight.yeelib.device.base.e r5 = (com.yeelight.yeelib.device.base.C3012e) r5
                r5.mo23148l1()
                com.yeelight.yeelib.ui.activity.DelaySetNew2Activity r5 = com.yeelight.yeelib.p142ui.activity.DelaySetNew2Activity.this
                com.yeelight.yeelib.device.base.c r5 = r5.f14546j
                boolean r5 = r5 instanceof p223w3.C11627r
                if (r5 == 0) goto L_0x003c
                goto L_0x003d
            L_0x003c:
                r0 = 0
            L_0x003d:
                android.os.Handler r5 = new android.os.Handler
                r5.<init>()
                com.yeelight.yeelib.ui.activity.DelaySetNew2Activity$c$a r1 = new com.yeelight.yeelib.ui.activity.DelaySetNew2Activity$c$a
                r1.<init>()
                long r2 = (long) r0
                r5.postDelayed(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p142ui.activity.DelaySetNew2Activity.C8399c.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DelaySetNew2Activity$d */
    class C8401d extends Handler {
        C8401d() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0 && (DelaySetNew2Activity.this.f14546j instanceof C6081a)) {
                DelaySetNew2Activity.this.f14546j.mo23166x(2, (Object) null);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public /* synthetic */ void m20036c0(WheelPicker wheelPicker, Object obj, int i) {
        List<String> list;
        WheelPicker wheelPicker2;
        this.f14548l = i;
        if (12 == i) {
            this.f14547k = 0;
            wheelPicker2 = this.f14540d;
            list = this.f14550n;
        } else {
            List<String> data = this.f14540d.getData();
            list = this.f14549m;
            if (data != list) {
                wheelPicker2 = this.f14540d;
            } else {
                return;
            }
        }
        wheelPicker2.setData(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public /* synthetic */ void m20037d0(WheelPicker wheelPicker, Object obj, int i) {
        this.f14547k = i;
        StringBuilder sb = new StringBuilder();
        sb.append("mMinPickerView: hour: ");
        sb.append(this.f14548l);
        sb.append("    minutes: ");
        sb.append(this.f14547k);
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public void m20038e0(C12041e eVar) {
        this.f14538b.setVisibility(0);
        this.f14539c.setVisibility(4);
        this.f14544h.setText(R$string.common_text_start);
        this.f14541e.mo36586l(this.f14548l, false);
        this.f14541e.setOnItemSelectedListener(new C8979h(this));
        this.f14540d.mo36586l(this.f14547k, false);
        this.f14540d.setOnItemSelectedListener(new C8980i(this));
        this.f14544h.setOnClickListener(new C8399c(eVar));
    }

    /* renamed from: f0 */
    private void m20039f0(C12041e eVar) {
        this.f14538b.setVisibility(4);
        this.f14539c.setVisibility(0);
        this.f14544h.setText(R$string.common_text_stop);
        this.f14541e.mo36586l(this.f14548l, false);
        this.f14540d.mo36586l(this.f14547k, false);
        this.f14542f.setText(String.valueOf(eVar.mo42677a() % 60));
        this.f14543g.setText(String.valueOf(eVar.mo42677a() / 60));
        this.f14544h.setOnClickListener(new C8398b(eVar));
        if (this.f14546j instanceof C6081a) {
            this.f14551o.sendEmptyMessageDelayed(0, 10000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m20035b0(C12041e eVar) {
        if (eVar.mo42679c()) {
            m20039f0(eVar);
        } else {
            m20038e0(eVar);
        }
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
        setContentView(R$layout.activity_delay_set_new2);
        this.f14549m = Arrays.asList(getResources().getStringArray(R$array.delay_minute_display2));
        this.f14550n = Arrays.asList(getResources().getStringArray(R$array.delay_minute_display3));
        this.f14537a = (ImageView) findViewById(R$id.img_back_view);
        this.f14538b = (FrameLayout) findViewById(R$id.time_set_layout);
        this.f14539c = (ViewGroup) findViewById(R$id.remain_layout);
        this.f14540d = (WheelPicker) findViewById(R$id.minute_picker_view);
        this.f14541e = (WheelPicker) findViewById(R$id.hour_picker_view);
        this.f14542f = (TextView) findViewById(R$id.remain_text);
        this.f14543g = (TextView) findViewById(R$id.remain_text_hour);
        this.f14544h = (TextView) findViewById(R$id.btn_control);
        this.f14545i = (TextView) findViewById(R$id.tv_feature_name);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        findViewById(R$id.title_view).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f14536p, "Activity has not device id", false);
        } else {
            String stringExtra = intent.getStringExtra("com.yeelight.cherry.device_id");
            String stringExtra2 = intent.getStringExtra("feature_name");
            if (stringExtra2 != null) {
                this.f14545i.setText(stringExtra2);
            }
            C3010c j0 = YeelightDeviceManager.m7794j0(stringExtra);
            this.f14546j = j0;
            if (j0 == null || !j0.mo23145k0()) {
                BaseActivity.m19947U(this);
            } else {
                this.f14548l = this.f14546j.mo23181D() / 60;
                this.f14547k = this.f14546j.mo23181D() % 60;
                StringBuilder sb = new StringBuilder();
                sb.append("Device is :");
                sb.append(this.f14546j.getClass().getSimpleName());
                this.f14537a.setOnClickListener(new C8397a());
                C12041e C = this.f14546j.mo23179C();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Delay model = ");
                sb2.append(C);
                if (C != null) {
                    m20035b0(C);
                    return;
                }
                return;
            }
        }
        finish();
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f14546j.mo23213W0(this);
        this.f14546j.mo23133V0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f14546j.mo23178B0(this);
        this.f14546j.mo23171z0(this);
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        C12041e C;
        if ((i == -1 || i == 4096) && (C = this.f14546j.mo23179C()) != null) {
            this.f14544h.post(new C8981j(this, C));
        }
    }
}

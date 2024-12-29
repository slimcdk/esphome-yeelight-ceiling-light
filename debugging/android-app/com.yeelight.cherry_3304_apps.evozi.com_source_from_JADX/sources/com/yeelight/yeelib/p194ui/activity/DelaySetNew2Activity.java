package com.yeelight.yeelib.p194ui.activity;

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
import com.yeelight.yeelib.p150c.C5972a;
import com.yeelight.yeelib.p150c.C5980c;
import com.yeelight.yeelib.p150c.C6005g;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6050n;
import com.yeelight.yeelib.p150c.p184n.C7554e;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.widget.WheelPicker;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.yeelight.yeelib.ui.activity.DelaySetNew2Activity */
public class DelaySetNew2Activity extends BaseActivity implements C9770e, C9768c {
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final String f18230q = DelaySetNew2Activity.class.getSimpleName();

    /* renamed from: b */
    ImageView f18231b;

    /* renamed from: c */
    FrameLayout f18232c;

    /* renamed from: d */
    ViewGroup f18233d;

    /* renamed from: e */
    WheelPicker f18234e;

    /* renamed from: f */
    WheelPicker f18235f;

    /* renamed from: g */
    TextView f18236g;

    /* renamed from: h */
    TextView f18237h;

    /* renamed from: i */
    TextView f18238i;

    /* renamed from: j */
    TextView f18239j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C4198d f18240k;

    /* renamed from: l */
    int f18241l = 0;

    /* renamed from: m */
    int f18242m = 0;

    /* renamed from: n */
    private List<String> f18243n;

    /* renamed from: o */
    private List<String> f18244o;

    /* renamed from: p */
    private Handler f18245p = new C9984d();

    /* renamed from: com.yeelight.yeelib.ui.activity.DelaySetNew2Activity$a */
    class C9980a implements View.OnClickListener {
        C9980a() {
        }

        public void onClick(View view) {
            DelaySetNew2Activity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DelaySetNew2Activity$b */
    class C9981b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C7554e f18247a;

        C9981b(C7554e eVar) {
            this.f18247a = eVar;
        }

        public void onClick(View view) {
            String unused = DelaySetNew2Activity.f18230q;
            this.f18247a.mo28884e(0);
            DelaySetNew2Activity.this.f18240k.mo23353x(14, this.f18247a);
            DelaySetNew2Activity.this.m24452b0(this.f18247a);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DelaySetNew2Activity$c */
    class C9982c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C7554e f18249a;

        /* renamed from: com.yeelight.yeelib.ui.activity.DelaySetNew2Activity$c$a */
        class C9983a implements Runnable {
            C9983a() {
            }

            public void run() {
                DelaySetNew2Activity delaySetNew2Activity = DelaySetNew2Activity.this;
                int i = (delaySetNew2Activity.f18242m * 60) + delaySetNew2Activity.f18241l;
                if (i <= 0) {
                    delaySetNew2Activity.mo32195S(R$string.feature_delay_time_hint);
                }
                C9982c.this.f18249a.mo28885f(i);
                C9982c.this.f18249a.mo28884e(i);
                DelaySetNew2Activity.this.f18240k.mo23353x(10, C9982c.this.f18249a);
                if ((DelaySetNew2Activity.this.f18240k instanceof C6006h) || (DelaySetNew2Activity.this.f18240k instanceof C6050n)) {
                    DelaySetNew2Activity.this.f18240k.mo23373G0(i);
                    DeviceDataProvider.m22393a0(DelaySetNew2Activity.this.f18240k);
                } else if (DelaySetNew2Activity.this.f18240k instanceof C6005g) {
                    DelaySetNew2Activity.this.f18240k.mo23373G0(i);
                    DeviceDataProvider.m22401e0(((C6005g) DelaySetNew2Activity.this.f18240k).mo27553c2());
                } else if (DelaySetNew2Activity.this.f18240k instanceof C5980c) {
                    DelaySetNew2Activity.this.f18240k.mo23373G0(i);
                    DeviceDataProvider.m22399d0((C5980c) DelaySetNew2Activity.this.f18240k);
                }
            }
        }

        C9982c(C7554e eVar) {
            this.f18249a = eVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0039, code lost:
            if ((com.yeelight.yeelib.p194ui.activity.DelaySetNew2Activity.m24450W(r4.f18250b) instanceof com.yeelight.yeelib.p150c.p183m.C7186q) != false) goto L_0x003d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r5) {
            /*
                r4 = this;
                com.yeelight.yeelib.ui.activity.DelaySetNew2Activity r5 = com.yeelight.yeelib.p194ui.activity.DelaySetNew2Activity.this
                com.yeelight.yeelib.c.i.d r5 = r5.f18240k
                boolean r5 = r5 instanceof com.yeelight.yeelib.p150c.C5980c
                r0 = 1000(0x3e8, float:1.401E-42)
                if (r5 == 0) goto L_0x0018
                com.yeelight.yeelib.ui.activity.DelaySetNew2Activity r5 = com.yeelight.yeelib.p194ui.activity.DelaySetNew2Activity.this
                com.yeelight.yeelib.c.i.d r5 = r5.f18240k
                com.yeelight.yeelib.c.c r5 = (com.yeelight.yeelib.p150c.C5980c) r5
                r5.mo23334l1()
                goto L_0x003d
            L_0x0018:
                com.yeelight.yeelib.ui.activity.DelaySetNew2Activity r5 = com.yeelight.yeelib.p194ui.activity.DelaySetNew2Activity.this
                com.yeelight.yeelib.c.i.d r5 = r5.f18240k
                com.yeelight.yeelib.c.i.i r5 = (com.yeelight.yeelib.p150c.p151i.C4200i) r5
                boolean r5 = r5.mo23332k1()
                if (r5 != 0) goto L_0x003c
                com.yeelight.yeelib.ui.activity.DelaySetNew2Activity r5 = com.yeelight.yeelib.p194ui.activity.DelaySetNew2Activity.this
                com.yeelight.yeelib.c.i.d r5 = r5.f18240k
                com.yeelight.yeelib.c.i.i r5 = (com.yeelight.yeelib.p150c.p151i.C4200i) r5
                r5.mo23334l1()
                com.yeelight.yeelib.ui.activity.DelaySetNew2Activity r5 = com.yeelight.yeelib.p194ui.activity.DelaySetNew2Activity.this
                com.yeelight.yeelib.c.i.d r5 = r5.f18240k
                boolean r5 = r5 instanceof com.yeelight.yeelib.p150c.p183m.C7186q
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
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.activity.DelaySetNew2Activity.C9982c.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DelaySetNew2Activity$d */
    class C9984d extends Handler {
        C9984d() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0 && (DelaySetNew2Activity.this.f18240k instanceof C5972a)) {
                DelaySetNew2Activity.this.f18240k.mo23353x(2, (Object) null);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m24452b0(C7554e eVar) {
        this.f18232c.setVisibility(0);
        this.f18233d.setVisibility(4);
        this.f18238i.setText(R$string.common_text_start);
        this.f18235f.mo33217l(this.f18242m, false);
        this.f18235f.setOnItemSelectedListener(new C10340t(this));
        this.f18234e.mo33217l(this.f18241l, false);
        this.f18234e.setOnItemSelectedListener(new C10336r(this));
        this.f18238i.setOnClickListener(new C9982c(eVar));
    }

    /* renamed from: c0 */
    private void m24453c0(C7554e eVar) {
        this.f18232c.setVisibility(4);
        this.f18233d.setVisibility(0);
        this.f18238i.setText(R$string.common_text_stop);
        this.f18235f.mo33217l(this.f18242m, false);
        this.f18234e.mo33217l(this.f18241l, false);
        this.f18236g.setText(String.valueOf(eVar.mo28880a() % 60));
        this.f18237h.setText(String.valueOf(eVar.mo28880a() / 60));
        this.f18238i.setOnClickListener(new C9981b(eVar));
        if (this.f18240k instanceof C5972a) {
            this.f18245p.sendEmptyMessageDelayed(0, 10000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void mo32250Y(C7554e eVar) {
        if (eVar.mo28882c()) {
            m24453c0(eVar);
        } else {
            m24452b0(eVar);
        }
    }

    /* renamed from: Z */
    public /* synthetic */ void mo32251Z(WheelPicker wheelPicker, Object obj, int i) {
        List<String> list;
        WheelPicker wheelPicker2;
        this.f18242m = i;
        if (12 == i) {
            this.f18241l = 0;
            wheelPicker2 = this.f18234e;
            list = this.f18244o;
        } else {
            List<String> data = this.f18234e.getData();
            list = this.f18243n;
            if (data != list) {
                wheelPicker2 = this.f18234e;
            } else {
                return;
            }
        }
        wheelPicker2.setData(list);
    }

    /* renamed from: a0 */
    public /* synthetic */ void mo32252a0(WheelPicker wheelPicker, Object obj, int i) {
        this.f18241l = i;
        "mMinPickerView: hour: " + this.f18242m + "    minutes: " + this.f18241l;
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
        setContentView(R$layout.activity_delay_set_new2);
        this.f18243n = Arrays.asList(getResources().getStringArray(R$array.delay_minute_display2));
        this.f18244o = Arrays.asList(getResources().getStringArray(R$array.delay_minute_display3));
        this.f18231b = (ImageView) findViewById(R$id.img_back_view);
        this.f18232c = (FrameLayout) findViewById(R$id.time_set_layout);
        this.f18233d = (ViewGroup) findViewById(R$id.remain_layout);
        this.f18234e = (WheelPicker) findViewById(R$id.minute_picker_view);
        this.f18235f = (WheelPicker) findViewById(R$id.hour_picker_view);
        this.f18236g = (TextView) findViewById(R$id.remain_text);
        this.f18237h = (TextView) findViewById(R$id.remain_text_hour);
        this.f18238i = (TextView) findViewById(R$id.btn_control);
        this.f18239j = (TextView) findViewById(R$id.tv_feature_name);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        findViewById(R$id.title_view).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18230q, "Activity has not device id", false);
        } else {
            String stringExtra = intent.getStringExtra("com.yeelight.cherry.device_id");
            String stringExtra2 = intent.getStringExtra("feature_name");
            if (stringExtra2 != null) {
                this.f18239j.setText(stringExtra2);
            }
            C4198d h0 = C4257w.m11945h0(stringExtra);
            this.f18240k = h0;
            if (h0 == null || !h0.mo23331k0()) {
                BaseActivity.m24384U(this);
            } else {
                this.f18242m = this.f18240k.mo23368D() / 60;
                this.f18241l = this.f18240k.mo23368D() % 60;
                "Device is :" + this.f18240k.getClass().getSimpleName();
                this.f18231b.setOnClickListener(new C9980a());
                C7554e C = this.f18240k.mo23366C();
                "Delay model = " + C;
                if (C != null) {
                    mo32250Y(C);
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
        this.f18240k.mo23400W0(this);
        this.f18240k.mo23319V0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f18240k.mo23365B0(this);
        this.f18240k.mo23358z0(this);
    }

    public void onStatusChange(int i, C6024e eVar) {
        C7554e C;
        if ((i == -1 || i == 4096) && (C = this.f18240k.mo23366C()) != null) {
            this.f18238i.post(new C10338s(this, C));
        }
    }
}

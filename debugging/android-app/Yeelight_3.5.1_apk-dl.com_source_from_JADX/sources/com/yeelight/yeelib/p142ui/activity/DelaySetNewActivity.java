package com.yeelight.yeelib.p142ui.activity;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.C6081a;
import com.yeelight.yeelib.device.C6119c;
import com.yeelight.yeelib.device.C6169f;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C6100g;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.p142ui.widget.WheelPicker;
import p232y3.C12041e;
import p237z3.C12143c;
import p237z3.C12145e;

/* renamed from: com.yeelight.yeelib.ui.activity.DelaySetNewActivity */
public class DelaySetNewActivity extends BaseActivity implements C12145e, C12143c {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final String f14559l = "DelaySetNewActivity";

    /* renamed from: a */
    ImageView f14560a;

    /* renamed from: b */
    FrameLayout f14561b;

    /* renamed from: c */
    RelativeLayout f14562c;

    /* renamed from: d */
    WheelPicker f14563d;

    /* renamed from: e */
    TextView f14564e;

    /* renamed from: f */
    TextView f14565f;

    /* renamed from: g */
    TextView f14566g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C3010c f14567h;

    /* renamed from: i */
    int f14568i = 0;

    /* renamed from: j */
    int f14569j = 30;

    /* renamed from: k */
    private Handler f14570k = new C8408f();

    /* renamed from: com.yeelight.yeelib.ui.activity.DelaySetNewActivity$a */
    class C8402a implements View.OnClickListener {
        C8402a() {
        }

        public void onClick(View view) {
            DelaySetNewActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DelaySetNewActivity$b */
    class C8403b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C12041e f14572a;

        C8403b(C12041e eVar) {
            this.f14572a = eVar;
        }

        public void onClick(View view) {
            String unused = DelaySetNewActivity.f14559l;
            this.f14572a.mo42681e(0);
            DelaySetNewActivity.this.f14567h.mo23166x(14, this.f14572a);
            DelaySetNewActivity.this.m20045Z(this.f14572a);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DelaySetNewActivity$c */
    class C8404c implements WheelPicker.C8878a {
        C8404c() {
        }

        /* renamed from: a */
        public void mo35700a(WheelPicker wheelPicker, Object obj, int i) {
            DelaySetNewActivity.this.f14568i = i + 1;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DelaySetNewActivity$d */
    class C8405d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C12041e f14575a;

        /* renamed from: com.yeelight.yeelib.ui.activity.DelaySetNewActivity$d$a */
        class C8406a implements Runnable {
            C8406a() {
            }

            public void run() {
                C8405d dVar = C8405d.this;
                dVar.f14575a.mo42682f(DelaySetNewActivity.this.f14568i);
                C8405d dVar2 = C8405d.this;
                dVar2.f14575a.mo42681e(DelaySetNewActivity.this.f14568i);
                DelaySetNewActivity.this.f14567h.mo23166x(10, C8405d.this.f14575a);
                if ((DelaySetNewActivity.this.f14567h instanceof WifiDeviceBase) || (DelaySetNewActivity.this.f14567h instanceof C6100g)) {
                    DelaySetNewActivity.this.f14567h.mo23186G0(DelaySetNewActivity.this.f14568i);
                    DeviceDataProvider.m17615a0(DelaySetNewActivity.this.f14567h);
                } else if (DelaySetNewActivity.this.f14567h instanceof C6169f) {
                    DelaySetNewActivity.this.f14567h.mo23186G0(DelaySetNewActivity.this.f14568i);
                    DeviceDataProvider.m17623e0(((C6169f) DelaySetNewActivity.this.f14567h).mo31875c2());
                } else if (DelaySetNewActivity.this.f14567h instanceof C6119c) {
                    DelaySetNewActivity.this.f14567h.mo23186G0(DelaySetNewActivity.this.f14568i);
                    DeviceDataProvider.m17621d0((C6119c) DelaySetNewActivity.this.f14567h);
                }
            }
        }

        C8405d(C12041e eVar) {
            this.f14575a = eVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0052, code lost:
            if ((com.yeelight.yeelib.p142ui.activity.DelaySetNewActivity.m20042W(r4.f14576b) instanceof p223w3.C11627r) != false) goto L_0x007a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0076, code lost:
            if ((com.yeelight.yeelib.p142ui.activity.DelaySetNewActivity.m20042W(r4.f14576b) instanceof p223w3.C11627r) != false) goto L_0x007a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r5) {
            /*
                r4 = this;
                com.yeelight.yeelib.ui.activity.DelaySetNewActivity r5 = com.yeelight.yeelib.p142ui.activity.DelaySetNewActivity.this
                com.yeelight.yeelib.device.base.c r5 = r5.f14567h
                boolean r5 = r5 instanceof com.yeelight.yeelib.device.C6119c
                r0 = 1000(0x3e8, float:1.401E-42)
                r1 = 0
                if (r5 == 0) goto L_0x0019
                com.yeelight.yeelib.ui.activity.DelaySetNewActivity r5 = com.yeelight.yeelib.p142ui.activity.DelaySetNewActivity.this
                com.yeelight.yeelib.device.base.c r5 = r5.f14567h
                com.yeelight.yeelib.device.c r5 = (com.yeelight.yeelib.device.C6119c) r5
                r5.mo23148l1()
                goto L_0x007a
            L_0x0019:
                com.yeelight.yeelib.ui.activity.DelaySetNewActivity r5 = com.yeelight.yeelib.p142ui.activity.DelaySetNewActivity.this
                com.yeelight.yeelib.device.base.c r5 = r5.f14567h
                boolean r5 = r5 instanceof p207s3.C10337c
                if (r5 == 0) goto L_0x0055
                com.yeelight.yeelib.ui.activity.DelaySetNewActivity r5 = com.yeelight.yeelib.p142ui.activity.DelaySetNewActivity.this
                com.yeelight.yeelib.device.base.c r5 = r5.f14567h
                s3.c r5 = (p207s3.C10337c) r5
                int r5 = r5.mo41900r2()
                if (r5 != 0) goto L_0x0079
                com.yeelight.yeelib.ui.activity.DelaySetNewActivity r5 = com.yeelight.yeelib.p142ui.activity.DelaySetNewActivity.this
                com.yeelight.yeelib.device.base.c r5 = r5.f14567h
                com.yeelight.yeelib.device.base.e r5 = (com.yeelight.yeelib.device.base.C3012e) r5
                boolean r5 = r5.mo23146k1()
                if (r5 != 0) goto L_0x0079
                com.yeelight.yeelib.ui.activity.DelaySetNewActivity r5 = com.yeelight.yeelib.p142ui.activity.DelaySetNewActivity.this
                com.yeelight.yeelib.device.base.c r5 = r5.f14567h
                com.yeelight.yeelib.device.base.e r5 = (com.yeelight.yeelib.device.base.C3012e) r5
                r5.mo23148l1()
                com.yeelight.yeelib.ui.activity.DelaySetNewActivity r5 = com.yeelight.yeelib.p142ui.activity.DelaySetNewActivity.this
                com.yeelight.yeelib.device.base.c r5 = r5.f14567h
                boolean r5 = r5 instanceof p223w3.C11627r
                if (r5 == 0) goto L_0x0079
                goto L_0x007a
            L_0x0055:
                com.yeelight.yeelib.ui.activity.DelaySetNewActivity r5 = com.yeelight.yeelib.p142ui.activity.DelaySetNewActivity.this
                com.yeelight.yeelib.device.base.c r5 = r5.f14567h
                com.yeelight.yeelib.device.base.e r5 = (com.yeelight.yeelib.device.base.C3012e) r5
                boolean r5 = r5.mo23146k1()
                if (r5 != 0) goto L_0x0079
                com.yeelight.yeelib.ui.activity.DelaySetNewActivity r5 = com.yeelight.yeelib.p142ui.activity.DelaySetNewActivity.this
                com.yeelight.yeelib.device.base.c r5 = r5.f14567h
                com.yeelight.yeelib.device.base.e r5 = (com.yeelight.yeelib.device.base.C3012e) r5
                r5.mo23148l1()
                com.yeelight.yeelib.ui.activity.DelaySetNewActivity r5 = com.yeelight.yeelib.p142ui.activity.DelaySetNewActivity.this
                com.yeelight.yeelib.device.base.c r5 = r5.f14567h
                boolean r5 = r5 instanceof p223w3.C11627r
                if (r5 == 0) goto L_0x0079
                goto L_0x007a
            L_0x0079:
                r0 = 0
            L_0x007a:
                android.os.Handler r5 = new android.os.Handler
                r5.<init>()
                com.yeelight.yeelib.ui.activity.DelaySetNewActivity$d$a r1 = new com.yeelight.yeelib.ui.activity.DelaySetNewActivity$d$a
                r1.<init>()
                long r2 = (long) r0
                r5.postDelayed(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p142ui.activity.DelaySetNewActivity.C8405d.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DelaySetNewActivity$e */
    class C8407e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12041e f14578a;

        C8407e(C12041e eVar) {
            this.f14578a = eVar;
        }

        public void run() {
            DelaySetNewActivity.this.m20047b0(this.f14578a);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DelaySetNewActivity$f */
    class C8408f extends Handler {
        C8408f() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0 && (DelaySetNewActivity.this.f14567h instanceof C6081a)) {
                DelaySetNewActivity.this.f14567h.mo23166x(2, (Object) null);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m20045Z(C12041e eVar) {
        this.f14561b.setVisibility(0);
        this.f14562c.setVisibility(4);
        this.f14565f.setText(R$string.common_text_start);
        this.f14563d.mo36586l(this.f14568i - 1, false);
        this.f14563d.setOnItemSelectedListener(new C8404c());
        this.f14565f.setOnClickListener(new C8405d(eVar));
    }

    /* renamed from: a0 */
    private void m20046a0(C12041e eVar) {
        this.f14561b.setVisibility(4);
        this.f14562c.setVisibility(0);
        this.f14565f.setText(R$string.common_text_stop);
        this.f14563d.mo36586l(this.f14568i - 1, false);
        this.f14564e.setText(String.valueOf(eVar.mo42677a()));
        this.f14565f.setOnClickListener(new C8403b(eVar));
        if (this.f14567h instanceof C6081a) {
            this.f14570k.sendEmptyMessageDelayed(0, 10000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m20047b0(C12041e eVar) {
        if (eVar.mo42679c()) {
            m20046a0(eVar);
        } else {
            m20045Z(eVar);
        }
    }

    public void onConnectionStateChanged(int i, int i2) {
        if (i2 == 0) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c6, code lost:
        if (r6 > 15) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00df, code lost:
        if (r5.f14568i > 15) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e8, code lost:
        if (r0.mo31749E1("yeelink.light.ble1") != false) goto L_0x00b9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            r5.mo35653P()
            r6 = 1
            p051j4.C9193k.m22157h(r6, r5)
            int r6 = com.yeelight.yeelib.R$layout.activity_delay_set_new
            r5.setContentView(r6)
            int r6 = com.yeelight.yeelib.R$id.img_back_view
            android.view.View r6 = r5.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r5.f14560a = r6
            int r6 = com.yeelight.yeelib.R$id.time_set_layout
            android.view.View r6 = r5.findViewById(r6)
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            r5.f14561b = r6
            int r6 = com.yeelight.yeelib.R$id.remain_layout
            android.view.View r6 = r5.findViewById(r6)
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6
            r5.f14562c = r6
            int r6 = com.yeelight.yeelib.R$id.minute_picker_view
            android.view.View r6 = r5.findViewById(r6)
            com.yeelight.yeelib.ui.widget.WheelPicker r6 = (com.yeelight.yeelib.p142ui.widget.WheelPicker) r6
            r5.f14563d = r6
            int r6 = com.yeelight.yeelib.R$id.remain_text
            android.view.View r6 = r5.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5.f14564e = r6
            int r6 = com.yeelight.yeelib.R$id.btn_control
            android.view.View r6 = r5.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5.f14565f = r6
            int r6 = com.yeelight.yeelib.R$id.tv_title
            android.view.View r6 = r5.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5.f14566g = r6
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r0 = -1
            r1 = -2
            r6.<init>(r0, r1)
            int r0 = com.yeelight.yeelib.R$id.title_view
            android.view.View r0 = r5.findViewById(r0)
            r0.setLayoutParams(r6)
            int r0 = p051j4.C9193k.m22154e(r5)
            r1 = 0
            r6.setMargins(r1, r0, r1, r1)
            android.content.Intent r6 = r5.getIntent()
            java.lang.String r0 = "com.yeelight.cherry.device_id"
            boolean r2 = r6.hasExtra(r0)
            if (r2 != 0) goto L_0x0084
            java.lang.String r6 = f14559l
            java.lang.String r0 = "Activity has not device id"
            com.yeelight.yeelib.utils.AppUtils.m8302w(r6, r0, r1)
        L_0x0080:
            r5.finish()
            return
        L_0x0084:
            java.lang.String r1 = "feature_name"
            java.lang.String r1 = r6.getStringExtra(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0095
            android.widget.TextView r2 = r5.f14566g
            r2.setText(r1)
        L_0x0095:
            java.lang.String r6 = r6.getStringExtra(r0)
            com.yeelight.yeelib.device.base.c r6 = com.yeelight.yeelib.managers.YeelightDeviceManager.m7794j0(r6)
            r5.f14567h = r6
            if (r6 == 0) goto L_0x0139
            boolean r6 = r6.mo23145k0()
            if (r6 != 0) goto L_0x00a9
            goto L_0x0139
        L_0x00a9:
            com.yeelight.yeelib.device.base.c r6 = r5.f14567h
            int r6 = r6.mo23181D()
            r5.f14568i = r6
            com.yeelight.yeelib.device.base.c r0 = r5.f14567h
            boolean r1 = r0 instanceof p223w3.C11627r
            r2 = 29
            if (r1 == 0) goto L_0x00bc
        L_0x00b9:
            r5.f14569j = r2
            goto L_0x00ed
        L_0x00bc:
            boolean r1 = r0 instanceof p223w3.C10898f0
            r3 = 14
            r4 = 15
            if (r1 == 0) goto L_0x00cb
            r5.f14569j = r3
            if (r6 <= r4) goto L_0x00ed
        L_0x00c8:
            r5.f14568i = r4
            goto L_0x00ed
        L_0x00cb:
            boolean r6 = r0 instanceof com.yeelight.yeelib.device.C6119c
            r1 = 59
            if (r6 == 0) goto L_0x00eb
            com.yeelight.yeelib.device.c r0 = (com.yeelight.yeelib.device.C6119c) r0
            java.lang.String r6 = "yeelink.light.gingko"
            boolean r6 = r0.mo31749E1(r6)
            if (r6 == 0) goto L_0x00e2
            r5.f14569j = r3
            int r6 = r5.f14568i
            if (r6 <= r4) goto L_0x00ed
            goto L_0x00c8
        L_0x00e2:
            java.lang.String r6 = "yeelink.light.ble1"
            boolean r6 = r0.mo31749E1(r6)
            if (r6 == 0) goto L_0x00eb
            goto L_0x00b9
        L_0x00eb:
            r5.f14569j = r1
        L_0x00ed:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Device is :"
            r6.append(r0)
            com.yeelight.yeelib.device.base.c r0 = r5.f14567h
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r6.append(r0)
            android.widget.ImageView r6 = r5.f14560a
            com.yeelight.yeelib.ui.activity.DelaySetNewActivity$a r0 = new com.yeelight.yeelib.ui.activity.DelaySetNewActivity$a
            r0.<init>()
            r6.setOnClickListener(r0)
            com.yeelight.yeelib.device.base.c r6 = r5.f14567h
            com.yeelight.yeelib.device.base.DeviceStatusBase r6 = r6.mo23221d0()
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r6 = r6.mo31611r(r0)
            y3.e r6 = (p232y3.C12041e) r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Delay model = "
            r0.append(r1)
            r0.append(r6)
            if (r6 == 0) goto L_0x0138
            com.yeelight.yeelib.ui.widget.WheelPicker r0 = r5.f14563d
            int r1 = r5.f14569j
            r0.setMaxValue(r1)
            r5.m20047b0(r6)
        L_0x0138:
            return
        L_0x0139:
            com.yeelight.yeelib.p142ui.activity.BaseActivity.m19947U(r5)
            goto L_0x0080
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p142ui.activity.DelaySetNewActivity.onCreate(android.os.Bundle):void");
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f14567h.mo23213W0(this);
        this.f14567h.mo23133V0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f14567h.mo23178B0(this);
        this.f14567h.mo23171z0(this);
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        C12041e C;
        if ((i == -1 || i == 4096) && (C = this.f14567h.mo23179C()) != null) {
            this.f14565f.post(new C8407e(C));
        }
    }
}

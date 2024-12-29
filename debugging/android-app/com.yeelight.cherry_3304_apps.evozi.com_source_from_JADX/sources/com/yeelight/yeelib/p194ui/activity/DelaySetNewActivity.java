package com.yeelight.yeelib.p194ui.activity;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
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
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.widget.WheelPicker;

/* renamed from: com.yeelight.yeelib.ui.activity.DelaySetNewActivity */
public class DelaySetNewActivity extends BaseActivity implements C9770e, C9768c {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final String f18253m = DelaySetNewActivity.class.getSimpleName();

    /* renamed from: b */
    ImageView f18254b;

    /* renamed from: c */
    FrameLayout f18255c;

    /* renamed from: d */
    RelativeLayout f18256d;

    /* renamed from: e */
    WheelPicker f18257e;

    /* renamed from: f */
    TextView f18258f;

    /* renamed from: g */
    TextView f18259g;

    /* renamed from: h */
    TextView f18260h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C4198d f18261i;

    /* renamed from: j */
    int f18262j = 0;

    /* renamed from: k */
    int f18263k = 30;

    /* renamed from: l */
    private Handler f18264l = new C9991f();

    /* renamed from: com.yeelight.yeelib.ui.activity.DelaySetNewActivity$a */
    class C9985a implements View.OnClickListener {
        C9985a() {
        }

        public void onClick(View view) {
            DelaySetNewActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DelaySetNewActivity$b */
    class C9986b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C7554e f18266a;

        C9986b(C7554e eVar) {
            this.f18266a = eVar;
        }

        public void onClick(View view) {
            String unused = DelaySetNewActivity.f18253m;
            this.f18266a.mo28884e(0);
            DelaySetNewActivity.this.f18261i.mo23353x(14, this.f18266a);
            DelaySetNewActivity.this.m24462Z(this.f18266a);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DelaySetNewActivity$c */
    class C9987c implements WheelPicker.C10501a {
        C9987c() {
        }

        /* renamed from: a */
        public void mo32260a(WheelPicker wheelPicker, Object obj, int i) {
            DelaySetNewActivity.this.f18262j = i + 1;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DelaySetNewActivity$d */
    class C9988d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C7554e f18269a;

        /* renamed from: com.yeelight.yeelib.ui.activity.DelaySetNewActivity$d$a */
        class C9989a implements Runnable {
            C9989a() {
            }

            public void run() {
                C9988d dVar = C9988d.this;
                dVar.f18269a.mo28885f(DelaySetNewActivity.this.f18262j);
                C9988d dVar2 = C9988d.this;
                dVar2.f18269a.mo28884e(DelaySetNewActivity.this.f18262j);
                DelaySetNewActivity.this.f18261i.mo23353x(10, C9988d.this.f18269a);
                if ((DelaySetNewActivity.this.f18261i instanceof C6006h) || (DelaySetNewActivity.this.f18261i instanceof C6050n)) {
                    DelaySetNewActivity.this.f18261i.mo23373G0(DelaySetNewActivity.this.f18262j);
                    DeviceDataProvider.m22393a0(DelaySetNewActivity.this.f18261i);
                } else if (DelaySetNewActivity.this.f18261i instanceof C6005g) {
                    DelaySetNewActivity.this.f18261i.mo23373G0(DelaySetNewActivity.this.f18262j);
                    DeviceDataProvider.m22401e0(((C6005g) DelaySetNewActivity.this.f18261i).mo27553c2());
                } else if (DelaySetNewActivity.this.f18261i instanceof C5980c) {
                    DelaySetNewActivity.this.f18261i.mo23373G0(DelaySetNewActivity.this.f18262j);
                    DeviceDataProvider.m22399d0((C5980c) DelaySetNewActivity.this.f18261i);
                }
            }
        }

        C9988d(C7554e eVar) {
            this.f18269a = eVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0052, code lost:
            if ((com.yeelight.yeelib.p194ui.activity.DelaySetNewActivity.m24459W(r4.f18270b) instanceof com.yeelight.yeelib.p150c.p183m.C7186q) != false) goto L_0x007a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0076, code lost:
            if ((com.yeelight.yeelib.p194ui.activity.DelaySetNewActivity.m24459W(r4.f18270b) instanceof com.yeelight.yeelib.p150c.p183m.C7186q) != false) goto L_0x007a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r5) {
            /*
                r4 = this;
                com.yeelight.yeelib.ui.activity.DelaySetNewActivity r5 = com.yeelight.yeelib.p194ui.activity.DelaySetNewActivity.this
                com.yeelight.yeelib.c.i.d r5 = r5.f18261i
                boolean r5 = r5 instanceof com.yeelight.yeelib.p150c.C5980c
                r0 = 1000(0x3e8, float:1.401E-42)
                r1 = 0
                if (r5 == 0) goto L_0x0019
                com.yeelight.yeelib.ui.activity.DelaySetNewActivity r5 = com.yeelight.yeelib.p194ui.activity.DelaySetNewActivity.this
                com.yeelight.yeelib.c.i.d r5 = r5.f18261i
                com.yeelight.yeelib.c.c r5 = (com.yeelight.yeelib.p150c.C5980c) r5
                r5.mo23334l1()
                goto L_0x007a
            L_0x0019:
                com.yeelight.yeelib.ui.activity.DelaySetNewActivity r5 = com.yeelight.yeelib.p194ui.activity.DelaySetNewActivity.this
                com.yeelight.yeelib.c.i.d r5 = r5.f18261i
                boolean r5 = r5 instanceof com.yeelight.yeelib.p150c.p151i.C6033g
                if (r5 == 0) goto L_0x0055
                com.yeelight.yeelib.ui.activity.DelaySetNewActivity r5 = com.yeelight.yeelib.p194ui.activity.DelaySetNewActivity.this
                com.yeelight.yeelib.c.i.d r5 = r5.f18261i
                com.yeelight.yeelib.c.i.g r5 = (com.yeelight.yeelib.p150c.p151i.C6033g) r5
                int r5 = r5.mo27752r2()
                if (r5 != 0) goto L_0x0079
                com.yeelight.yeelib.ui.activity.DelaySetNewActivity r5 = com.yeelight.yeelib.p194ui.activity.DelaySetNewActivity.this
                com.yeelight.yeelib.c.i.d r5 = r5.f18261i
                com.yeelight.yeelib.c.i.i r5 = (com.yeelight.yeelib.p150c.p151i.C4200i) r5
                boolean r5 = r5.mo23332k1()
                if (r5 != 0) goto L_0x0079
                com.yeelight.yeelib.ui.activity.DelaySetNewActivity r5 = com.yeelight.yeelib.p194ui.activity.DelaySetNewActivity.this
                com.yeelight.yeelib.c.i.d r5 = r5.f18261i
                com.yeelight.yeelib.c.i.i r5 = (com.yeelight.yeelib.p150c.p151i.C4200i) r5
                r5.mo23334l1()
                com.yeelight.yeelib.ui.activity.DelaySetNewActivity r5 = com.yeelight.yeelib.p194ui.activity.DelaySetNewActivity.this
                com.yeelight.yeelib.c.i.d r5 = r5.f18261i
                boolean r5 = r5 instanceof com.yeelight.yeelib.p150c.p183m.C7186q
                if (r5 == 0) goto L_0x0079
                goto L_0x007a
            L_0x0055:
                com.yeelight.yeelib.ui.activity.DelaySetNewActivity r5 = com.yeelight.yeelib.p194ui.activity.DelaySetNewActivity.this
                com.yeelight.yeelib.c.i.d r5 = r5.f18261i
                com.yeelight.yeelib.c.i.i r5 = (com.yeelight.yeelib.p150c.p151i.C4200i) r5
                boolean r5 = r5.mo23332k1()
                if (r5 != 0) goto L_0x0079
                com.yeelight.yeelib.ui.activity.DelaySetNewActivity r5 = com.yeelight.yeelib.p194ui.activity.DelaySetNewActivity.this
                com.yeelight.yeelib.c.i.d r5 = r5.f18261i
                com.yeelight.yeelib.c.i.i r5 = (com.yeelight.yeelib.p150c.p151i.C4200i) r5
                r5.mo23334l1()
                com.yeelight.yeelib.ui.activity.DelaySetNewActivity r5 = com.yeelight.yeelib.p194ui.activity.DelaySetNewActivity.this
                com.yeelight.yeelib.c.i.d r5 = r5.f18261i
                boolean r5 = r5 instanceof com.yeelight.yeelib.p150c.p183m.C7186q
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
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.activity.DelaySetNewActivity.C9988d.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DelaySetNewActivity$e */
    class C9990e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C7554e f18272a;

        C9990e(C7554e eVar) {
            this.f18272a = eVar;
        }

        public void run() {
            DelaySetNewActivity.this.m24464b0(this.f18272a);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DelaySetNewActivity$f */
    class C9991f extends Handler {
        C9991f() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0 && (DelaySetNewActivity.this.f18261i instanceof C5972a)) {
                DelaySetNewActivity.this.f18261i.mo23353x(2, (Object) null);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m24462Z(C7554e eVar) {
        this.f18255c.setVisibility(0);
        this.f18256d.setVisibility(4);
        this.f18259g.setText(R$string.common_text_start);
        this.f18257e.mo33217l(this.f18262j - 1, false);
        this.f18257e.setOnItemSelectedListener(new C9987c());
        this.f18259g.setOnClickListener(new C9988d(eVar));
    }

    /* renamed from: a0 */
    private void m24463a0(C7554e eVar) {
        this.f18255c.setVisibility(4);
        this.f18256d.setVisibility(0);
        this.f18259g.setText(R$string.common_text_stop);
        this.f18257e.mo33217l(this.f18262j - 1, false);
        this.f18258f.setText(String.valueOf(eVar.mo28880a()));
        this.f18259g.setOnClickListener(new C9986b(eVar));
        if (this.f18261i instanceof C5972a) {
            this.f18264l.sendEmptyMessageDelayed(0, 10000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m24464b0(C7554e eVar) {
        if (eVar.mo28882c()) {
            m24463a0(eVar);
        } else {
            m24462Z(eVar);
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
        if (r5.f18262j > 15) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e8, code lost:
        if (r0.mo27494E1("yeelink.light.ble1") != false) goto L_0x00b9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            r5.mo32193P()
            r6 = 1
            com.yeelight.yeelib.utils.C10547m.m25758h(r6, r5)
            int r6 = com.yeelight.yeelib.R$layout.activity_delay_set_new
            r5.setContentView(r6)
            int r6 = com.yeelight.yeelib.R$id.img_back_view
            android.view.View r6 = r5.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r5.f18254b = r6
            int r6 = com.yeelight.yeelib.R$id.time_set_layout
            android.view.View r6 = r5.findViewById(r6)
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            r5.f18255c = r6
            int r6 = com.yeelight.yeelib.R$id.remain_layout
            android.view.View r6 = r5.findViewById(r6)
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6
            r5.f18256d = r6
            int r6 = com.yeelight.yeelib.R$id.minute_picker_view
            android.view.View r6 = r5.findViewById(r6)
            com.yeelight.yeelib.ui.widget.WheelPicker r6 = (com.yeelight.yeelib.p194ui.widget.WheelPicker) r6
            r5.f18257e = r6
            int r6 = com.yeelight.yeelib.R$id.remain_text
            android.view.View r6 = r5.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5.f18258f = r6
            int r6 = com.yeelight.yeelib.R$id.btn_control
            android.view.View r6 = r5.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5.f18259g = r6
            int r6 = com.yeelight.yeelib.R$id.tv_title
            android.view.View r6 = r5.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5.f18260h = r6
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r0 = -1
            r1 = -2
            r6.<init>(r0, r1)
            int r0 = com.yeelight.yeelib.R$id.title_view
            android.view.View r0 = r5.findViewById(r0)
            r0.setLayoutParams(r6)
            int r0 = com.yeelight.yeelib.utils.C10547m.m25755e(r5)
            r1 = 0
            r6.setMargins(r1, r0, r1, r1)
            android.content.Intent r6 = r5.getIntent()
            java.lang.String r0 = "com.yeelight.cherry.device_id"
            boolean r2 = r6.hasExtra(r0)
            if (r2 != 0) goto L_0x0084
            java.lang.String r6 = f18253m
            java.lang.String r0 = "Activity has not device id"
            com.yeelight.yeelib.utils.C4308b.m12141t(r6, r0, r1)
        L_0x0080:
            r5.finish()
            return
        L_0x0084:
            java.lang.String r1 = "feature_name"
            java.lang.String r1 = r6.getStringExtra(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0095
            android.widget.TextView r2 = r5.f18260h
            r2.setText(r1)
        L_0x0095:
            java.lang.String r6 = r6.getStringExtra(r0)
            com.yeelight.yeelib.c.i.d r6 = com.yeelight.yeelib.p152f.C4257w.m11945h0(r6)
            r5.f18261i = r6
            if (r6 == 0) goto L_0x013f
            boolean r6 = r6.mo23331k0()
            if (r6 != 0) goto L_0x00a9
            goto L_0x013f
        L_0x00a9:
            com.yeelight.yeelib.c.i.d r6 = r5.f18261i
            int r6 = r6.mo23368D()
            r5.f18262j = r6
            com.yeelight.yeelib.c.i.d r0 = r5.f18261i
            boolean r1 = r0 instanceof com.yeelight.yeelib.p150c.p183m.C7186q
            r2 = 29
            if (r1 == 0) goto L_0x00bc
        L_0x00b9:
            r5.f18263k = r2
            goto L_0x00ed
        L_0x00bc:
            boolean r1 = r0 instanceof com.yeelight.yeelib.p150c.p183m.C6459e0
            r3 = 14
            r4 = 15
            if (r1 == 0) goto L_0x00cb
            r5.f18263k = r3
            if (r6 <= r4) goto L_0x00ed
        L_0x00c8:
            r5.f18262j = r4
            goto L_0x00ed
        L_0x00cb:
            boolean r6 = r0 instanceof com.yeelight.yeelib.p150c.C5980c
            r1 = 59
            if (r6 == 0) goto L_0x00eb
            com.yeelight.yeelib.c.c r0 = (com.yeelight.yeelib.p150c.C5980c) r0
            java.lang.String r6 = "yeelink.light.gingko"
            boolean r6 = r0.mo27494E1(r6)
            if (r6 == 0) goto L_0x00e2
            r5.f18263k = r3
            int r6 = r5.f18262j
            if (r6 <= r4) goto L_0x00ed
            goto L_0x00c8
        L_0x00e2:
            java.lang.String r6 = "yeelink.light.ble1"
            boolean r6 = r0.mo27494E1(r6)
            if (r6 == 0) goto L_0x00eb
            goto L_0x00b9
        L_0x00eb:
            r5.f18263k = r1
        L_0x00ed:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Device is :"
            r6.append(r0)
            com.yeelight.yeelib.c.i.d r0 = r5.f18261i
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r6.append(r0)
            r6.toString()
            android.widget.ImageView r6 = r5.f18254b
            com.yeelight.yeelib.ui.activity.DelaySetNewActivity$a r0 = new com.yeelight.yeelib.ui.activity.DelaySetNewActivity$a
            r0.<init>()
            r6.setOnClickListener(r0)
            com.yeelight.yeelib.c.i.d r6 = r5.f18261i
            com.yeelight.yeelib.c.i.e r6 = r6.mo23408d0()
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r6 = r6.mo27710r(r0)
            com.yeelight.yeelib.c.n.e r6 = (com.yeelight.yeelib.p150c.p184n.C7554e) r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Delay model = "
            r0.append(r1)
            r0.append(r6)
            r0.toString()
            if (r6 == 0) goto L_0x013e
            com.yeelight.yeelib.ui.widget.WheelPicker r0 = r5.f18257e
            int r1 = r5.f18263k
            r0.setMaxValue(r1)
            r5.m24464b0(r6)
        L_0x013e:
            return
        L_0x013f:
            com.yeelight.yeelib.p194ui.activity.BaseActivity.m24384U(r5)
            goto L_0x0080
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.activity.DelaySetNewActivity.onCreate(android.os.Bundle):void");
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f18261i.mo23400W0(this);
        this.f18261i.mo23319V0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f18261i.mo23365B0(this);
        this.f18261i.mo23358z0(this);
    }

    public void onStatusChange(int i, C6024e eVar) {
        C7554e C;
        if ((i == -1 || i == 4096) && (C = this.f18261i.mo23366C()) != null) {
            this.f18259g.post(new C9990e(C));
        }
    }
}

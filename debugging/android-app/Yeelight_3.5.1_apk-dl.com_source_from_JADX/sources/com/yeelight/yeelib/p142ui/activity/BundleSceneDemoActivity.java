package com.yeelight.yeelib.p142ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.MotionEventCompat;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.C6091a;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.C8312e;
import com.yeelight.yeelib.models.C8313f;
import com.yeelight.yeelib.models.C8314g;
import com.yeelight.yeelib.models.C8324p;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import p051j4.C9193k;
import p223w3.C10922g;
import p223w3.C11363l;

/* renamed from: com.yeelight.yeelib.ui.activity.BundleSceneDemoActivity */
public class BundleSceneDemoActivity extends BaseActivity {

    /* renamed from: m */
    private static final String f14445m = "BundleSceneDemoActivity";

    /* renamed from: a */
    ImageView f14446a;

    /* renamed from: b */
    Button f14447b;

    /* renamed from: c */
    TextView f14448c;

    /* renamed from: d */
    Button f14449d;

    /* renamed from: e */
    Button f14450e;

    /* renamed from: f */
    Button f14451f;

    /* renamed from: g */
    Button f14452g;

    /* renamed from: h */
    Button f14453h;

    /* renamed from: i */
    Button f14454i;

    /* renamed from: j */
    Button f14455j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public WifiDeviceBase f14456k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Handler f14457l = new C8371b();

    /* renamed from: com.yeelight.yeelib.ui.activity.BundleSceneDemoActivity$a */
    class C8370a implements View.OnClickListener {
        C8370a() {
        }

        public void onClick(View view) {
            C8312e eVar = new C8312e();
            C8314g gVar = new C8314g();
            gVar.mo35428M(4000);
            gVar.mo35426K(50);
            C8313f fVar = new C8313f();
            fVar.mo35427L(MotionEventCompat.ACTION_POINTER_INDEX_MASK);
            fVar.mo35426K(50);
            ArrayList arrayList = new ArrayList();
            arrayList.add(gVar);
            arrayList.add(fVar);
            eVar.mo35349c0(arrayList);
            BundleSceneDemoActivity.this.f14456k.mo23168x1(eVar);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.BundleSceneDemoActivity$b */
    class C8371b extends Handler {
        C8371b() {
        }

        public void handleMessage(Message message) {
            C6091a aVar;
            TextView textView;
            StringBuilder sb;
            if (message.what == 1) {
                if (BundleSceneDemoActivity.this.f14456k instanceof C10922g) {
                    aVar = (C10922g) BundleSceneDemoActivity.this.f14456k;
                    textView = BundleSceneDemoActivity.this.f14448c;
                    sb = new StringBuilder();
                } else if (BundleSceneDemoActivity.this.f14456k instanceof C11363l) {
                    aVar = (C11363l) BundleSceneDemoActivity.this.f14456k;
                    textView = BundleSceneDemoActivity.this.f14448c;
                    sb = new StringBuilder();
                } else {
                    return;
                }
                sb.append("power: ");
                sb.append(aVar.mo23221d0().mo31584d0());
                sb.append("; main power: ");
                sb.append(aVar.mo31657k2().mo31669h());
                sb.append("; bg power: ");
                sb.append(aVar.mo31657k2().mo31667f());
                sb.append("; bright: ");
                sb.append(aVar.mo23221d0().mo31601m());
                sb.append("; bg bright: ");
                sb.append(aVar.mo31657k2().mo31662a());
                sb.append("; ct: ");
                sb.append(aVar.mo23221d0().mo31607p());
                sb.append("; bg ct: ");
                sb.append(aVar.mo31657k2().mo31664c());
                sb.append("; color: ");
                sb.append(aVar.mo23221d0().mo31603n());
                sb.append("; bg color: ");
                sb.append(aVar.mo31657k2().mo31663b());
                textView.setText(sb.toString());
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.BundleSceneDemoActivity$c */
    class C8372c implements View.OnClickListener {
        C8372c() {
        }

        public void onClick(View view) {
            BundleSceneDemoActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.BundleSceneDemoActivity$d */
    class C8373d implements View.OnClickListener {
        C8373d() {
        }

        public void onClick(View view) {
            BundleSceneDemoActivity.this.f14456k.mo23167x0();
            BundleSceneDemoActivity.this.f14448c.setText("Refreshing...");
            BundleSceneDemoActivity.this.f14457l.sendEmptyMessageDelayed(1, 3000);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.BundleSceneDemoActivity$e */
    class C8374e implements View.OnClickListener {
        C8374e() {
        }

        public void onClick(View view) {
            C8312e eVar = new C8312e();
            C8324p pVar = new C8324p();
            C8324p pVar2 = new C8324p();
            ArrayList arrayList = new ArrayList();
            arrayList.add(pVar);
            arrayList.add(pVar2);
            eVar.mo35349c0(arrayList);
            BundleSceneDemoActivity.this.f14456k.mo23168x1(eVar);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.BundleSceneDemoActivity$f */
    class C8375f implements View.OnClickListener {
        C8375f() {
        }

        public void onClick(View view) {
            C8312e eVar = new C8312e();
            C8324p pVar = new C8324p();
            C8314g gVar = new C8314g();
            gVar.mo35428M(2700);
            gVar.mo35426K(100);
            ArrayList arrayList = new ArrayList();
            arrayList.add(pVar);
            arrayList.add(gVar);
            eVar.mo35349c0(arrayList);
            BundleSceneDemoActivity.this.f14456k.mo23168x1(eVar);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.BundleSceneDemoActivity$g */
    class C8376g implements View.OnClickListener {
        C8376g() {
        }

        public void onClick(View view) {
            C8312e eVar = new C8312e();
            C8324p pVar = new C8324p();
            C8313f fVar = new C8313f();
            fVar.mo35427L(16711680);
            fVar.mo35426K(20);
            ArrayList arrayList = new ArrayList();
            arrayList.add(pVar);
            arrayList.add(fVar);
            eVar.mo35349c0(arrayList);
            BundleSceneDemoActivity.this.f14456k.mo23168x1(eVar);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.BundleSceneDemoActivity$h */
    class C8377h implements View.OnClickListener {
        C8377h() {
        }

        public void onClick(View view) {
            C8312e eVar = new C8312e();
            C8324p pVar = new C8324p();
            C8313f fVar = new C8313f();
            fVar.mo35427L(255);
            fVar.mo35426K(50);
            ArrayList arrayList = new ArrayList();
            arrayList.add(pVar);
            arrayList.add(fVar);
            eVar.mo35349c0(arrayList);
            BundleSceneDemoActivity.this.f14456k.mo23168x1(eVar);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.BundleSceneDemoActivity$i */
    class C8378i implements View.OnClickListener {
        C8378i() {
        }

        public void onClick(View view) {
            C8312e eVar = new C8312e();
            C8314g gVar = new C8314g();
            gVar.mo35428M(2700);
            gVar.mo35426K(100);
            C8324p pVar = new C8324p();
            ArrayList arrayList = new ArrayList();
            arrayList.add(gVar);
            arrayList.add(pVar);
            eVar.mo35349c0(arrayList);
            BundleSceneDemoActivity.this.f14456k.mo23168x1(eVar);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.BundleSceneDemoActivity$j */
    class C8379j implements View.OnClickListener {
        C8379j() {
        }

        public void onClick(View view) {
            C8312e eVar = new C8312e();
            C8314g gVar = new C8314g();
            gVar.mo35428M(6500);
            gVar.mo35426K(10);
            C8324p pVar = new C8324p();
            ArrayList arrayList = new ArrayList();
            arrayList.add(gVar);
            arrayList.add(pVar);
            eVar.mo35349c0(arrayList);
            BundleSceneDemoActivity.this.f14456k.mo23168x1(eVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_bundle_scene_demo);
        this.f14446a = (ImageView) findViewById(R$id.img_back_view);
        this.f14447b = (Button) findViewById(R$id.btn_refresh);
        this.f14448c = (TextView) findViewById(R$id.tv_status);
        this.f14449d = (Button) findViewById(R$id.btn_1);
        this.f14450e = (Button) findViewById(R$id.btn_2);
        this.f14451f = (Button) findViewById(R$id.btn_3);
        this.f14452g = (Button) findViewById(R$id.btn_4);
        this.f14453h = (Button) findViewById(R$id.btn_5);
        this.f14454i = (Button) findViewById(R$id.btn_6);
        this.f14455j = (Button) findViewById(R$id.btn_7);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        findViewById(R$id.title_view).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f14445m, "Activity has not device id", false);
            finish();
            return;
        }
        WifiDeviceBase P0 = YeelightDeviceManager.m7800o0().mo23274P0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f14456k = P0;
        if (P0 == null || !P0.mo23145k0()) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        this.f14446a.setOnClickListener(new C8372c());
        this.f14447b.setOnClickListener(new C8373d());
        this.f14449d.setOnClickListener(new C8374e());
        this.f14450e.setOnClickListener(new C8375f());
        this.f14451f.setOnClickListener(new C8376g());
        this.f14452g.setOnClickListener(new C8377h());
        this.f14453h.setOnClickListener(new C8378i());
        this.f14454i.setOnClickListener(new C8379j());
        this.f14455j.setOnClickListener(new C8370a());
    }

    public void onPause() {
        super.onPause();
        this.f14457l.removeMessages(1);
    }
}

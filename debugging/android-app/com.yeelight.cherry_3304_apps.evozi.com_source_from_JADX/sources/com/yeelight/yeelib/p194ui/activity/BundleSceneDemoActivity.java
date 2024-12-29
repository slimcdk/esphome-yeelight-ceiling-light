package com.yeelight.yeelib.p194ui.activity;

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
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C6017a;
import com.yeelight.yeelib.p150c.p183m.C6574g;
import com.yeelight.yeelib.p150c.p183m.C6937k;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p153g.C9834e;
import com.yeelight.yeelib.p153g.C9835f;
import com.yeelight.yeelib.p153g.C9836g;
import com.yeelight.yeelib.p153g.C9852u;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.ArrayList;

/* renamed from: com.yeelight.yeelib.ui.activity.BundleSceneDemoActivity */
public class BundleSceneDemoActivity extends BaseActivity {

    /* renamed from: n */
    private static final String f18139n = BundleSceneDemoActivity.class.getSimpleName();

    /* renamed from: b */
    ImageView f18140b;

    /* renamed from: c */
    Button f18141c;

    /* renamed from: d */
    TextView f18142d;

    /* renamed from: e */
    Button f18143e;

    /* renamed from: f */
    Button f18144f;

    /* renamed from: g */
    Button f18145g;

    /* renamed from: h */
    Button f18146h;

    /* renamed from: i */
    Button f18147i;

    /* renamed from: j */
    Button f18148j;

    /* renamed from: k */
    Button f18149k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C6006h f18150l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Handler f18151m = new C9954b();

    /* renamed from: com.yeelight.yeelib.ui.activity.BundleSceneDemoActivity$a */
    class C9953a implements View.OnClickListener {
        C9953a() {
        }

        public void onClick(View view) {
            C9834e eVar = new C9834e();
            C9836g gVar = new C9836g();
            gVar.mo31863L(4000);
            gVar.mo31861J(50);
            C9835f fVar = new C9835f();
            fVar.mo31862K(MotionEventCompat.ACTION_POINTER_INDEX_MASK);
            fVar.mo31861J(50);
            ArrayList arrayList = new ArrayList();
            arrayList.add(gVar);
            arrayList.add(fVar);
            eVar.mo31759b0(arrayList);
            BundleSceneDemoActivity.this.f18150l.mo23355x1(eVar);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.BundleSceneDemoActivity$b */
    class C9954b extends Handler {
        C9954b() {
        }

        public void handleMessage(Message message) {
            C6017a aVar;
            TextView textView;
            StringBuilder sb;
            if (message.what == 1) {
                if (BundleSceneDemoActivity.this.f18150l instanceof C6574g) {
                    aVar = (C6574g) BundleSceneDemoActivity.this.f18150l;
                    textView = BundleSceneDemoActivity.this.f18142d;
                    sb = new StringBuilder();
                } else if (BundleSceneDemoActivity.this.f18150l instanceof C6937k) {
                    aVar = (C6937k) BundleSceneDemoActivity.this.f18150l;
                    textView = BundleSceneDemoActivity.this.f18142d;
                    sb = new StringBuilder();
                } else {
                    return;
                }
                sb.append("power: ");
                sb.append(aVar.mo23408d0().mo27681c0());
                sb.append("; main power: ");
                sb.append(aVar.mo27591k2().mo27603h());
                sb.append("; bg power: ");
                sb.append(aVar.mo27591k2().mo27601f());
                sb.append("; bright: ");
                sb.append(aVar.mo23408d0().mo27700m());
                sb.append("; bg bright: ");
                sb.append(aVar.mo27591k2().mo27596a());
                sb.append("; ct: ");
                sb.append(aVar.mo23408d0().mo27706p());
                sb.append("; bg ct: ");
                sb.append(aVar.mo27591k2().mo27598c());
                sb.append("; color: ");
                sb.append(aVar.mo23408d0().mo27702n());
                sb.append("; bg color: ");
                sb.append(aVar.mo27591k2().mo27597b());
                textView.setText(sb.toString());
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.BundleSceneDemoActivity$c */
    class C9955c implements View.OnClickListener {
        C9955c() {
        }

        public void onClick(View view) {
            BundleSceneDemoActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.BundleSceneDemoActivity$d */
    class C9956d implements View.OnClickListener {
        C9956d() {
        }

        public void onClick(View view) {
            BundleSceneDemoActivity.this.f18150l.mo23354x0();
            BundleSceneDemoActivity.this.f18142d.setText("Refreshing...");
            BundleSceneDemoActivity.this.f18151m.sendEmptyMessageDelayed(1, 3000);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.BundleSceneDemoActivity$e */
    class C9957e implements View.OnClickListener {
        C9957e() {
        }

        public void onClick(View view) {
            C9834e eVar = new C9834e();
            C9852u uVar = new C9852u();
            C9852u uVar2 = new C9852u();
            ArrayList arrayList = new ArrayList();
            arrayList.add(uVar);
            arrayList.add(uVar2);
            eVar.mo31759b0(arrayList);
            BundleSceneDemoActivity.this.f18150l.mo23355x1(eVar);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.BundleSceneDemoActivity$f */
    class C9958f implements View.OnClickListener {
        C9958f() {
        }

        public void onClick(View view) {
            C9834e eVar = new C9834e();
            C9852u uVar = new C9852u();
            C9836g gVar = new C9836g();
            gVar.mo31863L(2700);
            gVar.mo31861J(100);
            ArrayList arrayList = new ArrayList();
            arrayList.add(uVar);
            arrayList.add(gVar);
            eVar.mo31759b0(arrayList);
            BundleSceneDemoActivity.this.f18150l.mo23355x1(eVar);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.BundleSceneDemoActivity$g */
    class C9959g implements View.OnClickListener {
        C9959g() {
        }

        public void onClick(View view) {
            C9834e eVar = new C9834e();
            C9852u uVar = new C9852u();
            C9835f fVar = new C9835f();
            fVar.mo31862K(16711680);
            fVar.mo31861J(20);
            ArrayList arrayList = new ArrayList();
            arrayList.add(uVar);
            arrayList.add(fVar);
            eVar.mo31759b0(arrayList);
            BundleSceneDemoActivity.this.f18150l.mo23355x1(eVar);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.BundleSceneDemoActivity$h */
    class C9960h implements View.OnClickListener {
        C9960h() {
        }

        public void onClick(View view) {
            C9834e eVar = new C9834e();
            C9852u uVar = new C9852u();
            C9835f fVar = new C9835f();
            fVar.mo31862K(255);
            fVar.mo31861J(50);
            ArrayList arrayList = new ArrayList();
            arrayList.add(uVar);
            arrayList.add(fVar);
            eVar.mo31759b0(arrayList);
            BundleSceneDemoActivity.this.f18150l.mo23355x1(eVar);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.BundleSceneDemoActivity$i */
    class C9961i implements View.OnClickListener {
        C9961i() {
        }

        public void onClick(View view) {
            C9834e eVar = new C9834e();
            C9836g gVar = new C9836g();
            gVar.mo31863L(2700);
            gVar.mo31861J(100);
            C9852u uVar = new C9852u();
            ArrayList arrayList = new ArrayList();
            arrayList.add(gVar);
            arrayList.add(uVar);
            eVar.mo31759b0(arrayList);
            BundleSceneDemoActivity.this.f18150l.mo23355x1(eVar);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.BundleSceneDemoActivity$j */
    class C9962j implements View.OnClickListener {
        C9962j() {
        }

        public void onClick(View view) {
            C9834e eVar = new C9834e();
            C9836g gVar = new C9836g();
            gVar.mo31863L(6500);
            gVar.mo31861J(10);
            C9852u uVar = new C9852u();
            ArrayList arrayList = new ArrayList();
            arrayList.add(gVar);
            arrayList.add(uVar);
            eVar.mo31759b0(arrayList);
            BundleSceneDemoActivity.this.f18150l.mo23355x1(eVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_bundle_scene_demo);
        this.f18140b = (ImageView) findViewById(R$id.img_back_view);
        this.f18141c = (Button) findViewById(R$id.btn_refresh);
        this.f18142d = (TextView) findViewById(R$id.tv_status);
        this.f18143e = (Button) findViewById(R$id.btn_1);
        this.f18144f = (Button) findViewById(R$id.btn_2);
        this.f18145g = (Button) findViewById(R$id.btn_3);
        this.f18146h = (Button) findViewById(R$id.btn_4);
        this.f18147i = (Button) findViewById(R$id.btn_5);
        this.f18148j = (Button) findViewById(R$id.btn_6);
        this.f18149k = (Button) findViewById(R$id.btn_7);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        findViewById(R$id.title_view).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18139n, "Activity has not device id", false);
            finish();
            return;
        }
        C6006h L0 = C4257w.m11947l0().mo23651L0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f18150l = L0;
        if (L0 == null || !L0.mo23331k0()) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        this.f18140b.setOnClickListener(new C9955c());
        this.f18141c.setOnClickListener(new C9956d());
        this.f18143e.setOnClickListener(new C9957e());
        this.f18144f.setOnClickListener(new C9958f());
        this.f18145g.setOnClickListener(new C9959g());
        this.f18146h.setOnClickListener(new C9960h());
        this.f18147i.setOnClickListener(new C9961i());
        this.f18148j.setOnClickListener(new C9962j());
        this.f18149k.setOnClickListener(new C9953a());
    }

    public void onPause() {
        super.onPause();
        this.f18151m.removeMessages(1);
    }
}

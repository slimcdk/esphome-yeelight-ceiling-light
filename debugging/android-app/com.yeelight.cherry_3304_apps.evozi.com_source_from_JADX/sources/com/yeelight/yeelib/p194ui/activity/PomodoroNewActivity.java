package com.yeelight.yeelib.p194ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p181l.p182n1.C6178a;
import com.yeelight.yeelib.p150c.p184n.C7559i;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.widget.WheelPicker;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.yeelib.ui.activity.PomodoroNewActivity */
public class PomodoroNewActivity extends BaseActivity implements C9770e {

    /* renamed from: o */
    private static final String f18768o = PomodoroNewActivity.class.getSimpleName();

    /* renamed from: b */
    ImageView f18769b;

    /* renamed from: c */
    FrameLayout f18770c;

    /* renamed from: d */
    LinearLayout f18771d;

    /* renamed from: e */
    WheelPicker f18772e;

    /* renamed from: f */
    WheelPicker f18773f;

    /* renamed from: g */
    TextView f18774g;

    /* renamed from: h */
    TextView f18775h;

    /* renamed from: i */
    TextView f18776i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C4198d f18777j;

    /* renamed from: k */
    int f18778k;

    /* renamed from: l */
    int f18779l;

    /* renamed from: m */
    C7559i f18780m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Handler f18781n = new C10163c();

    /* renamed from: com.yeelight.yeelib.ui.activity.PomodoroNewActivity$a */
    class C10157a implements View.OnClickListener {
        C10157a() {
        }

        public void onClick(View view) {
            PomodoroNewActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.PomodoroNewActivity$b */
    class C10158b implements Runnable {

        /* renamed from: com.yeelight.yeelib.ui.activity.PomodoroNewActivity$b$a */
        class C10159a implements View.OnClickListener {
            C10159a() {
            }

            public void onClick(View view) {
                ((C6178a) PomodoroNewActivity.this.f18777j).mo28047c();
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.PomodoroNewActivity$b$b */
        class C10160b implements WheelPicker.C10501a {
            C10160b() {
            }

            /* renamed from: a */
            public void mo32260a(WheelPicker wheelPicker, Object obj, int i) {
                PomodoroNewActivity.this.f18778k = i + 1;
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.PomodoroNewActivity$b$c */
        class C10161c implements WheelPicker.C10501a {
            C10161c() {
            }

            /* renamed from: a */
            public void mo32260a(WheelPicker wheelPicker, Object obj, int i) {
                PomodoroNewActivity.this.f18779l = i + 1;
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.PomodoroNewActivity$b$d */
        class C10162d implements View.OnClickListener {
            C10162d() {
            }

            public void onClick(View view) {
                if (!((C4200i) PomodoroNewActivity.this.f18777j).mo23332k1()) {
                    ((C4200i) PomodoroNewActivity.this.f18777j).mo23334l1();
                }
                PomodoroNewActivity pomodoroNewActivity = PomodoroNewActivity.this;
                ((C6178a) PomodoroNewActivity.this.f18777j).mo28049h(pomodoroNewActivity.f18778k, pomodoroNewActivity.f18779l);
                PomodoroNewActivity pomodoroNewActivity2 = PomodoroNewActivity.this;
                pomodoroNewActivity2.f18780m.mo28932j(pomodoroNewActivity2.f18778k);
                PomodoroNewActivity pomodoroNewActivity3 = PomodoroNewActivity.this;
                pomodoroNewActivity3.f18780m.mo28928f(pomodoroNewActivity3.f18779l);
                PomodoroNewActivity pomodoroNewActivity4 = PomodoroNewActivity.this;
                ((C6178a) PomodoroNewActivity.this.f18777j).mo28046a(pomodoroNewActivity4.f18778k, pomodoroNewActivity4.f18779l);
            }
        }

        C10158b() {
        }

        public void run() {
            TextView textView;
            View.OnClickListener dVar;
            C7559i iVar = PomodoroNewActivity.this.f18780m;
            if (iVar == null || !iVar.mo28927e()) {
                PomodoroNewActivity.this.f18770c.setVisibility(0);
                PomodoroNewActivity.this.f18771d.setVisibility(8);
                PomodoroNewActivity pomodoroNewActivity = PomodoroNewActivity.this;
                C7559i iVar2 = pomodoroNewActivity.f18780m;
                int i = 15;
                int i2 = 45;
                if (iVar2 == null) {
                    pomodoroNewActivity.f18778k = 45;
                    pomodoroNewActivity.f18779l = 15;
                    pomodoroNewActivity.f18780m = new C7559i(false, 45, 15);
                } else {
                    if (iVar2.mo28926d() != 0) {
                        i2 = PomodoroNewActivity.this.f18780m.mo28926d();
                    }
                    pomodoroNewActivity.f18778k = i2;
                    PomodoroNewActivity pomodoroNewActivity2 = PomodoroNewActivity.this;
                    if (pomodoroNewActivity2.f18780m.mo28923a() != 0) {
                        i = PomodoroNewActivity.this.f18780m.mo28923a();
                    }
                    pomodoroNewActivity2.f18779l = i;
                }
                PomodoroNewActivity.this.f18772e.setMaxValue(59);
                PomodoroNewActivity.this.f18773f.setMaxValue(59);
                PomodoroNewActivity pomodoroNewActivity3 = PomodoroNewActivity.this;
                pomodoroNewActivity3.f18772e.mo33217l(pomodoroNewActivity3.f18778k - 1, false);
                PomodoroNewActivity pomodoroNewActivity4 = PomodoroNewActivity.this;
                pomodoroNewActivity4.f18773f.mo33217l(pomodoroNewActivity4.f18779l - 1, false);
                PomodoroNewActivity.this.f18772e.setOnItemSelectedListener(new C10160b());
                PomodoroNewActivity.this.f18773f.setOnItemSelectedListener(new C10161c());
                PomodoroNewActivity.this.f18775h.setText(R$string.common_text_start);
                textView = PomodoroNewActivity.this.f18775h;
                dVar = new C10162d();
            } else {
                PomodoroNewActivity.this.f18770c.setVisibility(8);
                PomodoroNewActivity.this.m24757Z();
                PomodoroNewActivity.this.f18771d.setVisibility(0);
                PomodoroNewActivity.this.f18775h.setText(R$string.common_text_stop);
                textView = PomodoroNewActivity.this.f18775h;
                dVar = new C10159a();
            }
            textView.setOnClickListener(dVar);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.PomodoroNewActivity$c */
    class C10163c extends Handler {
        C10163c() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                PomodoroNewActivity.this.f18781n.removeMessages(0);
                PomodoroNewActivity.this.m24757Z();
            }
        }
    }

    /* renamed from: Y */
    private C7559i m24756Y() {
        return (C7559i) this.f18777j.mo23408d0().mo27710r(11);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m24757Z() {
        C7559i Y = m24756Y();
        if (Y.mo28927e()) {
            if (Y.mo28925c() > 0) {
                this.f18774g.setText(String.format("%02d:%02d", new Object[]{Integer.valueOf(Y.mo28925c() / 60), Integer.valueOf(Y.mo28925c() % 60)}));
                this.f18776i.setText(R$string.pdo_txt_rest);
                Y.mo28931i(Y.mo28925c() - 1);
            } else if (Y.mo28924b() > 0) {
                this.f18774g.setText(String.format("%02d:%02d", new Object[]{Integer.valueOf(Y.mo28924b() / 60), Integer.valueOf(Y.mo28924b() % 60)}));
                this.f18776i.setText(R$string.pdo_txt_work);
                Y.mo28930h(Y.mo28924b() - 1);
            } else {
                ((C6178a) this.f18777j).mo28048g();
            }
            this.f18781n.sendEmptyMessageDelayed(0, 1000);
        }
    }

    /* renamed from: a0 */
    private void m24758a0() {
        this.f18780m = m24756Y();
        runOnUiThread(new C10158b());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_pomodoro_new);
        this.f18769b = (ImageView) findViewById(R$id.img_back_view);
        this.f18770c = (FrameLayout) findViewById(R$id.time_set_layout);
        this.f18771d = (LinearLayout) findViewById(R$id.pomodoro_time_info_layout);
        this.f18772e = (WheelPicker) findViewById(R$id.work_time_picker_view);
        this.f18773f = (WheelPicker) findViewById(R$id.rest_time_picker_view);
        this.f18774g = (TextView) findViewById(R$id.pomodoro_time_text);
        this.f18775h = (TextView) findViewById(R$id.btn_control);
        this.f18776i = (TextView) findViewById(R$id.pomodoro_time_info);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        findViewById(R$id.title_view).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18768o, "Activity has not device id", false);
            finish();
            return;
        }
        C4198d h0 = C4257w.m11945h0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f18777j = h0;
        if (h0 == null) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        this.f18769b.setOnClickListener(new C10157a());
        m24758a0();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f18777j.mo23400W0(this);
        this.f18781n.removeMessages(0);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f18777j.mo23365B0(this);
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == -1 || i == 4096) {
            m24758a0();
        }
    }
}

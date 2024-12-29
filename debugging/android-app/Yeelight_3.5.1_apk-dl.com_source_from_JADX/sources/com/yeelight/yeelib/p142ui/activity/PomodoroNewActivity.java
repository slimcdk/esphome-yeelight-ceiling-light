package com.yeelight.yeelib.p142ui.activity;

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
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.widget.WheelPicker;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9193k;
import p219v3.C10543a;
import p232y3.C12046i;
import p237z3.C12145e;

/* renamed from: com.yeelight.yeelib.ui.activity.PomodoroNewActivity */
public class PomodoroNewActivity extends BaseActivity implements C12145e {

    /* renamed from: n */
    private static final String f15076n = "PomodoroNewActivity";

    /* renamed from: a */
    ImageView f15077a;

    /* renamed from: b */
    FrameLayout f15078b;

    /* renamed from: c */
    LinearLayout f15079c;

    /* renamed from: d */
    WheelPicker f15080d;

    /* renamed from: e */
    WheelPicker f15081e;

    /* renamed from: f */
    TextView f15082f;

    /* renamed from: g */
    TextView f15083g;

    /* renamed from: h */
    TextView f15084h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C3010c f15085i;

    /* renamed from: j */
    int f15086j;

    /* renamed from: k */
    int f15087k;

    /* renamed from: l */
    C12046i f15088l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Handler f15089m = new C8581c();

    /* renamed from: com.yeelight.yeelib.ui.activity.PomodoroNewActivity$a */
    class C8575a implements View.OnClickListener {
        C8575a() {
        }

        public void onClick(View view) {
            PomodoroNewActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.PomodoroNewActivity$b */
    class C8576b implements Runnable {

        /* renamed from: com.yeelight.yeelib.ui.activity.PomodoroNewActivity$b$a */
        class C8577a implements View.OnClickListener {
            C8577a() {
            }

            public void onClick(View view) {
                ((C10543a) PomodoroNewActivity.this.f15085i).mo42207c();
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.PomodoroNewActivity$b$b */
        class C8578b implements WheelPicker.C8878a {
            C8578b() {
            }

            /* renamed from: a */
            public void mo35700a(WheelPicker wheelPicker, Object obj, int i) {
                PomodoroNewActivity.this.f15086j = i + 1;
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.PomodoroNewActivity$b$c */
        class C8579c implements WheelPicker.C8878a {
            C8579c() {
            }

            /* renamed from: a */
            public void mo35700a(WheelPicker wheelPicker, Object obj, int i) {
                PomodoroNewActivity.this.f15087k = i + 1;
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.PomodoroNewActivity$b$d */
        class C8580d implements View.OnClickListener {
            C8580d() {
            }

            public void onClick(View view) {
                if (!((C3012e) PomodoroNewActivity.this.f15085i).mo23146k1()) {
                    ((C3012e) PomodoroNewActivity.this.f15085i).mo23148l1();
                }
                PomodoroNewActivity pomodoroNewActivity = PomodoroNewActivity.this;
                ((C10543a) PomodoroNewActivity.this.f15085i).mo42209h(pomodoroNewActivity.f15086j, pomodoroNewActivity.f15087k);
                PomodoroNewActivity pomodoroNewActivity2 = PomodoroNewActivity.this;
                pomodoroNewActivity2.f15088l.mo42731j(pomodoroNewActivity2.f15086j);
                PomodoroNewActivity pomodoroNewActivity3 = PomodoroNewActivity.this;
                pomodoroNewActivity3.f15088l.mo42727f(pomodoroNewActivity3.f15087k);
                PomodoroNewActivity pomodoroNewActivity4 = PomodoroNewActivity.this;
                ((C10543a) PomodoroNewActivity.this.f15085i).mo42206a(pomodoroNewActivity4.f15086j, pomodoroNewActivity4.f15087k);
            }
        }

        C8576b() {
        }

        public void run() {
            TextView textView;
            View.OnClickListener dVar;
            C12046i iVar = PomodoroNewActivity.this.f15088l;
            if (iVar == null || !iVar.mo42726e()) {
                PomodoroNewActivity.this.f15078b.setVisibility(0);
                PomodoroNewActivity.this.f15079c.setVisibility(8);
                PomodoroNewActivity pomodoroNewActivity = PomodoroNewActivity.this;
                C12046i iVar2 = pomodoroNewActivity.f15088l;
                int i = 15;
                int i2 = 45;
                if (iVar2 == null) {
                    pomodoroNewActivity.f15086j = 45;
                    pomodoroNewActivity.f15087k = 15;
                    pomodoroNewActivity.f15088l = new C12046i(false, 45, 15);
                } else {
                    if (iVar2.mo42725d() != 0) {
                        i2 = PomodoroNewActivity.this.f15088l.mo42725d();
                    }
                    pomodoroNewActivity.f15086j = i2;
                    PomodoroNewActivity pomodoroNewActivity2 = PomodoroNewActivity.this;
                    if (pomodoroNewActivity2.f15088l.mo42722a() != 0) {
                        i = PomodoroNewActivity.this.f15088l.mo42722a();
                    }
                    pomodoroNewActivity2.f15087k = i;
                }
                PomodoroNewActivity.this.f15080d.setMaxValue(59);
                PomodoroNewActivity.this.f15081e.setMaxValue(59);
                PomodoroNewActivity pomodoroNewActivity3 = PomodoroNewActivity.this;
                pomodoroNewActivity3.f15080d.mo36586l(pomodoroNewActivity3.f15086j - 1, false);
                PomodoroNewActivity pomodoroNewActivity4 = PomodoroNewActivity.this;
                pomodoroNewActivity4.f15081e.mo36586l(pomodoroNewActivity4.f15087k - 1, false);
                PomodoroNewActivity.this.f15080d.setOnItemSelectedListener(new C8578b());
                PomodoroNewActivity.this.f15081e.setOnItemSelectedListener(new C8579c());
                PomodoroNewActivity.this.f15083g.setText(R$string.common_text_start);
                textView = PomodoroNewActivity.this.f15083g;
                dVar = new C8580d();
            } else {
                PomodoroNewActivity.this.f15078b.setVisibility(8);
                PomodoroNewActivity.this.m20364Z();
                PomodoroNewActivity.this.f15079c.setVisibility(0);
                PomodoroNewActivity.this.f15083g.setText(R$string.common_text_stop);
                textView = PomodoroNewActivity.this.f15083g;
                dVar = new C8577a();
            }
            textView.setOnClickListener(dVar);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.PomodoroNewActivity$c */
    class C8581c extends Handler {
        C8581c() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                PomodoroNewActivity.this.f15089m.removeMessages(0);
                PomodoroNewActivity.this.m20364Z();
            }
        }
    }

    /* renamed from: Y */
    private C12046i m20363Y() {
        return (C12046i) this.f15085i.mo23221d0().mo31611r(11);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m20364Z() {
        C12046i Y = m20363Y();
        if (Y.mo42726e()) {
            if (Y.mo42724c() > 0) {
                this.f15082f.setText(String.format("%02d:%02d", new Object[]{Integer.valueOf(Y.mo42724c() / 60), Integer.valueOf(Y.mo42724c() % 60)}));
                this.f15084h.setText(R$string.pdo_txt_rest);
                Y.mo42730i(Y.mo42724c() - 1);
            } else if (Y.mo42723b() > 0) {
                this.f15082f.setText(String.format("%02d:%02d", new Object[]{Integer.valueOf(Y.mo42723b() / 60), Integer.valueOf(Y.mo42723b() % 60)}));
                this.f15084h.setText(R$string.pdo_txt_work);
                Y.mo42729h(Y.mo42723b() - 1);
            } else {
                ((C10543a) this.f15085i).mo42208g();
            }
            this.f15089m.sendEmptyMessageDelayed(0, 1000);
        }
    }

    /* renamed from: a0 */
    private void m20365a0() {
        this.f15088l = m20363Y();
        runOnUiThread(new C8576b());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_pomodoro_new);
        this.f15077a = (ImageView) findViewById(R$id.img_back_view);
        this.f15078b = (FrameLayout) findViewById(R$id.time_set_layout);
        this.f15079c = (LinearLayout) findViewById(R$id.pomodoro_time_info_layout);
        this.f15080d = (WheelPicker) findViewById(R$id.work_time_picker_view);
        this.f15081e = (WheelPicker) findViewById(R$id.rest_time_picker_view);
        this.f15082f = (TextView) findViewById(R$id.pomodoro_time_text);
        this.f15083g = (TextView) findViewById(R$id.btn_control);
        this.f15084h = (TextView) findViewById(R$id.pomodoro_time_info);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        findViewById(R$id.title_view).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f15076n, "Activity has not device id", false);
            finish();
            return;
        }
        C3010c j0 = YeelightDeviceManager.m7794j0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f15085i = j0;
        if (j0 == null) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        this.f15077a.setOnClickListener(new C8575a());
        m20365a0();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f15085i.mo23213W0(this);
        this.f15089m.removeMessages(0);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f15085i.mo23178B0(this);
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == -1 || i == 4096) {
            m20365a0();
        }
    }
}

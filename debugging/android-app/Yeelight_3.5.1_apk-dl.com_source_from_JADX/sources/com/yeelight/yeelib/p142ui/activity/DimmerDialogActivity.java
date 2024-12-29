package com.yeelight.yeelib.p142ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.C6081a;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.managers.C8263d;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.C8316i;
import com.yeelight.yeelib.utils.AppUtils;
import p227x3.C11972i;
import p237z3.C12143c;
import p237z3.C12145e;

/* renamed from: com.yeelight.yeelib.ui.activity.DimmerDialogActivity */
public class DimmerDialogActivity extends Activity implements C12143c, C12145e {

    /* renamed from: v */
    private static final String f14607v = "DimmerDialogActivity";

    /* renamed from: a */
    TextView f14608a;

    /* renamed from: b */
    LinearLayout f14609b;

    /* renamed from: c */
    TextView f14610c;

    /* renamed from: d */
    LinearLayout f14611d;

    /* renamed from: e */
    SeekBar f14612e;

    /* renamed from: f */
    SeekBar f14613f;

    /* renamed from: g */
    SeekBar f14614g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f14615h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f14616i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C3012e f14617j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f14618k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f14619l = false;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f14620m = false;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f14621n = 0;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f14622o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f14623p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f14624q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f14625r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f14626s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public float[] f14627t = new float[3];
    /* access modifiers changed from: private */

    /* renamed from: u */
    public Handler f14628u = new C8425a();

    /* renamed from: com.yeelight.yeelib.ui.activity.DimmerDialogActivity$a */
    class C8425a extends Handler {

        /* renamed from: com.yeelight.yeelib.ui.activity.DimmerDialogActivity$a$a */
        class C8426a implements C8263d.C8271h {

            /* renamed from: com.yeelight.yeelib.ui.activity.DimmerDialogActivity$a$a$a */
            class C8427a implements Runnable {
                C8427a() {
                }

                public void run() {
                    DimmerDialogActivity dimmerDialogActivity = DimmerDialogActivity.this;
                    Toast.makeText(dimmerDialogActivity, dimmerDialogActivity.getText(R$string.account_login_ouath_failed_info), 0).show();
                }
            }

            C8426a() {
            }

            public void tokenOauthFailed() {
                DimmerDialogActivity.this.runOnUiThread(new C8427a());
                BaseActivity.m19947U(DimmerDialogActivity.this);
                DimmerDialogActivity.this.finish();
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.DimmerDialogActivity$a$b */
        class C8428b implements C8263d.C8271h {

            /* renamed from: com.yeelight.yeelib.ui.activity.DimmerDialogActivity$a$b$a */
            class C8429a implements Runnable {
                C8429a() {
                }

                public void run() {
                    DimmerDialogActivity dimmerDialogActivity = DimmerDialogActivity.this;
                    Toast.makeText(dimmerDialogActivity, dimmerDialogActivity.getText(R$string.account_login_ouath_failed_info), 0).show();
                }
            }

            C8428b() {
            }

            public void tokenOauthFailed() {
                DimmerDialogActivity.this.runOnUiThread(new C8429a());
                BaseActivity.m19947U(DimmerDialogActivity.this);
                DimmerDialogActivity.this.finish();
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.DimmerDialogActivity$a$c */
        class C8430c implements C8263d.C8271h {

            /* renamed from: com.yeelight.yeelib.ui.activity.DimmerDialogActivity$a$c$a */
            class C8431a implements Runnable {
                C8431a() {
                }

                public void run() {
                    DimmerDialogActivity dimmerDialogActivity = DimmerDialogActivity.this;
                    Toast.makeText(dimmerDialogActivity, dimmerDialogActivity.getText(R$string.account_login_ouath_failed_info), 0).show();
                }
            }

            C8430c() {
            }

            public void tokenOauthFailed() {
                DimmerDialogActivity.this.runOnUiThread(new C8431a());
                BaseActivity.m19947U(DimmerDialogActivity.this);
                DimmerDialogActivity.this.finish();
            }
        }

        C8425a() {
        }

        public void handleMessage(Message message) {
            C8316i iVar;
            C8263d.C8271h hVar;
            C8263d dVar;
            switch (message.what) {
                case 1:
                    iVar = new C8316i(DimmerDialogActivity.this.f14616i, DimmerDialogActivity.this.f14615h, ActionType.BRIGHT, String.valueOf(DimmerDialogActivity.this.f14622o));
                    dVar = C8263d.m19484t();
                    hVar = new C8426a();
                    break;
                case 2:
                    DeviceStatusBase.DeviceMode z = DimmerDialogActivity.this.f14617j.mo23221d0().mo31627z();
                    DeviceStatusBase.DeviceMode deviceMode = DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE;
                    if (z != deviceMode) {
                        DimmerDialogActivity.this.f14617j.mo23165w1(deviceMode);
                    }
                    iVar = new C8316i(DimmerDialogActivity.this.f14616i, DimmerDialogActivity.this.f14615h, ActionType.CT, String.valueOf(DimmerDialogActivity.this.f14623p));
                    dVar = C8263d.m19484t();
                    hVar = new C8430c();
                    break;
                case 3:
                    DeviceStatusBase.DeviceMode z2 = DimmerDialogActivity.this.f14617j.mo23221d0().mo31627z();
                    DeviceStatusBase.DeviceMode deviceMode2 = DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR;
                    if (z2 != deviceMode2) {
                        DimmerDialogActivity.this.f14617j.mo23165w1(deviceMode2);
                    }
                    iVar = new C8316i(DimmerDialogActivity.this.f14616i, DimmerDialogActivity.this.f14615h, ActionType.COLOR, String.valueOf(DimmerDialogActivity.this.f14626s));
                    dVar = C8263d.m19484t();
                    hVar = new C8428b();
                    break;
                case 4:
                    DimmerDialogActivity.m20084p(DimmerDialogActivity.this);
                    if (DimmerDialogActivity.this.f14621n >= 3) {
                        DimmerDialogActivity.this.finish();
                    }
                    DimmerDialogActivity dimmerDialogActivity = DimmerDialogActivity.this;
                    C3012e unused = dimmerDialogActivity.f14617j = YeelightDeviceManager.m7804r0(dimmerDialogActivity.f14615h);
                    DimmerDialogActivity.this.mo35725t();
                    return;
                case 5:
                    DimmerDialogActivity dimmerDialogActivity2 = DimmerDialogActivity.this;
                    dimmerDialogActivity2.f14610c.setText(dimmerDialogActivity2.getString(R$string.common_text_status_connect_failed));
                    DimmerDialogActivity.this.f14628u.sendEmptyMessageDelayed(6, 1500);
                    return;
                case 6:
                    DimmerDialogActivity.this.finish();
                    return;
                default:
                    return;
            }
            dVar.mo35189k(iVar, hVar);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DimmerDialogActivity$b */
    class C8432b implements C8263d.C8271h {

        /* renamed from: com.yeelight.yeelib.ui.activity.DimmerDialogActivity$b$a */
        class C8433a implements Runnable {
            C8433a() {
            }

            public void run() {
                DimmerDialogActivity dimmerDialogActivity = DimmerDialogActivity.this;
                Toast.makeText(dimmerDialogActivity, dimmerDialogActivity.getText(R$string.account_login_ouath_failed_info), 0).show();
            }
        }

        C8432b() {
        }

        public void tokenOauthFailed() {
            DimmerDialogActivity.this.runOnUiThread(new C8433a());
            BaseActivity.m19947U(DimmerDialogActivity.this);
            DimmerDialogActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DimmerDialogActivity$c */
    class C8434c implements SeekBar.OnSeekBarChangeListener {
        C8434c() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                int unused = DimmerDialogActivity.this.f14622o = i;
                if (DimmerDialogActivity.this.f14622o <= 0) {
                    int unused2 = DimmerDialogActivity.this.f14622o = 1;
                }
                DimmerDialogActivity.this.f14628u.removeMessages(1);
                DimmerDialogActivity.this.f14628u.sendEmptyMessageDelayed(1, 250);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            boolean unused = DimmerDialogActivity.this.f14618k = true;
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            boolean unused = DimmerDialogActivity.this.f14618k = false;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DimmerDialogActivity$d */
    class C8435d implements SeekBar.OnSeekBarChangeListener {
        C8435d() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            DimmerDialogActivity dimmerDialogActivity;
            int c;
            if (z) {
                if (i == 100) {
                    dimmerDialogActivity = DimmerDialogActivity.this;
                    c = dimmerDialogActivity.f14625r;
                } else if (i == 0) {
                    dimmerDialogActivity = DimmerDialogActivity.this;
                    c = dimmerDialogActivity.f14624q;
                } else {
                    DimmerDialogActivity dimmerDialogActivity2 = DimmerDialogActivity.this;
                    int unused = dimmerDialogActivity2.f14623p = ((i * (dimmerDialogActivity2.f14625r - DimmerDialogActivity.this.f14624q)) / 100) + DimmerDialogActivity.this.f14624q;
                    DimmerDialogActivity.this.f14628u.removeMessages(2);
                    DimmerDialogActivity.this.f14628u.sendEmptyMessageDelayed(2, 250);
                }
                int unused2 = dimmerDialogActivity.f14623p = c;
                DimmerDialogActivity.this.f14628u.removeMessages(2);
                DimmerDialogActivity.this.f14628u.sendEmptyMessageDelayed(2, 250);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            boolean unused = DimmerDialogActivity.this.f14619l = true;
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            boolean unused = DimmerDialogActivity.this.f14619l = false;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DimmerDialogActivity$e */
    class C8436e implements SeekBar.OnSeekBarChangeListener {
        C8436e() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                DimmerDialogActivity.this.f14627t[0] = (float) i;
                DimmerDialogActivity dimmerDialogActivity = DimmerDialogActivity.this;
                int unused = dimmerDialogActivity.f14626s = Color.HSVToColor(dimmerDialogActivity.f14627t);
                DimmerDialogActivity.this.f14628u.removeMessages(3);
                DimmerDialogActivity.this.f14628u.sendEmptyMessageDelayed(3, 250);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            boolean unused = DimmerDialogActivity.this.f14620m = true;
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            boolean unused = DimmerDialogActivity.this.f14620m = false;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DimmerDialogActivity$f */
    class C8437f implements Runnable {
        C8437f() {
        }

        public void run() {
            DimmerDialogActivity.this.mo35725t();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DimmerDialogActivity$g */
    class C8438g implements Runnable {
        C8438g() {
        }

        public void run() {
            DimmerDialogActivity.this.finish();
        }
    }

    /* renamed from: p */
    static /* synthetic */ int m20084p(DimmerDialogActivity dimmerDialogActivity) {
        int i = dimmerDialogActivity.f14621n;
        dimmerDialogActivity.f14621n = i + 1;
        return i;
    }

    public void onConnectionStateChanged(int i, int i2) {
        Runnable runnable;
        if (i2 != 0) {
            if (i2 == 11) {
                if (i != -1) {
                    runnable = new C8437f();
                    runOnUiThread(runnable);
                }
            } else {
                return;
            }
        }
        if (i != -1) {
            runnable = new C8438g();
            runOnUiThread(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.activity_dimmer);
        this.f14608a = (TextView) findViewById(R$id.tv_device_name);
        this.f14609b = (LinearLayout) findViewById(R$id.prompt_layout);
        this.f14610c = (TextView) findViewById(R$id.prompt_text);
        this.f14611d = (LinearLayout) findViewById(R$id.dimmer_layout);
        this.f14612e = (SeekBar) findViewById(R$id.bright_bar);
        this.f14613f = (SeekBar) findViewById(R$id.color_temp_bar);
        this.f14614g = (SeekBar) findViewById(R$id.color_bar);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f14607v, "Activity has no device id", false);
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("com.yeelight.cherry.device_id");
        this.f14615h = stringExtra;
        this.f14617j = YeelightDeviceManager.m7804r0(stringExtra);
        this.f14616i = intent.getStringExtra("com.yeelight.cherry.type");
        mo35725t();
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    public void onPause() {
        super.onPause();
        this.f14628u.removeCallbacksAndMessages((Object) null);
        C3012e eVar = this.f14617j;
        if (eVar != null) {
            eVar.mo23133V0(this);
            this.f14617j.mo23213W0(this);
        }
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        SeekBar seekBar;
        int i2;
        if (i == 8) {
            this.f14622o = deviceStatusBase.mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT ? deviceStatusBase.mo31536F() : deviceStatusBase.mo31601m();
            if (!this.f14618k) {
                seekBar = this.f14612e;
                i2 = this.f14622o;
            } else {
                return;
            }
        } else if (i == 16) {
            int n = deviceStatusBase.mo31603n();
            this.f14626s = n;
            if (!this.f14620m) {
                Color.colorToHSV(n, this.f14627t);
                if (this.f14627t[0] != 0.0f || this.f14614g.getProgress() != 360) {
                    seekBar = this.f14614g;
                    i2 = (int) this.f14627t[0];
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (i == 32) {
            this.f14623p = deviceStatusBase.mo31607p();
            if (this.f14624q == 0 || this.f14625r == 0) {
                this.f14624q = C11972i.m30704b(this.f14617j.mo23144i1()).mo42547b();
                this.f14625r = C11972i.m30704b(this.f14617j.mo23144i1()).mo42546a();
            }
            if (!this.f14619l) {
                seekBar = this.f14613f;
                int i3 = this.f14623p;
                int i4 = this.f14624q;
                i2 = ((i3 - i4) * 100) / (this.f14625r - i4);
            } else {
                return;
            }
        } else {
            return;
        }
        seekBar.setProgress(i2);
    }

    /* renamed from: t */
    public void mo35725t() {
        C3012e eVar = this.f14617j;
        if (eVar == null) {
            C8263d.m19484t();
            this.f14628u.sendEmptyMessageDelayed(4, 2000);
            return;
        }
        this.f14608a.setText(eVar.mo23210U());
        C3012e eVar2 = this.f14617j;
        if (!(eVar2 instanceof C6081a)) {
            C8263d.m19484t().mo35189k(new C8316i(this.f14616i, this.f14615h, ActionType.ON, ""), new C8432b());
            this.f14617j.mo23178B0(this);
            this.f14609b.setVisibility(8);
            this.f14611d.setVisibility(0);
            if (!C11972i.m30711i(this.f14617j.mo23144i1(), 2)) {
                this.f14612e.setVisibility(8);
            } else {
                this.f14612e.setMax(100);
                this.f14622o = this.f14617j.mo23221d0().mo31627z() == DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT ? this.f14617j.mo23221d0().mo31536F() : this.f14617j.mo23221d0().mo31601m();
                this.f14612e.setProgress(this.f14622o);
                this.f14612e.setOnSeekBarChangeListener(new C8434c());
            }
            if (!C11972i.m30711i(this.f14617j.mo23144i1(), 4)) {
                this.f14613f.setVisibility(8);
            } else {
                this.f14613f.setMax(100);
                this.f14623p = this.f14617j.mo23221d0().mo31607p();
                this.f14624q = C11972i.m30704b(this.f14617j.mo23144i1()).mo42547b();
                int a = C11972i.m30704b(this.f14617j.mo23144i1()).mo42546a();
                this.f14625r = a;
                SeekBar seekBar = this.f14613f;
                int i = this.f14623p;
                int i2 = this.f14624q;
                seekBar.setProgress(((i - i2) * 100) / (a - i2));
                this.f14613f.setOnSeekBarChangeListener(new C8435d());
            }
            if (!C11972i.m30711i(this.f14617j.mo23144i1(), 8)) {
                this.f14614g.setVisibility(8);
            } else {
                this.f14614g.setMax(360);
                float[] fArr = this.f14627t;
                fArr[1] = 1.0f;
                fArr[2] = 1.0f;
                int n = this.f14617j.mo23221d0().mo31603n();
                this.f14626s = n;
                Color.colorToHSV(n, this.f14627t);
                this.f14614g.setProgress((int) this.f14627t[0]);
                this.f14614g.setOnSeekBarChangeListener(new C8436e());
            }
        } else if (eVar2.mo23230o0()) {
            this.f14617j.mo23151n();
        } else {
            this.f14628u.sendEmptyMessage(5);
        }
        this.f14617j.mo23171z0(this);
    }
}

package com.yeelight.yeelib.p194ui.activity;

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
import com.yeelight.yeelib.device.models.C7632k;
import com.yeelight.yeelib.p150c.C5972a;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C9775d;
import com.yeelight.yeelib.p153g.C9840j;
import com.yeelight.yeelib.p185d.C7563a;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.yeelib.ui.activity.DimmerDialogActivity */
public class DimmerDialogActivity extends Activity implements C9768c, C9770e {

    /* renamed from: v */
    private static final String f18299v = DimmerDialogActivity.class.getSimpleName();

    /* renamed from: a */
    TextView f18300a;

    /* renamed from: b */
    LinearLayout f18301b;

    /* renamed from: c */
    TextView f18302c;

    /* renamed from: d */
    LinearLayout f18303d;

    /* renamed from: e */
    SeekBar f18304e;

    /* renamed from: f */
    SeekBar f18305f;

    /* renamed from: g */
    SeekBar f18306g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f18307h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f18308i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C4200i f18309j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f18310k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f18311l = false;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f18312m = false;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f18313n = 0;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f18314o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f18315p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f18316q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f18317r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f18318s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public float[] f18319t = new float[3];
    /* access modifiers changed from: private */

    /* renamed from: u */
    public Handler f18320u = new C10007a();

    /* renamed from: com.yeelight.yeelib.ui.activity.DimmerDialogActivity$a */
    class C10007a extends Handler {

        /* renamed from: com.yeelight.yeelib.ui.activity.DimmerDialogActivity$a$a */
        class C10008a implements C9775d.C9783h {

            /* renamed from: com.yeelight.yeelib.ui.activity.DimmerDialogActivity$a$a$a */
            class C10009a implements Runnable {
                C10009a() {
                }

                public void run() {
                    DimmerDialogActivity dimmerDialogActivity = DimmerDialogActivity.this;
                    Toast.makeText(dimmerDialogActivity, dimmerDialogActivity.getText(R$string.account_login_ouath_failed_info), 0).show();
                }
            }

            C10008a() {
            }

            public void tokenOauthFailed() {
                DimmerDialogActivity.this.runOnUiThread(new C10009a());
                BaseActivity.m24384U(DimmerDialogActivity.this);
                DimmerDialogActivity.this.finish();
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.DimmerDialogActivity$a$b */
        class C10010b implements C9775d.C9783h {

            /* renamed from: com.yeelight.yeelib.ui.activity.DimmerDialogActivity$a$b$a */
            class C10011a implements Runnable {
                C10011a() {
                }

                public void run() {
                    DimmerDialogActivity dimmerDialogActivity = DimmerDialogActivity.this;
                    Toast.makeText(dimmerDialogActivity, dimmerDialogActivity.getText(R$string.account_login_ouath_failed_info), 0).show();
                }
            }

            C10010b() {
            }

            public void tokenOauthFailed() {
                DimmerDialogActivity.this.runOnUiThread(new C10011a());
                BaseActivity.m24384U(DimmerDialogActivity.this);
                DimmerDialogActivity.this.finish();
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.DimmerDialogActivity$a$c */
        class C10012c implements C9775d.C9783h {

            /* renamed from: com.yeelight.yeelib.ui.activity.DimmerDialogActivity$a$c$a */
            class C10013a implements Runnable {
                C10013a() {
                }

                public void run() {
                    DimmerDialogActivity dimmerDialogActivity = DimmerDialogActivity.this;
                    Toast.makeText(dimmerDialogActivity, dimmerDialogActivity.getText(R$string.account_login_ouath_failed_info), 0).show();
                }
            }

            C10012c() {
            }

            public void tokenOauthFailed() {
                DimmerDialogActivity.this.runOnUiThread(new C10013a());
                BaseActivity.m24384U(DimmerDialogActivity.this);
                DimmerDialogActivity.this.finish();
            }
        }

        C10007a() {
        }

        public void handleMessage(Message message) {
            C9840j jVar;
            C9775d.C9783h hVar;
            C9775d dVar;
            switch (message.what) {
                case 1:
                    jVar = new C9840j(DimmerDialogActivity.this.f18308i, DimmerDialogActivity.this.f18307h, C7563a.BRIGHT, String.valueOf(DimmerDialogActivity.this.f18314o));
                    dVar = C9775d.m23684t();
                    hVar = new C10008a();
                    break;
                case 2:
                    if (DimmerDialogActivity.this.f18309j.mo23408d0().mo27726z() != C6024e.C6028d.DEVICE_MODE_SUNSHINE) {
                        DimmerDialogActivity.this.f18309j.mo23352w1(C6024e.C6028d.DEVICE_MODE_SUNSHINE);
                    }
                    jVar = new C9840j(DimmerDialogActivity.this.f18308i, DimmerDialogActivity.this.f18307h, C7563a.CT, String.valueOf(DimmerDialogActivity.this.f18315p));
                    dVar = C9775d.m23684t();
                    hVar = new C10012c();
                    break;
                case 3:
                    if (DimmerDialogActivity.this.f18309j.mo23408d0().mo27726z() != C6024e.C6028d.DEVICE_MODE_COLOR) {
                        DimmerDialogActivity.this.f18309j.mo23352w1(C6024e.C6028d.DEVICE_MODE_COLOR);
                    }
                    jVar = new C9840j(DimmerDialogActivity.this.f18308i, DimmerDialogActivity.this.f18307h, C7563a.COLOR, String.valueOf(DimmerDialogActivity.this.f18318s));
                    dVar = C9775d.m23684t();
                    hVar = new C10010b();
                    break;
                case 4:
                    DimmerDialogActivity.m24494p(DimmerDialogActivity.this);
                    if (DimmerDialogActivity.this.f18313n >= 3) {
                        DimmerDialogActivity.this.finish();
                    }
                    DimmerDialogActivity dimmerDialogActivity = DimmerDialogActivity.this;
                    C4200i unused = dimmerDialogActivity.f18309j = C4257w.m11953o0(dimmerDialogActivity.f18307h);
                    DimmerDialogActivity.this.mo32285t();
                    return;
                case 5:
                    DimmerDialogActivity dimmerDialogActivity2 = DimmerDialogActivity.this;
                    dimmerDialogActivity2.f18302c.setText(dimmerDialogActivity2.getString(R$string.common_text_status_connect_failed));
                    DimmerDialogActivity.this.f18320u.sendEmptyMessageDelayed(6, 1500);
                    return;
                case 6:
                    DimmerDialogActivity.this.finish();
                    return;
                default:
                    return;
            }
            dVar.mo31613k(jVar, hVar);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DimmerDialogActivity$b */
    class C10014b implements C9775d.C9783h {

        /* renamed from: com.yeelight.yeelib.ui.activity.DimmerDialogActivity$b$a */
        class C10015a implements Runnable {
            C10015a() {
            }

            public void run() {
                DimmerDialogActivity dimmerDialogActivity = DimmerDialogActivity.this;
                Toast.makeText(dimmerDialogActivity, dimmerDialogActivity.getText(R$string.account_login_ouath_failed_info), 0).show();
            }
        }

        C10014b() {
        }

        public void tokenOauthFailed() {
            DimmerDialogActivity.this.runOnUiThread(new C10015a());
            BaseActivity.m24384U(DimmerDialogActivity.this);
            DimmerDialogActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DimmerDialogActivity$c */
    class C10016c implements SeekBar.OnSeekBarChangeListener {
        C10016c() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                int unused = DimmerDialogActivity.this.f18314o = i;
                if (DimmerDialogActivity.this.f18314o <= 0) {
                    int unused2 = DimmerDialogActivity.this.f18314o = 1;
                }
                DimmerDialogActivity.this.f18320u.removeMessages(1);
                DimmerDialogActivity.this.f18320u.sendEmptyMessageDelayed(1, 250);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            boolean unused = DimmerDialogActivity.this.f18310k = true;
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            boolean unused = DimmerDialogActivity.this.f18310k = false;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DimmerDialogActivity$d */
    class C10017d implements SeekBar.OnSeekBarChangeListener {
        C10017d() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            DimmerDialogActivity dimmerDialogActivity;
            int c;
            if (z) {
                if (i == 100) {
                    dimmerDialogActivity = DimmerDialogActivity.this;
                    c = dimmerDialogActivity.f18317r;
                } else if (i == 0) {
                    dimmerDialogActivity = DimmerDialogActivity.this;
                    c = dimmerDialogActivity.f18316q;
                } else {
                    DimmerDialogActivity dimmerDialogActivity2 = DimmerDialogActivity.this;
                    int unused = dimmerDialogActivity2.f18315p = ((i * (dimmerDialogActivity2.f18317r - DimmerDialogActivity.this.f18316q)) / 100) + DimmerDialogActivity.this.f18316q;
                    DimmerDialogActivity.this.f18320u.removeMessages(2);
                    DimmerDialogActivity.this.f18320u.sendEmptyMessageDelayed(2, 250);
                }
                int unused2 = dimmerDialogActivity.f18315p = c;
                DimmerDialogActivity.this.f18320u.removeMessages(2);
                DimmerDialogActivity.this.f18320u.sendEmptyMessageDelayed(2, 250);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            boolean unused = DimmerDialogActivity.this.f18311l = true;
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            boolean unused = DimmerDialogActivity.this.f18311l = false;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DimmerDialogActivity$e */
    class C10018e implements SeekBar.OnSeekBarChangeListener {
        C10018e() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                DimmerDialogActivity.this.f18319t[0] = (float) i;
                DimmerDialogActivity dimmerDialogActivity = DimmerDialogActivity.this;
                int unused = dimmerDialogActivity.f18318s = Color.HSVToColor(dimmerDialogActivity.f18319t);
                DimmerDialogActivity.this.f18320u.removeMessages(3);
                DimmerDialogActivity.this.f18320u.sendEmptyMessageDelayed(3, 250);
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            boolean unused = DimmerDialogActivity.this.f18312m = true;
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            boolean unused = DimmerDialogActivity.this.f18312m = false;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DimmerDialogActivity$f */
    class C10019f implements Runnable {
        C10019f() {
        }

        public void run() {
            DimmerDialogActivity.this.mo32285t();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DimmerDialogActivity$g */
    class C10020g implements Runnable {
        C10020g() {
        }

        public void run() {
            DimmerDialogActivity.this.finish();
        }
    }

    /* renamed from: p */
    static /* synthetic */ int m24494p(DimmerDialogActivity dimmerDialogActivity) {
        int i = dimmerDialogActivity.f18313n;
        dimmerDialogActivity.f18313n = i + 1;
        return i;
    }

    public void onConnectionStateChanged(int i, int i2) {
        Runnable runnable;
        if (i2 != 0) {
            if (i2 == 11) {
                if (i != -1) {
                    runnable = new C10019f();
                    runOnUiThread(runnable);
                }
            } else {
                return;
            }
        }
        if (i != -1) {
            runnable = new C10020g();
            runOnUiThread(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.activity_dimmer);
        this.f18300a = (TextView) findViewById(R$id.tv_device_name);
        this.f18301b = (LinearLayout) findViewById(R$id.prompt_layout);
        this.f18302c = (TextView) findViewById(R$id.prompt_text);
        this.f18303d = (LinearLayout) findViewById(R$id.dimmer_layout);
        this.f18304e = (SeekBar) findViewById(R$id.bright_bar);
        this.f18305f = (SeekBar) findViewById(R$id.color_temp_bar);
        this.f18306g = (SeekBar) findViewById(R$id.color_bar);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18299v, "Activity has no device id", false);
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("com.yeelight.cherry.device_id");
        this.f18307h = stringExtra;
        this.f18309j = C4257w.m11953o0(stringExtra);
        this.f18308i = intent.getStringExtra("com.yeelight.cherry.type");
        mo32285t();
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    public void onPause() {
        super.onPause();
        this.f18320u.removeCallbacksAndMessages((Object) null);
        C4200i iVar = this.f18309j;
        if (iVar != null) {
            iVar.mo23319V0(this);
            this.f18309j.mo23400W0(this);
        }
    }

    public void onStatusChange(int i, C6024e eVar) {
        SeekBar seekBar;
        int i2;
        if (i == 8) {
            this.f18314o = eVar.mo27726z() == C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT ? eVar.mo27635E() : eVar.mo27700m();
            if (!this.f18310k) {
                seekBar = this.f18304e;
                i2 = this.f18314o;
            } else {
                return;
            }
        } else if (i == 16) {
            int n = eVar.mo27702n();
            this.f18318s = n;
            if (!this.f18312m) {
                Color.colorToHSV(n, this.f18319t);
                if (this.f18319t[0] != 0.0f || this.f18306g.getProgress() != 360) {
                    seekBar = this.f18306g;
                    i2 = (int) this.f18319t[0];
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (i == 32) {
            this.f18315p = eVar.mo27706p();
            if (this.f18316q == 0 || this.f18317r == 0) {
                this.f18316q = C7632k.m22541b(this.f18309j.mo23330i1()).mo29080b();
                this.f18317r = C7632k.m22541b(this.f18309j.mo23330i1()).mo29079a();
            }
            if (!this.f18311l) {
                seekBar = this.f18305f;
                int i3 = this.f18315p;
                int i4 = this.f18316q;
                i2 = ((i3 - i4) * 100) / (this.f18317r - i4);
            } else {
                return;
            }
        } else {
            return;
        }
        seekBar.setProgress(i2);
    }

    /* renamed from: t */
    public void mo32285t() {
        C4200i iVar = this.f18309j;
        if (iVar == null) {
            C9775d.m23684t();
            this.f18320u.sendEmptyMessageDelayed(4, 2000);
            return;
        }
        this.f18300a.setText(iVar.mo23397U());
        C4200i iVar2 = this.f18309j;
        if (!(iVar2 instanceof C5972a)) {
            C9775d.m23684t().mo31613k(new C9840j(this.f18308i, this.f18307h, C7563a.ON, ""), new C10014b());
            this.f18309j.mo23365B0(this);
            this.f18301b.setVisibility(8);
            this.f18303d.setVisibility(0);
            if (!C7632k.m22548i(this.f18309j.mo23330i1(), 2)) {
                this.f18304e.setVisibility(8);
            } else {
                this.f18304e.setMax(100);
                this.f18314o = this.f18309j.mo23408d0().mo27726z() == C6024e.C6028d.DEVICE_MODE_NIGHT_LIGHT ? this.f18309j.mo23408d0().mo27635E() : this.f18309j.mo23408d0().mo27700m();
                this.f18304e.setProgress(this.f18314o);
                this.f18304e.setOnSeekBarChangeListener(new C10016c());
            }
            if (!C7632k.m22548i(this.f18309j.mo23330i1(), 4)) {
                this.f18305f.setVisibility(8);
            } else {
                this.f18305f.setMax(100);
                this.f18315p = this.f18309j.mo23408d0().mo27706p();
                this.f18316q = C7632k.m22541b(this.f18309j.mo23330i1()).mo29080b();
                int a = C7632k.m22541b(this.f18309j.mo23330i1()).mo29079a();
                this.f18317r = a;
                SeekBar seekBar = this.f18305f;
                int i = this.f18315p;
                int i2 = this.f18316q;
                seekBar.setProgress(((i - i2) * 100) / (a - i2));
                this.f18305f.setOnSeekBarChangeListener(new C10017d());
            }
            if (!C7632k.m22548i(this.f18309j.mo23330i1(), 8)) {
                this.f18306g.setVisibility(8);
            } else {
                this.f18306g.setMax(360);
                float[] fArr = this.f18319t;
                fArr[1] = 1.0f;
                fArr[2] = 1.0f;
                int n = this.f18309j.mo23408d0().mo27702n();
                this.f18318s = n;
                Color.colorToHSV(n, this.f18319t);
                this.f18306g.setProgress((int) this.f18319t[0]);
                this.f18306g.setOnSeekBarChangeListener(new C10018e());
            }
        } else if (iVar2.mo23416o0()) {
            this.f18309j.mo23337n();
        } else {
            this.f18320u.sendEmptyMessage(5);
        }
        this.f18309j.mo23358z0(this);
    }
}

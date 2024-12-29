package com.yeelight.yeelib.p194ui.activity;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.StringRes;
import com.miot.api.CompletionHandler;
import com.miot.api.DeviceManager;
import com.miot.api.MiotManager;
import com.miot.common.abstractdevice.AbstractService;
import com.miot.common.device.Action;
import com.miot.common.exception.MiotException;
import com.miot.common.timer.CrontabTime;
import com.miot.common.timer.DayOfWeek;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.R$style;
import com.yeelight.yeelib.device.models.C7632k;
import com.yeelight.yeelib.device.models.C7638m0;
import com.yeelight.yeelib.device.models.YeelightTimer;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6033g;
import com.yeelight.yeelib.p150c.p151i.C6050n;
import com.yeelight.yeelib.p150c.p151i.C6072p;
import com.yeelight.yeelib.p150c.p184n.C7561k;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p153g.C4300b0;
import com.yeelight.yeelib.p153g.C9830b;
import com.yeelight.yeelib.p153g.C9833d;
import com.yeelight.yeelib.p153g.C9835f;
import com.yeelight.yeelib.p153g.C9836g;
import com.yeelight.yeelib.p153g.C9851t;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p191j.p192a.C9878a;
import com.yeelight.yeelib.p191j.p192a.C9891b;
import com.yeelight.yeelib.p191j.p192a.C9897c;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.view.TimePicker;
import com.yeelight.yeelib.p194ui.widget.C10521d;
import com.yeelight.yeelib.utils.C10536b0;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.Calendar;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity */
public class WifiLightAlarmDetailActivity extends BaseActivity implements C9768c {

    /* renamed from: Q */
    private static final String f19040Q = WifiLightAlarmDetailActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f19041A;

    /* renamed from: B */
    private boolean f19042B;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f19043G;

    /* renamed from: H */
    private String f19044H = "";

    /* renamed from: I */
    private String f19045I = "";

    /* renamed from: J */
    private String f19046J = "";

    /* renamed from: K */
    private String f19047K = "";

    /* renamed from: L */
    private String f19048L;

    /* renamed from: M */
    private String f19049M;

    /* renamed from: N */
    private boolean f19050N = true;

    /* renamed from: O */
    private boolean f19051O = true;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public boolean f19052P = false;

    /* renamed from: b */
    CommonTitleBar f19053b;

    /* renamed from: c */
    LinearLayout f19054c;

    /* renamed from: d */
    LinearLayout f19055d;

    /* renamed from: e */
    LinearLayout f19056e;

    /* renamed from: f */
    TextView f19057f;

    /* renamed from: g */
    TextView f19058g;

    /* renamed from: h */
    TextView f19059h;

    /* renamed from: i */
    LinearLayout f19060i;

    /* renamed from: j */
    TextView f19061j;

    /* renamed from: k */
    LinearLayout f19062k;

    /* renamed from: l */
    TextView f19063l;

    /* renamed from: m */
    TextView f19064m;

    /* renamed from: n */
    View f19065n;

    /* renamed from: o */
    Action f19066o;

    /* renamed from: p */
    Action f19067p;

    /* renamed from: q */
    C7638m0[] f19068q;

    /* renamed from: r */
    C7638m0[] f19069r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public YeelightTimer f19070s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f19071t = false;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C4198d f19072u;

    /* renamed from: v */
    private String f19073v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public String f19074w;

    /* renamed from: x */
    private String f19075x;

    /* renamed from: y */
    private String f19076y;

    /* renamed from: z */
    private boolean f19077z;

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$a */
    class C10269a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f19078a;

        /* renamed from: b */
        final /* synthetic */ int f19079b;

        /* renamed from: c */
        final /* synthetic */ TimePicker f19080c;

        C10269a(Dialog dialog, int i, TimePicker timePicker) {
            this.f19078a = dialog;
            this.f19079b = i;
            this.f19080c = timePicker;
        }

        public void onClick(View view) {
            CrontabTime crontabTime;
            this.f19078a.dismiss();
            if (this.f19079b == 0) {
                WifiLightAlarmDetailActivity.this.f19070s.setTimerStartEnabled(true);
                boolean unused = WifiLightAlarmDetailActivity.this.f19041A = true;
                WifiLightAlarmDetailActivity.this.f19070s.mo29031e().setHour(this.f19080c.getCurrentHour().intValue());
                crontabTime = WifiLightAlarmDetailActivity.this.f19070s.mo29031e();
            } else {
                WifiLightAlarmDetailActivity.this.f19070s.setTimerEndEnabled(true);
                boolean unused2 = WifiLightAlarmDetailActivity.this.f19043G = true;
                WifiLightAlarmDetailActivity.this.f19070s.mo29030d().setHour(this.f19080c.getCurrentHour().intValue());
                crontabTime = WifiLightAlarmDetailActivity.this.f19070s.mo29030d();
            }
            crontabTime.setMinute(this.f19080c.getCurrentMinute().intValue());
            if (YeelightTimer.m22454i(WifiLightAlarmDetailActivity.this.f19070s.mo29031e()) == YeelightTimer.C7609b.REPEAT_ONCE) {
                WifiLightAlarmDetailActivity.this.m24888A0();
            }
            WifiLightAlarmDetailActivity.this.m24894G0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$b */
    class C10270b implements C9878a.C9889k {

        /* renamed from: a */
        final /* synthetic */ C9878a f19082a;

        /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$b$a */
        class C10271a implements C9878a.C9888j {
            C10271a() {
            }

            /* renamed from: a */
            public void mo31988a(boolean[] zArr) {
                WifiLightAlarmDetailActivity.this.f19070s.mo29031e().setMonth("*");
                WifiLightAlarmDetailActivity.this.f19070s.mo29031e().setDay("*");
                WifiLightAlarmDetailActivity.this.f19070s.mo29030d().setMonth("*");
                WifiLightAlarmDetailActivity.this.f19070s.mo29030d().setDay("*");
                WifiLightAlarmDetailActivity.this.f19070s.mo29031e().getDayOfWeeks().clear();
                WifiLightAlarmDetailActivity.this.f19070s.mo29030d().getDayOfWeeks().clear();
                for (int i = 0; i < zArr.length; i++) {
                    if (zArr[i]) {
                        WifiLightAlarmDetailActivity.this.f19070s.mo29031e().getDayOfWeeks().add(DayOfWeek.valueOf(i));
                        WifiLightAlarmDetailActivity.this.f19070s.mo29030d().getDayOfWeeks().add(DayOfWeek.valueOf(i));
                    }
                }
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$b$b */
        class C10272b implements DialogInterface.OnDismissListener {
            C10272b() {
            }

            public void onDismiss(DialogInterface dialogInterface) {
                WifiLightAlarmDetailActivity.this.m24893F0();
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$b$c */
        class C10273c implements DialogInterface.OnDismissListener {

            /* renamed from: a */
            final /* synthetic */ C9878a f19086a;

            C10273c(C10270b bVar, C9878a aVar) {
                this.f19086a = aVar;
            }

            public void onDismiss(DialogInterface dialogInterface) {
                this.f19086a.show();
            }
        }

        C10270b(C9878a aVar) {
            this.f19082a = aVar;
        }

        /* renamed from: a */
        public void mo31989a(int i) {
            List<DayOfWeek> list;
            DayOfWeek dayOfWeek;
            if (i != 0) {
                if (i == 1) {
                    WifiLightAlarmDetailActivity.this.f19070s.mo29031e().setMonth("*");
                    WifiLightAlarmDetailActivity.this.f19070s.mo29031e().setDay("*");
                    WifiLightAlarmDetailActivity.this.f19070s.mo29030d().setMonth("*");
                    WifiLightAlarmDetailActivity.this.f19070s.mo29030d().setDay("*");
                    WifiLightAlarmDetailActivity.this.f19070s.mo29031e().getDayOfWeeks().clear();
                    WifiLightAlarmDetailActivity.this.f19070s.mo29031e().getDayOfWeeks().add(DayOfWeek.SUNDAY);
                    WifiLightAlarmDetailActivity.this.f19070s.mo29031e().getDayOfWeeks().add(DayOfWeek.MONDAY);
                    WifiLightAlarmDetailActivity.this.f19070s.mo29031e().getDayOfWeeks().add(DayOfWeek.TUESDAY);
                    WifiLightAlarmDetailActivity.this.f19070s.mo29031e().getDayOfWeeks().add(DayOfWeek.WEDNESDAY);
                    WifiLightAlarmDetailActivity.this.f19070s.mo29031e().getDayOfWeeks().add(DayOfWeek.THURSDAY);
                    WifiLightAlarmDetailActivity.this.f19070s.mo29031e().getDayOfWeeks().add(DayOfWeek.FRIDAY);
                    WifiLightAlarmDetailActivity.this.f19070s.mo29031e().getDayOfWeeks().add(DayOfWeek.SATURDAY);
                    WifiLightAlarmDetailActivity.this.f19070s.mo29030d().getDayOfWeeks().clear();
                    WifiLightAlarmDetailActivity.this.f19070s.mo29030d().getDayOfWeeks().add(DayOfWeek.SUNDAY);
                    WifiLightAlarmDetailActivity.this.f19070s.mo29030d().getDayOfWeeks().add(DayOfWeek.MONDAY);
                    WifiLightAlarmDetailActivity.this.f19070s.mo29030d().getDayOfWeeks().add(DayOfWeek.TUESDAY);
                    WifiLightAlarmDetailActivity.this.f19070s.mo29030d().getDayOfWeeks().add(DayOfWeek.WEDNESDAY);
                    WifiLightAlarmDetailActivity.this.f19070s.mo29030d().getDayOfWeeks().add(DayOfWeek.THURSDAY);
                    WifiLightAlarmDetailActivity.this.f19070s.mo29030d().getDayOfWeeks().add(DayOfWeek.FRIDAY);
                    list = WifiLightAlarmDetailActivity.this.f19070s.mo29030d().getDayOfWeeks();
                    dayOfWeek = DayOfWeek.SATURDAY;
                } else if (i == 2) {
                    WifiLightAlarmDetailActivity.this.f19070s.mo29031e().setMonth("*");
                    WifiLightAlarmDetailActivity.this.f19070s.mo29031e().setDay("*");
                    WifiLightAlarmDetailActivity.this.f19070s.mo29030d().setMonth("*");
                    WifiLightAlarmDetailActivity.this.f19070s.mo29030d().setDay("*");
                    WifiLightAlarmDetailActivity.this.f19070s.mo29031e().getDayOfWeeks().clear();
                    WifiLightAlarmDetailActivity.this.f19070s.mo29031e().getDayOfWeeks().add(DayOfWeek.MONDAY);
                    WifiLightAlarmDetailActivity.this.f19070s.mo29031e().getDayOfWeeks().add(DayOfWeek.TUESDAY);
                    WifiLightAlarmDetailActivity.this.f19070s.mo29031e().getDayOfWeeks().add(DayOfWeek.WEDNESDAY);
                    WifiLightAlarmDetailActivity.this.f19070s.mo29031e().getDayOfWeeks().add(DayOfWeek.THURSDAY);
                    WifiLightAlarmDetailActivity.this.f19070s.mo29031e().getDayOfWeeks().add(DayOfWeek.FRIDAY);
                    WifiLightAlarmDetailActivity.this.f19070s.mo29030d().getDayOfWeeks().clear();
                    WifiLightAlarmDetailActivity.this.f19070s.mo29030d().getDayOfWeeks().add(DayOfWeek.MONDAY);
                    WifiLightAlarmDetailActivity.this.f19070s.mo29030d().getDayOfWeeks().add(DayOfWeek.TUESDAY);
                    WifiLightAlarmDetailActivity.this.f19070s.mo29030d().getDayOfWeeks().add(DayOfWeek.WEDNESDAY);
                    WifiLightAlarmDetailActivity.this.f19070s.mo29030d().getDayOfWeeks().add(DayOfWeek.THURSDAY);
                    list = WifiLightAlarmDetailActivity.this.f19070s.mo29030d().getDayOfWeeks();
                    dayOfWeek = DayOfWeek.FRIDAY;
                } else if (i == 3) {
                    C9878a m = C9878a.m24241m(WifiLightAlarmDetailActivity.this, 2);
                    m.mo31971o(WifiLightAlarmDetailActivity.this.f19070s);
                    m.mo31975r(new C10271a());
                    m.setOnDismissListener(new C10272b());
                    this.f19082a.setOnDismissListener(new C10273c(this, m));
                }
                list.add(dayOfWeek);
            } else {
                WifiLightAlarmDetailActivity.this.f19070s.mo29031e().setMonth(String.valueOf(Calendar.getInstance().get(2) + 1));
                WifiLightAlarmDetailActivity.this.f19070s.mo29031e().setDay(String.valueOf(Calendar.getInstance().get(5)));
                WifiLightAlarmDetailActivity.this.f19070s.mo29030d().setMonth(String.valueOf(Calendar.getInstance().get(2) + 1));
                WifiLightAlarmDetailActivity.this.f19070s.mo29030d().setDay(String.valueOf(Calendar.getInstance().get(5)));
                WifiLightAlarmDetailActivity.this.f19070s.mo29031e().getDayOfWeeks().clear();
                WifiLightAlarmDetailActivity.this.f19070s.mo29030d().getDayOfWeeks().clear();
            }
            WifiLightAlarmDetailActivity.this.m24893F0();
            this.f19082a.dismiss();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$c */
    class C10274c implements C9897c.C9901d {
        C10274c() {
        }

        /* renamed from: a */
        public void mo27312a(String str, C9897c cVar) {
            WifiLightAlarmDetailActivity.this.m24922y0();
            cVar.dismiss();
            WifiLightAlarmDetailActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$d */
    class C10275d implements C9897c.C9901d {
        C10275d() {
        }

        /* renamed from: a */
        public void mo27312a(String str, C9897c cVar) {
            cVar.dismiss();
            WifiLightAlarmDetailActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$e */
    class C10276e implements DialogInterface.OnClickListener {
        C10276e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WifiLightAlarmDetailActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$f */
    class C10277f implements DialogInterface.OnClickListener {
        C10277f(WifiLightAlarmDetailActivity wifiLightAlarmDetailActivity) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$g */
    class C10278g implements CompletionHandler {
        C10278g() {
        }

        public void onFailed(int i, String str) {
            boolean unused = WifiLightAlarmDetailActivity.this.f19052P = false;
        }

        public void onSucceed() {
            WifiLightAlarmDetailActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$h */
    class C10279h implements DeviceManager.AddTimerCompletionHandler {
        C10279h() {
        }

        public void onFailed(int i, String str) {
            boolean unused = WifiLightAlarmDetailActivity.this.f19052P = false;
        }

        public void onSucceed(long j) {
            WifiLightAlarmDetailActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$i */
    class C10280i implements View.OnClickListener {
        C10280i() {
        }

        public void onClick(View view) {
            WifiLightAlarmDetailActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$j */
    class C10281j implements View.OnClickListener {
        C10281j() {
        }

        public void onClick(View view) {
            if (WifiLightAlarmDetailActivity.this.m24914o0() && !WifiLightAlarmDetailActivity.this.f19052P) {
                boolean unused = WifiLightAlarmDetailActivity.this.f19052P = true;
                WifiLightAlarmDetailActivity.this.m24922y0();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$k */
    class C10282k implements View.OnClickListener {
        C10282k() {
        }

        public void onClick(View view) {
            WifiLightAlarmDetailActivity.this.mo32569x0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$l */
    class C10283l implements View.OnClickListener {
        C10283l() {
        }

        public void onClick(View view) {
            if (WifiLightAlarmDetailActivity.this.f19072u instanceof C6006h) {
                if (!WifiLightAlarmDetailActivity.this.f19071t || !WifiLightAlarmDetailActivity.this.f19041A) {
                    WifiLightAlarmDetailActivity wifiLightAlarmDetailActivity = WifiLightAlarmDetailActivity.this;
                    wifiLightAlarmDetailActivity.f19066o = ((AbstractService) ((C6006h) wifiLightAlarmDetailActivity.f19072u).mo27560F1()).newAction(WifiLightAlarmDetailActivity.this.f19072u.mo23401X());
                    WifiLightAlarmDetailActivity.this.f19066o.setArgumentValue("Power", "on");
                }
            } else if (!(WifiLightAlarmDetailActivity.this.f19072u instanceof C6050n)) {
                return;
            } else {
                if (!WifiLightAlarmDetailActivity.this.f19071t || !WifiLightAlarmDetailActivity.this.f19041A) {
                    WifiLightAlarmDetailActivity wifiLightAlarmDetailActivity2 = WifiLightAlarmDetailActivity.this;
                    wifiLightAlarmDetailActivity2.f19068q = ((C6050n) wifiLightAlarmDetailActivity2.f19072u).mo27831O1(true);
                }
            }
            WifiLightAlarmDetailActivity.this.m24890C0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$m */
    class C10284m implements View.OnClickListener {
        C10284m() {
        }

        public void onClick(View view) {
            if (WifiLightAlarmDetailActivity.this.f19072u instanceof C6006h) {
                WifiLightAlarmDetailActivity wifiLightAlarmDetailActivity = WifiLightAlarmDetailActivity.this;
                wifiLightAlarmDetailActivity.f19067p = ((AbstractService) ((C6006h) wifiLightAlarmDetailActivity.f19072u).mo27560F1()).newAction(WifiLightAlarmDetailActivity.this.f19072u.mo23401X());
                WifiLightAlarmDetailActivity.this.f19067p.setArgumentValue("Power", "off");
            } else if (WifiLightAlarmDetailActivity.this.f19072u instanceof C6050n) {
                WifiLightAlarmDetailActivity wifiLightAlarmDetailActivity2 = WifiLightAlarmDetailActivity.this;
                wifiLightAlarmDetailActivity2.f19069r = ((C6050n) wifiLightAlarmDetailActivity2.f19072u).mo27831O1(false);
            } else {
                return;
            }
            WifiLightAlarmDetailActivity.this.m24889B0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$n */
    class C10285n implements View.OnClickListener {

        /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$n$a */
        class C10286a implements DialogInterface.OnClickListener {
            C10286a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                String trim = ((C10521d) dialogInterface).mo33306b().getText().toString().trim();
                WifiLightAlarmDetailActivity.this.f19070s.setName(trim);
                WifiLightAlarmDetailActivity.this.f19061j.setText(trim);
                String unused = WifiLightAlarmDetailActivity.this.f19074w = trim;
                dialogInterface.dismiss();
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$n$b */
        class C10287b implements DialogInterface.OnClickListener {
            C10287b(C10285n nVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }

        C10285n() {
        }

        public void onClick(View view) {
            C10521d.C10523b bVar = new C10521d.C10523b(WifiLightAlarmDetailActivity.this);
            bVar.mo33325j(WifiLightAlarmDetailActivity.this.getString(R$string.common_text_rename));
            bVar.mo33319d(WifiLightAlarmDetailActivity.this.f19070s.getName(), true, 100);
            bVar.mo33321f(R$string.common_text_cancel, new C10287b(this));
            bVar.mo33323h(R$string.common_text_ok, new C10286a());
            bVar.mo33317b(false);
            C10521d m = bVar.mo33328m();
            m.mo33306b().addTextChangedListener(new C10536b0(20, m.mo33306b()));
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$o */
    class C10288o implements View.OnClickListener {
        C10288o() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_id", WifiLightAlarmDetailActivity.this.f19072u.mo23372G());
            intent.putExtra("scene_schedule_select", true);
            intent.setClass(WifiLightAlarmDetailActivity.this, SceneActionSelectActivity.class);
            WifiLightAlarmDetailActivity.this.startActivityForResult(intent, 0);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$p */
    class C10289p implements AdapterView.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ int f19100a;

        C10289p(int i) {
            this.f19100a = i;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i == 0) {
                WifiLightAlarmDetailActivity.this.m24892E0(this.f19100a);
            } else if (i == 1) {
                int i2 = this.f19100a;
                if (i2 == 0) {
                    WifiLightAlarmDetailActivity.this.f19070s.setTimerStartEnabled(false);
                    boolean unused = WifiLightAlarmDetailActivity.this.f19041A = false;
                    WifiLightAlarmDetailActivity wifiLightAlarmDetailActivity = WifiLightAlarmDetailActivity.this;
                    wifiLightAlarmDetailActivity.f19063l.setText(wifiLightAlarmDetailActivity.getString(R$string.common_text_no_settings));
                    WifiLightAlarmDetailActivity wifiLightAlarmDetailActivity2 = WifiLightAlarmDetailActivity.this;
                    wifiLightAlarmDetailActivity2.f19066o = null;
                    wifiLightAlarmDetailActivity2.f19068q = null;
                } else if (i2 == 1) {
                    WifiLightAlarmDetailActivity.this.f19070s.setTimerEndEnabled(false);
                    boolean unused2 = WifiLightAlarmDetailActivity.this.f19043G = false;
                    WifiLightAlarmDetailActivity wifiLightAlarmDetailActivity3 = WifiLightAlarmDetailActivity.this;
                    wifiLightAlarmDetailActivity3.f19067p = null;
                    wifiLightAlarmDetailActivity3.f19069r = null;
                }
                WifiLightAlarmDetailActivity.this.m24894G0();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$q */
    class C10290q implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f19102a;

        C10290q(WifiLightAlarmDetailActivity wifiLightAlarmDetailActivity, Dialog dialog) {
            this.f19102a = dialog;
        }

        public void onClick(View view) {
            this.f19102a.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public void m24888A0() {
        Calendar instance = Calendar.getInstance();
        if (this.f19070s.isTimerStartEnabled()) {
            if (!m24920v0(instance, this.f19070s.mo29031e().getHour(), this.f19070s.mo29031e().getMinute())) {
                instance.add(6, 1);
            }
            String valueOf = String.valueOf(instance.get(2) + 1);
            String valueOf2 = String.valueOf(instance.get(5));
            "setTimerDate startTime month: " + valueOf + "  day: " + valueOf2;
            this.f19070s.mo29031e().setMonth(valueOf);
            this.f19070s.mo29031e().setDay(valueOf2);
            if (this.f19070s.isTimerEndEnabled()) {
                instance.set(11, this.f19070s.mo29031e().getHour());
                instance.set(12, this.f19070s.mo29031e().getMinute());
            }
        }
        if (this.f19070s.isTimerEndEnabled()) {
            if (!m24920v0(instance, this.f19070s.mo29030d().getHour(), this.f19070s.mo29030d().getMinute())) {
                instance.add(6, 1);
            }
            String valueOf3 = String.valueOf(instance.get(2) + 1);
            String valueOf4 = String.valueOf(instance.get(5));
            "setTimerDate endTime month: " + valueOf3 + "  day: " + valueOf4;
            this.f19070s.mo29030d().setMonth(valueOf3);
            this.f19070s.mo29030d().setDay(valueOf4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public void m24889B0() {
        if (!this.f19070s.isTimerEndEnabled()) {
            m24892E0(1);
        } else {
            m24891D0(1, R$string.schedule_select_end_status);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public void m24890C0() {
        if (!this.f19070s.isTimerStartEnabled()) {
            m24892E0(0);
        } else {
            m24891D0(0, R$string.schedule_select_start_status);
        }
    }

    /* renamed from: D0 */
    private void m24891D0(int i, @StringRes int i2) {
        C9891b.C9893b bVar = new C9891b.C9893b(this);
        bVar.mo31997g(i2);
        bVar.mo31994d(new int[]{R$string.schedule_modify_time, R$string.schedule_disable});
        bVar.mo31996f(new C10289p(i));
        bVar.mo31992b().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: E0 */
    public void m24892E0(int i) {
        CrontabTime d;
        Integer num;
        Dialog dialog = new Dialog(this, R$style.dialogstyle);
        View inflate = LayoutInflater.from(this).inflate(R$layout.dialog_timer_select, (ViewGroup) null);
        TimePicker timePicker = (TimePicker) inflate.findViewById(R$id.timerPicker);
        timePicker.setIs24HourView(Boolean.TRUE);
        dialog.setContentView(inflate);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setWindowAnimations(R$style.alarm_popup_window_animation_style);
            window.setLayout(-1, -2);
            window.setBackgroundDrawable(new ColorDrawable(-1));
        }
        inflate.findViewById(R$id.tv_timer_cancle).setOnClickListener(new C10290q(this, dialog));
        inflate.findViewById(R$id.tv_timer_modify).setOnClickListener(new C10269a(dialog, i, timePicker));
        if (i != 0) {
            if (i == 1) {
                if (this.f19070s.isTimerEndEnabled()) {
                    timePicker.setCurrentHour(Integer.valueOf(this.f19070s.mo29030d().getHour()));
                    d = this.f19070s.mo29030d();
                    num = Integer.valueOf(d.getMinute());
                    timePicker.setCurrentMinute(num);
                }
            }
            dialog.show();
        } else if (this.f19070s.isTimerStartEnabled()) {
            timePicker.setCurrentHour(Integer.valueOf(this.f19070s.mo29031e().getHour()));
            d = this.f19070s.mo29031e();
            num = Integer.valueOf(d.getMinute());
            timePicker.setCurrentMinute(num);
            dialog.show();
        }
        long currentTimeMillis = System.currentTimeMillis();
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(currentTimeMillis);
        Integer valueOf = Integer.valueOf(instance.get(11));
        num = Integer.valueOf(instance.get(12));
        timePicker.setCurrentHour(valueOf);
        timePicker.setCurrentMinute(num);
        dialog.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: F0 */
    public void m24893F0() {
        String str;
        int i;
        Resources resources;
        this.f19070s.mo29037r(false);
        CrontabTime e = this.f19070s.mo29031e();
        if (!TextUtils.equals(e.getMonth(), "*") || !TextUtils.equals(e.getDay(), "*")) {
            resources = getResources();
            i = R$string.common_text_repeat_once;
        } else if (e.getDayOfWeeks().size() == 7) {
            resources = getResources();
            i = R$string.common_text_repeat_everyday;
        } else {
            String str2 = "";
            for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(e.getDayOfWeeks().contains(dayOfWeek) ? TimerCodec.ENABLE : TimerCodec.DISENABLE);
                str2 = sb.toString();
            }
            str = C7561k.m22309b(this, str2);
            this.f19057f.setText(str);
            this.f19076y = str;
        }
        str = resources.getString(i);
        this.f19057f.setText(str);
        this.f19076y = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: G0 */
    public void m24894G0() {
        TextView textView;
        float f = 0.5f;
        if (this.f19070s.isTimerStartEnabled()) {
            String valueOf = String.valueOf(this.f19070s.mo29031e().getHour());
            if (valueOf.length() == 1) {
                valueOf = TimerCodec.DISENABLE + valueOf;
            }
            String valueOf2 = String.valueOf(this.f19070s.mo29031e().getMinute());
            if (valueOf2.length() == 1) {
                valueOf2 = TimerCodec.DISENABLE + valueOf2;
            }
            String str = valueOf + Constants.COLON_SEPARATOR + valueOf2;
            this.f19058g.setText(str);
            if (this.f19050N) {
                this.f19044H = str;
                this.f19045I = str;
                this.f19050N = false;
            } else {
                this.f19045I = str;
            }
            C4198d dVar = this.f19072u;
            if (!(dVar instanceof C6033g) ? !C7632k.m22548i(dVar.mo23395T(), 2) : ((C6033g) dVar).mo27752r2() != 0) {
                m24923z0(false);
            } else {
                m24923z0(true);
            }
            this.f19063l.setAlpha(0.5f);
            textView = this.f19064m;
            f = 0.8f;
        } else {
            if (this.f19050N) {
                this.f19050N = false;
            }
            this.f19058g.setText(getString(R$string.alarm_disable));
            m24923z0(false);
            this.f19063l.setAlpha(0.2f);
            textView = this.f19064m;
        }
        textView.setAlpha(f);
        if (this.f19070s.isTimerEndEnabled()) {
            String valueOf3 = String.valueOf(this.f19070s.mo29030d().getHour());
            if (valueOf3.length() == 1) {
                valueOf3 = TimerCodec.DISENABLE + valueOf3;
            }
            String valueOf4 = String.valueOf(this.f19070s.mo29030d().getMinute());
            if (valueOf4.length() == 1) {
                valueOf4 = TimerCodec.DISENABLE + valueOf4;
            }
            String str2 = valueOf3 + Constants.COLON_SEPARATOR + valueOf4;
            this.f19059h.setText(str2);
            if (this.f19051O) {
                this.f19046J = str2;
                this.f19047K = str2;
                this.f19051O = false;
                return;
            }
            this.f19047K = str2;
            return;
        }
        if (this.f19051O) {
            this.f19051O = false;
        }
        this.f19059h.setText(getString(R$string.alarm_disable));
    }

    /* renamed from: m0 */
    private C9856y m24912m0(int i, int i2, int i3, int i4, String str) {
        "mode = " + i + " , bright = " + i2 + " , color = " + i3 + " , ct = " + i4 + " , flowJson = " + str;
        if (i == 0) {
            return new C9836g("", -1, 3, i2, i4);
        }
        if (i == 1) {
            return new C9835f("", -1, 2, i2, i3);
        }
        if (i == 2) {
            try {
                return C9830b.m23922Z(new JSONObject(str));
            } catch (Exception unused) {
            }
        } else if (i != 3) {
            if (i == 4) {
                return new C9851t("", -1, 6, i2);
            }
            "No reason to run here! " + new Exception();
            return null;
        }
        return new C9833d("", -1, 3, i2);
    }

    /* renamed from: n0 */
    private C9856y m24913n0(int i, int i2) {
        String str;
        List k;
        C4198d dVar = this.f19072u;
        if (dVar instanceof C6006h) {
            str = ((C6006h) dVar).mo23330i1();
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1462015191) {
                if (hashCode == 922669546 && str.equals("yeelink.light.ceiling4")) {
                    c = 0;
                }
            } else if (str.equals("yeelink.light.ceiling10")) {
                c = 1;
            }
            if (c == 0) {
                str = "yeelink.light.ceiling4x";
            } else if (c == 1) {
                str = "yeelink.light.ceiling10x";
            }
        } else {
            str = dVar instanceof C6050n ? ((C6050n) dVar).mo23330i1() : null;
        }
        if (i == 0) {
            k = C4300b0.m12083u().mo23747k(str);
            if (k == null || k.isEmpty() || k.size() <= i2) {
                return null;
            }
        } else if (i == 1) {
            k = C4300b0.m12083u().mo23746j(str);
            if (k == null || k.isEmpty() || k.size() <= i2) {
                return null;
            }
        } else if (i != 2 || (k = C4300b0.m12083u().mo23751p(str)) == null || k.isEmpty() || k.size() <= i2) {
            return null;
        }
        return (C9856y) k.get(i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public boolean m24914o0() {
        if (this.f19043G || this.f19041A) {
            return true;
        }
        C10521d.C10523b bVar = new C10521d.C10523b(this);
        bVar.mo33318c(true);
        bVar.mo33320e(getString(R$string.common_text_alarm_no_time_setting));
        bVar.mo33322g(getString(R$string.common_text_confirm_leave), new C10276e());
        bVar.mo33324i(getString(R$string.common_text_go_setting), new C10277f(this));
        bVar.mo33328m();
        return false;
    }

    /* renamed from: p0 */
    private int m24915p0() {
        CrontabTime e = this.f19070s.mo29031e();
        if (!TextUtils.equals(e.getMonth(), "*") || !TextUtils.equals(e.getDay(), "*") || this.f19070s.mo29035n()) {
            return 0;
        }
        List<DayOfWeek> dayOfWeeks = e.getDayOfWeeks();
        if (dayOfWeeks.size() == 7) {
            return 1;
        }
        return (dayOfWeeks.size() != 5 || dayOfWeeks.contains(DayOfWeek.SATURDAY) || dayOfWeeks.contains(DayOfWeek.SUNDAY)) ? 3 : 2;
    }

    /* renamed from: r0 */
    private String m24916r0(YeelightTimer yeelightTimer) {
        if (yeelightTimer == null) {
            return null;
        }
        Action startAction = yeelightTimer.getStartAction();
        C7638m0[] j = yeelightTimer.mo29034j();
        if (startAction != null && !TextUtils.isEmpty(startAction.getDescription()) && !startAction.getFriendlyName().equals(this.f19072u.mo23401X())) {
            return startAction.getDescription();
        }
        if (j == null || j.length <= 0) {
            return null;
        }
        return j[0].mo29083a();
    }

    /* renamed from: s0 */
    private List<YeelightTimer> m24917s0() {
        C4198d dVar = this.f19072u;
        return dVar instanceof C6072p ? ((C6072p) dVar).mo27829L1() : (List) dVar.mo23408d0().mo27710r(1);
    }

    /* renamed from: t0 */
    private void m24918t0() {
        String str;
        YeelightTimer yeelightTimer;
        C4198d dVar = this.f19072u;
        if (dVar instanceof C6050n) {
            this.f19070s.setIdentify(((C6050n) dVar).mo27788M1());
            yeelightTimer = this.f19070s;
            str = ((C6050n) this.f19072u).mo27788M1();
        } else {
            this.f19070s.setIdentify(dVar.mo23372G());
            yeelightTimer = this.f19070s;
            str = this.f19072u.mo23372G();
        }
        yeelightTimer.setDeviceId(str);
        this.f19070s.setPushEnabled(false);
        this.f19070s.setTimerEnabled(true);
        this.f19070s.setTimerStartEnabled(false);
        this.f19070s.setTimerEndEnabled(false);
        this.f19070s.setName(getResources().getString(R$string.common_text_alarm_name));
        this.f19070s.mo29031e().setMonth(String.valueOf(Calendar.getInstance().get(2) + 1));
        this.f19070s.mo29031e().setDay(String.valueOf(Calendar.getInstance().get(5)));
        this.f19070s.mo29030d().setMonth(String.valueOf(Calendar.getInstance().get(2) + 1));
        this.f19070s.mo29030d().setDay(String.valueOf(Calendar.getInstance().get(5)));
        this.f19058g.setText(getString(R$string.alarm_disable));
        this.f19059h.setText(getString(R$string.alarm_disable));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        r0.append(getString(r6));
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        r0.append(getString(r6));
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        r0.append(" ");
     */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m24919u0() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.yeelight.yeelib.device.models.YeelightTimer r1 = r7.f19070s
            com.miot.common.timer.CrontabTime r1 = r1.mo29031e()
            java.lang.String r2 = r1.getMonth()
            java.lang.String r3 = "*"
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x009f
            java.lang.String r2 = r1.getDay()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x009f
            java.util.List r1 = r1.getDayOfWeeks()
            int r2 = r1.size()
            r3 = 7
            if (r2 != r3) goto L_0x0030
            int r1 = com.yeelight.yeelib.R$string.activity_wifi_alarm_repeat_all
            goto L_0x00a1
        L_0x0030:
            int r2 = r1.size()
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x003b:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x007b
            java.lang.Object r6 = r1.next()
            com.miot.common.timer.DayOfWeek r6 = (com.miot.common.timer.DayOfWeek) r6
            int r6 = r6.value()
            switch(r6) {
                case 0: goto L_0x006a;
                case 1: goto L_0x005e;
                case 2: goto L_0x005b;
                case 3: goto L_0x0058;
                case 4: goto L_0x0055;
                case 5: goto L_0x0052;
                case 6: goto L_0x004f;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x0075
        L_0x004f:
            int r6 = com.yeelight.yeelib.R$string.common_text_repeat_6
            goto L_0x006c
        L_0x0052:
            int r6 = com.yeelight.yeelib.R$string.common_text_repeat_5
            goto L_0x0060
        L_0x0055:
            int r6 = com.yeelight.yeelib.R$string.common_text_repeat_4
            goto L_0x0060
        L_0x0058:
            int r6 = com.yeelight.yeelib.R$string.common_text_repeat_3
            goto L_0x0060
        L_0x005b:
            int r6 = com.yeelight.yeelib.R$string.common_text_repeat_2
            goto L_0x0060
        L_0x005e:
            int r6 = com.yeelight.yeelib.R$string.common_text_repeat_1
        L_0x0060:
            java.lang.String r6 = r7.getString(r6)
            r0.append(r6)
            int r4 = r4 + 1
            goto L_0x0075
        L_0x006a:
            int r6 = com.yeelight.yeelib.R$string.common_text_repeat_7
        L_0x006c:
            java.lang.String r6 = r7.getString(r6)
            r0.append(r6)
            int r5 = r5 + 1
        L_0x0075:
            java.lang.String r6 = " "
            r0.append(r6)
            goto L_0x003b
        L_0x007b:
            r1 = 5
            if (r2 != r1) goto L_0x0090
            if (r4 != r1) goto L_0x0090
            int r1 = r0.length()
            r0.delete(r3, r1)
            int r1 = com.yeelight.yeelib.R$string.common_text_repeat_weekday
            java.lang.String r1 = r7.getString(r1)
            r0.append(r1)
        L_0x0090:
            r1 = 2
            if (r2 != r1) goto L_0x00a8
            if (r5 != r1) goto L_0x00a8
            int r1 = r0.length()
            r0.delete(r3, r1)
            int r1 = com.yeelight.yeelib.R$string.common_text_repeat_weekend
            goto L_0x00a1
        L_0x009f:
            int r1 = com.yeelight.yeelib.R$string.common_text_repeat_once
        L_0x00a1:
            java.lang.String r1 = r7.getString(r1)
            r0.append(r1)
        L_0x00a8:
            java.lang.String r1 = r0.toString()
            r7.f19075x = r1
            java.lang.String r1 = r0.toString()
            r7.f19076y = r1
            android.widget.TextView r1 = r7.f19057f
            r1.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.activity.WifiLightAlarmDetailActivity.m24919u0():void");
    }

    /* renamed from: v0 */
    private boolean m24920v0(Calendar calendar, int i, int i2) {
        int i3 = calendar.get(11);
        int i4 = calendar.get(12);
        "currentHour:" + i3 + "   currentMinute" + i4;
        if (i < i3) {
            return false;
        }
        return i != i3 || i2 > i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00fb, code lost:
        r0.setArgumentValue("ParamColors", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0155, code lost:
        r0.setArgumentValue("ParamCount", java.lang.Long.valueOf(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x015c, code lost:
        r0 = r10.f19066o;
        r1 = java.lang.Long.valueOf((long) r11.mo31874f());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x018a, code lost:
        r0.setArgumentValue("ParamFinish", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x018d, code lost:
        r0 = r10.f19066o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x018f, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0191, code lost:
        r0.setDescription(r11.mo31885q());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x01a0, code lost:
        if (android.text.TextUtils.isEmpty(r11.mo31885q()) == false) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x01a2, code lost:
        r10.f19066o.setDescription(mo32568q0(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* renamed from: w0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m24921w0(com.yeelight.yeelib.p153g.C9856y r11) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x01c7
            com.yeelight.yeelib.device.models.YeelightTimer r0 = r10.f19070s
            r1 = 1
            r0.setTimerStartEnabled(r1)
            r0 = 0
            r10.f19066o = r0
            com.yeelight.yeelib.c.i.d r0 = r10.f19072u
            boolean r2 = r0 instanceof com.yeelight.yeelib.p150c.C6006h
            if (r2 == 0) goto L_0x01ac
            com.yeelight.yeelib.c.h r0 = (com.yeelight.yeelib.p150c.C6006h) r0
            java.lang.Object r0 = r0.mo27560F1()
            com.miot.common.abstractdevice.AbstractService r0 = (com.miot.common.abstractdevice.AbstractService) r0
            int r2 = r11.mo31884p()
            java.lang.String r3 = "ParamColors"
            java.lang.String r4 = "cf"
            java.lang.String r5 = "ct"
            r6 = 0
            java.lang.String r7 = "ParamCount"
            java.lang.String r8 = "ParamFinish"
            java.lang.String r9 = "ParamModel"
            switch(r2) {
                case 0: goto L_0x0168;
                case 1: goto L_0x0140;
                case 2: goto L_0x0119;
                case 3: goto L_0x0100;
                case 4: goto L_0x00ca;
                case 5: goto L_0x0088;
                case 6: goto L_0x0073;
                case 7: goto L_0x0088;
                case 8: goto L_0x0088;
                case 9: goto L_0x002f;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x018d
        L_0x002f:
            boolean r2 = r11 instanceof com.yeelight.yeelib.p153g.C9834e
            if (r2 == 0) goto L_0x018d
            r2 = r11
            com.yeelight.yeelib.g.e r2 = (com.yeelight.yeelib.p153g.C9834e) r2
            java.util.List r2 = r2.mo31758a0()
            if (r2 != 0) goto L_0x0043
            int r3 = r2.size()
            r4 = 2
            if (r3 < r4) goto L_0x018d
        L_0x0043:
            com.yeelight.yeelib.c.i.d r3 = r10.f19072u
            com.yeelight.yeelib.c.h r3 = (com.yeelight.yeelib.p150c.C6006h) r3
            java.lang.String r3 = r3.mo27564J1()
            com.miot.common.device.Action r0 = r0.newAction(r3)
            r10.f19066o = r0
            java.lang.Object r3 = r2.get(r6)
            com.yeelight.yeelib.g.r r3 = (com.yeelight.yeelib.p153g.C9849r) r3
            java.lang.String r3 = r3.mo31742Y()
            java.lang.String r4 = "BundleItem1"
            r0.setArgumentValue(r4, r3)
            com.miot.common.device.Action r0 = r10.f19066o
            java.lang.Object r1 = r2.get(r1)
            com.yeelight.yeelib.g.r r1 = (com.yeelight.yeelib.p153g.C9849r) r1
            java.lang.String r1 = r1.mo31742Y()
            java.lang.String r2 = "BundleItem2"
            r0.setArgumentValue(r2, r1)
            goto L_0x018d
        L_0x0073:
            com.yeelight.yeelib.c.i.d r1 = r10.f19072u
            com.yeelight.yeelib.c.h r1 = (com.yeelight.yeelib.p150c.C6006h) r1
            java.lang.String r1 = r1.mo27562H1()
            com.miot.common.device.Action r0 = r0.newAction(r1)
            r10.f19066o = r0
            java.lang.String r1 = "nightlight"
            r0.setArgumentValue(r9, r1)
            goto L_0x015c
        L_0x0088:
            com.yeelight.yeelib.c.i.d r1 = r10.f19072u
            com.yeelight.yeelib.c.h r1 = (com.yeelight.yeelib.p150c.C6006h) r1
            java.lang.String r1 = r1.mo27561G1()
            com.miot.common.device.Action r0 = r0.newAction(r1)
            r10.f19066o = r0
            r0.setArgumentValue(r9, r4)
            com.miot.common.device.Action r0 = r10.f19066o
            com.yeelight.yeelib.g.a r1 = r11.mo31871c()
            int r1 = r1.mo31724i()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setArgumentValue(r7, r1)
            com.miot.common.device.Action r0 = r10.f19066o
            com.yeelight.yeelib.g.a r1 = r11.mo31871c()
            com.yeelight.yeelib.g.l r1 = r1.mo31721f()
            int r1 = r1.ordinal()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setArgumentValue(r8, r1)
            com.miot.common.device.Action r0 = r10.f19066o
            com.yeelight.yeelib.g.a r1 = r11.mo31871c()
            java.lang.String r1 = r1.mo31722g()
            goto L_0x00fb
        L_0x00ca:
            com.yeelight.yeelib.c.i.d r1 = r10.f19072u
            com.yeelight.yeelib.c.h r1 = (com.yeelight.yeelib.p150c.C6006h) r1
            java.lang.String r1 = r1.mo27561G1()
            com.miot.common.device.Action r0 = r0.newAction(r1)
            r10.f19066o = r0
            r0.setArgumentValue(r9, r4)
            com.miot.common.device.Action r0 = r10.f19066o
            int r1 = r11.mo31879k()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setArgumentValue(r7, r1)
            com.miot.common.device.Action r0 = r10.f19066o
            int r1 = r11.mo31880l()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setArgumentValue(r8, r1)
            com.miot.common.device.Action r0 = r10.f19066o
            java.lang.String r1 = r11.mo31882n()
        L_0x00fb:
            r0.setArgumentValue(r3, r1)
            goto L_0x018d
        L_0x0100:
            com.yeelight.yeelib.c.i.d r1 = r10.f19072u
            com.yeelight.yeelib.c.h r1 = (com.yeelight.yeelib.p150c.C6006h) r1
            java.lang.String r1 = r1.mo27563I1()
            com.miot.common.device.Action r0 = r0.newAction(r1)
            r10.f19066o = r0
            r0.setArgumentValue(r9, r5)
            com.miot.common.device.Action r0 = r10.f19066o
            int r1 = r11.mo31876h()
            long r1 = (long) r1
            goto L_0x0155
        L_0x0119:
            com.yeelight.yeelib.c.i.d r1 = r10.f19072u
            com.yeelight.yeelib.c.h r1 = (com.yeelight.yeelib.p150c.C6006h) r1
            java.lang.String r1 = r1.mo27563I1()
            com.miot.common.device.Action r0 = r0.newAction(r1)
            r10.f19066o = r0
            java.lang.String r1 = "color"
            r0.setArgumentValue(r9, r1)
            int r0 = r11.mo31875g()
            if (r0 >= 0) goto L_0x0136
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r1
        L_0x0136:
            com.miot.common.device.Action r1 = r10.f19066o
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.setArgumentValue(r7, r0)
            goto L_0x015c
        L_0x0140:
            com.yeelight.yeelib.c.i.d r1 = r10.f19072u
            com.yeelight.yeelib.c.h r1 = (com.yeelight.yeelib.p150c.C6006h) r1
            java.lang.String r1 = r1.mo27563I1()
            com.miot.common.device.Action r0 = r0.newAction(r1)
            r10.f19066o = r0
            r0.setArgumentValue(r9, r5)
            com.miot.common.device.Action r0 = r10.f19066o
            r1 = 4000(0xfa0, double:1.9763E-320)
        L_0x0155:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.setArgumentValue(r7, r1)
        L_0x015c:
            com.miot.common.device.Action r0 = r10.f19066o
            int r1 = r11.mo31874f()
            long r1 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            goto L_0x018a
        L_0x0168:
            com.yeelight.yeelib.c.i.d r1 = r10.f19072u
            com.yeelight.yeelib.c.h r1 = (com.yeelight.yeelib.p150c.C6006h) r1
            java.lang.String r1 = r1.mo27563I1()
            com.miot.common.device.Action r0 = r0.newAction(r1)
            r10.f19066o = r0
            java.lang.String r1 = "off"
            r0.setArgumentValue(r9, r1)
            com.miot.common.device.Action r0 = r10.f19066o
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r0.setArgumentValue(r7, r1)
            com.miot.common.device.Action r0 = r10.f19066o
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
        L_0x018a:
            r0.setArgumentValue(r8, r1)
        L_0x018d:
            com.miot.common.device.Action r0 = r10.f19066o
            if (r0 == 0) goto L_0x01c7
            java.lang.String r1 = r11.mo31885q()
            r0.setDescription(r1)
            java.lang.String r0 = r11.mo31885q()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x01b8
            com.miot.common.device.Action r0 = r10.f19066o
            java.lang.String r1 = r10.mo32568q0(r11)
            r0.setDescription(r1)
            goto L_0x01b8
        L_0x01ac:
            boolean r1 = r0 instanceof com.yeelight.yeelib.p150c.p151i.C6050n
            if (r1 == 0) goto L_0x01c7
            com.yeelight.yeelib.c.i.n r0 = (com.yeelight.yeelib.p150c.p151i.C6050n) r0
            com.yeelight.yeelib.device.models.m0[] r0 = r0.mo27830N1(r11)
            r10.f19068q = r0
        L_0x01b8:
            java.lang.String r0 = r11.mo31885q()
            r10.f19049M = r0
            android.widget.TextView r0 = r10.f19063l
            java.lang.String r11 = r10.mo32568q0(r11)
            r0.setText(r11)
        L_0x01c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.activity.WifiLightAlarmDetailActivity.m24921w0(com.yeelight.yeelib.g.y):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public void m24922y0() {
        C4198d dVar = this.f19072u;
        if (dVar instanceof C6006h) {
            Action action = this.f19066o;
            if (action != null) {
                this.f19070s.setStartAction(action);
            }
            Action action2 = this.f19067p;
            if (action2 != null) {
                this.f19070s.setEndAction(action2);
            }
        } else if (dVar instanceof C6050n) {
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            if (this.f19068q != null) {
                int i2 = 0;
                while (true) {
                    C7638m0[] m0VarArr = this.f19068q;
                    if (i2 >= m0VarArr.length) {
                        break;
                    }
                    jSONArray.put(m0VarArr[i2].mo29084b());
                    i2++;
                }
            }
            this.f19070s.setSpecStartTask(jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            if (this.f19069r != null) {
                while (true) {
                    C7638m0[] m0VarArr2 = this.f19069r;
                    if (i >= m0VarArr2.length) {
                        break;
                    }
                    jSONArray2.put(m0VarArr2[i].mo29084b());
                    i++;
                }
            }
            this.f19070s.setSpecEndTask(jSONArray2);
        }
        " name : " + this.f19070s.getName();
        "start time : " + this.f19070s.mo29031e();
        "end time : " + this.f19070s.mo29030d();
        "start action : " + this.f19066o;
        "end action : " + this.f19067p;
        if (this.f19071t) {
            try {
                this.f19070s.mo29036o();
                MiotManager.getDeviceManager().editTimer(this.f19070s, new C10278g());
            } catch (MiotException e) {
                e.printStackTrace();
            }
        } else {
            this.f19070s.mo29036o();
            MiotManager.getDeviceManager().addTimer(this.f19070s, new C10279h());
        }
    }

    /* renamed from: z0 */
    private void m24923z0(boolean z) {
        int i = 0;
        this.f19062k.setVisibility(z ? 0 : 4);
        View view = this.f19065n;
        if (!z) {
            i = 4;
        }
        view.setVisibility(i);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        C9856y yVar;
        "CreateSceneBundle on Activity result called!!! resultCode = " + i2;
        if (i2 == 1002) {
            yVar = m24912m0(intent.getIntExtra("light_adjust_mode", -1), intent.getIntExtra("light_adjust_bright", -1), intent.getIntExtra("light_adjust_color", -1), intent.getIntExtra("light_adjust_ct", -1), intent.getStringExtra("light_adjust_json"));
            if (yVar == null) {
                return;
            }
        } else if (i2 != 1003 || (yVar = m24913n0(intent.getIntExtra("scene_select_mode", -1), intent.getIntExtra("scene_select_position", -1))) == null) {
            return;
        }
        m24921w0(yVar);
    }

    public void onBackPressed() {
        "current name : " + this.f19073v + ", def name : " + this.f19074w;
        "current repeat : " + this.f19075x + ", def repeat : " + this.f19076y;
        "current start enable : " + this.f19077z + ", def start enable : " + this.f19041A;
        "current end enable : " + this.f19042B + ", def end enable : " + this.f19043G;
        "current start time : " + this.f19044H + ", def start enable : " + this.f19045I;
        "current end time : " + this.f19046J + ", def end enable : " + this.f19047K;
        "current scene name : " + this.f19048L + ", def scene name : " + this.f19049M;
        Boolean bool = Boolean.TRUE;
        if (m24914o0()) {
            boolean z = true;
            if (!TextUtils.isEmpty(this.f19074w)) {
                bool = Boolean.valueOf(this.f19074w.equals(this.f19073v));
            }
            if (!TextUtils.isEmpty(this.f19049M)) {
                bool = Boolean.valueOf(bool.booleanValue() && this.f19049M.equals(this.f19048L));
            }
            if (!TextUtils.isEmpty(this.f19075x)) {
                bool = Boolean.valueOf(bool.booleanValue() && this.f19075x.equals(this.f19076y));
            }
            Boolean valueOf = Boolean.valueOf(bool.booleanValue() && this.f19077z == this.f19041A && this.f19042B == this.f19043G);
            if (valueOf.booleanValue() && !TextUtils.isEmpty(this.f19044H) && !TextUtils.isEmpty(this.f19046J)) {
                if (!valueOf.booleanValue() || !this.f19044H.equals(this.f19045I) || !this.f19046J.equals(this.f19047K)) {
                    z = false;
                }
                valueOf = Boolean.valueOf(z);
            }
            if (valueOf.booleanValue()) {
                finish();
            } else {
                C9897c.m24274p(this, getString(R$string.common_text_discard), getString(R$string.common_text_save), getString(R$string.common_text_cancel), new C10274c(), new C10275d());
            }
        }
    }

    public void onConnectionStateChanged(int i, int i2) {
        if (i2 == 0) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        YeelightTimer yeelightTimer;
        super.onCreate(bundle);
        if (!isFinishing()) {
            mo32193P();
            C10547m.m25758h(true, this);
            setContentView(R$layout.activity_light_alarm_detail_wifi);
            this.f19053b = (CommonTitleBar) findViewById(R$id.title_bar);
            this.f19054c = (LinearLayout) findViewById(R$id.layout_repeat);
            this.f19055d = (LinearLayout) findViewById(R$id.layout_action_open);
            this.f19056e = (LinearLayout) findViewById(R$id.layout_action_close);
            this.f19057f = (TextView) findViewById(R$id.repeat_text);
            this.f19058g = (TextView) findViewById(R$id.open_text);
            this.f19059h = (TextView) findViewById(R$id.close_text);
            this.f19060i = (LinearLayout) findViewById(R$id.layout_alarm_name);
            this.f19061j = (TextView) findViewById(R$id.alarm_name_text);
            this.f19062k = (LinearLayout) findViewById(R$id.layout_scene);
            this.f19063l = (TextView) findViewById(R$id.alarm_scene_text);
            this.f19064m = (TextView) findViewById(R$id.alarm_scene_name_view);
            this.f19065n = findViewById(R$id.line_scence);
            this.f19053b.mo32825a(getResources().getString(R$string.alarm_set_time), new C10280i(), new C10281j());
            this.f19053b.setTitleTextSize(16);
            this.f19054c.setOnClickListener(new C10282k());
            this.f19055d.setOnClickListener(new C10283l());
            this.f19056e.setOnClickListener(new C10284m());
            Intent intent = getIntent();
            if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
                C4308b.m12141t(f19040Q, "Activity has no device id", false);
                finish();
                return;
            }
            C4198d h0 = C4257w.m11945h0(intent.getStringExtra("com.yeelight.cherry.device_id"));
            this.f19072u = h0;
            if (h0 == null || !h0.mo23331k0()) {
                BaseActivity.m24384U(this);
                finish();
                return;
            }
            if (!intent.hasExtra("com.yeelight.cherry.device_timer")) {
                yeelightTimer = new YeelightTimer();
            } else {
                int intExtra = intent.getIntExtra("com.yeelight.cherry.device_timer", 0);
                List<YeelightTimer> s0 = m24917s0();
                if (s0 == null || s0.size() <= intExtra || intExtra < 0) {
                    yeelightTimer = new YeelightTimer();
                } else {
                    YeelightTimer yeelightTimer2 = s0.get(intExtra);
                    this.f19070s = yeelightTimer2;
                    this.f19061j.setText(yeelightTimer2.getName());
                    this.f19071t = true;
                    this.f19066o = this.f19070s.getStartAction();
                    this.f19068q = this.f19070s.mo29034j();
                    this.f19069r = this.f19070s.mo29029c();
                    C4198d dVar = this.f19072u;
                    if ((dVar instanceof C6006h) || (dVar instanceof C6050n)) {
                        String r0 = m24916r0(this.f19070s);
                        if (!TextUtils.isEmpty(r0)) {
                            this.f19049M = r0;
                            this.f19048L = r0;
                            this.f19063l.setText(r0);
                        } else {
                            this.f19063l.setText(getString(R$string.common_text_no_settings));
                            this.f19048L = "";
                            this.f19049M = "";
                        }
                    }
                    this.f19073v = this.f19070s.getName();
                    this.f19074w = this.f19070s.getName();
                    boolean isTimerStartEnabled = this.f19070s.isTimerStartEnabled();
                    this.f19077z = isTimerStartEnabled;
                    this.f19041A = isTimerStartEnabled;
                    boolean isTimerEndEnabled = this.f19070s.isTimerEndEnabled();
                    this.f19042B = isTimerEndEnabled;
                    this.f19043G = isTimerEndEnabled;
                    m24919u0();
                    m24893F0();
                    this.f19060i.setOnClickListener(new C10285n());
                    this.f19062k.setOnClickListener(new C10288o());
                    m24894G0();
                }
            }
            this.f19070s = yeelightTimer;
            m24918t0();
            this.f19063l.setText(getResources().getText(R$string.common_text_no_settings));
            this.f19060i.setOnClickListener(new C10285n());
            this.f19062k.setOnClickListener(new C10288o());
            m24894G0();
        }
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }

    public void onStart() {
        super.onStart();
        C4200i o0 = C4257w.m11953o0(getIntent().getStringExtra("com.yeelight.cherry.device_id"));
        this.f19072u = o0;
        if (o0 == null) {
            finish();
        } else {
            o0.mo23358z0(this);
        }
    }

    public void onStop() {
        super.onStop();
        this.f19072u.mo23319V0(this);
    }

    /* renamed from: q0 */
    public String mo32568q0(C9856y yVar) {
        Context context;
        int i;
        if (!TextUtils.isEmpty(yVar.mo31885q())) {
            return yVar.mo31885q();
        }
        if (yVar instanceof C9835f) {
            context = C4297y.f7456e;
            i = R$string.common_text_colors;
        } else if (yVar instanceof C9830b) {
            context = C4297y.f7456e;
            i = R$string.common_text_flow;
        } else if (yVar instanceof C9851t) {
            context = C4297y.f7456e;
            i = R$string.common_text_night_light;
        } else {
            context = C4297y.f7456e;
            i = R$string.common_text_sunshine;
        }
        return context.getString(i);
    }

    /* renamed from: x0 */
    public void mo32569x0() {
        C9878a m = C9878a.m24241m(this, 1);
        m.mo31978u(m24915p0());
        m.mo31976s(new C10270b(m));
        m.show();
    }
}

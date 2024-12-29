package com.yeelight.yeelib.p142ui.activity;

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
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.C6100g;
import com.yeelight.yeelib.device.base.C6117h;
import com.yeelight.yeelib.device.models.YeelightTimer;
import com.yeelight.yeelib.device.status.TimerModel;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.C3112v;
import com.yeelight.yeelib.models.C8309b;
import com.yeelight.yeelib.models.C8311d;
import com.yeelight.yeelib.models.C8313f;
import com.yeelight.yeelib.models.C8314g;
import com.yeelight.yeelib.models.C8322n;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.p142ui.view.TimePicker;
import com.yeelight.yeelib.p142ui.widget.C8891a;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.Calendar;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p051j4.C9183a0;
import p051j4.C9193k;
import p160g4.C9052a;
import p160g4.C9065b;
import p160g4.C9071c;
import p207s3.C10337c;
import p227x3.C11972i;
import p227x3.C11980p;
import p237z3.C12143c;

/* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity */
public class WifiLightAlarmDetailActivity extends BaseActivity implements C12143c {

    /* renamed from: Y */
    private static final String f15348Y = "WifiLightAlarmDetailActivity";

    /* renamed from: A */
    private boolean f15349A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f15350B;

    /* renamed from: C */
    private String f15351C = "";

    /* renamed from: Q */
    private String f15352Q = "";

    /* renamed from: R */
    private String f15353R = "";

    /* renamed from: S */
    private String f15354S = "";

    /* renamed from: T */
    private String f15355T;

    /* renamed from: U */
    private String f15356U;

    /* renamed from: V */
    private boolean f15357V = true;

    /* renamed from: W */
    private boolean f15358W = true;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public boolean f15359X = false;

    /* renamed from: a */
    CommonTitleBar f15360a;

    /* renamed from: b */
    LinearLayout f15361b;

    /* renamed from: c */
    LinearLayout f15362c;

    /* renamed from: d */
    LinearLayout f15363d;

    /* renamed from: e */
    TextView f15364e;

    /* renamed from: f */
    TextView f15365f;

    /* renamed from: g */
    TextView f15366g;

    /* renamed from: h */
    LinearLayout f15367h;

    /* renamed from: i */
    TextView f15368i;

    /* renamed from: j */
    LinearLayout f15369j;

    /* renamed from: k */
    TextView f15370k;

    /* renamed from: l */
    TextView f15371l;

    /* renamed from: m */
    View f15372m;

    /* renamed from: n */
    Action f15373n;

    /* renamed from: o */
    Action f15374o;

    /* renamed from: p */
    C11980p[] f15375p;

    /* renamed from: q */
    C11980p[] f15376q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public YeelightTimer f15377r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f15378s = false;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C3010c f15379t;

    /* renamed from: u */
    private String f15380u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public String f15381v;

    /* renamed from: w */
    private String f15382w;

    /* renamed from: x */
    private String f15383x;

    /* renamed from: y */
    private boolean f15384y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f15385z;

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$a */
    class C8687a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f15386a;

        /* renamed from: b */
        final /* synthetic */ int f15387b;

        /* renamed from: c */
        final /* synthetic */ TimePicker f15388c;

        C8687a(Dialog dialog, int i, TimePicker timePicker) {
            this.f15386a = dialog;
            this.f15387b = i;
            this.f15388c = timePicker;
        }

        public void onClick(View view) {
            CrontabTime crontabTime;
            this.f15386a.dismiss();
            if (this.f15387b == 0) {
                WifiLightAlarmDetailActivity.this.f15377r.setTimerStartEnabled(true);
                boolean unused = WifiLightAlarmDetailActivity.this.f15385z = true;
                WifiLightAlarmDetailActivity.this.f15377r.mo31886e().setHour(this.f15388c.getCurrentHour().intValue());
                crontabTime = WifiLightAlarmDetailActivity.this.f15377r.mo31886e();
            } else {
                WifiLightAlarmDetailActivity.this.f15377r.setTimerEndEnabled(true);
                boolean unused2 = WifiLightAlarmDetailActivity.this.f15350B = true;
                WifiLightAlarmDetailActivity.this.f15377r.mo31885d().setHour(this.f15388c.getCurrentHour().intValue());
                crontabTime = WifiLightAlarmDetailActivity.this.f15377r.mo31885d();
            }
            crontabTime.setMinute(this.f15388c.getCurrentMinute().intValue());
            if (YeelightTimer.m18295i(WifiLightAlarmDetailActivity.this.f15377r.mo31886e()) == YeelightTimer.RepeatType.REPEAT_ONCE) {
                WifiLightAlarmDetailActivity.this.m20506A0();
            }
            WifiLightAlarmDetailActivity.this.m20512G0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$b */
    class C8688b implements C9052a.C9063k {

        /* renamed from: a */
        final /* synthetic */ C9052a f15390a;

        /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$b$a */
        class C8689a implements C9052a.C9062j {
            C8689a() {
            }

            /* renamed from: a */
            public void mo35821a(boolean[] zArr) {
                WifiLightAlarmDetailActivity.this.f15377r.mo31886e().setMonth("*");
                WifiLightAlarmDetailActivity.this.f15377r.mo31886e().setDay("*");
                WifiLightAlarmDetailActivity.this.f15377r.mo31885d().setMonth("*");
                WifiLightAlarmDetailActivity.this.f15377r.mo31885d().setDay("*");
                WifiLightAlarmDetailActivity.this.f15377r.mo31886e().getDayOfWeeks().clear();
                WifiLightAlarmDetailActivity.this.f15377r.mo31885d().getDayOfWeeks().clear();
                for (int i = 0; i < zArr.length; i++) {
                    if (zArr[i]) {
                        WifiLightAlarmDetailActivity.this.f15377r.mo31886e().getDayOfWeeks().add(DayOfWeek.valueOf(i));
                        WifiLightAlarmDetailActivity.this.f15377r.mo31885d().getDayOfWeeks().add(DayOfWeek.valueOf(i));
                    }
                }
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$b$b */
        class C8690b implements DialogInterface.OnDismissListener {
            C8690b() {
            }

            public void onDismiss(DialogInterface dialogInterface) {
                WifiLightAlarmDetailActivity.this.m20511F0();
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$b$c */
        class C8691c implements DialogInterface.OnDismissListener {

            /* renamed from: a */
            final /* synthetic */ C9052a f15394a;

            C8691c(C8688b bVar, C9052a aVar) {
                this.f15394a = aVar;
            }

            public void onDismiss(DialogInterface dialogInterface) {
                this.f15394a.show();
            }
        }

        C8688b(C9052a aVar) {
            this.f15390a = aVar;
        }

        /* renamed from: a */
        public void mo35820a(int i) {
            if (i == 0) {
                WifiLightAlarmDetailActivity.this.f15377r.mo31886e().setMonth(String.valueOf(Calendar.getInstance().get(2) + 1));
                WifiLightAlarmDetailActivity.this.f15377r.mo31886e().setDay(String.valueOf(Calendar.getInstance().get(5)));
                WifiLightAlarmDetailActivity.this.f15377r.mo31885d().setMonth(String.valueOf(Calendar.getInstance().get(2) + 1));
                WifiLightAlarmDetailActivity.this.f15377r.mo31885d().setDay(String.valueOf(Calendar.getInstance().get(5)));
                WifiLightAlarmDetailActivity.this.f15377r.mo31886e().getDayOfWeeks().clear();
                WifiLightAlarmDetailActivity.this.f15377r.mo31885d().getDayOfWeeks().clear();
            } else if (i == 1) {
                WifiLightAlarmDetailActivity.this.f15377r.mo31886e().setMonth("*");
                WifiLightAlarmDetailActivity.this.f15377r.mo31886e().setDay("*");
                WifiLightAlarmDetailActivity.this.f15377r.mo31885d().setMonth("*");
                WifiLightAlarmDetailActivity.this.f15377r.mo31885d().setDay("*");
                WifiLightAlarmDetailActivity.this.f15377r.mo31886e().getDayOfWeeks().clear();
                List<DayOfWeek> dayOfWeeks = WifiLightAlarmDetailActivity.this.f15377r.mo31886e().getDayOfWeeks();
                DayOfWeek dayOfWeek = DayOfWeek.SUNDAY;
                dayOfWeeks.add(dayOfWeek);
                List<DayOfWeek> dayOfWeeks2 = WifiLightAlarmDetailActivity.this.f15377r.mo31886e().getDayOfWeeks();
                DayOfWeek dayOfWeek2 = DayOfWeek.MONDAY;
                dayOfWeeks2.add(dayOfWeek2);
                List<DayOfWeek> dayOfWeeks3 = WifiLightAlarmDetailActivity.this.f15377r.mo31886e().getDayOfWeeks();
                DayOfWeek dayOfWeek3 = DayOfWeek.TUESDAY;
                dayOfWeeks3.add(dayOfWeek3);
                List<DayOfWeek> dayOfWeeks4 = WifiLightAlarmDetailActivity.this.f15377r.mo31886e().getDayOfWeeks();
                DayOfWeek dayOfWeek4 = DayOfWeek.WEDNESDAY;
                dayOfWeeks4.add(dayOfWeek4);
                List<DayOfWeek> dayOfWeeks5 = WifiLightAlarmDetailActivity.this.f15377r.mo31886e().getDayOfWeeks();
                DayOfWeek dayOfWeek5 = DayOfWeek.THURSDAY;
                dayOfWeeks5.add(dayOfWeek5);
                List<DayOfWeek> dayOfWeeks6 = WifiLightAlarmDetailActivity.this.f15377r.mo31886e().getDayOfWeeks();
                DayOfWeek dayOfWeek6 = DayOfWeek.FRIDAY;
                dayOfWeeks6.add(dayOfWeek6);
                List<DayOfWeek> dayOfWeeks7 = WifiLightAlarmDetailActivity.this.f15377r.mo31886e().getDayOfWeeks();
                DayOfWeek dayOfWeek7 = DayOfWeek.SATURDAY;
                dayOfWeeks7.add(dayOfWeek7);
                WifiLightAlarmDetailActivity.this.f15377r.mo31885d().getDayOfWeeks().clear();
                WifiLightAlarmDetailActivity.this.f15377r.mo31885d().getDayOfWeeks().add(dayOfWeek);
                WifiLightAlarmDetailActivity.this.f15377r.mo31885d().getDayOfWeeks().add(dayOfWeek2);
                WifiLightAlarmDetailActivity.this.f15377r.mo31885d().getDayOfWeeks().add(dayOfWeek3);
                WifiLightAlarmDetailActivity.this.f15377r.mo31885d().getDayOfWeeks().add(dayOfWeek4);
                WifiLightAlarmDetailActivity.this.f15377r.mo31885d().getDayOfWeeks().add(dayOfWeek5);
                WifiLightAlarmDetailActivity.this.f15377r.mo31885d().getDayOfWeeks().add(dayOfWeek6);
                WifiLightAlarmDetailActivity.this.f15377r.mo31885d().getDayOfWeeks().add(dayOfWeek7);
            } else if (i == 2) {
                WifiLightAlarmDetailActivity.this.f15377r.mo31886e().setMonth("*");
                WifiLightAlarmDetailActivity.this.f15377r.mo31886e().setDay("*");
                WifiLightAlarmDetailActivity.this.f15377r.mo31885d().setMonth("*");
                WifiLightAlarmDetailActivity.this.f15377r.mo31885d().setDay("*");
                WifiLightAlarmDetailActivity.this.f15377r.mo31886e().getDayOfWeeks().clear();
                List<DayOfWeek> dayOfWeeks8 = WifiLightAlarmDetailActivity.this.f15377r.mo31886e().getDayOfWeeks();
                DayOfWeek dayOfWeek8 = DayOfWeek.MONDAY;
                dayOfWeeks8.add(dayOfWeek8);
                List<DayOfWeek> dayOfWeeks9 = WifiLightAlarmDetailActivity.this.f15377r.mo31886e().getDayOfWeeks();
                DayOfWeek dayOfWeek9 = DayOfWeek.TUESDAY;
                dayOfWeeks9.add(dayOfWeek9);
                List<DayOfWeek> dayOfWeeks10 = WifiLightAlarmDetailActivity.this.f15377r.mo31886e().getDayOfWeeks();
                DayOfWeek dayOfWeek10 = DayOfWeek.WEDNESDAY;
                dayOfWeeks10.add(dayOfWeek10);
                List<DayOfWeek> dayOfWeeks11 = WifiLightAlarmDetailActivity.this.f15377r.mo31886e().getDayOfWeeks();
                DayOfWeek dayOfWeek11 = DayOfWeek.THURSDAY;
                dayOfWeeks11.add(dayOfWeek11);
                List<DayOfWeek> dayOfWeeks12 = WifiLightAlarmDetailActivity.this.f15377r.mo31886e().getDayOfWeeks();
                DayOfWeek dayOfWeek12 = DayOfWeek.FRIDAY;
                dayOfWeeks12.add(dayOfWeek12);
                WifiLightAlarmDetailActivity.this.f15377r.mo31885d().getDayOfWeeks().clear();
                WifiLightAlarmDetailActivity.this.f15377r.mo31885d().getDayOfWeeks().add(dayOfWeek8);
                WifiLightAlarmDetailActivity.this.f15377r.mo31885d().getDayOfWeeks().add(dayOfWeek9);
                WifiLightAlarmDetailActivity.this.f15377r.mo31885d().getDayOfWeeks().add(dayOfWeek10);
                WifiLightAlarmDetailActivity.this.f15377r.mo31885d().getDayOfWeeks().add(dayOfWeek11);
                WifiLightAlarmDetailActivity.this.f15377r.mo31885d().getDayOfWeeks().add(dayOfWeek12);
            } else if (i == 3) {
                C9052a m = C9052a.m21694m(WifiLightAlarmDetailActivity.this, 2);
                m.mo36986o(WifiLightAlarmDetailActivity.this.f15377r);
                m.mo36990r(new C8689a());
                m.setOnDismissListener(new C8690b());
                this.f15390a.setOnDismissListener(new C8691c(this, m));
            }
            WifiLightAlarmDetailActivity.this.m20511F0();
            this.f15390a.dismiss();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$c */
    class C8692c implements C9071c.C9075d {
        C8692c() {
        }

        /* renamed from: a */
        public void mo31271a(String str, C9071c cVar) {
            WifiLightAlarmDetailActivity.this.m20540y0();
            cVar.dismiss();
            WifiLightAlarmDetailActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$d */
    class C8693d implements C9071c.C9075d {
        C8693d() {
        }

        /* renamed from: a */
        public void mo31271a(String str, C9071c cVar) {
            cVar.dismiss();
            WifiLightAlarmDetailActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$e */
    class C8694e implements DialogInterface.OnClickListener {
        C8694e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WifiLightAlarmDetailActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$f */
    class C8695f implements DialogInterface.OnClickListener {
        C8695f(WifiLightAlarmDetailActivity wifiLightAlarmDetailActivity) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$g */
    class C8696g implements CompletionHandler {
        C8696g() {
        }

        public void onFailed(int i, String str) {
            boolean unused = WifiLightAlarmDetailActivity.this.f15359X = false;
        }

        public void onSucceed() {
            WifiLightAlarmDetailActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$h */
    class C8697h implements DeviceManager.AddTimerCompletionHandler {
        C8697h() {
        }

        public void onFailed(int i, String str) {
            boolean unused = WifiLightAlarmDetailActivity.this.f15359X = false;
        }

        public void onSucceed(long j) {
            WifiLightAlarmDetailActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$i */
    class C8698i implements View.OnClickListener {
        C8698i() {
        }

        public void onClick(View view) {
            WifiLightAlarmDetailActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$j */
    class C8699j implements View.OnClickListener {
        C8699j() {
        }

        public void onClick(View view) {
            if (WifiLightAlarmDetailActivity.this.m20532o0() && !WifiLightAlarmDetailActivity.this.f15359X) {
                boolean unused = WifiLightAlarmDetailActivity.this.f15359X = true;
                WifiLightAlarmDetailActivity.this.m20540y0();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$k */
    class C8700k implements View.OnClickListener {
        C8700k() {
        }

        public void onClick(View view) {
            WifiLightAlarmDetailActivity.this.mo35985x0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$l */
    class C8701l implements View.OnClickListener {
        C8701l() {
        }

        public void onClick(View view) {
            if (WifiLightAlarmDetailActivity.this.f15379t instanceof WifiDeviceBase) {
                if (!WifiLightAlarmDetailActivity.this.f15378s || !WifiLightAlarmDetailActivity.this.f15385z) {
                    WifiLightAlarmDetailActivity wifiLightAlarmDetailActivity = WifiLightAlarmDetailActivity.this;
                    wifiLightAlarmDetailActivity.f15373n = ((AbstractService) ((WifiDeviceBase) wifiLightAlarmDetailActivity.f15379t).mo31477F1()).newAction(WifiLightAlarmDetailActivity.this.f15379t.mo23214X());
                    WifiLightAlarmDetailActivity.this.f15373n.setArgumentValue("Power", "on");
                }
            } else if (!(WifiLightAlarmDetailActivity.this.f15379t instanceof C6100g)) {
                return;
            } else {
                if (!WifiLightAlarmDetailActivity.this.f15378s || !WifiLightAlarmDetailActivity.this.f15385z) {
                    WifiLightAlarmDetailActivity wifiLightAlarmDetailActivity2 = WifiLightAlarmDetailActivity.this;
                    wifiLightAlarmDetailActivity2.f15375p = ((C6100g) wifiLightAlarmDetailActivity2.f15379t).mo31717O1(true);
                }
            }
            WifiLightAlarmDetailActivity.this.m20508C0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$m */
    class C8702m implements View.OnClickListener {
        C8702m() {
        }

        public void onClick(View view) {
            if (WifiLightAlarmDetailActivity.this.f15379t instanceof WifiDeviceBase) {
                WifiLightAlarmDetailActivity wifiLightAlarmDetailActivity = WifiLightAlarmDetailActivity.this;
                wifiLightAlarmDetailActivity.f15374o = ((AbstractService) ((WifiDeviceBase) wifiLightAlarmDetailActivity.f15379t).mo31477F1()).newAction(WifiLightAlarmDetailActivity.this.f15379t.mo23214X());
                WifiLightAlarmDetailActivity.this.f15374o.setArgumentValue("Power", "off");
            } else if (WifiLightAlarmDetailActivity.this.f15379t instanceof C6100g) {
                WifiLightAlarmDetailActivity wifiLightAlarmDetailActivity2 = WifiLightAlarmDetailActivity.this;
                wifiLightAlarmDetailActivity2.f15376q = ((C6100g) wifiLightAlarmDetailActivity2.f15379t).mo31717O1(false);
            } else {
                return;
            }
            WifiLightAlarmDetailActivity.this.m20507B0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$n */
    class C8703n implements View.OnClickListener {

        /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$n$a */
        class C8704a implements DialogInterface.OnClickListener {
            C8704a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                String trim = ((C8891a) dialogInterface).mo36645b().getText().toString().trim();
                WifiLightAlarmDetailActivity.this.f15377r.setName(trim);
                WifiLightAlarmDetailActivity.this.f15368i.setText(trim);
                String unused = WifiLightAlarmDetailActivity.this.f15381v = trim;
                dialogInterface.dismiss();
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$n$b */
        class C8705b implements DialogInterface.OnClickListener {
            C8705b(C8703n nVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }

        C8703n() {
        }

        public void onClick(View view) {
            C8891a m = new C8891a.C8893b(WifiLightAlarmDetailActivity.this).mo36664j(WifiLightAlarmDetailActivity.this.getString(R$string.common_text_rename)).mo36658d(WifiLightAlarmDetailActivity.this.f15377r.getName(), true, 100).mo36660f(R$string.common_text_cancel, new C8705b(this)).mo36662h(R$string.common_text_ok, new C8704a()).mo36656b(false).mo36667m();
            m.mo36645b().addTextChangedListener(new C9183a0(20, m.mo36645b()));
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$o */
    class C8706o implements View.OnClickListener {
        C8706o() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_id", WifiLightAlarmDetailActivity.this.f15379t.mo23185G());
            intent.putExtra("scene_schedule_select", true);
            intent.setClass(WifiLightAlarmDetailActivity.this, SceneActionSelectActivity.class);
            WifiLightAlarmDetailActivity.this.startActivityForResult(intent, 0);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$p */
    class C8707p implements AdapterView.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ int f15408a;

        C8707p(int i) {
            this.f15408a = i;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i == 0) {
                WifiLightAlarmDetailActivity.this.m20510E0(this.f15408a);
            } else if (i == 1) {
                int i2 = this.f15408a;
                if (i2 == 0) {
                    WifiLightAlarmDetailActivity.this.f15377r.setTimerStartEnabled(false);
                    boolean unused = WifiLightAlarmDetailActivity.this.f15385z = false;
                    WifiLightAlarmDetailActivity wifiLightAlarmDetailActivity = WifiLightAlarmDetailActivity.this;
                    wifiLightAlarmDetailActivity.f15370k.setText(wifiLightAlarmDetailActivity.getString(R$string.common_text_no_settings));
                    WifiLightAlarmDetailActivity wifiLightAlarmDetailActivity2 = WifiLightAlarmDetailActivity.this;
                    wifiLightAlarmDetailActivity2.f15373n = null;
                    wifiLightAlarmDetailActivity2.f15375p = null;
                } else if (i2 == 1) {
                    WifiLightAlarmDetailActivity.this.f15377r.setTimerEndEnabled(false);
                    boolean unused2 = WifiLightAlarmDetailActivity.this.f15350B = false;
                    WifiLightAlarmDetailActivity wifiLightAlarmDetailActivity3 = WifiLightAlarmDetailActivity.this;
                    wifiLightAlarmDetailActivity3.f15374o = null;
                    wifiLightAlarmDetailActivity3.f15376q = null;
                }
                WifiLightAlarmDetailActivity.this.m20512G0();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmDetailActivity$q */
    class C8708q implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f15410a;

        C8708q(WifiLightAlarmDetailActivity wifiLightAlarmDetailActivity, Dialog dialog) {
            this.f15410a = dialog;
        }

        public void onClick(View view) {
            this.f15410a.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public void m20506A0() {
        Calendar instance = Calendar.getInstance();
        if (this.f15377r.isTimerStartEnabled()) {
            if (!m20538v0(instance, this.f15377r.mo31886e().getHour(), this.f15377r.mo31886e().getMinute())) {
                instance.add(6, 1);
            }
            String valueOf = String.valueOf(instance.get(2) + 1);
            String valueOf2 = String.valueOf(instance.get(5));
            StringBuilder sb = new StringBuilder();
            sb.append("setTimerDate startTime month: ");
            sb.append(valueOf);
            sb.append("  day: ");
            sb.append(valueOf2);
            this.f15377r.mo31886e().setMonth(valueOf);
            this.f15377r.mo31886e().setDay(valueOf2);
            if (this.f15377r.isTimerEndEnabled()) {
                instance.set(11, this.f15377r.mo31886e().getHour());
                instance.set(12, this.f15377r.mo31886e().getMinute());
            }
        }
        if (this.f15377r.isTimerEndEnabled()) {
            if (!m20538v0(instance, this.f15377r.mo31885d().getHour(), this.f15377r.mo31885d().getMinute())) {
                instance.add(6, 1);
            }
            String valueOf3 = String.valueOf(instance.get(2) + 1);
            String valueOf4 = String.valueOf(instance.get(5));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("setTimerDate endTime month: ");
            sb2.append(valueOf3);
            sb2.append("  day: ");
            sb2.append(valueOf4);
            this.f15377r.mo31885d().setMonth(valueOf3);
            this.f15377r.mo31885d().setDay(valueOf4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public void m20507B0() {
        if (!this.f15377r.isTimerEndEnabled()) {
            m20510E0(1);
        } else {
            m20509D0(1, R$string.schedule_select_end_status);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public void m20508C0() {
        if (!this.f15377r.isTimerStartEnabled()) {
            m20510E0(0);
        } else {
            m20509D0(0, R$string.schedule_select_start_status);
        }
    }

    /* renamed from: D0 */
    private void m20509D0(int i, @StringRes int i2) {
        new C9065b.C9067b(this).mo37009g(i2).mo37006d(new int[]{R$string.schedule_modify_time, R$string.schedule_disable}).mo37008f(new C8707p(i)).mo37004b().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: E0 */
    public void m20510E0(int i) {
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
        inflate.findViewById(R$id.tv_timer_cancle).setOnClickListener(new C8708q(this, dialog));
        inflate.findViewById(R$id.tv_timer_modify).setOnClickListener(new C8687a(dialog, i, timePicker));
        if (i != 0) {
            if (i == 1) {
                if (this.f15377r.isTimerEndEnabled()) {
                    timePicker.setCurrentHour(Integer.valueOf(this.f15377r.mo31885d().getHour()));
                    d = this.f15377r.mo31885d();
                    num = Integer.valueOf(d.getMinute());
                    timePicker.setCurrentMinute(num);
                }
            }
            dialog.show();
        } else if (this.f15377r.isTimerStartEnabled()) {
            timePicker.setCurrentHour(Integer.valueOf(this.f15377r.mo31886e().getHour()));
            d = this.f15377r.mo31886e();
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
    public void m20511F0() {
        String str;
        int i;
        Resources resources;
        this.f15377r.mo31892r(false);
        CrontabTime e = this.f15377r.mo31886e();
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
            str = TimerModel.getAlarmRepeatDays(this, str2);
            this.f15364e.setText(str);
            this.f15383x = str;
        }
        str = resources.getString(i);
        this.f15364e.setText(str);
        this.f15383x = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: G0 */
    public void m20512G0() {
        TextView textView;
        float f = 0.5f;
        if (this.f15377r.isTimerStartEnabled()) {
            String valueOf = String.valueOf(this.f15377r.mo31886e().getHour());
            if (valueOf.length() == 1) {
                valueOf = TimerCodec.DISENABLE + valueOf;
            }
            String valueOf2 = String.valueOf(this.f15377r.mo31886e().getMinute());
            if (valueOf2.length() == 1) {
                valueOf2 = TimerCodec.DISENABLE + valueOf2;
            }
            String str = valueOf + Constants.COLON_SEPARATOR + valueOf2;
            this.f15365f.setText(str);
            if (this.f15357V) {
                this.f15351C = str;
                this.f15352Q = str;
                this.f15357V = false;
            } else {
                this.f15352Q = str;
            }
            C3010c cVar = this.f15379t;
            if (!(cVar instanceof C10337c) ? !C11972i.m30711i(cVar.mo23208T(), 2) : ((C10337c) cVar).mo41900r2() != 0) {
                m20541z0(false);
            } else {
                m20541z0(true);
            }
            this.f15370k.setAlpha(0.5f);
            textView = this.f15371l;
            f = 0.8f;
        } else {
            if (this.f15357V) {
                this.f15357V = false;
            }
            this.f15365f.setText(getString(R$string.alarm_disable));
            m20541z0(false);
            this.f15370k.setAlpha(0.2f);
            textView = this.f15371l;
        }
        textView.setAlpha(f);
        if (this.f15377r.isTimerEndEnabled()) {
            String valueOf3 = String.valueOf(this.f15377r.mo31885d().getHour());
            if (valueOf3.length() == 1) {
                valueOf3 = TimerCodec.DISENABLE + valueOf3;
            }
            String valueOf4 = String.valueOf(this.f15377r.mo31885d().getMinute());
            if (valueOf4.length() == 1) {
                valueOf4 = TimerCodec.DISENABLE + valueOf4;
            }
            String str2 = valueOf3 + Constants.COLON_SEPARATOR + valueOf4;
            this.f15366g.setText(str2);
            if (this.f15358W) {
                this.f15353R = str2;
                this.f15354S = str2;
                this.f15358W = false;
                return;
            }
            this.f15354S = str2;
            return;
        }
        if (this.f15358W) {
            this.f15358W = false;
        }
        this.f15366g.setText(getString(R$string.alarm_disable));
    }

    /* renamed from: m0 */
    private C8327s m20530m0(int i, int i2, int i3, int i4, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("mode = ");
        sb.append(i);
        sb.append(" , bright = ");
        sb.append(i2);
        sb.append(" , color = ");
        sb.append(i3);
        sb.append(" , ct = ");
        sb.append(i4);
        sb.append(" , flowJson = ");
        sb.append(str);
        if (i == 0) {
            return new C8314g("", -1, 3, i2, i4);
        }
        if (i == 1) {
            return new C8313f("", -1, 2, i2, i3);
        }
        if (i == 2) {
            try {
                return C8309b.m19702a0(new JSONObject(str));
            } catch (Exception unused) {
            }
        } else if (i != 3) {
            if (i == 4) {
                return new C8322n("", -1, 6, i2);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No reason to run here! ");
            sb2.append(new Exception());
            return null;
        }
        return new C8311d("", -1, 3, i2);
    }

    /* renamed from: n0 */
    private C8327s m20531n0(int i, int i2) {
        String str;
        List k;
        C3010c cVar = this.f15379t;
        if (cVar instanceof WifiDeviceBase) {
            str = ((WifiDeviceBase) cVar).mo23144i1();
            str.hashCode();
            if (str.equals("yeelink.light.ceiling10")) {
                str = "yeelink.light.ceiling10x";
            } else if (str.equals("yeelink.light.ceiling4")) {
                str = "yeelink.light.ceiling4x";
            }
        } else {
            str = cVar instanceof C6100g ? ((C6100g) cVar).mo23144i1() : null;
        }
        if (i == 0) {
            k = C3112v.m8242u().mo23560k(str);
            if (k == null || k.isEmpty() || k.size() <= i2) {
                return null;
            }
        } else if (i == 1) {
            k = C3112v.m8242u().mo23559j(str);
            if (k == null || k.isEmpty() || k.size() <= i2) {
                return null;
            }
        } else if (i != 2 || (k = C3112v.m8242u().mo23564p(str)) == null || k.isEmpty() || k.size() <= i2) {
            return null;
        }
        return (C8327s) k.get(i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public boolean m20532o0() {
        if (this.f15350B || this.f15385z) {
            return true;
        }
        C8891a.C8893b bVar = new C8891a.C8893b(this);
        bVar.mo36657c(true);
        bVar.mo36659e(getString(R$string.common_text_alarm_no_time_setting));
        bVar.mo36661g(getString(R$string.common_text_confirm_leave), new C8694e());
        bVar.mo36663i(getString(R$string.common_text_go_setting), new C8695f(this));
        bVar.mo36667m();
        return false;
    }

    /* renamed from: p0 */
    private int m20533p0() {
        CrontabTime e = this.f15377r.mo31886e();
        if (!TextUtils.equals(e.getMonth(), "*") || !TextUtils.equals(e.getDay(), "*") || this.f15377r.mo31890n()) {
            return 0;
        }
        List<DayOfWeek> dayOfWeeks = e.getDayOfWeeks();
        if (dayOfWeeks.size() == 7) {
            return 1;
        }
        return (dayOfWeeks.size() != 5 || dayOfWeeks.contains(DayOfWeek.SATURDAY) || dayOfWeeks.contains(DayOfWeek.SUNDAY)) ? 3 : 2;
    }

    /* renamed from: r0 */
    private String m20534r0(YeelightTimer yeelightTimer) {
        if (yeelightTimer == null) {
            return null;
        }
        Action startAction = yeelightTimer.getStartAction();
        C11980p[] j = yeelightTimer.mo31889j();
        if (startAction != null && !TextUtils.isEmpty(startAction.getDescription()) && !startAction.getFriendlyName().equals(this.f15379t.mo23214X())) {
            return startAction.getDescription();
        }
        if (j == null || j.length <= 0) {
            return null;
        }
        return j[0].mo42550a();
    }

    /* renamed from: s0 */
    private List<YeelightTimer> m20535s0() {
        C3010c cVar = this.f15379t;
        return cVar instanceof C6117h ? ((C6117h) cVar).mo31715L1() : (List) cVar.mo23221d0().mo31611r(1);
    }

    /* renamed from: t0 */
    private void m20536t0() {
        String str;
        YeelightTimer yeelightTimer;
        C3010c cVar = this.f15379t;
        if (cVar instanceof C6100g) {
            this.f15377r.setIdentify(((C6100g) cVar).mo31698M1());
            yeelightTimer = this.f15377r;
            str = ((C6100g) this.f15379t).mo31698M1();
        } else {
            this.f15377r.setIdentify(cVar.mo23185G());
            yeelightTimer = this.f15377r;
            str = this.f15379t.mo23185G();
        }
        yeelightTimer.setDeviceId(str);
        this.f15377r.setPushEnabled(false);
        this.f15377r.setTimerEnabled(true);
        this.f15377r.setTimerStartEnabled(false);
        this.f15377r.setTimerEndEnabled(false);
        this.f15377r.setName(getResources().getString(R$string.common_text_alarm_name));
        this.f15377r.mo31886e().setMonth(String.valueOf(Calendar.getInstance().get(2) + 1));
        this.f15377r.mo31886e().setDay(String.valueOf(Calendar.getInstance().get(5)));
        this.f15377r.mo31885d().setMonth(String.valueOf(Calendar.getInstance().get(2) + 1));
        this.f15377r.mo31885d().setDay(String.valueOf(Calendar.getInstance().get(5)));
        TextView textView = this.f15365f;
        int i = R$string.alarm_disable;
        textView.setText(getString(i));
        this.f15366g.setText(getString(i));
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
    private void m20537u0() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.yeelight.yeelib.device.models.YeelightTimer r1 = r7.f15377r
            com.miot.common.timer.CrontabTime r1 = r1.mo31886e()
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
            r7.f15382w = r1
            java.lang.String r1 = r0.toString()
            r7.f15383x = r1
            android.widget.TextView r1 = r7.f15364e
            r1.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p142ui.activity.WifiLightAlarmDetailActivity.m20537u0():void");
    }

    /* renamed from: v0 */
    private boolean m20538v0(Calendar calendar, int i, int i2) {
        int i3 = calendar.get(11);
        int i4 = calendar.get(12);
        StringBuilder sb = new StringBuilder();
        sb.append("currentHour:");
        sb.append(i3);
        sb.append("   currentMinute");
        sb.append(i4);
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
        r0 = r10.f15373n;
        r1 = java.lang.Long.valueOf((long) r11.mo35439f());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x018a, code lost:
        r0.setArgumentValue("ParamFinish", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x018d, code lost:
        r0 = r10.f15373n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x018f, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0191, code lost:
        r0.setDescription(r11.mo35450q());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x01a0, code lost:
        if (android.text.TextUtils.isEmpty(r11.mo35450q()) == false) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x01a2, code lost:
        r10.f15373n.setDescription(mo35984q0(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* renamed from: w0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m20539w0(com.yeelight.yeelib.models.C8327s r11) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x01c7
            com.yeelight.yeelib.device.models.YeelightTimer r0 = r10.f15377r
            r1 = 1
            r0.setTimerStartEnabled(r1)
            r0 = 0
            r10.f15373n = r0
            com.yeelight.yeelib.device.base.c r0 = r10.f15379t
            boolean r2 = r0 instanceof com.yeelight.yeelib.device.WifiDeviceBase
            if (r2 == 0) goto L_0x01ac
            com.yeelight.yeelib.device.WifiDeviceBase r0 = (com.yeelight.yeelib.device.WifiDeviceBase) r0
            java.lang.Object r0 = r0.mo31477F1()
            com.miot.common.abstractdevice.AbstractService r0 = (com.miot.common.abstractdevice.AbstractService) r0
            int r2 = r11.mo35449p()
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
            boolean r2 = r11 instanceof com.yeelight.yeelib.models.C8312e
            if (r2 == 0) goto L_0x018d
            r2 = r11
            com.yeelight.yeelib.models.e r2 = (com.yeelight.yeelib.models.C8312e) r2
            java.util.List r2 = r2.mo35348b0()
            if (r2 != 0) goto L_0x0043
            int r3 = r2.size()
            r4 = 2
            if (r3 < r4) goto L_0x018d
        L_0x0043:
            com.yeelight.yeelib.device.base.c r3 = r10.f15379t
            com.yeelight.yeelib.device.WifiDeviceBase r3 = (com.yeelight.yeelib.device.WifiDeviceBase) r3
            java.lang.String r3 = r3.mo31481J1()
            com.miot.common.device.Action r0 = r0.newAction(r3)
            r10.f15373n = r0
            java.lang.Object r3 = r2.get(r6)
            com.yeelight.yeelib.models.m r3 = (com.yeelight.yeelib.models.C8321m) r3
            java.lang.String r3 = r3.mo35345Z()
            java.lang.String r4 = "BundleItem1"
            r0.setArgumentValue(r4, r3)
            com.miot.common.device.Action r0 = r10.f15373n
            java.lang.Object r1 = r2.get(r1)
            com.yeelight.yeelib.models.m r1 = (com.yeelight.yeelib.models.C8321m) r1
            java.lang.String r1 = r1.mo35345Z()
            java.lang.String r2 = "BundleItem2"
            r0.setArgumentValue(r2, r1)
            goto L_0x018d
        L_0x0073:
            com.yeelight.yeelib.device.base.c r1 = r10.f15379t
            com.yeelight.yeelib.device.WifiDeviceBase r1 = (com.yeelight.yeelib.device.WifiDeviceBase) r1
            java.lang.String r1 = r1.mo31479H1()
            com.miot.common.device.Action r0 = r0.newAction(r1)
            r10.f15373n = r0
            java.lang.String r1 = "nightlight"
            r0.setArgumentValue(r9, r1)
            goto L_0x015c
        L_0x0088:
            com.yeelight.yeelib.device.base.c r1 = r10.f15379t
            com.yeelight.yeelib.device.WifiDeviceBase r1 = (com.yeelight.yeelib.device.WifiDeviceBase) r1
            java.lang.String r1 = r1.mo31478G1()
            com.miot.common.device.Action r0 = r0.newAction(r1)
            r10.f15373n = r0
            r0.setArgumentValue(r9, r4)
            com.miot.common.device.Action r0 = r10.f15373n
            com.yeelight.yeelib.models.a r1 = r11.mo35436c()
            int r1 = r1.mo35339i()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setArgumentValue(r7, r1)
            com.miot.common.device.Action r0 = r10.f15373n
            com.yeelight.yeelib.models.a r1 = r11.mo35436c()
            com.yeelight.yeelib.models.FlowCompleteAction r1 = r1.mo35336f()
            int r1 = r1.ordinal()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setArgumentValue(r8, r1)
            com.miot.common.device.Action r0 = r10.f15373n
            com.yeelight.yeelib.models.a r1 = r11.mo35436c()
            java.lang.String r1 = r1.mo35337g()
            goto L_0x00fb
        L_0x00ca:
            com.yeelight.yeelib.device.base.c r1 = r10.f15379t
            com.yeelight.yeelib.device.WifiDeviceBase r1 = (com.yeelight.yeelib.device.WifiDeviceBase) r1
            java.lang.String r1 = r1.mo31478G1()
            com.miot.common.device.Action r0 = r0.newAction(r1)
            r10.f15373n = r0
            r0.setArgumentValue(r9, r4)
            com.miot.common.device.Action r0 = r10.f15373n
            int r1 = r11.mo35444k()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setArgumentValue(r7, r1)
            com.miot.common.device.Action r0 = r10.f15373n
            int r1 = r11.mo35445l()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setArgumentValue(r8, r1)
            com.miot.common.device.Action r0 = r10.f15373n
            java.lang.String r1 = r11.mo35447n()
        L_0x00fb:
            r0.setArgumentValue(r3, r1)
            goto L_0x018d
        L_0x0100:
            com.yeelight.yeelib.device.base.c r1 = r10.f15379t
            com.yeelight.yeelib.device.WifiDeviceBase r1 = (com.yeelight.yeelib.device.WifiDeviceBase) r1
            java.lang.String r1 = r1.mo31480I1()
            com.miot.common.device.Action r0 = r0.newAction(r1)
            r10.f15373n = r0
            r0.setArgumentValue(r9, r5)
            com.miot.common.device.Action r0 = r10.f15373n
            int r1 = r11.mo35441h()
            long r1 = (long) r1
            goto L_0x0155
        L_0x0119:
            com.yeelight.yeelib.device.base.c r1 = r10.f15379t
            com.yeelight.yeelib.device.WifiDeviceBase r1 = (com.yeelight.yeelib.device.WifiDeviceBase) r1
            java.lang.String r1 = r1.mo31480I1()
            com.miot.common.device.Action r0 = r0.newAction(r1)
            r10.f15373n = r0
            java.lang.String r1 = "color"
            r0.setArgumentValue(r9, r1)
            int r0 = r11.mo35440g()
            if (r0 >= 0) goto L_0x0136
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r1
        L_0x0136:
            com.miot.common.device.Action r1 = r10.f15373n
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.setArgumentValue(r7, r0)
            goto L_0x015c
        L_0x0140:
            com.yeelight.yeelib.device.base.c r1 = r10.f15379t
            com.yeelight.yeelib.device.WifiDeviceBase r1 = (com.yeelight.yeelib.device.WifiDeviceBase) r1
            java.lang.String r1 = r1.mo31480I1()
            com.miot.common.device.Action r0 = r0.newAction(r1)
            r10.f15373n = r0
            r0.setArgumentValue(r9, r5)
            com.miot.common.device.Action r0 = r10.f15373n
            r1 = 4000(0xfa0, double:1.9763E-320)
        L_0x0155:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.setArgumentValue(r7, r1)
        L_0x015c:
            com.miot.common.device.Action r0 = r10.f15373n
            int r1 = r11.mo35439f()
            long r1 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            goto L_0x018a
        L_0x0168:
            com.yeelight.yeelib.device.base.c r1 = r10.f15379t
            com.yeelight.yeelib.device.WifiDeviceBase r1 = (com.yeelight.yeelib.device.WifiDeviceBase) r1
            java.lang.String r1 = r1.mo31480I1()
            com.miot.common.device.Action r0 = r0.newAction(r1)
            r10.f15373n = r0
            java.lang.String r1 = "off"
            r0.setArgumentValue(r9, r1)
            com.miot.common.device.Action r0 = r10.f15373n
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r0.setArgumentValue(r7, r1)
            com.miot.common.device.Action r0 = r10.f15373n
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
        L_0x018a:
            r0.setArgumentValue(r8, r1)
        L_0x018d:
            com.miot.common.device.Action r0 = r10.f15373n
            if (r0 == 0) goto L_0x01c7
            java.lang.String r1 = r11.mo35450q()
            r0.setDescription(r1)
            java.lang.String r0 = r11.mo35450q()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x01b8
            com.miot.common.device.Action r0 = r10.f15373n
            java.lang.String r1 = r10.mo35984q0(r11)
            r0.setDescription(r1)
            goto L_0x01b8
        L_0x01ac:
            boolean r1 = r0 instanceof com.yeelight.yeelib.device.base.C6100g
            if (r1 == 0) goto L_0x01c7
            com.yeelight.yeelib.device.base.g r0 = (com.yeelight.yeelib.device.base.C6100g) r0
            x3.p[] r0 = r0.mo31716N1(r11)
            r10.f15375p = r0
        L_0x01b8:
            java.lang.String r0 = r11.mo35450q()
            r10.f15356U = r0
            android.widget.TextView r0 = r10.f15370k
            java.lang.String r11 = r10.mo35984q0(r11)
            r0.setText(r11)
        L_0x01c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p142ui.activity.WifiLightAlarmDetailActivity.m20539w0(com.yeelight.yeelib.models.s):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public void m20540y0() {
        C3010c cVar = this.f15379t;
        if (cVar instanceof WifiDeviceBase) {
            Action action = this.f15373n;
            if (action != null) {
                this.f15377r.setStartAction(action);
            }
            Action action2 = this.f15374o;
            if (action2 != null) {
                this.f15377r.setEndAction(action2);
            }
        } else if (cVar instanceof C6100g) {
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            if (this.f15375p != null) {
                int i2 = 0;
                while (true) {
                    C11980p[] pVarArr = this.f15375p;
                    if (i2 >= pVarArr.length) {
                        break;
                    }
                    jSONArray.put(pVarArr[i2].mo42551b());
                    i2++;
                }
            }
            this.f15377r.setSpecStartTask(jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            if (this.f15376q != null) {
                while (true) {
                    C11980p[] pVarArr2 = this.f15376q;
                    if (i >= pVarArr2.length) {
                        break;
                    }
                    jSONArray2.put(pVarArr2[i].mo42551b());
                    i++;
                }
            }
            this.f15377r.setSpecEndTask(jSONArray2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(" name : ");
        sb.append(this.f15377r.getName());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("start time : ");
        sb2.append(this.f15377r.mo31886e());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("end time : ");
        sb3.append(this.f15377r.mo31885d());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("start action : ");
        sb4.append(this.f15373n);
        StringBuilder sb5 = new StringBuilder();
        sb5.append("end action : ");
        sb5.append(this.f15374o);
        if (this.f15378s) {
            try {
                this.f15377r.mo31891o();
                MiotManager.getDeviceManager().editTimer(this.f15377r, new C8696g());
            } catch (MiotException e) {
                e.printStackTrace();
            }
        } else {
            this.f15377r.mo31891o();
            MiotManager.getDeviceManager().addTimer(this.f15377r, new C8697h());
        }
    }

    /* renamed from: z0 */
    private void m20541z0(boolean z) {
        int i = 0;
        this.f15369j.setVisibility(z ? 0 : 4);
        View view = this.f15372m;
        if (!z) {
            i = 4;
        }
        view.setVisibility(i);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        C8327s sVar;
        StringBuilder sb = new StringBuilder();
        sb.append("CreateSceneBundle on Activity result called!!! resultCode = ");
        sb.append(i2);
        if (i2 == 1002) {
            sVar = m20530m0(intent.getIntExtra("light_adjust_mode", -1), intent.getIntExtra("light_adjust_bright", -1), intent.getIntExtra("light_adjust_color", -1), intent.getIntExtra("light_adjust_ct", -1), intent.getStringExtra("light_adjust_json"));
            if (sVar == null) {
                return;
            }
        } else if (i2 != 1003 || (sVar = m20531n0(intent.getIntExtra("scene_select_mode", -1), intent.getIntExtra("scene_select_position", -1))) == null) {
            return;
        }
        m20539w0(sVar);
    }

    public void onBackPressed() {
        StringBuilder sb = new StringBuilder();
        sb.append("current name : ");
        sb.append(this.f15380u);
        sb.append(", def name : ");
        sb.append(this.f15381v);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("current repeat : ");
        sb2.append(this.f15382w);
        sb2.append(", def repeat : ");
        sb2.append(this.f15383x);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("current start enable : ");
        sb3.append(this.f15384y);
        sb3.append(", def start enable : ");
        sb3.append(this.f15385z);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("current end enable : ");
        sb4.append(this.f15349A);
        sb4.append(", def end enable : ");
        sb4.append(this.f15350B);
        StringBuilder sb5 = new StringBuilder();
        sb5.append("current start time : ");
        sb5.append(this.f15351C);
        sb5.append(", def start enable : ");
        sb5.append(this.f15352Q);
        StringBuilder sb6 = new StringBuilder();
        sb6.append("current end time : ");
        sb6.append(this.f15353R);
        sb6.append(", def end enable : ");
        sb6.append(this.f15354S);
        StringBuilder sb7 = new StringBuilder();
        sb7.append("current scene name : ");
        sb7.append(this.f15355T);
        sb7.append(", def scene name : ");
        sb7.append(this.f15356U);
        Boolean bool = Boolean.TRUE;
        if (m20532o0()) {
            boolean z = true;
            if (!TextUtils.isEmpty(this.f15381v)) {
                bool = Boolean.valueOf(this.f15381v.equals(this.f15380u));
            }
            if (!TextUtils.isEmpty(this.f15356U)) {
                bool = Boolean.valueOf(bool.booleanValue() && this.f15356U.equals(this.f15355T));
            }
            if (!TextUtils.isEmpty(this.f15382w)) {
                bool = Boolean.valueOf(bool.booleanValue() && this.f15382w.equals(this.f15383x));
            }
            Boolean valueOf = Boolean.valueOf(bool.booleanValue() && this.f15384y == this.f15385z && this.f15349A == this.f15350B);
            if (valueOf.booleanValue() && !TextUtils.isEmpty(this.f15351C) && !TextUtils.isEmpty(this.f15353R)) {
                if (!valueOf.booleanValue() || !this.f15351C.equals(this.f15352Q) || !this.f15353R.equals(this.f15354S)) {
                    z = false;
                }
                valueOf = Boolean.valueOf(z);
            }
            if (valueOf.booleanValue()) {
                finish();
            } else {
                C9071c.m21727p(this, getString(R$string.common_text_discard), getString(R$string.common_text_save), getString(R$string.common_text_cancel), new C8692c(), new C8693d());
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
            mo35653P();
            C9193k.m22157h(true, this);
            setContentView(R$layout.activity_light_alarm_detail_wifi);
            this.f15360a = (CommonTitleBar) findViewById(R$id.title_bar);
            this.f15361b = (LinearLayout) findViewById(R$id.layout_repeat);
            this.f15362c = (LinearLayout) findViewById(R$id.layout_action_open);
            this.f15363d = (LinearLayout) findViewById(R$id.layout_action_close);
            this.f15364e = (TextView) findViewById(R$id.repeat_text);
            this.f15365f = (TextView) findViewById(R$id.open_text);
            this.f15366g = (TextView) findViewById(R$id.close_text);
            this.f15367h = (LinearLayout) findViewById(R$id.layout_alarm_name);
            this.f15368i = (TextView) findViewById(R$id.alarm_name_text);
            this.f15369j = (LinearLayout) findViewById(R$id.layout_scene);
            this.f15370k = (TextView) findViewById(R$id.alarm_scene_text);
            this.f15371l = (TextView) findViewById(R$id.alarm_scene_name_view);
            this.f15372m = findViewById(R$id.line_scence);
            this.f15360a.mo36195a(getResources().getString(R$string.alarm_set_time), new C8698i(), new C8699j());
            this.f15360a.setTitleTextSize(16);
            this.f15361b.setOnClickListener(new C8700k());
            this.f15362c.setOnClickListener(new C8701l());
            this.f15363d.setOnClickListener(new C8702m());
            Intent intent = getIntent();
            if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
                AppUtils.m8302w(f15348Y, "Activity has no device id", false);
                finish();
                return;
            }
            C3010c j0 = YeelightDeviceManager.m7794j0(intent.getStringExtra("com.yeelight.cherry.device_id"));
            this.f15379t = j0;
            if (j0 == null || !j0.mo23145k0()) {
                BaseActivity.m19947U(this);
                finish();
                return;
            }
            if (!intent.hasExtra("com.yeelight.cherry.device_timer")) {
                yeelightTimer = new YeelightTimer();
            } else {
                int intExtra = intent.getIntExtra("com.yeelight.cherry.device_timer", 0);
                List<YeelightTimer> s0 = m20535s0();
                if (s0 == null || s0.size() <= intExtra || intExtra < 0) {
                    yeelightTimer = new YeelightTimer();
                } else {
                    YeelightTimer yeelightTimer2 = s0.get(intExtra);
                    this.f15377r = yeelightTimer2;
                    this.f15368i.setText(yeelightTimer2.getName());
                    this.f15378s = true;
                    this.f15373n = this.f15377r.getStartAction();
                    this.f15375p = this.f15377r.mo31889j();
                    this.f15376q = this.f15377r.mo31884c();
                    C3010c cVar = this.f15379t;
                    if ((cVar instanceof WifiDeviceBase) || (cVar instanceof C6100g)) {
                        String r0 = m20534r0(this.f15377r);
                        if (!TextUtils.isEmpty(r0)) {
                            this.f15356U = r0;
                            this.f15355T = r0;
                            this.f15370k.setText(r0);
                        } else {
                            this.f15370k.setText(getString(R$string.common_text_no_settings));
                            this.f15355T = "";
                            this.f15356U = "";
                        }
                    }
                    this.f15380u = this.f15377r.getName();
                    this.f15381v = this.f15377r.getName();
                    boolean isTimerStartEnabled = this.f15377r.isTimerStartEnabled();
                    this.f15384y = isTimerStartEnabled;
                    this.f15385z = isTimerStartEnabled;
                    boolean isTimerEndEnabled = this.f15377r.isTimerEndEnabled();
                    this.f15349A = isTimerEndEnabled;
                    this.f15350B = isTimerEndEnabled;
                    m20537u0();
                    m20511F0();
                    this.f15367h.setOnClickListener(new C8703n());
                    this.f15369j.setOnClickListener(new C8706o());
                    m20512G0();
                }
            }
            this.f15377r = yeelightTimer;
            m20536t0();
            this.f15370k.setText(getResources().getText(R$string.common_text_no_settings));
            this.f15367h.setOnClickListener(new C8703n());
            this.f15369j.setOnClickListener(new C8706o());
            m20512G0();
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
        C3012e r0 = YeelightDeviceManager.m7804r0(getIntent().getStringExtra("com.yeelight.cherry.device_id"));
        this.f15379t = r0;
        if (r0 == null) {
            finish();
        } else {
            r0.mo23171z0(this);
        }
    }

    public void onStop() {
        super.onStop();
        this.f15379t.mo23133V0(this);
    }

    /* renamed from: q0 */
    public String mo35984q0(C8327s sVar) {
        Context context;
        int i;
        if (!TextUtils.isEmpty(sVar.mo35450q())) {
            return sVar.mo35450q();
        }
        if (sVar instanceof C8313f) {
            context = C3108x.f4951e;
            i = R$string.common_text_colors;
        } else if (sVar instanceof C8309b) {
            context = C3108x.f4951e;
            i = R$string.common_text_flow;
        } else if (sVar instanceof C8322n) {
            context = C3108x.f4951e;
            i = R$string.common_text_night_light;
        } else {
            context = C3108x.f4951e;
            i = R$string.common_text_sunshine;
        }
        return context.getString(i);
    }

    /* renamed from: x0 */
    public void mo35985x0() {
        C9052a m = C9052a.m21694m(this, 1);
        m.mo36993u(m20533p0());
        m.mo36991s(new C8688b(m));
        m.show();
    }
}

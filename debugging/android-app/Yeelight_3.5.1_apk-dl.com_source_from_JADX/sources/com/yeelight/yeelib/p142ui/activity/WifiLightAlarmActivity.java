package com.yeelight.yeelib.p142ui.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.miot.api.CompletionHandler;
import com.miot.api.MiotManager;
import com.miot.common.device.Action;
import com.miot.common.exception.MiotException;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C6100g;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.models.YeelightTimer;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.p142ui.view.YeelightSwitchButton;
import com.yeelight.yeelib.p142ui.widget.C8891a;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.Calendar;
import java.util.List;
import p051j4.C9193k;
import p227x3.C11980p;
import p237z3.C12145e;

/* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity */
public class WifiLightAlarmActivity extends BaseActivity implements C12145e {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final String f15319h = "WifiLightAlarmActivity";

    /* renamed from: a */
    CommonTitleBar f15320a;

    /* renamed from: b */
    ListView f15321b;

    /* renamed from: c */
    ImageView f15322c;

    /* renamed from: d */
    LinearLayout f15323d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C3010c f15324e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public List<YeelightTimer> f15325f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C8683g f15326g;

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$a */
    class C8675a implements View.OnClickListener {
        C8675a() {
        }

        public void onClick(View view) {
            WifiLightAlarmActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$b */
    class C8676b implements AdapterView.OnItemLongClickListener {

        /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$b$a */
        class C8677a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f15329a;

            /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$b$a$a */
            class C8678a implements CompletionHandler {
                C8678a() {
                }

                public void onFailed(int i, String str) {
                    WifiLightAlarmActivity.this.f15324e.mo23166x(8, (Object) null);
                }

                public void onSucceed() {
                    WifiLightAlarmActivity.this.f15324e.mo23166x(8, (Object) null);
                }
            }

            C8677a(int i) {
                this.f15329a = i;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Object item = WifiLightAlarmActivity.this.f15326g.getItem(this.f15329a);
                if (item instanceof YeelightTimer) {
                    try {
                        MiotManager.getDeviceManager().removeTimer(((YeelightTimer) item).getTimerId(), new C8678a());
                    } catch (MiotException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        C8676b() {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            new C8891a.C8893b(WifiLightAlarmActivity.this).mo36659e(WifiLightAlarmActivity.this.getString(R$string.wifi_alarm_delete)).mo36661g(WifiLightAlarmActivity.this.getString(R$string.common_text_cancel), (DialogInterface.OnClickListener) null).mo36663i(WifiLightAlarmActivity.this.getString(R$string.common_text_ok), new C8677a(i)).mo36655a().show();
            return true;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$c */
    class C8679c implements AdapterView.OnItemClickListener {
        C8679c() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Intent intent = new Intent(WifiLightAlarmActivity.this, WifiLightAlarmDetailActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", WifiLightAlarmActivity.this.f15324e.mo23185G());
            intent.putExtra("com.yeelight.cherry.device_timer", i);
            WifiLightAlarmActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$d */
    class C8680d implements View.OnClickListener {
        C8680d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(WifiLightAlarmActivity.this, WifiLightAlarmDetailActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", WifiLightAlarmActivity.this.f15324e.mo23185G());
            WifiLightAlarmActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$e */
    class C8681e implements View.OnClickListener {
        C8681e() {
        }

        public void onClick(View view) {
            WifiLightAlarmActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$f */
    class C8682f implements Runnable {
        C8682f() {
        }

        public void run() {
            List<YeelightTimer> list;
            WifiLightAlarmActivity wifiLightAlarmActivity;
            if (WifiLightAlarmActivity.this.f15324e instanceof C6100g) {
                wifiLightAlarmActivity = WifiLightAlarmActivity.this;
                list = ((C6100g) wifiLightAlarmActivity.f15324e).mo31715L1();
            } else {
                wifiLightAlarmActivity = WifiLightAlarmActivity.this;
                list = (List) wifiLightAlarmActivity.f15324e.mo23221d0().mo31611r(1);
            }
            List unused = wifiLightAlarmActivity.f15325f = list;
            StringBuilder sb = new StringBuilder();
            sb.append("WifiLightAlarmActivity, timer retrieved, size: ");
            sb.append(WifiLightAlarmActivity.this.f15325f.size());
            WifiLightAlarmActivity.this.f15326g.notifyDataSetChanged();
            WifiLightAlarmActivity.this.m20497b0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$g */
    private class C8683g extends BaseAdapter {

        /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$g$a */
        class C8684a implements CompoundButton.OnCheckedChangeListener {

            /* renamed from: a */
            final /* synthetic */ YeelightTimer f15337a;

            /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$g$a$a */
            class C8685a implements CompletionHandler {
                C8685a() {
                }

                /* access modifiers changed from: private */
                /* renamed from: b */
                public /* synthetic */ void m20503b() {
                    C8683g.this.notifyDataSetChanged();
                }

                public void onFailed(int i, String str) {
                }

                public void onSucceed() {
                    WifiLightAlarmActivity.this.f15324e.mo23166x(8, (Object) null);
                    WifiLightAlarmActivity.this.runOnUiThread(new C8737v(this));
                }
            }

            C8684a(YeelightTimer yeelightTimer) {
                this.f15337a = yeelightTimer;
            }

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f15337a.setTimerEnabled(z);
                if (z && YeelightTimer.m18295i(this.f15337a.getStartTime()) == YeelightTimer.RepeatType.REPEAT_ONCE) {
                    C8683g.this.m20501d(this.f15337a);
                }
                try {
                    this.f15337a.mo31891o();
                    MiotManager.getDeviceManager().editTimer(this.f15337a, new C8685a());
                } catch (MiotException e) {
                    e.printStackTrace();
                }
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$g$b */
        private class C8686b {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public RelativeLayout f15340a;

            /* renamed from: b */
            public TextView f15341b;

            /* renamed from: c */
            public TextView f15342c;

            /* renamed from: d */
            public TextView f15343d;

            /* renamed from: e */
            public TextView f15344e;

            /* renamed from: f */
            public View f15345f;

            /* renamed from: g */
            public TextView f15346g;

            /* renamed from: h */
            public YeelightSwitchButton f15347h;

            private C8686b(C8683g gVar) {
            }

            /* synthetic */ C8686b(C8683g gVar, C8675a aVar) {
                this(gVar);
            }
        }

        private C8683g() {
        }

        /* synthetic */ C8683g(WifiLightAlarmActivity wifiLightAlarmActivity, C8675a aVar) {
            this();
        }

        /* renamed from: b */
        private String m20499b(YeelightTimer yeelightTimer) {
            if (yeelightTimer == null) {
                return null;
            }
            Action startAction = yeelightTimer.getStartAction();
            C11980p[] j = yeelightTimer.mo31889j();
            if (startAction != null && !TextUtils.isEmpty(startAction.getDescription()) && !startAction.getFriendlyName().equals(WifiLightAlarmActivity.this.f15324e.mo23214X())) {
                return startAction.getDescription();
            }
            if (j == null || j.length <= 0) {
                return null;
            }
            return j[0].mo42550a();
        }

        /* renamed from: c */
        private boolean m20500c(Calendar calendar, int i, int i2) {
            int i3 = calendar.get(11);
            int i4 = calendar.get(12);
            String unused = WifiLightAlarmActivity.f15319h;
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

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m20501d(YeelightTimer yeelightTimer) {
            String unused = WifiLightAlarmActivity.f15319h;
            Calendar instance = Calendar.getInstance();
            if (yeelightTimer.isTimerStartEnabled()) {
                if (!m20500c(instance, yeelightTimer.mo31886e().getHour(), yeelightTimer.mo31886e().getMinute())) {
                    instance.add(6, 1);
                }
                String valueOf = String.valueOf(instance.get(2) + 1);
                String valueOf2 = String.valueOf(instance.get(5));
                String unused2 = WifiLightAlarmActivity.f15319h;
                StringBuilder sb = new StringBuilder();
                sb.append("setTimerDate startTime month: ");
                sb.append(valueOf);
                sb.append("  day: ");
                sb.append(valueOf2);
                yeelightTimer.mo31886e().setMonth(valueOf);
                yeelightTimer.mo31886e().setDay(valueOf2);
                if (yeelightTimer.isTimerEndEnabled()) {
                    instance.set(11, yeelightTimer.mo31886e().getHour());
                    instance.set(12, yeelightTimer.mo31886e().getMinute());
                }
            }
            if (yeelightTimer.isTimerEndEnabled()) {
                if (!m20500c(instance, yeelightTimer.mo31885d().getHour(), yeelightTimer.mo31885d().getMinute())) {
                    instance.add(6, 1);
                }
                String valueOf3 = String.valueOf(instance.get(2) + 1);
                String valueOf4 = String.valueOf(instance.get(5));
                String unused3 = WifiLightAlarmActivity.f15319h;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("setTimerDate endTime month: ");
                sb2.append(valueOf3);
                sb2.append("  day: ");
                sb2.append(valueOf4);
                yeelightTimer.mo31885d().setMonth(valueOf3);
                yeelightTimer.mo31885d().setDay(valueOf4);
            }
        }

        public int getCount() {
            if (WifiLightAlarmActivity.this.f15325f == null) {
                return 0;
            }
            return WifiLightAlarmActivity.this.f15325f.size();
        }

        public Object getItem(int i) {
            if (WifiLightAlarmActivity.this.f15325f != null && i >= 0 && i < WifiLightAlarmActivity.this.f15325f.size()) {
                return WifiLightAlarmActivity.this.f15325f.get(i);
            }
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0269, code lost:
            r0.append(r7.getString(r8));
            r6 = r6 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0277, code lost:
            r0.append(r7.getString(r8));
            r4 = r4 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0280, code lost:
            r0.append(" ");
         */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x02da  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x02e8  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r12, android.view.View r13, android.view.ViewGroup r14) {
            /*
                r11 = this;
                if (r13 != 0) goto L_0x0067
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$g$b r13 = new com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$g$b
                r14 = 0
                r13.<init>(r11, r14)
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r0 = com.yeelight.yeelib.p142ui.activity.WifiLightAlarmActivity.this
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                int r1 = com.yeelight.yeelib.R$layout.list_item_wifi_light_alarm
                android.view.View r14 = r0.inflate(r1, r14)
                int r0 = com.yeelight.yeelib.R$id.item_light_alarm_layout
                android.view.View r0 = r14.findViewById(r0)
                android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
                android.widget.RelativeLayout unused = r13.f15340a = r0
                int r0 = com.yeelight.yeelib.R$id.item_light_alarm_time
                android.view.View r0 = r14.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r13.f15341b = r0
                int r0 = com.yeelight.yeelib.R$id.item_light_alarm_time_action
                android.view.View r0 = r14.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r13.f15343d = r0
                int r0 = com.yeelight.yeelib.R$id.item_light_alarm_name
                android.view.View r0 = r14.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r13.f15342c = r0
                int r0 = com.yeelight.yeelib.R$id.item_light_alarm_scene_name
                android.view.View r0 = r14.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r13.f15344e = r0
                int r0 = com.yeelight.yeelib.R$id.item_light_alarm_scene_name_divider
                android.view.View r0 = r14.findViewById(r0)
                r13.f15345f = r0
                int r0 = com.yeelight.yeelib.R$id.item_light_alarm_repeat
                android.view.View r0 = r14.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r13.f15346g = r0
                int r0 = com.yeelight.yeelib.R$id.item_light_alarm_switch
                android.view.View r0 = r14.findViewById(r0)
                com.yeelight.yeelib.ui.view.YeelightSwitchButton r0 = (com.yeelight.yeelib.p142ui.view.YeelightSwitchButton) r0
                r13.f15347h = r0
                r14.setTag(r13)
                goto L_0x0070
            L_0x0067:
                java.lang.Object r14 = r13.getTag()
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$g$b r14 = (com.yeelight.yeelib.p142ui.activity.WifiLightAlarmActivity.C8683g.C8686b) r14
                r10 = r14
                r14 = r13
                r13 = r10
            L_0x0070:
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r0 = com.yeelight.yeelib.p142ui.activity.WifiLightAlarmActivity.this
                java.util.List r0 = r0.f15325f
                java.lang.Object r12 = r0.get(r12)
                com.yeelight.yeelib.device.models.YeelightTimer r12 = (com.yeelight.yeelib.device.models.YeelightTimer) r12
                java.lang.String r0 = r12.getName()
                java.lang.String r1 = ""
                if (r0 == 0) goto L_0x0095
                java.lang.String r0 = r12.getName()
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0095
                android.widget.TextView r0 = r13.f15342c
                java.lang.String r2 = r12.getName()
                goto L_0x009f
            L_0x0095:
                android.widget.TextView r0 = r13.f15342c
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r2 = com.yeelight.yeelib.p142ui.activity.WifiLightAlarmActivity.this
                int r3 = com.yeelight.yeelib.R$string.common_text_alarm_name
                java.lang.CharSequence r2 = r2.getText(r3)
            L_0x009f:
                r0.setText(r2)
                boolean r0 = r12.isTimerStartEnabled()
                com.miot.common.timer.CrontabTime r2 = r12.mo31886e()
                int r2 = r2.getHour()
                java.lang.String r2 = java.lang.String.valueOf(r2)
                int r3 = r2.length()
                java.lang.String r4 = "0"
                r5 = 1
                if (r3 != r5) goto L_0x00ca
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r4)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
            L_0x00ca:
                com.miot.common.timer.CrontabTime r3 = r12.mo31886e()
                int r3 = r3.getMinute()
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r6 = r3.length()
                if (r6 != r5) goto L_0x00eb
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r4)
                r6.append(r3)
                java.lang.String r3 = r6.toString()
            L_0x00eb:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r2)
                java.lang.String r2 = ":"
                r6.append(r2)
                r6.append(r3)
                java.lang.String r3 = r6.toString()
                boolean r6 = r12.isTimerEndEnabled()
                com.miot.common.timer.CrontabTime r7 = r12.mo31885d()
                int r7 = r7.getHour()
                java.lang.String r7 = java.lang.String.valueOf(r7)
                int r8 = r7.length()
                if (r8 != r5) goto L_0x0124
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r4)
                r8.append(r7)
                java.lang.String r7 = r8.toString()
            L_0x0124:
                com.miot.common.timer.CrontabTime r8 = r12.mo31885d()
                int r8 = r8.getMinute()
                java.lang.String r8 = java.lang.String.valueOf(r8)
                int r9 = r8.length()
                if (r9 != r5) goto L_0x0145
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r4)
                r9.append(r8)
                java.lang.String r8 = r9.toString()
            L_0x0145:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r7)
                r4.append(r2)
                r4.append(r8)
                java.lang.String r2 = r4.toString()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r7 = "timer start enabled: "
                r4.append(r7)
                r4.append(r0)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r7 = "timer start time: "
                r4.append(r7)
                r4.append(r3)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r7 = "timer end enabled: "
                r4.append(r7)
                r4.append(r6)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r7 = "timer end time: "
                r4.append(r7)
                r4.append(r2)
                r4 = r0 & r6
                if (r4 == 0) goto L_0x01ae
                android.widget.TextView r4 = r13.f15341b
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r3)
                java.lang.String r3 = "~"
                r6.append(r3)
                r6.append(r2)
                java.lang.String r2 = r6.toString()
                r4.setText(r2)
                android.widget.TextView r2 = r13.f15343d
                r2.setText(r1)
                goto L_0x01d1
            L_0x01ae:
                if (r0 == 0) goto L_0x01c3
                android.widget.TextView r1 = r13.f15341b
                r1.setText(r3)
                android.widget.TextView r1 = r13.f15343d
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r2 = com.yeelight.yeelib.p142ui.activity.WifiLightAlarmActivity.this
                int r3 = com.yeelight.yeelib.R$string.wifi_alarm_start
            L_0x01bb:
                java.lang.String r2 = r2.getString(r3)
                r1.setText(r2)
                goto L_0x01d1
            L_0x01c3:
                if (r6 == 0) goto L_0x01d1
                android.widget.TextView r1 = r13.f15341b
                r1.setText(r2)
                android.widget.TextView r1 = r13.f15343d
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r2 = com.yeelight.yeelib.p142ui.activity.WifiLightAlarmActivity.this
                int r3 = com.yeelight.yeelib.R$string.wifi_alarm_end
                goto L_0x01bb
            L_0x01d1:
                r1 = 0
                if (r0 == 0) goto L_0x01f2
                java.lang.String r0 = r11.m20499b(r12)
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L_0x01f2
                android.widget.TextView r0 = r13.f15344e
                r0.setVisibility(r1)
                android.view.View r0 = r13.f15345f
                r0.setVisibility(r1)
                android.widget.TextView r0 = r13.f15344e
                java.lang.String r2 = r11.m20499b(r12)
                r0.setText(r2)
                goto L_0x01fe
            L_0x01f2:
                android.widget.TextView r0 = r13.f15344e
                r2 = 8
                r0.setVisibility(r2)
                android.view.View r0 = r13.f15345f
                r0.setVisibility(r2)
            L_0x01fe:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.miot.common.timer.CrontabTime r2 = r12.mo31886e()
                java.lang.String r3 = r2.getMonth()
                java.lang.String r4 = "*"
                boolean r3 = android.text.TextUtils.equals(r3, r4)
                if (r3 == 0) goto L_0x02c0
                java.lang.String r3 = r2.getDay()
                boolean r3 = android.text.TextUtils.equals(r3, r4)
                if (r3 == 0) goto L_0x02c0
                java.util.List r2 = r2.getDayOfWeeks()
                int r3 = r2.size()
                r4 = 7
                if (r3 != r4) goto L_0x022e
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r2 = com.yeelight.yeelib.p142ui.activity.WifiLightAlarmActivity.this
                int r3 = com.yeelight.yeelib.R$string.activity_wifi_alarm_repeat_all
                goto L_0x02c4
            L_0x022e:
                int r3 = r2.size()
                java.util.Iterator r2 = r2.iterator()
                r4 = 0
                r6 = 0
            L_0x0238:
                boolean r7 = r2.hasNext()
                if (r7 == 0) goto L_0x0286
                java.lang.Object r7 = r2.next()
                com.miot.common.timer.DayOfWeek r7 = (com.miot.common.timer.DayOfWeek) r7
                int r7 = r7.value()
                switch(r7) {
                    case 0: goto L_0x0273;
                    case 1: goto L_0x0265;
                    case 2: goto L_0x0260;
                    case 3: goto L_0x025b;
                    case 4: goto L_0x0256;
                    case 5: goto L_0x0251;
                    case 6: goto L_0x024c;
                    default: goto L_0x024b;
                }
            L_0x024b:
                goto L_0x0280
            L_0x024c:
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r7 = com.yeelight.yeelib.p142ui.activity.WifiLightAlarmActivity.this
                int r8 = com.yeelight.yeelib.R$string.common_text_repeat_6
                goto L_0x0277
            L_0x0251:
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r7 = com.yeelight.yeelib.p142ui.activity.WifiLightAlarmActivity.this
                int r8 = com.yeelight.yeelib.R$string.common_text_repeat_5
                goto L_0x0269
            L_0x0256:
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r7 = com.yeelight.yeelib.p142ui.activity.WifiLightAlarmActivity.this
                int r8 = com.yeelight.yeelib.R$string.common_text_repeat_4
                goto L_0x0269
            L_0x025b:
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r7 = com.yeelight.yeelib.p142ui.activity.WifiLightAlarmActivity.this
                int r8 = com.yeelight.yeelib.R$string.common_text_repeat_3
                goto L_0x0269
            L_0x0260:
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r7 = com.yeelight.yeelib.p142ui.activity.WifiLightAlarmActivity.this
                int r8 = com.yeelight.yeelib.R$string.common_text_repeat_2
                goto L_0x0269
            L_0x0265:
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r7 = com.yeelight.yeelib.p142ui.activity.WifiLightAlarmActivity.this
                int r8 = com.yeelight.yeelib.R$string.common_text_repeat_1
            L_0x0269:
                java.lang.String r7 = r7.getString(r8)
                r0.append(r7)
                int r6 = r6 + 1
                goto L_0x0280
            L_0x0273:
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r7 = com.yeelight.yeelib.p142ui.activity.WifiLightAlarmActivity.this
                int r8 = com.yeelight.yeelib.R$string.common_text_repeat_7
            L_0x0277:
                java.lang.String r7 = r7.getString(r8)
                r0.append(r7)
                int r4 = r4 + 1
            L_0x0280:
                java.lang.String r7 = " "
                r0.append(r7)
                goto L_0x0238
            L_0x0286:
                int r2 = r0.length()
                if (r2 == 0) goto L_0x0298
                int r2 = r0.length()
                int r2 = r2 - r5
                int r7 = r0.length()
                r0.delete(r2, r7)
            L_0x0298:
                r2 = 5
                if (r3 != r2) goto L_0x02af
                if (r6 != r2) goto L_0x02af
                int r2 = r0.length()
                r0.delete(r1, r2)
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r2 = com.yeelight.yeelib.p142ui.activity.WifiLightAlarmActivity.this
                int r6 = com.yeelight.yeelib.R$string.common_text_repeat_weekday
                java.lang.String r2 = r2.getString(r6)
                r0.append(r2)
            L_0x02af:
                r2 = 2
                if (r3 != r2) goto L_0x02cb
                if (r4 != r2) goto L_0x02cb
                int r2 = r0.length()
                r0.delete(r1, r2)
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r2 = com.yeelight.yeelib.p142ui.activity.WifiLightAlarmActivity.this
                int r3 = com.yeelight.yeelib.R$string.common_text_repeat_weekend
                goto L_0x02c4
            L_0x02c0:
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r2 = com.yeelight.yeelib.p142ui.activity.WifiLightAlarmActivity.this
                int r3 = com.yeelight.yeelib.R$string.common_text_repeat_once
            L_0x02c4:
                java.lang.String r2 = r2.getString(r3)
                r0.append(r2)
            L_0x02cb:
                android.widget.TextView r2 = r13.f15346g
                java.lang.String r0 = r0.toString()
                r2.setText(r0)
                boolean r0 = r12.isTimerEnabled()
                if (r0 == 0) goto L_0x02e8
                com.yeelight.yeelib.ui.view.YeelightSwitchButton r0 = r13.f15347h
                r0.setChecked(r5)
                android.widget.RelativeLayout r0 = r13.f15340a
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r1 = com.yeelight.yeelib.p142ui.activity.WifiLightAlarmActivity.this
                int r2 = com.yeelight.yeelib.R$color.item_alarm_enable_color
                goto L_0x02f5
            L_0x02e8:
                com.yeelight.yeelib.ui.view.YeelightSwitchButton r0 = r13.f15347h
                r0.setChecked(r1)
                android.widget.RelativeLayout r0 = r13.f15340a
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r1 = com.yeelight.yeelib.p142ui.activity.WifiLightAlarmActivity.this
                int r2 = com.yeelight.yeelib.R$color.item_alarm_disable_color
            L_0x02f5:
                int r1 = androidx.core.content.ContextCompat.getColor(r1, r2)
                r0.setBackgroundColor(r1)
                com.yeelight.yeelib.ui.view.YeelightSwitchButton r13 = r13.f15347h
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$g$a r0 = new com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$g$a
                r0.<init>(r12)
                r13.setOnPerformCheckedChangeListener(r0)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p142ui.activity.WifiLightAlarmActivity.C8683g.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m20497b0() {
        int i;
        LinearLayout linearLayout;
        if (this.f15325f.size() == 0) {
            linearLayout = this.f15323d;
            i = 0;
        } else {
            linearLayout = this.f15323d;
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        setContentView(R$layout.activity_light_alarm);
        C9193k.m22157h(true, this);
        this.f15320a = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f15321b = (ListView) findViewById(R$id.light_alarm_list);
        this.f15322c = (ImageView) findViewById(R$id.light_alarm_wifi_add);
        this.f15323d = (LinearLayout) findViewById(R$id.no_alarm_added_layout);
        CommonTitleBar commonTitleBar = this.f15320a;
        int i = R$string.feature_alarm;
        commonTitleBar.mo36195a(getString(i), new C8675a(), (View.OnClickListener) null);
        this.f15320a.setTitleTextSize(16);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f15319h, "Activity has not device id", false);
            finish();
            return;
        }
        C3010c j0 = YeelightDeviceManager.m7794j0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f15324e = j0;
        if (j0 == null) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        if (!(j0 instanceof WifiDeviceBase) && !(j0 instanceof C6100g)) {
            String str = f15319h;
            AppUtils.m8300u(str, "Device wrong type: " + this.f15324e.mo23188I().mo31880a());
        }
        C8683g gVar = new C8683g(this, (C8675a) null);
        this.f15326g = gVar;
        this.f15321b.setAdapter(gVar);
        this.f15321b.setOnItemLongClickListener(new C8676b());
        this.f15321b.setOnItemClickListener(new C8679c());
        this.f15322c.setOnClickListener(new C8680d());
        this.f15320a.mo36195a(getString(i), new C8681e(), (View.OnClickListener) null);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C3010c cVar = this.f15324e;
        if (cVar != null) {
            cVar.mo23213W0(this);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f15324e.mo23213W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f15323d.setVisibility(8);
        this.f15324e.mo23178B0(this);
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == -1) {
            this.f15324e.mo23166x(8, (Object) null);
        } else if (i == 4096) {
            runOnUiThread(new C8682f());
        }
    }
}

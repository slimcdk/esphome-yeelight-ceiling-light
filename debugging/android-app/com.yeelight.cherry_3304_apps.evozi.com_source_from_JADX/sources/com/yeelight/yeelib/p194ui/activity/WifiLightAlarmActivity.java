package com.yeelight.yeelib.p194ui.activity;

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
import com.yeelight.yeelib.device.models.C7638m0;
import com.yeelight.yeelib.device.models.YeelightTimer;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6050n;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.view.YeelightSwitchButton;
import com.yeelight.yeelib.p194ui.widget.C10521d;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.Calendar;
import java.util.List;

/* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity */
public class WifiLightAlarmActivity extends BaseActivity implements C9770e {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final String f19011i = WifiLightAlarmActivity.class.getSimpleName();

    /* renamed from: b */
    CommonTitleBar f19012b;

    /* renamed from: c */
    ListView f19013c;

    /* renamed from: d */
    ImageView f19014d;

    /* renamed from: e */
    LinearLayout f19015e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C4198d f19016f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public List<YeelightTimer> f19017g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C10265g f19018h;

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$a */
    class C10257a implements View.OnClickListener {
        C10257a() {
        }

        public void onClick(View view) {
            WifiLightAlarmActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$b */
    class C10258b implements AdapterView.OnItemLongClickListener {

        /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$b$a */
        class C10259a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f19021a;

            /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$b$a$a */
            class C10260a implements CompletionHandler {
                C10260a() {
                }

                public void onFailed(int i, String str) {
                    WifiLightAlarmActivity.this.f19016f.mo23353x(8, (Object) null);
                }

                public void onSucceed() {
                    WifiLightAlarmActivity.this.f19016f.mo23353x(8, (Object) null);
                }
            }

            C10259a(int i) {
                this.f19021a = i;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Object item = WifiLightAlarmActivity.this.f19018h.getItem(this.f19021a);
                if (item instanceof YeelightTimer) {
                    try {
                        MiotManager.getDeviceManager().removeTimer(((YeelightTimer) item).getTimerId(), new C10260a());
                    } catch (MiotException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        C10258b() {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            C10521d.C10523b bVar = new C10521d.C10523b(WifiLightAlarmActivity.this);
            bVar.mo33320e(WifiLightAlarmActivity.this.getString(R$string.wifi_alarm_delete));
            bVar.mo33322g(WifiLightAlarmActivity.this.getString(R$string.common_text_cancel), (DialogInterface.OnClickListener) null);
            bVar.mo33324i(WifiLightAlarmActivity.this.getString(R$string.common_text_ok), new C10259a(i));
            bVar.mo33316a().show();
            return true;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$c */
    class C10261c implements AdapterView.OnItemClickListener {
        C10261c() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Intent intent = new Intent(WifiLightAlarmActivity.this, WifiLightAlarmDetailActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", WifiLightAlarmActivity.this.f19016f.mo23372G());
            intent.putExtra("com.yeelight.cherry.device_timer", i);
            WifiLightAlarmActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$d */
    class C10262d implements View.OnClickListener {
        C10262d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(WifiLightAlarmActivity.this, WifiLightAlarmDetailActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", WifiLightAlarmActivity.this.f19016f.mo23372G());
            WifiLightAlarmActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$e */
    class C10263e implements View.OnClickListener {
        C10263e() {
        }

        public void onClick(View view) {
            WifiLightAlarmActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$f */
    class C10264f implements Runnable {
        C10264f() {
        }

        public void run() {
            List<YeelightTimer> list;
            WifiLightAlarmActivity wifiLightAlarmActivity;
            if (WifiLightAlarmActivity.this.f19016f instanceof C6050n) {
                wifiLightAlarmActivity = WifiLightAlarmActivity.this;
                list = ((C6050n) wifiLightAlarmActivity.f19016f).mo27829L1();
            } else {
                wifiLightAlarmActivity = WifiLightAlarmActivity.this;
                list = (List) wifiLightAlarmActivity.f19016f.mo23408d0().mo27710r(1);
            }
            List unused = wifiLightAlarmActivity.f19017g = list;
            "WifiLightAlarmActivity, timer retrieved, size: " + WifiLightAlarmActivity.this.f19017g.size();
            WifiLightAlarmActivity.this.f19018h.notifyDataSetChanged();
            WifiLightAlarmActivity.this.m24880b0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$g */
    private class C10265g extends BaseAdapter {

        /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$g$a */
        class C10266a implements CompoundButton.OnCheckedChangeListener {

            /* renamed from: a */
            final /* synthetic */ YeelightTimer f19029a;

            /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$g$a$a */
            class C10267a implements CompletionHandler {
                C10267a() {
                }

                /* renamed from: a */
                public /* synthetic */ void mo32567a() {
                    C10265g.this.notifyDataSetChanged();
                }

                public void onFailed(int i, String str) {
                }

                public void onSucceed() {
                    WifiLightAlarmActivity.this.f19016f.mo23353x(8, (Object) null);
                    WifiLightAlarmActivity.this.runOnUiThread(new C10351y0(this));
                }
            }

            C10266a(YeelightTimer yeelightTimer) {
                this.f19029a = yeelightTimer;
            }

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f19029a.setTimerEnabled(z);
                if (z && YeelightTimer.m22454i(this.f19029a.getStartTime()) == YeelightTimer.C7609b.REPEAT_ONCE) {
                    C10265g.this.m24884d(this.f19029a);
                }
                try {
                    this.f19029a.mo29036o();
                    MiotManager.getDeviceManager().editTimer(this.f19029a, new C10267a());
                } catch (MiotException e) {
                    e.printStackTrace();
                }
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$g$b */
        private class C10268b {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public RelativeLayout f19032a;

            /* renamed from: b */
            public TextView f19033b;

            /* renamed from: c */
            public TextView f19034c;

            /* renamed from: d */
            public TextView f19035d;

            /* renamed from: e */
            public TextView f19036e;

            /* renamed from: f */
            public View f19037f;

            /* renamed from: g */
            public TextView f19038g;

            /* renamed from: h */
            public YeelightSwitchButton f19039h;

            private C10268b(C10265g gVar) {
            }

            /* synthetic */ C10268b(C10265g gVar, C10257a aVar) {
                this(gVar);
            }
        }

        private C10265g() {
        }

        /* synthetic */ C10265g(WifiLightAlarmActivity wifiLightAlarmActivity, C10257a aVar) {
            this();
        }

        /* renamed from: b */
        private String m24882b(YeelightTimer yeelightTimer) {
            if (yeelightTimer == null) {
                return null;
            }
            Action startAction = yeelightTimer.getStartAction();
            C7638m0[] j = yeelightTimer.mo29034j();
            if (startAction != null && !TextUtils.isEmpty(startAction.getDescription()) && !startAction.getFriendlyName().equals(WifiLightAlarmActivity.this.f19016f.mo23401X())) {
                return startAction.getDescription();
            }
            if (j == null || j.length <= 0) {
                return null;
            }
            return j[0].mo29083a();
        }

        /* renamed from: c */
        private boolean m24883c(Calendar calendar, int i, int i2) {
            int i3 = calendar.get(11);
            int i4 = calendar.get(12);
            String unused = WifiLightAlarmActivity.f19011i;
            "currentHour:" + i3 + "   currentMinute" + i4;
            if (i < i3) {
                return false;
            }
            return i != i3 || i2 > i4;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m24884d(YeelightTimer yeelightTimer) {
            String unused = WifiLightAlarmActivity.f19011i;
            Calendar instance = Calendar.getInstance();
            if (yeelightTimer.isTimerStartEnabled()) {
                if (!m24883c(instance, yeelightTimer.mo29031e().getHour(), yeelightTimer.mo29031e().getMinute())) {
                    instance.add(6, 1);
                }
                String valueOf = String.valueOf(instance.get(2) + 1);
                String valueOf2 = String.valueOf(instance.get(5));
                String unused2 = WifiLightAlarmActivity.f19011i;
                "setTimerDate startTime month: " + valueOf + "  day: " + valueOf2;
                yeelightTimer.mo29031e().setMonth(valueOf);
                yeelightTimer.mo29031e().setDay(valueOf2);
                if (yeelightTimer.isTimerEndEnabled()) {
                    instance.set(11, yeelightTimer.mo29031e().getHour());
                    instance.set(12, yeelightTimer.mo29031e().getMinute());
                }
            }
            if (yeelightTimer.isTimerEndEnabled()) {
                if (!m24883c(instance, yeelightTimer.mo29030d().getHour(), yeelightTimer.mo29030d().getMinute())) {
                    instance.add(6, 1);
                }
                String valueOf3 = String.valueOf(instance.get(2) + 1);
                String valueOf4 = String.valueOf(instance.get(5));
                String unused3 = WifiLightAlarmActivity.f19011i;
                "setTimerDate endTime month: " + valueOf3 + "  day: " + valueOf4;
                yeelightTimer.mo29030d().setMonth(valueOf3);
                yeelightTimer.mo29030d().setDay(valueOf4);
            }
        }

        public int getCount() {
            if (WifiLightAlarmActivity.this.f19017g == null) {
                return 0;
            }
            return WifiLightAlarmActivity.this.f19017g.size();
        }

        public Object getItem(int i) {
            if (WifiLightAlarmActivity.this.f19017g != null && i >= 0 && i < WifiLightAlarmActivity.this.f19017g.size()) {
                return WifiLightAlarmActivity.this.f19017g.get(i);
            }
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0275, code lost:
            r0.append(r7.getString(r8));
            r6 = r6 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0283, code lost:
            r0.append(r7.getString(r8));
            r4 = r4 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x028c, code lost:
            r0.append(" ");
         */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x02e6  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x02f4  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r12, android.view.View r13, android.view.ViewGroup r14) {
            /*
                r11 = this;
                if (r13 != 0) goto L_0x0067
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$g$b r13 = new com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$g$b
                r14 = 0
                r13.<init>(r11, r14)
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r0 = com.yeelight.yeelib.p194ui.activity.WifiLightAlarmActivity.this
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                int r1 = com.yeelight.yeelib.R$layout.list_item_wifi_light_alarm
                android.view.View r14 = r0.inflate(r1, r14)
                int r0 = com.yeelight.yeelib.R$id.item_light_alarm_layout
                android.view.View r0 = r14.findViewById(r0)
                android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
                android.widget.RelativeLayout unused = r13.f19032a = r0
                int r0 = com.yeelight.yeelib.R$id.item_light_alarm_time
                android.view.View r0 = r14.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r13.f19033b = r0
                int r0 = com.yeelight.yeelib.R$id.item_light_alarm_time_action
                android.view.View r0 = r14.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r13.f19035d = r0
                int r0 = com.yeelight.yeelib.R$id.item_light_alarm_name
                android.view.View r0 = r14.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r13.f19034c = r0
                int r0 = com.yeelight.yeelib.R$id.item_light_alarm_scene_name
                android.view.View r0 = r14.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r13.f19036e = r0
                int r0 = com.yeelight.yeelib.R$id.item_light_alarm_scene_name_divider
                android.view.View r0 = r14.findViewById(r0)
                r13.f19037f = r0
                int r0 = com.yeelight.yeelib.R$id.item_light_alarm_repeat
                android.view.View r0 = r14.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r13.f19038g = r0
                int r0 = com.yeelight.yeelib.R$id.item_light_alarm_switch
                android.view.View r0 = r14.findViewById(r0)
                com.yeelight.yeelib.ui.view.YeelightSwitchButton r0 = (com.yeelight.yeelib.p194ui.view.YeelightSwitchButton) r0
                r13.f19039h = r0
                r14.setTag(r13)
                goto L_0x0070
            L_0x0067:
                java.lang.Object r14 = r13.getTag()
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$g$b r14 = (com.yeelight.yeelib.p194ui.activity.WifiLightAlarmActivity.C10265g.C10268b) r14
                r10 = r14
                r14 = r13
                r13 = r10
            L_0x0070:
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r0 = com.yeelight.yeelib.p194ui.activity.WifiLightAlarmActivity.this
                java.util.List r0 = r0.f19017g
                java.lang.Object r12 = r0.get(r12)
                com.yeelight.yeelib.device.models.YeelightTimer r12 = (com.yeelight.yeelib.device.models.YeelightTimer) r12
                java.lang.String r0 = r12.getName()
                java.lang.String r1 = ""
                if (r0 == 0) goto L_0x0095
                java.lang.String r0 = r12.getName()
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0095
                android.widget.TextView r0 = r13.f19034c
                java.lang.String r2 = r12.getName()
                goto L_0x009f
            L_0x0095:
                android.widget.TextView r0 = r13.f19034c
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r2 = com.yeelight.yeelib.p194ui.activity.WifiLightAlarmActivity.this
                int r3 = com.yeelight.yeelib.R$string.common_text_alarm_name
                java.lang.CharSequence r2 = r2.getText(r3)
            L_0x009f:
                r0.setText(r2)
                boolean r0 = r12.isTimerStartEnabled()
                com.miot.common.timer.CrontabTime r2 = r12.mo29031e()
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
                com.miot.common.timer.CrontabTime r3 = r12.mo29031e()
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
                com.miot.common.timer.CrontabTime r7 = r12.mo29030d()
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
                com.miot.common.timer.CrontabTime r8 = r12.mo29030d()
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
                r4.toString()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r7 = "timer start time: "
                r4.append(r7)
                r4.append(r3)
                r4.toString()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r7 = "timer end enabled: "
                r4.append(r7)
                r4.append(r6)
                r4.toString()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r7 = "timer end time: "
                r4.append(r7)
                r4.append(r2)
                r4.toString()
                r4 = r0 & r6
                if (r4 == 0) goto L_0x01ba
                android.widget.TextView r4 = r13.f19033b
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r3)
                java.lang.String r3 = "~"
                r6.append(r3)
                r6.append(r2)
                java.lang.String r2 = r6.toString()
                r4.setText(r2)
                android.widget.TextView r2 = r13.f19035d
                r2.setText(r1)
                goto L_0x01dd
            L_0x01ba:
                if (r0 == 0) goto L_0x01cf
                android.widget.TextView r1 = r13.f19033b
                r1.setText(r3)
                android.widget.TextView r1 = r13.f19035d
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r2 = com.yeelight.yeelib.p194ui.activity.WifiLightAlarmActivity.this
                int r3 = com.yeelight.yeelib.R$string.wifi_alarm_start
            L_0x01c7:
                java.lang.String r2 = r2.getString(r3)
                r1.setText(r2)
                goto L_0x01dd
            L_0x01cf:
                if (r6 == 0) goto L_0x01dd
                android.widget.TextView r1 = r13.f19033b
                r1.setText(r2)
                android.widget.TextView r1 = r13.f19035d
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r2 = com.yeelight.yeelib.p194ui.activity.WifiLightAlarmActivity.this
                int r3 = com.yeelight.yeelib.R$string.wifi_alarm_end
                goto L_0x01c7
            L_0x01dd:
                r1 = 0
                if (r0 == 0) goto L_0x01fe
                java.lang.String r0 = r11.m24882b(r12)
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L_0x01fe
                android.widget.TextView r0 = r13.f19036e
                r0.setVisibility(r1)
                android.view.View r0 = r13.f19037f
                r0.setVisibility(r1)
                android.widget.TextView r0 = r13.f19036e
                java.lang.String r2 = r11.m24882b(r12)
                r0.setText(r2)
                goto L_0x020a
            L_0x01fe:
                android.widget.TextView r0 = r13.f19036e
                r2 = 8
                r0.setVisibility(r2)
                android.view.View r0 = r13.f19037f
                r0.setVisibility(r2)
            L_0x020a:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.miot.common.timer.CrontabTime r2 = r12.mo29031e()
                java.lang.String r3 = r2.getMonth()
                java.lang.String r4 = "*"
                boolean r3 = android.text.TextUtils.equals(r3, r4)
                if (r3 == 0) goto L_0x02cc
                java.lang.String r3 = r2.getDay()
                boolean r3 = android.text.TextUtils.equals(r3, r4)
                if (r3 == 0) goto L_0x02cc
                java.util.List r2 = r2.getDayOfWeeks()
                int r3 = r2.size()
                r4 = 7
                if (r3 != r4) goto L_0x023a
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r2 = com.yeelight.yeelib.p194ui.activity.WifiLightAlarmActivity.this
                int r3 = com.yeelight.yeelib.R$string.activity_wifi_alarm_repeat_all
                goto L_0x02d0
            L_0x023a:
                int r3 = r2.size()
                java.util.Iterator r2 = r2.iterator()
                r4 = 0
                r6 = 0
            L_0x0244:
                boolean r7 = r2.hasNext()
                if (r7 == 0) goto L_0x0292
                java.lang.Object r7 = r2.next()
                com.miot.common.timer.DayOfWeek r7 = (com.miot.common.timer.DayOfWeek) r7
                int r7 = r7.value()
                switch(r7) {
                    case 0: goto L_0x027f;
                    case 1: goto L_0x0271;
                    case 2: goto L_0x026c;
                    case 3: goto L_0x0267;
                    case 4: goto L_0x0262;
                    case 5: goto L_0x025d;
                    case 6: goto L_0x0258;
                    default: goto L_0x0257;
                }
            L_0x0257:
                goto L_0x028c
            L_0x0258:
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r7 = com.yeelight.yeelib.p194ui.activity.WifiLightAlarmActivity.this
                int r8 = com.yeelight.yeelib.R$string.common_text_repeat_6
                goto L_0x0283
            L_0x025d:
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r7 = com.yeelight.yeelib.p194ui.activity.WifiLightAlarmActivity.this
                int r8 = com.yeelight.yeelib.R$string.common_text_repeat_5
                goto L_0x0275
            L_0x0262:
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r7 = com.yeelight.yeelib.p194ui.activity.WifiLightAlarmActivity.this
                int r8 = com.yeelight.yeelib.R$string.common_text_repeat_4
                goto L_0x0275
            L_0x0267:
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r7 = com.yeelight.yeelib.p194ui.activity.WifiLightAlarmActivity.this
                int r8 = com.yeelight.yeelib.R$string.common_text_repeat_3
                goto L_0x0275
            L_0x026c:
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r7 = com.yeelight.yeelib.p194ui.activity.WifiLightAlarmActivity.this
                int r8 = com.yeelight.yeelib.R$string.common_text_repeat_2
                goto L_0x0275
            L_0x0271:
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r7 = com.yeelight.yeelib.p194ui.activity.WifiLightAlarmActivity.this
                int r8 = com.yeelight.yeelib.R$string.common_text_repeat_1
            L_0x0275:
                java.lang.String r7 = r7.getString(r8)
                r0.append(r7)
                int r6 = r6 + 1
                goto L_0x028c
            L_0x027f:
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r7 = com.yeelight.yeelib.p194ui.activity.WifiLightAlarmActivity.this
                int r8 = com.yeelight.yeelib.R$string.common_text_repeat_7
            L_0x0283:
                java.lang.String r7 = r7.getString(r8)
                r0.append(r7)
                int r4 = r4 + 1
            L_0x028c:
                java.lang.String r7 = " "
                r0.append(r7)
                goto L_0x0244
            L_0x0292:
                int r2 = r0.length()
                if (r2 == 0) goto L_0x02a4
                int r2 = r0.length()
                int r2 = r2 - r5
                int r7 = r0.length()
                r0.delete(r2, r7)
            L_0x02a4:
                r2 = 5
                if (r3 != r2) goto L_0x02bb
                if (r6 != r2) goto L_0x02bb
                int r2 = r0.length()
                r0.delete(r1, r2)
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r2 = com.yeelight.yeelib.p194ui.activity.WifiLightAlarmActivity.this
                int r6 = com.yeelight.yeelib.R$string.common_text_repeat_weekday
                java.lang.String r2 = r2.getString(r6)
                r0.append(r2)
            L_0x02bb:
                r2 = 2
                if (r3 != r2) goto L_0x02d7
                if (r4 != r2) goto L_0x02d7
                int r2 = r0.length()
                r0.delete(r1, r2)
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r2 = com.yeelight.yeelib.p194ui.activity.WifiLightAlarmActivity.this
                int r3 = com.yeelight.yeelib.R$string.common_text_repeat_weekend
                goto L_0x02d0
            L_0x02cc:
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r2 = com.yeelight.yeelib.p194ui.activity.WifiLightAlarmActivity.this
                int r3 = com.yeelight.yeelib.R$string.common_text_repeat_once
            L_0x02d0:
                java.lang.String r2 = r2.getString(r3)
                r0.append(r2)
            L_0x02d7:
                android.widget.TextView r2 = r13.f19038g
                java.lang.String r0 = r0.toString()
                r2.setText(r0)
                boolean r0 = r12.isTimerEnabled()
                if (r0 == 0) goto L_0x02f4
                com.yeelight.yeelib.ui.view.YeelightSwitchButton r0 = r13.f19039h
                r0.setChecked(r5)
                android.widget.RelativeLayout r0 = r13.f19032a
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r1 = com.yeelight.yeelib.p194ui.activity.WifiLightAlarmActivity.this
                int r2 = com.yeelight.yeelib.R$color.item_alarm_enable_color
                goto L_0x0301
            L_0x02f4:
                com.yeelight.yeelib.ui.view.YeelightSwitchButton r0 = r13.f19039h
                r0.setChecked(r1)
                android.widget.RelativeLayout r0 = r13.f19032a
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity r1 = com.yeelight.yeelib.p194ui.activity.WifiLightAlarmActivity.this
                int r2 = com.yeelight.yeelib.R$color.item_alarm_disable_color
            L_0x0301:
                int r1 = androidx.core.content.ContextCompat.getColor(r1, r2)
                r0.setBackgroundColor(r1)
                com.yeelight.yeelib.ui.view.YeelightSwitchButton r13 = r13.f19039h
                com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$g$a r0 = new com.yeelight.yeelib.ui.activity.WifiLightAlarmActivity$g$a
                r0.<init>(r12)
                r13.setOnPerformCheckedChangeListener(r0)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.activity.WifiLightAlarmActivity.C10265g.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m24880b0() {
        int i;
        LinearLayout linearLayout;
        if (this.f19017g.size() == 0) {
            linearLayout = this.f19015e;
            i = 0;
        } else {
            linearLayout = this.f19015e;
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        setContentView(R$layout.activity_light_alarm);
        C10547m.m25758h(true, this);
        this.f19012b = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f19013c = (ListView) findViewById(R$id.light_alarm_list);
        this.f19014d = (ImageView) findViewById(R$id.light_alarm_wifi_add);
        this.f19015e = (LinearLayout) findViewById(R$id.no_alarm_added_layout);
        this.f19012b.mo32825a(getString(R$string.feature_alarm), new C10257a(), (View.OnClickListener) null);
        this.f19012b.setTitleTextSize(16);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f19011i, "Activity has not device id", false);
            finish();
            return;
        }
        C4198d h0 = C4257w.m11945h0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f19016f = h0;
        if (h0 == null) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        if (!(h0 instanceof C6006h) && !(h0 instanceof C6050n)) {
            String str = f19011i;
            C4308b.m12139r(str, "Device wrong type: " + this.f19016f.mo23375I().mo29075a());
        }
        C10265g gVar = new C10265g(this, (C10257a) null);
        this.f19018h = gVar;
        this.f19013c.setAdapter(gVar);
        this.f19013c.setOnItemLongClickListener(new C10258b());
        this.f19013c.setOnItemClickListener(new C10261c());
        this.f19014d.setOnClickListener(new C10262d());
        this.f19012b.mo32825a(getString(R$string.feature_alarm), new C10263e(), (View.OnClickListener) null);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C4198d dVar = this.f19016f;
        if (dVar != null) {
            dVar.mo23400W0(this);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f19016f.mo23400W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f19015e.setVisibility(8);
        this.f19016f.mo23365B0(this);
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == -1) {
            this.f19016f.mo23353x(8, (Object) null);
        } else if (i == 4096) {
            runOnUiThread(new C10264f());
        }
    }
}

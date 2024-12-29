package com.yeelight.yeelib.p142ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.C6081a;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.status.TimerModel;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.Calendar;
import java.util.List;
import p051j4.C9186c;
import p051j4.C9193k;
import p237z3.C12143c;
import p237z3.C12145e;

/* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmActivity */
public class LightAlarmActivity extends BaseActivity implements C12145e, C12143c {

    /* renamed from: h */
    private static final String f14806h = "LightAlarmActivity";

    /* renamed from: a */
    CommonTitleBar f14807a;

    /* renamed from: b */
    ListView f14808b;

    /* renamed from: c */
    LinearLayout f14809c;

    /* renamed from: d */
    LinearLayout f14810d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C3012e f14811e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public List<TimerModel> f14812f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C8497c f14813g;

    /* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmActivity$a */
    class C8495a implements View.OnClickListener {
        C8495a() {
        }

        public void onClick(View view) {
            LightAlarmActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmActivity$b */
    class C8496b implements Runnable {
        C8496b() {
        }

        public void run() {
            LightAlarmActivity.this.f14813g.notifyDataSetChanged();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmActivity$c */
    private class C8497c extends BaseAdapter {

        /* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmActivity$c$a */
        class C8498a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ TimerModel f14817a;

            C8498a(TimerModel timerModel) {
                this.f14817a = timerModel;
            }

            public void onClick(View view) {
                if (this.f14817a.isSetUp()) {
                    LightAlarmActivity.this.m20176Z(this.f14817a);
                    return;
                }
                Intent intent = new Intent(LightAlarmActivity.this, LightAlarmDetailActivity.class);
                intent.putExtra("index", this.f14817a.getSyncId());
                intent.putExtra("com.yeelight.cherry.device_id", LightAlarmActivity.this.f14811e.mo23185G());
                LightAlarmActivity.this.startActivity(intent);
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmActivity$c$b */
        class C8499b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ TimerModel f14819a;

            C8499b(TimerModel timerModel) {
                this.f14819a = timerModel;
            }

            public void onClick(View view) {
                Intent intent = new Intent(LightAlarmActivity.this, LightAlarmDetailActivity.class);
                intent.putExtra("index", this.f14819a.getSyncId());
                if (this.f14819a.isSetUp()) {
                    intent.putExtra("type", this.f14819a.getMode());
                    intent.putExtra(TimerModel.HOUR, this.f14819a.getHour());
                    intent.putExtra(TimerModel.MINUTE, this.f14819a.getMinute());
                    intent.putExtra(TimerModel.REPEAT, this.f14819a.getRepeat());
                    intent.putExtra(TimerModel.GRADUAL, this.f14819a.getGradual());
                    intent.putExtra(TimerModel.ON_OFF, this.f14819a.getOn_off());
                }
                intent.putExtra("com.yeelight.cherry.device_id", LightAlarmActivity.this.f14811e.mo23185G());
                LightAlarmActivity.this.startActivity(intent);
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmActivity$c$c */
        private class C8500c {

            /* renamed from: a */
            public TextView f14821a;

            /* renamed from: b */
            public TextView f14822b;

            /* renamed from: c */
            public TextView f14823c;

            /* renamed from: d */
            public TextView f14824d;

            /* renamed from: e */
            public ImageView f14825e;

            /* renamed from: f */
            public LinearLayout f14826f;

            /* renamed from: g */
            public TextView f14827g;

            private C8500c(C8497c cVar) {
            }

            /* synthetic */ C8500c(C8497c cVar, C8495a aVar) {
                this(cVar);
            }
        }

        private C8497c() {
        }

        /* synthetic */ C8497c(LightAlarmActivity lightAlarmActivity, C8495a aVar) {
            this();
        }

        public int getCount() {
            if (LightAlarmActivity.this.f14812f == null) {
                return 0;
            }
            return LightAlarmActivity.this.f14812f.size();
        }

        public Object getItem(int i) {
            if (LightAlarmActivity.this.f14812f != null && i >= 0 && i < LightAlarmActivity.this.f14812f.size()) {
                return Integer.valueOf(LightAlarmActivity.this.f14812f.size());
            }
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C8500c cVar;
            int i2;
            ImageView imageView;
            int i3;
            LightAlarmActivity lightAlarmActivity;
            TextView textView;
            if (view == null) {
                cVar = new C8500c(this, (C8495a) null);
                view2 = LayoutInflater.from(LightAlarmActivity.this).inflate(R$layout.list_item_light_alarm, (ViewGroup) null);
                cVar.f14821a = (TextView) view2.findViewById(R$id.item_light_alarm_time);
                cVar.f14822b = (TextView) view2.findViewById(R$id.item_light_alarm_type);
                cVar.f14823c = (TextView) view2.findViewById(R$id.item_light_alarm_repeat);
                cVar.f14824d = (TextView) view2.findViewById(R$id.item_light_alarm_unused);
                cVar.f14825e = (ImageView) view2.findViewById(R$id.item_light_alram_switch);
                cVar.f14826f = (LinearLayout) view2.findViewById(R$id.item_light_alarm_content);
                cVar.f14827g = (TextView) view2.findViewById(R$id.item_light_alarm_divide_vertical);
                view2.setTag(cVar);
            } else {
                view2 = view;
                cVar = (C8500c) view.getTag();
            }
            TimerModel timerModel = (TimerModel) LightAlarmActivity.this.f14812f.get(i);
            if (timerModel.isSetUp()) {
                cVar.f14826f.setVisibility(0);
                cVar.f14827g.setVisibility(0);
                cVar.f14825e.setVisibility(0);
                cVar.f14821a.setText(timerModel.getName());
                if (timerModel.isEnable()) {
                    cVar.f14822b.setVisibility(0);
                    cVar.f14823c.setVisibility(0);
                    cVar.f14824d.setVisibility(8);
                    if (timerModel.getOn_off() == 1 || timerModel.getOn_off() == 3) {
                        textView = cVar.f14822b;
                        lightAlarmActivity = LightAlarmActivity.this;
                        i3 = R$string.alarm_action_turn_on;
                    } else {
                        textView = cVar.f14822b;
                        lightAlarmActivity = LightAlarmActivity.this;
                        i3 = R$string.alarm_action_turn_off;
                    }
                    textView.setText(lightAlarmActivity.getText(i3));
                    cVar.f14823c.setText(timerModel.getRepeatStr(LightAlarmActivity.this));
                    imageView = cVar.f14825e;
                    i2 = R$drawable.setting_switch_on;
                } else {
                    cVar.f14822b.setVisibility(8);
                    cVar.f14823c.setVisibility(8);
                    cVar.f14824d.setVisibility(0);
                    cVar.f14824d.setText(LightAlarmActivity.this.getText(R$string.alarm_disable));
                    imageView = cVar.f14825e;
                    i2 = R$drawable.setting_switch_off;
                }
                imageView.setImageResource(i2);
            } else {
                cVar.f14826f.setVisibility(8);
                cVar.f14827g.setVisibility(8);
                cVar.f14825e.setImageResource(R$drawable.setting_switch_off);
                cVar.f14821a.setText(LightAlarmActivity.this.getText(R$string.alarm_disable));
            }
            cVar.f14825e.setOnClickListener(new C8498a(timerModel));
            view2.setOnClickListener(new C8499b(timerModel));
            return view2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m20176Z(TimerModel timerModel) {
        String[] strArr;
        String[] strArr2;
        String repeat = timerModel.getRepeat();
        char[] charArray = repeat.toCharArray();
        int mode = timerModel.getMode();
        if (mode == 1) {
            int i = Calendar.getInstance().get(5);
            if (timerModel.isEnable()) {
                strArr2 = new String[]{String.format("%02d", new Object[]{Integer.valueOf(i)})};
            } else {
                Calendar instance = Calendar.getInstance();
                instance.set(11, timerModel.getHour());
                instance.set(12, timerModel.getMinute());
                instance.set(13, timerModel.getSecond());
                int i2 = (instance.getTimeInMillis() > System.currentTimeMillis() ? 1 : (instance.getTimeInMillis() == System.currentTimeMillis() ? 0 : -1));
                strArr2 = new String[1];
                Object[] objArr = new Object[1];
                if (i2 < 0) {
                    objArr[0] = Integer.valueOf(i + 1);
                    strArr2[0] = String.format("%02d", objArr);
                } else {
                    objArr[0] = Integer.valueOf(i);
                    strArr2[0] = String.format("%02d", objArr);
                }
            }
        } else if (mode == 2) {
            strArr2 = new String[]{String.format("%02d", new Object[]{0})};
        } else {
            String[] strArr3 = new String[repeat.length()];
            for (int i3 = 0; i3 < charArray.length; i3++) {
                strArr3[i3] = charArray[i3] == '1' ? TimerCodec.ENABLE : TimerCodec.DISENABLE;
            }
            strArr = strArr3;
            this.f14811e.mo23166x(9, C9186c.m22117n(timerModel.getSyncId(), timerModel.getHour(), timerModel.getMinute(), timerModel.getSecond(), timerModel.getMode(), strArr, timerModel.getGradual(), timerModel.getOn_off(), false, !timerModel.isEnable()));
            this.f14811e.mo23166x(8, (Object) null);
        }
        strArr = strArr2;
        this.f14811e.mo23166x(9, C9186c.m22117n(timerModel.getSyncId(), timerModel.getHour(), timerModel.getMinute(), timerModel.getSecond(), timerModel.getMode(), strArr, timerModel.getGradual(), timerModel.getOn_off(), false, !timerModel.isEnable()));
        this.f14811e.mo23166x(8, (Object) null);
    }

    public void onConnectionStateChanged(int i, int i2) {
        if (i2 == 0) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_light_alarm);
        this.f14807a = (CommonTitleBar) findViewById(R$id.title_bar);
        int i = R$id.light_alarm_list;
        this.f14808b = (ListView) findViewById(i);
        this.f14809c = (LinearLayout) findViewById(R$id.no_alarm_added_layout);
        this.f14810d = (LinearLayout) findViewById(R$id.alarm_wifi_add_layout);
        this.f14807a.mo36195a(getString(R$string.feature_alarm), new C8495a(), (View.OnClickListener) null);
        this.f14807a.setTitleTextSize(16);
        this.f14808b = (ListView) findViewById(i);
        this.f14809c.setVisibility(8);
        this.f14810d.setVisibility(8);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f14806h, "Activity has not device id", false);
            finish();
            return;
        }
        C3012e r0 = YeelightDeviceManager.m7804r0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f14811e = r0;
        if (r0 == null || !r0.mo23145k0()) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        if (!(this.f14811e instanceof C6081a)) {
            String str = f14806h;
            AppUtils.m8300u(str, "Device wrong type: " + this.f14811e.mo23188I().mo31880a());
        }
        C8497c cVar = new C8497c(this, (C8495a) null);
        this.f14813g = cVar;
        this.f14808b.setAdapter(cVar);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C3012e eVar = this.f14811e;
        if (eVar != null) {
            eVar.mo23213W0(this);
        }
        super.onDestroy();
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f14811e.mo23213W0(this);
        this.f14811e.mo23133V0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f14811e.mo23178B0(this);
        this.f14811e.mo23171z0(this);
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == -1) {
            this.f14811e.mo23166x(8, (Object) null);
        } else if (i != 4096) {
            return;
        }
        List<TimerModel> list = (List) this.f14811e.mo23221d0().mo31611r(1);
        this.f14812f = list;
        if (list != null) {
            runOnUiThread(new C8496b());
        }
    }
}

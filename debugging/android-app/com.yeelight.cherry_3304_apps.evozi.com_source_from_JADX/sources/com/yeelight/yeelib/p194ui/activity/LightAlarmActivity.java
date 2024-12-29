package com.yeelight.yeelib.p194ui.activity;

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
import com.yeelight.yeelib.p150c.C5972a;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p184n.C7561k;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10540e;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.Calendar;
import java.util.List;

/* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmActivity */
public class LightAlarmActivity extends BaseActivity implements C9770e, C9768c {

    /* renamed from: i */
    private static final String f18498i = LightAlarmActivity.class.getSimpleName();

    /* renamed from: b */
    CommonTitleBar f18499b;

    /* renamed from: c */
    ListView f18500c;

    /* renamed from: d */
    LinearLayout f18501d;

    /* renamed from: e */
    LinearLayout f18502e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C4200i f18503f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public List<C7561k> f18504g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C10079c f18505h;

    /* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmActivity$a */
    class C10077a implements View.OnClickListener {
        C10077a() {
        }

        public void onClick(View view) {
            LightAlarmActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmActivity$b */
    class C10078b implements Runnable {
        C10078b() {
        }

        public void run() {
            LightAlarmActivity.this.f18505h.notifyDataSetChanged();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmActivity$c */
    private class C10079c extends BaseAdapter {

        /* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmActivity$c$a */
        class C10080a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C7561k f18509a;

            C10080a(C7561k kVar) {
                this.f18509a = kVar;
            }

            public void onClick(View view) {
                if (this.f18509a.mo28956q()) {
                    LightAlarmActivity.this.m24576Z(this.f18509a);
                    return;
                }
                Intent intent = new Intent(LightAlarmActivity.this, LightAlarmDetailActivity.class);
                intent.putExtra("index", this.f18509a.mo28954o());
                intent.putExtra("com.yeelight.cherry.device_id", LightAlarmActivity.this.f18503f.mo23372G());
                LightAlarmActivity.this.startActivity(intent);
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmActivity$c$b */
        class C10081b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C7561k f18511a;

            C10081b(C7561k kVar) {
                this.f18511a = kVar;
            }

            public void onClick(View view) {
                Intent intent = new Intent(LightAlarmActivity.this, LightAlarmDetailActivity.class);
                intent.putExtra("index", this.f18511a.mo28954o());
                if (this.f18511a.mo28956q()) {
                    intent.putExtra("type", this.f18511a.mo28945f());
                    intent.putExtra("hour", this.f18511a.mo28942d());
                    intent.putExtra("minute", this.f18511a.mo28943e());
                    intent.putExtra("repeat", this.f18511a.mo28950k());
                    intent.putExtra("gradual", this.f18511a.mo28941c());
                    intent.putExtra("on_off", this.f18511a.mo28949j());
                }
                intent.putExtra("com.yeelight.cherry.device_id", LightAlarmActivity.this.f18503f.mo23372G());
                LightAlarmActivity.this.startActivity(intent);
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmActivity$c$c */
        private class C10082c {

            /* renamed from: a */
            public TextView f18513a;

            /* renamed from: b */
            public TextView f18514b;

            /* renamed from: c */
            public TextView f18515c;

            /* renamed from: d */
            public TextView f18516d;

            /* renamed from: e */
            public ImageView f18517e;

            /* renamed from: f */
            public LinearLayout f18518f;

            /* renamed from: g */
            public TextView f18519g;

            private C10082c(C10079c cVar) {
            }

            /* synthetic */ C10082c(C10079c cVar, C10077a aVar) {
                this(cVar);
            }
        }

        private C10079c() {
        }

        /* synthetic */ C10079c(LightAlarmActivity lightAlarmActivity, C10077a aVar) {
            this();
        }

        public int getCount() {
            if (LightAlarmActivity.this.f18504g == null) {
                return 0;
            }
            return LightAlarmActivity.this.f18504g.size();
        }

        public Object getItem(int i) {
            if (LightAlarmActivity.this.f18504g != null && i >= 0 && i < LightAlarmActivity.this.f18504g.size()) {
                return Integer.valueOf(LightAlarmActivity.this.f18504g.size());
            }
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C10082c cVar;
            int i2;
            ImageView imageView;
            int i3;
            LightAlarmActivity lightAlarmActivity;
            TextView textView;
            if (view == null) {
                cVar = new C10082c(this, (C10077a) null);
                view2 = LayoutInflater.from(LightAlarmActivity.this).inflate(R$layout.list_item_light_alarm, (ViewGroup) null);
                cVar.f18513a = (TextView) view2.findViewById(R$id.item_light_alarm_time);
                cVar.f18514b = (TextView) view2.findViewById(R$id.item_light_alarm_type);
                cVar.f18515c = (TextView) view2.findViewById(R$id.item_light_alarm_repeat);
                cVar.f18516d = (TextView) view2.findViewById(R$id.item_light_alarm_unused);
                cVar.f18517e = (ImageView) view2.findViewById(R$id.item_light_alram_switch);
                cVar.f18518f = (LinearLayout) view2.findViewById(R$id.item_light_alarm_content);
                cVar.f18519g = (TextView) view2.findViewById(R$id.item_light_alarm_divide_vertical);
                view2.setTag(cVar);
            } else {
                view2 = view;
                cVar = (C10082c) view.getTag();
            }
            C7561k kVar = (C7561k) LightAlarmActivity.this.f18504g.get(i);
            if (kVar.mo28956q()) {
                cVar.f18518f.setVisibility(0);
                cVar.f18519g.setVisibility(0);
                cVar.f18517e.setVisibility(0);
                cVar.f18513a.setText(kVar.mo28946g());
                if (kVar.mo28955p()) {
                    cVar.f18514b.setVisibility(0);
                    cVar.f18515c.setVisibility(0);
                    cVar.f18516d.setVisibility(8);
                    if (kVar.mo28949j() == 1 || kVar.mo28949j() == 3) {
                        textView = cVar.f18514b;
                        lightAlarmActivity = LightAlarmActivity.this;
                        i3 = R$string.alarm_action_turn_on;
                    } else {
                        textView = cVar.f18514b;
                        lightAlarmActivity = LightAlarmActivity.this;
                        i3 = R$string.alarm_action_turn_off;
                    }
                    textView.setText(lightAlarmActivity.getText(i3));
                    cVar.f18515c.setText(kVar.mo28952m(LightAlarmActivity.this));
                    imageView = cVar.f18517e;
                    i2 = R$drawable.setting_switch_on;
                } else {
                    cVar.f18514b.setVisibility(8);
                    cVar.f18515c.setVisibility(8);
                    cVar.f18516d.setVisibility(0);
                    cVar.f18516d.setText(LightAlarmActivity.this.getText(R$string.alarm_disable));
                    imageView = cVar.f18517e;
                    i2 = R$drawable.setting_switch_off;
                }
                imageView.setImageResource(i2);
            } else {
                cVar.f18518f.setVisibility(8);
                cVar.f18519g.setVisibility(8);
                cVar.f18517e.setImageResource(R$drawable.setting_switch_off);
                cVar.f18513a.setText(LightAlarmActivity.this.getText(R$string.alarm_disable));
            }
            cVar.f18517e.setOnClickListener(new C10080a(kVar));
            view2.setOnClickListener(new C10081b(kVar));
            return view2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m24576Z(C7561k kVar) {
        String[] strArr;
        String[] strArr2;
        String k = kVar.mo28950k();
        char[] charArray = k.toCharArray();
        int f = kVar.mo28945f();
        if (f == 1) {
            int i = Calendar.getInstance().get(5);
            if (kVar.mo28955p()) {
                strArr2 = new String[]{String.format("%02d", new Object[]{Integer.valueOf(i)})};
            } else {
                Calendar instance = Calendar.getInstance();
                instance.set(11, kVar.mo28942d());
                instance.set(12, kVar.mo28943e());
                instance.set(13, kVar.mo28953n());
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
        } else if (f == 2) {
            strArr2 = new String[]{String.format("%02d", new Object[]{0})};
        } else {
            String[] strArr3 = new String[k.length()];
            for (int i3 = 0; i3 < charArray.length; i3++) {
                strArr3[i3] = charArray[i3] == '1' ? TimerCodec.ENABLE : TimerCodec.DISENABLE;
            }
            strArr = strArr3;
            this.f18503f.mo23353x(9, C10540e.m25719n(kVar.mo28954o(), kVar.mo28942d(), kVar.mo28943e(), kVar.mo28953n(), kVar.mo28945f(), strArr, kVar.mo28941c(), kVar.mo28949j(), false, !kVar.mo28955p()));
            this.f18503f.mo23353x(8, (Object) null);
        }
        strArr = strArr2;
        this.f18503f.mo23353x(9, C10540e.m25719n(kVar.mo28954o(), kVar.mo28942d(), kVar.mo28943e(), kVar.mo28953n(), kVar.mo28945f(), strArr, kVar.mo28941c(), kVar.mo28949j(), false, !kVar.mo28955p()));
        this.f18503f.mo23353x(8, (Object) null);
    }

    public void onConnectionStateChanged(int i, int i2) {
        if (i2 == 0) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_light_alarm);
        this.f18499b = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f18500c = (ListView) findViewById(R$id.light_alarm_list);
        this.f18501d = (LinearLayout) findViewById(R$id.no_alarm_added_layout);
        this.f18502e = (LinearLayout) findViewById(R$id.alarm_wifi_add_layout);
        this.f18499b.mo32825a(getString(R$string.feature_alarm), new C10077a(), (View.OnClickListener) null);
        this.f18499b.setTitleTextSize(16);
        this.f18500c = (ListView) findViewById(R$id.light_alarm_list);
        this.f18501d.setVisibility(8);
        this.f18502e.setVisibility(8);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18498i, "Activity has not device id", false);
            finish();
            return;
        }
        C4200i o0 = C4257w.m11953o0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f18503f = o0;
        if (o0 == null || !o0.mo23331k0()) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        if (!(this.f18503f instanceof C5972a)) {
            String str = f18498i;
            C4308b.m12139r(str, "Device wrong type: " + this.f18503f.mo23375I().mo29075a());
        }
        C10079c cVar = new C10079c(this, (C10077a) null);
        this.f18505h = cVar;
        this.f18500c.setAdapter(cVar);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C4200i iVar = this.f18503f;
        if (iVar != null) {
            iVar.mo23400W0(this);
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
        this.f18503f.mo23400W0(this);
        this.f18503f.mo23319V0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f18503f.mo23365B0(this);
        this.f18503f.mo23358z0(this);
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == -1) {
            this.f18503f.mo23353x(8, (Object) null);
        } else if (i != 4096) {
            return;
        }
        List<C7561k> list = (List) this.f18503f.mo23408d0().mo27710r(1);
        this.f18504g = list;
        if (list != null) {
            runOnUiThread(new C10078b());
        }
    }
}

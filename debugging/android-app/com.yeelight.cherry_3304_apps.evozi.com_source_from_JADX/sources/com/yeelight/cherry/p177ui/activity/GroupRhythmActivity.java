package com.yeelight.cherry.p177ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p150c.C5980c;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p153g.C9835f;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.widget.WheelPicker;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.cherry.ui.activity.GroupRhythmActivity */
public class GroupRhythmActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String f10980f = GroupRhythmActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static boolean f10981g = true;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C5980c f10982b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int[] f10983c = {SupportMenu.CATEGORY_MASK, InputDeviceCompat.SOURCE_ANY, -16711681, -16776961, -65281};
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Handler f10984d = new C5283a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public View.OnClickListener f10985e = new C5285c();
    @BindView(2131296406)
    TextView mBtnControl;
    @BindView(2131297296)
    WheelPicker mPickerView;
    @BindView(2131296416)
    RadioGroup mRadioGroup;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.GroupRhythmActivity$a */
    class C5283a extends Handler {
        C5283a() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                String unused = GroupRhythmActivity.f10980f;
                Bundle data = message.getData();
                String string = data.getString("device_id");
                if (data.containsKey("device_action")) {
                    String string2 = data.getString("device_action");
                    C4200i J1 = GroupRhythmActivity.this.f10982b.mo27497J1(string);
                    char c = 65535;
                    int hashCode = string2.hashCode();
                    if (hashCode != -2063051409) {
                        if (hashCode != -343644705) {
                            if (hashCode == 469653806 && string2.equals("device_action_flow")) {
                                c = 2;
                            }
                        } else if (string2.equals("device_action_on")) {
                            c = 0;
                        }
                    } else if (string2.equals("device_action_off")) {
                        c = 1;
                    }
                    if (c == 0) {
                        J1.mo23334l1();
                    } else if (c == 1) {
                        J1.mo23326b1();
                    } else if (c == 2) {
                        J1.mo23355x1(new C9835f("", -1, 2, 100, data.getInt("device_param")));
                    }
                }
            } else if (i == 2) {
                String unused2 = GroupRhythmActivity.f10980f;
                GroupRhythmActivity groupRhythmActivity = GroupRhythmActivity.this;
                groupRhythmActivity.mBtnControl.setText(groupRhythmActivity.getText(2131755314));
                GroupRhythmActivity groupRhythmActivity2 = GroupRhythmActivity.this;
                groupRhythmActivity2.mBtnControl.setOnClickListener(groupRhythmActivity2.f10985e);
                GroupRhythmActivity.this.mBtnControl.setEnabled(true);
                GroupRhythmActivity.this.mPickerView.setEnabled(true);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GroupRhythmActivity$b */
    class C5284b implements View.OnClickListener {
        C5284b() {
        }

        public void onClick(View view) {
            GroupRhythmActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GroupRhythmActivity$c */
    class C5285c implements View.OnClickListener {
        C5285c() {
        }

        public void onClick(View view) {
            GroupRhythmActivity groupRhythmActivity;
            String str;
            switch (GroupRhythmActivity.this.mRadioGroup.getCheckedRadioButtonId()) {
                case C11745R$id.btn_flow:
                    GroupRhythmActivity.this.m16423e0();
                    return;
                case C11745R$id.btn_turn_off:
                    groupRhythmActivity = GroupRhythmActivity.this;
                    str = "device_action_off";
                    break;
                case C11745R$id.btn_turn_on:
                    groupRhythmActivity = GroupRhythmActivity.this;
                    str = "device_action_on";
                    break;
                default:
                    return;
            }
            groupRhythmActivity.m16424f0(str);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GroupRhythmActivity$d */
    class C5286d extends Thread {

        /* renamed from: a */
        final /* synthetic */ int f10989a;

        C5286d(int i) {
            this.f10989a = i;
        }

        public void run() {
            int i = 0;
            while (GroupRhythmActivity.f10981g) {
                Message message = new Message();
                message.what = 1;
                Bundle bundle = new Bundle();
                bundle.putString("device_id", GroupRhythmActivity.this.f10982b.mo27498K1().get(i % 2).mo23372G());
                bundle.putString("device_action", "device_action_flow");
                bundle.putInt("device_param", GroupRhythmActivity.this.f10983c[i % 5]);
                message.setData(bundle);
                GroupRhythmActivity.this.f10984d.sendMessage(message);
                i++;
                try {
                    Thread.sleep((long) (this.f10989a * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            boolean unused = GroupRhythmActivity.f10981g = true;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GroupRhythmActivity$e */
    class C5287e implements View.OnClickListener {
        C5287e() {
        }

        public void onClick(View view) {
            boolean unused = GroupRhythmActivity.f10981g = false;
            GroupRhythmActivity groupRhythmActivity = GroupRhythmActivity.this;
            groupRhythmActivity.mBtnControl.setText(groupRhythmActivity.getString(2131755314));
            GroupRhythmActivity groupRhythmActivity2 = GroupRhythmActivity.this;
            groupRhythmActivity2.mBtnControl.setOnClickListener(groupRhythmActivity2.f10985e);
            GroupRhythmActivity.this.mPickerView.setEnabled(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public void m16423e0() {
        new C5286d(this.mPickerView.getCurrentItemPosition() + 1).start();
        this.mBtnControl.setText(getString(2131755348));
        this.mBtnControl.setOnClickListener(new C5287e());
        this.mPickerView.setEnabled(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public void m16424f0(String str) {
        int currentItemPosition = this.mPickerView.getCurrentItemPosition() + 1;
        int i = 1;
        for (C4200i G : this.f10982b.mo27498K1()) {
            Message message = new Message();
            message.what = 1;
            Bundle bundle = new Bundle();
            bundle.putString("device_id", G.mo23372G());
            bundle.putString("device_action", str);
            message.setData(bundle);
            this.f10984d.sendMessageDelayed(message, (long) (currentItemPosition * 1000 * i));
            i++;
        }
        this.mBtnControl.setText("...");
        this.mBtnControl.setEnabled(false);
        this.mPickerView.setEnabled(false);
        this.f10984d.sendEmptyMessageDelayed(2, (long) (((currentItemPosition * i) + 2) * 1000));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        setContentView(C11748R$layout.activity_group_rhythm);
        ButterKnife.bind((Activity) this);
        C10547m.m25758h(true, this);
        this.mTitleBar.mo32825a("灯组特效", new C5284b(), (View.OnClickListener) null);
        this.mTitleBar.setTitleTextSize(16);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f10980f, "Activity has not device id", false);
            finish();
            return;
        }
        C4198d h0 = C4257w.m11945h0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        if (!(h0 instanceof C5980c)) {
            C4308b.m12141t(f10980f, "Not Group id", false);
            finish();
            return;
        }
        this.f10982b = (C5980c) h0;
        this.mRadioGroup.check(C11745R$id.btn_turn_on);
        this.mBtnControl.setOnClickListener(this.f10985e);
    }
}

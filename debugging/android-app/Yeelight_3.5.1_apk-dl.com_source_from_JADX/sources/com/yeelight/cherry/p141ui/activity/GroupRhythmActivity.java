package com.yeelight.cherry.p141ui.activity;

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
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.C6119c;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.p142ui.widget.WheelPicker;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9193k;

/* renamed from: com.yeelight.cherry.ui.activity.GroupRhythmActivity */
public class GroupRhythmActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final String f10546e = "GroupRhythmActivity";
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static boolean f10547f = true;

    /* renamed from: g */
    public static final /* synthetic */ int f10548g = 0;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C6119c f10549a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int[] f10550b = {SupportMenu.CATEGORY_MASK, InputDeviceCompat.SOURCE_ANY, -16711681, -16776961, -65281};
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Handler f10551c = new C5331a();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public View.OnClickListener f10552d = new C5333c();
    @BindView(2131296464)
    TextView mBtnControl;
    @BindView(2131297439)
    WheelPicker mPickerView;
    @BindView(2131296474)
    RadioGroup mRadioGroup;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.GroupRhythmActivity$a */
    class C5331a extends Handler {
        C5331a() {
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x006d, code lost:
            if (r3.equals("device_action_flow") == false) goto L_0x0065;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r9) {
            /*
                r8 = this;
                int r0 = r9.what
                r1 = 2
                r2 = 1
                if (r0 == r2) goto L_0x0036
                if (r0 == r1) goto L_0x000a
                goto L_0x00a6
            L_0x000a:
                java.lang.String unused = com.yeelight.cherry.p141ui.activity.GroupRhythmActivity.f10546e
                com.yeelight.cherry.ui.activity.GroupRhythmActivity r9 = com.yeelight.cherry.p141ui.activity.GroupRhythmActivity.this
                android.widget.TextView r0 = r9.mBtnControl
                r1 = 2131755318(0x7f100136, float:1.9141512E38)
                java.lang.CharSequence r9 = r9.getText(r1)
                r0.setText(r9)
                com.yeelight.cherry.ui.activity.GroupRhythmActivity r9 = com.yeelight.cherry.p141ui.activity.GroupRhythmActivity.this
                android.widget.TextView r0 = r9.mBtnControl
                android.view.View$OnClickListener r9 = r9.f10552d
                r0.setOnClickListener(r9)
                com.yeelight.cherry.ui.activity.GroupRhythmActivity r9 = com.yeelight.cherry.p141ui.activity.GroupRhythmActivity.this
                android.widget.TextView r9 = r9.mBtnControl
                r9.setEnabled(r2)
                com.yeelight.cherry.ui.activity.GroupRhythmActivity r9 = com.yeelight.cherry.p141ui.activity.GroupRhythmActivity.this
                com.yeelight.yeelib.ui.widget.WheelPicker r9 = r9.mPickerView
                r9.setEnabled(r2)
                goto L_0x00a6
            L_0x0036:
                java.lang.String unused = com.yeelight.cherry.p141ui.activity.GroupRhythmActivity.f10546e
                android.os.Bundle r9 = r9.getData()
                java.lang.String r0 = "device_id"
                java.lang.String r0 = r9.getString(r0)
                java.lang.String r3 = "device_action"
                boolean r4 = r9.containsKey(r3)
                if (r4 != 0) goto L_0x004c
                return
            L_0x004c:
                java.lang.String r3 = r9.getString(r3)
                com.yeelight.cherry.ui.activity.GroupRhythmActivity r4 = com.yeelight.cherry.p141ui.activity.GroupRhythmActivity.this
                com.yeelight.yeelib.device.c r4 = r4.f10549a
                com.yeelight.yeelib.device.base.e r0 = r4.mo31752J1(r0)
                r3.hashCode()
                r4 = -1
                int r5 = r3.hashCode()
                switch(r5) {
                    case -2063051409: goto L_0x007b;
                    case -343644705: goto L_0x0070;
                    case 469653806: goto L_0x0067;
                    default: goto L_0x0065;
                }
            L_0x0065:
                r1 = -1
                goto L_0x0085
            L_0x0067:
                java.lang.String r2 = "device_action_flow"
                boolean r2 = r3.equals(r2)
                if (r2 != 0) goto L_0x0085
                goto L_0x0065
            L_0x0070:
                java.lang.String r1 = "device_action_on"
                boolean r1 = r3.equals(r1)
                if (r1 != 0) goto L_0x0079
                goto L_0x0065
            L_0x0079:
                r1 = 1
                goto L_0x0085
            L_0x007b:
                java.lang.String r1 = "device_action_off"
                boolean r1 = r3.equals(r1)
                if (r1 != 0) goto L_0x0084
                goto L_0x0065
            L_0x0084:
                r1 = 0
            L_0x0085:
                switch(r1) {
                    case 0: goto L_0x00a3;
                    case 1: goto L_0x009f;
                    case 2: goto L_0x0089;
                    default: goto L_0x0088;
                }
            L_0x0088:
                goto L_0x00a6
            L_0x0089:
                java.lang.String r1 = "device_param"
                int r7 = r9.getInt(r1)
                com.yeelight.yeelib.models.f r9 = new com.yeelight.yeelib.models.f
                r4 = -1
                r5 = 2
                r6 = 100
                java.lang.String r3 = ""
                r2 = r9
                r2.<init>(r3, r4, r5, r6, r7)
                r0.mo23168x1(r9)
                goto L_0x00a6
            L_0x009f:
                r0.mo23148l1()
                goto L_0x00a6
            L_0x00a3:
                r0.mo23140b1()
            L_0x00a6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.GroupRhythmActivity.C5331a.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GroupRhythmActivity$b */
    class C5332b implements View.OnClickListener {
        C5332b() {
        }

        public void onClick(View view) {
            GroupRhythmActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GroupRhythmActivity$c */
    class C5333c implements View.OnClickListener {
        C5333c() {
        }

        public void onClick(View view) {
            GroupRhythmActivity groupRhythmActivity;
            String str;
            switch (GroupRhythmActivity.this.mRadioGroup.getCheckedRadioButtonId()) {
                case C12225R$id.btn_flow:
                    GroupRhythmActivity.this.m16361e0();
                    return;
                case C12225R$id.btn_turn_off:
                    groupRhythmActivity = GroupRhythmActivity.this;
                    str = "device_action_off";
                    break;
                case C12225R$id.btn_turn_on:
                    groupRhythmActivity = GroupRhythmActivity.this;
                    str = "device_action_on";
                    break;
                default:
                    return;
            }
            groupRhythmActivity.m16362f0(str);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GroupRhythmActivity$d */
    class C5334d extends Thread {

        /* renamed from: a */
        final /* synthetic */ int f10556a;

        C5334d(int i) {
            this.f10556a = i;
        }

        public void run() {
            int i = 0;
            while (GroupRhythmActivity.f10547f) {
                Message message = new Message();
                message.what = 1;
                Bundle bundle = new Bundle();
                bundle.putString("device_id", GroupRhythmActivity.this.f10549a.mo31753K1().get(i % 2).mo23185G());
                bundle.putString("device_action", "device_action_flow");
                bundle.putInt("device_param", GroupRhythmActivity.this.f10550b[i % 5]);
                message.setData(bundle);
                GroupRhythmActivity.this.f10551c.sendMessage(message);
                i++;
                try {
                    Thread.sleep((long) (this.f10556a * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            boolean unused = GroupRhythmActivity.f10547f = true;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GroupRhythmActivity$e */
    class C5335e implements View.OnClickListener {
        C5335e() {
        }

        public void onClick(View view) {
            boolean unused = GroupRhythmActivity.f10547f = false;
            GroupRhythmActivity groupRhythmActivity = GroupRhythmActivity.this;
            groupRhythmActivity.mBtnControl.setText(groupRhythmActivity.getString(2131755318));
            GroupRhythmActivity groupRhythmActivity2 = GroupRhythmActivity.this;
            groupRhythmActivity2.mBtnControl.setOnClickListener(groupRhythmActivity2.f10552d);
            GroupRhythmActivity.this.mPickerView.setEnabled(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public void m16361e0() {
        new C5334d(this.mPickerView.getCurrentItemPosition() + 1).start();
        this.mBtnControl.setText(getString(2131755352));
        this.mBtnControl.setOnClickListener(new C5335e());
        this.mPickerView.setEnabled(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public void m16362f0(String str) {
        int currentItemPosition = this.mPickerView.getCurrentItemPosition() + 1;
        int i = 1;
        for (C3012e G : this.f10549a.mo31753K1()) {
            Message message = new Message();
            message.what = 1;
            Bundle bundle = new Bundle();
            bundle.putString("device_id", G.mo23185G());
            bundle.putString("device_action", str);
            message.setData(bundle);
            this.f10551c.sendMessageDelayed(message, (long) (currentItemPosition * 1000 * i));
            i++;
        }
        this.mBtnControl.setText("...");
        this.mBtnControl.setEnabled(false);
        this.mPickerView.setEnabled(false);
        this.f10551c.sendEmptyMessageDelayed(2, (long) (((currentItemPosition * i) + 2) * 1000));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        setContentView(C12228R$layout.activity_group_rhythm);
        ButterKnife.bind((Activity) this);
        C9193k.m22157h(true, this);
        this.mTitleBar.mo36195a("灯组特效", new C5332b(), (View.OnClickListener) null);
        this.mTitleBar.setTitleTextSize(16);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f10546e, "Activity has not device id", false);
            finish();
            return;
        }
        C3010c j0 = YeelightDeviceManager.m7794j0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        if (!(j0 instanceof C6119c)) {
            AppUtils.m8302w(f10546e, "Not Group id", false);
            finish();
            return;
        }
        this.f10549a = (C6119c) j0;
        this.mRadioGroup.check(C12225R$id.btn_turn_on);
        this.mBtnControl.setOnClickListener(this.f10552d);
    }
}

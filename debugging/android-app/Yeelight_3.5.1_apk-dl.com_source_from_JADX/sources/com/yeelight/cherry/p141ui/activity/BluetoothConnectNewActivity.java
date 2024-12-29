package com.yeelight.cherry.p141ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.C6081a;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.p142ui.view.ConnectCircleView;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9193k;
import p170i4.C9106a;
import p237z3.C12143c;

/* renamed from: com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity */
public class BluetoothConnectNewActivity extends BaseActivity implements C12143c {

    /* renamed from: d */
    private static final String f9950d = "BluetoothConnectNewActivity";

    /* renamed from: e */
    public static final /* synthetic */ int f9951e = 0;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C3010c f9952a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C9106a f9953b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Handler f9954c = new Handler(new C5070a());
    @BindView(2131296490)
    Button mBtnRetry;
    @BindView(2131297245)
    ConnectCircleView mCircleView;
    @BindView(2131296759)
    ImageView mFailedLayout;
    @BindView(2131297251)
    RelativeLayout mProgressLayout;
    @BindView(2131297253)
    TextView mProgressView;
    @BindView(2131297516)
    TextView mSubView;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;
    @BindView(2131297589)
    TextView mTitleView;

    /* renamed from: com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity$a */
    class C5070a implements Handler.Callback {
        C5070a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                TextView textView = BluetoothConnectNewActivity.this.mProgressView;
                textView.setText(String.valueOf(BluetoothConnectNewActivity.this.f9952a.mo23143g0()) + "%");
                BluetoothConnectNewActivity.this.f9954c.sendEmptyMessageDelayed(1, 1000);
                return false;
            } else if (i != 2) {
                return false;
            } else {
                BluetoothConnectNewActivity.this.finish();
                return false;
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity$b */
    class C5071b implements View.OnClickListener {
        C5071b() {
        }

        public void onClick(View view) {
            BluetoothConnectNewActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity$c */
    class C5072c implements View.OnClickListener {
        C5072c() {
        }

        public void onClick(View view) {
            BluetoothConnectNewActivity.this.mBtnRetry.setVisibility(8);
            BluetoothConnectNewActivity.this.mTitleView.setText(2131755080);
            BluetoothConnectNewActivity.this.mSubView.setText(2131755136);
            BluetoothConnectNewActivity.this.mProgressView.setText("0%");
            BluetoothConnectNewActivity.this.f9952a.mo23151n();
            BluetoothConnectNewActivity.this.mCircleView.mo36218b();
            BluetoothConnectNewActivity.this.mFailedLayout.setVisibility(8);
            BluetoothConnectNewActivity.this.mProgressLayout.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity$d */
    class C5073d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f9958a;

        /* renamed from: b */
        final /* synthetic */ int f9959b;

        C5073d(int i, int i2) {
            this.f9958a = i;
            this.f9959b = i2;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x00be, code lost:
            if (com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.m15896X(r8.f9960c).isShowing() != false) goto L_0x00ec;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ea, code lost:
            if (com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.m15896X(r8.f9960c).isShowing() != false) goto L_0x00ec;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x00ec, code lost:
            com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.m15896X(r8.f9960c).dismiss();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0190, code lost:
            r0.setText(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0193, code lost:
            r8.f9960c.mTitleView.setText(2131755080);
            r8.f9960c.mSubView.setText(2131755559);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0205, code lost:
            if (r8.f9959b == 8) goto L_0x0208;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0208, code lost:
            com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.m15895W(r8.f9960c).removeMessages(1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r8 = this;
                int r0 = r8.f9958a
                r1 = 2131755132(0x7f10007c, float:1.9141135E38)
                java.lang.String r2 = "25%"
                java.lang.String r3 = "20%"
                r4 = 1
                r5 = 2131755559(0x7f100227, float:1.9142E38)
                r6 = 2131755323(0x7f10013b, float:1.9141522E38)
                r7 = 2131755080(0x7f100048, float:1.914103E38)
                switch(r0) {
                    case 0: goto L_0x01a2;
                    case 1: goto L_0x018a;
                    case 2: goto L_0x0183;
                    case 3: goto L_0x017c;
                    case 4: goto L_0x0174;
                    case 5: goto L_0x00f7;
                    case 6: goto L_0x00c1;
                    case 7: goto L_0x0097;
                    case 8: goto L_0x0070;
                    case 9: goto L_0x0016;
                    case 10: goto L_0x0054;
                    case 11: goto L_0x0018;
                    default: goto L_0x0016;
                }
            L_0x0016:
                goto L_0x0201
            L_0x0018:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mProgressView
                java.lang.String r1 = "100%"
                r0.setText(r1)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                com.yeelight.yeelib.ui.view.ConnectCircleView r0 = r0.mCircleView
                r0.setComplete(r4)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mTitleView
                r1 = 2131755139(0x7f100083, float:1.9141149E38)
                r0.setText(r1)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mSubView
                r1 = 2131755141(0x7f100085, float:1.9141153E38)
                r0.setText(r1)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                com.yeelight.yeelib.device.base.c r0 = r0.f9952a
                boolean r0 = r0 instanceof com.yeelight.yeelib.device.base.C3012e
                if (r0 == 0) goto L_0x004d
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                r0.m15899a0()
                goto L_0x0201
            L_0x004d:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                r0.finish()
                goto L_0x0201
            L_0x0054:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mProgressView
                java.lang.String r1 = "75%"
                r0.setText(r1)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mTitleView
                r0.setText(r7)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mSubView
                r1 = 2131755142(0x7f100086, float:1.9141155E38)
            L_0x006b:
                r0.setText(r1)
                goto L_0x0201
            L_0x0070:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mProgressView
                java.lang.String r1 = "50%"
                r0.setText(r1)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mTitleView
                r0.setText(r7)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mSubView
                r1 = 2131755138(0x7f100082, float:1.9141147E38)
                r0.setText(r1)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.os.Handler r0 = r0.f9954c
                r1 = 1000(0x3e8, double:4.94E-321)
                r0.sendEmptyMessageDelayed(r4, r1)
                goto L_0x0201
            L_0x0097:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mProgressView
                r0.setText(r2)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mTitleView
                r0.setText(r6)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mSubView
                r0.setText(r1)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                i4.a r0 = r0.f9953b
                if (r0 == 0) goto L_0x0201
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                i4.a r0 = r0.f9953b
                boolean r0 = r0.isShowing()
                if (r0 == 0) goto L_0x0201
                goto L_0x00ec
            L_0x00c1:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mProgressView
                r0.setText(r2)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mTitleView
                r0.setText(r7)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mSubView
                java.lang.String r1 = " "
                r0.setText(r1)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                i4.a r0 = r0.f9953b
                if (r0 == 0) goto L_0x0201
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                i4.a r0 = r0.f9953b
                boolean r0 = r0.isShowing()
                if (r0 == 0) goto L_0x0201
            L_0x00ec:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                i4.a r0 = r0.f9953b
                r0.dismiss()
                goto L_0x0201
            L_0x00f7:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mProgressView
                r0.setText(r3)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mTitleView
                r0.setText(r7)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mSubView
                r1 = 2131755135(0x7f10007f, float:1.914114E38)
                r0.setText(r1)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                i4.a r0 = r0.f9953b
                if (r0 != 0) goto L_0x0169
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                com.yeelight.yeelib.device.base.c r0 = r0.f9952a
                java.lang.String r0 = r0.mo23208T()
                java.lang.String r1 = "yeelink.light.gingko"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x012d
                r1 = 2131231082(0x7f08016a, float:1.8078235E38)
                goto L_0x0130
            L_0x012d:
                r1 = 2131230891(0x7f0800ab, float:1.8077848E38)
            L_0x0130:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r2 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                i4.a r3 = new i4.a
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r5 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                r3.<init>(r5)
                p170i4.C9106a unused = r2.f9953b = r3
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r2 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                i4.a r2 = r2.f9953b
                r2.mo37123c(r1)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r1 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                i4.a r1 = r1.f9953b
                if (r0 == 0) goto L_0x0151
                r2 = 2131755691(0x7f1002ab, float:1.9142268E38)
                goto L_0x0154
            L_0x0151:
                r2 = 2131755134(0x7f10007e, float:1.9141139E38)
            L_0x0154:
                r1.setTitle(r2)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r1 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                i4.a r1 = r1.f9953b
                if (r0 == 0) goto L_0x0163
                r0 = 2131755690(0x7f1002aa, float:1.9142266E38)
                goto L_0x0166
            L_0x0163:
                r0 = 2131755133(0x7f10007d, float:1.9141137E38)
            L_0x0166:
                r1.mo37124d(r0)
            L_0x0169:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                i4.a r0 = r0.f9953b
                r0.show()
                goto L_0x0201
            L_0x0174:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mProgressView
                r0.setText(r3)
                goto L_0x0193
            L_0x017c:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mProgressView
                java.lang.String r1 = "15%"
                goto L_0x0190
            L_0x0183:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mProgressView
                java.lang.String r1 = "10%"
                goto L_0x0190
            L_0x018a:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mProgressView
                java.lang.String r1 = "1%"
            L_0x0190:
                r0.setText(r1)
            L_0x0193:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mTitleView
                r0.setText(r7)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mSubView
                r0.setText(r5)
                goto L_0x0201
            L_0x01a2:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                i4.a r0 = r0.f9953b
                if (r0 == 0) goto L_0x01bf
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                i4.a r0 = r0.f9953b
                boolean r0 = r0.isShowing()
                if (r0 == 0) goto L_0x01bf
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                i4.a r0 = r0.f9953b
                r0.dismiss()
            L_0x01bf:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.widget.Button r0 = r0.mBtnRetry
                r2 = 0
                r0.setVisibility(r2)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                com.yeelight.yeelib.ui.view.ConnectCircleView r0 = r0.mCircleView
                r0.mo36219c()
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.widget.RelativeLayout r0 = r0.mProgressLayout
                r3 = 4
                r0.setVisibility(r3)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.widget.ImageView r0 = r0.mFailedLayout
                r0.setVisibility(r2)
                int r0 = r8.f9959b
                r2 = 2131755137(0x7f100081, float:1.9141145E38)
                switch(r0) {
                    case 2: goto L_0x01f3;
                    case 3: goto L_0x01f3;
                    case 4: goto L_0x01f3;
                    case 5: goto L_0x01e6;
                    case 6: goto L_0x01f3;
                    case 7: goto L_0x01e6;
                    case 8: goto L_0x01f3;
                    case 9: goto L_0x01e5;
                    case 10: goto L_0x01f3;
                    case 11: goto L_0x01f3;
                    default: goto L_0x01e5;
                }
            L_0x01e5:
                goto L_0x01f3
            L_0x01e6:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mTitleView
                r0.setText(r6)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mSubView
                goto L_0x006b
            L_0x01f3:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mTitleView
                r0.setText(r6)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mSubView
                r0.setText(r2)
            L_0x0201:
                int r0 = r8.f9959b
                r1 = 8
                if (r0 == r1) goto L_0x0208
                goto L_0x0211
            L_0x0208:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.this
                android.os.Handler r0 = r0.f9954c
                r0.removeMessages(r4)
            L_0x0211:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.BluetoothConnectNewActivity.C5073d.run():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m15899a0() {
        this.mCircleView.mo36219c();
        Intent intent = new Intent();
        if (this.f9952a instanceof C6081a) {
            intent.setClass(this, MainActivity.class);
        }
        intent.putExtra("com.yeelight.cherry.device_id", this.f9952a.mo23185G());
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public void onBackPressed() {
        C9106a aVar = this.f9953b;
        if (aVar == null || !aVar.isShowing()) {
            super.onBackPressed();
        }
    }

    public void onConnectionStateChanged(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("NewConnectActivity, onConnectionStateChanged, new state: ");
        sb.append(i2);
        runOnUiThread(new C5073d(i2, i));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        getWindow().addFlags(128);
        setContentView(C12228R$layout.activity_new_connect);
        ButterKnife.bind((Activity) this);
        C9193k.m22157h(true, this);
        setTitleBarPadding(this.mTitleBar);
        this.mTitleBar.mo36195a("", new C5071b(), (View.OnClickListener) null);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f9950d, "Activity has not device id", false);
            finish();
            return;
        }
        C3010c j0 = YeelightDeviceManager.m7794j0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f9952a = j0;
        if (j0 == null) {
            finish();
            return;
        }
        if (j0.mo23113A() == 0) {
            this.f9952a.mo23151n();
        }
        this.mBtnRetry.setOnClickListener(new C5072c());
        this.mTitleView.setText(2131755080);
        this.mSubView.setText(2131755136);
        this.mProgressView.setText("0%");
        this.mBtnRetry.setVisibility(8);
        this.mFailedLayout.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C3010c cVar = this.f9952a;
        if (cVar != null) {
            cVar.mo23133V0(this);
        }
        mo35652M(this);
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f9954c.removeCallbacksAndMessages((Object) null);
        this.f9952a.mo23133V0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f9952a.mo23171z0(this);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (this.f9952a.mo23145k0()) {
            m15899a0();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
    }
}

package com.yeelight.cherry.p177ui.activity;

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
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p150c.C5972a;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.view.ConnectCircleView;
import com.yeelight.yeelib.p194ui.widget.C10514a;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity */
public class BluetoothConnectNewActivity extends BaseActivity implements C9768c {

    /* renamed from: e */
    private static final String f10405e = BluetoothConnectNewActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4198d f10406b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C10514a f10407c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Handler f10408d = new Handler(new C5025a());
    @BindView(2131296432)
    Button mBtnRetry;
    @BindView(2131297112)
    ConnectCircleView mCircleView;
    @BindView(2131296665)
    ImageView mFailedLayout;
    @BindView(2131297118)
    RelativeLayout mProgressLayout;
    @BindView(2131297120)
    TextView mProgressView;
    @BindView(2131297361)
    TextView mSubView;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;
    @BindView(2131297422)
    TextView mTitleView;

    /* renamed from: com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity$a */
    class C5025a implements Handler.Callback {
        C5025a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                TextView textView = BluetoothConnectNewActivity.this.mProgressView;
                textView.setText(String.valueOf(BluetoothConnectNewActivity.this.f10406b.mo23329g0()) + "%");
                BluetoothConnectNewActivity.this.f10408d.sendEmptyMessageDelayed(1, 1000);
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
    class C5026b implements View.OnClickListener {
        C5026b() {
        }

        public void onClick(View view) {
            BluetoothConnectNewActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity$c */
    class C5027c implements View.OnClickListener {
        C5027c() {
        }

        public void onClick(View view) {
            BluetoothConnectNewActivity.this.mBtnRetry.setVisibility(8);
            BluetoothConnectNewActivity.this.mTitleView.setText(2131755081);
            BluetoothConnectNewActivity.this.mSubView.setText(2131755135);
            BluetoothConnectNewActivity.this.mProgressView.setText("0%");
            BluetoothConnectNewActivity.this.f10406b.mo23337n();
            BluetoothConnectNewActivity.this.mCircleView.mo32848b();
            BluetoothConnectNewActivity.this.mFailedLayout.setVisibility(8);
            BluetoothConnectNewActivity.this.mProgressLayout.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity$d */
    class C5028d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f10412a;

        /* renamed from: b */
        final /* synthetic */ int f10413b;

        C5028d(int i, int i2) {
            this.f10412a = i;
            this.f10413b = i2;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x00be, code lost:
            if (com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.m16036X(r8.f10414c).isShowing() != false) goto L_0x00ec;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ea, code lost:
            if (com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.m16036X(r8.f10414c).isShowing() != false) goto L_0x00ec;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x00ec, code lost:
            com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.m16036X(r8.f10414c).dismiss();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0190, code lost:
            r0.setText(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0193, code lost:
            r8.f10414c.mTitleView.setText(2131755081);
            r8.f10414c.mSubView.setText(2131755555);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0205, code lost:
            if (r8.f10413b == 8) goto L_0x0208;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0208, code lost:
            com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.m16035W(r8.f10414c).removeMessages(1);
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
                int r0 = r8.f10412a
                r1 = 2131755131(0x7f10007b, float:1.9141133E38)
                java.lang.String r2 = "25%"
                java.lang.String r3 = "20%"
                r4 = 1
                r5 = 2131755555(0x7f100223, float:1.9141993E38)
                r6 = 2131755319(0x7f100137, float:1.9141514E38)
                r7 = 2131755081(0x7f100049, float:1.9141031E38)
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
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mProgressView
                java.lang.String r1 = "100%"
                r0.setText(r1)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                com.yeelight.yeelib.ui.view.ConnectCircleView r0 = r0.mCircleView
                r0.setComplete(r4)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mTitleView
                r1 = 2131755138(0x7f100082, float:1.9141147E38)
                r0.setText(r1)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mSubView
                r1 = 2131755140(0x7f100084, float:1.914115E38)
                r0.setText(r1)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                com.yeelight.yeelib.c.i.d r0 = r0.f10406b
                boolean r0 = r0 instanceof com.yeelight.yeelib.p150c.p151i.C4200i
                if (r0 == 0) goto L_0x004d
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                r0.m16039a0()
                goto L_0x0201
            L_0x004d:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                r0.finish()
                goto L_0x0201
            L_0x0054:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mProgressView
                java.lang.String r1 = "75%"
                r0.setText(r1)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mTitleView
                r0.setText(r7)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mSubView
                r1 = 2131755141(0x7f100085, float:1.9141153E38)
            L_0x006b:
                r0.setText(r1)
                goto L_0x0201
            L_0x0070:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mProgressView
                java.lang.String r1 = "50%"
                r0.setText(r1)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mTitleView
                r0.setText(r7)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mSubView
                r1 = 2131755137(0x7f100081, float:1.9141145E38)
                r0.setText(r1)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.os.Handler r0 = r0.f10408d
                r1 = 1000(0x3e8, double:4.94E-321)
                r0.sendEmptyMessageDelayed(r4, r1)
                goto L_0x0201
            L_0x0097:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mProgressView
                r0.setText(r2)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mTitleView
                r0.setText(r6)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mSubView
                r0.setText(r1)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                com.yeelight.yeelib.ui.widget.a r0 = r0.f10407c
                if (r0 == 0) goto L_0x0201
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                com.yeelight.yeelib.ui.widget.a r0 = r0.f10407c
                boolean r0 = r0.isShowing()
                if (r0 == 0) goto L_0x0201
                goto L_0x00ec
            L_0x00c1:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mProgressView
                r0.setText(r2)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mTitleView
                r0.setText(r7)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mSubView
                java.lang.String r1 = " "
                r0.setText(r1)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                com.yeelight.yeelib.ui.widget.a r0 = r0.f10407c
                if (r0 == 0) goto L_0x0201
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                com.yeelight.yeelib.ui.widget.a r0 = r0.f10407c
                boolean r0 = r0.isShowing()
                if (r0 == 0) goto L_0x0201
            L_0x00ec:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                com.yeelight.yeelib.ui.widget.a r0 = r0.f10407c
                r0.dismiss()
                goto L_0x0201
            L_0x00f7:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mProgressView
                r0.setText(r3)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mTitleView
                r0.setText(r7)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mSubView
                r1 = 2131755134(0x7f10007e, float:1.9141139E38)
                r0.setText(r1)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                com.yeelight.yeelib.ui.widget.a r0 = r0.f10407c
                if (r0 != 0) goto L_0x0169
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                com.yeelight.yeelib.c.i.d r0 = r0.f10406b
                java.lang.String r0 = r0.mo23395T()
                java.lang.String r1 = "yeelink.light.gingko"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x012d
                r1 = 2131231068(0x7f08015c, float:1.8078207E38)
                goto L_0x0130
            L_0x012d:
                r1 = 2131230877(0x7f08009d, float:1.807782E38)
            L_0x0130:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r2 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                com.yeelight.yeelib.ui.widget.a r3 = new com.yeelight.yeelib.ui.widget.a
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r5 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                r3.<init>(r5)
                com.yeelight.yeelib.p194ui.widget.C10514a unused = r2.f10407c = r3
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r2 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                com.yeelight.yeelib.ui.widget.a r2 = r2.f10407c
                r2.mo33276c(r1)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r1 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                com.yeelight.yeelib.ui.widget.a r1 = r1.f10407c
                if (r0 == 0) goto L_0x0151
                r2 = 2131755683(0x7f1002a3, float:1.9142252E38)
                goto L_0x0154
            L_0x0151:
                r2 = 2131755133(0x7f10007d, float:1.9141137E38)
            L_0x0154:
                r1.setTitle(r2)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r1 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                com.yeelight.yeelib.ui.widget.a r1 = r1.f10407c
                if (r0 == 0) goto L_0x0163
                r0 = 2131755682(0x7f1002a2, float:1.914225E38)
                goto L_0x0166
            L_0x0163:
                r0 = 2131755132(0x7f10007c, float:1.9141135E38)
            L_0x0166:
                r1.mo33277d(r0)
            L_0x0169:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                com.yeelight.yeelib.ui.widget.a r0 = r0.f10407c
                r0.show()
                goto L_0x0201
            L_0x0174:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mProgressView
                r0.setText(r3)
                goto L_0x0193
            L_0x017c:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mProgressView
                java.lang.String r1 = "15%"
                goto L_0x0190
            L_0x0183:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mProgressView
                java.lang.String r1 = "10%"
                goto L_0x0190
            L_0x018a:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mProgressView
                java.lang.String r1 = "1%"
            L_0x0190:
                r0.setText(r1)
            L_0x0193:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mTitleView
                r0.setText(r7)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mSubView
                r0.setText(r5)
                goto L_0x0201
            L_0x01a2:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                com.yeelight.yeelib.ui.widget.a r0 = r0.f10407c
                if (r0 == 0) goto L_0x01bf
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                com.yeelight.yeelib.ui.widget.a r0 = r0.f10407c
                boolean r0 = r0.isShowing()
                if (r0 == 0) goto L_0x01bf
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                com.yeelight.yeelib.ui.widget.a r0 = r0.f10407c
                r0.dismiss()
            L_0x01bf:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.widget.Button r0 = r0.mBtnRetry
                r2 = 0
                r0.setVisibility(r2)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                com.yeelight.yeelib.ui.view.ConnectCircleView r0 = r0.mCircleView
                r0.mo32849c()
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.widget.RelativeLayout r0 = r0.mProgressLayout
                r3 = 4
                r0.setVisibility(r3)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.widget.ImageView r0 = r0.mFailedLayout
                r0.setVisibility(r2)
                int r0 = r8.f10413b
                r2 = 2131755136(0x7f100080, float:1.9141143E38)
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
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mTitleView
                r0.setText(r6)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mSubView
                goto L_0x006b
            L_0x01f3:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mTitleView
                r0.setText(r6)
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.widget.TextView r0 = r0.mSubView
                r0.setText(r2)
            L_0x0201:
                int r0 = r8.f10413b
                r1 = 8
                if (r0 == r1) goto L_0x0208
                goto L_0x0211
            L_0x0208:
                com.yeelight.cherry.ui.activity.BluetoothConnectNewActivity r0 = com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.this
                android.os.Handler r0 = r0.f10408d
                r0.removeMessages(r4)
            L_0x0211:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.BluetoothConnectNewActivity.C5028d.run():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m16039a0() {
        this.mCircleView.mo32849c();
        Intent intent = new Intent();
        if (this.f10406b instanceof C5972a) {
            intent.setClass(this, MainActivity.class);
        }
        intent.putExtra("com.yeelight.cherry.device_id", this.f10406b.mo23372G());
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public void onBackPressed() {
        C10514a aVar = this.f10407c;
        if (aVar == null || !aVar.isShowing()) {
            super.onBackPressed();
        }
    }

    public void onConnectionStateChanged(int i, int i2) {
        "NewConnectActivity, onConnectionStateChanged, new state: " + i2;
        runOnUiThread(new C5028d(i2, i));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        getWindow().addFlags(128);
        setContentView(C11748R$layout.activity_new_connect);
        ButterKnife.bind((Activity) this);
        C10547m.m25758h(true, this);
        setTitleBarPadding(this.mTitleBar);
        this.mTitleBar.mo32825a("", new C5026b(), (View.OnClickListener) null);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f10405e, "Activity has not device id", false);
            finish();
            return;
        }
        C4198d h0 = C4257w.m11945h0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f10406b = h0;
        if (h0 == null) {
            finish();
            return;
        }
        if (h0.mo23299A() == 0) {
            this.f10406b.mo23337n();
        }
        this.mBtnRetry.setOnClickListener(new C5027c());
        this.mTitleView.setText(2131755081);
        this.mSubView.setText(2131755135);
        this.mProgressView.setText("0%");
        this.mBtnRetry.setVisibility(8);
        this.mFailedLayout.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C4198d dVar = this.f10406b;
        if (dVar != null) {
            dVar.mo23319V0(this);
        }
        mo32192M(this);
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f10408d.removeCallbacksAndMessages((Object) null);
        this.f10406b.mo23319V0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f10406b.mo23358z0(this);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (this.f10406b.mo23331k0()) {
            m16039a0();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
    }
}

package com.yeelight.cherry.p141ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.p022mi.iot.common.error.IotError;
import com.p022mi.iot.common.handler.CompletedHandler;
import com.yeelight.cherry.C12224R$drawable;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.xiaomi.base.C8251a;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.List;
import p051j4.C9193k;
import p160g4.C9065b;
import p223w3.C11911z;
import p237z3.C12145e;

/* renamed from: com.yeelight.cherry.ui.activity.CurtainGuideActivity */
public class CurtainGuideActivity extends BaseActivity implements C12145e {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final String f10216e = "CurtainGuideActivity";

    /* renamed from: f */
    public static final /* synthetic */ int f10217f = 0;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C11911z f10218a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<String> f10219b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Handler f10220c = new Handler(new C5188a());
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C8251a<Integer> f10221d = new C5196b();
    @BindView(2131296493)
    Button mBtnStart;
    @BindView(2131296881)
    ImageView mImgConfigProgress;
    @BindView(2131296899)
    ImageView mImgHint;
    @BindView(2131297681)
    TextView mTvSubTitle;
    @BindView(2131297686)
    TextView mTvTitle;

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainGuideActivity$a */
    class C5188a implements Handler.Callback {

        /* renamed from: com.yeelight.cherry.ui.activity.CurtainGuideActivity$a$a */
        class C5189a implements CompletedHandler {
            C5189a() {
            }

            public void onFailed(IotError iotError) {
                CurtainGuideActivity.this.f10220c.sendEmptyMessage(10);
            }

            public void onSucceed() {
                CurtainGuideActivity.this.f10220c.sendEmptyMessage(2);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.CurtainGuideActivity$a$b */
        class C5190b implements CompletedHandler {
            C5190b() {
            }

            public void onFailed(IotError iotError) {
                CurtainGuideActivity.this.f10220c.sendEmptyMessage(10);
            }

            public void onSucceed() {
                CurtainGuideActivity.this.f10220c.sendEmptyMessage(3);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.CurtainGuideActivity$a$c */
        class C5191c implements CompletedHandler {
            C5191c() {
            }

            public void onFailed(IotError iotError) {
                CurtainGuideActivity.this.f10220c.sendEmptyMessage(10);
            }

            public void onSucceed() {
                CurtainGuideActivity.this.f10220c.sendEmptyMessageDelayed(12, 2000);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.CurtainGuideActivity$a$d */
        class C5192d implements CompletedHandler {
            C5192d() {
            }

            public void onFailed(IotError iotError) {
            }

            public void onSucceed() {
                CurtainGuideActivity.this.f10220c.sendEmptyMessage(4);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.CurtainGuideActivity$a$e */
        class C5193e implements CompletedHandler {
            C5193e() {
            }

            public void onFailed(IotError iotError) {
                CurtainGuideActivity.this.f10220c.sendEmptyMessage(10);
            }

            public void onSucceed() {
                CurtainGuideActivity.this.f10220c.sendEmptyMessageDelayed(12, 2000);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.CurtainGuideActivity$a$f */
        class C5194f implements CompletedHandler {
            C5194f() {
            }

            public void onFailed(IotError iotError) {
                CurtainGuideActivity.this.f10220c.sendEmptyMessage(10);
            }

            public void onSucceed() {
                String string = CurtainGuideActivity.this.getString(2131755381);
                Message obtain = Message.obtain();
                obtain.what = 9;
                obtain.obj = Boolean.valueOf(string.equals((String) CurtainGuideActivity.this.f10219b.get(0)));
                CurtainGuideActivity.this.f10220c.sendMessage(obtain);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.CurtainGuideActivity$a$g */
        class C5195g implements CompletedHandler {
            C5195g() {
            }

            public void onFailed(IotError iotError) {
                CurtainGuideActivity.this.f10220c.sendEmptyMessage(10);
            }

            public void onSucceed() {
                CurtainGuideActivity.this.f10220c.sendEmptyMessage(13);
            }
        }

        C5188a() {
        }

        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    String unused = CurtainGuideActivity.f10216e;
                    CurtainGuideActivity.this.m16119g0();
                    CurtainGuideActivity.this.f10220c.removeCallbacksAndMessages((Object) null);
                    CurtainGuideActivity.this.m16118f0(1);
                    CurtainGuideActivity.this.f10220c.sendEmptyMessage(1);
                    break;
                case 1:
                    String unused2 = CurtainGuideActivity.f10216e;
                    CurtainGuideActivity.this.f10218a.mo42396F2(false, new C5189a());
                    break;
                case 2:
                    String unused3 = CurtainGuideActivity.f10216e;
                    CurtainGuideActivity.this.f10218a.mo42399I2(false, new C5190b());
                    break;
                case 3:
                    String unused4 = CurtainGuideActivity.f10216e;
                    CurtainGuideActivity.this.f10218a.mo41878y2(1, new C5191c());
                    break;
                case 4:
                    String unused5 = CurtainGuideActivity.f10216e;
                    CurtainGuideActivity.this.f10218a.mo41878y2(2, new C5193e());
                    break;
                case 5:
                    String unused6 = CurtainGuideActivity.f10216e;
                    CurtainGuideActivity.this.f10220c.removeCallbacksAndMessages((Object) null);
                    CurtainGuideActivity.this.m16123k0();
                    break;
                case 7:
                    String unused7 = CurtainGuideActivity.f10216e;
                    CurtainGuideActivity.this.f10218a.mo42398H2(true, new C5192d());
                    break;
                case 8:
                    String unused8 = CurtainGuideActivity.f10216e;
                    CurtainGuideActivity.this.f10218a.mo42397G2(true, new C5194f());
                    break;
                case 9:
                    Object obj = message.obj;
                    if (obj != null) {
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        String unused9 = CurtainGuideActivity.f10216e;
                        StringBuilder sb = new StringBuilder();
                        sb.append("handleMessage: MSG_MOTOR_REVERSE_LAST ");
                        sb.append(booleanValue);
                        CurtainGuideActivity.this.f10218a.mo41874u2(booleanValue ? 0 : 100);
                        CurtainGuideActivity.this.f10218a.mo42399I2(booleanValue, new C5195g());
                        break;
                    } else {
                        return false;
                    }
                case 10:
                    String unused10 = CurtainGuideActivity.f10216e;
                    CurtainGuideActivity.this.f10220c.removeCallbacksAndMessages((Object) null);
                    CurtainGuideActivity.this.m16118f0(3);
                    break;
                case 11:
                    String unused11 = CurtainGuideActivity.f10216e;
                    CurtainGuideActivity.this.f10220c.removeCallbacksAndMessages((Object) null);
                    CurtainGuideActivity.this.m16118f0(2);
                    break;
                case 12:
                    String unused12 = CurtainGuideActivity.f10216e;
                    CurtainGuideActivity.this.f10218a.mo42392B2(CurtainGuideActivity.this.f10221d);
                    CurtainGuideActivity.this.f10220c.sendEmptyMessageDelayed(15, 50000);
                    break;
                case 13:
                    String unused13 = CurtainGuideActivity.f10216e;
                    Intent intent = new Intent(CurtainGuideActivity.this, CurtainModeActivity.class);
                    intent.putExtra("com.yeelight.cherry.device_id", CurtainGuideActivity.this.f10218a.mo23185G());
                    CurtainGuideActivity.this.startActivity(intent);
                    CurtainGuideActivity.this.finish();
                    break;
                case 14:
                    String unused14 = CurtainGuideActivity.f10216e;
                    CurtainGuideActivity.this.f10220c.removeCallbacksAndMessages((Object) null);
                    CurtainGuideActivity.this.m16118f0(0);
                    break;
                case 15:
                    String unused15 = CurtainGuideActivity.f10216e;
                    CurtainGuideActivity.this.f10220c.removeCallbacksAndMessages((Object) null);
                    CurtainGuideActivity.this.f10220c.sendEmptyMessage(5);
                    break;
            }
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainGuideActivity$b */
    class C5196b implements C8251a<Integer> {
        C5196b() {
        }

        /* renamed from: a */
        public void onSucceed(Integer num) {
            StringBuilder sb = new StringBuilder();
            sb.append("GetStatus onSucceed status: ");
            sb.append(num);
            if (num != null) {
                if (4 == num.intValue()) {
                    CurtainGuideActivity.this.f10220c.sendEmptyMessage(5);
                } else {
                    CurtainGuideActivity.this.f10220c.sendEmptyMessageDelayed(12, 1500);
                }
            }
        }

        public void onFailed(IotError iotError) {
            CurtainGuideActivity.this.f10220c.sendEmptyMessageDelayed(12, 1500);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public void m16118f0(int i) {
        TextView textView;
        int i2;
        if (i == 0) {
            m16122j0(true, true, false);
            this.mTvTitle.setText(2131755378);
            this.mTvSubTitle.setText(2131755377);
            this.mBtnStart.setText(2131755375);
            this.mImgHint.setImageResource(C12224R$drawable.icon_yeelight_curtain_correct);
        } else if (i != 1) {
            if (i == 2) {
                m16122j0(true, true, false);
                this.mTvTitle.setText(2131755372);
                textView = this.mTvSubTitle;
                i2 = 2131755371;
            } else if (i == 3) {
                m16122j0(true, true, false);
                this.mTvTitle.setText(2131755374);
                textView = this.mTvSubTitle;
                i2 = 2131755373;
            } else {
                return;
            }
            textView.setText(i2);
            this.mBtnStart.setText(2131755376);
            this.mImgHint.setImageResource(C12224R$drawable.icon_yeelight_curtain_error);
        } else {
            m16122j0(false, false, true);
            this.mTvTitle.setText(2131755385);
            this.mTvSubTitle.setText(2131755384);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m16119g0() {
        int[] iArr = {2131755380, 2131755381, 2131755382};
        List<String> list = this.f10219b;
        if (list == null) {
            this.f10219b = new ArrayList();
        } else {
            list.clear();
        }
        for (int i = 0; i < 3; i++) {
            this.f10219b.add(getResources().getString(iArr[i]));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public /* synthetic */ void m16120h0(AdapterView adapterView, View view, int i, long j) {
        Handler handler;
        int i2;
        if (i == this.f10219b.size() - 1) {
            handler = this.f10220c;
            i2 = 11;
        } else if (this.f10219b.size() == 3) {
            this.f10219b.remove(i);
            handler = this.f10220c;
            i2 = 7;
        } else {
            handler = this.f10220c;
            i2 = 8;
        }
        handler.sendEmptyMessage(i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public /* synthetic */ void m16121i0(View view) {
        this.f10220c.sendEmptyMessage(14);
    }

    /* renamed from: j0 */
    private void m16122j0(boolean z, boolean z2, boolean z3) {
        int i = 0;
        this.mBtnStart.setVisibility(z ? 0 : 4);
        this.mImgHint.setVisibility(z2 ? 0 : 4);
        ImageView imageView = this.mImgConfigProgress;
        if (!z3) {
            i = 4;
        }
        imageView.setVisibility(i);
        if (z3) {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            rotateAnimation.setDuration(1000);
            this.mImgConfigProgress.startAnimation(rotateAnimation);
            return;
        }
        this.mImgConfigProgress.clearAnimation();
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public void m16123k0() {
        C9065b b = new C9065b.C9067b(this).mo37009g(2131755383).mo37005c(this.f10219b).mo37008f(new C5801n0(this)).mo37007e(new C5795m0(this)).mo37004b();
        b.setCanceledOnTouchOutside(false);
        b.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_curtain_correct);
        ButterKnife.bind((Activity) this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        findViewById(2131297598).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f10216e, "Activity has not device id", false);
            finish();
            return;
        }
        C11911z zVar = (C11911z) YeelightDeviceManager.m7794j0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f10218a = zVar;
        if (zVar == null || !zVar.mo23145k0()) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        this.f10218a.mo23180C0(this, false);
        m16118f0(0);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f10220c.removeCallbacksAndMessages((Object) null);
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
    }

    /* access modifiers changed from: protected */
    @OnClick({2131296876, 2131296493})
    public void onViewClick(View view) {
        int id = view.getId();
        if (id == 2131296493) {
            this.f10220c.sendEmptyMessage(0);
        } else if (id == 2131296876) {
            onBackPressed();
        }
    }
}

package com.yeelight.cherry.p177ui.activity;

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
import com.p146mi.iot.common.error.IotError;
import com.p146mi.iot.common.handler.CompletedHandler;
import com.yeelight.cherry.C11744R$drawable;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.device.xiaomi.base.C9763a;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p183m.C7472y;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p191j.p192a.C9891b;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.activity.CurtainGuideActivity */
public class CurtainGuideActivity extends BaseActivity implements C9770e {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String f10662f = CurtainGuideActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C7472y f10663b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<String> f10664c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Handler f10665d = new Handler(new C5140a());
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C9763a<Integer> f10666e = new C5148b();
    @BindView(2131296435)
    Button mBtnStart;
    @BindView(2131296777)
    ImageView mImgConfigProgress;
    @BindView(2131296795)
    ImageView mImgHint;
    @BindView(2131297505)
    TextView mTvSubTitle;
    @BindView(2131297510)
    TextView mTvTitle;

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainGuideActivity$a */
    class C5140a implements Handler.Callback {

        /* renamed from: com.yeelight.cherry.ui.activity.CurtainGuideActivity$a$a */
        class C5141a implements CompletedHandler {
            C5141a() {
            }

            public void onFailed(IotError iotError) {
                CurtainGuideActivity.this.f10665d.sendEmptyMessage(10);
            }

            public void onSucceed() {
                CurtainGuideActivity.this.f10665d.sendEmptyMessage(2);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.CurtainGuideActivity$a$b */
        class C5142b implements CompletedHandler {
            C5142b() {
            }

            public void onFailed(IotError iotError) {
                CurtainGuideActivity.this.f10665d.sendEmptyMessage(10);
            }

            public void onSucceed() {
                CurtainGuideActivity.this.f10665d.sendEmptyMessage(3);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.CurtainGuideActivity$a$c */
        class C5143c implements CompletedHandler {
            C5143c() {
            }

            public void onFailed(IotError iotError) {
                CurtainGuideActivity.this.f10665d.sendEmptyMessage(10);
            }

            public void onSucceed() {
                CurtainGuideActivity.this.f10665d.sendEmptyMessageDelayed(12, 2000);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.CurtainGuideActivity$a$d */
        class C5144d implements CompletedHandler {
            C5144d() {
            }

            public void onFailed(IotError iotError) {
            }

            public void onSucceed() {
                CurtainGuideActivity.this.f10665d.sendEmptyMessage(4);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.CurtainGuideActivity$a$e */
        class C5145e implements CompletedHandler {
            C5145e() {
            }

            public void onFailed(IotError iotError) {
                CurtainGuideActivity.this.f10665d.sendEmptyMessage(10);
            }

            public void onSucceed() {
                CurtainGuideActivity.this.f10665d.sendEmptyMessageDelayed(12, 2000);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.CurtainGuideActivity$a$f */
        class C5146f implements CompletedHandler {
            C5146f() {
            }

            public void onFailed(IotError iotError) {
                CurtainGuideActivity.this.f10665d.sendEmptyMessage(10);
            }

            public void onSucceed() {
                String string = CurtainGuideActivity.this.getString(2131755377);
                Message obtain = Message.obtain();
                obtain.what = 9;
                obtain.obj = Boolean.valueOf(string.equals((String) CurtainGuideActivity.this.f10664c.get(0)));
                CurtainGuideActivity.this.f10665d.sendMessage(obtain);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.CurtainGuideActivity$a$g */
        class C5147g implements CompletedHandler {
            C5147g() {
            }

            public void onFailed(IotError iotError) {
                CurtainGuideActivity.this.f10665d.sendEmptyMessage(10);
            }

            public void onSucceed() {
                CurtainGuideActivity.this.f10665d.sendEmptyMessage(13);
            }
        }

        C5140a() {
        }

        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    String unused = CurtainGuideActivity.f10662f;
                    CurtainGuideActivity.this.m16207e0();
                    CurtainGuideActivity.this.f10665d.removeCallbacksAndMessages((Object) null);
                    CurtainGuideActivity.this.m16206d0(1);
                    CurtainGuideActivity.this.f10665d.sendEmptyMessage(1);
                    break;
                case 1:
                    String unused2 = CurtainGuideActivity.f10662f;
                    CurtainGuideActivity.this.f10663b.mo28812F2(false, new C5141a());
                    break;
                case 2:
                    String unused3 = CurtainGuideActivity.f10662f;
                    CurtainGuideActivity.this.f10663b.mo28815I2(false, new C5142b());
                    break;
                case 3:
                    String unused4 = CurtainGuideActivity.f10662f;
                    CurtainGuideActivity.this.f10663b.mo27625y2(1, new C5143c());
                    break;
                case 4:
                    String unused5 = CurtainGuideActivity.f10662f;
                    CurtainGuideActivity.this.f10663b.mo27625y2(2, new C5145e());
                    break;
                case 5:
                    String unused6 = CurtainGuideActivity.f10662f;
                    CurtainGuideActivity.this.f10665d.removeCallbacksAndMessages((Object) null);
                    CurtainGuideActivity.this.m16209i0();
                    break;
                case 7:
                    String unused7 = CurtainGuideActivity.f10662f;
                    CurtainGuideActivity.this.f10663b.mo28814H2(true, new C5144d());
                    break;
                case 8:
                    String unused8 = CurtainGuideActivity.f10662f;
                    CurtainGuideActivity.this.f10663b.mo28813G2(true, new C5146f());
                    break;
                case 9:
                    Object obj = message.obj;
                    if (obj != null) {
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        String unused9 = CurtainGuideActivity.f10662f;
                        "handleMessage: MSG_MOTOR_REVERSE_LAST " + booleanValue;
                        CurtainGuideActivity.this.f10663b.mo27621u2(booleanValue ? 0 : 100);
                        CurtainGuideActivity.this.f10663b.mo28815I2(booleanValue, new C5147g());
                        break;
                    } else {
                        return false;
                    }
                case 10:
                    String unused10 = CurtainGuideActivity.f10662f;
                    CurtainGuideActivity.this.f10665d.removeCallbacksAndMessages((Object) null);
                    CurtainGuideActivity.this.m16206d0(3);
                    break;
                case 11:
                    String unused11 = CurtainGuideActivity.f10662f;
                    CurtainGuideActivity.this.f10665d.removeCallbacksAndMessages((Object) null);
                    CurtainGuideActivity.this.m16206d0(2);
                    break;
                case 12:
                    String unused12 = CurtainGuideActivity.f10662f;
                    CurtainGuideActivity.this.f10663b.mo28808B2(CurtainGuideActivity.this.f10666e);
                    CurtainGuideActivity.this.f10665d.sendEmptyMessageDelayed(15, 50000);
                    break;
                case 13:
                    String unused13 = CurtainGuideActivity.f10662f;
                    Intent intent = new Intent(CurtainGuideActivity.this, CurtainModeActivity.class);
                    intent.putExtra("com.yeelight.cherry.device_id", CurtainGuideActivity.this.f10663b.mo23372G());
                    CurtainGuideActivity.this.startActivity(intent);
                    CurtainGuideActivity.this.finish();
                    break;
                case 14:
                    String unused14 = CurtainGuideActivity.f10662f;
                    CurtainGuideActivity.this.f10665d.removeCallbacksAndMessages((Object) null);
                    CurtainGuideActivity.this.m16206d0(0);
                    break;
                case 15:
                    String unused15 = CurtainGuideActivity.f10662f;
                    CurtainGuideActivity.this.f10665d.removeCallbacksAndMessages((Object) null);
                    CurtainGuideActivity.this.f10665d.sendEmptyMessage(5);
                    break;
            }
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainGuideActivity$b */
    class C5148b implements C9763a<Integer> {
        C5148b() {
        }

        /* renamed from: a */
        public void onSucceed(Integer num) {
            "GetStatus onSucceed status: " + num;
            if (num != null) {
                if (4 == num.intValue()) {
                    CurtainGuideActivity.this.f10665d.sendEmptyMessage(5);
                } else {
                    CurtainGuideActivity.this.f10665d.sendEmptyMessageDelayed(12, 1500);
                }
            }
        }

        public void onFailed(IotError iotError) {
            CurtainGuideActivity.this.f10665d.sendEmptyMessageDelayed(12, 1500);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m16206d0(int i) {
        TextView textView;
        int i2;
        if (i == 0) {
            m16208h0(true, true, false);
            this.mTvTitle.setText(2131755374);
            this.mTvSubTitle.setText(2131755373);
            this.mBtnStart.setText(2131755371);
            this.mImgHint.setImageResource(C11744R$drawable.icon_yeelight_curtain_correct);
        } else if (i != 1) {
            if (i == 2) {
                m16208h0(true, true, false);
                this.mTvTitle.setText(2131755368);
                textView = this.mTvSubTitle;
                i2 = 2131755367;
            } else if (i == 3) {
                m16208h0(true, true, false);
                this.mTvTitle.setText(2131755370);
                textView = this.mTvSubTitle;
                i2 = 2131755369;
            } else {
                return;
            }
            textView.setText(i2);
            this.mBtnStart.setText(2131755372);
            this.mImgHint.setImageResource(C11744R$drawable.icon_yeelight_curtain_error);
        } else {
            m16208h0(false, false, true);
            this.mTvTitle.setText(2131755381);
            this.mTvSubTitle.setText(2131755380);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public void m16207e0() {
        int[] iArr = {2131755376, 2131755377, 2131755378};
        List<String> list = this.f10664c;
        if (list == null) {
            this.f10664c = new ArrayList();
        } else {
            list.clear();
        }
        for (int i = 0; i < 3; i++) {
            this.f10664c.add(getResources().getString(iArr[i]));
        }
    }

    /* renamed from: h0 */
    private void m16208h0(boolean z, boolean z2, boolean z3) {
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
    /* renamed from: i0 */
    public void m16209i0() {
        C9891b.C9893b bVar = new C9891b.C9893b(this);
        bVar.mo31997g(2131755379);
        bVar.mo31993c(this.f10664c);
        bVar.mo31996f(new C5686b0(this));
        bVar.mo31995e(new C5681a0(this));
        C9891b b = bVar.mo31992b();
        b.setCanceledOnTouchOutside(false);
        b.show();
    }

    /* renamed from: f0 */
    public /* synthetic */ void mo26322f0(AdapterView adapterView, View view, int i, long j) {
        Handler handler;
        int i2;
        if (i == this.f10664c.size() - 1) {
            handler = this.f10665d;
            i2 = 11;
        } else if (this.f10664c.size() == 3) {
            this.f10664c.remove(i);
            handler = this.f10665d;
            i2 = 7;
        } else {
            handler = this.f10665d;
            i2 = 8;
        }
        handler.sendEmptyMessage(i2);
    }

    /* renamed from: g0 */
    public /* synthetic */ void mo26323g0(View view) {
        this.f10665d.sendEmptyMessage(14);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_curtain_correct);
        ButterKnife.bind((Activity) this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        findViewById(2131297431).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f10662f, "Activity has not device id", false);
            finish();
            return;
        }
        C7472y yVar = (C7472y) C4257w.m11945h0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f10663b = yVar;
        if (yVar == null || !yVar.mo23331k0()) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        this.f10663b.mo23367C0(this, false);
        m16206d0(0);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f10665d.removeCallbacksAndMessages((Object) null);
    }

    public void onStatusChange(int i, C6024e eVar) {
    }

    /* access modifiers changed from: protected */
    @OnClick({2131296772, 2131296435})
    public void onViewClick(View view) {
        int id = view.getId();
        if (id == 2131296435) {
            this.f10665d.sendEmptyMessage(0);
        } else if (id == 2131296772) {
            onBackPressed();
        }
    }
}

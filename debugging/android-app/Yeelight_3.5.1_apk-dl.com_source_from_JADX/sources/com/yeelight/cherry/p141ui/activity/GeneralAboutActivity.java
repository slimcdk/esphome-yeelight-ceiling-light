package com.yeelight.cherry.p141ui.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.hedgehog.ratingbar.RatingBar;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.managers.C3092s;
import com.yeelight.yeelib.managers.C8281l;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.activity.FeedbackV3Activity;
import com.yeelight.yeelib.p142ui.activity.YeelightWebviewActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9193k;
import p170i4.C9107b;

/* renamed from: com.yeelight.cherry.ui.activity.GeneralAboutActivity */
public class GeneralAboutActivity extends BaseActivity implements View.OnClickListener, C3092s.C3095c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f10511a;

    /* renamed from: b */
    C9107b.C9109b f10512b = null;

    /* renamed from: c */
    private Handler f10513c = new C5317b();
    @BindView(2131297800)
    TextView mAppstore;
    @BindView(2131296394)
    TextView mBuildDate;
    @BindView(2131296821)
    ImageView mLogo;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;
    @BindView(2131296279)
    TextView mVersionText;
    @BindView(2131297801)
    TextView mWebsite;
    @BindView(2131297802)
    TextView mWeibo;

    /* renamed from: com.yeelight.cherry.ui.activity.GeneralAboutActivity$a */
    class C5316a implements View.OnClickListener {
        C5316a() {
        }

        public void onClick(View view) {
            GeneralAboutActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GeneralAboutActivity$b */
    class C5317b extends Handler {
        C5317b() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                int unused = GeneralAboutActivity.this.f10511a = 0;
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GeneralAboutActivity$c */
    class C5318c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f10516a;

        C5318c(GeneralAboutActivity generalAboutActivity, AlertDialog alertDialog) {
            this.f10516a = alertDialog;
        }

        public void onClick(View view) {
            C3092s.m8139f().mo23500y(C3092s.m8139f().mo23487j() * 2);
            C3092s.m8139f().mo23493r();
            this.f10516a.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GeneralAboutActivity$d */
    class C5319d implements RatingBar.C2637b {

        /* renamed from: a */
        final /* synthetic */ int[] f10517a;

        /* renamed from: b */
        final /* synthetic */ Button f10518b;

        C5319d(GeneralAboutActivity generalAboutActivity, int[] iArr, Button button) {
            this.f10517a = iArr;
            this.f10518b = button;
        }

        /* renamed from: a */
        public void mo19708a(float f) {
            this.f10517a[0] = (int) f;
            this.f10518b.setEnabled(true);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GeneralAboutActivity$e */
    class C5320e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int[] f10519a;

        /* renamed from: b */
        final /* synthetic */ AlertDialog f10520b;

        C5320e(int[] iArr, AlertDialog alertDialog) {
            this.f10519a = iArr;
            this.f10520b = alertDialog;
        }

        public void onClick(View view) {
            C3092s.m8139f().mo23491p(this.f10519a[0]);
            GeneralAboutActivity.this.m16341b0();
            C3092s.m8139f().mo23497v();
            C3092s.m8139f().mo23493r();
            C3092s.m8139f().mo23500y(10);
            this.f10520b.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GeneralAboutActivity$f */
    class C5321f implements Runnable {
        C5321f() {
        }

        public void run() {
            GeneralAboutActivity generalAboutActivity = GeneralAboutActivity.this;
            generalAboutActivity.f10512b = new C9107b.C9109b(generalAboutActivity);
            GeneralAboutActivity generalAboutActivity2 = GeneralAboutActivity.this;
            generalAboutActivity2.f10512b.mo37128b(0, generalAboutActivity2.getString(2131755106));
            GeneralAboutActivity.this.f10512b.mo37130d();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GeneralAboutActivity$g */
    class C5322g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f10523a;

        C5322g(int i) {
            this.f10523a = i;
        }

        public void run() {
            GeneralAboutActivity generalAboutActivity = GeneralAboutActivity.this;
            generalAboutActivity.f10512b.mo37128b(1, generalAboutActivity.getString(2131755107));
            if (this.f10523a < 4) {
                GeneralAboutActivity.this.m16342c0();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GeneralAboutActivity$h */
    class C5323h implements Runnable {
        C5323h() {
        }

        public void run() {
            GeneralAboutActivity generalAboutActivity = GeneralAboutActivity.this;
            generalAboutActivity.f10512b.mo37128b(2, generalAboutActivity.getString(2131756078));
        }
    }

    /* renamed from: Y */
    private void m16338Y() {
        this.mWeibo.setOnClickListener(this);
        this.mWebsite.setOnClickListener(this);
        this.mAppstore.setOnClickListener(this);
        this.mVersionText.setOnClickListener(this);
        this.mBuildDate.setOnClickListener(this);
        this.mLogo.setOnClickListener(this);
    }

    /* renamed from: Z */
    private void m16339Z() {
        this.mVersionText = (TextView) findViewById(C12225R$id.about_version);
        this.mVersionText.setText(String.format(getResources().getString(2131755683), new Object[]{AppUtils.m8283d()}));
        if ("de".equals(C8281l.m19542b().mo35223a()) || "ru".equals(C8281l.m19542b().mo35223a())) {
            this.mWeibo.setVisibility(8);
            this.mAppstore.setVisibility(8);
            this.mWebsite.setVisibility(8);
            return;
        }
        this.mWeibo.setVisibility(0);
        this.mAppstore.setVisibility(0);
        this.mWebsite.setVisibility(0);
    }

    /* renamed from: a0 */
    private void m16340a0() {
        View inflate = View.inflate(this, C12228R$layout.rating_application_dialog_layout, (ViewGroup) null);
        inflate.setLayerType(1, (Paint) null);
        ImageView imageView = (ImageView) inflate.findViewById(C12225R$id.share_tag_icon);
        Button button = (Button) inflate.findViewById(C12225R$id.dialog_btn_down);
        TextView textView = (TextView) inflate.findViewById(C12225R$id.share_light_info);
        AlertDialog create = new AlertDialog.Builder(this, 2131820942).create();
        RatingBar ratingBar = (RatingBar) inflate.findViewById(C12225R$id.rating_bar);
        ((ImageView) inflate.findViewById(C12225R$id.view_close_dialog)).setOnClickListener(new C5318c(this, create));
        Button button2 = (Button) inflate.findViewById(C12225R$id.dialog_btn_down);
        button2.setEnabled(false);
        ratingBar.setVisibility(0);
        button2.setText(2131755106);
        int[] iArr = {0};
        ratingBar.setOnRatingChangeListener(new C5319d(this, iArr, button2));
        button2.setOnClickListener(new C5320e(iArr, create));
        create.requestWindowFeature(1);
        create.setCancelable(false);
        create.show();
        create.setContentView(inflate);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        WindowManager.LayoutParams attributes = create.getWindow().getAttributes();
        attributes.height = -2;
        double width = (double) defaultDisplay.getWidth();
        Double.isNaN(width);
        attributes.width = (int) (width * 0.78d);
        create.getWindow().setAttributes(attributes);
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m16341b0() {
        runOnUiThread(new C5321f());
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m16342c0() {
        Intent intent = new Intent();
        intent.setClass(this, FeedbackV3Activity.class);
        startActivity(intent);
    }

    /* renamed from: D */
    public void mo23503D() {
    }

    public void onClick(View view) {
        Intent intent;
        int i;
        Class<YeelightWebviewActivity> cls = YeelightWebviewActivity.class;
        int id = view.getId();
        if (id != 2131296821) {
            switch (id) {
                case C12225R$id.yeelight_appstore:
                    m16340a0();
                    return;
                case C12225R$id.yeelight_website:
                    intent = new Intent(this, cls);
                    i = 10;
                    break;
                case C12225R$id.yeelight_weibo:
                    intent = new Intent(this, cls);
                    i = 9;
                    break;
                default:
                    return;
            }
            intent.putExtra("url_index", i);
            startActivity(intent);
            return;
        }
        this.f10511a++;
        this.f10513c.removeMessages(1);
        if (this.f10511a > 4) {
            this.f10511a = 0;
            this.mBuildDate.setVisibility(0);
            return;
        }
        this.f10513c.sendEmptyMessageDelayed(1, 500);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        setContentView(C12228R$layout.activity_general_about);
        ButterKnife.bind((Activity) this);
        C9193k.m22157h(true, this);
        this.mTitleBar.mo36195a(getString(2131755682), new C5316a(), (View.OnClickListener) null);
        this.mTitleBar.setTitleTextSize(16);
        m16339Z();
        m16338Y();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f10513c.removeCallbacksAndMessages((Object) null);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C3092s.m8139f().mo23492q(this);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C3092s.m8139f().mo23494s();
    }

    /* renamed from: u */
    public void mo23504u() {
        runOnUiThread(new C5323h());
    }

    /* renamed from: z */
    public void mo23505z(int i) {
        runOnUiThread(new C5322g(i));
    }
}

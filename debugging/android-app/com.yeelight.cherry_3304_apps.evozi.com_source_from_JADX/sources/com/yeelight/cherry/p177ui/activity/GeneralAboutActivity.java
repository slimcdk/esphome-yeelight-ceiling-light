package com.yeelight.cherry.p177ui.activity;

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
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p152f.C4230l;
import com.yeelight.yeelib.p152f.C4243s;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.activity.FeedbackV3Activity;
import com.yeelight.yeelib.p194ui.activity.YeelightWebviewActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.widget.C10515b;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.cherry.ui.activity.GeneralAboutActivity */
public class GeneralAboutActivity extends BaseActivity implements View.OnClickListener, C4243s.C4246c {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f10946b;

    /* renamed from: c */
    C10515b.C10517b f10947c = null;

    /* renamed from: d */
    private Handler f10948d = new C5269b();
    @BindView(2131297611)
    TextView mAppstore;
    @BindView(2131296347)
    TextView mBuildDate;
    @BindView(2131296724)
    ImageView mLogo;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;
    @BindView(2131296275)
    TextView mVersionText;
    @BindView(2131297612)
    TextView mWebsite;
    @BindView(2131297613)
    TextView mWeibo;

    /* renamed from: com.yeelight.cherry.ui.activity.GeneralAboutActivity$a */
    class C5268a implements View.OnClickListener {
        C5268a() {
        }

        public void onClick(View view) {
            GeneralAboutActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GeneralAboutActivity$b */
    class C5269b extends Handler {
        C5269b() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                int unused = GeneralAboutActivity.this.f10946b = 0;
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GeneralAboutActivity$c */
    class C5270c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f10951a;

        C5270c(GeneralAboutActivity generalAboutActivity, AlertDialog alertDialog) {
            this.f10951a = alertDialog;
        }

        public void onClick(View view) {
            C4243s.m11829f().mo23607y(C4243s.m11829f().mo23594j() * 2);
            C4243s.m11829f().mo23600r();
            this.f10951a.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GeneralAboutActivity$d */
    class C5271d implements RatingBar.C3331b {

        /* renamed from: a */
        final /* synthetic */ int[] f10952a;

        /* renamed from: b */
        final /* synthetic */ Button f10953b;

        C5271d(GeneralAboutActivity generalAboutActivity, int[] iArr, Button button) {
            this.f10952a = iArr;
            this.f10953b = button;
        }

        /* renamed from: a */
        public void mo18089a(float f) {
            this.f10952a[0] = (int) f;
            this.f10953b.setEnabled(true);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GeneralAboutActivity$e */
    class C5272e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int[] f10954a;

        /* renamed from: b */
        final /* synthetic */ AlertDialog f10955b;

        C5272e(int[] iArr, AlertDialog alertDialog) {
            this.f10954a = iArr;
            this.f10955b = alertDialog;
        }

        public void onClick(View view) {
            C4243s.m11829f().mo23598p(this.f10954a[0]);
            GeneralAboutActivity.this.m16403b0();
            C4243s.m11829f().mo23604v();
            C4243s.m11829f().mo23600r();
            C4243s.m11829f().mo23607y(10);
            this.f10955b.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GeneralAboutActivity$f */
    class C5273f implements Runnable {
        C5273f() {
        }

        public void run() {
            GeneralAboutActivity generalAboutActivity = GeneralAboutActivity.this;
            generalAboutActivity.f10947c = new C10515b.C10517b(generalAboutActivity);
            GeneralAboutActivity generalAboutActivity2 = GeneralAboutActivity.this;
            generalAboutActivity2.f10947c.mo33281b(0, generalAboutActivity2.getString(2131755107));
            GeneralAboutActivity.this.f10947c.mo33283d();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GeneralAboutActivity$g */
    class C5274g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f10958a;

        C5274g(int i) {
            this.f10958a = i;
        }

        public void run() {
            GeneralAboutActivity generalAboutActivity = GeneralAboutActivity.this;
            generalAboutActivity.f10947c.mo33281b(1, generalAboutActivity.getString(2131755108));
            if (this.f10958a < 4) {
                GeneralAboutActivity.this.m16404c0();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.GeneralAboutActivity$h */
    class C5275h implements Runnable {
        C5275h() {
        }

        public void run() {
            GeneralAboutActivity generalAboutActivity = GeneralAboutActivity.this;
            generalAboutActivity.f10947c.mo33281b(2, generalAboutActivity.getString(2131756059));
        }
    }

    /* renamed from: Y */
    private void m16400Y() {
        this.mWeibo.setOnClickListener(this);
        this.mWebsite.setOnClickListener(this);
        this.mAppstore.setOnClickListener(this);
        this.mVersionText.setOnClickListener(this);
        this.mBuildDate.setOnClickListener(this);
        this.mLogo.setOnClickListener(this);
    }

    /* renamed from: Z */
    private void m16401Z() {
        this.mVersionText = (TextView) findViewById(C11745R$id.about_version);
        this.mVersionText.setText(String.format(getResources().getString(2131755675), new Object[]{C4308b.m12125d()}));
        if ("de".equals(C4230l.m11766b().mo23552a()) || "ru".equals(C4230l.m11766b().mo23552a())) {
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
    private void m16402a0() {
        View inflate = View.inflate(this, C11748R$layout.rating_application_dialog_layout, (ViewGroup) null);
        inflate.setLayerType(1, (Paint) null);
        ImageView imageView = (ImageView) inflate.findViewById(C11745R$id.share_tag_icon);
        Button button = (Button) inflate.findViewById(C11745R$id.dialog_btn_down);
        TextView textView = (TextView) inflate.findViewById(C11745R$id.share_light_info);
        AlertDialog create = new AlertDialog.Builder(this, 2131820937).create();
        RatingBar ratingBar = (RatingBar) inflate.findViewById(C11745R$id.rating_bar);
        ((ImageView) inflate.findViewById(C11745R$id.view_close_dialog)).setOnClickListener(new C5270c(this, create));
        Button button2 = (Button) inflate.findViewById(C11745R$id.dialog_btn_down);
        button2.setEnabled(false);
        ratingBar.setVisibility(0);
        button2.setText(2131755107);
        int[] iArr = {0};
        ratingBar.setOnRatingChangeListener(new C5271d(this, iArr, button2));
        button2.setOnClickListener(new C5272e(iArr, create));
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
    public void m16403b0() {
        runOnUiThread(new C5273f());
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m16404c0() {
        Intent intent = new Intent();
        intent.setClass(this, FeedbackV3Activity.class);
        startActivity(intent);
    }

    /* renamed from: D */
    public void mo23610D() {
    }

    public void onClick(View view) {
        Intent intent;
        int i;
        int id = view.getId();
        if (id != 2131296724) {
            switch (id) {
                case C11745R$id.yeelight_appstore:
                    m16402a0();
                    return;
                case C11745R$id.yeelight_website:
                    intent = new Intent(this, YeelightWebviewActivity.class);
                    i = 10;
                    break;
                case C11745R$id.yeelight_weibo:
                    intent = new Intent(this, YeelightWebviewActivity.class);
                    i = 9;
                    break;
                default:
                    return;
            }
            intent.putExtra("url_index", i);
            startActivity(intent);
            return;
        }
        this.f10946b++;
        this.f10948d.removeMessages(1);
        if (this.f10946b > 4) {
            this.f10946b = 0;
            this.mBuildDate.setVisibility(0);
            return;
        }
        this.f10948d.sendEmptyMessageDelayed(1, 500);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        setContentView(C11748R$layout.activity_general_about);
        ButterKnife.bind((Activity) this);
        C10547m.m25758h(true, this);
        this.mTitleBar.mo32825a(getString(2131755674), new C5268a(), (View.OnClickListener) null);
        this.mTitleBar.setTitleTextSize(16);
        m16401Z();
        m16400Y();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f10948d.removeCallbacksAndMessages((Object) null);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C4243s.m11829f().mo23599q(this);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C4243s.m11829f().mo23601s();
    }

    /* renamed from: u */
    public void mo23611u() {
        runOnUiThread(new C5275h());
    }

    /* renamed from: z */
    public void mo23612z(int i) {
        runOnUiThread(new C5274g(i));
    }
}

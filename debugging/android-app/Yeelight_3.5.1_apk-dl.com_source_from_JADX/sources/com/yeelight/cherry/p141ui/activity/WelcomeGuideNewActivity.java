package com.yeelight.cherry.p141ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.yeelight.cherry.C12224R$drawable;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.managers.C3084o;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import p051j4.C3278f;
import p051j4.C9193k;

/* renamed from: com.yeelight.cherry.ui.activity.WelcomeGuideNewActivity */
public class WelcomeGuideNewActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String f11477f = "WelcomeGuideNewActivity";
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final int[] f11478g = {C12224R$drawable.icon_yeelight_welcome_guide_1, C12224R$drawable.icon_yeelight_welcome_guide_2, C12224R$drawable.icon_yeelight_welcome_guide_3, C12224R$drawable.icon_yeelight_welcome_guide_4, C12224R$drawable.icon_yeelight_welcome_guide_5};

    /* renamed from: h */
    public static final /* synthetic */ int f11479h = 0;

    /* renamed from: a */
    ViewPager f11480a;

    /* renamed from: b */
    ArrayList<View> f11481b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ImageView[] f11482c;

    /* renamed from: d */
    private LinearLayout f11483d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Button f11484e;

    /* renamed from: com.yeelight.cherry.ui.activity.WelcomeGuideNewActivity$a */
    class C5711a implements View.OnClickListener {

        /* renamed from: com.yeelight.cherry.ui.activity.WelcomeGuideNewActivity$a$a */
        class C5712a implements Runnable {
            C5712a() {
            }

            public void run() {
                AppUtils.m8295p(WelcomeGuideNewActivity.this);
            }
        }

        C5711a() {
        }

        public void onClick(View view) {
            if (C3051a.m7925r().mo23351A()) {
                if (TextUtils.isEmpty(C3084o.m8096k().mo23460q())) {
                    C3084o.m8096k().mo23462t();
                }
                WelcomeGuideNewActivity.this.startActivity(new Intent(WelcomeGuideNewActivity.this, LocaleSelectionLoginActivity.class));
                return;
            }
            Toast.makeText(WelcomeGuideNewActivity.this, 2131755558, 1).show();
            if (!AppUtils.f4977a) {
                C3278f.m8797b(new AppUtils.SuicideException(WelcomeGuideNewActivity.f11477f, "Miot service not bind when login button clicked!"));
            } else {
                String unused = WelcomeGuideNewActivity.f11477f;
            }
            WelcomeGuideNewActivity.this.f11484e.postDelayed(new C5712a(), 1000);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.WelcomeGuideNewActivity$b */
    class C5713b implements ViewPager.OnPageChangeListener {
        C5713b() {
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            int i2;
            ImageView imageView;
            for (int i3 = 0; i3 < WelcomeGuideNewActivity.f11478g.length; i3++) {
                ImageView[] Y = WelcomeGuideNewActivity.this.f11482c;
                if (i3 == i) {
                    imageView = Y[i3];
                    i2 = C12224R$drawable.icon_yeelight_sign_selected;
                } else {
                    imageView = Y[i3];
                    i2 = C12224R$drawable.icon_yeelight_sign_normal;
                }
                imageView.setBackgroundResource(i2);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.WelcomeGuideNewActivity$c */
    class C5714c extends PagerAdapter {
        C5714c() {
        }

        public void destroyItem(View view, int i, Object obj) {
            ((ViewPager) view).removeView(WelcomeGuideNewActivity.this.f11481b.get(i));
        }

        public void finishUpdate(View view) {
        }

        public int getCount() {
            return WelcomeGuideNewActivity.this.f11481b.size();
        }

        public int getItemPosition(Object obj) {
            return super.getItemPosition(obj);
        }

        public Object instantiateItem(View view, int i) {
            ((ViewPager) view).addView(WelcomeGuideNewActivity.this.f11481b.get(i));
            return WelcomeGuideNewActivity.this.f11481b.get(i);
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        }

        public Parcelable saveState() {
            return null;
        }
    }

    /* renamed from: Z */
    private void m17158Z() {
        int i;
        ImageView imageView;
        this.f11482c = new ImageView[this.f11481b.size()];
        for (int i2 = 0; i2 < this.f11481b.size(); i2++) {
            ImageView imageView2 = new ImageView(this);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C9193k.m22150a(this, 5.0f), C9193k.m22150a(this, 5.0f));
            layoutParams.setMargins(C9193k.m22150a(this, 4.0f), 0, C9193k.m22150a(this, 4.0f), 0);
            imageView2.setLayoutParams(layoutParams);
            ImageView[] imageViewArr = this.f11482c;
            imageViewArr[i2] = imageView2;
            if (i2 == 0) {
                imageView = imageViewArr[i2];
                i = C12224R$drawable.icon_yeelight_sign_selected;
            } else {
                imageView = imageViewArr[i2];
                i = C12224R$drawable.icon_yeelight_sign_normal;
            }
            imageView.setBackgroundResource(i);
            this.f11483d.addView(this.f11482c[i2]);
        }
    }

    /* renamed from: a0 */
    private void m17159a0() {
        this.f11481b = new ArrayList<>();
        int i = 0;
        while (true) {
            int[] iArr = f11478g;
            if (i < iArr.length) {
                View inflate = LayoutInflater.from(this).inflate(C12228R$layout.welcom_guide_page_new, (ViewGroup) null);
                inflate.findViewById(C12225R$id.welcome_item_background).setBackgroundResource(iArr[i]);
                this.f11481b.add(inflate);
                i++;
            } else {
                this.f11480a.setAdapter(new C5714c());
                this.f11480a.setCurrentItem(0);
                this.f11480a.addOnPageChangeListener(new C5713b());
                return;
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Welcom activity, onActivityResult result code: ");
            sb.append(i2);
        } else if (i == 0 && intent.getIntExtra("locale_position", -1) != -1) {
            C3051a.m7925r().mo23352B(this);
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        setContentView(C12228R$layout.welcome_guide_new_activity);
        this.f11480a = (ViewPager) findViewById(C12225R$id.view_pager);
        this.f11483d = (LinearLayout) findViewById(C12225R$id.view_page_indicator);
        Button button = (Button) findViewById(C12225R$id.account_login);
        this.f11484e = button;
        button.setOnClickListener(new C5711a());
        m17159a0();
        m17158Z();
        this.f11484e.setEnabled(true);
    }
}

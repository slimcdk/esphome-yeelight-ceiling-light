package com.yeelight.cherry.p177ui.activity;

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
import com.yeelight.cherry.C11744R$drawable;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p152f.C4235o;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import com.yeelight.yeelib.utils.C4310h;
import java.util.ArrayList;

/* renamed from: com.yeelight.cherry.ui.activity.WelcomeGuideNewActivity */
public class WelcomeGuideNewActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String f11904g = WelcomeGuideNewActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final int[] f11905h = {C11744R$drawable.icon_yeelight_welcome_guide_1, C11744R$drawable.icon_yeelight_welcome_guide_2, C11744R$drawable.icon_yeelight_welcome_guide_3, C11744R$drawable.icon_yeelight_welcome_guide_4, C11744R$drawable.icon_yeelight_welcome_guide_5};

    /* renamed from: b */
    ViewPager f11906b;

    /* renamed from: c */
    ArrayList<View> f11907c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ImageView[] f11908d;

    /* renamed from: e */
    private LinearLayout f11909e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Button f11910f;

    /* renamed from: com.yeelight.cherry.ui.activity.WelcomeGuideNewActivity$a */
    class C5670a implements View.OnClickListener {

        /* renamed from: com.yeelight.cherry.ui.activity.WelcomeGuideNewActivity$a$a */
        class C5671a implements Runnable {
            C5671a() {
            }

            public void run() {
                C4308b.m12135n(WelcomeGuideNewActivity.this);
            }
        }

        C5670a() {
        }

        public void onClick(View view) {
            if (C4201a.m11607r().mo23437A()) {
                if (TextUtils.isEmpty(C4235o.m11786k().mo23567q())) {
                    C4235o.m11786k().mo23569t();
                }
                WelcomeGuideNewActivity.this.startActivity(new Intent(WelcomeGuideNewActivity.this, LocaleSelectionLoginActivity.class));
                return;
            }
            Toast.makeText(WelcomeGuideNewActivity.this, 2131755554, 1).show();
            if (!C4308b.f7482a) {
                C4310h.m12146b(new C4308b.C4309a(WelcomeGuideNewActivity.f11904g, "Miot service not bind when login button clicked!"));
            } else {
                String unused = WelcomeGuideNewActivity.f11904g;
            }
            WelcomeGuideNewActivity.this.f11910f.postDelayed(new C5671a(), 1000);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.WelcomeGuideNewActivity$b */
    class C5672b implements ViewPager.OnPageChangeListener {
        C5672b() {
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            int i2;
            ImageView imageView;
            for (int i3 = 0; i3 < WelcomeGuideNewActivity.f11905h.length; i3++) {
                ImageView[] Y = WelcomeGuideNewActivity.this.f11908d;
                if (i3 == i) {
                    imageView = Y[i3];
                    i2 = C11744R$drawable.icon_yeelight_sign_selected;
                } else {
                    imageView = Y[i3];
                    i2 = C11744R$drawable.icon_yeelight_sign_normal;
                }
                imageView.setBackgroundResource(i2);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.WelcomeGuideNewActivity$c */
    class C5673c extends PagerAdapter {
        C5673c() {
        }

        public void destroyItem(View view, int i, Object obj) {
            ((ViewPager) view).removeView(WelcomeGuideNewActivity.this.f11907c.get(i));
        }

        public void finishUpdate(View view) {
        }

        public int getCount() {
            return WelcomeGuideNewActivity.this.f11907c.size();
        }

        public int getItemPosition(Object obj) {
            return super.getItemPosition(obj);
        }

        public Object instantiateItem(View view, int i) {
            ((ViewPager) view).addView(WelcomeGuideNewActivity.this.f11907c.get(i));
            return WelcomeGuideNewActivity.this.f11907c.get(i);
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
    private void m17123Z() {
        int i;
        ImageView imageView;
        this.f11908d = new ImageView[this.f11907c.size()];
        for (int i2 = 0; i2 < this.f11907c.size(); i2++) {
            ImageView imageView2 = new ImageView(this);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C10547m.m25751a(this, 5.0f), C10547m.m25751a(this, 5.0f));
            layoutParams.setMargins(C10547m.m25751a(this, 4.0f), 0, C10547m.m25751a(this, 4.0f), 0);
            imageView2.setLayoutParams(layoutParams);
            ImageView[] imageViewArr = this.f11908d;
            imageViewArr[i2] = imageView2;
            if (i2 == 0) {
                imageView = imageViewArr[i2];
                i = C11744R$drawable.icon_yeelight_sign_selected;
            } else {
                imageView = imageViewArr[i2];
                i = C11744R$drawable.icon_yeelight_sign_normal;
            }
            imageView.setBackgroundResource(i);
            this.f11909e.addView(this.f11908d[i2]);
        }
    }

    /* renamed from: a0 */
    private void m17124a0() {
        this.f11907c = new ArrayList<>();
        for (int backgroundResource : f11905h) {
            View inflate = LayoutInflater.from(this).inflate(C11748R$layout.welcom_guide_page_new, (ViewGroup) null);
            inflate.findViewById(C11745R$id.welcome_item_background).setBackgroundResource(backgroundResource);
            this.f11907c.add(inflate);
        }
        this.f11906b.setAdapter(new C5673c());
        this.f11906b.setCurrentItem(0);
        this.f11906b.addOnPageChangeListener(new C5672b());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            "Welcom activity, onActivityResult result code: " + i2;
        } else if (i == 0 && intent.getIntExtra("locale_position", -1) != -1) {
            C4201a.m11607r().mo23438B(this);
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        setContentView(C11748R$layout.welcome_guide_new_activity);
        this.f11906b = (ViewPager) findViewById(C11745R$id.view_pager);
        this.f11909e = (LinearLayout) findViewById(C11745R$id.view_page_indicator);
        Button button = (Button) findViewById(C11745R$id.account_login);
        this.f11910f = button;
        button.setOnClickListener(new C5670a());
        m17124a0();
        m17123Z();
        this.f11910f.setEnabled(true);
    }
}

package com.yeelight.cherry.p177ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.tabs.TabLayout;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C10560x;
import java.lang.reflect.Field;

/* renamed from: com.yeelight.cherry.ui.activity.DebugActivity */
public class DebugActivity extends Activity {

    /* renamed from: a */
    TabLayout f10700a;

    /* renamed from: b */
    TabLayout f10701b;

    /* renamed from: c */
    TabLayout f10702c;

    /* renamed from: d */
    TabLayout f10703d;

    /* renamed from: com.yeelight.cherry.ui.activity.DebugActivity$a */
    class C5159a implements TabLayout.OnTabSelectedListener {

        /* renamed from: a */
        final /* synthetic */ String[] f10704a;

        C5159a(String[] strArr) {
            this.f10704a = strArr;
        }

        public void onTabReselected(TabLayout.Tab tab) {
        }

        public void onTabSelected(TabLayout.Tab tab) {
            Toast.makeText(DebugActivity.this.getApplicationContext(), this.f10704a[tab.getPosition()], 0).show();
        }

        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DebugActivity$b */
    class C5160b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TabLayout f10706a;

        /* renamed from: b */
        final /* synthetic */ int f10707b;

        C5160b(DebugActivity debugActivity, TabLayout tabLayout, int i) {
            this.f10706a = tabLayout;
            this.f10707b = i;
        }

        public void run() {
            try {
                LinearLayout linearLayout = (LinearLayout) this.f10706a.getChildAt(0);
                int b = C10547m.m25752b(this.f10706a.getContext(), (float) this.f10707b);
                for (int i = 0; i < linearLayout.getChildCount(); i++) {
                    View childAt = linearLayout.getChildAt(i);
                    Field declaredField = childAt.getClass().getDeclaredField("textView");
                    declaredField.setAccessible(true);
                    TextView textView = (TextView) declaredField.get(childAt);
                    childAt.setPadding(0, 0, 0, 0);
                    int width = textView.getWidth();
                    if (width == 0) {
                        textView.measure(0, 0);
                        width = textView.getMeasuredWidth();
                    }
                    int width2 = childAt.getWidth();
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                    layoutParams.width = width;
                    if (this.f10707b == 0) {
                        int i2 = width2 - width;
                        layoutParams.leftMargin = i2 / 2;
                        layoutParams.rightMargin = i2 / 2;
                    } else {
                        layoutParams.leftMargin = b;
                        layoutParams.rightMargin = b;
                    }
                    childAt.setLayoutParams(layoutParams);
                    childAt.invalidate();
                }
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private void m16214a(TabLayout tabLayout, int i, int i2) {
        tabLayout.setTabMode(i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C10547m.m25751a(this, 44.0f));
        int a = C10547m.m25751a(this, (float) i2);
        layoutParams.setMargins(a, 0, a, 0);
        tabLayout.setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    public void mo26330b(TabLayout tabLayout, int i) {
        tabLayout.post(new C5160b(this, tabLayout, i));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C11748R$layout.activity_debug);
        this.f10700a = (TabLayout) findViewById(2131297374);
        this.f10701b = (TabLayout) findViewById(C11745R$id.tabLayout2);
        this.f10702c = (TabLayout) findViewById(C11745R$id.tabLayout3);
        this.f10703d = (TabLayout) findViewById(C11745R$id.tabLayout4);
        String[] strArr = {"推荐场景", "日光", "彩光", "流光", "个性化流光"};
        for (int i = 0; i < 5; i++) {
            TabLayout.Tab newTab = this.f10700a.newTab();
            newTab.setText((CharSequence) strArr[i]);
            this.f10700a.addTab(newTab);
        }
        this.f10700a.setOnTabSelectedListener(new C5159a(strArr));
        String[] strArr2 = {"推荐场景", "白光", "彩光", "流光"};
        for (int i2 = 0; i2 < 4; i2++) {
            TabLayout.Tab newTab2 = this.f10701b.newTab();
            newTab2.setText((CharSequence) strArr2[i2]);
            this.f10701b.addTab(newTab2);
        }
        String[] strArr3 = {"推荐场景", "白光", "彩光"};
        for (int i3 = 0; i3 < 3; i3++) {
            TabLayout.Tab newTab3 = this.f10702c.newTab();
            newTab3.setText((CharSequence) strArr3[i3]);
            this.f10702c.addTab(newTab3);
        }
        String[] strArr4 = {"推荐场景", "白光"};
        for (int i4 = 0; i4 < 2; i4++) {
            TabLayout.Tab newTab4 = this.f10703d.newTab();
            newTab4.setText((CharSequence) strArr4[i4]);
            this.f10703d.addTab(newTab4);
        }
        m16214a(this.f10700a, 0, 0);
        m16214a(this.f10701b, 1, 20);
        m16214a(this.f10702c, 1, 25);
        m16214a(this.f10703d, 1, 70);
        mo26330b(this.f10700a, 20);
        mo26330b(this.f10701b, 0);
        mo26330b(this.f10702c, 0);
        mo26330b(this.f10703d, 0);
        C10560x.m25821a(this.f10700a);
    }
}

package com.yeelight.cherry.p141ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.tabs.TabLayout;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import java.lang.reflect.Field;
import p051j4.C9193k;
import p051j4.C9206w;

/* renamed from: com.yeelight.cherry.ui.activity.DebugActivity */
public class DebugActivity extends Activity {

    /* renamed from: a */
    TabLayout f10256a;

    /* renamed from: b */
    TabLayout f10257b;

    /* renamed from: c */
    TabLayout f10258c;

    /* renamed from: d */
    TabLayout f10259d;

    /* renamed from: com.yeelight.cherry.ui.activity.DebugActivity$a */
    class C5207a implements TabLayout.OnTabSelectedListener {

        /* renamed from: a */
        final /* synthetic */ String[] f10260a;

        C5207a(String[] strArr) {
            this.f10260a = strArr;
        }

        public void onTabReselected(TabLayout.Tab tab) {
        }

        public void onTabSelected(TabLayout.Tab tab) {
            Toast.makeText(DebugActivity.this.getApplicationContext(), this.f10260a[tab.getPosition()], 0).show();
        }

        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DebugActivity$b */
    class C5208b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TabLayout f10262a;

        /* renamed from: b */
        final /* synthetic */ int f10263b;

        C5208b(DebugActivity debugActivity, TabLayout tabLayout, int i) {
            this.f10262a = tabLayout;
            this.f10263b = i;
        }

        public void run() {
            try {
                LinearLayout linearLayout = (LinearLayout) this.f10262a.getChildAt(0);
                int b = C9193k.m22151b(this.f10262a.getContext(), (float) this.f10263b);
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
                    if (this.f10263b == 0) {
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
    private void m16126a(TabLayout tabLayout, int i, int i2) {
        tabLayout.setTabMode(i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C9193k.m22150a(this, 44.0f));
        int a = C9193k.m22150a(this, (float) i2);
        layoutParams.setMargins(a, 0, a, 0);
        tabLayout.setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    public void mo30370b(TabLayout tabLayout, int i) {
        tabLayout.post(new C5208b(this, tabLayout, i));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C12228R$layout.activity_debug);
        this.f10256a = (TabLayout) findViewById(2131297530);
        this.f10257b = (TabLayout) findViewById(C12225R$id.tabLayout2);
        this.f10258c = (TabLayout) findViewById(C12225R$id.tabLayout3);
        this.f10259d = (TabLayout) findViewById(C12225R$id.tabLayout4);
        String[] strArr = {"推荐场景", "日光", "彩光", "流光", "个性化流光"};
        for (int i = 0; i < 5; i++) {
            TabLayout.Tab newTab = this.f10256a.newTab();
            newTab.setText((CharSequence) strArr[i]);
            this.f10256a.addTab(newTab);
        }
        this.f10256a.setOnTabSelectedListener(new C5207a(strArr));
        String[] strArr2 = {"推荐场景", "白光", "彩光", "流光"};
        for (int i2 = 0; i2 < 4; i2++) {
            TabLayout.Tab newTab2 = this.f10257b.newTab();
            newTab2.setText((CharSequence) strArr2[i2]);
            this.f10257b.addTab(newTab2);
        }
        String[] strArr3 = {"推荐场景", "白光", "彩光"};
        for (int i3 = 0; i3 < 3; i3++) {
            TabLayout.Tab newTab3 = this.f10258c.newTab();
            newTab3.setText((CharSequence) strArr3[i3]);
            this.f10258c.addTab(newTab3);
        }
        String[] strArr4 = {"推荐场景", "白光"};
        for (int i4 = 0; i4 < 2; i4++) {
            TabLayout.Tab newTab4 = this.f10259d.newTab();
            newTab4.setText((CharSequence) strArr4[i4]);
            this.f10259d.addTab(newTab4);
        }
        m16126a(this.f10256a, 0, 0);
        m16126a(this.f10257b, 1, 20);
        m16126a(this.f10258c, 1, 25);
        m16126a(this.f10259d, 1, 70);
        mo30370b(this.f10256a, 20);
        mo30370b(this.f10257b, 0);
        mo30370b(this.f10258c, 0);
        mo30370b(this.f10259d, 0);
        C9206w.m22206a(this.f10256a);
    }
}

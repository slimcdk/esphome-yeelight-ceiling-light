package com.yeelight.yeelib.p194ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.models.C7628j;
import com.yeelight.yeelib.device.models.C7632k;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p183m.C6895j0;
import com.yeelight.yeelib.p150c.p183m.C7497z;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p153g.C9830b;
import com.yeelight.yeelib.p194ui.view.BrightnessSeekBarView;
import com.yeelight.yeelib.p194ui.view.GradientView;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C10560x;
import com.yeelight.yeelib.utils.C4308b;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionLightAdjustView */
public class ModeSelectionLightAdjustView extends LinearLayout implements BrightnessSeekBarView.C10403k {

    /* renamed from: o */
    private static final String f19581o = ModeSelectionLightAdjustView.class.getSimpleName();

    /* renamed from: a */
    TabLayout f19582a;

    /* renamed from: b */
    GradientView f19583b;

    /* renamed from: c */
    GradientView f19584c;

    /* renamed from: d */
    FrameLayout f19585d;

    /* renamed from: e */
    FrameLayout f19586e;

    /* renamed from: f */
    FlowSettingView f19587f;

    /* renamed from: g */
    private Context f19588g;

    /* renamed from: h */
    BrightnessSeekBarView f19589h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f19590i = -1;

    /* renamed from: j */
    private int f19591j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f19592k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f19593l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public ArrayList<C10446e> f19594m = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C4200i f19595n;

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionLightAdjustView$a */
    class C10442a implements GradientView.C10431b {
        C10442a() {
        }

        /* renamed from: a */
        public void mo32937a(GradientView gradientView, int i) {
            int unused = ModeSelectionLightAdjustView.this.f19592k = i;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionLightAdjustView$b */
    class C10443b implements GradientView.C10432c {
        C10443b() {
        }

        /* renamed from: a */
        public void mo32938a(GradientView gradientView, float f) {
            C7632k.C7633a b = C7632k.m22541b(ModeSelectionLightAdjustView.this.f19595n.mo23330i1());
            if (((ModeSelectionLightAdjustView.this.f19595n instanceof C6895j0) || (ModeSelectionLightAdjustView.this.f19595n instanceof C7497z)) && ModeSelectionLightAdjustView.this.f19595n.mo23408d0().mo27671W()) {
                b = C7632k.m22545f(ModeSelectionLightAdjustView.this.f19595n.mo23395T());
            }
            int unused = ModeSelectionLightAdjustView.this.f19593l = b.mo29080b() + ((int) (((float) (b.mo29079a() - b.mo29080b())) * f));
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionLightAdjustView$c */
    class C10444c implements TabLayout.OnTabSelectedListener {
        C10444c() {
        }

        public void onTabReselected(TabLayout.Tab tab) {
        }

        public void onTabSelected(TabLayout.Tab tab) {
            C10446e eVar = (C10446e) ModeSelectionLightAdjustView.this.f19594m.get(tab.getPosition());
            ModeSelectionLightAdjustView.this.f19589h.setTabChecked(eVar.f19601a);
            int i = eVar.f19601a;
            if (i == 0) {
                ModeSelectionLightAdjustView.this.f19583b.setVisibility(4);
                ModeSelectionLightAdjustView.this.f19586e.setVisibility(4);
                ModeSelectionLightAdjustView.this.f19587f.setVisibility(4);
                if (C7632k.m22541b(ModeSelectionLightAdjustView.this.f19595n.mo23330i1()).mo29080b() == C7632k.m22541b(ModeSelectionLightAdjustView.this.f19595n.mo23330i1()).mo29079a()) {
                    ModeSelectionLightAdjustView.this.f19584c.setVisibility(4);
                    ModeSelectionLightAdjustView.this.f19585d.setVisibility(0);
                    int unused = ModeSelectionLightAdjustView.this.f19590i = 3;
                } else {
                    ModeSelectionLightAdjustView.this.f19584c.setVisibility(0);
                    ModeSelectionLightAdjustView.this.f19585d.setVisibility(4);
                    int unused2 = ModeSelectionLightAdjustView.this.f19590i = 0;
                }
            } else if (i == 1) {
                ModeSelectionLightAdjustView.this.f19583b.setVisibility(0);
                ModeSelectionLightAdjustView.this.f19584c.setVisibility(4);
                ModeSelectionLightAdjustView.this.f19585d.setVisibility(4);
                ModeSelectionLightAdjustView.this.f19586e.setVisibility(4);
                ModeSelectionLightAdjustView.this.f19587f.setVisibility(4);
                int unused3 = ModeSelectionLightAdjustView.this.f19590i = 1;
            } else if (i == 2) {
                ModeSelectionLightAdjustView.this.f19583b.setVisibility(4);
                ModeSelectionLightAdjustView.this.f19584c.setVisibility(4);
                ModeSelectionLightAdjustView.this.f19585d.setVisibility(4);
                ModeSelectionLightAdjustView.this.f19586e.setVisibility(0);
                ModeSelectionLightAdjustView.this.f19587f.setVisibility(4);
                int unused4 = ModeSelectionLightAdjustView.this.f19590i = 4;
                ModeSelectionLightAdjustView.this.f19589h.setSeekBarColor(-9856305);
                ModeSelectionLightAdjustView.this.f19589h.mo32741j(true);
                return;
            } else if (i == 3) {
                ModeSelectionLightAdjustView.this.f19583b.setVisibility(4);
                ModeSelectionLightAdjustView.this.f19584c.setVisibility(4);
                ModeSelectionLightAdjustView.this.f19585d.setVisibility(4);
                ModeSelectionLightAdjustView.this.f19586e.setVisibility(4);
                ModeSelectionLightAdjustView.this.f19587f.setVisibility(0);
                int unused5 = ModeSelectionLightAdjustView.this.f19590i = 2;
            } else {
                return;
            }
            ModeSelectionLightAdjustView.this.f19589h.setSeekBarColor(-147128);
            ModeSelectionLightAdjustView.this.f19589h.mo32741j(false);
        }

        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionLightAdjustView$d */
    class C10445d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TabLayout f19599a;

        /* renamed from: b */
        final /* synthetic */ int f19600b;

        C10445d(ModeSelectionLightAdjustView modeSelectionLightAdjustView, TabLayout tabLayout, int i) {
            this.f19599a = tabLayout;
            this.f19600b = i;
        }

        public void run() {
            try {
                LinearLayout linearLayout = (LinearLayout) this.f19599a.getChildAt(0);
                int b = C10547m.m25752b(this.f19599a.getContext(), (float) this.f19600b);
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
                    if (this.f19600b == 0) {
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

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionLightAdjustView$e */
    class C10446e {

        /* renamed from: a */
        int f19601a;

        /* renamed from: b */
        String f19602b;

        C10446e(ModeSelectionLightAdjustView modeSelectionLightAdjustView, int i, String str) {
            this.f19601a = i;
            this.f19602b = str;
        }

        /* renamed from: a */
        public String mo32988a() {
            return this.f19602b;
        }
    }

    public ModeSelectionLightAdjustView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo32983l(context);
    }

    /* renamed from: b */
    private void m25274b(TabLayout tabLayout, int i, int i2) {
        tabLayout.setTabMode(i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C10547m.m25752b(this.f19588g, 44.0f));
        int b = C10547m.m25752b(this.f19588g, (float) i2);
        layoutParams.setMargins(b, 0, b, 0);
        tabLayout.setLayoutParams(layoutParams);
    }

    /* renamed from: j */
    private void m25280j() {
        TabLayout tabLayout;
        int i;
        if (this.f19594m.size() <= 1) {
            this.f19582a.setVisibility(8);
        } else {
            if (this.f19594m.size() == 2) {
                tabLayout = this.f19582a;
                i = 70;
            } else if (this.f19594m.size() == 3) {
                tabLayout = this.f19582a;
                i = 25;
            } else if (this.f19594m.size() == 4) {
                tabLayout = this.f19582a;
                i = 15;
            } else {
                m25274b(this.f19582a, 0, 0);
                mo32984m(this.f19582a, 20);
                C10560x.m25821a(this.f19582a);
            }
            m25274b(tabLayout, 1, i);
            mo32984m(this.f19582a, 0);
        }
        for (int i2 = 0; i2 < this.f19594m.size(); i2++) {
            TabLayout.Tab newTab = this.f19582a.newTab();
            newTab.setText((CharSequence) this.f19594m.get(i2).mo32988a());
            this.f19582a.addTab(newTab);
        }
        m25281k();
    }

    /* renamed from: k */
    private void m25281k() {
        this.f19582a.setOnTabSelectedListener(new C10444c());
    }

    /* renamed from: a */
    public void mo32760a(int i) {
        this.f19587f.mo32890l(i);
        this.f19591j = i;
    }

    public int getColor() {
        return this.f19592k;
    }

    public int getCt() {
        return this.f19593l;
    }

    public int getCurrentMode() {
        return this.f19590i;
    }

    public C9830b getFlowScene() {
        return this.f19587f.getFlowScene();
    }

    public int getmBright() {
        return this.f19591j;
    }

    /* renamed from: h */
    public void mo32981h() {
        "initColorGradientView!! device cap model: " + this.f19595n.mo23330i1();
        this.f19583b.mo32913h((float) this.f19595n.mo23408d0().mo27702n());
        this.f19592k = this.f19595n.mo23408d0().mo27702n();
    }

    /* renamed from: i */
    public void mo32982i() {
        "initCtGradientView!! device cap model: " + this.f19595n.mo23330i1();
        C7632k.C7633a b = C7632k.m22541b(this.f19595n.mo23330i1());
        C4200i iVar = this.f19595n;
        if (((iVar instanceof C6895j0) || (iVar instanceof C7497z)) && this.f19595n.mo23408d0().mo27671W()) {
            b = C7632k.m22545f(this.f19595n.mo23395T());
        }
        if (b.mo29079a() != b.mo29080b()) {
            this.f19584c.mo32913h(((float) (this.f19595n.mo23408d0().mo27706p() - b.mo29080b())) / ((float) (b.mo29079a() - b.mo29080b())));
            this.f19593l = this.f19595n.mo23408d0().mo27706p();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo32983l(Context context) {
        LayoutInflater.from(context).inflate(R$layout.widget_mode_seletion_light_adjust_view, this, true);
        this.f19582a = (TabLayout) findViewById(R$id.tabLayout_view);
        this.f19583b = (GradientView) findViewById(R$id.color_gradient_view);
        this.f19584c = (GradientView) findViewById(R$id.ct_gradient_view);
        this.f19585d = (FrameLayout) findViewById(R$id.sun_mode_layout);
        this.f19586e = (FrameLayout) findViewById(R$id.moon_mode_layout);
        FlowSettingView flowSettingView = (FlowSettingView) findViewById(R$id.flow_mode_layout);
        this.f19587f = flowSettingView;
        this.f19588g = context;
        flowSettingView.mo32892o();
        this.f19583b.setOnColorChangedListener(new C10442a());
        this.f19584c.setOnCtChangedListener(new C10443b());
    }

    /* renamed from: m */
    public void mo32984m(TabLayout tabLayout, int i) {
        tabLayout.post(new C10445d(this, tabLayout, i));
    }

    public void setBrightnessSeekbarView(BrightnessSeekBarView brightnessSeekBarView) {
        this.f19589h = brightnessSeekBarView;
        brightnessSeekBarView.mo32737g(this);
    }

    public void setDeviceId(String str) {
        int i;
        Resources resources;
        this.f19587f.setDevice(str);
        this.f19594m.clear();
        this.f19582a.removeAllTabs();
        C6006h L0 = C4257w.m11947l0().mo23651L0(str);
        this.f19595n = L0;
        if (L0 == null) {
            this.f19595n = C4257w.m11947l0().mo23648H0(str);
        }
        if (this.f19595n == null) {
            this.f19595n = C4257w.m11947l0().mo23675k0(str);
        }
        if (this.f19595n == null) {
            this.f19595n = C4257w.m11947l0().mo23647G0(str);
        }
        C4200i iVar = this.f19595n;
        if (iVar != null) {
            C7628j I = iVar.mo23375I();
            if (I.mo29076b(C7628j.C7630b.MOON_TAB)) {
                resources = getResources();
                i = R$string.common_text_day;
            } else {
                resources = getResources();
                i = R$string.common_text_light_mode_white;
            }
            String charSequence = resources.getText(i).toString();
            this.f19584c.setBackgroundResource(R$drawable.icon_yeelight_control_view_ct);
            if (I.mo29076b(C7628j.C7630b.CT_TAB)) {
                this.f19594m.add(new C10446e(this, 0, charSequence));
            }
            if (I.mo29076b(C7628j.C7630b.COLOR_TAB)) {
                this.f19594m.add(new C10446e(this, 1, getResources().getString(R$string.common_text_colors)));
            }
            if (I.mo29076b(C7628j.C7630b.MOON_TAB)) {
                this.f19594m.add(new C10446e(this, 2, getResources().getString(R$string.common_text_night_light)));
            }
            if (I.mo29076b(C7628j.C7630b.FLOW_TAB)) {
                this.f19594m.add(new C10446e(this, 3, getResources().getString(R$string.common_text_flow_mode)));
            }
            m25280j();
            mo32982i();
            mo32981h();
            if (C7632k.m22541b(this.f19595n.mo23330i1()).mo29080b() == C7632k.m22541b(this.f19595n.mo23330i1()).mo29079a()) {
                this.f19583b.setVisibility(8);
                this.f19586e.setVisibility(4);
                this.f19587f.setVisibility(8);
                this.f19584c.setVisibility(8);
                this.f19585d.setVisibility(0);
                this.f19590i = 3;
                return;
            }
            if (!I.mo29076b(C7628j.C7630b.COLOR_TAB) || I.mo29076b(C7628j.C7630b.CT_TAB)) {
                this.f19586e.setVisibility(4);
                this.f19587f.setVisibility(4);
                this.f19585d.setVisibility(8);
                if (I.mo29076b(C7628j.C7630b.CT_TAB)) {
                    this.f19583b.setVisibility(4);
                    this.f19584c.setVisibility(0);
                    this.f19590i = 0;
                    return;
                } else if (I.mo29076b(C7628j.C7630b.COLOR_TAB)) {
                    this.f19583b.setVisibility(0);
                    this.f19584c.setVisibility(4);
                } else {
                    C4308b.m12122a(f19581o, "Invalid product capability, fix me!");
                    throw null;
                }
            } else {
                this.f19583b.setVisibility(0);
                this.f19586e.setVisibility(4);
                this.f19587f.setVisibility(4);
                this.f19584c.setVisibility(8);
                this.f19585d.setVisibility(8);
            }
            this.f19590i = 1;
        }
    }
}

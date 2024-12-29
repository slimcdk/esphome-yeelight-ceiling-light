package com.yeelight.yeelib.p142ui.view;

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
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.models.ProductModelBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.C8309b;
import com.yeelight.yeelib.p142ui.view.BrightnessSeekBarView;
import com.yeelight.yeelib.p142ui.view.GradientView;
import com.yeelight.yeelib.utils.AppUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import p051j4.C9193k;
import p051j4.C9206w;
import p223w3.C10595a0;
import p223w3.C11311k0;
import p227x3.C11972i;

/* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionLightAdjustView */
public class ModeSelectionLightAdjustView extends LinearLayout implements BrightnessSeekBarView.C8782k {

    /* renamed from: o */
    private static final String f15839o = ModeSelectionLightAdjustView.class.getSimpleName();

    /* renamed from: a */
    TabLayout f15840a;

    /* renamed from: b */
    GradientView f15841b;

    /* renamed from: c */
    GradientView f15842c;

    /* renamed from: d */
    FrameLayout f15843d;

    /* renamed from: e */
    FrameLayout f15844e;

    /* renamed from: f */
    FlowSettingView f15845f;

    /* renamed from: g */
    private Context f15846g;

    /* renamed from: h */
    BrightnessSeekBarView f15847h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f15848i = -1;

    /* renamed from: j */
    private int f15849j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f15850k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f15851l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public ArrayList<C8823e> f15852m = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C3012e f15853n;

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionLightAdjustView$a */
    class C8819a implements GradientView.C8810b {
        C8819a() {
        }

        /* renamed from: a */
        public void mo36307a(GradientView gradientView, int i) {
            int unused = ModeSelectionLightAdjustView.this.f15850k = i;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionLightAdjustView$b */
    class C8820b implements GradientView.C8811c {
        C8820b() {
        }

        /* renamed from: a */
        public void mo36308a(GradientView gradientView, float f) {
            C11972i.C11973a b = C11972i.m30704b(ModeSelectionLightAdjustView.this.f15853n.mo23144i1());
            if (((ModeSelectionLightAdjustView.this.f15853n instanceof C11311k0) || (ModeSelectionLightAdjustView.this.f15853n instanceof C10595a0)) && ModeSelectionLightAdjustView.this.f15853n.mo23221d0().mo31572X()) {
                b = C11972i.m30708f(ModeSelectionLightAdjustView.this.f15853n.mo23208T());
            }
            int unused = ModeSelectionLightAdjustView.this.f15851l = b.mo42547b() + ((int) (((float) (b.mo42546a() - b.mo42547b())) * f));
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionLightAdjustView$c */
    class C8821c implements TabLayout.OnTabSelectedListener {
        C8821c() {
        }

        public void onTabReselected(TabLayout.Tab tab) {
        }

        public void onTabSelected(TabLayout.Tab tab) {
            C8823e eVar = (C8823e) ModeSelectionLightAdjustView.this.f15852m.get(tab.getPosition());
            ModeSelectionLightAdjustView.this.f15847h.setTabChecked(eVar.f15859a);
            int i = eVar.f15859a;
            if (i == 0) {
                ModeSelectionLightAdjustView.this.f15841b.setVisibility(4);
                ModeSelectionLightAdjustView.this.f15844e.setVisibility(4);
                ModeSelectionLightAdjustView.this.f15845f.setVisibility(4);
                if (C11972i.m30704b(ModeSelectionLightAdjustView.this.f15853n.mo23144i1()).mo42547b() == C11972i.m30704b(ModeSelectionLightAdjustView.this.f15853n.mo23144i1()).mo42546a()) {
                    ModeSelectionLightAdjustView.this.f15842c.setVisibility(4);
                    ModeSelectionLightAdjustView.this.f15843d.setVisibility(0);
                    int unused = ModeSelectionLightAdjustView.this.f15848i = 3;
                } else {
                    ModeSelectionLightAdjustView.this.f15842c.setVisibility(0);
                    ModeSelectionLightAdjustView.this.f15843d.setVisibility(4);
                    int unused2 = ModeSelectionLightAdjustView.this.f15848i = 0;
                }
            } else if (i != 1) {
                if (i == 2) {
                    ModeSelectionLightAdjustView.this.f15841b.setVisibility(4);
                    ModeSelectionLightAdjustView.this.f15842c.setVisibility(4);
                    ModeSelectionLightAdjustView.this.f15843d.setVisibility(4);
                    ModeSelectionLightAdjustView.this.f15844e.setVisibility(0);
                } else if (i == 3) {
                    ModeSelectionLightAdjustView.this.f15841b.setVisibility(4);
                    ModeSelectionLightAdjustView.this.f15842c.setVisibility(4);
                    ModeSelectionLightAdjustView.this.f15843d.setVisibility(4);
                    ModeSelectionLightAdjustView.this.f15844e.setVisibility(4);
                    ModeSelectionLightAdjustView.this.f15845f.setVisibility(0);
                    int unused3 = ModeSelectionLightAdjustView.this.f15848i = 2;
                } else if (i == 4) {
                    ModeSelectionLightAdjustView.this.f15841b.setVisibility(4);
                    ModeSelectionLightAdjustView.this.f15842c.setVisibility(0);
                    ModeSelectionLightAdjustView.this.f15843d.setVisibility(4);
                    ModeSelectionLightAdjustView.this.f15844e.setVisibility(4);
                } else {
                    return;
                }
                ModeSelectionLightAdjustView.this.f15845f.setVisibility(4);
                int unused4 = ModeSelectionLightAdjustView.this.f15848i = 4;
                ModeSelectionLightAdjustView.this.f15847h.setSeekBarColor(-9856305);
                ModeSelectionLightAdjustView.this.f15847h.mo36111j(true);
                return;
            } else {
                ModeSelectionLightAdjustView.this.f15841b.setVisibility(0);
                ModeSelectionLightAdjustView.this.f15842c.setVisibility(4);
                ModeSelectionLightAdjustView.this.f15843d.setVisibility(4);
                ModeSelectionLightAdjustView.this.f15844e.setVisibility(4);
                ModeSelectionLightAdjustView.this.f15845f.setVisibility(4);
                int unused5 = ModeSelectionLightAdjustView.this.f15848i = 1;
            }
            ModeSelectionLightAdjustView.this.f15847h.setSeekBarColor(-147128);
            ModeSelectionLightAdjustView.this.f15847h.mo36111j(false);
        }

        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionLightAdjustView$d */
    class C8822d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TabLayout f15857a;

        /* renamed from: b */
        final /* synthetic */ int f15858b;

        C8822d(ModeSelectionLightAdjustView modeSelectionLightAdjustView, TabLayout tabLayout, int i) {
            this.f15857a = tabLayout;
            this.f15858b = i;
        }

        public void run() {
            try {
                LinearLayout linearLayout = (LinearLayout) this.f15857a.getChildAt(0);
                int b = C9193k.m22151b(this.f15857a.getContext(), (float) this.f15858b);
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
                    if (this.f15858b == 0) {
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
    class C8823e {

        /* renamed from: a */
        int f15859a;

        /* renamed from: b */
        String f15860b;

        C8823e(ModeSelectionLightAdjustView modeSelectionLightAdjustView, int i, String str) {
            this.f15859a = i;
            this.f15860b = str;
        }

        /* renamed from: a */
        public String mo36358a() {
            return this.f15860b;
        }
    }

    public ModeSelectionLightAdjustView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo36353l(context);
    }

    /* renamed from: b */
    private void m20885b(TabLayout tabLayout, int i, int i2) {
        tabLayout.setTabMode(i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C9193k.m22151b(this.f15846g, 44.0f));
        int b = C9193k.m22151b(this.f15846g, (float) i2);
        layoutParams.setMargins(b, 0, b, 0);
        tabLayout.setLayoutParams(layoutParams);
    }

    /* renamed from: j */
    private void m20891j() {
        TabLayout tabLayout;
        int i;
        if (this.f15852m.size() <= 1) {
            this.f15840a.setVisibility(8);
        } else {
            if (this.f15852m.size() == 2) {
                tabLayout = this.f15840a;
                i = 70;
            } else if (this.f15852m.size() == 3) {
                tabLayout = this.f15840a;
                i = 25;
            } else if (this.f15852m.size() == 4) {
                tabLayout = this.f15840a;
                i = 15;
            } else {
                m20885b(this.f15840a, 0, 0);
                mo36354m(this.f15840a, 20);
                C9206w.m22206a(this.f15840a);
            }
            m20885b(tabLayout, 1, i);
            mo36354m(this.f15840a, 0);
        }
        for (int i2 = 0; i2 < this.f15852m.size(); i2++) {
            TabLayout.Tab newTab = this.f15840a.newTab();
            newTab.setText((CharSequence) this.f15852m.get(i2).mo36358a());
            this.f15840a.addTab(newTab);
        }
        m20892k();
    }

    /* renamed from: k */
    private void m20892k() {
        this.f15840a.setOnTabSelectedListener(new C8821c());
    }

    /* renamed from: a */
    public void mo36130a(int i) {
        this.f15845f.mo36260l(i);
        this.f15849j = i;
    }

    public int getColor() {
        return this.f15850k;
    }

    public int getCt() {
        return this.f15851l;
    }

    public int getCurrentMode() {
        return this.f15848i;
    }

    public C8309b getFlowScene() {
        return this.f15845f.getFlowScene();
    }

    public int getmBright() {
        return this.f15849j;
    }

    /* renamed from: h */
    public void mo36351h() {
        StringBuilder sb = new StringBuilder();
        sb.append("initColorGradientView!! device cap model: ");
        sb.append(this.f15853n.mo23144i1());
        this.f15841b.mo36283h((float) this.f15853n.mo23221d0().mo31603n());
        this.f15850k = this.f15853n.mo23221d0().mo31603n();
    }

    /* renamed from: i */
    public void mo36352i() {
        StringBuilder sb = new StringBuilder();
        sb.append("initCtGradientView!! device cap model: ");
        sb.append(this.f15853n.mo23144i1());
        C11972i.C11973a b = C11972i.m30704b(this.f15853n.mo23144i1());
        C3012e eVar = this.f15853n;
        if (((eVar instanceof C11311k0) || (eVar instanceof C10595a0)) && eVar.mo23221d0().mo31572X()) {
            b = C11972i.m30708f(this.f15853n.mo23208T());
        }
        if (b.mo42546a() != b.mo42547b()) {
            this.f15842c.mo36283h(((float) (this.f15853n.mo23221d0().mo31607p() - b.mo42547b())) / ((float) (b.mo42546a() - b.mo42547b())));
            this.f15851l = this.f15853n.mo23221d0().mo31607p();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo36353l(Context context) {
        LayoutInflater.from(context).inflate(R$layout.widget_mode_seletion_light_adjust_view, this, true);
        this.f15840a = (TabLayout) findViewById(R$id.tabLayout_view);
        this.f15841b = (GradientView) findViewById(R$id.color_gradient_view);
        this.f15842c = (GradientView) findViewById(R$id.ct_gradient_view);
        this.f15843d = (FrameLayout) findViewById(R$id.sun_mode_layout);
        this.f15844e = (FrameLayout) findViewById(R$id.moon_mode_layout);
        FlowSettingView flowSettingView = (FlowSettingView) findViewById(R$id.flow_mode_layout);
        this.f15845f = flowSettingView;
        this.f15846g = context;
        flowSettingView.mo36262o();
        this.f15841b.setOnColorChangedListener(new C8819a());
        this.f15842c.setOnCtChangedListener(new C8820b());
    }

    /* renamed from: m */
    public void mo36354m(TabLayout tabLayout, int i) {
        tabLayout.post(new C8822d(this, tabLayout, i));
    }

    public void setBrightnessSeekbarView(BrightnessSeekBarView brightnessSeekBarView) {
        this.f15847h = brightnessSeekBarView;
        brightnessSeekBarView.mo36107g(this);
    }

    public void setDeviceId(String str) {
        int i;
        Resources resources;
        this.f15845f.setDevice(str);
        this.f15852m.clear();
        this.f15840a.removeAllTabs();
        WifiDeviceBase P0 = YeelightDeviceManager.m7800o0().mo23274P0(str);
        this.f15853n = P0;
        if (P0 == null) {
            this.f15853n = YeelightDeviceManager.m7800o0().mo23270K0(str);
        }
        if (this.f15853n == null) {
            this.f15853n = YeelightDeviceManager.m7800o0().mo23304n0(str);
        }
        if (this.f15853n == null) {
            this.f15853n = YeelightDeviceManager.m7800o0().mo23268J0(str);
        }
        C3012e eVar = this.f15853n;
        if (eVar != null) {
            ProductModelBase I = eVar.mo23188I();
            ProductModelBase.CapabilityType capabilityType = ProductModelBase.CapabilityType.MOON_TAB;
            if (I.mo31881b(capabilityType) || I.mo31881b(ProductModelBase.CapabilityType.MOON_WITH_CT_TAB)) {
                resources = getResources();
                i = R$string.common_text_day;
            } else {
                resources = getResources();
                i = R$string.common_text_light_mode_white;
            }
            String charSequence = resources.getText(i).toString();
            this.f15842c.setBackgroundResource(R$drawable.icon_yeelight_control_view_ct);
            ProductModelBase.CapabilityType capabilityType2 = ProductModelBase.CapabilityType.CT_TAB;
            if (I.mo31881b(capabilityType2)) {
                this.f15852m.add(new C8823e(this, 0, charSequence));
            }
            ProductModelBase.CapabilityType capabilityType3 = ProductModelBase.CapabilityType.COLOR_TAB;
            if (I.mo31881b(capabilityType3)) {
                this.f15852m.add(new C8823e(this, 1, getResources().getString(R$string.common_text_colors)));
            }
            if (I.mo31881b(capabilityType)) {
                this.f15852m.add(new C8823e(this, 2, getResources().getString(R$string.common_text_night_light)));
            }
            if (I.mo31881b(ProductModelBase.CapabilityType.MOON_WITH_CT_TAB)) {
                this.f15852m.add(new C8823e(this, 4, getResources().getString(R$string.common_text_night_light)));
            }
            if (I.mo31881b(ProductModelBase.CapabilityType.FLOW_TAB)) {
                this.f15852m.add(new C8823e(this, 3, getResources().getString(R$string.common_text_flow_mode)));
            }
            m20891j();
            mo36352i();
            mo36351h();
            if (C11972i.m30704b(this.f15853n.mo23144i1()).mo42547b() == C11972i.m30704b(this.f15853n.mo23144i1()).mo42546a()) {
                this.f15841b.setVisibility(8);
                this.f15844e.setVisibility(4);
                this.f15845f.setVisibility(8);
                this.f15842c.setVisibility(8);
                this.f15843d.setVisibility(0);
                this.f15848i = 3;
                return;
            }
            if (!I.mo31881b(capabilityType3) || I.mo31881b(capabilityType2)) {
                this.f15844e.setVisibility(4);
                this.f15845f.setVisibility(4);
                this.f15843d.setVisibility(8);
                if (I.mo31881b(capabilityType2)) {
                    this.f15841b.setVisibility(4);
                    this.f15842c.setVisibility(0);
                    this.f15848i = 0;
                    return;
                } else if (I.mo31881b(capabilityType3)) {
                    this.f15841b.setVisibility(0);
                    this.f15842c.setVisibility(4);
                } else {
                    AppUtils.m8280a(f15839o, "Invalid product capability, fix me!");
                    return;
                }
            } else {
                this.f15841b.setVisibility(0);
                this.f15844e.setVisibility(4);
                this.f15845f.setVisibility(4);
                this.f15842c.setVisibility(8);
                this.f15843d.setVisibility(8);
            }
            this.f15848i = 1;
        }
    }
}

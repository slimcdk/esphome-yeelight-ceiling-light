package com.yeelight.yeelib.p142ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.C6081a;
import com.yeelight.yeelib.device.C6119c;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.C6091a;
import com.yeelight.yeelib.device.base.C6092b;
import com.yeelight.yeelib.device.base.C6100g;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.models.ProductModelBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.C3112v;
import com.yeelight.yeelib.models.C8321m;
import com.yeelight.yeelib.p142ui.view.BrightnessSeekBarView;
import com.yeelight.yeelib.p142ui.view.GradientView;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p051j4.C9188d;
import p051j4.C9193k;
import p051j4.C9195n;
import p051j4.C9206w;
import p223w3.C10595a0;
import p223w3.C11311k0;
import p227x3.C11972i;
import p237z3.C12142b;
import p237z3.C12145e;

/* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionViewNew */
public class ModeSelectionViewNew extends LinearLayout implements C12145e, C12142b, BrightnessSeekBarView.C8782k {

    /* renamed from: r */
    private static final String f15861r = ModeSelectionViewNew.class.getSimpleName();

    /* renamed from: a */
    TabLayout f15862a;

    /* renamed from: b */
    GridView f15863b;

    /* renamed from: c */
    GradientView f15864c;

    /* renamed from: d */
    GradientView f15865d;

    /* renamed from: e */
    FrameLayout f15866e;

    /* renamed from: f */
    FrameLayout f15867f;

    /* renamed from: g */
    FlowSettingView f15868g;

    /* renamed from: h */
    TextView f15869h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f15870i = -1;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C8833j f15871j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public List<C8321m> f15872k = new ArrayList();

    /* renamed from: l */
    private Context f15873l;

    /* renamed from: m */
    BrightnessSeekBarView f15874m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public long f15875n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public ArrayList<C8837l> f15876o = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C3012e f15877p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Handler f15878q = new Handler(new C8832i());

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionViewNew$a */
    class C8824a implements GradientView.C8810b {
        C8824a() {
        }

        /* renamed from: a */
        public void mo36307a(GradientView gradientView, int i) {
            Message message = new Message();
            Bundle bundle = new Bundle();
            bundle.putInt("color", i);
            message.setData(bundle);
            message.what = 1;
            ModeSelectionViewNew.this.m20916w(i);
            if (System.currentTimeMillis() - ModeSelectionViewNew.this.f15875n < 600) {
                ModeSelectionViewNew.this.f15878q.removeMessages(1);
                ModeSelectionViewNew.this.f15878q.sendMessageDelayed(message, 600);
                return;
            }
            long unused = ModeSelectionViewNew.this.f15875n = System.currentTimeMillis();
            ModeSelectionViewNew.this.f15878q.removeMessages(1);
            ModeSelectionViewNew.this.f15878q.sendMessage(message);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionViewNew$b */
    class C8825b implements GradientView.C8811c {
        C8825b() {
        }

        /* renamed from: a */
        public void mo36308a(GradientView gradientView, float f) {
            Message message = new Message();
            Bundle bundle = new Bundle();
            C11972i.C11973a b = C11972i.m30704b((!(ModeSelectionViewNew.this.f15877p instanceof C6091a) || ModeSelectionViewNew.this.f15870i != 2) ? ModeSelectionViewNew.this.f15877p.mo23144i1() : "yeelink.light.ceiling4.ambi");
            int i = 0;
            if (((ModeSelectionViewNew.this.f15877p instanceof C11311k0) || (ModeSelectionViewNew.this.f15877p instanceof C10595a0)) && ModeSelectionViewNew.this.f15877p.mo23221d0().mo31572X()) {
                b = C11972i.m30708f(ModeSelectionViewNew.this.f15877p.mo23208T());
            }
            if (b != null) {
                i = b.mo42547b() + ((int) (((float) (b.mo42546a() - b.mo42547b())) * f));
            }
            ModeSelectionViewNew.this.m20917x(i);
            bundle.putInt("ct", i);
            message.setData(bundle);
            message.what = 2;
            if (System.currentTimeMillis() - ModeSelectionViewNew.this.f15875n < 600) {
                ModeSelectionViewNew.this.f15878q.removeMessages(2);
                ModeSelectionViewNew.this.f15878q.sendMessageDelayed(message, 600);
                return;
            }
            long unused = ModeSelectionViewNew.this.f15875n = System.currentTimeMillis();
            ModeSelectionViewNew.this.f15878q.removeMessages(2);
            ModeSelectionViewNew.this.f15878q.sendMessage(message);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionViewNew$c */
    class C8826c implements C3112v.C3119g {
        C8826c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m20928c() {
            ModeSelectionViewNew.this.f15871j.notifyDataSetChanged();
        }

        /* renamed from: a */
        public void mo23579a(String str) {
        }

        /* renamed from: g */
        public void mo23580g() {
        }

        public void onRefresh() {
        }

        /* renamed from: r */
        public void mo23582r(boolean z, List<C8321m> list) {
            StringBuilder sb = new StringBuilder();
            sb.append("onRefreshRecommend, list number = ");
            sb.append(list.size());
            List unused = ModeSelectionViewNew.this.f15872k = list;
            ModeSelectionViewNew.this.f15862a.post(new C8874c(this));
        }

        /* renamed from: s */
        public void mo23583s(String str) {
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionViewNew$d */
    class C8827d implements TabLayout.OnTabSelectedListener {
        C8827d() {
        }

        public void onTabReselected(TabLayout.Tab tab) {
        }

        public void onTabSelected(TabLayout.Tab tab) {
            int i;
            BrightnessSeekBarView brightnessSeekBarView;
            int i2;
            BrightnessSeekBarView brightnessSeekBarView2;
            C8837l lVar = (C8837l) ModeSelectionViewNew.this.f15876o.get(tab.getPosition());
            ModeSelectionViewNew.this.f15874m.setTabChecked(lVar.f15898a);
            int i3 = lVar.f15898a;
            if (i3 != 0) {
                if (i3 == 1) {
                    ModeSelectionViewNew.this.f15863b.setVisibility(4);
                    ModeSelectionViewNew.this.f15864c.setVisibility(4);
                    ModeSelectionViewNew.this.f15867f.setVisibility(4);
                    ModeSelectionViewNew.this.f15868g.setVisibility(4);
                    if (C11972i.m30704b(ModeSelectionViewNew.this.f15877p.mo23144i1()).mo42547b() == C11972i.m30704b(ModeSelectionViewNew.this.f15877p.mo23144i1()).mo42546a()) {
                        ModeSelectionViewNew.this.f15865d.setVisibility(4);
                        ModeSelectionViewNew.this.f15866e.setVisibility(0);
                    } else {
                        ModeSelectionViewNew.this.f15865d.setVisibility(0);
                        ModeSelectionViewNew.this.f15866e.setVisibility(4);
                        if (AppUtils.f4977a) {
                            ModeSelectionViewNew.this.f15869h.setVisibility(0);
                            ModeSelectionViewNew modeSelectionViewNew = ModeSelectionViewNew.this;
                            modeSelectionViewNew.m20917x(modeSelectionViewNew.f15877p.mo23221d0().mo31607p());
                        }
                    }
                    if ((ModeSelectionViewNew.this.f15877p instanceof WifiDeviceBase) || (ModeSelectionViewNew.this.f15877p instanceof C6119c) || (ModeSelectionViewNew.this.f15877p instanceof C6100g)) {
                        if (ModeSelectionViewNew.this.f15870i == 2) {
                            try {
                                ((C6091a) ModeSelectionViewNew.this.f15877p).mo31659m2(1);
                                ((C6091a) ModeSelectionViewNew.this.f15877p).mo31657k2().mo31678q(DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } else {
                            ModeSelectionViewNew.this.f15877p.mo23150m1(1);
                        }
                    } else if (ModeSelectionViewNew.this.f15877p instanceof C6081a) {
                        if (!ModeSelectionViewNew.this.f15877p.mo23146k1()) {
                            ModeSelectionViewNew.this.f15877p.mo23148l1();
                        }
                        DeviceStatusBase.DeviceMode z = ModeSelectionViewNew.this.f15877p.mo23221d0().mo31627z();
                        ModeSelectionViewNew.this.f15877p.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_SUNSHINE);
                        ModeSelectionViewNew.this.f15877p.mo23152o1(z);
                    }
                    if (ModeSelectionViewNew.this.f15870i == 2) {
                        ModeSelectionViewNew modeSelectionViewNew2 = ModeSelectionViewNew.this;
                        brightnessSeekBarView = modeSelectionViewNew2.f15874m;
                        i = ((C6091a) modeSelectionViewNew2.f15877p).mo31657k2().mo31662a();
                    } else {
                        ModeSelectionViewNew modeSelectionViewNew3 = ModeSelectionViewNew.this;
                        brightnessSeekBarView = modeSelectionViewNew3.f15874m;
                        i = modeSelectionViewNew3.f15877p.mo23221d0().mo31601m();
                    }
                    brightnessSeekBarView.mo36113l(i, true);
                    ModeSelectionViewNew.this.f15874m.setSeekBarColor(-147128);
                    ModeSelectionViewNew.this.f15874m.mo36111j(false);
                } else if (i3 == 2) {
                    ModeSelectionViewNew.this.f15863b.setVisibility(4);
                    ModeSelectionViewNew.this.f15864c.setVisibility(0);
                    ModeSelectionViewNew.this.f15865d.setVisibility(4);
                    ModeSelectionViewNew.this.f15866e.setVisibility(4);
                    ModeSelectionViewNew.this.f15867f.setVisibility(4);
                    ModeSelectionViewNew.this.f15868g.setVisibility(4);
                    if ((ModeSelectionViewNew.this.f15877p instanceof WifiDeviceBase) || (ModeSelectionViewNew.this.f15877p instanceof C6119c)) {
                        if (ModeSelectionViewNew.this.f15870i == 2) {
                            try {
                                ((C6091a) ModeSelectionViewNew.this.f15877p).mo31659m2(2);
                                ((C6091a) ModeSelectionViewNew.this.f15877p).mo31657k2().mo31678q(DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR);
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        } else {
                            ModeSelectionViewNew.this.f15877p.mo23150m1(2);
                        }
                    } else if (ModeSelectionViewNew.this.f15877p instanceof C6081a) {
                        if (!ModeSelectionViewNew.this.f15877p.mo23146k1()) {
                            ModeSelectionViewNew.this.f15877p.mo23148l1();
                        }
                        DeviceStatusBase.DeviceMode z2 = ModeSelectionViewNew.this.f15877p.mo23221d0().mo31627z();
                        ModeSelectionViewNew.this.f15877p.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR);
                        ModeSelectionViewNew.this.f15877p.mo23152o1(z2);
                    }
                    if (ModeSelectionViewNew.this.f15870i == 2) {
                        ModeSelectionViewNew modeSelectionViewNew4 = ModeSelectionViewNew.this;
                        brightnessSeekBarView2 = modeSelectionViewNew4.f15874m;
                        i2 = ((C6091a) modeSelectionViewNew4.f15877p).mo31657k2().mo31662a();
                    } else {
                        ModeSelectionViewNew modeSelectionViewNew5 = ModeSelectionViewNew.this;
                        brightnessSeekBarView2 = modeSelectionViewNew5.f15874m;
                        i2 = modeSelectionViewNew5.f15877p.mo23221d0().mo31601m();
                    }
                    brightnessSeekBarView2.mo36113l(i2, true);
                    ModeSelectionViewNew.this.f15874m.setSeekBarColor(-147128);
                    ModeSelectionViewNew.this.f15874m.mo36111j(false);
                    if (AppUtils.f4977a) {
                        ModeSelectionViewNew.this.f15869h.setVisibility(0);
                        ModeSelectionViewNew modeSelectionViewNew6 = ModeSelectionViewNew.this;
                        modeSelectionViewNew6.m20916w(modeSelectionViewNew6.f15877p.mo23221d0().mo31603n());
                        return;
                    }
                    return;
                } else if (i3 == 3) {
                    ModeSelectionViewNew.this.f15863b.setVisibility(4);
                    ModeSelectionViewNew.this.f15864c.setVisibility(4);
                    ModeSelectionViewNew.this.f15865d.setVisibility(4);
                    ModeSelectionViewNew.this.f15866e.setVisibility(4);
                    ModeSelectionViewNew.this.f15867f.setVisibility(0);
                    ModeSelectionViewNew.this.f15868g.setVisibility(4);
                    if ((ModeSelectionViewNew.this.f15877p instanceof WifiDeviceBase) || (ModeSelectionViewNew.this.f15877p instanceof C6119c) || (ModeSelectionViewNew.this.f15877p instanceof C6100g)) {
                        ModeSelectionViewNew.this.f15877p.mo23150m1(5);
                    }
                    ModeSelectionViewNew.this.f15874m.setSeekBarColor(-9856305);
                    ModeSelectionViewNew.this.f15874m.mo36111j(true);
                } else if (i3 == 4) {
                    ModeSelectionViewNew.this.f15863b.setVisibility(4);
                    ModeSelectionViewNew.this.f15864c.setVisibility(4);
                    ModeSelectionViewNew.this.f15865d.setVisibility(4);
                    ModeSelectionViewNew.this.f15866e.setVisibility(4);
                    ModeSelectionViewNew.this.f15867f.setVisibility(4);
                    ModeSelectionViewNew.this.f15868g.setVisibility(0);
                    ModeSelectionViewNew.this.f15869h.setVisibility(8);
                    ModeSelectionViewNew modeSelectionViewNew7 = ModeSelectionViewNew.this;
                    modeSelectionViewNew7.f15868g.mo36261m(modeSelectionViewNew7.f15877p.mo23221d0().mo31601m());
                    ModeSelectionViewNew.this.f15874m.setSeekBarColor(-147128);
                    ModeSelectionViewNew.this.f15874m.mo36111j(false);
                    return;
                } else if (i3 == 6) {
                    ModeSelectionViewNew.this.f15863b.setVisibility(4);
                    ModeSelectionViewNew.this.f15864c.setVisibility(4);
                    ModeSelectionViewNew.this.f15865d.setVisibility(0);
                    ModeSelectionViewNew.this.f15866e.setVisibility(4);
                    ModeSelectionViewNew.this.f15867f.setVisibility(4);
                    ModeSelectionViewNew.this.f15868g.setVisibility(4);
                    if ((ModeSelectionViewNew.this.f15877p instanceof WifiDeviceBase) || (ModeSelectionViewNew.this.f15877p instanceof C6119c) || (ModeSelectionViewNew.this.f15877p instanceof C6100g)) {
                        ModeSelectionViewNew.this.f15877p.mo23150m1(5);
                    }
                    ModeSelectionViewNew.this.f15874m.setSeekBarColor(-9856305);
                    ModeSelectionViewNew.this.f15874m.mo36111j(true);
                    ModeSelectionViewNew.this.f15869h.setVisibility(0);
                } else {
                    return;
                }
                ModeSelectionViewNew.this.mo36360o();
                return;
            }
            ModeSelectionViewNew.this.f15863b.setVisibility(0);
            ModeSelectionViewNew.this.f15864c.setVisibility(4);
            ModeSelectionViewNew.this.f15865d.setVisibility(4);
            ModeSelectionViewNew.this.f15866e.setVisibility(4);
            ModeSelectionViewNew.this.f15867f.setVisibility(4);
            ModeSelectionViewNew.this.f15868g.setVisibility(4);
            ModeSelectionViewNew.this.f15869h.setVisibility(8);
        }

        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionViewNew$e */
    class C8828e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f15883a;

        C8828e(int i) {
            this.f15883a = i;
        }

        public void run() {
            TextView textView = ModeSelectionViewNew.this.f15869h;
            textView.setText(this.f15883a + "K");
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionViewNew$f */
    class C8829f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f15885a;

        C8829f(String str) {
            this.f15885a = str;
        }

        public void run() {
            ModeSelectionViewNew.this.f15869h.setText(this.f15885a);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionViewNew$g */
    class C8830g implements Runnable {
        C8830g() {
        }

        public void run() {
            Iterator it = ModeSelectionViewNew.this.f15876o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C8837l lVar = (C8837l) it.next();
                if (lVar.mo36380a() == 1) {
                    lVar.mo36382c(ModeSelectionViewNew.this.getResources().getString(R$string.feature_kid_mode));
                    break;
                }
            }
            ModeSelectionViewNew.this.f15865d.setBackgroundResource(R$drawable.icon_yeelight_control_view_kid_mode);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionViewNew$h */
    class C8831h implements Runnable {
        C8831h() {
        }

        public void run() {
            Iterator it = ModeSelectionViewNew.this.f15876o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C8837l lVar = (C8837l) it.next();
                if (lVar.mo36380a() == 1) {
                    lVar.mo36382c(ModeSelectionViewNew.this.getResources().getString(R$string.common_text_white_mode));
                    break;
                }
            }
            ModeSelectionViewNew.this.f15865d.setBackgroundResource(R$drawable.icon_yeelight_control_view_ct);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionViewNew$i */
    class C8832i implements Handler.Callback {
        C8832i() {
        }

        /* JADX WARNING: type inference failed for: r10v1, types: [com.yeelight.yeelib.models.s] */
        /* JADX WARNING: type inference failed for: r10v3, types: [com.yeelight.yeelib.models.s] */
        /* JADX WARNING: type inference failed for: r3v5, types: [com.yeelight.yeelib.models.f] */
        /* JADX WARNING: type inference failed for: r3v6, types: [com.yeelight.yeelib.models.f] */
        /* JADX WARNING: type inference failed for: r3v7, types: [com.yeelight.yeelib.models.g] */
        /* JADX WARNING: type inference failed for: r3v8, types: [com.yeelight.yeelib.models.o] */
        /* JADX WARNING: type inference failed for: r3v9, types: [com.yeelight.yeelib.models.g] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean handleMessage(android.os.Message r10) {
            /*
                r9 = this;
                int r0 = r10.what
                r1 = 1
                r2 = 2
                if (r0 == r1) goto L_0x00c3
                if (r0 == r2) goto L_0x000a
                goto L_0x0144
            L_0x000a:
                android.os.Bundle r10 = r10.getData()
                if (r10 == 0) goto L_0x0144
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r0 = com.yeelight.yeelib.p142ui.view.ModeSelectionViewNew.this
                com.yeelight.yeelib.device.base.e r0 = r0.f15877p
                if (r0 == 0) goto L_0x0144
                java.lang.String r0 = "ct"
                int r8 = r10.getInt(r0)
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r10 = com.yeelight.yeelib.p142ui.view.ModeSelectionViewNew.this
                int r10 = r10.f15870i
                if (r10 != r2) goto L_0x0042
                com.yeelight.yeelib.models.g r10 = new com.yeelight.yeelib.models.g
                r5 = -1
                r6 = 3
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r0 = com.yeelight.yeelib.p142ui.view.ModeSelectionViewNew.this
                com.yeelight.yeelib.device.base.e r0 = r0.f15877p
                com.yeelight.yeelib.device.base.a r0 = (com.yeelight.yeelib.device.base.C6091a) r0
                com.yeelight.yeelib.device.base.b r0 = r0.mo31657k2()
                int r7 = r0.mo31662a()
                java.lang.String r4 = ""
                r3 = r10
                r3.<init>(r4, r5, r6, r7, r8)
                goto L_0x00f9
            L_0x0042:
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r10 = com.yeelight.yeelib.p142ui.view.ModeSelectionViewNew.this
                com.yeelight.yeelib.device.base.e r10 = r10.f15877p
                boolean r10 = r10 instanceof com.yeelight.yeelib.device.base.C6094f
                if (r10 == 0) goto L_0x0060
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r10 = com.yeelight.yeelib.p142ui.view.ModeSelectionViewNew.this
                com.yeelight.yeelib.device.base.e r10 = r10.f15877p
                com.yeelight.yeelib.device.base.DeviceStatusBase r10 = r10.mo23221d0()
                int r10 = r10.mo31601m()
                int r10 = p051j4.C9201q.m22193e(r10)
            L_0x005e:
                r7 = r10
                goto L_0x0090
            L_0x0060:
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r10 = com.yeelight.yeelib.p142ui.view.ModeSelectionViewNew.this
                com.yeelight.yeelib.device.base.e r10 = r10.f15877p
                com.yeelight.yeelib.device.base.DeviceStatusBase r10 = r10.mo23221d0()
                com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r10 = r10.mo31627z()
                com.yeelight.yeelib.device.base.DeviceStatusBase$DeviceMode r0 = com.yeelight.yeelib.device.base.DeviceStatusBase.DeviceMode.DEVICE_MODE_NIGHT_LIGHT
                if (r10 != r0) goto L_0x0081
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r10 = com.yeelight.yeelib.p142ui.view.ModeSelectionViewNew.this
                com.yeelight.yeelib.device.base.e r10 = r10.f15877p
                com.yeelight.yeelib.device.base.DeviceStatusBase r10 = r10.mo23221d0()
                int r10 = r10.mo31536F()
                goto L_0x005e
            L_0x0081:
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r10 = com.yeelight.yeelib.p142ui.view.ModeSelectionViewNew.this
                com.yeelight.yeelib.device.base.e r10 = r10.f15877p
                com.yeelight.yeelib.device.base.DeviceStatusBase r10 = r10.mo23221d0()
                int r10 = r10.mo31601m()
                goto L_0x005e
            L_0x0090:
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r10 = com.yeelight.yeelib.p142ui.view.ModeSelectionViewNew.this
                java.util.ArrayList r10 = r10.f15876o
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r0 = com.yeelight.yeelib.p142ui.view.ModeSelectionViewNew.this
                com.google.android.material.tabs.TabLayout r0 = r0.f15862a
                int r0 = r0.getSelectedTabPosition()
                java.lang.Object r10 = r10.get(r0)
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew$l r10 = (com.yeelight.yeelib.p142ui.view.ModeSelectionViewNew.C8837l) r10
                int r10 = r10.f15898a
                r0 = 6
                if (r10 != r0) goto L_0x00b7
                com.yeelight.yeelib.models.o r10 = new com.yeelight.yeelib.models.o
                r5 = -1
                r6 = 10
                r7 = -1
                java.lang.String r4 = ""
                r3 = r10
                r3.<init>(r4, r5, r6, r7, r8)
                goto L_0x013b
            L_0x00b7:
                com.yeelight.yeelib.models.g r10 = new com.yeelight.yeelib.models.g
                r5 = -1
                r6 = 3
                java.lang.String r4 = ""
                r3 = r10
                r3.<init>(r4, r5, r6, r7, r8)
                goto L_0x013b
            L_0x00c3:
                android.os.Bundle r10 = r10.getData()
                if (r10 == 0) goto L_0x0144
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r0 = com.yeelight.yeelib.p142ui.view.ModeSelectionViewNew.this
                com.yeelight.yeelib.device.base.e r0 = r0.f15877p
                if (r0 == 0) goto L_0x0144
                java.lang.String r0 = "color"
                int r8 = r10.getInt(r0)
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r10 = com.yeelight.yeelib.p142ui.view.ModeSelectionViewNew.this
                int r10 = r10.f15870i
                if (r10 != r2) goto L_0x0105
                com.yeelight.yeelib.models.f r10 = new com.yeelight.yeelib.models.f
                r5 = -1
                r6 = 2
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r0 = com.yeelight.yeelib.p142ui.view.ModeSelectionViewNew.this
                com.yeelight.yeelib.device.base.e r0 = r0.f15877p
                com.yeelight.yeelib.device.base.a r0 = (com.yeelight.yeelib.device.base.C6091a) r0
                com.yeelight.yeelib.device.base.b r0 = r0.mo31657k2()
                int r7 = r0.mo31662a()
                java.lang.String r4 = ""
                r3 = r10
                r3.<init>(r4, r5, r6, r7, r8)
            L_0x00f9:
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r0 = com.yeelight.yeelib.p142ui.view.ModeSelectionViewNew.this
                com.yeelight.yeelib.device.base.e r0 = r0.f15877p
                com.yeelight.yeelib.device.base.a r0 = (com.yeelight.yeelib.device.base.C6091a) r0
                r0.mo31661o2(r10)
                goto L_0x0144
            L_0x0105:
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r10 = com.yeelight.yeelib.p142ui.view.ModeSelectionViewNew.this
                com.yeelight.yeelib.device.base.e r10 = r10.f15877p
                boolean r10 = r10 instanceof com.yeelight.yeelib.device.base.C6094f
                if (r10 == 0) goto L_0x0122
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r10 = com.yeelight.yeelib.p142ui.view.ModeSelectionViewNew.this
                com.yeelight.yeelib.device.base.e r10 = r10.f15877p
                com.yeelight.yeelib.device.base.DeviceStatusBase r10 = r10.mo23221d0()
                int r10 = r10.mo31601m()
                int r10 = p051j4.C9201q.m22193e(r10)
                goto L_0x0130
            L_0x0122:
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r10 = com.yeelight.yeelib.p142ui.view.ModeSelectionViewNew.this
                com.yeelight.yeelib.device.base.e r10 = r10.f15877p
                com.yeelight.yeelib.device.base.DeviceStatusBase r10 = r10.mo23221d0()
                int r10 = r10.mo31601m()
            L_0x0130:
                r7 = r10
                com.yeelight.yeelib.models.f r10 = new com.yeelight.yeelib.models.f
                r5 = -1
                r6 = 2
                java.lang.String r4 = ""
                r3 = r10
                r3.<init>(r4, r5, r6, r7, r8)
            L_0x013b:
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r0 = com.yeelight.yeelib.p142ui.view.ModeSelectionViewNew.this
                com.yeelight.yeelib.device.base.e r0 = r0.f15877p
                r0.mo23168x1(r10)
            L_0x0144:
                r10 = 0
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p142ui.view.ModeSelectionViewNew.C8832i.handleMessage(android.os.Message):boolean");
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionViewNew$j */
    private class C8833j extends BaseAdapter {

        /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionViewNew$j$a */
        class C8834a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C8321m f15891a;

            /* renamed from: b */
            final /* synthetic */ C8836k f15892b;

            /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionViewNew$j$a$a */
            class C8835a implements Animation.AnimationListener {
                C8835a() {
                }

                public void onAnimationEnd(Animation animation) {
                    C8834a.this.f15892b.f15896b.setVisibility(8);
                }

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }
            }

            C8834a(C8321m mVar, C8836k kVar) {
                this.f15891a = mVar;
                this.f15892b = kVar;
            }

            public void onClick(View view) {
                if (ModeSelectionViewNew.this.f15870i == 2) {
                    ((C6091a) ModeSelectionViewNew.this.f15877p).mo31661o2(this.f15891a);
                } else {
                    ModeSelectionViewNew.this.f15877p.mo23168x1(this.f15891a);
                }
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(100);
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation2.setDuration(300);
                alphaAnimation2.setStartOffset(200);
                animationSet.addAnimation(alphaAnimation);
                animationSet.addAnimation(alphaAnimation2);
                this.f15892b.f15896b.setVisibility(0);
                animationSet.setAnimationListener(new C8835a());
                this.f15892b.f15896b.startAnimation(animationSet);
            }
        }

        private C8833j() {
        }

        /* synthetic */ C8833j(ModeSelectionViewNew modeSelectionViewNew, C8824a aVar) {
            this();
        }

        /* renamed from: a */
        public C8321m mo36371a(int i) {
            if (ModeSelectionViewNew.this.f15872k == null || ModeSelectionViewNew.this.f15872k.size() <= i || i < 0) {
                return null;
            }
            return (C8321m) ModeSelectionViewNew.this.f15872k.get(i);
        }

        public int getCount() {
            return ModeSelectionViewNew.this.f15872k.size();
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C8836k kVar;
            if (view == null) {
                kVar = new C8836k(ModeSelectionViewNew.this, (C8824a) null);
                view2 = LayoutInflater.from(ModeSelectionViewNew.this.getContext()).inflate(R$layout.recommend_scene_layout, (ViewGroup) null);
                view2.setTag(kVar);
            } else {
                view2 = view;
                kVar = (C8836k) view.getTag();
            }
            kVar.f15895a = (ImageView) view2.findViewById(R$id.scene_img);
            kVar.f15897c = (TextView) view2.findViewById(R$id.scene_name);
            kVar.f15896b = (ImageView) view2.findViewById(R$id.scene_img_action_callback);
            C8321m a = mo36371a(i);
            if (a != null) {
                kVar.f15897c.setText(a.mo35450q());
                kVar.f15895a.setBackgroundResource(C9195n.m22164a(4, a.mo35452s()));
                view2.setOnClickListener(new C8834a(a, kVar));
            }
            return view2;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionViewNew$k */
    private class C8836k {

        /* renamed from: a */
        public ImageView f15895a;

        /* renamed from: b */
        public ImageView f15896b;

        /* renamed from: c */
        public TextView f15897c;

        private C8836k(ModeSelectionViewNew modeSelectionViewNew) {
        }

        /* synthetic */ C8836k(ModeSelectionViewNew modeSelectionViewNew, C8824a aVar) {
            this(modeSelectionViewNew);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionViewNew$l */
    public class C8837l {

        /* renamed from: a */
        int f15898a;

        /* renamed from: b */
        String f15899b;

        C8837l(ModeSelectionViewNew modeSelectionViewNew, int i, String str) {
            this.f15898a = i;
            this.f15899b = str;
        }

        /* renamed from: a */
        public int mo36380a() {
            return this.f15898a;
        }

        /* renamed from: b */
        public String mo36381b() {
            return this.f15899b;
        }

        /* renamed from: c */
        public void mo36382c(String str) {
            this.f15899b = str;
        }
    }

    public ModeSelectionViewNew(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo36364u(context);
    }

    /* renamed from: b */
    private void m20901b(TabLayout tabLayout, int i, int i2) {
        tabLayout.setTabMode(i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C9193k.m22151b(this.f15873l, 44.0f));
        int b = C9193k.m22151b(this.f15873l, (float) i2);
        layoutParams.setMargins(b, 0, b, 0);
        tabLayout.setLayoutParams(layoutParams);
    }

    /* renamed from: r */
    private void m20913r() {
        String i1 = this.f15877p.mo23144i1();
        if (TextUtils.isEmpty(i1)) {
            AppUtils.m8300u(f15861r, "model can't be null!");
            return;
        }
        i1.hashCode();
        if (i1.equals("yeelink.light.ceiling10")) {
            i1 = "yeelink.light.ceiling10x";
        } else if (i1.equals("yeelink.light.ceiling4")) {
            i1 = "yeelink.light.ceiling4x";
        }
        C3112v.m8242u().mo23561l(i1, new C8826c());
    }

    /* renamed from: s */
    private void m20914s() {
        TabLayout tabLayout;
        int i;
        if (this.f15876o.size() == 1) {
            this.f15862a.setVisibility(8);
        } else {
            if (this.f15876o.size() == 2) {
                tabLayout = this.f15862a;
                i = 70;
            } else if (this.f15876o.size() == 3) {
                tabLayout = this.f15862a;
                i = 25;
            } else if (this.f15876o.size() == 4) {
                tabLayout = this.f15862a;
                i = 15;
            } else {
                m20901b(this.f15862a, 0, 0);
                C9206w.m22206a(this.f15862a);
            }
            m20901b(tabLayout, 1, i);
        }
        for (int i2 = 0; i2 < this.f15876o.size(); i2++) {
            TabLayout.Tab newTab = this.f15862a.newTab();
            newTab.setText((CharSequence) this.f15876o.get(i2).mo36381b());
            this.f15862a.addTab(newTab);
        }
        m20915t();
    }

    /* renamed from: t */
    private void m20915t() {
        this.f15862a.setOnTabSelectedListener(new C8827d());
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m20916w(int i) {
        if (AppUtils.f4977a) {
            float[] fArr = new float[3];
            Color.colorToHSV(i, fArr);
            fArr[2] = C9188d.m22130a(this.f15877p.mo23221d0().mo31601m());
            fArr[0] = ((float) Math.round(fArr[0] * 100.0f)) / 100.0f;
            fArr[1] = ((float) Math.round(fArr[1] * 100.0f)) / 100.0f;
            fArr[2] = ((float) Math.round(fArr[2] * 100.0f)) / 100.0f;
            this.f15864c.post(new C8829f("R: " + ((float) Color.red(i)) + "  G: " + ((float) Color.green(i)) + " B: " + ((float) Color.blue(i)) + "\nH: " + fArr[0] + " S: " + fArr[1] + " V: " + fArr[2]));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m20917x(int i) {
        if (AppUtils.f4977a) {
            this.f15865d.post(new C8828e(i));
        }
    }

    /* renamed from: a */
    public void mo36130a(int i) {
        this.f15868g.mo36260l(i);
    }

    /* renamed from: n */
    public void mo36359n() {
        GradientView gradientView;
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append("initColorGradientView!! device cap model: ");
        sb.append(this.f15877p.mo23144i1());
        C3012e eVar = this.f15877p;
        if (!(eVar instanceof C6091a) || this.f15870i != 2) {
            gradientView = this.f15864c;
            i = eVar.mo23221d0().mo31603n();
        } else {
            gradientView = this.f15864c;
            i = ((C6091a) eVar).mo31657k2().mo31663b();
        }
        gradientView.mo36283h((float) i);
        m20916w(this.f15877p.mo23221d0().mo31603n());
    }

    /* renamed from: o */
    public void mo36360o() {
        int i;
        C11972i.C11973a aVar;
        StringBuilder sb = new StringBuilder();
        sb.append("initCtGradientView!! device cap model: ");
        sb.append(this.f15877p.mo23144i1());
        int B = this.f15876o.get(this.f15862a.getSelectedTabPosition()).f15898a == 6 ? this.f15877p.mo23221d0().mo31528B() : this.f15877p.mo23221d0().mo31607p();
        C3012e eVar = this.f15877p;
        if (!(eVar instanceof C6091a) || this.f15870i != 2) {
            aVar = C11972i.m30704b(eVar.mo23144i1());
            C3012e eVar2 = this.f15877p;
            if (((eVar2 instanceof C11311k0) || (eVar2 instanceof C10595a0)) && eVar2.mo23221d0().mo31572X()) {
                aVar = C11972i.m30708f(this.f15877p.mo23208T());
            }
            if (!(aVar == null || aVar.mo42546a() == aVar.mo42547b())) {
                i = B - aVar.mo42547b();
            }
            m20917x(B);
        }
        aVar = C11972i.m30704b("yeelink.light.ceiling4.ambi");
        if (aVar.mo42546a() != aVar.mo42547b()) {
            i = ((C6091a) this.f15877p).mo31657k2().mo31664c() - aVar.mo42547b();
        }
        m20917x(B);
        this.f15865d.mo36283h(((float) i) / ((float) (aVar.mo42546a() - aVar.mo42547b())));
        m20917x(B);
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        Runnable runnable;
        GradientView gradientView;
        boolean z = System.currentTimeMillis() - this.f15875n > 2000;
        if (i != 16) {
            if (i != 32) {
                if (i == 4096) {
                    C3012e eVar = this.f15877p;
                    if (!(eVar instanceof C11311k0) || !eVar.mo23221d0().mo31572X()) {
                        gradientView = this.f15865d;
                        runnable = new C8831h();
                    } else {
                        gradientView = this.f15865d;
                        runnable = new C8830g();
                    }
                    gradientView.post(runnable);
                }
            } else if (this.f15865d.getVisibility() != 0 || z) {
                mo36360o();
            }
        } else if (this.f15864c.getVisibility() != 0 || z) {
            mo36359n();
        }
    }

    /* renamed from: p */
    public void mo30241p(int i, C6092b bVar) {
        boolean z = System.currentTimeMillis() - this.f15875n > 2000;
        if (i != 16) {
            if (i == 32) {
                if (this.f15865d.getVisibility() != 0 || z) {
                    mo36360o();
                }
            }
        } else if (this.f15864c.getVisibility() != 0 || z) {
            mo36359n();
        }
    }

    /* renamed from: q */
    public void mo36361q(String str, int i) {
        C8837l lVar;
        ArrayList<C8837l> arrayList;
        this.f15876o.clear();
        this.f15862a.removeAllTabs();
        this.f15877p = YeelightDeviceManager.m7804r0(str);
        this.f15870i = i;
        m20913r();
        this.f15865d.setBackgroundResource(R$drawable.icon_yeelight_control_view_ct);
        this.f15877p.mo23178B0(this);
        ((C6091a) this.f15877p).mo31657k2().mo31670i(this);
        this.f15876o.add(new C8837l(this, 0, getResources().getString(R$string.scene_recommend)));
        ProductModelBase I = this.f15877p.mo23188I();
        if (i == 1) {
            ProductModelBase.CapabilityType capabilityType = ProductModelBase.CapabilityType.MOON_TAB;
            this.f15876o.add(new C8837l(this, 1, (I.mo31881b(capabilityType) || I.mo31881b(ProductModelBase.CapabilityType.MOON_WITH_CT_TAB)) ? getResources().getString(R$string.common_text_day) : getResources().getText(R$string.common_text_light_mode_white).toString()));
            if (I.mo31881b(capabilityType)) {
                this.f15876o.add(new C8837l(this, 3, getResources().getString(R$string.common_text_night_light)));
            }
            if (I.mo31881b(ProductModelBase.CapabilityType.MOON_WITH_CT_TAB)) {
                arrayList = this.f15876o;
                lVar = new C8837l(this, 6, getResources().getString(R$string.common_text_night_light));
            }
            m20914s();
            mo36360o();
            mo36359n();
        }
        this.f15876o.add(new C8837l(this, 1, getResources().getString(R$string.common_text_light_mode_white)));
        arrayList = this.f15876o;
        lVar = new C8837l(this, 2, getResources().getString(R$string.common_text_colors));
        arrayList.add(lVar);
        m20914s();
        mo36360o();
        mo36359n();
    }

    public void setBrightnessSeekbarView(BrightnessSeekBarView brightnessSeekBarView) {
        this.f15874m = brightnessSeekBarView;
        brightnessSeekBarView.mo36107g(this);
    }

    public void setDeviceId(String str) {
        int i;
        Resources resources;
        String charSequence;
        GradientView gradientView;
        int i2;
        this.f15868g.setDevice(str);
        this.f15876o.clear();
        this.f15862a.removeAllTabs();
        C3012e r0 = YeelightDeviceManager.m7804r0(str);
        this.f15877p = r0;
        if (r0 != null) {
            m20913r();
            ProductModelBase I = this.f15877p.mo23188I();
            C3012e eVar = this.f15877p;
            if (((eVar instanceof C11311k0) || (eVar instanceof C10595a0)) && eVar.mo23221d0().mo31572X()) {
                charSequence = getResources().getText(R$string.feature_kid_mode).toString();
                gradientView = this.f15865d;
                i2 = R$drawable.icon_yeelight_control_view_kid_mode;
            } else {
                if (I.mo31881b(ProductModelBase.CapabilityType.MOON_TAB) || I.mo31881b(ProductModelBase.CapabilityType.MOON_WITH_CT_TAB)) {
                    resources = getResources();
                    i = R$string.common_text_day;
                } else {
                    resources = getResources();
                    i = R$string.common_text_light_mode_white;
                }
                charSequence = resources.getText(i).toString();
                gradientView = this.f15865d;
                i2 = R$drawable.icon_yeelight_control_view_ct;
            }
            gradientView.setBackgroundResource(i2);
            this.f15877p.mo23178B0(this);
            this.f15876o.add(new C8837l(this, 0, getResources().getString(R$string.scene_recommend)));
            if (I.mo31881b(ProductModelBase.CapabilityType.CT_TAB)) {
                this.f15876o.add(new C8837l(this, 1, charSequence));
            }
            if (I.mo31881b(ProductModelBase.CapabilityType.COLOR_TAB)) {
                this.f15876o.add(new C8837l(this, 2, getResources().getString(R$string.common_text_colors)));
            }
            if (I.mo31881b(ProductModelBase.CapabilityType.MOON_TAB)) {
                this.f15876o.add(new C8837l(this, 3, getResources().getString(R$string.common_text_night_light)));
            }
            if (I.mo31881b(ProductModelBase.CapabilityType.MOON_WITH_CT_TAB)) {
                this.f15876o.add(new C8837l(this, 6, getResources().getString(R$string.common_text_night_light)));
            }
            if (I.mo31881b(ProductModelBase.CapabilityType.FLOW_TAB)) {
                this.f15876o.add(new C8837l(this, 4, getResources().getString(R$string.common_text_flow_mode)));
            }
            m20914s();
            mo36360o();
            mo36359n();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo36364u(Context context) {
        LayoutInflater.from(context).inflate(R$layout.widget_mode_seletion_view_new, this, true);
        this.f15862a = (TabLayout) findViewById(R$id.tabLayout);
        this.f15863b = (GridView) findViewById(R$id.recommend_scene_grid_view);
        this.f15864c = (GradientView) findViewById(R$id.color_gradient_view);
        this.f15865d = (GradientView) findViewById(R$id.ct_gradient_view);
        this.f15866e = (FrameLayout) findViewById(R$id.sun_mode_layout);
        this.f15867f = (FrameLayout) findViewById(R$id.moon_mode_layout);
        this.f15868g = (FlowSettingView) findViewById(R$id.flow_mode_layout);
        this.f15869h = (TextView) findViewById(R$id.text_current_color);
        C8833j jVar = new C8833j(this, (C8824a) null);
        this.f15871j = jVar;
        this.f15863b.setAdapter(jVar);
        this.f15873l = context;
        this.f15864c.setOnColorChangedListener(new C8824a());
        this.f15865d.setOnCtChangedListener(new C8825b());
    }

    /* renamed from: v */
    public void mo36365v() {
        C3012e eVar = this.f15877p;
        if (eVar != null) {
            eVar.mo23213W0(this);
        }
        if (this.f15870i != -1) {
            ((C6091a) this.f15877p).mo31657k2().mo31680s(this);
        }
    }
}

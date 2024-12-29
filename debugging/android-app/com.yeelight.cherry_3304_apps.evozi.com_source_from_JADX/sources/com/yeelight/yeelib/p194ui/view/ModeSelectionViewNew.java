package com.yeelight.yeelib.p194ui.view;

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
import com.yeelight.yeelib.device.models.C7628j;
import com.yeelight.yeelib.device.models.C7632k;
import com.yeelight.yeelib.p150c.C5972a;
import com.yeelight.yeelib.p150c.C5980c;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6017a;
import com.yeelight.yeelib.p150c.p151i.C6018b;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6050n;
import com.yeelight.yeelib.p150c.p183m.C6895j0;
import com.yeelight.yeelib.p150c.p183m.C7497z;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p153g.C4300b0;
import com.yeelight.yeelib.p153g.C9849r;
import com.yeelight.yeelib.p186e.C9767b;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.view.BrightnessSeekBarView;
import com.yeelight.yeelib.p194ui.view.GradientView;
import com.yeelight.yeelib.utils.C10542f;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C10549p;
import com.yeelight.yeelib.utils.C10560x;
import com.yeelight.yeelib.utils.C4308b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionViewNew */
public class ModeSelectionViewNew extends LinearLayout implements C9770e, C9767b, BrightnessSeekBarView.C10403k {

    /* renamed from: r */
    private static final String f19603r = ModeSelectionViewNew.class.getSimpleName();

    /* renamed from: a */
    TabLayout f19604a;

    /* renamed from: b */
    GridView f19605b;

    /* renamed from: c */
    GradientView f19606c;

    /* renamed from: d */
    GradientView f19607d;

    /* renamed from: e */
    FrameLayout f19608e;

    /* renamed from: f */
    FrameLayout f19609f;

    /* renamed from: g */
    FlowSettingView f19610g;

    /* renamed from: h */
    TextView f19611h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f19612i = -1;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C10456j f19613j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public List<C9849r> f19614k = new ArrayList();

    /* renamed from: l */
    private Context f19615l;

    /* renamed from: m */
    BrightnessSeekBarView f19616m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public long f19617n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public ArrayList<C10460l> f19618o = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C4200i f19619p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Handler f19620q = new Handler(new C10455i());

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionViewNew$a */
    class C10447a implements GradientView.C10431b {
        C10447a() {
        }

        /* renamed from: a */
        public void mo32937a(GradientView gradientView, int i) {
            Message message = new Message();
            Bundle bundle = new Bundle();
            bundle.putInt("color", i);
            message.setData(bundle);
            message.what = 1;
            ModeSelectionViewNew.this.m25305w(i);
            if (System.currentTimeMillis() - ModeSelectionViewNew.this.f19617n < 600) {
                ModeSelectionViewNew.this.f19620q.removeMessages(1);
                ModeSelectionViewNew.this.f19620q.sendMessageDelayed(message, 600);
                return;
            }
            long unused = ModeSelectionViewNew.this.f19617n = System.currentTimeMillis();
            ModeSelectionViewNew.this.f19620q.removeMessages(1);
            ModeSelectionViewNew.this.f19620q.sendMessage(message);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionViewNew$b */
    class C10448b implements GradientView.C10432c {
        C10448b() {
        }

        /* renamed from: a */
        public void mo32938a(GradientView gradientView, float f) {
            Message message = new Message();
            Bundle bundle = new Bundle();
            C7632k.C7633a b = C7632k.m22541b(ModeSelectionViewNew.this.f19619p.mo23330i1());
            int i = 0;
            if (((ModeSelectionViewNew.this.f19619p instanceof C6895j0) || (ModeSelectionViewNew.this.f19619p instanceof C7497z)) && ModeSelectionViewNew.this.f19619p.mo23408d0().mo27671W()) {
                b = C7632k.m22545f(ModeSelectionViewNew.this.f19619p.mo23395T());
            }
            if (b != null) {
                i = b.mo29080b() + ((int) (((float) (b.mo29079a() - b.mo29080b())) * f));
            }
            ModeSelectionViewNew.this.m25306x(i);
            bundle.putInt("ct", i);
            message.setData(bundle);
            message.what = 2;
            int i2 = ((System.currentTimeMillis() - ModeSelectionViewNew.this.f19617n) > 600 ? 1 : ((System.currentTimeMillis() - ModeSelectionViewNew.this.f19617n) == 600 ? 0 : -1));
            ModeSelectionViewNew modeSelectionViewNew = ModeSelectionViewNew.this;
            if (i2 < 0) {
                modeSelectionViewNew.f19620q.removeMessages(2);
                ModeSelectionViewNew.this.f19620q.sendMessageDelayed(message, 600);
                return;
            }
            long unused = modeSelectionViewNew.f19617n = System.currentTimeMillis();
            ModeSelectionViewNew.this.f19620q.removeMessages(2);
            ModeSelectionViewNew.this.f19620q.sendMessage(message);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionViewNew$c */
    class C10449c implements C4300b0.C4307g {
        C10449c() {
        }

        /* renamed from: a */
        public void mo23766a(String str) {
        }

        /* renamed from: b */
        public /* synthetic */ void mo32996b() {
            ModeSelectionViewNew.this.f19613j.notifyDataSetChanged();
        }

        /* renamed from: f */
        public void mo23767f() {
        }

        /* renamed from: n */
        public void mo23768n(boolean z, List<C9849r> list) {
            "onRefreshRecommend, list number = " + list.size();
            List unused = ModeSelectionViewNew.this.f19614k = list;
            ModeSelectionViewNew.this.f19604a.post(new C10492a(this));
        }

        public void onRefresh() {
        }

        /* renamed from: p */
        public void mo23770p(String str) {
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionViewNew$d */
    class C10450d implements TabLayout.OnTabSelectedListener {
        C10450d() {
        }

        public void onTabReselected(TabLayout.Tab tab) {
        }

        public void onTabSelected(TabLayout.Tab tab) {
            int i;
            BrightnessSeekBarView brightnessSeekBarView;
            int i2;
            BrightnessSeekBarView brightnessSeekBarView2;
            C10460l lVar = (C10460l) ModeSelectionViewNew.this.f19618o.get(tab.getPosition());
            ModeSelectionViewNew.this.f19616m.setTabChecked(lVar.f19640a);
            int i3 = lVar.f19640a;
            if (i3 != 0) {
                if (i3 == 1) {
                    ModeSelectionViewNew.this.f19605b.setVisibility(4);
                    ModeSelectionViewNew.this.f19606c.setVisibility(4);
                    ModeSelectionViewNew.this.f19609f.setVisibility(4);
                    ModeSelectionViewNew.this.f19610g.setVisibility(4);
                    if (C7632k.m22541b(ModeSelectionViewNew.this.f19619p.mo23330i1()).mo29080b() == C7632k.m22541b(ModeSelectionViewNew.this.f19619p.mo23330i1()).mo29079a()) {
                        ModeSelectionViewNew.this.f19607d.setVisibility(4);
                        ModeSelectionViewNew.this.f19608e.setVisibility(0);
                    } else {
                        ModeSelectionViewNew.this.f19607d.setVisibility(0);
                        ModeSelectionViewNew.this.f19608e.setVisibility(4);
                        if (C4308b.f7482a) {
                            ModeSelectionViewNew.this.f19611h.setVisibility(0);
                            ModeSelectionViewNew modeSelectionViewNew = ModeSelectionViewNew.this;
                            modeSelectionViewNew.m25306x(modeSelectionViewNew.f19619p.mo23408d0().mo27706p());
                        }
                    }
                    if ((ModeSelectionViewNew.this.f19619p instanceof C6006h) || (ModeSelectionViewNew.this.f19619p instanceof C5980c) || (ModeSelectionViewNew.this.f19619p instanceof C6050n)) {
                        if (ModeSelectionViewNew.this.f19612i == 2) {
                            try {
                                ((C6017a) ModeSelectionViewNew.this.f19619p).mo27593m2(1);
                                ((C6017a) ModeSelectionViewNew.this.f19619p).mo27591k2().mo27612q(C6024e.C6028d.DEVICE_MODE_SUNSHINE);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } else {
                            ModeSelectionViewNew.this.f19619p.mo23336m1(1);
                        }
                    } else if (ModeSelectionViewNew.this.f19619p instanceof C5972a) {
                        if (!ModeSelectionViewNew.this.f19619p.mo23332k1()) {
                            ModeSelectionViewNew.this.f19619p.mo23334l1();
                        }
                        C6024e.C6028d z = ModeSelectionViewNew.this.f19619p.mo23408d0().mo27726z();
                        ModeSelectionViewNew.this.f19619p.mo23352w1(C6024e.C6028d.DEVICE_MODE_SUNSHINE);
                        ModeSelectionViewNew.this.f19619p.mo23338o1(z);
                    }
                    if (ModeSelectionViewNew.this.f19612i == 2) {
                        ModeSelectionViewNew modeSelectionViewNew2 = ModeSelectionViewNew.this;
                        brightnessSeekBarView = modeSelectionViewNew2.f19616m;
                        i = ((C6017a) modeSelectionViewNew2.f19619p).mo27591k2().mo27596a();
                    } else {
                        ModeSelectionViewNew modeSelectionViewNew3 = ModeSelectionViewNew.this;
                        brightnessSeekBarView = modeSelectionViewNew3.f19616m;
                        i = modeSelectionViewNew3.f19619p.mo23408d0().mo27700m();
                    }
                    brightnessSeekBarView.mo32743l(i, true);
                } else if (i3 == 2) {
                    ModeSelectionViewNew.this.f19605b.setVisibility(4);
                    ModeSelectionViewNew.this.f19606c.setVisibility(0);
                    ModeSelectionViewNew.this.f19607d.setVisibility(4);
                    ModeSelectionViewNew.this.f19608e.setVisibility(4);
                    ModeSelectionViewNew.this.f19609f.setVisibility(4);
                    ModeSelectionViewNew.this.f19610g.setVisibility(4);
                    if ((ModeSelectionViewNew.this.f19619p instanceof C6006h) || (ModeSelectionViewNew.this.f19619p instanceof C5980c)) {
                        if (ModeSelectionViewNew.this.f19612i == 2) {
                            try {
                                ((C6017a) ModeSelectionViewNew.this.f19619p).mo27593m2(2);
                                ((C6017a) ModeSelectionViewNew.this.f19619p).mo27591k2().mo27612q(C6024e.C6028d.DEVICE_MODE_COLOR);
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        } else {
                            ModeSelectionViewNew.this.f19619p.mo23336m1(2);
                        }
                    } else if (ModeSelectionViewNew.this.f19619p instanceof C5972a) {
                        if (!ModeSelectionViewNew.this.f19619p.mo23332k1()) {
                            ModeSelectionViewNew.this.f19619p.mo23334l1();
                        }
                        C6024e.C6028d z2 = ModeSelectionViewNew.this.f19619p.mo23408d0().mo27726z();
                        ModeSelectionViewNew.this.f19619p.mo23352w1(C6024e.C6028d.DEVICE_MODE_COLOR);
                        ModeSelectionViewNew.this.f19619p.mo23338o1(z2);
                    }
                    if (ModeSelectionViewNew.this.f19612i == 2) {
                        ModeSelectionViewNew modeSelectionViewNew4 = ModeSelectionViewNew.this;
                        brightnessSeekBarView2 = modeSelectionViewNew4.f19616m;
                        i2 = ((C6017a) modeSelectionViewNew4.f19619p).mo27591k2().mo27596a();
                    } else {
                        ModeSelectionViewNew modeSelectionViewNew5 = ModeSelectionViewNew.this;
                        brightnessSeekBarView2 = modeSelectionViewNew5.f19616m;
                        i2 = modeSelectionViewNew5.f19619p.mo23408d0().mo27700m();
                    }
                    brightnessSeekBarView2.mo32743l(i2, true);
                    ModeSelectionViewNew.this.f19616m.setSeekBarColor(-147128);
                    ModeSelectionViewNew.this.f19616m.mo32741j(false);
                    if (C4308b.f7482a) {
                        ModeSelectionViewNew.this.f19611h.setVisibility(0);
                        ModeSelectionViewNew modeSelectionViewNew6 = ModeSelectionViewNew.this;
                        modeSelectionViewNew6.m25305w(modeSelectionViewNew6.f19619p.mo23408d0().mo27702n());
                        return;
                    }
                    return;
                } else if (i3 == 3) {
                    ModeSelectionViewNew.this.f19605b.setVisibility(4);
                    ModeSelectionViewNew.this.f19606c.setVisibility(4);
                    ModeSelectionViewNew.this.f19607d.setVisibility(4);
                    ModeSelectionViewNew.this.f19608e.setVisibility(4);
                    ModeSelectionViewNew.this.f19609f.setVisibility(0);
                    ModeSelectionViewNew.this.f19610g.setVisibility(4);
                    if ((ModeSelectionViewNew.this.f19619p instanceof C6006h) || (ModeSelectionViewNew.this.f19619p instanceof C5980c) || (ModeSelectionViewNew.this.f19619p instanceof C6050n)) {
                        ModeSelectionViewNew.this.f19619p.mo23336m1(5);
                    }
                    ModeSelectionViewNew.this.f19616m.setSeekBarColor(-9856305);
                    ModeSelectionViewNew.this.f19616m.mo32741j(true);
                } else if (i3 == 4) {
                    ModeSelectionViewNew.this.f19605b.setVisibility(4);
                    ModeSelectionViewNew.this.f19606c.setVisibility(4);
                    ModeSelectionViewNew.this.f19607d.setVisibility(4);
                    ModeSelectionViewNew.this.f19608e.setVisibility(4);
                    ModeSelectionViewNew.this.f19609f.setVisibility(4);
                    ModeSelectionViewNew.this.f19610g.setVisibility(0);
                    ModeSelectionViewNew.this.f19611h.setVisibility(8);
                    ModeSelectionViewNew modeSelectionViewNew7 = ModeSelectionViewNew.this;
                    modeSelectionViewNew7.f19610g.mo32891m(modeSelectionViewNew7.f19619p.mo23408d0().mo27700m());
                } else {
                    return;
                }
                ModeSelectionViewNew.this.f19616m.setSeekBarColor(-147128);
                ModeSelectionViewNew.this.f19616m.mo32741j(false);
                return;
            }
            ModeSelectionViewNew.this.f19605b.setVisibility(0);
            ModeSelectionViewNew.this.f19606c.setVisibility(4);
            ModeSelectionViewNew.this.f19607d.setVisibility(4);
            ModeSelectionViewNew.this.f19608e.setVisibility(4);
            ModeSelectionViewNew.this.f19609f.setVisibility(4);
            ModeSelectionViewNew.this.f19610g.setVisibility(4);
            ModeSelectionViewNew.this.f19611h.setVisibility(8);
        }

        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionViewNew$e */
    class C10451e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f19625a;

        C10451e(int i) {
            this.f19625a = i;
        }

        public void run() {
            TextView textView = ModeSelectionViewNew.this.f19611h;
            textView.setText(this.f19625a + "K");
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionViewNew$f */
    class C10452f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f19627a;

        C10452f(String str) {
            this.f19627a = str;
        }

        public void run() {
            ModeSelectionViewNew.this.f19611h.setText(this.f19627a);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionViewNew$g */
    class C10453g implements Runnable {
        C10453g() {
        }

        public void run() {
            Iterator it = ModeSelectionViewNew.this.f19618o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C10460l lVar = (C10460l) it.next();
                if (lVar.mo33011a() == 1) {
                    lVar.mo33013c(ModeSelectionViewNew.this.getResources().getString(R$string.feature_kid_mode));
                    break;
                }
            }
            ModeSelectionViewNew.this.f19607d.setBackgroundResource(R$drawable.icon_yeelight_control_view_kid_mode);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionViewNew$h */
    class C10454h implements Runnable {
        C10454h() {
        }

        public void run() {
            Iterator it = ModeSelectionViewNew.this.f19618o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C10460l lVar = (C10460l) it.next();
                if (lVar.mo33011a() == 1) {
                    lVar.mo33013c(ModeSelectionViewNew.this.getResources().getString(R$string.common_text_white_mode));
                    break;
                }
            }
            ModeSelectionViewNew.this.f19607d.setBackgroundResource(R$drawable.icon_yeelight_control_view_ct);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionViewNew$i */
    class C10455i implements Handler.Callback {
        C10455i() {
        }

        /* JADX WARNING: type inference failed for: r10v1, types: [com.yeelight.yeelib.g.y] */
        /* JADX WARNING: type inference failed for: r10v3, types: [com.yeelight.yeelib.g.y] */
        /* JADX WARNING: type inference failed for: r3v4, types: [com.yeelight.yeelib.g.f] */
        /* JADX WARNING: type inference failed for: r3v5, types: [com.yeelight.yeelib.g.f] */
        /* JADX WARNING: type inference failed for: r3v6, types: [com.yeelight.yeelib.g.g] */
        /* JADX WARNING: type inference failed for: r3v7, types: [com.yeelight.yeelib.g.g] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean handleMessage(android.os.Message r10) {
            /*
                r9 = this;
                int r0 = r10.what
                r1 = 1
                r2 = 2
                if (r0 == r1) goto L_0x0079
                if (r0 == r2) goto L_0x000a
                goto L_0x00fa
            L_0x000a:
                android.os.Bundle r10 = r10.getData()
                if (r10 == 0) goto L_0x00fa
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r0 = com.yeelight.yeelib.p194ui.view.ModeSelectionViewNew.this
                com.yeelight.yeelib.c.i.i r0 = r0.f19619p
                if (r0 == 0) goto L_0x00fa
                java.lang.String r0 = "ct"
                int r8 = r10.getInt(r0)
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r10 = com.yeelight.yeelib.p194ui.view.ModeSelectionViewNew.this
                int r10 = r10.f19612i
                if (r10 != r2) goto L_0x0041
                com.yeelight.yeelib.g.g r10 = new com.yeelight.yeelib.g.g
                r5 = -1
                r6 = 3
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r0 = com.yeelight.yeelib.p194ui.view.ModeSelectionViewNew.this
                com.yeelight.yeelib.c.i.i r0 = r0.f19619p
                com.yeelight.yeelib.c.i.a r0 = (com.yeelight.yeelib.p150c.p151i.C6017a) r0
                com.yeelight.yeelib.c.i.b r0 = r0.mo27591k2()
                int r7 = r0.mo27596a()
                java.lang.String r4 = ""
                r3 = r10
                r3.<init>(r4, r5, r6, r7, r8)
                goto L_0x00af
            L_0x0041:
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r10 = com.yeelight.yeelib.p194ui.view.ModeSelectionViewNew.this
                com.yeelight.yeelib.c.i.i r10 = r10.f19619p
                boolean r10 = r10 instanceof com.yeelight.yeelib.p150c.p151i.C6039j
                if (r10 == 0) goto L_0x005e
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r10 = com.yeelight.yeelib.p194ui.view.ModeSelectionViewNew.this
                com.yeelight.yeelib.c.i.i r10 = r10.f19619p
                com.yeelight.yeelib.c.i.e r10 = r10.mo23408d0()
                int r10 = r10.mo27700m()
                int r10 = com.yeelight.yeelib.utils.C10555s.m25794e(r10)
                goto L_0x006c
            L_0x005e:
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r10 = com.yeelight.yeelib.p194ui.view.ModeSelectionViewNew.this
                com.yeelight.yeelib.c.i.i r10 = r10.f19619p
                com.yeelight.yeelib.c.i.e r10 = r10.mo23408d0()
                int r10 = r10.mo27700m()
            L_0x006c:
                r7 = r10
                com.yeelight.yeelib.g.g r10 = new com.yeelight.yeelib.g.g
                r5 = -1
                r6 = 3
                java.lang.String r4 = ""
                r3 = r10
                r3.<init>(r4, r5, r6, r7, r8)
                goto L_0x00f1
            L_0x0079:
                android.os.Bundle r10 = r10.getData()
                if (r10 == 0) goto L_0x00fa
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r0 = com.yeelight.yeelib.p194ui.view.ModeSelectionViewNew.this
                com.yeelight.yeelib.c.i.i r0 = r0.f19619p
                if (r0 == 0) goto L_0x00fa
                java.lang.String r0 = "color"
                int r8 = r10.getInt(r0)
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r10 = com.yeelight.yeelib.p194ui.view.ModeSelectionViewNew.this
                int r10 = r10.f19612i
                if (r10 != r2) goto L_0x00bb
                com.yeelight.yeelib.g.f r10 = new com.yeelight.yeelib.g.f
                r5 = -1
                r6 = 2
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r0 = com.yeelight.yeelib.p194ui.view.ModeSelectionViewNew.this
                com.yeelight.yeelib.c.i.i r0 = r0.f19619p
                com.yeelight.yeelib.c.i.a r0 = (com.yeelight.yeelib.p150c.p151i.C6017a) r0
                com.yeelight.yeelib.c.i.b r0 = r0.mo27591k2()
                int r7 = r0.mo27596a()
                java.lang.String r4 = ""
                r3 = r10
                r3.<init>(r4, r5, r6, r7, r8)
            L_0x00af:
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r0 = com.yeelight.yeelib.p194ui.view.ModeSelectionViewNew.this
                com.yeelight.yeelib.c.i.i r0 = r0.f19619p
                com.yeelight.yeelib.c.i.a r0 = (com.yeelight.yeelib.p150c.p151i.C6017a) r0
                r0.mo27595o2(r10)
                goto L_0x00fa
            L_0x00bb:
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r10 = com.yeelight.yeelib.p194ui.view.ModeSelectionViewNew.this
                com.yeelight.yeelib.c.i.i r10 = r10.f19619p
                boolean r10 = r10 instanceof com.yeelight.yeelib.p150c.p151i.C6039j
                if (r10 == 0) goto L_0x00d8
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r10 = com.yeelight.yeelib.p194ui.view.ModeSelectionViewNew.this
                com.yeelight.yeelib.c.i.i r10 = r10.f19619p
                com.yeelight.yeelib.c.i.e r10 = r10.mo23408d0()
                int r10 = r10.mo27700m()
                int r10 = com.yeelight.yeelib.utils.C10555s.m25794e(r10)
                goto L_0x00e6
            L_0x00d8:
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r10 = com.yeelight.yeelib.p194ui.view.ModeSelectionViewNew.this
                com.yeelight.yeelib.c.i.i r10 = r10.f19619p
                com.yeelight.yeelib.c.i.e r10 = r10.mo23408d0()
                int r10 = r10.mo27700m()
            L_0x00e6:
                r7 = r10
                com.yeelight.yeelib.g.f r10 = new com.yeelight.yeelib.g.f
                r5 = -1
                r6 = 2
                java.lang.String r4 = ""
                r3 = r10
                r3.<init>(r4, r5, r6, r7, r8)
            L_0x00f1:
                com.yeelight.yeelib.ui.view.ModeSelectionViewNew r0 = com.yeelight.yeelib.p194ui.view.ModeSelectionViewNew.this
                com.yeelight.yeelib.c.i.i r0 = r0.f19619p
                r0.mo23355x1(r10)
            L_0x00fa:
                r10 = 0
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.view.ModeSelectionViewNew.C10455i.handleMessage(android.os.Message):boolean");
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionViewNew$j */
    private class C10456j extends BaseAdapter {

        /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionViewNew$j$a */
        class C10457a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C9849r f19633a;

            /* renamed from: b */
            final /* synthetic */ C10459k f19634b;

            /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionViewNew$j$a$a */
            class C10458a implements Animation.AnimationListener {
                C10458a() {
                }

                public void onAnimationEnd(Animation animation) {
                    C10457a.this.f19634b.f19638b.setVisibility(8);
                }

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }
            }

            C10457a(C9849r rVar, C10459k kVar) {
                this.f19633a = rVar;
                this.f19634b = kVar;
            }

            public void onClick(View view) {
                if (ModeSelectionViewNew.this.f19612i == 2) {
                    ((C6017a) ModeSelectionViewNew.this.f19619p).mo27595o2(this.f19633a);
                } else {
                    ModeSelectionViewNew.this.f19619p.mo23355x1(this.f19633a);
                }
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(100);
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation2.setDuration(300);
                alphaAnimation2.setStartOffset(200);
                animationSet.addAnimation(alphaAnimation);
                animationSet.addAnimation(alphaAnimation2);
                this.f19634b.f19638b.setVisibility(0);
                animationSet.setAnimationListener(new C10458a());
                this.f19634b.f19638b.startAnimation(animationSet);
            }
        }

        private C10456j() {
        }

        /* synthetic */ C10456j(ModeSelectionViewNew modeSelectionViewNew, C10447a aVar) {
            this();
        }

        /* renamed from: a */
        public C9849r mo33002a(int i) {
            if (ModeSelectionViewNew.this.f19614k == null || ModeSelectionViewNew.this.f19614k.size() <= i || i < 0) {
                return null;
            }
            return (C9849r) ModeSelectionViewNew.this.f19614k.get(i);
        }

        public int getCount() {
            return ModeSelectionViewNew.this.f19614k.size();
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C10459k kVar;
            if (view == null) {
                kVar = new C10459k(ModeSelectionViewNew.this, (C10447a) null);
                view2 = LayoutInflater.from(ModeSelectionViewNew.this.getContext()).inflate(R$layout.recommend_scene_layout, (ViewGroup) null);
                view2.setTag(kVar);
            } else {
                view2 = view;
                kVar = (C10459k) view.getTag();
            }
            kVar.f19637a = (ImageView) view2.findViewById(R$id.scene_img);
            kVar.f19639c = (TextView) view2.findViewById(R$id.scene_name);
            kVar.f19638b = (ImageView) view2.findViewById(R$id.scene_img_action_callback);
            C9849r a = mo33002a(i);
            if (a != null) {
                kVar.f19639c.setText(a.mo31885q());
                kVar.f19637a.setBackgroundResource(C10549p.m25765a(4, a.mo31887s()));
                view2.setOnClickListener(new C10457a(a, kVar));
            }
            return view2;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionViewNew$k */
    private class C10459k {

        /* renamed from: a */
        public ImageView f19637a;

        /* renamed from: b */
        public ImageView f19638b;

        /* renamed from: c */
        public TextView f19639c;

        private C10459k(ModeSelectionViewNew modeSelectionViewNew) {
        }

        /* synthetic */ C10459k(ModeSelectionViewNew modeSelectionViewNew, C10447a aVar) {
            this(modeSelectionViewNew);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.view.ModeSelectionViewNew$l */
    public class C10460l {

        /* renamed from: a */
        int f19640a;

        /* renamed from: b */
        String f19641b;

        C10460l(ModeSelectionViewNew modeSelectionViewNew, int i, String str) {
            this.f19640a = i;
            this.f19641b = str;
        }

        /* renamed from: a */
        public int mo33011a() {
            return this.f19640a;
        }

        /* renamed from: b */
        public String mo33012b() {
            return this.f19641b;
        }

        /* renamed from: c */
        public void mo33013c(String str) {
            this.f19641b = str;
        }
    }

    public ModeSelectionViewNew(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo32994u(context);
    }

    /* renamed from: b */
    private void m25290b(TabLayout tabLayout, int i, int i2) {
        tabLayout.setTabMode(i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C10547m.m25752b(this.f19615l, 44.0f));
        int b = C10547m.m25752b(this.f19615l, (float) i2);
        layoutParams.setMargins(b, 0, b, 0);
        tabLayout.setLayoutParams(layoutParams);
    }

    /* renamed from: r */
    private void m25302r() {
        String i1 = this.f19619p.mo23330i1();
        if (TextUtils.isEmpty(i1)) {
            C4308b.m12139r(f19603r, "model can't be null!");
            return;
        }
        char c = 65535;
        int hashCode = i1.hashCode();
        if (hashCode != -1462015191) {
            if (hashCode == 922669546 && i1.equals("yeelink.light.ceiling4")) {
                c = 0;
            }
        } else if (i1.equals("yeelink.light.ceiling10")) {
            c = 1;
        }
        if (c == 0) {
            i1 = "yeelink.light.ceiling4x";
        } else if (c == 1) {
            i1 = "yeelink.light.ceiling10x";
        }
        C4300b0.m12083u().mo23748l(i1, new C10449c());
    }

    /* renamed from: s */
    private void m25303s() {
        TabLayout tabLayout;
        int i;
        if (this.f19618o.size() == 1) {
            this.f19604a.setVisibility(8);
        } else {
            if (this.f19618o.size() == 2) {
                tabLayout = this.f19604a;
                i = 70;
            } else if (this.f19618o.size() == 3) {
                tabLayout = this.f19604a;
                i = 25;
            } else if (this.f19618o.size() == 4) {
                tabLayout = this.f19604a;
                i = 15;
            } else {
                m25290b(this.f19604a, 0, 0);
                C10560x.m25821a(this.f19604a);
            }
            m25290b(tabLayout, 1, i);
        }
        for (int i2 = 0; i2 < this.f19618o.size(); i2++) {
            TabLayout.Tab newTab = this.f19604a.newTab();
            newTab.setText((CharSequence) this.f19618o.get(i2).mo33012b());
            this.f19604a.addTab(newTab);
        }
        m25304t();
    }

    /* renamed from: t */
    private void m25304t() {
        this.f19604a.setOnTabSelectedListener(new C10450d());
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m25305w(int i) {
        if (C4308b.f7482a) {
            float[] fArr = new float[3];
            Color.colorToHSV(i, fArr);
            fArr[2] = C10542f.m25732a(this.f19619p.mo23408d0().mo27700m());
            fArr[0] = ((float) Math.round(fArr[0] * 100.0f)) / 100.0f;
            fArr[1] = ((float) Math.round(fArr[1] * 100.0f)) / 100.0f;
            fArr[2] = ((float) Math.round(fArr[2] * 100.0f)) / 100.0f;
            this.f19606c.post(new C10452f("R: " + ((float) Color.red(i)) + "  G: " + ((float) Color.green(i)) + " B: " + ((float) Color.blue(i)) + "\nH: " + fArr[0] + " S: " + fArr[1] + " V: " + fArr[2]));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m25306x(int i) {
        if (C4308b.f7482a) {
            this.f19607d.post(new C10451e(i));
        }
    }

    /* renamed from: a */
    public void mo32760a(int i) {
        this.f19610g.mo32890l(i);
    }

    /* renamed from: n */
    public void mo32989n() {
        "initColorGradientView!! device cap model: " + this.f19619p.mo23330i1();
        C4200i iVar = this.f19619p;
        if (!(iVar instanceof C6017a) || this.f19612i != 2) {
            this.f19606c.mo32913h((float) this.f19619p.mo23408d0().mo27702n());
        } else {
            this.f19606c.mo32913h((float) ((C6017a) iVar).mo27591k2().mo27597b());
        }
        m25305w(this.f19619p.mo23408d0().mo27702n());
    }

    /* renamed from: o */
    public void mo32990o() {
        int i;
        C7632k.C7633a aVar;
        "initCtGradientView!! device cap model: " + this.f19619p.mo23330i1();
        if (!(this.f19619p instanceof C6017a) || this.f19612i != 2) {
            aVar = C7632k.m22541b(this.f19619p.mo23330i1());
            C4200i iVar = this.f19619p;
            if (((iVar instanceof C6895j0) || (iVar instanceof C7497z)) && this.f19619p.mo23408d0().mo27671W()) {
                aVar = C7632k.m22545f(this.f19619p.mo23395T());
            }
            if (!(aVar == null || aVar.mo29079a() == aVar.mo29080b())) {
                i = this.f19619p.mo23408d0().mo27706p();
            }
            m25306x(this.f19619p.mo23408d0().mo27706p());
        }
        aVar = C7632k.m22541b("yeelink.light.ceiling4.ambi");
        if (aVar.mo29079a() != aVar.mo29080b()) {
            i = ((C6017a) this.f19619p).mo27591k2().mo27598c();
        }
        m25306x(this.f19619p.mo23408d0().mo27706p());
        this.f19607d.mo32913h(((float) (i - aVar.mo29080b())) / ((float) (aVar.mo29079a() - aVar.mo29080b())));
        m25306x(this.f19619p.mo23408d0().mo27706p());
    }

    public void onStatusChange(int i, C6024e eVar) {
        Runnable runnable;
        GradientView gradientView;
        boolean z = System.currentTimeMillis() - this.f19617n > 2000;
        if (i != 16) {
            if (i != 32) {
                if (i == 4096) {
                    C4200i iVar = this.f19619p;
                    if (!(iVar instanceof C6895j0) || !iVar.mo23408d0().mo27671W()) {
                        gradientView = this.f19607d;
                        runnable = new C10454h();
                    } else {
                        gradientView = this.f19607d;
                        runnable = new C10453g();
                    }
                    gradientView.post(runnable);
                }
            } else if (this.f19607d.getVisibility() != 0 || z) {
                mo32990o();
            }
        } else if (this.f19606c.getVisibility() != 0 || z) {
            mo32989n();
        }
    }

    /* renamed from: p */
    public void mo26189p(int i, C6018b bVar) {
        boolean z = System.currentTimeMillis() - this.f19617n > 2000;
        if (i != 16) {
            if (i == 32) {
                if (this.f19607d.getVisibility() != 0 || z) {
                    mo32990o();
                }
            }
        } else if (this.f19606c.getVisibility() != 0 || z) {
            mo32989n();
        }
    }

    /* renamed from: q */
    public void mo32991q(String str, int i) {
        C10460l lVar;
        ArrayList<C10460l> arrayList;
        this.f19618o.clear();
        this.f19604a.removeAllTabs();
        this.f19619p = C4257w.m11953o0(str);
        this.f19612i = i;
        m25302r();
        this.f19607d.setBackgroundResource(R$drawable.icon_yeelight_control_view_ct);
        this.f19619p.mo23365B0(this);
        ((C6017a) this.f19619p).mo27591k2().mo27604i(this);
        this.f19618o.add(new C10460l(this, 0, getResources().getString(R$string.scene_recommend)));
        C7628j I = this.f19619p.mo23375I();
        if (i == 1) {
            this.f19618o.add(new C10460l(this, 1, I.mo29076b(C7628j.C7630b.MOON_TAB) ? getResources().getString(R$string.common_text_day) : getResources().getText(R$string.common_text_light_mode_white).toString()));
            if (I.mo29076b(C7628j.C7630b.MOON_TAB)) {
                arrayList = this.f19618o;
                lVar = new C10460l(this, 3, getResources().getString(R$string.common_text_night_light));
            }
            m25303s();
            mo32990o();
            mo32989n();
        }
        this.f19618o.add(new C10460l(this, 1, getResources().getString(R$string.common_text_light_mode_white)));
        arrayList = this.f19618o;
        lVar = new C10460l(this, 2, getResources().getString(R$string.common_text_colors));
        arrayList.add(lVar);
        m25303s();
        mo32990o();
        mo32989n();
    }

    public void setBrightnessSeekbarView(BrightnessSeekBarView brightnessSeekBarView) {
        this.f19616m = brightnessSeekBarView;
        brightnessSeekBarView.mo32737g(this);
    }

    public void setDeviceId(String str) {
        int i;
        Resources resources;
        String charSequence;
        GradientView gradientView;
        int i2;
        this.f19610g.setDevice(str);
        this.f19618o.clear();
        this.f19604a.removeAllTabs();
        C4200i o0 = C4257w.m11953o0(str);
        this.f19619p = o0;
        if (o0 != null) {
            m25302r();
            C7628j I = this.f19619p.mo23375I();
            C4200i iVar = this.f19619p;
            if (((iVar instanceof C6895j0) || (iVar instanceof C7497z)) && this.f19619p.mo23408d0().mo27671W()) {
                charSequence = getResources().getText(R$string.feature_kid_mode).toString();
                gradientView = this.f19607d;
                i2 = R$drawable.icon_yeelight_control_view_kid_mode;
            } else {
                if (I.mo29076b(C7628j.C7630b.MOON_TAB)) {
                    resources = getResources();
                    i = R$string.common_text_day;
                } else {
                    resources = getResources();
                    i = R$string.common_text_light_mode_white;
                }
                charSequence = resources.getText(i).toString();
                gradientView = this.f19607d;
                i2 = R$drawable.icon_yeelight_control_view_ct;
            }
            gradientView.setBackgroundResource(i2);
            this.f19619p.mo23365B0(this);
            this.f19618o.add(new C10460l(this, 0, getResources().getString(R$string.scene_recommend)));
            if (I.mo29076b(C7628j.C7630b.CT_TAB)) {
                this.f19618o.add(new C10460l(this, 1, charSequence));
            }
            if (I.mo29076b(C7628j.C7630b.COLOR_TAB)) {
                this.f19618o.add(new C10460l(this, 2, getResources().getString(R$string.common_text_colors)));
            }
            if (I.mo29076b(C7628j.C7630b.MOON_TAB)) {
                this.f19618o.add(new C10460l(this, 3, getResources().getString(R$string.common_text_night_light)));
            }
            if (I.mo29076b(C7628j.C7630b.FLOW_TAB)) {
                this.f19618o.add(new C10460l(this, 4, getResources().getString(R$string.common_text_flow_mode)));
            }
            m25303s();
            mo32990o();
            mo32989n();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo32994u(Context context) {
        LayoutInflater.from(context).inflate(R$layout.widget_mode_seletion_view_new, this, true);
        this.f19604a = (TabLayout) findViewById(R$id.tabLayout);
        this.f19605b = (GridView) findViewById(R$id.recommend_scene_grid_view);
        this.f19606c = (GradientView) findViewById(R$id.color_gradient_view);
        this.f19607d = (GradientView) findViewById(R$id.ct_gradient_view);
        this.f19608e = (FrameLayout) findViewById(R$id.sun_mode_layout);
        this.f19609f = (FrameLayout) findViewById(R$id.moon_mode_layout);
        this.f19610g = (FlowSettingView) findViewById(R$id.flow_mode_layout);
        this.f19611h = (TextView) findViewById(R$id.text_current_color);
        C10456j jVar = new C10456j(this, (C10447a) null);
        this.f19613j = jVar;
        this.f19605b.setAdapter(jVar);
        this.f19615l = context;
        this.f19606c.setOnColorChangedListener(new C10447a());
        this.f19607d.setOnCtChangedListener(new C10448b());
    }

    /* renamed from: v */
    public void mo32995v() {
        C4200i iVar = this.f19619p;
        if (iVar != null) {
            iVar.mo23400W0(this);
        }
        if (this.f19612i != -1) {
            ((C6017a) this.f19619p).mo27591k2().mo27614s(this);
        }
    }
}

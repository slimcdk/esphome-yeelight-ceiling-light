package com.yeelight.yeelib.p194ui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.internal.view.SupportMenu;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.models.C7632k;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6017a;
import com.yeelight.yeelib.p150c.p183m.C6895j0;
import com.yeelight.yeelib.p150c.p183m.C7497z;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p153g.C9833d;
import com.yeelight.yeelib.p153g.C9835f;
import com.yeelight.yeelib.p153g.C9836g;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.utils.C10547m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.yeelib.ui.view.FavoriteSceneViewBar */
public class FavoriteSceneViewBar extends LinearLayout implements View.OnClickListener {

    /* renamed from: j */
    private static int f19474j = 5;

    /* renamed from: a */
    private int f19475a;

    /* renamed from: b */
    private TextView f19476b;

    /* renamed from: c */
    private TextView f19477c;

    /* renamed from: d */
    private TextView f19478d;

    /* renamed from: e */
    private TextView f19479e;

    /* renamed from: f */
    private TextView f19480f;

    /* renamed from: g */
    private List<C10424a> f19481g = new ArrayList();

    /* renamed from: h */
    private C4200i f19482h;

    /* renamed from: i */
    private int f19483i = -1;

    /* renamed from: com.yeelight.yeelib.ui.view.FavoriteSceneViewBar$a */
    private class C10424a {

        /* renamed from: a */
        private C9856y f19484a;

        /* renamed from: b */
        private String f19485b;

        C10424a(FavoriteSceneViewBar favoriteSceneViewBar, C9856y yVar, String str) {
            this.f19484a = yVar;
            this.f19485b = str;
        }

        /* renamed from: a */
        public String mo32879a() {
            return this.f19485b;
        }

        /* renamed from: b */
        public C9856y mo32880b() {
            return this.f19484a;
        }
    }

    static {
        Class<FavoriteSceneViewBar> cls = FavoriteSceneViewBar.class;
    }

    public FavoriteSceneViewBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo32877t(context, attributeSet);
    }

    /* renamed from: a */
    private TextView m25154a(int i, int i2, int i3, String str, int i4) {
        TextView textView = new TextView(getContext());
        Drawable drawable = getResources().getDrawable(i);
        if (i2 != -1) {
            ((GradientDrawable) drawable).setColor(i2);
        }
        if (i3 != -1) {
            ((GradientDrawable) drawable).setStroke(2, i3);
        }
        int b = C10547m.m25752b(getContext(), 20.0f);
        drawable.setBounds(0, 0, b, b);
        textView.setText(str);
        textView.setTextColor(getResources().getColor(R$color.common_text_color_secondary_66));
        textView.setTextSize(2, 12.0f);
        textView.setGravity(81);
        textView.setCompoundDrawables((Drawable) null, drawable, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(C10547m.m25752b(getContext(), 3.0f));
        textView.setLayoutParams(new LinearLayout.LayoutParams((this.f19475a - (C10547m.m25752b(getContext(), 29.0f) * 2)) / f19474j, -2));
        textView.setId(i4);
        textView.setSingleLine();
        return textView;
    }

    /* renamed from: b */
    private void m25155b(String str) {
        C7632k.C7633a b = C7632k.m22541b(str);
        if (b != null) {
            if (b.mo29080b() == 3000 && b.mo29079a() == 5000) {
                m25161h();
                return;
            } else if (b.mo29080b() == 3000 && b.mo29079a() == 6500) {
                m25163j();
                return;
            } else if (b.mo29080b() == 1700 && b.mo29079a() == 6500) {
                m25156c();
                return;
            } else if (b.mo29080b() == 2700 && b.mo29079a() == 5700) {
                m25159f();
                return;
            } else if (b.mo29080b() == 2600 && b.mo29079a() == 5000) {
                m25157d();
                return;
            } else if (b.mo29080b() == 3000 && b.mo29079a() == 5700) {
                m25162i();
                return;
            } else if (b.mo29080b() == 2600 && b.mo29079a() == 6100) {
                m25158e();
                return;
            }
        }
        m25160g();
    }

    /* renamed from: c */
    private void m25156c() {
        this.f19481g.clear();
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 1700), "1700K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 3500), "3500K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 4000), "4000K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 5500), "5500K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 6500), "6500K"));
    }

    /* renamed from: d */
    private void m25157d() {
        this.f19481g.clear();
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 2600), "2600K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 3500), "3500K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 4000), "4000K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 4500), "4500K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 5000), "5000K"));
    }

    /* renamed from: e */
    private void m25158e() {
        this.f19481g.clear();
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 2600), "2600K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 3500), "3500K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 4000), "4000K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 5500), "5500K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 6100), "6100K"));
    }

    /* renamed from: f */
    private void m25159f() {
        this.f19481g.clear();
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 2700), "2700K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 3500), "3500K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 4000), "4000K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 5000), "5000K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 5700), "5700K"));
    }

    /* renamed from: g */
    private void m25160g() {
        this.f19481g.clear();
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 2700), "2700K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 3500), "3500K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 4000), "4000K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 5500), "5500K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 6500), "6500K"));
    }

    /* renamed from: h */
    private void m25161h() {
        this.f19481g.clear();
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 2700), "3000K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 3500), "3500K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 4000), "4000K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 4500), "4500K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 5000), "5000K"));
    }

    /* renamed from: i */
    private void m25162i() {
        this.f19481g.clear();
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, PathInterpolatorCompat.MAX_NUM_POINTS), "3000K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 3500), "3500K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 4000), "4000K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 5000), "5000K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 5700), "5700K"));
    }

    /* renamed from: j */
    private void m25163j() {
        this.f19481g.clear();
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, PathInterpolatorCompat.MAX_NUM_POINTS), "3000K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 3500), "3500K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 4000), "4000K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 5500), "5500K"));
        this.f19481g.add(new C10424a(this, new C9836g("", -1, 3, -1, 6500), "6500K"));
    }

    /* renamed from: k */
    private void m25164k() {
        removeAllViews();
        this.f19476b = m25154a(R$drawable.favorite_scene_item_bg, -1660672, getResources().getColor(R$color.common_text_color_description_99), this.f19481g.get(0).mo32879a(), 1);
        this.f19477c = m25154a(R$drawable.favorite_scene_item_bg, -804843, getResources().getColor(R$color.common_text_color_description_99), this.f19481g.get(1).mo32879a(), 2);
        this.f19478d = m25154a(R$drawable.favorite_scene_item_bg, -12208, getResources().getColor(R$color.common_text_color_description_99), this.f19481g.get(2).mo32879a(), 3);
        this.f19479e = m25154a(R$drawable.favorite_scene_item_bg, -7017, getResources().getColor(R$color.common_text_color_description_99), this.f19481g.get(3).mo32879a(), 4);
        this.f19480f = m25154a(R$drawable.favorite_scene_item_bg, -3118, getResources().getColor(R$color.common_text_color_description_99), this.f19481g.get(4).mo32879a(), 5);
        addView(this.f19476b);
        addView(this.f19477c);
        addView(this.f19478d);
        addView(this.f19479e);
        addView(this.f19480f);
    }

    /* renamed from: l */
    private void m25165l() {
        this.f19481g.clear();
        this.f19481g.add(new C10424a(this, new C9833d("", -1, 1, 1), "1%"));
        this.f19481g.add(new C10424a(this, new C9833d("", -1, 1, 25), "25%"));
        this.f19481g.add(new C10424a(this, new C9833d("", -1, 1, 50), "50%"));
        this.f19481g.add(new C10424a(this, new C9833d("", -1, 1, 75), "75%"));
        this.f19481g.add(new C10424a(this, new C9833d("", -1, 1, 100), "100%"));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m25166m() {
        /*
            r2 = this;
            com.yeelight.yeelib.c.i.i r0 = r2.f19482h
            java.lang.String r0 = r0.mo23330i1()
            int r1 = r0.hashCode()
            switch(r1) {
                case -1644531059: goto L_0x0437;
                case -1462015191: goto L_0x042c;
                case -1462015190: goto L_0x0421;
                case -1462015189: goto L_0x0416;
                case -1462015188: goto L_0x040b;
                case -1462015187: goto L_0x0400;
                case -1462015186: goto L_0x03f5;
                case -1462015185: goto L_0x03ea;
                case -1462015184: goto L_0x03df;
                case -1462015183: goto L_0x03d3;
                case -1462015182: goto L_0x03c7;
                case -1462015160: goto L_0x03bb;
                case -1462015159: goto L_0x03af;
                case -1462015158: goto L_0x03a3;
                case -1462015157: goto L_0x0397;
                case -1462015156: goto L_0x038b;
                case -1400275319: goto L_0x037f;
                case -1317475940: goto L_0x0373;
                case -1317475939: goto L_0x0367;
                case -1317475937: goto L_0x035b;
                case -1317475915: goto L_0x034f;
                case -1317475914: goto L_0x0343;
                case -1317475913: goto L_0x0337;
                case -1317475912: goto L_0x032b;
                case -1308146495: goto L_0x031f;
                case -1308146494: goto L_0x0313;
                case -1308146493: goto L_0x0307;
                case -1308146492: goto L_0x02fb;
                case -1308146491: goto L_0x02ef;
                case -1308146490: goto L_0x02e3;
                case -1308146488: goto L_0x02d7;
                case -1308146447: goto L_0x02cb;
                case -1308146446: goto L_0x02bf;
                case -1308146445: goto L_0x02b3;
                case -1282176368: goto L_0x02a7;
                case -1235140472: goto L_0x029b;
                case -1235140471: goto L_0x028f;
                case -1235140468: goto L_0x0283;
                case -1235140467: goto L_0x0277;
                case -1063384694: goto L_0x026b;
                case -1063384689: goto L_0x0260;
                case -1063384685: goto L_0x0254;
                case -1035626052: goto L_0x0248;
                case -1035596261: goto L_0x023c;
                case -948847040: goto L_0x0230;
                case -948847038: goto L_0x0224;
                case -888668266: goto L_0x0218;
                case -888668265: goto L_0x020c;
                case -888668264: goto L_0x0200;
                case -850921852: goto L_0x01f4;
                case -845289556: goto L_0x01e8;
                case -845289555: goto L_0x01dc;
                case -845289553: goto L_0x01d0;
                case -845289551: goto L_0x01c4;
                case -845289508: goto L_0x01b8;
                case -458141175: goto L_0x01ac;
                case -458141174: goto L_0x01a0;
                case -458141173: goto L_0x0194;
                case -458141172: goto L_0x0188;
                case -449944730: goto L_0x017c;
                case -449944729: goto L_0x0170;
                case -449944728: goto L_0x0164;
                case -449944727: goto L_0x0158;
                case -449944724: goto L_0x014c;
                case -449944723: goto L_0x0140;
                case -449944722: goto L_0x0134;
                case -448603205: goto L_0x0128;
                case -448603202: goto L_0x011c;
                case -448603201: goto L_0x0110;
                case -448603157: goto L_0x0104;
                case -448603156: goto L_0x00f8;
                case -443031172: goto L_0x00ec;
                case 922669543: goto L_0x00e1;
                case 922669544: goto L_0x00d5;
                case 922669545: goto L_0x00ca;
                case 922669546: goto L_0x00bf;
                case 922669547: goto L_0x00b4;
                case 922669548: goto L_0x00a9;
                case 922669549: goto L_0x009e;
                case 922669550: goto L_0x0093;
                case 922669551: goto L_0x0087;
                case 1201756974: goto L_0x007b;
                case 1201757021: goto L_0x006f;
                case 1201766335: goto L_0x0063;
                case 1201766336: goto L_0x0057;
                case 1623724661: goto L_0x004b;
                case 1623724662: goto L_0x003f;
                case 1623724663: goto L_0x0033;
                case 2102612488: goto L_0x0027;
                case 2102612489: goto L_0x001b;
                case 2146130361: goto L_0x000f;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0442
        L_0x000f:
            java.lang.String r1 = "yeelink.light.dnlight2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 49
            goto L_0x0443
        L_0x001b:
            java.lang.String r1 = "yeelink.light.meshbulb2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 48
            goto L_0x0443
        L_0x0027:
            java.lang.String r1 = "yeelink.light.meshbulb1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 47
            goto L_0x0443
        L_0x0033:
            java.lang.String r1 = "yeelink.light.bslamp3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 78
            goto L_0x0443
        L_0x003f:
            java.lang.String r1 = "yeelink.light.bslamp2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 77
            goto L_0x0443
        L_0x004b:
            java.lang.String r1 = "yeelink.light.bslamp1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 76
            goto L_0x0443
        L_0x0057:
            java.lang.String r1 = "yeelink.light.ml2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 52
            goto L_0x0443
        L_0x0063:
            java.lang.String r1 = "yeelink.light.ml1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 51
            goto L_0x0443
        L_0x006f:
            java.lang.String r1 = "yeelink.light.cta"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 43
            goto L_0x0443
        L_0x007b:
            java.lang.String r1 = "yeelink.light.ct2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 42
            goto L_0x0443
        L_0x0087:
            java.lang.String r1 = "yeelink.light.ceiling9"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 8
            goto L_0x0443
        L_0x0093:
            java.lang.String r1 = "yeelink.light.ceiling8"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 7
            goto L_0x0443
        L_0x009e:
            java.lang.String r1 = "yeelink.light.ceiling7"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 6
            goto L_0x0443
        L_0x00a9:
            java.lang.String r1 = "yeelink.light.ceiling6"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 5
            goto L_0x0443
        L_0x00b4:
            java.lang.String r1 = "yeelink.light.ceiling5"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 4
            goto L_0x0443
        L_0x00bf:
            java.lang.String r1 = "yeelink.light.ceiling4"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 3
            goto L_0x0443
        L_0x00ca:
            java.lang.String r1 = "yeelink.light.ceiling3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 2
            goto L_0x0443
        L_0x00d5:
            java.lang.String r1 = "yeelink.light.ceiling2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 89
            goto L_0x0443
        L_0x00e1:
            java.lang.String r1 = "yeelink.light.ceiling1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 1
            goto L_0x0443
        L_0x00ec:
            java.lang.String r1 = "yeelink.light.spot1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 50
            goto L_0x0443
        L_0x00f8:
            java.lang.String r1 = "yeelink.light.monob"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 87
            goto L_0x0443
        L_0x0104:
            java.lang.String r1 = "yeelink.light.monoa"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 86
            goto L_0x0443
        L_0x0110:
            java.lang.String r1 = "yeelink.light.mono5"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 85
            goto L_0x0443
        L_0x011c:
            java.lang.String r1 = "yeelink.light.mono4"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 84
            goto L_0x0443
        L_0x0128:
            java.lang.String r1 = "yeelink.light.mono1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 83
            goto L_0x0443
        L_0x0134:
            java.lang.String r1 = "yeelink.light.lamp9"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 40
            goto L_0x0443
        L_0x0140:
            java.lang.String r1 = "yeelink.light.lamp8"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 39
            goto L_0x0443
        L_0x014c:
            java.lang.String r1 = "yeelink.light.lamp7"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 62
            goto L_0x0443
        L_0x0158:
            java.lang.String r1 = "yeelink.light.lamp4"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 61
            goto L_0x0443
        L_0x0164:
            java.lang.String r1 = "yeelink.light.lamp3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 90
            goto L_0x0443
        L_0x0170:
            java.lang.String r1 = "yeelink.light.lamp2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 41
            goto L_0x0443
        L_0x017c:
            java.lang.String r1 = "yeelink.light.lamp1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 38
            goto L_0x0443
        L_0x0188:
            java.lang.String r1 = "yeelink.light.ceild"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 34
            goto L_0x0443
        L_0x0194:
            java.lang.String r1 = "yeelink.light.ceilc"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 33
            goto L_0x0443
        L_0x01a0:
            java.lang.String r1 = "yeelink.light.ceilb"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 32
            goto L_0x0443
        L_0x01ac:
            java.lang.String r1 = "yeelink.light.ceila"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 31
            goto L_0x0443
        L_0x01b8:
            java.lang.String r1 = "yeelink.light.stripa"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 75
            goto L_0x0443
        L_0x01c4:
            java.lang.String r1 = "yeelink.light.strip6"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 74
            goto L_0x0443
        L_0x01d0:
            java.lang.String r1 = "yeelink.light.strip4"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 44
            goto L_0x0443
        L_0x01dc:
            java.lang.String r1 = "yeelink.light.strip2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 73
            goto L_0x0443
        L_0x01e8:
            java.lang.String r1 = "yeelink.light.strip1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 72
            goto L_0x0443
        L_0x01f4:
            java.lang.String r1 = "yeelink.light.sp1grp"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 54
            goto L_0x0443
        L_0x0200:
            java.lang.String r1 = "yilai.light.ceiling3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 37
            goto L_0x0443
        L_0x020c:
            java.lang.String r1 = "yilai.light.ceiling2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 36
            goto L_0x0443
        L_0x0218:
            java.lang.String r1 = "yilai.light.ceiling1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 35
            goto L_0x0443
        L_0x0224:
            java.lang.String r1 = "yeelink.light.panel3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 45
            goto L_0x0443
        L_0x0230:
            java.lang.String r1 = "yeelink.light.panel1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 88
            goto L_0x0443
        L_0x023c:
            java.lang.String r1 = "yeelink.light.mb2grp"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 56
            goto L_0x0443
        L_0x0248:
            java.lang.String r1 = "yeelink.light.mb1grp"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 55
            goto L_0x0443
        L_0x0254:
            java.lang.String r1 = "yeelink.light.lamp19"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 79
            goto L_0x0443
        L_0x0260:
            java.lang.String r1 = "yeelink.light.lamp15"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 0
            goto L_0x0443
        L_0x026b:
            java.lang.String r1 = "yeelink.light.lamp10"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 81
            goto L_0x0443
        L_0x0277:
            java.lang.String r1 = "yeelink.light.fancl6"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 60
            goto L_0x0443
        L_0x0283:
            java.lang.String r1 = "yeelink.light.fancl5"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 59
            goto L_0x0443
        L_0x028f:
            java.lang.String r1 = "yeelink.light.fancl2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 58
            goto L_0x0443
        L_0x029b:
            java.lang.String r1 = "yeelink.light.fancl1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 57
            goto L_0x0443
        L_0x02a7:
            java.lang.String r1 = "yeelink.light.dn2grp"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 53
            goto L_0x0443
        L_0x02b3:
            java.lang.String r1 = "yeelink.light.colorc"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 71
            goto L_0x0443
        L_0x02bf:
            java.lang.String r1 = "yeelink.light.colorb"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 70
            goto L_0x0443
        L_0x02cb:
            java.lang.String r1 = "yeelink.light.colora"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 69
            goto L_0x0443
        L_0x02d7:
            java.lang.String r1 = "yeelink.light.color8"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 68
            goto L_0x0443
        L_0x02e3:
            java.lang.String r1 = "yeelink.light.color6"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 82
            goto L_0x0443
        L_0x02ef:
            java.lang.String r1 = "yeelink.light.color5"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 67
            goto L_0x0443
        L_0x02fb:
            java.lang.String r1 = "yeelink.light.color4"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 66
            goto L_0x0443
        L_0x0307:
            java.lang.String r1 = "yeelink.light.color3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 65
            goto L_0x0443
        L_0x0313:
            java.lang.String r1 = "yeelink.light.color2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 64
            goto L_0x0443
        L_0x031f:
            java.lang.String r1 = "yeelink.light.color1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 63
            goto L_0x0443
        L_0x032b:
            java.lang.String r1 = "yeelink.light.ceil33"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 30
            goto L_0x0443
        L_0x0337:
            java.lang.String r1 = "yeelink.light.ceil32"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 29
            goto L_0x0443
        L_0x0343:
            java.lang.String r1 = "yeelink.light.ceil31"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 28
            goto L_0x0443
        L_0x034f:
            java.lang.String r1 = "yeelink.light.ceil30"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 27
            goto L_0x0443
        L_0x035b:
            java.lang.String r1 = "yeelink.light.ceil29"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 26
            goto L_0x0443
        L_0x0367:
            java.lang.String r1 = "yeelink.light.ceil27"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 25
            goto L_0x0443
        L_0x0373:
            java.lang.String r1 = "yeelink.light.ceil26"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 24
            goto L_0x0443
        L_0x037f:
            java.lang.String r1 = "yeelink.light.ble1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 80
            goto L_0x0443
        L_0x038b:
            java.lang.String r1 = "yeelink.light.ceiling24"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 23
            goto L_0x0443
        L_0x0397:
            java.lang.String r1 = "yeelink.light.ceiling23"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 22
            goto L_0x0443
        L_0x03a3:
            java.lang.String r1 = "yeelink.light.ceiling22"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 21
            goto L_0x0443
        L_0x03af:
            java.lang.String r1 = "yeelink.light.ceiling21"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 20
            goto L_0x0443
        L_0x03bb:
            java.lang.String r1 = "yeelink.light.ceiling20"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 19
            goto L_0x0443
        L_0x03c7:
            java.lang.String r1 = "yeelink.light.ceiling19"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 18
            goto L_0x0443
        L_0x03d3:
            java.lang.String r1 = "yeelink.light.ceiling18"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 17
            goto L_0x0443
        L_0x03df:
            java.lang.String r1 = "yeelink.light.ceiling17"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 16
            goto L_0x0443
        L_0x03ea:
            java.lang.String r1 = "yeelink.light.ceiling16"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 15
            goto L_0x0443
        L_0x03f5:
            java.lang.String r1 = "yeelink.light.ceiling15"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 14
            goto L_0x0443
        L_0x0400:
            java.lang.String r1 = "yeelink.light.ceiling14"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 13
            goto L_0x0443
        L_0x040b:
            java.lang.String r1 = "yeelink.light.ceiling13"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 12
            goto L_0x0443
        L_0x0416:
            java.lang.String r1 = "yeelink.light.ceiling12"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 11
            goto L_0x0443
        L_0x0421:
            java.lang.String r1 = "yeelink.light.ceiling11"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 10
            goto L_0x0443
        L_0x042c:
            java.lang.String r1 = "yeelink.light.ceiling10"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 9
            goto L_0x0443
        L_0x0437:
            java.lang.String r1 = "yeelink.bhf_light.v1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0442
            r0 = 46
            goto L_0x0443
        L_0x0442:
            r0 = -1
        L_0x0443:
            switch(r0) {
                case 0: goto L_0x0468;
                case 1: goto L_0x0468;
                case 2: goto L_0x0468;
                case 3: goto L_0x0468;
                case 4: goto L_0x0468;
                case 5: goto L_0x0468;
                case 6: goto L_0x0468;
                case 7: goto L_0x0468;
                case 8: goto L_0x0468;
                case 9: goto L_0x0468;
                case 10: goto L_0x0468;
                case 11: goto L_0x0468;
                case 12: goto L_0x0468;
                case 13: goto L_0x0468;
                case 14: goto L_0x0468;
                case 15: goto L_0x0468;
                case 16: goto L_0x0468;
                case 17: goto L_0x0468;
                case 18: goto L_0x0468;
                case 19: goto L_0x0468;
                case 20: goto L_0x0468;
                case 21: goto L_0x0468;
                case 22: goto L_0x0468;
                case 23: goto L_0x0468;
                case 24: goto L_0x0468;
                case 25: goto L_0x0468;
                case 26: goto L_0x0468;
                case 27: goto L_0x0468;
                case 28: goto L_0x0468;
                case 29: goto L_0x0468;
                case 30: goto L_0x0468;
                case 31: goto L_0x0468;
                case 32: goto L_0x0468;
                case 33: goto L_0x0468;
                case 34: goto L_0x0468;
                case 35: goto L_0x0468;
                case 36: goto L_0x0468;
                case 37: goto L_0x0468;
                case 38: goto L_0x0468;
                case 39: goto L_0x0468;
                case 40: goto L_0x0468;
                case 41: goto L_0x0468;
                case 42: goto L_0x0468;
                case 43: goto L_0x0468;
                case 44: goto L_0x0468;
                case 45: goto L_0x0468;
                case 46: goto L_0x0468;
                case 47: goto L_0x0468;
                case 48: goto L_0x0468;
                case 49: goto L_0x0468;
                case 50: goto L_0x0468;
                case 51: goto L_0x0468;
                case 52: goto L_0x0468;
                case 53: goto L_0x0468;
                case 54: goto L_0x0468;
                case 55: goto L_0x0468;
                case 56: goto L_0x0468;
                case 57: goto L_0x0468;
                case 58: goto L_0x0468;
                case 59: goto L_0x0468;
                case 60: goto L_0x0468;
                case 61: goto L_0x045b;
                case 62: goto L_0x045b;
                case 63: goto L_0x0454;
                case 64: goto L_0x0454;
                case 65: goto L_0x0454;
                case 66: goto L_0x0454;
                case 67: goto L_0x0454;
                case 68: goto L_0x0454;
                case 69: goto L_0x0454;
                case 70: goto L_0x0454;
                case 71: goto L_0x0454;
                case 72: goto L_0x0454;
                case 73: goto L_0x0454;
                case 74: goto L_0x0454;
                case 75: goto L_0x0454;
                case 76: goto L_0x0454;
                case 77: goto L_0x0454;
                case 78: goto L_0x0454;
                case 79: goto L_0x0454;
                case 80: goto L_0x0454;
                case 81: goto L_0x0454;
                case 82: goto L_0x044d;
                case 83: goto L_0x0446;
                case 84: goto L_0x0446;
                case 85: goto L_0x0446;
                case 86: goto L_0x0446;
                case 87: goto L_0x0446;
                case 88: goto L_0x0446;
                case 89: goto L_0x0446;
                case 90: goto L_0x0446;
                default: goto L_0x0446;
            }
        L_0x0446:
            r2.m25165l()
            r2.m25164k()
            goto L_0x0474
        L_0x044d:
            r2.m25168o()
            r2.m25167n()
            goto L_0x0474
        L_0x0454:
            r2.m25170q()
            r2.m25169p()
            goto L_0x0474
        L_0x045b:
            com.yeelight.yeelib.c.i.i r0 = r2.f19482h
            java.lang.String r0 = r0.mo23330i1()
            r2.m25155b(r0)
            r2.m25172s()
            goto L_0x0474
        L_0x0468:
            com.yeelight.yeelib.c.i.i r0 = r2.f19482h
            java.lang.String r0 = r0.mo23330i1()
            r2.m25155b(r0)
            r2.m25171r()
        L_0x0474:
            r2.m25173u()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.view.FavoriteSceneViewBar.m25166m():void");
    }

    /* renamed from: n */
    private void m25167n() {
        removeAllViews();
        this.f19476b = m25154a(R$drawable.favorite_scene_item_bg, -35724, getResources().getColor(R$color.common_text_color_description_99), this.f19481g.get(0).mo32879a(), 1);
        this.f19477c = m25154a(R$drawable.favorite_scene_item_bg, -5442447, getResources().getColor(R$color.common_text_color_description_99), this.f19481g.get(1).mo32879a(), 2);
        this.f19478d = m25154a(R$drawable.favorite_scene_item_bg, -8984577, getResources().getColor(R$color.common_text_color_description_99), this.f19481g.get(2).mo32879a(), 3);
        this.f19479e = m25154a(R$drawable.favorite_scene_item_bg, -4873217, getResources().getColor(R$color.common_text_color_description_99), this.f19481g.get(3).mo32879a(), 4);
        addView(this.f19476b);
        addView(this.f19477c);
        addView(this.f19478d);
        addView(this.f19479e);
    }

    /* renamed from: o */
    private void m25168o() {
        this.f19481g.clear();
        this.f19481g.add(new C10424a(this, new C9835f("", -1, 2, -1, SupportMenu.CATEGORY_MASK), getContext().getResources().getString(R$string.favorite_scene_view_bar_red)));
        this.f19481g.add(new C10424a(this, new C9835f("", -1, 2, -1, -16711936), getContext().getResources().getString(R$string.favorite_scene_view_bar_green)));
        this.f19481g.add(new C10424a(this, new C9835f("", -1, 2, -1, -16776961), getContext().getResources().getString(R$string.favorite_scene_view_bar_blue)));
        this.f19481g.add(new C10424a(this, new C9835f("", -1, 2, -1, -7722014), getContext().getResources().getString(R$string.favorite_scene_view_bar_purple)));
    }

    /* renamed from: p */
    private void m25169p() {
        removeAllViews();
        this.f19476b = m25154a(R$drawable.favorite_scene_item_bg, -35724, getResources().getColor(R$color.common_text_color_description_99), this.f19481g.get(0).mo32879a(), 1);
        this.f19477c = m25154a(R$drawable.favorite_scene_item_bg, -5442447, getResources().getColor(R$color.common_text_color_description_99), this.f19481g.get(1).mo32879a(), 2);
        this.f19478d = m25154a(R$drawable.favorite_scene_item_bg, -8984577, getResources().getColor(R$color.common_text_color_description_99), this.f19481g.get(2).mo32879a(), 3);
        this.f19479e = m25154a(R$drawable.favorite_scene_item_bg, -5541, getResources().getColor(R$color.common_text_color_description_99), this.f19481g.get(3).mo32879a(), 4);
        this.f19480f = m25154a(R$drawable.favorite_scene_item_bg, -4873217, getResources().getColor(R$color.common_text_color_description_99), this.f19481g.get(4).mo32879a(), 5);
        addView(this.f19476b);
        addView(this.f19477c);
        addView(this.f19478d);
        addView(this.f19479e);
        addView(this.f19480f);
    }

    /* renamed from: q */
    private void m25170q() {
        this.f19481g.clear();
        this.f19481g.add(new C10424a(this, new C9835f("", -1, 2, -1, SupportMenu.CATEGORY_MASK), getContext().getResources().getString(R$string.favorite_scene_view_bar_red)));
        this.f19481g.add(new C10424a(this, new C9835f("", -1, 2, -1, -16711936), getContext().getResources().getString(R$string.favorite_scene_view_bar_green)));
        this.f19481g.add(new C10424a(this, new C9835f("", -1, 2, -1, -16776961), getContext().getResources().getString(R$string.favorite_scene_view_bar_blue)));
        this.f19481g.add(new C10424a(this, new C9835f("", -1, 2, -1, -33024), getContext().getResources().getString(R$string.favorite_scene_view_bar_yellow)));
        this.f19481g.add(new C10424a(this, new C9835f("", -1, 2, -1, -7722014), getContext().getResources().getString(R$string.favorite_scene_view_bar_purple)));
    }

    /* renamed from: r */
    private void m25171r() {
        removeAllViews();
        this.f19476b = m25154a(R$drawable.favorite_scene_item_bg, -8315, getResources().getColor(R$color.common_text_color_description_99), this.f19481g.get(0).mo32879a(), 1);
        this.f19477c = m25154a(R$drawable.favorite_scene_item_bg, -3118, getResources().getColor(R$color.common_text_color_description_99), this.f19481g.get(1).mo32879a(), 2);
        this.f19478d = m25154a(R$drawable.favorite_scene_item_bg, -262, getResources().getColor(R$color.common_text_color_description_99), this.f19481g.get(2).mo32879a(), 3);
        this.f19479e = m25154a(R$drawable.favorite_scene_item_bg, -918017, getResources().getColor(R$color.common_text_color_description_99), this.f19481g.get(3).mo32879a(), 4);
        this.f19480f = m25154a(R$drawable.favorite_scene_item_bg, -1705217, getResources().getColor(R$color.common_text_color_description_99), this.f19481g.get(4).mo32879a(), 5);
        addView(this.f19476b);
        addView(this.f19477c);
        addView(this.f19478d);
        addView(this.f19479e);
        addView(this.f19480f);
    }

    /* renamed from: s */
    private void m25172s() {
        removeAllViews();
        this.f19476b = m25154a(R$drawable.favorite_scene_item_bg, -531812, getResources().getColor(R$color.common_text_color_description_99), this.f19481g.get(0).mo32879a(), 1);
        this.f19477c = m25154a(R$drawable.favorite_scene_item_bg, -134187, getResources().getColor(R$color.common_text_color_description_99), this.f19481g.get(1).mo32879a(), 2);
        this.f19478d = m25154a(R$drawable.favorite_scene_item_bg, -262, getResources().getColor(R$color.common_text_color_description_99), this.f19481g.get(2).mo32879a(), 3);
        this.f19479e = m25154a(R$drawable.favorite_scene_item_bg, -262661, getResources().getColor(R$color.common_text_color_description_99), this.f19481g.get(3).mo32879a(), 4);
        this.f19480f = m25154a(R$drawable.favorite_scene_item_bg, -590339, getResources().getColor(R$color.common_text_color_description_99), this.f19481g.get(4).mo32879a(), 5);
        addView(this.f19476b);
        addView(this.f19477c);
        addView(this.f19478d);
        addView(this.f19479e);
        addView(this.f19480f);
    }

    /* renamed from: u */
    private void m25173u() {
        this.f19476b.setClickable(true);
        this.f19477c.setClickable(true);
        this.f19478d.setClickable(true);
        this.f19479e.setClickable(true);
        TextView textView = this.f19480f;
        if (textView != null) {
            textView.setClickable(true);
            this.f19480f.setOnClickListener(this);
        }
        this.f19476b.setOnClickListener(this);
        this.f19477c.setOnClickListener(this);
        this.f19478d.setOnClickListener(this);
        this.f19479e.setOnClickListener(this);
    }

    public void onClick(View view) {
        Context context;
        Context context2;
        int i;
        int id = view.getId();
        boolean z = true;
        if (id == 1) {
            C4200i iVar = this.f19482h;
            if (!(iVar instanceof C6017a) || this.f19483i != 2) {
                this.f19482h.mo23355x1(this.f19481g.get(0).mo32880b());
            } else {
                ((C6017a) iVar).mo27595o2(this.f19481g.get(0).mo32880b());
            }
        }
        if (id == 2) {
            C4200i iVar2 = this.f19482h;
            if (!(iVar2 instanceof C6017a) || this.f19483i != 2) {
                this.f19482h.mo23355x1(this.f19481g.get(1).mo32880b());
            } else {
                ((C6017a) iVar2).mo27595o2(this.f19481g.get(1).mo32880b());
            }
        }
        if (id == 3) {
            C4200i iVar3 = this.f19482h;
            if (!(iVar3 instanceof C6017a) || this.f19483i != 2) {
                this.f19482h.mo23355x1(this.f19481g.get(2).mo32880b());
            } else {
                ((C6017a) iVar3).mo27595o2(this.f19481g.get(2).mo32880b());
            }
        }
        C4200i iVar4 = this.f19482h;
        if ((!(iVar4 instanceof C6895j0) && !(iVar4 instanceof C7497z)) || !this.f19482h.mo23408d0().mo27671W()) {
            z = false;
        }
        if (id == 4) {
            if (!z) {
                C4200i iVar5 = this.f19482h;
                if (!(iVar5 instanceof C6017a) || this.f19483i != 2) {
                    this.f19482h.mo23355x1(this.f19481g.get(3).mo32880b());
                } else {
                    ((C6017a) iVar5).mo27595o2(this.f19481g.get(3).mo32880b());
                }
            }
            context = view.getContext();
            context2 = view.getContext();
            i = R$string.favorite_scene_bar_kidmode_exceed;
            Toast.makeText(context, context2.getText(i), 0).show();
        }
        if (id == 5) {
            if (!z) {
                C4200i iVar6 = this.f19482h;
                if (!(iVar6 instanceof C6017a) || this.f19483i != 2) {
                    this.f19482h.mo23355x1(this.f19481g.get(4).mo32880b());
                } else {
                    ((C6017a) iVar6).mo27595o2(this.f19481g.get(4).mo32880b());
                }
            }
            context = view.getContext();
            context2 = view.getContext();
            i = R$string.favorite_scene_bar_kidmode_exceed;
            Toast.makeText(context, context2.getText(i), 0).show();
        }
        context = view.getContext();
        context2 = view.getContext();
        i = R$string.common_text_apply_success;
        Toast.makeText(context, context2.getText(i), 0).show();
    }

    public void setDeviceId(String str) {
        if (getChildCount() == 0) {
            C4200i o0 = C4257w.m11953o0(str);
            this.f19482h = o0;
            f19474j = (o0 == null || !"yeelink.light.color6".equals(o0.mo23395T())) ? 5 : 4;
            m25166m();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo32877t(Context context, AttributeSet attributeSet) {
        this.f19475a = getContext().getResources().getDisplayMetrics().widthPixels;
    }

    /* renamed from: v */
    public void mo32878v(int i, String str) {
        this.f19483i = i;
        if (i == 1) {
            m25155b(str);
            m25171r();
        } else if (i == 2) {
            m25170q();
            m25169p();
        }
        m25173u();
    }
}

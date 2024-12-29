package com.yeelight.yeelib.p142ui.view;

import android.content.Context;
import android.content.res.Resources;
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
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.C6091a;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.C8311d;
import com.yeelight.yeelib.models.C8313f;
import com.yeelight.yeelib.models.C8314g;
import com.yeelight.yeelib.models.C8327s;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.p194io.FilenameUtils;
import org.apache.commons.p194io.IOUtils;
import p051j4.C9193k;
import p223w3.C10595a0;
import p223w3.C11311k0;
import p227x3.C11972i;

/* renamed from: com.yeelight.yeelib.ui.view.FavoriteSceneViewBar */
public class FavoriteSceneViewBar extends LinearLayout implements View.OnClickListener {

    /* renamed from: j */
    private static int f15736j = 5;

    /* renamed from: a */
    private int f15737a;

    /* renamed from: b */
    private TextView f15738b;

    /* renamed from: c */
    private TextView f15739c;

    /* renamed from: d */
    private TextView f15740d;

    /* renamed from: e */
    private TextView f15741e;

    /* renamed from: f */
    private TextView f15742f;

    /* renamed from: g */
    private List<C8803a> f15743g = new ArrayList();

    /* renamed from: h */
    private C3012e f15744h;

    /* renamed from: i */
    private int f15745i = -1;

    /* renamed from: com.yeelight.yeelib.ui.view.FavoriteSceneViewBar$a */
    private class C8803a {

        /* renamed from: a */
        private C8327s f15746a;

        /* renamed from: b */
        private String f15747b;

        C8803a(FavoriteSceneViewBar favoriteSceneViewBar, C8327s sVar, String str) {
            this.f15746a = sVar;
            this.f15747b = str;
        }

        /* renamed from: a */
        public String mo36249a() {
            return this.f15747b;
        }

        /* renamed from: b */
        public C8327s mo36250b() {
            return this.f15746a;
        }
    }

    static {
        Class<FavoriteSceneViewBar> cls = FavoriteSceneViewBar.class;
    }

    public FavoriteSceneViewBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo36247t(context, attributeSet);
    }

    /* renamed from: a */
    private TextView m20765a(int i, int i2, int i3, String str, int i4) {
        TextView textView = new TextView(getContext());
        Drawable drawable = getResources().getDrawable(i);
        if (i2 != -1) {
            ((GradientDrawable) drawable).setColor(i2);
        }
        if (i3 != -1) {
            ((GradientDrawable) drawable).setStroke(2, i3);
        }
        int b = C9193k.m22151b(getContext(), 20.0f);
        drawable.setBounds(0, 0, b, b);
        textView.setText(str);
        textView.setTextColor(getResources().getColor(R$color.common_text_color_secondary_66));
        textView.setTextSize(2, 12.0f);
        textView.setGravity(81);
        textView.setCompoundDrawables((Drawable) null, drawable, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(C9193k.m22151b(getContext(), 3.0f));
        textView.setLayoutParams(new LinearLayout.LayoutParams((this.f15737a - (C9193k.m22151b(getContext(), 29.0f) * 2)) / f15736j, -2));
        textView.setId(i4);
        textView.setSingleLine();
        return textView;
    }

    /* renamed from: b */
    private void m20766b(String str) {
        C11972i.C11973a b = C11972i.m30704b(str);
        if (b != null) {
            if (b.mo42547b() == 3000 && b.mo42546a() == 5000) {
                m20772h();
                return;
            } else if (b.mo42547b() == 3000 && b.mo42546a() == 6500) {
                m20774j();
                return;
            } else if (b.mo42547b() == 1700 && b.mo42546a() == 6500) {
                m20767c();
                return;
            } else if (b.mo42547b() == 2700 && b.mo42546a() == 5700) {
                m20770f();
                return;
            } else if (b.mo42547b() == 2600 && b.mo42546a() == 5000) {
                m20768d();
                return;
            } else if (b.mo42547b() == 3000 && b.mo42546a() == 5700) {
                m20773i();
                return;
            } else if (b.mo42547b() == 2600 && b.mo42546a() == 6100) {
                m20769e();
                return;
            }
        }
        m20771g();
    }

    /* renamed from: c */
    private void m20767c() {
        this.f15743g.clear();
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 1700), "1700K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 3500), "3500K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 4000), "4000K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 5500), "5500K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 6500), "6500K"));
    }

    /* renamed from: d */
    private void m20768d() {
        this.f15743g.clear();
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 2600), "2600K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 3500), "3500K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 4000), "4000K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 4500), "4500K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 5000), "5000K"));
    }

    /* renamed from: e */
    private void m20769e() {
        this.f15743g.clear();
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 2600), "2600K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 3500), "3500K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 4000), "4000K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 5500), "5500K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 6100), "6100K"));
    }

    /* renamed from: f */
    private void m20770f() {
        this.f15743g.clear();
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 2700), "2700K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 3500), "3500K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 4000), "4000K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 5000), "5000K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 5700), "5700K"));
    }

    /* renamed from: g */
    private void m20771g() {
        this.f15743g.clear();
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 2700), "2700K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 3500), "3500K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 4000), "4000K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 5500), "5500K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 6500), "6500K"));
    }

    /* renamed from: h */
    private void m20772h() {
        this.f15743g.clear();
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 2700), "3000K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 3500), "3500K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 4000), "4000K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 4500), "4500K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 5000), "5000K"));
    }

    /* renamed from: i */
    private void m20773i() {
        this.f15743g.clear();
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, PathInterpolatorCompat.MAX_NUM_POINTS), "3000K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 3500), "3500K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 4000), "4000K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 5000), "5000K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 5700), "5700K"));
    }

    /* renamed from: j */
    private void m20774j() {
        this.f15743g.clear();
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, PathInterpolatorCompat.MAX_NUM_POINTS), "3000K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 3500), "3500K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 4000), "4000K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 5500), "5500K"));
        this.f15743g.add(new C8803a(this, new C8314g("", -1, 3, -1, 6500), "6500K"));
    }

    /* renamed from: k */
    private void m20775k() {
        removeAllViews();
        int i = R$drawable.favorite_scene_item_bg;
        Resources resources = getResources();
        int i2 = R$color.common_text_color_description_99;
        this.f15738b = m20765a(i, -1660672, resources.getColor(i2), this.f15743g.get(0).mo36249a(), 1);
        this.f15739c = m20765a(i, -804843, getResources().getColor(i2), this.f15743g.get(1).mo36249a(), 2);
        this.f15740d = m20765a(i, -12208, getResources().getColor(i2), this.f15743g.get(2).mo36249a(), 3);
        this.f15741e = m20765a(i, -7017, getResources().getColor(i2), this.f15743g.get(3).mo36249a(), 4);
        this.f15742f = m20765a(i, -3118, getResources().getColor(i2), this.f15743g.get(4).mo36249a(), 5);
        addView(this.f15738b);
        addView(this.f15739c);
        addView(this.f15740d);
        addView(this.f15741e);
        addView(this.f15742f);
    }

    /* renamed from: l */
    private void m20776l() {
        this.f15743g.clear();
        this.f15743g.add(new C8803a(this, new C8311d("", -1, 1, 1), "1%"));
        this.f15743g.add(new C8803a(this, new C8311d("", -1, 1, 25), "25%"));
        this.f15743g.add(new C8803a(this, new C8311d("", -1, 1, 50), "50%"));
        this.f15743g.add(new C8803a(this, new C8311d("", -1, 1, 75), "75%"));
        this.f15743g.add(new C8803a(this, new C8311d("", -1, 1, 100), "100%"));
    }

    /* renamed from: m */
    private void m20777m() {
        String i1 = this.f15744h.mo23144i1();
        i1.hashCode();
        char c = 65535;
        switch (i1.hashCode()) {
            case -1644531059:
                if (i1.equals("yeelink.bhf_light.v1")) {
                    c = 0;
                    break;
                }
                break;
            case -1462015191:
                if (i1.equals("yeelink.light.ceiling10")) {
                    c = 1;
                    break;
                }
                break;
            case -1462015190:
                if (i1.equals("yeelink.light.ceiling11")) {
                    c = 2;
                    break;
                }
                break;
            case -1462015189:
                if (i1.equals("yeelink.light.ceiling12")) {
                    c = 3;
                    break;
                }
                break;
            case -1462015188:
                if (i1.equals("yeelink.light.ceiling13")) {
                    c = 4;
                    break;
                }
                break;
            case -1462015187:
                if (i1.equals("yeelink.light.ceiling14")) {
                    c = 5;
                    break;
                }
                break;
            case -1462015186:
                if (i1.equals("yeelink.light.ceiling15")) {
                    c = 6;
                    break;
                }
                break;
            case -1462015185:
                if (i1.equals("yeelink.light.ceiling16")) {
                    c = 7;
                    break;
                }
                break;
            case -1462015184:
                if (i1.equals("yeelink.light.ceiling17")) {
                    c = 8;
                    break;
                }
                break;
            case -1462015183:
                if (i1.equals("yeelink.light.ceiling18")) {
                    c = 9;
                    break;
                }
                break;
            case -1462015182:
                if (i1.equals("yeelink.light.ceiling19")) {
                    c = 10;
                    break;
                }
                break;
            case -1462015160:
                if (i1.equals("yeelink.light.ceiling20")) {
                    c = 11;
                    break;
                }
                break;
            case -1462015159:
                if (i1.equals("yeelink.light.ceiling21")) {
                    c = 12;
                    break;
                }
                break;
            case -1462015158:
                if (i1.equals("yeelink.light.ceiling22")) {
                    c = 13;
                    break;
                }
                break;
            case -1462015157:
                if (i1.equals("yeelink.light.ceiling23")) {
                    c = 14;
                    break;
                }
                break;
            case -1462015156:
                if (i1.equals("yeelink.light.ceiling24")) {
                    c = 15;
                    break;
                }
                break;
            case -1400275319:
                if (i1.equals("yeelink.light.ble1")) {
                    c = 16;
                    break;
                }
                break;
            case -1317475940:
                if (i1.equals("yeelink.light.ceil26")) {
                    c = 17;
                    break;
                }
                break;
            case -1317475939:
                if (i1.equals("yeelink.light.ceil27")) {
                    c = 18;
                    break;
                }
                break;
            case -1317475937:
                if (i1.equals("yeelink.light.ceil29")) {
                    c = 19;
                    break;
                }
                break;
            case -1317475915:
                if (i1.equals("yeelink.light.ceil30")) {
                    c = 20;
                    break;
                }
                break;
            case -1317475914:
                if (i1.equals("yeelink.light.ceil31")) {
                    c = 21;
                    break;
                }
                break;
            case -1317475913:
                if (i1.equals("yeelink.light.ceil32")) {
                    c = 22;
                    break;
                }
                break;
            case -1317475912:
                if (i1.equals("yeelink.light.ceil33")) {
                    c = 23;
                    break;
                }
                break;
            case -1317475910:
                if (i1.equals("yeelink.light.ceil35")) {
                    c = 24;
                    break;
                }
                break;
            case -1308146495:
                if (i1.equals("yeelink.light.color1")) {
                    c = 25;
                    break;
                }
                break;
            case -1308146494:
                if (i1.equals("yeelink.light.color2")) {
                    c = 26;
                    break;
                }
                break;
            case -1308146493:
                if (i1.equals("yeelink.light.color3")) {
                    c = 27;
                    break;
                }
                break;
            case -1308146492:
                if (i1.equals("yeelink.light.color4")) {
                    c = 28;
                    break;
                }
                break;
            case -1308146491:
                if (i1.equals("yeelink.light.color5")) {
                    c = 29;
                    break;
                }
                break;
            case -1308146490:
                if (i1.equals("yeelink.light.color6")) {
                    c = 30;
                    break;
                }
                break;
            case -1308146488:
                if (i1.equals("yeelink.light.color8")) {
                    c = 31;
                    break;
                }
                break;
            case -1308146447:
                if (i1.equals("yeelink.light.colora")) {
                    c = ' ';
                    break;
                }
                break;
            case -1308146446:
                if (i1.equals("yeelink.light.colorb")) {
                    c = '!';
                    break;
                }
                break;
            case -1308146445:
                if (i1.equals("yeelink.light.colorc")) {
                    c = '\"';
                    break;
                }
                break;
            case -1308146443:
                if (i1.equals("yeelink.light.colore")) {
                    c = '#';
                    break;
                }
                break;
            case -1282176368:
                if (i1.equals("yeelink.light.dn2grp")) {
                    c = '$';
                    break;
                }
                break;
            case -1235140472:
                if (i1.equals("yeelink.light.fancl1")) {
                    c = '%';
                    break;
                }
                break;
            case -1235140471:
                if (i1.equals("yeelink.light.fancl2")) {
                    c = '&';
                    break;
                }
                break;
            case -1235140468:
                if (i1.equals("yeelink.light.fancl5")) {
                    c = '\'';
                    break;
                }
                break;
            case -1235140467:
                if (i1.equals("yeelink.light.fancl6")) {
                    c = '(';
                    break;
                }
                break;
            case -1063384694:
                if (i1.equals("yeelink.light.lamp10")) {
                    c = ')';
                    break;
                }
                break;
            case -1063384689:
                if (i1.equals("yeelink.light.lamp15")) {
                    c = '*';
                    break;
                }
                break;
            case -1063384685:
                if (i1.equals("yeelink.light.lamp19")) {
                    c = '+';
                    break;
                }
                break;
            case -1035626052:
                if (i1.equals("yeelink.light.mb1grp")) {
                    c = ',';
                    break;
                }
                break;
            case -1035596261:
                if (i1.equals("yeelink.light.mb2grp")) {
                    c = '-';
                    break;
                }
                break;
            case -948847040:
                if (i1.equals("yeelink.light.panel1")) {
                    c = FilenameUtils.EXTENSION_SEPARATOR;
                    break;
                }
                break;
            case -948847038:
                if (i1.equals("yeelink.light.panel3")) {
                    c = IOUtils.DIR_SEPARATOR_UNIX;
                    break;
                }
                break;
            case -939061393:
                if (i1.equals("yeelink.light.plate2")) {
                    c = '0';
                    break;
                }
                break;
            case -888668266:
                if (i1.equals("yilai.light.ceiling1")) {
                    c = '1';
                    break;
                }
                break;
            case -888668265:
                if (i1.equals("yilai.light.ceiling2")) {
                    c = '2';
                    break;
                }
                break;
            case -888668264:
                if (i1.equals("yilai.light.ceiling3")) {
                    c = '3';
                    break;
                }
                break;
            case -850921852:
                if (i1.equals("yeelink.light.sp1grp")) {
                    c = '4';
                    break;
                }
                break;
            case -845289556:
                if (i1.equals("yeelink.light.strip1")) {
                    c = '5';
                    break;
                }
                break;
            case -845289555:
                if (i1.equals("yeelink.light.strip2")) {
                    c = '6';
                    break;
                }
                break;
            case -845289553:
                if (i1.equals("yeelink.light.strip4")) {
                    c = '7';
                    break;
                }
                break;
            case -845289551:
                if (i1.equals("yeelink.light.strip6")) {
                    c = '8';
                    break;
                }
                break;
            case -845289549:
                if (i1.equals("yeelink.light.strip8")) {
                    c = '9';
                    break;
                }
                break;
            case -845289508:
                if (i1.equals("yeelink.light.stripa")) {
                    c = ':';
                    break;
                }
                break;
            case -458141175:
                if (i1.equals("yeelink.light.ceila")) {
                    c = ';';
                    break;
                }
                break;
            case -458141174:
                if (i1.equals("yeelink.light.ceilb")) {
                    c = '<';
                    break;
                }
                break;
            case -458141173:
                if (i1.equals("yeelink.light.ceilc")) {
                    c = '=';
                    break;
                }
                break;
            case -458141172:
                if (i1.equals("yeelink.light.ceild")) {
                    c = '>';
                    break;
                }
                break;
            case -458141171:
                if (i1.equals("yeelink.light.ceile")) {
                    c = '?';
                    break;
                }
                break;
            case -449944730:
                if (i1.equals("yeelink.light.lamp1")) {
                    c = '@';
                    break;
                }
                break;
            case -449944729:
                if (i1.equals("yeelink.light.lamp2")) {
                    c = 'A';
                    break;
                }
                break;
            case -449944728:
                if (i1.equals("yeelink.light.lamp3")) {
                    c = 'B';
                    break;
                }
                break;
            case -449944727:
                if (i1.equals("yeelink.light.lamp4")) {
                    c = 'C';
                    break;
                }
                break;
            case -449944724:
                if (i1.equals("yeelink.light.lamp7")) {
                    c = 'D';
                    break;
                }
                break;
            case -449944723:
                if (i1.equals("yeelink.light.lamp8")) {
                    c = 'E';
                    break;
                }
                break;
            case -449944722:
                if (i1.equals("yeelink.light.lamp9")) {
                    c = 'F';
                    break;
                }
                break;
            case -448603205:
                if (i1.equals("yeelink.light.mono1")) {
                    c = 'G';
                    break;
                }
                break;
            case -448603202:
                if (i1.equals("yeelink.light.mono4")) {
                    c = 'H';
                    break;
                }
                break;
            case -448603201:
                if (i1.equals("yeelink.light.mono5")) {
                    c = 'I';
                    break;
                }
                break;
            case -448603157:
                if (i1.equals("yeelink.light.monoa")) {
                    c = 'J';
                    break;
                }
                break;
            case -448603156:
                if (i1.equals("yeelink.light.monob")) {
                    c = 'K';
                    break;
                }
                break;
            case -443031172:
                if (i1.equals("yeelink.light.spot1")) {
                    c = 'L';
                    break;
                }
                break;
            case 922669543:
                if (i1.equals("yeelink.light.ceiling1")) {
                    c = 'M';
                    break;
                }
                break;
            case 922669544:
                if (i1.equals("yeelink.light.ceiling2")) {
                    c = 'N';
                    break;
                }
                break;
            case 922669545:
                if (i1.equals("yeelink.light.ceiling3")) {
                    c = 'O';
                    break;
                }
                break;
            case 922669546:
                if (i1.equals("yeelink.light.ceiling4")) {
                    c = 'P';
                    break;
                }
                break;
            case 922669547:
                if (i1.equals("yeelink.light.ceiling5")) {
                    c = 'Q';
                    break;
                }
                break;
            case 922669548:
                if (i1.equals("yeelink.light.ceiling6")) {
                    c = 'R';
                    break;
                }
                break;
            case 922669549:
                if (i1.equals("yeelink.light.ceiling7")) {
                    c = 'S';
                    break;
                }
                break;
            case 922669550:
                if (i1.equals("yeelink.light.ceiling8")) {
                    c = 'T';
                    break;
                }
                break;
            case 922669551:
                if (i1.equals("yeelink.light.ceiling9")) {
                    c = 'U';
                    break;
                }
                break;
            case 1201756974:
                if (i1.equals("yeelink.light.ct2")) {
                    c = 'V';
                    break;
                }
                break;
            case 1201757021:
                if (i1.equals("yeelink.light.cta")) {
                    c = 'W';
                    break;
                }
                break;
            case 1201757023:
                if (i1.equals("yeelink.light.ctc")) {
                    c = 'X';
                    break;
                }
                break;
            case 1201766335:
                if (i1.equals("yeelink.light.ml1")) {
                    c = 'Y';
                    break;
                }
                break;
            case 1201766336:
                if (i1.equals("yeelink.light.ml2")) {
                    c = 'Z';
                    break;
                }
                break;
            case 1623724661:
                if (i1.equals("yeelink.light.bslamp1")) {
                    c = '[';
                    break;
                }
                break;
            case 1623724662:
                if (i1.equals("yeelink.light.bslamp2")) {
                    c = IOUtils.DIR_SEPARATOR_WINDOWS;
                    break;
                }
                break;
            case 1623724663:
                if (i1.equals("yeelink.light.bslamp3")) {
                    c = ']';
                    break;
                }
                break;
            case 2102612488:
                if (i1.equals("yeelink.light.meshbulb1")) {
                    c = '^';
                    break;
                }
                break;
            case 2102612489:
                if (i1.equals("yeelink.light.meshbulb2")) {
                    c = '_';
                    break;
                }
                break;
            case 2146130361:
                if (i1.equals("yeelink.light.dnlight2")) {
                    c = '`';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
            case '*':
            case ',':
            case '-':
            case '/':
            case '1':
            case '2':
            case '3':
            case '4':
            case '7':
            case ';':
            case '<':
            case '=':
            case '>':
            case '?':
            case '@':
            case 'A':
            case 'E':
            case 'F':
            case 'L':
            case 'M':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '^':
            case '_':
            case '`':
                m20766b(this.f15744h.mo23144i1());
                m20782r();
                break;
            case 16:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 31:
            case ' ':
            case '!':
            case '\"':
            case '#':
            case ')':
            case '+':
            case '0':
            case '5':
            case '6':
            case '8':
            case '9':
            case ':':
            case '[':
            case '\\':
            case ']':
                m20781q();
                m20780p();
                break;
            case 30:
                m20779o();
                m20778n();
                break;
            case 'C':
            case 'D':
                m20766b(this.f15744h.mo23144i1());
                m20783s();
                break;
            default:
                m20776l();
                m20775k();
                break;
        }
        m20784u();
    }

    /* renamed from: n */
    private void m20778n() {
        removeAllViews();
        int i = R$drawable.favorite_scene_item_bg;
        Resources resources = getResources();
        int i2 = R$color.common_text_color_description_99;
        this.f15738b = m20765a(i, -35724, resources.getColor(i2), this.f15743g.get(0).mo36249a(), 1);
        this.f15739c = m20765a(i, -5442447, getResources().getColor(i2), this.f15743g.get(1).mo36249a(), 2);
        this.f15740d = m20765a(i, -8984577, getResources().getColor(i2), this.f15743g.get(2).mo36249a(), 3);
        this.f15741e = m20765a(i, -4873217, getResources().getColor(i2), this.f15743g.get(3).mo36249a(), 4);
        addView(this.f15738b);
        addView(this.f15739c);
        addView(this.f15740d);
        addView(this.f15741e);
    }

    /* renamed from: o */
    private void m20779o() {
        this.f15743g.clear();
        this.f15743g.add(new C8803a(this, new C8313f("", -1, 2, -1, SupportMenu.CATEGORY_MASK), getContext().getResources().getString(R$string.favorite_scene_view_bar_red)));
        this.f15743g.add(new C8803a(this, new C8313f("", -1, 2, -1, -16711936), getContext().getResources().getString(R$string.favorite_scene_view_bar_green)));
        this.f15743g.add(new C8803a(this, new C8313f("", -1, 2, -1, -16776961), getContext().getResources().getString(R$string.favorite_scene_view_bar_blue)));
        this.f15743g.add(new C8803a(this, new C8313f("", -1, 2, -1, -7722014), getContext().getResources().getString(R$string.favorite_scene_view_bar_purple)));
    }

    /* renamed from: p */
    private void m20780p() {
        removeAllViews();
        int i = R$drawable.favorite_scene_item_bg;
        Resources resources = getResources();
        int i2 = R$color.common_text_color_description_99;
        this.f15738b = m20765a(i, -35724, resources.getColor(i2), this.f15743g.get(0).mo36249a(), 1);
        this.f15739c = m20765a(i, -5442447, getResources().getColor(i2), this.f15743g.get(1).mo36249a(), 2);
        this.f15740d = m20765a(i, -8984577, getResources().getColor(i2), this.f15743g.get(2).mo36249a(), 3);
        this.f15741e = m20765a(i, -5541, getResources().getColor(i2), this.f15743g.get(3).mo36249a(), 4);
        this.f15742f = m20765a(i, -4873217, getResources().getColor(i2), this.f15743g.get(4).mo36249a(), 5);
        addView(this.f15738b);
        addView(this.f15739c);
        addView(this.f15740d);
        addView(this.f15741e);
        addView(this.f15742f);
    }

    /* renamed from: q */
    private void m20781q() {
        this.f15743g.clear();
        this.f15743g.add(new C8803a(this, new C8313f("", -1, 2, -1, SupportMenu.CATEGORY_MASK), getContext().getResources().getString(R$string.favorite_scene_view_bar_red)));
        this.f15743g.add(new C8803a(this, new C8313f("", -1, 2, -1, -16711936), getContext().getResources().getString(R$string.favorite_scene_view_bar_green)));
        this.f15743g.add(new C8803a(this, new C8313f("", -1, 2, -1, -16776961), getContext().getResources().getString(R$string.favorite_scene_view_bar_blue)));
        this.f15743g.add(new C8803a(this, new C8313f("", -1, 2, -1, -33024), getContext().getResources().getString(R$string.favorite_scene_view_bar_yellow)));
        this.f15743g.add(new C8803a(this, new C8313f("", -1, 2, -1, -7722014), getContext().getResources().getString(R$string.favorite_scene_view_bar_purple)));
    }

    /* renamed from: r */
    private void m20782r() {
        removeAllViews();
        int i = R$drawable.favorite_scene_item_bg;
        Resources resources = getResources();
        int i2 = R$color.common_text_color_description_99;
        this.f15738b = m20765a(i, -8315, resources.getColor(i2), this.f15743g.get(0).mo36249a(), 1);
        this.f15739c = m20765a(i, -3118, getResources().getColor(i2), this.f15743g.get(1).mo36249a(), 2);
        this.f15740d = m20765a(i, -262, getResources().getColor(i2), this.f15743g.get(2).mo36249a(), 3);
        this.f15741e = m20765a(i, -918017, getResources().getColor(i2), this.f15743g.get(3).mo36249a(), 4);
        this.f15742f = m20765a(i, -1705217, getResources().getColor(i2), this.f15743g.get(4).mo36249a(), 5);
        addView(this.f15738b);
        addView(this.f15739c);
        addView(this.f15740d);
        addView(this.f15741e);
        addView(this.f15742f);
    }

    /* renamed from: s */
    private void m20783s() {
        removeAllViews();
        int i = R$drawable.favorite_scene_item_bg;
        Resources resources = getResources();
        int i2 = R$color.common_text_color_description_99;
        this.f15738b = m20765a(i, -531812, resources.getColor(i2), this.f15743g.get(0).mo36249a(), 1);
        this.f15739c = m20765a(i, -134187, getResources().getColor(i2), this.f15743g.get(1).mo36249a(), 2);
        this.f15740d = m20765a(i, -262, getResources().getColor(i2), this.f15743g.get(2).mo36249a(), 3);
        this.f15741e = m20765a(i, -262661, getResources().getColor(i2), this.f15743g.get(3).mo36249a(), 4);
        this.f15742f = m20765a(i, -590339, getResources().getColor(i2), this.f15743g.get(4).mo36249a(), 5);
        addView(this.f15738b);
        addView(this.f15739c);
        addView(this.f15740d);
        addView(this.f15741e);
        addView(this.f15742f);
    }

    /* renamed from: u */
    private void m20784u() {
        this.f15738b.setClickable(true);
        this.f15739c.setClickable(true);
        this.f15740d.setClickable(true);
        this.f15741e.setClickable(true);
        TextView textView = this.f15742f;
        if (textView != null) {
            textView.setClickable(true);
            this.f15742f.setOnClickListener(this);
        }
        this.f15738b.setOnClickListener(this);
        this.f15739c.setOnClickListener(this);
        this.f15740d.setOnClickListener(this);
        this.f15741e.setOnClickListener(this);
    }

    public void onClick(View view) {
        Context context;
        Context context2;
        int i;
        int id = view.getId();
        boolean z = true;
        if (id == 1) {
            C3012e eVar = this.f15744h;
            if (!(eVar instanceof C6091a) || this.f15745i != 2) {
                eVar.mo23168x1(this.f15743g.get(0).mo36250b());
            } else {
                ((C6091a) eVar).mo31661o2(this.f15743g.get(0).mo36250b());
            }
        }
        if (id == 2) {
            C3012e eVar2 = this.f15744h;
            if (!(eVar2 instanceof C6091a) || this.f15745i != 2) {
                eVar2.mo23168x1(this.f15743g.get(1).mo36250b());
            } else {
                ((C6091a) eVar2).mo31661o2(this.f15743g.get(1).mo36250b());
            }
        }
        if (id == 3) {
            C3012e eVar3 = this.f15744h;
            if (!(eVar3 instanceof C6091a) || this.f15745i != 2) {
                eVar3.mo23168x1(this.f15743g.get(2).mo36250b());
            } else {
                ((C6091a) eVar3).mo31661o2(this.f15743g.get(2).mo36250b());
            }
        }
        C3012e eVar4 = this.f15744h;
        if ((!(eVar4 instanceof C11311k0) && !(eVar4 instanceof C10595a0)) || !eVar4.mo23221d0().mo31572X()) {
            z = false;
        }
        if (id == 4) {
            if (!z) {
                C3012e eVar5 = this.f15744h;
                if (!(eVar5 instanceof C6091a) || this.f15745i != 2) {
                    eVar5.mo23168x1(this.f15743g.get(3).mo36250b());
                } else {
                    ((C6091a) eVar5).mo31661o2(this.f15743g.get(3).mo36250b());
                }
            }
            context = view.getContext();
            context2 = view.getContext();
            i = R$string.favorite_scene_bar_kidmode_exceed;
            Toast.makeText(context, context2.getText(i), 0).show();
        }
        if (id == 5) {
            if (!z) {
                C3012e eVar6 = this.f15744h;
                if (!(eVar6 instanceof C6091a) || this.f15745i != 2) {
                    eVar6.mo23168x1(this.f15743g.get(4).mo36250b());
                } else {
                    ((C6091a) eVar6).mo31661o2(this.f15743g.get(4).mo36250b());
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
            C3012e r0 = YeelightDeviceManager.m7804r0(str);
            this.f15744h = r0;
            f15736j = (r0 == null || !"yeelink.light.color6".equals(r0.mo23208T())) ? 5 : 4;
            m20777m();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo36247t(Context context, AttributeSet attributeSet) {
        this.f15737a = getContext().getResources().getDisplayMetrics().widthPixels;
    }

    /* renamed from: v */
    public void mo36248v(int i, String str) {
        this.f15745i = i;
        if (i == 1) {
            m20766b(str);
            m20782r();
        } else if (i == 2) {
            m20781q();
            m20780p();
        }
        m20784u();
    }
}

package com.yeelight.yeelib.p152f;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.miot.api.Constants;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p153g.C9853v;
import com.yeelight.yeelib.p153g.C9854w;
import com.yeelight.yeelib.p153g.C9855x;
import com.yeelight.yeelib.p187h.C9862d;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import com.yeelight.yeelib.utils.C4308b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.f.r */
public class C4239r {

    /* renamed from: e */
    private static C4239r f7361e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static List<C9855x> f7362f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static List<C9855x> f7363g;

    /* renamed from: h */
    private static List<C9853v> f7364h;

    /* renamed from: a */
    private List<C9855x> f7365a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private List<C9855x> f7366b = new CopyOnWriteArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<C4242b> f7367c = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List<String> f7368d = new ArrayList();

    /* renamed from: com.yeelight.yeelib.f.r$a */
    class C4240a implements C9874b<String> {

        /* renamed from: com.yeelight.yeelib.f.r$a$a */
        class C4241a implements Runnable {
            C4241a() {
            }

            public void run() {
                for (C4242b A : C4239r.this.f7367c) {
                    A.mo23588A();
                }
            }
        }

        C4240a() {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            synchronized (new byte[]{0}) {
                "Get product from cloud: " + str;
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.getInt("code") == 1) {
                        for (C9855x h : C4239r.f7362f) {
                            h.mo31847h(false);
                        }
                        for (C9855x h2 : C4239r.f7363g) {
                            h2.mo31847h(false);
                        }
                        if (C4239r.this.f7368d != null) {
                            C4239r.this.f7368d.clear();
                        }
                        JSONArray jSONArray = jSONObject.getJSONArray(Constants.EXTRA_PUSH_MESSAGE);
                        for (int i = 0; i < jSONArray.length(); i++) {
                            String string = jSONArray.getJSONObject(i).getString("model");
                            int i2 = jSONArray.getJSONObject(i).getInt("app_least_hw_version");
                            if (C4239r.this.f7368d != null) {
                                C4239r.this.f7368d.add(string);
                            }
                            Iterator it = C4239r.f7362f.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                C9855x xVar = (C9855x) it.next();
                                if (xVar.mo31841c().equals(string)) {
                                    "Get product model : " + string;
                                    xVar.mo31847h(true);
                                    xVar.mo31848i(i2);
                                    break;
                                }
                            }
                            Iterator it2 = C4239r.f7363g.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                C9855x xVar2 = (C9855x) it2.next();
                                if (xVar2.mo31841c().equals(string)) {
                                    "Get product model : " + string;
                                    xVar2.mo31847h(true);
                                    xVar2.mo31848i(i2);
                                    break;
                                }
                            }
                        }
                        C4239r.this.mo23585t();
                        new Handler(Looper.getMainLooper()).post(new C4241a());
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }

        public void onFailure(int i, String str) {
            "OnFailure Exception = " + str;
        }
    }

    /* renamed from: com.yeelight.yeelib.f.r$b */
    public interface C4242b {
        /* renamed from: A */
        void mo23588A();
    }

    public C4239r() {
        m11808n();
        mo23585t();
    }

    /* renamed from: g */
    public static synchronized C4239r m11807g() {
        C4239r rVar;
        synchronized (C4239r.class) {
            if (f7361e == null) {
                f7361e = new C4239r();
            }
            rVar = f7361e;
        }
        return rVar;
    }

    /* renamed from: n */
    private void m11808n() {
        Resources resources = C4297y.f7456e.getResources();
        List<C9855x> list = f7362f;
        if (list != null) {
            list.clear();
        } else {
            f7362f = new CopyOnWriteArrayList();
        }
        List<C9855x> list2 = f7363g;
        if (list2 != null) {
            list2.clear();
        } else {
            f7363g = new CopyOnWriteArrayList();
        }
        List<C9853v> list3 = f7364h;
        if (list3 != null) {
            list3.clear();
        } else {
            f7364h = new CopyOnWriteArrayList();
        }
        C9855x xVar = new C9855x();
        xVar.mo31849j(R$drawable.icon_yeelight_device_badge_group_big);
        xVar.mo31851l(resources.getString(R$string.yeelight_device_name_group));
        xVar.mo31850k("yeelink.light.group");
        xVar.mo31847h(false);
        xVar.mo31846g(false);
        f7362f.add(xVar);
        C9855x xVar2 = new C9855x();
        xVar2.mo31849j(R$drawable.icon_yeelight_device_badge_gingko_group_big);
        xVar2.mo31851l(resources.getString(R$string.yeelight_device_name_gingko));
        xVar2.mo31850k("yeelink.light.gingko.group");
        xVar2.mo31847h(false);
        xVar2.mo31846g(false);
        f7362f.add(xVar2);
        C9855x xVar3 = new C9855x();
        xVar3.mo31849j(R$drawable.icon_yeelight_device_badge_mb1grp_big);
        xVar3.mo31851l(resources.getString(R$string.yeelight_device_name_group_meshbulb1));
        xVar3.mo31850k("yeelink.light.mb1grp");
        xVar3.mo31847h(true);
        f7363g.add(xVar3);
        C9855x xVar4 = new C9855x();
        xVar4.mo31849j(R$drawable.icon_yeelight_device_badge_mb2grp_big);
        xVar4.mo31851l(resources.getString(R$string.yeelight_device_name_group_meshbulb2));
        xVar4.mo31850k("yeelink.light.mb2grp");
        xVar4.mo31847h(true);
        f7363g.add(xVar4);
        C9855x xVar5 = new C9855x();
        xVar5.mo31849j(R$drawable.icon_yeelight_device_badge_dn2grp_big);
        xVar5.mo31851l(resources.getString(R$string.yeelight_device_name_group_dnlight2));
        xVar5.mo31850k("yeelink.light.dn2grp");
        xVar5.mo31847h(true);
        f7363g.add(xVar5);
        C9855x xVar6 = new C9855x();
        xVar6.mo31849j(R$drawable.icon_yeelight_device_badge_spot1grp_big);
        xVar6.mo31851l(resources.getString(R$string.yeelight_device_name_group_spot1));
        xVar6.mo31850k("yeelink.light.sp1grp");
        xVar6.mo31847h(true);
        f7363g.add(xVar6);
        C9853v a = C9854w.m24045a(0);
        f7364h.add(a);
        C9853v a2 = C9854w.m24045a(1);
        f7364h.add(a2);
        C9853v a3 = C9854w.m24045a(2);
        f7364h.add(a3);
        C9853v a4 = C9854w.m24045a(3);
        f7364h.add(a4);
        C9853v a5 = C9854w.m24045a(4);
        f7364h.add(a5);
        C9853v a6 = C9854w.m24045a(5);
        f7364h.add(a6);
        C9855x xVar7 = new C9855x();
        xVar7.mo31849j(R$drawable.icon_yeelight_device_badge_lemon_color_big);
        xVar7.mo31851l(resources.getString(R$string.yeelight_device_name_colorb));
        xVar7.mo31850k("yeelink.light.colorb");
        xVar7.mo31847h(true);
        f7362f.add(xVar7);
        a.mo31830a(xVar7);
        C9855x xVar8 = new C9855x();
        xVar8.mo31849j(R$drawable.icon_yeelight_device_badge_lemon_ct_big);
        xVar8.mo31851l(resources.getString(R$string.yeelight_device_name_cta));
        xVar8.mo31850k("yeelink.light.cta");
        xVar8.mo31847h(true);
        f7362f.add(xVar8);
        a.mo31830a(xVar8);
        C9855x xVar9 = new C9855x();
        xVar9.mo31849j(R$drawable.icon_yeelight_device_badge_dolphin_big);
        xVar9.mo31851l(resources.getString(R$string.yeelight_device_name_monoa));
        xVar9.mo31850k("yeelink.light.monoa");
        xVar9.mo31847h(true);
        f7362f.add(xVar9);
        a.mo31830a(xVar9);
        C9855x xVar10 = new C9855x();
        xVar10.mo31849j(R$drawable.icon_yeelight_device_badge_colorc_big);
        xVar10.mo31851l(resources.getString(R$string.yeelight_device_name_colorc));
        xVar10.mo31850k("yeelink.light.colorc");
        xVar10.mo31847h(true);
        xVar10.mo31846g(true);
        f7362f.add(xVar10);
        a.mo31830a(xVar10);
        C9855x xVar11 = new C9855x();
        xVar11.mo31849j(R$drawable.icon_yeelight_device_badge_monob_big);
        xVar11.mo31851l(resources.getString(R$string.yeelight_device_name_monob));
        xVar11.mo31850k("yeelink.light.monob");
        xVar11.mo31847h(true);
        xVar11.mo31846g(true);
        f7362f.add(xVar11);
        a.mo31830a(xVar11);
        C9855x xVar12 = new C9855x();
        xVar12.mo31849j(R$drawable.icon_yeelight_device_badge_lemon_color_big);
        xVar12.mo31851l(resources.getString(R$string.connect_product_name_color1s));
        xVar12.mo31850k("yeelink.light.color4");
        xVar12.mo31847h(true);
        f7362f.add(xVar12);
        a.mo31830a(xVar12);
        C9855x xVar13 = new C9855x();
        xVar13.mo31849j(R$drawable.icon_yeelight_device_badge_lemon_color_big);
        xVar13.mo31851l(resources.getString(R$string.yeelight_device_name_color4));
        xVar13.mo31850k("yeelink.light.color8");
        xVar13.mo31847h(true);
        xVar13.mo31846g(false);
        f7362f.add(xVar13);
        a.mo31830a(xVar13);
        C9855x xVar14 = new C9855x();
        xVar14.mo31849j(R$drawable.icon_yeelight_device_badge_lemon_color_big);
        xVar14.mo31851l(resources.getString(R$string.yeelight_device_name_color6));
        xVar14.mo31850k("yeelink.light.color6");
        xVar14.mo31847h(true);
        f7362f.add(xVar14);
        a.mo31830a(xVar14);
        C9855x xVar15 = new C9855x();
        xVar15.mo31849j(R$drawable.icon_yeelight_device_badge_mono4_big);
        xVar15.mo31851l(resources.getString(R$string.connect_product_name_mono1s));
        xVar15.mo31850k("yeelink.light.mono4");
        xVar15.mo31847h(true);
        f7362f.add(xVar15);
        a.mo31830a(xVar15);
        C9855x xVar16 = new C9855x();
        xVar16.mo31849j(R$drawable.icon_yeelight_device_badge_colora_big);
        xVar16.mo31851l(resources.getString(R$string.yeelight_device_name_colora));
        xVar16.mo31850k("yeelink.light.colora");
        xVar16.mo31847h(true);
        f7362f.add(xVar16);
        a.mo31830a(xVar16);
        C9855x xVar17 = new C9855x();
        xVar17.mo31849j(R$drawable.icon_yeelight_device_badge_lemon_color_big);
        xVar17.mo31851l(resources.getString(R$string.yeelight_device_name_color2));
        xVar17.mo31850k("yeelink.light.color2");
        xVar17.mo31847h(true);
        f7362f.add(xVar17);
        a.mo31830a(xVar17);
        C9855x xVar18 = new C9855x();
        xVar18.mo31849j(R$drawable.icon_yeelight_device_badge_lemon_ct_big);
        xVar18.mo31851l(resources.getString(R$string.yeelight_device_name_ct));
        xVar18.mo31850k("yeelink.light.ct2");
        xVar18.mo31847h(true);
        f7362f.add(xVar18);
        a.mo31830a(xVar18);
        C9855x xVar19 = new C9855x();
        xVar19.mo31849j(R$drawable.icon_yeelight_device_badge_wonder_big);
        xVar19.mo31851l(resources.getString(R$string.yeelight_device_name_color));
        xVar19.mo31850k("yeelink.light.color1");
        xVar19.mo31847h(true);
        f7362f.add(xVar19);
        a.mo31830a(xVar19);
        C9855x xVar20 = new C9855x();
        xVar20.mo31849j(R$drawable.icon_yeelight_device_badge_dolphin_big);
        xVar20.mo31851l(resources.getString(R$string.yeelight_device_name_mono));
        xVar20.mo31850k("yeelink.light.mono1");
        xVar20.mo31847h(true);
        f7362f.add(xVar20);
        a.mo31830a(xVar20);
        C9855x xVar21 = new C9855x();
        xVar21.mo31849j(R$drawable.icon_yeelight_device_badge_lemon_glcolor_big);
        xVar21.mo31851l(resources.getString(R$string.yeelight_device_name_glcolor));
        xVar21.mo31850k("yeelink.light.glcolor");
        xVar21.mo31847h(true);
        f7362f.add(xVar21);
        a.mo31830a(xVar21);
        C9855x xVar22 = new C9855x();
        xVar22.mo31849j(R$drawable.icon_yeelight_device_badge_mono5_big);
        xVar22.mo31851l(resources.getString(R$string.yeelight_device_name_mono5));
        xVar22.mo31850k("yeelink.light.mono5");
        xVar22.mo31847h(true);
        f7362f.add(xVar22);
        a.mo31830a(xVar22);
        C9855x xVar23 = new C9855x();
        xVar23.mo31849j(R$drawable.icon_yeelight_device_badge_ml2_big);
        xVar23.mo31851l(resources.getString(R$string.yeelight_device_name_ml2));
        xVar23.mo31850k("yeelink.light.ml2");
        xVar23.mo31847h(true);
        f7362f.add(xVar23);
        a.mo31830a(xVar23);
        C9855x xVar24 = new C9855x();
        xVar24.mo31849j(R$drawable.icon_yeelight_device_badge_meshbulb2_big);
        xVar24.mo31851l(resources.getString(R$string.yeelight_device_name_meshbulb2));
        xVar24.mo31850k("yeelink.light.meshbulb2");
        xVar24.mo31847h(true);
        f7362f.add(xVar24);
        a.mo31830a(xVar24);
        C9855x xVar25 = new C9855x();
        xVar25.mo31849j(R$drawable.icon_yeelight_device_badge_meshbulb1_big);
        xVar25.mo31851l(resources.getString(R$string.yeelight_device_name_meshbulb1));
        xVar25.mo31850k("yeelink.light.meshbulb1");
        xVar25.mo31847h(true);
        f7362f.add(xVar25);
        a.mo31830a(xVar25);
        C9855x xVar26 = new C9855x();
        xVar26.mo31849j(R$drawable.icon_yeelight_device_badge_lemon_color_big);
        xVar26.mo31851l(resources.getString(R$string.yeelight_device_name_color3));
        xVar26.mo31850k("yeelink.light.color3");
        xVar26.mo31847h(false);
        xVar26.mo31846g(false);
        f7362f.add(xVar26);
        a.mo31830a(xVar26);
        C9855x xVar27 = new C9855x();
        xVar27.mo31849j(R$drawable.icon_yeelight_device_badge_lemon_color_big);
        xVar27.mo31851l(resources.getString(R$string.yeelight_device_name_color5));
        xVar27.mo31850k("yeelink.light.color5");
        xVar27.mo31847h(false);
        xVar27.mo31846g(false);
        f7362f.add(xVar27);
        a.mo31830a(xVar27);
        C9855x xVar28 = new C9855x();
        xVar28.mo31849j(R$drawable.icon_yeelight_device_badge_pitaya_big);
        xVar28.mo31851l(resources.getString(R$string.connect_product_name_strip));
        xVar28.mo31850k("yeelink.light.strip1");
        xVar28.mo31847h(true);
        f7362f.add(xVar28);
        a2.mo31830a(xVar28);
        C9855x xVar29 = new C9855x();
        xVar29.mo31849j(R$drawable.icon_yeelight_device_badge_pitaya_big);
        xVar29.mo31851l(resources.getString(R$string.connect_product_name_strip));
        xVar29.mo31850k("yeelink.light.strip6");
        xVar29.mo31847h(false);
        xVar29.mo31846g(false);
        f7362f.add(xVar29);
        a2.mo31830a(xVar29);
        C9855x xVar30 = new C9855x();
        xVar30.mo31849j(R$drawable.icon_yeelight_device_badge_stripe4_big);
        xVar30.mo31851l(resources.getString(R$string.yeelight_device_name_strip4));
        xVar30.mo31850k("yeelink.light.strip4");
        xVar30.mo31847h(true);
        f7362f.add(xVar30);
        a2.mo31830a(xVar30);
        C9855x xVar31 = new C9855x();
        xVar31.mo31849j(R$drawable.icon_yeelight_device_badge_pitaya_big);
        xVar31.mo31851l(resources.getString(R$string.connect_product_name_strip));
        xVar31.mo31850k("yeelink.light.stripa");
        xVar31.mo31847h(false);
        xVar31.mo31846g(false);
        f7362f.add(xVar31);
        a2.mo31830a(xVar31);
        C9855x xVar32 = new C9855x();
        xVar32.mo31849j(R$drawable.icon_yeelight_device_badge_ceiling_big);
        xVar32.mo31851l(resources.getString(R$string.yeelight_device_name_ceiling_yeelight));
        xVar32.mo31850k("virtual.yeelink.light.ceiling");
        xVar32.mo31847h(true);
        f7362f.add(xVar32);
        a3.mo31830a(xVar32);
        C9855x xVar33 = new C9855x();
        xVar33.mo31849j(R$drawable.icon_yeelight_device_badge_mijia_ceiling_big);
        xVar33.mo31851l(resources.getString(R$string.yeelight_device_name_ceiling_mijia));
        xVar33.mo31850k("virtual.yeelink.light.mijia.ceiling");
        xVar33.mo31847h(true);
        f7362f.add(xVar33);
        a3.mo31830a(xVar33);
        C9855x xVar34 = new C9855x();
        xVar34.mo31849j(R$drawable.icon_yeelight_device_badge_nox_dl_big);
        xVar34.mo31851l(resources.getString(R$string.yeelight_device_name_ceiling10));
        xVar34.mo31850k("yeelink.light.ceiling10");
        xVar34.mo31847h(false);
        xVar34.mo31846g(true);
        f7362f.add(xVar34);
        a3.mo31830a(xVar34);
        C9855x xVar35 = new C9855x();
        xVar35.mo31849j(R$drawable.icon_yeelight_device_badge_ceiling30_big);
        xVar35.mo31851l(resources.getString(R$string.yeelight_device_name_ceiling30));
        xVar35.mo31850k("yeelink.light.ceil30");
        xVar35.mo31847h(true);
        xVar35.mo31846g(true);
        f7362f.add(xVar35);
        a3.mo31830a(xVar35);
        C9855x xVar36 = new C9855x();
        xVar36.mo31849j(R$drawable.icon_yeelight_device_badge_fancl1_big);
        xVar36.mo31851l(resources.getString(R$string.yeelight_device_name_fancl1));
        xVar36.mo31850k("yeelink.light.fancl1");
        xVar36.mo31847h(true);
        xVar36.mo31846g(true);
        f7362f.add(xVar36);
        a3.mo31830a(xVar36);
        C9855x xVar37 = new C9855x();
        xVar37.mo31849j(R$drawable.icon_yeelight_device_badge_fancl2_big);
        xVar37.mo31851l(resources.getString(R$string.yeelight_device_name_fancl2));
        xVar37.mo31850k("yeelink.light.fancl2");
        xVar37.mo31847h(true);
        xVar37.mo31846g(true);
        f7362f.add(xVar37);
        a3.mo31830a(xVar37);
        C9855x xVar38 = new C9855x();
        xVar38.mo31849j(R$drawable.icon_yeelight_device_badge_fancl6_big);
        xVar38.mo31851l(resources.getString(R$string.yeelight_device_name_fancl5));
        xVar38.mo31850k("yeelink.light.fancl5");
        xVar38.mo31847h(false);
        xVar38.mo31846g(false);
        f7362f.add(xVar38);
        a3.mo31830a(xVar38);
        C9855x xVar39 = new C9855x();
        xVar39.mo31849j(R$drawable.icon_yeelight_device_badge_fancl6_big);
        xVar39.mo31851l(resources.getString(R$string.yeelight_device_name_fancl6));
        xVar39.mo31850k("yeelink.light.fancl6");
        xVar39.mo31847h(false);
        xVar39.mo31846g(false);
        f7362f.add(xVar39);
        a3.mo31830a(xVar39);
        C9855x xVar40 = new C9855x();
        xVar40.mo31849j(R$drawable.icon_yeelight_device_badge_panel_big);
        xVar40.mo31851l(resources.getString(R$string.yeelight_device_name_panel1));
        xVar40.mo31850k("yeelink.light.panel1");
        xVar40.mo31847h(true);
        f7362f.add(xVar40);
        a3.mo31830a(xVar40);
        C9855x xVar41 = new C9855x();
        xVar41.mo31849j(R$drawable.icon_yeelight_device_badge_panel_big);
        xVar41.mo31851l(resources.getString(R$string.yeelight_device_name_panel1));
        xVar41.mo31850k("yeelink.light.panel3");
        xVar41.mo31847h(true);
        xVar41.mo31846g(false);
        f7362f.add(xVar41);
        a3.mo31830a(xVar41);
        C9855x xVar42 = new C9855x();
        xVar42.mo31849j(R$drawable.icon_yeelight_device_badge_muse_big);
        xVar42.mo31851l(resources.getString(R$string.yeelight_device_name_lamp3));
        xVar42.mo31850k("yeelink.light.lamp3");
        xVar42.mo31847h(true);
        f7362f.add(xVar42);
        a4.mo31830a(xVar42);
        C9855x xVar43 = new C9855x();
        xVar43.mo31849j(R$drawable.icon_yeelight_device_badge_lamp17_big);
        xVar43.mo31851l(resources.getString(R$string.yeelight_device_name_lamp17));
        xVar43.mo31850k("yeelink.light.lamp17");
        xVar43.mo31847h(false);
        f7362f.add(xVar43);
        a4.mo31830a(xVar43);
        C9855x xVar44 = new C9855x();
        xVar44.mo31849j(R$drawable.icon_yeelight_device_badge_muse_le_big);
        xVar44.mo31851l(resources.getString(R$string.yeelight_device_name_lamp5));
        xVar44.mo31850k("yeelink.light.lamp5");
        xVar44.mo31847h(false);
        f7362f.add(xVar44);
        a4.mo31830a(xVar44);
        C9855x xVar45 = new C9855x();
        xVar45.mo31849j(R$drawable.icon_yeelight_device_badge_lamp7_big);
        xVar45.mo31851l(resources.getString(R$string.yeelight_device_name_lamp7));
        xVar45.mo31850k("yeelink.light.lamp7");
        xVar45.mo31847h(true);
        f7362f.add(xVar45);
        a4.mo31830a(xVar45);
        C9855x xVar46 = new C9855x();
        xVar46.mo31849j(R$drawable.icon_yeelight_device_badge_dysis_le_big);
        xVar46.mo31851l(resources.getString(R$string.yeelight_device_name_bslamp3));
        xVar46.mo31850k("yeelink.light.bslamp3");
        xVar46.mo31847h(false);
        f7362f.add(xVar46);
        a4.mo31830a(xVar46);
        C9855x xVar47 = new C9855x();
        xVar47.mo31849j(R$drawable.icon_yeelight_device_badge_lamp15_big);
        xVar47.mo31851l(resources.getString(R$string.yeelight_device_name_lamp15));
        xVar47.mo31850k("yeelink.light.lamp15");
        xVar47.mo31847h(true);
        f7362f.add(xVar47);
        a4.mo31830a(xVar47);
        C9855x xVar48 = new C9855x();
        xVar48.mo31849j(R$drawable.icon_yeelight_device_badge_lamp9_big);
        xVar48.mo31851l(resources.getString(R$string.yeelight_device_name_lamp9));
        xVar48.mo31850k("yeelink.light.lamp9");
        xVar48.mo31847h(true);
        f7362f.add(xVar48);
        a4.mo31830a(xVar48);
        C9855x xVar49 = new C9855x();
        xVar49.mo31849j(R$drawable.icon_yeelight_device_badge_lamp10_big);
        xVar49.mo31851l(resources.getString(R$string.yeelight_device_name_lamp10));
        xVar49.mo31850k("yeelink.light.lamp10");
        xVar49.mo31847h(true);
        f7362f.add(xVar49);
        a4.mo31830a(xVar49);
        C9855x xVar50 = new C9855x();
        xVar50.mo31849j(R$drawable.icon_yeelight_device_badge_cherry_big);
        xVar50.mo31851l(resources.getString(R$string.yeelight_device_name_cherry));
        xVar50.mo31850k("yeelink.light.ble1");
        xVar50.mo31847h(true);
        f7362f.add(xVar50);
        a4.mo31830a(xVar50);
        C9855x xVar51 = new C9855x();
        xVar51.mo31849j(R$drawable.icon_yeelight_device_badge_cherry1s_big);
        xVar51.mo31851l(resources.getString(R$string.yeelight_device_name_bslamp));
        xVar51.mo31850k("yeelink.light.bslamp1");
        xVar51.mo31847h(true);
        f7362f.add(xVar51);
        a4.mo31830a(xVar51);
        C9855x xVar52 = new C9855x();
        xVar52.mo31849j(R$drawable.icon_yeelight_device_badge_dysis_big);
        xVar52.mo31851l(resources.getString(R$string.yeelight_device_name_bslamp2));
        xVar52.mo31850k("yeelink.light.bslamp2");
        xVar52.mo31847h(false);
        f7362f.add(xVar52);
        a4.mo31830a(xVar52);
        C9855x xVar53 = new C9855x();
        xVar53.mo31849j(R$drawable.icon_yeelight_device_badge_gingko_big);
        xVar53.mo31851l(resources.getString(R$string.yeelight_device_name_gingko));
        xVar53.mo31850k("yeelink.light.gingko");
        xVar53.mo31847h(true);
        f7362f.add(xVar53);
        a4.mo31830a(xVar53);
        C9855x xVar54 = new C9855x();
        xVar54.mo31849j(R$drawable.icon_yeelight_device_badge_mango_big);
        xVar54.mo31851l(resources.getString(R$string.yeelight_device_name_lamp));
        xVar54.mo31850k("yeelink.light.lamp1");
        xVar54.mo31847h(true);
        f7362f.add(xVar54);
        a4.mo31830a(xVar54);
        C9855x xVar55 = new C9855x();
        xVar55.mo31849j(R$drawable.icon_yeelight_device_badge_mango_big);
        xVar55.mo31851l(resources.getString(R$string.yeelight_device_name_lamp_1s));
        xVar55.mo31850k("yeelink.light.lamp4");
        xVar55.mo31847h(true);
        f7362f.add(xVar55);
        a4.mo31830a(xVar55);
        C9855x xVar56 = new C9855x();
        xVar56.mo31849j(R$drawable.icon_yeelight_device_badge_elf_big);
        xVar56.mo31851l(resources.getString(R$string.yeelight_device_name_lamp2));
        xVar56.mo31850k("yeelink.light.lamp2");
        xVar56.mo31847h(false);
        f7362f.add(xVar56);
        a4.mo31830a(xVar56);
        C9855x xVar57 = new C9855x();
        xVar57.mo31849j(R$drawable.icon_yeelight_device_badge_dysis_le_big);
        xVar57.mo31851l(resources.getString(R$string.yeelight_device_name_lamp19));
        xVar57.mo31850k("yeelink.light.lamp19");
        xVar57.mo31847h(false);
        xVar57.mo31846g(false);
        f7362f.add(xVar57);
        a4.mo31830a(xVar57);
        C9855x xVar58 = new C9855x();
        xVar58.mo31849j(R$drawable.icon_yeelight_device_badge_lamp8_big);
        xVar58.mo31851l(resources.getString(R$string.yeelight_device_name_lamp8));
        xVar58.mo31850k("yeelink.light.lamp8");
        xVar58.mo31847h(true);
        f7362f.add(xVar58);
        a4.mo31830a(xVar58);
        C9855x xVar59 = new C9855x();
        xVar59.mo31849j(R$drawable.icon_yeelight_device_badge_ml1_big);
        xVar59.mo31851l(resources.getString(R$string.yeelight_device_name_ml1));
        xVar59.mo31850k("yeelink.light.ml1");
        xVar59.mo31847h(true);
        f7362f.add(xVar59);
        a5.mo31830a(xVar59);
        C9855x xVar60 = new C9855x();
        xVar60.mo31849j(R$drawable.icon_yeelight_device_badge_dnlight2_big);
        xVar60.mo31851l(resources.getString(R$string.yeelight_device_name_dnlight2));
        xVar60.mo31850k("yeelink.light.dnlight2");
        xVar60.mo31847h(true);
        f7362f.add(xVar60);
        a5.mo31830a(xVar60);
        C9855x xVar61 = new C9855x();
        xVar61.mo31849j(R$drawable.icon_yeelight_device_badge_spot1_big);
        xVar61.mo31851l(resources.getString(R$string.yeelight_device_name_spot1));
        xVar61.mo31850k("yeelink.light.spot1");
        xVar61.mo31847h(true);
        f7362f.add(xVar61);
        a5.mo31830a(xVar61);
        C9855x xVar62 = new C9855x();
        xVar62.mo31849j(R$drawable.icon_yeelight_device_badge_gateway_big);
        xVar62.mo31851l(resources.getString(R$string.yeelight_device_name_mesh_gateway));
        xVar62.mo31850k("yeelink.gateway.v1");
        xVar62.mo31847h(true);
        f7362f.add(xVar62);
        a6.mo31830a(xVar62);
        C9855x xVar63 = new C9855x();
        xVar63.mo31849j(R$drawable.icon_yeelight_device_badge_gateway_big);
        xVar63.mo31851l(resources.getString(R$string.yeelight_device_name_mesh_gateway));
        xVar63.mo31850k("yeelink.gateway.va");
        xVar63.mo31847h(false);
        xVar63.mo31846g(false);
        f7362f.add(xVar63);
        a6.mo31830a(xVar63);
        C9855x xVar64 = new C9855x();
        xVar64.mo31849j(R$drawable.icon_yeelight_device_badge_sw1_big);
        xVar64.mo31851l(resources.getString(R$string.product_name_sw1));
        xVar64.mo31850k("yeelink.switch.sw1");
        xVar64.mo31847h(true);
        xVar64.mo31846g(true);
        f7362f.add(xVar64);
        a6.mo31830a(xVar64);
        C9855x xVar65 = new C9855x();
        xVar65.mo31849j(R$drawable.icon_yeelight_device_curtain_big);
        xVar65.mo31851l(resources.getString(R$string.product_name_curtain));
        xVar65.mo31850k("yeelink.curtain.ctmt1");
        xVar65.mo31847h(true);
        xVar65.mo31846g(true);
        f7362f.add(xVar65);
        a6.mo31830a(xVar65);
        C9855x xVar66 = new C9855x();
        xVar66.mo31849j(R$drawable.icon_yeelight_device_badge_donut_big);
        xVar66.mo31851l(resources.getString(R$string.yeelight_device_name_donut));
        xVar66.mo31850k("yeelink.wifispeaker.v1");
        xVar66.mo31847h(false);
        f7362f.add(xVar66);
        a6.mo31830a(xVar66);
        C9855x xVar67 = new C9855x();
        xVar67.mo31849j(R$drawable.icon_yeelight_device_badge_plug_big);
        xVar67.mo31851l(resources.getString(R$string.product_name_plug));
        xVar67.mo31850k("yeelink.plug.plug");
        xVar67.mo31847h(true);
        xVar67.mo31846g(true);
        f7362f.add(xVar67);
        a6.mo31830a(xVar67);
        C9855x xVar68 = new C9855x();
        xVar68.mo31849j(R$drawable.icon_yeelight_default_avata);
        xVar68.mo31851l(resources.getString(R$string.yeelight_device_name_bhf));
        xVar68.mo31850k("yeelink.bhf_light.v1");
        xVar68.mo31847h(true);
        f7362f.add(xVar68);
        a6.mo31830a(xVar68);
        C9855x xVar69 = new C9855x();
        xVar69.mo31849j(R$drawable.icon_yeelight_device_badge_ceiling32_big);
        xVar69.mo31851l(resources.getString(R$string.yeelight_device_name_ceiling32));
        xVar69.mo31850k("yeelink.light.ceil32");
        xVar69.mo31847h(true);
        xVar69.mo31846g(true);
        f7362f.add(xVar69);
        a3.mo31830a(xVar69);
        C9855x xVar70 = new C9855x();
        xVar70.mo31849j(R$drawable.icon_yeelight_device_badge_ceiling33_big);
        xVar70.mo31851l(resources.getString(R$string.yeelight_device_name_ceiling33));
        xVar70.mo31850k("yeelink.light.ceil33");
        xVar70.mo31847h(false);
        xVar70.mo31846g(false);
        f7362f.add(xVar70);
        a3.mo31830a(xVar70);
        C9855x xVar71 = new C9855x();
        xVar71.mo31849j(R$drawable.icon_yeelight_device_badge_ceiling12_big);
        xVar71.mo31851l(resources.getString(R$string.yeelight_device_name_ceiling18));
        xVar71.mo31850k("yeelink.light.ceiling12");
        xVar71.mo31847h(false);
        xVar71.mo31846g(false);
        f7362f.add(xVar71);
        a3.mo31830a(xVar71);
        C9855x xVar72 = new C9855x();
        xVar72.mo31849j(R$drawable.icon_yeelight_device_badge_luna_big);
        xVar72.mo31851l(resources.getString(R$string.yeelight_device_name_ceiling));
        xVar72.mo31850k("yeelink.light.ceiling1");
        xVar72.mo31847h(false);
        xVar72.mo31846g(false);
        f7362f.add(xVar72);
        a3.mo31830a(xVar72);
        C9855x xVar73 = new C9855x();
        xVar73.mo31849j(R$drawable.icon_yeelight_device_badge_luna_big);
        xVar73.mo31851l(resources.getString(R$string.yeelight_device_name_ceiling2));
        xVar73.mo31850k("yeelink.light.ceiling2");
        xVar73.mo31847h(false);
        xVar73.mo31846g(false);
        f7362f.add(xVar73);
        a3.mo31830a(xVar73);
        C9855x xVar74 = new C9855x();
        xVar74.mo31849j(R$drawable.icon_yeelight_device_badge_eos_big);
        xVar74.mo31851l(resources.getString(R$string.yeelight_device_name_ceiling3));
        xVar74.mo31850k("yeelink.light.ceiling3");
        xVar74.mo31847h(false);
        xVar74.mo31846g(false);
        f7362f.add(xVar74);
        a3.mo31830a(xVar74);
        C9855x xVar75 = new C9855x();
        xVar75.mo31849j(R$drawable.icon_yeelight_device_badge_eos_pro_big);
        xVar75.mo31851l(resources.getString(R$string.yeelight_device_name_ceiling4));
        xVar75.mo31850k("yeelink.light.ceiling4");
        xVar75.mo31847h(false);
        xVar75.mo31846g(false);
        f7362f.add(xVar75);
        a3.mo31830a(xVar75);
        C9855x xVar76 = new C9855x();
        xVar76.mo31849j(R$drawable.icon_yeelight_device_badge_cycle_big);
        xVar76.mo31851l(resources.getString(R$string.yeelight_device_name_ceiling5));
        xVar76.mo31850k("yeelink.light.ceiling5");
        xVar76.mo31847h(false);
        xVar76.mo31846g(false);
        f7362f.add(xVar76);
        a3.mo31830a(xVar76);
        C9855x xVar77 = new C9855x();
        xVar77.mo31849j(R$drawable.icon_yeelight_device_badge_nox_big);
        xVar77.mo31851l(resources.getString(R$string.yeelight_device_name_ceiling7));
        xVar77.mo31850k("yeelink.light.ceiling7");
        xVar77.mo31847h(false);
        xVar77.mo31846g(false);
        f7362f.add(xVar77);
        a3.mo31830a(xVar77);
        C9855x xVar78 = new C9855x();
        xVar78.mo31849j(R$drawable.icon_yeelight_device_badge_nox_plus_big);
        xVar78.mo31851l(resources.getString(R$string.yeelight_device_name_ceiling8));
        xVar78.mo31850k("yeelink.light.ceiling8");
        xVar78.mo31847h(false);
        xVar78.mo31846g(false);
        f7362f.add(xVar78);
        a3.mo31830a(xVar78);
        C9855x xVar79 = new C9855x();
        xVar79.mo31849j(R$drawable.icon_yeelight_device_badge_nox_pro_big);
        xVar79.mo31851l(resources.getString(R$string.yeelight_device_name_ceiling6));
        xVar79.mo31850k("yeelink.light.ceiling6");
        xVar79.mo31847h(false);
        xVar79.mo31846g(false);
        f7362f.add(xVar79);
        a3.mo31830a(xVar79);
        C9855x xVar80 = new C9855x();
        xVar80.mo31849j(R$drawable.icon_yeelight_device_badge_ceiling16_big);
        xVar80.mo31851l(resources.getString(R$string.yeelight_device_name_ceiling16));
        xVar80.mo31850k("yeelink.light.ceiling16");
        xVar80.mo31847h(false);
        xVar80.mo31846g(false);
        f7362f.add(xVar80);
        a3.mo31830a(xVar80);
        C9855x xVar81 = new C9855x();
        xVar81.mo31849j(R$drawable.icon_yeelight_device_badge_ceiling17_big);
        xVar81.mo31851l(resources.getString(R$string.yeelight_device_name_ceiling17));
        xVar81.mo31850k("yeelink.light.ceiling17");
        xVar81.mo31847h(false);
        xVar81.mo31846g(false);
        f7362f.add(xVar81);
        a3.mo31830a(xVar81);
        C9855x xVar82 = new C9855x();
        xVar82.mo31849j(R$drawable.icon_yeelight_device_badge_ceiling17_big);
        xVar82.mo31851l(resources.getString(R$string.yeelight_device_name_ceiling18));
        xVar82.mo31850k("yeelink.light.ceiling18");
        xVar82.mo31847h(false);
        xVar82.mo31846g(false);
        f7362f.add(xVar82);
        a3.mo31830a(xVar82);
        C9855x xVar83 = new C9855x();
        xVar83.mo31849j(R$drawable.icon_yeelight_device_badge_ceiling17_big);
        xVar83.mo31851l(resources.getString(R$string.yeelight_device_name_ceiling17));
        xVar83.mo31850k("yeelink.light.ceiling19");
        xVar83.mo31847h(false);
        xVar83.mo31846g(false);
        f7362f.add(xVar83);
        a3.mo31830a(xVar83);
        C9855x xVar84 = new C9855x();
        xVar84.mo31849j(R$drawable.icon_yeelight_device_badge_ceiling17_big);
        xVar84.mo31851l(resources.getString(R$string.yeelight_device_name_ceiling20));
        xVar84.mo31850k("yeelink.light.ceiling20");
        xVar84.mo31847h(false);
        xVar84.mo31846g(false);
        f7362f.add(xVar84);
        a3.mo31830a(xVar84);
        C9855x xVar85 = new C9855x();
        xVar85.mo31849j(R$drawable.icon_yeelight_device_badge_ceiling17_big);
        xVar85.mo31851l(resources.getString(R$string.yeelight_device_name_ceiling21));
        xVar85.mo31850k("yeelink.light.ceiling21");
        xVar85.mo31847h(false);
        xVar85.mo31846g(false);
        f7362f.add(xVar85);
        a3.mo31830a(xVar85);
        C9855x xVar86 = new C9855x();
        xVar86.mo31849j(R$drawable.icon_yeelight_device_badge_ceiling17_big);
        xVar86.mo31851l(resources.getString(R$string.yeelight_device_name_ceiling22));
        xVar86.mo31850k("yeelink.light.ceiling22");
        xVar86.mo31847h(false);
        xVar86.mo31846g(false);
        f7362f.add(xVar86);
        a3.mo31830a(xVar86);
        C9855x xVar87 = new C9855x();
        xVar87.mo31849j(R$drawable.icon_yeelight_device_badge_ceiling17_big);
        xVar87.mo31851l(resources.getString(R$string.yeelight_device_name_ceiling23));
        xVar87.mo31850k("yeelink.light.ceiling23");
        xVar87.mo31847h(false);
        xVar87.mo31846g(false);
        f7362f.add(xVar87);
        a3.mo31830a(xVar87);
        C9855x xVar88 = new C9855x();
        xVar88.mo31849j(R$drawable.icon_yeelight_device_badge_ceiling17_big);
        xVar88.mo31851l(resources.getString(R$string.yeelight_device_name_ceiling24));
        xVar88.mo31850k("yeelink.light.ceiling24");
        xVar88.mo31847h(false);
        xVar88.mo31846g(false);
        f7362f.add(xVar88);
        a3.mo31830a(xVar88);
        C9855x xVar89 = new C9855x();
        xVar89.mo31849j(R$drawable.icon_yeelight_device_badge_ceiling26_big);
        xVar89.mo31851l(resources.getString(R$string.yeelight_device_name_ceil26));
        xVar89.mo31850k("yeelink.light.ceil26");
        xVar89.mo31847h(false);
        xVar89.mo31846g(false);
        f7362f.add(xVar89);
        a3.mo31830a(xVar89);
        C9855x xVar90 = new C9855x();
        xVar90.mo31849j(R$drawable.icon_yeelight_device_badge_luna_big);
        xVar90.mo31851l(resources.getString(R$string.yeelight_device_name_ceil26));
        xVar90.mo31850k("yeelink.light.ceila");
        xVar90.mo31847h(false);
        xVar90.mo31846g(false);
        f7362f.add(xVar90);
        a3.mo31830a(xVar90);
        C9855x xVar91 = new C9855x();
        xVar91.mo31849j(R$drawable.icon_yeelight_device_badge_ceiling17_big);
        xVar91.mo31851l(resources.getString(R$string.yeelight_device_name_ceilingb));
        xVar91.mo31850k("yeelink.light.ceilb");
        xVar91.mo31847h(false);
        xVar91.mo31846g(false);
        f7362f.add(xVar91);
        a3.mo31830a(xVar91);
        C9855x xVar92 = new C9855x();
        xVar92.mo31849j(R$drawable.icon_yeelight_device_badge_ceiling17_big);
        xVar92.mo31851l(resources.getString(R$string.yeelight_device_name_ceilingc));
        xVar92.mo31850k("yeelink.light.ceilc");
        xVar92.mo31847h(false);
        xVar92.mo31846g(false);
        f7362f.add(xVar92);
        a3.mo31830a(xVar92);
        C9855x xVar93 = new C9855x();
        xVar93.mo31849j(R$drawable.icon_yeelight_device_badge_ceilingc_big);
        xVar93.mo31851l(resources.getString(R$string.yeelight_device_name_ceilingd));
        xVar93.mo31850k("yeelink.light.ceild");
        xVar93.mo31847h(false);
        xVar93.mo31846g(false);
        f7362f.add(xVar93);
        a3.mo31830a(xVar93);
        C9855x xVar94 = new C9855x();
        xVar94.mo31849j(R$drawable.icon_yeelight_device_badge_ceiling27_big);
        xVar94.mo31851l(resources.getString(R$string.yeelight_device_name_ceiling27));
        xVar94.mo31850k("yeelink.light.ceil27");
        xVar94.mo31847h(false);
        xVar94.mo31846g(false);
        f7362f.add(xVar94);
        a3.mo31830a(xVar94);
        C9855x xVar95 = new C9855x();
        xVar95.mo31849j(R$drawable.icon_yeelight_device_badge_ceiling29_big);
        xVar95.mo31851l(resources.getString(R$string.yeelight_device_name_ceiling29));
        xVar95.mo31850k("yeelink.light.ceil29");
        xVar95.mo31847h(false);
        xVar95.mo31846g(false);
        f7362f.add(xVar95);
        a3.mo31830a(xVar95);
        C9855x xVar96 = new C9855x();
        xVar96.mo31849j(R$drawable.icon_yeelight_device_badge_ceiling31_big);
        xVar96.mo31851l(resources.getString(R$string.yeelight_device_name_ceiling31));
        xVar96.mo31850k("yeelink.light.ceil31");
        xVar96.mo31847h(false);
        xVar96.mo31846g(false);
        f7362f.add(xVar96);
        a3.mo31830a(xVar96);
        C9855x xVar97 = new C9855x();
        xVar97.mo31849j(R$drawable.icon_yeelight_device_badge_kaiyue_480_big);
        xVar97.mo31851l(resources.getString(R$string.yeelight_device_name_yilai_ceiling1));
        xVar97.mo31850k("yilai.light.ceiling1");
        xVar97.mo31847h(false);
        xVar97.mo31846g(false);
        f7362f.add(xVar97);
        a3.mo31830a(xVar97);
        C9855x xVar98 = new C9855x();
        xVar98.mo31849j(R$drawable.icon_yeelight_device_badge_hefeng_430_big);
        xVar98.mo31851l(resources.getString(R$string.yeelight_device_name_yilai_ceiling2));
        xVar98.mo31850k("yilai.light.ceiling2");
        xVar98.mo31847h(false);
        xVar98.mo31846g(false);
        f7362f.add(xVar98);
        a3.mo31830a(xVar98);
        C9855x xVar99 = new C9855x();
        xVar99.mo31849j(R$drawable.icon_yeelight_device_badge_hefeng_pro_big);
        xVar99.mo31851l(resources.getString(R$string.yeelight_device_name_yilai_ceiling3));
        xVar99.mo31850k("yilai.light.ceiling3");
        xVar99.mo31847h(false);
        xVar99.mo31846g(false);
        f7362f.add(xVar99);
        a3.mo31830a(xVar99);
    }

    /* renamed from: q */
    public static void m11809q() {
        f7361e = null;
    }

    /* renamed from: e */
    public List<C9855x> mo23573e() {
        return this.f7366b;
    }

    /* renamed from: f */
    public List<C9855x> mo23574f() {
        return this.f7365a;
    }

    /* renamed from: h */
    public C9855x mo23575h(String str) {
        for (C9855x next : f7362f) {
            if (TextUtils.equals(next.mo31841c(), str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: i */
    public List<C9853v> mo23576i() {
        return f7364h;
    }

    /* renamed from: j */
    public C9853v mo23577j(int i) {
        for (C9853v next : f7364h) {
            if (next.mo31835f() == i) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: k */
    public C9853v mo23578k(String str) {
        for (C9853v next : f7364h) {
            Iterator<C9855x> it = next.mo31831b().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (TextUtils.equals(str, it.next().mo31841c())) {
                        return next;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: l */
    public int mo23579l(String str) {
        if (str == null) {
            return 0;
        }
        for (C9855x next : f7362f) {
            if (str.equals(next.mo31841c())) {
                return next.mo31839a();
            }
        }
        for (C9855x next2 : f7363g) {
            if (str.equals(next2.mo31841c())) {
                return next2.mo31839a();
            }
        }
        return 0;
    }

    /* renamed from: m */
    public String mo23580m(String str) {
        if (str == null) {
            return null;
        }
        for (C9855x next : f7362f) {
            if (str.equals(next.mo31841c())) {
                return next.mo31842d();
            }
        }
        for (C9855x next2 : f7363g) {
            if (str.equals(next2.mo31841c())) {
                return next2.mo31842d();
            }
        }
        return null;
    }

    /* renamed from: o */
    public boolean mo23581o(String str) {
        List<String> list;
        if (TextUtils.isEmpty(str) || (list = this.f7368d) == null || list.isEmpty()) {
            return true;
        }
        return this.f7368d.contains(str);
    }

    /* renamed from: p */
    public void mo23582p(C4242b bVar) {
        if (!this.f7367c.contains(bVar)) {
            this.f7367c.add(bVar);
        }
    }

    /* renamed from: r */
    public void mo23583r() {
        String str = C4308b.f7492k + "new_products?debug=" + (C4308b.f7482a ? 1 : 0);
        "products url: " + str;
        C9862d.m24133c(str, String.class, new C4240a());
    }

    /* renamed from: s */
    public void mo23584s(C4242b bVar) {
        this.f7367c.remove(bVar);
    }

    /* renamed from: t */
    public void mo23585t() {
        this.f7365a.clear();
        for (C9855x next : f7362f) {
            if (next.mo31845f() && next.mo31843e()) {
                this.f7365a.add(next);
            }
        }
        this.f7366b.clear();
        for (C9855x next2 : f7363g) {
            if (next2.mo31845f() && next2.mo31843e()) {
                this.f7366b.add(next2);
            }
        }
        for (C9853v i : f7364h) {
            i.mo31838i();
        }
    }
}

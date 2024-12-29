package com.yeelight.yeelib.managers;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.miot.api.Constants;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.models.C8325q;
import com.yeelight.yeelib.models.C8326r;
import com.yeelight.yeelib.models.ProductInfo;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p129b4.C3988b;
import p134c4.C4007b;

/* renamed from: com.yeelight.yeelib.managers.r */
public class C3088r {

    /* renamed from: e */
    private static C3088r f4917e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static List<ProductInfo> f4918f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static List<ProductInfo> f4919g;

    /* renamed from: h */
    private static List<C8325q> f4920h;

    /* renamed from: a */
    private List<ProductInfo> f4921a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private List<ProductInfo> f4922b = new CopyOnWriteArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<C3091b> f4923c = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List<String> f4924d = new ArrayList();

    /* renamed from: com.yeelight.yeelib.managers.r$a */
    class C3089a implements C4007b<String> {

        /* renamed from: com.yeelight.yeelib.managers.r$a$a */
        class C3090a implements Runnable {
            C3090a() {
            }

            public void run() {
                for (C3091b A : C3088r.this.f4923c) {
                    A.mo23481A();
                }
            }
        }

        C3089a() {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            synchronized (new byte[]{0}) {
                StringBuilder sb = new StringBuilder();
                sb.append("Get product from cloud: ");
                sb.append(str);
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.getInt("code") == 1) {
                        for (ProductInfo enabled : C3088r.f4918f) {
                            enabled.setEnabled(false);
                        }
                        for (ProductInfo enabled2 : C3088r.f4919g) {
                            enabled2.setEnabled(false);
                        }
                        if (C3088r.this.f4924d != null) {
                            C3088r.this.f4924d.clear();
                        }
                        JSONArray jSONArray = jSONObject.getJSONArray(Constants.EXTRA_PUSH_MESSAGE);
                        for (int i = 0; i < jSONArray.length(); i++) {
                            String string = jSONArray.getJSONObject(i).getString("model");
                            int i2 = jSONArray.getJSONObject(i).getInt("app_least_hw_version");
                            if (C3088r.this.f4924d != null) {
                                C3088r.this.f4924d.add(string);
                            }
                            Iterator it = C3088r.f4918f.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                ProductInfo productInfo = (ProductInfo) it.next();
                                if (productInfo.getProductModel().equals(string)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Get product model : ");
                                    sb2.append(string);
                                    productInfo.setEnabled(true);
                                    productInfo.setMinFirmwareVer(i2);
                                    break;
                                }
                            }
                            Iterator it2 = C3088r.f4919g.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                ProductInfo productInfo2 = (ProductInfo) it2.next();
                                if (productInfo2.getProductModel().equals(string)) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("Get product model : ");
                                    sb3.append(string);
                                    productInfo2.setEnabled(true);
                                    productInfo2.setMinFirmwareVer(i2);
                                    break;
                                }
                            }
                        }
                        C3088r.this.mo23478t();
                        new Handler(Looper.getMainLooper()).post(new C3090a());
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }

        public void onFailure(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("OnFailure Exception = ");
            sb.append(str);
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.r$b */
    public interface C3091b {
        /* renamed from: A */
        void mo23481A();
    }

    public C3088r() {
        m8118n();
        mo23478t();
    }

    /* renamed from: g */
    public static synchronized C3088r m8117g() {
        C3088r rVar;
        synchronized (C3088r.class) {
            if (f4917e == null) {
                f4917e = new C3088r();
            }
            rVar = f4917e;
        }
        return rVar;
    }

    /* renamed from: n */
    private void m8118n() {
        Resources resources = C3108x.f4951e.getResources();
        List<ProductInfo> list = f4918f;
        if (list != null) {
            list.clear();
        } else {
            f4918f = new CopyOnWriteArrayList();
        }
        List<ProductInfo> list2 = f4919g;
        if (list2 != null) {
            list2.clear();
        } else {
            f4919g = new CopyOnWriteArrayList();
        }
        List<C8325q> list3 = f4920h;
        if (list3 != null) {
            list3.clear();
        } else {
            f4920h = new CopyOnWriteArrayList();
        }
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductIcon(R$drawable.icon_yeelight_device_badge_group_big);
        productInfo.setProductName(resources.getString(R$string.yeelight_device_name_group));
        productInfo.setProductModel("yeelink.light.group");
        productInfo.setEnabled(false);
        productInfo.setDisplayInList(false);
        f4918f.add(productInfo);
        ProductInfo productInfo2 = new ProductInfo();
        productInfo2.setProductIcon(R$drawable.icon_yeelight_device_badge_gingko_group_big);
        int i = R$string.yeelight_device_name_gingko;
        productInfo2.setProductName(resources.getString(i));
        productInfo2.setProductModel("yeelink.light.gingko.group");
        productInfo2.setEnabled(false);
        productInfo2.setDisplayInList(false);
        f4918f.add(productInfo2);
        ProductInfo productInfo3 = new ProductInfo();
        productInfo3.setProductIcon(R$drawable.icon_yeelight_device_badge_mb1grp_big);
        productInfo3.setProductName(resources.getString(R$string.yeelight_device_name_group_meshbulb1));
        productInfo3.setProductModel("yeelink.light.mb1grp");
        productInfo3.setEnabled(true);
        f4919g.add(productInfo3);
        ProductInfo productInfo4 = new ProductInfo();
        productInfo4.setProductIcon(R$drawable.icon_yeelight_device_badge_mb2grp_big);
        productInfo4.setProductName(resources.getString(R$string.yeelight_device_name_group_meshbulb2));
        productInfo4.setProductModel("yeelink.light.mb2grp");
        productInfo4.setEnabled(true);
        f4919g.add(productInfo4);
        ProductInfo productInfo5 = new ProductInfo();
        productInfo5.setProductIcon(R$drawable.icon_yeelight_device_badge_dn2grp_big);
        productInfo5.setProductName(resources.getString(R$string.yeelight_device_name_group_dnlight2));
        productInfo5.setProductModel("yeelink.light.dn2grp");
        productInfo5.setEnabled(true);
        f4919g.add(productInfo5);
        ProductInfo productInfo6 = new ProductInfo();
        productInfo6.setProductIcon(R$drawable.icon_yeelight_device_badge_spot1grp_big);
        productInfo6.setProductName(resources.getString(R$string.yeelight_device_name_group_spot1));
        productInfo6.setProductModel("yeelink.light.sp1grp");
        productInfo6.setEnabled(true);
        f4919g.add(productInfo6);
        C8325q a = C8326r.m19802a(0);
        f4920h.add(a);
        C8325q a2 = C8326r.m19802a(1);
        f4920h.add(a2);
        C8325q a3 = C8326r.m19802a(2);
        f4920h.add(a3);
        C8325q a4 = C8326r.m19802a(3);
        f4920h.add(a4);
        C8325q a5 = C8326r.m19802a(4);
        f4920h.add(a5);
        C8325q a6 = C8326r.m19802a(5);
        f4920h.add(a6);
        ProductInfo productInfo7 = new ProductInfo();
        productInfo7.setProductIcon(R$drawable.icon_yeelight_device_badge_lemon4_color_big);
        productInfo7.setProductName(resources.getString(R$string.yeelight_device_name_colore));
        productInfo7.setProductModel("yeelink.light.colore");
        productInfo7.setEnabled(true);
        f4918f.add(productInfo7);
        a.mo35407a(productInfo7);
        ProductInfo productInfo8 = new ProductInfo();
        productInfo8.setProductIcon(R$drawable.icon_yeelight_device_badge_lemon4_ct_big);
        productInfo8.setProductName(resources.getString(R$string.yeelight_device_name_ctc));
        productInfo8.setProductModel("yeelink.light.ctc");
        productInfo8.setEnabled(true);
        f4918f.add(productInfo8);
        a.mo35407a(productInfo8);
        ProductInfo productInfo9 = new ProductInfo();
        int i2 = R$drawable.icon_yeelight_device_badge_lemon_color_big;
        productInfo9.setProductIcon(i2);
        productInfo9.setProductName(resources.getString(R$string.yeelight_device_name_colorb));
        productInfo9.setProductModel("yeelink.light.colorb");
        productInfo9.setEnabled(true);
        f4918f.add(productInfo9);
        a.mo35407a(productInfo9);
        ProductInfo productInfo10 = new ProductInfo();
        int i3 = R$drawable.icon_yeelight_device_badge_lemon_ct_big;
        productInfo10.setProductIcon(i3);
        productInfo10.setProductName(resources.getString(R$string.yeelight_device_name_cta));
        productInfo10.setProductModel("yeelink.light.cta");
        productInfo10.setEnabled(true);
        f4918f.add(productInfo10);
        a.mo35407a(productInfo10);
        ProductInfo productInfo11 = new ProductInfo();
        int i4 = R$drawable.icon_yeelight_device_badge_dolphin_big;
        productInfo11.setProductIcon(i4);
        productInfo11.setProductName(resources.getString(R$string.yeelight_device_name_monoa));
        productInfo11.setProductModel("yeelink.light.monoa");
        productInfo11.setEnabled(true);
        f4918f.add(productInfo11);
        a.mo35407a(productInfo11);
        ProductInfo productInfo12 = new ProductInfo();
        productInfo12.setProductIcon(R$drawable.icon_yeelight_device_badge_colorc_big);
        productInfo12.setProductName(resources.getString(R$string.yeelight_device_name_colorc));
        productInfo12.setProductModel("yeelink.light.colorc");
        productInfo12.setEnabled(true);
        productInfo12.setDisplayInList(true);
        f4918f.add(productInfo12);
        a.mo35407a(productInfo12);
        ProductInfo productInfo13 = new ProductInfo();
        productInfo13.setProductIcon(R$drawable.icon_yeelight_device_badge_monob_big);
        productInfo13.setProductName(resources.getString(R$string.yeelight_device_name_monob));
        productInfo13.setProductModel("yeelink.light.monob");
        productInfo13.setEnabled(true);
        productInfo13.setDisplayInList(true);
        f4918f.add(productInfo13);
        a.mo35407a(productInfo13);
        ProductInfo productInfo14 = new ProductInfo();
        productInfo14.setProductIcon(i2);
        productInfo14.setProductName(resources.getString(R$string.connect_product_name_color1s));
        productInfo14.setProductModel("yeelink.light.color4");
        productInfo14.setEnabled(true);
        f4918f.add(productInfo14);
        a.mo35407a(productInfo14);
        ProductInfo productInfo15 = new ProductInfo();
        productInfo15.setProductIcon(i2);
        productInfo15.setProductName(resources.getString(R$string.yeelight_device_name_color4));
        productInfo15.setProductModel("yeelink.light.color8");
        productInfo15.setEnabled(true);
        productInfo15.setDisplayInList(false);
        f4918f.add(productInfo15);
        a.mo35407a(productInfo15);
        ProductInfo productInfo16 = new ProductInfo();
        productInfo16.setProductIcon(i2);
        productInfo16.setProductName(resources.getString(R$string.yeelight_device_name_color6));
        productInfo16.setProductModel("yeelink.light.color6");
        productInfo16.setEnabled(true);
        f4918f.add(productInfo16);
        a.mo35407a(productInfo16);
        ProductInfo productInfo17 = new ProductInfo();
        productInfo17.setProductIcon(R$drawable.icon_yeelight_device_badge_mono4_big);
        productInfo17.setProductName(resources.getString(R$string.connect_product_name_mono1s));
        productInfo17.setProductModel("yeelink.light.mono4");
        productInfo17.setEnabled(true);
        f4918f.add(productInfo17);
        a.mo35407a(productInfo17);
        ProductInfo productInfo18 = new ProductInfo();
        productInfo18.setProductIcon(R$drawable.icon_yeelight_device_badge_colora_big);
        productInfo18.setProductName(resources.getString(R$string.yeelight_device_name_colora));
        productInfo18.setProductModel("yeelink.light.colora");
        productInfo18.setEnabled(true);
        f4918f.add(productInfo18);
        a.mo35407a(productInfo18);
        ProductInfo productInfo19 = new ProductInfo();
        productInfo19.setProductIcon(i2);
        productInfo19.setProductName(resources.getString(R$string.yeelight_device_name_color2));
        productInfo19.setProductModel("yeelink.light.color2");
        productInfo19.setEnabled(true);
        f4918f.add(productInfo19);
        a.mo35407a(productInfo19);
        ProductInfo productInfo20 = new ProductInfo();
        productInfo20.setProductIcon(i3);
        productInfo20.setProductName(resources.getString(R$string.yeelight_device_name_ct));
        productInfo20.setProductModel("yeelink.light.ct2");
        productInfo20.setEnabled(true);
        f4918f.add(productInfo20);
        a.mo35407a(productInfo20);
        ProductInfo productInfo21 = new ProductInfo();
        productInfo21.setProductIcon(R$drawable.icon_yeelight_device_badge_wonder_big);
        productInfo21.setProductName(resources.getString(R$string.yeelight_device_name_color));
        productInfo21.setProductModel("yeelink.light.color1");
        productInfo21.setEnabled(true);
        f4918f.add(productInfo21);
        a.mo35407a(productInfo21);
        ProductInfo productInfo22 = new ProductInfo();
        productInfo22.setProductIcon(i4);
        productInfo22.setProductName(resources.getString(R$string.yeelight_device_name_mono));
        productInfo22.setProductModel("yeelink.light.mono1");
        productInfo22.setEnabled(true);
        f4918f.add(productInfo22);
        a.mo35407a(productInfo22);
        ProductInfo productInfo23 = new ProductInfo();
        productInfo23.setProductIcon(R$drawable.icon_yeelight_device_badge_lemon_glcolor_big);
        productInfo23.setProductName(resources.getString(R$string.yeelight_device_name_glcolor));
        productInfo23.setProductModel("yeelink.light.glcolor");
        productInfo23.setEnabled(true);
        f4918f.add(productInfo23);
        a.mo35407a(productInfo23);
        ProductInfo productInfo24 = new ProductInfo();
        productInfo24.setProductIcon(R$drawable.icon_yeelight_device_badge_mono5_big);
        productInfo24.setProductName(resources.getString(R$string.yeelight_device_name_mono5));
        productInfo24.setProductModel("yeelink.light.mono5");
        productInfo24.setEnabled(true);
        f4918f.add(productInfo24);
        a.mo35407a(productInfo24);
        ProductInfo productInfo25 = new ProductInfo();
        productInfo25.setProductIcon(R$drawable.icon_yeelight_device_badge_ml2_big);
        productInfo25.setProductName(resources.getString(R$string.yeelight_device_name_ml2));
        productInfo25.setProductModel("yeelink.light.ml2");
        productInfo25.setEnabled(true);
        f4918f.add(productInfo25);
        a.mo35407a(productInfo25);
        ProductInfo productInfo26 = new ProductInfo();
        productInfo26.setProductIcon(R$drawable.icon_yeelight_device_badge_meshbulb2_big);
        productInfo26.setProductName(resources.getString(R$string.yeelight_device_name_meshbulb2));
        productInfo26.setProductModel("yeelink.light.meshbulb2");
        productInfo26.setEnabled(true);
        f4918f.add(productInfo26);
        a.mo35407a(productInfo26);
        ProductInfo productInfo27 = new ProductInfo();
        productInfo27.setProductIcon(R$drawable.icon_yeelight_device_badge_meshbulb1_big);
        productInfo27.setProductName(resources.getString(R$string.yeelight_device_name_meshbulb1));
        productInfo27.setProductModel("yeelink.light.meshbulb1");
        productInfo27.setEnabled(true);
        f4918f.add(productInfo27);
        a.mo35407a(productInfo27);
        ProductInfo productInfo28 = new ProductInfo();
        productInfo28.setProductIcon(i2);
        productInfo28.setProductName(resources.getString(R$string.yeelight_device_name_color3));
        productInfo28.setProductModel("yeelink.light.color3");
        productInfo28.setEnabled(false);
        productInfo28.setDisplayInList(false);
        f4918f.add(productInfo28);
        a.mo35407a(productInfo28);
        ProductInfo productInfo29 = new ProductInfo();
        productInfo29.setProductIcon(i2);
        productInfo29.setProductName(resources.getString(R$string.yeelight_device_name_color5));
        productInfo29.setProductModel("yeelink.light.color5");
        productInfo29.setEnabled(false);
        productInfo29.setDisplayInList(false);
        f4918f.add(productInfo29);
        a.mo35407a(productInfo29);
        ProductInfo productInfo30 = new ProductInfo();
        int i5 = R$drawable.icon_yeelight_device_badge_pitaya_big;
        productInfo30.setProductIcon(i5);
        int i6 = R$string.connect_product_name_strip;
        productInfo30.setProductName(resources.getString(i6));
        productInfo30.setProductModel("yeelink.light.strip1");
        productInfo30.setEnabled(true);
        f4918f.add(productInfo30);
        a2.mo35407a(productInfo30);
        ProductInfo productInfo31 = new ProductInfo();
        productInfo31.setProductIcon(i5);
        productInfo31.setProductName(resources.getString(i6));
        productInfo31.setProductModel("yeelink.light.strip2");
        productInfo31.setEnabled(true);
        productInfo31.setDisplayInList(false);
        f4918f.add(productInfo31);
        a2.mo35407a(productInfo31);
        ProductInfo productInfo32 = new ProductInfo();
        productInfo32.setProductIcon(i5);
        int i7 = R$string.yeelight_device_name_strip6;
        productInfo32.setProductName(resources.getString(i7));
        productInfo32.setProductModel("yeelink.light.strip6");
        productInfo32.setEnabled(false);
        productInfo32.setDisplayInList(true);
        f4918f.add(productInfo32);
        a2.mo35407a(productInfo32);
        ProductInfo productInfo33 = new ProductInfo();
        productInfo33.setProductIcon(i5);
        productInfo33.setProductName(resources.getString(R$string.yeelight_device_name_strip8));
        productInfo33.setProductModel("yeelink.light.strip8");
        productInfo33.setEnabled(false);
        productInfo33.setDisplayInList(true);
        f4918f.add(productInfo33);
        a2.mo35407a(productInfo33);
        ProductInfo productInfo34 = new ProductInfo();
        productInfo34.setProductIcon(R$drawable.icon_yeelight_device_badge_stripe4_big);
        productInfo34.setProductName(resources.getString(R$string.yeelight_device_name_strip4));
        productInfo34.setProductModel("yeelink.light.strip4");
        productInfo34.setEnabled(true);
        f4918f.add(productInfo34);
        a2.mo35407a(productInfo34);
        ProductInfo productInfo35 = new ProductInfo();
        productInfo35.setProductIcon(i5);
        productInfo35.setProductName(resources.getString(i7));
        productInfo35.setProductModel("yeelink.light.stripa");
        productInfo35.setEnabled(false);
        productInfo35.setDisplayInList(false);
        f4918f.add(productInfo35);
        a2.mo35407a(productInfo35);
        ProductInfo productInfo36 = new ProductInfo();
        productInfo36.setProductIcon(R$drawable.icon_yeelight_device_badge_ceiling_big);
        productInfo36.setProductName(resources.getString(R$string.yeelight_device_name_ceiling_yeelight));
        productInfo36.setProductModel("virtual.yeelink.light.ceiling");
        productInfo36.setEnabled(true);
        f4918f.add(productInfo36);
        a3.mo35407a(productInfo36);
        ProductInfo productInfo37 = new ProductInfo();
        productInfo37.setProductIcon(R$drawable.icon_yeelight_device_badge_mijia_ceiling_big);
        productInfo37.setProductName(resources.getString(R$string.yeelight_device_name_ceiling_mijia));
        productInfo37.setProductModel("virtual.yeelink.light.mijia.ceiling");
        productInfo37.setEnabled(true);
        f4918f.add(productInfo37);
        a3.mo35407a(productInfo37);
        ProductInfo productInfo38 = new ProductInfo();
        productInfo38.setProductIcon(R$drawable.icon_yeelight_device_badge_nox_dl_big);
        productInfo38.setProductName(resources.getString(R$string.yeelight_device_name_ceiling10));
        productInfo38.setProductModel("yeelink.light.ceiling10");
        productInfo38.setEnabled(false);
        productInfo38.setDisplayInList(true);
        f4918f.add(productInfo38);
        a3.mo35407a(productInfo38);
        ProductInfo productInfo39 = new ProductInfo();
        productInfo39.setProductIcon(R$drawable.icon_yeelight_device_badge_ceiling30_big);
        productInfo39.setProductName(resources.getString(R$string.yeelight_device_name_ceiling30));
        productInfo39.setProductModel("yeelink.light.ceil30");
        productInfo39.setEnabled(true);
        productInfo39.setDisplayInList(true);
        f4918f.add(productInfo39);
        a3.mo35407a(productInfo39);
        ProductInfo productInfo40 = new ProductInfo();
        productInfo40.setProductIcon(R$drawable.icon_yeelight_device_badge_ceiling35_big);
        productInfo40.setProductName(resources.getString(R$string.yeelight_device_name_ceil35));
        productInfo40.setProductModel("yeelink.light.ceil35");
        productInfo40.setEnabled(true);
        productInfo40.setDisplayInList(true);
        f4918f.add(productInfo40);
        a3.mo35407a(productInfo40);
        ProductInfo productInfo41 = new ProductInfo();
        int i8 = R$drawable.icon_yeelight_device_badge_luna_big;
        productInfo41.setProductIcon(i8);
        productInfo41.setProductName(resources.getString(R$string.yeelight_device_name_ceile));
        productInfo41.setProductModel("yeelink.light.ceile");
        productInfo41.setEnabled(true);
        productInfo41.setDisplayInList(true);
        f4918f.add(productInfo41);
        a3.mo35407a(productInfo41);
        ProductInfo productInfo42 = new ProductInfo();
        productInfo42.setProductIcon(R$drawable.icon_yeelight_device_badge_fancl1_big);
        productInfo42.setProductName(resources.getString(R$string.yeelight_device_name_fancl1));
        productInfo42.setProductModel("yeelink.light.fancl1");
        productInfo42.setEnabled(true);
        productInfo42.setDisplayInList(true);
        f4918f.add(productInfo42);
        a3.mo35407a(productInfo42);
        ProductInfo productInfo43 = new ProductInfo();
        productInfo43.setProductIcon(R$drawable.icon_yeelight_device_badge_fancl2_big);
        productInfo43.setProductName(resources.getString(R$string.yeelight_device_name_fancl2));
        productInfo43.setProductModel("yeelink.light.fancl2");
        productInfo43.setEnabled(true);
        productInfo43.setDisplayInList(true);
        f4918f.add(productInfo43);
        a3.mo35407a(productInfo43);
        ProductInfo productInfo44 = new ProductInfo();
        int i9 = R$drawable.icon_yeelight_device_badge_fancl6_big;
        productInfo44.setProductIcon(i9);
        productInfo44.setProductName(resources.getString(R$string.yeelight_device_name_fancl5));
        productInfo44.setProductModel("yeelink.light.fancl5");
        productInfo44.setEnabled(false);
        productInfo44.setDisplayInList(false);
        f4918f.add(productInfo44);
        a3.mo35407a(productInfo44);
        ProductInfo productInfo45 = new ProductInfo();
        productInfo45.setProductIcon(i9);
        productInfo45.setProductName(resources.getString(R$string.yeelight_device_name_fancl6));
        productInfo45.setProductModel("yeelink.light.fancl6");
        productInfo45.setEnabled(false);
        productInfo45.setDisplayInList(false);
        f4918f.add(productInfo45);
        a3.mo35407a(productInfo45);
        ProductInfo productInfo46 = new ProductInfo();
        int i10 = R$drawable.icon_yeelight_device_badge_panel_big;
        productInfo46.setProductIcon(i10);
        int i11 = R$string.yeelight_device_name_panel1;
        productInfo46.setProductName(resources.getString(i11));
        productInfo46.setProductModel("yeelink.light.panel1");
        productInfo46.setEnabled(true);
        f4918f.add(productInfo46);
        a3.mo35407a(productInfo46);
        ProductInfo productInfo47 = new ProductInfo();
        productInfo47.setProductIcon(i10);
        productInfo47.setProductName(resources.getString(i11));
        productInfo47.setProductModel("yeelink.light.panel3");
        productInfo47.setEnabled(true);
        productInfo47.setDisplayInList(false);
        f4918f.add(productInfo47);
        a3.mo35407a(productInfo47);
        ProductInfo productInfo48 = new ProductInfo();
        productInfo48.setProductIcon(R$drawable.icon_yeelight_device_badge_muse_big);
        productInfo48.setProductName(resources.getString(R$string.yeelight_device_name_lamp3));
        productInfo48.setProductModel("yeelink.light.lamp3");
        productInfo48.setEnabled(true);
        f4918f.add(productInfo48);
        a4.mo35407a(productInfo48);
        ProductInfo productInfo49 = new ProductInfo();
        productInfo49.setProductIcon(R$drawable.icon_yeelight_device_badge_lamp17_big);
        productInfo49.setProductName(resources.getString(R$string.yeelight_device_name_lamp17));
        productInfo49.setProductModel("yeelink.light.lamp17");
        productInfo49.setEnabled(false);
        f4918f.add(productInfo49);
        a4.mo35407a(productInfo49);
        ProductInfo productInfo50 = new ProductInfo();
        productInfo50.setProductIcon(R$drawable.icon_yeelight_device_badge_muse_le_big);
        productInfo50.setProductName(resources.getString(R$string.yeelight_device_name_lamp5));
        productInfo50.setProductModel("yeelink.light.lamp5");
        productInfo50.setEnabled(false);
        f4918f.add(productInfo50);
        a4.mo35407a(productInfo50);
        ProductInfo productInfo51 = new ProductInfo();
        productInfo51.setProductIcon(R$drawable.icon_yeelight_device_badge_lamp7_big);
        productInfo51.setProductName(resources.getString(R$string.yeelight_device_name_lamp7));
        productInfo51.setProductModel("yeelink.light.lamp7");
        productInfo51.setEnabled(true);
        f4918f.add(productInfo51);
        a4.mo35407a(productInfo51);
        ProductInfo productInfo52 = new ProductInfo();
        int i12 = R$drawable.icon_yeelight_device_badge_dysis_le_big;
        productInfo52.setProductIcon(i12);
        productInfo52.setProductName(resources.getString(R$string.yeelight_device_name_bslamp3));
        productInfo52.setProductModel("yeelink.light.bslamp3");
        productInfo52.setEnabled(false);
        f4918f.add(productInfo52);
        a4.mo35407a(productInfo52);
        ProductInfo productInfo53 = new ProductInfo();
        productInfo53.setProductIcon(R$drawable.icon_yeelight_device_badge_lamp15_big);
        productInfo53.setProductName(resources.getString(R$string.yeelight_device_name_lamp15));
        productInfo53.setProductModel("yeelink.light.lamp15");
        productInfo53.setEnabled(true);
        f4918f.add(productInfo53);
        a4.mo35407a(productInfo53);
        ProductInfo productInfo54 = new ProductInfo();
        productInfo54.setProductIcon(R$drawable.icon_yeelight_device_badge_lamp9_big);
        productInfo54.setProductName(resources.getString(R$string.yeelight_device_name_lamp9));
        productInfo54.setProductModel("yeelink.light.lamp9");
        productInfo54.setEnabled(true);
        f4918f.add(productInfo54);
        a4.mo35407a(productInfo54);
        ProductInfo productInfo55 = new ProductInfo();
        productInfo55.setProductIcon(R$drawable.icon_yeelight_device_badge_lamp10_big);
        productInfo55.setProductName(resources.getString(R$string.yeelight_device_name_lamp10));
        productInfo55.setProductModel("yeelink.light.lamp10");
        productInfo55.setEnabled(true);
        f4918f.add(productInfo55);
        a4.mo35407a(productInfo55);
        ProductInfo productInfo56 = new ProductInfo();
        productInfo56.setProductIcon(R$drawable.icon_yeelight_device_badge_cherry_big);
        productInfo56.setProductName(resources.getString(R$string.yeelight_device_name_cherry));
        productInfo56.setProductModel("yeelink.light.ble1");
        productInfo56.setEnabled(true);
        f4918f.add(productInfo56);
        a4.mo35407a(productInfo56);
        ProductInfo productInfo57 = new ProductInfo();
        productInfo57.setProductIcon(R$drawable.icon_yeelight_device_badge_cherry1s_big);
        productInfo57.setProductName(resources.getString(R$string.yeelight_device_name_bslamp));
        productInfo57.setProductModel("yeelink.light.bslamp1");
        productInfo57.setEnabled(true);
        f4918f.add(productInfo57);
        a4.mo35407a(productInfo57);
        ProductInfo productInfo58 = new ProductInfo();
        productInfo58.setProductIcon(R$drawable.icon_yeelight_device_badge_dysis_big);
        productInfo58.setProductName(resources.getString(R$string.yeelight_device_name_bslamp2));
        productInfo58.setProductModel("yeelink.light.bslamp2");
        productInfo58.setEnabled(false);
        f4918f.add(productInfo58);
        a4.mo35407a(productInfo58);
        ProductInfo productInfo59 = new ProductInfo();
        productInfo59.setProductIcon(R$drawable.icon_yeelight_device_badge_gingko_big);
        productInfo59.setProductName(resources.getString(i));
        productInfo59.setProductModel("yeelink.light.gingko");
        productInfo59.setEnabled(true);
        f4918f.add(productInfo59);
        a4.mo35407a(productInfo59);
        ProductInfo productInfo60 = new ProductInfo();
        int i13 = R$drawable.icon_yeelight_device_badge_mango_big;
        productInfo60.setProductIcon(i13);
        productInfo60.setProductName(resources.getString(R$string.yeelight_device_name_lamp));
        productInfo60.setProductModel("yeelink.light.lamp1");
        productInfo60.setEnabled(true);
        f4918f.add(productInfo60);
        a4.mo35407a(productInfo60);
        ProductInfo productInfo61 = new ProductInfo();
        productInfo61.setProductIcon(i13);
        productInfo61.setProductName(resources.getString(R$string.yeelight_device_name_lamp_1s));
        productInfo61.setProductModel("yeelink.light.lamp4");
        productInfo61.setEnabled(true);
        f4918f.add(productInfo61);
        a4.mo35407a(productInfo61);
        ProductInfo productInfo62 = new ProductInfo();
        productInfo62.setProductIcon(R$drawable.icon_yeelight_device_badge_elf_big);
        productInfo62.setProductName(resources.getString(R$string.yeelight_device_name_lamp2));
        productInfo62.setProductModel("yeelink.light.lamp2");
        productInfo62.setEnabled(false);
        f4918f.add(productInfo62);
        a4.mo35407a(productInfo62);
        ProductInfo productInfo63 = new ProductInfo();
        productInfo63.setProductIcon(i12);
        productInfo63.setProductName(resources.getString(R$string.yeelight_device_name_lamp19));
        productInfo63.setProductModel("yeelink.light.lamp19");
        productInfo63.setEnabled(false);
        productInfo63.setDisplayInList(false);
        f4918f.add(productInfo63);
        a4.mo35407a(productInfo63);
        ProductInfo productInfo64 = new ProductInfo();
        productInfo64.setProductIcon(R$drawable.icon_yeelight_device_badge_lamp8_big);
        productInfo64.setProductName(resources.getString(R$string.yeelight_device_name_lamp8));
        productInfo64.setProductModel("yeelink.light.lamp8");
        productInfo64.setEnabled(true);
        f4918f.add(productInfo64);
        a4.mo35407a(productInfo64);
        ProductInfo productInfo65 = new ProductInfo();
        productInfo65.setProductIcon(R$drawable.icon_yeelight_device_badge_ml1_big);
        productInfo65.setProductName(resources.getString(R$string.yeelight_device_name_ml1));
        productInfo65.setProductModel("yeelink.light.ml1");
        productInfo65.setEnabled(true);
        f4918f.add(productInfo65);
        a5.mo35407a(productInfo65);
        ProductInfo productInfo66 = new ProductInfo();
        productInfo66.setProductIcon(R$drawable.icon_yeelight_device_badge_dnlight2_big);
        productInfo66.setProductName(resources.getString(R$string.yeelight_device_name_dnlight2));
        productInfo66.setProductModel("yeelink.light.dnlight2");
        productInfo66.setEnabled(true);
        f4918f.add(productInfo66);
        a5.mo35407a(productInfo66);
        ProductInfo productInfo67 = new ProductInfo();
        productInfo67.setProductIcon(R$drawable.icon_yeelight_device_badge_spot1_big);
        productInfo67.setProductName(resources.getString(R$string.yeelight_device_name_spot1));
        productInfo67.setProductModel("yeelink.light.spot1");
        productInfo67.setEnabled(true);
        f4918f.add(productInfo67);
        a5.mo35407a(productInfo67);
        ProductInfo productInfo68 = new ProductInfo();
        productInfo68.setProductIcon(R$drawable.icon_yeelight_device_badge_plate2_small);
        productInfo68.setProductName(resources.getString(R$string.yeelight_device_name_plate2));
        productInfo68.setProductModel("yeelink.light.plate2");
        productInfo68.setEnabled(true);
        f4918f.add(productInfo68);
        a6.mo35407a(productInfo68);
        ProductInfo productInfo69 = new ProductInfo();
        int i14 = R$drawable.icon_yeelight_device_badge_gateway_big;
        productInfo69.setProductIcon(i14);
        int i15 = R$string.yeelight_device_name_mesh_gateway;
        productInfo69.setProductName(resources.getString(i15));
        productInfo69.setProductModel("yeelink.gateway.v1");
        productInfo69.setEnabled(true);
        f4918f.add(productInfo69);
        a6.mo35407a(productInfo69);
        ProductInfo productInfo70 = new ProductInfo();
        productInfo70.setProductIcon(i14);
        productInfo70.setProductName(resources.getString(i15));
        productInfo70.setProductModel("yeelink.gateway.va");
        productInfo70.setEnabled(false);
        productInfo70.setDisplayInList(false);
        f4918f.add(productInfo70);
        a6.mo35407a(productInfo70);
        ProductInfo productInfo71 = new ProductInfo();
        productInfo71.setProductIcon(R$drawable.icon_yeelight_device_badge_sw1_big);
        productInfo71.setProductName(resources.getString(R$string.product_name_sw1));
        productInfo71.setProductModel("yeelink.switch.sw1");
        productInfo71.setEnabled(true);
        productInfo71.setDisplayInList(true);
        f4918f.add(productInfo71);
        a6.mo35407a(productInfo71);
        ProductInfo productInfo72 = new ProductInfo();
        productInfo72.setProductIcon(R$drawable.icon_yeelight_device_curtain_big);
        productInfo72.setProductName(resources.getString(R$string.product_name_curtain));
        productInfo72.setProductModel("yeelink.curtain.ctmt1");
        productInfo72.setEnabled(true);
        productInfo72.setDisplayInList(true);
        f4918f.add(productInfo72);
        a6.mo35407a(productInfo72);
        ProductInfo productInfo73 = new ProductInfo();
        productInfo73.setProductIcon(R$drawable.icon_yeelight_device_badge_donut_big);
        productInfo73.setProductName(resources.getString(R$string.yeelight_device_name_donut));
        productInfo73.setProductModel("yeelink.wifispeaker.v1");
        productInfo73.setEnabled(false);
        f4918f.add(productInfo73);
        a6.mo35407a(productInfo73);
        ProductInfo productInfo74 = new ProductInfo();
        productInfo74.setProductIcon(R$drawable.icon_yeelight_device_badge_plug_big);
        productInfo74.setProductName(resources.getString(R$string.product_name_plug));
        productInfo74.setProductModel("yeelink.plug.plug");
        productInfo74.setEnabled(true);
        productInfo74.setDisplayInList(true);
        f4918f.add(productInfo74);
        a6.mo35407a(productInfo74);
        ProductInfo productInfo75 = new ProductInfo();
        productInfo75.setProductIcon(R$drawable.icon_yeelight_default_avata);
        productInfo75.setProductName(resources.getString(R$string.yeelight_device_name_bhf));
        productInfo75.setProductModel("yeelink.bhf_light.v1");
        productInfo75.setEnabled(true);
        f4918f.add(productInfo75);
        a6.mo35407a(productInfo75);
        ProductInfo productInfo76 = new ProductInfo();
        productInfo76.setProductIcon(R$drawable.icon_yeelight_device_badge_ceiling32_big);
        productInfo76.setProductName(resources.getString(R$string.yeelight_device_name_ceiling32));
        productInfo76.setProductModel("yeelink.light.ceil32");
        productInfo76.setEnabled(true);
        productInfo76.setDisplayInList(true);
        f4918f.add(productInfo76);
        a3.mo35407a(productInfo76);
        ProductInfo productInfo77 = new ProductInfo();
        productInfo77.setProductIcon(R$drawable.icon_yeelight_device_badge_ceiling33_big);
        productInfo77.setProductName(resources.getString(R$string.yeelight_device_name_ceiling33));
        productInfo77.setProductModel("yeelink.light.ceil33");
        productInfo77.setEnabled(false);
        productInfo77.setDisplayInList(false);
        f4918f.add(productInfo77);
        a3.mo35407a(productInfo77);
        ProductInfo productInfo78 = new ProductInfo();
        int i16 = R$drawable.icon_yeelight_device_badge_ceiling12_big;
        productInfo78.setProductIcon(i16);
        int i17 = R$string.yeelight_device_name_ceiling18;
        productInfo78.setProductName(resources.getString(i17));
        productInfo78.setProductModel("yeelink.light.ceiling12");
        productInfo78.setEnabled(false);
        productInfo78.setDisplayInList(false);
        f4918f.add(productInfo78);
        a3.mo35407a(productInfo78);
        ProductInfo productInfo79 = new ProductInfo();
        productInfo79.setProductIcon(i8);
        int i18 = R$string.yeelight_device_name_ceiling;
        productInfo79.setProductName(resources.getString(i18));
        productInfo79.setProductModel("yeelink.light.ceiling1");
        productInfo79.setEnabled(false);
        productInfo79.setDisplayInList(false);
        f4918f.add(productInfo79);
        a3.mo35407a(productInfo79);
        ProductInfo productInfo80 = new ProductInfo();
        productInfo80.setProductIcon(i8);
        productInfo80.setProductName(resources.getString(R$string.yeelight_device_name_ceiling2));
        productInfo80.setProductModel("yeelink.light.ceiling2");
        productInfo80.setEnabled(false);
        productInfo80.setDisplayInList(false);
        f4918f.add(productInfo80);
        a3.mo35407a(productInfo80);
        ProductInfo productInfo81 = new ProductInfo();
        productInfo81.setProductIcon(R$drawable.icon_yeelight_device_badge_eos_big);
        productInfo81.setProductName(resources.getString(R$string.yeelight_device_name_ceiling3));
        productInfo81.setProductModel("yeelink.light.ceiling3");
        productInfo81.setEnabled(false);
        productInfo81.setDisplayInList(false);
        f4918f.add(productInfo81);
        a3.mo35407a(productInfo81);
        ProductInfo productInfo82 = new ProductInfo();
        productInfo82.setProductIcon(R$drawable.icon_yeelight_device_badge_eos_pro_big);
        productInfo82.setProductName(resources.getString(R$string.yeelight_device_name_ceiling4));
        productInfo82.setProductModel("yeelink.light.ceiling4");
        productInfo82.setEnabled(false);
        productInfo82.setDisplayInList(false);
        f4918f.add(productInfo82);
        a3.mo35407a(productInfo82);
        ProductInfo productInfo83 = new ProductInfo();
        productInfo83.setProductIcon(R$drawable.icon_yeelight_device_badge_cycle_big);
        productInfo83.setProductName(resources.getString(R$string.yeelight_device_name_ceiling5));
        productInfo83.setProductModel("yeelink.light.ceiling5");
        productInfo83.setEnabled(false);
        productInfo83.setDisplayInList(false);
        f4918f.add(productInfo83);
        a3.mo35407a(productInfo83);
        ProductInfo productInfo84 = new ProductInfo();
        productInfo84.setProductIcon(R$drawable.icon_yeelight_device_badge_nox_big);
        productInfo84.setProductName(resources.getString(R$string.yeelight_device_name_ceiling7));
        productInfo84.setProductModel("yeelink.light.ceiling7");
        productInfo84.setEnabled(false);
        productInfo84.setDisplayInList(false);
        f4918f.add(productInfo84);
        a3.mo35407a(productInfo84);
        ProductInfo productInfo85 = new ProductInfo();
        productInfo85.setProductIcon(R$drawable.icon_yeelight_device_badge_nox_plus_big);
        productInfo85.setProductName(resources.getString(R$string.yeelight_device_name_ceiling8));
        productInfo85.setProductModel("yeelink.light.ceiling8");
        productInfo85.setEnabled(false);
        productInfo85.setDisplayInList(false);
        f4918f.add(productInfo85);
        a3.mo35407a(productInfo85);
        ProductInfo productInfo86 = new ProductInfo();
        int i19 = R$drawable.icon_yeelight_device_badge_nox_pro_big;
        productInfo86.setProductIcon(i19);
        int i20 = R$string.yeelight_device_name_ceiling6;
        productInfo86.setProductName(resources.getString(i20));
        productInfo86.setProductModel("yeelink.light.ceiling6");
        productInfo86.setEnabled(false);
        productInfo86.setDisplayInList(false);
        f4918f.add(productInfo86);
        a3.mo35407a(productInfo86);
        ProductInfo productInfo87 = new ProductInfo();
        productInfo87.setProductIcon(i19);
        productInfo87.setProductName(resources.getString(i20));
        productInfo87.setProductModel("yeelink.light.ceiling9");
        productInfo87.setEnabled(false);
        productInfo87.setDisplayInList(false);
        f4918f.add(productInfo87);
        a3.mo35407a(productInfo87);
        ProductInfo productInfo88 = new ProductInfo();
        productInfo88.setProductIcon(R$drawable.icon_yeelight_device_badge_ceiling11_big);
        productInfo88.setProductName(resources.getString(i18));
        productInfo88.setProductModel("yeelink.light.ceiling11");
        productInfo88.setEnabled(false);
        productInfo88.setDisplayInList(false);
        f4918f.add(productInfo88);
        a3.mo35407a(productInfo88);
        ProductInfo productInfo89 = new ProductInfo();
        productInfo89.setProductIcon(i16);
        productInfo89.setProductName(resources.getString(i18));
        productInfo89.setProductModel("yeelink.light.ceiling12");
        productInfo89.setEnabled(false);
        productInfo89.setDisplayInList(false);
        f4918f.add(productInfo89);
        a3.mo35407a(productInfo89);
        ProductInfo productInfo90 = new ProductInfo();
        int i21 = R$drawable.icon_yeelight_device_badge_ceiling13_big;
        productInfo90.setProductIcon(i21);
        productInfo90.setProductName(resources.getString(i18));
        productInfo90.setProductModel("yeelink.light.ceiling13");
        productInfo90.setEnabled(false);
        productInfo90.setDisplayInList(false);
        f4918f.add(productInfo90);
        a3.mo35407a(productInfo90);
        ProductInfo productInfo91 = new ProductInfo();
        productInfo91.setProductIcon(i21);
        productInfo91.setProductName(resources.getString(i18));
        productInfo91.setProductModel("yeelink.light.ceiling14");
        productInfo91.setEnabled(false);
        productInfo91.setDisplayInList(false);
        f4918f.add(productInfo91);
        a3.mo35407a(productInfo91);
        ProductInfo productInfo92 = new ProductInfo();
        productInfo92.setProductIcon(R$drawable.icon_yeelight_device_badge_cycle_small);
        productInfo92.setProductName(resources.getString(i18));
        productInfo92.setProductModel("yeelink.light.ceiling15");
        productInfo92.setEnabled(false);
        productInfo92.setDisplayInList(false);
        f4918f.add(productInfo92);
        a3.mo35407a(productInfo92);
        ProductInfo productInfo93 = new ProductInfo();
        productInfo93.setProductIcon(R$drawable.icon_yeelight_device_badge_ceiling16_big);
        productInfo93.setProductName(resources.getString(R$string.yeelight_device_name_ceiling16));
        productInfo93.setProductModel("yeelink.light.ceiling16");
        productInfo93.setEnabled(false);
        productInfo93.setDisplayInList(false);
        f4918f.add(productInfo93);
        a3.mo35407a(productInfo93);
        ProductInfo productInfo94 = new ProductInfo();
        int i22 = R$drawable.icon_yeelight_device_badge_ceiling17_big;
        productInfo94.setProductIcon(i22);
        int i23 = R$string.yeelight_device_name_ceiling17;
        productInfo94.setProductName(resources.getString(i23));
        productInfo94.setProductModel("yeelink.light.ceiling17");
        productInfo94.setEnabled(false);
        productInfo94.setDisplayInList(false);
        f4918f.add(productInfo94);
        a3.mo35407a(productInfo94);
        ProductInfo productInfo95 = new ProductInfo();
        productInfo95.setProductIcon(i22);
        productInfo95.setProductName(resources.getString(i17));
        productInfo95.setProductModel("yeelink.light.ceiling18");
        productInfo95.setEnabled(false);
        productInfo95.setDisplayInList(false);
        f4918f.add(productInfo95);
        a3.mo35407a(productInfo95);
        ProductInfo productInfo96 = new ProductInfo();
        productInfo96.setProductIcon(i22);
        productInfo96.setProductName(resources.getString(i23));
        productInfo96.setProductModel("yeelink.light.ceiling19");
        productInfo96.setEnabled(false);
        productInfo96.setDisplayInList(false);
        f4918f.add(productInfo96);
        a3.mo35407a(productInfo96);
        ProductInfo productInfo97 = new ProductInfo();
        productInfo97.setProductIcon(i22);
        productInfo97.setProductName(resources.getString(R$string.yeelight_device_name_ceiling20));
        productInfo97.setProductModel("yeelink.light.ceiling20");
        productInfo97.setEnabled(false);
        productInfo97.setDisplayInList(false);
        f4918f.add(productInfo97);
        a3.mo35407a(productInfo97);
        ProductInfo productInfo98 = new ProductInfo();
        productInfo98.setProductIcon(i22);
        productInfo98.setProductName(resources.getString(R$string.yeelight_device_name_ceiling21));
        productInfo98.setProductModel("yeelink.light.ceiling21");
        productInfo98.setEnabled(false);
        productInfo98.setDisplayInList(false);
        f4918f.add(productInfo98);
        a3.mo35407a(productInfo98);
        ProductInfo productInfo99 = new ProductInfo();
        productInfo99.setProductIcon(i22);
        productInfo99.setProductName(resources.getString(R$string.yeelight_device_name_ceiling22));
        productInfo99.setProductModel("yeelink.light.ceiling22");
        productInfo99.setEnabled(false);
        productInfo99.setDisplayInList(false);
        f4918f.add(productInfo99);
        a3.mo35407a(productInfo99);
        ProductInfo productInfo100 = new ProductInfo();
        productInfo100.setProductIcon(i22);
        productInfo100.setProductName(resources.getString(R$string.yeelight_device_name_ceiling23));
        productInfo100.setProductModel("yeelink.light.ceiling23");
        productInfo100.setEnabled(false);
        productInfo100.setDisplayInList(false);
        f4918f.add(productInfo100);
        a3.mo35407a(productInfo100);
        ProductInfo productInfo101 = new ProductInfo();
        productInfo101.setProductIcon(i22);
        productInfo101.setProductName(resources.getString(R$string.yeelight_device_name_ceiling24));
        productInfo101.setProductModel("yeelink.light.ceiling24");
        productInfo101.setEnabled(false);
        productInfo101.setDisplayInList(false);
        f4918f.add(productInfo101);
        a3.mo35407a(productInfo101);
        ProductInfo productInfo102 = new ProductInfo();
        productInfo102.setProductIcon(R$drawable.icon_yeelight_device_badge_ceiling26_big);
        int i24 = R$string.yeelight_device_name_ceil26;
        productInfo102.setProductName(resources.getString(i24));
        productInfo102.setProductModel("yeelink.light.ceil26");
        productInfo102.setEnabled(false);
        productInfo102.setDisplayInList(false);
        f4918f.add(productInfo102);
        a3.mo35407a(productInfo102);
        ProductInfo productInfo103 = new ProductInfo();
        productInfo103.setProductIcon(i8);
        productInfo103.setProductName(resources.getString(i24));
        productInfo103.setProductModel("yeelink.light.ceila");
        productInfo103.setEnabled(false);
        productInfo103.setDisplayInList(false);
        f4918f.add(productInfo103);
        a3.mo35407a(productInfo103);
        ProductInfo productInfo104 = new ProductInfo();
        productInfo104.setProductIcon(i22);
        productInfo104.setProductName(resources.getString(R$string.yeelight_device_name_ceilingb));
        productInfo104.setProductModel("yeelink.light.ceilb");
        productInfo104.setEnabled(false);
        productInfo104.setDisplayInList(false);
        f4918f.add(productInfo104);
        a3.mo35407a(productInfo104);
        ProductInfo productInfo105 = new ProductInfo();
        productInfo105.setProductIcon(i22);
        productInfo105.setProductName(resources.getString(R$string.yeelight_device_name_ceilingc));
        productInfo105.setProductModel("yeelink.light.ceilc");
        productInfo105.setEnabled(false);
        productInfo105.setDisplayInList(false);
        f4918f.add(productInfo105);
        a3.mo35407a(productInfo105);
        ProductInfo productInfo106 = new ProductInfo();
        productInfo106.setProductIcon(R$drawable.icon_yeelight_device_badge_ceilingc_big);
        productInfo106.setProductName(resources.getString(R$string.yeelight_device_name_ceilingd));
        productInfo106.setProductModel("yeelink.light.ceild");
        productInfo106.setEnabled(false);
        productInfo106.setDisplayInList(false);
        f4918f.add(productInfo106);
        a3.mo35407a(productInfo106);
        ProductInfo productInfo107 = new ProductInfo();
        productInfo107.setProductIcon(R$drawable.icon_yeelight_device_badge_ceiling27_big);
        productInfo107.setProductName(resources.getString(R$string.yeelight_device_name_ceiling27));
        productInfo107.setProductModel("yeelink.light.ceil27");
        productInfo107.setEnabled(false);
        productInfo107.setDisplayInList(false);
        f4918f.add(productInfo107);
        a3.mo35407a(productInfo107);
        ProductInfo productInfo108 = new ProductInfo();
        productInfo108.setProductIcon(R$drawable.icon_yeelight_device_badge_ceiling29_big);
        productInfo108.setProductName(resources.getString(R$string.yeelight_device_name_ceiling29));
        productInfo108.setProductModel("yeelink.light.ceil29");
        productInfo108.setEnabled(false);
        productInfo108.setDisplayInList(false);
        f4918f.add(productInfo108);
        a3.mo35407a(productInfo108);
        ProductInfo productInfo109 = new ProductInfo();
        productInfo109.setProductIcon(R$drawable.icon_yeelight_device_badge_ceiling31_big);
        productInfo109.setProductName(resources.getString(R$string.yeelight_device_name_ceiling31));
        productInfo109.setProductModel("yeelink.light.ceil31");
        productInfo109.setEnabled(false);
        productInfo109.setDisplayInList(false);
        f4918f.add(productInfo109);
        a3.mo35407a(productInfo109);
        ProductInfo productInfo110 = new ProductInfo();
        productInfo110.setProductIcon(R$drawable.icon_yeelight_device_badge_kaiyue_480_big);
        productInfo110.setProductName(resources.getString(R$string.yeelight_device_name_yilai_ceiling1));
        productInfo110.setProductModel("yilai.light.ceiling1");
        productInfo110.setEnabled(false);
        productInfo110.setDisplayInList(false);
        f4918f.add(productInfo110);
        a3.mo35407a(productInfo110);
        ProductInfo productInfo111 = new ProductInfo();
        productInfo111.setProductIcon(R$drawable.icon_yeelight_device_badge_hefeng_430_big);
        productInfo111.setProductName(resources.getString(R$string.yeelight_device_name_yilai_ceiling2));
        productInfo111.setProductModel("yilai.light.ceiling2");
        productInfo111.setEnabled(false);
        productInfo111.setDisplayInList(false);
        f4918f.add(productInfo111);
        a3.mo35407a(productInfo111);
        ProductInfo productInfo112 = new ProductInfo();
        productInfo112.setProductIcon(R$drawable.icon_yeelight_device_badge_hefeng_pro_big);
        productInfo112.setProductName(resources.getString(R$string.yeelight_device_name_yilai_ceiling3));
        productInfo112.setProductModel("yilai.light.ceiling3");
        productInfo112.setEnabled(false);
        productInfo112.setDisplayInList(false);
        f4918f.add(productInfo112);
        a3.mo35407a(productInfo112);
    }

    /* renamed from: q */
    public static void m8119q() {
        f4917e = null;
    }

    /* renamed from: e */
    public List<ProductInfo> mo23466e() {
        return this.f4922b;
    }

    /* renamed from: f */
    public List<ProductInfo> mo23467f() {
        return this.f4921a;
    }

    /* renamed from: h */
    public ProductInfo mo23468h(String str) {
        for (ProductInfo next : f4918f) {
            if (TextUtils.equals(next.getProductModel(), str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: i */
    public List<C8325q> mo23469i() {
        return f4920h;
    }

    /* renamed from: j */
    public C8325q mo23470j(int i) {
        for (C8325q next : f4920h) {
            if (next.mo35412f() == i) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: k */
    public C8325q mo23471k(String str) {
        for (C8325q next : f4920h) {
            Iterator<ProductInfo> it = next.mo35408b().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (TextUtils.equals(str, it.next().getProductModel())) {
                        return next;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: l */
    public int mo23472l(String str) {
        if (str == null) {
            return 0;
        }
        for (ProductInfo next : f4918f) {
            if (str.equals(next.getProductModel())) {
                return next.getMinFirmwareVer();
            }
        }
        for (ProductInfo next2 : f4919g) {
            if (str.equals(next2.getProductModel())) {
                return next2.getMinFirmwareVer();
            }
        }
        return 0;
    }

    /* renamed from: m */
    public String mo23473m(String str) {
        if (str == null) {
            return null;
        }
        for (ProductInfo next : f4918f) {
            if (str.equals(next.getProductModel())) {
                return next.getProductName();
            }
        }
        for (ProductInfo next2 : f4919g) {
            if (str.equals(next2.getProductModel())) {
                return next2.getProductName();
            }
        }
        return null;
    }

    /* renamed from: o */
    public boolean mo23474o(String str) {
        List<String> list;
        if (TextUtils.isEmpty(str) || (list = this.f4924d) == null || list.isEmpty()) {
            return true;
        }
        return this.f4924d.contains(str);
    }

    /* renamed from: p */
    public void mo23475p(C3091b bVar) {
        if (!this.f4923c.contains(bVar)) {
            this.f4923c.add(bVar);
        }
    }

    /* renamed from: r */
    public void mo23476r() {
        String str = AppUtils.f4993q + "new_products?debug=" + (AppUtils.f4977a ? 1 : 0);
        StringBuilder sb = new StringBuilder();
        sb.append("products url: ");
        sb.append(str);
        C3988b.m11567c(str, String.class, new C3089a());
    }

    /* renamed from: s */
    public void mo23477s(C3091b bVar) {
        this.f4923c.remove(bVar);
    }

    /* renamed from: t */
    public void mo23478t() {
        this.f4921a.clear();
        for (ProductInfo next : f4918f) {
            if (next.isEnabled() && next.isDisplayInList()) {
                this.f4921a.add(next);
            }
        }
        this.f4922b.clear();
        for (ProductInfo next2 : f4919g) {
            if (next2.isEnabled() && next2.isDisplayInList()) {
                this.f4922b.add(next2);
            }
        }
        for (C8325q i : f4920h) {
            i.mo35415i();
        }
    }
}

package com.yeelight.yeelib.device.models;

import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.miot.common.config.AppConfiguration;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p152f.C4230l;
import com.yeelight.yeelib.utils.C4308b;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.p271io.FilenameUtils;
import org.apache.commons.p271io.IOUtils;

/* renamed from: com.yeelight.yeelib.device.models.k */
public class C7632k {

    /* renamed from: a */
    public static Map<String, C7633a> f15620a;

    /* renamed from: b */
    public static Map<String, C7633a> f15621b;

    /* renamed from: com.yeelight.yeelib.device.models.k$a */
    public static class C7633a {

        /* renamed from: a */
        int f15622a = -1;

        /* renamed from: b */
        int f15623b = -1;

        public C7633a(int i, int i2) {
            this.f15622a = i;
            this.f15623b = i2;
        }

        /* renamed from: a */
        public int mo29079a() {
            return this.f15623b;
        }

        /* renamed from: b */
        public int mo29080b() {
            return this.f15622a;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f15620a = hashMap;
        hashMap.put("yeelink.light.mono1", new C7633a(4000, 4000));
        f15620a.put("yeelink.light.mono4", new C7633a(4000, 4000));
        f15620a.put("yeelink.light.mono5", new C7633a(4000, 4000));
        f15620a.put("yeelink.light.monoa", new C7633a(4000, 4000));
        f15620a.put("yeelink.light.monob", new C7633a(4000, 4000));
        f15620a.put("yeelink.light.panel1", new C7633a(4000, 4000));
        f15620a.put("yeelink.light.lamp3", new C7633a(4000, 4000));
        f15620a.put("yeelink.light.lamp5", new C7633a(4000, 4000));
        f15620a.put("yeelink.light.lamp17", new C7633a(4000, 4000));
        f15620a.put("yeelink.light.mono2", new C7633a(4000, 4000));
        f15620a.put("yeelink.light.ble1", new C7633a(1700, 6500));
        f15620a.put("yeelink.light.color1", new C7633a(1700, 6500));
        f15620a.put("yeelink.light.color2", new C7633a(1700, 6500));
        f15620a.put("yeelink.light.color3", new C7633a(1700, 6500));
        f15620a.put("yeelink.light.color4", new C7633a(1700, 6500));
        f15620a.put("yeelink.light.color5", new C7633a(1700, 6500));
        f15620a.put("yeelink.light.color6", new C7633a(1700, 6500));
        f15620a.put("yeelink.light.color8", new C7633a(1700, 6500));
        f15620a.put("yeelink.light.colora", new C7633a(1700, 6500));
        f15620a.put("yeelink.light.colorb", new C7633a(1700, 6500));
        f15620a.put("yeelink.light.colorc", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ct2", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.cta", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.strip4", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.panel3", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.lamp1", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.lamp4", new C7633a(2600, 5000));
        f15620a.put("yeelink.light.lamp7", new C7633a(PathInterpolatorCompat.MAX_NUM_POINTS, 5000));
        f15620a.put("yeelink.light.lamp8", new C7633a(PathInterpolatorCompat.MAX_NUM_POINTS, 5000));
        f15620a.put("yeelink.light.lamp9", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.lamp15", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.lamp10", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.lamp2", new C7633a(2500, 4800));
        f15620a.put("yeelink.light.strip1", new C7633a(1700, 6500));
        f15620a.put("yeelink.light.strip2", new C7633a(1700, 6500));
        f15620a.put("yeelink.light.strip6", new C7633a(1700, 6500));
        f15620a.put("yeelink.light.stripa", new C7633a(1700, 6500));
        f15620a.put("yeelink.light.bslamp1", new C7633a(1700, 6500));
        f15620a.put("yeelink.light.bslamp2", new C7633a(1700, 6500));
        f15620a.put("yeelink.light.bslamp3", new C7633a(1700, 6500));
        f15620a.put("yeelink.light.lamp19", new C7633a(1700, 6500));
        f15620a.put("yeelink.light.ceiling1", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ceiling2", new C7633a(4000, 4000));
        f15620a.put("yeelink.light.ceiling3", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ceiling4", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ceiling5", new C7633a(2700, 5700));
        f15620a.put("yeelink.light.ceiling6", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ceiling7", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ceiling8", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ceiling9", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ceiling10", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ceiling11", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ceiling12", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ceiling13", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ceiling14", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ceiling15", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ceiling16", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ceiling17", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ceiling18", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ceiling19", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ceiling20", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ceiling21", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ceiling22", new C7633a(2600, 6100));
        f15620a.put("yeelink.light.ceiling23", new C7633a(2600, 6100));
        f15620a.put("yeelink.light.ceiling24", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ceil26", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ceil27", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ceil29", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ceil30", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ceil31", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ceil32", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ceil33", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ceila", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ceilb", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ceilc", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ceild", new C7633a(PathInterpolatorCompat.MAX_NUM_POINTS, 6500));
        f15620a.put("yilai.light.ceiling1", new C7633a(2700, 6500));
        f15620a.put("yilai.light.ceiling2", new C7633a(2700, 6500));
        f15620a.put("yilai.light.ceiling3", new C7633a(2700, 6500));
        f15620a.put("yeelink.bhf_light.v1", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ceiling4.ambi", new C7633a(1700, 6500));
        f15620a.put("yeelink.light.gingko", new C7633a(2700, 2700));
        f15620a.put("yeelink.light.dnlight2", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.meshbulb1", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.meshbulb2", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.spot1", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ml1", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.ml2", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.dn2grp", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.mb1grp", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.mb2grp", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.sp1grp", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.fancl1", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.fancl2", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.fancl5", new C7633a(2700, 6500));
        f15620a.put("yeelink.light.fancl6", new C7633a(2700, 6500));
        HashMap hashMap2 = new HashMap();
        f15621b = hashMap2;
        hashMap2.put("yeelink.light.lamp1", new C7633a(2700, 4000));
        f15621b.put("yeelink.light.lamp4", new C7633a(2600, 4000));
        f15621b.put("yeelink.light.lamp2", new C7633a(2500, 4000));
    }

    /* renamed from: a */
    public static int m22540a(int i, int i2) {
        return i & i2;
    }

    /* renamed from: b */
    public static C7633a m22541b(String str) {
        return f15620a.get(str);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m22542c(java.lang.String r8) {
        /*
            int r0 = r8.hashCode()
            r1 = 1
            r2 = 71
            r3 = 7
            r4 = 3
            switch(r0) {
                case -1644531059: goto L_0x0466;
                case -1462015191: goto L_0x045b;
                case -1462015190: goto L_0x0450;
                case -1462015189: goto L_0x0445;
                case -1462015188: goto L_0x043a;
                case -1462015187: goto L_0x042f;
                case -1462015186: goto L_0x0424;
                case -1462015185: goto L_0x0419;
                case -1462015184: goto L_0x040e;
                case -1462015183: goto L_0x0402;
                case -1462015182: goto L_0x03f6;
                case -1462015160: goto L_0x03ea;
                case -1462015159: goto L_0x03de;
                case -1462015158: goto L_0x03d2;
                case -1462015157: goto L_0x03c6;
                case -1462015156: goto L_0x03ba;
                case -1400275319: goto L_0x03af;
                case -1317475940: goto L_0x03a3;
                case -1317475939: goto L_0x0397;
                case -1317475937: goto L_0x038b;
                case -1317475915: goto L_0x037f;
                case -1317475914: goto L_0x0373;
                case -1317475913: goto L_0x0367;
                case -1317475912: goto L_0x035b;
                case -1308146495: goto L_0x034f;
                case -1308146494: goto L_0x0343;
                case -1308146493: goto L_0x0337;
                case -1308146492: goto L_0x032b;
                case -1308146491: goto L_0x031f;
                case -1308146490: goto L_0x0313;
                case -1308146488: goto L_0x0307;
                case -1308146447: goto L_0x02fb;
                case -1308146446: goto L_0x02ef;
                case -1308146445: goto L_0x02e3;
                case -1282176368: goto L_0x02d7;
                case -1235140472: goto L_0x02cb;
                case -1235140471: goto L_0x02bf;
                case -1235140468: goto L_0x02b3;
                case -1235140467: goto L_0x02a7;
                case -1199119278: goto L_0x029b;
                case -1063384694: goto L_0x028f;
                case -1063384689: goto L_0x0283;
                case -1063384687: goto L_0x0277;
                case -1063384685: goto L_0x026b;
                case -1035626052: goto L_0x025f;
                case -1035596261: goto L_0x0253;
                case -948847040: goto L_0x0248;
                case -948847038: goto L_0x023c;
                case -888668266: goto L_0x0230;
                case -888668265: goto L_0x0224;
                case -888668264: goto L_0x0218;
                case -850921852: goto L_0x020c;
                case -845289556: goto L_0x0200;
                case -845289555: goto L_0x01f4;
                case -845289553: goto L_0x01e8;
                case -845289551: goto L_0x01dc;
                case -845289508: goto L_0x01d0;
                case -458141175: goto L_0x01c4;
                case -458141174: goto L_0x01b8;
                case -458141173: goto L_0x01ac;
                case -458141172: goto L_0x01a0;
                case -449944730: goto L_0x0194;
                case -449944729: goto L_0x0188;
                case -449944728: goto L_0x017c;
                case -449944727: goto L_0x0170;
                case -449944726: goto L_0x0164;
                case -449944724: goto L_0x0158;
                case -449944723: goto L_0x014c;
                case -449944722: goto L_0x0140;
                case -448603205: goto L_0x0135;
                case -448603204: goto L_0x012a;
                case -448603202: goto L_0x011f;
                case -448603201: goto L_0x0114;
                case -448603157: goto L_0x0109;
                case -448603156: goto L_0x00fe;
                case -443031172: goto L_0x00f2;
                case 922669543: goto L_0x00e6;
                case 922669544: goto L_0x00da;
                case 922669545: goto L_0x00ce;
                case 922669546: goto L_0x00c2;
                case 922669547: goto L_0x00b6;
                case 922669548: goto L_0x00aa;
                case 922669549: goto L_0x009e;
                case 922669550: goto L_0x0092;
                case 922669551: goto L_0x0086;
                case 1201756974: goto L_0x007a;
                case 1201757021: goto L_0x006e;
                case 1201766335: goto L_0x0062;
                case 1201766336: goto L_0x0056;
                case 1623724661: goto L_0x004a;
                case 1623724662: goto L_0x003e;
                case 1623724663: goto L_0x0032;
                case 2102612488: goto L_0x0026;
                case 2102612489: goto L_0x001a;
                case 2146130361: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0471
        L_0x000e:
            java.lang.String r0 = "yeelink.light.dnlight2"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 83
            goto L_0x0472
        L_0x001a:
            java.lang.String r0 = "yeelink.light.meshbulb2"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 82
            goto L_0x0472
        L_0x0026:
            java.lang.String r0 = "yeelink.light.meshbulb1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 81
            goto L_0x0472
        L_0x0032:
            java.lang.String r0 = "yeelink.light.bslamp3"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 79
            goto L_0x0472
        L_0x003e:
            java.lang.String r0 = "yeelink.light.bslamp2"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 78
            goto L_0x0472
        L_0x004a:
            java.lang.String r0 = "yeelink.light.bslamp1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 77
            goto L_0x0472
        L_0x0056:
            java.lang.String r0 = "yeelink.light.ml2"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 86
            goto L_0x0472
        L_0x0062:
            java.lang.String r0 = "yeelink.light.ml1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 85
            goto L_0x0472
        L_0x006e:
            java.lang.String r0 = "yeelink.light.cta"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 21
            goto L_0x0472
        L_0x007a:
            java.lang.String r0 = "yeelink.light.ct2"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 20
            goto L_0x0472
        L_0x0086:
            java.lang.String r0 = "yeelink.light.ceiling9"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 59
            goto L_0x0472
        L_0x0092:
            java.lang.String r0 = "yeelink.light.ceiling8"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 68
            goto L_0x0472
        L_0x009e:
            java.lang.String r0 = "yeelink.light.ceiling7"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 67
            goto L_0x0472
        L_0x00aa:
            java.lang.String r0 = "yeelink.light.ceiling6"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 66
            goto L_0x0472
        L_0x00b6:
            java.lang.String r0 = "yeelink.light.ceiling5"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 65
            goto L_0x0472
        L_0x00c2:
            java.lang.String r0 = "yeelink.light.ceiling4"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 60
            goto L_0x0472
        L_0x00ce:
            java.lang.String r0 = "yeelink.light.ceiling3"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 58
            goto L_0x0472
        L_0x00da:
            java.lang.String r0 = "yeelink.light.ceiling2"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 57
            goto L_0x0472
        L_0x00e6:
            java.lang.String r0 = "yeelink.light.ceiling1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 39
            goto L_0x0472
        L_0x00f2:
            java.lang.String r0 = "yeelink.light.spot1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 84
            goto L_0x0472
        L_0x00fe:
            java.lang.String r0 = "yeelink.light.monob"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 6
            goto L_0x0472
        L_0x0109:
            java.lang.String r0 = "yeelink.light.monoa"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 5
            goto L_0x0472
        L_0x0114:
            java.lang.String r0 = "yeelink.light.mono5"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 4
            goto L_0x0472
        L_0x011f:
            java.lang.String r0 = "yeelink.light.mono4"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 3
            goto L_0x0472
        L_0x012a:
            java.lang.String r0 = "yeelink.light.mono2"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 2
            goto L_0x0472
        L_0x0135:
            java.lang.String r0 = "yeelink.light.mono1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 1
            goto L_0x0472
        L_0x0140:
            java.lang.String r0 = "yeelink.light.lamp9"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 56
            goto L_0x0472
        L_0x014c:
            java.lang.String r0 = "yeelink.light.lamp8"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 35
            goto L_0x0472
        L_0x0158:
            java.lang.String r0 = "yeelink.light.lamp7"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 34
            goto L_0x0472
        L_0x0164:
            java.lang.String r0 = "yeelink.light.lamp5"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 37
            goto L_0x0472
        L_0x0170:
            java.lang.String r0 = "yeelink.light.lamp4"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 33
            goto L_0x0472
        L_0x017c:
            java.lang.String r0 = "yeelink.light.lamp3"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 36
            goto L_0x0472
        L_0x0188:
            java.lang.String r0 = "yeelink.light.lamp2"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 32
            goto L_0x0472
        L_0x0194:
            java.lang.String r0 = "yeelink.light.lamp1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 31
            goto L_0x0472
        L_0x01a0:
            java.lang.String r0 = "yeelink.light.ceild"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 55
            goto L_0x0472
        L_0x01ac:
            java.lang.String r0 = "yeelink.light.ceilc"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 64
            goto L_0x0472
        L_0x01b8:
            java.lang.String r0 = "yeelink.light.ceilb"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 63
            goto L_0x0472
        L_0x01c4:
            java.lang.String r0 = "yeelink.light.ceila"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 54
            goto L_0x0472
        L_0x01d0:
            java.lang.String r0 = "yeelink.light.stripa"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 30
            goto L_0x0472
        L_0x01dc:
            java.lang.String r0 = "yeelink.light.strip6"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 29
            goto L_0x0472
        L_0x01e8:
            java.lang.String r0 = "yeelink.light.strip4"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 22
            goto L_0x0472
        L_0x01f4:
            java.lang.String r0 = "yeelink.light.strip2"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 28
            goto L_0x0472
        L_0x0200:
            java.lang.String r0 = "yeelink.light.strip1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 27
            goto L_0x0472
        L_0x020c:
            java.lang.String r0 = "yeelink.light.sp1grp"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 90
            goto L_0x0472
        L_0x0218:
            java.lang.String r0 = "yilai.light.ceiling3"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 26
            goto L_0x0472
        L_0x0224:
            java.lang.String r0 = "yilai.light.ceiling2"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 25
            goto L_0x0472
        L_0x0230:
            java.lang.String r0 = "yilai.light.ceiling1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 24
            goto L_0x0472
        L_0x023c:
            java.lang.String r0 = "yeelink.light.panel3"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 23
            goto L_0x0472
        L_0x0248:
            java.lang.String r0 = "yeelink.light.panel1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 7
            goto L_0x0472
        L_0x0253:
            java.lang.String r0 = "yeelink.light.mb2grp"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 88
            goto L_0x0472
        L_0x025f:
            java.lang.String r0 = "yeelink.light.mb1grp"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 87
            goto L_0x0472
        L_0x026b:
            java.lang.String r0 = "yeelink.light.lamp19"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 80
            goto L_0x0472
        L_0x0277:
            java.lang.String r0 = "yeelink.light.lamp17"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 38
            goto L_0x0472
        L_0x0283:
            java.lang.String r0 = "yeelink.light.lamp15"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 70
            goto L_0x0472
        L_0x028f:
            java.lang.String r0 = "yeelink.light.lamp10"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 18
            goto L_0x0472
        L_0x029b:
            java.lang.String r0 = "yeelink.light.gingko"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 8
            goto L_0x0472
        L_0x02a7:
            java.lang.String r0 = "yeelink.light.fancl6"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 94
            goto L_0x0472
        L_0x02b3:
            java.lang.String r0 = "yeelink.light.fancl5"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 93
            goto L_0x0472
        L_0x02bf:
            java.lang.String r0 = "yeelink.light.fancl2"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 92
            goto L_0x0472
        L_0x02cb:
            java.lang.String r0 = "yeelink.light.fancl1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 91
            goto L_0x0472
        L_0x02d7:
            java.lang.String r0 = "yeelink.light.dn2grp"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 89
            goto L_0x0472
        L_0x02e3:
            java.lang.String r0 = "yeelink.light.colorc"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 17
            goto L_0x0472
        L_0x02ef:
            java.lang.String r0 = "yeelink.light.colorb"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 16
            goto L_0x0472
        L_0x02fb:
            java.lang.String r0 = "yeelink.light.colora"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 15
            goto L_0x0472
        L_0x0307:
            java.lang.String r0 = "yeelink.light.color8"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 14
            goto L_0x0472
        L_0x0313:
            java.lang.String r0 = "yeelink.light.color6"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 19
            goto L_0x0472
        L_0x031f:
            java.lang.String r0 = "yeelink.light.color5"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 13
            goto L_0x0472
        L_0x032b:
            java.lang.String r0 = "yeelink.light.color4"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 12
            goto L_0x0472
        L_0x0337:
            java.lang.String r0 = "yeelink.light.color3"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 11
            goto L_0x0472
        L_0x0343:
            java.lang.String r0 = "yeelink.light.color2"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 10
            goto L_0x0472
        L_0x034f:
            java.lang.String r0 = "yeelink.light.color1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 9
            goto L_0x0472
        L_0x035b:
            java.lang.String r0 = "yeelink.light.ceil33"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 53
            goto L_0x0472
        L_0x0367:
            java.lang.String r0 = "yeelink.light.ceil32"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 52
            goto L_0x0472
        L_0x0373:
            java.lang.String r0 = "yeelink.light.ceil31"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 75
            goto L_0x0472
        L_0x037f:
            java.lang.String r0 = "yeelink.light.ceil30"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 74
            goto L_0x0472
        L_0x038b:
            java.lang.String r0 = "yeelink.light.ceil29"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 51
            goto L_0x0472
        L_0x0397:
            java.lang.String r0 = "yeelink.light.ceil27"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 50
            goto L_0x0472
        L_0x03a3:
            java.lang.String r0 = "yeelink.light.ceil26"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 49
            goto L_0x0472
        L_0x03af:
            java.lang.String r0 = "yeelink.light.ble1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 0
            goto L_0x0472
        L_0x03ba:
            java.lang.String r0 = "yeelink.light.ceiling24"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 73
            goto L_0x0472
        L_0x03c6:
            java.lang.String r0 = "yeelink.light.ceiling23"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 48
            goto L_0x0472
        L_0x03d2:
            java.lang.String r0 = "yeelink.light.ceiling22"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 47
            goto L_0x0472
        L_0x03de:
            java.lang.String r0 = "yeelink.light.ceiling21"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 46
            goto L_0x0472
        L_0x03ea:
            java.lang.String r0 = "yeelink.light.ceiling20"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 62
            goto L_0x0472
        L_0x03f6:
            java.lang.String r0 = "yeelink.light.ceiling19"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 61
            goto L_0x0472
        L_0x0402:
            java.lang.String r0 = "yeelink.light.ceiling18"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 45
            goto L_0x0472
        L_0x040e:
            java.lang.String r0 = "yeelink.light.ceiling17"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 72
            goto L_0x0472
        L_0x0419:
            java.lang.String r0 = "yeelink.light.ceiling16"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 71
            goto L_0x0472
        L_0x0424:
            java.lang.String r0 = "yeelink.light.ceiling15"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 44
            goto L_0x0472
        L_0x042f:
            java.lang.String r0 = "yeelink.light.ceiling14"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 43
            goto L_0x0472
        L_0x043a:
            java.lang.String r0 = "yeelink.light.ceiling13"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 42
            goto L_0x0472
        L_0x0445:
            java.lang.String r0 = "yeelink.light.ceiling12"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 41
            goto L_0x0472
        L_0x0450:
            java.lang.String r0 = "yeelink.light.ceiling11"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 40
            goto L_0x0472
        L_0x045b:
            java.lang.String r0 = "yeelink.light.ceiling10"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 69
            goto L_0x0472
        L_0x0466:
            java.lang.String r0 = "yeelink.bhf_light.v1"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0471
            r8 = 76
            goto L_0x0472
        L_0x0471:
            r8 = -1
        L_0x0472:
            r0 = 259(0x103, float:3.63E-43)
            r5 = 263(0x107, float:3.69E-43)
            r6 = 319(0x13f, float:4.47E-43)
            r7 = 327(0x147, float:4.58E-43)
            switch(r8) {
                case 0: goto L_0x0499;
                case 1: goto L_0x0498;
                case 2: goto L_0x0498;
                case 3: goto L_0x0498;
                case 4: goto L_0x0498;
                case 5: goto L_0x0498;
                case 6: goto L_0x0498;
                case 7: goto L_0x0498;
                case 8: goto L_0x0497;
                case 9: goto L_0x0496;
                case 10: goto L_0x0496;
                case 11: goto L_0x0496;
                case 12: goto L_0x0496;
                case 13: goto L_0x0496;
                case 14: goto L_0x0496;
                case 15: goto L_0x0496;
                case 16: goto L_0x0496;
                case 17: goto L_0x0496;
                case 18: goto L_0x0496;
                case 19: goto L_0x0493;
                case 20: goto L_0x0492;
                case 21: goto L_0x0492;
                case 22: goto L_0x0492;
                case 23: goto L_0x0492;
                case 24: goto L_0x0492;
                case 25: goto L_0x0492;
                case 26: goto L_0x0492;
                case 27: goto L_0x0491;
                case 28: goto L_0x0491;
                case 29: goto L_0x0491;
                case 30: goto L_0x0491;
                case 31: goto L_0x0490;
                case 32: goto L_0x0490;
                case 33: goto L_0x0490;
                case 34: goto L_0x0490;
                case 35: goto L_0x0490;
                case 36: goto L_0x048f;
                case 37: goto L_0x048f;
                case 38: goto L_0x048f;
                case 39: goto L_0x048e;
                case 40: goto L_0x048e;
                case 41: goto L_0x048e;
                case 42: goto L_0x048e;
                case 43: goto L_0x048e;
                case 44: goto L_0x048e;
                case 45: goto L_0x048e;
                case 46: goto L_0x048e;
                case 47: goto L_0x048e;
                case 48: goto L_0x048e;
                case 49: goto L_0x048e;
                case 50: goto L_0x048e;
                case 51: goto L_0x048e;
                case 52: goto L_0x048e;
                case 53: goto L_0x048e;
                case 54: goto L_0x048e;
                case 55: goto L_0x048e;
                case 56: goto L_0x048e;
                case 57: goto L_0x048b;
                case 58: goto L_0x048a;
                case 59: goto L_0x048a;
                case 60: goto L_0x0487;
                case 61: goto L_0x0487;
                case 62: goto L_0x0487;
                case 63: goto L_0x0487;
                case 64: goto L_0x0487;
                case 65: goto L_0x0486;
                case 66: goto L_0x0486;
                case 67: goto L_0x0486;
                case 68: goto L_0x0486;
                case 69: goto L_0x0483;
                case 70: goto L_0x0483;
                case 71: goto L_0x0482;
                case 72: goto L_0x0482;
                case 73: goto L_0x0482;
                case 74: goto L_0x0482;
                case 75: goto L_0x0482;
                case 76: goto L_0x0481;
                case 77: goto L_0x0480;
                case 78: goto L_0x0480;
                case 79: goto L_0x0480;
                case 80: goto L_0x0480;
                case 81: goto L_0x047f;
                case 82: goto L_0x047f;
                case 83: goto L_0x047f;
                case 84: goto L_0x047f;
                case 85: goto L_0x047f;
                case 86: goto L_0x047f;
                case 87: goto L_0x047f;
                case 88: goto L_0x047f;
                case 89: goto L_0x047f;
                case 90: goto L_0x047f;
                case 91: goto L_0x047f;
                case 92: goto L_0x047e;
                case 93: goto L_0x047e;
                case 94: goto L_0x047e;
                default: goto L_0x047d;
            }
        L_0x047d:
            return r1
        L_0x047e:
            return r2
        L_0x047f:
            return r3
        L_0x0480:
            return r6
        L_0x0481:
            return r7
        L_0x0482:
            return r5
        L_0x0483:
            r8 = 391(0x187, float:5.48E-43)
            return r8
        L_0x0486:
            return r7
        L_0x0487:
            r8 = 455(0x1c7, float:6.38E-43)
            return r8
        L_0x048a:
            return r7
        L_0x048b:
            r8 = 323(0x143, float:4.53E-43)
            return r8
        L_0x048e:
            return r7
        L_0x048f:
            return r0
        L_0x0490:
            return r5
        L_0x0491:
            return r6
        L_0x0492:
            return r5
        L_0x0493:
            r8 = 827(0x33b, float:1.159E-42)
            return r8
        L_0x0496:
            return r6
        L_0x0497:
            return r4
        L_0x0498:
            return r0
        L_0x0499:
            r8 = 287(0x11f, float:4.02E-43)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.models.C7632k.m22542c(java.lang.String):int");
    }

    /* renamed from: d */
    public static String m22543d(int i) {
        switch (i) {
            case 3:
                return "yeelink.light.gingko";
            case 7:
                return "yeelink.light.meshbulb1";
            case 71:
                return "yeelink.light.fancl2";
            case 259:
                return "yeelink.light.mono1";
            case 263:
                return "yeelink.light.lamp1";
            case 287:
                return "yeelink.light.ble1";
            case 315:
                return "yeelink.light.strip2";
            case 319:
                return "yeelink.light.color1";
            case 323:
                return "yeelink.light.ceiling2";
            case 327:
                return "yeelink.light.ceiling1";
            case 391:
                return "yeelink.light.ceiling10";
            case 455:
                return "yeelink.light.ceiling4";
            case 827:
                return "yeelink.light.color6";
            default:
                C4308b.m12139r("ProductModelFactory", "Invalid model type!");
                return "";
        }
    }

    /* renamed from: e */
    public static C7628j m22544e(int i) {
        switch (i) {
            case 1:
                return new C7625h0("yeelink.light.group");
            case 7:
                return new C7648v("yeelink.light.group");
            case 71:
                return new C7652z("yeelink.light.group");
            case 259:
                return new C7621f0("yeelink.light.group");
            case 263:
                return new C7648v("yeelink.light.group", true);
            case 287:
                return new C7650x("yeelink.light.group", true, true);
            case 315:
                return new C7647u("yeelink.light.group", true);
            case 319:
                return new C7646t("yeelink.light.group", true);
            case 323:
                return new C7643q("yeelink.light.group");
            case 327:
                return new C7642p("yeelink.light.group");
            case 391:
                return new C7639n("yeelink.light.group");
            case 455:
                return new C7645s("yeelink.light.group");
            default:
                return new C7621f0("yeelink.light.group");
        }
    }

    /* renamed from: f */
    public static C7633a m22545f(String str) {
        return f15621b.get(str);
    }

    /* renamed from: g */
    public static C7628j m22546g(String str) {
        return m22547h(str, (C4198d) null);
    }

    /* renamed from: h */
    public static C7628j m22547h(String str, C4198d dVar) {
        if (str == null || str.length() == 0) {
            "Invalid model string: " + str;
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1644531059:
                if (str.equals("yeelink.bhf_light.v1")) {
                    c = '^';
                    break;
                }
                break;
            case -1494338802:
                if (str.equals("yeelink.switch.sw1")) {
                    c = 'b';
                    break;
                }
                break;
            case -1462015191:
                if (str.equals("yeelink.light.ceiling10")) {
                    c = 'X';
                    break;
                }
                break;
            case -1462015190:
                if (str.equals("yeelink.light.ceiling11")) {
                    c = 'C';
                    break;
                }
                break;
            case -1462015189:
                if (str.equals("yeelink.light.ceiling12")) {
                    c = 'D';
                    break;
                }
                break;
            case -1462015188:
                if (str.equals("yeelink.light.ceiling13")) {
                    c = 'E';
                    break;
                }
                break;
            case -1462015187:
                if (str.equals("yeelink.light.ceiling14")) {
                    c = 'F';
                    break;
                }
                break;
            case -1462015186:
                if (str.equals("yeelink.light.ceiling15")) {
                    c = 'G';
                    break;
                }
                break;
            case -1462015185:
                if (str.equals("yeelink.light.ceiling16")) {
                    c = 'S';
                    break;
                }
                break;
            case -1462015184:
                if (str.equals("yeelink.light.ceiling17")) {
                    c = 'T';
                    break;
                }
                break;
            case -1462015183:
                if (str.equals("yeelink.light.ceiling18")) {
                    c = 'H';
                    break;
                }
                break;
            case -1462015182:
                if (str.equals("yeelink.light.ceiling19")) {
                    c = '9';
                    break;
                }
                break;
            case -1462015160:
                if (str.equals("yeelink.light.ceiling20")) {
                    c = ':';
                    break;
                }
                break;
            case -1462015159:
                if (str.equals("yeelink.light.ceiling21")) {
                    c = 'I';
                    break;
                }
                break;
            case -1462015158:
                if (str.equals("yeelink.light.ceiling22")) {
                    c = 'J';
                    break;
                }
                break;
            case -1462015157:
                if (str.equals("yeelink.light.ceiling23")) {
                    c = 'K';
                    break;
                }
                break;
            case -1462015156:
                if (str.equals("yeelink.light.ceiling24")) {
                    c = 'U';
                    break;
                }
                break;
            case -1400275319:
                if (str.equals("yeelink.light.ble1")) {
                    c = 0;
                    break;
                }
                break;
            case -1399953856:
                if (str.equals("yeelink.light.mesh")) {
                    c = 7;
                    break;
                }
                break;
            case -1350780909:
                if (str.equals("yeelink.plug.plug")) {
                    c = 'c';
                    break;
                }
                break;
            case -1317475940:
                if (str.equals("yeelink.light.ceil26")) {
                    c = 'L';
                    break;
                }
                break;
            case -1317475939:
                if (str.equals("yeelink.light.ceil27")) {
                    c = 'M';
                    break;
                }
                break;
            case -1317475937:
                if (str.equals("yeelink.light.ceil29")) {
                    c = 'N';
                    break;
                }
                break;
            case -1317475915:
                if (str.equals("yeelink.light.ceil30")) {
                    c = 'V';
                    break;
                }
                break;
            case -1317475914:
                if (str.equals("yeelink.light.ceil31")) {
                    c = 'W';
                    break;
                }
                break;
            case -1317475913:
                if (str.equals("yeelink.light.ceil32")) {
                    c = 'O';
                    break;
                }
                break;
            case -1317475912:
                if (str.equals("yeelink.light.ceil33")) {
                    c = 'P';
                    break;
                }
                break;
            case -1308146495:
                if (str.equals("yeelink.light.color1")) {
                    c = 27;
                    break;
                }
                break;
            case -1308146494:
                if (str.equals("yeelink.light.color2")) {
                    c = 28;
                    break;
                }
                break;
            case -1308146493:
                if (str.equals("yeelink.light.color3")) {
                    c = 29;
                    break;
                }
                break;
            case -1308146492:
                if (str.equals("yeelink.light.color4")) {
                    c = 30;
                    break;
                }
                break;
            case -1308146491:
                if (str.equals("yeelink.light.color5")) {
                    c = 31;
                    break;
                }
                break;
            case -1308146490:
                if (str.equals("yeelink.light.color6")) {
                    c = '&';
                    break;
                }
                break;
            case -1308146488:
                if (str.equals("yeelink.light.color8")) {
                    c = ' ';
                    break;
                }
                break;
            case -1308146447:
                if (str.equals("yeelink.light.colora")) {
                    c = '!';
                    break;
                }
                break;
            case -1308146446:
                if (str.equals("yeelink.light.colorb")) {
                    c = '\"';
                    break;
                }
                break;
            case -1308146445:
                if (str.equals("yeelink.light.colorc")) {
                    c = '#';
                    break;
                }
                break;
            case -1282176368:
                if (str.equals("yeelink.light.dn2grp")) {
                    c = 21;
                    break;
                }
                break;
            case -1235140472:
                if (str.equals("yeelink.light.fancl1")) {
                    c = 'd';
                    break;
                }
                break;
            case -1235140471:
                if (str.equals("yeelink.light.fancl2")) {
                    c = 'e';
                    break;
                }
                break;
            case -1235140468:
                if (str.equals("yeelink.light.fancl5")) {
                    c = 'f';
                    break;
                }
                break;
            case -1235140467:
                if (str.equals("yeelink.light.fancl6")) {
                    c = 'g';
                    break;
                }
                break;
            case -1199119278:
                if (str.equals("yeelink.light.gingko")) {
                    c = 9;
                    break;
                }
                break;
            case -1119332198:
                if (str.equals("yeelink.wifispeaker.v1")) {
                    c = ']';
                    break;
                }
                break;
            case -1063384694:
                if (str.equals("yeelink.light.lamp10")) {
                    c = '%';
                    break;
                }
                break;
            case -1063384689:
                if (str.equals("yeelink.light.lamp15")) {
                    c = IOUtils.DIR_SEPARATOR_UNIX;
                    break;
                }
                break;
            case -1063384687:
                if (str.equals("yeelink.light.lamp17")) {
                    c = '3';
                    break;
                }
                break;
            case -1063384685:
                if (str.equals("yeelink.light.lamp19")) {
                    c = IOUtils.DIR_SEPARATOR_WINDOWS;
                    break;
                }
                break;
            case -1035626052:
                if (str.equals("yeelink.light.mb1grp")) {
                    c = 22;
                    break;
                }
                break;
            case -1035596261:
                if (str.equals("yeelink.light.mb2grp")) {
                    c = 23;
                    break;
                }
                break;
            case -948847040:
                if (str.equals("yeelink.light.panel1")) {
                    c = 8;
                    break;
                }
                break;
            case -948847038:
                if (str.equals("yeelink.light.panel3")) {
                    c = 13;
                    break;
                }
                break;
            case -888668266:
                if (str.equals("yilai.light.ceiling1")) {
                    c = 14;
                    break;
                }
                break;
            case -888668265:
                if (str.equals("yilai.light.ceiling2")) {
                    c = 15;
                    break;
                }
                break;
            case -888668264:
                if (str.equals("yilai.light.ceiling3")) {
                    c = 16;
                    break;
                }
                break;
            case -850921852:
                if (str.equals("yeelink.light.sp1grp")) {
                    c = 24;
                    break;
                }
                break;
            case -845289556:
                if (str.equals("yeelink.light.strip1")) {
                    c = '$';
                    break;
                }
                break;
            case -845289555:
                if (str.equals("yeelink.light.strip2")) {
                    c = '\'';
                    break;
                }
                break;
            case -845289553:
                if (str.equals("yeelink.light.strip4")) {
                    c = 12;
                    break;
                }
                break;
            case -845289551:
                if (str.equals("yeelink.light.strip6")) {
                    c = '(';
                    break;
                }
                break;
            case -845289508:
                if (str.equals("yeelink.light.stripa")) {
                    c = ')';
                    break;
                }
                break;
            case -458141175:
                if (str.equals("yeelink.light.ceila")) {
                    c = 'Q';
                    break;
                }
                break;
            case -458141174:
                if (str.equals("yeelink.light.ceilb")) {
                    c = ';';
                    break;
                }
                break;
            case -458141173:
                if (str.equals("yeelink.light.ceilc")) {
                    c = '<';
                    break;
                }
                break;
            case -458141172:
                if (str.equals("yeelink.light.ceild")) {
                    c = 'R';
                    break;
                }
                break;
            case -454053748:
                if (str.equals("yeelink.light.group")) {
                    c = '4';
                    break;
                }
                break;
            case -449944730:
                if (str.equals("yeelink.light.lamp1")) {
                    c = '*';
                    break;
                }
                break;
            case -449944729:
                if (str.equals("yeelink.light.lamp2")) {
                    c = '0';
                    break;
                }
                break;
            case -449944728:
                if (str.equals("yeelink.light.lamp3")) {
                    c = '1';
                    break;
                }
                break;
            case -449944727:
                if (str.equals("yeelink.light.lamp4")) {
                    c = '+';
                    break;
                }
                break;
            case -449944726:
                if (str.equals("yeelink.light.lamp5")) {
                    c = '2';
                    break;
                }
                break;
            case -449944724:
                if (str.equals("yeelink.light.lamp7")) {
                    c = ',';
                    break;
                }
                break;
            case -449944723:
                if (str.equals("yeelink.light.lamp8")) {
                    c = '-';
                    break;
                }
                break;
            case -449944722:
                if (str.equals("yeelink.light.lamp9")) {
                    c = FilenameUtils.EXTENSION_SEPARATOR;
                    break;
                }
                break;
            case -448603205:
                if (str.equals("yeelink.light.mono1")) {
                    c = 1;
                    break;
                }
                break;
            case -448603204:
                if (str.equals("yeelink.light.mono2")) {
                    c = 2;
                    break;
                }
                break;
            case -448603202:
                if (str.equals("yeelink.light.mono4")) {
                    c = 3;
                    break;
                }
                break;
            case -448603201:
                if (str.equals("yeelink.light.mono5")) {
                    c = 4;
                    break;
                }
                break;
            case -448603157:
                if (str.equals("yeelink.light.monoa")) {
                    c = 5;
                    break;
                }
                break;
            case -448603156:
                if (str.equals("yeelink.light.monob")) {
                    c = 6;
                    break;
                }
                break;
            case -443031172:
                if (str.equals("yeelink.light.spot1")) {
                    c = 20;
                    break;
                }
                break;
            case -190173984:
                if (str.equals("yeelink.gateway.v1")) {
                    c = '_';
                    break;
                }
                break;
            case -190173936:
                if (str.equals("yeelink.gateway.va")) {
                    c = '`';
                    break;
                }
                break;
            case 152160739:
                if (str.equals("yeelink.bleremote.v1")) {
                    c = '5';
                    break;
                }
                break;
            case 674030242:
                if (str.equals("yeelink.curtain.ctmt1")) {
                    c = 'a';
                    break;
                }
                break;
            case 922669543:
                if (str.equals("yeelink.light.ceiling1")) {
                    c = '=';
                    break;
                }
                break;
            case 922669544:
                if (str.equals("yeelink.light.ceiling2")) {
                    c = '6';
                    break;
                }
                break;
            case 922669545:
                if (str.equals("yeelink.light.ceiling3")) {
                    c = '7';
                    break;
                }
                break;
            case 922669546:
                if (str.equals("yeelink.light.ceiling4")) {
                    c = '8';
                    break;
                }
                break;
            case 922669547:
                if (str.equals("yeelink.light.ceiling5")) {
                    c = '>';
                    break;
                }
                break;
            case 922669548:
                if (str.equals("yeelink.light.ceiling6")) {
                    c = '?';
                    break;
                }
                break;
            case 922669549:
                if (str.equals("yeelink.light.ceiling7")) {
                    c = '@';
                    break;
                }
                break;
            case 922669550:
                if (str.equals("yeelink.light.ceiling8")) {
                    c = 'A';
                    break;
                }
                break;
            case 922669551:
                if (str.equals("yeelink.light.ceiling9")) {
                    c = 'B';
                    break;
                }
                break;
            case 1201756974:
                if (str.equals("yeelink.light.ct2")) {
                    c = 10;
                    break;
                }
                break;
            case 1201757021:
                if (str.equals("yeelink.light.cta")) {
                    c = 11;
                    break;
                }
                break;
            case 1201766335:
                if (str.equals("yeelink.light.ml1")) {
                    c = 25;
                    break;
                }
                break;
            case 1201766336:
                if (str.equals("yeelink.light.ml2")) {
                    c = 26;
                    break;
                }
                break;
            case 1623724661:
                if (str.equals("yeelink.light.bslamp1")) {
                    c = 'Y';
                    break;
                }
                break;
            case 1623724662:
                if (str.equals("yeelink.light.bslamp2")) {
                    c = 'Z';
                    break;
                }
                break;
            case 1623724663:
                if (str.equals("yeelink.light.bslamp3")) {
                    c = '[';
                    break;
                }
                break;
            case 2102612488:
                if (str.equals("yeelink.light.meshbulb1")) {
                    c = 18;
                    break;
                }
                break;
            case 2102612489:
                if (str.equals("yeelink.light.meshbulb2")) {
                    c = 19;
                    break;
                }
                break;
            case 2146130361:
                if (str.equals("yeelink.light.dnlight2")) {
                    c = 17;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C7650x(str, true, true);
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return new C7621f0(str);
            case 9:
                return new C7611a0(str);
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                return new C7648v(str);
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ' ':
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
                return new C7646t(str, true);
            case '&':
                return new C7647u(str, true);
            case '\'':
                return (dVar == null || dVar.mo23384N() == null || dVar.mo23384N().mo29039b() < 55 || AppConfiguration.Locale.de.toString().equals(C4230l.m11766b().mo23552a())) ? new C7647u(str, true) : new C7646t(str, true);
            case '(':
            case ')':
                return !AppConfiguration.Locale.de.toString().equals(C4230l.m11766b().mo23552a()) ? new C7646t(str, true) : new C7647u(str, true);
            case '*':
            case '+':
            case ',':
            case '-':
                return new C7648v(str, false);
            case '.':
                return new C7617d0(str);
            case '/':
                return new C7615c0(str);
            case '0':
                return new C7648v(str);
            case '1':
            case '2':
            case '3':
                return new C7621f0(str);
            case '4':
                return new C7613b0(str);
            case '5':
                return new C7627i0(str);
            case '6':
                return new C7643q(str);
            case '7':
                return new C7644r(str);
            case '8':
            case '9':
            case ':':
            case ';':
            case '<':
                return new C7645s(str);
            case '=':
            case '>':
            case '?':
            case '@':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
                return new C7642p(str);
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
                return new C7641o(str);
            case 'X':
                return new C7639n(str);
            case 'Y':
            case 'Z':
            case '[':
            case '\\':
                return new C7637m(str, true);
            case ']':
                return new C7631j0(str);
            case '^':
                return new C7635l(str);
            case '_':
            case '`':
                return new C7619e0(str);
            case 'a':
                return new C7649w(str);
            case 'b':
                return new C7634k0(str);
            case 'c':
                return new C7623g0(str);
            case 'd':
                return new C7651y(str);
            case 'e':
            case 'f':
            case 'g':
                return new C7652z(str);
            default:
                return null;
        }
    }

    /* renamed from: i */
    public static boolean m22548i(String str, int i) {
        return (m22542c(str) & i) != 0;
    }
}

package p227x3;

import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.miot.common.config.AppConfiguration;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.models.C6172a;
import com.yeelight.yeelib.device.models.C6173b;
import com.yeelight.yeelib.device.models.C6174c;
import com.yeelight.yeelib.device.models.C6175d;
import com.yeelight.yeelib.device.models.C6176e;
import com.yeelight.yeelib.device.models.C6177f;
import com.yeelight.yeelib.device.models.C6178g;
import com.yeelight.yeelib.device.models.C6179h;
import com.yeelight.yeelib.device.models.C6180i;
import com.yeelight.yeelib.device.models.C6181j;
import com.yeelight.yeelib.device.models.C6182k;
import com.yeelight.yeelib.device.models.C6183l;
import com.yeelight.yeelib.device.models.C6184m;
import com.yeelight.yeelib.device.models.C6185n;
import com.yeelight.yeelib.device.models.C6186o;
import com.yeelight.yeelib.device.models.C6187p;
import com.yeelight.yeelib.device.models.C6188q;
import com.yeelight.yeelib.device.models.C6189r;
import com.yeelight.yeelib.device.models.C6190s;
import com.yeelight.yeelib.device.models.C6191t;
import com.yeelight.yeelib.device.models.C6192u;
import com.yeelight.yeelib.device.models.C6193v;
import com.yeelight.yeelib.device.models.C6194w;
import com.yeelight.yeelib.device.models.ProductModelBase;
import com.yeelight.yeelib.managers.C8281l;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.p194io.FilenameUtils;
import org.apache.commons.p194io.IOUtils;

/* renamed from: x3.i */
public class C11972i {

    /* renamed from: a */
    public static Map<String, C11973a> f21872a;

    /* renamed from: b */
    public static Map<String, C11973a> f21873b;

    /* renamed from: x3.i$a */
    public static class C11973a {

        /* renamed from: a */
        int f21874a = -1;

        /* renamed from: b */
        int f21875b = -1;

        public C11973a(int i, int i2) {
            this.f21874a = i;
            this.f21875b = i2;
        }

        /* renamed from: a */
        public int mo42546a() {
            return this.f21875b;
        }

        /* renamed from: b */
        public int mo42547b() {
            return this.f21874a;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f21872a = hashMap;
        hashMap.put("yeelink.light.mono1", new C11973a(4000, 4000));
        f21872a.put("yeelink.light.mono4", new C11973a(4000, 4000));
        f21872a.put("yeelink.light.mono5", new C11973a(4000, 4000));
        f21872a.put("yeelink.light.monoa", new C11973a(4000, 4000));
        f21872a.put("yeelink.light.monob", new C11973a(4000, 4000));
        f21872a.put("yeelink.light.panel1", new C11973a(4000, 4000));
        f21872a.put("yeelink.light.lamp3", new C11973a(4000, 4000));
        f21872a.put("yeelink.light.lamp5", new C11973a(4000, 4000));
        f21872a.put("yeelink.light.lamp17", new C11973a(4000, 4000));
        f21872a.put("yeelink.light.mono2", new C11973a(4000, 4000));
        f21872a.put("yeelink.light.ble1", new C11973a(1700, 6500));
        f21872a.put("yeelink.light.color1", new C11973a(1700, 6500));
        f21872a.put("yeelink.light.color2", new C11973a(1700, 6500));
        f21872a.put("yeelink.light.color3", new C11973a(1700, 6500));
        f21872a.put("yeelink.light.color4", new C11973a(1700, 6500));
        f21872a.put("yeelink.light.color5", new C11973a(1700, 6500));
        f21872a.put("yeelink.light.color6", new C11973a(1700, 6500));
        f21872a.put("yeelink.light.color8", new C11973a(1700, 6500));
        f21872a.put("yeelink.light.colora", new C11973a(1700, 6500));
        f21872a.put("yeelink.light.colorb", new C11973a(1700, 6500));
        f21872a.put("yeelink.light.colore", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.colorc", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.plate2", new C11973a(4000, 4000));
        f21872a.put("yeelink.light.ct2", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.cta", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ctc", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.strip4", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.panel3", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.lamp1", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.lamp4", new C11973a(2600, 5000));
        f21872a.put("yeelink.light.lamp7", new C11973a(PathInterpolatorCompat.MAX_NUM_POINTS, 5000));
        f21872a.put("yeelink.light.lamp8", new C11973a(PathInterpolatorCompat.MAX_NUM_POINTS, 5000));
        f21872a.put("yeelink.light.lamp9", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.lamp15", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.lamp10", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.lamp2", new C11973a(2500, 4800));
        f21872a.put("yeelink.light.strip1", new C11973a(1700, 6500));
        f21872a.put("yeelink.light.strip2", new C11973a(1700, 6500));
        f21872a.put("yeelink.light.strip6", new C11973a(1700, 6500));
        f21872a.put("yeelink.light.strip8", new C11973a(1700, 6500));
        f21872a.put("yeelink.light.stripa", new C11973a(1700, 6500));
        f21872a.put("yeelink.light.bslamp1", new C11973a(1700, 6500));
        f21872a.put("yeelink.light.bslamp2", new C11973a(1700, 6500));
        f21872a.put("yeelink.light.bslamp3", new C11973a(1700, 6500));
        f21872a.put("yeelink.light.lamp19", new C11973a(1700, 6500));
        f21872a.put("yeelink.light.ceiling1", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceiling2", new C11973a(4000, 4000));
        f21872a.put("yeelink.light.ceiling3", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceiling4", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceiling5", new C11973a(2700, 5700));
        f21872a.put("yeelink.light.ceiling6", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceiling7", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceiling8", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceiling9", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceiling10", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceiling11", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceiling12", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceiling13", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceiling14", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceiling15", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceiling16", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceiling17", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceiling18", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceiling19", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceiling20", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceiling21", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceiling22", new C11973a(2600, 6100));
        f21872a.put("yeelink.light.ceiling23", new C11973a(2600, 6100));
        f21872a.put("yeelink.light.ceiling24", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceil26", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceil27", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceil29", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceil30", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceil31", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceil32", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceil33", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceil35", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceila", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceilb", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceilc", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceild", new C11973a(PathInterpolatorCompat.MAX_NUM_POINTS, 6500));
        f21872a.put("yeelink.light.ceile", new C11973a(2700, 6500));
        f21872a.put("yilai.light.ceiling1", new C11973a(2700, 6500));
        f21872a.put("yilai.light.ceiling2", new C11973a(2700, 6500));
        f21872a.put("yilai.light.ceiling3", new C11973a(2700, 6500));
        f21872a.put("yeelink.bhf_light.v1", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ceiling4.ambi", new C11973a(1700, 6500));
        f21872a.put("yeelink.light.gingko", new C11973a(2700, 2700));
        f21872a.put("yeelink.light.dnlight2", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.meshbulb1", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.meshbulb2", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.spot1", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ml1", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.ml2", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.dn2grp", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.mb1grp", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.mb2grp", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.sp1grp", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.fancl1", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.fancl2", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.fancl5", new C11973a(2700, 6500));
        f21872a.put("yeelink.light.fancl6", new C11973a(2700, 6500));
        HashMap hashMap2 = new HashMap();
        f21873b = hashMap2;
        hashMap2.put("yeelink.light.lamp1", new C11973a(2700, 4000));
        f21873b.put("yeelink.light.lamp4", new C11973a(2600, 4000));
        f21873b.put("yeelink.light.lamp2", new C11973a(2500, 4000));
    }

    /* renamed from: a */
    public static int m30703a(int i, int i2) {
        return i & i2;
    }

    /* renamed from: b */
    public static C11973a m30704b(String str) {
        return f21872a.get(str);
    }

    /* renamed from: c */
    public static int m30705c(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1644531059:
                if (str.equals("yeelink.bhf_light.v1")) {
                    c = 0;
                    break;
                }
                break;
            case -1462015191:
                if (str.equals("yeelink.light.ceiling10")) {
                    c = 1;
                    break;
                }
                break;
            case -1462015190:
                if (str.equals("yeelink.light.ceiling11")) {
                    c = 2;
                    break;
                }
                break;
            case -1462015189:
                if (str.equals("yeelink.light.ceiling12")) {
                    c = 3;
                    break;
                }
                break;
            case -1462015188:
                if (str.equals("yeelink.light.ceiling13")) {
                    c = 4;
                    break;
                }
                break;
            case -1462015187:
                if (str.equals("yeelink.light.ceiling14")) {
                    c = 5;
                    break;
                }
                break;
            case -1462015186:
                if (str.equals("yeelink.light.ceiling15")) {
                    c = 6;
                    break;
                }
                break;
            case -1462015185:
                if (str.equals("yeelink.light.ceiling16")) {
                    c = 7;
                    break;
                }
                break;
            case -1462015184:
                if (str.equals("yeelink.light.ceiling17")) {
                    c = 8;
                    break;
                }
                break;
            case -1462015183:
                if (str.equals("yeelink.light.ceiling18")) {
                    c = 9;
                    break;
                }
                break;
            case -1462015182:
                if (str.equals("yeelink.light.ceiling19")) {
                    c = 10;
                    break;
                }
                break;
            case -1462015160:
                if (str.equals("yeelink.light.ceiling20")) {
                    c = 11;
                    break;
                }
                break;
            case -1462015159:
                if (str.equals("yeelink.light.ceiling21")) {
                    c = 12;
                    break;
                }
                break;
            case -1462015158:
                if (str.equals("yeelink.light.ceiling22")) {
                    c = 13;
                    break;
                }
                break;
            case -1462015157:
                if (str.equals("yeelink.light.ceiling23")) {
                    c = 14;
                    break;
                }
                break;
            case -1462015156:
                if (str.equals("yeelink.light.ceiling24")) {
                    c = 15;
                    break;
                }
                break;
            case -1400275319:
                if (str.equals("yeelink.light.ble1")) {
                    c = 16;
                    break;
                }
                break;
            case -1317475940:
                if (str.equals("yeelink.light.ceil26")) {
                    c = 17;
                    break;
                }
                break;
            case -1317475939:
                if (str.equals("yeelink.light.ceil27")) {
                    c = 18;
                    break;
                }
                break;
            case -1317475937:
                if (str.equals("yeelink.light.ceil29")) {
                    c = 19;
                    break;
                }
                break;
            case -1317475915:
                if (str.equals("yeelink.light.ceil30")) {
                    c = 20;
                    break;
                }
                break;
            case -1317475914:
                if (str.equals("yeelink.light.ceil31")) {
                    c = 21;
                    break;
                }
                break;
            case -1317475913:
                if (str.equals("yeelink.light.ceil32")) {
                    c = 22;
                    break;
                }
                break;
            case -1317475912:
                if (str.equals("yeelink.light.ceil33")) {
                    c = 23;
                    break;
                }
                break;
            case -1317475910:
                if (str.equals("yeelink.light.ceil35")) {
                    c = 24;
                    break;
                }
                break;
            case -1308146495:
                if (str.equals("yeelink.light.color1")) {
                    c = 25;
                    break;
                }
                break;
            case -1308146494:
                if (str.equals("yeelink.light.color2")) {
                    c = 26;
                    break;
                }
                break;
            case -1308146493:
                if (str.equals("yeelink.light.color3")) {
                    c = 27;
                    break;
                }
                break;
            case -1308146492:
                if (str.equals("yeelink.light.color4")) {
                    c = 28;
                    break;
                }
                break;
            case -1308146491:
                if (str.equals("yeelink.light.color5")) {
                    c = 29;
                    break;
                }
                break;
            case -1308146490:
                if (str.equals("yeelink.light.color6")) {
                    c = 30;
                    break;
                }
                break;
            case -1308146488:
                if (str.equals("yeelink.light.color8")) {
                    c = 31;
                    break;
                }
                break;
            case -1308146447:
                if (str.equals("yeelink.light.colora")) {
                    c = ' ';
                    break;
                }
                break;
            case -1308146446:
                if (str.equals("yeelink.light.colorb")) {
                    c = '!';
                    break;
                }
                break;
            case -1308146445:
                if (str.equals("yeelink.light.colorc")) {
                    c = '\"';
                    break;
                }
                break;
            case -1308146443:
                if (str.equals("yeelink.light.colore")) {
                    c = '#';
                    break;
                }
                break;
            case -1282176368:
                if (str.equals("yeelink.light.dn2grp")) {
                    c = '$';
                    break;
                }
                break;
            case -1235140472:
                if (str.equals("yeelink.light.fancl1")) {
                    c = '%';
                    break;
                }
                break;
            case -1235140471:
                if (str.equals("yeelink.light.fancl2")) {
                    c = '&';
                    break;
                }
                break;
            case -1235140468:
                if (str.equals("yeelink.light.fancl5")) {
                    c = '\'';
                    break;
                }
                break;
            case -1235140467:
                if (str.equals("yeelink.light.fancl6")) {
                    c = '(';
                    break;
                }
                break;
            case -1199119278:
                if (str.equals("yeelink.light.gingko")) {
                    c = ')';
                    break;
                }
                break;
            case -1063384694:
                if (str.equals("yeelink.light.lamp10")) {
                    c = '*';
                    break;
                }
                break;
            case -1063384689:
                if (str.equals("yeelink.light.lamp15")) {
                    c = '+';
                    break;
                }
                break;
            case -1063384687:
                if (str.equals("yeelink.light.lamp17")) {
                    c = ',';
                    break;
                }
                break;
            case -1063384685:
                if (str.equals("yeelink.light.lamp19")) {
                    c = '-';
                    break;
                }
                break;
            case -1035626052:
                if (str.equals("yeelink.light.mb1grp")) {
                    c = FilenameUtils.EXTENSION_SEPARATOR;
                    break;
                }
                break;
            case -1035596261:
                if (str.equals("yeelink.light.mb2grp")) {
                    c = IOUtils.DIR_SEPARATOR_UNIX;
                    break;
                }
                break;
            case -948847040:
                if (str.equals("yeelink.light.panel1")) {
                    c = '0';
                    break;
                }
                break;
            case -948847038:
                if (str.equals("yeelink.light.panel3")) {
                    c = '1';
                    break;
                }
                break;
            case -939061393:
                if (str.equals("yeelink.light.plate2")) {
                    c = '2';
                    break;
                }
                break;
            case -888668266:
                if (str.equals("yilai.light.ceiling1")) {
                    c = '3';
                    break;
                }
                break;
            case -888668265:
                if (str.equals("yilai.light.ceiling2")) {
                    c = '4';
                    break;
                }
                break;
            case -888668264:
                if (str.equals("yilai.light.ceiling3")) {
                    c = '5';
                    break;
                }
                break;
            case -850921852:
                if (str.equals("yeelink.light.sp1grp")) {
                    c = '6';
                    break;
                }
                break;
            case -845289556:
                if (str.equals("yeelink.light.strip1")) {
                    c = '7';
                    break;
                }
                break;
            case -845289555:
                if (str.equals("yeelink.light.strip2")) {
                    c = '8';
                    break;
                }
                break;
            case -845289553:
                if (str.equals("yeelink.light.strip4")) {
                    c = '9';
                    break;
                }
                break;
            case -845289551:
                if (str.equals("yeelink.light.strip6")) {
                    c = ':';
                    break;
                }
                break;
            case -845289549:
                if (str.equals("yeelink.light.strip8")) {
                    c = ';';
                    break;
                }
                break;
            case -845289508:
                if (str.equals("yeelink.light.stripa")) {
                    c = '<';
                    break;
                }
                break;
            case -458141175:
                if (str.equals("yeelink.light.ceila")) {
                    c = '=';
                    break;
                }
                break;
            case -458141174:
                if (str.equals("yeelink.light.ceilb")) {
                    c = '>';
                    break;
                }
                break;
            case -458141173:
                if (str.equals("yeelink.light.ceilc")) {
                    c = '?';
                    break;
                }
                break;
            case -458141172:
                if (str.equals("yeelink.light.ceild")) {
                    c = '@';
                    break;
                }
                break;
            case -458141171:
                if (str.equals("yeelink.light.ceile")) {
                    c = 'A';
                    break;
                }
                break;
            case -449944730:
                if (str.equals("yeelink.light.lamp1")) {
                    c = 'B';
                    break;
                }
                break;
            case -449944729:
                if (str.equals("yeelink.light.lamp2")) {
                    c = 'C';
                    break;
                }
                break;
            case -449944728:
                if (str.equals("yeelink.light.lamp3")) {
                    c = 'D';
                    break;
                }
                break;
            case -449944727:
                if (str.equals("yeelink.light.lamp4")) {
                    c = 'E';
                    break;
                }
                break;
            case -449944726:
                if (str.equals("yeelink.light.lamp5")) {
                    c = 'F';
                    break;
                }
                break;
            case -449944724:
                if (str.equals("yeelink.light.lamp7")) {
                    c = 'G';
                    break;
                }
                break;
            case -449944723:
                if (str.equals("yeelink.light.lamp8")) {
                    c = 'H';
                    break;
                }
                break;
            case -449944722:
                if (str.equals("yeelink.light.lamp9")) {
                    c = 'I';
                    break;
                }
                break;
            case -448603205:
                if (str.equals("yeelink.light.mono1")) {
                    c = 'J';
                    break;
                }
                break;
            case -448603204:
                if (str.equals("yeelink.light.mono2")) {
                    c = 'K';
                    break;
                }
                break;
            case -448603202:
                if (str.equals("yeelink.light.mono4")) {
                    c = 'L';
                    break;
                }
                break;
            case -448603201:
                if (str.equals("yeelink.light.mono5")) {
                    c = 'M';
                    break;
                }
                break;
            case -448603157:
                if (str.equals("yeelink.light.monoa")) {
                    c = 'N';
                    break;
                }
                break;
            case -448603156:
                if (str.equals("yeelink.light.monob")) {
                    c = 'O';
                    break;
                }
                break;
            case -443031172:
                if (str.equals("yeelink.light.spot1")) {
                    c = 'P';
                    break;
                }
                break;
            case 922669543:
                if (str.equals("yeelink.light.ceiling1")) {
                    c = 'Q';
                    break;
                }
                break;
            case 922669544:
                if (str.equals("yeelink.light.ceiling2")) {
                    c = 'R';
                    break;
                }
                break;
            case 922669545:
                if (str.equals("yeelink.light.ceiling3")) {
                    c = 'S';
                    break;
                }
                break;
            case 922669546:
                if (str.equals("yeelink.light.ceiling4")) {
                    c = 'T';
                    break;
                }
                break;
            case 922669547:
                if (str.equals("yeelink.light.ceiling5")) {
                    c = 'U';
                    break;
                }
                break;
            case 922669548:
                if (str.equals("yeelink.light.ceiling6")) {
                    c = 'V';
                    break;
                }
                break;
            case 922669549:
                if (str.equals("yeelink.light.ceiling7")) {
                    c = 'W';
                    break;
                }
                break;
            case 922669550:
                if (str.equals("yeelink.light.ceiling8")) {
                    c = 'X';
                    break;
                }
                break;
            case 922669551:
                if (str.equals("yeelink.light.ceiling9")) {
                    c = 'Y';
                    break;
                }
                break;
            case 1201756974:
                if (str.equals("yeelink.light.ct2")) {
                    c = 'Z';
                    break;
                }
                break;
            case 1201757021:
                if (str.equals("yeelink.light.cta")) {
                    c = '[';
                    break;
                }
                break;
            case 1201757023:
                if (str.equals("yeelink.light.ctc")) {
                    c = IOUtils.DIR_SEPARATOR_WINDOWS;
                    break;
                }
                break;
            case 1201766335:
                if (str.equals("yeelink.light.ml1")) {
                    c = ']';
                    break;
                }
                break;
            case 1201766336:
                if (str.equals("yeelink.light.ml2")) {
                    c = '^';
                    break;
                }
                break;
            case 1623724661:
                if (str.equals("yeelink.light.bslamp1")) {
                    c = '_';
                    break;
                }
                break;
            case 1623724662:
                if (str.equals("yeelink.light.bslamp2")) {
                    c = '`';
                    break;
                }
                break;
            case 1623724663:
                if (str.equals("yeelink.light.bslamp3")) {
                    c = 'a';
                    break;
                }
                break;
            case 2102612488:
                if (str.equals("yeelink.light.meshbulb1")) {
                    c = 'b';
                    break;
                }
                break;
            case 2102612489:
                if (str.equals("yeelink.light.meshbulb2")) {
                    c = 'c';
                    break;
                }
                break;
            case 2146130361:
                if (str.equals("yeelink.light.dnlight2")) {
                    c = 'd';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 327;
            case 1:
            case '+':
                return 391;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 13:
            case 14:
            case 17:
            case 18:
            case 19:
            case 22:
            case 23:
            case 24:
            case '=':
            case '@':
            case 'A':
            case 'I':
            case 'Q':
                return 327;
            case 7:
            case 8:
            case 15:
            case 20:
            case 21:
                return 263;
            case 10:
            case 11:
            case '>':
            case '?':
            case 'T':
                return 455;
            case 16:
                return 287;
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
            case '*':
                return 319;
            case 30:
                return 827;
            case '$':
            case '%':
            case '.':
            case '/':
            case '6':
            case 'P':
            case ']':
            case '^':
            case 'b':
            case 'c':
            case 'd':
                return 7;
            case '&':
            case '\'':
            case '(':
                return 71;
            case ')':
                return 3;
            case ',':
            case 'D':
            case 'F':
                return 259;
            case '-':
            case '_':
            case '`':
            case 'a':
                return 319;
            case '0':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
                return 259;
            case '1':
            case '3':
            case '4':
            case '5':
            case '9':
            case 'Z':
            case '[':
            case '\\':
                return 263;
            case '2':
                return 11;
            case '7':
            case '8':
            case ':':
            case ';':
            case '<':
                return 319;
            case 'B':
            case 'C':
            case 'E':
            case 'G':
            case 'H':
                return 263;
            case 'R':
                return 323;
            case 'S':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
                return 327;
            default:
                return 1;
        }
    }

    /* renamed from: d */
    public static String m30706d(int i) {
        switch (i) {
            case 3:
                return "yeelink.light.gingko";
            case 7:
                return "yeelink.light.meshbulb1";
            case 11:
                return "yeelink.light.plate2";
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
                AppUtils.m8300u("ProductModelFactory", "Invalid model type!");
                return "";
        }
    }

    /* renamed from: e */
    public static ProductModelBase m30707e(int i) {
        switch (i) {
            case 1:
                return new C6193v("yeelink.light.group");
            case 7:
                return new C6183l("yeelink.light.group");
            case 71:
                return new C6186o("yeelink.light.group");
            case 259:
                return new C6190s("yeelink.light.group");
            case 263:
                return new C6183l("yeelink.light.group", true);
            case 287:
                return new C6184m("yeelink.light.group", true, true);
            case 315:
                return new C6182k("yeelink.light.group", true);
            case 319:
                return new C6181j("yeelink.light.group", true);
            case 323:
                return new C6177f("yeelink.light.group");
            case 327:
                return new C6176e("yeelink.light.group");
            case 391:
                return new C6174c("yeelink.light.group");
            case 455:
                return new C6180i("yeelink.light.group");
            default:
                return new C6190s("yeelink.light.group");
        }
    }

    /* renamed from: f */
    public static C11973a m30708f(String str) {
        return f21873b.get(str);
    }

    /* renamed from: g */
    public static ProductModelBase m30709g(String str) {
        return m30710h(str, (C3010c) null);
    }

    /* renamed from: h */
    public static ProductModelBase m30710h(String str, C3010c cVar) {
        if (str == null || str.length() == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid model string: ");
            sb.append(str);
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1644531059:
                if (str.equals("yeelink.bhf_light.v1")) {
                    c = 0;
                    break;
                }
                break;
            case -1494338802:
                if (str.equals("yeelink.switch.sw1")) {
                    c = 1;
                    break;
                }
                break;
            case -1462015191:
                if (str.equals("yeelink.light.ceiling10")) {
                    c = 2;
                    break;
                }
                break;
            case -1462015190:
                if (str.equals("yeelink.light.ceiling11")) {
                    c = 3;
                    break;
                }
                break;
            case -1462015189:
                if (str.equals("yeelink.light.ceiling12")) {
                    c = 4;
                    break;
                }
                break;
            case -1462015188:
                if (str.equals("yeelink.light.ceiling13")) {
                    c = 5;
                    break;
                }
                break;
            case -1462015187:
                if (str.equals("yeelink.light.ceiling14")) {
                    c = 6;
                    break;
                }
                break;
            case -1462015186:
                if (str.equals("yeelink.light.ceiling15")) {
                    c = 7;
                    break;
                }
                break;
            case -1462015185:
                if (str.equals("yeelink.light.ceiling16")) {
                    c = 8;
                    break;
                }
                break;
            case -1462015184:
                if (str.equals("yeelink.light.ceiling17")) {
                    c = 9;
                    break;
                }
                break;
            case -1462015183:
                if (str.equals("yeelink.light.ceiling18")) {
                    c = 10;
                    break;
                }
                break;
            case -1462015182:
                if (str.equals("yeelink.light.ceiling19")) {
                    c = 11;
                    break;
                }
                break;
            case -1462015160:
                if (str.equals("yeelink.light.ceiling20")) {
                    c = 12;
                    break;
                }
                break;
            case -1462015159:
                if (str.equals("yeelink.light.ceiling21")) {
                    c = 13;
                    break;
                }
                break;
            case -1462015158:
                if (str.equals("yeelink.light.ceiling22")) {
                    c = 14;
                    break;
                }
                break;
            case -1462015157:
                if (str.equals("yeelink.light.ceiling23")) {
                    c = 15;
                    break;
                }
                break;
            case -1462015156:
                if (str.equals("yeelink.light.ceiling24")) {
                    c = 16;
                    break;
                }
                break;
            case -1400275319:
                if (str.equals("yeelink.light.ble1")) {
                    c = 17;
                    break;
                }
                break;
            case -1399953856:
                if (str.equals("yeelink.light.mesh")) {
                    c = 18;
                    break;
                }
                break;
            case -1350780909:
                if (str.equals("yeelink.plug.plug")) {
                    c = 19;
                    break;
                }
                break;
            case -1317475940:
                if (str.equals("yeelink.light.ceil26")) {
                    c = 20;
                    break;
                }
                break;
            case -1317475939:
                if (str.equals("yeelink.light.ceil27")) {
                    c = 21;
                    break;
                }
                break;
            case -1317475937:
                if (str.equals("yeelink.light.ceil29")) {
                    c = 22;
                    break;
                }
                break;
            case -1317475915:
                if (str.equals("yeelink.light.ceil30")) {
                    c = 23;
                    break;
                }
                break;
            case -1317475914:
                if (str.equals("yeelink.light.ceil31")) {
                    c = 24;
                    break;
                }
                break;
            case -1317475913:
                if (str.equals("yeelink.light.ceil32")) {
                    c = 25;
                    break;
                }
                break;
            case -1317475912:
                if (str.equals("yeelink.light.ceil33")) {
                    c = 26;
                    break;
                }
                break;
            case -1317475910:
                if (str.equals("yeelink.light.ceil35")) {
                    c = 27;
                    break;
                }
                break;
            case -1308146495:
                if (str.equals("yeelink.light.color1")) {
                    c = 28;
                    break;
                }
                break;
            case -1308146494:
                if (str.equals("yeelink.light.color2")) {
                    c = 29;
                    break;
                }
                break;
            case -1308146493:
                if (str.equals("yeelink.light.color3")) {
                    c = 30;
                    break;
                }
                break;
            case -1308146492:
                if (str.equals("yeelink.light.color4")) {
                    c = 31;
                    break;
                }
                break;
            case -1308146491:
                if (str.equals("yeelink.light.color5")) {
                    c = ' ';
                    break;
                }
                break;
            case -1308146490:
                if (str.equals("yeelink.light.color6")) {
                    c = '!';
                    break;
                }
                break;
            case -1308146488:
                if (str.equals("yeelink.light.color8")) {
                    c = '\"';
                    break;
                }
                break;
            case -1308146447:
                if (str.equals("yeelink.light.colora")) {
                    c = '#';
                    break;
                }
                break;
            case -1308146446:
                if (str.equals("yeelink.light.colorb")) {
                    c = '$';
                    break;
                }
                break;
            case -1308146445:
                if (str.equals("yeelink.light.colorc")) {
                    c = '%';
                    break;
                }
                break;
            case -1308146443:
                if (str.equals("yeelink.light.colore")) {
                    c = '&';
                    break;
                }
                break;
            case -1282176368:
                if (str.equals("yeelink.light.dn2grp")) {
                    c = '\'';
                    break;
                }
                break;
            case -1235140472:
                if (str.equals("yeelink.light.fancl1")) {
                    c = '(';
                    break;
                }
                break;
            case -1235140471:
                if (str.equals("yeelink.light.fancl2")) {
                    c = ')';
                    break;
                }
                break;
            case -1235140468:
                if (str.equals("yeelink.light.fancl5")) {
                    c = '*';
                    break;
                }
                break;
            case -1235140467:
                if (str.equals("yeelink.light.fancl6")) {
                    c = '+';
                    break;
                }
                break;
            case -1199119278:
                if (str.equals("yeelink.light.gingko")) {
                    c = ',';
                    break;
                }
                break;
            case -1119332198:
                if (str.equals("yeelink.wifispeaker.v1")) {
                    c = '-';
                    break;
                }
                break;
            case -1063384694:
                if (str.equals("yeelink.light.lamp10")) {
                    c = FilenameUtils.EXTENSION_SEPARATOR;
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
                    c = '0';
                    break;
                }
                break;
            case -1063384685:
                if (str.equals("yeelink.light.lamp19")) {
                    c = '1';
                    break;
                }
                break;
            case -1035626052:
                if (str.equals("yeelink.light.mb1grp")) {
                    c = '2';
                    break;
                }
                break;
            case -1035596261:
                if (str.equals("yeelink.light.mb2grp")) {
                    c = '3';
                    break;
                }
                break;
            case -948847040:
                if (str.equals("yeelink.light.panel1")) {
                    c = '4';
                    break;
                }
                break;
            case -948847038:
                if (str.equals("yeelink.light.panel3")) {
                    c = '5';
                    break;
                }
                break;
            case -939061393:
                if (str.equals("yeelink.light.plate2")) {
                    c = '6';
                    break;
                }
                break;
            case -888668266:
                if (str.equals("yilai.light.ceiling1")) {
                    c = '7';
                    break;
                }
                break;
            case -888668265:
                if (str.equals("yilai.light.ceiling2")) {
                    c = '8';
                    break;
                }
                break;
            case -888668264:
                if (str.equals("yilai.light.ceiling3")) {
                    c = '9';
                    break;
                }
                break;
            case -850921852:
                if (str.equals("yeelink.light.sp1grp")) {
                    c = ':';
                    break;
                }
                break;
            case -845289556:
                if (str.equals("yeelink.light.strip1")) {
                    c = ';';
                    break;
                }
                break;
            case -845289555:
                if (str.equals("yeelink.light.strip2")) {
                    c = '<';
                    break;
                }
                break;
            case -845289553:
                if (str.equals("yeelink.light.strip4")) {
                    c = '=';
                    break;
                }
                break;
            case -845289551:
                if (str.equals("yeelink.light.strip6")) {
                    c = '>';
                    break;
                }
                break;
            case -845289549:
                if (str.equals("yeelink.light.strip8")) {
                    c = '?';
                    break;
                }
                break;
            case -845289508:
                if (str.equals("yeelink.light.stripa")) {
                    c = '@';
                    break;
                }
                break;
            case -458141175:
                if (str.equals("yeelink.light.ceila")) {
                    c = 'A';
                    break;
                }
                break;
            case -458141174:
                if (str.equals("yeelink.light.ceilb")) {
                    c = 'B';
                    break;
                }
                break;
            case -458141173:
                if (str.equals("yeelink.light.ceilc")) {
                    c = 'C';
                    break;
                }
                break;
            case -458141172:
                if (str.equals("yeelink.light.ceild")) {
                    c = 'D';
                    break;
                }
                break;
            case -458141171:
                if (str.equals("yeelink.light.ceile")) {
                    c = 'E';
                    break;
                }
                break;
            case -454053748:
                if (str.equals("yeelink.light.group")) {
                    c = 'F';
                    break;
                }
                break;
            case -449944730:
                if (str.equals("yeelink.light.lamp1")) {
                    c = 'G';
                    break;
                }
                break;
            case -449944729:
                if (str.equals("yeelink.light.lamp2")) {
                    c = 'H';
                    break;
                }
                break;
            case -449944728:
                if (str.equals("yeelink.light.lamp3")) {
                    c = 'I';
                    break;
                }
                break;
            case -449944727:
                if (str.equals("yeelink.light.lamp4")) {
                    c = 'J';
                    break;
                }
                break;
            case -449944726:
                if (str.equals("yeelink.light.lamp5")) {
                    c = 'K';
                    break;
                }
                break;
            case -449944724:
                if (str.equals("yeelink.light.lamp7")) {
                    c = 'L';
                    break;
                }
                break;
            case -449944723:
                if (str.equals("yeelink.light.lamp8")) {
                    c = 'M';
                    break;
                }
                break;
            case -449944722:
                if (str.equals("yeelink.light.lamp9")) {
                    c = 'N';
                    break;
                }
                break;
            case -448603205:
                if (str.equals("yeelink.light.mono1")) {
                    c = 'O';
                    break;
                }
                break;
            case -448603204:
                if (str.equals("yeelink.light.mono2")) {
                    c = 'P';
                    break;
                }
                break;
            case -448603202:
                if (str.equals("yeelink.light.mono4")) {
                    c = 'Q';
                    break;
                }
                break;
            case -448603201:
                if (str.equals("yeelink.light.mono5")) {
                    c = 'R';
                    break;
                }
                break;
            case -448603157:
                if (str.equals("yeelink.light.monoa")) {
                    c = 'S';
                    break;
                }
                break;
            case -448603156:
                if (str.equals("yeelink.light.monob")) {
                    c = 'T';
                    break;
                }
                break;
            case -443031172:
                if (str.equals("yeelink.light.spot1")) {
                    c = 'U';
                    break;
                }
                break;
            case -190173984:
                if (str.equals("yeelink.gateway.v1")) {
                    c = 'V';
                    break;
                }
                break;
            case -190173936:
                if (str.equals("yeelink.gateway.va")) {
                    c = 'W';
                    break;
                }
                break;
            case 152160739:
                if (str.equals("yeelink.bleremote.v1")) {
                    c = 'X';
                    break;
                }
                break;
            case 674030242:
                if (str.equals("yeelink.curtain.ctmt1")) {
                    c = 'Y';
                    break;
                }
                break;
            case 922669543:
                if (str.equals("yeelink.light.ceiling1")) {
                    c = 'Z';
                    break;
                }
                break;
            case 922669544:
                if (str.equals("yeelink.light.ceiling2")) {
                    c = '[';
                    break;
                }
                break;
            case 922669545:
                if (str.equals("yeelink.light.ceiling3")) {
                    c = IOUtils.DIR_SEPARATOR_WINDOWS;
                    break;
                }
                break;
            case 922669546:
                if (str.equals("yeelink.light.ceiling4")) {
                    c = ']';
                    break;
                }
                break;
            case 922669547:
                if (str.equals("yeelink.light.ceiling5")) {
                    c = '^';
                    break;
                }
                break;
            case 922669548:
                if (str.equals("yeelink.light.ceiling6")) {
                    c = '_';
                    break;
                }
                break;
            case 922669549:
                if (str.equals("yeelink.light.ceiling7")) {
                    c = '`';
                    break;
                }
                break;
            case 922669550:
                if (str.equals("yeelink.light.ceiling8")) {
                    c = 'a';
                    break;
                }
                break;
            case 922669551:
                if (str.equals("yeelink.light.ceiling9")) {
                    c = 'b';
                    break;
                }
                break;
            case 1201756974:
                if (str.equals("yeelink.light.ct2")) {
                    c = 'c';
                    break;
                }
                break;
            case 1201757021:
                if (str.equals("yeelink.light.cta")) {
                    c = 'd';
                    break;
                }
                break;
            case 1201757023:
                if (str.equals("yeelink.light.ctc")) {
                    c = 'e';
                    break;
                }
                break;
            case 1201766335:
                if (str.equals("yeelink.light.ml1")) {
                    c = 'f';
                    break;
                }
                break;
            case 1201766336:
                if (str.equals("yeelink.light.ml2")) {
                    c = 'g';
                    break;
                }
                break;
            case 1623724661:
                if (str.equals("yeelink.light.bslamp1")) {
                    c = 'h';
                    break;
                }
                break;
            case 1623724662:
                if (str.equals("yeelink.light.bslamp2")) {
                    c = 'i';
                    break;
                }
                break;
            case 1623724663:
                if (str.equals("yeelink.light.bslamp3")) {
                    c = 'j';
                    break;
                }
                break;
            case 2102612488:
                if (str.equals("yeelink.light.meshbulb1")) {
                    c = 'k';
                    break;
                }
                break;
            case 2102612489:
                if (str.equals("yeelink.light.meshbulb2")) {
                    c = 'l';
                    break;
                }
                break;
            case 2146130361:
                if (str.equals("yeelink.light.dnlight2")) {
                    c = 'm';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C6172a(str);
            case 1:
                return new C11978n(str);
            case 2:
                return new C6174c(str);
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 13:
            case 14:
            case 15:
            case 20:
            case 21:
            case 22:
            case 25:
            case 26:
            case 'A':
            case 'D':
            case 'Z':
            case '^':
            case '_':
            case '`':
            case 'a':
            case 'b':
                return new C6176e(str);
            case 8:
            case 9:
            case 16:
            case 23:
            case 24:
                return new C6175d(str);
            case 11:
            case 12:
            case 'B':
            case 'C':
            case ']':
                return new C6180i(str);
            case 17:
                return new C6184m(str, true, true);
            case 18:
            case '4':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
                return new C6190s(str);
            case 19:
                return new C6192u(str);
            case 27:
            case 'E':
                return new C6178g(str);
            case 28:
            case 29:
            case 30:
            case 31:
            case ' ':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '.':
            case ';':
                return new C6181j(str, true);
            case '!':
                return new C6182k(str, true);
            case '\'':
            case '2':
            case '3':
            case '5':
            case '7':
            case '8':
            case '9':
            case ':':
            case '=':
            case 'U':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'k':
            case 'l':
            case 'm':
                return new C6183l(str);
            case '(':
                return new C6185n(str);
            case ')':
            case '*':
            case '+':
                return new C6186o(str);
            case ',':
                return new C6187p(str);
            case '-':
                return new C6194w(str);
            case '/':
                return new C6188q(str);
            case '0':
            case 'I':
            case 'K':
                return new C6190s(str);
            case '1':
            case 'h':
            case 'i':
            case 'j':
                return new C6173b(str, true);
            case '6':
                return new C6191t(str, true);
            case '<':
                return (cVar == null || cVar.mo23197N() == null || cVar.mo23197N().mo42510b() < 55 || AppConfiguration.Locale.de.toString().equals(C8281l.m19542b().mo35223a())) ? new C6182k(str, true) : new C6181j(str, true);
            case '>':
            case '?':
            case '@':
                return !AppConfiguration.Locale.de.toString().equals(C8281l.m19542b().mo35223a()) ? new C6181j(str, true) : new C6182k(str, true);
            case 'F':
                return new C11975k(str);
            case 'G':
            case 'J':
            case 'L':
            case 'M':
                return new C6183l(str, false);
            case 'H':
                return new C6183l(str);
            case 'N':
                return new C6189r(str);
            case 'V':
            case 'W':
                return new C11976l(str);
            case 'X':
                return new C11977m(str);
            case 'Y':
                return new C11974j(str);
            case '[':
                return new C6177f(str);
            case '\\':
                return new C6179h(str);
            default:
                return null;
        }
    }

    /* renamed from: i */
    public static boolean m30711i(String str, int i) {
        return (m30705c(str) & i) != 0;
    }
}

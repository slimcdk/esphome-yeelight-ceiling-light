package p051j4;

import android.graphics.Color;
import org.apache.commons.p194io.FilenameUtils;
import org.apache.commons.p194io.IOUtils;

/* renamed from: j4.d */
public class C9188d {
    /* renamed from: a */
    public static float m22130a(int i) {
        if (i < 1) {
            i = 1;
        }
        if (i > 100) {
            i = 100;
        }
        return (((float) i) * 0.0025f) + 0.7f;
    }

    /* renamed from: b */
    public static int m22131b(int i, int i2) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = m22130a(i2);
        return Color.HSVToColor(fArr);
    }

    /* renamed from: c */
    public static int m22132c(int i, int i2, String str) {
        return Color.HSVToColor(new float[]{41.0f, m22137h(i, str), m22130a(i2)});
    }

    /* renamed from: d */
    public static float m22133d(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1400275319:
                if (str.equals("yeelink.light.ble1")) {
                    c = 0;
                    break;
                }
                break;
            case -1308146495:
                if (str.equals("yeelink.light.color1")) {
                    c = 1;
                    break;
                }
                break;
            case -1308146494:
                if (str.equals("yeelink.light.color2")) {
                    c = 2;
                    break;
                }
                break;
            case -1308146493:
                if (str.equals("yeelink.light.color3")) {
                    c = 3;
                    break;
                }
                break;
            case -1308146492:
                if (str.equals("yeelink.light.color4")) {
                    c = 4;
                    break;
                }
                break;
            case -1308146491:
                if (str.equals("yeelink.light.color5")) {
                    c = 5;
                    break;
                }
                break;
            case -1308146490:
                if (str.equals("yeelink.light.color6")) {
                    c = 6;
                    break;
                }
                break;
            case -1308146488:
                if (str.equals("yeelink.light.color8")) {
                    c = 7;
                    break;
                }
                break;
            case -1308146447:
                if (str.equals("yeelink.light.colora")) {
                    c = 8;
                    break;
                }
                break;
            case -1308146446:
                if (str.equals("yeelink.light.colorb")) {
                    c = 9;
                    break;
                }
                break;
            case -1308146445:
                if (str.equals("yeelink.light.colorc")) {
                    c = 10;
                    break;
                }
                break;
            case -1308146443:
                if (str.equals("yeelink.light.colore")) {
                    c = 11;
                    break;
                }
                break;
            case -1063384694:
                if (str.equals("yeelink.light.lamp10")) {
                    c = 12;
                    break;
                }
                break;
            case -939061393:
                if (str.equals("yeelink.light.plate2")) {
                    c = 13;
                    break;
                }
                break;
            case -449944730:
                if (str.equals("yeelink.light.lamp1")) {
                    c = 14;
                    break;
                }
                break;
            case -449944727:
                if (str.equals("yeelink.light.lamp4")) {
                    c = 15;
                    break;
                }
                break;
            case -449944724:
                if (str.equals("yeelink.light.lamp7")) {
                    c = 16;
                    break;
                }
                break;
            case -449944723:
                if (str.equals("yeelink.light.lamp8")) {
                    c = 17;
                    break;
                }
                break;
            case -449944722:
                if (str.equals("yeelink.light.lamp9")) {
                    c = 18;
                    break;
                }
                break;
        }
        switch (c) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return 0.875f;
            default:
                return 1.0f;
        }
    }

    /* renamed from: e */
    public static int m22134e(String str) {
        str.hashCode();
        return 6500;
    }

    /* renamed from: f */
    public static float m22135f(String str) {
        str.hashCode();
        return 0.4f;
    }

    /* renamed from: g */
    public static int m22136g(String str) {
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
            case -1235140472:
                if (str.equals("yeelink.light.fancl1")) {
                    c = '$';
                    break;
                }
                break;
            case -1235140471:
                if (str.equals("yeelink.light.fancl2")) {
                    c = '%';
                    break;
                }
                break;
            case -1235140468:
                if (str.equals("yeelink.light.fancl5")) {
                    c = '&';
                    break;
                }
                break;
            case -1235140467:
                if (str.equals("yeelink.light.fancl6")) {
                    c = '\'';
                    break;
                }
                break;
            case -1063384694:
                if (str.equals("yeelink.light.lamp10")) {
                    c = '(';
                    break;
                }
                break;
            case -1063384689:
                if (str.equals("yeelink.light.lamp15")) {
                    c = ')';
                    break;
                }
                break;
            case -939061393:
                if (str.equals("yeelink.light.plate2")) {
                    c = '*';
                    break;
                }
                break;
            case -888668266:
                if (str.equals("yilai.light.ceiling1")) {
                    c = '+';
                    break;
                }
                break;
            case -888668265:
                if (str.equals("yilai.light.ceiling2")) {
                    c = ',';
                    break;
                }
                break;
            case -888668264:
                if (str.equals("yilai.light.ceiling3")) {
                    c = '-';
                    break;
                }
                break;
            case -458141175:
                if (str.equals("yeelink.light.ceila")) {
                    c = FilenameUtils.EXTENSION_SEPARATOR;
                    break;
                }
                break;
            case -458141174:
                if (str.equals("yeelink.light.ceilb")) {
                    c = IOUtils.DIR_SEPARATOR_UNIX;
                    break;
                }
                break;
            case -458141173:
                if (str.equals("yeelink.light.ceilc")) {
                    c = '0';
                    break;
                }
                break;
            case -458141172:
                if (str.equals("yeelink.light.ceild")) {
                    c = '1';
                    break;
                }
                break;
            case -458141171:
                if (str.equals("yeelink.light.ceile")) {
                    c = '2';
                    break;
                }
                break;
            case -449944730:
                if (str.equals("yeelink.light.lamp1")) {
                    c = '3';
                    break;
                }
                break;
            case -449944727:
                if (str.equals("yeelink.light.lamp4")) {
                    c = '4';
                    break;
                }
                break;
            case -449944724:
                if (str.equals("yeelink.light.lamp7")) {
                    c = '5';
                    break;
                }
                break;
            case -449944723:
                if (str.equals("yeelink.light.lamp8")) {
                    c = '6';
                    break;
                }
                break;
            case -449944722:
                if (str.equals("yeelink.light.lamp9")) {
                    c = '7';
                    break;
                }
                break;
            case 922669543:
                if (str.equals("yeelink.light.ceiling1")) {
                    c = '8';
                    break;
                }
                break;
            case 922669545:
                if (str.equals("yeelink.light.ceiling3")) {
                    c = '9';
                    break;
                }
                break;
            case 922669546:
                if (str.equals("yeelink.light.ceiling4")) {
                    c = ':';
                    break;
                }
                break;
            case 922669547:
                if (str.equals("yeelink.light.ceiling5")) {
                    c = ';';
                    break;
                }
                break;
            case 922669548:
                if (str.equals("yeelink.light.ceiling6")) {
                    c = '<';
                    break;
                }
                break;
            case 922669549:
                if (str.equals("yeelink.light.ceiling7")) {
                    c = '=';
                    break;
                }
                break;
            case 922669550:
                if (str.equals("yeelink.light.ceiling8")) {
                    c = '>';
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
            case ')':
            case '+':
            case ',':
            case '-':
            case '.':
            case '/':
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case ':':
            case ';':
            case '<':
            case '=':
            case '>':
                return 2700;
            default:
                return 1700;
        }
    }

    /* renamed from: h */
    public static float m22137h(int i, String str) {
        float d = m22133d(str);
        float f = m22135f(str);
        int g = m22136g(str);
        int e = m22134e(str);
        if (i < g) {
            i = g;
        }
        if (i > e) {
            i = e;
        }
        return f + (((float) (e - i)) * ((d - f) / ((float) (e - g))));
    }
}
